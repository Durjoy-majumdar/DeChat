package com.tencent.p014mm.plugin.remittance.p098ui;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.RemittanceLargeMoneyPayEvent;
import com.tencent.p014mm.plugin.remittance.model.C5060u0;
import com.tencent.p014mm.plugin.remittance.p098ui.C70905k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceLargeMoneyUI;", "Lcom/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI */
public class RemittanceLargeMoneyUI extends RemittanceF2fLargeMoneyUI {

    /* renamed from: u */
    public String f204928u;

    /* renamed from: H7 */
    public void mo97414H7(double d) {
        RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent = new RemittanceLargeMoneyPayEvent();
        RemittanceLargeMoneyPayEvent.C67776a aVar = remittanceLargeMoneyPayEvent.f193891d;
        aVar.f193893b = d;
        aVar.f193892a = this.f204928u;
        aVar.f193894c = this;
        remittanceLargeMoneyPayEvent.publish();
    }

    /* renamed from: I7 */
    public void mo97415I7() {
        this.f204909p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f204911r = getIntent().getStringExtra("key_title");
        this.f204912s = getIntent().getStringExtra("key_desc");
        getIntent().getStringExtra("key_display_name");
        this.f204928u = getIntent().getStringExtra("key_place_attach");
    }

    /* renamed from: J7 */
    public void mo97416J7() {
        this.f204901e.setText(this.f204911r);
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String str = this.f204911r;
        C87412m.m108593f(str, "mTitle");
        ((C5060u0) rVar.mo62444c(context).mo75002a(C5060u0.class)).setValue("page_title_key", str);
        this.f204902f.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), this.f204912s, this.f204902f.getTextSize()));
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.RemittanceLargeMoneyUI", "onResume()");
        C70905k0.m83420b();
        C70905k0.C70906a.f205332a.mo97575c(this);
    }
}
