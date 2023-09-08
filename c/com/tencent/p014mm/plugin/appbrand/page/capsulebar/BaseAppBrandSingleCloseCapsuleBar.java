package com.tencent.p014mm.plugin.appbrand.page.capsulebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lb0.C88394b;
import lb0.C88430i;
import p385u2.C111105a;
import qq0.C89813r;
import qq0.C89819v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b#\u0010&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H$J\n\u0010\u0019\u001a\u0004\u0018\u00010\fH$R\u001a\u0010\u001e\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "Landroid/widget/FrameLayout;", "Lqq0/r;", "Lqq0/v;", "", "", "url", "Lrx3/b0;", "setWxaIconUrl", "", "percent", "setHeaderAlpha", "Landroid/view/View;", "getView", "Landroid/view/View$OnClickListener;", "listener", "setTitleClickListener", "", "color", "setStyleColor", "onClickListener", "setOptionButtonOnClickListener", "setHomeButtonOnClickListener", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar */
public abstract class BaseAppBrandSingleCloseCapsuleBar extends FrameLayout implements C89813r, C89819v {

    /* renamed from: d */
    public final String f244547d = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";

    /* renamed from: e */
    public boolean f244548e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e */
    public void mo116137e(float f) {
        for (View next : getViewsNeedResponseAlphaAnimation()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(next, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar", "animateHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            next.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(next, "com/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar", "animateHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (f == 0.0f) {
                next.setClickable(false);
            } else if (!next.isClickable()) {
                next.setClickable(true);
            }
        }
    }

    /* renamed from: f */
    public int mo116124f(int i) {
        throw new RuntimeException("must override this method");
    }

    public abstract View getCloseButton();

    public String getTAG() {
        return this.f244547d;
    }

    public final View getView() {
        return this;
    }

    public abstract /* synthetic */ List<View> getViewsNeedResponseAlphaAnimation();

    public abstract ImageView getWxaIcon();

    public abstract /* synthetic */ void setCloseBtnListener(View.OnClickListener onClickListener);

    public void setHeaderAlpha(float f) {
        String tag = getTAG();
        Log.m105924i(tag, "setHeaderAlpha percent[" + f + ']');
        mo116137e(((f * 255.0f) / ((float) 100)) / 255.0f);
    }

    public void setHomeButtonOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOptionButtonOnClickListener(View.OnClickListener onClickListener) {
    }

    public abstract /* synthetic */ void setShareBtnListener(View.OnClickListener onClickListener);

    public void setStyleColor(int i) {
    }

    public abstract /* synthetic */ void setTitle(String str);

    public void setTitleClickListener(View.OnClickListener onClickListener) {
    }

    public void setWxaIconUrl(String str) {
        if (getWxaIcon() != null) {
            if (str == null || str.length() == 0) {
                ImageView wxaIcon = getWxaIcon();
                if (wxaIcon != null) {
                    Context context = MMApplicationContext.getContext();
                    Object obj = C111105a.f332697a;
                    wxaIcon.setImageDrawable(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.c8n));
                    return;
                }
                return;
            }
            String str2 = C88394b.f255384g;
            C88394b bVar = C88394b.C88418q.f255427a;
            ImageView wxaIcon2 = getWxaIcon();
            C87412m.m108591d(wxaIcon2);
            bVar.mo122785a(wxaIcon2, str, C0966R.C0969drawable.c8n, new C88430i());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C87412m.m108594g(context, "context");
    }
}
