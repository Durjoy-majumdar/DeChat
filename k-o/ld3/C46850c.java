package ld3;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52161ys;
import te3.C52300zs;

/* renamed from: ld3.c */
public class C46850c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126020d;

    /* renamed from: e */
    public C47350c f126021e;

    /* renamed from: f */
    public final C46851a f126022f;

    /* renamed from: ld3.c$a */
    public interface C46851a {
        /* renamed from: a */
        void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j);
    }

    public C46850c(C68070l.C68072b bVar, String str, String str2, C46851a aVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C52161ys();
        bVar2.f127067b = new C52300zs();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/checkbigfileupload";
        bVar2.f127069d = 727;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f126021e = a;
        C52161ys ysVar = (C52161ys) a.f127055a.f127080a;
        if (bVar == null || Util.isNullOrNil(bVar.f195524R) || Util.isNullOrNil(bVar.f195622s)) {
            C92779i0.Dx0().getClass();
            ysVar.f145486g = CdnLogic.createAeskey();
            ysVar.f145487h = C92779i0.Dx0().mo127020d(str);
            ysVar.f145490n = C86013q1.m106457r(str);
            ysVar.f145489j = C86013q1.m106454o(str);
            ysVar.f145485f = (long) ((int) C86013q1.m106451l(str));
        } else {
            ysVar.f145486g = bVar.f195524R;
            ysVar.f145487h = bVar.f195622s;
            ysVar.f145490n = bVar.f195570f;
            ysVar.f145489j = bVar.f195602n;
            ysVar.f145485f = (long) bVar.f195594l;
        }
        ysVar.f145488i = 7;
        ysVar.f145484e = str2;
        ysVar.f145483d = C75592q0.m90789s();
        this.f126022f = aVar;
        Log.m105925i("MicroMsg.NetSceneCheckBigFileUpload", "summerbig NetSceneCheckBigFileUpload content[%s], aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", bVar, ysVar.f145486g, ysVar.f145487h, ysVar.f145490n, Long.valueOf(ysVar.f145485f), ysVar.f145489j, ysVar.f145484e, ysVar.f145483d, Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126020d = nVar;
        return dispatch(gVar, this.f126021e, this);
    }

    public int getType() {
        return 727;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        Log.m105919d("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd [%d, %d, %s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f126020d.onSceneEnd(i2, i3, str, this);
            C47350c cVar = (C47350c) uVar;
            C52161ys ysVar = (C52161ys) cVar.f127055a.f127080a;
            C52300zs zsVar = (C52300zs) cVar.f127056b.f127083a;
            Log.m105919d("MicroMsg.NetSceneCheckBigFileUpload", "summersafecdn onGYNetEnd Signature[%s], fuin[%d], faeskey[%s], fSignature[%s]", zsVar.f146197d, Integer.valueOf(zsVar.f146198e), zsVar.f146199f, zsVar.f146200g);
            if (this.f126022f != null) {
                if (zsVar.getBaseResponse().f135955d != 0) {
                    Map<String, String> parseXml = XmlParser.parseXml(zsVar.getBaseResponse().f135956e.f141175d, "e", (String) null);
                    str2 = parseXml == null ? MMApplicationContext.getContext().getString(C0966R.string.bcp) : parseXml.get(".e.Content");
                } else {
                    str2 = "";
                }
                this.f126022f.mo72061a(str2, ysVar.f145487h, ysVar.f145486g, zsVar.f146197d, zsVar.f146199f, zsVar.f146200g, ysVar.f145485f);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i2 + ", errCode = " + i3);
        this.f126020d.onSceneEnd(i2, i3, str, this);
        if (this.f126022f != null) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.bcq);
            if (!Util.isNullOrNil(str)) {
                Map<String, String> parseXml2 = XmlParser.parseXml(str, "e", (String) null);
                string = parseXml2 == null ? MMApplicationContext.getContext().getString(C0966R.string.bcp) : parseXml2.get(".e.Content");
            }
            this.f126022f.mo72061a(string, "", "", "", "", "", 0);
        }
    }
}
