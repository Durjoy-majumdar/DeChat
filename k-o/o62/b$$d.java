package o62;

import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C7241k;
import java.util.HashMap;
import java.util.HashSet;

public class b$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f33494d;

    /* renamed from: e */
    public final /* synthetic */ C7241k.C7249h f33495e;

    /* renamed from: f */
    public final /* synthetic */ C11373b f33496f;

    public b$$d(C11373b bVar, String str, C7241k.C7249h hVar) {
        this.f33496f = bVar;
        this.f33494d = str;
        this.f33495e = hVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.SysMsgTemplateImp", "hy: removing Received listener: %s", this.f33494d);
        HashSet hashSet = (HashSet) ((HashMap) this.f33496f.f33481f).get(this.f33494d);
        if (hashSet != null) {
            hashSet.remove(this.f33495e);
            if (hashSet.size() == 0) {
                ((HashMap) this.f33496f.f33481f).remove(this.f33494d);
                return;
            }
            ((HashMap) this.f33496f.f33481f).put(this.f33494d, hashSet);
        }
    }
}
