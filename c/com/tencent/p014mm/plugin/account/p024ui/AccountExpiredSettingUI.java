package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AccountExpiredEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86718e;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import o40.C61926c;
import p910lj.C76701a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/account/ui/AccountExpiredSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.account.ui.AccountExpiredSettingUI */
public final class AccountExpiredSettingUI extends MMActivity {

    /* renamed from: d */
    public final String f79623d = "MicroMsg.AccountExpiredSettingUI";

    /* renamed from: com.tencent.mm.plugin.account.ui.AccountExpiredSettingUI$a */
    public static final class C29073a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AccountExpiredSettingUI f79624d;

        public C29073a(AccountExpiredSettingUI accountExpiredSettingUI) {
            this.f79624d = accountExpiredSettingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f79624d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.AccountExpiredSettingUI$b */
    public static final class C29074b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AccountExpiredSettingUI f79625d;

        /* renamed from: com.tencent.mm.plugin.account.ui.AccountExpiredSettingUI$b$a */
        public static final class C29075a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f79626d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f79627e;

            /* renamed from: f */
            public final /* synthetic */ AccountExpiredSettingUI f79628f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29075a(C8479f0<String> f0Var, C8479f0<String> f0Var2, AccountExpiredSettingUI accountExpiredSettingUI) {
                super(0);
                this.f79626d = f0Var;
                this.f79627e = f0Var2;
                this.f79628f = accountExpiredSettingUI;
            }

            public Object invoke() {
                String format = String.format("<e>\n<ShowType>1</ShowType>\n<Content><![CDATA[%s]]></Content>\n<Url><![CDATA[]]></Url>\n<DispSec>30</DispSec>\n<Title><![CDATA[]]></Title>\n<Action>1</Action>\n<DelayConnSec>0</DelayConnSec>\n<Countdown>0</Countdown>\n<Ok><![CDATA[]]></Ok>\n<Cancel><![CDATA[]]></Cancel>\n</e>", Arrays.copyOf(new Object[]{this.f79626d.f27484d}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                C86718e.f251747w = format;
                AccountExpiredEvent accountExpiredEvent = new AccountExpiredEvent();
                AccountExpiredEvent.C28699a aVar = accountExpiredEvent.f78702d;
                aVar.f78703a = 4;
                try {
                    aVar.f78704b = Integer.parseInt((String) this.f79627e.f27484d);
                } catch (Exception unused) {
                    Log.m105920e(this.f79628f.f79623d, "parse errcode error");
                }
                accountExpiredEvent.f78702d.f78705c = format;
                accountExpiredEvent.publish();
                return C13598b0.f38549a;
            }
        }

        public C29074b(AccountExpiredSettingUI accountExpiredSettingUI) {
            this.f79625d = accountExpiredSettingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/AccountExpiredSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = ((MMEditText) this.f79625d.findViewById(C0966R.C0970id.f5354cv)).getText().toString();
            C8479f0 f0Var2 = new C8479f0();
            f0Var2.f27484d = ((MMEditText) this.f79625d.findViewById(C0966R.C0970id.f5355cw)).getText().toString();
            C61926c.m72666K(10000, new C29075a(f0Var2, f0Var, this.f79625d));
            CharSequence charSequence = (CharSequence) f0Var2.f27484d;
            boolean z = true;
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = (CharSequence) f0Var.f27484d;
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    C76701a.makeText((Context) this.f79625d, (int) C0966R.string.a0g, 0).show();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/AccountExpiredSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6297az;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7362dy);
        setBackBtn(new C29073a(this));
        findViewById(C0966R.C0970id.hll).setOnClickListener(new C29074b(this));
    }
}
