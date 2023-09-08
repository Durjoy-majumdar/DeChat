package c81;

import android.app.Activity;
import android.widget.TextView;
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

/* renamed from: c81.m */
public final class C39917m implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C0435q f107034a;

    /* renamed from: b */
    public final /* synthetic */ TextView f107035b;

    /* renamed from: c */
    public final /* synthetic */ WeImageView f107036c;

    /* renamed from: c81.m$a */
    public static final class C39918a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f107037d;

        /* renamed from: e */
        public final /* synthetic */ WxaAttributes f107038e;

        /* renamed from: f */
        public final /* synthetic */ WeImageView f107039f;

        /* renamed from: g */
        public final /* synthetic */ C0435q f107040g;

        public C39918a(TextView textView, WxaAttributes wxaAttributes, WeImageView weImageView, C0435q qVar) {
            this.f107037d = textView;
            this.f107038e = wxaAttributes;
            this.f107039f = weImageView;
            this.f107040g = qVar;
        }

        public final void run() {
            this.f107037d.setText(this.f107038e.field_nickname);
            this.f107039f.setIconColor(this.f107040g.getContext().getResources().getColor(C0966R.color.ahf));
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59347c = true;
            C20828a.m22825b().mo32519h(this.f107038e.field_smallHeadURL, this.f107039f, bVar.mo32666a());
        }
    }

    public C39917m(C0435q qVar, TextView textView, WeImageView weImageView) {
        this.f107034a = qVar;
        this.f107035b = textView;
        this.f107036c = weImageView;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C39918a(this.f107035b, wxaAttributes, this.f107036c, this.f107034a));
        }
        Activity context = this.f107034a.getContext();
        TextView textView = this.f107035b;
        boolean z = wxaAttributes != null;
        C87412m.m108594g(context, "context");
        C23564m.m28136f(new C45287d(textView, z ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), (WeImageView) null));
    }
}
