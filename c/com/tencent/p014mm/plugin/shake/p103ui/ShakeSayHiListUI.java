package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72992v4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C97625j3;
import fd0.C75743h;
import j20.C117292a;
import java.util.ArrayList;
import jn2.C21268a;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76879j;
import p214om.C11502f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI */
public class ShakeSayHiListUI extends MMActivity {

    /* renamed from: d */
    public C72992v4 f206004d = null;

    /* renamed from: e */
    public C71188b f206005e;

    /* renamed from: f */
    public ListView f206006f;

    /* renamed from: g */
    public int f206007g = 0;

    /* renamed from: h */
    public int f206008h = 0;

    /* renamed from: i */
    public long f206009i;

    /* renamed from: j */
    public C11184p0 f206010j = new C71174a();

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$i */
    public class C5423i implements MenuItem.OnMenuItemClickListener {
        public C5423i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShakeSayHiListUI.this.hideVKB();
            ShakeSayHiListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$j */
    public class C5424j implements View.OnClickListener {
        public C5424j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = ShakeSayHiListUI.this.f206006f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$9", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$9", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$a */
    public class C71174a implements C11184p0 {
        public C71174a() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C75743h.yx0().mo101225jo(String.valueOf(ShakeSayHiListUI.this.f206009i));
            ShakeSayHiListUI.this.f206005e.mo7991f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$b */
    public class C71175b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f206012d;

        public C71175b(View view) {
            this.f206012d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ShakeSayHiListUI.this.f206007g += 8;
            Log.m105918d("MicroMsg.SayHiListUI", "dkfooter more btn:" + ShakeSayHiListUI.this.f206007g);
            ShakeSayHiListUI shakeSayHiListUI = ShakeSayHiListUI.this;
            C71188b bVar = shakeSayHiListUI.f206005e;
            int i = shakeSayHiListUI.f206007g;
            bVar.mo5580b();
            bVar.f206031p = i;
            bVar.mo1333o();
            ShakeSayHiListUI shakeSayHiListUI2 = ShakeSayHiListUI.this;
            if (shakeSayHiListUI2.f206008h <= shakeSayHiListUI2.f206007g) {
                shakeSayHiListUI2.f206006f.removeFooterView(this.f206012d);
                Log.m105918d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + ShakeSayHiListUI.this.f206007g);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$c */
    public class C71176c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$c$a */
        public class C71177a implements DialogInterface.OnClickListener {
            public C71177a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C72992v4 v4Var = ShakeSayHiListUI.this.f206004d;
                v4Var.f212830d.delete(v4Var.getTableName(), (String) null, (String[]) null);
                ShakeSayHiListUI.this.f206005e.mo1333o();
                TextView textView = (TextView) ShakeSayHiListUI.this.findViewById(C0966R.C0970id.f357933cj2);
                textView.setText(C0966R.string.iaz);
                textView.setVisibility(0);
                ShakeSayHiListUI.this.enableOptionMenu(false);
                ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                C119179t tVar = C119157j.f356862d;
                C21268a aVar = new C21268a(shakeActionReportStruct, 152);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar, 100, (String) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$c$b */
        public class C71178b implements DialogInterface.OnClickListener {
            public C71178b(C71176c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C71176c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C76879j.m92717K(ShakeSayHiListUI.this.getContext(), true, ShakeSayHiListUI.this.getString(C0966R.string.iau), "", ShakeSayHiListUI.this.getString(C0966R.string.iat), ShakeSayHiListUI.this.getString(C0966R.string.f7926wf), new C71177a(), new C71178b(this));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$d */
    public class C71179d implements MMSlideDelView.C73185e {
        public C71179d() {
        }

        /* renamed from: a */
        public int mo96224a(View view) {
            return ShakeSayHiListUI.this.f206006f.getPositionForView(view);
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$e */
    public class C71180e implements MMSlideDelView.C73188i {
        public C71180e() {
        }

        /* renamed from: a */
        public void mo96225a(View view, int i, int i2) {
            ShakeSayHiListUI.this.f206006f.performItemClick(view, i, (long) i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$f */
    public class C71181f implements MMSlideDelView.C73187h {
        public C71181f() {
        }

        /* renamed from: a */
        public void mo7896a(Object obj) {
            if (obj == null) {
                Log.m105920e("MicroMsg.SayHiListUI", "onItemDel object null");
                return;
            }
            C75743h.yx0().mo101225jo(obj.toString());
            ShakeSayHiListUI.this.f206005e.mo7991f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$g */
    public class C71182g implements AdapterView.OnItemClickListener {
        public C71182g() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C72991u4 u4Var = (C72991u4) ShakeSayHiListUI.this.f206005e.getItem(i);
            if (u4Var == null || (str = u4Var.field_content) == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C72963f4.C72971h v = C72963f4.C72971h.m85668v(str);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", v.f212737a);
            intent.putExtra("Contact_Encryptusername", v.f212760x);
            intent.putExtra("Contact_Alias", v.f212738b);
            intent.putExtra("Contact_Nick", v.f212739c);
            intent.putExtra("Contact_QuanPin", v.f212740d);
            intent.putExtra("Contact_PyInitial", v.f212741e);
            intent.putExtra("Contact_Sex", v.f212751o);
            intent.putExtra("Contact_Signature", v.f212752p);
            intent.putExtra("Contact_Scene", v.f212744h);
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_City", v.mo101036c());
            intent.putExtra("Contact_Province", v.mo101044k());
            intent.putExtra("Contact_Content", Util.isNullOrNil(u4Var.field_sayhicontent) ? ShakeSayHiListUI.this.getString(C0966R.string.b8_) : u4Var.field_sayhicontent);
            intent.putExtra("Contact_verify_Scene", v.f212744h);
            intent.putExtra("Contact_Uin", v.f212747k);
            intent.putExtra("Contact_QQNick", v.f212748l);
            intent.putExtra("Contact_Mobile_MD5", v.f212745i);
            intent.putExtra("User_From_Fmessage", true);
            intent.putExtra("Contact_from_msgType", 37);
            intent.putExtra("Verify_ticket", v.f212756t);
            intent.putExtra("Contact_ShowFMessageList", true);
            intent.putExtra("Contact_Source_FMessage", v.f212744h);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(v.f212737a);
            if (z1Var != null && ((int) z1Var.f108320R1) >= 0 && !z1Var.mo62927s3()) {
                int i2 = v.f212759w;
                if (i2 == 0 || i2 == 2 || i2 == 5) {
                    intent.putExtra("User_Verify", true);
                }
                intent.putExtra("Contact_IsLBSFriend", true);
                intent.putExtra("Sns_from_Scene", 18);
            }
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 31);
            intent.putExtra("CONTACT_INFO_UI_SUB_SOURCE", ShakeSayHiListUI.this.getIntent().getBooleanExtra("IntentNewSayHiMsg", false) ? 3101 : 3103);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, ShakeSayHiListUI.this);
            ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
            shakeActionReportStruct.f48567h = (long) (i + 1);
            shakeActionReportStruct.f48565f = shakeActionReportStruct.mo86045b("ToUsername", v.f212737a, true);
            shakeActionReportStruct.f48570k = Util.isNullOrNil(v.f212752p) ? 1 : 2;
            shakeActionReportStruct.f48568i = (long) v.f212751o;
            C119179t tVar = C119157j.f356862d;
            C21268a aVar = new C21268a(shakeActionReportStruct, 151);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(aVar, 100, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI$h */
    public class C71183h implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45082x0 f206020d;

        public C71183h(C45082x0 x0Var) {
            this.f206020d = x0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < ShakeSayHiListUI.this.f206006f.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.SayHiListUI", "on header view long click, ignore");
                return true;
            }
            C45082x0 x0Var = this.f206020d;
            ShakeSayHiListUI shakeSayHiListUI = ShakeSayHiListUI.this;
            x0Var.mo70437c(view, i, j, shakeSayHiListUI, shakeSayHiListUI.f206010j);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b5v;
    }

    public void initView() {
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f359958bu1, (ViewGroup) null);
        this.f206006f = (ListView) findViewById(C0966R.C0970id.j0y);
        inflate.setOnClickListener(new C71175b(inflate));
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C71176c());
        if (this.f206008h == 0) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            textView.setText(C0966R.string.iaz);
            textView.setVisibility(0);
            enableOptionMenu(false);
        }
        int i = this.f206008h;
        if (i > 0 && this.f206007g < i) {
            this.f206006f.addFooterView(inflate);
        }
        C71188b bVar = new C71188b(this, this.f206004d, this.f206007g);
        this.f206005e = bVar;
        bVar.f206034s = new C71179d();
        bVar.f206033r = new C71180e();
        bVar.f206035t = new C71181f();
        this.f206006f.setAdapter(bVar);
        this.f206006f.setOnItemClickListener(new C71182g());
        this.f206006f.setOnItemLongClickListener(new C71183h(new C45082x0(this)));
        setBackBtn(new C5423i());
        setToTop(new C5424j());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("IntentSayHiType", 1) == 1) {
            this.f206004d = C75743h.yx0();
            setMMTitle((int) C0966R.string.iay);
        } else {
            setMMTitle((int) C0966R.string.iaw);
        }
        int Ow = this.f206004d.mo101222Ow();
        if (Ow == 0) {
            Ow = 8;
        }
        this.f206007g = Ow;
        this.f206008h = this.f206004d.getCount();
        C72992v4 v4Var = this.f206004d;
        v4Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 4);
        if (v4Var.f212830d.update(v4Var.getTableName(), contentValues, "status!=? ", new String[]{WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}) != 0) {
            v4Var.doNotify();
        }
        initView();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f206009i = ((C72991u4) this.f206005e.getItem(adapterContextMenuInfo.position)).field_svrid;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, C0966R.string.f7944x1);
    }

    public void onDestroy() {
        this.f206005e.mo5580b();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        MMSlideDelView.C73186f fVar = this.f206005e.f206036u;
        if (fVar != null) {
            fVar.mo97957b();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f206008h != this.f206004d.getCount()) {
            int count = this.f206004d.getCount();
            this.f206008h = count;
            if (count == 0) {
                TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
                textView.setText(C0966R.string.iaz);
                textView.setVisibility(0);
                enableOptionMenu(false);
            }
            this.f206005e.mo1333o();
        }
        this.f206005e.notifyDataSetChanged();
    }
}
