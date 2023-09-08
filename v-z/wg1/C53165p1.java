package wg1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di0.C86299o;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import kr0.C76630x0;
import ks3.C46736h;
import pe3.C89349b;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C51292ss1;
import te3.C51439ts1;
import te3.C51591us1;
import te3.C51733vs1;
import te3.C51870ws1;
import wi0.C90973a0;
import wi0.C91003z;

/* renamed from: wg1.p1 */
public final class C53165p1 implements C53161l1 {

    /* renamed from: d */
    public final View f148340d;

    /* renamed from: e */
    public final Context f148341e;

    /* renamed from: f */
    public final C58124b f148342f;

    /* renamed from: g */
    public final C62660c f148343g;

    /* renamed from: h */
    public C53162m1 f148344h;

    /* renamed from: i */
    public C51292ss1 f148345i;

    /* renamed from: j */
    public boolean f148346j;

    /* renamed from: n */
    public boolean f148347n;

    public C53165p1(View view, Context context, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(view, "viewRoot");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "plugin");
        this.f148340d = view;
        this.f148341e = context;
        this.f148342f = bVar2;
        this.f148343g = cVar;
    }

    /* renamed from: e */
    public final boolean mo73857e() {
        C51439ts1 ts12;
        C51870ws1 ws12;
        C51292ss1 ss12 = this.f148345i;
        if (!(ss12 == null || (ts12 = ss12.f141719g) == null)) {
            int i = ts12.f142382d;
            int i2 = C46736h.f125816a;
            if (!(i == 1)) {
                ts12 = null;
            }
            if (!(ts12 == null || (ws12 = ts12.f142383e) == null)) {
                String str = ws12.f144243d;
                if (str == null || str.length() == 0) {
                    Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#preloadMiniApp appid is null, preload return");
                } else {
                    Context context = this.f148341e;
                    String str2 = ws12.f144243d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = ws12.f144244e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int i3 = ws12.f144245f;
                    C89349b bVar = ws12.f144246g;
                    C87412m.m108594g(context, "context");
                    Log.m105924i("GameWelfareTaskMiniAppHelper", "#preRenderMiniApp appId=" + str2 + " path=" + str3 + " version=" + i3 + " extraData=" + bVar);
                    C86299o oVar = new C86299o();
                    oVar.f250930b = str2;
                    oVar.f250934f = str3;
                    oVar.f250931c = i3;
                    oVar.f250937i = new C53159h4(bVar);
                    oVar.f250913B = C90973a0.TRANSPARENT;
                    C91003z zVar = C91003z.DISABLED;
                    oVar.f250923L = zVar;
                    oVar.f250924M = zVar;
                    oVar.f250925N = true;
                    oVar.f250935g = true;
                    oVar.f250939k = 1205;
                    oVar.f250914C = "";
                    oVar.f250915D = true;
                    oVar.f250944p = new C15310i4((C32226l<? super Boolean, C13598b0>) null);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).y20(oVar, new C15314j4());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public void mo73858n(C51292ss1 ss12, boolean z) {
        Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#updateBubbleInfo");
        LinkedList<C51733vs1> linkedList = null;
        if (ss12 == null) {
            this.f148345i = null;
            C53162m1 m1Var = this.f148344h;
            if (m1Var != null) {
                m1Var.mo73853F();
            }
            Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#updateBubbleInfo data is null, return");
            return;
        }
        C51292ss1 ss13 = this.f148345i;
        if ((ss13 != null ? ss13.f141718f : 0) > ss12.f141718f) {
            Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#updateBubbleInfo out of queue, return");
            return;
        }
        this.f148345i = ss12;
        if (ss12.f141716d != 1) {
            C53162m1 m1Var2 = this.f148344h;
            if (m1Var2 != null) {
                m1Var2.mo73853F();
            }
            Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#updateBubbleInfo welfare_type not LUCK_BAG, return");
            return;
        }
        int i = ss12.f141717e;
        if (i == 0) {
            C53162m1 m1Var3 = this.f148344h;
            if (m1Var3 != null) {
                m1Var3.mo73853F();
            }
            Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#updateBubbleInfo welfare_status is HIDE, return");
            return;
        }
        boolean z2 = false;
        if ((i == 1 || i == 2) || i == 3) {
            z2 = true;
        }
        if (z2) {
            LinkedList<C51733vs1> linkedList2 = ss12.f141721i;
            if (linkedList2 != null) {
                if (!linkedList2.isEmpty()) {
                    linkedList = linkedList2;
                }
                if (linkedList != null) {
                    C51591us1 us12 = ss12.f141720h;
                    int i2 = ss12.f141717e;
                    String str = ss12.f141722j;
                    if (str == null) {
                        str = "";
                    }
                    C53162m1 m1Var4 = this.f148344h;
                    if (m1Var4 != null) {
                        m1Var4.mo73854T(linkedList, us12, i2, str);
                    }
                }
            }
        } else {
            C53162m1 m1Var5 = this.f148344h;
            if (m1Var5 != null) {
                m1Var5.mo73853F();
            }
        }
        if (!this.f148346j) {
            this.f148346j = mo73857e();
        }
    }

    public void onAttach(Object obj) {
        C53162m1 m1Var = (C53162m1) obj;
        C87412m.m108594g(m1Var, "callback");
        this.f148344h = m1Var;
        m1Var.mo73856k(new C53164o1(this));
    }

    public void onDetach() {
        C53162m1 m1Var = this.f148344h;
        if (m1Var != null) {
            m1Var.mo73853F();
        }
        this.f148346j = false;
    }
}
