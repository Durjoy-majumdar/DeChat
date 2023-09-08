package uv3;

import android.content.Context;
import aw3.C113080a;
import ew3.C116795d;
import mw3.C117582a;
import ov3.C117898a;
import ov3.C117899b;
import rv3.C118245h;
import vv3.C118702d;

/* renamed from: uv3.j */
public class C118619j extends C113080a {

    /* renamed from: c */
    public C117582a f354962c = new C117582a(this.f338483a.f355205a, 91);

    /* renamed from: d */
    public final C117898a f354963d = new C118620a();

    /* renamed from: uv3.j$a */
    public class C118620a extends C117898a {
        public C118620a() {
        }

        /* renamed from: a */
        public void mo181064a() {
            C118245h.m166799a("sensor_TuringSMIImpl", "[method: mTimeOutRunnable ] ");
            C118619j jVar = C118619j.this;
            C118617g gVar = new C118617g();
            gVar.f354961a = false;
            jVar.mo183358f(gVar);
        }
    }

    public C118619j(Context context, C118622l lVar) {
        super(context, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r11 = rv3.C90100b.m112724b(rv3.C90103e.m112733a(new java.io.File(r9)), rv3.C90100b.m112727e());
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gw3.C116997a m167301e(uv3.C118619j r14, gw3.C116997a r15) {
        /*
            vv3.d r0 = r14.f338483a
            wv3.a r0 = r0.f355211g
            r0.getClass()
            zv3.b r0 = zv3.C119181b.m168096b()
            vv3.d r1 = r14.f338483a
            zv3.b r2 = zv3.C119181b.m168096b()
            r2.getClass()
            r0.getClass()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x001d
            goto L_0x00e9
        L_0x001d:
            lw3.c r4 = r1.f355210f
            vv3.d r5 = r4.f351592a
            r6 = 5
            if (r5 == 0) goto L_0x0063
            lw3.b r7 = r4.f351593b
            android.content.Context r5 = r5.f355205a
            java.io.File r5 = r7.mo182197d(r5)
            java.lang.String r8 = "2"
            java.io.File r5 = r7.mo182198e(r5, r8)
            if (r5 != 0) goto L_0x0035
            goto L_0x0063
        L_0x0035:
            lw3.b r4 = r4.f351593b
            java.lang.String r5 = r5.getAbsolutePath()
            java.io.File[] r4 = r4.mo182196c(r5)
            if (r4 != 0) goto L_0x0042
            goto L_0x0063
        L_0x0042:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r4.length
            r8 = 0
            r9 = 0
        L_0x004a:
            if (r8 >= r7) goto L_0x0064
            r10 = r4[r8]
            if (r9 < r6) goto L_0x0051
            goto L_0x0064
        L_0x0051:
            java.lang.String r10 = r10.getAbsolutePath()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0060
            int r9 = r9 + 1
            r5.add(r10)
        L_0x0060:
            int r8 = r8 + 1
            goto L_0x004a
        L_0x0063:
            r5 = r2
        L_0x0064:
            if (r5 == 0) goto L_0x00e9
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x006e
            goto L_0x00e9
        L_0x006e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0081:
            boolean r9 = r5.hasNext()
            java.lang.String r10 = "V_3_5MBQ49B5AM14YYWJ_2021-09-28-15-01_301096_3"
            if (r9 == 0) goto L_0x00df
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            lw3.c r11 = r1.f355210f
            lw3.b r11 = r11.f351593b
            r11.getClass()
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 == 0) goto L_0x009e
        L_0x009c:
            r11 = r2
            goto L_0x00b6
        L_0x009e:
            java.io.File r11 = new java.io.File
            r11.<init>(r9)
            byte[] r11 = rv3.C90103e.m112733a(r11)
            byte[] r12 = rv3.C90100b.m112727e()
            byte[] r11 = rv3.C90100b.m112724b(r11, r12)
            if (r11 != 0) goto L_0x00b2
            goto L_0x009c
        L_0x00b2:
            byte[] r11 = rv3.C90099a.m112722b(r11)
        L_0x00b6:
            if (r11 == 0) goto L_0x0081
            int r12 = r11.length
            if (r12 > 0) goto L_0x00bc
            goto L_0x0081
        L_0x00bc:
            mx3.d r12 = new mx3.d
            r12.<init>()
            com.qq.taf.jce.JceInputStream r13 = new com.qq.taf.jce.JceInputStream
            r13.<init>((byte[]) r11)
            r12.readFrom(r13)
            r7.add(r9)
            r8.add(r12)
            int r9 = r8.size()
            if (r9 < r6) goto L_0x0081
            zv3.a r9 = r0.mo183896a(r1, r10, r8, r7)
            if (r9 == 0) goto L_0x0081
            r4.add(r9)
            goto L_0x0081
        L_0x00df:
            zv3.a r0 = r0.mo183896a(r1, r10, r8, r7)
            if (r0 == 0) goto L_0x00ea
            r4.add(r0)
            goto L_0x00ea
        L_0x00e9:
            r4 = r2
        L_0x00ea:
            if (r4 == 0) goto L_0x00f9
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00f9
            java.lang.Object r0 = r4.get(r3)
            zv3.a r0 = (zv3.C119180a) r0
            goto L_0x00fa
        L_0x00f9:
            r0 = r2
        L_0x00fa:
            if (r15 != 0) goto L_0x0150
            if (r0 != 0) goto L_0x0101
            r15 = r2
            goto L_0x019d
        L_0x0101:
            gw3.a r15 = new gw3.a
            r15.<init>()
            vv3.d r1 = r14.f338483a
            uv3.a r3 = uv3.C118611a.DATA_USAGE_TYPE_TRAIN
            xv3.C118905a.m167654a(r1, r15, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            gw3.d r3 = new gw3.d
            r3.<init>()
            java.lang.String r4 = "usage"
            r3.f350620d = r4
            java.lang.String r4 = "crashVal"
            r3.f350621e = r4
            r1.add(r3)
            r15.f350605s = r1
            vv3.d r1 = r14.f338483a
            android.content.Context r1 = r1.f355205a
            java.util.Map r1 = xv3.C118905a.m167655b(r1)
            r3 = r1
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0145
            java.util.Map<java.lang.String, java.lang.String> r3 = r15.f350592F
            if (r3 != 0) goto L_0x0140
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r15.f350592F = r3
        L_0x0140:
            java.util.Map<java.lang.String, java.lang.String> r3 = r15.f350592F
            r3.putAll(r1)
        L_0x0145:
            byte[] r0 = r0.f356900a
            if (r0 != 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r15.f350590D = r0
        L_0x014c:
            r14.mo165607a(r15, r2)
            goto L_0x019d
        L_0x0150:
            r14.mo165607a(r15, r2)
            if (r0 == 0) goto L_0x015c
            byte[] r1 = r0.f356900a
            if (r1 != 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r15.f350590D = r1
        L_0x015c:
            vv3.d r14 = r14.f338483a
            wv3.a r14 = r14.f355211g
            r14.getClass()
            if (r0 == 0) goto L_0x019d
            java.util.ArrayList<java.lang.String> r14 = r0.f356901b
            if (r14 == 0) goto L_0x019d
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0170
            goto L_0x019d
        L_0x0170:
            java.util.ArrayList<java.lang.String> r14 = r0.f356901b
            java.util.Iterator r14 = r14.iterator()
        L_0x0176:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0176
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0176
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0176
            r1.delete()
            goto L_0x0176
        L_0x019d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: uv3.C118619j.m167301e(uv3.j, gw3.a):gw3.a");
    }

    /* renamed from: f */
    public final boolean mo183358f(C118617g gVar) {
        C117899b bVar;
        boolean z = false;
        try {
            z = ((C116795d) this.f338484b).mo180769b(gVar);
            C118245h.m166799a("sensor_TuringSMIImpl", "[method: stopMasterEngine ] ");
            return z;
        } catch (Throwable th) {
            C118702d dVar = this.f338483a;
            if (dVar == null || (bVar = dVar.f355208d) == null) {
                return z;
            }
            ((C113080a) bVar).mo165608b(th, "stop");
            return z;
        }
    }
}
