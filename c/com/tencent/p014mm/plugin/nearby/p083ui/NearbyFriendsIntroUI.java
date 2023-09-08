package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75590o4;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import l31.C61212e;
import nj3.C76879j;
import ns3.C11266d;
import o31.C11345b;
import o31.C76986a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI */
public class NearbyFriendsIntroUI extends MMActivity {

    /* renamed from: d */
    public C77398g f201600d = null;

    /* renamed from: e */
    public View f201601e;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI$a */
    public class C69874a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI$a$a */
        public class C69875a implements DialogInterface.OnClickListener {
            public C69875a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Class<NearbyPersonalInfoUI> cls = NearbyPersonalInfoUI.class;
                C86709a0.m107535s().mo121142i().mo119676J(4103, Boolean.TRUE);
                C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.FALSE);
                C75590o4 b = C75590o4.m90741b();
                if (b == null) {
                    NearbyFriendsIntroUI nearbyFriendsIntroUI = NearbyFriendsIntroUI.this;
                    Intent intent = new Intent(NearbyFriendsIntroUI.this, cls);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    NearbyFriendsIntroUI nearbyFriendsIntroUI2 = nearbyFriendsIntroUI;
                    C117292a.m165358d(nearbyFriendsIntroUI2, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    nearbyFriendsIntroUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(nearbyFriendsIntroUI2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    String nullAsNil = Util.nullAsNil(b.mo105937d());
                    Util.nullAsNil(b.mo105936c());
                    int nullAs = Util.nullAs(Integer.valueOf(b.f222065b), 0);
                    if (nullAsNil.equals("") || nullAs == 0) {
                        NearbyFriendsIntroUI nearbyFriendsIntroUI3 = NearbyFriendsIntroUI.this;
                        Intent intent2 = new Intent(NearbyFriendsIntroUI.this, cls);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        NearbyFriendsIntroUI nearbyFriendsIntroUI4 = nearbyFriendsIntroUI3;
                        C117292a.m165358d(nearbyFriendsIntroUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        nearbyFriendsIntroUI3.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(nearbyFriendsIntroUI4, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        NearbyFriendsIntroUI nearbyFriendsIntroUI5 = NearbyFriendsIntroUI.this;
                        Intent intent3 = new Intent(NearbyFriendsIntroUI.this, NearbyFriendsUI.class);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(intent3);
                        NearbyFriendsIntroUI nearbyFriendsIntroUI6 = nearbyFriendsIntroUI5;
                        C117292a.m165358d(nearbyFriendsIntroUI6, aVar3.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        nearbyFriendsIntroUI5.startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(nearbyFriendsIntroUI6, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(14);
                NearbyFriendsIntroUI.this.finish();
            }
        }

        public C69874a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NearbyFriendsIntroUI nearbyFriendsIntroUI = NearbyFriendsIntroUI.this;
            C77398g gVar = nearbyFriendsIntroUI.f201600d;
            if (gVar == null) {
                nearbyFriendsIntroUI.f201600d = C76879j.m92753x(nearbyFriendsIntroUI.getContext(), NearbyFriendsIntroUI.this.getString(C0966R.string.a3h), (String) null, NearbyFriendsIntroUI.this.f201601e, new C69875a(), (DialogInterface.OnClickListener) null);
            } else {
                gVar.show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI$b */
    public class C69876b implements MenuItem.OnMenuItemClickListener {
        public C69876b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearbyFriendsIntroUI.this.hideVKB();
            NearbyFriendsIntroUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359910bk1;
    }

    public void initView() {
        this.f201601e = View.inflate(this, C0966R.C0971layout.b5u, (ViewGroup) null);
        ((Button) findViewById(C0966R.C0970id.h_w)).setOnClickListener(new C69874a());
        ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(13);
        setBackBtn(new C69876b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361088h63);
        initView();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.NearbyPersonFragment).mo86179qs(this, C76986a.PeopleNearby).Mn0(this, 40, 24184);
    }
}
