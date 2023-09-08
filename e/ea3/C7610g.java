package ea3;

import androidx.lifecycle.C54219z;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: ea3.g */
public class C7610g {

    /* renamed from: a */
    public C7612b f25883a = new C7612b((C7611a) null);

    /* renamed from: b */
    public Map<String, String> f25884b = new HashMap();

    /* renamed from: c */
    public C54219z<String> f25885c = new C54219z<>();

    /* renamed from: d */
    public String f25886d;

    /* renamed from: e */
    public String f25887e;

    /* renamed from: f */
    public C7613c f25888f = C7613c.NONE;

    /* renamed from: ea3.g$b */
    public class C7612b implements C98124g.C98125a {
        public C7612b(C7611a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
            return 0;
         */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r6, int r7, p1081gi.C98120c r8, p1081gi.C98121d r9, boolean r10) {
            /*
                r5 = this;
                java.lang.String r10 = "MicroMsg.VestImgUploadEngine"
                java.lang.String r0 = "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]"
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r6
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                r4 = 1
                r1[r4] = r3
                r3 = 2
                r1[r3] = r8
                r8 = 3
                r1[r8] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r1)
                ea3.g r8 = ea3.C7610g.this
                monitor-enter(r8)
                if (r9 == 0) goto L_0x0070
                int r10 = r9.field_retCode     // Catch:{ all -> 0x0072 }
                if (r10 != 0) goto L_0x0070
                if (r7 == 0) goto L_0x0026
                goto L_0x0070
            L_0x0026:
                ea3.g r7 = ea3.C7610g.this     // Catch:{ all -> 0x0072 }
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f25884b     // Catch:{ all -> 0x0072 }
                java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x0072 }
                java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0072 }
                ea3.g r7 = ea3.C7610g.this     // Catch:{ all -> 0x0072 }
                java.lang.String r7 = r7.f25887e     // Catch:{ all -> 0x0072 }
                boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x0072 }
                if (r7 != 0) goto L_0x004f
                java.lang.String r7 = "MicroMsg.VestImgUploadEngine"
                java.lang.String r9 = "currentPath=%s,callbackPath=%s, path updated after CDNTaskCallback"
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0072 }
                ea3.g r0 = ea3.C7610g.this     // Catch:{ all -> 0x0072 }
                java.lang.String r0 = r0.f25887e     // Catch:{ all -> 0x0072 }
                r10[r2] = r0     // Catch:{ all -> 0x0072 }
                r10[r4] = r6     // Catch:{ all -> 0x0072 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)     // Catch:{ all -> 0x0072 }
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                return r2
            L_0x004f:
                java.lang.String r7 = "MicroMsg.VestImgUploadEngine"
                java.lang.String r10 = "CDN upload success, file url = %s"
                java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0072 }
                java.lang.String r1 = r9.field_fileUrl     // Catch:{ all -> 0x0072 }
                r0[r2] = r1     // Catch:{ all -> 0x0072 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)     // Catch:{ all -> 0x0072 }
                com.tencent.mm.plugin.webview.model.v r7 = new com.tencent.mm.plugin.webview.model.v     // Catch:{ all -> 0x0072 }
                java.lang.String r9 = r9.field_fileUrl     // Catch:{ all -> 0x0072 }
                ea3.g r10 = ea3.C7610g.this     // Catch:{ all -> 0x0072 }
                java.lang.String r10 = r10.f25886d     // Catch:{ all -> 0x0072 }
                r7.<init>(r9, r10, r6)     // Catch:{ all -> 0x0072 }
                ob0.b0 r6 = f40.C86709a0.m107524d()     // Catch:{ all -> 0x0072 }
                r6.mo123460f(r7)     // Catch:{ all -> 0x0072 }
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                return r2
            L_0x0070:
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                return r2
            L_0x0072:
                r6 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0072 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ea3.C7610g.C7612b.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: ea3.g$c */
    public enum C7613c {
        NONE,
        LOADING,
        SUCCESS,
        FAIL
    }

    /* renamed from: a */
    public void mo8747a(String str, String str2) {
        this.f25886d = str2;
        this.f25887e = str;
        this.f25888f = C7613c.LOADING;
        long currentTimeMillis = System.currentTimeMillis();
        String b = C1297x.m1387b("vestacountavatar", currentTimeMillis, C75592q0.m90777g().getUsername(), String.valueOf(currentTimeMillis));
        ((HashMap) this.f25884b).put(Util.nullAsNil(b), str);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_VestImgUploadEngine";
        gVar.f287662f = this.f25883a;
        gVar.field_mediaId = b;
        gVar.field_fullpath = str;
        gVar.field_fileType = CdnLogic.kMediaTypeSmartHwPage;
        gVar.field_priority = 1;
        gVar.field_needStorage = true;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 200;
        gVar.field_bzScene = 2;
        if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            Log.m105921e("MicroMsg.VestImgUploadEngine", "hy: cdntra addSendTask failed. clientid:%s", b);
            this.f25888f = C7613c.FAIL;
        }
    }
}
