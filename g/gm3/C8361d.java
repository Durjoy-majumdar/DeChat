package gm3;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.matrix.MatrixReportUI;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: gm3.d */
public class C8361d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MatrixSettingUI f27325d;

    public C8361d(MatrixSettingUI matrixSettingUI) {
        this.f27325d = matrixSettingUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f27325d, MatrixReportUI.class);
        intent.addFlags(67108864);
        MatrixSettingUI matrixSettingUI = this.f27325d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(matrixSettingUI, aVar.mo10232b(), "com/tencent/mm/ui/matrix/MatrixSettingUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        matrixSettingUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(matrixSettingUI, "com/tencent/mm/ui/matrix/MatrixSettingUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
