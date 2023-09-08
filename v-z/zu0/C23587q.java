package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import gv0.C20852h;

/* renamed from: zu0.q */
public class C23587q implements Runnable {

    /* renamed from: d */
    public String f67657d;

    /* renamed from: e */
    public C23588r f67658e;

    /* renamed from: f */
    public long f67659f;

    /* renamed from: g */
    public long f67660g;

    /* renamed from: h */
    public String f67661h;

    /* renamed from: i */
    public int f67662i;

    /* renamed from: j */
    public C23584k f67663j;

    /* renamed from: n */
    public String f67664n;

    /* renamed from: o */
    public String f67665o;

    public C23587q(String str, C23584k kVar, String str2, int i, long j, long j2, String str3, String str4, C23588r rVar) {
        this.f67657d = str3;
        this.f67658e = rVar;
        this.f67659f = j;
        this.f67660g = j2;
        this.f67661h = str4;
        this.f67662i = i;
        this.f67663j = kVar;
        this.f67664n = str2;
        this.f67665o = str;
    }

    public void run() {
        int i = this.f67662i;
        boolean z = i == this.f67663j.f67615d.mo142622e().f303749c - 1;
        C20852h hVar = new C20852h(this.f67664n, this.f67659f, this.f67660g, this.f67657d, this.f67661h, new q$$a(this, i, z, new MMConditionVariable(!z)));
        hVar.mo32547o1();
        Log.m105925i(this.f67665o, "SendTagRunnable doScene talker:%s, tagTextClientId:%s, seq:%d", this.f67664n, this.f67657d, Integer.valueOf(hVar.f58887d));
        if (z) {
            Log.m105929w(this.f67665o, "sendTag last Session :[%d/%d] wait tag resp callback .", Integer.valueOf(this.f67662i), Integer.valueOf(this.f67663j.f67615d.mo142622e().f303749c - 1));
        }
    }

    public String toString() {
        return this.f67665o + ".sendTag";
    }
}
