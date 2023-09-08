package com.tencent.p014mm.plugin.fav.p047ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lc1.C99369a;
import lc1.C99371b;
import lc1.C99373c;
import lc1.C99374d;
import lc1.C99376e;
import lc1.C99378f;
import lc1.C99380g;
import lc1.C99382h;
import lc1.C99384i;
import lc1.C99386j;
import lc1.C99389k;
import lc1.C99392l;
import lc1.C99394m;
import lc1.C99396n;
import lc1.C99399p;
import lc1.C99401q;
import lc1.C99403r;
import lc1.C99405s;
import lc1.C99406t;
import lc1.C99408u;
import lc1.C99410v;
import lc1.c$$e;
import lc1.c$$f;
import nj3.C76879j;
import nj3.C76912y0;
import p749xh.C66261f3;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100725n1;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import pb1.C11883v0;
import te3.C101811md0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter */
public class FavoriteNormalAdapter extends C93486a {

    /* renamed from: G */
    public static final /* synthetic */ int f269969G = 0;

    /* renamed from: A */
    public int f269970A;

    /* renamed from: B */
    public int f269971B;

    /* renamed from: C */
    public String f269972C = "";

    /* renamed from: D */
    public ListView f269973D;

    /* renamed from: E */
    public IListener f269974E;

    /* renamed from: F */
    public IListener f269975F;

    /* renamed from: i */
    public boolean f269976i = false;

    /* renamed from: j */
    public List<C100755z> f269977j = new ArrayList();

    /* renamed from: n */
    public List<C100755z> f269978n = new ArrayList();

    /* renamed from: o */
    public List<C100755z> f269979o = new LinkedList();

    /* renamed from: p */
    public List<Long> f269980p = new ArrayList();

    /* renamed from: q */
    public boolean f269981q = false;

    /* renamed from: r */
    public Map<String, C100755z> f269982r = new TreeMap();

    /* renamed from: s */
    public List<Integer> f269983s = new ArrayList();

    /* renamed from: t */
    public List<String> f269984t = new LinkedList();

    /* renamed from: u */
    public List<String> f269985u = new LinkedList();

    /* renamed from: v */
    public SparseArray<C99373c> f269986v = new SparseArray<>();

    /* renamed from: w */
    public c$$f f269987w;

    /* renamed from: x */
    public boolean f269988x = false;

    /* renamed from: y */
    public boolean f269989y = false;

    /* renamed from: z */
    public boolean f269990z = false;

    public FavoriteNormalAdapter(Context context, FavoriteImageServer favoriteImageServer, boolean z) {
        C40008f fVar = C40008f.f107254d;
        this.f269974E = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                if (!(musicPlayerEvent instanceof MusicPlayerEvent)) {
                    return false;
                }
                int i = musicPlayerEvent.f9336d.f9337a;
                if (!(i == 0 || i == 1 || i == 2 || i == 3)) {
                    if (i == 4) {
                        Log.m105924i("MicroMsg.FavoriteAdapter", "musicPlayerListener error");
                        FavoriteNormalAdapter favoriteNormalAdapter = FavoriteNormalAdapter.this;
                        String string = MMApplicationContext.getContext().getString(C0966R.string.f361077h32);
                        int i2 = FavoriteNormalAdapter.f269969G;
                        favoriteNormalAdapter.getClass();
                        C76912y0.m92767f(MMApplicationContext.getContext(), string);
                        FavoriteNormalAdapter.this.notifyDataSetChanged();
                        return false;
                    } else if (i != 7) {
                        return false;
                    }
                }
                FavoriteNormalAdapter.this.notifyDataSetChanged();
                return false;
            }
        };
        this.f269975F = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                Log.m105924i("MicroMsg.FavoriteAdapter", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.FavoriteAdapter", "musicCheckErrorListener, must has error.");
                    return false;
                }
                String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : MMApplicationContext.getContext().getString(C0966R.string.f361077h32);
                FavoriteNormalAdapter favoriteNormalAdapter = FavoriteNormalAdapter.this;
                int i = FavoriteNormalAdapter.f269969G;
                favoriteNormalAdapter.getClass();
                C76912y0.m92767f(MMApplicationContext.getContext(), string);
                return false;
            }
        };
        this.f269992e = -1;
        this.f269986v.put(1, new C99403r(favoriteImageServer));
        this.f269986v.put(2, new C99380g(favoriteImageServer));
        this.f269986v.put(3, new C99410v(favoriteImageServer));
        this.f269986v.put(4, new C99408u(favoriteImageServer));
        this.f269986v.put(5, new C99406t(favoriteImageServer));
        this.f269986v.put(6, new C99382h(favoriteImageServer));
        this.f269986v.put(7, new C99386j(favoriteImageServer));
        this.f269986v.put(21, new C99389k(favoriteImageServer));
        this.f269986v.put(8, new C99376e(favoriteImageServer));
        this.f269986v.put(10, new C99394m(favoriteImageServer));
        this.f269986v.put(12, new C99401q(favoriteImageServer));
        this.f269986v.put(15, new C99401q(favoriteImageServer));
        this.f269986v.put(11, new C99384i(favoriteImageServer));
        this.f269986v.put(14, new C99396n(favoriteImageServer));
        this.f269986v.put(16, new C99399p(favoriteImageServer));
        this.f269986v.put(17, new C99374d(favoriteImageServer));
        this.f269986v.put(18, new C99392l(favoriteImageServer));
        this.f269986v.put(20, new C99378f(favoriteImageServer));
        this.f269986v.put(19, new C99371b(favoriteImageServer));
        this.f269986v.put(23, new C99369a(favoriteImageServer));
        this.f269986v.put(-2, new C99405s(favoriteImageServer));
        if (z != this.f269988x) {
            this.f269988x = z;
            if (z) {
                this.f269982r.clear();
            }
        }
        if (!this.f269988x) {
            mo128368a();
        }
        mo128369b();
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public static List<C100755z> m118113g(List<C100755z> list, int i, List<Long> list2) {
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            return arrayList;
        }
        int i2 = 0;
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
            Long valueOf = Long.valueOf(list.get(list.size() - 1).field_localId);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                } else if (valueOf.equals(list2.get(i3))) {
                    i2 = i3 + 1;
                    break;
                } else {
                    i3++;
                }
            }
        }
        int i4 = i2;
        while (i4 < i2 + i && i4 < list2.size()) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(list2.get(i4).longValue());
            if (Yt != null) {
                arrayList.add(Yt);
            }
            i4++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo128368a() {
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.FavoriteAdapter", "loadMoreData() cleanMode:%s called " + Util.getStack(), Boolean.valueOf(this.f269988x));
        }
        if (mo128384n()) {
            Log.m105926v("MicroMsg.FavoriteAdapter", "searching, do not load more data");
            return;
        }
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        if (C100725n1.f295091o.get() > 0) {
            Log.m105929w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget:%s", Integer.valueOf(C100725n1.f295091o.get()));
        } else if (!this.f269988x) {
            try {
                if (Log.isDebug()) {
                    Log.m105919d("MicroMsg.FavoriteAdapter", "loadMoreData() tryStartBatchGet called lastUpdateTime:%s", Long.valueOf(this.f269991d));
                }
                this.f269991d = C100734q.m131881w0(this.f269991d, this.f269992e, 20);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FavoriteAdapter", e, "", new Object[0]);
            }
        } else {
            mo128391s(m118113g(this.f269977j, 20, this.f269980p));
            this.f269976i = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r1v1, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0160  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128369b() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Class<pb1.j1> r1 = pb1.C100718j1.class
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.FavoriteAdapter"
            if (r2 == 0) goto L_0x002f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "reset data list beg %s "
            r2.append(r6)
            com.tencent.mm.sdk.platformtools.MMStack r6 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = r16.mo128388p()
            r6[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r2, r6)
        L_0x002f:
            r0.f269976i = r4
            java.util.List<pb1.z> r2 = r0.f269978n
            if (r2 != 0) goto L_0x0036
            goto L_0x005f
        L_0x0036:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r7 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.String r7 = "before do recycle, need recycle list size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.util.List<pb1.z> r7 = r0.f269979o
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.String r7 = "after do recycle, current can reused list size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r6)
            r2.clear()
        L_0x005f:
            boolean r2 = r16.mo128384n()
            r6 = 3
            r7 = 2
            r8 = 20
            r9 = 0
            if (r2 != 0) goto L_0x02b2
            java.lang.Object[] r2 = new java.lang.Object[r7]
            long r10 = r0.f269991d
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2[r4] = r10
            int r10 = r0.f269992e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r3] = r10
            java.lang.String r10 = "on reset data list, last update time is %d, type is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r2)
            boolean r2 = r0.f269988x
            java.lang.String r10 = "MicroMsg.Fav.FavItemInfoStorage"
            if (r2 != 0) goto L_0x0188
            r16.mo128386o()
            long r11 = r0.f269991d
            r13 = 0
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0165
            java.util.List<pb1.z> r2 = r0.f269978n
            int r2 = r2.size()
            if (r2 >= r8) goto L_0x0165
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            long r11 = r0.f269991d
            int r6 = r0.f269992e
            java.util.Set<java.lang.Integer> r15 = r0.f269993f
            xb1.d r2 = (xb1.C102614d) r2
            r2.getClass()
            if (r15 == 0) goto L_0x00c3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r8 = r15.contains(r8)
            if (r8 == 0) goto L_0x00c3
            java.lang.String r2 = "hasShowAllValidItem::block set contains target type, error, do return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r2)
            goto L_0x013e
        L_0x00c3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "select count(updateTime) from FavItemInfo where updateTime < "
            r8.append(r10)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r10 = -1
            if (r6 == r10) goto L_0x00ed
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = " and type = "
            r10.append(r8)
            r10.append(r6)
            java.lang.String r8 = r10.toString()
            goto L_0x0118
        L_0x00ed:
            if (r15 == 0) goto L_0x0118
            java.util.Iterator r6 = r15.iterator()
        L_0x00f3:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0118
            java.lang.Object r10 = r6.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            java.lang.String r8 = " and type != "
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            goto L_0x00f3
        L_0x0118:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = " and itemStatus > 0"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f302175d
            android.database.Cursor r2 = r2.rawQuery(r6, r9, r7)
            if (r2 != 0) goto L_0x0132
            goto L_0x013e
        L_0x0132:
            r2.moveToFirst()
            int r6 = r2.getInt(r4)
            if (r6 != 0) goto L_0x0140
            r2.close()
        L_0x013e:
            r2 = 1
            goto L_0x0144
        L_0x0140:
            r2.close()
            r2 = 0
        L_0x0144:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.util.List<pb1.z> r7 = r0.f269978n
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r6[r3] = r7
            java.lang.String r7 = "resetDataList() after setTempFavItem size:%s, hasShowAllValidItem:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r6)
            if (r2 != 0) goto L_0x0165
            r0.f269991d = r13
            r16.mo128386o()
        L_0x0165:
            java.util.List<pb1.z> r2 = r0.f269978n
            if (r2 == 0) goto L_0x03ec
            long r6 = r0.f269991d
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x03ec
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03ec
            java.util.List<pb1.z> r2 = r0.f269978n
            int r6 = r2.size()
            int r6 = r6 - r3
            java.lang.Object r2 = r2.get(r6)
            pb1.z r2 = (pb1.C100755z) r2
            long r6 = r2.field_updateTime
            r0.f269991d = r6
            goto L_0x03ec
        L_0x0188:
            r0.mo128390r(r4)
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            xb1.d r2 = (xb1.C102614d) r2
            r2.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int[] r13 = pb1.C100694a.f295013b
            java.lang.String r14 = ""
            r7 = r14
            r15 = 0
        L_0x01a9:
            java.lang.String r9 = ","
            if (r15 >= r6) goto L_0x01c6
            r6 = r13[r15]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            r4.append(r9)
            java.lang.String r7 = r4.toString()
            int r15 = r15 + 1
            r4 = 0
            r6 = 3
            goto L_0x01a9
        L_0x01c6:
            boolean r4 = r7.endsWith(r9)
            if (r4 == 0) goto L_0x01d6
            int r4 = r7.length()
            int r4 = r4 - r3
            r6 = 0
            java.lang.String r7 = r7.substring(r6, r4)
        L_0x01d6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "select localId from FavItemInfo where "
            r4.append(r6)
            java.lang.String r6 = " itemStatus in ("
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = ")"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " and datatotalsize > 0 "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            int[] r7 = pb1.C100694a.f295012a
            r13 = 0
        L_0x0206:
            r15 = 8
            if (r13 >= r15) goto L_0x0222
            r15 = r7[r13]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r3.append(r15)
            r3.append(r9)
            java.lang.String r14 = r3.toString()
            int r13 = r13 + 1
            r3 = 1
            goto L_0x0206
        L_0x0222:
            boolean r3 = r14.endsWith(r9)
            if (r3 == 0) goto L_0x0233
            int r3 = r14.length()
            r7 = 1
            int r3 = r3 - r7
            r7 = 0
            java.lang.String r14 = r14.substring(r7, r3)
        L_0x0233:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " and type in ("
            r3.append(r4)
            r3.append(r14)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " order by datatotalsize desc"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f302175d
            r4 = 0
            android.database.Cursor r2 = r2.rawQuery(r3, r4)
            if (r2 != 0) goto L_0x0265
            goto L_0x02a4
        L_0x0265:
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x026f
            r2.close()
            goto L_0x02a4
        L_0x026f:
            boolean r3 = r2.moveToNext()
            if (r3 == 0) goto L_0x0282
            r3 = 0
            long r6 = r2.getLong(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r8.add(r4)
            goto L_0x026f
        L_0x0282:
            r3 = 0
            r2.close()
            long r6 = java.lang.System.currentTimeMillis()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r4 = r8.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            long r6 = r6 - r11
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "getCleanList cu.getCount() = %d,used %dms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
        L_0x02a4:
            r0.f269980p = r8
            r2 = 20
            r3 = 0
            java.util.List r3 = m118113g(r3, r2, r8)
            r0.mo128391s(r3)
            goto L_0x03ec
        L_0x02b2:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.List<java.lang.String> r3 = r0.f269984t
            r4 = 0
            r2[r4] = r3
            java.util.List<java.lang.String> r3 = r0.f269985u
            r4 = 1
            r2[r4] = r3
            java.util.List<java.lang.Integer> r3 = r0.f269983s
            r4 = 2
            r2[r4] = r3
            java.lang.String r3 = "on reset data list, do search, searchStr:%s, tagStr:%s, searchTypes:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            java.util.List<java.lang.String> r2 = r0.f269984t
            if (r2 == 0) goto L_0x02e7
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.String r3 = "::fail"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x02e7
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            java.util.List r2 = r2.mo128196CX()
            r0.mo128391s(r2)
            goto L_0x03d1
        L_0x02e7:
            java.util.List<java.lang.String> r2 = r0.f269984t
            if (r2 == 0) goto L_0x036f
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.String r3 = "::del"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x036f
            boolean r2 = r0.f269990z
            if (r2 != 0) goto L_0x0366
            qb1.b r2 = qb1.C101089b.f295920a
            com.tencent.mm.sdk.storage.sql.SingleTable r2 = qb1.C101089b.f295921b
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.selectAll()
            com.tencent.mm.sdk.storage.sql.Column r3 = p749xh.C102660p2.f302859r
            com.tencent.mm.sdk.storage.sql.ISqlOrder r3 = r3.orderDesc()
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.orderBy((com.tencent.p014mm.sdk.storage.sql.ISqlOrder) r3)
            com.tencent.mm.sdk.storage.sql.SelectSql r2 = r2.build()
            rx3.g r3 = qb1.C101089b.f295922c
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = (com.tencent.p014mm.sdk.storage.ISQLiteDatabase) r3
            java.lang.Class<qb1.a> r4 = qb1.C101088a.class
            java.util.List r2 = r2.multiQuery(r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r4[r6] = r3
            java.lang.String r3 = "MicroMsg.FavDelMgr"
            java.lang.String r6 = "------ printAllDelInfo ----- size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r4)
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L_0x0339:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0366
            java.lang.Object r6 = r2.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x0361
            qb1.a r6 = (qb1.C101088a) r6
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r9[r8] = r4
            java.lang.String r4 = " ---- index:%s ----"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r9)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r4 = r7
            goto L_0x0339
        L_0x0361:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0366:
            android.widget.ListView r2 = r0.f269973D
            r2.getContext()
            r3 = 1
            r0.f269990z = r3
            goto L_0x03d1
        L_0x036f:
            r2 = 0
            r3 = 1
            java.util.List<java.lang.Integer> r4 = r0.f269983s
            if (r4 == 0) goto L_0x0391
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r4 == r3) goto L_0x0391
            java.util.List<java.lang.String> r6 = r0.f269984t
            java.util.List<java.lang.String> r7 = r0.f269985u
            java.util.List<java.lang.Integer> r8 = r0.f269983s
            java.util.List<pb1.z> r9 = r0.f269979o
            java.util.Set<java.lang.Integer> r10 = r0.f269993f
            pb1.v0 r11 = r0.f269994g
            java.util.ArrayList r2 = pb1.C100734q.m131822M(r6, r7, r8, r9, r10, r11)
            r0.mo128391s(r2)
            goto L_0x03d1
        L_0x0391:
            java.util.List<java.lang.Integer> r3 = r0.f269983s
            if (r3 == 0) goto L_0x03a0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2 = 0
            java.lang.Object r3 = r3.get(r2)
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x03a1
        L_0x03a0:
            r9 = r2
        L_0x03a1:
            java.util.List<java.lang.String> r10 = r0.f269984t
            java.util.List<java.lang.String> r11 = r0.f269985u
            int r12 = r9.intValue()
            java.util.List<pb1.z> r13 = r0.f269979o
            java.util.Set<java.lang.Integer> r14 = r0.f269993f
            pb1.v0 r15 = r0.f269994g
            java.util.ArrayList r2 = pb1.C100734q.m131821L(r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x03bc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03ce
            java.lang.Object r4 = r2.next()
            xh.r2 r4 = (p749xh.C102666r2) r4
            pb1.z r4 = (pb1.C100755z) r4
            r3.add(r4)
            goto L_0x03bc
        L_0x03ce:
            r0.mo128391s(r3)
        L_0x03d1:
            java.util.List<pb1.z> r2 = r0.f269978n
            if (r2 != 0) goto L_0x03d7
            r2 = 0
            goto L_0x03db
        L_0x03d7:
            int r2 = r2.size()
        L_0x03db:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 10649(0x2999, float:1.4922E-41)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r7[r6] = r2
            r3.mo160131h(r4, r7)
        L_0x03ec:
            java.util.List<pb1.z> r2 = r0.f269978n
            if (r2 != 0) goto L_0x03fe
            java.lang.String r2 = "reset data list fail, get null list, new empty one"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mo128391s(r2)
        L_0x03fe:
            boolean r2 = r0.f269988x
            if (r2 != 0) goto L_0x044e
            boolean r2 = r16.mo128384n()
            if (r2 != 0) goto L_0x0438
            java.util.List<pb1.z> r2 = r0.f269978n
            int r2 = r2.size()
            r3 = 20
            if (r2 >= r3) goto L_0x0438
            di3.d r1 = di3.C86312j.m106911c(r1)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.w0 r1 = r1.mo128199Jq()
            long r2 = r0.f269991d
            int r4 = r0.f269992e
            xb1.d r1 = (xb1.C102614d) r1
            boolean r1 = r1.mo142268bF(r2, r4)
            if (r1 != 0) goto L_0x0432
            java.lang.String r1 = "least than page count, loadMoreData"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r1)
            r16.mo128368a()
            goto L_0x044e
        L_0x0432:
            java.lang.String r1 = "hasShow all"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r1)
            goto L_0x044e
        L_0x0438:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.util.List<pb1.z> r3 = r0.f269978n
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "check list size enough:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r3, r2)
            goto L_0x0450
        L_0x044e:
            r1 = 1
            r4 = 0
        L_0x0450:
            r0.f269976i = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.List<pb1.z> r2 = r0.f269978n
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "reset data list end tempFavItemInfoList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter.mo128369b():void");
    }

    /* renamed from: d */
    public void mo128370d(List<Integer> list, List<String> list2, List<String> list3) {
        mo128390r(0);
        ((ArrayList) this.f269983s).clear();
        if (list != null) {
            ((ArrayList) this.f269983s).addAll(list);
            if (!list.isEmpty()) {
                mo128390r(2);
            }
        }
        ((LinkedList) this.f269984t).clear();
        if (list2 != null) {
            ((LinkedList) this.f269984t).addAll(list2);
            if (!list2.isEmpty()) {
                mo128390r(3);
            }
        }
        ((LinkedList) this.f269985u).clear();
        if (list3 != null) {
            ((LinkedList) this.f269985u).addAll(list3);
            if (!list3.isEmpty()) {
                mo128390r(1);
            }
        }
        mo128369b();
    }

    /* renamed from: f */
    public void mo128371f(boolean z, C100755z zVar) {
        C100755z Yt;
        if (z != this.f269981q) {
            this.f269981q = z;
            if (z) {
                ((TreeMap) this.f269982r).clear();
                if (!(zVar == null || (Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(zVar.field_localId)) == null)) {
                    if (zVar.f295172Q0) {
                        ((TreeMap) this.f269982r).put(zVar.f295174S0, zVar);
                    } else {
                        ((TreeMap) this.f269982r).put(Util.notNullToString(Long.valueOf(Yt.field_localId)), Yt);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.f269977j.size() + 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = getItem(i - 1).field_type;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
                return i2;
            default:
                Log.m105929w("MicroMsg.FavoriteAdapter", "get item view type unknown, %d", Integer.valueOf(i2));
                return -2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r2 = r2.f298616d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0021
            android.content.Context r9 = r11.getContext()
            android.view.View r10 = new android.view.View
            r10.<init>(r9)
            android.widget.AbsListView$LayoutParams r9 = new android.widget.AbsListView$LayoutParams
            r9.<init>(r0, r0)
            r10.setLayoutParams(r9)
            r9 = 2131100531(0x7f060373, float:1.7813446E38)
            r10.setBackgroundResource(r9)
            r10.setPadding(r0, r0, r0, r0)
            r10.setEnabled(r0)
            return r10
        L_0x0021:
            int r1 = r9 + -1
            pb1.z r1 = r8.getItem(r1)
            int r2 = r1.field_type
            r3 = 7
            r4 = 1
            if (r3 != r2) goto L_0x0065
            te3.kd0 r2 = r1.field_favProto
            if (r2 == 0) goto L_0x0038
            te3.rd0 r2 = r2.f298616d
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = r2.f299362w
            goto L_0x003a
        L_0x0038:
            java.lang.String r2 = ""
        L_0x003a:
            java.lang.String r5 = "wx5aa333606550dfd5"
            boolean r2 = gy3.C87412m.m108589b(r5, r2)
            if (r2 == 0) goto L_0x0048
            r2 = 21
            r1.field_type = r2
            goto L_0x0065
        L_0x0048:
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_new_music_type_flag
            bp3.f r6 = bp3.C104160f.RepairerConfig_Mv_CardDownLevel_Int
            int r2 = r2.dl0(r5, r6, r0)
            if (r2 != r4) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            if (r2 != 0) goto L_0x0062
            r1.field_type = r3
            goto L_0x0065
        L_0x0062:
            r2 = 5
            r1.field_type = r2
        L_0x0065:
            android.util.SparseArray<lc1.c> r2 = r8.f269986v
            int r3 = r1.field_type
            java.lang.Object r2 = r2.get(r3)
            lc1.c r2 = (lc1.C99373c) r2
            java.lang.String r3 = "MicroMsg.FavoriteAdapter"
            if (r2 != 0) goto L_0x009e
            java.lang.Object[] r9 = new java.lang.Object[r4]
            int r2 = r1.field_type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r0] = r2
            java.lang.String r0 = "unknown type %d, use unknown item creator"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r9)
            android.util.SparseArray<lc1.c> r9 = r8.f269986v
            r0 = -2
            java.lang.Object r9 = r9.get(r0)
            lc1.c r9 = (lc1.C99373c) r9
            com.tencent.mm.plugin.fav.ui.adapter.a$a r0 = r8.f269995h
            if (r0 == 0) goto L_0x0099
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$p r0 = (com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI.C93473p) r0
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI r0 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI.this
            pc1.f r0 = r0.f269630q
            r0.mo107385a(r4)
        L_0x0099:
            android.view.View r9 = r9.mo138840b(r10, r11, r1)
            return r9
        L_0x009e:
            lc1.c$$d r5 = r2.f291379b
            boolean r6 = r8.mo128384n()
            r5.f291382b = r6
            lc1.c$$d r5 = r2.f291379b
            long r6 = r8.f269991d
            r5.f291381a = r6
            boolean r6 = r8.f269981q
            r5.f291383c = r6
            java.util.Map<java.lang.String, pb1.z> r6 = r8.f269982r
            r5.f291384d = r6
            lc1.c$$f r6 = r8.f269987w
            r5.f291385e = r6
            boolean r6 = r8.f269988x
            r5.f291386f = r6
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            if (r5 == 0) goto L_0x00db
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r0] = r9
            int r9 = r1.field_type
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r4] = r9
            r9 = 2
            r5[r9] = r2
            java.lang.String r9 = "getView() called with: position:%s info.field_type:%s，itemCreator:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r9, r5)
        L_0x00db:
            android.view.View r9 = r2.mo138840b(r10, r11, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return this.f269986v.size() + 4;
    }

    /* renamed from: h */
    public C100755z getItem(int i) {
        if (i >= 0 && i < this.f269977j.size()) {
            return this.f269977j.get(i);
        }
        Log.m105920e("MicroMsg.FavoriteAdapter", "get item, but position error");
        return new C100755z();
    }

    /* renamed from: i */
    public List<C100755z> mo128379i(boolean z) {
        LinkedList linkedList = new LinkedList();
        for (C100755z zVar : ((TreeMap) this.f269982r).values()) {
            if (zVar != null) {
                linkedList.add(zVar);
            }
        }
        if (z) {
            ((TreeMap) this.f269982r).clear();
        }
        return linkedList;
    }

    public boolean isEmpty() {
        return this.f269977j.isEmpty();
    }

    /* renamed from: j */
    public int mo128381j() {
        return ((TreeMap) this.f269982r).size();
    }

    /* renamed from: k */
    public long mo128382k() {
        long j = 0;
        for (C100755z zVar : ((TreeMap) this.f269982r).values()) {
            if (zVar != null) {
                j += zVar.field_datatotalsize;
            }
        }
        return j;
    }

    /* renamed from: l */
    public void mo128383l(View view, int i, C100755z zVar) {
        if (zVar == null) {
            Log.m105928w("MicroMsg.FavoriteAdapter", "goFavDetail() favItemInfo is null");
        } else if (!zVar.f295172Q0 || zVar.f295173R0 == null) {
            Log.m105928w("MicroMsg.FavoriteAdapter", "goFavDetail() originInfo not exist");
        } else {
            StringBuilder sb = new StringBuilder();
            C100755z zVar2 = zVar.f295173R0;
            String str = zVar2.field_id + "_" + (System.currentTimeMillis() / 1000);
            LinkedList<String> linkedList = zVar2.field_tagProto.f186495e;
            if (!Util.isNullOrNil((List) linkedList)) {
                for (String append : linkedList) {
                    sb.append(append);
                    sb.append(";");
                }
            }
            C101811md0 md02 = new C101811md0();
            md02.f298813d = this.f269970A;
            md02.f298814e = this.f269971B;
            md02.f298817h = this.f269972C;
            md02.f298816g = str;
            md02.f298818i = sb.toString();
            Context context = view != null ? view.getContext() : MMApplicationContext.getContext();
            zVar.f295173R0.f295175T0 = zVar.f295175T0;
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(context, zVar.f295173R0, md02);
            Log.m105919d("MicroMsg.FavoriteAdapter", "goFavDetail type %s %s", Integer.valueOf(zVar.f295173R0.field_type), zVar.f295175T0, Integer.valueOf(zVar.field_type));
        }
    }

    /* renamed from: n */
    public boolean mo128384n() {
        return !this.f269984t.isEmpty() || !this.f269985u.isEmpty() || !this.f269983s.isEmpty();
    }

    public void notifyDataSetChanged() {
        List<C100755z> list;
        if (Log.isDebug()) {
            Log.m105927v("MicroMsg.FavoriteAdapter", "on notify data set changed requset, can exchange tempList[%B]" + Util.getStack(), Boolean.valueOf(this.f269976i));
        }
        if (this.f269976i) {
            if (this.f269988x && (list = this.f269978n) != null && this.f269977j != null && list.size() == this.f269977j.size()) {
                this.f269989y = true;
            }
            List<C100755z> list2 = this.f269977j;
            this.f269977j = this.f269978n;
            this.f269978n = list2;
            this.f269976i = false;
        }
        Object[] objArr = new Object[1];
        List<C100755z> list3 = this.f269977j;
        objArr[0] = list3 != null ? Integer.valueOf(list3.size()) : null;
        Log.m105927v("MicroMsg.FavoriteAdapter", "on notify data set changed end favItemInfoList:%s", objArr);
        super.notifyDataSetChanged();
    }

    /* renamed from: o */
    public final void mo128386o() {
        long j = this.f269991d;
        int i = this.f269992e;
        List<C100755z> list = this.f269979o;
        Set<Integer> set = this.f269993f;
        C11883v0 v0Var = this.f269994g;
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        Class cls = C100718j1.class;
        if (Log.isDebug()) {
            Log.m105918d("MicroMsg.Fav.FavApiLogic", "getItemList() called with: updateTime = [" + j + "], type = [" + i + "], pageCount = [" + 20 + "], recycledList = [" + list + "], blockSet = [" + set + "], filter = [" + v0Var + "]");
        }
        ArrayList arrayList = null;
        if (((C100718j1) C86312j.m106911c(cls)).mo128199Jq() == null) {
            Log.m105920e("MicroMsg.Fav.FavApiLogic", "getItemList error, getFavItemInfoStorage null.");
        } else if (j == 0) {
            C102614d dVar = (C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq();
            dVar.getClass();
            if (set == null || !set.contains(Integer.valueOf(i))) {
                ArrayList arrayList2 = new ArrayList();
                String str = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where itemStatus > 0";
                if (i != -1) {
                    str = str + " and type = " + i;
                } else if (set != null) {
                    for (Integer intValue : set) {
                        str = str + " and type != " + intValue.intValue();
                    }
                }
                Cursor rawQuery = dVar.f302175d.rawQuery(str + " order by updateTime desc limit " + 20, (String[]) null, 2);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        C100755z zVar = new C100755z();
                        zVar.convertFrom(rawQuery);
                        if (v0Var == null || !((C100703e0) v0Var).mo140134c(zVar)) {
                            arrayList2.add(zVar);
                        } else {
                            Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", Integer.valueOf(zVar.field_id), Integer.valueOf(zVar.field_type));
                        }
                    }
                    rawQuery.close();
                }
                arrayList = arrayList2;
            } else {
                Log.m105928w("MicroMsg.Fav.FavItemInfoStorage", "getFirstPageList::block set contains target type, error, do return null");
            }
        } else {
            C102614d dVar2 = (C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq();
            dVar2.getClass();
            if (set == null || !set.contains(Integer.valueOf(i))) {
                ArrayList arrayList3 = new ArrayList();
                String str2 = "select " + "xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid" + " from " + "FavItemInfo" + " where " + C66261f3.COL_UPDATETIME + " >= " + j;
                if (i != -1) {
                    str2 = str2 + " and type = " + i;
                } else if (set != null) {
                    for (Integer intValue2 : set) {
                        str2 = str2 + " and type != " + intValue2.intValue();
                    }
                }
                Cursor rawQuery2 = dVar2.f302175d.rawQuery((str2 + " and itemStatus > 0") + " order by updateTime desc", (String[]) null, 2);
                if (rawQuery2 != null) {
                    while (rawQuery2.moveToNext()) {
                        C100755z zVar2 = new C100755z();
                        try {
                            zVar2.convertFrom(rawQuery2);
                            if (v0Var == null || !((C100703e0) v0Var).mo140134c(zVar2)) {
                                arrayList3.add(zVar2);
                            }
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.Fav.FavItemInfoStorage", "fav getlist convertfrom (cu) error,continue");
                        }
                    }
                    rawQuery2.close();
                }
                arrayList = arrayList3;
            } else {
                Log.m105928w("MicroMsg.Fav.FavItemInfoStorage", "getList::block set contains target type, error, do return null");
            }
        }
        mo128391s(arrayList);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        c$$e c__e = (c$$e) view.getTag();
        if (c__e == null) {
            Log.m105928w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
            return;
        }
        C100755z zVar = c__e.f291387a;
        if (zVar == null) {
            Log.m105928w("MicroMsg.FavoriteAdapter", "on item click, info is null");
        } else if (!this.f269981q && !this.f269988x) {
            C99373c cVar = this.f269986v.get(zVar.field_type);
            if (cVar != null) {
                StringBuilder sb = new StringBuilder();
                C100755z zVar2 = c__e.f291387a;
                String str = zVar2.field_id + "_" + (System.currentTimeMillis() / 1000);
                LinkedList<String> linkedList = zVar2.field_tagProto.f186495e;
                if (!Util.isNullOrNil((List) linkedList)) {
                    for (String append : linkedList) {
                        sb.append(append);
                        sb.append(";");
                    }
                }
                C101811md0 md02 = new C101811md0();
                md02.f298813d = this.f269970A;
                md02.f298814e = this.f269971B;
                ListView listView = this.f269973D;
                if (listView != null) {
                    md02.f298815f = i - listView.getHeaderViewsCount();
                } else {
                    md02.f298815f = i;
                }
                md02.f298817h = this.f269972C;
                md02.f298816g = str;
                md02.f298818i = sb.toString();
                cVar.mo138841c(view, md02);
                Log.m105919d("MicroMsg.FavoriteAdapter", "item click type %s", Integer.valueOf(c__e.f291387a.field_type));
            }
        } else if (c__e.f291392f.isChecked() || ((TreeMap) this.f269982r).size() < 30) {
            CheckBox checkBox = c__e.f291392f;
            checkBox.setChecked(!checkBox.isChecked());
        } else {
            Log.m105929w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", 30);
            C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.cp9, new Object[]{30}));
        }
    }

    /* renamed from: p */
    public String mo128388p() {
        return "inSearchMode:" + mo128384n() + " " + "inCleanFavSpaceMode:" + this.f269988x + " ";
    }

    /* renamed from: q */
    public int mo128389q(long j, String str) {
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
        if (Yt == null) {
            return -1;
        }
        int i = 0;
        boolean z = true;
        if (((TreeMap) this.f269982r).size() >= 30) {
            Log.m105929w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", 30);
            C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.cp9, new Object[]{30}));
            return -1;
        }
        if (!Util.isNullOrNil(str)) {
            Iterator<C100755z> it = this.f269977j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C100755z next = it.next();
                if (Util.isEqual(next.f295174S0, str)) {
                    next.f295173R0 = Yt;
                    Yt = next;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            ((TreeMap) this.f269982r).put(str, Yt);
        } else {
            ((TreeMap) this.f269982r).put(Util.notNullToString(Long.valueOf(j)), Yt);
        }
        long j2 = Yt.field_updateTime;
        if (j2 < this.f269991d) {
            this.f269991d = j2;
            mo128369b();
            for (C100755z next2 : this.f269978n) {
                if (Util.isNullOrNil(str)) {
                    if (next2.field_localId == j) {
                        notifyDataSetChanged();
                        return i;
                    }
                } else if (next2.field_localId == j && Util.isEqual(str, next2.f295174S0)) {
                    notifyDataSetChanged();
                    return i;
                }
                i++;
            }
            notifyDataSetChanged();
        } else {
            for (C100755z next3 : this.f269977j) {
                if (Util.isNullOrNil(str)) {
                    if (next3.field_localId == j) {
                        notifyDataSetChanged();
                        return i;
                    }
                } else if (next3.field_localId == j && Util.isEqual(str, next3.f295174S0)) {
                    notifyDataSetChanged();
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public void mo128390r(int i) {
        int i2 = this.f269971B;
        if (i == 0) {
            this.f269971B = 0;
        } else if (i2 == 0) {
            this.f269971B = i;
        } else if (i2 != i) {
            this.f269971B = 4;
        }
    }

    /* renamed from: s */
    public final void mo128391s(List<C100755z> list) {
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.FavoriteAdapter", "setTempFavItemInfoList: %s" + Util.getStack(), Integer.valueOf(list.size()));
        }
        this.f269978n = list;
    }
}
