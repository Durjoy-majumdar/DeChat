package qe3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import qe3.C89631w;
import te3.C50190kx1;
import te3.C51018qv3;

/* renamed from: qe3.l0 */
public class C47815l0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C50190kx1 f128379a = new C50190kx1();

    public int getCmdId() {
        return WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED;
    }

    public int getFuncId() {
        return 381;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132537a());
        C50190kx1 kx12 = this.f128379a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        kx12.f137079d = qv32;
        this.f128379a.f137080e = C101125b1.m132538d().f296014c;
        this.f128379a.setBaseRequest(C89631w.m112065a(this));
        return this.f128379a.toByteArray();
    }
}
