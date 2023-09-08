package iw2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw2.C97387k;
import eb0.C31543z5;
import gw2.C98266k;
import gw2.C98267l;
import gy3.C8480h;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kw2.C99264e;
import kw2.C99268i;
import kw2.C99269j;
import o40.C61925b;
import te3.C101765cp3;
import te3.bc4;
import te3.pc4;
import te3.sb4;

/* renamed from: iw2.q */
public abstract class C98862q {

    /* renamed from: d */
    public static final C98863a f289801d = new C98863a((C8480h) null);

    /* renamed from: iw2.q$a */
    public static final class C98863a {
        public C98863a(C8480h hVar) {
        }

        /* renamed from: a */
        public final ArrayList<C98266k> mo138220a(String str, boolean z) {
            List<C99268i> list;
            C87412m.m108594g(str, "username");
            ArrayList<C98266k> arrayList = new ArrayList<>();
            if (z) {
                StoryCore.C96337h hVar = StoryCore.f281736t;
                C99269j i = hVar.mo134191i();
                boolean isEqual = Util.isEqual(hVar.mo134187e(), str);
                int e = C31543z5.m39455e();
                C97387k.f285887a.mo136646a();
                list = i.mo138665SE(str, isEqual, e - 86400);
            } else {
                StoryCore.C96337h hVar2 = StoryCore.f281736t;
                C99269j i2 = hVar2.mo134191i();
                boolean isEqual2 = Util.isEqual(hVar2.mo134187e(), str);
                int e2 = C31543z5.m39455e();
                C97387k.f285887a.mo136646a();
                list = i2.mo138668bD(str, isEqual2, e2 - 86400, true);
            }
            for (C99268i next : list) {
                pc4 p2 = next.mo138657p2();
                sb4 sb4 = p2.f299136h;
                if (!(sb4 == null || sb4.f299398e.size() == 0)) {
                    arrayList.add(new C98266k(next, next.mo138657p2(), C98267l.NORMAL));
                    Log.m105924i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + str + ' ' + arrayList.size() + " content " + p2.f299136h.f299398e.get(0).f297963h + " and " + p2.f299136h.f299398e.get(0).f297961f + " id:" + next.field_storyID + " storyUsername: " + next.field_userName + " tryCount:" + next.mo138655n2().f131656e + " flag:" + next.field_localFlag);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final ArrayList<C98266k> mo138221b(String str, String str2) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_DATE);
            ArrayList<C98266k> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) StoryCore.f281736t.mo134191i().mo138666TE(str, (int) (new SimpleDateFormat("yyyy-MM-dd").parse(str2).getTime() / 1000))).iterator();
            while (it.hasNext()) {
                C99268i iVar = (C99268i) it.next();
                pc4 p2 = iVar.mo138657p2();
                sb4 sb4 = p2.f299136h;
                if (!(sb4 == null || sb4.f299398e.size() == 0)) {
                    arrayList.add(new C98266k(iVar, iVar.mo138657p2(), C98267l.NORMAL));
                    Log.m105924i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByDate story username " + str + ' ' + arrayList.size() + " content " + p2.f299136h.f299398e.get(0).f297963h + " and " + p2.f299136h.f299398e.get(0).f297961f + " id:" + iVar.field_storyID + " storyUsername: " + iVar.field_userName);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public final ArrayList<C98266k> mo138222c(String str, boolean z, ArrayList<Long> arrayList) {
            String str2;
            C87412m.m108594g(str, "username");
            C61925b bVar = new C61925b("getGalleryItemsFromDbByStoryId");
            ArrayList<C98266k> arrayList2 = new ArrayList<>();
            C99269j i = StoryCore.f281736t.mo134191i();
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("select *,rowid from MMStoryInfo " + i.mo138670jo(str, z));
            if (z) {
                str2 = C99269j.f291080n;
            } else {
                str2 = " AND " + C99269j.f291081o + C99269j.f291080n;
            }
            sb.append(str2);
            Cursor rawQuery = i.f291093h.rawQuery(sb.toString(), (String[]) null, 2);
            while (rawQuery.moveToNext()) {
                C99268i iVar = new C99268i();
                iVar.convertFrom(rawQuery);
                arrayList3.add(iVar);
            }
            rawQuery.close();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (arrayList != null ? arrayList.contains(Long.valueOf(((C99268i) next).field_storyID)) : true) {
                    arrayList4.add(next);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C99268i iVar2 = (C99268i) it4.next();
                pc4 p2 = iVar2.mo138657p2();
                sb4 sb4 = p2.f299136h;
                if (!(sb4 == null || sb4.f299398e.size() == 0)) {
                    arrayList2.add(new C98266k(iVar2, iVar2.mo138657p2(), C98267l.UNREAD_FIRST));
                    Log.m105924i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByStoryId story:" + iVar2 + ", content:" + p2.f299136h.f299398e.get(0).f297963h + " and " + p2.f299136h.f299398e.get(0).f297961f + ", id:" + iVar2.field_storyID + ", storyUsername:" + iVar2.field_userName);
                }
            }
            bVar.mo86838a();
            return arrayList2;
        }

        /* renamed from: d */
        public final ArrayList<C98266k> mo138223d(String str, boolean z, int i) {
            List<C99268i> list;
            C87412m.m108594g(str, "username");
            ArrayList<C98266k> arrayList = new ArrayList<>();
            if (z) {
                StoryCore.C96337h hVar = StoryCore.f281736t;
                list = hVar.mo134191i().mo138665SE(str, Util.isEqual(hVar.mo134187e(), str), i);
            } else {
                StoryCore.C96337h hVar2 = StoryCore.f281736t;
                list = hVar2.mo134191i().mo138668bD(str, Util.isEqual(hVar2.mo134187e(), str), i, true);
            }
            for (C99268i next : list) {
                pc4 p2 = next.mo138657p2();
                sb4 sb4 = p2.f299136h;
                if (!(sb4 == null || sb4.f299398e.size() == 0)) {
                    arrayList.add(new C98266k(next, next.mo138657p2(), C98267l.NORMAL));
                    Log.m105924i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + str + ' ' + arrayList.size() + " content " + p2.f299136h.f299398e.get(0).f297963h + " and " + p2.f299136h.f299398e.get(0).f297961f + " id:" + next.field_storyID + " storyUsername: " + next.field_userName + " tryCount:" + next.mo138655n2().f131656e + " flag:" + next.field_localFlag);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public final C98266k mo138224e(String str, boolean z) {
            String str2 = str;
            C87412m.m108594g(str2, "username");
            Log.m105924i("MicroMsg.Gallery.GalleryController", "LogStory: loadSyncData " + str2);
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99264e jo = hVar.mo134189g().mo138646jo(str2);
            boolean z2 = true;
            if (jo.field_syncId == 0) {
                return null;
            }
            float f = 0.0f;
            String str3 = "";
            if (z) {
                C99268i Ow = hVar.mo134191i().mo138664Ow(jo.field_syncId);
                C99268i iVar = new C99268i();
                iVar.field_storyID = jo.field_syncId;
                iVar.field_createTime = jo.field_storyPostTime;
                iVar.field_userName = jo.getUserName();
                pc4 pc4 = new pc4();
                sb4 sb4 = new sb4();
                C101765cp3 cp32 = new C101765cp3();
                cp32.f298034e = 0.0f;
                cp32.f298033d = 0.0f;
                pc4.f299135g = cp32;
                pc4.f299136h = sb4;
                pc4.f299132d = str3;
                pc4.f299134f = 0;
                pc4.f299133e = jo.getUserName();
                pc4.f299134f = jo.field_storyPostTime;
                bc4 bc4 = new bc4();
                bc4.f297959d = "empty_" + C31543z5.m39453c();
                if (Ow == null || Ow.mo138657p2().f299139n != 0) {
                    z2 = false;
                }
                if (z2) {
                    String str4 = jo.field_newThumbUrl;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    bc4.f297963h = str4;
                    String str5 = jo.field_newVideoUrl;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    bc4.f297961f = str3;
                }
                pc4.f299136h.f299398e.add(bc4);
                iVar.mo138660s2(pc4);
                return new C98266k(iVar, pc4, (C98267l) null, 4, (C8480h) null);
            }
            C99268i iVar2 = new C99268i();
            iVar2.field_storyID = jo.field_syncId;
            iVar2.field_createTime = jo.field_storyPostTime;
            iVar2.field_userName = jo.getUserName();
            pc4 pc42 = new pc4();
            sb4 sb42 = new sb4();
            C101765cp3 cp33 = new C101765cp3();
            cp33.f298034e = 0.0f;
            cp33.f298033d = 0.0f;
            pc42.f299135g = cp33;
            pc42.f299136h = sb42;
            pc42.f299132d = str3;
            pc42.f299134f = 0;
            pc42.f299133e = jo.getUserName();
            pc42.f299134f = jo.field_storyPostTime;
            bc4 bc42 = new bc4();
            bc42.f297959d = "empty_" + C31543z5.m39453c();
            String str6 = jo.field_newThumbUrl;
            if (str6 == null) {
                str6 = str3;
            }
            bc42.f297963h = str6;
            String str7 = jo.field_newVideoUrl;
            if (str7 != null) {
                str3 = str7;
            }
            bc42.f297961f = str3;
            long j = jo.field_duration;
            if (j > 0) {
                f = (float) (((double) j) / 1000.0d);
            }
            bc42.f297978z = f;
            pc42.f299136h.f299398e.add(bc42);
            iVar2.mo138660s2(pc42);
            return new C98266k(iVar2, pc42, (C98267l) null, 4, (C8480h) null);
        }
    }

    /* renamed from: a */
    public void mo138190a(int i, int i2) {
    }

    /* renamed from: b */
    public void mo138204b(int i) {
    }

    /* renamed from: c */
    public abstract void mo138191c(int i, int i2);

    /* renamed from: d */
    public abstract void mo138192d();

    /* renamed from: e */
    public void mo138205e(int i) {
    }

    /* renamed from: f */
    public abstract void mo138193f();

    /* renamed from: g */
    public abstract void mo138194g(int i);

    /* renamed from: h */
    public abstract void mo138195h(int i, int i2, boolean z);

    /* renamed from: i */
    public abstract void mo138196i(int i, int i2);

    /* renamed from: j */
    public void mo138206j() {
    }

    /* renamed from: k */
    public void mo138207k() {
    }

    /* renamed from: l */
    public void mo138197l(int i, int i2, boolean z, C99268i iVar) {
    }

    /* renamed from: m */
    public void mo138198m(int i, int i2, boolean z) {
    }
}
