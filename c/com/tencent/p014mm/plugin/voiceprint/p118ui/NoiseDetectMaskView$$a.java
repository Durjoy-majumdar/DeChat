package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView$$a */
public final /* synthetic */ class NoiseDetectMaskView$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NoiseDetectMaskView f347515d;

    public /* synthetic */ NoiseDetectMaskView$$a(NoiseDetectMaskView noiseDetectMaskView) {
        this.f347515d = noiseDetectMaskView;
    }

    public final void onClick(View view) {
        NoiseDetectMaskView noiseDetectMaskView = this.f347515d;
        int i = NoiseDetectMaskView.f347509i;
        noiseDetectMaskView.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", noiseDetectMaskView, array);
        NoiseDetectMaskView$$b noiseDetectMaskView$$b = noiseDetectMaskView.f347514h;
        if (noiseDetectMaskView$$b != null) {
            C115669n.INSTANCE.mo160131h(11390, 5);
            VoiceCreateUI voiceCreateUI = ((VoiceCreateUI$$c) noiseDetectMaskView$$b).f347529a;
            int i2 = VoiceCreateUI.f347516E;
            voiceCreateUI.mo176337Q7();
        }
        C117292a.m165361g(noiseDetectMaskView, "com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
