package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C39622i0;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C48996cf1;
import te3.C49570gk;
import te3.C49633h00;
import te3.C49888ir3;
import te3.C50170kr3;
import te3.C50301lr3;
import te3.C51028qy;
import te3.C51245sh2;
import te3.C51399ti;
import te3.C51547uh2;
import up1.C27696y;
import wb2.C65946a;
import wp1.C15587j;
import wx3.C15601d;
import wx3.C66212f;
import x50.C15626c;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/extension/reddot/render/RenderView;", "Landroid/widget/LinearLayout;", "", "j", "I", "getRenderState", "()I", "setRenderState", "(I)V", "renderState", "n", "getFriendRemarkFlag", "setFriendRemarkFlag", "friendRemarkFlag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AlignAbsoluteSizeSpan", "a", "b", "FontWeightAbsoluteSizeSpan", "c", "d", "e", "f", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView */
public final class RenderView extends LinearLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f312709o = 0;

    /* renamed from: d */
    public final int f312710d = getContext().getResources().getColor(C0966R.color.FG_1);

    /* renamed from: e */
    public final int f312711e = ((int) getContext().getResources().getDimension(C0966R.dimen.f3766df));

    /* renamed from: f */
    public final int f312712f = ((int) getContext().getResources().getDimension(C0966R.dimen.f3736cp));

    /* renamed from: g */
    public final int f312713g = ((int) getContext().getResources().getDimension(C0966R.dimen.f3749d0));

    /* renamed from: h */
    public final int f312714h = ((int) getContext().getResources().getDimension(C0966R.dimen.f3703bv));

    /* renamed from: i */
    public final int f312715i = getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1);

    /* renamed from: j */
    public int f312716j;

    /* renamed from: n */
    public int f312717n;

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$b */
    public static final class C93751b extends AppCompatImageView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93751b(Context context, int i, int i2, float f) {
            super(context, (AttributeSet) null);
            C87412m.m108594g(context, "context");
            if (i2 > 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i);
                gradientDrawable.setCornerRadius(f);
                setPadding(i2, i2, i2, i2);
                setBackgroundDrawable(gradientDrawable);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/extension/reddot/render/RenderView$AlignAbsoluteSizeSpan;", "Lcom/tencent/mm/plugin/finder/extension/reddot/render/RenderView$FontWeightAbsoluteSizeSpan;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$AlignAbsoluteSizeSpan */
    public static final class AlignAbsoluteSizeSpan extends FontWeightAbsoluteSizeSpan {

        /* renamed from: e */
        public final float f312718e;

        public AlignAbsoluteSizeSpan(int i, float f, int i2) {
            super(i, i2);
            this.f312718e = f;
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "tp");
            float ascent = textPaint.ascent();
            super.updateDrawState(textPaint);
            float f = textPaint.getFontMetrics().ascent;
            int i = textPaint.baselineShift;
            float f2 = this.f312718e;
            textPaint.baselineShift = i + ((int) ((ascent - (ascent * f2)) - (f - (f2 * f))));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/extension/reddot/render/RenderView$FontWeightAbsoluteSizeSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$FontWeightAbsoluteSizeSpan */
    public static class FontWeightAbsoluteSizeSpan extends AbsoluteSizeSpan {

        /* renamed from: d */
        public final int f312719d;

        public FontWeightAbsoluteSizeSpan(int i, int i2) {
            super(i);
            this.f312719d = i2;
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            super.updateDrawState(textPaint);
            int i = this.f312719d;
            if (i == 1) {
                C85875k4.m106189j0(textPaint, 1.0f);
            } else if (i != 2) {
                C85875k4.m106193l0(textPaint);
            } else {
                C85875k4.m106191k0(textPaint);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$a */
    public final class C105254a extends C105255c {

        /* renamed from: f */
        public final /* synthetic */ RenderView f312720f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105254a(RenderView renderView, Context context) {
            super(renderView, context);
            C87412m.m108594g(context, "context");
            this.f312720f = renderView;
        }

        /* renamed from: m */
        public int mo149652m(C105256d dVar, C105257e eVar) {
            float f;
            C49570gk gkVar;
            C51399ti tiVar;
            C87412m.m108594g(dVar, "renderContext");
            C87412m.m108594g(eVar, "split");
            setSplit(eVar);
            C50301lr3 lr32 = (C50301lr3) C110818d0.m150916N(eVar.f312727b);
            float f2 = 0.0f;
            if (lr32 != null) {
                RenderView renderView = this.f312720f;
                boolean z = dVar.f312723a;
                C50301lr3 a = mo149655a(z);
                if (a != null) {
                    int intValue = ((Number) mo149658d(((Number) mo149663i(a, z).f38555d).intValue()).f38555d).intValue();
                    f = ((float) (intValue == -2 ? renderView.f312711e / 2 : intValue / 2)) + 0.0f;
                } else {
                    f = 0.0f;
                }
                float n = f + ((float) mo149653n(lr32, z));
                C49888ir3 ir32 = lr32.f137621f;
                float f3 = (float) ((ir32 == null || (gkVar = ir32.f135629e) == null || (tiVar = gkVar.f134083g) == null) ? 0 : tiVar.f142235d);
                if (f3 > 0.0f) {
                    f2 = f3;
                }
                f2 = n + ((float) (C15626c.m14629a(getContext(), f2) * 2));
            }
            return (int) f2;
        }

        /* renamed from: n */
        public final int mo149653n(C50301lr3 lr32, boolean z) {
            C51028qy qyVar;
            C49633h00 h002;
            C50170kr3 kr32;
            C50170kr3 kr33;
            int i = 0;
            if (lr32 == null) {
                return 0;
            }
            RenderView renderView = this.f312720f;
            C51245sh2 sh22 = null;
            if (!z ? !((kr32 = lr32.f137620e) == null || (h002 = kr32.f137019d) == null) : !((kr33 = lr32.f137620e) == null || (h002 = kr33.f137020e) == null)) {
                sh22 = h002.f134376e;
            }
            if (!mo149659f(sh22)) {
                return 0;
            }
            C49888ir3 ir32 = lr32.f137621f;
            if (!(ir32 == null || (qyVar = ir32.f135628d) == null)) {
                i = qyVar.f140609d;
            }
            float f = (float) i;
            if (f <= 0.0f) {
                f = 0.0f;
            }
            int a = C15626c.m14629a(getContext(), f);
            if (a <= 0) {
                a = renderView.f312713g;
            }
            return a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
            r2 = r2.f135629e;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo149654o(com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d r12, com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e r13) {
            /*
                r11 = this;
                java.lang.String r0 = "renderContext"
                gy3.C87412m.m108594g(r12, r0)
                java.lang.String r0 = "split"
                gy3.C87412m.m108594g(r13, r0)
                r11.setSplit(r13)
                java.util.ArrayList<te3.lr3> r13 = r13.f312727b
                java.lang.Object r13 = sx3.C110818d0.m150916N(r13)
                te3.lr3 r13 = (te3.C50301lr3) r13
                if (r13 == 0) goto L_0x017f
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r0 = r11.f312720f
                boolean r12 = r12.f312723a
                int r7 = r11.mo149653n(r13, r12)
                java.lang.String r1 = r11.mo149660g(r13, r12)
                te3.ir3 r2 = r13.f137621f
                r3 = 0
                if (r2 == 0) goto L_0x0034
                te3.gk r2 = r2.f135629e
                if (r2 == 0) goto L_0x0034
                float r2 = r2.f134082f
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                goto L_0x0035
            L_0x0034:
                r2 = r3
            L_0x0035:
                r4 = 1056964608(0x3f000000, float:0.5)
                boolean r2 = gy3.C87412m.m108588a(r2, r4)
                te3.ir3 r4 = r13.f137621f
                if (r4 == 0) goto L_0x0046
                te3.gk r4 = r4.f135629e
                if (r4 == 0) goto L_0x0046
                te3.ti r4 = r4.f134083g
                goto L_0x0047
            L_0x0046:
                r4 = r3
            L_0x0047:
                if (r4 == 0) goto L_0x004c
                te3.jr3 r5 = r4.f142236e
                goto L_0x004d
            L_0x004c:
                r5 = r3
            L_0x004d:
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r6 = r11.f312722e
                int r6 = r6.f312710d
                int r5 = r11.mo149656b(r5, r6)
                r8 = 0
                if (r4 == 0) goto L_0x005b
                int r4 = r4.f142235d
                goto L_0x005c
            L_0x005b:
                r4 = 0
            L_0x005c:
                float r4 = (float) r4
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L_0x0063
                goto L_0x0064
            L_0x0063:
                r4 = 0
            L_0x0064:
                android.content.Context r6 = r11.getContext()
                int r4 = x50.C15626c.m14629a(r6, r4)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$b r6 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$b
                android.content.Context r9 = r11.getContext()
                java.lang.String r10 = "context"
                gy3.C87412m.m108593f(r9, r10)
                if (r2 == 0) goto L_0x007b
                float r10 = (float) r7
                goto L_0x007e
            L_0x007b:
                int r10 = r0.f312714h
                float r10 = (float) r10
            L_0x007e:
                r6.<init>(r9, r5, r4, r10)
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r4.<init>(r7, r7)
                r5 = 17
                r4.gravity = r5
                r6.setLayoutParams(r4)
                r4 = 2131304724(0x7f092114, float:1.8227599E38)
                r6.setId(r4)
                te3.ir3 r13 = r13.f137621f
                if (r13 == 0) goto L_0x009d
                te3.qy r13 = r13.f135628d
                if (r13 == 0) goto L_0x009d
                te3.jr3 r3 = r13.f140610e
            L_0x009d:
                java.lang.String r13 = "#FFFFFFFF"
                int r13 = android.graphics.Color.parseColor(r13)
                int r13 = r11.mo149656b(r3, r13)
                int r13 = android.graphics.Color.alpha(r13)
                up1.y r3 = up1.C27696y.MEDIUM_AVATAR_IMAGE
                java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
                r6.setVisibility(r8)
                float r13 = (float) r13
                r9 = 1132396544(0x437f0000, float:255.0)
                float r13 = r13 / r9
                r6.setAlpha(r13)
                int r13 = r1.length()
                if (r13 <= 0) goto L_0x00c3
                r13 = 1
                goto L_0x00c4
            L_0x00c3:
                r13 = 0
            L_0x00c4:
                if (r13 == 0) goto L_0x011a
                if (r2 != 0) goto L_0x00f1
                bl3.r r13 = bl3.C39818r.f106831a
                bl3.r$a r2 = r13.mo62446e(r5)
                bl3.c r2 = r2.mo62447c(r4)
                pl1.s0 r2 = (pl1.C11990s0) r2
                k60.d r2 = r2.mo11865K1()
                pl1.f r9 = new pl1.f
                r9.<init>(r1, r3)
                pl1.e0$a r1 = pl1.C11978e0.C11979a.WX_AVATAR
                bl3.r$a r13 = r13.mo62446e(r5)
                bl3.c r13 = r13.mo62447c(r4)
                pl1.s0 r13 = (pl1.C11990s0) r13
                n60.f r13 = r13.mo11867O2(r1)
                r2.mo85957c(r9, r6, r13)
                goto L_0x0120
            L_0x00f1:
                bl3.r r13 = bl3.C39818r.f106831a
                bl3.r$a r2 = r13.mo62446e(r5)
                bl3.c r2 = r2.mo62447c(r4)
                pl1.s0 r2 = (pl1.C11990s0) r2
                k60.d r2 = r2.mo11872i2()
                pl1.f r9 = new pl1.f
                r9.<init>(r1, r3)
                pl1.e0$a r1 = pl1.C11978e0.C11979a.AVATAR
                bl3.r$a r13 = r13.mo62446e(r5)
                bl3.c r13 = r13.mo62447c(r4)
                pl1.s0 r13 = (pl1.C11990s0) r13
                n60.f r13 = r13.mo11867O2(r1)
                r2.mo85957c(r9, r6, r13)
                goto L_0x0120
            L_0x011a:
                r13 = 2131231871(0x7f08047f, float:1.8079835E38)
                r6.setImageResource(r13)
            L_0x0120:
                r11.addView(r6)
                te3.lr3 r13 = r11.mo149655a(r12)
                if (r13 == 0) goto L_0x017f
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r11
                r2 = r13
                r3 = r12
                int r1 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141354j(r1, r2, r3, r4, r5, r6)
                rx3.l r12 = r11.mo149663i(r13, r12)
                A r13 = r12.f38555d
                java.lang.Number r13 = (java.lang.Number) r13
                int r13 = r13.intValue()
                B r12 = r12.f38556e
                java.lang.String r12 = (java.lang.String) r12
                rx3.l r2 = r11.mo149658d(r13)
                A r3 = r2.f38555d
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                B r2 = r2.f38556e
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                android.widget.ImageView r4 = new android.widget.ImageView
                android.content.Context r5 = r11.getContext()
                r4.<init>(r5)
                android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
                r5.<init>(r3, r2)
                r2 = -2
                if (r3 != r2) goto L_0x016d
                int r0 = r0.f312711e
                int r0 = r0 / 2
                goto L_0x016f
            L_0x016d:
                int r0 = r3 / 2
            L_0x016f:
                int r0 = -r0
                r11.mo149665l(r5, r1, r8, r0)
                r4.setLayoutParams(r5)
                r11.mo149662h(r4, r12, r13)
                r11.mo149664k(r11, r4, r7)
                r11.addView(r4)
            L_0x017f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105254a.mo149654o(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$c */
    public abstract class C105255c extends FrameLayout {

        /* renamed from: d */
        public C105257e f312721d;

        /* renamed from: e */
        public final /* synthetic */ RenderView f312722e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105255c(RenderView renderView, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            this.f312722e = renderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            r1 = r1.f135628d;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m141353e(com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c r0, te3.C50301lr3 r1, float r2, int r3, java.lang.Object r4) {
            /*
                if (r4 != 0) goto L_0x0042
                r3 = r3 & 2
                if (r3 == 0) goto L_0x000a
                int r2 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.f312709o
                r2 = 1096810496(0x41600000, float:14.0)
            L_0x000a:
                r0.getClass()
                java.lang.String r3 = "node"
                gy3.C87412m.m108594g(r1, r3)
                te3.ir3 r1 = r1.f137621f
                r3 = 0
                if (r1 == 0) goto L_0x001f
                te3.qy r1 = r1.f135628d
                if (r1 == 0) goto L_0x001f
                int r1 = r1.f140609d
                float r1 = (float) r1
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0025
                r2 = r1
            L_0x0025:
                android.content.Context r1 = r0.getContext()
                float r1 = kg3.C76577a.m92165p(r1)
                r3 = 1068708659(0x3fb33333, float:1.4)
                int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r4 <= 0) goto L_0x0037
                r1 = 1068708659(0x3fb33333, float:1.4)
            L_0x0037:
                android.content.Context r0 = r0.getContext()
                float r2 = r2 * r1
                int r0 = x50.C15626c.m14629a(r0, r2)
                return r0
            L_0x0042:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getTextSize"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141353e(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$c, te3.lr3, float, int, java.lang.Object):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r0 = (r0 = r0.f135629e).f134084h;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m141354j(com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c r0, te3.C50301lr3 r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            /*
                if (r5 != 0) goto L_0x002f
                r4 = r4 & 4
                if (r4 == 0) goto L_0x0007
                r3 = 2
            L_0x0007:
                r0.getClass()
                java.lang.String r0 = "node"
                gy3.C87412m.m108594g(r1, r0)
                if (r2 == 0) goto L_0x0020
                te3.ir3 r0 = r1.f137621f
                if (r0 == 0) goto L_0x002e
                te3.gk r0 = r0.f135629e
                if (r0 == 0) goto L_0x002e
                te3.up3 r0 = r0.f134084h
                if (r0 == 0) goto L_0x002e
                int r3 = r0.f143019e
                goto L_0x002e
            L_0x0020:
                te3.ir3 r0 = r1.f137621f
                if (r0 == 0) goto L_0x002e
                te3.gk r0 = r0.f135629e
                if (r0 == 0) goto L_0x002e
                te3.up3 r0 = r0.f134084h
                if (r0 == 0) goto L_0x002e
                int r3 = r0.f143018d
            L_0x002e:
                return r3
            L_0x002f:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: redDotPendantPosition"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141354j(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$c, te3.lr3, boolean, int, int, java.lang.Object):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
            r2 = (r2 = r2.f137020e).f134377f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final te3.C50301lr3 mo149655a(boolean r7) {
            /*
                r6 = this;
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r0 = r6.getSplit()
                java.util.ArrayList<te3.lr3> r0 = r0.f312727b
                java.util.Iterator r0 = r0.iterator()
            L_0x000a:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0075
                java.lang.Object r1 = r0.next()
                te3.lr3 r1 = (te3.C50301lr3) r1
                r3 = 1
                r4 = 0
                if (r7 == 0) goto L_0x0046
                te3.kr3 r5 = r1.f137620e
                if (r5 == 0) goto L_0x002d
                te3.h00 r5 = r5.f137020e
                if (r5 == 0) goto L_0x002d
                te3.tp3 r5 = r5.f134377f
                if (r5 == 0) goto L_0x002d
                te3.uh2 r5 = r5.f142322e
                if (r5 == 0) goto L_0x002d
                java.lang.String r2 = r5.f142855d
            L_0x002d:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0072
                te3.kr3 r2 = r1.f137620e
                if (r2 == 0) goto L_0x0042
                te3.h00 r2 = r2.f137020e
                if (r2 == 0) goto L_0x0042
                te3.tp3 r2 = r2.f134377f
                if (r2 == 0) goto L_0x0042
                int r2 = r2.f142321d
                goto L_0x0043
            L_0x0042:
                r2 = 0
            L_0x0043:
                if (r2 <= 0) goto L_0x0071
                goto L_0x0072
            L_0x0046:
                te3.kr3 r5 = r1.f137620e
                if (r5 == 0) goto L_0x0058
                te3.h00 r5 = r5.f137019d
                if (r5 == 0) goto L_0x0058
                te3.tp3 r5 = r5.f134377f
                if (r5 == 0) goto L_0x0058
                te3.uh2 r5 = r5.f142322e
                if (r5 == 0) goto L_0x0058
                java.lang.String r2 = r5.f142855d
            L_0x0058:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0072
                te3.kr3 r2 = r1.f137620e
                if (r2 == 0) goto L_0x006d
                te3.h00 r2 = r2.f137019d
                if (r2 == 0) goto L_0x006d
                te3.tp3 r2 = r2.f134377f
                if (r2 == 0) goto L_0x006d
                int r2 = r2.f142321d
                goto L_0x006e
            L_0x006d:
                r2 = 0
            L_0x006e:
                if (r2 <= 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r3 = 0
            L_0x0072:
                if (r3 == 0) goto L_0x000a
                return r1
            L_0x0075:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.mo149655a(boolean):te3.lr3");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            if (r3 != null) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r3 == null) goto L_0x0022;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo149656b(te3.C50028jr3 r3, int r4) {
            /*
                r2 = this;
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x001a
                if (r3 == 0) goto L_0x0011
                java.lang.String r0 = r3.f136279e
                if (r0 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r1 = r0
                goto L_0x0022
            L_0x0011:
                if (r3 == 0) goto L_0x0016
                java.lang.String r3 = r3.f136278d
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                if (r3 != 0) goto L_0x0021
                goto L_0x0022
            L_0x001a:
                if (r3 == 0) goto L_0x0022
                java.lang.String r3 = r3.f136278d
                if (r3 != 0) goto L_0x0021
                goto L_0x0022
            L_0x0021:
                r1 = r3
            L_0x0022:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r3 != 0) goto L_0x0042
                r3 = 0
                java.lang.String r0 = "#"
                boolean r3 = z04.C112551y.m153819s(r1, r0, r3)
                if (r3 != 0) goto L_0x0042
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r0 = 35
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x0042:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r3 == 0) goto L_0x0049
                goto L_0x0061
            L_0x0049:
                int r3 = android.graphics.Color.parseColor(r1)
                int r4 = android.graphics.Color.blue(r3)
                int r0 = android.graphics.Color.green(r3)
                int r1 = android.graphics.Color.red(r3)
                int r3 = android.graphics.Color.alpha(r3)
                int r4 = android.graphics.Color.argb(r4, r3, r1, r0)
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.mo149656b(te3.jr3, int):int");
        }

        /* renamed from: c */
        public final String mo149657c(C51245sh2 sh22) {
            String str;
            C51547uh2 uh22 = sh22.f141520e;
            String str2 = "";
            if (uh22 == null || (str = uh22.f142855d) == null) {
                str = str2;
            }
            if (!Util.isNullOrNil(str)) {
                return str;
            }
            C15587j jVar = C15587j.f42215a;
            String str3 = sh22.f141519d;
            if (str3 == null) {
                str3 = str2;
            }
            C48996cf1 a = jVar.mo14349a(str3);
            String str4 = a != null ? a.f131694e : null;
            if (str4 != null) {
                str2 = str4;
            }
            return str2;
        }

        /* renamed from: d */
        public final C13604l<Integer, Integer> mo149658d(int i) {
            int i2;
            int i3 = -2;
            if (i == 1) {
                i2 = -2;
            } else {
                i3 = (int) (((float) C79406f.m96347a(getContext(), 11.1f)) * C76577a.m92165p(getContext()));
                i2 = i3;
            }
            return new C13604l<>(Integer.valueOf(i3), Integer.valueOf(i2));
        }

        /* renamed from: f */
        public final boolean mo149659f(C51245sh2 sh22) {
            String str;
            C51547uh2 uh22;
            C15587j jVar = C15587j.f42215a;
            if (sh22 == null || (str = sh22.f141519d) == null) {
                str = "";
            }
            C48996cf1 a = jVar.mo14349a(str);
            String str2 = null;
            if (Util.isNullOrNil(a != null ? a.f131694e : null)) {
                if (!(sh22 == null || (uh22 = sh22.f141520e) == null)) {
                    str2 = uh22.f142855d;
                }
                return !Util.isNullOrNil(str2);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo149660g(te3.C50301lr3 r4, boolean r5) {
            /*
                r3 = this;
                java.lang.String r0 = "node"
                gy3.C87412m.m108594g(r4, r0)
                r0 = 0
                if (r5 == 0) goto L_0x0013
                te3.kr3 r4 = r4.f137620e
                if (r4 == 0) goto L_0x001e
                te3.h00 r4 = r4.f137020e
                if (r4 == 0) goto L_0x001e
                te3.sh2 r4 = r4.f134376e
                goto L_0x001f
            L_0x0013:
                te3.kr3 r4 = r4.f137620e
                if (r4 == 0) goto L_0x001e
                te3.h00 r4 = r4.f137019d
                if (r4 == 0) goto L_0x001e
                te3.sh2 r4 = r4.f134376e
                goto L_0x001f
            L_0x001e:
                r4 = r0
            L_0x001f:
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x005e
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x0059
                te3.uh2 r1 = r4.f141520e
                if (r1 == 0) goto L_0x0031
                java.lang.String r1 = r1.f142856e
                if (r1 != 0) goto L_0x0032
            L_0x0031:
                r1 = r5
            L_0x0032:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x004c
                wp1.j r1 = wp1.C15587j.f42215a
                java.lang.String r2 = r4.f141519d
                if (r2 != 0) goto L_0x003f
                r2 = r5
            L_0x003f:
                te3.cf1 r1 = r1.mo14349a(r2)
                if (r1 == 0) goto L_0x0047
                java.lang.String r0 = r1.f131695f
            L_0x0047:
                if (r0 != 0) goto L_0x004a
                goto L_0x004b
            L_0x004a:
                r5 = r0
            L_0x004b:
                r1 = r5
            L_0x004c:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r5 == 0) goto L_0x0057
                java.lang.String r4 = r3.mo149657c(r4)
                goto L_0x005d
            L_0x0057:
                r5 = r1
                goto L_0x005e
            L_0x0059:
                java.lang.String r4 = r3.mo149657c(r4)
            L_0x005d:
                r5 = r4
            L_0x005e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.mo149660g(te3.lr3, boolean):java.lang.String");
        }

        public final C105257e getSplit() {
            C105257e eVar = this.f312721d;
            if (eVar != null) {
                return eVar;
            }
            C87412m.m108603p("split");
            throw null;
        }

        /* renamed from: h */
        public final void mo149662h(ImageView imageView, String str, int i) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(imageView, "imageView");
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                imageView.setImageResource(i == 1 ? C0966R.C0969drawable.az5 : C0966R.raw.finder_live_icon);
            } else {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.THUMB_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rx3.C13604l<java.lang.Integer, java.lang.String> mo149663i(te3.C50301lr3 r5, boolean r6) {
            /*
                r4 = this;
                java.lang.String r0 = "node"
                gy3.C87412m.m108594g(r5, r0)
                r0 = 0
                if (r6 == 0) goto L_0x0013
                te3.kr3 r5 = r5.f137620e
                if (r5 == 0) goto L_0x001e
                te3.h00 r5 = r5.f137020e
                if (r5 == 0) goto L_0x001e
                te3.tp3 r5 = r5.f134377f
                goto L_0x001f
            L_0x0013:
                te3.kr3 r5 = r5.f137620e
                if (r5 == 0) goto L_0x001e
                te3.h00 r5 = r5.f137019d
                if (r5 == 0) goto L_0x001e
                te3.tp3 r5 = r5.f134377f
                goto L_0x001f
            L_0x001e:
                r5 = r0
            L_0x001f:
                boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                java.lang.String r1 = ""
                r2 = 0
                if (r6 == 0) goto L_0x004f
                rx3.l r6 = new rx3.l
                if (r5 == 0) goto L_0x002e
                int r2 = r5.f142321d
            L_0x002e:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                if (r5 == 0) goto L_0x003f
                te3.uh2 r3 = r5.f142322e
                if (r3 == 0) goto L_0x003f
                java.lang.String r3 = r3.f142856e
                if (r3 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r1 = r3
                goto L_0x004b
            L_0x003f:
                if (r5 == 0) goto L_0x0047
                te3.uh2 r5 = r5.f142322e
                if (r5 == 0) goto L_0x0047
                java.lang.String r0 = r5.f142855d
            L_0x0047:
                if (r0 != 0) goto L_0x004a
                goto L_0x004b
            L_0x004a:
                r1 = r0
            L_0x004b:
                r6.<init>(r2, r1)
                goto L_0x0068
            L_0x004f:
                rx3.l r6 = new rx3.l
                if (r5 == 0) goto L_0x0055
                int r2 = r5.f142321d
            L_0x0055:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                if (r5 == 0) goto L_0x0065
                te3.uh2 r5 = r5.f142322e
                if (r5 == 0) goto L_0x0065
                java.lang.String r5 = r5.f142855d
                if (r5 != 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r1 = r5
            L_0x0065:
                r6.<init>(r0, r1)
            L_0x0068:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.mo149663i(te3.lr3, boolean):rx3.l");
        }

        /* renamed from: k */
        public final void mo149664k(ViewGroup viewGroup, View view, int i) {
            C87412m.m108594g(viewGroup, "container");
            C87412m.m108594g(view, "redDotView");
            viewGroup.setClipToPadding(false);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.topMargin < 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), -layoutParams2.topMargin, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            if (layoutParams2.getMarginStart() < 0) {
                viewGroup.setPadding(-layoutParams2.getMarginStart(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            if (layoutParams2.getMarginEnd() < 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), -layoutParams2.getMarginEnd(), viewGroup.getPaddingBottom());
            }
            if (layoutParams2.bottomMargin < 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), -layoutParams2.bottomMargin);
            }
        }

        /* renamed from: l */
        public final void mo149665l(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3) {
            C87412m.m108594g(layoutParams, "layoutParam");
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            if (i != 0) {
                if (i == 1) {
                    layoutParams.gravity = 8388659;
                    int i4 = i2 + i3;
                    layoutParams.topMargin = i4;
                    layoutParams.setMarginStart(i4);
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        layoutParams.gravity = 8388691;
                        layoutParams.bottomMargin = i2 - i3;
                        layoutParams.setMarginStart(i2 + i3);
                        return;
                    } else if (i == 4) {
                        layoutParams.gravity = 8388693;
                        layoutParams.bottomMargin = i2 - i3;
                        layoutParams.setMarginEnd(i2 + i3);
                        return;
                    } else if (i == 6) {
                        layoutParams.gravity = 8388629;
                        layoutParams.setMarginEnd(i2 + i3);
                        return;
                    } else if (i == 7) {
                        layoutParams.gravity = 8388627;
                        layoutParams.setMarginStart(i2 + i3);
                        return;
                    } else {
                        return;
                    }
                }
            }
            layoutParams.gravity = 8388661;
            int i5 = i2 + i3;
            layoutParams.topMargin = i5;
            layoutParams.setMarginEnd(i5);
        }

        public final void setSplit(C105257e eVar) {
            C87412m.m108594g(eVar, "<set-?>");
            this.f312721d = eVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d */
    public static final class C105256d {

        /* renamed from: a */
        public boolean f312723a;

        /* renamed from: b */
        public int f312724b;

        /* renamed from: c */
        public boolean f312725c;

        public C105256d(boolean z, int i) {
            this.f312723a = z;
            this.f312724b = i;
        }

        /* renamed from: a */
        public static C105256d m141365a(C105256d dVar, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = dVar.f312723a;
            }
            if ((i2 & 2) != 0) {
                i = dVar.f312724b;
            }
            dVar.getClass();
            return new C105256d(z, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e */
    public static final class C105257e {

        /* renamed from: a */
        public final int f312726a;

        /* renamed from: b */
        public final ArrayList<C50301lr3> f312727b;

        public C105257e(int i, ArrayList<C50301lr3> arrayList) {
            C87412m.m108594g(arrayList, "nodes");
            this.f312726a = i;
            this.f312727b = arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C105257e)) {
                return false;
            }
            C105257e eVar = (C105257e) obj;
            return this.f312726a == eVar.f312726a && C87412m.m108589b(this.f312727b, eVar.f312727b);
        }

        public int hashCode() {
            return (this.f312726a * 31) + this.f312727b.hashCode();
        }

        public String toString() {
            return "SplitNode(style=" + this.f312726a + ", nodes=" + this.f312727b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$f */
    public final class C105258f extends C105255c {

        /* renamed from: f */
        public final /* synthetic */ RenderView f312728f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105258f(RenderView renderView, Context context) {
            super(renderView, context);
            C87412m.m108594g(context, "context");
            this.f312728f = renderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
            r7 = r7.f135628d;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo149670m(com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d r11, com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e r12) {
            /*
                r10 = this;
                java.lang.String r0 = "renderContext"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "split"
                gy3.C87412m.m108594g(r12, r0)
                r10.setSplit(r12)
                boolean r0 = r11.f312723a
                te3.lr3 r0 = r10.mo149655a(r0)
                r1 = 0
                if (r0 == 0) goto L_0x003f
                boolean r2 = r11.f312723a
                rx3.l r0 = r10.mo149663i(r0, r2)
                A r0 = r0.f38555d
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                rx3.l r0 = r10.mo149658d(r0)
                A r0 = r0.f38555d
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r2 = -2
                if (r0 != r2) goto L_0x0038
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r0 = r10.f312728f
                int r0 = r0.f312711e
            L_0x0038:
                int r0 = r0 + r1
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r2 = r10.f312728f
                int r2 = r2.f312714h
                int r0 = r0 + r2
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                android.widget.TextView r2 = new android.widget.TextView
                android.content.Context r3 = r10.getContext()
                r2.<init>(r3)
                int r3 = r11.f312724b
                int r3 = r3 - r0
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r4 = r10.f312728f
                int r4 = r4.f312711e
                int r4 = r3 - r4
                r5 = 1
                r6 = 0
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r11 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d.m141365a(r11, r1, r4, r5, r6)
                r11.f312725c = r5
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.CharSequence r11 = r10.mo149671n(r2, r11, r12)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r4 = r10.f312728f
                int r4 = r4.f312711e
                int r4 = r3 - r4
                r2.setMaxWidth(r4)
                r2.setText(r11)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                r2.measure(r11, r4)
                java.util.ArrayList<te3.lr3> r11 = r12.f312727b
                boolean r4 = r11 instanceof java.util.Collection
                if (r4 == 0) goto L_0x0085
                boolean r4 = r11.isEmpty()
                if (r4 == 0) goto L_0x0085
                r4 = 0
                goto L_0x00b0
            L_0x0085:
                java.util.Iterator r11 = r11.iterator()
                r4 = 0
            L_0x008a:
                boolean r7 = r11.hasNext()
                if (r7 == 0) goto L_0x00b0
                java.lang.Object r7 = r11.next()
                te3.lr3 r7 = (te3.C50301lr3) r7
                te3.ir3 r7 = r7.f137621f
                if (r7 == 0) goto L_0x00a4
                te3.qy r7 = r7.f135628d
                if (r7 == 0) goto L_0x00a4
                int r7 = r7.f140611f
                if (r7 != 0) goto L_0x00a4
                r7 = 1
                goto L_0x00a5
            L_0x00a4:
                r7 = 0
            L_0x00a5:
                if (r7 == 0) goto L_0x008a
                int r4 = r4 + 1
                if (r4 < 0) goto L_0x00ac
                goto L_0x008a
            L_0x00ac:
                sx3.C64197v.m75541j()
                throw r6
            L_0x00b0:
                java.util.ArrayList<te3.lr3> r11 = r12.f312727b
                boolean r7 = r11 instanceof java.util.Collection
                if (r7 == 0) goto L_0x00be
                boolean r7 = r11.isEmpty()
                if (r7 == 0) goto L_0x00be
                r7 = 0
                goto L_0x00e9
            L_0x00be:
                java.util.Iterator r11 = r11.iterator()
                r7 = 0
            L_0x00c3:
                boolean r8 = r11.hasNext()
                if (r8 == 0) goto L_0x00e9
                java.lang.Object r8 = r11.next()
                te3.lr3 r8 = (te3.C50301lr3) r8
                te3.ir3 r8 = r8.f137621f
                if (r8 == 0) goto L_0x00dd
                te3.qy r8 = r8.f135628d
                if (r8 == 0) goto L_0x00dd
                int r8 = r8.f140611f
                if (r8 != r5) goto L_0x00dd
                r8 = 1
                goto L_0x00de
            L_0x00dd:
                r8 = 0
            L_0x00de:
                if (r8 == 0) goto L_0x00c3
                int r7 = r7 + 1
                if (r7 < 0) goto L_0x00e5
                goto L_0x00c3
            L_0x00e5:
                sx3.C64197v.m75541j()
                throw r6
            L_0x00e9:
                java.util.ArrayList<te3.lr3> r11 = r12.f312727b
                boolean r12 = r11 instanceof java.util.Collection
                r8 = 2
                if (r12 == 0) goto L_0x00f7
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L_0x00f7
                goto L_0x0123
            L_0x00f7:
                java.util.Iterator r11 = r11.iterator()
                r12 = 0
            L_0x00fc:
                boolean r9 = r11.hasNext()
                if (r9 == 0) goto L_0x0122
                java.lang.Object r9 = r11.next()
                te3.lr3 r9 = (te3.C50301lr3) r9
                te3.ir3 r9 = r9.f137621f
                if (r9 == 0) goto L_0x0116
                te3.qy r9 = r9.f135628d
                if (r9 == 0) goto L_0x0116
                int r9 = r9.f140611f
                if (r9 != r8) goto L_0x0116
                r9 = 1
                goto L_0x0117
            L_0x0116:
                r9 = 0
            L_0x0117:
                if (r9 == 0) goto L_0x00fc
                int r12 = r12 + 1
                if (r12 < 0) goto L_0x011e
                goto L_0x00fc
            L_0x011e:
                sx3.C64197v.m75541j()
                throw r6
            L_0x0122:
                r1 = r12
            L_0x0123:
                r11 = 1000000000(0x3b9aca00, float:0.0047237873)
                if (r7 <= 0) goto L_0x0135
                if (r1 > 0) goto L_0x0135
                android.text.Layout r12 = r2.getLayout()
                int r12 = r12.getLineCount()
                if (r12 <= r5) goto L_0x0135
                goto L_0x014c
            L_0x0135:
                if (r1 > 0) goto L_0x0139
                if (r4 <= 0) goto L_0x0144
            L_0x0139:
                android.text.Layout r12 = r2.getLayout()
                int r12 = r12.getLineCount()
                if (r12 <= r8) goto L_0x0144
                goto L_0x014c
            L_0x0144:
                int r11 = r2.getMeasuredWidth()
                int r11 = java.lang.Math.min(r3, r11)
            L_0x014c:
                int r0 = r0 + r11
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105258f.mo149670m(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e):int");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x016b, code lost:
            if (r0 != null) goto L_0x016f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            r1 = r1.f135628d;
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x02d2  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x0463  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0548  */
        /* JADX WARNING: Removed duplicated region for block: B:234:0x055a  */
        /* JADX WARNING: Removed duplicated region for block: B:242:0x0590  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.CharSequence mo149671n(android.widget.TextView r32, com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d r33, com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e r34) {
            /*
                r31 = this;
                r9 = r31
                r10 = r33
                boolean r11 = r10.f312723a
                android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
                r12.<init>()
                r0 = r34
                java.util.ArrayList<te3.lr3> r0 = r0.f312727b
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r13 = r9.f312728f
                java.util.Iterator r14 = r0.iterator()
                r0 = 0
                r8 = 0
                r16 = 0
            L_0x0019:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L_0x05ad
                java.lang.Object r1 = r14.next()
                int r17 = r0 + 1
                if (r0 < 0) goto L_0x05a7
                r7 = r1
                te3.lr3 r7 = (te3.C50301lr3) r7
                if (r11 == 0) goto L_0x0035
                if (r7 == 0) goto L_0x003e
                te3.kr3 r0 = r7.f137620e
                if (r0 == 0) goto L_0x003e
                te3.h00 r0 = r0.f137020e
                goto L_0x003f
            L_0x0035:
                if (r7 == 0) goto L_0x003e
                te3.kr3 r0 = r7.f137620e
                if (r0 == 0) goto L_0x003e
                te3.h00 r0 = r0.f137019d
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L_0x0590
                te3.ir3 r1 = r7.f137621f
                if (r1 == 0) goto L_0x004e
                te3.qy r1 = r1.f135628d
                if (r1 == 0) goto L_0x004e
                te3.jr3 r1 = r1.f140610e
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r2 = r9.f312722e
                int r2 = r2.f312710d
                int r1 = r9.mo149656b(r1, r2)
                te3.ir3 r2 = r7.f137621f
                if (r2 == 0) goto L_0x0062
                te3.gk r2 = r2.f135629e
                if (r2 == 0) goto L_0x0062
                int r2 = r2.f134080d
                goto L_0x0063
            L_0x0062:
                r2 = 0
            L_0x0063:
                int r3 = r7.f137619d
                java.lang.String r6 = "Finder.RenderView"
                if (r3 != r4) goto L_0x0323
                te3.g00 r3 = r0.f134378g
                if (r3 == 0) goto L_0x0070
                java.lang.String r3 = r3.f133756e
                goto L_0x0071
            L_0x0070:
                r3 = 0
            L_0x0071:
                if (r3 == 0) goto L_0x007c
                int r3 = r3.length()
                if (r3 != 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                r3 = 0
                goto L_0x007d
            L_0x007c:
                r3 = 1
            L_0x007d:
                java.lang.String r18 = ""
                if (r3 != 0) goto L_0x0116
                java.lang.Class<f62.k0> r3 = f62.C75700k0.class
                k40.a r3 = f40.C86709a0.m107533q(r3)
                f62.k0 r3 = (f62.C75700k0) r3
                com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
                te3.g00 r15 = r0.f134378g
                if (r15 == 0) goto L_0x0095
                java.lang.String r15 = r15.f133756e
                if (r15 != 0) goto L_0x0097
            L_0x0095:
                r15 = r18
            L_0x0097:
                com.tencent.mm.storage.z1 r3 = r3.get(r15)
                if (r3 == 0) goto L_0x00a2
                java.lang.String r3 = r3.mo62898f()
                goto L_0x00a3
            L_0x00a2:
                r3 = 0
            L_0x00a3:
                if (r3 != 0) goto L_0x00a7
                r3 = r18
            L_0x00a7:
                int r15 = r3.length()
                if (r15 <= 0) goto L_0x00af
                r15 = 1
                goto L_0x00b0
            L_0x00af:
                r15 = 0
            L_0x00b0:
                if (r15 == 0) goto L_0x00e4
                te3.g00 r15 = r0.f134378g
                if (r15 == 0) goto L_0x00bc
                boolean r15 = r15.f133755d
                if (r15 != r4) goto L_0x00bc
                r15 = 1
                goto L_0x00bd
            L_0x00bc:
                r15 = 0
            L_0x00bd:
                if (r15 == 0) goto L_0x00e0
                r13.setFriendRemarkFlag(r5)
                if (r11 == 0) goto L_0x00d2
                te3.kr3 r15 = r7.f137620e
                if (r15 == 0) goto L_0x00cb
                te3.h00 r15 = r15.f137020e
                goto L_0x00cc
            L_0x00cb:
                r15 = 0
            L_0x00cc:
                if (r15 != 0) goto L_0x00cf
                goto L_0x00e8
            L_0x00cf:
                r15.f134375d = r3
                goto L_0x00e8
            L_0x00d2:
                te3.kr3 r15 = r7.f137620e
                if (r15 == 0) goto L_0x00d9
                te3.h00 r15 = r15.f137019d
                goto L_0x00da
            L_0x00d9:
                r15 = 0
            L_0x00da:
                if (r15 != 0) goto L_0x00dd
                goto L_0x00e8
            L_0x00dd:
                r15.f134375d = r3
                goto L_0x00e8
            L_0x00e0:
                r13.setFriendRemarkFlag(r4)
                goto L_0x00e8
            L_0x00e4:
                r15 = 0
                r13.setFriendRemarkFlag(r15)
            L_0x00e8:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r5 = "[composeSpannableString] name="
                r15.append(r5)
                java.lang.String r5 = r0.f134375d
                r15.append(r5)
                java.lang.String r5 = " remarkName="
                r15.append(r5)
                r15.append(r3)
                java.lang.String r3 = " username="
                r15.append(r3)
                te3.g00 r3 = r0.f134378g
                if (r3 == 0) goto L_0x010b
                java.lang.String r3 = r3.f133756e
                goto L_0x010c
            L_0x010b:
                r3 = 0
            L_0x010c:
                r15.append(r3)
                java.lang.String r3 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            L_0x0116:
                te3.g00 r3 = r0.f134378g
                if (r3 == 0) goto L_0x0120
                boolean r3 = r3.f133755d
                if (r3 != 0) goto L_0x0120
                r3 = 1
                goto L_0x0121
            L_0x0120:
                r3 = 0
            L_0x0121:
                if (r3 == 0) goto L_0x0126
                r13.setFriendRemarkFlag(r4)
            L_0x0126:
                android.text.SpannableString r3 = new android.text.SpannableString
                java.lang.Class<ny.h> r5 = p629ny.C76979h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ny.h r5 = (p629ny.C76979h) r5
                android.content.Context r15 = r31.getContext()
                java.lang.String r0 = r0.f134375d
                android.text.SpannableString r0 = r5.mo107057T1(r15, r0)
                r3.<init>(r0)
                r0 = 0
                r5 = 2
                r15 = 0
                int r4 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141353e(r9, r7, r0, r5, r15)
                te3.ir3 r0 = r7.f137621f
                if (r0 == 0) goto L_0x014f
                te3.gk r0 = r0.f135629e
                if (r0 == 0) goto L_0x014f
                te3.jr3 r15 = r0.f134081e
                goto L_0x0150
            L_0x014f:
                r15 = 0
            L_0x0150:
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r0 == 0) goto L_0x0167
                if (r15 == 0) goto L_0x015c
                java.lang.String r0 = r15.f136279e
                if (r0 != 0) goto L_0x016f
            L_0x015c:
                if (r15 == 0) goto L_0x0161
                java.lang.String r15 = r15.f136278d
                goto L_0x0162
            L_0x0161:
                r15 = 0
            L_0x0162:
                if (r15 != 0) goto L_0x0165
                goto L_0x016d
            L_0x0165:
                r0 = r15
                goto L_0x016f
            L_0x0167:
                if (r15 == 0) goto L_0x016d
                java.lang.String r0 = r15.f136278d
                if (r0 != 0) goto L_0x016f
            L_0x016d:
                r0 = r18
            L_0x016f:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r5 != 0) goto L_0x018f
                java.lang.String r5 = "#"
                r15 = 0
                boolean r5 = z04.C112551y.m153819s(r0, r5, r15)
                if (r5 != 0) goto L_0x018f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r15 = 35
                r5.append(r15)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
            L_0x018f:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r5 == 0) goto L_0x019b
                r27 = r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                goto L_0x01b5
            L_0x019b:
                int r0 = android.graphics.Color.parseColor(r0)
                int r5 = android.graphics.Color.blue(r0)
                int r15 = android.graphics.Color.green(r0)
                r27 = r8
                int r8 = android.graphics.Color.red(r0)
                int r0 = android.graphics.Color.alpha(r0)
                int r0 = android.graphics.Color.argb(r5, r0, r8, r15)
            L_0x01b5:
                r5 = 1056964608(0x3f000000, float:0.5)
                r8 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r8) goto L_0x02d2
                te3.ir3 r8 = r7.f137621f
                if (r8 == 0) goto L_0x01cb
                te3.gk r8 = r8.f135629e
                if (r8 == 0) goto L_0x01cb
                float r8 = r8.f134082f
                java.lang.Float r15 = java.lang.Float.valueOf(r8)
                goto L_0x01cc
            L_0x01cb:
                r15 = 0
            L_0x01cc:
                boolean r5 = gy3.C87412m.m108588a(r15, r5)
                if (r5 == 0) goto L_0x01d4
                r5 = r4
                goto L_0x01d6
            L_0x01d4:
                int r5 = r13.f312714h
            L_0x01d6:
                android.content.Context r8 = r31.getContext()
                android.content.res.Resources r8 = r8.getResources()
                r15 = 2131165283(0x7f070063, float:1.7944779E38)
                float r8 = r8.getDimension(r15)
                int r8 = (int) r8
                android.content.Context r15 = r31.getContext()
                android.content.res.Resources r15 = r15.getResources()
                r18 = r14
                r14 = 2131165280(0x7f070060, float:1.7944773E38)
                float r14 = r15.getDimension(r14)
                int r14 = (int) r14
                float r4 = (float) r4
                float r5 = (float) r5
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                int r15 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.f312709o
                r13.getClass()
                android.text.TextPaint r15 = new android.text.TextPaint
                r15.<init>()
                r28 = r12
                r12 = 1
                r15.setAntiAlias(r12)
                r15.setColor(r0)
                if (r2 == r12) goto L_0x0222
                r0 = 2
                if (r2 == r0) goto L_0x021e
                com.tencent.p014mm.p136ui.C85875k4.m106193l0(r15)
                goto L_0x0227
            L_0x021e:
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r15)
                goto L_0x0227
            L_0x0222:
                r0 = 1065353216(0x3f800000, float:1.0)
                com.tencent.p014mm.p136ui.C85875k4.m106189j0(r15, r0)
            L_0x0227:
                r15.setTextSize(r4)
                float r0 = r8.floatValue()
                int r2 = r3.length()
                r4 = 0
                float r2 = r15.measureText(r3, r4, r2)
                float r0 = r0 + r2
                float r2 = r8.floatValue()
                float r0 = r0 + r2
                float r2 = r14.floatValue()
                android.graphics.Paint$FontMetrics r4 = r15.getFontMetrics()
                float r4 = r4.bottom
                android.graphics.Paint$FontMetrics r12 = r15.getFontMetrics()
                float r12 = r12.top
                float r4 = r4 - r12
                float r2 = r2 + r4
                float r4 = r14.floatValue()
                float r2 = r2 + r4
                int r4 = (int) r0
                int r12 = (int) r2
                android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r12, r14)
                android.graphics.Canvas r12 = new android.graphics.Canvas
                r12.<init>(r4)
                android.graphics.RectF r14 = new android.graphics.RectF
                r29 = r6
                r6 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 - r6
                r30 = r11
                r11 = 0
                r14.<init>(r11, r6, r0, r2)
                r12.drawRoundRect(r14, r5, r5, r15)
                r15.setColor(r1)
                android.graphics.Paint$FontMetrics r0 = r15.getFontMetrics()
                float r0 = r0.bottom
                android.graphics.Paint$FontMetrics r1 = r15.getFontMetrics()
                float r1 = r1.top
                float r0 = r0 - r1
                r1 = 2
                float r2 = (float) r1
                float r0 = r0 / r2
                android.graphics.Paint$FontMetrics r1 = r15.getFontMetrics()
                float r1 = r1.bottom
                float r0 = r0 - r1
                float r1 = r14.centerY()
                float r25 = r1 + r0
                r22 = 0
                int r23 = r3.length()
                int r0 = r8.intValue()
                float r0 = (float) r0
                r20 = r12
                r21 = r3
                r24 = r0
                r26 = r15
                r20.drawText(r21, r22, r23, r24, r25, r26)
                android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r1 = r13.getResources()
                r0.<init>(r1, r4)
                float r1 = r14.width()
                int r1 = (int) r1
                float r2 = r14.height()
                int r2 = (int) r2
                r6 = 0
                r0.setBounds(r6, r6, r1, r2)
                go3.c r1 = new go3.c
                r2 = 1
                r1.<init>(r0, r2)
                android.text.SpannableString r3 = new android.text.SpannableString
                java.lang.String r0 = " $"
                r3.<init>(r0)
                r0 = 33
                r4 = 2
                r3.setSpan(r1, r2, r4, r0)
                goto L_0x0317
            L_0x02d2:
                r29 = r6
                r30 = r11
                r28 = r12
                r18 = r14
                r0 = 33
                r6 = 0
                android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
                r8.<init>(r1)
                int r1 = r3.length()
                r3.setSpan(r8, r6, r1, r0)
                te3.ir3 r0 = r7.f137621f
                if (r0 == 0) goto L_0x02f4
                te3.qy r0 = r0.f135628d
                if (r0 == 0) goto L_0x02f4
                int r0 = r0.f140612g
                goto L_0x02f5
            L_0x02f4:
                r0 = 0
            L_0x02f5:
                r1 = 2
                if (r0 == r1) goto L_0x0308
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$AlignAbsoluteSizeSpan r0 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$AlignAbsoluteSizeSpan
                r0.<init>(r4, r5, r2)
                int r1 = r3.length()
                r5 = 33
                r6 = 0
                r3.setSpan(r0, r6, r1, r5)
                goto L_0x0317
            L_0x0308:
                r5 = 33
                r6 = 0
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$FontWeightAbsoluteSizeSpan r0 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$FontWeightAbsoluteSizeSpan
                r0.<init>(r4, r2)
                int r1 = r3.length()
                r3.setSpan(r0, r6, r1, r5)
            L_0x0317:
                r6 = r3
                r14 = r7
                r21 = r13
                r13 = r27
                r12 = r29
                r19 = 0
                goto L_0x0436
            L_0x0323:
                r29 = r6
                r27 = r8
                r30 = r11
                r28 = r12
                r18 = r14
                r0 = 2
                if (r3 != r0) goto L_0x042b
                r2 = 0
                r6 = 0
                int r3 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141353e(r9, r7, r2, r0, r6)
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
                android.graphics.Canvas r2 = new android.graphics.Canvas
                r2.<init>(r0)
                android.content.res.Resources r4 = r31.getResources()
                r5 = 2131231874(0x7f080482, float:1.8079841E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r6)
                r4.draw(r2)
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r4 = r31.getResources()
                r2.<init>(r4, r0)
                com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141348b(r13, r2, r1)
                r0 = 0
                r2.setBounds(r0, r0, r3, r3)
                go3.c r1 = new go3.c
                r5 = 2
                r1.<init>(r2, r5)
                android.text.SpannableString r11 = new android.text.SpannableString
                java.lang.String r3 = "$"
                r11.<init>(r3)
                r3 = 33
                r4 = 1
                r11.setSpan(r1, r0, r4, r3)
                boolean r0 = r10.f312725c
                if (r0 != 0) goto L_0x041d
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
                r12 = r32
                r8.<init>(r12)
                java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                r14 = r30
                java.lang.String r15 = r9.mo149660g(r7, r14)
                int r3 = r15.length()
                if (r3 != 0) goto L_0x038f
                r3 = 1
                goto L_0x0390
            L_0x038f:
                r3 = 0
            L_0x0390:
                if (r3 == 0) goto L_0x03a1
                r19 = r6
                r20 = r11
                r21 = r13
                r30 = r14
                r13 = r27
                r12 = r29
                r14 = r7
                goto L_0x0428
            L_0x03a1:
                r34 = r7
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "[asyncLoadIcon] isShort="
                r3.append(r4)
                r3.append(r14)
                java.lang.String r4 = " token="
                r3.append(r4)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                r4 = r29
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                bl3.r r3 = bl3.C39818r.f106831a
                bl3.r$a r5 = r3.mo62446e(r1)
                bl3.c r5 = r5.mo62447c(r0)
                pl1.s0 r5 = (pl1.C11990s0) r5
                k60.d r5 = r5.mo11871f2()
                pl1.n0 r4 = new pl1.n0
                r20 = r11
                up1.y r11 = up1.C27696y.THUMB_IMAGE
                r4.<init>(r15, r11)
                pl1.e0$a r11 = pl1.C11978e0.C11979a.LINK_THUMB
                bl3.r$a r1 = r3.mo62446e(r1)
                bl3.c r0 = r1.mo62447c(r0)
                pl1.s0 r0 = (pl1.C11990s0) r0
                n60.f r0 = r0.mo11867O2(r11)
                l60.b r11 = r5.mo85956b(r4, r0)
                com.tencent.mm.plugin.finder.extension.reddot.render.g r5 = new com.tencent.mm.plugin.finder.extension.reddot.render.g
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r3 = r9.f312722e
                r0 = r5
                r1 = r2
                r2 = r3
                r3 = r31
                r21 = r29
                r9 = 1
                r4 = r34
                r9 = r5
                r12 = 2
                r5 = r8
                r8 = r34
                r12 = r21
                r19 = 0
                r21 = r13
                r30 = r14
                r13 = r27
                r14 = r8
                r8 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r8)
                r11.getClass()
                r11.f291320d = r9
                r11.mo85951a()
                goto L_0x0428
            L_0x041d:
                r19 = r6
                r14 = r7
                r20 = r11
                r21 = r13
                r13 = r27
                r12 = r29
            L_0x0428:
                r6 = r20
                goto L_0x0436
            L_0x042b:
                r14 = r7
                r21 = r13
                r13 = r27
                r12 = r29
                r19 = 0
                r6 = r19
            L_0x0436:
                if (r6 == 0) goto L_0x058d
                te3.ir3 r0 = r14.f137621f
                if (r0 == 0) goto L_0x0446
                te3.qy r1 = r0.f135628d
                if (r1 == 0) goto L_0x0446
                int r1 = r1.f140611f
                if (r1 != 0) goto L_0x0446
                r4 = 1
                goto L_0x0447
            L_0x0446:
                r4 = 0
            L_0x0447:
                if (r4 == 0) goto L_0x0450
                r7 = r28
                r7.append(r6)
                goto L_0x0598
            L_0x0450:
                r7 = r28
                if (r0 == 0) goto L_0x045f
                te3.qy r1 = r0.f135628d
                if (r1 == 0) goto L_0x045f
                int r1 = r1.f140611f
                r2 = 1
                if (r1 != r2) goto L_0x0460
                r4 = 1
                goto L_0x0461
            L_0x045f:
                r2 = 1
            L_0x0460:
                r4 = 0
            L_0x0461:
                if (r4 == 0) goto L_0x0548
                if (r13 <= r2) goto L_0x0489
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "throw this node. "
                r0.append(r1)
                te3.kr3 r1 = r14.f137620e
                if (r1 == 0) goto L_0x047b
                te3.h00 r1 = r1.f137019d
                if (r1 == 0) goto L_0x047b
                java.lang.String r6 = r1.f134375d
                goto L_0x047d
            L_0x047b:
                r6 = r19
            L_0x047d:
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                goto L_0x0598
            L_0x0489:
                if (r16 != 0) goto L_0x0598
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>(r7)
                android.text.SpannableStringBuilder r0 = r0.append(r6)
                android.text.TextPaint r1 = r32.getPaint()
                int r2 = r0.length()
                r3 = 0
                float r1 = r1.measureText(r0, r3, r2)
                int r2 = r10.f312724b
                float r2 = (float) r2
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 > 0) goto L_0x0541
                int r2 = r0.length()
                if (r2 <= 0) goto L_0x04b0
                r4 = 1
                goto L_0x04b1
            L_0x04b0:
                r4 = 0
            L_0x04b1:
                if (r4 == 0) goto L_0x0541
                int r2 = r0.length()
                float[] r2 = new float[r2]
                android.text.TextPaint r3 = r32.getPaint()
                int r4 = r0.length()
                r5 = 0
                r3.getTextWidths(r0, r5, r4, r2)
                android.text.TextPaint r3 = r32.getPaint()
                java.lang.String r4 = "…"
                float r3 = r3.measureText(r4)
                int r4 = r10.f312724b
                float r4 = (float) r4
                float r4 = r1 - r4
                int r5 = r0.length()
                r8 = 1
                int r5 = r5 - r8
            L_0x04db:
                r6 = -1
                if (r6 >= r5) goto L_0x04f8
                r6 = r2[r5]
                float r4 = r4 - r6
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 >= 0) goto L_0x04f5
                float r9 = java.lang.Math.abs(r4)
                int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r9 < 0) goto L_0x04f5
                if (r5 <= r8) goto L_0x04f3
                int r2 = r5 + -1
                goto L_0x04f9
            L_0x04f3:
                r2 = r5
                goto L_0x04f9
            L_0x04f5:
                int r5 = r5 + -1
                goto L_0x04db
            L_0x04f8:
                r2 = 0
            L_0x04f9:
                if (r2 <= 0) goto L_0x053a
                boolean r3 = r10.f312725c
                if (r3 != 0) goto L_0x053a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "end="
                r3.append(r4)
                r3.append(r2)
                java.lang.String r4 = " currentWidth="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " maxWidth="
                r3.append(r1)
                int r1 = r10.f312724b
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                r7.clear()
                r1 = 0
                java.lang.CharSequence r0 = r0.subSequence(r1, r2)
                android.text.SpannableStringBuilder r0 = r7.append(r0)
                r1 = 8230(0x2026, float:1.1533E-41)
                r0.append(r1)
                r8 = 0
                r16 = 1
                goto L_0x0599
            L_0x053a:
                r7.clear()
                r7.append(r0)
                goto L_0x0598
            L_0x0541:
                r7.clear()
                r7.append(r0)
                goto L_0x0598
            L_0x0548:
                r8 = 1
                if (r0 == 0) goto L_0x0556
                te3.qy r0 = r0.f135628d
                if (r0 == 0) goto L_0x0556
                int r0 = r0.f140611f
                r9 = 2
                if (r0 != r9) goto L_0x0557
                r4 = 1
                goto L_0x0558
            L_0x0556:
                r9 = 2
            L_0x0557:
                r4 = 0
            L_0x0558:
                if (r4 == 0) goto L_0x0598
                android.text.TextPaint r0 = r32.getPaint()
                int r1 = r7.length()
                r8 = 0
                float r0 = r0.measureText(r7, r8, r1)
                int r1 = r10.f312724b
                float r1 = (float) r1
                float r0 = r0 / r1
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0588
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                java.lang.String r1 = "\n"
                r0 = r7
                int r0 = z04.C112550d0.m153769E(r0, r1, r2, r3, r4, r5)
                if (r0 >= 0) goto L_0x0588
                java.lang.String r0 = "\n"
                android.text.SpannableStringBuilder r0 = r7.append(r0)
                r0.append(r6)
                goto L_0x058b
            L_0x0588:
                r7.append(r6)
            L_0x058b:
                r13 = 2
                goto L_0x0599
            L_0x058d:
                r7 = r28
                goto L_0x0598
            L_0x0590:
                r30 = r11
                r7 = r12
                r21 = r13
                r18 = r14
                r13 = r8
            L_0x0598:
                r8 = 0
            L_0x0599:
                r9 = r31
                r12 = r7
                r8 = r13
                r0 = r17
                r14 = r18
                r13 = r21
                r11 = r30
                goto L_0x0019
            L_0x05a7:
                r19 = 0
                sx3.C64197v.m75542k()
                throw r19
            L_0x05ad:
                r7 = r12
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105258f.mo149671n(android.widget.TextView, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e):java.lang.CharSequence");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
            if (r2 != 3) goto L_0x00fb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01b1 A[LOOP:2: B:84:0x01b1->B:138:0x01b1, LOOP_END, PHI: r3 
          PHI: (r3v16 int) = (r3v15 int), (r3v17 int) binds: [B:142:0x01b1, B:143:0x01b1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x020c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x017f  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01ac  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo149672o(com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d r18, com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e r19) {
            /*
                r17 = this;
                r6 = r17
                r7 = r18
                r8 = r19
                java.lang.String r0 = "renderContext"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "split"
                gy3.C87412m.m108594g(r8, r0)
                r6.setSplit(r8)
                boolean r9 = r7.f312723a
                te3.lr3 r10 = r6.mo149655a(r9)
                r11 = 3
                r12 = 2
                r13 = -2
                r14 = 1
                r15 = 0
                if (r10 == 0) goto L_0x00b4
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r17
                r1 = r10
                r2 = r9
                int r0 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105255c.m141354j(r0, r1, r2, r3, r4, r5)
                rx3.l r1 = r6.mo149663i(r10, r9)
                A r2 = r1.f38555d
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r1 = r1.f38556e
                java.lang.String r1 = (java.lang.String) r1
                rx3.l r3 = r6.mo149658d(r2)
                A r4 = r3.f38555d
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                B r3 = r3.f38556e
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                android.widget.ImageView r5 = new android.widget.ImageView
                android.content.Context r9 = r17.getContext()
                r5.<init>(r9)
                android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
                r9.<init>(r4, r3)
                if (r4 != r13) goto L_0x0065
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r3 = r6.f312728f
                int r3 = r3.f312711e
                goto L_0x0066
            L_0x0065:
                r3 = r4
            L_0x0066:
                int r10 = -r3
                int r10 = r10 / r12
                r6.mo149665l(r9, r0, r15, r10)
                if (r0 == r12) goto L_0x0074
                r10 = 4
                if (r0 == r10) goto L_0x0074
                r10 = 6
                if (r0 == r10) goto L_0x0074
                goto L_0x0084
            L_0x0074:
                int r10 = r9.getMarginEnd()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r13 = r6.f312728f
                int r13 = r13.f312714h
                int r16 = r3 / 2
                int r13 = r13 + r16
                int r10 = r10 - r13
                r9.setMarginEnd(r10)
            L_0x0084:
                if (r0 == r14) goto L_0x008c
                if (r0 == r11) goto L_0x008c
                r10 = 7
                if (r0 == r10) goto L_0x008c
                goto L_0x009a
            L_0x008c:
                int r0 = r9.getMarginStart()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r10 = r6.f312728f
                int r10 = r10.f312714h
                int r3 = r3 / r12
                int r10 = r10 + r3
                int r0 = r0 - r10
                r9.setMarginStart(r0)
            L_0x009a:
                r5.setLayoutParams(r9)
                r6.mo149662h(r5, r1, r2)
                r6.mo149664k(r6, r5, r15)
                r6.addView(r5)
                r0 = -2
                if (r4 != r0) goto L_0x00ad
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r0 = r6.f312728f
                int r4 = r0.f312711e
            L_0x00ad:
                int r4 = r4 + r15
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r0 = r6.f312728f
                int r0 = r0.f312714h
                int r4 = r4 + r0
                goto L_0x00b5
            L_0x00b4:
                r4 = 0
            L_0x00b5:
                android.widget.TextView r0 = new android.widget.TextView
                android.content.Context r1 = r17.getContext()
                r0.<init>(r1)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r1 = r6.f312728f
                r2 = 2131301221(0x7f091365, float:1.8220494E38)
                r0.setId(r2)
                java.util.ArrayList<te3.lr3> r2 = r8.f312727b
                java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
                te3.lr3 r2 = (te3.C50301lr3) r2
                java.lang.String r3 = "node"
                gy3.C87412m.m108594g(r2, r3)
                te3.ir3 r2 = r2.f137621f
                if (r2 == 0) goto L_0x00de
                te3.gk r2 = r2.f135629e
                if (r2 == 0) goto L_0x00de
                int r2 = r2.f134085i
                goto L_0x00df
            L_0x00de:
                r2 = 0
            L_0x00df:
                if (r2 == 0) goto L_0x00f5
                if (r2 == r14) goto L_0x00ee
                if (r2 == r12) goto L_0x00e8
                if (r2 == r11) goto L_0x00f5
                goto L_0x00fb
            L_0x00e8:
                r2 = 17
                r0.setGravity(r2)
                goto L_0x00fb
            L_0x00ee:
                r2 = 8388627(0x800013, float:1.175497E-38)
                r0.setGravity(r2)
                goto L_0x00fb
            L_0x00f5:
                r2 = 8388629(0x800015, float:1.1754973E-38)
                r0.setGravity(r2)
            L_0x00fb:
                int r2 = r7.f312724b
                int r2 = r2 - r4
                int r3 = r1.f312711e
                int r3 = r2 - r3
                r4 = 0
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r3 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d.m141365a(r7, r15, r3, r14, r4)
                java.lang.CharSequence r3 = r6.mo149671n(r0, r3, r8)
                r0.setText(r3)
                java.util.ArrayList<te3.lr3> r5 = r8.f312727b
                boolean r7 = r5 instanceof java.util.Collection
                if (r7 == 0) goto L_0x011c
                boolean r7 = r5.isEmpty()
                if (r7 == 0) goto L_0x011c
                r7 = 0
                goto L_0x0147
            L_0x011c:
                java.util.Iterator r5 = r5.iterator()
                r7 = 0
            L_0x0121:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x0147
                java.lang.Object r9 = r5.next()
                te3.lr3 r9 = (te3.C50301lr3) r9
                te3.ir3 r9 = r9.f137621f
                if (r9 == 0) goto L_0x013b
                te3.qy r9 = r9.f135628d
                if (r9 == 0) goto L_0x013b
                int r9 = r9.f140611f
                if (r9 != r14) goto L_0x013b
                r9 = 1
                goto L_0x013c
            L_0x013b:
                r9 = 0
            L_0x013c:
                if (r9 == 0) goto L_0x0121
                int r7 = r7 + 1
                if (r7 < 0) goto L_0x0143
                goto L_0x0121
            L_0x0143:
                sx3.C64197v.m75541j()
                throw r4
            L_0x0147:
                java.util.ArrayList<te3.lr3> r5 = r8.f312727b
                int r5 = r5.size()
                if (r7 != r5) goto L_0x0151
                r5 = 1
                goto L_0x0152
            L_0x0151:
                r5 = 2
            L_0x0152:
                r0.setMaxLines(r5)
                r5 = 8230(0x2026, float:1.1533E-41)
                boolean r3 = z04.C112550d0.m153804x(r3, r5, r15, r12, r4)
                if (r3 != 0) goto L_0x0163
                android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
                r0.setEllipsize(r3)
                goto L_0x0166
            L_0x0163:
                r1.setRenderState(r11)
            L_0x0166:
                int r3 = r1.f312711e
                int r2 = r2 - r3
                r0.setMaxWidth(r2)
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                r3 = -2
                r2.<init>(r3, r3)
                r0.setLayoutParams(r2)
                java.util.List r2 = sx3.C26236u.m33719b(r19)
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L_0x0181
                r5 = 0
                goto L_0x01a4
            L_0x0181:
                java.util.Iterator r3 = r2.iterator()
                r5 = 0
            L_0x0186:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x01a4
                java.lang.Object r7 = r3.next()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r7 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r7
                int r7 = r7.f312726a
                if (r7 != r14) goto L_0x0198
                r7 = 1
                goto L_0x0199
            L_0x0198:
                r7 = 0
            L_0x0199:
                if (r7 == 0) goto L_0x0186
                int r5 = r5 + 1
                if (r5 < 0) goto L_0x01a0
                goto L_0x0186
            L_0x01a0:
                sx3.C64197v.m75541j()
                throw r4
            L_0x01a4:
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L_0x01ac
                r3 = 0
                goto L_0x0210
            L_0x01ac:
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            L_0x01b1:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0210
                java.lang.Object r7 = r2.next()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r7 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r7
                int r8 = r7.f312726a
                if (r8 != r14) goto L_0x0204
                java.util.ArrayList<te3.lr3> r8 = r7.f312727b
                boolean r9 = r8 instanceof java.util.Collection
                if (r9 == 0) goto L_0x01cf
                boolean r9 = r8.isEmpty()
                if (r9 == 0) goto L_0x01cf
                r9 = 0
                goto L_0x01fa
            L_0x01cf:
                java.util.Iterator r8 = r8.iterator()
                r9 = 0
            L_0x01d4:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x01fa
                java.lang.Object r10 = r8.next()
                te3.lr3 r10 = (te3.C50301lr3) r10
                te3.ir3 r10 = r10.f137621f
                if (r10 == 0) goto L_0x01ee
                te3.qy r10 = r10.f135628d
                if (r10 == 0) goto L_0x01ee
                int r10 = r10.f140611f
                if (r10 != 0) goto L_0x01ee
                r10 = 1
                goto L_0x01ef
            L_0x01ee:
                r10 = 0
            L_0x01ef:
                if (r10 == 0) goto L_0x01d4
                int r9 = r9 + 1
                if (r9 < 0) goto L_0x01f6
                goto L_0x01d4
            L_0x01f6:
                sx3.C64197v.m75541j()
                throw r4
            L_0x01fa:
                java.util.ArrayList<te3.lr3> r7 = r7.f312727b
                int r7 = r7.size()
                if (r9 != r7) goto L_0x0204
                r7 = 1
                goto L_0x0205
            L_0x0204:
                r7 = 0
            L_0x0205:
                if (r7 == 0) goto L_0x01b1
                int r3 = r3 + 1
                if (r3 < 0) goto L_0x020c
                goto L_0x01b1
            L_0x020c:
                sx3.C64197v.m75541j()
                throw r4
            L_0x0210:
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r15)
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r15)
                r0.measure(r2, r4)
                android.text.Layout r2 = r0.getLayout()
                int r4 = r2.getLineCount()
                int r4 = r4 - r14
                int r4 = r2.getEllipsisCount(r4)
                java.lang.String r7 = "Finder.RenderView"
                if (r4 <= 0) goto L_0x024e
                r1.f312716j = r11
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "[optTextView] lineCount="
                r8.append(r9)
                int r9 = r2.getLineCount()
                r8.append(r9)
                java.lang.String r9 = " ellipsisCount="
                r8.append(r9)
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
            L_0x024e:
                if (r5 != r14) goto L_0x02a9
                if (r3 != r5) goto L_0x02a9
                int r3 = r2.getLineCount()
                if (r3 < r12) goto L_0x02a9
                float r3 = r2.getLineWidth(r15)
                float r2 = r2.getLineWidth(r14)
                float r4 = r2 + r3
                float r5 = (float) r12
                float r4 = r4 / r5
                int r1 = r1.f312712f
                float r1 = (float) r1
                float r4 = r4 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "[optTextView] first="
                r1.append(r5)
                r1.append(r3)
                java.lang.String r3 = " second="
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = " maxWidth=["
                r1.append(r2)
                int r2 = r0.getMaxWidth()
                r1.append(r2)
                java.lang.String r2 = " -> "
                r1.append(r2)
                r1.append(r4)
                r2 = 93
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
                int r1 = r0.getMaxWidth()
                int r2 = (int) r4
                int r1 = java.lang.Math.min(r1, r2)
                r0.setMaxWidth(r1)
            L_0x02a9:
                r6.addView(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105258f.mo149672o(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e):void");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$setRenderNodes$1", mo125469f = "RenderView.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$g */
    public static final class C105259g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f312729d;

        /* renamed from: e */
        public final /* synthetic */ RenderView f312730e;

        /* renamed from: f */
        public final /* synthetic */ List<C50301lr3> f312731f;

        /* renamed from: g */
        public final /* synthetic */ int f312732g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$setRenderNodes$1$4", mo125469f = "RenderView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$g$a */
        public static final class C105260a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ArrayList<View> f312733d;

            /* renamed from: e */
            public final /* synthetic */ RenderView f312734e;

            /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$g$a$a */
            public static final class C105261a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ RenderView f312735d;

                public C105261a(RenderView renderView) {
                    this.f312735d = renderView;
                }

                public final void run() {
                    Log.m105924i("Finder.RenderView", "maxWidth=" + this.f312735d.getWidth() + " textMaxWidth=" + ((TextView) this.f312735d.findViewById(C0966R.C0970id.nko)).getMaxWidth());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105260a(ArrayList<View> arrayList, RenderView renderView, C15601d<? super C105260a> dVar) {
                super(2, dVar);
                this.f312733d = arrayList;
                this.f312734e = renderView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105260a(this.f312733d, this.f312734e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105260a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                ArrayList<View> arrayList = this.f312733d;
                RenderView renderView = this.f312734e;
                for (View addView : arrayList) {
                    renderView.addView(addView);
                }
                RenderView renderView2 = this.f312734e;
                renderView2.post(new C105261a(renderView2));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105259g(RenderView renderView, List<? extends C50301lr3> list, int i, C15601d<? super C105259g> dVar) {
            super(2, dVar);
            this.f312730e = renderView;
            this.f312731f = list;
            this.f312732g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105259g(this.f312730e, this.f312731f, this.f312732g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105259g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0207  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x022b  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x0341 A[LOOP:8: B:131:0x033b->B:133:0x0341, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0372 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01c4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f312729d
                r3 = 1
                if (r2 == 0) goto L_0x0018
                if (r2 != r3) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r25)
                goto L_0x0373
            L_0x0010:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r25)
                long r4 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r2 = r0.f312730e
                java.util.List<te3.lr3> r6 = r0.f312731f
                int r7 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.f312709o
                r2.getClass()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r7 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r9 = 0
                r7.<init>(r9, r8)
                int r8 = r6.size()
                r10 = 2
                r11 = 3
                if (r8 != r10) goto L_0x0090
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r12 = r6.iterator()
            L_0x0049:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x0063
                java.lang.Object r13 = r12.next()
                r14 = r13
                te3.lr3 r14 = (te3.C50301lr3) r14
                int r14 = r14.f137619d
                if (r14 != r3) goto L_0x005c
                r14 = 1
                goto L_0x005d
            L_0x005c:
                r14 = 0
            L_0x005d:
                if (r14 == 0) goto L_0x0049
                r8.add(r13)
                goto L_0x0049
            L_0x0063:
                int r8 = r8.size()
                int r12 = r6.size()
                if (r8 != r12) goto L_0x0090
                java.util.Iterator r6 = r6.iterator()
            L_0x0071:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x00d9
                java.lang.Object r7 = r6.next()
                te3.lr3 r7 = (te3.C50301lr3) r7
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r8 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                r8.<init>(r3, r12)
                r2.add(r8)
                java.util.ArrayList<te3.lr3> r8 = r8.f312727b
                r8.add(r7)
                goto L_0x0071
            L_0x0090:
                java.util.Iterator r6 = r6.iterator()
            L_0x0094:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00d9
                java.lang.Object r8 = r6.next()
                te3.lr3 r8 = (te3.C50301lr3) r8
                int r12 = r8.f137619d
                if (r12 == r10) goto L_0x00bc
                if (r12 != r3) goto L_0x00a7
                goto L_0x00bc
            L_0x00a7:
                if (r12 != r11) goto L_0x0094
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r7 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                r7.<init>(r11, r12)
                r2.add(r7)
                java.util.ArrayList<te3.lr3> r12 = r7.f312727b
                r12.add(r8)
                goto L_0x0094
            L_0x00bc:
                int r12 = r7.f312726a
                if (r12 != r3) goto L_0x00c6
                java.util.ArrayList<te3.lr3> r12 = r7.f312727b
                r12.add(r8)
                goto L_0x0094
            L_0x00c6:
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r7 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                r7.<init>(r3, r12)
                r2.add(r7)
                java.util.ArrayList<te3.lr3> r12 = r7.f312727b
                r12.add(r8)
                goto L_0x0094
            L_0x00d9:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00e2:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x00fc
                java.lang.Object r7 = r2.next()
                r8 = r7
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r8 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r8
                int r8 = r8.f312726a
                if (r8 == 0) goto L_0x00f5
                r8 = 1
                goto L_0x00f6
            L_0x00f5:
                r8 = 0
            L_0x00f6:
                if (r8 == 0) goto L_0x00e2
                r6.add(r7)
                goto L_0x00e2
            L_0x00fc:
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r2 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d
                int r7 = r0.f312732g
                r2.<init>(r9, r7)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r7 = r0.f312730e
                int r7 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141347a(r7, r2, r11, r6)
                boolean r8 = r6.isEmpty()
                r12 = 0
                if (r8 == 0) goto L_0x0112
                r13 = 0
                goto L_0x0135
            L_0x0112:
                java.util.Iterator r8 = r6.iterator()
                r13 = 0
            L_0x0117:
                boolean r14 = r8.hasNext()
                if (r14 == 0) goto L_0x0135
                java.lang.Object r14 = r8.next()
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r14 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r14
                int r14 = r14.f312726a
                if (r14 != r3) goto L_0x0129
                r14 = 1
                goto L_0x012a
            L_0x0129:
                r14 = 0
            L_0x012a:
                if (r14 == 0) goto L_0x0117
                int r13 = r13 + 1
                if (r13 < 0) goto L_0x0131
                goto L_0x0117
            L_0x0131:
                sx3.C64197v.m75541j()
                throw r12
            L_0x0135:
                int r8 = r6.size()
                if (r13 != r8) goto L_0x0143
                int r8 = r6.size()
                if (r8 != r10) goto L_0x0143
                r8 = 1
                goto L_0x0144
            L_0x0143:
                r8 = 0
            L_0x0144:
                gy3.d0 r13 = new gy3.d0
                r13.<init>()
                int r14 = r0.f312732g
                int r14 = r14 - r7
                r13.f27483d = r14
                gy3.d0 r14 = new gy3.d0
                r14.<init>()
                if (r8 == 0) goto L_0x0190
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r15 = r0.f312730e
                int r11 = r6.size()
                java.util.ListIterator r11 = r6.listIterator(r11)
            L_0x015f:
                boolean r16 = r11.hasPrevious()
                if (r16 == 0) goto L_0x0188
                java.lang.Object r16 = r11.previous()
                r10 = r16
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r10 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r10
                int r10 = r10.f312726a
                if (r10 != r3) goto L_0x0173
                r10 = 1
                goto L_0x0174
            L_0x0173:
                r10 = 0
            L_0x0174:
                if (r10 == 0) goto L_0x0186
                java.util.List r10 = sx3.C26236u.m33719b(r16)
                int r10 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141347a(r15, r2, r3, r10)
                r14.f27483d = r10
                int r11 = r0.f312732g
                int r11 = r11 - r10
                r13.f27483d = r11
                goto L_0x0190
            L_0x0186:
                r10 = 2
                goto L_0x015f
            L_0x0188:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "List contains no element matching the predicate."
                r1.<init>(r2)
                throw r1
            L_0x0190:
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r10 = r0.f312730e
                int r11 = r13.f27483d
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r11 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d.m141365a(r2, r9, r11, r3, r12)
                if (r8 == 0) goto L_0x01c4
                java.util.Iterator r15 = r6.iterator()
            L_0x019e:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x01bc
                java.lang.Object r16 = r15.next()
                r9 = r16
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r9 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r9
                int r9 = r9.f312726a
                if (r9 != r3) goto L_0x01b2
                r9 = 1
                goto L_0x01b3
            L_0x01b2:
                r9 = 0
            L_0x01b3:
                if (r9 == 0) goto L_0x01ba
                java.util.List r9 = sx3.C26236u.m33719b(r16)
                goto L_0x01c5
            L_0x01ba:
                r9 = 0
                goto L_0x019e
            L_0x01bc:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Collection contains no element matching the predicate."
                r1.<init>(r2)
                throw r1
            L_0x01c4:
                r9 = r6
            L_0x01c5:
                int r9 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141347a(r10, r11, r3, r9)
                int r10 = r0.f312732g
                int r11 = r10 - r7
                java.lang.String r15 = " avatarWidth="
                java.lang.String r12 = "Finder.RenderView"
                if (r11 <= 0) goto L_0x01d9
                int r10 = r10 - r7
                int r11 = r14.f27483d
                int r10 = r10 - r11
                if (r9 <= r10) goto L_0x0205
            L_0x01d9:
                r2.f312723a = r3
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r10 = r0.f312730e
                r11 = 2
                r10.setRenderState(r11)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "[setRenderNodes] try use thumbnail. maxWidth="
                r10.append(r11)
                int r11 = r0.f312732g
                r10.append(r11)
                r10.append(r15)
                r10.append(r7)
                java.lang.String r11 = " textWidth="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r9)
            L_0x0205:
                if (r8 != 0) goto L_0x0213
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r7 = r0.f312730e
                r9 = 3
                int r7 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141347a(r7, r2, r9, r6)
                int r9 = r0.f312732g
                int r9 = r9 - r7
                r13.f27483d = r9
            L_0x0213:
                java.util.ArrayList r9 = new java.util.ArrayList
                java.util.List<te3.lr3> r10 = r0.f312731f
                int r10 = r10.size()
                r9.<init>(r10)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r10 = r0.f312730e
                java.util.Iterator r11 = r6.iterator()
                r3 = 0
            L_0x0225:
                boolean r18 = r11.hasNext()
                if (r18 == 0) goto L_0x02ef
                java.lang.Object r18 = r11.next()
                r19 = r11
                int r11 = r3 + 1
                if (r3 < 0) goto L_0x02ea
                r20 = r1
                r1 = r18
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r1
                r18 = r12
                int r12 = r1.f312726a
                r21 = r7
                java.lang.String r7 = "context"
                r22 = r15
                r15 = 3
                if (r12 != r15) goto L_0x0275
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$a r12 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$a
                android.content.Context r15 = r10.getContext()
                gy3.C87412m.m108593f(r15, r7)
                r12.<init>(r10, r15)
                r12.mo149654o(r2, r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r7 = -2
                r1.<init>(r7, r7)
                r7 = 17
                r1.gravity = r7
                int r7 = r6.size()
                r15 = 1
                int r7 = r7 - r15
                if (r3 == r7) goto L_0x026e
                int r3 = r10.f312714h
                r1.setMarginEnd(r3)
            L_0x026e:
                r12.setLayoutParams(r1)
                r9.add(r12)
                goto L_0x02d4
            L_0x0275:
                r15 = 1
                if (r12 != r15) goto L_0x02d4
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$f r12 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$f
                android.content.Context r15 = r10.getContext()
                gy3.C87412m.m108593f(r15, r7)
                r12.<init>(r10, r15)
                if (r8 == 0) goto L_0x029d
                r7 = 1
                if (r3 != r7) goto L_0x029d
                int r15 = r14.f27483d
                int r7 = r10.f312711e
                int r15 = r15 + r7
                r17 = r8
                r23 = r14
                r7 = 0
                r8 = 0
                r14 = 1
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r15 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d.m141365a(r2, r8, r15, r14, r7)
                r12.mo149672o(r15, r1)
                goto L_0x02ad
            L_0x029d:
                r17 = r8
                r23 = r14
                r7 = 0
                r8 = 0
                r14 = 1
                int r15 = r13.f27483d
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$d r15 = com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105256d.m141365a(r2, r8, r15, r14, r7)
                r12.mo149672o(r15, r1)
            L_0x02ad:
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r7 = -2
                r1.<init>(r7, r7)
                r7 = 17
                r1.gravity = r7
                int r7 = r6.size()
                int r7 = r7 - r14
                if (r3 == r7) goto L_0x02cd
                java.lang.Object r3 = r6.get(r11)
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$e r3 = (com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105257e) r3
                int r3 = r3.f312726a
                if (r3 == r14) goto L_0x02cd
                int r3 = r10.f312714h
                r1.setMarginEnd(r3)
            L_0x02cd:
                r12.setLayoutParams(r1)
                r9.add(r12)
                goto L_0x02d9
            L_0x02d4:
                r17 = r8
                r23 = r14
                r8 = 0
            L_0x02d9:
                r3 = r11
                r8 = r17
                r12 = r18
                r11 = r19
                r1 = r20
                r7 = r21
                r15 = r22
                r14 = r23
                goto L_0x0225
            L_0x02ea:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x02ef:
                r20 = r1
                r21 = r7
                r18 = r12
                r22 = r15
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[setRenderNodes] cost="
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = "ms make maxWidth="
                r1.append(r2)
                int r2 = r0.f312732g
                r1.append(r2)
                r2 = r22
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = " textMaxWidth="
                r1.append(r2)
                int r2 = r13.f27483d
                r1.append(r2)
                java.lang.String r2 = " nodes="
                r1.append(r2)
                java.util.List<te3.lr3> r2 = r0.f312731f
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x033b:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x034f
                java.lang.Object r4 = r2.next()
                te3.lr3 r4 = (te3.C50301lr3) r4
                org.json.JSONObject r4 = r4.toJSON()
                r3.add(r4)
                goto L_0x033b
            L_0x034f:
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r2 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$g$a r2 = new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$g$a
                com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r3 = r0.f312730e
                r4 = 0
                r2.<init>(r9, r3, r4)
                r3 = 1
                r0.f312729d = r3
                java.lang.Object r1 = a14.C53895h.m60469g(r1, r2, r0)
                r2 = r20
                if (r1 != r2) goto L_0x0373
                return r2
            L_0x0373:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.C105259g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RenderView(Context context) {
        super(context);
        setOrientation(0);
        setGravity(8388629);
        this.f312716j = 1;
    }

    /* renamed from: a */
    public static final int m141347a(RenderView renderView, C105256d dVar, int i, List list) {
        int i2;
        renderView.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C105257e) next).f312726a != i) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it4 = arrayList.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            C105257e eVar = (C105257e) it4.next();
            int i4 = eVar.f312726a;
            if (i4 == 1) {
                Context context = renderView.getContext();
                C87412m.m108593f(context, "context");
                i2 = new C105258f(renderView, context).mo149670m(dVar, eVar);
            } else if (i4 != 3) {
                i2 = 0;
            } else {
                Context context2 = renderView.getContext();
                C87412m.m108593f(context2, "context");
                i2 = new C105254a(renderView, context2).mo149652m(dVar, eVar);
            }
            i3 += i2;
        }
        return i3;
    }

    /* renamed from: b */
    public static final Drawable m141348b(RenderView renderView, Drawable drawable, int i) {
        renderView.getClass();
        if (i == 0) {
            drawable.mutate().setColorFilter((ColorFilter) null);
        } else {
            int argb = Color.argb(255, Color.red(i), Color.green(i), Color.blue(i));
            int alpha = Color.alpha(i);
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(argb, PorterDuff.Mode.SRC_ATOP));
            drawable.setAlpha(alpha);
        }
        return drawable;
    }

    /* renamed from: c */
    public final void mo149645c(int i, List<? extends C50301lr3> list) {
        C87412m.m108594g(list, "nodes");
        if (!list.isEmpty()) {
            setLayoutParams(new ViewGroup.LayoutParams(i, -1));
            this.f312717n = 0;
            C39818r rVar = C39818r.f106831a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C39622i0 a = rVar.mo62443b(context).mo75002a(C65946a.class);
            C87412m.m108593f(a, "UICProvider.of(context).…ycleScopeUIC::class.java)");
            C0317e.launch$default((C0317e) a, (C66212f) null, (C53934p0) null, new C105259g(this, list, i, (C15601d<? super C105259g>) null), 3, (Object) null);
        }
    }

    public final int getFriendRemarkFlag() {
        return this.f312717n;
    }

    public final int getRenderState() {
        return this.f312716j;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105924i("Finder.RenderView", "onDetachedFromWindow");
        this.f312717n = 0;
        this.f312716j = 1;
    }

    public final void setFriendRemarkFlag(int i) {
        this.f312717n = i;
    }

    public final void setRenderState(int i) {
        this.f312716j = i;
    }

    public RenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(8388629);
        this.f312716j = 1;
    }

    public RenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setGravity(8388629);
        this.f312716j = 1;
    }
}
