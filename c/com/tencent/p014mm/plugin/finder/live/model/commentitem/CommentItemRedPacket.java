package com.tencent.p014mm.plugin.finder.live.model.commentitem;

import ak1.C0074h0;
import ak1.C54090i0;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import p204mr.C61568m;
import rx3.C13598b0;
import te3.C51790w61;
import yg1.C15999b;

/* renamed from: com.tencent.mm.plugin.finder.live.model.commentitem.CommentItemRedPacket */
public abstract class CommentItemRedPacket extends C15999b {

    /* renamed from: i */
    public final C45795b f15089i;

    /* renamed from: j */
    public final String f15090j = "CommentItemRedPacket";

    /* renamed from: com.tencent.mm.plugin.finder.live.model.commentitem.CommentItemRedPacket$a */
    public static final class C3157a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CommentItemRedPacket f15091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3157a(CommentItemRedPacket commentItemRedPacket) {
            super(1);
            this.f15091d = commentItemRedPacket;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            this.f15091d.getClass();
            Log.m105924i("Finder.LiveCommentPlugin", "handleRecvLuckyMoneyErr errCode:" + intValue);
            if (intValue == 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null) {
                    bVar.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle);
                }
            } else if (intValue == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
                FinderLiveService.f159376d.getClass();
                C56032b bVar2 = FinderLiveService.f159379g;
                if (bVar2 != null) {
                    bVar2.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentItemRedPacket(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f15089i = bVar;
    }

    /* renamed from: m */
    public final void mo3196m(Context context, String str) {
        String str2;
        T t;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "clickSendId");
        List<C51790w61> list = ((C54991o) this.f15089i.mo71262a(C54991o.class)).f154385x2;
        C87412m.m108593f(list, "liveContext.business(Liv…lass.java).luckyMoneyList");
        Iterator<T> it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Util.isEqual(((C51790w61) t).f143878d, str)) {
                break;
            }
        }
        C51790w61 w612 = (C51790w61) t;
        if (w612 != null) {
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C61568m.C61569a.m72264b((C61568m) c, C54090i0.CLICK_COMMENT_AREA_RED_PACKET_SYS_MSG, TextUtils.isEmpty(w612.f143882h) ? C0074h0.ANCHOR : C0074h0.LINKMIC_VISITOR, false, 0, 12, (Object) null);
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                n5Var.mo75697A((Activity) context, w612, new CommentItemRedPacket$onSpanClick$1$1(this, w612, MMHandler.createFreeHandler(Looper.getMainLooper())), new C3157a(this));
            }
        }
        String str3 = this.f15090j;
        StringBuilder sb = new StringBuilder();
        sb.append("click lucky money item :[");
        sb.append(w612 != null ? w612.f143878d : null);
        sb.append(", ");
        if (w612 != null) {
            str2 = w612.f143883i;
        }
        sb.append(str2);
        sb.append(']');
        Log.m105924i(str3, sb.toString());
    }
}
