package nv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import pe3.C47465a;
import pv0.C100965f0;
import pv0.C62560e0;

/* renamed from: nv0.b */
public class C100216b extends C20842c {

    /* renamed from: u */
    public C62560e0 f293632u = new C62560e0();

    /* renamed from: v */
    public C100965f0 f293633v = new C100965f0();

    public C100216b(int i) {
        this.f293632u.f177686d = i;
    }

    public int getType() {
        return 3;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f293632u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f293633v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        if (this.f293633v.f295650e == 0) {
            mo32546m1(0, 0, "ok");
            return;
        }
        Log.m105921e("MicroMsg.BakSceneCommand", " type:%d  errCode:%d", Integer.valueOf(this.f293632u.f177686d), Integer.valueOf(this.f293633v.f295650e));
        mo32546m1(4, this.f293633v.f295650e, "fail");
    }
}
