package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: ac3.j1 */
public final class C103362j1 {

    /* renamed from: a */
    public static final C103362j1 f304817a = new C103362j1();

    /* renamed from: b */
    public static int f304818b = 65;

    /* renamed from: c */
    public static int f304819c = 0;

    /* renamed from: d */
    public static int f304820d = 60;

    /* renamed from: e */
    public static int f304821e = 100;

    /* renamed from: f */
    public static int f304822f = 30;

    /* renamed from: g */
    public static int f304823g;

    /* renamed from: h */
    public static int f304824h;

    /* renamed from: i */
    public static C32227p<? super Integer, ? super Integer, C13598b0> f304825i;

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("xlab_effect_config");
        Log.m105924i("MicroMsg.XLabEffectConfig", "config is : " + f304818b + ", " + f304819c + ", " + f304820d + ", " + f304821e + ", " + f304822f);
        f304823g = mmkv.getInt("start_count", f304823g);
        f304824h = mmkv.getInt("end_count", f304824h);
        StringBuilder sb = new StringBuilder();
        sb.append("count track is : ");
        sb.append(f304823g);
        sb.append(", ");
        sb.append(f304824h);
        Log.m105924i("MicroMsg.XLabEffectConfig", sb.toString());
    }

    /* renamed from: a */
    public final void mo143267a(int i, int i2) {
        Log.m105924i("MicroMsg.XLabEffectConfig", "setConfig: " + i + ", " + i2);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("xlab_effect_config");
        if (i == 0) {
            f304818b = i2;
            mmkv.putInt("skin_smooth", i2);
        } else if (i == 1) {
            f304819c = i2;
            mmkv.putInt("eye_morph", i2);
        } else if (i == 2) {
            f304820d = i2;
            mmkv.putInt("face_morph", i2);
        } else if (i == 3) {
            f304821e = i2;
            mmkv.putInt("skin_bright", i2);
        } else if (i == 4) {
            f304822f = i2;
            mmkv.putInt("eye_bright", i2);
        }
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = f304825i;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
