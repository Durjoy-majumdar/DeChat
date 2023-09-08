package qk1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.FinderTagFlowLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ok1.C11471u;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C51228sd2;
import te3.C51349t61;

/* renamed from: qk1.y1 */
public final class C12855y1 extends RecyclerView.C16613e<C12857b> {

    /* renamed from: A */
    public C12861f f36779A;

    /* renamed from: B */
    public View f36780B;

    /* renamed from: C */
    public int f36781C;

    /* renamed from: D */
    public int[] f36782D;

    /* renamed from: E */
    public int f36783E;

    /* renamed from: F */
    public int f36784F;

    /* renamed from: G */
    public final ArrayList<C12858c> f36785G;

    /* renamed from: H */
    public ArrayList<C51349t61> f36786H;

    /* renamed from: I */
    public final int f36787I;

    /* renamed from: J */
    public int f36788J;

    /* renamed from: K */
    public int f36789K;

    /* renamed from: L */
    public int f36790L;

    /* renamed from: d */
    public final C11471u.C11473b f36791d;

    /* renamed from: e */
    public Resources f36792e;

    /* renamed from: f */
    public final View f36793f;

    /* renamed from: g */
    public final C54991o f36794g;

    /* renamed from: h */
    public final String f36795h = "FinderLiveMemberLinearAdapter";

    /* renamed from: i */
    public final int f36796i;

    /* renamed from: j */
    public final int f36797j;

    /* renamed from: n */
    public final int f36798n;

    /* renamed from: o */
    public final int f36799o;

    /* renamed from: p */
    public final int f36800p;

    /* renamed from: q */
    public final int f36801q;

    /* renamed from: r */
    public final int f36802r;

    /* renamed from: s */
    public final int f36803s;

    /* renamed from: t */
    public final int f36804t;

    /* renamed from: u */
    public boolean f36805u;

    /* renamed from: v */
    public int f36806v;

    /* renamed from: w */
    public int f36807w;

    /* renamed from: x */
    public ArrayList<C12858c> f36808x;

    /* renamed from: y */
    public C32226l<? super C49765hx0, C13598b0> f36809y;

    /* renamed from: z */
    public int f36810z;

    /* renamed from: qk1.y1$a */
    public static final class C12856a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C12855y1 f36811d;

        public C12856a(C12855y1 y1Var) {
            this.f36811d = y1Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView2);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView2, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C12855y1 y1Var = this.f36811d;
            int i3 = y1Var.f36810z;
            if (i3 > 0 && i3 < Integer.MAX_VALUE) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int E = linearLayoutManager.mo16959E();
                Object tag = y1Var.f36780B.getTag();
                boolean b = C87412m.m108589b(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE);
                C62042e eVar = C62042e.f176370a;
                String str = y1Var.f36795h;
                eVar.mo86998D1(str, "onScrolled lastVisiblePos:" + E + ",selfItemPosition:" + y1Var.f36810z + ",haveAttachStickView:" + b);
                int i4 = y1Var.f36810z;
                if (E < i4 && b) {
                    View view = y1Var.f36793f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (E > i4) {
                    View view3 = y1Var.f36793f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    y1Var.f36782D[1] = 0;
                    View findViewByPosition = linearLayoutManager.findViewByPosition(E);
                    if (findViewByPosition != null) {
                        findViewByPosition.getLocationOnScreen(y1Var.f36782D);
                    }
                    String str2 = y1Var.f36795h;
                    eVar.mo86998D1(str2, "onScrolled lastVisibleViewY:" + y1Var.f36782D[1] + ",stickViewY:" + y1Var.f36781C);
                    if (y1Var.f36782D[1] <= y1Var.f36781C || !b) {
                        View view5 = y1Var.f36793f;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(4);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view7 = y1Var.f36793f;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: qk1.y1$b */
    public class C12857b extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12857b(C12855y1 y1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: qk1.y1$c */
    public static final class C12858c {

        /* renamed from: a */
        public final C49765hx0 f36812a;

        /* renamed from: b */
        public final int f36813b;

        /* renamed from: c */
        public final int f36814c;

        /* renamed from: d */
        public final int f36815d;

        /* renamed from: e */
        public boolean f36816e;

        /* renamed from: f */
        public LinkedList<C51228sd2> f36817f;

        public C12858c(C49765hx0 hx02, int i, int i2, int i3, boolean z, LinkedList<C51228sd2> linkedList, int i4, C8480h hVar) {
            z = (i4 & 16) != 0 ? false : z;
            linkedList = (i4 & 32) != 0 ? null : linkedList;
            this.f36812a = hx02;
            this.f36813b = i;
            this.f36814c = i2;
            this.f36815d = i3;
            this.f36816e = z;
            this.f36817f = linkedList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12858c)) {
                return false;
            }
            C12858c cVar = (C12858c) obj;
            return C87412m.m108589b(this.f36812a, cVar.f36812a) && this.f36813b == cVar.f36813b && this.f36814c == cVar.f36814c && this.f36815d == cVar.f36815d && this.f36816e == cVar.f36816e && C87412m.m108589b(this.f36817f, cVar.f36817f);
        }

        public int hashCode() {
            C49765hx0 hx02 = this.f36812a;
            int i = 0;
            int hashCode = (((((((hx02 == null ? 0 : hx02.hashCode()) * 31) + this.f36813b) * 31) + this.f36814c) * 31) + this.f36815d) * 31;
            boolean z = this.f36816e;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            LinkedList<C51228sd2> linkedList = this.f36817f;
            if (linkedList != null) {
                i = linkedList.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "FinderLiveContactInfo(contact=" + this.f36812a + ", type=" + this.f36813b + ", onlineCnt=" + this.f36814c + ", offlineCnt=" + this.f36815d + ", isMySelf=" + this.f36816e + ", giftItems=" + this.f36817f + ')';
        }
    }

    /* renamed from: qk1.y1$d */
    public final class C12859d extends C12857b {

        /* renamed from: z */
        public TextView f36818z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12859d(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
            this.f36818z = (TextView) view.findViewById(C0966R.C0970id.dpa);
        }
    }

    /* renamed from: qk1.y1$e */
    public final class C12860e extends C12857b {

        /* renamed from: A */
        public TextView f36819A;

        /* renamed from: z */
        public TextView f36820z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12860e(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
            this.f36820z = (TextView) view.findViewById(C0966R.C0970id.d0_);
            this.f36819A = (TextView) view.findViewById(C0966R.C0970id.d0a);
        }
    }

    /* renamed from: qk1.y1$f */
    public final class C12861f extends C12857b {

        /* renamed from: A */
        public TextView f36821A;

        /* renamed from: B */
        public WeImageView f36822B;

        /* renamed from: C */
        public View f36823C;

        /* renamed from: D */
        public ImageView f36824D;

        /* renamed from: E */
        public TextView f36825E;

        /* renamed from: F */
        public TextView f36826F;

        /* renamed from: z */
        public TextView f36827z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12861f(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
            this.f36827z = (TextView) view.findViewById(C0966R.C0970id.fvf);
            this.f36821A = (TextView) view.findViewById(C0966R.C0970id.fvk);
            this.f36822B = (WeImageView) view.findViewById(C0966R.C0970id.ded);
            this.f36823C = view.findViewById(C0966R.C0970id.d_n);
            this.f36824D = (ImageView) view.findViewById(C0966R.C0970id.jf7);
            this.f36825E = (TextView) view.findViewById(C0966R.C0970id.epp);
            this.f36826F = (TextView) view.findViewById(C0966R.C0970id.fvl);
        }
    }

    /* renamed from: qk1.y1$g */
    public final class C12862g extends C12857b {

        /* renamed from: qk1.y1$g$a */
        public static final class C12863a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C12855y1 f36828d;

            /* renamed from: qk1.y1$g$a$a */
            public static final class C12864a extends C87413o implements C32226l<C12858c, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C12855y1 f36829d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C12864a(C12855y1 y1Var) {
                    super(1);
                    this.f36829d = y1Var;
                }

                public Object invoke(Object obj) {
                    C12858c cVar = (C12858c) obj;
                    C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(cVar.f36813b == this.f36829d.f36804t);
                }
            }

            /* renamed from: qk1.y1$g$a$b */
            public static final class C12865b extends C87413o implements C32226l<C12858c, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C12855y1 f36830d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C12865b(C12855y1 y1Var) {
                    super(1);
                    this.f36830d = y1Var;
                }

                public Object invoke(Object obj) {
                    C12858c cVar = (C12858c) obj;
                    C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(cVar.f36813b == this.f36830d.f36804t);
                }
            }

            /* renamed from: qk1.y1$g$a$c */
            public static final class C12866c extends C87413o implements C32226l<C12858c, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C12855y1 f36831d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C12866c(C12855y1 y1Var) {
                    super(1);
                    this.f36831d = y1Var;
                }

                public Object invoke(Object obj) {
                    C12858c cVar = (C12858c) obj;
                    C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(cVar.f36813b == this.f36831d.f36804t);
                }
            }

            /* renamed from: qk1.y1$g$a$d */
            public static final class C12867d extends C87413o implements C32226l<C12858c, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C12855y1 f36832d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C12867d(C12855y1 y1Var) {
                    super(1);
                    this.f36832d = y1Var;
                }

                public Object invoke(Object obj) {
                    C12858c cVar = (C12858c) obj;
                    C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(cVar.f36813b == this.f36832d.f36804t);
                }
            }

            public C12863a(C12855y1 y1Var) {
                this.f36828d = y1Var;
            }

            public final void onClick(View view) {
                boolean z;
                C51349t61 t612;
                C51349t61 t613;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberExpandViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C12855y1 y1Var = this.f36828d;
                ArrayList<C12858c> arrayList2 = y1Var.f36785G;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = arrayList2.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C12858c) next).f36813b == y1Var.f36802r) {
                        z = true;
                    }
                    if (z) {
                        arrayList3.add(next);
                    }
                }
                int size = arrayList3.size();
                ArrayList<C51349t61> arrayList4 = this.f36828d.f36786H;
                int size2 = arrayList4 != null ? arrayList4.size() : 0;
                if (size < 15) {
                    if (size2 < 15) {
                        C12855y1 y1Var2 = this.f36828d;
                        C61926c.m72673R(y1Var2.f36785G, new C12864a(y1Var2));
                        C12855y1 y1Var3 = this.f36828d;
                        C61926c.m72673R(y1Var3.f36808x, new C12865b(y1Var3));
                        C12855y1 y1Var4 = this.f36828d;
                        y1Var4.notifyItemRemoved(y1Var4.f36785G.size());
                        z = true;
                    }
                    if (size2 > 15) {
                        size2 = 15;
                    }
                    C12855y1 y1Var5 = this.f36828d;
                    int size3 = z ? y1Var5.f36785G.size() : y1Var5.f36785G.size() - 1;
                    for (int i = size; i < size2; i++) {
                        ArrayList<C51349t61> arrayList5 = this.f36828d.f36786H;
                        if (!(arrayList5 == null || (t613 = arrayList5.get(i)) == null)) {
                            C12855y1 y1Var6 = this.f36828d;
                            ArrayList<C12858c> arrayList6 = y1Var6.f36808x;
                            C12858c cVar = r8;
                            C12858c cVar2 = new C12858c(t613.f141981d, y1Var6.f36802r, 0, 0, false, t613.f141982e, 16, (C8480h) null);
                            arrayList6.add(size3, cVar);
                            ArrayList<C12858c> arrayList7 = y1Var6.f36785G;
                            C12858c cVar3 = r8;
                            C12858c cVar4 = new C12858c(t613.f141981d, y1Var6.f36802r, 0, 0, false, t613.f141982e, 16, (C8480h) null);
                            arrayList7.add(size3, cVar3);
                        }
                    }
                    this.f36828d.notifyItemRangeInserted(size3, size2 - size);
                } else {
                    int i2 = size + 10;
                    if (i2 > size2) {
                        i2 = size2;
                    }
                    if (i2 == size2) {
                        C12855y1 y1Var7 = this.f36828d;
                        C61926c.m72673R(y1Var7.f36785G, new C12866c(y1Var7));
                        C12855y1 y1Var8 = this.f36828d;
                        C61926c.m72673R(y1Var8.f36808x, new C12867d(y1Var8));
                        C12855y1 y1Var9 = this.f36828d;
                        y1Var9.notifyItemRemoved(y1Var9.f36785G.size());
                        z = true;
                    }
                    C12855y1 y1Var10 = this.f36828d;
                    int size4 = z ? y1Var10.f36785G.size() : y1Var10.f36785G.size() - 1;
                    for (int i3 = size; i3 < i2; i3++) {
                        ArrayList<C51349t61> arrayList8 = this.f36828d.f36786H;
                        if (!(arrayList8 == null || (t612 = arrayList8.get(i3)) == null)) {
                            C12855y1 y1Var11 = this.f36828d;
                            ArrayList<C12858c> arrayList9 = y1Var11.f36808x;
                            C12858c cVar5 = r8;
                            C12858c cVar6 = new C12858c(t612.f141981d, y1Var11.f36802r, 0, 0, false, t612.f141982e, 16, (C8480h) null);
                            arrayList9.add(size4, cVar5);
                            ArrayList<C12858c> arrayList10 = y1Var11.f36785G;
                            C12858c cVar7 = r8;
                            C12858c cVar8 = new C12858c(t612.f141981d, y1Var11.f36802r, 0, 0, false, t612.f141982e, 16, (C8480h) null);
                            arrayList10.add(size4, cVar7);
                        }
                    }
                    this.f36828d.notifyItemRangeInserted(size4, i2 - size);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberExpandViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12862g(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
            view.setOnClickListener(new C12863a(y1Var));
        }
    }

    /* renamed from: qk1.y1$h */
    public final class C12868h extends C12857b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12868h(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: qk1.y1$i */
    public final class C12869i extends C12857b {

        /* renamed from: A */
        public TextView f36833A;

        /* renamed from: B */
        public ImageView f36834B;

        /* renamed from: C */
        public TextView f36835C;

        /* renamed from: D */
        public RelativeLayout f36836D;

        /* renamed from: E */
        public FinderTagFlowLayout f36837E;

        /* renamed from: z */
        public View f36838z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12869i(C12855y1 y1Var, View view) {
            super(y1Var, view);
            C87412m.m108594g(view, "itemView");
            this.f36838z = view.findViewById(C0966R.C0970id.l1z);
            this.f36833A = (TextView) view.findViewById(C0966R.C0970id.fxu);
            this.f36834B = (ImageView) view.findViewById(C0966R.C0970id.jf7);
            this.f36835C = (TextView) view.findViewById(C0966R.C0970id.epp);
            this.f36836D = (RelativeLayout) view.findViewById(C0966R.C0970id.fxt);
            this.f36837E = (FinderTagFlowLayout) view.findViewById(C0966R.C0970id.fxs);
        }
    }

    public C12855y1(C11471u.C11473b bVar, Resources resources, RecyclerView recyclerView, View view, C54991o oVar) {
        C87412m.m108594g(bVar, "uiMode");
        C87412m.m108594g(resources, "resources");
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "stickViewContainer");
        C87412m.m108594g(oVar, "liveCommonSlice");
        this.f36791d = bVar;
        this.f36792e = resources;
        this.f36793f = view;
        this.f36794g = oVar;
        int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        this.f36796i = i;
        this.f36797j = 1;
        this.f36798n = 1;
        this.f36799o = 2;
        this.f36800p = 3;
        this.f36801q = 4;
        this.f36802r = 5;
        this.f36803s = 6;
        this.f36804t = 7;
        this.f36805u = true;
        this.f36808x = new ArrayList<>();
        this.f36810z = Integer.MAX_VALUE;
        View findViewById = view.findViewById(C0966R.C0970id.drb);
        C87412m.m108593f(findViewById, "stickViewContainer.findV…r_live_member_stick_view)");
        this.f36780B = findViewById;
        this.f36782D = new int[2];
        this.f36785G = new ArrayList<>();
        if (!mo12377G4()) {
            int c = C75044y4.m89990b(recyclerView.getContext()).y - C75044y4.m89991c(recyclerView.getContext());
            ViewGroup.LayoutParams layoutParams = this.f36780B.getLayoutParams();
            this.f36781C = c - (layoutParams != null ? layoutParams.height : 0);
            this.f36780B.setBackgroundColor(this.f36792e.getColor(C0966R.color.BW_0_Alpha_0_1));
            recyclerView.mo17043c(new C12856a(this));
        }
        this.f36787I = (int) (((float) i) * 0.4f);
        int dimensionPixelOffset = this.f36792e.getDimensionPixelOffset(C0966R.dimen.f3731ck);
        this.f36788J = dimensionPixelOffset;
        this.f36789K = dimensionPixelOffset;
        this.f36790L = dimensionPixelOffset;
    }

    /* renamed from: F4 */
    public final void mo12376F4() {
        View view = this.f36793f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f36780B.setTag(Boolean.FALSE);
    }

    /* renamed from: G4 */
    public final boolean mo12377G4() {
        return C62042e.f176370a.mo87027N0() || this.f36794g.f154190D;
    }

    /* renamed from: O4 */
    public final void mo12378O4(C12861f fVar, int i, C49765hx0 hx02, boolean z) {
        FinderContact finderContact;
        FinderContact finderContact2;
        C12861f fVar2 = fVar;
        int i2 = i;
        C49765hx0 hx03 = hx02;
        long j = hx03 != null ? hx03.f134934v : 0;
        int size = this.f36806v + this.f36797j + this.f36785G.size() + 0;
        if (z) {
            String str = this.f36795h;
            StringBuilder sb = new StringBuilder();
            sb.append("myself position:");
            sb.append(i2);
            sb.append('(');
            sb.append(size);
            sb.append("),rewardAmount:");
            sb.append(j);
            sb.append(",badgeInfo:");
            sb.append(C54991o.f154177g4.mo642a(hx03 != null ? hx03.f134930r : null));
            Log.m105924i(str, sb.toString());
        } else {
            C62042e eVar = C62042e.f176370a;
            String str2 = this.f36795h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("setRankTv ");
            sb4.append((hx03 == null || (finderContact2 = hx03.f134919d) == null) ? null : finderContact2.nickname);
            sb4.append(",position:");
            sb4.append(i2);
            sb4.append('(');
            sb4.append(size);
            sb4.append("),rewardAmount:");
            sb4.append(j);
            sb4.append(",badgeInfo:");
            sb4.append(C54991o.f154177g4.mo642a(hx03 != null ? hx03.f134930r : null));
            eVar.mo86998D1(str2, sb4.toString());
        }
        fVar2.f44854d.setTag(C0966R.C0970id.d4l, Long.valueOf(j));
        if (j <= 0 || i2 >= size) {
            fVar2.f44854d.setTag(C0966R.C0970id.d4k, "");
            fVar2.f36827z.setTextColor(this.f36792e.getColor(C0966R.color.FG_0));
            fVar2.f36827z.setText("-");
            return;
        }
        int size2 = (i2 - this.f36785G.size()) + 0;
        fVar2.f36827z.setText(String.valueOf(size2));
        fVar2.f44854d.setTag(C0966R.C0970id.d4k, String.valueOf(size2));
        int i3 = this.f36797j;
        if (size2 == i3) {
            fVar2.f36827z.setTextColor(this.f36792e.getColor(C0966R.color.f3406rr));
            fVar2.f36827z.setTextSize(1, 22.0f);
        } else if (size2 == i3 + 1) {
            fVar2.f36827z.setTextColor(this.f36792e.getColor(C0966R.color.f3408rt));
            fVar2.f36827z.setTextSize(1, 22.0f);
        } else if (size2 == i3 + 2) {
            fVar2.f36827z.setTextColor(this.f36792e.getColor(C0966R.color.f3407rs));
            fVar2.f36827z.setTextSize(1, 22.0f);
        } else {
            fVar2.f36827z.setTextColor(this.f36792e.getColor(C0966R.color.FG_0));
            fVar2.f36827z.setTextSize(1, 15.0f);
        }
        if (!z) {
            String str3 = this.f36795h;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("setRankTv ");
            sb5.append((hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.nickname);
            sb5.append(",position:");
            sb5.append(i2);
            sb5.append('(');
            sb5.append(size);
            sb5.append("),rewardAmount:");
            sb5.append(j);
            Log.m105924i(str3, sb5.toString());
        }
    }

    /* renamed from: g5 */
    public final void mo12379g5(C12861f fVar, int i, C49765hx0 hx02, boolean z) {
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo87093l(this.f36794g.f107146d)) {
            fVar.f36826F.setVisibility(8);
            return;
        }
        String G = eVar.mo87005G(hx02 != null ? hx02.f134934v : 0);
        fVar.f36826F.setVisibility(0);
        fVar.f36826F.setText(G);
    }

    public int getItemCount() {
        return this.f36808x.size();
    }

    public int getItemViewType(int i) {
        return this.f36808x.get(i).f36813b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0145, code lost:
        r3 = r3.f134930r;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x041f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r22
            qk1.y1$b r2 = (qk1.C12855y1.C12857b) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            boolean r3 = r2 instanceof qk1.C12855y1.C12861f
            r4 = 8
            java.lang.String r5 = "dataList[position]"
            if (r3 == 0) goto L_0x004b
            qk1.y1$f r2 = (qk1.C12855y1.C12861f) r2
            java.util.ArrayList<qk1.y1$c> r3 = r0.f36808x
            java.lang.Object r3 = r3.get(r1)
            gy3.C87412m.m108593f(r3, r5)
            qk1.y1$c r3 = (qk1.C12855y1.C12858c) r3
            te3.hx0 r5 = r3.f36812a
            boolean r6 = r3.f36816e
            r0.mo12378O4(r2, r1, r5, r6)
            boolean r5 = r0.f36805u
            if (r5 == 0) goto L_0x0035
            te3.hx0 r4 = r3.f36812a
            boolean r5 = r3.f36816e
            r0.mo12379g5(r2, r1, r4, r5)
            goto L_0x003a
        L_0x0035:
            android.widget.TextView r5 = r2.f36826F
            r5.setVisibility(r4)
        L_0x003a:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.mo12380u5(r2, r1, r3, r4)
            android.view.View r1 = r2.f44854d
            qk1.b2 r2 = new qk1.b2
            r2.<init>(r0, r3)
            r1.setOnClickListener(r2)
            goto L_0x042f
        L_0x004b:
            boolean r3 = r2 instanceof qk1.C12855y1.C12860e
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00f1
            qk1.y1$e r2 = (qk1.C12855y1.C12860e) r2
            java.util.ArrayList<qk1.y1$c> r3 = r0.f36808x
            java.lang.Object r3 = r3.get(r1)
            gy3.C87412m.m108593f(r3, r5)
            qk1.y1$c r3 = (qk1.C12855y1.C12858c) r3
            int r3 = r3.f36813b
            int r5 = r0.f36799o
            if (r3 != r5) goto L_0x00a9
            boolean r1 = r21.mo12377G4()
            if (r1 == 0) goto L_0x009a
            android.widget.TextView r1 = r2.f36820z
            android.content.Context r3 = r1.getContext()
            r5 = 2131827967(0x7f111cff, float:1.9288862E38)
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "holder.title.context.get…em_category_online_count)"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            ok1.e r8 = ok1.C62042e.f176370a
            int r9 = r0.f36807w
            long r9 = (long) r9
            java.lang.String r8 = r8.mo87005G(r9)
            r5[r7] = r8
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String r3 = java.lang.String.format(r3, r5)
            java.lang.String r5 = "format(format, *args)"
            gy3.C87412m.m108593f(r3, r5)
            r1.setText(r3)
            goto L_0x00c5
        L_0x009a:
            android.widget.TextView r1 = r2.f36820z
            android.content.res.Resources r3 = r0.f36792e
            r5 = 2131827964(0x7f111cfc, float:1.9288855E38)
            java.lang.String r3 = r3.getString(r5)
            r1.setText(r3)
            goto L_0x00c5
        L_0x00a9:
            java.util.ArrayList<qk1.y1$c> r3 = r0.f36808x
            java.lang.Object r1 = r3.get(r1)
            qk1.y1$c r1 = (qk1.C12855y1.C12858c) r1
            int r1 = r1.f36813b
            int r3 = r0.f36800p
            if (r1 != r3) goto L_0x00c5
            android.widget.TextView r1 = r2.f36820z
            android.content.res.Resources r3 = r0.f36792e
            r5 = 2131827966(0x7f111cfe, float:1.928886E38)
            java.lang.String r3 = r3.getString(r5)
            r1.setText(r3)
        L_0x00c5:
            boolean r1 = r0.f36805u
            if (r1 == 0) goto L_0x00ea
            ok1.e r1 = ok1.C62042e.f176370a
            cl1.o r3 = r0.f36794g
            fj1.b r3 = r3.f107146d
            boolean r1 = r1.mo87093l(r3)
            if (r1 == 0) goto L_0x00ea
            android.widget.TextView r1 = r2.f36819A
            r1.setVisibility(r7)
            android.widget.TextView r1 = r2.f36819A
            android.content.res.Resources r2 = r0.f36792e
            r3 = 2131827972(0x7f111d04, float:1.9288872E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
            goto L_0x042f
        L_0x00ea:
            android.widget.TextView r1 = r2.f36819A
            r1.setVisibility(r4)
            goto L_0x042f
        L_0x00f1:
            boolean r3 = r2 instanceof qk1.C12855y1.C12859d
            r8 = -1
            if (r3 == 0) goto L_0x0130
            qk1.y1$d r2 = (qk1.C12855y1.C12859d) r2
            android.view.View r3 = r2.f44854d
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r5 = -2
            r4.<init>(r8, r5)
            r3.setLayoutParams(r4)
            android.widget.TextView r2 = r2.f36818z
            android.content.res.Resources r3 = r0.f36792e
            r4 = 2131827961(0x7f111cf9, float:1.928885E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.util.ArrayList<qk1.y1$c> r6 = r0.f36808x
            java.lang.Object r6 = r6.get(r1)
            qk1.y1$c r6 = (qk1.C12855y1.C12858c) r6
            int r6 = r6.f36814c
            java.util.ArrayList<qk1.y1$c> r8 = r0.f36808x
            java.lang.Object r1 = r8.get(r1)
            qk1.y1$c r1 = (qk1.C12855y1.C12858c) r1
            int r1 = r1.f36815d
            int r6 = r6 + r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r5[r7] = r1
            java.lang.String r1 = r3.getString(r4, r5)
            r2.setText(r1)
            goto L_0x042f
        L_0x0130:
            boolean r3 = r2 instanceof qk1.C12855y1.C12869i
            if (r3 == 0) goto L_0x0425
            qk1.y1$i r2 = (qk1.C12855y1.C12869i) r2
            java.util.ArrayList<qk1.y1$c> r3 = r0.f36808x
            java.lang.Object r1 = r3.get(r1)
            gy3.C87412m.m108593f(r1, r5)
            qk1.y1$c r1 = (qk1.C12855y1.C12858c) r1
            te3.hx0 r3 = r1.f36812a
            if (r3 == 0) goto L_0x0151
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            if (r3 == 0) goto L_0x0151
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0151
            r3 = 1
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            java.lang.String r5 = ""
            r9 = 2
            r10 = 0
            if (r3 == 0) goto L_0x01d0
            wk1.n r11 = wk1.C15440n.f41895a
            android.widget.TextView r12 = r2.f36835C
            android.view.View r3 = r2.f44854d
            android.content.Context r13 = r3.getContext()
            java.lang.String r3 = "holder.itemView.context"
            gy3.C87412m.m108593f(r13, r3)
            te3.hx0 r3 = r1.f36812a
            java.util.LinkedList<te3.aw0> r15 = r3.f134930r
            r3 = 3
            int[] r3 = new int[r3]
            r3 = {2, 4, 5} // fill-array
            ok1.u$b r14 = r0.f36791d
            int r14 = r14.ordinal()
            if (r14 == r6) goto L_0x0181
            if (r14 == r9) goto L_0x017e
            wk1.x r14 = wk1.C15483x.MODE_AUTO
            goto L_0x0183
        L_0x017e:
            wk1.x r14 = wk1.C15483x.MODE_LIGHT
            goto L_0x0183
        L_0x0181:
            wk1.x r14 = wk1.C15483x.MODE_DARK
        L_0x0183:
            r17 = r14
            r18 = 0
            r19 = 64
            r20 = 0
            java.lang.String r14 = " "
            r16 = r3
            rx3.l r3 = wk1.C15440n.m14440c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.widget.TextView r11 = r2.f36835C
            A r12 = r3.f38555d
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
            android.widget.TextView r11 = r2.f36835C
            r11.setVisibility(r7)
            B r11 = r3.f38556e
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x01db
            cl1.o$c r11 = cl1.C54991o.f154177g4
            te3.hx0 r12 = r1.f36812a
            java.util.LinkedList<te3.aw0> r12 = r12.f134930r
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            te3.hx0 r14 = r1.f36812a
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
            if (r14 == 0) goto L_0x01bf
            java.lang.String r14 = r14.nickname
            goto L_0x01c0
        L_0x01bf:
            r14 = r10
        L_0x01c0:
            r13.append(r14)
            java.lang.String r14 = ",setRewardMember"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r11.mo643b(r12, r13)
            goto L_0x01db
        L_0x01d0:
            android.widget.TextView r3 = r2.f36835C
            r3.setText(r5)
            android.widget.TextView r3 = r2.f36835C
            r3.setVisibility(r4)
            r3 = r10
        L_0x01db:
            te3.hx0 r11 = r1.f36812a
            if (r11 == 0) goto L_0x01ee
            java.util.LinkedList<te3.aw0> r11 = r11.f134930r
            if (r11 == 0) goto L_0x01ee
            ok1.e r12 = ok1.C62042e.f176370a
            cl1.o r13 = r0.f36794g
            fj1.b r13 = r13.f107146d
            boolean r11 = r12.mo87087i1(r13, r11)
            goto L_0x01ef
        L_0x01ee:
            r11 = 0
        L_0x01ef:
            boolean r12 = r21.mo12377G4()
            if (r12 == 0) goto L_0x024e
            if (r11 != 0) goto L_0x024e
            te3.hx0 r11 = r1.f36812a
            if (r11 == 0) goto L_0x020a
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.f134919d
            if (r11 == 0) goto L_0x020a
            te3.ii0 r11 = r11.extInfo
            if (r11 == 0) goto L_0x020a
            int r11 = r11.f135356g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x020b
        L_0x020a:
            r11 = r10
        L_0x020b:
            if (r11 != 0) goto L_0x020e
            goto L_0x0222
        L_0x020e:
            int r12 = r11.intValue()
            if (r12 != r6) goto L_0x0222
            android.widget.ImageView r9 = r2.f36834B
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r2.f36834B
            r11 = 2131755869(0x7f10035d, float:1.914263E38)
            r9.setImageResource(r11)
            goto L_0x0253
        L_0x0222:
            if (r11 != 0) goto L_0x0225
            goto L_0x0239
        L_0x0225:
            int r12 = r11.intValue()
            if (r12 != r9) goto L_0x0239
            android.widget.ImageView r9 = r2.f36834B
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r2.f36834B
            r11 = 2131755868(0x7f10035c, float:1.9142627E38)
            r9.setImageResource(r11)
            goto L_0x0253
        L_0x0239:
            if (r11 != 0) goto L_0x023c
            goto L_0x0248
        L_0x023c:
            int r9 = r11.intValue()
            if (r9 != 0) goto L_0x0248
            android.widget.ImageView r9 = r2.f36834B
            r9.setVisibility(r4)
            goto L_0x0253
        L_0x0248:
            android.widget.ImageView r9 = r2.f36834B
            r9.setVisibility(r4)
            goto L_0x0253
        L_0x024e:
            android.widget.ImageView r9 = r2.f36834B
            r9.setVisibility(r4)
        L_0x0253:
            if (r3 == 0) goto L_0x025a
            B r3 = r3.f38556e
            java.util.List r3 = (java.util.List) r3
            goto L_0x025b
        L_0x025a:
            r3 = r10
        L_0x025b:
            boolean r9 = r3 instanceof wk1.C15481v
            if (r9 == 0) goto L_0x0262
            wk1.v r3 = (wk1.C15481v) r3
            goto L_0x0263
        L_0x0262:
            r3 = r10
        L_0x0263:
            android.view.View r9 = r2.f36838z
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r11 = r9 instanceof android.widget.LinearLayout.LayoutParams
            if (r11 == 0) goto L_0x0270
            android.widget.LinearLayout$LayoutParams r9 = (android.widget.LinearLayout.LayoutParams) r9
            goto L_0x0271
        L_0x0270:
            r9 = r10
        L_0x0271:
            android.widget.RelativeLayout r11 = r2.f36836D
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r12 = r11 instanceof android.widget.LinearLayout.LayoutParams
            if (r12 == 0) goto L_0x027e
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
            goto L_0x027f
        L_0x027e:
            r11 = r10
        L_0x027f:
            if (r9 == 0) goto L_0x02d9
            if (r11 != 0) goto L_0x0284
            goto L_0x02d9
        L_0x0284:
            float r12 = r9.weight
            float r13 = r11.weight
            r14 = 0
            int r15 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x028f
            r15 = 1
            goto L_0x0290
        L_0x028f:
            r15 = 0
        L_0x0290:
            if (r15 != 0) goto L_0x02d9
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x0298
            r15 = 1
            goto L_0x0299
        L_0x0298:
            r15 = 0
        L_0x0299:
            if (r15 != 0) goto L_0x02d9
            float r13 = r13 + r12
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x02a2
            r14 = 1
            goto L_0x02a3
        L_0x02a2:
            r14 = 0
        L_0x02a3:
            if (r14 == 0) goto L_0x02a6
            goto L_0x02d9
        L_0x02a6:
            int r14 = r0.f36796i
            int r15 = r9.leftMargin
            int r14 = r14 - r15
            int r9 = r9.rightMargin
            int r14 = r14 - r9
            int r9 = r11.leftMargin
            int r14 = r14 - r9
            int r9 = r11.rightMargin
            int r14 = r14 - r9
            float r9 = (float) r14
            float r12 = r12 / r13
            float r9 = r9 * r12
            if (r3 == 0) goto L_0x02bf
            int r3 = r3.mo14226a()
            goto L_0x02c0
        L_0x02bf:
            r3 = 0
        L_0x02c0:
            float r3 = (float) r3
            float r9 = r9 - r3
            android.widget.ImageView r3 = r2.f36834B
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r3 = r3.width
            float r3 = (float) r3
            float r9 = r9 - r3
            android.content.res.Resources r3 = r0.f36792e
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = r3.getDimensionPixelOffset(r11)
            float r3 = (float) r3
            float r9 = r9 - r3
            int r3 = (int) r9
            goto L_0x02da
        L_0x02d9:
            r3 = -1
        L_0x02da:
            if (r3 <= 0) goto L_0x02e2
            android.widget.TextView r9 = r2.f36833A
            r9.setMaxWidth(r3)
            goto L_0x02e9
        L_0x02e2:
            android.widget.TextView r9 = r2.f36833A
            int r11 = r0.f36787I
            r9.setMaxWidth(r11)
        L_0x02e9:
            ok1.e r9 = ok1.C62042e.f176370a
            java.lang.String r11 = r0.f36795h
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "setRewardMember nicknameMaxWidth:"
            r12.append(r13)
            r12.append(r3)
            java.lang.String r3 = ",DEFAULT_MAX_WIDTH:"
            r12.append(r3)
            int r3 = r0.f36787I
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            r9.mo86998D1(r11, r3)
            android.widget.TextView r3 = r2.f36833A
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            te3.hx0 r12 = r1.f36812a
            if (r12 == 0) goto L_0x0325
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r12.f134919d
            if (r12 == 0) goto L_0x0325
            java.lang.String r12 = r12.nickname
            goto L_0x0326
        L_0x0325:
            r12 = r10
        L_0x0326:
            android.widget.TextView r13 = r2.f36833A
            float r13 = r13.getTextSize()
            android.text.SpannableString r9 = r9.yp0(r11, r12, r13)
            r3.setText(r9)
            java.util.LinkedList<te3.sd2> r1 = r1.f36817f
            java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            if (r1 == 0) goto L_0x0371
            java.util.Iterator r11 = r1.iterator()
        L_0x0344:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0371
            java.lang.Object r12 = r11.next()
            te3.sd2 r12 = (te3.C51228sd2) r12
            cj1.y1 r13 = cj1.C0639y1.f1510a
            te3.p11 r14 = r12.f141447d
            if (r14 == 0) goto L_0x0359
            java.lang.String r14 = r14.f139507d
            goto L_0x035a
        L_0x0359:
            r14 = r10
        L_0x035a:
            ig1.d r13 = r13.mo612d(r14)
            if (r13 == 0) goto L_0x0344
            te3.p11 r12 = r12.f141447d
            if (r12 != 0) goto L_0x0365
            goto L_0x0369
        L_0x0365:
            float r14 = r13.field_price
            r12.f139516p = r14
        L_0x0369:
            if (r12 != 0) goto L_0x036c
            goto L_0x0344
        L_0x036c:
            java.lang.String r13 = r13.field_thumbnailFileUrl
            r12.f139509f = r13
            goto L_0x0344
        L_0x0371:
            if (r1 == 0) goto L_0x041f
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r4 = r2.f36837E
            r4.setGravity(r8)
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r4 = r2.f36837E
            r4.setVisibility(r7)
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r4 = r2.f36837E
            r4.removeAllViews()
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x0390
            qk1.a2 r4 = new qk1.a2
            r4.<init>()
            sx3.C77813z.m93909o(r1, r4)
        L_0x0390:
            java.util.Iterator r4 = r1.iterator()
        L_0x0394:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0414
            java.lang.Object r6 = r4.next()
            te3.sd2 r6 = (te3.C51228sd2) r6
            android.view.View r7 = r2.f44854d
            android.content.Context r7 = r7.getContext()
            r8 = 2131495183(0x7f0c090f, float:1.8613895E38)
            android.view.View r7 = android.view.View.inflate(r7, r8, r10)
            r8 = 2131304234(0x7f091f2a, float:1.8226605E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r11 = 2131304235(0x7f091f2b, float:1.8226607E38)
            android.view.View r11 = r7.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            bl3.r r12 = bl3.C39818r.f106831a
            bl3.r$a r13 = r12.mo62446e(r9)
            bl3.c r13 = r13.mo62447c(r3)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11871f2()
            pl1.n0 r14 = new pl1.n0
            te3.p11 r15 = r6.f141447d
            if (r15 == 0) goto L_0x03d9
            java.lang.String r15 = r15.f139509f
            if (r15 != 0) goto L_0x03da
        L_0x03d9:
            r15 = r5
        L_0x03da:
            up1.y r10 = up1.C27696y.THUMB_IMAGE
            r14.<init>(r15, r10)
            java.lang.String r10 = "giftImgView"
            gy3.C87412m.m108593f(r8, r10)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r12 = r12.mo62446e(r9)
            bl3.c r12 = r12.mo62447c(r3)
            pl1.s0 r12 = (pl1.C11990s0) r12
            n60.f r10 = r12.mo11867O2(r10)
            r13.mo85957c(r14, r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r10 = 120(0x78, float:1.68E-43)
            r8.append(r10)
            int r6 = r6.f141448e
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r11.setText(r6)
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r6 = r2.f36837E
            r6.addView(r7)
            r10 = 0
            goto L_0x0394
        L_0x0414:
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r3 = r2.f36837E
            qk1.z1 r4 = new qk1.z1
            r4.<init>(r2, r1)
            r3.post(r4)
            goto L_0x042f
        L_0x041f:
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r1 = r2.f36837E
            r1.setVisibility(r4)
            goto L_0x042f
        L_0x0425:
            boolean r1 = r2 instanceof qk1.C12855y1.C12868h
            if (r1 != 0) goto L_0x042f
            boolean r1 = r2 instanceof qk1.C12855y1.C12862g
            if (r1 == 0) goto L_0x042f
            qk1.y1$g r2 = (qk1.C12855y1.C12862g) r2
        L_0x042f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C12855y1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        boolean z = true;
        if (i == 0 || i == this.f36798n) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ahe, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…r_item_ui, parent, false)");
            return new C12861f(this, inflate);
        }
        if (!(i == this.f36799o || i == this.f36800p)) {
            z = false;
        }
        if (z) {
            View inflate2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahd, (ViewGroup) null);
            C87412m.m108593f(inflate2, "inflate(parent.context, …member_category_ui, null)");
            return new C12860e(this, inflate2);
        } else if (i == this.f36801q) {
            View inflate3 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahc, (ViewGroup) null);
            C87412m.m108593f(inflate3, "inflate(parent.context, …r_member_bottom_ui, null)");
            return new C12859d(this, inflate3);
        } else if (i == this.f36802r) {
            View inflate4 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ahg, viewGroup, false);
            C87412m.m108593f(inflate4, "getInflater(parent.conte…er_item_ui, parent,false)");
            return new C12869i(this, inflate4);
        } else if (i == this.f36803s) {
            View inflate5 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ahh, viewGroup, false);
            C87412m.m108593f(inflate5, "getInflater(parent.conte…r_title_ui, parent,false)");
            return new C12868h(this, inflate5);
        } else if (i == this.f36804t) {
            View inflate6 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ahf, viewGroup, false);
            C87412m.m108593f(inflate6, "getInflater(parent.conte…_expand_ui, parent,false)");
            return new C12862g(this, inflate6);
        } else {
            View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ahe, viewGroup, false);
            C87412m.m108593f(inflate7, "from(parent.context).inf…r_item_ui, parent, false)");
            return new C12861f(this, inflate7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024e  */
    /* renamed from: u5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12380u5(qk1.C12855y1.C12861f r24, int r25, qk1.C12855y1.C12858c r26, java.lang.Boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            cl1.o r3 = r0.f36794g
            boolean r3 = r3.mo75998e3()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002a
            c50.b r3 = c50.C54655b.f153178f1
            if (r3 == 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            if (r3 != 0) goto L_0x0025
            i50.a r3 = i50.C60251a.f171781k1
            if (r3 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            if (r3 != 0) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            android.view.View r6 = r1.f44854d
            int r6 = r6.getMeasuredWidth()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != 0) goto L_0x0048
            android.view.View r6 = r1.f44854d
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r8 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r8 = r8.x
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
            r6.measure(r8, r5)
        L_0x0048:
            android.view.View r6 = r1.f44854d
            int r6 = r6.getMeasuredWidth()
            android.widget.TextView r8 = r1.f36827z
            int r8 = r8.getMeasuredWidth()
            int r6 = r6 - r8
            android.content.res.Resources r8 = r0.f36792e
            r9 = 2131165351(0x7f0700a7, float:1.7944917E38)
            int r8 = r8.getDimensionPixelOffset(r9)
            int r6 = r6 - r8
            android.widget.TextView r8 = r1.f36821A
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            te3.hx0 r11 = r2.f36812a
            if (r11 == 0) goto L_0x0078
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.f134919d
            if (r11 == 0) goto L_0x0078
            java.lang.String r11 = r11.nickname
            goto L_0x0079
        L_0x0078:
            r11 = 0
        L_0x0079:
            android.widget.TextView r13 = r1.f36821A
            float r13 = r13.getTextSize()
            android.text.SpannableString r9 = r9.yp0(r10, r11, r13)
            r8.setText(r9)
            int r8 = r2.f36813b
            r9 = 3
            if (r8 != 0) goto L_0x00c9
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r10 = r27
            boolean r8 = gy3.C87412m.m108589b(r10, r8)
            if (r8 == 0) goto L_0x00af
            r8 = r25
            if (r8 > r9) goto L_0x00a6
            android.widget.TextView r8 = r1.f36821A
            android.text.TextPaint r8 = r8.getPaint()
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r10)
            goto L_0x00af
        L_0x00a6:
            android.widget.TextView r8 = r1.f36821A
            android.text.TextPaint r8 = r8.getPaint()
            r8.setFakeBoldText(r5)
        L_0x00af:
            android.widget.TextView r8 = r1.f36821A
            android.content.res.Resources r10 = r0.f36792e
            r11 = 2131099800(0x7f060098, float:1.7811963E38)
            int r10 = r10.getColor(r11)
            r8.setTextColor(r10)
            android.widget.TextView r8 = r1.f36826F
            android.content.res.Resources r10 = r0.f36792e
            int r10 = r10.getColor(r11)
            r8.setTextColor(r10)
            goto L_0x00e2
        L_0x00c9:
            android.widget.TextView r8 = r1.f36821A
            android.content.res.Resources r10 = r0.f36792e
            r11 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r10 = r10.getColor(r11)
            r8.setTextColor(r10)
            android.widget.TextView r8 = r1.f36826F
            android.content.res.Resources r10 = r0.f36792e
            int r10 = r10.getColor(r11)
            r8.setTextColor(r10)
        L_0x00e2:
            android.view.View r8 = r1.f44854d
            r10 = 2131302550(0x7f091896, float:1.822319E38)
            te3.hx0 r11 = r2.f36812a
            if (r11 == 0) goto L_0x00f2
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.f134919d
            if (r11 == 0) goto L_0x00f2
            java.lang.String r11 = r11.nickname
            goto L_0x00f3
        L_0x00f2:
            r11 = 0
        L_0x00f3:
            r8.setTag(r10, r11)
            te3.hx0 r8 = r2.f36812a
            if (r8 == 0) goto L_0x0101
            int r8 = r8.f134921f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            r10 = 8
            r11 = 2
            if (r8 != 0) goto L_0x0108
            goto L_0x0114
        L_0x0108:
            int r13 = r8.intValue()
            if (r13 != 0) goto L_0x0114
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            r8.setVisibility(r10)
            goto L_0x015e
        L_0x0114:
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            java.lang.String r14 = "holder.banComment"
            if (r8 != 0) goto L_0x011c
            goto L_0x0139
        L_0x011c:
            int r15 = r8.intValue()
            if (r15 != r4) goto L_0x0139
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            gy3.C87412m.m108593f(r8, r14)
            r14 = 2131755903(0x7f10037f, float:1.9142698E38)
            android.content.res.Resources r15 = r0.f36792e
            int r13 = r15.getColor(r13)
            p207nl.C11216n.m11073a(r8, r14, r13)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            r8.setVisibility(r5)
            goto L_0x015e
        L_0x0139:
            if (r8 != 0) goto L_0x013c
            goto L_0x0159
        L_0x013c:
            int r8 = r8.intValue()
            if (r8 != r11) goto L_0x0159
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            gy3.C87412m.m108593f(r8, r14)
            r14 = 2131756298(0x7f10050a, float:1.91435E38)
            android.content.res.Resources r15 = r0.f36792e
            int r13 = r15.getColor(r13)
            p207nl.C11216n.m11073a(r8, r14, r13)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            r8.setVisibility(r5)
            goto L_0x015e
        L_0x0159:
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r1.f36822B
            r8.setVisibility(r10)
        L_0x015e:
            android.view.View r8 = r1.f36823C
            if (r3 != 0) goto L_0x0171
            te3.hx0 r3 = r2.f36812a
            if (r3 == 0) goto L_0x016c
            int r3 = r3.f134926n
            if (r3 != r9) goto L_0x016c
            r3 = 1
            goto L_0x016d
        L_0x016c:
            r3 = 0
        L_0x016d:
            if (r3 == 0) goto L_0x0171
            r3 = 0
            goto L_0x0173
        L_0x0171:
            r3 = 8
        L_0x0173:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.mo10233c(r3)
            java.lang.Object[] r14 = r9.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter"
            java.lang.String r16 = "setUserItem"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$MemberViewHolder;ILcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$FinderLiveContactInfo;Ljava/lang/Boolean;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r8
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = r9.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r8.setVisibility(r3)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter"
            java.lang.String r15 = "setUserItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$MemberViewHolder;ILcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$FinderLiveContactInfo;Ljava/lang/Boolean;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            te3.hx0 r3 = r2.f36812a
            if (r3 == 0) goto L_0x01c5
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01c5
            r3 = 1
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            r8 = 2131302549(0x7f091895, float:1.8223187E38)
            if (r3 == 0) goto L_0x024e
            wk1.n r13 = wk1.C15440n.f41895a
            android.widget.TextView r14 = r1.f36825E
            android.view.View r3 = r1.f44854d
            android.content.Context r15 = r3.getContext()
            java.lang.String r3 = "holder.itemView.context"
            gy3.C87412m.m108593f(r15, r3)
            te3.hx0 r3 = r2.f36812a
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            r9 = 4
            int[] r9 = new int[r9]
            r9 = {2, 4, 5, 10} // fill-array
            ok1.u$b r12 = r0.f36791d
            int r12 = r12.ordinal()
            if (r12 == r4) goto L_0x01f4
            if (r12 == r11) goto L_0x01f1
            wk1.x r12 = wk1.C15483x.MODE_AUTO
            goto L_0x01f6
        L_0x01f1:
            wk1.x r12 = wk1.C15483x.MODE_LIGHT
            goto L_0x01f6
        L_0x01f4:
            wk1.x r12 = wk1.C15483x.MODE_DARK
        L_0x01f6:
            r19 = r12
            r20 = 0
            r21 = 64
            r22 = 0
            java.lang.String r16 = " "
            r17 = r3
            r18 = r9
            rx3.l r3 = wk1.C15440n.m14440c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r9 = r1.f36825E
            A r12 = r3.f38555d
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r9.setText(r12)
            android.widget.TextView r9 = r1.f36825E
            r9.setVisibility(r5)
            B r9 = r3.f38556e
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0246
            cl1.o$c r9 = cl1.C54991o.f154177g4
            te3.hx0 r12 = r2.f36812a
            java.util.LinkedList<te3.aw0> r12 = r12.f134930r
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            te3.hx0 r14 = r2.f36812a
            if (r14 == 0) goto L_0x0236
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
            if (r14 == 0) goto L_0x0236
            java.lang.String r14 = r14.nickname
            goto L_0x0237
        L_0x0236:
            r14 = 0
        L_0x0237:
            r13.append(r14)
            java.lang.String r14 = ",setUserItem"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r9.mo643b(r12, r13)
        L_0x0246:
            android.view.View r9 = r1.f44854d
            A r3 = r3.f38555d
            r9.setTag(r8, r3)
            goto L_0x0281
        L_0x024e:
            android.widget.TextView r3 = r1.f36825E
            java.lang.String r9 = ""
            r3.setText(r9)
            android.widget.TextView r3 = r1.f36825E
            r3.setVisibility(r10)
            java.lang.String r3 = r0.f36795h
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            te3.hx0 r13 = r2.f36812a
            if (r13 == 0) goto L_0x026c
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.f134919d
            if (r13 == 0) goto L_0x026c
            java.lang.String r13 = r13.nickname
            goto L_0x026d
        L_0x026c:
            r13 = 0
        L_0x026d:
            r12.append(r13)
            java.lang.String r13 = " badge_infos is empty!"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            android.view.View r3 = r1.f44854d
            r3.setTag(r8, r9)
        L_0x0281:
            android.widget.TextView r3 = r1.f36825E
            int r3 = r3.getMeasuredWidth()
            if (r3 != 0) goto L_0x029c
            android.widget.TextView r3 = r1.f36825E
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r8 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r8 = r8.x
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
            r3.measure(r7, r5)
        L_0x029c:
            android.widget.TextView r3 = r1.f36825E
            int r3 = r3.getMeasuredWidth()
            int r6 = r6 - r3
            te3.hx0 r3 = r2.f36812a
            if (r3 == 0) goto L_0x02b6
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            if (r3 == 0) goto L_0x02b6
            ok1.e r7 = ok1.C62042e.f176370a
            cl1.o r8 = r0.f36794g
            fj1.b r8 = r8.f107146d
            boolean r3 = r7.mo87087i1(r8, r3)
            goto L_0x02b7
        L_0x02b6:
            r3 = 0
        L_0x02b7:
            boolean r7 = r23.mo12377G4()
            if (r7 == 0) goto L_0x035c
            if (r3 != 0) goto L_0x035c
            te3.hx0 r3 = r2.f36812a
            if (r3 == 0) goto L_0x02d2
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x02d2
            te3.ii0 r3 = r3.extInfo
            if (r3 == 0) goto L_0x02d2
            int r3 = r3.f135356g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x02d3
        L_0x02d2:
            r3 = 0
        L_0x02d3:
            if (r3 != 0) goto L_0x02d6
            goto L_0x02ec
        L_0x02d6:
            int r7 = r3.intValue()
            if (r7 != r4) goto L_0x02ec
            android.widget.ImageView r3 = r1.f36824D
            r3.setVisibility(r5)
            android.widget.ImageView r3 = r1.f36824D
            r4 = 2131755869(0x7f10035d, float:1.914263E38)
            r3.setImageResource(r4)
            java.lang.String r3 = "male"
            goto L_0x030d
        L_0x02ec:
            if (r3 != 0) goto L_0x02ef
            goto L_0x0305
        L_0x02ef:
            int r3 = r3.intValue()
            if (r3 != r11) goto L_0x0305
            android.widget.ImageView r3 = r1.f36824D
            r3.setVisibility(r5)
            android.widget.ImageView r3 = r1.f36824D
            r4 = 2131755868(0x7f10035c, float:1.9142627E38)
            r3.setImageResource(r4)
            java.lang.String r3 = "female"
            goto L_0x030d
        L_0x0305:
            android.widget.ImageView r3 = r1.f36824D
            r3.setVisibility(r10)
            java.lang.String r3 = "unknow"
        L_0x030d:
            ok1.e r4 = ok1.C62042e.f176370a
            java.lang.String r5 = r0.f36795h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setUserSex:"
            r7.append(r8)
            te3.hx0 r8 = r2.f36812a
            if (r8 == 0) goto L_0x0327
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x0327
            java.lang.String r8 = r8.nickname
            goto L_0x0328
        L_0x0327:
            r8 = 0
        L_0x0328:
            r7.append(r8)
            java.lang.String r8 = " sex is "
            r7.append(r8)
            r7.append(r3)
            r3 = 40
            r7.append(r3)
            te3.hx0 r2 = r2.f36812a
            if (r2 == 0) goto L_0x034b
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x034b
            te3.ii0 r2 = r2.extInfo
            if (r2 == 0) goto L_0x034b
            int r2 = r2.f135356g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            goto L_0x034c
        L_0x034b:
            r12 = 0
        L_0x034c:
            r7.append(r12)
            r2 = 41
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r4.mo86998D1(r5, r2)
            goto L_0x0361
        L_0x035c:
            android.widget.ImageView r2 = r1.f36824D
            r2.setVisibility(r10)
        L_0x0361:
            android.widget.ImageView r2 = r1.f36824D
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0373
            android.content.res.Resources r2 = r0.f36792e
            r3 = 2131165337(0x7f070099, float:1.7944888E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            int r6 = r6 - r2
        L_0x0373:
            android.view.View r2 = r1.f36823C
            int r2 = r2.getVisibility()
            r3 = 2131165329(0x7f070091, float:1.7944872E38)
            if (r2 != 0) goto L_0x0385
            android.content.res.Resources r2 = r0.f36792e
            int r2 = r2.getDimensionPixelOffset(r3)
            int r6 = r6 - r2
        L_0x0385:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f36822B
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0394
            android.content.res.Resources r2 = r0.f36792e
            int r2 = r2.getDimensionPixelOffset(r3)
            int r6 = r6 - r2
        L_0x0394:
            android.widget.TextView r2 = r1.f36826F
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x03ad
            android.widget.TextView r2 = r1.f36826F
            int r2 = r2.getMeasuredWidth()
            android.content.res.Resources r3 = r0.f36792e
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            int r2 = r2 + r3
            int r6 = r6 - r2
        L_0x03ad:
            if (r6 <= 0) goto L_0x03b1
            r2 = r6
            goto L_0x03b3
        L_0x03b1:
            int r2 = r0.f36788J
        L_0x03b3:
            r0.f36789K = r2
            android.widget.TextView r2 = r1.f36821A
            int r2 = r2.getMaxWidth()
            r0.f36790L = r2
            android.widget.TextView r2 = r1.f36821A
            int r3 = r0.f36789K
            r2.setMaxWidth(r3)
            int r2 = r0.f36789K
            int r3 = r0.f36790L
            if (r2 >= r3) goto L_0x03cf
            android.widget.TextView r1 = r1.f36821A
            r1.requestLayout()
        L_0x03cf:
            ok1.e r1 = ok1.C62042e.f176370a
            java.lang.String r2 = r0.f36795h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setUserItem usernameMaxWidth:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ",DEFAULT_NICKNAME_MAX_WIDTH:"
            r3.append(r4)
            int r4 = r0.f36788J
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo86998D1(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C12855y1.mo12380u5(qk1.y1$f, int, qk1.y1$c, java.lang.Boolean):void");
    }
}
