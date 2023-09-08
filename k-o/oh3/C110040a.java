package oh3;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import kotlin.ResultKt;
import p1104d1.C106967a;
import p1104d1.C106969c;
import p175j0.C108504h;
import p175j0.C60690y0;
import p436a1.C103230e;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: oh3.a */
public final class C110040a {

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.widget.AvatarImageKt$AvatarImage$1$1", mo125469f = "AvatarImage.kt", mo125470l = {30}, mo125471m = "invokeSuspend")
    /* renamed from: oh3.a$a */
    public static final class C62017a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f176295d;

        /* renamed from: e */
        public final /* synthetic */ String f176296e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<C106969c> f176297f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62017a(String str, C60690y0<C106969c> y0Var, C15601d<? super C62017a> dVar) {
            super(2, dVar);
            this.f176296e = str;
            this.f176297f = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62017a(this.f176296e, this.f176297f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62017a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f176295d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f176296e;
                this.f176295d = 1;
                Log.m105924i("PlatformOp", "getAvatarBitmap() called with: userName = " + str);
                obj = null;
                if (aVar == null) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f176297f.setValue(new C106967a(C103230e.m136642b(bitmap), 0, 0, 6, (C8480h) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh3.a$b */
    public static final class C62018b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f176298d;

        /* renamed from: e */
        public final /* synthetic */ float f176299e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f176300f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f176301g;

        /* renamed from: h */
        public final /* synthetic */ int f176302h;

        /* renamed from: i */
        public final /* synthetic */ int f176303i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62018b(String str, float f, C65503j jVar, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f176298d = str;
            this.f176299e = f;
            this.f176300f = jVar;
            this.f176301g = aVar;
            this.f176302h = i;
            this.f176303i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C110040a.m149549a(this.f176298d, this.f176299e, this.f176300f, this.f176301g, (C108504h) obj, this.f176302h | 1, this.f176303i);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m149549a(java.lang.String r22, float r23, p721v0.C65503j r24, fy3.C32224a<rx3.C13598b0> r25, p175j0.C108504h r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r10 = r25
            r11 = r27
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "onClick"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 1926403831(0x72d296f7, float:8.342318E30)
            r3 = r26
            j0.h r0 = r3.mo51623z(r0)
            r3 = r28 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0023
            r3 = r11 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.mo51619x(r1)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r11
            goto L_0x0033
        L_0x0032:
            r3 = r11
        L_0x0033:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004a
        L_0x003a:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            boolean r5 = r0.mo51588h(r2)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
        L_0x004a:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r24
            boolean r7 = r0.mo51619x(r6)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r7
            goto L_0x0066
        L_0x0064:
            r6 = r24
        L_0x0066:
            r7 = r28 & 8
            if (r7 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007d
            boolean r7 = r0.mo51619x(r10)
            if (r7 == 0) goto L_0x007a
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r7
        L_0x007d:
            r7 = r3 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0090
            boolean r7 = r0.mo51575a()
            if (r7 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r0.mo51581d()
            r3 = r6
            goto L_0x012b
        L_0x0090:
            if (r5 == 0) goto L_0x0098
            int r5 = p721v0.C65503j.f188489K0
            v0.j$a r5 = p721v0.C65503j.C65504a.f188490d
            r15 = r5
            goto L_0x0099
        L_0x0098:
            r15 = r6
        L_0x0099:
            r5 = 2131755464(0x7f1001c8, float:1.9141808E38)
            r6 = 0
            d1.c r5 = ta0.C110954a.m151256d(r5, r0, r6)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r6)
            java.lang.Object r6 = r0.mo51606q()
            int r7 = p175j0.C108504h.f324828a
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            r8 = 0
            if (r6 != r7) goto L_0x00b9
            j0.y0 r6 = p175j0.C108500f2.m146996c(r5, r8, r4, r8)
            r0.mo51553F(r6)
        L_0x00b9:
            r0.mo51565P()
            j0.y0 r6 = (p175j0.C60690y0) r6
            r3 = r3 & 14
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r4)
            boolean r4 = r0.mo51619x(r1)
            boolean r5 = r0.mo51619x(r6)
            r4 = r4 | r5
            java.lang.Object r5 = r0.mo51606q()
            if (r4 != 0) goto L_0x00d7
            if (r5 != r7) goto L_0x00df
        L_0x00d7:
            oh3.a$a r5 = new oh3.a$a
            r5.<init>(r1, r6, r8)
            r0.mo51553F(r5)
        L_0x00df:
            r0.mo51565P()
            fy3.p r5 = (fy3.C32227p) r5
            r3 = r3 | 64
            p175j0.C60655g0.m70932c(r1, r5, r0, r3)
            java.lang.Object r3 = r6.getValue()
            r12 = r3
            d1.c r12 = (p1104d1.C106969c) r12
            int r3 = p631o1.C109836f.f328763a
            o1.f r16 = p631o1.C109836f.C109837a.f328764a
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
            v0.j r3 = p435a0.C103214y0.m136594j(r3, r2)
            v0.j r3 = r3.mo74972i0(r15)
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 7
            r9 = 0
            r7 = r25
            v0.j r3 = p267x.C111940o.m152651d(r3, r4, r5, r6, r7, r8, r9)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            float r4 = r4 * r2
            e0.f r4 = p502e0.C107074g.m144958a(r4)
            v0.j r14 = p868x0.C111979d.m152690a(r3, r4)
            r3 = 0
            r17 = 0
            r18 = 0
            r20 = 24632(0x6038, float:3.4517E-41)
            r21 = 104(0x68, float:1.46E-43)
            java.lang.String r13 = "avatar"
            r5 = r15
            r15 = r3
            r19 = r0
            p267x.C111897d1.m152617a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3 = r5
        L_0x012b:
            j0.v1 r7 = r0.mo51596l()
            if (r7 != 0) goto L_0x0132
            goto L_0x0145
        L_0x0132:
            oh3.a$b r8 = new oh3.a$b
            r0 = r8
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo51650a(r8)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh3.C110040a.m149549a(java.lang.String, float, v0.j, fy3.a, j0.h, int, int):void");
    }
}
