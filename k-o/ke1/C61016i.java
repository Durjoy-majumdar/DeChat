package ke1;

import fy3.C32226l;
import hp3.C87581a;
import ht1.C60187m5;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;

/* renamed from: ke1.i */
public final class C61016i<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ LinkedList<C60187m5> f173772a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<List<? extends C60187m5>, C13598b0> f173773b;

    /* renamed from: c */
    public final /* synthetic */ C61001a f173774c;

    public C61016i(LinkedList<C60187m5> linkedList, C32226l<? super List<? extends C60187m5>, C13598b0> lVar, C61001a aVar) {
        this.f173772a = linkedList;
        this.f173773b = lVar;
        this.f173774c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            int r0 = r10.f256793a
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00e4
            int r0 = r10.f256794b
            if (r0 != 0) goto L_0x00e4
            T r0 = r10.f256796d
            te3.nm0 r0 = (te3.C50564nm0) r0
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r0 = r0.f138660d
            java.lang.String r5 = "back.resp.contactList"
            gy3.C87412m.m108593f(r0, r5)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x00e4
            T r10 = r10.f256796d
            te3.nm0 r10 = (te3.C50564nm0) r10
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r10 = r10.f138660d
            gy3.C87412m.m108593f(r10, r5)
            java.util.LinkedList<ht1.m5> r0 = r9.f173772a
            java.util.Iterator r10 = r10.iterator()
        L_0x0030:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00fd
            java.lang.Object r5 = r10.next()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r5
            java.lang.String r6 = "it"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 3
            fe1.q r6 = fe1.C58960c.m68834f(r5, r2, r3, r6, r2)
            fe1.C58960c.m68832d(r6)
            java.lang.String r7 = r6.getUsername()
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            java.lang.String r8 = "Finder.ContactFetcher"
            if (r7 == 0) goto L_0x006c
            te3.mi0 r5 = r5.msgInfo
            if (r5 == 0) goto L_0x0061
            java.lang.String r5 = r5.f138041d
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 != 0) goto L_0x0065
            r5 = r1
        L_0x0065:
            r6.field_username = r5
            java.lang.String r5 = "[fetchAliasList] server error."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r5)
        L_0x006c:
            r6.f168731T1 = r4
            java.lang.String r5 = r6.getAvatarUrl()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x00a6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[fetchAliasList] avatarUrl is null, nickname="
            r5.append(r7)
            java.lang.String r7 = r6.getNickname()
            r5.append(r7)
            java.lang.String r7 = " username="
            r5.append(r7)
            java.lang.String r7 = r6.getUsername()
            r5.append(r7)
            r7 = 32
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r5)
        L_0x00a6:
            java.lang.String r5 = r6.getNickname()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00b2
            r5 = 1
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x00dd
            int r5 = r6.field_retryCount
            int r5 = r5 + r4
            r6.field_retryCount = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[fetchAliasList] nickname is null. username="
            r5.append(r7)
            java.lang.String r7 = r6.getUsername()
            r5.append(r7)
            java.lang.String r7 = " retryCount="
            r5.append(r7)
            int r7 = r6.field_retryCount
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r5)
            goto L_0x00df
        L_0x00dd:
            r6.field_retryCount = r3
        L_0x00df:
            r0.add(r6)
            goto L_0x0030
        L_0x00e4:
            fe1.q r10 = new fe1.q
            java.lang.String r0 = eb0.C75592q0.m90782l()
            if (r0 != 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r1 = r0
        L_0x00ee:
            r10.<init>(r1)
            r10.f168731T1 = r3
            int r0 = r10.field_retryCount
            int r0 = r0 + r4
            r10.field_retryCount = r0
            java.util.LinkedList<ht1.m5> r0 = r9.f173772a
            r0.add(r10)
        L_0x00fd:
            java.util.LinkedList<ht1.m5> r10 = r9.f173772a
            ke1.a r0 = r9.f173774c
            java.util.Iterator r10 = r10.iterator()
        L_0x0105:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x014c
            java.lang.Object r1 = r10.next()
            ht1.m5 r1 = (ht1.C60187m5) r1
            boolean r4 = r1 instanceof fe1.C58969q
            if (r4 == 0) goto L_0x0105
            fe1.q r1 = (fe1.C58969q) r1
            java.lang.String r4 = r1.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85823W4(r4)
            r5 = 2
            if (r4 == 0) goto L_0x012a
            up1.d0 r4 = r0.mo85977g()
            ht1.C60198s3.C60199a.m70259a(r4, r1, r3, r5, r2)
            goto L_0x0105
        L_0x012a:
            java.lang.String r4 = r1.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85817T4(r4)
            if (r4 == 0) goto L_0x013a
            fe1.d$b r4 = fe1.C58961d.f168673a
            r4.mo84163k(r1)
            goto L_0x0105
        L_0x013a:
            java.lang.String r4 = r1.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85821V4(r4)
            if (r4 == 0) goto L_0x0105
            up1.c0 r4 = r0.mo85976f()
            ht1.C60195q3.C60196a.m70255a(r4, r1, r3, r5, r2)
            goto L_0x0105
        L_0x014c:
            fy3.l<java.util.List<? extends ht1.m5>, rx3.b0> r10 = r9.f173773b
            java.util.LinkedList<ht1.m5> r0 = r9.f173772a
            r10.invoke(r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.C61016i.call(java.lang.Object):java.lang.Object");
    }
}
