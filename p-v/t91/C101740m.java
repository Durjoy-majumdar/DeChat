package t91;

import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: t91.m */
public final class C101740m {

    /* renamed from: a */
    public final Map<String, Map<String, List<Pair<String, String>>>> f297817a;

    /* renamed from: b */
    public final C21153d f297818b = new C101741a(this);

    /* renamed from: t91.m$a */
    public class C101741a implements C21153d {
        public C101741a(C101740m mVar) {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
            if (!TextUtils.isEmpty(str) && str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$") && "onMMMenuItemSelected".equals(str2) && "(Landroid/view/MenuItem;I)V".equals(str3)) {
                Log.m105925i("HABBYGE-MALI.SnsFinderMonitor", "mSnsFinderListener, runOnExit: %b", Boolean.valueOf(C64208c.f181953c));
            }
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (!TextUtils.isEmpty(str) && str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$") && "onMMMenuItemSelected".equals(str2) && "(Landroid/view/MenuItem;I)V".equals(str3) && objArr != null && objArr.length >= 2) {
                MenuItem menuItem = objArr[0];
                if (menuItem instanceof MenuItem) {
                    int itemId = menuItem.getItemId();
                    C64208c.f181953c = itemId == 6;
                    Log.m105925i("HABBYGE-MALI.SnsFinderMonitor", "mSnsFinderListener, runOnEnter: itemId=%d, %b", Integer.valueOf(itemId), Boolean.valueOf(C64208c.f181953c));
                }
            }
        }
    }

    public C101740m() {
        HashMap hashMap = new HashMap();
        this.f297817a = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener", arrayList);
        hashMap.put("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$", hashMap2);
    }
}
