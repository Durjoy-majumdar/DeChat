package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.b */
public abstract class C68998b extends C67092e0 {

    /* renamed from: h */
    public final ArrayList<RecyclerView.C16631z> f198266h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<RecyclerView.C16631z> f198267i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<C69003e> f198268j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<C69000b> f198269k = new ArrayList<>();

    /* renamed from: l */
    public final ArrayList<ArrayList<RecyclerView.C16631z>> f198270l = new ArrayList<>();

    /* renamed from: m */
    public final ArrayList<ArrayList<C69003e>> f198271m = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<ArrayList<C69000b>> f198272n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f198273o = new ArrayList<>();

    /* renamed from: p */
    public final ArrayList<RecyclerView.C16631z> f198274p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f198275q = new ArrayList<>();

    /* renamed from: r */
    public final ArrayList<RecyclerView.C16631z> f198276r = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$a */
    public static class C68999a implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animator");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$b */
    public static final class C69000b {

        /* renamed from: a */
        public RecyclerView.C16631z f198277a;

        /* renamed from: b */
        public RecyclerView.C16631z f198278b;

        /* renamed from: c */
        public int f198279c;

        /* renamed from: d */
        public int f198280d;

        /* renamed from: e */
        public int f198281e;

        /* renamed from: f */
        public int f198282f;

        public C69000b(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            C87412m.m108594g(zVar, "oldHolder");
            C87412m.m108594g(zVar2, "newHolder");
            this.f198277a = zVar;
            this.f198278b = zVar2;
            this.f198279c = i;
            this.f198280d = i2;
            this.f198281e = i3;
            this.f198282f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f198277a + ", newHolder=" + this.f198278b + ", fromX=" + this.f198279c + ", fromY=" + this.f198280d + ", toX=" + this.f198281e + ", toY=" + this.f198282f + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$c */
    public final class C69001c extends C68999a {

        /* renamed from: d */
        public RecyclerView.C16631z f198283d;

        /* renamed from: e */
        public final /* synthetic */ C68998b f198284e;

        public C69001c(C68998b bVar, RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "viewHolder");
            this.f198284e = bVar;
            this.f198283d = zVar;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            View view = this.f198283d.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C56823f.m65514a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            View view = this.f198283d.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C56823f.m65514a(view);
            this.f198284e.mo17319h(this.f198283d);
            this.f198284e.f198273o.remove(this.f198283d);
            this.f198284e.mo94973F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f198284e.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$d */
    public final class C69002d extends C68999a {

        /* renamed from: d */
        public RecyclerView.C16631z f198285d;

        /* renamed from: e */
        public final /* synthetic */ C68998b f198286e;

        public C69002d(C68998b bVar, RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "viewHolder");
            this.f198286e = bVar;
            this.f198285d = zVar;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            View view = this.f198285d.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C56823f.m65514a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            View view = this.f198285d.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C56823f.m65514a(view);
            this.f198286e.mo91176x(this.f198285d);
            this.f198286e.f198275q.remove(this.f198285d);
            this.f198286e.mo94973F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f198286e.mo91174B(this.f198285d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$e */
    public static final class C69003e {

        /* renamed from: a */
        public RecyclerView.C16631z f198287a;

        /* renamed from: b */
        public int f198288b;

        /* renamed from: c */
        public int f198289c;

        /* renamed from: d */
        public int f198290d;

        /* renamed from: e */
        public int f198291e;

        public C69003e(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            C87412m.m108594g(zVar, "holder");
            this.f198287a = zVar;
            this.f198288b = i;
            this.f198289c = i2;
            this.f198290d = i3;
            this.f198291e = i4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$f */
    public static final class C69004f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C68998b f198292d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<RecyclerView.C16631z> f198293e;

        public C69004f(C68998b bVar, ArrayList<RecyclerView.C16631z> arrayList) {
            this.f198292d = bVar;
            this.f198293e = arrayList;
        }

        public final void run() {
            if (this.f198292d.f198270l.remove(this.f198293e)) {
                Iterator<RecyclerView.C16631z> it = this.f198293e.iterator();
                while (it.hasNext()) {
                    RecyclerView.C16631z next = it.next();
                    C68998b bVar = this.f198292d;
                    C87412m.m108593f(next, "holder");
                    bVar.getClass();
                    if (next instanceof C68997a) {
                        ((C68997a) next).mo94968c(next, new C69001c(bVar, next));
                    } else {
                        bVar.mo94970C(next);
                    }
                    bVar.f198273o.add(next);
                }
                this.f198293e.clear();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$g */
    public static final class C69005g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C68998b f198294d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C69000b> f198295e;

        public C69005g(C68998b bVar, ArrayList<C69000b> arrayList) {
            this.f198294d = bVar;
            this.f198295e = arrayList;
        }

        public final void run() {
            if (this.f198294d.f198272n.remove(this.f198295e)) {
                Iterator<C69000b> it = this.f198295e.iterator();
                while (it.hasNext()) {
                    C69000b next = it.next();
                    C68998b bVar = this.f198294d;
                    C87412m.m108593f(next, "change");
                    bVar.getClass();
                    RecyclerView.C16631z zVar = next.f198277a;
                    View view = null;
                    View view2 = zVar != null ? zVar.f44854d : null;
                    RecyclerView.C16631z zVar2 = next.f198278b;
                    if (zVar2 != null) {
                        view = zVar2.f44854d;
                    }
                    if (view2 != null) {
                        if (zVar != null) {
                            bVar.f198276r.add(zVar);
                        }
                        ViewPropertyAnimator duration = view2.animate().setDuration(bVar.f44810f);
                        duration.translationX(((float) next.f198281e) - ((float) next.f198279c));
                        duration.translationY(((float) next.f198282f) - ((float) next.f198280d));
                        duration.alpha(0.0f).setListener(new C69007c(bVar, next, duration, view2)).start();
                    }
                    if (view != null) {
                        RecyclerView.C16631z zVar3 = next.f198278b;
                        if (zVar3 != null) {
                            bVar.f198276r.add(zVar3);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        animate.translationX(0.0f).translationY(0.0f).setDuration(bVar.f44810f).alpha(1.0f).setListener(new C69008d(bVar, next, animate, view)).start();
                    }
                }
                this.f198295e.clear();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.b$h */
    public static final class C69006h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C68998b f198296d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C69003e> f198297e;

        public C69006h(C68998b bVar, ArrayList<C69003e> arrayList) {
            this.f198296d = bVar;
            this.f198297e = arrayList;
        }

        public final void run() {
            if (this.f198296d.f198271m.remove(this.f198297e)) {
                Iterator<C69003e> it = this.f198297e.iterator();
                while (it.hasNext()) {
                    C69003e next = it.next();
                    C68998b bVar = this.f198296d;
                    RecyclerView.C16631z zVar = next.f198287a;
                    int i = next.f198288b;
                    int i2 = next.f198289c;
                    int i3 = next.f198290d;
                    int i4 = next.f198291e;
                    bVar.getClass();
                    View view = zVar.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    bVar.f198274p.add(zVar);
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(bVar.f44809e).setListener(new C69009e(bVar, zVar, i5, view, i6, animate)).start();
                }
                this.f198297e.clear();
            }
        }
    }

    public C68998b() {
        new DecelerateInterpolator();
        this.f192682g = false;
    }

    /* renamed from: C */
    public abstract void mo94970C(RecyclerView.C16631z zVar);

    /* renamed from: D */
    public abstract void mo94971D(RecyclerView.C16631z zVar);

    /* renamed from: E */
    public final void mo94972E(List<? extends RecyclerView.C16631z> list) {
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((RecyclerView.C16631z) list.get(size)).f44854d.animate().cancel();
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo94973F() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: G */
    public final void mo94974G(List<C69000b> list, RecyclerView.C16631z zVar) {
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C69000b bVar = list.get(size);
                if (mo94975H(bVar, zVar) && bVar.f198277a == null && bVar.f198278b == null) {
                    list.remove(bVar);
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
    public final boolean mo94975H(C69000b bVar, RecyclerView.C16631z zVar) {
        if (bVar.f198278b == zVar) {
            bVar.f198278b = null;
        } else if (bVar.f198277a != zVar) {
            return false;
        } else {
            bVar.f198277a = null;
        }
        C87412m.m108591d(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: I */
    public abstract void mo94976I(RecyclerView.C16631z zVar);

    /* renamed from: j */
    public void mo17321j(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "item");
        View view = zVar.f44854d;
        C87412m.m108593f(view, "item.itemView");
        view.animate().cancel();
        int size = this.f198268j.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C69003e eVar = this.f198268j.get(size);
                C87412m.m108593f(eVar, "pendingMoves[i]");
                if (eVar.f198287a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    this.f198268j.remove(size);
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        mo94974G(this.f198269k, zVar);
        if (this.f198266h.remove(zVar)) {
            View view2 = zVar.f44854d;
            C87412m.m108593f(view2, "item.itemView");
            C56823f.m65514a(view2);
            mo91176x(zVar);
        }
        if (this.f198267i.remove(zVar)) {
            View view3 = zVar.f44854d;
            C87412m.m108593f(view3, "item.itemView");
            C56823f.m65514a(view3);
            mo17319h(zVar);
        }
        int size2 = this.f198272n.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<C69000b> arrayList = this.f198272n.get(size2);
                C87412m.m108593f(arrayList, "changesList[i]");
                ArrayList arrayList2 = arrayList;
                mo94974G(arrayList2, zVar);
                if (arrayList2.isEmpty()) {
                    this.f198272n.remove(size2);
                }
                if (i2 < 0) {
                    break;
                }
                size2 = i2;
            }
        }
        int size3 = this.f198271m.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList<C69003e> arrayList3 = this.f198271m.get(size3);
                C87412m.m108593f(arrayList3, "movesList[i]");
                ArrayList arrayList4 = arrayList3;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj = arrayList4.get(size4);
                        C87412m.m108593f(obj, "moves[j]");
                        if (((C69003e) obj).f198287a == zVar) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            mo91175w(zVar);
                            arrayList4.remove(size4);
                            if (arrayList4.isEmpty()) {
                                this.f198271m.remove(size3);
                            }
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
        int size5 = this.f198270l.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList<RecyclerView.C16631z> arrayList5 = this.f198270l.get(size5);
                C87412m.m108593f(arrayList5, "additionsList[i]");
                ArrayList arrayList6 = arrayList5;
                if (arrayList6.remove(zVar)) {
                    View view4 = zVar.f44854d;
                    C87412m.m108593f(view4, "item.itemView");
                    C56823f.m65514a(view4);
                    mo17319h(zVar);
                    if (arrayList6.isEmpty()) {
                        this.f198270l.remove(size5);
                    }
                }
                if (i5 < 0) {
                    break;
                }
                size5 = i5;
            }
        }
        this.f198275q.remove(zVar);
        this.f198273o.remove(zVar);
        this.f198276r.remove(zVar);
        this.f198274p.remove(zVar);
        mo94973F();
    }

    /* renamed from: k */
    public void mo17322k() {
        int i = -1;
        for (int size = this.f198268j.size() - 1; -1 < size; size--) {
            C69003e eVar = this.f198268j.get(size);
            C87412m.m108593f(eVar, "pendingMoves[i]");
            C69003e eVar2 = eVar;
            View view = eVar2.f198287a.f44854d;
            C87412m.m108593f(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(eVar2.f198287a);
            this.f198268j.remove(size);
        }
        for (int size2 = this.f198266h.size() - 1; -1 < size2; size2--) {
            RecyclerView.C16631z zVar = this.f198266h.get(size2);
            C87412m.m108593f(zVar, "pendingRemovals[i]");
            mo91176x(zVar);
            this.f198266h.remove(size2);
        }
        for (int size3 = this.f198267i.size() - 1; -1 < size3; size3--) {
            RecyclerView.C16631z zVar2 = this.f198267i.get(size3);
            C87412m.m108593f(zVar2, "pendingAdditions[i]");
            RecyclerView.C16631z zVar3 = zVar2;
            View view2 = zVar3.f44854d;
            C87412m.m108593f(view2, "item.itemView");
            C56823f.m65514a(view2);
            mo17319h(zVar3);
            this.f198267i.remove(size3);
        }
        for (int size4 = this.f198269k.size() - 1; -1 < size4; size4--) {
            C69000b bVar = this.f198269k.get(size4);
            C87412m.m108593f(bVar, "pendingChanges[i]");
            C69000b bVar2 = bVar;
            RecyclerView.C16631z zVar4 = bVar2.f198277a;
            if (zVar4 != null) {
                mo94975H(bVar2, zVar4);
            }
            RecyclerView.C16631z zVar5 = bVar2.f198278b;
            if (zVar5 != null) {
                mo94975H(bVar2, zVar5);
            }
        }
        this.f198269k.clear();
        if (mo17325n()) {
            for (int size5 = this.f198271m.size() - 1; -1 < size5; size5--) {
                ArrayList<C69003e> arrayList = this.f198271m.get(size5);
                C87412m.m108593f(arrayList, "movesList[i]");
                ArrayList arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; -1 < size6; size6--) {
                    Object obj = arrayList2.get(size6);
                    C87412m.m108593f(obj, "moves[j]");
                    C69003e eVar3 = (C69003e) obj;
                    View view3 = eVar3.f198287a.f44854d;
                    C87412m.m108593f(view3, "item.itemView");
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    mo91175w(eVar3.f198287a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f198271m.remove(arrayList2);
                    }
                }
            }
            int size7 = this.f198270l.size() - 1;
            while (i < size7) {
                ArrayList<RecyclerView.C16631z> arrayList3 = this.f198270l.get(size7);
                C87412m.m108593f(arrayList3, "additionsList[i]");
                ArrayList arrayList4 = arrayList3;
                int size8 = arrayList4.size() + i;
                while (i < size8) {
                    Object obj2 = arrayList4.get(size8);
                    C87412m.m108593f(obj2, "additions[j]");
                    RecyclerView.C16631z zVar6 = (RecyclerView.C16631z) obj2;
                    View view4 = zVar6.f44854d;
                    C87412m.m108593f(view4, "item.itemView");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar6);
                    if (size8 < arrayList4.size()) {
                        arrayList4.remove(size8);
                    }
                    if (arrayList4.isEmpty()) {
                        this.f198270l.remove(arrayList4);
                    }
                    size8--;
                    i = -1;
                }
                size7--;
                i = -1;
            }
            for (int size9 = this.f198272n.size() - 1; -1 < size9; size9--) {
                ArrayList<C69000b> arrayList5 = this.f198272n.get(size9);
                C87412m.m108593f(arrayList5, "changesList[i]");
                ArrayList arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; -1 < size10; size10--) {
                    Object obj3 = arrayList6.get(size10);
                    C87412m.m108593f(obj3, "changes[j]");
                    C69000b bVar3 = (C69000b) obj3;
                    RecyclerView.C16631z zVar7 = bVar3.f198277a;
                    if (zVar7 != null) {
                        mo94975H(bVar3, zVar7);
                    }
                    RecyclerView.C16631z zVar8 = bVar3.f198278b;
                    if (zVar8 != null) {
                        mo94975H(bVar3, zVar8);
                    }
                    if (arrayList6.isEmpty()) {
                        this.f198272n.remove(arrayList6);
                    }
                }
            }
            mo94972E(this.f198275q);
            mo94972E(this.f198274p);
            mo94972E(this.f198273o);
            mo94972E(this.f198276r);
            mo17320i();
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return (this.f198267i.isEmpty() ^ true) || (this.f198269k.isEmpty() ^ true) || (this.f198268j.isEmpty() ^ true) || (this.f198266h.isEmpty() ^ true) || (this.f198274p.isEmpty() ^ true) || (this.f198275q.isEmpty() ^ true) || (this.f198273o.isEmpty() ^ true) || (this.f198276r.isEmpty() ^ true) || (this.f198271m.isEmpty() ^ true) || (this.f198270l.isEmpty() ^ true) || (this.f198272n.isEmpty() ^ true);
    }

    /* renamed from: r */
    public void mo17329r() {
        boolean z = !this.f198266h.isEmpty();
        boolean z2 = !this.f198268j.isEmpty();
        boolean z3 = !this.f198269k.isEmpty();
        boolean z4 = !this.f198267i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f198266h.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z next = it.next();
                C87412m.m108593f(next, "holder");
                if (next instanceof C68997a) {
                    ((C68997a) next).mo94969d(next, new C69002d(this, next));
                } else {
                    mo94971D(next);
                }
                this.f198275q.add(next);
            }
            this.f198266h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList(this.f198268j);
                this.f198271m.add(arrayList);
                this.f198268j.clear();
                C69006h hVar = new C69006h(this, arrayList);
                if (z) {
                    View view = ((C69003e) arrayList.get(0)).f198287a.f44854d;
                    C87412m.m108593f(view, "moves[0].holder.itemView");
                    view.postOnAnimationDelayed(hVar, this.f44808d);
                } else {
                    hVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList(this.f198269k);
                this.f198272n.add(arrayList2);
                this.f198269k.clear();
                C69005g gVar = new C69005g(this, arrayList2);
                if (z) {
                    RecyclerView.C16631z zVar = ((C69000b) arrayList2.get(0)).f198277a;
                    C87412m.m108591d(zVar);
                    zVar.f44854d.postOnAnimationDelayed(gVar, this.f44808d);
                } else {
                    gVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList(this.f198267i);
                this.f198270l.add(arrayList3);
                this.f198267i.clear();
                C69004f fVar = new C69004f(this, arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long j2 = z ? this.f44808d : 0;
                    long j3 = z2 ? this.f44809e : 0;
                    if (z3) {
                        j = this.f44810f;
                    }
                    if (j3 < j) {
                        j3 = j;
                    }
                    long j4 = j2 + j3;
                    View view2 = ((RecyclerView.C16631z) arrayList3.get(0)).f44854d;
                    C87412m.m108593f(view2, "additions[0].itemView");
                    view2.postOnAnimationDelayed(fVar, j4);
                    return;
                }
                fVar.run();
            }
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo17321j(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C56823f.m65514a(view);
        if (zVar instanceof C68997a) {
            ((C68997a) zVar).mo94966a(zVar);
        } else {
            mo94976I(zVar);
        }
        this.f198267i.add(zVar);
        return true;
    }

    /* renamed from: t */
    public boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
        RecyclerView.C16631z zVar3 = zVar;
        RecyclerView.C16631z zVar4 = zVar2;
        C87412m.m108594g(zVar3, "oldHolder");
        C87412m.m108594g(zVar4, "newHolder");
        if (zVar3 == zVar4) {
            return mo75019u(zVar, i, i2, i3, i4);
        }
        float translationX = zVar3.f44854d.getTranslationX();
        float translationY = zVar3.f44854d.getTranslationY();
        float alpha = zVar3.f44854d.getAlpha();
        mo17321j(zVar);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mo17321j(zVar4);
        zVar4.f44854d.setTranslationX(-((float) ((int) (((float) (i3 - i)) - translationX))));
        zVar4.f44854d.setTranslationY(-((float) ((int) (((float) (i4 - i2)) - translationY))));
        View view3 = zVar4.f44854d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f198269k.add(new C69000b(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        C87412m.m108594g(zVar, "holder");
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int translationX = i + ((int) zVar.f44854d.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo17321j(zVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo91175w(zVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-((float) i5));
        }
        if (i6 != 0) {
            view.setTranslationY(-((float) i6));
        }
        this.f198268j.add(new C69003e(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo17321j(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C56823f.m65514a(view);
        if (zVar instanceof C68997a) {
            ((C68997a) zVar).mo94967b(zVar);
        }
        this.f198266h.add(zVar);
        return true;
    }
}
