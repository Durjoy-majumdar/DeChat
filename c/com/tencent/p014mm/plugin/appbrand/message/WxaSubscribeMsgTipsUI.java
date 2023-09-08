package com.tencent.p014mm.plugin.appbrand.message;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.BaseLuggageActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gt0.C76063l;
import gt0.C87362k;
import gy3.C87412m;
import kotlin.Metadata;
import zd0.C91663l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/message/WxaSubscribeMsgTipsUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.message.WxaSubscribeMsgTipsUI */
public final class WxaSubscribeMsgTipsUI extends BaseLuggageActivity {

    /* renamed from: B */
    public C87362k f244326B;

    /* renamed from: C */
    public C91663l f244327C;

    /* renamed from: com.tencent.mm.plugin.appbrand.message.WxaSubscribeMsgTipsUI$a */
    public static final class C83701a implements C91663l.C91665b {

        /* renamed from: a */
        public final /* synthetic */ WxaSubscribeMsgTipsUI f244328a;

        public C83701a(WxaSubscribeMsgTipsUI wxaSubscribeMsgTipsUI) {
            this.f244328a = wxaSubscribeMsgTipsUI;
        }

        public void onDismiss() {
            this.f244328a.finish();
        }
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        super.onBackPressed();
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "getWindow().getDecorView()");
        decorView.setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(MMApplicationContext.getResources().getColor(C0966R.color.ahf));
        this.f244326B = new C87362k(this, (C76063l) null);
        addContentView(this.f244326B, new ViewGroup.LayoutParams(-1, -2));
        C91663l lVar = new C91663l(this);
        this.f244327C = lVar;
        C87362k kVar = this.f244326B;
        if (kVar != null) {
            kVar.mo121778b(lVar);
        }
        C91663l lVar2 = this.f244327C;
        if (lVar2 != null) {
            lVar2.f262643g = new C83701a(this);
        }
    }

    public void onDestroy() {
        overridePendingTransition(0, 0);
        super.onDestroy();
    }

    public void onStop() {
        super.onStop();
    }
}
