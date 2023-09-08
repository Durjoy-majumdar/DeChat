package dd1;

import ad1.C39543a;
import bd1.C39758f;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bd1.C54448d;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46523h2;
import jp3.C9487b;
import nr3.C89059e;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import te3.C49183dr2;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50119ke1;
import te3.C51163rv3;
import te3.C51284sq2;
import te3.C51423to1;
import te3.C52261zg3;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: dd1.f */
public final class C45328f extends C60625c<C50119ke1> {

    /* renamed from: s */
    public final String f122785s;

    /* renamed from: t */
    public final JSONObject f122786t = new JSONObject();

    public C45328f(int i) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        String str = "Cgi.FinderNewUserPrepare#" + i + '@' + hashCode();
        this.f122785s = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51423to1 to12 = new C51423to1();
        to12.f142306d = i;
        to12.f142307e = C46523h2.f125330a.mo71859a(7289);
        bVar.f127066a = to12;
        C50119ke1 ke12 = new C50119ke1();
        ke12.setBaseResponse(new C49966ja());
        ke12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ke12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findernewuserprepare";
        bVar.f127069d = 7289;
        mo123453j(bVar.mo72403a());
        Log.m105924i(str, "[CgiFinderNewUserPrepare] created...");
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122786t;
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C50119ke1>> mo9225i() {
        Log.m105924i(this.f122785s, "[run]...");
        return super.mo9225i();
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        boolean z;
        C50119ke1 ke12 = (C50119ke1) eu32;
        C87412m.m108594g(ke12, "resp");
        String str2 = this.f122785s;
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
            ((C39543a) it5.next()).mo14610a(i, i2, str, ke12, this.f122786t);
        }
        if (i == 0 && i2 == 0) {
            C39758f fVar = new C39758f();
            fVar.f131580d = ke12.f136690d;
            C51284sq2 sq22 = new C51284sq2();
            sq22.parseFrom(ke12.toByteArray());
            sq22.f141693y = true;
            fVar.f131582f = sq22;
            fVar.f131584h = ke12.f136705v;
            fVar.f131585i = ke12.f136706w;
            String str3 = this.f122785s;
            Log.m105924i(str3, "[successful] current_alias_role_type:" + fVar.f131584h + ", next_alias_mod_available_time:" + fVar.f131585i);
            C66785b.f191882e.mo90665S0(fVar, C39759i.USER_PREPARE);
            LinkedList<C52261zg3> linkedList = ke12.f136709z;
            C87412m.m108593f(linkedList, "this.finder_list");
            ArrayList arrayList3 = new ArrayList();
            for (T next3 : linkedList) {
                if (!(((C52261zg3) next3).f145918e == null)) {
                    arrayList3.add(next3);
                }
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                C52261zg3 zg32 = (C52261zg3) it6.next();
                FinderContact finderContact = zg32.f145918e;
                if (finderContact != null) {
                    C54447c a = C54448d.m61169a(finderContact);
                    C49183dr2 dr22 = new C49183dr2();
                    dr22.parseFrom(zg32.toByteArray());
                    a.field_prepareFinder = dr22;
                    C66785b.f191882e.mo90672m1(a, C39759i.USER_PREPARE);
                    C58961d.f168673a.mo84162j(finderContact);
                }
            }
            if (ke12.f136700q > 0) {
                C66785b.f191882e.mo90655C2(C39759i.USER_PREPARE);
            } else {
                LinkedList<C52261zg3> linkedList2 = ke12.f136709z;
                C87412m.m108593f(linkedList2, "finder_list");
                if (!linkedList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(C66783a.C66784a.m78799b(C66785b.f191882e, false, 1, (Object) null));
                    C61926c.m72673R(arrayList4, new C7264e(ke12));
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        C66785b bVar = C66785b.f191882e;
                        String str4 = ((C54446b) it7.next()).field_username;
                        C87412m.m108593f(str4, "it.field_username");
                        bVar.mo90660L2(str4, C39759i.USER_PREPARE);
                    }
                }
            }
            C66785b bVar2 = C66785b.f191882e;
            String str5 = "";
            if (bVar2.mo90662O5().length() == 0) {
                String str6 = ke12.f136690d;
                if (str6 == null) {
                    str6 = str5;
                }
                bVar2.mo90667X1(str6);
            }
            String str7 = ke12.f136685B;
            if (str7 != null) {
                str5 = str7;
            }
            if (str5.length() <= 0) {
                z = false;
            }
            if (z) {
                bVar2.mo90667X1(str5);
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ((C39543a) it8.next()).mo14611b(i, i2, str, ke12, this.f122786t);
        }
    }
}
