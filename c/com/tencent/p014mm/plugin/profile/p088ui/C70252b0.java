package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qy2.C77451h;
import qy2.C77453j;

/* renamed from: com.tencent.mm.plugin.profile.ui.b0 */
public class C70252b0 implements PullDownListView.C74996e {

    /* renamed from: a */
    public final /* synthetic */ int f203004a;

    /* renamed from: b */
    public final /* synthetic */ ContactInfoUI f203005b;

    public C70252b0(ContactInfoUI contactInfoUI, int i) {
        this.f203005b = contactInfoUI;
        this.f203004a = i;
    }

    /* renamed from: a */
    public void mo96754a(float f) {
        float f2 = f;
        this.f203005b.f202526L.setTranslationY(f2);
        int i = this.f203004a;
        float f3 = f2 / ((float) i);
        if (f2 < 0.0f) {
            f3 = 0.0f;
        }
        if (f2 > ((float) i)) {
            f3 = 1.0f;
        }
        C77451h hVar = this.f203005b.f202517C;
        if (hVar != null) {
            hVar.mo106676v(f3, f2, (float) i);
        }
        ContactInfoUI contactInfoUI = this.f203005b;
        if (contactInfoUI.f202531f == null) {
            contactInfoUI.f202531f = (NormalProfileHeaderPreference) contactInfoUI.f202529d.mo72519a("contact_profile_header_normal");
        }
        NormalProfileHeaderPreference normalProfileHeaderPreference = this.f203005b.f202531f;
        if (normalProfileHeaderPreference != null) {
            View view = normalProfileHeaderPreference.f202576Q;
            View view2 = null;
            LinearLayout linearLayout = view != null ? ((NormalProfileHeaderPreference.C70150c) view.getTag()).f202616t : null;
            if (linearLayout != null) {
                float f4 = 1.0f * (1.0f - f3);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f4));
                C117292a.m165358d(linearLayout, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                linearLayout.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(linearLayout, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view3 = this.f203005b.f202531f.f202576Q;
                if (view3 != null) {
                    view2 = ((NormalProfileHeaderPreference.C70150c) view3.getTag()).f202618v;
                }
                View view4 = view2;
                if (view4 != null) {
                    if (f4 <= 0.0f) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$15", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            C77453j L = this.f203005b.f202531f.mo96613L();
            if (L != null) {
                L.mo106676v(f3, f2, (float) this.f203004a);
            }
        }
    }
}
