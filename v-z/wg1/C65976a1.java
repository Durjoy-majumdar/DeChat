package wg1;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import aw0.C103928o;
import cj1.C54738b1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import com.tencent.p014mm.plugin.finder.live.view.C56090m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fj1.C45795b;
import fl1.C59161f;
import fl1.C59187f2;
import gy3.C87412m;
import o40.C61926c;
import ok1.C62042e;
import p447aw.C103918d;
import p671qy.C63344h;
import rx3.C13604l;
import te3.C49098d51;
import te3.C51333t21;
import vk1.C65760a;

/* renamed from: wg1.a1 */
public class C65976a1 extends UIComponent {

    /* renamed from: d */
    public final String f189693d = "MicroMsg.FinderLiveAnchorWithoutAffinityUI";

    /* renamed from: e */
    public boolean f189694e;

    /* renamed from: f */
    public C56032b f189695f;

    /* renamed from: g */
    public KeyboardHeightProvider f189696g;

    /* renamed from: h */
    public C56090m1 f189697h;

    /* renamed from: i */
    public boolean f189698i;

    /* renamed from: j */
    public boolean f189699j;

    /* renamed from: n */
    public long f189700n = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0);

    /* renamed from: o */
    public Runnable f189701o;

    /* renamed from: p */
    public boolean f189702p;

    /* renamed from: wg1.a1$a */
    public static final class C65977a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65976a1 f189703d;

        public C65977a(C65976a1 a1Var) {
            this.f189703d = a1Var;
        }

        public final void run() {
            C65976a1 a1Var = this.f189703d;
            if (!a1Var.f189702p) {
                a1Var.mo90014g3();
                a1Var.f189702p = true;
            }
        }
    }

    /* renamed from: wg1.a1$b */
    public static final class C65978b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65976a1 f189704d;

        /* renamed from: wg1.a1$b$a */
        public static final class C65979a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C65976a1 f189705d;

            public C65979a(C65976a1 a1Var) {
                this.f189705d = a1Var;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                String str = this.f189705d.f189693d;
                Log.m105924i(str, "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
                C65976a1 a1Var = this.f189705d;
                boolean z2 = i > 0;
                if (a1Var.f189694e != z2) {
                    a1Var.f189694e = z2;
                    C56032b bVar = a1Var.f189695f;
                    if (bVar != null) {
                        bVar.keyboardChange(z2, i);
                    }
                }
            }
        }

        public C65978b(C65976a1 a1Var) {
            this.f189704d = a1Var;
        }

        public final void run() {
            C65976a1 a1Var = this.f189704d;
            if (a1Var.f189696g == null) {
                Activity context = a1Var.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                a1Var.f189696g = new KeyboardHeightProvider(context);
                C65976a1 a1Var2 = this.f189704d;
                KeyboardHeightProvider keyboardHeightProvider = a1Var2.f189696g;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C65979a(a1Var2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f189704d.f189696g;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65976a1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public C56032b mo90010c3() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new C56061i((MMActivity) activity, getFragment(), (AttributeSet) null);
    }

    /* renamed from: d3 */
    public void mo90011d3() {
        if (getActivity() instanceof MMActivity) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
    }

    /* renamed from: e3 */
    public final void mo90012e3() {
        C56090m1.f159950s = toString();
        C56090m1 m1Var = this.f189697h;
        if (m1Var != null) {
            m1Var.mo78184B0();
        }
        C103928o.m138641a(true, false, true);
        Log.m105924i(this.f189693d, "tryHideFloatBallWhenEnterPage hideFloatBall");
    }

    /* renamed from: f3 */
    public void mo90013f3() {
        Class cls = C54991o.class;
        if (Util.isEqual(C56090m1.f159950s, toString())) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            boolean z = true;
            if (bVar != null && ((C54991o) bVar.mo71262a(cls)).f154350p0) {
                finderLiveService.getClass();
                C45795b bVar2 = FinderLiveService.f159348A;
                if (bVar2 != null && ((C54991o) bVar2.mo71262a(cls)).mo75999e4()) {
                    finderLiveService.getClass();
                    C45795b bVar3 = FinderLiveService.f159348A;
                    if (bVar3 == null || ((C54991o) bVar3.mo71262a(cls)).mo75997d4()) {
                        z = false;
                    }
                    if (z) {
                        C56090m1 m1Var = this.f189697h;
                        if (m1Var != null) {
                            m1Var.mo64001C();
                        }
                        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(getContext(), 21)) {
                            C103928o.m138642b();
                        }
                        Log.m105924i(this.f189693d, "tryShowFloatBallWhenExitPage resumeFloatBall");
                    }
                }
            }
        }
    }

    /* renamed from: g3 */
    public final void mo90014g3() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]uninitBusiness " + this);
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.unMount();
        }
        ((C63344h) C86312j.m106911c(C63344h.class)).destroy();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajo;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onBackPressed " + this);
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            return bVar.onBackPress();
        }
        return false;
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        if (this.f189698i) {
            mo90014g3();
        } else {
            this.f189701o = new C65977a(this);
        }
        this.f189699j = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String str = this.f189693d;
        Log.m105924i(str, "onConfigurationChanged newConfig:" + configuration);
        C62042e.f176370a.getClass();
        if (C62042e.f176374e && C85875k4.m106210y()) {
            C56032b bVar = this.f189695f;
            Boolean bool = null;
            C56061i iVar = bVar instanceof C56061i ? (C56061i) bVar : null;
            if (iVar != null) {
                C59161f liveStartUIC = iVar.getLiveStartUIC();
                liveStartUIC.getClass();
                C65760a aVar = liveStartUIC.f166837f;
                if (aVar != null) {
                    bool = Boolean.valueOf(C56032b.notifySEIMicUserChange$default(aVar, liveStartUIC.f169227g1, true, (C13604l) null, 4, (Object) null));
                }
                if (C87412m.m108589b(bool, Boolean.TRUE)) {
                    C61926c.m72668M(new C59187f2(liveStartUIC, configuration));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0035, code lost:
        r4 = ((cl1.C55001u) r4.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03df A[SYNTHETIC, Splitter:B:156:0x03df] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice> r2 = com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.String r0 = r1.f189693d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[LiveLifecycler]onCreate "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            super.onCreate(r27)
            r26.mo90011d3()
            cj1.b1$a r0 = cj1.C54738b1.f153409B
            android.content.Intent r4 = r26.getIntent()
            cj1.b1 r7 = r0.mo560b(r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            fj1.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r4 == 0) goto L_0x0048
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r4.mo71262a(r6)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            if (r4 == 0) goto L_0x0048
            long r8 = r4.f182392d
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            fj1.b r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            r8 = 0
            if (r6 == 0) goto L_0x0057
            androidx.lifecycle.i0 r6 = r6.mo71262a(r3)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154301c3
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            fj1.b r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            r10 = 1
            if (r9 != 0) goto L_0x006d
            android.content.Intent r9 = r26.getIntent()
            r11 = -1
            java.lang.String r12 = "KEY_PARAMS_SOURCE_TYPE"
            int r9 = r9.getIntExtra(r12, r11)
            r11 = 5
            if (r9 != r11) goto L_0x006d
            r9 = 1
            goto L_0x006e
        L_0x006d:
            r9 = 0
        L_0x006e:
            java.lang.String r11 = ""
            r12 = 0
            if (r7 == 0) goto L_0x00aa
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r14 = r7.f153423l
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r10
            if (r14 == 0) goto L_0x00aa
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r14 = r7.f153423l
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            com.tencent.mm.live.api.LiveConfig r14 = (com.tencent.p014mm.live.api.LiveConfig) r14
            if (r14 == 0) goto L_0x008e
            long r14 = r14.f157064e
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x008f
        L_0x008e:
            r14 = 0
        L_0x008f:
            boolean r14 = gy3.C87412m.m108589b(r14, r4)
            if (r14 != 0) goto L_0x00aa
            al1.h r4 = new al1.h
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r14 = r7.f153423l
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            com.tencent.mm.live.api.LiveConfig r14 = (com.tencent.p014mm.live.api.LiveConfig) r14
            if (r14 != 0) goto L_0x00a5
            com.tencent.mm.live.api.LiveConfig r14 = com.tencent.p014mm.live.api.LiveConfig.m62801a(r11, r8)
        L_0x00a5:
            r4.<init>((com.tencent.p014mm.live.api.LiveConfig) r14)
            goto L_0x0131
        L_0x00aa:
            if (r4 != 0) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            long r14 = r4.longValue()
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0128
        L_0x00b5:
            al1.i r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r4 == 0) goto L_0x00c8
            java.util.ArrayList<al1.h> r4 = r4.f151990e
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            al1.h r4 = (al1.C54127h) r4
            if (r4 == 0) goto L_0x00c8
            com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
            goto L_0x00c9
        L_0x00c8:
            r4 = 0
        L_0x00c9:
            if (r4 != 0) goto L_0x00cc
            goto L_0x00e1
        L_0x00cc:
            if (r7 == 0) goto L_0x00de
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r14 = r7.f153423l
            if (r14 == 0) goto L_0x00de
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            com.tencent.mm.live.api.LiveConfig r14 = (com.tencent.p014mm.live.api.LiveConfig) r14
            if (r14 == 0) goto L_0x00de
            java.lang.String r14 = r14.f157047E
            if (r14 != 0) goto L_0x00df
        L_0x00de:
            r14 = r11
        L_0x00df:
            r4.f157047E = r14
        L_0x00e1:
            if (r6 == 0) goto L_0x0116
            al1.h r4 = new al1.h
            com.tencent.mm.live.api.LiveConfig r14 = com.tencent.p014mm.live.api.LiveConfig.m62801a(r11, r8)
            r4.<init>((com.tencent.p014mm.live.api.LiveConfig) r14)
            fj1.b r14 = r4.f151978e
            androidx.lifecycle.i0 r14 = r14.mo71262a(r3)
            cl1.o r14 = (cl1.C54991o) r14
            java.lang.Class<cl1.h1> r15 = cl1.C54979h1.class
            androidx.lifecycle.i0 r14 = r14.business(r15)
            cl1.h1 r14 = (cl1.C54979h1) r14
            r14.mo75943j3(r8)
            al1.i r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r14 == 0) goto L_0x0126
            java.util.ArrayList<al1.h> r14 = r14.f151990e
            if (r14 == 0) goto L_0x0126
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            al1.h r14 = (al1.C54127h) r14
            if (r14 == 0) goto L_0x0126
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r14 = r14.f151979f
            if (r14 == 0) goto L_0x0126
            r4.f151979f = r14
            goto L_0x0126
        L_0x0116:
            al1.i r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r4 == 0) goto L_0x0125
            java.util.ArrayList<al1.h> r4 = r4.f151990e
            if (r4 == 0) goto L_0x0125
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            al1.h r4 = (al1.C54127h) r4
            goto L_0x0126
        L_0x0125:
            r4 = 0
        L_0x0126:
            r14 = 1
            goto L_0x0132
        L_0x0128:
            java.lang.String r4 = r1.f189693d
            java.lang.String r14 = "unkonwn data source! break onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r14)
            r4 = 0
        L_0x0131:
            r14 = 0
        L_0x0132:
            java.lang.String r15 = r1.f189693d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "onCreate isFromFloat:"
            r5.append(r12)
            r5.append(r14)
            java.lang.String r12 = ", externalPost:"
            r5.append(r12)
            r5.append(r6)
            java.lang.String r12 = ", finderLiveData:"
            r5.append(r12)
            r5.append(r4)
            java.lang.String r12 = ", configProvider:"
            r5.append(r12)
            r5.append(r7)
            java.lang.String r12 = ", FinderLiveService.liveData:"
            r5.append(r12)
            al1.i r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            r5.append(r12)
            java.lang.String r12 = ", FinderLiveService.liveData?.liveDataList:"
            r5.append(r12)
            al1.i r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r12 == 0) goto L_0x016f
            java.util.ArrayList<al1.h> r12 = r12.f151990e
            goto L_0x0170
        L_0x016f:
            r12 = 0
        L_0x0170:
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
            if (r4 != 0) goto L_0x018c
            java.lang.String r0 = r1.f189693d
            java.lang.String r2 = "unkonwn data source! finish!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            android.app.Activity r0 = r26.getContext()
            r0.finish()
            return
        L_0x018c:
            com.tencent.mm.plugin.finder.live.view.b r5 = r26.mo90010c3()
            r1.f189695f = r5
            android.app.Activity r5 = r26.getContext()
            r12 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r5 = r5.findViewById(r12)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            com.tencent.mm.plugin.finder.live.view.b r12 = r1.f189695f
            r5.addView(r12)
            al1.i r5 = new al1.i
            r5.<init>()
            al1.h[] r12 = new al1.C54127h[r10]
            r12[r8] = r4
            java.util.ArrayList r12 = sx3.C64197v.m75534c(r12)
            r5.mo74929g(r12)
            r0.mo77615R(r5)
            android.content.Intent r5 = r26.getIntent()
            java.lang.String r12 = "KEY_PARAMS_NOTICE"
            byte[] r5 = r5.getByteArrayExtra(r12)
            if (r5 == 0) goto L_0x01cd
            te3.d51 r12 = new te3.d51
            r12.<init>()
            r4.f151980g = r12
            r12.parseFrom(r5)
        L_0x01cd:
            java.lang.String r5 = "FinderLiveAnchorUIC"
            if (r6 == 0) goto L_0x01db
            fj1.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r0 != 0) goto L_0x01e6
            fj1.b r0 = new fj1.b
            r0.<init>(r5)
            goto L_0x01e6
        L_0x01db:
            fj1.b r0 = r0.mo77622Y(r4)
            if (r0 != 0) goto L_0x01e6
            fj1.b r0 = new fj1.b
            r0.<init>(r5)
        L_0x01e6:
            r5 = r0
            if (r6 == 0) goto L_0x01ed
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            r12 = r0
            goto L_0x01ee
        L_0x01ed:
            r12 = 0
        L_0x01ee:
            if (r9 == 0) goto L_0x020a
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            r0.f154301c3 = r10
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            android.content.Intent r13 = r26.getIntent()
            java.lang.String r15 = "KEY_PARAMS_GAME_APP_ID"
            java.lang.String r13 = r13.getStringExtra(r15)
            r0.f154309e3 = r13
        L_0x020a:
            if (r14 != 0) goto L_0x05d2
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            if (r7 == 0) goto L_0x0217
            int r13 = r7.f153424m
            goto L_0x0218
        L_0x0217:
            r13 = 1
        L_0x0218:
            r0.f154292a2 = r13
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r13 = "KEY_PARAMS_TAGIFNOS"
            java.io.Serializable r0 = r0.getSerializableExtra(r13)
            boolean r13 = r0 instanceof java.util.List
            if (r13 == 0) goto L_0x022b
            java.util.List r0 = (java.util.List) r0
            goto L_0x022c
        L_0x022b:
            r0 = 0
        L_0x022c:
            if (r0 == 0) goto L_0x028f
            androidx.lifecycle.i0 r13 = r5.mo71262a(r3)
            cl1.o r13 = (cl1.C54991o) r13
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            r13.f154322h2 = r15
            java.util.Iterator r0 = r0.iterator()
        L_0x023f:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0262
            java.lang.Object r13 = r0.next()
            byte[] r13 = (byte[]) r13
            androidx.lifecycle.i0 r15 = r5.mo71262a(r3)
            cl1.o r15 = (cl1.C54991o) r15
            java.util.LinkedList<te3.y91> r15 = r15.f154322h2
            if (r15 == 0) goto L_0x0260
            te3.y91 r8 = new te3.y91
            r8.<init>()
            r8.parseFrom(r13)
            r15.add(r8)
        L_0x0260:
            r8 = 0
            goto L_0x023f
        L_0x0262:
            java.lang.String r0 = r1.f189693d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "onCreate KEY_PARAMS_TAGIFNOS tagInfoSize:"
            r8.append(r13)
            androidx.lifecycle.i0 r13 = r5.mo71262a(r3)
            cl1.o r13 = (cl1.C54991o) r13
            java.util.LinkedList<te3.y91> r13 = r13.f154322h2
            if (r13 == 0) goto L_0x0281
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x0282
        L_0x0281:
            r13 = 0
        L_0x0282:
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0290
        L_0x028f:
            r0 = 0
        L_0x0290:
            if (r0 != 0) goto L_0x0299
            java.lang.String r0 = r1.f189693d
            java.lang.String r8 = "onCreate KEY_PARAMS_TAGIFNOS null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
        L_0x0299:
            java.lang.Class<cl1.t1> r8 = cl1.C0690t1.class
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            android.content.Intent r13 = r26.getIntent()
            java.lang.String r15 = "KEY_PARAMS_CHOSEN_TAG"
            byte[] r13 = r13.getByteArrayExtra(r15)
            if (r13 == 0) goto L_0x02b6
            te3.y91 r15 = new te3.y91
            r15.<init>()
            r15.parseFrom(r13)
            goto L_0x02b7
        L_0x02b6:
            r15 = 0
        L_0x02b7:
            r0.f154326i2 = r15
            androidx.lifecycle.i0 r0 = r5.mo71262a(r8)
            r13 = r0
            cl1.t1 r13 = (cl1.C0690t1) r13
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r15 = "intent"
            gy3.C87412m.m108594g(r0, r15)
            te3.iq2 r15 = new te3.iq2
            r15.<init>()
            java.lang.String r10 = "KEY_PARAMS_VISITOR_WHITE_LIST_PB"
            byte[] r0 = r0.getByteArrayExtra(r10)
            java.lang.String r10 = "safeParser"
            if (r0 != 0) goto L_0x02db
            r24 = r7
            goto L_0x02ee
        L_0x02db:
            r15.parseFrom(r0)     // Catch:{ Exception -> 0x02e1 }
            r24 = r7
            goto L_0x02ef
        L_0x02e1:
            r0 = move-exception
            r15 = r0
            r24 = r7
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r15
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r11, r0)
        L_0x02ee:
            r15 = 0
        L_0x02ef:
            if (r15 == 0) goto L_0x0383
            java.util.LinkedList<pe3.b> r0 = r15.f135581d
            java.lang.String r7 = "liveWhiteListPb.visitorWhiteList"
            gy3.C87412m.m108593f(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r25 = r14
            r14 = 10
            r17 = r12
            int r12 = sx3.C36907w.m41090l(r0, r14)
            r7.<init>(r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x030b:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x031d
            java.lang.Object r12 = r0.next()
            pe3.b r12 = (pe3.C89349b) r12
            byte[] r12 = r12.f257327a
            r7.add(r12)
            goto L_0x030b
        L_0x031d:
            r13.f1627g = r7
            java.util.List<byte[]> r0 = r13.f1628h
            if (r0 == 0) goto L_0x0326
            r0.clear()
        L_0x0326:
            java.util.List<byte[]> r0 = r13.f1628h
            if (r0 == 0) goto L_0x0353
            java.util.LinkedList<pe3.b> r7 = r15.f135582e
            java.lang.String r12 = "liveWhiteListPb.visibilityChooseByteArray"
            gy3.C87412m.m108593f(r7, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r14 = sx3.C36907w.m41090l(r7, r14)
            r12.<init>(r14)
            java.util.Iterator r7 = r7.iterator()
        L_0x033e:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0350
            java.lang.Object r14 = r7.next()
            pe3.b r14 = (pe3.C89349b) r14
            byte[] r14 = r14.f257327a
            r12.add(r14)
            goto L_0x033e
        L_0x0350:
            r0.addAll(r12)
        L_0x0353:
            int r0 = r15.f135583f
            r13.f1629i = r0
            java.util.ArrayList<java.lang.String> r0 = r13.f1631n
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r13.f1631n
            java.util.LinkedList<java.lang.String> r7 = r15.f135584g
            r0.addAll(r7)
            java.util.ArrayList<java.lang.String> r0 = r13.f1632o
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r13.f1632o
            java.util.LinkedList<java.lang.String> r7 = r15.f135585h
            r0.addAll(r7)
            boolean r0 = r15.f135586i
            r13.mo655i3(r0)
            te3.qw0 r0 = r15.f135587j
            r13.mo656j3(r0)
            te3.xa1 r0 = r15.f135588n
            r13.mo657k3(r0)
            int r0 = r15.f135589o
            r13.f1630j = r0
            goto L_0x0387
        L_0x0383:
            r17 = r12
            r25 = r14
        L_0x0387:
            androidx.lifecycle.i0 r0 = r5.mo71262a(r8)
            cl1.t1 r0 = (cl1.C0690t1) r0
            android.content.Intent r7 = r26.getIntent()
            java.lang.String r8 = "KEY_PARAMS_VISITOR_WHITE_LIST"
            java.io.Serializable r7 = r7.getSerializableExtra(r8)
            boolean r8 = r7 instanceof java.util.List
            if (r8 == 0) goto L_0x039e
            java.util.List r7 = (java.util.List) r7
            goto L_0x039f
        L_0x039e:
            r7 = 0
        L_0x039f:
            r0.f1627g = r7
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            android.content.Intent r7 = r26.getIntent()
            java.lang.String r8 = "KEY_PARAMS_VISIBLE_ROOM_MAX_COUNT"
            r12 = 0
            int r7 = r7.getIntExtra(r8, r12)
            r0.f154180A2 = r7
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            android.content.Intent r7 = r26.getIntent()
            java.lang.String r8 = "KEY_PARAMS_VISIBLE_USER_MAX_COUNT"
            int r7 = r7.getIntExtra(r8, r12)
            r0.f154184B2 = r7
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            r7 = r0
            cl1.o r7 = (cl1.C54991o) r7
            te3.g31 r8 = new te3.g31
            r8.<init>()
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r12 = "KEY_PARAMS_LUCKY_MONEY_CONFIG"
            byte[] r0 = r0.getByteArrayExtra(r12)
            if (r0 != 0) goto L_0x03df
            goto L_0x03ee
        L_0x03df:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x03ee
        L_0x03e3:
            r0 = move-exception
            r12 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r13 = 0
            r0[r13] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r11, r0)
        L_0x03ee:
            r7.f154372u2 = r8
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_BG_MUSIC_ID_LIST"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x0411
            te3.zv0 r7 = new te3.zv0
            r7.<init>()
            r7.parseFrom(r0)
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            cj1.f r0 = r0.f154232N2
            java.util.LinkedList<java.lang.Integer> r7 = r7.f146240d
            r0.mo75653j(r7)
        L_0x0411:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_LIVE_TASK_INFO"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x0435
            te3.t21 r7 = new te3.t21
            r7.<init>()
            r7.parseFrom(r0)
            androidx.lifecycle.i0 r0 = r5.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.LinkedList<te3.l61> r7 = r7.f141907d
            java.lang.String r8 = "taskInfo.quest_activities"
            gy3.C87412m.m108593f(r7, r8)
            r0.f154269V2 = r7
        L_0x0435:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_LAYER_SHOW_INFO"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x0494
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            te3.l21 r8 = new te3.l21
            r8.<init>()
            r8.parseFrom(r0)
            r7.f154293a3 = r8
            java.lang.String r0 = r1.f189693d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setupLiveRoomData set layerShowInfo:"
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            te3.l21 r8 = r8.f154293a3
            if (r8 == 0) goto L_0x046f
            int r8 = r8.f184023d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0470
        L_0x046f:
            r8 = 0
        L_0x0470:
            r7.append(r8)
            r8 = 44
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            te3.l21 r8 = r8.f154293a3
            if (r8 == 0) goto L_0x0489
            int r8 = r8.f184025f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x048a
        L_0x0489:
            r8 = 0
        L_0x048a:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x0494:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_RANDOM_MIC_MATCH_TIMEOUT"
            r8 = 0
            int r0 = r0.getIntExtra(r7, r8)
            if (r0 <= 0) goto L_0x04c2
            java.lang.Class<cl1.d0> r7 = cl1.C54963d0.class
            androidx.lifecycle.i0 r7 = r5.mo71262a(r7)
            cl1.d0 r7 = (cl1.C54963d0) r7
            r7.f154052F = r0
            java.lang.String r7 = r1.f189693d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "setupLiveRoomData: randomMicMatchTimeout = "
            r8.append(r10)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x04c2:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_FANS_CLUB"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x04e1
            java.lang.Class<cl1.x> r7 = cl1.C0696x.class
            androidx.lifecycle.i0 r7 = r5.mo71262a(r7)
            cl1.x r7 = (cl1.C0696x) r7
            te3.ly0 r8 = new te3.ly0
            r8.<init>()
            r8.parseFrom(r0)
            r7.mo659c3(r8)
        L_0x04e1:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_ANCHOR_MINI_APP"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x0529
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            te3.b61 r8 = new te3.b61
            r8.<init>()
            r8.parseFrom(r0)
            r7.mo75959F4(r8)
            java.lang.String r0 = r1.f189693d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setup promoteMiniAppInfo "
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            te3.b61 r8 = r8.f154202G
            if (r8 == 0) goto L_0x051e
            int r8 = r8.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x051f
        L_0x051e:
            r8 = 0
        L_0x051f:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x0529:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_ANCHOR_OP_MINI_APP"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x0570
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r8.<init>()
            r8.parseFrom(r0)
            r7.f154206H = r8
            java.lang.String r0 = r1.f189693d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setup anchorOpPromoteMiniAppInfo "
            r7.append(r8)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r8.f154206H
            if (r8 == 0) goto L_0x0565
            int r8 = r8.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0566
        L_0x0565:
            r8 = 0
        L_0x0566:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x0570:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE"
            r8 = 0
            int r0 = r0.getIntExtra(r7, r8)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r7 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r7
            r7.f160032h = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID"
            r12 = 0
            long r7 = r0.getLongExtra(r7, r12)
            androidx.lifecycle.i0 r0 = r5.mo71262a(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r0 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r0
            r0.f160033i = r7
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_LIVE_CO_CERT_REWARD_INFO"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x05b3
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            te3.oh0 r8 = new te3.oh0
            r8.<init>()
            r8.parseFrom(r0)
            r7.f154282Y0 = r8
        L_0x05b3:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r7 = "KEY_PARAMS_LIVE_IS_FROM_SCAN"
            r8 = 0
            boolean r0 = r0.getBooleanExtra(r7, r8)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            r7.f154277X0 = r0
            androidx.lifecycle.i0 r0 = r5.mo71262a(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r0 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r0
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLivePauseActionEvent> r0 = r0.f160034j
            r0.alive()
            goto L_0x05d8
        L_0x05d2:
            r24 = r7
            r17 = r12
            r25 = r14
        L_0x05d8:
            if (r6 != 0) goto L_0x05dc
            if (r9 == 0) goto L_0x05e4
        L_0x05dc:
            r4.f151978e = r5
            if (r17 == 0) goto L_0x05e4
            r7 = r17
            r4.f151979f = r7
        L_0x05e4:
            fj1.b r0 = r4.f151978e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            androidx.appcompat.app.AppCompatActivity r3 = r26.getActivity()
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r7 = "KEY_PARAMS_FROM_CHATROOM_ID"
            java.lang.String r3 = r3.getStringExtra(r7)
            if (r3 != 0) goto L_0x05fd
            goto L_0x05fe
        L_0x05fd:
            r11 = r3
        L_0x05fe:
            r0.f154225L3 = r11
            com.tencent.mm.plugin.finder.live.view.b r0 = r1.f189695f
            if (r0 == 0) goto L_0x0607
            r0.bindData(r4)
        L_0x0607:
            if (r6 == 0) goto L_0x0642
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            com.tencent.mm.plugin.finder.live.view.b r3 = r1.f189695f
            gy3.C87412m.m108591d(r3)
            r0.getClass()
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g = r3
            cj1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159384o
            if (r0 == 0) goto L_0x061b
            r0.f153504b = r3
        L_0x061b:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r0 == 0) goto L_0x0628
            gh1.j r6 = gh1.C59447j.f169870a
            ks3.l r3 = r6.mo84551c(r3)
            r6.mo84552d(r0, r3)
        L_0x0628:
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x0676
            fj1.b r0 = r0.getBuContext()
            if (r0 == 0) goto L_0x0676
            cj1.z3 r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159383n
            r3.getClass()
            com.tencent.mm.sdk.platformtools.MMHandler r6 = r3.f153758g
            cj1.b4 r7 = new cj1.b4
            r7.<init>(r3, r0)
            r6.post(r7)
            goto L_0x0676
        L_0x0642:
            if (r9 == 0) goto L_0x065c
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r16 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r4.f151979f
            com.tencent.mm.plugin.finder.live.view.b r3 = r1.f189695f
            r20 = 1
            r21 = 0
            r22 = 16
            r23 = 0
            r17 = r5
            r18 = r0
            r19 = r3
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63770d(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0676
        L_0x065c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r16 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r4.f151979f
            com.tencent.mm.plugin.finder.live.view.b r3 = r1.f189695f
            gy3.C87412m.m108591d(r3)
            r20 = 0
            r21 = 0
            r22 = 24
            r23 = 0
            r17 = r5
            r18 = r0
            r19 = r3
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63770d(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0676:
            com.tencent.mm.plugin.finder.live.view.b r0 = r1.f189695f
            if (r0 == 0) goto L_0x0680
            r8 = r25
            r3 = 0
            r0.activate(r4, r8, r3)
        L_0x0680:
            com.tencent.mm.plugin.finder.live.view.b r0 = r1.f189695f
            if (r0 == 0) goto L_0x0687
            r0.mount()
        L_0x0687:
            te3.d51 r0 = new te3.d51
            r0.<init>()
            r4.f151980g = r0
            com.tencent.mm.plugin.finder.live.view.m1 r0 = new com.tencent.mm.plugin.finder.live.view.m1
            uv0.i r3 = new uv0.i
            android.app.Activity r6 = r26.getContext()
            r3.<init>(r6)
            r0.<init>(r3)
            r1.f189697h = r0
            r3 = 21
            java.lang.String r6 = "LiveFloatBall"
            r0.mo35648A(r3, r6)
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            androidx.lifecycle.i0 r3 = r5.mo71262a(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r3 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r3
            int r8 = r3.f160032h
            androidx.lifecycle.i0 r2 = r5.mo71262a(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r2 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r2
            long r9 = r2.f160033i
            r5 = r0
            r6 = r4
            r7 = r24
            r5.Fx0(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65976a1.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onDestroy " + this);
        super.onDestroy();
        C56090m1 m1Var = this.f189697h;
        if (m1Var != null) {
            m1Var.mo67996A0();
        }
        if (!this.f189699j && !this.f189702p) {
            mo90014g3();
            this.f189702p = true;
        }
    }

    public void onNewIntent(Intent intent) {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onNewIntent " + this);
        super.onNewIntent(intent);
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.onNewIntent(intent);
        }
    }

    public void onPause() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onPause " + this);
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f189696g;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.pause();
        }
        this.f189698i = true;
        Runnable runnable = this.f189701o;
        if (runnable != null) {
            runnable.run();
        }
        this.f189701o = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r7, java.lang.String[] r8, int[] r9) {
        /*
            r6 = this;
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            java.lang.String r1 = "permissions"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "grantResults"
            gy3.C87412m.m108594g(r9, r1)
            super.onRequestPermissionsResult(r7, r8, r9)
            java.lang.String r8 = r6.f189693d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r4 = r9[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            r2 = 2
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            r8 = 64
            if (r7 != r8) goto L_0x008c
            r7 = r9[r3]
            if (r7 == 0) goto L_0x008c
            androidx.appcompat.app.AppCompatActivity r7 = r6.getActivity()
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r7 = p918s2.C90111a.m112742f(r7, r9)
            if (r7 != 0) goto L_0x008c
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r1 = 274436(0x43004, float:3.84567E-40)
            r2 = 0
            java.lang.Object r7 = r7.mo119684e(r1, r2)
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L_0x0063
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
        L_0x0063:
            boolean r7 = nc0.C76850a.m92639k(r2)
            if (r7 == 0) goto L_0x006a
            return
        L_0x006a:
            long r1 = java.lang.System.currentTimeMillis()
            di3.d r7 = di3.C86312j.m106911c(r0)
            aw.d r7 = (p447aw.C103918d) r7
            long r7 = r7.mo125770Iw(r9, r8)
            long r1 = r1 - r7
            r7 = 300(0x12c, double:1.48E-321)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x008c
            di3.d r7 = di3.C86312j.m106911c(r0)
            aw.d r7 = (p447aw.C103918d) r7
            android.app.Activity r8 = r6.getContext()
            r7.mo125783j7(r8)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65976a1.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onResume() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onResume " + this);
        super.onResume();
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        boolean z = true;
        if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).mo75999e4()) {
            z = false;
        }
        if (!z) {
            String str2 = this.f189693d;
            Log.m105924i(str2, "reset live_function_switch_flags:" + this.f189700n);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, Long.valueOf(this.f189700n));
        }
        C56032b bVar2 = this.f189695f;
        if (bVar2 != null) {
            bVar2.resume();
        }
        C56032b bVar3 = this.f189695f;
        if (bVar3 != null) {
            bVar3.post(new C65978b(this));
        }
        String str3 = this.f189693d;
        Log.m105924i(str3, "[LiveLifecycler]initBusiness " + this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Class cls = C54991o.class;
        super.onSaveInstanceState(bundle);
        String str = this.f189693d;
        StringBuilder sb = new StringBuilder();
        sb.append("[LiveLifecycle] onSaveInstanceState ");
        sb.append(this);
        sb.append(" curData:");
        FinderLiveService.f159376d.getClass();
        sb.append(FinderLiveService.f159348A);
        Log.m105924i(str, sb.toString());
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar != null) {
            C55001u uVar = (C55001u) bVar.mo71262a(C55001u.class);
            LiveConfig.C55204b bVar2 = new LiveConfig.C55204b();
            bVar2.f157091a = 0;
            bVar2.f157093c = uVar.f154420q.f182392d;
            bVar2.f157106p = uVar.f154423t;
            bVar2.f157101k = uVar.f154416j;
            bVar2.f157096f = ((C54991o) uVar.business(cls)).f154345o;
            bVar2.f157102l = ((C54991o) uVar.business(cls)).f154252S0;
            LiveConfig a = bVar2.mo76374a();
            C54738b1 b1Var = new C54738b1();
            b1Var.f153423l.add(a);
            C54738b1.f153409B.mo561c(bundle, b1Var);
            byte[] bArr = null;
            if (bundle != null) {
                C49098d51 d512 = b1Var.f153412a;
                bundle.putByteArray("KEY_PARAMS_NOTICE", d512 != null ? d512.toByteArray() : null);
            }
            if (bundle != null) {
                C51333t21 t212 = b1Var.f153413b;
                if (t212 != null) {
                    bArr = t212.toByteArray();
                }
                bundle.putByteArray("KEY_PARAMS_LIVE_TASK_INFO", bArr);
            }
        }
    }

    public void onStart() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onStart " + this + ", activateUIKey:" + C56090m1.f159950s);
        super.onStart();
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.start();
        }
        mo90012e3();
    }

    public void onStop() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onStop " + this + ", activateUIKey:" + C56090m1.f159950s);
        super.onStop();
        if (Util.isEqual(C56090m1.f159950s, toString())) {
            C56032b bVar = this.f189695f;
            if (bVar != null) {
                bVar.stop();
            }
            mo90013f3();
        }
    }
}
