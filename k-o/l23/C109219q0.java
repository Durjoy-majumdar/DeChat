package l23;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.p117ui.LabelSlider;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C64197v;

/* renamed from: l23.q0 */
public final class C109219q0 extends C99417a {

    /* renamed from: f */
    public final EditorPanelHolder f327007f;

    /* renamed from: g */
    public final String f327008g = "MicroMsg.TrackDurationScalePlugin";

    /* renamed from: h */
    public final C13601g f327009h = C36568h.m40985a(new C109224e(this));

    /* renamed from: i */
    public final C13601g f327010i = C36568h.m40985a(new C109229j(this));

    /* renamed from: j */
    public final C13601g f327011j = C36568h.m40985a(new C109221b(this));

    /* renamed from: n */
    public final C13601g f327012n = C36568h.m40985a(new C109222c(this));

    /* renamed from: o */
    public final List<Float> f327013o = C64197v.m75537f(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f));

    /* renamed from: p */
    public final String[] f327014p;

    /* renamed from: q */
    public float f327015q;

    /* renamed from: r */
    public boolean f327016r;

    /* renamed from: s */
    public int f327017s;

    /* renamed from: t */
    public C32226l<? super Float, C13598b0> f327018t;

    /* renamed from: u */
    public C32226l<? super Float, C13598b0> f327019u;

    /* renamed from: l23.q0$a */
    public static final class C109220a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109220a(C109219q0 q0Var) {
            super(1);
            this.f327020d = q0Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C109219q0 q0Var = this.f327020d;
                if (!q0Var.f327016r) {
                    C32226l<? super Float, C13598b0> lVar = q0Var.f327018t;
                    if (lVar != null) {
                        ((C109223d) lVar).invoke(Float.valueOf(q0Var.f327015q));
                    }
                } else {
                    C32226l<? super Float, C13598b0> lVar2 = q0Var.f327018t;
                    if (lVar2 != null) {
                        ((C109223d) lVar2).invoke(q0Var.f327013o.get(q0Var.f327017s));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.q0$b */
    public static final class C109221b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109221b(C109219q0 q0Var) {
            super(0);
            this.f327021d = q0Var;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f327021d.f327009h).getValue()).findViewById(C0966R.C0970id.kt9);
        }
    }

    /* renamed from: l23.q0$c */
    public static final class C109222c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109222c(C109219q0 q0Var) {
            super(0);
            this.f327022d = q0Var;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f327022d.f327009h).getValue()).findViewById(C0966R.C0970id.ktb);
        }
    }

    /* renamed from: l23.q0$d */
    public static final class C109223d extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f327023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109223d(C101198e eVar) {
            super(1);
            this.f327023d = eVar;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            Bundle bundle = new Bundle();
            bundle.putFloat("EDIT_TRACK_DURATION_SCALE", floatValue);
            this.f327023d.mo14585p(C101198e.C101199b.EDIT_TRACK_DURATION_SCALE_FINISH, bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.q0$e */
    public static final class C109224e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109224e(C109219q0 q0Var) {
            super(0);
            this.f327024d = q0Var;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f327024d.f327007f.getContext()).inflate(C0966R.C0971layout.b5b, this.f327024d.f327007f, false);
            EditorPanelHolder editorPanelHolder = this.f327024d.f327007f;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return inflate;
        }
    }

    /* renamed from: l23.q0$f */
    public static final class C109225f extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f327025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109225f(C101198e eVar) {
            super(1);
            this.f327025d = eVar;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            Bundle bundle = new Bundle();
            bundle.putFloat("EDIT_TRACK_DURATION_SCALE", floatValue);
            this.f327025d.mo14585p(C101198e.C101199b.EDIT_TRACK_DURATION_SCALE, bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.q0$g */
    public static final class C109226g implements LabelSlider.C71571b {

        /* renamed from: a */
        public final /* synthetic */ C109219q0 f327026a;

        public C109226g(C109219q0 q0Var) {
            this.f327026a = q0Var;
        }

        /* renamed from: a */
        public void mo98710a(int i) {
            String str = this.f327026a.f327008g;
            Log.m105924i(str, "onSelected: " + i);
            C109219q0 q0Var = this.f327026a;
            q0Var.f327017s = i;
            C32226l<? super Float, C13598b0> lVar = q0Var.f327019u;
            if (lVar != null) {
                ((C109225f) lVar).invoke(q0Var.f327013o.get(i));
            }
        }
    }

    /* renamed from: l23.q0$h */
    public static final class C109227h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327027d;

        public C109227h(C109219q0 q0Var) {
            this.f327027d = q0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/TrackDurationScalePlugin$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109219q0 q0Var = this.f327027d;
            q0Var.f327016r = false;
            q0Var.f327007f.setShow(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/TrackDurationScalePlugin$setup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.q0$i */
    public static final class C109228i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327028d;

        public C109228i(C109219q0 q0Var) {
            this.f327028d = q0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/TrackDurationScalePlugin$setup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109219q0 q0Var = this.f327028d;
            q0Var.f327016r = true;
            q0Var.f327007f.setShow(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/TrackDurationScalePlugin$setup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.q0$j */
    public static final class C109229j extends C87413o implements C32224a<LabelSlider> {

        /* renamed from: d */
        public final /* synthetic */ C109219q0 f327029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109229j(C109219q0 q0Var) {
            super(0);
            this.f327029d = q0Var;
        }

        public Object invoke() {
            return (LabelSlider) ((View) ((C36570n) this.f327029d.f327009h).getValue()).findViewById(C0966R.C0970id.kta);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109219q0(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f327007f = editorPanelHolder;
        String[] stringArray = editorPanelHolder.getContext().getResources().getStringArray(C0966R.array.f2605as);
        C87412m.m108593f(stringArray, "holder.context.resources…dit_duration_scale_array)");
        this.f327014p = stringArray;
        this.f327015q = 1.0f;
        this.f327018t = new C109223d(eVar);
        this.f327019u = new C109225f(eVar);
        editorPanelHolder.setOnVisibleChangeCallback(new C109220a(this));
        editorPanelHolder.setCloseTouchOutside(false);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f327007f.mo151464b()) {
            return false;
        }
        this.f327007f.setShow(false);
        return true;
    }

    /* renamed from: x */
    public final EditorPanelHolder mo160470x() {
        return this.f327007f;
    }

    /* renamed from: y */
    public final void mo160471y(float f) {
        this.f327015q = f;
        int indexOf = this.f327013o.indexOf(Float.valueOf(f));
        if (indexOf < 0) {
            indexOf = this.f327013o.size() / 2;
        }
        this.f327017s = indexOf;
        ((LabelSlider) ((C36570n) this.f327010i).getValue()).setLabelCount(this.f327013o.size());
        ((LabelSlider) ((C36570n) this.f327010i).getValue()).setSelection(indexOf);
        ((LabelSlider) ((C36570n) this.f327010i).getValue()).setLabels(C110823p.m151001a0(this.f327014p));
        ((LabelSlider) ((C36570n) this.f327010i).getValue()).setCallback(new C109226g(this));
        ((View) ((C36570n) this.f327011j).getValue()).setOnClickListener(new C109227h(this));
        ((View) ((C36570n) this.f327012n).getValue()).setOnClickListener(new C109228i(this));
        this.f327016r = false;
        this.f327007f.setShow(true);
    }
}
