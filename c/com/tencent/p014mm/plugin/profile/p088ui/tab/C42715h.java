package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45829j;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.h */
public class C42715h implements AppBarLayout.C67445c {

    /* renamed from: a */
    public final /* synthetic */ ContactWidgetTabBizHeaderController f115684a;

    public C42715h(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
        this.f115684a = contactWidgetTabBizHeaderController;
    }

    /* renamed from: a */
    public void mo3128a(AppBarLayout appBarLayout, int i) {
        ContactWidgetTabBizHeaderController.C42686g gVar;
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        int abs = Math.abs(i);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115684a;
        if (contactWidgetTabBizHeaderController.f115559j != null) {
            ContactWidgetTabBizHeaderController.m46369a(contactWidgetTabBizHeaderController);
            C42734m mVar = this.f115684a.f115564r;
            mVar.getClass();
            Rect rect = new Rect();
            View view = mVar.f115726a;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            mVar.mo66889f().getDrawingRect(rect);
            ((ViewGroup) view).offsetDescendantRectToMyCoords(mVar.mo66889f(), rect);
            boolean z = false;
            String str = "";
            if (rect.bottom < C75044y4.m89989a(mVar.f115730e)) {
                ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController2 = this.f115684a;
                ContactWidgetTabBizHeaderController.C42686g gVar2 = contactWidgetTabBizHeaderController2.f115545H;
                if (gVar2 != null && gVar2.mo66839c()) {
                    contactWidgetTabBizHeaderController2.f115556g.getController().mo177102w0(8);
                    if (contactWidgetTabBizHeaderController2.f115547J == null) {
                        contactWidgetTabBizHeaderController2.f115547J = contactWidgetTabBizHeaderController2.f115556g.getLayoutInflater().inflate(C0966R.C0971layout.co_, (ViewGroup) null);
                        View j = contactWidgetTabBizHeaderController2.f115556g.getController().f348065F.mo91099j();
                        if (j instanceof LinearLayout) {
                            ((LinearLayout) j).addView(contactWidgetTabBizHeaderController2.f115547J);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) contactWidgetTabBizHeaderController2.f115547J.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.weight = 1.0f;
                            layoutParams.gravity = 17;
                            contactWidgetTabBizHeaderController2.f115547J.setLayoutParams(layoutParams);
                        } else if (j instanceof RelativeLayout) {
                            ((RelativeLayout) j).addView(contactWidgetTabBizHeaderController2.f115547J);
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) contactWidgetTabBizHeaderController2.f115547J.getLayoutParams();
                            layoutParams2.width = -2;
                            layoutParams2.addRule(13);
                            contactWidgetTabBizHeaderController2.f115547J.setLayoutParams(layoutParams2);
                        }
                        ImageView imageView = (ImageView) contactWidgetTabBizHeaderController2.f115547J.findViewById(C0966R.C0970id.mbu);
                        TextView textView = (TextView) contactWidgetTabBizHeaderController2.f115547J.findViewById(C0966R.C0970id.mbv);
                        boolean z2 = System.currentTimeMillis() - ContactWidgetTabBizHeaderController.f115537Q < 2000;
                        C72996z1 z1Var = contactWidgetTabBizHeaderController2.f115559j;
                        boolean z3 = contactWidgetTabBizHeaderController2.f115553d;
                        if (!z3) {
                            str = contactWidgetTabBizHeaderController2.f115560n;
                        }
                        C45829j.m51128a(imageView, z1Var, str, !z3 && z2);
                        textView.setText(Util.nullAsNil(contactWidgetTabBizHeaderController2.f115559j.getNickname()));
                        C7007c1.m7256a(contactWidgetTabBizHeaderController2.f115547J);
                    }
                    View view2 = contactWidgetTabBizHeaderController2.f115547J;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateActionBarInHalfScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateActionBarInHalfScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    contactWidgetTabBizHeaderController2.f115547J.setOnClickListener(new C42720k(contactWidgetTabBizHeaderController2));
                } else if (!Util.isNullOrNil(((C45696d) C86709a0.m107533q(C45696d.class)).mo71011q4(contactWidgetTabBizHeaderController2.f115563q))) {
                    contactWidgetTabBizHeaderController2.mo66831i(str);
                } else {
                    contactWidgetTabBizHeaderController2.mo66831i(contactWidgetTabBizHeaderController2.f115559j.getNickname());
                }
            } else {
                ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController3 = this.f115684a;
                contactWidgetTabBizHeaderController3.f115556g.getController().mo177102w0(0);
                View view4 = contactWidgetTabBizHeaderController3.f115547J;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateTitleFollowViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateTitleFollowViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (contactWidgetTabBizHeaderController3.mo66828f()) {
                    contactWidgetTabBizHeaderController3.mo66831i(str);
                } else {
                    contactWidgetTabBizHeaderController3.mo66831i(str);
                }
            }
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController4 = this.f115684a;
            C42734m mVar2 = contactWidgetTabBizHeaderController4.f115564r;
            mVar2.getClass();
            Rect rect2 = new Rect();
            View view6 = mVar2.f115726a;
            C87412m.m108592e(view6, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view6;
            View c = mVar2.mo66886c().getVisibility() == 0 ? mVar2.mo66886c() : null;
            if (mVar2.mo66892i().getVisibility() == 0) {
                c = mVar2.mo66892i();
            }
            C87412m.m108591d(c);
            c.getDrawingRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(c, rect2);
            if (rect2.bottom < C75044y4.m89989a(mVar2.f115730e)) {
                z = true;
            }
            boolean z4 = true ^ z;
            ContactWidgetTabBizHeaderController.C42686g gVar3 = contactWidgetTabBizHeaderController4.f115545H;
            if (gVar3 != null) {
                gVar3.mo66838b(z4);
            }
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController5 = this.f115684a;
            int i2 = contactWidgetTabBizHeaderController5.f115549L;
            if (i2 >= totalScrollRange && abs < i2 && (gVar = contactWidgetTabBizHeaderController5.f115545H) != null) {
                gVar.mo66837a();
            }
            this.f115684a.f115549L = abs;
        }
    }
}
