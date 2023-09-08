package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import pj3.C47511g;
import qy2.C77451h;
import qy2.C77453j;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$h */
public class ContactInfoUI$$h implements PullDownListView.IPullDownCallback {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202553d;

    public ContactInfoUI$$h(ContactInfoUI contactInfoUI) {
        this.f202553d = contactInfoUI;
    }

    /* renamed from: e */
    public void mo96596e() {
        Log.m105924i("MicroMsg.ContactInfoUI", "story_cat onMuteIn");
        ContactInfoUI contactInfoUI = this.f202553d;
        int i = ContactInfoUI.f202514P;
        contactInfoUI.getClass();
    }

    /* renamed from: i */
    public void mo96597i(int i) {
    }

    /* renamed from: n */
    public void mo96598n() {
        ContactInfoUI contactInfoUI = this.f202553d;
        int i = ContactInfoUI.f202514P;
        contactInfoUI.getClass();
    }

    public void onPostClose() {
        View view;
        NormalProfileHeaderPreference normalProfileHeaderPreference;
        C77453j L;
        C77451h hVar = this.f202553d.f202517C;
        if (hVar != null) {
            hVar.onPostClose();
        }
        C47511g gVar = this.f202553d.f202529d;
        if (!(gVar == null || (normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal")) == null || (L = normalProfileHeaderPreference.mo96613L()) == null)) {
            L.onPostClose();
        }
        this.f202553d.showTitleView();
        NormalProfileHeaderPreference normalProfileHeaderPreference2 = (NormalProfileHeaderPreference) this.f202553d.f202529d.mo72519a("contact_profile_header_normal");
        View view2 = null;
        if (!(normalProfileHeaderPreference2 == null || (view = normalProfileHeaderPreference2.f202576Q) == null)) {
            view2 = ((NormalProfileHeaderPreference.C70150c) view.getTag()).f202595F;
        }
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r0.mo72519a("contact_profile_header_normal");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostOpen(boolean r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r11.f202553d
            qy2.h r0 = r0.f202517C
            if (r0 == 0) goto L_0x0009
            r0.onPostOpen(r12)
        L_0x0009:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r11.f202553d
            pj3.g r0 = r0.f202529d
            java.lang.String r1 = "contact_profile_header_normal"
            r2 = 0
            if (r0 == 0) goto L_0x001f
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r0
            if (r0 == 0) goto L_0x001f
            qy2.j r0 = r0.mo96613L()
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.onPostOpen(r12)
        L_0x0025:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r12 = r11.f202553d
            r12.hideTitleView()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r12 = r11.f202553d
            pj3.g r12 = r12.f202529d
            com.tencent.mm.ui.base.preference.Preference r12 = r12.mo72519a(r1)
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r12 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r12
            if (r12 == 0) goto L_0x0042
            android.view.View r12 = r12.f202576Q
            if (r12 == 0) goto L_0x0042
            java.lang.Object r12 = r12.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r12 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r12
            android.view.View r2 = r12.f202595F
        L_0x0042:
            if (r2 == 0) goto L_0x0086
            r12 = 4
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.mo10233c(r12)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/profile/ui/ContactInfoUI"
            java.lang.String r6 = "hideDivider"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = 0
            java.lang.Object r12 = r0.mo10231a(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r2.setVisibility(r12)
            java.lang.String r4 = "com/tencent/mm/plugin/profile/ui/ContactInfoUI"
            java.lang.String r5 = "hideDivider"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI$$h.onPostOpen(boolean):void");
    }

    public void onPreClose() {
        NormalProfileHeaderPreference normalProfileHeaderPreference;
        C77453j L;
        C77451h hVar = this.f202553d.f202517C;
        if (hVar != null) {
            hVar.onPreClose();
            C47511g gVar = this.f202553d.f202529d;
            if (gVar != null && (normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal")) != null && (L = normalProfileHeaderPreference.mo96613L()) != null) {
                L.onPreClose();
            }
        }
    }

    public void onPreOpen() {
        NormalProfileHeaderPreference normalProfileHeaderPreference;
        C77453j L;
        C77451h hVar = this.f202553d.f202517C;
        if (hVar != null) {
            hVar.onPreOpen();
            C47511g gVar = this.f202553d.f202529d;
            if (gVar != null && (normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal")) != null && (L = normalProfileHeaderPreference.mo96613L()) != null) {
                L.onPreOpen();
            }
        }
    }

    /* renamed from: q */
    public void mo96603q(int i) {
    }

    /* renamed from: u */
    public void mo96604u(int i) {
    }
}
