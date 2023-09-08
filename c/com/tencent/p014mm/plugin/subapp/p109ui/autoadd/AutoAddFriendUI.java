package com.tencent.p014mm.plugin.subapp.p109ui.autoadd;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import g62.C32330n;
import lc3.C10485b;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI */
public class AutoAddFriendUI extends MMActivity {

    /* renamed from: d */
    public MMSwitchBtn f206337d = null;

    /* renamed from: e */
    public TextView f206338e = null;

    /* renamed from: f */
    public MMSwitchBtn f206339f = null;

    /* renamed from: g */
    public SparseIntArray f206340g = new SparseIntArray();

    /* renamed from: h */
    public int f206341h;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI$a */
    public class C71278a implements MMSwitchBtn.C7041b {
        public C71278a() {
        }

        public void onStatusChange(boolean z) {
            AutoAddFriendUI.m83745H7(AutoAddFriendUI.this, z, 2097152, 32);
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI$b */
    public class C71279b implements MMSwitchBtn.C7041b {
        public C71279b() {
        }

        public void onStatusChange(boolean z) {
            AutoAddFriendUI.m83745H7(AutoAddFriendUI.this, z, 32, 4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI$c */
    public class C71280c implements MenuItem.OnMenuItemClickListener {
        public C71280c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AutoAddFriendUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static boolean m83745H7(AutoAddFriendUI autoAddFriendUI, boolean z, int i, int i2) {
        autoAddFriendUI.getClass();
        Log.m105918d("MicroMsg.AutoAddFriendUI", "switch change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            autoAddFriendUI.f206341h = i | autoAddFriendUI.f206341h;
        } else {
            autoAddFriendUI.f206341h = (~i) & autoAddFriendUI.f206341h;
        }
        autoAddFriendUI.f206340g.put(i2, z ? 1 : 2);
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6527ha;
    }

    public void initView() {
        int i;
        this.f206337d = (MMSwitchBtn) findViewById(C0966R.C0970id.haq);
        this.f206338e = (TextView) findViewById(C0966R.C0970id.a1b);
        this.f206339f = (MMSwitchBtn) findViewById(C0966R.C0970id.a1a);
        boolean z = true;
        this.f206337d.setCheck((this.f206341h & 32) != 0);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("AutoAddFriendShow");
        if (Util.isNullOrNil(c)) {
            c = "0";
        }
        try {
            i = Util.getInt(c, 0);
        } catch (Exception unused) {
            i = 0;
        }
        Log.m105919d("MicroMsg.AutoAddFriendUI", "getAutoAddDynamicConfig, autoAdd = %d", Integer.valueOf(i));
        if (i == 1) {
            MMSwitchBtn mMSwitchBtn = this.f206339f;
            if ((2097152 & this.f206341h) == 0) {
                z = false;
            }
            mMSwitchBtn.setCheck(z);
            this.f206339f.setSwitchListener(new C71278a());
        } else {
            this.f206338e.setVisibility(8);
            this.f206339f.setVisibility(8);
        }
        this.f206337d.setSwitchListener(new C71279b());
        setBackBtn(new C71280c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.a_m);
        this.f206341h = C75592q0.m90787q();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C97625j3.m125812b().mo105906u().mo119676J(7, Integer.valueOf(this.f206341h));
        for (int i = 0; i < this.f206340g.size(); i++) {
            int keyAt = this.f206340g.keyAt(i);
            int valueAt = this.f206340g.valueAt(i);
            C64266br1 br12 = new C64266br1();
            br12.f182324d = keyAt;
            br12.f182325e = valueAt;
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.AutoAddFriendUI", "switch  " + keyAt + " " + valueAt);
        }
        this.f206340g.clear();
    }

    public void onResume() {
        super.onResume();
    }
}
