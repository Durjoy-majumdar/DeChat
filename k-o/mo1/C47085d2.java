package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import ob0.C11385n;

/* renamed from: mo1.d2 */
public final class C47085d2 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f126522d;

    public C47085d2(FinderProfileTabUIC finderProfileTabUIC) {
        this.f126522d = finderProfileTabUIC;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
        /*
            r3 = this;
            ob0.b0 r6 = f40.C86709a0.m107524d()
            r0 = 6628(0x19e4, float:9.288E-42)
            r6.mo123470p(r0, r3)
            boolean r6 = r7 instanceof je1.C46543v3
            if (r6 == 0) goto L_0x00d5
            je1.v3 r7 = (je1.C46543v3) r7
            java.lang.String r6 = r7.f125409g
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r0 = r3.f126522d
            java.lang.String r0 = r0.f160650G
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 != 0) goto L_0x001c
            return
        L_0x001c:
            if (r4 != 0) goto L_0x00d5
            r4 = -1234(0xfffffffffffffb2e, float:NaN)
            java.lang.String r6 = "Finder.FinderProfileTabUIC"
            if (r5 == r4) goto L_0x00c3
            if (r5 == 0) goto L_0x0028
            goto L_0x00d5
        L_0x0028:
            java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r4 = r7.f125413n
            if (r4 != 0) goto L_0x002e
            sx3.f0 r4 = sx3.C64186f0.f181907d
        L_0x002e:
            boolean r4 = r4.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x004a
            java.lang.String r4 = "onSceneEnd: add music tab items not empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            r4.getClass()
            mo1.z1 r5 = new mo1.z1
            r5.<init>(r4)
            o40.C61926c.m72668M(r5)
            goto L_0x00d5
        L_0x004a:
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            java.lang.String r0 = r4.f160650G
            java.lang.String r4 = r4.f160651H
            boolean r4 = gy3.C87412m.m108589b(r0, r4)
            r0 = 0
            if (r4 == 0) goto L_0x00a3
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            r4.getClass()
            wp1.f$a r1 = wp1.C15585f.f42211a
            java.lang.String r4 = r4.f160651H
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.LinkedList r4 = r1.mo14342e(r4, r0, r2)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x006e
            goto L_0x008d
        L_0x006e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x008d
            java.lang.Object r1 = r4.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r1 = r1.objectType
            r2 = 2
            if (r1 != r2) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            if (r1 == 0) goto L_0x0072
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            if (r5 == 0) goto L_0x00a3
            java.lang.String r4 = "onSceneEnd: add music tab self mv posting"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            r4.getClass()
            mo1.z1 r5 = new mo1.z1
            r5.<init>(r4)
            o40.C61926c.m72668M(r5)
            goto L_0x00d5
        L_0x00a3:
            java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r4 = r7.f125413n
            if (r4 != 0) goto L_0x00a9
            sx3.f0 r4 = sx3.C64186f0.f181907d
        L_0x00a9:
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = "onSceneEnd: remove music tab items  empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            r5 = -1
            r4.getClass()
            mo1.i2 r6 = new mo1.i2
            r6.<init>(r4, r5, r0)
            o40.C61926c.m72668M(r6)
            goto L_0x00d5
        L_0x00c3:
            java.lang.String r4 = "onSceneEnd: add music tab MM_ERR_DROP_CGI_BY_BUSINESS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC r4 = r3.f126522d
            r4.getClass()
            mo1.z1 r5 = new mo1.z1
            r5.<init>(r4)
            o40.C61926c.m72668M(r5)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mo1.C47085d2.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
