package hz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50289lo;
import te3.C52090ya;
import te3.C52237za;
import te3.xa4;
import wz0.C22943h;
import wz0.C22945n;

/* renamed from: hz0.t */
public class C46157t extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124427d;

    /* renamed from: e */
    public C11385n f124428e;

    /* renamed from: f */
    public LinkedList<CardInfo> f124429f;

    /* renamed from: g */
    public String f124430g;

    public C46157t(LinkedList<C50289lo> linkedList, xa4 xa4, int i) {
        this(linkedList, xa4, i, "");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124428e = nVar;
        return dispatch(gVar, this.f124427d, this);
    }

    public int getType() {
        return 1099;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C52237za) this.f124427d.f127056b.f127083a).f145782d;
            if (TextUtils.isEmpty(str2)) {
                Log.m105920e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
                this.f124428e.onSceneEnd(4, -1, (String) null, this);
                return;
            }
            ArrayList<CardInfo> c = C22943h.m26966c(str2);
            if (c != null) {
                C22945n.m26997J();
                this.f124429f.addAll(c);
            }
            this.f124428e.onSceneEnd(0, 0, str, this);
            return;
        }
        Log.m105921e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f124428e.onSceneEnd(i2, i3, str, this);
    }

    public C46157t(LinkedList<C50289lo> linkedList, xa4 xa4, int i, String str) {
        this.f124429f = new LinkedList<>();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52090ya();
        bVar.f127067b = new C52237za();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
        bVar.f127069d = 1099;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124427d = a;
        C52090ya yaVar = (C52090ya) a.f127055a.f127080a;
        yaVar.f145200d = linkedList;
        yaVar.f145201e = xa4;
        yaVar.f145202f = i;
        this.f124430g = str;
    }
}
