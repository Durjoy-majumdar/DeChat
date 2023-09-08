package cm1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import up1.C14269a0;
import wp1.C15585f;

/* renamed from: cm1.c */
public final class C0716c implements C0740i2 {

    /* renamed from: d */
    public final C14269a0 f1724d;

    public C0716c(C14269a0 a0Var) {
        C87412m.m108594g(a0Var, "mixItem");
        this.f1724d = a0Var;
        FinderItem finderItem = a0Var.f39808c;
        if (finderItem != null) {
            C15585f.f42211a.mo14348k(finderItem);
        }
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f1724d.f39811f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (gy3.C87412m.m108589b(r0.mo13667b(), r11.mo13667b()) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r1 == r8) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r0.getLocalId() == r11.getLocalId()) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo76f(tf1.C13914m r11) {
        /*
            r10 = this;
            java.lang.String r0 = "obj"
            gy3.C87412m.m108594g(r11, r0)
            boolean r0 = r11 instanceof cm1.C0716c
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r11
            cm1.c r0 = (cm1.C0716c) r0
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 == 0) goto L_0x00e5
            up1.a0 r0 = r10.f1724d
            cm1.c r11 = (cm1.C0716c) r11
            up1.a0 r11 = r11.f1724d
            r0.getClass()
            java.lang.String r2 = "otherItem"
            gy3.C87412m.m108594g(r11, r2)
            te3.mc1 r2 = r11.f39806a
            int r2 = r2.f137948d
            te3.mc1 r3 = r0.f39806a
            int r3 = r3.f137948d
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x002c
            goto L_0x0054
        L_0x002c:
            if (r2 != r4) goto L_0x0057
            er1.w3 r1 = er1.C58784w3.f168295a
            up1.s r0 = r0.f39807b
            up1.s r11 = r11.f39807b
            er1.j4 r1 = er1.C58739j4.f168176a
            if (r0 == 0) goto L_0x0054
            if (r11 == 0) goto L_0x0054
            java.lang.String r1 = r0.mo13667b()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0054
            java.lang.String r0 = r0.mo13667b()
            java.lang.String r11 = r11.mo13667b()
            boolean r11 = gy3.C87412m.m108589b(r0, r11)
            if (r11 == 0) goto L_0x0054
            goto L_0x00e2
        L_0x0054:
            r4 = 0
            goto L_0x00e2
        L_0x0057:
            r3 = 2
            if (r2 != r3) goto L_0x0097
            er1.w3 r1 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f39808c
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f39808c
            er1.j4 r1 = er1.C58739j4.f168176a
            if (r0 == 0) goto L_0x0054
            if (r11 == 0) goto L_0x0054
            long r1 = r0.field_id
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x007a
            long r8 = r11.field_id
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x007a
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x007a
            goto L_0x00e2
        L_0x007a:
            long r1 = r0.getLocalId()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0054
            long r1 = r11.getLocalId()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0054
            long r0 = r0.getLocalId()
            long r2 = r11.getLocalId()
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x0054
            goto L_0x00e2
        L_0x0097:
            r4 = 3
            if (r2 != r4) goto L_0x00ab
            er1.w3 r1 = er1.C58784w3.f168295a
            up1.b0 r0 = r0.f39809d
            up1.b0 r11 = r11.f39809d
            er1.j4 r1 = er1.C58739j4.f168176a
            if (r0 == 0) goto L_0x0054
            if (r11 == 0) goto L_0x0054
            boolean r4 = r0.mo13638a(r11)
            goto L_0x00e2
        L_0x00ab:
            r4 = 4
            if (r2 != r4) goto L_0x0054
            er1.w3 r2 = er1.C58784w3.f168295a
            ho1.q r0 = r0.f39810e
            ho1.q r11 = r11.f39810e
            er1.j4 r2 = er1.C58739j4.f168176a
            if (r0 == 0) goto L_0x0054
            if (r11 == 0) goto L_0x0054
            te3.vg1 r0 = r0.f27795a
            te3.z74 r0 = r0.f143476d
            if (r0 == 0) goto L_0x00cb
            te3.qe3 r0 = r0.f145743d
            if (r0 == 0) goto L_0x00cb
            te3.je3 r0 = r0.f140264d
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r0.f136052d
            goto L_0x00cc
        L_0x00cb:
            r0 = r1
        L_0x00cc:
            te3.vg1 r11 = r11.f27795a
            te3.z74 r11 = r11.f143476d
            if (r11 == 0) goto L_0x00dd
            te3.qe3 r11 = r11.f145743d
            if (r11 == 0) goto L_0x00dd
            te3.je3 r11 = r11.f140264d
            if (r11 == 0) goto L_0x00dd
            java.lang.String r11 = r11.f136052d
            goto L_0x00de
        L_0x00dd:
            r11 = r1
        L_0x00de:
            boolean r4 = z04.C112551y.m153810j(r0, r11, r5, r3, r1)
        L_0x00e2:
            if (r4 == 0) goto L_0x00e5
            return r5
        L_0x00e5:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0716c.mo76f(tf1.m):int");
    }

    public long getItemId() {
        return this.f1724d.f39812g;
    }

    public String toString() {
        return "ItemId=" + this.f1724d.f39812g + ",ItemType=" + this.f1724d.f39811f + ' ';
    }
}
