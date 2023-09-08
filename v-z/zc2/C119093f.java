package zc2;

import a70.C112760b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RingtoneResUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import eb0.C86492u2;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.io.File;
import p206nj.C11171e;
import p645pj.C77091b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: zc2.f */
public class C119093f extends C86301e implements C79690d {

    /* renamed from: d */
    public C86492u2 f356648d;

    /* renamed from: Ev */
    public static boolean m167899Ev(String str, String str2, String str3, String str4, String str5, AudioAttributes audioAttributes) {
        Log.m105924i("MicroMsg.PluginNotification", "resetVoipRingtoneChannel toUser:" + str + " originChannelId:" + str2 + " newChannelId:" + str3 + " ringtonePath:" + str5);
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = MMApplicationContext.getContext();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!(notificationManager == null || str == null)) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str4);
                boolean shouldVibrate = notificationChannel != null ? notificationChannel.shouldVibrate() : true;
                if (notificationManager.getNotificationChannel(str2) != null) {
                    notificationManager.deleteNotificationChannel(str2);
                }
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                String string = context.getString(C0966R.string.hcf);
                String string2 = context.getString(C0966R.string.hce);
                if (!(z1Var == null || z1Var.mo62909j3() == null)) {
                    string = context.getString(C0966R.string.hcd, new Object[]{z1Var.mo62909j3()});
                    string2 = context.getString(C0966R.string.hcc, new Object[]{z1Var.mo62909j3()});
                }
                if (!str5.isEmpty()) {
                    NotificationChannel notificationChannel2 = new NotificationChannel(str3, string, 4);
                    notificationChannel2.setDescription(string2);
                    notificationChannel2.enableLights(true);
                    notificationChannel2.setLightColor(-16711936);
                    notificationChannel2.enableVibration(shouldVibrate);
                    notificationChannel2.setLockscreenVisibility(0);
                    Uri uriForFile = FileProviderHelper.getUriForFile(context, C86009m1.m106378c(new File(str5)));
                    MMApplicationContext.getContext().grantUriPermission("com.android.systemui", uriForFile, 1);
                    notificationChannel2.setSound(uriForFile, audioAttributes);
                    notificationManager.createNotificationChannel(notificationChannel2);
                }
                return true;
            }
        }
        return false;
    }

    public static void vx0() {
        if (C11171e.m11046c(26)) {
            Context context = MMApplicationContext.getContext();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager.getNotificationChannel("message_dnd_mode_channel_id") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("message_dnd_mode_channel_id", context.getString(C0966R.string.hbg), 4);
                notificationChannel.setDescription(context.getString(C0966R.string.hbf));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound((Uri) null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public static boolean wx0(String str) {
        String str2 = C112760b.m154225d() + "newmsgringtone";
        if (!C86013q1.m106450k(str2)) {
            C86013q1.m106461v(str2);
        }
        if (C86013q1.m106450k(C77091b.m93029k(1))) {
            Log.m105920e("MicroMsg.PluginNotification", "file exits");
            return true;
        }
        int R = C86013q1.m106436R(str, str2);
        if (R < 0) {
            Log.m105920e("MicroMsg.PluginNotification", "unzip fail, ret = " + R + ", zipFilePath = " + str + ", unzipPath = " + str2);
        } else {
            Log.m105924i("MicroMsg.PluginNotification", "unzip success!!");
            new RingtoneResUpdateEvent().publish();
        }
        return true;
    }

    /* renamed from: kA */
    public C86492u2 mo109806kA() {
        return this.f356648d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ed A[Catch:{ Exception -> 0x036b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.content.Context r21) {
        /*
            r20 = this;
            super.onCreate(r21)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0387
            java.lang.String r0 = "createNotificationChannel"
            bp3.C79760s.m96908a(r0)
            java.lang.String r1 = "voip_norify_channel_silent"
            java.lang.String r2 = "voip_notify_channel_new_id"
            java.lang.String r3 = "message_channel"
            java.lang.String r4 = "reminder_channel_id"
            java.lang.String r5 = "message_dnd_mode_channel_id"
            r6 = 26
            boolean r0 = p206nj.C11171e.m11046c(r6)
            if (r0 == 0) goto L_0x0384
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r0 = r7.getSystemService(r0)
            r8 = r0
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            android.content.SharedPreferences r9 = f40.C86718e.m107552u()
            java.lang.String r10 = "MicroMsg.PluginNotification"
            java.lang.String r0 = "deleteNoWeChatSetNotification"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r11 = 1
            r12 = 0
            java.util.List r0 = r8.getNotificationChannels()     // Catch:{ Exception -> 0x00c1 }
            if (r0 != 0) goto L_0x0047
            goto L_0x00cf
        L_0x0047:
            int r13 = r0.size()     // Catch:{ Exception -> 0x00c1 }
            if (r13 >= r11) goto L_0x004f
            goto L_0x00cf
        L_0x004f:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00c1 }
        L_0x0053:
            boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x00c1 }
            if (r13 == 0) goto L_0x00cf
            java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x00c1 }
            android.app.NotificationChannel r13 = (android.app.NotificationChannel) r13     // Catch:{ Exception -> 0x00c1 }
            if (r13 == 0) goto L_0x0053
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x0053
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r5)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x0072
            goto L_0x0053
        L_0x0072:
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r4)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x007d
            goto L_0x0053
        L_0x007d:
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            boolean r14 = r14.startsWith(r3)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x0088
            goto L_0x0053
        L_0x0088:
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            boolean r14 = r14.contains(r2)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x0093
            goto L_0x0053
        L_0x0093:
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            boolean r14 = r14.contains(r1)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x009e
            goto L_0x0053
        L_0x009e:
            java.lang.String r14 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r15 = "voip_ringtone_channel_"
            boolean r14 = r14.contains(r15)     // Catch:{ Exception -> 0x00c1 }
            if (r14 == 0) goto L_0x00ac
            goto L_0x0053
        L_0x00ac:
            java.lang.String r14 = "deleteNoWeChatSetNotification id:%s"
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r16 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            r15[r12] = r16     // Catch:{ Exception -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r15)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r13 = r13.getId()     // Catch:{ Exception -> 0x00c1 }
            r8.deleteNotificationChannel(r13)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0053
        L_0x00c1:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r13[r12] = r0
            java.lang.String r0 = "deleteNoWeChatSetNotification exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r13)
        L_0x00cf:
            java.lang.String r0 = vc3.C78382a.m94650b()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "deleteNoNumberNotification channelId:"
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = " startsWith:"
            r13.append(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            java.util.List r13 = r8.getNotificationChannels()     // Catch:{ Exception -> 0x0131 }
            if (r13 != 0) goto L_0x00f6
            goto L_0x013f
        L_0x00f6:
            int r14 = r13.size()     // Catch:{ Exception -> 0x0131 }
            if (r14 >= r11) goto L_0x00fd
            goto L_0x013f
        L_0x00fd:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x0131 }
        L_0x0101:
            boolean r14 = r13.hasNext()     // Catch:{ Exception -> 0x0131 }
            if (r14 == 0) goto L_0x013f
            java.lang.Object r14 = r13.next()     // Catch:{ Exception -> 0x0131 }
            android.app.NotificationChannel r14 = (android.app.NotificationChannel) r14     // Catch:{ Exception -> 0x0131 }
            if (r14 == 0) goto L_0x0101
            java.lang.String r15 = r14.getId()     // Catch:{ Exception -> 0x0131 }
            if (r15 == 0) goto L_0x0101
            java.lang.String r15 = r14.getId()     // Catch:{ Exception -> 0x0131 }
            boolean r15 = r15.startsWith(r3)     // Catch:{ Exception -> 0x0131 }
            if (r15 == 0) goto L_0x0101
            java.lang.String r15 = r14.getId()     // Catch:{ Exception -> 0x0131 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r15, (java.lang.String) r0)     // Catch:{ Exception -> 0x0131 }
            if (r15 != 0) goto L_0x0101
            java.lang.String r14 = r14.getId()     // Catch:{ Exception -> 0x0131 }
            r8.deleteNotificationChannel(r14)     // Catch:{ Exception -> 0x0131 }
            goto L_0x0101
        L_0x0131:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r3[r12] = r0
            java.lang.String r0 = "deleteNoNumberNotification exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r3)
        L_0x013f:
            java.lang.String r3 = "MicroMsg.NewMsgNotificationHelper"
            java.lang.String r0 = "settings_sound"
            boolean r0 = r9.getBoolean(r0, r11)
            java.lang.String r13 = "settings_shake"
            boolean r13 = r9.getBoolean(r13, r11)
            r14 = 4
            java.lang.String r6 = "isEnableMsgNotification:%s isSysEnableMsgNotification:%s sound:%s vibration:%s"
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x01e8 }
            boolean r18 = p645pj.C77091b.m93034p()     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x01e8 }
            r15[r12] = r18     // Catch:{ all -> 0x01e8 }
            boolean r18 = p645pj.C77091b.m93036r()     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x01e8 }
            r15[r11] = r18     // Catch:{ all -> 0x01e8 }
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01e8 }
            r17 = 2
            r15[r17] = r18     // Catch:{ all -> 0x01e8 }
            r18 = 3
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x01e8 }
            r15[r18] = r19     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r15)     // Catch:{ all -> 0x01e8 }
            boolean r6 = zc2.C119092d.m167895c(r7, r8, r13, r0, r9)     // Catch:{ all -> 0x01e8 }
            boolean r15 = zc2.C119092d.m167898f(r7, r8, r13, r0, r9)     // Catch:{ all -> 0x01e8 }
            if (r6 != 0) goto L_0x0201
            if (r15 != 0) goto L_0x0201
            android.app.NotificationChannel r6 = new android.app.NotificationChannel     // Catch:{ all -> 0x01e8 }
            java.lang.String r15 = vc3.C78382a.m94650b()     // Catch:{ all -> 0x01e8 }
            r12 = 2131833695(0x7f11335f, float:1.930048E38)
            java.lang.String r12 = r7.getString(r12)     // Catch:{ all -> 0x01e8 }
            r6.<init>(r15, r12, r14)     // Catch:{ all -> 0x01e8 }
            r12 = 2131833694(0x7f11335e, float:1.9300477E38)
            java.lang.String r12 = r7.getString(r12)     // Catch:{ all -> 0x01e8 }
            r6.setDescription(r12)     // Catch:{ all -> 0x01e8 }
            r6.enableLights(r11)     // Catch:{ all -> 0x01e8 }
            r12 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r6.setLightColor(r12)     // Catch:{ all -> 0x01e8 }
            long[] r12 = com.tencent.p014mm.sdk.platformtools.Util.VIRBRATOR_PATTERN     // Catch:{ all -> 0x01e8 }
            r6.setVibrationPattern(r12)     // Catch:{ all -> 0x01e8 }
            r6.enableVibration(r13)     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = "settings.ringtone"
            r12 = 0
            java.lang.String r0 = r9.getString(r0, r12)     // Catch:{ all -> 0x01e8 }
            boolean r12 = zc2.C119092d.m167896d(r0)     // Catch:{ all -> 0x01e8 }
            if (r12 == 0) goto L_0x01d2
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x01e8 }
            android.media.AudioAttributes r12 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT     // Catch:{ all -> 0x01e8 }
            r6.setSound(r0, r12)     // Catch:{ all -> 0x01e8 }
            goto L_0x01d2
        L_0x01cc:
            android.media.AudioAttributes r0 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT     // Catch:{ all -> 0x01e8 }
            r12 = 0
            r6.setSound(r12, r0)     // Catch:{ all -> 0x01e8 }
        L_0x01d2:
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = "message_channel_id"
            java.lang.String r12 = vc3.C78382a.m94650b()     // Catch:{ all -> 0x01e8 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r9, r12)     // Catch:{ all -> 0x01e8 }
            r0.commit()     // Catch:{ all -> 0x01e8 }
            r8.createNotificationChannel(r6)     // Catch:{ all -> 0x01e8 }
            goto L_0x0201
        L_0x01e8:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "createNewMsgNotificationChannel log error : "
            r6.append(r9)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0201:
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r3 = 2131833707(0x7f11336b, float:1.9300504E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 2
            r0.<init>(r4, r3, r6)
            r3 = 2131833706(0x7f11336a, float:1.9300502E38)
            java.lang.String r3 = r7.getString(r3)
            r0.setDescription(r3)
            r8.createNotificationChannel(r0)
            boolean r0 = p645pj.C77091b.m93033o()
            if (r0 != 0) goto L_0x024d
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r3 = 2131833697(0x7f113361, float:1.9300483E38)
            java.lang.String r3 = r7.getString(r3)
            r0.<init>(r5, r3, r14)
            r3 = 2131833696(0x7f113360, float:1.9300481E38)
            java.lang.String r3 = r7.getString(r3)
            r0.setDescription(r3)
            r0.enableLights(r11)
            r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r0.setLightColor(r3)
            r3 = 0
            r0.enableVibration(r3)
            android.media.AudioAttributes r3 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            r4 = 0
            r0.setSound(r4, r3)
            r8.createNotificationChannel(r0)
        L_0x024d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x036b }
            r3 = 26
            if (r0 < r3) goto L_0x0384
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x036b }
            java.lang.Class<android.app.NotificationManager> r3 = android.app.NotificationManager.class
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{ Exception -> 0x036b }
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch:{ Exception -> 0x036b }
            java.lang.String r4 = vc3.C65583b.m77266a()     // Catch:{ Exception -> 0x036b }
            android.app.NotificationChannel r4 = r3.getNotificationChannel(r4)     // Catch:{ Exception -> 0x036b }
            if (r4 == 0) goto L_0x026e
            android.net.Uri r12 = r4.getSound()     // Catch:{ Exception -> 0x036b }
            goto L_0x026f
        L_0x026e:
            r12 = 0
        L_0x026f:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x036b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036b }
            r6.<init>()     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = a70.C112760b.m154216X()     // Catch:{ Exception -> 0x036b }
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = "app_ringtone"
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = "phonering.mp3"
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x036b }
            r5.<init>(r6)     // Catch:{ Exception -> 0x036b }
            com.tencent.mm.vfs.m1 r5 = com.tencent.p014mm.vfs.C86009m1.m106378c(r5)     // Catch:{ Exception -> 0x036b }
            android.net.Uri r5 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r0, r5)     // Catch:{ Exception -> 0x036b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036b }
            r6.<init>()     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = "checkResetVoipSilentChannel originSound:"
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            if (r12 == 0) goto L_0x02ad
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x036b }
            goto L_0x02b0
        L_0x02ad:
            java.lang.String r7 = "null"
        L_0x02b0:
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x036b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)     // Catch:{ Exception -> 0x036b }
            if (r4 == 0) goto L_0x02c2
            boolean r6 = r5.equals(r12)     // Catch:{ Exception -> 0x036b }
            if (r6 != 0) goto L_0x0384
        L_0x02c2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036b }
            r6.<init>()     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = "silent channel not valid! try reset to:"
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x036b }
            r6.append(r7)     // Catch:{ Exception -> 0x036b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x036b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)     // Catch:{ Exception -> 0x036b }
            if (r4 == 0) goto L_0x02e6
            boolean r4 = r4.shouldVibrate()     // Catch:{ Exception -> 0x036b }
            if (r4 == 0) goto L_0x02e4
            goto L_0x02e6
        L_0x02e4:
            r4 = 0
            goto L_0x02e7
        L_0x02e6:
            r4 = 1
        L_0x02e7:
            android.app.NotificationChannel r6 = r3.getNotificationChannel(r2)     // Catch:{ Exception -> 0x036b }
            if (r6 == 0) goto L_0x02f1
            boolean r4 = r6.shouldVibrate()     // Catch:{ Exception -> 0x036b }
        L_0x02f1:
            java.lang.String r6 = "voip_channel_new_id"
            r3.deleteNotificationChannel(r6)     // Catch:{ Exception -> 0x036b }
            r3.deleteNotificationChannel(r2)     // Catch:{ Exception -> 0x036b }
            java.lang.String r2 = vc3.C65583b.m77266a()     // Catch:{ Exception -> 0x036b }
            r3.deleteNotificationChannel(r2)     // Catch:{ Exception -> 0x036b }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x036b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036b }
            r2.<init>()     // Catch:{ Exception -> 0x036b }
            r2.append(r1)     // Catch:{ Exception -> 0x036b }
            r2.append(r6)     // Catch:{ Exception -> 0x036b }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x036b }
            java.lang.String r2 = "mmkv_gpu_info"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)     // Catch:{ Exception -> 0x036b }
            java.lang.String r6 = "channel_id"
            r2.putString(r6, r1)     // Catch:{ Exception -> 0x036b }
            android.app.NotificationChannel r2 = new android.app.NotificationChannel     // Catch:{ Exception -> 0x036b }
            r6 = 2131833729(0x7f113381, float:1.9300548E38)
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x036b }
            r2.<init>(r1, r6, r14)     // Catch:{ Exception -> 0x036b }
            r6 = 2131833728(0x7f113380, float:1.9300546E38)
            java.lang.String r0 = r0.getString(r6)     // Catch:{ Exception -> 0x036b }
            r2.setDescription(r0)     // Catch:{ Exception -> 0x036b }
            r2.enableLights(r11)     // Catch:{ Exception -> 0x036b }
            r6 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r2.setLightColor(r6)     // Catch:{ Exception -> 0x036b }
            r2.enableVibration(r4)     // Catch:{ Exception -> 0x036b }
            r6 = 0
            r2.setLockscreenVisibility(r6)     // Catch:{ Exception -> 0x036b }
            r6 = 0
            r2.setSound(r5, r6)     // Catch:{ Exception -> 0x036b }
            r3.createNotificationChannel(r2)     // Catch:{ Exception -> 0x036b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036b }
            r0.<init>()     // Catch:{ Exception -> 0x036b }
            java.lang.String r2 = "reset silent channel to "
            r0.append(r2)     // Catch:{ Exception -> 0x036b }
            r0.append(r1)     // Catch:{ Exception -> 0x036b }
            java.lang.String r1 = ", set vibration to "
            r0.append(r1)     // Catch:{ Exception -> 0x036b }
            r0.append(r4)     // Catch:{ Exception -> 0x036b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x036b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x036b }
            goto L_0x0384
        L_0x036b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkResetVoipSilentChannel error:"
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x0384:
            bp3.C79760s.m96909b()
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc2.C119093f.onCreate(android.content.Context):void");
    }

    public void v60(C86492u2 u2Var) {
        this.f356648d = u2Var;
        C91661e.f262638a = u2Var;
    }
}
