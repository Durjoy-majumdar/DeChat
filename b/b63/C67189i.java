package b63;

import android.os.Bundle;
import com.tencent.p014mm.wallet_core.model.C75118h;

/* renamed from: b63.i */
public class C67189i {

    /* renamed from: a */
    public int f192900a = 0;

    /* renamed from: b */
    public int f192901b = 0;

    /* renamed from: c */
    public String f192902c = "";

    /* renamed from: d */
    public int f192903d = 0;

    /* renamed from: e */
    public C75118h f192904e = new C75118h();

    public C67189i() {
    }

    public C67189i(Bundle bundle) {
        this.f192900a = bundle.getInt("key_is_gen_cert", 0);
        this.f192901b = bundle.getInt("key_is_hint_crt", 0);
        this.f192903d = bundle.getInt("key_is_ignore_cert", 0);
        bundle.getString("key_crt_token", "");
        String string = bundle.getString("key_crt_wording", "");
        this.f192902c = string;
        this.f192904e = new C75118h(string);
    }
}
