package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.iid.zze;
import java.util.Iterator;

@Deprecated
public class GcmListenerService extends zze {
    public static void zzd(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r3.importance == 100) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.String r9 = r9.getAction()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r0 = r9.length()
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "Unknown intent action: "
            r0.concat(r9)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "message_type"
            java.lang.String r1 = r9.getStringExtra(r0)
            java.lang.String r2 = "gcm"
            if (r1 != 0) goto L_0x002b
            r1 = r2
        L_0x002b:
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            r6 = 0
            switch(r4) {
                case -2062414158: goto L_0x0055;
                case 102161: goto L_0x004c;
                case 814694033: goto L_0x0041;
                case 814800675: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x005f
        L_0x0036:
            java.lang.String r2 = "send_event"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            r3 = 3
            goto L_0x005f
        L_0x0041:
            java.lang.String r2 = "send_error"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x004a
            goto L_0x005f
        L_0x004a:
            r3 = 2
            goto L_0x005f
        L_0x004c:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            goto L_0x005f
        L_0x0053:
            r3 = 1
            goto L_0x005f
        L_0x0055:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            java.lang.String r2 = "google.message_id"
            switch(r3) {
                case 0: goto L_0x016a;
                case 1: goto L_0x008e;
                case 2: goto L_0x0078;
                case 3: goto L_0x0070;
                default: goto L_0x0064;
            }
        L_0x0064:
            int r9 = r1.length()
            if (r9 == 0) goto L_0x006f
            java.lang.String r9 = "Received message with unknown type: "
            r9.concat(r1)
        L_0x006f:
            return
        L_0x0070:
            java.lang.String r9 = r9.getStringExtra(r2)
            r8.onMessageSent(r9)
            return
        L_0x0078:
            java.lang.String r0 = r9.getStringExtra(r2)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r9.getStringExtra(r0)
        L_0x0084:
            java.lang.String r1 = "error"
            java.lang.String r9 = r9.getStringExtra(r1)
            r8.onSendError(r0, r9)
            return
        L_0x008e:
            android.os.Bundle r9 = r9.getExtras()
            r9.remove(r0)
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r9.remove(r0)
            java.lang.String r0 = "gcm.n.e"
            java.lang.String r1 = com.google.android.gms.gcm.zzd.zzd(r9, r0)
            java.lang.String r2 = "1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = "gcm.n.icon"
            java.lang.String r1 = com.google.android.gms.gcm.zzd.zzd(r9, r1)
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r1 = 0
            goto L_0x00b4
        L_0x00b3:
            r1 = 1
        L_0x00b4:
            if (r1 == 0) goto L_0x015a
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.inKeyguardRestrictedInputMode()
            if (r1 != 0) goto L_0x00f1
            int r1 = android.os.Process.myPid()
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r8.getSystemService(r2)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            java.util.List r2 = r2.getRunningAppProcesses()
            if (r2 == 0) goto L_0x00f1
            java.util.Iterator r2 = r2.iterator()
        L_0x00da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.pid
            if (r4 != r1) goto L_0x00da
            int r1 = r3.importance
            r2 = 100
            if (r1 != r2) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r5 = 0
        L_0x00f2:
            if (r5 != 0) goto L_0x00fc
            com.google.android.gms.gcm.zzd r0 = com.google.android.gms.gcm.zzd.zzd(r8)
            r0.zze(r9)
            return
        L_0x00fc:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set r2 = r9.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0109:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x013f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r9.getString(r3)
            java.lang.String r5 = "gcm.notification."
            boolean r6 = r3.startsWith(r5)
            java.lang.String r7 = "gcm.n."
            if (r6 == 0) goto L_0x0127
            java.lang.String r3 = r3.replace(r5, r7)
        L_0x0127:
            boolean r5 = r3.startsWith(r7)
            if (r5 == 0) goto L_0x0109
            boolean r5 = r0.equals(r3)
            if (r5 != 0) goto L_0x013b
            r5 = 6
            java.lang.String r3 = r3.substring(r5)
            r1.putString(r3, r4)
        L_0x013b:
            r2.remove()
            goto L_0x0109
        L_0x013f:
            java.lang.String r0 = "sound2"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x014f
            r1.remove(r0)
            java.lang.String r0 = "sound"
            r1.putString(r0, r2)
        L_0x014f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "notification"
            r9.putBundle(r0, r1)
        L_0x015a:
            java.lang.String r0 = "from"
            java.lang.String r1 = r9.getString(r0)
            r9.remove(r0)
            zzd(r9)
            r8.onMessageReceived(r1, r9)
            return
        L_0x016a:
            r8.onDeletedMessages()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.handleIntent(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }
}
