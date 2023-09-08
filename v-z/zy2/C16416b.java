package zy2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import kg3.C76577a;
import nj3.C76912y0;

/* renamed from: zy2.b */
public final class C16416b implements C76912y0.C61776j {

    /* renamed from: a */
    public final /* synthetic */ Context f43829a;

    public C16416b(Context context) {
        this.f43829a = context;
    }

    /* renamed from: a */
    public final void mo596a(View view) {
        TextView textView;
        WeImageView weImageView = view != null ? (WeImageView) view.findViewById(C0966R.C0970id.kpx) : null;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.icons_outlined_done);
        }
        if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
            textView.setTextSize(0, (float) C76577a.m92155f(this.f43829a, C0966R.dimen.f3684bd));
        }
    }
}
