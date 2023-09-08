package com.tencent.p014mm.plugin.music.p080ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import gy3.C8479f0;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.music.ui.f */
public final class C4912f implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ FloatBallMusicView f20036d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f20037e;

    public C4912f(FloatBallMusicView floatBallMusicView, C8479f0<String> f0Var) {
        this.f20036d = floatBallMusicView;
        this.f20037e = f0Var;
    }

    /* renamed from: b */
    public void mo1907b() {
        FloatBallMusicView floatBallMusicView = this.f20036d;
        int i = FloatBallMusicView.f20016o;
        floatBallMusicView.mo5825a();
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return (String) this.f20037e.f27484d;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            mo1907b();
            return;
        }
        RelativeLayout relativeLayout = this.f20036d.f20019f;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(C0966R.C0969drawable.ayq);
        }
        ImageView imageView = this.f20036d.f20018e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f20036d.f20018e;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }
}
