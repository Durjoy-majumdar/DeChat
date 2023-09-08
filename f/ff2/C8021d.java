package ff2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ff2.d */
public final class C8021d extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8021d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.f359114j11);
        root.view(C0966R.C0970id.j3t).disable();
        root.view(C0966R.C0970id.gxt).descFormat(C0966R.string.jun).type(ViewType.Button).valueByView(C0966R.C0970id.gxu).clickAs(C0966R.C0970id.gxu).disableChildren();
        ViewSetter valueByView = root.view(C0966R.C0970id.fh4).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.fh4);
        ViewType viewType = ViewType.TextView;
        valueByView.type(viewType);
        root.view(C0966R.C0970id.kf8).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.kf8).type(viewType);
        root.view(C0966R.C0970id.hhx).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.hhx).type(viewType);
        root.view(C0966R.C0970id.hhz).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.hhz).type(viewType);
        root.view(C0966R.C0970id.hi8).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.hi8).type(viewType);
        root.view(C0966R.C0970id.iq9).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.iq9).type(viewType);
        root.view(C0966R.C0970id.il6).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.il6).type(viewType);
        root.view(C0966R.C0970id.kf7).descFormat(C0966R.string.juo).type(viewType).valueByView(C0966R.C0970id.kf8).valueByView(C0966R.C0970id.kf5).clickAs(C0966R.C0970id.kf8).clickAs(C0966R.C0970id.kf5).disableChildren();
    }
}
