package s53;

import ad3.C67027a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C43380a;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C43383c;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C43393f;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C43404i;
import di3.C86301e;
import ei3.C86522b;
import yq3.C79143a;
import yq3.C79148e;
import zb3.C66782d;

@C86522b
/* renamed from: s53.b */
public class C48237b extends C86301e implements C66782d {

    /* renamed from: d */
    public C66782d.C53770a f129232d = null;

    /* renamed from: e */
    public C79148e.C79149a f129233e = new C48238a();

    /* renamed from: s53.b$a */
    public class C48238a implements C79148e.C79149a {
        public C48238a() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            C66782d.C53770a aVar = C48237b.this.f129232d;
            if (aVar != null) {
                aVar.onProcessEnd(i, bundle);
            }
            C48237b.this.f129232d = null;
            return null;
        }
    }

    /* renamed from: Av */
    public C67027a mo72981Av(Context context) {
        return new C43393f(context);
    }

    /* renamed from: Co */
    public void mo72982Co(Activity activity, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("real_name_verify_mode", 2);
        C79143a.m95771j(activity, RealNameVerifyProcess.class, bundle, (C79148e.C79149a) null);
    }

    /* renamed from: KL */
    public C67027a mo72983KL(Context context) {
        return new C43383c(context);
    }

    public void O70(Activity activity, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("realname_verify_process_jump_activity", str);
        bundle.putString("realname_verify_process_jump_plugin", str2);
        mo72982Co(activity, bundle);
    }

    public C67027a T40(Context context) {
        return new C43380a(context);
    }

    public void cc0(Activity activity, Bundle bundle, C66782d.C53770a aVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f129232d = aVar;
        bundle.putInt("real_name_verify_mode", 2);
        C79143a.m95771j(activity, RealNameVerifyProcess.class, bundle, this.f129233e);
    }

    public C67027a vg0(Context context) {
        return new C43404i(context);
    }
}
