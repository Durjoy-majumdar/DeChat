package i01;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.cast.transportclient.connection.Connection$connect$2", mo125469f = "Connection.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: i01.a */
public final class C108315a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C108316b f324330d;

    /* renamed from: e */
    public final /* synthetic */ String f324331e;

    /* renamed from: f */
    public final /* synthetic */ int f324332f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108315a(C108316b bVar, String str, int i, C15601d<? super C108315a> dVar) {
        super(2, dVar);
        this.f324330d = bVar;
        this.f324331e = str;
        this.f324332f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108315a(this.f324330d, this.f324331e, this.f324332f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108315a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C108316b bVar = this.f324330d;
        String str = this.f324331e;
        int i = this.f324332f;
        C76253c cVar = C76253c.TIMEOUT;
        C76253c cVar2 = C76253c.ERROR;
        C76253c cVar3 = bVar.f324333a;
        if (cVar3 == C76253c.DISCONNECTED || cVar3 == cVar2 || cVar3 == cVar) {
            try {
                bVar.f324333a = C76253c.CONNECTING;
                Socket socket = bVar.f324334b;
                C87412m.m108591d(socket);
                socket.connect(new InetSocketAddress(str, i), 2000);
                bVar.f324333a = C76253c.CONNECTED;
                Log.m105918d("TCP Client", "C: Connected...");
            } catch (SocketTimeoutException e) {
                Log.m105921e("client_connection", "connection timeout", e);
                bVar.f324333a = cVar;
                bVar.f324334b = new Socket();
            } catch (Exception e2) {
                Log.m105921e("client_connection", "Fail connection", e2);
                bVar.f324333a = cVar2;
                bVar.f324334b = new Socket();
            }
        }
        return C13598b0.f38549a;
    }
}
