package p774zg;

import android.text.TextUtils;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8Value;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: zg.c0 */
public abstract class C91688c0 {

    /* renamed from: a */
    public final String f262683a;

    public C91688c0() {
        this("");
    }

    /* renamed from: a */
    public abstract void mo125556a();

    /* renamed from: b */
    public C91688c0 mo125557b(C80669j jVar) {
        if (TextUtils.isEmpty(this.f262683a)) {
            mo125558c(jVar, jVar.mo112501e().getGlobalObject());
        } else {
            V8Object newV8Object = jVar.mo112501e().newV8Object();
            jVar.mo112501e().add(this.f262683a, (V8Value) newV8Object);
            mo125558c(jVar, newV8Object);
            newV8Object.release();
        }
        return this;
    }

    /* renamed from: c */
    public abstract void mo125558c(C80669j jVar, V8Object v8Object);

    public C91688c0(String str) {
        this.f262683a = str;
    }
}
