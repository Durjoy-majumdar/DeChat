package wy0;

import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Map;
import lu3.C34379c;
import oa1.C117731d;
import rx3.C13604l;
import sx3.C90364q0;
import xy0.C102786a;
import xy0.C102787b;
import xy0.C102788c;
import xy0.C102790e;
import xy0.C102791f;
import xy0.C102792g;
import xy0.C102793h;
import y04.C112354s;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: wy0.e */
public final class C102519e {

    /* renamed from: a */
    public static final Map<Integer, C102790e> f301867a;

    /* renamed from: b */
    public static final MessageDigest f301868b = MessageDigest.getInstance("SHA-1");

    /* renamed from: c */
    public static final ByteBuffer f301869c = ByteBuffer.allocateDirect(4096);

    /* renamed from: d */
    public static final Integer[] f301870d = {7, 8, 9, 10};

    /* renamed from: wy0.e$a */
    public static final class C38365a extends C87413o implements C32226l<Integer, String> {

        /* renamed from: d */
        public static final C38365a f101237d = new C38365a();

        public C38365a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return "";
        }
    }

    static {
        C102792g gVar = new C102792g();
        f301867a = C90364q0.m113147f(new C13604l(43, gVar), new C13604l(62, gVar), new C13604l(44, gVar), new C13604l(486539313, gVar), new C13604l(98, new C102786a()), new C13604l(1124073521, new C102786a()), new C13604l(34, new C102793h()), new C13604l(3, new C102791f()), new C13604l(49, new C102788c()), new C13604l(268435505, new C102787b()));
    }

    /* renamed from: a */
    public static final boolean m135319a() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_attachment_duplicate_file_linkify, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        cy3.C58003b.m67160a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m135320b(java.lang.String r3) {
        /*
            java.nio.ByteBuffer r0 = f301869c
            if (r3 == 0) goto L_0x003d
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x003d
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            r1 = 0
            java.nio.channels.ReadableByteChannel r3 = com.tencent.p014mm.vfs.C86013q1.m106424F(r3, r1)
        L_0x0013:
            int r2 = r3.read(r0)     // Catch:{ all -> 0x0036 }
            if (r2 < 0) goto L_0x0025
            r0.flip()     // Catch:{ all -> 0x0036 }
            java.security.MessageDigest r2 = f301868b     // Catch:{ all -> 0x0036 }
            r2.update(r0)     // Catch:{ all -> 0x0036 }
            r0.clear()     // Catch:{ all -> 0x0036 }
            goto L_0x0013
        L_0x0025:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0036 }
            cy3.C58003b.m67160a(r3, r1)
            java.security.MessageDigest r3 = f301868b
            byte[] r3 = r3.digest()
            java.lang.String r0 = "SHA1.digest()"
            gy3.C87412m.m108593f(r3, r0)
            return r3
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            cy3.C58003b.m67160a(r3, r0)
            throw r1
        L_0x003d:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r0 = "path is empty"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102519e.m135320b(java.lang.String):byte[]");
    }

    /* renamed from: c */
    public static final boolean m135321c() {
        return C87412m.m108589b("1", C117731d.m166007c().mo182444f("clicfg_download_migration_linkify", "0", false, true));
    }

    /* renamed from: d */
    public static final C34379c m135322d(C32224a aVar) {
        C119179t tVar = C119157j.f356862d;
        C38364d dVar = new C38364d(aVar);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        return jVar.mo183879j(dVar, 0, "CalcWxEvents");
    }

    /* renamed from: e */
    public static final String m135323e(String str) {
        if (!C112551y.m153819s(str, "wcf://", false)) {
            return C112551y.m153819s(str, "/storage/emulated/0/tencent/MicroMsg/", false) ? m135326h(C112550d0.m153777M(str, "/storage/emulated/0/tencent/MicroMsg/")) : m135326h(str);
        }
        String str2 = "";
        String q = C112551y.m153817q(str, "wcf://", str2, false);
        int length = q.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(q.charAt(i) == '/')) {
                str2 = q.substring(i);
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
                break;
            }
            i++;
        }
        return (String) C112354s.m153284g(C112550d0.m153786V(str2, new char[]{XVFSFile.SEPARATOR_CHAR}, false, 0, 6, (Object) null), 0, C15607f.f42230d);
    }

    /* renamed from: f */
    public static final boolean m135324f() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_all_duplicate_file_linkify, false);
    }

    /* renamed from: g */
    public static final long m135325g(long j) {
        return j < TimeUtil.SECOND_TO_US ? j : j < 10000000 ? TimeUtil.SECOND_TO_US : j - 9000000;
    }

    /* renamed from: h */
    public static final String m135326h(String str) {
        String str2;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            if (!(str.charAt(i) == '/')) {
                str2 = str.substring(i);
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
                break;
            }
            i++;
        }
        return (String) C112354s.m153284g(C112550d0.m153786V(C112551y.m153817q(str2, "Download/", "Download/Download/", false), new char[]{XVFSFile.SEPARATOR_CHAR}, false, 0, 6, (Object) null), 1, C38365a.f101237d);
    }
}
