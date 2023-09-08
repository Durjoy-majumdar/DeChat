package er1;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import p244tt.C14088e;
import rx3.C13598b0;

/* renamed from: er1.b1 */
public final class C7782b1 {

    /* renamed from: a */
    public static final C7782b1 f26282a = new C7782b1();

    /* renamed from: er1.b1$a */
    public static final class C7783a implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f26283a;

        public C7783a(C32226l<? super Boolean, C13598b0> lVar) {
            this.f26283a = lVar;
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("FinderLiteAppUtil", "OpenLiteApp success");
            C32226l<Boolean, C13598b0> lVar = this.f26283a;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("FinderLiteAppUtil", "OpenLiteApp fail");
            C32226l<Boolean, C13598b0> lVar = this.f26283a;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8894a(Context context, Bundle bundle, boolean z, C32226l<? super Boolean, C13598b0> lVar) {
        Class cls = C14088e.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "bundle");
        String string = bundle.getString("appId");
        Log.m105924i("FinderLiteAppUtil", "lite_app appId: " + string);
        boolean z2 = true;
        if ((string == null || string.length() == 0) || (z && !((C14088e) C86312j.m106911c(cls)).mo13530uu(string))) {
            z2 = false;
        }
        if (z2) {
            ((C14088e) C86312j.m106911c(cls)).mo13510OP(context, bundle, true, false, new C7783a(lVar));
        }
        return z2;
    }
}
