package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
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
import te3.C49882ip2;
import te3.C49966ja;
import te3.C50276lk1;
import te3.C50280ll1;
import te3.C50415mk1;
import te3.C50710oo2;
import te3.C50868ps1;
import te3.C51163rv3;
import te3.C51868wr1;
import te3.C51887ww2;

/* renamed from: qg1.f */
public final class C47826f extends C60625c<C50415mk1> {

    /* renamed from: x */
    public static final /* synthetic */ int f128391x = 0;

    /* renamed from: s */
    public final String f128392s;

    /* renamed from: t */
    public C47827a f128393t;

    /* renamed from: u */
    public C50276lk1 f128394u;

    /* renamed from: v */
    public int f128395v;

    /* renamed from: w */
    public C51887ww2 f128396w;

    /* renamed from: qg1.f$a */
    public interface C47827a {
        /* renamed from: a */
        void mo9151a(int i, long j, C50415mk1 mk12);

        /* renamed from: b */
        void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12);

        /* renamed from: c */
        void mo9153c(int i, long j);

        /* renamed from: d */
        void mo9154d(int i, int i2, String str, int i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47826f(long j, long j2, int i, String str, int i2, C51887ww2 ww22, C51868wr1 wr12, C49882ip2 ip22, long j3, C47827a aVar, C50280ll1 ll12, int i3, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C50868ps1 ps12;
        C50868ps1 ps13;
        int i4 = i;
        String str2 = str;
        int i5 = i3;
        int i6 = (i5 & 16) != 0 ? 0 : i2;
        Integer num = null;
        C51887ww2 ww23 = (i5 & 32) != 0 ? null : ww22;
        C51868wr1 wr13 = (i5 & 64) != 0 ? null : wr12;
        C49882ip2 ip23 = (i5 & 128) != 0 ? null : ip22;
        long j4 = (i5 & 256) != 0 ? -1 : j3;
        C50280ll1 ll13 = (i5 & 1024) != 0 ? null : ll12;
        C87412m.m108594g(str2, "finderUserName");
        this.f128392s = "Finder.CgiFinderLiveAnchorStatus";
        this.f128393t = aVar;
        C50276lk1 lk12 = new C50276lk1();
        this.f128394u = lk12;
        this.f128395v = i4;
        this.f128396w = ww23;
        lk12.f137483e = j;
        lk12.f137485g = j2;
        lk12.f137486h = str2;
        lk12.f137482d = C46523h2.f125330a.mo71859a(6443);
        C50276lk1 lk13 = this.f128394u;
        lk13.f137487i = i6;
        lk13.f137491p = ll13;
        C50710oo2 oo22 = new C50710oo2();
        oo22.f139284e = (long) i4;
        oo22.f139283d = C31543z5.m39453c();
        C51887ww2 ww24 = this.f128396w;
        if (ww24 != null) {
            oo22.f139286g = ww24;
            this.f128394u.f137490o |= (long) 2;
        }
        if (wr13 != null) {
            oo22.f139285f = wr13;
            this.f128394u.f137490o |= (long) 1;
        }
        if (ip23 != null) {
            oo22.f139287h = ip23;
            this.f128394u.f137490o |= (long) 4;
        }
        this.f128394u.f137484f = C89349b.m111674a(oo22.toByteArray());
        this.f128394u.f137489n = j4;
        Log.m105924i("Finder.CgiFinderLiveAnchorStatus", "opFlag:" + C61926c.m72691p(j4));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f128394u;
        C50415mk1 mk12 = new C50415mk1();
        mk12.setBaseResponse(new C49966ja());
        mk12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = mk12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findersetanchorstatus";
        bVar.f127069d = 6443;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        sb.append(this.f128394u.f137483e);
        sb.append(',');
        sb.append(this.f128394u.f137486h);
        sb.append(',');
        sb.append(this.f128395v);
        sb.append(',');
        C51887ww2 ww25 = this.f128396w;
        sb.append(ww25 != null ? Long.valueOf(ww25.f144323d) : null);
        sb.append(",LiveLotterySetting:[");
        sb.append(ip23 != null ? Integer.valueOf(ip23.f135572e) : null);
        sb.append(',');
        sb.append(ip23 != null ? Long.valueOf(ip23.f135571d) : null);
        sb.append("],GameTeamSetting:[");
        sb.append((wr13 == null || (ps13 = wr13.f144238e) == null) ? null : Integer.valueOf(ps13.f139936e));
        sb.append(',');
        sb.append((wr13 == null || (ps12 = wr13.f144238e) == null) ? null : Integer.valueOf(ps12.f139935d));
        sb.append(',');
        sb.append(wr13 != null ? Integer.valueOf(wr13.f144237d) : num);
        sb.append(']');
        Log.m105924i("Finder.CgiFinderLiveAnchorStatus", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50415mk1 mk12 = (C50415mk1) eu32;
        C87412m.m108594g(mk12, "resp");
        String str2 = this.f128392s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            C47827a aVar = this.f128393t;
            long j = 0;
            if (aVar != null) {
                int i3 = this.f128395v;
                C51887ww2 ww22 = this.f128396w;
                aVar.mo9153c(i3, ww22 != null ? ww22.f144323d : 0);
            }
            C47827a aVar2 = this.f128393t;
            if (aVar2 != null) {
                int i4 = this.f128395v;
                C51887ww2 ww23 = this.f128396w;
                if (ww23 != null) {
                    j = ww23.f144323d;
                }
                aVar2.mo9151a(i4, j, mk12);
                return;
            }
            return;
        }
        C47827a aVar3 = this.f128393t;
        if (aVar3 != null) {
            aVar3.mo9154d(i, i2, str, this.f128395v);
        }
        C47827a aVar4 = this.f128393t;
        if (aVar4 != null) {
            aVar4.mo9152b(i, i2, str, this.f128395v, mk12);
        }
    }
}
