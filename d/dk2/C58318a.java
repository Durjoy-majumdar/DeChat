package dk2;

/* renamed from: dk2.a */
public final class C58318a {

    /* renamed from: a */
    public static final C58318a f166994a = new C58318a();

    /* renamed from: b */
    public static boolean f166995b;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo83069a() {
        /*
            r9 = this;
            java.lang.Class<rc0.c> r0 = rc0.C63389c.class
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent r1 = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent
            r1.<init>()
            r1.publish()
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent$a r1 = r1.f194014d
            boolean r2 = r1.f194016b
            java.lang.String r3 = "voip is running, can't do this"
            java.lang.String r4 = "MicroMsg.FloatWindowHelper"
            r5 = 2131838751(0x7f11471f, float:1.9310734E38)
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L_0x0036
            boolean r2 = r1.f194017c
            if (r2 == 0) goto L_0x001f
            goto L_0x0036
        L_0x001f:
            boolean r1 = p182kk.C61104a.m71644D()
            if (r1 == 0) goto L_0x0034
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (int) r5, (int) r7)
            r1.show()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x004b
        L_0x0034:
            r1 = 0
            goto L_0x004c
        L_0x0036:
            boolean r1 = r1.f194015a
            if (r1 == 0) goto L_0x003d
            r5 = 2131838750(0x7f11471e, float:1.9310732E38)
        L_0x003d:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (int) r5, (int) r7)
            r1.show()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x004b:
            r1 = 1
        L_0x004c:
            r2 = 2
            if (r1 == 0) goto L_0x0052
            r6 = 0
            goto L_0x00c9
        L_0x0052:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = p182kk.C61104a.m71656l(r1, r6)
            if (r1 != 0) goto L_0x00aa
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.autogen.events.LiveStateActionEvent r3 = new com.tencent.mm.autogen.events.LiveStateActionEvent
            r3.<init>()
            r3.publish()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.autogen.events.LiveStateActionEvent$a r5 = r3.f154829d
            boolean r5 = r5.f154830a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r7] = r5
            com.tencent.mm.autogen.events.LiveStateActionEvent$a r5 = r3.f154829d
            boolean r5 = r5.f154831b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.DeviceOccupy"
            java.lang.String r8 = "isLiving %b isAnchor %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            com.tencent.mm.autogen.events.LiveStateActionEvent$a r3 = r3.f154829d
            boolean r4 = r3.f154830a
            if (r4 == 0) goto L_0x00a5
            boolean r3 = r3.f154831b
            if (r3 == 0) goto L_0x0097
            r3 = 2131828383(0x7f111e9f, float:1.9289705E38)
            java.lang.String r3 = r1.getString(r3)
            goto L_0x009e
        L_0x0097:
            r3 = 2131828386(0x7f111ea2, float:1.9289711E38)
            java.lang.String r3 = r1.getString(r3)
        L_0x009e:
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r3, (int) r7)
            r1.show()
        L_0x00a5:
            if (r4 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r1 = 0
            goto L_0x00ab
        L_0x00aa:
            r1 = 1
        L_0x00ab:
            if (r1 == 0) goto L_0x00af
            r6 = 2
            goto L_0x00c9
        L_0x00af:
            di3.d r1 = di3.C86312j.m106911c(r0)
            rc0.c r1 = (rc0.C63389c) r1
            boolean r1 = r1.mo88296eY()
            if (r1 == 0) goto L_0x00c9
            qc0.C101093a.m132485g()
            di3.d r0 = di3.C86312j.m106911c(r0)
            rc0.c r0 = (rc0.C63389c) r0
            r0.mo88293H4(r7)
            f166995b = r6
        L_0x00c9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.C58318a.mo83069a():int");
    }
}
