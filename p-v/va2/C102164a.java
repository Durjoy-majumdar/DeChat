package va2;

import com.tencent.p014mm.autogen.mmdata.rpt.MusicPlayReportStruct;
import qc0.C101093a;

/* renamed from: va2.a */
public class C102164a {

    /* renamed from: a */
    public static MusicPlayReportStruct f300829a = null;

    /* renamed from: b */
    public static String f300830b = "1.0";

    /* renamed from: a */
    public static void m134603a() {
        MusicPlayReportStruct musicPlayReportStruct = f300829a;
        if (musicPlayReportStruct != null) {
            musicPlayReportStruct.mo86054n();
        }
    }

    /* renamed from: b */
    public static String m134604b(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i]);
            if (i != strArr.length - 1) {
                stringBuffer.append("|");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static void m134605c() {
        if (f300829a != null) {
            f300829a.mo126622s(m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), f300830b, "end/stop", "1.0", String.valueOf(C101093a.m132479a().f35261b)}));
            m134603a();
        }
    }
}
