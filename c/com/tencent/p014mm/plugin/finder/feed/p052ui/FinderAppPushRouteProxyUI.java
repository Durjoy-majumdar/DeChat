package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import do1.C58341h;
import dp1.C58413v0;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C58684b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C32330n;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60152b4;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C8785n;
import je1.C46547x1;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C47350c;
import org.json.JSONObject;
import os1.C11739f;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tc0.C77885p;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50140kk0;
import te3.C64266br1;
import te3.C64586nn1;
import te3.C64858yi1;
import tf0.C13887q1;
import up1.C65426w0;
import vc1.C37715b;
import vf1.C14752e;
import vf1.C14758f;
import vf1.C14764g;
import vf1.C14769h;
import vp1.C14937o;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAppPushRouteProxyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI */
public final class FinderAppPushRouteProxyUI extends MMFinderUI {

    /* renamed from: z */
    public static final /* synthetic */ int f14204z = 0;

    /* renamed from: o */
    public final C13601g f14205o = C36568h.m40985a(new C2877m(this));

    /* renamed from: p */
    public final C13601g f14206p = C36568h.m40985a(new C2869e(this));

    /* renamed from: q */
    public final C13601g f14207q = C36568h.m40985a(new C2865a(this));

    /* renamed from: r */
    public final C13601g f14208r = C36568h.m40985a(new C2868d(this));

    /* renamed from: s */
    public final C13601g f14209s = C36568h.m40985a(new C2866b(this));

    /* renamed from: t */
    public final C13601g f14210t = C36568h.m40985a(new C2871g(this));

    /* renamed from: u */
    public final C13601g f14211u = C36568h.m40985a(new C2876l(this));

    /* renamed from: v */
    public final C13601g f14212v = C36568h.m40985a(new C2870f(this));

    /* renamed from: w */
    public final C13601g f14213w = C36568h.m40985a(new C2873i(this));

    /* renamed from: x */
    public final C13601g f14214x = C36568h.m40985a(new C2874j(this));

    /* renamed from: y */
    public final C13601g f14215y = C36568h.m40985a(new C2875k(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$a */
    public static final class C2865a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2865a(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14216d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f14216d.getIntent().getLongExtra("KEY_PUSH_CTRL_FLAG", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$b */
    public static final class C2866b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2866b(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14217d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f14217d.getIntent().getLongExtra("KEY_PUSH_DEMOTION_FLAG", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$c */
    public static final class C2867c extends C87413o implements C32226l<C50140kk0, Boolean> {

        /* renamed from: d */
        public static final C2867c f14218d = new C2867c();

        public C2867c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C50140kk0) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$d */
    public static final class C2868d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2868d(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14219d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14219d.getIntent().getIntExtra("KEY_PUSH_RETURN_TO", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$e */
    public static final class C2869e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2869e(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14220d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f14220d.getIntent().getLongExtra("KEY_OBJECT_ID", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$f */
    public static final class C2870f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2870f(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14221d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14221d.getIntent().getIntExtra("KEY_JUMP_TYPE_CODE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$g */
    public static final class C2871g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2871g(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14222d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return this.f14222d.getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$h */
    public static final class C2872h<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14223a;

        /* renamed from: b */
        public final /* synthetic */ String f14224b;

        public C2872h(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI, String str) {
            this.f14223a = finderAppPushRouteProxyUI;
            this.f14224b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0121, code lost:
            r3 = r1.liveInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r28) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                java.lang.Class<tf0.q1> r2 = tf0.C13887q1.class
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[CgiGetFinderFeedComment] errType="
                r3.append(r4)
                int r4 = r1.f256793a
                r3.append(r4)
                java.lang.String r4 = " errCode="
                r3.append(r4)
                int r4 = r1.f256794b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Finder.AppPushRouteProxyUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                int r3 = r1.f256794b
                r5 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r10 = 6
                r11 = 4
                r12 = 5
                java.lang.String r13 = "return"
                r14 = 3
                r15 = 0
                r9 = -4200(0xffffffffffffef98, float:NaN)
                if (r3 != r9) goto L_0x0082
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r2 = new java.lang.Object[r10]
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r3 = r0.f14223a
                int r4 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI.f14204z
                java.lang.String r3 = r3.mo2948S7()
                r2[r15] = r3
                r2[r7] = r13
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r2[r5] = r3
                java.lang.String r3 = "-4200"
                r2[r14] = r3
                r2[r11] = r8
                r2[r12] = r6
                r3 = 23669(0x5c75, float:3.3167E-41)
                r1.mo160131h(r3, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r1 = r0.f14223a
                android.content.Intent r1 = r1.getIntent()
                java.lang.String r2 = "KEY_JUMP_HOT_INTENT"
                android.os.Parcelable r1 = r1.getParcelableExtra(r2)
                android.content.Intent r1 = (android.content.Intent) r1
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI.m2700N7(r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                r2.mo2944O7(r1)
                goto L_0x02c0
            L_0x0082:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r9 = r0.f14223a
                int r16 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI.f14204z
                rx3.g r9 = r9.f14211u
                rx3.n r9 = (rx3.C36570n) r9
                java.lang.Object r9 = r9.getValue()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r10 = "client_trigger_scene"
                r3.put(r10, r9)
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 8
                java.lang.Object[] r10 = new java.lang.Object[r10]
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r12 = r0.f14223a
                java.lang.String r12 = r12.mo2948S7()
                r10[r15] = r12
                r10[r7] = r8
                long r17 = java.lang.System.currentTimeMillis()
                java.lang.Long r12 = java.lang.Long.valueOf(r17)
                r10[r5] = r12
                java.lang.String r3 = r3.toString()
                java.lang.String r12 = "json.toString()"
                gy3.C87412m.m108593f(r3, r12)
                java.lang.String r12 = ","
                java.lang.String r5 = ";"
                java.lang.String r3 = z04.C112551y.m153814n(r3, r12, r5, r15)
                r10[r14] = r3
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r3 = r0.f14223a
                rx3.g r3 = r3.f14212v
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r10[r11] = r3
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r3 = r0.f14223a
                rx3.g r3 = r3.f14213w
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 5
                r10[r5] = r3
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r3 = r0.f14223a
                rx3.g r3 = r3.f14215y
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                r5 = 6
                r10[r5] = r3
                r3 = 7
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r5 = r0.f14223a
                rx3.g r5 = r5.f14214x
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.String r5 = (java.lang.String) r5
                r10[r3] = r5
                r3 = 23498(0x5bca, float:3.2928E-41)
                r9.mo160131h(r3, r10)
                T r1 = r1.f256796d
                te3.jm0 r1 = (te3.C50008jm0) r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f136184e
                r18 = 0
                if (r1 == 0) goto L_0x0128
                te3.c21 r3 = r1.liveInfo
                if (r3 == 0) goto L_0x0128
                long r11 = r3.f182392d
                goto L_0x012a
            L_0x0128:
                r11 = r18
            L_0x012a:
                int r3 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
                if (r3 == 0) goto L_0x0243
                if (r1 != 0) goto L_0x0132
                goto L_0x0243
            L_0x0132:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r4 = r0.f14223a
                long r10 = r4.mo2945P7()
                r12 = 2
                long r10 = r10 & r12
                int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                if (r4 == 0) goto L_0x0153
                di3.d r4 = di3.C86312j.m106911c(r2)
                tf0.q1 r4 = (tf0.C13887q1) r4
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r10 = r0.f14223a
                long r10 = r10.mo2947R7()
                r4.mo13354pC(r10)
            L_0x0153:
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r4 = r0.f14223a
                long r10 = r4.mo2945P7()
                r12 = 8
                long r10 = r10 & r12
                int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                if (r4 == 0) goto L_0x016f
                di3.d r2 = di3.C86312j.m106911c(r2)
                tf0.q1 r2 = (tf0.C13887q1) r2
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r4 = r0.f14223a
                long r10 = r4.mo2947R7()
                r2.pm0(r10)
            L_0x016f:
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                android.content.Intent r2 = r2.getIntent()
                java.lang.String r4 = "key_enter_live_param_visitor_enter_scene"
                int r2 = r2.getIntExtra(r4, r15)
                r3.putExtra(r4, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                java.lang.String r2 = r2.mo2948S7()
                java.lang.String r4 = "KEY_TASK_ID"
                r3.putExtra(r4, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                android.content.Intent r2 = r2.getIntent()
                java.lang.String r4 = "key_enter_live_param_by_pass_type"
                int r2 = r2.getIntExtra(r4, r15)
                r3.putExtra(r4, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                android.content.Intent r2 = r2.getIntent()
                java.lang.String r4 = "key_enter_live_param_by_pass_info"
                java.lang.String r2 = r2.getStringExtra(r4)
                r3.putExtra(r4, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                android.content.Intent r2 = r2.getIntent()
                java.lang.String r4 = "KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID"
                java.lang.String r2 = r2.getStringExtra(r4)
                r3.putExtra(r4, r2)
                vp1.e r2 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo79056a(r1, r15)
                vp1.e$b r10 = vp1.C65834e.C65836b.f189330j
                r2.mo89878l(r4, r10)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI.m2700N7(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r2.add(r1)
                r24 = 0
                te3.c90 r4 = new te3.c90
                r4.<init>()
                java.lang.String r10 = r0.f14224b
                r4.f182444d = r10
                java.lang.String r10 = ""
                r4.f182445e = r10
                r4.f182446f = r15
                r11 = -1
                r4.f182447g = r11
                r4.f182448h = r11
                r4.f182449i = r7
                te3.ro2 r11 = new te3.ro2
                r11.<init>()
                r12 = 65
                r11.f185214e = r12
                java.lang.String r1 = r1.nickname
                if (r1 != 0) goto L_0x01f6
                r1 = r10
            L_0x01f6:
                r11.f185215f = r1
                r4.f182450j = r11
                java.lang.Class<ls3.f> r1 = ls3.C10649f.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                r20 = r1
                ls3.f r20 = (ls3.C10649f) r20
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r11 = "getContext()"
                gy3.C87412m.m108593f(r1, r11)
                r26 = 0
                r21 = r1
                r22 = r3
                r23 = r2
                r25 = r4
                r20.mo10913cP(r21, r22, r23, r24, r25, r26)
                r1 = 6
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                java.lang.String r2 = r2.mo2948S7()
                r1[r15] = r2
                java.lang.String r2 = "getcommentdetail"
                r1[r7] = r2
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 2
                r1[r3] = r2
                r1[r14] = r10
                r2 = 4
                r1[r2] = r8
                r2 = 5
                r1[r2] = r6
                r2 = 23669(0x5c75, float:3.3167E-41)
                r9.mo160131h(r2, r1)
                goto L_0x02c0
            L_0x0243:
                java.lang.String r1 = "get liveId failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                r1 = 6
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r2 = r0.f14223a
                java.lang.String r2 = r2.mo2948S7()
                r1[r15] = r2
                r1[r7] = r13
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 2
                r1[r3] = r2
                java.lang.String r2 = "liveId == 0L"
                r1[r14] = r2
                r2 = 4
                r1[r2] = r8
                r2 = 5
                r1[r2] = r6
                r2 = 23669(0x5c75, float:3.3167E-41)
                r9.mo160131h(r2, r1)
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r1 = r0.f14223a
                rx3.g r1 = r1.f14208r
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = 2130772185(0x7f0100d9, float:1.7147481E38)
                r3 = 2130772175(0x7f0100cf, float:1.714746E38)
                java.lang.String r4 = ".ui.LauncherUI"
                r6 = 0
                java.lang.String r7 = "preferred_tab"
                r8 = 67108864(0x4000000, float:1.5046328E-36)
                r5 = 4
                if (r1 != r5) goto L_0x02a6
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r1 = r0.f14223a
                r1.getClass()
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                r5.addFlags(r8)
                r5.putExtra(r7, r15)
                ke3.C88144b.m109801s(r1, r4, r5, r6)
                r1.overridePendingTransition(r3, r2)
                goto L_0x02c0
            L_0x02a6:
                r5 = 5
                if (r1 != r5) goto L_0x02c0
                com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI r1 = r0.f14223a
                r1.getClass()
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                r5.addFlags(r8)
                r8 = 2
                r5.putExtra(r7, r8)
                ke3.C88144b.m109801s(r1, r4, r5, r6)
                r1.overridePendingTransition(r3, r2)
            L_0x02c0:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI.C2872h.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$i */
    public static final class C2873i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2873i(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14225d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14225d.getIntent().getIntExtra("KEY_PUSH_LEVEL", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$j */
    public static final class C2874j extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2874j(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14226d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return this.f14226d.getIntent().getStringExtra("KEY_REPORT_EXT_INFO");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$k */
    public static final class C2875k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2875k(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14227d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return this.f14227d.getIntent().getStringExtra("KEY_SESSION_ID");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$l */
    public static final class C2876l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2876l(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14228d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return this.f14228d.getIntent().getStringExtra("KEY_UDF_KV");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI$m */
    public static final class C2877m extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAppPushRouteProxyUI f14229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2877m(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
            super(0);
            this.f14229d = finderAppPushRouteProxyUI;
        }

        public Object invoke() {
            return this.f14229d.getIntent().getStringExtra("KEY_TASK_ID");
        }
    }

    /* renamed from: N7 */
    public static final void m2700N7(FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
        C64858yi1 yi12;
        C64858yi1 yi13;
        finderAppPushRouteProxyUI.getClass();
        Class cls = C60200t1.class;
        C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(cls)).Nt0();
        String R1 = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(finderAppPushRouteProxyUI.mo2946Q7(), 2, 65);
        long j = 0;
        if (C37715b.f99914a.mo61298a()) {
            C55718s0 G5 = Nt0.mo77227G5("FinderLiveEntrance");
            if (!(G5 == null || (yi13 = G5.f158585F) == null)) {
                j = yi13.f186549g;
            }
            Log.m105924i("Finder.AppPushRouteProxyUI", "[handleLiveEntranceRedDot] objId=" + C61926c.m72691p(j) + " feedId=" + C61926c.m72691p(finderAppPushRouteProxyUI.mo2947R7()));
            if (finderAppPushRouteProxyUI.mo2947R7() == j) {
                finderAppPushRouteProxyUI.mo2949T7(Nt0, "FinderLiveEntrance", R1);
                C2483o0.f12984a.mo2452b(R1, 1, new C60165e4.C46105a(0, 0, 3, (C8480h) null));
                Nt0.mo77239M5("FinderLiveEntrance");
                finderAppPushRouteProxyUI.mo2949T7(Nt0, "Discovery", R1);
                C60152b4.C8759a.m8563c(Nt0, "Discovery", C14764g.f40740d, true, (String) null, 8, (Object) null);
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
            return;
        }
        C55718s0 G52 = Nt0.mo77227G5("NearbyEntrance");
        if (!(G52 == null || (yi12 = G52.f158585F) == null)) {
            j = yi12.f186549g;
        }
        Log.m105924i("Finder.AppPushRouteProxyUI", "[handleLiveEntranceRedDot] objId=" + C61926c.m72691p(j) + " feedId=" + C61926c.m72691p(finderAppPushRouteProxyUI.mo2947R7()));
        if (finderAppPushRouteProxyUI.mo2947R7() == j) {
            finderAppPushRouteProxyUI.mo2949T7(Nt0, "NearbyEntrance", R1);
            C2483o0.f12984a.mo2453c(R1, 1);
            Nt0.mo77239M5("NearbyEntrance");
            finderAppPushRouteProxyUI.mo2949T7(Nt0, "Discovery", R1);
            C60152b4.C8759a.m8563c(Nt0, "Discovery", C14769h.f40748d, true, (String) null, 8, (Object) null);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
    }

    /* renamed from: O7 */
    public final void mo2944O7(Intent intent) {
        Intent intent2 = intent;
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        if (intent2 != null) {
            if ((mo2945P7() & 1) != 0) {
                C55776r.f158805t = true;
            }
            if ((mo2945P7() & 4) != 0) {
                ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13352oU(mo2947R7());
            }
            long k = C75592q0.m90781k();
            JSONObject jSONObject = new JSONObject();
            if ((34359738368L & k) != 0) {
                long j = k & -34359738369L;
                C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(j));
                Log.m105924i("Finder.AppPushRouteProxyUI", "openFinderEntrance extstatus:" + j);
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 57;
                br12.f182325e = 1;
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
                Log.m105918d("Finder.AppPushRouteProxyUI", "openFinderEntrance switch functionId:" + br12.f182324d + " to " + br12.f182325e);
                jSONObject.put("if_enforce_disc_finder_on", 1);
                jSONObject.put("client_trigger_scene", (String) ((C36570n) this.f14211u).getValue());
            } else {
                jSONObject.put("if_enforce_disc_finder_on", 0);
                jSONObject.put("client_trigger_scene", (String) ((C36570n) this.f14211u).getValue());
            }
            C115669n nVar = C115669n.INSTANCE;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            nVar.mo160131h(23498, mo2948S7(), 1, Long.valueOf(System.currentTimeMillis()), C112551y.m153814n(jSONObject2, ",", ";", false), Integer.valueOf(((Number) ((C36570n) this.f14212v).getValue()).intValue()), Integer.valueOf(((Number) ((C36570n) this.f14213w).getValue()).intValue()), (String) ((C36570n) this.f14215y).getValue(), (String) ((C36570n) this.f14214x).getValue());
            intent2.putExtra("KEY_FROM_PATH", "appPush");
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62446e(cls).mo75002a(C11739f.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
            C11739f fVar = (C11739f) a;
            C11739f.C11740a c3 = fVar.mo11600c3(4);
            c3.f34376i = C11739f.C11742c.HardRefresh;
            c3.f34374g = -1;
            c3.f34377j = true;
            c3.f34378k = (((Number) ((C36570n) this.f14207q).getValue()).longValue() & 64) != 0;
            Log.m105924i("Finder.AppPushRouteProxyUI", "tabStateVM=" + fVar.hashCode() + " stateCache=" + c3.f34368a + " reset isAtAppPush=true");
            C58341h f3 = ((FinderStreamTabPreloadCore) rVar.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(4);
            if (f3 != null) {
                f3.mo83089e(false, "FinderAppPush");
            }
            if ((mo2945P7() & 16) == 0) {
                c3.f34369b.clear();
                C14937o.f40972a.mo13983d(8, "", C2867c.f14218d, true);
            }
            Class cls2 = C60200t1.class;
            String e7 = ((C60200t1) C86312j.m106911c(cls2)).mo76842e7(mo2946Q7(), 2, 20, getIntent());
            C58413v0.f167346a.getClass();
            C87412m.m108594g(e7, "<set-?>");
            C58413v0.f167347b = e7;
            C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(cls2)).Nt0();
            mo2949T7(Nt0, "FinderEntrance", e7);
            Nt0.mo77239M5("FinderEntrance");
            mo2949T7(Nt0, "TLPersonalCenter", e7);
            C60152b4.C8759a.m8563c(Nt0, "TLPersonalCenter", C14752e.f40726d, true, (String) null, 8, (Object) null);
            mo2949T7(Nt0, "Discovery", e7);
            C60152b4.C8759a.m8563c(Nt0, "Discovery", C14758f.f40732d, true, (String) null, 8, (Object) null);
            mo2949T7(Nt0, "TLFollow", e7);
            Nt0.mo77239M5("TLFollow");
            mo2949T7(Nt0, "TLRecommendTab", e7);
            Nt0.mo77239M5("TLRecommendTab");
            mo2949T7(Nt0, "finder_tl_hot_tab", e7);
            Nt0.mo77239M5("finder_tl_hot_tab");
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C58684b.by0((C58684b) c, context, intent, 0, false, 12, (Object) null);
        }
    }

    /* renamed from: P7 */
    public final long mo2945P7() {
        return ((Number) ((C36570n) this.f14209s).getValue()).longValue();
    }

    /* renamed from: Q7 */
    public final int mo2946Q7() {
        return (((Number) ((C36570n) this.f14207q).getValue()).longValue() & 64) != 0 ? 29 : 34;
    }

    /* renamed from: R7 */
    public final long mo2947R7() {
        return ((Number) ((C36570n) this.f14206p).getValue()).longValue();
    }

    /* renamed from: S7 */
    public final String mo2948S7() {
        return (String) ((C36570n) this.f14205o).getValue();
    }

    /* renamed from: T7 */
    public final void mo2949T7(C60152b4 b4Var, String str, String str2) {
        C55718s0 G5 = b4Var.mo77227G5(str);
        C64586nn1 R5 = b4Var.mo77246R5(str);
        if (G5 != null && R5 != null) {
            C58413v0.f167346a.mo83272k(G5, R5, 1, str2, 1);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqx;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8785n.f28044c = System.currentTimeMillis();
        String S7 = mo2948S7();
        C87412m.m108591d(S7);
        C8785n.f28042a = S7;
        String S72 = mo2948S7();
        C87412m.m108591d(S72);
        C8785n.f28043b = S72;
        if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 0) {
            C115669n.INSTANCE.mo160131h(23669, mo2948S7(), "route_create", Long.valueOf(System.currentTimeMillis()), "", 1, 1);
            mo2944O7(getIntent());
        } else if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 1) {
            C115669n.INSTANCE.mo160131h(23669, mo2948S7(), "route_create", Long.valueOf(System.currentTimeMillis()), "", 1, 2);
            String R1 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76802R1(mo2946Q7(), 2, 65);
            C49712hj1 hj12 = r2;
            C49712hj1 hj13 = new C49712hj1();
            hj13.f134671e = R1;
            C13598b0 b0Var = C13598b0.f38549a;
            C46547x1 x1Var = new C46547x1(mo2947R7(), (String) ((C36570n) this.f14210t).getValue(), 65, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 0, (C49946j51) null, false, 122816, (C8480h) null);
            C47350c cVar = x1Var.f256789f;
            C87412m.m108593f(cVar, "reqResp");
            cVar.setIsUserCmd(true);
            x1Var.mo9225i().mo123062e(new C2872h(this, R1));
        } else if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 2 && getIntent().getByteArrayExtra("KEY_JUMP_INFO") != null) {
            getIntent().putExtra("KEY_ROUTE_TO_TOPIC", true);
            mo2944O7(getIntent());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_trigger_scene", (String) ((C36570n) this.f14211u).getValue());
            C115669n nVar = C115669n.INSTANCE;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            nVar.mo160131h(23498, mo2948S7(), 1, Long.valueOf(System.currentTimeMillis()), C112551y.m153814n(jSONObject2, ",", ";", false), Integer.valueOf(((Number) ((C36570n) this.f14212v).getValue()).intValue()), Integer.valueOf(((Number) ((C36570n) this.f14213w).getValue()).intValue()), (String) ((C36570n) this.f14215y).getValue(), (String) ((C36570n) this.f14214x).getValue());
        }
        finish();
    }
}
