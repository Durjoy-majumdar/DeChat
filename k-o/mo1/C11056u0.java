package mo1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSettingInfoUI;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C86312j;
import dp1.C58413v0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p823sg.C101614i;
import rs1.C13442s8;
import te3.C64586nn1;

/* renamed from: mo1.u0 */
public final class C11056u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32815d;

    public C11056u0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32815d = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f32815d.getActivity(), this.f32815d.getIntent(), 0, (String) null, 0, 0, false, 0, 128, (Object) null);
        AppCompatActivity activity = this.f32815d.getActivity();
        Intent intent = this.f32815d.getIntent();
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(activity, FinderSettingInfoUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(10010);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderSettingInfoUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderSetting");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderSetting");
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32815d;
        if (!(G5 == null || R5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
            C58413v0.m67781i(v0Var, "3", G5, R5, 2, finderProfileHeaderUIC.getContextObj(), 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderSetting");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77272l("ProfileEntrance", new int[]{1000});
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
