package wm1;

import bl3.C39818r;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C47350c;
import os1.C62153d;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C50855po0;
import te3.C50989qo0;

/* renamed from: wm1.j */
public final class C15548j extends C60628i {

    /* renamed from: g */
    public C11385n f42138g;

    /* renamed from: h */
    public C47350c f42139h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15548j(C49712hj1 hj12, int i, String str, String str2, String str3, String str4, int i2, C8480h hVar) {
        this(hj12, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f42138g = nVar;
        return dispatch(gVar, this.f42139h, this);
    }

    public int getType() {
        return 4210;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f42138g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15548j(C49712hj1 hj12, int i, String str, String str2, String str3, String str4) {
        super(hj12);
        C87412m.m108594g(str, "byPass");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "encrypted_object_id");
        C87412m.m108594g(str4, "object_nonce_id");
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50855po0 po02 = new C50855po0();
        po02.f139859d = C46523h2.f125330a.mo71860b(4210, hj12);
        po02.f139860e = ((Number) X0.f38555d).floatValue();
        po02.f139861f = ((Number) X0.f38556e).floatValue();
        po02.f139862g = i;
        po02.f139863h = str;
        po02.f139865j = str3;
        po02.f139866n = str4;
        po02.f139864i = str2;
        bVar.f127066a = po02;
        bVar.f127067b = new C50989qo0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetlivetabs";
        bVar.f127069d = 4210;
        this.f42139h = bVar.mo72403a();
    }
}
