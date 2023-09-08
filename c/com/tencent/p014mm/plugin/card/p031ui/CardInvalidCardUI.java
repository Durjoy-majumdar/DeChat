package com.tencent.p014mm.plugin.card.p031ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import hz0.C46154m;
import hz0.C46156r;
import nj3.C76879j;
import ob0.C117747y;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.ui.CardInvalidCardUI */
public class CardInvalidCardUI extends CardBaseUI {

    /* renamed from: w */
    public static final /* synthetic */ int f109788w = 0;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardInvalidCardUI$a */
    public class C40835a implements MenuItem.OnMenuItemClickListener {
        public C40835a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardInvalidCardUI cardInvalidCardUI = CardInvalidCardUI.this;
            int i = CardInvalidCardUI.f109788w;
            cardInvalidCardUI.getClass();
            C53248d.m59681a(cardInvalidCardUI, new C40886w(cardInvalidCardUI));
            return true;
        }
    }

    /* renamed from: I7 */
    public C46154m mo63747I7() {
        return C46154m.INVALID_TYPE;
    }

    /* renamed from: J7 */
    public void mo63748J7() {
        setMMTitle((int) C0966R.string.ayr);
        addTextOptionMenu(0, getString(C0966R.string.aw9), new C40835a());
        if (this.f109700e.getCount() > 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6744nc;
    }

    public void initView() {
        super.initView();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (i == 0 && i2 == 0 && (yVar instanceof C46156r)) {
            if (this.f109705j) {
                C76879j.m92726T(this, getResources().getString(C0966R.string.awa));
            } else {
                C76879j.m92726T(this, getResources().getString(C0966R.string.aws));
            }
        }
        this.f109705j = false;
    }
}
