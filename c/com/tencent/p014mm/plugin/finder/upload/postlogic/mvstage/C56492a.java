package com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage;

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

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.a */
public final class C56492a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MvUploadStage f161636d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56492a(MvUploadStage mvUploadStage) {
        super(0);
        this.f161636d = mvUploadStage;
    }

    public Object invoke() {
        LinkedList<C64689rq2> linkedList = new LinkedList<>();
        MvUploadStage mvUploadStage = this.f161636d;
        linkedList.addAll(mvUploadStage.f161619h.getMediaList());
        for (FinderItem mediaList : mvUploadStage.f161619h.getClipListExt()) {
            linkedList.addAll(mediaList.getMediaList());
        }
        MvUploadStage mvUploadStage2 = this.f161636d;
        for (C64689rq2 rq22 : linkedList) {
            String mD5String = MD5Util.getMD5String(rq22.f185266d);
            C87412m.m108593f(mD5String, "getMD5String(mediaObject.url)");
            String n = mvUploadStage2.mo79377n(mD5String);
            if (!Util.isNullOrNil(n)) {
                String str = mvUploadStage2.f161620i;
                Log.m105924i(str, "feedDeleteListener cancelSendTask " + n);
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(n);
            }
        }
        return C13598b0.f38549a;
    }
}
