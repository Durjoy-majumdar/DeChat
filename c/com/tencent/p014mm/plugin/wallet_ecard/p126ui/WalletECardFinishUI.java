package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenECardFinishEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import ob0.C117747y;
import te3.C50797p83;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI */
public class WalletECardFinishUI extends WalletECardBaseUI {

    /* renamed from: d */
    public Button f117393d;

    /* renamed from: e */
    public TextView f117394e;

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI$a */
    public class C43431a implements MenuItem.OnMenuItemClickListener {
        public C43431a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.WalletECardFinishUI", "press back btn");
            WalletECardFinishUI.this.f117393d.performClick();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI$b */
    public class C43432b implements View.OnClickListener {
        public C43432b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletECardFinishUI", "click finish");
            new OpenECardFinishEvent().publish();
            C79148e process = WalletECardFinishUI.this.getProcess();
            if (process != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_process_result_code", -1);
                process.mo91259f(WalletECardFinishUI.this.getContext(), bundle);
            } else {
                Log.m105928w("MicroMsg.WalletECardFinishUI", "process is null");
                WalletECardFinishUI.this.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a06;
    }

    public void initView() {
        C50797p83 p832;
        this.f117394e = (TextView) findViewById(C0966R.C0970id.c2h);
        byte[] byteArray = getInput().getByteArray("key_open_card_finish_title");
        if (byteArray != null) {
            try {
                if (!(byteArray.length == 0 || (p832 = (C50797p83) new C50797p83().parseFrom(byteArray)) == null || Util.isNullOrNil(p832.f139637e))) {
                    this.f117394e.setText(p832.f139637e);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletECardFinishUI", e, "", new Object[0]);
            }
        }
        Button button = (Button) findViewById(C0966R.C0970id.e9q);
        this.f117393d = button;
        button.setOnClickListener(new C43432b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        enableBackMenu(false);
        setBackBtn(new C43431a());
        showHomeBtn(false);
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
