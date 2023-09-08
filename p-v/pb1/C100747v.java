package pb1;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import p749xh.C66261f3;
import te3.C101801kd0;
import te3.C101834rc0;
import xb1.C102614d;
import zh3.C91753f;

/* renamed from: pb1.v */
public class C100747v {

    /* renamed from: h */
    public static C100747v f295157h;

    /* renamed from: a */
    public boolean f295158a = false;

    /* renamed from: b */
    public ArrayList<C100750c> f295159b = new ArrayList<>();

    /* renamed from: c */
    public long f295160c = -1;

    /* renamed from: d */
    public long f295161d = -1;

    /* renamed from: e */
    public Object f295162e = new Object();

    /* renamed from: f */
    public Runnable f295163f = new C100748a();

    /* renamed from: g */
    public MMHandler f295164g = new C100749b(Looper.getMainLooper());

    /* renamed from: pb1.v$a */
    public class C100748a implements Runnable {
        public C100748a() {
        }

        public void run() {
            int i;
            C100747v vVar;
            boolean z;
            long j;
            C102614d dVar = (C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq();
            dVar.getClass();
            Log.m105924i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength");
            int[] iArr = C100694a.f295013b;
            String str = "";
            String str2 = str;
            int i2 = 0;
            while (true) {
                i = 3;
                if (i2 >= 3) {
                    break;
                }
                str2 = str2 + iArr[i2] + ",";
                i2++;
            }
            if (str2.endsWith(",")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            String str3 = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where " + "itemStatus in (" + str2 + ")";
            int[] iArr2 = C100694a.f295012a;
            for (int i3 = 0; i3 < 8; i3++) {
                str = str + iArr2[i3] + ",";
            }
            if (str.endsWith(",")) {
                str = str.substring(0, str.length() - 1);
            }
            Cursor rawQuery = dVar.f302175d.rawQuery(str3 + " and type in (" + str + ")", (String[]) null);
            if (rawQuery == null) {
                Log.m105920e("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu = null");
            } else if (rawQuery.getCount() == 0) {
                rawQuery.close();
                Log.m105924i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = 0");
            } else {
                Log.m105924i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = " + rawQuery.getCount());
                ISQLiteDatabase iSQLiteDatabase = dVar.f302175d;
                long beginTransaction = iSQLiteDatabase instanceof C91753f ? ((C91753f) iSQLiteDatabase).beginTransaction(Thread.currentThread().getId()) : 0;
                while (rawQuery.moveToNext()) {
                    C100755z zVar = new C100755z();
                    zVar.convertFrom(rawQuery);
                    int i4 = zVar.field_itemStatus;
                    int[] iArr3 = C100694a.f295013b;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            z = false;
                            break;
                        } else if (iArr3[i5] == i4) {
                            z = true;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (z) {
                        C101801kd0 kd02 = zVar.field_favProto;
                        if (kd02 != null) {
                            Iterator<C101834rc0> it = kd02.f298618f.iterator();
                            j = 0;
                            while (it.hasNext()) {
                                j += it.next().f299276R;
                            }
                        } else {
                            j = 0;
                        }
                        zVar.field_datatotalsize = j;
                        dVar.update(zVar, C66261f3.COL_LOCALID);
                    }
                    i = 3;
                }
                ISQLiteDatabase iSQLiteDatabase2 = dVar.f302175d;
                if (iSQLiteDatabase2 instanceof C91753f) {
                    ((C91753f) iSQLiteDatabase2).endTransaction(beginTransaction);
                }
                rawQuery.close();
                Log.m105924i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength end");
            }
            C100747v.this.f295161d = System.currentTimeMillis();
            C100747v vVar2 = C100747v.this;
            Log.m105919d("MicroMsg.FavCleanFirstLoader", "calDataBaseDataTotalLength, used: %dms", Long.valueOf(vVar2.f295161d - vVar2.f295160c));
            C100747v vVar3 = C100747v.this;
            vVar3.f295161d = -1;
            vVar3.f295160c = -1;
            synchronized (vVar3.f295162e) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN, Boolean.TRUE);
                vVar = C100747v.this;
                vVar.f295158a = false;
            }
            vVar.f295164g.sendEmptyMessage(0);
        }
    }

    /* renamed from: pb1.v$b */
    public class C100749b extends MMHandler {
        public C100749b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Iterator<C100750c> it = C100747v.this.f295159b.iterator();
            while (it.hasNext()) {
                C100750c next = it.next();
                if (next != null) {
                    next.onFinish();
                }
            }
            C100747v.this.f295159b.clear();
        }
    }

    /* renamed from: pb1.v$c */
    public interface C100750c {
        void onFinish();
    }

    /* renamed from: b */
    public static synchronized C100747v m131897b() {
        C100747v vVar;
        synchronized (C100747v.class) {
            if (f295157h == null) {
                f295157h = new C100747v();
            }
            vVar = f295157h;
        }
        return vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo140169a(pb1.C100747v.C100750c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f295162e
            monitor-enter(r0)
            f40.o r1 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0049 }
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()     // Catch:{ all -> 0x0049 }
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r1.mo119685f(r2, r3)     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x0020
            r5.onFinish()     // Catch:{ all -> 0x0049 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0022:
            if (r5 == 0) goto L_0x0029
            java.util.ArrayList<pb1.v$c> r1 = r4.f295159b     // Catch:{ all -> 0x0049 }
            r1.add(r5)     // Catch:{ all -> 0x0049 }
        L_0x0029:
            boolean r5 = r4.f295158a     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0037
            java.lang.String r5 = "MicroMsg.FavCleanFirstLoader"
            java.lang.String r1 = "isLoading is true, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0037:
            r5 = 1
            r4.f295158a = r5     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            long r0 = java.lang.System.currentTimeMillis()
            r4.f295160c = r0
            java.lang.Runnable r5 = r4.f295163f
            java.lang.String r0 = "FavCleanFirstLoader_CalFavDataLength"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r5, r0)
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100747v.mo140169a(pb1.v$c):void");
    }
}
