package je1;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import nk1.C61791o;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50114kd1;
import te3.C50868ps1;
import te3.C51163rv3;
import te3.C51660v81;
import te3.C52120yi0;
import te3.C64830xi0;
import zc1.C66785b;

/* renamed from: je1.p */
public final class C60808p extends C60625c<C52120yi0> {

    /* renamed from: s */
    public final String f173194s = "Finder.CgiFinderCreateGameLivePrepare";

    /* renamed from: t */
    public C64830xi0 f173195t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60808p(FinderMedia finderMedia, String str, String str2, String str3, int i, int i2, C50868ps1 ps12, C51660v81 v812, LinkedList<String> linkedList, Integer num, LinkedList<String> linkedList2, LinkedList<String> linkedList3, Integer num2, LinkedList<String> linkedList4, Integer num3, boolean z, byte[] bArr, int i3, int i4) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        FinderMedia finderMedia2 = finderMedia;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i5 = i2;
        C50868ps1 ps13 = ps12;
        boolean z2 = z;
        byte[] bArr2 = bArr;
        int i6 = i3;
        C87412m.m108594g(finderMedia2, "cover_img");
        C87412m.m108594g(str4, "desc");
        C87412m.m108594g(str5, "ticket");
        C87412m.m108594g(str6, "appid");
        Integer num4 = null;
        C64830xi0 xi02 = new C64830xi0();
        this.f173195t = xi02;
        xi02.f186306d = C46523h2.f125330a.mo71859a(6434);
        this.f173195t.f186307e = C66785b.f191882e.mo90662O5();
        C64830xi0 xi03 = this.f173195t;
        xi03.f186308f = finderMedia2;
        xi03.f186309g = str4;
        xi03.f186311i = str5;
        xi03.f186312j = str6;
        xi03.f186313n = i;
        xi03.f186317r = i5;
        xi03.f186320u = ps13;
        xi03.f186322w = linkedList;
        int i7 = 0;
        xi03.f186323x = num3 != null ? num3.intValue() : 0;
        this.f173195t.f186316q = num != null ? num.intValue() : 0;
        if (!C62042e.f176370a.mo87054X0(2)) {
            C64830xi0 xi04 = this.f173195t;
            xi04.f186319t = linkedList2;
            xi04.f186318s = linkedList3;
            xi04.f186315p = linkedList4;
            xi04.f186314o = num2 != null ? num2.intValue() : 0;
        }
        C64830xi0 xi05 = this.f173195t;
        C50114kd1 kd12 = new C50114kd1();
        kd12.f136669d = v812;
        xi05.f186321v = kd12;
        C64830xi0 xi06 = this.f173195t;
        xi06.f186325z = z2 ? 1 : 0;
        xi06.f186324y = bArr2 != null ? new C89349b(bArr2, 0, bArr2.length) : null;
        C64830xi0 xi07 = this.f173195t;
        xi07.f186302A = i6;
        xi07.f186305D = i4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = xi07;
        C52120yi0 yi02 = new C52120yi0();
        yi02.setBaseResponse(new C49966ja());
        yi02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yi02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercreategameliveprepare";
        bVar.f127069d = 6434;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init join_team_up_setting:");
        sb.append(i5);
        sb.append(' ');
        sb.append(ps13 != null ? Integer.valueOf(ps13.f139936e) : null);
        sb.append(' ');
        sb.append(ps13 != null ? Integer.valueOf(ps13.f139935d) : num4);
        sb.append(" , anchorSwitchFlag = ");
        sb.append(this.f173195t.f186323x);
        sb.append(", anchorStatusFlag = ");
        sb.append(this.f173195t.f186316q);
        sb.append(", acknowledgeSpamMsg:");
        sb.append(z2);
        sb.append("liveEntranceType:");
        sb.append(i6);
        Log.m105924i("Finder.CgiFinderCreateGameLivePrepare", sb.toString());
        C61791o.f175673a.mo86722d("Finder.CgiFinderCreateGameLivePrepare", num != null ? num.intValue() : i7);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52120yi0) eu32, "resp");
        String str2 = this.f173194s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
