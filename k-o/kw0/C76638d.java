package kw0;

import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Util;
import p996kj.C88155a;
import qo3.C77389a;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: kw0.d */
public class C76638d {
    /* renamed from: a */
    public static C77398g m92292a(MMActivityController mMActivityController, String str, String str2, String str3, C65953v0 v0Var, C65953v0 v0Var2) {
        AppCompatActivity t = mMActivityController.mo177096t();
        C77389a aVar = new C77389a();
        aVar.f225658o = C88155a.decodeResource(mMActivityController.mo177096t().getResources(), C0966R.raw.dialog_successful_icon, (BitmapFactory.Options) null);
        aVar.f225619B = false;
        aVar.f225635R = 3;
        aVar.f225668y = false;
        aVar.f225669z = false;
        aVar.f225646c = str;
        aVar.f225633P = 17;
        C77398g gVar = new C77398g(t, C0966R.style.a66);
        gVar.mo107525e(aVar);
        AppCompatActivity t2 = mMActivityController.mo177096t();
        if (Util.isNullOrNil(str3) || str3.length() == 0) {
            str3 = t2.getResources().getString(C0966R.string.bjd);
        }
        if (Util.isNullOrNil(str2) || str2.length() == 0) {
            str2 = t2.getResources().getString(C0966R.string.f7926wf);
        }
        gVar.mo107542x(str3, true, new C61174b(gVar, v0Var2));
        gVar.mo107539t(str2, true, new C61175c(gVar, v0Var));
        gVar.mo107540u(mMActivityController.mo177096t().getResources().getColor(C0966R.color.f3154h3));
        gVar.show();
        return gVar;
    }
}
