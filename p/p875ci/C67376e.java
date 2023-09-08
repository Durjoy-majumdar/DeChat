package p875ci;

import android.content.Context;
import android.media.AudioManager;
import android.text.format.Time;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Set;
import p645pj.C77091b;
import p645pj.C77095h;

/* renamed from: ci.e */
public class C67376e {

    /* renamed from: b */
    public static final Set<String> f193236b;

    /* renamed from: c */
    public static final Time f193237c = new Time();

    /* renamed from: a */
    public boolean f193238a;

    static {
        HashSet hashSet = new HashSet();
        f193236b = hashSet;
        hashSet.add("readerapp");
        hashSet.add("blogapp");
        hashSet.add("newsapp");
    }

    /* renamed from: e */
    public static boolean m79725e(Context context) {
        boolean h = C77091b.m93026h();
        int ringerMode = ((AudioManager) MMApplicationContext.getContext().getSystemService("audio")).getRingerMode();
        if (ringerMode == 0) {
            h = false;
        }
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is Shake Mode: %B, System AudioManager Mode: %d", Boolean.valueOf(h), Integer.valueOf(ringerMode));
        return h;
    }

    /* renamed from: g */
    public static boolean m79726g() {
        Time time = f193237c;
        time.setToNow();
        if (C77091b.m93032n(time.hour, time.minute, MMApplicationContext.getContext())) {
            return false;
        }
        Log.m105928w("MicroMsg.Notification.Silent.Handle", "no shake & sound notification during background deactive time");
        return true;
    }

    /* renamed from: h */
    public static boolean m79727h(Context context) {
        boolean b = C77091b.m93020b();
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is Sound Mode: %B", Boolean.valueOf(b));
        return b;
    }

    /* renamed from: a */
    public final boolean mo91512a(boolean[] zArr, boolean z) {
        boolean z2 = !z;
        zArr[0] = zArr[0] & z;
        zArr[1] = z & zArr[1];
        return z2;
    }

    /* renamed from: b */
    public final boolean mo91513b(String str) {
        if (MMEntryLock.isLocked("keep_chatting_silent" + str)) {
            Log.m105924i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: FALSE");
            return true;
        }
        Log.m105924i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: TRUE");
        return false;
    }

    /* renamed from: c */
    public boolean mo91514c(String str, C72963f4 f4Var) {
        boolean z;
        if (C77095h.m93061d(str)) {
            if (!(f4Var == null ? false : f4Var.mo100966E3(C75592q0.m90789s()))) {
                z = true;
                Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", Boolean.valueOf(!z));
                return z;
            }
        }
        z = false;
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", Boolean.valueOf(!z));
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] mo91515d(android.content.Context r12, com.tencent.p014mm.storage.C72963f4 r13, int r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18, long r19) {
        /*
            r11 = this;
            r1 = r11
            r2 = r16
            r3 = 2
            boolean[] r4 = new boolean[r3]
            r4 = {1, 1} // fill-array
            boolean r0 = m79727h(r12)
            boolean r5 = m79725e(r12)
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0019
            if (r5 != 0) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            boolean r9 = r4[r7]
            r0 = r0 & r9
            r4[r7] = r0
            boolean r0 = r4[r6]
            r0 = r0 & r5
            r4[r6] = r0
            java.lang.String r5 = "MicroMsg.Notification.Silent.Handle"
            if (r8 == 0) goto L_0x002a
            goto L_0x010e
        L_0x002a:
            boolean r0 = m79726g()
            r0 = r0 ^ r6
            boolean r0 = r11.mo91512a(r4, r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x010e
        L_0x0037:
            boolean r0 = r11.mo91516f(r2)
            r0 = r0 ^ r6
            boolean r0 = r11.mo91512a(r4, r0)
            if (r0 == 0) goto L_0x0044
            goto L_0x010e
        L_0x0044:
            r0 = r17 & 2
            if (r0 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r9[r7] = r10
            java.lang.String r10 = "check is Service Request Sound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            if (r0 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r9[r7] = r10
            java.lang.String r10 = "check is Service Request Shake: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            if (r8 != 0) goto L_0x0070
            if (r0 != 0) goto L_0x0070
            r9 = 1
            goto L_0x0071
        L_0x0070:
            r9 = 0
        L_0x0071:
            boolean r10 = r4[r7]
            r8 = r8 & r10
            r4[r7] = r8
            boolean r8 = r4[r6]
            r0 = r0 & r8
            r4[r6] = r0
            if (r9 == 0) goto L_0x007f
            goto L_0x010e
        L_0x007f:
            r0 = r18
            r8 = r19
            boolean r0 = r11.mo91519k(r2, r0, r8)
            r0 = r0 ^ r6
            boolean r0 = r11.mo91512a(r4, r0)
            if (r0 == 0) goto L_0x0090
            goto L_0x010e
        L_0x0090:
            r0 = r13
            boolean r0 = r11.mo91514c(r2, r13)
            r0 = r0 ^ r6
            boolean r0 = r11.mo91512a(r4, r0)
            if (r0 == 0) goto L_0x009e
            goto L_0x010e
        L_0x009e:
            r0 = 28
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = com.tencent.p014mm.sdk.vendor.MIUI.ifMIUI()
            if (r0 != 0) goto L_0x00e4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "notification"
            java.lang.Object r0 = r0.getSystemService(r8)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r8 = r0.getCurrentInterruptionFilter()
            if (r8 != r3) goto L_0x00e4
            java.lang.String r8 = vc3.C78382a.m94651c()     // Catch:{ Exception -> 0x00cc }
            android.app.NotificationChannel r0 = r0.getNotificationChannel(r8)     // Catch:{ Exception -> 0x00cc }
            boolean r0 = r0.canBypassDnd()     // Catch:{ Exception -> 0x00cc }
            r0 = r0 ^ r6
            goto L_0x00e5
        L_0x00cc:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Class r9 = r0.getClass()
            java.lang.String r9 = r9.getSimpleName()
            r8[r7] = r9
            java.lang.String r0 = r0.getMessage()
            r8[r6] = r0
            java.lang.String r0 = "isSystemDoNotDisturb Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r8)
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            r0 = r0 ^ r6
            boolean r0 = r11.mo91512a(r4, r0)
            if (r0 == 0) goto L_0x00ed
            goto L_0x010e
        L_0x00ed:
            boolean r0 = r4[r7]
            if (r0 == 0) goto L_0x00f9
            boolean r2 = r11.mo91513b(r2)
            r2 = r2 ^ r6
            r0 = r0 & r2
            r4[r7] = r0
        L_0x00f9:
            boolean r0 = r4[r7]
            if (r0 == 0) goto L_0x0106
            r2 = r14
            r8 = r15
            boolean r2 = r11.mo91518j(r14, r15)
            r0 = r0 & r2
            r4[r7] = r0
        L_0x0106:
            boolean r0 = r11.mo91517i()
            r0 = r0 ^ r6
            r11.mo91512a(r4, r0)
        L_0x010e:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r2 = r4[r7]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r7] = r2
            boolean r2 = r4[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r6] = r2
            java.lang.String r2 = "finally silent, sound: %B, shake: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p875ci.C67376e.mo91515d(android.content.Context, com.tencent.mm.storage.f4, int, java.lang.String, java.lang.String, int, boolean, long):boolean[]");
    }

    /* renamed from: f */
    public boolean mo91516f(String str) {
        boolean contains = ((HashSet) f193236b).contains(str);
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is NOT Siler User: %B", Boolean.valueOf(!contains));
        return contains;
    }

    /* renamed from: i */
    public boolean mo91517i() {
        boolean z;
        try {
            VoipEvent voipEvent = new VoipEvent();
            voipEvent.f194019d.f194022b = 2;
            voipEvent.publish();
            z = voipEvent.f194020e.f194028b;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Notification.Silent.Handle", e, "", new Object[0]);
            z = false;
        }
        Log.m105919d("MicroMsg.Notification.Silent.Handle", "check is Voip NOT Calling: %B", Boolean.valueOf(!z));
        return z;
    }

    /* renamed from: j */
    public boolean mo91518j(int i, String str) {
        boolean z;
        if (i == 50 || i == 53) {
            if (C77095h.m93063f(str)) {
                z = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(73217, Boolean.TRUE)).booleanValue();
            } else if (C77095h.m93064g(str)) {
                z = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(73218, Boolean.TRUE)).booleanValue();
            }
            Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", Boolean.valueOf(z));
            return z;
        }
        z = true;
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: k */
    public boolean mo91519k(String str, boolean z, long j) {
        this.f193238a = false;
        if (MMEntryLock.isLocked("keep_app_silent")) {
            this.f193238a = true;
        } else if (j <= 0) {
            this.f193238a = false;
        } else if (System.currentTimeMillis() > j && System.currentTimeMillis() < j + FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            this.f193238a = z;
        }
        Log.m105925i("MicroMsg.Notification.Silent.Handle", "check Refresh Keep is NOT Silent: %B", Boolean.valueOf(!this.f193238a));
        return this.f193238a;
    }
}
