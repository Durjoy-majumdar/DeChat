package p222qm;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.KickOfflineEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.p136ui.C6768c2;
import com.tencent.p014mm.p136ui.C6974d2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: qm.n0 */
public class C35963n0 extends IStaticListener<KickOfflineEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        C80610p1 p1Var = C80610p1.f235824f;
        KickOfflineEvent.C28767a aVar = ((KickOfflineEvent) iEvent).f78847d;
        String str = aVar.f78848a;
        String str2 = aVar.f78849b;
        Log.m105925i("MicroMsg.WorkerProfile", "summertoken KickOffline callback wording[%s], url[%s]", str, str2);
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(322, 21, 1, true);
        LauncherUI instance = LauncherUI.getInstance();
        Object[] objArr = new Object[2];
        objArr[0] = 4021;
        Object[] objArr2 = new Object[3];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = Boolean.valueOf(instance == null || instance.isFinishing());
        objArr[1] = String.format("%s|%s|%b", objArr2);
        nVar.mo160131h(11098, objArr);
        if (instance == null || instance.isFinishing()) {
            String str3 = "%s|%s|%b";
            nVar.idkeyStat(322, 22, 1, true);
            Object[] objArr3 = new Object[2];
            objArr3[0] = 4022;
            Object[] objArr4 = new Object[3];
            objArr4[0] = str;
            z = true;
            objArr4[1] = str2;
            objArr4[2] = Boolean.valueOf(instance == null);
            objArr3[1] = String.format(str3, objArr4);
            nVar.mo160131h(11098, objArr3);
            Log.m105929w("MicroMsg.WorkerProfile", "summertoken KickOffline error LauncherUI is null launcherisFirst[%b], launcheruiOnTop[%b] return", Boolean.valueOf(C80610p1.f235825g), Boolean.valueOf(C80610p1.f235826h));
        } else {
            z = true;
        }
        Intent addFlags = new Intent().setClass(instance, LauncherUI.class).putExtra("Intro_Switch", z).putExtra("animation_pop_in", z).addFlags(67108864);
        LogoutEvent logoutEvent = new LogoutEvent();
        LogoutEvent.C28774a aVar2 = logoutEvent.f78863d;
        aVar2.getClass();
        aVar2.f78864a = z ? 1 : 0;
        logoutEvent.publish();
        C76879j.m92719M(instance, str, instance.getString(C0966R.string.a3h), new C6768c2(str2, instance, addFlags), new C6974d2(str2, instance, addFlags));
        return false;
    }
}
