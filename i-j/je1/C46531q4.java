package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import ob0.y$$d;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C49877io1;
import te3.C50017jo1;

/* renamed from: je1.q4 */
public final class C46531q4 extends C60628i {

    /* renamed from: g */
    public final String f125358g;

    /* renamed from: h */
    public final int f125359h;

    /* renamed from: i */
    public String f125360i;

    /* renamed from: j */
    public int f125361j;

    /* renamed from: n */
    public final String f125362n = "Finder.NetSceneFinderUploadHeadImg";

    /* renamed from: o */
    public int f125363o;

    /* renamed from: p */
    public byte[] f125364p;

    /* renamed from: q */
    public String f125365q;

    /* renamed from: r */
    public final int f125366r = 51200;

    /* renamed from: s */
    public C11385n f125367s;

    /* renamed from: t */
    public C114770g f125368t;

    /* renamed from: u */
    public final int f125369u = 20;

    /* renamed from: v */
    public final int f125370v = -40000;

    /* renamed from: w */
    public final int f125371w = -40001;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46531q4(String str, int i, String str2, int i2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f125358g = str;
        this.f125359h = i;
        this.f125360i = str2;
        this.f125361j = i2;
        Log.m105924i("Finder.NetSceneFinderUploadHeadImg", "filePath " + str + " and size: " + Util.getSizeKB(C86013q1.m106451l(str)) + " total:" + C86013q1.m106451l(str));
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(this.f125360i)) {
            this.f125360i = C86013q1.m106456q(this.f125358g);
            this.f125361j = (int) C86013q1.m106451l(this.f125358g);
            String str = this.f125362n;
            Log.m105924i(str, "upload img file path:" + this.f125358g + " totalLen:" + this.f125361j + " md5:" + this.f125360i);
        }
        this.f125367s = nVar;
        this.f125368t = gVar;
        return mo71878l1();
    }

    public int getType() {
        return 3759;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125362n;
        Log.m105924i(str2, "errType " + i2 + " errCode " + i3 + " errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUploadHeadImgResponse");
            C50017jo1 jo12 = (C50017jo1) aVar;
            if (jo12.f136230g) {
                this.f125365q = jo12.f136229f;
                String str3 = this.f125362n;
                Log.m105924i(str3, "upload completed " + this.f125365q);
                C11385n nVar = this.f125367s;
                if (nVar != null) {
                    nVar.onSceneEnd(i2, i3, str, this);
                    return;
                }
                return;
            }
            this.f125363o = jo12.f136228e;
            mo71878l1();
            return;
        }
        C11385n nVar2 = this.f125367s;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final int mo71878l1() {
        C11385n nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderuploadheadimg";
        bVar.f127069d = 3759;
        C49877io1 io12 = new C49877io1();
        io12.f135540h = this.f125359h;
        int i = this.f125363o;
        io12.f135537e = i;
        io12.f135536d = this.f125361j;
        io12.f135539g = this.f125360i;
        byte[] O = C86013q1.m106433O(this.f125358g, i, this.f125366r);
        this.f125364p = O;
        if (O == null) {
            C11385n nVar2 = this.f125367s;
            if (nVar2 != null) {
                nVar2.onSceneEnd(3, this.f125371w, "", this);
            }
            return -1;
        }
        io12.f135538f = new C89349b(O, 0, O != null ? O.length : 0);
        String str = this.f125362n;
        StringBuilder sb = new StringBuilder();
        sb.append("next upload start:");
        sb.append(this.f125363o);
        sb.append(", len:");
        byte[] bArr = this.f125364p;
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
        Log.m105924i(str, sb.toString());
        io12.f135541i = C46523h2.f125330a.mo71859a(3759);
        bVar.f127066a = io12;
        bVar.f127067b = new C50017jo1();
        int dispatch = dispatch(this.f125368t, bVar.mo72403a(), this);
        if (dispatch == -1 && (nVar = this.f125367s) != null) {
            nVar.onSceneEnd(3, this.f125370v, "", this);
        }
        return dispatch;
    }

    public int securityLimitCount() {
        return this.f125369u;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        C87412m.m108594g(uVar, "rr");
        return Util.isNullOrNil(this.f125358g) ? y$$d.EFailed : y$$d.EOk;
    }
}
