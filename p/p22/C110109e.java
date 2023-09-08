package p22;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p22.C110120h;
import rx3.C13604l;
import sx3.C90364q0;
import z04.C112551y;

/* renamed from: p22.e */
public final class C110109e {

    /* renamed from: a */
    public final String f329417a = "MicroMsg.LiteAppExtendInputClient";

    /* renamed from: b */
    public final int f329418b = 5;

    /* renamed from: c */
    public C110108d f329419c;

    /* renamed from: d */
    public C110107c f329420d;

    /* renamed from: e */
    public boolean f329421e;

    /* renamed from: f */
    public int f329422f;

    /* renamed from: g */
    public String f329423g;

    /* renamed from: h */
    public String f329424h;

    /* renamed from: i */
    public String f329425i;

    /* renamed from: j */
    public int f329426j = 1;

    /* renamed from: k */
    public final String f329427k = "Number";

    /* renamed from: l */
    public final String f329428l = "Digit";

    /* renamed from: m */
    public final String f329429m = "IDCard";

    /* renamed from: n */
    public final String f329430n = "Pay";

    /* renamed from: o */
    public final Map<String, Integer> f329431o = C90364q0.m113147f(new C13604l("Digit", 2), new C13604l("Number", 0), new C13604l("IDCard", 1));

    /* renamed from: p */
    public final C110106b f329432p = new C110112c(this);

    /* renamed from: q */
    public final Runnable f329433q = new C110113d(this);

    /* renamed from: p22.e$a */
    public static final class C110110a {

        /* renamed from: a */
        public String f329434a = "";

        /* renamed from: b */
        public String f329435b = "";

        /* renamed from: c */
        public Integer f329436c;

        /* renamed from: d */
        public Integer f329437d;

        /* renamed from: e */
        public String f329438e;

        /* renamed from: f */
        public boolean f329439f = true;

        /* renamed from: g */
        public Boolean f329440g;

        public C110110a(JSONObject jSONObject) {
            C87412m.m108594g(jSONObject, "json");
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            this.f329435b = jSONObject2;
            Log.m105924i("InputInfo", "totalInfo:" + this.f329435b);
            String optString = jSONObject.optString("type");
            C87412m.m108593f(optString, "json.optString(\"type\")");
            this.f329434a = optString;
            if (C112551y.m153819s(optString, "LiteAppKeyboardType.", false)) {
                String substring = this.f329434a.substring(20);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                this.f329434a = substring;
            }
            if (jSONObject.has("confirmText")) {
                this.f329438e = jSONObject.getString("confirmText");
            }
            if (jSONObject.has("confirmColor")) {
                this.f329436c = Integer.valueOf(jSONObject.getInt("confirmColor"));
            }
            if (jSONObject.has("confirmBgColor")) {
                this.f329437d = Integer.valueOf(jSONObject.getInt("confirmBgColor"));
            }
            if (jSONObject.has("enableConfirm")) {
                this.f329439f = jSONObject.getBoolean("enableConfirm");
            }
            if (jSONObject.has("darkMode")) {
                this.f329440g = Boolean.valueOf(jSONObject.getBoolean("darkMode"));
            }
        }
    }

    /* renamed from: p22.e$b */
    public static final class C110111b implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public static final C110111b f329441d = new C110111b();

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return windowInsets == null ? WindowInsets.CONSUMED : windowInsets;
        }
    }

    /* renamed from: p22.e$c */
    public static final class C110112c implements C110106b {

        /* renamed from: a */
        public final /* synthetic */ C110109e f329442a;

        public C110112c(C110109e eVar) {
            this.f329442a = eVar;
        }

        /* renamed from: a */
        public void mo161503a() {
            this.f329442a.mo161510f(Insets.of(0, 0, 0, 0));
        }

        /* renamed from: b */
        public void mo161504b() {
            this.f329442a.mo161509e();
        }
    }

    /* renamed from: p22.e$d */
    public static final class C110113d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110109e f329443d;

        public C110113d(C110109e eVar) {
            this.f329443d = eVar;
        }

        public final void run() {
            Log.m105926v(this.f329443d.f329417a, "[scrollUp] offsetRunner enter");
            C110109e.m149697a(this.f329443d);
        }
    }

    /* renamed from: a */
    public static final void m149697a(C110109e eVar) {
        C110107c cVar = eVar.f329420d;
        if (cVar != null) {
            if (!cVar.mo117827q()) {
                String str = eVar.f329417a;
                Object[] objArr = new Object[2];
                View view = cVar.getView();
                objArr[0] = Integer.valueOf(view != null ? view.getMeasuredHeight() : 0);
                objArr[1] = Integer.valueOf(eVar.f329422f);
                Log.m105927v(str, "[scrollUp], panel height %d, tryCount %d", objArr);
                int i = eVar.f329422f + 1;
                eVar.f329422f = i;
                if (i < eVar.f329418b) {
                    eVar.mo161509e();
                    return;
                }
                return;
            }
            eVar.f329422f = 0;
            View view2 = cVar.getView();
            int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
            Log.m105927v(eVar.f329417a, "[scrollUp], panelHeight %d", Integer.valueOf(measuredHeight));
            eVar.mo161510f(Insets.of(0, 0, 0, measuredHeight));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p22.C110107c mo161506b(android.view.inputmethod.InputConnection r5, p22.C110109e.C110110a r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f329417a
            monitor-enter(r0)
            p22.c r1 = r4.f329420d     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0013
            java.lang.String r2 = r4.f329424h     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r4.f329425i     // Catch:{ all -> 0x007e }
            boolean r2 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r0)
            return r1
        L_0x0013:
            java.lang.String r1 = r4.f329424h     // Catch:{ all -> 0x007e }
            r2 = 0
            if (r1 != 0) goto L_0x001a
            monitor-exit(r0)
            return r2
        L_0x001a:
            boolean r1 = r4.f329421e     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0020
            monitor-exit(r0)
            return r2
        L_0x0020:
            java.lang.String r1 = r4.f329423g     // Catch:{ all -> 0x007e }
            boolean r1 = r4.mo161511g(r1)     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.f329423g     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r4.f329430n     // Catch:{ all -> 0x007e }
            boolean r1 = gy3.C87412m.m108589b(r1, r3)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0036
        L_0x0032:
            if (r5 != 0) goto L_0x0036
            monitor-exit(r0)
            return r2
        L_0x0036:
            p22.d r1 = r4.f329419c     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0062
            android.view.View r1 = r1.mo161505b()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r4.f329423g     // Catch:{ all -> 0x007e }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x007e }
            p22.c r5 = r4.mo161507c(r1, r5, r6)     // Catch:{ all -> 0x007e }
            r4.f329420d = r5     // Catch:{ all -> 0x007e }
            p22.d r5 = r4.f329419c     // Catch:{ all -> 0x007e }
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x007e }
            android.view.View r5 = r5.mo161505b()     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x005b
            p22.e$b r6 = p22.C110109e.C110111b.f329441d     // Catch:{ all -> 0x007e }
            r5.setOnApplyWindowInsetsListener(r6)     // Catch:{ all -> 0x007e }
        L_0x005b:
            java.lang.String r5 = r4.f329424h     // Catch:{ all -> 0x007e }
            r4.f329425i = r5     // Catch:{ all -> 0x007e }
            p22.c r2 = r4.f329420d     // Catch:{ all -> 0x007e }
            goto L_0x007c
        L_0x0062:
            java.lang.String r5 = r4.f329424h     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r4.f329425i     // Catch:{ all -> 0x007e }
            boolean r5 = gy3.C87412m.m108589b(r5, r6)     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x007c
            p22.c r5 = r4.f329420d     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0078
            int r6 = r4.f329426j     // Catch:{ all -> 0x007e }
            r5.setXMode(r6)     // Catch:{ all -> 0x007e }
            r5.mo123655a()     // Catch:{ all -> 0x007e }
        L_0x0078:
            java.lang.String r5 = r4.f329424h     // Catch:{ all -> 0x007e }
            r4.f329425i = r5     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r0)
            return r2
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p22.C110109e.mo161506b(android.view.inputmethod.InputConnection, p22.e$a):p22.c");
    }

    /* renamed from: c */
    public final C110107c mo161507c(String str, InputConnection inputConnection, C110110a aVar) {
        C110108d dVar = this.f329419c;
        if ((dVar != null ? dVar.mo161505b() : null) == null) {
            return null;
        }
        if (mo161511g(str)) {
            C110108d dVar2 = this.f329419c;
            C87412m.m108591d(dVar2);
            View b = dVar2.mo161505b();
            C87412m.m108591d(b);
            C87412m.m108591d(inputConnection);
            C110114f fVar = new C110114f(b, inputConnection, this.f329432p);
            C87412m.m108591d(aVar);
            Boolean bool = aVar.f329440g;
            if (bool != null) {
                fVar.f329447g.setForceLight(!bool.booleanValue());
            }
            fVar.setXMode(this.f329426j);
            return fVar;
        } else if (!C87412m.m108589b(str, this.f329430n)) {
            return new C89311a();
        } else {
            C110108d dVar3 = this.f329419c;
            C87412m.m108591d(dVar3);
            View b2 = dVar3.mo161505b();
            C87412m.m108591d(b2);
            C87412m.m108591d(inputConnection);
            C110117g gVar = new C110117g(b2, inputConnection, this.f329432p);
            if (aVar == null) {
                return gVar;
            }
            Boolean bool2 = aVar.f329440g;
            if (bool2 != null) {
                gVar.f329453f.setForceLight(!bool2.booleanValue());
            }
            String str2 = aVar.f329438e;
            if (str2 != null) {
                gVar.f329453f.setConfirmText(str2);
            }
            Integer num = aVar.f329436c;
            if (num != null) {
                gVar.f329453f.setConfirmColor(num.intValue());
            }
            Integer num2 = aVar.f329437d;
            if (num2 != null) {
                gVar.f329453f.setConfirmBgColor(num2.intValue());
            }
            gVar.f329453f.f329477f.f313512r.setEnabled(aVar.f329439f);
            return gVar;
        }
    }

    /* renamed from: d */
    public boolean mo161508d(JSONObject jSONObject, InputConnection inputConnection) {
        C110107c b;
        if (!(this.f329419c == null || (b = mo161506b((InputConnection) null, (C110110a) null)) == null)) {
            b.hideKeyboard();
            b.mo123656d(false);
        }
        mo161510f(Insets.of(0, 0, 0, 0));
        this.f329423g = null;
        this.f329424h = null;
        this.f329421e = false;
        this.f329420d = null;
        return false;
    }

    /* renamed from: e */
    public final void mo161509e() {
        View b;
        View b2;
        if (this.f329422f == 0) {
            C110108d dVar = this.f329419c;
            if (dVar != null && (b2 = dVar.mo161505b()) != null) {
                b2.post(this.f329433q);
                return;
            }
            return;
        }
        C110108d dVar2 = this.f329419c;
        if (dVar2 != null && (b = dVar2.mo161505b()) != null) {
            b.postOnAnimationDelayed(this.f329433q, 100);
        }
    }

    /* renamed from: f */
    public final void mo161510f(Insets insets) {
        WindowInsets windowInsets;
        C110108d dVar;
        View b;
        Insets insets2;
        C110108d dVar2 = this.f329419c;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(dVar2 != null ? dVar2.mo150201a() : null);
        if (castActivityOrNull == null) {
            Log.m105928w(this.f329417a, "send keyboard height, but activity is null");
            return;
        }
        C110108d dVar3 = this.f329419c;
        if (dVar3 != null && dVar3.mo161505b() != null) {
            WindowInsets b2 = C85924r4.m106237b(castActivityOrNull);
            int i = Build.VERSION.SDK_INT;
            int c = i >= 30 ? (b2 == null || (insets2 = b2.getInsets(WindowInsets.Type.navigationBars())) == null) ? C75044y4.m89991c(castActivityOrNull) : insets2.bottom : C75044y4.m89991c(castActivityOrNull);
            if (b2 != null) {
                if (insets != null) {
                    windowInsets = i >= 30 ? new WindowInsets.Builder(b2).setInsets(WindowInsets.Type.ime(), insets).build() : i >= 29 ? new WindowInsets.Builder(b2).setSystemWindowInsets(insets).build() : b2.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
                } else if (i >= 30) {
                    Insets insets3 = b2.getInsets(WindowInsets.Type.ime());
                    C87412m.m108593f(insets3, "getInsets(WindowInsets.Type.ime())");
                    windowInsets = new WindowInsets.Builder(b2).setInsets(WindowInsets.Type.ime(), Insets.of(insets3.left, insets3.top, insets3.right, insets3.bottom - c)).build();
                } else {
                    windowInsets = i >= 29 ? new WindowInsets.Builder(b2).setSystemWindowInsets(Insets.of(b2.getSystemWindowInsetLeft(), b2.getSystemWindowInsetTop(), b2.getSystemWindowInsetRight(), b2.getSystemWindowInsetBottom() - c)).build() : b2.replaceSystemWindowInsets(b2.getSystemWindowInsetLeft(), b2.getSystemWindowInsetTop(), b2.getSystemWindowInsetRight(), b2.getSystemWindowInsetBottom() - c);
                }
                if (!(windowInsets == null || (dVar = this.f329419c) == null || (b = dVar.mo161505b()) == null)) {
                    b.onApplyWindowInsets(windowInsets);
                }
                C110120h hVar = C110120h.f329457a;
                int systemWindowInsetBottom = insets != null ? insets.bottom : b2.getSystemWindowInsetBottom() - c;
                Iterator<C110120h.C110122b> it = C110120h.f329463g.iterator();
                while (it.hasNext()) {
                    it.next().onChange(systemWindowInsetBottom);
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo161511g(String str) {
        return C87412m.m108589b(str, this.f329427k) || C87412m.m108589b(str, this.f329428l) || C87412m.m108589b(str, this.f329429m);
    }
}
