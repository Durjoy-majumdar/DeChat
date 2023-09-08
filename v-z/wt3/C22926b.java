package wt3;

/* renamed from: wt3.b */
public class C22926b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22927c f65901d;

    public C22926b(C22927c cVar) {
        this.f65901d = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            wt3.c r0 = r8.f65901d
            int r1 = r0.f65902a
            r2 = r1 & 1
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "Soter.SoterKeyGenerateEngine"
            if (r2 != r3) goto L_0x000e
            goto L_0x0029
        L_0x000e:
            r1 = r1 & r5
            if (r1 != r5) goto L_0x002f
            java.lang.String r0 = r0.f65903b
            boolean r0 = ot3.C117896h.m166297b(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "soter: not pass auth key name"
            ot3.C21881e.m25083b(r6, r1, r0)
            tt3.c r0 = new tt3.c
            java.lang.String r1 = "auth key name not specified"
            r0.<init>((int) r3, (java.lang.String) r1)
            goto L_0x0040
        L_0x0029:
            tt3.c r0 = new tt3.c
            r0.<init>(r4)
            goto L_0x0040
        L_0x002f:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "soter: not specified purpose"
            ot3.C21881e.m25083b(r6, r1, r0)
            tt3.c r0 = new tt3.c
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r2 = "not specified purpose. did you for get to call markGenAppSecureKey or/and markGenAuthKey?"
            r0.<init>((int) r1, (java.lang.String) r2)
        L_0x0040:
            boolean r1 = r0.mo34909a()
            if (r1 != 0) goto L_0x004c
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
            return
        L_0x004c:
            boolean r0 = lt3.C21460a.m24278l()
            if (r0 != 0) goto L_0x007e
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "soter: native not support soter"
            ot3.C21881e.m25087f(r6, r1, r0)
            wt3.c r0 = r8.f65901d
            java.lang.String r1 = ""
            boolean r2 = ot3.C117896h.m166297b(r1)
            if (r2 != 0) goto L_0x0066
            r2 = r1
            goto L_0x0068
        L_0x0066:
            java.lang.String r2 = "device not support soter"
        L_0x0068:
            boolean r4 = ot3.C117896h.m166297b(r1)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            wt3.a r2 = r0.f65906e
            if (r2 == 0) goto L_0x007b
            boolean r4 = r0.f65907f
            if (r4 != 0) goto L_0x007b
            r2.mo36099a(r5, r1)
        L_0x007b:
            r0.f65907f = r3
            return
        L_0x007e:
            wt3.c r0 = r8.f65901d
            int r0 = r0.f65902a
            r0 = r0 & r3
            java.lang.String r1 = "Soter.SoterCore"
            if (r0 != r3) goto L_0x00fd
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: require generate ask. start gen"
            ot3.C21881e.m25082a(r6, r2, r0)
            wt3.c r0 = r8.f65901d
            boolean r0 = r0.f65904c
            if (r0 == 0) goto L_0x00bf
            boolean r0 = lt3.C21460a.m24274h()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: request regen ask. remove former one"
            ot3.C21881e.m25082a(r6, r2, r0)
            ot3.g r0 = lt3.C21460a.m24283q()
            boolean r2 = r0.mo34909a()
            if (r2 != 0) goto L_0x00bf
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r0.f61887b
            r1[r4] = r2
            java.lang.String r2 = "soter: remove ask failed: %s"
            ot3.C21881e.m25087f(r6, r2, r1)
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
            return
        L_0x00bf:
            pt3.b r0 = lt3.C21460a.f60758c
            if (r0 != 0) goto L_0x00d1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: generateAppGlobalSecureKey IMPL is null, not support soter"
            ot3.C21881e.m25083b(r1, r2, r0)
            ot3.g r0 = new ot3.g
            r0.<init>(r5)
            goto L_0x00d5
        L_0x00d1:
            ot3.g r0 = r0.mo35097b()
        L_0x00d5:
            boolean r2 = r0.mo34909a()
            if (r2 != 0) goto L_0x00f0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r0.f61887b
            r1[r4] = r2
            java.lang.String r2 = "soter: generate ask failed: %s"
            ot3.C21881e.m25087f(r6, r2, r1)
            lt3.C21460a.m24283q()
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
            return
        L_0x00f0:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r7 = "soter: generate ask success!"
            ot3.C21881e.m25084c(r6, r7, r2)
            wt3.c r2 = r8.f65901d
            wt3.C22927c.m26937a(r2, r0)
        L_0x00fd:
            wt3.c r0 = r8.f65901d
            int r2 = r0.f65902a
            r2 = r2 & r5
            if (r2 != r5) goto L_0x01cb
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r0 = r0.f65903b
            r2[r4] = r0
            java.lang.String r0 = "soter: require generate auth key. start gen: %s"
            ot3.C21881e.m25082a(r6, r0, r2)
            boolean r0 = lt3.C21460a.m24276j()
            if (r0 != 0) goto L_0x0143
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "soter: no ask."
            ot3.C21881e.m25087f(r6, r1, r0)
            wt3.c r0 = r8.f65901d
            r1 = 3
            java.lang.String r2 = "ASK not exists when generate auth key"
            boolean r4 = ot3.C117896h.m166297b(r2)
            if (r4 != 0) goto L_0x012b
            r4 = r2
            goto L_0x012d
        L_0x012b:
            java.lang.String r4 = "errmsg not specified"
        L_0x012d:
            boolean r5 = ot3.C117896h.m166297b(r2)
            if (r5 != 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r2 = r4
        L_0x0135:
            wt3.a r4 = r0.f65906e
            if (r4 == 0) goto L_0x0140
            boolean r5 = r0.f65907f
            if (r5 != 0) goto L_0x0140
            r4.mo36099a(r1, r2)
        L_0x0140:
            r0.f65907f = r3
            return
        L_0x0143:
            wt3.c r0 = r8.f65901d
            boolean r2 = r0.f65905d
            if (r2 == 0) goto L_0x017f
            java.lang.String r0 = r0.f65903b
            boolean r0 = lt3.C21460a.m24275i(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: request regen auth key. remove former one"
            ot3.C21881e.m25082a(r6, r2, r0)
            wt3.c r0 = r8.f65901d
            java.lang.String r0 = r0.f65903b
            ot3.g r0 = lt3.C21460a.m24284r(r0, r4)
            boolean r2 = r0.mo34909a()
            if (r2 != 0) goto L_0x017f
            java.lang.Object[] r1 = new java.lang.Object[r5]
            wt3.c r2 = r8.f65901d
            java.lang.String r2 = r2.f65903b
            r1[r4] = r2
            java.lang.String r2 = r0.f61887b
            r1[r3] = r2
            java.lang.String r2 = "soter: remove auth key %s, failed: %s"
            ot3.C21881e.m25087f(r6, r2, r1)
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
            return
        L_0x017f:
            wt3.c r0 = r8.f65901d
            java.lang.String r0 = r0.f65903b
            pt3.b r2 = lt3.C21460a.f60758c
            if (r2 != 0) goto L_0x0195
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: generateAuthKey IMPL is null, not support soter"
            ot3.C21881e.m25083b(r1, r2, r0)
            ot3.g r0 = new ot3.g
            r0.<init>(r5)
            goto L_0x0199
        L_0x0195:
            ot3.g r0 = r2.mo35101c(r0)
        L_0x0199:
            boolean r1 = r0.mo34909a()
            if (r1 != 0) goto L_0x01be
            java.lang.Object[] r1 = new java.lang.Object[r5]
            wt3.c r2 = r8.f65901d
            java.lang.String r2 = r2.f65903b
            r1[r4] = r2
            java.lang.String r2 = r0.f61887b
            r1[r3] = r2
            java.lang.String r2 = "soter: generate auth key %s failed: %s"
            ot3.C21881e.m25087f(r6, r2, r1)
            wt3.c r1 = r8.f65901d
            java.lang.String r1 = r1.f65903b
            lt3.C21460a.m24284r(r1, r3)
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
            goto L_0x01cb
        L_0x01be:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "soter: generate auth key success!"
            ot3.C21881e.m25084c(r6, r2, r1)
            wt3.c r1 = r8.f65901d
            wt3.C22927c.m26937a(r1, r0)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wt3.C22926b.run():void");
    }
}
