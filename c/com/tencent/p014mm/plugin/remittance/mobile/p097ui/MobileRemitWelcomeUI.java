package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.HashSet;
import nj3.C76879j;
import ob0.C117747y;
import te3.C52036xy;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI */
public class MobileRemitWelcomeUI extends MobileRemitBaseUI {

    /* renamed from: d */
    public static final /* synthetic */ int f203938d = 0;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI$b */
    public static class C5053b extends MMBaseAccessibilityConfig {
        public C5053b(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0970id.gxi).disable(C0966R.C0970id.gxi);
            focusFirst(C0966R.C0970id.gxm);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI$a */
    public class C70542a extends C7089c0 {
        public C70542a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "goto MobileRemitNumberInputUI");
            MobileRemitWelcomeUI mobileRemitWelcomeUI = MobileRemitWelcomeUI.this;
            int i = MobileRemitWelcomeUI.f203938d;
            byte[] byteArrayExtra = mobileRemitWelcomeUI.getIntent().getByteArrayExtra("key_compliance_item ");
            C52036xy xyVar = new C52036xy();
            try {
                xyVar.parseFrom(byteArrayExtra);
                C115669n.INSTANCE.mo160131h(24835, 1, 1);
                C75228t.m90259m0(mobileRemitWelcomeUI.getContext(), xyVar.f145017e, xyVar.f145016d, xyVar.f145018f, new C70559e(mobileRemitWelcomeUI));
            } catch (Exception e) {
                Log.m105925i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "pars error :%s", e.toString());
                C76879j.m92754y(mobileRemitWelcomeUI.getContext(), mobileRemitWelcomeUI.getContext().getString(C0966R.string.l_3), "", mobileRemitWelcomeUI.getContext().getString(C0966R.string.kke), new C70560f(mobileRemitWelcomeUI));
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bge;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn((MenuItem.OnMenuItemClickListener) null);
        ((ImageView) findViewById(C0966R.C0970id.gxh)).getDrawable().setColorFilter(getResources().getColor(C0966R.color.f2939n), PorterDuff.Mode.SRC_ATOP);
        findViewById(C0966R.C0970id.gxf).setOnClickListener(new C70542a());
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.gxm)).getPaint(), 0.8f);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5053b.class);
    }
}
