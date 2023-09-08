package vt0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import vt0.C22784g;

/* renamed from: vt0.a */
public final class C22778a extends C22784g {

    /* renamed from: x */
    public static final /* synthetic */ int f65505x = 0;

    /* renamed from: vt0.a$a */
    public class C22779a implements View.OnClickListener {
        public C22779a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/picker/AppBrandBottomPicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C22778a.this.mo35924d(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandBottomPicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C22778a(Context context) {
        super(context);
        super.setId(C0966R.C0970id.f5965tj);
        setBackgroundResource(C0966R.color.ahf);
        setOnClickListener(new C22779a());
    }

    /* renamed from: h */
    public void mo35910h() {
        mo35924d(true);
    }

    /* renamed from: i */
    public void mo35911i() {
        if (this.f65522r) {
            clearAnimation();
            this.f65522r = false;
        }
        if (!this.f65521q) {
            if (this.f65511d == null) {
                setVisibility(8);
                return;
            }
            Runnable runnable = this.f65524t;
            if (runnable != null) {
                ((C22784g.C22786b) runnable).run();
                this.f65524t = null;
            }
            this.f65511d.onShow(this);
            clearAnimation();
            setVisibility(0);
            this.f65521q = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2345a_);
            this.f65519o.startAnimation(loadAnimation);
            startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2343a8));
            loadAnimation.setAnimationListener(new C22783f(this));
        }
    }

    public void onMeasure(int i, int i2) {
        if (!isShown()) {
            super.onMeasure(i, i2);
            return;
        }
        int measuredHeight = (getParent() == null || !(getParent() instanceof ViewGroup)) ? 0 : ((ViewGroup) getParent()).getMeasuredHeight();
        if (measuredHeight > 0) {
            mo35927g(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setHeader(String str) {
        super.setHeader(str);
    }

    public void setId(int i) {
    }
}
