package n13;

import a70.C112760b;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;

/* renamed from: n13.c */
public final class C11111c implements Runnable {

    /* renamed from: d */
    public static final C11111c f32888d = new C11111c();

    public final void run() {
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        C86009m1[] u = C112760b.m154236i0("TPCFileTemp").mo119984u();
        if (u != null) {
            for (C86009m1 f : u) {
                f.mo119966f();
            }
        }
    }
}
