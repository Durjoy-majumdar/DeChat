package d60;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i60.C46169a;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p248ug.C78160t0;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import y50.C53496k;
import y50.C66519j0;
import z50.C53746s;

/* renamed from: d60.h0 */
public final class C58152h0 extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f166575f;

    /* renamed from: g */
    public final int f166576g = 1;

    /* renamed from: h */
    public final int f166577h = 2;

    /* renamed from: i */
    public final LinearLayout f166578i;

    /* renamed from: j */
    public final LinearLayout f166579j;

    /* renamed from: n */
    public final View f166580n;

    /* renamed from: o */
    public final MMEditText f166581o;

    /* renamed from: p */
    public final TextView f166582p;

    /* renamed from: q */
    public final ImageView f166583q;

    /* renamed from: r */
    public SmileyPanel f166584r;

    /* renamed from: s */
    public Context f166585s;

    /* renamed from: t */
    public int f166586t;

    /* renamed from: u */
    public boolean f166587u;

    /* renamed from: v */
    public int f166588v;

    /* renamed from: w */
    public int f166589w;

    /* renamed from: d60.h0$a */
    public static final class C58153a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166590d;

        public C58153a(C58152h0 h0Var) {
            this.f166590d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58152h0 h0Var = this.f166590d;
            boolean z = h0Var.f166588v != h0Var.f166577h;
            if (!z) {
                h0Var.mo82917z0();
                Context context = h0Var.f166585s;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).showVKB();
            } else {
                h0Var.f166584r.setVisibility(0);
                ImageView imageView = h0Var.f166583q;
                Drawable drawable = h0Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
                C74933u4.m89769f(drawable, -1);
                imageView.setImageDrawable(drawable);
                h0Var.f166588v = h0Var.f166577h;
                h0Var.f166584r.setAlpha(0.0f);
                h0Var.f166584r.animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
                Context context2 = h0Var.f166585s;
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context2).hideVKB();
            }
            if (z) {
                ImageView imageView2 = h0Var.f166583q;
                Drawable drawable2 = h0Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
                C74933u4.m89769f(drawable2, -1);
                imageView2.setImageDrawable(drawable2);
            } else {
                ImageView imageView3 = h0Var.f166583q;
                Drawable drawable3 = h0Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
                C74933u4.m89769f(drawable3, -1);
                imageView3.setImageDrawable(drawable3);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h0$b */
    public static final class C58154b implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166591d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f166592e;

        /* renamed from: d60.h0$b$a */
        public static final class C58155a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ C58152h0 f166593d;

            public C58155a(C58152h0 h0Var) {
                this.f166593d = h0Var;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                float intValue = (float) ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this.f166593d.f166582p.getLayoutParams();
                layoutParams.width = C60641c.m70921b(intValue);
                this.f166593d.f166582p.setLayoutParams(layoutParams);
                C58152h0 h0Var = this.f166593d;
                h0Var.f166582p.setAlpha(intValue / ((float) h0Var.f166586t));
            }
        }

        /* renamed from: d60.h0$b$b */
        public static final class C58156b implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C58152h0 f166594d;

            public C58156b(C58152h0 h0Var) {
                this.f166594d = h0Var;
            }

            public void onAnimationCancel(Animator animator) {
                ViewGroup.LayoutParams layoutParams = this.f166594d.f166582p.getLayoutParams();
                C58152h0 h0Var = this.f166594d;
                layoutParams.width = h0Var.f166586t;
                h0Var.f166582p.setLayoutParams(layoutParams);
                this.f166594d.f166582p.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                this.f166594d.f166582p.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = this.f166594d.f166582p.getLayoutParams();
                C58152h0 h0Var = this.f166594d;
                layoutParams.width = h0Var.f166586t;
                h0Var.f166582p.setLayoutParams(layoutParams);
                this.f166594d.f166582p.setAlpha(1.0f);
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f166594d.f166582p.setVisibility(0);
            }
        }

        /* renamed from: d60.h0$b$c */
        public static final class C58157c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ C58152h0 f166595d;

            public C58157c(C58152h0 h0Var) {
                this.f166595d = h0Var;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                float intValue = (float) ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this.f166595d.f166582p.getLayoutParams();
                layoutParams.width = C60641c.m70921b(intValue);
                this.f166595d.f166582p.setLayoutParams(layoutParams);
                C58152h0 h0Var = this.f166595d;
                h0Var.f166582p.setAlpha(intValue / ((float) h0Var.f166586t));
            }
        }

        /* renamed from: d60.h0$b$d */
        public static final class C58158d implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C58152h0 f166596d;

            public C58158d(C58152h0 h0Var) {
                this.f166596d = h0Var;
            }

            public void onAnimationCancel(Animator animator) {
                this.f166596d.f166582p.setVisibility(8);
            }

            public void onAnimationEnd(Animator animator) {
                this.f166596d.f166582p.setVisibility(8);
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f166596d.f166582p.setVisibility(0);
            }
        }

        public C58154b(C58152h0 h0Var, ViewGroup viewGroup) {
            this.f166591d = h0Var;
            this.f166592e = viewGroup;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r0 != r8.getHeight()) goto L_0x0013;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r8) {
            /*
                r7 = this;
                d60.h0 r8 = r7.f166591d
                int r0 = r8.f166589w
                java.lang.String r1 = "inputParent"
                if (r0 == 0) goto L_0x0013
                android.view.View r8 = r8.f166580n
                gy3.C87412m.m108593f(r8, r1)
                int r8 = r8.getHeight()
                if (r0 == r8) goto L_0x005b
            L_0x0013:
                d60.h0 r8 = r7.f166591d
                android.view.View r0 = r8.f166580n
                gy3.C87412m.m108593f(r0, r1)
                int r0 = r0.getHeight()
                r8.f166589w = r0
                android.os.Bundle r8 = new android.os.Bundle
                r8.<init>()
                d60.h0 r0 = r7.f166591d
                android.content.Context r0 = r0.f166585s
                int r0 = com.tencent.p014mm.sdk.platformtools.KeyBoardUtil.getKeyBordHeightPx(r0)
                d60.h0 r2 = r7.f166591d
                android.view.View r2 = r2.f166580n
                gy3.C87412m.m108593f(r2, r1)
                int r1 = r2.getHeight()
                int r0 = r0 + r1
                android.view.ViewGroup r1 = r7.f166592e
                android.content.Context r1 = r1.getContext()
                int r1 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
                int r0 = r0 + r1
                d60.h0 r1 = r7.f166591d
                android.widget.LinearLayout r1 = r1.f166578i
                int r1 = r1.getPaddingBottom()
                int r0 = r0 + r1
                java.lang.String r1 = "PARAM_LIVE_COMMENT_OFFSET_HEIGHT"
                r8.putInt(r1, r0)
                d60.h0 r0 = r7.f166591d
                d60.b r0 = r0.f166575f
                d60.b$b r1 = d60.C58124b.C58125b.LIVE_STATUS_COMMENT_LAYOUT_UPDATE
                r0.statusChange(r1, r8)
            L_0x005b:
                d60.h0 r8 = r7.f166591d
                com.tencent.mm.ui.widget.MMEditText r8 = r8.f166581o
                android.text.Editable r8 = r8.getText()
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L_0x006f
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x006f
                r8 = 1
                goto L_0x0070
            L_0x006f:
                r8 = 0
            L_0x0070:
                if (r8 == 0) goto L_0x0087
                d60.h0 r8 = r7.f166591d
                com.tencent.mm.ui.widget.MMEditText r8 = r8.f166581o
                android.text.Editable r8 = r8.getText()
                if (r8 == 0) goto L_0x0082
                boolean r8 = z04.C112551y.m153811k(r8)
                r8 = r8 ^ r0
                goto L_0x0083
            L_0x0082:
                r8 = 0
            L_0x0083:
                if (r8 == 0) goto L_0x0087
                r8 = 1
                goto L_0x0088
            L_0x0087:
                r8 = 0
            L_0x0088:
                d60.h0 r2 = r7.f166591d
                boolean r3 = r2.f166587u
                if (r8 != r3) goto L_0x008f
                return
            L_0x008f:
                r2.f166587u = r8
                r3 = 150(0x96, double:7.4E-322)
                r5 = 2
                java.lang.String r6 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
                if (r8 == 0) goto L_0x00e0
                android.widget.ImageView r8 = r2.f166583q
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                gy3.C87412m.m108592e(r8, r6)
                android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
                android.view.ViewGroup r2 = r7.f166592e
                android.content.Context r2 = r2.getContext()
                r6 = 2131165307(0x7f07007b, float:1.7944827E38)
                int r2 = kg3.C76577a.m92157h(r2, r6)
                r8.setMarginStart(r2)
                android.animation.ValueAnimator r8 = new android.animation.ValueAnimator
                r8.<init>()
                int[] r2 = new int[r5]
                r2[r1] = r1
                d60.h0 r1 = r7.f166591d
                int r1 = r1.f166586t
                r2[r0] = r1
                r8.setIntValues(r2)
                d60.h0$b$a r0 = new d60.h0$b$a
                d60.h0 r1 = r7.f166591d
                r0.<init>(r1)
                r8.addUpdateListener(r0)
                r8.setDuration(r3)
                d60.h0$b$b r0 = new d60.h0$b$b
                d60.h0 r1 = r7.f166591d
                r0.<init>(r1)
                r8.addListener(r0)
                r8.start()
                goto L_0x0127
            L_0x00e0:
                android.widget.ImageView r8 = r2.f166583q
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                gy3.C87412m.m108592e(r8, r6)
                android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
                android.view.ViewGroup r2 = r7.f166592e
                android.content.Context r2 = r2.getContext()
                r6 = 2131165324(0x7f07008c, float:1.7944862E38)
                int r2 = kg3.C76577a.m92157h(r2, r6)
                r8.setMarginStart(r2)
                android.animation.ValueAnimator r8 = new android.animation.ValueAnimator
                r8.<init>()
                int[] r2 = new int[r5]
                d60.h0 r5 = r7.f166591d
                int r5 = r5.f166586t
                r2[r1] = r5
                r2[r0] = r1
                r8.setIntValues(r2)
                d60.h0$b$c r0 = new d60.h0$b$c
                d60.h0 r1 = r7.f166591d
                r0.<init>(r1)
                r8.addUpdateListener(r0)
                r8.setDuration(r3)
                d60.h0$b$d r0 = new d60.h0$b$d
                d60.h0 r1 = r7.f166591d
                r0.<init>(r1)
                r8.addListener(r0)
                r8.start()
            L_0x0127:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d60.C58152h0.C58154b.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: d60.h0$c */
    public static final class C58159c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166597d;

        /* renamed from: d60.h0$c$a */
        public static final class C58160a implements C47883u {

            /* renamed from: a */
            public static final C58160a f166598a = new C58160a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
            }
        }

        public C58159c(C58152h0 h0Var) {
            this.f166597d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveInputPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (RoomLiveService.f157208s) {
                C77426q qVar = new C77426q(this.f166597d.f166585s);
                qVar.mo107606r(this.f166597d.f166585s.getResources().getString(C0966R.string.g6s));
                qVar.mo107601m(C0966R.string.f8028zq);
                qVar.mo107600l(C58160a.f166598a);
                qVar.mo107603o();
            } else if (this.f166597d.f166581o.getText() != null) {
                C58152h0 h0Var = this.f166597d;
                h0Var.mo82917z0();
                Context context = h0Var.f166585s;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).hideVKB();
                h0Var.mo82915x0();
                Editable text = h0Var.f166581o.getText();
                h0Var.f166581o.setText((CharSequence) null);
                C66519j0 j0Var = C66519j0.f191358d;
                String obj = text.toString();
                C87412m.m108594g(obj, "content");
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                RoomLiveService.f157195f.add(new C46169a(s, "", obj, 1, C31543z5.m39455e()));
                C53496k.f150436a.mo74169b();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                long j = RoomLiveService.f157197h.f133050d;
                byte[] bArr = RoomLiveService.f157196g;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                b0Var.mo123460f(new C53746s(obj, 1, j, bArr, RoomLiveService.f157192c));
                C58124b.C7172a.m7372a(h0Var.f166575f, C58124b.C58125b.POST_MSG, (Bundle) null, 2, (Object) null);
                if (h0Var.f166575f.getLiveRole() == 0) {
                    Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickComment");
                    C115669n.INSTANCE.mo175913w(1381, 8, 1);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveInputPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h0$d */
    public static final class C58161d implements View.OnClickListener {

        /* renamed from: d */
        public static final C58161d f166599d = new C58161d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveInputPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveInputPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h0$e */
    public static final class C58162e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166600d;

        public C58162e(C58152h0 h0Var) {
            this.f166600d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveInputPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f166600d.mo82917z0();
            Context context = this.f166600d.f166585s;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            this.f166600d.mo82915x0();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveInputPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h0$f */
    public static final class C58163f implements InputFilter {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166601d;

        public C58163f(C58152h0 h0Var) {
            this.f166601d = h0Var;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            this.f166601d.f166581o.getText();
            if (charSequence.toString().contentEquals("\n")) {
                return "";
            }
            return null;
        }
    }

    /* renamed from: d60.h0$g */
    public static final class C58164g extends C45078p0 {
        public C58164g(C45078p0.C45079a aVar) {
            super(120, aVar);
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int i5;
            int i6;
            C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
            int i7 = 0;
            if ((spanned != null ? spanned.length() : 0) > i3) {
                i5 = C45078p0.m49926e(String.valueOf(spanned != null ? spanned.subSequence(0, i3) : null), aVar);
            } else {
                i5 = C45078p0.m49926e(String.valueOf(spanned), aVar);
            }
            int e = (spanned == null || spanned.length() <= i4) ? 0 : C45078p0.m49926e(spanned.subSequence(i4, spanned.length()).toString(), aVar);
            int e2 = C45078p0.m49926e(String.valueOf(charSequence), aVar);
            int i8 = (120 - i5) - e;
            int a = C45078p0.m49922a(String.valueOf(charSequence));
            if (i5 + e2 + e > 120) {
                int i9 = i8 - a;
                if (i9 >= 0) {
                    i7 = i9;
                }
                if (charSequence != null && i >= 0 && charSequence.length() >= (i6 = i7 + i)) {
                    return charSequence.subSequence(i, i6);
                }
            } else if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
    }

    /* renamed from: d60.h0$h */
    public static final class C58165h implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166602d;

        public C58165h(C58152h0 h0Var) {
            this.f166602d = h0Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f166602d.f166584r.setAlpha(1.0f);
            this.f166602d.f166584r.setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: d60.h0$i */
    public static final class C58166i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58152h0 f166603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58166i(C58152h0 h0Var) {
            super(0);
            this.f166603d = h0Var;
        }

        public Object invoke() {
            C77426q qVar = new C77426q(this.f166603d.f166585s);
            qVar.mo107606r(this.f166603d.f166585s.getResources().getString(C0966R.string.g6s));
            qVar.mo107601m(C0966R.string.f8028zq);
            qVar.mo107600l(C58167i0.f166604a);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58152h0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166575f = bVar;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.fuj);
        this.f166578i = linearLayout;
        this.f166579j = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.ftj);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ful);
        this.f166580n = findViewById;
        MMEditText mMEditText = (MMEditText) viewGroup.findViewById(C0966R.C0970id.fun);
        this.f166581o = mMEditText;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.fyf);
        this.f166582p = textView;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.fuf);
        this.f166583q = imageView;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.fsp);
        SmileyPanel c = C78160t0.m94372c(viewGroup.getContext(), false);
        C87412m.m108593f(c, "getSmileyPanel(root.context, false)");
        this.f166584r = c;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f166585s = context;
        this.f166588v = 0;
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new C58153a(this));
        mMEditText.setFilters(new InputFilter[]{new C58163f(this), new C58164g(C45078p0.C45079a.MODE_CHINESE_AS_2)});
        mMEditText.addTextChangedListener(new C58154b(this, viewGroup));
        if (mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C75044y4.m89991c(viewGroup.getContext()));
        }
        textView.setOnClickListener(new C58159c(this));
        linearLayout.setOnClickListener(C58161d.f166599d);
        textView2.setOnClickListener(new C58162e(this));
        SmileyPanel smileyPanel = this.f166584r;
        int i = ChatFooterPanel.f211589f;
        smileyPanel.setEntranceScene(14);
        this.f166584r.mo100191d();
        this.f166584r.mo100192e(true);
        this.f166584r.mo100193f(false, false);
        this.f166584r.setVisibility(4);
        this.f166584r.mo100197i();
        this.f166584r.setOnTextOperationListener(new C58168j0(this));
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        if (z) {
            this.f166588v = this.f166576g;
            mo82917z0();
            mo82916y0(i);
        } else if (this.f166588v == this.f166576g) {
            this.f166588v = 0;
            this.f166584r.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            mo82916y0(0);
        }
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        int c = C74942w4.m89786c(this.f166585s, C0966R.dimen.f3758d_);
        int desiredWidth = ((int) Layout.getDesiredWidth(this.f166582p.getText(), this.f166582p.getPaint())) + this.f166582p.getPaddingStart() + this.f166582p.getPaddingEnd();
        if (c < desiredWidth) {
            c = desiredWidth;
        }
        this.f166586t = c;
        C86709a0.m107529k().f251779b.mo123455a(904, this);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        if (this.f166588v == this.f166577h) {
            this.f166584r.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            this.f166588v = 0;
            mo82916y0(0);
            return true;
        }
        mo82915x0();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C53746s) && i2 == -100065) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157208s = true;
            C61926c.m72668M(new C58166i(this));
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            mo10792g(8);
        } else if (ordinal == 39) {
            boolean z = true;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                this.f166287d.setVisibility(0);
                ImageView imageView = this.f166583q;
                Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
                C74933u4.m89769f(drawable, -1);
                imageView.setImageDrawable(drawable);
                this.f166581o.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) this.f166287d.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.f166581o, 0);
                }
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(904, this);
    }

    /* renamed from: x0 */
    public final void mo82915x0() {
        this.f166588v = 0;
        this.f166287d.setVisibility(4);
        this.f166581o.clearFocus();
        Object systemService = this.f166287d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f166581o.getWindowToken(), 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", false);
        this.f166575f.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
    }

    /* renamed from: y0 */
    public final void mo82916y0(int i) {
        if (this.f166287d.getContext() instanceof Activity) {
            ViewGroup.LayoutParams layoutParams = this.f166580n.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!mo82893g0()) {
                layoutParams2.bottomMargin = C75044y4.m89991c(this.f166585s) + i;
            } else {
                layoutParams2.bottomMargin = i;
            }
            this.f166580n.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i);
            if (!mo82893g0()) {
                layoutParams3.bottomMargin = C75044y4.m89991c(this.f166585s);
            } else {
                layoutParams3.setMarginEnd(C75044y4.m89991c(this.f166585s));
            }
            this.f166584r.setLayoutParams(layoutParams3);
            if (this.f166584r.getParent() == null) {
                this.f166579j.addView(this.f166584r, layoutParams3);
            }
            Bundle bundle = new Bundle();
            View view = this.f166580n;
            C87412m.m108593f(view, "inputParent");
            bundle.putInt("PARAM_LIVE_COMMENT_OFFSET_HEIGHT", i + view.getHeight() + C75044y4.m89991c(this.f166287d.getContext()) + this.f166578i.getPaddingBottom());
            this.f166575f.statusChange(C58124b.C58125b.LIVE_STATUS_COMMENT_LAYOUT_UPDATE, bundle);
        }
    }

    /* renamed from: z0 */
    public final void mo82917z0() {
        if (this.f166588v == this.f166577h) {
            ImageView imageView = this.f166583q;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_sticker);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            this.f166584r.animate().alpha(0.0f).setDuration(220).setListener(new C58165h(this)).start();
        }
    }
}
