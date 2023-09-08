package kf1;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0794y0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C7435f2;
import er1.C7919x;
import fy3.C32224a;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import he1.C8514s;
import ht1.C60171g1;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13354o6;
import rs1.C13442s8;
import rs1.C13539y3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import wc1.C15064b;
import zp3.C16389w;

/* renamed from: kf1.n5 */
public final class C9868n5 {

    /* renamed from: a */
    public final MMActivity f30449a;

    /* renamed from: b */
    public final C2829n f30450b;

    /* renamed from: c */
    public RefreshLoadMoreLayout f30451c;

    /* renamed from: d */
    public WxRecyclerAdapter<?> f30452d;

    /* renamed from: e */
    public final C0794y0 f30453e = new C0794y0();

    /* renamed from: f */
    public final C13601g f30454f = C36568h.m40985a(new C9870b(this));

    /* renamed from: g */
    public final C13601g f30455g = C36568h.m40985a(new C9871c(this));

    /* renamed from: h */
    public final C9869a f30456h = new C9869a(this);

    /* renamed from: kf1.n5$b */
    public static final class C9870b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C9868n5 f30459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9870b(C9868n5 n5Var) {
            super(0);
            this.f30459d = n5Var;
        }

        public Object invoke() {
            if (((C13354o6) C39818r.f106831a.mo62444c(this.f30459d.f30449a).mo75002a(C13354o6.class)).mo12778c3()) {
                View findViewById = this.f30459d.f30449a.findViewById(C0966R.C0970id.nmj);
                View findViewById2 = findViewById.findViewById(C0966R.C0970id.nof);
                C87412m.m108593f(findViewById2, "findViewById<TextView>(R.id.new_style_replay_tv)");
                C7919x.m8091a((TextView) findViewById2);
                View findViewById3 = findViewById.findViewById(C0966R.C0970id.noe);
                C87412m.m108593f(findViewById3, "findViewById<TextView>(R…d.new_style_play_next_tv)");
                C7919x.m8091a((TextView) findViewById3);
                return findViewById;
            }
            View findViewById4 = this.f30459d.f30449a.findViewById(C0966R.C0970id.n9r);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById4;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$endHintLayout$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$endHintLayout$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = findViewById4.findViewById(C0966R.C0970id.na5);
            C87412m.m108593f(findViewById5, "findViewById<TextView>(R…ng_video_end_hint_header)");
            C7919x.m8091a((TextView) findViewById5);
            C15064b bVar = C15064b.f41199a;
            View findViewById6 = findViewById4.findViewById(C0966R.C0970id.na5);
            C87412m.m108593f(findViewById6, "findViewById<TextView>(R…ng_video_end_hint_header)");
            bVar.mo14080e((TextView) findViewById6, 12.0f);
            View findViewById7 = findViewById4.findViewById(C0966R.C0970id.na8);
            C87412m.m108593f(findViewById7, "findViewById<TextView>(R…video_end_hint_replay_tv)");
            C7919x.m8091a((TextView) findViewById7);
            View findViewById8 = findViewById4.findViewById(C0966R.C0970id.na8);
            C87412m.m108593f(findViewById8, "findViewById<TextView>(R…video_end_hint_replay_tv)");
            bVar.mo14080e((TextView) findViewById8, 14.0f);
            View findViewById9 = findViewById4.findViewById(C0966R.C0970id.na6);
            C87412m.m108593f(findViewById9, "findViewById<TextView>(R…video_end_hint_play_next)");
            C7919x.m8091a((TextView) findViewById9);
            View findViewById10 = findViewById4.findViewById(C0966R.C0970id.na6);
            C87412m.m108593f(findViewById10, "findViewById<TextView>(R…video_end_hint_play_next)");
            bVar.mo14080e((TextView) findViewById10, 14.0f);
            View findViewById11 = findViewById4.findViewById(C0966R.C0970id.f358636na3);
            C87412m.m108593f(findViewById11, "findViewById<TextView>(R.id.long_video_desc_tv)");
            bVar.mo14080e((TextView) findViewById11, 15.0f);
            View findViewById12 = findViewById4.findViewById(C0966R.C0970id.naf);
            C87412m.m108593f(findViewById12, "findViewById<TextView>(R…d.long_video_nickname_tv)");
            bVar.mo14080e((TextView) findViewById12, 12.0f);
            View findViewById13 = findViewById4.findViewById(C0966R.C0970id.na9);
            C87412m.m108593f(findViewById13, "findViewById<TextView>(R…ong_video_friend_hint_tv)");
            bVar.mo14080e((TextView) findViewById13, 12.0f);
            return findViewById4;
        }
    }

    /* renamed from: kf1.n5$c */
    public static final class C9871c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C9868n5 f30460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9871c(C9868n5 n5Var) {
            super(0);
            this.f30460d = n5Var;
        }

        public Object invoke() {
            return this.f30460d.f30449a.findViewById(C0966R.C0970id.m1o);
        }
    }

    /* renamed from: kf1.n5$d */
    public static final class C9872d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f30461d;

        /* renamed from: e */
        public final /* synthetic */ C9868n5 f30462e;

        public C9872d(C60905o oVar, C9868n5 n5Var) {
            this.f30461d = oVar;
            this.f30462e = n5Var;
        }

        public final void onClick(View view) {
            C59670o2 videoView;
            Class cls = C13539y3.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f30461d.mo85812D(C0966R.C0970id.d7a);
            C49712hj1 hj12 = null;
            if (!(finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null)) {
                C60905o oVar = this.f30461d;
                C9868n5 n5Var = this.f30462e;
                videoView.setVideoViewFocused(true);
                C60171g1.C8767a.m8577a(videoView, (Integer) null, 1, (Object) null);
                MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8);
                if (megaVideoBulletView != null) {
                    C61926c.m72668M(new C8514s(megaVideoBulletView));
                }
                MegaVideoBulletView megaVideoBulletView2 = (MegaVideoBulletView) ((C13539y3) C39818r.f106831a.mo62444c(n5Var.f30449a).mo75002a(cls)).mo12947e3().findViewById(C0966R.C0970id.mq8);
                if (megaVideoBulletView2 != null) {
                    C61926c.m72668M(new C8514s(megaVideoBulletView2));
                }
                if (videoView instanceof FinderThumbPlayerProxy) {
                    FinderThumbPlayerProxy finderThumbPlayerProxy = (FinderThumbPlayerProxy) videoView;
                    finderThumbPlayerProxy.setPlaySpeed(finderThumbPlayerProxy.getPlaySpeedRatio());
                }
            }
            View a = this.f30462e.mo10407a();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = a;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View entHintLayout = ((C13539y3) C39818r.f106831a.mo62444c(this.f30462e.f30449a).mo75002a(cls)).mo12947e3().getEntHintLayout();
            if (entHintLayout != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = entHintLayout;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                entHintLayout.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30462e.f30449a);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            JSONObject jSONObject = new JSONObject();
            C9868n5 n5Var2 = this.f30462e;
            C60905o oVar2 = this.f30461d;
            jSONObject.put("first_feedid", C61926c.m72691p(n5Var2.f30450b.f14124t));
            jSONObject.put("feedid", C61926c.m72691p(((C0740i2) oVar2.f173503E).getItemId()));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(hj12, "feed_replay", 1, jSONObject);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.n5$e */
    public static final class C9873e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f30463d;

        public C9873e(C32224a<C13598b0> aVar) {
            this.f30463d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f30463d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.n5$f */
    public static final class C9874f implements View.OnClickListener {

        /* renamed from: d */
        public static final C9874f f30464d = new C9874f();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9868n5(MMActivity mMActivity, C2829n nVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(nVar, "presenter");
        this.f30449a = mMActivity;
        this.f30450b = nVar;
        View findViewById = mMActivity.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
        this.f30451c = (RefreshLoadMoreLayout) findViewById;
    }

    /* renamed from: a */
    public final View mo10407a() {
        Object value = ((C36570n) this.f30454f).getValue();
        C87412m.m108593f(value, "<get-endHintLayout>(...)");
        return (View) value;
    }

    /* renamed from: b */
    public final void mo10408b(int i) {
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f30452d;
        if (wxRecyclerAdapter == null) {
            C87412m.m108603p("adapter");
            throw null;
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(i + wxRecyclerAdapter.mo85796c6());
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo10409c(boolean z) {
        View findViewById = this.f30449a.findViewById(C0966R.C0970id.nah);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x02b0  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10410d(android.view.View r24, jq3.C60905o r25, cm1.C55018j0 r26, fy3.C32224a<rx3.C13598b0> r27) {
        /*
            r23 = this;
            r0 = r23
            r9 = r24
            pl1.e0$a r10 = pl1.C11978e0.C11979a.COMMON
            up1.y r11 = up1.C27696y.RAW_IMAGE
            java.lang.Class<pl1.s0> r12 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r13 = ht1.C60200t1.class
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r15 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r1)
            java.lang.Object[] r2 = r14.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback"
            java.lang.String r4 = "updateEndHintLayout"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r14.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback"
            java.lang.String r3 = "updateEndHintLayout"
            java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2131308188(0x7f092e9c, float:1.8234625E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r26.mo3513o()
            android.text.SpannableString r2 = r2.getNickNameSpan()
            r1.setText(r2)
            r1 = 2131308185(0x7f092e99, float:1.8234618E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r26.mo3513o()
            int r2 = r2.getLikeCount()
            if (r2 <= 0) goto L_0x0087
            r2 = 2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r26.mo3513o()
            int r3 = r3.getLikeCount()
            java.lang.String r2 = er1.C7878t0.m8034c(r2, r3)
            goto L_0x0089
        L_0x0087:
            java.lang.String r2 = "0"
        L_0x0089:
            r1.setText(r2)
            r1 = 2131308174(0x7f092e8e, float:1.8234596E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r26.mo3513o()
            java.lang.String r2 = r2.getDescription()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            java.lang.String r7 = ""
            r8 = 8
            if (r2 != 0) goto L_0x00b6
            r1.setVisibility(r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r26.mo3513o()
            android.text.SpannableString r2 = r2.getDescriptionSpan()
            r1.setText(r2)
            goto L_0x00bc
        L_0x00b6:
            r1.setVisibility(r8)
            r1.setText(r7)
        L_0x00bc:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r26.mo3513o()
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            r2 = r1
            te3.rq2 r2 = (te3.C64689rq2) r2
            r1 = 2131308172(0x7f092e8c, float:1.8234592E38)
            android.view.View r1 = r9.findViewById(r1)
            r14 = r1
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            if (r14 == 0) goto L_0x01d7
            java.lang.String r1 = r2.f185261W
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r3 = "Finder.Loader"
            if (r1 != 0) goto L_0x0131
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "updateEndHintLayout: use full cover url, feedId="
            r1.append(r4)
            long r4 = r26.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            pl1.q0 r6 = new pl1.q0
            r4 = 0
            r5 = 4
            r16 = 0
            r1 = r6
            r3 = r11
            r8 = r6
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r13)
            bl3.c r1 = r1.mo62447c(r12)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11871f2()
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r13)
            bl3.c r2 = r2.mo62447c(r12)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r10)
            r1.mo85957c(r8, r14, r2)
            goto L_0x01d7
        L_0x0131:
            java.lang.String r1 = r2.f185283w
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0184
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "updateEndHintLayout: use cover url, feedId="
            r1.append(r4)
            long r4 = r26.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            pl1.o0 r8 = new pl1.o0
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r13)
            bl3.c r1 = r1.mo62447c(r12)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11871f2()
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r13)
            bl3.c r2 = r2.mo62447c(r12)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r10)
            r1.mo85957c(r8, r14, r2)
            goto L_0x01d7
        L_0x0184:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "updateEndHintLayout: use thumb url, feedId="
            r1.append(r4)
            long r4 = r26.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            pl1.b0 r1 = new pl1.b0
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r1
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r13)
            bl3.c r2 = r2.mo62447c(r12)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r13)
            bl3.c r3 = r3.mo62447c(r12)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r10)
            r2.mo85957c(r1, r14, r3)
        L_0x01d7:
            r1 = 2131308180(0x7f092e94, float:1.8234608E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r26.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.ek1 r2 = r2.flow_card_recommand_reason
            if (r2 == 0) goto L_0x01f2
            java.lang.String r2 = r2.f132981d
            if (r2 != 0) goto L_0x01f1
            goto L_0x01f2
        L_0x01f1:
            r7 = r2
        L_0x01f2:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x01ff
            r1.setText(r7)
            r1.setVisibility(r15)
            goto L_0x0204
        L_0x01ff:
            r2 = 8
            r1.setVisibility(r2)
        L_0x0204:
            r1 = 2131308184(0x7f092e98, float:1.8234616E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setVisibility(r15)
            wp1.j r2 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r26.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r3 = r3.objectType
            te3.if1 r2 = r2.mo14351c(r3)
            r3 = 2131099940(0x7f060124, float:1.7812247E38)
            r4 = 1
            if (r2 == 0) goto L_0x026f
            java.lang.String r5 = r2.f135279y
            if (r5 == 0) goto L_0x0233
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0231
            goto L_0x0233
        L_0x0231:
            r5 = 0
            goto L_0x0234
        L_0x0233:
            r5 = 1
        L_0x0234:
            if (r5 == 0) goto L_0x0237
            goto L_0x026f
        L_0x0237:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r13)
            bl3.c r4 = r4.mo62447c(r12)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11871f2()
            pl1.n0 r5 = new pl1.n0
            java.lang.String r2 = r2.f135279y
            r5.<init>(r2, r11)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r6 = r6.mo62446e(r13)
            bl3.c r6 = r6.mo62447c(r12)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r2 = r6.mo11867O2(r2)
            r4.mo85957c(r5, r1, r2)
            com.tencent.mm.ui.MMActivity r2 = r0.f30449a
            int r2 = kg3.C76577a.m92153d(r2, r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r2, r3)
            goto L_0x0293
        L_0x026f:
            er1.w3 r2 = er1.C58784w3.f168295a
            java.lang.Integer r2 = r2.mo83917b0(r4, r4)
            if (r2 == 0) goto L_0x027c
            int r2 = r2.intValue()
            goto L_0x027f
        L_0x027c:
            r2 = 2131756066(0x7f100422, float:1.914303E38)
        L_0x027f:
            com.tencent.mm.ui.MMActivity r4 = r0.f30449a
            android.content.res.Resources r5 = r4.getResources()
            int r3 = r5.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r2, r3)
            r1.setImageDrawable(r2)
            r1.setEnabled(r15)
        L_0x0293:
            com.tencent.mm.plugin.finder.storage.FeedData$a r1 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            r2 = r26
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.mo78883a(r2)
            r2 = 2131308175(0x7f092e8f, float:1.8234598E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x02b2
            int r15 = r1.f185269g
        L_0x02b2:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r15)
            r2.setText(r1)
            r1 = 2131308178(0x7f092e92, float:1.8234604E38)
            android.view.View r1 = r9.findViewById(r1)
            kf1.n5$d r2 = new kf1.n5$d
            r3 = r25
            r2.<init>(r3, r0)
            r1.setOnClickListener(r2)
            r1 = 2131308177(0x7f092e91, float:1.8234602E38)
            android.view.View r1 = r9.findViewById(r1)
            kf1.n5$e r2 = new kf1.n5$e
            r3 = r27
            r2.<init>(r3)
            r1.setOnClickListener(r2)
            kf1.n5$f r1 = kf1.C9868n5.C9874f.f30464d
            r9.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9868n5.mo10410d(android.view.View, jq3.o, cm1.j0, fy3.a):void");
    }

    /* renamed from: kf1.n5$a */
    public static final class C9869a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30457d;

        /* renamed from: e */
        public final /* synthetic */ C9868n5 f30458e;

        public C9869a(C9868n5 n5Var) {
            this.f30458e = n5Var;
            this.f30457d = n5Var.f30451c;
        }

        public void onChanged() {
            this.f30457d.onChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            C9868n5 n5Var = this.f30458e;
            RefreshLoadMoreLayout refreshLoadMoreLayout = n5Var.f30451c;
            WxRecyclerAdapter<?> wxRecyclerAdapter = n5Var.f30452d;
            if (wxRecyclerAdapter != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + wxRecyclerAdapter.mo85796c6(), i2);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            C9868n5 n5Var = this.f30458e;
            RefreshLoadMoreLayout refreshLoadMoreLayout = n5Var.f30451c;
            WxRecyclerAdapter<?> wxRecyclerAdapter = n5Var.f30452d;
            if (wxRecyclerAdapter != null) {
                refreshLoadMoreLayout.onItemRangeInserted(i + wxRecyclerAdapter.mo85796c6(), i2);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            C9868n5 n5Var = this.f30458e;
            RefreshLoadMoreLayout refreshLoadMoreLayout = n5Var.f30451c;
            WxRecyclerAdapter<?> wxRecyclerAdapter = n5Var.f30452d;
            if (wxRecyclerAdapter != null) {
                refreshLoadMoreLayout.onItemRangeMoved(i + wxRecyclerAdapter.mo85796c6(), i2, i3);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            C9868n5 n5Var = this.f30458e;
            RefreshLoadMoreLayout refreshLoadMoreLayout = n5Var.f30451c;
            WxRecyclerAdapter<?> wxRecyclerAdapter = n5Var.f30452d;
            if (wxRecyclerAdapter != null) {
                refreshLoadMoreLayout.onItemRangeRemoved(i + wxRecyclerAdapter.mo85796c6(), i2);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30457d.onPreFinishLoadMoreSmooth(cVar);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            C9868n5 n5Var = this.f30458e;
            RefreshLoadMoreLayout refreshLoadMoreLayout = n5Var.f30451c;
            WxRecyclerAdapter<?> wxRecyclerAdapter = n5Var.f30452d;
            if (wxRecyclerAdapter != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + wxRecyclerAdapter.mo85796c6(), i2, obj);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
    }
}
