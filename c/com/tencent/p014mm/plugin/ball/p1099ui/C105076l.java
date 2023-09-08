package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import aw0.C103926n;
import bw0.C104179u;
import bw0.C104180v;
import bw0.C104181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import uv0.C111237j;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.ball.ui.l */
public class C105076l implements C111237j.C52622b {

    /* renamed from: a */
    public final /* synthetic */ C112504a f311856a;

    /* renamed from: b */
    public final /* synthetic */ Point f311857b;

    /* renamed from: c */
    public final /* synthetic */ C111237j f311858c;

    /* renamed from: d */
    public final /* synthetic */ float f311859d;

    /* renamed from: com.tencent.mm.plugin.ball.ui.l$a */
    public class C105077a implements Runnable {
        public C105077a() {
        }

        public void run() {
            C112504a aVar = C105076l.this.f311856a;
            if (aVar != null) {
                aVar.mo114239a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.ui.l$b */
    public class C105078b implements Runnable {
        public C105078b() {
        }

        public void run() {
            C105076l lVar = C105076l.this;
            Point point = lVar.f311857b;
            if (point != null) {
                C111237j jVar = lVar.f311858c;
                float f = lVar.f311859d;
                C112504a aVar = lVar.f311856a;
                Log.m105925i("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, ballPos(x:%d, y:%d), lastSwipePosX:%f", Integer.valueOf(point.x), Integer.valueOf(point.y), Float.valueOf(f));
                if (jVar.getMaskView() == null) {
                    Log.m105928w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page mask view is null");
                    aVar.mo114239a();
                } else if (jVar.getContentView() == null) {
                    Log.m105928w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page content view is null");
                    aVar.mo114239a();
                } else if (jVar.mo23512b() == null) {
                    Log.m105928w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page root view is null");
                    aVar.mo114239a();
                } else {
                    Bitmap bitmap = jVar.getBitmap();
                    if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                        Log.m105928w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page get bitmap is null");
                        aVar.mo114239a();
                        return;
                    }
                    C104181w wVar = new C104181w(jVar.getActivity(), bitmap);
                    wVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    int i = point.x;
                    int i2 = point.y;
                    wVar.f308433o = i;
                    wVar.f308434p = i2;
                    wVar.f308432n = C103926n.f307292b / 2;
                    wVar.setContentStartPosX((int) f);
                    wVar.setListener(new C105080n(wVar, aVar, jVar));
                    ViewGroup b = jVar.mo23512b();
                    b.addView(wVar, b.getChildCount());
                    View contentView = jVar.getContentView();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = contentView;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                    int i3 = wVar.f308437s;
                    wVar.f308438t = i3 > 0;
                    int i4 = wVar.f308433o;
                    if (i3 < i4) {
                        i4 = i3;
                    }
                    PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("canvasTranslationX", new int[]{i3, i4});
                    int i5 = wVar.f308433o;
                    if (wVar.f308438t) {
                        int i6 = wVar.f308437s;
                        i5 = i6 < i5 ? i5 - i6 : 0;
                    }
                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("translationX", new int[]{0, i5}), PropertyValuesHolder.ofInt("translationY", new int[]{0, wVar.f308434p}), PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, (((float) wVar.f308432n) * 2.0f) / ((float) wVar.f308435q)}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, (((float) wVar.f308432n) * 2.0f) / ((float) wVar.f308436r)}), ofInt, PropertyValuesHolder.ofInt("bgAlpha", new int[]{255, 0})});
                    ofPropertyValuesHolder.setDuration((long) 300);
                    ofPropertyValuesHolder.setInterpolator(linearInterpolator);
                    ofPropertyValuesHolder.addUpdateListener(new C104179u(wVar));
                    ofPropertyValuesHolder.addListener(new C104180v(wVar));
                    ofPropertyValuesHolder.start();
                }
            } else {
                C112504a aVar3 = lVar.f311856a;
                if (aVar3 != null) {
                    aVar3.mo114239a();
                }
            }
        }
    }

    public C105076l(C112504a aVar, Point point, C111237j jVar, float f) {
        this.f311856a = aVar;
        this.f311857b = point;
        this.f311858c = jVar;
        this.f311859d = f;
    }

    /* renamed from: a */
    public void mo149224a(boolean z) {
        if (!z) {
            Log.m105924i("MicroMsg.FloatBallSwipeTransformationHelper", "doTransform, convertToTranslucent not complete");
            MMHandlerThread.postToMainThread(new C105077a());
            return;
        }
        MMHandlerThread.postToMainThread(new C105078b());
    }
}
