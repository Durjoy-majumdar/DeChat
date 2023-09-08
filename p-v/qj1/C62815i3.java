package qj1;

import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import b50.C54405b;
import b50.C54412f;
import c30.C104289g;
import c50.C54655b;
import cj1.C54763g6;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d50.C58112f;
import d50.C58114h;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import j50.C60735a;
import j50.C60767o;
import j50.C60768p;
import j50.C60769q;
import j50.C60770r;
import j50.C60771s;
import j50.C60775u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import m50.C61438b;
import nk1.C11207i;
import ok1.C62042e;
import p565ir.C60606n;
import rx3.C13598b0;
import s50.C110744i;
import s50.C110747k;
import s50.C36624a;
import s50.C63699b;
import s50.C63710m;
import s50.C63711n;
import s50.C63713p;
import sx3.C110818d0;
import te3.C49712hj1;
import u50.C65212a;
import w50.C65933h;
import wx3.C15601d;
import y80.C112405g;
import y80.C66557b;
import z04.C112551y;

/* renamed from: qj1.i3 */
public final class C62815i3 extends C62660c implements C65212a {

    /* renamed from: p */
    public final C58124b f178291p;

    /* renamed from: q */
    public final Context f178292q;

    /* renamed from: r */
    public final LivePreviewView f178293r;

    /* renamed from: s */
    public C53973z1 f178294s;

    /* renamed from: t */
    public View f178295t;

    /* renamed from: u */
    public final C62761ee f178296u;

    /* renamed from: v */
    public int f178297v = 1;

    /* renamed from: qj1.i3$a */
    public static final class C62816a extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62815i3 f178298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62816a(C62815i3 i3Var) {
            super(2);
            this.f178298d = i3Var;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            C62815i3.m73901Z0(this.f178298d);
            if (booleanValue || booleanValue2) {
                C62815i3.m73902a1(this.f178298d, booleanValue ? 2 : 3);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.i3$b */
    public static final class C62817b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62815i3 f178299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62817b(C62815i3 i3Var) {
            super(0);
            this.f178299d = i3Var;
        }

        public Object invoke() {
            C62815i3 i3Var = this.f178299d;
            i3Var.getClass();
            if (C62042e.f176370a.mo87106p0().getBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true) && i3Var.f178297v == 1) {
                C53896h0 h0Var = C53872d1.f151117a;
                i3Var.f178294s = C11207i.m11072h(i3Var, C58901s.f168555a, (C53934p0) null, new C35911j3(i3Var, (C15601d<? super C35911j3>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62815i3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178291p = bVar;
        this.f178292q = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358581fx0);
        ((LivePreviewView) findViewById).setPluginCallback(this);
        C87412m.m108593f(findViewById, "root.findViewById<LivePr…nchorPreviewPlugin)\n    }");
        LivePreviewView livePreviewView = (LivePreviewView) findViewById;
        this.f178293r = livePreviewView;
        this.f178295t = viewGroup.getRootView().findViewById(C0966R.C0970id.o6t);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dkc);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…er_live_doc_cast_ui_root)");
        this.f178296u = new C62761ee((ViewGroup) findViewById2, this);
        boolean z = true;
        viewGroup.setPadding(0, 0, 0, 0);
        Log.m105924i("FinderLiveAnchorPreviewPlugin", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C62816a aVar = new C62816a(this);
        C62817b bVar2 = new C62817b(this);
        livePreviewView.f157159n = aVar;
        livePreviewView.f157160o = bVar2;
        livePreviewView.setCameraOptionEnable(this.f178297v != 1 ? false : z);
    }

    /* renamed from: Z0 */
    public static final void m73901Z0(C62815i3 i3Var) {
        View view = i3Var.f178295t;
        if (view != null && view.getVisibility() == 0) {
            View view2 = i3Var.f178295t;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C62042e.f176370a.mo87106p0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            C53973z1 z1Var = i3Var.f178294s;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: a1 */
    public static final void m73902a1(C62815i3 i3Var, int i) {
        C58112f fVar;
        i3Var.getClass();
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C0073g0 g0Var = C0073g0.FRAME_SCALE;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        C58114h hVar = ((C55001u) i3Var.mo87696x0(C55001u.class)).f154421r;
        boolean z = false;
        int i2 = 1;
        if (!(hVar == null || (fVar = hVar.f166253d) == null || !fVar.f166227b)) {
            z = true;
        }
        if (!z) {
            i2 = 2;
        }
        gVar.mo145953n("camera_status", i2);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f(j5Var, g0Var, gVar.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: e1 */
    public static void m73903e1(C62815i3 i3Var, boolean z, boolean z2, int i, Object obj) {
        C54405b bVar;
        boolean z3 = true;
        int i2 = 0;
        if ((i & 1) != 0) {
            z = false;
        }
        i3Var.getClass();
        if (C62042e.f176370a.mo87110q1()) {
            C54655b c1 = i3Var.mo87797c1();
            if (c1 != null) {
                LivePreviewView livePreviewView = i3Var.f178293r;
                String Sh = ((C60606n) C86312j.m106911c(C60606n.class)).mo85033Sh();
                FinderLiveService.f159376d.getClass();
                C36624a aVar = FinderLiveService.f159390t;
                C63699b bVar2 = FinderLiveService.f159393w;
                if (livePreviewView != null) {
                    if (Sh == null || Sh.length() == 0) {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        ITPPlayer iTPPlayer = c1.f173039x0;
                        if (iTPPlayer != null) {
                            iTPPlayer.stop();
                        }
                        ITPPlayer iTPPlayer2 = c1.f173039x0;
                        if (iTPPlayer2 != null) {
                            iTPPlayer2.release();
                        }
                        ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(MMApplicationContext.getContext());
                        c1.f173039x0 = createTPPlayer;
                        if (createTPPlayer != null) {
                            Log.m105924i("MicroMsg.LiveCore", "startPushLocalVideo path:" + Sh);
                            createTPPlayer.setDataSource(Sh);
                            createTPPlayer.setLoopback(true);
                        }
                        c1.f173033s = livePreviewView;
                        C60971a aVar2 = C60971a.C60973b.f173670a;
                        aVar2.mo85944a().getClass();
                        aVar2.mo85947d().getClass();
                        livePreviewView.mo76421d(new C60770r(c1), new C60771s(c1));
                        C110747k kVar = c1.f173031q;
                        kVar.getClass();
                        kVar.mo148312q(new C63710m(kVar, aVar));
                        C110747k kVar2 = c1.f173031q;
                        kVar2.getClass();
                        kVar2.mo148312q(new C63711n(kVar2, bVar2));
                        c1.f173031q.mo148308i(new C60775u(c1, Sh));
                    }
                }
                Log.m105920e("MicroMsg.LiveCore", "startPushLocalVideo preiewView is null or path is nullOrEmpty");
            }
            i3Var.mo87798d1();
            return;
        }
        C54655b c15 = i3Var.mo87797c1();
        if (!(c15 == null || (bVar = c15.f173032r) == null)) {
            int w = FinderLiveService.f159376d.mo77649w();
            C110747k kVar3 = ((C54412f) bVar).f152607b;
            kVar3.getClass();
            kVar3.mo148312q(new C63713p(kVar3, w));
        }
        if (z) {
            C54655b c16 = i3Var.mo87797c1();
            if (c16 != null) {
                LivePreviewView livePreviewView2 = i3Var.f178293r;
                if (livePreviewView2 == null) {
                    Log.m105920e("MicroMsg.LiveCore", "startPreviewToRemote preiewView is null");
                } else {
                    C110747k kVar4 = c16.f173031q;
                    kVar4.getClass();
                    kVar4.mo148312q(new C110744i(kVar4));
                    String str = "startPreview " + livePreviewView2;
                    C87412m.m108594g(str, "debugText");
                    Log.m105924i("MicroMsg.LiveCore", str);
                    c16.f173033s = livePreviewView2;
                    C60971a aVar3 = C60971a.C60973b.f173670a;
                    aVar3.mo85944a().getClass();
                    aVar3.mo85947d().getClass();
                    livePreviewView2.mo76421d(new C60767o(c16), new C60768p(c16));
                    C112405g gVar = c16.f173034t;
                    if (gVar == null || !gVar.mo164109B()) {
                        z3 = false;
                    }
                    if (z3) {
                        C61438b b = aVar3.mo85945b();
                        C112405g gVar2 = c16.f173034t;
                        if (gVar2 != null) {
                            i2 = gVar2.mo143180s();
                        }
                        b.f174704a = i2;
                        Log.m105924i("MicroMsg.LiveCore", "start preview success");
                        C110747k kVar5 = c16.f173031q;
                        C112405g gVar3 = c16.f173034t;
                        C66557b m = gVar3 != null ? gVar3.mo143174m() : null;
                        C87412m.m108591d(m);
                        kVar5.mo148310m(m);
                        c16.f173031q.setOnDrawListener(new C60769q(c16));
                    }
                }
            }
        } else {
            C54655b c17 = i3Var.mo87797c1();
            if (c17 != null) {
                LivePreviewView livePreviewView3 = i3Var.f178293r;
                FinderLiveService.f159376d.getClass();
                c17.mo85700s0(livePreviewView3, FinderLiveService.f159390t, FinderLiveService.f159393w);
            }
            i3Var.mo87798d1();
        }
        i3Var.f166287d.post(new C62892n3(i3Var));
    }

    /* renamed from: P */
    public String mo87795P() {
        String n4 = ((C54991o) mo87696x0(C54991o.class)).mo76015n4();
        return n4 == null ? "" : n4;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87796b1(boolean z) {
        C63081w3 w3Var;
        C58115i iVar;
        Class cls = C63081w3.class;
        if (z) {
            C63081w3 w3Var2 = (C63081w3) mo87687E0(cls);
            if (w3Var2 != null) {
                w3Var2.mo10792g(8);
                return;
            }
            return;
        }
        C54655b c1 = mo87797c1();
        boolean z2 = true;
        if (c1 == null || (iVar = c1.f172989A) == null || !iVar.mo82880b()) {
            z2 = false;
        }
        if (z2 && (w3Var = (C63081w3) mo87687E0(cls)) != null) {
            w3Var.mo10792g(0);
        }
    }

    /* renamed from: c1 */
    public final C54655b mo87797c1() {
        return FinderLiveService.f159376d.mo77626b();
    }

    /* renamed from: d1 */
    public final void mo87798d1() {
        C54405b bVar;
        C54405b bVar2;
        C54405b bVar3;
        Iterator it = ((ArrayList) C65933h.f189544a.mo89975f()).iterator();
        while (it.hasNext()) {
            C65933h.C65935b bVar4 = (C65933h.C65935b) it.next();
            int i = bVar4.f189556a;
            C54763g6 g6Var = C54763g6.f153485a;
            if (i == g6Var.mo75665b()) {
                C54655b c1 = mo87797c1();
                if (!(c1 == null || (bVar3 = c1.f173032r) == null)) {
                    ((C54412f) bVar3).mo75225h(bVar4.f189559d, bVar4.f189560e);
                }
                C54655b c15 = mo87797c1();
                if (!(c15 == null || (bVar2 = c15.f173032r) == null)) {
                    ((C54412f) bVar2).mo75224g(g6Var.mo75666c(bVar4.f189556a, 1));
                }
                C54655b c16 = mo87797c1();
                if (c16 != null && (bVar = c16.f173032r) != null) {
                    C54405b.C54406a.m61097a(bVar, g6Var.mo75666c(bVar4.f189556a, 2), false, false, 4, (Object) null);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: f1 */
    public final void mo87799f1() {
        mo87796b1(false);
        C62761ee eeVar = this.f178296u;
        eeVar.f178158a.setVisibility(8);
        eeVar.f178160c.removeAllViews();
        C60735a c = eeVar.mo87763c();
        if (c != null) {
            c.mo85704w0(false, (TextureView) null, (View) null);
        }
        C60735a c2 = eeVar.mo87763c();
        if (c2 != null) {
            c2.f173003P.set(0, 0);
        }
        eeVar.mo87765e();
        this.f178293r.mo76420c();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        Class cls = C54991o.class;
        boolean z = false;
        String str = null;
        if ((i == 1 || i == 3) && i2 == -1) {
            if (i == 3) {
                this.f178296u.mo87765e();
            }
            ((C54991o) mo87696x0(cls)).f154365s3 = intent != null ? intent.getStringExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH) : null;
            ((C54991o) mo87696x0(cls)).f154369t3 = 1;
            boolean k = C86013q1.m106450k(((C54991o) mo87696x0(cls)).f154365s3);
            Log.m105924i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_FILE screenShareFilePath:" + ((C54991o) mo87696x0(cls)).f154365s3 + " exist:" + k);
            String str2 = ((C54991o) mo87696x0(cls)).f154365s3;
            if ((str2 == null || str2.length() == 0) || !k) {
                ((C54991o) mo87696x0(cls)).f154365s3 = null;
                ((C54991o) mo87696x0(cls)).f154369t3 = 0;
                return;
            }
            this.f178296u.mo87768h(((C54991o) mo87696x0(cls)).f154369t3);
            this.f178296u.mo87766f();
            mo87796b1(true);
        } else if ((i == 2 || i == 4) && i2 == -1) {
            if (i == 4) {
                this.f178296u.mo87765e();
            }
            ((C54991o) mo87696x0(cls)).f154365s3 = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List")) == null) ? null : (String) C110818d0.m150916N(stringArrayListExtra);
            ((C54991o) mo87696x0(cls)).f154369t3 = 2;
            boolean k2 = C86013q1.m106450k(((C54991o) mo87696x0(cls)).f154365s3);
            Log.m105924i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_IMAGE screenShareFilePath:" + ((C54991o) mo87696x0(cls)).f154365s3 + " exist:" + k2);
            String str3 = ((C54991o) mo87696x0(cls)).f154365s3;
            if ((str3 == null || str3.length() == 0) || !k2) {
                ((C54991o) mo87696x0(cls)).f154365s3 = null;
                ((C54991o) mo87696x0(cls)).f154369t3 = 0;
                return;
            }
            this.f178296u.mo87768h(((C54991o) mo87696x0(cls)).f154369t3);
            this.f178296u.mo87766f();
            mo87796b1(true);
        } else if (i == 5 && i2 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("finder_biz_live_article_url");
            }
            if (str == null || C112551y.m153811k(str)) {
                z = true;
            }
            if (!z) {
                ((C54991o) mo87696x0(cls)).f154381w3 = str;
                ((C54991o) mo87696x0(cls)).f154369t3 = 3;
                this.f178296u.mo87767g(str);
            }
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        int size = linkedHashMap.size();
        this.f178297v = size;
        this.f178293r.setCameraOptionEnable(size == 1);
        if (this.f178297v > 1) {
            mo14484z0().getPreviewRoot().setBackground((Drawable) null);
        } else {
            mo14484z0().getPreviewRoot().setBackgroundResource(C0966R.color.f3135ap);
        }
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r14 = r14.f172989A;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r14, android.os.Bundle r15) {
        /*
            r13 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "status"
            gy3.C87412m.m108594g(r14, r1)
            super.mo3210u0(r14, r15)
            int r14 = r14.ordinal()
            r1 = 0
            r2 = 5
            if (r14 == r2) goto L_0x0267
            r2 = 6
            if (r14 == r2) goto L_0x0267
            r2 = 7
            if (r14 == r2) goto L_0x0267
            r2 = 10
            java.lang.String r3 = "MicroMsg.LiveCoreAnchor"
            r4 = 1
            if (r14 == r2) goto L_0x020a
            r2 = 27
            r5 = 0
            if (r14 == r2) goto L_0x01df
            r2 = 169(0xa9, float:2.37E-43)
            r6 = 2
            java.lang.String r7 = ", liveData.audioModeHolderBm:"
            java.lang.String r8 = ", fromMiniWindow:"
            java.lang.String r9 = "checkAudioMode isAudioMode:"
            if (r14 == r2) goto L_0x00b5
            r15 = 175(0xaf, float:2.45E-43)
            if (r14 == r15) goto L_0x003a
            r15 = 192(0xc0, float:2.69E-43)
            if (r14 == r15) goto L_0x003a
            goto L_0x02cf
        L_0x003a:
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x004c
            d50.i r14 = r14.f172989A
            if (r14 == 0) goto L_0x004c
            boolean r14 = r14.mo82880b()
            if (r14 != r4) goto L_0x004c
            r14 = 1
            goto L_0x004d
        L_0x004c:
            r14 = 0
        L_0x004d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r14)
            r15.append(r8)
            r15.append(r1)
            r15.append(r7)
            androidx.lifecycle.i0 r2 = r13.mo87696x0(r0)
            cl1.o r2 = (cl1.C54991o) r2
            android.graphics.Bitmap r2 = r2.f154254S2
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            if (r14 == 0) goto L_0x0081
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x02cf
            com.tencent.mm.live.core.view.LivePreviewView r15 = r13.f178293r
            r14.f173033s = r15
            goto L_0x02cf
        L_0x0081:
            m73903e1(r13, r1, r1, r6, r5)
            com.tencent.mm.live.core.view.LivePreviewView r14 = r13.f178293r
            r14.mo76420c()
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x0098
            d50.i r14 = r14.f172989A
            if (r14 == 0) goto L_0x0098
            boolean r14 = r14.f166264k
            if (r14 != r4) goto L_0x0098
            r1 = 1
        L_0x0098:
            if (r1 == 0) goto L_0x02cf
            androidx.lifecycle.i0 r14 = r13.mo87696x0(r0)
            cl1.o r14 = (cl1.C54991o) r14
            int r14 = r14.f154369t3
            if (r14 != 0) goto L_0x00a6
            goto L_0x02cf
        L_0x00a6:
            qj1.ee r15 = r13.f178296u
            r15.mo87768h(r14)
            qj1.ee r14 = r13.f178296u
            r14.mo87766f()
            r13.mo87796b1(r4)
            goto L_0x02cf
        L_0x00b5:
            if (r15 == 0) goto L_0x00be
            java.lang.String r14 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            boolean r14 = r15.getBoolean(r14, r1)
            goto L_0x00bf
        L_0x00be:
            r14 = 0
        L_0x00bf:
            if (r15 == 0) goto L_0x00c8
            java.lang.String r2 = "PARAM_FINDER_LIVE_SWITCH_MODE_FROM_MINIWINDOW"
            boolean r15 = r15.getBoolean(r2, r1)
            goto L_0x00c9
        L_0x00c8:
            r15 = 0
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r14)
            r2.append(r8)
            r2.append(r15)
            r2.append(r7)
            androidx.lifecycle.i0 r0 = r13.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            android.graphics.Bitmap r0 = r0.f154254S2
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            c50.b r0 = r13.mo87797c1()
            if (r0 == 0) goto L_0x00ff
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r0.f166264k
            if (r0 != 0) goto L_0x00ff
            r0 = 1
            goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x0118
            if (r14 == 0) goto L_0x010f
            c50.b r15 = r13.mo87797c1()
            if (r15 == 0) goto L_0x0122
            com.tencent.mm.live.core.view.LivePreviewView r0 = r13.f178293r
            r15.f173033s = r0
            goto L_0x0122
        L_0x010f:
            m73903e1(r13, r15, r1, r6, r5)
            com.tencent.mm.live.core.view.LivePreviewView r15 = r13.f178293r
            r15.mo76420c()
            goto L_0x0122
        L_0x0118:
            c50.b r15 = r13.mo87797c1()
            if (r15 == 0) goto L_0x0122
            com.tencent.mm.live.core.view.LivePreviewView r0 = r13.f178293r
            r15.f173033s = r0
        L_0x0122:
            qj1.ee r15 = r13.f178296u
            j50.a r0 = r15.mo87763c()
            if (r0 == 0) goto L_0x0134
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0134
            boolean r0 = r0.f166264k
            if (r0 != r4) goto L_0x0134
            r0 = 1
            goto L_0x0135
        L_0x0134:
            r0 = 0
        L_0x0135:
            if (r0 == 0) goto L_0x02cf
            if (r14 == 0) goto L_0x013e
            r15.mo87762b()
            goto L_0x02cf
        L_0x013e:
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r14 = r15.f178163f
            r14.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r14 = r15.f178163f
            qj1.fe r0 = new qj1.fe
            r0.<init>(r15)
            r14.post(r0)
            j50.a r14 = r15.mo87763c()
            if (r14 == 0) goto L_0x01da
            d50.h r0 = r14.f173042z
            if (r0 == 0) goto L_0x015e
            d50.f r2 = r0.f166253d
            if (r2 == 0) goto L_0x015e
            boolean r2 = r2.f166226a
            goto L_0x015f
        L_0x015e:
            r2 = 0
        L_0x015f:
            if (r0 == 0) goto L_0x0168
            d50.f r0 = r0.f166253d
            if (r0 == 0) goto L_0x0168
            boolean r0 = r0.f166227b
            goto L_0x0178
        L_0x0168:
            y80.b r0 = r14.f173035u
            if (r0 == 0) goto L_0x0172
            boolean r0 = y80.C66557b.f191420g
            if (r0 != 0) goto L_0x0172
            r0 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            if (r0 != 0) goto L_0x0177
            r0 = 1
            goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            r14.mo85681Y(r2, r0)
            d50.h r0 = r14.f173042z
            if (r0 == 0) goto L_0x0188
            d50.f r0 = r0.f166253d
            if (r0 == 0) goto L_0x0188
            boolean r0 = r0.f166228c
            if (r0 != r4) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r4 = 0
        L_0x0189:
            if (r4 == 0) goto L_0x0198
            y80.g r0 = r14.f173034t
            if (r0 == 0) goto L_0x0198
            s50.k r2 = r14.f173031q
            i72.h r2 = r2.getFrameDataCallback()
            r0.mo143182t(r2)
        L_0x0198:
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.a r2 = r0.mo85944a()
            r2.getClass()
            m50.e r2 = r0.mo85947d()
            r2.getClass()
            m50.b r0 = r0.mo85945b()
            y80.g r2 = r14.f173034t
            if (r2 == 0) goto L_0x01b4
            int r1 = r2.mo143180s()
        L_0x01b4:
            r0.f174704a = r1
            s50.k r0 = r14.f173031q
            r0.getClass()
            s50.m r1 = new s50.m
            r1.<init>(r0, r5)
            r0.mo148312q(r1)
            s50.k r0 = r14.f173031q
            r0.getClass()
            s50.n r1 = new s50.n
            r1.<init>(r0, r5)
            r0.mo148312q(r1)
            s50.k r0 = r14.f173031q
            j50.h r1 = new j50.h
            r1.<init>(r14)
            r0.mo148308i(r1)
        L_0x01da:
            r15.mo87764d()
            goto L_0x02cf
        L_0x01df:
            ok1.e r14 = ok1.C62042e.f176370a
            boolean r14 = r14.mo87110q1()
            if (r14 == 0) goto L_0x01ff
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x02cf
            com.tencent.thumbplayer.api.ITPPlayer r15 = r14.f173039x0
            if (r15 == 0) goto L_0x01f4
            r15.stop()
        L_0x01f4:
            com.tencent.thumbplayer.api.ITPPlayer r15 = r14.f173039x0
            if (r15 == 0) goto L_0x01fb
            r15.release()
        L_0x01fb:
            r14.f173039x0 = r5
            goto L_0x02cf
        L_0x01ff:
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x02cf
            r14.mo85702u0()
            goto L_0x02cf
        L_0x020a:
            java.lang.String r14 = "switchCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x0219
            r14.mo85703v0()
        L_0x0219:
            c50.b r14 = r13.mo87797c1()
            if (r14 == 0) goto L_0x022e
            b50.b r14 = r14.f173032r
            if (r14 == 0) goto L_0x022e
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r15 = r15.mo77650x()
            b50.f r14 = (b50.C54412f) r14
            r14.mo75189c(r15)
        L_0x022e:
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r14 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r6 = r14.f133050d
            java.lang.String r8 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r9 = 1
            k50.a r14 = k50.C60971a.C60973b.f173670a
            m50.b r14 = r14.mo85945b()
            int r14 = r14.f174704a
            if (r14 != 0) goto L_0x0243
            r10 = 1
            goto L_0x0244
        L_0x0243:
            r10 = 0
        L_0x0244:
            java.lang.String r11 = eb0.C75592q0.m90789s()
            java.lang.String r14 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r11, r14)
            te3.ep2 r14 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r12 = r14.f133055i
            e60.C58532b.m67947c(r5, r6, r8, r9, r10, r11, r12)
            java.lang.String r14 = "MicroMsg.LiveAnchorIDKeyStat"
            java.lang.String r15 = "markAnchorSwitchCameraWhileLiveOn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1380(0x564, double:6.82E-321)
            r3 = 7
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x02cf
        L_0x0267:
            java.lang.Class<cl1.d0> r14 = cl1.C54963d0.class
            androidx.lifecycle.i0 r15 = r13.mo87696x0(r14)
            cl1.d0 r15 = (cl1.C54963d0) r15
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r15 = r15.f154077t
            qj1.l3 r0 = new qj1.l3
            r0.<init>(r13)
            r15.observe(r13, r0)
            androidx.lifecycle.i0 r14 = r13.mo87696x0(r14)
            cl1.d0 r14 = (cl1.C54963d0) r14
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r14 = r14.f154077t
            if (r14 == 0) goto L_0x02cc
            java.lang.Object r14 = r14.getValue()
            if (r14 != 0) goto L_0x02cc
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            v50.a r15 = new v50.a
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r13.mo87696x0(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.bq2 r0 = r0.f154419p
            java.lang.String r0 = r0.f182319n
            if (r0 != 0) goto L_0x02a0
            java.lang.String r0 = "DEFAULT_ANCHOR_USER_ID"
        L_0x02a0:
            com.tencent.mm.view.ratio.RatioLayout$a r2 = new com.tencent.mm.view.ratio.RatioLayout$a
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r3, r4, r4)
            r15.<init>(r0, r2)
            r14.add(r15)
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r15)
            int r15 = r15.x
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.y
            com.tencent.mm.live.core.view.LivePreviewView r2 = r13.f178293r
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1, r1, r15, r0)
            r2.mo76419b(r14, r3)
        L_0x02cc:
            r13.mo10792g(r1)
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62815i3.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        Log.m105924i("MicroMsg.LiveCoreAnchor", "unMount");
    }
}
