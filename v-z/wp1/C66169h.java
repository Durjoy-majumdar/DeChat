package wp1;

import android.database.Cursor;
import cm1.C55011a;
import cm1.C55016h1;
import cm1.C55017i1;
import cm1.C55020j1;
import cm1.C55021k1;
import cm1.C55022l1;
import cm1.C55023m1;
import cm1.C55024n1;
import cm1.C55025o1;
import cm1.C55026p1;
import cm1.C55028r1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import cy3.C58003b;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import p749xh.C66274t3;
import p749xh.C66276va;
import te3.C49262ec1;
import te3.C50986qn2;
import te3.C64257bc1;
import te3.C64312dc1;
import zc1.C66785b;

/* renamed from: wp1.h */
public final class C66169h {

    /* renamed from: a */
    public static final C66170a f190180a = new C66170a((C8480h) null);

    /* renamed from: wp1.h$a */
    public static final class C66170a {
        public C66170a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo90242a(C66276va vaVar, int i) {
            String str;
            C87412m.m108594g(vaVar, "mention");
            MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(mo90247f(i));
            if (mo90247f(i) == 1) {
                int i2 = C66274t3.f190671z1;
                str = "WxIdentityMsg";
            } else {
                int i3 = C66274t3.f190671z1;
                str = "FinderIdentityMsg";
            }
            String str2 = "DELETE FROM " + str + " WHERE id=" + vaVar.field_id;
            boolean execSQL = Ix0.execSQL(str, str2);
            Log.m105924i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", flag:" + vaVar.field_extFlag + " succ:" + execSQL);
            return execSQL;
        }

        /* renamed from: b */
        public final List<C66276va> mo90243b(long j, int i, int[] iArr, int i2, String str) {
            String str2;
            LinkedList linkedList;
            Throwable th;
            long j2 = j;
            int i3 = i;
            int[] iArr2 = iArr;
            int i4 = i2;
            String str3 = str;
            C87412m.m108594g(iArr2, "types");
            C87412m.m108594g(str3, "finderUsername");
            MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(mo90247f(i4));
            int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
            if (iArr2.length == 0) {
                str2 = mo90245d(i4) + " WHERE " + mo90246e(i4, str3) + "id < " + j2 + "  AND flag = 0  AND userVersion = " + j3 + " ORDER BY createTime DESC,id DESC LIMIT " + i3;
            } else {
                int length = iArr2.length;
                String str4 = "(";
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = iArr2[i5];
                    int i8 = i6 + 1;
                    if (i6 > 0) {
                        str4 = str4 + ',';
                    }
                    str4 = str4 + i7;
                    i5++;
                    i6 = i8;
                }
                str2 = mo90245d(i4) + " WHERE " + mo90246e(i4, str3) + " id < " + j2 + "  AND flag = 0  AND type IN " + (str4 + ')') + " AND userVersion = " + j3 + " ORDER BY createTime DESC,id DESC LIMIT " + i3;
            }
            Log.m105924i("Finder.FinderMentionLogic", "get mention sql " + str2);
            Cursor rawQuery = Ix0.rawQuery(str2, new String[0]);
            if (rawQuery != null) {
                try {
                    linkedList = new LinkedList();
                    while (rawQuery.moveToNext()) {
                        try {
                            IAutoDBItem newInstance = C66276va.class.newInstance();
                            newInstance.convertFrom(rawQuery);
                            linkedList.add(newInstance);
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            C58003b.m67160a(rawQuery, th);
                            throw th5;
                        }
                    }
                    C58003b.m67160a(rawQuery, (Throwable) null);
                } finally {
                    th = th;
                    try {
                    } catch (Throwable th6) {
                        Throwable th7 = th6;
                        C58003b.m67160a(rawQuery, th);
                        throw th7;
                    }
                }
            } else {
                linkedList = new LinkedList();
            }
            C58003b.m67160a(rawQuery, (Throwable) null);
            return linkedList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
            cy3.C58003b.m67160a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
            throw r6;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p749xh.C66276va mo90244c(long r4, int r6, int r7) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getMention by id "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " mentionCreateTime "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderMentionLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                int r2 = r3.mo90247f(r7)
                com.tencent.mm.sdk.storage.MAutoStorage r0 = r0.Ix0(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r3.mo90245d(r7)
                r2.append(r7)
                java.lang.String r7 = " WHERE id = "
                r2.append(r7)
                r2.append(r4)
                java.lang.String r4 = " AND createTime = "
                r2.append(r4)
                r2.append(r6)
                java.lang.String r4 = r2.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "get mention sql "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                r5 = 0
                java.lang.String[] r5 = new java.lang.String[r5]
                android.database.Cursor r4 = r0.rawQuery(r4, r5)
                r5 = 0
                if (r4 == 0) goto L_0x008b
                boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x0084 }
                if (r6 == 0) goto L_0x007e
                xh.va r6 = new xh.va     // Catch:{ all -> 0x0084 }
                r6.<init>()     // Catch:{ all -> 0x0084 }
                r6.convertFrom(r4)     // Catch:{ all -> 0x0084 }
                cy3.C58003b.m67160a(r4, r5)
                return r6
            L_0x007e:
                rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0084 }
                cy3.C58003b.m67160a(r4, r5)
                goto L_0x008b
            L_0x0084:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0086 }
            L_0x0086:
                r6 = move-exception
                cy3.C58003b.m67160a(r4, r5)
                throw r6
            L_0x008b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: wp1.C66169h.C66170a.mo90244c(long, int, int):xh.va");
        }

        /* renamed from: d */
        public final String mo90245d(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT rowid, * FROM ");
            if (mo90247f(i) == 1) {
                int i2 = C66274t3.f190671z1;
                str = "WxIdentityMsg";
            } else {
                int i3 = C66274t3.f190671z1;
                str = "FinderIdentityMsg";
            }
            sb.append(str);
            return sb.toString();
        }

        /* renamed from: e */
        public final String mo90246e(int i, String str) {
            if (i != 1) {
                return " ";
            }
            if (!C87412m.m108589b(str, C66785b.f191882e.mo90658I1()) && !Util.isNullOrNil(str)) {
                return " finderUserName='" + str + "' AND ";
            } else if (Util.isNullOrNil(str)) {
                return " ";
            } else {
                return " (finderUserName='" + str + "' OR finderUserName IS NULL OR finderUserName='') AND ";
            }
        }

        /* renamed from: f */
        public final int mo90247f(int i) {
            if (i != 1) {
                return i != 2 ? 0 : 1;
            }
            return 2;
        }

        /* renamed from: g */
        public final int mo90248g(List<C66276va> list, int i) {
            C87412m.m108594g(list, "mentionList");
            int i2 = 0;
            for (C66276va vaVar : list) {
                C66170a aVar = C66169h.f190180a;
                C87412m.m108594g(vaVar, "mention");
                MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(aVar.mo90247f(i));
                C66276va c = aVar.mo90244c(vaVar.field_id, vaVar.field_createTime, i);
                if (c != null) {
                    Ix0.delete(c.systemRowid);
                }
                boolean insert = Ix0.insert(vaVar);
                StringBuilder sb = new StringBuilder();
                sb.append("replace mention success ");
                sb.append(vaVar.field_id);
                sb.append(", ");
                sb.append(c == null ? "null" : Long.valueOf(c.systemRowid));
                sb.append(", ");
                sb.append(insert);
                Log.m105924i("Finder.FinderMentionLogic", sb.toString());
                if (insert) {
                    i2++;
                }
            }
            Log.m105924i("Finder.FinderMentionLogic", "insert mention " + i2);
            return i2;
        }

        /* renamed from: h */
        public final void mo90249h(String str, int i) {
            String str2;
            C87412m.m108594g(str, "clientMsgId");
            MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(mo90247f(i));
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
            if (mo90247f(i) == 1) {
                int i2 = C66274t3.f190671z1;
                str2 = "WxIdentityMsg";
            } else {
                int i3 = C66274t3.f190671z1;
                str2 = "FinderIdentityMsg";
            }
            String str3 = "DELETE FROM " + str2 + "  WHERE type=10  AND clientMsgId='" + str + "'  AND userVersion=" + j + ' ';
            String str4 = "SELECT * FROM " + str2 + "  WHERE type=10  AND clientMsgId='" + str + "'  AND userVersion=" + j + ' ';
            if (BuildInfo.IS_FLAVOR_PURPLE) {
                Cursor rawQuery = Ix0.rawQuery(str4, new String[0]);
                boolean execSQL = Ix0.execSQL(str2, str3);
                Cursor rawQuery2 = Ix0.rawQuery(str4, new String[0]);
                Log.m105924i("Finder.FinderMentionLogic", "removePrivateMention, before:" + rawQuery.getCount() + ", after:" + rawQuery2.getCount() + ", querySql:" + str4);
                StringBuilder sb = new StringBuilder();
                sb.append("removePrivateMention, succ ");
                sb.append(execSQL);
                sb.append(",  sql ");
                sb.append(str3);
                Log.m105924i("Finder.FinderMentionLogic", sb.toString());
                return;
            }
            Log.m105924i("Finder.FinderMentionLogic", "removePrivateMention, succ " + Ix0.execSQL(str2, str3) + ",  sql " + str3);
        }

        /* renamed from: i */
        public final C55011a mo90250i(C66276va vaVar) {
            C55011a aVar;
            C87412m.m108594g(vaVar, "mention");
            int i = vaVar.field_type;
            if (i == 1) {
                aVar = new C55020j1(vaVar);
            } else if (i == 2) {
                aVar = new C55025o1(vaVar);
            } else if (i == 3) {
                aVar = new C55016h1(vaVar);
            } else if (i == 4) {
                aVar = new C55028r1(vaVar);
            } else if (i == 5) {
                aVar = new C55026p1(vaVar);
            } else if (i == 7) {
                aVar = new C55024n1(vaVar);
            } else if (i == 8) {
                aVar = new C55023m1(vaVar);
            } else if (i == 10) {
                aVar = new C55021k1(vaVar);
            } else if (i == 11) {
                aVar = new C55022l1(vaVar);
            } else if (i != 15) {
                return null;
            } else {
                aVar = new C55017i1(vaVar);
            }
            return aVar;
        }

        /* renamed from: j */
        public final C66276va mo90251j(int i, C64257bc1 bc12, String str) {
            C87412m.m108594g(bc12, "mention");
            C87412m.m108594g(str, "finderUsername");
            C66276va vaVar = new C66276va();
            vaVar.field_headUrl = bc12.f182260d;
            if (bc12.f182247D != 0) {
                C64312dc1 dc12 = new C64312dc1();
                dc12.f182697e = bc12.f182247D;
                dc12.f182696d = bc12.f182246C;
                vaVar.field_aggregatedContacts = dc12;
            } else {
                vaVar.field_aggregatedContacts = new C64312dc1();
            }
            if (i != 1) {
                str = "";
            }
            vaVar.field_finderUserName = str;
            vaVar.field_nickname = bc12.f182261e;
            vaVar.field_type = bc12.f182262f;
            vaVar.field_content = bc12.f182263g;
            vaVar.field_createTime = bc12.f182264h;
            vaVar.field_thumbUrl = bc12.f182265i;
            vaVar.field_id = bc12.f182266j;
            vaVar.field_objectId = bc12.f182267n;
            vaVar.field_objectNonceId = bc12.f182277x;
            vaVar.field_commentId = bc12.f182268o;
            vaVar.field_flag = bc12.f182269p;
            vaVar.field_refContent = bc12.f182271r;
            vaVar.field_extFlag = bc12.f182270q;
            vaVar.field_notify = bc12.f182272s;
            vaVar.field_mediaType = bc12.f182273t;
            vaVar.field_description = bc12.f182274u;
            vaVar.field_replayUsername = bc12.f182276w;
            vaVar.field_replayNickname = bc12.f182275v;
            vaVar.field_username = bc12.f182278y;
            C49262ec1 ec12 = bc12.f182279z;
            FinderContact finderContact = null;
            vaVar.field_contact = ec12 != null ? ec12.f132859d : null;
            C49262ec1 ec13 = bc12.f182244A;
            if (ec13 != null) {
                finderContact = ec13.f132859d;
            }
            vaVar.field_replyContact = finderContact;
            int i2 = 0;
            vaVar.field_userVersion = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC, 0);
            vaVar.field_followExpireTime = (long) bc12.f182248E;
            vaVar.field_clientMsgId = bc12.f182249F;
            vaVar.field_followId = bc12.f182250G;
            vaVar.field_objectType = (long) bc12.f182251H;
            vaVar.field_refVideoObjectId = bc12.f182252I;
            vaVar.field_refVideoObjectNonceId = bc12.f182253J;
            C50986qn2 qn22 = bc12.f182254K;
            long j = 0;
            vaVar.field_likeId = qn22 != null ? qn22.f140412e : 0;
            C49262ec1 ec14 = bc12.f182279z;
            if (ec14 != null) {
                j = ec14.f132861f;
            }
            vaVar.field_fansId = j;
            vaVar.field_authorContact = bc12.f182255L;
            vaVar.field_likeType = qn22 != null ? qn22.f140411d : 0;
            vaVar.field_commentMentionedUser = bc12.f182256M;
            if (ec14 != null) {
                i2 = ec14.f132862g;
            }
            vaVar.field_relationType = i2;
            vaVar.field_extInfo = bc12.f182257N;
            vaVar.field_svrMentionId = bc12.f182258P;
            vaVar.field_followFlag = bc12.f182259Q;
            return vaVar;
        }

        /* renamed from: k */
        public final boolean mo90252k(C66276va vaVar, int i) {
            String str;
            C87412m.m108594g(vaVar, "mention");
            MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(mo90247f(i));
            if (mo90247f(i) == 1) {
                int i2 = C66274t3.f190671z1;
                str = "WxIdentityMsg";
            } else {
                int i3 = C66274t3.f190671z1;
                str = "FinderIdentityMsg";
            }
            String str2 = "UPDATE " + str + " SET extFlag=" + vaVar.field_extFlag + " WHERE id=" + vaVar.field_id;
            boolean execSQL = Ix0.execSQL(str, str2);
            Log.m105924i("Finder.FinderMentionLogic", "updateMentionExtFlag sql:" + str2 + ", flag:" + vaVar.field_extFlag);
            return execSQL;
        }
    }
}
