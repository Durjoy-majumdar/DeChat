package rs1;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.webview.modeltools.C43754j;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e00.C45529v;
import gy3.C87412m;
import ht1.C8762d5;

@C113200q(initialMode = 2)
/* renamed from: rs1.eb */
public final class C48079eb extends UIComponent implements C8762d5 {

    /* renamed from: d */
    public C45529v f128929d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48079eb(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C45529v vVar = this.f128929d;
        if (vVar != null) {
            Activity context = getContext();
            C43754j jVar = (C43754j) vVar;
            if (jVar.f118229e == null && i == 201) {
                jVar.mo68063f(context, i, i2, intent);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C45529v vVar = this.f128929d;
        if (vVar != null) {
            ((C43754j) vVar).mo68064g(getContext(), i, strArr, iArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48079eb(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
