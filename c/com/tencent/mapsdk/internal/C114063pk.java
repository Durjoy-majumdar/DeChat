package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C113701eo;
import com.tencent.mapsdk.internal.C114065pl;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;

/* renamed from: com.tencent.mapsdk.internal.pk */
public final class C114063pk extends C113699em {

    /* renamed from: a */
    public TextView f341299a;

    /* renamed from: b */
    public C114065pl.C114066a f341300b;

    /* renamed from: c */
    private Context f341301c;

    public C114063pk(Context context, TencentMapContext tencentMapContext) {
        this.f341301c = context;
        this.f341299a = new C104559mn(this.f341301c, tencentMapContext);
    }

    /* renamed from: e */
    private Bitmap m158812e() {
        this.f341299a.setTextSize(18.0f);
        this.f341299a.setTextColor(-16777216);
        this.f341299a.setText("鉴权失败,请检查你的key");
        return C104548ha.m139943a((View) this.f341299a);
    }

    /* renamed from: a */
    public final void mo171998a(C113701eo.C113703b bVar) {
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
    }

    /* renamed from: b */
    public final View[] mo171997b() {
        return new View[0];
    }

    /* renamed from: c */
    public final void mo172000c() {
    }

    /* renamed from: d */
    public final C113701eo.C113703b mo172001d() {
        return null;
    }

    /* renamed from: a */
    public final boolean mo171999a(final ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null || this.f341299a == null) {
            return false;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f341299a.setLayoutParams(layoutParams);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        this.f341299a.setTextSize(18.0f);
        this.f341299a.setTextColor(-16777216);
        this.f341299a.setText("鉴权失败,请检查你的key");
        Bitmap a = C104548ha.m139943a((View) this.f341299a);
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                viewGroup.addView(C114063pk.this.f341299a);
            }
        });
        C114065pl.C114066a aVar = this.f341300b;
        if (aVar == null) {
            return true;
        }
        aVar.mo171682a(a, measuredWidth, measuredHeight);
        return true;
    }

    /* renamed from: a */
    private void m158811a(C114065pl.C114066a aVar) {
        this.f341300b = aVar;
    }
}
