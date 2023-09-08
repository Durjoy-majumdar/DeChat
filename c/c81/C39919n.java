package c81;

import android.app.Activity;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C45287d;
import gy3.C87412m;
import kg3.C76577a;
import kr0.C76629w0;
import zp3.C23564m;

/* renamed from: c81.n */
public final class C39919n implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C0435q f107041a;

    /* renamed from: b */
    public final /* synthetic */ TextView f107042b;

    /* renamed from: c */
    public final /* synthetic */ WeImageView f107043c;

    public C39919n(C0435q qVar, TextView textView, WeImageView weImageView) {
        this.f107041a = qVar;
        this.f107042b = textView;
        this.f107043c = weImageView;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        Activity context = this.f107041a.getContext();
        TextView textView = this.f107042b;
        WeImageView weImageView = this.f107043c;
        boolean z = wxaAttributes != null;
        C87412m.m108594g(context, "context");
        C23564m.m28136f(new C45287d(textView, z ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), weImageView));
    }
}
