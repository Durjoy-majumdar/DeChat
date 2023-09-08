package ng1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ng1.b */
public final class C47254b {

    /* renamed from: a */
    public TabLayout.C55061f f126857a;

    /* renamed from: b */
    public int f126858b;

    /* renamed from: c */
    public TextView f126859c;

    /* renamed from: d */
    public ImageView f126860d;

    /* renamed from: ng1.b$a */
    public static final class C47255a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f126861d;

        public C47255a(C32224a<C13598b0> aVar) {
            this.f126861d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/box/viewpager/LiveCommentTab$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f126861d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/box/viewpager/LiveCommentTab$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ng1.b$b */
    public static final class C47256b implements View.OnTouchListener {

        /* renamed from: d */
        public static final C47256b f126862d = new C47256b();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/box/viewpager/LiveCommentTab$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/box/viewpager/LiveCommentTab$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public C47254b(TabLayout.C55061f fVar, int i, C32224a<C13598b0> aVar) {
        View view;
        C87412m.m108594g(fVar, "tab");
        this.f126857a = fVar;
        fVar.f154600a = this;
        fVar.mo76122c(C0966R.C0971layout.cot);
        View view2 = this.f126857a.f154605f;
        TabLayout.C104475h hVar = null;
        this.f126859c = view2 != null ? (TextView) view2.findViewById(C0966R.C0970id.kcp) : null;
        View view3 = this.f126857a.f154605f;
        this.f126860d = view3 != null ? (ImageView) view3.findViewById(C0966R.C0970id.kcm) : null;
        if (!(aVar == null || (view = this.f126857a.f154605f) == null)) {
            view.setOnClickListener(new C47255a(aVar));
        }
        TabLayout.C104475h hVar2 = this.f126857a.f154607h;
        hVar = hVar2 instanceof View ? hVar2 : hVar;
        if (hVar != null) {
            hVar.setOnTouchListener(C47256b.f126862d);
        }
        mo72281b(C0966R.color.BW_100_Alpha_0_5);
        mo72280a(false);
    }

    /* renamed from: a */
    public final void mo72280a(boolean z) {
        TextView textView = this.f126859c;
        if (textView == null) {
            return;
        }
        if (z) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            return;
        }
        textView.getPaint().setFakeBoldText(false);
        textView.getPaint().setStrokeWidth(0.0f);
    }

    /* renamed from: b */
    public final void mo72281b(int i) {
        TextView textView = this.f126859c;
        if (textView != null) {
            View view = this.f126857a.f154605f;
            C87412m.m108591d(view);
            textView.setTextColor(view.getContext().getResources().getColor(i));
        }
    }
}
