package fo3;

import com.tencent.p014mm.p136ui.websearch.WebSearchVoiceUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.websearch.WebSearchVoiceInputPanel;

/* renamed from: fo3.a */
public class C116890a implements WebSearchVoiceInputPanel.C19587d {

    /* renamed from: a */
    public final /* synthetic */ WebSearchVoiceUI f350309a;

    public C116890a(WebSearchVoiceUI webSearchVoiceUI) {
        this.f350309a = webSearchVoiceUI;
    }

    /* renamed from: a */
    public void mo180856a() {
        this.f350309a.setResult(0);
        C115669n nVar = C115669n.INSTANCE;
        WebSearchVoiceUI webSearchVoiceUI = this.f350309a;
        nVar.mo160131h(15178, 4, Long.valueOf(System.currentTimeMillis()), "", webSearchVoiceUI.f348668f, webSearchVoiceUI.f348669g, Integer.valueOf(webSearchVoiceUI.f348670h), Integer.valueOf(this.f350309a.f348671i));
        this.f350309a.finish();
    }
}
