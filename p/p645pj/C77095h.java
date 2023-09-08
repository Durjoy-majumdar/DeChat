package p645pj;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C45629t0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.List;

/* renamed from: pj.h */
public class C77095h {
    /* renamed from: a */
    public static int m93058a(String str) {
        C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        i2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("select sum(");
        sb.append("atCount");
        sb.append(") from ");
        sb.append("rconversation");
        sb.append(" where ");
        sb.append("unReadCount");
        sb.append(" > 0");
        if (!Util.isNullOrNil(str)) {
            sb.append(" and ");
            sb.append("username");
            sb.append(" = '");
            sb.append(str);
            sb.append("'");
        }
        sb.append(" and ");
        sb.append(i2Var.mo69760d0());
        String sb4 = sb.toString();
        int i = 0;
        Log.m105919d("MicroMsg.ConversationStorage", "query sql: %s", sb4);
        Cursor rawQuery = i2Var.f121077c.rawQuery(sb4, (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: b */
    public static int m93059b() {
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.NotificationConfig", "getUnReadMsgCoun, but mmcore not ready");
            return 0;
        }
        List<C45629t0.C45630a> list = C45629t0.f123411a;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ConversationLogic", "get total unread with black list, but has not set uin");
            return 0;
        }
        long currentTicks = Util.currentTicks();
        int i = 0;
        for (C72976h2 G2 : C45629t0.m50819f(1).values()) {
            i += G2.mo108786G2();
        }
        Log.m105925i("MicroMsg.ConversationLogic", "get count %d with black list use %d ms", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
        return i;
    }

    /* renamed from: c */
    public static int m93060c() {
        if (C86709a0.m107522a()) {
            return ((HashMap) C45629t0.m50818e(C45628s0.f123398d)).size();
        }
        Log.m105928w("MicroMsg.NotificationConfig", "getUnReadTalkerCount, but mmcore not ready");
        return 0;
    }

    /* renamed from: d */
    public static boolean m93061d(String str) {
        return C45628s0.m50747L(str) || (C72996z1.m85820U5(str) && !C45628s0.m50739D(str)) || (C72996z1.m85847r5(str) && !C45628s0.m50739D(str));
    }

    /* renamed from: e */
    public static boolean m93062e() {
        return C77091b.m93036r();
    }

    /* renamed from: f */
    public static boolean m93063f(String str) {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 1;
        aVar.f194021a = str;
        voipEvent.publish();
        if (voipEvent.f194020e.f194027a == 2) {
            return true;
        }
        int i = C72963f4.f212661I1;
        return str.equals("voip_content_video");
    }

    /* renamed from: g */
    public static boolean m93064g(String str) {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 1;
        aVar.f194021a = str;
        voipEvent.publish();
        if (voipEvent.f194020e.f194027a == 3) {
            return true;
        }
        int i = C72963f4.f212661I1;
        return str.equals("voip_content_voice");
    }

    /* renamed from: h */
    public static void m93065h(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_shake", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShake: %B", Boolean.valueOf(z));
    }

    /* renamed from: i */
    public static void m93066i(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_voip_scene_shake", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShakeInVoip: %B", Boolean.valueOf(z));
    }

    /* renamed from: k */
    public static void m93067k(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_sound", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSound: %B", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static void m93068l(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_voip_scene_sound", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSoundInVoip: %B", Boolean.valueOf(z));
    }

    /* renamed from: m */
    public static void m93069m(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_new_msg_notification", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveNewMsgNotification: %B", Boolean.valueOf(z));
    }

    /* renamed from: n */
    public static void m93070n(boolean z) {
        C77091b.m93037s().edit().putBoolean("settings_new_voip_msg_notification", z).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveNewVoIPMsgNotification: %B", Boolean.valueOf(z));
    }
}
