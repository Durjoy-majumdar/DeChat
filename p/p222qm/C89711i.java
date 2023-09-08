package p222qm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.ExtCallBizEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.plugin.base.stub.WXCustomSchemeEntryActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: qm.i */
public class C89711i extends IStaticListener<ExtCallBizEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        int i;
        ExtCallBizEvent extCallBizEvent = (ExtCallBizEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        Class<WXBizEntryActivity> cls = WXBizEntryActivity.class;
        if (extCallBizEvent == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event is null.");
        } else {
            ExtCallBizEvent.C80715a aVar = extCallBizEvent.f236183d;
            if (aVar == null) {
                Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event.data is null.");
            } else {
                int i2 = aVar.f236184a;
                if (i2 == 27) {
                    String[] strArr = aVar.f236188e;
                    if (strArr == null || strArr.length < 2) {
                        Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent selectionArgs error.");
                        return true;
                    }
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    if (strArr.length >= 3) {
                        str = Util.nullAsNil(strArr[2]);
                        try {
                            str = URLEncoder.encode(str, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                        }
                    } else {
                        str = "";
                    }
                    if (str2 == null || str3 == null) {
                        Log.m105921e("MicroMsg.WorkerProfile", "ExtCallBizEvent wrong args, %s, %s", str2, str3);
                        return true;
                    }
                    String[] strArr2 = extCallBizEvent.f236183d.f236188e;
                    if (strArr2.length >= 4) {
                        String str4 = strArr2[3];
                        if (!Util.isNullOrNil(str4)) {
                            i = Util.getInt(str4, 0);
                            Log.m105924i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                            String format = String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", new Object[]{str3, str2, str, Integer.valueOf(i), 0});
                            Intent intent = new Intent(extCallBizEvent.f236183d.f236186c, WXCustomSchemeEntryActivity.class);
                            intent.addFlags(268435456);
                            intent.setData(Uri.parse(format));
                            intent.putExtra("translate_link_scene", 1);
                            Context context = extCallBizEvent.f236183d.f236186c;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent);
                            Context context2 = context;
                            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(context2, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return true;
                        }
                    }
                    i = 0;
                    Log.m105924i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
                    String format2 = String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", new Object[]{str3, str2, str, Integer.valueOf(i), 0});
                    Intent intent2 = new Intent(extCallBizEvent.f236183d.f236186c, WXCustomSchemeEntryActivity.class);
                    intent2.addFlags(268435456);
                    intent2.setData(Uri.parse(format2));
                    intent2.putExtra("translate_link_scene", 1);
                    Context context3 = extCallBizEvent.f236183d.f236186c;
                    C9556a aVar22 = new C9556a();
                    aVar22.mo10233c(intent2);
                    Context context22 = context3;
                    C117292a.m165358d(context22, aVar22.mo10232b(), "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar22.mo10231a(0));
                    C117292a.m165359e(context22, "com/tencent/mm/app/WorkerProfile", "callbackOfExtCallBizEvent", "(Lcom/tencent/mm/autogen/events/ExtCallBizEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } else if (i2 != 28) {
                    Context context4 = aVar.f236186c;
                    String[] strArr3 = aVar.f236188e;
                    String[] strArr4 = aVar.f236187d;
                    int i3 = aVar.f236185b;
                    if (context4 == null) {
                        Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:context is null.");
                        context4 = MMApplicationContext.getContext();
                    }
                    if (strArr3 == null || strArr3.length < 2) {
                        Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:args error.");
                    } else {
                        int length = strArr3.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            Log.m105925i("MicroMsg.WorkerProfile", "arg : %s", strArr3[i4]);
                        }
                        String str5 = strArr3[0];
                        String str6 = strArr3[1];
                        String str7 = strArr3.length > 2 ? strArr3[2] : null;
                        int i5 = strArr3.length > 3 ? Util.getInt(strArr3[3], 0) : 0;
                        int i6 = strArr3.length > 4 ? Util.getInt(strArr3[4], 0) : 0;
                        Log.m105925i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source(%d)", Integer.valueOf(i3));
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source is out of range.");
                            } else if (Util.isNullOrNil((String) null)) {
                                Log.m105921e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:fromURL(%s) is null or nil.", null);
                            }
                        } else if (strArr4 == null || strArr4.length == 0) {
                            Log.m105920e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:packageNames is null or nil.");
                        }
                        Log.m105925i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener: appId(%s), toUserName(%s), extInfo(%s), fromURL(%s)", str5, str6, str7, null);
                        if (Util.isNullOrNil(str5) || Util.isNullOrNil(str6)) {
                            Log.m105920e("MicroMsg.WorkerProfile", "appId or toUsername is null or nil.");
                        } else {
                            int i7 = i5 == 1 ? 8 : i5 == 0 ? 7 : 0;
                            Intent intent3 = new Intent(context4, cls);
                            intent3.putExtra("key_command_id", i7);
                            intent3.putExtra("appId", str5);
                            intent3.putExtra("toUserName", str6);
                            intent3.putExtra("extInfo", str7);
                            intent3.putExtra(FirebaseAnalytics.C113379b.SOURCE, i3);
                            intent3.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i5);
                            intent3.putExtra("jump_profile_type", i6);
                            intent3.addFlags(268435456).addFlags(67108864);
                            if (strArr4 != null && strArr4.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String add : strArr4) {
                                    arrayList.add(add);
                                }
                                intent3.putStringArrayListExtra("androidPackNameList", arrayList);
                            }
                            C85083h.m104929r(intent3, context4);
                            return true;
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.WorkerProfile", "ExtCallBizEvent open exdevice rank list.");
                    Context context5 = extCallBizEvent.f236183d.f236186c;
                    Intent intent4 = new Intent(context5, cls);
                    intent4.addFlags(268435456);
                    intent4.putExtra("key_command_id", 11);
                    C85083h.m104929r(intent4, context5);
                    return true;
                }
            }
        }
        return false;
    }
}
