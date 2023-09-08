package a63;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: a63.c */
public class C67020c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Bundle f192511d;

    /* renamed from: e */
    public final /* synthetic */ int f192512e;

    /* renamed from: f */
    public final /* synthetic */ Activity f192513f;

    /* renamed from: g */
    public final /* synthetic */ boolean f192514g;

    public C67020c(Bundle bundle, int i, Activity activity, boolean z) {
        this.f192511d = bundle;
        this.f192512e = i;
        this.f192513f = activity;
        this.f192514g = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
        Bundle bundle = this.f192511d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", this.f192512e);
        bundle.putBoolean("key_from_set_pwd", true);
        C79143a.m95771j(this.f192513f, RealNameVerifyProcess.class, bundle, (C79148e.C79149a) null);
        C75228t.m90245f0(19, 1, Util.nowSecond(), this.f192512e);
        dialogInterface.dismiss();
        if (this.f192514g) {
            this.f192513f.finish();
        }
    }
}
