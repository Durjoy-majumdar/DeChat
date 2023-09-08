package p1091b3;

import android.content.Context;
import java.util.concurrent.Callable;
import p1091b3.C113130j;

/* renamed from: b3.f */
public class C113126f implements Callable<C113130j.C113131a> {

    /* renamed from: d */
    public final /* synthetic */ String f338514d;

    /* renamed from: e */
    public final /* synthetic */ Context f338515e;

    /* renamed from: f */
    public final /* synthetic */ C104030e f338516f;

    /* renamed from: g */
    public final /* synthetic */ int f338517g;

    public C113126f(String str, Context context, C104030e eVar, int i) {
        this.f338514d = str;
        this.f338515e = context;
        this.f338516f = eVar;
        this.f338517g = i;
    }

    public Object call() {
        return C113130j.m154795a(this.f338514d, this.f338515e, this.f338516f, this.f338517g);
    }
}
