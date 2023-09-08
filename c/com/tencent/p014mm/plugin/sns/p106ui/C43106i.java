package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.io.ByteArrayOutputStream;

/* renamed from: com.tencent.mm.plugin.sns.ui.i */
public class C43106i {
    /* renamed from: a */
    public static byte[] m46718a(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("coverPngtoJpeg", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Bitmap copy = decodeByteArray.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copy);
        canvas.drawColor(-1);
        canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        SnsMethodCalculate.markEndTimeMs("coverPngtoJpeg", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
        return byteArray;
    }
}
