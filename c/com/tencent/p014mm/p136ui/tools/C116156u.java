package com.tencent.p014mm.p136ui.tools;

/* renamed from: com.tencent.mm.ui.tools.u */
public class C116156u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348608d;

    public C116156u(CropImageNewUI cropImageNewUI) {
        this.f348608d = cropImageNewUI;
    }

    public void run() {
        CropImageNewUI cropImageNewUI = this.f348608d;
        CropImageNewUI.m163403I7(cropImageNewUI, cropImageNewUI.f348466f.getCropImageIV(), this.f348608d.f348466f.getCropAreaView());
        this.f348608d.finish();
    }
}
