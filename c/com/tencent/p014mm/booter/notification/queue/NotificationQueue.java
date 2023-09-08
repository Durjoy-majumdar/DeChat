package com.tencent.p014mm.booter.notification.queue;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.booter.notification.NotificationItem;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.booter.notification.queue.NotificationQueue */
public class NotificationQueue {

    /* renamed from: a */
    public ParcelNotificationQueue f194758a;

    /* renamed from: com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue */
    public static class ParcelNotificationQueue extends LinkedList<NotificationItem> implements Parcelable {
        public static final Parcelable.Creator<ParcelNotificationQueue> CREATOR = new C67848a();

        /* renamed from: com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue$a */
        public class C67848a implements Parcelable.Creator<ParcelNotificationQueue> {
            public Object createFromParcel(Parcel parcel) {
                ParcelNotificationQueue parcelNotificationQueue = new ParcelNotificationQueue();
                int readInt = parcel.readInt();
                for (int i = 0; i < readInt; i++) {
                    parcelNotificationQueue.add((NotificationItem) parcel.readParcelable(NotificationItem.class.getClassLoader()));
                }
                return parcelNotificationQueue;
            }

            public Object[] newArray(int i) {
                return new ParcelNotificationQueue[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((NotificationItem) it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo93235a() {
        Log.m105918d("MicroMsg.NotificationCustomQueue", "jacks _restore");
        if (this.f194758a == null) {
            this.f194758a = new ParcelNotificationQueue();
        }
        Log.m105919d("MicroMsg.NotificationCustomQueue", "jacks _restore: %d", Integer.valueOf(this.f194758a.size()));
    }

    /* renamed from: b */
    public void mo93236b() {
        ParcelNotificationQueue parcelNotificationQueue = this.f194758a;
        if (parcelNotificationQueue != null) {
            Log.m105919d("MicroMsg.NotificationCustomQueue", "jacks save: %d", Integer.valueOf(parcelNotificationQueue.size()));
            if (this.f194758a.isEmpty()) {
                C114781l0.m161561h().edit().putString("com.tencent.preference.notification.queue", "").apply();
                if (this.f194758a == null) {
                    mo93235a();
                }
                Log.m105919d("MicroMsg.NotificationCustomQueue", "jacks _reset: %d", Integer.valueOf(this.f194758a.size()));
            }
        }
    }
}
