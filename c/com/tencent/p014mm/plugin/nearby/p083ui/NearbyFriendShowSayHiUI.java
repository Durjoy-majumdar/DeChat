package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ns3.C11266d;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI */
public class NearbyFriendShowSayHiUI extends MMActivity {

    /* renamed from: d */
    public ImageView f201594d;

    /* renamed from: e */
    public String f201595e = "";

    /* renamed from: f */
    public View f201596f = null;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI$a */
    public class C69871a implements MenuItem.OnMenuItemClickListener {
        public C69871a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearbyFriendShowSayHiUI.this.hideVKB();
            NearbyFriendShowSayHiUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI$b */
    public class C69872b implements View.OnClickListener {
        public C69872b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(14);
            NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI = NearbyFriendShowSayHiUI.this;
            Intent intent = new Intent(NearbyFriendShowSayHiUI.this, NearbyFriendsUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI2 = nearbyFriendShowSayHiUI;
            C117292a.m165358d(nearbyFriendShowSayHiUI2, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            nearbyFriendShowSayHiUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(nearbyFriendShowSayHiUI2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI$c */
    public class C69873c implements View.OnClickListener {
        public C69873c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(NearbyFriendShowSayHiUI.this, NearbySayHiListUI.class);
            intent.putExtra("k_say_hi_type", 2);
            intent.putExtra("show_clear_header", true);
            NearbyFriendShowSayHiUI.this.startActivityForResult(intent, 2009);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359912bk3;
    }

    public void initView() {
        setBackBtn(new C69871a());
        ((Button) findViewById(C0966R.C0970id.h_w)).setOnClickListener(new C69872b());
        ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(13);
        View findViewById = findViewById(C0966R.C0970id.eqg);
        this.f201596f = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f201596f.setOnClickListener(new C69873c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2009 && i2 == -1) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361088h63);
        initView();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        Class cls = C75700k0.class;
        super.onResume();
        TextView textView = (TextView) findViewById(C0966R.C0970id.j0x);
        C86709a0.m107523b().mo121108c();
        int kD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls)).mo96099XB()).mo100937kD();
        if (kD == 0) {
            View view = this.f201596f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setText(getResources().getQuantityString(C0966R.plurals.f7246a3, kD, new Object[]{Integer.valueOf(kD)}));
        this.f201594d = (ImageView) findViewById(C0966R.C0970id.gpl);
        C72956b4 bD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls)).mo96099XB()).mo100935bD();
        if (bD != null) {
            this.f201595e = bD.field_sayhiuser;
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f201594d, this.f201595e);
        }
    }
}
