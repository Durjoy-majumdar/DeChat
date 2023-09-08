package p1040te;

import java.util.HashMap;
import p1046ue.C90650d;

/* renamed from: te.a */
public class C90394a {

    /* renamed from: a */
    public static final C90394a f259403a = new C90394a();

    /* renamed from: a */
    public C90650d mo124606a(C90650d.C90651a aVar, long j, int i) {
        C90395b bVar = C90395b.f259404d;
        bVar.getClass();
        int ordinal = aVar.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            if (!(i == 34069 || i == 34070 || i == 34071 || i == 34072 || i == 34073 || i == 34074)) {
                z = false;
            }
            if (z) {
                i = 34067;
            }
            return bVar.mo124608a(bVar.f259405a, j, i);
        } else if (ordinal == 1) {
            return bVar.mo124608a(bVar.f259406b, j, i);
        } else {
            if (ordinal != 3) {
                return null;
            }
            return (C90650d) ((HashMap) bVar.f259407c).get(Long.valueOf(j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r4 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
        if (r5 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        if (r11 == 36161) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r11 != 34067) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124607b(p1046ue.C90650d.C90651a r10, int r11, long r12, p1046ue.C90650d r14) {
        /*
            r9 = this;
            te.b r0 = p1040te.C90395b.f259404d
            r0.getClass()
            ue.d$a r6 = p1046ue.C90650d.C90651a.BUFFER
            ue.d$a r7 = p1046ue.C90650d.C90651a.TEXTURE
            r1 = 0
            r2 = 1
            if (r10 != r7) goto L_0x0022
            r3 = 3553(0xde1, float:4.979E-42)
            if (r11 == r3) goto L_0x008b
            r3 = 32879(0x806f, float:4.6073E-41)
            if (r11 == r3) goto L_0x008b
            r3 = 35866(0x8c1a, float:5.0259E-41)
            if (r11 == r3) goto L_0x008b
            r3 = 34067(0x8513, float:4.7738E-41)
            if (r11 != r3) goto L_0x008c
            goto L_0x008b
        L_0x0022:
            if (r10 != r6) goto L_0x0082
            r3 = 34962(0x8892, float:4.8992E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 36662(0x8f36, float:5.1374E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 36663(0x8f37, float:5.1376E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 34963(0x8893, float:4.8994E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 35051(0x88eb, float:4.9117E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 35052(0x88ec, float:4.9118E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 35982(0x8c8e, float:5.0422E-41)
            if (r11 == r3) goto L_0x004f
            r3 = 35345(0x8a11, float:4.9529E-41)
            if (r11 != r3) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r3 = 0
            goto L_0x0050
        L_0x004f:
            r3 = 1
        L_0x0050:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 37568(0x92c0, float:5.2644E-41)
            if (r11 == r5) goto L_0x0069
            r5 = 37102(0x90ee, float:5.1991E-41)
            if (r11 == r5) goto L_0x0069
            r5 = 36671(0x8f3f, float:5.1387E-41)
            if (r11 == r5) goto L_0x0069
            r5 = 37074(0x90d2, float:5.1952E-41)
            if (r11 != r5) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r5 = 0
            goto L_0x006a
        L_0x0069:
            r5 = 1
        L_0x006a:
            r8 = 24
            if (r4 < r8) goto L_0x007d
            r4 = 35882(0x8c2a, float:5.0281E-41)
            if (r11 != r4) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r3 != 0) goto L_0x008b
            if (r5 != 0) goto L_0x008b
            if (r4 == 0) goto L_0x008c
            goto L_0x008b
        L_0x007d:
            if (r3 != 0) goto L_0x008b
            if (r5 == 0) goto L_0x008c
            goto L_0x008b
        L_0x0082:
            ue.d$a r3 = p1046ue.C90650d.C90651a.RENDER_BUFFERS
            if (r10 != r3) goto L_0x008c
            r3 = 36161(0x8d41, float:5.0672E-41)
            if (r11 != r3) goto L_0x008c
        L_0x008b:
            r1 = 1
        L_0x008c:
            if (r1 != 0) goto L_0x008f
            goto L_0x00b9
        L_0x008f:
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x00b0
            if (r10 == r2) goto L_0x00a7
            r11 = 3
            if (r10 == r11) goto L_0x009b
            goto L_0x00b9
        L_0x009b:
            java.util.Map<java.lang.Long, ue.d> r10 = r0.f259407c
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r11, r14)
            goto L_0x00b9
        L_0x00a7:
            java.util.Map<java.lang.Long, java.util.Map<java.lang.Integer, ue.d>> r1 = r0.f259406b
            r2 = r11
            r3 = r12
            r5 = r14
            r0.mo124609b(r1, r2, r3, r5, r6)
            goto L_0x00b9
        L_0x00b0:
            java.util.Map<java.lang.Long, java.util.Map<java.lang.Integer, ue.d>> r1 = r0.f259405a
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.mo124609b(r1, r2, r3, r5, r6)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1040te.C90394a.mo124607b(ue.d$a, int, long, ue.d):void");
    }
}
