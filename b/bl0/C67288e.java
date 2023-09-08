package bl0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bl0.e */
public class C67288e extends C87981f {
    public static final int CTRL_INDEX = 510;
    public static final String NAME = "updatePositioningContainer";

    /* renamed from: bl0.e$a */
    public class C67289a implements Interpolator {

        /* renamed from: a */
        public PointF f193120a;

        /* renamed from: b */
        public PointF f193121b;

        /* renamed from: c */
        public PointF f193122c = new PointF();

        /* renamed from: d */
        public PointF f193123d = new PointF();

        /* renamed from: e */
        public PointF f193124e = new PointF();

        public C67289a(C67288e eVar, float f, float f2, float f3, float f4) {
            PointF pointF = new PointF(f, f2);
            PointF pointF2 = new PointF(f3, f4);
            new PointF();
            new PointF();
            float f5 = pointF.x;
            if (f5 < 0.0f || f5 > 1.0f) {
                throw new IllegalArgumentException("startX value must be in the range [0, 1]");
            }
            float f6 = pointF2.x;
            if (f6 < 0.0f || f6 > 1.0f) {
                throw new IllegalArgumentException("endX value must be in the range [0, 1]");
            }
            this.f193120a = pointF;
            this.f193121b = pointF2;
        }

        public float getInterpolation(float f) {
            float f2 = f;
            for (int i = 1; i < 14; i++) {
                PointF pointF = this.f193124e;
                PointF pointF2 = this.f193120a;
                float f3 = pointF2.x * 3.0f;
                pointF.x = f3;
                PointF pointF3 = this.f193123d;
                float f4 = ((this.f193121b.x - pointF2.x) * 3.0f) - f3;
                pointF3.x = f4;
                PointF pointF4 = this.f193122c;
                float f5 = (1.0f - pointF.x) - f4;
                pointF4.x = f5;
                float f6 = ((pointF.x + ((pointF3.x + (f5 * f2)) * f2)) * f2) - f;
                if (((double) Math.abs(f6)) < 0.001d) {
                    break;
                }
                f2 -= f6 / (this.f193124e.x + (((this.f193123d.x * 2.0f) + ((this.f193122c.x * 3.0f) * f2)) * f2));
            }
            PointF pointF5 = this.f193124e;
            PointF pointF6 = this.f193120a;
            float f7 = pointF6.y * 3.0f;
            pointF5.y = f7;
            PointF pointF7 = this.f193123d;
            float f8 = ((this.f193121b.y - pointF6.y) * 3.0f) - f7;
            pointF7.y = f8;
            PointF pointF8 = this.f193122c;
            float f9 = (1.0f - pointF5.y) - f8;
            pointF8.y = f9;
            return f2 * (pointF5.y + ((pointF7.y + (f9 * f2)) * f2));
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        if (!(view2 instanceof WrapperNativeContainerView)) {
            return false;
        }
        int k = C88020k.m109560k(jSONObject2, "contentOffsetLeft", 0);
        int k2 = C88020k.m109560k(jSONObject2, "contentOffsetTop", 0);
        int optInt = jSONObject2.optInt("animate", 0);
        WrapperNativeContainerView wrapperNativeContainerView = (WrapperNativeContainerView) view2;
        try {
            wrapperNativeContainerView.setVisibility(jSONObject2.getBoolean("visible") ? 0 : 4);
        } catch (JSONException unused) {
        }
        AppBrandNativeContainerView appBrandNativeContainerView = (AppBrandNativeContainerView) wrapperNativeContainerView.mo114736d(AppBrandNativeContainerView.class);
        Log.m105925i("MicroMsg.JsApiUpdatePositioningContainer", "scrollLeft:%d, scrollTop:%d, animation:%d", Integer.valueOf(k), Integer.valueOf(k2), Integer.valueOf(optInt));
        if (optInt == 1) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appBrandNativeContainerView, "x", new float[]{appBrandNativeContainerView.getX(), (float) (-k)});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appBrandNativeContainerView, "y", new float[]{appBrandNativeContainerView.getY(), (float) (-k2)});
            ofFloat.addUpdateListener(new C67286c(this, appBrandNativeContainerView));
            ofFloat2.addUpdateListener(new C67287d(this, appBrandNativeContainerView));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(1000);
            C67289a aVar = r0;
            C67289a aVar2 = new C67289a(this, 0.0f, 0.0f, 0.58f, 1.0f);
            animatorSet.setInterpolator(aVar);
            animatorSet.setTarget(appBrandNativeContainerView);
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
        } else {
            appBrandNativeContainerView.setX((float) (-k));
            appBrandNativeContainerView.setY((float) (-k2));
        }
        int k3 = C88020k.m109560k(jSONObject2, "innerHeight", appBrandNativeContainerView.getHeight());
        int k4 = C88020k.m109560k(jSONObject2, "innerWidth", appBrandNativeContainerView.getWidth());
        Log.m105925i("MicroMsg.JsApiUpdatePositioningContainer", "innerHeight:%d, innerWidth:%d", Integer.valueOf(k3), Integer.valueOf(k4));
        ViewGroup.LayoutParams layoutParams = appBrandNativeContainerView.getLayoutParams();
        layoutParams.height = k3;
        layoutParams.width = k4;
        appBrandNativeContainerView.setLayoutParams(layoutParams);
        return true;
    }
}
