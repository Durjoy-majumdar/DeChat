package com.tencent.p014mm.plugin.crashfix.patch.killself;

import c31.C79925c;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KillSelfEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.plugin.crashfix.patch.killself.KillSelfMonitor */
public class KillSelfMonitor implements C79925c {

    /* renamed from: a */
    public boolean f345770a = false;

    /* renamed from: b */
    public final String[] f345771b = {"com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.app.WorkerProfile$", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI"};

    /* renamed from: com.tencent.mm.plugin.crashfix.patch.killself.KillSelfMonitor$a */
    public class C115371a implements C114668z {
        public C115371a() {
        }

        public void onAppBackground(String str) {
            KillSelfMonitor.this.f345770a = false;
        }

        public void onAppForeground(String str) {
            KillSelfMonitor.this.f345770a = true;
        }
    }

    /* renamed from: a */
    public boolean mo58760a(int i) {
        return true;
    }

    /* renamed from: d */
    public boolean mo58763d() {
        AppForegroundDelegate.INSTANCE.mo174208a(new C115371a());
        new IListener<KillSelfEvent>(C40008f.f107254d) {
            {
                this.__eventId = 337694912;
            }

            public boolean callback(IEvent iEvent) {
                boolean z;
                if (((KillSelfEvent) iEvent).f343568d.f343569a != 0) {
                    return false;
                }
                if (KillSelfMonitor.this.f345770a) {
                    C115669n.INSTANCE.idkeyStat(1453, 0, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(1453, 1, 1, false);
                }
                Log.m105920e("MicroMsg.KillSelfMonitor", "killSelf!" + KillSelfMonitor.this.f345770a);
                String str = "";
                for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
                    str = str + stackTraceElement.toString() + "\n";
                }
                Log.m105920e("MicroMsg.KillSelfMonitor", "stack:" + str);
                String[] strArr = KillSelfMonitor.this.f345771b;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (str.contains(strArr[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_killself_report, false)) {
                    C115669n.INSTANCE.mo160131h(20683, MMApplicationContext.getProcessName(), str, Integer.valueOf(KillSelfMonitor.this.f345770a ? 1 : -1));
                }
                return true;
            }
        }.alive();
        return true;
    }
}
