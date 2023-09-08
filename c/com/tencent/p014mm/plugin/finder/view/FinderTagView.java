package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C50862pq3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004wxy\u0003B\u001d\b\u0016\u0012\b\u0010r\u001a\u0004\u0018\u00010q\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R2\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0012j\b\u0012\u0004\u0012\u00020\n`\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R2\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0012j\b\u0012\u0004\u0012\u00020\n`\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R>\u00100\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001f0'j\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001f`)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010H\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010L\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010P\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010!\u001a\u0004\bN\u0010#\"\u0004\bO\u0010%R\"\u0010R\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010!\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\"\u0010W\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bT\u0010\f\u001a\u0004\bU\u0010\u000e\"\u0004\bV\u0010\u0010R*\u0010`\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R&\u0010h\u001a\u00060aR\u00020\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006z"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderTagView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/finder/view/FinderTagFlowLayout;", "d", "Lcom/tencent/mm/plugin/finder/view/FinderTagFlowLayout;", "getTagLayout", "()Lcom/tencent/mm/plugin/finder/view/FinderTagFlowLayout;", "setTagLayout", "(Lcom/tencent/mm/plugin/finder/view/FinderTagFlowLayout;)V", "tagLayout", "Landroid/view/View;", "e", "Landroid/view/View;", "getOpBtn", "()Landroid/view/View;", "setOpBtn", "(Landroid/view/View;)V", "opBtn", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "getFoldedView", "()Ljava/util/ArrayList;", "setFoldedView", "(Ljava/util/ArrayList;)V", "foldedView", "g", "getAllAddViews", "setAllAddViews", "allAddViews", "", "h", "I", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "i", "Ljava/util/HashMap;", "getTagClickMap", "()Ljava/util/HashMap;", "setTagClickMap", "(Ljava/util/HashMap;)V", "tagClickMap", "Lte3/pq3;", "j", "Lte3/pq3;", "getTagData", "()Lte3/pq3;", "setTagData", "(Lte3/pq3;)V", "tagData", "", "n", "Z", "isFolded", "()Z", "setFolded", "(Z)V", "Lkotlin/Function0;", "Lrx3/b0;", "o", "Lfy3/a;", "getOnFlodListener", "()Lfy3/a;", "setOnFlodListener", "(Lfy3/a;)V", "onFlodListener", "p", "getOnExpandListener", "setOnExpandListener", "onExpandListener", "q", "getHasExpandBtn", "setHasExpandBtn", "hasExpandBtn", "r", "isClickExpand", "setClickExpand", "s", "getRoot", "setRoot", "root", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$b;", "value", "t", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$b;", "getConfig", "()Lcom/tencent/mm/plugin/finder/view/FinderTagView$b;", "setConfig", "(Lcom/tencent/mm/plugin/finder/view/FinderTagView$b;)V", "config", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$c;", "u", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$c;", "getExpandListener", "()Lcom/tencent/mm/plugin/finder/view/FinderTagView$c;", "setExpandListener", "(Lcom/tencent/mm/plugin/finder/view/FinderTagView$c;)V", "expandListener", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$d;", "v", "Lcom/tencent/mm/plugin/finder/view/FinderTagView$d;", "getFlodListener", "()Lcom/tencent/mm/plugin/finder/view/FinderTagView$d;", "setFlodListener", "(Lcom/tencent/mm/plugin/finder/view/FinderTagView$d;)V", "flodListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView */
public final class FinderTagView extends RelativeLayout {

    /* renamed from: w */
    public static final C3978a f17945w = new C3978a((C8480h) null);

    /* renamed from: d */
    public FinderTagFlowLayout f17946d;

    /* renamed from: e */
    public View f17947e;

    /* renamed from: f */
    public ArrayList<View> f17948f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f17949g = new ArrayList<>();

    /* renamed from: h */
    public int f17950h = -1;

    /* renamed from: i */
    public HashMap<Long, Integer> f17951i = new HashMap<>();

    /* renamed from: j */
    public C50862pq3 f17952j;

    /* renamed from: n */
    public boolean f17953n;

    /* renamed from: o */
    public C32224a<C13598b0> f17954o;

    /* renamed from: p */
    public C32224a<C13598b0> f17955p;

    /* renamed from: q */
    public int f17956q;

    /* renamed from: r */
    public int f17957r;

    /* renamed from: s */
    public View f17958s;

    /* renamed from: t */
    public C3979b f17959t = new C3979b();

    /* renamed from: u */
    public C3980c f17960u = new C3980c(this, this);

    /* renamed from: v */
    public C3981d f17961v = new C3981d(this);

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView$a */
    public static final class C3978a {
        public C3978a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo4748a() {
            C3978a aVar = FinderTagView.f17945w;
            return C0966R.C0970id.d_0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView$b */
    public static final class C3979b {
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView$c */
    public final class C3980c implements View.OnClickListener {

        /* renamed from: d */
        public final FinderTagView f17962d;

        /* renamed from: e */
        public final /* synthetic */ FinderTagView f17963e;

        public C3980c(FinderTagView finderTagView, FinderTagView finderTagView2) {
            C87412m.m108594g(finderTagView2, "tagView");
            this.f17963e = finderTagView;
            this.f17962d = finderTagView2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTagView finderTagView = this.f17962d;
            if (finderTagView.f17953n) {
                for (View addView : finderTagView.f17948f) {
                    finderTagView.getTagLayout().addView(addView);
                }
                finderTagView.f17948f.clear();
                finderTagView.f17953n = false;
                finderTagView.mo4715b();
                C32224a<C13598b0> aVar = finderTagView.f17955p;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f17963e.setClickExpand(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView$d */
    public static final class C3981d implements View.OnClickListener {

        /* renamed from: d */
        public final FinderTagView f17964d;

        public C3981d(FinderTagView finderTagView) {
            C87412m.m108594g(finderTagView, "tagView");
            this.f17964d = finderTagView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderTagView$flodOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTagView finderTagView = this.f17964d;
            finderTagView.getTagLayout().post(new C4050e5(finderTagView));
            this.f17964d.mo4715b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderTagView$flodOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderTagView$e */
    public static final class C3982e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTagView f17965d;

        public C3982e(FinderTagView finderTagView) {
            this.f17965d = finderTagView;
        }

        public final void run() {
            if (((ArrayList) this.f17965d.getTagLayout().f162129d).size() > 1 || !this.f17965d.getFoldedView().isEmpty()) {
                FinderTagView finderTagView = this.f17965d;
                if (!finderTagView.f17953n) {
                    finderTagView.getConfig().getClass();
                    this.f17965d.getOpBtn().setRotation(-90.0f);
                    this.f17965d.getOpBtn().setOnClickListener(this.f17965d.getFlodListener());
                    this.f17965d.mo4717d(true);
                    return;
                }
                finderTagView.mo4717d(true);
                this.f17965d.getOpBtn().setRotation(90.0f);
                this.f17965d.getOpBtn().setOnClickListener(this.f17965d.getExpandListener());
                return;
            }
            this.f17965d.mo4717d(false);
        }
    }

    public FinderTagView(Context context) {
        super(context);
        mo4714a(context);
    }

    /* renamed from: a */
    public final void mo4714a(Context context) {
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.alf, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…chinetab_tag_layout,this)");
        setRoot(inflate);
        View findViewById = getRoot().findViewById(C0966R.C0970id.e2t);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_machine_tag_layout)");
        setTagLayout((FinderTagFlowLayout) findViewById);
        View findViewById2 = getRoot().findViewById(C0966R.C0970id.e2v);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.finder_machine_tag_op_icon)");
        setOpBtn(findViewById2);
        C87412m.m108591d(context);
        Resources resources = context.getResources();
        this.f17959t.getClass();
        setBackgroundColor(resources.getColor(C0966R.color.f2929c));
    }

    /* renamed from: b */
    public final void mo4715b() {
        getTagLayout().post(new C3982e(this));
    }

    /* renamed from: c */
    public final void mo4716c(boolean z, View view, int i) {
        if (i >= 0) {
            view.setTag(-2, Integer.valueOf(i));
        }
        view.setTag(-1, Boolean.valueOf(z));
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.e2r);
        if (z) {
            Resources resources = getRoot().getContext().getResources();
            this.f17959t.getClass();
            textView.setTextColor(resources.getColor(C0966R.color.al_));
            this.f17959t.getClass();
            textView.setBackgroundResource(C0966R.C0969drawable.f357198a31);
            return;
        }
        Resources resources2 = getRoot().getContext().getResources();
        this.f17959t.getClass();
        textView.setTextColor(resources2.getColor(C0966R.color.a7f));
        this.f17959t.getClass();
        textView.setBackgroundResource(C0966R.C0969drawable.f357197a30);
    }

    /* renamed from: d */
    public final void mo4717d(boolean z) {
        if (z) {
            this.f17956q = 1;
            View opBtn = getOpBtn();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(opBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            opBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(opBtn, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = findViewById(C0966R.C0970id.e2u);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.e2s);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        getOpBtn().setOnClickListener((View.OnClickListener) null);
        View opBtn2 = getOpBtn();
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view3 = opBtn2;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        opBtn2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = findViewById(C0966R.C0970id.e2u);
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view4 = findViewById3;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = findViewById(C0966R.C0970id.e2s);
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view5 = findViewById4;
        C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/FinderTagView", "showOrDimissOpBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final ArrayList<View> getAllAddViews() {
        return this.f17949g;
    }

    public final C3979b getConfig() {
        return this.f17959t;
    }

    public final C3980c getExpandListener() {
        return this.f17960u;
    }

    public final C3981d getFlodListener() {
        return this.f17961v;
    }

    public final ArrayList<View> getFoldedView() {
        return this.f17948f;
    }

    public final int getHasExpandBtn() {
        return this.f17956q;
    }

    public final C32224a<C13598b0> getOnExpandListener() {
        return this.f17955p;
    }

    public final C32224a<C13598b0> getOnFlodListener() {
        return this.f17954o;
    }

    public final View getOpBtn() {
        View view = this.f17947e;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("opBtn");
        throw null;
    }

    public final View getRoot() {
        View view = this.f17958s;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public final int getSelectedIndex() {
        return this.f17950h;
    }

    public final HashMap<Long, Integer> getTagClickMap() {
        return this.f17951i;
    }

    public final C50862pq3 getTagData() {
        C50862pq3 pq32 = this.f17952j;
        if (pq32 != null) {
            return pq32;
        }
        C87412m.m108603p("tagData");
        throw null;
    }

    public final FinderTagFlowLayout getTagLayout() {
        FinderTagFlowLayout finderTagFlowLayout = this.f17946d;
        if (finderTagFlowLayout != null) {
            return finderTagFlowLayout;
        }
        C87412m.m108603p("tagLayout");
        throw null;
    }

    public final void setAllAddViews(ArrayList<View> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f17949g = arrayList;
    }

    public final void setClickExpand(int i) {
        this.f17957r = i;
    }

    public final void setConfig(C3979b bVar) {
        C87412m.m108594g(bVar, "value");
        Context context = getContext();
        C87412m.m108591d(context);
        setBackgroundColor(context.getResources().getColor(C0966R.color.f2929c));
    }

    public final void setExpandListener(C3980c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f17960u = cVar;
    }

    public final void setFlodListener(C3981d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f17961v = dVar;
    }

    public final void setFolded(boolean z) {
        this.f17953n = z;
    }

    public final void setFoldedView(ArrayList<View> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f17948f = arrayList;
    }

    public final void setHasExpandBtn(int i) {
        this.f17956q = i;
    }

    public final void setOnExpandListener(C32224a<C13598b0> aVar) {
        this.f17955p = aVar;
    }

    public final void setOnFlodListener(C32224a<C13598b0> aVar) {
        this.f17954o = aVar;
    }

    public final void setOpBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17947e = view;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17958s = view;
    }

    public final void setSelectedIndex(int i) {
        this.f17950h = i;
    }

    public final void setTagClickMap(HashMap<Long, Integer> hashMap) {
        C87412m.m108594g(hashMap, "<set-?>");
        this.f17951i = hashMap;
    }

    public final void setTagData(C50862pq3 pq32) {
        C87412m.m108594g(pq32, "<set-?>");
        this.f17952j = pq32;
    }

    public final void setTagLayout(FinderTagFlowLayout finderTagFlowLayout) {
        C87412m.m108594g(finderTagFlowLayout, "<set-?>");
        this.f17946d = finderTagFlowLayout;
    }

    public FinderTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4714a(context);
    }
}
