package si1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import dl1.C58321a;
import er1.C7865r3;
import gi1.C59463a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nh1.C61739i;
import ni1.C61751a;
import ni1.C61753b;
import ok1.C62042e;
import p192l4.C10462b;

/* renamed from: si1.i */
public final class C63907i extends C61751a implements View.OnClickListener {

    /* renamed from: h */
    public final C61753b f181142h;

    /* renamed from: i */
    public int f181143i;

    /* renamed from: j */
    public final C61739i f181144j;

    /* renamed from: n */
    public int f181145n;

    /* renamed from: o */
    public boolean f181146o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C63907i(Context context, C61753b bVar, int i, C8480h hVar) {
        this(context, (i & 2) != 0 ? null : bVar);
    }

    private final float getEndViewSize() {
        float f;
        float f2;
        if (getCurWidgetMode() == C58321a.GRAB_9_MODE) {
            f2 = (float) C7865r3.f26468a.mo8970c();
            f = 3.0f;
        } else {
            f2 = (float) C7865r3.f26468a.mo8970c();
            f = 4.0f;
        }
        return f2 / f;
    }

    /* renamed from: c */
    public void mo86637c(C58321a aVar, C59463a aVar2) {
        C87412m.m108594g(aVar, "widgetMode");
        C87412m.m108594g(aVar2, "data");
        super.mo86637c(aVar, aVar2);
        this.f181143i = aVar2.f169895b.f169901e;
        this.f181144j.f175459c.setText(getContext().getResources().getString(C0966R.string.f8123m6));
    }

    public final C61753b getService() {
        return this.f181142h;
    }

    /* renamed from: h */
    public final void mo88692h(int i, float f) {
        this.f181144j.f175459c.setTextSize(1, f);
        ViewGroup.LayoutParams layoutParams = this.f181144j.f175458b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i;
        }
    }

    public void onClick(View view) {
        C61753b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = this.f181144j.f175457a.getId();
        if (!(valueOf == null || valueOf.intValue() != id || (bVar = this.f181142h) == null)) {
            bVar.mo85281q(this.f181143i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.f181146o && this.f181145n != i5) {
            setScale(((float) i5) / getEndViewSize());
            this.f181145n = i5;
        }
    }

    public final void setNeedAutoAdjust(boolean z) {
        this.f181146o = z;
    }

    public final void setScale(float f) {
        if (f < 0.2f) {
            f = 0.3f;
        }
        mo88692h((int) (((float) C76577a.m92151b(getContext(), 24)) * f), ((float) 14) * f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63907i(Context context, C61753b bVar) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f181142h = bVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7177le, this, false);
        int i = C0966R.C0970id.f1e;
        WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.f1e);
        if (weImageView != null) {
            i = C0966R.C0970id.khj;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.khj);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f181144j = new C61739i(constraintLayout, weImageView, textView);
                C7865r3.f26468a.mo8970c();
                addView(constraintLayout);
                if (!C62042e.f176370a.mo87027N0() && bVar != null) {
                    constraintLayout.setOnClickListener(this);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
