package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C18747a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import ht1.C60165e4;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C11348f;
import rx3.C13598b0;
import te3.C49308en1;
import te3.C50301lr3;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.c */
public final class C41412c implements C18747a {

    /* renamed from: a */
    public final Context f111499a;

    /* renamed from: b */
    public C18747a.C18748a f111500b;

    /* renamed from: c */
    public RenderView f111501c;

    /* renamed from: d */
    public List<? extends C41411b> f111502d;

    public C41412c(Context context, C2488e eVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "renderInflater");
        this.f111499a = context;
    }

    /* renamed from: a */
    public List<C41411b> mo23616a(List<? extends C50301lr3> list) {
        C87412m.m108594g(list, "nodes");
        Log.m105924i("Finder.Renderer", "analysisNodes nodes:" + list.size());
        LinkedList linkedList = new LinkedList();
        C8479f0 f0Var = new C8479f0();
        for (C50301lr3 lr32 : list) {
            if (lr32.f137619d == 3) {
                C41413d dVar = new C41413d();
                dVar.f111503a = lr32;
                linkedList.add(dVar);
                f0Var.f27484d = null;
            } else {
                C41413d dVar2 = (C41413d) f0Var.f27484d;
                if (dVar2 != null) {
                    dVar2.f111504b.add(lr32);
                } else {
                    T dVar3 = new C41413d();
                    dVar3.f111504b.add(lr32);
                    linkedList.add(dVar3);
                    f0Var.f27484d = dVar3;
                }
            }
        }
        Log.m105924i("Finder.Renderer", "analysisNodes contextList :" + linkedList.size());
        return linkedList;
    }

    /* renamed from: b */
    public C60165e4.C46105a mo23617b() {
        RenderView renderView = this.f111501c;
        int renderState = renderView != null ? renderView.getRenderState() : 1;
        RenderView renderView2 = this.f111501c;
        return new C60165e4.C46105a(renderState, renderView2 != null ? renderView2.getFriendRemarkFlag() : 0);
    }

    /* renamed from: c */
    public ViewGroup mo23618c(C18747a.C18748a aVar, List<? extends C41411b> list, C49308en1 en12) {
        C87412m.m108594g(aVar, "renderParam");
        C87412m.m108594g(list, "contextList");
        C87412m.m108594g(en12, "renderTmpl");
        RenderView renderView = (this.f111502d == null || mo23619d(aVar, list)) ? null : this.f111501c;
        if (renderView != null) {
            Log.m105924i("Finder.Renderer", "renderContext reuseRenderView:" + renderView);
            return renderView;
        }
        try {
            Result.Companion companion = Result.Companion;
            RenderView renderView2 = new RenderView(this.f111499a);
            int i = aVar.f52457a;
            LinkedList<C50301lr3> linkedList = en12.f133024d;
            C87412m.m108593f(linkedList, "renderTmpl.nodes");
            renderView2.mo149645c(i, linkedList);
            this.f111500b = aVar;
            this.f111502d = list;
            this.f111501c = renderView2;
            return renderView2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th));
            C11348f.C11349a.m11178b(C59319a.f169618b, "Finder.RenderView", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            return new FrameLayout(this.f111499a);
        }
    }

    /* renamed from: d */
    public boolean mo23619d(C18747a.C18748a aVar, List<? extends C41411b> list) {
        C13598b0 b0Var;
        C87412m.m108594g(aVar, "renderParam");
        C87412m.m108594g(list, "contextList");
        if (BuildInfo.DEBUG || !C87412m.m108589b(this.f111500b, aVar)) {
            return true;
        }
        C18747a.C18748a aVar2 = this.f111500b;
        if (!(aVar2 != null && aVar2.f52457a == aVar.f52457a)) {
            return true;
        }
        List<? extends C41411b> list2 = this.f111502d;
        if (list2 == null) {
            b0Var = null;
        } else if (list2.size() != list.size()) {
            return true;
        } else {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                if (!((C41411b) list2.get(i)).mo64500a(list.get(i))) {
                    return true;
                }
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            return true;
        }
        Log.m105924i("Finder.Renderer", "isShouldUpdate false");
        return false;
    }
}
