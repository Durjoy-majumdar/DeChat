package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView */
public class NoiseDetectMaskView extends RelativeLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f347509i = 0;

    /* renamed from: d */
    public ProgressBar f347510d = null;

    /* renamed from: e */
    public Context f347511e;

    /* renamed from: f */
    public TextView f347512f;

    /* renamed from: g */
    public Button f347513g;

    /* renamed from: h */
    public NoiseDetectMaskView$$b f347514h;

    public NoiseDetectMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347511e = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        LayoutInflater.from(this.f347511e).inflate(C0966R.C0971layout.f359916bl3, this);
        C85875k4.m106191k0(((TextView) findViewById(C0966R.C0970id.f359520lb3)).getPaint());
        this.f347510d = (ProgressBar) findViewById(C0966R.C0970id.hh7);
        this.f347512f = (TextView) findViewById(C0966R.C0970id.hh6);
        Button button = (Button) findViewById(C0966R.C0970id.hh8);
        this.f347513g = button;
        button.setOnClickListener(new NoiseDetectMaskView$$a(this));
    }

    public void setOnClickRetryCallback(NoiseDetectMaskView$$b noiseDetectMaskView$$b) {
        this.f347514h = noiseDetectMaskView$$b;
    }
}
