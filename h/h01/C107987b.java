package h01;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import i01.C108315a;
import i01.C108316b;
import j01.C108517a;
import j01.C108519c;
import j01.C108520d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k01.C108795a;
import kotlin.ResultKt;
import l01.C109076a;
import l01.C109077b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

/* renamed from: h01.b */
public final class C107987b {

    /* renamed from: a */
    public final C108316b f323372a = new C108316b();

    /* renamed from: b */
    public final C108520d f323373b = new C108519c();

    /* renamed from: c */
    public final C109077b f323374c = new C109076a();

    /* renamed from: d */
    public int f323375d;

    /* renamed from: e */
    public int f323376e;

    /* renamed from: f */
    public final List<C108795a> f323377f = new ArrayList();

    @C91590f(mo125468c = "com.tencent.mm.plugin.cast.transportclient.TransportClient$connect$1", mo125469f = "TransportClient.kt", mo125470l = {71}, mo125471m = "invokeSuspend")
    /* renamed from: h01.b$a */
    public static final class C107988a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f323378d;

        /* renamed from: e */
        public final /* synthetic */ String f323379e;

        /* renamed from: f */
        public final /* synthetic */ int f323380f;

        /* renamed from: g */
        public final /* synthetic */ C107987b f323381g;

        /* renamed from: h */
        public final /* synthetic */ C76095a f323382h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107988a(String str, int i, C107987b bVar, C76095a aVar, C15601d<? super C107988a> dVar) {
            super(2, dVar);
            this.f323379e = str;
            this.f323380f = i;
            this.f323381g = bVar;
            this.f323382h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107988a(this.f323379e, this.f323380f, this.f323381g, this.f323382h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107988a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f323378d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("ScreenRecord.Main", "thread try connect to server " + this.f323379e + XVFSFile.PATH_SEPARATOR_CHAR + this.f323380f);
                C108316b bVar = this.f323381g.f323372a;
                String str = this.f323379e;
                int i2 = this.f323380f;
                this.f323378d = 1;
                bVar.getClass();
                Object g = C53895h.m60469g(C53872d1.f151117a, new C108315a(bVar, str, i2, (C15601d<? super C108315a>) null), this);
                if (g != aVar) {
                    g = C13598b0.f38549a;
                }
                if (g == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Socket:");
            sb.append(this.f323381g.f323372a.f324334b);
            sb.append("status:");
            Socket socket = this.f323381g.f323372a.f324334b;
            C87412m.m108591d(socket);
            sb.append(socket.isConnected());
            Log.m105924i("ScreenRecord.Main", sb.toString());
            Socket socket2 = this.f323381g.f323372a.f324334b;
            if (socket2 != null) {
                C87412m.m108591d(socket2);
                if (socket2.isConnected()) {
                    C107987b bVar2 = this.f323381g;
                    Socket socket3 = bVar2.f323372a.f324334b;
                    C87412m.m108591d(socket3);
                    C108519c cVar = (C108519c) bVar2.f323373b;
                    cVar.getClass();
                    InputStream inputStream = socket3.getInputStream();
                    C87412m.m108593f(inputStream, "socket.getInputStream()");
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C119027c.f356488a);
                    cVar.f324844c = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    cVar.f324843b = true;
                    C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C108517a(cVar, (C15601d<? super C108517a>) null), 3, (Object) null);
                    C109076a aVar2 = (C109076a) bVar2.f323374c;
                    aVar2.getClass();
                    aVar2.f326637b = socket3.getOutputStream();
                    aVar2.f326638c = socket3;
                    aVar2.f326636a = true;
                    C107987b bVar3 = this.f323381g;
                    C108520d dVar = bVar3.f323373b;
                    List<C108795a> list = bVar3.f323377f;
                    C108519c cVar2 = (C108519c) dVar;
                    cVar2.getClass();
                    C87412m.m108594g(list, "handlers");
                    ((ArrayList) cVar2.f324842a).addAll(list);
                }
            }
            this.f323382h.mo105812a(this.f323381g.f323372a.f324333a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo158376a(String str, int i, C76095a aVar) {
        C87412m.m108594g(str, "address");
        C87412m.m108594g(aVar, "callback");
        Log.m105924i("ScreenRecord.Main", "try connect to server " + str + XVFSFile.PATH_SEPARATOR_CHAR + i);
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C107988a(str, i, this, aVar, (C15601d<? super C107988a>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final int mo158377b(byte b, byte[] bArr, byte b2) {
        byte b3 = b;
        byte[] bArr2 = bArr;
        byte b4 = b2;
        C87412m.m108594g(bArr2, "data");
        int length = bArr2.length + 12;
        byte[] bArr3 = new byte[12];
        bArr3[0] = (byte) 105;
        bArr3[1] = (byte) 2;
        bArr3[2] = (byte) (length & 255);
        bArr3[3] = (byte) ((length >>> 8) & 255);
        bArr3[4] = (byte) ((length >>> 16) & 255);
        bArr3[5] = (byte) ((length >>> 24) & 255);
        bArr3[6] = (byte) 12;
        bArr3[7] = (byte) 0;
        bArr3[8] = b3;
        if (b3 == 1) {
            int i = this.f323376e + 1;
            this.f323376e = i;
            bArr3[9] = (byte) (i & 255);
            bArr3[10] = (byte) ((i >>> 8) & 255);
            Log.m105918d("ScreenRecord.Main", "headlen:" + 12 + " pktlen:" + length + " dataType:" + b3 + " typeSeq:" + this.f323376e + " direction:" + b4);
        }
        if (b3 == 2) {
            int i2 = this.f323375d + 1;
            this.f323375d = i2;
            bArr3[9] = (byte) (i2 & 255);
            bArr3[10] = (byte) ((i2 >>> 8) & 255);
            Log.m105918d("ScreenRecord.Main", "headlen:" + 12 + " pktlen:" + length + " dataType:" + b3 + " typeSeq:" + this.f323375d);
        }
        bArr3[11] = b4;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr3, 12 + length2);
        System.arraycopy(bArr2, 0, copyOf, 12, length2);
        C87412m.m108593f(copyOf, "result");
        C109076a aVar = (C109076a) this.f323374c;
        aVar.getClass();
        try {
            if (aVar.f326636a) {
                Socket socket = aVar.f326638c;
                if (socket == null || !socket.isConnected()) {
                    Log.m105920e("MicroMsg.RemoteWriter", "socket not connected");
                    return -1;
                }
                OutputStream outputStream = aVar.f326637b;
                if (outputStream != null) {
                    outputStream.write(copyOf);
                }
                OutputStream outputStream2 = aVar.f326637b;
                if (outputStream2 != null) {
                    outputStream2.flush();
                }
            }
            return 0;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.RemoteWriter", "error happened in send data");
        }
    }
}
