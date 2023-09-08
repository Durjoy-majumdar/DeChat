package zt2;

import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {322}, mo125471m = "updateUnReadList")
/* renamed from: zt2.e */
public final class C103079e extends C66704d {

    /* renamed from: d */
    public Object f304138d;

    /* renamed from: e */
    public Object f304139e;

    /* renamed from: f */
    public /* synthetic */ Object f304140f;

    /* renamed from: g */
    public final /* synthetic */ ImproveUnreadUIC f304141g;

    /* renamed from: h */
    public int f304142h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103079e(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C103079e> dVar) {
        super(dVar);
        this.f304141g = improveUnreadUIC;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$updateUnReadList$1");
        this.f304140f = obj;
        this.f304142h |= Integer.MIN_VALUE;
        Object e3 = ImproveUnreadUIC.m122726e3(this.f304141g, (LinkedList) null, this);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$updateUnReadList$1");
        return e3;
    }
}
