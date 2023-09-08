package eb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import p645pj.C77091b;

/* renamed from: eb0.h3 */
public class C75583h3 {
    /* renamed from: a */
    public static void m90714a(int i) {
        boolean p = C77091b.m93034p();
        boolean q = C77091b.m93035q();
        boolean a = C77091b.m93019a();
        boolean b = C77091b.m93020b();
        boolean h = C77091b.m93026h();
        boolean o = C77091b.m93033o();
        int i2 = C77091b.m93037s().getInt("settings_active_begin_time_hour", 8);
        int i3 = C77091b.m93037s().getInt("settings_active_begin_time_min", 0);
        int i4 = C77091b.m93037s().getInt("settings_active_end_time_hour", 23);
        int i5 = C77091b.m93037s().getInt("settings_active_end_time_min", 0);
        C86709a0.m107528h();
        C85801v1 i6 = C86709a0.m107535s().mo121142i();
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) i6.mo119684e(73217, bool)).booleanValue();
        C86709a0.m107528h();
        boolean booleanValue2 = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(73218, bool)).booleanValue();
        boolean z = booleanValue || booleanValue2;
        Log.m105925i("MicroMsg.KvNotificationStat", "doStatNotification, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, isNotificationShowDetail: %s, isNotificationSound: %s, isNotificationShake: %s, isActiveSilentTime: %s, activeBegin: %s, activeEnd: %s, scene: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", Boolean.valueOf(p), Boolean.valueOf(q), Boolean.valueOf(a), Boolean.valueOf(b), Boolean.valueOf(h), Boolean.valueOf(o), m90716c(i2) + m90716c(i3), m90716c(i4) + m90716c(i5), Integer.valueOf(i), Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2), Boolean.valueOf(z));
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[10];
        objArr[0] = Integer.valueOf(p ? 1 : 2);
        objArr[1] = Integer.valueOf(q ? 1 : 2);
        objArr[2] = Integer.valueOf(a ? 1 : 2);
        objArr[3] = Integer.valueOf(b ? 1 : 2);
        objArr[4] = Integer.valueOf(h ? 1 : 2);
        objArr[5] = Integer.valueOf(o ? 2 : 1);
        objArr[6] = m90716c(i4) + m90716c(i5);
        objArr[7] = m90716c(i2) + m90716c(i3);
        objArr[8] = Integer.valueOf(i);
        objArr[9] = Integer.valueOf(z ? 1 : 2);
        nVar.mo160131h(15308, objArr);
    }

    /* renamed from: b */
    public static void m90715b(boolean z, boolean z2) {
        boolean p = C77091b.m93034p();
        boolean q = C77091b.m93035q();
        C86709a0.m107528h();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) i.mo119684e(73217, bool)).booleanValue();
        C86709a0.m107528h();
        boolean booleanValue2 = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(73218, bool)).booleanValue();
        int i2 = 1;
        boolean z3 = booleanValue || booleanValue2;
        Log.m105925i("MicroMsg.KvNotificationStat", "doStatSysNotificationAfterModify, switchNewMsg: %s, switchVoipInvite: %s, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(p), Boolean.valueOf(q), Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2), Boolean.valueOf(z3));
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        objArr[0] = Integer.valueOf(p ? 1 : 0);
        objArr[1] = Integer.valueOf(q ? 1 : 0);
        objArr[2] = Integer.valueOf(z3 ? 1 : 0);
        objArr[3] = 0;
        objArr[4] = Integer.valueOf(z ? p ? 2 : 1 : 0);
        if (!z2) {
            i2 = 0;
        } else if (q) {
            i2 = 2;
        }
        objArr[5] = Integer.valueOf(i2);
        objArr[6] = 0;
        objArr[7] = 0;
        nVar.mo160131h(14852, objArr);
    }

    /* renamed from: c */
    public static String m90716c(int i) {
        if (i > 10) {
            return i + "";
        }
        return "0" + i;
    }
}
