package t42;

/* renamed from: t42.d */
public final class C13827d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13829e f38961d;

    /* renamed from: e */
    public final /* synthetic */ String f38962e;

    /* renamed from: f */
    public final /* synthetic */ String f38963f;

    /* renamed from: t42.d$a */
    public static final class C13828a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f38964d;

        /* renamed from: e */
        public final /* synthetic */ String f38965e;

        /* renamed from: f */
        public final /* synthetic */ String f38966f;

        public C13828a(int i, String str, String str2) {
            this.f38964d = i;
            this.f38965e = str;
            this.f38966f = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x004d, code lost:
            if (r1 == null) goto L_0x004f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cpu profile successful! Path is already copied to clipboard, size is "
                r1.append(r2)
                int r2 = r4.f38964d
                r1.append(r2)
                java.lang.String r2 = ". Use \"adb pull\" to get profile file"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 1
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
                r0.show()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cpu profile path: "
                r0.append(r1)
                java.lang.String r1 = r4.f38965e
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                java.lang.String r1 = r4.f38966f
                if (r1 == 0) goto L_0x004f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "\n gpu profile path: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                if (r1 != 0) goto L_0x0051
            L_0x004f:
                java.lang.String r1 = ""
            L_0x0051:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t42.C13827d.C13828a.run():void");
        }
    }

    public C13827d(C13829e eVar, String str, String str2) {
        this.f38961d = eVar;
        this.f38962e = str;
        this.f38963f = str2;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CPU_"
            r0.append(r1)
            t42.e r1 = r13.f38961d
            f42.d r1 = r1.mo120841d()
            java.lang.String r1 = r1.f26666a
            r0.append(r1)
            r1 = 95
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = ".cpuprofile"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r13.f38962e
            java.lang.String r2 = "content"
            gy3.C87412m.m108593f(r1, r2)
            boolean r1 = q52.C89480u.m111872a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r1.booleanValue()
            r3 = 0
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            java.lang.String r2 = "MicroMsg.JsApiStopCpuProfile"
            if (r1 == 0) goto L_0x00fe
            java.lang.String r4 = r13.f38962e
            java.lang.String r5 = r13.f38963f
            t42.e r6 = r13.f38961d
            r1.booleanValue()
            int r1 = r4.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = a70.C112760b.m154195C()
            r4.append(r7)
            java.lang.String r7 = "appbrand/trace/"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "hy: dump successful with "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = " bytes!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            java.lang.String r8 = "gpuFileToken"
            gy3.C87412m.m108593f(r5, r8)
            int r8 = r5.length()
            r9 = 0
            if (r8 <= 0) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            if (r8 == 0) goto L_0x00a3
            r8 = r5
            goto L_0x00a4
        L_0x00a3:
            r8 = r3
        L_0x00a4:
            if (r8 == 0) goto L_0x00e5
            java.lang.Iterable r4 = com.tencent.p014mm.vfs.C86013q1.m106459t(r4, r9)
            if (r4 == 0) goto L_0x00e0
            java.util.Iterator r4 = r4.iterator()
        L_0x00b0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00dc
            java.lang.Object r8 = r4.next()
            r10 = r8
            com.tencent.mm.vfs.b0 r10 = (com.tencent.p014mm.vfs.C86001b0) r10
            java.lang.String r10 = r10.f250472b
            java.lang.String r11 = "fileEntry.name"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "gpu-"
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            boolean r10 = z04.C112551y.m153819s(r10, r11, r9)
            if (r10 == 0) goto L_0x00b0
            goto L_0x00dd
        L_0x00dc:
            r8 = r3
        L_0x00dd:
            com.tencent.mm.vfs.b0 r8 = (com.tencent.p014mm.vfs.C86001b0) r8
            goto L_0x00e1
        L_0x00e0:
            r8 = r3
        L_0x00e1:
            if (r8 == 0) goto L_0x00e5
            java.lang.String r3 = r8.f250471a
        L_0x00e5:
            zt3.t r4 = zt3.C119157j.f356862d
            t42.d$a r5 = new t42.d$a
            r5.<init>(r1, r7, r3)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183895z(r5)
            fy3.l r1 = r6.mo120840p()
            e42.h r3 = r6.mo120844i()
            r1.invoke(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x00fe:
            if (r3 != 0) goto L_0x0128
            t42.e r1 = r13.f38961d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "hy: cpu profile "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " generate failed"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            fy3.l r0 = r1.mo120840p()
            e42.g r2 = e42.C31415g.C7595b.f25864c
            e42.h r1 = r1.mo120843h(r2)
            r0.invoke(r1)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t42.C13827d.run():void");
    }
}
