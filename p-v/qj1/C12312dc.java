package qj1;

import nj3.C11182m0;

/* renamed from: qj1.dc */
public final class C12312dc implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f35475d;

    public C12312dc(C12707vb vbVar) {
        this.f35475d = vbVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreateMMMenu(nj3.C76874e0 r9) {
        /*
            r8 = this;
            r9.clear()
            qj1.vb r0 = r8.f35475d
            java.lang.Class<cl1.z0> r1 = cl1.C0702z0.class
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
            cl1.z0 r1 = (cl1.C0702z0) r1
            java.util.List<cj1.o5> r1 = r1.f1672f
            java.lang.String r2 = "business(LiveMsgSlice::class.java).msgList"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()
            r4 = r2
            cj1.o5 r4 = (cj1.C0581o5) r4
            java.lang.String r4 = r4.mo571e()
            java.lang.String r5 = r0.f36406C
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            cj1.o5 r2 = (cj1.C0581o5) r2
            if (r2 == 0) goto L_0x003d
            te3.hx0 r1 = r2.mo579i()
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x006a
            java.util.LinkedList<te3.aw0> r1 = r1.f134930r
            if (r1 == 0) goto L_0x006a
            java.util.Iterator r1 = r1.iterator()
        L_0x004a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r1.next()
            r6 = r5
            te3.aw0 r6 = (te3.C48770aw0) r6
            int r6 = r6.f130789d
            r7 = 5
            if (r6 != r7) goto L_0x005e
            r6 = 1
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            if (r6 == 0) goto L_0x004a
            goto L_0x0063
        L_0x0062:
            r5 = r3
        L_0x0063:
            te3.aw0 r5 = (te3.C48770aw0) r5
            if (r5 == 0) goto L_0x006a
            java.lang.String r1 = r5.f130793h
            goto L_0x006b
        L_0x006a:
            r1 = r3
        L_0x006b:
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827041(0x7f111961, float:1.9286983E38)
            java.lang.String r5 = r5.getString(r6)
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87030O0()
            if (r5 == 0) goto L_0x0107
            java.lang.String r5 = r0.f36407D
            if (r5 == 0) goto L_0x0092
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0093
        L_0x0092:
            r2 = 1
        L_0x0093:
            if (r2 != 0) goto L_0x0107
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r4 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r4)
            monitor-enter(r2)
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0104 }
        L_0x00a9:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0104 }
            if (r5 == 0) goto L_0x00c1
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0104 }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = r6.f151997a     // Catch:{ all -> 0x0104 }
            java.lang.String r7 = r0.f36407D     // Catch:{ all -> 0x0104 }
            boolean r6 = gy3.C87412m.m108589b(r6, r7)     // Catch:{ all -> 0x0104 }
            if (r6 == 0) goto L_0x00a9
            r3 = r5
        L_0x00c1:
            monitor-exit(r2)
            al1.j r3 = (al1.C54130j) r3
            if (r3 == 0) goto L_0x0107
            int r2 = r3.f152018v
            r3 = 16
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            if (r2 == 0) goto L_0x00ea
            int r2 = r0.f36424y
            android.view.ViewGroup r3 = r0.f166287d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131828095(0x7f111d7f, float:1.9289121E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 2131756350(0x7f10053e, float:1.9143605E38)
            r9.mo107144g(r2, r3, r4)
            goto L_0x0107
        L_0x00ea:
            int r2 = r0.f36424y
            android.view.ViewGroup r3 = r0.f166287d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131828135(0x7f111da7, float:1.9289202E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 2131756349(0x7f10053d, float:1.9143603E38)
            r9.mo107144g(r2, r3, r4)
            goto L_0x0107
        L_0x0104:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x0107:
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87027N0()
            if (r2 == 0) goto L_0x0148
            if (r1 != 0) goto L_0x0148
            boolean r1 = r0.f36411H
            if (r1 == 0) goto L_0x012f
            int r1 = r0.f36423x
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828559(0x7f111f4f, float:1.9290062E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131756437(0x7f100595, float:1.9143781E38)
            r9.mo107144g(r1, r2, r3)
            goto L_0x0148
        L_0x012f:
            int r1 = r0.f36423x
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828562(0x7f111f52, float:1.9290068E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131756387(0x7f100563, float:1.914368E38)
            r9.mo107144g(r1, r2, r3)
        L_0x0148:
            boolean r1 = r0.f36408E
            if (r1 == 0) goto L_0x0166
            int r1 = r0.f36419t
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828557(0x7f111f4d, float:1.9290058E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131755988(0x7f1003d4, float:1.914287E38)
            r9.mo107144g(r1, r2, r3)
            goto L_0x017f
        L_0x0166:
            int r1 = r0.f36418s
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828553(0x7f111f49, float:1.929005E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131755987(0x7f1003d3, float:1.9142869E38)
            r9.mo107144g(r1, r2, r3)
        L_0x017f:
            boolean r1 = r0.f36408E
            if (r1 != 0) goto L_0x01ba
            boolean r1 = r0.f36409F
            if (r1 == 0) goto L_0x01a1
            int r1 = r0.f36422w
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828560(0x7f111f50, float:1.9290064E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131756030(0x7f1003fe, float:1.9142956E38)
            r9.mo107144g(r1, r2, r3)
            goto L_0x01ba
        L_0x01a1:
            int r1 = r0.f36422w
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828561(0x7f111f51, float:1.9290066E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131756027(0x7f1003fb, float:1.914295E38)
            r9.mo107144g(r1, r2, r3)
        L_0x01ba:
            int r1 = r0.f36420u
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828554(0x7f111f4a, float:1.9290052E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131755961(0x7f1003b9, float:1.9142816E38)
            r9.mo107144g(r1, r2, r3)
            int r1 = r0.f36421v
            android.view.ViewGroup r0 = r0.f166287d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131828142(0x7f111dae, float:1.9289217E38)
            java.lang.String r0 = r0.getString(r2)
            r2 = 2131756438(0x7f100596, float:1.9143784E38)
            r9.mo107144g(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12312dc.onCreateMMMenu(nj3.e0):void");
    }
}
