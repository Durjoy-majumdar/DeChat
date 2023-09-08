package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import d03.C58010a;
import di3.C7335d;
import di3.C86312j;
import ek2.C7729d;
import ek2.C7730e;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import pl1.C11978e0;
import qo3.C101218e0;
import ve3.C65681f0;
import ve3.C65685n0;
import w33.C111730z;
import wj2.C66132f;
import xj2.C66286a;

/* renamed from: com.tencent.mm.plugin.voip.ui.c0 */
public final class C57470c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66132f f164665d;

    /* renamed from: e */
    public final /* synthetic */ C106444e0 f164666e;

    public C57470c0(C66132f fVar, C106444e0 e0Var) {
        this.f164665d = fVar;
        this.f164666e = e0Var;
    }

    public final void onClick(View view) {
        C57470c0 c0Var;
        C65681f0 f0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$applyEvent$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111730z zVar = C111730z.f334576a;
        C111730z.f334596u = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_ringtone_entrance, true)) {
            Context context = view.getContext();
            C87412m.m108593f(context, "it.context");
            C66132f fVar = this.f164665d;
            C87412m.m108593f(fVar, "desc");
            C58010a aVar = fVar.f190078a;
            if (aVar != null) {
                aVar.f165940l = true;
            }
            C101218e0 e0Var = new C101218e0(context, 0, 0, true);
            Integer num = null;
            View inflate = LayoutInflater.from(e0Var.f296384g.getContext()).inflate(C0966R.C0971layout.bto, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(dialog.rootView.con…ne_setting_calling, null)");
            ((TextView) inflate.findViewById(C0966R.C0970id.iui)).setText(C0966R.string.hg7);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.iuc);
            WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.f359104iv1);
            Button button = (Button) inflate.findViewById(C0966R.C0970id.f359103iv0);
            button.setText(C0966R.string.inz);
            if (weImageView != null) {
                weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_close, context.getResources().getColor(C0966R.color.FG_0)));
            }
            if (imageView != null) {
                imageView.setImageDrawable(e0Var.f296384g.getContext().getDrawable(C0966R.C0969drawable.f4939ru));
            }
            if (imageView != null) {
                C7335d c = C86312j.m106911c(C60200t1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C60200t1.C60201a.m70370h((C60200t1) c, fVar.f190088k, imageView, (C11978e0.C11979a) null, 4, (Object) null);
            }
            View findViewById = inflate.findViewById(C0966R.C0970id.i9g);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359106iv3);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.iue);
            if (fVar.f190081d == null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.i9h);
                C65685n0 n0Var = fVar.f190083f;
                if (!(n0Var == null || (f0Var = n0Var.f189021e) == null)) {
                    num = Integer.valueOf(f0Var.f188992n);
                }
                if (num != null && num.intValue() == 0) {
                    textView3.setText(inflate.getContext().getResources().getText(C0966R.string.hp4));
                } else if (num != null && num.intValue() == 1) {
                    textView3.setText(inflate.getContext().getResources().getText(C0966R.string.hp5));
                } else {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                int d = C76577a.m92153d(context, C0966R.color.BW_100_Alpha_0_8);
                Drawable mutate = C76577a.m92158i(context, C0966R.raw.icon_filled_qqmusic).mutate();
                C87412m.m108593f(mutate, "getDrawable(context, drawableRes).mutate()");
                mutate.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d), Color.red(d), Color.green(d), Color.blue(d)), PorterDuff.Mode.SRC_ATOP));
                mutate.setAlpha(Color.alpha(d));
                ((ImageView) inflate.findViewById(C0966R.C0970id.i9f)).setImageDrawable(mutate);
            } else {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog", "showRingtoneSettingHalfUIWithoutPlayer", "(Landroid/content/Context;Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setText(fVar.f190085h);
            textView2.setText(fVar.f190087j);
            weImageView.setOnClickListener(new C7729d(e0Var));
            button.setOnClickListener(new C7730e(context, fVar, e0Var));
            e0Var.mo140663j(inflate);
            e0Var.mo140655A();
            C66286a.m78218e(fVar.mo90173d(), fVar.mo90172c(), 4, 1, 0, (String) null, false, false, (String) null, false, false, (String) null, false, 8160, (Object) null);
            c0Var = this;
        } else {
            c0Var = this;
            C106444e0 e0Var2 = c0Var.f164666e;
            C66132f fVar2 = c0Var.f164665d;
            C87412m.m108593f(fVar2, "desc");
            LinearLayout linearLayout = e0Var2.f317979e;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = e0Var2.f317979e;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C57472f0(e0Var2, fVar2));
            }
        }
        C117292a.m165361g(c0Var, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$applyEvent$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
