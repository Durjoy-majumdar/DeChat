package p335eh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import p213oh.C11412b;
import p213oh.C89209a;

/* renamed from: eh.a */
public class C116767a {

    /* renamed from: a */
    public RandomAccessFile f350069a = null;

    /* renamed from: b */
    public String f350070b;

    /* renamed from: c */
    public String f350071c;

    public C116767a(String str, String str2) {
        this.f350070b = str2;
        String f = C89209a.m111504f(str, str2);
        this.f350071c = f;
        Object[] objArr = {this.f350070b, f};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmCacheFile", "AudioPcmCacheFile mUrl:%s, fileName:%s,", objArr);
    }

    /* renamed from: a */
    public synchronized void mo180733a() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmCacheFile", "close", (Object[]) null);
        RandomAccessFile randomAccessFile = this.f350069a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "close RandomAccessFile error ", "" + e.getMessage());
            }
        }
        return;
    }

    /* renamed from: b */
    public synchronized int mo180734b() {
        RandomAccessFile randomAccessFile = this.f350069a;
        if (randomAccessFile == null) {
            int i = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "getLength error, randomAccessFile is null", (Object[]) null);
            return -1;
        }
        try {
            return (int) randomAccessFile.length();
        } catch (IOException e) {
            Object[] objArr = {"" + e.getMessage()};
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioPcmCacheFile", "Error get length of file , err %s", objArr);
            return -1;
        }
    }
}
