package o32;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: o32.g */
public class C47329g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76990f f127013d;

    public C47329g(C76990f fVar) {
        this.f127013d = fVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "RealnameGuideHelper dialog click cancel");
        this.f127013d.mo107309a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel realname}}"));
    }
}
