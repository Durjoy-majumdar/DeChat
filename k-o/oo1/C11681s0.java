package oo1;

import hp3.C87581a;

/* renamed from: oo1.s0 */
public final class C11681s0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ boolean f34227a;

    /* renamed from: b */
    public final /* synthetic */ C11614d0 f34228b;

    public C11681s0(boolean z, C11614d0 d0Var) {
        this.f34227a = z;
        this.f34228b = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            int r0 = r10.f256793a
            r1 = 1
            if (r0 != 0) goto L_0x00b3
            int r0 = r10.f256794b
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r9.f34227a
            if (r0 == 0) goto L_0x001e
            oo1.d0 r0 = r9.f34228b
            T r2 = r10.f256796d
            te3.eo0 r2 = (te3.C49310eo0) r2
            if (r2 == 0) goto L_0x001a
            te3.e51 r2 = r2.f133029g
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            r0.f34049n = r2
            goto L_0x0027
        L_0x001e:
            oo1.d0 r0 = r9.f34228b
            T r2 = r10.f256796d
            te3.eo0 r2 = (te3.C49310eo0) r2
            r0.getClass()
        L_0x0027:
            T r10 = r10.f256796d
            te3.eo0 r10 = (te3.C49310eo0) r10
            if (r10 == 0) goto L_0x00b3
            te3.e51 r10 = r10.f133029g
            if (r10 == 0) goto L_0x00b3
            boolean r0 = r9.f34227a
            oo1.d0 r2 = r9.f34228b
            java.util.LinkedList<te3.d51> r3 = r10.f132697d
            r4 = 0
            if (r3 == 0) goto L_0x0090
            java.lang.String r5 = "i"
            if (r0 == 0) goto L_0x0069
            int r0 = r10.f132701h
            if (r0 != r1) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            java.util.List r3 = sx3.C110818d0.m150936h0(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x004d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r3.next()
            te3.d51 r6 = (te3.C49098d51) r6
            java.util.List<oo1.d0$c> r7 = r2.f34045j
            oo1.d0$c r8 = new oo1.d0$c
            gy3.C87412m.m108593f(r6, r5)
            r8.<init>(r2, r6)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r4, r8)
            goto L_0x004d
        L_0x0069:
            int r0 = r10.f132698e
            if (r0 != r1) goto L_0x006f
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            java.util.Iterator r3 = r3.iterator()
        L_0x0074:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r3.next()
            te3.d51 r6 = (te3.C49098d51) r6
            java.util.List<oo1.d0$c> r7 = r2.f34045j
            oo1.d0$c r8 = new oo1.d0$c
            gy3.C87412m.m108593f(r6, r5)
            r8.<init>(r2, r6)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r8)
            goto L_0x0074
        L_0x0090:
            r0 = 1
        L_0x0091:
            int r10 = r10.f132699f
            android.widget.TextView r3 = r2.f34042g
            if (r3 != 0) goto L_0x0098
            goto L_0x00b4
        L_0x0098:
            android.content.Context r2 = r2.f34037b
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131829607(0x7f112367, float:1.9292188E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r4] = r10
            java.lang.String r10 = r2.getString(r5, r6)
            r3.setText(r10)
            goto L_0x00b4
        L_0x00b3:
            r0 = 1
        L_0x00b4:
            oo1.d0 r10 = r9.f34228b
            r10.mo11525f()
            oo1.d0 r10 = r9.f34228b
            oo1.d0$d r10 = r10.f34046k
            if (r10 == 0) goto L_0x00c2
            r10.notifyDataSetChanged()
        L_0x00c2:
            boolean r10 = r9.f34227a
            if (r10 == 0) goto L_0x00dc
            if (r0 == 0) goto L_0x00d2
            oo1.d0 r10 = r9.f34228b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = r10.f34047l
            if (r10 == 0) goto L_0x00f1
            r10.mo26604l(r1)
            goto L_0x00f1
        L_0x00d2:
            oo1.d0 r10 = r9.f34228b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = r10.f34047l
            if (r10 == 0) goto L_0x00f1
            r10.mo26605m()
            goto L_0x00f1
        L_0x00dc:
            if (r0 == 0) goto L_0x00e8
            oo1.d0 r10 = r9.f34228b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = r10.f34047l
            if (r10 == 0) goto L_0x00f1
            r10.mo26580f(r1)
            goto L_0x00f1
        L_0x00e8:
            oo1.d0 r10 = r9.f34228b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r10 = r10.f34047l
            if (r10 == 0) goto L_0x00f1
            r10.mo26600h()
        L_0x00f1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "#loadData fromHead="
            r10.append(r1)
            boolean r1 = r9.f34227a
            r10.append(r1)
            java.lang.String r1 = ", hasMore="
            r10.append(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "MoreLiveListWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oo1.C11681s0.call(java.lang.Object):java.lang.Object");
    }
}
