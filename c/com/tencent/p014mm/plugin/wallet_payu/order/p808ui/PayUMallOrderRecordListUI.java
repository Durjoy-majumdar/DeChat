package com.tencent.p014mm.plugin.wallet_payu.order.p808ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import pd2.C47463e;
import pd2.C77083g;
import pe3.C47465a;
import te3.C51374tb3;
import te3.C51815wc3;
import te3.C77929fd3;
import w63.C53084a;
import w63.C53085b;

/* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI */
public class PayUMallOrderRecordListUI extends MallOrderRecordListUI {

    /* renamed from: r */
    public static final /* synthetic */ int f211172r = 0;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI$a */
    public class C72583a implements Runnable {
        public C72583a() {
        }

        public void run() {
            PayUMallOrderRecordListUI payUMallOrderRecordListUI = PayUMallOrderRecordListUI.this;
            int i = PayUMallOrderRecordListUI.f211172r;
            if (payUMallOrderRecordListUI.f202225h) {
                Log.m105926v("MicroMsg.PayUMallOrderRecordListUI", "has more");
                PayUMallOrderRecordListUI payUMallOrderRecordListUI2 = PayUMallOrderRecordListUI.this;
                if (!payUMallOrderRecordListUI2.f202229o) {
                    payUMallOrderRecordListUI2.f202222e.mo101731g();
                    PayUMallOrderRecordListUI payUMallOrderRecordListUI3 = PayUMallOrderRecordListUI.this;
                    payUMallOrderRecordListUI3.f202222e.setAdapter(payUMallOrderRecordListUI3.f202223f);
                    PayUMallOrderRecordListUI.this.f202229o = true;
                }
            } else {
                Log.m105926v("MicroMsg.PayUMallOrderRecordListUI", "no more! dismiss footer view!");
                PayUMallOrderRecordListUI.this.f202222e.mo101727b();
            }
            PayUMallOrderRecordListUI.this.f202223f.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI$b */
    public class C72584b implements Runnable {
        public C72584b() {
        }

        public void run() {
            PayUMallOrderRecordListUI payUMallOrderRecordListUI = PayUMallOrderRecordListUI.this;
            int i = PayUMallOrderRecordListUI.f211172r;
            payUMallOrderRecordListUI.f202223f.notifyDataSetChanged();
        }
    }

    /* renamed from: H7 */
    public void mo96414H7() {
        addSceneEndListener(1519);
        addSceneEndListener(WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID);
    }

    /* renamed from: I7 */
    public void mo96415I7(String str, String str2, int i) {
        doSceneProgress(new C53085b(str));
    }

    /* renamed from: J7 */
    public void mo96416J7() {
        doSceneProgress(new C53084a(10, this.f202227j));
    }

    /* renamed from: K7 */
    public String mo96417K7(int i) {
        Locale locale = Locale.ENGLISH;
        return C75228t.m90264p(i, new SimpleDateFormat("dd MMMM", locale), new SimpleDateFormat("dd MMMM yyyy", locale));
    }

    /* renamed from: N7 */
    public void mo96420N7() {
        removeSceneEndListener(1519);
        removeSceneEndListener(WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C53084a) {
            C53084a aVar = (C53084a) yVar2;
            LinkedList<C77929fd3> linkedList = ((C51815wc3) aVar.f148155e.f127056b.f127083a).f143965f;
            LinkedList linkedList2 = new LinkedList();
            Iterator<C77929fd3> it = linkedList.iterator();
            while (it.hasNext()) {
                C77929fd3 next = it.next();
                C77083g gVar = new C77083g();
                gVar.f225159q = next.f227390p;
                gVar.f225160r = next.f227391q;
                gVar.f225161s = next.f227392r;
                gVar.f225152g = next.f227384g;
                gVar.f225155j = next.f227387j;
                gVar.f225151f = next.f227383f;
                gVar.f225158p = "0";
                gVar.f225154i = next.f227386i;
                gVar.f225157o = next.f227389o;
                gVar.f225164v = 1;
                gVar.f225163u = next.f227394t;
                gVar.f225162t = next.f227393s;
                gVar.f225156n = next.f227388n;
                gVar.f225150e = (double) next.f227382e;
                gVar.f225153h = next.f227385h;
                gVar.f225149d = next.f227381d;
                linkedList2.add(gVar);
            }
            mo96419M7(linkedList2);
            int size = ((ArrayList) this.f202224g).size();
            this.f202226i = size;
            this.f202225h = ((C51815wc3) aVar.f148155e.f127056b.f127083a).f143963d > size;
            this.f202223f.notifyDataSetChanged();
            Log.m105918d("MicroMsg.PayUMallOrderRecordListUI", "orders list count: " + this.f202226i);
            Log.m105918d("MicroMsg.PayUMallOrderRecordListUI", "orders list total record: " + ((C51815wc3) aVar.f148155e.f127056b.f127083a).f143963d);
            Log.m105918d("MicroMsg.PayUMallOrderRecordListUI", "orders list has more: " + this.f202225h);
            this.f202221d.post(new C72583a());
            this.f202230p = false;
        } else if (yVar2 instanceof C47463e) {
            C47465a aVar2 = ((C47463e) yVar2).f127312e.f127055a.f127080a;
            if (((C51374tb3) aVar2).f142103d == 2) {
                List<C77083g> list = this.f202224g;
                if (list != null) {
                    ((ArrayList) list).clear();
                }
                this.f202226i = 0;
                this.f202225h = false;
                this.f202222e.mo101727b();
            } else {
                String str2 = ((C51374tb3) aVar2).f142104e;
                Log.m105918d("MicroMsg.PayUMallOrderRecordListUI", "delete transId:" + str2);
                if (!Util.isNullOrNil(str2)) {
                    Iterator it4 = ((ArrayList) this.f202224g).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C77083g gVar2 = (C77083g) it4.next();
                        if (str2.equals(gVar2.f225149d)) {
                            ((ArrayList) this.f202224g).remove(gVar2);
                            this.f202226i = ((ArrayList) this.f202224g).size();
                            break;
                        }
                    }
                }
            }
            this.f202221d.post(new C72584b());
        }
        if (this.f202226i > 0 || ((ArrayList) this.f202224g).size() != 0) {
            showOptionMenu(true);
            View findViewById = findViewById(C0966R.C0970id.cj8);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            showOptionMenu(false);
            View findViewById2 = findViewById(C0966R.C0970id.cj8);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
