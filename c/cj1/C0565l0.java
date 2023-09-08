package cj1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import nj3.C76912y0;

/* renamed from: cj1.l0 */
public final class C0565l0 implements C76912y0.C61776j {

    /* renamed from: a */
    public final /* synthetic */ int f1363a;

    public C0565l0(int i) {
        this.f1363a = i;
    }

    /* renamed from: a */
    public final void mo596a(View view) {
        WeImageView weImageView;
        TextView textView;
        if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
            textView.setTextSize(1, 14.0f);
        }
        if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
            weImageView.setImageResource(this.f1363a);
        }
    }
}
