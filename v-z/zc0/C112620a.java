package zc0;

import com.tencent.p014mm.plugin.imgenc.MMIMAGEENCJNI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zc0.a */
public class C112620a {

    /* renamed from: a */
    public long f337274a = 0;

    /* renamed from: b */
    public String f337275b;

    /* renamed from: c */
    public long f337276c = 0;

    public C112620a(long j) {
        this.f337275b = String.valueOf(j);
        Log.m105924i("MicroMsg.EncEngine", "init  key  enckey " + this.f337275b + "  hashcode " + hashCode());
        this.f337276c = MMIMAGEENCJNI.open(this.f337275b);
        try {
            Log.m105924i("MicroMsg.EncEngine", "mNativePtr " + this.f337276c + " " + hashCode());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.EncEngine", "exception " + e.getMessage());
        }
    }
}
