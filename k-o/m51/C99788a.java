package m51;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.DeleteSql;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import i40.C98597b;
import i40.C98598e;
import kj2.C117407d;
import o51.C61941a;
import p749xh.C102668t1;
import rx3.C13598b0;
import vx3.C90875b;

/* renamed from: m51.a */
public final class C99788a extends C98597b {

    /* renamed from: m51.a$a */
    public static final class C61442a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99788a f174730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61442a(C99788a aVar) {
            super(0);
            this.f174730d = aVar;
        }

        public Object invoke() {
            C39622i0 a;
            this.f174730d.getClass();
            DeleteSql build = C102668t1.f302953n.delete().log("MicroMsg.DupCheck.DupCheckStoragePLC").where(C102668t1.f302957r.smallerThan((Number) Long.valueOf(C31543z5.m39453c() - 2592000000L))).build();
            Class cls = C61941a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            int run = build.run(((C61941a) a).getDB());
            Log.m105924i("MicroMsg.DupCheck.DupCheckStoragePLC", "delete result: " + run);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99788a(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C39622i0 a;
        C87412m.m108594g(context, "context");
        Class cls = C61941a.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C61941a aVar = (C61941a) a;
        aVar.getClass();
        aVar.mo85232c3(C86709a0.m107535s().f251807e + "DupCheck-1.db");
        C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new C61442a(this), 31, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b9  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p867wp.C102479b mo139146g3(java.lang.String r28, long r29, java.lang.String r31, byte[] r32) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r9 = r29
            wp.b r11 = new wp.b
            r11.<init>()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r28)
            r12 = -1
            java.lang.String r13 = "MicroMsg.DupCheck.DupCheckStoragePLC"
            if (r0 != 0) goto L_0x0031
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "path["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = "] is empty"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            r11.f301760a = r12
            return r11
        L_0x0031:
            r0 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x003d
            r0 = 13
            r7.mo139147i3(r0)
            goto L_0x0042
        L_0x003d:
            r0 = 1
            r7.mo139147i3(r0)
        L_0x0042:
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r28)
            r5 = 1
            if (r31 == 0) goto L_0x0056
            boolean r1 = z04.C112551y.m153811k(r31)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0053
            r1 = r31
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 != 0) goto L_0x005a
        L_0x0056:
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r28)
        L_0x005a:
            r6 = r1
            if (r6 == 0) goto L_0x0066
            boolean r1 = z04.C112551y.m153811k(r6)
            if (r1 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r11.f301760a = r12
            return r11
        L_0x006c:
            java.lang.String r1 = "fileMd5"
            gy3.C87412m.m108593f(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r4 = 95
            r1.append(r4)
            r1.append(r9)
            r1.append(r4)
            r1.append(r14)
            java.lang.String r4 = r1.toString()
            com.tencent.mm.sdk.storage.sql.SelectSql r1 = p749xh.C102668t1.m135647p2(r4)
            o51.a$a r16 = o51.C61941a.f176074i
            o51.a r17 = r16.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r17.getDB()
            java.lang.Class<wp.a> r3 = p867wp.C66163a.class
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = r1.singleQuery(r0, r3)
            wp.a r0 = (p867wp.C66163a) r0
            r19 = 0
            r3 = 32
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = r0.getPath()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r0.getPath()
            boolean r1 = gy3.C87412m.m108589b(r1, r8)
            if (r1 != 0) goto L_0x00bd
            r1 = 1
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            r17 = r0
            goto L_0x00c5
        L_0x00c3:
            r17 = 0
        L_0x00c5:
            if (r17 == 0) goto L_0x0151
            if (r2 < 0) goto L_0x00cf
            r0 = 14
            r7.mo139147i3(r0)
            goto L_0x00d4
        L_0x00cf:
            r0 = 2
            r7.mo139147i3(r0)
        L_0x00d4:
            java.lang.String r0 = r17.getPath()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r8, r5)
            int r18 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r18 < 0) goto L_0x00e2
            r1 = 1
            goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            if (r1 == 0) goto L_0x010d
            if (r2 < 0) goto L_0x00fc
            r21 = 15
            r23 = 21
            r0 = r27
            r12 = r1
            r1 = r21
            r25 = r4
            r3 = r23
            r26 = r6
            r9 = 1
            r5 = r14
            r0.mo139148j3(r1, r3, r5)
            goto L_0x0120
        L_0x00fc:
            r12 = r1
            r25 = r4
            r26 = r6
            r9 = 1
            r1 = 3
            r3 = 18
            r0 = r27
            r5 = r14
            r0.mo139148j3(r1, r3, r5)
            goto L_0x0120
        L_0x010d:
            r12 = r1
            r25 = r4
            r26 = r6
            r9 = 1
            if (r2 < 0) goto L_0x011b
            r0 = 16
            r7.mo139147i3(r0)
            goto L_0x0120
        L_0x011b:
            r0 = 4
            r7.mo139147i3(r0)
        L_0x0120:
            r11.f301761b = r9
            r11.f301762c = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "already hit dup check "
            r0.append(r1)
            r1 = r25
            r0.append(r1)
            r2 = 32
            r0.append(r2)
            java.lang.String r3 = r17.getPath()
            r0.append(r3)
            java.lang.String r3 = " copyResult:"
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0157
        L_0x0151:
            r1 = r4
            r26 = r6
            r2 = 32
            r0 = 0
        L_0x0157:
            if (r0 != 0) goto L_0x015d
            r0 = 0
            r11.f301761b = r0
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            wp.a r3 = new wp.a
            r3.<init>()
            r3.mo142453s2(r1)
            r3.mo142455t2(r8)
            r4 = r29
            r3.mo142450q2(r4)
            r4 = r26
            r3.setMd5(r4)
            r3.mo142456u2(r14)
            long r4 = eb0.C31543z5.m39453c()
            r3.mo142457v2(r4)
            r4 = r32
            r3.mo142451r2(r4)
            o51.a r4 = r16.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.getDB()
            long r3 = r3.replaceToDB(r4, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkPath "
            r5.append(r6)
            r5.append(r1)
            r5.append(r2)
            r5.append(r8)
            java.lang.String r1 = " replaceRet:"
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x01b9
            r11.f301760a = r0
            r11.f301763d = r3
            goto L_0x01bc
        L_0x01b9:
            r0 = -1
            r11.f301760a = r0
        L_0x01bc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m51.C99788a.mo139146g3(java.lang.String, long, java.lang.String, byte[]):wp.b");
    }

    /* renamed from: i3 */
    public final void mo139147i3(long j) {
        C117407d.INSTANCE.idkeyStat(1957, j, 1, false);
    }

    /* renamed from: j3 */
    public final void mo139148j3(long j, long j2, long j3) {
        C117407d.INSTANCE.mo160130g(1957, 1957, (int) j, (int) j2, 1, (int) j3, false);
    }
}
