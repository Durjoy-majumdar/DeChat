package aw1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C61907e;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102768s;
import xv1.C102770t;
import xv1.C23118c;
import xv1.C23128k;
import xv1.C23131l;
import xv1.C23134n;

/* renamed from: aw1.o */
public class C16735o extends C16727k {

    /* renamed from: p */
    public String f45235p;

    public C16735o(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    /* renamed from: b */
    public boolean mo17718b(View view, C22019b bVar, boolean z) {
        super.mo17718b(view, bVar, z);
        if (bVar instanceof C23118c) {
            int i = 0;
            while (true) {
                if (i >= this.f52840j.size()) {
                    break;
                }
                C21891f.C21892a aVar = this.f52840j.get(i);
                if (aVar.f61906c == bVar.f62324b) {
                    aVar.f61911h = !aVar.f61911h;
                    break;
                }
                i++;
            }
        }
        return true;
    }

    /* renamed from: d */
    public int mo17721d(int i) {
        int size = this.f52840j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21891f.C21892a aVar = this.f52840j.get(i2);
            aVar.f61904a = i;
            if (aVar.f61905b) {
                i++;
            }
            if (aVar.f61909f.size() > 3) {
                i = aVar.f61911h ? i + 3 : i + aVar.f61909f.size();
                aVar.f61906c = i;
                if (aVar.f61907d) {
                    i++;
                }
            } else {
                i += aVar.f61909f.size();
                aVar.f61906c = i;
            }
        }
        return i;
    }

    public int getType() {
        return WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED;
    }

    /* renamed from: m */
    public C23128k mo17716m(int i, C21891f.C21892a aVar) {
        C102768s sVar = new C102768s(i);
        C99681n nVar = aVar.f61912i;
        sVar.f303402z = nVar;
        sVar.f62327e = nVar.f292168v;
        return sVar;
    }

    /* renamed from: n */
    public C23134n mo17729n(int i, C21891f.C21892a aVar) {
        C23118c cVar = new C23118c(i);
        cVar.f66412r = C0966R.string.f2z;
        cVar.f66413s = aVar.f61911h;
        return cVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = aVar.f61905b ? (i - aVar.f61904a) - 1 : i - aVar.f61904a;
        if (i2 < 0 || i2 >= aVar.f61909f.size()) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i2);
        if (nVar.f292151e.equals("no_result​")) {
            return new C23131l(i);
        }
        C102770t tVar = new C102770t(i);
        tVar.f303426p = nVar;
        tVar.f303460x = aVar.f61912i;
        tVar.f62327e = nVar.f292168v;
        tVar.f62329g = -14;
        tVar.f303461y = 2;
        tVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return tVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        this.f45208o = false;
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224477l = C61907e.f176012d;
        kVar.f224470e = this.f45235p;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224467b = 10;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(3, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (lVar.f32074c == 0) {
            if (lVar.f32076e.size() > 0) {
                for (int i = 0; i < lVar.f32076e.size(); i++) {
                    C21891f.C21892a aVar = new C21891f.C21892a();
                    aVar.f61905b = true;
                    C99681n nVar = lVar.f32076e.get(i);
                    aVar.f61912i = nVar;
                    aVar.f61910g = lVar.f32075d;
                    List<C99681n> list = (List) nVar.f292161o;
                    aVar.f61909f = list;
                    if (list.size() <= 3 || i == lVar.f32076e.size() - 1) {
                        aVar.f61911h = false;
                        aVar.f61907d = false;
                    } else {
                        aVar.f61911h = true;
                        aVar.f61907d = true;
                    }
                    this.f52840j.add(aVar);
                }
                return;
            }
            C21891f.C21892a aVar2 = new C21891f.C21892a();
            aVar2.f61908e = -2;
            aVar2.f61910g = lVar.f32075d;
            aVar2.f61905b = false;
            C99681n nVar2 = new C99681n();
            nVar2.f292151e = "no_result​";
            ArrayList arrayList = new ArrayList();
            aVar2.f61909f = arrayList;
            arrayList.add(nVar2);
            this.f52840j.add(aVar2);
        }
    }

    /* renamed from: t */
    public int mo17717t() {
        return 2;
    }
}
