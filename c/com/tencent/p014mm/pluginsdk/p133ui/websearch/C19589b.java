package com.tencent.p014mm.pluginsdk.p133ui.websearch;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fo3.C116890a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.websearch.b */
public class C19589b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebSearchVoiceInputPanel f55441d;

    public C19589b(WebSearchVoiceInputPanel webSearchVoiceInputPanel) {
        this.f55441d = webSearchVoiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WebSearchVoiceInputPanel webSearchVoiceInputPanel = this.f55441d;
        int i = WebSearchVoiceInputPanel.f55407I;
        webSearchVoiceInputPanel.getClass();
        Log.m105918d("MicroMsg.VoiceInputPanel", "closePanel");
        if (webSearchVoiceInputPanel.f55420h != null) {
            webSearchVoiceInputPanel.f55430u = true;
            Log.m105924i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
            VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
            MMEditText mMEditText = webSearchVoiceInputPanel.f55421i;
            if (mMEditText == null || mMEditText.getText() == null || webSearchVoiceInputPanel.f55421i.getText().length() <= 0) {
                if (webSearchVoiceInputPanel.f55430u) {
                    voiceInputBehavior.cancel = 2;
                } else {
                    voiceInputBehavior.cancel = 15;
                }
            } else if (webSearchVoiceInputPanel.f55430u) {
                voiceInputBehavior.cancel = 14;
            } else {
                voiceInputBehavior.cancel = 16;
            }
            long j = webSearchVoiceInputPanel.f55424o;
            if (j != 0) {
                voiceInputBehavior.voiceInputTime = Util.ticksToNow(j);
                webSearchVoiceInputPanel.f55424o = 0;
            }
            ((C116890a) webSearchVoiceInputPanel.f55420h).mo180856a();
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
