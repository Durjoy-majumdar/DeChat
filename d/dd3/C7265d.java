package dd3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.location.C57534a;
import com.tencent.p014mm.pluginsdk.location.LocationView;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nc0.C76850a;
import nd3.C11152d;
import nd3.C88929c;
import qo3.C77429t;

/* renamed from: dd3.d */
public class C7265d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LocationView f25326d;

    public C7265d(LocationView locationView) {
        this.f25326d = locationView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            boolean b = C88929c.m111018b((Activity) this.f25326d.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64, "", "", (C77429t) null, Boolean.FALSE);
            Log.m105925i("MicroMsg.LocationView", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(b));
            if (!b) {
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (!C88929c.m111019c(this.f25326d.getContext(), "android.permission.ACCESS_FINE_LOCATION", true)) {
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                LocationView locationView = this.f25326d;
                int i = LocationView.f23940x;
                locationView.getClass();
                Intent intent = new Intent();
                intent.putExtra("rawUrl", locationView.getResources().getString(C0966R.string.gbq));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C88144b.m109791i(locationView.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else {
                Activity activity = (Activity) this.f25326d.getContext();
                C88929c.m111024h("android.permission.ACCESS_FINE_LOCATION", 64);
                C88929c.m111022f(activity, 64, new C11152d(activity), new String[]{"android.permission.ACCESS_FINE_LOCATION"}, "", "");
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C57534a.C6645a aVar = this.f25326d.f23955u;
        if (aVar != null) {
            aVar.mo7573a();
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
