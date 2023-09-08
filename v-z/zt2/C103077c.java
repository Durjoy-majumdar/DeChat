package zt2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.SnsUnreadSaveItem;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.SnsUnreadSaveList;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: zt2.c */
public final class C103077c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ ImproveUnreadUIC f304136d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103077c(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C103077c> dVar) {
        super(2, dVar);
        this.f304136d = improveUnreadUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        C103077c cVar = new C103077c(this.f304136d, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        Object invokeSuspend = ((C103077c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        ResultKt.throwOnFailure(obj);
        ImproveUnreadUIC improveUnreadUIC = this.f304136d;
        SnsMethodCalculate.markStartTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        MultiProcessMMKV multiProcessMMKV = improveUnreadUIC.f279761d;
        SnsMethodCalculate.markEndTimeMs("access$getMmkv$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        SnsUnreadSaveList snsUnreadSaveList = (SnsUnreadSaveList) multiProcessMMKV.decodeParcelable("Key-Unread-Sns-Id", SnsUnreadSaveList.class);
        if (snsUnreadSaveList != null) {
            SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            ArrayList<SnsUnreadSaveItem> arrayList = snsUnreadSaveList.f279803d;
            SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            if (arrayList != null) {
                ImproveUnreadUIC improveUnreadUIC2 = this.f304136d;
                for (SnsUnreadSaveItem snsUnreadSaveItem : arrayList) {
                    C103082i c3 = ImproveUnreadUIC.m122724c3(improveUnreadUIC2);
                    snsUnreadSaveItem.getClass();
                    SnsMethodCalculate.markStartTimeMs("getFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    String str = snsUnreadSaveItem.f279800d;
                    SnsMethodCalculate.markEndTimeMs("getFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    SnsMethodCalculate.markStartTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    boolean z = snsUnreadSaveItem.f279801e;
                    SnsMethodCalculate.markEndTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    boolean z2 = snsUnreadSaveItem.f279802f;
                    SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                    c3.put(str, new C103080g(z, z2, (C98214b) null, 4, (C8480h) null));
                }
            }
        }
        if (!ImproveUnreadUIC.m122724c3(this.f304136d).isEmpty()) {
            Object firstKey = ImproveUnreadUIC.m122724c3(this.f304136d).firstKey();
            C87412m.m108593f(firstKey, "feedMap.firstKey()");
            String str2 = (String) firstKey;
            SnsMethodCalculate.markStartTimeMs("access$setRptPageInFeedId$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            SnsMethodCalculate.markEndTimeMs("access$setRptPageInFeedId$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        }
        Log.m105924i("MicroMsg.Improve.UnreadUIC", "unread restoreData:" + ImproveUnreadUIC.m122724c3(this.f304136d).size());
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$restoreData$1");
        return b0Var;
    }
}
