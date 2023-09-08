package bl3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54498z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: bl3.y */
public abstract class C54497y<S extends C54498z> extends UIComponent implements C54491d<S> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54497y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54497y(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
