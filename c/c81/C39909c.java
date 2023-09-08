package c81;

import android.app.Activity;
import android.widget.TextView;
import c81.C39904a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C45287d;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kg3.C76577a;
import kr0.C76629w0;
import zp3.C23564m;
import zt3.C119157j;

/* renamed from: c81.c */
public final class C39909c implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C39904a f107014a;

    /* renamed from: b */
    public final /* synthetic */ C39904a.C39906b f107015b;

    /* renamed from: c81.c$a */
    public static final class C39910a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39904a.C39906b f107016d;

        /* renamed from: e */
        public final /* synthetic */ WxaAttributes f107017e;

        /* renamed from: f */
        public final /* synthetic */ C39904a f107018f;

        public C39910a(C39904a.C39906b bVar, WxaAttributes wxaAttributes, C39904a aVar) {
            this.f107016d = bVar;
            this.f107017e = wxaAttributes;
            this.f107018f = aVar;
        }

        public final void run() {
            TextView textView = this.f107016d.f106998d;
            if (textView != null) {
                textView.setText(this.f107017e.field_nickname);
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59347c = true;
            C20937c a = bVar.mo32666a();
            WeImageView weImageView = this.f107016d.f106997c;
            if (weImageView != null) {
                weImageView.setIconColor(this.f107018f.getContext().getResources().getColor(C0966R.color.ahf));
            }
            C20828a.m22825b().mo32519h(this.f107017e.field_smallHeadURL, this.f107016d.f106997c, a);
        }
    }

    public C39909c(C39904a aVar, C39904a.C39906b bVar) {
        this.f107014a = aVar;
        this.f107015b = bVar;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C39910a(this.f107015b, wxaAttributes, this.f107014a));
        }
        Activity context = this.f107014a.getContext();
        TextView textView = this.f107015b.f106998d;
        boolean z = wxaAttributes != null;
        C87412m.m108594g(context, "context");
        C23564m.m28136f(new C45287d(textView, z ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), (WeImageView) null));
    }
}
