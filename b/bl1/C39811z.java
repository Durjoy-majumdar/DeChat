package bl1;

import gy3.C87412m;
import tf1.C13914m;

/* renamed from: bl1.z */
public final class C39811z extends C39775b {

    /* renamed from: i */
    public String f106822i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39811z(boolean r4, te3.C52013xs0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r5, r0)
            r3.<init>(r4, r5)
            te3.mt0 r4 = new te3.mt0
            r4.<init>()
            pe3.b r5 = r5.f144906h
            r0 = 0
            if (r5 == 0) goto L_0x0018
            byte[] r5 = r5.mo123703f()
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            java.lang.String r1 = ""
            if (r5 != 0) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x002f
        L_0x0022:
            r4 = move-exception
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r4
            java.lang.String r4 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r1, r5)
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = r4.f138195d
            if (r4 != 0) goto L_0x0036
            r4 = r1
        L_0x0036:
            r3.f106822i = r4
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x003a:
            if (r0 != 0) goto L_0x0043
            te3.mt0 r4 = new te3.mt0
            r4.<init>()
            r3.f106822i = r1
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39811z.<init>(boolean, te3.xs0):void");
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C39811z) {
            return super.mo76f(mVar);
        }
        return -1;
    }

    public String getContent() {
        String str = this.f106822i;
        if (str != null) {
            return str;
        }
        C87412m.m108603p("msgContent");
        throw null;
    }

    /* renamed from: i */
    public String mo62406i() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextBoxMsg content:");
        String str = this.f106822i;
        if (str != null) {
            sb.append(str);
            sb.append(", ");
            sb.append(super.mo62406i());
            return sb.toString();
        }
        C87412m.m108603p("msgContent");
        throw null;
    }
}
