package zs3;

import at3.C113069b;
import at3.C113070c;

/* renamed from: zs3.e */
public class C119132e extends C113069b {

    /* renamed from: d */
    public final /* synthetic */ C113070c f356791d;

    /* renamed from: e */
    public final /* synthetic */ String f356792e;

    /* renamed from: f */
    public final /* synthetic */ C119127d f356793f;

    public C119132e(C119127d dVar, C113070c cVar, String str) {
        this.f356793f = dVar;
        this.f356791d = cVar;
        this.f356792e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0093 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165593a() {
        /*
            r9 = this;
            ft3.h<at3.f> r0 = at3.C113074f.f338470c
            java.lang.Object r0 = r0.mo180860b()
            at3.f r0 = (at3.C113074f) r0
            r0.getClass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.Context r2 = r0.f338471a
            java.lang.String r3 = "turingmm"
            r4 = 0
            java.io.File r2 = r2.getDir(r3, r4)
            if (r2 != 0) goto L_0x001c
            goto L_0x0049
        L_0x001c:
            java.io.File[] r2 = r2.listFiles()
            if (r2 != 0) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            int r3 = r2.length
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0049
            r6 = r2[r5]
            java.lang.String r7 = r6.getAbsolutePath()     // Catch:{ all -> 0x0043 }
            bt3.a r7 = r0.mo165604a(r7)     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x003b
            java.lang.String r8 = r6.getAbsolutePath()     // Catch:{ all -> 0x0043 }
            r1.put(r8, r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x003b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = "csGroupRecord is null."
            r7.<init>(r8)     // Catch:{ all -> 0x0043 }
            throw r7     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r6.deleteOnExit()
        L_0x0046:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0049:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r1.size()
            r5 = 1
            if (r3 != 0) goto L_0x0056
            goto L_0x007e
        L_0x0056:
            at3.f$b r3 = r0.mo165605b(r1, r4)
            if (r3 == 0) goto L_0x0063
            bt3.a r6 = r3.f338473a
            java.util.List<java.lang.String> r3 = r3.f338474b
            r2.put(r6, r3)
        L_0x0063:
            at3.f$b r3 = r0.mo165605b(r1, r5)
            if (r3 == 0) goto L_0x0070
            bt3.a r6 = r3.f338473a
            java.util.List<java.lang.String> r3 = r3.f338474b
            r2.put(r6, r3)
        L_0x0070:
            r3 = 2
            at3.f$b r0 = r0.mo165605b(r1, r3)
            if (r0 == 0) goto L_0x007e
            bt3.a r1 = r0.f338473a
            java.util.List<java.lang.String> r0 = r0.f338474b
            r2.put(r1, r0)
        L_0x007e:
            int r0 = r2.size()
            if (r0 != 0) goto L_0x008b
            at3.c r0 = r9.f356791d
            r1 = -1
            r0.mo165596d(r1)
            return
        L_0x008b:
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0093:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0127
            java.lang.Object r1 = r0.next()
            bt3.a r1 = (bt3.C113206a) r1
            long r6 = java.lang.System.currentTimeMillis()
            r1.f338716d = r6
            java.lang.String r3 = r9.f356792e
            r1.f338717e = r3
            at3.c r3 = r9.f356791d
            boolean r6 = r3 instanceof zs3.C119122a
            if (r6 == 0) goto L_0x00d4
            zs3.d r6 = r9.f356793f
            zs3.a r3 = (zs3.C119122a) r3
            r6.getClass()
            int r6 = r1.f338722j
            if (r6 != 0) goto L_0x00c7
            r6 = 4103(0x1007, float:5.75E-42)
            bt3.d r3 = r3.mo183832a(r6, r1)
            if (r3 == 0) goto L_0x0102
            int r3 = r3.f338739d
            if (r3 != 0) goto L_0x0102
            goto L_0x0100
        L_0x00c7:
            r6 = 4105(0x1009, float:5.752E-42)
            bt3.c r3 = r3.mo183833b(r6, r1)
            if (r3 == 0) goto L_0x0102
            int r3 = r3.f338737d
            if (r3 != 0) goto L_0x0102
            goto L_0x0100
        L_0x00d4:
            boolean r6 = r3 instanceof zs3.C119123b
            if (r6 == 0) goto L_0x0102
            zs3.d r6 = r9.f356793f
            zs3.b r3 = (zs3.C119123b) r3
            r6.getClass()
            int r6 = r1.f338722j
            if (r6 != 0) goto L_0x00f2
            java.lang.String r6 = "userIdentify"
            java.lang.String r7 = "reportWup"
            bt3.d r3 = r3.mo183232e(r6, r7, r1)
            if (r3 == 0) goto L_0x0102
            int r3 = r3.f338739d
            if (r3 != 0) goto L_0x0102
            goto L_0x0100
        L_0x00f2:
            java.lang.String r6 = "sensorReport"
            java.lang.String r7 = "sensorInsightReportWup"
            bt3.c r3 = r3.mo183231c(r6, r7, r1)
            if (r3 == 0) goto L_0x0102
            int r3 = r3.f338737d
            if (r3 != 0) goto L_0x0102
        L_0x0100:
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            if (r3 != 0) goto L_0x0106
            goto L_0x0093
        L_0x0106:
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0110:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0125 }
            r6.<init>(r3)     // Catch:{ all -> 0x0125 }
            r6.delete()     // Catch:{ all -> 0x0125 }
            goto L_0x0110
        L_0x0125:
            goto L_0x0110
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zs3.C119132e.mo165593a():void");
    }

    /* renamed from: b */
    public void mo165594b(Throwable th) {
        this.f356793f.getClass();
    }
}
