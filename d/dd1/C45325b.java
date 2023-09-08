package dd1;

import ad1.C39543a;
import bd1.C0263a;
import bd1.C39759i;
import bd1.C54448d;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C46116t4;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46523h2;
import jp3.C9487b;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49854ij0;
import te3.C49966ja;
import te3.C49998jj0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: dd1.b */
public final class C45325b extends C60625c<C49998jj0> {

    /* renamed from: s */
    public final String f122778s;

    /* renamed from: t */
    public final JSONObject f122779t = new JSONObject();

    /* renamed from: u */
    public final JSONObject f122780u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45325b(C0263a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(aVar, "args");
        String str = "Cgi.CreateFinderAccount@" + hashCode();
        this.f122778s = str;
        JSONObject jSONObject = new JSONObject();
        this.f122780u = jSONObject;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49854ij0 ij02 = new C49854ij0();
        ij02.f135375g = C46523h2.f125330a.mo71859a(3922);
        ij02.f135372d = aVar.f808b;
        ij02.f135376h = aVar.f809c;
        ij02.f135374f = aVar.f810d;
        ij02.f135377i = aVar.f811e;
        ij02.f135379n = aVar.f813g;
        ij02.f135378j = aVar.f814h;
        ij02.f135380o = aVar.f812f;
        ij02.f135381p = aVar.f815i;
        ij02.f135383r = aVar.f816j;
        ij02.f135384s = aVar.f807a;
        ij02.f135382q = aVar.f817k;
        bVar.f127066a = ij02;
        C49998jj0 jj02 = new C49998jj0();
        jj02.setBaseResponse(new C49966ja());
        jj02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = jj02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercreateuser";
        bVar.f127069d = 3922;
        mo123453j(bVar.mo72403a());
        jSONObject.put("nickname", aVar.f808b);
        jSONObject.put("signature", ij02.f135381p);
        Log.m105924i(str, "[CgiCreateFinderAccount] created...");
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122780u;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122779t;
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C49998jj0>> mo9225i() {
        Log.m105924i(this.f122778s, "[run]...");
        return super.mo9225i();
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        boolean z;
        FinderContact finderContact;
        C49998jj0 jj02 = (C49998jj0) eu32;
        C87412m.m108594g(jj02, "resp");
        String str2 = this.f122778s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
        CopyOnWriteArraySet<C39543a<?>> copyOnWriteArraySet = C66785b.f191882e.mo75316W2().f152703h;
        ArrayList arrayList = new ArrayList();
        Iterator<C39543a<?>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C39543a<?> next = it.next();
            if (next instanceof C39543a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (true) {
            z = true;
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (((C39543a) next2).mo14612c() != this.f256789f.f127058d) {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            ((C39543a) it5.next()).mo14610a(i, i2, str, jj02, this.f122779t);
        }
        if (i == 0 && i2 == 0 && (finderContact = jj02.f136150d) != null) {
            String str3 = finderContact.username;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() <= 0) {
                z = false;
            }
            if (z) {
                C66785b.f191882e.mo90667X1(str3);
            }
            ((C46116t4) C86312j.m106911c(C46116t4.class)).mo71564EG(str3, new C45324a());
            C58961d.f168673a.mo84162j(finderContact);
            C66785b.f191882e.mo90672m1(C54448d.m61169a(finderContact), C39759i.ACCOUNT_CREATE);
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((C39543a) it6.next()).mo14611b(i, i2, str, jj02, this.f122779t);
        }
    }
}
