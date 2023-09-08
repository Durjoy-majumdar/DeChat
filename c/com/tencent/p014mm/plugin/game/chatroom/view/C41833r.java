package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.r */
public class C41833r extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ C41835s f112753n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41833r(C41835s sVar, Context context) {
        super(context);
        this.f112753n = sVar;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return ((LinearLayoutManager) this.f112753n.f112761e.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: d */
    public void mo17383d() {
        C41835s sVar = this.f112753n;
        if (sVar.f112770q) {
            sVar.getClass();
        }
    }

    /* renamed from: e */
    public void mo17384e() {
        super.mo17384e();
        Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo SmoothScrollerForFling onStop %d", Integer.valueOf(this.f112753n.f112761e.getScrollState()));
        if (this.f112753n.f112761e.getScrollState() == 0) {
            this.f112753n.mo65621c();
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
