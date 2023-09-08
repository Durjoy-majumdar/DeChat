package a80;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Range;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import e80.C107253a;
import e80.C107254b;
import e80.C107255c;
import e80.C107261i;
import e80.C107262j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import h80.C108171a;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import v70.C111389d;
import v70.C111406s;
import w70.C111737a;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: a80.a */
public abstract class C103320a implements C103327c {

    /* renamed from: d */
    public int f304625d;

    /* renamed from: e */
    public Context f304626e;

    /* renamed from: f */
    public C0125s f304627f;

    /* renamed from: g */
    public C111406s f304628g;

    /* renamed from: h */
    public C111389d f304629h;

    /* renamed from: i */
    public C107254b f304630i;

    /* renamed from: j */
    public final C107255c f304631j = new C107255c((C107253a) null, (C107262j) null, false, 0, 0, false, 0, 127, (C8480h) null);

    /* renamed from: n */
    public C15601d<? super C13598b0> f304632n;

    /* renamed from: o */
    public MultiProcessMMKV f304633o = MultiProcessMMKV.getMMKV("MicroMsg.Camera.BaseCameraInstance");

    /* renamed from: p */
    public boolean f304634p;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.BaseCameraInstance", mo125469f = "BaseCameraInstance.kt", mo125470l = {203, 204}, mo125471m = "onResume$suspendImpl")
    /* renamed from: a80.a$a */
    public static final class C103321a extends C66704d {

        /* renamed from: d */
        public Object f304635d;

        /* renamed from: e */
        public /* synthetic */ Object f304636e;

        /* renamed from: f */
        public final /* synthetic */ C103320a f304637f;

        /* renamed from: g */
        public int f304638g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103321a(C103320a aVar, C15601d<? super C103321a> dVar) {
            super(dVar);
            this.f304637f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f304636e = obj;
            this.f304638g |= Integer.MIN_VALUE;
            return C103320a.m136820D(this.f304637f, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.BaseCameraInstance", mo125469f = "BaseCameraInstance.kt", mo125470l = {112, 116}, mo125471m = "takePictureAsync$suspendImpl")
    /* renamed from: a80.a$b */
    public static final class C103322b extends C66704d {

        /* renamed from: d */
        public Object f304639d;

        /* renamed from: e */
        public Object f304640e;

        /* renamed from: f */
        public int f304641f;

        /* renamed from: g */
        public int f304642g;

        /* renamed from: h */
        public int f304643h;

        /* renamed from: i */
        public /* synthetic */ Object f304644i;

        /* renamed from: j */
        public final /* synthetic */ C103320a f304645j;

        /* renamed from: n */
        public int f304646n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103322b(C103320a aVar, C15601d<? super C103322b> dVar) {
            super(dVar);
            this.f304645j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f304644i = obj;
            this.f304646n |= Integer.MIN_VALUE;
            return C103320a.m136821E(this.f304645j, 0, 0, 0, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.BaseCameraInstance$takePictureAsync$work$1", mo125469f = "BaseCameraInstance.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: a80.a$c */
    public static final class C103323c extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C103320a f304647d;

        /* renamed from: e */
        public final /* synthetic */ int f304648e;

        /* renamed from: f */
        public final /* synthetic */ int f304649f;

        /* renamed from: g */
        public final /* synthetic */ int f304650g;

        /* renamed from: h */
        public final /* synthetic */ Bitmap f304651h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103323c(C103320a aVar, int i, int i2, int i3, Bitmap bitmap, C15601d<? super C103323c> dVar) {
            super(2, dVar);
            this.f304647d = aVar;
            this.f304648e = i;
            this.f304649f = i2;
            this.f304650g = i3;
            this.f304651h = bitmap;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C103323c(this.f304647d, this.f304648e, this.f304649f, this.f304650g, this.f304651h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C103323c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return this.f304647d.mo143104f(this.f304648e, this.f304649f, this.f304650g, this.f304651h, false);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.BaseCameraInstance", mo125469f = "BaseCameraInstance.kt", mo125470l = {222, 223}, mo125471m = "updateRenderParam$suspendImpl")
    /* renamed from: a80.a$d */
    public static final class C103324d extends C66704d {

        /* renamed from: d */
        public Object f304652d;

        /* renamed from: e */
        public int f304653e;

        /* renamed from: f */
        public /* synthetic */ Object f304654f;

        /* renamed from: g */
        public final /* synthetic */ C103320a f304655g;

        /* renamed from: h */
        public int f304656h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103324d(C103320a aVar, C15601d<? super C103324d> dVar) {
            super(dVar);
            this.f304655g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f304654f = obj;
            this.f304656h |= Integer.MIN_VALUE;
            return C103320a.m136822G(this.f304655g, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.BaseCameraInstance", mo125469f = "BaseCameraInstance.kt", mo125470l = {100, 101, 102, 103}, mo125471m = "updateScreenRotate$suspendImpl")
    /* renamed from: a80.a$e */
    public static final class C103325e extends C66704d {

        /* renamed from: d */
        public Object f304657d;

        /* renamed from: e */
        public /* synthetic */ Object f304658e;

        /* renamed from: f */
        public final /* synthetic */ C103320a f304659f;

        /* renamed from: g */
        public int f304660g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103325e(C103320a aVar, C15601d<? super C103325e> dVar) {
            super(dVar);
            this.f304659f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f304658e = obj;
            this.f304660g |= Integer.MIN_VALUE;
            return C103320a.m136823H(this.f304659f, this);
        }
    }

    public C103320a(int i) {
        this.f304625d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m136820D(a80.C103320a r7, wx3.C15601d r8) {
        /*
            boolean r0 = r8 instanceof a80.C103320a.C103321a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a80.a$a r0 = (a80.C103320a.C103321a) r0
            int r1 = r0.f304638g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f304638g = r1
            goto L_0x0018
        L_0x0013:
            a80.a$a r0 = new a80.a$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f304636e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f304638g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00c2
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r7 = r0.f304635d
            a80.a r7 = (a80.C103320a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00ae
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "MicroMsg.Camera.BaseCameraInstance"
            java.lang.String r2 = "onResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            r0.f304635d = r7
            r0.f304638g = r4
            r7.getClass()
            wx3.h r2 = new wx3.h
            wx3.d r5 = xx3.C66447b.m78392b(r0)
            r2.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "makeSureScreenReady >> "
            r5.append(r6)
            e80.c r6 = r7.f304631j
            e80.j r6 = r6.f320907b
            e80.i r6 = r6.f320922a
            int r6 = r6.f320920a
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            e80.c r6 = r7.f304631j
            e80.j r6 = r6.f320907b
            e80.i r6 = r6.f320922a
            int r6 = r6.f320921b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            e80.c r8 = r7.f304631j
            e80.j r8 = r8.f320907b
            e80.i r8 = r8.f320922a
            int r5 = r8.f320920a
            if (r5 <= 0) goto L_0x0091
            int r8 = r8.f320921b
            if (r8 <= 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r4 = 0
        L_0x0092:
            if (r4 == 0) goto L_0x00a0
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            rx3.b0 r8 = rx3.C13598b0.f38549a
            java.lang.Object r8 = kotlin.Result.m168114constructorimpl(r8)
            r2.resumeWith(r8)
            goto L_0x00a2
        L_0x00a0:
            r7.f304632n = r2
        L_0x00a2:
            java.lang.Object r8 = r2.mo90314b()
            if (r8 != r1) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x00ab:
            if (r8 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            boolean r8 = r7.mo143099B()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r2 = 0
            r0.f304635d = r2
            r0.f304638g = r3
            java.lang.Object r7 = r7.mo143112q(r8, r0)
            if (r7 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.C103320a.m136820D(a80.a, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m136821E(a80.C103320a r16, int r17, int r18, int r19, boolean r20, wx3.C15601d r21) {
        /*
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof a80.C103320a.C103322b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            a80.a$b r2 = (a80.C103320a.C103322b) r2
            int r3 = r2.f304646n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f304646n = r3
            goto L_0x001c
        L_0x0017:
            a80.a$b r2 = new a80.a$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f304644i
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f304646n
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x004e
            if (r4 == r6) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a8
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            int r0 = r2.f304643h
            int r4 = r2.f304642g
            int r6 = r2.f304641f
            java.lang.Object r8 = r2.f304640e
            v70.s r8 = (v70.C111406s) r8
            java.lang.Object r9 = r2.f304639d
            a80.a r9 = (a80.C103320a) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r0
            r12 = r4
            r11 = r6
            r10 = r9
            goto L_0x0088
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r20 == 0) goto L_0x0055
            r1 = 0
            goto L_0x005c
        L_0x0055:
            r1 = r19
            int r1 = -r1
            int r1 = r1 + 360
            int r1 = r1 % 360
        L_0x005c:
            v70.d r4 = r0.f304629h
            v70.s r8 = r0.f304628g
            if (r4 == 0) goto L_0x00a9
            if (r8 != 0) goto L_0x0065
            goto L_0x00a9
        L_0x0065:
            r2.f304639d = r0
            r2.f304640e = r8
            r9 = r17
            r2.f304641f = r9
            r10 = r18
            r2.f304642g = r10
            r2.f304643h = r1
            r2.f304646n = r6
            v70.g r6 = new v70.g
            r6.<init>(r4, r7)
            java.lang.String r11 = "getCurrentFrame"
            java.lang.Object r4 = r4.mo163058p(r11, r6, r2)
            if (r4 != r3) goto L_0x0083
            return r3
        L_0x0083:
            r13 = r1
            r1 = r4
            r11 = r9
            r12 = r10
            r10 = r0
        L_0x0088:
            r14 = r1
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            if (r14 != 0) goto L_0x008e
            return r7
        L_0x008e:
            a80.a$c r0 = new a80.a$c
            r15 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = "takePictureAsync"
            a14.u0 r0 = r8.mo163065y(r1, r0)
            r2.f304639d = r7
            r2.f304640e = r7
            r2.f304646n = r5
            java.lang.Object r1 = r0.mo74634A(r2)
            if (r1 != r3) goto L_0x00a8
            return r3
        L_0x00a8:
            return r1
        L_0x00a9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.C103320a.m136821E(a80.a, int, int, int, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m136822G(a80.C103320a r10, wx3.C15601d r11) {
        /*
            boolean r0 = r11 instanceof a80.C103320a.C103324d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            a80.a$d r0 = (a80.C103320a.C103324d) r0
            int r1 = r0.f304656h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f304656h = r1
            goto L_0x0018
        L_0x0013:
            a80.a$d r0 = new a80.a$d
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f304654f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f304656h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            int r10 = r0.f304653e
            java.lang.Object r0 = r0.f304652d
            a80.a r0 = (a80.C103320a) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00cf
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            int r10 = r0.f304653e
            java.lang.Object r2 = r0.f304652d
            a80.a r2 = (a80.C103320a) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r10 = r2
            goto L_0x00af
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r11)
            int r11 = r10.mo143122c()
            int r2 = r10.mo143117w()
            int r6 = r2 - r11
            int r6 = r6 + 360
            int r6 = r6 % 360
            int r7 = r11 - r2
            int r7 = r7 + 360
            int r7 = r7 % 360
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "cameraRotate:"
            r8.append(r9)
            r8.append(r11)
            java.lang.String r11 = " displayRotate:"
            r8.append(r11)
            r8.append(r2)
            java.lang.String r11 = " render rotate:"
            r8.append(r11)
            r8.append(r6)
            java.lang.String r11 = " mirror:"
            r8.append(r11)
            boolean r11 = r10.needMirror()
            r8.append(r11)
            java.lang.String r11 = " focusRotate:"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            java.lang.String r2 = "MicroMsg.Camera.BaseCameraInstance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            v70.d r11 = r10.f304629h
            if (r11 == 0) goto L_0x00b1
            r0.f304652d = r10
            r0.f304653e = r7
            r0.f304656h = r5
            v70.p r2 = new v70.p
            r2.<init>(r6, r11, r3)
            java.lang.String r5 = "updateInputRotate"
            java.lang.Object r11 = r11.mo163058p(r5, r2, r0)
            if (r11 != r1) goto L_0x00af
            return r1
        L_0x00af:
            rx3.b0 r11 = (rx3.C13598b0) r11
        L_0x00b1:
            v70.d r11 = r10.f304629h
            if (r11 == 0) goto L_0x00d3
            boolean r2 = r10.needMirror()
            r0.f304652d = r10
            r0.f304653e = r7
            r0.f304656h = r4
            v70.o r4 = new v70.o
            r4.<init>(r2, r11, r3)
            java.lang.String r2 = "updateInputMirror"
            java.lang.Object r11 = r11.mo163058p(r2, r4, r0)
            if (r11 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            r0 = r10
            r10 = r7
        L_0x00cf:
            rx3.b0 r11 = (rx3.C13598b0) r11
            r7 = r10
            r10 = r0
        L_0x00d3:
            r10.mo143101F(r7)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.C103320a.m136822G(a80.a, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m136823H(a80.C103320a r7, wx3.C15601d r8) {
        /*
            boolean r0 = r8 instanceof a80.C103320a.C103325e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a80.a$e r0 = (a80.C103320a.C103325e) r0
            int r1 = r0.f304660g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f304660g = r1
            goto L_0x0018
        L_0x0013:
            a80.a$e r0 = new a80.a$e
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f304658e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f304660g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r6) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0091
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            java.lang.Object r7 = r0.f304657d
            a80.a r7 = (a80.C103320a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0081
        L_0x0040:
            java.lang.Object r7 = r0.f304657d
            a80.a r7 = (a80.C103320a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0072
        L_0x0048:
            java.lang.Object r7 = r0.f304657d
            a80.a r7 = (a80.C103320a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0062
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r8)
            v70.d r8 = r7.f304629h
            if (r8 == 0) goto L_0x0064
            r0.f304657d = r7
            r0.f304660g = r6
            java.lang.Object r8 = r8.mo163056j(r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            rx3.b0 r8 = (rx3.C13598b0) r8
        L_0x0064:
            r0.f304657d = r7
            r0.f304660g = r5
            r7.getClass()
            java.lang.Object r8 = m136822G(r7, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            v70.d r8 = r7.f304629h
            if (r8 == 0) goto L_0x0081
            r0.f304657d = r7
            r0.f304660g = r4
            java.lang.Object r8 = r8.mo163054g(r0)
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x0081:
            v70.d r7 = r7.f304629h
            if (r7 == 0) goto L_0x0092
            r8 = 0
            r0.f304657d = r8
            r0.f304660g = r3
            java.lang.Object r8 = r7.mo163059q(r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            return r8
        L_0x0092:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.C103320a.m136823H(a80.a, wx3.d):java.lang.Object");
    }

    /* renamed from: A */
    public C107261i mo143098A() {
        return this.f304631j.f320907b.f320923b;
    }

    /* renamed from: B */
    public boolean mo143099B() {
        return mo143116v().f320908c;
    }

    /* renamed from: C */
    public final boolean mo143100C() {
        C107254b bVar = this.f304630i;
        if (bVar != null && bVar.f320903d) {
            return (bVar != null && bVar.f320904e) && this.f304634p && mo143099B();
        }
    }

    /* renamed from: F */
    public void mo143101F(int i) {
        this.f304631j.f320910e = i;
    }

    /* renamed from: d */
    public Object mo143102d(C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.Camera.BaseCameraInstance", "onPause");
        Object p = mo143111p(dVar);
        return p == C15911a.COROUTINE_SUSPENDED ? p : C13598b0.f38549a;
    }

    /* renamed from: e */
    public Object mo143103e(C15601d<? super C13598b0> dVar) {
        return m136820D(this, dVar);
    }

    /* renamed from: f */
    public final Bitmap mo143104f(int i, int i2, int i3, Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0 && i2 > 0) {
            float min = Math.min((((float) i) * 1.0f) / ((float) bitmap.getWidth()), (((float) i2) * 1.0f) / ((float) bitmap.getHeight()));
            return min >= 1.0f ? i3 == 0 ? bitmap : BitmapUtil.rotate(bitmap, (float) i3) : BitmapUtil.rotateAndScale(bitmap, (float) i3, min, min, z);
        } else if (i > 0) {
            float min2 = (((float) i) * 1.0f) / ((float) Math.min(bitmap.getHeight(), bitmap.getWidth()));
            return (min2 < 1.0f || i3 != 0 || z) ? BitmapUtil.rotateAndScale(bitmap, (float) i3, Math.min(min2, 1.0f), Math.min(min2, 1.0f), z) : bitmap;
        } else if (i2 > 0) {
            float min3 = Math.min((((float) i2) * 1.0f) / ((float) Math.max(bitmap.getHeight(), bitmap.getWidth())), 1.0f);
            return (min3 < 1.0f || i3 != 0 || z) ? BitmapUtil.rotateAndScale(bitmap, (float) i3, Math.min(min3, 1.0f), Math.min(min3, 1.0f), z) : bitmap;
        } else if (i3 <= 0) {
            return bitmap;
        } else {
            Log.m105920e("MicroMsg.Camera.BaseCameraInstance", "BitmapUtil mirror error");
            return BitmapUtil.rotate(bitmap, (float) i3, true);
        }
    }

    /* renamed from: g */
    public boolean mo143105g() {
        return this.f304631j.f320911f;
    }

    /* renamed from: k */
    public Object mo143106k(C15601d<? super C13598b0> dVar) {
        return m136823H(this, dVar);
    }

    /* renamed from: l */
    public Object mo143107l(Context context, C0125s sVar, C111389d dVar, C111406s sVar2, C15601d<? super C13598b0> dVar2) {
        C87412m.m108594g(context, "<set-?>");
        this.f304626e = context;
        this.f304627f = sVar;
        this.f304629h = dVar;
        this.f304628g = sVar2;
        C107255c cVar = this.f304631j;
        C107262j jVar = dVar.f333482j;
        cVar.getClass();
        C87412m.m108594g(jVar, "<set-?>");
        cVar.f320907b = jVar;
        C111737a aVar = C111737a.f334621a;
        C107255c cVar2 = this.f304631j;
        aVar.getClass();
        C87412m.m108594g(cVar2, "info");
        C111737a.f334624d = cVar2;
        return C13598b0.f38549a;
    }

    /* renamed from: m */
    public Object mo143108m(int i, int i2, C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.Camera.BaseCameraInstance", "updateScreenSize >> " + i + ", " + i2);
        C15601d<? super C13598b0> dVar2 = this.f304632n;
        if (dVar2 != null) {
            Result.Companion companion = Result.Companion;
            ((C66218h) dVar2).resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        this.f304632n = null;
        return C13598b0.f38549a;
    }

    /* renamed from: n */
    public boolean mo143109n() {
        return this.f304631j.f320906a.f320898b;
    }

    /* renamed from: o */
    public boolean mo143110o() {
        return this.f304631j.f320906a.f320899c;
    }

    /* renamed from: p */
    public Object mo143111p(C15601d<? super C13598b0> dVar) {
        this.f304631j.f320911f = false;
        return C13598b0.f38549a;
    }

    /* renamed from: q */
    public Object mo143112q(Boolean bool, C15601d<? super C13598b0> dVar) {
        this.f304631j.f320911f = true;
        return C13598b0.f38549a;
    }

    /* renamed from: r */
    public boolean mo143113r(C107254b bVar) {
        boolean z = false;
        if (this.f304630i != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CameraKitCommonSetting >> ");
        Boolean bool = null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.f320904e) : null);
        sb.append(", ");
        sb.append(bVar != null ? Boolean.valueOf(bVar.f320902c) : null);
        sb.append(", ");
        sb.append(bVar != null ? Boolean.valueOf(bVar.f320905f) : null);
        sb.append(", ");
        if (bVar != null) {
            bool = Boolean.valueOf(bVar.f320903d);
        }
        sb.append(bool);
        Log.m105924i("MicroMsg.Camera.BaseCameraInstance", sb.toString());
        this.f304630i = bVar;
        boolean z2 = bVar != null ? bVar.f320902c : true;
        boolean z3 = z2 && mo143109n();
        C107255c cVar = this.f304631j;
        if (z2 && z3) {
            z = true;
        }
        cVar.f320908c = z;
        return true;
    }

    /* renamed from: s */
    public Object mo143114s(int i, int i2, int i3, boolean z, C15601d<? super Bitmap> dVar) {
        return m136821E(this, i, i2, i3, z, dVar);
    }

    /* renamed from: u */
    public Object mo143115u(C15601d<? super C13598b0> dVar) {
        return m136822G(this, dVar);
    }

    /* renamed from: v */
    public C107255c mo143116v() {
        return this.f304631j;
    }

    /* renamed from: w */
    public int mo143117w() {
        Context context = this.f304626e;
        if (context != null) {
            int j = C75044y4.m89998j(context);
            int i = 0;
            if (j != 0) {
                if (j == 1) {
                    i = 90;
                } else if (j == 2) {
                    i = 180;
                } else if (j == 3) {
                    i = 270;
                }
            }
            Log.m105924i("MicroMsg.Camera.BaseCameraInstance", "displayRotation:" + i);
            return i;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: z */
    public final void mo143118z(Range<Integer> range, int i, int i2) {
        C108171a aVar = C108171a.f323903a;
        int i3 = this.f304625d;
        boolean z = this.f304634p;
        CameraReportStruct a = aVar.mo158577a(i3);
        if (a != null) {
            a.f310080W = z ? 1 : 2;
        }
        int i4 = this.f304625d;
        int i5 = mo143099B() ? 1 : 2;
        CameraReportStruct a2 = aVar.mo158577a(i4);
        if (a2 != null) {
            a2.f310079V = (long) i5;
        }
        CameraReportStruct a3 = aVar.mo158577a(this.f304625d);
        if (a3 != null) {
            a3.f310087f = i2;
        }
        CameraReportStruct a4 = aVar.mo158577a(this.f304625d);
        if (a4 != null) {
            a4.f310078U = i;
        }
        int i6 = this.f304625d;
        Integer num = null;
        Integer lower = range != null ? range.getLower() : null;
        int i7 = 0;
        int intValue = lower == null ? 0 : lower.intValue();
        CameraReportStruct a5 = aVar.mo158577a(i6);
        if (a5 != null) {
            a5.f310076S = intValue;
        }
        int i8 = this.f304625d;
        if (range != null) {
            num = range.getUpper();
        }
        if (num != null) {
            i7 = num.intValue();
        }
        CameraReportStruct a6 = aVar.mo158577a(i8);
        if (a6 != null) {
            a6.f310077T = i7;
        }
    }
}
