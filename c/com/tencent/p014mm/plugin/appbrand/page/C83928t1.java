package com.tencent.p014mm.plugin.appbrand.page;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br0.C39836d;
import br0.C79774c;
import bt0.C39842l;
import bt0.C79808b;
import bt0.C79811f;
import bt0.C79813g;
import bu0.C79837j;
import com.eclipsesource.mmv8.C80135V8;
import com.tencent.luggage.game.page.C80211b;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81822a;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.d0$$b;
import com.tencent.p014mm.plugin.appbrand.launching.C83515w2;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.menu.WxaMenuHelper;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85028b;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.ConstValue;
import cr0.C86127t;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import hi3.C87515a;
import iu0.C33407g;
import iu0.C87819h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C88020k;
import kg3.C76577a;
import kr0.C88267e;
import kr0.C88273g1;
import org.json.JSONObject;
import p1044ub.C90630c;
import p1044ub.c$$f;
import p194lc.C88453o;
import p194lc.C88470y;
import p547hb.C87464c;
import p849e3.C107168a0;
import p849e3.C107207u;
import p963fc.C86812g;
import qe3.C89625d;
import qq0.C89796d;
import qq0.C89797e;
import rx3.C36570n;
import wq0.C91057a;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1 */
public class C83928t1 extends C90630c {

    /* renamed from: a1 */
    public AppBrandRuntimeWC f245017a1;

    /* renamed from: b1 */
    public C88273g1 f245018b1;

    /* renamed from: c1 */
    public AppBrandRecentView f245019c1;

    /* renamed from: d1 */
    public C39842l f245020d1;

    /* renamed from: e1 */
    public List<C83699y> f245021e1;

    /* renamed from: f1 */
    public final AtomicBoolean f245022f1;

    /* renamed from: g1 */
    public C83845l0 f245023g1;

    /* renamed from: h1 */
    public C83790e2 f245024h1;

    /* renamed from: i1 */
    public C79813g f245025i1;

    /* renamed from: j1 */
    public final Object f245026j1;

    /* renamed from: k1 */
    public volatile C1948j4 f245027k1;

    /* renamed from: l1 */
    public final C84213o[] f245028l1;

    /* renamed from: m1 */
    public final LinkedList<C40478h> f245029m1;

    /* renamed from: n1 */
    public Boolean f245030n1;

    /* renamed from: o1 */
    public final C86127t f245031o1;

    public C83928t1() {
        this(C83910s1.class);
    }

    /* renamed from: G1 */
    public void mo115898G1() {
        if (getRuntime().mo113194Y1()) {
            mo116527O1();
        } else {
            super.mo115898G1();
        }
        if (C84905f.m104620a(this.f245017a1) || C83608m4.m102642a(getRuntime())) {
            this.f244554F.mo109949q(true);
        }
    }

    /* renamed from: I1 */
    public C91304m mo116520A1() {
        try {
            ViewGroup viewGroup = this.f244552D;
            Objects.requireNonNull(viewGroup);
            View findViewById = viewGroup.findViewById(C0966R.C0970id.f5956ta);
            if (findViewById instanceof C91304m) {
                return (C91304m) findViewById;
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    /* renamed from: J1 */
    public AppBrandRuntimeWC getRuntime() {
        return (AppBrandRuntimeWC) ((C86812g) this.f244549A);
    }

    /* renamed from: K1 */
    public C88267e mo116160O0() {
        return (C88267e) super.mo116160O0();
    }

    /* renamed from: L1 */
    public final C1948j4 mo116524L1() {
        if (this.f245027k1 == null) {
            if (getRuntime() == null) {
                return null;
            }
            synchronized (this.f245026j1) {
                if (this.f245027k1 == null) {
                    this.f245027k1 = new C1948j4(this);
                }
            }
        }
        return this.f245027k1;
    }

    /* renamed from: M1 */
    public C40502j2 mo116525M1() {
        if (mo116158M0() instanceof C83910s1) {
            return ((C83910s1) mo116158M0()).mo116495D0();
        }
        return null;
    }

    /* renamed from: N0 */
    public Bitmap mo116159N0() {
        Bitmap c;
        C87464c cVar = (C87464c) mo116150E0(C87464c.class);
        if (cVar == null) {
            return super.mo116159N0();
        }
        try {
            c = cVar.mo111251c().getMagicBrush().f235098n.mo123494c();
            if (c != null) {
                FrameLayout frameLayout = this.f244555G;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145208c(frameLayout) && (c.getWidth() < this.f244555G.getWidth() || c.getHeight() < this.f244555G.getHeight())) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(c, this.f244555G.getWidth(), this.f244555G.getHeight(), false);
                    c.recycle();
                    return createScaledBitmap;
                }
            }
            return c;
        } catch (NullPointerException | OutOfMemoryError e) {
            Log.printErrStackTrace("MicroMsg.AppBrandPageViewWC", e, "hy: exception in get snapshot", new Object[0]);
            return null;
        } catch (Throwable th) {
            c.recycle();
            throw th;
        }
    }

    /* renamed from: N1 */
    public final C84213o mo116526N1(boolean z) {
        C84213o[] oVarArr = this.f245028l1;
        if (oVarArr[0] == null) {
            synchronized (oVarArr) {
                C84213o[] oVarArr2 = this.f245028l1;
                if (oVarArr2[0] == null) {
                    if (!z) {
                        return null;
                    }
                    oVarArr2[0] = new C84213o(this);
                }
            }
        }
        return this.f245028l1[0];
    }

    /* renamed from: O1 */
    public final void mo116527O1() {
        HalfScreenConfig halfScreenConfig = getRuntime().mo113210l1().f234815R0;
        if (!halfScreenConfig.mo76931c() || halfScreenConfig.f157930A || getRuntime().mo113212m1().getPageCount() != 1) {
            this.f244554F.setNavHidden(false);
        } else {
            this.f244554F.setNavHidden(true);
        }
    }

    /* renamed from: P */
    public String mo114845P(String str, String str2, String str3, int i, boolean z, C40482o oVar) {
        C91057a aVar = this.f241588j instanceof C91057a ? (C91057a) this.f241588j : null;
        boolean z2 = aVar != null && aVar.mo125124h(str, i);
        try {
            return super.mo114845P(str, str2, str3, i, z, oVar);
        } finally {
            if (z2) {
                aVar.mo125123g(str, i);
            }
        }
    }

    /* renamed from: P1 */
    public final void mo116528P1(Context context) {
        C83745a<PAGE>.h hVar;
        C79811f fVar = this.f244553E;
        if (fVar != null) {
            fVar.mo109972S(context);
        }
        C79808b bVar = this.f244554F;
        if (bVar != null && (bVar.getContext() instanceof MutableContextWrapper)) {
            ((MutableContextWrapper) this.f244554F.getContext()).setBaseContext(context);
        }
        if ((mo116158M0() instanceof C83745a) && (hVar = ((C83745a) mo116158M0()).f244463s) != null) {
            hVar.setBaseContext(context);
        }
        if (mo116158M0() instanceof C80211b) {
            C80211b bVar2 = (C80211b) mo116158M0();
            if (bVar2.f234768f != null) {
                Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
                if (castActivityOrNull != null) {
                    bVar2.f234768f.f234759e = castActivityOrNull;
                } else {
                    bVar2.f234768f.f234759e = null;
                }
            }
        }
        C83797e3 e3Var = this.f244558J;
        if (e3Var != null) {
            e3Var.mo63312f(context);
        }
        C91304m I1 = mo116520A1();
        if (I1 != null) {
            I1.mo63232f(context);
        }
        Iterator<C40478h> it = this.f245029m1.iterator();
        while (it.hasNext()) {
            it.next().mo63232f(context);
        }
    }

    /* renamed from: Q1 */
    public final void mo116529Q1() {
        C83873p2 customViewContainer;
        C83905r1 M0 = mo116158M0();
        if (!(M0 == null || (customViewContainer = M0.getCustomViewContainer()) == null)) {
            C39836d F0 = mo116151F0();
            customViewContainer.f244874h = F0;
            F0.mo62473a(new C83863o2(customViewContainer));
        }
        C83797e3 e3Var = this.f244558J;
        if (e3Var != null) {
            e3Var.setFullscreenImpl(mo116151F0());
        }
    }

    /* renamed from: R1 */
    public void mo116530R1() {
        boolean z;
        String str;
        C79808b bVar = this.f244554F;
        if (bVar != null) {
            bVar.setVisibility(4);
            this.f244554F.mo109614d(false);
            this.f244554F.mo109949q(false);
            if (!this.f244554F.f233903v) {
                str = "squeezed";
            } else {
                str = getRuntime().mo113008F().mo113984c(mo116162Q0()).f239665o.f239632a;
                if (Util.isNullOrNil(str)) {
                    str = getRuntime().mo113008F().mo113982a().f239665o.f239632a;
                }
                if (Util.isNullOrNil(str)) {
                    str = "float";
                }
            }
            mo116208z0(!"squeezed".equals(str));
            this.f244554F.setFullscreenMode(false);
        }
        if (this.f245025i1 == null) {
            String str2 = getRuntime().mo113008F().mo113984c(mo116162Q0()).f239665o.f239635d;
            if (Util.isNullOrNil(str2)) {
                if (this.f245030n1 == null) {
                    this.f245030n1 = Boolean.valueOf(C85875k4.m106211z());
                }
                z = this.f245030n1.booleanValue();
            } else {
                z = !"BLACK".equalsIgnoreCase(str2);
            }
            boolean z2 = z || getRuntime().mo121254q1();
            C79813g gVar = new C79813g(getContext());
            this.f245025i1 = gVar;
            int i = -1;
            this.f244553E.addView(gVar, new ViewGroup.LayoutParams(-1, -1));
            this.f244553E.setStatusBarForegroundStyle(z2);
            C79813g gVar2 = this.f245025i1;
            gVar2.setBackgroundColor(z2 ? gVar2.getContext().getResources().getColor(C0966R.color.f3085ev) : gVar2.getContext().getResources().getColor(C0966R.color.f3086ew));
            gVar2.setForegroundColor(z2 ? -1 : -16777216);
            gVar2.f233929f.f233360a.setImageDrawable(C87515a.m108835e(gVar2.getContext().getResources(), z2 ? C0966R.raw.actionbar_icon_light_close : C0966R.raw.actionbar_icon_dark_close, 0.0f));
            gVar2.f233929f.f233364e.setImageDrawable(C87515a.m108835e(gVar2.getContext().getResources(), z2 ? C0966R.raw.actionbar_icon_light_more : C0966R.raw.actionbar_icon_dark_more, 0.0f));
            TextView textView = gVar2.f233929f.f233367h;
            if (!z2) {
                i = -16777216;
            }
            textView.setTextColor(i);
            this.f245025i1.setOptionButtonClickListener(new t1$$d(this));
            this.f245025i1.setCloseButtonClickListener(new t1$$e(this));
            C79808b bVar2 = this.f244554F;
            if (bVar2 != null) {
                this.f245025i1.setMainTitle(bVar2.getMainTitle());
            }
            if (getRuntime().mo113210l1().f234819T0 != 0) {
                if (getRuntime().mo113213o1() != null) {
                    String str3 = getRuntime().mo113213o1().f234859D;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = C83515w2.f243993G;
                    String str4 = null;
                    if (!Util.isNullOrNil(str3)) {
                        try {
                            str4 = new JSONObject(str3).getJSONObject("op_info").getString("singlepage_tips");
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.AppBrand.LaunchWxaAppInfo", "parseActionBarSecurityTipsWording e:%s", e);
                        }
                    }
                    if (!Util.isNullOrNil(str4)) {
                        this.f245025i1.setSecurityTipsTitle(str4);
                    }
                }
                if ((getRuntime().mo113210l1().f234819T0 & 2) == 2) {
                    C79813g gVar3 = this.f245025i1;
                    gVar3.f233929f.f233368i.setVisibility(8);
                    gVar3.f233929f.f233366g.setVisibility(0);
                    gVar3.f233929f.f233361b.setVisibility(0);
                    gVar3.f233929f.f233365f.getLayoutParams().height = gVar3.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4059q5);
                } else {
                    C79813g gVar4 = this.f245025i1;
                    gVar4.f233929f.f233368i.setVisibility(8);
                    gVar4.f233929f.f233366g.setVisibility(0);
                    gVar4.f233929f.f233361b.setVisibility(8);
                    gVar4.f233929f.f233365f.getLayoutParams().height = gVar4.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4058q4);
                }
                this.f245025i1.setForwardOnClickListener(new t1$$f(this));
                String str5 = this.f245017a1.mo113213o1().f234888v;
                if (Util.isNullOrNil(str5)) {
                    str5 = this.f245017a1.mo113177I1();
                    if (str5.length() > 5) {
                        str5 = String.format("%s...", new Object[]{str5.substring(0, 4)});
                    }
                }
                this.f245025i1.setForwardText(getContext().getString(C0966R.string.f360128a93, new Object[]{str5}));
                return;
            }
            C81634a.C81642h hVar = getRuntime().mo113008F().mo113984c(mo116162Q0()).f239665o;
            String str6 = hVar.f239633b;
            if (!Util.isNullOrNil(str6)) {
                try {
                    this.f245025i1.setBackgroundColor(C88020k.m109562m(str6));
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.AppBrandPageViewWC", "decorateSinglePageModeNavigationBarFromPageConfig color parse error");
                }
            }
            double d = hVar.f239634c;
            if (d >= 0.0d) {
                this.f245025i1.setBackgroundAlpha(d);
            }
            String str7 = hVar.f239636e;
            if (!Util.isNullOrNil(str7)) {
                this.f245025i1.setMainTitle(str7);
            }
        }
    }

    /* renamed from: S1 */
    public void mo115900S1() {
        Class cls = C85028b.class;
        if (((C85028b) C86312j.m106911c(cls)).d80() && !getRuntime().mo113194Y1()) {
            try {
                this.f245019c1 = ((C85028b) C86312j.m106911c(cls)).bd0(getContext(), C85028b.C29705b.TYPE_MENU, new t1$$k(this));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandPageViewWC", e, "appId[%s]", getAppId());
            }
            if (this.f245019c1 != null) {
                C39842l lVar = new C39842l(getContext());
                this.f245020d1 = lVar;
                lVar.setWidth(-1);
                this.f245020d1.setBackgroundDrawable(new ColorDrawable());
                this.f245019c1.mo117963x1();
                this.f245020d1.setHeight(this.f245019c1.getLayoutParams().height);
                this.f245019c1.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.f4441cq));
                this.f245020d1.setContentView(this.f245019c1);
                this.f245019c1.setOnItemClickListener(new t1$$l(this));
            }
        }
    }

    /* renamed from: T0 */
    public void mo116165T0() {
        super.mo116165T0();
        if (this.f244558J != null && this.f244560L != null) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f245017a1;
            C84240s.m103841g(appBrandRuntimeWC == null ? "" : appBrandRuntimeWC.f238147j, mo116162Q0(), 2);
        }
    }

    /* renamed from: U */
    public void mo114849U() {
        if (C83155d0.m102047e(this) && !mo116168W0()) {
            Log.m105924i("MicroMsg.AppBrandPageViewWC", "page initNativeTransLogic");
            if (C87819h.f254224a) {
                Log.m105924i("MicroMsg.XWebNativeTransInitLogic", "bind already");
            } else {
                Log.m105924i("MicroMsg.XWebNativeTransInitLogic", "bind");
                C80658e.m98344a();
                XWebSdk.bindNativeTrans(C80135V8.getNativeTransManager());
                C87819h.f254224a = true;
            }
            C83165i jsRuntime = getJsRuntime();
            int componentId = getComponentId();
            String appId = getAppId();
            Log.m105925i("Luggage.NativeTransLogic", "enableXwebNativeTrans componentId:%s ,appId:%s , stack:%s", Integer.valueOf(componentId), appId, android.util.Log.getStackTraceString(new Throwable()));
            jsRuntime.evaluateJavascript("xweb.enableNativeTrans()", (ValueCallback<String>) null);
            jsRuntime.evaluateJavascript(";(function(){ return typeof ntrans })();", new d0$$b(componentId, appId));
            C83155d0.m102043a(getJsRuntime(), getComponentId(), getAppId());
        }
    }

    /* renamed from: U0 */
    public void mo116166U0(Context context, AppBrandRuntime appBrandRuntime) {
        Log.m105924i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| init start");
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
        this.f245017a1 = appBrandRuntimeWC;
        if (mo114272k() == null) {
            mo114269d0(appBrandRuntimeWC.mo113184O1(false));
        }
        super.mo116166U0(context, appBrandRuntime);
        this.f244554F.setCloseButtonClickListener(new t1$$h(this));
        if (appBrandRuntime.f238127U0 && ((AppBrandRuntimeWC) appBrandRuntime).mo113194Y1()) {
            this.f244554F.setNavButtonLongClickListener(new t1$$i(this));
        }
        this.f241588j = new C91057a((AppBrandRuntimeWC) appBrandRuntime, this);
        mo114864j(new t1$$a(this));
        mo116272g0(new t1$$b(this));
        Log.m105924i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| init end");
    }

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        super.mo114331W(jSONObject);
        mo114881c0(jSONObject, ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, Integer.valueOf(C89625d.f257841g));
        C33407g gVar = C33407g.f90517a;
        C81822a.m100417a(jSONObject, "useXWebVideo", Boolean.TRUE);
        C81822a.m100417a(jSONObject, "XWebVideoMinVersion", 300);
        C81822a.m100417a(jSONObject, "supportXWebTouch", Boolean.valueOf(XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand()));
        C81822a.m100417a(jSONObject, "useXWebMap", Boolean.valueOf(C33407g.m40055d()));
        boolean isCurrentVersionSupportMapExtendPluginForAppbrand = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand();
        Log.m105925i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering for Live:%b", Boolean.valueOf(isCurrentVersionSupportMapExtendPluginForAppbrand));
        C81822a.m100417a(jSONObject, "useXWebLive", Boolean.valueOf(isCurrentVersionSupportMapExtendPluginForAppbrand));
        C33407g gVar2 = C33407g.f90517a;
        C81822a.m100417a(jSONObject, "abtestXWebCameraEnable", Boolean.valueOf(gVar2.mo59127a()));
        C81822a.m100417a(jSONObject, "useXWebCamera", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90526j).getValue()).booleanValue()));
        C81822a.m100417a(jSONObject, "useXWebTextarea", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90522f).getValue()).booleanValue()));
        C81822a.m100417a(jSONObject, "supportXWebTextarea", Boolean.valueOf(gVar2.mo59129c()));
        C81822a.m100417a(jSONObject, "useXWebInput", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90524h).getValue()).booleanValue()));
        C81822a.m100417a(jSONObject, "supportXWebInput", Boolean.valueOf(gVar2.mo59128b()));
        C81822a.m100417a(jSONObject, "useXWebVoipRoom", Boolean.valueOf(C33407g.m40056e()));
        mo114881c0(jSONObject, "useXWebWebGLCanvas", Boolean.valueOf(C33407g.m40057f()));
        mo114881c0(jSONObject, "useSkiaCanvasRaf", Boolean.valueOf(C33407g.m40059h()));
        mo114881c0(jSONObject, "useNewXWebCanvasToTFP", Boolean.valueOf(C33407g.m40058g()));
    }

    /* renamed from: W0 */
    public final boolean mo116168W0() {
        return mo116158M0() instanceof C88453o;
    }

    /* renamed from: X0 */
    public final boolean mo116169X0(long j, String str, C83817h4 h4Var) {
        Log.m105925i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| loadURL appId:%s, url:%s, stack:%s", getAppId(), str, android.util.Log.getStackTraceString(new Throwable()));
        mo116203w1(getRuntime().mo113054f0());
        return super.mo116169X0(j, str, h4Var);
    }

    /* renamed from: Y0 */
    public boolean mo116170Y0() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245017a1;
        if (appBrandRuntimeWC == null || !C83608m4.m102642a(appBrandRuntimeWC)) {
            return super.mo116170Y0();
        }
        Log.m105924i("MicroMsg.AppBrandPageViewWC", "SinglePageModeLogic onBackPressed");
        C83231l.m102146g(getAppId(), C83231l.C83235e.BACK);
        this.f245017a1.mo113063k();
        return true;
    }

    /* renamed from: a1 */
    public final View mo116172a1() {
        return mo116173b1(getContext());
    }

    /* renamed from: b1 */
    public View mo116173b1(Context context) {
        if (C83608m4.m102642a(getRuntime())) {
            return null;
        }
        AppBrandMenuHeader appBrandMenuHeader = new AppBrandMenuHeader(context);
        appBrandMenuHeader.setPage(this);
        return appBrandMenuHeader;
    }

    /* renamed from: f1 */
    public final boolean mo116177f1(View view, Runnable runnable) {
        if (!this.f244578Y) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(view) || getRuntime() == null || !getRuntime().mo121251g1()) {
            return false;
        }
        MMHandlerThread.postToMainThread(runnable);
        return true;
    }

    /* renamed from: g1 */
    public final boolean mo116179g1(View view, Runnable runnable, long j) {
        if (!this.f244578Y) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(view) || getRuntime() == null || !getRuntime().mo121251g1()) {
            return false;
        }
        MMHandlerThread.postToMainThreadDelayed(runnable, j);
        return true;
    }

    /* renamed from: i1 */
    public void mo116181i1(List<C83699y> list, Runnable runnable, Runnable runnable2) {
        C83845l0 l0Var = this.f245023g1;
        if (l0Var != null) {
            l0Var.mo116321e();
        }
        C83845l0 l0Var2 = new C83845l0(this, list);
        this.f245023g1 = l0Var2;
        if (runnable != null) {
            ((HashSet) l0Var2.f244706i).add(runnable);
        }
        C83845l0 l0Var3 = this.f245023g1;
        ((HashSet) l0Var3.f244707j).add(new t1$$c(this, runnable2));
        this.f245023g1.mo116324n();
    }

    /* renamed from: j1 */
    public void mo115902j1() {
        mo116203w1((C79774c) null);
        super.mo115902j1();
        AppBrandRecentView appBrandRecentView = this.f245019c1;
        if (appBrandRecentView != null) {
            appBrandRecentView.mo117964y1();
        }
        C39842l lVar = this.f245020d1;
        if (lVar != null) {
            lVar.dismiss();
            FrameLayout frameLayout = lVar.f106859d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                lVar.f106859d = null;
            }
        }
        this.f245023g1 = null;
        this.f245029m1.clear();
    }

    /* renamed from: k1 */
    public void mo116182k1() {
        C39842l lVar = this.f245020d1;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    /* renamed from: l1 */
    public void mo116183l1() {
        this.f244561M = false;
        synchronized (C83938t4.f245069a) {
            if (C83938t4.f245070b) {
                Log.m105924i("MicroMsg.StatisticsPageView", "removePageView " + this);
                C83938t4.f245071c.remove(this);
            }
        }
        synchronized (this.f245026j1) {
            if (this.f245027k1 != null) {
                this.f245027k1.f11843b.removeCallbacksAndMessages((Object) null);
            }
        }
    }

    /* renamed from: m1 */
    public void mo116184m1() {
        C89797e eVar = getRuntime().f238159x;
        C83959w1 w1Var = new C83959w1(this);
        C89796d dVar = eVar.f258188c;
        if (dVar != null) {
            dVar.getCapsuleHomeButton().setOnLongClickListener(w1Var);
        } else {
            C87412m.m108603p("capsuleBarView");
            throw null;
        }
    }

    /* renamed from: n0 */
    public void mo116185n0() {
        super.mo116185n0();
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245017a1;
        C84240s.m103841g(appBrandRuntimeWC == null ? "" : appBrandRuntimeWC.f238147j, mo116162Q0(), 1);
    }

    /* renamed from: n1 */
    public void mo116186n1() {
        if (mo114272k().compareTo(getRuntime().mo113184O1(false)) != 0) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "onPageReady appId[%s] mismatch libReader, self[%s] runtime[%s]", new Object[]{getAppId(), mo114272k().mo113377i(), getRuntime().mo113184O1(false).mo113377i()}));
        }
    }

    /* renamed from: o0 */
    public void mo115903o0(C83817h4 h4Var) {
        super.mo115903o0(h4Var);
        C81634a.C81639e L0 = mo116157L0();
        boolean a = getRuntime().f251968f1.mo125128a(this, c$$f.class);
        mo116193r1(!L0.f239656f || !a);
        if (!a || !L0.f239656f || getRuntime().mo113210l1().f234841u != 7 || this.f244554F.f233903v) {
            Log.m105924i("MicroMsg.AppBrandPageViewWC", "hasPermission:" + a + " navigationBarRightButtonHide:" + L0.f239656f + " appServiceType:" + getRuntime().mo113210l1().f234841u + " isFullscreenMode:" + this.f244554F.f233903v);
        } else {
            C79837j jVar = new C79837j(L0.f239655e, new C83969x1(this));
            jVar.f233993f = new C83975y1(this);
            jVar.mo110025b();
        }
        if (C83608m4.m102642a(getRuntime())) {
            mo116275j0(new C83940u1(this));
        } else if (C84905f.m104620a(getRuntime())) {
            mo116275j0(new C83952v1(this));
        } else if (getRuntime() != null && getRuntime().mo113194Y1()) {
            mo116527O1();
        }
        getRuntime().f238298z1.mo117797t(this, h4Var);
    }

    /* renamed from: p1 */
    public void mo116189p1(boolean z) {
        C88470y E0;
        if (mo116168W0() && (E0 = ((C88453o) mo116158M0()).mo116543B0()) != null) {
            SkylineView skylineView = E0.f255554h;
            C87412m.m108591d(skylineView);
            skylineView.mo111445l(z);
        }
    }

    /* renamed from: r0 */
    public C83799f mo116192r0() {
        return new C83805g(this);
    }

    /* renamed from: s0 */
    public final List<C83699y> mo116194s0() {
        if (C83608m4.m102642a(getRuntime())) {
            boolean q1 = getRuntime().mo121254q1();
            int i = getRuntime().mo113210l1().f234819T0;
            LinkedList linkedList = new LinkedList();
            if (i != 0) {
                WxaMenuHelper.m102685a(linkedList, 13, true, false);
                WxaMenuHelper.m102685a(linkedList, 24, true, false);
                WxaMenuHelper.m102685a(linkedList, 33, true, false);
            } else {
                WxaMenuHelper.m102685a(linkedList, 3, true, true);
                WxaMenuHelper.m102685a(linkedList, 4, true, true);
                WxaMenuHelper.m102685a(linkedList, 28, true, false);
                WxaMenuHelper.m102685a(linkedList, 31, true, true);
                WxaMenuHelper.m102685a(linkedList, 13, false, false);
                WxaMenuHelper.m102685a(linkedList, 24, false, false);
                WxaMenuHelper.m102685a(linkedList, 33, false, false);
                if (q1) {
                    WxaMenuHelper.m102685a(linkedList, 25, false, false);
                }
            }
            this.f245021e1 = linkedList;
            return linkedList;
        }
        String appId = getAppId();
        LinkedList linkedList2 = new LinkedList();
        WxaMenuHelper.m102685a(linkedList2, 3, true, true);
        WxaMenuHelper.m102685a(linkedList2, 4, true, true);
        WxaMenuHelper.m102685a(linkedList2, 28, true, false);
        WxaMenuHelper.m102685a(linkedList2, 12, true, false);
        WxaMenuHelper.m102685a(linkedList2, 32, true, false);
        AppBrandSysConfigWC e = C81682d.m100225e(appId);
        WxaMenuHelper.m102685a(linkedList2, 11, true, !CrashReportFactory.hasDebuger() && (e == null || e.f261072r.f238585d == 1));
        WxaMenuHelper.m102685a(linkedList2, 29, true, false);
        WxaMenuHelper.m102685a(linkedList2, 31, true, true);
        WxaMenuHelper.m102685a(linkedList2, 0, false, false);
        WxaMenuHelper.m102685a(linkedList2, 2, false, false);
        WxaMenuHelper.m102685a(linkedList2, 22, false, false);
        WxaMenuHelper.m102685a(linkedList2, 23, false, false);
        WxaMenuHelper.m102685a(linkedList2, 10, false, false);
        WxaMenuHelper.m102685a(linkedList2, 24, false, false);
        WxaMenuHelper.m102685a(linkedList2, 33, false, false);
        WxaMenuHelper.m102685a(linkedList2, 27, false, false);
        WxaMenuHelper.m102685a(linkedList2, 30, false, false);
        WxaMenuHelper.m102685a(linkedList2, 25, false, false);
        WxaMenuHelper.m102685a(linkedList2, 26, false, false);
        this.f245021e1 = linkedList2;
        return linkedList2;
    }

    /* renamed from: t0 */
    public View mo116196t0(ViewGroup viewGroup) {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245017a1;
        if (appBrandRuntimeWC == null || !C83608m4.m102642a(appBrandRuntimeWC) || !(viewGroup instanceof RelativeLayout) || this.f245017a1.mo113210l1().f234819T0 != 0) {
            return null;
        }
        if (this.f245024h1 == null) {
            this.f245024h1 = new C83790e2(this.f245017a1.f238141d);
        }
        this.f245024h1.setJumpBtnOnClickListener(new t1$$j(this));
        C83790e2 e2Var = this.f245024h1;
        String str = this.f245017a1.mo113210l1().f239364f;
        String str2 = this.f245017a1.mo113210l1().f239363e;
        String a = C81243g.m99551a(this.f245017a1.mo113213o1().f261072r.f238585d);
        boolean k = this.f245017a1.mo113210l1().mo111300k();
        boolean z = this.f245017a1.mo113210l1().f239368j == 1;
        e2Var.getClass();
        C87412m.m108594g(str, "iconUrl");
        C87412m.m108594g(str2, "name");
        C87412m.m108594g(a, "debugTypeDesc");
        e2Var.mo116259b(true, str, str2, a, k, z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.topMargin = -getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4122t2);
        viewGroup.addView(this.f245024h1, layoutParams);
        return this.f245024h1;
    }

    /* renamed from: w1 */
    public final void mo116203w1(C79774c cVar) {
        if (cVar == null) {
            Application application = C86709a0.m107531m().mo58407a().f124990c;
            C86127t tVar = this.f245031o1;
            if (tVar.f250648d != application || tVar != this.f244577X) {
                long currentTicks = Util.currentTicks();
                this.f245031o1.mo120546A(application);
                super.mo116203w1(this.f245031o1);
                mo116528P1(application);
                mo116529Q1();
                Log.m105929w("MicroMsg.AppBrandPageViewWC", "setWindowAndroid, impl==null, appId:%s, url:%s, isRunning:%b, cost:%dms", getAppId(), mo116162Q0(), Boolean.valueOf(isRunning()), Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        } else if (cVar.compareTo(this.f244577X) != 0) {
            long currentTicks2 = Util.currentTicks();
            super.mo116203w1(cVar);
            if (!(getRuntime() == null || getRuntime().mo113026R() == null)) {
                mo116528P1(getRuntime().mo113026R());
            }
            mo116529Q1();
            Log.m105925i("MicroMsg.AppBrandPageViewWC", "setWindowAndroid changed, old:%s, new:%s, appId:%s, url:%s, cost:%dms, stack:%s", this.f244577X, cVar, getAppId(), mo116162Q0(), Long.valueOf(Util.ticksToNow(currentTicks2)), android.util.Log.getStackTraceString(new Throwable()));
        }
    }

    public C83928t1(Class<? extends C83905r1> cls) {
        super(cls, new t1$$g());
        boolean z = false;
        this.f245022f1 = new AtomicBoolean(false);
        this.f245025i1 = null;
        this.f245026j1 = new byte[0];
        this.f245028l1 = new C84213o[]{null};
        this.f245029m1 = new LinkedList<>();
        this.f245031o1 = new C86127t();
        synchronized (C83938t4.f245069a) {
            if (C83938t4.f245070b) {
                Log.m105924i("MicroMsg.StatisticsPageView", "addPageView " + this);
                C83938t4.f245071c.add(this);
            }
        }
        this.f241593r = (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) ? true : z;
    }
}
