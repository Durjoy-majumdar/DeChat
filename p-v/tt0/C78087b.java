package tt0;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: tt0.b */
public class C78087b extends LinearLayout {

    /* renamed from: e */
    public static final int f228881e = Color.parseColor("#000000");

    /* renamed from: f */
    public static final int f228882f = Color.parseColor("#000000");

    /* renamed from: d */
    public TextView f228883d;

    public C78087b(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f228883d = textView;
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(this.f228883d);
    }

    /* renamed from: a */
    public void mo108063a(int i, int i2, int i3, int i4) {
        setPadding(i2, i2, i2, i2);
        C78086a aVar = new C78086a();
        aVar.f228877f = (float) i;
        aVar.f228872a.setColor(i4);
        aVar.f228878g = i2;
        aVar.f228880i = (i2 / 3) + aVar.f228879h;
        aVar.f228873b.setColor(i3);
        setBackgroundDrawable(aVar);
    }

    public void setGravity(String str) {
        if (str.equals("left")) {
            this.f228883d.setGravity(3);
        } else if (str.equals("right")) {
            this.f228883d.setGravity(5);
        } else if (str.equals("center")) {
            this.f228883d.setGravity(17);
        } else {
            this.f228883d.setGravity(17);
        }
    }

    public void setText(String str) {
        this.f228883d.setText(str);
    }

    public void setTextColor(int i) {
        this.f228883d.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.f228883d.setTextSize((float) i);
    }

    public void setTitlePadding(int i) {
        this.f228883d.setPadding(i, i, i, i);
    }
}
