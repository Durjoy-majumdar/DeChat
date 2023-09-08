package le1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import do1.C58341h;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C9342n1;
import o40.C11348f;
import o40.C61926c;
import org.json.JSONObject;
import te3.C48878bm1;
import te3.C48883bn1;
import te3.C49842ig0;
import te3.C64355f00;
import te3.C64586nn1;
import te3.C64702s7;
import te3.C64858yi1;

/* renamed from: le1.b */
public final class C10489b implements C10497i {

    /* renamed from: le1.b$a */
    public static final class C10490a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ String f31728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10490a(String str) {
            super(0);
            this.f31728d = str;
        }

        public Object invoke() {
            return this.f31728d;
        }
    }

    /* renamed from: a */
    public boolean mo10786a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* renamed from: b */
    public boolean mo10787b(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* renamed from: c */
    public boolean mo10788c(C9342n1.C9346d dVar, int i, int i2) {
        C58341h.C58342a aVar;
        C9342n1.C9346d dVar2;
        C64858yi1 yi12;
        C64858yi1 yi13;
        C64702s7 s7Var;
        C64355f00 f002;
        C9342n1.C9346d dVar3 = dVar;
        int i3 = i;
        int i4 = i2;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(dVar3, "resp");
        if (i3 == 4 && i4 == 0) {
            C55718s0 s0Var = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158542s;
            Long l = null;
            C64586nn1 o2 = s0Var != null ? s0Var.mo77308o2("FinderEntrance") : null;
            C39622i0 a = C39818r.f106831a.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…bPreloadCore::class.java)");
            FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) a;
            StringBuilder sb = new StringBuilder();
            sb.append("[onIntercept] tipsId=");
            sb.append(s0Var != null ? s0Var.field_tipsId : null);
            sb.append(" title=[");
            sb.append(o2 != null ? o2.f184504f : null);
            sb.append('-');
            sb.append((o2 == null || (s7Var = o2.f184519x) == null || (f002 = s7Var.f185355d) == null) ? null : f002.f183065d);
            sb.append("] sync_show_info is null? ");
            sb.append(((s0Var == null || (yi13 = s0Var.f158585F) == null) ? null : yi13.f186542D) == null);
            sb.append(", respShowInfo is null? ");
            sb.append(dVar3.f146066D != null);
            Log.m105924i("Finder.TipBubbleInterceptor", sb.toString());
            if (((s0Var == null || (yi12 = s0Var.f158585F) == null) ? null : yi12.f186542D) != null) {
                C48883bn1 bn12 = s0Var.f158585F.f186542D;
                C87412m.m108591d(bn12);
                C48878bm1 bm12 = new C48878bm1();
                bm12.f131199d = bn12.f131214d;
                bm12.f131200e = bn12.f131215e;
                bm12.f131202g = bn12.f131217g;
                bm12.f131203h = bn12.f131218h;
                dVar3.f146066D = bm12;
                if (Log.getLogLevel() <= 1) {
                    JSONObject json = bn12.toJSON();
                    if (json.toString().length() > 4000) {
                        String jSONObject = json.toString();
                        C87412m.m108593f(jSONObject, "json.toString()");
                        String substring = jSONObject.substring(0, 4000);
                        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        Log.m105919d("Finder.TipBubbleInterceptor", "[onIntercept#1] %s", substring);
                        String jSONObject2 = json.toString();
                        C87412m.m108593f(jSONObject2, "json.toString()");
                        String substring2 = jSONObject2.substring(4000);
                        C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
                        Log.m105919d("Finder.TipBubbleInterceptor", "[onIntercept#2] %s", substring2);
                    } else {
                        Log.m105919d("Finder.TipBubbleInterceptor", "[onIntercept] %s", json);
                    }
                }
                C58341h f3 = finderStreamTabPreloadCore.mo78457f3(4);
                if (!(f3 == null || (aVar = f3.f167040p) == null || (dVar2 = aVar.f167044b) == null)) {
                    LinkedList<FinderObject> linkedList = dVar2.f146069d;
                    C87412m.m108593f(linkedList, "it.`object`");
                    Iterator<FinderObject> it = linkedList.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (it.next().f164794id == dVar.mo10088b().f145380r) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 >= 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("requestId=");
                        C49842ig0 ig02 = dVar.mo10088b().f145372g;
                        if (ig02 != null) {
                            l = Long.valueOf(ig02.f135317i);
                        }
                        sb4.append(l);
                        sb4.append(" index=");
                        sb4.append(i5);
                        sb4.append(" feedId=");
                        sb4.append(C61926c.m72691p(dVar.mo10088b().f145380r));
                        String sb5 = sb4.toString();
                        Log.m105920e("Finder.TipBubbleInterceptor", "热门预拉取存在一条跟朋友气泡红点一样的feed. " + sb5);
                        C11348f.C11349a.m11178b(C59319a.f169618b, "", false, (C11348f.C11352b) null, false, false, new C10490a(sb5), 28, (Object) null);
                    }
                }
            } else {
                dVar3.f146066D = null;
            }
        } else if (i3 == 4) {
            Log.m105928w("Finder.TipBubbleInterceptor", " pullType(" + i4 + ") invalid.");
        }
        return false;
    }
}
