package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsMethodReportStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.MVImproveTimelineItem;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveRepostView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eu2.C58804a;
import eu2.C58818d;
import eu2.C58824f;
import eu2.C58831w;
import eu2.C97709g;
import eu2.C97739t;
import eu2.C97742u;
import eu2.C97744v;
import eu2.C97746y;
import ft2.C97979c;
import ft2.C97980e;
import ft2.c$$e;
import gu2.C98214b;
import gy3.C87412m;
import hu2.C98534b;
import iu2.C98799a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import ju2.C99042b;
import kotlin.Metadata;
import l31.C61212e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$buildItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1 */
public final class ImproveMainUIC$buildItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ ImproveMainUIC this$0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$a */
    public static final class C95839a extends C60896i<C98799a> {

        /* renamed from: e */
        public final /* synthetic */ int f279708e;

        /* renamed from: f */
        public final /* synthetic */ ImproveMainUIC f279709f;

        public C95839a(int i, ImproveMainUIC improveMainUIC) {
            this.f279708e = i;
            this.f279709f = improveMainUIC;
        }

        /* renamed from: a */
        public View mo13760a(RecyclerView recyclerView) {
            View view;
            SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            C87412m.m108594g(recyclerView, "recyclerView");
            long currentTimeMillis = System.currentTimeMillis();
            int i = this.f279708e;
            if (i != 100) {
                switch (i) {
                    case 0:
                        view = new C97744v(this.f279709f.getContext());
                        break;
                    case 1:
                        view = new C97739t(this.f279709f.getContext());
                        break;
                    case 2:
                        view = new C58831w(this.f279709f.getContext());
                        break;
                    case 3:
                        view = new C97746y(this.f279709f.getContext());
                        break;
                    case 4:
                        view = new C97742u(this.f279709f.getContext());
                        break;
                    case 5:
                        view = new C58818d(this.f279709f.getContext());
                        break;
                    case 6:
                        view = new C58804a(this.f279709f.getContext());
                        break;
                    case 7:
                        view = new C58824f(this.f279709f.getContext());
                        break;
                    case 8:
                        view = new MVImproveTimelineItem(this.f279709f.getContext());
                        break;
                    default:
                        view = new OldVersionItemView(this.f279709f.getContext());
                        break;
                }
            } else {
                view = new ImproveRepostView(this.f279709f.getContext());
            }
            C98534b bVar = C98534b.f288944a;
            int hashCode = view.hashCode();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            SnsMethodCalculate.markStartTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            bVar.mo137890a(hashCode);
            SnsMethodReportStruct snsMethodReportStruct = C98534b.f288945b.get(Integer.valueOf(hashCode));
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f266076f = (int) currentTimeMillis2;
            }
            SnsMethodCalculate.markEndTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            return view;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C60905o oVar2 = oVar;
            SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            C98799a aVar = (C98799a) cVar;
            SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(aVar, "item");
            if (oVar2.f44854d instanceof C97709g) {
                ImproveMainUIC improveMainUIC = this.f279709f;
                SnsMethodCalculate.markStartTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                boolean l3 = improveMainUIC.mo133302l3();
                SnsMethodCalculate.markEndTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                if (!l3) {
                    ImproveMainUIC improveMainUIC2 = this.f279709f;
                    View view = oVar2.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    improveMainUIC2.getClass();
                    SnsMethodCalculate.markStartTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                    C98214b b = aVar.mo138170b();
                    try {
                        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                        C13604l[] lVarArr = new C13604l[12];
                        lVarArr[0] = new C13604l("sns_feed_id", b.mo137504B2());
                        String userName = b.getUserName();
                        String str = "";
                        if (userName == null) {
                            userName = str;
                        }
                        lVarArr[1] = new C13604l("sns_feed_username", userName);
                        TimeLineObject G2 = b.mo137509G2();
                        String str2 = G2 != null ? G2.UserName : null;
                        if (str2 == null) {
                            str2 = str;
                        }
                        lVarArr[2] = new C13604l("sns_feed_share_name", str2);
                        String x2 = b.mo137524x2();
                        if (x2 != null) {
                            str = x2;
                        }
                        lVarArr[3] = new C13604l("sns_nick_name", str);
                        lVarArr[4] = new C13604l("sns_feed_is_ad", Integer.valueOf(b.isAd() ? 1 : 0));
                        lVarArr[5] = new C13604l("sns_feed_screen_height", Integer.valueOf(improveMainUIC2.getScreenHeight()));
                        lVarArr[6] = new C13604l("sns_feed_virtual_key_height", Integer.valueOf(improveMainUIC2.getNavigationBarHeight()));
                        lVarArr[7] = new C13604l("sns_feed_status_bar_height", Integer.valueOf(improveMainUIC2.getStatusBarHeight()));
                        lVarArr[8] = new C13604l("sns_feed_action_bar_height", Integer.valueOf(improveMainUIC2.getActionBarHeight()));
                        lVarArr[9] = new C13604l("sns_feed_position", Integer.valueOf(i));
                        lVarArr[10] = new C13604l("sns_feed_like_count", Integer.valueOf(b.mo137525y2().mo138165b()));
                        lVarArr[11] = new C13604l("sns_feed_comment_count", Integer.valueOf(b.getCommentList().size()));
                        eVar.mo86149PM(view, C90364q0.m113147f(lVarArr));
                    } catch (Exception unused) {
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    SnsMethodCalculate.markEndTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                    View view2 = oVar2.f44854d;
                    C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
                    C97709g gVar = (C97709g) view2;
                    int i3 = i + 1;
                    boolean f = gVar.mo133278f(oVar2, aVar, i3);
                    ImproveMainUIC improveMainUIC3 = this.f279709f;
                    SnsMethodCalculate.markStartTimeMs("access$getImproveLeak$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                    C99042b bVar = improveMainUIC3.f279679j;
                    SnsMethodCalculate.markEndTimeMs("access$getImproveLeak$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                    bVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedLeakManager");
                    boolean contains = bVar.f290341a.contains(gVar);
                    bVar.f290341a.add(gVar);
                    Log.m105924i("MicroMsg.Improve.ImproveFeedLeakManager", bVar.hashCode() + " onBindViewHolder item:" + gVar.hashCode() + ", hadExist=" + contains + ", now count=" + bVar.f290341a.size());
                    Iterator<C97709g> it = bVar.f290341a.iterator();
                    while (it.hasNext()) {
                        it.next().mo133277d();
                    }
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedLeakManager");
                    C53895h.m60466d(this.f279709f.getMainScope(), (C66212f) null, (C53934p0) null, new C95840b(this.f279709f, gVar, oVar, aVar, i3, f, (C15601d<? super C95840b>) null), 3, (Object) null);
                    SnsInfo C2 = aVar.mo138170b().mo137505C2();
                    HashMap<Long, c$$e> hashMap = C97979c.f287345j;
                    SnsMethodCalculate.markStartTimeMs("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                    C94866e1.my0().post(new C97980e(C2));
                    SnsMethodCalculate.markEndTimeMs("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
                }
            }
            Log.m105920e("MicroMsg.Improve.MainUIC", "invalid onBindViewHolder " + oVar2.f44854d);
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        }

        /* renamed from: i */
        public void mo735i(C60905o oVar) {
            SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            C87412m.m108594g(oVar, "holder");
            View view = oVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
            C97709g gVar = (C97709g) view;
            gVar.mo81008h();
            ImproveMainUIC improveMainUIC = this.f279709f;
            SnsMethodCalculate.markStartTimeMs("access$getImproveLeak$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            C99042b bVar = improveMainUIC.f279679j;
            SnsMethodCalculate.markEndTimeMs("access$getImproveLeak$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedLeakManager");
            bVar.f290341a.remove(gVar);
            Log.m105924i("MicroMsg.Improve.ImproveFeedLeakManager", bVar.hashCode() + " onViewRecycled item:" + gVar.hashCode() + ", now count=" + bVar.f290341a.size());
            SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedLeakManager");
            SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        }
    }

    public ImproveMainUIC$buildItemConvertFactory$1(ImproveMainUIC improveMainUIC) {
        this.this$0 = improveMainUIC;
    }

    public C60896i<?> getItemConvert(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1");
        C95839a aVar = new C95839a(i, this.this$0);
        SnsMethodCalculate.markEndTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1");
        return aVar;
    }
}
