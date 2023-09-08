package es2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import es2.C97696c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: es2.e */
public class C97701e extends C97702f {
    public C97701e(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
    }

    /* renamed from: l */
    public int mo136974l() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
        int i = this.f286618o.f286537a.f298690e;
        SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
        return i;
    }

    /* renamed from: q */
    public boolean mo136976q() {
        SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
        SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
        return true;
    }

    /* renamed from: v */
    public boolean mo136979v(InputStream inputStream, Map<String, List<String>> map) {
        SnsMethodCalculate.markStartTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
        OutputStream outputStream = null;
        try {
            byte[] bArr = new byte[1024];
            C101804kv2 kv22 = this.f286618o.f286537a;
            String c = C94938q1.m120516c(kv22.f298689d, kv22.f298690e == 6 ? ".mp4" : ".jpg");
            Log.m105925i("MicroMsg.SnsDownloadCommonMedia", "download common media. path = %s ", c);
            if (C86013q1.m106450k(c)) {
                SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
                return true;
            } else if (!C86013q1.m106444e(c)) {
                SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
                return false;
            } else {
                outputStream = C86013q1.m106429K(c, false);
                this.f286606C.value = "";
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        if (read > this.f286607D) {
                            this.f286607D = read;
                            Util.nowSecond();
                        }
                        if (this.f286608E == 0) {
                            this.f286608E = Util.milliSecondsToNow(this.f286609F);
                        }
                        if (!C102236a0.m134751j0(C94866e1.xx0())) {
                            outputStream.close();
                            inputStream.close();
                            try {
                                outputStream.close();
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.SnsDownloadCommonMedia", e, "", new Object[0]);
                            }
                            SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
                            return false;
                        }
                        outputStream.write(bArr, 0, read);
                        this.f286615L += read;
                    } else {
                        outputStream.close();
                        SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.SnsDownloadCommonMedia", e2, "snscdndownload fail : " + e2.getMessage(), new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.SnsDownloadCommonMedia", e3, "", new Object[0]);
                }
            }
            SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
            return false;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace("MicroMsg.SnsDownloadCommonMedia", e4, "", new Object[0]);
                }
            }
            SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMedia");
            throw th;
        }
    }
}
