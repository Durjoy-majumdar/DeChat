package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.x */
public class C85111x extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ C18472y f247991n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85111x(C18472y yVar, Context context) {
        super(context);
        this.f247991n = yVar;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return ((LinearLayoutManager) this.f247991n.f51274e.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: d */
    public void mo17383d() {
        C18472y yVar = this.f247991n;
        if (yVar.f51284r) {
            yVar.getClass();
        }
    }

    /* renamed from: e */
    public void mo17384e() {
        super.mo17384e();
        Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo SmoothScrollerForFling onStop %d", Integer.valueOf(this.f247991n.f51274e.getScrollState()));
        if (this.f247991n.f51274e.getScrollState() == 0) {
            this.f247991n.mo23083d();
        }
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 40.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: n */
    public int mo65616n() {
        return -1;
    }
}
