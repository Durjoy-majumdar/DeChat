package vc3;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: vc3.b */
public class C65583b {
    /* renamed from: a */
    public static String m77266a() {
        return MultiProcessMMKV.getMMKV("mmkv_gpu_info").getString("channel_id", "voip_norify_channel_silent");
    }
}
