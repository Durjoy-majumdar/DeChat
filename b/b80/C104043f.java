package b80;

import a14.C0000n0;
import a14.C53953u0;
import a80.C103320a;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Range;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.CameraKitOperateEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58087u0;
import e80.C107254b;
import e80.C107261i;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import h80.C108171a;
import i80.C108399b;
import java.util.List;
import kotlin.ResultKt;
import p156gj.C107831f;
import p156gj.C107848z;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import v70.C111389d;
import v70.C111406s;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: b80.f */
public final class C104043f extends C103320a {

    /* renamed from: q */
    public C58087u0<C13604l<C108399b, Bundle>> f307701q;

    /* renamed from: r */
    public C107831f f307702r;

    /* renamed from: s */
    public C107848z f307703s;

    /* renamed from: t */
    public final C104039c f307704t = new C104039c();

    /* renamed from: u */
    public final C104058l f307705u = new C104058l();

    /* renamed from: v */
    public final C104038b f307706v = new C104038b();

    /* renamed from: w */
    public IListener<CameraKitOperateEvent> f307707w;

    /* renamed from: x */
    public boolean f307708x;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {174}, mo125471m = "createCamera")
    /* renamed from: b80.f$a */
    public static final class C104044a extends C66704d {

        /* renamed from: d */
        public Object f307709d;

        /* renamed from: e */
        public boolean f307710e;

        /* renamed from: f */
        public /* synthetic */ Object f307711f;

        /* renamed from: g */
        public final /* synthetic */ C104043f f307712g;

        /* renamed from: h */
        public int f307713h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104044a(C104043f fVar, C15601d<? super C104044a> dVar) {
            super(dVar);
            this.f307712g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307711f = obj;
            this.f307713h |= Integer.MIN_VALUE;
            return this.f307712g.mo145656M(false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {123}, mo125471m = "setup")
    /* renamed from: b80.f$b */
    public static final class C104045b extends C66704d {

        /* renamed from: d */
        public Object f307714d;

        /* renamed from: e */
        public Object f307715e;

        /* renamed from: f */
        public /* synthetic */ Object f307716f;

        /* renamed from: g */
        public final /* synthetic */ C104043f f307717g;

        /* renamed from: h */
        public int f307718h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104045b(C104043f fVar, C15601d<? super C104045b> dVar) {
            super(dVar);
            this.f307717g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307716f = obj;
            this.f307718h |= Integer.MIN_VALUE;
            return this.f307717g.mo143107l((Context) null, (C0125s) null, (C111389d) null, (C111406s) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {209, 211}, mo125471m = "startPreview")
    /* renamed from: b80.f$c */
    public static final class C104046c extends C66704d {

        /* renamed from: d */
        public Object f307719d;

        /* renamed from: e */
        public Object f307720e;

        /* renamed from: f */
        public /* synthetic */ Object f307721f;

        /* renamed from: g */
        public final /* synthetic */ C104043f f307722g;

        /* renamed from: h */
        public int f307723h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104046c(C104043f fVar, C15601d<? super C104046c> dVar) {
            super(dVar);
            this.f307722g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307721f = obj;
            this.f307723h |= Integer.MIN_VALUE;
            return this.f307722g.mo143112q((Boolean) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl$startPreview$2", mo125469f = "Camera1Impl.kt", mo125470l = {212, 215, 221, 229, 238, 240}, mo125471m = "invokeSuspend")
    /* renamed from: b80.f$d */
    public static final class C104047d extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f307724d;

        /* renamed from: e */
        public int f307725e;

        /* renamed from: f */
        public final /* synthetic */ C104043f f307726f;

        /* renamed from: g */
        public final /* synthetic */ Boolean f307727g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104047d(C104043f fVar, Boolean bool, C15601d<? super C104047d> dVar) {
            super(1, dVar);
            this.f307726f = fVar;
            this.f307727g = bool;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C104047d(this.f307726f, this.f307727g, dVar);
        }

        public Object invoke(Object obj) {
            return ((C104047d) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.Camera1Impl", "makeSureEnvSetup");
            r12 = r11.f307726f.f304629h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (r12 == null) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
            r12 = r12.f333482j.f320922a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            r12 = r11.f307726f;
            r1 = r11.f307727g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
            if (r1 == null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            r1 = r1.booleanValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
            r1 = r12.f304631j.f320908c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
            r11.f307725e = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
            if (r12.mo145656M(r1, r11) != r0) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
            r12 = r11.f307726f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
            if (r12.f307703s != null) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
            h80.C108171a.f323903a.mo158578b(r12.f304625d, false);
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Camera.Camera1Impl", "startPreview error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
            r11.f307725e = 3;
            r1 = r12.f304629h;
            gy3.C87412m.m108591d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
            if (r12.mo145658O(r1.f333482j.f320922a, r11) != r0) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
            r12 = y70.C38971a.f104993a.mo61856d(false);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.Camera1Impl", "use texturePreview:" + r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
            if (r12 != false) goto L_0x010f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
            r1 = r11.f307726f;
            r6 = r1.f307703s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
            if (r6 != null) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
            r7 = r6.mo158259c();
            r8 = ((r7.getPreviewSize().width * r7.getPreviewSize().height) * android.graphics.ImageFormat.getBitsPerPixel(r7.getPreviewFormat())) / 8;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.Camera1Impl", "previewSize:[" + r7.getPreviewSize() + "] size:" + r8);
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
            if (r7 >= 5) goto L_0x0107;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
            r6.mo158257a(j72.C98921l.f289964d.mo126905m(java.lang.Integer.valueOf(r8)));
            r7 = r7 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
            r6.mo158264h(new b80.C104052g(r1, r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
            r6 = java.lang.System.currentTimeMillis();
            r1 = r11.f307726f.f304629h;
            gy3.C87412m.m108591d(r1);
            r11.f307724d = r6;
            r11.f307725e = 4;
            r12 = r1.mo163058p("getGLInputTexture", new v70.C111399i(r1, r12, (wx3.C15601d<? super v70.C111399i>) null), r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x012b, code lost:
            if (r12 != r0) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x012d, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x012e, code lost:
            r12 = (android.graphics.SurfaceTexture) r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0130, code lost:
            if (r12 != null) goto L_0x0143;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
            h80.C108171a.f323903a.mo158578b(r11.f307726f.f304625d, false);
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Camera.Camera1Impl", "startPreview error for null texture");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0143, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.Camera1Impl", "getGLInputTexture cost:" + (java.lang.System.currentTimeMillis() - r6));
            r1 = r11.f307726f.f307703s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0160, code lost:
            if (r1 == null) goto L_0x0165;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0162, code lost:
            r1.mo158265i(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0165, code lost:
            r12 = r11.f307726f.f307703s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
            if (r12 == null) goto L_0x016e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x016b, code lost:
            r12.mo158267k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x016e, code lost:
            r12 = r11.f307726f;
            r11.f307725e = 5;
            r12.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0179, code lost:
            if (a80.C103320a.m136822G(r12, r11) != r0) goto L_0x017c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x017b, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x017c, code lost:
            h80.C108171a.f323903a.mo158578b(r11.f307726f.f304625d, true);
            r12 = r11.f307726f;
            r1 = r11.f307727g;
            r11.f307725e = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0190, code lost:
            if (b80.C104043f.m138794I(r12, r1, r11) != r0) goto L_0x0193;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0192, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.Camera1Impl", "startPreview finish");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x019a, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f307725e
                r2 = 0
                r3 = 1
                r4 = 5
                java.lang.String r5 = "MicroMsg.Camera.Camera1Impl"
                switch(r1) {
                    case 0: goto L_0x0031;
                    case 1: goto L_0x002d;
                    case 2: goto L_0x0029;
                    case 3: goto L_0x0025;
                    case 4: goto L_0x001e;
                    case 5: goto L_0x0019;
                    case 6: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0014:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0193
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x017c
            L_0x001e:
                long r6 = r11.f307724d
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x012e
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0093
            L_0x0029:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x006b
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0043
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r12)
                b80.f r12 = r11.f307726f
                v70.d r12 = r12.f304629h
                if (r12 == 0) goto L_0x0043
                r11.f307725e = r3
                java.lang.Object r12 = r12.mo163055h(r11)
                if (r12 != r0) goto L_0x0043
                return r0
            L_0x0043:
                java.lang.String r12 = "makeSureEnvSetup"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
                b80.f r12 = r11.f307726f
                v70.d r12 = r12.f304629h
                if (r12 == 0) goto L_0x0052
                e80.j r12 = r12.f333482j
                e80.i r12 = r12.f320922a
            L_0x0052:
                b80.f r12 = r11.f307726f
                java.lang.Boolean r1 = r11.f307727g
                if (r1 == 0) goto L_0x005d
                boolean r1 = r1.booleanValue()
                goto L_0x0061
            L_0x005d:
                e80.c r1 = r12.f304631j
                boolean r1 = r1.f320908c
            L_0x0061:
                r6 = 2
                r11.f307725e = r6
                java.lang.Object r12 = r12.mo145656M(r1, r11)
                if (r12 != r0) goto L_0x006b
                return r0
            L_0x006b:
                b80.f r12 = r11.f307726f
                gj.z r1 = r12.f307703s
                if (r1 != 0) goto L_0x0080
                h80.a r0 = h80.C108171a.f323903a
                int r12 = r12.f304625d
                r0.mo158578b(r12, r2)
                java.lang.String r12 = "startPreview error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x0080:
                r1 = 3
                r11.f307725e = r1
                v70.d r1 = r12.f304629h
                gy3.C87412m.m108591d(r1)
                e80.j r1 = r1.f333482j
                e80.i r1 = r1.f320922a
                java.lang.Object r12 = r12.mo145658O(r1, r11)
                if (r12 != r0) goto L_0x0093
                return r0
            L_0x0093:
                y70.a r12 = y70.C38971a.f104993a
                boolean r12 = r12.mo61856d(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "use texturePreview:"
                r1.append(r6)
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                if (r12 != 0) goto L_0x010f
                b80.f r1 = r11.f307726f
                gj.z r6 = r1.f307703s
                if (r6 != 0) goto L_0x00b6
                goto L_0x010f
            L_0x00b6:
                android.hardware.Camera$Parameters r7 = r6.mo158259c()
                android.hardware.Camera$Size r8 = r7.getPreviewSize()
                int r8 = r8.width
                android.hardware.Camera$Size r9 = r7.getPreviewSize()
                int r9 = r9.height
                int r8 = r8 * r9
                int r9 = r7.getPreviewFormat()
                int r9 = android.graphics.ImageFormat.getBitsPerPixel(r9)
                int r8 = r8 * r9
                int r8 = r8 / 8
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "previewSize:["
                r9.append(r10)
                android.hardware.Camera$Size r7 = r7.getPreviewSize()
                r9.append(r7)
                java.lang.String r7 = "] size:"
                r9.append(r7)
                r9.append(r8)
                java.lang.String r7 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                r7 = 0
            L_0x00f5:
                if (r7 >= r4) goto L_0x0107
                j72.l r9 = j72.C98921l.f289964d
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                byte[] r9 = r9.mo126905m(r10)
                r6.mo158257a(r9)
                int r7 = r7 + 1
                goto L_0x00f5
            L_0x0107:
                b80.g r7 = new b80.g
                r7.<init>(r1, r6)
                r6.mo158264h(r7)
            L_0x010f:
                long r6 = java.lang.System.currentTimeMillis()
                b80.f r1 = r11.f307726f
                v70.d r1 = r1.f304629h
                gy3.C87412m.m108591d(r1)
                r11.f307724d = r6
                r8 = 4
                r11.f307725e = r8
                v70.i r8 = new v70.i
                r9 = 0
                r8.<init>(r1, r12, r9)
                java.lang.String r12 = "getGLInputTexture"
                java.lang.Object r12 = r1.mo163058p(r12, r8, r11)
                if (r12 != r0) goto L_0x012e
                return r0
            L_0x012e:
                android.graphics.SurfaceTexture r12 = (android.graphics.SurfaceTexture) r12
                if (r12 != 0) goto L_0x0143
                b80.f r12 = r11.f307726f
                h80.a r0 = h80.C108171a.f323903a
                int r12 = r12.f304625d
                r0.mo158578b(r12, r2)
                java.lang.String r12 = "startPreview error for null texture"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x0143:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getGLInputTexture cost:"
                r1.append(r2)
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r6
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                b80.f r1 = r11.f307726f
                gj.z r1 = r1.f307703s
                if (r1 == 0) goto L_0x0165
                r1.mo158265i(r12)
            L_0x0165:
                b80.f r12 = r11.f307726f
                gj.z r12 = r12.f307703s
                if (r12 == 0) goto L_0x016e
                r12.mo158267k()
            L_0x016e:
                b80.f r12 = r11.f307726f
                r11.f307725e = r4
                r12.getClass()
                java.lang.Object r12 = a80.C103320a.m136822G(r12, r11)
                if (r12 != r0) goto L_0x017c
                return r0
            L_0x017c:
                h80.a r12 = h80.C108171a.f323903a
                b80.f r1 = r11.f307726f
                int r1 = r1.f304625d
                r12.mo158578b(r1, r3)
                b80.f r12 = r11.f307726f
                java.lang.Boolean r1 = r11.f307727g
                r2 = 6
                r11.f307725e = r2
                java.lang.Object r12 = b80.C104043f.super.mo143112q(r1, r11)
                if (r12 != r0) goto L_0x0193
                return r0
            L_0x0193:
                java.lang.String r12 = "startPreview finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.C104047d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {395}, mo125471m = "stopPreview")
    /* renamed from: b80.f$e */
    public static final class C104048e extends C66704d {

        /* renamed from: d */
        public Object f307728d;

        /* renamed from: e */
        public /* synthetic */ Object f307729e;

        /* renamed from: f */
        public final /* synthetic */ C104043f f307730f;

        /* renamed from: g */
        public int f307731g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104048e(C104043f fVar, C15601d<? super C104048e> dVar) {
            super(dVar);
            this.f307730f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307729e = obj;
            this.f307731g |= Integer.MIN_VALUE;
            return this.f307730f.mo143111p(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {405, 406, 407, 408, 409}, mo125471m = "switchCamera")
    /* renamed from: b80.f$f */
    public static final class C104049f extends C66704d {

        /* renamed from: d */
        public Object f307732d;

        /* renamed from: e */
        public /* synthetic */ Object f307733e;

        /* renamed from: f */
        public final /* synthetic */ C104043f f307734f;

        /* renamed from: g */
        public int f307735g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104049f(C104043f fVar, C15601d<? super C104049f> dVar) {
            super(dVar);
            this.f307734f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307733e = obj;
            this.f307735g |= Integer.MIN_VALUE;
            return this.f307734f.mo143129x(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl$takePictureAsync$result$1", mo125469f = "Camera1Impl.kt", mo125470l = {336}, mo125471m = "invokeSuspend")
    /* renamed from: b80.f$g */
    public static final class C104050g extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public int f307736d;

        /* renamed from: e */
        public final /* synthetic */ C104043f f307737e;

        /* renamed from: f */
        public final /* synthetic */ int f307738f;

        /* renamed from: g */
        public final /* synthetic */ int f307739g;

        /* renamed from: h */
        public final /* synthetic */ int f307740h;

        /* renamed from: i */
        public final /* synthetic */ boolean f307741i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104050g(C104043f fVar, int i, int i2, int i3, boolean z, C15601d<? super C104050g> dVar) {
            super(2, dVar);
            this.f307737e = fVar;
            this.f307738f = i;
            this.f307739g = i2;
            this.f307740h = i3;
            this.f307741i = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104050g(this.f307737e, this.f307738f, this.f307739g, this.f307740h, this.f307741i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104050g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f307736d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C104043f fVar = this.f307737e;
                if (fVar.f307708x) {
                    Log.m105920e("MicroMsg.Camera.Camera1Impl", "is taking picture ignore");
                    return null;
                }
                C104038b bVar = fVar.f307706v;
                fVar.mo143118z(bVar.f307688g, bVar.f307686e, 2);
                C104043f fVar2 = this.f307737e;
                fVar2.f307708x = true;
                int i2 = this.f307738f;
                int i3 = this.f307739g;
                int i4 = this.f307740h;
                boolean z = this.f307741i;
                this.f307736d = 1;
                obj = C104043f.m138795J(fVar2, i2, i3, i4, z, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl", mo125469f = "Camera1Impl.kt", mo125470l = {266}, mo125471m = "updateCameraParameter")
    /* renamed from: b80.f$h */
    public static final class C104051h extends C66704d {

        /* renamed from: d */
        public Object f307742d;

        /* renamed from: e */
        public Object f307743e;

        /* renamed from: f */
        public /* synthetic */ Object f307744f;

        /* renamed from: g */
        public final /* synthetic */ C104043f f307745g;

        /* renamed from: h */
        public int f307746h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104051h(C104043f fVar, C15601d<? super C104051h> dVar) {
            super(dVar);
            this.f307745g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f307744f = obj;
            this.f307746h |= Integer.MIN_VALUE;
            return this.f307745g.mo145658O((C107261i) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104043f(C58087u0<C13604l<C108399b, Bundle>> u0Var, int i) {
        super(i);
        C87412m.m108594g(u0Var, "stateFlow");
        this.f307701q = u0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m138795J(b80.C104043f r18, int r19, int r20, int r21, boolean r22, wx3.C15601d r23) {
        /*
            r9 = r18
            r7 = r19
            r8 = r20
            r10 = r21
            r11 = r22
            r0 = r23
            r18.getClass()
            java.lang.String r1 = "on"
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r2 = r0 instanceof b80.C104054h
            if (r2 == 0) goto L_0x0026
            r2 = r0
            b80.h r2 = (b80.C104054h) r2
            int r3 = r2.f307760n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0026
            int r3 = r3 - r4
            r2.f307760n = r3
            goto L_0x002b
        L_0x0026:
            b80.h r2 = new b80.h
            r2.<init>(r9, r0)
        L_0x002b:
            r13 = r2
            java.lang.Object r0 = r13.f307758i
            int r2 = r13.f307760n
            java.lang.String r14 = "MicroMsg.Camera.Camera1Impl"
            r15 = 3
            r6 = 2
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0067
            if (r2 == r3) goto L_0x004b
            if (r2 == r6) goto L_0x0047
            if (r2 != r15) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x005a
        L_0x004b:
            boolean r1 = r13.f307757h
            int r2 = r13.f307756g
            int r3 = r13.f307755f
            int r4 = r13.f307754e
            java.lang.Object r7 = r13.f307753d
            b80.f r7 = (b80.C104043f) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ Exception -> 0x005d }
        L_0x005a:
            r12 = r0
            goto L_0x022c
        L_0x005d:
            r0 = move-exception
            r11 = r1
            r10 = r2
            r8 = r3
            r1 = r5
            r9 = r7
            r2 = 2
            r7 = r4
            goto L_0x01f7
        L_0x0067:
            kotlin.ResultKt.throwOnFailure(r0)
            long r16 = java.lang.System.currentTimeMillis()
            gj.z r0 = r9.f307703s     // Catch:{ Exception -> 0x01f3 }
            if (r0 == 0) goto L_0x0077
            android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x0107 }
            goto L_0x0078
        L_0x0077:
            r0 = r5
        L_0x0078:
            java.lang.String r2 = ", "
            if (r0 == 0) goto L_0x010c
            boolean r4 = r9.mo145657N(r0)     // Catch:{ Exception -> 0x0107 }
            if (r4 != 0) goto L_0x00a5
            if (r11 == 0) goto L_0x0086
            r0 = 1
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            r13.f307753d = r9     // Catch:{ Exception -> 0x0107 }
            r13.f307754e = r7     // Catch:{ Exception -> 0x0107 }
            r13.f307755f = r8     // Catch:{ Exception -> 0x0107 }
            r13.f307756g = r10     // Catch:{ Exception -> 0x0107 }
            r13.f307757h = r11     // Catch:{ Exception -> 0x0107 }
            r13.f307760n = r3     // Catch:{ Exception -> 0x0107 }
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r0
            r6 = r13
            java.lang.Object r0 = a80.C103320a.m136821E(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0107 }
            if (r0 != r12) goto L_0x005a
            goto L_0x022c
        L_0x00a5:
            boolean r3 = r18.mo143099B()     // Catch:{ Exception -> 0x0107 }
            if (r3 == 0) goto L_0x00bc
            boolean r3 = r9.f304634p     // Catch:{ Exception -> 0x0107 }
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = r0.getFlashMode()     // Catch:{ Exception -> 0x0107 }
            boolean r3 = gy3.C87412m.m108589b(r3, r1)     // Catch:{ Exception -> 0x0107 }
            if (r3 != 0) goto L_0x00bc
            r0.setFlashMode(r1)     // Catch:{ Exception -> 0x0107 }
        L_0x00bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107 }
            r1.<init>()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r3 = "takePicture >> "
            r1.append(r3)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r3 = r0.getFlashMode()     // Catch:{ Exception -> 0x0107 }
            r1.append(r3)     // Catch:{ Exception -> 0x0107 }
            r1.append(r2)     // Catch:{ Exception -> 0x0107 }
            android.hardware.Camera$Size r3 = r0.getPictureSize()     // Catch:{ Exception -> 0x0107 }
            if (r3 == 0) goto L_0x00de
            int r3 = r3.width     // Catch:{ Exception -> 0x0107 }
            java.lang.Integer r5 = new java.lang.Integer     // Catch:{ Exception -> 0x0107 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            r1.append(r5)     // Catch:{ Exception -> 0x0107 }
            r1.append(r2)     // Catch:{ Exception -> 0x0107 }
            android.hardware.Camera$Size r3 = r0.getPreviewSize()     // Catch:{ Exception -> 0x0107 }
            if (r3 == 0) goto L_0x00f3
            int r3 = r3.height     // Catch:{ Exception -> 0x0107 }
            java.lang.Integer r5 = new java.lang.Integer     // Catch:{ Exception -> 0x0107 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00f4
        L_0x00f3:
            r5 = 0
        L_0x00f4:
            r1.append(r5)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)     // Catch:{ Exception -> 0x0107 }
            gj.z r1 = r9.f307703s     // Catch:{ Exception -> 0x0107 }
            if (r1 != 0) goto L_0x0103
            goto L_0x010c
        L_0x0103:
            r1.mo158262f(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            r1 = 0
        L_0x0109:
            r2 = 2
            goto L_0x01f7
        L_0x010c:
            r13.f307753d = r9
            r13.f307754e = r7
            r13.f307755f = r8
            r13.f307756g = r10
            r13.f307757h = r11
            r13.f307760n = r15
            wx3.h r15 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r13)
            r15.<init>(r0)
            int r0 = r18.mo143122c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "takePictureAsync >> "
            r1.append(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r8)
            r1.append(r2)
            r1.append(r10)
            r1.append(r2)
            r1.append(r11)
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            boolean r0 = r18.mo143099B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            int r0 = r18.mo143122c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "calculateCaptureRotate >> "
            r1.append(r3)
            r1.append(r10)
            r1.append(r2)
            r1.append(r11)
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            boolean r2 = r18.mo143099B()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Camera.BaseCameraInstance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r18.mo143099B()
            if (r1 == 0) goto L_0x0197
            int r0 = r0 - r10
            int r0 = r0 + 360
            int r0 = r0 % 360
            goto L_0x019c
        L_0x0197:
            int r0 = r0 + r10
            int r0 = r0 + 360
            int r0 = r0 % 360
        L_0x019c:
            r5 = r0
            gj.z r0 = r9.f307703s     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x01ec
            b80.i r10 = b80.C104055i.f307761a     // Catch:{ Exception -> 0x01bd }
            b80.j r11 = new b80.j     // Catch:{ Exception -> 0x01bd }
            r1 = r11
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r16
            r8 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x01bd }
            android.hardware.Camera r0 = r0.f322936a     // Catch:{ Exception -> 0x01bd }
            if (r0 == 0) goto L_0x01ec
            r1 = 0
            r0.takePicture(r1, r10, r11)     // Catch:{ Exception -> 0x01bb }
            goto L_0x01ec
        L_0x01bb:
            r0 = move-exception
            goto L_0x01bf
        L_0x01bd:
            r0 = move-exception
            r1 = 0
        L_0x01bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "take picture failed >> "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            h80.a r0 = h80.C108171a.f323903a
            int r2 = r9.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r0.mo158577a(r2)
            if (r0 == 0) goto L_0x01e5
            r2 = 2
            long r2 = (long) r2
            r0.f310081X = r2
        L_0x01e5:
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r1)
            r15.resumeWith(r0)
        L_0x01ec:
            java.lang.Object r0 = r15.mo90314b()
            if (r0 != r12) goto L_0x005a
            goto L_0x022c
        L_0x01f3:
            r0 = move-exception
            r1 = r5
            goto L_0x0109
        L_0x01f7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "takePicture >> params deal is error "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            h80.a r0 = h80.C108171a.f323903a
            int r3 = r9.f304625d
            r0.mo158579c(r3, r15)
            r13.f307753d = r1
            r13.f307760n = r2
            r18 = r9
            r19 = r7
            r20 = r8
            r21 = r10
            r22 = r11
            r23 = r13
            java.lang.Object r0 = a80.C103320a.m136821E(r18, r19, r20, r21, r22, r23)
            if (r0 != r12) goto L_0x005a
        L_0x022c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.m138795J(b80.f, int, int, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: F */
    public void mo143101F(int i) {
        this.f304631j.f320910e = i;
        C111389d dVar = this.f304629h;
        C87412m.m108591d(dVar);
        C107261i iVar = dVar.f333482j.f320922a;
        this.f307704t.mo143119a(!mo143099B(), i, mo143098A().f320920a, mo143098A().f320921b, iVar.f320920a, iVar.f320921b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r2 = r10.f322839a;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145654K(p156gj.C107831f r10) {
        /*
            r9 = this;
            b80.c r0 = r9.f307704t
            e80.b r1 = r9.f304630i
            r0.f307690e = r10
            r0.f307693h = r1
            b80.l r0 = r9.f307705u
            r0.f307770b = r10
            r1 = 0
            if (r10 == 0) goto L_0x0018
            gj.z r2 = r10.f322839a
            if (r2 == 0) goto L_0x0018
            android.hardware.Camera$Parameters r2 = r2.mo158259c()
            goto L_0x0019
        L_0x0018:
            r2 = r1
        L_0x0019:
            if (r2 == 0) goto L_0x0028
            java.util.List r3 = r2.getZoomRatios()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x0029
        L_0x0028:
            r3 = r1
        L_0x0029:
            r4 = 0
            if (r3 != 0) goto L_0x002e
            r3 = 0
            goto L_0x0032
        L_0x002e:
            int r3 = r3.intValue()
        L_0x0032:
            java.util.ArrayList<java.lang.Integer> r5 = r0.f307769a
            r5.clear()
            java.util.ArrayList<java.lang.Integer> r5 = r0.f307769a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.add(r6)
            float r3 = (float) r3
            r5 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 + r5
            if (r2 == 0) goto L_0x0086
            java.util.List r2 = r2.getZoomRatios()
            if (r2 == 0) goto L_0x0086
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x0051:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0086
            java.lang.Object r7 = r2.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x0082
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x006d
            int r7 = r7.intValue()
            float r7 = (float) r7
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            float r7 = r7.floatValue()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0080
            float r3 = r3 + r5
            java.util.ArrayList<java.lang.Integer> r7 = r0.f307769a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
        L_0x0080:
            r6 = r8
            goto L_0x0051
        L_0x0082:
            sx3.C64197v.m75542k()
            throw r1
        L_0x0086:
            b80.b r0 = r9.f307706v
            e80.b r2 = r9.f304630i
            int r3 = r9.f304625d
            r0.getClass()
            r5 = 1
            if (r2 == 0) goto L_0x0097
            boolean r2 = r2.f320905f
            if (r2 != r5) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r5 = 0
        L_0x0098:
            java.lang.String r2 = "MicroMsg.Camera1ExpoHelper"
            if (r5 != 0) goto L_0x00a3
            java.lang.String r10 = "no support to adjust expo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            goto L_0x012c
        L_0x00a3:
            r0.f307689h = r3
            r0.f307682a = r10
            if (r10 == 0) goto L_0x00b1
            gj.z r10 = r10.f322839a
            if (r10 == 0) goto L_0x00b1
            android.hardware.Camera$Parameters r1 = r10.mo158259c()
        L_0x00b1:
            r0.f307683b = r1
            if (r1 == 0) goto L_0x00ba
            int r10 = r1.getMinExposureCompensation()
            goto L_0x00bb
        L_0x00ba:
            r10 = 0
        L_0x00bb:
            r0.f307684c = r10
            android.hardware.Camera$Parameters r10 = r0.f307683b
            if (r10 == 0) goto L_0x00c6
            int r10 = r10.getMaxExposureCompensation()
            goto L_0x00c7
        L_0x00c6:
            r10 = 0
        L_0x00c7:
            r0.f307685d = r10
            android.hardware.Camera$Parameters r10 = r0.f307683b
            if (r10 == 0) goto L_0x00d1
            int r4 = r10.getExposureCompensation()
        L_0x00d1:
            r0.f307686e = r4
            r0.f307687f = r4
            android.util.Range r10 = new android.util.Range
            int r1 = r0.f307684c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r0.f307685d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.<init>(r1, r3)
            r1 = -24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Range r10 = r10.intersect(r1, r3)
            r0.f307688g = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "bindCameraRes >> min: "
            r10.append(r1)
            int r1 = r0.f307684c
            r10.append(r1)
            java.lang.String r1 = ", max: "
            r10.append(r1)
            int r1 = r0.f307685d
            r10.append(r1)
            java.lang.String r1 = ", cur: "
            r10.append(r1)
            int r1 = r0.f307686e
            r10.append(r1)
            java.lang.String r1 = ", expoRange: "
            r10.append(r1)
            android.util.Range<java.lang.Integer> r0 = r0.f307688g
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo145654K(gj.f):void");
    }

    /* renamed from: L */
    public final String mo145655L() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraKit-");
        C107848z zVar = this.f307703s;
        sb.append(zVar != null ? Integer.valueOf(zVar.hashCode()) : null);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo145656M(boolean r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b80.C104043f.C104044a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            b80.f$a r0 = (b80.C104043f.C104044a) r0
            int r1 = r0.f307713h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f307713h = r1
            goto L_0x0018
        L_0x0013:
            b80.f$a r0 = new b80.f$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f307711f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f307713h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r9 = r0.f307710e
            java.lang.Object r0 = r0.f307709d
            b80.f r0 = (b80.C104043f) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0055
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.f307709d = r8
            r0.f307710e = r9
            r0.f307713h = r3
            h80.a r10 = h80.C108171a.f323903a
            int r0 = r8.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r10 = r10.mo158577a(r0)
            if (r10 != 0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            long r4 = java.lang.System.currentTimeMillis()
            r10.f310095n = r4
        L_0x004f:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            if (r10 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r8
        L_0x0055:
            r10 = 0
            if (r9 == 0) goto L_0x0067
            e80.c r1 = r0.f304631j
            e80.a r2 = r1.f320906a
            boolean r2 = r2.f320898b
            if (r2 == 0) goto L_0x0067
            r1.f320908c = r3
            int r1 = p156gj.C107828e.m146098a()
            goto L_0x006f
        L_0x0067:
            e80.c r1 = r0.f304631j
            r1.f320908c = r10
            int r1 = p156gj.C107828e.m146099b()
        L_0x006f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "createCamera back camera:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " cameraId:"
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = "MicroMsg.Camera.Camera1Impl"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r3, r9, r2)
            e80.c r9 = r0.f304631j
            r9.f320909d = r1
            android.content.Context r9 = r0.f304626e
            r2 = 0
            if (r9 == 0) goto L_0x0131
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            gj.f r9 = p156gj.C107828e.m146101d(r9, r1, r2)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00bb
        L_0x00a1:
            r9 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "openCamera failed:"
            r6.append(r7)
            java.lang.String r9 = r9.getMessage()
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            r9 = r2
        L_0x00bb:
            r0.f307702r = r9
            if (r9 == 0) goto L_0x00c1
            gj.z r2 = r9.f322839a
        L_0x00c1:
            r0.f307703s = r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "setupCamera cameraId:"
            r9.append(r2)
            r9.append(r1)
            java.lang.String r1 = " cameraScene:"
            r9.append(r1)
            java.lang.String r1 = r0.mo145655L()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            gj.z r9 = r0.f307703s
            if (r9 == 0) goto L_0x00ee
            java.lang.String r1 = r0.mo145655L()
            r9.mo158266j(r1)
        L_0x00ee:
            gj.z r9 = r0.f307703s
            if (r9 == 0) goto L_0x00f5
            r9.mo158261e(r10)
        L_0x00f5:
            gj.z r9 = r0.f307703s
            if (r9 == 0) goto L_0x0100
            android.hardware.Camera r9 = r9.f322936a
            if (r9 == 0) goto L_0x0100
            r9.enableShutterSound(r10)
        L_0x0100:
            boolean r9 = r0.f304634p
            r0.mo143124i(r9)
            gj.f r9 = r0.f307702r
            r0.mo145654K(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 91
            r9.append(r10)
            int r10 = r0.hashCode()
            r9.append(r10)
            java.lang.String r10 = "]setupCamera finish cost:"
            r9.append(r10)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x0131:
            java.lang.String r9 = "context"
            gy3.C87412m.m108603p(r9)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo145656M(boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: N */
    public final boolean mo145657N(Camera.Parameters parameters) {
        try {
            Camera.Size previewSize = parameters.getPreviewSize();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            if (supportedPictureSizes != null) {
                int i = 0;
                for (T next : supportedPictureSizes) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Camera.Size size = (Camera.Size) next;
                        Log.m105924i("MicroMsg.Camera.Camera1Impl", "setPictureSize: index:" + i + " resolution:[" + size.width + ' ' + size.height + ']');
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            if (supportedPictureSizes.contains(previewSize)) {
                parameters.setPictureSize(previewSize.width, previewSize.height);
                return true;
            }
            Log.m105920e("MicroMsg.Camera.Camera1Impl", "picture size no contain preview size");
            C108171a.f323903a.mo158579c(this.f304625d, 1);
            return false;
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.Camera.Camera1Impl", "setPictureSize >> is error");
            C108171a.f323903a.mo158579c(this.f304625d, 2);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.hardware.Camera$Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo145658O(e80.C107261i r19, wx3.C15601d<? super rx3.C13598b0> r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            boolean r3 = r2 instanceof b80.C104043f.C104051h
            if (r3 == 0) goto L_0x0019
            r3 = r2
            b80.f$h r3 = (b80.C104043f.C104051h) r3
            int r4 = r3.f307746h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f307746h = r4
            goto L_0x001e
        L_0x0019:
            b80.f$h r3 = new b80.f$h
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f307744f
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f307746h
            r6 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            java.lang.Object r0 = r3.f307743e
            android.hardware.Camera$Parameters r0 = (android.hardware.Camera.Parameters) r0
            java.lang.Object r3 = r3.f307742d
            b80.f r3 = (b80.C104043f) r3
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x028d
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r2)
            gj.z r2 = r1.f307703s
            r5 = 0
            if (r2 == 0) goto L_0x004b
            android.hardware.Camera$Parameters r2 = r2.mo158259c()
            goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            e80.b r7 = r1.f304630i
            if (r7 == 0) goto L_0x0053
            int r8 = r7.f320901b
            goto L_0x0054
        L_0x0053:
            r8 = -1
        L_0x0054:
            r9 = 500(0x1f4, float:7.0E-43)
            if (r8 <= r9) goto L_0x006b
            if (r7 == 0) goto L_0x0062
            int r7 = r7.f320901b
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            goto L_0x0063
        L_0x0062:
            r8 = r5
        L_0x0063:
            gy3.C87412m.m108591d(r8)
            int r7 = r8.intValue()
            goto L_0x006d
        L_0x006b:
            r7 = 2600(0xa28, float:3.643E-42)
        L_0x006d:
            java.lang.String r8 = "size"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = "MicroMsg.Camera.Camera1Impl"
            if (r2 != 0) goto L_0x007d
            java.lang.String r0 = "selectCameraResolution camera is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x014b }
            goto L_0x0162
        L_0x007d:
            int r12 = r0.f320920a     // Catch:{ Exception -> 0x014b }
            int r0 = r0.f320921b     // Catch:{ Exception -> 0x014b }
            int r13 = java.lang.Math.max(r0, r12)     // Catch:{ Exception -> 0x014b }
            float r13 = (float) r13     // Catch:{ Exception -> 0x014b }
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r14
            int r0 = java.lang.Math.min(r0, r12)     // Catch:{ Exception -> 0x014b }
            float r0 = (float) r0     // Catch:{ Exception -> 0x014b }
            float r13 = r13 / r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x014b }
            java.util.List r12 = r2.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x014b }
            r0.<init>(r12)     // Catch:{ Exception -> 0x014b }
            b80.k r12 = new b80.k     // Catch:{ Exception -> 0x014b }
            r12.<init>(r13)     // Catch:{ Exception -> 0x014b }
            sx3.C77813z.m93909o(r0, r12)     // Catch:{ Exception -> 0x014b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x014b }
            r13 = 0
        L_0x00a6:
            boolean r14 = r12.hasNext()     // Catch:{ Exception -> 0x014b }
            r15 = 93
            r6 = 32
            if (r14 == 0) goto L_0x00eb
            java.lang.Object r14 = r12.next()     // Catch:{ Exception -> 0x014b }
            int r16 = r13 + 1
            if (r13 < 0) goto L_0x00e7
            android.hardware.Camera$Size r14 = (android.hardware.Camera.Size) r14     // Catch:{ Exception -> 0x014b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014b }
            r11.<init>()     // Catch:{ Exception -> 0x014b }
            java.lang.String r10 = "index:"
            r11.append(r10)     // Catch:{ Exception -> 0x014b }
            r11.append(r13)     // Catch:{ Exception -> 0x014b }
            java.lang.String r10 = " resolution:["
            r11.append(r10)     // Catch:{ Exception -> 0x014b }
            int r10 = r14.width     // Catch:{ Exception -> 0x014b }
            r11.append(r10)     // Catch:{ Exception -> 0x014b }
            r11.append(r6)     // Catch:{ Exception -> 0x014b }
            int r6 = r14.height     // Catch:{ Exception -> 0x014b }
            r11.append(r6)     // Catch:{ Exception -> 0x014b }
            r11.append(r15)     // Catch:{ Exception -> 0x014b }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x014b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ Exception -> 0x014b }
            r13 = r16
            r6 = 1
            goto L_0x00a6
        L_0x00e7:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x014b }
            throw r5     // Catch:{ Exception -> 0x014b }
        L_0x00eb:
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x014b }
        L_0x00ef:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x014b }
            if (r11 == 0) goto L_0x0116
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x014b }
            r12 = r11
            android.hardware.Camera$Size r12 = (android.hardware.Camera.Size) r12     // Catch:{ Exception -> 0x014b }
            int r13 = r12.width     // Catch:{ Exception -> 0x014b }
            int r14 = r12.height     // Catch:{ Exception -> 0x014b }
            int r13 = java.lang.Math.min(r13, r14)     // Catch:{ Exception -> 0x014b }
            if (r13 <= r9) goto L_0x0112
            int r13 = r12.width     // Catch:{ Exception -> 0x014b }
            int r12 = r12.height     // Catch:{ Exception -> 0x014b }
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ Exception -> 0x014b }
            if (r12 > r7) goto L_0x0112
            r12 = 1
            goto L_0x0113
        L_0x0112:
            r12 = 0
        L_0x0113:
            if (r12 == 0) goto L_0x00ef
            goto L_0x0117
        L_0x0116:
            r11 = r5
        L_0x0117:
            android.hardware.Camera$Size r11 = (android.hardware.Camera.Size) r11     // Catch:{ Exception -> 0x014b }
            if (r11 != 0) goto L_0x0122
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)     // Catch:{ Exception -> 0x014b }
            r11 = r0
            android.hardware.Camera$Size r11 = (android.hardware.Camera.Size) r11     // Catch:{ Exception -> 0x014b }
        L_0x0122:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014b }
            r0.<init>()     // Catch:{ Exception -> 0x014b }
            java.lang.String r7 = "final select resolution:["
            r0.append(r7)     // Catch:{ Exception -> 0x014b }
            int r7 = r11.width     // Catch:{ Exception -> 0x014b }
            r0.append(r7)     // Catch:{ Exception -> 0x014b }
            r0.append(r6)     // Catch:{ Exception -> 0x014b }
            int r6 = r11.height     // Catch:{ Exception -> 0x014b }
            r0.append(r6)     // Catch:{ Exception -> 0x014b }
            r0.append(r15)     // Catch:{ Exception -> 0x014b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x014b }
            int r0 = r11.width     // Catch:{ Exception -> 0x014b }
            int r6 = r11.height     // Catch:{ Exception -> 0x014b }
            r2.setPreviewSize(r0, r6)     // Catch:{ Exception -> 0x014b }
            goto L_0x0162
        L_0x014b:
            r0 = move-exception
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            android.os.Looper r6 = android.os.Looper.myLooper()
            r9 = 0
            r7[r9] = r6
            java.lang.String r6 = r0.getMessage()
            r9 = 1
            r7[r9] = r6
            java.lang.String r6 = "setPreviewSize Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r7)
        L_0x0162:
            java.lang.String r0 = "auto"
            java.lang.String r6 = "continuous-video"
            java.lang.String r7 = "continuous-picture"
            if (r2 != 0) goto L_0x016b
            goto L_0x01bb
        L_0x016b:
            java.util.List r9 = r2.getSupportedFocusModes()     // Catch:{ Exception -> 0x01a4 }
            if (r9 == 0) goto L_0x01bb
            boolean r10 = r9.contains(r7)     // Catch:{ Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0180
            java.lang.String r0 = "support continuous picture"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x01a4 }
            r2.setFocusMode(r7)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01bb
        L_0x0180:
            boolean r7 = r9.contains(r6)     // Catch:{ Exception -> 0x01a4 }
            if (r7 == 0) goto L_0x018f
            java.lang.String r0 = "support continuous video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x01a4 }
            r2.setFocusMode(r6)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01bb
        L_0x018f:
            boolean r6 = r9.contains(r0)     // Catch:{ Exception -> 0x01a4 }
            if (r6 == 0) goto L_0x019e
            java.lang.String r6 = "support auto focus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ Exception -> 0x01a4 }
            r2.setFocusMode(r0)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01bb
        L_0x019e:
            java.lang.String r0 = "not support continuous video or auto focus"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01bb
        L_0x01a4:
            r0 = move-exception
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            android.os.Looper r6 = android.os.Looper.myLooper()
            r9 = 0
            r7[r9] = r6
            java.lang.String r0 = r0.getMessage()
            r6 = 1
            r7[r6] = r0
            java.lang.String r0 = "setFocusMode Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r7)
        L_0x01bb:
            e80.b r0 = r1.f304630i
            r6 = 30
            if (r0 == 0) goto L_0x01c4
            int r0 = r0.f320900a
            goto L_0x01c6
        L_0x01c4:
            r0 = 30
        L_0x01c6:
            if (r2 != 0) goto L_0x01cf
            java.lang.String r0 = "trySetPreviewFrameRateParameters error, p is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0250
        L_0x01cf:
            java.util.List r7 = r2.getSupportedPreviewFrameRates()     // Catch:{ Exception -> 0x0239 }
            if (r7 == 0) goto L_0x0250
            int r9 = r7.size()     // Catch:{ Exception -> 0x0239 }
            if (r9 <= 0) goto L_0x0250
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0239 }
            r9.<init>()     // Catch:{ Exception -> 0x0239 }
            java.lang.String r10 = "frame list:"
            r9.append(r10)     // Catch:{ Exception -> 0x0239 }
            r10 = 0
            java.lang.Integer[] r11 = new java.lang.Integer[r10]     // Catch:{ Exception -> 0x0239 }
            java.lang.Object[] r10 = r7.toArray(r11)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r10, r11)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r10 = sx3.C110820m.m150955b(r10)     // Catch:{ Exception -> 0x0239 }
            r9.append(r10)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0239 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r9 = "max(fr)"
            if (r0 == 0) goto L_0x0215
            java.lang.Object r6 = java.util.Collections.max(r7)     // Catch:{ Exception -> 0x0239 }
            gy3.C87412m.m108593f(r6, r9)     // Catch:{ Exception -> 0x0239 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ Exception -> 0x0239 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0239 }
            int r0 = java.lang.Math.min(r0, r6)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0226
        L_0x0215:
            java.lang.Object r0 = java.util.Collections.max(r7)     // Catch:{ Exception -> 0x0239 }
            gy3.C87412m.m108593f(r0, r9)     // Catch:{ Exception -> 0x0239 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x0239 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0239 }
            int r0 = java.lang.Math.min(r6, r0)     // Catch:{ Exception -> 0x0239 }
        L_0x0226:
            r2.setPreviewFrameRate(r0)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r6 = "set preview frame rate %d"
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0239 }
            r7 = 0
            r9[r7] = r0     // Catch:{ Exception -> 0x0239 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r9)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0250
        L_0x0239:
            r0 = move-exception
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            android.os.Looper r7 = android.os.Looper.myLooper()
            r9 = 0
            r6[r9] = r7
            java.lang.String r0 = r0.getMessage()
            r7 = 1
            r6[r7] = r0
            java.lang.String r0 = "trySetPreviewFrameRateParameters Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r6)
        L_0x0250:
            gj.z r0 = r1.f307703s
            if (r0 != 0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r0.mo158262f(r2)
        L_0x0258:
            if (r2 == 0) goto L_0x029a
            e80.c r0 = r1.f304631j
            int r6 = r2.getPreviewFrameRate()
            r0.f320912g = r6
            v70.d r0 = r1.f304629h
            if (r0 == 0) goto L_0x0291
            android.hardware.Camera$Size r6 = r2.getPreviewSize()
            int r6 = r6.width
            android.hardware.Camera$Size r7 = r2.getPreviewSize()
            int r7 = r7.height
            r3.f307742d = r1
            r3.f307743e = r2
            r8 = 1
            r3.f307746h = r8
            v70.q r8 = new v70.q
            r8.<init>(r0, r6, r7, r5)
            java.lang.String r5 = "updateInputSize"
            java.lang.Object r0 = r0.mo163058p(r5, r8, r3)
            if (r0 != r4) goto L_0x0287
            return r4
        L_0x0287:
            r3 = r1
            r17 = r2
            r2 = r0
            r0 = r17
        L_0x028d:
            rx3.b0 r2 = (rx3.C13598b0) r2
            r2 = r0
            goto L_0x0292
        L_0x0291:
            r3 = r1
        L_0x0292:
            gj.z r0 = r3.f307703s
            if (r0 != 0) goto L_0x0297
            goto L_0x029a
        L_0x0297:
            r0.mo158262f(r2)
        L_0x029a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo145658O(e80.i, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r3 = r3.f322839a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{ Exception -> 0x002e, all -> 0x002c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143120a() {
        /*
            r10 = this;
            b80.l r0 = r10.f307705u
            boolean r1 = r0.f307771c
            java.lang.String r2 = "MicroMsg.Camera.Camera1ZoomHelper"
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = "ignore onZoomOut,for"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0098
        L_0x000f:
            r1 = 1
            r0.f307771c = r1
            gj.f r3 = r0.f307770b
            r4 = 0
            if (r3 == 0) goto L_0x0020
            gj.z r3 = r3.f322839a
            if (r3 == 0) goto L_0x0020
            android.hardware.Camera$Parameters r3 = r3.mo158259c()
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r5 = 0
            if (r3 == 0) goto L_0x0030
            boolean r6 = r3.isZoomSupported()     // Catch:{ Exception -> 0x002e }
            if (r6 != r1) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x002c:
            r1 = move-exception
            goto L_0x0093
        L_0x002e:
            r1 = move-exception
            goto L_0x008b
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 == 0) goto L_0x0096
            int r6 = r3.getZoom()     // Catch:{ Exception -> 0x002e }
            java.util.ArrayList<java.lang.Integer> r7 = r0.f307769a     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x002e }
            int r7 = r7.indexOf(r8)     // Catch:{ Exception -> 0x002e }
            int r8 = r3.getMaxZoom()     // Catch:{ Exception -> 0x002e }
            if (r6 < r8) goto L_0x0048
            goto L_0x0096
        L_0x0048:
            java.util.ArrayList<java.lang.Integer> r6 = r0.f307769a     // Catch:{ Exception -> 0x002e }
            int r7 = r7 + r1
            int r8 = r6.size()     // Catch:{ Exception -> 0x002e }
            int r8 = r8 - r1
            int r7 = java.lang.Math.min(r7, r8)     // Catch:{ Exception -> 0x002e }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x002e }
            java.lang.String r7 = "availableZoomRatioIndexL…RatioIndexList.size - 1)]"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x002e }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ Exception -> 0x002e }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x002e }
            java.lang.String r7 = "trigger Big Zoom, nextZoom: %s, smoothZoomSupported: %s"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x002e }
            r8[r5] = r9     // Catch:{ Exception -> 0x002e }
            boolean r9 = r3.isSmoothZoomSupported()     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x002e }
            r8[r1] = r9     // Catch:{ Exception -> 0x002e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r8)     // Catch:{ Exception -> 0x002e }
            r3.setZoom(r6)     // Catch:{ Exception -> 0x002e }
            gj.f r1 = r0.f307770b     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0084
            gj.z r4 = r1.f322839a     // Catch:{ Exception -> 0x002e }
        L_0x0084:
            if (r4 != 0) goto L_0x0087
            goto L_0x0096
        L_0x0087:
            r4.mo158262f(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x0096
        L_0x008b:
            java.lang.String r3 = "onZoomOut error:"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x002c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x002c }
            goto L_0x0096
        L_0x0093:
            r0.f307771c = r5
            throw r1
        L_0x0096:
            r0.f307771c = r5
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143120a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r3 = r3.f322839a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{ Exception -> 0x002e, all -> 0x002c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143121b() {
        /*
            r9 = this;
            b80.l r0 = r9.f307705u
            boolean r1 = r0.f307771c
            java.lang.String r2 = "MicroMsg.Camera.Camera1ZoomHelper"
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = "ignore onZoomOut,for"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x008b
        L_0x000f:
            r1 = 1
            r0.f307771c = r1
            gj.f r3 = r0.f307770b
            r4 = 0
            if (r3 == 0) goto L_0x0020
            gj.z r3 = r3.f322839a
            if (r3 == 0) goto L_0x0020
            android.hardware.Camera$Parameters r3 = r3.mo158259c()
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r5 = 0
            if (r3 == 0) goto L_0x0030
            boolean r6 = r3.isZoomSupported()     // Catch:{ Exception -> 0x002e }
            if (r6 != r1) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x002c:
            r1 = move-exception
            goto L_0x0086
        L_0x002e:
            r1 = move-exception
            goto L_0x007e
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 == 0) goto L_0x0089
            int r6 = r3.getZoom()     // Catch:{ Exception -> 0x002e }
            java.util.ArrayList<java.lang.Integer> r7 = r0.f307769a     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x002e }
            int r7 = r7.indexOf(r8)     // Catch:{ Exception -> 0x002e }
            if (r6 != 0) goto L_0x0044
            goto L_0x0089
        L_0x0044:
            java.util.ArrayList<java.lang.Integer> r6 = r0.f307769a     // Catch:{ Exception -> 0x002e }
            int r7 = r7 - r1
            int r1 = java.lang.Math.max(r5, r7)     // Catch:{ Exception -> 0x002e }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r6 = "availableZoomRatioIndexL…(0,currentZoomIndex - 1)]"
            gy3.C87412m.m108593f(r1, r6)     // Catch:{ Exception -> 0x002e }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x002e }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x002e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e }
            r6.<init>()     // Catch:{ Exception -> 0x002e }
            java.lang.String r7 = "trigger Small Zoom, nextZoom: "
            r6.append(r7)     // Catch:{ Exception -> 0x002e }
            r6.append(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x002e }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)     // Catch:{ Exception -> 0x002e }
            r3.setZoom(r1)     // Catch:{ Exception -> 0x002e }
            gj.f r1 = r0.f307770b     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0077
            gj.z r4 = r1.f322839a     // Catch:{ Exception -> 0x002e }
        L_0x0077:
            if (r4 != 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            r4.mo158262f(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x0089
        L_0x007e:
            java.lang.String r3 = "onZoomIn error:"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x002c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x002c }
            goto L_0x0089
        L_0x0086:
            r0.f307771c = r5
            throw r1
        L_0x0089:
            r0.f307771c = r5
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143121b():void");
    }

    /* renamed from: c */
    public int mo143122c() {
        C107831f fVar = this.f307702r;
        if (fVar != null) {
            return fVar.f322840b;
        }
        return 0;
    }

    /* renamed from: d */
    public Object mo143102d(C15601d<? super C13598b0> dVar) {
        IListener<CameraKitOperateEvent> iListener = this.f307707w;
        if (iListener != null) {
            iListener.dead();
        }
        Object d = super.mo143102d(dVar);
        return d == C15911a.COROUTINE_SUSPENDED ? d : C13598b0.f38549a;
    }

    /* renamed from: e */
    public Object mo143103e(C15601d<? super C13598b0> dVar) {
        IListener<CameraKitOperateEvent> iListener = this.f307707w;
        if (iListener != null) {
            iListener.alive();
        }
        Object D = C103320a.m136820D(this, dVar);
        return D == C15911a.COROUTINE_SUSPENDED ? D : C13598b0.f38549a;
    }

    /* renamed from: h */
    public void mo143123h(int i) {
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "onReduceExpo >> " + i);
        C104038b bVar = this.f307706v;
        bVar.getClass();
        Log.m105924i("MicroMsg.Camera1ExpoHelper", "reduceExpo >> cur: " + bVar.f307686e + ", " + i + ", " + bVar.f307685d);
        int i2 = bVar.f307686e;
        int i3 = i2 - i;
        int i4 = bVar.f307684c;
        if (i3 <= i4) {
            i3 = i4;
        }
        if (i2 != i3) {
            bVar.f307686e = i3;
            bVar.mo145651a(i3);
        }
    }

    /* renamed from: i */
    public void mo143124i(boolean z) {
        C107848z zVar;
        C107254b bVar = this.f304630i;
        boolean z2 = bVar != null && bVar.f320904e;
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "switchFlash >> " + z + ", " + this.f304634p + ", " + mo143099B() + ", " + z2);
        if (z2) {
            this.f304634p = z;
            if (mo143099B()) {
                try {
                    C107831f fVar = this.f307702r;
                    C107848z zVar2 = null;
                    Camera.Parameters c = (fVar == null || (zVar = fVar.f322839a) == null) ? null : zVar.mo158259c();
                    if (c != null) {
                        c.setFlashMode(z ? "on" : "off");
                    }
                    C107831f fVar2 = this.f307702r;
                    if (fVar2 != null) {
                        zVar2 = fVar2.f322839a;
                    }
                    if (zVar2 != null) {
                        zVar2.mo158262f(c);
                    }
                    CameraReportStruct a = C108171a.f323903a.mo158577a(this.f304625d);
                    if (a != null) {
                        a.f310082Y = (long) 1;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Camera.Camera1Impl", "switch flash error " + e.getMessage());
                    CameraReportStruct a2 = C108171a.f323903a.mo158577a(this.f304625d);
                    if (a2 != null) {
                        a2.f310082Y = (long) 2;
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public void mo143125j(int i) {
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "onLargeExpo >> " + i);
        C104038b bVar = this.f307706v;
        bVar.getClass();
        Log.m105924i("MicroMsg.Camera1ExpoHelper", "enLargeExpo >> cur: " + bVar.f307686e + ", " + i + ", " + bVar.f307685d);
        int i2 = bVar.f307686e;
        int i3 = i + i2;
        int i4 = bVar.f307685d;
        if (i3 >= i4) {
            i3 = i4;
        }
        if (i2 != i3) {
            bVar.f307686e = i3;
            bVar.mo145651a(i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.lifecycle.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143107l(android.content.Context r9, androidx.lifecycle.C0125s r10, v70.C111389d r11, v70.C111406s r12, wx3.C15601d<? super rx3.C13598b0> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof b80.C104043f.C104045b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            b80.f$b r0 = (b80.C104043f.C104045b) r0
            int r1 = r0.f307718h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f307718h = r1
            goto L_0x0018
        L_0x0013:
            b80.f$b r0 = new b80.f$b
            r0.<init>(r8, r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.f307716f
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f307718h
            r7 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r7) goto L_0x0031
            java.lang.Object r9 = r6.f307715e
            r10 = r9
            androidx.lifecycle.s r10 = (androidx.lifecycle.C0125s) r10
            java.lang.Object r9 = r6.f307714d
            b80.f r9 = (b80.C104043f) r9
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r13)
            r6.f307714d = r8
            r6.f307715e = r10
            r6.f307718h = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r9 = super.mo143107l(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r9 = r8
        L_0x004f:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CameraKitOperateEvent> r11 = r9.f307707w
            java.lang.String r12 = "MicroMsg.Camera.Camera1Impl"
            if (r11 != 0) goto L_0x0063
            java.lang.String r11 = "checkListenerCreated"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            com.tencent.mm.app.f r11 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.media.camera.instance.camera1.Camera1Impl$checkListenerCreated$1 r13 = new com.tencent.mm.media.camera.instance.camera1.Camera1Impl$checkListenerCreated$1
            r13.<init>(r9, r10, r11)
            r9.f307707w = r13
        L_0x0063:
            e80.c r10 = r9.f304631j
            e80.a r10 = r10.f320906a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = r9.f304633o
            r0 = 0
            java.lang.String r13 = "KEY_CAMERA_CONFIG_EXPIRED"
            long r0 = r11.decodeLong(r13, r0)
            java.lang.Class<h81.h> r11 = h81.C32735h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_camerakit_expired_time_ms
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r11.mo58777He(r2, r3)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            r11 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x008e
            r4 = 1
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "lastConfigSetTimeMs:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = " configExpiredTimeMs:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " configExpired:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            java.lang.String r0 = "CAMERAKIT_COUNT_NEW"
            if (r4 != 0) goto L_0x00e6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r9.f304633o
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x00e6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r9.f304633o
            int r1 = r1.decodeInt(r0)
            if (r1 <= 0) goto L_0x00e6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = r9.f304633o
            int r13 = r13.decodeInt(r0)
            r10.f320897a = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "get from kv cameraCount:"
            r13.append(r0)
            int r0 = r10.f320897a
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            goto L_0x0110
        L_0x00e6:
            int r1 = p156gj.C107828e.m146100c()
            r10.f320897a = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r9.f304633o
            r2.encode((java.lang.String) r0, (int) r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r9.f304633o
            long r1 = java.lang.System.currentTimeMillis()
            r0.encode((java.lang.String) r13, (long) r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "get from system cameraCount:"
            r13.append(r0)
            int r0 = r10.f320897a
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
        L_0x0110:
            java.lang.String r13 = "CAMERAKIT_HAVE_FRONT_CAMERA_NEW"
            if (r4 != 0) goto L_0x013b
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r9.f304633o
            boolean r0 = r0.containsKey(r13)
            if (r0 == 0) goto L_0x013b
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r9.f304633o
            boolean r13 = r0.decodeBool(r13)
            r10.f320899c = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "get from kv hasFrontCamera:"
            r13.append(r0)
            boolean r0 = r10.f320899c
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            goto L_0x016f
        L_0x013b:
            int r0 = r10.f320897a
            r1 = 0
        L_0x013e:
            if (r1 >= r0) goto L_0x0151
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r1, r2)
            int r2 = r2.facing
            if (r2 != r7) goto L_0x014e
            r0 = 1
            goto L_0x0152
        L_0x014e:
            int r1 = r1 + 1
            goto L_0x013e
        L_0x0151:
            r0 = 0
        L_0x0152:
            r10.f320899c = r0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r9.f304633o
            r1.encode((java.lang.String) r13, (boolean) r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "get from system hasFrontCamera:"
            r13.append(r0)
            boolean r0 = r10.f320899c
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
        L_0x016f:
            java.lang.String r13 = "CAMERAKIT_HAVE_BACK_CAMERA_NEW"
            if (r4 != 0) goto L_0x019a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r9.f304633o
            boolean r0 = r0.containsKey(r13)
            if (r0 == 0) goto L_0x019a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = r9.f304633o
            boolean r9 = r9.decodeBool(r13)
            r10.f320898b = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "get from kv hasBackCamera:"
            r9.append(r11)
            boolean r10 = r10.f320898b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            goto L_0x01cd
        L_0x019a:
            int r0 = r10.f320897a
            r1 = 0
        L_0x019d:
            if (r1 >= r0) goto L_0x01af
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r1, r2)
            int r2 = r2.facing
            if (r2 != 0) goto L_0x01ac
            goto L_0x01b0
        L_0x01ac:
            int r1 = r1 + 1
            goto L_0x019d
        L_0x01af:
            r7 = 0
        L_0x01b0:
            r10.f320898b = r7
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = r9.f304633o
            r9.encode((java.lang.String) r13, (boolean) r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "get from system hasBackCamera:"
            r9.append(r11)
            boolean r10 = r10.f320898b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
        L_0x01cd:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143107l(android.content.Context, androidx.lifecycle.s, v70.d, v70.s, wx3.d):java.lang.Object");
    }

    /* renamed from: m */
    public Object mo143108m(int i, int i2, C15601d<? super C13598b0> dVar) {
        Object m = super.mo143108m(i, i2, dVar);
        return m == C15911a.COROUTINE_SUSPENDED ? m : C13598b0.f38549a;
    }

    public boolean needMirror() {
        return mo143099B();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143111p(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b80.C104043f.C104048e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            b80.f$e r0 = (b80.C104043f.C104048e) r0
            int r1 = r0.f307731g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f307731g = r1
            goto L_0x0018
        L_0x0013:
            b80.f$e r0 = new b80.f$e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f307729e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f307731g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f307728d
            b80.f r0 = (b80.C104043f) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r5 = "MicroMsg.Camera.Camera1Impl"
            java.lang.String r2 = "stopPreview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r0.f307728d = r4
            r0.f307731g = r3
            java.lang.Object r5 = super.mo143111p(r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r0 = r4
        L_0x0049:
            r5 = 0
            r0.mo145654K(r5)
            gj.z r1 = r0.f307703s
            if (r1 == 0) goto L_0x0054
            r1.mo158268l()
        L_0x0054:
            gj.z r1 = r0.f307703s
            if (r1 == 0) goto L_0x005b
            r1.mo158260d()
        L_0x005b:
            r0.f307703s = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143111p(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143112q(java.lang.Boolean r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof b80.C104043f.C104046c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            b80.f$c r0 = (b80.C104043f.C104046c) r0
            int r1 = r0.f307723h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f307723h = r1
            goto L_0x0018
        L_0x0013:
            b80.f$c r0 = new b80.f$c
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f307721f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f307723h
            java.lang.String r3 = "MicroMsg.Camera.Camera1Impl"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r10 = r0.f307719d
            b80.f r10 = (b80.C104043f) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ Exception -> 0x0032 }
            goto L_0x00c3
        L_0x0032:
            r11 = move-exception
            goto L_0x00a4
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            java.lang.Object r10 = r0.f307720e
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r2 = r0.f307719d
            b80.f r2 = (b80.C104043f) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ Exception -> 0x004d }
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L_0x0085
        L_0x004d:
            r11 = move-exception
            r10 = r2
            goto L_0x00a4
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "startPreview isPreviewing:"
            r11.append(r2)
            e80.c r2 = r9.f304631j
            boolean r2 = r2.f320911f
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            e80.c r11 = r9.f304631j
            boolean r11 = r11.f320911f
            if (r11 != 0) goto L_0x00c3
            v70.d r11 = r9.f304629h     // Catch:{ Exception -> 0x0088 }
            if (r11 == 0) goto L_0x008a
            r0.f307719d = r9     // Catch:{ Exception -> 0x0088 }
            r0.f307720e = r10     // Catch:{ Exception -> 0x0088 }
            r0.f307723h = r5     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r11 = r11.mo163059q(r0)     // Catch:{ Exception -> 0x0088 }
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r11
            r11 = r10
            r10 = r9
        L_0x0085:
            rx3.b0 r2 = (rx3.C13598b0) r2     // Catch:{ Exception -> 0x0032 }
            goto L_0x008c
        L_0x0088:
            r11 = move-exception
            goto L_0x00a3
        L_0x008a:
            r11 = r10
            r10 = r9
        L_0x008c:
            r10.f307708x = r6     // Catch:{ Exception -> 0x0032 }
            w70.a r2 = w70.C111737a.f334621a     // Catch:{ Exception -> 0x0032 }
            b80.f$d r5 = new b80.f$d     // Catch:{ Exception -> 0x0032 }
            r7 = 0
            r5.<init>(r10, r11, r7)     // Catch:{ Exception -> 0x0032 }
            r0.f307719d = r10     // Catch:{ Exception -> 0x0032 }
            r0.f307720e = r7     // Catch:{ Exception -> 0x0032 }
            r0.f307723h = r4     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r10 = r2.mo163452a(r5, r0)     // Catch:{ Exception -> 0x0032 }
            if (r10 != r1) goto L_0x00c3
            return r1
        L_0x00a3:
            r10 = r9
        L_0x00a4:
            h80.a r0 = h80.C108171a.f323903a
            int r1 = r10.f304625d
            r0.mo158578b(r1, r6)
            e80.c r10 = r10.f304631j
            r10.f320911f = r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "startPreview error:"
            r10.append(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r10)
        L_0x00c3:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143112q(java.lang.Boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: s */
    public Object mo143114s(int i, int i2, int i3, boolean z, C15601d<? super Bitmap> dVar) {
        if (!mo143100C()) {
            return C103320a.m136821E(this, i, i2, i3, z, dVar);
        }
        if (!this.f304631j.f320911f) {
            Log.m105920e("MicroMsg.Camera.Camera1Impl", "takePictureAsync >> but is no previewing");
            return null;
        }
        C111406s sVar = this.f304628g;
        if (sVar == null) {
            Log.m105920e("MicroMsg.Camera.Camera1Impl", "takePictureAsync >> but coroutines is null");
            return null;
        }
        C53953u0 T = sVar != null ? sVar.mo163064T("takePictureAsync", new C104050g(this, i, i2, i3, z, (C15601d<? super C104050g>) null)) : null;
        if (T != null) {
            return T.mo74634A(dVar);
        }
        return null;
    }

    public void setLightTorch(boolean z) {
        C107254b bVar = this.f304630i;
        boolean z2 = bVar != null && bVar.f320904e;
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "setRecordStatus >> " + this.f304634p + ", " + z2 + ", " + mo143099B());
        if (z2 && this.f304634p && mo143099B()) {
            String str = z ? "torch" : "on";
            try {
                C107848z zVar = this.f307703s;
                Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
                if (c != null) {
                    c.setFlashMode(str);
                    C107848z zVar2 = this.f307703s;
                    if (zVar2 != null) {
                        zVar2.mo158262f(c);
                    }
                    CameraReportStruct a = C108171a.f323903a.mo158577a(this.f304625d);
                    if (a != null) {
                        a.f310084a0 = (long) 1;
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Camera.Camera1Impl", "set torch is error " + e.getMessage() + ", " + z);
                CameraReportStruct a2 = C108171a.f323903a.mo158577a(this.f304625d);
                if (a2 != null) {
                    a2.f310084a0 = (long) 2;
                }
            }
        }
    }

    /* renamed from: t */
    public C13604l<Range<Integer>, Integer> mo143128t() {
        C104038b bVar = this.f307706v;
        Range<Integer> range = bVar.f307688g;
        int i = bVar.f307687f;
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "getExpoData >> " + range + ", " + i);
        return new C13604l<>(range, Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143129x(wx3.C15601d<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof b80.C104043f.C104049f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            b80.f$f r0 = (b80.C104043f.C104049f) r0
            int r1 = r0.f307735g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f307735g = r1
            goto L_0x0018
        L_0x0013:
            b80.f$f r0 = new b80.f$f
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f307733e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f307735g
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r7) goto L_0x0054
            if (r2 == r6) goto L_0x004c
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00b8
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            java.lang.Object r2 = r0.f307732d
            b80.f r2 = (b80.C104043f) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a8
        L_0x0044:
            java.lang.Object r2 = r0.f307732d
            b80.f r2 = (b80.C104043f) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0099
        L_0x004c:
            java.lang.Object r2 = r0.f307732d
            b80.f r2 = (b80.C104043f) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0085
        L_0x0054:
            java.lang.Object r2 = r0.f307732d
            b80.f r2 = (b80.C104043f) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0076
        L_0x005c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "MicroMsg.Camera.Camera1Impl"
            java.lang.String r2 = "switchCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            v70.d r9 = r8.f304629h
            if (r9 == 0) goto L_0x0079
            r0.f307732d = r8
            r0.f307735g = r7
            java.lang.Object r9 = r9.mo163056j(r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r8
        L_0x0076:
            rx3.b0 r9 = (rx3.C13598b0) r9
            goto L_0x007a
        L_0x0079:
            r2 = r8
        L_0x007a:
            r0.f307732d = r2
            r0.f307735g = r6
            java.lang.Object r9 = r2.mo143111p(r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            e80.c r9 = r2.f304631j
            boolean r9 = r9.f320908c
            r9 = r9 ^ r7
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0.f307732d = r2
            r0.f307735g = r5
            java.lang.Object r9 = r2.mo143112q(r9, r0)
            if (r9 != r1) goto L_0x0099
            return r1
        L_0x0099:
            v70.d r9 = r2.f304629h
            if (r9 == 0) goto L_0x00a8
            r0.f307732d = r2
            r0.f307735g = r4
            java.lang.Object r9 = r9.mo163054g(r0)
            if (r9 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            v70.d r9 = r2.f304629h
            if (r9 == 0) goto L_0x00ba
            r2 = 0
            r0.f307732d = r2
            r0.f307735g = r3
            java.lang.Object r9 = r9.mo163059q(r0)
            if (r9 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            rx3.b0 r9 = (rx3.C13598b0) r9
        L_0x00ba:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143129x(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r3 = (r3 = r3.f322839a).mo158259c();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143130y(float r11, float r12) {
        /*
            r10 = this;
            b80.c r6 = r10.f307704t
            java.lang.String r7 = "auto"
            int r5 = r6.f304662b
            java.lang.String r8 = "MicroMsg.Camera.Camera1FocusHelper"
            if (r5 <= 0) goto L_0x0110
            int r4 = r6.f304661a
            if (r4 > 0) goto L_0x0010
            goto L_0x0110
        L_0x0010:
            r3 = 1067450368(0x3fa00000, float:1.25)
            r0 = r6
            r1 = r11
            r2 = r12
            android.graphics.Rect r9 = r0.mo145652b(r1, r2, r3, r4, r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = r6.f304661a
            int r5 = r6.f304662b
            android.graphics.Rect r0 = r0.mo145652b(r1, r2, r3, r4, r5)
            r1 = 1
            r2 = 0
            gj.f r3 = r6.f307690e     // Catch:{ Exception -> 0x0101 }
            r4 = 0
            if (r3 == 0) goto L_0x0039
            gj.z r3 = r3.f322839a     // Catch:{ Exception -> 0x0101 }
            if (r3 == 0) goto L_0x0039
            android.hardware.Camera$Parameters r3 = r3.mo158259c()     // Catch:{ Exception -> 0x0101 }
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.getFocusMode()     // Catch:{ Exception -> 0x0101 }
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            r6.f307691f = r3     // Catch:{ Exception -> 0x0101 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0101 }
            r3.<init>()     // Catch:{ Exception -> 0x0101 }
            java.lang.String r5 = "focus on point:["
            r3.append(r5)     // Catch:{ Exception -> 0x0101 }
            r3.append(r11)     // Catch:{ Exception -> 0x0101 }
            r11 = 32
            r3.append(r11)     // Catch:{ Exception -> 0x0101 }
            r3.append(r12)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r11 = "] focusRect:"
            r3.append(r11)     // Catch:{ Exception -> 0x0101 }
            r3.append(r9)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r11 = " meteringRect:"
            r3.append(r11)     // Catch:{ Exception -> 0x0101 }
            r3.append(r0)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x0101 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)     // Catch:{ Exception -> 0x0101 }
            gj.f r11 = r6.f307690e     // Catch:{ Exception -> 0x0101 }
            if (r11 == 0) goto L_0x0075
            gj.z r11 = r11.f322839a     // Catch:{ Exception -> 0x0101 }
            if (r11 == 0) goto L_0x0075
            android.hardware.Camera$Parameters r11 = r11.mo158259c()     // Catch:{ Exception -> 0x0101 }
            goto L_0x0076
        L_0x0075:
            r11 = r4
        L_0x0076:
            if (r11 == 0) goto L_0x007d
            java.util.List r12 = r11.getSupportedFocusModes()     // Catch:{ Exception -> 0x0101 }
            goto L_0x007e
        L_0x007d:
            r12 = r4
        L_0x007e:
            if (r12 == 0) goto L_0x0089
            boolean r12 = r12.contains(r7)     // Catch:{ Exception -> 0x0101 }
            if (r12 == 0) goto L_0x0089
            r11.setFocusMode(r7)     // Catch:{ Exception -> 0x0101 }
        L_0x0089:
            if (r11 == 0) goto L_0x0090
            int r12 = r11.getMaxNumFocusAreas()     // Catch:{ Exception -> 0x0101 }
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r12 <= 0) goto L_0x00a8
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0101 }
            r12.<init>(r1)     // Catch:{ Exception -> 0x0101 }
            android.hardware.Camera$Area r5 = new android.hardware.Camera$Area     // Catch:{ Exception -> 0x0101 }
            r5.<init>(r9, r3)     // Catch:{ Exception -> 0x0101 }
            r12.add(r5)     // Catch:{ Exception -> 0x0101 }
            if (r11 != 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r11.setFocusAreas(r12)     // Catch:{ Exception -> 0x0101 }
        L_0x00a8:
            if (r11 == 0) goto L_0x00af
            int r12 = r11.getMaxNumMeteringAreas()     // Catch:{ Exception -> 0x0101 }
            goto L_0x00b0
        L_0x00af:
            r12 = 0
        L_0x00b0:
            if (r12 <= 0) goto L_0x00c5
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0101 }
            r12.<init>(r1)     // Catch:{ Exception -> 0x0101 }
            android.hardware.Camera$Area r5 = new android.hardware.Camera$Area     // Catch:{ Exception -> 0x0101 }
            r5.<init>(r0, r3)     // Catch:{ Exception -> 0x0101 }
            r12.add(r5)     // Catch:{ Exception -> 0x0101 }
            if (r11 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r11.setMeteringAreas(r12)     // Catch:{ Exception -> 0x0101 }
        L_0x00c5:
            e80.b r12 = r6.f307693h     // Catch:{ Exception -> 0x0101 }
            if (r12 == 0) goto L_0x00cf
            boolean r12 = r12.f320904e     // Catch:{ Exception -> 0x0101 }
            if (r12 != r1) goto L_0x00cf
            r12 = 1
            goto L_0x00d0
        L_0x00cf:
            r12 = 0
        L_0x00d0:
            if (r12 == 0) goto L_0x00e7
            if (r11 == 0) goto L_0x00d9
            java.lang.String r12 = r11.getFlashMode()     // Catch:{ Exception -> 0x0101 }
            goto L_0x00da
        L_0x00d9:
            r12 = r4
        L_0x00da:
            java.lang.String r0 = "on"
            boolean r12 = gy3.C87412m.m108589b(r12, r0)     // Catch:{ Exception -> 0x0101 }
            if (r12 == 0) goto L_0x00e7
            java.lang.String r12 = "off"
            r11.setFlashMode(r12)     // Catch:{ Exception -> 0x0101 }
        L_0x00e7:
            gj.f r12 = r6.f307690e     // Catch:{ Exception -> 0x0101 }
            if (r12 == 0) goto L_0x00ed
            gj.z r4 = r12.f322839a     // Catch:{ Exception -> 0x0101 }
        L_0x00ed:
            if (r4 != 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r4.mo158262f(r11)     // Catch:{ Exception -> 0x0101 }
        L_0x00f3:
            gj.f r11 = r6.f307690e     // Catch:{ Exception -> 0x0101 }
            if (r11 == 0) goto L_0x0130
            gj.z r11 = r11.f322839a     // Catch:{ Exception -> 0x0101 }
            if (r11 == 0) goto L_0x0130
            android.hardware.Camera$AutoFocusCallback r12 = r6.f307694i     // Catch:{ Exception -> 0x0101 }
            r11.mo158258b(r12)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0130
        L_0x0101:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r11 = r11.getMessage()
            r12[r2] = r11
            java.lang.String r11 = "autofocus with area fail, exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r11, r12)
            goto L_0x0130
        L_0x0110:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "ignore focus,for width:"
            r11.append(r12)
            int r12 = r6.f304661a
            r11.append(r12)
            java.lang.String r12 = " height:"
            r11.append(r12)
            int r12 = r6.f304662b
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
        L_0x0130:
            b80.b r11 = r10.f307706v
            r11.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "resetExpo >> origin: "
            r12.append(r0)
            int r0 = r11.f307687f
            r12.append(r0)
            java.lang.String r0 = ", cur: "
            r12.append(r0)
            int r0 = r11.f307686e
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "MicroMsg.Camera1ExpoHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            int r12 = r11.f307687f
            int r0 = r11.f307686e
            if (r12 == r0) goto L_0x0162
            r11.f307686e = r12
            r11.mo145651a(r12)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b80.C104043f.mo143130y(float, float):void");
    }
}
