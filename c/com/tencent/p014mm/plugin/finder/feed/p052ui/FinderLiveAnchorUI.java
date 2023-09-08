package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import com.tencent.p014mm.plugin.finder.live.view.C56090m1;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;
import xk1.C15715a2;
import xk1.C15717b2;
import xk1.C15718c2;
import xk1.C15743j1;
import xk1.C15775s1;
import xk1.C15794y1;
import xk1.C15798z1;
import xk1.C66297d2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI */
public final class FinderLiveAnchorUI extends MMFinderUI {

    /* renamed from: o */
    public final String f158949o = "MicroMsg.FinderLiveAnchorUI";

    /* renamed from: p */
    public boolean f158950p;

    /* renamed from: q */
    public C56061i f158951q;

    /* renamed from: r */
    public KeyboardHeightProvider f158952r;

    /* renamed from: s */
    public C56090m1 f158953s;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI$a */
    public static final class C55818a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorUI f158954d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI$a$a */
        public static final class C55819a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveAnchorUI f158955d;

            public C55819a(FinderLiveAnchorUI finderLiveAnchorUI) {
                this.f158955d = finderLiveAnchorUI;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                String str = this.f158955d.f158949o;
                Log.m105924i(str, "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
                FinderLiveAnchorUI finderLiveAnchorUI = this.f158955d;
                boolean z2 = i > 0;
                if (finderLiveAnchorUI.f158950p != z2) {
                    finderLiveAnchorUI.f158950p = z2;
                    C56061i iVar = finderLiveAnchorUI.f158951q;
                    if (iVar != null) {
                        iVar.keyboardChange(z2, i);
                    }
                }
            }
        }

        public C55818a(FinderLiveAnchorUI finderLiveAnchorUI) {
            this.f158954d = finderLiveAnchorUI;
        }

        public final void run() {
            FinderLiveAnchorUI finderLiveAnchorUI = this.f158954d;
            if (finderLiveAnchorUI.f158952r == null) {
                AppCompatActivity context = finderLiveAnchorUI.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                finderLiveAnchorUI.f158952r = new KeyboardHeightProvider(context);
                FinderLiveAnchorUI finderLiveAnchorUI2 = this.f158954d;
                KeyboardHeightProvider keyboardHeightProvider = finderLiveAnchorUI2.f158952r;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C55819a(finderLiveAnchorUI2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f158954d.f158952r;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajo;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66297d2.class, C15715a2.class, C15798z1.class, C15717b2.class, C15775s1.class, C15794y1.class, C15743j1.class, C15718c2.class);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C56061i iVar = this.f158951q;
        boolean z = false;
        if (iVar != null && !iVar.onBackPress()) {
            z = true;
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0082, code lost:
        r15 = ((cl1.C55001u) r15.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 1
            r14.supportRequestWindowFeature(r0)
            super.onCreate(r15)
            r15 = 8
            r14.setSelfNavigationBarVisible(r15)
            android.view.Window r15 = r14.getWindow()
            r1 = 2097280(0x200080, float:2.938915E-39)
            r15.addFlags(r1)
            android.view.Window r15 = r14.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r15.addFlags(r1)
            android.view.Window r15 = r14.getWindow()
            r15.clearFlags(r1)
            android.view.Window r15 = r14.getWindow()
            android.view.View r15 = r15.getDecorView()
            r1 = 1792(0x700, float:2.511E-42)
            r15.setSystemUiVisibility(r1)
            android.view.Window r15 = r14.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r15.addFlags(r1)
            android.view.Window r15 = r14.getWindow()
            r1 = 0
            r15.setStatusBarColor(r1)
            android.view.Window r15 = r14.getWindow()
            r15.setNavigationBarColor(r1)
            android.view.Window r15 = r14.getWindow()
            r2 = -3
            r15.setFormat(r2)
            android.view.Window r15 = r14.getWindow()
            r2 = 51
            r15.setSoftInputMode(r2)
            cj1.b1$a r15 = cj1.C54738b1.f153409B
            android.content.Intent r2 = r14.getIntent()
            cj1.b1 r5 = r15.mo560b(r2)
            com.tencent.mm.plugin.finder.live.view.i r15 = new com.tencent.mm.plugin.finder.live.view.i
            r2 = 0
            r15.<init>(r14, r2, r2)
            r14.f158951q = r15
            r15 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r15 = r14.findViewById(r15)
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            com.tencent.mm.plugin.finder.live.view.i r3 = r14.f158951q
            r15.addView(r3)
            fj1.b$a r15 = fj1.C45795b.f123697j
            fj1.b r15 = fj1.C45795b.f123698n
            if (r15 == 0) goto L_0x0095
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r15 = r15.mo71262a(r3)
            cl1.u r15 = (cl1.C55001u) r15
            te3.c21 r15 = r15.f154420q
            if (r15 == 0) goto L_0x0095
            long r3 = r15.f182392d
            java.lang.Long r15 = java.lang.Long.valueOf(r3)
            goto L_0x0096
        L_0x0095:
            r15 = r2
        L_0x0096:
            if (r5 == 0) goto L_0x00d0
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r3 = r5.f153423l
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x00d0
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r3 = r5.f153423l
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.mm.live.api.LiveConfig r3 = (com.tencent.p014mm.live.api.LiveConfig) r3
            if (r3 == 0) goto L_0x00b2
            long r3 = r3.f157064e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00b3
        L_0x00b2:
            r3 = r2
        L_0x00b3:
            boolean r3 = gy3.C87412m.m108589b(r3, r15)
            if (r3 != 0) goto L_0x00d0
            al1.h r15 = new al1.h
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r3 = r5.f153423l
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.mm.live.api.LiveConfig r3 = (com.tencent.p014mm.live.api.LiveConfig) r3
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = ""
            com.tencent.mm.live.api.LiveConfig r3 = com.tencent.p014mm.live.api.LiveConfig.m62801a(r3, r1)
        L_0x00cb:
            r15.<init>((com.tencent.p014mm.live.api.LiveConfig) r3)
            r4 = r15
            goto L_0x00fe
        L_0x00d0:
            r3 = 0
            if (r15 != 0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            long r6 = r15.longValue()
            int r15 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x00f5
        L_0x00dd:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r15.getClass()
            al1.i r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r15 == 0) goto L_0x00f2
            java.util.ArrayList<al1.h> r15 = r15.f151990e
            if (r15 == 0) goto L_0x00f2
            java.lang.Object r15 = sx3.C110818d0.m150916N(r15)
            al1.h r15 = (al1.C54127h) r15
            r4 = r15
            goto L_0x00f3
        L_0x00f2:
            r4 = r2
        L_0x00f3:
            r15 = 1
            goto L_0x00ff
        L_0x00f5:
            java.lang.String r15 = r14.f158949o
            java.lang.String r3 = "unkonwn data source! break onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r3)
            r4 = r2
        L_0x00fe:
            r15 = 0
        L_0x00ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "onCreate isFromFloat:"
            r3.append(r6)
            r3.append(r15)
            java.lang.String r6 = ", finderLiveData:"
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = r14.f158949o
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            qt1.b r6 = qt1.C63329b.f179694a
            java.lang.String r7 = r14.f158949o
            r6.mo88233d(r7, r3)
            if (r4 != 0) goto L_0x0132
            java.lang.String r15 = r14.f158949o
            java.lang.String r0 = "unkonwn data source! finish!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
            r14.finish()
            return
        L_0x0132:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            al1.i r3 = new al1.i
            r3.<init>()
            al1.h[] r7 = new al1.C54127h[r0]
            r7[r1] = r4
            java.util.ArrayList r7 = sx3.C64197v.m75534c(r7)
            r3.mo74929g(r7)
            r6.mo77615R(r3)
            android.content.Intent r3 = r14.getIntent()
            java.lang.String r7 = "KEY_PARAMS_NOTICE"
            byte[] r3 = r3.getByteArrayExtra(r7)
            if (r3 == 0) goto L_0x015d
            te3.d51 r7 = new te3.d51
            r7.<init>()
            r4.f151980g = r7
            r7.parseFrom(r3)
        L_0x015d:
            fj1.b r3 = r6.mo77622Y(r4)
            if (r3 != 0) goto L_0x0168
            fj1.b r3 = new fj1.b
            r3.<init>(r2, r0, r2)
        L_0x0168:
            r7 = r3
            com.tencent.mm.plugin.finder.live.view.i r0 = r14.f158951q
            if (r0 == 0) goto L_0x0170
            r0.bindData(r4)
        L_0x0170:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r8 = r4.f151979f
            com.tencent.mm.plugin.finder.live.view.i r9 = r14.f158951q
            gy3.C87412m.m108591d(r9)
            r10 = 0
            r11 = 0
            r12 = 24
            r13 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63770d(r6, r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.finder.live.view.i r0 = r14.f158951q
            if (r0 == 0) goto L_0x0186
            r0.activate(r4, r15, r1)
        L_0x0186:
            com.tencent.mm.plugin.finder.live.view.i r15 = r14.f158951q
            if (r15 == 0) goto L_0x018d
            r15.mount()
        L_0x018d:
            te3.d51 r15 = new te3.d51
            r15.<init>()
            r4.f151980g = r15
            com.tencent.mm.plugin.finder.live.view.m1 r15 = new com.tencent.mm.plugin.finder.live.view.m1
            uv0.i r0 = new uv0.i
            r0.<init>(r14)
            r15.<init>(r0)
            r14.f158953s = r15
            r0 = 21
            java.lang.String r1 = "LiveFloatBall"
            r15.mo35648A(r0, r1)
            java.lang.Class<ak1.o> r15 = ak1.C54108o.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            java.lang.String r0 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r15, r0)
            r3 = r15
            ak1.o r3 = (ak1.C54108o) r3
            ak1.f0 r15 = ak1.C54108o.f151869h
            r6 = 0
            r7 = 0
            r3.Fx0(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.unMount();
        }
        C56090m1 m1Var = this.f158953s;
        if (m1Var != null) {
            m1Var.mo67996A0();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f158952r;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.pause();
        }
    }

    public void onResume() {
        super.onResume();
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.resume();
        }
        C56061i iVar2 = this.f158951q;
        if (iVar2 != null) {
            iVar2.post(new C55818a(this));
        }
    }

    public void onStart() {
        super.onStart();
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.start();
        }
        C56090m1 m1Var = this.f158953s;
        if (m1Var != null) {
            m1Var.mo78184B0();
        }
        C103928o.m138641a(true, false, true);
        Log.m105924i(this.f158949o, "onStart hideFloatBall");
    }

    public void onStop() {
        super.onStop();
        C56061i iVar = this.f158951q;
        if (iVar != null) {
            iVar.stop();
        }
        C56090m1 m1Var = this.f158953s;
        if (m1Var != null) {
            m1Var.mo64001C();
        }
        C103928o.m138642b();
        Log.m105924i(this.f158949o, "onStop resumeFloatBall");
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
