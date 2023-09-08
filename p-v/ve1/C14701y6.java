package ve1;

import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0800z1;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import te3.C49982je3;
import te3.C50951qe3;
import te3.z74;

/* renamed from: ve1.y6 */
public final class C14701y6 extends C60896i<C0800z1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.an7;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C50951qe3 qe32;
        C49982je3 je32;
        C0800z1 z1Var = (C0800z1) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(z1Var, "item");
        Log.m105924i("FinderPoiRelateConvert", "[onBindViewHolder], " + z1Var.f1860d);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxm);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kxl);
        CheckBox checkBox = (CheckBox) oVar.mo85812D(C0966R.C0970id.aya);
        if (checkBox != null) {
            checkBox.setChecked(z1Var.f1861e);
        }
        z74 z74 = z1Var.f1860d.f141694d;
        if (z74 != null && (qe32 = z74.f145743d) != null && (je32 = qe32.f140264d) != null) {
            if (textView != null) {
                textView.setText(je32.f136053e);
            }
            String str = je32.f136067v + APLogFileUtil.SEPARATOR_LOG + je32.f136056h;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
