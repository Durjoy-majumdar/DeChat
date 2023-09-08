package xm1;

import ak1.C54067f0;
import ak1.C54108o;
import an1.C0101n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bn1.C0331b;
import c30.C104289g;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import ln1.C10584f;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49114d91;
import te3.C64273c21;
import ym1.C16052a;
import z04.C112551y;

/* renamed from: xm1.o */
public final class C15844o implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42668d;

    public C15844o(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback) {
        this.f42668d = liveEntranceFragmentViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C39818r rVar;
        String str;
        String str2;
        String num;
        C49114d91 d912;
        C49098d51 d512;
        FinderItem o;
        C64273c21 liveInfo;
        RecyclerView.C16613e eVar2 = eVar;
        int i2 = i;
        Class cls = C10584f.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        int c6 = ((WxRecyclerAdapter) eVar2).mo85796c6();
        if (i2 >= c6) {
            int i3 = i2 - c6;
            C0740i2 i2Var = this.f42668d.f15710i.get(i3);
            C87412m.m108593f(i2Var, "feedDataList[pos]");
            C0740i2 i2Var2 = i2Var;
            LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42668d;
            String str3 = liveEntranceFragmentViewCallback.f15705d.f134672f;
            String str4 = str3 == null ? "" : str3;
            C16052a aVar = liveEntranceFragmentViewCallback.f15719r;
            ArrayList<C0740i2> arrayList = liveEntranceFragmentViewCallback.f15710i;
            RecyclerView recyclerView = liveEntranceFragmentViewCallback.f15709h;
            C87412m.m108591d(recyclerView);
            Bundle bundle = new Bundle();
            bundle.putString("main_page_position", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            bundle.putInt("card_index", i3);
            C39818r rVar2 = C39818r.f106831a;
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C10584f fVar = (C10584f) rVar2.mo62443b(context).mo75002a(cls);
            String str5 = "main_page_position";
            String str6 = "card_index";
            if (fVar != null) {
                String str7 = "pull_liveid";
                if (fVar.f31930o != 0) {
                    String str8 = fVar.f31931p;
                    if (!(str8 == null || str8.length() == 0)) {
                        rVar = rVar2;
                        str = str7;
                        bundle.putLong(str, fVar.f31930o);
                        bundle.putString("pull_commentsence", fVar.f31931p);
                    }
                }
                rVar = rVar2;
                str = str7;
            } else {
                rVar = rVar2;
                str = "pull_liveid";
            }
            C13598b0 b0Var = C13598b0.f38549a;
            String str9 = "pull_commentsence";
            String str10 = str6;
            String str11 = str5;
            String str12 = str;
            int i4 = i3;
            C0740i2 i2Var3 = i2Var2;
            C16052a.m14952f(aVar, i2Var2, i, i3, view, arrayList, str4, recyclerView, 3, bundle, (C0740i2) null, 512, (Object) null);
            LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback2 = this.f42668d;
            liveEntranceFragmentViewCallback2.getClass();
            C39818r rVar3 = rVar;
            C39622i0 a = rVar3.mo62444c(liveEntranceFragmentViewCallback2.f15702a).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(context).…eReporterUIC::class.java)");
            C10584f fVar2 = (C10584f) a;
            boolean z = i2Var3 instanceof C0331b;
            if (z || (i2Var3 instanceof C0101n)) {
                C104289g gVar = new C104289g();
                boolean z2 = i2Var3 instanceof C0101n;
                int i5 = z2 ? 2 : 1;
                gVar.mo145967r("page_index", Integer.valueOf(fVar2.f31924f));
                gVar.mo145967r("card_type", Integer.valueOf(i5));
                gVar.mo145967r(str10, String.valueOf(i4));
                C0331b bVar = null;
                C0331b bVar2 = z ? (C0331b) i2Var3 : null;
                gVar.mo145967r("liveid", (bVar2 == null || (o = bVar2.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? "" : Long.valueOf(liveInfo.f182392d));
                C0101n nVar = z2 ? (C0101n) i2Var3 : null;
                if (nVar == null || (d912 = nVar.f541d) == null || (d512 = d912.f132196d) == null || (str2 = d512.f132122h) == null) {
                    str2 = "";
                }
                gVar.mo145967r("Noticeid", str2);
                String str13 = liveEntranceFragmentViewCallback2.f15705d.f134671e;
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                fVar2.mo10842d3(str13, "main_page_recmd_card", C112551y.m153814n(gVar2, ",", ";", false));
                C104289g gVar3 = new C104289g();
                gVar3.mo145967r(str11, 4);
                if (fVar2.f31930o != 0) {
                    String str14 = fVar2.f31931p;
                    if (!(str14 == null || str14.length() == 0)) {
                        gVar3.mo145967r(str12, Long.valueOf(fVar2.f31930o));
                        gVar3.mo145967r(str9, fVar2.f31931p);
                    }
                }
                C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
                if (z) {
                    bVar = (C0331b) i2Var3;
                }
                C0331b bVar3 = bVar;
                long j = (long) i4;
                C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM;
                C13442s8 s8Var = (C13442s8) rVar3.mo62444c(liveEntranceFragmentViewCallback2.f15702a).mo75002a(C13442s8.class);
                String str15 = (s8Var == null || (num = Integer.valueOf(s8Var.f38096i).toString()) == null) ? "" : num;
                String gVar4 = gVar3.toString();
                C87412m.m108593f(gVar4, "chnlExtra.toString()");
                oVar.mo9607Uk(bVar3, j, qVar, str15, "", "", gVar4);
            }
        }
    }
}
