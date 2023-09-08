package wg1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: wg1.s */
public final class C15349s implements C15328o {

    /* renamed from: d */
    public final View f41690d;

    /* renamed from: e */
    public final MMActivity f41691e;

    /* renamed from: f */
    public final C0000n0 f41692f = C53930o0.m60555b();

    /* renamed from: g */
    public C53973z1 f41693g;

    /* renamed from: h */
    public FrameLayout f41694h;

    /* renamed from: i */
    public PAGView f41695i;

    /* renamed from: j */
    public ImageView f41696j;

    /* renamed from: wg1.s$a */
    public static final class C15350a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C15349s f41697d;

        /* renamed from: e */
        public final /* synthetic */ String f41698e;

        public C15350a(C15349s sVar, String str) {
            this.f41697d = sVar;
            this.f41698e = str;
        }

        public void onAnimationCancel(PAGView pAGView) {
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationCancel view=" + pAGView);
            View view = this.f41697d.f41690d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationEnd(PAGView pAGView) {
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationEnd view=" + pAGView);
            View view = this.f41697d.f41690d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationRepeat view=" + pAGView);
        }

        public void onAnimationStart(PAGView pAGView) {
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationStart view=" + pAGView);
            C15349s sVar = this.f41697d;
            String str = this.f41698e;
            FrameLayout frameLayout = sVar.f41694h;
            if (frameLayout != null) {
                C53973z1 z1Var = sVar.f41693g;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                sVar.f41693g = C53895h.m60466d(sVar.f41692f, (C66212f) null, (C53934p0) null, new C15337q(sVar, frameLayout, str, (C15601d<? super C15337q>) null), 3, (Object) null);
            }
        }
    }

    public C15349s(View view, MMActivity mMActivity, C15324n nVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41690d = view;
        this.f41691e = mMActivity;
        this.f41694h = (FrameLayout) view.findViewById(C0966R.C0970id.f358050d72);
        this.f41696j = (ImageView) view.findViewById(C0966R.C0970id.fd8);
        if (this.f41695i == null) {
            Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#initSmallAnim create smallAnim!");
            FrameLayout frameLayout = this.f41694h;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            PAGView pAGView = new PAGView(view.getContext());
            this.f41695i = pAGView;
            pAGView.setScaleMode(1);
            FrameLayout frameLayout2 = this.f41694h;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f41695i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m14336p(java.lang.String r10, wg1.C15349s r11, wx3.C15601d r12) {
        /*
            boolean r0 = r12 instanceof wg1.C15344r
            if (r0 == 0) goto L_0x0013
            r0 = r12
            wg1.r r0 = (wg1.C15344r) r0
            int r1 = r0.f41684g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41684g = r1
            goto L_0x0018
        L_0x0013:
            wg1.r r0 = new wg1.r
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f41683f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f41684g
            java.lang.String r3 = "alpha"
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r6) goto L_0x003b
            if (r2 != r5) goto L_0x0033
            java.lang.Object r10 = r0.f41681d
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ee
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            java.lang.Object r10 = r0.f41682e
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.Object r11 = r0.f41681d
            wg1.s r11 = (wg1.C15349s) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00bc
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "FinderLiveAllowanceGiftPagViewCallback"
            java.lang.String r2 = "#onPagAnimationStart.showIcon scope show icon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            if (r10 == 0) goto L_0x0061
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x005c
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = 0
        L_0x005d:
            if (r10 != r6) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 == 0) goto L_0x00ff
            android.widget.ImageView r10 = r11.f41696j
            if (r10 == 0) goto L_0x00ff
            r10.setAlpha(r4)
            r10.setScaleX(r4)
            r10.setScaleY(r4)
            r10.setScaleY(r4)
            r10.setTranslationY(r4)
            r10.setVisibility(r7)
            float[] r12 = new float[r5]
            r12 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r10, r3, r12)
            r8 = 200(0xc8, double:9.9E-322)
            r12.setDuration(r8)
            r12.start()
            float[] r12 = new float[r5]
            r12 = {1050253722, 1065353216} // fill-array
            java.lang.String r2 = "scaleX"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r10, r2, r12)
            r12.setDuration(r8)
            r12.start()
            float[] r12 = new float[r5]
            r12 = {1050253722, 1065353216} // fill-array
            java.lang.String r2 = "scaleY"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r10, r2, r12)
            r12.setDuration(r8)
            r12.start()
            r0.f41681d = r11
            r0.f41682e = r10
            r0.f41684g = r6
            java.lang.Object r12 = a14.C53965x0.m60607b(r8, r0)
            if (r12 != r1) goto L_0x00bc
            goto L_0x0101
        L_0x00bc:
            float[] r12 = new float[r5]
            r12[r7] = r4
            android.view.View r11 = r11.f41690d
            android.content.Context r11 = r11.getContext()
            r2 = -1044381696(0xffffffffc1c00000, float:-24.0)
            int r11 = zp3.C79406f.m96347a(r11, r2)
            float r11 = (float) r11
            r12[r6] = r11
            java.lang.String r11 = "translationY"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r10, r11, r12)
            r6 = 900(0x384, double:4.447E-321)
            r11.setDuration(r6)
            r11.start()
            r11 = 1300(0x514, double:6.423E-321)
            r0.f41681d = r10
            r2 = 0
            r0.f41682e = r2
            r0.f41684g = r5
            java.lang.Object r11 = a14.C53965x0.m60607b(r11, r0)
            if (r11 != r1) goto L_0x00ee
            goto L_0x0101
        L_0x00ee:
            float[] r11 = new float[r5]
            r11 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r3, r11)
            r11 = 400(0x190, double:1.976E-321)
            r10.setDuration(r11)
            r10.start()
        L_0x00ff:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0101:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15349s.m14336p(java.lang.String, wg1.s, wx3.d):java.lang.Object");
    }

    /* renamed from: R */
    public void mo14174R(String str) {
        Log.m105924i("FinderLiveAllowanceGiftPagViewCallback", "#showPagView giftIcon=" + str);
        PAGView pAGView = this.f41695i;
        if (pAGView != null) {
            pAGView.addListener(new C15350a(this, str));
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            ImageView imageView = this.f41696j;
            if (imageView != null) {
                imageView.setVisibility(8);
                boolean z = false;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    C39818r rVar = C39818r.f106831a;
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                }
            }
            Point b = C75044y4.m89990b(MMApplicationContext.getContext());
            int min = Math.min(b.x, b.y);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, min);
            PAGView pAGView2 = this.f41695i;
            if (pAGView2 != null) {
                pAGView2.setLayoutParams(layoutParams);
            }
            pAGView.stop();
            pAGView.setComposition(PAGFile.Load(this.f41691e.getAssets(), "finder_live_allowance_gift_bubble_trans.pag"));
            pAGView.setRepeatCount(1);
            pAGView.setProgress(0.0d);
            pAGView.play();
            pAGView.flush();
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f41691e;
    }
}
