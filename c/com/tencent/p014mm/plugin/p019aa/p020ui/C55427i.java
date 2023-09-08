package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.aa.ui.i */
public class C55427i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AAQueryListUI f157905d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.i$a */
    public class C55428a implements C11182m0 {
        public C55428a(C55427i iVar) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.add(0, 1, 1, (int) C0966R.string.f7310cc);
            e0Var.add(1, 2, 1, (int) C0966R.string.f7311cd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.i$b */
    public class C55429b implements C11184p0 {
        public C55429b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                Log.m105925i("MicroMsg.AAQueryListUI", "go to launch list: %d", Integer.valueOf(C55427i.this.f157905d.f195949s));
                AAQueryListUI aAQueryListUI = C55427i.this.f157905d;
                if (aAQueryListUI.f195949s != 1) {
                    aAQueryListUI.f195949s = 1;
                    aAQueryListUI.setMMTitle((int) C0966R.string.f7309cb);
                    AAQueryListUI aAQueryListUI2 = C55427i.this.f157905d;
                    C55425h hVar = aAQueryListUI2.f195942i;
                    hVar.f157898f = aAQueryListUI2.f195949s;
                    ((ArrayList) hVar.f157896d).clear();
                    C55427i.this.f157905d.f195942i.notifyDataSetChanged();
                    AAQueryListUI aAQueryListUI3 = C55427i.this.f157905d;
                    aAQueryListUI3.mo93733I7(true, aAQueryListUI3.f195949s);
                }
            } else if (itemId == 2) {
                Log.m105925i("MicroMsg.AAQueryListUI", "go to pay query list: %d", Integer.valueOf(C55427i.this.f157905d.f195949s));
                AAQueryListUI aAQueryListUI4 = C55427i.this.f157905d;
                if (aAQueryListUI4.f195949s != 2) {
                    aAQueryListUI4.setMMTitle((int) C0966R.string.f7312ce);
                    AAQueryListUI aAQueryListUI5 = C55427i.this.f157905d;
                    C55425h hVar2 = aAQueryListUI5.f195942i;
                    hVar2.f157898f = aAQueryListUI5.f195949s;
                    ((ArrayList) hVar2.f157896d).clear();
                    C55427i.this.f157905d.f195942i.notifyDataSetChanged();
                    AAQueryListUI aAQueryListUI6 = C55427i.this.f157905d;
                    aAQueryListUI6.f195949s = 2;
                    aAQueryListUI6.mo93733I7(true, 2);
                }
            }
        }
    }

    public C55427i(AAQueryListUI aAQueryListUI) {
        this.f157905d = aAQueryListUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f157905d, 1, false);
        nVar.f225771i = new C55428a(this);
        nVar.f225782p = new C55429b();
        nVar.mo107573q();
        return true;
    }
}
