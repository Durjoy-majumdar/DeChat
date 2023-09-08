package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.model.C71004i;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.p101ui.ScannerFlashSwitcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ul2.C78227j0;
import ul2.C78228k0;
import ul2.C78229n0;
import vl2.C111557w;
import vl2.C22772v;
import vl2.C37751c0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00100\u001a\u00020\u001a¢\u0006\u0004\b.\u00101J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0016R\"\u0010)\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView;", "Landroid/widget/RelativeLayout;", "", "", "title", "Lrx3/b0;", "setScanTitle", "", "show", "setShowTitle", "Landroid/widget/TextView;", "getScanTitleView", "tips", "setScanTips", "getScanTipsView", "toast", "setScanToast", "setShowToast", "Lcom/tencent/mm/plugin/scanner/ui/ScannerFlashSwitcher;", "getFlashSwitcherView", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnGalleryClickListener", "setOnFlashSwitcherClickListener", "Landroid/view/View;", "getGalleryButton", "", "bottomHeight", "setBottomExtraHeight", "needAnimate", "setAnimateBackgroundView", "setFlashStatus", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "request", "setScanRequest", "D", "I", "getGalleryIconBottomMarginDelta", "()I", "setGalleryIconBottomMarginDelta", "(I)V", "galleryIconBottomMarginDelta", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView */
public final class ScanSharedMaskView extends RelativeLayout {

    /* renamed from: E */
    public static final /* synthetic */ int f53799E = 0;

    /* renamed from: A */
    public boolean f53800A;

    /* renamed from: B */
    public boolean f53801B;

    /* renamed from: C */
    public String f53802C;

    /* renamed from: D */
    public int f53803D;

    /* renamed from: d */
    public RelativeLayout f53804d;

    /* renamed from: e */
    public TextView f53805e;

    /* renamed from: f */
    public TextView f53806f;

    /* renamed from: g */
    public TextView f53807g;

    /* renamed from: h */
    public ScannerFlashSwitcher f53808h;

    /* renamed from: i */
    public View f53809i;

    /* renamed from: j */
    public ImageView f53810j;

    /* renamed from: n */
    public C71004i f53811n;

    /* renamed from: o */
    public int f53812o;

    /* renamed from: p */
    public boolean f53813p;

    /* renamed from: q */
    public TextureView f53814q;

    /* renamed from: r */
    public Bitmap f53815r;

    /* renamed from: s */
    public View.OnClickListener f53816s;

    /* renamed from: t */
    public View.OnClickListener f53817t;

    /* renamed from: u */
    public C22772v f53818u;

    /* renamed from: v */
    public C22772v f53819v;

    /* renamed from: w */
    public boolean f53820w;

    /* renamed from: x */
    public boolean f53821x;

    /* renamed from: y */
    public int f53822y;

    /* renamed from: z */
    public BaseScanRequest f53823z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView$b */
    public static final class C19121b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanSharedMaskView f53824d;

        /* renamed from: e */
        public final /* synthetic */ boolean f53825e;

        public C19121b(ScanSharedMaskView scanSharedMaskView, boolean z) {
            this.f53824d = scanSharedMaskView;
            this.f53825e = z;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ScanSharedMaskView scanSharedMaskView = this.f53824d;
            boolean z = this.f53825e;
            int i = ScanSharedMaskView.f53799E;
            scanSharedMaskView.mo24482h(z);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ScanSharedMaskView scanSharedMaskView = this.f53824d;
            boolean z = this.f53825e;
            int i = ScanSharedMaskView.f53799E;
            scanSharedMaskView.mo24482h(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView$a */
    public static final class C19122a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f53826d;

        /* renamed from: e */
        public final /* synthetic */ ScanSharedMaskView f53827e;

        /* renamed from: f */
        public final /* synthetic */ AnimatorListenerAdapter f53828f;

        public C19122a(boolean z, ScanSharedMaskView scanSharedMaskView, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f53826d = z;
            this.f53827e = scanSharedMaskView;
            this.f53828f = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f53826d) {
                ScanSharedMaskView scanSharedMaskView = this.f53827e;
                int i = ScanSharedMaskView.f53799E;
                scanSharedMaskView.mo24475f();
                ImageView imageView = this.f53827e.f53810j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                } else {
                    C87412m.m108603p("blurMaskView");
                    throw null;
                }
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationPause(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f53828f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanSharedMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo24470a(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        Bitmap bitmap = this.f53815r;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                ImageView imageView = this.f53810j;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    float f = z ? 0.0f : 1.0f;
                    float f2 = z ? 1.0f : 0.0f;
                    ImageView imageView2 = this.f53810j;
                    if (imageView2 != null) {
                        imageView2.setAlpha(f);
                        ImageView imageView3 = this.f53810j;
                        if (imageView3 != null) {
                            C111557w.m152065a(imageView3, f, f2, 150, new C19122a(z, this, animatorListenerAdapter));
                            return;
                        } else {
                            C87412m.m108603p("blurMaskView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("blurMaskView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("blurMaskView");
                    throw null;
                }
            }
        }
        ImageView imageView4 = this.f53810j;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        } else {
            C87412m.m108603p("blurMaskView");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo24471b(boolean z) {
        Log.m105927v("MicroMsg.ScanSharedMaskView", "alvinluo animateShow show: %b, alpha: %f", Boolean.valueOf(z), Float.valueOf(getAlpha()));
        float alpha = getAlpha();
        if (z && alpha < 1.0f) {
            C111557w.m152065a(this, alpha, 1.0f, 200, (Animator.AnimatorListener) null);
        } else if (!z && alpha > 0.0f) {
            C111557w.m152065a(this, alpha, 0.0f, 200, (Animator.AnimatorListener) null);
        }
    }

    /* renamed from: c */
    public final void mo24472c(boolean z) {
        BaseScanRequest baseScanRequest;
        Object[] objArr = new Object[2];
        boolean z2 = false;
        objArr[0] = Boolean.valueOf(z);
        TextView textView = this.f53806f;
        if (textView != null) {
            objArr[1] = Boolean.valueOf(textView.getVisibility() == 0);
            Log.m105919d("MicroMsg.ScanSharedMaskView", "alvinluo animateScanTips show: %b, visible: %b", objArr);
            if (z && (baseScanRequest = this.f53823z) != null) {
                C87412m.m108591d(baseScanRequest);
                if (baseScanRequest.f248897e) {
                    return;
                }
            }
            TextView textView2 = this.f53806f;
            if (textView2 != null) {
                if (textView2.getVisibility() == 0) {
                    TextView textView3 = this.f53806f;
                    if (textView3 != null) {
                        if (textView3.getAlpha() == 1.0f) {
                            z2 = true;
                        }
                        if (z2 && z) {
                            return;
                        }
                    } else {
                        C87412m.m108603p("scanTips");
                        throw null;
                    }
                }
                TextView textView4 = this.f53806f;
                if (textView4 == null) {
                    C87412m.m108603p("scanTips");
                    throw null;
                } else if (textView4.getVisibility() == 0 || z) {
                    mo24482h(true);
                    TextView textView5 = this.f53806f;
                    if (textView5 != null) {
                        C111557w.m152065a(textView5, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f, 200, new C19121b(this, z));
                    } else {
                        C87412m.m108603p("scanTips");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("scanTips");
                throw null;
            }
        } else {
            C87412m.m108603p("scanTips");
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo24473d() {
        this.f53813p = C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4;
    }

    /* renamed from: e */
    public void mo24474e(boolean z) {
        Log.m105925i("MicroMsg.ScanSharedMaskView", "alvinluo onFlashStatusChanged show: %b, isTitleShowing: %b", Boolean.valueOf(z), Boolean.valueOf(this.f53820w));
        if (this.f53821x != z) {
            this.f53821x = z;
            if (!this.f53820w) {
                mo24472c(!z);
            }
        }
    }

    /* renamed from: f */
    public final void mo24475f() {
        Bitmap bitmap = this.f53815r;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f53815r;
                C87412m.m108591d(bitmap2);
                bitmap2.recycle();
                this.f53815r = null;
            }
        }
    }

    /* renamed from: g */
    public final void mo24476g(boolean z) {
        BaseScanRequest baseScanRequest;
        int i = 8;
        if (!z || (baseScanRequest = this.f53823z) == null) {
            View view = this.f53809i;
            if (view != null) {
                if (z) {
                    i = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("galleryButton");
            throw null;
        }
        View view3 = this.f53809i;
        if (view3 != null) {
            C87412m.m108591d(baseScanRequest);
            if (!baseScanRequest.f248899g && z) {
                i = 0;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("galleryButton");
        throw null;
    }

    public ScannerFlashSwitcher getFlashSwitcherView() {
        ScannerFlashSwitcher scannerFlashSwitcher = this.f53808h;
        if (scannerFlashSwitcher != null) {
            return scannerFlashSwitcher;
        }
        C87412m.m108603p("flashSwitcher");
        throw null;
    }

    public View getGalleryButton() {
        View view = this.f53809i;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("galleryButton");
        throw null;
    }

    public final int getGalleryIconBottomMarginDelta() {
        return this.f53803D;
    }

    public TextView getScanTipsView() {
        TextView textView = this.f53806f;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("scanTips");
        throw null;
    }

    public TextView getScanTitleView() {
        TextView textView = this.f53805e;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("scanTitle");
        throw null;
    }

    /* renamed from: h */
    public final void mo24482h(boolean z) {
        BaseScanRequest baseScanRequest;
        int i = 0;
        if (!z || (baseScanRequest = this.f53823z) == null) {
            TextView textView = this.f53806f;
            if (textView != null) {
                if (!z) {
                    i = 8;
                }
                textView.setVisibility(i);
                return;
            }
            C87412m.m108603p("scanTips");
            throw null;
        }
        TextView textView2 = this.f53806f;
        if (textView2 != null) {
            C87412m.m108591d(baseScanRequest);
            if (baseScanRequest.f248897e || !z) {
                i = 8;
            }
            textView2.setVisibility(i);
            return;
        }
        C87412m.m108603p("scanTips");
        throw null;
    }

    /* renamed from: i */
    public final void mo24483i(int i) {
        if (this.f53813p) {
            mo24476g(true);
            TextView textView = this.f53806f;
            if (textView != null) {
                textView.setText(this.f53802C);
            } else {
                C87412m.m108603p("scanTips");
                throw null;
            }
        } else {
            boolean z = false;
            if (!(i == 12)) {
                if (!(i == 3)) {
                    if (C37751c0.m41521a(i)) {
                        C71004i iVar = this.f53811n;
                        if (iVar != null && ((BaseScanUI) iVar).f53577p0) {
                            z = true;
                        }
                        if (z) {
                            TextView textView2 = this.f53806f;
                            if (textView2 != null) {
                                textView2.setText(C0966R.string.idf);
                                return;
                            } else {
                                C87412m.m108603p("scanTips");
                                throw null;
                            }
                        }
                    }
                    mo24476g(true);
                    return;
                }
            }
            TextView textView3 = this.f53806f;
            if (textView3 != null) {
                textView3.setText(C0966R.string.idf);
                mo24476g(false);
                return;
            }
            C87412m.m108603p("scanTips");
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo24484j(int i) {
        int i2;
        int i3;
        TextView textView = this.f53806f;
        ViewGroup.LayoutParams layoutParams = null;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            boolean z = false;
            if (layoutParams2 == null) {
                layoutParams2 = null;
            } else if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (C37751c0.m41521a(i)) {
                    C71004i iVar = this.f53811n;
                    if (iVar != null && ((BaseScanUI) iVar).f53577p0) {
                        i3 = C76577a.m92151b(getContext(), 96) + this.f53822y;
                        i2 = this.f53803D;
                        marginLayoutParams.bottomMargin = i3 + i2;
                    }
                }
                i3 = C76577a.m92151b(getContext(), 120) + this.f53822y;
                i2 = this.f53803D;
                marginLayoutParams.bottomMargin = i3 + i2;
            }
            textView.setLayoutParams(layoutParams2);
            TextView textView2 = this.f53807g;
            if (textView2 != null) {
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = null;
                } else if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = C76577a.m92151b(getContext(), 110) + this.f53822y + this.f53803D;
                }
                textView2.setLayoutParams(layoutParams3);
                View view = this.f53809i;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (layoutParams4 == null) {
                        layoutParams4 = null;
                    } else if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = C76577a.m92151b(getContext(), 16) + this.f53822y + this.f53803D;
                    }
                    view.setLayoutParams(layoutParams4);
                    if (i == 3) {
                        z = true;
                    }
                    if (z) {
                        ScannerFlashSwitcher scannerFlashSwitcher = this.f53808h;
                        if (scannerFlashSwitcher != null) {
                            scannerFlashSwitcher.setVisibility(8);
                        } else {
                            C87412m.m108603p("flashSwitcher");
                            throw null;
                        }
                    } else {
                        ScannerFlashSwitcher scannerFlashSwitcher2 = this.f53808h;
                        if (scannerFlashSwitcher2 != null) {
                            ViewGroup.LayoutParams layoutParams5 = scannerFlashSwitcher2.getLayoutParams();
                            if (layoutParams5 != null) {
                                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = C76577a.m92151b(getContext(), 112) + this.f53822y + this.f53803D;
                                }
                                layoutParams = layoutParams5;
                            }
                            scannerFlashSwitcher2.setLayoutParams(layoutParams);
                            return;
                        }
                        C87412m.m108603p("flashSwitcher");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("galleryButton");
                    throw null;
                }
            } else {
                C87412m.m108603p("scanToast");
                throw null;
            }
        } else {
            C87412m.m108603p("scanTips");
            throw null;
        }
    }

    public void setAnimateBackgroundView(boolean z) {
        if (!z || this.f53814q == null) {
            Log.m105920e("MicroMsg.ScanSharedMaskView", "updateBackgroundBlurView not need show blurMaskView");
            ImageView imageView = this.f53810j;
            if (imageView != null) {
                imageView.setVisibility(8);
                mo24475f();
                return;
            }
            C87412m.m108603p("blurMaskView");
            throw null;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C78229n0(this));
    }

    public final void setBottomExtraHeight(int i) {
        this.f53822y = i;
    }

    public void setFlashStatus(boolean z) {
        Log.m105919d("MicroMsg.ScanSharedMaskView", "alvinluo setFlashStatus show: %b", Boolean.valueOf(z));
        this.f53821x = z;
    }

    public final void setGalleryIconBottomMarginDelta(int i) {
        this.f53803D = i;
    }

    public void setOnFlashSwitcherClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        this.f53817t = onClickListener;
    }

    public void setOnGalleryClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        this.f53816s = onClickListener;
        View view = this.f53809i;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("galleryButton");
            throw null;
        }
    }

    public void setScanRequest(BaseScanRequest baseScanRequest) {
        this.f53823z = baseScanRequest;
    }

    public void setScanTips(String str) {
        this.f53802C = str == null ? "" : str;
        TextView textView = this.f53806f;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("scanTips");
            throw null;
        }
    }

    public void setScanTitle(String str) {
        TextView textView = this.f53805e;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("scanTitle");
            throw null;
        }
    }

    public void setScanToast(String str) {
        TextView textView = this.f53807g;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("scanToast");
            throw null;
        }
    }

    public void setShowTitle(boolean z) {
        this.f53800A = z;
    }

    public void setShowToast(boolean z) {
        this.f53801B = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanSharedMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f53813p = true;
        this.f53800A = true;
        this.f53802C = "";
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b5_, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.brz);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.content_layout)");
        this.f53804d = (RelativeLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f359119j21);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.scan_title)");
        this.f53805e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f359118j20);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.scan_tip_tv)");
        this.f53806f = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f359120j22);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.scan_toast_tv)");
        this.f53807g = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.byu);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.dark_corner_mask)");
        ImageView imageView = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.j29);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.scanner_flash_switcher)");
        this.f53808h = (ScannerFlashSwitcher) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.j_0);
        C87412m.m108593f(findViewById7, "view.findViewById(R.id.select_from_gallery)");
        this.f53809i = findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.a3d);
        C87412m.m108593f(findViewById8, "view.findViewById(R.id.background_blur_mask_view)");
        this.f53810j = (ImageView) findViewById8;
        View view = this.f53809i;
        if (view != null) {
            view.setOnClickListener(new C78227j0(this));
            ScannerFlashSwitcher scannerFlashSwitcher = this.f53808h;
            if (scannerFlashSwitcher != null) {
                scannerFlashSwitcher.setOnClickListener(new C78228k0(this));
                TextView textView = this.f53805e;
                if (textView != null) {
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    mo24473d();
                    return;
                }
                C87412m.m108603p("scanTitle");
                throw null;
            }
            C87412m.m108603p("flashSwitcher");
            throw null;
        }
        C87412m.m108603p("galleryButton");
        throw null;
    }
}
