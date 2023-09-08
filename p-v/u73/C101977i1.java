package u73;

import com.tencent.p014mm.autogen.mmdata.rpt.WebSearchTemplateStruct;
import com.tencent.p014mm.plugin.websearch.C43471q;
import di3.C86312j;
import zl2.C39379b;

/* renamed from: u73.i1 */
public class C101977i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f300272d;

    public C101977i1(int i) {
        this.f300272d = i;
    }

    public void run() {
        int[] iArr = {1, 0, 5, 6, 3, 9};
        if (this.f300272d == -1) {
            ((C39379b) C86312j.m106911c(C39379b.class)).mo61898Wq("reportWebSearchTemplate", 24, new i1$$a(iArr), true, false);
            return;
        }
        for (int i = 0; i < 6; i++) {
            if (iArr[i] == this.f300272d) {
                WebSearchTemplateStruct webSearchTemplateStruct = new WebSearchTemplateStruct();
                webSearchTemplateStruct.f266560d = (long) (i + 1);
                webSearchTemplateStruct.f266561e = (long) C43471q.m46977a(iArr[i]);
                webSearchTemplateStruct.mo86054n();
                C22613h1.m26490p(webSearchTemplateStruct);
                return;
            }
        }
    }
}
