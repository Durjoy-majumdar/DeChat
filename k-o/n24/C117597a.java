package n24;

/* renamed from: n24.a */
public final class C117597a extends C117598c {

    /* renamed from: a */
    public final C117599e f351827a;

    public C117597a(C117599e eVar) {
        this.f351827a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.security.cert.Certificate> mo182137a(java.util.List<java.security.cert.Certificate> r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r11.removeFirst()
            r10.add(r0)
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0014:
            r3 = 9
            if (r1 >= r3) goto L_0x00a5
            int r3 = r10.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r10.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            n24.e r5 = r9.f351827a
            java.security.cert.X509Certificate r5 = r5.mo123282a(r3)
            if (r5 == 0) goto L_0x0058
            int r2 = r10.size()
            if (r2 > r4) goto L_0x0038
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L_0x003b
        L_0x0038:
            r10.add(r5)
        L_0x003b:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            r2 = 0
            goto L_0x0053
        L_0x004b:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0049 }
            r5.verify(r2)     // Catch:{ GeneralSecurityException -> 0x0049 }
            r2 = 1
        L_0x0053:
            if (r2 == 0) goto L_0x0056
            return r10
        L_0x0056:
            r2 = 1
            goto L_0x0088
        L_0x0058:
            java.util.Iterator r5 = r11.iterator()
        L_0x005c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0078
        L_0x0076:
            r7 = 0
            goto L_0x0080
        L_0x0078:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0076 }
            r3.verify(r7)     // Catch:{ GeneralSecurityException -> 0x0076 }
            r7 = 1
        L_0x0080:
            if (r7 == 0) goto L_0x005c
            r5.remove()
            r10.add(r6)
        L_0x0088:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x008b:
            if (r2 == 0) goto L_0x008e
            return r10
        L_0x008e:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.append(r0)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00a5:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n24.C117597a.mo182137a(java.util.List, java.lang.String):java.util.List");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C117597a) && ((C117597a) obj).f351827a.equals(this.f351827a);
    }

    public int hashCode() {
        return this.f351827a.hashCode();
    }
}
