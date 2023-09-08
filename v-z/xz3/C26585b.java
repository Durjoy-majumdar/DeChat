package xz3;

import xz3.C26607p;

/* renamed from: xz3.b */
public abstract class C26585b<MessageType extends C26607p> implements C26610r<MessageType> {
    static {
        int i = C26589f.f73999b;
    }

    /* renamed from: b */
    public final MessageType mo53515b(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        C26601j jVar = new C26601j((messagetype instanceof C26583a ? new C26611v((C26583a) messagetype) : new C26611v(messagetype)).getMessage());
        jVar.f74023d = messagetype;
        throw jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        throw xz3.C26601j.m34468b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        throw new xz3.C26601j("CodedInputStream encountered a malformed varint.");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo53516c(java.io.InputStream r6, xz3.C26589f r7) {
        /*
            r5 = this;
            int r0 = r6.read()     // Catch:{ IOException -> 0x0067 }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r6 = 0
            goto L_0x004f
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x0067 }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            xz3.j r6 = xz3.C26601j.m34468b()     // Catch:{ IOException -> 0x0067 }
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x005f
            int r3 = r6.read()     // Catch:{ IOException -> 0x0067 }
            if (r3 == r1) goto L_0x005a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0057
        L_0x003a:
            xz3.a$a$a r1 = new xz3.a$a$a
            r1.<init>(r6, r0)
            xz3.d r6 = new xz3.d
            r6.<init>(r1)
            java.lang.Object r7 = r5.mo52860a(r6, r7)
            xz3.p r7 = (xz3.C26607p) r7
            r0 = 0
            r6.mo53517a(r0)     // Catch:{ j -> 0x0053 }
            r6 = r7
        L_0x004f:
            r5.mo53515b(r6)
            return r6
        L_0x0053:
            r6 = move-exception
            r6.f74023d = r7
            throw r6
        L_0x0057:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x005a:
            xz3.j r6 = xz3.C26601j.m34468b()     // Catch:{ IOException -> 0x0067 }
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x005f:
            xz3.j r6 = new xz3.j     // Catch:{ IOException -> 0x0067 }
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r7)     // Catch:{ IOException -> 0x0067 }
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            xz3.j r7 = new xz3.j
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C26585b.mo53516c(java.io.InputStream, xz3.f):java.lang.Object");
    }
}
