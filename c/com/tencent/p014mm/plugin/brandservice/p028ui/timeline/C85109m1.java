package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import dx2.C31343d;
import dx2.C86411e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import k70.C88119c;
import kr0.C33987b1;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m1 */
public final class C85109m1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f247989d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85109m1(BizTestUI bizTestUI) {
        super(0);
        this.f247989d = bizTestUI;
    }

    public Object invoke() {
        C77398g gVar = new C77398g(this.f247989d);
        gVar.setTitle((CharSequence) "Pkg Info");
        int i = MultiProcessMMKV.getMMKV("SurfacePackageDownloadStorage").decodeInt("PkgPreviewMode", 0) != 1 ? 0 : 2;
        C86411e eVar = new C86411e();
        Iterator<T> it = C31343d.f83890a.mo58078c().iterator();
        String str = "";
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            C29315z2 Yh = ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(str3, i, 0);
            if (Yh != null) {
                if (C87412m.m108589b(str3, "wx4edd479d258d7f25")) {
                    C40427l0 c = eVar.mo120823c("wx");
                    if (c != null) {
                        str2 = C88119c.f254874a.mo122517d(c);
                    }
                } else {
                    C40427l0 c2 = eVar.mo120823c(str3);
                    if (c2 != null) {
                        str2 = C88119c.f254874a.mo122516c(c2);
                    }
                }
                str = str + "appId = " + str3 + ", md5=" + Yh.field_versionMd5 + " \tversion=" + str2 + 10;
            }
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
        gVar.mo107542x(this.f247989d.getString(C0966R.string.fmz), true, (DialogInterface.OnClickListener) null);
        gVar.show();
        ClipboardHelper.setText(this.f247989d.getContext(), (CharSequence) null, str);
        return C13598b0.f38549a;
    }
}
