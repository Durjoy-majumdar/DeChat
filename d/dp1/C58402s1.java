package dp1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderVstStruct;
import di3.C86312j;
import eb0.C31543z5;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: dp1.s1 */
public final class C58402s1 {

    /* renamed from: a */
    public static final C58402s1 f167320a = new C58402s1();

    /* renamed from: b */
    public static long f167321b;

    /* renamed from: a */
    public final void mo83241a(AppCompatActivity appCompatActivity, boolean z) {
        String str;
        String str2;
        if (z || f167321b > 0) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(appCompatActivity);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            FinderVstStruct finderVstStruct = new FinderVstStruct();
            String str3 = "";
            if (q3 == null || (str = q3.f134670d) == null) {
                str = str3;
            }
            finderVstStruct.f156256d = finderVstStruct.mo86045b("sessionid", str, true);
            if (!(q3 == null || (str2 = q3.f134671e) == null)) {
                str3 = str2;
            }
            finderVstStruct.f156257e = finderVstStruct.mo86045b("contextid", str3, true);
            finderVstStruct.f156258f = finderVstStruct.mo86045b("event_id", z ? "1" : "2", true);
            finderVstStruct.f156259g = C31543z5.m39453c();
            finderVstStruct.f156260h = finderVstStruct.mo86045b("vst_type", "3", true);
            finderVstStruct.f156261i = (z || f167321b <= 0) ? 0 : C31543z5.m39453c() - f167321b;
            finderVstStruct.mo86054n();
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderVstStruct);
            if (!z) {
                f167321b = 0;
            }
        }
    }
}
