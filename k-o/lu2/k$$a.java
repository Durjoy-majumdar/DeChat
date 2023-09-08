package lu2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95959s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;

public final /* synthetic */ class k$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95959s f126102d;

    /* renamed from: e */
    public final /* synthetic */ C95959s.C43123a f126103e;

    /* renamed from: f */
    public final /* synthetic */ String f126104f;

    public /* synthetic */ k$$a(C95959s sVar, C95959s.C43123a aVar, String str) {
        this.f126102d = sVar;
        this.f126103e = aVar;
        this.f126104f = str;
    }

    public final void run() {
        C95959s sVar = this.f126102d;
        C95959s.C43123a aVar = this.f126103e;
        String str = this.f126104f;
        sVar.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        float textSize = aVar.f116691H0.getTextSize();
        int width = aVar.f116690G0.getWidth() - (C76577a.m92157h(aVar.f116691H0.getContext(), C0966R.dimen.f3736cp) * 2);
        int i = (int) (((float) width) / textSize);
        int length = str.length();
        int length2 = sVar.f280196q.length();
        int i2 = i - length2;
        int min = Math.min(i2, length);
        Log.m105924i("MicroMsg.BaseTimeLineItem", "finalDesc = " + str + ", suffix = " + sVar.f280196q);
        Log.m105924i("MicroMsg.BaseTimeLineItem", "textSize = " + textSize + ", width = " + width + ", textNumber = " + i + ", descLen = " + length + ", suffixLen = " + length2 + ", maxDescLen = " + i2);
        if (min > 0) {
            aVar.f116691H0.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f116691H0.getContext(), str.substring(0, min) + sVar.f280196q, aVar.f116691H0.getTextSize()));
        }
        SnsMethodCalculate.markEndTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }
}
