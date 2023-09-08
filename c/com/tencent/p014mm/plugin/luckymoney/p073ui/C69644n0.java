package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69253n2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import qo3.C77407n;
import te3.C64749uf2;
import te3.C64801wf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n0 */
public class C69644n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f201017d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.n0$a */
    public class C69645a implements C11182m0 {
        public C69645a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
            r2 = (r0 = com.tencent.p014mm.plugin.luckymoney.model.C69253n2.m81627a(r0.f198957T)).f199288c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCreateMMMenu(nj3.C76874e0 r9) {
            /*
                r8 = this;
                com.tencent.mm.plugin.luckymoney.ui.n0 r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69644n0.this
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r0 = r0.f201017d
                r1 = 2131832359(0x7f112e27, float:1.929777E38)
                java.lang.String r0 = r0.getString(r1)
                r1 = 0
                r9.mo107142f(r1, r0)
                com.tencent.mm.plugin.luckymoney.ui.n0 r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69644n0.this
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r0 = r0.f201017d
                com.tencent.mm.plugin.luckymoney.model.a0 r0 = r0.f199859c2
                if (r0 == 0) goto L_0x002c
                java.lang.String r0 = r0.f198957T
                com.tencent.mm.plugin.luckymoney.model.n2 r0 = com.tencent.p014mm.plugin.luckymoney.model.C69253n2.m81627a(r0)
                if (r0 == 0) goto L_0x002c
                java.util.ArrayList<te3.wf2> r2 = r0.f199288c
                if (r2 == 0) goto L_0x002c
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x002c
                java.util.ArrayList<te3.wf2> r0 = r0.f199288c
                goto L_0x002d
            L_0x002c:
                r0 = 0
            L_0x002d:
                java.lang.String r2 = "MicroMsg.LuckyMoneyDetailUI"
                if (r0 != 0) goto L_0x0037
                java.lang.String r9 = "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
                return
            L_0x0037:
                java.util.Iterator r0 = r0.iterator()
                r3 = 1
                r4 = 1
            L_0x003d:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x006c
                java.lang.Object r5 = r0.next()
                te3.wf2 r5 = (te3.C64801wf2) r5
                java.lang.String r6 = r5.f186087d
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x0069
                te3.uf2 r6 = r5.f186088e
                if (r6 == 0) goto L_0x0069
                int r6 = r6.f185727d
                if (r6 == 0) goto L_0x0069
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.String r7 = r5.f186087d
                r6[r1] = r7
                java.lang.String r7 = "add option:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
                java.lang.String r5 = r5.f186087d
                r9.mo107142f(r4, r5)
            L_0x0069:
                int r4 = r4 + 1
                goto L_0x003d
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.C69644n0.C69645a.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.n0$b */
    public class C69646b implements C11184p0 {
        public C69646b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C69253n2 a;
            ArrayList<C64801wf2> arrayList;
            if (menuItem.getItemId() == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(C69644n0.this.f201017d.f199860d1 == 2 ? 13 : 7);
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = 0;
                objArr[4] = 4;
                nVar.mo160131h(11701, objArr);
                Intent intent = new Intent();
                intent.setClass(C69644n0.this.f201017d.getContext(), LuckyMoneyMyRecordUI.class);
                intent.putExtra("key_type", 2);
                intent.putExtra("key_username", C69644n0.this.f201017d.f199852Z0);
                LuckyMoneyDetailUI luckyMoneyDetailUI = C69644n0.this.f201017d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyDetailUI luckyMoneyDetailUI2 = luckyMoneyDetailUI;
                C117292a.m165358d(luckyMoneyDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$40$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyDetailUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$40$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            C69158a0 a0Var = C69644n0.this.f201017d.f199859c2;
            ArrayList<C64801wf2> arrayList2 = (a0Var == null || (a = C69253n2.m81627a(a0Var.f198957T)) == null || (arrayList = a.f199288c) == null || arrayList.size() <= 0) ? null : a.f199288c;
            if (arrayList2 == null) {
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "mTextInfoList == null || mTextInfoList.size() ==0");
            } else if (menuItem.getItemId() - 1 > arrayList2.size() - 1) {
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", Integer.valueOf(menuItem.getItemId()), Integer.valueOf(arrayList2.size()));
            } else {
                C64801wf2 wf22 = arrayList2.get(menuItem.getItemId() - 1);
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "click onMMMenuItemSelected : %s ,type:%s", wf22.f186087d, Integer.valueOf(wf22.f186088e.f185727d));
                C64749uf2 uf22 = wf22.f186088e;
                int i2 = uf22.f185727d;
                if (i2 == 1) {
                    Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.url ：%s", uf22.f185728e);
                    C75228t.m90219L(C69644n0.this.f201017d.getContext(), wf22.f186088e.f185728e, false);
                } else if (i2 == 2) {
                    Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.username ：%s", uf22.f185729f);
                    C64749uf2 uf23 = wf22.f186088e;
                    C75228t.m90224Q(uf23.f185729f, uf23.f185730g, 0, 1000);
                } else if (i2 != 3) {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "unknow text info type");
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                }
            }
        }
    }

    public C69644n0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201017d = luckyMoneyDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = new C77407n((Context) this.f201017d, 1, false);
        nVar.f225771i = new C69645a();
        nVar.f225782p = new C69646b();
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
