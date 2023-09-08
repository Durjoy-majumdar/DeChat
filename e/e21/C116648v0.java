package e21;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import e21.C116645t;
import e21.C116673y0;
import java.util.LinkedList;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;
import te3.C118460qp;
import te3.C118466sp;
import ub3.C78144b;

/* renamed from: e21.v0 */
public class C116648v0 {

    /* renamed from: e21.v0$a */
    public class C116649a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349773d;

        public C116649a(C116673y0.C116675c cVar) {
            this.f349773d = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.LayoutParams layoutParams = this.f349773d.f349908h.getLayoutParams();
            layoutParams.height = (int) floatValue;
            this.f349773d.f349908h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e21.v0$b */
    public class C116650b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349774d;

        public C116650b(C116673y0.C116675c cVar) {
            this.f349774d = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewGroup.LayoutParams layoutParams = this.f349774d.f349908h.getLayoutParams();
            layoutParams.height = -2;
            this.f349774d.f349908h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e21.v0$c */
    public class C116651c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349775d;

        public C116651c(C116673y0.C116675c cVar) {
            this.f349775d = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f349775d.f349908h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: e21.v0$d */
    public class C116652d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349776d;

        public C116652d(C116673y0.C116675c cVar) {
            this.f349776d = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f349776d.f349905e.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: e21.v0$e */
    public class C116653e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349777d;

        /* renamed from: e */
        public final /* synthetic */ C116673y0.C116674b f349778e;

        public C116653e(C116673y0.C116675c cVar, C116673y0.C116674b bVar) {
            this.f349777d = cVar;
            this.f349778e = bVar;
        }

        public void run() {
            ViewGroup.LayoutParams layoutParams = this.f349777d.f349888L.getLayoutParams();
            if (this.f349777d.f349910j.getHeight() != 0) {
                layoutParams.height = this.f349777d.f349910j.getHeight();
            } else {
                layoutParams.height = (int) this.f349778e.f349875y;
            }
            this.f349777d.f349888L.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e21.v0$f */
    public class C116654f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f349779d;

        /* renamed from: e */
        public final /* synthetic */ C116673y0.C116674b f349780e;

        public C116654f(C116673y0.C116675c cVar, C116673y0.C116674b bVar) {
            this.f349779d = cVar;
            this.f349780e = bVar;
        }

        public void run() {
            ViewGroup.LayoutParams layoutParams = this.f349779d.f349888L.getLayoutParams();
            if (this.f349779d.f349910j.getHeight() != 0) {
                layoutParams.height = this.f349779d.f349910j.getHeight();
            } else {
                layoutParams.height = (int) this.f349780e.f349875y;
            }
            this.f349779d.f349888L.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e21.v0$g */
    public static class C116655g {

        /* renamed from: a */
        public boolean f349781a;

        /* renamed from: b */
        public int f349782b;

        /* renamed from: c */
        public Context f349783c;

        /* renamed from: d */
        public C116673y0.C116674b f349784d;

        /* renamed from: e */
        public C116673y0.C116675c f349785e;

        /* renamed from: f */
        public LinkedList<C116645t.C116647b> f349786f = new LinkedList<>();

        /* renamed from: g */
        public WalletCollectQrCodeUI f349787g;

        /* renamed from: h */
        public int f349788h;

        /* renamed from: i */
        public int f349789i;

        /* renamed from: j */
        public int f349790j;

        /* renamed from: k */
        public int f349791k;

        /* renamed from: l */
        public int f349792l;

        public C116655g(int i, Context context, C116673y0.C116674b bVar, C116673y0.C116675c cVar, WalletCollectQrCodeUI walletCollectQrCodeUI) {
            this.f349782b = i;
            this.f349783c = context;
            this.f349784d = bVar;
            this.f349785e = cVar;
            this.f349787g = walletCollectQrCodeUI;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f349788h = ((displayMetrics.widthPixels / 2) - C76577a.m92151b(context, 8)) - C76577a.m92151b(context, 16);
            this.f349790j = C76577a.m92151b(context, 52);
            this.f349791k = C76577a.m92151b(context, 35);
            this.f349792l = C76577a.m92151b(context, 60);
            this.f349789i = C76577a.m92151b(context, 64);
        }

        /* renamed from: a */
        public void mo180650a(int i) {
            int i2 = i == 0 ? this.f349782b : i;
            if (this.f349781a) {
                Log.m105918d("MicroMsg.ToastAnimationHelper", "Animating, wait. QueueSize=" + this.f349786f.size());
            } else if (!this.f349786f.isEmpty()) {
                C116645t.C116647b poll = this.f349786f.poll();
                if (i2 == 0) {
                    i2 = this.f349782b;
                }
                Log.m105925i("MicroMsg.ToastAnimationHelper", "[doAnimation]，needRefreshType：%s", Integer.valueOf(i2));
                this.f349781a = true;
                this.f349785e.f349899W.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f349783c, poll.f349760n, this.f349785e.f349899W.getTextSize()));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f349785e.f349893Q.getLayoutParams();
                if (this.f349785e.f349902b.getVisibility() == 0) {
                    this.f349785e.f349894R.setVisibility(0);
                    layoutParams.height = this.f349785e.f349910j.getHeight() + this.f349785e.f349902b.getHeight();
                } else {
                    this.f349785e.f349894R.setVisibility(8);
                    layoutParams.height = this.f349785e.f349910j.getHeight();
                }
                layoutParams.width = this.f349785e.f349910j.getWidth();
                this.f349785e.f349893Q.setLayoutParams(layoutParams);
                if (this.f349782b == 2) {
                    this.f349785e.f349898V.setRoundCorner(true);
                    this.f349785e.f349898V.setRoundCornerRate(0.1f);
                    this.f349785e.f349898V.mo100288c(poll.f349764r, 0, 0, C0966R.C0969drawable.bfa);
                } else {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f349785e.f349898V, poll.f349753d);
                }
                this.f349785e.f349900X.setText(C75228t.m90258m(poll.f349755f, poll.f349756g));
                this.f349785e.f349893Q.setVisibility(0);
                this.f349785e.f349896T.setRotation(270.0f);
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
                int i3 = 0;
                for (int i4 = 0; i4 < ((LinkedList) this.f349784d.f349873w).size(); i4++) {
                    if (((C116645t.C116647b) ((LinkedList) this.f349784d.f349873w).get(i4)).f349754e.equals(poll.f349754e)) {
                        i3 = i4;
                    }
                }
                animationSet.addAnimation(new TranslateAnimation(0.0f, (float) this.f349788h, 0.0f, (float) ((this.f349785e.f349902b.getVisibility() == 0 ? (this.f349785e.f349910j.getHeight() + this.f349789i) / 2 : this.f349785e.f349910j.getHeight() / 2) + 0 + this.f349792l + (i3 * this.f349790j) + this.f349791k)));
                animationSet.setDuration(300);
                animationSet.setInterpolator(new DecelerateInterpolator());
                animationSet.setAnimationListener(new C116656w0(this, poll, i2));
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                scaleAnimation.setAnimationListener(new C116659x0(this, animationSet));
                this.f349785e.f349893Q.startAnimation(scaleAnimation);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0155, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r0, 0) != false) goto L_0x015a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m164515a(android.content.Context r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, int r25, p755xs.C102720b.C78973a r26, boolean r27, int r28, float r29, boolean r30, double r31) {
        /*
            r0 = r28
            r1 = r29
            java.lang.Class<xs.b> r2 = p755xs.C102720b.class
            java.lang.String r3 = "MicroMsg.WalletCollectQrCodeLogic"
            r4 = r25
            float r4 = (float) r4
            r5 = 1052602532(0x3ebd70a4, float:0.37)
            float r5 = r5 * r4
            int r5 = (int) r5
            r6 = 1050589266(0x3e9eb852, float:0.31)
            float r6 = r6 * r4
            int r6 = (int) r6
            r7 = 1049247089(0x3e8a3d71, float:0.27)
            float r7 = r7 * r4
            int r7 = (int) r7
            r8 = 1040925590(0x3e0b4396, float:0.136)
            float r4 = r4 * r8
            int r4 = (int) r4
            r8 = 0
            android.graphics.Paint r10 = new android.graphics.Paint     // Catch:{ Exception -> 0x0177 }
            r10.<init>()     // Catch:{ Exception -> 0x0177 }
            r11 = 1
            r10.setAntiAlias(r11)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r5, r5, r11)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r6, r6, r12)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Paint r15 = new android.graphics.Paint     // Catch:{ Exception -> 0x0177 }
            r15.<init>()     // Catch:{ Exception -> 0x0177 }
            r14 = -1
            r15.setColor(r14)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Canvas r13 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0177 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0177 }
            r16 = 0
            r17 = 0
            int r14 = r12.getWidth()     // Catch:{ Exception -> 0x0177 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0177 }
            int r9 = r12.getHeight()     // Catch:{ Exception -> 0x0177 }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0177 }
            r19 = r13
            r18 = r14
            r14 = r16
            r25 = r15
            r15 = r17
            r16 = r18
            r17 = r9
            r18 = r25
            r13.drawRect(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0177 }
            r9 = 0
            r13 = r25
            r14 = r19
            r14.drawBitmap(r12, r9, r9, r13)     // Catch:{ Exception -> 0x0177 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r23)     // Catch:{ Exception -> 0x0177 }
            if (r13 != 0) goto L_0x0093
            e21.p r13 = new e21.p     // Catch:{ Exception -> 0x0177 }
            r14 = r23
            r13.<init>(r14)     // Catch:{ Exception -> 0x0177 }
            di3.d r14 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0177 }
            xs.b r14 = (p755xs.C102720b) r14     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r13 = r14.mo142104N6(r13)     // Catch:{ Exception -> 0x0177 }
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0177 }
            xs.b r2 = (p755xs.C102720b) r2     // Catch:{ Exception -> 0x0177 }
            r14 = r26
            r2.U70(r14)     // Catch:{ Exception -> 0x0177 }
            goto L_0x0094
        L_0x0093:
            r13 = r8
        L_0x0094:
            r2 = 1031127695(0x3d75c28f, float:0.06)
            if (r13 != 0) goto L_0x00b2
            if (r30 == 0) goto L_0x00b2
            java.lang.String r13 = "avatar == null,use own avatar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)     // Catch:{ Exception -> 0x0177 }
            java.lang.Class<ln.i> r13 = p196ln.C76708i.class
            di3.d r13 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x0177 }
            ln.i r13 = (p196ln.C76708i) r13     // Catch:{ Exception -> 0x0177 }
            float r14 = (float) r7     // Catch:{ Exception -> 0x0177 }
            float r14 = r14 * r2
            int r14 = (int) r14     // Catch:{ Exception -> 0x0177 }
            r15 = r22
            android.graphics.Bitmap r13 = r13.mo106846sO(r15, r7, r7, r14)     // Catch:{ Exception -> 0x0177 }
        L_0x00b2:
            if (r13 != 0) goto L_0x00e1
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0177 }
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ Exception -> 0x0177 }
            java.lang.String r14 = "avatar/default_nor_avatar.png"
            java.io.InputStream r13 = r13.open(r14)     // Catch:{ Exception -> 0x0177 }
            float r14 = kg3.C76577a.m92156g(r8)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeStream(r13, r14)     // Catch:{ Exception -> 0x0177 }
            int r14 = r13.getWidth()     // Catch:{ Exception -> 0x0177 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0177 }
            float r14 = r14 * r2
            r15 = 0
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r13, r15, r14)     // Catch:{ Exception -> 0x0177 }
            int r14 = r12.getWidth()     // Catch:{ Exception -> 0x0177 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0177 }
            float r14 = r14 * r2
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r12, r15, r14)     // Catch:{ Exception -> 0x0177 }
        L_0x00e1:
            if (r13 == 0) goto L_0x00fe
            if (r27 == 0) goto L_0x00fe
            int r2 = r13.getWidth()     // Catch:{ Exception -> 0x0177 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0177 }
            r14 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r14
            r15 = 0
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r13, r15, r2)     // Catch:{ Exception -> 0x0177 }
            int r2 = r12.getWidth()     // Catch:{ Exception -> 0x0177 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0177 }
            float r2 = r2 * r14
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r12, r15, r2)     // Catch:{ Exception -> 0x0177 }
        L_0x00fe:
            if (r13 == 0) goto L_0x010d
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x010d
            r2 = 0
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r13, r2, r1)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r12, r2, r1)     // Catch:{ Exception -> 0x0177 }
        L_0x010d:
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0177 }
            r1.<init>(r11)     // Catch:{ Exception -> 0x0177 }
            int r2 = r5 - r6
            int r2 = r2 / 2
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ Exception -> 0x0177 }
            int r9 = r5 - r2
            r6.<init>(r2, r2, r9, r9)     // Catch:{ Exception -> 0x0177 }
            r1.drawBitmap(r12, r8, r6, r10)     // Catch:{ Exception -> 0x0177 }
            int r2 = r5 - r7
            int r2 = r2 / 2
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ Exception -> 0x0177 }
            int r7 = r5 - r2
            r6.<init>(r2, r2, r7, r7)     // Catch:{ Exception -> 0x0177 }
            r1.drawBitmap(r13, r8, r6, r10)     // Catch:{ Exception -> 0x0177 }
            if (r24 == 0) goto L_0x0149
            android.content.res.Resources r2 = r20.getResources()     // Catch:{ Exception -> 0x0177 }
            r6 = 2131231791(0x7f08042f, float:1.8079673E38)
            java.io.InputStream r2 = r2.openRawResource(r6)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98737f(r2)     // Catch:{ Exception -> 0x0177 }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ Exception -> 0x0177 }
            int r4 = r5 - r4
            r6.<init>(r4, r4, r5, r5)     // Catch:{ Exception -> 0x0177 }
            r1.drawBitmap(r2, r8, r6, r10)     // Catch:{ Exception -> 0x0177 }
        L_0x0149:
            r1 = -1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r1)     // Catch:{ Exception -> 0x0177 }
            if (r1 != 0) goto L_0x015a
            r1 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r1)     // Catch:{ Exception -> 0x0158 }
            if (r2 == 0) goto L_0x015b
            goto L_0x015a
        L_0x0158:
            r0 = move-exception
            goto L_0x0179
        L_0x015a:
            r0 = 3
        L_0x015b:
            java.lang.Class<lx.w> r1 = p200lx.C76736w.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0177 }
            lx.w r1 = (p200lx.C76736w) r1     // Catch:{ Exception -> 0x0177 }
            r22 = r1
            r23 = r20
            r24 = r11
            r25 = r21
            r26 = r0
            r27 = r31
            android.graphics.Bitmap r0 = r22.qk0(r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0177 }
            r11.recycle()     // Catch:{ Exception -> 0x0177 }
            return r0
        L_0x0177:
            r0 = move-exception
            r1 = 0
        L_0x0179:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.C116648v0.m164515a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, int, xs.b$a, boolean, int, float, boolean, double):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public static void m164516b(int i, C116673y0.C116675c cVar, C116673y0.C116675c cVar2, C116673y0.C116674b bVar, C116673y0.C116674b bVar2, Context context) {
        C116673y0.C116675c cVar3 = cVar;
        C116673y0.C116675c cVar4 = cVar2;
        C116673y0.C116674b bVar3 = bVar;
        C116673y0.C116674b bVar4 = bVar2;
        float b = (float) C76577a.m92151b(context, 32);
        if (i == 2) {
            float f = bVar4.f349875y;
            float f2 = -b;
            m164521g(cVar2, 0.0f, f, 90.0f, 270.0f, 0.0f, 1.0f, f2, 0.0f);
            cVar4.f349903c.setBackgroundResource(C0966R.C0969drawable.a_3);
            cVar4.f349902b.setBackgroundResource(C0966R.C0969drawable.a_1);
            m164521g(cVar, bVar3.f349875y, 0.0f, 270.0f, 450.0f, 1.0f, 0.0f, 0.0f, f2);
            cVar3.f349903c.setBackgroundResource(C0966R.C0969drawable.a9w);
            cVar3.f349902b.setBackgroundResource(C0966R.C0969drawable.a86);
            return;
        }
        float f3 = bVar3.f349875y;
        float f4 = -b;
        m164521g(cVar, 0.0f, f3, 90.0f, 270.0f, 0.0f, 1.0f, f4, 0.0f);
        cVar3.f349903c.setBackgroundResource(C0966R.C0969drawable.a_3);
        cVar3.f349902b.setBackgroundResource(C0966R.C0969drawable.a_1);
        m164521g(cVar2, bVar4.f349875y, 0.0f, 270.0f, 450.0f, 1.0f, 0.0f, 0.0f, f4);
        cVar4.f349903c.setBackgroundResource(C0966R.C0969drawable.a9w);
        cVar4.f349902b.setBackgroundResource(C0966R.C0969drawable.a86);
    }

    /* renamed from: c */
    public static void m164517c(C116673y0.C116674b bVar) {
        Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "[getMchConfig]");
        C118460qp qpVar = new C118460qp();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "getConfig failed");
        } else {
            try {
                qpVar.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "getConfig success");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WalletCollectQrCodeLogic", "parse fail, " + e.getLocalizedMessage());
            }
        }
        C116673y0.m164541a(bVar, (C118466sp) null, qpVar);
    }

    /* renamed from: d */
    public static void m164518d(C116673y0.C116675c cVar) {
        RelativeLayout relativeLayout = cVar.f349888L;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            cVar.f349890N.clearAnimation();
            cVar.f349889M.setVisibility(8);
        }
    }

    /* renamed from: e */
    public static void m164519e(C116673y0.C116675c cVar, C116673y0.C116674b bVar, String str, Context context) {
        RelativeLayout relativeLayout = cVar.f349888L;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
            cVar.f349891O.setVisibility(0);
            TextView textView = cVar.f349892P;
            if (Util.isNullOrNil(str)) {
                str = context.getString(C0966R.string.l_3);
            }
            textView.setText(str);
            cVar.f349890N.clearAnimation();
            cVar.f349889M.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f349891O.getLayoutParams();
            if (cVar.f349902b.getVisibility() == 0) {
                layoutParams.topMargin = C76577a.m92151b(context, 96);
            } else {
                layoutParams.topMargin = C76577a.m92151b(context, 124);
            }
            cVar.f349891O.setLayoutParams(layoutParams);
            cVar.f349888L.post(new C116654f(cVar, bVar));
        }
    }

    /* renamed from: f */
    public static void m164520f(C116673y0.C116675c cVar, C116673y0.C116674b bVar, Context context) {
        if (cVar.f349888L != null) {
            float b = (float) (C76577a.m92151b(context, 25) / 2);
            cVar.f349888L.setVisibility(0);
            cVar.f349889M.setVisibility(0);
            cVar.f349891O.setVisibility(8);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 0, b, 0, b);
            rotateAnimation.setDuration(1000);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            cVar.f349890N.startAnimation(rotateAnimation);
            cVar.f349888L.post(new C116653e(cVar, bVar));
        }
    }

    /* renamed from: g */
    public static void m164521g(C116673y0.C116675c cVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C116649a(cVar));
        if (f2 > 0.0f) {
            ofFloat.addListener(new C116650b(cVar));
        }
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f5, f6});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new C116651c(cVar));
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, f4});
        ofFloat3.setDuration(300);
        ofFloat3.addUpdateListener(new C116652d(cVar));
        ofFloat3.start();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f7, f8);
        translateAnimation.setDuration(300);
        cVar.f349909i.startAnimation(translateAnimation);
    }
}
