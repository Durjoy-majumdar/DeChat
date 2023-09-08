package p1091b3;

import android.content.Context;
import java.util.concurrent.Callable;
import p1091b3.C113130j;

/* renamed from: b3.h */
public class C113128h implements Callable<C113130j.C113131a> {

    /* renamed from: d */
    public final /* synthetic */ String f338519d;

    /* renamed from: e */
    public final /* synthetic */ Context f338520e;

    /* renamed from: f */
    public final /* synthetic */ C104030e f338521f;

    /* renamed from: g */
    public final /* synthetic */ int f338522g;

    public C113128h(String str, Context context, C104030e eVar, int i) {
        this.f338519d = str;
        this.f338520e = context;
        this.f338521f = eVar;
        this.f338522g = i;
    }

    public Object call() {
        try {
            return C113130j.m154795a(this.f338519d, this.f338520e, this.f338521f, this.f338522g);
        } catch (Throwable unused) {
            return new C113130j.C113131a(-3);
        }
    }
}
