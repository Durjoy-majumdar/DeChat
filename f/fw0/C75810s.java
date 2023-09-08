package fw0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C97625j3;
import f40.C86718e;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p918s2.C90116e;
import vc3.C78382a;

/* renamed from: fw0.s */
public class C75810s implements C11385n {

    /* renamed from: d */
    public static C75810s f222430d;

    /* renamed from: fw0.s$a */
    public class C75811a implements Runnable {
        public C75811a(C75810s sVar) {
        }

        public void run() {
            C86718e.m107550n();
            MMAppMgr.m85988h(true);
        }
    }

    /* renamed from: a */
    public void mo106104a(String str) {
        Map<String, String> parseXml;
        Context context = MMApplicationContext.getContext();
        Intent intent = new Intent(context, LauncherUI.class);
        intent.putExtra("Intro_Notify", true);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        if (!Util.isNullOrNil(str) && str.startsWith("autoauth_errmsg_")) {
            str = str.substring(16);
        }
        if (!Util.isNullOrNil(str) && str.startsWith("<") && (parseXml = XmlParser.parseXml(str, "e", (String) null)) != null && !Util.isNullOrNil(parseXml.get(".e.Content"))) {
            str = parseXml.get(".e.Content");
        }
        C90116e.C90121c cVar = new C90116e.C90121c(context, C78382a.m94651c());
        cVar.mo124383h(str);
        cVar.mo124382g((CharSequence) null);
        cVar.f258795g = PendingIntent.getActivity(context, 0, intent, 268435456);
        Notification b = cVar.mo124378b();
        b.icon = C0966R.C0969drawable.c9k;
        b.flags = 16;
        ((MMNotification) C97625j3.m125816f()).mo93214k(b, true);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 4 && !C97625j3.m125815e().f256815j) {
            if (i2 != -999999) {
                if (i2 != -2023) {
                    if (i2 != -205) {
                        if (i2 == -140) {
                            Log.m105921e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", str);
                            if (!Util.isNullOrNil(str)) {
                                mo106104a(str);
                            } else {
                                mo106104a(MMApplicationContext.getContext().getString(C0966R.string.gme));
                            }
                            C86718e.m107550n();
                            return;
                        } else if (i2 != -100) {
                            if (!(i2 == -72 || i2 == -9 || i2 == -6 || i2 == -311 || i2 == -310)) {
                                if (i2 == -17 || i2 == -16) {
                                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
                                    long j = sharedPreferences.getLong("recomended_update_ignore", -1);
                                    if (j == -1 || Util.secondsToNow(j) >= 86400) {
                                        int i3 = i2 == -17 ? 2 : 1;
                                        Context context = MMApplicationContext.getContext();
                                        Intent intent = new Intent(context, LauncherUI.class);
                                        intent.addFlags(536870912);
                                        intent.addFlags(67108864);
                                        intent.putExtra("nofification_type", "update_nofification");
                                        intent.putExtra("show_update_dialog", true);
                                        intent.putExtra("update_type", i3);
                                        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
                                        C90116e.C90121c cVar = new C90116e.C90121c(context, "reminder_channel_id");
                                        cVar.mo124390o((CharSequence) null);
                                        cVar.f258814z.when = System.currentTimeMillis();
                                        cVar.mo124383h(context.getString(C0966R.string.a3r));
                                        cVar.mo124382g(context.getString(C0966R.string.a29));
                                        cVar.f258795g = activity;
                                        Notification b = cVar.mo124378b();
                                        b.flags |= 16;
                                        ((MMNotification) C97625j3.m125816f()).mo93215l(34, b, false);
                                        sharedPreferences.edit().putLong("recomended_update_ignore", Util.nowSecond()).commit();
                                        C115669n.INSTANCE.idkeyStat(405, 27, 1, true);
                                        return;
                                    }
                                    Log.m105918d("MicroMsg.NewSyncErrorProcessor", "skip update notification, last check=" + j);
                                    return;
                                } else if (!(i2 == -4 || i2 == -3)) {
                                    return;
                                }
                            }
                        }
                    }
                    mo106104a(MMApplicationContext.getContext().getString(C0966R.string.gme));
                    C86718e.m107550n();
                    return;
                }
                mo106104a(MMApplicationContext.getContext().getString(C0966R.string.gmc));
                C86718e.m107550n();
                return;
            }
            new MMHandler().post(new C75811a(this));
        }
    }
}
