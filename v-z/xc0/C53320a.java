package xc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C48662a4;
import te3.C49072d00;
import te3.C51018qv3;
import te3.C51712vn;
import te3.um4;
import te3.vm4;

/* renamed from: xc0.a */
public class C53320a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148918d;

    /* renamed from: e */
    public C47350c f148919e;

    /* renamed from: f */
    public LinkedList<C51712vn> f148920f = new LinkedList<>();

    /* renamed from: g */
    public boolean f148921g;

    /* renamed from: h */
    public int f148922h;

    /* renamed from: i */
    public String f148923i;

    /* renamed from: j */
    public String f148924j;

    public C53320a(String str, LinkedList<C51712vn> linkedList) {
        boolean z = false;
        this.f148921g = false;
        this.f148922h = 0;
        this.f148923i = str;
        this.f148924j = C86709a0.m107523b().mo121110g() + "" + System.currentTimeMillis();
        this.f148920f.clear();
        this.f148920f.addAll(linkedList);
        LinkedList<C51712vn> linkedList2 = this.f148920f;
        if (linkedList2 != null) {
            this.f148922h = linkedList2.size();
        } else {
            this.f148922h = 0;
        }
        this.f148921g = this.f148922h == 0 ? true : z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148918d = nVar;
        Log.m105924i("MicroMsg.NetSceneUploadCardImg", "start upload cgi");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new um4();
        bVar.f127067b = new vm4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadcardimg";
        bVar.f127069d = 575;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148919e = a;
        um4 um4 = (um4) a.f127055a.f127080a;
        um4.f142950i = this.f148923i;
        um4.f142946e = 0;
        um4.f142947f = 0;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(new byte[0]);
        um4.f142949h = qv32;
        um4.f142948g = 0;
        um4.f142945d = this.f148924j;
        um4.f142951j = this.f148922h;
        um4.f142952n = this.f148920f;
        return dispatch(gVar, this.f148919e, this);
    }

    public int getType() {
        return 575;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C48662a4> linkedList;
        Class cls = C75700k0.class;
        Log.m105919d("MicroMsg.NetSceneUploadCardImg", "onGYNetEnd:%s, %s", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f148923i);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                C49072d00 q2 = z1Var.mo73973q2();
                LinkedList<C51712vn> linkedList2 = this.f148920f;
                if (linkedList2 != null && linkedList2.size() > 0) {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<C51712vn> it = this.f148920f.iterator();
                    while (it.hasNext()) {
                        C51712vn next = it.next();
                        C48662a4 a4Var = new C48662a4();
                        a4Var.f130298d = next.f143570d;
                        a4Var.f130299e = next.f143571e;
                        linkedList3.add(a4Var);
                    }
                    if (q2 == null) {
                        q2 = new C49072d00();
                    }
                    if (q2.f132050d == null) {
                        q2.f132050d = new LinkedList<>();
                    }
                    q2.f132050d.clear();
                    q2.f132050d.addAll(linkedList3);
                    z1Var.mo73959N2(q2);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(z1Var);
                } else if (!(!this.f148921g || q2 == null || (linkedList = q2.f132050d) == null)) {
                    linkedList.clear();
                    z1Var.mo73959N2(q2);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(z1Var);
                }
            }
            this.f148918d.onSceneEnd(i2, i3, str, this);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
        this.f148918d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 100;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
