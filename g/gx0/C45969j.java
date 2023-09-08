package gx0;

import android.content.Intent;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactPlainListUI;
import wd3.C65953v0;

/* renamed from: gx0.j */
public class C45969j implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f123981a;

    /* renamed from: b */
    public final /* synthetic */ EnterpriseBizContactPlainListUI f123982b;

    public C45969j(EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, String str) {
        this.f123982b = enterpriseBizContactPlainListUI;
        this.f123981a = str;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = this.f123982b;
            if (enterpriseBizContactPlainListUI.f109120f == 3) {
                Intent intent = enterpriseBizContactPlainListUI.getIntent();
                intent.putExtra("enterprise_biz_name", this.f123981a);
                this.f123982b.setResult(-1, intent);
                this.f123982b.finish();
            }
        }
    }
}
