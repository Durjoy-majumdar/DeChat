package com.tencent.p014mm.plugin.remittance.p098ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.LaunchAAEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import wc3.C78541w;
import wd3.C65953v0;
import yf0.C79090a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI */
public class SelectRemittanceContactUI extends MMBaseSelectContactUI {

    /* renamed from: I */
    public static final /* synthetic */ int f205202I = 0;

    /* renamed from: C */
    public List<String> f205203C;

    /* renamed from: D */
    public List<String> f205204D;

    /* renamed from: E */
    public List<String> f205205E;

    /* renamed from: F */
    public String f205206F;

    /* renamed from: G */
    public View f205207G;

    /* renamed from: H */
    public int f205208H;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$a */
    public class C70848a implements Runnable {
        public C70848a() {
        }

        public void run() {
            SelectRemittanceContactUI selectRemittanceContactUI = SelectRemittanceContactUI.this;
            int i = SelectRemittanceContactUI.f205202I;
            selectRemittanceContactUI.getContentView().findViewById(C0966R.C0970id.krs).sendAccessibilityEvent(128);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$b */
    public class C70849b implements DialogInterface.OnClickListener {
        public C70849b(SelectRemittanceContactUI selectRemittanceContactUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onDialogClick() ");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$c */
    public class C70850c extends View.AccessibilityDelegate {
        public C70850c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(TextView.class.getName());
            accessibilityNodeInfo.setContentDescription(SelectRemittanceContactUI.this.getString(C0966R.string.l8p));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$d */
    public class C70851d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f205211d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f205212e;

        public C70851d(String str, ArrayList arrayList) {
            this.f205211d = str;
            this.f205212e = arrayList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onDialogClick() ok");
            SelectRemittanceContactUI selectRemittanceContactUI = SelectRemittanceContactUI.this;
            String str = this.f205211d;
            ArrayList arrayList = this.f205212e;
            int i2 = SelectRemittanceContactUI.f205202I;
            selectRemittanceContactUI.getClass();
            LaunchAAEvent launchAAEvent = new LaunchAAEvent();
            LaunchAAEvent.C67723a aVar = launchAAEvent.f193713d;
            aVar.f193715a = selectRemittanceContactUI;
            aVar.f193716b = arrayList;
            aVar.f193717c = str;
            launchAAEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$e */
    public class C70852e implements DialogInterface.OnClickListener {
        public C70852e(SelectRemittanceContactUI selectRemittanceContactUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onDialogClick() cancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$f */
    public class C70853f implements DialogInterface.OnClickListener {
        public C70853f(SelectRemittanceContactUI selectRemittanceContactUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onDialogClick()");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI$g */
    public class C70854g implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f205214a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f205215b;

        public C70854g(String str, ArrayList arrayList) {
            this.f205214a = str;
            this.f205215b = arrayList;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                SelectRemittanceContactUI selectRemittanceContactUI = SelectRemittanceContactUI.this;
                String str2 = this.f205214a;
                ArrayList arrayList = this.f205215b;
                int i2 = SelectRemittanceContactUI.f205202I;
                selectRemittanceContactUI.getClass();
                LaunchAAEvent launchAAEvent = new LaunchAAEvent();
                LaunchAAEvent.C67723a aVar = launchAAEvent.f193713d;
                aVar.f193715a = selectRemittanceContactUI;
                aVar.f193716b = arrayList;
                aVar.f193717c = str2;
                launchAAEvent.publish();
                SelectRemittanceContactUI.m83374g8(12);
                return;
            }
            SelectRemittanceContactUI.m83374g8(13);
        }
    }

    /* renamed from: g8 */
    public static void m83374g8(int i) {
        GroupPayPfClickReportStruct groupPayPfClickReportStruct = new GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f156281d = (long) i;
        groupPayPfClickReportStruct.mo86054n();
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C42872j0(this, this.f205204D, this.f205203C, this.f205208H, true);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f205203C, false, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        int i = this.f205208H;
        if (i == 1 || i == 3) {
            return new int[]{131072, 131075};
        }
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        int i = this.f205208H;
        return (i == 1 || i == 3) ? getString(C0966R.string.l8w) : getString(C0966R.string.i3a);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        int i2;
        if (i < this.f218605d.getHeaderViewsCount()) {
            Log.m105925i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", Integer.valueOf(i));
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
            Intent intent = new Intent();
            int i3 = this.f205208H;
            if (i3 == 1 || i3 == 3) {
                C74560s1.m89276e();
                intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219160a, 16384, 64, 4096, 262144));
                intent.putExtra("min_limit_num", 1);
                intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
                intent.putExtra("titile", getString(C0966R.string.l8y));
                intent.putExtra("without_openim", true);
            } else {
                int g = C74560s1.m89278g(16, 1, 2, 4, 16384);
                intent.putExtra("list_type", 0);
                intent.putExtra("list_attr", g);
                intent.putExtra("titile", getString(C0966R.string.i37));
                intent.putExtra("sub_title", getString(C0966R.string.f361616la1));
            }
            C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
            overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            return;
        }
        C75922b bVar = (C75922b) this.f218605d.getAdapter().getItem(i);
        if (bVar != null && (str = bVar.f222621r) != null) {
            if (C72996z1.m85844o5(str) || C72996z1.m85843n5(str)) {
                Log.m105925i("MicroMsg.SelectRemittanceContactUI", "username[%s] is openime || oepnimechatroom", Util.nullAs(str, "null"));
                Context context = MMApplicationContext.getContext();
                C76879j.m92711E(this, C72996z1.m85844o5(str) ? context.getString(C0966R.string.l8v) : context.getString(C0966R.string.l8u), "", getString(C0966R.string.lkg), false, new C70849b(this));
                return;
            }
            mo97517i8(bVar.f222621r);
            if (mo103379N7() instanceof C42872j0) {
                int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
                C42872j0 j0Var = (C42872j0) mo103379N7();
                j0Var.getClass();
                Log.m105919d("MicroMsg.RecentConversationAdapter", "pos: %s", Integer.valueOf(headerViewsCount));
                int i4 = j0Var.f116091o;
                if (i4 >= 0 && ((i2 = j0Var.f116092p) < 0 || (headerViewsCount > i4 && headerViewsCount < i2))) {
                    C115669n.INSTANCE.mo160131h(13721, 6, 1);
                }
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        boolean z = false;
        this.f205208H = getIntent().getIntExtra("key_from_scene", 0);
        String stringExtra = getIntent().getStringExtra("recent_remittance_contact_list");
        Log.m105926v("MicroMsg.SelectRemittanceContactUI", "recent list:" + stringExtra);
        this.f205204D = new ArrayList();
        if (!Util.isNullOrNil(stringExtra)) {
            this.f205204D = Util.stringsToList(stringExtra.split(","));
        }
        if (this.f205208H == 3) {
            z = true;
        }
        if (z) {
            this.f205206F = getIntent().getStringExtra("key_title");
            String stringExtra2 = getIntent().getStringExtra("key_include_username_list");
            this.f205205E = new ArrayList();
            if (!Util.isNullOrNil(stringExtra2)) {
                this.f205205E = Util.stringsToList(stringExtra2.split(","));
            }
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(C74560s1.m89273b());
        hashSet.addAll(C45628s0.m50776h());
        String stringExtra3 = getIntent().getStringExtra("Select_block_List");
        if (!Util.isNullOrNil(stringExtra3)) {
            hashSet.addAll(Util.stringsToList(stringExtra3.split(",")));
        }
        ArrayList arrayList = new ArrayList();
        this.f205203C = arrayList;
        arrayList.addAll(hashSet);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return true;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        super.mo66629Z7();
        hideVKB();
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
        if (this.f205207G == null) {
            View inflate = View.inflate(this, C0966R.C0971layout.bvy, (ViewGroup) null);
            this.f205207G = inflate.findViewById(C0966R.C0970id.br8);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kms);
            int i2 = this.f205208H;
            if (i2 == 1 || i2 == 3) {
                textView.setText(C0966R.string.l8p);
            } else {
                textView.setText(C0966R.string.f361196i20);
            }
            inflate.setAccessibilityDelegate(new C70850c());
            listView.addHeaderView(inflate);
        }
        View view = this.f205207G;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i8 */
    public final void mo97517i8(String str) {
        ArrayList arrayList;
        boolean z;
        Log.m105925i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
        if (!(this.f205208H == 3)) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_User", str);
            setResult(-1, intent);
            finish();
            hideVKB();
        } else if (C72996z1.m85820U5(str)) {
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.SelectRemittanceContactUI", "illegal chatroomName");
                arrayList = new ArrayList();
            } else if (!C72996z1.m85820U5(str)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(C75592q0.m90789s());
                arrayList2.add(str);
                arrayList = arrayList2;
            } else {
                try {
                    List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(str);
                    arrayList = bD;
                    if (bD == null) {
                        arrayList = new ArrayList();
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SelectRemittanceContactUI", "getChatroomMemberList error! %s", e.getMessage());
                    arrayList = new ArrayList();
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Util.isEqual((String) it.next(), C75592q0.m90789s())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                mo97520l8();
                Log.m105921e("MicroMsg.SelectRemittanceContactUI", "self no in chatroom(%s)", str);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            for (String next : this.f205205E) {
                if (arrayList.contains(next)) {
                    arrayList3.add(next);
                }
            }
            if (arrayList3.size() == 0) {
                mo97520l8();
            } else if (arrayList3.size() == this.f205205E.size()) {
                mo97518j8(str, arrayList3, this.f205206F);
            } else {
                mo97519k8(str, arrayList3, arrayList3.size());
            }
        } else if (!this.f205205E.contains(str)) {
            mo97520l8();
        } else if (this.f205205E.size() == 1) {
            String str2 = this.f205206F;
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(str);
            mo97518j8(str, arrayList4, str2);
        } else {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(str);
            mo97519k8(str, arrayList5, 1);
        }
    }

    /* renamed from: j8 */
    public void mo97518j8(String str, ArrayList<String> arrayList, String str2) {
        Log.m105924i("MicroMsg.SelectRemittanceContactUI", "showLaunchComfirmDialog()");
        if (Util.isNullOrNil(str2)) {
            str2 = getString(C0966R.string.g3z);
        }
        MMActivityController controller = getController();
        ((C78541w) C86312j.m106911c(C78541w.class)).or0(controller, str, getString(C0966R.string.f7283bh) + str2, getString(C0966R.string.f7282bg), new C70854g(str, arrayList));
        m83374g8(11);
    }

    /* renamed from: k8 */
    public final void mo97519k8(String str, ArrayList<String> arrayList, int i) {
        m83374g8(17);
        C76879j.m92709C(this, getString(C0966R.string.l8s, new Object[]{Integer.valueOf(i)}), "", getString(C0966R.string.l8r), getString(C0966R.string.f7926wf), false, new C70851d(str, arrayList), new C70852e(this));
    }

    /* renamed from: l8 */
    public final void mo97520l8() {
        m83374g8(16);
        C76879j.m92711E(this, getString(C0966R.string.l8t), "", getString(C0966R.string.lkg), false, new C70853f(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent.toString());
        } else {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = null");
        }
        boolean z = true;
        if (i != 1) {
            Log.m105920e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i);
        } else if (i2 == -1) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            if (this.f205208H != 3) {
                z = false;
            }
            if (z) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!Util.isNullOrNil(stringExtra)) {
                    mo97517i8(stringExtra);
                    return;
                }
                return;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getContentView().post(new C70848a());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            mo66629Z7();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
