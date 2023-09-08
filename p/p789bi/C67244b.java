package p789bi;

import android.graphics.Bitmap;
import com.tencent.p014mm.booter.notification.NotificationItem;
import com.tencent.p014mm.booter.notification.queue.NotificationQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import p789bi.C67242a;
import p918s2.C77604h;

/* renamed from: bi.b */
public class C67244b implements Iterable<NotificationItem> {

    /* renamed from: d */
    public int f193084d = -1;

    /* renamed from: e */
    public NotificationQueue f193085e;

    /* renamed from: f */
    public C67242a f193086f;

    /* renamed from: bi.b$b */
    public static final class C67246b {

        /* renamed from: a */
        public static final C67244b f193087a = new C67244b((C67245a) null);
    }

    public C67244b(C67245a aVar) {
        NotificationQueue notificationQueue = new NotificationQueue();
        this.f193085e = notificationQueue;
        this.f193086f = new C67242a();
        notificationQueue.mo93235a();
        this.f193086f.mo91388i();
    }

    /* renamed from: f */
    public void mo91393f(C77604h hVar, int i) {
        if (hVar == null) {
            Log.m105920e("MicroMsg.Notification.Queue", "manager is null???");
            return;
        }
        hVar.f226244b.cancel((String) null, i);
        mo91399m(i);
    }

    /* renamed from: h */
    public int mo91394h() {
        NotificationQueue notificationQueue = this.f193085e;
        if (notificationQueue.f194758a == null) {
            notificationQueue.mo93235a();
        }
        Iterator it = notificationQueue.f194758a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((NotificationItem) it.next()).f194737p;
        }
        return i;
    }

    /* renamed from: i */
    public int mo91395i(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        Iterator<C67242a.C67243a> it = this.f193086f.iterator();
        while (it.hasNext()) {
            C67242a.C67243a next = it.next();
            if (next.f193080f.equals(str)) {
                return next.f193078d;
            }
        }
        return -1;
    }

    public Iterator<NotificationItem> iterator() {
        NotificationQueue notificationQueue = this.f193085e;
        if (notificationQueue.f194758a == null) {
            notificationQueue.mo93235a();
        }
        return notificationQueue.f194758a.iterator();
    }

    /* renamed from: k */
    public int mo91397k(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<C67242a.C67243a> it = this.f193086f.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + it.next().f193078d + ",";
        }
        int i = 4097;
        int i2 = z ? 4097 : 4102;
        while (true) {
            if (!str2.contains(i2 + "")) {
                break;
            }
            i2++;
        }
        if (i2 < 4102 || !z) {
            i = i2;
        }
        if (!Util.isNullOrNil(str) && z) {
            i = str.hashCode();
        }
        Log.m105919d("MicroMsg.Notification.Queue", "create id spend: %d, id: %d, isCustomControl: %B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(i), Boolean.valueOf(z));
        return i;
    }

    /* renamed from: l */
    public NotificationItem mo91398l(NotificationItem notificationItem) {
        NotificationItem notificationItem2 = null;
        if (notificationItem == null) {
            Log.m105920e("MicroMsg.Notification.Queue", "notification item null when put");
            return null;
        }
        int i = notificationItem.f194728d;
        if (i == -1) {
            Log.m105920e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
            return null;
        }
        int i2 = this.f193084d;
        if (i2 > 0) {
            if (i2 == i) {
                Log.m105919d("MicroMsg.Notification.Queue", "remove mark: %d", Integer.valueOf(i2));
                mo91399m(this.f193084d);
            }
            this.f193084d = -1;
        }
        mo91399m(notificationItem.f194728d);
        NotificationQueue notificationQueue = this.f193085e;
        if (notificationQueue.f194758a == null) {
            notificationQueue.mo93235a();
        }
        if (notificationQueue.f194758a.size() >= 5) {
            int i3 = 0;
            while (true) {
                NotificationQueue notificationQueue2 = this.f193085e;
                if (notificationQueue2.f194758a == null) {
                    notificationQueue2.mo93235a();
                }
                if (i3 >= notificationQueue2.f194758a.size()) {
                    break;
                }
                NotificationQueue notificationQueue3 = this.f193085e;
                if (notificationQueue3.f194758a == null) {
                    notificationQueue3.mo93235a();
                }
                NotificationItem notificationItem3 = (NotificationItem) notificationQueue3.f194758a.get(i3);
                if (notificationItem3.f194735n) {
                    C67242a aVar = this.f193086f;
                    aVar.getClass();
                    if (aVar.mo91386f(notificationItem3.f194728d)) {
                        Log.m105919d("MicroMsg.NotificationAppMsgQueue", "remove: [%s]", notificationItem3.toString());
                    }
                    NotificationQueue notificationQueue4 = this.f193085e;
                    synchronized (notificationQueue4) {
                        if (notificationQueue4.f194758a == null) {
                            notificationQueue4.mo93235a();
                        }
                        if (notificationQueue4.f194758a.remove(notificationItem3)) {
                            notificationQueue4.mo93236b();
                        }
                    }
                    notificationItem2 = notificationItem3;
                } else {
                    i3++;
                }
            }
        }
        NotificationQueue notificationQueue5 = this.f193085e;
        synchronized (notificationQueue5) {
            if (notificationQueue5.f194758a == null) {
                notificationQueue5.mo93235a();
            }
            if (notificationQueue5.f194758a.add(notificationItem)) {
                notificationQueue5.mo93236b();
            }
        }
        C67242a aVar2 = this.f193086f;
        synchronized (aVar2) {
            if (aVar2.f193077d == null) {
                aVar2.mo91388i();
            }
            aVar2.mo91386f(notificationItem.f194728d);
            if (!notificationItem.f194735n || Util.isNullOrNil(notificationItem.f194732h)) {
                aVar2.f193077d.add(new C67242a.C67243a(notificationItem.f194728d, notificationItem.f194735n));
                Log.m105919d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", notificationItem.toString());
            } else {
                Iterator<C67242a.C67243a> it = aVar2.f193077d.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    C67242a.C67243a next = it.next();
                    if (next.f193080f.equals(notificationItem.f194732h)) {
                        int i4 = notificationItem.f194728d;
                        long j = notificationItem.f194733i;
                        String str = notificationItem.f194732h;
                        int i5 = notificationItem.f194734j;
                        boolean z2 = notificationItem.f194735n;
                        int i6 = notificationItem.f194736o;
                        next.f193078d = i4;
                        next.f193079e = j;
                        next.f193080f = str;
                        next.f193081g = i5;
                        next.f193082h = z2;
                        next.f193083i = i6;
                        z = false;
                    }
                }
                if (z) {
                    aVar2.f193077d.add(new C67242a.C67243a(notificationItem.f194728d, notificationItem.f194733i, notificationItem.f194732h, notificationItem.f194734j, notificationItem.f194735n, notificationItem.f194736o));
                    Log.m105919d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", notificationItem.toString());
                }
            }
            aVar2.mo91390k();
        }
        Object[] objArr = new Object[2];
        objArr[0] = notificationItem.toString();
        NotificationQueue notificationQueue6 = this.f193085e;
        if (notificationQueue6.f194758a == null) {
            notificationQueue6.mo93235a();
        }
        objArr[1] = Integer.valueOf(notificationQueue6.f194758a.size());
        Log.m105925i("MicroMsg.Notification.Queue", "put item: %s, queuesize: %d", objArr);
        return notificationItem2;
    }

    /* renamed from: m */
    public void mo91399m(int i) {
        NotificationItem notificationItem;
        this.f193086f.mo91386f(i);
        NotificationQueue notificationQueue = this.f193085e;
        synchronized (notificationQueue) {
            if (notificationQueue.f194758a == null) {
                notificationQueue.mo93235a();
            }
            Iterator it = notificationQueue.f194758a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    notificationItem = null;
                    break;
                }
                notificationItem = (NotificationItem) it.next();
                if (notificationItem.f194728d == i) {
                    break;
                }
            }
            if (notificationItem != null && notificationQueue.f194758a.remove(notificationItem)) {
                notificationQueue.mo93236b();
            }
        }
        if (notificationItem != null) {
            synchronized (notificationItem) {
                Bitmap bitmap = notificationItem.f194729e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.NotificationItem", "recycle bitmap:%s", notificationItem.f194729e.toString());
                    notificationItem.f194729e.recycle();
                }
                notificationItem.f194730f = null;
                notificationItem.f194729e = null;
                notificationItem.f194731g = null;
            }
        }
    }
}
