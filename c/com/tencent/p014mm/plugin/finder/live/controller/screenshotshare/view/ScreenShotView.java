package com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C7865r3;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import p200lx.C76736w;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import te3.C51474u01;
import wx3.C15601d;
import x60.C102564a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028BX\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028BX\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ScreenShotView;", "Landroid/widget/RelativeLayout;", "", "d", "I", "getScreenWidth", "()I", "screenWidth", "e", "getScreenHeight", "screenHeight", "", "u", "Z", "isLandscape", "()Z", "setLandscape", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView */
public final class ScreenShotView extends RelativeLayout {

    /* renamed from: d */
    public final int f15021d;

    /* renamed from: e */
    public final int f15022e;

    /* renamed from: f */
    public View f15023f;

    /* renamed from: g */
    public ImageView f15024g;

    /* renamed from: h */
    public ImageView f15025h;

    /* renamed from: i */
    public ImageView f15026i;

    /* renamed from: j */
    public ImageView f15027j;

    /* renamed from: n */
    public ImageView f15028n;

    /* renamed from: o */
    public ImageView f15029o;

    /* renamed from: p */
    public ImageView f15030p;

    /* renamed from: q */
    public TextView f15031q;

    /* renamed from: r */
    public TextView f15032r;

    /* renamed from: s */
    public ImageView f15033s;

    /* renamed from: t */
    public ImageView f15034t;

    /* renamed from: u */
    public boolean f15035u;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView", mo125469f = "ScreenShotView.kt", mo125470l = {414}, mo125471m = "getBitmapFromView")
    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$a */
    public static final class C3136a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f15036d;

        /* renamed from: e */
        public final /* synthetic */ ScreenShotView f15037e;

        /* renamed from: f */
        public int f15038f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3136a(ScreenShotView screenShotView, C15601d<? super C3136a> dVar) {
            super(dVar);
            this.f15037e = screenShotView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15036d = obj;
            this.f15038f |= Integer.MIN_VALUE;
            return this.f15037e.mo3187a(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$getBitmapFromView$b$1", mo125469f = "ScreenShotView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$b */
    public static final class C3137b extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ScreenShotView f15039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3137b(ScreenShotView screenShotView, C15601d<? super C3137b> dVar) {
            super(2, dVar);
            this.f15039d = screenShotView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3137b(this.f15039d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3137b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return BitmapUtil.getBitmapFromView(this.f15039d.f15023f);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView", mo125469f = "ScreenShotView.kt", mo125470l = {205, 207, 361}, mo125471m = "render")
    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$c */
    public static final class C3138c extends C66704d {

        /* renamed from: d */
        public Object f15040d;

        /* renamed from: e */
        public Object f15041e;

        /* renamed from: f */
        public Object f15042f;

        /* renamed from: g */
        public Object f15043g;

        /* renamed from: h */
        public Object f15044h;

        /* renamed from: i */
        public boolean f15045i;

        /* renamed from: j */
        public /* synthetic */ Object f15046j;

        /* renamed from: n */
        public final /* synthetic */ ScreenShotView f15047n;

        /* renamed from: o */
        public int f15048o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3138c(ScreenShotView screenShotView, C15601d<? super C3138c> dVar) {
            super(dVar);
            this.f15047n = screenShotView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15046j = obj;
            this.f15048o |= Integer.MIN_VALUE;
            return this.f15047n.mo3188b((Bitmap) null, (Bitmap) null, (Bitmap) null, (C51474u01) null, false, false, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$d */
    public static final class C3139d<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ScreenShotView f15049a;

        public C3139d(ScreenShotView screenShotView) {
            this.f15049a = screenShotView;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C61926c.m72668M(new C3147a(this.f15049a, ((float) bitmap.getWidth()) / ((float) bitmap.getHeight()), bitmap));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$render$9", mo125469f = "ScreenShotView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$e */
    public static final class C3140e extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ScreenShotView f15050d;

        /* renamed from: e */
        public final /* synthetic */ C51474u01 f15051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3140e(ScreenShotView screenShotView, C51474u01 u012, C15601d<? super C3140e> dVar) {
            super(2, dVar);
            this.f15050d = screenShotView;
            this.f15051e = u012;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3140e(this.f15050d, this.f15051e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3140e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            try {
                return ((C76736w) C86312j.m106911c(C76736w.class)).mo106913qj(this.f15050d.getContext(), this.f15051e.f142523p, 12, 0);
            } catch (Exception e) {
                Log.m105920e("FinderLiveScreenShotView", "create qr error:" + e);
                return null;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$render$afterCropBitmap$1", mo125469f = "ScreenShotView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$f */
    public static final class C3141f extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f15052d;

        /* renamed from: e */
        public final /* synthetic */ int[] f15053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3141f(Bitmap bitmap, int[] iArr, C15601d<? super C3141f> dVar) {
            super(2, dVar);
            this.f15052d = bitmap;
            this.f15053e = iArr;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3141f(this.f15052d, this.f15053e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3141f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = this.f15052d;
            int[] iArr = this.f15053e;
            return Bitmap.createBitmap(bitmap, iArr[0], iArr[2], iArr[1], iArr[3], (Matrix) null, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C7865r3 r3Var = C7865r3.f26468a;
        this.f15021d = r3Var.mo8970c();
        this.f15022e = r3Var.mo8968a();
        View inflate = View.inflate(getContext(), C0966R.C0971layout.d8f, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.o_f);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.round_corner_outside)");
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.o_e);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.rl_get_bitmap_layout)");
        this.f15023f = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.o8z);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.iv_mic_shot)");
        this.f15025h = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f358480o90);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.iv_pk_shot)");
        this.f15026i = (ImageView) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.f358482o92);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.iv_screen_shot)");
        this.f15024g = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.o8y);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.iv_finder_logo)");
        this.f15027j = (ImageView) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.o94);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.iv_sponsor_logo)");
        this.f15028n = (ImageView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.f358483o93);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.iv_signature)");
        this.f15029o = (ImageView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.o95);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.iv_user_head_icon)");
        this.f15030p = (ImageView) findViewById9;
        View findViewById10 = inflate.findViewById(C0966R.C0970id.kxa);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.tv_nick_name)");
        this.f15031q = (TextView) findViewById10;
        View findViewById11 = inflate.findViewById(C0966R.C0970id.f359429kw2);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.tv_desc)");
        this.f15032r = (TextView) findViewById11;
        View findViewById12 = inflate.findViewById(C0966R.C0970id.f358481o91);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.iv_qr_code)");
        this.f15033s = (ImageView) findViewById12;
        View findViewById13 = inflate.findViewById(C0966R.C0970id.m_0);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.iv_auth_icon)");
        this.f15034t = (ImageView) findViewById13;
    }

    private final int getScreenHeight() {
        if (!C85875k4.m106157N()) {
            return this.f15022e;
        }
        Context context = MMApplicationContext.getContext();
        return C74942w4.m89784a(context, context.getResources().getConfiguration().screenHeightDp);
    }

    private final int getScreenWidth() {
        if (!C85875k4.m106157N()) {
            return this.f15021d;
        }
        Context context = MMApplicationContext.getContext();
        return C74942w4.m89784a(context, context.getResources().getConfiguration().screenWidthDp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3187a(wx3.C15601d<? super android.graphics.Bitmap> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.C3136a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$a r0 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.C3136a) r0
            int r1 = r0.f15038f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15038f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$a r0 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f15036d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f15038f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            a14.h0 r6 = a14.C53872d1.f151119c
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$b r2 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$b
            r4 = 0
            r2.<init>(r5, r4)
            r0.f15038f = r3
            java.lang.Object r6 = a14.C53895h.m60469g(r6, r2, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.mo3187a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0284  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3188b(android.graphics.Bitmap r28, android.graphics.Bitmap r29, android.graphics.Bitmap r30, te3.C51474u01 r31, boolean r32, boolean r33, wx3.C15601d<? super rx3.C13598b0> r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r31
            r3 = r34
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<cl1.o> r6 = cl1.C54991o.class
            pl1.e0$a r7 = pl1.C11978e0.C11979a.DEFAULT
            up1.y r8 = up1.C27696y.THUMB_IMAGE
            boolean r9 = r3 instanceof com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.C3138c
            if (r9 == 0) goto L_0x0025
            r9 = r3
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$c r9 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.C3138c) r9
            int r10 = r9.f15048o
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L_0x0025
            int r10 = r10 - r11
            r9.f15048o = r10
            goto L_0x002a
        L_0x0025:
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$c r9 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$c
            r9.<init>(r0, r3)
        L_0x002a:
            java.lang.Object r3 = r9.f15046j
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r11 = r9.f15048o
            r12 = 3
            r13 = 2
            r15 = 1
            if (r11 == 0) goto L_0x0086
            if (r11 == r15) goto L_0x006b
            if (r11 == r13) goto L_0x004c
            if (r11 != r12) goto L_0x0044
            java.lang.Object r1 = r9.f15040d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r1 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView) r1
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x04e9
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            boolean r1 = r9.f15045i
            java.lang.Object r2 = r9.f15044h
            te3.u01 r2 = (te3.C51474u01) r2
            java.lang.Object r11 = r9.f15043g
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r12 = r9.f15042f
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            java.lang.Object r13 = r9.f15041e
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r14 = r9.f15040d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r14 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView) r14
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = r1
            r16 = r6
        L_0x0068:
            r1 = r14
            goto L_0x00f1
        L_0x006b:
            boolean r1 = r9.f15045i
            java.lang.Object r2 = r9.f15044h
            te3.u01 r2 = (te3.C51474u01) r2
            java.lang.Object r11 = r9.f15043g
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r12 = r9.f15042f
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            java.lang.Object r13 = r9.f15041e
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r14 = r9.f15040d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r14 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView) r14
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = 0
            goto L_0x00cd
        L_0x0086:
            kotlin.ResultKt.throwOnFailure(r3)
            int r3 = r28.getWidth()
            if (r3 != 0) goto L_0x009f
            int r3 = r28.getHeight()
            if (r3 != 0) goto L_0x009f
            java.lang.String r1 = "FinderLiveScreenShotView"
            java.lang.String r2 = "#render bitmap.width or bitmap.height is zero"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x009f:
            r9.f15040d = r0
            r9.f15041e = r1
            r3 = r29
            r9.f15042f = r3
            r11 = r30
            r9.f15043g = r11
            r9.f15044h = r2
            r12 = r32
            r9.f15045i = r12
            r9.f15048o = r15
            a14.h0 r13 = a14.C53872d1.f151119c
            lh1.a r14 = new lh1.a
            r15 = r33
            r0 = 0
            r14.<init>(r1, r15, r2, r0)
            java.lang.Object r13 = a14.C53895h.m60469g(r13, r14, r9)
            if (r13 != r10) goto L_0x00c4
            return r10
        L_0x00c4:
            r14 = r27
            r26 = r13
            r13 = r1
            r1 = r12
            r12 = r3
            r3 = r26
        L_0x00cd:
            int[] r3 = (int[]) r3
            a14.h0 r15 = a14.C53872d1.f151119c
            r16 = r6
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$f r6 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$f
            r6.<init>(r13, r3, r0)
            r9.f15040d = r14
            r9.f15041e = r13
            r9.f15042f = r12
            r9.f15043g = r11
            r9.f15044h = r2
            r9.f15045i = r1
            r0 = 2
            r9.f15048o = r0
            java.lang.Object r3 = a14.C53895h.m60469g(r15, r6, r9)
            if (r3 != r10) goto L_0x00ee
            return r10
        L_0x00ee:
            r0 = r1
            goto L_0x0068
        L_0x00f1:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.String r6 = "afterCropBitmap"
            gy3.C87412m.m108593f(r3, r6)
            boolean r6 = r1.f15035u
            java.lang.String r14 = "context"
            if (r6 == 0) goto L_0x0134
            int r6 = r1.getScreenWidth()
            android.content.Context r15 = r1.getContext()
            gy3.C87412m.m108593f(r15, r14)
            r17 = r10
            r10 = 62
            int r10 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r15, r10)
            r15 = 2
            int r10 = r10 * 2
            int r6 = r6 - r10
            android.content.Context r10 = r1.getContext()
            gy3.C87412m.m108593f(r10, r14)
            r15 = 80
            int r10 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r10, r15)
            int r6 = r6 - r10
            int r10 = r3.getWidth()
            float r10 = (float) r10
            int r15 = r3.getHeight()
            float r15 = (float) r15
            float r10 = r10 / r15
            float r6 = (float) r6
            float r10 = r10 * r6
            int r6 = (int) r10
            r15 = 2
            goto L_0x0156
        L_0x0134:
            r17 = r10
            int r6 = r3.getWidth()
            int r10 = r3.getHeight()
            if (r6 >= r10) goto L_0x0143
            r6 = 56
            goto L_0x0145
        L_0x0143:
            r6 = 32
        L_0x0145:
            int r10 = r1.getScreenWidth()
            android.content.Context r15 = r1.getContext()
            int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r15, r6)
            r15 = 2
            int r6 = r6 * 2
            int r6 = r10 - r6
        L_0x0156:
            int[] r10 = new int[r15]
            r15 = 0
            r10[r15] = r6
            int r15 = r3.getHeight()
            float r15 = (float) r15
            r18 = r9
            int r9 = r3.getWidth()
            float r9 = (float) r9
            float r15 = r15 / r9
            float r6 = (float) r6
            float r15 = r15 * r6
            int r6 = (int) r15
            r9 = 1
            r10[r9] = r6
            android.widget.ImageView r6 = r1.f15024g
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r31 = r0
            if (r6 == 0) goto L_0x018f
            r15 = 0
            r0 = r10[r15]
            r6.width = r0
            r0 = r10[r9]
            r6.height = r0
            android.widget.ImageView r0 = r1.f15024g
            r0.setLayoutParams(r6)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r6 = r10[r15]
            r0.width = r6
        L_0x018f:
            android.widget.ImageView r0 = r1.f15024g
            r0.setImageBitmap(r3)
            r0 = 8
            if (r12 == 0) goto L_0x01d1
            int r3 = r12.getWidth()
            if (r3 == 0) goto L_0x01d1
            int r3 = r12.getHeight()
            if (r3 == 0) goto L_0x01d1
            android.widget.ImageView r3 = r1.f15026i
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01d6
            android.widget.ImageView r6 = r1.f15026i
            r9 = 0
            r6.setVisibility(r9)
            int r6 = r12.getWidth()
            float r6 = (float) r6
            int r15 = r12.getHeight()
            float r15 = (float) r15
            float r6 = r6 / r15
            r15 = r10[r9]
            float r9 = (float) r15
            float r9 = r9 / r6
            int r6 = (int) r9
            r3.width = r15
            r3.height = r6
            android.widget.ImageView r6 = r1.f15026i
            r6.setImageBitmap(r12)
            android.widget.ImageView r6 = r1.f15026i
            r6.setLayoutParams(r3)
            goto L_0x01d6
        L_0x01d1:
            android.widget.ImageView r3 = r1.f15026i
            r3.setVisibility(r0)
        L_0x01d6:
            if (r11 == 0) goto L_0x0211
            int r3 = r11.getWidth()
            if (r3 == 0) goto L_0x0211
            int r3 = r11.getHeight()
            if (r3 == 0) goto L_0x0211
            android.widget.ImageView r3 = r1.f15025h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x0216
            android.widget.ImageView r6 = r1.f15025h
            r9 = 0
            r6.setVisibility(r9)
            int r6 = r11.getWidth()
            float r6 = (float) r6
            int r12 = r11.getHeight()
            float r12 = (float) r12
            float r6 = r6 / r12
            r10 = r10[r9]
            float r9 = (float) r10
            float r9 = r9 / r6
            int r6 = (int) r9
            r3.width = r10
            r3.height = r6
            android.widget.ImageView r6 = r1.f15025h
            r6.setImageBitmap(r11)
            android.widget.ImageView r6 = r1.f15025h
            r6.setLayoutParams(r3)
            goto L_0x0216
        L_0x0211:
            android.widget.ImageView r3 = r1.f15025h
            r3.setVisibility(r0)
        L_0x0216:
            te3.zt3 r3 = r2.f142514d
            if (r3 == 0) goto L_0x022c
            java.lang.String r3 = r3.f146221d
            if (r3 == 0) goto L_0x022c
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0226
            r3 = 1
            goto L_0x0227
        L_0x0226:
            r3 = 0
        L_0x0227:
            r6 = 1
            if (r3 != r6) goto L_0x022c
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            if (r3 == 0) goto L_0x025e
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            te3.zt3 r9 = r2.f142514d
            if (r9 == 0) goto L_0x0248
            java.lang.String r9 = r9.f146221d
            goto L_0x0249
        L_0x0248:
            r9 = 0
        L_0x0249:
            r6.<init>(r9, r8)
            l60.b r3 = r3.mo85955a(r6)
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$d r6 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$d
            r6.<init>(r1)
            r3.getClass()
            r3.f291320d = r6
            r3.mo85951a()
            goto L_0x0263
        L_0x025e:
            android.widget.ImageView r3 = r1.f15027j
            r3.setVisibility(r0)
        L_0x0263:
            java.util.LinkedList<te3.zt3> r3 = r2.f142515e
            if (r3 == 0) goto L_0x0281
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.zt3 r3 = (te3.C52306zt3) r3
            if (r3 == 0) goto L_0x0281
            java.lang.String r3 = r3.f146221d
            if (r3 == 0) goto L_0x0281
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x027b
            r3 = 1
            goto L_0x027c
        L_0x027b:
            r3 = 0
        L_0x027c:
            r6 = 1
            if (r3 != r6) goto L_0x0281
            r3 = 1
            goto L_0x0282
        L_0x0281:
            r3 = 0
        L_0x0282:
            if (r3 == 0) goto L_0x02ee
            android.widget.ImageView r3 = r1.f15028n
            r6 = 0
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r1.f15028n
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x02b5
            android.content.Context r6 = r1.getContext()
            gy3.C87412m.m108593f(r6, r14)
            int r9 = r13.getWidth()
            int r10 = r13.getHeight()
            if (r9 <= r10) goto L_0x02a6
            r15 = 48
            goto L_0x02a8
        L_0x02a6:
            r15 = 56
        L_0x02a8:
            int r6 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r6, r15)
            r3.width = r6
            r3.height = r6
            android.widget.ImageView r6 = r1.f15028n
            r6.setLayoutParams(r3)
        L_0x02b5:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r6 = r3.mo62446e(r4)
            bl3.c r6 = r6.mo62447c(r5)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            java.util.LinkedList<te3.zt3> r10 = r2.f142515e
            if (r10 == 0) goto L_0x02d6
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            te3.zt3 r10 = (te3.C52306zt3) r10
            if (r10 == 0) goto L_0x02d6
            java.lang.String r10 = r10.f146221d
            goto L_0x02d7
        L_0x02d6:
            r10 = 0
        L_0x02d7:
            r9.<init>(r10, r8)
            android.widget.ImageView r10 = r1.f15028n
            bl3.r$a r3 = r3.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r6.mo85957c(r9, r10, r3)
            goto L_0x02f3
        L_0x02ee:
            android.widget.ImageView r3 = r1.f15028n
            r3.setVisibility(r0)
        L_0x02f3:
            te3.zt3 r3 = r2.f142516f
            if (r3 == 0) goto L_0x0309
            java.lang.String r3 = r3.f146221d
            if (r3 == 0) goto L_0x0309
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0303
            r3 = 1
            goto L_0x0304
        L_0x0303:
            r3 = 0
        L_0x0304:
            r6 = 1
            if (r3 != r6) goto L_0x0309
            r3 = 1
            goto L_0x030a
        L_0x0309:
            r3 = 0
        L_0x030a:
            if (r3 == 0) goto L_0x0393
            android.widget.ImageView r0 = r1.f15029o
            r3 = 0
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f15029o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0362
            android.content.Context r3 = r1.getContext()
            gy3.C87412m.m108593f(r3, r14)
            int r6 = r13.getWidth()
            int r9 = r13.getHeight()
            if (r6 <= r9) goto L_0x032e
            r6 = 96
            goto L_0x0330
        L_0x032e:
            r6 = 144(0x90, float:2.02E-43)
        L_0x0330:
            int r3 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r3, r6)
            r0.width = r3
            r0.height = r3
            boolean r3 = r0 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x035d
            r3 = r0
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            android.content.Context r6 = r1.getContext()
            gy3.C87412m.m108593f(r6, r14)
            int r9 = r2.f142524q
            int r6 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r6, r9)
            android.content.Context r9 = r1.getContext()
            gy3.C87412m.m108593f(r9, r14)
            int r10 = r2.f142525r
            int r9 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r9, r10)
            r10 = 0
            r3.setMargins(r10, r10, r6, r9)
        L_0x035d:
            android.widget.ImageView r3 = r1.f15029o
            r3.setLayoutParams(r0)
        L_0x0362:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r3 = r0.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            te3.zt3 r9 = r2.f142516f
            if (r9 == 0) goto L_0x037b
            java.lang.String r9 = r9.f146221d
            goto L_0x037c
        L_0x037b:
            r9 = 0
        L_0x037c:
            r6.<init>(r9, r8)
            android.widget.ImageView r9 = r1.f15029o
            bl3.r$a r0 = r0.mo62446e(r4)
            bl3.c r0 = r0.mo62447c(r5)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r7)
            r3.mo85957c(r6, r9, r0)
            goto L_0x0398
        L_0x0393:
            android.widget.ImageView r3 = r1.f15029o
            r3.setVisibility(r0)
        L_0x0398:
            java.lang.Class<ln.g> r0 = p196ln.C76706g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.g r0 = (p196ln.C76706g) r0
            ln.n r0 = r0.mo106832eg()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            com.tencent.mm.modelavatar.o r0 = (com.tencent.p014mm.modelavatar.C68098o) r0
            com.tencent.mm.modelavatar.n r0 = r0.mo93607Lo(r3)
            if (r0 == 0) goto L_0x03b5
            java.lang.String r0 = r0.mo93597f()
            goto L_0x03b6
        L_0x03b5:
            r0 = 0
        L_0x03b6:
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x03bb
            r0 = r3
        L_0x03bb:
            pl1.e0 r6 = pl1.C11978e0.f34938a
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r4 = r9.mo62446e(r4)
            bl3.c r4 = r4.mo62447c(r5)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11865K1()
            pl1.f r5 = new pl1.f
            r9 = 2
            r10 = 0
            r5.<init>(r0, r10, r9, r10)
            android.widget.ImageView r0 = r1.f15030p
            pl1.e0$a r9 = pl1.C11978e0.C11979a.WX_AVATAR
            n60.f r9 = r6.mo11851c(r9)
            r4.mo85957c(r5, r0, r9)
            android.widget.TextView r0 = r1.f15031q
            java.lang.String r4 = r2.f142517g
            if (r4 == 0) goto L_0x03ee
            int r4 = r4.length()
            if (r4 != 0) goto L_0x03ec
            goto L_0x03ee
        L_0x03ec:
            r4 = 0
            goto L_0x03ef
        L_0x03ee:
            r4 = 1
        L_0x03ef:
            if (r4 == 0) goto L_0x0410
            android.content.res.Resources r4 = r1.getResources()
            if (r31 == 0) goto L_0x03fb
            r5 = 2131828769(0x7f112021, float:1.9290488E38)
            goto L_0x03fe
        L_0x03fb:
            r5 = 2131828770(0x7f112022, float:1.929049E38)
        L_0x03fe:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = eb0.C75592q0.m90783m()
            if (r9 != 0) goto L_0x0408
            r9 = r3
        L_0x0408:
            r11 = 0
            r10[r11] = r9
            java.lang.String r4 = r4.getString(r5, r10)
            goto L_0x042e
        L_0x0410:
            r11 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = eb0.C75592q0.m90783m()
            if (r5 != 0) goto L_0x041d
            r5 = r3
        L_0x041d:
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            java.lang.String r5 = r2.f142517g
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x042e:
            r0.setText(r4)
            fe1.d$b r0 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5 = r16
            androidx.lifecycle.i0 r9 = r4.mo77630e(r5)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x0442
            java.lang.String r9 = r9.f154345o
            goto L_0x0443
        L_0x0442:
            r9 = 0
        L_0x0443:
            fe1.q r9 = r0.mo84155b(r9)
            if (r9 == 0) goto L_0x046b
            java.lang.Class<tf0.p1> r10 = tf0.C64916p1.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            java.lang.String r12 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r10, r12)
            r19 = r10
            tf0.p1 r19 = (tf0.C64916p1) r19
            android.widget.ImageView r10 = r1.f15034t
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r9.field_authInfo
            r22 = 0
            r23 = 0
            r24 = 8
            r25 = 0
            r20 = r10
            r21 = r9
            tf0.C64916p1.C64917a.m76444k(r19, r20, r21, r22, r23, r24, r25)
        L_0x046b:
            java.lang.String r9 = r2.f142518h
            if (r9 == 0) goto L_0x047d
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0477
            r9 = 1
            goto L_0x0478
        L_0x0477:
            r9 = 0
        L_0x0478:
            r10 = 1
            if (r9 != r10) goto L_0x047e
            r9 = 1
            goto L_0x047f
        L_0x047d:
            r10 = 1
        L_0x047e:
            r9 = 0
        L_0x047f:
            if (r9 == 0) goto L_0x0489
            android.widget.TextView r0 = r1.f15032r
            java.lang.String r3 = r2.f142518h
            r0.setText(r3)
            goto L_0x04a4
        L_0x0489:
            android.widget.TextView r9 = r1.f15032r
            androidx.lifecycle.i0 r4 = r4.mo77630e(r5)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x0496
            java.lang.String r4 = r4.f154345o
            goto L_0x0497
        L_0x0496:
            r4 = 0
        L_0x0497:
            fe1.q r0 = r0.mo84155b(r4)
            if (r0 == 0) goto L_0x04a1
            java.lang.String r3 = r0.getNickname()
        L_0x04a1:
            r9.setText(r3)
        L_0x04a4:
            java.lang.String r0 = r2.f142519i
            if (r0 == 0) goto L_0x04b1
            int r0 = r0.length()
            if (r0 != 0) goto L_0x04af
            goto L_0x04b1
        L_0x04af:
            r15 = 0
            goto L_0x04b2
        L_0x04b1:
            r15 = 1
        L_0x04b2:
            if (r15 != 0) goto L_0x04c9
            k60.d r0 = r6.mo11850b()
            pl1.n0 r3 = new pl1.n0
            java.lang.String r2 = r2.f142519i
            r3.<init>(r2, r8)
            android.widget.ImageView r1 = r1.f15033s
            n60.f r2 = r6.mo11851c(r7)
            r0.mo85957c(r3, r1, r2)
            goto L_0x04f2
        L_0x04c9:
            a14.h0 r0 = a14.C53872d1.f151119c
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$e r3 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView$e
            r4 = 0
            r3.<init>(r1, r2, r4)
            r9 = r18
            r9.f15040d = r1
            r9.f15041e = r4
            r9.f15042f = r4
            r9.f15043g = r4
            r9.f15044h = r4
            r2 = 3
            r9.f15048o = r2
            java.lang.Object r3 = a14.C53895h.m60469g(r0, r3, r9)
            r0 = r17
            if (r3 != r0) goto L_0x04e9
            return r0
        L_0x04e9:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L_0x04f2
            android.widget.ImageView r0 = r1.f15033s
            r0.setImageBitmap(r3)
        L_0x04f2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView.mo3188b(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, te3.u01, boolean, boolean, wx3.d):java.lang.Object");
    }

    public final void setLandscape(boolean z) {
        this.f15035u = z;
    }
}
