package p827uh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.qqpinyin.voicerecoapi.C19979a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import p375qh.C101193k;
import p492dn.C45427v;

/* renamed from: uh.d */
public class C52575d implements C102032a {

    /* renamed from: a */
    public OutputStream f146852a;

    /* renamed from: b */
    public String f146853b;

    /* renamed from: c */
    public C19979a f146854c;

    public C52575d() {
        new ArrayBlockingQueue(1024);
        C45427v.m50377a();
    }

    /* renamed from: a */
    public boolean mo73537a(String str) {
        Log.m105924i("MicroMsg.SpeexWriter", "initWriter, path: " + str);
        if (str == null) {
            return false;
        }
        this.f146853b = str;
        try {
            this.f146852a = C86013q1.m106429K(str, false);
            C19979a aVar = new C19979a();
            this.f146854c = aVar;
            int e = aVar.mo27826e();
            if (e == 0) {
                return true;
            }
            Log.m105920e("MicroMsg.SpeexWriter", "speexInit failed: " + e);
            return false;
        } catch (Exception e2) {
            OutputStream outputStream = this.f146852a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
            Log.m105921e("MicroMsg.SpeexWriter", "Error on init file: ", e2);
            return false;
        }
    }

    /* renamed from: b */
    public int mo73538b(C101193k.C101194a aVar, int i) {
        return mo73540d(aVar, i, false);
    }

    /* renamed from: c */
    public boolean mo73539c() {
        C19979a aVar = this.f146854c;
        if (aVar != null) {
            aVar.mo27827f();
            this.f146854c = null;
        }
        C19979a aVar2 = new C19979a();
        this.f146854c = aVar2;
        int e = aVar2.mo27826e();
        if (e == 0) {
            return true;
        }
        Log.m105920e("MicroMsg.SpeexWriter", "resetWriter speexInit failed: " + e);
        return false;
    }

    /* renamed from: d */
    public int mo73540d(C101193k.C101194a aVar, int i, boolean z) {
        byte[] bArr;
        int i2;
        C19979a aVar2 = this.f146854c;
        if (aVar2 == null || (bArr = aVar.f296199a) == null || (i2 = aVar.f296200b) == 0) {
            Log.m105920e("MicroMsg.SpeexWriter", "try write invalid data to file");
            return -1;
        }
        try {
            byte[] d = aVar2.mo27825d(bArr, 0, i2);
            if (d == null || d.length <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("convert failed: ");
                sb.append(d == null ? "outBuffer is null" : "size is zero");
                Log.m105920e("MicroMsg.SpeexWriter", sb.toString());
                return -1;
            }
            Log.m105919d("MicroMsg.SpeexWriter", "write to file, len: %d", Integer.valueOf(d.length));
            this.f146852a.write(d);
            this.f146852a.flush();
            return d.length;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SpeexWriter", "write to file failed", e);
            return -1;
        }
    }

    /* renamed from: e */
    public void mo73541e() {
        Log.m105924i("MicroMsg.SpeexWriter", "wait Stop");
        synchronized (this) {
        }
        C19979a aVar = this.f146854c;
        if (aVar != null) {
            aVar.mo27827f();
            this.f146854c = null;
        }
        OutputStream outputStream = this.f146852a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SpeexWriter", "close silk file: " + this.f146853b + "msg: " + e.getMessage());
            }
            this.f146852a = null;
        }
    }
}
