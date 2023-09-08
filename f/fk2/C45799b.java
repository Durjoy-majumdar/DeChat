package fk2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import android.database.Cursor;
import bi3.C0289a;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C58057l;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import rx3.C36568h;

/* renamed from: fk2.b */
public final class C45799b extends C53996a<C59134f> {

    /* renamed from: d */
    public ArrayList<String> f123706d = new ArrayList<>();

    /* renamed from: fk2.b$a */
    public static final class C45800a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C45800a f123707d = new C45800a();

        public C45800a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C45799b() {
        C36568h.m40985a(C45800a.f123707d);
    }

    /* renamed from: b */
    public C45252f<C39534d<C59134f>> mo70650e(LifecycleScope lifecycleScope, C53998c<C59134f> cVar) {
        int i;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        ArrayList<String> arrayList = this.f123706d;
        if (cVar.f151264a < arrayList.size()) {
            int size = arrayList.size();
            int i2 = cVar.f151264a;
            int i3 = cVar.f151265b;
            if (size > i2 + i3) {
                dVar.f106150a = true;
                i = i2 + i3;
            } else {
                i = arrayList.size();
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = cVar.f151264a; i4 < i; i4++) {
                arrayList2.add(arrayList.get(i4));
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList2)) {
                if (((int) z1Var.f108320R1) != 0) {
                    dVar.f106151b.add(new C59134f(0, z1Var, 2, (C44661m1) null, 8, (C8480h) null));
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    public void onCreate() {
        this.f123706d.clear();
        Cursor J3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69659J3();
        if (J3 != null) {
            C72996z1 z1Var = new C72996z1();
            while (J3.moveToNext()) {
                z1Var.convertFrom(J3);
                this.f123706d.add(z1Var.getUsername());
            }
            J3.close();
        }
        this.f123706d.remove(C75592q0.m90789s());
        this.f123706d.remove("blogapp");
        this.f123706d.remove("tmessage");
        this.f123706d.remove("officialaccounts");
        this.f123706d.remove("helper_entry");
        this.f123706d.remove("filehelper");
        this.f123706d.remove("weixin");
    }
}
