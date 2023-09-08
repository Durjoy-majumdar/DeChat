package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import p407zo.C39417j;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationParentUI */
public class FinderConversationParentUI extends MMFinderUI {

    /* renamed from: o */
    public FinderBaseConversationFragment f111787o;

    /* renamed from: N7 */
    public Fragment mo4019N7() {
        if (this.f111787o == null) {
            this.f111787o = new FinderBaseConversationFragment();
        }
        FinderBaseConversationFragment finderBaseConversationFragment = this.f111787o;
        C87412m.m108591d(finderBaseConversationFragment);
        return finderBaseConversationFragment;
    }

    /* renamed from: O7 */
    public String mo2965O7() {
        return "";
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(((C39417j) C86312j.m106911c(C39417j.class)).mo61951Mz());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment N7 = mo4019N7();
        if (N7 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("KEY_TALKER_TYPE", getIntent().getIntExtra("KEY_TALKER_TYPE", -1));
            bundle2.putInt("KEY_TALKER_SCENE", getIntent().getIntExtra("KEY_TALKER_SCENE", -1));
            N7.setArguments(bundle2);
            C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
            C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.mo165200l(C0966R.C0970id.eek, N7);
            beginTransaction.mo165164f();
        }
    }

    public void onResume() {
        super.onResume();
        setMMTitle(mo2965O7());
    }
}
