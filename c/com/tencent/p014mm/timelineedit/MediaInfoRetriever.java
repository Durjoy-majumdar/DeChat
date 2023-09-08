package com.tencent.p014mm.timelineedit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import sp3.C110803f;
import sp3.C110806j;

/* renamed from: com.tencent.mm.timelineedit.MediaInfoRetriever */
public class MediaInfoRetriever {
    public static int[] getImageInfo(String str) {
        new BitmapFactory.Options().inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return new int[]{0, 0};
        }
        return new int[]{decodeFile.getWidth(), decodeFile.getHeight()};
    }

    public static int[] getVideoOrAudioInfo(String str) {
        C110806j d = C110803f.f331490g.mo162374d(str);
        if (d == null) {
            return new int[]{0, 0, 0};
        }
        return new int[]{d.f331499d, d.f331496a, d.f331497b};
    }
}
