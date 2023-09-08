package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import if2.C8887d;
import if2.C8893f;
import if2.C8894g;
import if2.C8908n;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;
import sx3.C48501y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthMainUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI */
public final class NewBizInfoAuthMainUI extends MMSecDataActivity {

    /* renamed from: d */
    public String f20304d;

    /* renamed from: e */
    public String f20305e;

    public int getLayoutId() {
        return C0966R.C0971layout.f7066x3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C8887d.class, C8894g.class, C8908n.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f20304d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("key_add_contact_openim_appid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f20305e = stringExtra2;
        setTitleDividerVis(false);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setBackBtn(new C8893f(this));
    }
}
