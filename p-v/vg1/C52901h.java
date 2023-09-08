package vg1;

/* renamed from: vg1.h */
public final class C52901h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C52899g f147732d;

    /* renamed from: e */
    public final /* synthetic */ int f147733e;

    /* renamed from: vg1.h$a */
    public static final class C52902a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52899g f147734d;

        public C52902a(C52899g gVar) {
            this.f147734d = gVar;
        }

        public final void run() {
            this.f147734d.mo73679f(Boolean.FALSE);
        }
    }

    public C52901h(C52899g gVar, int i) {
        this.f147732d = gVar;
        this.f147733e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.Class<cl1.j> r0 = cl1.C39975j.class
            vg1.g r1 = r15.f147732d
            androidx.lifecycle.i0 r2 = r1.mo73678e(r0)
            cl1.j r2 = (cl1.C39975j) r2
            long r2 = r2.f107174q
            r1.f147730c = r2
            vg1.g r1 = r15.f147732d
            boolean r1 = r1.mo73681h()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002b
            vg1.g r1 = r15.f147732d
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r1 = r1.f147729b
            boolean r4 = r1.f111633r
            if (r4 == 0) goto L_0x0025
            r1.mo64550h1(r3)
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = 0
            goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            vg1.g r4 = r15.f147732d
            androidx.lifecycle.i0 r4 = r4.mo73678e(r0)
            cl1.j r4 = (cl1.C39975j) r4
            int r4 = r4.f107172o
            int r5 = r15.f147733e
            long r5 = (long) r5
            vg1.g r7 = r15.f147732d
            long r7 = r7.f147730c
            long r5 = r5 - r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[updateMessagesOnViewAttach] listSize:"
            r7.append(r8)
            int r8 = r15.f147733e
            r7.append(r8)
            java.lang.String r8 = " readCount:"
            r7.append(r8)
            vg1.g r8 = r15.f147732d
            long r8 = r8.f147730c
            r7.append(r8)
            java.lang.String r8 = ", reachLastVisibleComment:"
            r7.append(r8)
            vg1.g r8 = r15.f147732d
            androidx.lifecycle.i0 r0 = r8.mo73678e(r0)
            cl1.j r0 = (cl1.C39975j) r0
            boolean r0 = r0.f107173p
            r7.append(r0)
            java.lang.String r0 = ",unreadCount"
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ",reachLast:"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ", last position:"
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "BoxCommentListPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            if (r1 == 0) goto L_0x00a1
            vg1.g r0 = r15.f147732d
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r0 = r0.f147729b
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.mo64542Z0()
            vg1.h$a r1 = new vg1.h$a
            vg1.g r2 = r15.f147732d
            r1.<init>(r2)
            r0.post(r1)
            goto L_0x0101
        L_0x00a1:
            if (r4 >= 0) goto L_0x00a4
            r4 = 0
        L_0x00a4:
            int r0 = r15.f147733e
            int r0 = r0 - r2
            if (r4 <= r0) goto L_0x00aa
            r4 = r0
        L_0x00aa:
            vg1.g r0 = r15.f147732d
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r0 = r0.f147729b
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.mo64542Z0()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r2)
            java.lang.Object[] r8 = r1.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter$recoveryCommentStatus$1"
            java.lang.String r10 = "run"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPosition"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.mo17115r1(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter$recoveryCommentStatus$1"
            java.lang.String r9 = "run"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "scrollToPosition"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            vg1.g r0 = r15.f147732d
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r0 = r0.f147729b
            rx3.g r0 = r0.f111641z
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            vg1.i r0 = (vg1.C52903i) r0
            r0.mo73687b(r5)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg1.C52901h.run():void");
    }
}
