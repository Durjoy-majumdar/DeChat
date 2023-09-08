package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import p663qo.C101213l;
import rx3.C13598b0;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.a */
public final class C56479a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderDraftUploadStage f161537d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56479a(FinderDraftUploadStage finderDraftUploadStage) {
        super(0);
        this.f161537d = finderDraftUploadStage;
    }

    public Object invoke() {
        LinkedList<C64689rq2> linkedList = new LinkedList<>();
        FinderDraftUploadStage finderDraftUploadStage = this.f161537d;
        linkedList.addAll(finderDraftUploadStage.f161496j.getHalfVideoMediaExtList());
        linkedList.addAll(finderDraftUploadStage.f161496j.getMediaList());
        FinderDraftUploadStage finderDraftUploadStage2 = this.f161537d;
        for (C64689rq2 rq22 : linkedList) {
            String mD5String = MD5Util.getMD5String(rq22.f185266d);
            C87412m.m108593f(mD5String, "getMD5String(mediaObject.url)");
            String n = finderDraftUploadStage2.mo79337n(mD5String);
            if (!Util.isNullOrNil(n)) {
                String str = finderDraftUploadStage2.f161495i;
                Log.m105924i(str, "feedDeleteListener cancelSendTask " + n);
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(n);
            }
        }
        return C13598b0.f38549a;
    }
}
