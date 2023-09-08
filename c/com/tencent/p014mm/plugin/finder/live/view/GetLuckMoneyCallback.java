package com.tencent.p014mm.plugin.finder.live.view;

import android.app.Activity;
import android.os.Looper;
import cj1.C54795n5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import dj1.C45369j0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C51763w01;
import te3.C51790w61;

/* renamed from: com.tencent.mm.plugin.finder.live.view.GetLuckMoneyCallback */
public final class GetLuckMoneyCallback implements C45369j0.C45370a {

    /* renamed from: a */
    public final WeakReference<C56032b> f159834a;

    /* renamed from: b */
    public final WeakReference<Activity> f159835b;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.GetLuckMoneyCallback$a */
    public static final class C56030a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56030a(C56032b bVar) {
            super(1);
            this.f159836d = bVar;
        }

        public Object invoke(Object obj) {
            this.f159836d.handleRecvLuckyMoneyErr(((Number) obj).intValue());
            return C13598b0.f38549a;
        }
    }

    public GetLuckMoneyCallback(WeakReference<C56032b> weakReference, WeakReference<Activity> weakReference2) {
        this.f159834a = weakReference;
        this.f159835b = weakReference2;
    }

    /* renamed from: a */
    public void mo70891a(int i, int i2, String str, C51763w01 w012) {
        C54795n5 finderLiveAssistant;
        C87412m.m108594g(w012, "resp");
        WeakReference<C56032b> weakReference = this.f159834a;
        LinkedList<C51790w61> linkedList = null;
        C56032b bVar = weakReference != null ? weakReference.get() : null;
        WeakReference<Activity> weakReference2 = this.f159835b;
        Activity activity = weakReference2 != null ? weakReference2.get() : null;
        if (bVar != null && activity != null) {
            C56032b.Companion.getClass();
            String access$getTAG$cp = C56032b.TAG;
            Log.m105924i(access$getTAG$cp, "[goGetLuckMoney] errType:" + i + "  errCode:" + i2 + ' ');
            if (i2 == 0 && i == 0) {
                LinkedList<C51790w61> linkedList2 = w012.f143794d;
                if (true ^ (linkedList2 == null || linkedList2.isEmpty())) {
                    linkedList = linkedList2;
                }
                if (linkedList != null && (finderLiveAssistant = bVar.getFinderLiveAssistant()) != null) {
                    C51790w61 w612 = linkedList.get(0);
                    C87412m.m108593f(w612, "it[0]");
                    finderLiveAssistant.mo75697A(activity, w612, new GetLuckMoneyCallback$onCgiBack$1$2$1(bVar, linkedList, MMHandler.createFreeHandler(Looper.getMainLooper())), new C56030a(bVar));
                }
            }
        }
    }
}
