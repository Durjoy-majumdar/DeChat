package com.tencent.p014mm.wallet_core.p137ui.formview;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePickerNew;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: com.tencent.mm.wallet_core.ui.formview.a */
public class C75212a implements View.OnClickListener {

    /* renamed from: d */
    public int f221307d = -1;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f221308e;

    /* renamed from: f */
    public final /* synthetic */ WalletFormView f221309f;

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.a$a */
    public class C75213a implements C19877i.C19878a {

        /* renamed from: a */
        public final /* synthetic */ C19877i f221310a;

        public C75213a(C19877i iVar) {
            this.f221310a = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResult(boolean r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                com.tencent.mm.ui.widget.picker.i r6 = r4.f221310a
                r6.mo26532b()
                if (r5 == 0) goto L_0x0109
                com.tencent.mm.ui.widget.picker.i r5 = r4.f221310a
                java.lang.String r5 = r5.mo26531a()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r6 == 0) goto L_0x0014
                return
            L_0x0014:
                java.lang.String r6 = "-"
                java.lang.String[] r6 = r5.split(r6)
                int r7 = r6.length
                r8 = 2
                if (r7 >= r8) goto L_0x001f
                return
            L_0x001f:
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r1 = 0
                r0[r1] = r5
                java.lang.String r5 = "MicroMsg.FormatViewUtil"
                java.lang.String r2 = "result: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r0)
                r0 = r6[r1]
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                com.tencent.mm.wallet_core.ui.formview.a r2 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                r6 = r6[r7]
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
                int r6 = r6 - r7
                r2.f221307d = r6
                java.lang.Object[] r6 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r6[r1] = r2
                com.tencent.mm.wallet_core.ui.formview.a r1 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                int r1 = r1.f221307d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6[r7] = r1
                java.lang.String r1 = "year: %s, month: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r1, r6)
                if (r0 >= 0) goto L_0x006c
                com.tencent.mm.wallet_core.ui.formview.a r5 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                int r6 = r5.f221307d
                if (r6 >= 0) goto L_0x006c
                com.tencent.mm.ui.MMActivity r5 = r5.f221308e
                r6 = 2131839078(0x7f114866, float:1.9311397E38)
                java.lang.String r6 = r5.getString(r6)
                r7 = 0
                nj3.C76879j.m92748s(r5, r6, r7)
                goto L_0x00ec
            L_0x006c:
                java.text.DecimalFormat r5 = new java.text.DecimalFormat
                java.lang.String r6 = "00"
                r5.<init>(r6)
                boolean r6 = eb0.C75592q0.m90763K()
                if (r6 == 0) goto L_0x009a
                com.tencent.mm.wallet_core.ui.formview.a r6 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f221309f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.wallet_core.ui.formview.a r2 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                int r2 = r2.f221307d
                int r2 = r2 + r7
                long r2 = (long) r2
                java.lang.String r2 = r5.format(r2)
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                r6.setTag(r1)
                goto L_0x00c3
            L_0x009a:
                com.tencent.mm.wallet_core.ui.formview.a r6 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f221309f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r2 = (long) r0
                java.lang.String r2 = r5.format(r2)
                java.lang.String r2 = r2.substring(r8)
                r1.append(r2)
                com.tencent.mm.wallet_core.ui.formview.a r2 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                int r2 = r2.f221307d
                int r2 = r2 + r7
                long r2 = (long) r2
                java.lang.String r2 = r5.format(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r6.setTag(r1)
            L_0x00c3:
                com.tencent.mm.wallet_core.ui.formview.a r6 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f221309f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.wallet_core.ui.formview.a r2 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                int r2 = r2.f221307d
                int r2 = r2 + r7
                long r2 = (long) r2
                java.lang.String r7 = r5.format(r2)
                r1.append(r7)
                long r2 = (long) r0
                java.lang.String r5 = r5.format(r2)
                java.lang.String r5 = r5.substring(r8)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r6.setText(r5)
            L_0x00ec:
                com.tencent.mm.wallet_core.ui.formview.a r5 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r5.f221309f
                com.tencent.mm.wallet_core.ui.formview.WalletFormView$c r5 = r5.getInputValidChangeListener()
                if (r5 == 0) goto L_0x0109
                com.tencent.mm.wallet_core.ui.formview.a r5 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r5.f221309f
                com.tencent.mm.wallet_core.ui.formview.WalletFormView$c r5 = r5.getInputValidChangeListener()
                com.tencent.mm.wallet_core.ui.formview.a r6 = com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f221309f
                boolean r6 = r6.mo105094l()
                r5.onInputValidChange(r6)
            L_0x0109:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.p137ui.formview.C75212a.C75213a.onResult(boolean, int, int, int):void");
        }
    }

    public C75212a(MMActivity mMActivity, WalletFormView walletFormView) {
        this.f221308e = mMActivity;
        this.f221309f = walletFormView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f221308e.hideVKB();
        MMActivity mMActivity = this.f221308e;
        if (mMActivity instanceof WalletBaseUI) {
            ((WalletBaseUI) mMActivity).hideTenpayKB();
        }
        C19877i iVar = new C19877i(this.f221308e);
        CustomDatePickerNew customDatePickerNew = iVar.f56637n;
        if (customDatePickerNew != null) {
            customDatePickerNew.f56579o = false;
            customDatePickerNew.f56580p = true;
            customDatePickerNew.f56581q = true;
        }
        iVar.f56638o = new C75213a(iVar);
        Calendar instance = Calendar.getInstance();
        iVar.mo26533c(instance.get(1), instance.get(2) + 1, instance.get(5));
        iVar.mo26536f();
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
