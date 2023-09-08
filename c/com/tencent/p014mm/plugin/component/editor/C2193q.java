package com.tencent.p014mm.plugin.component.editor;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n21.C100041b;
import n21.C100045e;

/* renamed from: com.tencent.mm.plugin.component.editor.q */
public final class C2193q extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.component.editor.q$a */
    public static final class C2194a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C2193q f12184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2194a(C2193q qVar) {
            super(1);
            this.f12184d = qVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag();
            if (tag instanceof C100041b) {
                String string = this.f12184d.getContext().getString(C0966R.string.f7351h);
                C87412m.m108593f(string, "context.getString(R.stri…itor_panel_file_btn_desc)");
                return string;
            } else if (!(tag instanceof C100045e)) {
                return "";
            } else {
                String string2 = this.f12184d.getContext().getString(C0966R.string.f7353r);
                C87412m.m108593f(string2, "context.getString(R.stri…ditor_panel_loc_btn_desc)");
                return string2;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2193q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.at6);
        root.view(C0966R.C0970id.lx4).desc((int) C0966R.string.f7352o);
        root.view(C0966R.C0970id.f357900lx2).desc((int) C0966R.string.f7355aa);
        root.view(C0966R.C0970id.f357901lx3).desc((int) C0966R.string.f7351h);
        root.view(C0966R.C0970id.lxs).desc((int) C0966R.string.f7353r);
        root.view(C0966R.C0970id.ly4).desc((int) C0966R.string.f7356ab);
        root.view(C0966R.C0970id.ly5).desc((int) C0966R.string.f7354s);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.at6);
        root2.view(C0966R.C0970id.lrg).desc((int) C0966R.string.c3z).disableChildren();
        root2.view(C0966R.C0970id.lr_).desc((int) C0966R.string.c3v).disableChildren();
        root2.view(C0966R.C0970id.lre).desc((int) C0966R.string.c3w).disableChildren();
        root2.view(C0966R.C0970id.lrf).desc((int) C0966R.string.c3x).disableChildren();
        root2.view(C0966R.C0970id.gz8).desc((int) C0966R.string.c3y).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.a0q);
        ViewSetter desc = root3.view(C0966R.C0970id.caw).desc((int) C0966R.string.f7352o);
        ViewType viewType = ViewType.Button;
        desc.type(viewType).clickAs(C0966R.C0970id.cav).disableChildren();
        root3.view(C0966R.C0970id.l4x).desc((int) C0966R.string.f7355aa).type(viewType).disableChildren();
        root3.view(C0966R.C0970id.hid).type(viewType).desc((C32226l<? super View, String>) new C2194a(this));
    }
}
