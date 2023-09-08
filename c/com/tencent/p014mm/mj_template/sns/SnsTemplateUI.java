package com.tencent.p014mm.mj_template.sns;

import android.os.Bundle;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import f72.C97842b;
import gy3.C24560g0;
import i21.C60242i;
import java.util.Set;
import k21.C60960c;
import kotlin.Metadata;
import la0.C61242a;
import nj3.C88989a;
import pa0.C62211a;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/sns/SnsTemplateUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.mj_template.sns.SnsTemplateUI */
public final class SnsTemplateUI extends MMComposeActivity {
    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6331rb;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C0324s.m265a(C24560g0.m30725a(C61242a.class)), C62211a.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        C97842b.f286991a = true;
        C85864g1.m106128c(this);
        getWindow().setFormat(-3);
        setLightNavigationbarIcon();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "egsessionCnt", 1, C60242i.APPEND);
    }

    public void onDestroy() {
        super.onDestroy();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "egEditTime", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
    }
}
