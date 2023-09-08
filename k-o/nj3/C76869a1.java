package nj3;

import android.app.Activity;

/* renamed from: nj3.a1 */
public class C76869a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76901s0 f224689d;

    /* renamed from: e */
    public final /* synthetic */ Activity f224690e;

    /* renamed from: f */
    public final /* synthetic */ int f224691f;

    public C76869a1(C76901s0 s0Var, Activity activity, int i) {
        this.f224689d = s0Var;
        this.f224690e = activity;
        this.f224691f = i;
    }

    public void run() {
        this.f224689d.showAtLocation(this.f224690e.getWindow().getDecorView(), 48, 0, this.f224691f);
    }
}
