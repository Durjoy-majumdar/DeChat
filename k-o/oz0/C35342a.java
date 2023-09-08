package oz0;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import dz0.C31352e;
import f40.C86709a0;
import hz0.C46153l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import pz0.C12023e;
import pz0.C35745m;
import pz0.C35746n;

/* renamed from: oz0.a */
public class C35342a implements C11385n {

    /* renamed from: d */
    public byte[] f94653d = new byte[0];

    /* renamed from: e */
    public List<C35745m> f94654e;

    /* renamed from: f */
    public List<C35745m> f94655f;

    /* renamed from: g */
    public List<WeakReference<C31352e>> f94656g = new ArrayList();

    /* renamed from: h */
    public int f94657h = 0;

    /* renamed from: i */
    public int f94658i = 5;

    /* renamed from: j */
    public MMHandler f94659j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public Runnable f94660n = new C35343a(this);

    /* renamed from: oz0.a$a */
    public class C35343a implements Runnable {
        public C35343a(C35342a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene after 5s");
        }
    }

    public C35342a() {
        C35746n Mx0 = C46153l0.Mx0();
        Mx0.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Mx0.f95465d.rawQuery("select * from ShareCardSyncItemInfo where retryCount < 10", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C35745m mVar = new C35745m();
            mVar.convertFrom(rawQuery);
            arrayList.add(mVar);
        }
        rawQuery.close();
        Log.m105919d("MicroMsg.ShareCardSyncItemInfoStorage", "getAll, share card count = %d", Integer.valueOf(arrayList.size()));
        this.f94654e = arrayList;
        this.f94655f = new ArrayList();
        Log.m105925i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", Integer.valueOf(this.f94654e.size()));
        C86709a0.m107529k().f251779b.mo123455a(1132, this);
    }

    /* renamed from: a */
    public void mo60216a() {
        Log.m105924i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i = currentTimeMillis - this.f94657h;
        int i2 = this.f94658i;
        if (i2 <= 0) {
            i2 = 5;
        }
        if (i < i2) {
            Log.m105924i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + i);
            this.f94659j.removeCallbacks(this.f94660n);
            this.f94659j.postDelayed(this.f94660n, (long) (i2 * 1000));
        }
        this.f94657h = currentTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3 >= r8.size()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r4 = r8.get(r3);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r5 >= r1.size()) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r4 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r1.get(r5) == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r4.equals(((pz0.C35745m) r1.get(r5)).field_card_id) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0.add((pz0.C35745m) r1.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<pz0.C35745m> mo60217b(java.util.LinkedList<java.lang.String> r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            byte[] r2 = r7.f94653d
            monitor-enter(r2)
            java.util.List<pz0.m> r3 = r7.f94654e     // Catch:{ all -> 0x0061 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0061 }
            int r3 = r3.size()     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x0020
            java.lang.String r8 = "MicroMsg.ShareCardBatchGetCardMgr"
            java.lang.String r1 = "getSuccessShareCardSyncItem pendingList size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            return r0
        L_0x0020:
            java.util.List<pz0.m> r3 = r7.f94654e     // Catch:{ all -> 0x0061 }
            r1.addAll(r3)     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            r2 = 0
            r3 = 0
        L_0x0028:
            int r4 = r8.size()
            if (r3 >= r4) goto L_0x0060
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
        L_0x0035:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x005d
            if (r4 == 0) goto L_0x005a
            java.lang.Object r6 = r1.get(r5)
            if (r6 == 0) goto L_0x005a
            java.lang.Object r6 = r1.get(r5)
            pz0.m r6 = (pz0.C35745m) r6
            java.lang.String r6 = r6.field_card_id
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x005a
            java.lang.Object r6 = r1.get(r5)
            pz0.m r6 = (pz0.C35745m) r6
            r0.add(r6)
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0035
        L_0x005d:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0060:
            return r0
        L_0x0061:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oz0.C35342a.mo60217b(java.util.LinkedList):java.util.ArrayList");
    }

    /* renamed from: c */
    public void mo60218c() {
        C31352e eVar;
        if (this.f94656g != null) {
            for (int i = 0; i < ((ArrayList) this.f94656g).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f94656g).get(i);
                if (!(weakReference == null || (eVar = (C31352e) weakReference.get()) == null)) {
                    eVar.mo58084H4();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo60219d(C31352e eVar) {
        if (this.f94656g == null) {
            this.f94656g = new ArrayList();
        }
        if (eVar != null) {
            this.f94656g.add(new WeakReference(eVar));
        }
    }

    /* renamed from: e */
    public void mo60220e(C31352e eVar) {
        C31352e eVar2;
        if (this.f94656g != null && eVar != null) {
            int i = 0;
            while (i < this.f94656g.size()) {
                WeakReference weakReference = this.f94656g.get(i);
                if (weakReference == null || (eVar2 = (C31352e) weakReference.get()) == null || !eVar2.equals(eVar)) {
                    i++;
                } else {
                    this.f94656g.remove(weakReference);
                    return;
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            ((C12023e) yVar).getClass();
            ArrayList<C35745m> b = mo60217b((LinkedList<String>) null);
            Log.m105925i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, batch get succ, remove succ id list, size = %d", Integer.valueOf(b.size()));
            synchronized (this.f94653d) {
                ((ArrayList) this.f94654e).removeAll(b);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
            C35746n Mx0 = C46153l0.Mx0();
            Mx0.getClass();
            if (b.size() == 0) {
                Log.m105920e("MicroMsg.ShareCardSyncItemInfoStorage", "deleteList fail, share card list is empty");
            } else {
                Iterator<C35745m> it = b.iterator();
                while (it.hasNext()) {
                    C35745m next = it.next();
                    if (next != null) {
                        Mx0.delete(next, new String[0]);
                    }
                }
            }
            C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            Log.m105925i("MicroMsg.ShareCardBatchGetCardMgr", "onSceneEnd do transaction use time %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            LinkedList linkedList = new LinkedList();
            synchronized (this.f94653d) {
                if (((ArrayList) this.f94654e).size() == 0) {
                    Log.m105924i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, no pending cardinfo ,no need to get");
                } else {
                    linkedList.addAll(this.f94654e);
                    LinkedList linkedList2 = new LinkedList();
                    if (linkedList.size() <= 10) {
                        linkedList2.addAll(linkedList);
                    } else {
                        linkedList2.addAll(linkedList.subList(0, 10));
                    }
                    LinkedList linkedList3 = new LinkedList();
                    for (int i3 = 0; i3 < linkedList2.size(); i3++) {
                        linkedList3.add(((C35745m) linkedList2.get(i3)).field_card_id);
                    }
                }
            }
            mo60218c();
            return;
        }
        Log.m105921e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        ((C12023e) yVar).getClass();
        ArrayList<C35745m> b2 = mo60217b((LinkedList<String>) null);
        synchronized (this.f94653d) {
            if (b2.size() > 0) {
                ((ArrayList) this.f94654e).removeAll(b2);
                ((ArrayList) this.f94655f).addAll(b2);
            }
        }
        C35746n Mx02 = C46153l0.Mx0();
        Mx02.getClass();
        if (b2.size() == 0) {
            Log.m105920e("MicroMsg.ShareCardSyncItemInfoStorage", "increaseRetryCount fail, share card list is empty");
            return;
        }
        Iterator<C35745m> it4 = b2.iterator();
        while (it4.hasNext()) {
            C35745m next2 = it4.next();
            if (next2 != null) {
                next2.field_retryCount++;
                Mx02.update(next2, new String[0]);
            }
        }
    }
}
