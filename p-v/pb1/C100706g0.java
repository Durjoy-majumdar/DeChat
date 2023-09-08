package pb1;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p749xh.C66261f3;
import sf0.C77691f;
import te3.C51681vd0;
import te3.C51816wd0;
import te3.C51958xd0;
import xb1.C102614d;
import xb1.C102615e;

/* renamed from: pb1.g0 */
public class C100706g0 {

    /* renamed from: a */
    public C51958xd0 f295054a = new C51958xd0();

    /* renamed from: b */
    public HashMap<String, WeakReference<C100709d>> f295055b = new HashMap<>();

    /* renamed from: c */
    public HashSet<Integer> f295056c = new HashSet<>();

    /* renamed from: d */
    public boolean f295057d = true;

    /* renamed from: e */
    public List<C51681vd0> f295058e = new LinkedList();

    /* renamed from: pb1.g0$a */
    public class C35432a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ byte[] f94819d;

        public C35432a(C100706g0 g0Var, byte[] bArr) {
            this.f94819d = bArr;
        }

        public void run() {
            C86709a0.m107535s().mo121142i().mo119676J(225283, Util.encodeHexString(this.f94819d));
        }

        public String toString() {
            return super.toString() + "|save";
        }
    }

    /* renamed from: pb1.g0$b */
    public class C100707b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f295059d;

        public C100707b(String str) {
            this.f295059d = str;
        }

        public void run() {
            C100706g0.this.mo140137c(this.f295059d);
        }
    }

    /* renamed from: pb1.g0$c */
    public class C100708c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f295061d;

        public C100708c(String str) {
            this.f295061d = str;
        }

        public void run() {
            C100706g0.this.mo140143i(this.f295061d);
        }
    }

    /* renamed from: pb1.g0$d */
    public interface C100709d {
        /* renamed from: f */
        void mo94793f(String str);

        /* renamed from: k */
        void mo94802k(String str);
    }

    public C100706g0() {
        try {
            this.f295054a.parseFrom(Util.decodeHexString((String) C86709a0.m107535s().mo121142i().mo119684e(225283, "")));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FavTagSetMgr", e, "", new Object[0]);
            Log.m105929w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", e.getMessage());
            this.f295054a = new C51958xd0();
            Class cls = C100718j1.class;
            Cursor query = ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).f302176d.query("FavSearchInfo", new String[]{C66261f3.COL_LOCALID}, "tagContent!=?", new String[]{""}, (String) null, (String) null, (String) null);
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                arrayList.add(Long.valueOf(query.getLong(0)));
            }
            query.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(((Long) it.next()).longValue());
                if (Yt != null) {
                    for (String next : Yt.field_tagProto.f186495e) {
                        Log.m105925i("MicroMsg.FavTagSetMgr", "recover tag from db:%s", next);
                        mo140136b(next);
                    }
                }
            }
        }
        Log.m105925i("MicroMsg.FavTagSetMgr", "tag:\n%s", this.f295054a.f144599d);
    }

    /* renamed from: a */
    public void mo140135a(C100709d dVar) {
        if (dVar != null) {
            this.f295055b.put(dVar.toString(), new WeakReference(dVar));
        }
    }

    /* renamed from: b */
    public void mo140136b(String str) {
        if (!Util.isNullOrNil(str)) {
            if (this.f295056c.contains(Integer.valueOf(str.hashCode()))) {
                Log.m105919d("MicroMsg.FavTagSetMgr", "has add tag %s", str);
                return;
            }
            this.f295056c.add(Integer.valueOf(str.hashCode()));
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Log.m105919d("MicroMsg.FavTagSetMgr", "add tag %s, post", str);
                MMHandlerThread.postToMainThread(new C100707b(str));
                return;
            }
            Log.m105919d("MicroMsg.FavTagSetMgr", "add tag %s", str);
            mo140137c(str);
        }
    }

    /* renamed from: c */
    public final void mo140137c(String str) {
        String a = C77691f.m93686a(str.toLowerCase());
        int i = 0;
        char charAt = (a == null || a.length() <= 0) ? '#' : a.charAt(0);
        C51816wd0 wd02 = null;
        Iterator<C51816wd0> it = this.f295054a.f144599d.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C51816wd0 next = it.next();
            int i3 = next.f143966d;
            if (i3 == charAt) {
                wd02 = next;
                break;
            } else if (i3 > charAt) {
                wd02 = new C51816wd0();
                wd02.f143966d = charAt;
                this.f295054a.f144599d.add(i2, wd02);
                break;
            } else {
                i2++;
            }
        }
        if (wd02 == null) {
            wd02 = new C51816wd0();
            wd02.f143966d = charAt;
            this.f295054a.f144599d.add(wd02);
        }
        Iterator<C51681vd0> it4 = wd02.f143967e.iterator();
        while (it4.hasNext()) {
            C51681vd0 next2 = it4.next();
            int compareTo = next2.f143435e.compareTo(a);
            if (compareTo == 0) {
                compareTo = next2.f143434d.compareTo(str);
            }
            if (compareTo != 0) {
                if (compareTo > 0) {
                    C51681vd0 vd02 = new C51681vd0();
                    vd02.f143434d = str;
                    vd02.f143435e = a;
                    wd02.f143967e.add(i, vd02);
                    mo140144j();
                    mo140140f(str, true);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
        C51681vd0 vd03 = new C51681vd0();
        vd03.f143434d = str;
        vd03.f143435e = a;
        wd02.f143967e.add(vd03);
        mo140140f(str, true);
        mo140144j();
    }

    /* renamed from: d */
    public List<C51681vd0> mo140138d(int i) {
        if (i < 0 || i > 1) {
            return null;
        }
        if (this.f295057d) {
            Log.m105928w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
            ((LinkedList) this.f295058e).clear();
            Iterator<C51816wd0> it = this.f295054a.f144599d.iterator();
            while (it.hasNext()) {
                ((LinkedList) this.f295058e).addAll(it.next().f143967e);
            }
            this.f295057d = false;
        }
        Log.m105925i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", Integer.valueOf(((LinkedList) this.f295058e).size()));
        return this.f295058e;
    }

    /* renamed from: e */
    public int mo140139e() {
        Iterator<C51816wd0> it = this.f295054a.f144599d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().f143967e.size();
        }
        return i;
    }

    /* renamed from: f */
    public final void mo140140f(String str, boolean z) {
        for (WeakReference next : this.f295055b.values()) {
            if (!(next == null || next.get() == null)) {
                if (z) {
                    ((C100709d) next.get()).mo94802k(str);
                } else {
                    ((C100709d) next.get()).mo94793f(str);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo140141g(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f295056c.remove(Integer.valueOf(str.hashCode()));
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Log.m105919d("MicroMsg.FavTagSetMgr", "remove tag %s, post", str);
                MMHandlerThread.postToMainThread(new C100708c(str));
                return;
            }
            Log.m105919d("MicroMsg.FavTagSetMgr", "remove tag %s", str);
            mo140143i(str);
        }
    }

    /* renamed from: h */
    public void mo140142h(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            Log.m105919d("MicroMsg.FavTagSetMgr", "do remove tags: %s", set);
            for (String g : set) {
                mo140141g(g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        if (r2 > 0) goto L_0x00bc;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140143i(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.toLowerCase()
            java.lang.String r0 = sf0.C77691f.m93686a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0016
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0016
            char r2 = r0.charAt(r1)
            goto L_0x0018
        L_0x0016:
            r2 = 35
        L_0x0018:
            te3.xd0 r3 = r11.f295054a
            java.util.LinkedList<te3.wd0> r3 = r3.f144599d
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0021:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r3.next()
            te3.wd0 r5 = (te3.C51816wd0) r5
            int r7 = r5.f143966d
            if (r7 != r2) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            if (r7 <= r2) goto L_0x0036
            return
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0039:
            r5 = r6
        L_0x003a:
            if (r5 != 0) goto L_0x003d
            return
        L_0x003d:
            java.util.LinkedList<te3.vd0> r2 = r5.f143967e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0044:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00e0
            java.lang.Object r7 = r2.next()
            te3.vd0 r7 = (te3.C51681vd0) r7
            java.lang.String r8 = r7.f143435e
            int r8 = r8.compareTo(r0)
            if (r8 != 0) goto L_0x005e
            java.lang.String r8 = r7.f143434d
            int r8 = r8.compareTo(r12)
        L_0x005e:
            if (r8 != 0) goto L_0x00d9
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.c1 r0 = r0.mo128208Y3()
            java.lang.String r2 = r7.f143434d
            xb1.e r0 = (xb1.C102615e) r0
            r0.getClass()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 == 0) goto L_0x007a
            goto L_0x00bb
        L_0x007a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "select count(localId) from FavSearchInfo where tagContent like '%"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = "%'"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r1] = r2
            java.lang.String r9 = "MicroMsg.FavSearchStorage"
            java.lang.String r10 = "is tag exist sql {%s}"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r8)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f302176d
            r8 = 2
            android.database.Cursor r0 = r0.rawQuery(r2, r6, r8)
            if (r0 == 0) goto L_0x00b2
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x00b2
            int r2 = r0.getInt(r1)
            goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            r0.close()
        L_0x00b8:
            if (r2 <= 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            if (r7 != 0) goto L_0x00d8
            java.util.LinkedList<te3.vd0> r0 = r5.f143967e
            r0.remove(r3)
            java.util.LinkedList<te3.vd0> r0 = r5.f143967e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d2
            te3.xd0 r0 = r11.f295054a
            java.util.LinkedList<te3.wd0> r0 = r0.f144599d
            r0.remove(r4)
        L_0x00d2:
            r11.mo140140f(r12, r1)
            r11.mo140144j()
        L_0x00d8:
            return
        L_0x00d9:
            if (r8 <= 0) goto L_0x00dc
            return
        L_0x00dc:
            int r3 = r3 + 1
            goto L_0x0044
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100706g0.mo140143i(java.lang.String):void");
    }

    /* renamed from: j */
    public void mo140144j() {
        byte[] bArr;
        try {
            bArr = this.f295054a.toByteArray();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FavTagSetMgr", e, "", new Object[0]);
            Log.m105929w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", e.getMessage());
            bArr = null;
        }
        C86709a0.m107525e().postToWorker(new C35432a(this, bArr));
        this.f295057d = true;
    }
}
