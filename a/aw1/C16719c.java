package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C21461d;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C100218a;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C78997u;

/* renamed from: aw1.c */
public class C16719c extends C18842a {
    public C16719c(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 48;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        if (nVar.f292151e.equals("create_chatroom​")) {
            dVar.f60761c = 20;
            dVar.f60765g = String.valueOf(nVar.hashCode());
        } else if (nVar.f292148b != 131075) {
            return null;
        } else {
            dVar.f60761c = 4;
            dVar.f60765g = String.valueOf(nVar.hashCode());
        }
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pv1.C22019b mo17711o(int r5, ov1.C21891f.C21892a r6) {
        /*
            r4 = this;
            int r0 = r6.f61904a
            int r0 = r5 - r0
            int r0 = r0 + -1
            java.util.List<lv1.n> r1 = r6.f61909f
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0040
            if (r0 < 0) goto L_0x0040
            java.util.List<lv1.n> r1 = r6.f61909f
            java.lang.Object r1 = r1.get(r0)
            lv1.n r1 = (lv1.C99681n) r1
            java.lang.String r2 = r1.f292151e
            java.lang.String r3 = "create_chatroom​"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002c
            xv1.h r1 = new xv1.h
            r1.<init>(r5)
            lv1.i r5 = r6.f61910g
            r1.f62327e = r5
            goto L_0x0041
        L_0x002c:
            int r2 = r1.f292148b
            r3 = 131075(0x20003, float:1.83675E-40)
            if (r2 != r3) goto L_0x0040
            pv1.b r5 = r4.mo17715p(r3, r5, r1, r6)
            int r2 = r1.f292148b
            int r1 = r1.f292149c
            r5.mo35140k(r2, r1)
            r1 = r5
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0054
            int r5 = r0 + 1
            r1.f62332j = r5
            java.util.List<lv1.n> r5 = r6.f61909f
            int r5 = r5.size()
            int r5 = r5 + -1
            if (r0 != r5) goto L_0x0054
            r5 = 0
            r1.f62326d = r5
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.C16719c.mo17711o(int, ov1.f$a):pv1.b");
    }

    /* renamed from: p */
    public C22019b mo17715p(int i, int i2, C99681n nVar, C21891f.C21892a aVar) {
        C78997u uVar = new C78997u(i2);
        uVar.f231975p = nVar;
        uVar.f62327e = aVar.f61910g;
        uVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return uVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224467b = 96;
        kVar.f224474i = 3;
        kVar.f224468c = this.f52838h;
        kVar.f224475j = hashSet;
        kVar.f224477l = C100218a.f293644d;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            List<C99681n> list = lVar.f32076e;
            aVar.f61909f = list;
            aVar.f61908e = -3;
            aVar.f61910g = lVar.f32075d;
            if (list.size() > 3) {
                boolean z = true;
                if (aVar.f61909f.get(3).f292151e.equals("create_chatroom​")) {
                    if (aVar.f61909f.size() <= 4) {
                        z = false;
                    }
                    aVar.f61907d = z;
                    aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 4));
                } else {
                    aVar.f61907d = true;
                    aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 3));
                }
            }
            this.f52840j.add(aVar);
        }
    }
}
