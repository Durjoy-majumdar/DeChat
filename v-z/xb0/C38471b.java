package xb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import lc3.C10485b;

/* renamed from: xb0.b */
public class C38471b {
    /* renamed from: a */
    public static boolean m41885a(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        try {
            int b = m41886b();
            String[] split = str.split(";");
            for (String split2 : split) {
                String[] split3 = split2.split("-");
                String[] split4 = split3[0].split(XVFSFile.PATH_SEPARATOR);
                int safeParseInt = (Util.safeParseInt(split4[0]) * 60) + Util.safeParseInt(split4[1]);
                String[] split5 = split3[1].split(XVFSFile.PATH_SEPARATOR);
                int safeParseInt2 = (Util.safeParseInt(split5[0]) * 60) + Util.safeParseInt(split5[1]);
                if (safeParseInt >= safeParseInt2 ? !((b > 1440 || b < safeParseInt) && (b >= safeParseInt2 || b < 0)) : !(b >= safeParseInt2 || b < safeParseInt)) {
                    return true;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BusyTimeControlLogic", e, "", new Object[0]);
            Log.m105920e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + e.toString());
        }
        return false;
    }

    /* renamed from: b */
    public static int m41886b() {
        String[] split = new SimpleDateFormat("HH:mm").format(new Date()).split(XVFSFile.PATH_SEPARATOR);
        int safeParseInt = ((Util.safeParseInt(split[0]) * 60) + Util.safeParseInt(split[1])) - ((((int) (((long) ((int) (((long) TimeZone.getDefault().getRawOffset()) / 60000))) / 60)) - 8) * 60);
        return safeParseInt < 0 ? safeParseInt + 1440 : safeParseInt >= 1440 ? safeParseInt - 1440 : safeParseInt;
    }

    /* renamed from: c */
    public static boolean m41887c() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("C2CImgNotAutoDownloadTimeRange");
        Log.m105924i("MicroMsg.BusyTimeControlLogic", "C2CImgNotAutoDownloadTimeRange value: " + c);
        return m41885a(c);
    }
}
