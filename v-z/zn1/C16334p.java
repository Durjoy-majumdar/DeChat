package zn1;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: zn1.p */
public final class C16334p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f43677d;

    /* renamed from: e */
    public final /* synthetic */ C16336r f43678e;

    /* renamed from: f */
    public final /* synthetic */ TextView f43679f;

    /* renamed from: g */
    public final /* synthetic */ TextView f43680g;

    public C16334p(View view, C16336r rVar, TextView textView, TextView textView2) {
        this.f43677d = view;
        this.f43678e = rVar;
        this.f43679f = textView;
        this.f43680g = textView2;
    }

    public final void run() {
        int measuredWidth = this.f43677d.getMeasuredWidth() - this.f43678e.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3755d6);
        float measureText = this.f43679f.getPaint().measureText(this.f43679f.getText().toString());
        float measureText2 = this.f43680g.getPaint().measureText(this.f43680g.getText().toString());
        float dimensionPixelOffset = (float) this.f43678e.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        float f = (float) measuredWidth;
        if (measureText + measureText2 + dimensionPixelOffset > f) {
            float measureText3 = ((f - measureText2) - dimensionPixelOffset) - this.f43679f.getPaint().measureText("…");
            TextView textView = this.f43679f;
            textView.setText(TextUtils.ellipsize(textView.getText(), this.f43679f.getPaint(), measureText3, TextUtils.TruncateAt.END));
        }
    }
}
