package q53;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: q53.e */
public final class C12061e<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35137d;

    public C12061e(C12041a aVar) {
        this.f35137d = aVar;
    }

    public void onChanged(Object obj) {
        Integer num = (Integer) obj;
        C12041a aVar = this.f35137d;
        aVar.getClass();
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "updateCheckBox: " + num);
        if (num != null) {
            num.intValue();
            aVar.f35065e.mo11724d3(num.intValue() == 0 ? 7 : 6);
            View view = aVar.f35069i;
            if (view != null) {
                CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.ifq);
                View view2 = aVar.f35069i;
                if (view2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.ifp);
                    if (aVar.f35066f) {
                        checkBox.setBackground(aVar.f35061a.getResources().getDrawable(C0966R.C0969drawable.b2t, (Resources.Theme) null));
                    }
                    checkBox.setChecked(num.intValue() != 0);
                    linearLayout.setOnClickListener(new C12105p(checkBox, aVar));
                    return;
                }
                C87412m.m108603p("mCustomView");
                throw null;
            }
            C87412m.m108603p("mCustomView");
            throw null;
        }
    }
}
