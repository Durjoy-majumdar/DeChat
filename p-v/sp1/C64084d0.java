package sp1;

/* renamed from: sp1.d0 */
public final class C64084d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f181698d;

    /* renamed from: e */
    public final /* synthetic */ C64075c0 f181699e;

    public C64084d0(long j, C64075c0 c0Var) {
        this.f181698d = j;
        this.f181699e = c0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r0 = r0.f181667n
            r1 = 0
            if (r0 == 0) goto L_0x001e
            long r2 = r10.f181698d
            java.lang.Object r0 = r0.getTag()
            boolean r4 = r0 instanceof java.lang.Long
            if (r4 != 0) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0041
            sp1.c0 r0 = r10.f181699e
            java.lang.String r0 = r0.f181664h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bubbleAttachToParent id:"
            r1.append(r2)
            long r2 = r10.f181698d
            r1.append(r2)
            java.lang.String r2 = " view have attach!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0041:
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r2 = r0.f181660d
            r3 = 2131313497(0x7f094359, float:1.8245392E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f181667n = r2
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r2 = r0.f181667n
            if (r2 == 0) goto L_0x005f
            int r0 = r2.indexOfChild(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            r2 = -1
            if (r0 != 0) goto L_0x0064
            goto L_0x007b
        L_0x0064:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x007b
            ok1.e r0 = ok1.C62042e.f176370a
            sp1.c0 r2 = r10.f181699e
            r0.mo87010H1(r2)
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r2 = r0.f181667n
            if (r2 == 0) goto L_0x0084
            r2.addView(r0)
            goto L_0x0084
        L_0x007b:
            sp1.c0 r0 = r10.f181699e
            java.lang.String r0 = r0.f181664h
            java.lang.String r2 = "bubbleAttachToParent, have contain child!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0084:
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r0 = r0.f181667n
            if (r0 != 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            r0.setVisibility(r1)
        L_0x008e:
            sp1.c0 r0 = r10.f181699e
            android.view.ViewGroup r0 = r0.f181667n
            if (r0 != 0) goto L_0x0095
            goto L_0x009e
        L_0x0095:
            long r1 = r10.f181698d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setTag(r1)
        L_0x009e:
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            sp1.c0 r1 = r10.f181699e
            te3.hj1 r1 = r1.getReportObj()
            r2 = 18054(0x4686, float:2.5299E-41)
            ok1.e r3 = ok1.C62042e.f176370a
            sp1.c0 r4 = r10.f181699e
            d60.b r4 = r4.f181661e
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout"
            gy3.C87412m.m108592e(r4, r5)
            com.tencent.mm.plugin.finder.live.view.b r4 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r4
            fj1.b r4 = r4.getBuContext()
            r5 = 31
            long r6 = r10.f181698d
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7 = 0
            r8 = 8
            r9 = 0
            te3.cb0 r3 = ok1.C62042e.m72804V(r3, r4, r5, r6, r7, r8, r9)
            r0.mo76728y(r1, r2, r3)
            sp1.c0 r0 = r10.f181699e
            cj1.b r0 = r0.f181655E
            long r1 = r10.f181698d
            r0.mo75630a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64084d0.run():void");
    }
}
