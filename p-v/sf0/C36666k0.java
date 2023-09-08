package sf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.decoder.EncoderWriter;
import java.io.InputStream;

/* renamed from: sf0.k0 */
public class C36666k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f97452d;

    /* renamed from: e */
    public final /* synthetic */ String f97453e;

    /* renamed from: f */
    public final /* synthetic */ boolean f97454f;

    /* renamed from: g */
    public final /* synthetic */ int f97455g;

    public C36666k0(String str, String str2, boolean z, int i) {
        this.f97452d = str;
        this.f97453e = str2;
        this.f97454f = z;
        this.f97455g = i;
    }

    public void run() {
        boolean z;
        String str = this.f97452d;
        String str2 = this.f97453e;
        boolean z2 = this.f97454f;
        int i = this.f97455g;
        int i2 = 0;
        int i3 = 1;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.StackReportUploader", "uploadFile param err file:%s  user:%s", str, str2);
            return;
        }
        int l = (int) C86013q1.m106451l(str);
        if (l <= 0) {
            Log.m105921e("MicroMsg.StackReportUploader", "uploadFile err len file:%s len:%d", str, Integer.valueOf(l));
        } else if (l <= 128000) {
            int i4 = -1;
            byte[] O = C86013q1.m106433O(str, 0, -1);
            boolean b = C90187l0.m112864b(O, str, str2, i);
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(b);
            if (O != null) {
                i4 = O.length;
            }
            objArr[1] = Integer.valueOf(i4);
            objArr[2] = str;
            Log.m105919d("MicroMsg.StackReportUploader", "uploadFile ret:%b size:%d file:%s", objArr);
            if (b && z2) {
                C86013q1.m106445f(str);
            }
        } else {
            int i5 = 127988;
            int i6 = (l / 127988) + 1;
            byte[] bArr = new byte[EncoderWriter.OUTPUT_AUDIO_BIT_RATE];
            int nowMilliSecond = (int) Util.nowMilliSecond();
            InputStream inputStream = null;
            try {
                inputStream = C86013q1.m106423E(str);
                int i7 = 0;
                while (true) {
                    if (i7 < i6) {
                        int read = inputStream.read(bArr, 12, i5);
                        if (read < 0) {
                            Object[] objArr2 = new Object[i3];
                            objArr2[i2] = str;
                            Log.m105921e("MicroMsg.StackReportUploader", "uploadFile read failed file:%s", objArr2);
                            break;
                        }
                        C90187l0.m112863a(nowMilliSecond, bArr, i2);
                        C90187l0.m112863a(i7, bArr, 4);
                        C90187l0.m112863a(read, bArr, 8);
                        if (read < i5) {
                            int i8 = read + 12;
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(bArr, i2, bArr2, i2, i8);
                            z = C90187l0.m112864b(bArr2, str, str2, i);
                        } else {
                            z = C90187l0.m112864b(bArr, str, str2, i);
                        }
                        Log.m105919d("MicroMsg.StackReportUploader", "uploadFile idx:%d(%d) read:%d ret:%b size:%d file:%s", Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(read), Boolean.valueOf(z), Integer.valueOf(l), str);
                        i7++;
                        i2 = 0;
                        i3 = 1;
                        i5 = 127988;
                    } else {
                        if (z2) {
                            C86013q1.m106445f(str);
                        }
                        if (inputStream == null) {
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.StackReportUploader", "exception:%s", Util.stackTraceToString(e));
                Log.m105921e("MicroMsg.StackReportUploader", "uploadFile read except file:%s", str);
                if (inputStream == null) {
                    return;
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
        }
    }
}
