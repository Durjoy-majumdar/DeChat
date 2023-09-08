package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C98522w3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9796i7;
import kf1.C9811j7;
import kf1.C9854m5;
import kotlin.Metadata;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import rs1.C13442s8;
import rs1.C63575n3;
import rx3.C13598b0;
import tf1.C13913l;
import u91.C22623c;
import z91.C23462b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiTimelineLoader;", "Lkf1/j7;", "Lkf1/i7;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI */
public final class FinderPoiTimelineUI extends FinderLoaderFeedUI<FinderPoiTimelineLoader, C9811j7, C9796i7> {

    /* renamed from: s */
    public C9796i7 f14672s;

    /* renamed from: t */
    public C9811j7 f14673t;

    /* renamed from: u */
    public FinderPoiTimelineLoader f14674u;

    /* renamed from: v */
    public View f14675v;

    /* renamed from: w */
    public final int f14676w = 2;

    /* renamed from: w4 */
    public long f14677w4;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$a */
    public static final class C3010a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderPoiTimelineUI f14678a;

        /* renamed from: b */
        public final /* synthetic */ FinderPoiTimelineLoader f14679b;

        public C3010a(FinderPoiTimelineUI finderPoiTimelineUI, FinderPoiTimelineLoader finderPoiTimelineLoader) {
            this.f14678a = finderPoiTimelineUI;
            this.f14679b = finderPoiTimelineLoader;
        }

        public void call(int i) {
            C9811j7 j7Var = this.f14678a.f14673t;
            if (j7Var != null) {
                RecyclerView.LayoutManager layoutManager = j7Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14679b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f14678a).mo75002a(C63575n3.class);
                C9811j7 j7Var2 = this.f14678a.f14673t;
                if (j7Var2 != null) {
                    n3Var.mo88422e3(j7Var2.getRecyclerView());
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$b */
    public static final class C3011b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiTimelineLoader f14680d;

        /* renamed from: e */
        public final /* synthetic */ FinderPoiTimelineUI f14681e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3011b(FinderPoiTimelineLoader finderPoiTimelineLoader, FinderPoiTimelineUI finderPoiTimelineUI) {
            super(1);
            this.f14680d = finderPoiTimelineLoader;
            this.f14681e = finderPoiTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f14680d.getClass();
            View view = this.f14681e.f14675v;
            View view2 = null;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9811j7 j7Var = this.f14681e.f14673t;
                if (j7Var != null) {
                    View loadMoreFooter = j7Var.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C9811j7 j7Var2 = this.f14681e.f14673t;
                    if (j7Var2 != null) {
                        View loadMoreFooter2 = j7Var2.mo10308D().getLoadMoreFooter();
                        if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14681e.getResources().getColor(C0966R.color.FG_2));
                        }
                        C9811j7 j7Var3 = this.f14681e.f14673t;
                        if (j7Var3 != null) {
                            View loadMoreFooter3 = j7Var3.mo10308D().getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C9811j7 j7Var4 = this.f14681e.f14673t;
                            if (j7Var4 != null) {
                                View loadMoreFooter4 = j7Var4.mo10308D().getLoadMoreFooter();
                                if (loadMoreFooter4 != null) {
                                    view2 = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(0);
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                return C13598b0.f38549a;
                            }
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("emptyView");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        Intent intent = getIntent();
        C98522w3.C8810a aVar = null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        if (serializableExtra instanceof C98522w3.C8810a) {
            aVar = (C98522w3.C8810a) serializableExtra;
        }
        return aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS ? 96 : 27;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderPoiTimelineLoader finderPoiTimelineLoader = this.f14674u;
        if (finderPoiTimelineLoader != null) {
            return finderPoiTimelineLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9796i7 i7Var = this.f14672s;
        if (i7Var != null) {
            return i7Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9811j7 j7Var = this.f14673t;
        if (j7Var != null) {
            return j7Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0082  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r7.setMMTitle((java.lang.String) r0)
            r1 = 2131301640(0x7f091508, float:1.8221344E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.empty_view)"
            gy3.C87412m.m108593f(r1, r2)
            r7.f14675v = r1
            kf1.i7 r1 = new kf1.i7
            int r2 = r7.f14676w
            r1.<init>(r7, r2)
            r7.f14672s = r1
            kf1.j7 r2 = new kf1.j7
            int r3 = r7.f14676w
            int r4 = r7.mo2194I7()
            r2.<init>(r7, r1, r3, r4)
            r7.f14673t = r2
            com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader r1 = new com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62444c(r7)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            te3.hj1 r2 = r2.mo12861q3()
            r1.<init>(r2)
            te3.m74 r2 = new te3.m74
            r2.<init>()
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r4 = "key_location"
            byte[] r3 = r3.getByteArrayExtra(r4)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 != 0) goto L_0x0056
        L_0x0054:
            r2 = r5
            goto L_0x0066
        L_0x0056:
            r2.parseFrom(r3)     // Catch:{ Exception -> 0x005a }
            goto L_0x0066
        L_0x005a:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r6] = r2
            java.lang.String r2 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r0, r3)
            goto L_0x0054
        L_0x0066:
            r1.f13799d = r2
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "key_tab_id"
            int r0 = r0.getIntExtra(r2, r6)
            r1.f13803h = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "key_from_type"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            boolean r2 = r0 instanceof ht1.C98522w3.C8810a
            if (r2 == 0) goto L_0x0085
            ht1.w3$a r0 = (ht1.C98522w3.C8810a) r0
            goto L_0x0086
        L_0x0085:
            r0 = r5
        L_0x0086:
            r1.f13800e = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "key_from_scene"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L_0x00a2
            android.content.Intent r0 = r7.getIntent()
            int r0 = r0.getIntExtra(r2, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.f13801f = r0
        L_0x00a2:
            android.content.Intent r0 = r7.getIntent()
            r1.initFromCache(r0)
            com.tencent.mm.plugin.finder.feed.model.w0 r0 = r1.getCache()
            if (r0 == 0) goto L_0x00bb
            java.util.ArrayList<cm1.i2> r0 = r0.f14079a
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 != r4) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r4 = 0
        L_0x00bc:
            if (r4 == 0) goto L_0x00f0
            com.tencent.mm.plugin.finder.feed.model.w0 r0 = r1.getCache()
            if (r0 == 0) goto L_0x00cf
            java.util.ArrayList<cm1.i2> r0 = r0.f14079a
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r0.get(r6)
            cm1.i2 r0 = (cm1.C0740i2) r0
            goto L_0x00d0
        L_0x00cf:
            r0 = r5
        L_0x00d0:
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r2 == 0) goto L_0x00d7
            r5 = r0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
        L_0x00d7:
            if (r5 == 0) goto L_0x00f0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            int r3 = r7.mo2194I7()
            r2.j80(r0, r3)
        L_0x00f0:
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$a r0 = new com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$a
            r0.<init>(r7, r1)
            r1.setInitDone(r0)
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$b r0 = new com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI$b
            r0.<init>(r1, r7)
            r1.f13802g = r0
            r7.f14674u = r1
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.FinderPoiTimelineUI
            l31.e r0 = r0.mo86178qr(r7, r1)
            o31.a r1 = o31.C76986a.Finder
            r0.mo86179qs(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiTimelineUI.mo2941S7():void");
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.an_;
    }

    public void onPause() {
        super.onPause();
        C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f14677w4;
        long j2 = currentTimeMillis - j;
        long currentTimeMillis2 = System.currentTimeMillis();
        String e = ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36921e();
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String str = ((C13442s8) rVar.mo62444c(context).mo75002a(C13442s8.class)).mo12861q3().f134671e;
        if (str == null) {
            str = "";
        }
        C22623c cVar = r2;
        C22623c cVar2 = new C22623c(Wb, "FinderPoiTimelineUI", j2, j, currentTimeMillis2, "", e, 0, false, C11716d.f34294a, (String) null, str, 1280, (C8480h) null);
        fVar.f50(cVar);
    }

    public void onResume() {
        super.onResume();
        this.f14677w4 = System.currentTimeMillis();
    }
}
