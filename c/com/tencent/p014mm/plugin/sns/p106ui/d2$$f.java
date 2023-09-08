package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$f */
public class d2$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95754d2 f279339d;

    public d2$$f(C95754d2 d2Var) {
        this.f279339d = d2Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.PicWidget$4");
        long currentTimeMillis = System.currentTimeMillis();
        C95754d2 d2Var = this.f279339d;
        ArrayList<String> d = d2Var.f279310c.mo133209d();
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        d2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        for (String next : d) {
            Exif fromFile = Exif.fromFile(next);
            int i = (fromFile.latitude < 0.0d || fromFile.longitude < 0.0d) ? 0 : 1;
            String str = fromFile.model;
            int i2 = fromFile.imageWidth;
            int i3 = fromFile.imageHeight;
            if (i2 <= 0 || i3 <= 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapUtil.decodeFile(next, options);
                int i4 = options.outWidth;
                i3 = options.outHeight;
                i2 = i4;
            }
            C115669n.INSTANCE.mo160131h(15523, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) fromFile.getUxtimeDatatimeOriginal()));
        }
        SnsMethodCalculate.markEndTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        Log.m105918d("MicroMsg.PicWidget", "report photo info cost " + (System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.PicWidget$4");
    }
}
