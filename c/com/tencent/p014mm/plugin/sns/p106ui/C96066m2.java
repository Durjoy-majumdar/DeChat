package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;

/* renamed from: com.tencent.mm.plugin.sns.ui.m2 */
public class C96066m2 {

    /* renamed from: a */
    public TimeLineObject f280498a;

    /* renamed from: b */
    public String f280499b;

    /* renamed from: c */
    public int f280500c;

    /* renamed from: d */
    public View f280501d;

    /* renamed from: e */
    public VideoSightView f280502e;

    /* renamed from: f */
    public ImageView f280503f;

    /* renamed from: g */
    public SnsAdTimelineVideoView f280504g;

    /* renamed from: h */
    public View f280505h;

    /* renamed from: i */
    public ImageView f280506i;

    /* renamed from: j */
    public MMPinProgressBtn f280507j;

    /* renamed from: k */
    public TextView f280508k;

    /* renamed from: l */
    public TextView f280509l;

    /* renamed from: m */
    public ImageView f280510m;

    /* renamed from: n */
    public boolean f280511n = false;

    /* renamed from: o */
    public int f280512o = 2;

    /* renamed from: p */
    public boolean f280513p = false;

    /* renamed from: q */
    public int f280514q = 0;

    /* renamed from: a */
    public void mo133598a(TimeLineObject timeLineObject, int i, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("bindObj", "com.tencent.mm.plugin.sns.ui.SightViewTag");
        this.f280498a = timeLineObject;
        this.f280500c = i;
        this.f280499b = str;
        this.f280511n = z;
        SnsMethodCalculate.markEndTimeMs("bindObj", "com.tencent.mm.plugin.sns.ui.SightViewTag");
    }
}
