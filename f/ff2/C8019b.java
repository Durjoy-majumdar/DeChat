package ff2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ff2.b */
public final class C8019b extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8019b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter view = root(C0966R.C0971layout.bot).view(C0966R.C0970id.e_4);
        ViewType viewType = ViewType.Button;
        view.type(viewType).descFormat(C0966R.string.aq4).valueByKey("title_num_1");
        root(C0966R.C0971layout.bot).view(C0966R.C0970id.j79).type(viewType).descFormat(C0966R.string.aq4).valueByKey("title_num_2");
        root(C0966R.C0971layout.bot).view(C0966R.C0970id.kj8).type(viewType).descFormat(C0966R.string.aq4).valueByKey("title_num_3");
        root(C0966R.C0971layout.bot).view(C0966R.C0970id.eeh).type(viewType).descFormat(C0966R.string.aq4).valueByKey("title_num_4");
    }
}
