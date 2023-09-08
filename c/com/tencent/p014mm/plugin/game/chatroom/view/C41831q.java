package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.q */
public class C41831q extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ C41835s f112747n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41831q(C41835s sVar, Context context) {
        super(context);
        this.f112747n = sVar;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return ((LinearLayoutManager) this.f112747n.f112761e.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: d */
    public void mo17383d() {
    }

    /* renamed from: e */
    public void mo17384e() {
        super.mo17384e();
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 80.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: m */
    public int mo10340m(int i) {
        return super.mo10340m(i);
    }

    /* renamed from: n */
    public int mo65616n() {
        return -1;
    }
}
