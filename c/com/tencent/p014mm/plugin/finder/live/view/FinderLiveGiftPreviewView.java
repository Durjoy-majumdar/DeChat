package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cj1.C0639y1;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ig1.C8916d;
import kg3.C76577a;
import kotlin.Metadata;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import p277yf.C15996c;
import ql1.C12874a;
import te3.C51765w03;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;", "Landroid/widget/RelativeLayout;", "", "desc", "Lrx3/b0;", "setUnLockContent", "curGiftId", "setNormalContent", "setBatchContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView */
public final class FinderLiveGiftPreviewView extends RelativeLayout {

    /* renamed from: d */
    public final String f15249d;

    /* renamed from: e */
    public final View f15250e;

    /* renamed from: f */
    public final PAGView f15251f;

    /* renamed from: g */
    public final TextView f15252g;

    /* renamed from: h */
    public final TextView f15253h;

    /* renamed from: i */
    public int f15254i;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView$a */
    public static final class C3194a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveGiftPreviewView f15255d;

        public C3194a(FinderLiveGiftPreviewView finderLiveGiftPreviewView) {
            this.f15255d = finderLiveGiftPreviewView;
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            Log.m105924i(this.f15255d.f15249d, "onAnimationEnd");
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
            Log.m105924i(this.f15255d.f15249d, "onAnimationStart");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f15249d = "FinderLiveGiftPreviewView@" + hashCode();
        View inflate = View.inflate(context, C0966R.C0971layout.agz, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…live_gift_thumb_ui, this)");
        this.f15250e = inflate;
        View findViewById = findViewById(C0966R.C0970id.dna);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_gift_thumb_pag)");
        PAGView pAGView = (PAGView) findViewById;
        this.f15251f = pAGView;
        pAGView.addListener(new C3194a(this));
        View findViewById2 = findViewById(C0966R.C0970id.nui);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_gift_unlock_desc)");
        this.f15253h = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.dnb);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder_live_gift_thumb_send_btn)");
        this.f15252g = (TextView) findViewById3;
    }

    private final void setBatchContent(String str) {
        mo3279a(64, 64, 0);
        this.f15253h.setVisibility(8);
        C8916d d = C0639y1.f1510a.mo612d(str);
        if (d != null) {
            this.f15250e.setBackgroundResource(C0966R.C0969drawable.cms);
            this.f15252g.setText(d.mo9721l2().size() == 0 ? getContext().getString(C0966R.string.n1v) : getContext().getString(C0966R.string.n1x));
            this.f15252g.setTextSize(1, 10.0f);
            setClickable(false);
            setEnabled(false);
        }
    }

    private final void setNormalContent(String str) {
        boolean z = false;
        mo3279a(64, 64, 0);
        this.f15253h.setVisibility(8);
        C8916d d = C0639y1.f1510a.mo612d(str);
        setClickable(true);
        setEnabled(true);
        if (d != null && d.mo9723n2()) {
            C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
            if (xVar != null && !xVar.f1643f) {
                z = true;
            }
            if (z) {
                this.f15250e.setBackgroundResource(C0966R.C0969drawable.b8w);
                this.f15252g.setText(getContext().getString(C0966R.string.dle));
                this.f15252g.setTextSize(1, 12.0f);
                return;
            }
        }
        this.f15250e.setBackgroundResource(C0966R.C0969drawable.f5205zt);
        this.f15252g.setText(getContext().getString(C0966R.string.dop));
        this.f15252g.setTextSize(1, 15.0f);
    }

    private final void setUnLockContent(String str) {
        mo3279a(32, 32, 4);
        this.f15253h.setVisibility(0);
        this.f15253h.setText(str);
        this.f15250e.setBackgroundResource(C0966R.C0969drawable.f5205zt);
        this.f15253h.setTextSize(1, 12.0f);
        this.f15252g.setText(getContext().getString(C0966R.string.dop));
        this.f15252g.setTextSize(1, 14.0f);
    }

    /* renamed from: a */
    public final void mo3279a(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.f15251f.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = C76577a.m92151b(getContext(), i);
            marginLayoutParams.height = C76577a.m92151b(getContext(), i2);
            marginLayoutParams.topMargin = C76577a.m92151b(getContext(), i3);
        }
    }

    /* renamed from: b */
    public final void mo3280b(String str, int i) {
        C87412m.m108594g(str, "curGiftId");
        this.f15254i = i;
        C0639y1 y1Var = C0639y1.f1510a;
        C8916d d = y1Var.mo612d(str);
        int i2 = this.f15254i;
        String str2 = null;
        if (i2 == 1) {
            setBatchContent(str);
        } else {
            if (i2 == 2) {
                String str3 = d != null ? d.field_description : null;
                if (!(str3 == null || str3.length() == 0)) {
                    String str4 = d != null ? d.field_description : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    setUnLockContent(str4);
                }
            }
            setNormalContent(str);
        }
        this.f15251f.setComposition(PAGFile.Load(y1Var.mo616h(str, true, (C51765w03) null)));
        this.f15251f.setRepeatCount(-1);
        C15996c a = C12874a.f36849a.mo12389a();
        if (d != null) {
            str2 = d.field_previewPagUrl;
        }
        C15996c.C15997a.m14902b(a, str2 == null ? "" : str2, this.f15251f, (String) null, 4, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
