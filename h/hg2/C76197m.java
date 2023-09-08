package hg2;

import com.tencent.p014mm.vfs.C86009m1;
import f12.C7970a;
import hg2.C76193l;

/* renamed from: hg2.m */
public class C76197m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76193l.C76196c f223230d;

    /* renamed from: e */
    public final /* synthetic */ int f223231e;

    public C76197m(C76193l.C76196c cVar, int i) {
        this.f223230d = cVar;
        this.f223231e = i;
    }

    public void run() {
        C86009m1 m1Var = new C86009m1(C7970a.m8127a());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            C76193l.wx0(this.f223230d);
            return;
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u == null || u.length <= 0) {
            C76193l.wx0(this.f223230d);
            return;
        }
        int i = 0;
        String format = String.format("reader_%d_", new Object[]{Integer.valueOf(this.f223231e)});
        String format2 = String.format("ReaderApp_%d", new Object[]{Integer.valueOf(this.f223231e)});
        while (i < u.length) {
            C76193l.C76196c cVar = this.f223230d;
            if (cVar == null || !cVar.mo106458b()) {
                if (u[i].getName().startsWith(format)) {
                    u[i].mo119966f();
                }
                if (u[i].getName().startsWith(format2)) {
                    u[i].mo119966f();
                }
                i++;
            } else {
                C76193l.wx0(this.f223230d);
                return;
            }
        }
        C76193l.wx0(this.f223230d);
    }

    public String toString() {
        return super.toString() + "|deleteAllPic";
    }
}
