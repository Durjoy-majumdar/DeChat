package br1;

import ar1.C54319c;
import ar1.C54320d;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import cr1.C57979c;
import cr1.C57981d;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import gy3.C87412m;
import xq1.C66405c;
import xq1.C66408e;
import xq1.C66410g;
import xq1.C66414k;

/* renamed from: br1.b */
public final class C54546b implements C66410g {
    /* renamed from: a */
    public void mo75420a(String str, C66408e eVar, C66408e eVar2) {
        FinderFeedReportObject finderFeedReportObject;
        FinderFeedReportObject finderFeedReportObject2;
        FinderFeedReportObject finderFeedReportObject3;
        FinderFeedReportObject finderFeedReportObject4;
        FinderFeedReportObject finderFeedReportObject5;
        FinderFeedReportObject finderFeedReportObject6;
        FinderFeedReportObject finderFeedReportObject7;
        FinderFeedReportObject finderFeedReportObject8;
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "from");
        C87412m.m108594g(eVar2, "to");
        int i = 0;
        boolean z = !(eVar2 instanceof C66405c) && !(eVar2 instanceof C66414k);
        if (eVar instanceof FinderMediaProcessStage) {
            C59266a aVar = C59266a.f169452a;
            C59268c cVar = C59267b.f169453a;
            C59268c cVar2 = z ? C59267b.f169465m : C59267b.f169464l;
            FinderItem finderItem = ((FinderMediaProcessStage) eVar).f161540h;
            aVar.mo84409a(cVar2, finderItem, 0, (!z && (finderFeedReportObject8 = finderItem.field_reportObject) != null) ? finderFeedReportObject8.mpError : 0);
        } else if (eVar instanceof MvMediaProcessStage) {
            C59266a aVar2 = C59266a.f169452a;
            C59268c cVar3 = C59267b.f169453a;
            C59268c cVar4 = z ? C59267b.f169465m : C59267b.f169464l;
            FinderItem finderItem2 = ((MvMediaProcessStage) eVar).f161615h;
            aVar2.mo84409a(cVar4, finderItem2, 0, (!z && (finderFeedReportObject7 = finderItem2.field_reportObject) != null) ? finderFeedReportObject7.mpError : 0);
        } else if (eVar instanceof FinderUploadStage) {
            C59266a aVar3 = C59266a.f169452a;
            C59268c cVar5 = C59267b.f169453a;
            C59268c cVar6 = z ? C59267b.f169468p : C59267b.f169467o;
            FinderItem finderItem3 = ((FinderUploadStage) eVar).f161596h;
            aVar3.mo84409a(cVar6, finderItem3, 0, (!z && (finderFeedReportObject6 = finderItem3.field_reportObject) != null) ? finderFeedReportObject6.uploadLogicError : 0);
        } else if (eVar instanceof MvUploadStage) {
            C59266a aVar4 = C59266a.f169452a;
            C59268c cVar7 = C59267b.f169453a;
            C59268c cVar8 = z ? C59267b.f169468p : C59267b.f169467o;
            FinderItem finderItem4 = ((MvUploadStage) eVar).f161619h;
            aVar4.mo84409a(cVar8, finderItem4, 0, (!z && (finderFeedReportObject5 = finderItem4.field_reportObject) != null) ? finderFeedReportObject5.uploadLogicError : 0);
        } else if (eVar instanceof C54319c) {
            C59266a aVar5 = C59266a.f169452a;
            C59268c cVar9 = C59267b.f169453a;
            C59268c cVar10 = z ? C59267b.f169471s : C59267b.f169470r;
            FinderItem finderItem5 = ((C54319c) eVar).f152449h;
            int i2 = (!z && (finderFeedReportObject4 = finderItem5.field_reportObject) != null) ? finderFeedReportObject4.cgiErrorType : 0;
            if (!z && (finderFeedReportObject3 = finderItem5.field_reportObject) != null) {
                i = finderFeedReportObject3.cgiErrorCode;
            }
            aVar5.mo84409a(cVar10, finderItem5, i2, i);
        } else if (eVar instanceof C57979c) {
            C59266a aVar6 = C59266a.f169452a;
            C59268c cVar11 = C59267b.f169453a;
            C59268c cVar12 = z ? C59267b.f169471s : C59267b.f169470r;
            FinderItem finderItem6 = ((C57979c) eVar).f165909h;
            int i3 = (!z && (finderFeedReportObject2 = finderItem6.field_reportObject) != null) ? finderFeedReportObject2.cgiErrorType : 0;
            if (!z && (finderFeedReportObject = finderItem6.field_reportObject) != null) {
                i = finderFeedReportObject.cgiErrorCode;
            }
            aVar6.mo84409a(cVar12, finderItem6, i3, i);
        }
        if (eVar2 instanceof FinderMediaProcessStage) {
            C59266a aVar7 = C59266a.f169452a;
            C59268c cVar13 = C59267b.f169453a;
            C59266a.m69196d(aVar7, C59267b.f169463k, ((FinderMediaProcessStage) eVar2).f161540h, 0, 0, 12, (Object) null);
        } else if (eVar2 instanceof MvMediaProcessStage) {
            C59266a aVar8 = C59266a.f169452a;
            C59268c cVar14 = C59267b.f169453a;
            C59266a.m69196d(aVar8, C59267b.f169463k, ((MvMediaProcessStage) eVar2).f161615h, 0, 0, 12, (Object) null);
        } else if (eVar2 instanceof FinderUploadStage) {
            C59266a aVar9 = C59266a.f169452a;
            C59268c cVar15 = C59267b.f169453a;
            C59266a.m69196d(aVar9, C59267b.f169466n, ((FinderUploadStage) eVar2).f161596h, 0, 0, 12, (Object) null);
        } else if (eVar2 instanceof MvUploadStage) {
            C59266a aVar10 = C59266a.f169452a;
            C59268c cVar16 = C59267b.f169453a;
            C59266a.m69196d(aVar10, C59267b.f169466n, ((MvUploadStage) eVar2).f161619h, 0, 0, 12, (Object) null);
        } else if (eVar2 instanceof C54319c) {
            C59266a aVar11 = C59266a.f169452a;
            C59268c cVar17 = C59267b.f169453a;
            C59266a.m69196d(aVar11, C59267b.f169469q, ((C54319c) eVar2).f152449h, 0, 0, 12, (Object) null);
        } else if (eVar2 instanceof C57979c) {
            C59266a aVar12 = C59266a.f169452a;
            C59268c cVar18 = C59267b.f169453a;
            C59266a.m69196d(aVar12, C59267b.f169469q, ((C57979c) eVar2).f165909h, 0, 0, 12, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo75421b(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "beginStage");
        if (eVar instanceof C54320d) {
            C59266a aVar = C59266a.f169452a;
            C59268c cVar = C59267b.f169453a;
            C59266a.m69196d(aVar, C59267b.f169461i, ((C54320d) eVar).f152454h, 0, 0, 12, (Object) null);
        } else if (eVar instanceof C57981d) {
            C59266a aVar2 = C59266a.f169452a;
            C59268c cVar2 = C59267b.f169453a;
            C59266a.m69196d(aVar2, C59267b.f169461i, ((C57981d) eVar).f165917h, 0, 0, 12, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo75422c(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "endStage");
    }
}
