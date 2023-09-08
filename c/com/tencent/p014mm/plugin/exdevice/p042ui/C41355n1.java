package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C45287d;
import gy3.C87412m;
import kg3.C76577a;
import kr0.C76629w0;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.n1 */
public final class C41355n1 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ SportHistoryUI f111341a;

    /* renamed from: b */
    public final /* synthetic */ TextView f111342b;

    /* renamed from: c */
    public final /* synthetic */ WeImageView f111343c;

    public C41355n1(SportHistoryUI sportHistoryUI, TextView textView, WeImageView weImageView) {
        this.f111341a = sportHistoryUI;
        this.f111342b = textView;
        this.f111343c = weImageView;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        AppCompatActivity context = this.f111341a.getContext();
        C87412m.m108593f(context, "context");
        C23564m.m28136f(new C45287d(this.f111342b, wxaAttributes != null ? C76577a.m92153d(context, C0966R.color.Link_100) : C76577a.m92153d(context, C0966R.color.FG_2), this.f111343c));
    }
}
