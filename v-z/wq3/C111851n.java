package wq3;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.neattextview.textview.view.NeatTextView;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;

/* renamed from: wq3.n */
public final class C111851n {

    /* renamed from: a */
    public static final C111852a f334884a = new C111852a((C8480h) null);

    /* renamed from: wq3.n$a */
    public static final class C111852a {
        public C111852a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo163583a(Context context, ViewGroup.LayoutParams layoutParams, String str, int i, int i2, int i3, int i4) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
            }
        }

        /* renamed from: b */
        public final void mo163584b(Context context, View view, String str, int i, int i2, int i3, int i4) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: c */
        public final void mo163585c(Context context, View view, String str, Typeface typeface) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(typeface, "typeface");
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            } else if (view instanceof Switch) {
                ((Switch) view).setTypeface(typeface);
            }
        }

        /* renamed from: d */
        public final void mo163586d(Context context, View view, String str, Drawable drawable) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            view.setBackground(drawable);
        }

        /* renamed from: e */
        public final void mo163587e(Context context, View view, String str, TextUtils.TruncateAt truncateAt) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(truncateAt, "value");
            if (view instanceof TextView) {
                ((TextView) view).setEllipsize(truncateAt);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setEllipsize(truncateAt);
            }
        }

        /* renamed from: f */
        public final void mo163588f(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setGravity(i);
            } else if (view instanceof RelativeLayout) {
                ((RelativeLayout) view).setGravity(i);
            } else if (view instanceof TextView) {
                ((TextView) view).setGravity(i);
            } else if (view instanceof Spinner) {
                ((Spinner) view).setGravity(i);
            } else if (view instanceof GridView) {
                ((GridView) view).setGravity(i);
            } else if (view instanceof Gallery) {
                ((Gallery) view).setGravity(i);
            } else if (!(view instanceof Toolbar) && (view instanceof NeatTextView)) {
                ((NeatTextView) view).setTextGravity(i);
            }
        }

        /* renamed from: g */
        public final void mo163589g(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            view.setId(i);
        }

        /* renamed from: h */
        public final void mo163590h(Context context, ViewGroup.LayoutParams layoutParams, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(13, i);
            }
        }

        /* renamed from: i */
        public final void mo163591i(Context context, ViewGroup.LayoutParams layoutParams, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = i;
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            } else if (layoutParams instanceof GridLayout.LayoutParams) {
                ((GridLayout.LayoutParams) layoutParams).setGravity(i);
            } else if (layoutParams instanceof Toolbar.LayoutParams) {
                ((Toolbar.LayoutParams) layoutParams).gravity = i;
            } else if (layoutParams instanceof CoordinatorLayout.C103717e) {
                ((CoordinatorLayout.C103717e) layoutParams).f306330c = i;
            }
        }

        /* renamed from: j */
        public final void mo163592j(Context context, ViewGroup.LayoutParams layoutParams, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            layoutParams.height = i;
        }

        /* renamed from: k */
        public final void mo163593k(Context context, ViewGroup.LayoutParams layoutParams, String str, float f) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).weight = f;
            }
        }

        /* renamed from: l */
        public final void mo163594l(Context context, ViewGroup.LayoutParams layoutParams, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(layoutParams, "layoutParams");
            C87412m.m108594g(str, "name");
            layoutParams.width = i;
        }

        /* renamed from: m */
        public final void mo163595m(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setMaxHeight(i);
            } else if (view instanceof ImageView) {
                ((ImageView) view).setMaxHeight(i);
            } else if (view instanceof ProgressBar) {
                if (C11171e.m11046c(29)) {
                    ((ProgressBar) view).setMaxHeight(i);
                }
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setMaxHeight(i);
            }
        }

        /* renamed from: n */
        public final void mo163596n(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setMaxLines(i);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setMaxLines(i);
            }
        }

        /* renamed from: o */
        public final void mo163597o(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setMinHeight(i);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setMinHeight(i);
            } else if ((view instanceof ProgressBar) && C11171e.m11046c(29)) {
                ((ProgressBar) view).setMinHeight(i);
            }
            view.setMinimumHeight(i);
        }

        /* renamed from: p */
        public final void mo163598p(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setMinWidth(i);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setMinWidth(i);
            } else if (!(view instanceof ProgressBar)) {
                view.setMinimumWidth(i);
            } else if (C11171e.m11046c(29)) {
                ((ProgressBar) view).setMinWidth(i);
            }
        }

        /* renamed from: q */
        public final void mo163599q(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setOrientation(i);
            } else if (view instanceof GridLayout) {
                ((GridLayout) view).setOrientation(i);
            }
        }

        /* renamed from: r */
        public final void mo163600r(Context context, View view, String str, ImageView.ScaleType scaleType) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(scaleType, "value");
            if (view instanceof ImageView) {
                ((ImageView) view).setScaleType(scaleType);
            }
        }

        /* renamed from: s */
        public final void mo163601s(Context context, View view, String str, boolean z) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setSingleLine(z);
            }
        }

        /* renamed from: t */
        public final void mo163602t(Context context, View view, String str, Drawable drawable) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(drawable);
            }
        }

        /* renamed from: u */
        public final void mo163603u(Context context, View view, String str, String str2) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "value");
            if (view instanceof TextView) {
                ((TextView) view).setText(str2);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).mo104279b(str2);
            }
        }

        /* renamed from: v */
        public final void mo163604v(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).setTextColor(i);
            }
        }

        /* renamed from: w */
        public final void mo163605w(Context context, View view, String str, float f) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof TextView) {
                ((TextView) view).setTextSize(1, f);
            } else if (view instanceof NeatTextView) {
                ((NeatTextView) view).mo154994l(1, f);
            }
        }

        /* renamed from: x */
        public final void mo163606x(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/view/x2c/ViewAttrX2CMethod$Companion", "set_android_visibility", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/view/x2c/ViewAttrX2CMethod$Companion", "set_android_visibility", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
