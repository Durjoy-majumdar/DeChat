package y23;

import android.content.Intent;
import android.os.Bundle;
import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import eb0.C31543z5;
import gy3.C87412m;
import j23.C108531a;
import qh2.C101198e;
import z04.C112551y;

/* renamed from: y23.e */
public class C112386e extends C112388h<FinderShowInWXProfileStruct> {

    /* renamed from: e */
    public BasePluginLayout f336497e;

    /* renamed from: f */
    public String f336498f = "";

    /* renamed from: g */
    public boolean f336499g;

    /* renamed from: h */
    public boolean f336500h;

    public C112386e(BasePluginLayout basePluginLayout) {
        C87412m.m108594g(basePluginLayout, "pluginLayout");
        this.f336497e = basePluginLayout;
    }

    /* renamed from: a */
    public void mo14581a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        T finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
        this.f336503d = finderShowInWXProfileStruct;
        finderShowInWXProfileStruct.mo1037s("101");
    }

    /* renamed from: g */
    public String mo14584g() {
        return "21875";
    }

    /* renamed from: j */
    public final void mo164100j(boolean z) {
        T t = this.f336503d;
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = (FinderShowInWXProfileStruct) t;
        if (finderShowInWXProfileStruct != null) {
            finderShowInWXProfileStruct.f9902g = 1;
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (FinderShowInWXProfileStruct) t;
        if (finderShowInWXProfileStruct2 != null) {
            finderShowInWXProfileStruct2.mo1039u(String.valueOf(C31543z5.m39453c()));
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (FinderShowInWXProfileStruct) this.f336503d;
        if (finderShowInWXProfileStruct3 != null) {
            finderShowInWXProfileStruct3.mo1038t("like_fav_feed_music");
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (FinderShowInWXProfileStruct) this.f336503d;
        if (finderShowInWXProfileStruct4 != null) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("if_show_reddot", z ? 1 : 0);
            String gVar2 = gVar.put("editId", this.f336498f).toString();
            C87412m.m108593f(gVar2, "JSONObject()\n           …)\n            .toString()");
            finderShowInWXProfileStruct4.mo1042x(C112551y.m153814n(gVar2, ",", ";", false));
        }
        mo164102e();
    }

    /* renamed from: k */
    public final void mo164101k(boolean z) {
        T t = this.f336503d;
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = (FinderShowInWXProfileStruct) t;
        if (finderShowInWXProfileStruct != null) {
            finderShowInWXProfileStruct.f9902g = 0;
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (FinderShowInWXProfileStruct) t;
        if (finderShowInWXProfileStruct2 != null) {
            finderShowInWXProfileStruct2.mo1039u(String.valueOf(C31543z5.m39453c()));
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (FinderShowInWXProfileStruct) this.f336503d;
        if (finderShowInWXProfileStruct3 != null) {
            finderShowInWXProfileStruct3.mo1038t("like_fav_feed_music");
        }
        FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (FinderShowInWXProfileStruct) this.f336503d;
        if (finderShowInWXProfileStruct4 != null) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("if_show_reddot", z ? 1 : 0);
            String gVar2 = gVar.put("editId", this.f336498f).toString();
            C87412m.m108593f(gVar2, "JSONObject()\n           …)\n            .toString()");
            finderShowInWXProfileStruct4.mo1042x(C112551y.m153814n(gVar2, ",", ";", false));
        }
        mo164102e();
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        int i = 1;
        if (ordinal != 45) {
            if (ordinal == 47) {
                C108531a aVar = (C108531a) this.f336497e.mo151221j(C108531a.class);
                if (aVar != null && aVar.f324878j.mo151397o()) {
                    mo164100j(aVar.f324878j.f315553x0);
                    return;
                }
                return;
            } else if (ordinal == 66 || ordinal == 143) {
                if (bVar == C101198e.C101199b.EDIT_PREVIEW_MODE_CHANGE) {
                    this.f336499g = true;
                    this.f336500h = true;
                }
                C108531a aVar2 = (C108531a) this.f336497e.mo151221j(C108531a.class);
                if (aVar2 != null) {
                    if (aVar2.f324880o.getVisibility() != 0) {
                        i = 0;
                    }
                    if (this.f336499g) {
                        this.f336499g = false;
                        return;
                    }
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct != null) {
                        finderShowInWXProfileStruct.f9902g = 0;
                    }
                    if (finderShowInWXProfileStruct != null) {
                        finderShowInWXProfileStruct.mo1039u(String.valueOf(C31543z5.m39453c()));
                    }
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct2 != null) {
                        finderShowInWXProfileStruct2.mo1038t("music_use");
                    }
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct3 = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct3 != null) {
                        C104289g gVar = new C104289g();
                        gVar.mo145953n("tips", i);
                        String gVar2 = gVar.put("editId", this.f336498f).toString();
                        C87412m.m108593f(gVar2, "JSONObject()\n           …)\n            .toString()");
                        finderShowInWXProfileStruct3.mo1042x(C112551y.m153814n(gVar2, ",", ";", false));
                    }
                    mo164102e();
                    return;
                }
                return;
            } else if (!(ordinal == 89 || ordinal == 90)) {
                return;
            }
        }
        C108531a aVar3 = (C108531a) this.f336497e.mo151221j(C108531a.class);
        if (aVar3 != null) {
            if (bVar == C101198e.C101199b.EDIT_ADD_MUSIC) {
                boolean z = aVar3.f324888w;
                if (this.f336500h) {
                    this.f336500h = false;
                } else {
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct4 = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct4 != null) {
                        finderShowInWXProfileStruct4.f9902g = 1;
                    }
                    if (finderShowInWXProfileStruct4 != null) {
                        finderShowInWXProfileStruct4.mo1039u(String.valueOf(C31543z5.m39453c()));
                    }
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct5 = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct5 != null) {
                        finderShowInWXProfileStruct5.mo1038t("music_use");
                    }
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct6 = (FinderShowInWXProfileStruct) this.f336503d;
                    if (finderShowInWXProfileStruct6 != null) {
                        C104289g gVar3 = new C104289g();
                        gVar3.mo145953n("tips", z ? 1 : 0);
                        String gVar4 = gVar3.put("editId", this.f336498f).toString();
                        C87412m.m108593f(gVar4, "JSONObject()\n           …)\n            .toString()");
                        finderShowInWXProfileStruct6.mo1042x(C112551y.m153814n(gVar4, ",", ";", false));
                    }
                    mo164102e();
                }
            }
            if (C30517h0.m39112a()) {
                mo164101k(aVar3.f324878j.mo151396n());
            }
        }
    }
}
