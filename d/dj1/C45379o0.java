package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51338t31;
import te3.C51489u31;
import te3.C52312zv0;

/* renamed from: dj1.o0 */
public final class C45379o0 extends C58286q<C51489u31> {

    /* renamed from: t */
    public final String f122890t = "Finder.CgiFinderLiveModBackgroundMusic";

    /* renamed from: u */
    public int f122891u;

    /* renamed from: v */
    public C45380a f122892v;

    /* renamed from: w */
    public C51338t31 f122893w;

    /* renamed from: dj1.o0$a */
    public interface C45380a {
        /* renamed from: a */
        void mo70894a(int i, int i2, String str, int i3, C51489u31 u312);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45379o0(long j, byte[] bArr, String str, long j2, C52312zv0 zv02, int i, C45380a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(zv02, "musicInfo");
        C87412m.m108594g(aVar, "callback");
        LinkedList<Integer> linkedList = null;
        boolean z = true;
        this.f122891u = i;
        this.f122892v = aVar;
        C51338t31 t312 = new C51338t31();
        this.f122893w = t312;
        t312.f141916d = C46523h2.f125330a.mo71859a(6813);
        C51338t31 t313 = this.f122893w;
        t313.f141920h = j;
        t313.f141919g = C89349b.m111674a(bArr);
        C51338t31 t314 = this.f122893w;
        t314.f141917e = str;
        t314.f141921i = j2;
        t314.f141918f = zv02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = t314;
        C51489u31 u312 = new C51489u31();
        u312.setBaseResponse(new C49966ja());
        u312.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = u312;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivemodbackgroundmusic";
        bVar.f127069d = 6813;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiFinderLiveModBackgroundMusic init ");
        sb.append(this.f122893w.f141920h);
        sb.append(',');
        sb.append(this.f122893w.f141917e);
        sb.append(", times:");
        sb.append(this.f122891u);
        sb.append(", song_id_list:");
        C52312zv0 zv03 = this.f122893w.f141918f;
        sb.append(zv03 != null ? zv03.f146240d : linkedList);
        sb.append(",liveCookies is null:");
        sb.append(this.f122893w.f141919g != null ? false : z);
        Log.m105924i("Finder.CgiFinderLiveModBackgroundMusic", sb.toString());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51489u31 u312 = (C51489u31) eu32;
        C87412m.m108594g(u312, "resp");
        String str2 = this.f122890t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " times:" + this.f122891u + " thread=" + Thread.currentThread());
        this.f122892v.mo70894a(i, i2, str, this.f122891u, u312);
    }
}
