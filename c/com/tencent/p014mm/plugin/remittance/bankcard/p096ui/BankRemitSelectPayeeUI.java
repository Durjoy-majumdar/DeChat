package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import di3.C86312j;
import g63.C45890a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C117747y;
import p629ny.C76979h;
import p910lj.C76701a;
import si2.C48385e;
import si2.C48388h;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI */
public class BankRemitSelectPayeeUI extends BankRemitBaseUI implements C11184p0 {

    /* renamed from: q */
    public static final /* synthetic */ int f115948q = 0;

    /* renamed from: e */
    public ListView f115949e;

    /* renamed from: f */
    public C45082x0 f115950f;

    /* renamed from: g */
    public C42827j f115951g;

    /* renamed from: h */
    public List<TransferRecordParcel> f115952h;

    /* renamed from: i */
    public ArrayList<TransferRecordParcel> f115953i;

    /* renamed from: j */
    public ArrayList<String> f115954j;

    /* renamed from: n */
    public int f115955n = -1;

    /* renamed from: o */
    public int f115956o = -1;

    /* renamed from: p */
    public Intent f115957p;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$a */
    public class C42817a implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48385e f115958a;

        public C42817a(C48385e eVar) {
            this.f115958a = eVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            String str2 = this.f115958a.f129516u;
            int i3 = BankRemitSelectPayeeUI.f115948q;
            bankRemitSelectPayeeUI.getClass();
            Log.m105924i("MicroMsg.BankRemitSelectPayeeUI", "do remove record");
            int size = ((ArrayList) bankRemitSelectPayeeUI.f115952h).size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((TransferRecordParcel) ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(size)).f115911d.equals(str2)) {
                        ((ArrayList) bankRemitSelectPayeeUI.f115952h).remove(size);
                        break;
                    }
                } else {
                    break;
                }
            }
            bankRemitSelectPayeeUI.f115951g.notifyDataSetChanged();
            if (bankRemitSelectPayeeUI.f115954j == null) {
                bankRemitSelectPayeeUI.f115954j = new ArrayList<>();
            }
            bankRemitSelectPayeeUI.f115954j.add(str2);
            bankRemitSelectPayeeUI.f115957p.putStringArrayListExtra("key_delete_seq_no_list", bankRemitSelectPayeeUI.f115954j);
            bankRemitSelectPayeeUI.setResult(0, bankRemitSelectPayeeUI.f115957p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$b */
    public class C42818b implements AdapterView.OnItemClickListener {
        public C42818b() {
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
                java.lang.String r1 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectPayeeUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                r9 = 1
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r11 = 0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
                r9[r11] = r12
                java.lang.String r11 = "MicroMsg.BankRemitSelectPayeeUI"
                java.lang.String r12 = "item click: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r9)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel r8 = (com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel) r8
                if (r8 == 0) goto L_0x0062
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI r9 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectPayeeUI.this
                android.content.Intent r9 = r9.f115957p
                java.lang.String r8 = r8.f115911d
                java.lang.String r10 = "key_bank_card_seqno"
                r9.putExtra(r10, r8)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI r8 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectPayeeUI.this
                r9 = -1
                android.content.Intent r10 = r8.f115957p
                r8.setResult(r9, r10)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI r8 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectPayeeUI.this
                r8.finish()
            L_0x0062:
                java.lang.String r8 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectPayeeUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectPayeeUI.C42818b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$c */
    public class C42819c implements AdapterView.OnItemLongClickListener {
        public C42819c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            bankRemitSelectPayeeUI.f115950f.mo70437c(view, i, j, bankRemitSelectPayeeUI, bankRemitSelectPayeeUI);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$d */
    public class C42820d implements C76879j.C47267l {

        /* renamed from: a */
        public final /* synthetic */ TransferRecordParcel f115962a;

        public C42820d(TransferRecordParcel transferRecordParcel) {
            this.f115962a = transferRecordParcel;
        }

        public boolean onFinish(CharSequence charSequence) {
            String str = this.f115962a.f115917j;
            if (!(str == null && charSequence == null) && (str == null || !str.equals(charSequence))) {
                BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
                String str2 = this.f115962a.f115911d;
                String str3 = "" + charSequence;
                int i = BankRemitSelectPayeeUI.f115948q;
                bankRemitSelectPayeeUI.getClass();
                Log.m105925i("MicroMsg.BankRemitSelectPayeeUI", "do modify remark: %s", str3);
                bankRemitSelectPayeeUI.doSceneProgress(new C48388h(str2, str3), true);
                return true;
            }
            Log.m105925i("MicroMsg.BankRemitSelectPayeeUI", "no change: %s, %s", this.f115962a.f115917j, charSequence);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$e */
    public class C42821e implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$e$a */
        public class C42822a implements Runnable {
            public C42822a() {
            }

            public void run() {
                BankRemitSelectPayeeUI.this.hideVKB();
            }
        }

        public C42821e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MMHandlerThread.postToMainThreadDelayed(new C42822a(), 500);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$f */
    public class C42823f implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48388h f115966a;

        public C42823f(C48388h hVar) {
            this.f115966a = hVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", Integer.valueOf(this.f115966a.f129525s.f143786d), this.f115966a.f129525s.f143787e);
            if (!Util.isNullOrNil(this.f115966a.f129525s.f143787e)) {
                C76701a.makeText((Context) BankRemitSelectPayeeUI.this, (CharSequence) this.f115966a.f129525s.f143787e, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$g */
    public class C42824g implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48388h f115968a;

        public C42824g(C48388h hVar) {
            this.f115968a = hVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.BankRemitSelectPayeeUI", "modify success");
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            C48388h hVar = this.f115968a;
            String str2 = hVar.f129527u;
            String str3 = hVar.f129528v;
            int i3 = BankRemitSelectPayeeUI.f115948q;
            bankRemitSelectPayeeUI.getClass();
            Log.m105924i("MicroMsg.BankRemitSelectPayeeUI", "do modify record");
            if (bankRemitSelectPayeeUI.f115953i == null) {
                bankRemitSelectPayeeUI.f115953i = new ArrayList<>();
            }
            int size = ((ArrayList) bankRemitSelectPayeeUI.f115952h).size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                TransferRecordParcel transferRecordParcel = (TransferRecordParcel) ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(size);
                if (transferRecordParcel.f115911d.equals(str2)) {
                    transferRecordParcel.f115917j = str3;
                    bankRemitSelectPayeeUI.f115953i.add(transferRecordParcel);
                    break;
                }
                size--;
            }
            bankRemitSelectPayeeUI.f115951g.notifyDataSetChanged();
            bankRemitSelectPayeeUI.f115957p.putParcelableArrayListExtra("key_modified_record_list", bankRemitSelectPayeeUI.f115953i);
            bankRemitSelectPayeeUI.setResult(0, bankRemitSelectPayeeUI.f115957p);
            C115669n.INSTANCE.mo160131h(14673, 5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$h */
    public class C42825h implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48385e f115970a;

        public C42825h(C48385e eVar) {
            this.f115970a = eVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", Integer.valueOf(this.f115970a.f129514s.f145665d), this.f115970a.f129514s.f145666e);
            if (!Util.isNullOrNil(this.f115970a.f129514s.f145666e)) {
                C76701a.makeText((Context) BankRemitSelectPayeeUI.this, (CharSequence) this.f115970a.f129514s.f145666e, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$i */
    public class C42826i {

        /* renamed from: a */
        public CdnImageView f115972a;

        /* renamed from: b */
        public TextView f115973b;

        /* renamed from: c */
        public TextView f115974c;

        public C42826i(C42818b bVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI$j */
    public class C42827j extends BaseAdapter {
        public C42827j(C42818b bVar) {
        }

        public int getCount() {
            int size = ((ArrayList) BankRemitSelectPayeeUI.this.f115952h).size();
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            boolean z = false;
            if (bankRemitSelectPayeeUI.f115955n > -1) {
                size++;
            }
            if (bankRemitSelectPayeeUI.f115956o > -1) {
                z = true;
            }
            return z ? size + 1 : size;
        }

        public Object getItem(int i) {
            int i2;
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            int i3 = bankRemitSelectPayeeUI.f115955n;
            if (i == i3 || i == (i2 = bankRemitSelectPayeeUI.f115956o)) {
                return null;
            }
            if (i < i2) {
                return ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(i - 1);
            }
            boolean z = false;
            if (!(i2 > -1) || i <= i2) {
                if (i3 > -1) {
                    return ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(i - 1);
                }
                Log.m105925i("MicroMsg.BankRemitSelectPayeeUI", "maybe wrong pos: [%s,%s,%s]", Integer.valueOf(i), Integer.valueOf(BankRemitSelectPayeeUI.this.f115955n), Integer.valueOf(BankRemitSelectPayeeUI.this.f115956o));
                return null;
            }
            if (i3 > -1) {
                z = true;
            }
            if (z) {
                return ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(i - 2);
            }
            return ((ArrayList) bankRemitSelectPayeeUI.f115952h).get(i - 1);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            return (i == bankRemitSelectPayeeUI.f115955n || i == bankRemitSelectPayeeUI.f115956o) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (view == null) {
                if (itemViewType == 0) {
                    view = LayoutInflater.from(BankRemitSelectPayeeUI.this.getContext()).inflate(C0966R.C0971layout.f6559ia, viewGroup, false);
                } else {
                    view = LayoutInflater.from(BankRemitSelectPayeeUI.this.getContext()).inflate(C0966R.C0971layout.f6560ib, viewGroup, false);
                    C42826i iVar = new C42826i((C42818b) null);
                    iVar.f115972a = (CdnImageView) view.findViewById(C0966R.C0970id.akt);
                    iVar.f115973b = (TextView) view.findViewById(C0966R.C0970id.akw);
                    iVar.f115974c = (TextView) view.findViewById(C0966R.C0970id.aku);
                    view.setTag(iVar);
                }
            }
            if (itemViewType == 0) {
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.aks);
                BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
                if (bankRemitSelectPayeeUI.f115955n == i) {
                    textView.setText(C0966R.string.ai_);
                } else {
                    if (bankRemitSelectPayeeUI.f115956o == i) {
                        textView.setText(C0966R.string.ai8);
                    } else {
                        textView.setText("");
                        Log.m105929w("MicroMsg.BankRemitSelectPayeeUI", "wrong header pos: %s", Integer.valueOf(i));
                    }
                }
            } else if (itemViewType != 1) {
                Log.m105929w("MicroMsg.BankRemitSelectPayeeUI", "unknown type: %d", Integer.valueOf(itemViewType));
            } else {
                C42826i iVar2 = (C42826i) view.getTag();
                TransferRecordParcel transferRecordParcel = (TransferRecordParcel) getItem(i);
                if (transferRecordParcel != null) {
                    iVar2.f115972a.mo100288c(transferRecordParcel.f115913f, 0, 0, C0966R.color.ahf);
                    if (!Util.isNullOrNil(transferRecordParcel.f115917j)) {
                        iVar2.f115973b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(BankRemitSelectPayeeUI.this.getContext(), BankRemitSelectPayeeUI.this.getContext().getString(C0966R.string.ai7, new Object[]{transferRecordParcel.f115916i, transferRecordParcel.f115917j})));
                    } else {
                        iVar2.f115973b.setText(transferRecordParcel.f115916i);
                    }
                    iVar2.f115974c.setText(BankRemitSelectPayeeUI.this.getString(C0966R.string.ai7, new Object[]{transferRecordParcel.f115914g, transferRecordParcel.f115912e}));
                } else {
                    iVar2.f115972a.setImageResource(C0966R.color.ahf);
                    iVar2.f115973b.setText("");
                    iVar2.f115974c.setText("");
                    Log.m105928w("MicroMsg.BankRemitSelectPayeeUI", "empty record");
                }
            }
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i) {
            BankRemitSelectPayeeUI bankRemitSelectPayeeUI = BankRemitSelectPayeeUI.this;
            return (i == bankRemitSelectPayeeUI.f115955n || i == bankRemitSelectPayeeUI.f115956o) ? false : true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6561ic;
    }

    public void initView() {
        this.f115949e = (ListView) findViewById(C0966R.C0970id.akx);
        this.f115950f = new C45082x0(this);
        C42827j jVar = new C42827j((C42818b) null);
        this.f115951g = jVar;
        this.f115949e.setAdapter(jVar);
        this.f115949e.setOnItemClickListener(new C42818b());
        this.f115949e.setOnItemLongClickListener(new C42819c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_self_transfer_record_list");
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("key_freq_transfer_record_list");
        this.f115952h = new ArrayList();
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f115955n = 0;
            ((ArrayList) this.f115952h).addAll(parcelableArrayListExtra);
        }
        if (parcelableArrayListExtra2 != null && !parcelableArrayListExtra2.isEmpty()) {
            this.f115956o = ((ArrayList) this.f115952h).size() + this.f115955n + 1;
            ((ArrayList) this.f115952h).addAll(parcelableArrayListExtra2);
        }
        Log.m105925i("MicroMsg.BankRemitSelectPayeeUI", "selfHeaderPos: %s, otherHeaderPos: %s", Integer.valueOf(this.f115955n), Integer.valueOf(this.f115956o));
        Iterator it = ((ArrayList) this.f115952h).iterator();
        while (it.hasNext()) {
            TransferRecordParcel transferRecordParcel = (TransferRecordParcel) it.next();
            Log.m105919d("MicroMsg.BankRemitSelectPayeeUI", "seqno: %s, tail: %s, bank_logo: %s, bank_name: %s, bank_type: %s, payee: %s, explain: %s", transferRecordParcel.f115911d, transferRecordParcel.f115912e, transferRecordParcel.f115913f, transferRecordParcel.f115914g, transferRecordParcel.f115915h, transferRecordParcel.f115916i, transferRecordParcel.f115917j);
        }
        this.f115957p = new Intent();
        initView();
        setMMTitle((int) C0966R.string.aia);
        addSceneEndListener(1590);
        addSceneEndListener(1395);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, C0966R.string.ai9);
        contextMenu.add(0, 0, 0, C0966R.string.ai6);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1590);
        removeSceneEndListener(1395);
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        TransferRecordParcel transferRecordParcel = (TransferRecordParcel) this.f115949e.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (transferRecordParcel == null) {
            Log.m105924i("MicroMsg.BankRemitSelectPayeeUI", "select record is null");
        } else if (itemId == 1) {
            C45890a.m51175a(this, getString(C0966R.string.bga), transferRecordParcel.f115917j, "", false, 32, new C42820d(transferRecordParcel), new C42821e());
        } else if (itemId == 0) {
            String str = transferRecordParcel.f115911d;
            Log.m105924i("MicroMsg.BankRemitSelectPayeeUI", "do delete record");
            doSceneProgress(new C48385e(str), true);
            C115669n.INSTANCE.mo160131h(14673, 7);
        } else {
            Log.m105925i("MicroMsg.BankRemitSelectPayeeUI", "unknown itemId: %s", Integer.valueOf(itemId));
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C48388h) {
            C48388h hVar = (C48388h) yVar;
            hVar.mo104823q1(new C42824g(hVar));
            hVar.mo104820l1(new C42823f(hVar));
            if (hVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", hVar);
            }
        } else if (yVar instanceof C48385e) {
            C48385e eVar = (C48385e) yVar;
            eVar.mo104823q1(new C42817a(eVar));
            eVar.mo104820l1(new C42825h(eVar));
            if (eVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", eVar);
            }
        }
        return false;
    }
}
