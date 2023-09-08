package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0716c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ke1.C9595n;
import pe3.C89349b;
import te3.C49980je1;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;
import up1.C14269a0;
import up1.C14362s;
import vp1.C14937o;
import vp1.C14946u;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.z */
public final class C2828z implements C9595n.C9596a {

    /* renamed from: a */
    public final /* synthetic */ FinderLbsLoader.C2700c f14108a;

    /* renamed from: b */
    public final /* synthetic */ C13910j<C0716c> f14109b;

    /* renamed from: c */
    public final /* synthetic */ C14121l f14110c;

    public C2828z(FinderLbsLoader.C2700c cVar, C13910j<C0716c> jVar, C14121l lVar) {
        this.f14108a = cVar;
        this.f14109b = jVar;
        this.f14110c = lVar;
    }

    /* renamed from: a */
    public void mo2927a(FinderLbsLoader.C2698a aVar) {
        C49980je1 je12;
        C87412m.m108594g(aVar, "response");
        String tag = this.f14108a.getTAG();
        Log.m105924i(tag, "[call] onFetchDone... pullType=" + aVar.getPullType());
        if (aVar.getPullType() != 2) {
            LinkedList linkedList = new LinkedList();
            List<C0716c> incrementList = aVar.getIncrementList();
            byte[] bArr = null;
            if (incrementList != null) {
                for (C0716c cVar : incrementList) {
                    C14269a0 a0Var = cVar.f1724d;
                    C14362s sVar = a0Var.f39807b;
                    if ((sVar != null ? sVar.f39919a : null) != null) {
                        long j = a0Var.f39812g;
                        if (sVar == null || (je12 = sVar.f39919a) == null) {
                            je12 = new C49980je1();
                        }
                        linkedList.add(new C14946u(0, j, 1, je12));
                    }
                }
            }
            if (linkedList.size() > 0) {
                C14937o.f40972a.mo13980a(9, C66785b.f191882e.mo90662O5(), linkedList);
                C89349b lastBuffer = aVar.getLastBuffer();
                if (lastBuffer != null) {
                    bArr = lastBuffer.mo123703f();
                }
                String encodeHexString = Util.encodeHexString(bArr);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, encodeHexString);
                String tag2 = this.f14108a.getTAG();
                Log.m105924i(tag2, "save firstPage and lastBuffer, size:" + linkedList.size() + ", lastBuffer:" + encodeHexString);
            }
            String tag3 = this.f14108a.getTAG();
            Log.m105924i(tag3, "lxl FinderLbsLoader FinderPage size: " + linkedList.size());
        }
        this.f14109b.onFetchDone(aVar);
        this.f14110c.mo11853b(C65234n.OK);
    }
}
