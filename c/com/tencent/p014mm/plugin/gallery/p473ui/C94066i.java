package com.tencent.p014mm.plugin.gallery.p473ui;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import com.tencent.p014mm.sdk.platformtools.Log;
import d20.C20382b;
import pr3.C35626b;

/* renamed from: com.tencent.mm.plugin.gallery.ui.i */
public class C94066i implements C20382b {

    /* renamed from: a */
    public final /* synthetic */ C94061h.C94065d f271600a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f271601b;

    /* renamed from: c */
    public final /* synthetic */ String f271602c;

    /* renamed from: d */
    public final /* synthetic */ int f271603d;

    /* renamed from: e */
    public final /* synthetic */ C94061h f271604e;

    public C94066i(C94061h hVar, C94061h.C94065d dVar, Bitmap bitmap, String str, int i) {
        this.f271604e = hVar;
        this.f271600a = dVar;
        this.f271601b = bitmap;
        this.f271602c = str;
        this.f271603d = i;
    }

    public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
        Log.m105918d("MicroMsg.ImageAdapter", "pennqin, wxImageView, on image load err.");
        C35626b.m40780a(imageDecodeResult.errCode);
        if (imageDecodeResult.errCode == 4) {
            this.f271604e.mo129066n(this.f271600a, this.f271601b);
            if (!this.f271604e.f271579n.contains(this.f271602c)) {
                this.f271604e.f271579n.add(this.f271602c);
                C94061h.C94065d dVar = this.f271600a;
                dVar.f271595b.setTag(dVar);
                this.f271604e.f271588w.mo140042b(this.f271600a.f271595b, this.f271602c, this.f271603d);
            }
        }
    }

    public void onImageLoaded(Bitmap bitmap) {
        Log.m105918d("MicroMsg.ImageAdapter", "pennqin, wxImageView, on image loaded.");
    }

    public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
        Log.m105918d("MicroMsg.ImageAdapter", "pennqin, wxImageView, on preview load err.");
    }

    public void onPreviewLoaded() {
        Log.m105918d("MicroMsg.ImageAdapter", "pennqin, wxImageView, on preview loaded.");
    }

    public void onPreviewReleased() {
    }

    public void onReady() {
    }

    public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
        Log.m105918d("MicroMsg.ImageAdapter", "pennqin, wxImageView, on tile load err.");
    }
}
