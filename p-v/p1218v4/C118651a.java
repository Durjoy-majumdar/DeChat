package p1218v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p1014o4.C117693m;
import p1169a5.C112757a;

/* renamed from: v4.a */
public class C118651a extends C118653c<Boolean> {

    /* renamed from: i */
    public static final String f355041i = C117693m.m165967e("BatteryChrgTracker");

    public C118651a(Context context, C112757a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo183374a() {
        int intExtra;
        Intent registerReceiver = this.f355048b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C117693m.m165966c().mo182390b(f355041i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public IntentFilter mo183375e() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L_0x0026;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183376f(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            o4.m r7 = p1014o4.C117693m.m165966c()
            java.lang.String r0 = f355041i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo182389a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r1 = -1
            goto L_0x0051
        L_0x0028:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r1 = 3
            goto L_0x0051
        L_0x0033:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r1 = 2
            goto L_0x0051
        L_0x003e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0047:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r1 = 0
        L_0x0051:
            switch(r1) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x006c
        L_0x0055:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo183380b(r6)
            goto L_0x006c
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo183380b(r6)
            goto L_0x006c
        L_0x0061:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo183380b(r6)
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo183380b(r6)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1218v4.C118651a.mo183376f(android.content.Context, android.content.Intent):void");
    }
}
