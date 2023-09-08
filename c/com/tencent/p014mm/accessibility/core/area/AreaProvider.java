package com.tencent.p014mm.accessibility.core.area;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.accessibility.core.provider.Provider;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.Arrays;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/AreaProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "isDisExpand", "Lrx3/b0;", "defaultDealExpand", "", "findConfigRect", "", "dp", "getPx", "px", "getDp", "dealOnViewInflateAsync", "expand", "getDefaultViewExpand", "host", "Landroid/view/accessibility/AccessibilityNodeProvider;", "buildAccessibilityProvider", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.AreaProvider */
public final class AreaProvider extends Provider {
    public static final int $stable = 0;
    public static final AreaProvider INSTANCE = new AreaProvider();
    public static final String TAG = "MicroMsg.Acc.AreaProvider";

    private AreaProvider() {
    }

    private final void defaultDealExpand(View view) {
        int[] defaultViewExpand = getDefaultViewExpand(view);
        if (defaultViewExpand != null) {
            logMsg(TAG, view, "expand " + Arrays.toString(defaultViewExpand) + " defaultDealExpand");
            ViewTouchAreaExpander.INSTANCE.expand(view, defaultViewExpand[0], defaultViewExpand[1], defaultViewExpand[2], defaultViewExpand[3]);
        }
    }

    private final int[] findConfigRect(View view) {
        C8479f0 f0Var = new C8479f0();
        getConfig(view, new AreaProvider$findConfigRect$1(view, f0Var));
        return (int[]) f0Var.f27484d;
    }

    private final int getDp(int i) {
        return C76577a.m92152c(MMApplicationContext.getContext(), i);
    }

    /* access modifiers changed from: private */
    public final int getPx(int i) {
        return C76577a.m92151b(MMApplicationContext.getContext(), i);
    }

    private final boolean isDisExpand(View view) {
        return getConfig(view, new AreaProvider$isDisExpand$1(view));
    }

    public final AccessibilityNodeProvider buildAccessibilityProvider(View view) {
        C87412m.m108594g(view, "host");
        if (isDisExpand(view) || !AccUtil.INSTANCE.canExpand()) {
            return null;
        }
        int[] findConfigRect = findConfigRect(view);
        if (findConfigRect == null && (findConfigRect = getDefaultViewExpand(view)) == null) {
            return null;
        }
        return new VisualAreaNodeProvider(view, findConfigRect[0], findConfigRect[1], findConfigRect[2], findConfigRect[3]);
    }

    public void dealOnViewInflateAsync(View view) {
        C87412m.m108594g(view, "view");
        if (!AccUtil.INSTANCE.canExpand()) {
            return;
        }
        if (view.isClickable() || view.isLongClickable()) {
            expand(view);
        }
    }

    public final void expand(View view) {
        C13598b0 b0Var;
        C87412m.m108594g(view, "view");
        if (view.getVisibility() == 0 && !isDisExpand(view)) {
            int[] findConfigRect = findConfigRect(view);
            if (findConfigRect != null) {
                ViewTouchAreaExpander.INSTANCE.expand(view, findConfigRect[0], findConfigRect[1], findConfigRect[2], findConfigRect[3]);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                defaultDealExpand(view);
            }
        }
    }

    public int getAuthority() {
        return AccUtil.INSTANCE.canExpand() ? 2 : 0;
    }

    public final int[] getDefaultViewExpand(View view) {
        C87412m.m108594g(view, "view");
        Rect rect = new Rect();
        view.getHitRect(rect);
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = 0;
        }
        int dp = getDp(rect.width());
        int dp4 = getDp(rect.height());
        if (dp < 44) {
            int i2 = (44 - dp) / 2;
            iArr[0] = getPx(i2);
            iArr[2] = getPx(i2);
        }
        if (dp4 < 44) {
            int i3 = (44 - dp4) / 2;
            iArr[1] = getPx(i3);
            iArr[3] = getPx(i3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (iArr[i4] != 0) {
                return iArr;
            }
        }
        return null;
    }
}
