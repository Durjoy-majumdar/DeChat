package zt2;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.SnsClickUnreadBtnEvent;
import com.tencent.p014mm.autogen.events.SnsScrollEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnClickActionStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadTierView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import os2.C100400e0;
import sx3.C110818d0;
import sx3.C64197v;
import vr2.C102236a0;
import z04.C112550d0;

/* renamed from: zt2.b */
public final class C103076b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f304132d;

    /* renamed from: e */
    public final /* synthetic */ int f304133e;

    /* renamed from: f */
    public final /* synthetic */ ImproveUnreadTierView f304134f;

    /* renamed from: g */
    public final /* synthetic */ C98214b f304135g;

    public C103076b(int i, int i2, ImproveUnreadTierView improveUnreadTierView, C98214b bVar) {
        this.f304132d = i;
        this.f304133e = i2;
        this.f304134f = improveUnreadTierView;
        this.f304135g = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2");
        int i = this.f304132d - this.f304133e;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f304134f.getContext();
        C87412m.m108593f(context, "context");
        ImproveUnreadUIC improveUnreadUIC = (ImproveUnreadUIC) rVar.mo62443b(context).mo75002a(ImproveUnreadUIC.class);
        C98214b bVar = this.f304135g;
        improveUnreadUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C87412m.m108594g(bVar, "info");
        SnsMethodCalculate.markStartTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C103081h hVar = improveUnreadUIC.f279765h;
        if (hVar == null) {
            SnsMethodCalculate.markEndTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        } else {
            TimelineMissReadJumpBtnClickActionStruct timelineMissReadJumpBtnClickActionStruct = new TimelineMissReadJumpBtnClickActionStruct();
            timelineMissReadJumpBtnClickActionStruct.f266398d = timelineMissReadJumpBtnClickActionStruct.mo86045b("SessionId", ((C59774i) C86312j.m106911c(C59774i.class)).hm0(), true);
            timelineMissReadJumpBtnClickActionStruct.f266399e = (long) (bVar.getCreateTime() + 1);
            timelineMissReadJumpBtnClickActionStruct.f266400f = C102236a0.m134706B0((String) C110818d0.m150914L(hVar.mo142795a()));
            timelineMissReadJumpBtnClickActionStruct.f266401g = 1;
            timelineMissReadJumpBtnClickActionStruct.f266402h = (long) i;
            timelineMissReadJumpBtnClickActionStruct.f266405k = timelineMissReadJumpBtnClickActionStruct.mo86045b("JumpBreakLayerExposureFeeds", "", true);
            C100400e0 Yx0 = C94866e1.Yx0();
            SnsInfo bO = Yx0 != null ? Yx0.mo139816bO((String) C110818d0.m150914L(hVar.mo142795a())) : null;
            if (bO != null) {
                timelineMissReadJumpBtnClickActionStruct.f266407m = System.currentTimeMillis() - ((long) bO.getCreateTime());
            }
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = hVar.mo142795a().iterator();
            int i2 = 0;
            while (true) {
                String str = "|";
                if (it.hasNext()) {
                    T next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        sb.append((String) next);
                        sb.append(str);
                        if (i2 != 0 && (i2 % 50 == 0 || i2 == improveUnreadUIC.f279768n.size() - 1)) {
                            arrayList2.add(sb.toString());
                            sb.setLength(0);
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                } else {
                    timelineMissReadJumpBtnClickActionStruct.f266408n = System.currentTimeMillis();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        timelineMissReadJumpBtnClickActionStruct.f266403i = timelineMissReadJumpBtnClickActionStruct.mo86045b("JumpBreakLayerFeeds", (String) arrayList2.get(i4), true);
                        Object obj = arrayList2.get(i4);
                        C87412m.m108593f(obj, "feedStrList[index]");
                        timelineMissReadJumpBtnClickActionStruct.f266404j = (long) (C112550d0.m153785U((CharSequence) obj, new String[]{str}, false, 0, 6, (Object) null).size() - 1);
                        timelineMissReadJumpBtnClickActionStruct.f266409o = (long) i4;
                        timelineMissReadJumpBtnClickActionStruct.f266410p = (long) size;
                        timelineMissReadJumpBtnClickActionStruct.mo86054n();
                        i4++;
                        str = str;
                    }
                    SnsMethodCalculate.markEndTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                }
            }
        }
        improveUnreadUIC.f279765h = null;
        SnsMethodCalculate.markEndTimeMs("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        new SnsClickUnreadBtnEvent().publish();
        SnsScrollEvent snsScrollEvent = new SnsScrollEvent();
        SnsScrollEvent.C92592a aVar = snsScrollEvent.f265195d;
        ImproveUnreadTierView improveUnreadTierView = this.f304134f;
        SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        C60905o oVar = improveUnreadTierView.f279754g;
        SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        aVar.f265196a = (oVar != null ? oVar.mo17363j() : 0) + i;
        snsScrollEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
