package d00;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import e00.C31371l0;
import ea3.C45598m;
import ei3.C86522b;

@C86522b
/* renamed from: d00.w0 */
public class C31029w0 extends C86301e implements C31371l0 {
    public void h00(boolean z) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WebViewFontUtil", 2);
        mmkv.putBoolean("webview_key_font_use_system", z);
        mmkv.apply();
    }

    public int pe0(Context context) {
        return C45598m.m50659a(context);
    }
}
