package o62;

import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C7241k;
import java.util.HashMap;
import java.util.HashSet;

public class b$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f33491d;

    /* renamed from: e */
    public final /* synthetic */ C7241k.C7249h f33492e;

    /* renamed from: f */
    public final /* synthetic */ C11373b f33493f;

    public b$$c(C11373b bVar, String str, C7241k.C7249h hVar) {
        this.f33493f = bVar;
        this.f33491d = str;
        this.f33492e = hVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.SysMsgTemplateImp", "hy: adding Received listener: %s", this.f33491d);
        HashSet hashSet = (HashSet) ((HashMap) this.f33493f.f33481f).get(this.f33491d);
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        if (!hashSet.contains(this.f33492e)) {
            hashSet.add(this.f33492e);
        }
        ((HashMap) this.f33493f.f33481f).put(this.f33491d, hashSet);
    }
}
