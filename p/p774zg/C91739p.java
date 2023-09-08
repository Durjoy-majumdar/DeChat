package p774zg;

import com.eclipsesource.mmv8.JavaVoidCallback;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: zg.p */
public class C91739p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JavaVoidCallback f262773d;

    /* renamed from: e */
    public final /* synthetic */ String f262774e;

    /* renamed from: f */
    public final /* synthetic */ C80669j f262775f;

    public C91739p(C80669j jVar, JavaVoidCallback javaVoidCallback, String str) {
        this.f262775f = jVar;
        this.f262773d = javaVoidCallback;
        this.f262774e = str;
    }

    public void run() {
        this.f262775f.mo112501e().registerJavaMethod(this.f262773d, this.f262774e);
    }
}
