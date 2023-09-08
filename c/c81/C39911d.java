package c81;

import android.app.Activity;
import android.widget.TextView;
import c81.C39904a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C45287d;
import gy3.C87412m;
import kg3.C76577a;
import kr0.C76629w0;
import zp3.C23564m;

/* renamed from: c81.d */
public final class C39911d implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C39904a f107019a;

    /* renamed from: b */
    public final /* synthetic */ C39904a.C39906b f107020b;

    public C39911d(C39904a aVar, C39904a.C39906b bVar) {
        this.f107019a = aVar;
        this.f107020b = bVar;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        Activity context = this.f107019a.getContext();
        C39904a.C39906b bVar = this.f107020b;
        TextView textView = bVar.f106998d;
        WeImageView weImageView = bVar.f106997c;
        boolean z = wxaAttributes != null;
        C87412m.m108594g(context, "context");
        C23564m.m28136f(new C45287d(textView, z ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), weImageView));
    }
}
