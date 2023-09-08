package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.HashSet;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import nv1.C100218a;
import ov1.C21891f;

/* renamed from: aw1.b */
public class C16718b extends C18842a {
    public C16718b(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 4128;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: xv1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: xv1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: xv1.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: xv1.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: xv1.h} */
    /* JADX WARNING: Multi-variable type inference failed */
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
            xv1.u r2 = new xv1.u
            r2.<init>(r5)
            r2.f231975p = r1
            lv1.i r5 = r6.f61910g
            r2.f62327e = r5
            int r5 = r1.f292148b
            int r6 = r1.f292149c
            r2.mo35140k(r5, r6)
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0047
            int r0 = r0 + 1
            r1.f62332j = r0
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.C16718b.mo17711o(int, ov1.f$a):pv1.b");
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224467b = 32;
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
            aVar.f61908e = -3;
            aVar.f61909f = lVar.f32076e;
            aVar.f61910g = lVar.f32075d;
            aVar.f61907d = false;
            this.f52840j.add(aVar);
        }
    }
}
