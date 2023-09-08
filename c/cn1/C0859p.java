package cn1;

import ak1.C54059a;
import ak1.C54067f0;
import an1.C0093f;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9496f;
import jq3.C9499g;
import ln1.C10584f;
import mm1.C10934a;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64273c21;
import xm1.C15826d;
import xm1.C15828e;
import xm1.C15829e0;
import ym1.C16052a;
import z04.C112551y;
import zm1.C16299c;

/* renamed from: cn1.p */
public class C0859p extends C60896i<C0093f> {

    /* renamed from: e */
    public final C15829e0 f2036e;

    /* renamed from: f */
    public final C15828e f2037f;

    /* renamed from: g */
    public C54059a f2038g = new C54059a();

    /* renamed from: h */
    public C16052a f2039h;

    /* renamed from: i */
    public C49712hj1 f2040i;

    /* renamed from: cn1.p$a */
    public final class C0860a {

        /* renamed from: a */
        public WxRecyclerView f2041a;

        /* renamed from: b */
        public C15829e0.C15830a f2042b;

        /* renamed from: c */
        public RecyclerView.C0130p f2043c;

        /* renamed from: d */
        public Application.ActivityLifecycleCallbacks f2044d;

        public C0860a(C0859p pVar) {
        }
    }

    /* renamed from: cn1.p$b */
    public static final class C0861b extends C9499g<C9493c> {

        /* renamed from: a */
        public final /* synthetic */ C60905o f2045a;

        /* renamed from: b */
        public final /* synthetic */ C0859p f2046b;

        public C0861b(C60905o oVar, C0859p pVar) {
            this.f2045a = oVar;
            this.f2046b = pVar;
        }

        /* renamed from: b */
        public void mo752b(Set<C9494d<C9493c>> set) {
            Context context;
            String str;
            String num;
            FinderItem o;
            C64273c21 liveInfo;
            FinderItem o2;
            FinderObject feedObject;
            FinderContact finderContact;
            Set<C9494d<C9493c>> set2 = set;
            C87412m.m108594g(set2, "recordsSet");
            Log.m105924i("Finder.HeadLivingListConvert", "onExposeTimeRecorded: size = " + set.size());
            C0859p pVar = this.f2046b;
            for (C9494d dVar : set) {
                pVar.getClass();
                View view = dVar.f29668f;
                if (!(view == null || (context = view.getContext()) == null)) {
                    C39818r rVar = C39818r.f106831a;
                    C10584f fVar = (C10584f) rVar.mo62443b(context).mo75002a(C10584f.class);
                    if (fVar != null) {
                        C104289g gVar = new C104289g();
                        gVar.mo145967r("page_index", Integer.valueOf(fVar.f31922d));
                        gVar.mo145967r("card_index", Integer.valueOf(dVar.f29667e));
                        T t = dVar.f29663a;
                        BaseFinderFeed baseFinderFeed = null;
                        BaseFinderFeed baseFinderFeed2 = t instanceof BaseFinderFeed ? (BaseFinderFeed) t : null;
                        if (baseFinderFeed2 == null || (o2 = baseFinderFeed2.mo3513o()) == null || (feedObject = o2.getFeedObject()) == null || (finderContact = feedObject.contact) == null || (str = finderContact.username) == null) {
                            str = "";
                        }
                        gVar.mo145967r("username", str);
                        T t2 = dVar.f29663a;
                        BaseFinderFeed baseFinderFeed3 = t2 instanceof BaseFinderFeed ? (BaseFinderFeed) t2 : null;
                        gVar.mo145967r("liveid", (baseFinderFeed3 == null || (o = baseFinderFeed3.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? "" : Long.valueOf(liveInfo.f182392d));
                        C16052a aVar = pVar.f2039h;
                        String d = aVar != null ? aVar.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose") : null;
                        C49712hj1 hj12 = pVar.f2040i;
                        String str2 = hj12 != null ? hj12.f134671e : null;
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                        boolean z = false;
                        fVar.mo10841c3(d, str2, "main_page_focus_card", C112551y.m153814n(gVar2, ",", ";", false));
                        C104289g gVar3 = new C104289g();
                        gVar3.mo145967r("main_page_position", 1);
                        if (fVar.f31930o != 0) {
                            String str3 = fVar.f31931p;
                            if (str3 == null || str3.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                gVar3.mo145967r("pull_liveid", Long.valueOf(fVar.f31930o));
                                gVar3.mo145967r("pull_commentsence", fVar.f31931p);
                            }
                        }
                        T t3 = dVar.f29663a;
                        if (t3 instanceof BaseFinderFeed) {
                            baseFinderFeed = (BaseFinderFeed) t3;
                        }
                        BaseFinderFeed baseFinderFeed4 = baseFinderFeed;
                        if (baseFinderFeed4 != null) {
                            C54059a aVar2 = pVar.f2038g;
                            int i = dVar.f29667e;
                            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                            C13442s8 s8Var = (C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class);
                            String str4 = (s8Var == null || (num = Integer.valueOf(s8Var.f38096i).toString()) == null) ? "" : num;
                            String gVar4 = gVar3.toString();
                            C87412m.m108593f(gVar4, "chnlExtra.toString()");
                            aVar2.mo74735d(baseFinderFeed4, i, qVar, str4, "", gVar4);
                        }
                    }
                }
            }
            C15826d dVar2 = C15826d.f42633a;
            Context context2 = this.f2045a.f44854d.getContext();
            C87412m.m108593f(context2, "holder.itemView.context");
            dVar2.mo14505a(context2, set2);
        }

        /* renamed from: c */
        public void mo753c(C9494d<C9493c> dVar) {
            C87412m.m108594g(dVar, "item");
        }
    }

    /* renamed from: cn1.p$c */
    public static final class C0862c extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C0862c f2047d = new C0862c();

        public C0862c() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            Context context = view.getContext();
            if (!(context instanceof MMActivity) || ((MMActivity) context).isPaused()) {
                return Boolean.FALSE;
            }
            C10934a aVar = C10934a.f32583a;
            boolean z = false;
            boolean z2 = !aVar.mo11134c(0, view, 0.5f);
            boolean z3 = !aVar.mo11134c(1, view, 0.5f);
            if (z2 && z3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C0859p(C15829e0 e0Var, C15828e eVar) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
        this.f2036e = e0Var;
        this.f2037f = eVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cnc;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r29, jq3.C9493c r30, int r31, int r32, boolean r33, java.util.List r34) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            an1.f r2 = (an1.C0093f) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            r28.mo771j(r29)
            cn1.p$a r3 = new cn1.p$a
            r3.<init>(r0)
            r4 = 2131312687(0x7f09402f, float:1.824375E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
            r3.f2041a = r4
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            te3.a91 r7 = r2.f530d
            java.lang.String r7 = r7.f130379f
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x003a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r7 = 0
            goto L_0x003b
        L_0x003a:
            r7 = 1
        L_0x003b:
            r10 = 2131305882(0x7f09259a, float:1.8229947E38)
            r11 = 8
            r12 = 0
            if (r7 == 0) goto L_0x008b
            android.view.View r5 = r1.mo85812D(r10)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r6.mo10233c(r7)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r16 = "setSpanView"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r15 = "setSpanView"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01ed
        L_0x008b:
            android.view.View r7 = r1.mo85812D(r10)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r13)
            java.lang.Object[] r21 = r10.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r23 = "setSpanView"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r7
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7.setVisibility(r10)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r22 = "setSpanView"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            te3.a91 r7 = r2.f530d
            java.lang.String r7 = r7.f130380g
            if (r7 == 0) goto L_0x00e5
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00e0
            r7 = 1
            goto L_0x00e1
        L_0x00e0:
            r7 = 0
        L_0x00e1:
            if (r7 != r9) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            r10 = 2131306810(0x7f09293a, float:1.823183E38)
            r13 = 2131306811(0x7f09293b, float:1.8231832E38)
            if (r7 == 0) goto L_0x0142
            android.view.View r7 = r1.mo85812D(r10)
            if (r7 != 0) goto L_0x00f5
            goto L_0x0135
        L_0x00f5:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r14)
            java.lang.Object[] r15 = r10.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r17 = "setSpanView"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7.setVisibility(r10)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r16 = "setSpanView"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0135:
            android.view.View r7 = r1.mo85812D(r13)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 != 0) goto L_0x013e
            goto L_0x0195
        L_0x013e:
            r7.setVisibility(r11)
            goto L_0x0195
        L_0x0142:
            android.view.View r7 = r1.mo85812D(r10)
            if (r7 != 0) goto L_0x0149
            goto L_0x0189
        L_0x0149:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r11)
            java.lang.Object[] r15 = r10.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r17 = "setSpanView"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7.setVisibility(r10)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/HeadLivingListConvert"
            java.lang.String r16 = "setSpanView"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/HeadLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0189:
            android.view.View r7 = r1.mo85812D(r13)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 != 0) goto L_0x0192
            goto L_0x0195
        L_0x0192:
            r7.setVisibility(r8)
        L_0x0195:
            android.view.View r7 = r1.mo85812D(r13)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x01db
            te3.a91 r10 = r2.f530d
            java.lang.String r10 = r10.f130380g
            if (r10 == 0) goto L_0x01db
            int r11 = r10.length()
            if (r11 <= 0) goto L_0x01ab
            r11 = 1
            goto L_0x01ac
        L_0x01ab:
            r11 = 0
        L_0x01ac:
            if (r11 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            r10 = r12
        L_0x01b0:
            if (r10 == 0) goto L_0x01db
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r13 = r11.mo62446e(r6)
            bl3.c r13 = r13.mo62447c(r5)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11872i2()
            pl1.f r14 = new pl1.f
            r15 = 2
            r14.<init>(r10, r12, r15, r12)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r6 = r11.mo62446e(r6)
            bl3.c r5 = r6.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r10)
            r13.mo85957c(r14, r7, r5)
        L_0x01db:
            r5 = 2131306809(0x7f092939, float:1.8231828E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x01ed
            te3.a91 r6 = r2.f530d
            java.lang.String r6 = r6.f130379f
            r5.setText(r6)
        L_0x01ed:
            android.view.View r5 = r1.f44854d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams
            if (r6 == 0) goto L_0x01fb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r5
            r5.f44911i = r9
        L_0x01fb:
            zm1.c r5 = new zm1.c
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory r6 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory
            android.content.Context r7 = r1.f173499A
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r7, r10)
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            r6.<init>(r7, r8, r8, r8)
            java.util.ArrayList<cm1.i2> r7 = r2.f531e
            r5.<init>(r6, r7)
            cn1.t r6 = new cn1.t
            r6.<init>(r2, r0, r4)
            r5.f173488o = r6
            if (r4 != 0) goto L_0x021a
            goto L_0x021d
        L_0x021a:
            r4.setAdapter(r5)
        L_0x021d:
            java.util.ArrayList<cm1.i2> r6 = r2.f531e
            te3.a91 r7 = r2.f530d
            int r7 = r7.f130382i
            java.lang.String r10 = "feeds"
            gy3.C87412m.m108594g(r6, r10)
            if (r7 > 0) goto L_0x022b
            goto L_0x024c
        L_0x022b:
            java.lang.Class<an1.l> r7 = an1.C0099l.class
            java.util.List r7 = sx3.C13798c0.m13102z(r6, r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r9
            if (r7 == 0) goto L_0x023b
            goto L_0x024c
        L_0x023b:
            an1.l r7 = new an1.l
            r7.<init>()
            r6.add(r7)
            int r6 = r6.size()
            int r6 = r6 + -1
            r5.notifyItemInserted(r6)
        L_0x024c:
            cn1.q r6 = new cn1.q
            r6.<init>(r2, r0)
            r4.mo17043c(r6)
            r3.f2043c = r6
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r7 = r1.f173499A
            r6.<init>(r7)
            r6.mo16974W(r8)
            r4.setLayoutManager(r6)
            cn1.r r4 = new cn1.r
            r4.<init>(r2, r5, r0)
            xm1.e0 r2 = r0.f2036e
            java.util.List<xm1.e0$a> r2 = r2.f42636a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r4)
            r3.f2042b = r4
            cn1.s r2 = new cn1.s
            r2.<init>(r1, r0)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            boolean r5 = r4 instanceof android.app.Application
            if (r5 == 0) goto L_0x0287
            r12 = r4
            android.app.Application r12 = (android.app.Application) r12
        L_0x0287:
            if (r12 == 0) goto L_0x028c
            r12.registerActivityLifecycleCallbacks(r2)
        L_0x028c:
            r3.f2044d = r2
            r1.f173502D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0859p.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        Context context2 = oVar.f173499A;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f2039h = new C16052a(q3, (MMActivity) context2, (Fragment) null, 0, this.f2037f);
        this.f2040i = q3;
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.m_s);
        if (wxRecyclerView != null) {
            C9496f.m9181b(wxRecyclerView, new C0861b(oVar, this), C0862c.f2047d);
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.HeadLivingListConvert", "#onViewRecycled holder=" + oVar);
        mo771j(oVar);
    }

    /* renamed from: j */
    public final void mo771j(C60905o oVar) {
        WxRecyclerView wxRecyclerView;
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0860a)) {
            C0860a aVar = (C0860a) obj;
            WxRecyclerView wxRecyclerView2 = aVar.f2041a;
            if (wxRecyclerView2 != null) {
                Context context = oVar.f173499A;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new C16299c(new HeadLivingItemConvertFactory((MMActivity) context, false, false, 0), new ArrayList()));
            }
            C15829e0.C15830a aVar2 = aVar.f2042b;
            if (aVar2 != null) {
                ((ArrayList) this.f2036e.f42636a).remove(aVar2);
            }
            RecyclerView.C0130p pVar = aVar.f2043c;
            if (!(pVar == null || (wxRecyclerView = aVar.f2041a) == null)) {
                wxRecyclerView.mo17098m1(pVar);
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = aVar.f2044d;
            if (activityLifecycleCallbacks != null) {
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        oVar.f173502D = null;
    }
}
