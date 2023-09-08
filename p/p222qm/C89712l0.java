package p222qm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.HandleScanResultEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C90193h;

/* renamed from: qm.l0 */
public class C89712l0 extends IStaticListener<HandleScanResultEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        String str2;
        String str3;
        HandleScanResultEvent handleScanResultEvent = (HandleScanResultEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        HandleScanResultEvent.C80725a aVar = handleScanResultEvent.f236219d;
        Context context = aVar.f236222c;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "context is null");
            return false;
        }
        String[] strArr = aVar.f236220a;
        String str4 = null;
        if (strArr == null || strArr.length <= 0) {
            str2 = null;
            str = null;
        } else {
            str2 = strArr[0];
            str = C90193h.m112878f(C6647c.m6936a(context, str2)[0].toByteArray());
        }
        String[] strArr2 = handleScanResultEvent.f236219d.f236221b;
        if (strArr2 == null || strArr2.length < 1) {
            Log.m105920e("MicroMsg.WorkerProfile", "args is null");
            return false;
        }
        if (strArr2.length > 1) {
            str4 = strArr2[0];
            str3 = strArr2[1];
        } else {
            str3 = null;
        }
        Log.m105925i("MicroMsg.WorkerProfile", "handleScanResult, appid = %s, scanResult = %s", str4, str3);
        if (Util.isNullOrNil(str4) || Util.isNullOrNil(str3)) {
            return false;
        }
        String format = String.format("weixin://dl/handleScanResult?appid=%s&result=%s", new Object[]{str4, str3});
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.setData(Uri.parse(format));
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_command_id", 17);
        intent.putExtra("key_package_name", str2);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str);
        C85083h.m104929r(intent, context);
        return true;
    }
}
