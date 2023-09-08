package ww2;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.tencent.p014mm.autogen.events.VoiceReminderRemindEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.subapp.p109ui.voicereminder.RemindDialog;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75601x2;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C9556a;
import p645pj.C77091b;
import uw2.C78291e;
import uw2.C78294g;

/* renamed from: ww2.f */
public class C78734f extends IStaticListener<VoiceReminderRemindEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        VoiceReminderRemindEvent voiceReminderRemindEvent = (VoiceReminderRemindEvent) iEvent;
        C78294g a = C78294g.m94582a(voiceReminderRemindEvent.f194010d.f194011a);
        C72963f4 f4Var = voiceReminderRemindEvent.f194010d.f194013c;
        if (a != null) {
            C78291e vx02 = C78291e.vx0();
            String t = f4Var.mo108768t();
            String str2 = voiceReminderRemindEvent.f194010d.f194012b;
            String h = C72715f.m85115h(MMApplicationContext.getContext(), a.f229341a);
            if (h == null || h.length() <= 0) {
                str = "";
            } else {
                String[] split = h.split(";");
                str = "" + split[0];
                if (split.length > 1) {
                    str = str + split[1];
                }
            }
            if (str2 != null) {
                str = str + str2;
            }
            long createTime = f4Var.getCreateTime();
            vx02.getClass();
            Context context = MMApplicationContext.getContext();
            if (context == null) {
                Log.m105918d("MicroMsg.SubCoreVoiceRemind", "notifyVoiceRemind context null");
            } else {
                try {
                    boolean h2 = C77091b.m93026h();
                    boolean b = C77091b.m93020b();
                    Log.m105918d("MicroMsg.SubCoreVoiceRemind", "shake " + h2 + "sound " + b);
                    if (!C72996z1.m85803I5(((MMNotification) C97625j3.m125816f()).f194715b)) {
                        if (h2) {
                            Util.shake(context, true);
                        }
                        if (b) {
                            Pair<Boolean, String> t2 = C77091b.m93038t();
                            vx02.zx0(context, (String) t2.second, ((Boolean) t2.first).booleanValue());
                        }
                    } else if (h2) {
                        Util.shake(context, true);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e, "", new Object[0]);
                }
                Set<C75601x2> set = vx02.f229339h;
                if (set == null || ((HashSet) set).size() == 0) {
                    List<String> list = RemindDialog.f206371i;
                    Class<RemindDialog> cls = RemindDialog.class;
                    Log.m105918d("MicroMsg.RemindDialog", "show " + RemindDialog.f206372j + " remind " + str);
                    if (RemindDialog.f206372j) {
                        ((ArrayList) RemindDialog.f206371i).add(str);
                    } else {
                        ((ArrayList) RemindDialog.f206371i).clear();
                        RemindDialog.f206372j = true;
                        if (C97625j3.m125815e().f256815j) {
                            Intent intent = new Intent(context, cls);
                            intent.putExtra("_RemindDialog_User", t);
                            intent.putExtra("_RemindDialog_Remind", str);
                            intent.setFlags(603979776);
                            intent.addFlags(268435456);
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            Context context2 = context;
                            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context2.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(context2, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else {
                            Context context3 = context;
                            Intent intent2 = new Intent(context3, cls);
                            intent2.putExtra("_RemindDialog_User", t);
                            intent2.putExtra("_RemindDialog_Remind", str);
                            intent2.setFlags(604012544);
                            intent2.addFlags(268435456);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent2);
                            Context context4 = context3;
                            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context3.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(context4, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                } else {
                    Iterator it = ((HashSet) vx02.f229339h).iterator();
                    while (it.hasNext()) {
                        ((C75601x2) it.next()).mo98148a(str, createTime);
                    }
                }
            }
        }
        return false;
    }
}
