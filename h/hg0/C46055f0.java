package hg0;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C50379mb2;
import te3.C51018qv3;

/* renamed from: hg0.f0 */
public class C46055f0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C50379mb2 f124177a = new C50379mb2();

    public int getCmdId() {
        return 48;
    }

    public int getFuncId() {
        return 107;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132537a());
        C50379mb2 mb22 = this.f124177a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        mb22.f137941g = qv32;
        this.f124177a.setBaseRequest(C89631w.m112065a(this));
        return this.f124177a.toByteArray();
    }
}
