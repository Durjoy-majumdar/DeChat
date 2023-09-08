package un3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75589l0;
import gy3.C8479f0;
import java.util.List;
import pg3.C47504d;
import pg3.C77084b;
import sx3.C26236u;
import tm3.C78065p;

/* renamed from: un3.e */
public final class C78240e extends C47504d {

    /* renamed from: l */
    public final /* synthetic */ C8479f0<C72940a> f229205l;

    /* renamed from: m */
    public final /* synthetic */ C78244i f229206m;

    public C78240e(C8479f0<C72940a> f0Var, C78244i iVar) {
        this.f229205l = f0Var;
        this.f229206m = iVar;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        UIStateCenter stateCenter;
        List<String> list;
        C47504d dVar = (C47504d) bVar;
        boolean z = ((C72940a) this.f229205l.f27484d).f212612a;
        C78244i iVar = this.f229206m;
        iVar.f229212d = false;
        if (!C74785j2.C6981a.m7247a(iVar.getActivity(), i, i2, str, 4)) {
            if (i == 0 && i2 == 0 && !Util.isNullOrNil(this.f127466h)) {
                List<String> list2 = null;
                if (z) {
                    C75589l0.m90737c(this.f127466h, dVar != null ? dVar.f127459a : null, this.f229206m.getActivity().getString(C0966R.string.b66), false, "");
                }
                if (!(dVar == null || (list = dVar.f127463e) == null)) {
                    if (!list.isEmpty()) {
                        list2 = list;
                    }
                    if (list2 != null) {
                        C78244i iVar2 = this.f229206m;
                        String str2 = "weixin://findfriend/verifycontact/" + this.f127466h + XVFSFile.SEPARATOR_CHAR;
                        if (z) {
                            C75589l0.m90737c(this.f127466h, list2, iVar2.getString(C0966R.string.b67), true, str2);
                        }
                    }
                }
                BaseMvvmActivity d3 = this.f229206m.mo14598d3();
                if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
                    stateCenter.dispatch(new C78065p(C26236u.m33719b(this.f127466h), -1));
                    return;
                }
                return;
            }
            C78244i.m94528g3(this.f229206m, i, i2, dVar, str == null ? "" : str, z);
        }
    }
}
