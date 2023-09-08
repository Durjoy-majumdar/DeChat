package com.tencent.p014mm.booter.notification;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AutoNewMessageEvent;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.GreenManUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p206nj.C11171e;
import p789bi.C39771c;
import p875ci.C67378t;
import p918s2.C77610j;
import p918s2.C90116e;
import vc3.C78382a;

/* renamed from: com.tencent.mm.booter.notification.f */
public class C67840f extends C67839a {

    /* renamed from: a */
    public C67378t f194738a;

    /* renamed from: b */
    public Context f194739b;

    /* renamed from: com.tencent.mm.booter.notification.f$a */
    public static class C67841a implements Serializable {

        /* renamed from: d */
        public String f194740d;

        /* renamed from: e */
        public int f194741e;

        public String toString() {
            return "[" + this.f194740d + "(" + this.f194741e + ")]";
        }
    }

    public C67840f() {
        Context context = MMApplicationContext.getContext();
        this.f194739b = context;
        this.f194738a = new C67378t(context);
    }

    /* renamed from: f */
    public static boolean m80195f(long j) {
        if (j == 0) {
            return false;
        }
        String string = C114781l0.m161561h().getString("com.tencent.preference.notification.key.all.notified.msgid", "");
        Log.m105919d("MicroMsg.Notification.AppMsg.Handle", "isAlreadyNotified: %s, msgId: %d", string, Long.valueOf(j));
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("%");
        return string.contains(sb.toString());
    }

    /* renamed from: h */
    public static void m80196h(int i) {
        int max = Math.max(0, i);
        C114781l0.m161561h().edit().putInt("com.tencent.preference.notification.key.unread.msg", max).apply();
        Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadMsg %d", Integer.valueOf(max));
    }

    /* renamed from: i */
    public static void m80197i(ArrayList<C67841a> arrayList) {
        if (arrayList == null) {
            C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.unread.talker", "").apply();
        } else {
            try {
                C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.unread.talker", C39771c.m42565b(new ArrayList(arrayList))).apply();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e, "", new Object[0]);
                C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.unread.talker", "").apply();
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = arrayList == null ? "null" : arrayList.toString();
        Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadTalker %s", objArr);
    }

    /* renamed from: a */
    public int mo93224a(NotificationItem notificationItem, C67378t tVar) {
        Notification notification;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (GreenManUtil.isAppVisibleForeground(this.f194739b)) {
            Log.m105924i("MicroMsg.Notification.AppMsg.Handle", "GreenManUtil.isAppVisibleForeground");
            if ((BuildInfo.DEBUG || BuildInfo.PRE_RELEASE) && (runningAppProcesses = ((ActivityManager) this.f194739b.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.processName.startsWith(MMApplicationContext.getApplicationId()) && GreenManUtil.reflectProcessState(next) == 3) {
                        GreenManUtil.dumpRunningServices(this.f194739b);
                    }
                }
            }
        } else if (!(notificationItem == null || (notification = notificationItem.f194730f) == null)) {
            notification.priority = 1;
            if (!C11171e.m11046c(26)) {
                Notification notification2 = notificationItem.f194730f;
                notification2.vibrate = new long[0];
                if (!tVar.f193253l && !tVar.f193252k) {
                    notification2.priority = 0;
                }
            }
        }
        return super.mo93224a(notificationItem, tVar);
    }

    /* renamed from: b */
    public Notification mo93225b(Notification notification, int i, int i2, PendingIntent pendingIntent, String str, String str2, String str3, Bitmap bitmap, int i3, String str4, PendingIntent pendingIntent2, int i4, String str5, PendingIntent pendingIntent3, String str6) {
        Notification notification2 = notification;
        int i5 = i2;
        String str7 = str;
        String str8 = str2;
        Bitmap bitmap2 = bitmap;
        int i6 = i3;
        int i7 = i4;
        C90116e.C90121c cVar = new C90116e.C90121c(this.f194739b, C78382a.m94651c());
        int i8 = i;
        int i9 = i8 == -1 ? C0966R.C0969drawable.c9k : i8;
        Notification notification3 = cVar.f258814z;
        notification3.ledARGB = -16711936;
        notification3.ledOnMS = 300;
        notification3.ledOffMS = 1000;
        notification3.flags = (notification3.flags & -2) | 1;
        notification3.icon = i9;
        cVar.mo124390o(str3);
        cVar.f258795g = pendingIntent;
        if (str7 != null) {
            cVar.mo124383h(str7);
        }
        if (str8 != null) {
            cVar.mo124382g(str8);
        }
        Notification notification4 = cVar.f258814z;
        notification4.defaults = i5;
        if ((i5 & 4) != 0) {
            notification4.flags |= 1;
        }
        if (bitmap2 != null) {
            cVar.mo124385j(bitmap2);
        }
        if (notification2 != null) {
            Uri uri = notification2.sound;
            if (uri != null) {
                cVar.mo124388m(uri);
            }
            long[] jArr = notification2.vibrate;
            if (jArr != null) {
                cVar.f258814z.vibrate = jArr;
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (str4 != null) {
            IconCompat c = i6 == 0 ? null : IconCompat.m138052c((Resources) null, "", i6);
            Bundle bundle = new Bundle();
            CharSequence d = C90116e.C90121c.m112748d(str4);
            boolean z = i15 < 29;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            cVar.f258790b.add(new C90116e.C90119a(c, d, pendingIntent2, bundle, arrayList2.isEmpty() ? null : (C77610j[]) arrayList2.toArray(new C77610j[arrayList2.size()]), arrayList.isEmpty() ? null : (C77610j[]) arrayList.toArray(new C77610j[arrayList.size()]), z, 0, true, false));
        }
        if (str5 != null) {
            IconCompat c2 = i7 == 0 ? null : IconCompat.m138052c((Resources) null, "", i7);
            Bundle bundle2 = new Bundle();
            CharSequence d2 = C90116e.C90121c.m112748d(str5);
            boolean z2 = i15 < 29;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            cVar.f258790b.add(new C90116e.C90119a(c2, d2, pendingIntent3, bundle2, arrayList4.isEmpty() ? null : (C77610j[]) arrayList4.toArray(new C77610j[arrayList4.size()]), arrayList3.isEmpty() ? null : (C77610j[]) arrayList3.toArray(new C77610j[arrayList3.size()]), z2, 0, true, false));
        }
        cVar.f258806r = "msg";
        AutoNewMessageEvent autoNewMessageEvent = new AutoNewMessageEvent();
        AutoNewMessageEvent.C67659a aVar = autoNewMessageEvent.f193479d;
        aVar.f193480a = str6;
        aVar.f193481b = str7;
        autoNewMessageEvent.publish();
        C90116e.C77603e eVar = autoNewMessageEvent.f193479d.f193482c;
        if (eVar != null) {
            Bundle bundle3 = new Bundle();
            C90116e.C77601d.C77602a aVar2 = ((C90116e.C77601d) eVar).f226231a;
            if (aVar2 != null) {
                Bundle bundle4 = new Bundle();
                int length = aVar2.f226232a.length;
                Parcelable[] parcelableArr = new Parcelable[length];
                for (int i16 = 0; i16 < length; i16++) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putString(MimeTypes.BASE_TYPE_TEXT, aVar2.f226232a[i16]);
                    bundle5.putString("author", (String) null);
                    parcelableArr[i16] = bundle5;
                }
                bundle4.putParcelableArray("messages", parcelableArr);
                C77610j jVar = aVar2.f226233b;
                if (jVar != null) {
                    bundle4.putParcelable("remote_input", new RemoteInput.Builder(jVar.f226260a).setLabel(jVar.f226261b).setChoices(jVar.f226262c).setAllowFreeFormInput(jVar.f226263d).addExtras(jVar.f226265f).build());
                }
                bundle4.putParcelable("on_reply", aVar2.f226234c);
                bundle4.putParcelable("on_read", aVar2.f226235d);
                bundle4.putStringArray("participants", aVar2.f226236e);
                bundle4.putLong(AppMeasurement.Param.TIMESTAMP, aVar2.f226237f);
                bundle3.putBundle("car_conversation", bundle4);
            }
            if (cVar.f258807s == null) {
                cVar.f258807s = new Bundle();
            }
            cVar.f258807s.putBundle("android.car.EXTENSIONS", bundle3);
        }
        cVar.mo124380e(true);
        Notification b = cVar.mo124378b();
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Field b2 = C80829b.m98679b(Notification.class, "mAllowSystemGeneratedContextualActions");
                b2.setAccessible(true);
                b2.set(b, Boolean.FALSE);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", th, "[-] Failure.", new Object[0]);
            }
        }
        return b;
    }

    /* renamed from: c */
    public Notification mo93226c(Notification notification, int i, int i2, PendingIntent pendingIntent, String str, String str2, String str3, Bitmap bitmap, String str4) {
        return mo93225b(notification, i, i2, pendingIntent, str, str2, str3, bitmap, 0, (String) null, (PendingIntent) null, 0, (String) null, (PendingIntent) null, str4);
    }

    /* renamed from: d */
    public ArrayList<C67841a> mo93227d() {
        try {
            ArrayList<C67841a> arrayList = (ArrayList) C39771c.m42564a(C114781l0.m161561h().getString("com.tencent.preference.notification.key.unread.talker", ""));
            return arrayList == null ? new ArrayList<>() : arrayList;
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e, "", new Object[0]);
            return new ArrayList<>();
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e2, "", new Object[0]);
            return new ArrayList<>();
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e3, "Justin_Exception:%s", e3.getMessage());
            return new ArrayList<>();
        }
    }

    /* renamed from: e */
    public C67841a mo93228e(List<C67841a> list, String str) {
        if (!(list == null || str == null)) {
            for (C67841a next : list) {
                if (next.f194740d.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v28, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r18v11 */
    /* JADX WARNING: type inference failed for: r18v12 */
    /* JADX WARNING: type inference failed for: r18v32 */
    /* JADX WARNING: type inference failed for: r18v33 */
    /* JADX WARNING: type inference failed for: r18v36 */
    /* JADX WARNING: type inference failed for: r18v37 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x040f A[SYNTHETIC, Splitter:B:141:0x040f] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo93229g(long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, int r33) {
        /*
            r25 = this;
            r11 = r25
            r12 = r26
            r14 = r28
            r0 = r30
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = p875ci.C67376e.m79725e(r2)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = p875ci.C67376e.m79727h(r3)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r7 = 0
            r5[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r8 = 1
            r5[r8] = r6
            java.lang.String r6 = "MicroMsg.Notification.AppMsg.Handle"
            java.lang.String r9 = "push:isShake: %B, isSound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r5)
            if (r32 == 0) goto L_0x0037
            return
        L_0x0037:
            r9 = 0
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x003e
            return
        L_0x003e:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
            if (r5 != 0) goto L_0x044f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r5 != 0) goto L_0x044f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r5 == 0) goto L_0x0052
            goto L_0x044f
        L_0x0052:
            android.content.SharedPreferences r5 = f40.C86718e.m107552u()
            java.lang.String r9 = "notification.user.state"
            int r5 = r5.getInt(r9, r7)
            r5 = r5 & r8
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            if (r5 == 0) goto L_0x007d
            android.content.SharedPreferences r5 = p645pj.C77091b.m93037s()
            java.lang.String r9 = "notification.status.webonline.push.open"
            int r5 = r5.getInt(r9, r7)
            r5 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r5 != 0) goto L_0x007d
            java.lang.String r0 = "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return
        L_0x007d:
            boolean r5 = p645pj.C77091b.m93034p()
            if (r5 != 0) goto L_0x0089
            java.lang.String r0 = "[NO NOTIFICATION]new MsgNotification setting no notification"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return
        L_0x0089:
            boolean r5 = m80195f(r26)
            if (r5 == 0) goto L_0x0095
            java.lang.String r0 = "[NO NOTIFICATION]already notify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return
        L_0x0095:
            bi.b r5 = p789bi.C67244b.C67246b.f193087a
            com.tencent.mm.booter.notification.queue.NotificationQueue r6 = r5.f193085e
            r6.mo93235a()
            bi.a r6 = r5.f193086f
            r6.mo91388i()
            android.content.SharedPreferences r6 = com.tencent.p014mm.network.C114781l0.m161561h()
            java.lang.String r9 = "com.tencent.preference.notification.key.unread.msg"
            int r6 = r6.getInt(r9, r7)
            int r6 = r6 + r8
            java.util.ArrayList r10 = r25.mo93227d()
            com.tencent.mm.booter.notification.f$a r10 = r11.mo93228e(r10, r14)
            if (r10 != 0) goto L_0x00b8
            r10 = 0
            goto L_0x00ba
        L_0x00b8:
            int r10 = r10.f194741e
        L_0x00ba:
            int r15 = r10 + 1
            java.util.ArrayList r10 = r25.mo93227d()
            com.tencent.mm.booter.notification.f$a r4 = r11.mo93228e(r10, r14)
            if (r4 != 0) goto L_0x00d3
            com.tencent.mm.booter.notification.f$a r4 = new com.tencent.mm.booter.notification.f$a
            r4.<init>()
            r4.f194740d = r14
            r4.f194741e = r8
            r10.add(r4)
            goto L_0x00d8
        L_0x00d3:
            int r7 = r4.f194741e
            int r7 = r7 + r8
            r4.f194741e = r7
        L_0x00d8:
            m80197i(r10)
            android.content.SharedPreferences r4 = com.tencent.p014mm.network.C114781l0.m161561h()
            r7 = 0
            int r4 = r4.getInt(r9, r7)
            int r4 = r4 + r8
            m80196h(r4)
            int r4 = r10.size()
            boolean r7 = p875ci.C67376e.m79726g()
            if (r7 == 0) goto L_0x00f4
            r2 = 0
            r3 = 0
        L_0x00f4:
            android.app.Notification r7 = new android.app.Notification
            r7.<init>()
            r9 = 2131233360(0x7f080a50, float:1.8082855E38)
            r7.icon = r9
            r9 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r7.ledARGB = r9
            r9 = 300(0x12c, float:4.2E-43)
            r7.ledOnMS = r9
            r9 = 1000(0x3e8, float:1.401E-42)
            r7.ledOffMS = r9
            int r9 = r5.mo91395i(r14)
            if (r9 <= 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            int r9 = r5.mo91397k(r14, r8)
        L_0x0116:
            r10 = r9
            ci.t r5 = r11.f194738a
            r5.f193250i = r6
            r5.f193249h = r4
            r5.f193253l = r2
            r5.f193252k = r3
            boolean r5 = p645pj.C77091b.m93019a()
            ci.t r9 = r11.f194738a
            r9.getClass()
            ci.t r9 = r11.f194738a
            ci.b r8 = r9.f193242a
            android.content.Context r12 = r9.f193247f
            r22 = 0
            r17 = r8
            r18 = r12
            r19 = r3
            r20 = r2
            r21 = r7
            r17.mo91511a(r18, r19, r20, r21, r22)
            ci.b r2 = r9.f193242a
            int r8 = r2.f193233a
            ci.t r2 = r11.f194738a
            ci.d r2 = r2.f193244c
            r2.getClass()
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r9 = 0
            r2[r9] = r3
            r3 = 1
            r2[r3] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r33)
            r9 = 2
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r9 = 3
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r12 = 4
            r2[r12] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r32)
            r13 = 5
            r2[r13] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r13 = 6
            r2[r13] = r3
            java.lang.String r3 = "MicroMsg.NotificationIntent"
            java.lang.String r13 = "[oneliang] notificationId:%s, userName:%s, msgType:%s, unReadMsgCount:%s, unReadTalkerCount:%s, isMuted:%s, isShowDetails:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r2)
            java.lang.Class<ht1.t3> r2 = ht1.C60204t3.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t3 r2 = (ht1.C60204t3) r2
            if (r2 == 0) goto L_0x018e
            r2.s20()
        L_0x018e:
            if (r2 == 0) goto L_0x0198
            boolean r2 = r2.Kv0(r1)
            if (r2 == 0) goto L_0x0198
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r13 = com.tencent.p014mm.p136ui.LauncherUI.class
            r3.<init>(r1, r13)
            java.lang.String r13 = "nofification_type"
            java.lang.String r9 = "new_msg_nofification"
            r3.putExtra(r13, r9)
            java.lang.String r9 = "Main_User"
            r3.putExtra(r9, r14)
            java.lang.String r9 = "MainUI_User_Last_Msg_Type"
            r13 = r33
            r3.putExtra(r9, r13)
            java.lang.String r9 = "MainUI_FromFinderNotification"
            r3.putExtra(r9, r2)
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r3.addFlags(r2)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r2)
            java.lang.String r2 = "pureIntent"
            p285zh.C119114c.m167923h(r3, r2)
            java.lang.String r2 = "talkerCount"
            java.lang.String r9 = "Intro_Is_Muti_Talker"
            if (r5 == 0) goto L_0x01d9
            r13 = 1
            r3.putExtra(r2, r13)
            if (r32 != 0) goto L_0x01e7
            r2 = 0
            r3.putExtra(r9, r2)
            goto L_0x01e7
        L_0x01d9:
            r12 = 0
            r13 = 1
            if (r4 > r13) goto L_0x01e1
            r3.putExtra(r9, r12)
            goto L_0x01e4
        L_0x01e1:
            r3.putExtra(r9, r13)
        L_0x01e4:
            r3.putExtra(r2, r4)
        L_0x01e7:
            java.lang.String r2 = "pushcontent_unread_count"
            r3.putExtra(r2, r6)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r1, r10, r3, r2)
            ci.t r2 = r11.f194738a
            ci.u r2 = r2.f193245d
            r2.getClass()
            com.tencent.mm.smiley.e r2 = com.tencent.p014mm.smiley.C96931e.m124499a()
            r3 = r29
            java.lang.String r2 = r2.mo135523c(r3)
            if (r5 == 0) goto L_0x0206
            goto L_0x020d
        L_0x0206:
            r2 = 2131831457(0x7f112aa1, float:1.929594E38)
            java.lang.String r2 = r1.getString(r2)
        L_0x020d:
            r12 = r2
            ci.t r2 = r11.f194738a
            ci.u r2 = r2.f193245d
            r2.getClass()
            if (r5 == 0) goto L_0x024a
            com.tencent.mm.smiley.e r2 = com.tencent.p014mm.smiley.C96931e.m124499a()
            java.lang.String r2 = r2.mo135523c(r0)
            r3 = 1
            if (r15 <= r3) goto L_0x0247
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.res.Resources r6 = r1.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r16 = 0
            r13[r16] = r3
            r3 = 2131689497(0x7f0f0019, float:1.9008011E38)
            java.lang.String r3 = r6.getQuantityString(r3, r15, r13)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            goto L_0x0267
        L_0x0247:
            r16 = 0
            goto L_0x0267
        L_0x024a:
            r16 = 0
            android.content.res.Resources r2 = r1.getResources()
            r13 = 2
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r3[r16] = r13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13 = 1
            r3[r13] = r6
            r6 = 2131689498(0x7f0f001a, float:1.9008013E38)
            java.lang.String r2 = r2.getQuantityString(r6, r4, r3)
        L_0x0267:
            r13 = r2
            ci.t r2 = r11.f194738a
            ci.u r2 = r2.f193245d
            r2.getClass()
            if (r5 == 0) goto L_0x027a
            com.tencent.mm.smiley.e r2 = com.tencent.p014mm.smiley.C96931e.m124499a()
            java.lang.String r0 = r2.mo135523c(r0)
            goto L_0x0281
        L_0x027a:
            r0 = 2131833716(0x7f113374, float:1.9300522E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0281:
            r19 = r0
            boolean r0 = p645pj.C77091b.m93019a()
            if (r0 == 0) goto L_0x0418
            ci.t r0 = r11.f194738a
            ci.a r0 = r0.f193246e
            r0.getClass()
            java.lang.String r3 = "MicroMsg.NotificationAvatar"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
            if (r0 == 0) goto L_0x0299
            goto L_0x02ef
        L_0x0299:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = 64
            r0.<init>(r4)
            java.lang.String r4 = "wcf://avatar/"
            r0.append(r4)
            byte[] r4 = r28.getBytes()
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)
            r5 = 2
            r6 = 0
            java.lang.String r2 = r4.substring(r6, r5)
            r0.append(r2)
            r2 = 47
            r0.append(r2)
            r6 = 4
            java.lang.String r6 = r4.substring(r5, r6)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r2 = "user_"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ".png"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            r0.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            boolean r4 = r0.mo119967g()     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            if (r4 != 0) goto L_0x02f3
            java.lang.String r0 = "SmallBM get bm file not exsit:%s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            r4 = 0
            r5[r4] = r2     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r5)     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
        L_0x02ef:
            r18 = r10
            goto L_0x0412
        L_0x02f3:
            long r4 = r0.mo119980r()     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            int r0 = (int) r4     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            if (r0 <= 0) goto L_0x03d1
            r4 = 36864(0x9000, float:5.1657E-41)
            r5 = 36880(0x9010, float:5.168E-41)
            if (r0 == r4) goto L_0x0306
            if (r0 == r5) goto L_0x0306
            goto L_0x03d1
        L_0x0306:
            if (r2 == 0) goto L_0x03c3
            boolean r6 = r2.isEmpty()     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            if (r6 != 0) goto L_0x03c3
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            r5 = 0
            java.nio.channels.ReadableByteChannel r6 = com.tencent.p014mm.vfs.C86013q1.m106424F(r6, r5)     // Catch:{ Exception -> 0x03bf, OutOfMemoryError -> 0x03bb }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch:{ Exception -> 0x03b6, OutOfMemoryError -> 0x03b1 }
            r6.read(r4)     // Catch:{ Exception -> 0x03b6, OutOfMemoryError -> 0x03b1 }
            r5 = 0
            r4.position(r5)     // Catch:{ Exception -> 0x03b6, OutOfMemoryError -> 0x03b1 }
            r5 = 36880(0x9010, float:5.168E-41)
            if (r0 != r5) goto L_0x035e
            r5 = 16
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch:{ Exception -> 0x03b6, OutOfMemoryError -> 0x03b1 }
            r6.read(r5)     // Catch:{ Exception -> 0x03b6, OutOfMemoryError -> 0x03b1 }
            r18 = r10
            r10 = 0
            long r20 = r5.getLong(r10)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r23 = 1
            int r5 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x035c
            java.lang.String r4 = "SmallBM get bm header invalid flag:%d size:%d file:%s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r16 = 0
            r5[r16] = r10     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r10 = 1
            r5[r10] = r0     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r10 = 2
            r5[r10] = r2     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r6.close()     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            goto L_0x0412
        L_0x035c:
            r5 = 0
            goto L_0x0361
        L_0x035e:
            r18 = r10
            r5 = 1
        L_0x0361:
            java.lang.String r10 = "SmallBM get bm size:%d shouldRemoveCorner:%b file:%s"
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r16 = 0
            r11[r16] = r0     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r17 = 1
            r11[r17] = r0     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r17 = 2
            r11[r17] = r2     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r11)     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            r6.close()     // Catch:{ Exception -> 0x03af, OutOfMemoryError -> 0x03ad }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r6 = 96
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r6, r0)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r0.copyPixelsFromBuffer(r4)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            if (r5 == 0) goto L_0x03aa
            r4 = 78
            r5 = 9
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r5, r5, r4, r4)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            java.lang.String r5 = "recycle bitmap:%s"
            r6 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r11 = 0
            r10[r11] = r6     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r10)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r0.recycle()     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r2 = r4
            goto L_0x0413
        L_0x03aa:
            r2 = r0
            goto L_0x0413
        L_0x03ad:
            r0 = move-exception
            goto L_0x03b4
        L_0x03af:
            r0 = move-exception
            goto L_0x03b9
        L_0x03b1:
            r0 = move-exception
            r18 = r10
        L_0x03b4:
            r4 = 2
            goto L_0x03e8
        L_0x03b6:
            r0 = move-exception
            r18 = r10
        L_0x03b9:
            r4 = 2
            goto L_0x03fc
        L_0x03bb:
            r0 = move-exception
            r18 = r10
            goto L_0x03e6
        L_0x03bf:
            r0 = move-exception
            r18 = r10
            goto L_0x03fa
        L_0x03c3:
            r18 = r10
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            java.lang.String r4 = "path is empty"
            r0.<init>(r4)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            throw r0     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
        L_0x03cd:
            r0 = move-exception
            goto L_0x03e6
        L_0x03cf:
            r0 = move-exception
            goto L_0x03fa
        L_0x03d1:
            r18 = r10
            java.lang.String r4 = "SmallBM get bm invalid size:%d file:%s"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r5 = 0
            r6[r5] = r0     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            r5 = 1
            r6[r5] = r2     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r6)     // Catch:{ Exception -> 0x03cf, OutOfMemoryError -> 0x03cd }
            goto L_0x0412
        L_0x03e6:
            r4 = 2
            r6 = 0
        L_0x03e8:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r4[r5] = r0
            r5 = 1
            r4[r5] = r2
            java.lang.String r0 = "SmallBM get OutOfMemoryError e:%s file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            goto L_0x040d
        L_0x03fa:
            r4 = 2
            r6 = 0
        L_0x03fc:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r4[r5] = r0
            r5 = 1
            r4[r5] = r2
            java.lang.String r0 = "SmallBM get exception e:%s file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
        L_0x040d:
            if (r6 == 0) goto L_0x0412
            r6.close()     // Catch:{ Exception -> 0x0412 }
        L_0x0412:
            r2 = 0
        L_0x0413:
            android.graphics.Bitmap r0 = p875ci.C67372a.m79723a(r1, r2)
            goto L_0x041b
        L_0x0418:
            r18 = r10
            r0 = 0
        L_0x041b:
            r3 = 2131233736(0x7f080bc8, float:1.8083618E38)
            r1 = r25
            r2 = r7
            r4 = r8
            r5 = r9
            r6 = r12
            r7 = r13
            r8 = r19
            r9 = r0
            r11 = r18
            r10 = r28
            android.app.Notification r0 = r1.mo93226c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.booter.notification.NotificationItem r1 = new com.tencent.mm.booter.notification.NotificationItem
            r1.<init>((int) r11, (java.lang.String) r14, (android.app.Notification) r0)
            r2 = r26
            r1.f194733i = r2
            r1.f194734j = r15
            r2 = r25
            ci.t r0 = r2.f194738a
            r2.mo93224a(r1, r0)
            ci.t r0 = r2.f194738a
            int r0 = r0.mo91520b()
            com.tencent.p014mm.booter.notification.C67843i.m80207d(r0)
            com.tencent.p014mm.booter.notification.C67843i.m80208e(r14, r15)
            return
        L_0x044f:
            r2 = r11
            java.lang.String r0 = "[NO NOTIFICATION] Util.isNullOrNil(userName) || Util.isNullOrNil(nickName) || Util.isNullOrNil(content)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.notification.C67840f.mo93229g(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }
}
