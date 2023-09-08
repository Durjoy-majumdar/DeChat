package pl1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import k60.C99102f;
import r60.C101350i;
import s60.C101536b;
import w60.C65941g;
import zt3.C119157j;

/* renamed from: pl1.w */
public final class C100819w extends C101536b<Bitmap> {

    /* renamed from: pl1.w$a */
    public static final class C100820a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f295331d;

        /* renamed from: e */
        public final /* synthetic */ Matrix f295332e;

        public C100820a(View view, Matrix matrix) {
            this.f295331d = view;
            this.f295332e = matrix;
        }

        public final void run() {
            View view = this.f295331d;
            if (view instanceof ImageView) {
                ((ImageView) view).setScaleType(ImageView.ScaleType.MATRIX);
                ((ImageView) this.f295331d).setImageMatrix(this.f295332e);
            }
        }
    }

    /* renamed from: a */
    public C65941g<? extends Bitmap> mo139547a(C101350i<?> iVar, C99102f<?, Bitmap> fVar, C65941g<Bitmap> gVar) {
        C87412m.m108594g(iVar, "targetView");
        C87412m.m108594g(fVar, "reaper");
        C87412m.m108594g(gVar, "input");
        Bitmap bitmap = (Bitmap) gVar.f189590a;
        View a = iVar.mo140837a();
        if (a == null) {
            return gVar;
        }
        int width = a.getWidth();
        int height = a.getHeight();
        float width2 = (((float) width) * 1.0f) / ((float) bitmap.getWidth());
        Matrix matrix = new Matrix();
        matrix.setScale(width2, width2);
        matrix.postTranslate(0.0f, (((float) height) - (((float) bitmap.getHeight()) * width2)) * 0.5f);
        ((C119157j) C119157j.f356862d).mo183895z(new C100820a(a, matrix));
        return gVar;
    }

    /* renamed from: b */
    public String mo139548b(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        return str;
    }
}
