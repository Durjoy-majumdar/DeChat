package p350jh;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import nb0.C88912b;
import p213oh.C11412b;
import p348ih.C21088l;
import p366nh.C21632c;

/* renamed from: jh.d */
public class C21241d extends C21088l {

    /* renamed from: g */
    public C21245h f60049g;

    /* renamed from: h */
    public boolean f60050h = false;

    /* renamed from: i */
    public C21632c f60051i;

    public C21241d(C21245h hVar, String str, int i) {
        super(str, i);
        this.f60049g = hVar;
    }

    /* renamed from: a */
    public void mo32806a() {
        this.f60050h = false;
    }

    public void run() {
        Object[] objArr = {this.f59643d};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDownloadTask", "run task %s", objArr);
        if (this.f60050h) {
            ((C21240c) this.f60049g).mo33231a(this);
            return;
        }
        Process.setThreadPriority(10);
        C21245h hVar = this.f60049g;
        C21632c cVar = this.f60051i;
        C21240c cVar2 = (C21240c) hVar;
        cVar2.f60046b = false;
        if (cVar == null) {
            C21243f fVar = cVar2.f60047c;
            if (fVar != null) {
                ((C21238a) fVar).mo33230a((C88912b) null);
            }
            Log.m105921e("MicroMsg.Mix.AudioDownloadProcess", "process source is null", (Object[]) null);
            cVar2.f60046b = true;
        } else {
            cVar2.f60045a = false;
            C88912b a = cVar.mo32136a();
            if (a != null) {
                Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "audio:%s, url:%s", a.f256416a, a.f256417b);
            }
            cVar2.f60048d = a;
            cVar.connect();
            Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "source connect, stop:%b", Boolean.valueOf(cVar2.f60046b));
            long j = -1;
            String str = "";
            int i2 = 0;
            while (true) {
                if (i2 >= 3 || cVar2.f60046b) {
                    break;
                }
                i2++;
                if (j <= 0) {
                    j = cVar.getSize();
                }
                long j2 = j;
                if (TextUtils.isEmpty(str)) {
                    str = cVar.mo32137b();
                }
                Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "fileSize:%d, mimetype:%s, tryCount:%d", Long.valueOf(j2), str, Integer.valueOf(i2));
                if (j2 <= 0 || TextUtils.isEmpty(str)) {
                    j = j2;
                } else if (TextUtils.isEmpty(str) || !str.contains("text/")) {
                    byte[] bArr = new byte[8192];
                    int i3 = 0;
                    while (true) {
                        long j3 = (long) i3;
                        if (j3 >= j2 || cVar2.f60046b) {
                            break;
                        }
                        int readAt = cVar.readAt(j3, bArr, 0, 8192);
                        if (readAt < 0) {
                            Log.m105921e("MicroMsg.Mix.AudioDownloadProcess", "readSize:%d, terminal process or read end", Integer.valueOf(readAt));
                            break;
                        }
                        i3 += readAt;
                    }
                    Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "offSize:%d", Integer.valueOf(i3));
                    cVar2.f60045a = true;
                } else {
                    Log.m105921e("MicroMsg.Mix.AudioDownloadProcess", "mimetype not support", (Object[]) null);
                }
            }
            cVar.disconnect();
            Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "source disconnect", (Object[]) null);
        }
        ((C21240c) this.f60049g).mo33231a(this);
        this.f60050h = true;
        Log.m105925i("MicroMsg.Mix.AudioDownloadTask", "run task %s end", this.f59643d);
    }
}
