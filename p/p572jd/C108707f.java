package p572jd;

import android.os.ResultReceiver;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import android.widget.EditText;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.page.C40525w2;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68698a1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68717h1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.XWebExtendInputClient;
import com.tencent.xweb.XWebExtendInterface;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import rt0.C110653f;
import rt0.C90097c;
import rt0.C90098e;
import rx3.C13598b0;

/* renamed from: jd.f */
public final class C108707f extends XWebExtendInputClient {

    /* renamed from: a */
    public final XWebExtendInterface f325551a;

    /* renamed from: b */
    public final String f325552b = "WebViewExtendInputClient";

    /* renamed from: c */
    public final long f325553c = 250;

    /* renamed from: d */
    public final boolean f325554d;

    /* renamed from: e */
    public C40525w2 f325555e;

    /* renamed from: f */
    public C84967l0 f325556f;

    /* renamed from: g */
    public C108706d f325557g;

    /* renamed from: h */
    public EditText f325558h;

    /* renamed from: i */
    public int f325559i;

    /* renamed from: j */
    public int f325560j;

    /* renamed from: k */
    public boolean f325561k;

    /* renamed from: l */
    public boolean f325562l;

    /* renamed from: m */
    public Integer f325563m;

    /* renamed from: n */
    public String f325564n;

    /* renamed from: o */
    public boolean f325565o;

    /* renamed from: p */
    public int f325566p;

    /* renamed from: q */
    public boolean f325567q;

    /* renamed from: r */
    public String f325568r;

    /* renamed from: s */
    public int f325569s;

    /* renamed from: t */
    public final C82540i0 f325570t;

    /* renamed from: u */
    public final C84967l0.C84970c f325571u;

    /* renamed from: jd.f$d */
    public static final class C87950d extends C87413o implements C32229r<String, Integer, String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108707f f254517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87950d(C108707f fVar) {
            super(4);
            this.f254517d = fVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            C87412m.m108594g(str, "value");
            C108707f fVar = this.f254517d;
            fVar.getClass();
            JSONObject put = new JSONObject().put("value", str).put("keyCode", str.length() > 0 ? str.charAt(str.length() - 1) : 0).put("cursor", intValue);
            C87412m.m108593f(put, "JSONObject().put(\"value\"…ut(\"cursor\", cursorIndex)");
            if (str2 != null) {
                put.put("encryptedValue", str2);
            }
            if (str3 != null) {
                put.put("encryptError", str3);
            }
            String jSONObject = put.toString();
            C87412m.m108593f(jSONObject, "eventDataObj.toString()");
            fVar.evaluateJavascript("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardcomplete){            focusElement.onkeyboardcomplete(" + jSONObject + ");        }        focusElement.blur();    }})();", C33537g.f90796a);
            this.f254517d.onKeyboardHeightChanged(true, 0, false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jd.f$a */
    public static final class C108708a {

        /* renamed from: a */
        public String f325572a = "";

        /* renamed from: b */
        public boolean f325573b;

        /* renamed from: c */
        public boolean f325574c;

        /* renamed from: d */
        public C110653f f325575d = new C110653f();

        /* renamed from: e */
        public boolean f325576e;

        public C108708a(String str) {
            JSONObject jSONObject;
            String str2 = str;
            String str3 = "TextAreaInfo get confirm-hold error";
            C87412m.m108594g(str2, "json");
            StringBuilder sb = new StringBuilder();
            String str4 = "confirm-hold";
            sb.append("totalInfo:");
            sb.append(str2);
            Log.m105924i("TextAreaInfo", sb.toString());
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception unused) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo convert to json error");
                jSONObject = new JSONObject();
            }
            try {
                if (jSONObject.has("element-tag")) {
                    jSONObject.getString("element-tag");
                }
            } catch (JSONException unused2) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo add elementTag error");
            }
            try {
                if (jSONObject.has("keyboard-type")) {
                    String string = jSONObject.getString("keyboard-type");
                    C87412m.m108593f(string, "jsonObject.getString(\"keyboard-type\")");
                    this.f325572a = string;
                    this.f325575d.f331018R = string;
                }
            } catch (JSONException unused3) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo add keyboardType error");
            }
            try {
                if (jSONObject.has("cursor-spacing")) {
                    this.f325575d.f331054y = Integer.valueOf(C88020k.m109561l(jSONObject, "cursor-spacing"));
                }
            } catch (JSONException unused4) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
            } catch (NumberFormatException unused5) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            } catch (Exception unused6) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            }
            try {
                if (jSONObject.has("adjust-position")) {
                    this.f325575d.f331026B = Boolean.valueOf(Util.getBoolean(jSONObject.getString("adjust-position"), true));
                }
            } catch (JSONException unused7) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            } catch (Exception unused8) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            }
            try {
                if (jSONObject.has("show-confirm-bar")) {
                    this.f325573b = Util.getBoolean(jSONObject.getString("show-confirm-bar"), false);
                }
            } catch (JSONException unused9) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            } catch (Exception unused10) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            }
            try {
                if (jSONObject.has("password")) {
                    Util.getBoolean(jSONObject.getString("password"), false);
                }
            } catch (JSONException unused11) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            } catch (Exception unused12) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            }
            try {
                if (jSONObject.has("show-cover-view")) {
                    this.f325574c = Util.getBoolean(jSONObject.getString("show-cover-view"), false);
                }
            } catch (JSONException unused13) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            } catch (Exception unused14) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            }
            String str5 = str4;
            try {
                if (jSONObject.has(str5)) {
                    this.f325576e = Util.getBoolean(jSONObject.getString(str5), false);
                }
            } catch (JSONException unused15) {
                Log.m105920e("TextAreaInfo", str3);
            } catch (Exception unused16) {
                Log.m105920e("TextAreaInfo", str3);
            }
            C68711c2.m80984d(jSONObject, this.f325575d);
            C68709b1.m80982d(jSONObject, this.f325575d);
        }
    }

    /* renamed from: jd.f$b */
    public static final class C108709b<T> implements ValueCallback {

        /* renamed from: a */
        public static final C108709b<T> f325577a = new C108709b<>();

        public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
        }
    }

    /* renamed from: jd.f$c */
    public static final class C108710c implements C84983t0.C84990i {

        /* renamed from: a */
        public final /* synthetic */ C108706d f325578a;

        /* renamed from: b */
        public final /* synthetic */ C108707f f325579b;

        public C108710c(C108706d dVar, C108707f fVar) {
            this.f325578a = dVar;
            this.f325579b = fVar;
        }

        /* renamed from: a */
        public void mo117899a(int i) {
            int b = this.f325578a.mo159731b();
            int i2 = i - b;
            boolean z = true;
            Log.m105925i(this.f325579b.f325552b, "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", Integer.valueOf(i), Integer.valueOf(this.f325579b.f325559i), Integer.valueOf(b));
            C108707f fVar = this.f325579b;
            if (fVar.f325559i != b) {
                fVar.f325559i = b;
                fVar.f325560j = i;
                if (i2 <= 0) {
                    z = false;
                }
                fVar.onKeyboardHeightChanged(z, i2, false);
                C108707f fVar2 = this.f325579b;
                fVar2.mo159749d(fVar2.f325560j);
            }
        }

        /* renamed from: b */
        public EditText mo117900b() {
            EditText editText = this.f325579b.f325558h;
            C87412m.m108591d(editText);
            return editText;
        }
    }

    /* renamed from: jd.f$e */
    public static final class C108711e implements C84967l0.C84970c {

        /* renamed from: d */
        public boolean f325580d;

        /* renamed from: e */
        public final /* synthetic */ C108707f f325581e;

        /* renamed from: jd.f$e$a */
        public static final class C108712a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108707f f325582d;

            /* renamed from: e */
            public final /* synthetic */ C108711e f325583e;

            public C108712a(C108707f fVar, C108711e eVar) {
                this.f325582d = fVar;
                this.f325583e = eVar;
            }

            public final void run() {
                if (this.f325582d.f325561k) {
                    C108711e eVar = this.f325583e;
                    eVar.mo159752a(eVar.f325580d);
                }
                this.f325582d.f325565o = false;
            }
        }

        public C108711e(C108707f fVar) {
            this.f325581e = fVar;
        }

        /* renamed from: a */
        public final void mo159752a(boolean z) {
            C108706d b = this.f325581e.mo159747b((InputConnection) null);
            int i = 0;
            if (b != null) {
                C108707f fVar = this.f325581e;
                EditText editText = fVar.f325558h;
                if (editText != null) {
                    if (z) {
                        b.mo159735f(editText);
                    } else {
                        b.mo159732c(editText);
                    }
                }
                b.mo159734e(z ? fVar.f325560j : 0);
            }
            C108707f fVar2 = this.f325581e;
            fVar2.onKeyboardHeightChanged(z, z ? fVar2.f325560j : 0, false);
            C108707f fVar3 = this.f325581e;
            if (z) {
                i = fVar3.f325560j;
            }
            fVar3.mo159749d(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
            r0 = r0.mo63349a();
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo117850d(boolean r4) {
            /*
                r3 = this;
                jd.f r0 = r3.f325581e
                java.lang.String r1 = r0.f325568r
                boolean r0 = r0.mo159750e(r1)
                if (r0 == 0) goto L_0x002f
                jd.f r0 = r3.f325581e
                java.lang.String r0 = r0.f325552b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "is keyboard showing: "
                r1.append(r2)
                jd.f r2 = r3.f325581e
                boolean r2 = r2.f325561k
                r1.append(r2)
                java.lang.String r2 = ", state change: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
                return
            L_0x002f:
                r3.f325580d = r4
                jd.f r0 = r3.f325581e
                com.tencent.mm.plugin.appbrand.page.w2 r0 = r0.f325555e
                if (r0 == 0) goto L_0x0042
                com.tencent.mm.plugin.appbrand.jsapi.h r0 = r0.mo63349a()
                if (r0 == 0) goto L_0x0042
                android.view.View r0 = r0.getContentView()
                goto L_0x0043
            L_0x0042:
                r0 = 0
            L_0x0043:
                if (r0 == 0) goto L_0x006b
                jd.f r4 = r3.f325581e
                boolean r0 = r4.f325565o
                if (r0 != 0) goto L_0x006e
                r0 = 1
                r4.f325565o = r0
                com.tencent.mm.plugin.appbrand.page.w2 r4 = r4.f325555e
                if (r4 == 0) goto L_0x006e
                com.tencent.mm.plugin.appbrand.jsapi.h r4 = r4.mo63349a()
                if (r4 == 0) goto L_0x006e
                android.view.View r4 = r4.getContentView()
                if (r4 == 0) goto L_0x006e
                jd.f$e$a r0 = new jd.f$e$a
                jd.f r1 = r3.f325581e
                r0.<init>(r1, r3)
                long r1 = r1.f325553c
                r4.postDelayed(r0, r1)
                goto L_0x006e
            L_0x006b:
                r3.mo159752a(r4)
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p572jd.C108707f.C108711e.mo117850d(boolean):void");
        }

        /* renamed from: e */
        public void mo117851e(int i) {
            C108707f fVar;
            int i2;
            boolean z = true;
            if (i == 0 || (i2 = fVar.f325560j) == 0 || i == i2) {
                z = false;
            } else {
                (fVar = this.f325581e).onKeyboardHeightChanged(i > 0, i, false);
            }
            C108707f fVar2 = this.f325581e;
            fVar2.f325560j = i;
            if (z) {
                fVar2.mo159749d(i);
            }
            C108706d b = this.f325581e.mo159747b((InputConnection) null);
            if (b != null) {
                b.mo159734e(i);
            }
        }

        public int getHeight() {
            return this.f325581e.f325560j;
        }
    }

    /* renamed from: jd.f$f */
    public static final class C108713f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108707f f325584d;

        /* renamed from: e */
        public final /* synthetic */ C108706d f325585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108713f(C108707f fVar, C108706d dVar) {
            super(1);
            this.f325584d = fVar;
            this.f325585e = dVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105925i(this.f325584d.f325552b, "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", Boolean.valueOf(booleanValue), Boolean.valueOf(this.f325584d.f325567q));
            this.f325584d.mo159746a(false, this.f325585e);
            this.f325584d.onKeyboardHeightChanged(true, 0, false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jd.f$g */
    public static final class C108714g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108707f f325586d;

        /* renamed from: e */
        public final /* synthetic */ C108706d f325587e;

        /* renamed from: f */
        public final /* synthetic */ C108708a f325588f;

        /* renamed from: g */
        public final /* synthetic */ boolean f325589g;

        public C108714g(C108707f fVar, C108706d dVar, C108708a aVar, boolean z) {
            this.f325586d = fVar;
            this.f325587e = dVar;
            this.f325588f = aVar;
            this.f325589g = z;
        }

        public final void run() {
            if (this.f325586d.f325561k) {
                this.f325587e.mo159733d(this.f325588f.f325573b);
                if (this.f325589g) {
                    int measuredHeight = this.f325587e.getView().getMeasuredHeight();
                    this.f325586d.onKeyboardHeightChanged(true, measuredHeight, false);
                    this.f325586d.mo159749d(measuredHeight);
                    return;
                }
                C108707f fVar = this.f325586d;
                fVar.onKeyboardHeightChanged(true, fVar.f325560j, false);
                C108707f fVar2 = this.f325586d;
                fVar2.mo159749d(fVar2.f325560j);
            }
        }
    }

    /* renamed from: jd.f$h */
    public static final class C108715h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108706d f325590d;

        /* renamed from: e */
        public final /* synthetic */ C108707f f325591e;

        public C108715h(C108706d dVar, C108707f fVar) {
            this.f325590d = dVar;
            this.f325591e = fVar;
        }

        public final void run() {
            int measuredHeight = this.f325590d.getView().getMeasuredHeight();
            this.f325591e.onKeyboardHeightChanged(true, measuredHeight, false);
            this.f325591e.mo159749d(measuredHeight);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108707f(XWebExtendInterface xWebExtendInterface) {
        super(xWebExtendInterface);
        C87412m.m108594g(xWebExtendInterface, "view");
        this.f325551a = xWebExtendInterface;
        this.f325554d = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
        this.f325570t = new C82540i0();
        this.f325571u = new C108711e(this);
    }

    /* renamed from: a */
    public final void mo159746a(boolean z, C108706d dVar) {
        String str;
        String str2;
        C68717h1 h1Var;
        if (!this.f325561k) {
            Log.m105928w(this.f325552b, "send confirm after keyboard hide");
            return;
        }
        String str3 = null;
        C110653f params = dVar != null ? dVar.getParams() : null;
        String str4 = params != null ? params.f331018R : null;
        Map<String, Integer> map = C84947c0.f247596d;
        String str5 = "";
        if ("encrypt-text".equalsIgnoreCase(str4) || C84947c0.m104716e(str4)) {
            Log.m105924i(this.f325552b, "onKeyboardComplete, do encrypt");
            if (dVar != null) {
                try {
                    h1Var = dVar.mo159743k();
                } catch (C68698a1 e) {
                    Log.m105920e(this.f325552b, "onKeyboardComplete, encrypt fail since " + e);
                    str2 = e.getMessage();
                }
            } else {
                h1Var = null;
            }
            C40525w2 w2Var = this.f325555e;
            str3 = C68709b1.m80980b(h1Var, w2Var != null ? w2Var.mo63349a() : null, params);
            str2 = null;
            JSONObject jSONObject = new JSONObject();
            if (str3 != null) {
                jSONObject.put("encryptedValue", str3);
            }
            if (str2 != null) {
                jSONObject.put("encryptError", str2);
            }
            str = jSONObject.toString();
        } else {
            str = str5;
        }
        C87412m.m108593f(str, "if (AppBrandInputService…g()\n            } else \"\"");
        StringBuilder sb = new StringBuilder();
        sb.append("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm(");
        sb.append(str);
        sb.append(");        }");
        if (!z) {
            str5 = "        focusElement.blur();";
        }
        sb.append(str5);
        sb.append("    }})();");
        evaluateJavascript(sb.toString(), C108709b.f325577a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p572jd.C108706d mo159747b(android.view.inputmethod.InputConnection r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f325552b
            monitor-enter(r0)
            jd.d r1 = r3.f325557g     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            java.lang.String r1 = r3.f325568r     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)
            return r2
        L_0x0010:
            boolean r1 = r3.mo159750e(r1)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001a
            if (r4 != 0) goto L_0x001a
            monitor-exit(r0)
            return r2
        L_0x001a:
            com.tencent.mm.plugin.appbrand.page.w2 r1 = r3.f325555e     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.plugin.appbrand.jsapi.h r1 = r1.mo63349a()     // Catch:{ all -> 0x004e }
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r3.f325568r     // Catch:{ all -> 0x004e }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x004e }
            jd.d r4 = r3.mo159748c(r1, r4)     // Catch:{ all -> 0x004e }
            r3.f325557g = r4     // Catch:{ all -> 0x004e }
            android.widget.EditText r1 = new android.widget.EditText     // Catch:{ all -> 0x004e }
            android.view.View r2 = r4.getView()     // Catch:{ all -> 0x004e }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x004e }
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            r3.f325558h = r1     // Catch:{ all -> 0x004e }
            jd.f$c r1 = new jd.f$c     // Catch:{ all -> 0x004e }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x004e }
            r4.mo159742j(r1)     // Catch:{ all -> 0x004e }
            jd.d r2 = r3.f325557g     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r0)
            return r2
        L_0x004e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p572jd.C108707f.mo159747b(android.view.inputmethod.InputConnection):jd.d");
    }

    /* renamed from: c */
    public final C108706d mo159748c(String str, InputConnection inputConnection) {
        if (C84947c0.m104717f(str)) {
            C40525w2 w2Var = this.f325555e;
            C87412m.m108591d(w2Var);
            C82520h a = w2Var.mo63349a();
            C87412m.m108593f(a, "mAppBrandXWebKeyboard!!.appBrandPage");
            C87412m.m108591d(inputConnection);
            return new C108716h(a, inputConnection, this.f325569s);
        } else if (C87412m.m108589b(str, "safe-password")) {
            C40525w2 w2Var2 = this.f325555e;
            C87412m.m108591d(w2Var2);
            C82520h a2 = w2Var2.mo63349a();
            C87412m.m108593f(a2, "mAppBrandXWebKeyboard!!.appBrandPage");
            C87412m.m108591d(inputConnection);
            C108719i iVar = new C108719i(a2, inputConnection);
            iVar.f325602b = new C87950d(this);
            return iVar;
        } else {
            C40525w2 w2Var3 = this.f325555e;
            C87412m.m108591d(w2Var3);
            C82520h a3 = w2Var3.mo63349a();
            C87412m.m108593f(a3, "mAppBrandXWebKeyboard!!.appBrandPage");
            return new C108723k(a3, inputConnection);
        }
    }

    /* renamed from: d */
    public final void mo159749d(int i) {
        C40525w2 w2Var = this.f325555e;
        C87412m.m108591d(w2Var);
        C82520h a = w2Var.mo63349a();
        C40525w2 w2Var2 = this.f325555e;
        C87412m.m108591d(w2Var2);
        C82381f b = w2Var2.mo63350b();
        if (a != null) {
            C82540i0 i0Var = this.f325570t;
            if (i > 0) {
                C108706d b2 = mo159747b((InputConnection) null);
                if (b2 != null && this.f325562l) {
                    int b3 = b2.mo159731b();
                    this.f325559i = b3;
                    i += b3;
                }
            } else {
                i = 0;
            }
            C87412m.m108593f(b, "appBrandService");
            i0Var.mo114874t(i, b, a, this.f325563m);
        }
    }

    /* renamed from: e */
    public final boolean mo159750e(String str) {
        return C84947c0.m104717f(str) || C87412m.m108589b(str, "safe-password");
    }

    public int getToolBarHeight(int i) {
        C40525w2 w2Var = this.f325555e;
        if (w2Var == null || w2Var.mo63349a() == null) {
            return 0;
        }
        C40525w2 w2Var2 = this.f325555e;
        C87412m.m108591d(w2Var2);
        if (C84752i2.m104416d(w2Var2.mo63349a().getContentView())) {
            return 0;
        }
        C108706d b = mo159747b((InputConnection) null);
        if (b == null || !this.f325562l) {
            return i;
        }
        int b2 = b.mo159731b();
        this.f325559i = b2;
        return i + b2;
    }

    public void onExtraInfoChanged(String str) {
        JSONObject jSONObject;
        String str2 = str;
        if (str2 != null) {
            C110653f fVar = new C110653f();
            String str3 = "TextAreaInfo get confirm-hold error";
            StringBuilder sb = new StringBuilder();
            String str4 = "confirm-hold";
            sb.append("totalInfo:");
            sb.append(str2);
            Log.m105924i("TextAreaInfo", sb.toString());
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception unused) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo convert to json error");
                jSONObject = new JSONObject();
            }
            try {
                if (jSONObject.has("element-tag")) {
                    jSONObject.getString("element-tag");
                }
            } catch (JSONException unused2) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo add elementTag error");
            }
            try {
                if (jSONObject.has("keyboard-type")) {
                    String string = jSONObject.getString("keyboard-type");
                    C87412m.m108593f(string, "jsonObject.getString(\"keyboard-type\")");
                    fVar.f331018R = string;
                }
            } catch (JSONException unused3) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo add keyboardType error");
            }
            try {
                if (jSONObject.has("cursor-spacing")) {
                    fVar.f331054y = Integer.valueOf(C88020k.m109561l(jSONObject, "cursor-spacing"));
                }
            } catch (JSONException unused4) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
            } catch (NumberFormatException unused5) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            } catch (Exception unused6) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            }
            try {
                if (jSONObject.has("adjust-position")) {
                    fVar.f331026B = Boolean.valueOf(Util.getBoolean(jSONObject.getString("adjust-position"), true));
                }
            } catch (JSONException unused7) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            } catch (Exception unused8) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            }
            try {
                if (jSONObject.has("show-confirm-bar")) {
                    Util.getBoolean(jSONObject.getString("show-confirm-bar"), false);
                }
            } catch (JSONException unused9) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            } catch (Exception unused10) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            }
            try {
                if (jSONObject.has("password")) {
                    Util.getBoolean(jSONObject.getString("password"), false);
                }
            } catch (JSONException unused11) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            } catch (Exception unused12) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            }
            try {
                if (jSONObject.has("show-cover-view")) {
                    Util.getBoolean(jSONObject.getString("show-cover-view"), false);
                }
            } catch (JSONException unused13) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            } catch (Exception unused14) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            }
            String str5 = str4;
            try {
                if (jSONObject.has(str5)) {
                    Util.getBoolean(jSONObject.getString(str5), false);
                }
            } catch (JSONException unused15) {
                Log.m105920e("TextAreaInfo", str3);
            } catch (Exception unused16) {
                Log.m105920e("TextAreaInfo", str3);
            }
            C68711c2.m80984d(jSONObject, fVar);
            C68709b1.m80982d(jSONObject, fVar);
            C108706d b = mo159747b((InputConnection) null);
            if (b != null) {
                b.mo159741i(fVar);
                return;
            }
            return;
        }
    }

    public boolean onHideKeyboard(String str, InputConnection inputConnection) {
        C108706d b;
        if (this.f325554d && inputConnection != null) {
            boolean z = inputConnection instanceof BaseInputConnection;
        }
        this.f325561k = false;
        if (!(this.f325555e == null || (b = mo159747b((InputConnection) null)) == null)) {
            b.hideKeyboard();
            b.mo159733d(false);
        }
        C84967l0 l0Var = this.f325556f;
        if (l0Var != null) {
            l0Var.mo117847e(this.f325571u);
        }
        C87951l.f254518a.mo122411a(true);
        this.f325568r = null;
        this.f325557g = null;
        this.f325562l = false;
        this.f325563m = null;
        this.f325564n = null;
        return false;
    }

    public boolean onShowKeyboard(String str, String str2, InputConnection inputConnection, ResultReceiver resultReceiver) {
        C87412m.m108594g(str2, "extendInfo");
        if (this.f325554d && inputConnection != null) {
            boolean z = inputConnection instanceof BaseInputConnection;
        }
        this.f325561k = true;
        C84967l0 l0Var = this.f325556f;
        if (l0Var == null) {
            C40525w2 w2Var = this.f325555e;
            C87412m.m108591d(w2Var);
            l0Var = C85004y.m104826e(w2Var.mo63349a().getContentView());
        }
        this.f325556f = l0Var;
        if (l0Var != null) {
            l0Var.mo117844a(this.f325571u);
        }
        C87951l.f254518a.mo122411a(false);
        C108708a aVar = new C108708a(str2);
        this.f325567q = aVar.f325576e;
        String str3 = aVar.f325572a;
        this.f325568r = str3;
        this.f325569s = Util.nullAs(C84947c0.f247596d.get(str3), 0);
        this.f325562l = aVar.f325573b;
        this.f325563m = aVar.f325575d.f331024X;
        this.f325564n = str;
        boolean e = mo159750e(this.f325568r);
        if (this.f325555e == null) {
            return false;
        }
        C108706d b = mo159747b(inputConnection);
        if (b != null) {
            if (aVar.f325573b) {
                b.mo159739h(aVar.f325574c);
            }
            b.mo159736g(new C108713f(this, b));
            b.mo159744l(aVar.f325575d);
            b.setText(this.f325564n);
            b.mo159730a();
            boolean z2 = aVar.f325573b;
            if (z2) {
                b.getView().postDelayed(new C108714g(this, b, aVar, e), 200);
            } else if (e) {
                b.mo159733d(z2);
                b.getView().post(new C108715h(b, this));
            }
        }
        return e;
    }

    public boolean onShowKeyboardConfig(String str, int i, int i2, String str2, int i3, int i4, EditorInfo editorInfo) {
        C87412m.m108594g(editorInfo, "outAttrs");
        Log.m105918d(this.f325552b, "onShowKeyboardConfig");
        C90097c cVar = null;
        try {
            cVar = (C90097c) C90098e.m112719a(new JSONObject(str2).optString("confirm-type", (String) null), C90097c.class);
        } catch (Exception unused) {
            Log.m105928w(this.f325552b, "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        Log.m105924i(this.f325552b, "onShowKeyboardConfig, confirmType: " + cVar);
        if (C90097c.RETURN != cVar) {
            editorInfo.imeOptions &= -1073741825;
        }
        int i5 = editorInfo.imeOptions;
        int i6 = cVar.f258754d;
        editorInfo.imeOptions = i5 | i6;
        this.f325566p = i6;
        return false;
    }

    public boolean performEditorAction(int i) {
        String str = this.f325552b;
        Log.m105918d(str, "performEditorAction, actionCode: " + i);
        if (i == 0 || i != this.f325566p) {
            return true;
        }
        String str2 = this.f325552b;
        Log.m105924i(str2, "performEditorAction, confirmHold: " + this.f325567q);
        mo159746a(this.f325567q, this.f325557g);
        return false;
    }
}
