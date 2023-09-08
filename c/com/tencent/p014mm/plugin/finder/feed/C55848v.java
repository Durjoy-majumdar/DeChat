package com.tencent.p014mm.plugin.finder.feed;

import android.database.Cursor;
import cm1.C55014f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C58003b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import o40.C61926c;
import rx3.C13598b0;
import up1.C65412c;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.feed.v */
public final class C55848v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f159065d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55848v(FinderTimelinePresenter finderTimelinePresenter) {
        super(0);
        this.f159065d = finderTimelinePresenter;
    }

    public Object invoke() {
        C65412c Ex0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ex0();
        String str = Ex0.f188253e + " WHERE actionType = 1 and state = -1 and  canRemove = 0 group By feedId";
        Cursor rawQuery = Ex0.f188252d.rawQuery(str, (String[]) null, 2);
        LinkedList<C65412c.C37520a> linkedList = new LinkedList<>();
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    C65426w0 w0Var = new C65426w0();
                    w0Var.convertFrom(rawQuery);
                    long j = w0Var.field_feedId;
                    String str2 = w0Var.field_objectNonceId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedList.add(new C65412c.C37520a(j, str2));
                } while (rawQuery.moveToNext());
            }
            C13598b0 b0Var = C13598b0.f38549a;
            C58003b.m67160a(rawQuery, (Throwable) null);
            Log.m105924i("Finder.FinderActionStorage", "getAllFailedCommentFeedIds " + str + " listSize:" + linkedList.size());
            ConcurrentLinkedQueue<C55014f> concurrentLinkedQueue = this.f159065d.f13259T;
            for (C65412c.C37520a aVar : linkedList) {
                concurrentLinkedQueue.add(new C55014f(aVar.f99118a, aVar.f99119b, 0, 4, (C8480h) null));
            }
            C61926c.m72668M(new C2859u(this.f159065d));
            return C13598b0.f38549a;
        } catch (Throwable th) {
            C58003b.m67160a(rawQuery, th);
            throw th;
        }
    }
}
