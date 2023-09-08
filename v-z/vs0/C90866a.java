package vs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.List;
import ts0.C90577a;
import xs0.C91340d;
import ys0.C91578a;
import ys0.C91579b;
import ys0.C91584g;
import zs0.C91934b;

/* renamed from: vs0.a */
public abstract class C90866a {

    /* renamed from: a */
    public C90577a.C90579b f260844a = null;

    /* renamed from: vs0.a$a */
    public enum C90867a {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* renamed from: vs0.a$b */
    public enum C90868b {
        MATCHED,
        NOT_MATCHED
    }

    static {
        C91934b.m115450b("<policy-file-request/>\u0000");
    }

    /* renamed from: i */
    public static String m113958i(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b = b2;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = C91934b.f263208a;
        try {
            return new String(array, 0, limit, "ASCII");
        } catch (UnsupportedEncodingException e) {
            Log.m105920e("MicroMsg.AppBrandNetWork.Charsetfunctions", e.toString());
            return "";
        }
    }

    /* renamed from: a */
    public abstract C90868b mo124964a(C91578a aVar, C91584g gVar);

    /* renamed from: b */
    public abstract C90868b mo124965b(C91578a aVar);

    /* renamed from: c */
    public abstract C90866a mo124966c();

    /* renamed from: d */
    public abstract ByteBuffer mo124967d(C91340d dVar);

    /* renamed from: e */
    public abstract List<C91340d> mo124968e(String str, boolean z);

    /* renamed from: f */
    public abstract List<C91340d> mo124969f(ByteBuffer byteBuffer, boolean z);

    /* renamed from: g */
    public abstract C90867a mo124970g();

    /* renamed from: h */
    public abstract C91579b mo124971h(C91579b bVar);

    /* renamed from: j */
    public abstract void mo124972j();

    /* renamed from: k */
    public abstract List<C91340d> mo124973k(ByteBuffer byteBuffer);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ys0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ys0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ys0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ys0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ys0.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ys0.C91582e mo124974l(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            ts0.a$b r0 = r7.f260844a
            java.lang.String r1 = m113958i(r8)
            if (r1 == 0) goto L_0x007e
            r2 = 3
            java.lang.String r3 = " "
            java.lang.String[] r1 = r1.split(r3, r2)
            int r3 = r1.length
            if (r3 != r2) goto L_0x0078
            ts0.a$b r2 = ts0.C90577a.C90579b.CLIENT
            r3 = 2
            r4 = 1
            if (r0 != r2) goto L_0x002a
            ys0.d r0 = new ys0.d
            r0.<init>()
            r2 = r1[r4]
            short r2 = java.lang.Short.parseShort(r2)
            r0.f262429b = r2
            r1 = r1[r3]
            r0.f262430c = r1
            goto L_0x003d
        L_0x002a:
            ys0.c r0 = new ys0.c
            r0.<init>()
            r1 = r1[r4]
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = "MicroMsg.AppBrandNetWork.HandshakeImpl1Client"
            java.lang.String r2 = "http resource descriptor must not be null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x003d
        L_0x003b:
            r0.f262428b = r1
        L_0x003d:
            java.lang.String r1 = m113958i(r8)
        L_0x0041:
            if (r1 == 0) goto L_0x006f
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x006f
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2, r3)
            int r2 = r1.length
            if (r2 != r3) goto L_0x0067
            r2 = 0
            r2 = r1[r2]
            r1 = r1[r4]
            java.lang.String r5 = "^ +"
            java.lang.String r6 = ""
            java.lang.String r1 = r1.replaceFirst(r5, r6)
            r0.mo125463g(r2, r1)
            java.lang.String r1 = m113958i(r8)
            goto L_0x0041
        L_0x0067:
            ws0.d r8 = new ws0.d
            java.lang.String r0 = "not an http header"
            r8.<init>(r0)
            throw r8
        L_0x006f:
            if (r1 == 0) goto L_0x0072
            return r0
        L_0x0072:
            ws0.a r8 = new ws0.a
            r8.<init>()
            throw r8
        L_0x0078:
            ws0.d r8 = new ws0.d
            r8.<init>()
            throw r8
        L_0x007e:
            ws0.a r0 = new ws0.a
            int r8 = r8.capacity()
            int r8 = r8 + 128
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C90866a.mo124974l(java.nio.ByteBuffer):ys0.e");
    }
}
