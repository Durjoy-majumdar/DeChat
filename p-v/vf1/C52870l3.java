package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import dj1.C45345c1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import nr3.C89059e;
import te3.C50332lz3;
import te3.C51946xa1;

/* renamed from: vf1.l3 */
public final class C52870l3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostSelectContactUI f147669d;

    public C52870l3(FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f147669d = finderLivePostSelectContactUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f147669d;
        int i = FinderLivePostSelectContactUI.f111537J;
        finderLivePostSelectContactUI.getClass();
        Log.m105924i("FinderLivePostSelectContactUI", "select_contact_step100,selectRoom:" + finderLivePostSelectContactUI.f111539D + ", selectUser:" + finderLivePostSelectContactUI.f111541F + ", selectAllContact:" + finderLivePostSelectContactUI.f111538C);
        boolean booleanExtra = finderLivePostSelectContactUI.getIntent().getBooleanExtra("KEY_PARAMS_IS_FROM_QR_CODE", false);
        String stringExtra = finderLivePostSelectContactUI.getIntent().getStringExtra("KEY_PARAMS_QR_CODE_URL");
        if (booleanExtra) {
            finderLivePostSelectContactUI.enableOptionMenu(1, false);
            Iterator<String> it = finderLivePostSelectContactUI.f111541F.iterator();
            while (it.hasNext()) {
                String next = it.next();
                ArrayList<C50332lz3> arrayList = finderLivePostSelectContactUI.f111542G;
                C50332lz3 lz32 = new C50332lz3();
                lz32.f137730d = next;
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
                if (z1Var != null) {
                    String username = z1Var.getUsername();
                    if (!(username == null || username.length() == 0)) {
                        lz32.f137731e = ((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, z1Var.getUsername());
                    }
                }
                arrayList.add(lz32);
            }
            C89059e i2 = new C45345c1(stringExtra, finderLivePostSelectContactUI.f111540E, finderLivePostSelectContactUI.f111542G).mo9225i();
            i2.mo123420E(new C52869k3(finderLivePostSelectContactUI));
            i2.mo11397F(finderLivePostSelectContactUI);
        } else {
            Intent intent = new Intent();
            C51946xa1 xa12 = new C51946xa1();
            xa12.f144559f.addAll(finderLivePostSelectContactUI.f111538C);
            xa12.f144557d.addAll(finderLivePostSelectContactUI.f111539D);
            xa12.f144558e.addAll(finderLivePostSelectContactUI.f111541F);
            intent.putExtra("KEY_PARAMS_WHITE_LIST", xa12.toByteArray());
            finderLivePostSelectContactUI.setResult(-1, intent);
            finderLivePostSelectContactUI.finish();
            finderLivePostSelectContactUI.mo64522g8();
            finderLivePostSelectContactUI.mo103379N7().notifyDataSetChanged();
        }
        return true;
    }
}
