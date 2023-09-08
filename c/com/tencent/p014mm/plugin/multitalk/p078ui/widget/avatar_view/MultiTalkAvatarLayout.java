package com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import lu3.C34379c;
import o40.C61926c;
import p1092ba.C104072a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import w82.C111759e;
import w82.C111769j;
import w82.C111770k;
import w82.C111773l;
import w82.C15051d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001b¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarLayout;", "Landroid/widget/FrameLayout;", "", "visibility", "Lrx3/b0;", "setVisibility", "Lw82/k;", "value", "f", "Lw82/k;", "getLayoutAdapter", "()Lw82/k;", "setLayoutAdapter", "(Lw82/k;)V", "layoutAdapter", "Lkotlin/Function2;", "", "g", "Lfy3/p;", "getOnMaxYChanged", "()Lfy3/p;", "setOnMaxYChanged", "(Lfy3/p;)V", "onMaxYChanged", "n", "I", "getBottomPanelHeight", "()I", "setBottomPanelHeight", "(I)V", "bottomPanelHeight", "o", "Lrx3/g;", "getScreenHeight", "screenHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout */
public final class MultiTalkAvatarLayout extends FrameLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f315083q = 0;

    /* renamed from: d */
    public final ArrayMap<String, C111759e> f315084d = new ArrayMap<>();

    /* renamed from: e */
    public HashSet<String> f315085e = new HashSet<>();

    /* renamed from: f */
    public C111770k f315086f;

    /* renamed from: g */
    public C32227p<? super Integer, ? super Boolean, C13598b0> f315087g = C30300c.f81813d;

    /* renamed from: h */
    public int f315088h = -1;

    /* renamed from: i */
    public int f315089i = -1;

    /* renamed from: j */
    public String f315090j;

    /* renamed from: n */
    public int f315091n;

    /* renamed from: o */
    public final C13601g f315092o;

    /* renamed from: p */
    public int f315093p;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout$c */
    public static final class C30300c extends C87413o implements C32227p<Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C30300c f81813d = new C30300c();

        public C30300c() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            ((Boolean) obj2).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout$a */
    public static final class C105909a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkAvatarLayout f315094d;

        public C105909a(MultiTalkAvatarLayout multiTalkAvatarLayout) {
            this.f315094d = multiTalkAvatarLayout;
        }

        public final void run() {
            MultiTalkAvatarLayout multiTalkAvatarLayout = this.f315094d;
            int i = MultiTalkAvatarLayout.f315083q;
            multiTalkAvatarLayout.mo150987c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout$b */
    public static final class C105910b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkAvatarLayout f315095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105910b(MultiTalkAvatarLayout multiTalkAvatarLayout) {
            super(0);
            this.f315095d = multiTalkAvatarLayout;
        }

        public Object invoke() {
            if (this.f315095d.getVisibility() == 0) {
                this.f315095d.mo150988d(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout$d */
    public static final class C105911d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ Context f315096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105911d(Context context) {
            super(0);
            this.f315096d = context;
        }

        public Object invoke() {
            return Integer.valueOf(C74783i3.m89537a(this.f315096d).f24705b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTalkAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f315092o = C36568h.m40985a(new C105911d(context));
    }

    private final int getScreenHeight() {
        return ((Number) ((C36570n) this.f315092o).getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo150985a() {
        if (getVisibility() != 8) {
            if (getMeasuredWidth() > 0) {
                mo150987c();
                return;
            }
            requestLayout();
            post(new C105909a(this));
        }
    }

    /* renamed from: b */
    public final void mo150986b(C111759e eVar) {
        int i;
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "innerSelectUser: " + eVar.f334679e);
        int i2 = eVar.f334682h;
        if (this.f315088h != i2) {
            this.f315090j = eVar.f334679e.f314927b;
            i = i2;
        } else {
            this.f315090j = null;
            i = -1;
        }
        this.f315088h = i;
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "addView on avatar click: click " + eVar.f334679e.f314927b + ", idx: " + i2);
        C111770k kVar = this.f315086f;
        if (kVar != null) {
            kVar.mo163504a(this.f315085e, this.f315090j);
        }
        mo150985a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150987c() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f315088h
            android.util.ArrayMap<java.lang.String, w82.e> r2 = r0.f315084d
            java.util.List r2 = r0.mo150990f(r2)
            ba.a r3 = p1092ba.C104072a.f307806a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = r1.intValue()
            r5 = r2
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r6 = 1
            if (r4 >= r5) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r4 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            int r1 = r1.intValue()
            goto L_0x002d
        L_0x002c:
            r1 = -1
        L_0x002d:
            int r4 = r18.getMeasuredWidth()
            int r8 = r0.f315091n
            if (r8 != 0) goto L_0x0037
            r8 = 0
            goto L_0x0045
        L_0x0037:
            int r8 = r18.getScreenHeight()
            int[] r9 = o40.C61926c.m72690o(r18)
            r9 = r9[r6]
            int r8 = r8 - r9
            int r9 = r0.f315091n
            int r8 = r8 - r9
        L_0x0045:
            java.util.List r1 = r3.mo145669b(r2, r1, r4, r8)
            r0.mo150989e(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L_0x0052:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0278
            java.lang.Object r4 = r1.next()
            ba.a$a r4 = (p1092ba.C104072a.C104073a) r4
            android.util.ArrayMap<java.lang.String, w82.e> r8 = r0.f315084d
            java.lang.String r9 = r4.f307808b
            java.lang.Object r8 = r8.get(r9)
            w82.e r8 = (w82.C111759e) r8
            if (r8 == 0) goto L_0x026e
            int r9 = r0.f315088h
            int r10 = r8.f334682h
            if (r9 != r10) goto L_0x0072
            r9 = 1
            goto L_0x0073
        L_0x0072:
            r9 = 0
        L_0x0073:
            r8.f334683i = r9
            android.graphics.Rect r15 = r4.f307809c
            java.lang.String r9 = "newPos"
            gy3.C87412m.m108594g(r15, r9)
            w82.l r14 = r8.f334676b
            android.view.ViewPropertyAnimator r13 = r14.animate()
            int r9 = r14.getWidth()
            r10 = 2131165339(0x7f07009b, float:1.7944892E38)
            r12 = 2131165371(0x7f0700bb, float:1.7944957E38)
            if (r9 == 0) goto L_0x0174
            int r9 = r14.getHeight()
            if (r9 != 0) goto L_0x0096
            goto L_0x0174
        L_0x0096:
            int r9 = r15.width()
            float r9 = (float) r9
            int r11 = r14.getMeasuredWidth()
            float r11 = (float) r11
            float r9 = r9 / r11
            int r11 = r15.height()
            float r11 = (float) r11
            int r6 = r14.getMeasuredHeight()
            float r6 = (float) r6
            float r11 = r11 / r6
            float r6 = r14.getX()
            int r5 = r15.left
            float r5 = (float) r5
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x00b9
            r6 = 1
            goto L_0x00ba
        L_0x00b9:
            r6 = 0
        L_0x00ba:
            if (r6 != 0) goto L_0x00bf
            r13.x(r5)
        L_0x00bf:
            float r5 = r14.getY()
            int r6 = r15.top
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r5 != 0) goto L_0x00d2
            r13.y(r6)
        L_0x00d2:
            float r5 = r14.getScaleX()
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00dc
            r5 = 1
            goto L_0x00dd
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            if (r5 != 0) goto L_0x00ea
            int r5 = r14.getLeft()
            float r5 = (float) r5
            r14.setPivotX(r5)
            r13.scaleX(r9)
        L_0x00ea:
            float r5 = r14.getScaleY()
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00f4
            r5 = 1
            goto L_0x00f5
        L_0x00f4:
            r5 = 0
        L_0x00f5:
            if (r5 != 0) goto L_0x0102
            int r5 = r14.getTop()
            float r5 = (float) r5
            r14.setPivotY(r5)
            r13.scaleY(r11)
        L_0x0102:
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r5 = r8.f334677c
            float r5 = r5.getX()
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r6 = r8.f334677c
            float r6 = r6.getY()
            int r9 = r15.left
            android.content.res.Resources r11 = r14.getResources()
            int r11 = r11.getDimensionPixelSize(r12)
            int r9 = r9 + r11
            float r9 = (float) r9
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r11 = r8.f334677c
            float r11 = r11.getX()
            float r11 = r9 - r11
            int r9 = r15.bottom
            android.content.res.Resources r7 = r14.getResources()
            int r7 = r7.getDimensionPixelSize(r12)
            int r9 = r9 - r7
            android.content.res.Resources r7 = r14.getResources()
            int r7 = r7.getDimensionPixelSize(r10)
            int r9 = r9 - r7
            float r7 = (float) r9
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r9 = r8.f334677c
            float r9 = r9.getY()
            float r7 = r7 - r9
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0144
            r9 = 1
            goto L_0x0145
        L_0x0144:
            r9 = 0
        L_0x0145:
            if (r9 == 0) goto L_0x015c
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x014d
            r9 = 1
            goto L_0x014e
        L_0x014d:
            r9 = 0
        L_0x014e:
            if (r9 != 0) goto L_0x0151
            goto L_0x015c
        L_0x0151:
            r16 = r1
            r17 = r3
            r5 = r13
            r7 = r14
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            goto L_0x01c4
        L_0x015c:
            w82.f r10 = new w82.f
            r9 = r10
            r16 = r1
            r1 = r10
            r10 = r8
            r17 = r3
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r12 = r5
            r5 = r13
            r13 = r7
            r7 = r14
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r5.setUpdateListener(r1)
            goto L_0x01c4
        L_0x0174:
            r16 = r1
            r17 = r3
            r5 = r13
            r7 = r14
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r1 = r15.left
            float r1 = (float) r1
            r7.setX(r1)
            int r1 = r15.top
            float r1 = (float) r1
            r7.setY(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r6 = r15.width()
            int r9 = r15.height()
            r1.<init>(r6, r9)
            r7.setLayoutParams(r1)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r1 = r8.f334677c
            int r6 = r15.left
            android.content.res.Resources r9 = r7.getResources()
            int r9 = r9.getDimensionPixelSize(r3)
            int r6 = r6 + r9
            float r6 = (float) r6
            r1.setX(r6)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r1 = r8.f334677c
            int r6 = r15.bottom
            android.content.res.Resources r9 = r7.getResources()
            int r9 = r9.getDimensionPixelSize(r3)
            int r6 = r6 - r9
            android.content.res.Resources r9 = r7.getResources()
            int r9 = r9.getDimensionPixelSize(r10)
            int r6 = r6 - r9
            float r6 = (float) r6
            r1.setY(r6)
        L_0x01c4:
            boolean r1 = r8.f334684j
            if (r1 == 0) goto L_0x021b
            boolean r1 = r8.f334683i
            if (r1 == 0) goto L_0x020a
            w82.a r1 = r8.mo163494a()
            int r6 = r15.right
            android.content.res.Resources r9 = r7.getResources()
            int r9 = r9.getDimensionPixelSize(r3)
            int r6 = r6 - r9
            android.content.res.Resources r9 = r7.getResources()
            r10 = 2131165367(0x7f0700b7, float:1.794495E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r6 = r6 - r9
            float r6 = (float) r6
            r1.setX(r6)
            w82.a r1 = r8.mo163494a()
            int r6 = r15.bottom
            android.content.res.Resources r9 = r7.getResources()
            int r3 = r9.getDimensionPixelSize(r3)
            int r6 = r6 - r3
            android.content.res.Resources r3 = r7.getResources()
            r7 = 2131165346(0x7f0700a2, float:1.7944907E38)
            int r3 = r3.getDimensionPixelSize(r7)
            int r6 = r6 - r3
            float r3 = (float) r6
            r1.setY(r3)
        L_0x020a:
            w82.g r1 = new w82.g
            r1.<init>(r8)
            r5.withStartAction(r1)
            w82.h r1 = new w82.h
            r1.<init>(r8)
            r5.withEndAction(r1)
            goto L_0x0249
        L_0x021b:
            boolean r1 = r8.f334683i
            if (r1 == 0) goto L_0x0228
            w82.i r1 = new w82.i
            r1.<init>(r8, r15, r7)
            r5.withEndAction(r1)
            goto L_0x0249
        L_0x0228:
            if (r1 != 0) goto L_0x0249
            lu3.c<?> r1 = r8.f334680f
            if (r1 == 0) goto L_0x0232
            r3 = 0
            r1.cancel(r3)
        L_0x0232:
            r1 = 0
            r8.f334680f = r1
            android.widget.TextView r3 = r8.mo163495b()
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.cancel()
            android.widget.TextView r3 = r8.mo163495b()
            r6 = 4
            r3.setVisibility(r6)
            goto L_0x024a
        L_0x0249:
            r1 = 0
        L_0x024a:
            java.lang.String r3 = "animator"
            gy3.C87412m.m108593f(r5, r3)
            r6 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r3 = r5.setDuration(r6)
            r3.start()
            android.graphics.Rect r3 = r4.f307809c
            int r3 = r3.bottom
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r0.f315088h
            int r5 = r4.f307807a
            if (r3 != r5) goto L_0x026b
            android.graphics.Rect r3 = r4.f307809c
            int r3 = r3.bottom
            goto L_0x0273
        L_0x026b:
            r3 = r17
            goto L_0x0273
        L_0x026e:
            r16 = r1
            r17 = r3
            r1 = 0
        L_0x0273:
            r1 = r16
            r6 = 1
            goto L_0x0052
        L_0x0278:
            r17 = r3
            r1 = 0
            if (r2 <= 0) goto L_0x03d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkScroller() called with: maxY = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", targetY = "
            r3.append(r4)
            r7 = r17
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.MT.MultiTalkAvatarLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            android.view.ViewParent r3 = r18.getParent()
            boolean r5 = r3 instanceof android.widget.ScrollView
            if (r5 == 0) goto L_0x02a9
            r5 = r3
            android.widget.ScrollView r5 = (android.widget.ScrollView) r5
            goto L_0x02aa
        L_0x02a9:
            r5 = r1
        L_0x02aa:
            if (r5 != 0) goto L_0x02b4
            java.lang.String r1 = "checkScroller: parent is not scroller view"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
        L_0x02b1:
            r1 = 0
            goto L_0x038e
        L_0x02b4:
            int[] r1 = o40.C61926c.m72690o(r5)
            r3 = 1
            r1 = r1[r3]
            int r3 = r0.f315091n
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r6 = r18.getScreenHeight()
            java.lang.String r8 = " ty "
            java.lang.String r9 = "  panel "
            java.lang.String r10 = " screenHeight "
            if (r3 <= r6) goto L_0x035d
            int r6 = r18.getScreenHeight()
            int r3 = r3 - r6
            int r6 = r5.getScrollY()
            int r3 = r3 - r6
            java.lang.String r6 = " vt: "
            java.lang.String r11 = " bottom "
            if (r3 <= 0) goto L_0x031c
            int r7 = r2 - r7
            if (r3 > r7) goto L_0x031c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "checkScroller: no need to scroller th "
            r7.append(r12)
            r7.append(r3)
            r7.append(r11)
            r7.append(r2)
            r7.append(r10)
            int r3 = r18.getScreenHeight()
            r7.append(r3)
            r7.append(r9)
            int r3 = r0.f315091n
            r7.append(r3)
            r7.append(r8)
            int r3 = r5.getScrollY()
            r7.append(r3)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x02b1
        L_0x031c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "checkScroller: need scroller th "
            r7.append(r12)
            r7.append(r3)
            r7.append(r11)
            r7.append(r2)
            r7.append(r10)
            int r10 = r18.getScreenHeight()
            r7.append(r10)
            r7.append(r9)
            int r9 = r0.f315091n
            r7.append(r9)
            r7.append(r8)
            int r8 = r5.getScrollY()
            r7.append(r8)
            r7.append(r6)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 0
            r5.smoothScrollBy(r1, r3)
            goto L_0x038e
        L_0x035d:
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "checkScroller: no need scroller bottom "
            r3.append(r6)
            r3.append(r2)
            r3.append(r10)
            int r6 = r18.getScreenHeight()
            r3.append(r6)
            r3.append(r9)
            int r6 = r0.f315091n
            r3.append(r6)
            r3.append(r8)
            int r5 = r5.getScrollY()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x038e:
            int r3 = r0.f315093p
            if (r2 == r3) goto L_0x03d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "updateLastY: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r0.f315093p = r2
            android.view.ViewParent r3 = r18.getParent()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r3, r4)
            android.view.View r3 = (android.view.View) r3
            int[] r3 = o40.C61926c.m72690o(r3)
            fy3.p<? super java.lang.Integer, ? super java.lang.Boolean, rx3.b0> r4 = r0.f315087g
            int r5 = r0.f315093p
            r6 = 1
            r3 = r3[r6]
            int r5 = r5 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            int r5 = r0.f315089i
            int r7 = r0.f315088h
            if (r5 == r7) goto L_0x03ca
            goto L_0x03cb
        L_0x03ca:
            r6 = 0
        L_0x03cb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r4.invoke(r3, r1)
            int r1 = r0.f315088h
            r0.f315089i = r1
        L_0x03d6:
            int r1 = r0.f315091n
            int r2 = r2 + r1
            int r1 = r18.getMeasuredHeight()
            if (r2 <= r1) goto L_0x03e2
            r18.requestLayout()
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultiTalkAvatarLayout.mo150987c():void");
    }

    /* renamed from: d */
    public final void mo150988d(boolean z) {
        List<C105882d> list;
        T t;
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "refreshLayout: forceUpdate " + z);
        C111770k kVar = this.f315086f;
        if (kVar != null && (list = kVar.f334707d) != null) {
            ArrayMap<String, C111759e> arrayMap = this.f315084d;
            ArrayList<C105882d> arrayList = new ArrayList<>(arrayMap.size());
            for (Map.Entry<String, C111759e> value : arrayMap.entrySet()) {
                arrayList.add(((C111759e) value.getValue()).f334679e);
            }
            int i = -1;
            if (!TextUtils.isEmpty(this.f315090j)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C105882d) t).f314927b, this.f315090j)) {
                        break;
                    }
                }
                if (((C105882d) t) == null) {
                    Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "refreshLayout: current chosen user quit talking");
                    this.f315088h = -1;
                    this.f315090j = null;
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            List<T> b0 = !z ? C110818d0.m150930b0(list, C110818d0.m150904D0(arrayList)) : list;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C105882d dVar : arrayList) {
                arrayList2.add(dVar.f314927b);
            }
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list, 10));
            for (C105882d dVar2 : list) {
                arrayList3.add(dVar2.f314927b);
            }
            boolean z2 = true;
            boolean z3 = false;
            for (String remove : C110818d0.m150930b0(arrayList2, C110818d0.m150904D0(arrayList3))) {
                C111759e remove2 = this.f315084d.remove(remove);
                if (remove2 != null) {
                    C34379c<?> cVar = remove2.f334680f;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    remove2.f334680f = null;
                    remove2.mo163495b().animate().cancel();
                    removeView(remove2.f334676b);
                    removeView(remove2.f334677c);
                    removeView(remove2.mo163495b());
                    if (remove2.f334684j) {
                        removeView(remove2.mo163494a());
                    }
                }
                z3 = true;
            }
            for (T t2 : b0) {
                C111759e eVar = this.f315084d.get(t2.f314927b);
                if (eVar != null) {
                    C105882d dVar3 = eVar.f334679e;
                    if (!(dVar3.f314929d == t2.f314929d && dVar3.mo150900a() == t2.mo150900a())) {
                        z3 = true;
                    }
                    eVar.mo163496c(t2, z);
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    if (this.f315084d.containsKey(t2.f314927b)) {
                        Log.m105928w("MicroMsg.MT.MultiTalkAvatarLayout", "already has this item");
                    } else {
                        Context context = getContext();
                        C87412m.m108593f(context, "context");
                        C111759e eVar2 = new C111759e(context, t2);
                        this.f315084d.put(t2.f314927b, eVar2);
                        C111769j jVar = new C111769j(eVar2, this);
                        addView(eVar2.f334676b, new ViewGroup.LayoutParams(0, 0));
                        eVar2.f334676b.setOnClickListener(new C15051d(jVar));
                        addView(eVar2.f334677c, new ViewGroup.LayoutParams(eVar2.f334675a.getResources().getDimensionPixelSize(C0966R.dimen.f4318k1), eVar2.f334675a.getResources().getDimensionPixelSize(C0966R.dimen.f4318k1)));
                        addView(eVar2.mo163495b());
                        if (eVar2.f334684j) {
                            addView(eVar2.mo163494a(), new ViewGroup.LayoutParams(-2, -2));
                            eVar2.mo163494a().setVisibility(4);
                        }
                    }
                    z3 = true;
                }
            }
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C111759e eVar3 = this.f315084d.get(((C105882d) next).f314927b);
                    if (eVar3 != null) {
                        eVar3.f334682h = i2;
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (!TextUtils.isEmpty(this.f315090j)) {
                C111759e eVar4 = this.f315084d.get(this.f315090j);
                if (eVar4 != null) {
                    i = eVar4.f334682h;
                }
                if (!z3 && i == this.f315088h) {
                    z2 = false;
                }
                this.f315088h = i;
                z3 = z2;
            }
            if (z3) {
                mo150985a();
            }
        }
    }

    /* renamed from: e */
    public final void mo150989e(List<C104072a.C104073a> list) {
        ViewParent parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        int scrollY = view != null ? view.getScrollY() : 0;
        int screenHeight = (getScreenHeight() - this.f315091n) + scrollY;
        HashSet<String> hashSet = new HashSet<>(this.f315085e);
        for (C104072a.C104073a aVar : list) {
            Rect rect = aVar.f307809c;
            if (rect.bottom < scrollY || rect.top > screenHeight) {
                hashSet.remove(aVar.f307808b);
            } else {
                hashSet.add(aVar.f307808b);
            }
        }
        this.f315085e = hashSet;
        C111770k kVar = this.f315086f;
        if (kVar != null) {
            kVar.mo163504a(hashSet, this.f315090j);
        }
    }

    /* renamed from: f */
    public final List<C104072a.C104073a> mo150990f(ArrayMap<String, C111759e> arrayMap) {
        ArrayList arrayList = new ArrayList(arrayMap.size());
        for (Map.Entry<String, C111759e> value : arrayMap.entrySet()) {
            C111759e eVar = (C111759e) value.getValue();
            C111773l lVar = eVar.f334676b;
            arrayList.add(new C104072a.C104073a(eVar.f334682h, eVar.f334679e.f314927b, new Rect((int) lVar.getX(), (int) lVar.getY(), (int) (lVar.getX() + (((float) lVar.getWidth()) * lVar.getScaleX())), (int) (lVar.getY() + (((float) lVar.getHeight()) * lVar.getScaleY())))));
        }
        return arrayList;
    }

    public final int getBottomPanelHeight() {
        return this.f315091n;
    }

    public final C111770k getLayoutAdapter() {
        return this.f315086f;
    }

    public final C32227p<Integer, Boolean, C13598b0> getOnMaxYChanged() {
        return this.f315087g;
    }

    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        List<C104072a.C104073a> f = mo150990f(this.f315084d);
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int i3 = this.f315088h;
        C104072a aVar = C104072a.f307806a;
        Integer valueOf = Integer.valueOf(i3);
        int i4 = 0;
        Integer num = null;
        if (!(valueOf.intValue() < ((ArrayList) f).size())) {
            valueOf = null;
        }
        aVar.mo145669b(f, valueOf != null ? valueOf.intValue() : -1, defaultSize, this.f315091n == 0 ? 0 : (getScreenHeight() - C61926c.m72690o(this)[1]) - this.f315091n);
        Iterator<T> it = f.iterator();
        if (it.hasNext()) {
            Integer valueOf2 = Integer.valueOf(((C104072a.C104073a) it.next()).f307809c.bottom);
            loop0:
            while (true) {
                num = valueOf2;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    valueOf2 = Integer.valueOf(((C104072a.C104073a) it.next()).f307809c.bottom);
                    if (num.compareTo(valueOf2) < 0) {
                    }
                }
            }
        }
        Integer num2 = num;
        if (num2 != null) {
            i4 = num2.intValue();
        }
        setMeasuredDimension(defaultSize, i4 + this.f315091n);
    }

    public final void setBottomPanelHeight(int i) {
        if (this.f315091n == i) {
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "setBottomPanelHeight: no need to update");
            return;
        }
        this.f315091n = i;
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "setBottomPanelHeight: " + this.f315091n);
        mo150985a();
    }

    public final void setLayoutAdapter(C111770k kVar) {
        this.f315086f = kVar;
        if (kVar != null) {
            kVar.f334705b = new C105910b(this);
        }
    }

    public final void setOnMaxYChanged(C32227p<? super Integer, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(pVar, "<set-?>");
        this.f315087g = pVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "setVisibility: clear visible user");
            this.f315085e.clear();
            return;
        }
        mo150989e(mo150990f(this.f315084d));
        mo150988d(true);
    }
}
