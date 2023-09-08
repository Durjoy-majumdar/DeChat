package hg0;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C51658v72;

/* renamed from: hg0.c0 */
public class C46052c0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C51658v72 f124175a = new C51658v72();

    public int getFuncId() {
        return 572;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132537a());
        C51658v72 v722 = this.f124175a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        v722.f143377e = qv32;
        this.f124175a.setBaseRequest(C89631w.m112065a(this));
        return this.f124175a.toByteArray();
    }
}
