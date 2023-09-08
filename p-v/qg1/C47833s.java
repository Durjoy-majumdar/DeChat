package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50723os0;
import te3.C50867ps0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: qg1.s */
public final class C47833s extends C60625c<C50867ps0> {

    /* renamed from: u */
    public static final /* synthetic */ int f128404u = 0;

    /* renamed from: s */
    public final String f128405s = "Finder.CgiFinderLiveModPromoteInfo";

    /* renamed from: t */
    public C50723os0 f128406t;

    /* renamed from: qg1.s$a */
    public static final class C47834a {

        /* renamed from: a */
        public final long f128407a;

        /* renamed from: b */
        public final long f128408b;

        /* renamed from: c */
        public final int f128409c;

        /* renamed from: d */
        public final C89349b f128410d;

        public C47834a(long j, long j2, int i, C89349b bVar) {
            this.f128407a = j;
            this.f128408b = j2;
            this.f128409c = i;
            this.f128410d = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47834a)) {
                return false;
            }
            C47834a aVar = (C47834a) obj;
            return this.f128407a == aVar.f128407a && this.f128408b == aVar.f128408b && this.f128409c == aVar.f128409c && C87412m.m108589b(this.f128410d, aVar.f128410d);
        }

        public int hashCode() {
            long j = this.f128407a;
            long j2 = this.f128408b;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f128409c) * 31;
            C89349b bVar = this.f128410d;
            return i + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "FinderLiveModPromoteInfoReq(objectId=" + this.f128407a + ", liveId=" + this.f128408b + ", optType=" + this.f128409c + ", op_cmd_req_buf=" + this.f128410d + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47833s(C47834a aVar) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(aVar, "promoteInfoReq");
        C50723os0 os02 = new C50723os0();
        this.f128406t = os02;
        os02.f139346d = C46523h2.f125330a.mo71859a(6254);
        C50723os0 os03 = this.f128406t;
        os03.f139348f = aVar.f128407a;
        os03.f139349g = aVar.f128408b;
        os03.f139347e = C66785b.f191882e.mo90662O5();
        C50723os0 os04 = this.f128406t;
        os04.f139350h = aVar.f128409c;
        os04.f139351i = aVar.f128410d;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = os04;
        C50867ps0 ps02 = new C50867ps0();
        ps02.setBaseResponse(new C49966ja());
        ps02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ps02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveanchormodpromoteinfolist";
        bVar.f127069d = 6254;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveModPromoteInfo", "init liveId:" + aVar.f128408b + ", objectId:" + aVar.f128407a + ", op_type" + aVar.f128409c);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50867ps0) eu32, "resp");
        String str2 = this.f128405s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        switch (i2) {
            case -200194:
            case -200193:
                C61926c.m72668M(C12230t.f35301d);
                return;
            default:
                return;
        }
    }
}
