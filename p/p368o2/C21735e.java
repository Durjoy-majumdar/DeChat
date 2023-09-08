package p368o2;

import com.tencent.xweb.file.XVFSFile;
import p363n2.C21587c;
import p363n2.C21593h;

/* renamed from: o2.e */
public class C21735e {

    /* renamed from: a */
    public C21745l f61530a = new C21745l(this);

    /* renamed from: b */
    public final C21738f f61531b;

    /* renamed from: c */
    public final C21737b f61532c;

    /* renamed from: d */
    public C21735e f61533d;

    /* renamed from: e */
    public int f61534e = 0;

    /* renamed from: f */
    public int f61535f = -1;

    /* renamed from: g */
    public C21736a f61536g = C21736a.NONE;

    /* renamed from: h */
    public int f61537h = 0;

    /* renamed from: i */
    public C21593h f61538i;

    /* renamed from: o2.e$a */
    public enum C21736a {
        NONE,
        STRONG
    }

    /* renamed from: o2.e$b */
    public enum C21737b {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C21735e(C21738f fVar, C21737b bVar) {
        this.f61531b = fVar;
        this.f61532c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ((r6.f61531b.f61567Q > 0) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r4 != r12) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r4 != r12) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0080, code lost:
        if (r4 != r2) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34024a(p368o2.C21735e r7, int r8, int r9, p368o2.C21735e.C21736a r10, int r11, boolean r12) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0014
            r7 = 0
            r6.f61533d = r7
            r6.f61534e = r1
            r7 = -1
            r6.f61535f = r7
            o2.e$a r7 = p368o2.C21735e.C21736a.NONE
            r6.f61536g = r7
            r7 = 2
            r6.f61537h = r7
            return r0
        L_0x0014:
            if (r12 != 0) goto L_0x008a
            o2.e$b r12 = p368o2.C21735e.C21737b.CENTER_Y
            o2.e$b r2 = p368o2.C21735e.C21737b.CENTER_X
            o2.e$b r3 = p368o2.C21735e.C21737b.BASELINE
            o2.e$b r4 = r7.f61532c
            o2.e$b r5 = r6.f61532c
            if (r4 != r5) goto L_0x003b
            if (r5 != r3) goto L_0x0082
            o2.f r12 = r7.f61531b
            int r12 = r12.f61567Q
            if (r12 <= 0) goto L_0x002c
            r12 = 1
            goto L_0x002d
        L_0x002c:
            r12 = 0
        L_0x002d:
            if (r12 == 0) goto L_0x0086
            o2.f r12 = r6.f61531b
            int r12 = r12.f61567Q
            if (r12 <= 0) goto L_0x0037
            r12 = 1
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r12 != 0) goto L_0x0082
            goto L_0x0086
        L_0x003b:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L_0x0086;
                case 1: goto L_0x006c;
                case 2: goto L_0x0055;
                case 3: goto L_0x006c;
                case 4: goto L_0x0055;
                case 5: goto L_0x0086;
                case 6: goto L_0x004e;
                case 7: goto L_0x0086;
                case 8: goto L_0x0086;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            o2.e$b r8 = r6.f61532c
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L_0x004e:
            if (r4 == r3) goto L_0x0086
            if (r4 == r2) goto L_0x0086
            if (r4 == r12) goto L_0x0086
            goto L_0x0082
        L_0x0055:
            o2.e$b r2 = p368o2.C21735e.C21737b.TOP
            if (r4 == r2) goto L_0x0060
            o2.e$b r2 = p368o2.C21735e.C21737b.BOTTOM
            if (r4 != r2) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = 1
        L_0x0061:
            o2.f r3 = r7.f61531b
            boolean r3 = r3 instanceof p368o2.C21742i
            if (r3 == 0) goto L_0x0087
            if (r2 != 0) goto L_0x0082
            if (r4 != r12) goto L_0x0086
            goto L_0x0082
        L_0x006c:
            o2.e$b r12 = p368o2.C21735e.C21737b.LEFT
            if (r4 == r12) goto L_0x0077
            o2.e$b r12 = p368o2.C21735e.C21737b.RIGHT
            if (r4 != r12) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = 1
        L_0x0078:
            o2.f r3 = r7.f61531b
            boolean r3 = r3 instanceof p368o2.C21742i
            if (r3 == 0) goto L_0x0084
            if (r12 != 0) goto L_0x0082
            if (r4 != r2) goto L_0x0086
        L_0x0082:
            r2 = 1
            goto L_0x0087
        L_0x0084:
            r2 = r12
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 != 0) goto L_0x008a
            return r1
        L_0x008a:
            r6.f61533d = r7
            if (r8 <= 0) goto L_0x0091
            r6.f61534e = r8
            goto L_0x0093
        L_0x0091:
            r6.f61534e = r1
        L_0x0093:
            r6.f61535f = r9
            r6.f61536g = r10
            r6.f61537h = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21735e.mo34024a(o2.e, int, int, o2.e$a, int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = r3.f61533d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34025b() {
        /*
            r3 = this;
            o2.f r0 = r3.f61531b
            int r0 = r0.f61575Y
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f61535f
            r2 = -1
            if (r0 <= r2) goto L_0x001a
            o2.e r2 = r3.f61533d
            if (r2 == 0) goto L_0x001a
            o2.f r2 = r2.f61531b
            int r2 = r2.f61575Y
            if (r2 != r1) goto L_0x001a
            return r0
        L_0x001a:
            int r0 = r3.f61534e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21735e.mo34025b():int");
    }

    /* renamed from: c */
    public boolean mo34026c() {
        return this.f61533d != null;
    }

    /* renamed from: d */
    public void mo34027d() {
        this.f61533d = null;
        this.f61534e = 0;
        this.f61535f = -1;
        this.f61536g = C21736a.STRONG;
        this.f61537h = 0;
        this.f61530a.mo34072j();
    }

    /* renamed from: e */
    public void mo34028e(C21587c cVar) {
        C21593h hVar = this.f61538i;
        if (hVar == null) {
            this.f61538i = new C21593h(C21593h.C21594a.UNRESTRICTED, (String) null);
        } else {
            hVar.mo33854c();
        }
    }

    public String toString() {
        return this.f61531b.f61576Z + XVFSFile.PATH_SEPARATOR + this.f61532c.toString();
    }
}
