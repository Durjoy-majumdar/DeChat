package com.tencent.p014mm.plugin.appbrand.keylogger.stepview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.keylogger.stepview.VerticalStepViewIndicator;
import java.util.List;
import p385u2.C111105a;
import vo0.C78459b;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView */
public class VerticalStepView extends LinearLayout implements VerticalStepViewIndicator.C68624a {

    /* renamed from: d */
    public RelativeLayout f197109d;

    /* renamed from: e */
    public VerticalStepViewIndicator f197110e;

    /* renamed from: f */
    public List<C78459b> f197111f;

    /* renamed from: g */
    public int f197112g;

    /* renamed from: h */
    public int f197113h;

    /* renamed from: i */
    public int f197114i;

    /* renamed from: j */
    public TextView f197115j;

    public VerticalStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo94304a() {
        RelativeLayout relativeLayout = this.f197109d;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            List<Float> circleCenterPointPositionList = this.f197110e.getCircleCenterPointPositionList();
            if (this.f197111f != null && circleCenterPointPositionList != null && circleCenterPointPositionList.size() > 0) {
                for (int i = 0; i < this.f197111f.size(); i++) {
                    TextView textView = new TextView(getContext());
                    this.f197115j = textView;
                    textView.setTextSize(2, (float) this.f197114i);
                    this.f197115j.setText(this.f197111f.get(i).f229871a);
                    this.f197115j.setY(circleCenterPointPositionList.get(i).floatValue() - (this.f197110e.getCircleRadius() / 2.0f));
                    this.f197115j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    if (i <= 0) {
                        this.f197115j.setTypeface((Typeface) null, 1);
                        this.f197115j.setTextColor(this.f197113h);
                    } else {
                        this.f197115j.setTextColor(this.f197112g);
                    }
                    this.f197109d.addView(this.f197115j);
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public VerticalStepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197112g = C111105a.m151500b(getContext(), C0966R.color.ahs);
        this.f197113h = C111105a.m151500b(getContext(), 17170443);
        this.f197114i = 14;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ciu, this);
        VerticalStepViewIndicator verticalStepViewIndicator = (VerticalStepViewIndicator) inflate.findViewById(C0966R.C0970id.k1s);
        this.f197110e = verticalStepViewIndicator;
        verticalStepViewIndicator.setOnDrawListener(this);
        this.f197109d = (RelativeLayout) inflate.findViewById(C0966R.C0970id.ivf);
    }
}
