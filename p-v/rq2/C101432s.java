package rq2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rq2.s */
public final class C101432s {

    /* renamed from: a */
    public static Typeface f297082a;

    /* renamed from: a */
    public static float m133119a(TextView textView, String str) {
        SnsMethodCalculate.markStartTimeMs("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (TextUtils.isEmpty(str) || textView == null) {
            SnsMethodCalculate.markEndTimeMs("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return 0.0f;
        }
        try {
            TextPaint paint = textView.getPaint();
            if (paint == null) {
                SnsMethodCalculate.markEndTimeMs("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                return 0.0f;
            }
            float measureText = paint.measureText(str);
            SnsMethodCalculate.markEndTimeMs("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return measureText;
        } catch (Throwable unused) {
            Log.m105928w("ViewUtils", "acquireTextWidth error.");
            SnsMethodCalculate.markEndTimeMs("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return 0.0f;
        }
    }

    /* renamed from: b */
    public static boolean m133120b(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        boolean z = false;
        try {
            SnsMethodCalculate.markStartTimeMs("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            if (viewGroup != null) {
                if (view != null) {
                    if (i > viewGroup.getChildCount()) {
                        SnsMethodCalculate.markEndTimeMs("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                    } else {
                        ViewParent parent = view.getParent();
                        if (parent == viewGroup) {
                            SnsMethodCalculate.markEndTimeMs("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                        } else {
                            if (parent == null) {
                                viewGroup.addView(view, i);
                            } else {
                                ((ViewGroup) parent).removeView(view);
                                viewGroup.addView(view);
                            }
                            SnsMethodCalculate.markEndTimeMs("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                        }
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                    return z;
                }
            }
            SnsMethodCalculate.markEndTimeMs("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            SnsMethodCalculate.markEndTimeMs("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return z;
        } catch (Throwable unused) {
            Log.m105920e("ViewUtils", "ViewUtils:: Add view to view group failed!");
            SnsMethodCalculate.markEndTimeMs("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return false;
        }
    }

    /* renamed from: c */
    public static void m133121c(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("clearChildren", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        SnsMethodCalculate.markEndTimeMs("clearChildren", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: d */
    public static <T> T m133122d(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view == null || i == 0) {
            SnsMethodCalculate.markEndTimeMs("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        try {
            T tag = view.getTag(i);
            SnsMethodCalculate.markEndTimeMs("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return tag;
        } catch (Throwable unused) {
            Log.m105928w("ViewUtils", "the is something wrong in view tag!!");
            SnsMethodCalculate.markEndTimeMs("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m133123e(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        boolean z = false;
        if (viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return false;
        }
        if (viewGroup.getChildCount() > 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        return z;
    }

    /* renamed from: f */
    public static View m133124f(Context context, int i, ViewGroup viewGroup, boolean z) {
        SnsMethodCalculate.markStartTimeMs("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (context == null && viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        if (context == null) {
            try {
                context = viewGroup.getContext();
            } catch (Throwable unused) {
                SnsMethodCalculate.markEndTimeMs("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                return null;
            }
        }
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
        SnsMethodCalculate.markEndTimeMs("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        return inflate;
    }

    /* renamed from: g */
    public static <T extends View> T m133125g(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewStub == null) {
            SnsMethodCalculate.markEndTimeMs("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        try {
            T inflate = viewStub.inflate();
            SnsMethodCalculate.markEndTimeMs("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return inflate;
        } catch (Throwable unused) {
            Log.m105920e("ViewUtils", "view stub inflate failed!");
            SnsMethodCalculate.markEndTimeMs("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
    }

    /* renamed from: h */
    public static void m133126h(View view) {
        SnsMethodCalculate.markStartTimeMs("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: i */
    public static void m133127i(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("setMaxWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view instanceof TextView) {
            ((TextView) view).setMaxWidth(i);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setMaxWidth(i);
        } else {
            Log.m105928w("ViewUtils", "the view is not support set max width.");
        }
        SnsMethodCalculate.markEndTimeMs("setMaxWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: j */
    public static void m133128j(TextView textView, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (textView != null) {
            try {
                if (TextUtils.isEmpty(charSequence)) {
                    textView.setText("");
                } else {
                    textView.setText(charSequence);
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: k */
    public static void m133129k(ViewGroup viewGroup, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup == null) {
            Log.m105920e("ViewUtils", "setViewGroupClip, vp is null and clip is " + z);
            SnsMethodCalculate.markEndTimeMs("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return;
        }
        try {
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
        } catch (Throwable unused) {
            Log.m105928w("ViewUtils", "setViewGroupClip error!!");
        }
        SnsMethodCalculate.markEndTimeMs("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: l */
    public static void m133130l(View view) {
        SnsMethodCalculate.markStartTimeMs("setViewInvisible", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewInvisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewInvisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setViewInvisible", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: m */
    public static void m133131m(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setViewLayoutParam", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    if (i != -1003) {
                        layoutParams.width = i;
                    }
                    if (i2 != -1003) {
                        layoutParams.height = i2;
                    }
                } else {
                    if (i == -1003) {
                        i = 0;
                    }
                    if (i2 == -1003) {
                        i2 = 0;
                    }
                    layoutParams = new ViewGroup.LayoutParams(i, i2);
                }
                view.setLayoutParams(layoutParams);
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("setViewLayoutParam", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    /* renamed from: n */
    public static void m133132n(View view, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setViewVisibility", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setViewVisibility", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }
}
