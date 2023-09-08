package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
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

/* renamed from: com.tencent.mm.plugin.exdevice.ui.m1 */
public final class C41350m1 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ SportHistoryUI f111330a;

    /* renamed from: b */
    public final /* synthetic */ TextView f111331b;

    /* renamed from: c */
    public final /* synthetic */ WeImageView f111332c;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.m1$a */
    public static final class C41351a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f111333d;

        /* renamed from: e */
        public final /* synthetic */ WxaAttributes f111334e;

        /* renamed from: f */
        public final /* synthetic */ WeImageView f111335f;

        /* renamed from: g */
        public final /* synthetic */ SportHistoryUI f111336g;

        public C41351a(TextView textView, WxaAttributes wxaAttributes, WeImageView weImageView, SportHistoryUI sportHistoryUI) {
            this.f111333d = textView;
            this.f111334e = wxaAttributes;
            this.f111335f = weImageView;
            this.f111336g = sportHistoryUI;
        }

        public final void run() {
            TextView textView = this.f111333d;
            if (textView != null) {
                textView.setText(this.f111334e.field_nickname);
            }
            WeImageView weImageView = this.f111335f;
            if (weImageView != null) {
                weImageView.setIconColor(this.f111336g.getContext().getResources().getColor(C0966R.color.ahf));
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59347c = true;
            C20828a.m22825b().mo32519h(this.f111334e.field_smallHeadURL, this.f111335f, bVar.mo32666a());
        }
    }

    public C41350m1(SportHistoryUI sportHistoryUI, TextView textView, WeImageView weImageView) {
        this.f111330a = sportHistoryUI;
        this.f111331b = textView;
        this.f111332c = weImageView;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C41351a(this.f111331b, wxaAttributes, this.f111332c, this.f111330a));
        }
        AppCompatActivity context = this.f111330a.getContext();
        C87412m.m108593f(context, "context");
        C23564m.m28136f(new C45287d(this.f111331b, wxaAttributes != null ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), (WeImageView) null));
    }
}
