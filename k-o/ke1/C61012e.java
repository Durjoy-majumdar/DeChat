package ke1;

import fy3.C32226l;
import hp3.C87581a;
import ht1.C60187m5;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import te3.C50405mi0;

/* renamed from: ke1.e */
public final class C61012e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ List<C50405mi0> f173756a;

    /* renamed from: b */
    public final /* synthetic */ LinkedList<C60187m5> f173757b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<List<? extends C60187m5>, C13598b0> f173758c;

    /* renamed from: d */
    public final /* synthetic */ C61001a f173759d;

    public C61012e(List<? extends C50405mi0> list, LinkedList<C60187m5> linkedList, C32226l<? super List<? extends C60187m5>, C13598b0> lVar, C61001a aVar) {
        this.f173756a = list;
        this.f173757b = linkedList;
        this.f173758c = lVar;
        this.f173759d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            int r0 = r10.f256793a
            r1 = 0
            java.lang.String r2 = ""
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
            java.util.LinkedList<ht1.m5> r0 = r9.f173757b
            java.util.Iterator r10 = r10.iterator()
        L_0x0030:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0158
            java.lang.Object r5 = r10.next()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r5
            java.lang.String r6 = "it"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 3
            fe1.q r6 = fe1.C58960c.m68834f(r5, r1, r3, r6, r1)
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
            r5 = r1
        L_0x0062:
            if (r5 != 0) goto L_0x0065
            r5 = r2
        L_0x0065:
            r6.field_username = r5
            java.lang.String r5 = "[fetchContactList2] server error."
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
            java.lang.String r7 = "avatarUrl is null, nickname="
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
            java.lang.String r7 = "[fetchContactList2] nickname is null. username="
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
            java.util.List<te3.mi0> r10 = r9.f173756a
            ke1.a r0 = r9.f173759d
            java.util.LinkedList<ht1.m5> r5 = r9.f173757b
            java.util.Iterator r10 = r10.iterator()
        L_0x00ee:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r10.next()
            te3.mi0 r6 = (te3.C50405mi0) r6
            java.lang.String r7 = r6.f138041d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85823W4(r7)
            if (r7 == 0) goto L_0x0110
            up1.d0 r7 = r0.mo85977g()
            java.lang.String r8 = r6.f138041d
            if (r8 != 0) goto L_0x010b
            r8 = r2
        L_0x010b:
            fe1.q r7 = r7.mo89501jo(r8)
            goto L_0x0141
        L_0x0110:
            java.lang.String r7 = r6.f138041d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85817T4(r7)
            if (r7 == 0) goto L_0x0121
            fe1.d$b r7 = fe1.C58961d.f168673a
            java.lang.String r8 = r6.f138041d
            fe1.q r7 = r7.mo84155b(r8)
            goto L_0x0141
        L_0x0121:
            java.lang.String r7 = r6.f138041d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85821V4(r7)
            if (r7 == 0) goto L_0x0137
            up1.c0 r7 = r0.mo85976f()
            java.lang.String r8 = r6.f138041d
            if (r8 != 0) goto L_0x0132
            r8 = r2
        L_0x0132:
            fe1.q r7 = r7.mo89497jo(r8)
            goto L_0x0141
        L_0x0137:
            fe1.q r7 = new fe1.q
            java.lang.String r8 = r6.f138041d
            if (r8 != 0) goto L_0x013e
            r8 = r2
        L_0x013e:
            r7.<init>(r8)
        L_0x0141:
            if (r7 != 0) goto L_0x014d
            fe1.q r7 = new fe1.q
            java.lang.String r6 = r6.f138041d
            if (r6 != 0) goto L_0x014a
            r6 = r2
        L_0x014a:
            r7.<init>(r6)
        L_0x014d:
            r7.f168731T1 = r3
            int r6 = r7.field_retryCount
            int r6 = r6 + r4
            r7.field_retryCount = r6
            r5.add(r7)
            goto L_0x00ee
        L_0x0158:
            java.util.LinkedList<ht1.m5> r10 = r9.f173757b
            ke1.a r0 = r9.f173759d
            java.util.Iterator r10 = r10.iterator()
        L_0x0160:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r10.next()
            ht1.m5 r2 = (ht1.C60187m5) r2
            boolean r4 = r2 instanceof fe1.C58969q
            if (r4 == 0) goto L_0x0160
            fe1.q r2 = (fe1.C58969q) r2
            java.lang.String r4 = r2.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85823W4(r4)
            r5 = 2
            if (r4 == 0) goto L_0x0185
            up1.d0 r4 = r0.mo85977g()
            ht1.C60198s3.C60199a.m70259a(r4, r2, r3, r5, r1)
            goto L_0x0160
        L_0x0185:
            java.lang.String r4 = r2.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85817T4(r4)
            if (r4 == 0) goto L_0x0195
            fe1.d$b r4 = fe1.C58961d.f168673a
            r4.mo84163k(r2)
            goto L_0x0160
        L_0x0195:
            java.lang.String r4 = r2.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85821V4(r4)
            if (r4 == 0) goto L_0x0160
            up1.c0 r4 = r0.mo85976f()
            ht1.C60195q3.C60196a.m70255a(r4, r2, r3, r5, r1)
            goto L_0x0160
        L_0x01a7:
            fy3.l<java.util.List<? extends ht1.m5>, rx3.b0> r10 = r9.f173758c
            java.util.LinkedList<ht1.m5> r0 = r9.f173757b
            r10.invoke(r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.C61012e.call(java.lang.Object):java.lang.Object");
    }
}
