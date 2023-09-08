package com.tencent.p014mm.plugin.voip.p475ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import y33.C112390a;

/* renamed from: com.tencent.mm.plugin.voip.ui.e0 */
public final class C106444e0 {

    /* renamed from: a */
    public C112390a f317975a;

    /* renamed from: b */
    public View f317976b;

    /* renamed from: c */
    public WeImageView f317977c;

    /* renamed from: d */
    public WeImageView f317978d;

    /* renamed from: e */
    public LinearLayout f317979e;

    /* renamed from: f */
    public long f317980f;

    /* renamed from: g */
    public final View.OnClickListener f317981g = new C106445a(this);

    /* renamed from: com.tencent.mm.plugin.voip.ui.e0$a */
    public static final class C106445a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106444e0 f317982d;

        public C106445a(C106444e0 e0Var) {
            this.f317982d = e0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$mMinimizeVoipLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            C106444e0 e0Var = this.f317982d;
            if (currentTimeMillis - e0Var.f317980f <= 1000) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$mMinimizeVoipLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            e0Var.f317980f = System.currentTimeMillis();
            C112390a.C112391a.m153348a(this.f317982d.f317975a, C112390a.C112392b.MINI_ICON_CLICK, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$mMinimizeVoipLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.e0$b */
    public static final class C106446b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106444e0 f317983d;

        public C106446b(C106444e0 e0Var) {
            this.f317983d = e0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$updateSplitScreenBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112390a.C112391a.m153348a(this.f317983d.f317975a, C112390a.C112392b.SPLIT_BTN_CLICK, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI$updateSplitScreenBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C106444e0(C112390a aVar) {
        C87412m.m108594g(aVar, "statusManager");
        this.f317975a = aVar;
    }

    /* renamed from: a */
    public final void mo152998a() {
        View view = this.f317976b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI", "dismissUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI", "dismissUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final boolean mo152999b(int i) {
        WeImageView weImageView = this.f317978d;
        if (weImageView == null) {
            return false;
        }
        if (weImageView == null) {
            return true;
        }
        if (i != -1) {
            weImageView.setVisibility(0);
            if (i == 2) {
                WeImageView weImageView2 = this.f317978d;
                if (weImageView2 != null) {
                    weImageView2.setBackground(C74933u4.m89768e(weImageView.getContext(), C0966R.raw.icons_outlined_merge, -1));
                }
            } else {
                WeImageView weImageView3 = this.f317978d;
                if (weImageView3 != null) {
                    weImageView3.setBackground(C74933u4.m89768e(weImageView.getContext(), C0966R.raw.icons_outlined_sperated, -1));
                }
            }
            weImageView.setOnClickListener(new C106446b(this));
            return true;
        }
        weImageView.setVisibility(8);
        return true;
    }
}
