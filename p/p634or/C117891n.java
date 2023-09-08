package p634or;

import a10.C112717f;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import fu1.C116900d;
import iu1.C117270a;
import p172io.flutter.plugin.report.FlutterAnrReport;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: or.n */
public class C117891n extends C86301e {
    public void onCreate(Context context) {
        C112717f fVar = C112717f.f337490a;
        C112717f.f337491b = new C116900d();
        FlutterAnrReport.setCallback(new C117270a());
    }
}
