package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kf1.C9932pb;
import kf1.C9965rb;
import kotlin.Metadata;
import l60.C99342a;
import p185kq.C10383h;
import p217oq.C11716d;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50141kk1;
import te3.C50985qn1;
import te3.C51270sn1;
import te3.C52002xp0;
import te3.C64726td1;
import u24.C90599h;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lkf1/pb;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI */
public final class FinderTopicFeedUI extends MMFinderUI implements C9932pb {

    /* renamed from: D */
    public static ConcurrentHashMap<Long, FinderItem> f14881D = new ConcurrentHashMap<>();

    /* renamed from: A */
    public long f14882A;

    /* renamed from: B */
    public final C3082d f14883B = new C3082d();

    /* renamed from: C */
    public float f14884C;

    /* renamed from: o */
    public final String f14885o = "Finder.FinderTopicFeedUI";

    /* renamed from: p */
    public FinderTopicFeedUIContract$TopicFeedPresenter f14886p;

    /* renamed from: q */
    public C9965rb f14887q;

    /* renamed from: r */
    public FinderTopicFeedLoader f14888r;

    /* renamed from: s */
    public C50141kk1 f14889s;

    /* renamed from: t */
    public C52002xp0 f14890t;

    /* renamed from: u */
    public int f14891u;

    /* renamed from: v */
    public RelativeLayout f14892v;

    /* renamed from: w */
    public WeImageView f14893w;

    /* renamed from: x */
    public WeImageView f14894x;

    /* renamed from: y */
    public TextView f14895y;

    /* renamed from: z */
    public long f14896z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$a */
    public final class C3079a implements AppBarLayout.C67445c {
        public C3079a() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            C87412m.m108594g(appBarLayout, "view");
            FinderTopicFeedUI finderTopicFeedUI = FinderTopicFeedUI.this;
            ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderTopicFeedUI.f14881D;
            finderTopicFeedUI.getClass();
            float abs = (((float) Math.abs(i)) * 1.0f) / ((float) appBarLayout.getTotalScrollRange());
            FinderTopicFeedUI finderTopicFeedUI2 = FinderTopicFeedUI.this;
            if (!(abs == finderTopicFeedUI2.f14884C)) {
                finderTopicFeedUI2.f14884C = abs;
                if (abs < 0.5f) {
                    finderTopicFeedUI2.mo3125P7();
                    FinderTopicFeedUI.this.mo3126Q7();
                    return;
                }
                int color = finderTopicFeedUI2.getResources().getColor(C0966R.color.f2929c);
                int i2 = (int) (((abs - 0.5f) / 0.5f) * ((float) 255));
                RelativeLayout relativeLayout = FinderTopicFeedUI.this.f14892v;
                if (relativeLayout != null) {
                    relativeLayout.setBackgroundColor(C74933u4.m89764a(color, i2));
                }
                FinderTopicFeedUI.this.getController().mo177105z0(C74933u4.m89764a(color, i2));
                FinderTopicFeedUI finderTopicFeedUI3 = FinderTopicFeedUI.this;
                WeImageView weImageView = finderTopicFeedUI3.f14894x;
                if (weImageView != null) {
                    weImageView.setIconColor(finderTopicFeedUI3.getResources().getColor(C0966R.color.f3133gi));
                }
                FinderTopicFeedUI finderTopicFeedUI4 = FinderTopicFeedUI.this;
                WeImageView weImageView2 = finderTopicFeedUI4.f14893w;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(finderTopicFeedUI4.getResources().getColor(C0966R.color.f3133gi));
                }
                FinderTopicFeedUI finderTopicFeedUI5 = FinderTopicFeedUI.this;
                TextView textView = finderTopicFeedUI5.f14895y;
                if (textView != null) {
                    textView.setTextColor(finderTopicFeedUI5.getResources().getColor(C0966R.color.f3133gi));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$b */
    public static final class C3080b implements FinderTopicFeedLoader.C2765b {

        /* renamed from: a */
        public final /* synthetic */ FinderTopicFeedUI f14898a;

        /* renamed from: b */
        public final /* synthetic */ long f14899b;

        /* renamed from: c */
        public final /* synthetic */ String f14900c;

        public C3080b(FinderTopicFeedUI finderTopicFeedUI, long j, String str) {
            this.f14898a = finderTopicFeedUI;
            this.f14899b = j;
            this.f14900c = str;
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2816a(te3.C51270sn1 r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI r0 = r7.f14898a
                r1 = 0
                if (r8 == 0) goto L_0x000a
                int r3 = r8.f141619f
                long r3 = (long) r3
                goto L_0x000b
            L_0x000a:
                r3 = r1
            L_0x000b:
                r0.f14896z = r3
                long r3 = r0.f14882A
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 != 0) goto L_0x0019
                if (r8 == 0) goto L_0x0017
                long r1 = r8.f141618e
            L_0x0017:
                r0.f14882A = r1
            L_0x0019:
                long r1 = r7.f14899b
                long r3 = r0.f14882A
                java.lang.String r5 = r7.f14900c
                java.lang.String r6 = "context"
                gy3.C87412m.m108594g(r0, r6)
                java.lang.String r6 = "topicName"
                gy3.C87412m.m108594g(r5, r6)
                bl3.r r6 = bl3.C39818r.f106831a
                bl3.r$a r0 = r6.mo62443b(r0)
                java.lang.Class<rs1.l7> r6 = rs1.C13317l7.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r6)
                rs1.l7 r0 = (rs1.C13317l7) r0
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                java.lang.String r2 = "feedid"
                r0.mo12758c3(r2, r1)
                java.lang.String r1 = o40.C61926c.m72691p(r3)
                java.lang.String r2 = "topicid"
                r0.mo12758c3(r2, r1)
                java.lang.String r1 = "topicname"
                r0.mo12758c3(r1, r5)
                com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI r0 = r7.f14898a
                kf1.rb r1 = r0.f14887q
                r2 = 0
                if (r1 == 0) goto L_0x0094
                android.view.View r1 = r1.mo9289F0()
                r3 = 0
                if (r8 == 0) goto L_0x0062
                int r4 = r8.f141619f
                goto L_0x0063
            L_0x0062:
                r4 = 0
            L_0x0063:
                long r4 = (long) r4
                java.lang.String r4 = er1.C7878t0.m8035d(r4)
                if (r1 == 0) goto L_0x0074
                r2 = 2131315542(0x7f094b56, float:1.824954E38)
                android.view.View r1 = r1.findViewById(r2)
                r2 = r1
                android.widget.TextView r2 = (android.widget.TextView) r2
            L_0x0074:
                if (r2 != 0) goto L_0x0077
                goto L_0x008e
            L_0x0077:
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131830038(0x7f112516, float:1.9293062E38)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r3] = r4
                java.lang.String r0 = r0.getString(r1, r5)
                r2.setText(r0)
            L_0x008e:
                com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI r0 = r7.f14898a
                r0.mo3127o3(r8)
                return
            L_0x0094:
                java.lang.String r8 = "viewCallback"
                gy3.C87412m.m108603p(r8)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI.C3080b.mo2816a(te3.sn1):void");
        }

        public void call(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$c */
    public static final class C3081c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderTopicFeedUI f14901a;

        public C3081c(FinderTopicFeedUI finderTopicFeedUI) {
            this.f14901a = finderTopicFeedUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14901a.getIntent();
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
            Intent intent2 = this.f14901a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$d */
    public static final class C3082d extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$onHellScroller$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$onHellScroller$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$onHellScroller$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "26", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$onHellScroller$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: N7 */
    public static final String m2986N7(FinderTopicFeedUI finderTopicFeedUI) {
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = finderTopicFeedUI.f14886p;
        String str = null;
        if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
            C50985qn1 qn12 = finderTopicFeedUIContract$TopicFeedPresenter.f13403s;
            if (qn12 == null) {
                return finderTopicFeedUIContract$TopicFeedPresenter.f13398n;
            }
            C64726td1 td12 = qn12.f140408e;
            if (td12 != null) {
                return String.valueOf(td12.f185536f);
            }
            AppCompatActivity context = finderTopicFeedUI.getContext();
            Object[] objArr = new Object[1];
            FinderContact finderContact = qn12.f140407d;
            if (finderContact != null) {
                str = finderContact.nickname;
            }
            objArr[0] = str;
            String string = context.getString(C0966R.string.d_x, objArr);
            C87412m.m108593f(string, "{\n                contex…?.nickname)\n            }");
            return string;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m2987O7(com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI r6) {
        /*
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r0 = r6.f14886p
            java.lang.String r1 = "presenter"
            r2 = 0
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.f13398n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0024
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r0 = r6.f14886p
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.mo2637N()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r0 = 0
            goto L_0x0025
        L_0x0020:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.lang.String r3 = r6.f14885o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "notShare "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", "
            r4.append(r5)
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r6 = r6.f14886p
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = r6.f13398n
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            return r0
        L_0x004e:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0052:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI.m2987O7(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI):boolean");
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        if (intExtra == 1) {
            return 22;
        }
        if (intExtra != 4) {
            return intExtra != 5 ? 26 : 64;
        }
        return 49;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    /* renamed from: P7 */
    public final void mo3125P7() {
        RelativeLayout relativeLayout = this.f14892v;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
        }
        WeImageView weImageView = this.f14894x;
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(C0966R.color.BW_BG_100));
        }
        WeImageView weImageView2 = this.f14893w;
        if (weImageView2 != null) {
            weImageView2.setIconColor(getResources().getColor(C0966R.color.BW_BG_100));
        }
        TextView textView = this.f14895y;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.BW_BG_100));
        }
    }

    /* renamed from: Q7 */
    public final void mo3126Q7() {
        getController().mo177049H0(C85875k4.m106211z());
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqq;
    }

    public boolean isHideStatusBar() {
        return true;
    }

    /* renamed from: o3 */
    public void mo3127o3(C51270sn1 sn12) {
        String str;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (sn12 == null || (str = sn12.f141635y) == null) {
            str = "";
        }
        if (str.length() > 0) {
            mo3125P7();
            AppBarLayout appBarLayout = (AppBarLayout) findViewById(C0966R.C0970id.f6071wh);
            C3079a aVar = new C3079a();
            C87412m.m108593f(appBarLayout, "appBarLayout");
            aVar.mo3128a(appBarLayout, 0);
            appBarLayout.mo146159a(aVar);
            ImageView imageView = (ImageView) getContext().findViewById(C0966R.C0970id.bv8);
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) getContext().findViewById(C0966R.C0970id.btv);
            ((RefreshLoadMoreLayout) getContext().findViewById(C0966R.C0970id.ivb)).setSuperNestedScroll(true);
            float dimension = getContext().getResources().getDimension(C0966R.dimen.f3723cd);
            roundedCornerFrameLayout.mo153905b(dimension, dimension, 0.0f, 0.0f);
            ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.C103717e) layoutParams).topMargin = -((int) dimension);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = getContext().getResources().getDimensionPixelSize(C0966R.dimen.a8b);
            imageView.setLayoutParams(layoutParams2);
            ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE))).mo85954d(imageView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01c0 A[SYNTHETIC, Splitter:B:30:0x01c0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x041d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r10 = r38
            java.lang.Class<dp1.y0> r11 = dp1.C58417y0.class
            java.lang.Class<rs1.s8> r12 = rs1.C13442s8.class
            java.lang.Class<l31.e> r13 = l31.C61212e.class
            super.onCreate(r39)
            r0 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r10.overridePendingTransition(r0, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r0 = f14881D
            r0.clear()
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r14 = "key_topic_type"
            r15 = 1
            int r9 = r0.getIntExtra(r14, r15)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "key_topic_extra_type"
            int r8 = r0.getIntExtra(r1, r15)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "key_topic_title"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x003e
            r6 = r7
            goto L_0x003f
        L_0x003e:
            r6 = r0
        L_0x003f:
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "KEY_FOLLOW_ID"
            java.lang.String r5 = r0.getStringExtra(r1)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "KEY_TOPIC_ID"
            r3 = 0
            long r0 = r0.getLongExtra(r1, r3)
            r10.f14882A = r0
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r2 = "key_ref_object_id"
            r16 = r8
            r39 = r9
            long r8 = r0.getLongExtra(r2, r3)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "KEY_TOPIC_NONCE_ID"
            r0.getStringExtra(r1)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r1 = "key_by_pass_info"
            java.lang.String r1 = r0.getStringExtra(r1)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r3 = "KEY_TAB_TYPE"
            r4 = 0
            int r0 = r0.getIntExtra(r3, r4)
            r10.f14891u = r0
            java.lang.String r0 = r10.f14885o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "type:"
            r3.append(r15)
            r15 = r39
            r3.append(r15)
            java.lang.String r4 = ", topicName:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " topicId:"
            r3.append(r4)
            r18 = r13
            r19 = r14
            long r13 = r10.f14882A
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r0 = 2131300632(0x7f091118, float:1.82193E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r10.f14892v = r0
            android.view.Window r0 = r38.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r3 = "this.window.decorView"
            gy3.C87412m.m108593f(r0, r3)
            r3 = 1280(0x500, float:1.794E-42)
            r0.setSystemUiVisibility(r3)
            android.view.Window r0 = r38.getWindow()
            r3 = 0
            r0.setStatusBarColor(r3)
            com.tencent.p014mm.p136ui.C74779i.m89536a(r10, r3)
            androidx.appcompat.app.ActionBar r0 = r38.getSupportActionBar()
            if (r0 == 0) goto L_0x00ee
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r3)
            r0.mo91112w(r4)
            r0.mo91104o()
        L_0x00ee:
            int r0 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r38)
            android.widget.RelativeLayout r3 = r10.f14892v
            if (r3 == 0) goto L_0x0106
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            int r13 = r4.height
            int r13 = r13 + r0
            r4.height = r13
            r3.setLayoutParams(r4)
            r4 = 0
            r3.setPadding(r4, r0, r4, r4)
        L_0x0106:
            androidx.appcompat.app.AppCompatActivity r3 = r38.getContext()
            r4 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            int r13 = r4.height
            int r13 = r13 + r0
            r4.height = r13
            r3.setLayoutParams(r4)
            r38.mo3126Q7()
            r0 = 2131297508(0x7f0904e4, float:1.8212963E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            vf1.m5 r3 = new vf1.m5
            r3.<init>(r10)
            r0.setOnClickListener(r3)
            r0 = 2131297512(0x7f0904e8, float:1.821297E38)
            android.view.View r0 = r10.findViewById(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r10.f14893w = r0
            r0 = 2131309483(0x7f0933ab, float:1.8237251E38)
            android.view.View r0 = r10.findViewById(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r10.f14894x = r0
            r0 = 2131296529(0x7f090111, float:1.8210977E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f14895y = r0
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f14893w
            r3 = 2131100168(0x7f060208, float:1.781271E38)
            if (r0 == 0) goto L_0x0166
            android.content.res.Resources r4 = r38.getResources()
            int r4 = r4.getColor(r3)
            r0.setIconColor(r4)
        L_0x0166:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f14894x
            if (r0 == 0) goto L_0x0175
            android.content.res.Resources r4 = r38.getResources()
            int r4 = r4.getColor(r3)
            r0.setIconColor(r4)
        L_0x0175:
            android.widget.TextView r0 = r10.f14895y
            if (r0 == 0) goto L_0x0184
            android.content.res.Resources r4 = r38.getResources()
            int r3 = r4.getColor(r3)
            r0.setTextColor(r3)
        L_0x0184:
            te3.kk1 r0 = new te3.kk1
            r0.<init>()
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r4 = "KEY_SECTION_INFO"
            byte[] r3 = r3.getByteArrayExtra(r4)
            java.lang.String r4 = "safeParser"
            if (r3 != 0) goto L_0x019a
        L_0x0198:
            r0 = 0
            goto L_0x01aa
        L_0x019a:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x019e }
            goto L_0x01aa
        L_0x019e:
            r0 = move-exception
            r3 = r0
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r14 = 0
            r0[r14] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r7, r0)
            goto L_0x0198
        L_0x01aa:
            r10.f14889s = r0
            te3.xp0 r0 = new te3.xp0
            r0.<init>()
            android.content.Intent r3 = r38.getIntent()
            java.lang.String r14 = "KEY_TOPIC_RSP"
            byte[] r3 = r3.getByteArrayExtra(r14)
            if (r3 != 0) goto L_0x01c0
            r0 = 0
        L_0x01be:
            r14 = 0
            goto L_0x01d0
        L_0x01c0:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01be
        L_0x01c4:
            r0 = move-exception
            r3 = r0
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r14 = 0
            r0[r14] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r7, r0)
            r0 = 0
        L_0x01d0:
            r10.f14890t = r0
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r0 = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r3 = r4.mo62444c(r10)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r12)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r3 = r3.mo12861q3()
            r0.<init>(r15, r6, r3, r1)
            android.content.Intent r1 = r38.getIntent()
            r0.initFromCache(r1)
            r0.f13904q = r5
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$b r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$b
            r1.<init>(r10, r8, r6)
            r0.setInitDone(r1)
            r10.f14888r = r0
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r0 = new com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter
            r1 = 2
            int r3 = r38.mo2194I7()
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r14 = r10.f14888r
            if (r14 == 0) goto L_0x041d
            r0.<init>(r10, r1, r3, r14)
            long r13 = r10.f14882A
            r0.f13397j = r13
            r0.f13398n = r6
            r0.f13396i = r15
            r10.f14886p = r0
            int r1 = r10.f14891u
            r0.f13399o = r1
            kf1.rb r0 = new kf1.rb
            r3 = 2
            int r13 = r38.mo2194I7()
            r14 = 0
            r20 = 0
            r21 = 24
            r22 = 0
            r1 = r0
            r23 = r2
            r2 = r38
            r24 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r14 = r6
            r6 = r20
            r17 = r7
            r7 = r38
            r25 = r8
            r9 = r16
            r8 = r21
            r16 = r12
            r12 = r9
            r9 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f30629E = r14
            r0.f30627C = r15
            r0.f30628D = r12
            r0.f30630F = r13
            long r1 = r10.f14882A
            r0.f30632H = r1
            r10.f14887q = r0
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = r10.f14886p
            java.lang.String r2 = "presenter"
            if (r1 == 0) goto L_0x0418
            r0.mo10355Y0(r1)
            kf1.rb r0 = r10.f14887q
            java.lang.String r1 = "viewCallback"
            if (r0 == 0) goto L_0x0413
            te3.xp0 r3 = r10.f14890t
            if (r3 != 0) goto L_0x0267
            r4 = 1
            goto L_0x0268
        L_0x0267:
            r4 = 0
        L_0x0268:
            r0.f30637M = r4
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r3 = r10.f14886p
            if (r3 == 0) goto L_0x040e
            if (r0 == 0) goto L_0x0409
            r3.mo2525t(r0)
            te3.xp0 r0 = r10.f14890t
            if (r0 == 0) goto L_0x02de
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r3 = r10.f14886p
            if (r3 == 0) goto L_0x02d9
            te3.kk1 r4 = r10.f14889s
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f r5 = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f
            r6 = 0
            r7 = 0
            r5.<init>(r6, r6, r7, r7)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r7 = r3.f30175e
            com.tencent.mm.plugin.finder.feed.model.w0 r7 = r7.getCache()
            if (r7 == 0) goto L_0x028f
            pe3.b r7 = r7.f14080b
            goto L_0x0290
        L_0x028f:
            r7 = 0
        L_0x0290:
            r5.setLastBuffer(r7)
            long r7 = r0.f144788g
            r5.f13925b = r7
            er1.w3 r7 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r8 = r3.f30175e
            com.tencent.mm.plugin.finder.feed.model.w0 r8 = r8.getCache()
            if (r8 == 0) goto L_0x02a6
            java.util.ArrayList<cm1.i2> r8 = r8.f14079a
            if (r8 == 0) goto L_0x02a6
            goto L_0x02a8
        L_0x02a6:
            sx3.f0 r8 = sx3.C64186f0.f181907d
        L_0x02a8:
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r9 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.util.List r7 = r7.mo83922d0(r8, r9)
            r5.setIncrementList(r7)
            r7 = 1
            r5.setHasMore(r7)
            te3.pq3 r8 = r0.f144791j
            r5.f13926c = r8
            r5.setPullType(r7)
            te3.gf3 r0 = r0.f144792n
            if (r0 == 0) goto L_0x02c4
            java.lang.String r7 = r0.f134025d
            if (r7 != 0) goto L_0x02c6
        L_0x02c4:
            r7 = r17
        L_0x02c6:
            r5.f13927d = r7
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r3.f30175e
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader"
            gy3.C87412m.m108592e(r0, r7)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r0 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader) r0
            r0.f13902o = r4
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r3.f30175e
            r0.onFetchDone(r5)
            goto L_0x02df
        L_0x02d9:
            gy3.C87412m.m108603p(r2)
            r1 = 0
            throw r1
        L_0x02de:
            r6 = 0
        L_0x02df:
            qo3.n r0 = new qo3.n
            r0.<init>((android.content.Context) r10, (int) r6, (boolean) r6)
            vf1.n5 r3 = new vf1.n5
            r3.<init>(r10)
            r0.f225771i = r3
            vf1.o5 r3 = new vf1.o5
            r3.<init>(r10)
            r0.f225782p = r3
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r3 = r10.f14886p
            if (r3 == 0) goto L_0x0404
            int r2 = r3.f13396i
            r3 = 4
            if (r2 != r3) goto L_0x0309
            vf1.p5 r2 = new vf1.p5
            r2.<init>(r10)
            r0.f225773j = r2
            vf1.q5 r2 = new vf1.q5
            r2.<init>(r10)
            r0.f225787r = r2
        L_0x0309:
            vf1.r5 r2 = vf1.C14822r5.f40817a
            r0.f225761d = r2
            r2 = 2131309481(0x7f0933a9, float:1.8237247E38)
            android.view.View r2 = r10.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            vf1.s5 r4 = new vf1.s5
            r4.<init>(r0)
            r2.setOnClickListener(r4)
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r2 = "key_report_scene"
            int r0 = r0.getIntExtra(r2, r6)
            java.lang.String r2 = "context"
            if (r0 == 0) goto L_0x038c
            android.content.Intent r4 = r38.getIntent()
            java.lang.String r5 = "key_from_user"
            java.lang.String r7 = r4.getStringExtra(r5)
            if (r7 != 0) goto L_0x033a
            r7 = r17
        L_0x033a:
            di3.d r4 = di3.C86312j.m106911c(r11)
            dp1.y0 r4 = (dp1.C58417y0) r4
            r4.ly0(r0, r7, r14, r15)
            android.content.Intent r4 = r38.getIntent()
            r5 = r19
            r6 = 1
            int r4 = r4.getIntExtra(r5, r6)
            if (r4 != r3) goto L_0x038c
            di3.d r3 = di3.C86312j.m106911c(r11)
            r27 = r3
            dp1.y0 r27 = (dp1.C58417y0) r27
            android.content.Intent r3 = r38.getIntent()
            r4 = r23
            r5 = 0
            long r28 = r3.getLongExtra(r4, r5)
            r31 = 4
            r34 = 0
            r35 = 2
            r36 = 0
            androidx.appcompat.app.AppCompatActivity r3 = r38.getContext()
            gy3.C87412m.m108593f(r3, r2)
            r2 = r24
            bl3.r$a r2 = r2.mo62444c(r3)
            r3 = r16
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            java.lang.String r2 = r2.f38098n
            r30 = r0
            r33 = r7
            r37 = r2
            r27.iy0(r28, r30, r31, r33, r34, r35, r36, r37)
        L_0x038c:
            kf1.rb r0 = r10.f14887q
            if (r0 == 0) goto L_0x03ff
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$d r1 = r10.f14883B
            r0.mo17043c(r1)
            long r0 = r10.f14882A
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62443b(r10)
            java.lang.Class<rs1.l7> r3 = rs1.C13317l7.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.l7 r2 = (rs1.C13317l7) r2
            java.lang.String r3 = o40.C61926c.m72691p(r25)
            java.lang.String r4 = "feedid"
            r2.mo12758c3(r4, r3)
            java.lang.String r0 = o40.C61926c.m72691p(r0)
            java.lang.String r1 = "topicid"
            r2.mo12758c3(r1, r0)
            java.lang.String r0 = "topicname"
            r2.mo12758c3(r0, r14)
            di3.d r0 = di3.C86312j.m106911c(r18)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.FinderTopicFeedUI
            r0.mo86178qr(r10, r1)
            di3.d r0 = di3.C86312j.m106911c(r18)
            l31.e r0 = (l31.C61212e) r0
            o31.a r1 = o31.C76986a.Finder
            r0.mo86179qs(r10, r1)
            di3.d r0 = di3.C86312j.m106911c(r18)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r1 = "FinderTopicFeedUI"
            r0.mo86136FZ(r10, r1)
            di3.d r0 = di3.C86312j.m106911c(r18)
            l31.e r0 = (l31.C61212e) r0
            r1 = 168(0xa8, float:2.35E-43)
            r2 = 24184(0x5e78, float:3.3889E-41)
            r0.mo86148No(r10, r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r18)
            l31.e r0 = (l31.C61212e) r0
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$c r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI$c
            r1.<init>(r10)
            r0.E60(r10, r1)
            return
        L_0x03ff:
            gy3.C87412m.m108603p(r1)
            r3 = 0
            throw r3
        L_0x0404:
            r3 = 0
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0409:
            r3 = 0
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x040e:
            r3 = 0
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0413:
            r3 = 0
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x0418:
            r3 = 0
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x041d:
            r3 = 0
            java.lang.String r0 = "feedLoader"
            gy3.C87412m.m108603p(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f14886p;
        if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
            finderTopicFeedUIContract$TopicFeedPresenter.onDetach();
            f14881D.clear();
            C9965rb rbVar = this.f14887q;
            if (rbVar != null) {
                rbVar.getRecyclerView().mo17098m1(this.f14883B);
                super.onDestroy();
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "26", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "26", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f14886p;
        if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
            finderTopicFeedUIContract$TopicFeedPresenter.mo2514G();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
