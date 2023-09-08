package je0;

import android.database.Cursor;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ge0.C32415b;
import he0.C76158j;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p239sv.C36838i;
import re0.C36304a;
import re0.C36306c;
import re0.C36314k;
import re0.C36315l;
import te3.C48971c83;
import te3.C49076d1;
import te3.C49802i52;
import te3.C49947j52;
import te3.C50915q5;
import te3.b45;

/* renamed from: je0.p */
public class C33548p extends C117747y implements C1311n, C36838i {

    /* renamed from: d */
    public C11385n f90825d;

    /* renamed from: e */
    public final C47350c f90826e;

    /* renamed from: f */
    public String f90827f;

    /* renamed from: g */
    public String f90828g;

    /* renamed from: h */
    public LinkedList<String> f90829h = new LinkedList<>();

    /* renamed from: i */
    public int f90830i = 0;

    public C33548p(String str, String str2, LinkedList<String> linkedList, int i) {
        if (Util.isNullOrNil(str) || !str.equals("wework")) {
            Log.m105929w("MicroMsg.Openim.NetSceneGetOpenIMResource", "NetSceneGetOpenIMResource normal %s stack %s", str, Util.getStack().toString());
        } else {
            Log.m105921e("MicroMsg.Openim.NetSceneGetOpenIMResource", "NetSceneGetOpenIMResource error %s stack %s", str, Util.getStack().toString());
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49802i52();
        bVar.f127067b = new C49947j52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimresource";
        bVar.f127069d = 453;
        this.f90826e = bVar.mo72403a();
        this.f90827f = str;
        this.f90828g = str2;
        this.f90830i = i;
        this.f90829h.addAll(linkedList);
        int size = 10 - this.f90829h.size();
        if (size > 0) {
            LinkedList<String> linkedList2 = this.f90829h;
            C36315l Bx0 = ((C32415b) C86312j.m106911c(C32415b.class)).Bx0();
            Bx0.getClass();
            LinkedList linkedList3 = new LinkedList();
            String str3 = " select wordingId from OpenIMWordingInfo where language='" + str2 + "' order by updateTime limit " + size;
            Log.m105919d("MicroMsg.Openim.OpenIMWordingInfoStg", "getLastWording sql:%s", str3);
            Cursor rawQuery = Bx0.f96671d.rawQuery(str3, (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                do {
                    String string = rawQuery.getString(0);
                    if (!Util.isNullOrNil(string)) {
                        linkedList3.add(string);
                    }
                } while (rawQuery.moveToNext());
            }
            Log.m105919d("MicroMsg.Openim.OpenIMWordingInfoStg", "getLastWording result cnt: %d, language:%s", Integer.valueOf(linkedList3.size()), str2);
            rawQuery.close();
            linkedList2.addAll(linkedList3);
        }
        C49802i52 i522 = (C49802i52) this.f90826e.f127055a.f127080a;
        i522.f135115e = str;
        i522.f135114d = str2;
        i522.f135116f = this.f90829h;
        i522.f135117g = i;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "init NetSceneGetOpenIMResource appid:%s, lang:%s, subType: %s, initWordingIDs:%s, wordidList:%s", str, str2, Integer.valueOf(i), mo59199j1(linkedList), mo59199j1(this.f90829h));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90825d = nVar;
        return dispatch(gVar, this.f90826e, this);
    }

    public int getType() {
        return 453;
    }

    /* renamed from: j1 */
    public final String mo59199j1(LinkedList<String> linkedList) {
        String str = "size:" + linkedList.size() + "[";
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            str = str + it.next() + ",";
        }
        return str + "]";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Class cls = C32415b.class;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid:%s, lang:%s", Integer.valueOf(i2), Integer.valueOf(i3), str2, this.f90827f, this.f90828g);
        if (i4 == 0 && i5 == 0) {
            C49947j52 j522 = (C49947j52) this.f90826e.f127056b.f127083a;
            C49076d1 d1Var = j522.f135875e;
            Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd acct_type_resource  url:%d, word:%d", Integer.valueOf(d1Var.f132058f.size()), Integer.valueOf(d1Var.f132057e.size()));
            C36304a aVar = new C36304a();
            aVar.field_acctTypeId = d1Var.f132056d;
            aVar.field_language = this.f90828g;
            ((C32415b) C86312j.m106911c(cls)).vx0().get(aVar, "acctTypeId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            aVar.field_accTypeRec = d1Var;
            ((C32415b) C86312j.m106911c(cls)).vx0().replace(aVar);
            C50915q5 q5Var = j522.f135874d;
            Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd appid_resource funcFlag:%d, url:%d, word:%d, subType: %s", Integer.valueOf(q5Var.f140141d), Integer.valueOf(q5Var.f140143f.size()), Integer.valueOf(q5Var.f140142e.size()), Integer.valueOf(this.f90830i));
            C36306c cVar = new C36306c();
            cVar.field_appid = this.f90827f;
            cVar.field_language = this.f90828g;
            cVar.field_subType = this.f90830i;
            ((C32415b) C86312j.m106911c(cls)).wx0().get(cVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
            cVar.field_appRec = q5Var;
            cVar.field_acctTypeId = d1Var.f132056d;
            ((C32415b) C86312j.m106911c(cls)).wx0().replace(cVar);
            Iterator<C48971c83> it = q5Var.f140143f.iterator();
            while (it.hasNext()) {
                C48971c83 next = it.next();
                if ("openim_desc_icon".equals(next.f131574d)) {
                    ((C76158j) C86312j.m106911c(C76158j.class)).Lk0(next.f131575e);
                }
            }
            Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd wording_id_resource   word:%d", Integer.valueOf(j522.f135876f.size()));
            Iterator<b45> it4 = j522.f135876f.iterator();
            while (it4.hasNext()) {
                b45 next2 = it4.next();
                C36314k kVar = new C36314k();
                kVar.field_appid = this.f90827f;
                kVar.field_wordingId = next2.f130941d;
                kVar.field_language = this.f90828g;
                ((C32415b) C86312j.m106911c(cls)).Bx0().get(kVar, "appid", "wordingId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
                String str3 = next2.f130942e;
                kVar.field_wording = str3;
                kVar.field_pinyin = next2.f130943f;
                kVar.field_quanpin = next2.f130944g;
                Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd update wordingId: %s, lang: %s, wording: %s, appId: %s", kVar.field_wordingId, kVar.field_language, str3, kVar.field_appid);
                ((C32415b) C86312j.m106911c(cls)).Bx0().replace(kVar);
            }
            this.f90825d.onSceneEnd(i4, i5, str2, this);
            return;
        }
        this.f90825d.onSceneEnd(i4, i5, str2, this);
    }
}
