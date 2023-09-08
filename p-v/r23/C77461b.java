package r23;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d23.C106976a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import r23.C77475c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;

/* renamed from: r23.b */
public final class C77461b extends RelativeLayout {

    /* renamed from: d */
    public final C13601g f225889d = C36568h.m40985a(new C77470i(this));

    /* renamed from: e */
    public final C13601g f225890e = C36568h.m40985a(new C77469h(this));

    /* renamed from: f */
    public final C13601g f225891f = C36568h.m40985a(new C77474m(this));

    /* renamed from: g */
    public final C13601g f225892g = C36568h.m40985a(new C77471j(this));

    /* renamed from: h */
    public final C13601g f225893h = C36568h.m40985a(new C77472k(this));

    /* renamed from: i */
    public final C13601g f225894i = C36568h.m40985a(new C77473l(this));

    /* renamed from: j */
    public final List<C77482d> f225895j;

    /* renamed from: n */
    public final C77475c f225896n;

    /* renamed from: o */
    public C77468g f225897o;

    /* renamed from: p */
    public C106976a.C75321a f225898p;

    /* renamed from: q */
    public int f225899q;

    /* renamed from: r */
    public C77482d f225900r;

    /* renamed from: s */
    public int f225901s;

    /* renamed from: t */
    public boolean f225902t;

    /* renamed from: r23.b$a */
    public static final class C77462a implements View.OnClickListener {

        /* renamed from: d */
        public static final C77462a f225903d = new C77462a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: r23.b$b */
    public static final class C77463b implements C77475c.C77479c {

        /* renamed from: a */
        public final /* synthetic */ C77461b f225904a;

        public C77463b(C77461b bVar) {
            this.f225904a = bVar;
        }

        /* renamed from: a */
        public void mo107639a(C77482d dVar, int i) {
            C87412m.m108594g(dVar, "item");
            if (!dVar.f225928b) {
                C77461b bVar = this.f225904a;
                bVar.f225900r.f225928b = false;
                bVar.f225896n.notifyItemChanged(bVar.f225899q, new Object());
                dVar.f225928b = true;
                this.f225904a.f225896n.notifyItemChanged(i, new Object());
                C77461b bVar2 = this.f225904a;
                bVar2.f225899q = i;
                bVar2.f225900r = dVar;
                C77468g gVar = bVar2.f225897o;
                if (gVar != null) {
                    gVar.mo107644j(bVar2.f225901s, dVar.f225927a);
                }
            }
        }
    }

    /* renamed from: r23.b$c */
    public static final class C77464c extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ int f225905d;

        public C77464c(int i) {
            this.f225905d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            int i = this.f225905d;
            rect.left = i;
            rect.right = i;
        }
    }

    /* renamed from: r23.b$d */
    public static final class C77465d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225906d;

        public C77465d(C77461b bVar) {
            this.f225906d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77461b bVar = this.f225906d;
            bVar.setApplyAll(!bVar.f225902t);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: r23.b$e */
    public static final class C77466e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225907d;

        public C77466e(C77461b bVar) {
            this.f225907d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
            r8 = r7.f225907d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$5"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                r23.b r8 = r7.f225907d
                d23.a$a r0 = r8.f225898p
                r23.d r8 = r8.f225900r
                d23.a$a r8 = r8.f225927a
                boolean r8 = gy3.C87412m.m108589b(r0, r8)
                if (r8 != 0) goto L_0x0036
                r23.b r8 = r7.f225907d
                r23.b$g r0 = r8.f225897o
                if (r0 == 0) goto L_0x0036
                int r1 = r8.f225901s
                d23.a$a r8 = r8.f225898p
                r0.mo107644j(r1, r8)
            L_0x0036:
                r23.b r8 = r7.f225907d
                r23.b$g r8 = r8.f225897o
                if (r8 == 0) goto L_0x003f
                r8.mo107643a()
            L_0x003f:
                java.lang.String r8 = "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$5"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r23.C77461b.C77466e.onClick(android.view.View):void");
        }
    }

    /* renamed from: r23.b$f */
    public static final class C77467f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225908d;

        public C77467f(C77461b bVar) {
            this.f225908d = bVar;
        }

        public final void onClick(View view) {
            C77468g gVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77461b bVar = this.f225908d;
            if (bVar.f225902t && (gVar = bVar.f225897o) != null) {
                gVar.mo107645t(bVar.f225901s, bVar.f225900r.f225927a);
            }
            C77468g gVar2 = this.f225908d.f225897o;
            if (gVar2 != null) {
                gVar2.mo107643a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: r23.b$g */
    public interface C77468g {
        /* renamed from: a */
        void mo107643a();

        /* renamed from: j */
        void mo107644j(int i, C106976a.C75321a aVar);

        /* renamed from: t */
        void mo107645t(int i, C106976a.C75321a aVar);
    }

    /* renamed from: r23.b$h */
    public static final class C77469h extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77469h(C77461b bVar) {
            super(0);
            this.f225909d = bVar;
        }

        public Object invoke() {
            return (LinearLayout) this.f225909d.findViewById(C0966R.C0970id.f6114xp);
        }
    }

    /* renamed from: r23.b$i */
    public static final class C77470i extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77470i(C77461b bVar) {
            super(0);
            this.f225910d = bVar;
        }

        public Object invoke() {
            return (ImageView) this.f225910d.findViewById(C0966R.C0970id.f6115xq);
        }
    }

    /* renamed from: r23.b$j */
    public static final class C77471j extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77471j(C77461b bVar) {
            super(0);
            this.f225911d = bVar;
        }

        public Object invoke() {
            return (WeImageView) this.f225911d.findViewById(C0966R.C0970id.bem);
        }
    }

    /* renamed from: r23.b$k */
    public static final class C77472k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77472k(C77461b bVar) {
            super(0);
            this.f225912d = bVar;
        }

        public Object invoke() {
            return (ImageView) this.f225912d.findViewById(C0966R.C0970id.blr);
        }
    }

    /* renamed from: r23.b$l */
    public static final class C77473l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77473l(C77461b bVar) {
            super(0);
            this.f225913d = bVar;
        }

        public Object invoke() {
            return this.f225913d.findViewById(C0966R.C0970id.cix);
        }
    }

    /* renamed from: r23.b$m */
    public static final class C77474m extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C77461b f225914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77474m(C77461b bVar) {
            super(0);
            this.f225914d = bVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f225914d.findViewById(C0966R.C0970id.iip);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77461b(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f225895j = arrayList;
        this.f225900r = new C77482d((C106976a.C75321a) null, false, 3, (C8480h) null);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.a0j, this, true);
        C77475c cVar = new C77475c(arrayList);
        this.f225896n = cVar;
        setOnClickListener(C77462a.f225903d);
        if (z) {
            mo107636c();
        }
        setApplyAll(this.f225902t);
        cVar.f225916e = new C77463b(this);
        getTransitionRecycler().setLayoutManager(new LinearLayoutManager(context, 0, false));
        getTransitionRecycler().setAdapter(cVar);
        getTransitionRecycler().setItemAnimator((RecyclerView.C16616j) null);
        getTransitionRecycler().mo17085h0(new C77464c(getItemOffsetLength()));
        getApplyAllTransitionGroup().setOnClickListener(new C77465d(this));
        getCloseIcon().setOnClickListener(new C77466e(this));
        getConfirmIcon().setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_done, context.getResources().getColor(C0966R.color.f2960ag)));
        getConfirmIcon().setOnClickListener(new C77467f(this));
    }

    private final LinearLayout getApplyAllTransitionGroup() {
        return (LinearLayout) ((C36570n) this.f225890e).getValue();
    }

    private final ImageView getApplyAllTransitionIcon() {
        return (ImageView) ((C36570n) this.f225889d).getValue();
    }

    private final WeImageView getCloseIcon() {
        return (WeImageView) ((C36570n) this.f225892g).getValue();
    }

    private final ImageView getConfirmIcon() {
        return (ImageView) ((C36570n) this.f225893h).getValue();
    }

    private final View getEmptyHolder() {
        return (View) ((C36570n) this.f225894i).getValue();
    }

    private final int getItemOffsetLength() {
        int A = C76577a.m92145A(getContext()) - C76577a.m92150a(getContext(), 26.0f);
        int h = C76577a.m92157h(getContext(), C0966R.dimen.f3761db);
        int i = (A * 10) / h;
        int i2 = i % 10;
        int i3 = i / 10;
        return i2 > 7 ? (A - ((int) (((float) (h / 2)) * (((float) i3) + 1.5f)))) / (((i3 + 1) * 2) + 1) : i2 < 2 ? (A - ((int) (((float) (h / 2)) * (((float) i3) + 0.5f)))) / ((i3 * 2) + 1) : h / 4;
    }

    private final RecyclerView getTransitionRecycler() {
        return (RecyclerView) ((C36570n) this.f225891f).getValue();
    }

    /* access modifiers changed from: private */
    public final void setApplyAll(boolean z) {
        this.f225902t = z;
        getApplyAllTransitionIcon().setImageDrawable(C74933u4.m89768e(getContext(), this.f225902t ? C0966R.raw.ui_rescoures_checkbox_selected : C0966R.raw.ui_rescoures_checkbox_unselected, Color.parseColor("#CCFFFFFF")));
    }

    /* renamed from: b */
    public final void mo107635b(int i, int i2) {
        T t;
        boolean z;
        C106976a aVar = C106976a.f320208a;
        Iterator<T> it = C106976a.f320211d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C106976a.C75321a) t).f221479b == i2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        this.f225898p = (C106976a.C75321a) t;
        this.f225901s = i;
        this.f225900r.f225928b = false;
        this.f225896n.notifyItemChanged(this.f225899q);
        Iterator it4 = ((ArrayList) this.f225895j).iterator();
        int i3 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i3 = -1;
                break;
            } else if (C87412m.m108589b(((C77482d) it4.next()).f225927a, this.f225898p)) {
                break;
            } else {
                i3++;
            }
        }
        this.f225899q = i3;
        this.f225900r = (C77482d) ((ArrayList) this.f225895j).get(i3);
        RecyclerView transitionRecycler = getTransitionRecycler();
        int i4 = this.f225899q;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i4));
        RecyclerView recyclerView = transitionRecycler;
        C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initStatus", "(II)V", "Undefined", "scrollToPosition", "(I)V");
        transitionRecycler.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initStatus", "(II)V", "Undefined", "scrollToPosition", "(I)V");
        this.f225900r.f225928b = true;
        this.f225896n.notifyItemChanged(this.f225899q);
        setApplyAll(false);
    }

    /* renamed from: c */
    public final void mo107636c() {
        this.f225895j.clear();
        this.f225895j.add(new C77482d((C106976a.C75321a) null, false, 3, (C8480h) null));
        C106976a aVar = C106976a.f320208a;
        for (C106976a.C75321a dVar : C106976a.f320211d) {
            this.f225895j.add(new C77482d(dVar, false));
        }
        Log.m105924i("MicroMsg.EditorEditTransitionView", "initTransitionInfo: size:" + this.f225895j.size());
        this.f225899q = 0;
        this.f225900r = (C77482d) C110818d0.m150914L(this.f225895j);
        if (this.f225895j.size() <= 1) {
            View emptyHolder = getEmptyHolder();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = emptyHolder;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initTransitionInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            emptyHolder.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initTransitionInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getApplyAllTransitionGroup().setVisibility(4);
            getTransitionRecycler().setVisibility(4);
            C106976a aVar3 = C106976a.f320208a;
            C106976a.f320216i = new WeakReference<>(this);
            return;
        }
        View emptyHolder2 = getEmptyHolder();
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(4);
        View view2 = emptyHolder2;
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initTransitionInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        emptyHolder2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/transition/EditorEditTransitionView", "initTransitionInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getApplyAllTransitionGroup().setVisibility(0);
        getTransitionRecycler().setVisibility(0);
        this.f225896n.notifyDataSetChanged();
    }

    public final void setEditTransitionListener(C77468g gVar) {
        C87412m.m108594g(gVar, "listenerEdit");
        this.f225897o = gVar;
    }
}
