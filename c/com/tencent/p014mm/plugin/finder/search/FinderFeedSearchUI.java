package com.tencent.p014mm.plugin.finder.search;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0736h0;
import cm1.C0740i2;
import cm1.C0751m0;
import cm1.C0768q0;
import cm1.C55031t;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable;
import com.tencent.p014mm.plugin.finder.search.data.SearchHotWordParcelable;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58391n;
import dp1.C58417y0;
import dp1.C7433e1;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C58556f;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp1.C46086b1;
import hp1.C46091u0;
import hp1.C60055x0;
import hp1.C8657d0;
import hp1.C8668i;
import hp1.C8673m;
import hp1.C8675n;
import hp1.C8677o;
import hp1.C8679p;
import hp1.C8681q;
import hp1.C8689s;
import hp1.C8697t;
import hp1.C8699u;
import hp1.C8701v;
import hp1.C8702w;
import hp1.C8703w0;
import hp1.C8704x;
import hp1.C8705y;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8777j5;
import ht1.C8794p5;
import ht1.C8817y2;
import ht1.C8819z2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import je1.C9320i4;
import je1.C9382v4;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import kj2.C117407d;
import kotlin.Metadata;
import l31.C61212e;
import mf1.C10865t;
import ms3.C11091a;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import pe3.C89349b;
import pf1.C62273n;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13140c8;
import rs1.C13194da;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13502w6;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63547e;
import rs1.C63648v;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf1.C13672b;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C48727ak1;
import te3.C49572gk1;
import te3.C49712hj1;
import te3.C50542nh0;
import te3.C50972qk0;
import te3.C51954xc1;
import te3.C52271zj0;
import te3.C64273c21;
import tf0.C64916p1;
import vp1.C65838f;
import wc3.C15133e0;
import wp1.C15585f;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderFeedSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lkf1/v1;", "Lob0/n;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI */
public final class FinderFeedSearchUI extends MMFinderFeedDetailUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C10008v1, C11385n {

    /* renamed from: g1 */
    public static final /* synthetic */ int f16461g1 = 0;

    /* renamed from: A */
    public HashMap<String, C8668i> f16462A = new HashMap<>();

    /* renamed from: B */
    public RecyclerView.C16623q f16463B = new RecyclerView.C16623q();

    /* renamed from: C */
    public int f16464C = 1;

    /* renamed from: D */
    public boolean f16465D;

    /* renamed from: E */
    public int f16466E;

    /* renamed from: F */
    public boolean f16467F;

    /* renamed from: G */
    public boolean f16468G;

    /* renamed from: H */
    public RefreshLoadMoreLayout f16469H;

    /* renamed from: I */
    public RecyclerView f16470I;

    /* renamed from: J */
    public TextView f16471J;

    /* renamed from: K */
    public View f16472K;

    /* renamed from: L */
    public final FinderVideoCore f16473L = new FinderVideoCore(0, 1, (C8480h) null);

    /* renamed from: M */
    public final ArrayMap<Long, C3545b> f16474M = new ArrayMap<>();

    /* renamed from: N */
    public FinderLikeDrawer f16475N;

    /* renamed from: P */
    public C46091u0 f16476P;

    /* renamed from: Q */
    public C60055x0 f16477Q;

    /* renamed from: Q0 */
    public IListener<FeedUpdateEvent> f16478Q0;

    /* renamed from: R */
    public SearchHotWordListParcelable f16479R;

    /* renamed from: R0 */
    public Runnable f16480R0 = new C3569q(this);

    /* renamed from: S */
    public C89349b f16481S;

    /* renamed from: S0 */
    public C9320i4 f16482S0;

    /* renamed from: T */
    public C89349b f16483T;

    /* renamed from: T0 */
    public C9320i4 f16484T0;

    /* renamed from: U */
    public C15133e0 f16485U;

    /* renamed from: U0 */
    public boolean f16486U0;

    /* renamed from: V */
    public View f16487V;

    /* renamed from: V0 */
    public final FinderFeedSearchUI$feedExposeInfoChangeListener$1 f16488V0 = new FinderFeedSearchUI$feedExposeInfoChangeListener$1(this);

    /* renamed from: W */
    public TextView f16489W;

    /* renamed from: W0 */
    public final C3566n f16490W0 = new C3566n(this);

    /* renamed from: X */
    public View f16491X;

    /* renamed from: X0 */
    public MMHandler f16492X0 = new MMHandler(Looper.getMainLooper());

    /* renamed from: Y */
    public View f16493Y;

    /* renamed from: Y0 */
    public Runnable f16494Y0;

    /* renamed from: Z */
    public C52271zj0 f16495Z;

    /* renamed from: Z0 */
    public TextView f16496Z0;

    /* renamed from: a1 */
    public final long f16497a1 = 3000;

    /* renamed from: b1 */
    public boolean f16498b1;

    /* renamed from: c1 */
    public HashMap<Integer, String> f16499c1 = new HashMap<>();

    /* renamed from: d1 */
    public HashMap<String, C52271zj0> f16500d1 = new HashMap<>();

    /* renamed from: e1 */
    public String f16501e1 = "";

    /* renamed from: f1 */
    public final HashSet<Integer> f16502f1;

    /* renamed from: o */
    public FTSSearchView f16503o;

    /* renamed from: p */
    public boolean f16504p = true;

    /* renamed from: p0 */
    public C8657d0 f16505p0;

    /* renamed from: q */
    public String f16506q = "";

    /* renamed from: r */
    public int f16507r;

    /* renamed from: s */
    public int f16508s;

    /* renamed from: t */
    public int f16509t;

    /* renamed from: u */
    public C89349b f16510u;

    /* renamed from: v */
    public C89349b f16511v;

    /* renamed from: w */
    public C9382v4 f16512w;

    /* renamed from: x */
    public DataBuffer<C0740i2> f16513x = new DataBuffer<>((ArrayList) null, 1, (C8480h) null);

    /* renamed from: x0 */
    public final C13601g f16514x0 = C36568h.m40985a(new C3546c(this));

    /* renamed from: y */
    public int f16515y;

    /* renamed from: y0 */
    public final C13601g f16516y0 = C36568h.m40985a(new C3547d(this));

    /* renamed from: z */
    public String f16517z = "";

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$a */
    public final class C3544a extends C58555d {
        public C3544a() {
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            int i;
            int i2;
            C87412m.m108594g(bVar, "event");
            if (bVar instanceof C7642k) {
                C7642k kVar = (C7642k) bVar;
                int i3 = kVar.f25951b;
                if ((i3 == 5 || i3 == 0 || i3 == 1) && (i = kVar.f25953d) <= (i2 = kVar.f25955f)) {
                    while (true) {
                        if (i < FinderFeedSearchUI.this.f16513x.size() && i >= 0) {
                            FinderFeedSearchUI finderFeedSearchUI = FinderFeedSearchUI.this;
                            finderFeedSearchUI.mo3879O7(finderFeedSearchUI.f16513x.get(i).getItemId(), i, 2);
                        }
                        if (i != i2) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b */
    public static final class C3545b {

        /* renamed from: a */
        public final long f16519a;

        /* renamed from: b */
        public final String f16520b;

        /* renamed from: c */
        public final String f16521c;

        /* renamed from: d */
        public final String f16522d;

        public C3545b(long j, String str, String str2, String str3) {
            C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
            C87412m.m108594g(str2, "requestId");
            C87412m.m108594g(str3, "hotWordId");
            this.f16519a = j;
            this.f16520b = str;
            this.f16521c = str2;
            this.f16522d = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3545b)) {
                return false;
            }
            C3545b bVar = (C3545b) obj;
            return this.f16519a == bVar.f16519a && C87412m.m108589b(this.f16520b, bVar.f16520b) && C87412m.m108589b(this.f16521c, bVar.f16521c) && C87412m.m108589b(this.f16522d, bVar.f16522d);
        }

        public int hashCode() {
            long j = this.f16519a;
            return (((((((int) (j ^ (j >>> 32))) * 31) + this.f16520b.hashCode()) * 31) + this.f16521c.hashCode()) * 31) + this.f16522d.hashCode();
        }

        public String toString() {
            return "ReportData(id=" + this.f16519a + ", query=" + this.f16520b + ", requestId=" + this.f16521c + ", hotWordId=" + this.f16522d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$c */
    public static final class C3546c extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3546c(FinderFeedSearchUI finderFeedSearchUI) {
            super(0);
            this.f16523d = finderFeedSearchUI;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f16523d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$d */
    public static final class C3547d extends C87413o implements C32224a<C8819z2> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3547d(FinderFeedSearchUI finderFeedSearchUI) {
            super(0);
            this.f16524d = finderFeedSearchUI;
        }

        public Object invoke() {
            return ((C8817y2) C39818r.f106831a.mo62444c(this.f16524d).mo62447c(C8817y2.class)).mo9643v2();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$e */
    public static final class C3548e implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16525d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f16526e;

        public C3548e(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
            this.f16525d = finderFeedSearchUI;
            this.f16526e = baseFinderFeed;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0156, code lost:
            r1 = (r1 = r1.mo3513o()).field_finderObject;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r24) {
            /*
                r23 = this;
                r0 = r23
                r7 = r24
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                er1.w3 r6 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r10 = r1.getContext()
                java.lang.String r5 = "context"
                gy3.C87412m.m108593f(r10, r5)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r0.f16526e
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 28
                r16 = 0
                r9 = r6
                er1.w3$a r9 = er1.C58784w3.m68431K(r9, r10, r11, r12, r13, r14, r15, r16)
                boolean r10 = r9.f26579a
                boolean r11 = r9.f26580b
                java.lang.String r3 = r9.f26583e
                java.lang.String r12 = r9.f26584f
                boolean r1 = r9.f26587i
                if (r1 != 0) goto L_0x004d
                r2 = 102(0x66, float:1.43E-43)
                r4 = 2131755655(0x7f100287, float:1.9142195E38)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r13 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r13 = r1.getColor(r13)
                r1 = r24
                r14 = r5
                r5 = r13
                r13 = r6
                r6 = r10
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x004f
            L_0x004d:
                r14 = r5
                r13 = r6
            L_0x004f:
                boolean r1 = r9.f26588j
                if (r1 != 0) goto L_0x0060
                r2 = 103(0x67, float:1.44E-43)
                r4 = 2131755285(0x7f100115, float:1.9141445E38)
                r5 = 0
                r1 = r24
                r3 = r12
                r6 = r11
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0060:
                up1.f r10 = up1.C37521f.f99374d
                r10.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r11 = 1
                if (r1 != r11) goto L_0x00bc
                boolean r1 = r9.f26589k
                if (r1 != 0) goto L_0x00bc
                r2 = 104(0x68, float:1.46E-43)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131755278(0x7f10010e, float:1.914143E38)
                r5 = 0
                boolean r6 = r9.f26591m
                r1 = r24
                r1.mo107150j(r2, r3, r4, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r8)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r15 = r1
                dp1.y0 r15 = (dp1.C58417y0) r15
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r14)
                r17 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16526e
                long r18 = r2.getItemId()
                boolean r2 = r9.f26591m
                r21 = 2
                r22 = 0
                r16 = r1
                r20 = r2
                dp1.C58417y0.Qy0(r15, r16, r17, r18, r20, r21, r22)
            L_0x00bc:
                er1.i1 r9 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r14)
                java.lang.String r2 = "menu"
                gy3.C87412m.m108593f(r7, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16526e
                r9.mo83664j(r1, r7, r2)
                r10.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
                up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
                r1.getClass()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                int r1 = r1.intValue()
                if (r1 != r11) goto L_0x0143
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16526e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r1 = r13.mo83939j(r1)
                if (r1 == 0) goto L_0x0143
                di3.d r1 = di3.C86312j.m106911c(r8)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r14)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16526e
                long r3 = r3.getItemId()
                r1.Vy0(r2, r3)
                r2 = 113(0x71, float:1.58E-43)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                r3 = 2131829896(0x7f112488, float:1.9292774E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131099737(0x7f060059, float:1.7811836E38)
                int r5 = r1.getColor(r5)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16526e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r13.mo83854A(r1)
                r1 = r24
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0143:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16526e
                boolean r1 = r13.mo83933h(r1)
                r10 = 0
                if (r1 == 0) goto L_0x01c8
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16526e
                if (r1 == 0) goto L_0x015d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                if (r1 == 0) goto L_0x015d
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                if (r1 == 0) goto L_0x015d
                int r1 = r1.ringtone_count
                goto L_0x015e
            L_0x015d:
                r1 = 0
            L_0x015e:
                if (r1 == 0) goto L_0x019c
                int r2 = r13.mo83977x0()
                if (r1 < r2) goto L_0x019c
                r2 = 99999(0x1869f, float:1.40128E-40)
                if (r1 <= r2) goto L_0x017d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                r2 = 2131826812(0x7f11187c, float:1.9286519E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x018a
            L_0x017d:
                r2 = 9999(0x270f, float:1.4012E-41)
                if (r1 <= r2) goto L_0x0186
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x018a
            L_0x0186:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x018a:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                r3 = 2131826564(0x7f111784, float:1.9286016E38)
                java.lang.Object[] r4 = new java.lang.Object[r11]
                r4[r10] = r1
                java.lang.String r1 = r2.getString(r3, r4)
                goto L_0x01a9
            L_0x019c:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                r2 = 2131829889(0x7f112481, float:1.929276E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x01a9:
                r3 = r1
                java.lang.String r1 = "if(count != 0 && count >…tone_title)\n            }"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 114(0x72, float:1.6E-43)
                r4 = 2131756151(0x7f100477, float:1.9143201E38)
                r5 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16526e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r13.mo83982z(r1)
                r1 = r24
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x01c8:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16525d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r14)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16526e
                r9.mo83662h(r1, r2, r7)
                di3.d r1 = di3.C86312j.m106911c(r8)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16526e
                long r2 = r2.getItemId()
                r4 = 6
                r1.mo83275AJ(r2, r4)
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16525d
                rs1.s8 r1 = r1.mo12873f(r2)
                if (r1 == 0) goto L_0x0207
                r2 = 0
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r10, r11, r2)
                if (r1 == 0) goto L_0x0207
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16526e
                long r2 = r2.getItemId()
                df1.a$a r4 = new df1.a$a
                r5 = 16
                r4.<init>(r5, r2)
                r1.mo8766a(r4)
            L_0x0207:
                dp1.e1 r1 = dp1.C7433e1.f25622a
                r1.mo8572a(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3548e.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$f */
    public static final class C3549f implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f16527d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedSearchUI f16528e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f16529f;

        public C3549f(BaseFinderFeed baseFinderFeed, FinderFeedSearchUI finderFeedSearchUI, C77407n nVar) {
            this.f16527d = baseFinderFeed;
            this.f16528e = finderFeedSearchUI;
            this.f16529f = nVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (!this.f16527d.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(this.f16527d.mo3513o().getFeedObject())) {
                C7888v2.C7889a aVar = C7888v2.f26513a;
                AppCompatActivity context = this.f16528e.getContext();
                C87412m.m108593f(context, "context");
                C15133e0 e0Var2 = this.f16528e.f16485U;
                if (e0Var2 != null) {
                    BaseFinderFeed baseFinderFeed = this.f16527d;
                    C87412m.m108593f(e0Var, LocaleUtil.ITALIAN);
                    aVar.mo9004b(context, e0Var2, baseFinderFeed, e0Var, this.f16529f);
                    return;
                }
                C87412m.m108603p("quickMenuHelper");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$g */
    public static final class C3550g implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16530d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f16531e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f16532f;

        public C3550g(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed, C77407n nVar) {
            this.f16530d = finderFeedSearchUI;
            this.f16531e = baseFinderFeed;
            this.f16532f = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r1 = (r1 = r1.mo3513o()).getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r14) {
            /*
                r13 = this;
                er1.i1 r0 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                java.lang.String r2 = "context"
                gy3.C87412m.m108593f(r1, r2)
                java.lang.String r3 = "menu"
                gy3.C87412m.m108593f(r14, r3)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83660f(r1, r14, r3)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r13.f16531e
                r3 = 0
                if (r1 == 0) goto L_0x002f
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                if (r1 == 0) goto L_0x002f
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                if (r1 == 0) goto L_0x002f
                er1.w3 r4 = er1.C58784w3.f168295a
                boolean r1 = r4.mo83857B(r1)
                goto L_0x0030
            L_0x002f:
                r1 = 0
            L_0x0030:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r13.f16531e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                boolean r4 = r4.isLongVideo()
                if (r4 == 0) goto L_0x005a
                if (r1 != 0) goto L_0x005a
                r1 = 116(0x74, float:1.63E-43)
                rs1.da$a r4 = rs1.C13194da.f37515v
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r5 = r13.f16530d
                androidx.recyclerview.widget.RecyclerView r5 = r5.f16470I
                if (r5 == 0) goto L_0x0053
                java.lang.String r4 = r4.mo12692a(r5)
                r5 = 2131756416(0x7f100580, float:1.9143739E38)
                r14.mo107144g(r1, r4, r5)
                goto L_0x005a
            L_0x0053:
                java.lang.String r14 = "recyclerView"
                gy3.C87412m.m108603p(r14)
                r14 = 0
                throw r14
            L_0x005a:
                er1.w3 r1 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r13.f16531e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                boolean r4 = r1.mo83980y0(r4)
                if (r4 == 0) goto L_0x009f
                r4 = 109(0x6d, float:1.53E-43)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r13.f16531e
                java.lang.String r5 = r1.mo83909X(r5)
                r6 = 2131756232(0x7f1004c8, float:1.9143366E38)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r13.f16531e
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                boolean r7 = r7.isPostFinish()
                if (r7 == 0) goto L_0x009b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r13.f16531e
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                boolean r7 = r7.isPostFailed()
                if (r7 != 0) goto L_0x009b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r13.f16531e
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
                boolean r1 = r1.mo83979y(r7)
                if (r1 == 0) goto L_0x009c
            L_0x009b:
                r3 = 1
            L_0x009c:
                r14.mo107151k(r4, r5, r6, r3)
            L_0x009f:
                er1.p2 r7 = er1.C7853p2.f26439a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r8 = r1.getContext()
                gy3.C87412m.m108593f(r8, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r13.f16531e
                qo3.n r11 = r13.f16532f
                r12 = 200(0xc8, float:2.8E-43)
                r10 = r14
                r7.mo8958a(r8, r9, r10, r11, r12)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83665k(r1, r3, r14)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                boolean r1 = com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.m3650N7(r1, r3)
                if (r1 == 0) goto L_0x00da
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83661g(r1, r14, r3)
            L_0x00da:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83655a(r1, r14, r3)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83663i(r1, r3, r14)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                boolean r1 = com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.m3650N7(r1, r3)
                if (r1 != 0) goto L_0x0115
                r1 = 101(0x65, float:1.42E-43)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r3 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                r4 = 2131833035(0x7f1130cb, float:1.929914E38)
                java.lang.String r3 = r3.getString(r4)
                r4 = 2131756438(0x7f100596, float:1.9143784E38)
                r14.mo107144g(r1, r3, r4)
            L_0x0115:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83659e(r1, r3, r14)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f16531e
                r0.mo83658d(r1, r3, r14)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r13.f16530d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r13.f16531e
                r0.mo83657c(r1, r2, r14)
                dp1.e1 r0 = dp1.C7433e1.f25622a
                r0.mo8573b(r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3550g.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$h */
    public static final class C3551h implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16533d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f16534e;

        public C3551h(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
            this.f16533d = finderFeedSearchUI;
            this.f16534e = baseFinderFeed;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (!FinderFeedSearchUI.m3650N7(this.f16533d, this.f16534e)) {
                e0Var.mo107150j(99, this.f16533d.getContext().getString(C0966R.string.gvx), C0966R.raw.finder_feed_dislike_new, this.f16533d.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_8), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$i */
    public static final class C3552i implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16535d;

        public C3552i(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16535d = finderFeedSearchUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:117:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0191  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
            /*
                r8 = this;
                r11 = 1
                r0 = 0
                r1 = 4069(0xfe5, float:5.702E-42)
                if (r12 == 0) goto L_0x000e
                int r2 = r12.getType()
                if (r2 != r1) goto L_0x000e
                r2 = 1
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                if (r2 == 0) goto L_0x01fd
                ob0.b0 r2 = f40.C86709a0.m107524d()
                r2.mo123470p(r1, r8)
                boolean r1 = r12 instanceof je1.C9382v4
                if (r1 == 0) goto L_0x01fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getHotSearchList onSceneEnd errType:"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r2 = " isPreload:"
                r1.append(r2)
                je1.v4 r12 = (je1.C9382v4) r12
                boolean r2 = r12.f29309n
                r1.append(r2)
                java.lang.String r2 = " hotWords:"
                r1.append(r2)
                te3.xj1 r2 = r12.f29308j
                r3 = 0
                if (r2 == 0) goto L_0x0042
                java.util.LinkedList<te3.ak1> r2 = r2.f144699d
                goto L_0x0043
            L_0x0042:
                r2 = r3
            L_0x0043:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "Finder.FinderFeedSearchUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                if (r9 != 0) goto L_0x01e6
                if (r10 != 0) goto L_0x01e6
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r9 = r8.f16535d
                te3.xj1 r10 = r12.f29308j
                if (r10 == 0) goto L_0x005c
                pe3.b r1 = r10.f144701f
                goto L_0x005d
            L_0x005c:
                r1 = r3
            L_0x005d:
                r9.f16511v = r1
                if (r10 == 0) goto L_0x0064
                java.util.LinkedList<te3.ak1> r10 = r10.f144699d
                goto L_0x0065
            L_0x0064:
                r10 = r3
            L_0x0065:
                r9.getClass()
                if (r10 == 0) goto L_0x008e
                int r1 = r10.size()
                if (r1 <= 0) goto L_0x0072
                r1 = 1
                goto L_0x0073
            L_0x0072:
                r1 = 0
            L_0x0073:
                if (r1 == 0) goto L_0x0077
                r1 = r10
                goto L_0x0078
            L_0x0077:
                r1 = r3
            L_0x0078:
                if (r1 == 0) goto L_0x008e
                java.util.Iterator r1 = r1.iterator()
            L_0x007e:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x008e
                java.lang.Object r4 = r1.next()
                te3.ak1 r4 = (te3.C48727ak1) r4
                r9.mo3885U7(r4)
                goto L_0x007e
            L_0x008e:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r9 = r8.f16535d
                if (r10 == 0) goto L_0x00a9
                int r1 = r10.size()
                if (r1 <= 0) goto L_0x009a
                r1 = 1
                goto L_0x009b
            L_0x009a:
                r1 = 0
            L_0x009b:
                if (r1 == 0) goto L_0x009f
                r1 = r10
                goto L_0x00a0
            L_0x009f:
                r1 = r3
            L_0x00a0:
                if (r1 == 0) goto L_0x00a9
                java.lang.Object r1 = r1.get(r0)
                te3.ak1 r1 = (te3.C48727ak1) r1
                goto L_0x00aa
            L_0x00a9:
                r1 = r3
            L_0x00aa:
                boolean r12 = r12.f29309n
                r12 = r12 ^ r11
                r9.getClass()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "onGetHotSearchList list: "
                r4.append(r5)
                r4.append(r10)
                java.lang.String r5 = " size:"
                r4.append(r5)
                if (r10 == 0) goto L_0x00c9
                int r5 = r10.size()
                goto L_0x00ca
            L_0x00c9:
                r5 = 0
            L_0x00ca:
                r4.append(r5)
                java.lang.String r5 = " searchText:"
                r4.append(r5)
                if (r1 == 0) goto L_0x00d7
                java.lang.String r5 = r1.f130586d
                goto L_0x00d8
            L_0x00d7:
                r5 = r3
            L_0x00d8:
                r4.append(r5)
                java.lang.String r5 = " isWaitingForSearchList:"
                r4.append(r5)
                boolean r5 = r9.f16468G
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                java.lang.String r4 = "onGetHotSearchList "
                if (r10 == 0) goto L_0x01d7
                java.util.Iterator r5 = r10.iterator()
                java.lang.String r6 = "hotWords.iterator()"
                gy3.C87412m.m108593f(r5, r6)
            L_0x00f9:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0112
                java.lang.Object r6 = r5.next()
                java.lang.String r7 = "iterator.next()"
                gy3.C87412m.m108593f(r6, r7)
                te3.ak1 r6 = (te3.C48727ak1) r6
                int r6 = r6.f130587e
                if (r6 == r11) goto L_0x00f9
                r5.remove()
                goto L_0x00f9
            L_0x0112:
                int r5 = r10.size()
                if (r5 <= 0) goto L_0x01c8
                r9.f16509t = r11
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r2 = r9.f16479R
                if (r2 != 0) goto L_0x0131
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable$a r11 = com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable.CREATOR
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r10 = r11.mo3935a(r1, r0, r10)
                r9.f16479R = r10
                java.lang.Runnable r9 = r9.f16480R0
                if (r9 == 0) goto L_0x01f7
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$q r9 = (com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3569q) r9
                r9.run()
                goto L_0x01f7
            L_0x0131:
                boolean r1 = r10.isEmpty()
                r1 = r1 ^ r11
                if (r1 == 0) goto L_0x01af
                java.lang.Object r1 = sx3.C110818d0.m150914L(r10)
                te3.ak1 r1 = (te3.C48727ak1) r1
                cm1.h0 r2 = new cm1.h0
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = new com.tencent.mm.plugin.finder.storage.FinderItem
                r4.<init>()
                java.lang.String r1 = r1.f130586d
                if (r1 != 0) goto L_0x0159
                android.content.res.Resources r1 = r9.getResources()
                r5 = 2131829796(0x7f112424, float:1.9292571E38)
                java.lang.String r1 = r1.getString(r5)
                java.lang.String r5 = "resources.getString(R.st…_search_hot_tips_default)"
                gy3.C87412m.m108593f(r1, r5)
            L_0x0159:
                r2.<init>(r4, r1)
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r1 = r9.f16513x
                java.lang.Object r1 = sx3.C110818d0.m150923U(r1)
                cm1.i2 r1 = (cm1.C0740i2) r1
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r4 = r9.f16479R
                if (r4 == 0) goto L_0x017a
                int r5 = r4.f16637f
                java.util.LinkedList<com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable> r4 = r4.f16638g
                int r4 = r4.size()
                int r4 = r4 - r11
                if (r5 < r4) goto L_0x0175
                r4 = 1
                goto L_0x0176
            L_0x0175:
                r4 = 0
            L_0x0176:
                if (r4 != r11) goto L_0x017a
                r4 = 1
                goto L_0x017b
            L_0x017a:
                r4 = 0
            L_0x017b:
                if (r4 == 0) goto L_0x018e
                boolean r1 = r1 instanceof cm1.C0736h0
                if (r1 != 0) goto L_0x0186
                int r4 = r9.f16508s
                if (r4 != 0) goto L_0x0186
                goto L_0x018c
            L_0x0186:
                if (r1 == 0) goto L_0x018e
                int r1 = r9.f16508s
                if (r1 != 0) goto L_0x018e
            L_0x018c:
                r1 = 1
                goto L_0x018f
            L_0x018e:
                r1 = 0
            L_0x018f:
                if (r1 == 0) goto L_0x01af
                r9.mo3881Q7(r2)
                androidx.recyclerview.widget.RecyclerView r1 = r9.f16470I
                if (r1 == 0) goto L_0x01a9
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x01af
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r2 = r9.f16513x
                int r2 = r2.size()
                int r2 = r2 - r11
                r1.notifyItemInserted(r2)
                goto L_0x01af
            L_0x01a9:
                java.lang.String r9 = "recyclerView"
                gy3.C87412m.m108603p(r9)
                throw r3
            L_0x01af:
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r11 = r9.f16479R
                if (r11 == 0) goto L_0x01be
                java.util.LinkedList<com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable> r11 = r11.f16638g
                com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable$a r1 = com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable.CREATOR
                java.util.LinkedList r10 = r1.mo3936b(r10)
                r11.addAll(r10)
            L_0x01be:
                if (r12 != 0) goto L_0x01c4
                boolean r10 = r9.f16468G
                if (r10 == 0) goto L_0x01f7
            L_0x01c4:
                r9.mo3894e8(r0)
                goto L_0x01f7
            L_0x01c8:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                r9.f16509t = r0
                if (r12 != 0) goto L_0x01d3
                boolean r10 = r9.f16468G
                if (r10 == 0) goto L_0x01f7
            L_0x01d3:
                r9.mo3890Z7()
                goto L_0x01f7
            L_0x01d7:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                r9.f16509t = r0
                if (r12 != 0) goto L_0x01e2
                boolean r10 = r9.f16468G
                if (r10 == 0) goto L_0x01f7
            L_0x01e2:
                r9.mo3890Z7()
                goto L_0x01f7
            L_0x01e6:
                boolean r9 = r12.f29309n
                if (r9 == 0) goto L_0x01f0
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r9 = r8.f16535d
                boolean r9 = r9.f16468G
                if (r9 == 0) goto L_0x01f7
            L_0x01f0:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r9 = r8.f16535d
                int r10 = com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.f16461g1
                r9.mo3890Z7()
            L_0x01f7:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r9 = r8.f16535d
                r9.f16468G = r0
                r9.f16467F = r0
            L_0x01fd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3552i.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$j */
    public static final class C3553j implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedSearchUI f16536a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f16537b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f16538c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f16539d;

        public C3553j(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            this.f16536a = finderFeedSearchUI;
            this.f16537b = baseFinderFeed;
            this.f16538c = nVar;
            this.f16539d = oVar;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            C15133e0 e0Var = this.f16536a.f16485U;
            if (e0Var != null) {
                BaseFinderFeed baseFinderFeed = this.f16537b;
                C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                C77407n nVar = this.f16538c;
                Context context = this.f16539d.f173499A;
                C87412m.m108593f(context, "holder.context");
                boolean j = aVar.mo9012j(e0Var, baseFinderFeed, (C76875f0) menuItem, nVar, context);
                Log.m105924i("Finder.FinderFeedSearchUI", "getMoreMenuItemLongSelectedListener :" + j);
                return;
            }
            C87412m.m108603p("quickMenuHelper");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k */
    public static final class C3554k implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f16540d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f16541e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedSearchUI f16542f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f16543g;

        /* renamed from: h */
        public final /* synthetic */ int f16544h;

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$a */
        public static final class C3555a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f16545d;

            /* renamed from: e */
            public final /* synthetic */ FinderFeedSearchUI f16546e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f16547f;

            /* renamed from: g */
            public final /* synthetic */ int f16548g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3555a(BaseFinderFeed baseFinderFeed, FinderFeedSearchUI finderFeedSearchUI, MenuItem menuItem, int i) {
                super(1);
                this.f16545d = baseFinderFeed;
                this.f16546e = finderFeedSearchUI;
                this.f16547f = menuItem;
                this.f16548g = i;
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Class cls = C64916p1.class;
                C87412m.m108594g(str, "userName");
                if (this.f16545d.mo3513o().isLiveFeed()) {
                    AppCompatActivity context = this.f16546e.getContext();
                    C87412m.m108593f(context, "context");
                    MenuItem menuItem = this.f16547f;
                    C87412m.m108593f(menuItem, "menuItem");
                    String str2 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76724vV(context, str2, (C76875f0) menuItem, this.f16545d.mo3513o(), new C3590f(this.f16545d));
                } else {
                    AppCompatActivity context2 = this.f16546e.getContext();
                    C87412m.m108593f(context2, "context");
                    MenuItem menuItem2 = this.f16547f;
                    C87412m.m108593f(menuItem2, "menuItem");
                    String str3 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76652BO(context2, str3, (C76875f0) menuItem2, this.f16545d.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
                }
                C7433e1 e1Var = C7433e1.f25622a;
                FinderFeedSearchUI finderFeedSearchUI = this.f16546e;
                finderFeedSearchUI.getClass();
                e1Var.mo8575d(finderFeedSearchUI, str, this.f16545d.getItemId(), this.f16548g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$b */
        public static final class C3556b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16549d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16616j f16550e;

            public C3556b(FinderFeedSearchUI finderFeedSearchUI, RecyclerView.C16616j jVar) {
                this.f16549d = finderFeedSearchUI;
                this.f16550e = jVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f16549d.f16470I;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(this.f16550e);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$c */
        public static final class C3557c extends C87413o implements C32226l<Integer, List<? extends Long>> {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16551d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f16552e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3557c(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
                super(1);
                this.f16551d = finderFeedSearchUI;
                this.f16552e = baseFinderFeed;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                LinkedList linkedList = new LinkedList();
                Iterator<E> it = this.f16551d.f16513x.iterator();
                C87412m.m108593f(it, "feedList.iterator()");
                int i = 0;
                while (it.hasNext()) {
                    E next = it.next();
                    C87412m.m108593f(next, "iterator.next()");
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        C58969q l = baseFinderFeed.mo3507l();
                        String str = l != null ? l.field_username : null;
                        C58969q l2 = this.f16552e.mo3507l();
                        if (C87412m.m108589b(str, l2 != null ? l2.field_username : null)) {
                            it.remove();
                            linkedList.add(Long.valueOf(baseFinderFeed.mo3513o().getCreateTime()));
                            RecyclerView recyclerView = this.f16551d.f16470I;
                            if (recyclerView != null) {
                                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                                if (adapter != null) {
                                    adapter.notifyItemRemoved(i);
                                }
                                Log.m105924i("Finder.FinderFeedSearchUI", "[UNINTEREST] removeAt " + i + " subType=" + intValue);
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return linkedList;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$d */
        public static final class C3558d extends C87413o implements C32226l<List<? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f16553d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3558d(BaseFinderFeed baseFinderFeed) {
                super(1);
                this.f16553d = baseFinderFeed;
            }

            public Object invoke(Object obj) {
                List<String> list = (List) obj;
                if (this.f16553d.mo3513o().isLiveFeed()) {
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
                    C64273c21 liveInfo = this.f16553d.mo3513o().getLiveInfo();
                    if (liveInfo != null) {
                        l = Long.valueOf(liveInfo.f182392d);
                    }
                    C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f16553d.mo3513o().getFeedObject().f164794id), this.f16553d.mo3513o().getFeedObject().username, "1", "1", "0", jSONObject, (String) null, 128, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$e */
        public static final class C3559e extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFullSeekBarLayout f16554d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3559e(FinderFullSeekBarLayout finderFullSeekBarLayout) {
                super(1);
                this.f16554d = finderFullSeekBarLayout;
            }

            public Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                this.f16554d.mo4259i("Finder.FinderFeedSearchUI");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$f */
        public static final class C3560f implements C8794p5<C51954xc1> {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16555d;

            public C3560f(FinderFeedSearchUI finderFeedSearchUI) {
                this.f16555d = finderFeedSearchUI;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C51954xc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                if (nh02.f138603e == 0) {
                    C76912y0.makeText((Context) this.f16555d.getContext(), (int) C0966R.string.d9x, 0).show();
                    return;
                }
                C76912y0.makeText((Context) this.f16555d.getContext(), (int) C0966R.string.d9w, 0).show();
                Log.m105924i("Finder.FinderFeedSearchUI", "finder_feed_open_comment_no_ok " + nh02.f138603e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$g */
        public static final class C3561g implements C8794p5<C51954xc1> {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16556d;

            public C3561g(FinderFeedSearchUI finderFeedSearchUI) {
                this.f16556d = finderFeedSearchUI;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C51954xc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                if (nh02.f138603e == 0) {
                    C76912y0.makeText((Context) this.f16556d.getContext(), (int) C0966R.string.d8t, 0).show();
                    return;
                }
                C76912y0.makeText((Context) this.f16556d.getContext(), (int) C0966R.string.d8s, 0).show();
                Log.m105924i("Finder.FinderFeedSearchUI", "finder_feed_close_comment_ok " + nh02.f138603e);
            }
        }

        public C3554k(BaseFinderFeed baseFinderFeed, C32224a<C13598b0> aVar, FinderFeedSearchUI finderFeedSearchUI, C60905o oVar, int i) {
            this.f16540d = baseFinderFeed;
            this.f16541e = aVar;
            this.f16542f = finderFeedSearchUI;
            this.f16543g = oVar;
            this.f16544h = i;
        }

        /* JADX WARNING: type inference failed for: r10v8, types: [java.lang.Long] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r31, int r32) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "getMoreMenuItemSelectedListener feed "
                r3.append(r4)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f16540d
                r3.append(r4)
                r4 = 32
                r3.append(r4)
                r4 = r32
                r3.append(r4)
                java.lang.String r4 = " menuItem:"
                r3.append(r4)
                int r4 = r31.getItemId()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Finder.FinderFeedSearchUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                fy3.a<rx3.b0> r3 = r0.f16541e
                if (r3 == 0) goto L_0x003b
                r3.invoke()
            L_0x003b:
                int r3 = r31.getItemId()
                r5 = 99
                java.lang.String r6 = "feedid"
                java.lang.String r7 = "from_action"
                r8 = 2
                java.lang.String r9 = "context"
                r10 = 0
                r11 = 1
                if (r3 == r5) goto L_0x063c
                r4 = 109(0x6d, float:1.53E-43)
                r5 = 0
                if (r3 == r4) goto L_0x05a1
                r4 = 116(0x74, float:1.63E-43)
                if (r3 == r4) goto L_0x0515
                r4 = 207(0xcf, float:2.9E-43)
                if (r3 == r4) goto L_0x0505
                r4 = 106(0x6a, float:1.49E-43)
                if (r3 == r4) goto L_0x04ec
                r4 = 107(0x6b, float:1.5E-43)
                if (r3 == r4) goto L_0x04d3
                r4 = 113(0x71, float:1.58E-43)
                if (r3 == r4) goto L_0x0432
                r4 = 114(0x72, float:1.6E-43)
                if (r3 == r4) goto L_0x03bf
                r4 = 119(0x77, float:1.67E-43)
                if (r3 == r4) goto L_0x03ad
                r4 = 120(0x78, float:1.68E-43)
                java.lang.String r12 = "feed"
                if (r3 == r4) goto L_0x0388
                r4 = 209(0xd1, float:2.93E-43)
                if (r3 == r4) goto L_0x0355
                r4 = 210(0xd2, float:2.94E-43)
                if (r3 == r4) goto L_0x0341
                r4 = 301(0x12d, float:4.22E-43)
                if (r3 == r4) goto L_0x031b
                r4 = 302(0x12e, float:4.23E-43)
                if (r3 == r4) goto L_0x031b
                switch(r3) {
                    case 101: goto L_0x01c5;
                    case 102: goto L_0x0172;
                    case 103: goto L_0x00d2;
                    case 104: goto L_0x00a3;
                    default: goto L_0x0086;
                }
            L_0x0086:
                switch(r3) {
                    case 200: goto L_0x0274;
                    case 201: goto L_0x0266;
                    case 202: goto L_0x0252;
                    default: goto L_0x0089;
                }
            L_0x0089:
                switch(r3) {
                    case 305: goto L_0x0303;
                    case 306: goto L_0x02ed;
                    case 307: goto L_0x0296;
                    default: goto L_0x008c;
                }
            L_0x008c:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                wc3.e0 r3 = r2.f16485U
                if (r3 == 0) goto L_0x0315
                r4 = r1
                nj3.f0 r4 = (nj3.C76875f0) r4
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$a r5 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f16540d
                int r7 = r0.f16544h
                r5.<init>(r6, r2, r1, r7)
                r3.xc0(r4, r5)
                goto L_0x0710
            L_0x00a3:
                er1.l0 r1 = er1.C58745l0.f168212a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r4 = r0.f16542f
                r1.mo83743a(r3, r4)
                di3.d r1 = di3.C86312j.m106911c(r2)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r10 = r1
                dp1.y0 r10 = (dp1.C58417y0) r10
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r11 = r1.getContext()
                gy3.C87412m.m108593f(r11, r9)
                r12 = 1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                long r13 = r1.getItemId()
                r15 = 0
                r16 = 8
                r17 = 0
                dp1.C58417y0.Qy0(r10, r11, r12, r13, r15, r16, r17)
                goto L_0x0710
            L_0x00d2:
                er1.v2$a r18 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 28
                r25 = 0
                r19 = r1
                r20 = r2
                er1.C7888v2.C7889a.m8057w(r18, r19, r20, r21, r22, r23, r24, r25)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isLiveFeed()
                if (r1 == 0) goto L_0x013c
                ms3.a r12 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x010a
                long r1 = r1.f182392d
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                goto L_0x010b
            L_0x010a:
                r1 = r10
            L_0x010b:
                java.lang.String r13 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                long r1 = r1.f164794id
                java.lang.String r14 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r15 = r1.username
                r19 = 0
                r20 = 0
                r21 = 192(0xc0, float:2.69E-43)
                r22 = 0
                java.lang.String r16 = "1"
                java.lang.String r17 = "2"
                java.lang.String r18 = "0"
                ms3.C11091a.m10992b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            L_0x013c:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0157
                te3.hj1 r10 = r1.mo12861q3()
            L_0x0157:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x015f
                r8 = 1
            L_0x015f:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_forward_friendcircle"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x0172:
                er1.v2$a r12 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r13 = r0.f16542f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r1.mo3513o()
                r15 = 0
                r16 = 3
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$d r1 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                r1.<init>(r2)
                r18 = 4
                r19 = 0
                r17 = r1
                er1.C7888v2.C7889a.m8056t(r12, r13, r14, r15, r16, r17, r18, r19)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x01aa
                te3.hj1 r10 = r1.mo12861q3()
            L_0x01aa:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x01b2
                r8 = 1
            L_0x01b2:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_forward_friend"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x01c5:
                er1.j4 r1 = er1.C58739j4.f168176a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                boolean r1 = r1.mo83686O(r2)
                if (r1 == 0) goto L_0x0200
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x021c
                long r14 = r1.f182392d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                sf1.a r12 = sf1.C13671a.f38718a
                androidx.appcompat.app.AppCompatActivity r13 = r1.getContext()
                gy3.C87412m.m108593f(r13, r9)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
                java.lang.String r16 = r1.getUserName()
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 56
                r21 = 0
                sf1.C13671a.m12976c(r12, r13, r14, r16, r17, r18, r19, r20, r21)
                goto L_0x021c
            L_0x0200:
                sf1.a r22 = sf1.C13671a.f38718a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                r25 = 0
                r27 = 0
                r28 = 12
                r29 = 0
                r23 = r1
                r24 = r2
                sf1.C13671a.m12975b(r22, r23, r24, r25, r27, r28, r29)
            L_0x021c:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0237
                te3.hj1 r10 = r1.mo12861q3()
            L_0x0237:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x023f
                r8 = 1
            L_0x023f:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_complaint"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x0252:
                pf1.d0 r1 = pf1.C62262d0.f176978a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                int r4 = r0.f16544h
                r1.mo87324p(r2, r3, r4)
                goto L_0x0710
            L_0x0266:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                r2.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                r1.mo83671q(r2, r3)
                goto L_0x0710
            L_0x0274:
                er1.p2 r1 = er1.C7853p2.f26439a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r3 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                gy3.C87412m.m108593f(r3, r9)
                wp1.j r4 = wp1.C15587j.f42215a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
                java.lang.String r5 = r5.getFromAppId()
                te3.wf3 r4 = r4.mo14352d(r5)
                r1.mo8961d(r2, r3, r4)
                goto L_0x0710
            L_0x0296:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.v> r2 = rs1.C63648v.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(context).…ddHistoryUIC::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                rs1.v r1 = (rs1.C63648v) r1
                jq3.o r2 = r0.f16543g
                r1.mo88474e3(r2, r5)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x02d2
                te3.hj1 r10 = r1.mo12861q3()
            L_0x02d2:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x02da
                r8 = 1
            L_0x02da:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_minimize"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x02ed:
                er1.i1 r12 = er1.C58736i1.f168173a
                jq3.o r13 = r0.f16543g
                r14 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = r0.f16540d
                int r1 = r0.f16544h
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r2 = r2.f16513x
                r16 = r1
                r17 = r2
                r12.mo83666l(r13, r14, r15, r16, r17)
                goto L_0x0710
            L_0x0303:
                er1.i1 r3 = er1.C58736i1.f168173a
                jq3.o r4 = r0.f16543g
                r5 = 1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f16540d
                int r7 = r0.f16544h
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r8 = r1.f16513x
                r3.mo83666l(r4, r5, r6, r7, r8)
                goto L_0x0710
            L_0x0315:
                java.lang.String r1 = "quickMenuHelper"
                gy3.C87412m.m108603p(r1)
                throw r10
            L_0x031b:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                r2.getClass()
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.a1> r2 = rs1.C63513a1.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(getActivi…derBulletUIC::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r3 = r1
                rs1.a1 r3 = (rs1.C63513a1) r3
                jq3.o r4 = r0.f16543g
                r5 = 0
                r6 = 1
                r7 = 0
                r8 = 8
                r9 = 0
                rs1.C63513a1.m74853e3(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0710
            L_0x0341:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                jq3.o r4 = r0.f16543g
                r1.mo83672r(r2, r3, r4)
                goto L_0x0710
            L_0x0355:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r3 = r1.getContext()
                gy3.C87412m.m108593f(r3, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                gy3.C87412m.m108594g(r1, r12)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                te3.kf1 r1 = r1.object_extend
                if (r1 == 0) goto L_0x0710
                te3.ui0 r1 = r1.f136756r
                if (r1 == 0) goto L_0x0710
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f142864d
                if (r1 == 0) goto L_0x0710
                pf1.q r4 = new pf1.q
                r4.<init>(r1)
                pf1.d0 r2 = pf1.C62262d0.f176978a
                r5 = 0
                r6 = 0
                r7 = 12
                r8 = 0
                pf1.C62262d0.m73168c(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0710
            L_0x0388:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                java.lang.String r3 = "activity"
                gy3.C87412m.m108594g(r1, r3)
                gy3.C87412m.m108594g(r2, r12)
                java.lang.Class<hy.o0> r3 = p166hy.C98567o0.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                hy.o0 r3 = (p166hy.C98567o0) r3
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                byte[] r2 = r2.toByteArray()
                r3.Wk0(r1, r8, r2, r5)
                goto L_0x0710
            L_0x03ad:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                r1.mo83668n(r2, r3)
                goto L_0x0710
            L_0x03bf:
                jq3.o r1 = r0.f16543g
                r2 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r1 = r1.mo85812D(r2)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
                java.lang.String r2 = "fullVideoSeekBar"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 3
                gr1.C59667n2.C8415a.m8377a(r1, r10, r5, r2, r10)
                er1.n2 r12 = er1.C7842n2.f26407a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r13 = r2.getContext()
                gy3.C87412m.m108593f(r13, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = r0.f16540d
                r15 = 2
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                jq3.o r2 = r0.f16543g
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$e r3 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$e
                r3.<init>(r1)
                r23 = 120(0x78, float:1.68E-43)
                r24 = 0
                r21 = r2
                r22 = r3
                er1.C7842n2.m7986b(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0417
                te3.hj1 r10 = r1.mo12861q3()
            L_0x0417:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x041f
                r8 = 1
            L_0x041f:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_set_bell"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x0432:
                er1.v2$a r12 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r13 = r1.getContext()
                gy3.C87412m.m108593f(r13, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = r0.f16540d
                r15 = 0
                r16 = 0
                r17 = 12
                r18 = 0
                er1.C7888v2.C7889a.m8058y(r12, r13, r14, r15, r16, r17, r18)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0465
                te3.hj1 r1 = r1.mo12861q3()
                goto L_0x0466
            L_0x0465:
                r1 = r10
            L_0x0466:
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                if (r4 != r11) goto L_0x046e
                r8 = 1
            L_0x046e:
                r9.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r9.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "textstatus_in_menu"
                r5.mo8577a(r1, r2, r11, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isLiveFeed()
                if (r1 == 0) goto L_0x0710
                ms3.a r11 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x04a0
                long r1 = r1.f182392d
                java.lang.Long r10 = java.lang.Long.valueOf(r1)
            L_0x04a0:
                java.lang.String r12 = java.lang.String.valueOf(r10)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                long r1 = r1.f164794id
                java.lang.String r13 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r14 = r1.username
                r18 = 0
                r19 = 0
                r20 = 192(0xc0, float:2.69E-43)
                r21 = 0
                java.lang.String r15 = "1"
                java.lang.String r16 = "3"
                java.lang.String r17 = "0"
                ms3.C11091a.m10992b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x0710
            L_0x04d3:
                wp1.a r1 = wp1.C66164a.f190162a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$f r4 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$f
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r5 = r0.f16542f
                r4.<init>(r5)
                r1.mo90220a(r2, r3, r11, r4)
                goto L_0x0710
            L_0x04ec:
                wp1.a r1 = wp1.C66164a.f190162a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$g r4 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$g
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r6 = r0.f16542f
                r4.<init>(r6)
                r1.mo90220a(r2, r3, r5, r4)
                goto L_0x0710
            L_0x0505:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                r2.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                int r4 = r0.f16544h
                r1.mo83670p(r2, r3, r4)
                goto L_0x0710
            L_0x0515:
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                jq3.o r1 = r0.f16543g
                r2 = 2131302830(0x7f0919ae, float:1.8223757E38)
                android.view.View r1 = r1.mo85812D(r2)
                if (r1 == 0) goto L_0x0528
                r13.add(r1)
            L_0x0528:
                jq3.o r1 = r0.f16543g
                r2 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r1 = r1.mo85812D(r2)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
                if (r1 == 0) goto L_0x053a
                gr1.o2 r1 = r1.getVideoView()
                goto L_0x053b
            L_0x053a:
                r1 = r10
            L_0x053b:
                boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r2 == 0) goto L_0x0543
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r1
                r14 = r1
                goto L_0x0544
            L_0x0543:
                r14 = r10
            L_0x0544:
                if (r14 == 0) goto L_0x056b
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                bl3.r r2 = bl3.C39818r.f106831a
                r1.getClass()
                bl3.r$a r1 = r2.mo62444c(r1)
                java.lang.Class<rs1.da> r2 = rs1.C13194da.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(getActivi…edControlUIC::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r12 = r1
                rs1.da r12 = (rs1.C13194da) r12
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 28
                r19 = 0
                rs1.C13194da.m12605k3(r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x056b:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0586
                te3.hj1 r10 = r1.mo12861q3()
            L_0x0586:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x058e
                r8 = 1
            L_0x058e:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_speedplay"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x05a1:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isPostFinish()
                if (r1 == 0) goto L_0x0606
                vp1.e r1 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                vp1.e$b r4 = vp1.C65834e.C65836b.f189323c
                r1.mo89878l(r3, r4)
                er1.q3 r1 = er1.C58771q3.f168268a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r3 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                gy3.C87412m.m108593f(r3, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x05d6
                te3.ve1 r4 = r4.feedBgmInfo
                goto L_0x05d7
            L_0x05d6:
                r4 = r10
            L_0x05d7:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
                long r12 = r12.field_id
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r1.mo83812c(r3, r4, r12, r5)
                di3.d r1 = di3.C86312j.m106911c(r2)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                gy3.C87412m.m108593f(r2, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.field_finderObject
                int r3 = r3.follow_feed_count
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.wy0(r2, r11, r11, r3)
            L_0x0606:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x0621
                te3.hj1 r10 = r1.mo12861q3()
            L_0x0621:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x0629
                r8 = 1
            L_0x0629:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_original_sound"
                r5.mo8577a(r10, r2, r11, r1)
                goto L_0x0710
            L_0x063c:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r1 = r1.f16513x
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                int r1 = r1.indexOf(r2)
                if (r1 < 0) goto L_0x06c8
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.recyclerview.widget.RecyclerView r1 = r1.f16470I
                java.lang.String r2 = "recyclerView"
                if (r1 == 0) goto L_0x06c4
                androidx.recyclerview.widget.RecyclerView$j r1 = r1.getItemAnimator()
                androidx.recyclerview.widget.f r3 = new androidx.recyclerview.widget.f
                r3.<init>()
                r12 = 2000(0x7d0, double:9.88E-321)
                r3.f44808d = r12
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r5 = r0.f16542f
                androidx.recyclerview.widget.RecyclerView r5 = r5.f16470I
                if (r5 == 0) goto L_0x06c0
                r5.setItemAnimator(r3)
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r5 = r0.f16542f
                androidx.recyclerview.widget.RecyclerView r12 = r5.f16470I
                if (r12 == 0) goto L_0x06bc
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$b r2 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$b
                r2.<init>(r5, r1)
                long r13 = r3.f44808d
                r12.postDelayed(r2, r13)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "defaultItemAnimator.removeDuration ="
                r1.append(r2)
                long r2 = r3.f44808d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                sf1.b r12 = sf1.C13672b.f38719a
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                androidx.appcompat.app.AppCompatActivity r13 = r1.getContext()
                gy3.C87412m.m108593f(r13, r9)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                long r14 = r1.getId()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f16540d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                java.lang.String r16 = r1.getObjectNonceId()
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$c r1 = new com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$k$c
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r2 = r0.f16542f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f16540d
                r1.<init>(r2, r3)
                java.lang.Boolean r17 = java.lang.Boolean.FALSE
                r18 = r1
                r12.mo13059a(r13, r14, r16, r17, r18)
                goto L_0x06dc
            L_0x06bc:
                gy3.C87412m.m108603p(r2)
                throw r10
            L_0x06c0:
                gy3.C87412m.m108603p(r2)
                throw r10
            L_0x06c4:
                gy3.C87412m.m108603p(r2)
                throw r10
            L_0x06c8:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "[UNINTEREST] pos error "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            L_0x06dc:
                com.tencent.mm.plugin.finder.search.FinderFeedSearchUI r1 = r0.f16542f
                r1.getClass()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f16540d
                long r2 = r2.getItemId()
                int r4 = r0.f16544h
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x06f7
                te3.hj1 r10 = r1.mo12861q3()
            L_0x06f7:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r11) goto L_0x06ff
                r8 = 1
            L_0x06ff:
                r1.put(r7, r8)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r6, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_uninterested"
                r5.mo8577a(r10, r2, r11, r1)
            L_0x0710:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3554k.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$l */
    public static final class C3562l implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedSearchUI f16557a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f16558b;

        public C3562l(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
            this.f16557a = finderFeedSearchUI;
            this.f16558b = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo2585a(View view, int i, MenuItem menuItem) {
            C58736i1 i1Var = C58736i1.f168173a;
            AppCompatActivity context = this.f16557a.getContext();
            C87412m.m108593f(context, "context");
            C87412m.m108593f(view, "menuView");
            C87412m.m108593f(menuItem, "menuItem");
            i1Var.mo83667m(context, view, i, menuItem, this.f16558b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$m */
    public static final class C3563m implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16559d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f16560e;

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$m$a */
        public static final class C3564a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16561d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16616j f16562e;

            public C3564a(FinderFeedSearchUI finderFeedSearchUI, RecyclerView.C16616j jVar) {
                this.f16561d = finderFeedSearchUI;
                this.f16562e = jVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f16561d.f16470I;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(this.f16562e);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$m$b */
        public static final class C3565b extends C87413o implements C32226l<Integer, List<? extends Long>> {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedSearchUI f16563d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f16564e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3565b(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
                super(1);
                this.f16563d = finderFeedSearchUI;
                this.f16564e = baseFinderFeed;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                LinkedList linkedList = new LinkedList();
                Iterator<E> it = this.f16563d.f16513x.iterator();
                C87412m.m108593f(it, "feedList.iterator()");
                int i = 0;
                while (it.hasNext()) {
                    E next = it.next();
                    C87412m.m108593f(next, "iterator.next()");
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        C58969q l = baseFinderFeed.mo3507l();
                        String str = l != null ? l.field_username : null;
                        C58969q l2 = this.f16564e.mo3507l();
                        if (C87412m.m108589b(str, l2 != null ? l2.field_username : null)) {
                            it.remove();
                            linkedList.add(Long.valueOf(baseFinderFeed.mo3513o().getCreateTime()));
                            RecyclerView recyclerView = this.f16563d.f16470I;
                            if (recyclerView != null) {
                                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                                if (adapter != null) {
                                    adapter.notifyItemRemoved(i);
                                }
                                Log.m105924i("Finder.FinderFeedSearchUI", "[UNINTEREST] removeAt " + i + " subType=" + intValue);
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return linkedList;
            }
        }

        public C3563m(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
            this.f16559d = finderFeedSearchUI;
            this.f16560e = baseFinderFeed;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 99) {
                int indexOf = this.f16559d.f16513x.indexOf(this.f16560e);
                if (indexOf >= 0) {
                    RecyclerView recyclerView = this.f16559d.f16470I;
                    if (recyclerView != null) {
                        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
                        C54234f fVar = new C54234f();
                        fVar.f44808d = 2000;
                        RecyclerView recyclerView2 = this.f16559d.f16470I;
                        if (recyclerView2 != null) {
                            recyclerView2.setItemAnimator(fVar);
                            FinderFeedSearchUI finderFeedSearchUI = this.f16559d;
                            RecyclerView recyclerView3 = finderFeedSearchUI.f16470I;
                            if (recyclerView3 != null) {
                                recyclerView3.postDelayed(new C3564a(finderFeedSearchUI, itemAnimator), fVar.f44808d);
                                Log.m105924i("Finder.FinderFeedSearchUI", "defaultItemAnimator.removeDuration =" + fVar.f44808d);
                                C13672b bVar = C13672b.f38719a;
                                AppCompatActivity context = this.f16559d.getContext();
                                C87412m.m108593f(context, "context");
                                bVar.mo13059a(context, this.f16560e.mo3513o().getId(), this.f16560e.mo3513o().getObjectNonceId(), Boolean.FALSE, new C3565b(this.f16559d, this.f16560e));
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                Log.m105924i("Finder.FinderFeedSearchUI", "[UNINTEREST] pos error " + indexOf);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$n */
    public static final class C3566n extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16565d;

        public C3566n(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16565d = finderFeedSearchUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                FinderFeedSearchUI finderFeedSearchUI = this.f16565d;
                int i2 = FinderFeedSearchUI.f16461g1;
                if (!finderFeedSearchUI.mo3883S7()) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    RecyclerView.C16613e adapter = recyclerView.getAdapter();
                    int itemCount = adapter != null ? adapter.getItemCount() : 0;
                    int C = linearLayoutManager.mo16957C();
                    int E = linearLayoutManager.mo16959E();
                    if (this.f16565d.f16498b1) {
                        C = E;
                    }
                    if (C != -1 && itemCount - C <= 3) {
                        Log.m105924i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord currentPos:" + C + " itemCount:" + itemCount);
                        FinderFeedSearchUI finderFeedSearchUI2 = this.f16565d;
                        int i3 = finderFeedSearchUI2.f16508s;
                        finderFeedSearchUI2.getClass();
                        Log.m105924i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord  continueFlag：" + i3);
                        if (i3 == 1) {
                            String str = finderFeedSearchUI2.f16506q;
                            if (str != null) {
                                finderFeedSearchUI2.mo3895f8(str, true);
                            }
                        } else if (finderFeedSearchUI2.mo3894e8(true)) {
                            Log.m105924i("Finder.FinderFeedSearchUI", "start Preload SearchNextHot loading");
                        } else if (finderFeedSearchUI2.f16509t == 1) {
                            Log.m105924i("Finder.FinderFeedSearchUI", "start preload SearchList loading");
                            if (!finderFeedSearchUI2.mo3882R7((C48727ak1) null, true)) {
                                finderFeedSearchUI2.mo3890Z7();
                            }
                        } else {
                            Log.m105924i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord nothing");
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View view;
            int i3;
            int i4;
            boolean z;
            boolean z2;
            RecyclerView recyclerView2 = recyclerView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView2);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView2, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            FinderFeedSearchUI finderFeedSearchUI = this.f16565d;
            int i5 = FinderFeedSearchUI.f16461g1;
            if (!finderFeedSearchUI.mo3883S7()) {
                FinderFeedSearchUI finderFeedSearchUI2 = this.f16565d;
                finderFeedSearchUI2.getClass();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                finderFeedSearchUI2.f16498b1 = !((LinearLayoutManager) layoutManager).canScrollHorizontally() ? i2 >= 0 : i >= 0;
                FinderFeedSearchUI finderFeedSearchUI3 = this.f16565d;
                finderFeedSearchUI3.getClass();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.getItemCount();
                }
                int C = linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                if (finderFeedSearchUI3.f16498b1) {
                    i4 = E - 1;
                    i3 = E + 1;
                    RecyclerView.C16631z I0 = recyclerView2.mo17023I0(E);
                    view = I0 != null ? I0.f44854d : null;
                } else {
                    int i6 = C + 1;
                    i3 = C - 1;
                    RecyclerView.C16631z I02 = recyclerView2.mo17023I0(C);
                    view = I02 != null ? I02.f44854d : null;
                    int i7 = C;
                    i4 = i6;
                    E = i7;
                }
                if (view != null) {
                    Iterator<Integer> it = finderFeedSearchUI3.f16502f1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        View findViewById = view.findViewById(it.next().intValue());
                        if (findViewById != null && findViewById.getVisibility() == 0) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        boolean z3 = finderFeedSearchUI3.f16498b1;
                        String T7 = finderFeedSearchUI3.mo3884T7(i3);
                        if (z3) {
                            if (T7 != null) {
                                WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.j5q);
                                if (weImageView != null) {
                                    weImageView.setRotation(0.0f);
                                }
                                TextView textView = (TextView) view.findViewById(C0966R.C0970id.j5r);
                                if (textView != null) {
                                    textView.setText(view.getContext().getResources().getString(C0966R.string.enb, new Object[]{'\"' + T7 + '\"'}));
                                }
                            }
                        } else if (T7 != null) {
                            WeImageView weImageView2 = (WeImageView) view.findViewById(C0966R.C0970id.j5q);
                            if (weImageView2 != null) {
                                weImageView2.setRotation(180.0f);
                            }
                            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.j5r);
                            if (textView2 != null) {
                                textView2.setText(view.getContext().getResources().getString(C0966R.string.enc, new Object[]{'\"' + T7 + '\"'}));
                            }
                        }
                    } else {
                        boolean z4 = finderFeedSearchUI3.f16498b1;
                        Iterator<Map.Entry<Integer, String>> it4 = finderFeedSearchUI3.f16499c1.entrySet().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = false;
                                break;
                            }
                            Map.Entry next = it4.next();
                            int intValue = ((Number) next.getKey()).intValue();
                            String str = (String) next.getValue();
                            if (i4 == intValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            i4 = z4 ? i4 - 1 : i4 + 1;
                        }
                        String T72 = finderFeedSearchUI3.mo3884T7(i4);
                        String T73 = finderFeedSearchUI3.mo3884T7(E);
                        if (!TextUtils.isEmpty(T72) && !TextUtils.isEmpty(T73) && !TextUtils.equals(T72, T73) && !TextUtils.equals(finderFeedSearchUI3.f16501e1, T73)) {
                            Rect rect = new Rect();
                            view.getGlobalVisibleRect(rect);
                            if (((double) rect.height()) > ((double) view.getHeight()) * 0.5d) {
                                FTSSearchView fTSSearchView = finderFeedSearchUI3.f16503o;
                                if (fTSSearchView != null) {
                                    String string = fTSSearchView.getContext().getResources().getString(C0966R.string.en_, new Object[]{'\"' + T73 + '\"'});
                                    C87412m.m108593f(string, "searchView.context.resou…\\\"${curPosHotWording}\\\"\")");
                                    finderFeedSearchUI3.mo3892b8(string);
                                    view.performHapticFeedback(0, 3);
                                    C60055x0 x0Var = finderFeedSearchUI3.f16477Q;
                                    if (x0Var != null) {
                                        x0Var.f171399r = T73 == null ? "" : T73;
                                        FTSSearchView fTSSearchView2 = finderFeedSearchUI3.f16503o;
                                        if (fTSSearchView2 != null) {
                                            fTSSearchView2.getFtsEditText().mo70358n(T73, (List<FTSSearchView.C6996f>) null, true);
                                            FTSSearchView fTSSearchView3 = finderFeedSearchUI3.f16503o;
                                            if (fTSSearchView3 != null) {
                                                String string2 = fTSSearchView3.getContext().getResources().getString(C0966R.string.en_, new Object[]{'\"' + T73 + '\"'});
                                                C87412m.m108593f(string2, "searchView.context.resou…\\\"${curPosHotWording}\\\"\")");
                                                finderFeedSearchUI3.mo3892b8(string2);
                                                if (T73 == null) {
                                                    T73 = "";
                                                }
                                                finderFeedSearchUI3.f16501e1 = T73;
                                                finderFeedSearchUI3.mo3886V7(T73);
                                            } else {
                                                C87412m.m108603p("searchView");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("searchView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("searchSuggestionManager");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$o */
    public static final class C3567o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16566d;

        public C3567o(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16566d = finderFeedSearchUI;
        }

        public final void run() {
            FinderFeedSearchUI finderFeedSearchUI = this.f16566d;
            RecyclerView recyclerView = finderFeedSearchUI.f16470I;
            if (recyclerView == null) {
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = finderFeedSearchUI.f16470I;
                if (recyclerView2 != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int C = ((LinearLayoutManager) layoutManager).mo16957C();
                    RecyclerView recyclerView3 = finderFeedSearchUI.f16470I;
                    if (recyclerView3 != null) {
                        RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                        C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int E = ((LinearLayoutManager) layoutManager2).mo16959E();
                        if (C <= E) {
                            while (true) {
                                if (C >= 0 && C < finderFeedSearchUI.f16513x.size()) {
                                    finderFeedSearchUI.mo3879O7(finderFeedSearchUI.f16513x.get(C).getItemId(), C, 2);
                                }
                                if (C != E) {
                                    C++;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$p */
    public static final class C3568p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16567d;

        public C3568p(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16567d = finderFeedSearchUI;
        }

        public final void run() {
            C15133e0 e0Var = this.f16567d.f16485U;
            if (e0Var != null) {
                e0Var.hw0();
            } else {
                C87412m.m108603p("quickMenuHelper");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$q */
    public static final class C3569q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16568d;

        public C3569q(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16568d = finderFeedSearchUI;
        }

        public final void run() {
            FinderFeedSearchUI finderFeedSearchUI = this.f16568d;
            finderFeedSearchUI.f16499c1.put(0, finderFeedSearchUI.f16506q);
            FinderFeedSearchUI finderFeedSearchUI2 = this.f16568d;
            finderFeedSearchUI2.mo3888X7(finderFeedSearchUI2.f16482S0, finderFeedSearchUI2.f16479R);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$r */
    public static final class C3570r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedSearchUI f16569d;

        public C3570r(FinderFeedSearchUI finderFeedSearchUI) {
            this.f16569d = finderFeedSearchUI;
        }

        public final void run() {
            TextView textView = this.f16569d.f16496Z0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public FinderFeedSearchUI() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(Integer.valueOf(C0966R.C0970id.j6y));
        this.f16502f1 = hashSet;
    }

    /* renamed from: N7 */
    public static final boolean m3650N7(FinderFeedSearchUI finderFeedSearchUI, BaseFinderFeed baseFinderFeed) {
        finderFeedSearchUI.getClass();
        C58969q l = baseFinderFeed.mo3507l();
        return C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null);
    }

    /* renamed from: d8 */
    public static /* synthetic */ void m3651d8(FinderFeedSearchUI finderFeedSearchUI, String str, C89349b bVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        finderFeedSearchUI.mo3893c8(str, bVar, z, z2);
    }

    /* renamed from: A1 */
    public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C3549f(baseFinderFeed, this, nVar);
    }

    /* renamed from: B5 */
    public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C3551h(this, baseFinderFeed);
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + 1;
            Log.m105924i("Finder.FinderSearchReportLogic", "report19184 " + str);
            C117407d.INSTANCE.kvStat(19184, str);
        }
    }

    /* renamed from: D1 */
    public RecyclerView.C16623q mo2571D1() {
        return this.f16463B;
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 6;
    }

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        int i2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C49712hj1 q3 = ((C13442s8) rVar.mo62444c(context).mo75002a(C13442s8.class)).mo12861q3();
        C0751m0 m0Var = C0751m0.f1769a;
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        C0751m0.m691b(m0Var, context2, q3, baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
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

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r1 = (r1 = r0.f16474M.get(java.lang.Long.valueOf(r23))).f16521c;
     */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3879O7(long r23, int r25, int r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0109
            r1 = -1
            int r4 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            goto L_0x0109
        L_0x0010:
            java.lang.String r1 = o40.C61926c.m72691p(r23)
            java.util.HashMap<java.lang.String, hp1.i> r2 = r0.f16462A
            boolean r2 = r2.containsKey(r1)
            if (r2 != 0) goto L_0x0109
            hp1.i r2 = new hp1.i
            r2.<init>()
            r2.f27858b = r1
            r11 = r25
            r2.f27857a = r11
            r5 = r26
            r2.f27859c = r5
            long r5 = java.lang.System.currentTimeMillis()
            r2.f27860d = r5
            java.util.HashMap<java.lang.String, hp1.i> r5 = r0.f16462A
            r5.put(r1, r2)
            java.util.HashMap<java.lang.String, hp1.i> r1 = r0.f16462A
            int r1 = r1.size()
            int r1 = r1 % 30
            java.lang.String r2 = ""
            r5 = 1
            if (r1 != 0) goto L_0x0094
            if (r3 == 0) goto L_0x005d
            if (r4 != 0) goto L_0x0048
            goto L_0x005d
        L_0x0048:
            android.util.ArrayMap<java.lang.Long, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b> r1 = r0.f16474M
            java.lang.Long r6 = java.lang.Long.valueOf(r23)
            java.lang.Object r1 = r1.get(r6)
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b r1 = (com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3545b) r1
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r1.f16521c
            if (r1 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r13 = r1
            goto L_0x005e
        L_0x005d:
            r13 = r2
        L_0x005e:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r1 != 0) goto L_0x0094
            java.util.HashMap<java.lang.String, hp1.i> r1 = r0.f16462A
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0094
            dp1.c1 r12 = dp1.C7428c1.f25609a
            if (r3 == 0) goto L_0x0089
            if (r4 != 0) goto L_0x0074
            goto L_0x0089
        L_0x0074:
            android.util.ArrayMap<java.lang.Long, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b> r1 = r0.f16474M
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            java.lang.Object r1 = r1.get(r3)
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b r1 = (com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3545b) r1
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = r1.f16520b
            if (r1 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r14 = r1
            goto L_0x008a
        L_0x0089:
            r14 = r2
        L_0x008a:
            r15 = 0
            java.util.HashMap<java.lang.String, hp1.i> r1 = r0.f16462A
            r17 = 3
            r16 = r1
            r12.mo8561a(r13, r14, r15, r16, r17)
        L_0x0094:
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            int r3 = r0.f16466E
            r4 = 5
            r6 = 6
            r7 = 3
            if (r3 == r6) goto L_0x00a2
            if (r3 != r4) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r12 = 3
            goto L_0x00a9
        L_0x00a2:
            r0.f16464C = r7
            if (r3 != r6) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r5 = 5
        L_0x00a8:
            r12 = r5
        L_0x00a9:
            android.util.ArrayMap<java.lang.Long, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b> r3 = r0.f16474M
            java.lang.Long r4 = java.lang.Long.valueOf(r23)
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$b r3 = (com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3545b) r3
            di3.d r4 = di3.C86312j.m106911c(r1)
            java.lang.String r5 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r5 = r4
            dp1.y0 r5 = (dp1.C58417y0) r5
            if (r3 == 0) goto L_0x00c6
            java.lang.String r6 = r3.f16521c
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            if (r3 == 0) goto L_0x00cc
            java.lang.String r7 = r3.f16520b
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            r8 = 2
            r9 = 2
            java.lang.String r10 = o40.C61926c.m72691p(r23)
            r13 = 1
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            java.lang.String r14 = r1.f167351e
            r15 = 1
            int r1 = r0.f16464C
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            rs1.s8 r4 = r4.mo12873f(r0)
            if (r4 == 0) goto L_0x00ee
            te3.hj1 r4 = r4.mo12861q3()
            r17 = r4
            goto L_0x00f0
        L_0x00ee:
            r17 = 0
        L_0x00f0:
            if (r3 == 0) goto L_0x00fa
            java.lang.String r3 = r3.f16522d
            if (r3 != 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            r18 = r3
            goto L_0x00fc
        L_0x00fa:
            r18 = r2
        L_0x00fc:
            r19 = 0
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 0
            r11 = r25
            r16 = r1
            dp1.C58417y0.cy0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.mo3879O7(long, int, int):void");
    }

    /* renamed from: P7 */
    public final void mo3880P7(FinderObject finderObject) {
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16);
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27930d.put(Long.valueOf(a.getId()), a);
        BaseFinderFeed k = C15585f.f42211a.mo14348k(a);
        C10865t.f32442c.mo11085a().mo11084a(C26236u.m33719b(a));
        this.f16513x.add(k);
    }

    /* renamed from: Q7 */
    public final void mo3881Q7(C0736h0 h0Var) {
        Log.m105924i("Finder.FinderFeedSearchUI", "addScrollTips wording:" + h0Var.f1758d);
        if (C110818d0.m150923U(this.f16513x) instanceof C0736h0) {
            mo3887W7(h0Var.f1758d);
            return;
        }
        int size = this.f16513x.size();
        String str = h0Var.f1758d;
        this.f16499c1.put(Integer.valueOf(size), str);
        this.f16513x.add(h0Var);
    }

    /* renamed from: R7 */
    public final boolean mo3882R7(C48727ak1 ak12, boolean z) {
        Log.m105924i("Finder.FinderFeedSearchUI", "getHotSearchList");
        if (this.f16466E != 5) {
            Log.m105924i("Finder.FinderFeedSearchUI", "getHotSearchList return for hotSearchType:" + this.f16466E + '!');
            return false;
        } else if (this.f16467F) {
            C9382v4 v4Var = this.f16512w;
            if (v4Var != null) {
                v4Var.f29309n = z;
            }
            Log.m105924i("Finder.FinderFeedSearchUI", "getHotSearchList return for isLoadingSearchList:" + this.f16467F + '!');
            return true;
        } else {
            this.f16467F = true;
            C89349b bVar = this.f16511v;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            C9382v4 v4Var2 = new C9382v4(14, bVar, f != null ? f.mo12861q3() : null, this.f16483T, this.f16481S, 0, 32, (C8480h) null);
            this.f16512w = v4Var2;
            v4Var2.f29309n = z;
            C86709a0.m107524d().mo123455a(4069, new C3552i(this));
            C89137b0 d = C86709a0.m107524d();
            C9382v4 v4Var3 = this.f16512w;
            C87412m.m108591d(v4Var3);
            d.mo123460f(v4Var3);
            return true;
        }
    }

    /* renamed from: S7 */
    public final boolean mo3883S7() {
        int i = this.f16466E;
        return (i == 5 || i == 6) ? false : true;
    }

    /* renamed from: T7 */
    public final String mo3884T7(int i) {
        String str = null;
        int i2 = Integer.MAX_VALUE;
        for (Map.Entry next : this.f16499c1.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            String str2 = (String) next.getValue();
            int abs = Math.abs(i - intValue);
            if (i > intValue && abs < i2) {
                str = str2;
                i2 = abs;
            } else if (i <= 0 && intValue == 0) {
                return str2;
            }
        }
        return str;
    }

    /* renamed from: U7 */
    public final void mo3885U7(C48727ak1 ak12) {
        Log.m105924i("Finder.FinderFeedSearchUI", "recordEventInfo hotWord:" + ak12);
        if (ak12 != null) {
            HashMap<String, C52271zj0> hashMap = this.f16500d1;
            String str = ak12.f130586d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put(str, ak12.f130592j);
            String stringExtra = getIntent().getStringExtra("key_search_query");
            if (stringExtra != null) {
                str2 = stringExtra;
            }
            if (C87412m.m108589b(str2, ak12.f130586d)) {
                mo3886V7(str2);
            }
        }
    }

    /* renamed from: V7 */
    public final void mo3886V7(String str) {
        C13598b0 b0Var;
        View view;
        if (!mo3883S7()) {
            Log.m105924i("Finder.FinderFeedSearchUI", "refreshHotSearchTitle hotWordText:" + str);
            C52271zj0 zj02 = this.f16500d1.get(str);
            this.f16495Z = zj02;
            TextView textView = this.f16489W;
            if (textView != null) {
                textView.setText(str);
            }
            if (zj02 != null) {
                View view2 = this.f16491X;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && (view = this.f16491X) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "refreshHotSearchTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: W7 */
    public final void mo3887W7(String str) {
        SearchHotWordListParcelable searchHotWordListParcelable = this.f16479R;
        if (searchHotWordListParcelable != null) {
            C87412m.m108594g(str, "hotWordText");
            if (Util.isNullOrNil(str)) {
                Log.m105924i(searchHotWordListParcelable.f16635d, "removePre return for empty");
            } else {
                Iterator<SearchHotWordParcelable> it = searchHotWordListParcelable.f16638g.iterator();
                int i = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SearchHotWordParcelable next = it.next();
                    C48727ak1 ak12 = next.f16639d;
                    if (Util.isEqual(ak12 != null ? ak12.f130586d : null, str)) {
                        String str2 = searchHotWordListParcelable.f16635d;
                        Log.m105924i(str2, "remove :" + str + " index:" + searchHotWordListParcelable.f16638g.indexOf(next) + ": position:" + searchHotWordListParcelable.f16637f);
                        break;
                    }
                    i++;
                }
                if (i >= 0 && i < searchHotWordListParcelable.f16638g.size()) {
                    searchHotWordListParcelable.f16638g.remove(i);
                    searchHotWordListParcelable.f16637f = i - 1;
                }
            }
        }
        if (this.f16513x.size() > 0) {
            Object U = C110818d0.m150923U(this.f16513x);
            C0736h0 h0Var = U instanceof C0736h0 ? (C0736h0) U : null;
            if (h0Var != null) {
                C87412m.m108594g(str, "<set-?>");
                h0Var.f1758d = str;
            }
            RecyclerView recyclerView = this.f16470I;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(this.f16513x.size() - 1);
                }
                this.f16499c1.put(Integer.valueOf(this.f16513x.size() - 1), str);
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        Log.m105928w("Finder.FinderFeedSearchUI", "onSceneEnd remove for list empty!");
    }

    /* renamed from: X2 */
    public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C3563m(this, baseFinderFeed);
    }

    /* renamed from: X7 */
    public final void mo3888X7(C9320i4 i4Var, SearchHotWordListParcelable searchHotWordListParcelable) {
        LinkedList<SearchHotWordParcelable> linkedList;
        if (i4Var != null && searchHotWordListParcelable != null && (linkedList = searchHotWordListParcelable.f16638g) != null) {
            boolean z = true;
            int i = searchHotWordListParcelable.f16637f + 1;
            int size = linkedList.size();
            if (i < 0 || i >= size) {
                z = false;
            }
            if (z) {
                i4Var.f29124u = searchHotWordListParcelable.f16638g.get(i).f16639d;
            }
        }
    }

    /* renamed from: Y4 */
    public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C3554k(baseFinderFeed, aVar, this, oVar, i);
    }

    /* renamed from: Y7 */
    public final void mo3889Y7() {
        TextView textView;
        Log.m105924i("Finder.FinderFeedSearchUI", "showLoadMoreFooter");
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16469H;
        View view = null;
        if (refreshLoadMoreLayout != null) {
            View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
            if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eas);
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16469H;
            if (refreshLoadMoreLayout2 != null) {
                View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16469H;
                if (refreshLoadMoreLayout3 != null) {
                    View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                    View findViewById = loadMoreFooter3 != null ? loadMoreFooter3.findViewById(C0966R.C0970id.g2s) : null;
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16469H;
                    if (refreshLoadMoreLayout4 != null) {
                        View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                        View findViewById2 = loadMoreFooter4 != null ? loadMoreFooter4.findViewById(C0966R.C0970id.g2q) : null;
                        if (findViewById2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f16469H;
                        if (refreshLoadMoreLayout5 != null) {
                            View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                            if (loadMoreFooter5 != null) {
                                view = loadMoreFooter5.findViewById(C0966R.C0970id.ive);
                            }
                            if (view != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: Z7 */
    public final void mo3890Z7() {
        TextView textView;
        Log.m105924i("Finder.FinderFeedSearchUI", "showNoMoreFooter");
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16469H;
        if (refreshLoadMoreLayout != null) {
            View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
            if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eat);
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16469H;
            if (refreshLoadMoreLayout2 != null) {
                View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16469H;
                if (refreshLoadMoreLayout3 != null) {
                    View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                    View findViewById = loadMoreFooter3 != null ? loadMoreFooter3.findViewById(C0966R.C0970id.g2s) : null;
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16469H;
                    if (refreshLoadMoreLayout4 != null) {
                        View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                        View findViewById2 = loadMoreFooter4 != null ? loadMoreFooter4.findViewById(C0966R.C0970id.g2q) : null;
                        if (findViewById2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f16469H;
                        if (refreshLoadMoreLayout5 != null) {
                            View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                            View findViewById3 = loadMoreFooter5 != null ? loadMoreFooter5.findViewById(C0966R.C0970id.ive) : null;
                            if (findViewById3 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view = findViewById3;
                                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            RecyclerView recyclerView = this.f16470I;
                            if (recyclerView != null) {
                                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                                int E = ((FinderLinearLayoutManager) layoutManager).mo16959E();
                                if (E != -1) {
                                    Log.m105924i("Finder.FinderFeedSearchUI", "[smoothScrollToLastPosition] nextPosition=" + E);
                                    recyclerView.post(new C8704x(recyclerView, E));
                                    return;
                                }
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: a8 */
    public final void mo3891a8() {
        if (this.f16466E == 0) {
            FTSSearchView fTSSearchView = this.f16503o;
            if (fTSSearchView == null) {
                C87412m.m108603p("searchView");
                throw null;
            } else if (fTSSearchView.getParent() == null) {
                ((FrameLayout) findViewById(C0966R.C0970id.f5375dg)).removeAllViews();
                FTSSearchView fTSSearchView2 = this.f16503o;
                if (fTSSearchView2 != null) {
                    ViewGroup.LayoutParams layoutParams = fTSSearchView2.getSearchContainer().getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                    FTSSearchView fTSSearchView3 = this.f16503o;
                    if (fTSSearchView3 != null) {
                        fTSSearchView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.f5375dg);
                        FTSSearchView fTSSearchView4 = this.f16503o;
                        if (fTSSearchView4 != null) {
                            frameLayout.addView(fTSSearchView4);
                        } else {
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("searchView");
                    throw null;
                }
            }
        }
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f16472K;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f16471J;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16469H;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        }
        C46091u0 u0Var = this.f16476P;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
        } else {
            C87412m.m108603p("historyLogic");
            throw null;
        }
    }

    /* renamed from: b8 */
    public final void mo3892b8(String str) {
        TextView textView = this.f16496Z0;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f16496Z0;
        if (textView2 != null) {
            textView2.setText(str);
        }
        Runnable runnable = this.f16494Y0;
        if (runnable != null) {
            this.f16492X0.removeCallbacks(runnable);
            this.f16494Y0 = null;
        }
        C3570r rVar = new C3570r(this);
        this.f16494Y0 = rVar;
        this.f16492X0.postDelayed(rVar, this.f16497a1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02bb  */
    /* renamed from: c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3893c8(java.lang.String r22, pe3.C89349b r23, boolean r24, boolean r25) {
        /*
            r21 = this;
            r0 = r21
            r2 = r22
            r0.f16506q = r2
            r15 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r0.f16507r = r15
            r0.f16508s = r15
            r13 = 0
            r0.f16510u = r13
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r1 = r0.f16513x
            r1.clear()
            if (r25 != 0) goto L_0x0028
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r1, r3)
            r0.f16517z = r1
        L_0x0028:
            je1.i4 r1 = r0.f16482S0
            if (r1 == 0) goto L_0x0035
            ob0.b0 r1 = f40.C86709a0.m107524d()
            je1.i4 r3 = r0.f16482S0
            r1.mo123458d(r3)
        L_0x0035:
            java.lang.String r1 = "Finder.FinderFeedSearchUI"
            java.lang.String r3 = "dismissFooter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f16469H
            java.lang.String r16 = "rlLayout"
            if (r3 == 0) goto L_0x02d5
            android.view.View r3 = r3.getLoadMoreFooter()
            r4 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r3 == 0) goto L_0x005a
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x005a
            r5 = 2131829092(0x7f112164, float:1.9291143E38)
            r3.setText(r5)
        L_0x005a:
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f16469H
            if (r3 == 0) goto L_0x02d0
            android.view.View r3 = r3.getLoadMoreFooter()
            if (r3 == 0) goto L_0x006b
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x006c
        L_0x006b:
            r3 = r13
        L_0x006c:
            r12 = 8
            if (r3 != 0) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r3.setVisibility(r12)
        L_0x0074:
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f16469H
            if (r3 == 0) goto L_0x02cb
            android.view.View r3 = r3.getLoadMoreFooter()
            if (r3 == 0) goto L_0x0086
            r4 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r3 = r3.findViewById(r4)
            goto L_0x0087
        L_0x0086:
            r3 = r13
        L_0x0087:
            if (r3 != 0) goto L_0x008a
            goto L_0x00ce
        L_0x008a:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r4)
            java.lang.Object[] r5 = r11.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r7 = "dismissFooter"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r4 = r3
            r13 = r11
            r11 = r17
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r13.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r6 = "dismissFooter"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x00ce:
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f16469H
            if (r3 == 0) goto L_0x02c6
            android.view.View r3 = r3.getLoadMoreFooter()
            if (r3 == 0) goto L_0x00e0
            r4 = 2131308006(0x7f092de6, float:1.8234255E38)
            android.view.View r3 = r3.findViewById(r4)
            goto L_0x00e1
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            if (r3 != 0) goto L_0x00e4
            goto L_0x0125
        L_0x00e4:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r4)
            java.lang.Object[] r5 = r13.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r7 = "dismissFooter"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r13.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r6 = "dismissFooter"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0125:
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f16469H
            if (r3 == 0) goto L_0x02c1
            android.view.View r3 = r3.getLoadMoreFooter()
            if (r3 == 0) goto L_0x0137
            r4 = 2131312601(0x7f093fd9, float:1.8243575E38)
            android.view.View r3 = r3.findViewById(r4)
            goto L_0x0138
        L_0x0137:
            r3 = 0
        L_0x0138:
            if (r3 != 0) goto L_0x013b
            goto L_0x017c
        L_0x013b:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r4)
            java.lang.Object[] r5 = r13.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r7 = "dismissFooter"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r13.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r6 = "dismissFooter"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x017c:
            boolean r3 = r21.mo3883S7()
            if (r3 != 0) goto L_0x0190
            com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r3 = r0.f16479R
            if (r3 == 0) goto L_0x018b
            r3 = 10
            r6 = 10
            goto L_0x0192
        L_0x018b:
            r3 = 14
            r6 = 14
            goto L_0x0192
        L_0x0190:
            r3 = 2
            r6 = 2
        L_0x0192:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startSearch query:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " requestScene:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            je1.i4 r13 = new je1.i4
            int r3 = r0.f16507r
            java.lang.String r4 = r0.f16517z
            pe3.b r5 = r0.f16510u
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r0)
            java.lang.Class<rs1.s8> r7 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r7)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r7 = r1.mo12861q3()
            r9 = 0
            pe3.b r10 = r0.f16481S
            r11 = 0
            r17 = 0
            r18 = 1664(0x680, float:2.332E-42)
            r19 = 0
            r1 = r13
            r2 = r22
            r8 = r23
            r12 = r17
            r15 = r13
            r13 = r18
            r20 = r14
            r14 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f16482S0 = r15
            int r1 = r0.f16464C
            r15.f29121r = r1
            if (r24 == 0) goto L_0x0200
            r1 = 3
            r0.f16464C = r1
            com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable r1 = r0.f16479R
            if (r1 == 0) goto L_0x0200
            java.lang.Runnable r1 = r0.f16480R0
            if (r1 == 0) goto L_0x01fc
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$q r1 = (com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.C3569q) r1
            r1.run()
        L_0x01fc:
            r1 = 0
            r0.f16480R0 = r1
            goto L_0x0201
        L_0x0200:
            r1 = 0
        L_0x0201:
            ob0.b0 r2 = f40.C86709a0.m107524d()
            je1.i4 r3 = r0.f16482S0
            r2.mo123460f(r3)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 3820(0xeec, float:5.353E-42)
            r2.mo123455a(r3, r0)
            android.view.View r2 = r0.f16472K
            if (r2 == 0) goto L_0x02bb
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r12 = r20
            r3.mo10233c(r12)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r7 = "startSearch"
            java.lang.String r8 = "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;ZZ)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r6 = "startSearch"
            java.lang.String r7 = "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;ZZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r2
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r2 = r0.f16471J
            if (r2 == 0) goto L_0x02b5
            r3 = 8
            r2.setVisibility(r3)
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r0.f16469H
            if (r2 == 0) goto L_0x02b1
            r2.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r0.f16470I
            if (r2 == 0) goto L_0x02ab
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r12)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r7 = "startSearch"
            java.lang.String r8 = "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;ZZ)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "scrollToPosition"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.mo17115r1(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI"
            java.lang.String r6 = "startSearch"
            java.lang.String r7 = "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;ZZ)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "scrollToPosition"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x02ab:
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x02b1:
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x02b5:
            java.lang.String r2 = "noResultView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x02bb:
            java.lang.String r2 = "loadingView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x02c1:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x02c6:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x02cb:
            r1 = r13
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x02d0:
            r1 = r13
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x02d5:
            r1 = r13
            gy3.C87412m.m108603p(r16)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI.mo3893c8(java.lang.String, pe3.b, boolean, boolean):void");
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C3550g(this, baseFinderFeed, nVar);
    }

    /* renamed from: e8 */
    public final boolean mo3894e8(boolean z) {
        C48727ak1 ak12;
        String str;
        boolean z2 = z;
        Log.m105924i("Finder.FinderFeedSearchUI", "startSearchNextHot: " + this.f16479R + " isPreloadingNextHotWord:" + this.f16486U0);
        if (mo3883S7()) {
            Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot return for BlockHotSearch.");
            return true;
        } else if (this.f16486U0) {
            Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot return for isPreloadingNextHotWord.");
            return true;
        } else {
            SearchHotWordListParcelable searchHotWordListParcelable = this.f16479R;
            Object obj = null;
            if (searchHotWordListParcelable != null) {
                if (searchHotWordListParcelable.f16638g.isEmpty()) {
                    Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot return for searchHotWordParcelableList is null.");
                    return false;
                }
                int i = searchHotWordListParcelable.f16637f;
                if (i < 0) {
                    Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot return for invalid pos:" + searchHotWordListParcelable.f16637f + '.');
                    return false;
                }
                int i2 = i + 1;
                searchHotWordListParcelable.f16637f = i2;
                if (i2 >= searchHotWordListParcelable.f16638g.size()) {
                    Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot: return for pos:" + searchHotWordListParcelable.f16637f + " over size:" + searchHotWordListParcelable.f16638g.size() + '.');
                    searchHotWordListParcelable.f16637f = searchHotWordListParcelable.f16637f + -1;
                    return false;
                }
                SearchHotWordParcelable searchHotWordParcelable = searchHotWordListParcelable.f16638g.get(searchHotWordListParcelable.f16637f);
                searchHotWordListParcelable.f16636e = searchHotWordParcelable;
                if (searchHotWordParcelable == null || (ak12 = searchHotWordParcelable.f16639d) == null || (str = ak12.f130586d) == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("startSearchNextHot hotWord:");
                    SearchHotWordParcelable searchHotWordParcelable2 = searchHotWordListParcelable.f16636e;
                    if (searchHotWordParcelable2 != null) {
                        obj = searchHotWordParcelable2.f16639d;
                    }
                    sb.append(obj);
                    sb.append('.');
                    Log.m105928w("Finder.FinderFeedSearchUI", sb.toString());
                    obj = C13598b0.f38549a;
                } else {
                    this.f16506q = str;
                    this.f16507r = 0;
                    String uuid = UUID.randomUUID().toString();
                    C87412m.m108593f(uuid, "randomUUID().toString()");
                    this.f16517z = uuid;
                    this.f16510u = null;
                    SearchHotWordParcelable searchHotWordParcelable3 = searchHotWordListParcelable.f16636e;
                    C87412m.m108591d(searchHotWordParcelable3);
                    C48727ak1 ak13 = searchHotWordParcelable3.f16639d;
                    C87412m.m108591d(ak13);
                    C89349b bVar = ak13.f130590h;
                    C9320i4 i4Var = new C9320i4(this.f16506q, this.f16507r, this.f16517z, this.f16510u, 10, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), bVar, (C89349b) null, this.f16481S, false, 0, 1664, (C8480h) null);
                    this.f16484T0 = i4Var;
                    i4Var.f29121r = 3;
                    i4Var.f29126w = z2;
                    mo3888X7(i4Var, this.f16479R);
                    Log.m105924i("Finder.FinderFeedSearchUI", "startSearchNextHot pos:" + searchHotWordListParcelable.f16637f + " query:" + this.f16506q + " isPreload:" + z2 + " preloadNetSceneFinderSearch:" + this.f16484T0);
                    if (!z2) {
                        C60055x0 x0Var = this.f16477Q;
                        if (x0Var != null) {
                            String str2 = this.f16506q;
                            C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
                            x0Var.f171399r = str2;
                            FTSSearchView fTSSearchView = this.f16503o;
                            if (fTSSearchView != null) {
                                fTSSearchView.getFtsEditText().mo70358n(this.f16506q, (List<FTSSearchView.C6996f>) null, true);
                            } else {
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("searchSuggestionManager");
                            throw null;
                        }
                    }
                    C86709a0.m107524d().mo123460f(this.f16484T0);
                    C86709a0.m107524d().mo123455a(3820, this);
                    this.f16486U0 = true;
                    return true;
                }
            }
            if (obj == null) {
                Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextHot return for null.");
            }
            return false;
        }
    }

    /* renamed from: f5 */
    public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C3553j(this, baseFinderFeed, nVar, oVar);
    }

    /* renamed from: f8 */
    public final void mo3895f8(String str, boolean z) {
        boolean z2 = z;
        Log.m105924i("Finder.FinderFeedSearchUI", "startSearchNextPage: " + str + " isPreload:" + z2);
        if (mo3883S7()) {
            Log.m105928w("Finder.FinderFeedSearchUI", "startSearchNextPage return for BlockHotSearch.");
        } else if (!this.f16486U0) {
            C9320i4 i4Var = r1;
            String str2 = "Finder.FinderFeedSearchUI";
            String str3 = " isPreload:";
            String str4 = "startSearchNextPage: ";
            boolean z3 = z2;
            C9320i4 i4Var2 = new C9320i4(str, this.f16507r, this.f16517z, this.f16510u, 0, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), (C89349b) null, (C89349b) null, this.f16481S, false, 0, 1744, (C8480h) null);
            C9320i4 i4Var3 = i4Var;
            this.f16482S0 = i4Var3;
            i4Var3.f29126w = z3;
            if (this.f16465D) {
                mo3888X7(i4Var3, this.f16479R);
            }
            Log.m105924i(str2, str4 + str + str3 + z3 + " netSceneFinderSearch:" + this.f16482S0);
            C86709a0.m107524d().mo123460f(this.f16482S0);
            C86709a0.m107524d().mo123455a(3820, this);
            mo3889Y7();
        }
    }

    public MMActivity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.abg;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13466ta.class, C13194da.class, C63648v.class, C63547e.class, C63513a1.class, C13539y3.class, C63545b1.class, C48085q4.class, C13554z.class, C13140c8.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    /* renamed from: n6 */
    public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
        C87412m.m108594g(finderItem, "feed");
        C55031t.f154490a.mo76085a(this, finderItem, z, 2, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C56597e1 r5 = mo2579r5();
        boolean z = true;
        if (r5 == null || !r5.mo79924b()) {
            z = false;
        }
        if (z) {
            r5.mo79923a();
            return;
        }
        FinderLikeDrawer finderLikeDrawer = this.f16475N;
        if (finderLikeDrawer == null) {
            C87412m.m108603p("friendLikeDrawer");
            throw null;
        } else if (finderLikeDrawer.mo82541i()) {
            FinderLikeDrawer finderLikeDrawer2 = this.f16475N;
            if (finderLikeDrawer2 != null) {
                finderLikeDrawer2.mo4615l();
            } else {
                C87412m.m108603p("friendLikeDrawer");
                throw null;
            }
        } else {
            finish();
        }
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f16503o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        C58553c a;
        C11345b bVar = C11345b.FinderFeedSearchUI;
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f16503o = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16503o;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16503o;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16503o;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16503o;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        FTSSearchView fTSSearchView6 = this.f16503o;
                        if (fTSSearchView6 != null) {
                            View findViewById = fTSSearchView6.findViewById(C0966R.C0970id.apy);
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            FTSSearchView fTSSearchView7 = this.f16503o;
                            if (fTSSearchView7 != null) {
                                fTSSearchView7.getSearchContainer().setBackground((Drawable) null);
                                FTSSearchView fTSSearchView8 = this.f16503o;
                                if (fTSSearchView8 != null) {
                                    ViewGroup.LayoutParams layoutParams = fTSSearchView8.getSearchContainer().getLayoutParams();
                                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                                    FTSSearchView fTSSearchView9 = this.f16503o;
                                    if (fTSSearchView9 != null) {
                                        fTSSearchView9.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.f5375dg);
                                        FTSSearchView fTSSearchView10 = this.f16503o;
                                        if (fTSSearchView10 != null) {
                                            frameLayout.addView(fTSSearchView10);
                                            FTSSearchView fTSSearchView11 = this.f16503o;
                                            if (fTSSearchView11 != null) {
                                                int color = fTSSearchView11.getContext().getResources().getColor(C0966R.color.f3584yh);
                                                FTSSearchView fTSSearchView12 = this.f16503o;
                                                if (fTSSearchView12 != null) {
                                                    fTSSearchView12.getFtsEditText().getEditText().setTextColor(color);
                                                    FTSSearchView fTSSearchView13 = this.f16503o;
                                                    if (fTSSearchView13 != null) {
                                                        fTSSearchView13.getSearchIcon().setIconColor(color);
                                                        FTSSearchView fTSSearchView14 = this.f16503o;
                                                        if (fTSSearchView14 != null) {
                                                            fTSSearchView14.getFtsEditText().getClearBtn().getDrawable().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                                                            C8703w0.f27930d.clear();
                                                            C50972qk0 qk02 = C8703w0.f27929c;
                                                            String str = "";
                                                            if (qk02 != null) {
                                                                C8703w0.f27929c = null;
                                                                String str2 = qk02.f140366j;
                                                                if (str2 == null) {
                                                                    str2 = str;
                                                                }
                                                                this.f16517z = str2;
                                                                String str3 = qk02.f140360d;
                                                                if (str3 != null) {
                                                                    str = str3;
                                                                }
                                                                this.f16506q = str;
                                                                this.f16507r = qk02.f140361e;
                                                                this.f16508s = qk02.f140362f;
                                                                this.f16510u = qk02.f140364h;
                                                                this.f16515y = qk02.f140365i;
                                                                LinkedList<FinderObject> linkedList = qk02.f140363g;
                                                                C87412m.m108593f(linkedList, "finderFeedObj.objectList");
                                                                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                                                                for (FinderObject finderObject : linkedList) {
                                                                    C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                                                                    mo3880P7(finderObject);
                                                                    arrayList.add(C13598b0.f38549a);
                                                                }
                                                            } else {
                                                                String uuid = UUID.randomUUID().toString();
                                                                C87412m.m108593f(uuid, "randomUUID().toString()");
                                                                this.f16517z = uuid;
                                                                this.f16506q = str;
                                                                FTSSearchView fTSSearchView15 = this.f16503o;
                                                                if (fTSSearchView15 != null) {
                                                                    fTSSearchView15.getFtsEditText().mo70355k();
                                                                    FTSSearchView fTSSearchView16 = this.f16503o;
                                                                    if (fTSSearchView16 != null) {
                                                                        fTSSearchView16.getFtsEditText().mo70361q();
                                                                    } else {
                                                                        C87412m.m108603p("searchView");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("searchView");
                                                                    throw null;
                                                                }
                                                            }
                                                            this.f16463B.mo17336e(1, 10);
                                                            this.f16463B.mo17336e(2, 10);
                                                            C46091u0 u0Var = r0;
                                                            C46091u0 u0Var2 = new C46091u0(this, true, true, new C8689s(this), (C46086b1) null);
                                                            this.f16476P = u0Var;
                                                            C13502w6.C13503a aVar2 = C13502w6.f38267r;
                                                            C13502w6.f38269t.clear();
                                                            C13502w6.f38270u.clear();
                                                            C13502w6.f38271v.clear();
                                                            FTSSearchView fTSSearchView17 = this.f16503o;
                                                            if (fTSSearchView17 != null) {
                                                                FTSEditTextView ftsEditText = fTSSearchView17.getFtsEditText();
                                                                C87412m.m108593f(ftsEditText, "searchView.ftsEditText");
                                                                C60055x0 x0Var = r0;
                                                                C60055x0 x0Var2 = new C60055x0(this, ftsEditText, 0, 3, false, false, new C8699u(this));
                                                                this.f16477Q = x0Var;
                                                                x0Var.f171401t = new C8701v(this);
                                                                Class cls2 = C13442s8.class;
                                                                FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                                                                AppCompatActivity context = getContext();
                                                                C87412m.m108593f(context, "context");
                                                                Window window = getWindow();
                                                                C87412m.m108593f(window, "getActivity().window");
                                                                this.f16475N = companion.mo4621a(context, window, 1);
                                                                View findViewById2 = getContext().findViewById(C0966R.C0970id.ivb);
                                                                C87412m.m108593f(findViewById2, "context.findViewById(R.id.rl_layout)");
                                                                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById2;
                                                                this.f16469H = refreshLoadMoreLayout;
                                                                this.f16470I = refreshLoadMoreLayout.getRecyclerView();
                                                                View findViewById3 = getContext().findViewById(C0966R.C0970id.hgr);
                                                                C87412m.m108593f(findViewById3, "context.findViewById(R.id.no_result_tv)");
                                                                this.f16471J = (TextView) findViewById3;
                                                                View findViewById4 = getContext().findViewById(C0966R.C0970id.g3e);
                                                                C87412m.m108593f(findViewById4, "context.findViewById(R.id.loading_layout)");
                                                                this.f16472K = findViewById4;
                                                                this.f16496Z0 = (TextView) getContext().findViewById(C0966R.C0970id.j5s);
                                                                FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
                                                                finderLinearLayoutManager.f162360w = 25.0f;
                                                                finderLinearLayoutManager.f162361x = 100;
                                                                DataBuffer<C0740i2> dataBuffer = this.f16513x;
                                                                ArrayList arrayList2 = new ArrayList();
                                                                Iterator<E> it = dataBuffer.iterator();
                                                                while (it.hasNext()) {
                                                                    C0740i2 i2Var = (C0740i2) it.next();
                                                                    FinderItem o = i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o() : null;
                                                                    if (o != null) {
                                                                        arrayList2.add(o);
                                                                    }
                                                                }
                                                                C39818r rVar = C39818r.f106831a;
                                                                C39622i0 a2 = rVar.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                                                                C87412m.m108593f(a2, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                                                                C62273n.m73200l3((C62273n) a2, arrayList2, 6, (C49712hj1) null, 0, 12, (Object) null);
                                                                RecyclerView recyclerView = this.f16470I;
                                                                if (recyclerView != null) {
                                                                    recyclerView.setLayoutManager(finderLinearLayoutManager);
                                                                    WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderFeedSearchUI$buildItemCoverts$1(this), this.f16513x, false);
                                                                    RecyclerView recyclerView2 = this.f16470I;
                                                                    if (recyclerView2 != null) {
                                                                        recyclerView2.setAdapter(wxRecyclerAdapter);
                                                                        RecyclerView recyclerView3 = this.f16470I;
                                                                        if (recyclerView3 != null) {
                                                                            recyclerView3.mo17043c(this.f16490W0);
                                                                            RecyclerView recyclerView4 = this.f16470I;
                                                                            if (recyclerView4 != null) {
                                                                                FinderRecyclerView finderRecyclerView = recyclerView4 instanceof FinderRecyclerView ? (FinderRecyclerView) recyclerView4 : null;
                                                                                if (finderRecyclerView != null) {
                                                                                    FinderRecyclerView.m63293z1(finderRecyclerView, finderLinearLayoutManager, (String) null, 2, (Object) null);
                                                                                }
                                                                                RecyclerView recyclerView5 = this.f16470I;
                                                                                if (recyclerView5 != null) {
                                                                                    recyclerView5.setHasFixedSize(true);
                                                                                    RecyclerView recyclerView6 = this.f16470I;
                                                                                    if (recyclerView6 != null) {
                                                                                        recyclerView6.setItemViewCacheSize(5);
                                                                                        TextView textView = this.f16471J;
                                                                                        if (textView != null) {
                                                                                            textView.setTextColor(getResources().getColor(C0966R.color.f3572y4));
                                                                                            getContext().findViewById(C0966R.C0970id.kzk).setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
                                                                                            View findViewById5 = getContext().findViewById(C0966R.C0970id.egf);
                                                                                            C9556a aVar3 = new C9556a();
                                                                                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                                                                            aVar3.mo10233c(0);
                                                                                            View view2 = findViewById5;
                                                                                            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                                                            findViewById5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                                                                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                                                            getContext().findViewById(C0966R.C0970id.f357485a33).setOnClickListener(new C8673m(this));
                                                                                            int f = C75044y4.m89994f(getContext()) + C75044y4.m89989a(getContext()) + ((int) getContext().getResources().getDimension(C0966R.dimen.f3736cp));
                                                                                            ViewGroup.LayoutParams layoutParams2 = getContext().findViewById(C0966R.C0970id.ewk).getLayoutParams();
                                                                                            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                            ((FrameLayout.LayoutParams) layoutParams2).topMargin = f;
                                                                                            ViewGroup.LayoutParams layoutParams3 = getContext().findViewById(C0966R.C0970id.k_t).getLayoutParams();
                                                                                            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                            ((FrameLayout.LayoutParams) layoutParams3).topMargin = f;
                                                                                            getContext().findViewById(C0966R.C0970id.ewk).setTag(Boolean.TRUE);
                                                                                            View decorView = getWindow().getDecorView();
                                                                                            C87412m.m108593f(decorView, "window.decorView");
                                                                                            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
                                                                                            getWindow().setStatusBarColor(0);
                                                                                            getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
                                                                                            C74779i.m89536a(this, false);
                                                                                            ActionBar supportActionBar = getSupportActionBar();
                                                                                            if (supportActionBar != null) {
                                                                                                supportActionBar.mo91112w(new ColorDrawable(0));
                                                                                                supportActionBar.mo91104o();
                                                                                            }
                                                                                            ((ViewGroup) findViewById(C0966R.C0970id.egf)).setPadding(0, C75044y4.m89994f(this), 0, 0);
                                                                                            C58784w3.f168295a.mo83945l(getWindow(), false);
                                                                                            setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
                                                                                            C56437x0 x0Var3 = new C56437x0();
                                                                                            RecyclerView recyclerView7 = this.f16470I;
                                                                                            if (recyclerView7 != null) {
                                                                                                x0Var3.mo75025b(recyclerView7);
                                                                                                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16469H;
                                                                                                if (refreshLoadMoreLayout2 != null) {
                                                                                                    View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bvc, (ViewGroup) null);
                                                                                                    C87412m.m108593f(inflate, "getInflater(context).inf…d_load_more_footer, null)");
                                                                                                    refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
                                                                                                    RecyclerView recyclerView8 = this.f16470I;
                                                                                                    if (recyclerView8 != null) {
                                                                                                        recyclerView8.setOnTouchListener(new C8675n(this));
                                                                                                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16469H;
                                                                                                        if (refreshLoadMoreLayout3 != null) {
                                                                                                            refreshLoadMoreLayout3.setEnablePullDownHeader(false);
                                                                                                            RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f16469H;
                                                                                                            if (refreshLoadMoreLayout4 != null) {
                                                                                                                refreshLoadMoreLayout4.setActionCallback(new C8677o(this));
                                                                                                                String str4 = this.f16506q;
                                                                                                                if (str4 != null) {
                                                                                                                    C60055x0 x0Var4 = this.f16477Q;
                                                                                                                    if (x0Var4 != null) {
                                                                                                                        x0Var4.f171399r = str4;
                                                                                                                        FTSSearchView fTSSearchView18 = this.f16503o;
                                                                                                                        if (fTSSearchView18 != null) {
                                                                                                                            fTSSearchView18.getFtsEditText().mo70358n(str4, (List<FTSSearchView.C6996f>) null, true);
                                                                                                                        } else {
                                                                                                                            C87412m.m108603p("searchView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        C87412m.m108603p("searchSuggestionManager");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                RecyclerView recyclerView9 = this.f16470I;
                                                                                                                if (recyclerView9 != null) {
                                                                                                                    int i = this.f16515y;
                                                                                                                    C9556a aVar4 = new C9556a();
                                                                                                                    aVar4.mo10233c(Integer.valueOf(i));
                                                                                                                    RecyclerView recyclerView10 = recyclerView9;
                                                                                                                    C117292a.m165358d(recyclerView10, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                                                                    recyclerView9.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                                                                                                                    C117292a.m165359e(recyclerView10, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
                                                                                                                    C39622i0 a3 = rVar.mo62444c(this).mo75002a(cls2);
                                                                                                                    C87412m.m108593f(a3, "UICProvider.of(this@Find…rReporterUIC::class.java)");
                                                                                                                    C13442s8.C13443a aVar5 = C13442s8.f38060Q0;
                                                                                                                    C58556f j3 = ((C13442s8) a3).mo12854j3(-1);
                                                                                                                    if (j3 != null) {
                                                                                                                        RecyclerView recyclerView11 = this.f16470I;
                                                                                                                        if (recyclerView11 != null) {
                                                                                                                            j3.mo83455c(recyclerView11);
                                                                                                                        } else {
                                                                                                                            C87412m.m108603p("recyclerView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    C39622i0 a4 = rVar.mo62444c(this).mo75002a(cls2);
                                                                                                                    C87412m.m108593f(a4, "UICProvider.of(this@Find…rReporterUIC::class.java)");
                                                                                                                    C58553c a5 = C60172g4.C60173a.m70189a((C60172g4) a4, 0, 1, (Object) null);
                                                                                                                    if (a5 != null) {
                                                                                                                        a5.mo83450a(new C3544a());
                                                                                                                    }
                                                                                                                    this.f16488V0.alive();
                                                                                                                    ((C55776r) ((C36570n) this.f16514x0).getValue()).mo77389H1(2, 6, new C8679p(this));
                                                                                                                    C39622i0 a6 = rVar.mo62444c(this).mo75002a(cls2);
                                                                                                                    C87412m.m108593f(a6, "UICProvider.of(this@Find…rReporterUIC::class.java)");
                                                                                                                    C58553c a7 = C60172g4.C60173a.m70189a((C60172g4) a6, 0, 1, (Object) null);
                                                                                                                    if (a7 != null) {
                                                                                                                        a7.mo83450a((C55776r) ((C36570n) this.f16514x0).getValue());
                                                                                                                    }
                                                                                                                    C8819z2 z2Var = (C8819z2) ((C36570n) this.f16516y0).getValue();
                                                                                                                    C8681q qVar = new C8681q(this);
                                                                                                                    RecyclerView recyclerView12 = this.f16470I;
                                                                                                                    if (recyclerView12 != null) {
                                                                                                                        z2Var.mo9646T0(qVar, recyclerView12);
                                                                                                                        C13442s8.C13443a aVar6 = C13442s8.f38060Q0;
                                                                                                                        AppCompatActivity context2 = getContext();
                                                                                                                        C87412m.m108593f(context2, "context");
                                                                                                                        C13442s8 f2 = aVar6.mo12873f(context2);
                                                                                                                        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
                                                                                                                            a.mo83450a(((C8819z2) ((C36570n) this.f16516y0).getValue()).mo9650n());
                                                                                                                        }
                                                                                                                        FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = (FinderFeedMegaVideoBtnAnimUIC) rVar.mo62444c(this).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class);
                                                                                                                        RecyclerView recyclerView13 = this.f16470I;
                                                                                                                        if (recyclerView13 != null) {
                                                                                                                            finderFeedMegaVideoBtnAnimUIC.mo80031d3(recyclerView13);
                                                                                                                            FinderFeedSearchUI$initContentView$7 finderFeedSearchUI$initContentView$7 = new FinderFeedSearchUI$initContentView$7(this, wxRecyclerAdapter, C40008f.f107254d);
                                                                                                                            this.f16478Q0 = finderFeedSearchUI$initContentView$7;
                                                                                                                            finderFeedSearchUI$initContentView$7.alive();
                                                                                                                            FinderVideoCore.m65069F1(this.f16473L, this, new C8702w(this), false, 4, (Object) null);
                                                                                                                            String stringExtra = getIntent().getStringExtra("key_search_query");
                                                                                                                            if (!Util.isNullOrNil(stringExtra)) {
                                                                                                                                C60055x0 x0Var5 = this.f16477Q;
                                                                                                                                if (x0Var5 != null) {
                                                                                                                                    C87412m.m108591d(stringExtra);
                                                                                                                                    x0Var5.f171399r = stringExtra;
                                                                                                                                    FTSSearchView fTSSearchView19 = this.f16503o;
                                                                                                                                    if (fTSSearchView19 != null) {
                                                                                                                                        fTSSearchView19.getFtsEditText().mo70358n(stringExtra, (List<FTSSearchView.C6996f>) null, true);
                                                                                                                                        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_search_session_buffer");
                                                                                                                                        if (byteArrayExtra != null) {
                                                                                                                                            this.f16483T = new C89349b(byteArrayExtra, 0, byteArrayExtra.length);
                                                                                                                                        }
                                                                                                                                        this.f16479R = (SearchHotWordListParcelable) getIntent().getParcelableExtra("key_search_hot_word_info");
                                                                                                                                        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_search_hot_word_buffer");
                                                                                                                                        if (byteArrayExtra2 != null) {
                                                                                                                                            this.f16481S = new C89349b(byteArrayExtra2, 0, byteArrayExtra2.length);
                                                                                                                                        }
                                                                                                                                        Log.m105924i("Finder.FinderFeedSearchUI", "searchHotWordList: " + this.f16479R);
                                                                                                                                        this.f16465D = true;
                                                                                                                                        this.f16466E = 6;
                                                                                                                                        if (getIntent().getBooleanExtra("key_search_is_from_feed_list", false)) {
                                                                                                                                            this.f16466E = 5;
                                                                                                                                            JSONObject jSONObject = new JSONObject();
                                                                                                                                            jSONObject.put("feedid", C61926c.m72691p(getIntent().getLongExtra("key_search_feed_id", 0)));
                                                                                                                                            jSONObject.put("requestid", this.f16517z);
                                                                                                                                            jSONObject.put("query_word", stringExtra);
                                                                                                                                            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                                                                                                                                            String jSONObject2 = jSONObject.toString();
                                                                                                                                            C87412m.m108593f(jSONObject2, "kvJson.toString()");
                                                                                                                                            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                                                                                                                                            AppCompatActivity context3 = getContext();
                                                                                                                                            C87412m.m108593f(context3, "context");
                                                                                                                                            C13442s8 f3 = aVar6.mo12873f(context3);
                                                                                                                                            y0Var.Cx0(1, "hotsearch_timelinespot", n, f3 != null ? f3.mo12861q3() : null);
                                                                                                                                        }
                                                                                                                                        if (getIntent().getBooleanExtra("key_search_is_from_wx_global_search", false)) {
                                                                                                                                            this.f16465D = false;
                                                                                                                                            this.f16466E = 0;
                                                                                                                                            mo3891a8();
                                                                                                                                        }
                                                                                                                                        C58391n.f167292a.mo83230f(hashCode());
                                                                                                                                        mo3893c8(stringExtra, this.f16483T, this.f16465D, true);
                                                                                                                                        if (!this.f16465D) {
                                                                                                                                            C46091u0 u0Var3 = this.f16476P;
                                                                                                                                            if (u0Var3 != null) {
                                                                                                                                                u0Var3.mo71529c(stringExtra);
                                                                                                                                            } else {
                                                                                                                                                C87412m.m108603p("historyLogic");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (this.f16479R == null) {
                                                                                                                                            C48727ak1 ak12 = new C48727ak1();
                                                                                                                                            ak12.f130586d = stringExtra;
                                                                                                                                            ak12.f130590h = this.f16483T;
                                                                                                                                            ak12.f130587e = 1;
                                                                                                                                            mo3882R7(ak12, false);
                                                                                                                                        }
                                                                                                                                        if (!mo3883S7()) {
                                                                                                                                            if (this.f16487V == null) {
                                                                                                                                                View inflate2 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.azw, (ViewGroup) null);
                                                                                                                                                this.f16491X = inflate2.findViewById(C0966R.C0970id.exe);
                                                                                                                                                this.f16489W = (TextView) inflate2.findViewById(C0966R.C0970id.exg);
                                                                                                                                                this.f16493Y = inflate2.findViewById(C0966R.C0970id.exf);
                                                                                                                                                Context context4 = inflate2.getContext();
                                                                                                                                                C87412m.m108593f(context4, "context");
                                                                                                                                                this.f16505p0 = new C8657d0(context4);
                                                                                                                                                TextView textView2 = this.f16489W;
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                                                                                                                                                }
                                                                                                                                                View view3 = this.f16493Y;
                                                                                                                                                if (view3 != null) {
                                                                                                                                                    view3.setOnClickListener(new C8697t(this, inflate2));
                                                                                                                                                }
                                                                                                                                                this.f16487V = inflate2;
                                                                                                                                            }
                                                                                                                                            View view4 = this.f16487V;
                                                                                                                                            if (view4 != null) {
                                                                                                                                                ((FrameLayout) findViewById(C0966R.C0970id.f5375dg)).removeAllViews();
                                                                                                                                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                                                                                                                                                layoutParams4.setMarginEnd((int) getResources().getDimension(C0966R.dimen.f3753d4));
                                                                                                                                                ((FrameLayout) findViewById(C0966R.C0970id.f5375dg)).addView(view4, layoutParams4);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        mo3886V7(stringExtra);
                                                                                                                                    } else {
                                                                                                                                        C87412m.m108603p("searchView");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    C87412m.m108603p("searchSuggestionManager");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (MediaPreloadCore.f160304p) {
                                                                                                                                AppCompatActivity context5 = getContext();
                                                                                                                                C87412m.m108593f(context5, "context");
                                                                                                                                C63547e eVar = (C63547e) rVar.mo62444c(context5).mo75002a(C63547e.class);
                                                                                                                                DataBuffer<C0740i2> dataBuffer2 = this.f16513x;
                                                                                                                                FinderVideoCore finderVideoCore = this.f16473L;
                                                                                                                                C13442s8 f4 = aVar6.mo12873f(this);
                                                                                                                                eVar.mo88403c3(dataBuffer2, 0, finderVideoCore, f4 != null ? C60172g4.C60173a.m70189a(f4, 0, 1, (Object) null) : null, -1);
                                                                                                                            }
                                                                                                                            this.f16485U = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
                                                                                                                            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar).mo86179qs(this, C76986a.Finder);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        C87412m.m108603p("recyclerView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    C87412m.m108603p("recyclerView");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                C87412m.m108603p("recyclerView");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            C87412m.m108603p("rlLayout");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        C87412m.m108603p("rlLayout");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    C87412m.m108603p("recyclerView");
                                                                                                    throw null;
                                                                                                }
                                                                                                C87412m.m108603p("rlLayout");
                                                                                                throw null;
                                                                                            }
                                                                                            C87412m.m108603p("recyclerView");
                                                                                            throw null;
                                                                                        }
                                                                                        C87412m.m108603p("noResultView");
                                                                                        throw null;
                                                                                    }
                                                                                    C87412m.m108603p("recyclerView");
                                                                                    throw null;
                                                                                }
                                                                                C87412m.m108603p("recyclerView");
                                                                                throw null;
                                                                            }
                                                                            C87412m.m108603p("recyclerView");
                                                                            throw null;
                                                                        }
                                                                        C87412m.m108603p("recyclerView");
                                                                        throw null;
                                                                    }
                                                                    C87412m.m108603p("recyclerView");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("recyclerView");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("searchView");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("searchView");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("searchView");
                                                    throw null;
                                                }
                                                C87412m.m108603p("searchView");
                                                throw null;
                                            }
                                            C87412m.m108603p("searchView");
                                            throw null;
                                        }
                                        C87412m.m108603p("searchView");
                                        throw null;
                                    }
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                    C87412m.m108603p("searchView");
                    throw null;
                }
                C87412m.m108603p("searchView");
                throw null;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onDestroy() {
        C58553c a;
        C8703w0.f27930d.clear();
        C46091u0 u0Var = this.f16476P;
        if (u0Var != null) {
            u0Var.mo71527a();
            C65838f.f189333a.mo89882c();
            this.f16488V0.dead();
            C86709a0.m107524d().mo123470p(3820, this);
            hideVKB();
            ((C55776r) ((C36570n) this.f16514x0).getValue()).onDetach();
            C39622i0 a2 = C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class);
            C87412m.m108593f(a2, "UICProvider.of(this@Find…rReporterUIC::class.java)");
            C58553c a3 = C60172g4.C60173a.m70189a((C60172g4) a2, 0, 1, (Object) null);
            if (a3 != null) {
                a3.mo83453d((C55776r) ((C36570n) this.f16514x0).getValue());
            }
            ((C8819z2) ((C36570n) this.f16516y0).getValue()).onDetach();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            if (!(f == null || (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
                a.mo83453d(((C8819z2) ((C36570n) this.f16516y0).getValue()).mo9650n());
            }
            IListener<FeedUpdateEvent> iListener = this.f16478Q0;
            if (iListener != null) {
                iListener.dead();
            }
            RecyclerView recyclerView = this.f16470I;
            if (recyclerView != null) {
                recyclerView.mo17098m1(this.f16490W0);
                super.onDestroy();
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        C60055x0 x0Var = this.f16477Q;
        if (x0Var != null) {
            C86709a0.m107524d().mo123470p(6200, x0Var);
            C15133e0 e0Var = this.f16485U;
            if (e0Var != null) {
                e0Var.dead();
            } else {
                C87412m.m108603p("quickMenuHelper");
                throw null;
            }
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        if (!this.f16504p) {
            RecyclerView recyclerView = this.f16470I;
            if (recyclerView != null) {
                recyclerView.post(new C3567o(this));
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            this.f16504p = false;
        }
        C60055x0 x0Var = this.f16477Q;
        if (x0Var != null) {
            C86709a0.m107524d().mo123455a(6200, x0Var);
            RecyclerView recyclerView2 = this.f16470I;
            if (recyclerView2 != null) {
                recyclerView2.post(new C3568p(this));
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C9320i4 i4Var;
        String str2;
        String str3;
        C48727ak1 ak12;
        C48727ak1 ak13;
        C48727ak1 ak14;
        String str4;
        String str5;
        String str6;
        C117747y yVar2 = yVar;
        C86709a0.m107524d().mo123470p(3820, this);
        int size = this.f16513x.size();
        int size2 = this.f16513x.size();
        boolean z2 = yVar2 instanceof C9320i4;
        if (z2) {
            C9320i4 i4Var2 = (C9320i4) yVar2;
            z = i4Var2.f29126w;
            if (C87412m.m108589b(this.f16484T0, yVar2)) {
                this.f16486U0 = false;
            } else if (C87412m.m108589b(this.f16482S0, yVar2) && i4Var2.f29126w) {
                this.f16486U0 = false;
            }
        } else {
            z = false;
        }
        Log.m105924i("Finder.FinderFeedSearchUI", "onSceneEnd: MMFunc_FinderSearch scene:" + yVar2 + "  preloadNetSceneFinderSearch:" + this.f16484T0 + " netSceneFinderSearch:" + this.f16482S0 + ' ');
        if (i == 0 && i2 == 0) {
            C117407d.INSTANCE.idkeyStat(1265, 7, 1, false);
            C9320i4 i4Var3 = z2 ? (C9320i4) yVar2 : null;
            C49572gk1 gk12 = i4Var3 != null ? i4Var3.f29125v : null;
            C87412m.m108592e(gk12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
            LinkedList<FinderObject> linkedList = gk12.f134091g;
            C87412m.m108593f(linkedList, "response.objectList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            Iterator<T> it = linkedList.iterator();
            while (it.hasNext()) {
                FinderObject finderObject = (FinderObject) it.next();
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                mo3880P7(finderObject);
                long j = finderObject.f164794id;
                C9320i4 i4Var4 = z2 ? (C9320i4) yVar2 : null;
                String str7 = (i4Var4 == null || (str6 = i4Var4.f29113g) == null) ? "" : str6;
                C9320i4 i4Var5 = z2 ? (C9320i4) yVar2 : null;
                String str8 = (i4Var5 == null || (str5 = i4Var5.f29115i) == null) ? "" : str5;
                C48727ak1 ak15 = gk12.f134100s;
                boolean z3 = z;
                this.f16474M.put(Long.valueOf(j), new C3545b(j, str7, str8, C61926c.m72691p(ak15 != null ? ak15.f130593n : 0)));
                arrayList.add(C13598b0.f38549a);
                it = it;
                z = z3;
            }
            boolean z4 = z;
            Log.m105928w("Finder.FinderFeedSearchUI", "onSceneEnd: MMFunc_FinderSearch scene:" + yVar2 + " size:" + gk12.f134091g.size());
            if (gk12.f134091g.size() == 0) {
                Log.m105928w("Finder.FinderFeedSearchUI", "response objectList empty");
            } else {
                if (!mo3883S7()) {
                    C48727ak1 ak16 = gk12.f134100s;
                    if (Util.isNullOrNil(ak16 != null ? ak16.f130586d : null) && (ak14 = gk12.f134100s) != null) {
                        C9320i4 i4Var6 = z2 ? (C9320i4) yVar2 : null;
                        if (i4Var6 == null || (str4 = i4Var6.f29113g) == null) {
                            str4 = "";
                        }
                        ak14.f130586d = str4;
                    }
                }
                mo3885U7(gk12.f134100s);
                LinkedList<FinderObject> linkedList2 = gk12.f134091g;
                C87412m.m108593f(linkedList2, "response.objectList");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
                for (FinderObject finderObject2 : linkedList2) {
                    FinderItem.C56324a aVar = FinderItem.Companion;
                    C87412m.m108593f(finderObject2, LocaleUtil.ITALIAN);
                    arrayList2.add(aVar.mo79056a(finderObject2, 16));
                }
                C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                C62273n.m73200l3((C62273n) a, arrayList2, 6, (C49712hj1) null, 0, 12, (Object) null);
            }
            if (gk12.f134090f == 0) {
                C9320i4 i4Var7 = z2 ? (C9320i4) yVar2 : null;
                if (!(i4Var7 == null || (ak13 = i4Var7.f29124u) == null)) {
                    LinkedList<FinderObject> linkedList3 = gk12.f134091g;
                    C87412m.m108593f(linkedList3, "response.objectList");
                    if (!linkedList3.isEmpty()) {
                        FinderItem finderItem = new FinderItem();
                        String str9 = ak13.f130586d;
                        if (str9 == null) {
                            str9 = getResources().getString(C0966R.string.ena);
                            C87412m.m108593f(str9, "resources.getString(R.st…_search_hot_tips_default)");
                        }
                        mo3881Q7(new C0736h0(finderItem, str9));
                    } else {
                        String str10 = ak13.f130586d;
                        if (str10 == null) {
                            str10 = "";
                        }
                        mo3887W7(str10);
                    }
                }
            }
            this.f16507r = gk12.f134089e;
            this.f16508s = gk12.f134090f;
            this.f16510u = gk12.f134092h;
            int size3 = this.f16513x.size();
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd ");
            z = z4;
            sb.append(z);
            sb.append(' ');
            sb.append(gk12.f134089e);
            sb.append(' ');
            sb.append(gk12.f134090f);
            sb.append(' ');
            sb.append(this.f16513x.size());
            sb.append(' ');
            C9320i4 i4Var8 = z2 ? (C9320i4) yVar2 : null;
            sb.append((i4Var8 == null || (ak12 = i4Var8.f29124u) == null) ? null : ak12.f130586d);
            Log.m105924i("Finder.FinderFeedSearchUI", sb.toString());
            C9320i4 i4Var9 = z2 ? (C9320i4) yVar2 : null;
            if (i4Var9 == null || (str2 = i4Var9.f29113g) == null) {
                str2 = this.f16506q;
            }
            String str11 = str2;
            C9320i4 i4Var10 = z2 ? (C9320i4) yVar2 : null;
            if (i4Var10 == null || (str3 = i4Var10.f29115i) == null) {
                str3 = this.f16517z;
            }
            String str12 = str3;
            C9320i4 i4Var11 = z2 ? (C9320i4) yVar2 : null;
            int i3 = i4Var11 != null ? i4Var11.f29121r : 1;
            boolean isEmpty = gk12.f134091g.isEmpty();
            if (z2) {
                C9320i4 i4Var12 = (C9320i4) yVar2;
            }
            Class cls = C58417y0.class;
            int i4 = isEmpty ? 1 : 2;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            String str13 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar2.mo12873f(context);
            y0Var.ay0(1, str13, str12, str11, 3, i3, 2, 0, i4, f != null ? f.mo12861q3() : null);
            size2 = size3;
        } else {
            C117407d.INSTANCE.idkeyStat(1265, 8, 1, false);
        }
        if (C87412m.m108589b(this.f16484T0, yVar2)) {
            i4Var = null;
            this.f16484T0 = null;
        } else {
            i4Var = null;
        }
        if (C87412m.m108589b(this.f16482S0, yVar2)) {
            this.f16482S0 = i4Var;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16469H;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82440F(size2);
            if (size2 == 0) {
                View view = this.f16472K;
                if (view != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f16471J;
                    if (textView != null) {
                        textView.setVisibility(0);
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f16469H;
                        if (refreshLoadMoreLayout2 != null) {
                            refreshLoadMoreLayout2.setVisibility(8);
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("noResultView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            } else {
                View view3 = this.f16472K;
                if (view3 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = this.f16471J;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f16469H;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("noResultView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            }
            if (size == 0) {
                RecyclerView recyclerView = this.f16470I;
                if (recyclerView != null) {
                    RecyclerView.C16613e adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else if (size < size2) {
                RecyclerView recyclerView2 = this.f16470I;
                if (recyclerView2 != null) {
                    RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeInserted(size, size2 - size);
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            C58391n.f167292a.mo83229e(hashCode());
            if (!z && !mo3883S7()) {
                RecyclerView recyclerView3 = this.f16470I;
                if (recyclerView3 != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                    int E = ((FinderLinearLayoutManager) layoutManager).mo16959E() + 1;
                    Log.m105924i("Finder.FinderFeedSearchUI", "[smoothScrollToNextPosition] nextPosition=" + E);
                    recyclerView3.post(new C8705y(recyclerView3, E));
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            return;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    /* renamed from: p1 */
    public FinderVideoCore mo2578p1() {
        return this.f16473L;
    }

    /* renamed from: r5 */
    public C56597e1 mo2579r5() {
        return ((C63545b1) C39818r.f106831a.mo62444c(this).mo75002a(C63545b1.class)).f180225d;
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return false;
    }

    /* renamed from: u4 */
    public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C3562l(this, baseFinderFeed);
    }

    /* renamed from: v3 */
    public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
    }

    /* renamed from: w1 */
    public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C3548e(this, baseFinderFeed);
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f16503o;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            String str2 = str;
            if (Util.isNullOrNil(str2)) {
                return true;
            }
            this.f16464C = 1;
            this.f16481S = null;
            this.f16466E = 0;
            mo3891a8();
            m3651d8(this, str2, (C89349b) null, false, false, 14, (Object) null);
            C46091u0 u0Var = this.f16476P;
            if (u0Var != null) {
                u0Var.mo71529c(str2);
                C60055x0 x0Var = this.f16477Q;
                if (x0Var != null) {
                    x0Var.mo84916b();
                    C117407d.INSTANCE.idkeyStat(1265, 6, 1, false);
                    return false;
                }
                C87412m.m108603p("searchSuggestionManager");
                throw null;
            }
            C87412m.m108603p("historyLogic");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
