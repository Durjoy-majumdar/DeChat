package mv2;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1706k2;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.xl4;

/* renamed from: mv2.c */
public class C47103c extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public xl4 f126575a = new xl4();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return C1706k2.CTRL_INDEX;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        xl4 xl4 = this.f126575a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        xl4.f144743g = qv32;
        this.f126575a.setBaseRequest(C89631w.m112065a(this));
        setPassKey(this.f126575a.f144743g.f140574f.mo123703f());
        return this.f126575a.toByteArray();
    }
}
