package com.tencent.mapsdk.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Hashtable;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.mb */
public final class C80350mb {

    /* renamed from: a */
    public static final int f235216a = 0;

    /* renamed from: b */
    private int f235217b = 100;

    /* renamed from: c */
    private C80351a<String> f235218c = new C80351a<>();

    /* renamed from: d */
    private Hashtable<String, Integer> f235219d = new Hashtable<>();

    /* renamed from: e */
    private IntBuffer f235220e;

    public C80350mb() {
        m97876b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m97875a(java.lang.String r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Hashtable<java.lang.String, java.lang.Integer> r0 = r7.f235219d     // Catch:{ all -> 0x0073 }
            int r0 = r0.size()     // Catch:{ all -> 0x0073 }
            int r1 = r7.f235217b     // Catch:{ all -> 0x0073 }
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x004f
            r7.m97876b()     // Catch:{ all -> 0x0073 }
            java.nio.IntBuffer r0 = r7.f235220e     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r7)
            return
        L_0x0016:
            com.tencent.mapsdk.internal.mb$a<java.lang.String> r0 = r7.f235218c     // Catch:{ all -> 0x0073 }
            int r1 = r0.f235224d     // Catch:{ all -> 0x0073 }
            int r4 = r0.f235223c     // Catch:{ all -> 0x0073 }
            if (r1 != r4) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            r5 = 0
            if (r1 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            int r1 = r0.f235221a     // Catch:{ all -> 0x0073 }
            int r4 = r4 % r1
            java.lang.Object[] r1 = r0.f235222b     // Catch:{ all -> 0x0073 }
            r6 = r1[r4]     // Catch:{ all -> 0x0073 }
            r1[r4] = r5     // Catch:{ all -> 0x0073 }
            int r4 = r4 + r3
            r0.f235223c = r4     // Catch:{ all -> 0x0073 }
            r5 = r6
        L_0x0032:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0073 }
            java.util.Hashtable<java.lang.String, java.lang.Integer> r0 = r7.f235219d     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r0.remove(r5)     // Catch:{ all -> 0x0073 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0073 }
            java.nio.IntBuffer r1 = r7.f235220e     // Catch:{ all -> 0x0073 }
            int r1 = r1.position()     // Catch:{ all -> 0x0073 }
            int r4 = r7.f235217b     // Catch:{ all -> 0x0073 }
            if (r1 >= r4) goto L_0x004f
            java.nio.IntBuffer r1 = r7.f235220e     // Catch:{ all -> 0x0073 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0073 }
            r1.put(r0)     // Catch:{ all -> 0x0073 }
        L_0x004f:
            com.tencent.mapsdk.internal.mb$a<java.lang.String> r0 = r7.f235218c     // Catch:{ all -> 0x0073 }
            int r1 = r0.f235224d     // Catch:{ all -> 0x0073 }
            int r4 = r1 + 1
            int r5 = r0.f235221a     // Catch:{ all -> 0x0073 }
            int r4 = r4 % r5
            int r6 = r0.f235223c     // Catch:{ all -> 0x0073 }
            if (r4 != r6) goto L_0x005d
            r2 = 1
        L_0x005d:
            if (r2 != 0) goto L_0x0068
            int r1 = r1 % r5
            java.lang.Object[] r2 = r0.f235222b     // Catch:{ all -> 0x0073 }
            int r3 = r1 + 1
            r0.f235224d = r3     // Catch:{ all -> 0x0073 }
            r2[r1] = r8     // Catch:{ all -> 0x0073 }
        L_0x0068:
            java.util.Hashtable<java.lang.String, java.lang.Integer> r0 = r7.f235219d     // Catch:{ all -> 0x0073 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0073 }
            r0.put(r8, r9)     // Catch:{ all -> 0x0073 }
            monitor-exit(r7)
            return
        L_0x0073:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80350mb.m97875a(java.lang.String, int):void");
    }

    /* renamed from: b */
    private synchronized void m97876b() {
        if (this.f235220e == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f235217b * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f235220e = allocateDirect.asIntBuffer();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.mb$a */
    public static class C80351a<E> {

        /* renamed from: a */
        public int f235221a = 100;

        /* renamed from: b */
        public Object[] f235222b = new Object[100];

        /* renamed from: c */
        public int f235223c = 0;

        /* renamed from: d */
        public int f235224d = 0;

        /* renamed from: b */
        private void m97881b() {
            this.f235224d = 0;
            this.f235223c = 0;
        }

        /* renamed from: c */
        private E m97882c() {
            int i = this.f235224d;
            int i2 = this.f235223c;
            if (i == i2) {
                return null;
            }
            int i3 = i2 % this.f235221a;
            E[] eArr = this.f235222b;
            E e = eArr[i3];
            eArr[i3] = null;
            this.f235223c = i3 + 1;
            return e;
        }

        /* renamed from: d */
        private boolean m97883d() {
            return (this.f235224d + 1) % this.f235221a == this.f235223c;
        }

        /* renamed from: e */
        private boolean m97884e() {
            return this.f235224d == this.f235223c;
        }

        /* renamed from: a */
        public final void mo111672a() {
            m97881b();
            int i = 0;
            while (true) {
                Object[] objArr = this.f235222b;
                if (i < objArr.length) {
                    objArr[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private boolean m97880a(E e) {
            int i = this.f235224d;
            int i2 = this.f235221a;
            if ((i + 1) % i2 == this.f235223c) {
                return false;
            }
            int i3 = i % i2;
            Object[] objArr = this.f235222b;
            this.f235224d = i3 + 1;
            objArr[i3] = e;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m97877b(javax.microedition.khronos.opengles.GL10 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.IntBuffer r0 = r2.f235220e     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            int r0 = r0.position()     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x001c
            java.nio.IntBuffer r1 = r2.f235220e     // Catch:{ all -> 0x001e }
            r1.rewind()     // Catch:{ all -> 0x001e }
            java.nio.IntBuffer r1 = r2.f235220e     // Catch:{ all -> 0x001e }
            r3.glDeleteTextures(r0, r1)     // Catch:{ all -> 0x001e }
            java.nio.IntBuffer r3 = r2.f235220e     // Catch:{ all -> 0x001e }
            r3.clear()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80350mb.m97877b(javax.microedition.khronos.opengles.GL10):void");
    }

    /* renamed from: a */
    private synchronized int m97874a(String str) {
        Integer num = this.f235219d.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final synchronized void mo111670a() {
        this.f235219d.clear();
        this.f235218c.mo111672a();
        IntBuffer intBuffer = this.f235220e;
        if (intBuffer != null) {
            intBuffer.clear();
        }
    }

    /* renamed from: a */
    public final synchronized void mo111671a(GL10 gl10) {
        if (this.f235220e != null) {
            for (String str : this.f235219d.keySet()) {
                this.f235220e.put(this.f235219d.get(str).intValue());
            }
            m97877b(gl10);
        }
        this.f235219d.clear();
        this.f235218c.mo111672a();
    }
}
