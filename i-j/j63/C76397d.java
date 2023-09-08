package j63;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75283h;
import k63.C76501b;
import nj3.C76879j;
import ob0.C117747y;
import te3.C50396mf3;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: j63.d */
public class C76397d {

    /* renamed from: j63.d$b */
    public interface C9285b {
        /* renamed from: a */
        boolean mo10060a(String str);
    }

    /* renamed from: j63.d$a */
    public class C76398a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: a */
    public static String m91815a(Context context, String... strArr) {
        String string = context.getString(C0966R.string.l_3);
        if (strArr == null || strArr.length <= 0) {
            return string;
        }
        for (String str : strArr) {
            if (!Util.isNullOrNil(str)) {
                return str;
            }
        }
        return string;
    }

    /* renamed from: b */
    public static boolean m91816b(WalletBaseUI walletBaseUI, C117747y yVar, int i, String str, int i2, String str2) {
        if (i2 == 0) {
            str2 = str;
        } else {
            i = i2;
        }
        Log.m105925i("MicroMsg.ECardUtil", "finalRetCode: %s, finalRetMsg: %s", Integer.valueOf(i), str2);
        if (i != 269293577) {
            return C75283h.m90311a(walletBaseUI, yVar, 1000, i, str2);
        }
        C76879j.m92713G(walletBaseUI, str, "", false, new C76398a());
        return true;
    }

    /* renamed from: c */
    public static boolean m91817c(WalletBaseUI walletBaseUI, C50396mf3 mf32) {
        if (mf32 == null) {
            Log.m105924i("MicroMsg.ECardUtil", "no popItem");
            return false;
        } else if (Util.isNullOrNil(mf32.f138006d)) {
            return false;
        } else {
            if (!Util.isNullOrNil(mf32.f138008f) && !Util.isNullOrNil(mf32.f138007e)) {
                Log.m105924i("MicroMsg.ECardUtil", "show guide info 1");
                C76879j.m92709C(walletBaseUI, mf32.f138006d, "", mf32.f138008f, mf32.f138007e, false, new C9284a(mf32, walletBaseUI, (C9285b) null), new C76395b(mf32, walletBaseUI));
            } else if (Util.isNullOrNil(mf32.f138007e)) {
                return false;
            } else {
                Log.m105924i("MicroMsg.ECardUtil", "show guide info 2");
                C76879j.m92711E(walletBaseUI, mf32.f138006d, "", mf32.f138007e, false, new C76396c(mf32, walletBaseUI));
            }
            return true;
        }
    }

    /* renamed from: d */
    public static void m91818d(int i, String str, String str2, String str3, Context context, C79148e.C79149a aVar) {
        Log.m105925i("MicroMsg.ECardUtil", "start open ecard process, scene: %s, token==null%s, eCardType: %s, extraData: %s", Integer.valueOf(i), Boolean.valueOf(Util.isNullOrNil(str)), str2, str3);
        Bundle bundle = new Bundle();
        bundle.putInt("key_open_scene", i);
        bundle.putString("key_open_token", str);
        bundle.putString("key_ecard_type", str2);
        bundle.putString("key_open_extra_data", str3);
        C79143a.m95771j((Activity) context, C76501b.class, bundle, aVar);
    }
}
