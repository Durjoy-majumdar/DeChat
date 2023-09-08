package pe2;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;
import yc3.C38992a;

/* renamed from: pe2.d */
public class C100784d implements C38992a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            java.lang.Class<ke2.c> r5 = ke2.C99129c.class
            int r6 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            r7 = 0
            r8 = 1
            if (r6 <= r8) goto L_0x0015
            return r7
        L_0x0015:
            int r6 = r2.length
            r9 = 2
            if (r6 >= r9) goto L_0x001a
            return r8
        L_0x001a:
            r6 = r2[r8]
            r6.getClass()
            r10 = -1
            int r11 = r6.hashCode()
            java.lang.String r12 = "deletedb"
            java.lang.String r13 = "copydb"
            r14 = 4
            r15 = 3
            switch(r11) {
                case -1796087539: goto L_0x0057;
                case -1424659792: goto L_0x004c;
                case -1354714445: goto L_0x0043;
                case 66125101: goto L_0x0037;
                case 819712873: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0062
        L_0x002e:
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x0035
            goto L_0x0062
        L_0x0035:
            r10 = 4
            goto L_0x0062
        L_0x0037:
            java.lang.String r11 = "outlimit"
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x0041
            goto L_0x0062
        L_0x0041:
            r10 = 3
            goto L_0x0062
        L_0x0043:
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            r10 = 2
            goto L_0x0062
        L_0x004c:
            java.lang.String r11 = "enabledebug"
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x0055
            goto L_0x0062
        L_0x0055:
            r10 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r11 = "printrate"
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            java.lang.String r6 = "MicroMsgPriority.db"
            java.lang.String r11 = "MicroMsg.Priority.PriorityCommand"
            switch(r10) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0119;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00d0;
                case 4: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x02a0
        L_0x006b:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            java.lang.String r2 = r2.f251807e
            r1.<init>((java.lang.String) r2, (java.lang.String) r6)
            java.lang.String r1 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            int r1 = android.os.Process.myPid()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/priority/model/PriorityCommand"
            java.lang.String r12 = "processCommand"
            java.lang.String r13 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r14 = "android/os/Process_EXEC_"
            java.lang.String r15 = "killProcess"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.os.Process.killProcess(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/priority/model/PriorityCommand"
            java.lang.String r11 = "processCommand"
            java.lang.String r12 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r13 = "android/os/Process_EXEC_"
            java.lang.String r14 = "killProcess"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x02a0
        L_0x00d0:
            r1 = r2[r9]     // Catch:{ Exception -> 0x02a0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x02a0 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r3 = "currentCount %d"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02a0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x02a0 }
            r4[r7] = r5     // Catch:{ Exception -> 0x02a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r4)     // Catch:{ Exception -> 0x02a0 }
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x02a0 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ Exception -> 0x02a0 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG     // Catch:{ Exception -> 0x02a0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x02a0 }
            r3.mo119677K(r4, r1)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x02a0
        L_0x00fa:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            java.lang.String r2 = r2.f251807e
            r1.<init>((java.lang.String) r2, (java.lang.String) r6)
            java.lang.String r1 = r1.mo119971i()
            java.lang.String r2 = "/sdcard/tencent/MicroMsg/Download/priority.db"
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r2)
            goto L_0x02a0
        L_0x0119:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r3 = r2[r9]
            r1[r7] = r3
            java.lang.String r3 = "enabledebug %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r1)
            r1 = r2[r9]     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r2 = "1"
            r1.equals(r2)     // Catch:{ Exception -> 0x02a0 }
            goto L_0x02a0
        L_0x012d:
            int r6 = r2.length
            java.lang.String r10 = "printrate %s"
            if (r6 <= r9) goto L_0x0189
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r22)
            if (r6 == 0) goto L_0x0189
            di3.d r5 = di3.C86312j.m106911c(r5)
            ke2.c r5 = (ke2.C99129c) r5
            r5.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r5 = r5.f290663p
            r6 = r2[r9]
            double[] r3 = r5.mo140561d(r3, r6)
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = r2[r9]
            r5[r7] = r6
            di3.d r4 = di3.C86312j.m106911c(r4)
            d62.i r4 = (d62.C75339i) r4
            r2 = r2[r9]
            java.lang.String r2 = r4.getDisplayName(r2)
            r5[r8] = r2
            r12 = r3[r7]
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            r5[r9] = r2
            r12 = r3[r8]
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            r5[r15] = r2
            r2 = r3[r9]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5[r14] = r2
            java.lang.String r2 = "%s\n%s\n DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r3)
            r0.mo140218b(r1, r2)
            goto L_0x02a0
        L_0x0189:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r22)
            if (r6 == 0) goto L_0x0260
            di3.d r6 = di3.C86312j.m106911c(r5)
            ke2.c r6 = (ke2.C99129c) r6
            r6.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r6 = r6.f290663p
            java.lang.String r12 = "@all"
            double[] r6 = r6.mo140561d(r3, r12)
            di3.d r5 = di3.C86312j.m106911c(r5)
            ke2.c r5 = (ke2.C99129c) r5
            r5.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r5 = r5.f290663p
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r5.getClass()
            java.lang.String r16 = "C2CMsgImgUsage"
            r13[r7] = r16
            r13[r8] = r12
            java.lang.String r12 = "SELECT *, max(monthreceivecount) FROM %s WHERE chat = ? AND talker <> '%s' GROUP BY chat, talker;"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            pe2.e r13 = r5.f296007a
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r7] = r3
            android.database.Cursor r3 = r13.mo140226h(r12, r15)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            r12.<init>(r13)
        L_0x01d2:
            boolean r13 = r3.moveToNext()
            if (r13 == 0) goto L_0x01e0
            te3.st3 r13 = r5.mo140559b(r3)
            r12.add(r13)
            goto L_0x01d2
        L_0x01e0:
            r3.close()
            qe2.a r3 = new qe2.a
            r3.<init>(r5)
            java.util.Collections.sort(r12, r3)
            java.util.Iterator r3 = r12.iterator()
        L_0x01ef:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x026f
            java.lang.Object r5 = r3.next()
            te3.st3 r5 = (te3.C101843st3) r5
            java.lang.String r12 = "\n"
            r2.append(r12)
            di3.d r12 = di3.C86312j.m106911c(r4)
            d62.i r12 = (d62.C75339i) r12
            java.lang.String r13 = r5.f299455e
            java.lang.String r12 = r12.getDisplayName(r13)
            r2.append(r12)
            java.lang.String r12 = "["
            r2.append(r12)
            java.lang.String r12 = r5.f299455e
            r2.append(r12)
            java.lang.String r12 = "]["
            r2.append(r12)
            long r12 = r5.f299456f
            r17 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r17
            java.lang.String r15 = "yyyy-MM-dd"
            java.lang.String r12 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r12)
            r2.append(r12)
            java.lang.String r12 = "]"
            r2.append(r12)
            java.lang.Object[] r12 = new java.lang.Object[r14]
            float r13 = r5.f299463p
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12[r7] = r13
            float r13 = r5.f299464q
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12[r8] = r13
            float r13 = r5.f299465r
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12[r9] = r13
            int r5 = r5.f299461n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13 = 3
            r12[r13] = r5
            java.lang.String r5 = "%.2f %.2f %.2f %d"
            java.lang.String r5 = java.lang.String.format(r5, r12)
            r2.append(r5)
            goto L_0x01ef
        L_0x0260:
            di3.d r4 = di3.C86312j.m106911c(r5)
            ke2.c r4 = (ke2.C99129c) r4
            r4.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r4 = r4.f290663p
            double[] r6 = r4.mo140561d(r3, r3)
        L_0x026f:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r4 = r6[r7]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3[r7] = r4
            r4 = r6[r8]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3[r8] = r4
            r4 = r6[r9]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3[r9] = r4
            java.lang.String r2 = r2.toString()
            r4 = 3
            r3[r4] = r2
            java.lang.String r2 = "DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r3)
            r0.mo140218b(r1, r2)
        L_0x02a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe2.C100784d.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo140218b(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
        textView.setTypeface(Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
    }
}
