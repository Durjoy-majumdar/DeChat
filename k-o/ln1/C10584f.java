package ln1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import java.util.HashMap;
import p565ir.C60606n;

/* renamed from: ln1.f */
public final class C10584f extends UIComponent {

    /* renamed from: d */
    public int f31922d = -1;

    /* renamed from: e */
    public int f31923e = -1;

    /* renamed from: f */
    public int f31924f = -1;

    /* renamed from: g */
    public final HashMap<String, Integer> f31925g = new HashMap<>();

    /* renamed from: h */
    public String f31926h;

    /* renamed from: i */
    public String f31927i = "";

    /* renamed from: j */
    public long f31928j;

    /* renamed from: n */
    public boolean f31929n = true;

    /* renamed from: o */
    public long f31930o;

    /* renamed from: p */
    public String f31931p = "";

    /* renamed from: q */
    public long f31932q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10584f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo10841c3(String str, String str2, String str3, String str4) {
        FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new FinderBroadcastEidExposeStruct();
        finderBroadcastEidExposeStruct.f9740d = Util.nowMilliSecond();
        finderBroadcastEidExposeStruct.f9741e = finderBroadcastEidExposeStruct.mo86045b("finderusername", "", true);
        if (str == null) {
            str = "";
        }
        finderBroadcastEidExposeStruct.f9742f = finderBroadcastEidExposeStruct.mo86045b("chnl_extra", str, true);
        finderBroadcastEidExposeStruct.f9743g = finderBroadcastEidExposeStruct.mo86045b("tab_id", "", true);
        finderBroadcastEidExposeStruct.f9744h = finderBroadcastEidExposeStruct.mo86045b("sub_tab_id", "", true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidExposeStruct.f9745i = finderBroadcastEidExposeStruct.mo86045b("sessionid", Wb, true);
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidExposeStruct.f9746j = finderBroadcastEidExposeStruct.mo86045b("contextid", str2, true);
        String str5 = this.f31926h;
        if (str5 == null) {
            str5 = "";
        }
        finderBroadcastEidExposeStruct.f9747k = finderBroadcastEidExposeStruct.mo86045b("commentscene", str5, true);
        finderBroadcastEidExposeStruct.f9749m = finderBroadcastEidExposeStruct.mo86045b("SubTabContextID", "", true);
        finderBroadcastEidExposeStruct.f9750n = finderBroadcastEidExposeStruct.mo86045b("pg_udf_kv", "", true);
        finderBroadcastEidExposeStruct.f9751o = finderBroadcastEidExposeStruct.mo86045b("ref_commentscene", "", true);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.f9752p = finderBroadcastEidExposeStruct.mo86045b("eid", str3, true);
        if (str4 == null) {
            str4 = "";
        }
        finderBroadcastEidExposeStruct.f9753q = finderBroadcastEidExposeStruct.mo86045b("eld_udf_kv", str4, true);
        finderBroadcastEidExposeStruct.f9754r = finderBroadcastEidExposeStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
        finderBroadcastEidExposeStruct.mo86054n();
    }

    /* renamed from: d3 */
    public final void mo10842d3(String str, String str2, String str3) {
        FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
        finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
        finderBroadcastEidClickStruct.mo1017x("");
        finderBroadcastEidClickStruct.mo1012s("");
        finderBroadcastEidClickStruct.mo1011E("");
        finderBroadcastEidClickStruct.mo1008B("");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidClickStruct.mo1019z(Wb);
        if (str == null) {
            str = "";
        }
        finderBroadcastEidClickStruct.mo1014u(str);
        String str4 = this.f31926h;
        if (str4 == null) {
            str4 = "";
        }
        finderBroadcastEidClickStruct.mo1013t(str4);
        finderBroadcastEidClickStruct.mo1010D("");
        finderBroadcastEidClickStruct.mo1007A("");
        finderBroadcastEidClickStruct.mo1018y("");
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidClickStruct.mo1015v(str2);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidClickStruct.mo1016w(str3);
        finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
        finderBroadcastEidClickStruct.mo86054n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10584f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
