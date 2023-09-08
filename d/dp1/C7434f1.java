package dp1;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import er1.C58784w3;
import gy3.C87412m;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: dp1.f1 */
public final class C7434f1 {

    /* renamed from: a */
    public static final C7434f1 f25625a = new C7434f1();

    /* renamed from: a */
    public static void m7549a(C7434f1 f1Var, C49712hj1 hj12, int i, long j, int i2, int i3, String str, Integer num, String str2, int i4, Object obj) {
        if ((i4 & 64) != 0) {
            num = null;
        }
        if ((i4 & 128) != 0) {
            str2 = "";
        }
        f1Var.getClass();
        C87412m.m108594g(str, "wording");
        if (hj12 != null) {
            boolean G0 = C58784w3.f168295a.mo83869G0();
            StringBuilder sb = new StringBuilder();
            sb.append("FinderShareReporter.report21673, sessionId = ");
            sb.append(hj12.f134670d);
            sb.append(", clickTabContextId = ");
            sb.append(hj12.f134672f);
            sb.append(", contextId = ");
            sb.append(hj12.f134671e);
            sb.append(", commentScene = ");
            sb.append(hj12.f134675i);
            sb.append(", eventCode = ");
            sb.append(i);
            sb.append(", eventTime = ");
            sb.append(j);
            sb.append(", index = ");
            sb.append(i2);
            sb.append(", jumpType=");
            sb.append(i3);
            sb.append(", entranceStatus=");
            sb.append(G0 ? 1 : 0);
            sb.append(", wording=");
            sb.append(str);
            sb.append(", frilikecnt=");
            sb.append(num == null ? "null" : num);
            Log.m105924i("Finder.FinderShareReporter", sb.toString());
            C115669n.INSTANCE.mo160131h(21673, hj12.f134670d, hj12.f134672f, hj12.f134671e, Integer.valueOf(hj12.f134675i), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(G0), str, num, str2);
        }
    }

    /* renamed from: b */
    public final void mo8576b(Context context, int i, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "position");
        long c = C31543z5.m39453c();
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        Log.m105924i("Finder.FinderShareReporter", "FinderShareReporter.report21856, sessionId = " + q3.f134670d + ", clickTabContextId = " + q3.f134672f + ", contextId = " + q3.f134671e + ", commentScene = " + q3.f134675i + ", eventCode = " + i + ", eventTime = " + c + ", position = " + str);
        C115669n.INSTANCE.mo160131h(21856, q3.f134670d, q3.f134672f, q3.f134671e, Integer.valueOf(q3.f134675i), Integer.valueOf(i), Long.valueOf(c), str);
    }
}
