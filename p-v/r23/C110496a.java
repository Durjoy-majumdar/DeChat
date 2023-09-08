package r23;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d23.C106976a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import lh2.C99417a;
import qh2.C101198e;
import r23.C77461b;
import rr3.C110625c0;
import rr3.C110632i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

/* renamed from: r23.a */
public final class C110496a extends C99417a implements C77461b.C77468g {

    /* renamed from: f */
    public ViewGroup f330402f;

    /* renamed from: g */
    public final Context f330403g;

    /* renamed from: h */
    public final EditorPanelHolder f330404h = ((EditorPanelHolder) this.f330402f.findViewById(C0966R.C0970id.f357905cd3));

    /* renamed from: i */
    public final C13601g f330405i;

    /* renamed from: j */
    public int f330406j;

    /* renamed from: n */
    public long f330407n;

    /* renamed from: r23.a$a */
    public static final class C110497a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110496a f330408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110497a(C110496a aVar) {
            super(1);
            this.f330408d = aVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f330408d.f291492d, C101198e.C101199b.EDIT_REFRESH_TRANSITION_MARK_STATUS, (Bundle) null, 2, (Object) null);
                C101198e.C62622a.m73576a(this.f330408d.f291492d, C101198e.C101199b.EDIT_UNSELECT_TRANSITION, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f330408d.f291492d, C101198e.C101199b.EDIT_SHOW_TRANSITION_PANEL, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r23.a$b */
    public static final class C110498b extends C87413o implements C32224a<C77461b> {

        /* renamed from: d */
        public final /* synthetic */ C110496a f330409d;

        /* renamed from: e */
        public final /* synthetic */ boolean f330410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110498b(C110496a aVar, boolean z) {
            super(0);
            this.f330409d = aVar;
            this.f330410e = z;
        }

        public Object invoke() {
            Context context = this.f330409d.f330403g;
            C87412m.m108593f(context, "context");
            return new C77461b(context, this.f330410e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110496a(ViewGroup viewGroup, C101198e eVar, boolean z) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f330402f = viewGroup;
        this.f330403g = viewGroup.getContext();
        this.f330405i = C36568h.m40985a(new C110498b(this, z));
        this.f330406j = -1;
    }

    /* renamed from: A */
    public final void mo161961A() {
        EditorPanelHolder editorPanelHolder = this.f330404h;
        if (!(editorPanelHolder.f315616h != null)) {
            C87412m.m108593f(editorPanelHolder, "holder");
            EditorPanelHolder.m142603c(editorPanelHolder, mo161967z(), (ViewGroup.LayoutParams) null, 2, (Object) null);
            this.f330404h.setOnVisibleChangeCallback(new C110497a(this));
            mo161967z().setEditTransitionListener(this);
            mo161967z().mo107636c();
        }
    }

    /* renamed from: B */
    public final void mo161962B(int i) {
        this.f330406j = i;
    }

    /* renamed from: C */
    public final void mo161963C(long j) {
        this.f330407n = j;
    }

    /* renamed from: D */
    public final void mo161964D(int i, String str) {
        mo161961A();
        C77461b z = mo161967z();
        z.getClass();
        int i2 = 0;
        Iterator<T> it = C106976a.f320211d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z.mo107635b(i, -1);
                break;
            }
            T next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C64197v.m75542k();
                throw null;
            } else if (C87412m.m108589b(((C106976a.C75321a) next).f221480c, str)) {
                z.mo107635b(i, i3);
                break;
            } else {
                i2 = i3;
            }
        }
        this.f330404h.setShow(true);
    }

    /* renamed from: a */
    public void mo107643a() {
        this.f330404h.setShow(false);
    }

    /* renamed from: j */
    public void mo107644j(int i, C106976a.C75321a aVar) {
        C101198e eVar = this.f291492d;
        C101198e.C101199b bVar = C101198e.C101199b.EDIT_SET_TRANSITION;
        Bundle bundle = new Bundle();
        bundle.putInt("EDIT_SELECT_TRANSITION_INDEX", i);
        C110625c0 c0Var = null;
        bundle.putString("PARAM_1_STRING", aVar != null ? aVar.f221480c : null);
        bundle.putLong("PARAM_1_INT", aVar != null ? aVar.f221482e : 0);
        if (aVar != null) {
            C106976a aVar2 = C106976a.f320208a;
            if (aVar.f221483f == null) {
                EffectManager effectManager = C106976a.f320215h;
                if (effectManager != null) {
                    c0Var = effectManager.mo154929i(C110632i.PAGTransitionEffect, aVar.f221480c);
                }
                aVar.f221483f = c0Var;
            }
        }
        bundle.putInt("EDIT_TRANSITION_EFFECT_ID", aVar != null ? aVar.f221479b : 0);
        C13598b0 b0Var = C13598b0.f38549a;
        eVar.mo14585p(bVar, bundle);
    }

    public void setVisibility(int i) {
        if (i == 0) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_SHOW_TRANSITION_MARK, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_HIDE_TRANSITION_MARK, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: t */
    public void mo107645t(int i, C106976a.C75321a aVar) {
        C101198e eVar = this.f291492d;
        C101198e.C101199b bVar = C101198e.C101199b.EDIT_APPLY_ALL_TRANSITION;
        Bundle bundle = new Bundle();
        bundle.putInt("EDIT_SELECT_TRANSITION_INDEX", i);
        bundle.putInt("EDIT_TRANSITION_EFFECT_ID", aVar != null ? aVar.f221479b : 0);
        bundle.putString("PARAM_1_STRING", aVar != null ? aVar.f221480c : null);
        bundle.putLong("PARAM_1_INT", aVar != null ? aVar.f221482e : 0);
        C13598b0 b0Var = C13598b0.f38549a;
        eVar.mo14585p(bVar, bundle);
    }

    /* renamed from: x */
    public final int mo161965x() {
        return this.f330406j;
    }

    /* renamed from: y */
    public final long mo161966y() {
        return this.f330407n;
    }

    /* renamed from: z */
    public final C77461b mo161967z() {
        return (C77461b) ((C36570n) this.f330405i).getValue();
    }
}
