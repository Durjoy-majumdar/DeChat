package lx0;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy0.C8219i;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import mx0.C47111e;

/* renamed from: lx0.a */
public final class C10662a extends C60896i<C47111e> {

    /* renamed from: e */
    public final String f32080e = "MicroMsg.BizPCRecentReadDateConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3m;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47111e eVar = (C47111e) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(eVar, "item");
        super.mo44e(oVar, eVar, i, i2, z, list);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (i == 0) {
            layoutParams.height = C76577a.m92151b(oVar.f173499A, 48);
        } else {
            layoutParams.height = C76577a.m92151b(oVar.f173499A, 68);
        }
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.nrx);
        C8219i.f27144a.mo9271b(textView);
        textView.setText(eVar.f126589f);
        String str = this.f32080e;
        Log.m105924i(str, "dateTv.text = " + textView.getText());
    }
}
