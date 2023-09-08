package rn3;

import android.os.Looper;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.transmit.MMCreateChatroomUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C75592q0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75967t;
import java.util.ArrayList;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C100219b;

/* renamed from: rn3.g */
public class C77551g extends C74498h1 {

    /* renamed from: j */
    public MMCreateChatroomUI f226096j;

    /* renamed from: n */
    public C99664b f226097n;

    /* renamed from: o */
    public MMHandler f226098o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public String f226099p;

    /* renamed from: q */
    public C10656l f226100q;

    /* renamed from: r */
    public C61173o f226101r = new C77552a();

    /* renamed from: rn3.g$a */
    public class C77552a implements C61173o {
        public C77552a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            if (lVar.f32074c == 0) {
                C77551g.this.f226100q = lVar;
            } else {
                C77551g.this.f226100q = null;
            }
            if (lVar.f32076e.size() == 0) {
                C99681n nVar = new C99681n();
                nVar.f292151e = "no_result​";
                ArrayList arrayList = new ArrayList();
                lVar.f32076e = arrayList;
                arrayList.add(nVar);
            }
            C77551g.this.mo103564g();
            C77551g.this.notifyDataSetChanged();
            C77551g.this.f219051i.mo62789t6(lVar.f32072a.f224468c, lVar.f32076e.size(), true);
        }
    }

    public C77551g(MMCreateChatroomUI mMCreateChatroomUI, int i) {
        super(mMCreateChatroomUI, false, i);
        this.f226096j = mMCreateChatroomUI;
    }

    public int getCount() {
        List<C99681n> list;
        C10656l lVar = this.f226100q;
        if (lVar == null || (list = lVar.f32076e) == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C75922b bVar;
        C99681n nVar = this.f226100q.f32076e.get(i);
        if (nVar.f292151e.equals("no_result​")) {
            bVar = new C75967t(i);
        } else {
            C75939h hVar = new C75939h(i);
            hVar.f222676B = nVar;
            hVar.f222603z = this.f226100q.f32075d;
            hVar.f222608e = this.f219057f;
            hVar.f222626w = true;
            hVar.f222625v = i + 1;
            int i2 = nVar.f292148b;
            int i3 = nVar.f292149c;
            hVar.f222624u = i2;
            hVar.f222623t = i3;
            bVar = hVar;
        }
        bVar.f222619p = this.f226099p;
        bVar.f222622s = this.f219059h;
        bVar.f222608e = false;
        return bVar;
    }

    /* renamed from: q */
    public void mo96748q() {
        if (this.f226097n != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f226097n);
        }
        this.f226099p = null;
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        this.f226099p = str;
        C76728k kVar = new C76728k();
        kVar.f224479n = this.f226098o;
        kVar.f224478m = this.f226101r;
        kVar.f224468c = str;
        kVar.f224477l = C100219b.f293645d;
        kVar.f224472g = new int[]{131072};
        kVar.f224475j.add("filehelper");
        kVar.f224475j.add(C75592q0.m90789s());
        kVar.f224475j.addAll(this.f226096j.f220127F.mo107707s());
        this.f226097n = ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }
}
