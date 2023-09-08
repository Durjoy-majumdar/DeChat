package bt0;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import in3.C87763b;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: bt0.f */
public class C79811f extends C87763b implements C82531i.C82533b {

    /* renamed from: w */
    public int f233922w = 0;

    /* renamed from: x */
    public boolean f233923x = false;

    /* renamed from: y */
    public boolean f233924y = true;

    /* renamed from: z */
    public Integer f233925z = null;

    /* renamed from: bt0.f$a */
    public final class C79812a extends ColorDrawable {
        public C79812a(int i) {
            super(i);
        }

        public void setAlpha(int i) {
            super.setAlpha(i);
            C79811f.this.setStatusBarColor(getColor());
        }

        public void setColor(int i) {
            super.setColor(i);
            C79811f.this.setStatusBarColor(getColor());
        }
    }

    public C79811f(Context context) {
        super(context);
    }

    private C79815i getActionBar() {
        if (getChildCount() <= 0) {
            return null;
        }
        return (C79815i) getChildAt(0);
    }

    /* renamed from: P */
    public void mo109971P(int i, boolean z) {
        this.f233922w = i;
        this.f233923x = z;
        if (!this.f233924y) {
            mo122168R(i, z, false);
        } else {
            mo122168R(i, z, true);
        }
    }

    /* renamed from: S */
    public void mo109972S(Context context) {
        if (getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) getContext()).setBaseContext(context);
        }
        if (this.f233925z != null) {
            mo6344U3(0);
        }
    }

    /* renamed from: T */
    public void mo109973T() {
        Log.m105919d("Luggage.WXA.AppBrandActionBarContainer", "resetStatusBarForegroundStyle hash[%d] color[%d] foregroundDark[%b] mActuallyVisible[%b] isLayoutFrozen[%b]", Integer.valueOf(hashCode()), Integer.valueOf(this.f233922w), Boolean.valueOf(this.f233923x), Boolean.valueOf(this.f233924y), Boolean.valueOf(this.f254102o));
        this.f254108u = null;
        mo109971P(this.f233922w, this.f233923x);
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        Log.m105924i("Luggage.WXA.AppBrandActionBarContainer", "onStatusBarHeightChange: newHeight = " + i);
        Integer num = this.f233925z;
        if (num != null) {
            mo122165G(num.intValue());
        } else if (!this.f254102o) {
            mo122165G(i);
        }
    }

    /* renamed from: b */
    public void mo22089b() {
        setActuallyVisible(false);
    }

    public boolean canAnimate() {
        return false;
    }

    public void dispatchSystemUiVisibilityChanged(int i) {
        super.dispatchSystemUiVisibilityChanged(i);
        if (this.f233924y) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this) && C87763b.f254093v && (getWindowSystemUiVisibility() & 4) == 0) {
                Log.m105919d("Luggage.WXA.AppBrandActionBarContainer", "dispatchSystemUiVisibilityChanged resetStatusBarForegroundStyle, hash[%d]", Integer.valueOf(hashCode()));
                mo109973T();
            }
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C79815i) {
            view.setBackground(new C79812a(0));
            return;
        }
        throw new IllegalAccessError("Cant add non ActionBar instance here");
    }

    public void setActuallyVisible(boolean z) {
        boolean z2 = z != this.f233924y;
        this.f233924y = z;
        if (z2 && z) {
            setDeferStatusBarHeightChange(false);
            mo109973T();
            setWillNotDraw(false);
        }
        if (z2 && !z) {
            setDeferStatusBarHeightChange(true);
        }
    }

    public void setDeferStatusBarHeightChange(boolean z) {
        super.setLayoutFrozen(z);
    }

    public void setForceTopInsetsHeight(int i) {
        this.f233925z = Integer.valueOf(i);
    }

    public void setStatusBarColor(int i) {
        mo109971P(i, this.f233923x);
    }

    public void setStatusBarForegroundStyle(boolean z) {
        if (getActionBar() != null) {
            mo109971P(getActionBar().getBackgroundColor(), z);
        }
    }
}
