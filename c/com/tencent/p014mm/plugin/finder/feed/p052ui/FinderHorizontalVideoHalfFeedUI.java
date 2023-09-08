package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0324s;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C31543z5;
import er1.C7881t2;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8757a2;
import ht1.C8766f5;
import ht1.C8768g2;
import ht1.C8773i2;
import ht1.C8787n2;
import j20.C117292a;
import java.util.HashSet;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kf1.C9707f;
import kf1.C9764h3;
import kf1.C9854m5;
import kotlin.Metadata;
import l31.C61212e;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13442s8;
import rs1.C13539y3;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import u24.C90599h;
import vf1.C14819r0;
import vp1.C65834e;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lkf1/h3;", "Lcom/tencent/mm/plugin/finder/feed/FinderHalfScreenContract$Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI */
public final class FinderHorizontalVideoHalfFeedUI extends FinderLoaderFeedUI<BaseFinderFeedLoader, C9764h3, FinderHalfScreenContract$Presenter> {

    /* renamed from: w */
    public static final /* synthetic */ int f14411w = 0;

    /* renamed from: s */
    public FinderHalfScreenContract$Presenter f14412s;

    /* renamed from: t */
    public C9764h3 f14413t;

    /* renamed from: u */
    public FinderFeedShareRelativeListLoader f14414u;

    /* renamed from: v */
    public BaseFinderFeed f14415v;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI$a */
    public static final class C2931a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f14416d;

        public C2931a(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI) {
            this.f14416d = finderHorizontalVideoHalfFeedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14416d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI$b */
    public static final class C2932b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f14417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2932b(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI) {
            super(1);
            this.f14417d = finderHorizontalVideoHalfFeedUI;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!iResponse.getHasMore()) {
                C9764h3 h3Var = this.f14417d.f14413t;
                View view = null;
                if (h3Var != null) {
                    View loadMoreFooter = h3Var.mo10308D().getLoadMoreFooter();
                    View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.ive) : null;
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C9764h3 h3Var2 = this.f14417d.f14413t;
                    if (h3Var2 != null) {
                        View loadMoreFooter2 = h3Var2.mo10308D().getLoadMoreFooter();
                        if (loadMoreFooter2 != null) {
                            view = loadMoreFooter2.findViewById(C0966R.C0970id.g2q);
                        }
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI$c */
    public static final class C2933c extends C87413o implements C32227p<Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f14418d;

        /* renamed from: e */
        public final /* synthetic */ FinderHalfScreenContract$Presenter f14419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2933c(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
            super(2);
            this.f14418d = finderHorizontalVideoHalfFeedUI;
            this.f14419e = finderHalfScreenContract$Presenter;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f14418d;
            int i = FinderHorizontalVideoHalfFeedUI.f14411w;
            boolean z = false;
            finderHorizontalVideoHalfFeedUI.mo2991W7(false);
            C9707f fVar = this.f14419e.f29964g;
            RecyclerView recyclerView = fVar != null ? fVar.getRecyclerView() : null;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            View findViewById = this.f14418d.findViewById(C0966R.C0970id.o8h);
            TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.c1m);
            if (intValue != -5002) {
                if (intValue == -4036) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.eoh);
                } else if (intValue == -4033) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.d_8);
                } else if (intValue != -4011) {
                    FinderHorizontalVideoHalfFeedUI.m2802V7(this.f14418d, true);
                } else {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.f360503d90);
                }
            } else if (str != null) {
                C7881t2.f26501a.mo8997b(this.f14418d, str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI$d */
    public static final class C2934d extends C87413o implements C32226l<FinderObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f14420d;

        /* renamed from: e */
        public final /* synthetic */ FinderHalfScreenContract$Presenter f14421e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2934d(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
            super(1);
            this.f14420d = finderHorizontalVideoHalfFeedUI;
            this.f14421e = finderHalfScreenContract$Presenter;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
                java.lang.String r2 = "it"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI r2 = r0.f14420d
                int r3 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI.f14411w
                r3 = 0
                r2.mo2991W7(r3)
                com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI r2 = r0.f14420d
                com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI.m2802V7(r2, r3)
                com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI r2 = r0.f14420d
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r2 = r2.f14414u
                r4 = 0
                if (r2 == 0) goto L_0x0090
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r1.contact
                if (r5 == 0) goto L_0x0026
                java.lang.String r5 = r5.username
                goto L_0x0027
            L_0x0026:
                r5 = r4
            L_0x0027:
                java.lang.String r6 = ""
                if (r5 != 0) goto L_0x002c
                r5 = r6
            L_0x002c:
                r2.f13578x = r5
                com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r2 = r0.f14421e
                kf1.f r2 = r2.f29964g
                if (r2 == 0) goto L_0x0039
                androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
                goto L_0x003a
            L_0x0039:
                r2 = r4
            L_0x003a:
                if (r2 != 0) goto L_0x003d
                goto L_0x0040
            L_0x003d:
                r2.setVisibility(r3)
            L_0x0040:
                com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r2 = r0.f14421e
                com.tencent.mm.plugin.finder.feed.model.r r7 = r2.mo2549y1()
                long r8 = r1.f164794id
                java.lang.String r10 = r1.objectNonceId
                com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r2 = r0.f14421e
                int r11 = r2.f29962e
                int r2 = r1.secondaryShowFlag
                r5 = 1
                if (r2 == r5) goto L_0x0055
                r12 = 1
                goto L_0x0056
            L_0x0055:
                r12 = 0
            L_0x0056:
                java.lang.String r1 = r1.username
                if (r1 != 0) goto L_0x005c
                r13 = r6
                goto L_0x005d
            L_0x005c:
                r13 = r1
            L_0x005d:
                r14 = 0
                r15 = 0
                r16 = 96
                r17 = 0
                com.tencent.p014mm.plugin.finder.feed.model.C55776r.m63515J1(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
                com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI r1 = r0.f14420d
                kf1.h3 r2 = r1.f14413t
                if (r2 == 0) goto L_0x0089
                androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.getLayoutManager()
                boolean r5 = r3 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
                if (r5 == 0) goto L_0x007b
                r4 = r3
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r4 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r4
            L_0x007b:
                if (r4 != 0) goto L_0x007e
                goto L_0x0086
            L_0x007e:
                vf1.q0 r3 = new vf1.q0
                r3.<init>(r1, r4, r2)
                r2.post(r3)
            L_0x0086:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0089:
                java.lang.String r1 = "viewCallback"
                gy3.C87412m.m108603p(r1)
                throw r4
            L_0x0090:
                java.lang.String r1 = "loader"
                gy3.C87412m.m108603p(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI.C2934d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI$e */
    public static final class C2935e implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f14422a;

        public C2935e(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI) {
            this.f14422a = finderHorizontalVideoHalfFeedUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14422a.getIntent();
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
            Intent intent2 = this.f14422a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: V7 */
    public static final void m2802V7(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, boolean z) {
        finderHorizontalVideoHalfFeedUI.getClass();
        Log.m105924i("FinderHalfScreenUI", "showRetryTips ifShow:" + z);
        View findViewById = finderHorizontalVideoHalfFeedUI.findViewById(C0966R.C0970id.is8);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C14819r0(finderHorizontalVideoHalfFeedUI, findViewById));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 162;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f14414u;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        C87412m.m108603p("loader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter = this.f14412s;
        if (finderHalfScreenContract$Presenter != null) {
            return finderHalfScreenContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9764h3 h3Var = this.f14413t;
        if (h3Var != null) {
            return h3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        FinderItem e;
        Class cls = C61212e.class;
        String str = "";
        setMMTitle(str);
        setBackBtn(new C2931a(this));
        long longExtra = getIntent().getLongExtra("feed_object_id", 0);
        String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        String str2 = stringExtra == null ? str : stringExtra;
        String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        if (!(longExtra == 0 || (e = C65834e.f189316a.mo89871e(longExtra)) == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("use cache cacheTime=");
            long j = (long) 1000;
            sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, e.getTimestamps() / j));
            sb.append(", cacheTime=");
            sb.append(e.getTimestamps());
            sb.append(" current=");
            sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, C31543z5.m39453c() / j));
            sb.append(", urlValidDuration=");
            sb.append(e.getFeedObject().urlValidDuration);
            sb.append('s');
            Log.m105924i("FinderHalfScreenUI", sb.toString());
            if (e.getTimestamps() <= 0 || C31543z5.m39453c() < e.getTimestamps() + (((long) e.getFeedObject().urlValidDuration) * 1000)) {
                this.f14415v = C15585f.f42211a.mo14348k(e);
            }
        }
        if (this.f14415v == null) {
            Log.m105924i("FinderHalfScreenUI", "cache null.show progress");
            mo2991W7(true);
        } else {
            mo2991W7(false);
        }
        int intExtra = getContext().getIntent().getIntExtra("key_reuqest_scene", 31);
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = new FinderFeedShareRelativeListLoader(longExtra, str2, str, 301, false, intExtra, "", ((C13442s8) rVar.mo62444c(context).mo75002a(C13442s8.class)).mo12861q3(), false, 0, false, false, 3840, (C8480h) null);
        finderFeedShareRelativeListLoader.f13574t = new C2932b(this);
        this.f14414u = finderFeedShareRelativeListLoader;
        FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter = new FinderHalfScreenContract$Presenter(this);
        finderHalfScreenContract$Presenter.f13089u = longExtra;
        finderHalfScreenContract$Presenter.f13090v = str;
        finderHalfScreenContract$Presenter.f13094z = this.f14415v;
        finderHalfScreenContract$Presenter.f13091w = str2;
        finderHalfScreenContract$Presenter.f13092x = new C2933c(this, finderHalfScreenContract$Presenter);
        finderHalfScreenContract$Presenter.f13093y = new C2934d(this, finderHalfScreenContract$Presenter);
        this.f14412s = finderHalfScreenContract$Presenter;
        this.f14413t = new C9764h3(this, finderHalfScreenContract$Presenter, 2, 162);
        ((C13539y3) rVar.mo62444c(this).mo75002a(C13539y3.class)).f38407w = false;
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C2935e(this));
    }

    /* renamed from: W7 */
    public final void mo2991W7(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.o8i);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7y;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8757a2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8768g2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8766f5.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8787n2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8773i2.class)));
    }
}
