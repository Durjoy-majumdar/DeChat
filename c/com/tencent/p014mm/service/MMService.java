package com.tencent.p014mm.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;

/* renamed from: com.tencent.mm.service.MMService */
public abstract class MMService {

    /* renamed from: d */
    public int f249812d = 0;

    /* renamed from: e */
    public ConcurrentHashMap<String, MMService> f249813e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public Service f249814f;

    /* renamed from: g */
    public Vector<Integer> f249815g = new Vector<>();

    /* renamed from: h */
    public byte f249816h = 0;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        if (r11.equals(com.tencent.xweb.IXWebBroadcastListener.STAGE_START) == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder mo119618a(android.content.Intent r10, java.lang.String r11) {
        /*
            r9 = this;
            byte r0 = r9.f249816h
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            java.lang.String r1 = r9.mo63928b()
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "MicroMsg.MMService"
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r11
            r6 = 2
            r3[r6] = r0
            java.lang.String r0 = "%s callLifeCycle() callType = %s state = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
            r11.getClass()
            int r0 = r11.hashCode()
            r1 = -1
            switch(r0) {
                case -840745386: goto L_0x004b;
                case 3023933: goto L_0x0040;
                case 3540994: goto L_0x0034;
                case 109757538: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r2 = -1
            goto L_0x0056
        L_0x002a:
            java.lang.String r0 = "start"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0056
            goto L_0x0028
        L_0x0034:
            java.lang.String r0 = "stop"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x003e
            goto L_0x0028
        L_0x003e:
            r2 = 2
            goto L_0x0056
        L_0x0040:
            java.lang.String r0 = "bind"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0049
            goto L_0x0028
        L_0x0049:
            r2 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "unbind"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0055
            goto L_0x0028
        L_0x0055:
            r2 = 0
        L_0x0056:
            r11 = 7
            r0 = 13
            java.lang.String r3 = "service_connection"
            r6 = 4
            r7 = 5
            r8 = 0
            switch(r2) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00aa;
                case 2: goto L_0x007a;
                case 3: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            return r8
        L_0x0063:
            byte r11 = r9.f249816h
            r11 = r11 & r7
            if (r11 != 0) goto L_0x006b
            r9.mo112546d()
        L_0x006b:
            int r11 = r9.f249812d
            int r11 = r11 + r4
            r9.f249812d = r11
            r9.mo93615g(r10, r5, r11)
            byte r10 = r9.f249816h
            r10 = r10 | r4
            byte r10 = (byte) r10
            r9.f249816h = r10
            return r8
        L_0x007a:
            byte r10 = r9.f249816h
            if (r10 != r4) goto L_0x008f
            r9.mo112547e()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.MMService> r10 = r9.f249813e
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.remove(r11)
            goto L_0x00a9
        L_0x008f:
            if (r10 != r6) goto L_0x0092
            goto L_0x00a9
        L_0x0092:
            if (r10 != r7) goto L_0x0097
            r9.f249816h = r11
            goto L_0x00a9
        L_0x0097:
            if (r10 != r0) goto L_0x00a9
            r9.mo112547e()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.MMService> r10 = r9.f249813e
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.remove(r11)
        L_0x00a9:
            return r8
        L_0x00aa:
            int r11 = r10.getIntExtra(r3, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.Vector<java.lang.Integer> r0 = r9.f249815g
            boolean r0 = r0.contains(r11)
            if (r0 != 0) goto L_0x00d2
            java.util.Vector<java.lang.Integer> r0 = r9.f249815g
            r0.add(r11)
            byte r11 = r9.f249816h
            r11 = r11 & r7
            if (r11 != 0) goto L_0x00c7
            r9.mo112546d()
        L_0x00c7:
            byte r11 = r9.f249816h
            r11 = r11 | r6
            byte r11 = (byte) r11
            r9.f249816h = r11
            android.os.IBinder r10 = r9.mo93614c(r10)
            return r10
        L_0x00d2:
            return r8
        L_0x00d3:
            int r1 = r10.getIntExtra(r3, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Vector<java.lang.Integer> r2 = r9.f249815g
            r2.remove(r1)
            byte r1 = r9.f249816h
            if (r1 != r4) goto L_0x00e5
            goto L_0x0118
        L_0x00e5:
            if (r1 != r6) goto L_0x00fb
            r9.mo119619h(r10)
            r9.mo112547e()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.MMService> r10 = r9.f249813e
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.remove(r11)
            goto L_0x0118
        L_0x00fb:
            if (r1 != r7) goto L_0x0103
            r9.f249816h = r0
            r9.mo119619h(r10)
            goto L_0x0118
        L_0x0103:
            if (r1 != r11) goto L_0x0118
            r9.mo119619h(r10)
            r9.mo112547e()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.MMService> r10 = r9.f249813e
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.remove(r11)
        L_0x0118:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.service.MMService.mo119618a(android.content.Intent, java.lang.String):android.os.IBinder");
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.MMService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        Log.m105925i(mo63928b(), "%s onBind()", "MicroMsg.MMService");
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105925i(mo63928b(), "%s onCreate()", "MicroMsg.MMService");
    }

    /* renamed from: e */
    public void mo112547e() {
        Log.m105925i(mo63928b(), "%s onDestroy()", "MicroMsg.MMService");
    }

    @Deprecated
    /* renamed from: f */
    public void mo112549f(Intent intent, int i) {
        Log.m105925i(mo63928b(), "%s onStart()", "MicroMsg.MMService");
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Log.m105925i(mo63928b(), "%s onStartCommand()", "MicroMsg.MMService");
        mo112549f(intent, i2);
        return 0;
    }

    /* renamed from: h */
    public boolean mo119619h(Intent intent) {
        Log.m105925i(mo63928b(), "%s onUnbind()", "MicroMsg.MMService");
        return false;
    }

    /* renamed from: i */
    public void mo119620i(Intent intent) {
        Service service = this.f249814f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Service service2 = service;
        C117292a.m165358d(service2, aVar.mo10232b(), "com/tencent/mm/service/MMService", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        service.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(service2, "com/tencent/mm/service/MMService", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void stopSelf() {
        Log.m105925i(mo63928b(), "%s stopSelf()", "MicroMsg.MMService");
        mo119618a(new Intent(), "stop");
    }
}
