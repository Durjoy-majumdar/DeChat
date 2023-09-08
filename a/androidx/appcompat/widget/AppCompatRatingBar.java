package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.tencent.p014mm.C0966R;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: d */
    public final C103538i f305458d;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2918zo);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f305458d.f305746b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103538i iVar = new C103538i(this);
        this.f305458d = iVar;
        iVar.mo144349a(attributeSet, i);
    }
}
