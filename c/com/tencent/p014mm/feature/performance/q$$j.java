package com.tencent.p014mm.feature.performance;

import android.content.IntentFilter;
import com.tencent.p014mm.plugin.performance.elf.MainProcessChecker;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ge2.C32426b;
import h81.C32735h;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.feature.performance.q$$j */
public class q$$j implements Runnable {
    public q$$j(C80864q qVar) {
    }

    public void run() {
        MainProcessChecker mainProcessChecker = (MainProcessChecker) C32426b.m39718a(MainProcessChecker.class);
        mainProcessChecker.getClass();
        Class cls = C32735h.class;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_ELF_CHECK");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        MMApplicationContext.getContext().registerReceiver(mainProcessChecker, intentFilter);
        try {
            if (C86312j.m106911c(cls) == null) {
                Log.m105928w("MicroMsg.MainProcessChecker", "IExptService is null!");
                return;
            }
            mainProcessChecker.f248571w = C87203t.m108279o();
            mainProcessChecker.f248555g = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_native, mainProcessChecker.f248554f);
            mainProcessChecker.f248557i = ((float) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_process_vm, mainProcessChecker.f248556h)) * 0.01f;
            mainProcessChecker.f248559k = ((float) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_process_java, mainProcessChecker.f248558j)) * 0.01f;
            long[] jArr = MainProcessChecker.f248550y;
            jArr[0] = (long) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_process_work_begin, 0);
            jArr[1] = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_work_end, 86400000);
            mainProcessChecker.f248552d = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_traffic_per_min, 1048576);
            mainProcessChecker.f248553e = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_jiffy_per_min, 6000);
            mainProcessChecker.f248561m = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_process_is_hard_mode, true);
            mainProcessChecker.f248562n = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_process_is_check_launcher_ui, false);
            mainProcessChecker.f248569u = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_check_time, 1200000);
            StringBuilder sb = mainProcessChecker.f248570v;
            sb.append(" \n");
            sb.append("***************ProcessElf Config****************");
            sb.append("\n");
            sb.append("| ");
            sb.append("is64BitRuntime:");
            sb.append(mainProcessChecker.f248571w);
            sb.append("\n");
            sb.append("| ");
            sb.append("isHardMode:");
            sb.append(mainProcessChecker.f248561m);
            sb.append("\n");
            sb.append("| ");
            sb.append("workTime:");
            sb.append(jArr[0]);
            sb.append("-");
            sb.append(jArr[1]);
            sb.append(LocaleUtil.MALAY);
            sb.append("\n");
            sb.append("| ");
            sb.append("NATIVE_SIZE:");
            sb.append(mainProcessChecker.f248555g);
            sb.append("B");
            sb.append("\n");
            sb.append("| ");
            sb.append("MEMORY_VM_TOP:");
            sb.append(mainProcessChecker.f248557i);
            sb.append("%");
            sb.append("\n");
            sb.append("| ");
            sb.append("MEMORY_JAVA_TOP:");
            sb.append(mainProcessChecker.f248559k);
            sb.append("%");
            sb.append("\n");
            sb.append("| ");
            sb.append("TRAFFIC_PER_MIN:");
            sb.append(mainProcessChecker.f248552d);
            sb.append("B");
            sb.append("\n");
            sb.append("| ");
            sb.append("JIFFIES_PER_MIN:");
            sb.append(mainProcessChecker.f248553e);
            sb.append("jiffy");
            sb.append("\n");
            sb.append("| ");
            sb.append("CHECK_TIME:");
            sb.append(mainProcessChecker.f248569u);
            sb.append(LocaleUtil.MALAY);
            sb.append("\n");
            sb.append("************************************************");
            sb.append("\n");
            Log.m105924i("MicroMsg.MainProcessChecker", mainProcessChecker.f248570v.toString());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MainProcessChecker", "[resetConfig] ERROR!!! %s", e);
        }
    }
}
