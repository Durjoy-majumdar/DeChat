package p157gk;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import au3.C54328a;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeChatCls;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import ig3.C60280b;
import ja3.C60786a;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyLabelReq$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {222, 243}, mo125471m = "invokeSuspend")
/* renamed from: gk.m */
public final class C59495m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170007d;

    /* renamed from: e */
    public final /* synthetic */ Buffer f170008e;

    /* renamed from: f */
    public final /* synthetic */ int f170009f;

    /* renamed from: g */
    public final /* synthetic */ int f170010g;

    /* renamed from: h */
    public final /* synthetic */ QueryImageData f170011h;

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyLabelReq$2$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {238}, mo125471m = "invokeSuspend")
    /* renamed from: gk.m$a */
    public static final class C59496a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170012d;

        /* renamed from: e */
        public final /* synthetic */ QueryImageData f170013e;

        /* renamed from: f */
        public final /* synthetic */ StringBuilder f170014f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59496a(QueryImageData queryImageData, StringBuilder sb, C15601d<? super C59496a> dVar) {
            super(2, dVar);
            this.f170013e = queryImageData;
            this.f170014f = sb;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59496a(this.f170013e, this.f170014f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59496a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170012d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<QueryImageData> arrayList = C59503r.f170048i;
                arrayList.add(this.f170013e);
                HashMap<String, QueryImageData> hashMap = C59503r.f170045f;
                String str = this.f170013e.f154726g;
                C87412m.m108593f(str, "imageData.scanImagePath");
                QueryImageData queryImageData = this.f170013e;
                queryImageData.f154727h = this.f170014f.toString();
                queryImageData.f154728i = "#";
                hashMap.put(str, queryImageData);
                if (arrayList.size() >= 2 && !C59503r.f170047h) {
                    C59503r.f170047h = true;
                    Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", cluster start");
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    arrayList.clear();
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis);
                    C60280b.f171852i = currentTimeMillis;
                    C59503r rVar = C59503r.f170040a;
                    this.f170012d = 1;
                    rVar.getClass();
                    Object g = C53895h.m60469g(C54328a.f152462f, new C59493l(arrayList2, (C15601d<? super C59493l>) null), this);
                    if (g != aVar) {
                        g = C13598b0.f38549a;
                    }
                    if (g == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyLabelReq$2$3", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {244}, mo125471m = "invokeSuspend")
    /* renamed from: gk.m$b */
    public static final class C59497b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170015d;

        /* renamed from: e */
        public final /* synthetic */ QueryImageData f170016e;

        /* renamed from: f */
        public final /* synthetic */ StringBuilder f170017f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59497b(QueryImageData queryImageData, StringBuilder sb, C15601d<? super C59497b> dVar) {
            super(2, dVar);
            this.f170016e = queryImageData;
            this.f170017f = sb;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59497b(this.f170016e, this.f170017f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59497b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170015d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C59503r rVar = C59503r.f170040a;
                QueryImageData queryImageData = this.f170016e;
                String sb = this.f170017f.toString();
                C87412m.m108593f(sb, "labelIdSb.toString()");
                this.f170015d = 1;
                if (C59503r.m69406b(rVar, queryImageData, sb, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59495m(Buffer buffer, int i, int i2, QueryImageData queryImageData, C15601d<? super C59495m> dVar) {
        super(2, dVar);
        this.f170008e = buffer;
        this.f170009f = i;
        this.f170010g = i2;
        this.f170011h = queryImageData;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59495m(this.f170008e, this.f170009f, this.f170010g, this.f170011h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59495m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList<String> arrayList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170007d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", label start");
            C60786a aVar2 = C59503r.f170042c;
            if (aVar2 != null) {
                Buffer buffer = this.f170008e;
                int i2 = this.f170009f;
                int i3 = this.f170010g;
                C87412m.m108594g(buffer, "dataBuffer");
                long j = aVar2.f173133a;
                if (j == 0) {
                    Log.m105920e("MicroMsg.WeChatClsManager", "applyReq >> weChatClsHandle no init");
                    arrayList = new ArrayList<>();
                } else {
                    arrayList = WeChatCls.nApply(j, buffer, i2, i3);
                }
            } else {
                arrayList = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            sb.append(", applyLabel result: ");
            sb.append(arrayList != null ? new Integer(arrayList.size()) : null);
            Log.m105924i("MicroMsg.ImageQuerySDKCore", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            C8477a0 a0Var = new C8477a0();
            if (arrayList != null) {
                QueryImageData queryImageData = this.f170011h;
                for (String str : arrayList) {
                    String str2 = (String) C110818d0.m150923U(C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null));
                    Log.m105924i("MicroMsg.ImageQuerySDKCore", str + "||" + queryImageData.f154726g + "||" + str2);
                    sb4.append(str2);
                    sb4.append("#");
                    if (C59503r.f170041b.contains(str2)) {
                        a0Var.f27482d = true;
                    }
                }
            }
            Log.m105924i("MicroMsg.ImageQuerySDKCore", sb4.toString());
            if (a0Var.f27482d) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C59496a aVar3 = new C59496a(this.f170011h, sb4, (C15601d<? super C59496a>) null);
                this.f170007d = 1;
                if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                C53896h0 h0Var2 = C53872d1.f151117a;
                C53915k2 k2Var2 = C58901s.f168555a;
                C59497b bVar = new C59497b(this.f170011h, sb4, (C15601d<? super C59497b>) null);
                this.f170007d = 2;
                if (C53895h.m60469g(k2Var2, bVar, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
