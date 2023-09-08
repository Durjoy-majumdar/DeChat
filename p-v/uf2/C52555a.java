package uf2;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.LinkedList;
import nm0.C89025e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import p680ru.C101464l;
import te3.C49973jc0;
import te3.C50109kc0;
import te3.C50241lc0;

/* renamed from: uf2.a */
public class C52555a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146778d;

    /* renamed from: e */
    public C47350c f146779e;

    /* renamed from: f */
    public int f146780f;

    public C52555a(int i, String str, String str2, float f, float f2, int i2, int i3, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49973jc0();
        bVar.f127067b = new C50109kc0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
        bVar.f127069d = C89025e.C89026a.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146779e = a;
        C49973jc0 jc02 = (C49973jc0) a.f127055a.f127080a;
        this.f146780f = i;
        jc02.f136006d = i;
        jc02.f136007e = str;
        jc02.f136014o = str2;
        jc02.f136008f = f2;
        jc02.f136009g = f;
        jc02.f136010h = i2;
        if (!Util.isNullOrNil(str3)) {
            jc02.f136011i = str3;
        }
        if (!Util.isNullOrNil(str4)) {
            jc02.f136012j = str4;
        }
        jc02.f136013n = i3;
        Log.m105919d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "OpCode:%d, Ticket:%s, Longitude:%f, Latitude:%f, Precision:%d, MackAddr:%s, CellId:%s, GPSSource:%d", Integer.valueOf(i), str2, Float.valueOf(f2), Float.valueOf(f), Integer.valueOf(i2), str3, str4, Integer.valueOf(i3));
        ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2007, f2, f, i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146778d = nVar;
        return dispatch(gVar, this.f146779e, this);
    }

    public int getType() {
        return C89025e.C89026a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50109kc0 kc02;
        LinkedList<C50241lc0> linkedList;
        String str2 = str;
        char c = 0;
        int i4 = 2;
        Log.m105919d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (!(this.f146780f != 0 || (kc02 = (C50109kc0) this.f146779e.f127056b.f127083a) == null || (linkedList = kc02.f136657f) == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            int size = linkedList.size();
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 < size) {
                C50241lc0 lc02 = linkedList.get(i5);
                C68097n nVar = new C68097n();
                if (!Util.isNullOrNil(lc02.f137292d)) {
                    nVar.f195728a = lc02.f137292d;
                } else {
                    nVar.f195728a = lc02.f137293e;
                }
                Object[] objArr = new Object[i4];
                objArr[c] = lc02.f137292d;
                objArr[1] = lc02.f137295g + "";
                Log.m105919d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "cpan[onGYNetEnd]UserName:%s SmallImgUrl:%s", objArr);
                nVar.f195731d = lc02.f137295g;
                nVar.f195733f = 1;
                arrayList.add(nVar);
                i5++;
                c = 0;
                i4 = 2;
            }
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93609jo(arrayList);
            Log.m105919d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "use time:%s", (System.currentTimeMillis() - currentTimeMillis) + "");
        }
        this.f146778d.onSceneEnd(i2, i3, str2, this);
    }
}
