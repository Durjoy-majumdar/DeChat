package aw1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.HashSet;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C61907e;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102750f;
import xv1.C102753g;
import xv1.C23128k;
import xv1.C23131l;

/* renamed from: aw1.g */
public class C16723g extends C16735o {

    /* renamed from: q */
    public String f45205q;

    /* renamed from: r */
    public String f45206r;

    /* renamed from: s */
    public int f45207s;

    public C16723g(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 192;
    }

    /* renamed from: m */
    public C23128k mo17716m(int i, C21891f.C21892a aVar) {
        C102750f fVar = new C102750f(i);
        fVar.f303402z = aVar.f61912i;
        fVar.f303401y = this.f45206r;
        return fVar;
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
        C102753g gVar = new C102753g(i);
        gVar.f303426p = nVar;
        gVar.f62327e = nVar.f292168v;
        gVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return gVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        this.f45208o = false;
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224477l = C61907e.f176012d;
        kVar.f224469d = this.f45206r;
        kVar.f224470e = this.f45235p;
        kVar.f224471f = this.f45205q;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224467b = 11;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(3, kVar);
    }

    /* renamed from: t */
    public int mo17717t() {
        return this.f45207s;
    }
}
