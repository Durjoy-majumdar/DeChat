package dr1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import p256vw.C53002g;

/* renamed from: dr1.h */
public final class C7482h implements C53002g {

    /* renamed from: a */
    public final /* synthetic */ C7483i f25699a;

    public C7482h(C7483i iVar) {
        this.f25699a = iVar;
    }

    /* renamed from: a */
    public String mo8618a() {
        String string = this.f25699a.f25700a.getResources().getString(C0966R.string.f8014z_);
        C87412m.m108593f(string, "activity.resources.getSt…mmui.R.string.app_finish)");
        return string;
    }

    /* renamed from: b */
    public View mo8619b() {
        C7483i iVar = this.f25699a;
        iVar.f25707h = C85868k2.m106137b(iVar.f25700a).inflate(C0966R.C0971layout.cl_, (ViewGroup) null, false);
        C7483i.m7616c(this.f25699a);
        return this.f25699a.f25707h;
    }

    public String getTitle() {
        String string = this.f25699a.f25700a.getResources().getString(C0966R.string.nb6);
        C87412m.m108593f(string, "activity.resources.getSt…finder_post_goods_modify)");
        return string;
    }
}
