package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.FinderVideoCtrlEvent;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import dg1.C58263a;
import di3.C86312j;
import gr1.C59657f1;
import gy3.C87412m;
import kotlin.Metadata;
import nc3.C34767b;
import p182kk.C61104a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/video/FinderVideoCore$onInitialize$3", "Ldg1/a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$3 */
public final class FinderVideoCore$onInitialize$3 implements C58263a {

    /* renamed from: d */
    public boolean f161839d;

    /* renamed from: e */
    public final /* synthetic */ FinderVideoCore f161840e;

    /* renamed from: f */
    public final /* synthetic */ AppCompatActivity f161841f;

    public FinderVideoCore$onInitialize$3(FinderVideoCore finderVideoCore, AppCompatActivity appCompatActivity) {
        this.f161840e = finderVideoCore;
        this.f161841f = appCompatActivity;
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        AppForegroundDelegate.INSTANCE.mo174215k(this.f161840e);
        this.f161840e.mo79537y1().mo83074c3();
        IListener<FinderVideoCtrlEvent> iListener = this.f161840e.f161831q;
        if (iListener != null) {
            iListener.dead();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause(androidx.lifecycle.C0125s r4) {
        /*
            r3 = this;
            java.lang.String r0 = "var1"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r4 = r3.f161840e
            androidx.appcompat.app.AppCompatActivity r0 = r3.f161841f
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
            r4.getClass()
            com.tencent.mm.plugin.finder.view.k5$a r4 = com.tencent.p014mm.plugin.finder.view.C30031k5.f81274F
            boolean r4 = r4.mo57083a(r0)
            r1 = 1
            r2 = 0
            if (r4 != 0) goto L_0x0049
            com.tencent.mm.plugin.finder.view.w0$a r4 = com.tencent.p014mm.plugin.finder.view.C56660w0.f162410d
            boolean r4 = r4.mo57084a(r0)
            if (r4 != 0) goto L_0x0049
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "isHalfScreenLandingPageShowing:"
            r4.append(r0)
            boolean r0 = vo2.C65833d.f189315b
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "AdHalfScreenLandingPageState"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            boolean r4 = vo2.C65833d.f189315b
            if (r4 != 0) goto L_0x0049
            pf1.d0 r4 = pf1.C62262d0.f176978a
            r4.getClass()
            boolean r4 = pf1.C62262d0.f176980c
            if (r4 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = 0
            goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = "FinderVideoCore"
            java.lang.String r0 = "onPause return for isBlockOnPauseAction true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r3.f161839d = r1
            return
        L_0x0056:
            r3.f161839d = r2
            com.tencent.mm.plugin.finder.video.FinderVideoCore r4 = r3.f161840e
            rs1.lb r4 = r4.mo79538z1()
            androidx.appcompat.app.AppCompatActivity r0 = r3.f161841f
            r4.mo80068N(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r4 = r3.f161840e
            dm1.c r4 = r4.mo79537y1()
            r4.mo83077f3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoCore$onInitialize$3.onPause(androidx.lifecycle.s):void");
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        FinderVideoCore finderVideoCore = this.f161840e;
        finderVideoCore.getClass();
        finderVideoCore.f161835u = C61104a.m71656l((Context) null, false) || FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo90541w();
        FinderVideoCore finderVideoCore2 = this.f161840e;
        Class cls = C34767b.class;
        C34767b.C34768c cVar = finderVideoCore2.f161832r;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(cls)).b20(cVar);
        }
        finderVideoCore2.f161832r = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34772e.f93455c, new C59657f1(finderVideoCore2));
        FinderVideoCore finderVideoCore3 = this.f161840e;
        finderVideoCore3.f161834t = true;
        this.f161839d = false;
        finderVideoCore3.mo79538z1().mo80076f1(this.f161841f);
        this.f161840e.mo79537y1().mo83078g3();
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        if (this.f161839d) {
            Log.m105924i("FinderVideoCore", "onStop hasBlockPauseAction true, pause focus video again");
            this.f161840e.mo79538z1().mo80068N(this.f161841f);
            this.f161840e.mo79537y1().mo83077f3();
        }
        C34767b.C34768c cVar = this.f161840e.f161832r;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
    }
}
