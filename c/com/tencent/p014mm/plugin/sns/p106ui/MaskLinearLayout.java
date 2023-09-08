package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.sns.ui.MaskLinearLayout */
public class MaskLinearLayout extends LinearLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f276965h = 0;

    /* renamed from: d */
    public MMHandler f276966d;

    /* renamed from: e */
    public Runnable f276967e;

    /* renamed from: f */
    public boolean f276968f = false;

    /* renamed from: g */
    public List<MaskImageView> f276969g = new LinkedList();

    public MaskLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f276966d = new MMHandler();
        this.f276967e = new C96079n1(this);
        super.setOnTouchListener(new C96096o1(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    /* renamed from: a */
    public static void m121556a(MaskLinearLayout maskLinearLayout) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        maskLinearLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (maskLinearLayout.isPressed()) {
            maskLinearLayout.setBackgroundColor(maskLinearLayout.getResources().getColor(C0966R.color.FG_3));
        } else {
            maskLinearLayout.setBackgroundResource(0);
        }
        SnsMethodCalculate.markEndTimeMs("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    /* renamed from: b */
    public void mo132235b(MaskImageView maskImageView) {
        SnsMethodCalculate.markStartTimeMs("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        ((LinkedList) this.f276969g).add(maskImageView);
        SnsMethodCalculate.markEndTimeMs("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        super.onDraw(canvas);
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    @Deprecated
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        Assert.assertTrue(false);
        SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public void settouchEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f276968f = z;
        SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }
}
