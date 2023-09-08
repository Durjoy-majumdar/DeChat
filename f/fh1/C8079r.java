package fh1;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.finder.view.StrokeTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh1.C8070p;
import fy3.C32227p;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import nk1.C11207i;
import org.libpag.PAGView;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$executeAnimationCommand$2", mo125469f = "GestureEffectPagController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: fh1.r */
public final class C8079r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C8070p f26871d;

    /* renamed from: e */
    public final /* synthetic */ String f26872e;

    /* renamed from: f */
    public final /* synthetic */ String f26873f;

    /* renamed from: g */
    public final /* synthetic */ float f26874g;

    /* renamed from: h */
    public final /* synthetic */ float f26875h;

    /* renamed from: i */
    public final /* synthetic */ float f26876i;

    /* renamed from: j */
    public final /* synthetic */ float f26877j;

    /* renamed from: n */
    public final /* synthetic */ float f26878n;

    /* renamed from: o */
    public final /* synthetic */ String f26879o;

    /* renamed from: p */
    public final /* synthetic */ String f26880p;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$executeAnimationCommand$2$1", mo125469f = "GestureEffectPagController.kt", mo125470l = {202, 224, 234, 247}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.r$a */
    public static final class C8080a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f26881d;

        /* renamed from: e */
        public int f26882e;

        /* renamed from: f */
        public final /* synthetic */ String f26883f;

        /* renamed from: g */
        public final /* synthetic */ C8070p f26884g;

        /* renamed from: h */
        public final /* synthetic */ float f26885h;

        /* renamed from: i */
        public final /* synthetic */ float f26886i;

        /* renamed from: j */
        public final /* synthetic */ float f26887j;

        /* renamed from: n */
        public final /* synthetic */ float f26888n;

        /* renamed from: o */
        public final /* synthetic */ float f26889o;

        /* renamed from: p */
        public final /* synthetic */ String f26890p;

        /* renamed from: q */
        public final /* synthetic */ C8070p.C8071a f26891q;

        /* renamed from: r */
        public final /* synthetic */ String f26892r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8080a(String str, C8070p pVar, float f, float f2, float f3, float f4, float f5, String str2, C8070p.C8071a aVar, String str3, C15601d<? super C8080a> dVar) {
            super(2, dVar);
            this.f26883f = str;
            this.f26884g = pVar;
            this.f26885h = f;
            this.f26886i = f2;
            this.f26887j = f3;
            this.f26888n = f4;
            this.f26889o = f5;
            this.f26890p = str2;
            this.f26891q = aVar;
            this.f26892r = str3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8080a(this.f26883f, this.f26884g, this.f26885h, this.f26886i, this.f26887j, this.f26888n, this.f26889o, this.f26890p, this.f26891q, this.f26892r, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8080a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
            r11 = r7.f131406n;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r13.f26882e
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 0
                r6 = 1
                if (r0 == 0) goto L_0x0031
                if (r0 == r6) goto L_0x0028
                if (r0 == r3) goto L_0x0022
                if (r0 == r2) goto L_0x001d
                if (r0 != r1) goto L_0x0015
                goto L_0x001d
            L_0x0015:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x01b9
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r14)
                r0 = r14
                goto L_0x0129
            L_0x0028:
                java.lang.Object r0 = r13.f26881d
                te3.bz0 r0 = (te3.C48928bz0) r0
                kotlin.ResultKt.throwOnFailure(r14)
                r7 = r14
                goto L_0x004f
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r14)
                xh1.d r0 = xh1.C15685d.f42379a
                java.lang.String r7 = r13.f26883f
                int r7 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r7)
                te3.bz0 r0 = r0.mo14430a(r7)
                if (r0 == 0) goto L_0x0054
                xh1.a r7 = xh1.C23087a.f66318a
                r13.f26881d = r0
                r13.f26882e = r6
                java.lang.Object r7 = r7.mo36498e(r0, r13)
                if (r7 != r10) goto L_0x004f
                return r10
            L_0x004f:
                xh1.a$c r7 = (xh1.C23087a.C15678c) r7
                r8 = r7
                r7 = r0
                goto L_0x0056
            L_0x0054:
                r7 = r0
                r8 = r4
            L_0x0056:
                fh1.p r0 = r13.f26884g
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "手势特效\nrender="
                r9.append(r11)
                if (r7 == 0) goto L_0x006f
                te3.cz0 r11 = r7.f131406n
                if (r11 == 0) goto L_0x006f
                int r11 = r11.f132038g
                if (r11 != r6) goto L_0x006f
                r11 = 1
                goto L_0x0070
            L_0x006f:
                r11 = 0
            L_0x0070:
                if (r11 == 0) goto L_0x0075
                java.lang.String r11 = "WeVision"
                goto L_0x0077
            L_0x0075:
                java.lang.String r11 = "Pag"
            L_0x0077:
                r9.append(r11)
                java.lang.String r11 = "\naspect="
                r9.append(r11)
                float r11 = r13.f26885h
                r9.append(r11)
                java.lang.String r11 = "\ngestureId="
                r9.append(r11)
                java.lang.String r11 = r13.f26883f
                r9.append(r11)
                java.lang.String r11 = "\ntransX="
                r9.append(r11)
                float r11 = r13.f26886i
                r9.append(r11)
                java.lang.String r11 = "\ntransY="
                r9.append(r11)
                float r11 = r13.f26887j
                r9.append(r11)
                java.lang.String r11 = "\nrotation="
                r9.append(r11)
                float r11 = r13.f26888n
                r9.append(r11)
                java.lang.String r11 = "\nscale="
                r9.append(r11)
                float r11 = r13.f26889o
                r9.append(r11)
                java.lang.String r11 = "\ncomboId有吗="
                r9.append(r11)
                java.lang.String r11 = r13.f26890p
                int r11 = r11.length()
                if (r11 <= 0) goto L_0x00c5
                r11 = 1
                goto L_0x00c6
            L_0x00c5:
                r11 = 0
            L_0x00c6:
                r9.append(r11)
                java.lang.String r11 = "\ngesRes.name="
                r9.append(r11)
                if (r7 == 0) goto L_0x00d3
                java.lang.String r11 = r7.f131400e
                goto L_0x00d4
            L_0x00d3:
                r11 = r4
            L_0x00d4:
                r9.append(r11)
                java.lang.String r11 = "\n文件存在吗="
                r9.append(r11)
                if (r8 == 0) goto L_0x00e0
                r11 = 1
                goto L_0x00e1
            L_0x00e0:
                r11 = 0
            L_0x00e1:
                r9.append(r11)
                java.lang.String r11 = "\nrect="
                r9.append(r11)
                fh1.p$a r11 = r13.f26891q
                android.graphics.Rect r11 = r11.f26849e
                r9.append(r11)
                java.lang.String r11 = "\ngiftSoundId="
                r9.append(r11)
                java.lang.String r11 = r13.f26892r
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                r0.mo9159K3(r9)
                java.lang.String r0 = r13.f26892r
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x010b
                r0 = 1
                goto L_0x010c
            L_0x010b:
                r0 = 0
            L_0x010c:
                if (r0 == 0) goto L_0x014e
                xh1.d r0 = xh1.C15685d.f42379a
                java.lang.String r1 = r13.f26892r
                int r1 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r1)
                te3.bz0 r0 = r0.mo14430a(r1)
                if (r0 == 0) goto L_0x01b9
                xh1.a r1 = xh1.C23087a.f66318a
                r13.f26881d = r4
                r13.f26882e = r3
                java.lang.Object r0 = r1.mo36498e(r0, r13)
                if (r0 != r10) goto L_0x0129
                return r10
            L_0x0129:
                xh1.a$c r0 = (xh1.C23087a.C15678c) r0
                if (r0 == 0) goto L_0x01b9
                java.lang.String r0 = r0.f42368c
                if (r0 == 0) goto L_0x01b9
                int r1 = r0.length()
                if (r1 <= 0) goto L_0x0138
                r5 = 1
            L_0x0138:
                if (r5 == 0) goto L_0x013b
                goto L_0x013c
            L_0x013b:
                r0 = r4
            L_0x013c:
                if (r0 == 0) goto L_0x01b9
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r1 == 0) goto L_0x01b9
                r2 = 9636(0x25a4, float:1.3503E-41)
                r1.mo85690h0(r2, r0, r4)
                goto L_0x01b9
            L_0x014e:
                if (r7 == 0) goto L_0x015a
                te3.cz0 r0 = r7.f131406n
                if (r0 == 0) goto L_0x015a
                int r0 = r0.f132038g
                if (r0 != 0) goto L_0x015a
                r0 = 1
                goto L_0x015b
            L_0x015a:
                r0 = 0
            L_0x015b:
                if (r0 == 0) goto L_0x0185
                fh1.p$a r3 = r13.f26891q
                fh1.p r0 = r13.f26884g
                float r5 = r13.f26886i
                float r6 = r13.f26887j
                float r9 = r13.f26888n
                float r11 = r13.f26889o
                java.lang.String r12 = r13.f26890p
                if (r7 == 0) goto L_0x01b9
                if (r3 == 0) goto L_0x01b9
                if (r8 == 0) goto L_0x01b9
                r13.f26881d = r4
                r13.f26882e = r2
                r1 = r7
                r2 = r3
                r3 = r8
                r4 = r5
                r5 = r6
                r6 = r9
                r7 = r11
                r8 = r12
                r9 = r13
                java.lang.Object r0 = fh1.C8070p.m8181n3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r10) goto L_0x01b9
                return r10
            L_0x0185:
                if (r7 == 0) goto L_0x0190
                te3.cz0 r0 = r7.f131406n
                if (r0 == 0) goto L_0x0190
                int r0 = r0.f132038g
                if (r0 != r6) goto L_0x0190
                r5 = 1
            L_0x0190:
                if (r5 == 0) goto L_0x01b9
                fh1.p$a r2 = r13.f26891q
                fh1.p r0 = r13.f26884g
                float r5 = r13.f26886i
                float r6 = r13.f26887j
                float r9 = r13.f26888n
                float r11 = r13.f26889o
                java.lang.String r12 = r13.f26890p
                if (r7 == 0) goto L_0x01b9
                if (r2 == 0) goto L_0x01b9
                if (r8 == 0) goto L_0x01b9
                r13.f26881d = r4
                r13.f26882e = r1
                r1 = r7
                r3 = r8
                r4 = r5
                r5 = r6
                r6 = r9
                r7 = r11
                r8 = r12
                r9 = r13
                java.lang.Object r0 = fh1.C8070p.m8182o3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r10) goto L_0x01b9
                return r10
            L_0x01b9:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8079r.C8080a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8079r(C8070p pVar, String str, String str2, float f, float f2, float f3, float f4, float f5, String str3, String str4, C15601d<? super C8079r> dVar) {
        super(2, dVar);
        this.f26871d = pVar;
        this.f26872e = str;
        this.f26873f = str2;
        this.f26874g = f;
        this.f26875h = f2;
        this.f26876i = f3;
        this.f26877j = f4;
        this.f26878n = f5;
        this.f26879o = str3;
        this.f26880p = str4;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8079r(this.f26871d, this.f26872e, this.f26873f, this.f26874g, this.f26875h, this.f26876i, this.f26877j, this.f26878n, this.f26879o, this.f26880p, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8079r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C8070p pVar = this.f26871d;
        String str = this.f26872e;
        ViewGroup viewGroup = pVar.f26834j;
        C8070p.C8071a aVar = null;
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        boolean z = false;
        if (context != null) {
            String I3 = pVar.mo9157I3(str);
            if (I3.length() == 0) {
                Log.m105924i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId sdkId not found in business:" + str);
            } else {
                aVar = (C8070p.C8071a) ((LinkedHashMap) pVar.f26843v).get(str);
                if (aVar == null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    ViewGroup viewGroup2 = pVar.f26834j;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(frameLayout);
                    }
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        frameLayout.requestLayout();
                    }
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout.addView(frameLayout2);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof FrameLayout.LayoutParams)) {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                        frameLayout2.requestLayout();
                    }
                    PAGView pAGView = new PAGView(context);
                    frameLayout2.addView(pAGView, new FrameLayout.LayoutParams(-1, -1));
                    StrokeTextView strokeTextView = new StrokeTextView(context);
                    strokeTextView.setMaxWidth(C74942w4.m89784a(context, 280));
                    strokeTextView.setMaxLines(1);
                    strokeTextView.setTextColor(context.getResources().getColor(C0966R.color.f3449t4));
                    strokeTextView.setVisibility(8);
                    strokeTextView.setStrokeColor(Color.parseColor("#FF99B4"));
                    strokeTextView.setStrokeWidth(4.0f);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    C13598b0 b0Var = C13598b0.f38549a;
                    frameLayout2.addView(strokeTextView, layoutParams3);
                    C8070p.C8071a aVar2 = new C8070p.C8071a(frameLayout, frameLayout2, pAGView, strokeTextView, (Rect) null, (C53973z1) null);
                    pVar.f26843v.put(str, aVar2);
                    Log.m105924i("Finder.GestureEffectPagController", "#getStreamWidgetForSdkId now widgetBucket.count=" + pVar.f26843v.size());
                    aVar = aVar2;
                }
                aVar.f26849e = (Rect) ((LinkedHashMap) pVar.f26844w).get(I3);
            }
        }
        if (aVar == null) {
            Log.m105924i("Finder.GestureEffectPagController", "#executeAnimationCommand streamWidget is null");
            return C13598b0.f38549a;
        }
        C53973z1 z1Var = aVar.f26850f;
        if (z1Var != null && z1Var.mo74466a()) {
            z = true;
        }
        if (z || aVar.f26847c.isPlaying()) {
            return C13598b0.f38549a;
        }
        C8070p pVar2 = this.f26871d;
        aVar.f26850f = C11207i.m11066b(pVar2, (C66212f) null, (C53934p0) null, new C8080a(this.f26873f, pVar2, this.f26874g, this.f26875h, this.f26876i, this.f26877j, this.f26878n, this.f26879o, aVar, this.f26880p, (C15601d<? super C8080a>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
