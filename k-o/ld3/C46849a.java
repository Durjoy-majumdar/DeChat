package ld3;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p478cp.C45138c;
import te3.C50100ka;
import te3.C50233la;
import te3.C52161ys;
import te3.C52300zs;

/* renamed from: ld3.a */
public class C46849a extends C117747y implements C1311n, C45138c {

    /* renamed from: d */
    public final C45138c.C45139a f126017d;

    /* renamed from: e */
    public C11385n f126018e;

    /* renamed from: f */
    public C47350c f126019f;

    public C46849a(List<C45138c.C45140b> list, C45138c.C45139a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50100ka();
        bVar.f127067b = new C50233la();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchcheckbigfileupload";
        bVar.f127069d = 3939;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126019f = a;
        C50100ka kaVar = (C50100ka) a.f127055a.f127080a;
        for (C45138c.C45140b next : list) {
            C52161ys ysVar = new C52161ys();
            String str = next.f122415f;
            String str2 = next.f122416g;
            if (Util.isNullOrNil(next.f122411b) || Util.isNullOrNil(next.f122410a)) {
                C92779i0.Dx0().getClass();
                ysVar.f145486g = CdnLogic.createAeskey();
                ysVar.f145487h = C92779i0.Dx0().mo127020d(str);
                ysVar.f145490n = C86013q1.m106457r(str);
                ysVar.f145489j = C86013q1.m106454o(str);
                ysVar.f145485f = (long) ((int) C86013q1.m106451l(str));
            } else {
                ysVar.f145486g = next.f122411b;
                ysVar.f145487h = next.f122410a;
                ysVar.f145490n = next.f122412c;
                ysVar.f145489j = next.f122413d;
                ysVar.f145485f = next.f122414e;
            }
            ysVar.f145488i = 7;
            ysVar.f145484e = str2;
            ysVar.f145483d = C75592q0.m90789s();
            Log.m105925i("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig NetSceneBatchCheckBigFileUpload, aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", ysVar.f145486g, ysVar.f145487h, ysVar.f145490n, Long.valueOf(ysVar.f145485f), ysVar.f145489j, ysVar.f145484e, ysVar.f145483d, Util.getStack());
            kaVar.f136629e.add(ysVar);
        }
        kaVar.f136628d = kaVar.f136629e.size();
        this.f126017d = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126018e = nVar;
        return dispatch(gVar, this.f126019f, this);
    }

    public int getType() {
        return 3939;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105919d("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig onGYNetEnd [%d, %d, %s]", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = (C47350c) uVar;
            C50100ka kaVar = (C50100ka) cVar.f127055a.f127080a;
            C50233la laVar = (C50233la) cVar.f127056b.f127083a;
            int i6 = laVar.getBaseResponse().f135955d;
            if (i6 != 0) {
                String str3 = laVar.getBaseResponse().f135956e.f141175d;
                Log.m105920e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig outer resp.getBaseResponse().Ret: " + i6 + ", errMsg:" + str3);
                this.f126018e.onSceneEnd(i4, i6, str3, this);
                C45138c.C45139a aVar = this.f126017d;
                if (aVar != null) {
                    aVar.mo70647a(i6, str3, (List<C45138c.C45141c>) null);
                }
            } else if (kaVar.f136628d == laVar.f137275d && kaVar.f136629e.size() == laVar.f137276e.size() && laVar.f137275d == laVar.f137276e.size()) {
                Iterator<C52300zs> it = laVar.f137276e.iterator();
                while (it.hasNext()) {
                    C52300zs next = it.next();
                    int i7 = next.getBaseResponse().f135955d;
                    String str4 = next.getBaseResponse().f135956e.f141175d;
                    if (i7 != 0) {
                        Log.m105920e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig inner resp.getBaseResponse().Ret: " + next + ", errMsg:" + str4);
                        Map<String, String> parseXml = XmlParser.parseXml(str4, "e", (String) null);
                        String string = parseXml == null ? MMApplicationContext.getContext().getString(C0966R.string.bcp) : parseXml.get(".e.Content");
                        this.f126018e.onSceneEnd(i4, i7, string, this);
                        C45138c.C45139a aVar2 = this.f126017d;
                        if (aVar2 != null) {
                            aVar2.mo70647a(i7, string, (List<C45138c.C45141c>) null);
                            return;
                        }
                        return;
                    }
                }
                this.f126018e.onSceneEnd(i4, i5, str2, this);
                if (this.f126017d != null) {
                    List synchronizedList = Collections.synchronizedList(new ArrayList());
                    for (int i8 = 0; i8 < laVar.f137275d; i8++) {
                        C45138c.C45141c cVar2 = new C45138c.C45141c();
                        String str5 = kaVar.f136629e.get(i8).f145487h;
                        long j = kaVar.f136629e.get(i8).f145485f;
                        String str6 = kaVar.f136629e.get(i8).f145486g;
                        cVar2.f122417a = laVar.f137276e.get(i8).f146197d;
                        cVar2.f122418b = laVar.f137276e.get(i8).f146199f;
                        cVar2.f122419c = laVar.f137276e.get(i8).f146200g;
                        Log.m105919d("MicroMsg.NetSceneBatchCheckBigFileUpload", "summersafecdn onGYNetEnd Signature[%s], fuin[%d], faeskey[%s], fSignature[%s]", cVar2.f122417a, Integer.valueOf(laVar.f137276e.get(i8).f146198e), cVar2.f122418b, cVar2.f122419c);
                        synchronizedList.add(cVar2);
                    }
                    this.f126017d.mo70647a(0, "", synchronizedList);
                }
            } else {
                Log.m105920e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig  req.count: " + kaVar.f136628d + " not equals resp.Count:" + laVar.f137275d + ", resp.List.size() = " + laVar.f137276e.size());
                this.f126018e.onSceneEnd(i4, -1000, "req-count mismatch resp-count", this);
                C45138c.C45139a aVar3 = this.f126017d;
                if (aVar3 != null) {
                    aVar3.mo70647a(-1000, MMApplicationContext.getContext().getString(C0966R.string.bco), (List<C45138c.C45141c>) null);
                }
            }
        } else {
            Log.m105920e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i4 + ", errCode = " + i5);
            this.f126018e.onSceneEnd(i4, i5, str2, this);
            if (this.f126017d != null) {
                String string2 = Util.isNullOrNil(str) ? MMApplicationContext.getContext().getString(C0966R.string.bcq) : str2;
                C45138c.C45139a aVar4 = this.f126017d;
                if (i5 == 0) {
                    i5 = -1001;
                }
                aVar4.mo70647a(i5, string2, (List<C45138c.C45141c>) null);
            }
        }
    }
}
