package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C61907e;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102761q;
import xv1.C102764r;
import xv1.C102772w;
import xv1.C23128k;
import xv1.C78994p;

/* renamed from: aw1.n */
public class C16733n extends C18842a {

    /* renamed from: o */
    public long f45232o;

    /* renamed from: p */
    public String f45233p;

    /* renamed from: aw1.n$a */
    public static class C16734a extends C21891f.C21892a {

        /* renamed from: k */
        public int f45234k = 0;
    }

    public C16733n(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 8208;
    }

    /* renamed from: m */
    public C23128k mo17716m(int i, C21891f.C21892a aVar) {
        int i2 = this.f61903f;
        if (i2 != 1 && i2 != 2 && i2 != 5) {
            return new C23128k(i);
        }
        C102764r rVar = new C102764r(i);
        if (aVar instanceof C16734a) {
            rVar.f303451u = ((C16734a) aVar).f45234k;
        } else {
            rVar.f303451u = mo17728t(aVar.f61909f);
        }
        return rVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = i - aVar.f61904a;
        if (aVar.f61905b) {
            i2--;
        }
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i2);
        int i3 = nVar.f292149c;
        if (i3 == 55) {
            C102761q qVar = new C102761q(i);
            qVar.mo35140k(nVar.f292148b, nVar.f292149c);
            qVar.f62330h = this.f61903f;
            qVar.f303440p = nVar;
            qVar.f62327e = aVar.f61910g;
            qVar.f62329g = -21;
            qVar.f62331i = i;
            qVar.f62328f = 7;
            if (i != aVar.f61909f.size() - 1) {
                return qVar;
            }
            qVar.f62326d = true;
            return qVar;
        } else if (i3 == 56) {
            C78994p pVar = new C78994p(i);
            pVar.mo35140k(nVar.f292148b, nVar.f292149c);
            int i4 = this.f61903f;
            pVar.f62330h = i4;
            C78994p.C78995a aVar2 = pVar.f231963w;
            if (aVar2 != null) {
                aVar2.f231965b = i4;
            }
            pVar.f231956p = nVar;
            pVar.f62327e = aVar.f61910g;
            pVar.f62329g = -21;
            pVar.f62331i = i;
            pVar.f62328f = 7;
            return pVar;
        } else if (i3 != 57) {
            return null;
        } else {
            C102772w wVar = new C102772w(i);
            wVar.mo35140k(nVar.f292148b, nVar.f292149c);
            wVar.f62330h = this.f61903f;
            wVar.f303464p = nVar;
            wVar.f62327e = aVar.f61910g;
            wVar.f62329g = -21;
            wVar.f62331i = i;
            wVar.f62328f = 7;
            return wVar;
        }
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224469d = this.f45233p;
        kVar.f224477l = C61907e.f176012d;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        if (this.f61903f == 5) {
            this.f45232o = Util.nowMilliSecond();
            C115669n.INSTANCE.mo160131h(27229, 1, 5, this.f52838h, 0, 0, 0);
        }
        int i = this.f61903f;
        if (i == 1 || i == 2) {
            kVar.f224467b = 1;
        } else if (i == 3) {
            kVar.f224467b = 10;
        } else if (i == 4) {
            kVar.f224467b = 12;
        } else if (i != 5) {
            kVar.f224467b = 0;
        } else {
            kVar.f224467b = 11;
        }
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(12, kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if ((mo17728t(r12.f32076e) > 0) == false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[LOOP:1: B:25:0x006e->B:26:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17713s(lv1.C10656l r12, java.util.HashSet<java.lang.String> r13) {
        /*
            r11 = this;
            aw1.n$a r13 = new aw1.n$a
            r13.<init>()
            r0 = -21
            r13.f61908e = r0
            java.util.List<lv1.n> r0 = r12.f32076e
            if (r0 != 0) goto L_0x000e
            goto L_0x002a
        L_0x000e:
            java.util.ListIterator r0 = r0.listIterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            lv1.n r1 = (lv1.C99681n) r1
            java.lang.String r1 = r1.f292151e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0012
            r0.remove()
            goto L_0x0012
        L_0x002a:
            java.util.List<lv1.n> r0 = r12.f32076e
            r13.f61909f = r0
            boolean r0 = r11.mo34916j(r0)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0044
            java.util.List<lv1.n> r0 = r12.f32076e
            int r0 = r11.mo17728t(r0)
            if (r0 <= 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0048
        L_0x0044:
            int r0 = r11.f61903f
            if (r0 != r1) goto L_0x004a
        L_0x0048:
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r13.f61905b = r0
            lv1.i r0 = r12.f32075d
            r13.f61910g = r0
            java.util.List<lv1.n> r0 = r12.f32076e
            int r0 = r11.mo17728t(r0)
            r13.f45234k = r0
            int r4 = r11.f61903f
            r5 = 3
            if (r4 == r1) goto L_0x007f
            if (r0 <= r5) goto L_0x007f
            java.util.List<lv1.n> r0 = r13.f61909f
            int r4 = r11.mo17728t(r0)
            if (r4 <= r5) goto L_0x007f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 3
        L_0x006e:
            if (r7 >= r4) goto L_0x007c
            java.lang.Object r8 = r0.get(r7)
            lv1.n r8 = (lv1.C99681n) r8
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x006e
        L_0x007c:
            r0.removeAll(r6)
        L_0x007f:
            java.util.List<lv1.n> r0 = r12.f32076e
            boolean r0 = r11.mo34916j(r0)
            if (r0 == 0) goto L_0x008c
            java.util.List<ov1.f$a> r0 = r11.f52840j
            r0.add(r13)
        L_0x008c:
            java.util.List<lv1.n> r13 = r12.f32076e
            int r0 = r11.f61903f
            r4 = 2
            if (r0 == r3) goto L_0x009d
            if (r0 == r4) goto L_0x009b
            if (r0 == r5) goto L_0x0099
            r0 = 0
            goto L_0x009e
        L_0x0099:
            r0 = 4
            goto L_0x009e
        L_0x009b:
            r0 = 3
            goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 23903(0x5d5f, float:3.3495E-41)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r2] = r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r3] = r9
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x00bf
            java.lang.String r13 = "0"
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r13 = "1"
        L_0x00c1:
            r8[r4] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r8[r5] = r13
            r6.mo160131h(r7, r8)
            int r13 = r11.f61903f
            r0 = 5
            if (r13 != r0) goto L_0x010a
            r13 = 27229(0x6a5d, float:3.8156E-41)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r8[r2] = r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r3] = r7
            java.lang.String r7 = r11.f52838h
            r8[r4] = r7
            long r9 = r11.f45232o
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8[r5] = r7
            java.util.List<lv1.n> r12 = r12.f32076e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00fb
            r3 = 2
        L_0x00fb:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r8[r1] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r8[r0] = r12
            r6.mo160131h(r13, r8)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.C16733n.mo17713s(lv1.l, java.util.HashSet):void");
    }

    /* renamed from: t */
    public final int mo17728t(List<C99681n> list) {
        int i = 0;
        for (C99681n next : list) {
            if (next != null && next.f292149c == 55) {
                i++;
            }
        }
        return i;
    }
}
