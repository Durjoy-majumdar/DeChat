package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.e0 */
public class C116079e0 extends C78802b implements View.OnClickListener {

    /* renamed from: com.tencent.mm.ui.conversation.banner.e0$a */
    public class C97208a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.MsgDelayTipsBanner", "[oneliang]yes");
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.banner.e0$b */
    public class C97209b implements DialogInterface.OnCancelListener {
        public void onCancel(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02d3  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m163368h(android.content.Context r13) {
        /*
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r13.getString(r0)
            r0 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r13.getString(r0)
            com.tencent.mm.ui.conversation.banner.e0$b r6 = new com.tencent.mm.ui.conversation.banner.e0$b
            r6.<init>()
            r4 = 1
            r5 = 1
            r1 = r13
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            boolean r1 = yb0.C118950a.f356272a
            java.lang.String r1 = "%s,read exception:"
            java.lang.String r2 = "MicroMsg.ActiveDetector"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            r4 = 0
            r5 = 3
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x002d
            r1 = r4
            goto L_0x01c0
        L_0x002d:
            yb0.c r3 = yb0.C118950a.f356273b
            java.lang.String r3 = r3.f356292j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r9 = "/"
            r8.append(r9)
            java.lang.String r10 = "mm"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = "push"
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r9 = yb0.C91391b.m114666a(r9)     // Catch:{ Exception -> 0x0066 }
            yb0.c$a r9 = (yb0.C118952c.C118953a) r9     // Catch:{ Exception -> 0x0066 }
            goto L_0x0082
        L_0x0066:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r7] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r10)
            r9 = r4
        L_0x0082:
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.Object r8 = yb0.C91391b.m114666a(r8)     // Catch:{ Exception -> 0x008d }
            yb0.c$a r8 = (yb0.C118952c.C118953a) r8     // Catch:{ Exception -> 0x008d }
            goto L_0x00a9
        L_0x008d:
            r8 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r1 = r8.getMessage()
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r8)
            r8 = r4
        L_0x00a9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r9 == 0) goto L_0x0167
            java.util.List<yb0.c$d> r2 = r9.f356298d
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00b8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r3 = r2.next()
            yb0.c$d r3 = (yb0.C118952c.C118956d) r3
            yb0.a$a r3 = yb0.C118950a.m167708e(r3, r7)
            if (r3 != 0) goto L_0x00cb
            goto L_0x00b8
        L_0x00cb:
            r1.add(r3)
            goto L_0x00b8
        L_0x00cf:
            java.util.List<yb0.c$c> r2 = r9.f356300f
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0103
            java.lang.Object r3 = r2.next()
            yb0.c$c r3 = (yb0.C118952c.C118955c) r3
            if (r3 != 0) goto L_0x00e7
            r10 = r4
            goto L_0x00fc
        L_0x00e7:
            yb0.a$a r10 = new yb0.a$a
            r10.<init>()
            long r11 = r3.f356318d
            r10.f356276d = r11
            long r11 = r3.f356319e
            r10.f356277e = r11
            r10.f356278f = r11
            r10.f356279g = r5
            int r3 = r3.f356320f
            r10.f356283n = r3
        L_0x00fc:
            if (r10 != 0) goto L_0x00ff
            goto L_0x00d7
        L_0x00ff:
            r1.add(r10)
            goto L_0x00d7
        L_0x0103:
            java.util.List<yb0.c$b> r2 = r9.f356301g
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356302h
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356303i
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356304j
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356305n
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356306o
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356307p
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356308q
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356309r
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356310s
            yb0.C118950a.m167706c(r1, r2, r6)
            java.util.List<yb0.c$b> r2 = r9.f356311t
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356312u
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356313v
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356314w
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356315x
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356316y
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356317z
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356295A
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356296B
            yb0.C118950a.m167706c(r1, r2, r7)
            java.util.List<yb0.c$b> r2 = r9.f356297C
            yb0.C118950a.m167706c(r1, r2, r7)
        L_0x0167:
            if (r8 == 0) goto L_0x01bd
            java.util.List<yb0.c$d> r2 = r8.f356298d
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0171:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0188
            java.lang.Object r3 = r2.next()
            yb0.c$d r3 = (yb0.C118952c.C118956d) r3
            yb0.a$a r3 = yb0.C118950a.m167708e(r3, r6)
            if (r3 != 0) goto L_0x0184
            goto L_0x0171
        L_0x0184:
            r1.add(r3)
            goto L_0x0171
        L_0x0188:
            java.util.List<yb0.c$c> r2 = r8.f356299e
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0190:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01bd
            java.lang.Object r3 = r2.next()
            yb0.c$c r3 = (yb0.C118952c.C118955c) r3
            r8 = 2
            if (r3 != 0) goto L_0x01a1
            r9 = r4
            goto L_0x01b6
        L_0x01a1:
            yb0.a$a r9 = new yb0.a$a
            r9.<init>()
            long r10 = r3.f356318d
            r9.f356276d = r10
            long r10 = r3.f356319e
            r9.f356277e = r10
            r9.f356278f = r10
            r9.f356279g = r8
            int r3 = r3.f356320f
            r9.f356283n = r3
        L_0x01b6:
            if (r9 != 0) goto L_0x01b9
            goto L_0x0190
        L_0x01b9:
            r1.add(r9)
            goto L_0x0190
        L_0x01bd:
            java.util.Collections.sort(r1)
        L_0x01c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "MicroMsg.MsgDelayTipsBanner"
            if (r1 == 0) goto L_0x01e8
            java.util.Iterator r1 = r1.iterator()
        L_0x01cd:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x01e8
            java.lang.Object r8 = r1.next()
            yb0.a$a r8 = (yb0.C118950a.C118951a) r8
            java.lang.String r9 = r8.toString()
            r2.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            goto L_0x01cd
        L_0x01e8:
            if (r0 == 0) goto L_0x01ed
            r0.dismiss()
        L_0x01ed:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            eb0.c r1 = eb0.C97625j3.m125812b()
            r1.getClass()
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            java.lang.String r1 = r1.f251805c
            r0.append(r1)
            java.lang.String r1 = "/delayedMsg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = "data.txt"
            r1.<init>((java.lang.String) r0, (java.lang.String) r8)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "close exception:"
            boolean r8 = r1.mo119967g()
            if (r8 != 0) goto L_0x0241
            r1.mo119964e()     // Catch:{ Exception -> 0x0228 }
            goto L_0x0241
        L_0x0228:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "create new file exception:"
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
        L_0x0241:
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106427I(r1, r7)     // Catch:{ Exception -> 0x0270 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0270 }
            r8.<init>()     // Catch:{ Exception -> 0x0270 }
            r8.append(r0)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = "\n"
            r8.append(r0)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x0270 }
            java.lang.String r8 = "UTF-8"
            byte[] r0 = r0.getBytes(r8)     // Catch:{ Exception -> 0x0270 }
            r4.write(r0)     // Catch:{ Exception -> 0x0270 }
            r4.flush()     // Catch:{ Exception -> 0x0270 }
            r4.close()     // Catch:{ Exception -> 0x0266 }
            goto L_0x02a6
        L_0x0266:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0295
        L_0x026d:
            r13 = move-exception
            goto L_0x02f2
        L_0x0270:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r8.<init>()     // Catch:{ all -> 0x026d }
            java.lang.String r9 = "exception:"
            r8.append(r9)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x026d }
            r8.append(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x026d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x026d }
            if (r4 == 0) goto L_0x02a6
            r4.close()     // Catch:{ Exception -> 0x028f }
            goto L_0x02a6
        L_0x028f:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0295:
            r4.append(r2)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x02a6:
            java.lang.String r0 = r1.mo119971i()
            android.widget.Toast r13 = p910lj.C76701a.makeText((android.content.Context) r13, (java.lang.CharSequence) r0, (int) r6)
            r13.show()
            java.lang.String r13 = r1.mo119971i()
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            java.lang.String r1 = "weixin"
            r0.mo108749c3(r1)
            r0.mo108732L2(r13)
            r0.setType(r6)
            r0.mo108740T2(r7)
            int r13 = r0.mo108769t2()
            if (r13 != r6) goto L_0x02d3
            r13 = 4
            r0.mo100991d(r13)
            goto L_0x02d6
        L_0x02d3:
            r0.mo100991d(r5)
        L_0x02d6:
            long r1 = java.lang.System.currentTimeMillis()
            r0.mo108745Y2(r1)
            r0.mo108733M2(r1)
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            k40.a r13 = f40.C86709a0.m107533q(r13)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            r13.my0(r0)
            return
        L_0x02f2:
            if (r4 == 0) goto L_0x030f
            r4.close()     // Catch:{ Exception -> 0x02f8 }
            goto L_0x030f
        L_0x02f8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x030f:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.banner.C116079e0.m163368h(android.content.Context):void");
    }

    /* renamed from: i */
    public static void m163369i(Context context) {
        char c;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 23) {
                c = 1;
            } else {
                PowerManager powerManager = (PowerManager) MMApplicationContext.getContext().getSystemService("power");
                try {
                    boolean isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(MMApplicationContext.getContext().getPackageName());
                    Log.m105924i("MicroMsg.MsgDelayTipsBanner", "[oneliang]app is ignore:" + isIgnoringBatteryOptimizations);
                    Log.m105924i("MicroMsg.MsgDelayTipsBanner", "[oneliang]is device idle mode:" + powerManager.isDeviceIdleMode());
                    if (!isIgnoringBatteryOptimizations) {
                        c = 2;
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.MsgDelayTipsBanner", "[oneliang]ignoring battery optimizations check failure.use another way.");
                }
                c = 3;
            }
            if (c != 1) {
                if (c == 2) {
                    Log.m105924i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to add ignore");
                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    Intent data = intent.setData(Uri.parse("package:" + MMApplicationContext.getContext().getPackageName()));
                    data.setFlags(268435456);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(data);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "showTips", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "showTips", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            String str = Build.BRAND;
            int i = C0966R.string.gwi;
            if (str != null) {
                if (str.toLowerCase().startsWith("samsung")) {
                    i = C0966R.string.gwj;
                } else if (str.toLowerCase().equalsIgnoreCase("huawei")) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 == 21 || i2 == 22 || i2 == 23) {
                        i = C0966R.string.gwg;
                    } else if (i2 == 24) {
                        i = C0966R.string.gwh;
                    }
                }
            }
            if (i > 0) {
                C76879j.m92749t(context, context.getString(i), "", new C97208a());
            } else {
                Log.m105920e("MicroMsg.MsgDelayTipsBanner", "[oneliang]impossible......");
            }
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.b_x;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        Log.m105924i("MicroMsg.MsgDelayTipsBanner", "refresh banner.");
        C86709a0.m107528h();
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SHOW_MSG_DELAY_BOOLEAN_SYNC, false);
        Log.m105925i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to show banner:%s", Boolean.valueOf(g));
        if (g) {
            View view = this.f230569f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view3 = this.f230569f;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return super.mo7970e();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m163369i(this.f230570g.get());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SHOW_MSG_DELAY_BOOLEAN_SYNC, Boolean.FALSE);
        View view2 = this.f230569f;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MsgDelayTipsBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
