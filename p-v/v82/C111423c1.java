package v82;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.PowerManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.model.C105808j;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e82.C107264b;
import e82.C107265c;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: v82.c1 */
public final class C111423c1 extends BaseSmallView implements C105808j {

    /* renamed from: h */
    public C78365i0 f333571h;

    /* renamed from: i */
    public C111437e0 f333572i;

    /* renamed from: j */
    public C14413d0 f333573j;

    /* renamed from: n */
    public PowerManager.WakeLock f333574n;

    /* renamed from: o */
    public C107264b f333575o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C111423c1(android.content.Context r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r1, r2)
            r2 = 0
            r0.<init>(r1, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r25)
            r2 = 2131496729(0x7f0c0f19, float:1.8617031E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            r0.addView(r1)
            r4 = r1
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r2 = 2131309707(0x7f09348b, float:1.8237705E38)
            android.view.View r3 = p192l4.C10462b.m10395a(r1, r2)
            java.lang.String r5 = "Missing required view with ID: "
            r6 = 2131309737(0x7f0934a9, float:1.8237766E38)
            r7 = 2131309734(0x7f0934a6, float:1.823776E38)
            if (r3 == 0) goto L_0x020e
            r2 = 2131306181(0x7f0926c5, float:1.8230554E38)
            android.view.View r8 = p192l4.C10462b.m10395a(r3, r2)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x01fc
            r2 = 2131309724(0x7f09349c, float:1.823774E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r3, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            if (r9 == 0) goto L_0x01fc
            r2 = 2131309725(0x7f09349d, float:1.8237742E38)
            android.view.View r10 = p192l4.C10462b.m10395a(r3, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r10
            if (r10 == 0) goto L_0x01fc
            e82.a r11 = new e82.a
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r11.<init>(r3, r8, r9, r10)
            android.view.View r2 = p192l4.C10462b.m10395a(r1, r7)
            if (r2 == 0) goto L_0x01f8
            r3 = 2131297469(0x7f0904bd, float:1.8212884E38)
            android.view.View r7 = p192l4.C10462b.m10395a(r2, r3)
            r14 = r7
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r7 = 2131317093(0x7f095165, float:1.8252686E38)
            r8 = 2131309690(0x7f09347a, float:1.823767E38)
            if (r14 == 0) goto L_0x01e6
            r3 = 2131297492(0x7f0904d4, float:1.821293E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r15 = r9
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            if (r15 == 0) goto L_0x01e6
            android.view.View r3 = p192l4.C10462b.m10395a(r2, r8)
            r16 = r3
            android.widget.RelativeLayout r16 = (android.widget.RelativeLayout) r16
            if (r16 == 0) goto L_0x01e3
            r3 = 2131309704(0x7f093488, float:1.82377E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r17 = r9
            android.widget.ImageView r17 = (android.widget.ImageView) r17
            if (r17 == 0) goto L_0x01e6
            r3 = 2131309705(0x7f093489, float:1.8237701E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r18 = r9
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L_0x01e6
            r3 = 2131309726(0x7f09349e, float:1.8237744E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r19 = r9
            android.widget.ImageView r19 = (android.widget.ImageView) r19
            if (r19 == 0) goto L_0x01e6
            r3 = 2131309727(0x7f09349f, float:1.8237746E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r20 = r9
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView r20 = (com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) r20
            if (r20 == 0) goto L_0x01e6
            r3 = 2131309733(0x7f0934a5, float:1.8237758E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r21 = r9
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x01e6
            r3 = 2131316512(0x7f094f20, float:1.8251508E38)
            android.view.View r9 = p192l4.C10462b.m10395a(r2, r3)
            r22 = r9
            android.widget.RelativeLayout r22 = (android.widget.RelativeLayout) r22
            if (r22 == 0) goto L_0x01e6
            android.view.View r3 = p192l4.C10462b.m10395a(r2, r7)
            r23 = r3
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            if (r23 == 0) goto L_0x01df
            e82.c r9 = new e82.c
            r13 = r2
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r12 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.View r2 = p192l4.C10462b.m10395a(r1, r6)
            if (r2 == 0) goto L_0x01db
            android.view.View r1 = p192l4.C10462b.m10395a(r2, r8)
            r14 = r1
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r1 = 2131309702(0x7f093486, float:1.8237695E38)
            r3 = 2131309738(0x7f0934aa, float:1.8237768E38)
            r6 = 2131309739(0x7f0934ab, float:1.823777E38)
            if (r14 == 0) goto L_0x01c6
            android.view.View r8 = p192l4.C10462b.m10395a(r2, r1)
            r15 = r8
            com.tencent.mm.ui.widget.imageview.WeImageView r15 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r15
            if (r15 == 0) goto L_0x01c2
            android.view.View r1 = p192l4.C10462b.m10395a(r2, r3)
            r16 = r1
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x01be
            android.view.View r1 = p192l4.C10462b.m10395a(r2, r6)
            r17 = r1
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x01ba
            android.view.View r1 = p192l4.C10462b.m10395a(r2, r7)
            r18 = r1
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            if (r18 == 0) goto L_0x01c9
            e82.d r7 = new e82.d
            r13 = r2
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r12 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            e82.b r1 = new e82.b
            r2 = r1
            r3 = r4
            r5 = r11
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.f333575o = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "power"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.os.PowerManager"
            gy3.C87412m.m108592e(r1, r2)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            r2 = 536870922(0x2000000a, float:1.0842035E-19)
            java.lang.String r3 = "MicroMsg.MultiTalkSmallView"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)
            r0.f333574n = r1
            if (r1 == 0) goto L_0x017a
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "(Landroid/content/Context;)V"
            java.lang.String r8 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r9 = "acquire"
            java.lang.String r10 = "()V"
            r4 = r1
            j20.C117292a.m165357c(r4, r5, r6, r7, r8, r9, r10)
            r1.acquire()
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "(Landroid/content/Context;)V"
            java.lang.String r8 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r9 = "acquire"
            java.lang.String r10 = "()V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x017a:
            r1 = 1
            r0.setClipToOutline(r1)
            v82.i0 r1 = new v82.i0
            e82.b r2 = r0.f333575o
            e82.d r2 = r2.f320930c
            android.widget.RelativeLayout r2 = r2.f320932a
            java.lang.String r3 = "uiBinding.multitalkVoice.root"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>(r2)
            r0.f333571h = r1
            v82.e0 r1 = new v82.e0
            e82.b r2 = r0.f333575o
            e82.c r2 = r2.f320929b
            android.widget.RelativeLayout r2 = r2.f320931a
            java.lang.String r3 = "uiBinding.multitalkVideo.root"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>(r2)
            r0.f333572i = r1
            v82.d0 r1 = new v82.d0
            e82.b r2 = r0.f333575o
            e82.a r2 = r2.f320928a
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkMiniStatusIconLayoutBinding"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.RelativeLayout r2 = r2.f320927a
            java.lang.String r3 = "uiBinding.multitalkMinio…usIconLayoutBinding).root"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>(r2)
            r0.f333573j = r1
            return
        L_0x01ba:
            r7 = 2131309739(0x7f0934ab, float:1.823777E38)
            goto L_0x01c9
        L_0x01be:
            r7 = 2131309738(0x7f0934aa, float:1.8237768E38)
            goto L_0x01c9
        L_0x01c2:
            r7 = 2131309702(0x7f093486, float:1.8237695E38)
            goto L_0x01c9
        L_0x01c6:
            r7 = 2131309690(0x7f09347a, float:1.823767E38)
        L_0x01c9:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r1 = r1.getResourceName(r7)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r1 = r5.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x01db:
            r2 = 2131309737(0x7f0934a9, float:1.8237766E38)
            goto L_0x020e
        L_0x01df:
            r3 = 2131317093(0x7f095165, float:1.8252686E38)
            goto L_0x01e6
        L_0x01e3:
            r3 = 2131309690(0x7f09347a, float:1.823767E38)
        L_0x01e6:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r1 = r1.getResourceName(r3)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r1 = r5.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x01f8:
            r2 = 2131309734(0x7f0934a6, float:1.823776E38)
            goto L_0x020e
        L_0x01fc:
            android.content.res.Resources r1 = r3.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r1 = r5.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x020e:
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r1 = r5.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getStateContentDesc() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            v82.d0 r1 = r6.f333573j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.f40016g
            if (r1 != 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r4 = 0
            if (r1 == 0) goto L_0x0028
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x0036
            r5 = 2131838653(0x7f1146bd, float:1.9310535E38)
            java.lang.String r1 = r1.getString(r5)
            goto L_0x0037
        L_0x0028:
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x0036
            r5 = 2131838652(0x7f1146bc, float:1.9310533E38)
            java.lang.String r1 = r1.getString(r5)
            goto L_0x0037
        L_0x0036:
            r1 = r4
        L_0x0037:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            v82.d0 r0 = r6.f333573j
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.f40015f
            if (r0 != r2) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x0060
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x006d
            r2 = 2131838651(0x7f1146bb, float:1.9310531E38)
            java.lang.String r4 = r0.getString(r2)
            goto L_0x006d
        L_0x0060:
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x006d
            r2 = 2131838650(0x7f1146ba, float:1.931053E38)
            java.lang.String r4 = r0.getString(r2)
        L_0x006d:
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.getStateContentDesc():java.lang.String");
    }

    /* renamed from: a */
    public void mo150771a(String str, Bitmap bitmap, int i, int i2) {
        C111437e0 e0Var;
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(bitmap, "bm");
        C111437e0 e0Var2 = this.f333572i;
        String str2 = null;
        if ((e0Var2 != null ? e0Var2.f333643o : null) != null) {
            if (e0Var2 != null) {
                str2 = e0Var2.f333643o;
            }
            if (C87412m.m108589b(str, str2) && (e0Var = this.f333572i) != null) {
                synchronized (e0Var) {
                    if (!e0Var.f333641m) {
                        if (e0Var.f333632d == null) {
                            Log.m105920e("MicroMsg.MultiTalkMiniVideoView", "drawVideo view is null");
                        } else if (e0Var.f333649u) {
                            Log.m105920e("MicroMsg.MultiTalkMiniVideoView", "renderVideoBitmap img false cause isDoingAnimationChange");
                        } else if (!e0Var.mo163123a(str, bitmap, i, i2)) {
                            e0Var.mo163126d(bitmap, i, i2);
                            Util.currentTicks();
                            e0Var.mo163124b(str);
                            e0Var.f333640l = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo150772b() {
    }

    /* renamed from: d */
    public boolean mo153022d() {
        super.mo153022d();
        C78365i0 i0Var = this.f333571h;
        if (i0Var != null) {
            TextView textView = i0Var.f229638b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            WeImageView weImageView = i0Var.f229642f;
            if (weImageView != null) {
                weImageView.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_call_end, Color.parseColor("#FA5151")));
            }
            WeImageView weImageView2 = i0Var.f229642f;
            if (weImageView2 != null) {
                weImageView2.setIconColor(Color.parseColor("#FA5151"));
            }
            TextView textView2 = i0Var.f229639c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = i0Var.f229639c;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#FA5151"));
            }
            TextView textView4 = i0Var.f229639c;
            if (textView4 != null) {
                textView4.setText(C0966R.string.khf);
            }
            i0Var.f229637a.clearAnimation();
        }
        C111437e0 e0Var = this.f333572i;
        if (e0Var != null) {
            TextView textView5 = e0Var.f333630b;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            View view = e0Var.f333637i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = e0Var.f333638j;
            if (imageView != null) {
                imageView.setImageDrawable(C74933u4.m89768e(e0Var.f333631c, C0966R.raw.icons_filled_call_end, Color.parseColor("#FFFFFF")));
            }
            TextView textView6 = e0Var.f333639k;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            ImageView imageView2 = e0Var.f333634f;
            if (imageView2 != null) {
                imageView2.clearAnimation();
            }
            TextView textView7 = e0Var.f333639k;
            if (textView7 != null) {
                textView7.setText(C0966R.string.khf);
            }
        }
        C107265c cVar = this.f333575o.f320929b;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkVideoSmallContentViewBinding");
        cVar.f320931a.setContentDescription("");
        this.f333575o.f320930c.f320932a.setContentDescription("");
        return true;
    }

    /* renamed from: g */
    public void mo153023g() {
        C111437e0 e0Var = this.f333572i;
        if (e0Var != null) {
            TextView textView = e0Var.f333630b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            View view = e0Var.f333637i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C78365i0 i0Var = this.f333571h;
        if (i0Var != null) {
            WeImageView weImageView = i0Var.f229642f;
            if (weImageView != null) {
                weImageView.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_call, Color.parseColor("#07C160")));
            }
            WeImageView weImageView2 = i0Var.f229642f;
            if (weImageView2 != null) {
                weImageView2.setIconColor(Color.parseColor("#07C160"));
            }
            TextView textView2 = i0Var.f229639c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = i0Var.f229639c;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#07C160"));
            }
            TextView textView4 = i0Var.f229638b;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
    }

    public ImageView getAvatarIv() {
        return null;
    }

    public final Long getLastRenderSwitchTick() {
        C111437e0 e0Var = this.f333572i;
        if (e0Var != null) {
            return e0Var.f333645q;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f333643o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getRendererSpeaker() {
        /*
            r1 = this;
            v82.e0 r0 = r1.f333572i
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f333643o
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.getRendererSpeaker():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f333643o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getUsername() {
        /*
            r1 = this;
            v82.e0 r0 = r1.f333572i
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f333643o
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.getUsername():java.lang.String");
    }

    /* renamed from: k */
    public void mo153123k() {
        ImageView imageView;
        this.f318159d = null;
        C111437e0 e0Var = this.f333572i;
        if (!(e0Var == null || (imageView = e0Var.f333634f) == null)) {
            imageView.clearAnimation();
        }
        C78365i0 i0Var = this.f333571h;
        if (i0Var != null) {
            i0Var.f229637a.clearAnimation();
        }
        PowerManager.WakeLock wakeLock = this.f333574n;
        if (wakeLock != null) {
            C87412m.m108591d(wakeLock);
            if (wakeLock.isHeld()) {
                Log.m105924i("MicroMsg.MultiTalkSmallView", "release waklock");
                PowerManager.WakeLock wakeLock2 = this.f333574n;
                if (wakeLock2 != null) {
                    PowerManager.WakeLock wakeLock3 = wakeLock2;
                    C117292a.m165357c(wakeLock3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    C117292a.m165359e(wakeLock3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }
    }

    /* renamed from: l */
    public void mo153027l(String str) {
        C78365i0 i0Var = this.f333571h;
        if (i0Var != null) {
            TextView textView = i0Var.f229638b;
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            TextView textView2 = i0Var.f229638b;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        C107265c cVar = this.f333575o.f320929b;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkVideoSmallContentViewBinding");
        RelativeLayout relativeLayout = cVar.f320931a;
        StringBuilder sb = new StringBuilder();
        Context context = getContext();
        String str2 = null;
        sb.append(context != null ? context.getString(C0966R.string.jux) : null);
        sb.append(getStateContentDesc());
        relativeLayout.setContentDescription(sb.toString());
        RelativeLayout relativeLayout2 = this.f333575o.f320930c.f320932a;
        StringBuilder sb4 = new StringBuilder();
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(C0966R.string.jux);
        }
        sb4.append(str2);
        sb4.append(getStateContentDesc());
        relativeLayout2.setContentDescription(sb4.toString());
    }

    /* renamed from: m */
    public void mo153028m(String str) {
        C78365i0 i0Var = this.f333571h;
        if (i0Var != null) {
            TextView textView = i0Var.f229638b;
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            TextView textView2 = i0Var.f229638b;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        C107265c cVar = this.f333575o.f320929b;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkVideoSmallContentViewBinding");
        RelativeLayout relativeLayout = cVar.f320931a;
        StringBuilder sb = new StringBuilder();
        Context context = getContext();
        String str2 = null;
        sb.append(context != null ? context.getString(C0966R.string.juw) : null);
        sb.append(getStateContentDesc());
        relativeLayout.setContentDescription(sb.toString());
        RelativeLayout relativeLayout2 = this.f333575o.f320930c.f320932a;
        StringBuilder sb4 = new StringBuilder();
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(C0966R.string.juw);
        }
        sb4.append(str2);
        sb4.append(getStateContentDesc());
        relativeLayout2.setContentDescription(sb4.toString());
    }

    /* renamed from: n */
    public final void mo163090n(String str) {
        Object[] objArr = new Object[1];
        Long lastRenderSwitchTick = getLastRenderSwitchTick();
        objArr[0] = Long.valueOf(Util.ticksToNow(lastRenderSwitchTick != null ? lastRenderSwitchTick.longValue() : 0));
        Log.printInfoStack("MicroMsg.MultiTalkSmallView", "changeRendererSpeaker %s", objArr);
        C111437e0 e0Var = this.f333572i;
        if (e0Var != null) {
            e0Var.mo163129g(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r4 = r2.getResources();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo163091o() {
        /*
            r6 = this;
            v82.i0 r0 = r6.f333571h
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.f229643g
            if (r1 != 0) goto L_0x0009
            goto L_0x0026
        L_0x0009:
            android.content.Context r2 = r0.f229640d
            r3 = 2131235529(0x7f0812c9, float:1.8087255E38)
            if (r2 == 0) goto L_0x001e
            android.content.res.Resources r4 = r2.getResources()
            if (r4 == 0) goto L_0x001e
            r5 = 2131101209(0x7f060619, float:1.7814821E38)
            int r4 = r4.getColor(r5)
            goto L_0x001f
        L_0x001e:
            r4 = -1
        L_0x001f:
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r4)
            r1.setBackground(r2)
        L_0x0026:
            android.content.Context r1 = r0.f229640d
            if (r1 == 0) goto L_0x003e
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x003e
            r2 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r2)
            android.widget.TextView r0 = r0.f229638b
            if (r0 == 0) goto L_0x003e
            r0.setTextColor(r1)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.mo163091o():void");
    }

    /* renamed from: p */
    public final void mo163092p(String str) {
        C111437e0 e0Var;
        C87412m.m108594g(str, "userName");
        if (!C105851w0.zx0().f314503q.contains(str) && (e0Var = this.f333572i) != null) {
            e0Var.mo163125c(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = java.lang.Integer.valueOf(r1.f229637a.getVisibility());
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163093q() {
        /*
            r21 = this;
            r0 = r21
            v82.i0 r1 = r0.f333571h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            android.view.View r1 = r1.f229637a
            int r1 = r1.getVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 4
            if (r1 != 0) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x00da
            v82.i0 r1 = r0.f333571h
            if (r1 == 0) goto L_0x00c8
            android.view.View r12 = r1.f229637a
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r13.mo10233c(r4)
            java.lang.Object[] r5 = r13.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r7 = "doAnimationHide"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r13.mo10231a(r2)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r12.setAlpha(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r6 = "doAnimationHide"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r4 = r12
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r4 = r1.f229637a
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.mo10233c(r6)
            java.lang.Object[] r14 = r5.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r16 = "doAnimationHide"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r4
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView"
            java.lang.String r15 = "doAnimationHide"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r4 = r1.f229637a
            r4.clearAnimation()
            android.view.View r4 = r1.f229637a
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r5 = 0
            android.view.ViewPropertyAnimator r4 = r4.alpha(r5)
            r5 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r5)
            v82.g0 r5 = new v82.g0
            r5.<init>(r1)
            android.view.ViewPropertyAnimator r1 = r4.setListener(r5)
            r1.start()
        L_0x00c8:
            v82.e0 r1 = r0.f333572i
            if (r1 == 0) goto L_0x00cf
            r1.mo163128f(r2)
        L_0x00cf:
            v82.e0 r1 = r0.f333572i
            if (r1 == 0) goto L_0x00da
            java.lang.String r2 = r21.getRendererSpeaker()
            r1.mo163125c(r2)
        L_0x00da:
            v82.e0 r1 = r0.f333572i
            if (r1 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r1.f333640l = r3
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111423c1.mo163093q():void");
    }

    public void setVoicePlayDevice(int i) {
        TextView textView;
        int i2 = i;
        if (this.f318160e != i2) {
            this.f318160e = i2;
            C111437e0 e0Var = this.f333572i;
            if (!(e0Var == null || (textView = e0Var.f333630b) == null)) {
                textView.setVisibility(8);
            }
            C111437e0 e0Var2 = this.f333572i;
            if (e0Var2 != null) {
                View view = e0Var2.f333637i;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (i2 == 1) {
                    ImageView imageView = e0Var2.f333638j;
                    if (imageView != null) {
                        imageView.setImageDrawable(C74933u4.m89768e(e0Var2.f333631c, C0966R.raw.icons_filled_volume_up, Color.parseColor("#FFFFFF")));
                    }
                    TextView textView2 = e0Var2.f333639k;
                    C87412m.m108591d(textView2);
                    textView2.setText(C0966R.string.khe);
                } else if (i2 == 2) {
                    ImageView imageView2 = e0Var2.f333638j;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(C74933u4.m89768e(e0Var2.f333631c, C0966R.raw.icons_filled_ear, Color.parseColor("#FFFFFF")));
                    }
                    TextView textView3 = e0Var2.f333639k;
                    C87412m.m108591d(textView3);
                    textView3.setText(C0966R.string.khc);
                } else if (i2 == 3) {
                    ImageView imageView3 = e0Var2.f333638j;
                    if (imageView3 != null) {
                        imageView3.setImageDrawable(C74933u4.m89768e(e0Var2.f333631c, C0966R.raw.icons_filled_headset, Color.parseColor("#FFFFFF")));
                    }
                    TextView textView4 = e0Var2.f333639k;
                    C87412m.m108591d(textView4);
                    textView4.setText(C0966R.string.khd);
                } else if (i2 == 4) {
                    ImageView imageView4 = e0Var2.f333638j;
                    if (imageView4 != null) {
                        imageView4.setImageDrawable(C74933u4.m89768e(e0Var2.f333631c, C0966R.raw.icons_filled_bluetooth, Color.parseColor("#FFFFFF")));
                    }
                    TextView textView5 = e0Var2.f333639k;
                    C87412m.m108591d(textView5);
                    textView5.setText(C0966R.string.khb);
                }
            }
            C78365i0 i0Var = this.f333571h;
            if (i0Var != null) {
                TextView textView6 = i0Var.f229639c;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                if (i2 == 1) {
                    WeImageView weImageView = i0Var.f229642f;
                    if (weImageView != null) {
                        weImageView.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_volume_up, Color.parseColor("#07C160")));
                    }
                    WeImageView weImageView2 = i0Var.f229642f;
                    if (weImageView2 != null) {
                        weImageView2.setIconColor(Color.parseColor("#07C160"));
                    }
                    TextView textView7 = i0Var.f229639c;
                    if (textView7 != null) {
                        textView7.setText(C0966R.string.khe);
                    }
                } else if (i2 == 2) {
                    WeImageView weImageView3 = i0Var.f229642f;
                    if (weImageView3 != null) {
                        weImageView3.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_ear, Color.parseColor("#07C160")));
                    }
                    WeImageView weImageView4 = i0Var.f229642f;
                    if (weImageView4 != null) {
                        weImageView4.setIconColor(Color.parseColor("#07C160"));
                    }
                    TextView textView8 = i0Var.f229639c;
                    if (textView8 != null) {
                        textView8.setText(C0966R.string.khc);
                    }
                } else if (i2 == 3) {
                    WeImageView weImageView5 = i0Var.f229642f;
                    if (weImageView5 != null) {
                        weImageView5.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_headset, Color.parseColor("#07C160")));
                    }
                    WeImageView weImageView6 = i0Var.f229642f;
                    if (weImageView6 != null) {
                        weImageView6.setIconColor(Color.parseColor("#07C160"));
                    }
                    TextView textView9 = i0Var.f229639c;
                    if (textView9 != null) {
                        textView9.setText(C0966R.string.khd);
                    }
                } else if (i2 == 4) {
                    WeImageView weImageView7 = i0Var.f229642f;
                    if (weImageView7 != null) {
                        weImageView7.setBackground(C74933u4.m89768e(i0Var.f229640d, C0966R.raw.icons_filled_bluetooth, Color.parseColor("#07C160")));
                    }
                    WeImageView weImageView8 = i0Var.f229642f;
                    if (weImageView8 != null) {
                        weImageView8.setIconColor(Color.parseColor("#07C160"));
                    }
                    TextView textView10 = i0Var.f229639c;
                    if (textView10 != null) {
                        textView10.setText(C0966R.string.khb);
                    }
                }
                TextView textView11 = i0Var.f229638b;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
            }
            super.setVoicePlayDevice(i);
        }
    }
}
