package kq1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$watermarkDetectInner$2", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {224}, mo125471m = "invokeSuspend")
/* renamed from: kq1.q */
public final class C61142q extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public long f174073d;

    /* renamed from: e */
    public Object f174074e;

    /* renamed from: f */
    public int f174075f;

    /* renamed from: g */
    public final /* synthetic */ String f174076g;

    /* renamed from: h */
    public final /* synthetic */ long f174077h;

    /* renamed from: i */
    public final /* synthetic */ long f174078i;

    /* renamed from: j */
    public final /* synthetic */ C61137l f174079j;

    /* renamed from: n */
    public final /* synthetic */ int f174080n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61142q(String str, long j, long j2, C61137l lVar, int i, C15601d<? super C61142q> dVar) {
        super(2, dVar);
        this.f174076g = str;
        this.f174077h = j;
        this.f174078i = j2;
        this.f174079j = lVar;
        this.f174080n = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61142q(this.f174076g, this.f174077h, this.f174078i, this.f174079j, this.f174080n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61142q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f174075f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            long r0 = r10.f174073d
            java.lang.Object r3 = r10.f174074e
            oj.c r3 = (p914oj.C89231c) r3
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0083, all -> 0x0014 }
            goto L_0x006a
        L_0x0014:
            r11 = move-exception
            goto L_0x007a
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r11)
            long r4 = android.os.SystemClock.uptimeMillis()
            oj.c r11 = new oj.c
            r11.<init>()
            java.lang.String r1 = r10.f174076g     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r11.setDataSource(r1)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            long r6 = r10.f174077h     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r1 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r1     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            long r6 = r6 * r8
            android.graphics.Bitmap r1 = r11.getFrameAtTime(r6)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            long r6 = r10.f174078i     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            long r6 = r6 * r8
            android.graphics.Bitmap r6 = r11.getFrameAtTime(r6)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r7.<init>()     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            if (r1 == 0) goto L_0x004c
            r7.add(r1)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
        L_0x004c:
            if (r6 == 0) goto L_0x0051
            r7.add(r6)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
        L_0x0051:
            boolean r1 = r7.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0073
            kq1.l r1 = r10.f174079j     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r10.f174074e = r11     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r10.f174073d = r4     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            r10.f174075f = r3     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            java.lang.Object r1 = kq1.C61137l.m71702g3(r1, r7, r10)     // Catch:{ IllegalArgumentException -> 0x0081, RuntimeException -> 0x007e, all -> 0x0077 }
            if (r1 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r3 = r11
            r11 = r1
            r0 = r4
        L_0x006a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0083, all -> 0x0014 }
            boolean r11 = r11.booleanValue()     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0083, all -> 0x0014 }
            r2 = r11
            r4 = r0
            r11 = r3
        L_0x0073:
            r11.release()     // Catch:{ RuntimeException -> 0x0087 }
            goto L_0x0087
        L_0x0077:
            r0 = move-exception
            r3 = r11
            r11 = r0
        L_0x007a:
            r3.release()     // Catch:{ RuntimeException -> 0x007d }
        L_0x007d:
            throw r11
        L_0x007e:
            r3 = r11
            r0 = r4
            goto L_0x0083
        L_0x0081:
            r3 = r11
            r0 = r4
        L_0x0083:
            r3.release()     // Catch:{ RuntimeException -> 0x0086 }
        L_0x0086:
            r4 = r0
        L_0x0087:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "[watermarkDet] video index:"
            r11.append(r0)
            int r0 = r10.f174080n
            r11.append(r0)
            java.lang.String r0 = ", has watermark: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = ", detectTime:"
            r11.append(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r4
            r11.append(r0)
            java.lang.String r0 = ", startTimeMs:"
            r11.append(r0)
            long r0 = r10.f174077h
            r11.append(r0)
            java.lang.String r0 = " endTimeMs:"
            r11.append(r0)
            long r0 = r10.f174078i
            r11.append(r0)
            java.lang.String r0 = ", path:"
            r11.append(r0)
            java.lang.String r0 = r10.f174076g
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Finder.PostSafePreCheckUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61142q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
