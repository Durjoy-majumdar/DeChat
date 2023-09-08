package il1;

import a14.C0000n0;
import a14.C0001s1;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qj1.C62660c;

/* renamed from: il1.u0 */
public class C9120u0 extends FrameLayout {

    /* renamed from: d */
    public final float f28736d = ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: e */
    public final float f28737e = ((float) C75044y4.m89990b(MMApplicationContext.getContext()).x);

    /* renamed from: f */
    public C62660c f28738f;

    /* renamed from: g */
    public C0000n0 f28739g = C0001s1.f0d;

    /* renamed from: il1.u0$a */
    public static final class C9121a implements View.OnClickListener {

        /* renamed from: d */
        public static final C9121a f28740d = new C9121a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveBaseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveBaseWidget", "click:" + view.getId());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBaseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9120u0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setOnClickListener(C9121a.f28740d);
    }

    /* renamed from: a */
    public void mo9935a(C62660c cVar) {
        C87412m.m108594g(cVar, "basePlugin");
        this.f28738f = cVar;
        this.f28739g = cVar.mo14484z0().getViewScope();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C62660c getBasePlugin() {
        return this.f28738f;
    }

    public final float getHEIGHT() {
        return this.f28736d;
    }

    public final C0000n0 getScope() {
        return this.f28739g;
    }

    public final float getWIDTH() {
        return this.f28737e;
    }

    public final void setBasePlugin(C62660c cVar) {
        this.f28738f = cVar;
    }

    public final void setScope(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "<set-?>");
        this.f28739g = n0Var;
    }

    public final void setTextBold(TextView textView) {
        C87412m.m108594g(textView, "tv");
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
    }
}
