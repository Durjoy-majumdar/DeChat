package oo1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import dp1.C7435f2;
import er1.C58684b;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C64586nn1;
import te3.C64788vx2;
import te3.C64858yi1;
import up1.C37521f;

/* renamed from: oo1.b0 */
public final class C11602b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C2479n0.C2480a f34008d;

    /* renamed from: e */
    public final /* synthetic */ C11697z f34009e;

    public C11602b0(C2479n0.C2480a aVar, C11697z zVar) {
        this.f34008d = aVar;
        this.f34009e = zVar;
    }

    public final void onClick(View view) {
        C55718s0 s0Var;
        C64858yi1 yi12;
        C89349b bVar;
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C2479n0.C2480a aVar = this.f34008d;
        if (!(aVar == null || (s0Var = aVar.f12910c) == null || (yi12 = s0Var.f158585F) == null || (bVar = yi12.f186557r) == null)) {
            C11697z zVar = this.f34009e;
            C64788vx2 vx22 = new C64788vx2();
            vx22.parseFrom(bVar.mo123703f());
            String str = vx22.f186009d;
            String str2 = vx22.f186010e;
            if (!(str == null || str2 == null)) {
                AppCompatActivity appCompatActivity = zVar.f34257a;
                int i = vx22.f186011f;
                C37521f.f99374d.getClass();
                ((C58684b) C86312j.m106911c(C58684b.class)).vy0(appCompatActivity, str, str2, i, "", (Boolean) C37521f.f99232M4.mo60266n());
            }
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vy0(5, 2, "");
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderProfileBanner");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderProfileBanner");
            if (!(G5 == null || R5 == null)) {
                C58413v0.m67781i(C58413v0.f167346a, "3", G5, R5, 2, zVar.f34258b, 0, (String) null, 0, 0, 480, (Object) null);
            }
            zVar.getClass();
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(zVar.f34257a);
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "red_packet_make", 1, (JSONObject) null);
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("FinderMyTab");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
