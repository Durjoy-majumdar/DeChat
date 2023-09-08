package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48703af0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64781vp2;
import te3.C64785vw2;
import te3.C64879ze0;
import zc1.C66785b;

/* renamed from: dj1.c */
public final class C58276c extends C58286q<C48703af0> {

    /* renamed from: t */
    public final C58277a f166876t;

    /* renamed from: u */
    public final String f166877u = "Finder.CgiFinderActivateLiveMic";

    /* renamed from: v */
    public C64879ze0 f166878v;

    /* renamed from: dj1.c$a */
    public interface C58277a {
        /* renamed from: a */
        void mo75776a(int i, int i2, String str, C48703af0 af02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58276c(long j, long j2, String str, byte[] bArr, int i, String str2, int i2, LinkedList<C64785vw2> linkedList, LinkedList<C64785vw2> linkedList2, LinkedList<C64781vp2> linkedList3, LinkedList<C64785vw2> linkedList4, C58277a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        String str3;
        long j3 = j;
        long j4 = j2;
        String str4 = str;
        String str5 = str2;
        int i3 = i2;
        LinkedList<C64785vw2> linkedList5 = linkedList2;
        LinkedList<C64785vw2> linkedList6 = linkedList4;
        String str6 = null;
        this.f166876t = aVar;
        C64879ze0 ze02 = new C64879ze0();
        this.f166878v = ze02;
        ze02.f186688f = j3;
        ze02.f186686d = C46523h2.f125330a.mo71859a(6802);
        C64879ze0 ze03 = this.f166878v;
        ze03.f186689g = j4;
        ze03.f186690h = str4;
        ze03.f186692j = C66785b.f191882e.mo90662O5();
        C64879ze0 ze04 = this.f166878v;
        ze04.f186691i = i;
        ze04.f186687e = C89349b.m111674a(bArr);
        C64879ze0 ze05 = this.f166878v;
        ze05.f186693n = str5;
        ze05.f186694o = i3;
        ze05.f186695p = linkedList;
        ze05.f186696q = linkedList5 == null ? new LinkedList<>() : linkedList5;
        this.f166878v.f186697r = linkedList3 == null ? new LinkedList<>() : linkedList3;
        this.f166878v.f186698s = linkedList6 == null ? new LinkedList<>() : linkedList6;
        StringBuilder sb = new StringBuilder();
        sb.append("activate live mic id:");
        sb.append(j3);
        sb.append(" objectId:");
        sb.append(j4);
        sb.append(" objectNonceId:");
        sb.append(str4);
        sb.append(" sessionId:");
        sb.append(str5);
        sb.append(" micType: ");
        sb.append(i3);
        sb.append(" self: ");
        sb.append(linkedList5 != null ? mo83053s(linkedList5) : null);
        sb.append(" otherInfo: ");
        if (linkedList3 != null) {
            StringBuilder sb4 = new StringBuilder();
            for (C64781vp2 vp22 : linkedList3) {
                LinkedList<C64785vw2> linkedList7 = vp22.f185967e;
                String s = linkedList7 != null ? mo83053s(linkedList7) : "";
                StringBuilder sb5 = new StringBuilder();
                sb5.append("otherAnchorId: ");
                C64785vw2 vw22 = vp22.f185966d;
                sb5.append(vw22 != null ? vw22.f185994d : null);
                sb5.append(" anchorSession: ");
                C64785vw2 vw23 = vp22.f185966d;
                sb5.append(vw23 != null ? vw23.f185995e : null);
                sb5.append("  otherAudience: ");
                sb5.append(s);
                sb4.append(sb5.toString());
            }
            str3 = sb4.toString();
            C87412m.m108593f(str3, "sb.toString()");
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(" unrecognized: ");
        sb.append(linkedList6 != null ? mo83053s(linkedList6) : str6);
        Log.m105924i("Finder.CgiFinderActivateLiveMic", sb.toString());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f166878v;
        C48703af0 af02 = new C48703af0();
        C49966ja jaVar = new C49966ja();
        af02.BaseResponse = jaVar;
        jaVar.f135956e = new C51163rv3();
        bVar.f127067b = af02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderactivatelivemic";
        bVar.f127069d = 6802;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C48703af0 af02 = (C48703af0) eu32;
        C87412m.m108594g(af02, "resp");
        String str2 = this.f166877u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C58277a aVar = this.f166876t;
        if (aVar != null) {
            aVar.mo75776a(i, i2, str, af02);
        }
    }

    /* renamed from: s */
    public final String mo83053s(LinkedList<C64785vw2> linkedList) {
        C87412m.m108594g(linkedList, "<this>");
        StringBuilder sb = new StringBuilder();
        for (C64785vw2 vw22 : linkedList) {
            sb.append("id: " + vw22.f185994d + " session: " + vw22.f185995e + " is_video_enabled: " + vw22.f185996f + " is_audio_enabled: " + vw22.f185997g + 10);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
