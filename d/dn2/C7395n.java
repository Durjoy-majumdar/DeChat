package dn2;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: dn2.n */
public final class C7395n extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25534d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7395n(C7373a aVar) {
        super(1);
        this.f25534d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        C88144b.m109795m(this.f25534d.f25505a, "sns", ".ui.SnsUploadUI", intent, 2);
        return C13598b0.f38549a;
    }
}
