package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import c30.C104289g;
import c30.C79922d;
import cl1.C54991o;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFloatContainer;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44247d0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44305j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44365w;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XFileSdk;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import e00.C45528u;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j50.C60735a;
import java.util.HashMap;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: qj1.ee */
public final class C62761ee {

    /* renamed from: a */
    public final ViewGroup f178158a;

    /* renamed from: b */
    public final C62660c f178159b;

    /* renamed from: c */
    public RelativeLayout f178160c;

    /* renamed from: d */
    public RelativeLayout f178161d;

    /* renamed from: e */
    public TextureView f178162e;

    /* renamed from: f */
    public FinderLiveFloatContainer f178163f;

    /* renamed from: g */
    public final int f178164g;

    /* renamed from: h */
    public String f178165h;

    /* renamed from: i */
    public String f178166i;

    /* renamed from: j */
    public String f178167j;

    /* renamed from: qj1.ee$a */
    public static final class C62762a extends C87413o implements C32226l<MotionEvent, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62761ee f178168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62762a(C62761ee eeVar) {
            super(1);
            this.f178168d = eeVar;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                android.view.MotionEvent r6 = (android.view.MotionEvent) r6
                qj1.ee r6 = r5.f178168d
                j50.a r6 = r6.mo87763c()
                if (r6 == 0) goto L_0x003c
                qj1.ee r0 = r5.f178168d
                com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r0 = r0.f178163f
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
                r2 = 0
                if (r1 == 0) goto L_0x001a
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                goto L_0x001b
            L_0x001a:
                r0 = r2
            L_0x001b:
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r0.getMarginEnd()
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                qj1.ee r3 = r5.f178168d
                com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r3 = r3.f178163f
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r4 == 0) goto L_0x0033
                r2 = r3
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            L_0x0033:
                if (r2 == 0) goto L_0x0037
                int r1 = r2.topMargin
            L_0x0037:
                android.graphics.Point r6 = r6.f173003P
                r6.set(r0, r1)
            L_0x003c:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62761ee.C62762a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qj1.ee$b */
    public static final class C62763b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62761ee f178169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62763b(C62761ee eeVar) {
            super(0);
            this.f178169d = eeVar;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                qj1.ee r0 = r6.f178169d
                j50.a r0 = r0.mo87763c()
                if (r0 == 0) goto L_0x003a
                qj1.ee r1 = r6.f178169d
                com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r1 = r1.f178163f
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
                r3 = 0
                if (r2 == 0) goto L_0x0018
                android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
                goto L_0x0019
            L_0x0018:
                r1 = r3
            L_0x0019:
                r2 = 0
                if (r1 == 0) goto L_0x0021
                int r1 = r1.getMarginEnd()
                goto L_0x0022
            L_0x0021:
                r1 = 0
            L_0x0022:
                qj1.ee r4 = r6.f178169d
                com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r4 = r4.f178163f
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r5 == 0) goto L_0x0031
                r3 = r4
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            L_0x0031:
                if (r3 == 0) goto L_0x0035
                int r2 = r3.topMargin
            L_0x0035:
                android.graphics.Point r0 = r0.f173003P
                r0.set(r1, r2)
            L_0x003a:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62761ee.C62763b.invoke():java.lang.Object");
        }
    }

    /* renamed from: qj1.ee$c */
    public static final class C62764c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f178170d;

        /* renamed from: e */
        public final /* synthetic */ C62761ee f178171e;

        /* renamed from: f */
        public final /* synthetic */ C44247d0 f178172f;

        public C62764c(View view, C62761ee eeVar, C44247d0 d0Var) {
            this.f178170d = view;
            this.f178171e = eeVar;
            this.f178172f = d0Var;
        }

        public final void run() {
            View view = this.f178170d;
            ViewGroup viewGroup = null;
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f178171e.f178160c.addView(this.f178170d, new ViewGroup.LayoutParams(-1, -1));
            this.f178171e.mo87761a(this.f178172f.mo68950h());
            Bundle bundle = new Bundle();
            C62761ee eeVar = this.f178171e;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", oVar != null ? oVar.mo75960G3() : false);
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", true);
            eeVar.f178159b.f177936g.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle);
        }
    }

    public C62761ee(ViewGroup viewGroup, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(cVar, "basePlugin");
        this.f178158a = viewGroup;
        this.f178159b = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dkb);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…ive_doc_cast_reader_root)");
        this.f178160c = (RelativeLayout) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dka);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…oc_cast_reader_container)");
        this.f178161d = (RelativeLayout) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.dk_);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…der_live_doc_cast_camera)");
        this.f178162e = (TextureView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.dkd);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…_doc_cast_video_cotainer)");
        this.f178163f = (FinderLiveFloatContainer) findViewById4;
        this.f178164g = C74942w4.m89784a(viewGroup.getContext(), 8);
        this.f178163f.setTranslationX(0.0f);
        FinderLiveFloatContainer finderLiveFloatContainer = this.f178163f;
        finderLiveFloatContainer.setOnTouchCallback(new C62762a(this));
        finderLiveFloatContainer.setOnAnimCallback(new C62763b(this));
    }

    /* renamed from: a */
    public final void mo87761a(View view) {
        C58115i iVar;
        C58115i iVar2;
        Class cls = C54108o.class;
        this.f178158a.setVisibility(0);
        int a = C74942w4.m89784a(this.f178158a.getContext(), 120);
        int a2 = C74942w4.m89784a(this.f178158a.getContext(), 90) + C75044y4.m89991c(this.f178158a.getContext());
        C12322e5 e5Var = (C12322e5) this.f178159b.mo87687E0(C12322e5.class);
        int maxHeight = a2 + (e5Var != null ? e5Var.f35530u.getMaxHeight() : 0);
        ViewGroup.LayoutParams layoutParams = this.f178163f.getLayoutParams();
        Boolean bool = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = a;
            marginLayoutParams.setMarginEnd(this.f178164g);
        }
        FinderLiveFloatContainer finderLiveFloatContainer = this.f178163f;
        int i = this.f178164g;
        finderLiveFloatContainer.f159750s = a;
        finderLiveFloatContainer.f159751t = maxHeight;
        finderLiveFloatContainer.f159752u = i;
        finderLiveFloatContainer.f159753v = i;
        C60735a c = mo87763c();
        boolean z = true;
        if (c != null) {
            c.mo85704w0(true, this.f178162e, view);
        }
        mo87764d();
        C60735a c2 = mo87763c();
        if (c2 == null || (iVar2 = c2.f172989A) == null || !iVar2.mo82880b()) {
            z = false;
        }
        if (z) {
            mo87762b();
        } else {
            this.f178163f.setVisibility(0);
            this.f178163f.post(new C62776fe(this));
        }
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        if (f0Var.f151466k0 == 0) {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151466k0 = System.currentTimeMillis();
            C104289g gVar = new C104289g();
            gVar.mo145967r("type", 3);
            String str = this.f178167j;
            if (str == null) {
                str = "other";
            }
            gVar.mo145967r("result", str);
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c3, C0073g0.SCREEN_SHARE, gVar.toString(), (String) null, 4, (Object) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startScreenShare isAudioMode:");
        C60735a c4 = mo87763c();
        if (!(c4 == null || (iVar = c4.f172989A) == null)) {
            bool = Boolean.valueOf(iVar.mo82880b());
        }
        sb.append(bool);
        sb.append(" topBoundary:");
        sb.append(a);
        Log.m105924i("FinderLiveScreenShareWidget", sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r2 = (r2 = (r2 = r2.f154341n).objectDesc).liveDesc;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87762b() {
        /*
            r6 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r2 = r1.mo77630e(r0)
            cl1.o r2 = (cl1.C54991o) r2
            r3 = 0
            if (r2 == 0) goto L_0x001c
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
            if (r2 == 0) goto L_0x001c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x001c
            te3.px0 r2 = r2.liveDesc
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.f184911d
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            if (r2 == 0) goto L_0x0028
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x0029
        L_0x0028:
            r4 = 1
        L_0x0029:
            if (r4 == 0) goto L_0x004d
            androidx.lifecycle.i0 r2 = r1.mo77630e(r0)
            cl1.o r2 = (cl1.C54991o) r2
            if (r2 == 0) goto L_0x004b
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
            if (r2 == 0) goto L_0x004b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x004b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 == 0) goto L_0x004b
            java.lang.String r2 = r2.url
            if (r2 != 0) goto L_0x004d
        L_0x004b:
            java.lang.String r2 = ""
        L_0x004d:
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r4 = r6.f178163f
            r5 = 8
            r4.setVisibility(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "liveCoverUrl:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", liveData.audioModeHolderBm:"
            r4.append(r2)
            androidx.lifecycle.i0 r0 = r1.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x0070
            android.graphics.Bitmap r3 = r0.f154254S2
        L_0x0070:
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "FinderLiveScreenShareWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62761ee.mo87762b():void");
    }

    /* renamed from: c */
    public final C60735a mo87763c() {
        return FinderLiveService.f159376d.mo77626b();
    }

    /* renamed from: d */
    public final void mo87764d() {
        ViewParent parent = this.f178162e.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f178162e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f178162e);
        }
    }

    /* renamed from: e */
    public final void mo87765e() {
        Class cls = C54108o.class;
        C104289g gVar = new C104289g();
        long currentTimeMillis = System.currentTimeMillis();
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        long j = (currentTimeMillis - f0Var.f151466k0) / ((long) 1000);
        gVar.mo145967r("type", 4);
        gVar.mo145967r("result", Long.valueOf(j));
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SCREEN_SHARE, gVar.toString(), (String) null, 4, (Object) null);
        C79922d dVar = new C79922d();
        dVar.mo110094b("type", this.f178167j);
        dVar.mo110094b("time", Long.valueOf(j));
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var.f151468l0.mo53846q(dVar);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var.f151466k0 = 0;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87766f() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "restoreScreenShare floatPosition:"
            r0.append(r1)
            j50.a r1 = r3.mo87763c()
            r2 = 0
            if (r1 == 0) goto L_0x0014
            android.graphics.Point r1 = r1.f173003P
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveScreenShareWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            j50.a r0 = r3.mo87763c()
            if (r0 == 0) goto L_0x0062
            android.graphics.Point r0 = r0.f173003P
            if (r0 == 0) goto L_0x0062
            int r1 = r0.x
            if (r1 != 0) goto L_0x0033
            int r0 = r0.y
            if (r0 == 0) goto L_0x0062
        L_0x0033:
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer r0 = r3.f178163f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0040
            r2 = r0
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L_0x0040:
            if (r2 == 0) goto L_0x0062
            j50.a r0 = r3.mo87763c()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            android.graphics.Point r0 = r0.f173003P
            if (r0 == 0) goto L_0x0050
            int r0 = r0.x
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r2.setMarginEnd(r0)
            j50.a r0 = r3.mo87763c()
            if (r0 == 0) goto L_0x0060
            android.graphics.Point r0 = r0.f173003P
            if (r0 == 0) goto L_0x0060
            int r1 = r0.y
        L_0x0060:
            r2.topMargin = r1
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62761ee.mo87766f():void");
    }

    /* renamed from: g */
    public final void mo87767g(String str) {
        C87412m.m108594g(str, "url");
        this.f178167j = "public_word";
        Context context = this.f178158a.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        C44247d0 qI = ((C45528u) C86312j.m106911c(C45528u.class)).mo70751qI((Activity) context, str, (MMWebView) null, new C44305j(0.0f, (String) null, false, 0, true, (Dialog) null, (C44365w) null, 111, (C8480h) null));
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null) {
            oVar.f154373u3 = str;
        }
        qI.mo68952m();
        new MMHandler(Looper.getMainLooper()).post(new C62764c(qI.mo68947b(), this, qI));
    }

    /* renamed from: h */
    public final void mo87768h(int i) {
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("selectShareFile:");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        String str = null;
        sb.append(oVar != null ? oVar.f154365s3 : null);
        Log.m105924i("FinderLiveScreenShareWidget", sb.toString());
        if (i != 0) {
            boolean z = false;
            if (i == 3) {
                C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
                if (oVar2 != null) {
                    str = oVar2.f154381w3;
                }
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    mo87767g(str);
                    return;
                }
                return;
            }
            C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar3 != null) {
                str = oVar3.f154365s3;
            }
            if (!(str == null || str.length() == 0) && C86013q1.m106450k(str)) {
                if (i == 2) {
                    C87412m.m108594g(str, "strFilePath");
                    int H = C112550d0.m153772H(str, ".", 0, false, 6, (Object) null) + 1;
                    if (H >= str.length()) {
                        Log.m105924i("FinderLiveScreenShareWidget", "open file error : file path error");
                    } else {
                        String substring = str.substring(H);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        this.f178167j = substring;
                        this.f178160c.removeAllViews();
                        WxImageView wxImageView = new WxImageView(this.f178158a.getContext());
                        wxImageView.setOrientation(BackwardSupportUtil.ExifHelper.getExifOrientation(str));
                        String encode = Uri.encode(C86013q1.m106448i(str, false));
                        if (!Util.isNullOrNil(encode)) {
                            wxImageView.mo21400p(C86013q1.m106448i(str, false), ImageSource.uri(encode));
                        }
                        this.f178160c.addView(wxImageView, new RelativeLayout.LayoutParams(-1, -1));
                        wxImageView.setOnImageLoadEventListener(new C62823ie(wxImageView));
                    }
                } else {
                    C87412m.m108594g(str, "strFilePath");
                    int H2 = C112550d0.m153772H(str, ".", 0, false, 6, (Object) null) + 1;
                    if (H2 >= str.length()) {
                        Log.m105924i("FinderLiveScreenShareWidget", "open file error : file path error");
                    } else {
                        String substring2 = str.substring(H2);
                        C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
                        this.f178167j = substring2;
                        this.f178166i = str;
                        if (this.f178165h == null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(hashCode());
                            sb4.append(System.currentTimeMillis());
                            this.f178165h = sb4.toString();
                        }
                        String str2 = this.f178166i;
                        if (!(str2 == null || this.f178167j == null)) {
                            C86009m1 m1Var = new C86009m1(str2);
                            if (m1Var.mo119967g() && m1Var.mo119978p()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_SCALE, "false");
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_ENABLE_RECEIVE_VIEW_STATUS_CHANGE, "true");
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_BG_COLOR, String.valueOf(this.f178158a.getContext().getResources().getColor(C0966R.color.f2949a6)));
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_DISABLE_FINISH_ACTIVITY, "true");
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_SET_MAX_SCALE, "3");
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR, "true");
                                hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, "14");
                                this.f178160c.removeAllViews();
                                String str3 = this.f178166i;
                                String str4 = this.f178167j;
                                String str5 = this.f178165h;
                                XFileSdk.ViewType viewType = XFileSdk.ViewType.ListView;
                                Context context = this.f178158a.getContext();
                                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                XFileSdk.readFile(str3, str4, str5, true, hashMap, viewType, (MMActivity) context, this.f178160c, new C62793ge(this), C12442he.f35820a);
                            }
                        }
                    }
                }
                mo87761a(this.f178161d);
            }
        }
    }
}
