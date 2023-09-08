package p157gk;

import a14.C0000n0;
import android.util.Pair;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyClusterReq$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {255, 267}, mo125471m = "invokeSuspend")
/* renamed from: gk.l */
public final class C59493l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f170000d;

    /* renamed from: e */
    public Object f170001e;

    /* renamed from: f */
    public Object f170002f;

    /* renamed from: g */
    public int f170003g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList<QueryImageData> f170004h;

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyClusterReq$2$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {271}, mo125471m = "invokeSuspend")
    /* renamed from: gk.l$a */
    public static final class C59494a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170005d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<Pair<String, String>> f170006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59494a(ArrayList<Pair<String, String>> arrayList, C15601d<? super C59494a> dVar) {
            super(2, dVar);
            this.f170006e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59494a(this.f170006e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59494a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170005d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", cluster stop");
                C59503r.f170046g = false;
                C59503r.f170047h = false;
                C59503r rVar = C59503r.f170040a;
                ArrayList<Pair<String, String>> arrayList = this.f170006e;
                this.f170005d = 1;
                if (C59503r.m69405a(rVar, arrayList, this) == aVar) {
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
    public C59493l(ArrayList<QueryImageData> arrayList, C15601d<? super C59493l> dVar) {
        super(2, dVar);
        this.f170004h = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59493l(this.f170004h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59493l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170003g
            r3 = 2
            r4 = 1
            java.lang.String r5 = "it.scanImagePath"
            java.lang.String r6 = "MicroMsg.ImageQuerySDKCore"
            if (r2 == 0) goto L_0x0032
            if (r2 == r4) goto L_0x001f
            if (r2 != r3) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x0195
        L_0x0017:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001f:
            java.lang.Object r2 = r0.f170002f
            com.tencent.mm.api.QueryImageData r2 = (com.tencent.p014mm.api.QueryImageData) r2
            java.lang.Object r7 = r0.f170001e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f170000d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            kotlin.ResultKt.throwOnFailure(r20)
            r9 = r20
            r15 = r0
            goto L_0x0098
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r2.append(r7)
            java.lang.String r7 = ", cluster start， buffer size： "
            r2.append(r7)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r7 = r0.f170004h
            int r7 = r7.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r7 = r0.f170004h
            java.util.Iterator r7 = r7.iterator()
            r15 = r0
        L_0x0066:
            boolean r8 = r7.hasNext()
            r14 = 0
            if (r8 == 0) goto L_0x00d2
            java.lang.Object r8 = r7.next()
            com.tencent.mm.api.QueryImageData r8 = (com.tencent.p014mm.api.QueryImageData) r8
            gk.r r9 = p157gk.C59503r.f170040a
            java.lang.String r10 = r8.f154726g
            gy3.C87412m.m108593f(r10, r5)
            r15.f170000d = r2
            r15.f170001e = r7
            r15.f170002f = r8
            r15.f170003g = r4
            r9.getClass()
            au3.a r9 = au3.C54328a.f152462f
            gk.s r11 = new gk.s
            r11.<init>(r10, r4, r14)
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r11, r15)
            if (r9 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r18 = r8
            r8 = r2
            r2 = r18
        L_0x0098:
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r10 = r9.first
            java.nio.Buffer r10 = (java.nio.Buffer) r10
            java.lang.Object r9 = r9.second
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L_0x00c1
            if (r10 != 0) goto L_0x00a7
            goto L_0x00c1
        L_0x00a7:
            java.util.HashSet<java.lang.String> r11 = p157gk.C59503r.f170055p
            java.lang.String r12 = r2.f154726g
            r11.add(r12)
            com.tencent.mm.xeffect.FaceBufferData r11 = new com.tencent.mm.xeffect.FaceBufferData
            java.lang.String r2 = r2.f154726g
            int r12 = r9.getWidth()
            int r9 = r9.getHeight()
            r11.<init>(r2, r10, r12, r9)
            r8.add(r11)
            goto L_0x00d0
        L_0x00c1:
            java.lang.String r9 = "applyClusterReq >> Cluster decode error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
            com.tencent.mm.storage.a4 r9 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.lang.String r2 = r2.f154726g
            gy3.C87412m.m108593f(r2, r5)
            r9.mo81937b(r2)
        L_0x00d0:
            r2 = r8
            goto L_0x0066
        L_0x00d2:
            ja3.a r5 = p157gk.C59503r.f170042c
            if (r5 == 0) goto L_0x0160
            java.lang.String r13 = p157gk.C59503r.f170050k
            boolean r7 = p157gk.C59503r.f170046g
            r4 = r4 ^ r7
            java.lang.String r7 = "bufferList"
            gy3.C87412m.m108594g(r2, r7)
            long r7 = r5.f173135c
            java.lang.String r12 = "MicroMsg.WeChatClsManager"
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x00f7
            java.lang.String r2 = "applyClusterReq >> weClusterHandle no init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7 = r14
            r14 = r2
            goto L_0x0161
        L_0x00f7:
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "bufferList size: "
            r7.append(r8)
            int r8 = r2.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            long r8 = r5.f173135c
            long r10 = r5.f173134b
            r5 = r12
            r12 = r2
            r7 = r14
            r14 = r4
            java.util.ArrayList r4 = com.tencent.p014mm.xeffect.WeFaceCluster.nGetClusterCenterWithHistory(r8, r10, r12, r13, r14)
            if (r4 != 0) goto L_0x012c
            java.lang.String r4 = "this time to cluster, result is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x012c:
            r14 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "cluster num: "
            r4.append(r8)
            int r8 = r14.size()
            r4.append(r8)
            java.lang.String r8 = ",bufferList size: "
            r4.append(r8)
            int r2 = r2.size()
            r4.append(r2)
            java.lang.String r2 = ", spend time: "
            r4.append(r2)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r16
            r4.append(r8)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x0161
        L_0x0160:
            r7 = r14
        L_0x0161:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = ", cluster stop"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            gk.l$a r4 = new gk.l$a
            r4.<init>(r14, r7)
            r15.f170000d = r7
            r15.f170001e = r7
            r15.f170002f = r7
            r15.f170003g = r3
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r4, r15)
            if (r2 != r1) goto L_0x0195
            return r1
        L_0x0195:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59493l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
