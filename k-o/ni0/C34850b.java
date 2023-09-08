package ni0;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import junit.framework.Assert;
import p749xh.C38629oa;

/* renamed from: ni0.b */
public final class C34850b extends MAutoStorage<C34851c> {

    /* renamed from: e */
    public static final String[] f93629e = C34851c.f93632q;

    /* renamed from: d */
    public final ISQLiteDatabase f93630d;

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C34851c.f93631p;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34850b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C34851c.f93631p, "WxaSecurityStorageInfo", C38629oa.f103270g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C34851c.f93631p;
        this.f93630d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        cy3.C58003b.m67160a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        throw r4;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo59760Lo(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB"
            r1 = 0
            java.lang.String r2 = "/dev/urandom"
            java.io.InputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106423E(r2)     // Catch:{ IOException -> 0x002c }
            byte[] r3 = new byte[r8]     // Catch:{ all -> 0x0025 }
            r4 = 0
        L_0x000c:
            int r5 = r8 - r4
            int r5 = r2.read(r3, r4, r5)     // Catch:{ all -> 0x0025 }
            r6 = 0
            if (r5 >= 0) goto L_0x001e
            java.lang.String r3 = "EOF of /dev/urandom ?!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x0025 }
            cy3.C58003b.m67160a(r2, r6)     // Catch:{ IOException -> 0x002c }
            return r6
        L_0x001e:
            int r4 = r4 + r5
            if (r4 < r8) goto L_0x000c
            cy3.C58003b.m67160a(r2, r6)     // Catch:{ IOException -> 0x002c }
            return r3
        L_0x0025:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r4 = move-exception
            cy3.C58003b.m67160a(r2, r3)     // Catch:{ IOException -> 0x002c }
            throw r4     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = " generate salt by [/dev/urandom] faild,  use Random#nextBytes instead"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
            byte[] r8 = new byte[r8]
            ky3.c$a r0 = ky3.C88334c.f255322d
            r0.mo122714b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C34850b.mo59760Lo(int):byte[]");
    }

    /* renamed from: jo */
    public final void mo59761jo(String str) {
        C87412m.m108594g(str, "appId");
        Assert.assertTrue(MMApplicationContext.isMainProcess());
        C34851c cVar = new C34851c();
        cVar.field_appId = str;
        delete(cVar, "appId");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo59762qq(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r4, r0)     // Catch:{ all -> 0x0061 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ all -> 0x0061 }
            junit.framework.Assert.assertTrue(r0)     // Catch:{ all -> 0x0061 }
            ni0.c r0 = new ni0.c     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            r0.field_appId = r4     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "appId"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ all -> 0x0061 }
            r3.get(r0, (java.lang.String[]) r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r0.field_securityKeySalt     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 == 0) goto L_0x002b
            int r2 = r0.length()     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 != 0) goto L_0x003d
            java.lang.String r4 = "MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB"
            java.lang.String r1 = "use securityKeySalt db cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "securityKeySalt"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)
            return r0
        L_0x003d:
            r0 = 64
            byte[] r0 = r3.mo59760Lo(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0061 }
            ni0.c r1 = new ni0.c     // Catch:{ all -> 0x0061 }
            r1.<init>()     // Catch:{ all -> 0x0061 }
            r1.field_appId = r4     // Catch:{ all -> 0x0061 }
            r1.field_securityKeySalt = r0     // Catch:{ all -> 0x0061 }
            r3.insert(r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB"
            java.lang.String r1 = "generate security key salt and insert into db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "securityKeySalt"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)
            return r0
        L_0x0061:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C34850b.mo59762qq(java.lang.String):java.lang.String");
    }
}
