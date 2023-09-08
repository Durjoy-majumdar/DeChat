package com.tencent.p014mm.plugin.webview.p128ui.tools.bag;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96656b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f12.C7970a;
import gc0.C20828a;
import hc0.C20937c;
import kg3.C76577a;
import l93.C99348a;
import l93.C99349c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag */
public class WebViewBag extends FrameLayout {

    /* renamed from: v */
    public static final int f283056v = (((C76577a.m92159j(MMApplicationContext.getContext()) - C99348a.f291331b) - C99348a.f291333d) - C99348a.f291334e);

    /* renamed from: d */
    public WindowManager f283057d;

    /* renamed from: e */
    public View.OnClickListener f283058e;

    /* renamed from: f */
    public C96655b f283059f;

    /* renamed from: g */
    public ImageView f283060g;

    /* renamed from: h */
    public WebViewBagBgView f283061h;

    /* renamed from: i */
    public View f283062i;

    /* renamed from: j */
    public MMHandler f283063j;

    /* renamed from: n */
    public PointF f283064n = new PointF();

    /* renamed from: o */
    public Point f283065o = new Point();

    /* renamed from: p */
    public Point f283066p = new Point();

    /* renamed from: q */
    public Point f283067q = new Point();

    /* renamed from: r */
    public long f283068r;

    /* renamed from: s */
    public Point f283069s;

    /* renamed from: t */
    public boolean f283070t;

    /* renamed from: u */
    public Runnable f283071u = new C96654a();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag$a */
    public class C96654a implements Runnable {
        public C96654a() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            WebViewBag webViewBag = WebViewBag.this;
            float f = (((float) (currentTimeMillis - webViewBag.f283068r)) * 1.0f) / 200.0f;
            if (f <= 1.0f) {
                webViewBag.f283063j.postDelayed(webViewBag.f283071u, 5);
                WebViewBag webViewBag2 = WebViewBag.this;
                Point point = webViewBag2.f283066p;
                int i = point.x;
                Point point2 = webViewBag2.f283067q;
                int i2 = point.y;
                webViewBag2.mo134813c(i + ((int) (((((float) point2.x) * 1.0f) - ((float) i)) * f)), i2 + ((int) (((((float) point2.y) * 1.0f) - ((float) i2)) * f)));
                return;
            }
            Point point3 = webViewBag.f283067q;
            webViewBag.mo134813c(point3.x, point3.y);
            WebViewBag.this.onAnimationEnd();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag$b */
    public interface C96655b {
    }

    public WebViewBag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f283057d = (WindowManager) context.getSystemService("window");
        this.f283063j = new MMHandler();
        this.f283069s = new Point(C76577a.m92145A(MMApplicationContext.getContext()), C76577a.m92159j(MMApplicationContext.getContext()));
        LayoutInflater.from(context).inflate(C0966R.C0971layout.chv, this);
        this.f283060g = (ImageView) findViewById(C0966R.C0970id.f15);
        this.f283061h = (WebViewBagBgView) findViewById(C0966R.C0970id.a8a);
        this.f283062i = findViewById(C0966R.C0970id.iwc);
        this.f283061h.setStartColor(context.getResources().getColor(C0966R.color.ako));
        this.f283061h.setAngryColor(context.getResources().getColor(C0966R.color.akn));
    }

    /* renamed from: b */
    public void mo134812b(int i, int i2, long j) {
        WebViewBagBgView webViewBagBgView = this.f283061h;
        webViewBagBgView.f283083q = false;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.WebViewBagBgView", "setAngryInfo:%d now:%d", Long.valueOf(j), Long.valueOf(currentTimeMillis));
        webViewBagBgView.f283077h = i;
        webViewBagBgView.f283076g = i2;
        webViewBagBgView.f283078i = j;
        webViewBagBgView.mo134823a(currentTimeMillis);
        if (j > currentTimeMillis) {
            webViewBagBgView.postDelayed(new C99349c(webViewBagBgView), j - currentTimeMillis);
        } else {
            webViewBagBgView.f283083q = true;
        }
        webViewBagBgView.invalidate();
    }

    /* renamed from: c */
    public final void mo134813c(int i, int i2) {
        if (this.f283057d != null) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
            layoutParams.x = i;
            layoutParams.y = i2;
            try {
                this.f283057d.updateViewLayout(this, layoutParams);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.WebViewBag", th, "", new Object[0]);
            }
        }
    }

    /* renamed from: d */
    public void mo134814d() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100);
        animationSet.restrictDuration(150);
        animationSet.setFillAfter(true);
        this.f283062i.startAnimation(animationSet);
    }

    public Point getLastTouchDownViewPos() {
        return this.f283065o;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105925i("MicroMsg.WebViewBag", "onConfigurationChanged orientation:%d", Integer.valueOf(configuration.orientation));
        this.f283069s.x = C76577a.m92145A(MMApplicationContext.getContext());
        this.f283069s.y = C76577a.m92159j(MMApplicationContext.getContext());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C96656b bVar;
        boolean z;
        float f;
        float f2;
        float f3;
        if (!this.f283070t) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f283064n.x = motionEvent.getRawX();
            this.f283064n.y = motionEvent.getRawY();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
            Point point = this.f283065o;
            point.x = layoutParams.x;
            point.y = layoutParams.y;
        } else if (action != 1) {
            if (action == 2) {
                mo134813c((int) Math.max(Math.min((((float) this.f283065o.x) + motionEvent.getRawX()) - this.f283064n.x, (float) this.f283069s.x), 0.0f), (int) Math.max(Math.min((((float) this.f283065o.y) + motionEvent.getRawY()) - this.f283064n.y, (float) this.f283069s.y), 0.0f));
            }
        } else if (Math.abs(motionEvent.getRawX() - this.f283064n.x) >= ((float) BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 3.0f)) || Math.abs(motionEvent.getRawY() - this.f283064n.y) >= ((float) BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 3.0f))) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f283066p.x = (int) Math.max(Math.min((((float) this.f283065o.x) + rawX) - this.f283064n.x, (float) this.f283069s.x), 0.0f);
            this.f283066p.y = (int) Math.max(Math.min((((float) this.f283065o.y) + rawY) - this.f283064n.y, (float) this.f283069s.y), 0.0f);
            int width = this.f283066p.x + (getWidth() / 2);
            int i = this.f283069s.x;
            if (width <= i / 2) {
                this.f283067q.x = C99348a.f291334e;
            } else {
                this.f283067q.x = (i - getWidth()) - C99348a.f291334e;
            }
            Point point2 = this.f283067q;
            int i2 = this.f283066p.y;
            point2.y = i2;
            if (i2 == 0) {
                point2.y = C99348a.f291334e;
            } else {
                int i3 = f283056v;
                if (i2 > i3) {
                    point2.y = i3;
                }
            }
            this.f283068r = System.currentTimeMillis();
            this.f283063j.postDelayed(this.f283071u, 5);
            C96655b bVar2 = this.f283059f;
            if (bVar2 != null) {
                Point point3 = this.f283067q;
                int i4 = point3.x;
                int i5 = point3.y;
                C96657c.C96659b bVar3 = (C96657c.C96659b) bVar2;
                C96657c.this.mo134831e(19);
                C96657c.C96661d dVar = C96657c.this.f283102h;
                dVar.f283111e = i4;
                dVar.f283110d = i5;
                dVar.mo134837a();
            }
        } else {
            View.OnClickListener onClickListener = this.f283058e;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
        }
        C96655b bVar4 = this.f283059f;
        if (!(bVar4 == null || (bVar = C96657c.this.f283099e) == null)) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                PointF pointF = bVar.f283090d;
                pointF.x = rawX2;
                pointF.y = rawY2;
                bVar.f283089c = false;
                bVar.f283091e = false;
            } else if (action2 == 1) {
                if (bVar.f283091e) {
                    C96657c.C96658a aVar = (C96657c.C96658a) bVar.f283088b;
                    C96657c.this.mo134831e(17);
                    Point point4 = null;
                    WebViewBag webViewBag = C96657c.this.f283098d;
                    if (webViewBag != null) {
                        point4 = webViewBag.getLastTouchDownViewPos();
                    }
                    C96657c.this.mo134830c();
                    if (point4 != null) {
                        C96657c.C96661d dVar2 = C96657c.this.f283102h;
                        dVar2.f283111e = point4.x;
                        dVar2.f283110d = point4.y;
                        dVar2.mo134837a();
                    }
                } else if (bVar.f283092f) {
                    bVar.f283092f = false;
                    C96656b.C72599a aVar2 = bVar.f283087a;
                    aVar2.getClass();
                    float f4 = (float) C99348a.f291336g;
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, f4, 0.0f, f4);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.setDuration(300);
                    animationSet.setAnimationListener(new C85569a(aVar2));
                    aVar2.f211216d.startAnimation(animationSet);
                    aVar2.f211217e.startAnimation(animationSet);
                }
                bVar.f283089c = false;
                bVar.f283091e = false;
            } else if (action2 == 2) {
                if (bVar.f283089c) {
                    z = true;
                } else {
                    PointF pointF2 = bVar.f283090d;
                    float f5 = rawX2 - pointF2.x;
                    float f6 = rawY2 - pointF2.y;
                    z = ((f5 * f5) + (f6 * f6)) - 900.0f > 0.0f;
                    bVar.f283089c = z;
                }
                if (z) {
                    if (!bVar.f283092f) {
                        int c = C75044y4.m89991c(MMApplicationContext.getContext());
                        Log.m105925i("MicroMsg.BagIndicatorController", "getNavigationBarHeight height:%d", Integer.valueOf(c));
                        C99348a.f291330a = c;
                        bVar.f283092f = true;
                        bVar.f283094h = C76577a.m92145A(MMApplicationContext.getContext());
                        int j = C76577a.m92159j(MMApplicationContext.getContext());
                        bVar.f283093g = j;
                        boolean z2 = bVar.f283094h > j;
                        bVar.f283095i = z2;
                        Log.m105925i("MicroMsg.BagCancelController", "updateOrientation mIsLandScape:%b", Boolean.valueOf(z2));
                        C96656b.C72599a aVar3 = bVar.f283087a;
                        aVar3.setVisibility(0);
                        float f7 = (float) C99348a.f291336g;
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(f7, 0.0f, f7, 0.0f);
                        translateAnimation2.setFillAfter(true);
                        translateAnimation2.setDuration(200);
                        aVar3.f211216d.startAnimation(translateAnimation2);
                        aVar3.f211217e.startAnimation(translateAnimation2);
                    }
                    boolean z3 = bVar.f283091e;
                    if (bVar.f283095i) {
                        f3 = (((float) bVar.f283094h) - motionEvent.getRawX()) - ((float) C99348a.f291330a);
                        f2 = (float) bVar.f283093g;
                        f = motionEvent.getRawY();
                    } else {
                        f3 = ((float) bVar.f283094h) - motionEvent.getRawX();
                        f2 = ((float) bVar.f283093g) - motionEvent.getRawY();
                        f = (float) C99348a.f291330a;
                    }
                    float f8 = f2 - f;
                    if ((f3 * f3) + (f8 * f8) < ((float) C96656b.f283086j)) {
                        bVar.f283091e = true;
                    } else {
                        bVar.f283091e = false;
                    }
                    boolean z4 = bVar.f283091e;
                    if (z4 != z3) {
                        C96656b.C72599a aVar4 = bVar.f283087a;
                        aVar4.getClass();
                        if (z4) {
                            aVar4.mo100017a(1.0f, C99348a.f291337h);
                            Vibrator vibrator = aVar4.f211218f;
                            if (vibrator != null) {
                                vibrator.vibrate(10);
                            }
                        } else {
                            aVar4.mo100017a(C99348a.f291337h, 1.0f);
                        }
                    }
                }
            }
        }
        return true;
    }

    public void setIcon(String str) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59364t = true;
        bVar.f59346b = true;
        bVar.f59351g = C7970a.m8127a();
        bVar.f59359o = C0966R.raw.webview_bag_default_icon;
        C20828a.m22825b().mo32519h(str, this.f283060g, bVar.mo32666a());
    }

    public void setListener(C96655b bVar) {
        this.f283059f = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f283058e = onClickListener;
    }

    public void setTouchEnable(boolean z) {
        Log.m105925i("MicroMsg.WebViewBag", "setTouchEnable enable:%b", Boolean.valueOf(z));
        this.f283070t = z;
    }
}
