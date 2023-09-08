package c90;

import android.hardware.camera2.CaptureRequest;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: c90.b */
public final class C104326b {

    /* renamed from: a */
    public CaptureRequest.Builder f308801a;

    /* renamed from: b */
    public ArrayList<C104325a> f308802b;

    /* renamed from: c */
    public int f308803c;

    public C104326b(CaptureRequest.Builder builder, String str, ArrayList<C104325a> arrayList) {
        C87412m.m108594g(builder, "mRequest");
        C87412m.m108594g(str, "mCameraId");
        this.f308801a = builder;
        this.f308802b = arrayList;
        this.f308803c = C87412m.m108589b(str, "0") ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A[EDGE_INSN: B:29:0x004d->B:25:0x004d ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo146019a(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r8, r0)
            java.util.ArrayList<c90.a> r0 = r7.f308802b
            r1 = 0
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r0.next()
            r4 = r2
            c90.a r4 = (c90.C104325a) r4
            java.lang.String r5 = r4.f308794h
            boolean r5 = gy3.C87412m.m108589b(r5, r8)
            if (r5 == 0) goto L_0x0048
            java.lang.Integer r5 = r4.f308795i
            if (r5 == 0) goto L_0x0033
            int r5 = r5.intValue()
            int r6 = r7.f308803c
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0048
            java.lang.Integer r4 = r4.f308800n
            if (r4 == 0) goto L_0x0043
            int r4 = r4.intValue()
            r4 = r4 & r9
            if (r4 != 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 != 0) goto L_0x0048
            r4 = 1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            if (r4 == 0) goto L_0x000e
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            c90.a r2 = (c90.C104325a) r2
            if (r2 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            return r3
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.C104326b.mo146019a(java.lang.String, int):boolean");
    }

    /* renamed from: b */
    public final boolean mo146020b(String str, boolean z, int i) {
        C87412m.m108594g(str, "key");
        return mo146021c(str, (String) null, z, (Object) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if ((r10 != null ? gy3.C87412m.m108589b(r5.f308797k, r10) : true) != false) goto L_0x0054;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo146021c(java.lang.String r9, java.lang.String r10, boolean r11, java.lang.Object r12, int r13) {
        /*
            r8 = this;
            java.util.ArrayList<c90.a> r0 = r8.f308802b
            r1 = 0
            if (r0 == 0) goto L_0x0096
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r0.next()
            r5 = r3
            c90.a r5 = (c90.C104325a) r5
            java.lang.String r6 = r5.f308794h
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x0053
            java.lang.Integer r6 = r5.f308795i
            if (r6 == 0) goto L_0x0033
            int r6 = r6.intValue()
            int r7 = r8.f308803c
            r6 = r6 & r7
            if (r6 != 0) goto L_0x0033
            r6 = 1
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 != 0) goto L_0x0053
            java.lang.Integer r6 = r5.f308800n
            if (r6 == 0) goto L_0x0043
            int r6 = r6.intValue()
            r6 = r6 & r13
            if (r6 != 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 != 0) goto L_0x0053
            if (r10 == 0) goto L_0x004f
            java.lang.String r5 = r5.f308797k
            boolean r5 = gy3.C87412m.m108589b(r5, r10)
            goto L_0x0050
        L_0x004f:
            r5 = 1
        L_0x0050:
            if (r5 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x000e
            r2.add(r3)
            goto L_0x000e
        L_0x005a:
            if (r12 != 0) goto L_0x007f
            java.util.Iterator r9 = r2.iterator()
        L_0x0060:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r9.next()
            c90.a r10 = (c90.C104325a) r10
            android.hardware.camera2.CaptureRequest$Builder r12 = r8.f308801a
            java.lang.String r13 = "builder"
            gy3.C87412m.m108594g(r12, r13)
            gy3.C87412m.m108591d(r10)
            java.lang.Object r13 = r10.f308796j
            gy3.C87412m.m108591d(r13)
            b90.C104059b.m138818a(r12, r10, r11, r13)
            goto L_0x0060
        L_0x007f:
            java.util.Iterator r9 = r2.iterator()
        L_0x0083:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r9.next()
            c90.a r10 = (c90.C104325a) r10
            android.hardware.camera2.CaptureRequest$Builder r13 = r8.f308801a
            b90.C104059b.m138818a(r13, r10, r11, r12)
            goto L_0x0083
        L_0x0095:
            return r4
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.C104326b.mo146021c(java.lang.String, java.lang.String, boolean, java.lang.Object, int):boolean");
    }
}
