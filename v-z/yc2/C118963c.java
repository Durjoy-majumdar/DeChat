package yc2;

import android.view.View;

/* renamed from: yc2.c */
public class C118963c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f356344d;

    /* renamed from: e */
    public final /* synthetic */ int f356345e;

    /* renamed from: f */
    public final /* synthetic */ int f356346f;

    /* renamed from: g */
    public final /* synthetic */ View f356347g;

    /* renamed from: h */
    public final /* synthetic */ C118965e f356348h;

    public C118963c(C118965e eVar, boolean[] zArr, int i, int i2, View view) {
        this.f356348h = eVar;
        this.f356344d = zArr;
        this.f356345e = i;
        this.f356346f = i2;
        this.f356347g = view;
    }

    public void run() {
        this.f356344d[0] = this.f356348h.mo183652f(this.f356345e, this.f356346f, this.f356347g);
        synchronized (this.f356344d) {
            boolean[] zArr = this.f356344d;
            zArr[1] = true;
            zArr.notifyAll();
        }
    }
}
