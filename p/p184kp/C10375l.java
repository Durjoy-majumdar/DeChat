package p184kp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import de3.C7304v;
import de3.C7318w;
import de3.C7319x;
import de3.C86258g;
import di3.C86301e;
import ei3.C86522b;
import java.util.List;
import qo3.C77398g;
import qo3.C77407n;
import wd3.C15148g1;
import wd3.C65953v0;
import wd3.C78575u;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: kp.l */
public class C10375l extends C86301e implements C15148g1, C86258g {
    public C77398g Sk0(MMActivityController mMActivityController, String str, String str2, String str3, String str4, boolean z, String str5, C65953v0 v0Var) {
        return C78575u.m94943l(mMActivityController, str, str2, str3, str4, z, str5, v0Var);
    }

    /* renamed from: Wu */
    public void mo10688Wu(Context context, List<String> list, C77407n.C47880p pVar) {
        if (!list.isEmpty() && context != null) {
            new C45082x0(context).mo70436b((View) null, new C7318w(list), new C7319x(context), pVar);
        }
    }

    /* renamed from: hP */
    public void mo10689hP(Context context, String str, DialogInterface.OnDismissListener onDismissListener, Bundle bundle) {
        C7304v.m7461e(context, str, onDismissListener, bundle);
    }
}
