package p263wn;

import android.content.SharedPreferences;
import b12.C79645d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import java.util.Map;
import p271xn.C15865p;
import te3.rg4;

@C86522b
/* renamed from: wn.n */
public class C15551n extends C86301e implements C15865p {
    /* renamed from: BF */
    public String mo14312BF() {
        return C79645d.m96734j();
    }

    /* renamed from: Dn */
    public void mo14313Dn(int i) {
        C79645d.f233535f = i;
    }

    public boolean Rs0() {
        Map<String, String> map = C79645d.f233530a;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4);
        long j = sharedPreferences.getLong(C79645d.f233532c, 0);
        int i = sharedPreferences.getInt(C79645d.f233533d, 0);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.UpdateUtil", "isNeedShowTinkerDialog now:%d last:%d time:%d", Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(i));
        return currentTimeMillis - j > 86400000 && i < 4;
    }

    /* renamed from: fh */
    public void mo14315fh() {
        Map<String, String> map = C79645d.f233530a;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putLong(C79645d.f233532c, System.currentTimeMillis()).apply();
        sharedPreferences.edit().putInt(C79645d.f233533d, sharedPreferences.getInt(C79645d.f233533d, 0) + 1).apply();
    }

    public rg4 x60() {
        return C79645d.m96737m();
    }
}
