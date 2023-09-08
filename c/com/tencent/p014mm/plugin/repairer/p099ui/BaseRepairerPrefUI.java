package com.tencent.p014mm.plugin.repairer.p099ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hj2.C59926a;
import hj2.C59927b;
import ij2.C60307b;
import ij2.C60313c;
import ij2.C60326i;
import java.util.HashSet;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C64563mr3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerPrefUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI */
public abstract class BaseRepairerPrefUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI$a */
    public static final class C57182a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseRepairerPrefUI f163889d;

        public C57182a(BaseRepairerPrefUI baseRepairerPrefUI) {
            this.f163889d = baseRepairerPrefUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163889d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI$b */
    public static final class C57183b extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseRepairerPrefUI f163890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57183b(BaseRepairerPrefUI baseRepairerPrefUI) {
            super(1);
            this.f163890d = baseRepairerPrefUI;
        }

        public Object invoke(Object obj) {
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            BaseRepairerPrefUI baseRepairerPrefUI = this.f163890d;
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59926a)) {
                String str = ((C59926a) action).f171033a.f184381e;
                if (str == null) {
                    str = "";
                }
                baseRepairerPrefUI.setMMTitle(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI$c */
    public static final class C57184c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseRepairerPrefUI f163891d;

        public C57184c(BaseRepairerPrefUI baseRepairerPrefUI) {
            this.f163891d = baseRepairerPrefUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C59927b bVar;
            C64563mr3 mr32;
            UIStateCenter stateCenter = this.f163891d.getStateCenter();
            if (stateCenter == null || (bVar = (C59927b) stateCenter.getState()) == null || (mr32 = bVar.f171035e) == null) {
                return false;
            }
            BaseRepairerPrefUI baseRepairerPrefUI = this.f163891d;
            baseRepairerPrefUI.startActivityForResult(new Intent(baseRepairerPrefUI, RepairerSearchUI.class).putExtra("key_config_item_list", mr32.toByteArray()), 1);
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bt4;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C57182a(this));
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.observe((C0125s) this, new C57183b(this));
        }
        addIconOptionMenu(0, (int) C0966R.string.a2p, (int) C0966R.raw.actionbar_icon_light_search, (MenuItem.OnMenuItemClickListener) new C57184c(this));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C60326i.class);
        hashSet.add(C60313c.class);
        hashSet.add(C60307b.class);
    }
}
