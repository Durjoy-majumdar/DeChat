package com.tencent.p014mm.plugin.finder.view;

import a14.C0000n0;
import a14.C53930o0;
import ak1.C54067f0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7919x;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ht1.C8817y2;
import java.util.HashMap;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49712hj1;
import tf0.C13887q1;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "g", "Lfy3/l;", "getClickBtnCall", "()Lfy3/l;", "setClickBtnCall", "(Lfy3/l;)V", "clickBtnCall", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView */
public final class FinderFeedLiveNoticeView extends LinearLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f17740i = 0;

    /* renamed from: d */
    public final C0000n0 f17741d = C53930o0.m60555b();

    /* renamed from: e */
    public final String f17742e = "Finder.FinderFeedLiveNoticeView";

    /* renamed from: f */
    public View f17743f;

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f17744g;

    /* renamed from: h */
    public long f17745h;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView$a */
    public static final class C3948a extends C87413o implements C32224a<C49098d51> {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f17746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3948a(C49098d51 d512) {
            super(0);
            this.f17746d = d512;
        }

        public Object invoke() {
            return this.f17746d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView$b */
    public static final class C3949b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f17747d;

        /* renamed from: e */
        public final /* synthetic */ Context f17748e;

        /* renamed from: f */
        public final /* synthetic */ String f17749f;

        /* renamed from: g */
        public final /* synthetic */ C49712hj1 f17750g;

        /* renamed from: h */
        public final /* synthetic */ FinderFeedLiveNoticeView f17751h;

        /* renamed from: i */
        public final /* synthetic */ NoticeStatusView f17752i;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView$b$a */
        public static final class C3950a extends C87413o implements C32224a<C49098d51> {

            /* renamed from: d */
            public final /* synthetic */ C49098d51 f17753d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3950a(C49098d51 d512) {
                super(0);
                this.f17753d = d512;
            }

            public Object invoke() {
                return this.f17753d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3949b(C49098d51 d512, Context context, String str, C49712hj1 hj12, FinderFeedLiveNoticeView finderFeedLiveNoticeView, NoticeStatusView noticeStatusView) {
            super(2);
            this.f17747d = d512;
            this.f17748e = context;
            this.f17749f = str;
            this.f17750g = hj12;
            this.f17751h = finderFeedLiveNoticeView;
            this.f17752i = noticeStatusView;
        }

        /* renamed from: a */
        public static final void m4159a(String str, Context context, NoticeStatusView noticeStatusView, C49098d51 d512, C49098d51 d513, int i) {
            String str2 = str;
            C49098d51 d514 = d513;
            Class cls = C13887q1.class;
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
            String str3 = d514.f132122h;
            C87412m.m108591d(str3);
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a((C13887q1) c, str, str3, i, ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(C13442s8.class)).mo12861q3(), ((MMActivity) context).getIntent().getStringExtra("key_promotion_token"), 0, (Long) null, 64, (Object) null));
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(cls);
            String str4 = d514.f132122h;
            String str5 = "";
            if (str4 == null) {
                str4 = str5;
            }
            if (q1Var.mo13343h4(str, str4) == null) {
                C13887q1 q1Var2 = (C13887q1) C86312j.m106911c(cls);
                String str6 = d514.f132122h;
                if (str6 != null) {
                    str5 = str6;
                }
                q1Var2.mo13325QY(str, str5, d514);
            } else {
                C13887q1 q1Var3 = (C13887q1) C86312j.m106911c(cls);
                String str7 = d514.f132122h;
                if (str7 != null) {
                    str5 = str7;
                }
                C49098d51 h4 = q1Var3.mo13343h4(str, str5);
                if (h4 != null) {
                    h4.f132119e = d514.f132119e;
                }
            }
            ((C8817y2) rVar.mo62444c(appCompatActivity).mo62447c(C8817y2.class)).mo9643v2().mo9648f0(str);
            noticeStatusView.mo5009f(str, new C3950a(d512));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
            if ((r5.length() > 0) == true) goto L_0x003e;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m4160b(te3.C49098d51 r27, java.lang.String r28, te3.C49712hj1 r29, com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView r30, android.content.Context r31, com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView r32) {
            /*
                r4 = r27
                r0 = r29
                r6 = r31
                r1 = 1
                r4.f132119e = r1
                c30.g r2 = new c30.g
                r2.<init>()
                r3 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                java.lang.String r7 = "source_type"
                r2.mo145967r(r7, r5)
                te3.nc3 r5 = r4.f132128q
                if (r5 == 0) goto L_0x0023
                boolean r5 = r5.f138532d
                if (r5 != r1) goto L_0x0023
                r5 = 1
                goto L_0x0024
            L_0x0023:
                r5 = 0
            L_0x0024:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r7 = "pay_type"
                r2.mo145967r(r7, r5)
                java.lang.String r5 = r4.f132126o
                if (r5 == 0) goto L_0x003d
                int r5 = r5.length()
                if (r5 <= 0) goto L_0x0039
                r5 = 1
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 != r1) goto L_0x003d
                goto L_0x003e
            L_0x003d:
                r1 = 0
            L_0x003e:
                java.lang.String r3 = ""
                if (r1 == 0) goto L_0x0045
                java.lang.String r1 = "get_ticket"
                goto L_0x0046
            L_0x0045:
                r1 = r3
            L_0x0046:
                java.lang.String r5 = "page_type"
                r2.mo145967r(r5, r1)
                java.lang.Class<mr.m> r1 = p204mr.C61568m.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r5 = "getService(IHellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r1, r5)
                r7 = r1
                mr.m r7 = (p204mr.C61568m) r7
                ak1.k0 r8 = ak1.C0077k0.Cancle
                r10 = 0
                r12 = 0
                int r1 = r0.f134675i
                java.lang.String r13 = java.lang.String.valueOf(r1)
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                java.lang.String r1 = r4.f132121g
                if (r1 != 0) goto L_0x0071
                r18 = r3
                goto L_0x0073
            L_0x0071:
                r18 = r1
            L_0x0073:
                java.lang.String r19 = r2.toString()
                java.lang.String r1 = r4.f132122h
                r21 = 0
                r2 = r30
                long r2 = r2.f17745h
                int r0 = r0.f134675i
                r24 = r0
                r25 = 4576(0x11e0, float:6.412E-42)
                r26 = 0
                r9 = r28
                r20 = r1
                r22 = r2
                p204mr.C61568m.C61569a.m72263a(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26)
                r5 = 2
                r0 = r28
                r1 = r31
                r2 = r32
                r3 = r27
                r4 = r27
                m4159a(r0, r1, r2, r3, r4, r5)
                r0 = 2131826250(0x7f11164a, float:1.928538E38)
                java.lang.String r0 = r6.getString(r0)
                r1 = 2131756010(0x7f1003ea, float:1.9142915E38)
                nj3.C76912y0.m92769h(r6, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView.C3949b.m4160b(te3.d51, java.lang.String, te3.hj1, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView, android.content.Context, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0208  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
            /*
                r33 = this;
                r0 = r33
                r1 = r34
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = r35
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
                te3.d51 r5 = r0.f17747d
                int r4 = r5.f132127p
                r11 = 1
                r6 = 0
                if (r4 != r11) goto L_0x001e
                r4 = 1
                goto L_0x001f
            L_0x001e:
                r4 = 0
            L_0x001f:
                r7 = -1
                if (r1 == r7) goto L_0x0296
                r5.f132119e = r6
                java.lang.String r5 = "getService(IHellLiveReport::class.java)"
                java.lang.String r7 = "activityId"
                java.lang.String r8 = "finder_username"
                java.lang.String r9 = ""
                if (r1 != r11) goto L_0x020e
                java.lang.Class<sr.e> r1 = p687sr.C64153e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                sr.e r1 = (p687sr.C64153e) r1
                android.content.Context r10 = r0.f17748e
                r12 = 2
                com.tencent.mm.plugin.finder.view.l2 r13 = new com.tencent.mm.plugin.finder.view.l2
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r14 = r0.f17751h
                te3.d51 r15 = r0.f17747d
                r13.<init>(r14, r4, r15)
                r1.jc0(r10, r12, r6, r13)
                c30.g r1 = new c30.g
                r1.<init>()
                if (r2 != r11) goto L_0x004e
                r2 = 1
                goto L_0x004f
            L_0x004e:
                r2 = 0
            L_0x004f:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r10 = "source_type"
                r1.mo145967r(r10, r2)
                te3.d51 r2 = r0.f17747d
                te3.nc3 r2 = r2.f132128q
                if (r2 == 0) goto L_0x0065
                boolean r2 = r2.f138532d
                if (r2 != r11) goto L_0x0065
                r2 = 1
                goto L_0x0066
            L_0x0065:
                r2 = 0
            L_0x0066:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r10 = "pay_type"
                r1.mo145967r(r10, r2)
                te3.d51 r2 = r0.f17747d
                java.lang.String r2 = r2.f132126o
                if (r2 == 0) goto L_0x0082
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x007d
                r2 = 1
                goto L_0x007e
            L_0x007d:
                r2 = 0
            L_0x007e:
                if (r2 != r11) goto L_0x0082
                r2 = 1
                goto L_0x0083
            L_0x0082:
                r2 = 0
            L_0x0083:
                if (r2 == 0) goto L_0x0088
                java.lang.String r2 = "get_ticket"
                goto L_0x0089
            L_0x0088:
                r2 = r9
            L_0x0089:
                java.lang.String r10 = "page_type"
                r1.mo145967r(r10, r2)
                c30.g r2 = new c30.g
                r2.<init>()
                te3.d51 r10 = r0.f17747d
                te3.uk1 r10 = er1.C7802g1.m7949a(r10)
                if (r10 == 0) goto L_0x009e
                java.lang.String r10 = r10.f142894e
                goto L_0x009f
            L_0x009e:
                r10 = 0
            L_0x009f:
                java.lang.String r12 = "coupon_id"
                r2.put(r12, r10)
                java.lang.String r10 = "ui_position"
                r2.mo145953n(r10, r11)
                java.lang.Class<mr.m> r10 = p204mr.C61568m.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                java.lang.String r11 = "getService(IHellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r10, r11)
                r12 = r10
                mr.m r12 = (p204mr.C61568m) r12
                ak1.k0 r13 = ak1.C0077k0.Book
                java.lang.String r14 = r0.f17749f
                r15 = 0
                r17 = 0
                te3.hj1 r10 = r0.f17750g
                int r10 = r10.f134675i
                java.lang.String r18 = java.lang.String.valueOf(r10)
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                te3.d51 r10 = r0.f17747d
                if (r10 == 0) goto L_0x00dc
                java.lang.String r10 = r10.f132121g
                if (r10 != 0) goto L_0x00d9
                goto L_0x00dc
            L_0x00d9:
                r23 = r10
                goto L_0x00de
            L_0x00dc:
                r23 = r9
            L_0x00de:
                java.lang.String r24 = r1.toString()
                te3.d51 r1 = r0.f17747d
                java.lang.String r1 = r1.f132122h
                r25 = r1
                java.lang.String r26 = r2.toString()
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r1 = r0.f17751h
                long r1 = r1.f17745h
                r27 = r1
                te3.hj1 r1 = r0.f17750g
                int r1 = r1.f134675i
                r29 = r1
                r30 = 480(0x1e0, float:6.73E-43)
                r31 = 0
                p204mr.C61568m.C61569a.m72263a(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
                if (r4 == 0) goto L_0x01ee
                te3.hj1 r1 = r0.f17750g
                java.lang.String r2 = r0.f17749f
                android.content.Context r10 = r0.f17748e
                com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r15 = r0.f17752i
                te3.d51 r14 = r0.f17747d
                java.lang.Class<tf0.q1> r20 = tf0.C13887q1.class
                java.util.HashMap r11 = new java.util.HashMap
                r11.<init>()
                r11.put(r8, r2)
                java.lang.String r12 = r14.f132126o
                if (r12 != 0) goto L_0x011a
                r12 = r9
            L_0x011a:
                r11.put(r7, r12)
                di3.d r12 = di3.C86312j.m106911c(r3)
                gy3.C87412m.m108593f(r12, r5)
                r21 = r12
                ht1.j5 r21 = (ht1.C8777j5) r21
                ak1.f0$m r22 = ak1.C54067f0.C0064m.LIVE_CONCERT_PROFILE_RECIVE
                java.lang.String r12 = r1.f134671e
                int r1 = r1.f134675i
                java.lang.String r25 = java.lang.String.valueOf(r1)
                r26 = 0
                r27 = 16
                r28 = 0
                r23 = r11
                r24 = r12
                ht1.C8777j5.C8778a.m8607h(r21, r22, r23, r24, r25, r26, r27, r28)
                di3.d r1 = di3.C86312j.m106911c(r20)
                java.lang.String r11 = "getService(IFinderCommonLiveService::class.java)"
                gy3.C87412m.m108593f(r1, r11)
                tf0.q1 r1 = (tf0.C13887q1) r1
                java.lang.String r12 = r14.f132122h
                gy3.C87412m.m108591d(r12)
                bl3.r r13 = bl3.C39818r.f106831a
                r11 = r10
                androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
                bl3.r$a r6 = r13.mo62444c(r11)
                r35 = r9
                java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
                androidx.lifecycle.i0 r6 = r6.mo75002a(r9)
                rs1.s8 r6 = (rs1.C13442s8) r6
                te3.hj1 r6 = r6.mo12861q3()
                com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
                android.content.Intent r9 = r10.getIntent()
                java.lang.String r10 = "key_promotion_token"
                java.lang.String r9 = r9.getStringExtra(r10)
                r10 = 0
                java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
                r17 = 0
                r18 = 64
                r19 = 0
                r21 = 1
                r10 = r1
                r1 = r11
                r11 = r2
                r34 = r5
                r5 = r13
                r13 = r21
                r32 = r14
                r14 = r6
                r6 = r15
                r15 = r9
                ob0.y r9 = tf0.C13887q1.C13888a.m13305a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                ob0.b0 r10 = f40.C86709a0.m107524d()
                r10.mo123460f(r9)
                di3.d r9 = di3.C86312j.m106911c(r20)
                tf0.q1 r9 = (tf0.C13887q1) r9
                r10 = r32
                java.lang.String r11 = r10.f132122h
                if (r11 != 0) goto L_0x01a5
                r11 = r35
            L_0x01a5:
                te3.d51 r9 = r9.mo13343h4(r2, r11)
                if (r9 != 0) goto L_0x01bb
                di3.d r9 = di3.C86312j.m106911c(r20)
                tf0.q1 r9 = (tf0.C13887q1) r9
                java.lang.String r11 = r10.f132122h
                if (r11 != 0) goto L_0x01b7
                r11 = r35
            L_0x01b7:
                r9.mo13325QY(r2, r11, r10)
                goto L_0x01d2
            L_0x01bb:
                di3.d r9 = di3.C86312j.m106911c(r20)
                tf0.q1 r9 = (tf0.C13887q1) r9
                java.lang.String r11 = r10.f132122h
                if (r11 != 0) goto L_0x01c7
                r11 = r35
            L_0x01c7:
                te3.d51 r9 = r9.mo13343h4(r2, r11)
                if (r9 != 0) goto L_0x01ce
                goto L_0x01d2
            L_0x01ce:
                int r11 = r10.f132119e
                r9.f132119e = r11
            L_0x01d2:
                bl3.r$a r1 = r5.mo62444c(r1)
                java.lang.Class<ht1.y2> r5 = ht1.C8817y2.class
                bl3.c r1 = r1.mo62447c(r5)
                ht1.y2 r1 = (ht1.C8817y2) r1
                ht1.z2 r1 = r1.mo9643v2()
                r1.mo9648f0(r2)
                com.tencent.mm.plugin.finder.view.n2 r1 = new com.tencent.mm.plugin.finder.view.n2
                r1.<init>(r10)
                r6.mo5009f(r2, r1)
                goto L_0x0200
            L_0x01ee:
                r34 = r5
                r35 = r9
                java.lang.String r11 = r0.f17749f
                android.content.Context r12 = r0.f17748e
                com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r13 = r0.f17752i
                te3.d51 r15 = r0.f17747d
                r16 = 1
                r14 = r15
                m4159a(r11, r12, r13, r14, r15, r16)
            L_0x0200:
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r1 = r0.f17751h
                fy3.l r1 = r1.getClickBtnCall()
                if (r1 == 0) goto L_0x0212
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r1.invoke(r2)
                goto L_0x0212
            L_0x020e:
                r34 = r5
                r35 = r9
            L_0x0212:
                if (r4 == 0) goto L_0x02e4
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r1 = r0.f17751h
                te3.d51 r2 = r0.f17747d
                java.lang.String r4 = r0.f17749f
                int r5 = com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView.f17740i
                r1.getClass()
                je1.z0 r5 = new je1.z0
                java.lang.String r6 = r2.f132126o
                if (r6 != 0) goto L_0x0228
                r10 = r35
                goto L_0x0229
            L_0x0228:
                r10 = r6
            L_0x0229:
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                java.lang.String r2 = r2.f132122h
                if (r2 != 0) goto L_0x0236
                r17 = r35
                goto L_0x0238
            L_0x0236:
                r17 = r2
            L_0x0238:
                r18 = 1
                r19 = 0
                r20 = 158(0x9e, float:2.21E-43)
                r21 = 0
                r9 = r5
                r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
                nr3.e r2 = r5.mo9225i()
                android.content.Context r5 = r1.getContext()
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r5, r6)
                com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
                r2.mo11397F(r5)
                com.tencent.mm.plugin.finder.view.e2 r5 = new com.tencent.mm.plugin.finder.view.e2
                r5.<init>(r1, r4)
                r2.mo123420E(r5)
                java.util.HashMap r11 = new java.util.HashMap
                r11.<init>()
                java.lang.String r1 = r0.f17749f
                te3.d51 r2 = r0.f17747d
                r11.put(r8, r1)
                java.lang.String r1 = r2.f132126o
                if (r1 != 0) goto L_0x0271
                r9 = r35
                goto L_0x0272
            L_0x0271:
                r9 = r1
            L_0x0272:
                r11.put(r7, r9)
                di3.d r1 = di3.C86312j.m106911c(r3)
                r2 = r34
                gy3.C87412m.m108593f(r1, r2)
                r9 = r1
                ht1.j5 r9 = (ht1.C8777j5) r9
                ak1.f0$m r10 = ak1.C54067f0.C0064m.CONCERT_TICKETS_FEED_ME
                te3.hj1 r1 = r0.f17750g
                java.lang.String r12 = r1.f134671e
                int r1 = r1.f134675i
                java.lang.String r13 = java.lang.String.valueOf(r1)
                r14 = 0
                r15 = 16
                r16 = 0
                ht1.C8777j5.C8778a.m8607h(r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x02e4
            L_0x0296:
                if (r4 != 0) goto L_0x02e4
                if (r2 == 0) goto L_0x02aa
                java.lang.String r1 = r0.f17749f
                te3.hj1 r6 = r0.f17750g
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r7 = r0.f17751h
                android.content.Context r8 = r0.f17748e
                com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r9 = r0.f17752i
                r4 = r5
                r5 = r1
                m4160b(r4, r5, r6, r7, r8, r9)
                goto L_0x02d7
            L_0x02aa:
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r1 = r0.f17751h
                java.lang.String r6 = r0.f17749f
                com.tencent.mm.plugin.finder.view.m2 r2 = new com.tencent.mm.plugin.finder.view.m2
                te3.hj1 r7 = r0.f17750g
                android.content.Context r9 = r0.f17748e
                com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r10 = r0.f17752i
                r4 = r2
                r8 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10)
                int r3 = com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView.f17740i
                qo3.n r3 = new qo3.n
                android.content.Context r4 = r1.getContext()
                r3.<init>((android.content.Context) r4, (int) r11, (boolean) r11)
                com.tencent.mm.plugin.finder.view.h2 r4 = new com.tencent.mm.plugin.finder.view.h2
                r4.<init>(r1)
                r3.f225771i = r4
                com.tencent.mm.plugin.finder.view.i2 r1 = new com.tencent.mm.plugin.finder.view.i2
                r1.<init>(r2)
                r3.f225782p = r1
                r3.mo107573q()
            L_0x02d7:
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r1 = r0.f17751h
                fy3.l r1 = r1.getClickBtnCall()
                if (r1 == 0) goto L_0x02e4
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.invoke(r2)
            L_0x02e4:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView.C3949b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public FinderFeedLiveNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f359684ab0, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…live_notice_layout, this)");
        this.f17743f = inflate;
        inflate.setOnClickListener(new C4029c2(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if ((r7.length() > 0) == true) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m4157a(com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView r31) {
        /*
            r0 = r31
            java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
            android.view.View r2 = r0.f17743f
            r3 = 2131304056(0x7f091e78, float:1.8226244E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r2 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r2
            if (r2 == 0) goto L_0x0187
            fy3.a r3 = r2.getNoticeFuncRef()
            if (r3 == 0) goto L_0x0187
            java.lang.Object r4 = r3.invoke()
            te3.d51 r4 = (te3.C49098d51) r4
            te3.cz r4 = r4.f132131t
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = r4.f132034f
            if (r4 == 0) goto L_0x0034
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 != r5) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            java.lang.String r7 = "context"
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x009c
            java.lang.Class<e00.x> r1 = e00.C7578x.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IHalfScreenService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r9 = r1
            e00.x r9 = (e00.C7578x) r9
            android.content.Context r10 = r31.getContext()
            gy3.C87412m.m108593f(r10, r7)
            java.lang.Object r0 = r3.invoke()
            te3.d51 r0 = (te3.C49098d51) r0
            te3.cz r0 = r0.f132131t
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r0.f132034f
            if (r0 != 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r11 = r0
            goto L_0x0062
        L_0x0061:
            r11 = r8
        L_0x0062:
            r12 = 0
            com.tencent.mm.plugin.webview.ui.tools.widget.u r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.u
            r13 = r0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 32767(0x7fff, float:4.5916E-41)
            r30 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.f120219d = r6
            r1 = -1
            r0.f120220e = r1
            r0.f120228m = r6
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r14 = 4
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = e00.C7578x.C7579a.m7714a(r9, r10, r11, r12, r13, r14, r15)
            r0.show()
            goto L_0x0187
        L_0x009c:
            hs1.e r4 = new hs1.e
            android.content.Context r9 = r31.getContext()
            gy3.C87412m.m108593f(r9, r7)
            r4.<init>(r9)
            java.lang.String r7 = r2.getUsername()
            com.tencent.mm.plugin.finder.view.k2 r9 = new com.tencent.mm.plugin.finder.view.k2
            r9.<init>(r0, r3, r4, r2)
            r4.mo9570b(r7, r3, r9)
            c30.g r4 = new c30.g
            r4.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r9 = "source_type"
            r4.mo145967r(r9, r7)
            java.lang.Object r7 = r3.invoke()
            te3.d51 r7 = (te3.C49098d51) r7
            te3.nc3 r7 = r7.f132128q
            if (r7 == 0) goto L_0x00d3
            boolean r7 = r7.f138532d
            if (r7 != r5) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "pay_type"
            r4.mo145967r(r9, r7)
            java.lang.Object r7 = r3.invoke()
            te3.d51 r7 = (te3.C49098d51) r7
            java.lang.String r7 = r7.f132126o
            if (r7 == 0) goto L_0x00f3
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00ef
            r7 = 1
            goto L_0x00f0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            if (r7 != r5) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r5 = 0
        L_0x00f4:
            if (r5 == 0) goto L_0x00f9
            java.lang.String r5 = "get_ticket"
            goto L_0x00fa
        L_0x00f9:
            r5 = r8
        L_0x00fa:
            java.lang.String r6 = "page_type"
            r4.mo145967r(r6, r5)
            bl3.r r5 = bl3.C39818r.f106831a
            android.content.Context r6 = r31.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r6, r7)
            com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
            bl3.r$a r6 = r5.mo62444c(r6)
            androidx.lifecycle.i0 r6 = r6.mo75002a(r1)
            rs1.s8 r6 = (rs1.C13442s8) r6
            te3.hj1 r6 = r6.mo12861q3()
            java.lang.Class<mr.m> r9 = p204mr.C61568m.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            java.lang.String r10 = "getService(IHellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r9, r10)
            r11 = r9
            mr.m r11 = (p204mr.C61568m) r11
            ak1.k0 r12 = ak1.C0077k0.ExposeProfile
            java.lang.String r13 = r2.getUsername()
            r14 = 0
            r16 = 0
            int r2 = r6.f134675i
            java.lang.String r17 = java.lang.String.valueOf(r2)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            java.lang.Object r2 = r3.invoke()
            te3.d51 r2 = (te3.C49098d51) r2
            java.lang.String r2 = r2.f132121g
            if (r2 != 0) goto L_0x014d
            r22 = r8
            goto L_0x014f
        L_0x014d:
            r22 = r2
        L_0x014f:
            java.lang.String r23 = r4.toString()
            java.lang.Object r2 = r3.invoke()
            te3.d51 r2 = (te3.C49098d51) r2
            java.lang.String r2 = r2.f132122h
            r24 = r2
            r25 = 0
            long r2 = r0.f17745h
            r26 = r2
            android.view.View r0 = r0.f17743f
            android.content.Context r0 = r0.getContext()
            gy3.C87412m.m108592e(r0, r7)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            bl3.r$a r0 = r5.mo62444c(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
            int r0 = r0.f134675i
            r28 = r0
            r29 = 4576(0x11e0, float:6.412E-42)
            r30 = 0
            p204mr.C61568m.C61569a.m72263a(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView.m4157a(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView):void");
    }

    /* renamed from: b */
    public final void mo4524b(Context context, C49098d51 d512, String str, boolean z, Long l) {
        Context context2 = context;
        C49098d51 d513 = d512;
        String str2 = str;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(d513, "noticeInfo");
        C87412m.m108594g(str2, "username");
        MMActivity mMActivity = (MMActivity) context2;
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C13442s8.class)).mo12861q3();
        NoticeStatusView noticeStatusView = (NoticeStatusView) this.f17743f.findViewById(C0966R.C0970id.nen);
        noticeStatusView.mo5009f(str2, new C3948a(d513));
        this.f17745h = l != null ? l.longValue() : 0;
        String valueOf = String.valueOf(q3.f134675i);
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(noticeStatusView, "live_reserve_bar");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(noticeStatusView, 8, 25653);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(noticeStatusView, 32, 25652);
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(noticeStatusView, C90364q0.m113149h(C90364q0.m113147f(new C13604l("finder_username", str2), new C13604l("comment_scene", valueOf), new C13604l("live_notice_id", d513.f132122h), new C13604l("show_type", 0)), C58784w3.f168295a.mo83877J()));
        ((C61212e) C86312j.m106911c(cls)).E60(noticeStatusView, new C4052f2(d513));
        C23564m.m28138h(noticeStatusView, new C4057g2(d513, this, str2));
        TextView textView = (TextView) this.f17743f.findViewById(C0966R.C0970id.d9w);
        TextView textView2 = (TextView) this.f17743f.findViewById(C0966R.C0970id.lzp);
        WeImageView weImageView = (WeImageView) this.f17743f.findViewById(C0966R.C0970id.lzq);
        if (C76577a.m92165p(context) >= 1.55f) {
            textView2.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.35d));
            textView.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.35d));
        } else if (C76577a.m92165p(context) >= 1.125f) {
            textView2.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.4d));
            textView.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.4d));
        } else {
            textView2.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.45d));
            textView.setMaxWidth((int) (((double) mMActivity.getResources().getDisplayMetrics().widthPixels) * 0.45d));
        }
        Resources resources = mMActivity.getResources();
        C58739j4 j4Var = C58739j4.f168176a;
        String string = resources.getString(C0966R.string.d9f, new Object[]{C58739j4.m68254u(j4Var, ((long) d513.f132118d) * ((long) 1000), (Boolean) null, false, 2, (Object) null)});
        C87412m.m108593f(string, "context.resources.getStr…, needDayOfWeek = false))");
        textView.setText(string);
        textView.setTag(C0966R.C0970id.lzw, string);
        textView2.setTextSize(1, C76577a.m92165p(context) * 14.0f);
        String str3 = d513.f132121g;
        String str4 = "";
        if (!(str3 == null || str3.length() == 0)) {
            textView.setTextSize(1, C76577a.m92165p(context) * 12.0f);
            textView.setTextColor(getResources().getColor(C0966R.color.f3583yg));
            String str5 = d513.f132121g;
            if (str5 == null) {
                str5 = str4;
            }
            String E = j4Var.mo83677E(str5);
            textView2.setText(E);
            textView2.setTag(C0966R.C0970id.lzs, E);
            C7919x.m8091a(textView2);
            textView2.setVisibility(0);
            C7919x.m8092b(textView);
        } else {
            C7919x.m8091a(textView);
            textView.setTextSize(1, C76577a.m92165p(context) * 14.0f);
            textView.setTextColor(getResources().getColor(C0966R.color.f3585yj));
            textView2.setVisibility(8);
        }
        if (z) {
            weImageView.setIconColor(mMActivity.getResources().getColor(C0966R.color.f3441zk));
            findViewById(C0966R.C0970id.d9v).setBackgroundResource(C0966R.C0969drawable.f5100wr);
        } else {
            weImageView.setIconColor(mMActivity.getResources().getColor(C0966R.color.f3441zk));
            findViewById(C0966R.C0970id.d9v).setBackgroundResource(C0966R.C0969drawable.f5100wr);
        }
        if (d513.f132119e == 1) {
            setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put("feedId", String.valueOf(l));
            String str6 = d513.f132126o;
            if (str6 != null) {
                str4 = str6;
            }
            hashMap.put("activityId", str4);
            ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9602Jz(C54067f0.C0066n.LIVE_CONCERT_FEEDS_RECIVE, hashMap);
        }
        if (getVisibility() == 0) {
            noticeStatusView.setProgressDoneAndNextAction(new C3949b(d512, context, str, q3, this, noticeStatusView));
        }
    }

    public final C32226l<Boolean, C13598b0> getClickBtnCall() {
        return this.f17744g;
    }

    public final void setClickBtnCall(C32226l<? super Boolean, C13598b0> lVar) {
        this.f17744g = lVar;
    }

    public FinderFeedLiveNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f359684ab0, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…live_notice_layout, this)");
        this.f17743f = inflate;
        inflate.setOnClickListener(new C4029c2(this));
    }
}
