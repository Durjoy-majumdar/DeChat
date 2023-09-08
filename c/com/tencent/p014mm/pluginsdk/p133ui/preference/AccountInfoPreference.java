package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.story.PluginStory;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import p196ln.C76705f;
import p220pr.C77288i;
import p773yy.C79168k;
import qy2.C77448f0;
import qy2.C77453j;
import xv2.C102775d;
import xv2.C79005m;
import zv2.C103109c;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference */
public class AccountInfoPreference extends Preference {

    /* renamed from: J */
    public SpannableString f212361J;

    /* renamed from: K */
    public String f212362K;

    /* renamed from: L */
    public String f212363L;

    /* renamed from: M */
    public RelativeLayout f212364M;

    /* renamed from: N */
    public View f212365N;

    /* renamed from: P */
    public View f212366P;

    /* renamed from: Q */
    public View f212367Q;

    /* renamed from: Q0 */
    public boolean f212368Q0;

    /* renamed from: R */
    public View f212369R;

    /* renamed from: R0 */
    public boolean f212370R0;

    /* renamed from: S */
    public View f212371S;

    /* renamed from: S0 */
    public View.OnLayoutChangeListener f212372S0;

    /* renamed from: T */
    public C77453j f212373T;

    /* renamed from: T0 */
    public View.OnClickListener f212374T0;

    /* renamed from: U */
    public boolean f212375U;

    /* renamed from: U0 */
    public View.OnClickListener f212376U0;

    /* renamed from: V */
    public boolean f212377V;

    /* renamed from: W */
    public boolean f212378W;

    /* renamed from: X */
    public boolean f212379X;

    /* renamed from: Y */
    public NoMeasuredTextView f212380Y;

    /* renamed from: Z */
    public ImageView f212381Z;

    /* renamed from: p0 */
    public RelativeLayout f212382p0;

    /* renamed from: x0 */
    public FrameLayout f212383x0;

    /* renamed from: y0 */
    public LinearLayout f212384y0;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference$a */
    public class C72875a implements View.OnClickListener {
        public C72875a() {
        }

        public void onClick(View view) {
            Class cls = C77288i.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((C77288i) C86312j.m106911c(cls)).mo107435Zo()) {
                ((C77288i) C86312j.m106911c(cls)).mo107433Pg(AccountInfoPreference.this.f121274d);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C88144b.m109791i(AccountInfoPreference.this.f121274d, "setting", ".ui.setting.SettingsPersonalInfoUI", new Intent(), (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference$b */
    public class C72876b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f212386d;

        public C72876b(View view) {
            this.f212386d = view;
        }

        public void run() {
            AccountInfoPreference accountInfoPreference = AccountInfoPreference.this;
            if (!accountInfoPreference.f212370R0) {
                accountInfoPreference.f212381Z = (ImageView) this.f212386d.findViewById(C0966R.C0970id.bou);
                AccountInfoPreference.this.f212382p0 = (RelativeLayout) this.f212386d.findViewById(C0966R.C0970id.bos);
                AccountInfoPreference.this.f212383x0 = (FrameLayout) this.f212386d.findViewById(C0966R.C0970id.bor);
                AccountInfoPreference.this.f212384y0 = (LinearLayout) this.f212386d.findViewById(C0966R.C0970id.boy);
                AccountInfoPreference accountInfoPreference2 = AccountInfoPreference.this;
                accountInfoPreference2.f212370R0 = true;
                int f = !accountInfoPreference2.f212378W ? C76577a.m92155f(accountInfoPreference2.f121274d, C0966R.dimen.akh) - C76577a.m92155f(AccountInfoPreference.this.f121274d, C0966R.dimen.aki) : 0;
                Log.m105919d("MicroMsg.AccountInfoPreference", "root.width:%s, root.height:%s, tip.width:%s, tip.height:%s, offsetY:%s", Integer.valueOf(AccountInfoPreference.this.f212383x0.getWidth()), Integer.valueOf(AccountInfoPreference.this.f212383x0.getHeight()), Integer.valueOf(AccountInfoPreference.this.f212381Z.getWidth()), Integer.valueOf(AccountInfoPreference.this.f212381Z.getHeight()), Integer.valueOf(f));
                C79005m Eg0 = ((C102775d) C86312j.m106911c(C102775d.class)).Eg0();
                AccountInfoPreference accountInfoPreference3 = AccountInfoPreference.this;
                Eg0.mo108966b(accountInfoPreference3.f212383x0, accountInfoPreference3.f212381Z, 0, f);
                AccountInfoPreference.this.mo100713I();
            }
        }
    }

    public AccountInfoPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public void mo100713I() {
        Log.m105925i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip isListVisible:%s", Boolean.valueOf(this.f212368Q0));
        mo100714J();
        if (this.f212370R0) {
            Log.m105925i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip mBubbleContentNewGroup.visible:%s, mStoryBubbleTipViews.visible:%s", Integer.valueOf(this.f212384y0.getVisibility()), Integer.valueOf(this.f212381Z.getVisibility()));
        }
    }

    /* renamed from: J */
    public void mo100714J() {
        Log.m105925i("MicroMsg.AccountInfoPreference", "forceStopBubbleTip this:%s, bindView:%s", this, Boolean.valueOf(this.f212370R0));
        if (this.f212370R0) {
            this.f212382p0.setVisibility(8);
            ((PluginStory) C86312j.m106911c(PluginStory.class)).getClass();
            if (C103109c.f304232b.mo108963a()) {
                this.f212384y0.setVisibility(8);
                return;
            }
            this.f212381Z.setVisibility(8);
            this.f212383x0.setVisibility(8);
            ((C102775d) C86312j.m106911c(C102775d.class)).Eg0().mo108969e(this.f212381Z);
        }
    }

    /* renamed from: K */
    public void mo100715K(boolean z, boolean z2, boolean z3) {
        View view;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        this.f212378W = z4;
        this.f212379X = z5;
        this.f212377V = z6;
        boolean f = C77448f0.m93394f();
        this.f212375U = f;
        NoMeasuredTextView noMeasuredTextView = this.f212380Y;
        if (noMeasuredTextView != null) {
            if (!f) {
                if (z4) {
                    noMeasuredTextView.setTextColor(C76577a.m92154e(this.f121274d, C0966R.color.al_));
                } else {
                    noMeasuredTextView.setTextColor(this.f121274d.getResources().getColor(C0966R.color.FG_0));
                }
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f212364M.getLayoutParams();
            layoutParams.gravity = 8388693;
            this.f212364M.setGravity(16);
            this.f212364M.setLayoutParams(layoutParams);
        }
        if (!this.f212375U || !z6) {
            View view2 = this.f212366P;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view4 = this.f212366P;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!this.f212375U || z6) {
            View view5 = this.f212365N;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view7 = this.f212365N;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f212375U && (view = this.f212367Q) != null) {
            view.setOnClickListener(this.f212376U0);
        }
        if (this.f212367Q != null) {
            int f2 = (z4 || !z5) ? C76577a.m92155f(this.f121274d, C0966R.dimen.akh) : C76577a.m92155f(this.f121274d, C0966R.dimen.aki);
            if (this.f212375U) {
                f2 = C76577a.m92155f(this.f121274d, C0966R.dimen.aki);
            }
            View view9 = this.f212367Q;
            view9.setPadding(view9.getPaddingLeft(), f2, this.f212367Q.getPaddingRight(), this.f212367Q.getPaddingBottom());
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f212369R = view;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f212372S0;
        this.f212372S0 = onLayoutChangeListener;
        if (onLayoutChangeListener != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.a27);
        if (!(this.f212362K == null || imageView == null || !C86709a0.m107522a())) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, this.f212362K);
        }
        imageView.setOnClickListener(this.f212376U0);
        NoMeasuredTextView noMeasuredTextView = (NoMeasuredTextView) view.findViewById(C0966R.C0970id.hfq);
        this.f212380Y = noMeasuredTextView;
        if (!(this.f212362K == null || noMeasuredTextView == null)) {
            noMeasuredTextView.setShouldEllipsize(true);
            this.f212380Y.mo153549i(0, (float) C76577a.m92157h(this.f121274d, C0966R.dimen.f3882hr));
            if (!this.f212375U) {
                if (this.f212378W) {
                    this.f212380Y.setTextColor(C76577a.m92154e(this.f121274d, C0966R.color.al_));
                } else {
                    this.f212380Y.setTextColor(this.f121274d.getResources().getColor(C0966R.color.FG_0));
                }
            }
            NoMeasuredTextView noMeasuredTextView2 = this.f212380Y;
            CharSequence charSequence = this.f212361J;
            if (charSequence == null) {
                charSequence = this.f212362K;
            }
            noMeasuredTextView2.setText(charSequence);
            if (this.f212380Y.getPaint() != null) {
                this.f212380Y.getPaint().setFakeBoldText(true);
            }
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.l29);
        if (this.f212363L != null && textView != null) {
            textView.setText(this.f121274d.getResources().getString(C0966R.string.f7565jt, new Object[]{this.f212363L}));
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(this.f212376U0);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.itw);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.i_e);
        this.f212364M = relativeLayout;
        relativeLayout.setOnClickListener(this.f212376U0);
        this.f212365N = view.findViewById(C0966R.C0970id.f358388eu2);
        this.f212366P = view.findViewById(C0966R.C0970id.eu4);
        this.f212367Q = view.findViewById(C0966R.C0970id.eu7);
        this.f212371S = view.findViewById(C0966R.C0970id.f359475l31);
        if (this.f212367Q != null) {
            int f = (this.f212378W || !this.f212379X) ? C76577a.m92155f(this.f121274d, C0966R.dimen.akh) : C76577a.m92155f(this.f121274d, C0966R.dimen.aki);
            if (this.f212375U) {
                f = C76577a.m92155f(this.f121274d, C0966R.dimen.aki);
            }
            View view2 = this.f212367Q;
            view2.setPadding(view2.getPaddingLeft(), f, this.f212367Q.getPaddingRight(), this.f212367Q.getPaddingBottom());
            if (this.f212375U) {
                this.f212367Q.setOnClickListener(this.f212376U0);
            } else {
                this.f212367Q.setOnClickListener(this.f212374T0);
            }
        }
        View view3 = this.f212367Q;
        C77453j jVar = this.f212373T;
        if (jVar != null) {
            if (jVar.mo107629j(view, view3)) {
                this.f212373T.mo72647c();
            }
            mo100715K(this.f212378W, this.f212379X, this.f212377V);
            view.post(new C72876b(view));
        }
        if (C77448f0.m93394f() && (view instanceof RelativeLayout)) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view;
            C77453j ej = ((C79168k) C86312j.m106911c(C79168k.class)).mo74126ej(this.f121274d, relativeLayout2, (LinearLayout) view3);
            relativeLayout2.addView(ej.getView());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ej.getView().getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.addRule(3, C0966R.C0970id.eu7);
            ej.mo72650h(this.f212362K);
            this.f212373T = ej;
        }
        mo100715K(this.f212378W, this.f212379X, this.f212377V);
        view.post(new C72876b(view));
    }

    public AccountInfoPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f212373T = null;
        this.f212375U = false;
        this.f212377V = false;
        this.f212378W = false;
        this.f212379X = true;
        this.f212380Y = null;
        this.f212381Z = null;
        this.f212382p0 = null;
        this.f212383x0 = null;
        this.f212384y0 = null;
        this.f212368Q0 = true;
        this.f212370R0 = false;
        this.f212372S0 = null;
        this.f212374T0 = null;
        this.f212376U0 = new C72875a();
    }
}
