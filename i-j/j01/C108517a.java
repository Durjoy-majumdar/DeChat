package j01;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import k01.C108795a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.cast.transportclient.reader.RemoteReader$createReader$1", mo125469f = "RemoteReader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j01.a */
public final class C108517a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C108519c f324840d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108517a(C108519c cVar, C15601d<? super C108517a> dVar) {
        super(2, dVar);
        this.f324840d = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108517a(this.f324840d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108517a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C108519c cVar = this.f324840d;
        BufferedReader bufferedReader = cVar.f324844c;
        if (bufferedReader != null) {
            while (cVar.f324843b) {
                try {
                    if (bufferedReader.ready()) {
                        String readLine = bufferedReader.readLine();
                        Iterator it = ((ArrayList) cVar.f324842a).iterator();
                        while (it.hasNext()) {
                            C87412m.m108593f(readLine, "line");
                            ((C108795a) it.next()).mo159895a(readLine);
                        }
                    }
                } catch (NullPointerException e) {
                    Log.m105921e("reader", "No elements come", e);
                } catch (Exception e2) {
                    Log.m105921e("reader", "Unknown error", e2);
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("reader");
        throw null;
    }
}
