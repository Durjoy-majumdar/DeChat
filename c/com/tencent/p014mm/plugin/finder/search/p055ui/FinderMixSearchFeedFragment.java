package com.tencent.p014mm.plugin.finder.search.p055ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7878t0;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8703w0;
import ht1.C60191o5;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp1.C9485a;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import kp1.C10376a;
import l31.C61212e;
import mf1.C10823h1;
import o40.C61926c;
import p192l4.C10462b;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64187h0;
import sx3.C90364q0;
import te3.C48868bk1;
import te3.C64273c21;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;
import up1.C37521f;
import ve1.C14622r7;
import ve1.C14628s7;
import ve1.C14641t7;
import ve1.C14651u7;
import ve1.C14663v7;
import ye1.C15980u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment */
public final class FinderMixSearchFeedFragment extends FinderHomeTabFragment {

    /* renamed from: x */
    public static final /* synthetic */ int f16653x = 0;

    /* renamed from: q */
    public final int f16654q;

    /* renamed from: r */
    public final FinderMixSearchPresenter f16655r;

    /* renamed from: s */
    public List<BaseFinderFeed> f16656s;

    /* renamed from: t */
    public final C13601g f16657t = C36568h.m40985a(new C3597e(this));

    /* renamed from: u */
    public final C13601g f16658u = C36568h.m40985a(new C3596d(this));

    /* renamed from: v */
    public C10823h1 f16659v;

    /* renamed from: w */
    public final C3595c f16660w;

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$a */
    public final class C3592a extends RecyclerView.C16613e<RecyclerView.C16631z> implements C60191o5 {

        /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$a$a */
        public static final class C3593a implements C118148a {

            /* renamed from: a */
            public final /* synthetic */ Context f16662a;

            /* renamed from: b */
            public final /* synthetic */ BaseFinderFeed f16663b;

            public C3593a(Context context, BaseFinderFeed baseFinderFeed) {
                this.f16662a = context;
                this.f16663b = baseFinderFeed;
            }

            /* renamed from: a */
            public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
                return false;
            }

            /* renamed from: b */
            public final Map<String, Object> mo37b(String str) {
                Class cls = C13442s8.class;
                C13604l[] lVarArr = new C13604l[5];
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16662a);
                C13604l lVar = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
                boolean z = false;
                lVarArr[0] = lVar;
                C39818r rVar = C39818r.f106831a;
                lVarArr[1] = new C13604l("finder_context_id", String.valueOf(((C13442s8) rVar.mo62443b(this.f16662a).mo75002a(cls)).f38098n));
                lVarArr[2] = new C13604l("finder_tab_context_id", ((C13442s8) rVar.mo62443b(this.f16662a).mo75002a(cls)).f38102q);
                C64273c21 liveInfo = this.f16663b.mo3513o().getLiveInfo();
                if (liveInfo != null && liveInfo.f182394f == 1) {
                    z = true;
                }
                lVarArr[3] = new C13604l("live_enter_status", Long.valueOf(z ? 1 : 2));
                lVarArr[4] = new C13604l("share_username", "");
                return C90364q0.m113147f(lVarArr);
            }
        }

        public C3592a() {
        }

        /* renamed from: F4 */
        public final void mo3954F4(View view, Context context, BaseFinderFeed baseFinderFeed) {
            Class cls = C61212e.class;
            ((C61212e) C86312j.m106911c(cls)).o30(view, "live_room_card");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, 40, 26236);
            if (context != null) {
                long j = baseFinderFeed.mo3513o().getFeedObject().f164794id;
                ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).getClass();
                C61212e eVar = (C61212e) C86312j.m106911c(cls);
                C13604l[] lVarArr = new C13604l[5];
                lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(j));
                C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                lVarArr[1] = new C13604l("live_id", liveInfo != null ? C61926c.m72691p(liveInfo.f182392d) : null);
                lVarArr[2] = new C13604l("comment_scene", "temp_4");
                lVarArr[3] = new C13604l("finder_username", baseFinderFeed.mo3513o().getFeedObject().username);
                lVarArr[4] = new C13604l("session_buffer", "");
                eVar.mo86149PM(view, C90364q0.m113147f(lVarArr));
                ((C61212e) C86312j.m106911c(cls)).E60(view, new C3593a(context, baseFinderFeed));
            }
        }

        public List<BaseFinderFeed> getData() {
            return FinderMixSearchFeedFragment.this.f16656s;
        }

        public int getItemCount() {
            return FinderMixSearchFeedFragment.this.f16656s.size();
        }

        public int getItemViewType(int i) {
            FinderMixSearchFeedFragment finderMixSearchFeedFragment = FinderMixSearchFeedFragment.this;
            int i2 = FinderMixSearchFeedFragment.f16653x;
            return finderMixSearchFeedFragment.mo3953Y() ? 7 : 4;
        }

        /* renamed from: m */
        public List<C48868bk1> mo3956m() {
            return C64186f0.f181907d;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            String str2;
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            Class cls = C58417y0.class;
            C87412m.m108594g(zVar2, "holder");
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 4) {
                RecyclerView.C16631z zVar3 = zVar2;
                String str3 = "holder.itemView";
                BaseFinderFeed baseFinderFeed = FinderMixSearchFeedFragment.this.f16656s.get(i2);
                FinderMixSearchFeedFragment finderMixSearchFeedFragment = FinderMixSearchFeedFragment.this;
                int i3 = finderMixSearchFeedFragment.f17334o;
                int i4 = i3 == -1 ? 0 : i3;
                FinderMixSearchPresenter finderMixSearchPresenter = finderMixSearchFeedFragment.f16655r;
                if (finderMixSearchPresenter != null) {
                    finderMixSearchPresenter.mo3910e0(((C58417y0) C86312j.m106911c(cls)).xx0(baseFinderFeed.getItemId()), i, 2, FinderMixSearchFeedFragment.this.f16656s, i4);
                }
                C14663v7 v7Var = (C14663v7) zVar3;
                BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
                v7Var.mo13858z(baseFinderFeed, v7Var.mo17364k(), true, true, new C3599a(baseFinderFeed, i2, FinderMixSearchFeedFragment.this, zVar3));
                if (C58739j4.f168176a.mo83686O(baseFinderFeed2)) {
                    View view = zVar3.f44854d;
                    C87412m.m108593f(view, str3);
                    mo3954F4(view, FinderMixSearchFeedFragment.this.getContext(), baseFinderFeed2);
                }
            } else if (itemViewType != 7) {
            } else {
                BaseFinderFeed baseFinderFeed3 = FinderMixSearchFeedFragment.this.f16656s.get(i2);
                FinderMixSearchFeedFragment finderMixSearchFeedFragment2 = FinderMixSearchFeedFragment.this;
                int i5 = finderMixSearchFeedFragment2.f17334o;
                int i6 = i5 == -1 ? 0 : i5;
                FinderMixSearchPresenter finderMixSearchPresenter2 = finderMixSearchFeedFragment2.f16655r;
                if (finderMixSearchPresenter2 != null) {
                    finderMixSearchPresenter2.mo3910e0(((C58417y0) C86312j.m106911c(cls)).xx0(baseFinderFeed3.getItemId()), i, 3, FinderMixSearchFeedFragment.this.f16656s, i6);
                }
                C14651u7 u7Var = (C14651u7) zVar2;
                FinderMixSearchFeedFragment finderMixSearchFeedFragment3 = FinderMixSearchFeedFragment.this;
                FinderMixSearchPresenter finderMixSearchPresenter3 = finderMixSearchFeedFragment3.f16655r;
                if (finderMixSearchPresenter3 == null || (str = finderMixSearchPresenter3.f16577g) == null) {
                    str = "";
                }
                C3600b bVar = new C3600b(finderMixSearchFeedFragment3, baseFinderFeed3, i2, zVar2);
                C87412m.m108594g(baseFinderFeed3, "feed");
                C64689rq2 rq22 = baseFinderFeed3.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150914L(baseFinderFeed3.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150914L(baseFinderFeed3.mo3513o().getMediaList());
                View view2 = u7Var.f44854d;
                C87412m.m108593f(view2, "itemView");
                Class cls2 = C11990s0.class;
                Class<C60200t1> cls3 = C60200t1.class;
                ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.d78);
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
                String str4 = "";
                C58969q l = baseFinderFeed3.mo3507l();
                Integer num = null;
                String str5 = "holder.itemView";
                C62345f fVar = new C62345f(Util.nullAsNil(l != null ? l.getAvatarUrl() : null), (C27696y) null, 2, (C8480h) null);
                C87412m.m108593f(imageView, "avatar");
                i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
                imageView.setOnClickListener(new C14628s7(u7Var, view2, baseFinderFeed3));
                TextView textView = (TextView) view2.findViewById(C0966R.C0970id.e3v);
                textView.setText(baseFinderFeed3.mo3513o().getNickNameSpan());
                textView.setOnClickListener(new C14641t7(u7Var, view2, baseFinderFeed3));
                C58969q l2 = baseFinderFeed3.mo3507l();
                if (l2 != null) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    View findViewById = view2.findViewById(C0966R.C0970id.a0g);
                    C87412m.m108593f(findViewById, "holder.findViewById<ImageView>(R.id.auth_icon)");
                    C58784w3.m68429F1(w3Var, (ImageView) findViewById, l2.field_authInfo, 0, C58960c.m68830b(l2, false), 4, (Object) null);
                }
                View view3 = u7Var.f44854d;
                C87412m.m108593f(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(C0966R.C0970id.d86);
                if (textView2 != null) {
                    textView2.setMaxLines(2);
                }
                if (Util.isNullOrNil(str)) {
                    str2 = baseFinderFeed3.mo3513o().getDescription();
                } else {
                    FinderObjectDesc finderObjectDesc = baseFinderFeed3.mo3513o().getFeedObject().objectDesc;
                    if (finderObjectDesc == null || (str2 = finderObjectDesc.description) == null) {
                        str2 = str4;
                    }
                }
                C8703w0 w0Var = C8703w0.f27927a;
                int i7 = C8703w0.f27928b;
                boolean z = true;
                if (Util.isNullOrNil(str)) {
                    textView2.setText(str2);
                } else {
                    Context context = MMApplicationContext.getContext();
                    TextPaint paint = textView2.getPaint();
                    C87412m.m108593f(paint, "descTv.paint");
                    String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & textView2.getCurrentTextColor())}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, w0Var.mo9551b(str2, paint, i7, format, false), 0.0f));
                }
                if (!Util.isNullOrNil(str2)) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                View view4 = u7Var.f44854d;
                C87412m.m108593f(view4, "itemView");
                ImageView imageView2 = (ImageView) view4.findViewById(C0966R.C0970id.kk6);
                View findViewById2 = view4.findViewById(C0966R.C0970id.fwx);
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                int z2 = u7Var.f40527z == 13 ? (u7Var.mo13846z() - (((int) view4.getContext().getResources().getDimension(C0966R.dimen.a66)) * 6)) / 2 : (u7Var.mo13846z() - (((int) view4.getContext().getResources().getDimension(C0966R.dimen.f3703bv)) * 6)) / 2;
                int d = baseFinderFeed3.mo3513o().isLiveFeed() ? (int) (((float) z2) * 1.7776f) : C58784w3.f168295a.mo83921d(baseFinderFeed3, rq22, z2);
                if (d > 0) {
                    layoutParams.width = z2;
                    layoutParams.height = d;
                    imageView2.setLayoutParams(layoutParams);
                    findViewById2.getLayoutParams().width = layoutParams.width;
                    findViewById2.getLayoutParams().height = layoutParams.height;
                }
                String str6 = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
                if (Util.isNullOrNil(str6)) {
                    str6 = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
                }
                C64273c21 liveInfo = baseFinderFeed3.mo3513o().getLiveInfo();
                if (liveInfo != null && liveInfo.f182394f == 1) {
                    C11978e0 e0Var = C11978e0.f34938a;
                    e0Var.mo11850b().mo85957c(new C11984n0(str6, C27696y.RAW_IMAGE), imageView2, u7Var.f40527z == 13 ? e0Var.mo11851c(C11978e0.C11979a.DARK_LIVE_SQUARE) : e0Var.mo11851c(C11978e0.C11979a.TIMELINE));
                } else {
                    C7335d c = C86312j.m106911c(C13887q1.class);
                    C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                    C13887q1.C13888a.m13309e((C13887q1) c, imageView2, str6, 0, 4, (Object) null);
                }
                View view5 = u7Var.f44854d;
                C87412m.m108593f(view5, "itemView");
                FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) view5.findViewById(C0966R.C0970id.dr9);
                View findViewById3 = view5.findViewById(C0966R.C0970id.dv8);
                if (baseFinderFeed3.mo3513o().isLiveFeed()) {
                    C64273c21 liveInfo2 = baseFinderFeed3.mo3513o().getLiveInfo();
                    if (liveInfo2 != null && liveInfo2.f182394f == 1) {
                        finderLiveOnliveWidget.setVisibility(8);
                    } else {
                        finderLiveOnliveWidget.setVisibility(0);
                    }
                } else {
                    finderLiveOnliveWidget.setVisibility(8);
                }
                TextView textView3 = (TextView) view5.findViewById(C0966R.C0970id.if8);
                TextView textView4 = (TextView) view5.findViewById(C0966R.C0970id.lkm);
                C64273c21 liveInfo3 = baseFinderFeed3.mo3513o().getLiveInfo();
                if (liveInfo3 == null || liveInfo3.f182394f != 1) {
                    z = false;
                }
                if (z) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view6 = findViewById3;
                    C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    String str7 = baseFinderFeed3.mo3513o().getFeedObject().recommendReason;
                    if (str7 == null) {
                        str7 = str4;
                    }
                    if (TextUtils.isEmpty(str7)) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view7 = findViewById3;
                        C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        textView3.setText(str7);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(0);
                        View view8 = findViewById3;
                        C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder", "bindLive", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C64273c21 liveInfo4 = baseFinderFeed3.mo3513o().getLiveInfo();
                    int i8 = liveInfo4 != null ? liveInfo4.f182403q : 0;
                    if (i8 > 0) {
                        textView4.setText(String.valueOf(C7878t0.m8032a(i8)));
                        textView4.setVisibility(0);
                    } else {
                        textView4.setVisibility(8);
                    }
                }
                u7Var.f44854d.setOnClickListener(new C14622r7(bVar, baseFinderFeed3.mo3513o().getMediaType()));
                StringBuilder sb = new StringBuilder();
                sb.append("mediaType:");
                sb.append(baseFinderFeed3.mo3513o().getMediaType());
                sb.append(",liveStatus:");
                C64273c21 liveInfo5 = baseFinderFeed3.mo3513o().getLiveInfo();
                sb.append(liveInfo5 != null ? Integer.valueOf(liveInfo5.f182394f) : null);
                sb.append(",contact liveStatus:");
                FinderContact refObjectContact = baseFinderFeed3.mo3513o().getRefObjectContact();
                if (refObjectContact != null) {
                    num = Integer.valueOf(refObjectContact.liveStatus);
                }
                sb.append(num);
                Log.m105924i("Finder.FinderProfileUIMediaLiveViewHolder", sb.toString());
                if (C58739j4.f168176a.mo83686O(baseFinderFeed3)) {
                    View view9 = zVar.f44854d;
                    C87412m.m108593f(view9, str5);
                    mo3954F4(view9, FinderMixSearchFeedFragment.this.getContext(), baseFinderFeed3);
                    return;
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 7) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                FinderMixSearchFeedFragment finderMixSearchFeedFragment = FinderMixSearchFeedFragment.this;
                int i2 = FinderMixSearchFeedFragment.f16653x;
                View inflate = from.inflate(finderMixSearchFeedFragment.mo3953Y() ? C0966R.C0971layout.bjz : C0966R.C0971layout.bjx, viewGroup, false);
                C87412m.m108593f(inflate, "convertView");
                return new C14651u7(inflate, FinderMixSearchFeedFragment.this.f16654q);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.alv, viewGroup, false);
            C87412m.m108593f(inflate2, "convertView");
            return new C14663v7(inflate2);
        }

        /* renamed from: y1 */
        public int mo3957y1(int i) {
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$b */
    public final class C3594b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f16664d;

        public C3594b(FinderMixSearchFeedFragment finderMixSearchFeedFragment, int i) {
            this.f16664d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
            int i = this.f16664d;
            int i2 = (int) (((float) i) / 2.0f);
            rect.top = i;
            ViewGroup.LayoutParams layoutParams = P0.f44854d.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                int i3 = this.f16664d;
                rect.left = i3;
                rect.right = i3;
            } else if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo17429e() == 0) {
                rect.left = this.f16664d;
                rect.right = i2;
            } else {
                rect.left = i2;
                rect.right = this.f16664d;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$c */
    public static final class C3595c extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_4", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$d */
    public static final class C3596d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderMixSearchFeedFragment f16665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3596d(FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
            super(0);
            this.f16665d = finderMixSearchFeedFragment;
        }

        public Object invoke() {
            FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f16665d;
            int i = FinderMixSearchFeedFragment.f16653x;
            RecyclerView recyclerView = finderMixSearchFeedFragment.mo3952X().getRecyclerView();
            C87412m.m108591d(recyclerView);
            return recyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$e */
    public static final class C3597e extends C87413o implements C32224a<FinderRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderMixSearchFeedFragment f16666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3597e(FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
            super(0);
            this.f16666d = finderMixSearchFeedFragment;
        }

        public Object invoke() {
            View view = this.f16666d.getView();
            C87412m.m108591d(view);
            return (FinderRefreshLayout) view.findViewById(C0966R.C0970id.ivb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment$f */
    public static final class C3598f extends C87413o implements C32224a<C15980u> {

        /* renamed from: d */
        public final /* synthetic */ FinderMixSearchFeedFragment f16667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3598f(FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
            super(0);
            this.f16667d = finderMixSearchFeedFragment;
        }

        public Object invoke() {
            View view = this.f16667d.getView();
            C87412m.m108591d(view);
            FrameLayout frameLayout = (FrameLayout) view;
            int i = C0966R.C0970id.i5i;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(view, C0966R.C0970id.i5i);
            if (coordinatorLayout != null) {
                i = C0966R.C0970id.iiq;
                RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(view, C0966R.C0970id.iiq);
                if (recyclerView != null) {
                    i = C0966R.C0970id.ivb;
                    FinderRefreshLayout finderRefreshLayout = (FinderRefreshLayout) C10462b.m10395a(view, C0966R.C0970id.ivb);
                    if (finderRefreshLayout != null) {
                        return new C15980u(frameLayout, frameLayout, coordinatorLayout, recyclerView, finderRefreshLayout);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMixSearchFeedFragment(C9485a aVar, int i, FinderMixSearchPresenter finderMixSearchPresenter) {
        super(0, aVar.f29651a);
        C87412m.m108594g(aVar, "tabData");
        this.f16654q = i;
        this.f16655r = finderMixSearchPresenter;
        this.f16656s = aVar.f29653c;
        C36568h.m40985a(new C3598f(this));
        this.f16660w = new C3595c();
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* renamed from: V */
    public final RecyclerView mo3951V() {
        return (RecyclerView) ((C36570n) this.f16658u).getValue();
    }

    /* renamed from: X */
    public final FinderRefreshLayout mo3952X() {
        return (FinderRefreshLayout) ((C36570n) this.f16657t).getValue();
    }

    /* renamed from: Y */
    public final boolean mo3953Y() {
        return this.f16654q == 13;
    }

    public int getLayoutId() {
        return mo3953Y() ? C0966R.C0971layout.bf5 : C0966R.C0971layout.bco;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        C10823h1 h1Var;
        super.onDestroy();
        mo3951V().mo17098m1(this.f16660w);
        C37521f.f99374d.getClass();
        if (C37521f.f99274R4.mo60266n().intValue() == 1 && (h1Var = this.f16659v) != null) {
            mo3951V().mo17098m1(h1Var);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo3951V().setLayoutManager(new FinderStaggeredGridLayoutManager(2, 1));
        mo3951V().setAdapter(new C3592a());
        mo3951V().mo17085h0(new C3594b(this, (int) (mo3953Y() ? getResources().getDimension(C0966R.dimen.f3723cd) : getResources().getDimension(C0966R.dimen.f3766df))));
        FinderLoaderMoreFooter finderLoaderMoreFooter = new FinderLoaderMoreFooter(getActivity(), (AttributeSet) null);
        finderLoaderMoreFooter.mo79990j(mo3953Y() ? C0966R.C0971layout.b7v : C0966R.C0971layout.b7t);
        mo3952X().mo26641y(finderLoaderMoreFooter);
        mo3952X().setOnSimpleAction(new C10376a(this));
        C37521f.f99374d.getClass();
        if (C37521f.f99274R4.mo60266n().intValue() == 1) {
            FinderRefreshLayout X = mo3952X();
            C87412m.m108593f(X, "rlLayout");
            C10823h1 h1Var = new C10823h1("Finder.MixSearchFeedFragment", X, 2);
            this.f16659v = h1Var;
            mo3951V().mo17043c(h1Var);
        }
        mo3951V().mo17043c(this.f16660w);
    }
}
