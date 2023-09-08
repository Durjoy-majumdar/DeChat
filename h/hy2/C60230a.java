package hy2;

import ay2.C67121f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ey2.C58854c;
import ey2.C75665a;
import gc0.C20828a;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import te3.C64459j13;
import te3.i25;
import vx2.C78493o;

/* renamed from: hy2.a */
public final class C60230a extends C58854c {

    /* renamed from: b */
    public MultiTaskInfo f171731b;

    /* renamed from: c */
    public final String f171732c = "TaskBarSectionOtherViewWebViewHelper";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60230a(C58854c.C58855a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public int mo75502a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "data");
        return C0966R.C0969drawable.f357377cd1;
    }

    /* renamed from: b */
    public String mo75503b(MultiTaskInfo multiTaskInfo) {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7904vp);
        C87412m.m108593f(q, "getString(MMApplicationC…section_subtitle_webview)");
        return q;
    }

    /* renamed from: c */
    public void mo75504c(C75665a.C58851b bVar) {
        C64459j13 m2;
        C87412m.m108594g(bVar, "viewHolder");
        if (this.f171731b != null) {
            i25 i25 = new i25();
            String str = null;
            try {
                MultiTaskInfo multiTaskInfo = this.f171731b;
                i25.parseFrom(multiTaskInfo != null ? multiTaskInfo.field_data : null);
            } catch (Throwable unused) {
                Log.m105920e(this.f171732c, "WebMultiTaskData parse failed");
            }
            String str2 = i25.f135049I;
            if (str2 == null) {
                MultiTaskInfo multiTaskInfo2 = this.f171731b;
                if (!(multiTaskInfo2 == null || (m2 = multiTaskInfo2.mo80305m2()) == null)) {
                    str = m2.f183756i;
                }
            } else {
                str = str2;
            }
            if (str != null) {
                C20828a.m22825b().mo32519h(str, bVar.f168472A, C78493o.f229928a);
            }
        }
    }

    /* renamed from: d */
    public void mo75505d(int i, C75665a.C58851b bVar, C67121f fVar) {
        C87412m.m108594g(bVar, "viewHolder");
        C87412m.m108594g(fVar, "viewModel");
        super.mo75505d(i, bVar, fVar);
        Object obj = ((ArrayList) fVar.f192729d).get(i);
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.model.MultiTaskInfo");
        this.f171731b = (MultiTaskInfo) obj;
        bVar.f168473B.setText(((MultiTaskInfo) ((ArrayList) fVar.f192729d).get(i)).mo80305m2().f183752e);
    }
}
