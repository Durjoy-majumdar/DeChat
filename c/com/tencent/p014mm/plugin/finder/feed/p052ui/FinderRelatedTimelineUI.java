package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderRelatedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9854m5;
import kf1.C9973s8;
import kf1.C9987t8;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C50159kp0;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRelatedLoader;", "Lkf1/t8;", "Lkf1/s8;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI */
public final class FinderRelatedTimelineUI extends FinderLoaderFeedUI<FinderRelatedLoader, C9987t8, C9973s8> {

    /* renamed from: s */
    public final String f14756s = "Finder.FinderRelatedTimelineUI";

    /* renamed from: t */
    public C9973s8 f14757t;

    /* renamed from: u */
    public C9987t8 f14758u;

    /* renamed from: v */
    public FinderRelatedLoader f14759v;

    /* renamed from: w */
    public final int f14760w = 2;

    /* renamed from: x */
    public C50159kp0 f14761x;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$a */
    public static final class C3039a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderRelatedTimelineUI f14762a;

        /* renamed from: b */
        public final /* synthetic */ FinderRelatedLoader f14763b;

        public C3039a(FinderRelatedTimelineUI finderRelatedTimelineUI, FinderRelatedLoader finderRelatedLoader) {
            this.f14762a = finderRelatedTimelineUI;
            this.f14763b = finderRelatedLoader;
        }

        public void call(int i) {
            C9987t8 t8Var = this.f14762a.f14758u;
            if (t8Var != null) {
                RecyclerView.LayoutManager layoutManager = t8Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14763b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$b */
    public static final class C3040b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderRelatedTimelineUI f14764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3040b(FinderRelatedTimelineUI finderRelatedTimelineUI) {
            super(1);
            this.f14764d = finderRelatedTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            C9987t8 t8Var = this.f14764d.f14758u;
            View view = null;
            if (t8Var != null) {
                View loadMoreFooter = t8Var.mo10308D().getLoadMoreFooter();
                if (loadMoreFooter != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C9987t8 t8Var2 = this.f14764d.f14758u;
                if (t8Var2 != null) {
                    View loadMoreFooter2 = t8Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView2 = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C9987t8 t8Var3 = this.f14764d.f14758u;
                    if (t8Var3 != null) {
                        View loadMoreFooter3 = t8Var3.mo10308D().getLoadMoreFooter();
                        if (!(loadMoreFooter3 == null || (textView = (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14764d.getResources().getColor(C0966R.color.FG_2));
                        }
                        C9987t8 t8Var4 = this.f14764d.f14758u;
                        if (t8Var4 != null) {
                            View loadMoreFooter4 = t8Var4.mo10308D().getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter4 != null ? (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C9987t8 t8Var5 = this.f14764d.f14758u;
                            if (t8Var5 != null) {
                                View loadMoreFooter5 = t8Var5.mo10308D().getLoadMoreFooter();
                                if (loadMoreFooter5 != null) {
                                    view = loadMoreFooter5.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 29;
        }
        return 31;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderRelatedLoader finderRelatedLoader = this.f14759v;
        if (finderRelatedLoader != null) {
            return finderRelatedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9973s8 s8Var = this.f14757t;
        if (s8Var != null) {
            return s8Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9987t8 t8Var = this.f14758u;
        if (t8Var != null) {
            return t8Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "KEY_TITLE"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000f
            r0 = r1
        L_0x000f:
            r11.setMMTitle((java.lang.String) r0)
            te3.kp0 r0 = new te3.kp0
            r0.<init>()
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r3 = "KEY_REQUEST_PB"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r3 = 0
            if (r2 != 0) goto L_0x0025
            goto L_0x0036
        L_0x0025:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0037
        L_0x0029:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r0
            java.lang.String r0 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r2)
        L_0x0036:
            r0 = r3
        L_0x0037:
            r11.f14761x = r0
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r11.f14756s
            java.lang.String r1 = "req is null, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r11.finish()
            te3.kp0 r0 = new te3.kp0
            r0.<init>()
            r11.f14761x = r0
        L_0x004c:
            kf1.s8 r0 = new kf1.s8
            int r1 = r11.f14760w
            r0.<init>(r11, r1)
            r11.f14757t = r0
            kf1.t8 r1 = new kf1.t8
            int r2 = r11.f14760w
            int r3 = r11.mo2194I7()
            r1.<init>(r11, r0, r2, r3)
            r11.f14758u = r1
            com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader r0 = new com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader
            te3.kp0 r1 = r11.f14761x
            gy3.C87412m.m108591d(r1)
            int r5 = r1.f136938g
            int r6 = r11.mo2194I7()
            te3.kp0 r1 = r11.f14761x
            gy3.C87412m.m108591d(r1)
            float r7 = r1.f136939h
            te3.kp0 r1 = r11.f14761x
            gy3.C87412m.m108591d(r1)
            float r8 = r1.f136940i
            te3.kp0 r1 = r11.f14761x
            gy3.C87412m.m108591d(r1)
            te3.kk1 r1 = r1.f136945q
            if (r1 != 0) goto L_0x008b
            te3.kk1 r1 = new te3.kk1
            r1.<init>()
        L_0x008b:
            r9 = r1
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r11)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r10 = r1.mo12861q3()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Intent r1 = r11.getIntent()
            r0.initFromCache(r1)
            com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$a r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$a
            r1.<init>(r11, r0)
            r0.setInitDone(r1)
            com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$b r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI$b
            r1.<init>(r11)
            r0.f13816h = r1
            r11.f14759v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRelatedTimelineUI.mo2941S7():void");
    }

    public void finish() {
        C9987t8 t8Var = this.f14758u;
        if (t8Var != null) {
            RecyclerView.LayoutManager layoutManager = t8Var.getRecyclerView().getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                C58784w3 w3Var = C58784w3.f168295a;
                FinderRelatedLoader finderRelatedLoader = this.f14759v;
                if (finderRelatedLoader != null) {
                    setResult(-1, w3Var.mo83970v(finderRelatedLoader, (LinearLayoutManager) layoutManager));
                } else {
                    C87412m.m108603p("feedLoader");
                    throw null;
                }
            }
            super.finish();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aou;
    }
}
