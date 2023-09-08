package com.google.protobuf;

/* renamed from: com.google.protobuf.s0 */
public class C24018s0 {

    /* renamed from: a */
    public C16994k f69050a;

    /* renamed from: b */
    public C23806a0 f69051b;

    /* renamed from: c */
    public volatile C23845j1 f69052c;

    /* renamed from: d */
    public volatile C16994k f69053d;

    static {
        C23806a0.m28602a();
    }

    public C24018s0() {
    }

    public C24018s0(C23806a0 a0Var, C16994k kVar) {
        if (a0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (kVar != null) {
            this.f69051b = a0Var;
            this.f69050a = kVar;
        } else {
            throw new NullPointerException("found null ByteString");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.f69052c = r4;
        r3.f69053d = com.google.protobuf.C16994k.f46000e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.protobuf.C23845j1 mo38289a(com.google.protobuf.C23845j1 r4) {
        /*
            r3 = this;
            com.google.protobuf.j1 r0 = r3.f69052c
            if (r0 == 0) goto L_0x0005
            goto L_0x0033
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.j1 r0 = r3.f69052c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0033
        L_0x000c:
            com.google.protobuf.k r0 = r3.f69050a     // Catch:{ p0 -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.w1 r0 = r4.getParserForType()     // Catch:{ p0 -> 0x002c }
            com.google.protobuf.k r1 = r3.f69050a     // Catch:{ p0 -> 0x002c }
            com.google.protobuf.a0 r2 = r3.f69051b     // Catch:{ p0 -> 0x002c }
            java.lang.Object r0 = r0.parseFrom((com.google.protobuf.C16994k) r1, (com.google.protobuf.C23806a0) r2)     // Catch:{ p0 -> 0x002c }
            com.google.protobuf.j1 r0 = (com.google.protobuf.C23845j1) r0     // Catch:{ p0 -> 0x002c }
            r3.f69052c = r0     // Catch:{ p0 -> 0x002c }
            com.google.protobuf.k r0 = r3.f69050a     // Catch:{ p0 -> 0x002c }
            r3.f69053d = r0     // Catch:{ p0 -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f69052c = r4     // Catch:{ p0 -> 0x002c }
            com.google.protobuf.k r0 = com.google.protobuf.C16994k.f46000e     // Catch:{ p0 -> 0x002c }
            r3.f69053d = r0     // Catch:{ p0 -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f69052c = r4     // Catch:{ all -> 0x0036 }
            com.google.protobuf.k r4 = com.google.protobuf.C16994k.f46000e     // Catch:{ all -> 0x0036 }
            r3.f69053d = r4     // Catch:{ all -> 0x0036 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
        L_0x0033:
            com.google.protobuf.j1 r4 = r3.f69052c
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24018s0.mo38289a(com.google.protobuf.j1):com.google.protobuf.j1");
    }

    /* renamed from: b */
    public C16994k mo38290b() {
        if (this.f69053d != null) {
            return this.f69053d;
        }
        C16994k kVar = this.f69050a;
        if (kVar != null) {
            return kVar;
        }
        synchronized (this) {
            if (this.f69053d != null) {
                C16994k kVar2 = this.f69053d;
                return kVar2;
            }
            if (this.f69052c == null) {
                this.f69053d = C16994k.f46000e;
            } else {
                this.f69053d = this.f69052c.toByteString();
            }
            C16994k kVar3 = this.f69053d;
            return kVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24018s0)) {
            return false;
        }
        C24018s0 s0Var = (C24018s0) obj;
        C23845j1 j1Var = this.f69052c;
        C23845j1 j1Var2 = s0Var.f69052c;
        return (j1Var == null && j1Var2 == null) ? mo38290b().equals(s0Var.mo38290b()) : (j1Var == null || j1Var2 == null) ? j1Var != null ? j1Var.equals(s0Var.mo38289a(j1Var.getDefaultInstanceForType())) : mo38289a(j1Var2.getDefaultInstanceForType()).equals(j1Var2) : j1Var.equals(j1Var2);
    }

    public int hashCode() {
        return 1;
    }
}
