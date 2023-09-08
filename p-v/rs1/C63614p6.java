package rs1;

import hp3.C87581a;
import p749xh.C66276va;

/* renamed from: rs1.p6 */
public final class C63614p6<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66276va f180376a;

    /* renamed from: b */
    public final /* synthetic */ C63621r6 f180377b;

    public C63614p6(C66276va vaVar, C63621r6 r6Var) {
        this.f180376a = vaVar;
        this.f180377b = r6Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a4, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r7, r4) != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r7) {
        /*
            r6 = this;
            ob0.b$c r7 = (ob0.C89132b.C89134c) r7
            if (r7 != 0) goto L_0x0030
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "result == null id "
            r7.append(r0)
            xh.va r0 = r6.f180376a
            long r0 = r0.field_id
            r7.append(r0)
            java.lang.String r0 = " content "
            r7.append(r0)
            xh.va r0 = r6.f180376a
            java.lang.String r0 = r0.field_content
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            goto L_0x00d4
        L_0x0030:
            int r0 = r7.f256793a
            if (r0 != 0) goto L_0x0038
            int r1 = r7.f256794b
            if (r1 == 0) goto L_0x0042
        L_0x0038:
            er1.j4 r1 = er1.C58739j4.f168176a
            int r2 = r7.f256794b
            boolean r0 = r1.mo83681J(r0, r2)
            if (r0 == 0) goto L_0x00cd
        L_0x0042:
            T r7 = r7.f256796d
            te3.jm0 r7 = (te3.C50008jm0) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f136184e
            if (r7 == 0) goto L_0x00d4
            rs1.r6 r0 = r6.f180377b
            xh.va r1 = r6.f180376a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            er1.w3 r3 = er1.C58784w3.f168295a
            int r4 = r0.f180385d
            int r5 = r0.f180387f
            r3.mo83873H1(r2, r4, r5)
            long r3 = r7.f164794id
            java.lang.String r5 = "feed_object_id"
            r2.putExtra(r5, r3)
            java.lang.String r3 = r7.objectNonceId
            java.lang.String r4 = "feed_object_nonceid"
            r2.putExtra(r4, r3)
            long r3 = r1.field_id
            java.lang.String r5 = "mention_id"
            r2.putExtra(r5, r3)
            int r1 = r1.field_createTime
            java.lang.String r3 = "mention_create_time"
            r2.putExtra(r3, r1)
            int r1 = r0.f180385d
            java.lang.String r3 = "from_scene"
            r2.putExtra(r3, r1)
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r7.contact
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = r1.username
            if (r1 != 0) goto L_0x0089
        L_0x0087:
            java.lang.String r1 = ""
        L_0x0089:
            java.lang.String r3 = "feed_username"
            r2.putExtra(r3, r1)
            int r1 = r0.f180385d
            r3 = 1
            if (r1 != r3) goto L_0x00ae
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.contact
            r1 = 0
            if (r7 == 0) goto L_0x009b
            java.lang.String r7 = r7.username
            goto L_0x009c
        L_0x009b:
            r7 = r1
        L_0x009c:
            java.lang.String r4 = r0.f180390i
            if (r4 == 0) goto L_0x00a7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r4)
            if (r7 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00a7:
            java.lang.String r7 = "username"
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x00ae:
            r3 = 0
        L_0x00af:
            java.lang.String r7 = "feed_is_self"
            r2.putExtra(r7, r3)
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            android.app.Activity r1 = r0.getContext()
            r7.mo12871c(r1, r2)
            java.lang.Class<er1.b> r7 = er1.C58684b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            er1.b r7 = (er1.C58684b) r7
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            r7.Sx0(r0, r2)
            goto L_0x00d4
        L_0x00cd:
            rs1.r6 r0 = r6.f180377b
            int r7 = r7.f256794b
            rs1.C63621r6.m74939c3(r0, r7)
        L_0x00d4:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63614p6.call(java.lang.Object):java.lang.Object");
    }
}
