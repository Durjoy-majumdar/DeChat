package dj1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49093d41;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50114kd1;
import te3.C50401mh0;
import te3.C51163rv3;
import te3.C51639v31;
import te3.C51660v81;
import te3.C51778w31;
import te3.C52210z31;
import te3.C64756up2;

/* renamed from: dj1.p0 */
public final class C45381p0 extends C60625c<C51778w31> {

    /* renamed from: u */
    public static final C45382a f122894u = new C45382a((C8480h) null);

    /* renamed from: s */
    public final C50401mh0 f122895s;

    /* renamed from: t */
    public C51639v31 f122896t;

    /* renamed from: dj1.p0$a */
    public static final class C45382a {
        public C45382a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C50401mh0 mo70895a(ArrayList<String> arrayList) {
            C87412m.m108594g(arrayList, "commentDataList");
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = 5;
            C50114kd1 kd12 = new C50114kd1();
            C51660v81 v812 = new C51660v81();
            for (String str : arrayList) {
                if (str.length() > 0) {
                    v812.f143383d.add(str);
                }
            }
            kd12.f136669d = v812;
            mh02.f138029e = C89349b.m111674a(kd12.toByteArray());
            return mh02;
        }

        /* renamed from: b */
        public final C50401mh0 mo70896b(String str, boolean z) {
            C87412m.m108594g(str, "appid");
            Log.m105924i("Finder.CgiFinderLiveModBasicInfo", "makeCmdItemForGameRank appid:" + str + ", turnOn:" + z);
            C52210z31 z312 = new C52210z31();
            z312.f145667d = str;
            z312.f145668e = z ? 1 : 2;
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = 2;
            mh02.f138029e = C89349b.m111674a(z312.toByteArray());
            return mh02;
        }

        /* renamed from: c */
        public final C50401mh0 mo70897c(String str) {
            C87412m.m108594g(str, "desc");
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = 3;
            C49093d41 d412 = new C49093d41();
            d412.f132104d = str;
            mh02.f138029e = C89349b.m111674a(d412.toByteArray());
            return mh02;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45381p0(long j, long j2, int i, C50401mh0 mh02) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(mh02, "cmdItem");
        this.f122895s = mh02;
        C51639v31 v312 = new C51639v31();
        this.f122896t = v312;
        v312.f143281e = j;
        v312.f143282f = j2;
        v312.f143283g = i;
        v312.f143280d = C46523h2.f125330a.mo71860b(4175, (C49712hj1) null);
        this.f122896t.f143284h.add(mh02);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122896t;
        C51778w31 w312 = new C51778w31();
        w312.setBaseResponse(new C49966ja());
        w312.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = w312;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivemodbasicinfo";
        bVar.f127069d = 4175;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveModBasicInfo", "liveId " + j + ", objectId " + C61926c.m72691p(j2) + ",scene:" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        Class cls = C54991o.class;
        C87412m.m108594g((C51778w31) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLiveModBasicInfo", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (this.f122895s.f138028d == 7) {
            C58961d.C58963b bVar = C58961d.f168673a;
            FinderLiveService.f159376d.getClass();
            C45795b bVar2 = FinderLiveService.f159348A;
            C64756up2 up22 = null;
            C58969q b = bVar.mo84155b(bVar2 != null ? ((C54991o) bVar2.mo71262a(cls)).f154345o : null);
            if (b != null) {
                C45795b bVar3 = FinderLiveService.f159348A;
                if (bVar3 != null) {
                    up22 = ((C54991o) bVar3.mo71262a(cls)).mo75973N3();
                }
                b.field_liveRoomImg = up22;
                bVar.mo84163k(b);
            }
        }
    }
}
