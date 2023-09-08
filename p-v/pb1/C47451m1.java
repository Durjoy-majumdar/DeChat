package pb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50652oa;
import te3.C50802pa;
import te3.C51048r20;

/* renamed from: pb1.m1 */
public class C47451m1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f127274d;

    /* renamed from: e */
    public C11385n f127275e = null;

    /* renamed from: f */
    public LinkedList<Integer> f127276f;

    /* renamed from: g */
    public int f127277g = 0;

    public C47451m1(LinkedList<Integer> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50652oa();
        bVar.f127067b = new C50802pa();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchdelfavitem";
        bVar.f127069d = 403;
        bVar.f127070e = 194;
        bVar.f127071f = 1000000194;
        this.f127274d = bVar.mo72403a();
        this.f127276f = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        LinkedList<Integer> linkedList = this.f127276f;
        if (linkedList == null || linkedList.isEmpty() || this.f127277g >= this.f127276f.size()) {
            Log.m105921e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", Integer.valueOf(this.f127277g));
            return -1;
        }
        this.f127275e = nVar;
        Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", Integer.valueOf(this.f127276f.size()), Integer.valueOf(this.f127277g), this.f127276f);
        C50652oa oaVar = (C50652oa) this.f127274d.f127055a.f127080a;
        oaVar.f139055e.clear();
        int i = this.f127277g;
        int i2 = 0;
        while (i < this.f127276f.size()) {
            int intValue = this.f127276f.get(i).intValue();
            if (intValue > 0) {
                oaVar.f139055e.add(Integer.valueOf(intValue));
                i2++;
            }
            if (i2 >= 20) {
                break;
            }
            i++;
        }
        this.f127277g = i + 1;
        int size = oaVar.f139055e.size();
        oaVar.f139054d = size;
        Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", Integer.valueOf(size), oaVar.f139055e);
        return dispatch(gVar, this.f127274d, this);
    }

    public int getType() {
        return 403;
    }

    /* renamed from: j1 */
    public final boolean mo72472j1() {
        LinkedList<Integer> linkedList = this.f127276f;
        boolean z = linkedList != null && this.f127277g < linkedList.size();
        Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", Boolean.valueOf(z));
        return z;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f127277g), Integer.valueOf(this.f127276f.size()), str);
        if (i2 == 0 && i3 == 0) {
            LinkedList<C51048r20> linkedList = ((C50802pa) ((C47350c) uVar).f127056b.f127083a).f139666e;
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
                if (mo72472j1()) {
                    doScene(dispatcher(), this.f127275e);
                } else {
                    this.f127275e.onSceneEnd(i2, i3, str, this);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", Integer.valueOf(linkedList.size()));
                for (int i4 = 0; i4 < linkedList.size(); i4++) {
                    C51048r20 r202 = linkedList.get(i4);
                    if (r202.f140674d < 0) {
                        Log.m105929w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", Integer.valueOf(r202.f140675e));
                    } else {
                        arrayList.add(Integer.valueOf(r202.f140675e));
                        Log.m105925i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", Integer.valueOf(r202.f140675e));
                    }
                }
                if (arrayList.size() == 0) {
                    Log.m105920e("MicroMsg.Fav.FavApiLogic", "setDeleted list null");
                } else {
                    Set<String> K = C100734q.m131820K();
                    Log.m105925i("MicroMsg.Fav.FavApiLogic", "setDeleted before del:%s", K.toString());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        Log.m105925i("MicroMsg.Fav.FavApiLogic", "setDeleted id:%d, ret:%b", num, Boolean.valueOf(((HashSet) K).remove(num.toString())));
                    }
                    Log.m105925i("MicroMsg.Fav.FavApiLogic", "setDeleted after del:%s", K.toString());
                    C100734q.m131865o0(K);
                }
                if (mo72472j1()) {
                    doScene(dispatcher(), this.f127275e);
                } else {
                    this.f127275e.onSceneEnd(i2, i3, str, this);
                }
            }
        } else if (mo72472j1()) {
            doScene(dispatcher(), this.f127275e);
        } else {
            this.f127275e.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
