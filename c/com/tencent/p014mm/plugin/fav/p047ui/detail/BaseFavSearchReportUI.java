package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import di3.C86312j;
import oc1.C100324a;
import p215oo.C77032h;
import p640ox.C77049b;
import te3.C101825od0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI */
public abstract class BaseFavSearchReportUI extends MMSecDataActivity {

    /* renamed from: d */
    public boolean f270021d = false;

    /* renamed from: e */
    public C100324a f270022e;

    /* renamed from: f */
    public long f270023f;

    /* renamed from: H7 */
    public void mo128401H7(int i) {
        if (this.f270021d) {
            this.f270022e.f293908d = ((int) (System.currentTimeMillis() - this.f270023f)) / 1000;
            C100324a aVar = this.f270022e;
            aVar.f293905a = i;
            aVar.mo139616b();
        }
        if (i == 3) {
            ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            ((C77032h) C86312j.m106911c(C77032h.class)).mo107357DR();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f270022e = new C100324a();
        this.f270021d = this.f270022e.mo139617d((C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).mo72356fq(this, 1, 17, C101825od0.class));
        this.f270023f = System.currentTimeMillis();
        this.f270022e.f293911g = C100324a.m131159a();
        this.f270022e.f293915k = this.f270023f;
    }
}
