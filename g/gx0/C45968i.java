package gx0;

import android.content.Intent;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactPlainListUI;
import te3.C49566gj;
import wd3.C65953v0;

/* renamed from: gx0.i */
public class C45968i implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C49566gj f123979a;

    /* renamed from: b */
    public final /* synthetic */ EnterpriseBizContactPlainListUI f123980b;

    public C45968i(EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, C49566gj gjVar) {
        this.f123980b = enterpriseBizContactPlainListUI;
        this.f123979a = gjVar;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            Intent intent = this.f123980b.getIntent();
            intent.putExtra("enterprise_biz_name", this.f123979a.f134062d);
            this.f123980b.setResult(-1, intent);
            this.f123980b.finish();
        }
    }
}
