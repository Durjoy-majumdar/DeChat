package aw1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C44661m1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102744d;
import xv1.C102746e;
import xv1.C23125i;
import xv1.C23128k;
import xv1.C23131l;

/* renamed from: aw1.f */
public class C16722f extends C16727k {

    /* renamed from: p */
    public String f45203p;

    /* renamed from: q */
    public C44661m1 f45204q;

    public C16722f(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 160;
    }

    /* renamed from: m */
    public C23128k mo17716m(int i, C21891f.C21892a aVar) {
        C102746e eVar = new C102746e(i);
        eVar.f303382u = this.f45203p;
        eVar.f303384w = aVar.f61909f.size();
        return eVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = i - aVar.f61904a;
        if (aVar.f61905b) {
            i2--;
        }
        C23125i iVar = null;
        if (i2 < aVar.f61909f.size() && i2 >= 0) {
            C99681n nVar = aVar.f61909f.get(i2);
            if (nVar.f292151e.equals("create_talker_message​")) {
                C23125i iVar2 = new C23125i(i);
                iVar2.f62326d = false;
                iVar2.f66425q = this.f45203p;
                this.f45208o = true;
                iVar = iVar2;
            } else if (nVar.f292151e.equals("no_result​")) {
                iVar = new C23131l(i);
            } else {
                C102744d dVar = new C102744d(i2);
                dVar.f303426p = nVar;
                dVar.f62327e = aVar.f61910g;
                dVar.f303378x = this.f45204q;
                dVar.mo35140k(nVar.f292148b, nVar.f292149c);
                iVar = dVar;
            }
        }
        if (iVar != null) {
            iVar.f62332j = i2 + 1;
            iVar.f62327e = aVar.f61910g;
        }
        return iVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        this.f45208o = false;
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224469d = this.f45203p;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224467b = 3;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(3, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        List<C99681n> list = lVar.f32076e;
        if (mo34916j(list)) {
            if (list.size() > 0) {
                C99681n nVar = list.get(0);
                if (nVar.f292151e.equals("create_talker_message​")) {
                    C21891f.C21892a aVar = new C21891f.C21892a();
                    aVar.f61905b = false;
                    ArrayList arrayList = new ArrayList();
                    aVar.f61909f = arrayList;
                    arrayList.add(nVar);
                    aVar.f61910g = lVar.f32075d;
                    aVar.f61908e = -2;
                    this.f52840j.add(aVar);
                    list.remove(0);
                }
            }
            C21891f.C21892a aVar2 = new C21891f.C21892a();
            aVar2.f61908e = -2;
            aVar2.f61910g = lVar.f32075d;
            if (list.size() == 0) {
                aVar2.f61905b = false;
                C99681n nVar2 = new C99681n();
                nVar2.f292151e = "no_result​";
                ArrayList arrayList2 = new ArrayList();
                aVar2.f61909f = arrayList2;
                arrayList2.add(nVar2);
            } else {
                aVar2.f61909f = list;
            }
            this.f52840j.add(aVar2);
        }
    }
}
