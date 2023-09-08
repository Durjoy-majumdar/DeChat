package p661qj;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;
import p910lj.C76701a;
import tc2.C118418g;
import yc3.C38992a;

/* renamed from: qj.g */
public class C35908g implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95799a = 0;

    static {
        C30650a.m39147b(new C35908g(), "//normsg");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (!CrashReportFactory.hasDebuger() || strArr.length < 2) {
            return false;
        }
        try {
            if (strArr.length >= 3) {
                Integer.valueOf(strArr[2]).intValue();
            }
        } catch (Exception unused) {
        }
        String lowerCase = strArr[1].toLowerCase();
        long nanoTime = System.nanoTime();
        lowerCase.getClass();
        if (lowerCase.equals("testrpp")) {
            C117361f.INSTANCE.mo182033dk(0, 1008);
            C76701a.makeText(context, (CharSequence) "info is reported.", 0).show();
        } else if (!lowerCase.equals("oaid")) {
            return false;
        } else {
            String r4 = C118418g.INSTANCE.mo175831r4();
            C76701a.makeText(context, (CharSequence) "oaid: " + r4, 1).show();
            Log.m105925i("MicroMsg.NorMsgTest", "[+] oaid: %s", r4);
        }
        String format = String.format("[NorMsgTest] cmd: %s, time: %d ns.", new Object[]{strArr[1], Long.valueOf(System.nanoTime() - nanoTime)});
        Log.m105924i("MicroMsg.NorMsgTest", format);
        C76701a.makeText(context, (CharSequence) format, 0).show();
        return true;
    }
}
