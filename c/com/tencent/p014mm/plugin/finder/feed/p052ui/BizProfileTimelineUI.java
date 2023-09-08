package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileLoader;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32226l;
import ge1.C8267d;
import ge1.C8271f;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kf1.C9854m5;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import pf1.C62273n;
import q31.C118148a;
import rs1.C13442s8;
import rs1.C63575n3;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import tf1.C13913l;
import u24.C90599h;
import u91.C22623c;
import z91.C23462b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileLoader;", "Lge1/f;", "Lge1/d;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI */
public final class BizProfileTimelineUI extends FinderLoaderFeedUI<FinderBizProfileLoader, C8271f, C8267d> {

    /* renamed from: s */
    public C8267d f14188s;

    /* renamed from: t */
    public C8271f f14189t;

    /* renamed from: u */
    public FinderBizProfileLoader f14190u;

    /* renamed from: v */
    public long f14191v;

    /* renamed from: w */
    public long f14192w;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI$a */
    public static final class C2860a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ BizProfileTimelineUI f14193a;

        /* renamed from: b */
        public final /* synthetic */ FinderBizProfileLoader f14194b;

        public C2860a(BizProfileTimelineUI bizProfileTimelineUI, FinderBizProfileLoader finderBizProfileLoader) {
            this.f14193a = bizProfileTimelineUI;
            this.f14194b = finderBizProfileLoader;
        }

        public void call(int i) {
            C8271f fVar = this.f14193a.f14189t;
            if (fVar != null) {
                RecyclerView.LayoutManager layoutManager = fVar.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14194b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                BizProfileTimelineUI bizProfileTimelineUI = this.f14193a;
                DataBuffer<C0740i2> dataList = this.f14194b.getDataList();
                bizProfileTimelineUI.getClass();
                ArrayList arrayList = new ArrayList();
                for (C0740i2 i2Var : dataList) {
                    FinderItem o = i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o() : null;
                    if (o != null) {
                        arrayList.add(o);
                    }
                }
                C39818r rVar = C39818r.f106831a;
                C39622i0 a = rVar.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                C62273n.m73200l3((C62273n) a, arrayList, 120, (C49712hj1) null, 0, 12, (Object) null);
                C63575n3 n3Var = (C63575n3) rVar.mo62444c(this.f14193a).mo75002a(C63575n3.class);
                C8271f fVar2 = this.f14193a.f14189t;
                if (fVar2 != null) {
                    n3Var.mo88422e3(fVar2.getRecyclerView());
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

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI$b */
    public static final class C2861b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTimelineUI f14195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2861b(BizProfileTimelineUI bizProfileTimelineUI) {
            super(1);
            this.f14195d = bizProfileTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!iResponse.getHasMore()) {
                C8271f fVar = this.f14195d.f14189t;
                View view = null;
                if (fVar != null) {
                    View loadMoreFooter = fVar.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C8271f fVar2 = this.f14195d.f14189t;
                    if (fVar2 != null) {
                        View loadMoreFooter2 = fVar2.mo10308D().getLoadMoreFooter();
                        if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14195d.getResources().getColor(C0966R.color.FG_2));
                        }
                        C8271f fVar3 = this.f14195d.f14189t;
                        if (fVar3 != null) {
                            View loadMoreFooter3 = fVar3.mo10308D().getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C8271f fVar4 = this.f14195d.f14189t;
                            if (fVar4 != null) {
                                View loadMoreFooter4 = fVar4.mo10308D().getLoadMoreFooter();
                                if (loadMoreFooter4 != null) {
                                    view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(0);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI$c */
    public static final class C2862c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ BizProfileTimelineUI f14196a;

        public C2862c(BizProfileTimelineUI bizProfileTimelineUI) {
            this.f14196a = bizProfileTimelineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14196a.getIntent();
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
            Intent intent2 = this.f14196a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 120;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderBizProfileLoader finderBizProfileLoader = this.f14190u;
        if (finderBizProfileLoader != null) {
            return finderBizProfileLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C8267d dVar = this.f14188s;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C8271f fVar = this.f14189t;
        if (fVar != null) {
            return fVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        Class cls = C61212e.class;
        C8267d dVar = new C8267d(this);
        this.f14188s = dVar;
        this.f14189t = new C8271f(this, dVar, 2, 120);
        String stringExtra = getIntent().getStringExtra("KEY_BIZ_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        FinderBizProfileLoader finderBizProfileLoader = new FinderBizProfileLoader(stringExtra, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), true, false, 8, (C8480h) null);
        finderBizProfileLoader.initFromCache(getIntent());
        finderBizProfileLoader.setInitDone(new C2860a(this, finderBizProfileLoader));
        finderBizProfileLoader.f12536h = new C2861b(this);
        this.f14190u = finderBizProfileLoader;
        this.f14191v = System.currentTimeMillis();
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.BizProfileTimelineUI);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "BizProfileTimelineUI");
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C2862c(this));
    }

    public void finish() {
        String str;
        String str2;
        DataBuffer<C0740i2> dataListJustForAdapter;
        C8267d dVar = this.f14188s;
        if (dVar != null) {
            BaseFeedLoader<C0740i2> baseFeedLoader = dVar.f13124s;
            if (!(baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null)) {
                C58784w3 w3Var = C58784w3.f168295a;
                C8267d dVar2 = this.f14188s;
                if (dVar2 != null) {
                    BaseFeedLoader<C0740i2> baseFeedLoader2 = dVar2.f13124s;
                    C58784w3.m68427B1(w3Var, 0, dataListJustForAdapter, baseFeedLoader2 != null ? baseFeedLoader2.getLastBuffer() : null, getIntent(), (C2780c) null, 16, (Object) null);
                    setResult(-1, getIntent());
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            }
            C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f14191v;
            long j2 = currentTimeMillis - j;
            long currentTimeMillis2 = System.currentTimeMillis();
            FinderBizProfileLoader finderBizProfileLoader = this.f14190u;
            if (finderBizProfileLoader != null) {
                C49712hj1 contextObj = finderBizProfileLoader.getContextObj();
                if (contextObj == null || (str = contextObj.f134672f) == null) {
                    str = "";
                }
                String e = ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36921e();
                FinderBizProfileLoader finderBizProfileLoader2 = this.f14190u;
                if (finderBizProfileLoader2 != null) {
                    C49712hj1 contextObj2 = finderBizProfileLoader2.getContextObj();
                    fVar.f50(new C22623c(Wb, "BizProfileTimelineUI", j2, j, currentTimeMillis2, str, e, 1, false, C11716d.f34294a, (String) null, (contextObj2 == null || (str2 = contextObj2.f134671e) == null) ? "" : str2, 1280, (C8480h) null));
                    super.finish();
                    return;
                }
                C87412m.m108603p("feedLoader");
                throw null;
            }
            C87412m.m108603p("feedLoader");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a95;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        r3 = r3.f134671e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r22 = this;
            r0 = r22
            super.onPause()
            java.lang.Class<oq.f> r1 = p217oq.C11717f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            oq.f r1 = (p217oq.C11717f) r1
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.i r2 = (h81.C59774i) r2
            java.lang.String r4 = r2.mo84751Wb()
            java.lang.String r5 = "BizProfileTimelineUI"
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r0.f14192w
            long r6 = r2 - r8
            long r10 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r2 = r0.f14190u
            r3 = 0
            java.lang.String r12 = "feedLoader"
            if (r2 == 0) goto L_0x0081
            te3.hj1 r2 = r2.getContextObj()
            java.lang.String r13 = ""
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.f134672f
            if (r2 != 0) goto L_0x003b
        L_0x003a:
            r2 = r13
        L_0x003b:
            java.lang.Class<kq.h> r14 = p185kq.C10383h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            kq.h r14 = (p185kq.C10383h) r14
            kq.l r14 = r14.mo10693DZ()
            z91.b r14 = (z91.C23462b) r14
            java.lang.String r14 = r14.mo36921e()
            r16 = 0
            com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r15 = r0.f14190u
            if (r15 == 0) goto L_0x007d
            te3.hj1 r3 = r15.getContextObj()
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = r3.f134671e
            if (r3 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r18 = r3
            goto L_0x0063
        L_0x0061:
            r18 = r13
        L_0x0063:
            java.lang.String r21 = p217oq.C11716d.f34294a
            u91.c r13 = new u91.c
            r3 = r13
            r15 = 0
            r17 = 0
            r19 = 1280(0x500, float:1.794E-42)
            r20 = 0
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r16
            r16 = r21
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f50(r2)
            return
        L_0x007d:
            gy3.C87412m.m108603p(r12)
            throw r3
        L_0x0081:
            gy3.C87412m.m108603p(r12)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.BizProfileTimelineUI.onPause():void");
    }

    public void onResume() {
        super.onResume();
        this.f14192w = System.currentTimeMillis();
    }
}
