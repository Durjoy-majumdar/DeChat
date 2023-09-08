package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import bl3.C39818r;
import cm1.C0740i2;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kf1.C9830k7;
import kf1.C9854m5;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import tf1.C13908i;
import tf1.C13913l;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/loader/FinderAtFeedLoader;", "Lkf1/k7;", "Lcom/tencent/mm/plugin/finder/feed/FinderPreviewTimelineUIContract$Presenter;", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI */
public final class FinderPostPreviewUI extends FinderLoaderFeedUI<FinderAtFeedLoader, C9830k7, FinderPreviewTimelineUIContract$Presenter> {

    /* renamed from: M */
    public static ConcurrentHashMap<Long, FinderItem> f14682M = new ConcurrentHashMap<>();

    /* renamed from: A */
    public final C13601g f14683A = C36568h.m40985a(new C3016e(this));

    /* renamed from: B */
    public final int f14684B = 2;

    /* renamed from: C */
    public final C13601g f14685C = C36568h.m40985a(new C3025o(this));

    /* renamed from: D */
    public final int f14686D = C76577a.m92151b(getContext(), 45);

    /* renamed from: E */
    public final C13601g f14687E = C36568h.m40985a(new C3023m(this));

    /* renamed from: F */
    public final C13601g f14688F = C36568h.m40985a(new C3014c(this));

    /* renamed from: G */
    public final C13601g f14689G = C36568h.m40985a(new C3015d(this));

    /* renamed from: H */
    public final C13601g f14690H = C36568h.m40985a(new C3012a(this));

    /* renamed from: I */
    public final C13601g f14691I = C36568h.m40985a(new C3024n(this));

    /* renamed from: J */
    public Intent f14692J;

    /* renamed from: K */
    public boolean f14693K = true;

    /* renamed from: L */
    public boolean f14694L = true;

    /* renamed from: s */
    public final String f14695s = "Finder.FinderPreviewAtTimelineUI";

    /* renamed from: t */
    public FinderPreviewTimelineUIContract$Presenter f14696t;

    /* renamed from: u */
    public C9830k7 f14697u;

    /* renamed from: v */
    public FinderAtFeedLoader f14698v;

    /* renamed from: w */
    public long f14699w;

    /* renamed from: x */
    public final C13601g f14700x = C36568h.m40985a(new C3026p(this));

    /* renamed from: y */
    public final C13601g f14701y = C36568h.m40985a(new C3013b(this));

    /* renamed from: z */
    public final C13601g f14702z = C36568h.m40985a(new C3022l(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$a */
    public static final class C3012a extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3012a(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14703d = finderPostPreviewUI;
        }

        public Object invoke() {
            return (WeImageView) this.f14703d.findViewById(C0966R.C0970id.bem);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$b */
    public static final class C3013b extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3013b(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14704d = finderPostPreviewUI;
        }

        public Object invoke() {
            return ((C13442s8) C39818r.f106831a.mo62444c(this.f14704d).mo75002a(C13442s8.class)).mo12861q3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$c */
    public static final class C3014c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3014c(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14705d = finderPostPreviewUI;
        }

        public Object invoke() {
            return this.f14705d.findViewById(C0966R.C0970id.btk);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$d */
    public static final class C3015d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3015d(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14706d = finderPostPreviewUI;
        }

        public Object invoke() {
            return this.f14706d.findViewById(C0966R.C0970id.e4h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$e */
    public static final class C3016e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3016e(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14707d = finderPostPreviewUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14707d.getIntent().getIntExtra("KEY_FROM_SCENE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$f */
    public static final class C3017f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14708d;

        public C3017f(FinderPostPreviewUI finderPostPreviewUI) {
            this.f14708d = finderPostPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14708d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$g */
    public static final class C3018g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14709d;

        public C3018g(FinderPostPreviewUI finderPostPreviewUI) {
            this.f14709d = finderPostPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderPostPreviewUI finderPostPreviewUI = this.f14709d;
            Intent intent = finderPostPreviewUI.f14692J;
            if (intent != null) {
                finderPostPreviewUI.finish();
                intent.putExtra("KEY_IS_FULLSCREEN", !finderPostPreviewUI.f14693K);
                C58784w3 w3Var = C58784w3.f168295a;
                FinderAtFeedLoader finderAtFeedLoader = finderPostPreviewUI.f14698v;
                if (finderAtFeedLoader != null) {
                    C58784w3.m68427B1(w3Var, 0, finderAtFeedLoader.getDataList(), (C89349b) null, intent, (C2780c) null, 16, (Object) null);
                    Intent intent2 = finderPostPreviewUI.f14692J;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    FinderPostPreviewUI finderPostPreviewUI2 = finderPostPreviewUI;
                    C117292a.m165358d(finderPostPreviewUI2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finderPostPreviewUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(finderPostPreviewUI2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C87412m.m108603p("feedLoader");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$h */
    public static final class C3019h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14710d;

        public C3019h(FinderPostPreviewUI finderPostPreviewUI) {
            this.f14710d = finderPostPreviewUI;
        }

        public final void run() {
            C9830k7 k7Var = this.f14710d.f14697u;
            if (k7Var != null) {
                k7Var.mo10308D().setEnableLoadMore(false);
                C9830k7 k7Var2 = this.f14710d.f14697u;
                if (k7Var2 != null) {
                    k7Var2.mo10308D().setEnableRefresh(false);
                    C9830k7 k7Var3 = this.f14710d.f14697u;
                    if (k7Var3 != null) {
                        k7Var3.mo10308D().setEnablePullDownHeader(false);
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
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$i */
    public static final class C3020i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3020i(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14711d = finderPostPreviewUI;
        }

        public Object invoke() {
            TextView textView;
            TextView textView2;
            C9830k7 k7Var = this.f14711d.f14697u;
            View view = null;
            if (k7Var != null) {
                View loadMoreFooter = k7Var.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C9830k7 k7Var2 = this.f14711d.f14697u;
                if (k7Var2 != null) {
                    View loadMoreFooter2 = k7Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14711d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C9830k7 k7Var3 = this.f14711d.f14697u;
                    if (k7Var3 != null) {
                        View loadMoreFooter3 = k7Var3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C9830k7 k7Var4 = this.f14711d.f14697u;
                        if (k7Var4 != null) {
                            View loadMoreFooter4 = k7Var4.mo10308D().getLoadMoreFooter();
                            if (loadMoreFooter4 != null) {
                                view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$j */
    public static final class C3021j extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3021j(FinderPostPreviewUI finderPostPreviewUI) {
            super(1);
            this.f14712d = finderPostPreviewUI;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            FinderAtFeedLoader finderAtFeedLoader = this.f14712d.f14698v;
            if (finderAtFeedLoader != null) {
                if (finderAtFeedLoader.getSize() <= 0) {
                    View findViewById = this.f14712d.findViewById(C0966R.C0970id.g3m);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById2 = this.f14712d.findViewById(C0966R.C0970id.knh);
                    if (findViewById2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById3 = this.f14712d.findViewById(C0966R.C0970id.kne);
                    if (findViewById3 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view3 = findViewById3;
                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    View findViewById4 = this.f14712d.findViewById(C0966R.C0970id.g3m);
                    if (findViewById4 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view4 = findViewById4;
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedLoader");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$l */
    public static final class C3022l extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3022l(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14713d = finderPostPreviewUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f14713d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$m */
    public static final class C3023m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3023m(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14714d = finderPostPreviewUI;
        }

        public Object invoke() {
            return this.f14714d.findViewById(C0966R.C0970id.f359417kt3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$n */
    public static final class C3024n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3024n(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14715d = finderPostPreviewUI;
        }

        public Object invoke() {
            return (TextView) this.f14715d.findViewById(C0966R.C0970id.i26);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$o */
    public static final class C3025o extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3025o(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14716d = finderPostPreviewUI;
        }

        public Object invoke() {
            int identifier = this.f14716d.getResources().getIdentifier("status_bar_height", "dimen", Platform.ANDROID);
            return Integer.valueOf(identifier > 0 ? this.f14716d.getResources().getDimensionPixelSize(identifier) : C75044y4.m89994f(this.f14716d.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$p */
    public static final class C3026p extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostPreviewUI f14717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3026p(FinderPostPreviewUI finderPostPreviewUI) {
            super(0);
            this.f14717d = finderPostPreviewUI;
        }

        public Object invoke() {
            String stringExtra = this.f14717d.getIntent().getStringExtra("KEY_USERNAME");
            return stringExtra == null ? C66785b.f191882e.mo90662O5() : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI$k */
    public static final class C3027k implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderAtFeedLoader f14718a;

        /* renamed from: b */
        public final /* synthetic */ FinderPostPreviewUI f14719b;

        public C3027k(FinderAtFeedLoader finderAtFeedLoader, FinderPostPreviewUI finderPostPreviewUI) {
            this.f14718a = finderAtFeedLoader;
            this.f14719b = finderPostPreviewUI;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void call(int r14) {
            /*
                r13 = this;
                java.lang.Class<tz.f> r0 = p707tz.C65000f.class
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r1 = r13.f14718a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
                java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
                boolean r2 = r1 instanceof cm1.C55018j0
                r3 = 0
                if (r2 == 0) goto L_0x0014
                cm1.j0 r1 = (cm1.C55018j0) r1
                goto L_0x0015
            L_0x0014:
                r1 = r3
            L_0x0015:
                r2 = 0
                if (r1 == 0) goto L_0x00ba
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r4 = r13.f14719b
                boolean r5 = r4.f14693K
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.mo3513o()
                r5.setPostFinish()
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.mo3513o()
                java.util.LinkedList r5 = r5.getMediaList()
                java.lang.Object r5 = r5.get(r2)
                te3.rq2 r5 = (te3.C64689rq2) r5
                boolean r1 = r1.mo3479M()
                if (r1 == 0) goto L_0x00ba
                te3.zy r1 = r5.f185235B
                if (r1 == 0) goto L_0x00ba
                gy3.C87412m.m108591d(r1)
                te3.az r1 = r1.f186904i
                gy3.C87412m.m108591d(r1)
                te3.n93 r6 = r1.f297915z
                if (r6 == 0) goto L_0x008d
                boolean r4 = r4.f14693K
                if (r4 == 0) goto L_0x006c
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                di3.d r0 = di3.C86312j.m106911c(r0)
                tz.f r0 = (p707tz.C65000f) r0
                te3.n93 r1 = r1.f297915z
                te3.ep3 r1 = r1.f184446d
                r0.mo89209x8(r1, r4)
                int r0 = r4.width()
                float r0 = (float) r0
                r5.f185270h = r0
                int r0 = r4.height()
                float r0 = (float) r0
                r5.f185271i = r0
                goto L_0x00ba
            L_0x006c:
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                di3.d r0 = di3.C86312j.m106911c(r0)
                tz.f r0 = (p707tz.C65000f) r0
                te3.n93 r1 = r1.f297894A
                te3.ep3 r1 = r1.f184446d
                r0.mo89209x8(r1, r4)
                int r0 = r4.width()
                float r0 = (float) r0
                r5.f185270h = r0
                int r0 = r4.height()
                float r0 = (float) r0
                r5.f185271i = r0
                goto L_0x00ba
            L_0x008d:
                boolean r4 = r4.f14693K
                if (r4 == 0) goto L_0x009c
                int r0 = r1.f297897e
                float r0 = (float) r0
                r5.f185270h = r0
                int r0 = r1.f297898f
                float r0 = (float) r0
                r5.f185271i = r0
                goto L_0x00ba
            L_0x009c:
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                di3.d r0 = di3.C86312j.m106911c(r0)
                tz.f r0 = (p707tz.C65000f) r0
                te3.ep3 r1 = r1.f297899g
                r0.mo89209x8(r1, r4)
                int r0 = r4.width()
                float r0 = (float) r0
                r5.f185270h = r0
                int r0 = r4.height()
                float r0 = (float) r0
                r5.f185271i = r0
            L_0x00ba:
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r0 = r13.f14718a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                boolean r1 = r0 instanceof cm1.C0790x
                if (r1 == 0) goto L_0x00cb
                cm1.x r0 = (cm1.C0790x) r0
                goto L_0x00cc
            L_0x00cb:
                r0 = r3
            L_0x00cc:
                if (r0 == 0) goto L_0x00db
                boolean r1 = r0.mo3479M()
                if (r1 == 0) goto L_0x00db
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                r0.setPostFinish()
            L_0x00db:
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r0 = r13.f14719b
                kf1.k7 r0 = r0.f14697u
                if (r0 == 0) goto L_0x0266
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo10308D()
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
                if (r1 == 0) goto L_0x00f4
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r0 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r0
                goto L_0x00f5
            L_0x00f4:
                r0 = r3
            L_0x00f5:
                r1 = 1
                if (r0 == 0) goto L_0x0150
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r4 = r13.f14718a
                int r4 = r4.getInitPos()
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r12.mo10233c(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r12.mo10233c(r4)
                java.lang.Object[] r5 = r12.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r7 = "call"
                java.lang.String r8 = "(I)V"
                java.lang.String r9 = "Undefined"
                java.lang.String r10 = "scrollToPositionWithOffset"
                java.lang.String r11 = "(II)V"
                r4 = r0
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r4 = r12.mo10231a(r2)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                java.lang.Object r5 = r12.mo10231a(r1)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r0.mo16973V(r4, r5)
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r6 = "call"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "scrollToPositionWithOffset"
                java.lang.String r10 = "(II)V"
                r4 = r0
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                r0.f162357A = r2
            L_0x0150:
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r0 = r13.f14718a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r4 == 0) goto L_0x0161
                r3 = r0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            L_0x0161:
                if (r3 == 0) goto L_0x017d
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r0 = r13.f14719b
                boolean r3 = r3.mo3479M()
                if (r3 == 0) goto L_0x017d
                java.lang.Class<tz.h> r3 = p707tz.C65002h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                tz.h r3 = (p707tz.C65002h) r3
                boolean r0 = r0.f14693K
                r4 = 2
                if (r0 == 0) goto L_0x0179
                goto L_0x017a
            L_0x0179:
                r1 = 2
            L_0x017a:
                r3.mo89217ug(r1, r4)
            L_0x017d:
                r0 = 2131308043(0x7f092e0b, float:1.823433E38)
                if (r14 <= 0) goto L_0x01d0
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r14 = r13.f14719b
                android.view.View r14 = r14.findViewById(r0)
                if (r14 != 0) goto L_0x018c
                goto L_0x0265
            L_0x018c:
                r0 = 8
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo10233c(r0)
                java.lang.Object[] r4 = r1.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r6 = "call"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r14
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.Object r0 = r1.mo10231a(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r14.setVisibility(r0)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r5 = "call"
                java.lang.String r6 = "(I)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0265
            L_0x01d0:
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r14 = r13.f14719b
                android.view.View r14 = r14.findViewById(r0)
                if (r14 != 0) goto L_0x01d9
                goto L_0x0219
            L_0x01d9:
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.mo10233c(r1)
                java.lang.Object[] r4 = r0.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r6 = "call"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r14
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.Object r0 = r0.mo10231a(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r14.setVisibility(r0)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r5 = "call"
                java.lang.String r6 = "(I)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            L_0x0219:
                com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI r14 = r13.f14719b
                r0 = 2131315333(0x7f094a85, float:1.8249116E38)
                android.view.View r14 = r14.findViewById(r0)
                if (r14 != 0) goto L_0x0225
                goto L_0x0265
            L_0x0225:
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.mo10233c(r1)
                java.lang.Object[] r4 = r0.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r6 = "call"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r14
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.Object r0 = r0.mo10231a(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r14.setVisibility(r0)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$3"
                java.lang.String r5 = "call"
                java.lang.String r6 = "(I)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            L_0x0265:
                return
            L_0x0266:
                java.lang.String r14 = "viewCallback"
                gy3.C87412m.m108603p(r14)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPostPreviewUI.C3027k.call(int):void");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (mo3081W7() == 1) {
            return ((Boolean) ((C36570n) this.f14702z).getValue()).booleanValue() ? 62 : 63;
        }
        return 13;
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f14695s;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderAtFeedLoader finderAtFeedLoader = this.f14698v;
        if (finderAtFeedLoader != null) {
            return finderAtFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter = this.f14696t;
        if (finderPreviewTimelineUIContract$Presenter != null) {
            return finderPreviewTimelineUIContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9830k7 k7Var = this.f14697u;
        if (k7Var != null) {
            return k7Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FULLSCREEN", false);
        this.f14693K = booleanExtra;
        if (booleanExtra) {
            mo3083Y7().setText(getString(C0966R.string.mos));
            mo3080V7().setPadding(0, mo3084Z7(), 0, 0);
            View V7 = mo3080V7();
            ViewGroup.LayoutParams layoutParams = mo3080V7().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = View.MeasureSpec.makeMeasureSpec(this.f14686D + mo3084Z7(), 1073741824);
            V7.setLayoutParams(marginLayoutParams);
            View X7 = mo3082X7();
            ViewGroup.LayoutParams layoutParams2 = mo3082X7().getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            X7.setLayoutParams(marginLayoutParams2);
        } else {
            mo3083Y7().setText(getString(C0966R.string.gxy));
            mo3080V7().setPadding(0, mo3084Z7(), 0, 0);
            View V72 = mo3080V7();
            ViewGroup.LayoutParams layoutParams3 = mo3080V7().getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.height = View.MeasureSpec.makeMeasureSpec(this.f14686D + mo3084Z7(), 1073741824);
            V72.setLayoutParams(marginLayoutParams3);
            View X72 = mo3082X7();
            ViewGroup.LayoutParams layoutParams4 = mo3082X7().getLayoutParams();
            C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.topMargin = mo3084Z7() + this.f14686D;
            X72.setLayoutParams(marginLayoutParams4);
        }
        if (this.f14693K || C85875k4.m106211z()) {
            mo3083Y7().setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.a3r));
            ((WeImageView) ((C36570n) this.f14690H).getValue()).setIconColor(-1);
            mo3080V7().setBackground(new ColorDrawable(0));
            mo3082X7().setBackgroundResource(C0966R.color.f2949a6);
            ((View) ((C36570n) this.f14688F).getValue()).setBackgroundResource(C0966R.color.f2949a6);
            setNavigationbarColor(-16777216);
            getController().mo177049H0(true);
        } else {
            mo3083Y7().setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.a3q));
            ((WeImageView) ((C36570n) this.f14690H).getValue()).setIconColor(-16777216);
            mo3080V7().setBackground(new ColorDrawable(getResources().getColor(C0966R.color.BW_93)));
            mo3082X7().setBackgroundResource(C0966R.color.f2975b6);
            ((View) ((C36570n) this.f14688F).getValue()).setBackgroundResource(C0966R.color.UN_BW_93);
            setNavigationbarColor(-1);
            getController().mo177049H0(C85875k4.m106211z());
        }
        this.f14694L = getIntent().getBooleanExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", true);
        mo3083Y7().setVisibility(this.f14694L ? 0 : 4);
        ((WeImageView) ((C36570n) this.f14690H).getValue()).setOnClickListener(new C3017f(this));
        mo3083Y7().setOnClickListener(new C3018g(this));
        this.f14699w = getIntent().getLongExtra("KEY_CACHE_ID", 0);
        String str = this.f14695s;
        Log.m105924i(str, "[initOnCreate] cacheId:" + this.f14699w + " username=" + ((String) ((C36570n) this.f14700x).getValue()) + " fromScene=" + mo3081W7());
        f14682M.clear();
        if (mo3081W7() == 1) {
            C115669n.INSTANCE.mo160131h(21206, Integer.valueOf(C87412m.m108589b((String) ((C36570n) this.f14700x).getValue(), C66785b.f191882e.mo90662O5()) ? 1 : 0), 2);
        }
        boolean booleanValue = ((Boolean) ((C36570n) this.f14702z).getValue()).booleanValue();
        String str2 = (String) ((C36570n) this.f14700x).getValue();
        C87412m.m108593f(str2, "username");
        FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter = new FinderPreviewTimelineUIContract$Presenter(this, booleanValue, str2, this.f14684B, mo3081W7(), (C49712hj1) ((C36570n) this.f14701y).getValue());
        this.f14696t = finderPreviewTimelineUIContract$Presenter;
        this.f14697u = new C9830k7(this, finderPreviewTimelineUIContract$Presenter, this.f14684B, mo2194I7(), mo3081W7() != 1);
        View findViewById = findViewById(C0966R.C0970id.g3m);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById2 = findViewById(C0966R.C0970id.e4h);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C9830k7 k7Var = this.f14697u;
        if (k7Var != null) {
            k7Var.mo10308D().post(new C3019h(this));
            C13908i iVar = C13908i.FEED_AT_TIMELINE;
            String str3 = (String) ((C36570n) this.f14700x).getValue();
            C87412m.m108593f(str3, "username");
            FinderAtFeedLoader finderAtFeedLoader = new FinderAtFeedLoader(iVar, str3, (C49712hj1) ((C36570n) this.f14701y).getValue());
            finderAtFeedLoader.initFromCache(getIntent());
            finderAtFeedLoader.f15435g = new C3020i(this);
            finderAtFeedLoader.f15436h = new C3021j(this);
            finderAtFeedLoader.setInitDone(new C3027k(finderAtFeedLoader, this));
            this.f14698v = finderAtFeedLoader;
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: V7 */
    public final View mo3080V7() {
        return (View) ((C36570n) this.f14689G).getValue();
    }

    /* renamed from: W7 */
    public final int mo3081W7() {
        return ((Number) ((C36570n) this.f14683A).getValue()).intValue();
    }

    /* renamed from: X7 */
    public final View mo3082X7() {
        return (View) ((C36570n) this.f14687E).getValue();
    }

    /* renamed from: Y7 */
    public final TextView mo3083Y7() {
        return (TextView) ((C36570n) this.f14691I).getValue();
    }

    /* renamed from: Z7 */
    public final int mo3084Z7() {
        return ((Number) ((C36570n) this.f14685C).getValue()).intValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.anr;
    }

    public boolean isHideStatusBar() {
        return this.f14693K;
    }

    public void onCreate(Bundle bundle) {
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(67108864);
        this.f14692J = getIntent();
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        f14682M.clear();
    }
}
