package com.bignerdranch.android.criminalintent;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by noah on 8/12/17.
 */

public class PictureUtils {
    public static Bitmap getScalaledBitmap(String path, int destWidth, int destHeight) {
        // Read in pciture size
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        // Find scale factor
        int inSampleSize = 1;
        if (srcHeight > destHeight || srcWidth > destWidth) {
            float heightScale = srcHeight / destHeight;
            float widthScale = srcWidth / destWidth;

            inSampleSize = Math.round(heightScale > widthScale ? heightScale : widthScale);
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        // Read in and create bitmap
        return BitmapFactory.decodeFile(path, options);
    }
}
