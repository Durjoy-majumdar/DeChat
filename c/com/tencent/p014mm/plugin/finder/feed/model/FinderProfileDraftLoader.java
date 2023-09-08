package com.tencent.p014mm.plugin.finder.feed.model;

import android.database.Cursor;
import cm1.C0740i2;
import cm1.C55027r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je1.C46519f3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import p599lr.C61381b;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13923t;
import up1.C65418l;
import uq1.C65463v;
import wp1.C66165b;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileDraftLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader */
public final class FinderProfileDraftLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final String f158679d;

    /* renamed from: e */
    public boolean f158680e;

    /* renamed from: f */
    public C32224a<C13598b0> f158681f;

    /* renamed from: g */
    public volatile C55743a f158682g = C55743a.INIT;

    /* renamed from: h */
    public final FinderProfileDraftLoader$draftAddListener$1 f158683h;

    /* renamed from: i */
    public final FinderProfileDraftLoader$draftProgressListener$1 f158684i;

    /* renamed from: j */
    public final C55746e f158685j;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$d */
    public static final class C2738d extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileDraftLoader f13805a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$d$a */
        public static final class C2739a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2738d f13806d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13807e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13808f;

            /* renamed from: g */
            public final /* synthetic */ FinderProfileDraftLoader f13809g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13810h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13811i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2739a(C2738d dVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderProfileDraftLoader finderProfileDraftLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13806d = dVar;
                this.f13807e = tVar;
                this.f13808f = cVar;
                this.f13809g = finderProfileDraftLoader;
                this.f13810h = lVar;
                this.f13811i = iResponse;
            }

            public Object invoke() {
                this.f13806d.convertOpToReason(this.f13807e, this.f13808f);
                this.f13809g.dispatcher().mo13381g(this.f13808f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13810h;
                if (lVar != null) {
                    lVar.invoke(this.f13811i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2738d(FinderProfileDraftLoader finderProfileDraftLoader) {
            super(finderProfileDraftLoader, false, 1, (C8480h) null);
            this.f13805a = finderProfileDraftLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            C61926c.m72668M(new C2739a(this, new C13923t(7, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), new RefreshLoadMoreLayout.C7080c(0), this.f13805a, lVar, iResponse));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$a */
    public enum C55743a {
        INIT,
        NO_CACHE,
        WITH_CACHED
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$b */
    public final class C55744b extends C13896d {
        public C55744b() {
        }

        public IResponse<C0740i2> callInit() {
            FinderProfileDraftLoader finderProfileDraftLoader = FinderProfileDraftLoader.this;
            ArrayList arrayList = new ArrayList();
            String str = FinderProfileDraftLoader.this.f158679d;
            if (str == null) {
                str = "";
            }
            ArrayList<C65418l> d = FinderProfileDraftLoader.m63469d(finderProfileDraftLoader, arrayList, str);
            String tag = getTAG();
            Log.m105924i(tag, "callInit size:" + d.size());
            C55745c cVar = new C55745c(0, 0, "");
            ArrayList arrayList2 = new ArrayList();
            for (C65418l rVar : d) {
                arrayList2.add(new C55027r(rVar));
            }
            cVar.setIncrementList(arrayList2);
            cVar.setLastBuffer((C89349b) null);
            cVar.setHasMore(true);
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x021a A[LOOP:2: B:44:0x0214->B:46:0x021a, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r19, int r20, java.lang.String r21, ob0.C117747y r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r22
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                java.lang.String r5 = "scene"
                gy3.C87412m.m108594g(r3, r5)
                je1.f3 r3 = (je1.C46519f3) r3
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse"
                r6 = 1
                r7 = 0
                if (r1 != 0) goto L_0x002b
                if (r2 != 0) goto L_0x002b
                ob0.c r8 = r3.f125321g
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r5)
                te3.pm0 r8 = (te3.C50848pm0) r8
                int r8 = r8.f139832f
                if (r8 <= 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                r8 = 0
                goto L_0x002c
            L_0x002b:
                r8 = 1
            L_0x002c:
                com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$c r9 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$c
                r10 = r21
                r9.<init>(r1, r2, r10)
                r9.setHasMore(r8)
                ob0.c r1 = r3.f125321g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r5)
                te3.pm0 r1 = (te3.C50848pm0) r1
                pe3.b r1 = r1.f139831e
                r9.setLastBuffer(r1)
                int r1 = r3.f125323i
                r9.setPullType(r1)
                up1.f r1 = up1.C37521f.f99374d
                r1.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99572z
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                java.lang.String r2 = ""
                r10 = 0
                if (r1 != 0) goto L_0x006d
                r9.setHasMore(r7)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r16 = r9
                goto L_0x018b
            L_0x006d:
                ob0.c r1 = r3.f125321g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r5)
                te3.pm0 r1 = (te3.C50848pm0) r1
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r1.f139830d
                java.lang.String r5 = "commReqResp.responseProt…etDraftResponse).`object`"
                gy3.C87412m.m108593f(r1, r5)
                di3.d r5 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
                wp1.b r5 = r5.Cx0()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0092:
                boolean r12 = r1.hasNext()
                if (r12 == 0) goto L_0x0184
                java.lang.Object r12 = r1.next()
                com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
                long r13 = r12.f164794id
                up1.l r13 = r5.mo90226Yt(r13)
                r14 = 4
                java.lang.String r15 = "Finder.FinderDraftStorageLogic"
                if (r13 == 0) goto L_0x0134
                int r7 = r13.field_markDeleted
                if (r7 != 0) goto L_0x012e
                int r7 = r13.field_localFlag
                r7 = r7 & r14
                if (r7 == 0) goto L_0x00b4
                r7 = 1
                goto L_0x00b5
            L_0x00b4:
                r7 = 0
            L_0x00b5:
                if (r7 == 0) goto L_0x010e
                com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r17 = r8
                r16 = r9
                long r8 = r13.field_localId
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo79057c(r12, r10, r8)
                r13.f188267L = r7
                wp1.c r7 = wp1.C66166c.f190172a
                r7.mo90230a(r13)
                long r7 = r12.f164794id
                r13.mo89516n2()
                android.content.ContentValues r9 = r13.convertTo()
                java.lang.String r12 = "rowid"
                r9.remove(r12)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r5.f190170i
                java.lang.String[] r14 = new java.lang.String[r6]
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r7 = 0
                r14[r7] = r6
                java.lang.String r6 = "FinderDraftItem"
                java.lang.String r7 = "objectId=?"
                r12.update(r6, r9, r7, r14)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Finder.LogPost updateSvrDrafts, update, "
                r6.append(r7)
                java.lang.String r7 = r13.mo89515m2()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
                goto L_0x012a
            L_0x010e:
                r17 = r8
                r16 = r9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Finder.LogPost updateSvrDrafts, drop, "
                r6.append(r7)
                java.lang.String r7 = r13.mo89515m2()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            L_0x012a:
                r11.add(r13)
                goto L_0x0132
            L_0x012e:
                r17 = r8
                r16 = r9
            L_0x0132:
                r8 = 0
                goto L_0x017c
            L_0x0134:
                r17 = r8
                r16 = r9
                wp1.c r6 = wp1.C66166c.f190172a
                up1.l r7 = new up1.l
                r7.<init>()
                r7.field_localFlag = r14
                te3.vq0 r8 = new te3.vq0
                r8.<init>()
                r8.f185976d = r12
                r7.field_finderItem = r8
                int r8 = r12.objectType
                r7.field_objectType = r8
                r7.field_postIntent = r2
                r7.field_originMvInfo = r10
                long r8 = r12.f164794id
                r7.field_objectId = r8
                r8 = 0
                r7.field_markDeleted = r8
                r7.field_version = r8
                r6.mo90230a(r7)
                r5.mo90225Ow(r7)
                r11.add(r7)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "Finder.LogPost updateSvrDrafts, create, "
                r6.append(r9)
                java.lang.String r7 = r7.mo89515m2()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            L_0x017c:
                r9 = r16
                r8 = r17
                r6 = 1
                r7 = 0
                goto L_0x0092
            L_0x0184:
                r17 = r8
                r16 = r9
                r1 = r11
                r7 = r17
            L_0x018b:
                int r3 = r3.f125323i
                r5 = 1
                if (r3 != r5) goto L_0x019c
                com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader r3 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader.this
                java.lang.String r5 = r3.f158679d
                if (r5 != 0) goto L_0x0197
                goto L_0x0198
            L_0x0197:
                r2 = r5
            L_0x0198:
                java.util.ArrayList r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader.m63469d(r3, r1, r2)
            L_0x019c:
                com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader r2 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader.this
                r2.getClass()
                if (r7 != 0) goto L_0x0205
                di3.d r3 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
                wp1.b r3 = r3.Cx0()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "SELECT * FROM FinderDraftItem  WHERE dbversion=0 ORDER BY "
                r5.append(r6)
                java.lang.String r6 = r3.f190165d
                r5.append(r6)
                java.lang.String r6 = ".localId DESC"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r3.f190170i
                r6 = 2
                android.database.Cursor r3 = r3.rawQuery(r5, r10, r6)
            L_0x01d1:
                boolean r5 = r3.moveToNext()
                if (r5 == 0) goto L_0x01e3
                up1.l r5 = new up1.l
                r5.<init>()
                r5.convertFrom(r3)
                r4.add(r5)
                goto L_0x01d1
            L_0x01e3:
                r3.close()
                r1.addAll(r4)
                java.lang.String r2 = r2.getTAG()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "append originalVersionItems size:"
                r3.append(r5)
                int r4 = r4.size()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            L_0x0205:
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = sx3.C36907w.m41090l(r1, r3)
                r2.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L_0x0214:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0229
                java.lang.Object r3 = r1.next()
                up1.l r3 = (up1.C65418l) r3
                cm1.r r4 = new cm1.r
                r4.<init>(r3)
                r2.add(r4)
                goto L_0x0214
            L_0x0229:
                r3 = r16
                r3.setIncrementList(r2)
                java.lang.String r1 = r18.getTAG()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "response.incrementList size:"
                r2.append(r4)
                java.util.List r4 = r3.getIncrementList()
                if (r4 == 0) goto L_0x024a
                int r4 = r4.size()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            L_0x024a:
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader.C55744b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            if (!C87412m.m108589b(C66785b.f191882e.mo90662O5(), FinderProfileDraftLoader.this.f158679d)) {
                return null;
            }
            FinderProfileDraftLoader finderProfileDraftLoader = FinderProfileDraftLoader.this;
            return new C46519f3(finderProfileDraftLoader.f158679d, finderProfileDraftLoader.getLastBuffer(), 2, FinderProfileDraftLoader.this.getContextObj());
        }

        public C117747y genRefreshNetScene() {
            if (!C87412m.m108589b(C66785b.f191882e.mo90662O5(), FinderProfileDraftLoader.this.f158679d)) {
                return null;
            }
            FinderProfileDraftLoader finderProfileDraftLoader = FinderProfileDraftLoader.this;
            return new C46519f3(finderProfileDraftLoader.f158679d, (C89349b) null, 1, finderProfileDraftLoader.getContextObj());
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5801);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$c */
    public static final class C55745c extends IResponse<C0740i2> {
        public C55745c(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$e */
    public static final class C55746e implements C65463v {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileDraftLoader f158691a;

        public C55746e(FinderProfileDraftLoader finderProfileDraftLoader) {
            this.f158691a = finderProfileDraftLoader;
        }

        public void onPostEnd(long j, boolean z) {
            FinderProfileDraftLoader finderProfileDraftLoader = this.f158691a;
            finderProfileDraftLoader.getClass();
            C61926c.m72668M(new C55769i0(finderProfileDraftLoader, j, false));
        }

        public void onPostOk(long j, long j2) {
            FinderProfileDraftLoader finderProfileDraftLoader = this.f158691a;
            finderProfileDraftLoader.getClass();
            C61926c.m72668M(new C55769i0(finderProfileDraftLoader, j, false));
        }
    }

    public FinderProfileDraftLoader(String str, C49712hj1 hj12) {
        super(hj12);
        this.f158679d = str;
        C40008f fVar = C40008f.f107254d;
        this.f158683h = new FinderProfileDraftLoader$draftAddListener$1(this, fVar);
        this.f158684i = new FinderProfileDraftLoader$draftProgressListener$1(this, fVar);
        this.f158685j = new C55746e(this);
    }

    /* renamed from: d */
    public static final ArrayList m63469d(FinderProfileDraftLoader finderProfileDraftLoader, ArrayList arrayList, String str) {
        finderProfileDraftLoader.getClass();
        if ((str.length() == 0) || !C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0();
        ArrayList arrayList3 = new ArrayList();
        Cursor rawQuery = Cx0.f190170i.rawQuery("SELECT * FROM FinderDraftItem  WHERE " + Cx0.f190166e + " AND " + Cx0.f190168g + " AND " + Cx0.f190169h + " ORDER BY " + Cx0.f190165d + ".localId DESC", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C65418l lVar = new C65418l();
            lVar.convertFrom(rawQuery);
            arrayList3.add(lVar);
        }
        rawQuery.close();
        arrayList2.addAll(arrayList3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C65418l lVar2 = (C65418l) it.next();
            Iterator it4 = arrayList3.iterator();
            int i = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C65418l) it4.next()).field_objectId == lVar2.field_objectId) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                String tag = finderProfileDraftLoader.getTAG();
                Log.m105924i(tag, "object exist in local: " + lVar2.field_objectId);
            } else {
                arrayList2.add(lVar2);
            }
        }
        return arrayList2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55744b();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2738d(this);
    }

    public void onAlive() {
        super.onAlive();
        this.f158683h.alive();
        this.f158684i.alive();
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12418k(this.f158685j);
    }

    public void onDead() {
        super.onDead();
        this.f158683h.dead();
        this.f158684i.dead();
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12415h(this.f158685j);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C55743a aVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderProfileDraftLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        int i = 0;
        if (2 == iResponse.getPullType()) {
            this.f158680e = false;
        }
        super.onFetchDone(iResponse);
        if (!(2 == iResponse.getPullType() || this.f158682g == (aVar2 = C55743a.WITH_CACHED))) {
            List<C0740i2> incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                i = incrementList.size();
            }
            if (i <= 0) {
                aVar2 = C55743a.NO_CACHE;
            }
            this.f158682g = aVar2;
            String tag = getTAG();
            Log.m105924i(tag, "onFetchDone cachedState :" + this.f158682g);
        }
        if (!iResponse.getHasMore() && (aVar = this.f158681f) != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderProfileDraftLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }

    public void requestLoadMore(boolean z) {
        if (this.f158680e) {
            Log.m105924i(getTAG(), "isLoadingMore return");
            return;
        }
        this.f158680e = true;
        super.requestLoadMore(z);
    }
}
