package com.tencent.p014mm.booter.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Set;
import p206nj.C11171e;
import p875ci.C67376e;
import p875ci.C67378t;
import p918s2.C77604h;

/* renamed from: com.tencent.mm.booter.notification.NotificationItem */
public class NotificationItem implements Parcelable {
    public static final Parcelable.Creator<NotificationItem> CREATOR = new C67838a();

    /* renamed from: d */
    public int f194728d;

    /* renamed from: e */
    public Bitmap f194729e;

    /* renamed from: f */
    public Notification f194730f;

    /* renamed from: g */
    public PendingIntent f194731g;

    /* renamed from: h */
    public String f194732h;

    /* renamed from: i */
    public long f194733i;

    /* renamed from: j */
    public int f194734j;

    /* renamed from: n */
    public boolean f194735n;

    /* renamed from: o */
    public int f194736o;

    /* renamed from: p */
    public int f194737p;

    /* renamed from: com.tencent.mm.booter.notification.NotificationItem$a */
    public class C67838a implements Parcelable.Creator<NotificationItem> {
        public Object createFromParcel(Parcel parcel) {
            return new NotificationItem(parcel, (C67838a) null);
        }

        public Object[] newArray(int i) {
            return new NotificationItem[i];
        }
    }

    public NotificationItem(int i, String str, Notification notification) {
        this(i, str, notification, true, 0);
    }

    /* renamed from: a */
    public final void mo93218a(Context context) {
        if (context != null) {
            if (this.f194730f == null) {
                Log.m105920e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
                return;
            }
            Context context2 = MMApplicationContext.getContext();
            if (context2 == null) {
                Log.m105920e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
            } else {
                Notification notification = this.f194730f;
                if (notification == null) {
                    Log.m105920e("MicroMsg.NotificationItem", "error, safeCheck but mNotification == null");
                } else {
                    if (context2.getResources().getDrawable(notification.icon) == null) {
                        this.f194730f.icon = C0966R.C0969drawable.icon;
                    }
                }
            }
            Notification notification2 = this.f194730f;
            Log.m105925i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", Integer.valueOf(this.f194730f.defaults), notification2.sound, C67378t.m79736a(notification2.vibrate));
            try {
                Set<String> set = C67376e.f193236b;
                if (((AudioManager) MMApplicationContext.getContext().getSystemService("audio")).getRingerMode() == 1) {
                    Notification notification3 = this.f194730f;
                    if (notification3.defaults != 2 && notification3.vibrate == null) {
                        notification3.defaults = 0;
                        notification3.sound = null;
                        Log.m105924i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
                    }
                }
                if (C11171e.m11046c(26)) {
                    Log.m105924i("MicroMsg.NotificationItem", "manual add led to notification");
                    Notification notification4 = this.f194730f;
                    notification4.ledARGB = -16711936;
                    notification4.ledOnMS = 300;
                    notification4.ledOffMS = 1000;
                }
                Context context3 = MMApplicationContext.getContext();
                C77604h hVar = new C77604h(context3);
                int i = this.f194728d;
                Notification notification5 = this.f194730f;
                Bundle bundle = notification5.extras;
                if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
                    C77604h.C77605a aVar = new C77604h.C77605a(context3.getPackageName(), i, (String) null, notification5);
                    synchronized (C77604h.f226241f) {
                        if (C77604h.f226242g == null) {
                            C77604h.f226242g = new C77604h.C77608c(context3.getApplicationContext());
                        }
                        C77604h.f226242g.f226252e.obtainMessage(0, aVar).sendToTarget();
                    }
                    hVar.f226244b.cancel((String) null, i);
                } else {
                    hVar.f226244b.notify((String) null, i, notification5);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NotificationItem", e, "Notification Exception?", new Object[0]);
            }
            long j = this.f194733i;
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i2 != 0 && i2 != 0) {
                String string = C114781l0.m161561h().getString("com.tencent.preference.notification.key.all.notified.msgid", "");
                if (string.length() > 3000) {
                    string = string.substring(string.length() / 2, string.length());
                }
                if (!C67840f.m80195f(j)) {
                    String str = string + j + "%";
                    C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.all.notified.msgid", str).apply();
                    Log.m105919d("MicroMsg.Notification.AppMsg.Handle", "setNotifiedMsgId: %s", str);
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "id: " + this.f194728d + ",msgId: " + this.f194733i + ",userName: " + this.f194732h + ",unreadCount: " + this.f194734j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f194728d);
        String str = this.f194732h;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f194729e, 0);
        parcel.writeParcelable(this.f194730f, 0);
        parcel.writeParcelable(this.f194731g, 0);
        parcel.writeByte(this.f194735n ? (byte) 1 : 0);
        parcel.writeLong(this.f194733i);
        parcel.writeInt(this.f194734j);
    }

    public NotificationItem(int i, Notification notification, boolean z) {
        this(i, (String) null, notification, z, 0);
    }

    public NotificationItem(int i, String str, Notification notification, boolean z, int i2) {
        this.f194733i = 0;
        this.f194734j = 0;
        this.f194735n = true;
        this.f194736o = 0;
        this.f194737p = 0;
        this.f194728d = i;
        this.f194732h = str;
        this.f194729e = notification.largeIcon;
        this.f194730f = notification;
        this.f194735n = z;
        this.f194736o = i2;
    }

    public NotificationItem(Parcel parcel, C67838a aVar) {
        this.f194728d = -1;
        this.f194733i = 0;
        boolean z = false;
        this.f194734j = 0;
        this.f194735n = true;
        this.f194736o = 0;
        this.f194737p = 0;
        if (parcel != null) {
            this.f194728d = parcel.readInt();
            this.f194732h = parcel.readString();
            this.f194729e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
            this.f194730f = (Notification) parcel.readParcelable(Notification.class.getClassLoader());
            this.f194731g = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
            this.f194735n = parcel.readByte() != 0 ? true : z;
            this.f194733i = parcel.readLong();
            this.f194734j = parcel.readInt();
        }
    }
}
