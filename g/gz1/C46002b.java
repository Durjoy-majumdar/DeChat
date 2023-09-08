package gz1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.ApplicationGlobal;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import py1.C47596i;
import py1.C47624m;
import py1.C47664r4;
import py1.C47710z;
import xy1.C53474j;
import xy1.C53475k;
import xy1.C79011i;
import yy1.C53641c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: gz1.b */
public final class C46002b extends C86301e implements C79011i {

    /* renamed from: d */
    public boolean f124047d;

    /* renamed from: e */
    public boolean f124048e;

    /* renamed from: f */
    public boolean f124049f;

    /* renamed from: g */
    public boolean f124050g;

    public boolean Fr0() {
        return this.f124049f;
    }

    /* renamed from: QN */
    public String mo71413QN(String str) {
        return vx0(str, 1);
    }

    public boolean Us0() {
        return this.f124048e;
    }

    /* renamed from: Vl */
    public String mo71415Vl(String str, int i) {
        C53474j G2;
        C53641c Z0;
        LinkedList<C47596i> linkedList;
        T t;
        LinkedList<C47710z> linkedList2;
        boolean z;
        T t2 = null;
        if (str == null || (G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str)) == null || (Z0 = G2.mo59155Z0()) == null || (Z0.f150689e & ((long) (1 << (i - 1)))) == 0) {
            return null;
        }
        C47624m h = C41853c.m45374h();
        if (!(h == null || (linkedList = h.f127861d) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C47596i) t).f127764d == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C47596i iVar = (C47596i) t;
            if (!(iVar == null || (linkedList2 = iVar.f127773p) == null)) {
                Iterator<T> it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    if (C87412m.m108589b(((C47710z) next).f128172d, LocaleUtil.getApplicationLanguage())) {
                        t2 = next;
                        break;
                    }
                }
                C47710z zVar = (C47710z) t2;
                if (zVar != null) {
                    return zVar.f128173e;
                }
            }
        }
        return C76577a.m92166q(ApplicationGlobal.context(), C0966R.string.fd5);
    }

    /* renamed from: YE */
    public boolean mo71416YE() {
        return this.f124047d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if ((r2 == null || r2.isEmpty()) == false) goto L_0x0029;
     */
    /* renamed from: oN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71417oN() {
        /*
            r8 = this;
            py1.m r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45374h()
            r1 = 0
            if (r0 == 0) goto L_0x007c
            java.util.LinkedList<py1.r4> r2 = r0.f127862e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0016
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            if (r2 == 0) goto L_0x0029
            java.util.LinkedList<py1.i> r2 = r0.f127861d
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = 0
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 != 0) goto L_0x002b
        L_0x0029:
            r8.f124050g = r4
        L_0x002b:
            java.util.LinkedList<py1.r4> r2 = r0.f127862e
            if (r2 == 0) goto L_0x0054
            java.util.Iterator r2 = r2.iterator()
        L_0x0033:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r2.next()
            r6 = r5
            py1.r4 r6 = (py1.C47664r4) r6
            if (r6 == 0) goto L_0x0049
            int r6 = r6.f127979d
            r7 = 2
            if (r6 != r7) goto L_0x0049
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x0033
            goto L_0x004e
        L_0x004d:
            r5 = r1
        L_0x004e:
            py1.r4 r5 = (py1.C47664r4) r5
            if (r5 == 0) goto L_0x0054
            r8.f124047d = r4
        L_0x0054:
            java.util.LinkedList<py1.r4> r0 = r0.f127862e
            if (r0 == 0) goto L_0x007c
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r0.next()
            r5 = r2
            py1.r4 r5 = (py1.C47664r4) r5
            if (r5 == 0) goto L_0x0071
            int r5 = r5.f127979d
            if (r5 != r4) goto L_0x0071
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r5 == 0) goto L_0x005c
            goto L_0x0076
        L_0x0075:
            r2 = r1
        L_0x0076:
            py1.r4 r2 = (py1.C47664r4) r2
            if (r2 == 0) goto L_0x007c
            r8.f124048e = r4
        L_0x007c:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
            if (r0 == 0) goto L_0x008b
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
            py1.j1 r0 = r0.GameLifeSetting
            if (r0 == 0) goto L_0x008e
            py1.e0 r1 = r0.f127806j
            goto L_0x008e
        L_0x008b:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
        L_0x008e:
            if (r1 == 0) goto L_0x0094
            boolean r0 = r1.f127651d
            r8.f124049f = r0
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz1.C46002b.mo71417oN():void");
    }

    /* renamed from: pA */
    public String mo71418pA(String str) {
        return vx0(str, 2);
    }

    /* renamed from: sa */
    public boolean mo71419sa() {
        return this.f124050g;
    }

    public final String vx0(String str, int i) {
        C53474j G2;
        C53641c Z0;
        LinkedList<C47664r4> linkedList;
        T t;
        LinkedList<C47710z> linkedList2;
        boolean z;
        T t2 = null;
        if (str == null || (G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str)) == null || (Z0 = G2.mo59155Z0()) == null || (Z0.f150688d & ((long) (1 << (i - 1)))) == 0) {
            return null;
        }
        C47624m h = C41853c.m45374h();
        if (!(h == null || (linkedList = h.f127862e) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C47664r4) t).f127979d == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C47664r4 r4Var = (C47664r4) t;
            if (!(r4Var == null || (linkedList2 = r4Var.f127980e) == null)) {
                Iterator<T> it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    if (C87412m.m108589b(((C47710z) next).f128172d, LocaleUtil.getApplicationLanguage())) {
                        t2 = next;
                        break;
                    }
                }
                C47710z zVar = (C47710z) t2;
                if (zVar != null) {
                    return zVar.f128173e;
                }
            }
        }
        return C76577a.m92166q(ApplicationGlobal.context(), C0966R.string.fd5);
    }
}
