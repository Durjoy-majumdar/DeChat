package com.tencent.p014mm.plugin.finder.p056ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0324s;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55015f1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.autogen.events.FinderIpcResultEvent;
import com.tencent.p014mm.autogen.events.OnEnterFinderFullscreenEvent;
import com.tencent.p014mm.autogen.events.OnExitFinderFullscreenEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import dp1.C7419a1;
import ef1.C58553c;
import ef1.C58555d;
import fe1.C58961d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C8757a2;
import ht1.C8766f5;
import ht1.C8768g2;
import ht1.C8773i2;
import ht1.C8777j5;
import ht1.C8784m2;
import ht1.C8787n2;
import ht1.C8817y2;
import ht1.C8819z2;
import iq1.C60577a;
import iq1.C60592c;
import iq1.C60593d;
import iq1.C9235i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kf1.C9662c2;
import kf1.C9854m5;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import lp1.C10605a;
import lp1.C10608c;
import lp1.C10612f;
import lp1.C10617j;
import lp1.C10623n;
import lp1.C10625o;
import lp1.C10628q;
import lu3.C34379c;
import o31.C11345b;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import os1.C62168u;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p185kq.C10383h;
import p192l4.C10462b;
import p213oh.C11412b;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13133c1;
import rs1.C13140c8;
import rs1.C13181d3;
import rs1.C13194da;
import rs1.C13426s1;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13484v3;
import rs1.C13502w6;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63547e;
import rs1.C63575n3;
import rs1.C63648v;
import rs1.C63654v2;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C90363p0;
import sx3.C90364q0;
import t91.C64208c;
import te3.C50575np1;
import te3.C64888zo1;
import tf0.C13887q1;
import ts1.C14083g;
import u24.C90599h;
import vo3.C90852c;
import wp1.C66167g;
import ye1.C15974g0;
import ye1.C15976o;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedShareRelativeListLoader;", "Lkf1/c2;", "Lcom/tencent/mm/plugin/finder/ui/ShareRelPresenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI */
public final class FinderShareFeedRelUI extends FinderLoaderFeedUI<FinderFeedShareRelativeListLoader, C9662c2, ShareRelPresenter> {

    /* renamed from: e1 */
    public static C60216z4.C8821a<JSONObject> f17125e1;

    /* renamed from: A */
    public int f17126A;

    /* renamed from: B */
    public int f17127B;

    /* renamed from: C */
    public int f17128C = 2;

    /* renamed from: D */
    public int f17129D = 2;

    /* renamed from: E */
    public String f17130E = "";

    /* renamed from: F */
    public final C13601g f17131F = C36568h.m40985a(new C3740b(this));

    /* renamed from: G */
    public final C13601g f17132G = C36568h.m40985a(new C3745g(this));

    /* renamed from: H */
    public final C13601g f17133H = C36568h.m40985a(new C3741c(this));

    /* renamed from: I */
    public final C13601g f17134I = C36568h.m40985a(new C3742d(this));

    /* renamed from: J */
    public boolean f17135J = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();

    /* renamed from: K */
    public BaseFinderFeed f17136K;

    /* renamed from: L */
    public View f17137L;

    /* renamed from: M */
    public long f17138M;

    /* renamed from: N */
    public String f17139N = "";

    /* renamed from: P */
    public String f17140P = "";

    /* renamed from: Q */
    public boolean f17141Q = true;

    /* renamed from: Q0 */
    public IListener<FeedContactChangeEvent> f17142Q0;

    /* renamed from: R */
    public String f17143R = "";

    /* renamed from: R0 */
    public FinderFeedSnsAdHandler f17144R0;

    /* renamed from: S */
    public long f17145S;

    /* renamed from: S0 */
    public boolean f17146S0;

    /* renamed from: T */
    public boolean f17147T;

    /* renamed from: T0 */
    public boolean f17148T0;

    /* renamed from: U */
    public String f17149U = "";

    /* renamed from: U0 */
    public String f17150U0 = "";

    /* renamed from: V */
    public final C13601g f17151V = C36568h.m40985a(new C3758t(this));

    /* renamed from: V0 */
    public boolean f17152V0;

    /* renamed from: W */
    public boolean f17153W;

    /* renamed from: W0 */
    public final C13601g f17154W0 = C36568h.m40985a(C3754p.f17193d);

    /* renamed from: X */
    public boolean f17155X;

    /* renamed from: X0 */
    public C34379c<?> f17156X0;

    /* renamed from: Y */
    public boolean f17157Y;

    /* renamed from: Y0 */
    public final C13601g f17158Y0 = C36568h.m40985a(new C3739a(this));

    /* renamed from: Z */
    public int f17159Z;

    /* renamed from: Z0 */
    public final C13601g f17160Z0 = C36568h.m40985a(new C3755q(this));

    /* renamed from: a1 */
    public C60216z4.C8821a<JSONObject> f17161a1;

    /* renamed from: b1 */
    public boolean f17162b1;

    /* renamed from: c1 */
    public final FinderShareFeedRelUI$videoFinishListener$1 f17163c1 = new FinderShareFeedRelUI$videoFinishListener$1(this, C40008f.f107254d);

    /* renamed from: d1 */
    public C3744f f17164d1 = new C3744f(this);

    /* renamed from: p0 */
    public FeedContactChangeEvent f17165p0;

    /* renamed from: s */
    public final String f17166s = "Finder.FinderShareFeedRelUI";

    /* renamed from: t */
    public ShareRelPresenter f17167t;

    /* renamed from: u */
    public C9662c2 f17168u;

    /* renamed from: v */
    public FinderFeedShareRelativeListLoader f17169v;

    /* renamed from: w */
    public View f17170w;

    /* renamed from: x */
    public final C13601g f17171x = C36568h.m40985a(new C3752n(this));

    /* renamed from: x0 */
    public FinderContact f17172x0;

    /* renamed from: y */
    public final C13601g f17173y = C36568h.m40985a(new C3751m(this));

    /* renamed from: y0 */
    public FinderObject f17174y0;

    /* renamed from: z */
    public final C13601g f17175z = C36568h.m40985a(new C3743e(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$a */
    public static final class C3739a extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3739a(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17176d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f17176d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$b */
    public static final class C3740b extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3740b(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17177d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f17177d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$c */
    public static final class C3741c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3741c(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17178d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f17178d.getIntent().getIntExtra("key_comment_scene", 25));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$d */
    public static final class C3742d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3742d(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17179d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f17179d.getIntent().getIntExtra("key_detail_comment_scene", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$e */
    public static final class C3743e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3743e(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17180d = finderShareFeedRelUI;
        }

        public Object invoke() {
            String stringExtra = this.f17180d.getIntent().getStringExtra("displayTitle");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$f */
    public static final class C3744f extends C58555d {

        /* renamed from: g */
        public BaseFinderFeed f17181g;

        /* renamed from: h */
        public int f17182h = -1;

        /* renamed from: i */
        public final /* synthetic */ FinderShareFeedRelUI f17183i;

        public C3744f(FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17183i = finderShareFeedRelUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
            r7 = (r7 = r7.mo3513o()).getFeedObject();
         */
        /* renamed from: B1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2331B1(ef1.C7637b r7) {
            /*
                r6 = this;
                java.lang.String r0 = "ev"
                gy3.C87412m.m108594g(r7, r0)
                boolean r0 = r7 instanceof ef1.C7642k
                if (r0 == 0) goto L_0x011f
                ef1.k r7 = (ef1.C7642k) r7
                int r0 = r7.f25955f
                int r7 = r7.f25959j
                java.lang.String r1 = "loader"
                r2 = 0
                if (r0 < 0) goto L_0x0027
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r3 = r6.f17183i
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.m3926W7(r3, r0)
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r3 = r6.f17183i
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r3 = r3.f17169v
                if (r3 == 0) goto L_0x0023
                r3.f13572r = r0
                goto L_0x0027
            L_0x0023:
                gy3.C87412m.m108603p(r1)
                throw r2
            L_0x0027:
                if (r7 < 0) goto L_0x011f
                int r0 = r6.f17182h
                if (r7 == r0) goto L_0x0069
                r6.f17182h = r7
                r0 = 1
                if (r7 > r0) goto L_0x0069
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r0 = r6.f17183i
                boolean r3 = r0.f17162b1
                if (r3 == 0) goto L_0x0069
                kf1.c2 r0 = r0.f17168u
                if (r0 == 0) goto L_0x0062
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo10308D()
                boolean r0 = r0.getEnableRefresh()
                if (r0 == 0) goto L_0x0069
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r0 = r6.f17183i
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r3 = r0.f17169v
                if (r3 == 0) goto L_0x005e
                boolean r1 = r3.f13577w
                if (r1 == 0) goto L_0x0069
                com.tencent.mm.plugin.finder.ui.ShareRelPresenter r0 = r0.f17167t
                if (r0 == 0) goto L_0x0058
                r0.mo10495y1()
                goto L_0x0069
            L_0x0058:
                java.lang.String r7 = "presenter"
                gy3.C87412m.m108603p(r7)
                throw r2
            L_0x005e:
                gy3.C87412m.m108603p(r1)
                throw r2
            L_0x0062:
                java.lang.String r7 = "viewCallback"
                gy3.C87412m.m108603p(r7)
                throw r2
            L_0x0069:
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r0 = r6.f17183i
                boolean r1 = r0.f17152V0
                if (r1 == 0) goto L_0x011f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.m3926W7(r0, r7)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r6.f17181g
                boolean r0 = gy3.C87412m.m108589b(r7, r0)
                if (r0 != 0) goto L_0x011f
                r6.f17181g = r7
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r0 = r6.f17183i
                rx3.g r0 = r0.f17154W0
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier r0 = (com.tencent.p014mm.plugin.finder.p056ui.SearchFinderViewEventNotifier) r0
                r0.getClass()
                if (r7 == 0) goto L_0x009d
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                if (r7 == 0) goto L_0x009d
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
                if (r7 == 0) goto L_0x009d
                long r3 = r7.f164794id
                goto L_0x009f
            L_0x009d:
                r3 = 0
            L_0x009f:
                com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$OnSearchFinderViewInfo r7 = new com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$OnSearchFinderViewInfo
                r7.<init>()
                java.lang.String r1 = "onFinderFeedFocusChange"
                r7.f17204d = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "{\"currentTid\": \""
                r1.append(r5)
                java.lang.String r3 = o40.C61926c.m72691p(r3)
                r1.append(r3)
                java.lang.String r3 = "\"}"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r7.f17205e = r1
                boolean r1 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
                if (r1 == 0) goto L_0x00db
                java.lang.String r0 = r0.f17203a
                java.lang.String r1 = "disable tools"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$a r0 = new com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$a
                r0.<init>()
                r0.invoke(r7, r2)
                goto L_0x011f
            L_0x00db:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                r1.append(r3)
                java.lang.String r3 = ":tools"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isProcessExist(r1)
                if (r1 == 0) goto L_0x0117
                java.lang.String r0 = r0.f17203a
                java.lang.String r1 = "send tools"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.Class<com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$a> r1 = com.tencent.p014mm.plugin.finder.p056ui.SearchFinderViewEventNotifier.C3761a.class
                com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r0, r7, r1, r2)
                goto L_0x011f
            L_0x0117:
                java.lang.String r7 = r0.f17203a
                java.lang.String r0 = "tools not exits"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            L_0x011f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.C3744f.mo2331B1(ef1.b):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$g */
    public static final class C3745g extends C87413o implements C32224a<C8819z2> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3745g(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17184d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return ((C8817y2) C39818r.f106831a.mo62444c(this.f17184d).mo62447c(C8817y2.class)).mo9643v2();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$h */
    public static final class C3746h extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3746h(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(1);
            this.f17185d = finderShareFeedRelUI;
        }

        public Object invoke(Object obj) {
            return FinderShareFeedRelUI.m3926W7(this.f17185d, ((Number) obj).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$i */
    public static final class C3747i extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3747i(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(2);
            this.f17186d = finderShareFeedRelUI;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f17186d.f17169v;
            if (finderFeedShareRelativeListLoader != null) {
                return q1Var.mo13316LA(finderFeedShareRelativeListLoader, intValue, intValue2);
            }
            C87412m.m108603p("loader");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$j */
    public static final class C3748j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17187d;

        public C3748j(FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17187d = finderShareFeedRelUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17187d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$k */
    public static final class C3749k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17188d;

        public C3749k(FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17188d = finderShareFeedRelUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f17188d).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$l */
    public static final class C3750l implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderShareFeedRelUI f17189a;

        public C3750l(FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17189a = finderShareFeedRelUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f17189a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f17189a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$m */
    public static final class C3751m extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3751m(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17190d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f17190d.getIntent().getBooleanExtra("allow_infinite_top_pull", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$n */
    public static final class C3752n extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3752n(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17191d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f17191d.getIntent().getBooleanExtra("allow_pull_top", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$o */
    public static final class C3753o implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<Integer> f17192a;

        public C3753o(C8479f0<Integer> f0Var) {
            this.f17192a = f0Var;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90363p0.m113143b(new C13604l(PatchedFlutterActivity.EXTRA_PAGE_TYPE, this.f17192a.f27484d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$p */
    public static final class C3754p extends C87413o implements C32224a<SearchFinderViewEventNotifier> {

        /* renamed from: d */
        public static final C3754p f17193d = new C3754p();

        public C3754p() {
            super(0);
        }

        public Object invoke() {
            return new SearchFinderViewEventNotifier();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$q */
    public static final class C3755q extends C87413o implements C32224a<C15974g0> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3755q(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17194d = finderShareFeedRelUI;
        }

        public Object invoke() {
            View findViewById = this.f17194d.findViewById(C0966R.C0970id.iwc);
            int i = C0966R.C0970id.ehi;
            ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.ehi);
            if (imageView != null) {
                i = C0966R.C0970id.f358771h00;
                ViewStub viewStub = (ViewStub) C10462b.m10395a(findViewById, C0966R.C0970id.f358771h00);
                if (viewStub != null) {
                    i = C0966R.C0970id.i6k;
                    FinderRecyclerView finderRecyclerView = (FinderRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.i6k);
                    if (finderRecyclerView != null) {
                        i = C0966R.C0970id.is7;
                        WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.is7);
                        if (weImageView != null) {
                            i = C0966R.C0970id.is8;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(findViewById, C0966R.C0970id.is8);
                            if (constraintLayout != null) {
                                i = C0966R.C0970id.is_;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.is_);
                                if (textView != null) {
                                    i = C0966R.C0970id.f359096iu0;
                                    ViewStub viewStub2 = (ViewStub) C10462b.m10395a(findViewById, C0966R.C0970id.f359096iu0);
                                    if (viewStub2 != null) {
                                        i = C0966R.C0970id.ivb;
                                        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                                        if (refreshLoadMoreLayout != null) {
                                            TouchableLayout touchableLayout = (TouchableLayout) findViewById;
                                            i = C0966R.C0970id.jhp;
                                            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jhp);
                                            if (frameLayout != null) {
                                                i = C0966R.C0970id.f359187ji0;
                                                FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f359187ji0);
                                                if (frameLayout2 != null) {
                                                    i = C0966R.C0970id.f359188ji1;
                                                    ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.f359188ji1);
                                                    if (progressBar != null) {
                                                        i = C0966R.C0970id.jii;
                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jii);
                                                        if (coordinatorLayout != null) {
                                                            i = C0966R.C0970id.jis;
                                                            FrameLayout frameLayout3 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jis);
                                                            if (frameLayout3 != null) {
                                                                return new C15974g0(touchableLayout, imageView, viewStub, finderRecyclerView, weImageView, constraintLayout, textView, viewStub2, refreshLoadMoreLayout, touchableLayout, frameLayout, frameLayout2, progressBar, coordinatorLayout, frameLayout3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$r */
    public static final class C3756r implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17195d;

        public C3756r(FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17195d = finderShareFeedRelUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
            r3 = r3.username;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r20) {
            /*
                r19 = this;
                r0 = r19
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r1 = r0.f17195d
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.f17172x0
                boolean r2 = r1.mo4131d8(r2)
                r1.mo4125X7(r2)
                java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
                r4 = 0
                java.lang.String r6 = ""
                if (r2 == 0) goto L_0x004f
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.f17172x0
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = r2.username
                if (r2 != 0) goto L_0x001e
                goto L_0x001f
            L_0x001e:
                r6 = r2
            L_0x001f:
                cm1.m0 r7 = cm1.C0751m0.f1769a
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r2 = r2.mo62444c(r1)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                rs1.s8 r2 = (rs1.C13442s8) r2
                te3.hj1 r8 = r2.mo12861q3()
                r10 = 2
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f17174y0
                if (r1 == 0) goto L_0x0038
                long r4 = r1.f164794id
            L_0x0038:
                r11 = r4
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 240(0xf0, float:3.36E-43)
                r18 = 0
                r9 = r6
                cm1.C0751m0.m692c(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
                fe1.d$b r1 = fe1.C58961d.f168673a
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = fe1.C58969q.f168705a2
                r2 = 0
                r1.mo84161i(r6, r2)
                goto L_0x0093
            L_0x004f:
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.f17172x0
                if (r2 == 0) goto L_0x0057
                java.lang.String r2 = r2.username
                if (r2 != 0) goto L_0x0058
            L_0x0057:
                r2 = r6
            L_0x0058:
                cm1.m0 r7 = cm1.C0751m0.f1769a
                bl3.r r8 = bl3.C39818r.f106831a
                bl3.r$a r8 = r8.mo62444c(r1)
                androidx.lifecycle.i0 r3 = r8.mo75002a(r3)
                rs1.s8 r3 = (rs1.C13442s8) r3
                te3.hj1 r8 = r3.mo12861q3()
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r1.f17172x0
                if (r3 == 0) goto L_0x0075
                java.lang.String r3 = r3.username
                if (r3 != 0) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                r9 = r3
                goto L_0x0076
            L_0x0075:
                r9 = r6
            L_0x0076:
                int r3 = je1.C60811w.f173196u
                r10 = 1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f17174y0
                if (r1 == 0) goto L_0x007f
                long r4 = r1.f164794id
            L_0x007f:
                r11 = r4
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 240(0xf0, float:3.36E-43)
                r18 = 0
                cm1.C0751m0.m692c(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
                fe1.d$b r1 = fe1.C58961d.f168673a
                int r3 = fe1.C58969q.f168707c2
                r1.mo84161i(r2, r3)
            L_0x0093:
                r1 = 1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.C3756r.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$s */
    public static final class C3757s implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17196d;

        /* renamed from: e */
        public final /* synthetic */ View f17197e;

        public C3757s(FinderShareFeedRelUI finderShareFeedRelUI, View view) {
            this.f17196d = finderShareFeedRelUI;
            this.f17197e = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17196d.mo4134g8(true);
            View view2 = this.f17197e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ShareRelPresenter shareRelPresenter = this.f17196d.f17167t;
            if (shareRelPresenter != null) {
                shareRelPresenter.requestRefresh();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$t */
    public static final class C3758t extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedRelUI f17198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3758t(FinderShareFeedRelUI finderShareFeedRelUI) {
            super(0);
            this.f17198d = finderShareFeedRelUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f17198d.getIntent().getIntExtra("tab_type", 0));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3925V7(com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI r4) {
        /*
            kf1.c2 r0 = r4.f17168u
            r1 = 0
            if (r0 == 0) goto L_0x0020
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r0.getLayoutManager()
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r3 == 0) goto L_0x0014
            r1 = r2
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r1 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r1
        L_0x0014:
            if (r1 != 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            com.tencent.mm.plugin.finder.ui.x3 r2 = new com.tencent.mm.plugin.finder.ui.x3
            r2.<init>(r4, r1, r0)
            r0.post(r2)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r4 = "viewCallback"
            gy3.C87412m.m108603p(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.m3925V7(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI):void");
    }

    /* renamed from: W7 */
    public static final BaseFinderFeed m3926W7(FinderShareFeedRelUI finderShareFeedRelUI, int i) {
        if (i >= 0) {
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = finderShareFeedRelUI.f17169v;
            if (finderFeedShareRelativeListLoader == null) {
                C87412m.m108603p("loader");
                throw null;
            } else if (finderFeedShareRelativeListLoader.getSize() == 0) {
                return null;
            } else {
                FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = finderShareFeedRelUI.f17169v;
                if (finderFeedShareRelativeListLoader2 != null) {
                    C0740i2 i2Var = (C0740i2) finderFeedShareRelativeListLoader2.get(i);
                    if (!(i2Var instanceof BaseFinderFeed)) {
                        return null;
                    }
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed.mo3513o().getMediaType() == 10001) {
                        return null;
                    }
                    return baseFinderFeed;
                }
                C87412m.m108603p("loader");
                throw null;
            }
        } else {
            finderShareFeedRelUI.getClass();
            return null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return ((Number) ((C36570n) this.f17134I).getValue()).intValue() != 0 ? ((Number) ((C36570n) this.f17134I).getValue()).intValue() : mo4128a8();
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f17169v;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        C87412m.m108603p("loader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        ShareRelPresenter shareRelPresenter = this.f17167t;
        if (shareRelPresenter != null) {
            return shareRelPresenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9662c2 c2Var = this.f17168u;
        if (c2Var != null) {
            return c2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0554, code lost:
        if ((r1 == null || r1.length() == 0) != false) goto L_0x056e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0a9e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0324  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r28 = this;
            r7 = r28
            java.lang.Class<l31.e> r8 = l31.C61212e.class
            ye1.o r0 = r28.mo4126Y7()
            android.widget.FrameLayout r0 = r0.f42958b
            r9 = 8
            r0.setVisibility(r9)
            java.lang.Class<os1.u> r1 = os1.C62168u.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.Class<ts1.g> r0 = ts1.C14083g.class
            java.lang.Class<ht1.j5> r10 = ht1.C8777j5.class
            java.lang.Class<rs1.n3> r11 = rs1.C63575n3.class
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "feed_object_id"
            r5 = 0
            long r3 = r3.getLongExtra(r4, r5)
            r7.f17138M = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "feed_encrypted_object_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = ""
        L_0x0035:
            r7.f17139N = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "feed_short_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = ""
        L_0x0045:
            r7.f17140P = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "feed_object_nonceId"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x0055
            java.lang.String r3 = ""
        L_0x0055:
            r15 = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "report_scene"
            r13 = 0
            int r3 = r3.getIntExtra(r4, r13)
            r7.f17126A = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_reuqest_scene"
            r14 = -1
            int r3 = r3.getIntExtra(r4, r14)
            r7.f17127B = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "from_user"
            java.lang.String r3 = r3.getStringExtra(r4)
            r7.f17130E = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "report_uitype"
            r12 = 2
            int r3 = r3.getIntExtra(r4, r12)
            r7.f17128C = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "KEY_AUTHORIZATION_CONTENT"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = ""
        L_0x0097:
            r7.f17150U0 = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_search_h5_feed_focus_change"
            boolean r3 = r3.getBooleanExtra(r4, r13)
            r7.f17152V0 = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "KEY_VIDEO_MEDIA_ID"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x00b3
            java.lang.String r3 = ""
        L_0x00b3:
            r7.f17149U = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "is_from_ad"
            boolean r3 = r3.getBooleanExtra(r4, r13)
            r7.f17155X = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_need_related_list"
            r9 = 1
            boolean r3 = r3.getBooleanExtra(r4, r9)
            r7.f17141Q = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_session_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            r7.f17143R = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "feed_local_id"
            long r3 = r3.getLongExtra(r4, r5)
            r7.f17145S = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_posting_scene"
            boolean r3 = r3.getBooleanExtra(r4, r13)
            r7.f17147T = r3
            long r3 = r7.f17138M
            int r16 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x0125
            java.lang.String r3 = r7.f17139N
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0102
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            if (r3 == 0) goto L_0x0125
            long r3 = r7.f17145S
            int r16 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x0125
            java.lang.String r3 = r7.f17140P
            if (r3 == 0) goto L_0x0118
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r3 = 0
            goto L_0x0119
        L_0x0118:
            r3 = 1
        L_0x0119:
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = r7.f17166s
            java.lang.String r4 = "objectId 0 and encryptedObjectId null . finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
            r28.finish()
        L_0x0125:
            java.lang.String r3 = r7.f17150U0
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x012f
            r3 = 1
            goto L_0x0130
        L_0x012f:
            r3 = 0
        L_0x0130:
            if (r3 == 0) goto L_0x0174
            androidx.lifecycle.i0 r3 = r7.component(r0)
            ts1.g r3 = (ts1.C14083g) r3
            int r4 = r28.mo2194I7()
            r16 = r15
            long r14 = r7.f17138M
            r3.getClass()
            up1.f r18 = up1.C37521f.f99374d
            r18.getClass()
            pe1.c<java.lang.Integer> r18 = up1.C37521f.f99189H6
            java.lang.Object r18 = r18.mo60266n()
            java.lang.Number r18 = (java.lang.Number) r18
            int r5 = r18.intValue()
            if (r5 != r9) goto L_0x0158
            r5 = 1
            goto L_0x0159
        L_0x0158:
            r5 = 0
        L_0x0159:
            boolean r3 = r3.mo13498c3(r4, r14)
            if (r5 == 0) goto L_0x0163
            if (r3 != 0) goto L_0x0163
            r3 = 1
            goto L_0x0164
        L_0x0163:
            r3 = 0
        L_0x0164:
            if (r3 == 0) goto L_0x0176
            androidx.lifecycle.i0 r0 = r7.component(r0)
            ts1.g r0 = (ts1.C14083g) r0
            long r3 = r7.f17138M
            java.lang.String r5 = r7.f17150U0
            r0.mo13499d3(r3, r5)
            goto L_0x0176
        L_0x0174:
            r16 = r15
        L_0x0176:
            r0 = 2131313432(0x7f094318, float:1.824526E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.share_feed_detail_tips_layout)"
            gy3.C87412m.m108593f(r0, r3)
            r7.f17137L = r0
            boolean r0 = r7.f17155X
            if (r0 == 0) goto L_0x0191
            com.tencent.mm.app.f r0 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$initFollow$1 r3 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$initFollow$1
            r3.<init>(r7, r0)
            r7.f17142Q0 = r3
        L_0x0191:
            r0 = 2131313465(0x7f094339, float:1.8245328E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.share_ui_content)"
            gy3.C87412m.m108593f(r0, r3)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            er1.v2$a r0 = er1.C7888v2.f26513a
            r0.getClass()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r15 = 0
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01f6 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x01f6 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NAVIGATION_TITLE_LIST_STRING_SYNC     // Catch:{ Exception -> 0x01f6 }
            java.lang.Object r0 = r0.mo119685f(r4, r15)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01f6 }
            te3.ie1 r4 = new te3.ie1     // Catch:{ Exception -> 0x01f6 }
            r4.<init>()     // Catch:{ Exception -> 0x01f6 }
            if (r0 == 0) goto L_0x01d0
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x01f6 }
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x01f6 }
            r4.parseFrom(r0)     // Catch:{ Exception -> 0x01f6 }
        L_0x01d0:
            java.util.LinkedList<te3.he1> r5 = r4.f135252d     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r0 = "safeNavigation.navigation_titles"
            gy3.C87412m.m108593f(r5, r0)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r0 = er1.C7888v2.C7889a.f26515b     // Catch:{ Exception -> 0x01f3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f3 }
            r3.<init>()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = "getNavigationTitleList result:"
            r3.append(r6)     // Catch:{ Exception -> 0x01f3 }
            org.json.JSONObject r4 = o40.C61937h.m72709h(r4)     // Catch:{ Exception -> 0x01f3 }
            r3.append(r4)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x0212
        L_0x01f3:
            r0 = move-exception
            r3 = r5
            goto L_0x01f7
        L_0x01f6:
            r0 = move-exception
        L_0x01f7:
            er1.j4 r4 = er1.C58739j4.f168176a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getNavigationTitleList:"
            r5.append(r6)
            java.lang.String r6 = r0.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.mo83712h0(r0, r5)
            r5 = r3
        L_0x0212:
            boolean r0 = r5.isEmpty()
            r3 = 2131310019(0x7f0935c3, float:1.8238338E38)
            r4 = 2131296428(0x7f0900ac, float:1.8210772E38)
            r14 = 25
            r6 = 3
            if (r0 != 0) goto L_0x0274
            int r0 = r7.f17126A
            r15 = 11
            if (r0 == r12) goto L_0x022f
            if (r0 == r9) goto L_0x022f
            if (r0 == r6) goto L_0x022f
            if (r0 == r15) goto L_0x022f
            if (r0 != r14) goto L_0x0274
        L_0x022f:
            android.view.View r0 = r7.findViewById(r4)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4 = 8
            r0.setVisibility(r4)
            android.view.View r0 = r7.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r13)
            java.util.Iterator r3 = r5.iterator()
        L_0x0247:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0288
            java.lang.Object r4 = r3.next()
            te3.he1 r4 = (te3.C49692he1) r4
            int r5 = r7.f17126A
            if (r5 == r12) goto L_0x026a
            if (r5 == r9) goto L_0x026a
            if (r5 != r6) goto L_0x025c
            goto L_0x026a
        L_0x025c:
            if (r5 == r15) goto L_0x0260
            if (r5 != r14) goto L_0x0247
        L_0x0260:
            int r5 = r4.f134581d
            if (r5 != r12) goto L_0x0247
            java.lang.String r4 = r4.f134582e
            r0.setText(r4)
            goto L_0x0247
        L_0x026a:
            int r5 = r4.f134581d
            if (r5 != r9) goto L_0x0247
            java.lang.String r4 = r4.f134582e
            r0.setText(r4)
            goto L_0x0247
        L_0x0274:
            android.view.View r0 = r7.findViewById(r4)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setVisibility(r13)
            android.view.View r0 = r7.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = 8
            r0.setVisibility(r3)
        L_0x0288:
            long r3 = r7.f17138M
            r19 = 0
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0324
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r3)
            if (r0 == 0) goto L_0x0321
            java.lang.String r3 = r7.f17166s
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "use cache cacheTime="
            r4.append(r5)
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            long r21 = r0.getTimestamps()
            r12 = 1000(0x3e8, float:1.401E-42)
            long r14 = (long) r12
            r26 = r10
            long r9 = r21 / r14
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r5, r9)
            r4.append(r5)
            java.lang.String r5 = ", cacheTime="
            r4.append(r5)
            long r9 = r0.getTimestamps()
            r4.append(r9)
            java.lang.String r5 = " current="
            r4.append(r5)
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            long r9 = eb0.C31543z5.m39453c()
            long r9 = r9 / r14
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r5, r9)
            r4.append(r5)
            java.lang.String r5 = ", urlValidDuration="
            r4.append(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.getFeedObject()
            int r5 = r5.urlValidDuration
            r4.append(r5)
            r5 = 115(0x73, float:1.61E-43)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r3 = r0.getTimestamps()
            r9 = 0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x0316
            long r3 = eb0.C31543z5.m39453c()
            long r9 = r0.getTimestamps()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.getFeedObject()
            int r5 = r5.urlValidDuration
            long r14 = (long) r5
            r21 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r21
            long r9 = r9 + r14
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x031e
        L_0x0316:
            wp1.f$a r3 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r3.mo14348k(r0)
            r7.f17136K = r0
        L_0x031e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0342
        L_0x0321:
            r26 = r10
            goto L_0x0342
        L_0x0324:
            r26 = r10
            long r3 = r7.f17145S
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0342
            boolean r0 = r7.f17147T
            if (r0 == 0) goto L_0x0342
            wp1.f$a r0 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo14341d(r3)
            if (r3 == 0) goto L_0x0342
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r0.mo14348k(r3)
            r7.f17136K = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0342:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r7.f17136K
            r9 = 39
            if (r0 != 0) goto L_0x0426
            int r0 = r28.mo2194I7()
            if (r0 != r9) goto L_0x0426
            java.lang.String r0 = r7.f17139N
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0358
            r0 = 1
            goto L_0x0359
        L_0x0358:
            r0 = 0
        L_0x0359:
            if (r0 == 0) goto L_0x0426
            java.lang.String r0 = r7.f17166s
            java.lang.String r3 = "search feed id %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r7.f17139N
            r5[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)
            bo1.h$c r0 = bo1.C0345h.f930c
            int r3 = r28.mo2194I7()
            bo1.h r3 = r0.mo387a(r3, r13)
            if (r3 == 0) goto L_0x040a
            java.lang.String r0 = r7.f17139N
            java.lang.String r4 = "exportId"
            gy3.C87412m.m108594g(r0, r4)
            monitor-enter(r3)
            java.lang.String r4 = "FinderSearchRelBatchLoadObjectCache"
            java.lang.String r5 = "cache size %d"
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0407 }
            java.util.LinkedList<bo1.h$a> r10 = r3.f933b     // Catch:{ all -> 0x0407 }
            int r10 = r10.size()     // Catch:{ all -> 0x0407 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0407 }
            r12[r13] = r10     // Catch:{ all -> 0x0407 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r12)     // Catch:{ all -> 0x0407 }
            java.util.LinkedList<bo1.h$a> r4 = r3.f933b     // Catch:{ all -> 0x0407 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x039e
            monitor-exit(r3)
            goto L_0x03e0
        L_0x039e:
            java.util.LinkedList<bo1.h$a> r4 = r3.f933b     // Catch:{ all -> 0x0407 }
            int r5 = r4.size()     // Catch:{ all -> 0x0407 }
            java.util.ListIterator r4 = r4.listIterator(r5)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "list.listIterator(list.size)"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x0407 }
        L_0x03ad:
            boolean r5 = r4.hasPrevious()     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x03df
            java.lang.Object r5 = r4.previous()     // Catch:{ all -> 0x0407 }
            java.lang.String r10 = "iterator.previous()"
            gy3.C87412m.m108593f(r5, r10)     // Catch:{ all -> 0x0407 }
            bo1.h$a r5 = (bo1.C0345h.C0346a) r5     // Catch:{ all -> 0x0407 }
            java.util.LinkedList<bo1.h$d> r10 = r5.f934a     // Catch:{ all -> 0x0407 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0407 }
        L_0x03c4:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x0407 }
            if (r12 == 0) goto L_0x03da
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x0407 }
            r14 = r12
            bo1.h$d r14 = (bo1.C0345h.C0349d) r14     // Catch:{ all -> 0x0407 }
            java.lang.String r14 = r14.f936a     // Catch:{ all -> 0x0407 }
            boolean r14 = gy3.C87412m.m108589b(r14, r0)     // Catch:{ all -> 0x0407 }
            if (r14 == 0) goto L_0x03c4
            goto L_0x03db
        L_0x03da:
            r12 = 0
        L_0x03db:
            if (r12 == 0) goto L_0x03ad
            monitor-exit(r3)
            goto L_0x03e1
        L_0x03df:
            monitor-exit(r3)
        L_0x03e0:
            r5 = 0
        L_0x03e1:
            if (r5 == 0) goto L_0x040a
            java.util.LinkedList<bo1.h$d> r3 = r5.f934a
            java.util.Iterator r3 = r3.iterator()
        L_0x03e9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03ff
            java.lang.Object r4 = r3.next()
            r5 = r4
            bo1.h$d r5 = (bo1.C0345h.C0349d) r5
            java.lang.String r5 = r5.f936a
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x03e9
            goto L_0x0400
        L_0x03ff:
            r4 = 0
        L_0x0400:
            bo1.h$d r4 = (bo1.C0345h.C0349d) r4
            if (r4 == 0) goto L_0x040a
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f937b
            goto L_0x040b
        L_0x0407:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x040a:
            r0 = 0
        L_0x040b:
            if (r0 == 0) goto L_0x0426
            java.lang.String r3 = r7.f17166s
            java.lang.String r4 = "use search feed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            wp1.f$a r3 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            r5 = 1
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r4.mo79056a(r0, r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r3.mo14348k(r0)
            r7.f17136K = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0426:
            int r0 = r7.f17127B
            r3 = 13
            if (r0 != r3) goto L_0x043c
            rx3.g r0 = r7.f17173y
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.f17162b1 = r0
        L_0x043c:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r7.f17136K
            if (r0 != 0) goto L_0x044c
            java.lang.String r0 = r7.f17166s
            java.lang.String r3 = "cache null.show progress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r3 = 1
            r7.mo4134g8(r3)
            goto L_0x044f
        L_0x044c:
            r7.mo4134g8(r13)
        L_0x044f:
            long r3 = r7.f17138M
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x04be
            int r0 = r28.mo2194I7()
            r3 = 184(0xb8, float:2.58E-43)
            if (r0 != r3) goto L_0x04be
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r3 = r0.mo62446e(r2)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            os1.u r3 = (os1.C62168u) r3
            long r4 = r7.f17138M
            r3.mo87219c3(r4)
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "KEY_VIDEO_START_PLAY_TIME_MS"
            r14 = 0
            long r3 = r3.getLongExtra(r4, r14)
            android.content.Intent r5 = r28.getIntent()
            java.lang.String r10 = "KEY_VIDEO_PLAY_SPEED_RATIO"
            r12 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5.getFloatExtra(r10, r12)
            android.content.Intent r10 = r28.getIntent()
            java.lang.String r12 = "KEY_VIDEO_IS_PAUSE"
            boolean r10 = r10.getBooleanExtra(r12, r13)
            bl3.r$a r0 = r0.mo62446e(r2)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            os1.u r0 = (os1.C62168u) r0
            long r1 = r7.f17138M
            os1.u$b r12 = new os1.u$b
            r12.<init>(r3, r10, r5)
            r0.getClass()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x04b5
            java.lang.String r0 = "Finder.VideoStateCacheVM"
            java.lang.String r1 = "storeStartStateCache invalid feed cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x04be
        L_0x04b5:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.HashMap<java.lang.Long, os1.u$b> r0 = r0.f176749h
            r0.put(r1, r12)
        L_0x04be:
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r0 = new com.tencent.mm.plugin.finder.ui.ShareRelPresenter
            int r2 = r7.f17129D
            boolean r1 = r7.f17135J
            r3 = 1
            r4 = r1 ^ 1
            int r5 = r28.mo4136s3()
            int r1 = r7.f17126A
            r10 = 22
            if (r1 != r10) goto L_0x04d3
            r12 = 1
            goto L_0x04d4
        L_0x04d3:
            r12 = 0
        L_0x04d4:
            r1 = r0
            r3 = r28
            r14 = 3
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            long r1 = r7.f17138M
            r0.f30772w = r1
            r15 = r16
            r0.f30773x = r15
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r7.f17136K
            r0.f30761C = r1
            if (r1 == 0) goto L_0x04f7
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r2 = "cache exit"
            r0.mo10493B1(r2, r1)
        L_0x04f7:
            java.lang.String r1 = r7.f17140P
            if (r1 == 0) goto L_0x0504
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0502
            goto L_0x0504
        L_0x0502:
            r1 = 0
            goto L_0x0505
        L_0x0504:
            r1 = 1
        L_0x0505:
            if (r1 == 0) goto L_0x050a
            java.lang.String r1 = r7.f17139N
            goto L_0x050c
        L_0x050a:
            java.lang.String r1 = r7.f17140P
        L_0x050c:
            java.lang.String r2 = "<set-?>"
            gy3.C87412m.m108594g(r1, r2)
            r0.f30774y = r1
            boolean r1 = r7.f17141Q
            if (r1 == 0) goto L_0x0527
            java.lang.Class<ht1.v4> r1 = ht1.C8808v4.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            if (r1 != 0) goto L_0x0527
            r1 = 1
            goto L_0x0528
        L_0x0527:
            r1 = 0
        L_0x0528:
            r0.f30775z = r1
            boolean r1 = r7.f17147T
            r0.f30762D = r1
            boolean r2 = r7.f17162b1
            r0.f30763E = r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f30761C
            if (r2 == 0) goto L_0x053c
            if (r1 != 0) goto L_0x053c
            boolean r1 = r0.f17206K
            if (r1 == 0) goto L_0x0556
        L_0x053c:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "FLOAT_BALL_KEY"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 == 0) goto L_0x0553
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0551
            goto L_0x0553
        L_0x0551:
            r1 = 0
            goto L_0x0554
        L_0x0553:
            r1 = 1
        L_0x0554:
            if (r1 != 0) goto L_0x056e
        L_0x0556:
            ye1.o r1 = r28.mo4126Y7()
            android.widget.FrameLayout r1 = r1.f42958b
            r1.setVisibility(r13)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r7)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            rs1.n3 r1 = (rs1.C63575n3) r1
            r1.mo88424g3()
        L_0x056e:
            com.tencent.mm.plugin.finder.ui.y3 r1 = new com.tencent.mm.plugin.finder.ui.y3
            r1.<init>(r7, r0)
            r0.f30759A = r1
            com.tencent.mm.plugin.finder.ui.z3 r1 = new com.tencent.mm.plugin.finder.ui.z3
            r1.<init>(r7, r0)
            r0.f30760B = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r7.f17167t = r0
            long r1 = r7.f17138M
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f17210P = r1
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r0 = r7.f17167t
            if (r0 == 0) goto L_0x0aac
            int r1 = r28.mo4128a8()
            r0.f17211Q = r1
            kf1.c2 r0 = new kf1.c2
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r3 = r7.f17167t
            if (r3 == 0) goto L_0x0aa5
            int r4 = r7.f17129D
            int r5 = r28.mo2194I7()
            rx3.g r1 = r7.f17171x
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            r1 = r0
            r2 = r28
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f17168u = r0
            int r0 = r7.f17126A
            r1 = 15
            r6 = 6
            if (r0 != r1) goto L_0x05bd
            r0 = 6
            goto L_0x05c2
        L_0x05bd:
            int r0 = r7.f17127B
            if (r0 >= 0) goto L_0x05c2
            r0 = 3
        L_0x05c2:
            r7.f17127B = r0
            android.content.Intent r0 = r28.getIntent()
            java.lang.String r1 = "key_feed_report_enter"
            int r0 = r0.getIntExtra(r1, r13)
            android.content.Intent r1 = r28.getIntent()
            java.lang.String r2 = "key_feed_report_enter_type"
            int r1 = r1.getIntExtra(r2, r13)
            r2 = 38
            if (r0 != r2) goto L_0x05e9
            r2 = 25
            if (r1 == r2) goto L_0x05e7
            r2 = 26
            if (r1 == r2) goto L_0x05e5
            goto L_0x05e9
        L_0x05e5:
            r2 = 4
            goto L_0x05ea
        L_0x05e7:
            r2 = 3
            goto L_0x05ea
        L_0x05e9:
            r2 = 0
        L_0x05ea:
            if (r0 != r9) goto L_0x05fa
            if (r1 == r10) goto L_0x05f6
            r0 = 23
            if (r1 == r0) goto L_0x05f3
            goto L_0x05fa
        L_0x05f3:
            r23 = 6
            goto L_0x05fc
        L_0x05f6:
            r0 = 5
            r23 = 5
            goto L_0x05fc
        L_0x05fa:
            r23 = r2
        L_0x05fc:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r1 = r0.mo62444c(r7)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r1 = r1.mo12861q3()
            java.lang.String r2 = r1.f134681r
            if (r2 == 0) goto L_0x061b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0619
            goto L_0x061b
        L_0x0619:
            r2 = 0
            goto L_0x061c
        L_0x061b:
            r2 = 1
        L_0x061c:
            if (r2 == 0) goto L_0x0635
            java.lang.String r2 = r7.f17166s
            java.lang.String r3 = "contextObj.extraInfo isNullOrEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.content.Intent r2 = r28.getIntent()
            java.lang.String r3 = "key_extra_info"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 != 0) goto L_0x0633
            java.lang.String r2 = ""
        L_0x0633:
            r1.f134681r = r2
        L_0x0635:
            java.lang.String r2 = r7.f17166s
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "contextObj="
            r3.append(r4)
            int r4 = r1.hashCode()
            r3.append(r4)
            java.lang.String r4 = " extraInfo="
            r3.append(r4)
            java.lang.String r4 = r1.f134681r
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r2 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader
            long r3 = r7.f17138M
            java.lang.String r5 = r7.f17139N
            int r6 = r28.mo4136s3()
            boolean r9 = r7.f17155X
            int r14 = r7.f17127B
            java.lang.String r12 = r7.f17143R
            boolean r10 = r7.f17147T
            rx3.g r13 = r7.f17171x
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r24 = r13.booleanValue()
            boolean r13 = r7.f17162b1
            r20 = r12
            r12 = r2
            r27 = r8
            r25 = r13
            r19 = r14
            r8 = 0
            r13 = r3
            r4 = r15
            r3 = 0
            r15 = r5
            r16 = r4
            r17 = r6
            r18 = r9
            r21 = r1
            r22 = r10
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.content.Intent r1 = r28.getIntent()
            java.lang.String r4 = "key_from_user_name"
            java.lang.String r1 = r1.getStringExtra(r4)
            if (r1 != 0) goto L_0x06a4
            java.lang.String r1 = ""
        L_0x06a4:
            r2.f13579y = r1
            android.content.Intent r1 = r28.getIntent()
            java.lang.String r4 = "key_to_user_name"
            java.lang.String r1 = r1.getStringExtra(r4)
            if (r1 != 0) goto L_0x06b4
            java.lang.String r1 = ""
        L_0x06b4:
            r2.f13580z = r1
            java.lang.String r1 = r2.getTAG()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fromUserName="
            r4.append(r5)
            java.lang.String r5 = r2.f13579y
            r4.append(r5)
            java.lang.String r5 = ",toUserName="
            r4.append(r5)
            java.lang.String r5 = r2.f13580z
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r2.f13572r = r3
            android.content.Intent r1 = r28.getIntent()
            r2.initFromCache(r1)
            com.tencent.mm.plugin.finder.feed.model.w0 r15 = r2.getCache()
            if (r15 == 0) goto L_0x0709
            java.util.ArrayList<cm1.i2> r1 = r15.f14079a
            if (r1 == 0) goto L_0x06f7
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x06f4
            goto L_0x06f7
        L_0x06f4:
            r1 = 1
            r13 = 0
            goto L_0x06f9
        L_0x06f7:
            r1 = 1
            r13 = 1
        L_0x06f9:
            r4 = r13 ^ 1
            if (r4 == 0) goto L_0x06fe
            goto L_0x06ff
        L_0x06fe:
            r15 = r3
        L_0x06ff:
            if (r15 == 0) goto L_0x0709
            com.tencent.mm.plugin.finder.ui.a4 r1 = new com.tencent.mm.plugin.finder.ui.a4
            r1.<init>(r7, r2)
            r2.setInitDone(r1)
        L_0x0709:
            com.tencent.mm.plugin.finder.ui.f4 r1 = new com.tencent.mm.plugin.finder.ui.f4
            r1.<init>(r7, r2)
            r2.f13574t = r1
            com.tencent.mm.plugin.finder.ui.g4 r1 = new com.tencent.mm.plugin.finder.ui.g4
            r1.<init>(r7)
            r2.f13575u = r1
            r7.f17169v = r2
            int r1 = r7.f17126A
            if (r1 == 0) goto L_0x072a
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 1278(0x4fe, double:6.314E-321)
            r15 = 14
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
        L_0x072a:
            boolean r1 = r7.f17155X
            if (r1 == 0) goto L_0x0748
            com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler r1 = new com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler
            r1.<init>(r7)
            r7.f17144R0 = r1
            kf1.c2 r2 = r7.f17168u
            if (r2 == 0) goto L_0x0741
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            r1.mo2498a(r2)
            goto L_0x0748
        L_0x0741:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0748:
            kf1.c2 r1 = r7.f17168u
            if (r1 == 0) goto L_0x0a9e
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            com.tencent.mm.plugin.finder.ui.h4 r2 = new com.tencent.mm.plugin.finder.ui.h4
            r2.<init>(r7)
            r1.post(r2)
            di3.d r1 = di3.C86312j.m106911c(r26)
            ht1.j5 r1 = (ht1.C8777j5) r1
            r1.mo9606UI()
            di3.d r1 = di3.C86312j.m106911c(r26)
            ht1.j5 r1 = (ht1.C8777j5) r1
            ak1.f0 r1 = r1.getConfig()
            di3.d r2 = di3.C86312j.m106911c(r26)
            ht1.j5 r2 = (ht1.C8777j5) r2
            int r4 = r28.mo2194I7()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.mo9617rG(r4)
            int r2 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r2)
            r1.f151419A = r2
            bl3.r$a r1 = r0.mo62444c(r7)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            rs1.n3 r1 = (rs1.C63575n3) r1
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r2 = r7.f17169v
            if (r2 == 0) goto L_0x0a98
            r1.f180282h = r2
            bl3.r$a r1 = r0.mo62444c(r7)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            rs1.n3 r1 = (rs1.C63575n3) r1
            if (r1 == 0) goto L_0x07c2
            android.content.Intent r2 = r28.getIntent()
            android.os.Bundle r15 = r2.getExtras()
            if (r15 == 0) goto L_0x07be
            java.lang.String r2 = "key_view_info"
            r15.remove(r2)
            java.lang.String r2 = "key_image_url"
            r15.remove(r2)
            java.lang.String r2 = "key_nine_patch_id"
            r15.remove(r2)
            java.lang.String r2 = "key_animate_id"
            r15.remove(r2)
            goto L_0x07bf
        L_0x07be:
            r15 = r3
        L_0x07bf:
            r1.mo88425i3(r15)
        L_0x07c2:
            androidx.appcompat.app.AppCompatActivity r1 = r28.getContext()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "KEY_FROM_SOURCE"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = "GlobalFav"
            boolean r1 = gy3.C87412m.m108589b(r2, r1)
            if (r1 == 0) goto L_0x07ee
            kf1.c2 r1 = r7.f17168u
            if (r1 == 0) goto L_0x07e7
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
            r1.setCanLoadMore(r8)
            r1.setEnableLoadMore(r8)
            goto L_0x07ee
        L_0x07e7:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x07ee:
            boolean r1 = r7.f17162b1
            if (r1 == 0) goto L_0x0888
            boolean r1 = r7.f17141Q
            if (r1 == 0) goto L_0x0888
            androidx.appcompat.app.AppCompatActivity r1 = r28.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165359(0x7f0700af, float:1.7944933E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            androidx.appcompat.app.AppCompatActivity r2 = r28.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131165315(0x7f070083, float:1.7944844E38)
            float r2 = r2.getDimension(r4)
            int r2 = (int) r2
            androidx.appcompat.app.AppCompatActivity r4 = r28.getContext()
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r5 = 2131498015(0x7f0c141f, float:1.861964E38)
            android.view.View r4 = r4.inflate(r5, r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            if (r5 != 0) goto L_0x0831
            android.view.ViewGroup$MarginLayoutParams r5 = new android.view.ViewGroup$MarginLayoutParams
            r6 = -1
            r5.<init>(r6, r2)
        L_0x0831:
            r5.height = r2
            r4.setMinimumHeight(r2)
            r4.setLayoutParams(r5)
            kf1.c2 r5 = r7.f17168u
            if (r5 == 0) goto L_0x0881
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r5.mo10308D()
            r5.setRefreshHeaderView(r4)
            kf1.c2 r4 = r7.f17168u
            if (r4 == 0) goto L_0x087a
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo10308D()
            int r5 = r2 - r1
            r4.setLimitTopRequest(r5)
            kf1.c2 r4 = r7.f17168u
            if (r4 == 0) goto L_0x0873
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo10308D()
            int r1 = r1 - r2
            r4.setRefreshTargetY(r1)
            kf1.c2 r1 = r7.f17168u
            if (r1 == 0) goto L_0x086c
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
            r2 = 1070386381(0x3fcccccd, float:1.6)
            r1.setDamping(r2)
            goto L_0x0888
        L_0x086c:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0873:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x087a:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0881:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0888:
            com.tencent.mm.plugin.finder.feed.model.r r1 = r28.mo4127Z7()
            int r2 = r7.f17129D
            int r4 = r28.mo2194I7()
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$h r5 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$h
            r5.<init>(r7)
            r1.mo77389H1(r2, r4, r5)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r28.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r2, r4)
            rs1.s8 r2 = r1.mo12873f(r2)
            if (r2 == 0) goto L_0x08b9
            r4 = 1
            ef1.c r2 = ht1.C60172g4.C60173a.m70189a(r2, r8, r4, r3)
            if (r2 == 0) goto L_0x08b9
            com.tencent.mm.plugin.finder.feed.model.r r4 = r28.mo4127Z7()
            r2.mo83450a(r4)
        L_0x08b9:
            androidx.appcompat.app.AppCompatActivity r2 = r28.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r2, r4)
            rs1.s8 r2 = r1.mo12873f(r2)
            if (r2 == 0) goto L_0x08d4
            r4 = 1
            ef1.c r2 = ht1.C60172g4.C60173a.m70189a(r2, r8, r4, r3)
            if (r2 == 0) goto L_0x08d4
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$f r4 = r7.f17164d1
            r2.mo83450a(r4)
        L_0x08d4:
            rx3.g r2 = r7.f17132G
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            ht1.z2 r2 = (ht1.C8819z2) r2
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$i r4 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$i
            r4.<init>(r7)
            kf1.c2 r5 = r7.f17168u
            if (r5 == 0) goto L_0x0a91
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            r2.mo9646T0(r4, r5)
            androidx.appcompat.app.AppCompatActivity r2 = r28.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r2, r4)
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x0915
            r2 = 1
            ef1.c r1 = ht1.C60172g4.C60173a.m70189a(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0915
            rx3.g r2 = r7.f17132G
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            ht1.z2 r2 = (ht1.C8819z2) r2
            ef1.d r2 = r2.mo9650n()
            r1.mo83450a(r2)
        L_0x0915:
            ye1.o r1 = r28.mo4126Y7()
            android.widget.FrameLayout r1 = r1.f42961e
            r1.setVisibility(r8)
            ye1.o r1 = r28.mo4126Y7()
            android.widget.LinearLayout r1 = r1.f42957a
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$j r2 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$j
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            ye1.o r1 = r28.mo4126Y7()
            android.widget.FrameLayout r1 = r1.f42958b
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$k r2 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$k
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            ye1.o r1 = r28.mo4126Y7()
            android.widget.LinearLayout r1 = r1.f42962f
            r2 = 8
            r1.setVisibility(r2)
            ye1.o r1 = r28.mo4126Y7()
            android.widget.TextView r1 = r1.f42959c
            r1.setVisibility(r8)
            android.view.Window r1 = r28.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "window.decorView"
            gy3.C87412m.m108593f(r1, r2)
            int r2 = r1.getSystemUiVisibility()
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.setSystemUiVisibility(r2)
            android.view.Window r1 = r28.getWindow()
            r1.setStatusBarColor(r8)
            com.tencent.mm.ui.MMActivityController r1 = r28.getController()
            android.content.res.Resources r2 = r28.getResources()
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r2 = r2.getColor(r4)
            r1.mo177059O0(r7, r2)
            com.tencent.p014mm.p136ui.C74779i.m89536a(r7, r8)
            androidx.appcompat.app.ActionBar r1 = r28.getSupportActionBar()
            if (r1 == 0) goto L_0x0994
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r8)
            r1.mo91112w(r2)
            r1.mo91104o()
        L_0x0994:
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r28)
            ye1.o r2 = r28.mo4126Y7()
            android.widget.FrameLayout r2 = r2.f42961e
            r2.setPadding(r8, r1, r8, r8)
            r28.mo4132e8()
            com.tencent.mm.ui.MMActivityController r1 = r28.getController()
            r2 = 1
            r1.mo177049H0(r2)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setNavigationbarColor(r1)
            rx3.g r1 = r7.f17160Z0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            ye1.g0 r1 = (ye1.C15974g0) r1
            android.widget.ImageView r1 = r1.f42949a
            android.content.res.Resources r4 = r28.getResources()
            r5 = 2131100803(0x7f060483, float:1.7813998E38)
            int r4 = r4.getColor(r5)
            r1.setBackgroundColor(r4)
            r1 = 2131313451(0x7f09432b, float:1.82453E38)
            android.view.View r1 = r7.findViewById(r1)
            if (r1 == 0) goto L_0x09df
            android.content.res.Resources r4 = r28.getResources()
            int r4 = r4.getColor(r5)
            r1.setBackgroundColor(r4)
        L_0x09df:
            int r1 = r7.f17126A
            r4 = 22
            if (r1 != r4) goto L_0x09e7
            r13 = 1
            goto L_0x09e8
        L_0x09e7:
            r13 = 0
        L_0x09e8:
            r1 = 2131297509(0x7f0904e5, float:1.8212965E38)
            if (r13 == 0) goto L_0x0a11
            r2 = 2131829778(0x7f112412, float:1.9292535E38)
            r7.setMMTitle((int) r2)
            android.view.View r2 = r7.findViewById(r1)
            boolean r4 = r2 instanceof com.tencent.p014mm.p136ui.widget.imageview.WeImageView
            if (r4 == 0) goto L_0x0a11
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r4 = 2131756258(0x7f1004e2, float:1.9143418E38)
            r2.setImageResource(r4)
            android.content.res.Resources r4 = r28.getResources()
            r5 = 2131100946(0x7f060512, float:1.7814288E38)
            int r4 = r4.getColor(r5)
            r2.setIconColor(r4)
        L_0x0a11:
            android.view.View r1 = r7.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x0a27
            android.content.res.Resources r2 = r28.getResources()
            r4 = 2131100932(0x7f060504, float:1.781426E38)
            int r2 = r2.getColor(r4)
            r1.setIconColor(r2)
        L_0x0a27:
            di3.d r1 = di3.C86312j.m106911c(r27)
            l31.e r1 = (l31.C61212e) r1
            o31.b r2 = o31.C11345b.FinderShareFeedRelUI
            r1.mo86178qr(r7, r2)
            di3.d r1 = di3.C86312j.m106911c(r27)
            l31.e r1 = (l31.C61212e) r1
            o31.a r2 = o31.C76986a.Finder
            r1.mo86179qs(r7, r2)
            di3.d r1 = di3.C86312j.m106911c(r27)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "FinderShareFeedRelUI"
            r1.mo86136FZ(r7, r2)
            di3.d r1 = di3.C86312j.m106911c(r27)
            l31.e r1 = (l31.C61212e) r1
            r2 = 168(0xa8, float:2.35E-43)
            r4 = 24184(0x5e78, float:3.3889E-41)
            r1.mo86148No(r7, r2, r4)
            di3.d r1 = di3.C86312j.m106911c(r27)
            l31.e r1 = (l31.C61212e) r1
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$l r2 = new com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$l
            r2.<init>(r7)
            r1.E60(r7, r2)
            bl3.r$a r0 = r0.mo62444c(r7)
            java.lang.Class<lp1.f> r1 = lp1.C10612f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            lp1.f r0 = (lp1.C10612f) r0
            kf1.c2 r1 = r7.f17168u
            if (r1 == 0) goto L_0x0a8a
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            r0.getClass()
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108594g(r1, r2)
            r0.f31992e = r1
            lp1.e r2 = new lp1.e
            r2.<init>(r0)
            r1.mo17043c(r2)
            return
        L_0x0a8a:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0a91:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0a98:
            java.lang.String r0 = "loader"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0a9e:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0aa5:
            r3 = 0
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0aac:
            r3 = 0
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.mo2941S7():void");
    }

    /* renamed from: X7 */
    public final void mo4125X7(boolean z) {
        boolean z2 = !z;
        this.f17159Z = z2 ? 2 : 1;
        updateOptionMenuText(1, mo4129b8(z2));
        updateOptionMenuStyle(1, z2 ? MMActivityController.C73075r.FEED_UNFOLLOW : MMActivityController.C73075r.FEED_FOLLOW);
    }

    /* renamed from: Y7 */
    public final C15976o mo4126Y7() {
        return (C15976o) this.f17158Y0.getValue();
    }

    /* renamed from: Z7 */
    public final C55776r mo4127Z7() {
        return (C55776r) ((C36570n) this.f17131F).getValue();
    }

    /* renamed from: a8 */
    public final int mo4128a8() {
        return ((Number) ((C36570n) this.f17133H).getValue()).intValue();
    }

    /* renamed from: b8 */
    public final String mo4129b8(boolean z) {
        if (z) {
            String string = getContext().getString(C0966R.string.f360510da3);
            C87412m.m108593f(string, "context.getString(R.string.finder_followed)");
            return string;
        }
        String string2 = getContext().getString(C0966R.string.d_j);
        C87412m.m108593f(string2, "context.getString(R.string.finder_follow)");
        return string2;
    }

    /* renamed from: c8 */
    public final void mo4130c8() {
        C56437x0 x0Var;
        Class cls = C10625o.class;
        if (this.f17153W) {
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f17169v;
            if (finderFeedShareRelativeListLoader == null) {
                C87412m.m108603p("loader");
                throw null;
            } else if (finderFeedShareRelativeListLoader.getDataListJustForAdapter().size() >= 2) {
                C10612f fVar = (C10612f) C39818r.f106831a.mo62444c(this).mo75002a(C10612f.class);
                LinkedList linkedList = new LinkedList();
                FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = this.f17169v;
                if (finderFeedShareRelativeListLoader2 != null) {
                    Iterator it = finderFeedShareRelativeListLoader2.getDataList().iterator();
                    while (it.hasNext()) {
                        C0740i2 i2Var = (C0740i2) it.next();
                        BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                        if (baseFinderFeed != null) {
                            linkedList.add(baseFinderFeed);
                        }
                    }
                    int I7 = mo2194I7();
                    fVar.getClass();
                    fVar.f31991d.addAll(linkedList);
                    ArrayList<C10605a> arrayList = fVar.f31995h;
                    C39818r rVar = C39818r.f106831a;
                    arrayList.add(rVar.mo62444c(fVar.getActivity()).mo75002a(C10617j.class));
                    fVar.f31995h.add(rVar.mo62444c(fVar.getActivity()).mo75002a(C10628q.class));
                    fVar.f31995h.add(rVar.mo62444c(fVar.getActivity()).mo75002a(C10608c.class));
                    fVar.f31995h.add(rVar.mo62444c(fVar.getActivity()).mo75002a(cls));
                    fVar.f31995h.add(rVar.mo62444c(fVar.getActivity()).mo75002a(C10623n.class));
                    Iterator<C10605a> it4 = fVar.f31995h.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo10863g3(fVar.f31991d, I7);
                    }
                    C9662c2 c2Var = this.f17168u;
                    if (c2Var != null) {
                        C39818r rVar2 = C39818r.f106831a;
                        C10625o oVar = (C10625o) rVar2.mo62444c(fVar.getActivity()).mo75002a(cls);
                        if (!c2Var.f30130o) {
                            x0Var = null;
                        } else {
                            x0Var = c2Var.f30129n;
                            if (x0Var == null) {
                                x0Var = new C56437x0();
                            }
                            c2Var.f30129n = x0Var;
                        }
                        if (!(x0Var instanceof C56437x0)) {
                            x0Var = null;
                        }
                        oVar.f32025z = x0Var;
                        if (fVar.f31993f && !((C13554z) rVar2.mo62444c(fVar.getActivity()).mo75002a(C13554z.class)).f38450t) {
                            RecyclerView recyclerView = fVar.f31992e;
                            if (recyclerView == null) {
                                C87412m.m108603p("shareRecyclerView");
                                throw null;
                            } else if (recyclerView.mo17023I0(0) != null) {
                                Iterator<C10605a> it5 = fVar.f31995h.iterator();
                                while (it5.hasNext()) {
                                    C10605a next = it5.next();
                                    if (next.mo10869n3() && !((Boolean) ((C36570n) fVar.f31996i).getValue()).booleanValue()) {
                                        RecyclerView recyclerView2 = fVar.f31992e;
                                        if (recyclerView2 != null) {
                                            next.mo10864i3(recyclerView2);
                                            next.mo10870o3();
                                            return;
                                        }
                                        C87412m.m108603p("shareRecyclerView");
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            }
        }
    }

    /* renamed from: d8 */
    public final boolean mo4131d8(FinderContact finderContact) {
        String str;
        C58961d.C58963b bVar = C58961d.f168673a;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        return C58961d.C58963b.m68836h(bVar, str, (String) null, false, false, 14, (Object) null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C39818r rVar = C39818r.f106831a;
        C10608c cVar = (C10608c) rVar.mo62444c(this).mo75002a(C10608c.class);
        cVar.getClass();
        View view = cVar.f31970d;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                cVar.f31986t = motionEvent.getY();
            } else if (action == 1) {
                float y = motionEvent.getY() - cVar.f31986t;
                View view2 = cVar.f31970d;
                if (view2 != null && view2.getVisibility() == 0 && y > 0.0f && y > ((float) cVar.f31987u)) {
                    C10605a.m10552d3(cVar, C76577a.m92151b(cVar.getContext(), 80), 300, 0.0f, 4, (Object) null);
                }
            }
        }
        C10623n nVar = (C10623n) rVar.mo62444c(this).mo75002a(C10623n.class);
        nVar.getClass();
        View view3 = nVar.f31970d;
        if (view3 != null && view3.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                nVar.f32018w = motionEvent.getY();
            } else if (action2 == 1) {
                float y2 = motionEvent.getY() - nVar.f32018w;
                if (y2 > 0.0f && y2 > ((float) nVar.f32019x)) {
                    nVar.dismiss();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e8 */
    public final void mo4132e8() {
        if (this.f17127B == 13) {
            mo4126Y7().f42959c.setVisibility(8);
            CharSequence mMTitle = getMMTitle();
            if (!(mMTitle == null || mMTitle.length() == 0)) {
                View view = this.f17170w;
                TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.nfa) : null;
                if (textView != null) {
                    textView.setText(getMMTitle());
                }
            }
        }
    }

    /* renamed from: f8 */
    public final void mo4133f8(FinderContact finderContact) {
        if (this.f17155X && finderContact != null && !Util.isEqual(finderContact.username, C66785b.f191882e.mo90662O5()) && ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF()) {
            boolean d8 = mo4131d8(finderContact);
            addTextOptionMenu(1, mo4129b8(d8), new C3756r(this), (View.OnLongClickListener) null, d8 ? MMActivityController.C73075r.FEED_UNFOLLOW : MMActivityController.C73075r.FEED_FOLLOW);
            this.f17159Z = d8 ? 2 : 1;
        }
    }

    public void finish() {
        String str;
        C39818r rVar = C39818r.f106831a;
        if (!((C13181d3) rVar.mo62444c(this).mo75002a(C13181d3.class)).onInterceptFinish()) {
            ShareRelPresenter shareRelPresenter = this.f17167t;
            if (shareRelPresenter != null && shareRelPresenter.f17214T) {
                setResult(-1);
            }
            super.finish();
            C60593d dVar = (C60593d) rVar.mo62444c(this).mo75002a(C60593d.class);
            if (dVar.f172692e != null) {
                C50575np1 np12 = new C50575np1();
                np12.f138712d = dVar.f172697j;
                C60592c cVar = dVar.f172693f;
                if (cVar != null) {
                    str = cVar.f172689i.toString();
                    C87412m.m108593f(str, "feedbackJsonArray.toString()");
                } else {
                    str = "";
                }
                np12.f138713e = str;
                String str2 = dVar.f172691d;
                Log.m105924i(str2, "doCallback " + np12.f138712d + ", " + np12.f138713e);
                C60216z4.C8821a<Object> aVar = C9235i.f28975a;
                if (aVar != null) {
                    aVar.mo6382a(np12);
                }
                C9235i.f28975a = null;
            } else {
                C60216z4.C8821a<Object> aVar2 = C9235i.f28975a;
                if (aVar2 != null) {
                    aVar2.mo6382a(new C50575np1());
                }
            }
            C9235i.f28975a = null;
        }
    }

    /* renamed from: g8 */
    public final void mo4134g8(boolean z) {
        if (findViewById(C0966R.C0970id.f359188ji1) == null) {
            return;
        }
        if (z) {
            View findViewById = findViewById(C0966R.C0970id.f359188ji1);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View findViewById2 = findViewById(C0966R.C0970id.f359188ji1);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apk;
    }

    /* renamed from: i8 */
    public final void mo4135i8(boolean z) {
        String str = this.f17166s;
        Log.m105924i(str, "showRetryTips ifShow:" + z);
        View findViewById = findViewById(C0966R.C0970id.is8);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C3757s(this, findViewById));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13484v3.class, C13539y3.class, C63513a1.class, C13194da.class, C56711j.class, FinderLikeGuideUIC.class, C60593d.class, C13466ta.class, C63648v.class, C63547e.class, C14083g.class, C63575n3.class, C0324s.m265a(C24560g0.m30725a(C8784m2.class)), C13502w6.class, C10612f.class, C10617j.class, C10628q.class, C10608c.class, C10623n.class, C13554z.class, C63545b1.class, C13140c8.class, C63654v2.class, C48085q4.class, C13426s1.class, C60577a.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r7 = this;
            java.util.HashSet r0 = r7.getUiComponents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L_0x0008
            return
        L_0x001b:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r1 = r0.mo62444c(r7)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
            bl3.t r1 = r1.mo62449e(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0035
            boolean r1 = r1.onBackPressed()
            if (r1 != r2) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x0039
            return
        L_0x0039:
            bl3.r$a r1 = r0.mo62444c(r7)
            java.lang.Class<iq1.d> r4 = iq1.C60593d.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            iq1.d r1 = (iq1.C60593d) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L_0x004c
            return
        L_0x004c:
            bl3.r$a r1 = r0.mo62444c(r7)
            java.lang.Class<rs1.d3> r4 = rs1.C13181d3.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            rs1.d3 r1 = (rs1.C13181d3) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L_0x005f
            return
        L_0x005f:
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r1 = r7.f17167t
            r4 = 0
            if (r1 == 0) goto L_0x00c5
            kf1.f r5 = r1.f29964g
            if (r5 == 0) goto L_0x0078
            com.tencent.mm.plugin.finder.view.e1 r5 = r5.mo10313v()
            if (r5 == 0) goto L_0x0078
            boolean r6 = r5.mo79924b()
            if (r6 == 0) goto L_0x0078
            r5.mo79923a()
            goto L_0x009b
        L_0x0078:
            kf1.f r5 = r1.f29964g
            if (r5 == 0) goto L_0x008a
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r5 = r5.mo10314y()
            boolean r6 = r5.mo82541i()
            if (r6 == 0) goto L_0x008a
            r5.mo4615l()
            goto L_0x009b
        L_0x008a:
            kf1.f r1 = r1.f29964g
            if (r1 == 0) goto L_0x00a3
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r1 = r1.f30126h
            if (r1 == 0) goto L_0x009d
            boolean r4 = r1.mo82541i()
            if (r4 == 0) goto L_0x00a3
            r1.mo4615l()
        L_0x009b:
            r1 = 1
            goto L_0x00a4
        L_0x009d:
            java.lang.String r0 = "friendLikeDrawer"
            gy3.C87412m.m108603p(r0)
            throw r4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            if (r1 != 0) goto L_0x00bf
            bl3.r$a r0 = r0.mo62444c(r7)
            java.lang.Class<rs1.n3> r1 = rs1.C63575n3.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(this).get…allNormalUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            rs1.n3 r0 = (rs1.C63575n3) r0
            boolean r0 = r0.mo88421d3(r3)
            if (r0 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r2 != 0) goto L_0x00c4
            r7.finish()
        L_0x00c4:
            return
        L_0x00c5:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI.onBackPressed():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo4126Y7().f42962f.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderShareFeedRelUI);
        C8479f0 f0Var = new C8479f0();
        int a8 = mo4128a8();
        if (a8 == 16) {
            f0Var.f27484d = 1;
        } else if (a8 == 39) {
            f0Var.f27484d = 2;
        }
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3753o(f0Var));
        getIntent().getBooleanExtra("KEY_FORCE_FULLSCREEN", false);
        getIntent().getIntExtra("key_share_media_type", 0);
        mo4128a8();
        if (getIntent().getBooleanExtra("is_report_feed", false)) {
            synchronized (C7419a1.f25592a) {
                int i = C11412b.f33577a;
                Log.m105925i("Finder.SearchFeedInfoCollector", "clear", (Object[]) null);
                C7419a1.f25593b.clear();
            }
        }
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("KEY_NAVIGATE_BACK", false)) {
            this.f17161a1 = f17125e1;
            f17125e1 = null;
        }
        if (this.f17127B == 13) {
            if (this.f17170w == null) {
                this.f17170w = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d07, (ViewGroup) null);
            }
            View view = this.f17170w;
            if (view != null) {
                ((FrameLayout) findViewById(C0966R.C0970id.f5375dg)).removeAllViews();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMarginEnd(((int) getResources().getDimension(C0966R.dimen.f3753d4)) + ((int) getResources().getDimension(C0966R.dimen.f3749d0)));
                ((FrameLayout) findViewById(C0966R.C0970id.f5375dg)).addView(view, layoutParams);
            }
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (C85875k4.m106211z()) {
            setTheme(C0966R.style.f8629pa);
        } else {
            setTheme(C0966R.style.f8630pb);
        }
    }

    public void onDestroy() {
        ArrayMap<Long, C7419a1.C7420a> arrayMap;
        JSONArray b;
        C58553c a;
        C58553c a2;
        C58553c a3;
        C58553c a4;
        Class cls = C62168u.class;
        Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
        Class cls3 = C58417y0.class;
        C34379c<?> cVar = this.f17156X0;
        if (cVar != null) {
            cVar.cancel(false);
        }
        if (this.f17126A != 0 && !this.f17146S0) {
            if (this.f17155X) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls3);
                long j = this.f17138M;
                int i = this.f17126A;
                String str = this.f17130E;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar.mo12873f(context);
                y0Var.iy0(j, i, 4, str2, 0, 2, (String) null, f != null ? f.mo12861q3().f134671e : null);
            } else {
                C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls3);
                long j2 = this.f17138M;
                int i2 = this.f17126A;
                String str3 = this.f17130E;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                AppCompatActivity context2 = getContext();
                C87412m.m108593f(context2, "context");
                C13442s8 f2 = aVar2.mo12873f(context2);
                y0Var2.jy0(j2, i2, str4, 0, 2, f2 != null ? f2.mo12861q3().f134671e : null);
            }
            this.f17146S0 = true;
        }
        mo4127Z7().onDetach();
        C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
        AppCompatActivity context3 = getContext();
        C87412m.m108593f(context3, "context");
        C13442s8 f3 = aVar3.mo12873f(context3);
        if (!(f3 == null || (a4 = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
            a4.mo83453d(mo4127Z7());
        }
        ((C8819z2) ((C36570n) this.f17132G).getValue()).onDetach();
        AppCompatActivity context4 = getContext();
        C87412m.m108593f(context4, "context");
        C13442s8 f4 = aVar3.mo12873f(context4);
        if (!(f4 == null || (a3 = C60172g4.C60173a.m70189a(f4, 0, 1, (Object) null)) == null)) {
            a3.mo83453d(((C8819z2) ((C36570n) this.f17132G).getValue()).mo9650n());
        }
        AppCompatActivity context5 = getContext();
        C87412m.m108593f(context5, "context");
        C13442s8 f5 = aVar3.mo12873f(context5);
        if (!(f5 == null || (a2 = C60172g4.C60173a.m70189a(f5, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f17164d1);
        }
        C20480e0 e0Var = C20480e0.f57583a;
        int s3 = mo4136s3();
        C13442s8 f6 = aVar3.mo12873f(this);
        e0Var.mo32047v(s3, f6 != null ? f6.mo12861q3() : null);
        IListener<FeedContactChangeEvent> iListener = this.f17142Q0;
        if (iListener != null) {
            iListener.dead();
        }
        FinderFeedSnsAdHandler finderFeedSnsAdHandler = this.f17144R0;
        if (finderFeedSnsAdHandler != null) {
            AppCompatActivity context6 = getContext();
            C87412m.m108593f(context6, "context");
            C13442s8 f7 = aVar3.mo12873f(context6);
            if (!(f7 == null || (a = C60172g4.C60173a.m70189a(f7, 0, 1, (Object) null)) == null)) {
                a.mo83453d(finderFeedSnsAdHandler.f30364i);
            }
            finderFeedSnsAdHandler.mo2500c();
        }
        this.f17144R0 = null;
        if (getIntent().getBooleanExtra("is_report_feed", false)) {
            FinderIpcResultEvent finderIpcResultEvent = new FinderIpcResultEvent();
            FinderIpcResultEvent.C1049a aVar4 = finderIpcResultEvent.f9214d;
            aVar4.getClass();
            C7419a1 a1Var = C7419a1.f25592a;
            synchronized (a1Var) {
                int i3 = C11412b.f33577a;
                Log.m105925i("Finder.SearchFeedInfoCollector", "report", (Object[]) null);
                arrayMap = C7419a1.f25593b;
                Collection<C7419a1.C7420a> values = arrayMap.values();
                C87412m.m108593f(values, "feedInfoMap.values");
                b = a1Var.mo8553b(values);
            }
            aVar4.f9215a = b.toString();
            finderIpcResultEvent.publish();
            synchronized (a1Var) {
                Log.m105925i("Finder.SearchFeedInfoCollector", "clear", (Object[]) null);
                arrayMap.clear();
            }
        }
        if (this.f17138M != 0 && mo2194I7() == 184) {
            C39818r rVar = C39818r.f106831a;
            C62168u.C11757b e3 = ((C62168u) rVar.mo62446e(cls2).mo75002a(cls)).mo87221e3(this.f17138M);
            if (e3 != null) {
                String str5 = this.f17166s;
                Log.m105924i(str5, "OnExitFinderFullscreenEvent isPause:" + e3.f34423g + " playbackRate:" + e3.f34422f + " playbackTime:" + (e3.f34421e / ((long) 1000)));
                OnExitFinderFullscreenEvent onExitFinderFullscreenEvent = new OnExitFinderFullscreenEvent();
                OnExitFinderFullscreenEvent.C1101a aVar5 = onExitFinderFullscreenEvent.f9360d;
                aVar5.f9361a = "didExit";
                aVar5.f9363c = e3.f34423g;
                aVar5.f9364d = e3.f34422f;
                aVar5.f9362b = (((float) e3.f34421e) * 1.0f) / ((float) 1000);
                if (!TextUtils.isEmpty(this.f17149U)) {
                    C55015f1 d = C66167g.m78055d(C66167g.f190173a, this.f17149U, false, 2, (Object) null);
                    OnExitFinderFullscreenEvent.C1101a aVar6 = onExitFinderFullscreenEvent.f9360d;
                    C64888zo1 zo12 = new C64888zo1();
                    zo12.f186756A = C61926c.m72691p(this.f17138M);
                    zo12.f186759e = d.field_mediaId;
                    zo12.f186769r = d.field_cacheSize;
                    zo12.f186770s = d.field_totalSize;
                    zo12.f186771t = d.field_dynamicRangeType;
                    zo12.f186772u = d.field_state;
                    zo12.f186757B = d.field_moovReady;
                    aVar6.f9365e = zo12;
                }
                onExitFinderFullscreenEvent.publish();
            }
            ((C62168u) rVar.mo62446e(cls2).mo75002a(cls)).f176749h.clear();
        }
        super.onDestroy();
    }

    public void onPause() {
        C60216z4.C8821a<JSONObject> aVar;
        FinderVideoLayout finderVideoLayout;
        IListener<FeedContactChangeEvent> iListener;
        super.onPause();
        this.f17163c1.dead();
        if (this.f17155X && (iListener = this.f17142Q0) != null) {
            iListener.alive();
        }
        if (isFinishing() && (aVar = this.f17161a1) != null) {
            C9662c2 c2Var = this.f17168u;
            if (c2Var != null) {
                RecyclerView recyclerView = c2Var.getRecyclerView();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager != null) {
                    RecyclerView.C16631z I0 = recyclerView.mo17023I0(finderLinearLayoutManager.mo16957C());
                    C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                    C9493c cVar = oVar != null ? (C9493c) oVar.f173503E : null;
                    BaseFinderFeed baseFinderFeed = cVar instanceof BaseFinderFeed ? (BaseFinderFeed) cVar : null;
                    long j = 0;
                    float currentPosMs = ((float) ((oVar == null || (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) == null) ? 0 : finderVideoLayout.getCurrentPosMs())) / 1000.0f;
                    FinderFullSeekBarLayout finderFullSeekBarLayout = oVar != null ? (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4) : null;
                    boolean z = false;
                    boolean z2 = (finderFullSeekBarLayout != null && finderFullSeekBarLayout.f17507V) && !finderFullSeekBarLayout.f17492K;
                    String str = this.f17166s;
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkNavigateBack: currentTime=");
                    sb.append(currentPosMs);
                    sb.append(", isPause=");
                    sb.append(z2);
                    sb.append(", id=");
                    if (baseFinderFeed != null) {
                        j = baseFinderFeed.getItemId();
                    }
                    sb.append(C61926c.m72691p(j));
                    sb.append(", firstId=");
                    ShareRelPresenter shareRelPresenter = this.f17167t;
                    if (shareRelPresenter != null) {
                        sb.append(C61926c.m72691p(shareRelPresenter.f30772w));
                        Log.m105924i(str, sb.toString());
                        if (baseFinderFeed != null) {
                            long itemId = baseFinderFeed.getItemId();
                            ShareRelPresenter shareRelPresenter2 = this.f17167t;
                            if (shareRelPresenter2 == null) {
                                C87412m.m108603p("presenter");
                                throw null;
                            } else if (itemId == shareRelPresenter2.f30772w) {
                                z = true;
                            }
                        }
                        if (z && currentPosMs > 0.0f) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("feedID", this.f17139N);
                            jSONObject.put("currentTime", Float.valueOf(currentPosMs));
                            jSONObject.put("isPause", z2);
                            aVar.mo6382a(jSONObject);
                        }
                        this.f17161a1 = null;
                    } else {
                        C87412m.m108603p("presenter");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9662c2 c2Var2 = this.f17168u;
        if (c2Var2 != null) {
            C8777j5.C8778a.m8602c(j5Var, c2Var2.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, String.valueOf(mo2194I7()), C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C60593d dVar = (C60593d) C39818r.f106831a.mo62444c(this).mo75002a(C60593d.class);
        ShareRelPresenter shareRelPresenter = this.f17167t;
        if (shareRelPresenter != null) {
            dVar.f172701q = shareRelPresenter;
            this.f17163c1.alive();
            if (this.f17155X) {
                IListener<FeedContactChangeEvent> iListener = this.f17142Q0;
                if (iListener != null) {
                    iListener.dead();
                }
                boolean d8 = mo4131d8(this.f17172x0);
                String str = this.f17166s;
                Log.m105924i(str, "isFollowed: " + d8 + " followStatus:" + this.f17159Z);
                if (this.f17165p0 != null) {
                    int i = this.f17159Z;
                    if (i != 1) {
                        if (i == 2 && !d8) {
                            mo4125X7(true);
                        }
                    } else if (d8) {
                        mo4125X7(false);
                    }
                    this.f17165p0 = null;
                }
                if (this.f17159Z == 0) {
                    mo4133f8(this.f17172x0);
                }
            }
            C20480e0.f57583a.mo32043q(mo4136s3());
            int I7 = mo2194I7();
            if (I7 == 25 || I7 == 38) {
                C64208c.C64209a aVar = C64208c.f181951a;
            } else if (I7 == 39) {
                C64208c.C64209a aVar2 = C64208c.f181951a;
            }
            if (this.f17138M != 0 && mo2194I7() == 184) {
                new OnEnterFinderFullscreenEvent().publish();
            }
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C9662c2 c2Var = this.f17168u;
            if (c2Var != null) {
                C8777j5.C8778a.m8602c(j5Var, c2Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, String.valueOf(mo2194I7()), C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: s3 */
    public final int mo4136s3() {
        return ((Number) ((C36570n) this.f17151V).getValue()).intValue();
    }

    public void setMMTitle(String str) {
        super.setMMTitle(str);
        mo4132e8();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        if (getIntent().getBooleanExtra("key_enable_ringtone_bubble", false)) {
            hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8757a2.class)));
            hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8768g2.class)));
            hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8766f5.class)));
            hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8787n2.class)));
            hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8773i2.class)));
        }
    }

    public void setMMTitle(CharSequence charSequence) {
        super.setMMTitle(charSequence);
        mo4132e8();
    }
}
