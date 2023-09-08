package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import ob0.C89132b;
import te3.C51758vz;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.x3 */
public class C69722x3 implements C87581a<Object, C89132b.C89134c<C51758vz>> {

    /* renamed from: a */
    public final /* synthetic */ String f201143a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201144b;

    public C69722x3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, String str) {
        this.f201144b = luckyMoneyPickEnvelopeUI;
        this.f201143a = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = false;
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f201144b.f200517A;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", Integer.valueOf(((C51758vz) cVar.f256796d).f143780d));
            C51758vz vzVar = (C51758vz) cVar.f256796d;
            if (vzVar.f143780d == 0) {
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f201144b;
                String str = this.f201143a;
                Iterator it = ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    LuckyMoneyPickEnvelopeUI.C69497p pVar = (LuckyMoneyPickEnvelopeUI.C69497p) it.next();
                    if (pVar.f200615b.f228202f.equals(str)) {
                        ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).remove(pVar);
                        break;
                    }
                    i++;
                }
                if (((ArrayList) this.f201144b.f200555s).isEmpty()) {
                    View view = this.f201144b.f200554r;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f201144b.f200545g;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view5 = this.f201144b.f200549n;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "doDeleteShowSource: %s", Integer.valueOf(i));
                if (i <= 0) {
                    return null;
                }
                if (i == ((ArrayList) this.f201144b.f200555s).size()) {
                    this.f201144b.f200548j.notifyItemRemoved(i);
                    this.f201144b.f200553q.notifyItemRemoved(i);
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = this.f201144b;
                    luckyMoneyPickEnvelopeUI2.f200557u = -1;
                    if (((ArrayList) luckyMoneyPickEnvelopeUI2.f200555s).size() == 1) {
                        LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = this.f201144b.f200546h;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView2 = luckyMoneyEnvelopeTouchRecyclerView;
                        C117292a.m165358d(luckyMoneyEnvelopeTouchRecyclerView2, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                        luckyMoneyEnvelopeTouchRecyclerView.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(luckyMoneyEnvelopeTouchRecyclerView2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                        ((LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) this.f201144b.f200555s).get(0)).f200614a = true;
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = this.f201144b;
                        luckyMoneyPickEnvelopeUI3.f200557u = 0;
                        luckyMoneyPickEnvelopeUI3.mo95744T7(0, true);
                    } else {
                        LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView3 = this.f201144b.f200546h;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar5.mo10233c(Integer.valueOf(i - 1));
                        LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView4 = luckyMoneyEnvelopeTouchRecyclerView3;
                        C117292a.m165358d(luckyMoneyEnvelopeTouchRecyclerView4, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                        luckyMoneyEnvelopeTouchRecyclerView3.mo17115r1(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(luckyMoneyEnvelopeTouchRecyclerView4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$18", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                    }
                    this.f201144b.f200546h.postDelayed(new C69715w3(this), 100);
                    return null;
                }
                this.f201144b.f200548j.notifyItemRemoved(i);
                this.f201144b.f200553q.notifyItemRemoved(i);
                LuckyMoneyPickEnvelopeUI.C69497p pVar2 = (LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) this.f201144b.f200555s).get(i);
                C77994sf2 sf22 = pVar2.f200615b;
                if (!(sf22.f228205i == 1 || sf22.f228209p == 1 || this.f201144b.mo95740P7(sf22.f228202f))) {
                    z = true;
                }
                pVar2.f200614a = z;
                if (z) {
                    this.f201144b.f200557u = i;
                } else {
                    this.f201144b.f200557u = -1;
                }
                this.f201144b.mo95744T7(i, z);
                this.f201144b.mo95746V7();
                return null;
            } else if (Util.isNullOrNil(vzVar.f143781e)) {
                return null;
            } else {
                C75228t.m90211D(this.f201144b.getContext(), ((C51758vz) cVar.f256796d).f143781e);
                return null;
            }
        } else {
            C75228t.m90209B(this.f201144b.getContext(), cVar.f256795c);
            return null;
        }
    }
}
