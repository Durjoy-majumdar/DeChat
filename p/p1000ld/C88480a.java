package p1000ld;

import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import android.widget.EditText;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.page.C40525w2;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.XWebExtendTextAreaClient;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import p572jd.C87951l;
import rt0.C90097c;
import rt0.C90098e;

/* renamed from: ld.a */
public class C88480a extends XWebExtendTextAreaClient {

    /* renamed from: a */
    public C40525w2 f255565a;

    /* renamed from: b */
    public C84967l0 f255566b;

    /* renamed from: c */
    public C84983t0 f255567c;

    /* renamed from: d */
    public EditText f255568d;

    /* renamed from: e */
    public int f255569e = 0;

    /* renamed from: f */
    public int f255570f = 0;

    /* renamed from: g */
    public boolean f255571g = false;

    /* renamed from: h */
    public boolean f255572h = false;

    /* renamed from: i */
    public int f255573i = 0;

    /* renamed from: j */
    public boolean f255574j = false;

    /* renamed from: k */
    public final C82540i0 f255575k = new C82540i0();

    /* renamed from: l */
    public C84983t0.C84990i f255576l = new C88481a();

    /* renamed from: m */
    public final C84967l0.C84970c f255577m = new C88482b();

    /* renamed from: ld.a$a */
    public class C88481a implements C84983t0.C84990i {
        public C88481a() {
        }

        /* renamed from: a */
        public void mo117899a(int i) {
            C84983t0 t0Var = C88480a.this.f255567c;
            if (t0Var != null) {
                int minimumHeight = t0Var.getMinimumHeight();
                int i2 = i - minimumHeight;
                boolean z = true;
                Log.m105925i("WebViewExtendTextAreaClient", "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", Integer.valueOf(i), Integer.valueOf(C88480a.this.f255569e), Integer.valueOf(minimumHeight));
                C88480a aVar = C88480a.this;
                if (aVar.f255569e != minimumHeight) {
                    aVar.f255569e = minimumHeight;
                    aVar.f255570f = i;
                    if (i2 <= 0) {
                        z = false;
                    }
                    aVar.onKeyboardHeightChanged(z, i2, false);
                    C88480a aVar2 = C88480a.this;
                    aVar2.mo122891c(aVar2.f255570f);
                }
            }
        }

        /* renamed from: b */
        public EditText mo117900b() {
            return C88480a.this.f255568d;
        }
    }

    /* renamed from: ld.a$b */
    public class C88482b implements C84967l0.C84970c {

        /* renamed from: d */
        public boolean f255579d = false;

        public C88482b() {
        }

        /* renamed from: a */
        public final void mo122892a(boolean z) {
            C84983t0 b = C88480a.this.mo122890b();
            int i = 0;
            if (b != null) {
                EditText editText = C88480a.this.f255568d;
                if (editText != null) {
                    if (z) {
                        b.f247681w = editText;
                    } else {
                        b.mo117874c(editText);
                    }
                }
                b.mo117851e(z ? C88480a.this.f255570f : 0);
            }
            C88480a aVar = C88480a.this;
            aVar.onKeyboardHeightChanged(z, z ? aVar.f255570f : 0, false);
            C88480a aVar2 = C88480a.this;
            if (z) {
                i = aVar2.f255570f;
            }
            aVar2.mo122891c(i);
        }

        /* renamed from: d */
        public void mo117850d(boolean z) {
            this.f255579d = z;
            C40525w2 w2Var = C88480a.this.f255565a;
            if (w2Var == null || w2Var.mo63349a() == null || C88480a.this.f255565a.mo63349a().getContentView() == null) {
                mo122892a(z);
                return;
            }
            C88480a aVar = C88480a.this;
            if (!aVar.f255572h) {
                aVar.f255572h = true;
                aVar.f255565a.mo63349a().getContentView().postDelayed(new a$b$$a(this), 250);
            }
        }

        /* renamed from: e */
        public void mo117851e(int i) {
            C88480a aVar;
            int i2;
            boolean z = true;
            if (i == 0 || (i2 = aVar.f255570f) == 0 || i == i2) {
                z = false;
            } else {
                (aVar = C88480a.this).onKeyboardHeightChanged(i > 0, i, false);
            }
            C88480a aVar2 = C88480a.this;
            aVar2.f255570f = i;
            if (z) {
                aVar2.mo122891c(i);
            }
            C84983t0 b = C88480a.this.mo122890b();
            if (b != null) {
                b.mo117851e(i);
            }
        }

        public int getHeight() {
            return C88480a.this.f255570f;
        }
    }

    /* renamed from: ld.a$c */
    public class C88483c implements C84983t0.C84989h {
        public C88483c() {
        }

        /* renamed from: a */
        public void mo117898a(boolean z) {
            Log.m105925i("WebViewExtendTextAreaClient", "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", Boolean.valueOf(z), Boolean.valueOf(C88480a.this.f255574j));
            C88480a.this.mo122889a(false);
        }
    }

    /* renamed from: ld.a$d */
    public class C88484d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84983t0 f255582d;

        /* renamed from: e */
        public final /* synthetic */ C88486f f255583e;

        public C88484d(C84983t0 t0Var, C88486f fVar) {
            this.f255582d = t0Var;
            this.f255583e = fVar;
        }

        public void run() {
            if (C88480a.this.f255571g) {
                this.f255582d.mo117850d(this.f255583e.f255586b);
                C88480a aVar = C88480a.this;
                aVar.onKeyboardHeightChanged(true, aVar.f255571g ? aVar.f255570f : 0, false);
                C88480a aVar2 = C88480a.this;
                aVar2.mo122891c(aVar2.f255570f);
            }
        }
    }

    /* renamed from: ld.a$e */
    public class C88485e implements ValueCallback<String> {
        public C88485e(C88480a aVar) {
        }

        public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
        }
    }

    /* renamed from: ld.a$f */
    public class C88486f {

        /* renamed from: a */
        public String f255585a = "";

        /* renamed from: b */
        public boolean f255586b = false;

        /* renamed from: c */
        public boolean f255587c = false;

        /* renamed from: d */
        public boolean f255588d = false;

        /* renamed from: e */
        public boolean f255589e = false;

        public C88486f(C88480a aVar, String str) {
            JSONObject jSONObject;
            Log.m105924i("TextAreaInfo", "totalInfo:" + str);
            try {
                jSONObject = new JSONObject(str);
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
                    this.f255585a = jSONObject.getString("keyboard-type");
                }
            } catch (JSONException unused3) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo add keyboardType error");
            }
            try {
                if (jSONObject.has("show-confirm-bar")) {
                    this.f255586b = Util.getBoolean(jSONObject.getString("show-confirm-bar"), false);
                }
            } catch (JSONException unused4) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            } catch (Exception unused5) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            }
            try {
                if (jSONObject.has("password")) {
                    this.f255587c = Util.getBoolean(jSONObject.getString("password"), false);
                }
            } catch (JSONException unused6) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            } catch (Exception unused7) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get password error");
            }
            try {
                if (jSONObject.has("show-cover-view")) {
                    this.f255588d = Util.getBoolean(jSONObject.getString("show-cover-view"), false);
                }
            } catch (JSONException unused8) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            } catch (Exception unused9) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            }
            try {
                if (jSONObject.has("confirm-hold")) {
                    this.f255589e = Util.getBoolean(jSONObject.getString("confirm-hold"), false);
                }
            } catch (JSONException unused10) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            } catch (Exception unused11) {
                Log.m105920e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            }
        }
    }

    public C88480a(XWebExtendInterface xWebExtendInterface) {
        super(xWebExtendInterface);
    }

    /* renamed from: a */
    public final void mo122889a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm();        }");
        sb.append(!z ? "        focusElement.blur();" : "");
        sb.append("    }})();");
        evaluateJavascript(sb.toString(), new C88485e(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0 mo122890b() {
        /*
            r4 = this;
            java.lang.String r0 = "WebViewExtendTextAreaClient"
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = r4.f255567c     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r1
        L_0x0009:
            boolean r1 = r4.f255571g     // Catch:{ all -> 0x0066 }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0010:
            com.tencent.mm.plugin.appbrand.page.w2 r1 = r4.f255565a     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0064
            com.tencent.mm.plugin.appbrand.jsapi.h r1 = r1.mo63349a()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0064
            com.tencent.mm.plugin.appbrand.page.w2 r1 = r4.f255565a     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.jsapi.h r1 = r1.mo63349a()     // Catch:{ all -> 0x0066 }
            android.view.View r1 = r1.getContentView()     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.page.w2 r3 = r4.f255565a     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.jsapi.h r3 = r3.mo63349a()     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0043
            com.tencent.mm.plugin.appbrand.page.w2 r3 = r4.f255565a     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.jsapi.h r3 = r3.mo63349a()     // Catch:{ all -> 0x0066 }
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0043
            com.tencent.mm.plugin.appbrand.page.w2 r3 = r4.f255565a     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.jsapi.h r3 = r3.mo63349a()     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.page.d1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r3     // Catch:{ all -> 0x0066 }
            to0.a r3 = r3.mo116161P0()     // Catch:{ all -> 0x0066 }
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0.m104780G(r1, r2, r3)     // Catch:{ all -> 0x0066 }
            r4.f255567c = r1     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0060
            android.widget.EditText r1 = new android.widget.EditText     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.widget.input.t0 r2 = r4.f255567c     // Catch:{ all -> 0x0066 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0066 }
            r1.<init>(r2)     // Catch:{ all -> 0x0066 }
            r4.f255568d = r1     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = r4.f255567c     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.appbrand.widget.input.t0$i r2 = r4.f255576l     // Catch:{ all -> 0x0066 }
            r1.mo117877j(r2)     // Catch:{ all -> 0x0066 }
        L_0x0060:
            com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = r4.f255567c     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r1
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1000ld.C88480a.mo122890b():com.tencent.mm.plugin.appbrand.widget.input.t0");
    }

    /* renamed from: c */
    public final void mo122891c(int i) {
        C84983t0 b;
        C82520h a = this.f255565a.mo63349a();
        C82381f b2 = this.f255565a.mo63350b();
        if (a != null) {
            C82540i0 i0Var = this.f255575k;
            int i2 = 0;
            if (i > 0 && (b = mo122890b()) != null) {
                int minimumHeight = b.getMinimumHeight();
                this.f255569e = minimumHeight;
                i2 = i + minimumHeight;
            }
            i0Var.getClass();
            C87412m.m108594g(b2, "service");
            i0Var.mo114874t(i2, b2, a, (Integer) null);
        }
    }

    public int getToolBarHeight(int i) {
        C84983t0 b;
        C40525w2 w2Var = this.f255565a;
        if (w2Var == null || w2Var.mo63349a() == null || C84752i2.m104416d(this.f255565a.mo63349a().getContentView()) || (b = mo122890b()) == null) {
            return 0;
        }
        int minimumHeight = b.getMinimumHeight();
        this.f255569e = minimumHeight;
        return i + minimumHeight;
    }

    public boolean onHideKeyboard(String str, InputConnection inputConnection) {
        C84983t0 b;
        if (!(this.f255565a == null || (b = mo122890b()) == null)) {
            b.mo117850d(false);
        }
        C84967l0 l0Var = this.f255566b;
        if (l0Var != null) {
            l0Var.mo117847e(this.f255577m);
        }
        C87951l.f254518a.mo122411a(true);
        this.f255571g = false;
        C84983t0 t0Var = this.f255567c;
        if (t0Var != null) {
            t0Var.mo117878o(this.f255576l);
        }
        this.f255567c = null;
        return false;
    }

    public boolean onShowKeyboard(String str, InputConnection inputConnection, ResultReceiver resultReceiver) {
        C84983t0 b;
        boolean z = true;
        this.f255571g = true;
        if (this.f255566b == null) {
            this.f255566b = C85004y.m104826e(this.f255565a.mo63349a().getContentView());
        }
        C84967l0 l0Var = this.f255566b;
        if (l0Var != null) {
            l0Var.mo117844a(this.f255577m);
        }
        C87951l.f254518a.mo122411a(false);
        C88486f fVar = new C88486f(this, str);
        this.f255574j = fVar.f255589e;
        if (!(this.f255565a == null || (b = mo122890b()) == null || !fVar.f255586b)) {
            b.setComponentView(fVar.f255588d);
            b.mo117873N();
            if (fVar.f255587c || !"emoji".equals(fVar.f255585a)) {
                z = false;
            }
            b.setCanSmileyInput(z);
            b.setShowDoneButton(fVar.f255586b);
            b.setOnDoneListener(new C88483c());
            b.postDelayed(new C88484d(b, fVar), 200);
        }
        return false;
    }

    public boolean onShowKeyboardConfig(int i, int i2, String str, int i3, int i4, EditorInfo editorInfo) {
        Log.m105918d("WebViewExtendTextAreaClient", "onShowKeyboardConfig");
        C90097c cVar = null;
        try {
            cVar = (C90097c) C90098e.m112719a(new JSONObject(str).optString("confirm-type", (String) null), C90097c.class);
        } catch (Exception unused) {
            Log.m105928w("WebViewExtendTextAreaClient", "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        Log.m105924i("WebViewExtendTextAreaClient", "onShowKeyboardConfig, confirmType: " + cVar);
        if (C90097c.RETURN != cVar) {
            editorInfo.imeOptions &= -1073741825;
        }
        int i5 = editorInfo.imeOptions;
        int i6 = cVar.f258754d;
        editorInfo.imeOptions = i5 | i6;
        this.f255573i = i6;
        return false;
    }

    public boolean performEditorAction(int i) {
        Log.m105918d("WebViewExtendTextAreaClient", "performEditorAction, actionCode: " + i);
        if (i == 0 || i != this.f255573i) {
            return true;
        }
        Log.m105924i("WebViewExtendTextAreaClient", "performEditorAction, confirmHold: " + this.f255574j);
        mo122889a(this.f255574j);
        return false;
    }
}
