package sb1;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C68985g;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99681n;
import lv1.C99682o;
import pb1.C100718j1;
import pb1.C100734q;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101861wc0;
import te3.C64853yd0;
import xb1.C102614d;

/* renamed from: sb1.b */
public class C101572b extends C99248b {

    /* renamed from: e */
    public C76636p f297357e;

    /* renamed from: f */
    public C61172m f297358f;

    /* renamed from: g */
    public C101571a f297359g;

    /* renamed from: h */
    public ISQLiteDatabase f297360h;

    /* renamed from: i */
    public MStorage.IOnStorageChange f297361i = new C101573a();

    /* renamed from: sb1.b$a */
    public class C101573a implements MStorage.IOnStorageChange {
        public C101573a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (mStorageEventData != null) {
                int i = mStorageEventData.eventId;
                Object obj = mStorageEventData.obj;
                if (obj != null) {
                    long longValue = ((Long) obj).longValue();
                    if (longValue >= 0) {
                        Log.m105925i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "EventData: %s", mStorageEventData);
                        if (i == 2 || i == 3) {
                            C101572b bVar = C101572b.this;
                            ((C93836i) bVar.f297357e).mo128803c(65576, new C101577e(longValue, (C101573a) null));
                        } else if (i == 5) {
                            C101572b bVar2 = C101572b.this;
                            ((C93836i) bVar2.f297357e).mo128803c(65576, new C101575c(longValue));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: sb1.b$b */
    public class C101574b extends C99664b {

        /* renamed from: j */
        public HashSet<Long> f297363j = null;

        /* renamed from: n */
        public int f297364n = 0;

        /* renamed from: o */
        public int f297365o = 0;

        /* renamed from: p */
        public int f297366p = 0;

        /* renamed from: q */
        public int f297367q = 0;

        public C101574b(C101573a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            if (C101572b.this.f297360h == null) {
                Log.m105928w("MicroMsg.FTS.FTS5SearchFavoriteLogic", "favorite db is null, you need to wait the favorite db event!");
                return true;
            }
            Log.m105924i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to build favorite index!");
            Cursor cursor = null;
            if (this.f297363j == null) {
                this.f297363j = new HashSet<>();
                try {
                    Cursor x = C101572b.this.f297359g.mo138624x(C99249c.f291004b, false, true, false, false, false);
                    while (x.moveToNext()) {
                        try {
                            this.f297363j.add(Long.valueOf(x.getLong(0)));
                        } catch (Exception e) {
                            e = e;
                            cursor = x;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = x;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    x.close();
                    this.f297364n = this.f297363j.size();
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            if (!Thread.interrupted()) {
                Cursor rawQuery = C101572b.this.f297360h.rawQuery("SELECT localId, type, updateTime, fromUser, favProto, tagProto FROM FavItemInfo WHERE flag <> -1;", (String[]) null);
                int i = 50;
                while (rawQuery.moveToNext()) {
                    try {
                        if (!Thread.interrupted()) {
                            C101576d dVar = new C101576d(C101572b.this, (C101573a) null);
                            dVar.mo141056a(rawQuery);
                            if (!C101572b.m133387c(dVar)) {
                                if (!this.f297363j.remove(Long.valueOf(dVar.f297371a))) {
                                    if (i >= 50) {
                                        C101572b.this.f297359g.mo138600c();
                                        C101572b.this.f297359g.mo138598a();
                                        i = 0;
                                    }
                                    i += C101572b.m133388d(C101572b.this, dVar);
                                    this.f297365o++;
                                }
                            }
                        } else {
                            C101572b.this.f297359g.mo138600c();
                            throw new InterruptedException();
                        }
                    } catch (Exception e3) {
                        Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchFavoriteLogic", e3, "Build favorite index failed with exception.\n", new Object[0]);
                        this.f297367q++;
                    } catch (Throwable th5) {
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        throw th5;
                    }
                }
                rawQuery.close();
                C101572b.this.f297359g.mo138600c();
                Iterator<Long> it = this.f297363j.iterator();
                while (it.hasNext()) {
                    if (!Thread.interrupted()) {
                        if (i >= 50) {
                            C101572b.this.f297359g.mo138600c();
                            C101572b.this.f297359g.mo138598a();
                            i = 0;
                        }
                        C101572b.this.f297359g.mo138607h(C99249c.f291004b, it.next().longValue());
                        i++;
                        this.f297366p++;
                        it.remove();
                    } else {
                        C101572b.this.f297359g.mo138600c();
                        throw new InterruptedException();
                    }
                }
                C101572b.this.f297359g.mo138600c();
                return true;
            }
            throw new InterruptedException();
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{new: %d exist: %d removed: %d failed: %d}", new Object[]{Integer.valueOf(this.f297365o), Integer.valueOf(this.f297364n), Integer.valueOf(this.f297366p), Integer.valueOf(this.f297367q)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 6;
        }

        public String getName() {
            return "BuildFavoriteIndexTask";
        }
    }

    /* renamed from: sb1.b$c */
    public class C101575c extends C99664b {

        /* renamed from: j */
        public long f297369j;

        public C101575c(long j) {
            this.f297369j = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105918d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to delete favorite item");
            C101572b.this.f297359g.mo138607h(C99249c.f291004b, this.f297369j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{favItemId: %d}", new Object[]{Long.valueOf(this.f297369j)});
        }

        public String getName() {
            return "DeleteFavItemTask";
        }
    }

    /* renamed from: sb1.b$d */
    public class C101576d {

        /* renamed from: a */
        public long f297371a;

        /* renamed from: b */
        public int f297372b;

        /* renamed from: c */
        public long f297373c;

        /* renamed from: d */
        public String f297374d;

        /* renamed from: e */
        public C101801kd0 f297375e;

        /* renamed from: f */
        public C64853yd0 f297376f;

        public C101576d(C101572b bVar, C101573a aVar) {
        }

        /* renamed from: a */
        public void mo141056a(Cursor cursor) {
            this.f297371a = cursor.getLong(0);
            this.f297372b = cursor.getInt(1);
            this.f297373c = cursor.getLong(2);
            this.f297374d = cursor.getString(3);
            byte[] blob = cursor.getBlob(4);
            if (blob == null || blob.length == 0) {
                Log.m105918d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "FavIndexItem protoData is null or data length is 0");
                this.f297375e = new C101801kd0();
            } else {
                this.f297375e = (C101801kd0) new C101801kd0().parseFrom(blob);
            }
            byte[] blob2 = cursor.getBlob(5);
            if (blob2 == null || blob2.length == 0) {
                this.f297376f = null;
            } else {
                this.f297376f = (C64853yd0) new C64853yd0().parseFrom(blob2);
            }
        }
    }

    /* renamed from: sb1.b$e */
    public class C101577e extends C99664b {

        /* renamed from: j */
        public int f297377j;

        /* renamed from: n */
        public long f297378n;

        public C101577e(long j, C101573a aVar) {
            this.f297378n = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Exception e;
            if (C101572b.this.f297360h == null) {
                Log.m105920e("MicroMsg.FTS.FTS5SearchFavoriteLogic", "InsertFavItemTask: fav db is null");
                return true;
            }
            Log.m105918d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to insert favorite item");
            Cursor rawQuery = C101572b.this.f297360h.rawQuery("SELECT localId, type, updateTime, fromUser, favProto, tagProto FROM FavItemInfo WHERE localId = ? AND flag <> -1;", new String[]{String.valueOf(this.f297378n)}, 2);
            Cursor cursor = null;
            try {
                if (rawQuery.moveToFirst()) {
                    C101576d dVar = new C101576d(C101572b.this, (C101573a) null);
                    dVar.mo141056a(rawQuery);
                    rawQuery.close();
                    try {
                        if (C101572b.m133387c(dVar)) {
                            return true;
                        }
                        C101572b.this.f297359g.mo138598a();
                        C101572b.this.f297359g.mo138607h(C99249c.f291004b, this.f297378n);
                        this.f297377j = C101572b.m133388d(C101572b.this, dVar);
                        C101572b.this.f297359g.mo138600c();
                        rawQuery = null;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e3) {
                Exception exc = e3;
                cursor = rawQuery;
                e = exc;
                throw e;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                cursor = rawQuery;
                th = th5;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{favItemId: %d transactionCount: %d}", new Object[]{Long.valueOf(this.f297378n), Integer.valueOf(this.f297377j)});
        }

        public String getName() {
            return "InsertFavItemTask";
        }
    }

    /* renamed from: sb1.b$f */
    public class C101578f extends C99678j {
        public C101578f(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchFavoriteTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            lVar.f32075d = C99672i.m130094a(this.f292133j.f224468c, true);
            HashMap hashMap = new HashMap();
            Cursor w = C101572b.this.f297359g.mo138623w(lVar.f32075d, C99249c.f291004b, (int[]) null, (String) null, false, false);
            while (((CursorWrapper) w).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139050c(w);
                C99681n nVar = (C99681n) hashMap.get(Long.valueOf(oVar.f292150d));
                if (nVar == null || C99251g.m129281b(C99249c.f291017o, oVar.f292149c, nVar.f292149c) < 0) {
                    hashMap.put(Long.valueOf(oVar.f292150d), oVar);
                }
                if (Thread.interrupted()) {
                    ((C93824b) w).close();
                    throw new InterruptedException();
                }
            }
            ((C93824b) w).close();
            if (!Thread.interrupted()) {
                lVar.f32076e = new ArrayList(hashMap.size());
                for (C99682o add : hashMap.values()) {
                    lVar.f32076e.add(add);
                }
                Comparator<C99681n> comparator = this.f292133j.f224477l;
                if (comparator != null) {
                    Collections.sort(lVar.f32076e, comparator);
                    return;
                }
                return;
            }
            throw new InterruptedException();
        }
    }

    /* renamed from: sb1.b$g */
    public class C101579g extends C99678j {
        public C101579g(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 9;
        }

        public String getName() {
            return "SearchTopFavoriteTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101571a aVar = C101572b.this.f297359g;
            aVar.getClass();
            String d = a.mo139044d();
            Cursor o = ((C93834f) aVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY -timestamp, subtype limit " + (this.f292133j.f224474i + 1 + 1) + ";", new Object[]{aVar.mo138611l(), aVar.mo138611l(), aVar.mo138609j(), aVar.mo138611l(), aVar.mo138609j(), aVar.mo138609j(), d}), (String[]) null);
            lVar.f32076e = new ArrayList();
            HashSet hashSet = new HashSet();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                } else if (hashSet.add(String.valueOf(cursorWrapper.getLong(3)))) {
                    C99682o oVar = new C99682o();
                    oVar.mo139050c(o);
                    lVar.f32076e.add(oVar);
                    if (lVar.f32076e.size() > this.f292133j.f224474i) {
                        break;
                    } else if (Thread.interrupted()) {
                        ((C93824b) o).close();
                        throw new InterruptedException();
                    }
                }
            }
            ((C93824b) o).close();
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = r1.f298618f.get(0).f299296c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (r1 = r3.f297375e).f298618f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m133387c(sb1.C101572b.C101576d r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0029
            te3.kd0 r1 = r3.f297375e
            if (r1 != 0) goto L_0x0008
            goto L_0x0029
        L_0x0008:
            int r3 = r3.f297372b
            r2 = 4
            if (r3 == r2) goto L_0x000e
            goto L_0x0029
        L_0x000e:
            java.util.LinkedList<te3.rc0> r3 = r1.f298618f
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0029
            java.util.LinkedList<te3.rc0> r3 = r1.f298618f
            java.lang.Object r3 = r3.get(r0)
            te3.rc0 r3 = (te3.C101834rc0) r3
            te3.sc0 r3 = r3.f299296c1
            if (r3 == 0) goto L_0x0029
            te3.ad0 r3 = r3.f299422x
            if (r3 == 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb1.C101572b.m133387c(sb1.b$d):boolean");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* renamed from: d */
    public static int m133388d(C101572b bVar, C101576d dVar) {
        String str;
        String str2;
        C101801kd0 kd02;
        C101861wc0 wc02;
        String str3;
        String[] strArr;
        int[] iArr;
        int i;
        ? r9;
        C101572b bVar2;
        long j;
        long j2;
        int i2;
        String str4;
        char c;
        String str5;
        char c2;
        String str6;
        char c3;
        String str7;
        String str8;
        String str9;
        C101572b bVar3 = bVar;
        C101576d dVar2 = dVar;
        bVar.getClass();
        long j3 = dVar2.f297371a;
        int i3 = dVar2.f297372b;
        long j4 = dVar2.f297373c;
        String str10 = dVar2.f297374d;
        C101801kd0 kd03 = dVar2.f297375e;
        C101861wc0 F = C100734q.m131815F(i3, kd03, dVar2.f297376f);
        if (F == null) {
            Log.m105918d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Fav info is null");
            return 0;
        }
        String str11 = F.f299734g;
        String str12 = F.f299733f;
        if (str11 == null || str11.length() == 0 || str11.equals(str12)) {
            str11 = F.f299733f;
            str = null;
        } else {
            str = str12;
        }
        String str13 = F.f299736i;
        String[] strArr2 = new String[3];
        int[] iArr2 = new int[3];
        C101801kd0 kd04 = kd03;
        if (str11 == null || str11.length() <= 0) {
            iArr = iArr2;
            str3 = str13;
            strArr = strArr2;
            str2 = str;
            wc02 = F;
            kd02 = kd04;
            r9 = 0;
            i = 0;
        } else {
            C72996z1 a = ((C68985g) bVar3.f297358f).mo94940a(str11);
            String nickname = a.getNickname();
            String i4 = C99251g.m129288i(nickname, false);
            String i5 = C99251g.m129288i(nickname, true);
            String n2 = a.mo73969n2();
            String i6 = C99251g.m129288i(n2, false);
            String i7 = C99251g.m129288i(n2, true);
            if (n2 == null || n2.length() == 0) {
                i6 = i4;
                i7 = i5;
                str9 = null;
                i4 = null;
                i5 = null;
            } else {
                str9 = nickname;
                nickname = n2;
            }
            strArr2[0] = nickname;
            strArr2[1] = i6;
            strArr2[2] = i7;
            iArr2[0] = 9;
            iArr2[1] = 10;
            iArr2[2] = 11;
            iArr = iArr2;
            int[] iArr3 = iArr;
            str3 = str13;
            strArr = strArr2;
            long j5 = j3;
            String str14 = str;
            int i8 = i3;
            wc02 = F;
            str2 = str14;
            r9 = 0;
            kd02 = kd04;
            strArr[0] = str9;
            strArr[1] = i4;
            strArr[2] = i5;
            iArr[0] = 12;
            iArr[1] = 13;
            iArr[2] = 14;
            i = bVar.mo141055e(strArr2, iArr3, j5, i8, j4, str10) + 0 + bVar.mo141055e(strArr, iArr3, j5, i8, j4, str10);
        }
        if (str2 == null || str2.length() <= 0) {
            bVar2 = bVar;
        } else {
            C101572b bVar4 = bVar;
            C72996z1 a2 = ((C68985g) bVar4.f297358f).mo94940a(str2);
            String n25 = a2.mo73969n2();
            if (n25 == null || n25.length() == 0) {
                c3 = 1;
                n25 = a2.getNickname();
                str8 = C99251g.m129288i(n25, r9);
                str7 = C99251g.m129288i(n25, true);
            } else {
                str8 = C99251g.m129288i(n25, r9);
                c3 = 1;
                str7 = C99251g.m129288i(n25, true);
            }
            strArr[r9] = n25;
            strArr[c3] = str8;
            strArr[2] = str7;
            iArr[r9] = 16;
            iArr[c3] = 17;
            iArr[2] = 18;
            bVar2 = bVar4;
            i += bVar.mo141055e(strArr, iArr, j3, i3, j4, str10);
        }
        String str15 = str3;
        if (str15 != null && str15.length() > 0) {
            C72996z1 a3 = ((C68985g) bVar2.f297358f).mo94940a(str15);
            String n26 = a3.mo73969n2();
            if (n26 == null || n26.length() == 0) {
                c2 = 0;
                c = 1;
                n26 = a3.getNickname();
                str6 = C99251g.m129288i(n26, false);
                str5 = C99251g.m129288i(n26, true);
            } else {
                c2 = 0;
                str6 = C99251g.m129288i(n26, false);
                c = 1;
                str5 = C99251g.m129288i(n26, true);
            }
            strArr[c2] = n26;
            strArr[c] = str6;
            strArr[2] = str5;
            iArr[c2] = 20;
            iArr[c] = 21;
            iArr[2] = 22;
            i += bVar.mo141055e(strArr, iArr, j3, i3, j4, str10);
        }
        int i9 = i;
        C101861wc0 wc03 = wc02;
        LinkedList<String> linkedList = wc03.f299737j;
        StringBuilder sb = new StringBuilder(256);
        for (String next : linkedList) {
            if (next != null && next.length() > 0) {
                sb.append(next);
                sb.append("​");
            }
        }
        if (sb.length() > 0) {
            str4 = str10;
            j2 = j4;
            j = j3;
            i2 = i3;
            bVar2.f297359g.mo141054A(196608, 7, j3, str4, j2, sb.toString(), i2);
            i9++;
        } else {
            str4 = str10;
            j2 = j4;
            j = j3;
            i2 = i3;
        }
        int i15 = i9;
        if (i2 == 2) {
            int i16 = i2;
            String str16 = wc03.f299731d;
            if (!Util.isNullOrNil(str16)) {
                bVar2.f297359g.mo141054A(196608, 23, j, str4, j2, str16, i16);
            }
            return i15;
        } else if (i2 != 14) {
            if (i2 != 21) {
                if (i2 == 5) {
                    int i17 = i2;
                    String str17 = wc03.f299731d;
                    if (!Util.isNullOrNil(str17)) {
                        bVar2.f297359g.mo141054A(196608, 1, j, str4, j2, str17, i17);
                    }
                    return i15;
                } else if (i2 == 6) {
                    int i18 = i2;
                    C101801kd0 kd05 = kd02;
                    String str18 = kd05.f298624o;
                    if (!Util.isNullOrNil(str18)) {
                        bVar2.f297359g.mo141054A(196608, 4, j, str4, j2, str18, i18);
                        i15++;
                    }
                    String str19 = kd05.f298620h.f299958o;
                    if (!Util.isNullOrNil(str19)) {
                        bVar2.f297359g.mo141054A(196608, 5, j, str4, j2, str19, i18);
                        i15++;
                    }
                    String str20 = kd05.f298620h.f299956j;
                    if (!Util.isNullOrNil(str20)) {
                        bVar2.f297359g.mo141054A(196608, 6, j, str4, j2, str20, i18);
                    }
                    return i15;
                } else if (i2 != 7) {
                    String str21 = wc03.f299731d;
                    if (!Util.isNullOrNil(str21)) {
                        bVar2.f297359g.mo141054A(196608, 1, j, str4, j2, str21, i2);
                        i15++;
                    }
                    String str22 = wc03.f299732e;
                    if (!Util.isNullOrNil(str22)) {
                        bVar2.f297359g.mo141054A(196608, 2, j, str4, j2, str22, i2);
                    }
                    return i15;
                }
            }
            int i19 = i2;
            String str23 = wc03.f299731d;
            if (!Util.isNullOrNil(str23)) {
                bVar2.f297359g.mo141054A(196608, 1, j, str4, j2, str23, i19);
                i15++;
            }
            String str24 = wc03.f299732e;
            if (!Util.isNullOrNil(str24)) {
                bVar2.f297359g.mo141054A(196608, 3, j, str4, j2, str24, i19);
            }
            return i15;
        } else {
            int i25 = i2;
            LinkedList<C101834rc0> linkedList2 = kd02.f298618f;
            if (linkedList2 != null) {
                Iterator<C101834rc0> it = linkedList2.iterator();
                while (it.hasNext()) {
                    String s = C100734q.m131872s(it.next());
                    if (!Util.isNullOrNil(s)) {
                        sb.append(s);
                        sb.append("​");
                    }
                }
                if (!Util.isNullOrNil("")) {
                    bVar2.f297359g.mo141054A(196608, 1, j, str4, j2, "", i25);
                }
            }
            return i15;
        }
        i15++;
        return i15;
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C100718j1.class;
        Class cls2 = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls2)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Success!");
        this.f297357e = ((C99260q) C86312j.m106911c(cls2)).mo128743Jd();
        this.f297359g = (C101571a) ((C99260q) C86312j.m106911c(cls2)).db0(256);
        this.f297358f = ((C99260q) C86312j.m106911c(cls2)).mo128761xc();
        this.f297360h = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).f302175d;
        ((C93836i) this.f297357e).mo128803c(131122, new C101574b((C101573a) null));
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this.f297361i);
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq().remove(this.f297361i);
        this.f297359g = null;
        this.f297357e = null;
        return true;
    }

    /* renamed from: e */
    public final int mo141055e(String[] strArr, int[] iArr, long j, int i, long j2, String str) {
        String str2;
        int i2;
        String str3 = strArr[0];
        String str4 = strArr[1];
        String str5 = strArr[2];
        if (str3 == null || str3.length() <= 0) {
            return 0;
        }
        if (str3.equalsIgnoreCase(str4)) {
            str5 = null;
            str2 = null;
        } else {
            str2 = str4;
        }
        String str6 = (str2 == null || !str2.equalsIgnoreCase(str5)) ? str5 : null;
        this.f297359g.mo141054A(196608, iArr[0], j, str, j2, str3, i);
        if (str2 == null || str2.length() <= 0) {
            i2 = 1;
        } else {
            this.f297359g.mo141054A(196608, iArr[1], j, str, j2, str2, i);
            i2 = 2;
        }
        if (str6 == null || str6.length() <= 0) {
            return i2;
        }
        this.f297359g.mo141054A(196608, iArr[2], j, str, j2, str6, i);
        return i2 + 1;
    }

    public String getName() {
        return "FTS5SearchFavoriteLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        return ((C93836i) this.f297357e).mo128803c(-65536, kVar.f224467b == 1 ? new C101579g(kVar) : new C101578f(kVar));
    }
}
