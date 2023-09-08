package com.tencent.p014mm.plugin.finder.extension.reddot;

import androidx.lifecycle.C39622i0;
import bd1.C54446b;
import bl3.C39818r;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSettingCheckStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.rtmp.TXLiveConstants;
import di3.C86312j;
import do1.C58341h;
import dp1.C58413v0;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58961d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hf1.C59872b;
import hf1.C59877e;
import ht1.C20998d4;
import ht1.C46114r3;
import ht1.C60152b4;
import ht1.C8808v4;
import if1.C60276a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import je1.C46534r2;
import o40.C61926c;
import os1.C11739f;
import p274xx.C66446g;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C77813z;
import te3.C48883bn1;
import te3.C48978cb0;
import te3.C49119db0;
import te3.C49170dn1;
import te3.C49448fn1;
import te3.C49712hj1;
import te3.C50137kj1;
import te3.C50160kp1;
import te3.C50272lj1;
import te3.C50411mj1;
import te3.C50553nj1;
import te3.C50705on1;
import te3.C51837wi1;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64858yi1;
import te3.C64867yw;
import tf0.C64916p1;
import up1.C37521f;
import ux3.C65485a;
import z04.C112550d0;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager */
public final class FinderRedDotManager implements C60152b4 {

    /* renamed from: z */
    public static boolean f158523z;

    /* renamed from: a */
    public final C55724w f158524a;

    /* renamed from: b */
    public final C2485p0 f158525b = new C2485p0(this);

    /* renamed from: c */
    public final C2469j f158526c = new C2469j(this);

    /* renamed from: d */
    public final C55714p f158527d = new C55714p(this);

    /* renamed from: e */
    public final C11739f f158528e;

    /* renamed from: f */
    public final FinderRedDotTrigger f158529f;

    /* renamed from: g */
    public final ConcurrentSkipListSet<String> f158530g;

    /* renamed from: h */
    public FinderRedDotExpiredHandler f158531h;

    /* renamed from: i */
    public LinkedList<C59872b> f158532i;

    /* renamed from: j */
    public final List<C32735h.C32737c> f158533j;

    /* renamed from: k */
    public final FinderRedDotManager$entryConfigChangeListener$1 f158534k;

    /* renamed from: l */
    public final FinderRedDotManager$notifyTabTipsListener$1 f158535l;

    /* renamed from: m */
    public final C13601g f158536m;

    /* renamed from: n */
    public long f158537n;

    /* renamed from: o */
    public long f158538o;

    /* renamed from: p */
    public int f158539p;

    /* renamed from: q */
    public boolean f158540q;

    /* renamed from: r */
    public int f158541r;

    /* renamed from: s */
    public C55718s0 f158542s;

    /* renamed from: t */
    public final ConcurrentHashMap<String, List<C55718s0>> f158543t;

    /* renamed from: u */
    public final ConcurrentHashMap<String, C55718s0> f158544u;

    /* renamed from: v */
    public final List<C32226l<C55718s0, Boolean>> f158545v;

    /* renamed from: w */
    public final List<C13604l<C32226l<C55718s0, Boolean>, C32226l<C55718s0, Boolean>>> f158546w;

    /* renamed from: x */
    public final ConcurrentHashMap<String, C29940a> f158547x;

    /* renamed from: y */
    public final ConcurrentHashMap<String, C50553nj1> f158548y;

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$h */
    public static final class C2448h extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C2448h f12898d = new C2448h();

        public C2448h() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C55718s0) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$j */
    public static final class C2449j extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C2449j f12899d = new C2449j();

        public C2449j() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C55718s0) obj, "_info");
            return Boolean.valueOf(((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$k */
    public static final class C2450k extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderRedDotManager f12900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2450k(FinderRedDotManager finderRedDotManager) {
            super(1);
            this.f12900d = finderRedDotManager;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, "_info");
            boolean X5 = this.f12900d.mo77252X5(Integer.valueOf(s0Var.field_ctrInfo.f144670e));
            Log.m105924i("Finder.RedDotManager", "[ctrlInfoAtPathFillterList] teenMode fill reslut:" + X5);
            return Boolean.valueOf(X5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$l */
    public static final class C2451l extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C2451l f12901d = new C2451l();

        public C2451l() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            if ((zc1.C66785b.f191882e.mo90662O5().length() == 0) != false) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
            if ((zc1.C66785b.f191882e.mo90662O5().length() > 0) == false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r5
                java.lang.String r0 = "_info"
                gy3.C87412m.m108594g(r5, r0)
                te3.xi1 r0 = r5.field_ctrInfo
                int r0 = r0.f144670e
                r1 = 1015(0x3f7, float:1.422E-42)
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0022
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x001f
                r0 = 1
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 != 0) goto L_0x003b
            L_0x0022:
                te3.xi1 r5 = r5.field_ctrInfo
                int r5 = r5.f144670e
                r0 = 1016(0x3f8, float:1.424E-42)
                if (r5 != r0) goto L_0x003c
                zc1.b r5 = zc1.C66785b.f191882e
                java.lang.String r5 = r5.mo90662O5()
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0038
                r5 = 1
                goto L_0x0039
            L_0x0038:
                r5 = 0
            L_0x0039:
                if (r5 == 0) goto L_0x003c
            L_0x003b:
                r2 = 1
            L_0x003c:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.C2451l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$m */
    public static final class C2452m extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C2452m f12902d = new C2452m();

        public C2452m() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            if ((r0 != null ? r0.f144675j : 0) <= eb0.C31543z5.m39455e()) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r5
                java.lang.String r0 = "_info"
                gy3.C87412m.m108594g(r5, r0)
                te3.xi1 r0 = r5.field_ctrInfo
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0013
                int r3 = r0.f144675j
                if (r3 != 0) goto L_0x0013
                r3 = 1
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                if (r3 != 0) goto L_0x0023
                if (r0 == 0) goto L_0x001b
                int r0 = r0.f144675j
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                int r3 = eb0.C31543z5.m39455e()
                if (r0 > r3) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r1 = 0
            L_0x0024:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[ctrlInfoAtPathFillterList] redPack fill result:"
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = " , starttime:"
                r0.append(r2)
                te3.xi1 r5 = r5.field_ctrInfo
                if (r5 == 0) goto L_0x0041
                int r5 = r5.f144675j
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0042
            L_0x0041:
                r5 = 0
            L_0x0042:
                r0.append(r5)
                java.lang.String r5 = ", currentTime:"
                r0.append(r5)
                int r5 = eb0.C31543z5.m39455e()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "Finder.RedDotManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.C2452m.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$n */
    public static final class C2453n extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ int[] f12903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2453n(int[] iArr) {
            super(1);
            this.f12903d = iArr;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, "ctrlInfo");
            int[] iArr = this.f12903d;
            return Boolean.valueOf(iArr == null || C110823p.m151008x(iArr, s0Var.field_ctrInfo.f144670e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$o */
    public static final class C2454o extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderRedDotManager f12904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2454o(FinderRedDotManager finderRedDotManager) {
            super(1);
            this.f12904d = finderRedDotManager;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            boolean z = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX() && !this.f12904d.mo77252X5(Integer.valueOf(s0Var.field_ctrInfo.f144670e));
            if (z) {
                Log.m105924i("Finder.RedDotManager", "[disposeRedDotAtPathIgnoreList]  match,青少年模式且只看关注的模式下只dispose关注的红点展示, ctrlType:" + s0Var.field_ctrInfo.f144670e);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$p */
    public static final class C2455p extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C2455p f12905d = new C2455p();

        public C2455p() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            if ((zc1.C66785b.f191882e.mo90662O5().length() == 0) != false) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
            r0 = r5.field_ctrInfo;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
            if (r0 == null) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
            if (r0.f144675j != 0) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
            if (r1 != false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
            if (r0 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
            r0 = r0.f144675j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
            if (r0 < eb0.C31543z5.m39455e()) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
            if ((zc1.C66785b.f191882e.mo90662O5().length() > 0) == false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                te3.xi1 r0 = r5.field_ctrInfo
                int r0 = r0.f144670e
                r1 = 1015(0x3f7, float:1.422E-42)
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x0022
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x001f
                r0 = 1
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 != 0) goto L_0x003b
            L_0x0022:
                te3.xi1 r0 = r5.field_ctrInfo
                int r0 = r0.f144670e
                r1 = 1016(0x3f8, float:1.424E-42)
                if (r0 != r1) goto L_0x0055
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0055
            L_0x003b:
                te3.xi1 r0 = r5.field_ctrInfo
                if (r0 == 0) goto L_0x0045
                int r1 = r0.f144675j
                if (r1 != 0) goto L_0x0045
                r1 = 1
                goto L_0x0046
            L_0x0045:
                r1 = 0
            L_0x0046:
                if (r1 != 0) goto L_0x0055
                if (r0 == 0) goto L_0x004d
                int r0 = r0.f144675j
                goto L_0x004e
            L_0x004d:
                r0 = 0
            L_0x004e:
                int r1 = eb0.C31543z5.m39455e()
                if (r0 < r1) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r2 = 0
            L_0x0056:
                if (r2 == 0) goto L_0x0074
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[disposeRedDotAtPathIgnoreList]  match,红包活动红点还没到活动开始时间,不能dispose, startTime:"
                r0.append(r1)
                te3.xi1 r5 = r5.field_ctrInfo
                if (r5 == 0) goto L_0x0068
                int r3 = r5.f144675j
            L_0x0068:
                r0.append(r3)
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "Finder.RedDotManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            L_0x0074:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.C2455p.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$u */
    public static final class C2456u extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2456u f12906d = new C2456u();

        public C2456u() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99329X5.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$x */
    public static final class C2457x extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C55718s0 f12907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2457x(C55718s0 s0Var) {
            super(0);
            this.f12907d = s0Var;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("tipsId:");
            sb.append(this.f12907d.field_tipsId);
            sb.append(" username:");
            LinkedList<C64586nn1> linkedList = this.f12907d.field_ctrInfo.f144672g;
            C87412m.m108593f(linkedList, "it.field_ctrInfo.show_infos");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C64586nn1 nn12 : linkedList) {
                arrayList.add(nn12.f184521z);
            }
            sb.append(arrayList);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$a */
    public static final class C29940a {

        /* renamed from: a */
        public final C64858yi1 f81094a;

        /* renamed from: b */
        public final String f81095b;

        public C29940a(C64858yi1 yi12, String str) {
            C87412m.m108594g(yi12, "ext");
            C87412m.m108594g(str, "tipsId");
            this.f81094a = yi12;
            this.f81095b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29940a)) {
                return false;
            }
            C29940a aVar = (C29940a) obj;
            return C87412m.m108589b(this.f81094a, aVar.f81094a) && C87412m.m108589b(this.f81095b, aVar.f81095b);
        }

        public int hashCode() {
            return (this.f81094a.hashCode() * 31) + this.f81095b.hashCode();
        }

        public String toString() {
            return "EnterTabTipsExtInfo(ext=" + this.f81094a + ", tipsId=" + this.f81095b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$s */
    public static final class C29941s extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C29941s f81097d = new C29941s();

        public C29941s() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C55718s0) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$t */
    public static final class C29942t extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public static final C29942t f81098d = new C29942t();

        public C29942t() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C55718s0) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$g */
    public static final class C41404g extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C55718s0 f111487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41404g(C55718s0 s0Var) {
            super(1);
            this.f111487d = s0Var;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(s0Var.field_tipsId, this.f111487d.field_tipsId));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$v */
    public static final class C41405v extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C41405v f111488d = new C41405v();

        public C41405v() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "Discovery"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$w */
    public static final class C41406w extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C41406w f111489d = new C41406w();

        public C41406w() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "Discovery"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$y */
    public static final class C41407y extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C50272lj1 f111490d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f111491e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f111492f;

        /* renamed from: g */
        public final /* synthetic */ FinderRedDotManager f111493g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41407y(C50272lj1 lj12, C8477a0 a0Var, C8477a0 a0Var2, FinderRedDotManager finderRedDotManager) {
            super(1);
            this.f111490d = lj12;
            this.f111491e = a0Var;
            this.f111492f = a0Var2;
            this.f111493g = finderRedDotManager;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, "ctrlInfo");
            boolean contains = this.f111490d.f137456f.contains(s0Var.field_tipsId);
            if (!contains) {
                this.f111491e.f27482d = false;
            } else {
                this.f111492f.f27482d = true;
            }
            if (contains) {
                this.f111493g.mo77265f(s0Var.field_ctrInfo, "revokePathRedDot#1");
            }
            return Boolean.valueOf(contains);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$z */
    public static final class C41408z extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C50411mj1 f111494d;

        /* renamed from: e */
        public final /* synthetic */ FinderRedDotManager f111495e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41408z(C50411mj1 mj12, FinderRedDotManager finderRedDotManager) {
            super(0);
            this.f111494d = mj12;
            this.f111495e = finderRedDotManager;
        }

        public Object invoke() {
            C13598b0 b0Var;
            Class cls = C58417y0.class;
            LinkedList<C49448fn1> linkedList = new LinkedList<>();
            Log.m105924i("Finder.ThreeDayTwoDay", "beforeRevokeRedDot hasRed=false");
            LinkedList<C50553nj1> linkedList2 = this.f111494d.f138069d;
            C87412m.m108593f(linkedList2, "revoke.revoke_tab_tips_info");
            FinderRedDotManager finderRedDotManager = this.f111495e;
            for (C50553nj1 nj12 : linkedList2) {
                String str = nj12.f138628d;
                ConcurrentHashMap<String, C55718s0> concurrentHashMap = finderRedDotManager.f158544u;
                if (str == null) {
                    str = "";
                }
                C55718s0 s0Var = concurrentHashMap.get(str);
                if (s0Var != null) {
                    finderRedDotManager.mo77265f(s0Var.field_ctrInfo, "revokeTabTips");
                    linkedList.addAll(nj12.f138629e);
                    boolean d = finderRedDotManager.mo77261d(s0Var);
                    Log.m105924i("Finder.RedDotManager", "[revokeRedDot] ret=" + d + " revokeId=" + nj12.f138628d + ' ' + s0Var);
                    if (d) {
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                        int i = s0Var.field_ctrInfo.f144670e;
                        String str2 = s0Var.field_tipsId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = nj12.f138628d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        y0Var.Ox0(i, str2, str3, 1);
                    } else {
                        C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                        int i2 = s0Var.field_ctrInfo.f144670e;
                        String str4 = s0Var.field_tipsId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = nj12.f138628d;
                        if (str5 == null) {
                            str5 = "";
                        }
                        y0Var2.Ox0(i2, str4, str5, 0);
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Log.m105928w("Finder.RedDotManager", "no found redDot. " + nj12.f138628d);
                    ConcurrentHashMap<String, C50553nj1> concurrentHashMap2 = finderRedDotManager.f158548y;
                    String str6 = nj12.f138628d;
                    if (str6 == null) {
                        str6 = "";
                    }
                    concurrentHashMap2.put(str6, nj12);
                    C58417y0 y0Var3 = (C58417y0) C86312j.m106911c(cls);
                    String str7 = nj12.f138628d;
                    if (str7 == null) {
                        str7 = "";
                    }
                    y0Var3.Ox0(0, "", str7, 0);
                }
            }
            FinderRedDotManager finderRedDotManager2 = this.f111495e;
            C49170dn1 dn12 = new C49170dn1();
            dn12.f132433d = linkedList;
            finderRedDotManager2.mo77250V5(dn12, "FinderRevokeTabTips");
            Log.m105924i("Finder.ThreeDayTwoDay", "afterRevokeRedDot hasRed=false");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$b */
    public static final class C55697b {

        /* renamed from: c */
        public static final C55698a f158549c = new C55698a((C8480h) null);

        /* renamed from: a */
        public final int f158550a;

        /* renamed from: b */
        public final C50705on1 f158551b;

        /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$b$a */
        public static final class C55698a {
            public C55698a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C55697b mo77290a(int i, FinderRedDotManager finderRedDotManager) {
                C89349b bVar;
                C87412m.m108594g(finderRedDotManager, "manager");
                String w = finderRedDotManager.mo77283w(i);
                C55718s0 G5 = finderRedDotManager.mo77227G5(w);
                byte[] bArr = null;
                C64586nn1 o2 = G5 != null ? G5.mo77308o2(w) : null;
                C50705on1 on12 = new C50705on1();
                StringBuilder sb = new StringBuilder();
                sb.append("[FinderTipsShowTabExt#transform] tabType=");
                sb.append(i);
                sb.append(" path=");
                sb.append(w);
                sb.append(" show_ext_info_type=");
                sb.append(o2 != null ? Integer.valueOf(o2.f184509n) : null);
                sb.append(" show_ext_info=");
                int i2 = 0;
                sb.append((o2 != null ? o2.f184510o : null) != null);
                Log.m105924i("Finder.RedDotManager", sb.toString());
                if ((o2 != null && o2.f184509n == 2) && (bVar = o2.f184510o) != null) {
                    if (bVar != null) {
                        bArr = bVar.mo123703f();
                    }
                    on12.parseFrom(bArr);
                    Log.m105924i("Finder.RedDotManager", "tabType=" + i + " serverJumpPriority=" + on12.f139267d);
                } else if (o2 != null) {
                    if (i == 1) {
                        i2 = 700000;
                    } else if (i == 3) {
                        i2 = 600000;
                    } else if (i == 4) {
                        i2 = 500000;
                    }
                    on12.f139267d = i2;
                }
                return new C55697b(i, on12);
            }
        }

        public C55697b(int i, C50705on1 on12) {
            C87412m.m108594g(on12, "ext");
            this.f158550a = i;
            this.f158551b = on12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55697b)) {
                return false;
            }
            C55697b bVar = (C55697b) obj;
            return this.f158550a == bVar.f158550a && C87412m.m108589b(this.f158551b, bVar.f158551b);
        }

        public int hashCode() {
            return (this.f158550a * 31) + this.f158551b.hashCode();
        }

        public String toString() {
            return "FinderTipsShowTabExt(tabType=" + this.f158550a + ", ext=" + this.f158551b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$c */
    public static final class C55699c extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ boolean f158552d;

        /* renamed from: e */
        public final /* synthetic */ FinderRedDotManager f158553e;

        /* renamed from: f */
        public final /* synthetic */ String f158554f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55699c(boolean z, FinderRedDotManager finderRedDotManager, String str) {
            super(1);
            this.f158552d = z;
            this.f158553e = finderRedDotManager;
            this.f158554f = str;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, "localCtrlIno");
            return Boolean.valueOf(!this.f158552d ? true : this.f158553e.mo77274n(this.f158554f, s0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$d */
    public static final class C55700d extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C55718s0 f158555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55700d(C55718s0 s0Var) {
            super(1);
            this.f158555d = s0Var;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(s0Var.field_tipsId, this.f158555d.field_tipsId));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$e */
    public static final class C55701e extends C87413o implements C32226l<C55718s0, Comparable<?>> {

        /* renamed from: d */
        public static final C55701e f158556d = new C55701e();

        public C55701e() {
            super(1);
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Integer.valueOf(s0Var.field_ctrInfo.f144669d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$f */
    public static final class C55702f extends C87413o implements C32226l<C55718s0, Comparable<?>> {

        /* renamed from: d */
        public static final C55702f f158557d = new C55702f();

        public C55702f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Long.valueOf(s0Var.field_time);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$i */
    public static final class C55703i extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Map.Entry<String, LinkedList<C55718s0>> f158558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55703i(Map.Entry<String, ? extends LinkedList<C55718s0>> entry) {
            super(1);
            this.f158558d = entry;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f158558d.getValue().indexOf(s0Var) >= 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$q */
    public static final class C55704q extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C55704q f158559d = new C55704q();

        public C55704q() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "path");
            C55716q0.f158580a.mo77301c(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$r */
    public static final class C55705r extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C55705r f158560d = new C55705r();

        public C55705r() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "path");
            C55716q0.f158580a.mo77301c(str);
            return C13598b0.f38549a;
        }
    }

    public FinderRedDotManager(C55724w wVar) {
        C87412m.m108594g(wVar, "storage");
        this.f158524a = wVar;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f158528e = (C11739f) a;
        this.f158529f = new FinderRedDotTrigger();
        this.f158530g = new ConcurrentSkipListSet<>();
        this.f158532i = new LinkedList<>();
        this.f158533j = C26236u.m33719b(C32735h.C32737c.clicfg_finder_3_day_2_day_enable);
        C40008f fVar = C40008f.f107254d;
        this.f158534k = new FinderRedDotManager$entryConfigChangeListener$1(this, fVar);
        this.f158535l = new FinderRedDotManager$notifyTabTipsListener$1(this, fVar);
        this.f158536m = C36568h.m40985a(C2456u.f12906d);
        this.f158543t = new ConcurrentHashMap<>();
        this.f158544u = new ConcurrentHashMap<>();
        this.f158545v = C64197v.m75537f(new C2454o(this), C2455p.f12905d);
        this.f158546w = C64197v.m75537f(new C13604l(C2449j.f12899d, new C2450k(this)), new C13604l(C2451l.f12901d, C2452m.f12902d));
        this.f158547x = new ConcurrentHashMap<>();
        this.f158548y = new ConcurrentHashMap<>();
    }

    /* renamed from: B */
    public static boolean m63315B(FinderRedDotManager finderRedDotManager, C51978xi1 xi12, String str, boolean z, boolean z2, int i, Object obj) {
        C64586nn1 nn12;
        T t;
        C51978xi1 xi13 = xi12;
        String str2 = str;
        boolean z3 = (i & 4) != 0 ? true : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        finderRedDotManager.getClass();
        LinkedList<C64586nn1> linkedList = xi13.f144672g;
        C87412m.m108593f(linkedList, "info.show_infos");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            nn12 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C64586nn1) t).f184507i, str2)) {
                break;
            }
        }
        C64586nn1 nn13 = (C64586nn1) t;
        Log.m105924i("Finder.RedDotManager", "handleShowInfoForAppPushByPath path:" + str2 + " isIgnoreDependency:" + z3 + " showInfo:" + nn13);
        if (nn13 != null) {
            C58413v0.m67784m(C58413v0.f167346a, xi12, nn13, 2, (String) null, 1, 8, (Object) null);
            if (z4) {
                LinkedList<C64586nn1> linkedList2 = xi13.f144672g;
                C87412m.m108593f(linkedList2, "info.show_infos");
                for (C64586nn1 nn14 : linkedList2) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108593f(nn14, LocaleUtil.ITALIAN);
                    C58413v0.m67784m(v0Var, xi12, nn14, 2, (String) null, 1, 8, (Object) null);
                }
            }
        }
        C87412m.m108594g(str2, "path");
        Iterator<C64586nn1> it4 = xi13.f144672g.iterator();
        C87412m.m108593f(it4, "info.show_infos.iterator()");
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C64586nn1 next = it4.next();
            if (C87412m.m108589b(next.f184507i, str2)) {
                it4.remove();
                nn12 = next;
                break;
            }
        }
        return nn12 != null;
    }

    /* renamed from: C */
    public static void m63316C(FinderRedDotManager finderRedDotManager, C51978xi1 xi12, int i, String str, boolean z, boolean z2, int i2, Object obj) {
        C64586nn1 R5;
        C64586nn1 R52;
        C64586nn1 R53;
        C55718s0 i3;
        C55718s0 i4;
        FinderRedDotManager finderRedDotManager2 = finderRedDotManager;
        C51978xi1 xi13 = xi12;
        int i5 = i;
        String str2 = str;
        boolean z3 = (i2 & 8) != 0 ? false : z;
        boolean z4 = (i2 & 16) != 0 ? false : z2;
        finderRedDotManager.getClass();
        C87412m.m108594g(xi13, "ctrlInfo");
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.RedDotManager", "source: " + str2 + " ignorePartialRedDotType:" + i5 + " ctrlInfo:" + C55716q0.f158580a.mo77303e(xi13));
        String str3 = xi13.f144679q;
        if (str3 == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            str3 = C66785b.f191882e.mo90662O5();
        }
        if (i5 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("WxMessageLike");
            arrayList.add("WxMessageComment");
            arrayList.add("WxMessageEntry");
            C13598b0 b0Var = C13598b0.f38549a;
            finderRedDotManager2.mo77236L(xi13, arrayList);
            C55718s0 G5 = finderRedDotManager2.mo77227G5("WxMessageEntry");
            if (G5 != null) {
                C64586nn1 o2 = G5.mo77308o2("WxMessageLike");
                if (o2 != null) {
                    xi13.f144672g.add(o2);
                }
                C64586nn1 o25 = G5.mo77308o2("WxMessageComment");
                if (o25 != null) {
                    xi13.f144672g.add(o25);
                }
                C64586nn1 o26 = G5.mo77308o2("WxMessageEntry");
                if (o26 != null) {
                    xi13.f144672g.add(o26);
                }
            }
        }
        if (i5 != 1008) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("finder_wx_private_msg_entrance");
            arrayList2.add("FinderWXMessageConversation");
            C13598b0 b0Var2 = C13598b0.f38549a;
            finderRedDotManager2.mo77236L(xi13, arrayList2);
            C55718s0 G52 = finderRedDotManager2.mo77227G5("finder_wx_private_msg_entrance");
            if (G52 != null) {
                C64586nn1 o27 = G52.mo77308o2("finder_wx_private_msg_entrance");
                if (o27 != null) {
                    xi13.f144672g.add(o27);
                }
                C64586nn1 o28 = G52.mo77308o2("FinderWXMessageConversation");
                if (o28 != null) {
                    xi13.f144672g.add(o28);
                }
            }
        }
        if (i5 != 2) {
            Log.m105924i("Finder.RedDotManager", "mergeFinderMentionCtrlInfo enter:" + xi13.f144670e + " username=" + str3);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("AuthorProfileNotify");
            arrayList3.add("NotificationCenterLike");
            arrayList3.add("NotificationCenterComment");
            arrayList3.add("NotificationCenterFollow");
            C13598b0 b0Var3 = C13598b0.f38549a;
            finderRedDotManager2.mo77236L(xi13, arrayList3);
            if (!(str3.length() == 0) && (i4 = finderRedDotManager2.mo77269i("AuthorProfileNotify", str3)) != null) {
                C64586nn1 o29 = i4.mo77308o2("NotificationCenterLike");
                if (o29 != null) {
                    xi13.f144672g.add(o29);
                }
                C64586nn1 o210 = i4.mo77308o2("NotificationCenterComment");
                if (o210 != null) {
                    xi13.f144672g.add(o210);
                }
                C64586nn1 o211 = i4.mo77308o2("NotificationCenterFollow");
                if (o211 != null) {
                    xi13.f144672g.add(o211);
                }
                C64586nn1 o212 = i4.mo77308o2("AuthorProfileNotify");
                if (o212 != null) {
                    xi13.f144672g.add(o212);
                }
            }
        }
        if (i5 != 1006) {
            Log.m105924i("Finder.RedDotManager", "mergeFinderPrivateMessage enter:" + xi13.f144670e + " username=" + str3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add("finder_private_msg_entrance");
            arrayList4.add("FinderMessageConversation");
            C13598b0 b0Var4 = C13598b0.f38549a;
            finderRedDotManager2.mo77236L(xi13, arrayList4);
            if (!(str3.length() == 0) && (i3 = finderRedDotManager2.mo77269i("finder_private_msg_entrance", str3)) != null) {
                C64586nn1 nn12 = i3.f158583D.get("finder_private_msg_entrance");
                if (nn12 != null) {
                    xi13.f144672g.add(nn12);
                }
                C64586nn1 nn13 = i3.f158583D.get("FinderMessageConversation");
                if (nn13 != null) {
                    xi13.f144672g.add(nn13);
                }
            }
        }
        LinkedList<C64586nn1> linkedList = xi13.f144672g;
        C87412m.m108593f(linkedList, "ctrlInfo.show_infos");
        C64586nn1 nn14 = null;
        C64586nn1 nn15 = null;
        C64586nn1 nn16 = null;
        for (C64586nn1 nn17 : linkedList) {
            if (C87412m.m108589b(nn17.f184507i, "Discovery")) {
                nn15 = nn17;
            }
            if (C87412m.m108589b(nn17.f184507i, "FinderMentionEntrance")) {
                nn16 = nn17;
            }
            if (C87412m.m108589b(nn17.f184507i, "TLPersonalCenter")) {
                nn14 = nn17;
            }
        }
        if (nn14 == null && (R53 = finderRedDotManager2.mo77246R5("TLPersonalCenter")) != null) {
            xi13.f144672g.add(R53);
            nn14 = R53;
        }
        if (nn15 == null && (R52 = finderRedDotManager2.mo77246R5("Discovery")) != null && R52.f184502d == 2) {
            xi13.f144672g.add(R52);
            nn15 = R52;
        }
        if (nn16 == null && (R5 = finderRedDotManager2.mo77246R5("FinderMentionEntrance")) != null) {
            xi13.f144672g.add(R5);
            nn16 = R5;
        }
        if (nn16 != null) {
            if (nn16.f184502d == 2) {
                if (nn14 != null) {
                    nn14.f184502d = 2;
                }
                nn16.f184506h = 2;
                if (nn14 != null) {
                    nn14.f184508j = "FinderMentionEntrance";
                }
                Log.m105924i("Finder.RedDotManager", "add FINDER_MENTION_ENTRANCE");
            }
            if (nn15 != null && nn15.f184502d == 2 && nn15.f184506h == 2) {
                nn15.f184508j = "FinderMentionEntrance";
            }
        }
        if (z4) {
            finderRedDotManager2.mo77230I(xi13, str2, new C2475l0(finderRedDotManager2));
        }
        if (z3) {
            C60152b4.C8759a.m8561a(finderRedDotManager, xi12, str, (HashSet) null, true, (C13604l) null, new C2477m0(finderRedDotManager2), 0, true, 84, (Object) null);
        }
    }

    /* renamed from: A */
    public final void mo77222A(C51978xi1 xi12) {
        LinkedList<C64586nn1> linkedList;
        Iterator<C64586nn1> it;
        boolean N = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo59665N();
        if (xi12 != null) {
            if (N && (linkedList = xi12.f144672g) != null && (it = linkedList.iterator()) != null && it.hasNext() && C87412m.m108589b(it.next().f184507i, "FinderEntrance")) {
                it.remove();
            }
            int i = xi12.f144670e;
            int i2 = i != 2 ? i : 0;
            Log.m105924i("Finder.RedDotManager", "handleRedDotMessage ctrlType:" + i2);
            m63316C(this, xi12, i2, "notifyRedDot", true, false, 16, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: te3.nn1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01dc  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77223D(int r19, int r20, int r21, int r22, java.lang.String r23) {
        /*
            r18 = this;
            r12 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r4, r5)
            if (r3 <= 0) goto L_0x002f
            zc1.b r5 = zc1.C66785b.f191882e
            bd1.c r6 = new bd1.c
            java.lang.String r7 = r5.mo90662O5()
            if (r7 != 0) goto L_0x0020
            java.lang.String r7 = ""
        L_0x0020:
            r6.<init>(r7)
            r6.field_systemMsgCount = r3
            bd1.i r3 = bd1.C39759i.SYS_MSG_COUNT
            r5.mo90672m1(r6, r3)
            com.tencent.mm.plugin.finder.extension.reddot.j r3 = r12.f158526c
            r3.mo2443e(r4)
        L_0x002f:
            java.lang.String r3 = "Finder.RedDotManager"
            if (r0 > 0) goto L_0x003d
            if (r1 > 0) goto L_0x003d
            if (r2 > 0) goto L_0x003d
            java.lang.String r0 = "[notifyFinderMsgCount] server error."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x003d:
            te3.xi1 r5 = new te3.xi1
            r5.<init>()
            long r6 = eb0.C31543z5.m39453c()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.f144673h = r6
            r6 = 400000(0x61a80, float:5.6052E-40)
            r5.f144669d = r6
            r6 = 2
            r5.f144670e = r6
            r5.f144679q = r4
            fe1.d$b r7 = fe1.C58961d.f168673a
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            fe1.q r7 = r7.mo84155b(r8)
            if (r7 == 0) goto L_0x0067
            long r7 = r7.field_messageStatus
            goto L_0x0069
        L_0x0067:
            r7 = 0
        L_0x0069:
            r9 = 1
            long r13 = r7 & r9
            r15 = 1
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0074
            r9 = 1
            goto L_0x0075
        L_0x0074:
            r9 = 0
        L_0x0075:
            r13 = 2
            long r16 = r7 & r13
            int r10 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x007f
            r10 = 1
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            r13 = 4
            long r7 = r7 & r13
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            te3.nn1 r8 = new te3.nn1
            r8.<init>()
            if (r9 == 0) goto L_0x0093
            r13 = r0
            goto L_0x0094
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r10 == 0) goto L_0x0098
            r14 = r1
            goto L_0x0099
        L_0x0098:
            r14 = 0
        L_0x0099:
            if (r7 == 0) goto L_0x009e
            r16 = r2
            goto L_0x00a0
        L_0x009e:
            r16 = 0
        L_0x00a0:
            int r13 = r13 + r14
            int r13 = r13 + r16
            r8.f184503e = r13
            if (r13 <= 0) goto L_0x00a9
            r14 = 2
            goto L_0x00aa
        L_0x00a9:
            r14 = 1
        L_0x00aa:
            r8.f184502d = r14
            r8.f184506h = r15
            java.lang.String r14 = "AuthorProfileNotify"
            r8.f184507i = r14
            r8.f184521z = r4
            java.util.LinkedList<te3.nn1> r14 = r5.f144672g
            r14.add(r8)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r11 = "isEnableLike :"
            r14.append(r11)
            r14.append(r9)
            java.lang.String r9 = " isEnableComment:"
            r14.append(r9)
            r14.append(r10)
            java.lang.String r9 = " isEnableFollow:"
            r14.append(r9)
            r14.append(r7)
            java.lang.String r7 = " messageCount:"
            r14.append(r7)
            r14.append(r13)
            java.lang.String r7 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            if (r0 <= 0) goto L_0x00fd
            te3.nn1 r7 = new te3.nn1
            r7.<init>()
            r7.f184502d = r6
            r7.f184506h = r15
            java.lang.String r9 = "NotificationCenterLike"
            r7.f184507i = r9
            r7.f184503e = r0
            r7.f184521z = r4
            java.util.LinkedList<te3.nn1> r0 = r5.f144672g
            r0.add(r7)
        L_0x00fd:
            if (r1 <= 0) goto L_0x0115
            te3.nn1 r0 = new te3.nn1
            r0.<init>()
            r0.f184502d = r6
            r0.f184506h = r15
            java.lang.String r7 = "NotificationCenterComment"
            r0.f184507i = r7
            r0.f184503e = r1
            r0.f184521z = r4
            java.util.LinkedList<te3.nn1> r1 = r5.f144672g
            r1.add(r0)
        L_0x0115:
            if (r2 <= 0) goto L_0x012d
            te3.nn1 r0 = new te3.nn1
            r0.<init>()
            r0.f184502d = r6
            r0.f184506h = r15
            java.lang.String r1 = "NotificationCenterFollow"
            r0.f184507i = r1
            r0.f184503e = r2
            r0.f184521z = r4
            java.util.LinkedList<te3.nn1> r1 = r5.f144672g
            r1.add(r0)
        L_0x012d:
            java.util.LinkedList<te3.nn1> r0 = r5.f144672g
            java.lang.String r1 = "ctrInfo.show_infos"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0138:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0151
            java.lang.Object r1 = r0.next()
            r7 = r1
            te3.nn1 r7 = (te3.C64586nn1) r7
            java.lang.String r7 = r7.f184507i
            java.lang.String r9 = "finder_private_msg_entrance"
            boolean r7 = gy3.C87412m.m108589b(r7, r9)
            if (r7 == 0) goto L_0x0138
            goto L_0x0152
        L_0x0151:
            r1 = r2
        L_0x0152:
            te3.nn1 r1 = (te3.C64586nn1) r1
            if (r1 == 0) goto L_0x0160
            int r0 = r1.f184502d
            if (r0 != r6) goto L_0x0160
            int r0 = r12.mo77282v(r15, r4)
            r1.f184503e = r0
        L_0x0160:
            java.util.LinkedList<te3.nn1> r0 = r5.f144672g
            java.lang.String r1 = "TLPersonalCenter"
            if (r0 == 0) goto L_0x019b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x016f:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0188
            java.lang.Object r9 = r0.next()
            r10 = r9
            te3.nn1 r10 = (te3.C64586nn1) r10
            java.lang.String r10 = r10.f184507i
            boolean r10 = gy3.C87412m.m108589b(r10, r1)
            if (r10 == 0) goto L_0x016f
            r7.add(r9)
            goto L_0x016f
        L_0x0188:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r7 = r2
        L_0x0191:
            if (r7 == 0) goto L_0x019b
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            te3.nn1 r7 = (te3.C64586nn1) r7
            goto L_0x019c
        L_0x019b:
            r7 = r2
        L_0x019c:
            java.util.LinkedList<te3.nn1> r0 = r5.f144672g
            if (r0 == 0) goto L_0x01d7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01a9:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x01c4
            java.lang.Object r10 = r0.next()
            r11 = r10
            te3.nn1 r11 = (te3.C64586nn1) r11
            java.lang.String r11 = r11.f184507i
            java.lang.String r13 = "FinderMentionEntrance"
            boolean r11 = gy3.C87412m.m108589b(r11, r13)
            if (r11 == 0) goto L_0x01a9
            r9.add(r10)
            goto L_0x01a9
        L_0x01c4:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r9 = r2
        L_0x01cd:
            if (r9 == 0) goto L_0x01d7
            r0 = 0
            java.lang.Object r9 = r9.get(r0)
            te3.nn1 r9 = (te3.C64586nn1) r9
            goto L_0x01d8
        L_0x01d7:
            r9 = r2
        L_0x01d8:
            java.util.LinkedList<te3.nn1> r0 = r5.f144672g
            if (r0 == 0) goto L_0x0213
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01e5:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0200
            java.lang.Object r11 = r0.next()
            r13 = r11
            te3.nn1 r13 = (te3.C64586nn1) r13
            java.lang.String r13 = r13.f184507i
            java.lang.String r14 = "Discovery"
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x01e5
            r10.add(r11)
            goto L_0x01e5
        L_0x0200:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r10 = r2
        L_0x0209:
            if (r10 == 0) goto L_0x0213
            r0 = 0
            java.lang.Object r0 = r10.get(r0)
            r2 = r0
            te3.nn1 r2 = (te3.C64586nn1) r2
        L_0x0213:
            int r0 = r8.f184503e
            int r0 = r12.mo77282v(r0, r4)
            int r4 = r8.f184503e
            int r4 = r4 + r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "count :"
            r10.append(r11)
            int r11 = r8.f184503e
            r10.append(r11)
            java.lang.String r11 = " finderMessageCount:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = "  totalCount:"
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            if (r7 == 0) goto L_0x024e
            int r0 = r7.f184502d
            if (r0 != r6) goto L_0x024e
            r7.f184503e = r4
            r8.f184508j = r1
            r8.f184506h = r6
        L_0x024e:
            if (r9 == 0) goto L_0x0256
            int r0 = r9.f184502d
            if (r0 != r6) goto L_0x0256
            r9.f184503e = r4
        L_0x0256:
            if (r2 == 0) goto L_0x025e
            int r0 = r2.f184502d
            if (r0 != r6) goto L_0x025e
            r2.f184503e = r4
        L_0x025e:
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 1
            r11 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r2 = "notifyFinderTabMsgCount"
            r0 = r18
            r1 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r13
            ht1.C60152b4.C8759a.m8561a(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77223D(int, int, int, int, java.lang.String):void");
    }

    /* renamed from: E */
    public final void mo77224E(C51837wi1 wi12) {
        LinkedList<C64586nn1> linkedList;
        LinkedList<C64586nn1> linkedList2;
        C51837wi1 wi13 = wi12;
        C87412m.m108594g(wi13, "redDot");
        long c = C31543z5.m39453c();
        C29945t0 t0Var = C29945t0.f81101a;
        long G = c - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0);
        Log.m105924i("Finder.RedDotManager", "[notifyRedDot] diffTime=" + G + " newMsgTipsEnterInterval=" + t0Var.mo57018k() + " showRed=" + wi13.f144067d + ' ' + C55716q0.f158580a.mo77303e(wi13.f144068e));
        C51978xi1 xi12 = wi13.f144068e;
        if (!(xi12 == null || (linkedList2 = xi12.f144672g) == null)) {
            for (C64586nn1 nn12 : linkedList2) {
                if (nn12.f184506h == 2 && Util.isNullOrNil(nn12.f184508j)) {
                    Log.m105928w("Finder.RedDotManager", "notifyRedDot clear_type parent not match");
                }
                Log.m105924i("Finder.RedDotManager", "notifyRedDot path:" + nn12.f184507i + " clear_type:" + nn12.f184506h + " parent:" + nn12.f184508j + " showType:" + nn12.f184502d + " count:" + nn12.f184503e + " title:" + nn12.f184504f);
            }
        }
        if (G < C29945t0.f81101a.mo57018k()) {
            C55708b0.m63389b(C55708b0.f158567a, wi13.f144068e, false, 2, (Object) null);
            C51978xi1 xi13 = wi13.f144068e;
            if (!(xi13 == null || (linkedList = xi13.f144672g) == null)) {
                C61926c.m72675T(linkedList, C41405v.f111488d);
            }
        }
        C51978xi1 xi14 = wi13.f144068e;
        int i = xi14 != null ? xi14.f144670e : 0;
        int i2 = 1;
        if (i == 1 || i == 2) {
            mo77222A(xi14);
            return;
        }
        LinkedList<C51978xi1> linkedList3 = wi13.f144069f;
        C87412m.m108593f(linkedList3, "redDot.ctrl_info_list");
        for (C51978xi1 xi15 : linkedList3) {
            if (xi15.f144670e == 2 || i == i2) {
                mo77222A(wi13.f144068e);
            } else {
                C60152b4.C8759a.m8561a(this, xi15, "notifyRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
            }
            i2 = 1;
        }
    }

    /* renamed from: F */
    public void mo77225F(C49170dn1 dn12, String str, long j) {
        C87412m.m108594g(dn12, "tabTips");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        LinkedList<C49448fn1> linkedList = dn12.f132433d;
        C87412m.m108593f(linkedList, "tabTips.tab_tips_info");
        for (C49448fn1 fn12 : linkedList) {
            C51978xi1 xi12 = fn12.f133597d;
            if (xi12 != null) {
                LinkedList<C59872b> linkedList2 = this.f158532i;
                C87412m.m108594g(linkedList2, "interceptors");
                if (linkedList2.size() > 0) {
                    linkedList2.get(0).mo84825a(new C59877e(xi12, linkedList2, 1, (C59872b.C59873a) null));
                } else {
                    Log.m105920e("Finder.RedDotChain", "index out of bounds");
                }
            }
        }
    }

    /* renamed from: G */
    public final boolean mo77226G(C50160kp1 kp12) {
        C64586nn1 nn12;
        LinkedList<C64586nn1> linkedList;
        LinkedList<C64586nn1> linkedList2;
        LinkedList<C64586nn1> linkedList3;
        T t;
        C50160kp1 kp13 = kp12;
        C87412m.m108594g(kp13, "wxMention");
        long c = C31543z5.m39453c();
        C29945t0 t0Var = C29945t0.f81101a;
        long G = c - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0);
        boolean z = false;
        if (kp13.f136955d > 0 || kp13.f136962n > 0 || kp13.f136961j > 0 || kp13.f136957f > 0 || kp13.f136956e > 0 || kp13.f136958g > 0 || kp13.f136963o > 0 || kp13.f136966r > 0) {
            Log.m105924i("Finder.RedDotManager", "[notifyWxMentionCount] diffTime=" + G + " newMsgEntranceInterval=" + t0Var.mo57018k() + ' ' + C55716q0.f158580a.mo77303e(kp13.f136960i) + " count=" + kp13.f136955d);
            C51978xi1 xi12 = kp13.f136960i;
            if (xi12 == null || (linkedList3 = xi12.f144672g) == null) {
                nn12 = null;
            } else {
                Iterator<T> it = linkedList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C64586nn1) t).f184507i, "FinderEntrance")) {
                        break;
                    }
                }
                nn12 = (C64586nn1) t;
            }
            boolean z2 = (nn12 != null ? nn12.f184514s : 0) == 1;
            if (G < C29945t0.f81101a.mo57018k()) {
                if (!z2) {
                    C55708b0.m63389b(C55708b0.f158567a, kp13.f136960i, false, 2, (Object) null);
                }
                C51978xi1 xi13 = kp13.f136960i;
                if (!(xi13 == null || (linkedList2 = xi13.f144672g) == null)) {
                    C61926c.m72675T(linkedList2, C41406w.f111489d);
                }
            }
            C51978xi1 xi14 = kp13.f136960i;
            if (xi14 != null && (linkedList = xi14.f144672g) != null) {
                Iterator<C64586nn1> it4 = linkedList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (C87412m.m108589b(it4.next().f184507i, "WxMessageEntry")) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            Log.m105924i("Finder.RedDotManager", "[notifyWxMentionCount] isHasWxMessageEntry=" + z);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_IS_BUBBLE_BOOLEAN_SYNC, Boolean.valueOf(z ^ true));
            if (z) {
                mo77222A(kp13.f136960i);
            } else {
                C60152b4.C8759a.m8561a(this, kp13.f136960i, "notifyWxMentionCount", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
            }
            return z;
        }
        Log.m105920e("Finder.RedDotManager", "[notifyWxMentionCount] server error.");
        return false;
    }

    /* renamed from: G5 */
    public C55718s0 mo77227G5(String str) {
        C87412m.m108594g(str, "path");
        return mo77269i(str, C66785b.f191882e.mo90662O5());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0399 A[Catch:{ all -> 0x0445 }, LOOP:5: B:108:0x0376->B:120:0x0399, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b7 A[Catch:{ all -> 0x0445 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0398 A[SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77228H() {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r2 = ""
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.extension.reddot.w r5 = r1.f158524a
            r5.getClass()
            java.lang.String r6 = "Finder.RedDotCtrInfoStorage"
            long r7 = java.lang.System.currentTimeMillis()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            r13 = 1
            android.database.Cursor r14 = r5.getAll()     // Catch:{ Exception -> 0x011c }
            if (r14 == 0) goto L_0x0123
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x010c
        L_0x002c:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r15 = new com.tencent.mm.plugin.finder.extension.reddot.s0     // Catch:{ all -> 0x0113 }
            r15.<init>()     // Catch:{ all -> 0x0113 }
            r15.convertFrom(r14)     // Catch:{ all -> 0x0113 }
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00b8 }
            te3.xi1 r0 = r15.field_ctrInfo     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "ctrInfo"
            int r0 = r14.getColumnIndex(r0)     // Catch:{ all -> 0x00b8 }
            byte[] r10 = r14.getBlob(r0)     // Catch:{ all -> 0x00b8 }
            gy3.a0 r12 = new gy3.a0     // Catch:{ all -> 0x00b8 }
            r12.<init>()     // Catch:{ all -> 0x00b8 }
            if (r10 == 0) goto L_0x004f
            int r0 = r10.length     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            goto L_0x0062
        L_0x004f:
            r0 = -1
        L_0x0050:
            if (r0 <= 0) goto L_0x005c
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0 = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            r0.parseFrom(r10)     // Catch:{ all -> 0x004d }
            r12.f27482d = r13     // Catch:{ all -> 0x004d }
        L_0x005c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004d }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x004d }
            goto L_0x006b
        L_0x0062:
            kotlin.Result$Companion r16 = kotlin.Result.Companion     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x00b8 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00b8 }
        L_0x006b:
            gy3.f0 r13 = new gy3.f0     // Catch:{ all -> 0x00b8 }
            r13.<init>()     // Catch:{ all -> 0x00b8 }
            r13.f27484d = r2     // Catch:{ all -> 0x00b8 }
            if (r10 == 0) goto L_0x0078
            int r0 = r10.length     // Catch:{ all -> 0x0076 }
            goto L_0x0079
        L_0x0076:
            r0 = move-exception
            goto L_0x008f
        L_0x0078:
            r0 = -1
        L_0x0079:
            if (r0 <= 0) goto L_0x0089
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0076 }
            java.lang.String r11 = "buf"
            gy3.C87412m.m108593f(r10, r11)     // Catch:{ all -> 0x0076 }
            java.nio.charset.Charset r11 = z04.C119027c.f356488a     // Catch:{ all -> 0x0076 }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x0076 }
            r13.f27484d = r0     // Catch:{ all -> 0x0076 }
        L_0x0089:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0076 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0098
        L_0x008f:
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x00b8 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00b8 }
        L_0x0098:
            ft1.a r17 = ft1.C59319a.f169618b     // Catch:{ all -> 0x00b8 }
            java.lang.String r18 = "field_ctrInfo_null_blob"
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            com.tencent.mm.plugin.finder.extension.reddot.v r0 = new com.tencent.mm.plugin.finder.extension.reddot.v     // Catch:{ all -> 0x00b8 }
            r0.<init>(r10, r12, r13, r15)     // Catch:{ all -> 0x00b8 }
            r24 = 28
            r25 = 0
            r23 = r0
            o40.C11348f.C11349a.m11177a(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b8 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c2
        L_0x00b8:
            r0 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x0113 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0113 }
        L_0x00c2:
            te3.xi1 r0 = r15.field_ctrInfo     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00ff
            long r10 = r15.systemRowid     // Catch:{ all -> 0x0113 }
            boolean r0 = r5.delete(r10)     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r10.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = "delete["
            r10.append(r11)     // Catch:{ all -> 0x0113 }
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "] valid rowId="
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            long r11 = r15.systemRowid     // Catch:{ all -> 0x0113 }
            r10.append(r11)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " tipsId="
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r15.field_tipsId     // Catch:{ all -> 0x0113 }
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " type="
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            int r0 = r15.field_ctrType     // Catch:{ all -> 0x0113 }
            r10.append(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0113 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0113 }
            goto L_0x0102
        L_0x00ff:
            r9.add(r15)     // Catch:{ all -> 0x0113 }
        L_0x0102:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r13 = 1
            goto L_0x002c
        L_0x010c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0113 }
            r5 = 0
            cy3.C58003b.m67160a(r14, r5)     // Catch:{ Exception -> 0x011c }
            goto L_0x0123
        L_0x0113:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            r10 = r0
            cy3.C58003b.m67160a(r14, r5)     // Catch:{ Exception -> 0x011c }
            throw r10     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r10 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r10)
        L_0x0123:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[queryAll] COST="
            r0.append(r5)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r7
            r0.append(r10)
            java.lang.String r5 = "ms"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            int r0 = r9.size()
            com.tencent.mm.plugin.finder.extension.reddot.w r6 = r1.f158524a
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_REDDOT_DELETE_DUP_VERSION_INT_SYNC
            java.lang.String r8 = "storage"
            gy3.C87412m.m108594g(r6, r8)
            int r10 = r9.size()
            r11 = 100
            if (r10 <= r11) goto L_0x017a
            com.tencent.mm.autogen.mmdata.rpt.FinderExceptionDetectStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.FinderExceptionDetectStruct
            r11.<init>()
            java.lang.String r12 = "InnerVersion"
            java.lang.String r13 = "1"
            r14 = 1
            java.lang.String r12 = r11.mo86045b(r12, r13, r14)
            r11.f155198d = r12
            r12 = 10001(0x2711, double:4.941E-320)
            r11.f155199e = r12
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "exceptionValue"
            java.lang.String r10 = r11.mo86045b(r12, r10, r14)
            r11.f155200f = r10
            r11.mo86054n()
        L_0x017a:
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            r11 = 0
            int r10 = r10.mo119689j(r7, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[check] dbDuplicateDeletedVersion="
            r11.append(r12)
            r11.append(r10)
            r12 = 32
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Finder.RedDotDuplicateChecker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            java.lang.String r11 = ", "
            r13 = 1
            if (r10 >= r13) goto L_0x0273
            long r13 = java.lang.System.currentTimeMillis()
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            java.util.Iterator r15 = r9.iterator()
        L_0x01b4:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x01fa
            java.lang.Object r17 = r15.next()
            r18 = r15
            r15 = r17
            com.tencent.mm.plugin.finder.extension.reddot.s0 r15 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r15
            r19 = r3
            te3.xi1 r3 = r15.field_ctrInfo
            int r3 = r3.f144670e
            java.lang.Object r4 = r10.get(r3)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r4
            if (r4 != 0) goto L_0x01da
            r10.put(r3, r15)
            r17 = r0
            r21 = r5
            goto L_0x01ef
        L_0x01da:
            r17 = r0
            long r0 = r15.field_time
            r21 = r5
            long r4 = r4.field_time
            int r22 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r22 <= 0) goto L_0x01ef
            boolean r0 = r15.mo77310q2()
            if (r0 != 0) goto L_0x01ef
            r10.put(r3, r15)
        L_0x01ef:
            r1 = r30
            r0 = r17
            r15 = r18
            r3 = r19
            r5 = r21
            goto L_0x01b4
        L_0x01fa:
            r17 = r0
            r19 = r3
            r21 = r5
            r9.clear()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r6.f158597d
            java.lang.String r1 = "FinderRedDotInfo"
            java.lang.String r3 = "delete from FinderRedDotInfo"
            r0.execSQL(r1, r3)
            int r0 = r10.size()
            r1 = 0
        L_0x0211:
            if (r1 >= r0) goto L_0x0243
            int r3 = r10.keyAt(r1)
            java.lang.Object r4 = r10.get(r3)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = " key "
            r5.append(r15)
            r5.append(r3)
            r5.append(r11)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            r3 = 1
            if (r4 == 0) goto L_0x0240
            r4.mo77314v2(r6, r3)
            r9.add(r4)
        L_0x0240:
            int r1 = r1 + 1
            goto L_0x0211
        L_0x0243:
            r3 = 1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.mo119677K(r7, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[check] COST="
            r0.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r13
            r0.append(r3)
            r1 = r21
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r0 = 1
            goto L_0x0278
        L_0x0273:
            r17 = r0
            r19 = r3
            r0 = 0
        L_0x0278:
            int r1 = r9.size()
            java.util.HashSet<java.lang.Integer> r3 = com.tencent.p014mm.plugin.finder.extension.reddot.C2482o.f12983a
            r3 = r30
            com.tencent.mm.plugin.finder.extension.reddot.w r4 = r3.f158524a
            gy3.C87412m.m108594g(r4, r8)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_REDDOT_MULTI_USERNAME_UPDATE_BOOLEAN_SYNC
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r4.mo119685f(r5, r6)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r4, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "check isUpdate:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " username: "
            r6.append(r4)
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90658I1()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            java.util.Iterator r4 = r9.iterator()
        L_0x02c6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02fc
            java.lang.Object r6 = r4.next()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r6
            java.util.HashSet<java.lang.Integer> r7 = com.tencent.p014mm.plugin.finder.extension.reddot.C2482o.f12983a
            te3.xi1 r8 = r6.field_ctrInfo
            int r8 = r8.f144670e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x02c6
            te3.xi1 r7 = r6.field_ctrInfo
            java.lang.String r7 = r7.f144679q
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x02c6
            te3.xi1 r7 = r6.field_ctrInfo
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90658I1()
            r7.f144679q = r8
            te3.xi1 r6 = r6.field_ctrInfo
            r7 = 1
            r6.f144688z = r7
            goto L_0x02c6
        L_0x02fc:
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.g r6 = r4.mo75316W2()
            java.util.concurrent.CopyOnWriteArraySet<ad1.c> r6 = r6.f152702g
            com.tencent.mm.plugin.finder.extension.reddot.n r7 = new com.tencent.mm.plugin.finder.extension.reddot.n
            r7.<init>()
            r6.add(r7)
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC
            r8 = 0
            int r6 = r6.mo119689j(r7, r8)
            bd1.c r7 = new bd1.c
            java.lang.String r8 = r4.mo90658I1()
            if (r8 != 0) goto L_0x0324
            r8 = r2
        L_0x0324:
            r7.<init>(r8)
            r7.field_systemMsgCount = r6
            bd1.i r6 = bd1.C39759i.SYS_MSG_COUNT
            r4.mo90672m1(r7, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[prepare] checkRet="
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = " beforeCheckCount="
            r4.append(r0)
            r0 = r17
            r4.append(r0)
            java.lang.String r0 = " afterCheckCount="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "Finder.RedDotManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0445 }
            java.util.Iterator r0 = r9.iterator()     // Catch:{ all -> 0x0445 }
        L_0x035c:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0445 }
            if (r4 == 0) goto L_0x043e
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0445 }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r4     // Catch:{ all -> 0x0445 }
            te3.xi1 r6 = r4.field_ctrInfo     // Catch:{ all -> 0x0445 }
            java.util.LinkedList<te3.nn1> r6 = r6.f144672g     // Catch:{ all -> 0x0445 }
            java.lang.String r7 = "field_ctrInfo.show_infos"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x0445 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0445 }
            r7 = 0
        L_0x0376:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0445 }
            if (r8 == 0) goto L_0x039c
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0445 }
            te3.nn1 r8 = (te3.C64586nn1) r8     // Catch:{ all -> 0x0445 }
            java.lang.String r8 = r8.f184521z     // Catch:{ all -> 0x0445 }
            if (r8 == 0) goto L_0x0391
            int r8 = r8.length()     // Catch:{ all -> 0x0445 }
            if (r8 != 0) goto L_0x038d
            goto L_0x0391
        L_0x038d:
            r8 = 1
            r16 = 0
            goto L_0x0394
        L_0x0391:
            r8 = 1
            r16 = 1
        L_0x0394:
            r9 = r16 ^ 1
            if (r9 == 0) goto L_0x0399
            goto L_0x039e
        L_0x0399:
            int r7 = r7 + 1
            goto L_0x0376
        L_0x039c:
            r8 = 1
            r7 = -1
        L_0x039e:
            if (r7 < 0) goto L_0x03a2
            r6 = 1
            goto L_0x03a3
        L_0x03a2:
            r6 = 0
        L_0x03a3:
            if (r6 == 0) goto L_0x03d1
            te3.xi1 r6 = r4.field_ctrInfo     // Catch:{ all -> 0x0445 }
            java.lang.String r6 = r6.f144679q     // Catch:{ all -> 0x0445 }
            if (r6 == 0) goto L_0x03b4
            int r6 = r6.length()     // Catch:{ all -> 0x0445 }
            if (r6 != 0) goto L_0x03b2
            goto L_0x03b4
        L_0x03b2:
            r6 = 0
            goto L_0x03b5
        L_0x03b4:
            r6 = 1
        L_0x03b5:
            if (r6 == 0) goto L_0x03d1
            ft1.a r21 = ft1.C59319a.f169618b     // Catch:{ all -> 0x0445 }
            java.lang.String r22 = "reddot_username_error"
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$x r6 = new com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$x     // Catch:{ all -> 0x0445 }
            r6.<init>(r4)     // Catch:{ all -> 0x0445 }
            r28 = 20
            r29 = 0
            r27 = r6
            o40.C11348f.C11349a.m11178b(r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0445 }
        L_0x03d1:
            boolean r6 = r4.mo77310q2()     // Catch:{ all -> 0x0445 }
            if (r6 == 0) goto L_0x03f3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0445 }
            r6.<init>()     // Catch:{ all -> 0x0445 }
            java.lang.String r7 = "[prepare] showInfo is empty! "
            r6.append(r7)     // Catch:{ all -> 0x0445 }
            r6.append(r4)     // Catch:{ all -> 0x0445 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0445 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)     // Catch:{ all -> 0x0445 }
            com.tencent.mm.plugin.finder.extension.reddot.w r6 = r3.f158524a     // Catch:{ all -> 0x0445 }
            r7 = 0
            r4.mo77307n2(r6, r7)     // Catch:{ all -> 0x0445 }
            goto L_0x035c
        L_0x03f3:
            long r6 = r4.field_expiredTime     // Catch:{ all -> 0x0445 }
            r9 = 0
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x040c
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r9
            long r9 = r4.field_time     // Catch:{ all -> 0x0445 }
            long r6 = r6 + r9
            long r9 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x0445 }
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x040c
            r6 = 1
            goto L_0x040d
        L_0x040c:
            r6 = 0
        L_0x040d:
            if (r6 == 0) goto L_0x042b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0445 }
            r6.<init>()     // Catch:{ all -> 0x0445 }
            java.lang.String r7 = "[prepare] isExpired! "
            r6.append(r7)     // Catch:{ all -> 0x0445 }
            r6.append(r4)     // Catch:{ all -> 0x0445 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0445 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)     // Catch:{ all -> 0x0445 }
            com.tencent.mm.plugin.finder.extension.reddot.w r6 = r3.f158524a     // Catch:{ all -> 0x0445 }
            r7 = 0
            r4.mo77307n2(r6, r7)     // Catch:{ all -> 0x0445 }
            goto L_0x035c
        L_0x042b:
            te3.xi1 r6 = r4.field_ctrInfo     // Catch:{ all -> 0x0445 }
            java.lang.String r7 = "it.field_ctrInfo"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x0445 }
            long r9 = r4.field_aiScene     // Catch:{ all -> 0x0445 }
            r4.mo77305l2(r6, r9)     // Catch:{ all -> 0x0445 }
            java.lang.String r6 = "prepare"
            r3.mo77255a(r4, r6)     // Catch:{ all -> 0x0445 }
            goto L_0x035c
        L_0x043e:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0445 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0445 }
            goto L_0x0450
        L_0x0445:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0450:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x045c
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)
        L_0x045c:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$entryConfigChangeListener$1 r0 = r3.f158534k
            r0.alive()
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$notifyTabTipsListener$1 r0 = r3.f158535l
            r0.alive()
            com.tencent.mm.plugin.finder.extension.reddot.p r0 = r3.f158527d
            r0.getClass()
            java.lang.Class<nv.g> r2 = p626nv.C109759g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            nv.g r2 = (p626nv.C109759g) r2
            nv.h r2 = r2.mo161000Hn()
            com.tencent.mm.plugin.newtips.model.p r2 = (com.tencent.p014mm.plugin.newtips.model.C57150p) r2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.newtips.model.g> r2 = r2.f163781a
            java.lang.String r4 = "FinderNewTipsTransform"
            r2.put(r4, r0)
            com.tencent.mm.plugin.finder.extension.reddot.p0 r0 = r3.f158525b
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r0.f12996a
            java.lang.String r4 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r2.mo77227G5(r4)
            java.lang.String r6 = "Finder.RedDotTransform"
            r7 = 2
            if (r2 == 0) goto L_0x04ca
            te3.xi1 r8 = r2.field_ctrInfo
            int r8 = r8.f144670e
            r9 = -1
            if (r8 != r9) goto L_0x04ca
            te3.nn1 r2 = r2.mo77308o2(r4)
            if (r2 == 0) goto L_0x04a3
            int r2 = r2.f184506h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x04a4
        L_0x04a3:
            r2 = 0
        L_0x04a4:
            if (r2 != 0) goto L_0x04a7
            goto L_0x04ca
        L_0x04a7:
            int r2 = r2.intValue()
            if (r2 != r7) goto L_0x04ca
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r0.f12996a
            r4 = -1
            r8 = 0
            ht1.C60152b4.C8759a.m8562b(r2, r4, r8, r7, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "[checkPostRedDot] has old post red dot, ret="
            r4.append(r8)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x04ca:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r0.f12996a
            r4 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            ht1.C60152b4.C8759a.m8562b(r2, r4, r8, r7, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "[checkPostRedDot] has old fav red dot, ret="
            r4.append(r8)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.f12996a
            java.lang.String r4 = "manager"
            gy3.C87412m.m108594g(r0, r4)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_POSTER_CENTER_REDDOT_CLEAR_BOOLEAN_SYNC
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r4.mo119685f(r6, r8)
            gy3.C87412m.m108592e(r4, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x053e
            r4 = 1000(0x3e8, float:1.401E-42)
            r5 = 0
            ht1.C60152b4.C8759a.m8562b(r0, r4, r5, r7, r5)
            r4 = 1019(0x3fb, float:1.428E-42)
            ht1.C60152b4.C8759a.m8562b(r0, r4, r5, r7, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "clearOldVersionRedDot "
            r0.append(r4)
            r0.append(r2)
            r0.append(r11)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.FinderPosterCenterUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r6, r2)
        L_0x053e:
            r0 = 1005(0x3ed, float:1.408E-42)
            r2 = 0
            ht1.C60152b4.C8759a.m8562b(r3, r0, r2, r7, r2)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler r0 = new com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler
            r0.<init>(r3)
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1 r2 = r0.f158521f
            r2.alive()
            com.tencent.mm.plugin.finder.extension.reddot.g0 r2 = new com.tencent.mm.plugin.finder.extension.reddot.g0
            r2.<init>(r0)
            o40.C61926c.m72668M(r2)
            r10 = 0
            r11 = 0
            r13 = 6
            r14 = 0
            java.lang.String r9 = "setup"
            r8 = r0
            com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler.m63314a(r8, r9, r10, r11, r13, r14)
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            r2.mo174208a(r0)
            r3.f158531h = r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger r0 = r3.f158529f
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent> r2 = r0.f158563b
            r2.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent> r0 = r0.f158564c
            r0.alive()
            java.util.LinkedList<hf1.b> r0 = r3.f158532i
            hf1.a r2 = new hf1.a
            r2.<init>(r3)
            r0.add(r2)
            java.util.LinkedList<hf1.b> r0 = r3.f158532i
            hf1.d r2 = new hf1.d
            r2.<init>()
            r0.add(r2)
            java.util.LinkedList<hf1.b> r0 = r3.f158532i
            hf1.f r2 = new hf1.f
            r2.<init>(r3)
            r0.add(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[prepare] "
            r0.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r19
            r0.append(r4)
            java.lang.String r2 = "ms hashCode="
            r0.append(r2)
            int r2 = r30.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77228H():void");
    }

    /* renamed from: H5 */
    public boolean mo77229H5() {
        return ((C66446g) C86312j.m106911c(C66446g.class)).mo61606KB();
    }

    /* renamed from: I */
    public final void mo77230I(C51978xi1 xi12, String str, C32226l<? super C55718s0, C13598b0> lVar) {
        C51978xi1 xi13 = xi12;
        String str2 = str;
        C87412m.m108594g(xi13, ImagesContract.LOCAL);
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        int i = xi13.f144670e;
        String str3 = xi13.f144679q;
        if (str3 == null) {
            str3 = "";
        }
        C13604l<C55718s0, C64586nn1> J = mo77232J(xi12);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f158543t.entrySet()) {
            synchronized (next.getValue()) {
                String str4 = (String) next.getKey();
                Iterator it = ((List) next.getValue()).iterator();
                while (it.hasNext()) {
                    C55718s0 s0Var = (C55718s0) it.next();
                    if (s0Var.field_ctrInfo.f144670e == i && mo77274n(str3, s0Var)) {
                        LinkedList linkedList = (LinkedList) hashMap.get(str4);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            hashMap.put(str4, linkedList);
                        }
                        linkedList.add(s0Var);
                        it.remove();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        if (!hashMap.isEmpty()) {
            Log.m105924i("Finder.RedDotManager", "[reBuildPathWithCtrInfo] type=" + i + " clearMap=" + hashMap + " source=" + str2);
        }
        for (Map.Entry value : hashMap.entrySet()) {
            for (C55718s0 n2 : (Iterable) value.getValue()) {
                C55724w wVar = this.f158524a;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C55718s0.f158582G;
                n2.mo77307n2(wVar, true);
            }
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = hashSet;
        C60152b4.C8759a.m8561a(this, xi12, str, hashSet, false, J, lVar, 0, false, 192, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!hashSet2.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str5 = (String) entry2.getKey();
            for (C55718s0 n25 : (Iterable) entry2.getValue()) {
                C55724w wVar2 = this.f158524a;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C55718s0.f158582G;
                n25.mo77307n2(wVar2, true);
            }
            C13598b0 b0Var2 = null;
            String str6 = xi13.f144679q;
            String str7 = str6 == null ? "" : str6;
            C55718s0 i2 = mo77269i(str5, str6);
            if (i2 != null) {
                C64586nn1 o2 = i2.mo77308o2(str5);
                if (o2 != null) {
                    C2479n0 n0Var = C2479n0.f12955a;
                    String str8 = str5;
                    n0Var.mo2449e(false, str8, (C64586nn1) null, (C55718s0) null, str7);
                    C2479n0.m2356f(n0Var, true, str8, o2, i2, (String) null, 16, (Object) null);
                } else {
                    C2479n0.f12955a.mo2449e(false, str5, (C64586nn1) null, (C55718s0) null, str7);
                }
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                C2479n0.f12955a.mo2449e(false, str5, (C64586nn1) null, (C55718s0) null, str7);
            }
        }
    }

    /* renamed from: I5 */
    public void mo77231I5() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC;
        if (!i.mo119686g(aVar, false)) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            C51978xi1 xi12 = new C51978xi1();
            xi12.f144673h = String.valueOf(C31543z5.m39453c());
            xi12.f144669d = 0;
            xi12.f144670e = 1018;
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184502d = 1;
            nn12.f184506h = 1;
            nn12.f184507i = "TLPersonalCenter";
            xi12.f144672g.add(nn12);
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184502d = 1;
            nn13.f184506h = 1;
            nn13.f184507i = "FinderPosterEntrance";
            xi12.f144672g.add(nn13);
            C64586nn1 nn14 = new C64586nn1();
            nn14.f184502d = 1;
            nn14.f184506h = 1;
            nn14.f184507i = "FinderLiveIncomeEntrance";
            nn14.f184508j = "TLPersonalCenter";
            xi12.f144672g.add(nn14);
            C60152b4.C8759a.m8561a(this, xi12, "notifyFinderLiveFirstReward", (HashSet) null, false, (C13604l) null, (C32226l) null, 0, false, 252, (Object) null);
            Log.m105924i("Finder.RedDotManager", "notifyFinderLiveFirstReward");
        }
    }

    /* renamed from: J */
    public final C13604l<C55718s0, C64586nn1> mo77232J(C51978xi1 xi12) {
        C87412m.m108594g(xi12, "ctrlInfo");
        LinkedList<C64586nn1> linkedList = xi12.f144672g;
        if (linkedList == null) {
            return null;
        }
        for (C64586nn1 nn12 : linkedList) {
            if (C87412m.m108589b(nn12.f184507i, "FinderEntrance")) {
                String str = xi12.f144679q;
                if (str == null) {
                    str = "";
                }
                C55718s0 i = mo77269i("FinderEntrance", str);
                if (i != null) {
                    return new C13604l<>(i, i.mo77308o2("FinderEntrance"));
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: J5 */
    public void mo77233J5(int i) {
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144674i = 3600;
        xi12.f144669d = 400000;
        xi12.f144686x = -4758357817339078452L;
        xi12.f144670e = 10;
        xi12.f144677o = false;
        LinkedList<C64586nn1> linkedList = xi12.f144672g;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 3;
        nn12.f184504f = "test_title_v5";
        nn12.f184503e = 0;
        nn12.f184505g = "";
        nn12.f184507i = "FinderEntrance";
        nn12.f184506h = 1;
        nn12.f184509n = 1;
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
        finderTipsShowEntranceExtInfo.object_id = -4758357817339078452L;
        finderTipsShowEntranceExtInfo.report_ext_info = "eyJzaG93X3R5cGUiOjMsInR5cGUiOjEwLCJ0b3BpY19pZCI6IjEzNjM1NDcxODEyMTUzNzcyMDY4IiwiZW50ZXJfYWN0aW9uIjo4LCJyZXF1ZXN0X2lkIjoxNjM0MjIyNjg4NDk3NjYxLCJmaW5kZXJfdXNlcm5hbWUiOiIifQ==";
        nn12.f184510o = new C89349b(finderTipsShowEntranceExtInfo.toByteArray());
        linkedList.add(nn12);
        xi12.f144673h = "tipsid_1634133544815022";
        C64858yi1 yi12 = new C64858yi1();
        yi12.f186555p = i;
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        finderJumpInfo.jumpinfo_type = 3;
        NativeInfo nativeInfo = new NativeInfo();
        nativeInfo.native_type = 8;
        nativeInfo.necessary_params = "{\"topic_id\": \"13635471812153772068\"; \"by_pass_info\": \"test\"}";
        finderJumpInfo.native_info = nativeInfo;
        yi12.f186539A = finderJumpInfo;
        xi12.f144671f = new C89349b(yi12.toByteArray());
        C60152b4.C8759a.m8561a(this, xi12, "mockTopicRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
    }

    /* renamed from: K */
    public final void mo77234K(C55718s0 s0Var) {
        C55718s0 s0Var2 = s0Var;
        C87412m.m108594g(s0Var2, ImagesContract.LOCAL);
        Log.m105924i("Finder.RedDotManager", "refreshMessageCount");
        C64586nn1 o2 = s0Var2.mo77308o2("TLPersonalCenter");
        C64586nn1 o25 = s0Var2.mo77308o2("FinderMentionEntrance");
        C64586nn1 o26 = s0Var2.mo77308o2("Discovery");
        if (o2 != null || o25 != null || o26 != null) {
            if (Util.isNullOrNil(s0Var2.field_username)) {
                C66785b.f191882e.mo90662O5();
            }
            C64586nn1 o27 = s0Var2.mo77308o2("AuthorProfileNotify");
            C64586nn1 o28 = s0Var2.mo77308o2("finder_private_msg_entrance");
            C64586nn1 o29 = s0Var2.mo77308o2("WxMessageEntry");
            C64586nn1 o210 = s0Var2.mo77308o2("finder_wx_private_msg_entrance");
            int i = 0;
            int i2 = o27 != null ? o27.f184503e : 0;
            int i3 = o28 != null ? o28.f184503e : 0;
            int i4 = o29 != null && o29.f184502d == 2 ? o29.f184503e : 0;
            if (o210 != null) {
                i = o210.f184503e;
            }
            int i5 = i2 + i3 + i + i4;
            Log.m105924i("Finder.RedDotManager", "refreshMessageCount totalCount:" + i5 + " finderMessageCount:" + i2 + " messageCount:" + i3 + " wxMessageCount:" + i4 + " wxPrivateCount:" + i + " personalCenterShowInfo" + o2 + " finderEntryShowInfo:" + o25 + " discovery:" + o26);
            if (o2 != null && o2.f184502d == 2) {
                o2.f184503e = i5;
                if (o27 != null) {
                    o27.f184508j = "TLPersonalCenter";
                }
                if (o29 != null) {
                    o29.f184508j = "TLPersonalCenter";
                }
                if (o28 != null) {
                    o28.f184508j = "TLPersonalCenter";
                }
                if (o210 != null) {
                    o210.f184508j = "TLPersonalCenter";
                }
            }
            if (o25 != null) {
                o25.f184503e = i5;
            }
            if (o26 != null) {
                o26.f184503e = i5;
            }
        }
    }

    /* renamed from: K5 */
    public boolean mo77235K5() {
        return ((C66446g) C86312j.m106911c(C66446g.class)).e50();
    }

    /* renamed from: L */
    public final void mo77236L(C51978xi1 xi12, List<String> list) {
        Iterator<C64586nn1> it = xi12.f144672g.iterator();
        C87412m.m108593f(it, "ctrlInfo.show_infos.iterator()");
        while (it.hasNext()) {
            C64586nn1 next = it.next();
            if (next != null && C110818d0.m150903D(list, next.f184507i)) {
                it.remove();
            }
        }
    }

    /* renamed from: L5 */
    public C46114r3 mo77237L5() {
        return this.f158526c;
    }

    /* renamed from: M */
    public final void mo77238M(C50137kj1 kj12) {
        String str;
        C64586nn1 nn12;
        String str2;
        C50137kj1 kj13 = kj12;
        C87412m.m108594g(kj13, "revoke");
        StringBuilder sb = new StringBuilder();
        sb.append("[revokePathRedDot] ");
        LinkedList<C50272lj1> linkedList = kj13.f136819d;
        C87412m.m108593f(linkedList, "revoke.revoke_ctrl_info");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C50272lj1 lj12 : linkedList) {
            arrayList.add(lj12.f137454d + '_' + lj12.f137455e + '_' + lj12.f137456f);
        }
        sb.append(arrayList);
        Log.m105924i("Finder.RedDotManager", sb.toString());
        LinkedList<C50272lj1> linkedList2 = kj13.f136819d;
        C87412m.m108593f(linkedList2, "revoke.revoke_ctrl_info");
        for (C50272lj1 lj13 : linkedList2) {
            String str3 = "";
            if (lj13 == null || (str = lj13.f137454d) == null) {
                str = str3;
            }
            C55718s0 G5 = mo77227G5(str);
            if (G5 != null) {
                if (lj13 == null || (str2 = lj13.f137454d) == null) {
                    str2 = str3;
                }
                nn12 = G5.mo77308o2(str2);
            } else {
                nn12 = null;
            }
            C64586nn1 nn13 = nn12;
            int i = lj13.f137455e;
            if (i == 0) {
                if (nn13 != null) {
                    C58413v0.m67782j(C58413v0.f167346a, G5, nn13, 1, i, (String) null, (String) null, 48, (Object) null);
                } else {
                    C115669n.INSTANCE.mo160131h(20951, 0, 0, 3, str3, lj13.f137454d, Integer.valueOf(lj13.f137455e), str3);
                }
                String str4 = lj13.f137454d;
                if (str4 == null) {
                    str4 = str3;
                }
                mo77263e(str4, "revokePathRedDot#0");
                String str5 = lj13.f137454d;
                if (str5 != null) {
                    str3 = str5;
                }
                mo77239M5(str3);
            } else if (i == 1) {
                LinkedList<String> linkedList3 = lj13.f137456f;
                C87412m.m108593f(linkedList3, "it.tips_id_list");
                String str6 = str3;
                for (String str7 : linkedList3) {
                    str6 = str6 + str7 + ';';
                }
                C112550d0.m153777M(str6, ";");
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = true;
                C8477a0 a0Var2 = new C8477a0();
                String str8 = lj13.f137454d;
                if (str8 == null) {
                    str8 = str3;
                }
                C60152b4.C8759a.m8563c(this, str8, new C41407y(lj13, a0Var, a0Var2, this), false, (String) null, 12, (Object) null);
                Log.m105924i("Finder.RedDotManager", "[revokePathRedDot] isHasDisposed=" + a0Var2.f27482d + " isAllDisposed=" + a0Var.f27482d + " tipsList=" + str6);
                boolean z = a0Var2.f27482d;
                if (!z || !a0Var.f27482d) {
                    String str9 = str6;
                    if (z && !a0Var.f27482d) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        C58739j4 j4Var = C58739j4.f168176a;
                        if (!(G5 == null || nn13 == null)) {
                            C58413v0.m67782j(C58413v0.f167346a, G5, nn13, 2, lj13.f137455e, str9, (String) null, 32, (Object) null);
                        }
                    } else if (!z) {
                        C58784w3 w3Var2 = C58784w3.f168295a;
                        C58739j4 j4Var2 = C58739j4.f168176a;
                        if (!(G5 == null || nn13 == null)) {
                            C58413v0.m67782j(C58413v0.f167346a, G5, nn13, 4, lj13.f137455e, str9, (String) null, 32, (Object) null);
                        }
                    }
                } else {
                    C58784w3 w3Var3 = C58784w3.f168295a;
                    C58739j4 j4Var3 = C58739j4.f168176a;
                    if (!(G5 == null || nn13 == null)) {
                        C58413v0.m67782j(C58413v0.f167346a, G5, nn13, 1, lj13.f137455e, str6, (String) null, 32, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: M5 */
    public void mo77239M5(String str) {
        C87412m.m108594g(str, "path");
        mo77272l(str, (int[]) null);
    }

    /* renamed from: N */
    public final void mo77240N(C50411mj1 mj12) {
        C87412m.m108594g(mj12, "revoke");
        StringBuilder sb = new StringBuilder();
        sb.append("[revokeTabTips] ");
        LinkedList<C50553nj1> linkedList = mj12.f138069d;
        C87412m.m108593f(linkedList, "revoke.revoke_tab_tips_info");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C50553nj1 nj12 : linkedList) {
            arrayList.add(nj12.f138628d);
        }
        sb.append(arrayList);
        Log.m105924i("Finder.RedDotManager", sb.toString());
        C61926c.m72661F("Finder.RedDotManager", new C41408z(mj12, this));
    }

    /* renamed from: N5 */
    public void mo77241N5(int i, String str) {
        C87412m.m108594g(str, "username");
        mo77259c(i, str, C2448h.f12898d);
    }

    /* renamed from: O */
    public final void mo77242O(C55718s0 s0Var) {
        C87412m.m108594g(s0Var, "enterCtrlInfo");
        int t = mo77280t(s0Var);
        String w = mo77283w(t);
        StringBuilder sb = new StringBuilder();
        sb.append("[saveEnterTabTipsExtInfo] tabType=");
        sb.append(t);
        sb.append(" PATH=");
        sb.append(w);
        sb.append(" ctrlType=");
        sb.append(s0Var.field_ctrInfo.f144670e);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(s0Var.f158585F.f186549g));
        sb.append("bubbleId=");
        C48883bn1 bn12 = s0Var.f158585F.f186542D;
        sb.append(C61926c.m72691p(bn12 != null ? bn12.f131217g : 0));
        sb.append("showBubbleType=");
        C48883bn1 bn13 = s0Var.f158585F.f186542D;
        C48883bn1 bn14 = null;
        sb.append(bn13 != null ? Integer.valueOf(bn13.f131214d) : null);
        Log.m105924i("Finder.RedDotManager", sb.toString());
        ConcurrentHashMap<String, C29940a> concurrentHashMap = this.f158547x;
        C64858yi1 yi12 = s0Var.f158585F;
        String str = s0Var.field_tipsId;
        C87412m.m108593f(str, "enterCtrlInfo.field_tipsId");
        concurrentHashMap.put(w, new C29940a(yi12, str));
        C48883bn1 bn15 = s0Var.f158585F.f186542D;
        if (bn15 != null) {
            if (bn15.f131214d > 0) {
                bn14 = bn15;
            }
            if (bn14 != null) {
                int i = 3;
                String w2 = mo77283w(bn14.f131214d == 1 ? 1 : 3);
                ConcurrentHashMap<String, C29940a> concurrentHashMap2 = this.f158547x;
                C64858yi1 yi13 = new C64858yi1();
                yi13.f186549g = bn14.f131217g;
                C64858yi1 yi14 = s0Var.f158585F;
                String str2 = yi14.f186547e;
                if (str2 == null) {
                    str2 = "";
                }
                yi13.f186547e = str2;
                yi13.f186553n = yi14.f186553n;
                String str3 = s0Var.field_tipsId;
                C87412m.m108593f(str3, "enterCtrlInfo.field_tipsId");
                concurrentHashMap2.put(w2, new C29940a(yi13, str3));
                C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class);
                C87412m.m108593f(a, "UICProvider.of(FinderCom…bPreloadCore::class.java)");
                FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) a;
                if (bn14.f131214d == 1) {
                    i = 1;
                }
                C58341h f3 = finderStreamTabPreloadCore.mo78457f3(i);
                if (f3 != null) {
                    f3.mo83089e(true, "BubbleShow");
                }
            }
        }
    }

    /* renamed from: O5 */
    public List<C55718s0> mo77243O5(String str, C32226l<? super C55718s0, Boolean> lVar, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(lVar, "filter");
        C87412m.m108594g(str2, "finderUserName");
        HashSet hashSet = new HashSet();
        for (Map.Entry next : this.f158543t.entrySet()) {
            synchronized (next.getValue()) {
                for (C55718s0 s0Var : (List) next.getValue()) {
                    if (lVar.invoke(s0Var).booleanValue() && mo77274n(str2, s0Var) && s0Var.mo77308o2(str) != null) {
                        hashSet.add(s0Var);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        return C110818d0.m150953y0(hashSet);
    }

    /* renamed from: P5 */
    public void mo77244P5(String str) {
        C87412m.m108594g(str, "groupId");
        ArrayList<C55718s0> arrayList = new ArrayList<>();
        for (Map.Entry<String, List<C55718s0>> value : this.f158543t.entrySet()) {
            Iterable<C55718s0> iterable = (Iterable) value.getValue();
            synchronized (iterable) {
                for (C55718s0 s0Var : iterable) {
                    if (C87412m.m108589b(s0Var.field_ctrInfo.f144683u, str)) {
                        arrayList.add(s0Var);
                    }
                }
            }
        }
        for (C55718s0 d : arrayList) {
            mo77261d(d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fc  */
    /* renamed from: Q5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.Object> mo77245Q5(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r1 = "prefix"
            gy3.C87412m.m108594g(r13, r1)
            java.lang.String r1 = "suffix"
            gy3.C87412m.m108594g(r14, r1)
            java.lang.String r1 = "localConfig"
            gy3.C87412m.m108594g(r15, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r11.mo77227G5(r12)
            if (r2 != 0) goto L_0x0021
            return r1
        L_0x0021:
            te3.nn1 r12 = r2.mo77308o2(r12)
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r3 = r2.field_tipsShowEntranceExtInfo
            java.lang.String r4 = r3.report_ext_info
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0046
            r5 = 0
            byte[] r4 = android.util.Base64.decode(r4, r5)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r5 = "decode(reportExtInfo, Base64.DEFAULT)"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0046 }
            java.nio.charset.Charset r6 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0046 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x0046 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0046 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004b
        L_0x0046:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L_0x004b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = "tipsid"
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r2.field_tipsId
            java.lang.String r7 = "ctrInfo.field_tipsId"
            gy3.C87412m.m108593f(r6, r7)
            r1.put(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = "ctrltype"
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            int r2 = r2.field_ctrType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = ""
            if (r12 == 0) goto L_0x00a1
            java.lang.String r12 = r12.f184507i
            if (r12 != 0) goto L_0x00a2
        L_0x00a1:
            r12 = r2
        L_0x00a2:
            r1.put(r0, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            java.lang.String r0 = "feedid"
            r12.append(r0)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            long r5 = r3.object_id
            java.lang.String r0 = o40.C61926c.m72691p(r5)
            r1.put(r12, r0)
            java.lang.Class<h81.h> r12 = h81.C32735h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_finder_reddot_ext_report_params
            java.lang.String r12 = r12.Y60(r0, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 != 0) goto L_0x00e5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r12)
            java.lang.String r15 = r0.toString()
        L_0x00e5:
            r5 = r15
            java.lang.String r12 = ";"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r12 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)
            boolean r15 = r12.isEmpty()
            r15 = r15 ^ 1
            if (r15 == 0) goto L_0x012e
            java.util.Iterator r12 = r12.iterator()
        L_0x0100:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x012e
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = r4.opt(r15)
            if (r0 == 0) goto L_0x0100
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r15)
            r2.append(r14)
            java.lang.String r15 = r2.toString()
            r1.put(r15, r0)
            goto L_0x0100
        L_0x012e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77245Q5(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.HashMap");
    }

    /* renamed from: R5 */
    public C64586nn1 mo77246R5(String str) {
        C87412m.m108594g(str, "path");
        return mo77285y(str, C66785b.f191882e.mo90662O5());
    }

    /* renamed from: S5 */
    public int mo77247S5() {
        long currentTimeMillis = System.currentTimeMillis();
        C55718s0 G5 = mo77227G5("FinderEntrance");
        if ((G5 != null ? G5.mo77308o2("FinderEntrance") : null) == null) {
            return 0;
        }
        int i = G5.f158585F.f186559t;
        Log.m105924i("Finder.RedDotManager", "[getAliveTabType] cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms enterAction :" + i);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        if (r5 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b2  */
    /* renamed from: T5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 mo77248T5(te3.C51978xi1 r27, java.lang.String r28, java.util.HashSet<java.lang.String> r29, boolean r30, rx3.C13604l<com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0, ? extends te3.C64586nn1> r31, fy3.C32226l<? super com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0, rx3.C13598b0> r32, long r33, boolean r35) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r31
            r12 = r32
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "changePathSet"
            gy3.C87412m.m108594g(r10, r0)
            r13 = 0
            if (r8 != 0) goto L_0x001b
            return r13
        L_0x001b:
            com.tencent.mm.plugin.finder.extension.reddot.q0 r14 = com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0.f158580a
            java.lang.String r0 = r8.f144679q
            java.lang.String r15 = ""
            if (r0 != 0) goto L_0x0025
            r6 = r15
            goto L_0x0026
        L_0x0025:
            r6 = r0
        L_0x0026:
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<os1.f> r1 = os1.C11739f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            os1.f r0 = (os1.C11739f) r0
            r1 = 4
            os1.f$a r0 = r0.mo11600c3(r1)
            boolean r0 = r0.f34377j
            r5 = 1
            r16 = 0
            if (r0 != 0) goto L_0x0046
            r19 = r6
            goto L_0x00b7
        L_0x0046:
            r3 = 0
            r4 = 1
            r17 = 4
            r18 = 0
            java.lang.String r2 = "TLFollow"
            r0 = r26
            r1 = r27
            r5 = r17
            r19 = r6
            r6 = r18
            boolean r0 = m63315B(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00b9
            r3 = 0
            r4 = 1
            r5 = 4
            r6 = 0
            java.lang.String r2 = "TLRecommendTab"
            r0 = r26
            r1 = r27
            boolean r0 = m63315B(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00b9
            r3 = 0
            r4 = 1
            r5 = 4
            r6 = 0
            java.lang.String r2 = "finder_tl_hot_tab"
            r0 = r26
            r1 = r27
            boolean r0 = m63315B(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007f
            goto L_0x00b9
        L_0x007f:
            r17 = 0
            r18 = 0
            r20 = 8
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 8
            r25 = 0
            r3 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r2 = "TLPersonalCenter"
            r0 = r26
            r1 = r27
            m63315B(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = "FinderEntrance"
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            m63315B(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = "Discovery"
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r21
            m63315B(r0, r1, r2, r3, r4, r5, r6)
        L_0x00b7:
            r5 = 0
            goto L_0x00ba
        L_0x00b9:
            r5 = 1
        L_0x00ba:
            java.lang.String r0 = "Finder.RedDotManager"
            if (r5 == 0) goto L_0x00d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[addNewRedDotCtrlInfo] ignore this reddot "
            r1.append(r2)
            java.lang.String r2 = r14.mo77303e(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return r13
        L_0x00d7:
            if (r11 == 0) goto L_0x00de
            A r1 = r11.f38555d
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r1
            goto L_0x00df
        L_0x00de:
            r1 = r13
        L_0x00df:
            java.util.LinkedList<te3.nn1> r2 = r8.f144672g
            java.lang.String r3 = "show_infos"
            gy3.C87412m.m108593f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00eb:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "FinderEntrance"
            if (r3 == 0) goto L_0x0145
            java.lang.Object r3 = r2.next()
            te3.nn1 r3 = (te3.C64586nn1) r3
            java.lang.String r3 = r3.f184507i
            boolean r3 = gy3.C87412m.m108589b(r4, r3)
            if (r3 == 0) goto L_0x00eb
            r3 = r19
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r7.mo77269i(r4, r3)
            if (r2 == 0) goto L_0x010c
            java.lang.String r5 = r2.field_username
            goto L_0x010d
        L_0x010c:
            r5 = r13
        L_0x010d:
            if (r5 != 0) goto L_0x0110
            r5 = r15
        L_0x0110:
            if (r1 == 0) goto L_0x0115
            java.lang.String r6 = r1.field_username
            goto L_0x0116
        L_0x0115:
            r6 = r13
        L_0x0116:
            if (r6 != 0) goto L_0x0119
            r6 = r15
        L_0x0119:
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0147
            boolean r5 = gy3.C87412m.m108589b(r2, r1)
            if (r5 == 0) goto L_0x0127
        L_0x0125:
            r1 = r2
            goto L_0x0148
        L_0x0127:
            if (r1 == 0) goto L_0x0125
            if (r2 == 0) goto L_0x0141
            te3.xi1 r5 = r2.field_ctrInfo
            int r5 = r5.f144669d
            te3.xi1 r6 = r1.field_ctrInfo
            int r6 = r6.f144669d
            if (r5 < r6) goto L_0x013d
            long r5 = r2.field_time
            long r13 = r1.field_time
            int r18 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r18 >= 0) goto L_0x013e
        L_0x013d:
            r2 = r1
        L_0x013e:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            if (r5 != 0) goto L_0x0125
            goto L_0x0148
        L_0x0145:
            r3 = r19
        L_0x0147:
            r1 = 0
        L_0x0148:
            if (r11 == 0) goto L_0x014f
            A r2 = r11.f38555d
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r2
            goto L_0x0150
        L_0x014f:
            r2 = 0
        L_0x0150:
            boolean r2 = gy3.C87412m.m108589b(r1, r2)
            if (r2 == 0) goto L_0x015d
            if (r11 == 0) goto L_0x0164
            B r2 = r11.f38556e
            te3.nn1 r2 = (te3.C64586nn1) r2
            goto L_0x0165
        L_0x015d:
            if (r1 == 0) goto L_0x0164
            te3.nn1 r2 = r1.mo77308o2(r4)
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            if (r30 == 0) goto L_0x0173
            int r5 = r8.f144670e
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$c r6 = new com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$c
            r11 = r35
            r6.<init>(r11, r7, r3)
            r7.mo77259c(r5, r3, r6)
        L_0x0173:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = new com.tencent.mm.plugin.finder.extension.reddot.s0
            r5.<init>()
            r13 = r33
            r5.mo77305l2(r8, r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.nj1> r6 = r7.f158548y
            java.lang.String r11 = r5.field_revokeId
            if (r11 != 0) goto L_0x0184
            r11 = r15
        L_0x0184:
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x01b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[addNewRedDotCtrlInfo] has revoke. "
            r1.append(r2)
            java.lang.String r2 = r5.field_revokeId
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            com.tencent.mm.plugin.finder.extension.reddot.q0 r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0.f158580a
            te3.xi1 r3 = r5.field_ctrInfo
            java.lang.String r2 = r2.mo77303e(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r0 = 0
            return r0
        L_0x01b2:
            com.tencent.mm.plugin.finder.extension.reddot.b0 r6 = com.tencent.p014mm.plugin.finder.extension.reddot.C55708b0.f158567a
            boolean r11 = r6.mo77293a(r8, r4)
            java.lang.String r13 = "[checkClearDiscoveryRedDot] remove DISCOVERY_TAB"
            java.lang.String r14 = "info.show_infos"
            r18 = r15
            java.lang.String r15 = "Discovery"
            if (r11 == 0) goto L_0x01e3
            boolean r11 = r26.mo77253Y5()
            if (r11 != 0) goto L_0x01d5
            java.util.LinkedList<te3.nn1> r11 = r8.f144672g
            gy3.C87412m.m108593f(r11, r14)
            com.tencent.mm.plugin.finder.extension.reddot.h0 r14 = com.tencent.p014mm.plugin.finder.extension.reddot.C2466h0.f12926d
            o40.C61926c.m72675T(r11, r14)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
        L_0x01d5:
            boolean r6 = r6.mo77293a(r8, r15)
            if (r6 != 0) goto L_0x01e0
            int r6 = r8.f144669d
            r7.mo77286z(r4, r6, r3)
        L_0x01e0:
            r31 = r2
            goto L_0x0234
        L_0x01e3:
            java.lang.String r11 = "FinderLiveEntrance"
            boolean r19 = r6.mo77293a(r8, r11)
            if (r19 == 0) goto L_0x020c
            boolean r19 = r26.mo77235K5()
            r31 = r2
            if (r19 != 0) goto L_0x0200
            java.util.LinkedList<te3.nn1> r2 = r8.f144672g
            gy3.C87412m.m108593f(r2, r14)
            com.tencent.mm.plugin.finder.extension.reddot.i0 r14 = com.tencent.p014mm.plugin.finder.extension.reddot.C2468i0.f12928d
            o40.C61926c.m72675T(r2, r14)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
        L_0x0200:
            boolean r2 = r6.mo77293a(r8, r15)
            if (r2 != 0) goto L_0x0234
            int r2 = r8.f144669d
            r7.mo77286z(r11, r2, r3)
            goto L_0x0234
        L_0x020c:
            r31 = r2
            java.lang.String r2 = "NearbyEntrance"
            boolean r11 = r6.mo77293a(r8, r2)
            if (r11 == 0) goto L_0x0234
            boolean r11 = r26.mo77229H5()
            if (r11 != 0) goto L_0x0229
            java.util.LinkedList<te3.nn1> r11 = r8.f144672g
            gy3.C87412m.m108593f(r11, r14)
            com.tencent.mm.plugin.finder.extension.reddot.j0 r14 = com.tencent.p014mm.plugin.finder.extension.reddot.C2471j0.f12933d
            o40.C61926c.m72675T(r11, r14)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
        L_0x0229:
            boolean r6 = r6.mo77293a(r8, r15)
            if (r6 != 0) goto L_0x0234
            int r6 = r8.f144669d
            r7.mo77286z(r2, r6, r3)
        L_0x0234:
            if (r12 == 0) goto L_0x0239
            r12.invoke(r5)
        L_0x0239:
            com.tencent.mm.plugin.finder.extension.reddot.w r2 = r7.f158524a
            r6 = 1
            boolean r2 = r5.mo77314v2(r2, r6)
            if (r2 == 0) goto L_0x0360
            java.util.HashSet r2 = r7.mo77255a(r5, r9)
            r10.addAll(r2)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r7.mo77269i(r4, r3)
            if (r2 == 0) goto L_0x0259
            te3.nn1 r3 = r2.mo77308o2(r4)
            rx3.l r8 = new rx3.l
            r8.<init>(r2, r3)
            goto L_0x025a
        L_0x0259:
            r8 = 0
        L_0x025a:
            if (r8 == 0) goto L_0x0261
            A r2 = r8.f38555d
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r2
            goto L_0x0262
        L_0x0261:
            r2 = 0
        L_0x0262:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 == 0) goto L_0x026f
            java.lang.String r1 = "path: FinderEntrance is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x02e8
        L_0x026f:
            if (r1 == 0) goto L_0x02e8
            boolean r3 = gy3.C87412m.m108589b(r1, r2)
            if (r3 != 0) goto L_0x02e8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[checkRedDotOverride] "
            r3.append(r4)
            te3.xi1 r4 = r1.field_ctrInfo
            int r4 = r4.f144670e
            r3.append(r4)
            java.lang.String r4 = " show_type:"
            r3.append(r4)
            r4 = r31
            if (r31 == 0) goto L_0x0298
            int r8 = r4.f184502d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0299
        L_0x0298:
            r8 = 0
        L_0x0299:
            r3.append(r8)
            java.lang.String r8 = " field_tipsId: "
            r3.append(r8)
            java.lang.String r8 = r1.field_tipsId
            r3.append(r8)
            java.lang.String r8 = " ctrlInfo.field_tipsId: "
            r3.append(r8)
            if (r2 == 0) goto L_0x02b0
            java.lang.String r8 = r2.field_tipsId
            goto L_0x02b1
        L_0x02b0:
            r8 = 0
        L_0x02b1:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            er1.w3 r0 = er1.C58784w3.f168295a
            er1.j4 r0 = er1.C58739j4.f168176a
            if (r4 == 0) goto L_0x02e8
            dp1.v0 r0 = dp1.C58413v0.f167346a
            r3 = 6
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x02cb
            java.lang.String r13 = r2.field_tipsId
            goto L_0x02cc
        L_0x02cb:
            r13 = 0
        L_0x02cc:
            if (r13 != 0) goto L_0x02d0
            r13 = r18
        L_0x02d0:
            r2 = 24
            r10 = 0
            r27 = r0
            r28 = r1
            r29 = r4
            r30 = r3
            r31 = r8
            r32 = r9
            r33 = r13
            r34 = r2
            r35 = r10
            dp1.C58413v0.m67782j(r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x02e8:
            com.tencent.mm.plugin.finder.extension.reddot.v0 r0 = com.tencent.p014mm.plugin.finder.extension.reddot.C29946v0.f81102a
            java.lang.String r1 = "Finder.ThreeDayTwoDay"
            java.lang.String r2 = "checkRedDotFilter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r2 = r0.mo57021b()
            if (r2 == 0) goto L_0x035f
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_HIT_TIME_LONG_SYNC
            r8 = 0
            long r2 = r2.mo119673G(r3, r8)
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x030c
            goto L_0x035f
        L_0x030c:
            long r8 = eb0.C31543z5.m39453c()
            long r8 = r8 - r2
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99317W2
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r10 = (long) r4
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x0328
            goto L_0x0329
        L_0x0328:
            r6 = 0
        L_0x0329:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[checkInLimitTwoDay] isInLimit="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = " twoDayThreshold="
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = " diffTime="
            r10.append(r4)
            r10.append(r8)
            java.lang.String r4 = " hitThreeDayTime="
            r10.append(r4)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r6 == 0) goto L_0x0358
            goto L_0x035f
        L_0x0358:
            long r1 = eb0.C31543z5.m39453c()
            r0.mo57023d(r1)
        L_0x035f:
            return r5
        L_0x0360:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77248T5(te3.xi1, java.lang.String, java.util.HashSet, boolean, rx3.l, fy3.l, long, boolean):com.tencent.mm.plugin.finder.extension.reddot.s0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x001f A[SYNTHETIC] */
    /* renamed from: U5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77249U5(boolean r22) {
        /*
            r21 = this;
            if (r22 != 0) goto L_0x00da
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r1 = "Finder.RedDotManager"
            java.lang.String r2 = "[removeNearByEntranceShowInfo] #setEnableShowEntranceRedDot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.util.Set r1 = r1.mo77277q()
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00da
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r2
            te3.xi1 r3 = r2.field_ctrInfo
            int r4 = r3.f144670e
            r5 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r6 = "NearbyEntrance"
            r7 = 0
            r8 = 1
            if (r4 == r5) goto L_0x005e
            java.util.LinkedList<te3.nn1> r3 = r3.f144672g
            if (r3 == 0) goto L_0x0059
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = r3.next()
            r5 = r4
            te3.nn1 r5 = (te3.C64586nn1) r5
            java.lang.String r5 = r5.f184507i
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x003f
            goto L_0x0056
        L_0x0055:
            r4 = r7
        L_0x0056:
            te3.nn1 r4 = (te3.C64586nn1) r4
            goto L_0x005a
        L_0x0059:
            r4 = r7
        L_0x005a:
            if (r4 == 0) goto L_0x005e
            r3 = 1
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = r7
        L_0x0063:
            if (r2 == 0) goto L_0x001f
            te3.xi1 r3 = r2.field_ctrInfo
            java.util.LinkedList<te3.nn1> r3 = r3.f144672g
            if (r3 == 0) goto L_0x0070
            if1.b r4 = if1.C8885b.f28152d
            o40.C61926c.m72675T(r3, r4)
        L_0x0070:
            te3.xi1 r3 = r2.field_ctrInfo
            java.util.LinkedList<te3.nn1> r3 = r3.f144672g
            if (r3 == 0) goto L_0x00af
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r3.next()
            r7 = r5
            te3.nn1 r7 = (te3.C64586nn1) r7
            java.lang.String r7 = r7.f184508j
            boolean r7 = gy3.C87412m.m108589b(r7, r6)
            if (r7 == 0) goto L_0x007f
            r4.add(r5)
            goto L_0x007f
        L_0x0098:
            java.util.Iterator r3 = r4.iterator()
        L_0x009c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r3.next()
            te3.nn1 r4 = (te3.C64586nn1) r4
            r4.f184506h = r8
            java.lang.String r5 = ""
            r4.f184508j = r5
            goto L_0x009c
        L_0x00af:
            te3.xi1 r10 = new te3.xi1
            r10.<init>()
            te3.xi1 r2 = r2.field_ctrInfo
            byte[] r2 = r2.toByteArray()
            r10.parseFrom(r2)
            di3.d r2 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r9 = r2.Nt0()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 252(0xfc, float:3.53E-43)
            r20 = 0
            java.lang.String r11 = "removeNearByEntranceShowInfo"
            ht1.C60152b4.C8759a.m8561a(r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            goto L_0x001f
        L_0x00da:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r22)
            r0.mo119677K(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77249U5(boolean):void");
    }

    /* renamed from: V5 */
    public void mo77250V5(C49170dn1 dn12, String str) {
        C87412m.m108594g(dn12, "tabTips");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        mo77225F(dn12, str, 0);
    }

    /* renamed from: W5 */
    public void mo77251W5(boolean z) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, Boolean.valueOf(z));
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        int i = z ? 1 : 2;
        y0Var.getClass();
        FinderSettingCheckStruct finderSettingCheckStruct = new FinderSettingCheckStruct();
        finderSettingCheckStruct.f9897d = (long) 1;
        finderSettingCheckStruct.f9898e = (long) i;
        finderSettingCheckStruct.mo86054n();
        y0Var.Ec0(finderSettingCheckStruct);
    }

    /* renamed from: X5 */
    public boolean mo77252X5(Integer num) {
        if (num != null && num.intValue() == 8) {
            return true;
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return num != null && num.intValue() == 7;
    }

    /* renamed from: Y5 */
    public boolean mo77253Y5() {
        return ((C66446g) C86312j.m106911c(C66446g.class)).mo61612qm();
    }

    /* renamed from: Z5 */
    public C13604l<String, Integer> mo77254Z5() {
        return null;
    }

    /* renamed from: a */
    public final HashSet<String> mo77255a(C55718s0 s0Var, String str) {
        String str2;
        HashSet<String> hashSet = new HashSet<>();
        C51978xi1 xi12 = s0Var.field_ctrInfo;
        if (xi12 == null || (str2 = xi12.f144679q) == null) {
            str2 = "";
        }
        Log.m105924i("Finder.RedDotManager", "[buildPathWithCtrInfo] source=" + str + " username=" + str2 + ' ' + C55716q0.f158580a.mo77303e(s0Var.field_ctrInfo) + " revokeId=" + s0Var.field_revokeId);
        for (Map.Entry next : s0Var.f158583D.entrySet()) {
            List list = this.f158543t.get(next.getKey());
            if (list == null) {
                list = Collections.synchronizedList(new LinkedList());
                ConcurrentHashMap<String, List<C55718s0>> concurrentHashMap = this.f158543t;
                Object key = next.getKey();
                C87412m.m108593f(list, "list");
                concurrentHashMap.put(key, list);
            }
            if (mo77271k(s0Var, str2)) {
                C61926c.m72700y(list, new C55700d(s0Var));
                list.add(s0Var);
                C77813z.m93909o(list, new C65485a(new C32226l[]{C55701e.f158556d, C55702f.f158557d}));
                hashSet.add(next.getKey());
            }
        }
        String str3 = s0Var.field_revokeId;
        if (str3 != null) {
            this.f158544u.put(str3, s0Var);
        }
        for (String str4 : hashSet) {
            C55718s0 i = mo77269i(str4, str2);
            String str5 = null;
            C64586nn1 o2 = i != null ? i.mo77308o2(str4) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("[buildPathWithCtrInfo] ctrlInfo:");
            sb.append(i);
            sb.append(" ,path:");
            sb.append(o2 != null ? o2.f184507i : null);
            sb.append(" count:");
            sb.append(o2 != null ? Integer.valueOf(o2.f184503e) : null);
            sb.append(" clearType:");
            sb.append(o2 != null ? Integer.valueOf(o2.f184506h) : null);
            sb.append(" parent:");
            if (o2 != null) {
                str5 = o2.f184508j;
            }
            sb.append(str5);
            Log.m105924i("Finder.RedDotManager", sb.toString());
            if (!(i == null || o2 == null)) {
                C2479n0.m2356f(C2479n0.f12955a, true, str4, o2, i, (String) null, 16, (Object) null);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo77256a6(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -961813849: goto L_0x0051;
                case -318065288: goto L_0x0045;
                case 345890211: goto L_0x003a;
                case 842235754: goto L_0x002e;
                case 1207859273: goto L_0x0023;
                case 1397734293: goto L_0x0018;
                case 1449007057: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x005d
        L_0x000d:
            java.lang.String r0 = "TLRecommendTab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0016
            goto L_0x005d
        L_0x0016:
            r2 = 1
            goto L_0x005e
        L_0x0018:
            java.lang.String r0 = "finder_tl_hot_tab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0021
            goto L_0x005d
        L_0x0021:
            r2 = 4
            goto L_0x005e
        L_0x0023:
            java.lang.String r0 = "TLFollow"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002c
            goto L_0x005d
        L_0x002c:
            r2 = 3
            goto L_0x005e
        L_0x002e:
            java.lang.String r0 = "NearbyLiveTab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0037
            goto L_0x005d
        L_0x0037:
            r2 = 1001(0x3e9, float:1.403E-42)
            goto L_0x005e
        L_0x003a:
            java.lang.String r0 = "finder_tl_nearby_tab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0043
            goto L_0x005d
        L_0x0043:
            r2 = 2
            goto L_0x005e
        L_0x0045:
            java.lang.String r0 = "NearbyFeedTab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004e
            goto L_0x005d
        L_0x004e:
            r2 = 1002(0x3ea, float:1.404E-42)
            goto L_0x005e
        L_0x0051:
            java.lang.String r0 = "NearbyPeopleTab"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r2 = 1003(0x3eb, float:1.406E-42)
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77256a6(java.lang.String):int");
    }

    /* renamed from: b */
    public final void mo77257b() {
        if (!C58784w3.f168295a.mo83983z0()) {
            Log.m105924i("Finder.RedDotManager", "[checkInsertLiveTaskRedDot] hasFinderAccount = false");
            return;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_LIVE_TASK_REDDOT_FLAG_INT_SYNC;
        boolean z = false;
        if (i.mo119689j(aVar, 0) == 1) {
            z = true;
        }
        if (z) {
            Log.m105924i("Finder.RedDotManager", "[checkInsertLiveTaskRedDot] hasShow = true");
        } else if (!C58961d.f168673a.mo84157d("Entrance_PrimarySetting")) {
            Log.m105924i("Finder.RedDotManager", "[checkInsertLiveTaskRedDot] getLiveTaskEnable = false");
        } else {
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            C51978xi1 xi12 = new C51978xi1();
            xi12.f144673h = String.valueOf(C31543z5.m39453c());
            xi12.f144669d = 50000;
            xi12.f144670e = TXLiveConstants.PUSH_EVT_ROOM_OUT;
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184502d = 1;
            nn12.f184506h = 1;
            nn12.f184507i = "TLPersonalCenter";
            xi12.f144672g.add(nn12);
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184502d = 1;
            nn13.f184506h = 1;
            nn13.f184507i = "FinderPosterEntrance";
            xi12.f144672g.add(nn13);
            C64586nn1 nn14 = new C64586nn1();
            nn14.f184502d = 1;
            nn14.f184506h = 1;
            nn14.f184507i = "FinderSettingLiveTask";
            xi12.f144672g.add(nn14);
            C60152b4.C8759a.m8561a(Nx0, xi12, "checkInsertLiveTaskRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            Log.m105924i("Finder.RedDotManager", "checkInsertLiveTaskRedDot");
        }
    }

    /* renamed from: b6 */
    public void mo77258b6() {
        C29946v0 v0Var = C29946v0.f81102a;
        Log.m105924i("Finder.ThreeDayTwoDay", "enterFindMoreFriendTab");
        v0Var.mo57021b();
    }

    /* renamed from: c */
    public final boolean mo77259c(int i, String str, C32226l<? super C55718s0, Boolean> lVar) {
        C13598b0 b0Var;
        String str2;
        int i2 = i;
        String str3 = str;
        C32226l<? super C55718s0, Boolean> lVar2 = lVar;
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(lVar2, "filter");
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX() || mo77252X5(Integer.valueOf(i))) {
            HashMap<String, LinkedList<C55718s0>> r = mo77278r(i2, lVar2, str3);
            if (!r.isEmpty()) {
                Log.m105924i("Finder.RedDotManager", "[clearCtrlInfo] type=" + i2 + " clearMap=" + r);
            }
            for (Map.Entry next : r.entrySet()) {
                String str4 = (String) next.getKey();
                List list = this.f158543t.get(str4);
                if (list != null) {
                    C61926c.m72700y(list, new C55703i(next));
                }
                Iterator it = ((Iterable) next.getValue()).iterator();
                while (true) {
                    b0Var = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C55724w wVar = this.f158524a;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = C55718s0.f158582G;
                    ((C55718s0) it.next()).mo77307n2(wVar, true);
                }
                C55718s0 i3 = mo77269i(str4, str3);
                if (i3 != null) {
                    C64586nn1 o2 = i3.mo77308o2(str4);
                    if (o2 != null) {
                        C2479n0 n0Var = C2479n0.f12955a;
                        n0Var.mo2449e(false, str4, (C64586nn1) null, (C55718s0) null, str);
                        str2 = str4;
                        C2479n0.m2356f(n0Var, true, str4, o2, i3, (String) null, 16, (Object) null);
                    } else {
                        str2 = str4;
                        C2479n0.f12955a.mo2449e(false, str2, (C64586nn1) null, (C55718s0) null, str);
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    str2 = str4;
                }
                if (b0Var == null) {
                    C2479n0.f12955a.mo2449e(false, str2, (C64586nn1) null, (C55718s0) null, str);
                }
            }
            return !r.isEmpty();
        }
        Log.m105924i("Finder.RedDotManager", "[clearCtrlInfo] 青少年模式且只看关注的模式下只clear关注的红点展示");
        return false;
    }

    /* renamed from: c6 */
    public void mo77260c6(boolean z) {
        if (!z) {
            C60276a.f171840a.mo85253b("#setEnableShowFinderLiveEntranceRedDot");
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final boolean mo77261d(C55718s0 s0Var) {
        C13598b0 b0Var;
        C55718s0 s0Var2 = s0Var;
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX() || mo77252X5(Integer.valueOf(s0Var2.field_ctrInfo.f144670e))) {
            Set<String> keySet = s0Var2.f158583D.keySet();
            C87412m.m108593f(keySet, "ctrInfo.showInfoMap.keys");
            Iterator<T> it = keySet.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                List list = this.f158543t.get(str);
                if (list != null) {
                    C61926c.m72700y(list, new C41404g(s0Var2));
                }
                String str2 = s0Var2.field_username;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                C87412m.m108593f(str, "removePath");
                C55718s0 G5 = mo77227G5(str);
                if (G5 != null) {
                    C64586nn1 o2 = G5.mo77308o2(str);
                    if (o2 == null) {
                        z = false;
                    }
                    if (z) {
                        C2479n0 n0Var = C2479n0.f12955a;
                        String str4 = str;
                        n0Var.mo2449e(false, str4, (C64586nn1) null, (C55718s0) null, str3);
                        C2479n0.m2356f(n0Var, true, str4, o2, G5, (String) null, 16, (Object) null);
                    } else {
                        C2479n0.f12955a.mo2449e(false, str, (C64586nn1) null, (C55718s0) null, str3);
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C2479n0.f12955a.mo2449e(false, str, (C64586nn1) null, (C55718s0) null, str3);
                }
            }
            if (!s0Var2.mo77307n2(this.f158524a, true)) {
                return false;
            }
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…bPreloadCore::class.java)");
            ((FinderStreamTabPreloadCore) a).mo78462l3(s0Var2, false);
            return true;
        }
        Log.m105924i("Finder.RedDotManager", "[clearCtrlInfo] 青少年模式且只看关注的模式下只delete关注的红点展示");
        return false;
    }

    /* renamed from: d6 */
    public C64586nn1 mo77262d6(String str, String str2) {
        C87412m.m108594g(str, "path");
        C55718s0 i = mo77269i(str, str2);
        if (i != null) {
            return i.mo77308o2(str);
        }
        return null;
    }

    /* renamed from: e */
    public final C64858yi1 mo77263e(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        C29940a remove = this.f158547x.remove(str);
        Log.m105924i("Finder.RedDotManager", "[clearEnterTabTipsExtInfo] path=" + str + " result=" + remove + " source=" + str2);
        if (remove != null) {
            return remove.f81094a;
        }
        return null;
    }

    /* renamed from: e6 */
    public int mo77264e6(String str) {
        C64867yw ywVar;
        C64867yw ywVar2;
        C87412m.m108594g(str, "path");
        C55718s0 G5 = mo77227G5(str);
        int i = 0;
        String str2 = null;
        if (G5 != null) {
            long e = (long) C31543z5.m39455e();
            C64586nn1 o2 = G5.mo77308o2(str);
            if ((o2 != null ? o2.f184512q : null) == null) {
                if (o2 != null) {
                    o2.f184512q = new C64867yw();
                }
                C64867yw ywVar3 = o2 != null ? o2.f184512q : null;
                C87412m.m108591d(ywVar3);
                ywVar3.f186606f = (long) C31543z5.m39455e();
            }
            if ((o2 == null || (ywVar2 = o2.f184512q) == null || ywVar2.f186606f != 0) ? false : true) {
                C64867yw ywVar4 = o2 != null ? o2.f184512q : null;
                if (ywVar4 != null) {
                    ywVar4.f186606f = e;
                }
            }
            C64867yw ywVar5 = o2 != null ? o2.f184512q : null;
            if (ywVar5 != null) {
                ywVar5.f186608h = e;
            }
            C64867yw ywVar6 = o2 != null ? o2.f184512q : null;
            C87412m.m108591d(ywVar6);
            C64867yw ywVar7 = o2 != null ? o2.f184512q : null;
            C87412m.m108591d(ywVar7);
            ywVar6.f186604d = ywVar7.f186604d + 1;
            if (!(o2 == null || (ywVar = o2.f184512q) == null)) {
                i = ywVar.f186604d;
            }
            G5.mo77314v2(this.f158524a, true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("increase reddot expose path = ");
        sb.append(str);
        sb.append(", exposeCount = ");
        sb.append(i);
        sb.append(", tipsId=[");
        if (G5 != null) {
            str2 = G5.field_tipsId;
        }
        sb.append(str2);
        sb.append(']');
        Log.m105926v("Finder.RedDotManager", sb.toString());
        return i;
    }

    /* renamed from: f */
    public final void mo77265f(C51978xi1 xi12, String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (xi12 != null) {
            C55718s0 s0Var = new C55718s0();
            s0Var.mo77305l2(xi12, 0);
            String w = mo77283w(mo77280t(s0Var));
            C29940a aVar = this.f158547x.get(w);
            if (aVar != null) {
                if (!(C87412m.m108589b(aVar.f81095b, xi12.f144673h) || C87412m.m108589b(str, "notifyTabTip"))) {
                    aVar = null;
                }
                if (aVar != null) {
                    this.f158547x.remove(w);
                    Log.m105924i("Finder.RedDotManager", "[clearEnterTabTipsExtInfo] PATH=" + w + " tips_id=" + xi12.f144673h + " source=" + str);
                }
            }
        }
    }

    /* renamed from: f6 */
    public void mo77266f6(String str, C32226l<? super C55718s0, Boolean> lVar, boolean z, String str2) {
        C13598b0 b0Var;
        T t;
        String str3 = str;
        C32226l<? super C55718s0, Boolean> lVar2 = lVar;
        String str4 = str2;
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(lVar2, "call");
        C87412m.m108594g(str4, "username");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(str3);
        C55718s0 i = mo77269i(str3, str4);
        C64586nn1 o2 = i != null ? i.mo77308o2(str3) : null;
        List list = this.f158543t.get(str3);
        if (list != null) {
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C55718s0 s0Var = (C55718s0) it.next();
                    Iterator<T> it4 = this.f158545v.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (((Boolean) ((C32226l) t).invoke(s0Var)).booleanValue()) {
                            break;
                        }
                    }
                    if (((C32226l) t) == null) {
                        if (lVar2.invoke(s0Var).booleanValue()) {
                            C55718s0 s0Var2 = s0Var;
                            LinkedList u2 = C55718s0.m63401u2(s0Var, str, z, 0, str2, 4, (Object) null);
                            if (u2.size() > 0 && s0Var2.mo77314v2(this.f158524a, true)) {
                                hashSet.addAll(u2);
                            }
                            if (s0Var2.mo77310q2()) {
                                it.remove();
                            }
                            lVar2 = lVar;
                        } else {
                            lVar2 = lVar;
                        }
                    }
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[disposeRedDotAtPath] path=");
        sb.append(str3);
        sb.append(" tipsId=");
        sb.append(i != null ? i.field_tipsId : null);
        sb.append(" removePathSet=");
        sb.append(hashSet);
        sb.append(" maybeRemoveShowInfo=");
        sb.append(C55716q0.f158580a.mo77304f(o2, 0));
        sb.append(" hash=");
        sb.append(hashCode());
        Log.m105924i("Finder.RedDotManager", sb.toString());
        for (String str5 : hashSet) {
            C55718s0 i2 = mo77269i(str5, str4);
            if (i2 != null) {
                C64586nn1 o25 = i2.mo77308o2(str5);
                if (o25 != null) {
                    C2479n0 n0Var = C2479n0.f12955a;
                    C2479n0.m2356f(n0Var, false, str5, o2, i, (String) null, 16, (Object) null);
                    C2479n0.m2356f(n0Var, true, str5, o25, i2, (String) null, 16, (Object) null);
                } else {
                    C2479n0.m2356f(C2479n0.f12955a, false, str5, o2, i, (String) null, 16, (Object) null);
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C2479n0.m2356f(C2479n0.f12955a, false, str5, o2, i, (String) null, 16, (Object) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo77267g(C55718s0 s0Var, String str, boolean z) {
        String str2;
        C13598b0 b0Var;
        List list;
        C55718s0 s0Var2 = s0Var;
        String str3 = str;
        C87412m.m108594g(s0Var2, "info");
        C87412m.m108594g(str3, "path");
        HashSet<String> hashSet = new HashSet<>();
        C64586nn1 o2 = s0Var.mo77308o2(str);
        LinkedList u2 = C55718s0.m63401u2(s0Var, str, z, 0, (String) null, 12, (Object) null);
        if (s0Var2.mo77314v2(this.f158524a, true)) {
            hashSet.addAll(u2);
        }
        if (s0Var.mo77310q2() && (list = this.f158543t.get(str3)) != null) {
            list.remove(s0Var2);
        }
        Log.m105924i("Finder.RedDotManager", "[clearShowInfoAtCtrlInfo] path=" + str3 + " tipsId=" + s0Var2.field_tipsId + " removePathSet=" + hashSet + " maybeRemoveShowInfo=" + C55716q0.f158580a.mo77304f(o2, 0));
        for (String str4 : hashSet) {
            C55718s0 G5 = mo77227G5(str4);
            if (G5 != null) {
                C64586nn1 o25 = G5.mo77308o2(str4);
                if (o25 != null) {
                    C2479n0 n0Var = C2479n0.f12955a;
                    C2479n0.m2356f(n0Var, false, str4, o2, s0Var, (String) null, 16, (Object) null);
                    str2 = str4;
                    C2479n0.m2356f(n0Var, true, str2, o25, G5, (String) null, 16, (Object) null);
                } else {
                    str2 = str4;
                    C2479n0.m2356f(C2479n0.f12955a, false, str2, o2, s0Var, (String) null, 16, (Object) null);
                }
                b0Var = C13598b0.f38549a;
            } else {
                str2 = str4;
                b0Var = null;
            }
            if (b0Var == null) {
                C2479n0.m2356f(C2479n0.f12955a, false, str2, o2, s0Var, (String) null, 16, (Object) null);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo77268h(int i) {
        FinderTipsShowEntranceExtInfo x = mo77284x(i);
        StringBuilder sb = new StringBuilder();
        sb.append("[containsTabTipsExtInfo] tabType=");
        sb.append(i);
        sb.append(" isContains=");
        sb.append(x.tab_type != 0);
        Log.m105924i("Finder.RedDotManager", sb.toString());
        return x.tab_type != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.tencent.mm.plugin.finder.extension.reddot.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.mm.plugin.finder.extension.reddot.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.plugin.finder.extension.reddot.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.tencent.mm.plugin.finder.extension.reddot.s0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 mo77269i(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r7, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.plugin.finder.extension.reddot.s0>> r0 = r6.f158543t
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x005e
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x005b }
            r2.<init>()     // Catch:{ all -> 0x005b }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x005b }
        L_0x001a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x005b }
            r5 = r4
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r5     // Catch:{ all -> 0x005b }
            boolean r5 = r6.mo77271k(r5, r8)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x001a
            r2.add(r4)     // Catch:{ all -> 0x005b }
            goto L_0x001a
        L_0x0031:
            monitor-exit(r0)
            monitor-enter(r2)
            int r8 = r2.size()     // Catch:{ all -> 0x0058 }
            java.util.ListIterator r8 = r2.listIterator(r8)     // Catch:{ all -> 0x0058 }
        L_0x003b:
            boolean r0 = r8.hasPrevious()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r8.previous()     // Catch:{ all -> 0x0058 }
            r3 = r0
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r3     // Catch:{ all -> 0x0058 }
            te3.nn1 r3 = r3.mo77308o2(r7)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0050
            r3 = 1
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            if (r3 == 0) goto L_0x003b
            r1 = r0
        L_0x0054:
            monitor-exit(r2)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r1
            goto L_0x005e
        L_0x0058:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x005b:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77269i(java.lang.String, java.lang.String):com.tencent.mm.plugin.finder.extension.reddot.s0");
    }

    /* renamed from: j */
    public C20998d4 mo77270j() {
        return this.f158525b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r1 = (fy3.C32226l) r1.f38556e;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77271k(com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.List<rx3.l<fy3.l<com.tencent.mm.plugin.finder.extension.reddot.s0, java.lang.Boolean>, fy3.l<com.tencent.mm.plugin.finder.extension.reddot.s0, java.lang.Boolean>>> r0 = r3.f158546w
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            r2 = r1
            rx3.l r2 = (rx3.C13604l) r2
            A r2 = r2.f38555d
            fy3.l r2 = (fy3.C32226l) r2
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0006
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            rx3.l r1 = (rx3.C13604l) r1
            r0 = 1
            if (r1 == 0) goto L_0x003b
            B r1 = r1.f38556e
            fy3.l r1 = (fy3.C32226l) r1
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r1.invoke(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r1 == 0) goto L_0x0049
            if (r5 != 0) goto L_0x0042
            java.lang.String r5 = ""
        L_0x0042:
            boolean r4 = r3.mo77274n(r5, r4)
            if (r4 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.mo77271k(com.tencent.mm.plugin.finder.extension.reddot.s0, java.lang.String):boolean");
    }

    /* renamed from: l */
    public void mo77272l(String str, int[] iArr) {
        C87412m.m108594g(str, "path");
        C60152b4.C8759a.m8563c(this, str, new C2453n(iArr), false, (String) null, 12, (Object) null);
    }

    /* renamed from: m */
    public final void mo77273m(int i, boolean z) {
        int i2 = i;
        boolean z2 = z;
        Class cls = C11739f.class;
        Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
        C55718s0 G5 = mo77227G5("FinderEntrance");
        this.f158542s = G5;
        boolean z3 = i2 == 6;
        if (!z3) {
            C2490t.f13006a.mo2469a(G5);
        }
        if (G5 != null) {
            C58413v0.f167346a.getClass();
            FinderTipsShowEntranceExtInfo p2 = G5.mo77309p2();
            if (p2.object_id != 0) {
                C48978cb0 cb02 = new C48978cb0();
                cb02.f131607d = p2.object_id;
                C49119db0 db02 = new C49119db0();
                db02.f132215d = p2.tabTipsByPassInfo;
                db02.f132216e = p2.tab_type;
                cb02.f131613j = db02;
                StringBuilder sb = new StringBuilder();
                sb.append("[reportCurrentEntranceRedDot] objectId=");
                sb.append(C61926c.m72691p(cb02.f131607d));
                sb.append(" jump_tab_type=");
                sb.append(p2.tab_type);
                sb.append(" tab_tips_by_pass_info=");
                sb.append(p2.tabTipsByPassInfo != null);
                Log.m105924i("FinderRedDotReporter", sb.toString());
                C13598b0 b0Var = C13598b0.f38549a;
                C86709a0.m107524d().mo123460f(new C46534r2((C49712hj1) null, 2, cb02, (String) null));
            }
            if (G5.mo77308o2("FinderEntrance") == null) {
                this.f158541r = 0;
                this.f158540q = false;
            } else {
                this.f158540q = true;
                this.f158541r = G5.field_ctrInfo.f144670e;
                if (!z3) {
                    mo77242O(G5);
                }
            }
        } else {
            this.f158541r = 0;
            this.f158540q = false;
        }
        this.f158539p = i2;
        this.f158538o = C31543z5.m39453c();
        long a = C31543z5.m39451a();
        C39818r rVar = C39818r.f106831a;
        int e3 = ((C11739f) rVar.mo62446e(cls2).mo75002a(cls)).mo11602e3();
        if (!z3) {
            C55718s0 G52 = mo77227G5("FinderEntrance");
            String str = "TLFollow";
            if ((G52 != null ? G52.mo77308o2(str) : null) == null) {
                if ((G52 != null ? G52.mo77308o2("TLRecommendTab") : null) != null) {
                    str = "TLRecommendTab";
                } else {
                    str = (G52 != null ? G52.mo77308o2("finder_tl_hot_tab") : null) != null ? "finder_tl_hot_tab" : "";
                }
            }
            mo77239M5("FinderMentionEntrance");
            if (mo77281u() || (i2 == 2 && !z2)) {
                mo77239M5("FinderEntrance");
                mo77239M5("Discovery");
            }
            Log.m105924i("Finder.RedDotManager", "enterFinder: source=" + i2 + ", tabRedDotPath=" + str + ", isFromRecentTask=" + z2 + ", needClearRedDotWhenEnter=" + mo77281u());
            long a2 = C31543z5.m39451a();
            if (!Util.isNullOrNil(str)) {
                C55716q0.m63395b(C55716q0.f158580a, mo77256a6(str), false, 0, C55704q.f158559d, 6, (Object) null);
            } else {
                boolean f3 = ((C11739f) rVar.mo62446e(cls2).mo75002a(cls)).mo11603f3(e3);
                Log.m105924i("Finder.RedDotManager", "enterFinder: isAutoRefresh=" + f3);
                if (f3) {
                    C55716q0.m63395b(C55716q0.f158580a, e3, false, 0, C55705r.f158560d, 6, (Object) null);
                }
            }
            long a3 = C31543z5.m39451a();
            Log.m105924i("Finder.RedDotManager", "s2 - s1:" + (a2 - a) + "   s3 - s2:" + (a3 - a2));
        }
        Log.m105924i("Finder.ThreeDayTwoDay", "enterFinder");
        Log.m105924i("Finder.ThreeDayTwoDay", "[reset] begin=" + 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_HIT_TIME_LONG_SYNC, 0L);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_BEGIN_TIME_LONG_SYNC, 0L);
        this.f158525b.mo2467d();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENTER_FINDER_TL_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
        Log.m105924i("Finder.RedDotManager", "enterFinder: hasRedDotWhenEnter=" + this.f158540q + " isSourceFromShareToTimeline=" + z3 + " tabType=" + e3);
    }

    /* renamed from: n */
    public final boolean mo77274n(String str, C55718s0 s0Var) {
        if (!C87412m.m108589b(s0Var.field_username, str)) {
            String str2 = s0Var.field_username;
            return str2 == null || str2.length() == 0;
        }
    }

    /* renamed from: o */
    public final FinderTipsShowEntranceExtInfo mo77275o(String str) {
        C87412m.m108594g(str, "path");
        C55718s0 G5 = mo77227G5(str);
        return G5 != null ? G5.mo77309p2() : new FinderTipsShowEntranceExtInfo();
    }

    /* renamed from: p */
    public final int mo77276p() {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        C55718s0 G5 = mo77227G5("FinderEntrance");
        C64586nn1 o2 = G5 != null ? G5.mo77308o2("FinderEntrance") : null;
        int i = -1;
        if (o2 != null) {
            if (o2.f184514s == 1) {
                int i2 = o2.f184520y;
                if (i2 == 0) {
                    return -100;
                }
                if (i2 == 1) {
                    return mo77280t(G5);
                }
            }
            C64858yi1 yi12 = G5.f158585F;
            int i3 = yi12.f186555p;
            int i4 = yi12.f186559t;
            int i5 = i3 != -1 ? i3 : i4 != 2 ? i4 != 3 ? i4 != 4 ? -1 : 4 : 3 : 1;
            Log.m105924i("Finder.RedDotManager", "[getAliveTabType] -- displayTabType: " + i3 + " enterAction: " + i4 + "  tabType:" + i5);
            if (i5 != -1) {
                return i5;
            }
        }
        if (o2 == null || G5.mo77308o2("finder_private_msg_entrance") != null) {
            int i6 = this.f158528e.f34363j;
            C37521f.f99374d.getClass();
            if (C37521f.f99220L1.mo60266n().intValue() == 1 && i6 == 4) {
                Log.m105924i("Finder.RedDotManager", "[getAliveTabType] IS_HARD_JUMP_HOT_WITHOUT_ENTRANCE_REDDOT = true");
                return 4;
            }
            C55697b.C55698a aVar = C55697b.f158549c;
            List<C55697b> f = C64197v.m75537f(aVar.mo77290a(1, this), aVar.mo77290a(3, this), aVar.mo77290a(4, this));
            Iterator it = f.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int i7 = ((C55697b) obj).f158551b.f139267d;
                    do {
                        Object next = it.next();
                        int i8 = ((C55697b) next).f158551b.f139267d;
                        if (i7 < i8) {
                            obj = next;
                            i7 = i8;
                        }
                    } while (it.hasNext());
                }
            }
            C87412m.m108591d(obj);
            C55697b bVar = (C55697b) obj;
            if (bVar.f158551b.f139267d > 0) {
                i = bVar.f158550a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[getAliveTabType] cost=");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms aliveType=");
            sb.append(i);
            sb.append(" maxPriorityTabType=");
            sb.append(bVar.f158550a);
            sb.append(' ');
            ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
            for (C55697b bVar2 : f) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(bVar2.f158550a);
                sb4.append('=');
                sb4.append(bVar2.f158551b.f139267d);
                arrayList.add(sb4.toString());
            }
            sb.append(arrayList);
            Log.m105924i("Finder.RedDotManager", sb.toString());
            return i;
        }
        int t = mo77280t(G5);
        Log.m105924i("Finder.RedDotManager", "[getAliveTabType] getTabTypeInCtrlInfo=" + t);
        if (t != -1) {
            return t;
        }
        Log.m105924i("Finder.RedDotManager", "[getAliveTabType] TAB_TYPE_INVALID");
        return -1;
    }

    /* renamed from: q */
    public final Set<C55718s0> mo77277q() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, List<C55718s0>> value : this.f158543t.entrySet()) {
            hashSet.addAll((Collection) value.getValue());
        }
        return hashSet;
    }

    /* renamed from: r */
    public final HashMap<String, LinkedList<C55718s0>> mo77278r(int i, C32226l<? super C55718s0, Boolean> lVar, String str) {
        C87412m.m108594g(lVar, "filter");
        C87412m.m108594g(str, "username");
        Log.m105924i("Finder.RedDotManager", "getCtrlInfoMap type:" + i);
        HashMap<String, LinkedList<C55718s0>> hashMap = new HashMap<>();
        for (Map.Entry next : this.f158543t.entrySet()) {
            String str2 = (String) next.getKey();
            Iterable<C55718s0> iterable = (Iterable) next.getValue();
            synchronized (iterable) {
                for (C55718s0 s0Var : iterable) {
                    if (mo77274n(str, s0Var) && ((s0Var.field_ctrInfo.f144670e == i || i == Integer.MIN_VALUE) && lVar.invoke(s0Var).booleanValue())) {
                        LinkedList linkedList = hashMap.get(str2);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            hashMap.put(str2, linkedList);
                        }
                        linkedList.add(s0Var);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: s */
    public final C64858yi1 mo77279s(String str) {
        C87412m.m108594g(str, "path");
        C29940a aVar = this.f158547x.get(str);
        if (aVar != null) {
            return aVar.f81094a;
        }
        return null;
    }

    /* renamed from: t */
    public final int mo77280t(C55718s0 s0Var) {
        C87412m.m108594g(s0Var, "ctrlInfo");
        if (s0Var.mo77308o2("TLWxPrivateMsgBubble") != null || s0Var.mo77308o2("TLWxBubble") != null) {
            return 4;
        }
        if (s0Var.mo77308o2("TLFollow") != null) {
            int i = s0Var.f158585F.f186555p;
            return i != -1 ? i : mo77256a6("TLFollow");
        } else if (s0Var.mo77308o2("TLRecommendTab") != null) {
            int i2 = s0Var.f158585F.f186555p;
            return i2 != -1 ? i2 : mo77256a6("TLRecommendTab");
        } else if (s0Var.mo77308o2("finder_tl_hot_tab") != null) {
            int i3 = s0Var.f158585F.f186555p;
            return i3 != -1 ? i3 : mo77256a6("finder_tl_hot_tab");
        } else if (s0Var.mo77308o2("finder_tl_nearby_tab") != null) {
            return mo77256a6("finder_tl_nearby_tab");
        } else {
            if (s0Var.mo77308o2("NearbyFeedTab") != null) {
                return mo77256a6("NearbyFeedTab");
            }
            if (s0Var.mo77308o2("NearbyLiveTab") != null) {
                return mo77256a6("NearbyLiveTab");
            }
            if (s0Var.mo77308o2("NearbyPeopleTab") != null) {
                return mo77256a6("NearbyPeopleTab");
            }
            int i4 = s0Var.f158585F.f186555p;
            if (i4 != 0) {
                return i4;
            }
            return -1;
        }
    }

    /* renamed from: u */
    public final boolean mo77281u() {
        return ((Boolean) ((C36570n) this.f158536m).getValue()).booleanValue();
    }

    /* renamed from: v */
    public final int mo77282v(int i, String str) {
        C37521f.f99374d.getClass();
        int i2 = 0;
        if (C37521f.f99413h3.mo60266n().intValue() == 0 && i == 0) {
            return 0;
        }
        int qq = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().mo73553qq(2, 2, str);
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i3 = c != null ? c.field_systemMsgCount : 0;
        C64586nn1 y = mo77285y("finder_private_msg_entrance", str);
        if (y != null) {
            i2 = y.f184503e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("privateMessageCount:");
        sb.append(i2);
        sb.append(" unReadCount + unReadSystemCount:");
        int i4 = qq + i3;
        sb.append(i4);
        sb.append(" finderUserName:");
        sb.append(str);
        Log.m105924i("Finder.RedDotManager", sb.toString());
        return i4;
    }

    /* renamed from: w */
    public final String mo77283w(int i) {
        if (i == 1) {
            return "TLRecommendTab";
        }
        if (i == 2) {
            return "finder_tl_nearby_tab";
        }
        if (i == 3) {
            return "TLFollow";
        }
        if (i == 4) {
            return "finder_tl_hot_tab";
        }
        switch (i) {
            case 1001:
                return "NearbyLiveTab";
            case 1002:
                return "NearbyFeedTab";
            case 1003:
                return "NearbyPeopleTab";
            default:
                return "";
        }
    }

    /* renamed from: x */
    public final FinderTipsShowEntranceExtInfo mo77284x(int i) {
        FinderTipsShowEntranceExtInfo o = mo77275o(mo77283w(i));
        StringBuilder sb = new StringBuilder();
        sb.append("[getTabTipsExtInfo] tabType=");
        sb.append(i);
        sb.append(" ext=");
        sb.append("extInfo{tab_type=" + o.tab_type + " object_id=" + o.object_id + '}');
        Log.m105924i("Finder.RedDotManager", sb.toString());
        return o;
    }

    /* renamed from: y */
    public final C64586nn1 mo77285y(String str, String str2) {
        C87412m.m108594g(str, "path");
        C55718s0 i = mo77269i(str, str2);
        if (i != null) {
            return i.mo77308o2(str);
        }
        return null;
    }

    /* renamed from: z */
    public final void mo77286z(String str, int i, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        List<C55718s0> O5 = mo77243O5("Discovery", C29942t.f81098d, str2);
        synchronized (O5) {
            z = false;
            z2 = false;
            z3 = false;
            for (C55718s0 s0Var : O5) {
                if (!s0Var.mo77306m2(str)) {
                    z2 = true;
                } else if (s0Var.field_ctrInfo.f144669d <= i) {
                    z3 = true;
                }
            }
        }
        if (!z2 || !z3) {
            z = z3;
        } else {
            synchronized (O5) {
                for (C55718s0 s0Var2 : O5) {
                    if (s0Var2.mo77306m2(str)) {
                        mo77267g(s0Var2, "Discovery", true);
                    }
                }
            }
        }
        Log.m105924i("Finder.RedDotManager", "handleClearDiscoveryRedDot isClear:" + z + ", hasOtherPath:" + z2 + ", ctrlInfoByPath:" + O5 + ", path:" + str);
        if (z) {
            mo77266f6("Discovery", C29941s.f81097d, true, str2);
        }
    }
}
