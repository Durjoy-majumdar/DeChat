package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0712b0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.HorizontalRecyclerView;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C50005jl1;
import te3.C64273c21;
import zp3.C16382e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109B#\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\b8\u0010;J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002J\u0006\u0010\n\u001a\u00020\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010.\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006<"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderSnsHeaderView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "listener", "setOnInterceptListener", "", "setVisibilityChangedListener", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;", "e", "Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;)V", "recyclerView", "Landroidx/recyclerview/widget/LinearLayoutManager;", "f", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "layoutManager", "Landroid/view/View;", "g", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "contentView", "i", "getClearBtn", "setClearBtn", "clearBtn", "Lzp3/e;", "j", "Lzp3/e;", "getViewCallback", "()Lzp3/e;", "viewCallback", "Lcom/tencent/mm/plugin/finder/view/b5;", "presenter", "Lcom/tencent/mm/plugin/finder/view/b5;", "getPresenter", "()Lcom/tencent/mm/plugin/finder/view/b5;", "setPresenter", "(Lcom/tencent/mm/plugin/finder/view/b5;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView */
public final class FinderSnsHeaderView extends FrameLayout {

    /* renamed from: d */
    public final String f17933d = "Finder.FinderSnsHeaderView";

    /* renamed from: e */
    public HorizontalRecyclerView f17934e;

    /* renamed from: f */
    public LinearLayoutManager f17935f;

    /* renamed from: g */
    public View f17936g;

    /* renamed from: h */
    public C32226l<? super Integer, C13598b0> f17937h;

    /* renamed from: i */
    public View f17938i;

    /* renamed from: j */
    public final C16382e f17939j = new C4037d5(this);

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$a */
    public static final class C3973a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f17940d;

        public C3973a(FinderSnsHeaderView finderSnsHeaderView) {
            this.f17940d = finderSnsHeaderView;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
            int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.a66);
            int N0 = recyclerView.mo17029N0(view);
            RecyclerView.C16613e adapter = this.f17940d.getRecyclerView().getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (N0 == 0) {
                rect.left = dimension;
                rect.right = dimension2;
                rect.bottom = 0;
                rect.top = 0;
            } else if (N0 == itemCount - 1) {
                rect.left = dimension2;
                rect.right = dimension;
                rect.bottom = 0;
                rect.top = 0;
            } else {
                rect.left = dimension2;
                rect.right = dimension2;
                rect.bottom = 0;
                rect.top = 0;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$b */
    public static final class C3974b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f17941d;

        public C3974b(FinderSnsHeaderView finderSnsHeaderView) {
            this.f17941d = finderSnsHeaderView;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f17941d.getClearBtn().getHitRect(rect);
            rect.inset(rect.width() * -2, -rect.width());
            ViewParent parent = this.f17941d.getClearBtn().getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f17941d.getClearBtn()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$c */
    public static final class C3975c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f17942d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$c$a */
        public static final class C3976a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ FinderSnsHeaderView f17943d;

            public C3976a(int i, FinderSnsHeaderView finderSnsHeaderView, int i2) {
                this.f17943d = finderSnsHeaderView;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                boolean z = true;
                e0Var.mo107140d(1, this.f17943d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f17943d.getContext().getString(C0966R.string.f7930wk));
                this.f17943d.getClass();
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_SNS_LIVE_LIST_SETTING_ENABLE_INT_SYNC, 0);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) f).intValue() != 1) {
                    z = false;
                }
                if (z) {
                    e0Var.mo107125a(2, C0966R.string.epw);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$c$b */
        public static final class C3977b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ FinderSnsHeaderView f17944d;

            public C3977b(int i, FinderSnsHeaderView finderSnsHeaderView, int i2) {
                this.f17944d = finderSnsHeaderView;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                LinkedList<FinderContact> linkedList;
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    C4020b5 presenter = this.f17944d.getPresenter();
                    ArrayList<E> a = presenter.mo4871a(C0712b0.class);
                    C61926c.m72661F("FinderSnsLiveListExpose", new C56584a5(a, 61));
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    sb.append(",2,");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(a, 10));
                    Iterator<E> it = a.iterator();
                    while (it.hasNext()) {
                        C64273c21 c212 = ((C0712b0) it.next()).f1709d.liveInfo;
                        arrayList.add(Long.valueOf(c212 != null ? c212.f182392d : 0));
                    }
                    sb.append(C110818d0.m150921S(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                    sb.append(',');
                    sb.append(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
                    sb.append(',');
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(a, 10));
                    Iterator<E> it4 = a.iterator();
                    while (it4.hasNext()) {
                        C50005jl1 jl12 = ((C0712b0) it4.next()).f1709d.snsShareInfo;
                        if (jl12 == null || (linkedList = jl12.f136177g) == null) {
                            str = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList, 10));
                            for (FinderContact finderContact : linkedList) {
                                arrayList3.add(finderContact.username);
                            }
                            str = C110818d0.m150921S(arrayList3, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                        }
                        arrayList2.add(str);
                    }
                    sb.append(C110818d0.m150921S(arrayList2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                    C115669n.INSTANCE.kvStat(21530, sb.toString());
                    presenter.getClass();
                    throw null;
                } else if (itemId == 2) {
                    C4020b5 presenter2 = this.f17944d.getPresenter();
                    presenter2.getClass();
                    String format = String.format("%s,%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis()), 3}, 2));
                    C87412m.m108593f(format, "format(format, *args)");
                    C115669n.INSTANCE.kvStat(21529, format);
                    Intent intent = new Intent();
                    presenter2.getClass();
                    intent.setClassName((Context) null, "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI");
                    presenter2.getClass();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d((Object) null, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderPresenter", "goSetting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Intent intent2 = (Intent) aVar.mo10231a(0);
                    throw null;
                }
            }
        }

        public C3975c(FinderSnsHeaderView finderSnsHeaderView) {
            this.f17942d = finderSnsHeaderView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n nVar = new C77407n(this.f17942d.getContext(), 1, true);
            FinderSnsHeaderView finderSnsHeaderView = this.f17942d;
            nVar.f225771i = new C3976a(1, finderSnsHeaderView, 2);
            nVar.f225782p = new C3977b(1, finderSnsHeaderView, 2);
            nVar.mo107573q();
            ArrayList<E> a = this.f17942d.getPresenter().mo4871a(C0712b0.class);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(",1,");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(a, 10));
            for (E e : a) {
                C64273c21 c212 = e.f1709d.liveInfo;
                arrayList2.add(Long.valueOf(c212 != null ? c212.f182392d : 0));
            }
            sb.append(C110818d0.m150921S(arrayList2, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            sb.append(',');
            sb.append(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
            C115669n.INSTANCE.kvStat(21530, sb.toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSnsHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        new C4032c5();
    }

    /* renamed from: a */
    public final void mo4696a() {
        C75592q0.m90781k();
        getPresenter().getClass();
        throw null;
    }

    /* renamed from: b */
    public final void mo4697b() {
        View clearBtn = getClearBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(clearBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        clearBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(clearBtn, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getClearBtn().post(new C3974b(this));
        getClearBtn().setOnClickListener(new C3975c(this));
    }

    public final View getClearBtn() {
        View view = this.f17938i;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("clearBtn");
        throw null;
    }

    public final View getContentView() {
        View view = this.f17936g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C3973a(this);
    }

    public final LinearLayoutManager getLayoutManager() {
        LinearLayoutManager linearLayoutManager = this.f17935f;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        C87412m.m108603p("layoutManager");
        throw null;
    }

    public final C4020b5 getPresenter() {
        C87412m.m108603p("presenter");
        throw null;
    }

    public final HorizontalRecyclerView getRecyclerView() {
        HorizontalRecyclerView horizontalRecyclerView = this.f17934e;
        if (horizontalRecyclerView != null) {
            return horizontalRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final C16382e getViewCallback() {
        return this.f17939j;
    }

    public final void setClearBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17938i = view;
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17936g = view;
    }

    public final void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        C87412m.m108594g(linearLayoutManager, "<set-?>");
        this.f17935f = linearLayoutManager;
    }

    public final void setOnInterceptListener(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getRecyclerView().setOnInterceptChangedListener(lVar);
    }

    public final void setPresenter(C4020b5 b5Var) {
        C87412m.m108594g(b5Var, "<set-?>");
    }

    public final void setRecyclerView(HorizontalRecyclerView horizontalRecyclerView) {
        C87412m.m108594g(horizontalRecyclerView, "<set-?>");
        this.f17934e = horizontalRecyclerView;
    }

    public final void setVisibilityChangedListener(C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f17937h = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSnsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new C4032c5();
    }
}
