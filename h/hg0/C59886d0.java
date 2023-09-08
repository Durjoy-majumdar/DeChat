package hg0;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C64518l92;

/* renamed from: hg0.d0 */
public class C59886d0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C64518l92 f170957a = new C64518l92();

    public int getFuncId() {
        return 429;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C64518l92 l922 = this.f170957a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        l922.f184059d = qv32;
        this.f170957a.setBaseRequest(C89631w.m112065a(this));
        return this.f170957a.toByteArray();
    }
}
