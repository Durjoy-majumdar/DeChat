package x82;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: x82.d */
public final class C112087d {

    /* renamed from: a */
    public Context f335574a;

    /* renamed from: b */
    public WeImageView f335575b;

    /* renamed from: c */
    public View f335576c;

    /* renamed from: d */
    public MMHandler f335577d;

    /* renamed from: e */
    public View f335578e;

    /* renamed from: f */
    public TextView f335579f;

    /* renamed from: g */
    public WeImageView f335580g;

    /* renamed from: h */
    public boolean f335581h;

    /* renamed from: i */
    public RelativeLayout f335582i;

    /* renamed from: j */
    public View f335583j;

    /* renamed from: k */
    public Runnable f335584k = new C112088a(this);

    /* renamed from: x82.d$a */
    public static final class C112088a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112087d f335585d;

        public C112088a(C112087d dVar) {
            this.f335585d = dVar;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator withStartAction;
            C112087d dVar = this.f335585d;
            if (!dVar.f335581h) {
                View view = dVar.f335576c;
                if (view != null) {
                    view.clearAnimation();
                }
                WeImageView weImageView = dVar.f335575b;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                View view2 = dVar.f335576c;
                if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(100)) != null && (withStartAction = duration.withStartAction(new C112081c(dVar))) != null) {
                    withStartAction.start();
                }
            }
        }
    }

    public C112087d(Context context) {
        C87412m.m108594g(context, "context");
        this.f335574a = context;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163789a(android.widget.RelativeLayout r12) {
        /*
            r11 = this;
            java.lang.String r0 = "rootView"
            gy3.C87412m.m108594g(r12, r0)
            r11.f335583j = r12
            android.content.Context r0 = r11.f335574a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131497307(0x7f0c115b, float:1.8618203E38)
            android.view.View r0 = r0.inflate(r1, r12)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r0, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r11.f335582i = r0
            r1 = 2131312813(0x7f0940ad, float:1.8244005E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r11.f335575b = r0
            r1 = -1
            if (r0 == 0) goto L_0x0039
            android.content.Context r2 = r12.getContext()
            r3 = 2131755964(0x7f1003bc, float:1.9142822E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r1)
            r0.setImageDrawable(r2)
        L_0x0039:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r11.f335575b
            if (r0 == 0) goto L_0x0040
            r0.setIconColor(r1)
        L_0x0040:
            android.widget.RelativeLayout r0 = r11.f335582i
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r2 = 2131312814(0x7f0940ae, float:1.8244007E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            r11.f335576c = r0
            android.widget.RelativeLayout r0 = r11.f335582i
            if (r0 == 0) goto L_0x005c
            r2 = 2131309710(0x7f09348e, float:1.8237711E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x005d
        L_0x005c:
            r0 = r1
        L_0x005d:
            r11.f335578e = r0
            if (r0 != 0) goto L_0x0062
            goto L_0x007f
        L_0x0062:
            android.content.Context r2 = r12.getContext()
            r3 = 2131234142(0x7f080d5e, float:1.8084441E38)
            android.content.Context r12 = r12.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r4 = 2131099737(0x7f060059, float:1.7811836E38)
            int r12 = r12.getColor(r4)
            android.graphics.drawable.Drawable r12 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r12)
            r0.setBackground(r12)
        L_0x007f:
            android.view.View r12 = r11.f335578e
            if (r12 != 0) goto L_0x0084
            goto L_0x00c4
        L_0x0084:
            r0 = 4
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.mo10233c(r0)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI"
            java.lang.String r5 = "getNavLayout"
            java.lang.String r6 = "(Landroid/widget/RelativeLayout;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            java.lang.Object r0 = r10.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI"
            java.lang.String r4 = "getNavLayout"
            java.lang.String r5 = "(Landroid/widget/RelativeLayout;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x00c4:
            android.widget.RelativeLayout r12 = r11.f335582i
            if (r12 == 0) goto L_0x00d2
            r0 = 2131312815(0x7f0940af, float:1.824401E38)
            android.view.View r12 = r12.findViewById(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            goto L_0x00d3
        L_0x00d2:
            r12 = r1
        L_0x00d3:
            r11.f335579f = r12
            android.widget.RelativeLayout r12 = r11.f335582i
            if (r12 == 0) goto L_0x00e3
            r0 = 2131309718(0x7f093496, float:1.8237728E38)
            android.view.View r12 = r12.findViewById(r0)
            r1 = r12
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
        L_0x00e3:
            r11.f335580g = r1
            if (r1 != 0) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            r12 = 8
            r1.setVisibility(r12)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112087d.mo163789a(android.widget.RelativeLayout):void");
    }

    /* renamed from: b */
    public final void mo163790b() {
        MMHandler mMHandler = this.f335577d;
        if (mMHandler != null) {
            mMHandler.removeCallbacks(this.f335584k);
        }
        MMHandler mMHandler2 = this.f335577d;
        if (mMHandler2 != null) {
            mMHandler2.removeCallbacksAndMessages((Object) null);
        }
        MMHandler mMHandler3 = this.f335577d;
        if (mMHandler3 != null) {
            mMHandler3.quitSafely();
        }
        View view = this.f335576c;
        if (view != null) {
            view.clearAnimation();
        }
        WeImageView weImageView = this.f335575b;
        if (weImageView != null) {
            weImageView.clearAnimation();
        }
        mo163791c(0);
        this.f335581h = true;
        WeImageView weImageView2 = this.f335575b;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        View view2 = this.f335576c;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f335579f;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo163791c(int i) {
        Log.m105924i("MicroMsg.ScreenAvatarNavAnimatorUI", "showScreenIconAvatar " + i);
        View view = this.f335583j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WeImageView weImageView = this.f335580g;
        if (weImageView != null) {
            Context context = this.f335574a;
            weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_board, context.getResources().getColor(C0966R.color.f2975b6)));
        }
        WeImageView weImageView2 = this.f335580g;
        if (weImageView2 != null) {
            weImageView2.setIconColor(this.f335574a.getResources().getColor(C0966R.color.f2975b6));
        }
        WeImageView weImageView3 = this.f335580g;
        if (weImageView3 != null) {
            weImageView3.setVisibility(i);
        }
        View view2 = this.f335578e;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WeImageView weImageView4 = this.f335575b;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        }
        View view4 = this.f335576c;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f335579f;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
