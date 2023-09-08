package s33;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51163rv3;
import te3.fv4;
import te3.ga4;
import te3.tv4;
import te3.uv4;
import te3.vt4;
import z33.C112597j;

/* renamed from: s33.j */
public class C101531j extends C63696n<tv4, uv4> {

    /* renamed from: s33.j$a */
    public class C101532a implements C11385n {
        public C101532a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153938c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext onVoipSpeedResultResp errType=" + i + " errCode=" + i2 + " errMsg=" + str);
            C101531j.this.f180559g.mo152706h();
        }
    }

    public C101531j(long j, long j2, int i, String str, String str2, double d, double d2, int i2, int i3, byte[] bArr) {
        long j3 = j;
        long j4 = j2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new tv4();
        bVar.f127067b = new uv4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipspeedresult";
        bVar.f127069d = 901;
        bVar.f127070e = 901;
        bVar.f127071f = 1000000901;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        tv4 tv4 = (tv4) a.f127055a.f127080a;
        tv4.f299545d = j3;
        tv4.f299546e = j4;
        tv4.f299547f = i;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        tv4.f299548g = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str2;
        rv33.f141176e = true;
        tv4.f299549h = rv33;
        tv4.f299550i = d;
        tv4.f299551j = d2;
        tv4.f299552n = i2;
        tv4.f299553o = i3;
        try {
            fv4 fv4 = (fv4) new fv4().parseFrom(bArr);
            for (int i4 = 0; i4 < fv4.f133713d.size(); i4++) {
                ga4 ga4 = new ga4();
                ga4.f298277d = fv4.f133713d.get(i4).f298209e;
                ga4.f298278e = fv4.f133713d.get(i4).f298210f;
                ga4.f298279f = fv4.f133713d.get(i4).f298211g;
                vt4 vt4 = new vt4();
                ga4.f298280g = vt4;
                vt4.f143694d = fv4.f133713d.get(i4).f298212h;
                ga4.f298280g.f143695e = fv4.f133713d.get(i4).f298213i;
                ga4.f298280g.f143696f = fv4.f133713d.get(i4).f298223v;
                ga4.f298281h = fv4.f133713d.get(i4).f298214j;
                ga4.f298282i = fv4.f133713d.get(i4).f298215n;
                ga4.f298283j = fv4.f133713d.get(i4).f298216o;
                ga4.f298284n = fv4.f133713d.get(i4).f298218q.size();
                for (int i5 = 0; i5 < ga4.f298284n; i5++) {
                    ga4.f298285o.add(fv4.f133713d.get(i4).f298218q.get(i5));
                }
                ga4.f298286p = fv4.f133713d.get(i4).f298219r;
                for (int i6 = 0; i6 < ga4.f298286p; i6++) {
                    ga4.f298287q.add(fv4.f133713d.get(i4).f298220s.get(i6));
                }
                ga4.f298288r = fv4.f133713d.get(i4).f298221t;
                for (int i7 = 0; i7 < ga4.f298288r; i7++) {
                    ga4.f298289s.add(fv4.f133713d.get(i4).f298222u.get(i7));
                }
                ga4.f298290t = fv4.f133713d.get(i4).f298224w;
                tv4.f299554p.add(ga4);
                C112597j.m153938c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext NetSceneVoipSpeedResult testid:" + j3 + " roomkey=" + j4 + " ipstr=" + ga4.f298280g.f143696f + " client ipstr=" + ga4.f298290t);
            }
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneVoipSpeedResult", e, "", new Object[0]);
        }
    }

    public int getType() {
        return 901;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C101532a();
    }
}
