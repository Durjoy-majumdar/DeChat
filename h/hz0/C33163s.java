package hz0;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48687ab;
import te3.C48831bb;
import wz0.C22943h;
import wz0.C22945n;

/* renamed from: hz0.s */
public class C33163s extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f90019d;

    /* renamed from: e */
    public C11385n f90020e;

    /* renamed from: f */
    public LinkedList<C33157j0> f90021f;

    /* renamed from: g */
    public LinkedList<C33157j0> f90022g = new LinkedList<>();

    public C33163s(LinkedList<C33157j0> linkedList) {
        this.f90021f = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48687ab();
        bVar.f127067b = new C48831bb();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchgetcarditem";
        bVar.f127069d = 1074;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f90019d = a;
        C48687ab abVar = (C48687ab) a.f127055a.f127080a;
        LinkedList<String> linkedList2 = new LinkedList<>();
        if (!(linkedList == null || linkedList.size() == 0)) {
            Iterator<C33157j0> it = linkedList.iterator();
            while (it.hasNext()) {
                C33157j0 next = it.next();
                if (next != null) {
                    linkedList2.add(next.field_cardUserId);
                }
            }
        }
        abVar.f130409d = linkedList2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90020e = nVar;
        return dispatch(gVar, this.f90019d, this);
    }

    public int getType() {
        return 1074;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        Iterator<CardInfo> it;
        boolean z;
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        Log.m105919d("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i5 == 0 && i6 == 0) {
            String str3 = ((C48831bb) this.f90019d.f127056b.f127083a).f131028d;
            if (TextUtils.isEmpty(str3)) {
                Log.m105920e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
                this.f90020e.onSceneEnd(4, -1, (String) null, this);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<CardInfo> c = C22943h.m26966c(str3);
            if (c != null) {
                LinkedList<C33157j0> linkedList = this.f90021f;
                if (linkedList != null) {
                    this.f90022g.addAll(linkedList);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
                Iterator<CardInfo> it4 = c.iterator();
                int i7 = 0;
                int i8 = 0;
                while (it4.hasNext()) {
                    CardInfo next = it4.next();
                    int i9 = i8 + 1;
                    if (next == null) {
                        Log.m105920e("MicroMsg.CardUtil", "processCardObject fail, card is null");
                        it = it4;
                        i4 = i9;
                        z = false;
                    } else {
                        C46141c Gx0 = C46153l0.Gx0();
                        it = it4;
                        StringBuilder sb = new StringBuilder();
                        i4 = i9;
                        sb.append("");
                        sb.append(next.field_card_id);
                        CardInfo Lo = Gx0.mo71595Lo(sb.toString());
                        if (Lo == null) {
                            z = C46153l0.Gx0().insert(next);
                            Log.m105919d("MicroMsg.CardUtil", "processCardObject, insertRet = %b", Boolean.valueOf(z));
                            if (!z) {
                                Log.m105920e("MicroMsg.CardUtil", "processCardObject, insert fail");
                            }
                        } else {
                            next.field_stickyIndex = Lo.field_stickyIndex;
                            next.field_stickyEndTime = Lo.field_stickyEndTime;
                            next.field_stickyAnnouncement = Lo.field_stickyAnnouncement;
                            z = C46153l0.Gx0().update(next, new String[0]);
                            Log.m105919d("MicroMsg.CardUtil", "processCardObject, updateRet = %b", Boolean.valueOf(z));
                        }
                    }
                    if (!z) {
                        i7++;
                        LinkedList<C33157j0> linkedList2 = this.f90022g;
                        if (next != null) {
                            C33157j0 j0Var = new C33157j0();
                            j0Var.field_cardUserId = next.field_card_id;
                            linkedList2.remove(j0Var);
                        }
                    }
                    it4 = it;
                    i8 = i4;
                    String str4 = str;
                }
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
                Log.m105925i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                Log.m105921e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", Integer.valueOf(i7), Integer.valueOf(i8));
                C22945n.m26997J();
                if (c.size() > 0) {
                    int currentTimeMillis3 = (int) (System.currentTimeMillis() - currentTimeMillis);
                    ArrayList arrayList = new ArrayList();
                    IDKey iDKey = new IDKey();
                    iDKey.SetID(281);
                    iDKey.SetKey(43);
                    iDKey.SetValue(1);
                    IDKey iDKey2 = new IDKey();
                    iDKey2.SetID(281);
                    iDKey2.SetKey(44);
                    iDKey2.SetValue((long) currentTimeMillis3);
                    IDKey iDKey3 = new IDKey();
                    iDKey3.SetID(281);
                    iDKey3.SetKey(45);
                    iDKey3.SetValue((long) c.size());
                    IDKey iDKey4 = new IDKey();
                    iDKey4.SetID(281);
                    iDKey4.SetKey(47);
                    iDKey4.SetValue((long) (currentTimeMillis3 / c.size()));
                    arrayList.add(iDKey);
                    arrayList.add(iDKey2);
                    arrayList.add(iDKey3);
                    arrayList.add(iDKey4);
                    C115669n.INSTANCE.mo160124a(arrayList, true);
                }
            }
            this.f90020e.onSceneEnd(0, 0, str, this);
            return;
        }
        Log.m105921e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f90020e.onSceneEnd(i5, i6, str2, this);
    }
}
