package b10;

import a10.C112726y;
import android.content.Context;
import gy3.C87412m;
import java.util.Map;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: b10.a */
public class C104002a implements C104005d {

    /* renamed from: a */
    public final C112726y f307608a;

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.navigator.FlutterMultiInstanceNavigator", mo125469f = "FlutterMultiInstanceNavigator.kt", mo125470l = {13, 14}, mo125471m = "push$suspendImpl")
    /* renamed from: b10.a$a */
    public static final class C104003a extends C66704d {

        /* renamed from: d */
        public Object f307609d;

        /* renamed from: e */
        public Object f307610e;

        /* renamed from: f */
        public Object f307611f;

        /* renamed from: g */
        public /* synthetic */ Object f307612g;

        /* renamed from: h */
        public final /* synthetic */ C104002a f307613h;

        /* renamed from: i */
        public int f307614i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104003a(C104002a aVar, C15601d<? super C104003a> dVar) {
            super(dVar);
            this.f307613h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307612g = obj;
            this.f307614i |= Integer.MIN_VALUE;
            return C104002a.m138743b(this.f307613h, (Context) null, (String) null, (String) null, (Map) null, this);
        }
    }

    public C104002a(C112726y yVar) {
        C87412m.m108594g(yVar, "flutterInstance");
        this.f307608a = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m138743b(b10.C104002a r24, android.content.Context r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, wx3.C15601d r29) {
        /*
            r0 = r24
            r1 = r29
            boolean r2 = r1 instanceof b10.C104002a.C104003a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            b10.a$a r2 = (b10.C104002a.C104003a) r2
            int r3 = r2.f307614i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f307614i = r3
            goto L_0x001c
        L_0x0017:
            b10.a$a r2 = new b10.a$a
            r2.<init>(r0, r1)
        L_0x001c:
            r7 = r2
            java.lang.Object r1 = r7.f307612g
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r7.f307614i
            r4 = 2
            r5 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0053
            if (r3 == r5) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r0 = r7.f307610e
            a10.y r0 = (a10.C112726y) r0
            java.lang.Object r2 = r7.f307609d
            b10.a r2 = (b10.C104002a) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00ab
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            java.lang.Object r0 = r7.f307611f
            a10.y r0 = (a10.C112726y) r0
            java.lang.Object r3 = r7.f307610e
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r7.f307609d
            b10.a r5 = (b10.C104002a) r5
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r5
            goto L_0x0076
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r1)
            a10.y r1 = new a10.y
            a10.y r3 = r0.f307608a
            a10.c r3 = r3.f337504a
            r6 = r26
            r1.<init>(r3, r6)
            r7.f307609d = r0
            r3 = r25
            r7.f307610e = r3
            r7.f307611f = r1
            r7.f307614i = r5
            r5 = r27
            r6 = r28
            java.lang.Object r5 = r1.mo164471g(r5, r6, r7)
            if (r5 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r5 = r3
            com.tencent.mm.flutter.ui.FlutterPageStyle r6 = new com.tencent.mm.flutter.ui.FlutterPageStyle
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1023(0x3ff, float:1.434E-42)
            r23 = 0
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r8 = 0
            r9 = 4
            r11 = 0
            r7.f307609d = r0
            r7.f307610e = r1
            r7.f307611f = r10
            r7.f307614i = r4
            r3 = r1
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r11
            java.lang.Object r3 = a10.C112726y.m154145i(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x00a9
            return r2
        L_0x00a9:
            r2 = r0
            r0 = r1
        L_0x00ab:
            r0.mo164472h(r2)
            b10.b r0 = new b10.b
            r1 = 0
            r2 = 3
            r0.<init>(r1, r10, r2, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b10.C104002a.m138743b(b10.a, android.content.Context, java.lang.String, java.lang.String, java.util.Map, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo10723a(Context context, String str, String str2, Map<String, Object> map, C15601d<? super C0241b> dVar) {
        return m138743b(this, context, str, str2, map, dVar);
    }
}
