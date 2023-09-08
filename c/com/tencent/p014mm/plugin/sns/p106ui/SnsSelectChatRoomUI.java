package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ft2.C75796a;
import ft2.C75797b;
import gl3.C75921a;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p418rx.C77578g;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI */
public class SnsSelectChatRoomUI extends MMBaseSelectContactUI {

    /* renamed from: D */
    public static final /* synthetic */ int f206144D = 0;

    /* renamed from: C */
    public HashSet<String> f206145C = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$a */
    public class C71214a implements View.OnClickListener {
        public C71214a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$2");
            if (view.getTag() != null && (view.getTag() instanceof C72996z1)) {
                SnsSelectChatRoomUI.m83644g8(SnsSelectChatRoomUI.this, (C72996z1) view.getTag());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$b */
    public class C71215b implements View.OnClickListener {
        public C71215b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$3");
            if (view.getTag() != null && (view.getTag() instanceof C72996z1)) {
                SnsSelectChatRoomUI.m83644g8(SnsSelectChatRoomUI.this, (C72996z1) view.getTag());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: g8 */
    public static void m83644g8(SnsSelectChatRoomUI snsSelectChatRoomUI, C72996z1 z1Var) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        snsSelectChatRoomUI.getClass();
        SnsMethodCalculate.markStartTimeMs("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        String username = z1Var.getUsername();
        Intent intent = new Intent(snsSelectChatRoomUI, SnsChatRoomMemberUI.class);
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(username);
        int size = k5 != null ? k5.size() : 0;
        int intExtra = snsSelectChatRoomUI.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        intent.putExtra("RoomInfo_Id", username);
        intent.putExtra("room_member_count", size);
        intent.putExtra("Add_address_titile", snsSelectChatRoomUI.getString(C0966R.string.jdo));
        intent.putExtra("room_name", z1Var.getUsername());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        snsSelectChatRoomUI.startActivityForResult(intent, 1);
        SnsReportHelper.f275506m0.mo131347H(username);
        SnsMethodCalculate.markEndTimeMs("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        SnsMethodCalculate.markStartTimeMs("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        C75796a aVar = new C75796a(this, (List<String>) null, true, false, getIntent().getBooleanExtra("key_filter_associate_chat_room", false));
        C71214a aVar2 = new C71214a();
        SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        aVar.f222416r = aVar2;
        SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        SnsMethodCalculate.markEndTimeMs("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return aVar;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        SnsMethodCalculate.markStartTimeMs("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        C75797b bVar = new C75797b(this, (List<String>) null, true);
        C71215b bVar2 = new C71215b();
        SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        bVar.f222417n = bVar2;
        SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        ((C77578g) bVar.f219151j).f226174t = true;
        SnsMethodCalculate.markEndTimeMs("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return bVar;
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        SnsMethodCalculate.markStartTimeMs("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int[] iArr = {131075};
        SnsMethodCalculate.markEndTimeMs("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return iArr;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        SnsMethodCalculate.markStartTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        String stringExtra = getIntent().getStringExtra("titile");
        if (!Util.isNullOrNil(stringExtra)) {
            SnsMethodCalculate.markEndTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return stringExtra;
        }
        String string = getContext().getString(C0966R.string.jdp);
        SnsMethodCalculate.markEndTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return string;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        SnsMethodCalculate.markStartTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            Log.m105925i("MicroMsg.SnsSelectChatRoomUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", Integer.valueOf(headerViewsCount), Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        C75922b j2 = mo103379N7().getItem(headerViewsCount);
        if (j2 == null) {
            SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        } else if (!(j2 instanceof C75921a)) {
            SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        } else {
            C75921a aVar = (C75921a) j2;
            C72996z1 z1Var = aVar.f222600A;
            if (z1Var == null) {
                SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            } else if (z1Var.mo73975s2() == 1) {
                SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            } else {
                C72996z1 z1Var2 = aVar.f222600A;
                SnsMethodCalculate.markStartTimeMs("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                String username = z1Var2.getUsername();
                mo103378K7();
                this.f218609h.mo100244d(username);
                if (this.f206145C.contains(username)) {
                    this.f206145C.remove(username);
                } else {
                    this.f206145C.add(username);
                }
                int size = this.f206145C.size();
                SnsMethodCalculate.markStartTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                mo103386e8(size);
                SnsMethodCalculate.markEndTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                SnsMethodCalculate.markEndTimeMs("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                this.f218607f.notifyDataSetChanged();
                SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.mo64518T7();
        String stringExtra = getIntent().getStringExtra("already_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            List<String> stringToList = Util.stringToList(stringExtra, ",");
            if (!Util.isNullOrNil((List) stringToList)) {
                this.f206145C.addAll(stringToList);
            }
        }
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        SnsMethodCalculate.markStartTimeMs("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        SnsMethodCalculate.markStartTimeMs("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
        SnsMethodCalculate.markStartTimeMs("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (i == 1) {
            this.f206145C.remove(str);
            mo103379N7().notifyDataSetChanged();
            int size = this.f206145C.size();
            SnsMethodCalculate.markStartTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            mo103386e8(size);
            SnsMethodCalculate.markEndTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        }
        SnsMethodCalculate.markEndTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    /* renamed from: i8 */
    public final ArrayList<String> mo97961i8(boolean z) {
        SnsMethodCalculate.markStartTimeMs("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.f206145C.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        arrayList.addAll(hashSet);
        SnsMethodCalculate.markEndTimeMs("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        addTextOptionMenu(1, getString(C0966R.string.mum), new C71258q5(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(1, true);
        SnsMethodCalculate.markEndTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        this.f218609h.mo100245e(new ArrayList(this.f206145C));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        SnsMethodCalculate.markStartTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            SnsMethodCalculate.markEndTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return false;
        }
        boolean contains = this.f206145C.contains(str);
        SnsMethodCalculate.markEndTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return contains;
    }
}
