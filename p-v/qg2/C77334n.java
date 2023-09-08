package qg2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C47355o;
import ob0.C89137b0;
import p763ym.C53543s;
import te3.C52012xs;
import te3.C64814ws;

/* renamed from: qg2.n */
public class C77334n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f225457d;

    /* renamed from: e */
    public C47350c f225458e;

    /* renamed from: f */
    public final C72683d f225459f;

    /* renamed from: g */
    public boolean f225460g;

    public C77334n(C72683d dVar, String str, String str2, String str3, String str4, String str5) {
        this(dVar, str, str2, str3, str4, str5, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f225457d = nVar;
        return dispatch(gVar, this.f225458e, this);
    }

    public int getType() {
        return 728;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C53543s.class;
        Log.m105925i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C52012xs xsVar = (C52012xs) ((C47350c) uVar).f127056b.f127083a;
            C72683d dVar = this.f225459f;
            dVar.field_signature = xsVar.f144898d;
            dVar.field_fakeAeskey = xsVar.f144900f;
            dVar.field_fakeSignature = xsVar.f144901g;
            Log.m105925i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", Util.secPrint(this.f225459f.field_signature), Util.secPrint(this.f225459f.field_fakeAeskey), Util.secPrint(this.f225459f.field_fakeSignature), Boolean.valueOf(((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(this.f225459f, new String[0])));
            if (this.f225460g) {
                Object[] objArr = new Object[1];
                String str2 = this.f225459f.field_signature;
                objArr[0] = Integer.valueOf(str2 == null ? -1 : str2.length());
                Log.m105925i("MicroMsg.NetSceneCheckBigFileDownload", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                C72683d dVar2 = this.f225459f;
                dVar2.field_status = 101;
                dVar2.field_lastModifyTime = Util.nowSecond();
                ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(this.f225459f, new String[0]);
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                C72683d dVar3 = this.f225459f;
                b0Var.mo123460f(new C77335p(dVar3.field_msgInfoId, dVar3.field_mediaId, (C47355o) null));
            }
        }
        this.f225457d.onSceneEnd(i2, i3, str, this);
    }

    public C77334n(C72683d dVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f225460g = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64814ws();
        bVar.f127067b = new C52012xs();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkbigfiledownload";
        bVar.f127069d = 728;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f225458e = a;
        this.f225459f = dVar;
        C64814ws wsVar = (C64814ws) a.f127055a.f127080a;
        wsVar.f186198g = str;
        wsVar.f186197f = dVar.field_totalLen;
        wsVar.f186199h = str2;
        wsVar.f186202n = str3;
        wsVar.f186201j = str4;
        wsVar.f186195d = str5;
        wsVar.f186196e = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        wsVar.f186200i = 7;
        Log.m105925i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] autoDownload[%s] stack[%s]", Util.secPrint(wsVar.f186198g), wsVar.f186199h, wsVar.f186202n, wsVar.f186201j, Long.valueOf(wsVar.f186197f), Integer.valueOf(wsVar.f186200i), Boolean.valueOf(z), Util.getStack());
    }
}
