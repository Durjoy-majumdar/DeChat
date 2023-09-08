package u92;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;
import sx3.C110818d0;
import v92.C65558a;
import w92.C65943a;

/* renamed from: u92.a */
public final class C65238a extends C67092e0 {

    /* renamed from: w */
    public static TimeInterpolator f187785w;

    /* renamed from: h */
    public final RecyclerView f187786h;

    /* renamed from: i */
    public final C65943a f187787i;

    /* renamed from: j */
    public final String f187788j = "MicroMsg.MultiTask.MinusAnimator";

    /* renamed from: k */
    public ArrayList<RecyclerView.C16631z> f187789k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<RecyclerView.C16631z> f187790l = new ArrayList<>();

    /* renamed from: m */
    public final ArrayList<C65241c> f187791m = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<C65239a> f187792n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f187793o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<ArrayList<C65241c>> f187794p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<ArrayList<C65239a>> f187795q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<ArrayList<C65240b>> f187796r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<RecyclerView.C16631z> f187797s = new ArrayList<>();

    /* renamed from: t */
    public ArrayList<RecyclerView.C16631z> f187798t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<RecyclerView.C16631z> f187799u = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<RecyclerView.C16631z> f187800v = new ArrayList<>();

    /* renamed from: u92.a$a */
    public final class C65239a {

        /* renamed from: a */
        public RecyclerView.C16631z f187801a;

        /* renamed from: b */
        public RecyclerView.C16631z f187802b;

        /* renamed from: c */
        public int f187803c;

        /* renamed from: d */
        public int f187804d;

        /* renamed from: e */
        public int f187805e;

        /* renamed from: f */
        public int f187806f;

        /* renamed from: g */
        public float f187807g;

        /* renamed from: h */
        public float f187808h;

        public C65239a(C65238a aVar, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4, float f, float f2) {
            this.f187801a = zVar;
            this.f187802b = zVar2;
            this.f187803c = i;
            this.f187804d = i2;
            this.f187805e = i3;
            this.f187806f = i4;
            this.f187807g = f;
            this.f187808h = f2;
        }
    }

    /* renamed from: u92.a$b */
    public final class C65240b {

        /* renamed from: a */
        public RecyclerView.C16631z f187809a;

        /* renamed from: b */
        public int f187810b;

        /* renamed from: c */
        public int f187811c;

        public C65240b(C65238a aVar, RecyclerView.C16631z zVar, int i, int i2, ValueAnimator valueAnimator, int i3, C8480h hVar) {
            C87412m.m108594g(zVar, "holder");
            this.f187809a = zVar;
            this.f187810b = i;
            this.f187811c = i2;
        }
    }

    /* renamed from: u92.a$c */
    public final class C65241c {

        /* renamed from: a */
        public RecyclerView.C16631z f187812a;

        /* renamed from: b */
        public int f187813b;

        /* renamed from: c */
        public int f187814c;

        /* renamed from: d */
        public int f187815d;

        /* renamed from: e */
        public int f187816e;

        /* renamed from: f */
        public final int f187817f;

        public C65241c(C65238a aVar, RecyclerView.C16631z zVar, int i, int i2, int i3, int i4, int i5) {
            C87412m.m108594g(zVar, "holder");
            this.f187812a = zVar;
            this.f187813b = i;
            this.f187814c = i2;
            this.f187815d = i3;
            this.f187816e = i4;
            this.f187817f = i5;
        }
    }

    /* renamed from: u92.a$d */
    public static final class C65242d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<RecyclerView.C16631z> f187818d;

        /* renamed from: e */
        public final /* synthetic */ C65238a f187819e;

        public C65242d(ArrayList<RecyclerView.C16631z> arrayList, C65238a aVar) {
            this.f187818d = arrayList;
            this.f187819e = aVar;
        }

        public final void run() {
            Iterator<RecyclerView.C16631z> it = this.f187818d.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z next = it.next();
                C65238a aVar = this.f187819e;
                C87412m.m108593f(next, "holder");
                aVar.getClass();
                View view = next.f44854d;
                C87412m.m108593f(view, "holder.itemView");
                ViewPropertyAnimator animate = view.animate();
                aVar.f187797s.add(next);
                animate.alpha(1.0f).setDuration(aVar.f44807c).setListener(new C65245b(aVar, next, view, animate)).start();
            }
            this.f187818d.clear();
            this.f187819e.f187793o.remove(this.f187818d);
        }
    }

    /* renamed from: u92.a$e */
    public static final class C65243e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C65239a> f187820d;

        /* renamed from: e */
        public final /* synthetic */ C65238a f187821e;

        public C65243e(ArrayList<C65239a> arrayList, C65238a aVar) {
            this.f187820d = arrayList;
            this.f187821e = aVar;
        }

        public final void run() {
            Iterator<C65239a> it = this.f187820d.iterator();
            while (it.hasNext()) {
                C65239a next = it.next();
                C65238a aVar = this.f187821e;
                C87412m.m108593f(next, "change");
                aVar.getClass();
                RecyclerView.C16631z zVar = next.f187801a;
                View view = zVar != null ? zVar.f44854d : null;
                RecyclerView.C16631z zVar2 = next.f187802b;
                View view2 = zVar2 != null ? zVar2.f44854d : null;
                float f = next.f187807g;
                float f2 = next.f187808h;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(aVar.f44810f);
                    aVar.f187800v.add(next.f187801a);
                    duration.translationX(((float) next.f187805e) - ((float) next.f187803c));
                    duration.translationY(((float) next.f187806f) - ((float) next.f187804d));
                    ViewPropertyAnimator alpha = duration.alpha(0.0f);
                    C65246c cVar = r3;
                    C65246c cVar2 = new C65246c(aVar, next, duration, view, f, f2);
                    alpha.setListener(cVar).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    aVar.f187800v.add(next.f187802b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(aVar.f44810f).alpha(1.0f).setListener(new C65247d(aVar, next, animate, view2, f, f2)).start();
                }
            }
            this.f187820d.clear();
            this.f187821e.f187795q.remove(this.f187820d);
        }
    }

    /* renamed from: u92.a$f */
    public static final class C65244f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C65241c> f187822d;

        /* renamed from: e */
        public final /* synthetic */ C65238a f187823e;

        public C65244f(ArrayList<C65241c> arrayList, C65238a aVar) {
            this.f187822d = arrayList;
            this.f187823e = aVar;
        }

        public final void run() {
            Iterator<C65241c> it = this.f187822d.iterator();
            while (it.hasNext()) {
                C65241c next = it.next();
                C65238a aVar = this.f187823e;
                RecyclerView.C16631z zVar = next.f187812a;
                int i = next.f187813b;
                int i2 = next.f187814c;
                int i3 = next.f187815d;
                int i4 = next.f187816e;
                int i5 = next.f187817f;
                aVar.getClass();
                C87412m.m108594g(zVar, "holder");
                String str = aVar.f187788j;
                Log.m105918d(str, "animateMoveImpl pos:" + zVar.mo17363j() + " fromX:" + i + " fromY:" + i2 + " toX:" + i3 + " toY:" + i4 + " holder.left:" + zVar.f44854d.getLeft() + " holder.top:" + zVar.f44854d.getTop());
                RecyclerView.C16613e adapter = aVar.f187786h.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                View view = zVar.f44854d;
                C87412m.m108593f(view, "holder.itemView");
                int i6 = i3 - i;
                int i7 = i4 - i2;
                if (i6 != 0) {
                    if (itemCount <= 3 && i5 == 1) {
                        view.animate().translationX((float) i3);
                    } else if (itemCount > 3 || i5 != 2) {
                        view.animate().translationX(0.0f);
                    } else {
                        view.animate().translationX(0.0f);
                    }
                }
                if (i7 != 0) {
                    if (itemCount <= 3 && i5 == 1) {
                        view.animate().translationY((float) i4);
                    } else if (itemCount > 3 || i5 != 2) {
                        view.animate().translationY(0.0f);
                    } else {
                        view.animate().translationY((float) i4);
                    }
                }
                ViewPropertyAnimator animate = view.animate();
                aVar.f187798t.add(zVar);
                animate.setDuration(aVar.f44809e).setListener(new C65250g(aVar, zVar, i6, view, i7, animate)).start();
            }
            this.f187822d.clear();
            this.f187823e.f187794p.remove(this.f187822d);
        }
    }

    public C65238a(RecyclerView recyclerView, C65943a aVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f187786h = recyclerView;
        this.f187787i = aVar;
    }

    /* renamed from: C */
    public final boolean mo89365C(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4, int i5) {
        RecyclerView.C16631z zVar2 = zVar;
        C87412m.m108594g(zVar2, "holder");
        View view = zVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int translationX = i + ((int) zVar2.f44854d.getTranslationX());
        int translationY = i2 + ((int) zVar2.f44854d.getTranslationY());
        mo89371I(zVar);
        int left = translationX - zVar2.f44854d.getLeft();
        int top = translationY - zVar2.f44854d.getTop();
        if (left == 0 && top == 0) {
            mo91175w(zVar);
            return false;
        }
        if (left != 0) {
            view.setTranslationX((float) left);
        }
        if (top != 0) {
            view.setTranslationY((float) top);
        }
        this.f187791m.add(new C65241c(this, zVar, translationX, translationY, i3, i4, i5));
        String str = this.f187788j;
        Log.m105918d(str, "animateMove1 fromX:" + translationX + " fromY:" + translationY + " toX:" + i3 + " toY:" + i4 + " deltaX:" + left + " deltaY:" + top + " holder.left:" + zVar2.f44854d.getLeft() + " holder.top:" + zVar2.f44854d.getTop() + " holder.position:" + zVar.mo17363j());
        return true;
    }

    /* renamed from: D */
    public final boolean mo89366D(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4, int i5) {
        RecyclerView.C16631z zVar2 = zVar;
        int i6 = i3;
        int i7 = i4;
        C87412m.m108594g(zVar2, "holder");
        View view = zVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int translationX = i + ((int) zVar2.f44854d.getTranslationX());
        int translationY = i2 + ((int) zVar2.f44854d.getTranslationY());
        mo89371I(zVar);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            mo91175w(zVar);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-((float) i8));
        }
        if (i9 != 0) {
            view.setTranslationY(-((float) i9));
        }
        C65241c cVar = r0;
        C65241c cVar2 = new C65241c(this, zVar, translationX, i4, i3, i5, 2);
        this.f187791m.add(cVar);
        String str = this.f187788j;
        StringBuilder sb = new StringBuilder();
        sb.append("animateMove3 fromX:");
        sb.append(translationX);
        sb.append(" fromY:");
        sb.append(translationY);
        sb.append(" toX:");
        sb.append(i6);
        sb.append(" toY:");
        sb.append(i7);
        sb.append(" deltaX:");
        sb.append(i8);
        sb.append(" deltaY:");
        sb.append(i9);
        sb.append(" holder.left:");
        RecyclerView.C16631z zVar3 = zVar;
        sb.append(zVar3.f44854d.getLeft());
        sb.append(" holder.top:");
        sb.append(zVar3.f44854d.getTop());
        sb.append(" holder.position:");
        sb.append(zVar.mo17363j());
        Log.m105918d(str, sb.toString());
        return true;
    }

    /* renamed from: E */
    public final void mo89367E(List<? extends RecyclerView.C16631z> list) {
        View view;
        ViewPropertyAnimator animate;
        C87412m.m108594g(list, "viewHolders");
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.C16631z zVar = (RecyclerView.C16631z) list.get(size);
                if (!(zVar == null || (view = zVar.f44854d) == null || (animate = view.animate()) == null)) {
                    animate.cancel();
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo89368F() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: G */
    public final void mo89369G(List<C65239a> list, RecyclerView.C16631z zVar) {
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C65239a aVar = list.get(size);
                if (mo89370H(aVar, zVar) && aVar.f187801a == null && aVar.f187802b == null) {
                    list.remove(aVar);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    public final boolean mo89370H(C65239a aVar, RecyclerView.C16631z zVar) {
        if (aVar.f187802b == zVar) {
            aVar.f187802b = null;
        } else if (aVar.f187801a != zVar) {
            return false;
        } else {
            aVar.f187801a = null;
        }
        if (zVar != null) {
            View view = zVar.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            zVar.f44854d.setTranslationX(aVar.f187807g);
            zVar.f44854d.setTranslationY(aVar.f187808h);
            String str = this.f187788j;
            Log.m105918d(str, "endAnimations,change reset!, transX: " + aVar.f187807g + " transY: " + aVar.f187808h);
        }
        mo17319h(zVar);
        return true;
    }

    /* renamed from: I */
    public final void mo89371I(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        if (f187785w == null) {
            f187785w = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f187785w);
        mo17321j(zVar);
    }

    /* renamed from: d */
    public boolean mo17316d(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        RecyclerView.C16631z zVar2 = zVar;
        RecyclerView.C16616j.C16619c cVar3 = cVar;
        RecyclerView.C16616j.C16619c cVar4 = cVar2;
        C87412m.m108594g(zVar2, "viewHolder");
        C87412m.m108594g(cVar3, "preInfo");
        C87412m.m108594g(cVar4, "postInfo");
        String str = this.f187788j;
        Log.m105918d(str, "animatePersistence layoutPosition:" + zVar.mo17364k() + " adapterPosition:" + zVar.mo17363j() + " hashCode:" + zVar.hashCode());
        boolean z = false;
        if (cVar3.f44811a == cVar4.f44811a && cVar3.f44812b == cVar4.f44812b) {
            if (!(this.f187790l.size() > 0)) {
                RecyclerView.C16613e adapter = this.f187786h.getAdapter();
                if ((adapter != null && adapter.getItemCount() == 2) && zVar.mo17363j() == 1) {
                    int i = cVar3.f44811a;
                    int i2 = cVar3.f44812b;
                    int i3 = MultiTaskUIC.f346687W;
                    int i4 = MultiTaskUIC.f346686V;
                    View view = zVar2.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    int translationX = i + ((int) zVar2.f44854d.getTranslationX());
                    int translationY = i2 + ((int) zVar2.f44854d.getTranslationY());
                    mo89371I(zVar);
                    int left = translationX - zVar2.f44854d.getLeft();
                    int top = translationY - zVar2.f44854d.getTop();
                    if (left != 0) {
                        view.setTranslationX((float) left);
                    }
                    if (top != 0) {
                        view.setTranslationY((float) top);
                    }
                    C65241c cVar5 = r0;
                    ArrayList<C65241c> arrayList = this.f187791m;
                    C65241c cVar6 = new C65241c(this, zVar, translationX, translationY, i3, i4, 1);
                    arrayList.add(cVar5);
                    String str2 = this.f187788j;
                    StringBuilder sb = new StringBuilder();
                    sb.append("animateMove2 fromX:");
                    sb.append(translationX);
                    sb.append(" fromY:");
                    sb.append(translationY);
                    sb.append(" toX:");
                    sb.append(i3);
                    sb.append(" toY:");
                    sb.append(i4);
                    sb.append(" deltaX:");
                    sb.append(left);
                    sb.append(" deltaY:");
                    sb.append(top);
                    sb.append(" holder.left:");
                    RecyclerView.C16631z zVar3 = zVar;
                    sb.append(zVar3.f44854d.getLeft());
                    sb.append(" holder.top:");
                    sb.append(zVar3.f44854d.getTop());
                    sb.append(" holder.position:");
                    sb.append(zVar.mo17363j());
                    Log.m105918d(str2, sb.toString());
                    return true;
                }
            }
            RecyclerView.C16631z zVar4 = zVar2;
            mo91175w(zVar);
            return false;
        }
        RecyclerView.C16631z zVar5 = zVar2;
        if (!(this.f187790l.size() > 0)) {
            RecyclerView.C16613e adapter2 = this.f187786h.getAdapter();
            if (!(adapter2 != null && adapter2.getItemCount() == 2) || zVar.mo17363j() != 1) {
                RecyclerView.C16613e adapter3 = this.f187786h.getAdapter();
                if (adapter3 != null && adapter3.getItemCount() == 3) {
                    if (zVar.mo17363j() == 1) {
                        mo89365C(zVar, cVar3.f44811a, cVar3.f44812b, 0, MultiTaskUIC.f346688X, 1);
                        return true;
                    } else if (zVar.mo17363j() == 2) {
                        mo89366D(zVar, cVar3.f44811a, cVar3.f44812b, cVar4.f44811a, cVar4.f44812b, MultiTaskUIC.f346688X);
                        return true;
                    }
                }
            } else {
                mo89365C(zVar, cVar3.f44811a, cVar3.f44812b, MultiTaskUIC.f346687W, MultiTaskUIC.f346686V, 1);
                return true;
            }
        }
        if (this.f187790l.size() > 0) {
            RecyclerView.C16613e adapter4 = this.f187786h.getAdapter();
            if (adapter4 != null && adapter4.getItemCount() == 3) {
                z = true;
            }
            if (z) {
                zVar.mo17363j();
                if (zVar.mo17363j() == 2) {
                    mo89366D(zVar, cVar3.f44811a, cVar3.f44812b, cVar4.f44811a, cVar4.f44812b, MultiTaskUIC.f346688X);
                    return true;
                }
            }
        }
        return mo75019u(zVar, cVar3.f44811a, cVar3.f44812b, cVar4.f44811a, cVar4.f44812b);
    }

    /* renamed from: g */
    public boolean mo17318g(RecyclerView.C16631z zVar, List<? extends Object> list) {
        C87412m.m108594g(zVar, "viewHolder");
        C87412m.m108594g(list, "payloads");
        return (list.isEmpty() ^ true) || mo17317f(zVar);
    }

    /* renamed from: j */
    public void mo17321j(RecyclerView.C16631z zVar) {
        RecyclerView.C16631z zVar2 = zVar;
        C87412m.m108594g(zVar2, "item");
        Log.m105918d(this.f187788j, "endAnimation " + zVar.mo17363j());
        View view = zVar2.f44854d;
        C87412m.m108593f(view, "item.itemView");
        View findViewById = zVar2.f44854d.findViewById(C0966R.C0970id.h3h);
        view.animate().cancel();
        int size = this.f187791m.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C65241c cVar = this.f187791m.get(size);
                C87412m.m108593f(cVar, "mPendingMoves[i]");
                if (cVar.f187812a == zVar2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    this.f187791m.remove(size);
                    Log.m105918d(this.f187788j, "endAnimation, reset");
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        mo89369G(this.f187792n, zVar2);
        float f = 1.0f;
        if (this.f187789k.remove(zVar2)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo91176x(zVar);
        }
        if (this.f187790l.remove(zVar2)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f187795q.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<C65239a> arrayList = this.f187795q.get(size2);
                C87412m.m108593f(arrayList, "mChangesList[i]");
                ArrayList arrayList2 = arrayList;
                mo89369G(arrayList2, zVar2);
                if (arrayList2.isEmpty()) {
                    this.f187795q.remove(size2);
                }
                if (i2 < 0) {
                    break;
                }
                size2 = i2;
            }
        }
        int size3 = this.f187794p.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList<C65241c> arrayList3 = this.f187794p.get(size3);
                C87412m.m108593f(arrayList3, "mMovesList[i]");
                ArrayList arrayList4 = arrayList3;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj = arrayList4.get(size4);
                        C87412m.m108593f(obj, "moves[j]");
                        if (((C65241c) obj).f187812a == zVar2) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            mo91175w(zVar);
                            arrayList4.remove(size4);
                            if (arrayList4.isEmpty()) {
                                this.f187794p.remove(size3);
                            }
                            Log.m105918d(this.f187788j, "endAnimations,move reset!");
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                }
                size3 = i3;
            }
        }
        int size5 = this.f187793o.size() - 1;
        if (size5 >= 0) {
            int i5 = size5;
            while (true) {
                int i6 = i5 - 1;
                ArrayList<RecyclerView.C16631z> arrayList5 = this.f187793o.get(i5);
                C87412m.m108593f(arrayList5, "mAdditionsList[i]");
                ArrayList arrayList6 = arrayList5;
                if (arrayList6.remove(zVar2)) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(f));
                    ArrayList arrayList7 = arrayList6;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar);
                    if (arrayList7.isEmpty()) {
                        this.f187793o.remove(i5);
                    }
                }
                if (i6 < 0) {
                    break;
                }
                i5 = i6;
                f = 1.0f;
            }
        }
        int size6 = this.f187796r.size() - 1;
        if (size6 >= 0) {
            while (true) {
                int i7 = size6 - 1;
                ArrayList<C65240b> arrayList8 = this.f187796r.get(size6);
                C87412m.m108593f(arrayList8, "mLayoutsList[i]");
                ArrayList arrayList9 = arrayList8;
                int size7 = arrayList9.size() - 1;
                if (size7 >= 0) {
                    while (true) {
                        int i8 = size7 - 1;
                        Object obj2 = arrayList9.get(size7);
                        C87412m.m108593f(obj2, "layouts[j]");
                        C65240b bVar = (C65240b) obj2;
                        if (bVar.f187809a == zVar2) {
                            findViewById.getLayoutParams().height = C60641c.m70921b(((float) (bVar.f187810b - MultiTaskUIC.f346672J)) * MultiTaskUIC.f346683S0);
                            view.getLayoutParams().width = bVar.f187810b;
                            view.getLayoutParams().height = C60641c.m70921b(((float) bVar.f187810b) * MultiTaskUIC.f346681R0);
                            view.requestLayout();
                            arrayList9.remove(size7);
                            if (arrayList9.isEmpty()) {
                                this.f187796r.remove(size6);
                            }
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size7 = i8;
                        }
                    }
                }
                if (i7 < 0) {
                    break;
                }
                size6 = i7;
            }
        }
        this.f187799u.remove(zVar2);
        this.f187797s.remove(zVar2);
        this.f187800v.remove(zVar2);
        this.f187798t.remove(zVar2);
        mo89368F();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        Log.m105918d(this.f187788j, "endAnimations");
        int i = -1;
        for (int size = this.f187791m.size() - 1; -1 < size; size--) {
            C65241c cVar = this.f187791m.get(size);
            C87412m.m108593f(cVar, "mPendingMoves[i]");
            C65241c cVar2 = cVar;
            View view = cVar2.f187812a.f44854d;
            C87412m.m108593f(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(cVar2.f187812a);
            this.f187791m.remove(size);
            Log.m105918d(this.f187788j, "endAnimations, pending move reset!");
        }
        for (int size2 = this.f187789k.size() - 1; -1 < size2; size2--) {
            RecyclerView.C16631z zVar = this.f187789k.get(size2);
            C87412m.m108593f(zVar, "mPendingRemovals[i]");
            mo91176x(zVar);
            this.f187789k.remove(size2);
        }
        int size3 = this.f187790l.size() - 1;
        while (true) {
            f = 1.0f;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.C16631z zVar2 = this.f187790l.get(size3);
            C87412m.m108593f(zVar2, "mPendingAdditions[i]");
            RecyclerView.C16631z zVar3 = zVar2;
            View view2 = zVar3.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar3);
            this.f187790l.remove(size3);
            size3--;
        }
        for (int size4 = this.f187792n.size() - 1; -1 < size4; size4--) {
            C65239a aVar2 = this.f187792n.get(size4);
            C87412m.m108593f(aVar2, "mPendingChanges[i]");
            C65239a aVar3 = aVar2;
            RecyclerView.C16631z zVar4 = aVar3.f187801a;
            if (zVar4 != null) {
                mo89370H(aVar3, zVar4);
            }
            RecyclerView.C16631z zVar5 = aVar3.f187802b;
            if (zVar5 != null) {
                mo89370H(aVar3, zVar5);
            }
        }
        this.f187792n.clear();
        if (mo17325n()) {
            for (int size5 = this.f187794p.size() - 1; -1 < size5; size5--) {
                ArrayList<C65241c> arrayList = this.f187794p.get(size5);
                C87412m.m108593f(arrayList, "mMovesList[i]");
                ArrayList arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; -1 < size6; size6--) {
                    Object obj = arrayList2.get(size6);
                    C87412m.m108593f(obj, "moves[j]");
                    C65241c cVar3 = (C65241c) obj;
                    View view4 = cVar3.f187812a.f44854d;
                    C87412m.m108593f(view4, "item.itemView");
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    mo91175w(cVar3.f187812a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f187794p.remove(arrayList2);
                    }
                    Log.m105918d(this.f187788j, "endAnimations, moveReset Translation");
                }
            }
            int size7 = this.f187793o.size() - 1;
            while (i < size7) {
                ArrayList<RecyclerView.C16631z> arrayList3 = this.f187793o.get(size7);
                C87412m.m108593f(arrayList3, "mAdditionsList[i]");
                ArrayList arrayList4 = arrayList3;
                int size8 = arrayList4.size() + i;
                while (i < size8) {
                    Object obj2 = arrayList4.get(size8);
                    C87412m.m108593f(obj2, "additions[j]");
                    RecyclerView.C16631z zVar6 = (RecyclerView.C16631z) obj2;
                    View view5 = zVar6.f44854d;
                    C87412m.m108593f(view5, "item.itemView");
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view6.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar6);
                    arrayList4.remove(size8);
                    if (arrayList4.isEmpty()) {
                        this.f187793o.remove(arrayList4);
                    }
                    size8--;
                    i = -1;
                    f = 1.0f;
                }
                size7--;
                i = -1;
                f = 1.0f;
            }
            for (int size9 = this.f187795q.size() - 1; -1 < size9; size9--) {
                ArrayList<C65239a> arrayList5 = this.f187795q.get(size9);
                C87412m.m108593f(arrayList5, "mChangesList[i]");
                ArrayList arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; -1 < size10; size10--) {
                    Object obj3 = arrayList6.get(size10);
                    C87412m.m108593f(obj3, "changes[j]");
                    C65239a aVar5 = (C65239a) obj3;
                    RecyclerView.C16631z zVar7 = aVar5.f187801a;
                    if (zVar7 != null) {
                        mo89370H(aVar5, zVar7);
                    }
                    RecyclerView.C16631z zVar8 = aVar5.f187802b;
                    if (zVar8 != null) {
                        mo89370H(aVar5, zVar8);
                    }
                    if (arrayList6.isEmpty()) {
                        this.f187795q.remove(arrayList6);
                    }
                }
            }
            mo89367E(this.f187799u);
            mo89367E(this.f187798t);
            mo89367E(this.f187797s);
            mo89367E(this.f187800v);
            mo17320i();
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return (this.f187790l.isEmpty() ^ true) || (this.f187792n.isEmpty() ^ true) || (this.f187791m.isEmpty() ^ true) || (this.f187789k.isEmpty() ^ true) || (this.f187798t.isEmpty() ^ true) || (this.f187799u.isEmpty() ^ true) || (this.f187797s.isEmpty() ^ true) || (this.f187800v.isEmpty() ^ true) || (this.f187794p.isEmpty() ^ true) || (this.f187793o.isEmpty() ^ true) || (this.f187795q.isEmpty() ^ true);
    }

    /* renamed from: p */
    public void mo17327p(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "viewHolder");
        C65943a aVar = this.f187787i;
        if (aVar != null) {
            aVar.mo89980a(zVar);
        }
    }

    /* renamed from: r */
    public void mo17329r() {
        RecyclerView.C16631z zVar;
        View view;
        C13598b0 b0Var;
        Log.m105918d(this.f187788j, "runPendingAnimations");
        boolean z = !this.f187789k.isEmpty();
        boolean z2 = !this.f187791m.isEmpty();
        boolean z3 = !this.f187792n.isEmpty();
        boolean z4 = !this.f187790l.isEmpty();
        Iterator<RecyclerView.C16631z> it = this.f187789k.iterator();
        while (it.hasNext()) {
            RecyclerView.C16631z next = it.next();
            C87412m.m108593f(next, "holder");
            View view2 = next.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            ViewPropertyAnimator animate = view2.animate();
            this.f187799u.add(next);
            animate.setDuration(this.f44808d).alpha(0.0f).setListener(new C65251h(this, next, animate, view2)).start();
        }
        this.f187789k.clear();
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f187791m);
            this.f187794p.add(arrayList);
            this.f187791m.clear();
            C65244f fVar = new C65244f(arrayList, this);
            if (z) {
                View view3 = ((C65241c) arrayList.get(0)).f187812a.f44854d;
                C87412m.m108593f(view3, "moves[0].holder.itemView");
                long j = this.f44808d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145186n(view3, fVar, j);
            } else {
                fVar.run();
            }
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f187792n);
            this.f187795q.add(arrayList2);
            this.f187792n.clear();
            C65243e eVar = new C65243e(arrayList2, this);
            if (z) {
                RecyclerView.C16631z zVar2 = ((C65239a) arrayList2.get(0)).f187801a;
                if (zVar2 != null) {
                    View view4 = zVar2.f44854d;
                    long j2 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view4, eVar, j2);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    eVar.run();
                }
            } else {
                eVar.run();
            }
        }
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f187790l);
            this.f187793o.add(arrayList3);
            this.f187790l.clear();
            C65242d dVar = new C65242d(arrayList3, this);
            if (z || z2 || z3) {
                View view5 = ((RecyclerView.C16631z) arrayList3.get(0)).f44854d;
                C87412m.m108593f(view5, "additions[0].itemView");
                long j3 = this.f44808d;
                WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                C107207u.C107208b.m145186n(view5, dVar, j3);
            } else {
                dVar.run();
            }
        }
        RecyclerView.C16613e adapter = this.f187786h.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2) {
            ArrayList arrayList4 = new ArrayList();
            if (itemCount == 2) {
                int childCount = this.f187786h.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f187786h.getChildAt(i);
                    RecyclerView.C16631z F0 = this.f187786h.mo17021F0(childAt);
                    if (F0 != null) {
                        C60905o oVar = F0 instanceof C60905o ? (C60905o) F0 : null;
                        if (!(oVar == null || ((C65558a) oVar.f173503E) == null || childAt.getWidth() >= MultiTaskUIC.f346677P)) {
                            C65240b bVar = r0;
                            C65240b bVar2 = new C65240b(this, F0, F0.f44854d.getWidth(), MultiTaskUIC.f346677P, (ValueAnimator) null, 8, (C8480h) null);
                            arrayList4.add(bVar);
                        }
                    }
                }
            } else if (itemCount >= 3) {
                int childCount2 = this.f187786h.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = this.f187786h.getChildAt(i2);
                    RecyclerView.C16631z F02 = this.f187786h.mo17021F0(childAt2);
                    if (F02 != null) {
                        C60905o oVar2 = F02 instanceof C60905o ? (C60905o) F02 : null;
                        if (!(oVar2 == null || ((C65558a) oVar2.f173503E) == null || childAt2.getWidth() <= MultiTaskUIC.f346675M)) {
                            arrayList4.add(new C65240b(this, F02, F02.f44854d.getWidth(), MultiTaskUIC.f346675M, (ValueAnimator) null, 8, (C8480h) null));
                        }
                    }
                }
            }
            this.f187796r.add(arrayList4);
            C65252i iVar = new C65252i(arrayList4, this);
            if (z || z2 || z3) {
                C65240b bVar3 = (C65240b) C110818d0.m150916N(arrayList4);
                if (bVar3 != null && (zVar = bVar3.f187809a) != null && (view = zVar.f44854d) != null) {
                    long j4 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap4 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view, iVar, j4);
                    return;
                }
                return;
            }
            iVar.run();
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        View findViewById;
        C87412m.m108594g(zVar, "viewHolder");
        String str = this.f187788j;
        StringBuilder sb = new StringBuilder();
        sb.append("animateAdd layoutPosition:");
        sb.append(zVar.mo17364k());
        sb.append(" adapterPosition:");
        sb.append(zVar.mo17363j());
        sb.append(" hashCode:");
        sb.append(zVar.hashCode());
        sb.append(" itemCount:");
        RecyclerView.C16613e adapter = this.f187786h.getAdapter();
        sb.append(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
        Log.m105918d(str, sb.toString());
        mo89371I(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i = 0;
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f187790l.add(zVar);
        RecyclerView.C16613e adapter2 = this.f187786h.getAdapter();
        if (adapter2 != null) {
            i = adapter2.getItemCount();
        }
        if (i == 2) {
            if (zVar.mo17364k() == 1) {
                ArrayList<C65241c> arrayList = this.f187791m;
                int left = zVar.f44854d.getLeft();
                int top = zVar.f44854d.getTop();
                MultiTaskUIC.C115597a aVar2 = MultiTaskUIC.f346667E;
                arrayList.add(new C65241c(this, zVar, left, top, MultiTaskUIC.f346687W, MultiTaskUIC.f346686V, 1));
            }
        } else if (i == 3) {
            ArrayList<C65241c> arrayList2 = this.f187791m;
            int left2 = zVar.f44854d.getLeft();
            int top2 = zVar.f44854d.getTop();
            MultiTaskUIC.C115597a aVar3 = MultiTaskUIC.f346667E;
            arrayList2.add(new C65241c(this, zVar, left2, top2, 0, MultiTaskUIC.f346688X, 1));
            RecyclerView.C16631z I0 = this.f187786h.mo17023I0(2);
            if (I0 != null) {
                this.f187791m.add(new C65241c(this, I0, I0.f44854d.getLeft(), I0.f44854d.getTop(), I0.f44854d.getLeft(), MultiTaskUIC.f346688X, 1));
            }
        } else if (i >= 4 && (findViewById = zVar.f44854d.findViewById(C0966R.C0970id.fa8)) != null) {
            findViewById.setTranslationX(0.0f);
            findViewById.setTranslationY(0.0f);
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
        RecyclerView.C16631z zVar3 = zVar;
        RecyclerView.C16631z zVar4 = zVar2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        C87412m.m108594g(zVar3, "oldHolder");
        C87412m.m108594g(zVar4, "newHolder");
        if (zVar3 == zVar4) {
            return mo75019u(zVar, i, i2, i3, i4);
        }
        float translationX = zVar3.f44854d.getTranslationX();
        float translationY = zVar3.f44854d.getTranslationY();
        float alpha = zVar3.f44854d.getAlpha();
        mo89371I(zVar);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i9 = 0;
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mo89371I(zVar4);
        zVar4.f44854d.setTranslationX(-((float) ((int) (((float) (i7 - i5)) - translationX))));
        zVar4.f44854d.setTranslationY(-((float) ((int) (((float) (i8 - i6)) - translationY))));
        View view3 = zVar4.f44854d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        RecyclerView.C16613e adapter = this.f187786h.getAdapter();
        if (adapter != null) {
            i9 = adapter.getItemCount();
        }
        if ((i9 == 2 || i9 == 3) && i5 == i7 && i6 == i8) {
            this.f187792n.add(new C65239a(this, zVar, zVar2, i, i2, i3, i4, translationX, translationY));
            return true;
        }
        this.f187792n.add(new C65239a(this, zVar, zVar2, i, i2, i3, i4, 0.0f, 0.0f));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        RecyclerView.C16631z zVar2 = zVar;
        int i5 = i3;
        int i6 = i4;
        C87412m.m108594g(zVar2, "holder");
        View view = zVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int translationX = i + ((int) zVar2.f44854d.getTranslationX());
        int translationY = i2 + ((int) zVar2.f44854d.getTranslationY());
        mo89371I(zVar);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            mo91175w(zVar);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-((float) i7));
        }
        if (i8 != 0) {
            view.setTranslationY(-((float) i8));
        }
        C65241c cVar = r0;
        C65241c cVar2 = new C65241c(this, zVar, translationX, translationY, i3, i4, 0);
        this.f187791m.add(cVar);
        String str = this.f187788j;
        StringBuilder sb = new StringBuilder();
        sb.append("animateMove fromX:");
        sb.append(translationX);
        sb.append(" fromY:");
        sb.append(translationY);
        sb.append(" toX:");
        sb.append(i5);
        sb.append(" toY:");
        sb.append(i6);
        sb.append(" deltaX:");
        sb.append(i7);
        sb.append(" deltaY:");
        sb.append(i8);
        sb.append(" holder.left:");
        RecyclerView.C16631z zVar3 = zVar;
        sb.append(zVar3.f44854d.getLeft());
        sb.append(" holder.top:");
        sb.append(zVar3.f44854d.getTop());
        sb.append(" holder.position:");
        sb.append(zVar.mo17363j());
        Log.m105918d(str, sb.toString());
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        RecyclerView.C16631z I0;
        C87412m.m108594g(zVar, "viewHolder");
        String str = this.f187788j;
        Log.m105918d(str, "animateRemove layoutPosition:" + zVar.mo17364k() + " adapterPosition:" + zVar.mo17363j() + " hashCode:" + zVar.hashCode());
        mo89371I(zVar);
        this.f187789k.add(zVar);
        RecyclerView.C16613e adapter = this.f187786h.getAdapter();
        boolean z = false;
        if (adapter != null && adapter.getItemCount() == 3) {
            z = true;
        }
        if (z) {
            String str2 = this.f187788j;
            Log.m105918d(str2, "animateRemove layoutPosition:" + zVar.mo17364k());
            if (zVar.mo17364k() == 2) {
                RecyclerView.C16631z I02 = this.f187786h.mo17023I0(1);
                if (I02 != null) {
                    Log.m105918d(this.f187788j, "animateRemove add moveInfo from adapterPosition 1");
                    ArrayList<C65241c> arrayList = this.f187791m;
                    int left = I02.f44854d.getLeft();
                    int top = I02.f44854d.getTop();
                    int left2 = I02.f44854d.getLeft();
                    MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
                    arrayList.add(new C65241c(this, I02, left, top, left2, MultiTaskUIC.f346688X, 1));
                }
                RecyclerView.C16631z I03 = this.f187786h.mo17023I0(2);
                if (I03 != null) {
                    Log.m105918d(this.f187788j, "animateRemove add moveInfo from adapterPosition 2");
                    ArrayList<C65241c> arrayList2 = this.f187791m;
                    int left3 = I03.f44854d.getLeft();
                    int top2 = I03.f44854d.getTop();
                    int left4 = I03.f44854d.getLeft();
                    MultiTaskUIC.C115597a aVar2 = MultiTaskUIC.f346667E;
                    arrayList2.add(new C65241c(this, I03, left3, top2, left4, MultiTaskUIC.f346688X, 1));
                }
            } else if (zVar.mo17364k() == 1 && (I0 = this.f187786h.mo17023I0(1)) != null) {
                Log.m105918d(this.f187788j, "animateRemove add moveInfo from adapterPosition 1");
                ArrayList<C65241c> arrayList3 = this.f187791m;
                int left5 = I0.f44854d.getLeft();
                int top3 = I0.f44854d.getTop();
                int left6 = I0.f44854d.getLeft();
                MultiTaskUIC.C115597a aVar3 = MultiTaskUIC.f346667E;
                arrayList3.add(new C65241c(this, I0, left5, top3, left6, MultiTaskUIC.f346688X, 1));
            }
        }
        return true;
    }
}
