package p1127j8;

import android.graphics.drawable.GradientDrawable;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import p1156t.C110829a;

/* renamed from: j8.a */
public class C108652a {

    /* renamed from: a */
    public final MaterialCardView f325388a;

    /* renamed from: b */
    public int f325389b;

    /* renamed from: c */
    public int f325390c;

    public C108652a(MaterialCardView materialCardView) {
        this.f325388a = materialCardView;
    }

    /* renamed from: a */
    public final void mo159677a() {
        int contentPaddingLeft = this.f325388a.getContentPaddingLeft() + this.f325390c;
        int contentPaddingTop = this.f325388a.getContentPaddingTop() + this.f325390c;
        int contentPaddingRight = this.f325388a.getContentPaddingRight() + this.f325390c;
        int contentPaddingBottom = this.f325388a.getContentPaddingBottom() + this.f325390c;
        MaterialCardView materialCardView = this.f325388a;
        materialCardView.f305889f.set(contentPaddingLeft, contentPaddingTop, contentPaddingRight, contentPaddingBottom);
        ((C110829a) CardView.f305886j).mo162410c(materialCardView.f305891h);
    }

    /* renamed from: b */
    public void mo159678b() {
        MaterialCardView materialCardView = this.f325388a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f325388a.getRadius());
        int i = this.f325389b;
        if (i != -1) {
            gradientDrawable.setStroke(this.f325390c, i);
        }
        materialCardView.setForeground(gradientDrawable);
    }
}
