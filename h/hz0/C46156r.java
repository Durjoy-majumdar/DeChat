package hz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import hl0.C87552j;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50374ma;
import te3.C50514na;

/* renamed from: hz0.r */
public class C46156r extends C117747y implements C1311n {

    /* renamed from: d */
    public int f124424d = 0;

    /* renamed from: e */
    public final C47350c f124425e;

    /* renamed from: f */
    public C11385n f124426f;

    public C46156r(LinkedList<String> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50374ma();
        bVar.f127067b = new C50514na();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchdelcarditem";
        bVar.f127069d = C87552j.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124425e = a;
        ((C50374ma) a.f127055a.f127080a).f137922d = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124426f = nVar;
        return dispatch(gVar, this.f124425e, this);
    }

    public int getType() {
        return C87552j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        Log.m105925i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            LinkedList<String> linkedList = ((C50514na) this.f124425e.f127056b.f127083a).f138502d;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(linkedList == null ? 0 : linkedList.size());
            Log.m105925i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", objArr);
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
            } else {
                this.f124424d = 0;
                Iterator<String> it = linkedList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (TextUtils.isEmpty(next)) {
                        Log.m105920e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
                        z = false;
                    } else {
                        CardInfo cardInfo = new CardInfo();
                        cardInfo.field_card_id = next;
                        z = C46153l0.Gx0().delete(cardInfo, new String[0]);
                        Log.m105925i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", Boolean.valueOf(z));
                    }
                    if (!z) {
                        this.f124424d++;
                    }
                }
                Log.m105919d("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, %d fail items", Integer.valueOf(this.f124424d));
            }
        }
        this.f124426f.onSceneEnd(i2, i3, str, this);
    }
}
