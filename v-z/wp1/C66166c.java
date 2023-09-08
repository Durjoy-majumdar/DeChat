package wp1;

import com.tencent.p014mm.autogen.events.FinderDraftOpEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64267br2;
import te3.C64394ge0;
import te3.C64689rq2;
import up1.C65418l;
import vp1.C65840n;

/* renamed from: wp1.c */
public final class C66166c {

    /* renamed from: a */
    public static final C66166c f190172a = new C66166c();

    /* renamed from: a */
    public final void mo90230a(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        FinderObjectDesc finderObjectDesc = lVar.mo89514l2().getFeedObject().objectDesc;
        LinkedList<FinderMedia> linkedList = finderObjectDesc != null ? finderObjectDesc.media : null;
        if (linkedList != null && linkedList.size() > 0) {
            C64267br2 br22 = new C64267br2();
            for (C64689rq2 rq22 : C65840n.m77567c(linkedList)) {
                StringBuilder sb = new StringBuilder();
                String str = rq22.f185283w;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                sb.append(str);
                String str3 = rq22.f185234A;
                if (str3 == null) {
                    str3 = str2;
                }
                sb.append(str3);
                rq22.f185237D = sb.toString();
                StringBuilder sb4 = new StringBuilder();
                String str4 = rq22.f185261W;
                if (str4 == null) {
                    str4 = str2;
                }
                sb4.append(str4);
                String str5 = rq22.f185263X;
                if (str5 == null) {
                    str5 = str2;
                }
                sb4.append(str5);
                rq22.f185259V = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                String str6 = rq22.f185266d;
                if (str6 == null) {
                    str6 = str2;
                }
                sb5.append(str6);
                String str7 = rq22.f185286y;
                if (str7 == null) {
                    str7 = str2;
                }
                sb5.append(str7);
                rq22.f185278r = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                String str8 = rq22.f185267e;
                if (str8 == null) {
                    str8 = str2;
                }
                sb6.append(str8);
                String str9 = rq22.f185288z;
                if (str9 == null) {
                    str9 = str2;
                }
                sb6.append(str9);
                rq22.f185279s = sb6.toString();
                String str10 = rq22.f185242I;
                if (str10 == null) {
                    str10 = str2;
                }
                rq22.f185249Q = str10;
                StringBuilder sb7 = new StringBuilder();
                String str11 = rq22.f185239F;
                if (str11 == null) {
                    str11 = str2;
                }
                sb7.append(str11);
                String str12 = rq22.f185240G;
                if (str12 != null) {
                    str2 = str12;
                }
                sb7.append(str2);
                rq22.f185241H = sb7.toString();
                br22.f182328d.add(rq22);
            }
            lVar.mo89514l2().field_mediaExtList = br22;
        }
    }

    /* renamed from: b */
    public final boolean mo90231b(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft, " + lVar.mo89515m2());
        C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0();
        long j = lVar.field_localId;
        boolean z = true;
        if (j == 0) {
            long Ow = Cx0.mo90225Ow(lVar);
            FinderDraftOpEvent finderDraftOpEvent = new FinderDraftOpEvent();
            FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
            aVar.f154767a = 100;
            aVar.f154768b = Ow;
            finderDraftOpEvent.publish();
            Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save all, " + lVar.mo89515m2());
            return true;
        }
        C65418l qq = Cx0.mo90229qq(j);
        if (qq == null || qq.field_version > lVar.field_version) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finder.LogPost updateOrCreateLocalDraft cannot update, exist:");
            sb.append(qq != null);
            sb.append(", version:");
            if ((qq != null ? qq.field_version : 0) > lVar.field_version) {
                z = false;
            }
            sb.append(z);
            Log.m105924i("Finder.FinderDraftStorageLogic", sb.toString());
            return false;
        }
        Cx0.mo90228kD(j, lVar);
        Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save id, " + lVar.mo89515m2());
        return true;
    }

    /* renamed from: c */
    public final void mo90232c(C65418l lVar, FinderObject finderObject) {
        C87412m.m108594g(lVar, "draftItem");
        C87412m.m108594g(finderObject, "svrFinderObj");
        Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, " + lVar.mo89515m2());
        C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0();
        long j = lVar.field_localId;
        C65418l qq = Cx0.mo90229qq(j);
        if (qq != null && qq.field_version > lVar.field_version) {
            Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, just save id");
            lVar.field_objectId = finderObject.f164794id;
            Cx0.mo90228kD(j, lVar);
        } else if (qq != null) {
            Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, overwrite");
            lVar.field_localFlag = 4;
            lVar.field_objectId = finderObject.f164794id;
            lVar.f188267L = FinderItem.Companion.mo79057c(finderObject, (C64394ge0) null, lVar.field_localId);
            mo90230a(lVar);
            Cx0.mo90228kD(lVar.field_localId, lVar);
        } else {
            Log.m105924i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, deleted");
        }
    }
}
