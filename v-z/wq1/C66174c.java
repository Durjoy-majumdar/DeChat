package wq1;

import ar1.C54319c;
import ar1.C54320d;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr1.C57979c;
import cr1.C57981d;
import gy3.C87412m;
import p749xh.C66261f3;
import te3.C64736tq2;
import up1.C37521f;
import up1.C65418l;
import wp1.C15585f;
import wp1.C66166c;
import xq1.C66408e;
import zq1.C66965g;
import zq1.C66966h;

/* renamed from: wq1.c */
public final class C66174c {

    /* renamed from: a */
    public static final C66174c f190185a = new C66174c();

    /* renamed from: a */
    public final boolean mo90266a(C64736tq2 tq22) {
        C87412m.m108594g(tq22, C66261f3.COL_POSTINFO);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C37521f.f99374d.getClass();
            C37521f.f99410h = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[isDraftToManyTry] tryCount:");
        sb.append(tq22);
        sb.append(".tryCount, configMax:");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        sb.append(C37521f.f99410h);
        Log.m105924i("LogPost.FinderPostHelper", sb.toString());
        int i = tq22.f185646e;
        fVar.getClass();
        return i > C37521f.f99410h;
    }

    /* renamed from: b */
    public final boolean mo90267b(C64736tq2 tq22) {
        C87412m.m108594g(tq22, C66261f3.COL_POSTINFO);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C37521f.f99374d.getClass();
            C37521f.f99401g = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[isToManyTry] tryCount:");
        sb.append(tq22.f185646e);
        sb.append(", configMax:");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        sb.append(C37521f.f99401g);
        Log.m105924i("LogPost.FinderPostHelper", sb.toString());
        int i = tq22.f185646e;
        fVar.getClass();
        return i > C37521f.f99401g;
    }

    /* renamed from: c */
    public final String mo90268c(C66408e eVar) {
        C87412m.m108594g(eVar, "<this>");
        String simpleName = eVar instanceof C54320d ? "FinderPostPrepareStage" : eVar instanceof FinderMediaProcessStage ? "FinderMediaProcessStage" : eVar instanceof FinderUploadStage ? "FinderUploadStage" : eVar instanceof C54319c ? "FinderPostCgiStage" : eVar instanceof C66966h ? "FinderDraftPrepareStage" : eVar instanceof FinderDraftMediaProcessStage ? "FinderDraftMediaProcessStage" : eVar instanceof FinderDraftUploadStage ? "FinderDraftUploadStage" : eVar instanceof C66965g ? "FinderDraftPostCgiStage" : eVar instanceof C57981d ? "MvPostPrepareStage" : eVar instanceof MvMediaProcessStage ? "MvMediaProcessStage" : eVar instanceof MvUploadStage ? "MvUploadStage" : eVar instanceof C57979c ? "MvPostCgiStage" : eVar.getClass().getSimpleName();
        return "stageName:" + simpleName + ", taskId:" + eVar.mo90502b() + ", taskType:" + eVar.mo75100a();
    }

    /* renamed from: d */
    public final C64736tq2 mo90269d(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "feedObject");
        C64736tq2 postInfo = finderItem.getPostInfo();
        postInfo.f185646e++;
        finderItem.setPostInfo(postInfo);
        C15585f.f42211a.mo14345h(finderItem);
        Log.m105924i("LogPost.FinderPostHelper", "[updateTryCount] tryCount:" + postInfo.f185646e);
        return postInfo;
    }

    /* renamed from: e */
    public final C64736tq2 mo90270e(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        C64736tq2 postInfo = lVar.getPostInfo();
        postInfo.f185646e++;
        lVar.mo89514l2().setPostInfo(postInfo);
        C66166c.f190172a.mo90231b(lVar);
        Log.m105924i("LogPost.FinderPostHelper", "[updateDraftTryCount] tryCount:" + postInfo.f185646e);
        return postInfo;
    }
}
