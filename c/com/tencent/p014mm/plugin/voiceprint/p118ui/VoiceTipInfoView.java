package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView */
public class VoiceTipInfoView extends LinearLayout {

    /* renamed from: d */
    public TextView f347553d;

    /* renamed from: e */
    public boolean f347554e = false;

    /* renamed from: f */
    public TextView f347555f;

    /* renamed from: g */
    public TextView f347556g;

    /* renamed from: h */
    public boolean f347557h = false;

    /* renamed from: i */
    public float f347558i = 0.0f;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView$a */
    public class C115834a implements C115843s.C115847c {
        public C115834a() {
        }

        /* renamed from: a */
        public void mo176340a() {
            VoiceTipInfoView.this.f347553d.setVisibility(0);
            VoiceTipInfoView.this.f347554e = false;
        }

        /* renamed from: b */
        public void mo176341b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView$b */
    public class C115835b implements Runnable {
        public C115835b() {
        }

        public void run() {
            VoiceTipInfoView.this.f347556g.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView$c */
    public class C115836c implements C115843s.C115847c {
        public C115836c() {
        }

        /* renamed from: a */
        public void mo176340a() {
            VoiceTipInfoView.this.f347556g.setVisibility(4);
            VoiceTipInfoView.this.f347557h = false;
        }

        /* renamed from: b */
        public void mo176341b() {
        }
    }

    public VoiceTipInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cxc, this, true);
        this.f347553d = (TextView) inflate.findViewById(C0966R.C0970id.f359520lb3);
        this.f347555f = (TextView) inflate.findViewById(C0966R.C0970id.lb5);
        this.f347556g = (TextView) inflate.findViewById(C0966R.C0970id.lb4);
        mo176350b();
    }

    /* renamed from: a */
    public void mo176349a() {
        if (this.f347556g.getVisibility() != 0 || this.f347557h) {
            this.f347556g.clearAnimation();
            this.f347556g.setVisibility(4);
            return;
        }
        this.f347556g.clearAnimation();
        this.f347557h = true;
        C115843s.m162941a(this.f347556g, getContext(), new C115836c());
    }

    /* renamed from: b */
    public void mo176350b() {
        this.f347555f.setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.at5));
        this.f347558i = this.f347555f.getTextSize();
        this.f347555f.clearAnimation();
        Log.m105919d("MicroMsg.VoiceTipInfoView", "mTipSize %f", Float.valueOf(this.f347558i));
    }

    /* renamed from: c */
    public void mo176351c() {
        this.f347556g.animate().alpha(1.0f).setDuration(200).withStartAction(new C115835b()).start();
    }

    /* renamed from: d */
    public void mo176352d() {
        Log.m105919d("MicroMsg.VoiceTipInfoView", "showTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", Integer.valueOf(this.f347553d.getVisibility()), Boolean.valueOf(this.f347554e));
        if ((this.f347553d.getVisibility() == 4 || this.f347553d.getVisibility() == 8) && !this.f347554e) {
            this.f347553d.clearAnimation();
            this.f347554e = true;
            TextView textView = this.f347553d;
            Context context = getContext();
            C115834a aVar = new C115834a();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2393bw);
            loadAnimation.setDuration(300);
            loadAnimation.setFillAfter(true);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setAnimationListener(new C115848t(aVar));
            textView.startAnimation(loadAnimation);
            return;
        }
        Log.m105918d("MicroMsg.VoiceTipInfoView", "showTitle, directly set to VISIBLE");
        this.f347553d.clearAnimation();
        this.f347553d.setVisibility(0);
        this.f347553d.invalidate();
    }

    public void setErr(String str) {
        this.f347556g.setText(str);
    }

    public void setTipText(String str) {
        this.f347555f.setText(str);
        this.f347555f.setVisibility(0);
    }

    public void setTitleText(String str) {
        this.f347553d.setText(str);
        this.f347553d.setVisibility(0);
    }

    public void setErr(int i) {
        this.f347556g.setText(i);
    }

    public void setTipText(int i) {
        this.f347555f.setText(i);
        this.f347555f.setVisibility(0);
    }

    public void setTitleText(int i) {
        this.f347553d.setText(i);
        this.f347553d.setVisibility(0);
    }
}
