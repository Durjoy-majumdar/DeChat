package com.tencent.p014mm.plugin.brandservice.p028ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCommonVideoView */
public class MPCommonVideoView extends CommonVideoView {

    /* renamed from: U */
    public static final /* synthetic */ int f267719U = 0;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCommonVideoView$a */
    public class C92954a implements Runnable {
        public C92954a() {
        }

        public void run() {
            MPCommonVideoView mPCommonVideoView = MPCommonVideoView.this;
            int i = MPCommonVideoView.f267719U;
            C96875r0 r0Var = mPCommonVideoView.f283595q;
            if (r0Var != null) {
                r0Var.setOneTimeVideoTextureUpdateCallback(mPCommonVideoView);
            }
        }
    }

    public MPCommonVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: S */
    public void mo127367S(long j) {
        super.mo127367S(j);
        this.f283600v.postDelayed(new C92954a(), j);
    }

    public MPCommonVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
