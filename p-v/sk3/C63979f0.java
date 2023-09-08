package sk3;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C97625j3;
import gy3.C87412m;
import kg3.C76577a;
import kv1.C99254i;
import nk3.C61801g;
import nk3.C61802h;
import nk3.C61805j;
import nk3.C61806k;
import ok3.C62070e;
import ok3.C62071f;
import rk3.C63462a;

/* renamed from: sk3.f0 */
public final class C63979f0 extends C63994l0 implements C61806k, C61805j {

    /* renamed from: r */
    public C61802h f181385r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63979f0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: j3 */
    public static final String m75293j3(C63979f0 f0Var, Context context, C72963f4 f4Var, C68070l.C68072b bVar, boolean z, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        f0Var.getClass();
        if (bVar == null || f4Var == null || context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            String string = context.getResources().getString(C0966R.string.b8p);
                            C87412m.m108593f(string, "context.resources.getStr…appmsg_remittance_cancel)");
                            return string;
                        } else if (i != 7) {
                            String str6 = bVar.f195574g;
                            C87412m.m108593f(str6, "content.description");
                            return str6;
                        }
                    } else if (f0Var.mo88753l3()) {
                        String string2 = f0Var.getActivity().getString(C0966R.string.b8w);
                        C87412m.m108593f(string2, "{\n                    ac…s_text)\n                }");
                        return string2;
                    } else {
                        if (!z) {
                            str5 = f0Var.getActivity().getString(C0966R.string.b8v);
                        } else if (Util.isNullOrNil(bVar.f195532T1)) {
                            str5 = f0Var.getActivity().getString(C0966R.string.b8u);
                        } else {
                            str5 = f0Var.getActivity().getString(C0966R.string.b8u) + '-' + bVar.f195532T1;
                        }
                        C87412m.m108593f(str5, "{\n                    if…      }\n                }");
                        return str5;
                    }
                } else if (f0Var.mo88753l3()) {
                    String string3 = f0Var.getActivity().getString(C0966R.string.b9c);
                    C87412m.m108593f(string3, "{\n                activi…_tips_text)\n            }");
                    return string3;
                } else {
                    if (!z) {
                        str4 = f0Var.getActivity().getString(C0966R.string.b9d);
                    } else if (Util.isNullOrNil(bVar.f195532T1)) {
                        str4 = f0Var.getActivity().getString(C0966R.string.b9e);
                    } else {
                        str4 = f0Var.getActivity().getString(C0966R.string.b9e) + '-' + bVar.f195532T1;
                    }
                    C87412m.m108593f(str4, "{\n                if (is…          }\n            }");
                    return str4;
                }
            } else if (f0Var.mo88753l3()) {
                String string4 = f0Var.getActivity().getString(C0966R.string.b8l);
                C87412m.m108593f(string4, "{\n                activi…_tips_text)\n            }");
                return string4;
            } else {
                if (!z) {
                    str3 = f0Var.getActivity().getString(C0966R.string.b8o);
                } else if (Util.isNullOrNil(bVar.f195532T1)) {
                    str3 = MMApplicationContext.getContext().getString(C0966R.string.b8n);
                } else {
                    str3 = MMApplicationContext.getContext().getString(C0966R.string.b8n) + '-' + bVar.f195532T1;
                }
                C87412m.m108593f(str3, "{\n                if (is…          }\n            }");
                return str3;
            }
        }
        C72996z1 H3 = C97625j3.m125812b().mo105907v().mo69656H3(f4Var.mo108768t());
        if (H3 != null) {
            str = H3.mo62898f();
            C87412m.m108593f(str, "{\n                    rC…yRemark\n                }");
        } else {
            str = f4Var.mo108768t();
            C87412m.m108593f(str, "{\n                    ms….talker\n                }");
        }
        if (f0Var.mo88753l3()) {
            String string5 = f0Var.getActivity().getString(C0966R.string.b96);
            C87412m.m108593f(string5, "{\n                    ac…s_text)\n                }");
            return string5;
        }
        if (!z) {
            str2 = f0Var.getActivity().getString(C0966R.string.b8o);
        } else if (!Util.isNullOrNil(bVar.f195532T1)) {
            str2 = bVar.f195532T1;
        } else if (f4Var.mo108769t2() != 1) {
            str2 = f0Var.getActivity().getString(C0966R.string.b9a);
        } else {
            str2 = f0Var.getActivity().getString(C0966R.string.b99, new Object[]{str});
        }
        C87412m.m108593f(str2, "{\n                    if…      }\n                }");
        return str2;
    }

    /* renamed from: k3 */
    public static final int m75294k3(C63979f0 f0Var, Context context, C72963f4 f4Var, C68070l.C68072b bVar, boolean z, int i) {
        f0Var.getClass();
        if (bVar == null || f4Var == null || context == null || i == 1) {
            return C0966R.raw.c2c_remittance_icon;
        }
        if (i != 3) {
            if (i == 4) {
                return C0966R.raw.c2c_remittance_rejected_icon;
            }
            if (i != 5) {
                return i != 6 ? C0966R.raw.c2c_remittance_icon : C0966R.raw.c2c_remittance_cancle_icon;
            }
        }
        return C0966R.raw.c2c_remittance_received_icon;
    }

    /* renamed from: M0 */
    public void mo86728M0(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        mo88760i3();
        C63462a.m74799d(C63462a.f180011a, 5, 0, 0, 6, (Object) null);
        mo88758f3(this.f181423o, eVar.f176459d);
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
    }

    /* renamed from: V0 */
    public void mo86730V0(C61801g gVar, int i, int i2) {
        C87412m.m108594g(gVar, "holder");
        C63999m0 m0Var = (C63999m0) gVar;
        C62071f fVar = (C62071f) getItem(i);
        if (Util.isNullOrNil(fVar.f176465j)) {
            m0Var.f181442G.setVisibility(8);
        } else {
            m0Var.f181442G.setVisibility(0);
            m0Var.f181442G.setText(Util.nullAs(fVar.f176465j, ""));
        }
        int b = C76577a.m92151b(getActivity(), 6);
        m0Var.f181441F.setPadding(b, b, b, b);
        m0Var.f181441F.setImageResource(fVar.f176464i);
        m0Var.f181441F.setBackgroundColor(fVar.f176466k);
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        String str = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        Log.m105924i("MicroMsg.FTSMultiItemPayUIC", "getEmptyResultString >> " + str);
        return C99254i.m129316m(getString(C0966R.string.mhl), getString(C0966R.string.mhk), str);
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        if (this.f181385r == null) {
            this.f181385r = new C61802h(getActivity(), this, this);
        }
        C61802h hVar = this.f181385r;
        C87412m.m108591d(hVar);
        return hVar;
    }

    public int getCount() {
        return this.f181421j.size();
    }

    public C62070e getItem(int i) {
        C62070e eVar = this.f181421j.get(i);
        C87412m.m108593f(eVar, "normalDataList[position]");
        return eVar;
    }

    /* renamed from: l3 */
    public final boolean mo88753l3() {
        return C72996z1.m85820U5(this.f181423o) || C72996z1.m85847r5(this.f181423o);
    }

    /* renamed from: m3 */
    public boolean mo88754m3(int i) {
        return Util.safeParseInt("1001") == i || Util.safeParseInt("1002") == i || Util.safeParseInt("1005") == i || 419430449 == i;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo86733o(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvv, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C63999m0(inflate);
    }
}
