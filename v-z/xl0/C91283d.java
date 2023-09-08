package xl0;

import android.content.Context;
import android.nfc.NfcAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: xl0.d */
public class C91283d {
    /* renamed from: a */
    public static boolean m114511a() {
        Context context = MMApplicationContext.getContext();
        return context.getPackageManager().hasSystemFeature("android.hardware.nfc") && NfcAdapter.getDefaultAdapter(context) != null;
    }

    /* renamed from: b */
    public static boolean m114512b() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext());
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        Log.m105924i("MicroMsg.HceUtils", "alvinluo no nfc chip !");
        return false;
    }
}
