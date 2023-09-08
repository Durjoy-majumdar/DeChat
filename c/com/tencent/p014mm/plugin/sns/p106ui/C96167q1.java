package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sns.ui.q1 */
public class C96167q1 {

    /* renamed from: a */
    public TimeLineObject f280946a;

    /* renamed from: b */
    public WeakReference<View> f280947b;

    /* renamed from: c */
    public String f280948c;

    public C96167q1(TimeLineObject timeLineObject, View view, String str) {
        this.f280946a = timeLineObject;
        this.f280947b = new WeakReference<>(view);
        this.f280948c = str;
    }
}
