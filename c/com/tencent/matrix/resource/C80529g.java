package com.tencent.matrix.resource;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tencent.matrix.lifecycle.C28654a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.resource.g */
public class C80529g extends C28654a {
    public void onActivityDestroyed(Activity activity) {
        InputMethodManager inputMethodManager;
        long currentTimeMillis = System.currentTimeMillis();
        if (activity != null && (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) != null) {
            String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj instanceof View) {
                        View view = (View) obj;
                        if (view.getContext() != activity) {
                            C118672d.m167353c("Matrix.ActivityLeakFixer", "fixInputMethodManagerLeak break, context is not suitable, get_context=" + view.getContext() + " dest_context=" + activity, new Object[0]);
                            break;
                        }
                        declaredField.set(inputMethodManager, (Object) null);
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    C118672d.m167352b("Matrix.ActivityLeakFixer", "failed to fix InputMethodManagerLeak, %s", th.toString());
                }
                i++;
            }
        }
        C118672d.m167353c("Matrix.ActivityLeakFixer", "fixInputMethodManagerLeak done, cost: %s ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        if (activity == null || activity.getWindow() == null || activity.getWindow().peekDecorView() == null) {
            C118672d.m167353c("Matrix.ActivityLeakFixer", "unbindDrawables, ui or ui's window is null, skip rest works.", new Object[0]);
        } else {
            View rootView = activity.getWindow().peekDecorView().getRootView();
            try {
                C92459b.m116307b(rootView);
                if (Build.VERSION.SDK_INT >= 31 && C92459b.f264618b) {
                    rootView = activity.getWindow().getDecorView().findViewById(16908290);
                }
                if (rootView instanceof ViewGroup) {
                    ((ViewGroup) rootView).removeAllViews();
                }
            } catch (Throwable th4) {
                C118672d.m167356f("Matrix.ActivityLeakFixer", "caught unexpected exception when unbind drawables.", th4);
            }
        }
        C118672d.m167353c("Matrix.ActivityLeakFixer", "unbindDrawables done, cost: %s ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        if (Build.VERSION.SDK_INT == 28) {
            try {
                Context applicationContext = activity.getApplicationContext();
                if (C92459b.f264617a == null) {
                    FrameLayout frameLayout = new FrameLayout(applicationContext);
                    for (int i2 = 0; i2 < 32; i2++) {
                        frameLayout.addView(new View(applicationContext));
                    }
                    C92459b.f264617a = new Pair<>(frameLayout, new ArrayList());
                }
                Pair<ViewGroup, ArrayList<View>> pair = C92459b.f264617a;
                ((ViewGroup) pair.first).addChildrenForAccessibility((ArrayList) pair.second);
            } catch (Throwable th5) {
                C118672d.m167354d("Matrix.ActivityLeakFixer", th5, "fixViewLocationHolderLeakApi28 err", new Object[0]);
            }
        }
    }
}
