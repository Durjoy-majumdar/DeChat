package de1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.lang.ref.WeakReference;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: de1.o */
public final class C7287o {

    /* renamed from: de1.o$a */
    public static final class C7288a extends C87413o implements C32227p<Intent, C32226l<? super View, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public static final C7288a f25386d = new C7288a();

        public C7288a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C32226l lVar = (C32226l) obj2;
            C87412m.m108594g((Intent) obj, "<anonymous parameter 0>");
            C87412m.m108594g(lVar, "finish");
            lVar.invoke(null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final Bitmap m7445a(View view) {
        C87412m.m108594g(view, "view");
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        C87412m.m108593f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: b */
    public static final Rect m7446b(View view) {
        C87412m.m108594g(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], ((int) (((float) view.getWidth()) * view.getScaleX())) + i, iArr[1] + ((int) (((float) view.getHeight()) * view.getScaleX())));
    }

    /* renamed from: c */
    public static void m7447c(Intent intent, View view, long j, boolean z, boolean z2, C32227p pVar, int i, Object obj) {
        Window window;
        if ((i & 2) != 0) {
            j = 280;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            pVar = C7288a.f25386d;
        }
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(pVar, "exitCallback");
        if (C85875k4.m106208w()) {
            Log.m105924i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN! isInMultiWindowMode");
        } else if (view.getContext().getResources().getConfiguration().orientation == 1) {
            C37521f.f99374d.getClass();
            if (C37521f.f99385e2.mo60266n().intValue() != 1) {
                Log.m105924i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN!");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), m7445a(view));
            StringBuilder sb = new StringBuilder();
            sb.append(intent.hashCode());
            sb.append('#');
            sb.append(view.hashCode());
            String sb4 = sb.toString();
            intent.putExtra("key_intent_animating_flag", 1);
            intent.putExtra("key_anim_intent_id", sb4);
            intent.putExtra("key_intent_anim_duration", j);
            intent.putExtra("key_intent_enable_drag_exit", z);
            intent.putExtra("key_intent_source_rect", m7446b(view));
            intent.putExtra("key_intent_source_scale_type", ImageView.ScaleType.CENTER_CROP);
            if (z2) {
                Context context = view.getContext();
                Integer num = null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    num = Integer.valueOf(viewGroup.getHeight());
                }
                intent.putExtra("key_intent_content_view_height", num);
            }
            view.setTag(C0966R.C0970id.d_n, pVar);
            C7267b.f25328d.getClass();
            C7267b.f25329e.put(sb4, new C7301x(bitmapDrawable, new WeakReference(view)));
            Log.m105924i("ActivityToggleAnimator", "[toggleEnterAnimation] found view drawable is " + bitmapDrawable + " view=" + view + " cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
        }
    }

    /* renamed from: d */
    public static void m7448d(Activity activity, long j, C32224a aVar, int i, Object obj) {
        C7289p pVar;
        WeakReference<View> weakReference;
        View view;
        C32224a aVar2 = aVar;
        long j2 = (i & 1) != 0 ? 280 : j;
        C87412m.m108594g(activity, "<this>");
        C87412m.m108594g(aVar2, "endCall");
        C7267b bVar = C7267b.f25328d;
        C7289p pVar2 = new C7289p(aVar2);
        bVar.getClass();
        long c = C60641c.m70922c((double) (((float) j2) * 1.1f));
        Intent intent = activity.getIntent();
        if (intent != null) {
            if (intent.hasExtra("key_intent_animating_flag")) {
                Log.m105928w("ActivityToggleAnimator", "[exitAnimation] animating...");
                return;
            }
            ImageView imageView = (ImageView) activity.getWindow().getDecorView().findViewWithTag("key_anim_source_tag");
            C7292u uVar = (C7292u) activity.getWindow().getDecorView().findViewWithTag("GestureFrameLayout");
            View contentView = uVar.getContentView();
            View decorView = activity.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            long xx02 = bVar.xx0((ViewGroup) decorView);
            activity.getIntent().putExtra("KEY_INTENT_EXIT_ITEM_ID", xx02);
            Intent intent2 = activity.getIntent();
            C87412m.m108593f(intent2, "activity.intent");
            C7301x xVar = C7267b.f25329e.get(intent2.getStringExtra("key_anim_intent_id"));
            C13598b0 b0Var = null;
            Object tag = (xVar == null || (weakReference = xVar.f25403b) == null || (view = weakReference.get()) == null) ? null : view.getTag(C0966R.C0970id.d_n);
            C24564k0.m30741e(tag, 2);
            C32227p pVar3 = (C32227p) tag;
            if (pVar3 != null) {
                Intent intent3 = activity.getIntent();
                C87412m.m108593f(intent3, "activity.intent");
                pVar = pVar2;
                pVar3.invoke(intent3, new C7281i(intent, pVar3, contentView, xx02, imageView, activity, pVar2, uVar, c));
                b0Var = C13598b0.f38549a;
            } else {
                pVar = pVar2;
            }
            if (b0Var == null) {
                pVar.invoke();
            }
        }
    }
}
