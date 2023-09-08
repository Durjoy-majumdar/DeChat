package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0741j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.view.C4050e5;
import com.tencent.p014mm.plugin.finder.view.C4054f5;
import com.tencent.p014mm.plugin.finder.view.FinderTagView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fo1.C8177b;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import te3.C50862pq3;
import te3.C51270sn1;

/* renamed from: ve1.p3 */
public final class C14599p3 extends C60896i<C0741j> {

    /* renamed from: i */
    public static int f40426i = -2;

    /* renamed from: e */
    public final C8177b f40427e;

    /* renamed from: f */
    public boolean f40428f;

    /* renamed from: g */
    public FinderTagView f40429g;

    /* renamed from: h */
    public final C14601b f40430h = new C14601b(this);

    /* renamed from: ve1.p3$a */
    public static final class C14600a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f40431d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<View> f40432e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<FrameLayout> f40433f;

        public C14600a(ViewGroup viewGroup, C8479f0<View> f0Var, C8479f0<FrameLayout> f0Var2) {
            this.f40431d = viewGroup;
            this.f40432e = f0Var;
            this.f40433f = f0Var2;
        }

        public final void run() {
            this.f40431d.removeView((View) this.f40432e.f27484d);
            ((FrameLayout) this.f40433f.f27484d).getLayoutParams().height = -2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            ((FrameLayout) this.f40433f.f27484d).addView((View) this.f40432e.f27484d, layoutParams);
        }
    }

    /* renamed from: ve1.p3$b */
    public static final class C14601b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final int[] f40434d = new int[2];

        /* renamed from: e */
        public final int[] f40435e = new int[2];

        /* renamed from: f */
        public final /* synthetic */ C14599p3 f40436f;

        public C14601b(C14599p3 p3Var) {
            this.f40436f = p3Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            Log.m105918d("Finder.FinderFeedTagsConvert", "newState:" + i);
            if (i == 2) {
                C14599p3 p3Var = this.f40436f;
                if (!p3Var.f40428f) {
                    View b = p3Var.f40427e.mo2654b();
                    FinderTagView.f17945w.mo4748a();
                    if (b.findViewById(C0966R.C0970id.d_0) == null) {
                        Log.m105918d("Finder.FinderFeedTagsConvert", "chekToAddFLoatTagViewWhenFling: ");
                        p3Var.f40428f = true;
                        FinderTagView finderTagView = p3Var.f40429g;
                        ViewGroup viewGroup = null;
                        ViewParent parent = finderTagView != null ? finderTagView.getParent() : null;
                        if (parent instanceof ViewGroup) {
                            viewGroup = (ViewGroup) parent;
                        }
                        if (viewGroup != null) {
                            viewGroup.removeView(p3Var.f40429g);
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            FinderTagView finderTagView2 = p3Var.f40429g;
                            layoutParams.height = finderTagView2 != null ? finderTagView2.getHeight() : -2;
                        }
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 48;
                        View b2 = p3Var.f40427e.mo2654b();
                        C87412m.m108592e(b2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) b2).addView(p3Var.f40429g, layoutParams2);
                    }
                }
                Log.m105918d("Finder.FinderFeedTagsConvert", "chekToAddFLoatTagViewWhenFling:return");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (C14599p3.f40426i > -2) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.f44890d];
                staggeredGridLayoutManager.mo17394A(iArr);
                Log.m105918d("Finder.FinderFeedTagsConvert", "visiablePosition:" + iArr[0] + ",positionInListView:" + C14599p3.f40426i);
                int i3 = iArr[0];
                int i4 = C14599p3.f40426i;
                if (i3 == i4) {
                    RecyclerView.C16631z I0 = recyclerView.mo17023I0(i4);
                    C87412m.m108592e(I0, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                    C60905o oVar = (C60905o) I0;
                    oVar.f44854d.getLocationInWindow(this.f40434d);
                    recyclerView.getLocationInWindow(this.f40435e);
                    int i5 = this.f40435e[1] - this.f40434d[1];
                    if (i5 > 0) {
                        Log.m105918d("Finder.FinderFeedTagsConvert", "changeToDecorView:entrace 1");
                        C14599p3 p3Var = this.f40436f;
                        View b = p3Var.f40427e.mo2654b();
                        C87412m.m108592e(b, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) b;
                        if (p3Var.f40428f) {
                            Log.m105918d("Finder.FinderFeedTagsConvert", "changeToDecorView:return");
                        } else {
                            p3Var.f40428f = true;
                            Log.m105918d("Finder.FinderFeedTagsConvert", "changeToDecorView,in");
                            FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.ke9);
                            FinderTagView.f17945w.mo4748a();
                            View D = oVar.mo85812D(C0966R.C0970id.d_0);
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(4);
                            View view = D;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            frameLayout.getLayoutParams().height = D.getHeight();
                            frameLayout.removeView(D);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            layoutParams.gravity = 48;
                            viewGroup.addView(D, layoutParams);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(0);
                            View view2 = D;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (i5 <= 0) {
                        Log.m105918d("Finder.FinderFeedTagsConvert", "changeToItemView:entrace 1");
                        C14599p3 p3Var2 = this.f40436f;
                        View b2 = p3Var2.f40427e.mo2654b();
                        C87412m.m108592e(b2, "null cannot be cast to non-null type android.view.ViewGroup");
                        p3Var2.mo13827j((ViewGroup) b2, oVar, recyclerView);
                    }
                } else {
                    RecyclerView.C16631z I02 = recyclerView.mo17023I0(i4);
                    if (I02 != null) {
                        C14599p3 p3Var3 = this.f40436f;
                        Log.m105918d("Finder.FinderFeedTagsConvert", "changeToItemView:entrace 2");
                        View b3 = p3Var3.f40427e.mo2654b();
                        C87412m.m108592e(b3, "null cannot be cast to non-null type android.view.ViewGroup");
                        p3Var3.mo13827j((ViewGroup) b3, (C60905o) I02, recyclerView);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C14599p3(C8177b bVar) {
        C87412m.m108594g(bVar, "viewCallBackTag");
        this.f40427e = bVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aq5;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        recyclerView.mo17098m1(this.f40430h);
        recyclerView.mo17043c(this.f40430h);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0741j jVar = (C0741j) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(jVar, "item");
        Log.m105918d("Finder.FinderFeedTagsConvert", "onBindViewHolder");
        f40426i = i;
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        if (!jVar.f1762d.f139904d.isEmpty()) {
            View D = oVar.mo85812D(C0966R.C0970id.ke9);
            C87412m.m108593f(D, "holder.getView(ITEM_CONTAINER_ID)");
            FrameLayout frameLayout = (FrameLayout) D;
            View b = this.f40427e.mo2654b();
            FinderTagView.f17945w.mo4748a();
            View findViewById = b.findViewById(C0966R.C0970id.d_0);
            if (findViewById != null) {
                Log.m105918d("Finder.FinderFeedTagsConvert", "exits float view,put in auto");
                frameLayout.getLayoutParams().height = findViewById.getLayoutParams().height;
            } else if (frameLayout.getChildCount() != 0) {
                Log.m105918d("Finder.FinderFeedTagsConvert", "container has content already");
            } else {
                Log.m105918d("Finder.FinderFeedTagsConvert", "no float view,create now");
                FinderTagView finderTagView = new FinderTagView(oVar.f173499A);
                C50862pq3 pq32 = jVar.f1762d;
                if (pq32 != null) {
                    LinkedList<C51270sn1> linkedList = pq32.f139904d;
                    if (linkedList != null) {
                        C51270sn1 sn12 = new C51270sn1();
                        sn12.f141617d = finderTagView.getContext().getResources().getString(C0966R.string.eqt);
                        sn12.f141618e = -1;
                        finderTagView.f17951i.put(-1L, 1);
                        linkedList.addFirst(sn12);
                    }
                    finderTagView.setTagData(pq32);
                    finderTagView.getTagLayout().removeAllViews();
                    ((ArrayList) finderTagView.getTagLayout().f162129d).clear();
                    int size = finderTagView.getTagData().f139904d.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C51270sn1 sn13 = finderTagView.getTagData().f139904d.get(i3);
                        C87412m.m108593f(sn13, "tagData.topic_list[i]");
                        C51270sn1 sn14 = sn13;
                        View inflate = C85868k2.m106137b(finderTagView.getRoot().getContext()).inflate(C0966R.C0971layout.ale, (ViewGroup) null);
                        View findViewById2 = inflate.findViewById(C0966R.C0970id.e2r);
                        C87412m.m108593f(findViewById2, "view.findViewById<TextVi…d.finder_machine_item_tv)");
                        ((TextView) findViewById2).setText(sn14.f141617d);
                        if (sn14.f141618e == -1) {
                            finderTagView.mo4716c(true, inflate, i3);
                        } else {
                            finderTagView.mo4716c(false, inflate, i3);
                        }
                        inflate.setOnClickListener(new C4054f5(finderTagView));
                        finderTagView.f17949g.add(inflate);
                        finderTagView.getTagLayout().addView(inflate);
                    }
                    finderTagView.mo4715b();
                }
                finderTagView.getTagLayout().post(new C4050e5(finderTagView));
                FinderTagView.f17945w.mo4748a();
                finderTagView.setId(C0966R.C0970id.d_0);
                finderTagView.setVisibility(4);
                Log.m105918d("Finder.FinderFeedTagsConvert", "put dummy item");
                frameLayout.addView(finderTagView);
                this.f40429g = finderTagView;
                finderTagView.setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
    }

    /* renamed from: j */
    public final void mo13827j(ViewGroup viewGroup, C60905o oVar, RecyclerView recyclerView) {
        T t;
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(recyclerView, "recylerView");
        if (!this.f40428f) {
            Log.m105918d("Finder.FinderFeedTagsConvert", "changeToItemView:return");
            return;
        }
        this.f40428f = false;
        Log.m105918d("Finder.FinderFeedTagsConvert", "changeToItemView,in");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = oVar.mo85812D(C0966R.C0970id.ke9);
        C8479f0 f0Var2 = new C8479f0();
        FinderTagView.f17945w.mo4748a();
        T findViewById = viewGroup.findViewById(C0966R.C0970id.d_0);
        f0Var2.f27484d = findViewById;
        if (findViewById == null || (t = f0Var.f27484d) == null || ((FrameLayout) t).getChildCount() != 0) {
            Log.m105918d("Finder.FinderFeedTagsConvert", "changeToItemView:item has been add,return ");
        } else {
            recyclerView.post(new C14600a(viewGroup, f0Var2, f0Var));
        }
    }
}
