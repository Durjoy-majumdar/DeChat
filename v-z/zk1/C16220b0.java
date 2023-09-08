package zk1;

import android.widget.ScrollView;
import rx3.C36570n;

/* renamed from: zk1.b0 */
public final class C16220b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43443d;

    public C16220b0(C16229h hVar) {
        this.f43443d = hVar;
    }

    public final void run() {
        C16229h hVar = this.f43443d;
        hVar.f43477T = ((ScrollView) ((C36570n) hVar.f43496t).getValue()).getMeasuredHeight();
    }
}
