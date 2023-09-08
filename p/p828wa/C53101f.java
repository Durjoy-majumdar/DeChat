package p828wa;

import android.content.Context;
import android.webkit.ValueCallback;
import b34.C79664a;
import js0.C88016e;
import p822sa.C48319p;

/* renamed from: wa.f */
public class C53101f extends C53127q {

    /* renamed from: f */
    public final Context f148192f;

    /* renamed from: g */
    public C53102g f148193g;

    /* renamed from: h */
    public C48319p f148194h = new C48319p(this.f148193g);

    public C53101f(Context context, Class<? extends C53102g> cls) {
        this.f148192f = context;
        this.f148193g = (C53102g) new C79664a(cls, cls).mo109791d(context).f233575b;
        mo73781f("var self = this;", (ValueCallback<String>) null);
        mo73781f("let require = process.mainModule.require;", (ValueCallback<String>) null);
        mo73781f(C88016e.m109548e("LuggageBridge.js"), (ValueCallback<String>) null);
        this.f148193g.mo73582B();
    }

    /* renamed from: c */
    public C48319p mo73584c() {
        return this.f148194h;
    }

    /* renamed from: d */
    public String mo73585d() {
        return this.f148193g.getUserAgent();
    }

    /* renamed from: f */
    public void mo73781f(String str, ValueCallback<String> valueCallback) {
        this.f148193g.evaluateJavascript(str, valueCallback);
    }
}
