package p982if;

import android.app.NotificationManager;
import p987jf.C87954a;

/* renamed from: if.f */
public class C87725f extends C87719c {

    /* renamed from: e */
    public final String f254010e;

    /* renamed from: f */
    public final NotificationManager f254011f;

    /* renamed from: g */
    public boolean f254012g;

    public C87725f(C87954a aVar, String str) {
        super(aVar);
        this.f254010e = str;
        this.f254011f = (NotificationManager) aVar.f261442f.getSystemService("notification");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo r22) {
        /*
            r21 = this;
            r10 = r21
            r11 = r22
            jf.a r0 = r10.f253997a
            r0.mo122416c()
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.mActivityRef
            java.lang.Object r0 = r0.get()
            r12 = 0
            r13 = 1
            java.lang.String r14 = "Matrix.LeakProcessor.ManualDump"
            if (r0 != 0) goto L_0x0021
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r1 = r11.mKey
            r0[r12] = r1
            java.lang.String r1 = "activity with key [%s] was already recycled."
            p723vf.C118672d.m167355e(r14, r1, r0)
            return r13
        L_0x0021:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r1 = r11.mActivityName
            r0[r12] = r1
            java.lang.String r1 = "show notification for activity leak. %s"
            p723vf.C118672d.m167353c(r14, r1, r0)
            boolean r0 = r10.f254012g
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "is muted, won't show notification util process reboot"
            p723vf.C118672d.m167353c(r14, r1, r0)
            return r13
        L_0x0039:
            java.lang.String r4 = r11.mActivityName
            java.lang.String r5 = r11.mKey
            cf.a$b r3 = p937cf.C80018a.C80020b.MANUAL_DUMP
            jf.a r0 = r10.f253997a
            r0.mo122416c()
            r9 = 0
            df.e r0 = p955df.C86266e.f250872e     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.String r1 = "MDP"
            java.io.File r0 = r0.mo120674b(r1, r12)     // Catch:{ FileNotFoundException -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = ""
            p723vf.C118672d.m167354d(r14, r0, r2, r1)
            r0 = r9
        L_0x0057:
            if (r0 != 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "prepare hprof file failed, see log above"
            p723vf.C118672d.m167352b(r14, r1, r0)
            r13 = r9
            goto L_0x00bf
        L_0x0063:
            java.lang.String r1 = r0.getAbsolutePath()
            r18 = 600(0x258, double:2.964E-321)
            java.io.File r2 = com.tencent.matrix.resource.MemoryUtil.f235537a
            java.lang.String r2 = "hprofPath"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "referenceKey"
            gy3.C87412m.m108594g(r5, r2)
            com.tencent.matrix.resource.MemoryUtil r15 = com.tencent.matrix.resource.MemoryUtil.f235540d
            com.tencent.matrix.resource.d r2 = new com.tencent.matrix.resource.d
            r2.<init>(r15)
            r16 = r1
            r17 = r5
            r20 = r2
            ze.a r1 = r15.mo112087c(r16, r17, r18, r20)
            boolean r2 = r1.f262647d
            if (r2 == 0) goto L_0x00ae
            java.lang.String r15 = r1.toString()
            r2 = 0
            long r6 = r1.f262650g
            java.lang.String r7 = java.lang.String.valueOf(r6)
            r8 = 0
            java.lang.String r16 = r0.getAbsolutePath()
            r1 = r21
            r6 = r15
            r13 = r9
            r9 = r16
            r1.mo122139d(r2, r3, r4, r5, r6, r7, r8, r9)
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r0 = r0.getAbsolutePath()
            r9.<init>(r0, r15)
            goto L_0x00ca
        L_0x00ae:
            r13 = r9
            java.lang.Throwable r1 = r1.f262649f
            if (r1 == 0) goto L_0x00c1
            r2 = 5
            java.lang.String r6 = r1.toString()
            java.lang.String r7 = "0"
            r1 = r21
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
        L_0x00bf:
            r9 = r13
            goto L_0x00ca
        L_0x00c1:
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r0 = r0.getAbsolutePath()
            r9.<init>(r0, r13)
        L_0x00ca:
            if (r9 == 0) goto L_0x01ed
            boolean r0 = r10.f254012g
            if (r0 != 0) goto L_0x01e5
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "shown notification!!!3"
            p723vf.C118672d.m167353c(r14, r1, r0)
            java.lang.Object r0 = r9.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.second
            java.lang.String r1 = (java.lang.String) r1
            jf.a r2 = r10.f253997a
            com.tencent.matrix.resource.h r3 = r2.f254526g
            cf.a r3 = r3.f235548h
            boolean r3 = r3.f234435e
            if (r3 != 0) goto L_0x00f3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "Manual dump notification is disabled"
            p723vf.C118672d.m167353c(r14, r1, r0)
            goto L_0x01ed
        L_0x00f3:
            android.content.Context r2 = r2.f261442f
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            jf.a r4 = r10.f253997a
            android.content.Context r4 = r4.f261442f
            java.lang.String r5 = r10.f254010e
            r3.setClassName(r4, r5)
            java.lang.String r4 = r11.mActivityName
            java.lang.String r5 = "activity"
            r3.putExtra(r5, r4)
            java.lang.String r4 = r11.mKey
            java.lang.String r5 = "ref_key"
            r3.putExtra(r5, r4)
            java.lang.String r4 = p723vf.C90779e.m113846a(r2)
            java.lang.String r5 = "leak_process"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "hprof_path"
            r3.putExtra(r4, r0)
            java.lang.String r0 = "leak_detail"
            r3.putExtra(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x012e
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x0130
        L_0x012e:
            r1 = 134217728(0x8000000, float:3.85186E-34)
        L_0x0130:
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r12, r3, r1)
            r3 = 2131834842(0x7f1137da, float:1.9302806E38)
            java.lang.String r3 = r2.getString(r3)
            jf.a r4 = r10.f253997a
            com.tencent.matrix.resource.h r4 = r4.f254526g
            cf.a r4 = r4.f235548h
            java.util.Locale r5 = java.util.Locale.getDefault()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r11.mActivityName
            r6[r12] = r7
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r4.mo110261a()
            ur3.a r4 = r4.f234431a
            com.tencent.mm.matrix.l r4 = (com.tencent.p014mm.matrix.C80993l) r4
            r15 = 10
            java.lang.String r13 = "clicfg_matrix_resource_max_detect_times"
            int r4 = r4.mo112814a(r13, r15)
            long r12 = (long) r4
            long r8 = r8 * r12
            long r7 = r7.toMinutes(r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r7 = 1
            r6[r7] = r4
            java.lang.String r4 = "[%s] has leaked for [%s]min!!!"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)
            r5 = 26
            if (r0 < r5) goto L_0x01a1
            android.app.Notification$Builder r6 = new android.app.Notification$Builder
            if (r0 < r5) goto L_0x019c
            java.lang.String r9 = "com.tencent.matrix.resource.processor.ManualDumpProcessor"
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.NotificationChannel r5 = r0.getNotificationChannel(r9)
            if (r5 != 0) goto L_0x019d
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r5 = "create channel"
            p723vf.C118672d.m167355e(r14, r5, r7)
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            r7 = 4
            r5.<init>(r9, r9, r7)
            r0.createNotificationChannel(r5)
            goto L_0x019d
        L_0x019c:
            r9 = 0
        L_0x019d:
            r6.<init>(r2, r9)
            goto L_0x01a6
        L_0x01a1:
            android.app.Notification$Builder r6 = new android.app.Notification$Builder
            r6.<init>(r2)
        L_0x01a6:
            android.app.Notification$Builder r0 = r6.setContentTitle(r3)
            r2 = 0
            android.app.Notification$Builder r0 = r0.setPriority(r2)
            android.app.Notification$BigTextStyle r2 = new android.app.Notification$BigTextStyle
            r2.<init>()
            android.app.Notification$BigTextStyle r2 = r2.bigText(r4)
            android.app.Notification$Builder r0 = r0.setStyle(r2)
            r2 = 1
            android.app.Notification$Builder r0 = r0.setAutoCancel(r2)
            android.app.Notification$Builder r0 = r0.setContentIntent(r1)
            r1 = 2131233344(0x7f080a40, float:1.8082823E38)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.setWhen(r1)
            android.app.Notification r0 = r6.build()
            android.app.NotificationManager r1 = r10.f254011f
            java.lang.String r2 = r11.mKey
            int r2 = r2.hashCode()
            int r2 = r2 + 272
            r1.notify(r2, r0)
            goto L_0x01ed
        L_0x01e5:
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "mute mode, notification will not be shown."
            p723vf.C118672d.m167353c(r14, r1, r0)
        L_0x01ed:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p982if.C87725f.mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo):boolean");
    }
}
