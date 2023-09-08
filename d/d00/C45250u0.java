package d00;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C40490e;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import di3.C86301e;
import di3.C86312j;
import e00.C45513i0;
import e00.C45520t;
import e00.C7580y;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import js0.C46574u;
import p248ug.C52572q0;
import t83.C13853i;

@C86522b
/* renamed from: d00.u0 */
public class C45250u0 extends C86301e implements C45513i0 {
    /* renamed from: E3 */
    public void mo70778E3(String str, boolean z) {
        ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71609E3(str, z);
    }

    public C46574u.C46575a Nh0(Context context) {
        return new C40490e(context);
    }

    /* renamed from: Q3 */
    public C45520t mo70780Q3(MMWebView mMWebView, C45520t.C45522b bVar, C13853i iVar) {
        return ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71611Q3(mMWebView, bVar, iVar);
    }

    /* renamed from: U1 */
    public C7580y mo70781U1(MMWebView mMWebView) {
        return ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71612U1(mMWebView);
    }

    /* renamed from: e0 */
    public boolean mo70782e0(Activity activity, int i, int i2, Intent intent) {
        return ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71614e0(activity, i, i2, intent);
    }

    /* renamed from: f1 */
    public void mo70783f1(Activity activity, String str) {
        ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71615f1(activity, str);
    }

    /* renamed from: gR */
    public C43783b mo70784gR(C45520t tVar, Context context) {
        C44255f1 f1Var = new C44255f1(new WeakReference((BaseWebViewController) tVar));
        if (context != null) {
            f1Var.f119920f = new WeakReference<>(context);
        }
        return f1Var;
    }

    /* renamed from: u3 */
    public C45520t mo70785u3(MMWebView mMWebView, int i) {
        return ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71618u3(mMWebView, i);
    }
}
