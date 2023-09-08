package vc3;

import android.app.NotificationManager;
import android.content.Context;
import android.text.format.Time;
import bd2.C54451c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86718e;
import p206nj.C11171e;
import p645pj.C77091b;
import p918s2.C90116e;

/* renamed from: vc3.a */
public class C78382a {

    /* renamed from: a */
    public static String f229695a = "";

    /* renamed from: b */
    public static String f229696b = "";

    /* renamed from: c */
    public static String f229697c = "";

    /* renamed from: a */
    public static String m94649a() {
        Class cls = C54451c.class;
        if (Util.isNullOrNil(f229697c)) {
            String string = C86718e.m107552u().getString("login_channel_id", "");
            f229697c = string;
            if (Util.isNullOrNil(string)) {
                ((C54451c) C86312j.m106911c(cls)).mo56286TZ();
            } else if (((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(f229697c) == null) {
                ((C54451c) C86312j.m106911c(cls)).mo56286TZ();
            }
        }
        return f229697c;
    }

    /* renamed from: b */
    public static String m94650b() {
        if (Util.isNullOrNil(f229695a)) {
            f229695a = C86718e.m107552u().getString("message_channel_id", "message_channel_new_id");
        }
        return f229695a;
    }

    /* renamed from: c */
    public static String m94651c() {
        boolean z;
        if (C11171e.m11046c(26)) {
            Time time = new Time();
            time.setToNow();
            if (!C77091b.m93032n(time.hour, time.minute, MMApplicationContext.getContext())) {
                Log.m105928w("MicroMsg.NotificationHelper", "no shake & sound notification during background deactive time");
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "message_dnd_mode_channel_id";
            }
        }
        return m94650b();
    }

    /* renamed from: d */
    public static C90116e.C90121c m94652d(Context context, String str) {
        return new C90116e.C90121c(context, str);
    }
}
