package f40;

import android.os.FileObserver;
import android.text.format.DateFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Date;

/* renamed from: f40.v */
public class C86752v extends FileObserver {

    /* renamed from: a */
    public C86756z f251829a;

    public C86752v(String str, C86756z zVar) {
        super(str, 3780);
        this.f251829a = zVar;
    }

    public void onEvent(int i, String str) {
        Object[] objArr = new Object[2];
        StringBuffer stringBuffer = new StringBuffer();
        if ((i & 4) != 0) {
            stringBuffer.append("ATTRIB|");
        }
        if ((i & 512) != 0) {
            stringBuffer.append("DELETE|");
        }
        if ((i & 1024) != 0) {
            stringBuffer.append("DELETE_SELF|");
        }
        if ((i & 64) != 0) {
            stringBuffer.append("MOVED_FROM|");
        }
        if ((i & 128) != 0) {
            stringBuffer.append("MOVED_TO|");
        }
        if ((i & 2048) != 0) {
            stringBuffer.append("MOVE_SELF|");
        }
        stringBuffer.append(String.format("0x%x", new Object[]{Integer.valueOf(i)}));
        objArr[0] = stringBuffer.toString();
        objArr[1] = str;
        File file = C86751u.f251827a;
        synchronized (C86751u.class) {
            String format = String.format("(%s), %s", objArr);
            if (format == null) {
                format = "";
            }
            String str2 = DateFormat.format("[yyyy-MM-dd HH:mm:ss] ", new Date()) + format;
            Log.m105928w("MicroMsg.FileDisappearedObserver", str2);
            C86751u.f251827a.mkdirs();
            try {
                File file2 = C86751u.f251828b;
                if (!file2.exists()) {
                    file2.createNewFile();
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, "", new Object[0]);
            }
            C86013q1.m106437S(C86751u.f251828b.getAbsolutePath(), str2.getBytes(StandardCharsets.UTF_8));
        }
        C86756z zVar = this.f251829a;
        if (zVar != null) {
            C86755y yVar = (C86755y) zVar;
            yVar.getClass();
            if (str != null && str.endsWith("EnMicroMsg.db")) {
                yVar.mo121160d(i, 4, 10);
                yVar.mo121160d(i, 512, 11);
                yVar.mo121160d(i, 1024, 12);
                yVar.mo121160d(i, 2048, 15);
                yVar.mo121160d(i, 64, 13);
                yVar.mo121160d(i, 128, 14);
            }
        }
    }
}
