package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C76243a5;

/* renamed from: com.tencent.mm.plugin.profile.ui.y */
public final class C5023y extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5023y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f7060wu);
        ViewSetter view = root(C0966R.C0970id.f357530ab2).view(C0966R.C0970id.f357530ab2);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f7065x0);
        root.view(C0966R.C0970id.f357530ab2).type(viewType).descFormat(C0966R.string.aq4).valueByKey("biz_timeline_profile_menu_selected_msg");
        root.view(C0966R.C0970id.ab9).type(viewType).descFormat(C0966R.string.aq4).valueByKey("biz_timeline_profile_menu_selected_video");
        root(C0966R.C0971layout.f7064wz).view(C0966R.C0970id.bn7).descFormat(C0966R.string.aqq).valueByView(C0966R.C0970id.aar).valueByView(C0966R.C0970id.aaq).valueByView(C0966R.C0970id.aav).disableChildren();
        ((C76243a5) C86312j.m106911c(C76243a5.class)).br0(getContext(), this);
        root(C0966R.C0971layout.cj_).view(C0966R.C0970id.iuh).desc((C32226l<? super View, String>) C4997l.f20296d).disableChildren().type(viewType);
        root(C0966R.C0971layout.ck8).view(C0966R.C0970id.mom).desc((C32226l<? super View, String>) C4998m.f20297d).disableChildren().type(viewType);
        root(C0966R.C0971layout.ckw).view(C0966R.C0970id.mol).desc((C32226l<? super View, String>) C4999n.f20298d).disableChildren().type(viewType);
        root(C0966R.C0971layout.c4r).view(C0966R.C0970id.f357998mq0).desc((C32226l<? super View, String>) C5000o.f20306d).disableChildren().type(viewType);
        root(C0966R.C0971layout.f359636c81).view(C0966R.C0970id.lzg).desc((C32226l<? super View, String>) C5002p.f20308d).disableChildren().type(viewType);
        root(C0966R.C0971layout.cip).view(C0966R.C0970id.lzg).desc((C32226l<? super View, String>) C5004q.f20311d).disableChildren().type(viewType);
        root(C0966R.C0971layout.c5b).view(C0966R.C0970id.lzg).desc((C32226l<? super View, String>) C5009r.f20321d).disableChildren().type(viewType);
        root(C0966R.C0971layout.cj8).view(C0966R.C0970id.lzg).desc((C32226l<? super View, String>) C5011s.f20323d).disableChildren().type(viewType);
        root(C0966R.C0971layout.ckx).view(C0966R.C0970id.iks).desc((C32226l<? super View, String>) C5015t.f20327d).disableChildren();
        view(C0966R.C0970id.f5421eo, C0966R.C0970id.f5421eo).type(viewType).desc((C32226l<? super View, String>) new C5019u(this));
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.bof);
        ViewSetter view2 = root2.view(C0966R.C0970id.bno);
        ViewType viewType2 = ViewType.TextView;
        view2.type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bno);
        root2.view(C0966R.C0970id.bnm).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bnm);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.f5306bi);
        root3.view(C0966R.C0970id.f359063il3).type(viewType);
        root3.view(C0966R.C0970id.gxw).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.f7088xw);
        root4.view(C0966R.C0970id.bq6).type(viewType2).descFormat(C0966R.string.jun).valueByKey("contact_profile_sex_icon");
        root4.view(C0966R.C0970id.f357781bq0).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.f357781bq0);
        root4.view(C0966R.C0970id.bpt).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bpt);
        root4.view(C0966R.C0970id.bq7).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bq7);
        root4.view(C0966R.C0970id.bpv).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bpv);
        root4.view(C0966R.C0970id.bpz).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bpz);
        root4.view(C0966R.C0970id.bq8).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.bq8);
        root(C0966R.C0971layout.bdc).view(16908310).type(viewType2).descFormat(C0966R.string.jun).valueByView(16908310);
        root(C0966R.C0971layout.bdc).view(C0966R.C0970id.f5772o8).type(viewType2).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.f5772o8);
        root(C0966R.C0971layout.bdh).view(C0966R.C0970id.f358059d80).type(viewType).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.knx).valueByView(C0966R.C0970id.f5772o8).disableChildren();
        root(C0966R.C0971layout.bcy).view(C0966R.C0970id.iwg).type(viewType).desc((C32226l<? super View, String>) C5020v.f20334d).checkOn(C5021w.f20335d, C5022x.f20336d).disableChildren();
    }
}
