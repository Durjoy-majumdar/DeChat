package p222qm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SDKOpenWebviewEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import p823sg.C90193h;

/* renamed from: qm.h1 */
public class C89710h1 extends IStaticListener<SDKOpenWebviewEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SDKOpenWebviewEvent sDKOpenWebviewEvent = (SDKOpenWebviewEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        Class<WXBizEntryActivity> cls = WXBizEntryActivity.class;
        SDKOpenWebviewEvent.C80739a aVar = sDKOpenWebviewEvent.f236281d;
        Context context = aVar.f236284c;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "context is null");
        } else {
            String[] strArr = aVar.f236282a;
            if (strArr == null || strArr.length <= 0) {
                str2 = null;
                str = null;
            } else {
                str2 = strArr[0];
                str = C90193h.m112878f(C6647c.m6936a(context, str2)[0].toByteArray());
            }
            SDKOpenWebviewEvent.C80739a aVar2 = sDKOpenWebviewEvent.f236281d;
            String[] strArr2 = aVar2.f236283b;
            if (strArr2 == null || strArr2.length < 1) {
                Log.m105920e("MicroMsg.WorkerProfile", "args is null");
                return false;
            }
            Log.m105925i("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle event, withType = %b", Boolean.valueOf(aVar2.f236285d));
            if (!sDKOpenWebviewEvent.f236281d.f236285d) {
                String str6 = str;
                String str7 = "key_data_center_session_id";
                String str8 = "key_command_id";
                String str9 = "key_package_signature";
                String str10 = "sava packagename and signature to data center, package ; %s, sig : %s";
                if (strArr2.length > 1) {
                    str5 = strArr2[0];
                    str4 = strArr2[1];
                    str3 = str10;
                } else {
                    str3 = str10;
                    str5 = null;
                    str4 = null;
                }
                Log.m105925i("MicroMsg.WorkerProfile", "open webview, appid = %s, url = %s", str5, str4);
                if (!Util.isNullOrNil(str5) && !Util.isNullOrNil(str4)) {
                    String format = String.format("weixin://dl/businessWebview/link?appid=%s&url=%s", new Object[]{str5, str4});
                    Log.m105925i("MicroMsg.WorkerProfile", "url format = %s", format);
                    Intent intent = new Intent(context, cls);
                    intent.setData(Uri.parse(format));
                    intent.addFlags(268435456);
                    intent.putExtra("key_package_name", str2);
                    intent.putExtra("translate_link_scene", 1);
                    intent.putExtra(str9, str6);
                    intent.putExtra(str8, 12);
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(str7, true);
                    c.mo120962i("key_package_name", str2);
                    c.mo120962i(str9, str6);
                    Log.m105925i("MicroMsg.WorkerProfile", str3, str2, str6);
                    C85083h.m104929r(intent, context);
                    return true;
                }
            } else if (strArr2.length < 1) {
                Log.m105920e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent handle fail, selectionArgs length invalid");
            } else {
                String str11 = strArr2[0];
                String str12 = strArr2[1];
                String str13 = "sava packagename and signature to data center, package ; %s, sig : %s";
                Log.m105925i("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent, typeStr = %s, appid = %s", str12, str11);
                int safeParseInt = Util.safeParseInt(str12);
                String str14 = "openwebviewwithtype url format = %s";
                String str15 = "openwebviewwithtype fail, appId is null";
                String str16 = "SDKOpenWebviewEvent handle subscribe message, lenght = %d";
                if (safeParseInt == 1) {
                    String str17 = "key_data_center_session_id";
                    String str18 = str13;
                    String str19 = str15;
                    String str20 = str16;
                    String str21 = str;
                    String str22 = "key_command_id";
                    String str23 = "key_package_signature";
                    String str24 = str14;
                    if (strArr2.length < 5) {
                        Log.m105921e("MicroMsg.WorkerProfile", str20, Integer.valueOf(strArr2.length));
                    }
                    String str25 = strArr2[2];
                    String str26 = strArr2[3];
                    String str27 = strArr2[4];
                    Log.m105925i("MicroMsg.WorkerProfile", "openwebviewwithtype, appid = %s, type = %s, scene = %s, templateID = %s, reserved = %s", str11, Integer.valueOf(safeParseInt), str25, str26, str27);
                    if (Util.isNullOrNil(str11)) {
                        Log.m105920e("MicroMsg.WorkerProfile", str19);
                    } else {
                        String format2 = String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", new Object[]{str11, Integer.valueOf(safeParseInt), Uri.encode(String.format("scene=%s&template_id=%s&reserved=%s", new Object[]{str25, str26, str27}))});
                        Log.m105925i("MicroMsg.WorkerProfile", str24, format2);
                        Intent intent2 = new Intent(context, cls);
                        intent2.setData(Uri.parse(format2));
                        intent2.addFlags(268435456);
                        intent2.putExtra("key_package_name", str2);
                        intent2.putExtra("translate_link_scene", 1);
                        String str28 = str21;
                        String str29 = str23;
                        intent2.putExtra(str29, str28);
                        intent2.putExtra(str22, 12);
                        C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(str17, true);
                        c2.mo120962i("key_package_name", str2);
                        c2.mo120962i(str29, str28);
                        Log.m105925i("MicroMsg.WorkerProfile", str18, str2, str28);
                        C85083h.m104929r(intent2, context);
                        return true;
                    }
                } else if (safeParseInt != 5) {
                    String str30 = "key_data_center_session_id";
                    if (strArr2.length < 3) {
                        Log.m105921e("MicroMsg.WorkerProfile", "SDKOpenWebviewEvent fail, unknown type = %d", Integer.valueOf(safeParseInt));
                    } else {
                        String format3 = String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", new Object[]{str11, Integer.valueOf(safeParseInt), strArr2[2]});
                        Log.m105925i("MicroMsg.WorkerProfile", "default url format = %s", format3);
                        Intent intent3 = new Intent(context, cls);
                        intent3.setData(Uri.parse(format3));
                        intent3.addFlags(268435456);
                        intent3.putExtra("key_package_name", str2);
                        intent3.putExtra("translate_link_scene", 1);
                        intent3.putExtra("key_package_signature", str);
                        intent3.putExtra("key_command_id", 12);
                        C86493v0.C86495c c3 = C86493v0.m107224d().mo120947c(str30, true);
                        c3.mo120962i("key_package_name", str2);
                        c3.mo120962i("key_package_signature", str);
                        Log.m105925i("MicroMsg.WorkerProfile", str13, str2, str);
                        C85083h.m104929r(intent3, context);
                        return true;
                    }
                } else {
                    String str31 = "key_data_center_session_id";
                    String str32 = str13;
                    if (strArr2.length < 5) {
                        Log.m105921e("MicroMsg.WorkerProfile", str16, Integer.valueOf(strArr2.length));
                    }
                    String str33 = strArr2[2];
                    Log.m105925i("MicroMsg.WorkerProfile", "openwebviewwithtype, appid = %s, type = %s, miniProgramAppid = %s", str11, Integer.valueOf(safeParseInt), str33);
                    if (Util.isNullOrNil(str11)) {
                        Log.m105920e("MicroMsg.WorkerProfile", str15);
                    } else if (Util.isNullOrNil(str33)) {
                        Log.m105920e("MicroMsg.WorkerProfile", "openwebviewwithtype fail, miniProgramAppid is null");
                    } else {
                        String format4 = String.format("weixin://dl/businessWebview/link?appid=%s&type=%d&query=%s", new Object[]{str11, Integer.valueOf(safeParseInt), Uri.encode(String.format("miniProgramAppid=%s", new Object[]{str33}))});
                        Log.m105925i("MicroMsg.WorkerProfile", str14, format4);
                        Intent intent4 = new Intent(context, cls);
                        intent4.setData(Uri.parse(format4));
                        intent4.addFlags(268435456);
                        intent4.putExtra("key_package_name", str2);
                        intent4.putExtra("translate_link_scene", 1);
                        intent4.putExtra("key_package_signature", str);
                        intent4.putExtra("key_command_id", 12);
                        C86493v0.C86495c c4 = C86493v0.m107224d().mo120947c(str31, true);
                        c4.mo120962i("key_package_name", str2);
                        c4.mo120962i("key_package_signature", str);
                        Log.m105925i("MicroMsg.WorkerProfile", str32, str2, str);
                        C85083h.m104929r(intent4, context);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
