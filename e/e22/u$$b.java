package e22;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

public final /* synthetic */ class u$$b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelSelectUI f221925d;

    public /* synthetic */ u$$b(ContactLabelSelectUI contactLabelSelectUI) {
        this.f221925d = contactLabelSelectUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ContactLabelSelectUI contactLabelSelectUI = this.f221925d;
        int i = ContactLabelSelectUI.f198575X;
        contactLabelSelectUI.getClass();
        Intent intent = new Intent();
        intent.putStringArrayListExtra("label_id", contactLabelSelectUI.f198577B.f222463f);
        intent.putExtra("contact_select_label_id_list_from_search", new ArrayList(contactLabelSelectUI.f198585J));
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "opBtn: click, selected label size:%d, count from search:%d", Integer.valueOf(contactLabelSelectUI.f198577B.f222463f.size()), Integer.valueOf(contactLabelSelectUI.f198585J.size()));
        contactLabelSelectUI.setResult(-1, intent);
        contactLabelSelectUI.finish();
        return true;
    }
}
