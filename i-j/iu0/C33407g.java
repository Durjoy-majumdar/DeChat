package iu0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: iu0.g */
public final class C33407g {

    /* renamed from: a */
    public static final C33407g f90517a = new C33407g();

    /* renamed from: b */
    public static Boolean f90518b;

    /* renamed from: c */
    public static Boolean f90519c;

    /* renamed from: d */
    public static Boolean f90520d;

    /* renamed from: e */
    public static final C13601g f90521e = C36568h.m40985a(C33410c.f90532d);

    /* renamed from: f */
    public static final C13601g f90522f = C36568h.m40985a(C33413f.f90535d);

    /* renamed from: g */
    public static final C13601g f90523g = C36568h.m40985a(C33409b.f90531d);

    /* renamed from: h */
    public static final C13601g f90524h = C36568h.m40985a(C33412e.f90534d);

    /* renamed from: i */
    public static final C13601g f90525i = C36568h.m40985a(C33408a.f90530d);

    /* renamed from: j */
    public static final C13601g f90526j = C36568h.m40985a(C33411d.f90533d);

    /* renamed from: k */
    public static Boolean f90527k;

    /* renamed from: l */
    public static Boolean f90528l;

    /* renamed from: m */
    public static final boolean f90529m = true;

    /* renamed from: iu0.g$a */
    public static final class C33408a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33408a f90530d = new C33408a();

        public C33408a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: iu0.g$b */
    public static final class C33409b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33409b f90531d = new C33409b();

        public C33409b() {
            super(0);
        }

        public Object invoke() {
            boolean z = XWebSdk.isCurrentVersionSupportCustomInputForAppbrand() && XWebSdk.isXWebView();
            Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "xwebSupportInputSameLayer: " + z);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: iu0.g$c */
    public static final class C33410c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33410c f90532d = new C33410c();

        public C33410c() {
            super(0);
        }

        public Object invoke() {
            boolean z = XWebSdk.isCurrentVersionSupportCustomTextAreaForAppbrand() && XWebSdk.isXWebView();
            Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "xwebSupportTextAreaSameLayer: " + z);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: iu0.g$d */
    public static final class C33411d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33411d f90533d = new C33411d();

        public C33411d() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            boolean z2 = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand() && XWebSdk.isXWebView();
            StringBuilder sb = new StringBuilder();
            sb.append("useXWebCamera: abtest[");
            C33407g gVar = C33407g.f90517a;
            sb.append(gVar.mo59127a());
            sb.append("], isXWeb[");
            sb.append(XWebSdk.isXWebView());
            sb.append("], supper[");
            sb.append(z2);
            sb.append(']');
            Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb.toString());
            if (z2 && gVar.mo59127a()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: iu0.g$e */
    public static final class C33412e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33412e f90534d = new C33412e();

        public C33412e() {
            super(0);
        }

        public Object invoke() {
            boolean z;
            boolean z2 = true;
            try {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_use_xweb_input, 0) == 1) {
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("useXWebInput: abtest[");
                    sb.append(z);
                    sb.append("], isXWeb[");
                    sb.append(XWebSdk.isXWebView());
                    sb.append("], supper[");
                    C33407g gVar = C33407g.f90517a;
                    sb.append(gVar.mo59128b());
                    sb.append(']');
                    Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb.toString());
                    if (!z || !gVar.mo59128b()) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            } catch (Throwable unused) {
            }
            z = false;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("useXWebInput: abtest[");
            sb4.append(z);
            sb4.append("], isXWeb[");
            sb4.append(XWebSdk.isXWebView());
            sb4.append("], supper[");
            C33407g gVar2 = C33407g.f90517a;
            sb4.append(gVar2.mo59128b());
            sb4.append(']');
            Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb4.toString());
            z2 = false;
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: iu0.g$f */
    public static final class C33413f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33413f f90535d = new C33413f();

        public C33413f() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("useXWebTextArea: abtest[");
            sb.append(true);
            sb.append("], isXWeb[");
            sb.append(XWebSdk.isXWebView());
            sb.append("], supper[");
            C33407g gVar = C33407g.f90517a;
            sb.append(gVar.mo59129c());
            sb.append(']');
            Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb.toString());
            return Boolean.valueOf(gVar.mo59129c());
        }
    }

    /* renamed from: d */
    public static final boolean m40055d() {
        Boolean bool = f90520d;
        if (bool != null) {
            C87412m.m108591d(bool);
            return bool.booleanValue();
        }
        boolean isCurrentVersionSupportMapExtendPluginForAppbrand = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand();
        boolean isXWebView = XWebSdk.isXWebView();
        Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebMap: " + isCurrentVersionSupportMapExtendPluginForAppbrand + ", " + isXWebView);
        Boolean valueOf = Boolean.valueOf(isCurrentVersionSupportMapExtendPluginForAppbrand && isXWebView);
        f90520d = valueOf;
        C87412m.m108591d(valueOf);
        return valueOf.booleanValue();
    }

    /* renamed from: e */
    public static final boolean m40056e() {
        Boolean bool = f90528l;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_use_xweb_voip, 0) == 1;
        boolean isCurrentVersionSupportMapExtendPluginForAppbrand = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand();
        boolean isXWebView = XWebSdk.isXWebView();
        Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebVoipRoom: " + z2 + ", " + isCurrentVersionSupportMapExtendPluginForAppbrand + ", " + isXWebView);
        if (z2 && isCurrentVersionSupportMapExtendPluginForAppbrand && isXWebView) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f90528l = valueOf;
        C87412m.m108591d(valueOf);
        return valueOf.booleanValue();
    }

    /* renamed from: f */
    public static final boolean m40057f() {
        Boolean bool = f90527k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_use_xweb_webgl_canvas, 0) == 1;
        boolean isCurrentVersionSupportMapExtendPluginForAppbrand = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand();
        boolean isXWebView = XWebSdk.isXWebView();
        Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebWebGLCanvas: " + z2 + ", " + isCurrentVersionSupportMapExtendPluginForAppbrand + ", " + isXWebView);
        if (z2 && isCurrentVersionSupportMapExtendPluginForAppbrand && isXWebView) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f90527k = valueOf;
        C87412m.m108591d(valueOf);
        return valueOf.booleanValue();
    }

    /* renamed from: g */
    public static final boolean m40058g() {
        boolean z = true;
        if (BuildInfo.IS_FLAVOR_RED) {
            return true;
        }
        Boolean bool = f90519c;
        if (bool != null) {
            C87412m.m108591d(bool);
            return bool.booleanValue();
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_canvas_to_temp_file_path_use_new, 0) != 1) {
            z = false;
        }
        f90519c = Boolean.valueOf(z);
        Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useNewXWebCanvasToTFP:" + f90519c);
        Boolean bool2 = f90519c;
        C87412m.m108591d(bool2);
        return bool2.booleanValue();
    }

    /* renamed from: h */
    public static final boolean m40059h() {
        if (BuildInfo.IS_FLAVOR_RED) {
            return true;
        }
        Boolean bool = f90518b;
        if (bool != null) {
            C87412m.m108591d(bool);
            return bool.booleanValue();
        }
        f90518b = Boolean.TRUE;
        Log.m105924i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebCanvasRaf:" + f90518b);
        Boolean bool2 = f90518b;
        C87412m.m108591d(bool2);
        return bool2.booleanValue();
    }

    /* renamed from: a */
    public final boolean mo59127a() {
        return ((Boolean) ((C36570n) f90525i).getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo59128b() {
        return ((Boolean) ((C36570n) f90523g).getValue()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo59129c() {
        return ((Boolean) ((C36570n) f90521e).getValue()).booleanValue();
    }
}
