package p1124j;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: j.a */
public class C108490a implements TransformationMethod {

    /* renamed from: d */
    public Locale f324809d;

    public C108490a(Context context) {
        this.f324809d = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f324809d);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
