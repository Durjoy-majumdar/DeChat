package u73;

import com.tencent.p014mm.autogen.mmdata.rpt.WebSearchTemplateStruct;
import com.tencent.p014mm.plugin.websearch.C43471q;
import zl2.C39380c;

public final /* synthetic */ class i1$$a implements C39380c {

    /* renamed from: a */
    public final /* synthetic */ int[] f300273a;

    public /* synthetic */ i1$$a(int[] iArr) {
        this.f300273a = iArr;
    }

    /* renamed from: a */
    public final void mo61896a(String str, long j, long j2) {
        int[] iArr = this.f300273a;
        int i = 0;
        while (i < iArr.length) {
            WebSearchTemplateStruct webSearchTemplateStruct = new WebSearchTemplateStruct();
            int i2 = i + 1;
            webSearchTemplateStruct.f266560d = (long) i2;
            webSearchTemplateStruct.f266561e = (long) C43471q.m46977a(iArr[i]);
            webSearchTemplateStruct.mo86054n();
            C22613h1.m26490p(webSearchTemplateStruct);
            i = i2;
        }
    }
}
