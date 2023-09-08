package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import nj3.C88989a;
import xb2.C118866a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerKeyboardChangeDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(1)
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI */
public final class RepairerKeyboardChangeDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI$a */
    public static final class C115657a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerKeyboardChangeDemoUI f346921d;

        public C115657a(RepairerKeyboardChangeDemoUI repairerKeyboardChangeDemoUI) {
            this.f346921d = repairerKeyboardChangeDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f346921d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI$b */
    public static final class C115658b implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerKeyboardChangeDemoUI f346922d;

        public C115658b(RepairerKeyboardChangeDemoUI repairerKeyboardChangeDemoUI) {
            this.f346922d = repairerKeyboardChangeDemoUI;
        }

        public final void onFocusChange(View view, boolean z) {
            ((C118866a) C39818r.f106831a.mo62444c(this.f346922d).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bs6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("键盘高度调整Demo");
        setBackBtn(new C115657a(this));
        C115658b bVar = new C115658b(this);
        MMClearEditText mMClearEditText = (MMClearEditText) findViewById(C0966R.C0970id.ffx);
        if (mMClearEditText != null) {
            mMClearEditText.setOnFocusChangeListener(bVar);
        }
        MMClearEditText mMClearEditText2 = (MMClearEditText) findViewById(C0966R.C0970id.ffy);
        if (mMClearEditText2 != null) {
            mMClearEditText2.setOnFocusChangeListener(bVar);
        }
        MMClearEditText mMClearEditText3 = (MMClearEditText) findViewById(C0966R.C0970id.ffz);
        if (mMClearEditText3 != null) {
            mMClearEditText3.setOnFocusChangeListener(bVar);
        }
        MMClearEditText mMClearEditText4 = (MMClearEditText) findViewById(C0966R.C0970id.f358492fg0);
        if (mMClearEditText4 != null) {
            mMClearEditText4.setOnFocusChangeListener(bVar);
        }
        MMClearEditText mMClearEditText5 = (MMClearEditText) findViewById(C0966R.C0970id.f358493fg1);
        if (mMClearEditText5 != null) {
            mMClearEditText5.setOnFocusChangeListener(bVar);
        }
        MMClearEditText mMClearEditText6 = (MMClearEditText) findViewById(C0966R.C0970id.f358494fg2);
        if (mMClearEditText6 != null) {
            mMClearEditText6.setOnFocusChangeListener(bVar);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
    }
}
