package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C103837e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import p853i4.C108343e;
import p853i4.C108344f;
import p853i4.C108353o;

public class ChangeImageTransform extends Transition {

    /* renamed from: K */
    public static final String[] f306660K = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: L */
    public static final TypeEvaluator<Matrix> f306661L = new C103803a();

    /* renamed from: M */
    public static final Property<ImageView, Matrix> f306662M = new C103804b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C54261c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f152300a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f152300a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f152300a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C54261c.<clinit>():void");
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    public static class C103803a implements TypeEvaluator<Matrix> {
        public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            Matrix matrix2 = (Matrix) obj2;
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    public static class C103804b extends Property<ImageView, Matrix> {
        public C103804b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            ImageView imageView = (ImageView) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            ImageView imageView = (ImageView) obj;
            Matrix matrix = (Matrix) obj2;
            if (!C108343e.f324371b) {
                try {
                    Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                    C108343e.f324370a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                C108343e.f324371b = true;
            }
            Method method = C108343e.f324370a;
            if (method != null) {
                try {
                    method.invoke(imageView, new Object[]{matrix});
                } catch (IllegalAccessException unused2) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: S */
    public final void mo145286S(C108353o oVar) {
        Matrix matrix;
        View view = oVar.f324392b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                HashMap hashMap = (HashMap) oVar.f324391a;
                hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                int i = C54261c.f152300a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    Drawable drawable = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
                    matrix = matrix2;
                } else if (i != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable2 = imageView.getDrawable();
                    int intrinsicWidth = drawable2.getIntrinsicWidth();
                    float width = (float) imageView.getWidth();
                    float f = (float) intrinsicWidth;
                    int intrinsicHeight = drawable2.getIntrinsicHeight();
                    float height = (float) imageView.getHeight();
                    float f2 = (float) intrinsicHeight;
                    float max = Math.max(width / f, height / f2);
                    int round = Math.round((width - (f * max)) / 2.0f);
                    int round2 = Math.round((height - (f2 * max)) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(max, max);
                    matrix3.postTranslate((float) round, (float) round2);
                    matrix = matrix3;
                }
                hashMap.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145286S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145286S(oVar);
    }

    /* renamed from: o */
    public Animator mo145268o(ViewGroup viewGroup, C108353o oVar, C108353o oVar2) {
        if (oVar == null || oVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ((HashMap) oVar.f324391a).get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) ((HashMap) oVar2.f324391a).get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) ((HashMap) oVar.f324391a).get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) ((HashMap) oVar2.f324391a).get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) oVar2.f324392b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return ObjectAnimator.ofObject(imageView, f306662M, f306661L, new Matrix[]{null, null});
        }
        if (matrix == null) {
            matrix = C108344f.f324372a;
        }
        if (matrix2 == null) {
            matrix2 = C108344f.f324372a;
        }
        Property<ImageView, Matrix> property = f306662M;
        property.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, property, new C103837e.C103838a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306660K;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
