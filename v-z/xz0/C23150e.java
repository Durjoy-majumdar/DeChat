package xz0;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import te3.C22498fy;

/* renamed from: xz0.e */
public class C23150e extends C23145a {

    /* renamed from: g */
    public TextView f66498g;

    /* renamed from: h */
    public TextView f66499h;

    public C23150e(Context context) {
        super(context);
    }

    /* renamed from: e */
    public void mo36526e(boolean z, boolean z2) {
    }

    /* renamed from: g */
    public void mo36528g() {
        this.f66499h = (TextView) this.f66474c.findViewById(C0966R.C0970id.as7);
        this.f66498g = (TextView) this.f66474c.findViewById(C0966R.C0970id.axa);
    }

    /* renamed from: h */
    public void mo36529h() {
        if (this.f66472a.mo23264L0().f64149s != null && this.f66472a.mo23264L0().f64149s.size() > 0) {
            C22498fy fyVar = this.f66472a.mo23264L0().f64149s.get(0);
            TextView textView = this.f66476e;
            if (textView != null) {
                textView.setText(fyVar.f63884d);
            }
            if (this.f66498g != null) {
                if (!TextUtils.isEmpty(fyVar.f63885e)) {
                    this.f66498g.setText(fyVar.f63885e);
                } else {
                    this.f66498g.setVisibility(8);
                }
            }
            if (this.f66499h == null) {
                return;
            }
            if (!TextUtils.isEmpty(fyVar.f63886f)) {
                this.f66499h.setText(fyVar.f63886f);
            } else {
                this.f66499h.setVisibility(8);
            }
        }
    }
}
