package com.tencent.kinda.framework.widget.base;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.BankEditSelectedEvent;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankCardSelectUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankCardTypeSelectUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.BankCardSelectSortView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qj3.C47864f;
import te3.C50798p9;
import te3.C50929q9;

public class KindaWrapBankEditActivity extends WalletBankCardSelectUI {
    public static final String FLAG_ACTIVITY_BACK = "flag_activity_back_KindaWrapBankEditActivity";
    public static final String FLAG_ACTIVITY_CLOSE = "flag_activity_close_KindaWrapBankEditActivity";
    public static final int REQ_SELECT_BANKCARD_TYPE = 1;
    public static final String TAG = "KindaBank.KindaWrapBankEditActivity";
    private String mSelectBankName;
    private List<C47864f> mSortEntities = new ArrayList();

    private void sendDatatoKinda(String str, String str2, String str3) {
        String str4 = "";
        for (ElementQuery next : this.bankcardTypeList) {
            if (next.f209505e.equals(str) && next.f209517t.equals(str2)) {
                str4 = next.f209516s;
                Log.m105924i(TAG, "Ktemp.bank_type：" + next.f209516s);
            }
        }
        if (!str4.isEmpty()) {
            str3 = str4;
        }
        BankEditSelectedEvent bankEditSelectedEvent = new BankEditSelectedEvent();
        BankEditSelectedEvent.C67660a aVar = bankEditSelectedEvent.f193483d;
        aVar.f193484a = str;
        aVar.f193486c = str2;
        aVar.f193485b = str3;
        bankEditSelectedEvent.publish();
        Log.m105924i(TAG, "sendDataToKinda：bankName：" + str + "  bankAccName：" + str2 + "  BankType：" + str3);
        StringBuilder sb = new StringBuilder();
        sb.append("KindaWrapBankEditActivity.onItemSelect，发送事件，当前线程：");
        sb.append(Thread.currentThread().getId());
        Log.m105924i(TAG, sb.toString());
        finish();
        if (isFinishing()) {
            BankEditSelectedEvent bankEditSelectedEvent2 = new BankEditSelectedEvent();
            bankEditSelectedEvent2.f193483d.f193484a = FLAG_ACTIVITY_CLOSE;
            bankEditSelectedEvent2.publish();
        }
    }

    public void fetchData() {
        C50929q9 q9Var = new C50929q9();
        try {
            q9Var.parseFrom(getIntent().getByteArrayExtra("major_bank_list"));
        } catch (Exception unused) {
            Log.m105920e(TAG, "bank list parse failed");
        }
        this.majorBankCardList = new ArrayList();
        Iterator<C50798p9> it = q9Var.f140190d.iterator();
        while (it.hasNext()) {
            C50798p9 next = it.next();
            ElementQuery elementQuery = new ElementQuery();
            elementQuery.f209505e = next.f139647d;
            elementQuery.f209516s = next.f139649f;
            this.majorBankCardList.add(elementQuery);
        }
        C50929q9 q9Var2 = new C50929q9();
        try {
            q9Var2.parseFrom(getIntent().getByteArrayExtra("bank_list"));
        } catch (Exception unused2) {
            Log.m105920e(TAG, "bank list parse failed");
        }
        this.bankcardList = new ArrayList();
        Iterator<C50798p9> it4 = q9Var2.f140190d.iterator();
        while (it4.hasNext()) {
            C50798p9 next2 = it4.next();
            ElementQuery elementQuery2 = new ElementQuery();
            elementQuery2.f209505e = next2.f139647d;
            elementQuery2.f209516s = next2.f139649f;
            this.bankcardList.add(elementQuery2);
        }
        C50929q9 q9Var3 = new C50929q9();
        try {
            q9Var3.parseFrom(getIntent().getByteArrayExtra("bank_type_list"));
        } catch (Exception unused3) {
            Log.m105920e(TAG, "bank type list parse failed");
        }
        this.bankcardTypeList = new ArrayList();
        Iterator<C50798p9> it5 = q9Var3.f140190d.iterator();
        while (it5.hasNext()) {
            C50798p9 next3 = it5.next();
            ElementQuery elementQuery3 = new ElementQuery();
            elementQuery3.f209505e = next3.f139647d;
            elementQuery3.f209516s = next3.f139649f;
            elementQuery3.f209517t = next3.f139651h;
            this.bankcardTypeList.add(elementQuery3);
        }
        runOnUiThread(new Runnable() {
            public void run() {
                KindaWrapBankEditActivity.super.fetchData();
            }
        });
        setBackBtn(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                int unused = KindaWrapBankEditActivity.this.mPayResultType = 4;
                if (KindaWrapBankEditActivity.this.needConfirmFinish()) {
                    KindaWrapBankEditActivity.this.hideVKB();
                    KindaWrapBankEditActivity.this.showDialog(1000);
                    return true;
                }
                if (!Util.isNullOrNil(KindaWrapBankEditActivity.this.bankcardTypeList)) {
                    BankEditSelectedEvent bankEditSelectedEvent = new BankEditSelectedEvent();
                    bankEditSelectedEvent.f193483d.f193484a = KindaWrapBankEditActivity.FLAG_ACTIVITY_BACK;
                    bankEditSelectedEvent.publish();
                }
                KindaWrapBankEditActivity.this.finish();
                return true;
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            sendDatatoKinda(this.mSelectBankName, intent.getStringExtra("bank_card_acc_name"), "");
        }
    }

    public void onItemSelect(Object obj, int i) {
        BankCardSelectSortView.C72438b bVar = (BankCardSelectSortView.C72438b) obj;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            hideVKB();
            this.mSelectBankName = bVar.f210698c;
            if (this.bankcardTypeList.size() == 0) {
                sendDatatoKinda(this.mSelectBankName, "", bVar.f210700e);
                return;
            }
            for (ElementQuery next : this.bankcardTypeList) {
                if (next.f209505e.equals(this.mSelectBankName)) {
                    arrayList.add(next.f209517t);
                }
            }
            if (arrayList.size() == 1) {
                sendDatatoKinda(this.mSelectBankName, (String) arrayList.get(0), "");
                return;
            }
            Intent intent = new Intent(this, WalletBankCardTypeSelectUI.class);
            intent.putStringArrayListExtra("bank_type_show_list", arrayList);
            startActivityForResult(intent, 1);
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            BankEditSelectedEvent bankEditSelectedEvent = new BankEditSelectedEvent();
            bankEditSelectedEvent.f193483d.f193484a = FLAG_ACTIVITY_CLOSE;
            bankEditSelectedEvent.publish();
        }
    }
}
