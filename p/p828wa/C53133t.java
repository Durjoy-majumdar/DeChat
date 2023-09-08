package p828wa;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import b34.C79664a;
import com.tencent.luggage.webview.default_impl.C17638a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.regex.Pattern;
import p822sa.C48319p;
import p822sa.C48321r;
import p824tc.C48619a;
import p826uc.C52510a;
import p826uc.C52511b;
import p826uc.C52513d;
import p826uc.C52514e;

/* renamed from: wa.t */
public class C53133t extends C53127q {

    /* renamed from: f */
    public final MutableContextWrapper f148242f;

    /* renamed from: g */
    public final Class<? extends C48619a> f148243g;

    /* renamed from: h */
    public C53135u f148244h;

    /* renamed from: i */
    public C48619a f148245i;

    /* renamed from: j */
    public C48319p f148246j;

    /* renamed from: n */
    public boolean f148247n = false;

    /* renamed from: o */
    public C52511b f148248o;

    /* renamed from: p */
    public C52513d f148249p;

    /* renamed from: q */
    public String f148250q;

    /* renamed from: r */
    public boolean f148251r = false;

    /* renamed from: s */
    public boolean f148252s = true;

    /* renamed from: t */
    public C48619a.C48620a f148253t = new C53134a();

    /* renamed from: wa.t$a */
    public class C53134a implements C48619a.C48620a {
        public C53134a() {
        }

        /* renamed from: a */
        public boolean mo73824a(String str) {
            Iterator<Pair<C52514e, Pattern>> it = C53133t.this.f148249p.f146670a.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                C52514e eVar = (C52514e) next.first;
                Pattern pattern = (Pattern) next.second;
                if (pattern != null && pattern.matcher(str).matches()) {
                    return eVar.mo73447a(str);
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo73825b(String str) {
            C53133t tVar = C53133t.this;
            tVar.f148250q = str;
            ((C48321r) tVar.f148246j.f129380d).f129385a.mo73016a();
            C53133t tVar2 = C53133t.this;
            C53135u uVar = tVar2.f148244h;
            if (uVar != null) {
                C48319p pVar = tVar2.f148246j;
                pVar.f129377a.evaluateJavascript(uVar.mo65889a(), (ValueCallback<String>) null);
                C53133t.this.f148244h.mo65890b(str);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r0 = r0.mo65893e(r2);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.webkit.WebResourceResponse mo73826c(java.lang.String r2) {
            /*
                r1 = this;
                r1.mo73827d(r2)
                wa.t r0 = p828wa.C53133t.this
                wa.u r0 = r0.f148244h
                if (r0 == 0) goto L_0x0010
                android.webkit.WebResourceResponse r0 = r0.mo65893e(r2)
                if (r0 == 0) goto L_0x0010
                return r0
            L_0x0010:
                wa.t r0 = p828wa.C53133t.this
                uc.b r0 = r0.f148248o
                android.webkit.WebResourceResponse r2 = r0.mo73446b(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p828wa.C53133t.C53134a.mo73826c(java.lang.String):android.webkit.WebResourceResponse");
        }

        /* renamed from: d */
        public final void mo73827d(String str) {
            String path;
            if (!C53133t.this.f148251r) {
                boolean z = false;
                if (!(str == null || str.length() == 0 || (path = Uri.parse(str).getPath()) == null || !path.trim().endsWith("html"))) {
                    z = true;
                }
                if (!z) {
                    C53133t.this.mo73820h();
                }
            }
        }
    }

    public C53133t(Context context, Class<? extends C48619a> cls) {
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
        this.f148242f = mutableContextWrapper;
        Class cls2 = cls == null ? C17638a.class : cls;
        this.f148243g = cls2;
        new Handler(Looper.getMainLooper());
        this.f148248o = new C52511b();
        this.f148249p = new C52513d();
        this.f148248o.mo73445a(new C52510a(mutableContextWrapper));
        C48619a aVar = (C48619a) new C79664a(cls2, cls2).mo109791d(mutableContextWrapper).f233575b;
        this.f148245i = aVar;
        aVar.setWebCore(this);
        this.f148245i.mo21039A(this.f148253t);
        this.f148246j = new C48319p(this.f148245i);
    }

    /* renamed from: c */
    public C48319p mo73584c() {
        return this.f148246j;
    }

    /* renamed from: d */
    public String mo73585d() {
        return this.f148245i.getUserAgent();
    }

    /* renamed from: f */
    public void mo73818f() {
        Log.m105924i("Luggage.LuggageWebCore", "destroy");
        if (!this.f148247n) {
            this.f148245i.destroy();
        }
    }

    @Deprecated
    /* renamed from: g */
    public <T> T mo73819g() {
        try {
            return this.f148245i.getView();
        } catch (Exception e) {
            Log.m105921e(C53133t.class.getSimpleName(), "CoreImpl cast failed", e);
            return null;
        }
    }

    /* renamed from: h */
    public synchronized void mo73820h() {
        if (!this.f148251r) {
            Log.printInfoStack("Luggage.LuggageWebCore", "try inject jsbridge", new Object[0]);
            this.f148246j.mo73016a();
            C53135u uVar = this.f148244h;
            if (uVar != null) {
                C48319p pVar = this.f148246j;
                pVar.f129377a.evaluateJavascript(uVar.mo65889a(), (ValueCallback<String>) null);
            }
            this.f148251r = true;
        }
    }

    /* renamed from: i */
    public void mo73821i(String str) {
        this.f148245i.loadUrl(str);
    }

    /* renamed from: j */
    public void mo73822j() {
        if (this.f148247n) {
            this.f148247n = false;
            this.f148248o = new C52511b();
            this.f148249p = new C52513d();
            this.f148248o.mo73445a(new C52510a(this.f148242f));
        }
    }

    /* renamed from: k */
    public void mo73823k(Context context) {
        this.f148242f.setBaseContext(context);
        C48619a aVar = this.f148245i;
        if (aVar != null) {
            aVar.setContext(context);
        }
    }
}
