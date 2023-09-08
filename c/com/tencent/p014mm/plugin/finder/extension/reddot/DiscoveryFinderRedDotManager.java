package com.tencent.p014mm.plugin.finder.extension.reddot;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C57847r2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MainTabUnreadMgr;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C76244c4;
import o40.C61926c;
import p787ai.C79547b;
import te3.C64586nn1;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager */
public final class DiscoveryFinderRedDotManager implements C76244c4 {

    /* renamed from: a */
    public C76244c4.C60156a f158509a;

    /* renamed from: b */
    public int f158510b = -1;

    /* renamed from: c */
    public C2479n0.C2480a f158511c;

    /* renamed from: d */
    public final C0120a0<C2479n0.C2480a> f158512d = new C55694b(this);

    /* renamed from: e */
    public final C0120a0<C2479n0.C2480a> f158513e = new C55693a(this);

    /* renamed from: f */
    public final DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1 f158514f = new DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1(C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$a */
    public static final class C55693a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ DiscoveryFinderRedDotManager f158515d;

        public C55693a(DiscoveryFinderRedDotManager discoveryFinderRedDotManager) {
            this.f158515d = discoveryFinderRedDotManager;
        }

        public void onChanged(Object obj) {
            C55718s0 s0Var;
            C55718s0 s0Var2;
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            boolean z = false;
            if (aVar != null && aVar.f12908a) {
                this.f158515d.getClass();
                C55718s0 G5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77227G5("Discovery");
                String str = null;
                String str2 = (aVar == null || (s0Var2 = aVar.f12910c) == null) ? null : s0Var2.field_tipsId;
                if (!(str2 == null || str2.length() == 0)) {
                    String str3 = G5 != null ? G5.field_tipsId : null;
                    if (!(str3 == null || str3.length() == 0)) {
                        String str4 = G5 != null ? G5.field_tipsId : null;
                        if (!(aVar == null || (s0Var = aVar.f12910c) == null)) {
                            str = s0Var.field_tipsId;
                        }
                        if (!C87412m.m108589b(str4, str)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    Log.m105928w("DiscoveryFinderRedDotMgr", "checkDiscoveryRedDotInValid false");
                    C76244c4.C60156a aVar2 = this.f158515d.f158509a;
                    if (aVar2 != null) {
                        MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
                        mainTabUnreadMgr.getClass();
                        C79547b.f233255g.mo109607a(new C57847r2(mainTabUnreadMgr));
                    }
                    C76244c4.C60156a aVar3 = this.f158515d.f158509a;
                    if (aVar3 != null) {
                        ((MainTabUnreadMgr.C57632b) aVar3).mo81977a("");
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$b */
    public static final class C55694b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ DiscoveryFinderRedDotManager f158516d;

        public C55694b(DiscoveryFinderRedDotManager discoveryFinderRedDotManager) {
            this.f158516d = discoveryFinderRedDotManager;
        }

        /* JADX WARNING: Removed duplicated region for block: B:155:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x02a0  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x02a3  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02a8  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x030e  */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x0354  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r29) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                com.tencent.mm.plugin.finder.extension.reddot.n0$a r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r1
                java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r3 = r0.f158516d
                r3.getClass()
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                r5 = 1
                java.lang.String r8 = "FinderMentionEntrance"
                java.lang.String r9 = "Discovery"
                java.lang.String r10 = "DiscoveryFinderRedDotMgr"
                if (r1 != 0) goto L_0x001b
                r1 = 0
                goto L_0x00c4
            L_0x001b:
                zc1.b r11 = zc1.C66785b.f191882e
                java.lang.String r11 = r11.mo90662O5()
                java.lang.String r12 = r1.f12912e
                boolean r12 = gy3.C87412m.m108589b(r12, r8)
                if (r12 == 0) goto L_0x0062
                boolean r3 = r1.f12908a
                if (r3 != 0) goto L_0x00bf
                di3.d r3 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
                com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r3.mo77227G5(r9)
                if (r3 == 0) goto L_0x0042
                te3.nn1 r4 = r3.mo77308o2(r9)
                goto L_0x0043
            L_0x0042:
                r4 = 0
            L_0x0043:
                com.tencent.mm.plugin.finder.extension.reddot.n0$a r12 = new com.tencent.mm.plugin.finder.extension.reddot.n0$a
                if (r3 == 0) goto L_0x0049
                r13 = 1
                goto L_0x004a
            L_0x0049:
                r13 = 0
            L_0x004a:
                r12.<init>(r13, r4, r3, r11)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[transformRedDotResult] >>> 1 newResult="
                r3.append(r4)
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
                goto L_0x00c0
            L_0x0062:
                java.lang.String r12 = r1.f12912e
                boolean r12 = gy3.C87412m.m108589b(r12, r9)
                if (r12 == 0) goto L_0x00bf
                di3.d r4 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r4 = r4.Nt0()
                com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r4.mo77227G5(r8)
                if (r4 == 0) goto L_0x00bf
                te3.nn1 r12 = r4.mo77308o2(r8)
                com.tencent.mm.plugin.finder.extension.reddot.n0$a r13 = new com.tencent.mm.plugin.finder.extension.reddot.n0$a
                r13.<init>(r5, r12, r4, r11)
                com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r1.f12910c
                if (r4 == 0) goto L_0x008e
                te3.yi1 r4 = r4.f158585F
                if (r4 == 0) goto L_0x008e
                int r4 = r4.f186544F
                goto L_0x008f
            L_0x008e:
                r4 = 0
            L_0x008f:
                r4 = r4 & r5
                if (r4 == 0) goto L_0x0094
                r4 = 1
                goto L_0x0095
            L_0x0094:
                r4 = 0
            L_0x0095:
                boolean r11 = r3.mo77218j(r13)
                if (r11 != 0) goto L_0x00bf
                ht1.c4$a r3 = r3.f158509a
                if (r3 == 0) goto L_0x00a4
                int r3 = com.tencent.p014mm.p136ui.C19802n4.m21509b()
                goto L_0x00a5
            L_0x00a4:
                r3 = 0
            L_0x00a5:
                if (r3 <= 0) goto L_0x00bf
                if (r4 != 0) goto L_0x00bf
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[transformRedDotResult] >>> 2 newResult="
                r3.append(r4)
                r3.append(r13)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
                r12 = r13
                goto L_0x00c0
            L_0x00bf:
                r12 = 0
            L_0x00c0:
                if (r12 != 0) goto L_0x00c3
                goto L_0x00c4
            L_0x00c3:
                r1 = r12
            L_0x00c4:
                if (r1 == 0) goto L_0x00c9
                boolean r3 = r1.f12908a
                goto L_0x00ca
            L_0x00c9:
                r3 = 0
            L_0x00ca:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r4 = r0.f158516d
                int r11 = r4.f158510b
                r12 = 2
                if (r11 != r12) goto L_0x00d3
                r11 = 1
                goto L_0x00d4
            L_0x00d3:
                r11 = 0
            L_0x00d4:
                if (r1 == 0) goto L_0x00d9
                te3.nn1 r13 = r1.f12909b
                goto L_0x00da
            L_0x00d9:
                r13 = 0
            L_0x00da:
                if (r13 == 0) goto L_0x00e2
                int r13 = r13.f184506h
                if (r13 != r12) goto L_0x00e2
                r13 = 1
                goto L_0x00e3
            L_0x00e2:
                r13 = 0
            L_0x00e3:
                if (r1 == 0) goto L_0x00ec
                com.tencent.mm.plugin.finder.extension.reddot.s0 r14 = r1.f12910c
                if (r14 == 0) goto L_0x00ec
                java.lang.String r14 = r14.field_tipsId
                goto L_0x00ed
            L_0x00ec:
                r14 = 0
            L_0x00ed:
                java.lang.String r15 = "null"
                if (r14 != 0) goto L_0x00f2
                r14 = r15
            L_0x00f2:
                if (r1 == 0) goto L_0x00fb
                te3.nn1 r6 = r1.f12909b
                if (r6 == 0) goto L_0x00fb
                int r6 = r6.f184502d
                goto L_0x00fc
            L_0x00fb:
                r6 = 0
            L_0x00fc:
                ht1.c4$a r4 = r4.f158509a
                if (r4 == 0) goto L_0x0110
                com.tencent.mm.ui.MainTabUnreadMgr$b r4 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r4
                com.tencent.mm.ui.MainTabUnreadMgr r4 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                com.tencent.mm.ui.q r4 = r4.f214453g
                if (r4 == 0) goto L_0x0110
                int r4 = r4.getFriendTabUnread()
                if (r4 > 0) goto L_0x0110
                r4 = 1
                goto L_0x0111
            L_0x0110:
                r4 = 0
            L_0x0111:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r12 = r0.f158516d
                ht1.c4$a r12 = r12.f158509a
                if (r12 == 0) goto L_0x0122
                r7 = r12
                com.tencent.mm.ui.MainTabUnreadMgr$b r7 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r7
                com.tencent.mm.ui.MainTabUnreadMgr r7 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                com.tencent.mm.ui.q r7 = r7.f214453g
                if (r7 == 0) goto L_0x0122
                r7 = 1
                goto L_0x0123
            L_0x0122:
                r7 = 0
            L_0x0123:
                java.lang.String r5 = ""
                r16 = r15
                if (r1 == 0) goto L_0x013d
                te3.nn1 r15 = r1.f12909b
                if (r15 == 0) goto L_0x013d
                te3.s7 r15 = r15.f184519x
                if (r15 == 0) goto L_0x013d
                te3.f00 r15 = r15.f185355d
                if (r15 == 0) goto L_0x013d
                te3.wc4 r15 = r15.f183066e
                if (r15 == 0) goto L_0x013d
                java.lang.String r15 = r15.f186073d
                if (r15 != 0) goto L_0x013e
            L_0x013d:
                r15 = r5
            L_0x013e:
                if (r12 == 0) goto L_0x0145
                int r12 = com.tencent.p014mm.p136ui.C19802n4.m21509b()
                goto L_0x0146
            L_0x0145:
                r12 = 0
            L_0x0146:
                r17 = r4
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r4 = r0.f158516d
                r4.getClass()
                r18 = r7
                java.lang.String r7 = "NearbyEntrance"
                r19 = r5
                java.lang.String r5 = "FinderLiveEntrance"
                java.lang.String r0 = "FinderEntrance"
                if (r1 == 0) goto L_0x0238
                r20 = r13
                com.tencent.mm.plugin.finder.extension.reddot.s0 r13 = r1.f12910c
                java.lang.Class<ky2.i> r21 = ky2.C10432i.class
                di3.d r21 = di3.C86312j.m106911c(r21)
                ky2.i r21 = (ky2.C10432i) r21
                boolean r21 = r21.mo10750e()
                if (r13 == 0) goto L_0x0232
                di3.d r22 = di3.C86312j.m106911c(r2)
                ht1.t1 r22 = (ht1.C60200t1) r22
                r23 = r12
                ht1.b4 r12 = r22.Nt0()
                boolean r22 = r13.mo77306m2(r0)
                r24 = 0
                if (r22 == 0) goto L_0x01bc
                long r4 = eb0.C75592q0.m90781k()
                r7 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 & r7
                int r7 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
                if (r7 != 0) goto L_0x01af
                boolean r4 = r12.mo77253Y5()
                if (r4 == 0) goto L_0x01af
                di3.d r4 = di3.C86312j.m106911c(r2)
                ht1.t1 r4 = (ht1.C60200t1) r4
                boolean r4 = r4.mo76873sF()
                if (r4 == 0) goto L_0x01af
                java.lang.Class<ht1.v4> r4 = ht1.C8808v4.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ht1.v4 r4 = (ht1.C8808v4) r4
                boolean r4 = r4.Sn0()
                if (r4 != 0) goto L_0x01af
                r4 = 1
                goto L_0x01b0
            L_0x01af:
                r4 = 0
            L_0x01b0:
                if (r4 != 0) goto L_0x01b8
                r12.mo77239M5(r0)
                r12.mo77239M5(r9)
            L_0x01b8:
                r8 = r0
                r0 = r4
                goto L_0x023f
            L_0x01bc:
                boolean r0 = r13.mo77306m2(r5)
                if (r0 == 0) goto L_0x01eb
                long r7 = eb0.C75592q0.m90781k()
                r26 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
                long r7 = r7 & r26
                int r0 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
                if (r0 != 0) goto L_0x01e0
                boolean r0 = r12.mo77235K5()
                if (r0 == 0) goto L_0x01e0
                vc1.b r0 = vc1.C37715b.f99914a
                boolean r0 = r0.mo61298a()
                if (r0 == 0) goto L_0x01e0
                if (r21 != 0) goto L_0x01e0
                r0 = 1
                goto L_0x01e1
            L_0x01e0:
                r0 = 0
            L_0x01e1:
                if (r0 != 0) goto L_0x01e9
                r12.mo77239M5(r5)
                r12.mo77239M5(r9)
            L_0x01e9:
                r8 = r5
                goto L_0x023f
            L_0x01eb:
                boolean r0 = r13.mo77306m2(r7)
                if (r0 == 0) goto L_0x0225
                long r4 = eb0.C75592q0.m90781k()
                r26 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
                long r4 = r4 & r26
                int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
                if (r0 != 0) goto L_0x021a
                boolean r0 = r12.mo77229H5()
                if (r0 == 0) goto L_0x021a
                di3.d r0 = di3.C86312j.m106911c(r2)
                ht1.t1 r0 = (ht1.C60200t1) r0
                ht1.z4 r0 = r0.mo76861l7()
                boolean r0 = r0.mo83760G5()
                if (r0 == 0) goto L_0x021a
                if (r21 != 0) goto L_0x021a
                r0 = 1
                goto L_0x021b
            L_0x021a:
                r0 = 0
            L_0x021b:
                if (r0 != 0) goto L_0x0223
                r12.mo77239M5(r7)
                r12.mo77239M5(r9)
            L_0x0223:
                r8 = r7
                goto L_0x023f
            L_0x0225:
                boolean r0 = r13.mo77306m2(r8)
                if (r0 == 0) goto L_0x023c
                boolean r0 = r4.mo77218j(r1)
                r4 = 1
                r0 = r0 ^ r4
                goto L_0x023f
            L_0x0232:
                r23 = r12
                r8 = r19
                r0 = 1
                goto L_0x023f
            L_0x0238:
                r23 = r12
                r20 = r13
            L_0x023c:
                r8 = r19
                r0 = 0
            L_0x023f:
                up1.f r4 = up1.C37521f.f99374d
                r4.getClass()
                pe1.c<java.lang.Integer> r4 = up1.C37521f.f99293T5
                java.lang.Object r4 = r4.mo60266n()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                r5 = 1
                if (r4 != r5) goto L_0x0255
                r4 = 1
                goto L_0x0256
            L_0x0255:
                r4 = 0
            L_0x0256:
                if (r4 == 0) goto L_0x025d
                if (r0 != 0) goto L_0x025b
                goto L_0x025d
            L_0x025b:
                r5 = 0
                goto L_0x025e
            L_0x025d:
                r5 = 1
            L_0x025e:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "[isDisableRedDot] ret="
                r7.append(r12)
                r7.append(r5)
                java.lang.String r12 = " fromPath="
                r7.append(r12)
                r7.append(r8)
                java.lang.String r8 = " isXLabEnable="
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = " isEntranceOpen="
                r7.append(r4)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                if (r1 == 0) goto L_0x0294
                te3.nn1 r0 = r1.f12909b
                if (r0 == 0) goto L_0x0294
                java.lang.String r0 = r0.f184507i
                if (r0 != 0) goto L_0x0296
            L_0x0294:
                r0 = r16
            L_0x0296:
                if (r1 == 0) goto L_0x02a3
                com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r1.f12910c
                if (r4 == 0) goto L_0x02a3
                te3.yi1 r4 = r4.f158585F
                if (r4 == 0) goto L_0x02a3
                int r4 = r4.f186544F
                goto L_0x02a4
            L_0x02a3:
                r4 = 0
            L_0x02a4:
                r7 = 1
                r4 = r4 & r7
                if (r4 == 0) goto L_0x02aa
                r4 = 1
                goto L_0x02ab
            L_0x02aa:
                r4 = 0
            L_0x02ab:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "[redDotObserver] receive tipsId="
                r7.append(r8)
                r7.append(r14)
                java.lang.String r8 = " path="
                r7.append(r8)
                r7.append(r0)
                java.lang.String r0 = " showType="
                r7.append(r0)
                r7.append(r6)
                java.lang.String r8 = " isShow="
                r7.append(r8)
                r7.append(r3)
                java.lang.String r8 = " subTitle="
                r7.append(r8)
                r7.append(r15)
                java.lang.String r8 = " isInFindTab="
                r7.append(r8)
                r7.append(r11)
                java.lang.String r8 = " findTabRedCount="
                r7.append(r8)
                r12 = r23
                r7.append(r12)
                java.lang.String r8 = " isDependent="
                r7.append(r8)
                r8 = r20
                r7.append(r8)
                java.lang.String r13 = " isDisableRedDot="
                r7.append(r13)
                r7.append(r5)
                java.lang.String r13 = " isChunWanRedDot="
                r7.append(r13)
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
                r4 = 4
                if (r5 == 0) goto L_0x0354
                r5 = r28
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                if (r1 == 0) goto L_0x0317
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x0318
            L_0x0317:
                r2 = 0
            L_0x0318:
                if (r1 == 0) goto L_0x031d
                te3.nn1 r1 = r1.f12909b
                goto L_0x031e
            L_0x031d:
                r1 = 0
            L_0x031e:
                r0.mo77219k(r4, r2, r1)
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r1 = 0
                r0.f158511c = r1
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x033b
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.q2 r2 = new com.tencent.mm.ui.q2
                r2.<init>(r0)
                r1.mo109607a(r2)
            L_0x033b:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.r2 r2 = new com.tencent.mm.ui.r2
                r2.<init>(r0)
                r1.mo109607a(r2)
                goto L_0x0516
            L_0x0354:
                r5 = r28
                if (r3 == 0) goto L_0x0481
                if (r11 == 0) goto L_0x035c
                if (r8 == 0) goto L_0x0481
            L_0x035c:
                r0 = 1
                if (r6 == r0) goto L_0x043a
                r0 = 2
                if (r6 == r0) goto L_0x0409
                r0 = 26
                if (r6 == r0) goto L_0x03d8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[redDotObserver] tipsId="
                r0.append(r2)
                r0.append(r14)
                java.lang.String r2 = " showType("
                r0.append(r2)
                r0.append(r6)
                java.lang.String r2 = ") error!"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r2 = 0
                r0.f158511c = r2
                if (r1 == 0) goto L_0x0391
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x0392
            L_0x0391:
                r2 = 0
            L_0x0392:
                if (r1 == 0) goto L_0x0397
                te3.nn1 r7 = r1.f12909b
                goto L_0x0398
            L_0x0397:
                r7 = 0
            L_0x0398:
                r0.mo77219k(r4, r2, r7)
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x03b2
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.q2 r2 = new com.tencent.mm.ui.q2
                r2.<init>(r0)
                r1.mo109607a(r2)
            L_0x03b2:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x03c9
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.r2 r2 = new com.tencent.mm.ui.r2
                r2.<init>(r0)
                r1.mo109607a(r2)
            L_0x03c9:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                r7 = r19
                r0.mo81977a(r7)
                goto L_0x0516
            L_0x03d8:
                r7 = r19
                if (r18 == 0) goto L_0x03eb
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r0.f158511c = r1
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                r0.mo81977a(r15)
                goto L_0x0516
            L_0x03eb:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x03f6
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                r0.mo81977a(r7)
            L_0x03f6:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                if (r1 == 0) goto L_0x03fd
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x03fe
            L_0x03fd:
                r2 = 0
            L_0x03fe:
                if (r1 == 0) goto L_0x0403
                te3.nn1 r7 = r1.f12909b
                goto L_0x0404
            L_0x0403:
                r7 = 0
            L_0x0404:
                r0.mo77219k(r4, r2, r7)
                goto L_0x0516
            L_0x0409:
                if (r12 <= 0) goto L_0x0410
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r0.f158511c = r1
                goto L_0x0421
            L_0x0410:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                if (r1 == 0) goto L_0x0417
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x0418
            L_0x0417:
                r2 = 0
            L_0x0418:
                if (r1 == 0) goto L_0x041d
                te3.nn1 r7 = r1.f12909b
                goto L_0x041e
            L_0x041d:
                r7 = 0
            L_0x041e:
                r0.mo77219k(r4, r2, r7)
            L_0x0421:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.q2 r2 = new com.tencent.mm.ui.q2
                r2.<init>(r0)
                r1.mo109607a(r2)
                goto L_0x0516
            L_0x043a:
                if (r17 == 0) goto L_0x0457
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r0.f158511c = r1
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.r2 r2 = new com.tencent.mm.ui.r2
                r2.<init>(r0)
                r1.mo109607a(r2)
                goto L_0x0516
            L_0x0457:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x046e
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r2 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.r2 r3 = new com.tencent.mm.ui.r2
                r3.<init>(r0)
                r2.mo109607a(r3)
            L_0x046e:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                if (r1 == 0) goto L_0x0475
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x0476
            L_0x0475:
                r2 = 0
            L_0x0476:
                if (r1 == 0) goto L_0x047b
                te3.nn1 r7 = r1.f12909b
                goto L_0x047c
            L_0x047b:
                r7 = 0
            L_0x047c:
                r0.mo77219k(r4, r2, r7)
                goto L_0x0516
            L_0x0481:
                r7 = r19
                if (r3 == 0) goto L_0x04b4
                if (r11 == 0) goto L_0x04b4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "[redDotObserver] dispose discovery red dot at find tab. tipsId="
                r1.append(r3)
                r1.append(r14)
                r1.append(r0)
                r1.append(r6)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r0.getClass()
                di3.d r0 = di3.C86312j.m106911c(r2)
                ht1.t1 r0 = (ht1.C60200t1) r0
                ht1.b4 r0 = r0.Nt0()
                r0.mo77239M5(r9)
                goto L_0x04da
            L_0x04b4:
                if (r3 != 0) goto L_0x04c9
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r2 = 3
                if (r1 == 0) goto L_0x04be
                com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r1.f12910c
                goto L_0x04bf
            L_0x04be:
                r3 = 0
            L_0x04bf:
                if (r1 == 0) goto L_0x04c4
                te3.nn1 r1 = r1.f12909b
                goto L_0x04c5
            L_0x04c4:
                r1 = 0
            L_0x04c5:
                r0.mo77219k(r2, r3, r1)
                goto L_0x04da
            L_0x04c9:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                if (r1 == 0) goto L_0x04d0
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
                goto L_0x04d1
            L_0x04d0:
                r2 = 0
            L_0x04d1:
                if (r1 == 0) goto L_0x04d6
                te3.nn1 r1 = r1.f12909b
                goto L_0x04d7
            L_0x04d6:
                r1 = 0
            L_0x04d7:
                r0.mo77219k(r4, r2, r1)
            L_0x04da:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                r1 = 0
                r0.f158511c = r1
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x04f4
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.q2 r2 = new com.tencent.mm.ui.q2
                r2.<init>(r0)
                r1.mo109607a(r2)
            L_0x04f4:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x050b
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                com.tencent.mm.ui.MainTabUnreadMgr r0 = com.tencent.p014mm.p136ui.MainTabUnreadMgr.this
                r0.getClass()
                ai.b r1 = p787ai.C79547b.f233255g
                com.tencent.mm.ui.r2 r2 = new com.tencent.mm.ui.r2
                r2.<init>(r0)
                r1.mo109607a(r2)
            L_0x050b:
                com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager r0 = r5.f158516d
                ht1.c4$a r0 = r0.f158509a
                if (r0 == 0) goto L_0x0516
                com.tencent.mm.ui.MainTabUnreadMgr$b r0 = (com.tencent.p014mm.p136ui.MainTabUnreadMgr.C57632b) r0
                r0.mo81977a(r7)
            L_0x0516:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager.C55694b.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$c */
    public static final class C55695c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ DiscoveryFinderRedDotManager f158517a;

        public C55695c(DiscoveryFinderRedDotManager discoveryFinderRedDotManager) {
            this.f158517a = discoveryFinderRedDotManager;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            DiscoveryFinderRedDotManager discoveryFinderRedDotManager;
            C2479n0.C2480a aVar;
            C87412m.m108594g(view, "view");
            if (z && (aVar = discoveryFinderRedDotManager.f158511c) != null) {
                C64586nn1 nn12 = null;
                C55718s0 s0Var = aVar != null ? aVar.f12910c : null;
                if (aVar != null) {
                    nn12 = aVar.f12909b;
                }
                (discoveryFinderRedDotManager = this.f158517a).mo77219k(1, s0Var, nn12);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$d */
    public static final class C55696d extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ DiscoveryFinderRedDotManager f158518a;

        public C55696d(DiscoveryFinderRedDotManager discoveryFinderRedDotManager) {
            this.f158518a = discoveryFinderRedDotManager;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            DiscoveryFinderRedDotManager discoveryFinderRedDotManager;
            C2479n0.C2480a aVar;
            C87412m.m108594g(view, "view");
            if (z && (aVar = discoveryFinderRedDotManager.f158511c) != null) {
                C64586nn1 nn12 = null;
                C55718s0 s0Var = aVar != null ? aVar.f12910c : null;
                if (aVar != null) {
                    nn12 = aVar.f12909b;
                }
                (discoveryFinderRedDotManager = this.f158518a).mo77219k(1, s0Var, nn12);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r0 = (r0 = (r0 = (r0 = r0.f12909b).f184519x).f185355d).f183066e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo77209a() {
        /*
            r1 = this;
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r0 = r1.f158511c
            if (r0 == 0) goto L_0x0017
            te3.nn1 r0 = r0.f12909b
            if (r0 == 0) goto L_0x0017
            te3.s7 r0 = r0.f184519x
            if (r0 == 0) goto L_0x0017
            te3.f00 r0 = r0.f185355d
            if (r0 == 0) goto L_0x0017
            te3.wc4 r0 = r0.f183066e
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.f186073d
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = ""
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager.mo77209a():java.lang.String");
    }

    /* renamed from: b */
    public void mo77210b(C76244c4.C60156a aVar) {
        this.f158509a = aVar;
    }

    /* renamed from: c */
    public void mo77211c(TextView textView) {
        if (textView != null) {
            C23564m.m28138h(textView, new C55696d(this));
        }
    }

    /* renamed from: d */
    public void mo77212d(int i) {
        this.f158510b = i;
    }

    /* renamed from: e */
    public boolean mo77213e() {
        C64586nn1 nn12;
        C2479n0.C2480a aVar = this.f158511c;
        if (aVar != null && aVar.f12908a) {
            if ((aVar == null || (nn12 = aVar.f12909b) == null || nn12.f184502d != 1) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo77214f(ImageView imageView) {
        if (imageView != null) {
            C23564m.m28138h(imageView, new C55695c(this));
        }
    }

    /* renamed from: g */
    public void mo77215g() {
        C2479n0.C2480a aVar = this.f158511c;
        if (aVar != null) {
            mo77219k(2, aVar.f12910c, aVar.f12909b);
        }
    }

    /* renamed from: h */
    public void mo77216h(MMFragmentActivity mMFragmentActivity) {
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("DiscoveryFinderRedDotMgr", "registerDiscoveryObserver...");
        C2479n0 n0Var = C2479n0.f12955a;
        C61926c.m72695t(C2479n0.f12956b, mMFragmentActivity, this.f158512d);
        C61926c.m72695t(C2479n0.f12957c, mMFragmentActivity, this.f158513e);
        C61926c.m72695t(C2479n0.f12951H, mMFragmentActivity, this.f158512d);
    }

    /* renamed from: i */
    public boolean mo77217i() {
        C64586nn1 nn12;
        C2479n0.C2480a aVar = this.f158511c;
        if (aVar != null && aVar.f12908a) {
            if ((aVar == null || (nn12 = aVar.f12909b) == null || nn12.f184502d != 26) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo77218j(C2458a aVar) {
        if (C87412m.m108589b(aVar != null ? aVar.f12912e : null, "FinderMentionEntrance")) {
            C64586nn1 nn12 = aVar.f12909b;
            return (nn12 != null && nn12.f184502d == 2) && !C58739j4.f168176a.mo83682K();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r0.equals("Discovery") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r0.equals("FinderMentionEntrance") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r0.equals("FinderEntrance") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r0 = 1;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77219k(int r10, com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r11, te3.C64586nn1 r12) {
        /*
            r9 = this;
            if (r12 == 0) goto L_0x0099
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[reportDiscoveryTabRedDot] action="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " tipsId="
            r0.append(r1)
            if (r11 == 0) goto L_0x0019
            java.lang.String r1 = r11.field_tipsId
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r0.append(r1)
            java.lang.String r1 = " path="
            r0.append(r1)
            java.lang.String r1 = r12.f184507i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DiscoveryFinderRedDotMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = r12.f184507i
            r1 = 0
            if (r0 == 0) goto L_0x007a
            int r2 = r0.hashCode()
            switch(r2) {
                case -58348260: goto L_0x006f;
                case 691368744: goto L_0x005a;
                case 935133594: goto L_0x0051;
                case 1122432629: goto L_0x0046;
                case 1882760592: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            java.lang.String r2 = "Discovery"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0046:
            java.lang.String r2 = "NearbyEntrance"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004f
            goto L_0x007a
        L_0x004f:
            r0 = 3
            goto L_0x007b
        L_0x0051:
            java.lang.String r2 = "FinderMentionEntrance"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0078
            goto L_0x007a
        L_0x005a:
            java.lang.String r2 = "FinderLiveEntrance"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            vc1.b r0 = vc1.C37715b.f99914a
            boolean r0 = r0.mo61299b()
            if (r0 == 0) goto L_0x006d
            r0 = 5
            goto L_0x007b
        L_0x006d:
            r0 = 2
            goto L_0x007b
        L_0x006f:
            java.lang.String r2 = "FinderEntrance"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            long r4 = (long) r0
            dp1.v0 r2 = dp1.C58413v0.f167346a
            org.json.JSONObject r0 = r2.mo83269c()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "detailJson.toString()"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r3 = ","
            java.lang.String r6 = ";"
            java.lang.String r8 = z04.C112551y.m153814n(r0, r3, r6, r1)
            r3 = r10
            r6 = r11
            r7 = r12
            r2.mo83273n(r3, r4, r6, r7, r8)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager.mo77219k(int, com.tencent.mm.plugin.finder.extension.reddot.s0, te3.nn1):void");
    }

    public void onPause() {
        this.f158514f.dead();
    }

    public void onResume() {
        this.f158514f.alive();
        C2479n0.m2355c(C2479n0.f12955a, "Discovery", (String) null, 2, (Object) null);
    }
}
