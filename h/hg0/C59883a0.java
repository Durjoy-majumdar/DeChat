package hg0;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C64413h70;

/* renamed from: hg0.a0 */
public class C59883a0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C64413h70 f170954a = new C64413h70();

    public int getFuncId() {
        return C82102w.CTRL_INDEX;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132537a());
        C64413h70 h702 = this.f170954a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        h702.f183415d = qv32;
        this.f170954a.setBaseRequest(C89631w.m112065a(this));
        return this.f170954a.toByteArray();
    }
}
