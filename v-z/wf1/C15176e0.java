package wf1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61937h;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C48769aw;
import te3.C50767p11;
import te3.C50852pn2;
import te3.C52291zp0;
import wf1.C15193l;

/* renamed from: wf1.e0 */
public final class C15176e0 extends C87413o implements C32226l<C89132b.C89134c<C52291zp0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41328d;

    /* renamed from: e */
    public final /* synthetic */ String f41329e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15176e0(C15193l lVar, String str) {
        super(1);
        this.f41328d = lVar;
        this.f41329e = str;
    }

    public Object invoke(Object obj) {
        String str;
        C50852pn2 pn22;
        C50852pn2 pn23;
        boolean z;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        View view = (View) ((C36570n) this.f41328d.f41393s).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str2 = this.f41328d.f41381d;
        StringBuilder sb = new StringBuilder();
        sb.append("FinderGetUpLevelProductRequest, errType=");
        String str3 = null;
        sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
        sb.append(", errCode=");
        sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
        Log.m105924i(str2, sb.toString());
        if (cVar != null && cVar.f256793a == 0 && cVar.f256794b == 0) {
            View view2 = (View) ((C36570n) this.f41328d.f41396v).getValue();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f41328d.mo14132i3().setVisibility(0);
            ((TextView) ((C36570n) this.f41328d.f41386i).getValue()).setEnabled(true);
            C52291zp0 zp02 = (C52291zp0) cVar.f256796d;
            if (zp02 == null) {
                return null;
            }
            C15193l lVar = this.f41328d;
            lVar.mo14134k3(true);
            View view4 = (View) ((C36570n) lVar.f41394t).getValue();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i(lVar.f41381d, "FinderGetUpLevelProductRequest, resp=" + C61937h.m72709h(zp02));
            LinkedList<C48769aw> linkedList = zp02.f146166e;
            C87412m.m108593f(linkedList, "tempResp.item_list");
            lVar.f41371D = linkedList;
            LinkedList<C50767p11> linkedList2 = zp02.f146165d;
            C87412m.m108593f(linkedList2, "tempResp.product_meta_list");
            for (C50767p11 p112 : linkedList2) {
                String str4 = p112.f139507d;
                if (str4 != null) {
                    lVar.f41372E.put(str4, p112);
                }
            }
            lVar.f41373F = zp02.f146167f;
            long j = 0;
            LinkedList<C48769aw> linkedList3 = lVar.f41371D;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList3) {
                if (((C48769aw) next).f130787e > 0) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                C48769aw awVar = (C48769aw) it.next();
                LinkedHashMap<String, C50767p11> linkedHashMap = lVar.f41372E;
                String str5 = awVar.f130786d;
                if (str5 != null) {
                    str = str5;
                }
                C50767p11 p113 = linkedHashMap.get(str);
                if (p113 != null) {
                    Log.m105924i(lVar.f41381d, "pkg_gift = " + p113.f139515o + ", price = " + p113.f139516p + ", count =" + awVar.f130787e);
                }
                j += (long) (((float) awVar.f130787e) * (p113 != null ? p113.f139516p : 0.0f));
            }
            ((TextView) ((C36570n) lVar.f41385h).getValue()).setText(String.valueOf(j));
            lVar.f41375H = j;
            LinkedList<C50852pn2> linkedList4 = zp02.f146168g;
            C87412m.m108593f(linkedList4, "tempResp.level_config_list");
            lVar.f41376I = linkedList4;
            StringBuilder sb4 = new StringBuilder(str);
            for (C50852pn2 pn24 : lVar.f41376I) {
                sb4.append("level(" + pn24.f139839d + ")-coin(" + pn24.f139840e + ")\n");
            }
            Log.m105924i(lVar.f41381d, "[levelConfigList] " + sb4);
            lVar.f41377J = zp02.f146169h;
            lVar.f41378K = zp02.f146170i;
            long j2 = lVar.f41373F + j;
            Log.m105924i(lVar.f41381d, "targetConsumedCoin = " + j2 + ", giftTotalCoin = " + j + ", consumedCoin = " + lVar.f41373F);
            if (j2 <= ((C50852pn2) C110818d0.m150914L(lVar.f41376I)).f139840e) {
                pn22 = (C50852pn2) C110818d0.m150914L(lVar.f41376I);
            } else {
                LinkedList<C50852pn2> linkedList5 = lVar.f41376I;
                ListIterator<C50852pn2> listIterator = linkedList5.listIterator(linkedList5.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        pn23 = null;
                        break;
                    }
                    pn23 = listIterator.previous();
                    if (j2 > pn23.f139840e) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                pn22 = pn23;
                if (pn22 == null) {
                    pn22 = (C50852pn2) C110818d0.m150923U(lVar.f41376I);
                }
            }
            Log.m105924i(lVar.f41381d, "mTargetLevel = " + lVar.f41379L + ", svr told level = " + pn22.f139839d);
            int i = lVar.f41379L;
            int i2 = pn22.f139839d;
            if (i < i2) {
                lVar.f41379L = i2;
                lVar.mo14135l3((Integer) null);
            }
            ((C15193l.C15195b) ((C36570n) lVar.f41369B).getValue()).mo14136F4();
            return C13598b0.f38549a;
        }
        if (cVar != null) {
            str3 = cVar.f256795c;
        }
        if (str3 == null) {
            str3 = this.f41328d.getActivity().getString(C0966R.string.n8y);
            C87412m.m108593f(str3, "activity.getString(R.str…_gift_pkg_refresh_failed)");
        }
        C76912y0.m92773l(this.f41328d.getActivity(), str3);
        if (C87412m.m108589b(this.f41329e, "initView")) {
            this.f41328d.getActivity().finish();
        }
        return C13598b0.f38549a;
    }
}
