package w70;

import android.widget.TextView;
import e80.C107255c;
import fy3.C32226l;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: w70.a */
public final class C111737a {

    /* renamed from: a */
    public static final C111737a f334621a = new C111737a();

    /* renamed from: b */
    public static long f334622b = System.currentTimeMillis();

    /* renamed from: c */
    public static TextView f334623c;

    /* renamed from: d */
    public static C107255c f334624d;

    /* renamed from: e */
    public static boolean f334625e;

    /* renamed from: f */
    public static final C111740b f334626f = new C111740b();

    /* renamed from: g */
    public static String f334627g = "";

    /* renamed from: h */
    public static String f334628h = "";

    /* renamed from: i */
    public static String f334629i = "";

    /* renamed from: j */
    public static long f334630j = -1;

    /* renamed from: k */
    public static long f334631k = -1;

    /* renamed from: l */
    public static long f334632l = -1;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.analyse.CameraAnalyse", mo125469f = "CameraAnalyse.kt", mo125470l = {50}, mo125471m = "cameraStartAnalyse")
    /* renamed from: w70.a$a */
    public static final class C111738a<T> extends C66704d {

        /* renamed from: d */
        public Object f334633d;

        /* renamed from: e */
        public long f334634e;

        /* renamed from: f */
        public /* synthetic */ Object f334635f;

        /* renamed from: g */
        public final /* synthetic */ C111737a f334636g;

        /* renamed from: h */
        public int f334637h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111738a(C111737a aVar, C15601d<? super C111738a> dVar) {
            super(dVar);
            this.f334636g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f334635f = obj;
            this.f334637h |= Integer.MIN_VALUE;
            return this.f334636g.mo163452a((C32226l) null, this);
        }
    }

    /* renamed from: w70.a$b */
    public static final class C111739b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f334638d;

        public C111739b(String str) {
            this.f334638d = str;
        }

        public final void run() {
            TextView textView = C111737a.f334623c;
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f334638d);
                sb.append(10);
                C111740b bVar = C111737a.f334626f;
                bVar.getClass();
                sb.append("平均帧率:" + bVar.f334640b.f334646e + "\n实时帧率:" + bVar.f334641c);
                textView.setText(sb.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object mo163452a(fy3.C32226l<? super wx3.C15601d<? super T>, ? extends java.lang.Object> r7, wx3.C15601d<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof w70.C111737a.C111738a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            w70.a$a r0 = (w70.C111737a.C111738a) r0
            int r1 = r0.f334637h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f334637h = r1
            goto L_0x0018
        L_0x0013:
            w70.a$a r0 = new w70.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f334635f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f334637h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r1 = r0.f334634e
            java.lang.Object r7 = r0.f334633d
            w70.a r7 = (w70.C111737a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r8)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f334633d = r6
            r0.f334634e = r4
            r0.f334637h = r3
            java.lang.Object r8 = r7.invoke(r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r1 = r4
        L_0x004a:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            f334630j = r3
            long r0 = java.lang.System.currentTimeMillis()
            f334631k = r0
            r0 = -1
            f334632l = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w70.C111737a.mo163452a(fy3.l, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e9, code lost:
        r1 = r1.f320907b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163453b() {
        /*
            r9 = this;
            boolean r0 = f334625e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            long r0 = f334632l
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x002e
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = f334631k
            long r0 = r0 - r4
            f334632l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "firstFrameTimeCostMs:"
            r0.append(r1)
            long r4 = f334632l
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.CameraAnalyse"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x002e:
            w70.b r0 = f334626f
            r0.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f334639a
            long r4 = r4 - r6
            long r6 = java.lang.System.currentTimeMillis()
            r0.f334639a = r6
            r1 = 1000(0x3e8, float:1.401E-42)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x004a
            long r6 = (long) r1
            long r6 = r6 / r4
            r0.f334641c = r6
        L_0x004a:
            w70.b$a r0 = r0.f334640b
            long r4 = r0.f334643b
            r6 = 1
            long r4 = r4 + r6
            r0.f334643b = r4
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f334642a
            long r4 = r4 - r6
            long r6 = r0.f334644c
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0095
            long r4 = java.lang.System.currentTimeMillis()
            r0.f334642a = r4
            long r4 = r0.f334643b
            long r6 = (long) r1
            long r4 = r4 * r6
            long r6 = r0.f334644c
            long r4 = r4 / r6
            r0.f334646e = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r0.f334645d
            r1.append(r4)
            java.lang.String r4 = " average frame:"
            r1.append(r4)
            long r4 = r0.f334646e
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MicroMsg.Camera.CameraRenderAnalyse"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r1)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f334642a = r4
            r0.f334643b = r2
        L_0x0095:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = f334622b
            long r0 = r0 - r2
            r2 = 100
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0152
            long r0 = java.lang.System.currentTimeMillis()
            f334622b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "实例:"
            r0.append(r1)
            java.lang.String r1 = f334629i
            r0.append(r1)
            java.lang.String r1 = "\n耗时:打开"
            r0.append(r1)
            long r1 = f334630j
            r0.append(r1)
            java.lang.String r1 = "ms 首帧:"
            r0.append(r1)
            long r1 = f334632l
            r0.append(r1)
            java.lang.String r1 = "ms\n预览方式:"
            r0.append(r1)
            java.lang.String r1 = f334627g
            r0.append(r1)
            java.lang.String r1 = "\n拍照方式:"
            r0.append(r1)
            java.lang.String r1 = f334628h
            r0.append(r1)
            java.lang.String r1 = "\n分辨率:"
            r0.append(r1)
            e80.c r1 = f334624d
            r2 = 0
            if (r1 == 0) goto L_0x00f0
            e80.j r1 = r1.f320907b
            if (r1 == 0) goto L_0x00f0
            e80.i r1 = r1.f320923b
            goto L_0x00f1
        L_0x00f0:
            r1 = r2
        L_0x00f1:
            r0.append(r1)
            java.lang.String r1 = "\n纹理裁剪:"
            r0.append(r1)
            e80.c r1 = f334624d
            if (r1 == 0) goto L_0x0104
            e80.j r1 = r1.f320907b
            if (r1 == 0) goto L_0x0104
            e80.i r1 = r1.f320924c
            goto L_0x0105
        L_0x0104:
            r1 = r2
        L_0x0105:
            r0.append(r1)
            java.lang.String r1 = "\nView尺寸:"
            r0.append(r1)
            e80.c r1 = f334624d
            if (r1 == 0) goto L_0x0118
            e80.j r1 = r1.f320907b
            if (r1 == 0) goto L_0x0118
            e80.i r1 = r1.f320922a
            goto L_0x0119
        L_0x0118:
            r1 = r2
        L_0x0119:
            r0.append(r1)
            java.lang.String r1 = "\n顺时针旋转:"
            r0.append(r1)
            e80.c r1 = f334624d
            if (r1 == 0) goto L_0x012c
            int r1 = r1.f320910e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x012d
        L_0x012c:
            r1 = r2
        L_0x012d:
            r0.append(r1)
            java.lang.String r1 = "°\n设置帧率:"
            r0.append(r1)
            e80.c r1 = f334624d
            if (r1 == 0) goto L_0x013f
            int r1 = r1.f320912g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x013f:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            zt3.t r1 = zt3.C119157j.f356862d
            w70.a$b r2 = new w70.a$b
            r2.<init>(r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w70.C111737a.mo163453b():void");
    }
}
