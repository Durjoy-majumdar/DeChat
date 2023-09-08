package kw2;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import cw2.C75306e;
import cw2.C75307f;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o90.C100308d;
import p749xh.C102677x8;
import xv2.C102783l;

/* renamed from: kw2.f */
public final class C99265f extends MAutoStorage<C99264e> implements MStorage.IOnStorageChange {

    /* renamed from: i */
    public static final String[] f291060i = {MAutoStorage.getCreateSQLs(C99264e.f291058W, "StoryExtItem")};

    /* renamed from: j */
    public static final String f291061j = "select *, rowid from StoryExtItem ";

    /* renamed from: n */
    public static final String f291062n = "select * from StoryExtItem";

    /* renamed from: d */
    public final ISQLiteDatabase f291063d;

    /* renamed from: e */
    public final ArrayList<C102783l> f291064e = new ArrayList<>();

    /* renamed from: f */
    public final C100308d<String, C99264e> f291065f = new C100308d<>(1000);

    /* renamed from: g */
    public C100308d<String, C99264e> f291066g = new C100308d<>(1000);

    /* renamed from: h */
    public final ISQLiteDatabase f291067h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99265f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99264e.f291058W, "StoryExtItem", C102677x8.f303171z);
        C87412m.m108594g(iSQLiteDatabase, "vdb");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99264e.f291058W;
        this.f291063d = iSQLiteDatabase;
        this.f291067h = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final List<C99264e> mo138639Lo() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f291067h.rawQuery(f291062n, (String[]) null, 2);
        rawQuery.moveToFirst();
        do {
            C99264e eVar = new C99264e();
            eVar.convertFrom(rawQuery);
            arrayList.add(eVar);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: Ow */
    public final C99264e mo138640Ow(String str) {
        C99264e eVar = new C99264e();
        eVar.field_userName = str;
        super.get(eVar, getPrimaryKey());
        return eVar;
    }

    /* renamed from: SE */
    public final boolean mo138641SE(C99264e eVar) {
        C87412m.m108594g(eVar, "info");
        mo138645bF(eVar);
        return super.replace(eVar);
    }

    /* renamed from: TE */
    public final int mo138642TE(long j, C99264e eVar) {
        C87412m.m108594g(eVar, "extinfo");
        ContentValues convertTo = eVar.convertTo();
        convertTo.remove("rowid");
        mo138645bF(eVar);
        ISQLiteDatabase iSQLiteDatabase = this.f291067h;
        return iSQLiteDatabase.update("StoryExtItem", convertTo, "rowid=?", new String[]{"" + j});
    }

    /* renamed from: Yt */
    public final C99264e mo138643Yt(String str) {
        C87412m.m108594g(str, "username");
        if (str.length() == 0) {
            return null;
        }
        C99264e eVar = this.f291065f.get(str);
        if (eVar != null) {
            return eVar;
        }
        C99264e eVar2 = this.f291066g.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        C99264e Ow = mo138640Ow(str);
        mo138645bF(Ow);
        return Ow;
    }

    /* renamed from: bD */
    public final C99264e mo138644bD(String str) {
        C87412m.m108594g(str, "username");
        C99264e eVar = this.f291066g.get(str);
        if (eVar != null) {
            return eVar;
        }
        C99264e Ow = mo138640Ow(str);
        mo138645bF(Ow);
        return Ow;
    }

    /* renamed from: bF */
    public final void mo138645bF(C99264e eVar) {
        if (eVar != null) {
            if (!(eVar.getUserName().length() == 0)) {
                if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(eVar.getUserName())) {
                    this.f291065f.put(eVar.getUserName(), eVar);
                    this.f291066g.remove(eVar.getUserName());
                    return;
                }
                this.f291065f.remove(eVar.getUserName());
                this.f291066g.put(eVar.getUserName(), eVar);
            }
        }
    }

    /* renamed from: jo */
    public final C99264e mo138646jo(String str) {
        C87412m.m108594g(str, "userName");
        C99264e Yt = mo138643Yt(str);
        return Yt != null ? Yt : mo138640Ow(str);
    }

    /* renamed from: kD */
    public final int mo138647kD(String str, String str2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "md5");
        C99264e Ow = mo138640Ow(str);
        Ow.field_md5 = str2;
        super.replace(Ow);
        return 0;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (str != null && mStorageEventData != null) {
            if (C87412m.m108589b(str, "notify_story_read")) {
                Object obj = mStorageEventData.obj;
                if (obj instanceof C99264e) {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                    String userName = ((C99264e) obj).getUserName();
                    Iterator<C102783l> it = this.f291064e.iterator();
                    while (it.hasNext()) {
                        it.next().mo142535a(userName, true);
                    }
                    C75307f fVar = C75307f.f221459a;
                    ThreadPool.post(C75306e.f221458d, "FavourUserChecker_StoryStateChecker");
                    return;
                }
            }
            if (C87412m.m108589b(str, "notify_story_unread")) {
                Object obj2 = mStorageEventData.obj;
                if (obj2 instanceof C99264e) {
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                    String userName2 = ((C99264e) obj2).getUserName();
                    Iterator<C102783l> it4 = this.f291064e.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo142535a(userName2, false);
                    }
                    C75307f fVar2 = C75307f.f221459a;
                    ThreadPool.post(C75306e.f221458d, "FavourUserChecker_StoryStateChecker");
                    return;
                }
            }
            if (C87412m.m108589b(str, "notify_story_invalid")) {
                Object obj3 = mStorageEventData.obj;
                if (obj3 instanceof C99264e) {
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                    String userName3 = ((C99264e) obj3).getUserName();
                    Iterator<C102783l> it5 = this.f291064e.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo142535a(userName3, true);
                    }
                    C75307f fVar3 = C75307f.f221459a;
                    ThreadPool.post(C75306e.f221458d, "FavourUserChecker_StoryStateChecker");
                    return;
                }
            }
            if (C87412m.m108589b(str, "notify_story_valid")) {
                Object obj4 = mStorageEventData.obj;
                if (obj4 instanceof C99264e) {
                    C87412m.m108592e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                    String userName4 = ((C99264e) obj4).getUserName();
                    Iterator<C102783l> it6 = this.f291064e.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo142535a(userName4, true);
                    }
                    C75307f fVar4 = C75307f.f221459a;
                    ThreadPool.post(C75306e.f221458d, "FavourUserChecker_StoryStateChecker");
                    return;
                }
            }
            Log.m105918d("MicroMsg.StoryExtInfoStorage", "unknown event " + str);
        }
    }

    /* renamed from: qq */
    public final List<C99264e> mo138648qq() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f291067h.rawQuery(f291061j, (String[]) null, 2);
        rawQuery.moveToFirst();
        do {
            C99264e eVar = new C99264e();
            eVar.convertFrom(rawQuery);
            arrayList.add(eVar);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C99264e eVar = (C99264e) iAutoDBItem;
        C87412m.m108594g(eVar, "item");
        boolean replace = super.replace(eVar);
        mo138645bF(eVar);
        return replace;
    }
}
