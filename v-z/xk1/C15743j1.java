package xk1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: xk1.j1 */
public final class C15743j1 extends UIComponent {

    /* renamed from: d */
    public final ArrayList<C15744a> f42462d = new ArrayList<>();

    /* renamed from: xk1.j1$a */
    public interface C15744a {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15743j1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (C15744a onActivityResult : this.f42462d) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f42462d.clear();
    }
}
