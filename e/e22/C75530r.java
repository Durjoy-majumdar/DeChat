package e22;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: e22.r */
public class C75530r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelManagerUI f221916d;

    /* renamed from: e22.r$a */
    public class C75531a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Set f221917d;

        public C75531a(Set set) {
            this.f221917d = set;
        }

        public void run() {
            String string = C75530r.this.f221916d.getResources().getString(C0966R.string.g29);
            Intent intent = new Intent(C75530r.this.f221916d, SelectPrivacyContactsFromRangeUI.class);
            intent.putExtra("list_type", 1);
            intent.putExtra("filter_type", "@all.contact.android");
            intent.putExtra("only_show_contact", true);
            if (this.f221917d.size() > 0) {
                intent.putExtra("titile", string + "(" + this.f221917d.size() + ")");
            } else {
                intent.putExtra("titile", string);
            }
            intent.putExtra("last_page_source_type", 1);
            intent.putExtra("key_label_click_source", C75530r.this.f221916d.getIntent().getIntExtra("key_label_click_source", 0));
            intent.putExtra("can_go_to_profile", true);
            intent.putExtra("list_type", 1);
            intent.putExtra("already_select_contact", (String[]) this.f221917d.toArray(new String[0]));
            C75530r.this.f221916d.startActivityForResult(intent, 7001);
        }
    }

    public C75530r(ContactLabelManagerUI contactLabelManagerUI) {
        this.f221916d = contactLabelManagerUI;
    }

    public void run() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet2 = this.f221916d.f198522G;
        if (hashSet2 != null && hashSet2.size() > 0) {
            Iterator<String> it = this.f221916d.f198522G.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        HashMap<Integer, List<String>> O7 = this.f221916d.mo95107O7(arrayList, false);
        if (O7.size() > 0) {
            Iterator<Integer> it4 = O7.keySet().iterator();
            if (it4.hasNext()) {
                hashSet.addAll(O7.get(it4.next()));
            }
        }
        MMHandlerThread.postToMainThread(new C75531a(hashSet));
    }
}
