package t71;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Map;
import v71.C37690e;

/* renamed from: t71.a */
public class C36965a {
    /* renamed from: a */
    public static ArrayList<C37690e> m41110a(String str, String str2, String str3) {
        Log.m105918d("MicroMsg.ExdeviceMsgXmlParser", str2);
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.ExdeviceMsgXmlParser", "like info is null or nil");
            return null;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(str2, str3);
        if (u != null) {
            Map<String, String> map = u.f195558c;
            ArrayList<C37690e> arrayList = new ArrayList<>();
            if (map != null && !map.isEmpty()) {
                int i = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                    Object obj = "";
                    sb.append(i == 0 ? obj : Integer.valueOf(i));
                    sb.append(".username");
                    String str4 = map.get(sb.toString());
                    if (Util.isNullOrNil(str4)) {
                        Log.m105925i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", Integer.valueOf(i));
                        return arrayList;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                    sb4.append(i == 0 ? obj : Integer.valueOf(i));
                    sb4.append(".rankid");
                    String str5 = map.get(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                    sb5.append(i == 0 ? obj : Integer.valueOf(i));
                    sb5.append(".liketip");
                    String str6 = map.get(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                    if (i != 0) {
                        obj = Integer.valueOf(i);
                    }
                    sb6.append(obj);
                    sb6.append(".timestamp");
                    C37690e eVar = new C37690e();
                    eVar.field_appusername = str;
                    eVar.field_rankID = str5;
                    eVar.field_username = str4;
                    eVar.field_timestamp = Util.getInt(map.get(sb6.toString()), 0);
                    eVar.field_liketips = str6;
                    arrayList.add(eVar);
                    i++;
                }
            }
        }
        return null;
    }
}
