package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.card.model.CardGiftInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C110973w0;
import te3.C22529s0;
import te3.C51037r0;
import te3.C51621v0;

/* renamed from: hz0.q */
public class C21037q extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f59523d;

    /* renamed from: e */
    public C11385n f59524e;

    /* renamed from: f */
    public CardGiftInfo f59525f;

    public C21037q(int i, String str, String str2, Boolean bool) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51037r0();
        bVar.f127067b = new C22529s0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/acceptgiftcard";
        bVar.f127069d = 1136;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f59523d = a;
        C51037r0 r0Var = (C51037r0) a.f127055a.f127080a;
        r0Var.f140638d = i;
        r0Var.f140639e = str;
        r0Var.f140640f = str2;
        r0Var.f140641g = bool.booleanValue();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f59524e = nVar;
        return dispatch(gVar, this.f59523d, this);
    }

    public int getType() {
        return 1136;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C22529s0 s0Var = (C22529s0) this.f59523d.f127056b.f127083a;
            CardGiftInfo cardGiftInfo = new CardGiftInfo();
            cardGiftInfo.f51578d = s0Var.f64583d;
            cardGiftInfo.f51579e = s0Var.f64584e;
            cardGiftInfo.f51580f = s0Var.f64585f;
            cardGiftInfo.f51581g = s0Var.f64586g;
            cardGiftInfo.f51582h = s0Var.f64587h;
            cardGiftInfo.f51583i = s0Var.f64588i;
            cardGiftInfo.f51584j = s0Var.f64589j;
            cardGiftInfo.f51585n = s0Var.f64590n;
            cardGiftInfo.f51587p = s0Var.f64592p;
            cardGiftInfo.f51586o = s0Var.f64591o;
            cardGiftInfo.f51589q = s0Var.f64594q;
            cardGiftInfo.f51590r = s0Var.f64595r;
            cardGiftInfo.f51591s = s0Var.f64596s;
            cardGiftInfo.f51592t = s0Var.f64597t;
            cardGiftInfo.f51593u = s0Var.f64598u;
            cardGiftInfo.f51594v = s0Var.f64604z;
            cardGiftInfo.f51595w = s0Var.f64599v;
            cardGiftInfo.f51596x = s0Var.f64600w;
            cardGiftInfo.f51598y = s0Var.f64601x;
            cardGiftInfo.f51599z = s0Var.f64603y;
            cardGiftInfo.f51553A = s0Var.f64558A;
            cardGiftInfo.f51554B = s0Var.f64559B;
            cardGiftInfo.f51555C = s0Var.f64560C;
            cardGiftInfo.f51556D = s0Var.f64561D;
            cardGiftInfo.f51557E = s0Var.f64562E;
            cardGiftInfo.f51558F = s0Var.f64563F;
            cardGiftInfo.f51559G = s0Var.f64564G;
            cardGiftInfo.f51560H = s0Var.f64565H;
            cardGiftInfo.f51561I = s0Var.f64566I;
            cardGiftInfo.f51562J = s0Var.f64567J;
            cardGiftInfo.f51563K = s0Var.f64568K;
            cardGiftInfo.f51564L = s0Var.f64569L;
            Iterator<C51621v0> it = s0Var.f64570M.iterator();
            while (it.hasNext()) {
                C51621v0 next = it.next();
                LinkedList<CardGiftInfo.AcceptedCardItem> linkedList = cardGiftInfo.f51565M;
                CardGiftInfo.AcceptedCardItem acceptedCardItem = new CardGiftInfo.AcceptedCardItem();
                acceptedCardItem.f51601e = next.f143210e;
                acceptedCardItem.f51600d = next.f143209d;
                linkedList.add(acceptedCardItem);
            }
            Iterator<C110973w0> it4 = s0Var.f64571N.iterator();
            while (it4.hasNext()) {
                C110973w0 next2 = it4.next();
                LinkedList<CardGiftInfo.AccepterItem> linkedList2 = cardGiftInfo.f51566N;
                CardGiftInfo.AccepterItem accepterItem = new CardGiftInfo.AccepterItem();
                accepterItem.f51603e = next2.f332311e;
                accepterItem.f51602d = next2.f332310d;
                accepterItem.f51605g = next2.f332313g;
                accepterItem.f51604f = next2.f332312f;
                linkedList2.add(accepterItem);
            }
            cardGiftInfo.f51567P = s0Var.f64572P;
            cardGiftInfo.f51568Q = s0Var.f64573Q;
            cardGiftInfo.f51569R = s0Var.f64574R;
            cardGiftInfo.f51570S = s0Var.f64575S;
            cardGiftInfo.f51571T = s0Var.f64576T;
            cardGiftInfo.f51572U = s0Var.f64577U;
            cardGiftInfo.f51573V = s0Var.f64578V;
            cardGiftInfo.f51574W = s0Var.f64579W;
            cardGiftInfo.f51575X = s0Var.f64580X;
            cardGiftInfo.f51576Y = s0Var.f64581Y;
            cardGiftInfo.f51588p0 = s0Var.f64593p0;
            cardGiftInfo.f51577Z = s0Var.f64582Z;
            cardGiftInfo.f51597x0 = s0Var.f64602x0;
            this.f59525f = cardGiftInfo;
            Log.m105919d("MicroMsg.NetSceneAcceptGiftCard", "%s", cardGiftInfo.toString());
        }
        this.f59524e.onSceneEnd(i2, i3, str, this);
    }
}
