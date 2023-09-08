package gm3;

import android.app.ActivityManager;
import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingHeaderPreference;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.List;
import p212oe.b$$f;
import p981ie.C117187w;
import p981ie.C87705i;

public final /* synthetic */ class b$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ MatrixSettingHeaderPreference.C85918b f350536a;

    /* renamed from: b */
    public final /* synthetic */ StringBuilder f350537b;

    public /* synthetic */ b$$a(MatrixSettingHeaderPreference.C85918b bVar, StringBuilder sb) {
        this.f350536a = bVar;
        this.f350537b = sb;
    }

    public final void accept(Object obj) {
        MatrixSettingHeaderPreference.C85918b bVar = this.f350536a;
        StringBuilder sb = this.f350537b;
        C114451e eVar = (C114451e) obj;
        bVar.getClass();
        StringBuilder sb4 = new StringBuilder(String.valueOf(Process.myPid()));
        ActivityManager activityManager = (ActivityManager) MatrixSettingHeaderPreference.this.f121274d.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null) {
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.processName.contains(MatrixSettingHeaderPreference.this.f121274d.getPackageName()) && !sb4.toString().contains(String.valueOf(next.pid))) {
                    sb4.append("|");
                    sb4.append(next.pid);
                }
            }
        }
        sb.append("[bat.pids  ] ");
        sb.append(sb4);
        sb.append("\n");
        C114451e.C114458h i = eVar.mo173652i(0);
        sb.append("[bat.dice  ] ");
        sb.append(b$$f.m166058c() ? 1 : 0);
        sb.append("\n");
        sb.append("[bat.uptime] ");
        sb.append(i.f343144d.f343211a);
        sb.append("\n");
        sb.append("[bat.fg    ] ");
        sb.append(i.f343145e.f343211a);
        sb.append("\n");
        sb.append("[bat.bg    ] ");
        sb.append(i.f343146f.f343211a);
        sb.append("\n");
        sb.append("[bat.fgSrv ] ");
        sb.append(i.f343147g.f343211a);
        sb.append("\n");
        List<C117187w.C117192d.C117193a> list = eVar.mo173653j(0).f351075b;
        int i2 = 0;
        List<C117187w.C117192d.C117193a> subList = list.subList(0, Math.min(list.size(), 3));
        while (i2 < subList.size()) {
            C117187w.C117192d.C117193a aVar = subList.get(i2);
            sb.append("[bat.uiTop");
            i2++;
            sb.append(i2);
            sb.append("] ");
            sb.append(aVar.f351077a);
            sb.append("/");
            sb.append(aVar.f351078b);
            sb.append("\n");
        }
    }
}
