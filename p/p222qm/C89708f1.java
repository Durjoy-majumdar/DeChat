package p222qm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SDKOpenOfflinePayEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import f40.C86709a0;
import p823sg.C90193h;

/* renamed from: qm.f1 */
public class C89708f1 extends IStaticListener<SDKOpenOfflinePayEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        SDKOpenOfflinePayEvent sDKOpenOfflinePayEvent = (SDKOpenOfflinePayEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        String[] strArr = sDKOpenOfflinePayEvent.f236277d.f236279b;
        if (strArr == null || strArr.length == 0) {
            Log.m105920e("MicroMsg.WorkerProfile", "args is null");
        } else if (strArr.length < 1) {
            Log.m105920e("MicroMsg.WorkerProfile", "args must contain appid");
        } else if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.WorkerProfile", "has not login, sdk open offlinePay fail");
        } else {
            SDKOpenOfflinePayEvent.C80738a aVar = sDKOpenOfflinePayEvent.f236277d;
            Context context = aVar.f236280c;
            String str2 = strArr[0];
            String[] strArr2 = aVar.f236278a;
            String str3 = null;
            if (strArr2 == null || strArr2.length <= 0) {
                str = null;
            } else {
                str3 = strArr2[0];
                str = C90193h.m112878f(C6647c.m6936a(context, str3)[0].toByteArray());
            }
            Log.m105925i("MicroMsg.WorkerProfile", "sdk open offlinePay, appid = %s, package = %s", str2, str3);
            String format = String.format("weixin://dl/offlinepay/?appid=%s", new Object[]{str2});
            Log.m105925i("MicroMsg.WorkerProfile", "url format = %s", format);
            Intent intent = new Intent(context, WXBizEntryActivity.class);
            intent.setData(Uri.parse(format));
            intent.addFlags(268435456);
            intent.putExtra("key_app_id", str2);
            intent.putExtra("key_package_name", str3);
            intent.putExtra("translate_link_scene", 1);
            intent.putExtra("key_package_signature", str);
            intent.putExtra("key_command_id", 24);
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("key_data_center_session_id", true);
            c.mo120962i("key_package_name", str3);
            c.mo120962i("key_package_signature", str);
            Log.m105925i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str3, str);
            C85083h.m104929r(intent, context);
        }
        return true;
    }
}
