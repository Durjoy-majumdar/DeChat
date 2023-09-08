package hg0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import mg0.C76754b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p196ln.C76708i;
import p586km.C46733b;
import p749xh.C38577i;
import rm0.C90029f;
import sf0.C77691f;
import te3.C48886bo2;
import te3.C49032co2;
import te3.C52102yd2;
import te3.C52249zd2;

/* renamed from: hg0.r0 */
public class C46061r0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124191d;

    /* renamed from: e */
    public C11385n f124192e;

    /* renamed from: f */
    public ArrayList<C46065v> f124193f;

    /* renamed from: g */
    public int f124194g;

    /* renamed from: h */
    public int f124195h;

    /* renamed from: i */
    public int f124196i;

    /* renamed from: j */
    public int f124197j;

    /* renamed from: n */
    public HashMap<String, C46065v> f124198n = new HashMap<>();

    /* renamed from: o */
    public String f124199o;

    public C46061r0(ArrayList<C46065v> arrayList, int i, HashMap<String, C46065v> hashMap, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48886bo2();
        bVar.f127067b = new C49032co2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/listgooglecontact";
        bVar.f127069d = C90029f.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f124191d = bVar.mo72403a();
        this.f124193f = arrayList;
        this.f124194g = i;
        this.f124195h = 0;
        this.f124197j = 1;
        this.f124198n = hashMap;
        this.f124199o = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
        this.f124192e = nVar;
        C48886bo2 bo22 = (C48886bo2) this.f124191d.f127055a.f127080a;
        if (this.f124193f != null) {
            LinkedList<C52249zd2> linkedList = new LinkedList<>();
            this.f124196i = this.f124193f.size();
            int i = this.f124195h;
            while (i < this.f124196i && i < this.f124195h + 500) {
                C52249zd2 zd22 = new C52249zd2();
                zd22.f145840d = this.f124193f.get(i).field_googlegmail;
                linkedList.add(zd22);
                i++;
            }
            bo22.f131236e = linkedList;
            bo22.f131235d = linkedList.size();
            int i2 = this.f124195h + 500;
            int i3 = this.f124196i;
            if (i2 > i3) {
                this.f124197j = 0;
            } else {
                this.f124197j = 1;
            }
            bo22.f131237f = this.f124197j;
            bo22.f131238g = this.f124194g;
            Log.m105925i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", Integer.valueOf(i3), Integer.valueOf(this.f124195h), Integer.valueOf(this.f124197j));
        }
        return dispatch(gVar, this.f124191d, this);
    }

    public int getType() {
        return C90029f.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        int i7 = 2;
        Log.m105925i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i5 == 0 && i6 == 0) {
            C49032co2 co22 = (C49032co2) this.f124191d.f127056b.f127083a;
            Class cls = C46733b.class;
            synchronized (this) {
                Log.m105925i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", Integer.valueOf(co22.f131870d));
                LinkedList<C52102yd2> linkedList = co22.f131871e;
                if (linkedList != null && linkedList.size() > 0) {
                    int size = co22.f131871e.size();
                    ArrayList arrayList = new ArrayList();
                    LinkedList linkedList2 = new LinkedList();
                    int i8 = 0;
                    while (i8 < size) {
                        C52102yd2 yd22 = co22.f131871e.get(i8);
                        if (!TextUtils.isEmpty(yd22.f145234e)) {
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(yd22.f145234e);
                            i4 = (z1Var == null || !z1Var.mo62927s3()) ? 0 : 2;
                        } else {
                            i4 = 1;
                        }
                        HashMap<String, C46065v> hashMap = this.f124198n;
                        if (hashMap != null && hashMap.containsKey(yd22.f145233d)) {
                            C46065v vVar = this.f124198n.get(yd22.f145233d);
                            vVar.field_username = yd22.f145234e;
                            String str3 = yd22.f145238i;
                            vVar.field_nickname = str3;
                            vVar.field_usernamepy = C77691f.m93687b(str3);
                            vVar.field_nicknameqp = C77691f.m93686a(yd22.f145238i);
                            vVar.field_ret = yd22.f145237h;
                            vVar.field_small_url = yd22.f145236g;
                            vVar.field_big_url = yd22.f145235f;
                            vVar.field_status = i4;
                            vVar.field_googlecgistatus = i7;
                            if (i4 != i7) {
                                if (i4 != 0) {
                                    vVar.field_contecttype = "google";
                                    vVar.field_googlenamepy = C77691f.m93687b(vVar.field_googlename);
                                    arrayList.add(vVar);
                                    ((C76708i) C86312j.m106911c(C76708i.class)).fc0(vVar.field_googleid, vVar.field_googlephotourl, this.f124199o);
                                    C38577i Oi = ((C46733b) C86312j.m106911c(cls)).mo59220Oi();
                                    Oi.field_userName = yd22.f145234e;
                                    Oi.field_scene = 58;
                                    Oi.field_ticket = yd22.f145239j;
                                    linkedList2.add(Oi);
                                }
                            }
                            vVar.field_contecttype = "weixin" + i8;
                            vVar.field_googlenamepy = C77691f.m93687b(vVar.field_googlename);
                            arrayList.add(vVar);
                            ((C76708i) C86312j.m106911c(C76708i.class)).fc0(vVar.field_googleid, vVar.field_googlephotourl, this.f124199o);
                            C38577i Oi2 = ((C46733b) C86312j.m106911c(cls)).mo59220Oi();
                            Oi2.field_userName = yd22.f145234e;
                            Oi2.field_scene = 58;
                            Oi2.field_ticket = yd22.f145239j;
                            linkedList2.add(Oi2);
                        }
                        i8++;
                        i7 = 2;
                    }
                    ((C46067w) ((C76754b) C86312j.m106911c(C76754b.class)).mo105746fv()).mo71481Lo(arrayList);
                    ((C46733b) C86312j.m106911c(cls)).Mt0(linkedList2);
                }
            }
            if (this.f124197j == 1) {
                this.f124195h += 500;
                if (doScene(dispatcher(), this.f124192e) < 0) {
                    Log.m105920e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
                    this.f124192e.onSceneEnd(3, -1, "", this);
                }
            }
            this.f124192e.onSceneEnd(i5, i6, str2, this);
            return;
        }
        this.f124192e.onSceneEnd(i5, i6, str2, this);
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
