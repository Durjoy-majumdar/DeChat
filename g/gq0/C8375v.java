package gq0;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C47268j0;

/* renamed from: gq0.v */
public final class C8375v implements C47268j0 {

    /* renamed from: a */
    public static final C8375v f27365a = new C8375v();

    /* renamed from: a */
    public final void mo7130a(TextView textView, MenuItem menuItem) {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onAttach, menuItem: " + menuItem);
        ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        C8373l0 l0Var = menuInfo instanceof C8373l0 ? (C8373l0) menuInfo : null;
        if (l0Var == null) {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onAttach, menuInfo is not RawFunctionName2Show");
            return;
        }
        C87412m.m108593f(textView, "textView");
        if (!l0Var.f27362c) {
            textView.setText(l0Var.f27363d);
        } else {
            textView.post(new C8372d0(textView, l0Var));
        }
    }
}
