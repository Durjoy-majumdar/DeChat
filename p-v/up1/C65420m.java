package up1;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.FinderDraftModifyEvent;
import com.tencent.p014mm.autogen.events.FinderDraftOpEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hp3.C87581a;
import je1.C46532r;
import ob0.C89132b;
import rx3.C13598b0;
import wp1.C66165b;

/* renamed from: up1.m */
public final class C65420m {

    /* renamed from: a */
    public static final C65420m f188268a = new C65420m();

    /* renamed from: up1.m$a */
    public static final class C65421a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C65418l f188269a;

        /* renamed from: b */
        public final /* synthetic */ long f188270b;

        public C65421a(C65418l lVar, long j) {
            this.f188269a = lVar;
            this.f188270b = j;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90224Lo(this.f188269a.field_objectId);
            long j = this.f188270b;
            FinderDraftOpEvent finderDraftOpEvent = new FinderDraftOpEvent();
            FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
            aVar.f154767a = 110;
            aVar.f154768b = j;
            finderDraftOpEvent.publish();
            FinderDraftModifyEvent finderDraftModifyEvent = new FinderDraftModifyEvent();
            FinderDraftModifyEvent.C55122a aVar2 = finderDraftModifyEvent.f154763d;
            aVar2.f154764a = j;
            aVar2.f154765b = 2;
            finderDraftModifyEvent.publish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.m$b */
    public static final class C65422b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C65418l f188271a;

        public C65422b(C65418l lVar) {
            this.f188271a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90224Lo(this.f188271a.field_objectId);
            long j = this.f188271a.field_localId;
            FinderDraftOpEvent finderDraftOpEvent = new FinderDraftOpEvent();
            FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
            aVar.f154767a = 110;
            aVar.f154768b = j;
            finderDraftOpEvent.publish();
            FinderDraftModifyEvent finderDraftModifyEvent = new FinderDraftModifyEvent();
            FinderDraftModifyEvent.C55122a aVar2 = finderDraftModifyEvent.f154763d;
            aVar2.f154764a = j;
            aVar2.f154765b = 2;
            finderDraftModifyEvent.publish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final C65418l mo89519a(long j) {
        C65418l b = mo89520b(j);
        if (!(b == null || b.field_objectId == 0)) {
            Log.m105924i("Finder.FinderDraftLogic", "deleteRemoteDraft localId:" + j + ", objectId:" + b.field_objectId);
            new C46532r(b.field_objectId).mo9225i().mo123420E(new C65421a(b, j));
        }
        return b;
    }

    /* renamed from: b */
    public final C65418l mo89520b(long j) {
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("Finder.FinderDraftLogic", "deleteLocalDraft localId:" + j);
        C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0();
        C65418l lVar = null;
        Cursor rawQuery = Cx0.f190170i.rawQuery("SELECT * FROM FinderDraftItem  WHERE " + Cx0.f190165d + ".localId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            lVar = new C65418l();
            lVar.convertFrom(rawQuery);
            rawQuery.close();
        } else {
            rawQuery.close();
        }
        C66165b.m78044jo(((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0(), j, false, 2, (Object) null);
        FinderDraftOpEvent finderDraftOpEvent = new FinderDraftOpEvent();
        FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
        aVar.f154767a = 110;
        aVar.f154768b = j;
        finderDraftOpEvent.publish();
        FinderDraftModifyEvent finderDraftModifyEvent = new FinderDraftModifyEvent();
        FinderDraftModifyEvent.C55122a aVar2 = finderDraftModifyEvent.f154763d;
        aVar2.f154764a = j;
        aVar2.f154765b = 2;
        finderDraftModifyEvent.publish();
        return lVar;
    }

    /* renamed from: c */
    public final C65418l mo89521c(long j) {
        Class cls = FinderCommonFeatureService.class;
        C65418l Yt = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0().mo90226Yt(j);
        if (Yt != null) {
            Log.m105924i("Finder.FinderDraftLogic", "deleteSvrDraft localId:" + Yt.field_localId + ", objectId:" + Yt.field_objectId);
            C66165b.m78044jo(((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0(), Yt.field_localId, false, 2, (Object) null);
            new C46532r(Yt.field_objectId).mo9225i().mo123420E(new C65422b(Yt));
        }
        return Yt;
    }
}
