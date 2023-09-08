package ob0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: ob0.c0 */
public class C89140c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f256840d;

    /* renamed from: e */
    public final /* synthetic */ C89137b0 f256841e;

    public C89140c0(C89137b0 b0Var, int i) {
        this.f256841e = b0Var;
        this.f256840d = i;
    }

    public void run() {
        C89137b0 b0Var = this.f256841e;
        int i = this.f256840d;
        synchronized (b0Var.f256817o) {
            Iterator<C117747y> it = b0Var.f256811f.iterator();
            while (it.hasNext()) {
                C117747y next = it.next();
                if (next != null && next.hashCode() == i) {
                    Log.printInfoStack("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", Integer.valueOf(next.hashCode()));
                    next.cancel();
                    it.remove();
                }
            }
            Iterator<C117747y> it4 = b0Var.f256812g.iterator();
            while (it4.hasNext()) {
                C117747y next2 = it4.next();
                if (next2 != null && next2.hashCode() == i) {
                    Log.printInfoStack("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", Integer.valueOf(next2.hashCode()));
                    next2.cancel();
                    it4.remove();
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "|cancelImp_" + this.f256840d;
    }
}
