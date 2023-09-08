package p278yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: yh.h */
public class C23310h {

    /* renamed from: a */
    public final View f67012a;

    /* renamed from: b */
    public LinearLayout f67013b;

    /* renamed from: c */
    public TextView f67014c;

    /* renamed from: d */
    public LinearLayout f67015d;

    public C23310h(View view) {
        this.f67012a = view;
    }

    /* renamed from: a */
    public LinearLayout mo36791a() {
        if (this.f67015d == null) {
            this.f67015d = (LinearLayout) this.f67012a.findViewById(C0966R.C0970id.ohw);
        }
        return this.f67015d;
    }

    /* renamed from: b */
    public LinearLayout mo36792b() {
        if (this.f67013b == null) {
            this.f67013b = (LinearLayout) this.f67012a.findViewById(C0966R.C0970id.oi8);
        }
        return this.f67013b;
    }
}
