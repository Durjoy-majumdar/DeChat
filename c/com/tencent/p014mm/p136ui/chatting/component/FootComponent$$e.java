package com.tencent.p014mm.p136ui.chatting.component;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.ChatFooterCustom;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import zj3.C79348e;

/* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$e */
public class FootComponent$$e implements ChatFooter$$n1 {

    /* renamed from: a */
    public Animation f215527a;

    /* renamed from: b */
    public Animation f215528b;

    /* renamed from: c */
    public final /* synthetic */ FootComponent f215529c;

    public FootComponent$$e(FootComponent footComponent) {
        this.f215529c = footComponent;
    }

    /* renamed from: a */
    public boolean mo70088a(boolean z) {
        if (this.f215527a == null) {
            this.f215527a = AnimationUtils.loadAnimation(this.f215529c.f215752d.f193286j.getContext(), C0966R.C0968anim.f2471dv);
            this.f215528b = AnimationUtils.loadAnimation(this.f215529c.f215752d.f193286j.getContext(), C0966R.C0968anim.f2469dt);
        }
        int i = 1;
        if (z) {
            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "switchFooterToInput customFooter is %s", this.f215529c.f215512g);
            ChatFooterCustom chatFooterCustom = this.f215529c.f215512g;
            if (chatFooterCustom != null) {
                chatFooterCustom.startAnimation(this.f215528b);
            }
            this.f215529c.mo102181L2();
            this.f215529c.f215510e.startAnimation(this.f215527a);
            this.f215529c.f215510e.postInvalidateDelayed(this.f215527a.getDuration());
        } else {
            this.f215529c.f215510e.startAnimation(this.f215528b);
            this.f215529c.mo102192h6();
            ChatFooterCustom chatFooterCustom2 = this.f215529c.f215512g;
            if (chatFooterCustom2 != null) {
                chatFooterCustom2.startAnimation(this.f215527a);
                this.f215529c.f215512g.postInvalidateDelayed(this.f215527a.getDuration());
            }
        }
        C79348e eVar = (C79348e) this.f215529c.f215752d.f193278b.mo102812a(C79348e.class);
        if (eVar != null) {
            String r = this.f215529c.f215752d.mo91577r();
            if (!z) {
                i = 2;
            }
            eVar.mo70066f5(r, i);
        }
        return false;
    }
}
