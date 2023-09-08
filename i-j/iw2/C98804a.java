package iw2;

import android.database.Cursor;
import aw2.C92163a;
import aw2.C92164b;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dw2.C97558d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kw2.C99266g;
import kw2.C99268i;
import kw2.C99269j;
import mw2.C100013c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;

/* renamed from: iw2.a */
public final class C98804a implements C92163a, C11385n {

    /* renamed from: d */
    public final C92164b f289656d;

    /* renamed from: e */
    public String f289657e = "";

    /* renamed from: f */
    public final LinkedHashMap<String, ArrayList<C99266g>> f289658f = new LinkedHashMap<>();

    /* renamed from: g */
    public long f289659g;

    /* renamed from: h */
    public long f289660h;

    /* renamed from: i */
    public long f289661i;

    /* renamed from: j */
    public int f289662j;

    /* renamed from: n */
    public boolean f289663n;

    /* renamed from: iw2.a$a */
    public static final class C98805a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98804a f289664d;

        /* renamed from: iw2.a$a$a */
        public static final class C98806a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C98804a f289665d;

            /* renamed from: e */
            public final /* synthetic */ List<C100013c> f289666e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98806a(C98804a aVar, List<C100013c> list) {
                super(0);
                this.f289665d = aVar;
                this.f289666e = list;
            }

            public Object invoke() {
                this.f289665d.f289656d.mo126117m(this.f289666e);
                return C13598b0.f38549a;
            }
        }

        public C98805a(C98804a aVar) {
            this.f289664d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x020c  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x021d  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0280 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.tencent.mm.plugin.story.model.StoryCore$h r2 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
                kw2.j r2 = r2.mo134191i()
                iw2.a r3 = r1.f289664d
                java.lang.String r4 = r3.f289657e
                long r5 = r3.f289661i
                kw2.j$a r3 = kw2.C99269j.f291079j
                java.lang.String r3 = "username"
                gy3.C87412m.m108594g(r4, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "select *,rowid from MMStoryInfo  WHERE "
                r4.append(r7)
                java.lang.String r7 = kw2.C99269j.f291085s
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x004e
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                java.lang.String r4 = " AND storyID >= "
                r9.append(r4)
                r9.append(r5)
                java.lang.String r4 = r9.toString()
            L_0x004e:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r4 = kw2.C99269j.f291080n
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "getAlbumStoryAfterByStoryId "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "MicroMsg.StoryInfoStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f291093h
                r5 = 0
                r6 = 2
                android.database.Cursor r2 = r2.rawQuery(r4, r5, r6)
            L_0x007d:
                boolean r4 = r2.moveToNext()
                if (r4 == 0) goto L_0x008f
                kw2.i r4 = new kw2.i
                r4.<init>()
                r4.convertFrom(r2)
                r3.add(r4)
                goto L_0x007d
            L_0x008f:
                r2.close()
                boolean r2 = r3.isEmpty()
                if (r2 != 0) goto L_0x00a4
                iw2.a r2 = r1.f289664d
                java.lang.Object r4 = sx3.C110818d0.m150923U(r3)
                kw2.i r4 = (kw2.C99268i) r4
                long r9 = r4.field_storyID
                r2.f289660h = r9
            L_0x00a4:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x00ad:
                boolean r4 = r3.hasNext()
                java.lang.String r9 = "MicroMsg.AlbumPresenter"
                if (r4 == 0) goto L_0x0141
                java.lang.Object r4 = r3.next()
                kw2.i r4 = (kw2.C99268i) r4
                com.tencent.mm.plugin.story.model.StoryCore$h r10 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
                kw2.h r11 = r10.mo134190h()
                bw2.a$a r12 = bw2.C92326a.f264186a
                int r13 = r4.field_createTime
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.String r12 = r12.mo126326a(r13)
                kw2.g r11 = r11.mo138652jo(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "loadDBData rawLocalId="
                r12.append(r13)
                long r13 = r4.systemRowid
                int r14 = (int) r13
                r12.append(r14)
                java.lang.String r13 = " rawStoryId="
                r12.append(r13)
                long r13 = r4.field_storyID
                r12.append(r13)
                java.lang.String r13 = " date="
                r12.append(r13)
                if (r11 == 0) goto L_0x00f8
                java.lang.String r13 = r11.mo138649l2()
                goto L_0x00f9
            L_0x00f8:
                r13 = r5
            L_0x00f9:
                r12.append(r13)
                java.lang.String r13 = " count="
                r12.append(r13)
                if (r11 == 0) goto L_0x010a
                int r13 = r11.field_count
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                goto L_0x010b
            L_0x010a:
                r13 = r5
            L_0x010b:
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r12)
                if (r11 == 0) goto L_0x00ad
                kw2.j r9 = r10.mo134191i()
                long r12 = r4.systemRowid
                int r4 = (int) r12
                kw2.i r4 = r9.mo138667Yt(r4)
                if (r4 != 0) goto L_0x0129
                kw2.i r4 = new kw2.i
                r4.<init>()
            L_0x0129:
                r11.f291069p = r4
                java.lang.String r4 = r11.mo138649l2()
                boolean r4 = r2.contains(r4)
                if (r4 != 0) goto L_0x00ad
                r0.add(r11)
                java.lang.String r4 = r11.mo138649l2()
                r2.add(r4)
                goto L_0x00ad
            L_0x0141:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "localCachedMinId="
                r2.append(r3)
                iw2.a r3 = r1.f289664d
                long r3 = r3.f289660h
                r2.append(r3)
                java.lang.String r3 = " infos.size="
                r2.append(r3)
                int r3 = r0.size()
                r2.append(r3)
                java.lang.String r3 = " localMinId="
                r2.append(r3)
                iw2.a r3 = r1.f289664d
                long r3 = r3.f289661i
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r2)
                iw2.a r2 = r1.f289664d
                r2.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<kw2.g>> r4 = r2.f289658f
                r4.clear()
                java.util.Iterator r4 = r0.iterator()
            L_0x0185:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0287
                java.lang.Object r0 = r4.next()
                r5 = r0
                kw2.g r5 = (kw2.C99266g) r5
                bw2.a$a r0 = bw2.C92326a.f264186a
                java.lang.String r10 = r5.mo138649l2()
                r15 = 0
                r14 = 1
                java.lang.String r0 = "-"
                java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x01d9 }
                r12 = 0
                r13 = 0
                r0 = 6
                r16 = 0
                r7 = 1
                r14 = r0
                r8 = 0
                r15 = r16
                java.util.List r0 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01d7 }
                java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x01d7 }
                java.lang.Object r11 = r0.get(r8)     // Catch:{ Exception -> 0x01d7 }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01d7 }
                int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x01d7 }
                java.lang.Object r12 = r0.get(r7)     // Catch:{ Exception -> 0x01d7 }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01d7 }
                int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x01d7 }
                int r12 = r12 - r7
                java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x01d7 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01d7 }
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x01d7 }
                r10.<init>(r11, r12, r0)     // Catch:{ Exception -> 0x01d7 }
                long r10 = r10.getTimeInMillis()     // Catch:{ Exception -> 0x01d7 }
                goto L_0x01eb
            L_0x01d7:
                r0 = move-exception
                goto L_0x01dc
            L_0x01d9:
                r0 = move-exception
                r7 = 1
                r8 = 0
            L_0x01dc:
                bw2.a$a r10 = bw2.C92326a.f264186a
                java.lang.String r10 = r0.getMessage()
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r11 = "MicroMsg.StoryTimeUtil"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r10, r8)
                r10 = 0
            L_0x01eb:
                java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
                r0.<init>()
                java.util.GregorianCalendar r8 = new java.util.GregorianCalendar
                r8.<init>()
                r8.setTimeInMillis(r10)
                int r12 = r0.get(r7)
                int r7 = r8.get(r7)
                if (r12 != r7) goto L_0x021d
                int r0 = r0.get(r6)
                int r7 = r8.get(r6)
                if (r0 != r7) goto L_0x021d
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 2131837443(0x7f114203, float:1.9308081E38)
                java.lang.String r0 = r0.getString(r7)
                java.lang.String r7 = "getContext().getString(R…ry_album_date_this_month)"
                gy3.C87412m.m108593f(r0, r7)
                goto L_0x0239
            L_0x021d:
                java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
                r0.<init>()
                r0.setTimeInMillis(r10)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 2131837442(0x7f114202, float:1.930808E38)
                java.lang.String r0 = r0.getString(r7)
                java.lang.CharSequence r0 = android.text.format.DateFormat.format(r0, r10)
                java.lang.String r7 = "format(MMApplicationCont…_album_date_split), time)"
                gy3.C87412m.m108593f(r0, r7)
            L_0x0239:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "key="
                r7.append(r8)
                r7.append(r0)
                java.lang.String r8 = " info.date="
                r7.append(r8)
                java.lang.String r8 = r5.mo138649l2()
                r7.append(r8)
                java.lang.String r8 = " info.count="
                r7.append(r8)
                int r8 = r5.field_count
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)
                java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<kw2.g>> r7 = r2.f289658f
                java.lang.String r8 = r0.toString()
                java.lang.Object r7 = r7.get(r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                if (r7 != 0) goto L_0x0280
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<kw2.g>> r8 = r2.f289658f
                java.lang.String r0 = r0.toString()
                r8.put(r0, r7)
            L_0x0280:
                r7.add(r5)
                r7 = 0
                goto L_0x0185
            L_0x0287:
                java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<kw2.g>> r0 = r2.f289658f
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0291:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x02b9
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                mw2.c r4 = new mw2.c
                java.lang.Object r5 = r2.getKey()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r2 = r2.getValue()
                java.util.List r2 = (java.util.List) r2
                r4.<init>(r5, r2)
                java.lang.String r2 = java.lang.String.valueOf(r4)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                r3.add(r4)
                goto L_0x0291
            L_0x02b9:
                iw2.a$a$a r0 = new iw2.a$a$a
                iw2.a r2 = r1.f289664d
                r0.<init>(r2, r3)
                o40.C61926c.m72668M(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iw2.C98804a.C98805a.run():void");
        }
    }

    public C98804a(C92164b bVar) {
        C87412m.m108594g(bVar, "view");
        this.f289656d = bVar;
    }

    /* renamed from: a */
    public void mo138180a() {
        StoryCore.f281736t.mo134194l().post(new C98805a(this));
    }

    /* renamed from: b */
    public final void mo138181b(long j) {
        long j2;
        StoryCore.C96337h hVar = StoryCore.f281736t;
        C99269j i = hVar.mo134191i();
        hVar.mo134192j();
        C87412m.m108594g(this.f289657e, "userName");
        String str = "select *,rowid from MMStoryInfo  WHERE " + C99269j.f291085s;
        C87412m.m108594g(str, "baseSql");
        if (j != 0) {
            str = str + " AND " + "MMStoryInfo" + ".storyID < '" + j + '\'';
        }
        String str2 = str + C99269j.f291080n + " limit " + 30;
        Log.m105918d("MicroMsg.StoryInfoStorage", "getMinIdByLimit sql=" + str2);
        Cursor rawQuery = i.f291093h.rawQuery(str2, (String[]) null);
        if (rawQuery.moveToLast()) {
            C99268i iVar = new C99268i();
            iVar.convertFrom(rawQuery);
            rawQuery.close();
            j2 = iVar.field_storyID;
        } else {
            rawQuery.close();
            j2 = 0;
        }
        this.f289661i = j2;
        long j3 = this.f289659g;
        if (j3 != 0) {
            if (j2 >= j3) {
                j2 = j3;
            }
            this.f289661i = j2;
        }
        Log.m105918d("MicroMsg.AlbumPresenter", "localMinId=" + this.f289661i + ", respMaxId=" + this.f289659g);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C97558d) {
            C97558d dVar = (C97558d) yVar;
            if (Util.isEqual(dVar.f286270d, this.f289657e)) {
                boolean z = i2 == 314 || i2 == 315;
                this.f289663n = z;
                if (z) {
                    this.f289656d.mo126116k();
                }
                if (dVar.f286277n) {
                    StoryCore.f281736t.mo134194l().post(new C98815d(this));
                } else {
                    this.f289662j = 0;
                    StoryCore.f281736t.mo134194l().post(new C98818e(this));
                }
                this.f289659g = dVar.f286276j;
                Log.m105918d("MicroMsg.AlbumPresenter", "onSceneEnd username=" + this.f289657e + " respMaxId=" + this.f289659g + ' ' + i + ' ' + i2);
            }
        }
    }
}
