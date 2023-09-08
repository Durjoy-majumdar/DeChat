package mj2;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C50846pl2;
import te3.C51018qv3;

/* renamed from: mj2.b */
public class C47055b extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C50846pl2 f126463a = new C50846pl2();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 694;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(new C101125b1("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
        C50846pl2 pl22 = this.f126463a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        pl22.f139824f = qv32;
        this.f126463a.setBaseRequest(C89631w.m112065a(this));
        return this.f126463a.toByteArray();
    }
}
