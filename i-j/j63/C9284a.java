package j63;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j63.C76397d;
import te3.C50396mf3;

/* renamed from: j63.a */
public class C9284a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50396mf3 f29042d;

    /* renamed from: e */
    public final /* synthetic */ WalletBaseUI f29043e;

    public C9284a(C50396mf3 mf32, WalletBaseUI walletBaseUI, C76397d.C9285b bVar) {
        this.f29042d = mf32;
        this.f29043e = walletBaseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!Util.isNullOrNil(this.f29042d.f138009g)) {
            WalletBaseUI walletBaseUI = this.f29043e;
            String str = this.f29042d.f138009g;
            Log.m105925i("MicroMsg.ECardUtil", "url: %s", str);
            if (!Util.isNullOrNil(str)) {
                if (str.startsWith("native.")) {
                    Log.m105924i("MicroMsg.ECardUtil", "goto native");
                    if (!str.equals("native.qryacctdesc") && !str.equals("native.openecardauth") && !str.equals("native.cancloseecard")) {
                        str.equals("native.withdraw");
                    }
                } else {
                    Log.m105919d("MicroMsg.ECardUtil", "url: %s", str);
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("showShare", false);
                    C75228t.m90217J(walletBaseUI, intent);
                }
            }
        }
        dialogInterface.dismiss();
    }
}
