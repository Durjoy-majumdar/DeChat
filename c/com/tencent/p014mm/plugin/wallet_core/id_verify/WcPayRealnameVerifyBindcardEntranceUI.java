package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI */
public class WcPayRealnameVerifyBindcardEntranceUI extends WalletBaseUI {

    /* renamed from: h */
    public static final /* synthetic */ int f209132h = 0;

    /* renamed from: d */
    public Button f209133d;

    /* renamed from: e */
    public Button f209134e;

    /* renamed from: f */
    public TextView f209135f;

    /* renamed from: g */
    public final IListener<WalletRealNameResultNotifyEvent> f209136g = new IListener<WalletRealNameResultNotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 323604482;
        }

        public boolean callback(IEvent iEvent) {
            WcPayRealnameVerifyBindcardEntranceUI.this.f209136g.dead();
            int i = ((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a;
            if (i != -1 && i != 0) {
                return false;
            }
            WcPayRealnameVerifyBindcardEntranceUI.this.finish();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI$a */
    public class C72096a implements MenuItem.OnMenuItemClickListener {
        public C72096a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79148e process = WcPayRealnameVerifyBindcardEntranceUI.this.getProcess();
            if (process != null) {
                process.mo91257c(WcPayRealnameVerifyBindcardEntranceUI.this.getContext(), 0);
            } else {
                WcPayRealnameVerifyBindcardEntranceUI.this.finish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI$b */
    public class C72097b implements View.OnClickListener {
        public C72097b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyBindcardEntranceUI.this.getInput().putBoolean("realname_verify_process_do_bind", true);
            C79143a.m95765d(WcPayRealnameVerifyBindcardEntranceUI.this.getContext(), WcPayRealnameVerifyBindcardEntranceUI.this.getInput());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI$c */
    public class C72098c implements View.OnClickListener {
        public C72098c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = WcPayRealnameVerifyBindcardEntranceUI.this.getInput().getBoolean("realname_verify_process_need_face", false);
            Log.m105925i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "need face : %s", Boolean.valueOf(z));
            if (z) {
                WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI = WcPayRealnameVerifyBindcardEntranceUI.this;
                int i = WcPayRealnameVerifyBindcardEntranceUI.f209132h;
                wcPayRealnameVerifyBindcardEntranceUI.getClass();
                Log.m105924i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "gotToFaceCheck");
                RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new RequestFaceVerifyForPayEvent();
                RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
                aVar.f9441i = wcPayRealnameVerifyBindcardEntranceUI;
                aVar.f9433a = (int) wcPayRealnameVerifyBindcardEntranceUI.getInput().getLong("realname_verify_process_face_scene");
                requestFaceVerifyForPayEvent.f9431d.f9434b = wcPayRealnameVerifyBindcardEntranceUI.getInput().getString("realname_verify_process_face_package");
                requestFaceVerifyForPayEvent.f9431d.f9435c = wcPayRealnameVerifyBindcardEntranceUI.getInput().getString("realname_verify_process_face_package_sign");
                requestFaceVerifyForPayEvent.f9431d.f9440h = 1;
                requestFaceVerifyForPayEvent.publish();
            } else {
                WcPayRealnameVerifyBindcardEntranceUI.this.getInput().putBoolean("realname_verify_process_do_bind", false);
                C79143a.m95765d(WcPayRealnameVerifyBindcardEntranceUI.this.getContext(), WcPayRealnameVerifyBindcardEntranceUI.this.getInput());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chd;
    }

    public void initView() {
        this.f209133d = (Button) findViewById(C0966R.C0970id.lss);
        this.f209134e = (Button) findViewById(C0966R.C0970id.lst);
        this.f209135f = (TextView) findViewById(C0966R.C0970id.ltk);
        String string = getInput().getString("realname_verify_process_add_bank_word");
        if (!Util.isNullOrNil(string)) {
            this.f209135f.setText(string);
        }
        this.f209133d.setOnClickListener(new C72097b());
        this.f209134e.setOnClickListener(new C72098c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "onActivityResult: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null && intent.getExtras() != null) {
            getInput().putString("realname_verify_process_face_token", intent.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN));
            getProcess().mo91264o(this, 0, getInput());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        setMMTitle("");
        initView();
        setBackBtn(new C72096a());
        this.f209136g.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f209136g.dead();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
