package p789bi;

import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: bi.a */
public class C67242a implements Serializable, Iterable<C67243a> {

    /* renamed from: d */
    public LinkedList<C67243a> f193077d;

    /* renamed from: f */
    public synchronized boolean mo91386f(int i) {
        if (i == -1) {
            return false;
        }
        if (this.f193077d == null) {
            mo91388i();
        }
        LinkedList<C67243a> linkedList = new LinkedList<>();
        Iterator<C67243a> it = this.f193077d.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C67243a next = it.next();
            if (next.f193078d != i) {
                linkedList.add(next);
            } else {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        this.f193077d = linkedList;
        mo91390k();
        return true;
    }

    /* renamed from: h */
    public void mo91387h() {
        C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.queue", "").apply();
        Log.m105925i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", Integer.valueOf(this.f193077d.size()), toString());
    }

    /* renamed from: i */
    public synchronized void mo91388i() {
        LinkedList<C67243a> linkedList;
        try {
            LinkedList<C67243a> linkedList2 = (LinkedList) C39771c.m42564a(C114781l0.m161561h().getString("com.tencent.preference.notification.key.queue", ""));
            this.f193077d = linkedList2;
            if (linkedList2 == null) {
                linkedList = new LinkedList<>();
                this.f193077d = linkedList;
            }
        } catch (Exception e) {
            try {
                Log.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", e, "", new Object[0]);
                if (this.f193077d == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                if (this.f193077d == null) {
                    this.f193077d = new LinkedList<>();
                }
                throw th;
            }
        }
        Log.m105925i("MicroMsg.NotificationAppMsgQueue", "restore size:%d, %s", Integer.valueOf(this.f193077d.size()), toString());
    }

    public Iterator<C67243a> iterator() {
        if (this.f193077d == null) {
            mo91388i();
        }
        return this.f193077d.iterator();
    }

    /* renamed from: k */
    public synchronized void mo91390k() {
        LinkedList<C67243a> linkedList = this.f193077d;
        if (linkedList != null) {
            Log.m105919d("MicroMsg.NotificationAppMsgQueue", "save: size: %d", Integer.valueOf(linkedList.size()));
            if (this.f193077d.isEmpty()) {
                mo91387h();
                return;
            }
            try {
                C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.queue", C39771c.m42565b(new LinkedList(this.f193077d))).apply();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", e, "", new Object[0]);
            }
            Log.m105925i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", Integer.valueOf(this.f193077d.size()), toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Iterator<C67243a> it = this.f193077d.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(";  ");
        }
        return sb.toString();
    }

    /* renamed from: bi.a$a */
    public static class C67243a implements Serializable {

        /* renamed from: d */
        public int f193078d;

        /* renamed from: e */
        public long f193079e;

        /* renamed from: f */
        public String f193080f;

        /* renamed from: g */
        public int f193081g;

        /* renamed from: h */
        public boolean f193082h;

        /* renamed from: i */
        public int f193083i;

        public C67243a(int i, long j, String str, int i2, boolean z, int i3) {
            this.f193078d = i;
            this.f193079e = j;
            this.f193080f = str;
            this.f193081g = i2;
            this.f193082h = z;
            this.f193083i = i3;
        }

        public String toString() {
            return this.f193080f + " id:" + this.f193079e + " unReadCount:" + this.f193081g + "　notificationId:" + this.f193078d;
        }

        public C67243a(int i, boolean z) {
            this.f193079e = -1;
            this.f193080f = "";
            this.f193083i = 0;
            this.f193078d = i;
            this.f193082h = z;
        }
    }
}
