package sf0;

import android.content.SharedPreferences;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import p823sg.C118283d;
import p823sg.C90193h;
import p823sg.C90197s;
import qe3.C89625d;

/* renamed from: sf0.l0 */
public class C90187l0 {
    /* renamed from: a */
    public static boolean m112863a(int i, byte[] bArr, int i2) {
        if (bArr == null || bArr.length < i2 + 4) {
            return false;
        }
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        return true;
    }

    /* renamed from: b */
    public static boolean m112864b(byte[] bArr, String str, String str2, int i) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105921e("MicroMsg.StackReportUploader", "read file failed:%s", str);
            return false;
        } else if (bArr.length > 128000) {
            Log.m105921e("MicroMsg.StackReportUploader", "file :%s data len error:%d", str, Integer.valueOf(bArr.length));
            return false;
        } else {
            int length = bArr.length;
            String lowerCase = C90193h.m112878f(String.format("weixin#$()%d%d", new Object[]{Integer.valueOf(C89625d.f257841g), Integer.valueOf(length)}).getBytes()).toLowerCase();
            byte[] a = C90197s.m112889a(bArr);
            if (Util.isNullOrNil(a)) {
                Log.m105921e("MicroMsg.StackReportUploader", "zip data failed file:%s", str);
                return false;
            }
            PByteArray pByteArray = new PByteArray();
            C118283d.m166849b(pByteArray, a, lowerCase.getBytes());
            byte[] bArr2 = pByteArray.value;
            if (Util.isNullOrNil(bArr2)) {
                Log.m105921e("MicroMsg.StackReportUploader", "encrypt data failed file:%s", str);
            }
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((HttpWrapperBase.PROTOCAL_HTTPS + sharedPreferences.getString("support.weixin.qq.com", "support.weixin.qq.com")) + "/cgi-bin/mmsupport-bin/stackreport?version=");
            stringBuffer.append("" + Integer.toHexString(C89625d.f257841g));
            stringBuffer.append("&devicetype=");
            stringBuffer.append(C89625d.m112060a());
            stringBuffer.append("&filelength=");
            stringBuffer.append(length);
            stringBuffer.append("&sum=");
            stringBuffer.append(lowerCase);
            stringBuffer.append("&reporttype=");
            stringBuffer.append(i);
            stringBuffer.append("&reportvalue=");
            stringBuffer.append("" + Util.nowMilliSecond() + ".0.1");
            if (str2 != null && !str2.equals("")) {
                stringBuffer.append("&username=");
                stringBuffer.append(str2);
            }
            HttpClient c = C81035d.m98962c();
            HttpPost httpPost = new HttpPost(stringBuffer.toString());
            try {
                ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr2);
                byteArrayEntity.setContentType("binary/octet-stream");
                httpPost.setEntity(byteArrayEntity);
                HttpResponse execute = c.execute(httpPost);
                if (execute == null || execute.getStatusLine() == null) {
                    Log.m105920e("MicroMsg.StackReportUploader", "execute http failed resp null");
                    return false;
                } else if (execute.getStatusLine().getStatusCode() == 200) {
                    return true;
                } else {
                    Log.m105921e("MicroMsg.StackReportUploader", "error response code:%d ", Integer.valueOf(execute.getStatusLine().getStatusCode()));
                    return false;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.StackReportUploader", "exception:%s", Util.stackTraceToString(e));
                Log.m105919d("MicroMsg.StackReportUploader", "execute post failed msg:%s", e.getMessage());
                return false;
            }
        }
    }
}
