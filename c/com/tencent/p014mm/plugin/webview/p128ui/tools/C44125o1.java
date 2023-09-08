package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.LogoWebViewWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import t83.C13851h1;
import t83.C48590l;
import t83.C48598o0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.o1 */
public final class C44125o1 implements LogoWebViewWrapper.C43796c {

    /* renamed from: a */
    public C44127b f119525a;

    /* renamed from: b */
    public ImageView f119526b;

    /* renamed from: c */
    public LogoWebViewWrapper f119527c;

    /* renamed from: d */
    public int f119528d = 0;

    /* renamed from: e */
    public boolean f119529e = false;

    /* renamed from: f */
    public boolean f119530f = false;

    /* renamed from: g */
    public boolean f119531g = false;

    /* renamed from: h */
    public int f119532h = 0;

    /* renamed from: i */
    public float f119533i = 0.0f;

    /* renamed from: j */
    public ValueAnimator f119534j;

    /* renamed from: k */
    public ViewPropertyAnimator f119535k;

    /* renamed from: l */
    public float f119536l;

    /* renamed from: m */
    public View f119537m;

    /* renamed from: n */
    public View f119538n;

    /* renamed from: o */
    public TextView f119539o;

    /* renamed from: p */
    public boolean f119540p = true;

    /* renamed from: q */
    public boolean f119541q = (true ^ WeChatBrands.AppInfo.current().isMainland());

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.o1$a */
    public class C44126a extends AnimatorListenerAdapter {
        public C44126a() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C44125o1.this.f119535k = null;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C44125o1.this.f119535k = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.o1$b */
    public interface C44127b {
    }

    /* renamed from: a */
    public void mo68756a() {
        this.f119529e = false;
        mo68766j();
        if (this.f119540p && this.f119538n != null) {
            mo68760e(false);
            LogoWebViewWrapper logoWebViewWrapper = this.f119527c;
            if (logoWebViewWrapper != null) {
                logoWebViewWrapper.setReleaseTargetHeight(0);
            }
            mo68764h();
        }
    }

    /* renamed from: b */
    public void mo68757b() {
        View view = this.f119538n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public void mo68758c(int i, boolean z) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(z);
        ImageView imageView = this.f119526b;
        String str = "null";
        objArr[2] = imageView == null ? str : String.valueOf(imageView.getVisibility());
        ImageView imageView2 = this.f119526b;
        objArr[3] = imageView2 == null ? str : imageView2.getDrawable().toString();
        ImageView imageView3 = this.f119526b;
        if (imageView3 != null) {
            str = String.valueOf(imageView3.getAlpha());
        }
        objArr[4] = str;
        Log.m105927v("MicroMsg.WebViewPullDownLogoDelegate", "onOverScrollOffset, offset = %d, pointerDown = %b, refreshImage.visibility = %s, refreshImage.drawable = %s, refreshImage.alpha = %s", objArr);
        if (this.f119529e) {
            if (i == 0) {
                this.f119531g = false;
            }
            if (this.f119526b != null) {
                if (z) {
                    int abs = Math.abs(i);
                    int i2 = this.f119528d;
                    if (abs >= i2) {
                        LogoWebViewWrapper logoWebViewWrapper = this.f119527c;
                        if (logoWebViewWrapper != null) {
                            logoWebViewWrapper.setReleaseTargetHeight(i2);
                        }
                    } else {
                        LogoWebViewWrapper logoWebViewWrapper2 = this.f119527c;
                        if (logoWebViewWrapper2 != null) {
                            logoWebViewWrapper2.setReleaseTargetHeight(0);
                        }
                    }
                } else if (Math.abs(i) > this.f119528d && !this.f119530f) {
                    Log.m105918d("MicroMsg.WebViewPullDownLogoDelegate", "startLoading()");
                    mo68765i();
                    return;
                } else if (this.f119530f) {
                    return;
                }
                ImageView imageView4 = this.f119526b;
                if (imageView4 != null && imageView4.getAlpha() < 1.0f && this.f119535k == null && z) {
                    Log.m105918d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage alpha to 1.0f");
                    ViewPropertyAnimator duration = this.f119526b.animate().alpha(1.0f).setDuration(500);
                    this.f119535k = duration;
                    duration.setListener(new C44126a());
                    this.f119535k.start();
                }
                if (!this.f119531g) {
                    int i3 = -i;
                    int i4 = i3 - this.f119532h;
                    int i5 = Math.abs(i) >= this.f119528d ? i4 * 5 : i4 * 2;
                    this.f119532h = i3;
                    float width = ((float) this.f119526b.getWidth()) / 2.0f;
                    this.f119533i -= (float) i5;
                    this.f119526b.setScaleType(ImageView.ScaleType.MATRIX);
                    Matrix imageMatrix = this.f119526b.getImageMatrix();
                    imageMatrix.postRotate((float) (-i5), width, ((float) this.f119526b.getHeight()) / 2.0f);
                    this.f119526b.setImageMatrix(imageMatrix);
                    this.f119526b.setImageResource(C0966R.C0969drawable.cfk);
                }
                this.f119526b.invalidate();
            }
        }
    }

    /* renamed from: d */
    public void mo68759d() {
        LogoWebViewWrapper logoWebViewWrapper = this.f119527c;
        if (logoWebViewWrapper != null) {
            FrameLayout frameLayout = logoWebViewWrapper.f118316e;
            if (frameLayout != null) {
                frameLayout.removeView(logoWebViewWrapper.f118315d);
                logoWebViewWrapper.f118315d = null;
            }
            LogoWebViewWrapper logoWebViewWrapper2 = this.f119527c;
            logoWebViewWrapper2.f118327s = null;
            logoWebViewWrapper2.getClass();
        }
        View view = this.f119537m;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
        }
        this.f119527c = null;
        this.f119526b = null;
        this.f119532h = 0;
        ValueAnimator valueAnimator = this.f119534j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f119534j = null;
        }
    }

    /* renamed from: e */
    public void mo68760e(boolean z) {
        LogoWebViewWrapper logoWebViewWrapper = this.f119527c;
        if (logoWebViewWrapper != null && logoWebViewWrapper.f118324p != z) {
            logoWebViewWrapper.f118324p = z;
            boolean z2 = false;
            if (z) {
                logoWebViewWrapper.f118318g = false;
                logoWebViewWrapper.f118323o = 0;
            }
            mo68757b();
            if (!WeChatBrands.AppInfo.current().isMainland() || z) {
                z2 = true;
            }
            this.f119541q = z2;
        }
    }

    /* renamed from: f */
    public void mo68761f(String str) {
        if (!this.f119540p || this.f119541q) {
            mo68760e(true);
            View view = this.f119538n;
            if (view != null && view.getVisibility() == 0) {
                mo68757b();
            }
        } else if (this.f119539o == null) {
        } else {
            if (!Util.isNullOrNil(str)) {
                String host = Uri.parse(str).getHost();
                if (Util.isNullOrNil(host)) {
                    this.f119539o.setVisibility(8);
                    return;
                }
                String string = this.f119539o.getContext().getString(C0966R.string.lga, new Object[]{host});
                this.f119539o.setVisibility(0);
                this.f119539o.setText(string);
                mo68760e(false);
                return;
            }
            this.f119539o.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void mo68762g(int i) {
        View view = this.f119537m;
        if (view != null) {
            view.setBackgroundColor(i);
            Log.m105919d("MicroMsg.WebViewPullDownLogoDelegate", "setLogoBackgroundColor %d", Integer.valueOf(i));
        }
    }

    public float getStartLoadingStep() {
        return this.f119536l;
    }

    /* renamed from: h */
    public void mo68764h() {
        View view = this.f119538n;
        if (view != null && !this.f119541q) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: i */
    public void mo68765i() {
        ImageView imageView;
        LogoWebViewWrapper logoWebViewWrapper;
        if (!this.f119530f && (imageView = this.f119526b) != null && (logoWebViewWrapper = this.f119527c) != null) {
            this.f119530f = true;
            logoWebViewWrapper.f118324p = true;
            logoWebViewWrapper.f118318g = false;
            logoWebViewWrapper.f118323o = 0;
            imageView.clearAnimation();
            ValueAnimator valueAnimator = this.f119534j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.f119533i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "startLoadingStep", new float[]{0.0f + f, f + 354.0f});
            this.f119534j = ofFloat;
            ofFloat.setDuration(960);
            this.f119534j.setRepeatMode(1);
            this.f119534j.setRepeatCount(-1);
            this.f119534j.setInterpolator(new LinearInterpolator());
            this.f119534j.start();
            C44127b bVar = this.f119525a;
            if (bVar != null) {
                Log.m105918d("MicroMsg.WebViewUI", "onPullDownRefresh, start");
                C48590l lVar = ((C44205v1) bVar).f119751a.f118508Z;
                if (lVar == null) {
                    return;
                }
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, not ready");
                    return;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "onPullDownRefresh success, ready");
                MMHandlerThread.postToMainThread(new C48598o0(lVar, C48590l.m53980t(C13851h1.C13852a.m13143c("onPullDownRefresh", (Map<String, Object>) null, lVar.f130011p, lVar.f130012q))));
            }
        }
    }

    /* renamed from: j */
    public void mo68766j() {
        if (this.f119530f) {
            Log.m105918d("MicroMsg.WebViewPullDownLogoDelegate", "stopLoading()");
            this.f119531g = true;
            this.f119530f = false;
            LogoWebViewWrapper logoWebViewWrapper = this.f119527c;
            if (logoWebViewWrapper != null && this.f119529e) {
                logoWebViewWrapper.f118324p = false;
            }
            ValueAnimator valueAnimator = this.f119534j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            LogoWebViewWrapper logoWebViewWrapper2 = this.f119527c;
            if (logoWebViewWrapper2 != null) {
                logoWebViewWrapper2.mo68167b(0, 250);
            }
            if (this.f119526b != null) {
                Log.m105918d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage, alpha to 0f");
                this.f119526b.animate().alpha(0.0f).setDuration(500).start();
            }
        }
    }

    public void setStartLoadingStep(float f) {
        this.f119536l = f;
        this.f119526b.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix imageMatrix = this.f119526b.getImageMatrix();
        ImageView imageView = this.f119526b;
        float f2 = 0.0f;
        float width = imageView == null ? 0.0f : ((float) imageView.getWidth()) / 2.0f;
        ImageView imageView2 = this.f119526b;
        if (imageView2 != null) {
            f2 = ((float) imageView2.getHeight()) / 2.0f;
        }
        imageMatrix.setRotate(f, width, f2);
        this.f119533i = f;
        this.f119526b.invalidate();
    }
}
