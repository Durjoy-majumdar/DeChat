package wg1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import nj3.C76912y0;

/* renamed from: wg1.p0 */
public final class C15334p0 implements C76912y0.C61776j {

    /* renamed from: a */
    public static final C15334p0 f41665a = new C15334p0();

    /* renamed from: a */
    public final void mo596a(View view) {
        WeImageView weImageView;
        TextView textView;
        if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
            textView.setTextSize(1, 14.0f);
        }
        if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
            weImageView.setImageResource(C0966R.raw.icons_filled_volume_down);
        }
    }
}
