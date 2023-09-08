package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView */
public class ExdeviceRankListHeaderView extends RelativeLayout {

    /* renamed from: d */
    public Context f52437d;

    /* renamed from: e */
    public TextView f52438e;

    /* renamed from: f */
    public View.OnClickListener f52439f;

    /* renamed from: g */
    public Animation f52440g;

    /* renamed from: h */
    public Animation f52441h;

    /* renamed from: i */
    public Runnable f52442i;

    /* renamed from: j */
    public boolean f52443j;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView$a */
    public class C18735a implements View.OnClickListener {
        public C18735a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceRankListHeaderView exdeviceRankListHeaderView = ExdeviceRankListHeaderView.this;
            if (exdeviceRankListHeaderView.f52443j) {
                MMHandlerThread.removeRunnable(exdeviceRankListHeaderView.f52442i);
                if (exdeviceRankListHeaderView.f52438e.getVisibility() == 4) {
                    exdeviceRankListHeaderView.f52440g.reset();
                    exdeviceRankListHeaderView.f52438e.startAnimation(exdeviceRankListHeaderView.f52440g);
                } else {
                    exdeviceRankListHeaderView.f52441h.reset();
                    exdeviceRankListHeaderView.f52438e.startAnimation(exdeviceRankListHeaderView.f52441h);
                }
            }
            ExdeviceRankListHeaderView exdeviceRankListHeaderView2 = ExdeviceRankListHeaderView.this;
            View.OnClickListener onClickListener = exdeviceRankListHeaderView2.f52439f;
            if (onClickListener != null) {
                onClickListener.onClick(exdeviceRankListHeaderView2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ExdeviceRankListHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f52443j = true;
        mo23596a(context);
    }

    /* renamed from: a */
    public final void mo23596a(Context context) {
        this.f52437d = context;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(C0966R.C0971layout.a4y, this, true).findViewById(C0966R.C0970id.az8);
        this.f52438e = textView;
        textView.setVisibility(4);
        this.f52440g = AnimationUtils.loadAnimation(this.f52437d, C0966R.C0968anim.f2318a);
        this.f52441h = AnimationUtils.loadAnimation(this.f52437d, C0966R.C0968anim.f2319b);
        this.f52442i = new C18743g1(this);
        this.f52440g.setAnimationListener(new C18744h1(this));
        this.f52441h.setAnimationListener(new C18745i1(this));
        this.f52440g.setFillAfter(true);
        this.f52440g.setFillEnabled(true);
        this.f52441h.setFillAfter(true);
        this.f52441h.setFillAfter(true);
        setOnClickListener(new C18735a());
    }

    public String getMotto() {
        return Util.nullAs(this.f52438e.getText().toString(), "");
    }

    public void setIsShowTip(boolean z) {
        this.f52443j = z;
    }

    public void setMotto(String str) {
        this.f52438e.setText(str);
    }

    public void setOnViewClickListener(View.OnClickListener onClickListener) {
        this.f52439f = onClickListener;
    }

    public ExdeviceRankListHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ExdeviceRankListHeaderView(Context context) {
        super(context);
        this.f52443j = true;
        mo23596a(context);
    }
}
