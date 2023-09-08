package gs0;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p749xh.C38647r;
import p823sg.C77710q;

/* renamed from: gs0.b */
public final class C87324b extends MAutoStorage<C32515a> {

    /* renamed from: f */
    public static final C32517a f253068f = new C32517a((C8480h) null);

    /* renamed from: g */
    public static final String[] f253069g = {MAutoStorage.getCreateSQLs(C32515a.f86358v, "AppBrandFakeNativeSplashScreenshot")};

    /* renamed from: h */
    public static final String[] f253070h = {"appId", "versionType", "appVersion", "isDarkMode"};

    /* renamed from: d */
    public final ISQLiteDatabase f253071d;

    /* renamed from: e */
    public final ReentrantReadWriteLock f253072e = new ReentrantReadWriteLock();

    /* renamed from: gs0.b$a */
    public static final class C32517a {
        public C32517a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo58669a() {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_fakenative_use_snapshot_loading, BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE);
        }

        /* renamed from: b */
        public final String mo58670b(String str) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C112760b.m154225d());
            sb4.append("appbrand/runtime_snapshots/");
            String qVar = new C77710q(C86709a0.m107531m().mo58407a().mo71804b() ? C86709a0.m107523b().mo121110g() : C86718e.C86720e.m107579d()).toString();
            C87412m.m108593f(qVar, "if (MMKernel.process().c…(it).toString()\n        }");
            sb4.append(qVar);
            String sb5 = sb4.toString();
            C86013q1.m106461v(sb5);
            sb.append(sb5);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: gs0.b$b */
    public static abstract class C32518b {

        /* renamed from: gs0.b$b$a */
        public static final class C32519a extends C32518b {

            /* renamed from: a */
            public static final C32519a f86360a = new C32519a();
        }

        /* renamed from: gs0.b$b$b */
        public static final class C32520b extends C32518b {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32520b)) {
                    return false;
                }
                ((C32520b) obj).getClass();
                return true;
            }

            public int hashCode() {
                return 0;
            }

            public String toString() {
                return "EQUAL(version=0)";
            }
        }

        /* renamed from: gs0.b$b$c */
        public static final class C32521c extends C32518b {

            /* renamed from: a */
            public final int f86361a;

            public C32521c(int i) {
                this.f86361a = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32521c) && this.f86361a == ((C32521c) obj).f86361a;
            }

            public int hashCode() {
                return this.f86361a;
            }

            public String toString() {
                return "LESS(version=" + this.f86361a + ')';
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87324b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C32515a.f86358v, "AppBrandFakeNativeSplashScreenshot", C38647r.f103449j);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f253071d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[Catch:{ all -> 0x0028 }] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121718Lo(com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r8) {
        /*
            r7 = this;
            java.lang.String r0 = "initConfigWC"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = r8.f239373d1
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r8.f239362d
            int r1 = r8.f239365g
            int r2 = r8.f234802F
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r7.f253072e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.lock()
            if (r0 == 0) goto L_0x002a
            int r5 = r0.length()     // Catch:{ all -> 0x0028 }
            if (r5 != 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            r5 = 0
            goto L_0x002b
        L_0x0028:
            r8 = move-exception
            goto L_0x0053
        L_0x002a:
            r5 = 1
        L_0x002b:
            r6 = 0
            if (r5 == 0) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            gs0.a r5 = new gs0.a     // Catch:{ all -> 0x0028 }
            r5.<init>()     // Catch:{ all -> 0x0028 }
            r5.field_appId = r0     // Catch:{ all -> 0x0028 }
            r5.field_versionType = r1     // Catch:{ all -> 0x0028 }
            r5.field_appVersion = r2     // Catch:{ all -> 0x0028 }
            r5.field_isDarkMode = r3     // Catch:{ all -> 0x0028 }
            java.lang.String[] r0 = f253070h     // Catch:{ all -> 0x0028 }
            int r1 = r0.length     // Catch:{ all -> 0x0028 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0028 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0028 }
            boolean r0 = super.get(r5, (java.lang.String[]) r0)     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r6 = r5.field_screenshotFilePath     // Catch:{ all -> 0x0028 }
        L_0x004d:
            r4.unlock()
            r8.f239385p1 = r6
            return
        L_0x0053:
            r4.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.C87324b.mo121718Lo(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: jo */
    public final int mo121719jo(java.lang.String r12, int r13, gs0.C87324b.C32518b r14) {
        /*
            r11 = this;
            java.lang.String r0 = "version"
            gy3.C87412m.m108594g(r14, r0)
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0013
            int r2 = r12.length()
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x0017:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "appId='"
            r3.append(r4)
            r3.append(r12)
            r4 = 39
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            if (r13 < 0) goto L_0x007a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "versionType="
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            boolean r3 = r14 instanceof gs0.C87324b.C32518b.C32519a
            if (r3 != 0) goto L_0x007a
            boolean r3 = r14 instanceof gs0.C87324b.C32518b.C32521c
            if (r3 == 0) goto L_0x006e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "appVersion<"
            r3.append(r4)
            r4 = r14
            gs0.b$b$c r4 = (gs0.C87324b.C32518b.C32521c) r4
            int r4 = r4.f86361a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            goto L_0x007a
        L_0x006e:
            boolean r3 = r14 instanceof gs0.C87324b.C32518b.C32520b
            if (r3 == 0) goto L_0x007a
            r3 = r14
            gs0.b$b$b r3 = (gs0.C87324b.C32518b.C32520b) r3
            java.lang.String r3 = "appVersion=0"
            r2.add(r3)
        L_0x007a:
            java.lang.String r3 = "1=1"
            r2.add(r3)
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r3 = " AND "
            java.lang.String r2 = u24.C90599h.m113515h(r2, r3)
            java.lang.String r3 = "LinkedList<String>().app…ray(), \" AND \")\n        }"
            gy3.C87412m.m108593f(r2, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r11.f253072e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.readLock()
            int r6 = r4.getWriteHoldCount()
            if (r6 != 0) goto L_0x00a4
            int r6 = r4.getReadHoldCount()
            goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            r7 = 0
        L_0x00a6:
            if (r7 >= r6) goto L_0x00ae
            r5.unlock()
            int r7 = r7 + 1
            goto L_0x00a6
        L_0x00ae:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r11.f253071d     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r8.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r9 = "select screenshotFilePath from AppBrandFakeNativeSplashScreenshot where "
            r8.append(r9)     // Catch:{ all -> 0x0139 }
            r8.append(r2)     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0139 }
            r9 = 2
            r10 = 0
            android.database.Cursor r7 = r7.rawQuery(r8, r10, r9)     // Catch:{ all -> 0x0139 }
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ all -> 0x0132 }
            r8.<init>()     // Catch:{ all -> 0x0132 }
            if (r7 == 0) goto L_0x00ef
            boolean r9 = r7.isClosed()     // Catch:{ all -> 0x0132 }
            if (r9 != 0) goto L_0x00ef
            boolean r9 = r7.moveToFirst()     // Catch:{ all -> 0x0132 }
            if (r9 == 0) goto L_0x00ef
        L_0x00e2:
            java.lang.String r9 = r7.getString(r1)     // Catch:{ all -> 0x0132 }
            r8.add(r9)     // Catch:{ all -> 0x0132 }
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x0132 }
            if (r9 != 0) goto L_0x00e2
        L_0x00ef:
            cy3.C58003b.m67160a(r7, r10)     // Catch:{ all -> 0x0139 }
            r3.addAll(r8)     // Catch:{ all -> 0x0139 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r11.f253071d     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = "AppBrandFakeNativeSplashScreenshot"
            int r2 = r7.delete(r8, r2, r10)     // Catch:{ all -> 0x0139 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0139 }
        L_0x00ff:
            if (r1 >= r6) goto L_0x0107
            r5.lock()
            int r1 = r1 + 1
            goto L_0x00ff
        L_0x0107:
            r4.unlock()
            java.util.Iterator r1 = r3.iterator()
        L_0x010e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            goto L_0x010e
        L_0x011e:
            gs0.b$b$a r1 = gs0.C87324b.C32518b.C32519a.f86360a
            boolean r14 = gy3.C87412m.m108589b(r1, r14)
            if (r14 == 0) goto L_0x0131
            if (r13 >= 0) goto L_0x0131
            gs0.b$a r13 = f253068f
            java.lang.String r12 = r13.mo58670b(r12)
            com.tencent.p014mm.vfs.C86013q1.m106446g(r12, r0)
        L_0x0131:
            return r2
        L_0x0132:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r13 = move-exception
            cy3.C58003b.m67160a(r7, r12)     // Catch:{ all -> 0x0139 }
            throw r13     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r12 = move-exception
        L_0x013a:
            if (r1 >= r6) goto L_0x0142
            r5.lock()
            int r1 = r1 + 1
            goto L_0x013a
        L_0x0142:
            r4.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.C87324b.mo121719jo(java.lang.String, int, gs0.b$b):int");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: qq */
    public final boolean mo121720qq(gs0.C32515a r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
            goto L_0x0092
        L_0x0005:
            java.lang.String r1 = r11.field_appId
            int r2 = r11.field_versionType
            int r3 = r11.field_appVersion
            boolean r4 = r11.field_isDarkMode
            java.lang.String r11 = r11.field_screenshotFilePath
            r5 = 1
            if (r1 == 0) goto L_0x001b
            int r6 = r1.length()
            if (r6 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r6 = 0
            goto L_0x001c
        L_0x001b:
            r6 = 1
        L_0x001c:
            if (r6 == 0) goto L_0x0020
            goto L_0x0092
        L_0x0020:
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r10.f253072e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.readLock()
            int r8 = r6.getWriteHoldCount()
            if (r8 != 0) goto L_0x0031
            int r8 = r6.getReadHoldCount()
            goto L_0x0032
        L_0x0031:
            r8 = 0
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 >= r8) goto L_0x003b
            r7.unlock()
            int r9 = r9 + 1
            goto L_0x0033
        L_0x003b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            gs0.a r9 = new gs0.a     // Catch:{ all -> 0x0093 }
            r9.<init>()     // Catch:{ all -> 0x0093 }
            r9.field_appId = r1     // Catch:{ all -> 0x0093 }
            r9.field_versionType = r2     // Catch:{ all -> 0x0093 }
            r9.field_appVersion = r3     // Catch:{ all -> 0x0093 }
            r9.field_isDarkMode = r4     // Catch:{ all -> 0x0093 }
            java.lang.String[] r1 = f253070h     // Catch:{ all -> 0x0093 }
            int r2 = r1.length     // Catch:{ all -> 0x0093 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x0093 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0093 }
            boolean r2 = super.get(r9, (java.lang.String[]) r2)     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            java.lang.String r3 = r9.field_screenshotFilePath     // Catch:{ all -> 0x0093 }
            r9.field_screenshotFilePath = r11     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x006c
            boolean r11 = super.insert(r9)     // Catch:{ all -> 0x0093 }
            goto L_0x0077
        L_0x006c:
            int r11 = r1.length     // Catch:{ all -> 0x0093 }
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r1, r11)     // Catch:{ all -> 0x0093 }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x0093 }
            boolean r11 = super.update(r9, (java.lang.String[]) r11)     // Catch:{ all -> 0x0093 }
        L_0x0077:
            if (r3 == 0) goto L_0x0081
            int r1 = r3.length()     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            if (r5 != 0) goto L_0x0086
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ all -> 0x0093 }
        L_0x0086:
            if (r0 >= r8) goto L_0x008e
            r7.lock()
            int r0 = r0 + 1
            goto L_0x0086
        L_0x008e:
            r6.unlock()
            r0 = r11
        L_0x0092:
            return r0
        L_0x0093:
            r11 = move-exception
        L_0x0094:
            if (r0 >= r8) goto L_0x009c
            r7.lock()
            int r0 = r0 + 1
            goto L_0x0094
        L_0x009c:
            r6.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.C87324b.mo121720qq(gs0.a):boolean");
    }

    public boolean updateNotify(IAutoDBItem iAutoDBItem, boolean z, String[] strArr) {
        C32515a aVar = (C32515a) iAutoDBItem;
        C87412m.m108594g(strArr, "keys");
        if (aVar == null) {
            return false;
        }
        if (strArr.length >= 0) {
            aVar.systemRowid = -1;
        }
        return super.updateNotify(aVar, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
