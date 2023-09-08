package p339fh;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C45114t1;
import java.io.BufferedReader;
import java.io.IOException;
import p213oh.C11412b;
import p343gh.C20835e;

/* renamed from: fh.d */
public class C45783d implements C20835e {

    /* renamed from: a */
    public final /* synthetic */ C45784e f123678a;

    public C45783d(C45784e eVar) {
        this.f123678a = eVar;
    }

    /* renamed from: a */
    public void mo32433a() {
        C45784e eVar = this.f123678a;
        synchronized (eVar) {
            try {
                eVar.f123680a.clear();
                BufferedReader bufferedReader = new BufferedReader(new C45114t1(eVar.mo71258b()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!TextUtils.isEmpty(readLine)) {
                        eVar.f123680a.add(readLine);
                    }
                }
                Object[] objArr = {Integer.valueOf(eVar.f123680a.size())};
                int i = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedReader.close();
            } catch (IOException e) {
                int i2 = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e, "asyncRead", new Object[0]);
            }
        }
        return;
    }

    /* renamed from: b */
    public void mo32434b() {
    }
}
