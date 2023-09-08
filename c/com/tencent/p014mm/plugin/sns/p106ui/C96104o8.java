package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C100417r0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.o8 */
public class C96104o8 {

    /* renamed from: a */
    public Context f280686a;

    /* renamed from: b */
    public SnsTimeLineBaseAdapter f280687b;

    /* renamed from: c */
    public FrameLayout f280688c;

    /* renamed from: d */
    public boolean f280689d = false;

    /* renamed from: e */
    public SnsCommentShowAbLayout f280690e = null;

    /* renamed from: f */
    public LinearLayout f280691f;

    /* renamed from: g */
    public LinearLayout f280692g;

    /* renamed from: com.tencent.mm.plugin.sns.ui.o8$b */
    public class C43133b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f116704a;

        public C43133b(View view) {
            this.f116704a = view;
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
            View view = this.f116704a;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C96104o8.this.mo133671d();
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o8$a */
    public class C96105a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f280693d;

        /* renamed from: e */
        public final /* synthetic */ View f280694e;

        public C96105a(View view, View view2) {
            this.f280693d = view;
            this.f280694e = view2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
            Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix initCommentView.");
            C96104o8 o8Var = C96104o8.this;
            View view = this.f280693d;
            View view2 = this.f280694e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            o8Var.getClass();
            SnsMethodCalculate.markStartTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            SnsInfo DN = C94866e1.Yx0().mo139798DN(baseViewHolder.f279956g);
            if (DN != null) {
                C91998s.m115550d(740);
                C94897n1.m120367e(DN);
                C102236a0.m134728W(DN);
                DN.isAd();
                DN.getUxinfo();
                DN.getUserName();
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            String str = "run";
            String str2 = "initCommentView";
            String str3 = "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper";
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix cacheCommentContainer visible.");
            view2.startAnimation(o8Var.f280687b.f278581o);
            view2.sendAccessibilityEvent(8);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.f5709mg);
            o8Var.f280691f = linearLayout;
            linearLayout.setOnClickListener(o8Var.f280687b.f278572f.f280388r);
            o8Var.f280691f.setOnTouchListener(o8Var.f280687b.f278562N);
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C0966R.C0970id.f5731n3);
            o8Var.f280692g = linearLayout2;
            linearLayout2.setOnClickListener(o8Var.f280687b.f278572f.f280389s);
            o8Var.f280692g.setOnTouchListener(o8Var.f280687b.f278562N);
            BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
            o8Var.f280692g.setTag(baseViewHolder2);
            o8Var.f280691f.setTag(baseViewHolder2);
            WeImageView weImageView = (WeImageView) o8Var.f280692g.findViewById(C0966R.C0970id.f5730n2);
            WeImageView weImageView2 = (WeImageView) o8Var.f280691f.findViewById(C0966R.C0970id.f5700m8);
            weImageView2.setIconColor(view.getResources().getColor(C0966R.color.f2975b6));
            TextView textView = (TextView) o8Var.f280692g.findViewById(C0966R.C0970id.f5732n4);
            TextView textView2 = (TextView) o8Var.f280691f.findViewById(C0966R.C0970id.f5710mh);
            if (C100417r0.m131417f(baseViewHolder2.f279950d)) {
                Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix isInValid.");
                o8Var.f280691f.setEnabled(false);
                o8Var.f280692g.setEnabled(false);
                textView2.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.ad5));
                if (baseViewHolder2.f279946b == 10) {
                    weImageView.setImageResource(C0966R.raw.friendactivity_comment_likeicon_golden_normal);
                    weImageView2.setImageResource(C0966R.raw.friendactivity_comment_writeicon_golden_normal);
                } else {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                    weImageView.setIconColor(view.getResources().getColor(C0966R.color.f2975b6));
                    weImageView2.setImageResource(C0966R.raw.friendactivity_comment_writeicon_normal);
                }
                textView.setText(o8Var.f280686a.getString(C0966R.string.je7));
                textView.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.ad5));
            } else {
                Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix Valid.");
                o8Var.f280691f.setEnabled(true);
                if (baseViewHolder2.f279946b == 10) {
                    weImageView.setImageResource(C0966R.C0969drawable.ade);
                    weImageView2.setImageResource(C0966R.C0969drawable.adf);
                    textView.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.add));
                    textView2.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.add));
                } else {
                    textView.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.al_));
                    textView2.setTextColor(o8Var.f280686a.getResources().getColor(C0966R.color.al_));
                }
                o8Var.f280692g.setEnabled(true);
                if (baseViewHolder2.f279958h == 0) {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                    weImageView.setIconColor(view.getResources().getColor(C0966R.color.f2975b6));
                    textView.setText(o8Var.f280686a.getString(C0966R.string.je7));
                    textView.setContentDescription(o8Var.f280686a.getString(C0966R.string.je7));
                } else {
                    if (o8Var.f280689d) {
                        weImageView.setImageResource(C0966R.raw.icons_filled_like);
                        weImageView.setIconColor(view.getResources().getColor(C0966R.color.f2966ao));
                    } else {
                        weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                        weImageView.setIconColor(view.getResources().getColor(C0966R.color.f2975b6));
                    }
                    textView.setText(o8Var.f280686a.getString(C0966R.string.jcy));
                    textView.setContentDescription(o8Var.f280686a.getString(C0966R.string.j94));
                }
            }
            if (baseViewHolder2.f279946b == 10) {
                o8Var.f280692g.setBackgroundResource(C0966R.C0969drawable.aep);
                o8Var.f280691f.setBackgroundResource(C0966R.C0969drawable.aeq);
            }
            String str4 = str3;
            SnsMethodCalculate.markEndTimeMs(str2, str4);
            SnsMethodCalculate.markEndTimeMs("access$000", str4);
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o8$c */
    public class C96106c {

        /* renamed from: a */
        public String f280696a;

        /* renamed from: b */
        public View f280697b;

        public C96106c(C96104o8 o8Var, String str, View view) {
            this.f280696a = str;
            this.f280697b = view;
        }
    }

    public C96104o8(Context context, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, FrameLayout frameLayout, View view) {
        boolean z = false;
        this.f280686a = context;
        this.f280687b = snsTimeLineBaseAdapter;
        this.f280688c = frameLayout;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        this.f280689d = (j == 0 ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_enhance_like_gallery, 2) : j) == 2 ? true : z;
    }

    /* renamed from: a */
    public boolean mo133668a(View view) {
        View view2 = view;
        SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            Log.m105920e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
            SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return false;
        }
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
        String str = baseViewHolder.f279956g;
        SnsCommentShowAbLayout snsCommentShowAbLayout = this.f280690e;
        if (snsCommentShowAbLayout != null) {
            if (snsCommentShowAbLayout.getTag() instanceof C96106c) {
                C96106c cVar = (C96106c) this.f280690e.getTag();
                if (cVar.f280696a.equals(str)) {
                    mo133670c(cVar.f280697b);
                    Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix closeCommentView.");
                    SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
                    return true;
                }
            }
            mo133671d();
            this.f280690e = null;
        }
        SnsCommentShowAbLayout snsCommentShowAbLayout2 = new SnsCommentShowAbLayout(this.f280686a);
        this.f280690e = snsCommentShowAbLayout2;
        ForceGpuUtil.setLayerType(snsCommentShowAbLayout2);
        this.f280690e.setId(C0966R.C0970id.f5608jp);
        new FrameLayout.LayoutParams(-1, -1);
        this.f280688c.addView(this.f280690e);
        Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(ablayout).");
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f280686a, 76.0f);
        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f280686a, 12.0f);
        int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f280686a, 16.0f);
        int fromDPToPix4 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f280686a, 40.0f);
        View inflate = C85868k2.m106137b(this.f280686a).inflate(C0966R.C0971layout.c2f, (ViewGroup) null);
        int[] iArr = new int[2];
        int b = C76577a.m92151b(this.f280686a, 1);
        view2.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f280690e.getLocationInWindow(iArr2);
        iArr[1] = iArr[1] - iArr2[1];
        StringBuilder sb = new StringBuilder();
        sb.append("addCommentView getLocationInWindow ");
        String str2 = "addCommentView";
        sb.append(iArr[0]);
        sb.append("  ");
        sb.append(iArr[1]);
        sb.append(" height: ");
        sb.append(b);
        sb.append(" height_hardcode:");
        sb.append(fromDPToPix);
        Log.m105924i("MicroMsg.TimeLineCommentHelper", sb.toString());
        AbsoluteLayout.LayoutParams layoutParams = new AbsoluteLayout.LayoutParams(-1, -2, fromDPToPix2 - fromDPToPix3, (iArr[1] - b) - ((fromDPToPix4 / 2) - (view.getMeasuredHeight() / 2)));
        this.f280690e.setTag(new C96106c(this, str, inflate));
        LinearLayout linearLayout = new LinearLayout(this.f280686a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setHorizontalGravity(8388613);
        layoutParams.width = iArr[0];
        linearLayout.addView(inflate, layoutParams2);
        this.f280690e.addView(linearLayout, layoutParams);
        Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(commentView, apar).");
        if (baseViewHolder.f279946b == 10) {
            inflate.findViewById(C0966R.C0970id.f5694m2).setBackgroundResource(C0966R.C0969drawable.cho);
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = inflate;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix comment gone.");
        new MMHandler().post(new C96105a(view2, inflate));
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return true;
    }

    /* renamed from: b */
    public void mo133669b(View view) {
        SnsMethodCalculate.markStartTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            SnsMethodCalculate.markEndTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return;
        }
        String str = ((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279956g;
        SnsCommentShowAbLayout snsCommentShowAbLayout = this.f280690e;
        if (snsCommentShowAbLayout != null && (snsCommentShowAbLayout.getTag() instanceof C96106c)) {
            C96106c cVar = (C96106c) this.f280690e.getTag();
            if (cVar.f280696a.equals(str)) {
                mo133670c(cVar.f280697b);
            }
        }
        SnsMethodCalculate.markEndTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    /* renamed from: c */
    public final void mo133670c(View view) {
        SnsMethodCalculate.markStartTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        view.clearAnimation();
        view.startAnimation(this.f280687b.f278582p);
        this.f280687b.f278582p.setAnimationListener(new C43133b(view));
        SnsMethodCalculate.markEndTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    /* renamed from: d */
    public boolean mo133671d() {
        SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (this.f280690e != null) {
            Log.m105924i("MicroMsg.TimeLineCommentHelper", "snsCommentFix removeCommentView.");
            this.f280688c.removeView(this.f280690e);
            this.f280690e = null;
            SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return false;
    }
}
