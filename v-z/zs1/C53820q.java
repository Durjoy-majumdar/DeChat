package zs1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: zs1.q */
public final class C53820q implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53815m f151036d;

    public C53820q(C53815m mVar) {
        this.f151036d = mVar;
    }

    public final boolean onLongClick(View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            C53815m mVar = this.f151036d;
            Context context = mVar.f151027j;
            C77389a aVar = new C77389a();
            aVar.f225664u = "取消";
            aVar.f225663t = "确认";
            aVar.f225620C = new C39446s(mVar);
            aVar.f225647d = "请输入调试Webview url！";
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            z = true;
        } else {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z;
    }
}
