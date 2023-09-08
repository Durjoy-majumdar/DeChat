package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.aa.ui.e */
public class C92894e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTouchImageView f267586d;

    /* renamed from: e */
    public final /* synthetic */ AAImagPreviewUI f267587e;

    public C92894e(AAImagPreviewUI aAImagPreviewUI, MultiTouchImageView multiTouchImageView) {
        this.f267587e = aAImagPreviewUI;
        this.f267586d = multiTouchImageView;
    }

    public void run() {
        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(this.f267587e.f267563g, this.f267586d.getWidth(), this.f267586d.getHeight());
        int orientationInDegree = Exif.fromFile(this.f267587e.f267563g).getOrientationInDegree();
        Bitmap rotate = BitmapUtil.rotate(decodeFileWithSample, (float) orientationInDegree);
        Log.m105925i("MicroMsg.PreviewHdHeadImg", "exifPath : %s degree : %d", this.f267587e.f267563g, Integer.valueOf(orientationInDegree));
        this.f267587e.mo127272I7(this.f267586d, rotate);
    }
}
