package cl0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.ArrayList;
import jk0.C87981f;
import jk0.C87987k;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cl0.f */
public class C80050f extends C87981f {
    public static final int CTRL_INDEX = 342;
    public static final String NAME = "animateCoverView";

    /* renamed from: cl0.f$a */
    public class C80051a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C87987k f234495d;

        public C80051a(C87987k kVar) {
            this.f234495d = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f234495d.mo122438a(C80050f.this.mo115109j("ok"));
        }
    }

    /* renamed from: cl0.f$b */
    public class C80052b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f234497d;

        public C80052b(C80050f fVar, View view) {
            this.f234497d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f234497d.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f234497d.requestLayout();
        }
    }

    /* renamed from: cl0.f$c */
    public class C80053c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f234498d;

        public C80053c(C80050f fVar, View view) {
            this.f234498d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f234498d.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f234498d.requestLayout();
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: D */
    public boolean mo110315D() {
        return true;
    }

    /* renamed from: F */
    public boolean mo110316F(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        C80050f fVar;
        int i2;
        int i3;
        boolean z;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        C87987k kVar2 = kVar;
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("finalStyle");
            float i4 = C88020k.m109558i(jSONObject3, "left", view.getX() / C88020k.m109556g());
            float i5 = C88020k.m109558i(jSONObject3, "top", view.getY() / C88020k.m109556g());
            float optDouble = (float) jSONObject3.optDouble("opacity", (double) view.getAlpha());
            float optDouble2 = (float) jSONObject3.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, (double) view.getRotation());
            float optDouble3 = (float) jSONObject3.optDouble("scaleX", (double) view.getScaleX());
            float optDouble4 = (float) jSONObject3.optDouble("scaleY", (double) view.getScaleY());
            if (jSONObject3.has("width")) {
                try {
                    i3 = C88020k.m109560k(jSONObject3, "width", C88020k.m109554e(view.getWidth()));
                } catch (JSONException e) {
                    e = e;
                    i2 = 1;
                    fVar = this;
                    Object[] objArr = new Object[i2];
                    objArr[0] = Log.getStackTraceString(e);
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", objArr);
                    kVar2.mo122438a(fVar.mo115109j("fail:missing finalStyle"));
                    return false;
                }
            } else {
                i3 = -1;
            }
            try {
                int k = jSONObject3.has("height") ? C88020k.m109560k(jSONObject3, "height", C88020k.m109554e(view.getWidth())) : -1;
                int optInt = jSONObject2.optInt("duration", 300);
                String optString = jSONObject2.optString("easing", "linear");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "x", new float[]{view.getX(), i4});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "y", new float[]{view.getY(), i5});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), optDouble});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "rotation", new float[]{view.getRotation(), optDouble2});
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{view.getScaleX(), optDouble3});
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{view.getScaleY(), optDouble4});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration((long) optInt);
                TimeInterpolator timeInterpolator = null;
                if (optString != null) {
                    if (optString.equals("ease")) {
                        timeInterpolator = new AccelerateDecelerateInterpolator();
                    } else if (optString.equals("ease-in")) {
                        timeInterpolator = new AccelerateInterpolator();
                    } else if (optString.equals("ease-out")) {
                        timeInterpolator = new DecelerateInterpolator();
                    }
                }
                if (timeInterpolator == null) {
                    timeInterpolator = new LinearInterpolator();
                }
                animatorSet.setInterpolator(timeInterpolator);
                animatorSet.addListener(new C80051a(kVar2));
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                arrayList.add(ofFloat2);
                arrayList.add(ofFloat3);
                arrayList.add(ofFloat4);
                arrayList.add(ofFloat5);
                arrayList.add(ofFloat6);
                if (i3 != -1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getWidth(), i3});
                    arrayList.add(ofInt);
                    ofInt.addUpdateListener(new C80052b(this, view2));
                }
                if (k != -1) {
                    z = true;
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{view.getHeight(), k});
                    arrayList.add(ofInt2);
                    ofInt2.addUpdateListener(new C80053c(this, view2));
                } else {
                    z = true;
                }
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                return z;
            } catch (JSONException e2) {
                e = e2;
                fVar = this;
                i2 = 1;
                Object[] objArr2 = new Object[i2];
                objArr2[0] = Log.getStackTraceString(e);
                com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", objArr2);
                kVar2.mo122438a(fVar.mo115109j("fail:missing finalStyle"));
                return false;
            }
        } catch (JSONException e3) {
            e = e3;
            fVar = this;
            i2 = 1;
            Object[] objArr22 = new Object[i2];
            objArr22[0] = Log.getStackTraceString(e);
            com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", objArr22);
            kVar2.mo122438a(fVar.mo115109j("fail:missing finalStyle"));
            return false;
        }
    }
}
