package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0751m0;
import cm1.C0768q0;
import cm1.C55018j0;
import cm1.C55031t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.convert.C2422e;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import da0.C58247e;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7433e1;
import dp1.C7435f2;
import ef1.C7639h;
import ef1.C7641j;
import er1.C58684b;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58745l0;
import er1.C58771q3;
import er1.C58784w3;
import er1.C7842n2;
import er1.C7853p2;
import er1.C7881t2;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gr1.C59667n2;
import gr1.C59670o2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je1.C46547x1;
import je1.C60811w;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10000u5;
import kf1.C10008v1;
import kf1.C10025w5;
import kf1.C10055y5;
import kf1.C9697e6;
import kf1.C9868n5;
import l31.C61212e;
import ms3.C11091a;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import org.json.JSONObject;
import p166hy.C98567o0;
import pe3.C89349b;
import pf1.C62262d0;
import qo3.C77407n;
import qt1.C12931a;
import rs1.C13133c1;
import rs1.C13194da;
import rs1.C13354o6;
import rs1.C13442s8;
import rs1.C13452t2;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63575n3;
import rs1.C63648v;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sf1.C13671a;
import sx3.C26236u;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50542nh0;
import te3.C51954xc1;
import te3.C64237ap1;
import te3.C64273c21;
import tf0.C64916p1;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;
import wc3.C15133e0;
import wp1.C15587j;
import wp1.C66164a;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.n */
public final class C2829n implements C10008v1 {

    /* renamed from: d */
    public final MMActivity f14111d;

    /* renamed from: e */
    public final FinderVideoCore f14112e = new FinderVideoCore(0, 1, (C8480h) null);

    /* renamed from: f */
    public final int f14113f;

    /* renamed from: g */
    public final C15133e0 f14114g;

    /* renamed from: h */
    public final C13601g f14115h;

    /* renamed from: i */
    public final C13601g f14116i;

    /* renamed from: j */
    public final C13601g f14117j;

    /* renamed from: n */
    public final C13601g f14118n;

    /* renamed from: o */
    public final C13601g f14119o;

    /* renamed from: p */
    public final C13601g f14120p;

    /* renamed from: q */
    public FinderFeedShareRelativeListLoader f14121q;

    /* renamed from: r */
    public C9868n5 f14122r;

    /* renamed from: s */
    public int f14123s;

    /* renamed from: t */
    public long f14124t;

    /* renamed from: u */
    public String f14125u;

    /* renamed from: v */
    public String f14126v;

    /* renamed from: w */
    public C55018j0 f14127w;

    /* renamed from: x */
    public final C13601g f14128x;

    /* renamed from: y */
    public final Runnable f14129y;

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$a */
    public static final class C2830a extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2830a(C2829n nVar) {
            super(0);
            this.f14130d = nVar;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f14130d.f14111d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$b */
    public static final class C2831b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2831b(C2829n nVar) {
            super(0);
            this.f14131d = nVar;
        }

        public Object invoke() {
            return this.f14131d.f14111d.findViewById(C0966R.C0970id.f357793n71);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$c */
    public static final class C2832c extends C87413o implements C32224a<C2422e> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2832c(C2829n nVar) {
            super(0);
            this.f14132d = nVar;
        }

        public Object invoke() {
            C2829n nVar = this.f14132d;
            return new C2422e(nVar.f14112e, nVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$d */
    public static final class C2833d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f14133d;

        /* renamed from: e */
        public final /* synthetic */ C2829n f14134e;

        /* renamed from: f */
        public final /* synthetic */ MenuItem f14135f;

        /* renamed from: g */
        public final /* synthetic */ int f14136g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2833d(BaseFinderFeed baseFinderFeed, C2829n nVar, MenuItem menuItem, int i) {
            super(1);
            this.f14133d = baseFinderFeed;
            this.f14134e = nVar;
            this.f14135f = menuItem;
            this.f14136g = i;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Class cls = C64916p1.class;
            C87412m.m108594g(str, "userName");
            if (this.f14133d.mo3513o().isLiveFeed()) {
                String str2 = str;
                ((C64916p1) C86312j.m106911c(cls)).mo76724vV(this.f14134e.f14111d, str2, (C76875f0) this.f14135f, this.f14133d.mo3513o(), new C2853o(this.f14133d));
            } else {
                String str3 = str;
                ((C64916p1) C86312j.m106911c(cls)).mo76652BO(this.f14134e.f14111d, str3, (C76875f0) this.f14135f, this.f14133d.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
            }
            C7433e1.f25622a.mo8575d(this.f14134e.f14111d, str, this.f14133d.getItemId(), this.f14136g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$e */
    public static final class C2834e extends C87413o implements C32226l<List<? extends String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f14137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2834e(BaseFinderFeed baseFinderFeed) {
            super(1);
            this.f14137d = baseFinderFeed;
        }

        public Object invoke(Object obj) {
            List<String> list = (List) obj;
            if (this.f14137d.mo3513o().isLiveFeed()) {
                String str = "";
                JSONObject jSONObject = new JSONObject();
                if (list != null) {
                    for (String str2 : list) {
                        str = str + str2 + ';';
                    }
                }
                Long l = null;
                if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                    str = str.substring(0, str.length() - 1);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONObject.put("share_username", str);
                C11091a aVar = C11091a.f32868a;
                C64273c21 liveInfo = this.f14137d.mo3513o().getLiveInfo();
                if (liveInfo != null) {
                    l = Long.valueOf(liveInfo.f182392d);
                }
                C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f14137d.mo3513o().getFeedObject().f164794id), this.f14137d.mo3513o().getFeedObject().username, "1", "1", "0", jSONObject, (String) null, 128, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$f */
    public static final class C2835f implements C8794p5<C51954xc1> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14138d;

        public C2835f(C2829n nVar) {
            this.f14138d = nVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C51954xc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0) {
                C76912y0.makeText((Context) this.f14138d.f14111d, (int) C0966R.string.d9x, 0).show();
                return;
            }
            C76912y0.makeText((Context) this.f14138d.f14111d, (int) C0966R.string.d9w, 0).show();
            Log.m105924i("FinderLongVideoShareContract", "finder_feed_open_comment_no_ok " + nh02.f138603e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$g */
    public static final class C2836g implements C8794p5<C51954xc1> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14139d;

        public C2836g(C2829n nVar) {
            this.f14139d = nVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C51954xc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0) {
                C76912y0.makeText((Context) this.f14139d.f14111d, (int) C0966R.string.d8t, 0).show();
                return;
            }
            C76912y0.makeText((Context) this.f14139d.f14111d, (int) C0966R.string.d8s, 0).show();
            Log.m105924i("FinderLongVideoShareContract", "finder_feed_close_comment_ok " + nh02.f138603e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$h */
    public static final class C2837h extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f14140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2837h(Object obj) {
            super(1);
            this.f14140d = obj;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            Object obj2 = this.f14140d;
            if (obj2 != null) {
                ((C59667n2) obj2).mo4259i("FinderLongVideoShareContract");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$i */
    public static final class C2838i extends C87413o implements C32224a<FinderLongVideoShareContract$feedChangeListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2838i(C2829n nVar) {
            super(0);
            this.f14141d = nVar;
        }

        public Object invoke() {
            C2829n nVar = this.f14141d;
            return new FinderLongVideoShareContract$feedChangeListener$2$1(nVar, nVar.f14111d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$j */
    public static final class C2839j implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14142d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f14143e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f14144f;

        public C2839j(C2829n nVar, BaseFinderFeed baseFinderFeed, C77407n nVar2, int i) {
            this.f14142d = nVar;
            this.f14143e = baseFinderFeed;
            this.f14144f = nVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00c7, code lost:
            r1 = r1.video_tmpl_info;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x024f  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x028f  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0297  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r28) {
            /*
                r27 = this;
                r0 = r27
                r7 = r28
                com.tencent.mm.plugin.finder.feed.n r8 = r0.f14142d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f14143e
                java.lang.String r1 = "menu"
                gy3.C87412m.m108593f(r7, r1)
                qo3.n r1 = r0.f14144f
                r8.getClass()
                java.lang.Class<dp1.y0> r17 = dp1.C58417y0.class
                java.lang.String r2 = "feed"
                gy3.C87412m.m108594g(r6, r2)
                java.lang.String r2 = "sheet"
                gy3.C87412m.m108594g(r1, r2)
                er1.w3 r5 = er1.C58784w3.f168295a
                com.tencent.mm.ui.MMActivity r10 = r8.f14111d
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 28
                r16 = 0
                r9 = r5
                r11 = r6
                er1.w3$a r9 = er1.C58784w3.m68431K(r9, r10, r11, r12, r13, r14, r15, r16)
                boolean r10 = r9.f26579a
                boolean r11 = r9.f26580b
                java.lang.String r3 = r9.f26583e
                java.lang.String r12 = r9.f26584f
                boolean r1 = r9.f26587i
                r13 = 2131099756(0x7f06006c, float:1.7811874E38)
                if (r1 != 0) goto L_0x0058
                r2 = 102(0x66, float:1.43E-43)
                r4 = 2131755655(0x7f100287, float:1.9142195E38)
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                android.content.res.Resources r1 = r1.getResources()
                int r14 = r1.getColor(r13)
                r1 = r28
                r15 = r5
                r5 = r14
                r14 = r6
                r6 = r10
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x005a
            L_0x0058:
                r15 = r5
                r14 = r6
            L_0x005a:
                boolean r1 = r9.f26588j
                if (r1 != 0) goto L_0x006b
                r2 = 103(0x67, float:1.44E-43)
                r4 = 2131755285(0x7f100115, float:1.9141445E38)
                r5 = 0
                r1 = r28
                r3 = r12
                r6 = r11
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x006b:
                up1.f r1 = up1.C37521f.f99374d
                r1.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r10 = 1
                if (r1 != r10) goto L_0x00bb
                boolean r1 = r9.f26589k
                if (r1 != 0) goto L_0x00bb
                r2 = 104(0x68, float:1.46E-43)
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131755278(0x7f10010e, float:1.914143E38)
                r5 = 0
                boolean r6 = r9.f26591m
                r1 = r28
                r1.mo107150j(r2, r3, r4, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r17)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r18 = r1
                dp1.y0 r18 = (dp1.C58417y0) r18
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r20 = 0
                long r21 = r14.getItemId()
                boolean r2 = r9.f26591m
                r24 = 2
                r25 = 0
                r19 = r1
                r23 = r2
                dp1.C58417y0.Qy0(r18, r19, r20, r21, r23, r24, r25)
            L_0x00bb:
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x00ce
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x00ce
                java.lang.String r1 = r1.f182115d
                goto L_0x00cf
            L_0x00ce:
                r1 = 0
            L_0x00cf:
                r11 = 0
                if (r1 == 0) goto L_0x00db
                int r1 = r1.length()
                if (r1 != 0) goto L_0x00d9
                goto L_0x00db
            L_0x00d9:
                r1 = 0
                goto L_0x00dc
            L_0x00db:
                r1 = 1
            L_0x00dc:
                r12 = 99999(0x1869f, float:1.40128E-40)
                r6 = 9999(0x270f, float:1.4012E-41)
                r5 = 2131826812(0x7f11187c, float:1.9286519E38)
                if (r1 != 0) goto L_0x0224
                java.lang.Class<da0.e> r1 = da0.C58247e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                da0.e r1 = (da0.C58247e) r1
                da0.b r1 = r1.yf0()
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x0109
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x0109
                te3.yq4 r2 = r2.f182120i
                if (r2 == 0) goto L_0x0109
                int r2 = r2.f145473f
                goto L_0x010a
            L_0x0109:
                r2 = 0
            L_0x010a:
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0121
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0121
                te3.yq4 r3 = r3.f182120i
                if (r3 == 0) goto L_0x0121
                int r3 = r3.f145474g
                goto L_0x0122
            L_0x0121:
                r3 = 0
            L_0x0122:
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x0135
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x0135
                int r4 = r4.f182116e
                goto L_0x0136
            L_0x0135:
                r4 = -1
            L_0x0136:
                boolean r1 = r1.mo8428c(r2, r3, r4)
                if (r1 == 0) goto L_0x0224
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x014f
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x014f
                int r1 = r1.f182118g
                goto L_0x0150
            L_0x014f:
                r1 = 0
            L_0x0150:
                r2 = 2
                if (r1 <= 0) goto L_0x0196
                com.tencent.mm.ui.MMActivity r3 = r8.f14111d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x016b
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x016b
                int r4 = r4.f182116e
                if (r4 != r2) goto L_0x016b
                r2 = 1
                goto L_0x016c
            L_0x016b:
                r2 = 0
            L_0x016c:
                if (r2 == 0) goto L_0x0172
                r2 = 2131829893(0x7f112485, float:1.9292768E38)
                goto L_0x0175
            L_0x0172:
                r2 = 2131829901(0x7f11248d, float:1.9292784E38)
            L_0x0175:
                java.lang.Object[] r4 = new java.lang.Object[r10]
                if (r1 <= r12) goto L_0x0184
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                java.lang.String r1 = r1.getString(r5)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x018f
            L_0x0184:
                if (r1 <= r6) goto L_0x018b
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x018f
            L_0x018b:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x018f:
                r4[r11] = r1
                java.lang.String r1 = r3.getString(r2, r4)
                goto L_0x01bc
            L_0x0196:
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x01ae
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x01ae
                int r3 = r3.f182116e
                if (r3 != r2) goto L_0x01ae
                r2 = 1
                goto L_0x01af
            L_0x01ae:
                r2 = 0
            L_0x01af:
                if (r2 == 0) goto L_0x01b5
                r2 = 2131829892(0x7f112484, float:1.9292766E38)
                goto L_0x01b8
            L_0x01b5:
                r2 = 2131829900(0x7f11248c, float:1.9292782E38)
            L_0x01b8:
                java.lang.String r1 = r1.getString(r2)
            L_0x01bc:
                r3 = r1
                java.lang.String r1 = "if (count > 0) context.g…share_use_same_template))"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 118(0x76, float:1.65E-43)
                r4 = 2131233401(0x7f080a79, float:1.8082938E38)
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                android.content.res.Resources r1 = r1.getResources()
                int r13 = r1.getColor(r13)
                r16 = 0
                r1 = r28
                r9 = 2131826812(0x7f11187c, float:1.9286519E38)
                r5 = r13
                r13 = 9999(0x270f, float:1.4012E-41)
                r6 = r16
                r1.mo107150j(r2, r3, r4, r5, r6)
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r2 = r8.f14111d
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x020e
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x020e
                java.lang.String r4 = r4.f182115d
                goto L_0x020f
            L_0x020e:
                r4 = 0
            L_0x020f:
                if (r4 != 0) goto L_0x0215
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            L_0x0215:
                java.lang.String r5 = "templateId"
                r3.put(r5, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.String r4 = "shoot_same_video"
                r2.mo8580d(r1, r4, r11, r3)
                goto L_0x0229
            L_0x0224:
                r9 = 2131826812(0x7f11187c, float:1.9286519E38)
                r13 = 9999(0x270f, float:1.4012E-41)
            L_0x0229:
                er1.i1 r6 = er1.C58736i1.f168173a
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r6.mo83664j(r1, r7, r14)
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
                up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
                r1.getClass()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                int r1 = r1.intValue()
                if (r1 != r10) goto L_0x028f
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r1 = r15.mo83939j(r1)
                if (r1 == 0) goto L_0x028f
                di3.d r1 = di3.C86312j.m106911c(r17)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.ui.MMActivity r2 = r8.f14111d
                long r3 = r14.getItemId()
                r1.Vy0(r2, r3)
                r2 = 113(0x71, float:1.58E-43)
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r3 = 2131829896(0x7f112488, float:1.9292774E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131099737(0x7f060059, float:1.7811836E38)
                int r5 = r1.getColor(r5)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r16 = r15.mo83854A(r1)
                r1 = r28
                r26 = r6
                r6 = r16
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x0291
            L_0x028f:
                r26 = r6
            L_0x0291:
                boolean r1 = r15.mo83933h(r14)
                if (r1 == 0) goto L_0x02f9
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                if (r1 == 0) goto L_0x02a4
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                if (r1 == 0) goto L_0x02a4
                int r1 = r1.ringtone_count
                goto L_0x02a5
            L_0x02a4:
                r1 = 0
            L_0x02a5:
                if (r1 == 0) goto L_0x02d3
                int r2 = r15.mo83977x0()
                if (r1 < r2) goto L_0x02d3
                if (r1 <= r12) goto L_0x02ba
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                java.lang.String r1 = r1.getString(r9)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x02c5
            L_0x02ba:
                if (r1 <= r13) goto L_0x02c1
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x02c5
            L_0x02c1:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x02c5:
                com.tencent.mm.ui.MMActivity r2 = r8.f14111d
                r3 = 2131826564(0x7f111784, float:1.9286016E38)
                java.lang.Object[] r4 = new java.lang.Object[r10]
                r4[r11] = r1
                java.lang.String r1 = r2.getString(r3, r4)
                goto L_0x02dc
            L_0x02d3:
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r2 = 2131829889(0x7f112481, float:1.929276E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x02dc:
                r3 = r1
                java.lang.String r1 = "if(count != 0 && count >…tone_title)\n            }"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 114(0x72, float:1.6E-43)
                r4 = 2131756151(0x7f100477, float:1.9143201E38)
                r5 = 0
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r15.mo83982z(r1)
                r1 = r28
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x02f9:
                com.tencent.mm.ui.MMActivity r1 = r8.f14111d
                r2 = r26
                r2.mo83662h(r1, r14, r7)
                di3.d r1 = di3.C86312j.m106911c(r17)
                dp1.y0 r1 = (dp1.C58417y0) r1
                long r2 = r14.getItemId()
                int r4 = r8.f14113f
                r1.mo83275AJ(r2, r4)
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                com.tencent.mm.ui.MMActivity r2 = r8.f14111d
                rs1.s8 r1 = r1.mo12873f(r2)
                if (r1 == 0) goto L_0x032e
                r2 = 0
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r11, r10, r2)
                if (r1 == 0) goto L_0x032e
                long r2 = r14.getItemId()
                df1.a$a r4 = new df1.a$a
                r5 = 16
                r4.<init>(r5, r2)
                r1.mo8766a(r4)
            L_0x032e:
                dp1.e1 r1 = dp1.C7433e1.f25622a
                r1.mo8572a(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.C2829n.C2839j.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$k */
    public static final class C2840k implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14145d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f14146e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f14147f;

        public C2840k(C2829n nVar, BaseFinderFeed baseFinderFeed, C77407n nVar2) {
            this.f14145d = nVar;
            this.f14146e = baseFinderFeed;
            this.f14147f = nVar2;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C2829n nVar = this.f14145d;
            BaseFinderFeed baseFinderFeed = this.f14146e;
            C87412m.m108593f(e0Var, "menu");
            C77407n nVar2 = this.f14147f;
            nVar.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar2, "sheet");
            if (!baseFinderFeed.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(baseFinderFeed.mo3513o().getFeedObject())) {
                C7888v2.f26513a.mo9004b(nVar.f14111d, nVar.f14114g, baseFinderFeed, e0Var, nVar2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$l */
    public static final class C2841l implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14148d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f14149e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f14150f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f14151g;

        public C2841l(C2829n nVar, BaseFinderFeed baseFinderFeed, C77407n nVar2, C60905o oVar) {
            this.f14148d = nVar;
            this.f14149e = baseFinderFeed;
            this.f14150f = nVar2;
            this.f14151g = oVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C2829n nVar = this.f14148d;
            BaseFinderFeed baseFinderFeed = this.f14149e;
            C87412m.m108593f(e0Var, "menu");
            C77407n nVar2 = this.f14150f;
            C60905o oVar = this.f14151g;
            nVar.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar2, "sheet");
            C87412m.m108594g(oVar, "holder");
            if (C85875k4.m106208w()) {
                if (C85875k4.m106209x(nVar.f14111d.getTaskId())) {
                    e0Var.mo107144g(117, nVar.f14111d.getString(C0966R.string.bfn), C0966R.raw.icons_outlined_merge);
                } else {
                    e0Var.mo107144g(117, nVar.f14111d.getString(C0966R.string.f361404jm3), C0966R.raw.icons_outlined_sperated);
                }
            }
            C58736i1 i1Var = C58736i1.f168173a;
            i1Var.mo83660f(nVar.f14111d, e0Var, baseFinderFeed);
            C55018j0 j0Var = baseFinderFeed instanceof C55018j0 ? (C55018j0) baseFinderFeed : null;
            boolean z = false;
            if (j0Var != null && j0Var.mo76076p0()) {
                if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
                    e0Var.mo107144g(301, nVar.f14111d.getString(C0966R.string.f361047md2), C0966R.raw.icons_outlined_menu_close_bullet_visitor_2);
                } else {
                    e0Var.mo107144g(302, nVar.f14111d.getString(C0966R.string.f361048md3), C0966R.raw.icons_outlined_menu_open_bullet_visitor_2);
                }
            }
            C7853p2.f26439a.mo8958a(nVar.f14111d, baseFinderFeed, e0Var, nVar2, 200);
            C58784w3 w3Var = C58784w3.f168295a;
            if (w3Var.mo83980y0(baseFinderFeed.mo3513o())) {
                String X = w3Var.mo83909X(baseFinderFeed);
                if (!baseFinderFeed.mo3513o().isPostFinish() || baseFinderFeed.mo3513o().isPostFailed() || w3Var.mo83979y(baseFinderFeed.mo3513o().getFeedObject())) {
                    z = true;
                }
                e0Var.mo107151k(109, X, C0966R.raw.icons_outlined_bgm_play, z);
            }
            if (!w3Var.mo83897Q0(baseFinderFeed)) {
                e0Var.mo107144g(101, nVar.f14111d.getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
            }
            i1Var.mo83665k(nVar.f14111d, baseFinderFeed, e0Var);
            if (w3Var.mo83897Q0(baseFinderFeed)) {
                i1Var.mo83661g(nVar.f14111d, e0Var, baseFinderFeed);
            }
            C7433e1.f25622a.mo8573b(e0Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$m */
    public static final class C2842m implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14152d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f14153e;

        public C2842m(C2829n nVar, BaseFinderFeed baseFinderFeed) {
            this.f14152d = nVar;
            this.f14153e = baseFinderFeed;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C2829n nVar = this.f14152d;
            BaseFinderFeed baseFinderFeed = this.f14153e;
            C87412m.m108593f(e0Var, "menu");
            nVar.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
            if (!C58784w3.f168295a.mo83897Q0(baseFinderFeed)) {
                e0Var.mo107150j(99, nVar.f14111d.getString(C0966R.string.gvx), C0966R.raw.finder_feed_dislike_new, nVar.f14111d.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_8), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$n */
    public static final class C2843n implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ C2829n f14154a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f14155b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f14156c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f14157d;

        public C2843n(C2829n nVar, BaseFinderFeed baseFinderFeed, C77407n nVar2, C60905o oVar) {
            this.f14154a = nVar;
            this.f14155b = baseFinderFeed;
            this.f14156c = nVar2;
            this.f14157d = oVar;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            C15133e0 e0Var = this.f14154a.f14114g;
            BaseFinderFeed baseFinderFeed = this.f14155b;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            C77407n nVar = this.f14156c;
            Context context = this.f14157d.f173499A;
            C87412m.m108593f(context, "holder.context");
            boolean j = aVar.mo9012j(e0Var, baseFinderFeed, (C76875f0) menuItem, nVar, context);
            Log.m105924i("FinderLongVideoShareContract", "getMoreMenuItemLongSelectedListener :" + j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$o */
    public static final class C2844o implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f14158d;

        /* renamed from: e */
        public final /* synthetic */ C2829n f14159e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f14160f;

        /* renamed from: g */
        public final /* synthetic */ int f14161g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f14162h;

        public C2844o(C32224a<C13598b0> aVar, C2829n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
            this.f14158d = aVar;
            this.f14159e = nVar;
            this.f14160f = baseFinderFeed;
            this.f14161g = i;
            this.f14162h = oVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C32224a<C13598b0> aVar = this.f14158d;
            if (aVar != null) {
                aVar.invoke();
            }
            C2829n nVar = this.f14159e;
            BaseFinderFeed baseFinderFeed = this.f14160f;
            C87412m.m108593f(menuItem, "menuItem");
            nVar.mo2928c(baseFinderFeed, menuItem, i, this.f14161g, this.f14162h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$p */
    public static final class C2845p implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ C2829n f14163a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f14164b;

        public C2845p(C2829n nVar, BaseFinderFeed baseFinderFeed) {
            this.f14163a = nVar;
            this.f14164b = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo2585a(View view, int i, MenuItem menuItem) {
            C58736i1 i1Var = C58736i1.f168173a;
            MMActivity mMActivity = this.f14163a.f14111d;
            C87412m.m108593f(view, "menuView");
            C87412m.m108593f(menuItem, "menuItem");
            i1Var.mo83667m(mMActivity, view, i, menuItem, this.f14164b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$q */
    public static final class C2846q implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14165d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f14166e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f14167f;

        public C2846q(C2829n nVar, BaseFinderFeed baseFinderFeed, C60905o oVar) {
            this.f14165d = nVar;
            this.f14166e = baseFinderFeed;
            this.f14167f = oVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C2829n nVar = this.f14165d;
            BaseFinderFeed baseFinderFeed = this.f14166e;
            C87412m.m108593f(menuItem, "menuItem");
            nVar.mo2928c(baseFinderFeed, menuItem, i, 3, this.f14167f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$r */
    public static final class C2847r extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2847r f14168d = new C2847r();

        public C2847r() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99528u3.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$s */
    public static final class C2848s extends C87413o implements C32224a<RecyclerView.C16623q> {

        /* renamed from: d */
        public static final C2848s f14169d = new C2848s();

        public C2848s() {
            super(0);
        }

        public Object invoke() {
            return new RecyclerView.C16623q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$t */
    public static final class C2849t extends C87413o implements C32226l<FinderObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2849t(C2829n nVar) {
            super(1);
            this.f14170d = nVar;
        }

        public Object invoke(Object obj) {
            FinderObject finderObject = (FinderObject) obj;
            C87412m.m108594g(finderObject, LocaleUtil.ITALIAN);
            this.f14170d.mo2934i(false);
            C2829n.m2662a(this.f14170d, false);
            View d = this.f14170d.mo2929d();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f14170d.f14111d).mo75002a(C63575n3.class);
            n3Var.mo88427k3(true);
            n3Var.mo88424g3();
            C55776r rVar = (C55776r) ((C36570n) this.f14170d.f14116i).getValue();
            long j = finderObject.f164794id;
            String str = finderObject.objectNonceId;
            int i = this.f14170d.f14113f;
            boolean z = finderObject.secondaryShowFlag != 1;
            String str2 = finderObject.username;
            if (str2 == null) {
                str2 = "";
            }
            C55776r.m63515J1(rVar, j, str, i, z, str2, 0, (String) null, 96, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$u */
    public static final class C2850u extends C87413o implements C32227p<Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2850u(C2829n nVar) {
            super(2);
            this.f14171d = nVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            boolean z = false;
            this.f14171d.mo2934i(false);
            View d = this.f14171d.mo2929d();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((C63575n3) C39818r.f106831a.mo62444c(this.f14171d.f14111d).mo75002a(C63575n3.class)).mo88427k3(false);
            TextView textView = (TextView) this.f14171d.f14111d.findViewById(C0966R.C0970id.c1m);
            View findViewById = this.f14171d.f14111d.findViewById(C0966R.C0970id.f359187ji0);
            WeImageView weImageView = (WeImageView) this.f14171d.f14111d.findViewById(C0966R.C0970id.a2z);
            if (weImageView != null) {
                weImageView.setIconColor(this.f14171d.f14111d.getResources().getColor(C0966R.color.f3133gi));
            }
            if (intValue != -5002) {
                if (intValue == -4036) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.eoh);
                } else if (intValue == -4033) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.d_8);
                } else if (intValue != -4011) {
                    C2829n.m2662a(this.f14171d, true);
                } else {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.f360503d90);
                }
            } else if (str != null) {
                C7881t2.f26501a.mo8997b(this.f14171d.f14111d, str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$v */
    public static final class C2851v extends C87413o implements C32224a<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2851v(C2829n nVar) {
            super(0);
            this.f14172d = nVar;
        }

        public Object invoke() {
            C60905o oVar = new C60905o(this.f14172d.f14111d.findViewById(C0966R.C0970id.n7h));
            ((C2422e) ((C36570n) this.f14172d.f14117j).getValue()).mo2422W0(oVar);
            return oVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.n$w */
    public static final class C2852w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C2829n f14173d;

        public C2852w(C2829n nVar) {
            this.f14173d = nVar;
        }

        public final void run() {
            FinderVideoLayout finderVideoLayout;
            C2829n nVar = this.f14173d;
            if (nVar.mo2932g().mo10407a().getVisibility() == 0) {
                Log.m105924i("FinderLongVideoShareContract", "check2Play: video is ended");
                return;
            }
            Object obj = nVar.mo2931f().f173503E;
            C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
            if (j0Var != null && (finderVideoLayout = (FinderVideoLayout) nVar.mo2931f().mo85812D(C0966R.C0970id.d7a)) != null) {
                Log.m105924i("FinderLongVideoShareContract", "check2Play: play trigger, id=" + C61926c.m72691p(j0Var.getItemId()));
                FinderVideoLayout.m65078D(finderVideoLayout, 0, (C12931a) null, 3, (Object) null);
            }
        }
    }

    public C2829n(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        this.f14111d = mMActivity;
        int i = 0;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
        this.f14113f = f != null ? f.f38096i : i;
        this.f14114g = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
        this.f14115h = C36568h.m40985a(C2848s.f14169d);
        this.f14116i = C36568h.m40985a(new C2830a(this));
        this.f14117j = C36568h.m40985a(new C2832c(this));
        this.f14118n = C36568h.m40985a(new C2851v(this));
        this.f14119o = C36568h.m40985a(new C2831b(this));
        this.f14120p = C36568h.m40985a(C2847r.f14168d);
        this.f14123s = -1;
        this.f14125u = "";
        this.f14126v = "";
        this.f14128x = C36568h.m40985a(new C2838i(this));
        this.f14129y = new C2852w(this);
    }

    /* renamed from: a */
    public static final void m2662a(C2829n nVar, boolean z) {
        nVar.getClass();
        Log.m105924i("FinderLongVideoShareContract", "showRetryTips ifShow:" + z);
        View findViewById = nVar.f14111d.findViewById(C0966R.C0970id.is8);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C9697e6(nVar, findViewById));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public static void m2663b(C2829n nVar, C55018j0 j0Var, Object obj, int i, int i2, Object obj2) {
        List list;
        C7639h hVar = null;
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        C2422e eVar = (C2422e) ((C36570n) nVar.f14117j).getValue();
        C60905o f = nVar.mo2931f();
        if (obj != null) {
            list = C64197v.m75539h(obj);
        } else {
            list = null;
        }
        eVar.mo44e(f, j0Var, 0, 0, false, list);
        if (obj == null) {
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(nVar.f14111d);
            if (f2 != null) {
                if (f2.mo12844K3()) {
                    hVar = f2.f38085U;
                }
                if (hVar != null) {
                    C7641j jVar = new C7641j(2);
                    jVar.f25948c = j0Var;
                    hVar.f25945d = j0Var;
                    jVar.f25950e = hVar.f25943b;
                    jVar.f25949d = j0Var.getItemId();
                    hVar.f25943b = j0Var.getItemId();
                    hVar.mo8766a(jVar);
                }
            }
            if (!((Boolean) ((C36570n) nVar.f14120p).getValue()).booleanValue()) {
                int i3 = nVar.f14123s;
                nVar.f14123s = i;
                if (((long) i3) >= 0) {
                    nVar.mo2932g().mo10408b(i3);
                }
                nVar.mo2932g().mo10408b(nVar.f14123s);
                if (nVar.f14111d.getResources().getConfiguration().orientation == 1 && ((C13354o6) C39818r.f106831a.mo62444c(nVar.f14111d).mo75002a(C13354o6.class)).mo12778c3() && nVar.f14123s >= 0) {
                    C61926c.m72666K(100, new C10000u5(nVar));
                }
            } else if (i >= 0) {
                nVar.mo2930e().f13561d = j0Var.mo3513o().getId();
                nVar.mo2930e().mo2706d(j0Var.mo3513o().getObjectNonceId());
                nVar.mo2930e().getDataListJustForAdapter().clear();
                RecyclerView.C16613e adapter = nVar.mo2932g().f30451c.getRecyclerView().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                nVar.mo2930e().requestRefresh();
                nVar.mo2932g().mo10409c(true);
            }
        }
    }

    /* renamed from: A1 */
    public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2840k(this, baseFinderFeed, nVar);
    }

    /* renamed from: B5 */
    public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2842m(this, baseFinderFeed);
    }

    /* renamed from: D1 */
    public RecyclerView.C16623q mo2571D1() {
        return (RecyclerView.C16623q) ((C36570n) this.f14115h).getValue();
    }

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        int i2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C13442s8.class)).mo12861q3();
        C0751m0 m0Var = C0751m0.f1769a;
        MMActivity mMActivity = this.f14111d;
        int i3 = C60811w.f173196u;
        C0751m0.m691b(m0Var, mMActivity, q3, baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q l = baseFinderFeed.mo3507l();
        String username = l != null ? l.getUsername() : "";
        if (z) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i2 = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
            i2 = 0;
        }
        bVar.mo84161i(username, i2);
    }

    /* renamed from: X2 */
    public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2846q(this, baseFinderFeed, oVar);
    }

    /* renamed from: Y4 */
    public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2844o(aVar, this, baseFinderFeed, i, oVar);
    }

    /* renamed from: c */
    public void mo2928c(BaseFinderFeed baseFinderFeed, MenuItem menuItem, int i, int i2, C60905o oVar) {
        String str;
        String str2;
        C64237ap1 ap12;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        MenuItem menuItem2 = menuItem;
        int i3 = i2;
        C60905o oVar2 = oVar;
        Class cls = C58417y0.class;
        C87412m.m108594g(baseFinderFeed2, "feed");
        C87412m.m108594g(menuItem2, "menuItem");
        C87412m.m108594g(oVar2, "holder");
        Log.m105924i("FinderLongVideoShareContract", "getMoreMenuItemSelectedListener feed " + baseFinderFeed2 + ' ' + i + " menuItem:" + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        C49712hj1 hj12 = null;
        if (itemId == 99) {
            String str3 = "feedid";
            BaseFinderFeed baseFinderFeed3 = baseFinderFeed2;
            String str4 = "from_action";
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("feed_uninterest_clk", oVar2.f44854d, (Map<String, Object>) null, 24617);
            MMActivity mMActivity = this.f14111d;
            long itemId2 = baseFinderFeed.getItemId();
            C87412m.m108594g(mMActivity, "context");
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str4, i3 == 1 ? 1 : 2);
            jSONObject.put(str3, C61926c.m72691p(itemId2));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, "button_uninterested", 1, jSONObject);
        } else if (itemId == 109) {
            String str5 = "feedid";
            BaseFinderFeed baseFinderFeed4 = baseFinderFeed2;
            String str6 = "context";
            String str7 = "from_action";
            if (baseFinderFeed.mo3513o().isPostFinish()) {
                C65834e.f189316a.mo89878l(baseFinderFeed.mo3513o(), C65834e.C65836b.f189323c);
                C58771q3 q3Var = C58771q3.f168268a;
                MMActivity mMActivity2 = this.f14111d;
                FinderObjectDesc finderObjectDesc = baseFinderFeed.mo3513o().getFeedObject().objectDesc;
                str = str7;
                q3Var.mo83812c(mMActivity2, finderObjectDesc != null ? finderObjectDesc.feedBgmInfo : null, Long.valueOf(baseFinderFeed.mo3513o().field_id), 0);
                ((C58417y0) C86312j.m106911c(cls)).wy0(this.f14111d, 1, 1, Integer.valueOf(baseFinderFeed.mo3513o().field_finderObject.follow_feed_count));
            } else {
                str = str7;
            }
            MMActivity mMActivity3 = this.f14111d;
            long itemId3 = baseFinderFeed.getItemId();
            C87412m.m108594g(mMActivity3, str6);
            C7435f2 f2Var2 = C7435f2.f25626a;
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(mMActivity3);
            C49712hj1 q35 = f2 != null ? f2.mo12861q3() : null;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, i3 == 1 ? 1 : 2);
            jSONObject2.put(str5, C61926c.m72691p(itemId3));
            C13598b0 b0Var2 = C13598b0.f38549a;
            f2Var2.mo8577a(q35, "button_original_sound", 1, jSONObject2);
        } else if (itemId == 200) {
            C7853p2.f26439a.mo8961d(baseFinderFeed2, this.f14111d, C15587j.f42215a.mo14352d(baseFinderFeed.mo3513o().getFromAppId()));
        } else if (itemId == 202) {
            C62262d0.f176978a.mo87324p(this.f14111d, baseFinderFeed2, i3);
        } else if (itemId == 210) {
            C58736i1.f168173a.mo83672r(this.f14111d, baseFinderFeed2, oVar2);
        } else if (itemId == 307) {
            String str8 = "feedid";
            BaseFinderFeed baseFinderFeed5 = baseFinderFeed2;
            String str9 = "from_action";
            C39622i0 a = C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C63648v.class);
            C87412m.m108593f(a, "UICProvider.of(context).…ddHistoryUIC::class.java)");
            ((C63648v) a).mo88474e3(oVar2, false);
            MMActivity mMActivity4 = this.f14111d;
            long itemId4 = baseFinderFeed.getItemId();
            C87412m.m108594g(mMActivity4, "context");
            C7435f2 f2Var3 = C7435f2.f25626a;
            C13442s8 f3 = C13442s8.f38060Q0.mo12873f(mMActivity4);
            C49712hj1 q36 = f3 != null ? f3.mo12861q3() : null;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str9, i3 == 1 ? 1 : 2);
            jSONObject3.put(str8, C61926c.m72691p(itemId4));
            C13598b0 b0Var3 = C13598b0.f38549a;
            f2Var3.mo8577a(q36, "button_minimize", 1, jSONObject3);
        } else if (itemId == 106) {
            C66164a.f190162a.mo90220a(this.f14111d, baseFinderFeed2, false, new C2836g(this));
        } else if (itemId == 107) {
            C66164a.f190162a.mo90220a(this.f14111d, baseFinderFeed2, true, new C2835f(this));
        } else if (itemId == 301 || itemId == 302) {
            C39622i0 a2 = C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C63513a1.class);
            C87412m.m108593f(a2, "UICProvider.of(getActivi…derBulletUIC::class.java)");
            C63513a1.m74853e3((C63513a1) a2, oVar, false, true, false, 8, (Object) null);
        } else {
            switch (itemId) {
                case 101:
                    String str10 = "context";
                    String str11 = "from_action";
                    if (C58739j4.f168176a.mo83686O(baseFinderFeed2)) {
                        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                        if (liveInfo != null) {
                            C13671a.m12976c(C13671a.f38718a, this.f14111d, liveInfo.f182392d, baseFinderFeed.mo3513o().getUserName(), (Long) null, 0, (BaseFinderFeed) null, 56, (Object) null);
                        }
                    } else {
                        C13671a.f38718a.mo13058a(this.f14111d, baseFinderFeed.mo3513o().field_id, 0, 58);
                    }
                    MMActivity mMActivity5 = this.f14111d;
                    long itemId5 = baseFinderFeed.getItemId();
                    C87412m.m108594g(mMActivity5, str10);
                    C7435f2 f2Var4 = C7435f2.f25626a;
                    C13442s8 f4 = C13442s8.f38060Q0.mo12873f(mMActivity5);
                    if (f4 != null) {
                        hj12 = f4.mo12861q3();
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(str11, i3 == 1 ? 1 : 2);
                    jSONObject4.put("feedid", C61926c.m72691p(itemId5));
                    C13598b0 b0Var4 = C13598b0.f38549a;
                    f2Var4.mo8577a(hj12, "button_complaint", 1, jSONObject4);
                    return;
                case 102:
                    String str12 = "from_action";
                    C7888v2.f26513a.mo9020s(this.f14111d, baseFinderFeed.mo3513o(), new Bundle(), 3, new C2834e(baseFinderFeed2));
                    MMActivity mMActivity6 = this.f14111d;
                    long itemId6 = baseFinderFeed.getItemId();
                    C87412m.m108594g(mMActivity6, "context");
                    C7435f2 f2Var5 = C7435f2.f25626a;
                    C13442s8 f5 = C13442s8.f38060Q0.mo12873f(mMActivity6);
                    if (f5 != null) {
                        hj12 = f5.mo12861q3();
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(str12, i3 == 1 ? 1 : 2);
                    jSONObject5.put("feedid", C61926c.m72691p(itemId6));
                    C13598b0 b0Var5 = C13598b0.f38549a;
                    f2Var5.mo8577a(hj12, "button_forward_friend", 1, jSONObject5);
                    return;
                case 103:
                    String str13 = "context";
                    String str14 = "from_action";
                    C7888v2.C7889a.m8057w(C7888v2.f26513a, this.f14111d, baseFinderFeed, (Bundle) null, 0, 0, 28, (Object) null);
                    if (baseFinderFeed.mo3513o().isLiveFeed()) {
                        C11091a aVar = C11091a.f32868a;
                        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                        C11091a.m10992b(aVar, String.valueOf(liveInfo2 != null ? Long.valueOf(liveInfo2.f182392d) : null), String.valueOf(baseFinderFeed.mo3513o().getFeedObject().f164794id), baseFinderFeed.mo3513o().getFeedObject().username, "1", "2", "0", (JSONObject) null, (String) null, 192, (Object) null);
                    }
                    MMActivity mMActivity7 = this.f14111d;
                    long itemId7 = baseFinderFeed.getItemId();
                    C87412m.m108594g(mMActivity7, str13);
                    C7435f2 f2Var6 = C7435f2.f25626a;
                    C13442s8 f6 = C13442s8.f38060Q0.mo12873f(mMActivity7);
                    if (f6 != null) {
                        hj12 = f6.mo12861q3();
                    }
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(str14, i3 == 1 ? 1 : 2);
                    jSONObject6.put("feedid", C61926c.m72691p(itemId7));
                    C13598b0 b0Var6 = C13598b0.f38549a;
                    f2Var6.mo8577a(hj12, "button_forward_friendcircle", 1, jSONObject6);
                    return;
                case 104:
                    C58745l0.f168212a.mo83743a(baseFinderFeed2, this.f14111d);
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0.Qy0((C58417y0) c, this.f14111d, true, baseFinderFeed.getItemId(), false, 8, (Object) null);
                    return;
                default:
                    String str15 = "context";
                    switch (itemId) {
                        case 112:
                            Intent intent = new Intent();
                            intent.putExtra("KEY_FROM_SCENE", 1);
                            intent.putExtra("KEY_USERNAME", C66785b.f191882e.mo90662O5());
                            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                            intent.putExtra("KEY_IS_FULLSCREEN", true);
                            intent.putExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", false);
                            C58784w3.m68427B1(C58784w3.f168295a, 0, C26236u.m33719b(baseFinderFeed), (C89349b) null, intent, (C2780c) null, 16, (Object) null);
                            ((C58684b) C86312j.m106911c(C58684b.class)).py0(this.f14111d, intent);
                            return;
                        case 113:
                            String str16 = "feedid";
                            String str17 = "from_action";
                            C7888v2.C7889a.m8058y(C7888v2.f26513a, this.f14111d, baseFinderFeed, (Bundle) null, 0, 12, (Object) null);
                            MMActivity mMActivity8 = this.f14111d;
                            long itemId8 = baseFinderFeed.getItemId();
                            C87412m.m108594g(mMActivity8, str15);
                            C7435f2 f2Var7 = C7435f2.f25626a;
                            C13442s8 f7 = C13442s8.f38060Q0.mo12873f(mMActivity8);
                            C49712hj1 q37 = f7 != null ? f7.mo12861q3() : null;
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put(str17, i3 == 1 ? 1 : 2);
                            jSONObject7.put(str16, C61926c.m72691p(itemId8));
                            C13598b0 b0Var7 = C13598b0.f38549a;
                            f2Var7.mo8577a(q37, "textstatus_in_menu", 1, jSONObject7);
                            if (baseFinderFeed.mo3513o().isLiveFeed()) {
                                C11091a aVar2 = C11091a.f32868a;
                                C64273c21 liveInfo3 = baseFinderFeed.mo3513o().getLiveInfo();
                                C11091a.m10992b(aVar2, String.valueOf(liveInfo3 != null ? Long.valueOf(liveInfo3.f182392d) : null), String.valueOf(baseFinderFeed.mo3513o().getFeedObject().f164794id), baseFinderFeed.mo3513o().getFeedObject().username, "1", "3", "0", (JSONObject) null, (String) null, 192, (Object) null);
                                return;
                            }
                            return;
                        case 114:
                            Object obj = (FinderFullSeekBarLayout) oVar2.mo85812D(C0966R.C0970id.eh4);
                            if (obj == null) {
                                obj = oVar2.mo85812D(C0966R.C0970id.n9t);
                            }
                            if (obj != null) {
                                C59667n2.C8415a.m8377a((C59667n2) obj, (String) null, false, 3, (Object) null);
                            }
                            Intent intent2 = this.f14111d.getIntent();
                            if (intent2 == null || (str2 = intent2.getStringExtra("KEY_RINGTONE_REPORT_JSON")) == null) {
                                str2 = "";
                            }
                            String str18 = "from_action";
                            String str19 = "feedid";
                            C7842n2.m7986b(C7842n2.f26407a, this.f14111d, baseFinderFeed, 2, false, (String) null, str2, ((C13452t2) C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C13452t2.class)).f37345h, oVar, new C2837h(obj), 24, (Object) null);
                            MMActivity mMActivity9 = this.f14111d;
                            long itemId9 = baseFinderFeed.getItemId();
                            C87412m.m108594g(mMActivity9, str15);
                            C7435f2 f2Var8 = C7435f2.f25626a;
                            C13442s8 f8 = C13442s8.f38060Q0.mo12873f(mMActivity9);
                            C49712hj1 q38 = f8 != null ? f8.mo12861q3() : null;
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put(str18, i3 == 1 ? 1 : 2);
                            jSONObject8.put(str19, C61926c.m72691p(itemId9));
                            C13598b0 b0Var8 = C13598b0.f38549a;
                            f2Var8.mo8577a(q38, "button_set_bell", 1, jSONObject8);
                            return;
                        default:
                            String str20 = "feedid";
                            String str21 = str15;
                            String str22 = "from_action";
                            switch (itemId) {
                                case 116:
                                    BaseFinderFeed baseFinderFeed6 = baseFinderFeed;
                                    ArrayList arrayList = new ArrayList();
                                    View D = oVar2.mo85812D(C0966R.C0970id.d97);
                                    if (D != null) {
                                        arrayList.add(D);
                                    }
                                    FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
                                    C59670o2 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                                    FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
                                    if (finderThumbPlayerProxy != null) {
                                        C39622i0 a3 = C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C13194da.class);
                                        C87412m.m108593f(a3, "UICProvider.of(getActivi…edControlUIC::class.java)");
                                        C13194da.m12605k3((C13194da) a3, arrayList, finderThumbPlayerProxy, 0, false, (C32224a) null, 28, (Object) null);
                                    }
                                    MMActivity mMActivity10 = this.f14111d;
                                    long itemId10 = baseFinderFeed.getItemId();
                                    C87412m.m108594g(mMActivity10, str21);
                                    C7435f2 f2Var9 = C7435f2.f25626a;
                                    C13442s8 f9 = C13442s8.f38060Q0.mo12873f(mMActivity10);
                                    C49712hj1 q39 = f9 != null ? f9.mo12861q3() : null;
                                    JSONObject jSONObject9 = new JSONObject();
                                    jSONObject9.put(str22, i3 == 1 ? 1 : 2);
                                    jSONObject9.put(str20, C61926c.m72691p(itemId10));
                                    C13598b0 b0Var9 = C13598b0.f38549a;
                                    f2Var9.mo8577a(q39, "button_speedplay", 1, jSONObject9);
                                    return;
                                case 117:
                                    C85878m2.m106216e(this.f14111d.getTaskId(), (C85878m2.C85879a) null);
                                    return;
                                case 118:
                                    BaseFinderFeed baseFinderFeed7 = baseFinderFeed;
                                    FinderObjectDesc finderObjectDesc2 = baseFinderFeed.mo3513o().getFeedObject().objectDesc;
                                    C64237ap1 ap13 = finderObjectDesc2 != null ? finderObjectDesc2.video_tmpl_info : null;
                                    if (ap13 == null) {
                                        MMActivity mMActivity11 = this.f14111d;
                                        C76912y0.m92767f(mMActivity11, mMActivity11.getString(C0966R.string.lqm));
                                    } else {
                                        Intent intent3 = new Intent();
                                        int i4 = ap13.f182116e;
                                        int i5 = i4 != 1 ? i4 != 2 ? -1 : 16 : 13;
                                        MMActivity mMActivity12 = this.f14111d;
                                        intent3.putExtra("key_maas_entrance", 5);
                                        C13598b0 b0Var10 = C13598b0.f38549a;
                                        ((C58247e) C86312j.m106911c(C58247e.class)).qi0(mMActivity12, ap13, intent3, i5);
                                    }
                                    C49712hj1 q310 = ((C13442s8) C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C13442s8.class)).mo12861q3();
                                    C7435f2 f2Var10 = C7435f2.f25626a;
                                    JSONObject jSONObject10 = new JSONObject();
                                    FinderObjectDesc finderObjectDesc3 = baseFinderFeed.mo3513o().getFeedObject().objectDesc;
                                    int i6 = (finderObjectDesc3 == null || (ap12 = finderObjectDesc3.video_tmpl_info) == null) ? null : ap12.f182115d;
                                    if (i6 == null) {
                                        i6 = 0;
                                    }
                                    jSONObject10.put("templateId", i6);
                                    C13598b0 b0Var11 = C13598b0.f38549a;
                                    f2Var10.mo8580d(q310, "shoot_same_video", true, jSONObject10);
                                    return;
                                case 119:
                                    C58736i1.f168173a.mo83668n(this.f14111d, baseFinderFeed);
                                    return;
                                case 120:
                                    MMActivity mMActivity13 = this.f14111d;
                                    C87412m.m108594g(mMActivity13, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                    ((C98567o0) C86312j.m106911c(C98567o0.class)).Wk0(mMActivity13, 2, baseFinderFeed.mo3513o().getFeedObject().toByteArray(), 0);
                                    return;
                                default:
                                    this.f14114g.xc0((C76875f0) menuItem2, new C2833d(baseFinderFeed, this, menuItem2, i3));
                                    return;
                            }
                    }
            }
        }
    }

    /* renamed from: d */
    public final View mo2929d() {
        return (View) ((C36570n) this.f14119o).getValue();
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C2841l(this, baseFinderFeed, nVar, oVar);
    }

    /* renamed from: e */
    public final FinderFeedShareRelativeListLoader mo2930e() {
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f14121q;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: f */
    public final C60905o mo2931f() {
        return (C60905o) ((C36570n) this.f14118n).getValue();
    }

    /* renamed from: f5 */
    public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2843n(this, baseFinderFeed, nVar, oVar);
    }

    /* renamed from: g */
    public final C9868n5 mo2932g() {
        C9868n5 n5Var = this.f14122r;
        if (n5Var != null) {
            return n5Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public MMActivity getActivity() {
        return this.f14111d;
    }

    /* renamed from: h */
    public final void mo2933h(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("FinderLongVideoShareContract", "onScreenSizeChange: source = " + str);
        Object obj = mo2931f().f173503E;
        C87412m.m108593f(obj, "videoHolder.getAssociatedObject()");
        m2663b(this, (C55018j0) obj, new C13604l(30, 1), 0, 4, (Object) null);
        if (C87412m.m108589b(str, "resetToPortrait")) {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) mo2931f().mo85812D(C0966R.C0970id.d7a);
            View view = null;
            C59670o2 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            if (videoView instanceof View) {
                view = (View) videoView;
            }
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.requestLayout();
            }
        }
    }

    /* renamed from: i */
    public final void mo2934i(boolean z) {
        View findViewById = this.f14111d.findViewById(C0966R.C0970id.f359188ji1);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: n6 */
    public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
        C87412m.m108594g(finderItem, "feed");
        C55031t.f154490a.mo76085a(this.f14111d, finderItem, z, 2, i);
    }

    /* renamed from: p1 */
    public FinderVideoCore mo2578p1() {
        return this.f14112e;
    }

    /* renamed from: r5 */
    public C56597e1 mo2579r5() {
        C56597e1 e1Var = ((C63545b1) C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C63545b1.class)).f180225d;
        return e1Var == null ? new C56597e1() : e1Var;
    }

    public final void requestRefresh() {
        C2849t tVar = new C2849t(this);
        C2850u uVar = new C2850u(this);
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).Sn0()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99180G6.mo60266n().intValue() == 1) {
                C61926c.m72668M(new C10025w5(uVar, this));
                return;
            }
        }
        long j = this.f14124t;
        String str = this.f14126v;
        int i = this.f14113f;
        String str2 = this.f14125u;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f14111d);
        C89059e i2 = new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 118720, (C8480h) null).mo9225i();
        i2.mo11397F(this.f14111d);
        i2.mo123062e(new C10055y5(this, uVar, tVar));
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return false;
    }

    /* renamed from: u4 */
    public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2845p(this, baseFinderFeed);
    }

    /* renamed from: v3 */
    public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this.f14111d).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
    }

    /* renamed from: w1 */
    public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2839j(this, baseFinderFeed, nVar, i);
    }
}
