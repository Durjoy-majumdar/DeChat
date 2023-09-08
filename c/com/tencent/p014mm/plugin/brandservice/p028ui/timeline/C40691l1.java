package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import fy3.C32224a;
import gy3.C87413o;
import q73.C35812s;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.l1 */
public final class C40691l1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f109310d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40691l1(BizTestUI bizTestUI) {
        super(0);
        this.f109310d = bizTestUI;
    }

    public Object invoke() {
        C35812s sVar = C35812s.f95615a;
        boolean z = false;
        int i = sVar.mo60422c() == 1 ? 2 : 0;
        C77398g gVar = new C77398g(this.f109310d);
        StringBuilder sb = new StringBuilder();
        sb.append("Pkg Info");
        if (sVar.mo60422c() == 1) {
            z = true;
        }
        String str = "";
        sb.append(z ? "(preview)" : str);
        gVar.setTitle((CharSequence) sb.toString());
        C29315z2 a = sVar.mo60420a("wxfedb0854e2b1820d", i);
        if (a != null) {
            str = str + "BasePkg:md5=" + a.field_versionMd5 + "\tversion=" + a.field_version + 10;
        }
        C29315z2 a2 = sVar.mo60420a("wxf337cbaa27790d8e", i);
        if (a2 != null) {
            str = str + "BizPkg:md5=" + a2.field_versionMd5 + " \tversion=" + a2.field_version + 10;
        }
        C29315z2 a3 = sVar.mo60420a("wx97b7aebac2183fd2", i);
        if (a3 != null) {
            str = str + "PrefetchBasePkg:md5=" + a3.field_versionMd5 + " \tversion=" + a3.field_version + 10;
        }
        C29315z2 a4 = sVar.mo60420a("wxa06c02b5c00ff39b", i);
        if (a4 != null) {
            str = str + "PrefetchBizPkg:md5=" + a4.field_versionMd5 + " \tversion=" + a4.field_version + 10;
        }
        C29315z2 a5 = sVar.mo60420a("wx4456404b7b80670e", i);
        if (a5 != null) {
            str = str + "PrefetchBizPkg:md5=" + a5.field_versionMd5 + " \tversion=" + a5.field_version + 10;
        }
        gVar.mo107533r(str);
        TextView textView = gVar.f225700q;
        if (textView != null) {
            textView.setGravity(3);
        }
        TextView textView2 = gVar.f225695i;
        if (textView2 != null) {
            textView2.setGravity(3);
        }
        gVar.mo107542x(this.f109310d.getString(C0966R.string.fmz), true, (DialogInterface.OnClickListener) null);
        gVar.show();
        ClipboardHelper.setText(this.f109310d.getContext(), (CharSequence) null, str);
        return C13598b0.f38549a;
    }
}
