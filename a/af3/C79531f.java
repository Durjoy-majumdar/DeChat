package af3;

import a70.C79471a;
import android.content.Context;
import bf3.C79701c;
import com.tencent.p014mm.recoveryv2.C85671c;
import p329d3.C86165a;
import te3.C90432q93;
import y02.C91363f;

/* renamed from: af3.f */
public class C79531f implements C86165a<Integer> {

    /* renamed from: a */
    public final /* synthetic */ Context f233181a;

    /* renamed from: b */
    public final /* synthetic */ String f233182b;

    /* renamed from: c */
    public final /* synthetic */ C86165a f233183c;

    public C79531f(Context context, String str, C86165a aVar) {
        this.f233181a = context;
        this.f233182b = str;
        this.f233183c = aVar;
    }

    public void accept(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() > 20) {
            Context context = this.f233181a;
            String str = this.f233182b;
            C86165a aVar = this.f233183c;
            C85671c.m105784b("MicroMsg.recovery.operatorFallback", "#fetchTinkerPatchForTest");
            C90432q93 q932 = new C90432q93();
            q932.f259754d = str;
            q932.f259755e = C79471a.m96436a();
            q932.f259756f = C91363f.m114614b();
            q932.f259761n = 1;
            C79701c.m96819a(context, q932, aVar, false);
            return;
        }
        this.f233183c.accept(num);
    }
}
