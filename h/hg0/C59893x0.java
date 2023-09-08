package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p823sg.C90193h;
import te3.C64326ds2;
import te3.C64868yx2;
import te3.in4;
import te3.jn4;
import wc3.C15131b;

/* renamed from: hg0.x0 */
public class C59893x0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f170970d;

    /* renamed from: e */
    public final List<String> f170971e;

    /* renamed from: f */
    public final List<String> f170972f;

    /* renamed from: g */
    public final String f170973g = ((String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null));

    /* renamed from: h */
    public int f170974h = 0;

    /* renamed from: i */
    public int f170975i = 0;

    /* renamed from: j */
    public int f170976j;

    public C59893x0(List<String> list, List<String> list2) {
        this.f170971e = list;
        this.f170972f = list2;
        this.f170976j = 1;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        List<String> list;
        List<String> list2;
        this.f170970d = nVar;
        List<String> list3 = this.f170971e;
        if ((list3 == null || list3.size() == 0) && ((list2 = this.f170972f) == null || list2.size() == 0)) {
            Log.m105924i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new in4();
        bVar.f127067b = new jn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadmcontact";
        bVar.f127069d = 133;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        in4 in4 = (in4) a.f127055a.f127080a;
        in4.f183709f = this.f170973g;
        in4.f183707d = C75592q0.m90789s();
        in4.f183708e = this.f170976j;
        int i2 = 200;
        LinkedList<C64868yx2> linkedList = new LinkedList<>();
        LinkedList<C64326ds2> linkedList2 = new LinkedList<>();
        while (i2 > 0) {
            List<String> list4 = this.f170971e;
            if (list4 != null && this.f170974h < list4.size()) {
                if (this.f170971e.get(this.f170974h) != null) {
                    C64868yx2 yx22 = new C64868yx2();
                    yx22.f186609d = this.f170971e.get(this.f170974h);
                    linkedList.add(yx22);
                }
                this.f170974h++;
                i2--;
            }
            List<String> list5 = this.f170972f;
            if (list5 != null && this.f170975i < list5.size()) {
                if (this.f170972f.get(this.f170975i) != null) {
                    C64326ds2 ds22 = new C64326ds2();
                    ds22.f182848d = this.f170972f.get(this.f170975i);
                    linkedList2.add(ds22);
                }
                this.f170975i++;
                i2--;
            }
            List<String> list6 = this.f170972f;
            if ((list6 == null || this.f170975i >= list6.size()) && ((list = this.f170971e) == null || this.f170974h >= list.size())) {
                break;
            }
        }
        in4.f183711h = linkedList;
        in4.f183710g = linkedList.size();
        in4.f183713j = linkedList2;
        in4.f183712i = linkedList2.size();
        StringBuilder sb = new StringBuilder();
        sb.append("doscene in:[");
        List<String> list7 = this.f170972f;
        sb.append(list7 == null ? 0 : list7.size());
        sb.append(",");
        List<String> list8 = this.f170971e;
        if (list8 != null) {
            i = list8.size();
        }
        sb.append(i);
        sb.append("] index:[");
        sb.append(this.f170975i);
        sb.append(",");
        sb.append(this.f170974h);
        sb.append("] req:[");
        sb.append(in4.f183713j.size());
        sb.append(",");
        sb.append(in4.f183711h.size());
        sb.append("]");
        Log.m105926v("MicroMsg.NetSceneUploadMContact", sb.toString());
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 133;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        List<String> list;
        Log.m105924i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + i2 + " errCode = " + i3 + " errMsg = " + str);
        updateDispatchId(i);
        if (i2 == 0 && i3 == 0) {
            in4 in4 = (in4) ((C47350c) uVar).f127055a.f127080a;
            LinkedList<C64326ds2> linkedList = in4.f183713j;
            ArrayList arrayList = new ArrayList();
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105924i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
            } else {
                for (C64326ds2 ds22 : linkedList) {
                    arrayList.add(ds22.f182848d);
                }
            }
            C76186t.m91543k(arrayList);
            LinkedList<C64868yx2> linkedList2 = in4.f183711h;
            ArrayList arrayList2 = new ArrayList();
            if (linkedList2 == null || linkedList2.size() == 0) {
                Log.m105924i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
            } else {
                for (C64868yx2 yx22 : linkedList2) {
                    arrayList2.add(C90193h.m112878f(C15131b.m14237a(yx22.f186609d).getBytes()));
                }
            }
            C76186t.m91543k(arrayList2);
            List<String> list2 = this.f170972f;
            if ((list2 == null || this.f170975i >= list2.size()) && ((list = this.f170971e) == null || this.f170974h >= list.size())) {
                this.f170970d.onSceneEnd(i2, i3, str, this);
            } else if (doScene(dispatcher(), this.f170970d) < 0) {
                this.f170970d.onSceneEnd(i2, i3, str, this);
            }
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
            this.f170970d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        y$$d y__d = y$$d.EFailed;
        in4 in4 = (in4) ((C47350c) uVar).f127055a.f127080a;
        int size = in4.f183713j.size() + in4.f183711h.size();
        if (size == 0 || size > 200) {
            Log.m105920e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
            return y__d;
        }
        String str = in4.f183709f;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
            return y__d;
        }
        String str2 = in4.f183707d;
        if (str2 != null && str2.length() > 0) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
        return y__d;
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
