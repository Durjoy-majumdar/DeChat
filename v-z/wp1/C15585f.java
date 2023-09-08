package wp1;

import android.text.SpannableString;
import cm1.C0723d0;
import cm1.C0729f0;
import cm1.C0732g0;
import cm1.C0739i0;
import cm1.C0740i2;
import cm1.C0763p;
import cm1.C0790x;
import cm1.C0797z;
import cm1.C55018j0;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p629ny.C76979h;
import p749xh.C66261f3;
import p823sg.C101614i;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C64475jq0;
import te3.C64850yb1;
import up1.C14358p;
import vp1.C14937o;
import vp1.C14944s;
import vp1.C65834e;
import zc1.C66785b;

/* renamed from: wp1.f */
public final class C15585f {

    /* renamed from: a */
    public static final C15586a f42211a = new C15586a((C8480h) null);

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, Boolean> f42212b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<Long, String> f42213c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<Long, String> f42214d = new ConcurrentHashMap<>();

    /* renamed from: wp1.f$a */
    public static final class C15586a {
        public C15586a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo14338a(List<? extends FinderItem> list, C49712hj1 hj12) {
            if (list != null && hj12 != null) {
                for (FinderItem finderItem : list) {
                    if (finderItem.getFeedObject().sessionBuffer != null) {
                        ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(finderItem.getFeedObject(), hj12.f134675i);
                    }
                }
                C65834e eVar = C65834e.f189316a;
                int i = hj12.f134675i;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (FinderItem feedObject : list) {
                    arrayList.add(feedObject.getFeedObject());
                }
                eVar.mo89867a(i, arrayList);
            }
        }

        /* renamed from: b */
        public final boolean mo14339b(long j) {
            C14358p Dx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0();
            C65834e.f189316a.mo89875i(j);
            Integer[] numArr = C14937o.f40974c;
            for (int i = 0; i < 13; i++) {
                C14937o.f40972a.mo13984e(j, numArr[i].intValue());
            }
            ISQLiteDatabase iSQLiteDatabase = Dx0.f39913g;
            iSQLiteDatabase.delete(C66261f3.TABLE_NAME, "id=?", new String[]{"" + j});
            C15586a aVar = C15585f.f42211a;
            Log.m105924i("Finder.FinderFeedLogic", "delete feed " + j + " success " + true);
            return true;
        }

        /* renamed from: c */
        public final boolean mo14340c(long j) {
            C14358p Dx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0();
            String[] strArr = C14358p.f39908i;
            boolean jo = Dx0.mo13664jo(j, true);
            C15586a aVar = C15585f.f42211a;
            Log.m105924i("Finder.FinderFeedLogic", "Finder.PostLog delete feed localId " + j + " success " + jo);
            return true;
        }

        /* renamed from: d */
        public final FinderItem mo14341d(long j) {
            C15586a aVar = C15585f.f42211a;
            Log.m105919d("Finder.FinderFeedLogic", "get feed local id %s", Long.valueOf(j));
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0().mo13662Lo(j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0098, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
            cy3.C58003b.m67160a(r5, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x009c, code lost:
            throw r7;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.LinkedList<com.tencent.p014mm.plugin.finder.storage.FinderItem> mo14342e(java.lang.String r5, int r6, int r7) {
            /*
                r4 = this;
                java.lang.String r0 = "username"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                up1.p r0 = r0.Dx0()
                o40.b r1 = new o40.b
                java.lang.String r2 = "getLocalSenderFeedBeforeTime"
                r1.<init>(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "SELECT * FROM FinderFeedItem   WHERE createTime >= "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " AND createTime < "
                r2.append(r6)
                r2.append(r7)
                java.lang.String r6 = " AND username IN ('', '"
                r2.append(r6)
                r2.append(r5)
                java.lang.String r5 = "') ORDER BY createTime DESC"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r0.f39913g
                r7 = 0
                r0 = 2
                android.database.Cursor r5 = r6.rawQuery(r5, r7, r0)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "getLocalSenderFeedBeforeTime1 "
                r6.append(r0)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "Finder.FinderFeedStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                boolean r2 = r5.moveToFirst()     // Catch:{ all -> 0x0096 }
                if (r2 == 0) goto L_0x007c
            L_0x0068:
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = new com.tencent.mm.plugin.finder.storage.FinderItem     // Catch:{ all -> 0x0096 }
                r2.<init>()     // Catch:{ all -> 0x0096 }
                r2.convertFrom(r5)     // Catch:{ all -> 0x0096 }
                r2.getFeedObject()     // Catch:{ all -> 0x0096 }
                r6.add(r2)     // Catch:{ all -> 0x0096 }
                boolean r2 = r5.moveToNext()     // Catch:{ all -> 0x0096 }
                if (r2 != 0) goto L_0x0068
            L_0x007c:
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0096 }
                cy3.C58003b.m67160a(r5, r7)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "getLocalSenderFeedBeforeTime2 "
                r5.append(r7)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                return r6
            L_0x0096:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x0098 }
            L_0x0098:
                r7 = move-exception
                cy3.C58003b.m67160a(r5, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wp1.C15585f.C15586a.mo14342e(java.lang.String, int, int):java.util.LinkedList");
        }

        /* renamed from: f */
        public final List<FinderItem> mo14343f(List<? extends FinderObject> list, int i, C49712hj1 hj12) {
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            LinkedList<C64850yb1> linkedList2;
            List<? extends FinderObject> list2 = list;
            int i2 = i;
            C49712hj1 hj13 = hj12;
            C87412m.m108594g(list2, "feedList");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
            int i3 = 0;
            for (FinderObject finderObject : list) {
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, i2);
                a.setCommentScene(hj13 != null ? hj13.f134675i : 0);
                C101614i<String, SpannableString> iVar = C0763p.f1802a;
                for (FinderCommentInfo finderCommentInfo : a.getCommentList()) {
                    C101614i<String, SpannableString> iVar2 = C0763p.f1802a;
                    if (!iVar2.check(finderCommentInfo.content)) {
                        iVar2.put(finderCommentInfo.content, ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), finderCommentInfo.content));
                    }
                }
                C65834e eVar = C65834e.f189316a;
                C65834e.C65836b bVar = C65834e.C65836b.f189322b;
                if (eVar.mo89878l(a, C65834e.C65836b.f189329i)) {
                    i3++;
                }
                FinderContact finderContact = a.getFeedObject().contact;
                if (finderContact != null) {
                    C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
                }
                C15586a aVar = C15585f.f42211a;
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                String str = "";
                if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                    LinkedList<C64850yb1> linkedList3 = finderMedia.spec;
                    C87412m.m108593f(linkedList3, "it.spec");
                    for (C64850yb1 yb12 : linkedList3) {
                        str = str + yb12.f186466d + XVFSFile.PATH_SEPARATOR_CHAR + yb12.f186468f + '-';
                    }
                    C64475jq0 jq02 = finderMedia.hdr_spec;
                    if (!(jq02 == null || (linkedList2 = jq02.f183817d) == null)) {
                        for (C64850yb1 yb13 : linkedList2) {
                            str = str + yb13.f186466d + XVFSFile.PATH_SEPARATOR_CHAR + yb13.f186468f + '-';
                        }
                    }
                }
                C15586a aVar2 = C15585f.f42211a;
                C15585f.f42213c.put(Long.valueOf(finderObject.f164794id), str);
                Log.m105924i("Finder.FinderFeedLogic", "insert item index id:" + finderObject.nickname + " obj=" + C61926c.m72691p(finderObject.f164794id) + " mediaType:" + a.getMediaType() + " sourceType:" + i2 + " specString:" + str);
                arrayList2.add(a);
            }
            arrayList.addAll(arrayList2);
            mo14338a(arrayList, hj13);
            C15586a aVar3 = C15585f.f42211a;
            Log.m105924i("Finder.FinderFeedLogic", "[insertFeedList] insert count=" + list.size() + " successfulCount=" + i3 + " sourceType=" + i2);
            return arrayList;
        }

        /* renamed from: g */
        public final boolean mo14344g(long j) {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0().mo13662Lo(j) != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a5, code lost:
            if (r3.update(p749xh.C66261f3.TABLE_NAME, r2, "id=?", new java.lang.String[]{"" + r0}) > 0) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0048, code lost:
            if (r1.update(p749xh.C66261f3.TABLE_NAME, r0, "localId=?", new java.lang.String[]{"" + r2}) > 0) goto L_0x004a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00b0  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo14345h(com.tencent.p014mm.plugin.finder.storage.FinderItem r12) {
            /*
                r11 = this;
                java.lang.String r0 = "feedObject"
                gy3.C87412m.m108594g(r12, r0)
                long r0 = r12.field_id
                long r2 = r12.getLocalId()
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
                up1.p r4 = r4.Dx0()
                boolean r5 = r11.mo14344g(r2)
                java.lang.String r6 = "FinderFeedItem"
                java.lang.String r7 = ""
                java.lang.String r8 = "rowid"
                r9 = 1
                r10 = 0
                if (r5 == 0) goto L_0x004c
                android.content.ContentValues r0 = r12.convertTo()
                r0.remove(r8)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r4.f39913g
                java.lang.String[] r4 = new java.lang.String[r9]
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                r4[r10] = r2
                java.lang.String r2 = "localId=?"
                int r0 = r1.update(r6, r0, r2, r4)
                if (r0 <= 0) goto L_0x00a8
            L_0x004a:
                r0 = 1
                goto L_0x00a9
            L_0x004c:
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x00a8
                if (r5 != 0) goto L_0x0083
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "update svrId "
                r2.append(r3)
                r2.append(r0)
                r3 = 32
                r2.append(r3)
                java.lang.String r5 = r12.info()
                r2.append(r5)
                r2.append(r3)
                com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r3 = new java.lang.Object[r10]
                java.lang.String r5 = "Finder.FinderFeedStorage"
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r2, r3)
            L_0x0083:
                android.content.ContentValues r2 = r12.convertTo()
                r2.remove(r8)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r4.f39913g
                java.lang.String[] r4 = new java.lang.String[r9]
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                r4[r10] = r0
                java.lang.String r0 = "id=?"
                int r0 = r3.update(r6, r2, r0, r4)
                if (r0 <= 0) goto L_0x00a8
                goto L_0x004a
            L_0x00a8:
                r0 = 0
            L_0x00a9:
                if (r0 == 0) goto L_0x00b0
                long r1 = r12.getLocalId()
                goto L_0x00b2
            L_0x00b0:
                r1 = -1
            L_0x00b2:
                wp1.f$a r12 = wp1.C15585f.f42211a
                r12 = 2
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                r12[r10] = r3
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r12[r9] = r1
                java.lang.String r1 = "Finder.FinderFeedLogic"
                java.lang.String r2 = "replace feedSucc %s, rowId %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wp1.C15585f.C15586a.mo14345h(com.tencent.mm.plugin.finder.storage.FinderItem):boolean");
        }

        /* renamed from: i */
        public final void mo14346i(List<? extends C0740i2> list, int i, String str, boolean z) {
            C87412m.m108594g(list, "list");
            C87412m.m108594g(str, "username");
            if (z) {
                int L1 = C58784w3.f168295a.mo83884L1(i);
                if ((str.length() > 0) && !C87412m.m108589b(str, C66785b.f191882e.mo90662O5()) && L1 == 1) {
                    L1 = 3;
                }
                LinkedList linkedList = new LinkedList();
                for (C0740i2 i2Var : list) {
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                        linkedList.add(new C14944s(0, feedObject.f164794id, feedObject, i, baseFinderFeed.mo3481O()));
                    }
                }
                C14937o.f40972a.mo13980a(L1, str, linkedList);
            }
        }

        /* renamed from: j */
        public final void mo14347j(FinderItem finderItem) {
            C87412m.m108594g(finderItem, "finderObj");
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(finderItem.getClipListExt());
            finderItem.setClipListExt(linkedList);
            mo14345h(finderItem);
        }

        /* renamed from: k */
        public final BaseFinderFeed mo14348k(FinderItem finderItem) {
            C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
            int mediaType = finderItem.getMediaType();
            BaseFinderFeed g0Var = mediaType != 1 ? mediaType != 2 ? mediaType != 4 ? mediaType != 15 ? mediaType != 7 ? mediaType != 8 ? mediaType != 9 ? new C0732g0(finderItem) : new C0797z(finderItem) : new C0723d0(finderItem) : new C0739i0(finderItem) : new C0729f0(finderItem) : new C55018j0(finderItem) : new C0790x(finderItem) : new C0732g0(finderItem);
            FinderContact finderContact = finderItem.getFeedObject().contact;
            C58969q qVar = null;
            if (finderContact != null) {
                qVar = C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null);
            }
            g0Var.mo3483Q(qVar);
            return g0Var;
        }
    }
}
