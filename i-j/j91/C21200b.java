package j91;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import e91.C116711b;
import e91.C20553c;
import h81.C20928j;
import i91.C21062c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import op3.C117877b;
import op3.C117882j;
import te3.C118467t1;

/* renamed from: j91.b */
public final class C21200b implements C20553c, C21207e {

    /* renamed from: a */
    public List<C20928j.C20932d> f59969a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public C21203d f59970b = new C21203d(this);

    /* renamed from: c */
    public C21201c f59971c = new C21201c();

    /* renamed from: d */
    public boolean f59972d = C20449a.m22049a();

    @Deprecated
    /* renamed from: b */
    public static C117877b<String, Integer> m23662b(Activity activity) {
        if (activity != null) {
            return C117882j.m166284c(activity.getClass().getCanonicalName(), Integer.valueOf(activity.hashCode()));
        }
        try {
            C117877b<String, Integer> c = C21062c.m23249d().mo32773c();
            Log.m105919d("HABBYGE-MALI.ActivityMonitor", "getActivityOnFinish: %s, %s", c.mo182596a(0), c.mo182596a(1));
            return c;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.ActivityMonitor", e, "getActivityOnFinish", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0169, code lost:
        if (r11 != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if ((r11 & 524288) == 524288) goto L_0x020f;
     */
    @java.lang.Deprecated
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23663c(android.app.Activity r10, android.content.Intent r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            i91.c r0 = i91.C21062c.m23249d()
            i91.d r0 = r0.f59586a
            r0.getClass()
            if (r11 != 0) goto L_0x000d
            goto L_0x0386
        L_0x000d:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0027
            java.lang.String r10 = r11.getAction()
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r2] = r10
            java.lang.String r10 = "HABBYGE-MALI.ActivityStackWrapper"
            java.lang.String r12 = "push: aName=null, action: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r12, r11)
            goto L_0x0386
        L_0x0027:
            int r11 = r11.getFlags()
            if (r14 > 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x0066
            i91.f r1 = r0.f59587a
            op3.b r1 = r1.mo32780b()
            java.lang.Object r4 = r1.mo182596a(r2)
            te3.u1 r4 = (te3.C118471u1) r4
            java.lang.Object r1 = r1.mo182596a(r3)
            te3.t1 r1 = (te3.C118467t1) r1
            if (r1 == 0) goto L_0x005a
            te3.fh4 r5 = r1.f354392d
            if (r5 == 0) goto L_0x005a
            java.lang.String r5 = r5.f354001d
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x005a
            te3.fh4 r5 = r1.f354392d
            int r5 = r5.f354002e
            if (r5 > 0) goto L_0x005a
            r5 = 1
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0066
            te3.fh4 r10 = r1.f354392d
            r10.f354002e = r14
            i91.C21061b.m23248b(r4)
            goto L_0x0386
        L_0x0066:
            te3.t1 r1 = new te3.t1
            r1.<init>()
            te3.fh4 r4 = new te3.fh4
            r4.<init>()
            r1.f354392d = r4
            r4.f354001d = r13
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x007c
            r1.f354397i = r12
        L_0x007c:
            te3.fh4 r12 = r1.f354392d
            r12.f354002e = r14
            r1.f354393e = r11
            r1.f354394f = r2
            r12 = 3
            r13 = 101(0x65, float:1.42E-43)
            r14 = 2
            if (r11 != 0) goto L_0x008d
            r11 = 0
            goto L_0x0213
        L_0x008d:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = r11 & r4
            r6 = 134217728(0x8000000, float:3.85186E-34)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r5 != r4) goto L_0x016f
            r4 = r11 & r6
            if (r4 != r6) goto L_0x009d
            goto L_0x020f
        L_0x009d:
            r4 = 32768(0x8000, float:4.5918E-41)
            r5 = r11 & r4
            if (r5 != r4) goto L_0x00e5
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.fh4 r4 = r1.f354392d
            java.lang.String r4 = r4.f354001d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00b5
            goto L_0x0211
        L_0x00b5:
            te3.u1 r4 = i91.C21061b.m23247a()
            te3.t1 r5 = r11.mo32781c(r4)
            op3.b r6 = i91.C21065f.m23260d(r4, r1)
            if (r6 != 0) goto L_0x00c5
            goto L_0x016b
        L_0x00c5:
            java.lang.Object r6 = r6.mo182596a(r2)
            te3.mf4 r6 = (te3.mf4) r6
            java.util.LinkedList<te3.t1> r7 = r6.f354135e
            r7.clear()
            r6.f354134d = r2
            java.util.LinkedList<te3.t1> r6 = r6.f354135e
            r6.addLast(r1)
            i91.C21061b.m23248b(r4)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0211
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r5)
            goto L_0x0211
        L_0x00e5:
            r11 = r11 & r7
            if (r11 != r7) goto L_0x00ea
            goto L_0x0185
        L_0x00ea:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.fh4 r4 = r1.f354392d
            java.lang.String r4 = r4.f354001d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00fa
            goto L_0x0108
        L_0x00fa:
            te3.u1 r4 = i91.C21061b.m23247a()
            te3.t1 r5 = r11.mo32781c(r4)
            op3.b r6 = i91.C21065f.m23260d(r4, r1)
            if (r6 != 0) goto L_0x010a
        L_0x0108:
            r11 = 0
            goto L_0x0169
        L_0x010a:
            java.lang.Object r7 = r6.mo182596a(r2)
            te3.mf4 r7 = (te3.mf4) r7
            java.lang.Object r6 = r6.mo182596a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.LinkedList<te3.mf4> r8 = r4.f354473d
            r8.remove(r6)
            java.util.LinkedList<te3.mf4> r6 = r4.f354473d
            r6.addLast(r7)
            java.util.LinkedList<te3.t1> r6 = r7.f354135e
            java.lang.Object r6 = r6.getLast()
            te3.t1 r6 = (te3.C118467t1) r6
            if (r6 == 0) goto L_0x015c
            te3.fh4 r6 = r6.f354392d
            te3.fh4 r8 = r1.f354392d
            boolean r6 = i91.C21066g.m23269a(r6, r8)
            if (r6 != 0) goto L_0x015c
            java.util.LinkedList<te3.t1> r6 = r7.f354135e
            int r6 = r6.size()
            int r6 = r6 - r3
        L_0x013f:
            if (r6 < 0) goto L_0x015c
            java.util.LinkedList<te3.t1> r8 = r7.f354135e
            java.lang.Object r8 = r8.get(r6)
            te3.t1 r8 = (te3.C118467t1) r8
            te3.fh4 r8 = r8.f354392d
            te3.fh4 r9 = r1.f354392d
            boolean r8 = i91.C21066g.m23269a(r8, r9)
            if (r8 == 0) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            java.util.LinkedList<te3.t1> r8 = r7.f354135e
            r8.remove(r6)
            int r6 = r6 + -1
            goto L_0x013f
        L_0x015c:
            i91.C21061b.m23248b(r4)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0168
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r5)
        L_0x0168:
            r11 = 1
        L_0x0169:
            if (r11 != 0) goto L_0x0211
        L_0x016b:
            r11 = 101(0x65, float:1.42E-43)
            goto L_0x0213
        L_0x016f:
            r4 = r11 & r7
            if (r4 != r7) goto L_0x0174
            goto L_0x0185
        L_0x0174:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r11 & r5
            if (r8 != r5) goto L_0x017d
            r11 = 1
            goto L_0x0213
        L_0x017d:
            r5 = 131072(0x20000, float:1.83671E-40)
            r8 = r11 & r5
            if (r8 != r5) goto L_0x0206
            if (r4 != r7) goto L_0x0188
        L_0x0185:
            r11 = 2
            goto L_0x0213
        L_0x0188:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r4 = i91.C21061b.m23247a()
            te3.t1 r5 = r11.mo32781c(r4)
            te3.fh4 r6 = r1.f354392d
            java.lang.String r7 = r6.f354001d
            int r6 = r6.f354002e
            op3.b r6 = i91.C21065f.m23263j(r4, r7, r6)
            java.lang.Object r7 = r6.mo182596a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.mo182596a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 >= 0) goto L_0x01b9
            i91.C21065f.m23262i(r4, r1)
            goto L_0x01f9
        L_0x01b9:
            java.util.LinkedList<te3.mf4> r8 = r4.f354473d
            int r8 = r8.size()
            int r8 = r8 - r3
            if (r7 != r8) goto L_0x01c4
            r8 = 1
            goto L_0x01c5
        L_0x01c4:
            r8 = 0
        L_0x01c5:
            if (r8 == 0) goto L_0x01e1
            java.util.LinkedList<te3.mf4> r7 = r4.f354473d
            java.lang.Object r7 = r7.getLast()
            te3.mf4 r7 = (te3.mf4) r7
            if (r7 != 0) goto L_0x01d5
            i91.C21065f.m23262i(r4, r1)
            goto L_0x01f9
        L_0x01d5:
            java.util.LinkedList<te3.t1> r7 = r7.f354135e
            java.lang.Object r6 = r7.remove(r6)
            te3.t1 r6 = (te3.C118467t1) r6
            i91.C21065f.m23262i(r4, r6)
            goto L_0x01f9
        L_0x01e1:
            java.util.LinkedList<te3.mf4> r8 = r4.f354473d
            java.lang.Object r7 = r8.remove(r7)
            te3.mf4 r7 = (te3.mf4) r7
            java.util.LinkedList<te3.mf4> r8 = r4.f354473d
            r8.addLast(r7)
            java.util.LinkedList<te3.t1> r7 = r7.f354135e
            java.lang.Object r6 = r7.remove(r6)
            te3.t1 r6 = (te3.C118467t1) r6
            i91.C21065f.m23262i(r4, r6)
        L_0x01f9:
            i91.C21061b.m23248b(r4)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0211
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r5)
            goto L_0x0211
        L_0x0206:
            r4 = r11 & r6
            if (r4 != r6) goto L_0x0211
            r4 = 524288(0x80000, float:7.34684E-40)
            r11 = r11 & r4
            if (r11 != r4) goto L_0x0211
        L_0x020f:
            r11 = 3
            goto L_0x0213
        L_0x0211:
            r11 = 100
        L_0x0213:
            if (r11 == 0) goto L_0x0360
            if (r11 == r3) goto L_0x0324
            if (r11 == r14) goto L_0x02a8
            if (r11 == r12) goto L_0x023d
            if (r11 == r13) goto L_0x021f
            goto L_0x0386
        L_0x021f:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r12 = i91.C21061b.m23247a()
            te3.t1 r13 = r11.mo32781c(r12)
            i91.C21065f.m23259a(r12, r1, r2)
            i91.C21061b.m23248b(r12)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0386
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r13)
            goto L_0x0386
        L_0x023d:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r12 = i91.C21061b.m23247a()
            te3.t1 r13 = r11.mo32781c(r12)
            java.util.LinkedList<te3.mf4> r14 = r12.f354473d
            if (r14 != 0) goto L_0x0252
            i91.C21065f.m23259a(r12, r1, r3)
            goto L_0x029a
        L_0x0252:
            int r0 = r14.size()
            int r0 = r0 - r3
        L_0x0257:
            if (r0 < 0) goto L_0x0295
            java.lang.Object r4 = r14.get(r0)
            te3.mf4 r4 = (te3.mf4) r4
            if (r4 == 0) goto L_0x0292
            boolean r5 = r4.f354134d
            if (r5 != 0) goto L_0x0266
            goto L_0x0292
        L_0x0266:
            java.util.LinkedList<te3.t1> r5 = r4.f354135e
            int r5 = r5.size()
            int r5 = r5 - r3
        L_0x026d:
            if (r5 < 0) goto L_0x0292
            java.util.LinkedList<te3.t1> r6 = r4.f354135e
            java.lang.Object r6 = r6.get(r5)
            te3.t1 r6 = (te3.C118467t1) r6
            if (r6 != 0) goto L_0x027a
            goto L_0x028f
        L_0x027a:
            te3.fh4 r7 = r1.f354392d
            te3.fh4 r6 = r6.f354392d
            boolean r6 = i91.C21066g.m23269a(r7, r6)
            if (r6 == 0) goto L_0x028f
            java.lang.Object r2 = r14.remove(r0)
            te3.mf4 r2 = (te3.mf4) r2
            r14.addLast(r2)
            r2 = 1
            goto L_0x0292
        L_0x028f:
            int r5 = r5 + -1
            goto L_0x026d
        L_0x0292:
            int r0 = r0 + -1
            goto L_0x0257
        L_0x0295:
            if (r2 != 0) goto L_0x029a
            i91.C21065f.m23259a(r12, r1, r3)
        L_0x029a:
            i91.C21061b.m23248b(r12)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0386
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r13)
            goto L_0x0386
        L_0x02a8:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r12 = i91.C21061b.m23247a()
            te3.t1 r13 = r11.mo32781c(r12)
            boolean r0 = r11.mo32782e(r12)
            if (r0 == 0) goto L_0x02bf
            i91.C21065f.m23259a(r12, r1, r2)
            goto L_0x0317
        L_0x02bf:
            te3.fh4 r0 = r1.f354392d
            java.lang.String r4 = r0.f354001d
            int r0 = r0.f354002e
            op3.b r0 = i91.C21065f.m23263j(r12, r4, r0)
            java.lang.Object r4 = r0.mo182596a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.mo182596a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x02e3
            i91.C21065f.m23262i(r12, r1)
            goto L_0x0317
        L_0x02e3:
            java.util.LinkedList<te3.mf4> r5 = r12.f354473d
            int r5 = r5.size()
            int r5 = r5 - r3
            if (r4 != r5) goto L_0x02ee
            r5 = 1
            goto L_0x02ef
        L_0x02ee:
            r5 = 0
        L_0x02ef:
            if (r5 == 0) goto L_0x0305
            java.util.LinkedList<te3.mf4> r5 = r12.f354473d
            java.lang.Object r5 = r5.getLast()
            te3.mf4 r5 = (te3.mf4) r5
            java.util.LinkedList<te3.t1> r5 = r5.f354135e
            int r5 = r5.size()
            int r5 = r5 - r3
            if (r0 != r5) goto L_0x0303
            r2 = 1
        L_0x0303:
            r2 = r2 ^ r3
            goto L_0x0306
        L_0x0305:
            r2 = 2
        L_0x0306:
            if (r2 != r3) goto L_0x030d
            int r5 = r0 + 1
            r11.mo32783g(r12, r5, r1)
        L_0x030d:
            if (r2 != r14) goto L_0x0317
            int r4 = r4 + r3
            r11.mo32784h(r12, r4, r1)
            int r0 = r0 + r3
            r11.mo32783g(r12, r0, r1)
        L_0x0317:
            i91.C21061b.m23248b(r12)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0386
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r13)
            goto L_0x0386
        L_0x0324:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r12 = i91.C21061b.m23247a()
            te3.t1 r13 = r11.mo32781c(r12)
            boolean r14 = r11.mo32782e(r12)
            if (r14 == 0) goto L_0x033b
            i91.C21065f.m23259a(r12, r1, r2)
            goto L_0x0353
        L_0x033b:
            te3.t1 r14 = i91.C21065f.m23261f(r12)
            if (r14 != 0) goto L_0x0345
            i91.C21065f.m23262i(r12, r1)
            goto L_0x0353
        L_0x0345:
            te3.fh4 r0 = r1.f354392d
            te3.fh4 r14 = r14.f354392d
            boolean r14 = i91.C21066g.m23269a(r0, r14)
            if (r14 == 0) goto L_0x0350
            goto L_0x0353
        L_0x0350:
            i91.C21065f.m23262i(r12, r1)
        L_0x0353:
            i91.C21061b.m23248b(r12)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0386
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r13)
            goto L_0x0386
        L_0x0360:
            i91.f r11 = r0.f59587a
            r11.getClass()
            te3.u1 r12 = i91.C21061b.m23247a()
            te3.t1 r13 = r11.mo32781c(r12)
            boolean r14 = r11.mo32782e(r12)
            if (r14 == 0) goto L_0x0377
            i91.C21065f.m23259a(r12, r1, r2)
            goto L_0x037a
        L_0x0377:
            i91.C21065f.m23262i(r12, r1)
        L_0x037a:
            i91.C21061b.m23248b(r12)
            i91.e r11 = r11.f59588a
            if (r11 == 0) goto L_0x0386
            d91.c r11 = (d91.C20451c) r11
            r11.mo31993b(r10, r1, r13)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.C21200b.m23663c(android.app.Activity, android.content.Intent, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007f, code lost:
        r0 = r18.getComponent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d0, code lost:
        if (r7.equals("999") != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        if (r7.equals("123") == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e2, code lost:
        if (r7.equals("102") == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01eb, code lost:
        if (r7.equals("101") == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f2, code lost:
        if (gy3.C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI", r0) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fa, code lost:
        if (gy3.C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", r0) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        if (gy3.C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderNewUIB", r0) == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0204, code lost:
        t91.C22466j.f63631k.mo35596a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0227 A[SYNTHETIC, Splitter:B:83:0x0227] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33175a(android.app.Activity r17, android.content.Intent r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r3 = r1.f59972d
            r5 = 0
            r6 = 1
            java.lang.String r8 = "KPublisherId"
            r9 = -1
            java.lang.String r10 = "minimize_secene"
            java.lang.String r11 = "Chat_User"
            if (r3 == 0) goto L_0x0250
            j91.c r3 = r1.f59971c
            r3.getClass()
            long r12 = java.lang.System.currentTimeMillis()
            te3.ta4 r3 = new te3.ta4
            r3.<init>()
            te3.fh4 r14 = new te3.fh4
            r14.<init>()
            r3.f64613d = r14
            java.lang.String r14 = "HABBYGE-MALI.AsyncActivityMonitor"
            if (r0 == 0) goto L_0x005e
            java.lang.Class r15 = r17.getClass()
            java.lang.String r15 = r15.getCanonicalName()
            te3.fh4 r4 = r3.f64613d
            int r7 = r17.hashCode()
            r4.f354002e = r7
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r5] = r15
            java.lang.String r7 = "catchStartActivityBundle, fromActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r4)
            op3.b r0 = j91.C21201c.m23676n(r17)
            java.lang.Object r4 = r0.mo182596a(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.f64616g = r4
            java.lang.Object r0 = r0.mo182596a(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.f64615f = r0
            goto L_0x0077
        L_0x005e:
            i91.c r0 = i91.C21062c.m23249d()
            te3.t1 r0 = r0.mo32776g()
            if (r0 == 0) goto L_0x0076
            te3.fh4 r0 = r0.f354392d
            java.lang.String r15 = r0.f354001d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r15
            java.lang.String r4 = "catchStartActivityBundle, stackTop, fromActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r0)
            goto L_0x0077
        L_0x0076:
            r15 = 0
        L_0x0077:
            te3.fh4 r0 = r3.f64613d
            r0.f354001d = r15
            r0.f354003f = r12
            if (r2 == 0) goto L_0x008a
            android.content.ComponentName r0 = r18.getComponent()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getClassName()
            goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            te3.fh4 r4 = new te3.fh4
            r4.<init>()
            r3.f64614e = r4
            r4.f354001d = r0
            r4.f354002e = r5
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r5] = r0
            java.lang.String r7 = "catchStartActivityBundle, dstActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r4)
            te3.fh4 r4 = r3.f64614e
            r4.f354003f = r12
            if (r2 == 0) goto L_0x00c8
            android.os.Bundle r4 = r18.getExtras()
            if (r4 == 0) goto L_0x00c2
            java.lang.String r7 = r4.getString(r11)
            r3.f64618i = r7
            int r7 = r4.getInt(r10, r9)
            r10 = 0
            java.lang.String r4 = r4.getString(r8, r10)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3.f64619j = r7
            r3.f64620n = r4
        L_0x00c2:
            int r4 = r18.getFlags()
            r3.f64617h = r4
        L_0x00c8:
            z91.b r4 = z91.C23462b.m28021f()
            r4.getClass()
            boolean r7 = e91.C116711b.m164587l(r15)
            if (r7 == 0) goto L_0x00f6
            androidx.fragment.app.Fragment r7 = l91.C117467h.m165690e(r15)
            if (r7 != 0) goto L_0x00dc
            goto L_0x00e4
        L_0x00dc:
            java.lang.Class r7 = r7.getClass()
            java.lang.String r15 = r7.getCanonicalName()
        L_0x00e4:
            boolean r7 = e91.C116711b.m164590o(r15)
            if (r7 == 0) goto L_0x00f2
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            r8 = 0
            java.lang.String r0 = r7.mo175249f(r15, r0, r8)
            goto L_0x0103
        L_0x00f2:
            r8 = 0
            java.lang.String r0 = "-1"
            goto L_0x0103
        L_0x00f6:
            r8 = 0
            boolean r7 = e91.C116711b.m164590o(r15)
            if (r7 == 0) goto L_0x0125
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            java.lang.String r0 = r7.mo175249f(r15, r0, r8)
        L_0x0103:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = "_"
            r7.append(r0)
            r7.append(r12)
            java.lang.String r0 = r7.toString()
            r4.f67291c = r0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r5] = r0
            java.lang.String r0 = "HABBYGE-MALI.HellSessionMonitor"
            java.lang.String r7 = "setCurSessionIdLocal, sessionId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r4)
        L_0x0125:
            r3.f64621o = r12
            te3.fh4 r0 = r3.f64614e
            java.lang.String r0 = r0.f354001d
            t91.C64208c.f181938E = r0
            java.lang.String r4 = "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI"
            boolean r7 = gy3.C87412m.m108589b(r0, r4)
            if (r7 == 0) goto L_0x015a
            if (r2 == 0) goto L_0x013e
            java.lang.String r7 = "key_topic_type"
            int r7 = r2.getIntExtra(r7, r6)
            goto L_0x013f
        L_0x013e:
            r7 = 1
        L_0x013f:
            t91.C64208c.f181944K = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setTopicType: "
            r7.append(r8)
            int r8 = t91.C64208c.f181944K
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "HABBYGE-MALI.HellFinderConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
        L_0x015a:
            t91.C22466j.m26186g(r0)
            t91.k r7 = t91.C22466j.f63625e
            r7.getClass()
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderTimelineMachineUI"
            boolean r8 = gy3.C87412m.m108589b(r8, r0)
            if (r8 != 0) goto L_0x017c
            java.lang.String r8 = "com.tencent.mm.plugin.finder.search.FinderMixSearchUI"
            boolean r8 = gy3.C87412m.m108589b(r8, r0)
            if (r8 != 0) goto L_0x017c
            java.lang.String r8 = "com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI"
            boolean r8 = gy3.C87412m.m108589b(r8, r0)
            if (r8 != 0) goto L_0x017c
            r8 = 1
            goto L_0x017d
        L_0x017c:
            r8 = 0
        L_0x017d:
            if (r8 == 0) goto L_0x0180
            goto L_0x0199
        L_0x0180:
            java.lang.String r8 = "HABBYGE-MALI.RecyclerItemDecorationCallback"
            java.lang.String r10 = "monitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r8 = r7.f63633a
            if (r8 == 0) goto L_0x018e
            r8.clear()
        L_0x018e:
            i20.a r8 = i20.C21043a.m23197h()
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r10 = r7.f63634b
            t91.k$a r7 = r7.f63635c
            r8.mo32759m(r10, r7)
        L_0x0199:
            java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 != 0) goto L_0x020a
            java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5"
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 != 0) goto L_0x020a
            java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 != 0) goto L_0x020a
            java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderConversationUI"
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 == 0) goto L_0x01ba
            goto L_0x020a
        L_0x01ba:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            java.lang.String r7 = r7.mo175246c()
            if (r7 == 0) goto L_0x020f
            int r8 = r7.hashCode()
            switch(r8) {
                case 48626: goto L_0x01e5;
                case 48627: goto L_0x01dc;
                case 48690: goto L_0x01d3;
                case 56601: goto L_0x01ca;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            goto L_0x020f
        L_0x01ca:
            java.lang.String r8 = "999"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x020f
            goto L_0x01ee
        L_0x01d3:
            java.lang.String r8 = "123"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01ee
            goto L_0x020f
        L_0x01dc:
            java.lang.String r8 = "102"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01ee
            goto L_0x020f
        L_0x01e5:
            java.lang.String r8 = "101"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01ee
            goto L_0x020f
        L_0x01ee:
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 != 0) goto L_0x0204
            java.lang.String r4 = "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 != 0) goto L_0x0204
            java.lang.String r4 = "com.tencent.mm.plugin.finder.feed.ui.FinderNewUIB"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x020f
        L_0x0204:
            t91.a r4 = t91.C22466j.f63631k
            r4.mo35596a()
            goto L_0x020f
        L_0x020a:
            t91.a r4 = t91.C22466j.f63631k
            r4.mo35596a()
        L_0x020f:
            d91.C20449a.f57475i = r0
            g91.c r0 = g91.C20813c.m22810a()
            r4 = 100
            r0.mo32508c(r4, r3)
            te3.fh4 r0 = r3.f64614e
            java.lang.String r0 = r0.f354001d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r91.C22217a.m25719a(r0, r3, r5)
            if (r2 == 0) goto L_0x024d
            android.content.ComponentName r0 = r18.getComponent()     // Catch:{ all -> 0x0242 }
            if (r0 == 0) goto L_0x024d
            com.tencent.mm.autogen.events.StartActivityEvent r0 = new com.tencent.mm.autogen.events.StartActivityEvent     // Catch:{ all -> 0x0242 }
            r0.<init>()     // Catch:{ all -> 0x0242 }
            com.tencent.mm.autogen.events.StartActivityEvent$a r3 = r0.f343622d     // Catch:{ all -> 0x0242 }
            android.content.ComponentName r4 = r18.getComponent()     // Catch:{ all -> 0x0242 }
            java.lang.String r4 = r4.getClassName()     // Catch:{ all -> 0x0242 }
            r3.f343623a = r4     // Catch:{ all -> 0x0242 }
            r0.publish()     // Catch:{ all -> 0x0242 }
            goto L_0x024d
        L_0x0242:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r5] = r0
            java.lang.String r0 = "startActivity: "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r3)
        L_0x024d:
            r7 = 0
            goto L_0x0337
        L_0x0250:
            java.lang.String r3 = "HABBYGE-MALI.ActivityMonitor"
            if (r0 == 0) goto L_0x029d
            java.lang.Class r4 = r17.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r12 = "startActivity, srcActivity: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r7)
            k91.c r7 = k91.C21316c.m23893a()
            k91.a r7 = r7.f60219a
            k91.d r7 = (k91.C21317d) r7
            te3.q1 r12 = r7.mo33321a()
            if (r12 != 0) goto L_0x0279
            te3.q1 r12 = new te3.q1
            r12.<init>()
        L_0x0279:
            boolean r13 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r13 == 0) goto L_0x028c
            androidx.fragment.app.Fragment r13 = l91.C117467h.m165689d(r17)
            if (r13 == 0) goto L_0x028c
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            goto L_0x028d
        L_0x028c:
            r13 = 0
        L_0x028d:
            if (r13 != 0) goto L_0x0297
            java.lang.Class r13 = r17.getClass()
            java.lang.String r13 = r13.getCanonicalName()
        L_0x0297:
            r12.f64472p = r13
            r7.mo33322b(r12)
            goto L_0x02cf
        L_0x029d:
            i91.c r4 = i91.C21062c.m23249d()
            te3.t1 r4 = r4.mo32776g()
            if (r4 == 0) goto L_0x02ce
            te3.fh4 r4 = r4.f354392d
            java.lang.String r4 = r4.f354001d
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r12 = "startActivity, srcActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r7)
            k91.c r7 = k91.C21316c.m23893a()
            k91.a r7 = r7.f60219a
            k91.d r7 = (k91.C21317d) r7
            te3.q1 r12 = r7.mo33321a()
            if (r12 != 0) goto L_0x02c8
            te3.q1 r12 = new te3.q1
            r12.<init>()
        L_0x02c8:
            r12.f64472p = r4
            r7.mo33322b(r12)
            goto L_0x02cf
        L_0x02ce:
            r4 = 0
        L_0x02cf:
            r7 = 0
            r12 = 100
            k91.C117394e.m165538d(r4, r7, r12)
            android.content.ComponentName r12 = r18.getComponent()
            if (r12 == 0) goto L_0x02e0
            java.lang.String r12 = r12.getClassName()
            goto L_0x02e1
        L_0x02e0:
            r12 = r7
        L_0x02e1:
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r5] = r12
            java.lang.String r14 = "startActivity, dstActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r14, r13)
            r3 = 101(0x65, float:1.42E-43)
            k91.C117394e.m165538d(r12, r7, r3)
            android.os.Bundle r3 = r18.getExtras()
            if (r3 != 0) goto L_0x02f7
            goto L_0x032b
        L_0x02f7:
            java.lang.String r13 = r3.getString(r11)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x0304
            k91.C117393b.m165533b(r11, r13)
        L_0x0304:
            int r9 = r3.getInt(r10, r9)
            java.lang.String r3 = r3.getString(r8, r7)
            if (r9 != r6) goto L_0x0323
            if (r3 == 0) goto L_0x0323
            java.lang.String r6 = "jd_store"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0323
            java.lang.String r6 = java.lang.String.valueOf(r9)
            k91.C117393b.m165533b(r10, r6)
            k91.C117393b.m165533b(r8, r3)
            goto L_0x032b
        L_0x0323:
            java.lang.String r3 = ""
            k91.C117393b.m165533b(r10, r3)
            k91.C117393b.m165533b(r8, r3)
        L_0x032b:
            m23663c(r0, r2, r4, r12, r5)
            j91.C21199a.m23661f(r12)
            j91.C21199a.m23660e(r4)
            j91.C21199a.m23657b(r5)
        L_0x0337:
            android.content.ComponentName r0 = r18.getComponent()
            if (r0 == 0) goto L_0x0341
            java.lang.String r7 = r0.getClassName()
        L_0x0341:
            boolean r0 = u24.C90599h.m113511d(r7)
            if (r0 != 0) goto L_0x035f
            java.util.List<h81.j$d> r0 = r1.f59969a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x034f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x035f
            java.lang.Object r2 = r0.next()
            h81.j$d r2 = (h81.C20928j.C20932d) r2
            r2.mo32649h(r7)
            goto L_0x034f
        L_0x035f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.C21200b.mo33175a(android.app.Activity, android.content.Intent):void");
    }

    @Deprecated
    /* renamed from: d */
    public final void mo33176d(String str, boolean z) {
        C21199a.m23657b(1);
        if (z || !C116711b.m164587l(str)) {
            C118467t1 g = C21062c.m23249d().mo32776g();
            String str2 = null;
            if (g != null) {
                str2 = g.f354392d.f354001d;
            }
            C21199a.m23658c(str);
            C21199a.m23659d(str2);
            Log.m105925i("HABBYGE-MALI.ActivityMonitor", "_finish: from: %s, to: %s = ", str, str2);
            return;
        }
        Log.m105924i("HABBYGE-MALI.ActivityMonitor", "_quiteActivity come frome: moveActivityTaskToBack");
    }
}
