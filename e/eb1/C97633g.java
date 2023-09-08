package eb1;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C101852uv1;
import te3.C51018qv3;

/* renamed from: eb1.g */
public class C97633g extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C101852uv1 f286405a = new C101852uv1();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 733;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C101852uv1 uv12 = this.f286405a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        uv12.f299639g = qv32;
        this.f286405a.setBaseRequest(C89631w.m112065a(this));
        setPassKey(this.f286405a.f299639g.f140574f.mo123703f());
        return this.f286405a.toByteArray();
    }
}
