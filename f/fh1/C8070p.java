package fh1;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c50.C54655b;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32225b;
import fy3.C32227p;
import fy3.C32230s;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import org.libpag.PAGView;
import rx3.C13598b0;
import vo1.C65770a0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.p */
public final class C8070p extends C8313a {

    /* renamed from: j */
    public ViewGroup f26834j;

    /* renamed from: n */
    public LinearLayout f26835n;

    /* renamed from: o */
    public ImageView f26836o;

    /* renamed from: p */
    public TextView f26837p;

    /* renamed from: q */
    public TextView f26838q;

    /* renamed from: r */
    public final C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean> f26839r = new C8074d(this);

    /* renamed from: s */
    public String f26840s = "";

    /* renamed from: t */
    public C53973z1 f26841t;

    /* renamed from: u */
    public C53973z1 f26842u;

    /* renamed from: v */
    public final Map<String, C8071a> f26843v = new LinkedHashMap();

    /* renamed from: w */
    public final Map<String, Rect> f26844w = new LinkedHashMap();

    /* renamed from: fh1.p$a */
    public static final class C8071a {

        /* renamed from: a */
        public final FrameLayout f26845a;

        /* renamed from: b */
        public final FrameLayout f26846b;

        /* renamed from: c */
        public final PAGView f26847c;

        /* renamed from: d */
        public final TextView f26848d;

        /* renamed from: e */
        public Rect f26849e;

        /* renamed from: f */
        public C53973z1 f26850f;

        public C8071a(FrameLayout frameLayout, FrameLayout frameLayout2, PAGView pAGView, TextView textView, Rect rect, C53973z1 z1Var) {
            C87412m.m108594g(frameLayout, "micLinkScaleLayout");
            C87412m.m108594g(frameLayout2, "pagAreaLayout");
            C87412m.m108594g(pAGView, "pagView");
            C87412m.m108594g(textView, "nickNameTv");
            this.f26845a = frameLayout;
            this.f26846b = frameLayout2;
            this.f26847c = pAGView;
            this.f26848d = textView;
            this.f26849e = rect;
            this.f26850f = z1Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8071a)) {
                return false;
            }
            C8071a aVar = (C8071a) obj;
            return C87412m.m108589b(this.f26845a, aVar.f26845a) && C87412m.m108589b(this.f26846b, aVar.f26846b) && C87412m.m108589b(this.f26847c, aVar.f26847c) && C87412m.m108589b(this.f26848d, aVar.f26848d) && C87412m.m108589b(this.f26849e, aVar.f26849e) && C87412m.m108589b(this.f26850f, aVar.f26850f);
        }

        public int hashCode() {
            int hashCode = ((((((this.f26845a.hashCode() * 31) + this.f26846b.hashCode()) * 31) + this.f26847c.hashCode()) * 31) + this.f26848d.hashCode()) * 31;
            Rect rect = this.f26849e;
            int i = 0;
            int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
            C53973z1 z1Var = this.f26850f;
            if (z1Var != null) {
                i = z1Var.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "AllWidget(micLinkScaleLayout=" + this.f26845a + ", pagAreaLayout=" + this.f26846b + ", pagView=" + this.f26847c + ", nickNameTv=" + this.f26848d + ", rect=" + this.f26849e + ", executeJob=" + this.f26850f + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$onViewMount$1$1$2", mo125469f = "GestureEffectPagController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.p$b */
    public static final class C8072b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C8070p f26851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8072b(C8070p pVar, C15601d<? super C8072b> dVar) {
            super(2, dVar);
            this.f26851d = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8072b(this.f26851d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8072b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C8070p pVar = this.f26851d;
            StringBuilder sb = new StringBuilder();
            sb.append("手势特效开关\n");
            C8044g gVar = (C8044g) this.f26851d.controller(C8044g.class);
            sb.append(gVar != null ? Boolean.valueOf(gVar.f26761n) : null);
            pVar.mo9159K3(sb.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.p$c */
    public static final class C8073c extends C87413o implements C32230s<String, Float, Float, Float, Float, C54655b.C54656a> {

        /* renamed from: d */
        public final /* synthetic */ C8070p f26852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8073c(C8070p pVar) {
            super(5);
            this.f26852d = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0091, code lost:
            r1 = r1.f131406n;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo237D(java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
            /*
                r21 = this;
                r0 = r21
                r12 = r22
                java.lang.String r12 = (java.lang.String) r12
                r1 = r23
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                r2 = r24
                java.lang.Number r2 = (java.lang.Number) r2
                float r13 = r2.floatValue()
                r2 = r25
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                r3 = r26
                java.lang.Number r3 = (java.lang.Number) r3
                float r14 = r3.floatValue()
                java.lang.String r3 = "gestureId"
                gy3.C87412m.m108594g(r12, r3)
                float r15 = -r1
                float r11 = -r2
                long r1 = java.lang.System.nanoTime()
                java.lang.String r16 = java.lang.String.valueOf(r1)
                fh1.p r1 = r0.f26852d
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.business(r2)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.mo76015n4()
                if (r1 != 0) goto L_0x0047
                java.lang.String r1 = ""
            L_0x0047:
                r17 = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                fh1.p r2 = r0.f26852d
                fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean> r2 = r2.f26839r
                java.lang.Float r3 = java.lang.Float.valueOf(r1)
                java.lang.Float r6 = java.lang.Float.valueOf(r15)
                java.lang.Float r7 = java.lang.Float.valueOf(r13)
                java.lang.Float r8 = java.lang.Float.valueOf(r11)
                java.lang.Float r9 = java.lang.Float.valueOf(r14)
                fh1.p r1 = r0.f26852d
                java.lang.String r10 = r1.f26840s
                r1 = r2
                fh1.p$d r1 = (fh1.C8070p.C8074d) r1
                java.lang.String r18 = ""
                r2 = r17
                r4 = r12
                r5 = r16
                r19 = r11
                r11 = r18
                java.lang.Object r1 = r1.mo9163x0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r2 = r1.booleanValue()
                c50.b$a r18 = new c50.b$a
                fh1.p r1 = r0.f26852d
                java.lang.String r11 = r1.f26840s
                xh1.d r1 = xh1.C15685d.f42379a
                int r3 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r12)
                te3.bz0 r1 = r1.mo14430a(r3)
                if (r1 == 0) goto L_0x009a
                te3.cz0 r1 = r1.f131406n
                if (r1 == 0) goto L_0x009a
                int r1 = r1.f132038g
                r20 = r1
                goto L_0x009d
            L_0x009a:
                r1 = -1
                r20 = -1
            L_0x009d:
                r4 = 1056964608(0x3f000000, float:0.5)
                r1 = r18
                r3 = r17
                r5 = r12
                r6 = r16
                r7 = r15
                r8 = r13
                r9 = r19
                r10 = r14
                r12 = r20
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r18
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8070p.C8073c.mo237D(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: fh1.p$d */
    public static final class C8074d extends C87413o implements C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C8070p f26853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8074d(C8070p pVar) {
            super(10);
            this.f26853d = pVar;
        }

        /* renamed from: x0 */
        public Object mo9163x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            boolean z;
            String str = (String) obj;
            float floatValue = ((Number) obj2).floatValue();
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            float floatValue2 = ((Number) obj5).floatValue();
            float floatValue3 = ((Number) obj6).floatValue();
            float floatValue4 = ((Number) obj7).floatValue();
            float floatValue5 = ((Number) obj8).floatValue();
            String str4 = (String) obj9;
            String str5 = (String) obj10;
            C87412m.m108594g(str, "sdkUserId");
            C87412m.m108594g(str2, "gestureId");
            C87412m.m108594g(str3, "randomId");
            C87412m.m108594g(str4, "giftComboId");
            C87412m.m108594g(str5, "giftSoundId");
            try {
                z = C8070p.m8180m3(this.f26853d, str, floatValue, str2, str3, floatValue2, floatValue3, floatValue4, floatValue5, str4, str5);
            } catch (Exception e) {
                Log.m105920e("Finder.GestureEffectPagController", e.toString());
                z = false;
            }
            if (z) {
                C61926c.m72668M(new C8081s(this.f26853d, str4, str2));
            }
            return Boolean.valueOf(z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$showDebugInfoInScreen$1", mo125469f = "GestureEffectPagController.kt", mo125470l = {743}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.p$e */
    public static final class C8075e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f26854d;

        /* renamed from: e */
        public final /* synthetic */ C8070p f26855e;

        /* renamed from: f */
        public final /* synthetic */ String f26856f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8075e(C8070p pVar, String str, C15601d<? super C8075e> dVar) {
            super(2, dVar);
            this.f26855e = pVar;
            this.f26856f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8075e(this.f26855e, this.f26856f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8075e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26854d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TextView textView = this.f26855e.f26838q;
                if (textView != null) {
                    textView.setText(this.f26856f);
                }
                TextView textView2 = this.f26855e.f26838q;
                if (textView2 != null) {
                    textView2.setMaxLines(99);
                }
                TextView textView3 = this.f26855e.f26838q;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                this.f26854d = 1;
                if (C53965x0.m60607b(3000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextView textView4 = this.f26855e.f26838q;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8070p(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r0.f26847c.isPlaying() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r0 = (qj1.C12399ff) r0.getPlugin(qj1.C12399ff.class);
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m8180m3(fh1.C8070p r18, java.lang.String r19, float r20, java.lang.String r21, java.lang.String r22, float r23, float r24, float r25, float r26, java.lang.String r27, java.lang.String r28) {
        /*
            r12 = r18
            r18.getClass()
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86066I1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r13 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0018
        L_0x0015:
            r13 = 0
            goto L_0x011f
        L_0x0018:
            com.tencent.mm.plugin.finder.live.view.b2 r0 = r12.f27261e
            if (r0 == 0) goto L_0x002e
            java.lang.Class<qj1.ff> r2 = qj1.C12399ff.class
            qj1.c r0 = r0.getPlugin(r2)
            qj1.ff r0 = (qj1.C12399ff) r0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.mo82893g0()
            if (r0 != r13) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            goto L_0x0015
        L_0x0032:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x0045
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.f166264k
            if (r0 != r13) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            goto L_0x0015
        L_0x0049:
            java.lang.String r0 = r18.mo9157I3(r19)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            java.lang.String r3 = "Finder.GestureEffectPagController"
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "#executeAnimationCommand widgetBucketKey is empty, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
        L_0x005f:
            java.util.Map<java.lang.String, fh1.p$a> r2 = r12.f26843v
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            fh1.p$a r0 = (fh1.C8070p.C8071a) r0
            if (r0 == 0) goto L_0x0083
            a14.z1 r2 = r0.f26850f
            if (r2 == 0) goto L_0x0077
            boolean r2 = r2.mo74466a()
            if (r2 != r13) goto L_0x0077
            r2 = 1
            goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            if (r2 != 0) goto L_0x0015
            org.libpag.PAGView r0 = r0.f26847c
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L_0x0083
            goto L_0x0015
        L_0x0083:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#executeAnimationCommand ready: sdkUserId="
            r0.append(r1)
            r2 = r19
            r0.append(r2)
            java.lang.String r1 = " aspect="
            r0.append(r1)
            r4 = r20
            r0.append(r4)
            java.lang.String r1 = " gestureId="
            r0.append(r1)
            r5 = r21
            r0.append(r5)
            java.lang.String r1 = " randomId="
            r0.append(r1)
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = " transX="
            r0.append(r1)
            r6 = r23
            r0.append(r6)
            java.lang.String r1 = " transY="
            r0.append(r1)
            r7 = r24
            r0.append(r7)
            java.lang.String r1 = " rotation="
            r0.append(r1)
            r8 = r25
            r0.append(r8)
            java.lang.String r1 = " scale="
            r0.append(r1)
            r9 = r26
            r0.append(r9)
            java.lang.String r1 = " giftComboId="
            r0.append(r1)
            r10 = r27
            r0.append(r10)
            java.lang.String r1 = " giftSoundId="
            r0.append(r1)
            r11 = r28
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r14 = 0
            r15 = 0
            fh1.r r16 = new fh1.r
            r17 = 0
            r0 = r16
            r1 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 3
            r1 = 0
            r19 = r14
            r20 = r15
            r21 = r16
            r22 = r0
            r23 = r1
            nk1.C11207i.m11066b(r18, r19, r20, r21, r22, r23)
        L_0x011f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8070p.m8180m3(fh1.p, java.lang.String, float, java.lang.String, java.lang.String, float, float, float, float, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0196  */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m8181n3(fh1.C8070p r18, te3.C48928bz0 r19, fh1.C8070p.C8071a r20, xh1.C23087a.C15678c r21, float r22, float r23, float r24, float r25, java.lang.String r26, wx3.C15601d r27) {
        /*
            r0 = r18
            r1 = r20
            r2 = r26
            r3 = r27
            r18.getClass()
            boolean r4 = r3 instanceof fh1.C8082t
            if (r4 == 0) goto L_0x001e
            r4 = r3
            fh1.t r4 = (fh1.C8082t) r4
            int r5 = r4.f26902j
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f26902j = r5
            goto L_0x0023
        L_0x001e:
            fh1.t r4 = new fh1.t
            r4.<init>(r0, r3)
        L_0x0023:
            java.lang.Object r3 = r4.f26900h
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f26902j
            r7 = 2
            r8 = 1
            java.lang.String r10 = ""
            if (r6 == 0) goto L_0x0055
            if (r6 != r8) goto L_0x004d
            java.lang.Object r0 = r4.f26899g
            xh1.a$c r0 = (xh1.C23087a.C15678c) r0
            java.lang.Object r1 = r4.f26898f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.f26897e
            fh1.p$a r2 = (fh1.C8070p.C8071a) r2
            java.lang.Object r4 = r4.f26896d
            fh1.p r4 = (fh1.C8070p) r4
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r0
            r0 = r4
            r17 = r2
            r2 = r1
            r1 = r17
            goto L_0x0182
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r3)
            android.widget.FrameLayout r3 = r1.f26845a
            android.view.ViewGroup r6 = r0.f26834j
            if (r6 == 0) goto L_0x0063
            int r6 = r6.getWidth()
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            android.view.ViewGroup r11 = r0.f26834j
            if (r11 == 0) goto L_0x006d
            int r11 = r11.getHeight()
            goto L_0x006e
        L_0x006d:
            r11 = 0
        L_0x006e:
            r12 = 0
            if (r6 == 0) goto L_0x00ce
            if (r11 != 0) goto L_0x0074
            goto L_0x00ce
        L_0x0074:
            android.graphics.Rect r13 = r1.f26849e
            if (r13 == 0) goto L_0x007b
            int r14 = r13.left
            goto L_0x007c
        L_0x007b:
            r14 = 0
        L_0x007c:
            if (r13 == 0) goto L_0x0081
            int r15 = r13.top
            goto L_0x0082
        L_0x0081:
            r15 = 0
        L_0x0082:
            if (r13 == 0) goto L_0x0087
            int r9 = r13.right
            goto L_0x0088
        L_0x0087:
            r9 = r6
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            int r13 = r13.bottom
            goto L_0x008e
        L_0x008d:
            r13 = r11
        L_0x008e:
            float r8 = (float) r14
            r3.setTranslationX(r8)
            float r8 = (float) r15
            r3.setTranslationY(r8)
            float r6 = (float) r6
            float r8 = (float) r11
            float r11 = r6 / r8
            int r9 = r9 - r14
            float r9 = (float) r9
            int r13 = r13 - r15
            float r13 = (float) r13
            float r14 = r9 / r13
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            if (r15 == 0) goto L_0x00bc
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00b0
            float r11 = r6 / r14
            int r11 = (int) r11
            r15.height = r11
            goto L_0x00b9
        L_0x00b0:
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b9
            float r14 = r14 * r8
            int r11 = (int) r14
            r15.width = r11
        L_0x00b9:
            r3.setLayoutParams(r15)
        L_0x00bc:
            float r9 = r9 / r6
            float r13 = r13 / r8
            float r6 = java.lang.Math.max(r9, r13)
            r3.setPivotX(r12)
            r3.setPivotY(r12)
            r3.setScaleX(r6)
            r3.setScaleY(r6)
        L_0x00ce:
            android.widget.FrameLayout r3 = r1.f26846b
            r6 = r19
            te3.cz0 r6 = r6.f131406n
            if (r6 == 0) goto L_0x00d9
            int r8 = r6.f132035d
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x00e1
            float r11 = r6.f132036e
            goto L_0x00e3
        L_0x00e1:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00e3:
            if (r6 == 0) goto L_0x00e8
            float r6 = r6.f132037f
            goto L_0x00ea
        L_0x00e8:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00ea:
            float r11 = r11 * r25
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r6 = r11
        L_0x00f2:
            android.view.ViewGroup r11 = r0.f26834j
            if (r11 == 0) goto L_0x00fb
            int r11 = r11.getWidth()
            goto L_0x00fc
        L_0x00fb:
            r11 = 0
        L_0x00fc:
            android.view.ViewGroup r13 = r0.f26834j
            if (r13 == 0) goto L_0x0105
            int r13 = r13.getHeight()
            goto L_0x0106
        L_0x0105:
            r13 = 0
        L_0x0106:
            if (r11 == 0) goto L_0x0252
            if (r13 != 0) goto L_0x010c
            goto L_0x0252
        L_0x010c:
            float r14 = r22 + r9
            r15 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r15
            float r14 = r9 - r14
            float r12 = (float) r11
            float r14 = r14 * r12
            int r11 = r11 / r7
            float r11 = (float) r11
            float r14 = r14 - r11
            r3.setTranslationX(r14)
            float r11 = r23 + r9
            float r11 = r11 / r15
            float r9 = r9 - r11
            float r11 = (float) r13
            float r9 = r9 * r11
            int r13 = r13 / r7
            float r11 = (float) r13
            float r9 = r9 - r11
            r3.setTranslationY(r9)
            org.libpag.PAGView r9 = r1.f26847c
            r9.setScaleX(r6)
            org.libpag.PAGView r9 = r1.f26847c
            r9.setScaleY(r6)
            r6 = r24
            double r11 = (double) r6
            double r11 = java.lang.Math.toDegrees(r11)
            float r6 = (float) r11
            if (r8 == 0) goto L_0x0155
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x014b
            int r11 = -r8
            float r11 = (float) r11
            int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x014b
            float r6 = (float) r8
            float r6 = -r6
            goto L_0x0155
        L_0x014b:
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0155
            float r8 = (float) r8
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0155
            r6 = r8
        L_0x0155:
            r3.setRotation(r6)
            int r3 = r26.length()
            if (r3 <= 0) goto L_0x0160
            r3 = 1
            goto L_0x0161
        L_0x0160:
            r3 = 0
        L_0x0161:
            if (r3 == 0) goto L_0x018c
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r0.business(r3)
            cl1.o r3 = (cl1.C54991o) r3
            nk1.m r3 = r3.f154316g
            r4.f26896d = r0
            r4.f26897e = r1
            r4.f26898f = r2
            r6 = r21
            r4.f26899g = r6
            r8 = 1
            r4.f26902j = r8
            java.lang.Object r3 = r3.mo86708e(r2, r4)
            if (r3 != r5) goto L_0x0182
            goto L_0x0254
        L_0x0182:
            nk1.m$d r3 = (nk1.C61788m.C11210d) r3
            if (r3 == 0) goto L_0x018e
            java.lang.String r3 = r3.f33065c
            if (r3 == 0) goto L_0x018e
            r10 = r3
            goto L_0x018e
        L_0x018c:
            r6 = r21
        L_0x018e:
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0196
            r8 = 1
            goto L_0x0197
        L_0x0196:
            r8 = 0
        L_0x0197:
            if (r8 == 0) goto L_0x01a7
            int r3 = r10.length()
            if (r3 <= 0) goto L_0x01a1
            r8 = 1
            goto L_0x01a2
        L_0x01a1:
            r8 = 0
        L_0x01a2:
            if (r8 == 0) goto L_0x01a7
            java.lang.String r3 = r6.f42366a
            goto L_0x01a9
        L_0x01a7:
            java.lang.String r3 = r6.f42367b
        L_0x01a9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#executeAnimationCommand pagFinallyPath="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = " giftComboId="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " fromNickName="
            r4.append(r2)
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "Finder.GestureEffectPagController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01d7
            r8 = 1
            goto L_0x01d8
        L_0x01d7:
            r8 = 0
        L_0x01d8:
            r2 = 0
            if (r8 == 0) goto L_0x01dc
            goto L_0x01dd
        L_0x01dc:
            r3 = r2
        L_0x01dd:
            if (r3 == 0) goto L_0x022f
            org.libpag.PAGView r4 = r1.f26847c
            r4.stop()
            org.libpag.PAGView r4 = r1.f26847c
            r4.setPath(r3)
            org.libpag.PAGView r3 = r1.f26847c
            r8 = 1
            r3.setRepeatCount(r8)
            org.libpag.PAGView r3 = r1.f26847c
            r3.setScaleMode(r7)
            org.libpag.PAGView r3 = r1.f26847c
            fh1.u r4 = new fh1.u
            r4.<init>(r1)
            r3.addListener(r4)
            org.libpag.PAGView r3 = r1.f26847c
            r4 = 0
            r3.setProgress(r4)
            org.libpag.PAGView r3 = r1.f26847c
            r3.play()
            org.libpag.PAGView r3 = r1.f26847c
            r3.flush()
            java.lang.String r3 = r6.f42368c
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0219
            r4 = 1
            goto L_0x021a
        L_0x0219:
            r4 = 0
        L_0x021a:
            if (r4 == 0) goto L_0x021d
            goto L_0x021e
        L_0x021d:
            r3 = r2
        L_0x021e:
            if (r3 == 0) goto L_0x0230
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            j50.a r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r4 == 0) goto L_0x0230
            r5 = 9636(0x25a4, float:1.3503E-41)
            r4.mo85690h0(r5, r3, r2)
            goto L_0x0230
        L_0x022f:
            r8 = 1
        L_0x0230:
            int r3 = r10.length()
            if (r3 <= 0) goto L_0x0237
            goto L_0x0238
        L_0x0237:
            r8 = 0
        L_0x0238:
            if (r8 == 0) goto L_0x0252
            r3 = 0
            r4 = 0
            fh1.v r5 = new fh1.v
            r5.<init>(r1, r10, r2)
            r1 = 3
            r2 = 0
            r18 = r0
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r1
            r23 = r2
            nk1.C11207i.m11066b(r18, r19, r20, r21, r22, r23)
        L_0x0252:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0254:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8070p.m8181n3(fh1.p, te3.bz0, fh1.p$a, xh1.a$c, float, float, float, float, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m8182o3(fh1.C8070p r16, te3.C48928bz0 r17, fh1.C8070p.C8071a r18, xh1.C23087a.C15678c r19, float r20, float r21, float r22, float r23, java.lang.String r24, wx3.C15601d r25) {
        /*
            r0 = r17
            r1 = r19
            r2 = r25
            r16.getClass()
            boolean r3 = r2 instanceof fh1.C8090w
            if (r3 == 0) goto L_0x001c
            r3 = r2
            fh1.w r3 = (fh1.C8090w) r3
            int r4 = r3.f26931p
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f26931p = r4
            goto L_0x0023
        L_0x001c:
            fh1.w r3 = new fh1.w
            r4 = r16
            r3.<init>(r4, r2)
        L_0x0023:
            java.lang.Object r2 = r3.f26929n
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f26931p
            java.lang.String r6 = "Finder.GestureEffectPagController"
            r7 = 0
            r9 = 1
            r10 = 2
            if (r5 == 0) goto L_0x005c
            if (r5 == r9) goto L_0x0041
            if (r5 != r10) goto L_0x0039
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x01b9
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            float r0 = r3.f26928j
            float r1 = r3.f26927i
            float r5 = r3.f26926h
            float r11 = r3.f26925g
            java.lang.Object r12 = r3.f26924f
            gy3.f0 r12 = (gy3.C8479f0) r12
            java.lang.Object r13 = r3.f26923e
            xh1.a$c r13 = (xh1.C23087a.C15678c) r13
            java.lang.Object r14 = r3.f26922d
            te3.bz0 r14 = (te3.C48928bz0) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r8 = r0
            r15 = r1
            goto L_0x00db
        L_0x005c:
            kotlin.ResultKt.throwOnFailure(r2)
            c50.b r2 = c50.C54655b.f153178f1
            if (r2 == 0) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 != 0) goto L_0x0071
            java.lang.String r0 = "#renderForWeVision you are not anchor. Why are you here?"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x01d3
        L_0x0071:
            java.lang.String r2 = "#renderForWeVision ready execute"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            gy3.f0 r12 = new gy3.f0
            r12.<init>()
            c50.b r5 = c50.C54655b.f153178f1
            if (r5 != 0) goto L_0x008b
            c50.b r5 = new c50.b
            r5.<init>()
            c50.C54655b.f153178f1 = r5
        L_0x008b:
            c50.b r5 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r5)
            rx3.l r11 = new rx3.l
            int r13 = r0.f131399d
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            java.lang.String r13 = r1.f42369d
            r11.<init>(r14, r13)
            fh1.x r13 = new fh1.x
            r13.<init>(r2)
            fh1.y r14 = new fh1.y
            r14.<init>(r12)
            r5.mo75576H0(r11, r13, r14)
            java.lang.String r5 = "#renderForWeVision wait load animation start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r13 = 2000(0x7d0, double:9.88E-321)
            fh1.z r5 = new fh1.z
            r5.<init>(r2, r7)
            r3.f26922d = r0
            r3.f26923e = r1
            r3.f26924f = r12
            r2 = r20
            r3.f26925g = r2
            r11 = r21
            r3.f26926h = r11
            r15 = r22
            r3.f26927i = r15
            r8 = r23
            r3.f26928j = r8
            r3.f26931p = r9
            java.lang.Object r5 = a14.C53860b3.m60374b(r13, r5, r3)
            if (r5 != r4) goto L_0x00d7
            goto L_0x01d3
        L_0x00d7:
            r14 = r0
            r13 = r1
            r5 = r11
            r11 = r2
        L_0x00db:
            java.lang.String r0 = "#renderForWeVision wait load animation end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = r13.f42368c
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r9 = 0
        L_0x00ea:
            if (r9 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r0 = r7
        L_0x00ee:
            if (r0 == 0) goto L_0x00fe
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x00fe
            r2 = 9636(0x25a4, float:1.3503E-41)
            r1.mo85690h0(r2, r0, r7)
        L_0x00fe:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            float r1 = -r11
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            java.lang.String r1 = "transX"
            r0.put(r1, r2)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            java.lang.String r2 = "transY"
            r0.put(r2, r1)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r8)
            java.lang.String r2 = "scale"
            r0.put(r2, r1)
            float r1 = -r15
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            java.lang.String r1 = "rotate"
            r0.put(r1, r2)
            te3.cz0 r1 = r14.f131406n
            if (r1 == 0) goto L_0x013d
            int r1 = r1.f132035d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L_0x0143
        L_0x013d:
            r1 = 0
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
        L_0x0143:
            java.lang.String r1 = "maxRotationAngle"
            r0.put(r1, r2)
            te3.cz0 r1 = r14.f131406n
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0151
            float r1 = r1.f132037f
            goto L_0x0153
        L_0x0151:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0153:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            java.lang.String r1 = "animationMinimumSize"
            r0.put(r1, r5)
            te3.cz0 r1 = r14.f131406n
            if (r1 == 0) goto L_0x0163
            float r2 = r1.f132036e
        L_0x0163:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            java.lang.String r2 = "scaleCGI"
            r0.put(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "wv_render_params"
            r1.put(r2, r0)
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 != 0) goto L_0x0184
            c50.b r0 = new c50.b
            r0.<init>()
            c50.C54655b.f153178f1 = r0
        L_0x0184:
            c50.b r0 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r0)
            int r2 = r14.f131399d
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "message.toString()"
            gy3.C87412m.m108593f(r1, r5)
            s50.k r5 = r0.f173031q
            c50.c r8 = new c50.c
            r8.<init>(r0, r2, r1)
            r5.mo148312q(r8)
            java.lang.String r0 = "#renderForWeVision wait animation to end. start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            fh1.a0 r2 = new fh1.a0
            r2.<init>(r12, r7)
            r3.f26922d = r7
            r3.f26923e = r7
            r3.f26924f = r7
            r3.f26931p = r10
            java.lang.Object r0 = a14.C53860b3.m60374b(r0, r2, r3)
            if (r0 != r4) goto L_0x01b9
            goto L_0x01d3
        L_0x01b9:
            java.lang.String r0 = "#renderForWeVision wait animation to end. finally end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 != 0) goto L_0x01c9
            c50.b r0 = new c50.b
            r0.<init>()
            c50.C54655b.f153178f1 = r0
        L_0x01c9:
            c50.b r0 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r0)
            r0.mo75576H0(r7, r7, r7)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01d3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8070p.m8182o3(fh1.p, te3.bz0, fh1.p$a, xh1.a$c, float, float, float, float, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: F3 */
    public final void mo9155F3() {
        Log.m105924i("Finder.GestureEffectPagController", "#cleanAllStreamWidget");
        for (Map.Entry entry : ((LinkedHashMap) this.f26843v).entrySet()) {
            ((C8071a) entry.getValue()).f26847c.stop();
            FrameLayout frameLayout = ((C8071a) entry.getValue()).f26845a;
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        ((LinkedHashMap) this.f26843v).clear();
    }

    /* renamed from: G3 */
    public final void mo9156G3() {
        Log.m105924i("Finder.GestureEffectPagController", "#exitGiftMode");
        this.f26840s = "";
        LinearLayout linearLayout = this.f26835n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (!C8048h.f26771n.mo9138c(getStore().getLiveRoomData())) {
            Log.m105924i("Finder.GestureEffectPagController", "#exitGiftMode turn off elable.");
            C8044g gVar = (C8044g) controller(C8044g.class);
            if (gVar != null) {
                gVar.mo9135m3(false);
            }
        }
    }

    /* renamed from: I3 */
    public final String mo9157I3(String str) {
        return str.length() == 0 ? "anchor_self" : (!C87412m.m108589b(str, ((C55001u) business(C55001u.class)).f154419p.f182319n) && !this.f26844w.containsKey(str)) ? "" : str;
    }

    /* renamed from: J3 */
    public final void mo9158J3(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "map");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : linkedHashMap.entrySet()) {
            sb.append(((String) next.getKey()) + XVFSFile.PATH_SEPARATOR_CHAR + next.getValue() + ' ');
        }
        Log.m105924i("Finder.GestureEffectPagController", "#cleanAllStreamWidget " + sb);
        ((LinkedHashMap) this.f26844w).clear();
        this.f26844w.putAll(linkedHashMap);
        mo9155F3();
    }

    /* renamed from: K3 */
    public final void mo9159K3(String str) {
        C87412m.m108594g(str, "info");
        if (!(C54655b.f153178f1 != null)) {
            return;
        }
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            C53973z1 z1Var = this.f26842u;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f26842u = C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C8075e(this, str, (C15601d<? super C8075e>) null), 3, (Object) null);
        }
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r0 = (qj1.C12399ff) r0.getPlugin(qj1.C12399ff.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewMount(android.view.ViewGroup r13) {
        /*
            r12 = this;
            java.lang.String r0 = "pluginLayout"
            gy3.C87412m.m108594g(r13, r0)
            super.onViewMount(r13)
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86066I1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r1 = "Finder.GestureEffectPagController"
            if (r0 != 0) goto L_0x001e
            java.lang.String r13 = "#onViewMount FINDER_LIVE_GESTURE_EFFECT_CONFIG false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x001e:
            com.tencent.mm.plugin.finder.live.view.b2 r0 = r12.f27261e
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0036
            java.lang.Class<qj1.ff> r4 = qj1.C12399ff.class
            qj1.c r0 = r0.getPlugin(r4)
            qj1.ff r0 = (qj1.C12399ff) r0
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.mo82893g0()
            if (r0 != r3) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x003f
            java.lang.String r13 = "#onViewMount landscape ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x003f:
            r0 = 2131303541(0x7f091c75, float:1.82252E38)
            r1 = 2131303540(0x7f091c74, float:1.8225197E38)
            android.view.View r0 = r12.mo9309f3(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x00e6
            r1 = 2131305641(0x7f0924a9, float:1.8229459E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12.f26834j = r1
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x005e
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x00c2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x006d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r1 != 0) goto L_0x006d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x00c2
        L_0x006d:
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r4 = r0.getContext()
            r1.<init>(r4)
            android.content.res.Resources r4 = r1.getResources()
            r5 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r4 = r4.getColor(r5)
            r1.setBackgroundColor(r4)
            android.content.res.Resources r4 = r1.getResources()
            r5 = 2131099810(0x7f0600a2, float:1.7811984E38)
            int r4 = r4.getColor(r5)
            r1.setTextColor(r4)
            android.content.Context r4 = r0.getContext()
            r5 = 3
            int r4 = kg3.C76577a.m92151b(r4, r5)
            float r4 = (float) r4
            r1.setTextSize(r4)
            r4 = 5
            r1.setGravity(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r5 = 21
            r4.gravity = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r0.addView(r1, r4)
            r7 = 0
            r8 = 0
            fh1.p$b r9 = new fh1.p$b
            r4 = 0
            r9.<init>(r12, r4)
            r10 = 3
            r11 = 0
            r6 = r12
            nk1.C11207i.m11066b(r6, r7, r8, r9, r10, r11)
            r12.f26838q = r1
        L_0x00c2:
            r1 = 2131305645(0x7f0924ad, float:1.8229467E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r12.f26835n = r1
            r1 = 2131305644(0x7f0924ac, float:1.8229465E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r12.f26836o = r1
            r1 = 2131305646(0x7f0924ae, float:1.8229469E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r12.f26837p = r1
            r0.requestLayout()
        L_0x00e6:
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 == 0) goto L_0x00eb
            r2 = 1
        L_0x00eb:
            java.lang.String r0 = "l"
            if (r2 == 0) goto L_0x011c
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r13.getClass()
            j50.a r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r13 == 0) goto L_0x0104
            fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean> r1 = r12.f26839r
            gy3.C87412m.m108594g(r1, r0)
            java.util.List<fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean>> r13 = r13.f173015V0
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r1)
        L_0x0104:
            c50.b r13 = c50.C54655b.f153178f1
            if (r13 != 0) goto L_0x010f
            c50.b r13 = new c50.b
            r13.<init>()
            c50.C54655b.f153178f1 = r13
        L_0x010f:
            c50.b r13 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r13)
            fh1.p$c r0 = new fh1.p$c
            r0.<init>(r12)
            r13.f153185c1 = r0
            goto L_0x014a
        L_0x011c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x0134
            if (r1 == 0) goto L_0x014a
            fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean> r13 = r12.f26839r
            gy3.C87412m.m108594g(r13, r0)
            java.util.List<fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean>> r0 = r1.f173015V0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r13)
            goto L_0x014a
        L_0x0134:
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout
            if (r13 == 0) goto L_0x014a
            vo1.a0$b r13 = vo1.C65770a0.f189184r
            vo1.a0 r13 = r13.mo89819a()
            fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean> r1 = r12.f26839r
            gy3.C87412m.m108594g(r1, r0)
            java.util.List<fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean>> r13 = r13.f189187a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r1)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8070p.onViewMount(android.view.ViewGroup):void");
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        LinearLayout linearLayout = this.f26835n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f26835n = null;
        this.f26836o = null;
        this.f26837p = null;
        this.f26834j = null;
        TextView textView = this.f26838q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f26838q;
        if (textView2 != null) {
            ViewParent parent = textView2.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(textView2);
            }
        }
        this.f26838q = null;
        this.f26840s = "";
        mo9156G3();
        mo9155F3();
        if (C54655b.f153178f1 != null) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null) {
                C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean> bVar = this.f26839r;
                C87412m.m108594g(bVar, "l");
                ((ArrayList) aVar.f173015V0).remove(bVar);
            }
            if (C54655b.f153178f1 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            C54655b bVar2 = C54655b.f153178f1;
            C87412m.m108591d(bVar2);
            bVar2.f153185c1 = null;
            return;
        }
        FinderLiveService.f159376d.getClass();
        C60735a aVar2 = FinderLiveService.f159378f;
        if (aVar2 != null) {
            if (aVar2 != null) {
                C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean> bVar3 = this.f26839r;
                C87412m.m108594g(bVar3, "l");
                ((ArrayList) aVar2.f173015V0).remove(bVar3);
            }
        } else if (viewGroup instanceof FinderLiveReplayPluginLayout) {
            C65770a0 a = C65770a0.f189184r.mo89819a();
            C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean> bVar4 = this.f26839r;
            C87412m.m108594g(bVar4, "l");
            ((ArrayList) a.f189187a).remove(bVar4);
        }
    }
}
