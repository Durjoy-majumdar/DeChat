package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import ht1.C46114r3;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.j */
public final class C2469j implements C46114r3 {

    /* renamed from: a */
    public final FinderRedDotManager f12929a;

    /* renamed from: b */
    public String f12930b = "";

    /* renamed from: c */
    public final MMHandler f12931c;

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.j$a */
    public static final class C2470a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C2469j f12932d;

        public C2470a(C2469j jVar) {
            this.f12932d = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r12) {
            /*
                r11 = this;
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                java.lang.String r1 = "it"
                gy3.C87412m.m108594g(r12, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[Callback] What="
                r1.append(r2)
                int r2 = r12.what
                r1.append(r2)
                java.lang.String r2 = " Obj="
                r1.append(r2)
                java.lang.Object r2 = r12.obj
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "Finder.MsgRedDotHandler"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                int r1 = r12.what
                r3 = 1
                java.lang.String r4 = ""
                java.lang.String r5 = ", unReadAliasCount="
                r6 = 3
                r7 = 0
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
                r9 = 0
                r10 = 2
                switch(r1) {
                    case 1: goto L_0x0171;
                    case 2: goto L_0x015b;
                    case 3: goto L_0x010f;
                    case 4: goto L_0x00d9;
                    case 5: goto L_0x0039;
                    case 6: goto L_0x006a;
                    case 7: goto L_0x005b;
                    case 8: goto L_0x004c;
                    case 9: goto L_0x003b;
                    default: goto L_0x0039;
                }
            L_0x0039:
                goto L_0x01a5
            L_0x003b:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                com.tencent.mm.plugin.finder.extension.reddot.i r0 = new com.tencent.mm.plugin.finder.extension.reddot.i
                r0.<init>(r12)
                o40.C61926c.m72668M(r0)
                r12.f12930b = r4
                goto L_0x01a5
            L_0x004c:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                com.tencent.mm.plugin.finder.extension.reddot.h r0 = new com.tencent.mm.plugin.finder.extension.reddot.h
                r0.<init>(r12)
                o40.C61926c.m72668M(r0)
                goto L_0x01a5
            L_0x005b:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                com.tencent.mm.plugin.finder.extension.reddot.g r0 = new com.tencent.mm.plugin.finder.extension.reddot.g
                r0.<init>(r12)
                o40.C61926c.m72668M(r0)
                goto L_0x01a5
            L_0x006a:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                boolean r12 = com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.m2350d(r12)
                if (r12 == 0) goto L_0x01a5
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                di3.d r1 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
                up1.j r1 = r1.mo76776L4()
                int r1 = r1.mo73553qq(r3, r10, r4)
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                up1.j r0 = r0.mo76776L4()
                int r0 = r0.mo73553qq(r3, r6, r4)
                up1.f r4 = up1.C37521f.f99374d
                r4.getClass()
                pe1.c<java.lang.Integer> r4 = up1.C37521f.f99428j
                java.lang.Object r4 = r4.mo60266n()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                if (r4 != r3) goto L_0x00a7
                r9 = 1
            L_0x00a7:
                if (r9 == 0) goto L_0x00ac
                int r4 = r1 + r0
                goto L_0x00ad
            L_0x00ac:
                r4 = r1
            L_0x00ad:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "[updateWxMessageRedDot] unReadNormalCount="
                r6.append(r7)
                r6.append(r1)
                r6.append(r5)
                r6.append(r0)
                java.lang.String r0 = ", isEnablePass:"
                r6.append(r0)
                r6.append(r9)
                java.lang.String r0 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                com.tencent.mm.plugin.finder.extension.reddot.m r0 = new com.tencent.mm.plugin.finder.extension.reddot.m
                r0.<init>(r12, r4)
                o40.C61926c.m72668M(r0)
                goto L_0x01a5
            L_0x00d9:
                com.tencent.mm.plugin.finder.extension.reddot.j r1 = r11.f12932d
                boolean r1 = com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.m2350d(r1)
                if (r1 == 0) goto L_0x01a5
                com.tencent.mm.plugin.finder.extension.reddot.j r1 = r11.f12932d
                java.lang.Object r12 = r12.obj
                gy3.C87412m.m108592e(r12, r8)
                java.lang.String r12 = (java.lang.String) r12
                r1.getClass()
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                up1.j r0 = r0.mo76776L4()
                int r0 = r0.mo73553qq(r10, r10, r12)
                zc1.b r2 = zc1.C66785b.f191882e
                bd1.b r2 = zc1.C66783a.C66784a.m78800c(r2, r9, r3, r7)
                if (r2 == 0) goto L_0x0105
                int r9 = r2.field_systemMsgCount
            L_0x0105:
                com.tencent.mm.plugin.finder.extension.reddot.k r2 = new com.tencent.mm.plugin.finder.extension.reddot.k
                r2.<init>(r1, r12, r0, r9)
                o40.C61926c.m72668M(r2)
                goto L_0x01a5
            L_0x010f:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                boolean r12 = com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.m2350d(r12)
                if (r12 == 0) goto L_0x01a5
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                di3.d r1 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
                up1.j r1 = r1.mo76776L4()
                int r1 = r1.mo73553qq(r3, r10, r4)
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                up1.j r0 = r0.mo76776L4()
                int r0 = r0.mo73553qq(r3, r6, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "[addWxMessageRedDot] unReadNormalCount="
                r4.append(r6)
                r4.append(r1)
                r4.append(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                com.tencent.mm.plugin.finder.extension.reddot.e r2 = new com.tencent.mm.plugin.finder.extension.reddot.e
                r2.<init>(r1, r0, r12)
                o40.C61926c.m72668M(r2)
                goto L_0x01a5
            L_0x015b:
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                boolean r12 = com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.m2350d(r12)
                if (r12 == 0) goto L_0x01a5
                com.tencent.mm.plugin.finder.extension.reddot.j r12 = r11.f12932d
                r12.getClass()
                com.tencent.mm.plugin.finder.extension.reddot.c r0 = new com.tencent.mm.plugin.finder.extension.reddot.c
                r0.<init>(r12)
                o40.C61926c.m72668M(r0)
                goto L_0x01a5
            L_0x0171:
                com.tencent.mm.plugin.finder.extension.reddot.j r1 = r11.f12932d
                boolean r1 = com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.m2350d(r1)
                if (r1 == 0) goto L_0x01a5
                com.tencent.mm.plugin.finder.extension.reddot.j r1 = r11.f12932d
                java.lang.Object r12 = r12.obj
                gy3.C87412m.m108592e(r12, r8)
                java.lang.String r12 = (java.lang.String) r12
                r1.getClass()
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                up1.j r0 = r0.mo76776L4()
                int r0 = r0.mo73553qq(r10, r10, r12)
                zc1.b r2 = zc1.C66785b.f191882e
                bd1.b r2 = zc1.C66783a.C66784a.m78800c(r2, r9, r3, r7)
                if (r2 == 0) goto L_0x019d
                int r9 = r2.field_systemMsgCount
            L_0x019d:
                com.tencent.mm.plugin.finder.extension.reddot.d r2 = new com.tencent.mm.plugin.finder.extension.reddot.d
                r2.<init>(r0, r9, r12, r1)
                o40.C61926c.m72668M(r2)
            L_0x01a5:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.C2469j.C2470a.handleMessage(android.os.Message):boolean");
        }
    }

    public C2469j(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "manager");
        this.f12929a = finderRedDotManager;
        MMHandler mMHandler = new MMHandler("FinderMsgRedDotHandler", (MMHandler.Callback) new C2470a(this));
        mMHandler.setLogging(false);
        this.f12931c = mMHandler;
    }

    /* renamed from: c */
    public static final void m2349c(C2469j jVar, String str, C64586nn1 nn12, C51978xi1 xi12) {
        jVar.getClass();
        C37521f.f99374d.getClass();
        boolean z = false;
        boolean z2 = C37521f.f99422i3.mo60266n().intValue() > 0;
        if (C37521f.f99431j3.mo60266n().intValue() > 0) {
            z = true;
        }
        boolean z3 = z2 & z;
        C64586nn1 y = jVar.f12929a.mo77285y("Discovery", str);
        if (z3) {
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184502d = 2;
            nn13.f184503e = nn12.f184503e;
            nn13.f184506h = 2;
            nn13.f184507i = "FinderMentionEntrance";
            nn13.f184521z = str;
            xi12.f144672g.add(nn13);
        } else {
            C64586nn1 y2 = jVar.f12929a.mo77285y("FinderMentionEntrance", str);
            if (y2 != null && y2.f184502d == 2 && y2.f184503e > 0) {
                if (nn12.f184502d == 2) {
                    y2.f184506h = 2;
                    nn12.f184508j = "TLPersonalCenter";
                } else {
                    y2.f184506h = 1;
                }
                Log.m105924i("Finder.MsgRedDotHandler", "add FINDER_MENTION_ENTRANCE");
                xi12.f144672g.add(y2);
            }
        }
        if (y != null && y.f184502d == 2 && y.f184503e > 0) {
            xi12.f144672g.add(y);
        }
    }

    /* renamed from: d */
    public static final boolean m2350d(C2469j jVar) {
        jVar.getClass();
        C37521f.f99374d.getClass();
        return C37521f.f99376d2.mo60266n().intValue() > 0;
    }

    /* renamed from: a */
    public void mo2441a() {
        this.f12931c.removeMessages(8);
        this.f12931c.sendEmptyMessage(8);
    }

    /* renamed from: b */
    public void mo2442b() {
        this.f12931c.removeMessages(7);
        this.f12931c.sendEmptyMessage(7);
    }

    /* renamed from: e */
    public final void mo2443e(String str) {
        C87412m.m108594g(str, "finderUsername");
        this.f12931c.removeMessages(1);
        this.f12931c.obtainMessage(1, str).sendToTarget();
    }
}
