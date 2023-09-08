package nt2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;

/* renamed from: nt2.c */
public abstract class C100165c {

    /* renamed from: d */
    public TimeLineObject f293411d;

    /* renamed from: e */
    public SnsInfo f293412e;

    /* renamed from: f */
    public View f293413f;

    /* renamed from: g */
    public View f293414g;

    /* renamed from: h */
    public C96066m2 f293415h;

    /* renamed from: i */
    public View f293416i;

    /* renamed from: j */
    public View f293417j;

    /* renamed from: n */
    public TimelineClickListener f293418n;

    /* renamed from: a */
    public abstract void mo139451a(View view, View view2);

    /* renamed from: b */
    public void mo139452b() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    /* renamed from: e */
    public void mo139453e() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.BaseAdDetailItem");
    }

    /* renamed from: g */
    public abstract void mo139454g();
}
