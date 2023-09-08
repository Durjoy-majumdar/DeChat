package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.p475ui.VoipBaseFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p629ny.C76979h;
import qe0.C47806g;

/* renamed from: com.tencent.mm.plugin.voip.ui.y */
public final class C106475y {

    /* renamed from: a */
    public ImageView f318022a;

    /* renamed from: b */
    public TextView f318023b;

    /* renamed from: c */
    public TextView f318024c;

    /* renamed from: d */
    public TextView f318025d;

    /* renamed from: e */
    public View f318026e;

    /* renamed from: f */
    public TextView f318027f;

    /* renamed from: g */
    public VoipBaseFragment.C106434f f318028g = new VoipBaseFragment.C106434f();

    /* renamed from: h */
    public View f318029h;

    /* renamed from: i */
    public boolean f318030i;

    /* renamed from: a */
    public final View mo153037a(Context context, FrameLayout frameLayout, String str, boolean z) {
        TextView textView;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "rootView");
        C87412m.m108594g(str, "mUserName");
        View inflate = z ? LayoutInflater.from(context).inflate(C0966R.C0971layout.b5j, frameLayout) : LayoutInflater.from(context).inflate(C0966R.C0971layout.b5k, frameLayout);
        this.f318029h = inflate;
        if (inflate != null) {
            View findViewById = inflate.findViewById(C0966R.C0970id.ld6);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f318022a = (ImageView) findViewById;
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106843mB(this.f318022a, str, 0.125f);
            View findViewById2 = inflate.findViewById(C0966R.C0970id.ld8);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById2;
            this.f318023b = textView2;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context2 = inflate.getContext();
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
            TextView textView3 = this.f318023b;
            textView2.setText(hVar.yp0(context2, displayName, textView3 != null ? textView3.getTextSize() : 14.0f));
            View findViewById3 = inflate.findViewById(C0966R.C0970id.lct);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f318025d = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(C0966R.C0970id.lcr);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f318024c = (TextView) findViewById4;
            this.f318026e = inflate.findViewById(C0966R.C0970id.lcs);
            this.f318027f = (TextView) inflate.findViewById(C0966R.C0970id.ld9);
            TextView textView4 = this.f318025d;
            if (textView4 == null) {
                Log.m105920e("MicroMsg.VoIPAvatarContentLayoutUI", "TextView is null or text is null");
            } else {
                textView4.setText(C0966R.string.f361526kj1);
                View view = this.f318029h;
                if (view != null) {
                    textView4.measure(View.MeasureSpec.makeMeasureSpec(view.getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
                    textView4.setWidth(textView4.getMeasuredWidth());
                }
            }
            String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str));
            this.f318030i = C72996z1.m85843n5(str);
            if (!Util.isNullOrNil(a) && (textView = this.f318027f) != null) {
                textView.setText(a);
            }
        }
        return this.f318029h;
    }

    /* renamed from: b */
    public final void mo153038b(boolean z) {
        View view = this.f318029h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledInviting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledInviting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f318026e;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledInviting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledInviting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z) {
            TextView textView = this.f318024c;
            if (textView != null) {
                textView.setText(C0966R.string.kh7);
            }
        } else {
            TextView textView2 = this.f318024c;
            if (textView2 != null) {
                textView2.setText(C0966R.string.kh6);
            }
        }
        TextView textView3 = this.f318027f;
        if (textView3 != null) {
            if (this.f318030i) {
                if (!Util.isNullOrNil(textView3 != null ? textView3.getText() : null)) {
                    TextView textView4 = this.f318027f;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
            }
            TextView textView5 = this.f318027f;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        this.f318028g.mo152984a(this.f318025d, VoipBaseFragment.f317906G, 500);
    }

    /* renamed from: c */
    public final void mo153039c() {
        TextView textView = this.f318027f;
        if (textView != null) {
            if (!this.f318030i || Util.isNullOrNil(textView.getText())) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        View view = this.f318029h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingWaitingAccept", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingWaitingAccept", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView2 = this.f318024c;
        if (textView2 != null) {
            textView2.setText(C0966R.string.kh5);
        }
        this.f318028g.mo152984a(this.f318025d, VoipBaseFragment.f317906G, 500);
        View view3 = this.f318026e;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingWaitingAccept", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingWaitingAccept", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public final void mo153040d() {
        TextView textView = this.f318024c;
        if (textView != null) {
            textView.setText(C0966R.string.kjs);
        }
        this.f318028g.mo152984a(this.f318025d, VoipBaseFragment.f317906G, 500);
        View view = this.f318026e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
