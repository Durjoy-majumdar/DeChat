package com.tencent.p014mm.recoveryv2;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.recoveryv2.a */
public interface C85662a {

    /* renamed from: com.tencent.mm.recoveryv2.a$a */
    public static abstract class C85663a implements C85662a {

        /* renamed from: a */
        public C85675e f249633a;

        /* renamed from: b */
        public C85662a mo119236b(C85675e eVar) {
            this.f249633a = eVar;
            return this;
        }

        /* renamed from: c */
        public void mo119237c(Context context, RecoveryCrash recoveryCrash) {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "recovery on terminate");
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.a$b */
    public static class C85664b extends C85663a {

        /* renamed from: b */
        public boolean f249634b = false;

        /* renamed from: a */
        public void mo119235a(Context context, RecoveryCrash recoveryCrash) {
            String str;
            Context context2 = context;
            RecoveryCrash recoveryCrash2 = recoveryCrash;
            Intent intent = new Intent();
            Class<? extends Activity> d = C85665c.this.mo119226d();
            if (d == null) {
                d = null;
            }
            String str2 = "recover_app_ver";
            String str3 = "crash_count";
            if (d == null) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "can not get target activity, skip");
                return;
            }
            try {
                StringBuilder sb = new StringBuilder();
                String str4 = "launch_recovery";
                sb.append("start recovery activity, target = ");
                sb.append(d.getName());
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", sb.toString());
                intent.setClass(context2, d);
                intent.putExtra("extra_crash_count", recoveryCrash2.f249629d.f250884a);
                recoveryCrash.mo119228a();
                RecoveryCrash.Record record = new RecoveryCrash.Record();
                record.f249630d = recoveryCrash2.f249629d.f250884a;
                String str5 = "launch_recovery_real";
                record.f249631e = recoveryCrash2.f249626a;
                record.f249632f = recoveryCrash2.f249627b;
                intent.putExtra("extra_crash_record", record);
                intent.addFlags(276824064);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                str = "MicroMsg.recovery.callback";
                String str6 = str3;
                String str7 = "recover_is_discard";
                String str8 = str4;
                String str9 = "recover_running_time";
                String str10 = str5;
                String str11 = "recover_launch_mode";
                C9556a aVar2 = aVar;
                String str12 = "recover_internal_status";
                String str13 = "recover_from_crash";
                String str14 = "recovery_from";
                String str15 = "recovery_status";
                try {
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f249634b = true;
                    C85672d.C85674b bVar = new C85672d.C85674b(context2, "recovery_statistic");
                    bVar.mo119256e();
                    int i = bVar.getInt(str6, 0);
                    boolean z = bVar.getBoolean(str8, false);
                    boolean z2 = bVar.getBoolean(str10, false);
                    boolean z3 = bVar.getBoolean(str13, false);
                    int i2 = bVar.getInt(str15, -1);
                    String str16 = str14;
                    int i3 = bVar.getInt(str16, 0);
                    String str17 = str16;
                    String str18 = str12;
                    int i4 = bVar.getInt(str18, 0);
                    String str19 = str18;
                    String str20 = str11;
                    bVar.getInt(str20, 0);
                    String str21 = str6;
                    String str22 = str20;
                    long j = bVar.getLong(str9, 0);
                    String str23 = str7;
                    boolean z4 = bVar.getBoolean(str23, false);
                    String str24 = str2;
                    String string = bVar.getString(str24, "");
                    bVar.mo119258g(str21, (long) i);
                    bVar.putBoolean(str8, z);
                    bVar.putBoolean(str10, z2);
                    bVar.putBoolean(str13, z3);
                    bVar.mo119258g(str15, (long) i2);
                    bVar.mo119258g(str17, (long) i3);
                    bVar.mo119258g(str19, (long) i4);
                    bVar.mo119258g(str22, (long) 1);
                    bVar.mo119258g(str9, j);
                    bVar.putBoolean(str23, z4);
                    bVar.putString(str24, string);
                    bVar.mo119242c();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                str = "MicroMsg.recovery.callback";
                C85692k.m105839a(str, "start activity fail", e);
            }
        }

        /* renamed from: c */
        public void mo119237c(Context context, RecoveryCrash recoveryCrash) {
            Context context2 = context;
            if (!this.f249634b) {
                C85692k.C85693a.m105840a(5, "MicroMsg.recovery.callback", "do NOT suicide, bcs launching activity fail");
                return;
            }
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "suicide when launch recovery activity");
            if (context2 instanceof Activity) {
                ((Activity) context2).finish();
            }
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.a$c */
    public static class C85665c extends C85663a {

        /* renamed from: b */
        public C85662a f249635b;

        /* renamed from: com.tencent.mm.recoveryv2.a$c$a */
        public class C85666a extends C85664b {
            public C85666a() {
            }
        }

        /* renamed from: com.tencent.mm.recoveryv2.a$c$b */
        public class C85667b extends C85668d {
            public C85667b() {
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x016d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119235a(android.content.Context r28, com.tencent.p014mm.recoveryv2.RecoveryCrash r29) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                r2 = r29
                df3.a r3 = r2.f249629d
                int r3 = r3.f250884a
                com.tencent.mm.recoveryv2.e r4 = r0.f249633a
                int r5 = r4.f249646a
                if (r3 >= r5) goto L_0x0011
                return
            L_0x0011:
                int r4 = r4.f249647b
                java.lang.String r5 = "MicroMsg.recovery.callback"
                r6 = 4
                if (r3 >= r4) goto L_0x0020
                java.lang.String r3 = "launch service for lower crash count"
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r6, r5, r3)
            L_0x001d:
                r7 = 0
                goto L_0x0161
            L_0x0020:
                com.tencent.mm.recoveryv2.e$a r3 = new com.tencent.mm.recoveryv2.e$a
                r3.<init>(r1)
                long r9 = java.lang.System.currentTimeMillis()
                long r11 = r3.f249657c
                r13 = 0
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 <= 0) goto L_0x0059
                long r11 = r3.f249655a
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 <= 0) goto L_0x0059
                long r11 = r9 - r11
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 <= 0) goto L_0x0059
                long r7 = r3.f249656b
                int r16 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r16 > 0) goto L_0x0059
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "do NOT launch ui too frequently, interval = "
                r3.append(r7)
                r3.append(r11)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r6, r5, r3)
                r3 = 0
                goto L_0x005f
            L_0x0059:
                r3.f249655a = r9
                r3.mo119260a()
                r3 = 1
            L_0x005f:
                if (r3 != 0) goto L_0x0158
                com.tencent.mm.recoveryv2.e$a r3 = new com.tencent.mm.recoveryv2.e$a
                r3.<init>(r1)
                long r7 = r3.f249655a
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 > 0) goto L_0x006d
                goto L_0x00a3
            L_0x006d:
                long r9 = java.lang.System.currentTimeMillis()
                long r11 = r3.f249656b
                r16 = 3
                long r13 = r11 / r16
                long r7 = r7 - r13
                long r16 = r9 - r7
                int r20 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
                if (r20 < 0) goto L_0x008a
                java.lang.String r7 = "#checkOverHeat, YES!"
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r6, r5, r7)
                r3.f249655a = r9
                r3.mo119260a()
                r3 = 1
                goto L_0x00a4
            L_0x008a:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "#checkOverHeat, inc last ui launch time, delta = "
                r9.append(r10)
                r9.append(r13)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r6, r5, r9)
                r3.f249655a = r7
                r3.mo119260a()
            L_0x00a3:
                r3 = 0
            L_0x00a4:
                if (r3 == 0) goto L_0x014e
                com.tencent.mm.recoveryv2.d$b r3 = new com.tencent.mm.recoveryv2.d$b
                java.lang.String r7 = "recovery_statistic"
                r3.<init>(r1, r7)
                r3.mo119256e()
                java.lang.String r7 = "crash_count"
                r4 = 0
                int r8 = r3.getInt(r7, r4)
                java.lang.String r9 = "launch_recovery"
                boolean r10 = r3.getBoolean(r9, r4)
                java.lang.String r11 = "launch_recovery_real"
                boolean r12 = r3.getBoolean(r11, r4)
                java.lang.String r13 = "recover_from_crash"
                boolean r14 = r3.getBoolean(r13, r4)
                r15 = -1
                java.lang.String r6 = "recovery_status"
                int r15 = r3.getInt(r6, r15)
                java.lang.String r1 = "recovery_from"
                int r2 = r3.getInt(r1, r4)
                java.lang.String r0 = "recover_internal_status"
                r3.getInt(r0, r4)
                r20 = r5
                java.lang.String r5 = "recover_launch_mode"
                r21 = r0
                int r0 = r3.getInt(r5, r4)
                java.lang.String r4 = "recover_running_time"
                r23 = r0
                r22 = r1
                r0 = 0
                long r0 = r3.getLong(r4, r0)
                r18 = r0
                java.lang.String r0 = "recover_is_discard"
                r1 = 0
                r3.getBoolean(r0, r1)
                java.lang.String r1 = "recover_app_ver"
                r24 = r0
                java.lang.String r0 = ""
                java.lang.String r0 = r3.getString(r1, r0)
                r26 = r0
                r25 = r1
                long r0 = (long) r8
                r3.mo119258g(r7, r0)
                r3.putBoolean(r9, r10)
                r3.putBoolean(r11, r12)
                r3.putBoolean(r13, r14)
                r3.putInt(r6, r15)
                r0 = r22
                r3.putInt(r0, r2)
                r0 = r21
                r1 = 1
                r3.putInt(r0, r1)
                r0 = r23
                r3.putInt(r5, r0)
                r5 = r18
                r3.putLong(r4, r5)
                r0 = r24
                r2 = 0
                r3.putBoolean(r0, r2)
                r0 = r25
                r2 = r26
                r3.putString(r0, r2)
                r3.mo119242c()
                java.lang.String r0 = "launch activity"
                r3 = r20
                r4 = 4
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r4, r3, r0)
                goto L_0x0160
            L_0x014e:
                r3 = r5
                r2 = 0
                r4 = 4
                java.lang.String r0 = "launch service"
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r4, r3, r0)
                goto L_0x001d
            L_0x0158:
                r3 = r5
                r1 = 1
                r4 = 4
                java.lang.String r0 = "launch activity for higher crash count"
                com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r4, r3, r0)
            L_0x0160:
                r7 = 1
            L_0x0161:
                if (r7 == 0) goto L_0x016d
                com.tencent.mm.recoveryv2.a$c$a r0 = new com.tencent.mm.recoveryv2.a$c$a
                r1 = r27
                r0.<init>()
                r1.f249635b = r0
                goto L_0x0176
            L_0x016d:
                r1 = r27
                com.tencent.mm.recoveryv2.a$c$b r0 = new com.tencent.mm.recoveryv2.a$c$b
                r0.<init>()
                r1.f249635b = r0
            L_0x0176:
                com.tencent.mm.recoveryv2.a r0 = r1.f249635b
                r2 = r28
                r3 = r29
                r0.mo119235a(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recoveryv2.C85662a.C85665c.mo119235a(android.content.Context, com.tencent.mm.recoveryv2.RecoveryCrash):void");
        }

        /* renamed from: c */
        public void mo119237c(Context context, RecoveryCrash recoveryCrash) {
            C85662a aVar = this.f249635b;
            if (aVar != null) {
                aVar.mo119237c(context, recoveryCrash);
            }
        }

        /* renamed from: d */
        public Class<? extends Activity> mo119226d() {
            return null;
        }

        /* renamed from: e */
        public Class<? extends Service> mo119227e() {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.a$d */
    public static class C85668d extends C85663a {

        /* renamed from: com.tencent.mm.recoveryv2.a$d$a */
        public class C85669a implements ServiceConnection {
            public C85669a(C85668d dVar) {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "onServiceConnected");
            }

            public void onServiceDisconnected(ComponentName componentName) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "onServiceDisconnected");
            }
        }

        /* renamed from: a */
        public void mo119235a(Context context, RecoveryCrash recoveryCrash) {
            String str;
            Intent intent;
            Context context2 = context;
            RecoveryCrash recoveryCrash2 = recoveryCrash;
            Class<? extends Service> e = C85665c.this.mo119227e();
            if (e == null) {
                e = null;
            }
            if (e == null) {
                C85692k.C85693a.m105840a(4, "MicroMsg.recovery.callback", "can not get target service, skip");
                return;
            }
            try {
                Intent intent2 = new Intent();
                intent2.setClass(context2, e);
                String str2 = "MicroMsg.recovery.callback";
                try {
                    intent2.putExtra("extra_crash_count", recoveryCrash2.f249629d.f250884a);
                    recoveryCrash.mo119228a();
                    RecoveryCrash.Record record = new RecoveryCrash.Record();
                    String str3 = "recover_app_ver";
                    record.f249630d = recoveryCrash2.f249629d.f250884a;
                    String str4 = "recover_is_discard";
                    record.f249631e = recoveryCrash2.f249626a;
                    record.f249632f = recoveryCrash2.f249627b;
                    intent2.putExtra("extra_crash_record", record);
                    try {
                        context2.startService(intent2);
                        C85672d.C85674b bVar = new C85672d.C85674b(context2, "recovery_statistic");
                        bVar.mo119256e();
                        int i = bVar.getInt("crash_count", 0);
                        boolean z = bVar.getBoolean("launch_recovery", false);
                        intent = intent2;
                        try {
                            boolean z2 = bVar.getBoolean("launch_recovery_real", false);
                            boolean z3 = bVar.getBoolean("recover_from_crash", false);
                            int i2 = bVar.getInt("recovery_status", -1);
                            int i3 = bVar.getInt("recovery_from", 0);
                            int i4 = bVar.getInt("recover_internal_status", 0);
                            bVar.getInt("recover_launch_mode", 0);
                            long j = bVar.getLong("recover_running_time", 0);
                            String str5 = str4;
                            boolean z4 = bVar.getBoolean(str5, false);
                            String str6 = str3;
                            String string = bVar.getString(str6, "");
                            boolean z5 = z4;
                            bVar.mo119258g("crash_count", (long) i);
                            bVar.putBoolean("launch_recovery", z);
                            bVar.putBoolean("launch_recovery_real", z2);
                            bVar.putBoolean("recover_from_crash", z3);
                            bVar.mo119258g("recovery_status", (long) i2);
                            bVar.mo119258g("recovery_from", (long) i3);
                            bVar.mo119258g("recover_internal_status", (long) i4);
                            bVar.mo119258g("recover_launch_mode", (long) 2);
                            bVar.mo119258g("recover_running_time", j);
                            bVar.putBoolean(str5, z5);
                            bVar.putString(str6, string);
                            bVar.mo119242c();
                        } catch (Exception e2) {
                            e = e2;
                            str = str2;
                            try {
                                C85692k.C85693a.m105840a(5, str, "start service fail + " + e.getMessage() + ", try bind service");
                                try {
                                    context.bindService(intent, new C85669a(this), 1);
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                C85692k.m105839a(str, "start service fail", e);
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        intent = intent2;
                        str = str2;
                        C85692k.C85693a.m105840a(5, str, "start service fail + " + e.getMessage() + ", try bind service");
                        context.bindService(intent, new C85669a(this), 1);
                    }
                } catch (Exception e6) {
                    e = e6;
                    str = str2;
                    C85692k.m105839a(str, "start service fail", e);
                }
            } catch (Exception e7) {
                e = e7;
                str = "MicroMsg.recovery.callback";
                C85692k.m105839a(str, "start service fail", e);
            }
        }
    }

    /* renamed from: a */
    void mo119235a(Context context, RecoveryCrash recoveryCrash);

    /* renamed from: b */
    C85662a mo119236b(C85675e eVar);

    /* renamed from: c */
    void mo119237c(Context context, RecoveryCrash recoveryCrash);
}
