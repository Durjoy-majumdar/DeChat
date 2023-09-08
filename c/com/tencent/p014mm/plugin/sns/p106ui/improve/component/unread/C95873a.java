package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zt2.C103080g;
import zt2.C103081h;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.a */
public final class C95873a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ ImproveUnreadUIC f279804d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95873a(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95873a> dVar) {
        super(2, dVar);
        this.f279804d = improveUnreadUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        C95873a aVar = new C95873a(this.f279804d, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        Object invokeSuspend = ((C95873a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList<String> a;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        ResultKt.throwOnFailure(obj);
        ImproveUnreadUIC improveUnreadUIC = this.f279804d;
        improveUnreadUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C103081h hVar = improveUnreadUIC.f279765h;
        SnsMethodCalculate.markEndTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (!(hVar == null || (a = hVar.mo142795a()) == null)) {
            ImproveUnreadUIC improveUnreadUIC2 = this.f279804d;
            for (String str : a) {
                C103080g gVar = (C103080g) ImproveUnreadUIC.m122724c3(improveUnreadUIC2).get(str);
                if (gVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                    gVar.f304143a = true;
                    SnsMethodCalculate.markEndTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                }
            }
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return b0Var;
    }
}
