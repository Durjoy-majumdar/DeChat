package cw2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import dw2.C45456e;
import dw2.C45466i;
import dw2.C45467j;
import dw2.C45468k;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import kw2.C99266g;
import kw2.C99268i;
import kw2.C99269j;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C51018qv3;
import te3.bc4;
import te3.hc4;
import te3.pc4;
import te3.sb4;
import z04.C119027c;

/* renamed from: cw2.p */
public final class C97393p {

    /* renamed from: a */
    public static final C97394a f285894a = new C97394a((C8480h) null);

    /* renamed from: cw2.p$a */
    public static final class C97394a {
        public C97394a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo136657a(int i) {
            LinkedList<bc4> linkedList;
            bc4 bc4;
            LinkedList<bc4> linkedList2;
            bc4 bc42;
            LinkedList<bc4> linkedList3;
            bc4 bc43;
            int i2 = i;
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Yt = hVar.mo134191i().mo138667Yt(i2);
            String str = null;
            Integer valueOf = Yt != null ? Integer.valueOf(Yt.field_createTime) : null;
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date((valueOf != null ? (long) valueOf.intValue() : 0) * 1000));
            C87412m.m108593f(format, "simpleDateFormat.format(date)");
            hVar.mo134191i().f291093h.delete("MMStoryInfo", C99268i.f291074N + "=?", new String[]{"" + i2});
            C99268i c = C97393p.f285894a.mo136659c(hVar.mo134187e());
            pc4 p2 = c.mo138657p2();
            sb4 sb4 = p2.f299136h;
            String str2 = (sb4 == null || (linkedList3 = sb4.f299398e) == null || (bc43 = (bc4) C110818d0.m150917O(linkedList3, 0)) == null) ? null : bc43.f297963h;
            sb4 sb42 = p2.f299136h;
            String str3 = (sb42 == null || (linkedList2 = sb42.f299398e) == null || (bc42 = (bc4) C110818d0.m150917O(linkedList2, 0)) == null) ? null : bc42.f297961f;
            sb4 sb43 = p2.f299136h;
            String str4 = "";
            C97390n.f285891a.mo136647a(hVar.mo134187e(), c.field_storyID, c.field_createTime, str2, str3, (long) (((sb43 == null || (linkedList = sb43.f299398e) == null || (bc4 = (bc4) C110818d0.m150917O(linkedList, 0)) == null) ? 0.0f : bc4.f297978z) * ((float) 1000)));
            C99266g jo = hVar.mo134190h().mo138652jo(format);
            if (jo != null) {
                int i3 = jo.field_count - 1;
                jo.field_count = i3;
                if (i3 <= 0) {
                    hVar.mo134190h().f291072d.delete("MMStoryHistoryItem", "date=?", new String[]{str4 + format});
                    return;
                }
                if (Yt != null) {
                    str = Yt.field_userName;
                }
                if (str != null) {
                    ArrayList arrayList = (ArrayList) hVar.mo134191i().mo138666TE(str, (int) (new SimpleDateFormat("yyyy-MM-dd").parse(format).getTime() / 1000));
                    if (!arrayList.isEmpty()) {
                        C99268i iVar = (C99268i) arrayList.get(0);
                        iVar.field_sourceType = 16 | iVar.field_sourceType;
                        hVar.mo134191i().mo138673mL((int) ((C99268i) arrayList.get(0)).systemRowid, (C99268i) arrayList.get(0));
                        Log.m105918d("MicroMsg.StoryInfoStorageLogic", "update " + ((int) ((C99268i) arrayList.get(0)).systemRowid) + "'s sourceType to " + ((C99268i) arrayList.get(0)).field_sourceType + ' ');
                    }
                }
                hVar.mo134190h().mo138651Lo(jo);
            }
        }

        /* renamed from: b */
        public final void mo136658b(long j, int i) {
            Log.m105918d("MicroMsg.StoryInfoStorageLogic", "delete story item: " + i + ' ' + j);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(new C45467j(j, 1));
            arrayList2.add(Integer.valueOf(i));
            C86709a0.m107529k().f251779b.mo123460f(new C45456e(arrayList, arrayList2));
        }

        /* renamed from: c */
        public final C99268i mo136659c(String str) {
            String str2;
            C87412m.m108594g(str, "username");
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99269j i = hVar.mo134191i();
            boolean isEqual = Util.isEqual(hVar.mo134187e(), str);
            C99268i iVar = new C99268i();
            StringBuilder sb = new StringBuilder();
            sb.append("select *,rowid from MMStoryInfo " + i.mo138670jo(str, isEqual));
            if (isEqual) {
                str2 = C99269j.f291080n;
            } else {
                str2 = " AND " + C99269j.f291081o + C99269j.f291080n;
            }
            sb.append(str2);
            Cursor rawQuery = i.f291093h.rawQuery(sb.toString() + " limit 1", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                iVar.convertFrom(rawQuery);
            }
            rawQuery.close();
            return iVar;
        }

        /* renamed from: d */
        public final long mo136660d(C99268i iVar, hc4 hc4, int i) {
            C89349b bVar;
            C87412m.m108594g(iVar, "storyInfo");
            C87412m.m108594g(hc4, "storyObj");
            C51018qv3 qv32 = hc4.f298339i;
            if (qv32 == null || (bVar = qv32.f140574f) == null) {
                Log.m105924i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
                return hc4.f298334d;
            }
            String str = new String(bVar.mo123703f(), C119027c.f356488a);
            pc4 a = C97396r.f285895a.mo136666a(str);
            if (Util.isNullOrNil(str) || a == null) {
                return hc4.f298334d;
            }
            if (!iVar.mo138660s2(a)) {
                return hc4.f298334d;
            }
            Log.m105918d("MicroMsg.StoryInfoStorageLogic", "from server xml ok " + hc4.f298334d + " \n " + str);
            hc4.f298339i.mo73350k(new byte[0]);
            iVar.field_userName = hc4.f298335e;
            iVar.field_createTime = hc4.f298337g;
            iVar.field_storyID = hc4.f298334d;
            iVar.field_attrBuf = hc4.toByteArray();
            if (hc4.f298345r == 1) {
                iVar.mo138653l2(4);
            } else {
                iVar.mo138659r2(4);
            }
            if (hc4.f298346s == 1) {
                iVar.mo138653l2(8);
            } else {
                iVar.mo138659r2(8);
            }
            iVar.field_favoriteTime = hc4.f298347t;
            iVar.field_sourceType = i | iVar.field_sourceType;
            pc4 p2 = iVar.mo138657p2();
            p2.f299133e = hc4.f298335e;
            iVar.mo138662u2(p2);
            Log.m105918d("MicroMsg.StoryInfoStorageLogic", "will replaceUserByPcId " + hc4.f298334d);
            StoryCore.f281736t.mo134191i().update(hc4.f298334d, iVar);
            return hc4.f298334d;
        }

        /* renamed from: e */
        public final void mo136661e(int i, int i2) {
            Log.m105918d("MicroMsg.StoryInfoStorageLogic", "setStoryFavLocal story item: " + i + " to " + i2);
            C99269j i3 = StoryCore.f281736t.mo134191i();
            C99268i Yt = i3.mo138667Yt(i);
            if (Yt != null) {
                if (i2 == 1) {
                    Yt.mo138653l2(8);
                    Yt.field_favoriteTime = C31543z5.m39455e();
                } else {
                    Yt.mo138659r2(8);
                    Yt.field_favoriteTime = 0;
                }
                i3.replace(Yt);
            }
        }

        /* renamed from: f */
        public final void mo136662f(List<Long> list, List<Integer> list2, boolean z) {
            C87412m.m108594g(list, "idList");
            C87412m.m108594g(list2, "localIdList");
            Log.m105924i("MicroMsg.StoryInfoStorageLogic", "setStoryFavRemote story count: " + list.size() + " to " + z);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            ArrayList arrayList2 = new ArrayList();
            for (Number longValue : list) {
                long longValue2 = longValue.longValue();
                Log.m105918d("MicroMsg.StoryInfoStorageLogic", "setStoryFavRemote story: " + longValue2 + " to " + z);
                arrayList2.add(new C45466i(longValue2, 5, z ? 1 : 0));
            }
            C86709a0.m107529k().f251779b.mo123460f(new C45456e(arrayList2, arrayList));
        }

        /* renamed from: g */
        public final void mo136663g(long j, int i, boolean z, boolean z2) {
            Log.m105918d("MicroMsg.StoryInfoStorageLogic", "setPrivacyRemote story item: " + j + " to " + z);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(new C45468k(j, 4, z ? 1 : 0, z2));
            C86709a0.m107529k().f251779b.mo123460f(new C45456e(arrayList, arrayList2));
        }

        /* renamed from: h */
        public final C99268i mo136664h(String str, long j, int i, hc4 hc4, boolean z) {
            C87412m.m108594g(str, "username");
            if (z) {
                C99269j i2 = StoryCore.f281736t.mo134191i();
                ISQLiteDatabase iSQLiteDatabase = i2.f291093h;
                iSQLiteDatabase.delete("MMStoryInfo", "storyID=?", new String[]{"" + j});
                C99268i iVar = new C99268i();
                iVar.field_userName = str;
                iVar.field_storyID = j;
                i2.doNotify("notify_story_info_delete", 1, iVar);
                return null;
            }
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i qq = hVar.mo134191i().mo138674qq(j);
            if (qq == null) {
                qq = new C99268i();
            }
            qq.field_storyID = j;
            qq.field_createTime = i;
            qq.field_userName = str;
            int i3 = (Util.isEqual(str, hVar.mo134187e()) ? 4 : 8) | qq.field_sourceType;
            qq.field_sourceType = i3;
            if (hc4 != null) {
                mo136660d(qq, hc4, i3);
            } else {
                hVar.mo134191i().mo138669bF(qq);
            }
            return qq;
        }

        /* renamed from: i */
        public final void mo136665i(long j, int i) {
            C99269j i2 = StoryCore.f281736t.mo134191i();
            String str = "UPDATE " + "MMStoryInfo" + " SET localFlag = " + i + " Where storyID = '" + j + '\'';
            Log.m105918d("MicroMsg.StoryInfoStorage", "updateSourceTypeBefore sql " + str);
            i2.f291093h.execSQL("MMStoryInfo", str);
        }
    }
}
