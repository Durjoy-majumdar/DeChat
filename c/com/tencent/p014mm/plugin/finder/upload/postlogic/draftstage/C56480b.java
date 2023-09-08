package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
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

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.b */
public final class C56480b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MvDraftUploadStage f161538d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56480b(MvDraftUploadStage mvDraftUploadStage) {
        super(0);
        this.f161538d = mvDraftUploadStage;
    }

    public Object invoke() {
        LinkedList<C64689rq2> linkedList = new LinkedList<>();
        MvDraftUploadStage mvDraftUploadStage = this.f161538d;
        linkedList.addAll(mvDraftUploadStage.f161521j.getMediaList());
        for (FinderItem mediaList : mvDraftUploadStage.f161521j.getClipListExt()) {
            linkedList.addAll(mediaList.getMediaList());
        }
        MvDraftUploadStage mvDraftUploadStage2 = this.f161538d;
        for (C64689rq2 rq22 : linkedList) {
            String mD5String = MD5Util.getMD5String(rq22.f185266d);
            C87412m.m108593f(mD5String, "getMD5String(mediaObject.url)");
            String n = mvDraftUploadStage2.mo79347n(mD5String);
            if (!Util.isNullOrNil(n)) {
                String str = mvDraftUploadStage2.f161520i;
                Log.m105924i(str, "draftModifyListener cancelSendTask " + n);
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(n);
            }
        }
        return C13598b0.f38549a;
    }
}
