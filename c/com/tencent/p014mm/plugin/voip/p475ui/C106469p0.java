package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.video.camera.prev.CaptureView;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;

/* renamed from: com.tencent.mm.plugin.voip.ui.p0 */
public class C106469p0 extends BaseSmallView {

    /* renamed from: h */
    public TextView f318013h = ((TextView) findViewById(C0966R.C0970id.ldo));

    /* renamed from: i */
    public ImageView f318014i;

    /* renamed from: j */
    public TextView f318015j = ((TextView) findViewById(C0966R.C0970id.ldp));

    /* renamed from: n */
    public ImageView f318016n = ((ImageView) findViewById(C0966R.C0970id.f359511la3));

    public C106469p0(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cd7, this);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ldn);
        this.f318014i = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_call, Color.parseColor("#07C160")));
    }

    /* renamed from: c */
    public void mo153021c(boolean z) {
        if (z) {
            this.f318013h.setVisibility(8);
            this.f318015j.setVisibility(0);
            this.f318015j.setText(C0966R.string.khu);
            this.f318015j.setContentDescription(getResources().getString(C0966R.string.f361432jv1));
            return;
        }
        super.mo153021c(false);
    }

    /* renamed from: d */
    public boolean mo153022d() {
        super.mo153022d();
        this.f318013h.setVisibility(8);
        this.f318015j.setVisibility(0);
        this.f318015j.setTextColor(Color.parseColor("#FA5151"));
        this.f318015j.setText(C0966R.string.khf);
        this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_call_end, Color.parseColor("#FA5151")));
        setContentDescription("");
        return true;
    }

    /* renamed from: g */
    public void mo153023g() {
        this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_call, Color.parseColor("#07C160")));
        this.f318015j.setVisibility(8);
        this.f318015j.setTextColor(Color.parseColor("#07C160"));
        this.f318013h.setVisibility(0);
    }

    public OpenGlRender getBeautyData() {
        return null;
    }

    public OpenGlRender getSpatioTemporalFilterData() {
        return null;
    }

    /* renamed from: h */
    public void mo153026h() {
        this.f318015j.setVisibility(0);
        this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_filled_mike_off, Color.parseColor("#FA5151")));
        this.f318015j.setTextColor(Color.parseColor("#FA5151"));
        this.f318015j.setText(C0966R.string.kix);
        this.f318013h.setVisibility(8);
        super.mo153026h();
    }

    /* renamed from: l */
    public void mo153027l(String str) {
        this.f318013h.setTextSize(1, 12.0f);
        this.f318013h.setText(str);
        setContentDescription(getContext().getString(C0966R.string.jv4));
    }

    /* renamed from: m */
    public void mo153028m(String str) {
        this.f318013h.setTextSize(1, 14.0f);
        this.f318013h.setText(str);
        setContentDescription(String.format(getContext().getString(C0966R.string.f361433jv2), new Object[]{str}));
    }

    public void onAnimationEnd() {
    }

    public void setCaptureView(CaptureView captureView) {
    }

    public void setVoicePlayDevice(int i) {
        if (this.f318160e != i) {
            this.f318160e = i;
            this.f318015j.setVisibility(0);
            if (i == 1) {
                this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_volume_up, Color.parseColor("#07C160")));
                this.f318015j.setText(C0966R.string.khe);
            } else if (i == 2) {
                this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_ear, Color.parseColor("#07C160")));
                this.f318015j.setText(C0966R.string.khc);
            } else if (i == 3) {
                this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_headset, Color.parseColor("#07C160")));
                this.f318015j.setText(C0966R.string.khd);
            } else if (i == 4) {
                this.f318014i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_bluetooth, Color.parseColor("#07C160")));
                this.f318015j.setText(C0966R.string.khb);
            }
            this.f318013h.setVisibility(8);
            super.setVoicePlayDevice(i);
        }
    }
}
