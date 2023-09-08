package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsChatRoomMemberUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ft2.C75796a;
import ft2.C75797b;
import gl3.C75922b;
import hl3.C76236a;
import hl3.C76237b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI */
public class CommonSelectChatRoomUI extends MMBaseSelectContactUI {

    /* renamed from: E */
    public static final /* synthetic */ int f219115E = 0;

    /* renamed from: C */
    public HashSet<String> f219116C = new HashSet<>();

    /* renamed from: D */
    public String f219117D;

    /* renamed from: com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI$a */
    public class C74541a implements View.OnClickListener {
        public C74541a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() != null && (view.getTag() instanceof C72996z1)) {
                CommonSelectChatRoomUI.m89221g8(CommonSelectChatRoomUI.this, (C72996z1) view.getTag());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI$b */
    public class C74542b implements View.OnClickListener {
        public C74542b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() != null && (view.getTag() instanceof C72996z1)) {
                CommonSelectChatRoomUI.m89221g8(CommonSelectChatRoomUI.this, (C72996z1) view.getTag());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: g8 */
    public static void m89221g8(CommonSelectChatRoomUI commonSelectChatRoomUI, C72996z1 z1Var) {
        commonSelectChatRoomUI.getClass();
        int i = 0;
        Log.m105925i("MicroMsg.CommonSelectChatRoomUI", "goToRoomMember, contact=%s.", z1Var);
        String username = z1Var.getUsername();
        Intent intent = new Intent(commonSelectChatRoomUI, SnsChatRoomMemberUI.class);
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(username);
        if (k5 != null) {
            i = k5.size();
        }
        intent.putExtra("RoomInfo_Id", username);
        intent.putExtra("room_member_count", i);
        intent.putExtra("Add_address_titile", commonSelectChatRoomUI.getString(C0966R.string.jdo));
        intent.putExtra("room_name", z1Var.getUsername());
        commonSelectChatRoomUI.startActivityForResult(intent, 1);
        SnsReportHelper.f275506m0.mo131347H(username);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C75796a aVar = new C75796a(this, (List<String>) null, true, false, false);
        C74541a aVar2 = new C74541a();
        SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        aVar.f222416r = aVar2;
        SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return aVar;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        C75797b bVar = new C75797b(this, (List<String>) null, true);
        C74542b bVar2 = new C74542b();
        SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        bVar.f222417n = bVar2;
        SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return bVar;
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131075};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r1 = (gl3.C75921a) r1;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            android.widget.ListView r1 = r0.f218605d
            int r1 = r1.getHeaderViewsCount()
            int r1 = r3 - r1
            r2 = 1
            if (r1 >= 0) goto L_0x0023
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r4[r2] = r1
            java.lang.String r1 = "MicroMsg.CommonSelectChatRoomUI"
            java.lang.String r2 = "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            return
        L_0x0023:
            com.tencent.mm.ui.contact.i1 r3 = r0.mo103379N7()
            gl3.b r1 = r3.getItem(r1)
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            boolean r3 = r1 instanceof gl3.C75921a
            if (r3 != 0) goto L_0x0033
            return
        L_0x0033:
            gl3.a r1 = (gl3.C75921a) r1
            com.tencent.mm.storage.z1 r3 = r1.f222600A
            if (r3 != 0) goto L_0x003a
            return
        L_0x003a:
            int r3 = r3.mo73975s2()
            if (r3 != r2) goto L_0x0041
            return
        L_0x0041:
            com.tencent.mm.storage.z1 r1 = r1.f222600A
            java.lang.String r1 = r1.getUsername()
            r0.mo103378K7()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r0.f218609h
            r2.mo100244d(r1)
            java.util.HashSet<java.lang.String> r2 = r0.f219116C
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x005d
            java.util.HashSet<java.lang.String> r2 = r0.f219116C
            r2.remove(r1)
            goto L_0x0062
        L_0x005d:
            java.util.HashSet<java.lang.String> r2 = r0.f219116C
            r2.add(r1)
        L_0x0062:
            com.tencent.mm.ui.contact.m1 r1 = r0.f218607f
            r1.notifyDataSetChanged()
            r0.mo103594j8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.privacy.CommonSelectChatRoomUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        String stringExtra = getIntent().getStringExtra("privacy_source_type");
        this.f219117D = stringExtra;
        Log.m105925i("MicroMsg.CommonSelectChatRoomUI", "initData, blackType = %s.", stringExtra);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f219116C.remove(str);
            mo103379N7().notifyDataSetChanged();
            mo103594j8();
        }
    }

    /* renamed from: i8 */
    public final ArrayList<String> mo103593i8(boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.f219116C.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: j8 */
    public final void mo103594j8() {
        if (this.f219116C.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
        updateOptionMenuText(1, getString(C0966R.string.f360089a13) + "(" + this.f219116C.size() + ")");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            Log.m105925i("MicroMsg.CommonSelectChatRoomUI", "onActivityResult, resultCode = %s.", Integer.valueOf(i2));
        } else if (i == 0) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            Intent intent2 = new Intent();
            intent2.putExtra("Select_Contact", stringExtra);
            setResult(-1, intent2);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C76236a(this));
        addTextOptionMenu(1, getString(C0966R.string.f360089a13), new C76237b(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo103594j8();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f219116C.contains(str);
    }
}
