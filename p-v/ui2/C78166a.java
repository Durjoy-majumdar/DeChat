package ui2;

import android.widget.AdapterView;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI;

/* renamed from: ui2.a */
public class C78166a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BankRemitBankcardInputUI f229015d;

    /* renamed from: ui2.a$a */
    public class C78167a implements Runnable {
        public C78167a() {
        }

        public void run() {
            C78166a.this.f229015d.f203728e.mo105072d();
        }
    }

    public C78166a(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f229015d = bankRemitBankcardInputUI;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            r0.add(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.add(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27"
            java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r3 = "onItemClick"
            java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r0 = 0
            r11[r0] = r12
            java.lang.String r12 = "MicroMsg.BankRemitBankcardInputUI"
            java.lang.String r1 = "name_remind_list click: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r11)
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r11 = r7.f229015d
            r11.f203714H = r0
            android.widget.Adapter r8 = r8.getAdapter()
            java.lang.Object r8 = r8.getItem(r10)
            com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel r8 = (com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel) r8
            r11.f203713G = r8
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r8 = r7.f229015d
            r8.mo97164W7()
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r8 = r7.f229015d
            com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel r10 = r8.f203713G
            java.lang.String r11 = r10.f115911d
            java.lang.String r1 = r8.f203745y
            java.lang.String r10 = r10.f115915h
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r11
            java.lang.String r2 = "do query bankinfo by seq: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r9)
            si2.a r9 = new si2.a
            r9.<init>(r11, r1, r10)
            r8.doSceneProgress(r9, r0)
            ui2.a$a r8 = new ui2.a$a
            r8.<init>()
            r9 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r9)
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r8 = r7.f229015d
            android.widget.ListView r8 = r8.f203736p
            r9 = 8
            r8.setVisibility(r9)
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r8 = r7.f229015d
            r8.hideVKB()
            java.lang.String r8 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27"
            java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r10 = "onItemClick"
            java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            j20.C117292a.m165361g(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ui2.C78166a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
