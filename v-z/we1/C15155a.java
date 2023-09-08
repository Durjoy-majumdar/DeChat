package we1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7865r3;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8809w2;
import j20.C117292a;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l31.C61212e;
import n60.C100075f;
import o40.C61926c;
import p185kq.C10383h;
import p185kq.C61130g;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import t91.C64208c;
import te3.C64273c21;
import te3.C64456ix0;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;
import wc1.C15064b;
import zo3.C16376b;

/* renamed from: we1.a */
public class C15155a extends C60896i<BaseFinderFeed> {

    /* renamed from: e */
    public final float f41279e;

    /* renamed from: f */
    public final boolean f41280f;

    /* renamed from: g */
    public final boolean f41281g;

    /* renamed from: h */
    public final C32227p<BaseFinderFeed, String, C13598b0> f41282h;

    /* renamed from: we1.a$a */
    public static final class C15156a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f41283d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Integer, C13598b0> f41284e;

        public C15156a(C60905o oVar, C32226l<? super Integer, C13598b0> lVar) {
            this.f41283d = oVar;
            this.f41284e = lVar;
        }

        public boolean onPreDraw() {
            this.f41283d.f44854d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f41284e.invoke(Integer.valueOf(this.f41283d.f44854d.getWidth()));
            return true;
        }
    }

    /* renamed from: we1.a$b */
    public static final class C15157b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f41285d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f41286e;

        /* renamed from: f */
        public final /* synthetic */ C64689rq2 f41287f;

        /* renamed from: g */
        public final /* synthetic */ View f41288g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15157b(ImageView imageView, BaseFinderFeed baseFinderFeed, C64689rq2 rq22, View view) {
            super(1);
            this.f41285d = imageView;
            this.f41286e = baseFinderFeed;
            this.f41287f = rq22;
            this.f41288g = view;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            ViewGroup.LayoutParams layoutParams = this.f41285d.getLayoutParams();
            int d = this.f41286e.mo3513o().isLiveFeed() ? (int) (((float) intValue) * 1.7776f) : C58784w3.f168295a.mo83921d(this.f41286e, this.f41287f, intValue);
            if (d > 0) {
                layoutParams.width = intValue;
                layoutParams.height = d;
                this.f41285d.setLayoutParams(layoutParams);
                this.f41288g.getLayoutParams().width = layoutParams.width;
                this.f41288g.getLayoutParams().height = layoutParams.height;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: we1.a$c */
    public static final class C15158c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f41289a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f41290b;

        public C15158c(C60905o oVar, BaseFinderFeed baseFinderFeed) {
            this.f41289a = oVar;
            this.f41290b = baseFinderFeed;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            C13604l[] lVarArr = new C13604l[5];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f41289a.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            C13604l lVar = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            boolean z = false;
            lVarArr[0] = lVar;
            lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
            lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
            C64273c21 liveInfo = this.f41290b.mo3513o().getLiveInfo();
            if (liveInfo != null && liveInfo.f182394f == 1) {
                z = true;
            }
            lVarArr[3] = new C13604l("live_enter_status", Long.valueOf(z ? 1 : 2));
            lVarArr[4] = new C13604l("share_username", "");
            return C90364q0.m113147f(lVarArr);
        }
    }

    public C15155a(float f, boolean z, boolean z2, C32227p<? super BaseFinderFeed, ? super String, C13598b0> pVar) {
        C87412m.m108594g(pVar, "jumProfileCallback");
        this.f41279e = f;
        this.f41280f = z;
        this.f41281g = z2;
        this.f41282h = pVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f41281g ? C0966R.C0971layout.bjy : this.f41280f ? C0966R.C0971layout.bjz : C0966R.C0971layout.bjx;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C15064b bVar = C15064b.f41199a;
        View D = oVar.mo85812D(C0966R.C0970id.d78);
        C87412m.m108593f(D, "holder.getView<ImageView>(R.id.finder_avatar)");
        C15064b.m14232g(bVar, D, false, 1, (Object) null);
        View D2 = oVar.mo85812D(C0966R.C0970id.e3v);
        C87412m.m108593f(D2, "holder.getView<TextView>(R.id.finder_nickname)");
        C15064b.m14232g(bVar, D2, false, 1, (Object) null);
        View D3 = oVar.mo85812D(C0966R.C0970id.a0g);
        C87412m.m108593f(D3, "holder.getView<ImageView>(R.id.auth_icon)");
        C15064b.m14232g(bVar, D3, false, 1, (Object) null);
        View D4 = oVar.mo85812D(C0966R.C0970id.lkm);
        C87412m.m108593f(D4, "holder.getView<TextView>…d.watch_count_history_tv)");
        C15064b.m14232g(bVar, D4, false, 1, (Object) null);
    }

    /* renamed from: j */
    public final void mo14105j(C60905o oVar, C64689rq2 rq22, BaseFinderFeed baseFinderFeed) {
        String str;
        int i;
        String str2;
        C64456ix0 ix02;
        C64456ix0 ix03;
        C60905o oVar2 = oVar;
        C64689rq2 rq23 = rq22;
        C27696y yVar = C27696y.RAW_IMAGE;
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        Class cls3 = C13887q1.class;
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
        View D = oVar2.mo85812D(C0966R.C0970id.fwx);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f358052mq2);
        if (imageView == null) {
            Log.m105928w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        C15157b bVar = new C15157b(imageView, baseFinderFeed, rq23, D);
        if (!C85875k4.m106157N()) {
            bVar.invoke(Integer.valueOf((C7865r3.f26468a.mo8970c() - ((int) this.f41279e)) / 2));
        } else {
            oVar2.f44854d.getViewTreeObserver().addOnPreDrawListener(new C15156a(oVar2, bVar));
        }
        String B = C58739j4.f168176a.mo83674B(rq23, 1);
        if (!(B.length() > 0)) {
            B = Util.nullAsNil(rq23.f185283w) + Util.nullAsNil(rq23.f185234A);
        }
        if (Util.isNullOrNil(B)) {
            B = rq23.f185267e + Util.nullAsNil(rq23.f185288z);
        }
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(B, yVar), imageView, mo14106k());
            str = "getService(IFinderCommonLiveService::class.java)";
            i = 1;
        } else {
            C7335d c = C86312j.m106911c(cls3);
            C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
            str = "getService(IFinderCommonLiveService::class.java)";
            i = 1;
            C13887q1.C13888a.m13309e((C13887q1) c, imageView, B, 0, 4, (Object) null);
        }
        FinderObject finderObject = baseFinderFeed.mo3513o().getFinderObject();
        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
        if (liveInfo2 != null && liveInfo2.f182394f == i) {
            C64273c21 c212 = finderObject.liveInfo;
            if (c212 == null || (ix03 = c212.f182386Y) == null || ix03.f183745d != i) {
                i = 0;
            }
            if (i == 0) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(B, yVar), imageView, mo14106k());
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
            FinderObject finderObject2 = finderObject;
            C60200t1.C60201a.m70367e((C60200t1) c2, B, imageView, (C11978e0.C11979a) null, 4, (Object) null);
            if (textView != null) {
                C64273c21 c213 = finderObject2.liveInfo;
                if (c213 == null || (ix02 = c213.f182386Y) == null || (str2 = ix02.f183746e) == null) {
                    str2 = "";
                }
                textView.setText(str2);
            }
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        C7335d c3 = C86312j.m106911c(cls3);
        C87412m.m108593f(c3, str);
        C13887q1.C13888a.m13309e((C13887q1) c3, imageView, B, 0, 4, (Object) null);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final C100075f mo14106k() {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (this.f41280f) {
            return ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_LIVE_SQUARE);
        }
        return ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE);
    }

    /* renamed from: l */
    public void mo14107l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        Class cls = C61212e.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed2, "item");
        View view = oVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        if (C16376b.f43775a) {
            view.setTag(C0966R.C0970id.mwm, "FinderLive");
            view.setTag(C0966R.C0970id.mwl, baseFinderFeed2);
        }
        String str = "";
        oVar2.f44854d.setTag(C0966R.C0970id.hac, str);
        oVar2.f44854d.setTag(C0966R.C0970id.hab, str);
        oVar2.f44854d.setTag(C0966R.C0970id.haa, str);
        C64689rq2 rq22 = baseFinderFeed.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        ViewGroup viewGroup = (ViewGroup) oVar2.f44854d.findViewById(C0966R.C0970id.hae);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d78);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
        C58969q l = baseFinderFeed.mo3507l();
        C62345f fVar = new C62345f(Util.nullAsNil(l != null ? l.getAvatarUrl() : null), C27696y.SMALL_AVATAR_IMAGE);
        C87412m.m108593f(imageView, "avatar");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        imageView.setOnClickListener(new C15159b(baseFinderFeed2, oVar2, this));
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
        C15064b bVar = C15064b.f41199a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
        textView.setText(baseFinderFeed.mo3513o().getNickNameSpan());
        viewGroup.setTag(C0966R.C0970id.d58, textView.getText());
        C85875k4.m106189j0(((TextView) oVar2.mo85812D(C0966R.C0970id.d86)).getPaint(), 0.8f);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setOnClickListener(new C15160c(baseFinderFeed2, oVar2, this));
        C58969q l2 = baseFinderFeed.mo3507l();
        boolean z2 = false;
        if (l2 != null) {
            FinderAuthInfo finderAuthInfo = l2.field_authInfo;
            viewGroup.setTag(C0966R.C0970id.d3i, Integer.valueOf(finderAuthInfo != null ? finderAuthInfo.authIconType : 0));
            C58784w3 w3Var = C58784w3.f168295a;
            View D = oVar2.mo85812D(C0966R.C0970id.a0g);
            C87412m.m108593f(D, "holder.getView<ImageView>(R.id.auth_icon)");
            C58784w3.m68429F1(w3Var, (ImageView) D, l2.field_authInfo, 0, C58960c.m68830b(l2, false), 4, (Object) null);
        }
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (!Util.isNullOrNil(baseFinderFeed.mo3513o().getDescription())) {
            textView2.setVisibility(0);
            textView2.setText(baseFinderFeed.mo3513o().getDescriptionSpan());
        } else {
            textView2.setVisibility(8);
        }
        try {
            mo14105j(oVar2, rq22, baseFinderFeed2);
        } catch (Throwable unused) {
            Log.m105928w("Finder.Loader", "bindCover throw Throwable.");
        }
        FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) oVar2.mo85812D(C0966R.C0970id.dr9);
        View D2 = oVar2.mo85812D(C0966R.C0970id.dv8);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        boolean z3 = true;
        if (baseFinderFeed.mo3513o().isLiveFeed()) {
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            if (liveInfo != null && liveInfo.f182394f == 1) {
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = D2;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView3.setVisibility(8);
            } else {
                finderLiveOnliveWidget.setVisibility(0);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = D2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = D2;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Context context2 = oVar2.f44854d.getContext();
        MMFinderUI mMFinderUI = context2 instanceof MMFinderUI ? (MMFinderUI) context2 : null;
        if (mMFinderUI != null && (baseFinderFeed.mo3513o().getFeedObject().block_cgi_flag & 1) == 0) {
            C8809w2 w2Var = (C8809w2) C39818r.f106831a.mo62444c(mMFinderUI).mo62447c(C8809w2.class);
            long id = baseFinderFeed.mo3513o().getId();
            String objectNonceId = baseFinderFeed.mo3513o().getObjectNonceId();
            C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
            w2Var.mo9637P0(id, objectNonceId, liveInfo2 != null ? liveInfo2.f182392d : 0, mMFinderUI);
        }
        Context context3 = oVar2.f44854d.getContext();
        if (context3 != null) {
            String Pf0 = ((C61130g) C86312j.m106911c(C61130g.class)).Pf0();
            if (this.f41281g) {
                Pf0 = String.valueOf(baseFinderFeed.mo3513o().getCommentScene());
            }
            ((C61212e) C86312j.m106911c(cls)).o30(oVar2.f44854d, "live_tab_page_room_card");
            C61212e eVar = (C61212e) C86312j.m106911c(cls);
            View view5 = oVar2.f44854d;
            C13604l[] lVarArr = new C13604l[5];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.mo3513o().getFeedObject().f164794id));
            C64273c21 liveInfo3 = baseFinderFeed.mo3513o().getLiveInfo();
            lVarArr[1] = new C13604l("live_id", liveInfo3 != null ? C61926c.m72691p(liveInfo3.f182392d) : null);
            lVarArr[2] = new C13604l("finder_username", baseFinderFeed.mo3513o().getFeedObject().username);
            lVarArr[3] = new C13604l("comment_scene", Pf0);
            C64208c.C64209a aVar4 = C64208c.f181951a;
            if (Pf0 == null) {
                z3 = false;
            }
            if (Pf0 != null) {
                try {
                    Integer.parseInt(Pf0);
                } catch (NumberFormatException unused2) {
                }
            }
            z2 = z3;
            if (z2) {
                long j = baseFinderFeed.mo3513o().getFeedObject().f164794id;
                C87412m.m108593f(Pf0, "commentScene");
                str = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j, Integer.parseInt(Pf0));
            }
            lVarArr[4] = new C13604l("session_buffer", str);
            eVar.mo86149PM(view5, C90364q0.m113147f(lVarArr));
            ((C61212e) C86312j.m106911c(cls)).E60(oVar2.f44854d, new C15158c(oVar2, baseFinderFeed2));
            if (((C61212e) C86312j.m106911c(cls)).ka0(context3) == 20001) {
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(oVar2.f44854d, 40, 25388);
            }
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(oVar2.f44854d, 40, 26236);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mediaType:");
        sb.append(baseFinderFeed.mo3513o().getMediaType());
        sb.append(",liveStatus:");
        C64273c21 liveInfo4 = baseFinderFeed.mo3513o().getLiveInfo();
        sb.append(liveInfo4 != null ? Integer.valueOf(liveInfo4.f182394f) : null);
        sb.append(",contact liveStatus:");
        FinderContact refObjectContact = baseFinderFeed.mo3513o().getRefObjectContact();
        sb.append(refObjectContact != null ? Integer.valueOf(refObjectContact.liveStatus) : null);
        Log.m105924i("FinderFeedVideoLiveFriendsConvert", sb.toString());
    }
}
