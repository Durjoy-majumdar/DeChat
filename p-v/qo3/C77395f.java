package qo3;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77398g;

/* renamed from: qo3.f */
public class C77395f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g.C77402i.C63297c f225672d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f225673e;

    /* renamed from: f */
    public final /* synthetic */ C77398g f225674f;

    /* renamed from: qo3.f$a */
    public class C77396a implements Animation.AnimationListener {
        public C77396a() {
        }

        public void onAnimationEnd(Animation animation) {
            C77395f.this.f225674f.f225679C.setVisibility(8);
            C77395f.this.f225674f.m93308o(0);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C77398g gVar = C77395f.this.f225674f;
            C77398g.m93304a(gVar, gVar.f225683G);
        }
    }

    /* renamed from: qo3.f$b */
    public class C77397b implements Animation.AnimationListener {
        public C77397b() {
        }

        public void onAnimationEnd(Animation animation) {
            C77395f.this.f225674f.f225679C.setVisibility(0);
            C77395f.this.f225674f.m93308o(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C77398g gVar = C77395f.this.f225674f;
            C77398g.m93304a(gVar, gVar.f225685I);
        }
    }

    public C77395f(C77398g gVar, C77398g.C77402i.C63297c cVar, ImageView imageView) {
        this.f225674f = gVar;
        this.f225672d = cVar;
        this.f225673e = imageView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77398g.C77402i.C63297c cVar = this.f225672d;
        if (cVar != null) {
            cVar.mo88205a(true);
        }
        if (this.f225673e.isSelected()) {
            C77398g gVar = this.f225674f;
            gVar.f225679C.startAnimation(gVar.f225686J);
            this.f225674f.f225686J.setAnimationListener(new C77396a());
            ObjectAnimator.ofFloat(this.f225673e, "rotation", new float[]{180.0f, 0.0f}).setDuration(200).start();
            this.f225673e.setSelected(false);
        } else {
            C77398g gVar2 = this.f225674f;
            gVar2.f225679C.startAnimation(gVar2.f225684H);
            this.f225674f.f225684H.setAnimationListener(new C77397b());
            ObjectAnimator.ofFloat(this.f225673e, "rotation", new float[]{0.0f, 180.0f}).setDuration(200).start();
            this.f225673e.setSelected(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
