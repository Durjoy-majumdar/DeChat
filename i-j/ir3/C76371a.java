package ir3;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import lg3.C88494d;

/* renamed from: ir3.a */
public class C76371a {

    /* renamed from: ir3.a$a */
    public class C76372a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f223654d;

        public C76372a(View view) {
            this.f223654d = view;
        }

        public void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f223654d.getLayoutParams();
            if (marginLayoutParams != null) {
                float f = C88494d.f255615g;
                int i = marginLayoutParams.height;
                if (i > 0) {
                    marginLayoutParams.height = (int) (((float) i) / f);
                }
                int i2 = marginLayoutParams.width;
                if (i2 > 0) {
                    marginLayoutParams.width = (int) (((float) i2) / f);
                }
                marginLayoutParams.topMargin = (int) (((float) marginLayoutParams.topMargin) / f);
                marginLayoutParams.bottomMargin = (int) (((float) marginLayoutParams.bottomMargin) / f);
                marginLayoutParams.leftMargin = (int) (((float) marginLayoutParams.leftMargin) / f);
                marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) / f);
                this.f223654d.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    public static int m91795a(int i) {
        int b = C76577a.m92151b(MMApplicationContext.getContext(), i);
        float f = C88494d.f255615g;
        return f != 1.0f ? (int) (((float) b) / f) : b;
    }

    /* renamed from: b */
    public static void m91796b(View view) {
        if (C88494d.f255615g != 1.0f) {
            view.post(new C76372a(view));
        }
    }
}
