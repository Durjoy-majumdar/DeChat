package w53;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48839bc3;
import te3.C64442ic3;
import te3.C64466jc3;
import te3.C64552mc3;
import te3.C64851yb3;
import te3.C78011xb3;
import te3.a54;
import te3.pp4;

/* renamed from: w53.c */
public class C78520c extends C75123k0 {

    /* renamed from: d */
    public C11385n f230003d;

    /* renamed from: e */
    public C47350c f230004e;

    /* renamed from: f */
    public Orders f230005f;

    /* renamed from: g */
    public int f230006g = 0;

    public C78520c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64442ic3();
        bVar.f127067b = new C64466jc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
        bVar.f127069d = 1565;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f230004e = a;
        C64442ic3 ic32 = (C64442ic3) a.f127055a.f127080a;
        ic32.f183669d = str;
        ic32.f183672g = str4;
        ic32.f183670e = str2;
        ic32.f183673h = str5;
        ic32.f183674i = str6;
        ic32.f183671f = str3;
        ic32.f183675j = str7;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f230003d = nVar;
        return dispatch(gVar, this.f230004e, this);
    }

    public int getType() {
        return 1565;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C64466jc3 jc32 = (C64466jc3) ((C47350c) uVar).f127056b.f127083a;
        if (i3 == 0 && i2 == 0) {
            i3 = jc32.f183782d;
            str = jc32.f183783e;
        }
        Log.m105925i("MicroMsg.NetSceneIbgGetTransaction", "resp.IsUseNewPage: %s", Integer.valueOf(jc32.f183787i));
        this.f230006g = jc32.f183787i;
        Orders orders = new Orders();
        this.f230005f = orders;
        orders.f209567i = 1;
        if (jc32.f183784f == null) {
            Log.m105920e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
        } else {
            orders.f209559X = jc32.f183789n;
            orders.f209561Z = new ArrayList<>();
            Iterator<a54> it = jc32.f183788j.iterator();
            while (it.hasNext()) {
                a54 next = it.next();
                Orders.ShowInfo showInfo = new Orders.ShowInfo();
                showInfo.f209698d = next.f182030d;
                showInfo.f209699e = next.f182031e;
                showInfo.f209700f = next.f182033g;
                showInfo.f209701g = next.f182034h;
                pp4 pp4 = next.f182032f;
                if (pp4 != null) {
                    showInfo.f209702h = pp4.f184870d;
                    showInfo.f209703i = pp4.f184871e;
                    showInfo.f209704j = pp4.f184872f;
                    showInfo.f209705n = pp4.f184873g;
                    showInfo.f209706o = pp4.f184874h;
                }
                this.f230005f.f209561Z.add(showInfo);
            }
            this.f230005f.f209566h = (double) jc32.f183784f.f184281g;
            Orders.Commodity commodity = new Orders.Commodity();
            C64552mc3 mc32 = jc32.f183784f;
            commodity.f209606r = mc32.f184284j;
            commodity.f209599h = mc32.f184286o;
            commodity.f209601j = ((double) mc32.f184281g) / 100.0d;
            commodity.f209603o = String.valueOf(mc32.f184285n);
            C64552mc3 mc33 = jc32.f183784f;
            commodity.f209604p = mc33.f184287p;
            commodity.f209607s = mc33.f184279e;
            commodity.f209605q = mc33.f184278d;
            commodity.f209608t = mc33.f184282h;
            commodity.f209598g = mc33.f184283i;
            commodity.f209602n = ((double) mc33.f184288q) / 100.0d;
            C64851yb3 yb32 = jc32.f183785g;
            if (yb32 != null) {
                commodity.f209609u = yb32.f186484h;
                Orders.Promotions promotions = new Orders.Promotions();
                C64851yb3 yb33 = jc32.f183785g;
                String str2 = yb33.f186483g;
                promotions.f209666f = str2;
                String str3 = yb33.f186484h;
                promotions.f209669i = str3;
                commodity.f209610v = str3;
                promotions.f209665e = yb33.f186485i;
                commodity.f209614z = yb33.f186481e;
                promotions.f209664d = 0;
                if (!Util.isNullOrNil(str2)) {
                    ((ArrayList) commodity.f209592H).add(promotions);
                    commodity.f209593I = true;
                }
                this.f230005f.f209530A = jc32.f183785g.f186481e;
            } else {
                Log.m105924i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
                this.f230005f.f209530A = 0;
            }
            LinkedList<C48839bc3> linkedList = jc32.f183784f.f184289r;
            if (linkedList != null && linkedList.size() > 0) {
                commodity.f209585A = new ArrayList();
                Iterator<C48839bc3> it4 = jc32.f183784f.f184289r.iterator();
                while (it4.hasNext()) {
                    Orders.DiscountInfo discountInfo = new Orders.DiscountInfo();
                    discountInfo.f209633e = it4.next().f131046d;
                    ((ArrayList) commodity.f209585A).add(discountInfo);
                }
            }
            LinkedList<C78011xb3> linkedList2 = jc32.f183786h;
            if (linkedList2 != null && linkedList2.size() > 0) {
                Iterator<C78011xb3> it5 = jc32.f183786h.iterator();
                while (it5.hasNext()) {
                    C78011xb3 next2 = it5.next();
                    Orders.Promotions promotions2 = new Orders.Promotions();
                    promotions2.f209664d = 1;
                    promotions2.f209668h = next2.f228389d;
                    promotions2.f209666f = next2.f228390e;
                    promotions2.f209665e = next2.f228391f;
                    promotions2.f209667g = next2.f228392g;
                    promotions2.f209671n = Util.getInt(next2.f228395j, 0);
                    promotions2.f209670j = next2.f228396n;
                    promotions2.f209672o = next2.f228397o;
                    promotions2.f209673p = (int) next2.f228398p;
                    promotions2.f209677t = next2.f228399q;
                    promotions2.f209674q = (int) next2.f228400r;
                    promotions2.f209675r = next2.f228401s;
                    promotions2.f209676s = next2.f228402t;
                    promotions2.f209678u = next2.f228403u;
                    promotions2.f209679v = next2.f228404v;
                    promotions2.f209680w = next2.f228405w;
                    promotions2.f209681x = next2.f228406x;
                    ((ArrayList) commodity.f209592H).add(promotions2);
                }
            }
            this.f230005f.f209542M = new ArrayList();
            ((ArrayList) this.f230005f.f209542M).add(commodity);
            Orders orders2 = this.f230005f;
            orders2.f209532C = jc32.f183784f.f184287p;
            Log.m105925i("MicroMsg.NetSceneIbgGetTransaction", "formatOrders finish, mOrder.commoditys.size: %s, mOrder: %s", Integer.valueOf(((ArrayList) orders2.f209542M).size()), this.f230005f);
        }
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.krp);
        }
        this.f230003d.onSceneEnd(i2, i3, str, this);
    }
}
