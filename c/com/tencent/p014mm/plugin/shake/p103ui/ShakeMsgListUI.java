package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import jn2.C21268a;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76879j;
import nn2.C34935h;
import nn2.C34936i;
import nn2.C76942m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI */
public class ShakeMsgListUI extends MMActivity {

    /* renamed from: d */
    public C34936i f54049d = null;

    /* renamed from: e */
    public C19237d f54050e;

    /* renamed from: f */
    public ListView f54051f;

    /* renamed from: g */
    public TextView f54052g;

    /* renamed from: h */
    public int f54053h = 0;

    /* renamed from: i */
    public int f54054i = 0;

    /* renamed from: j */
    public int f54055j = 0;

    /* renamed from: n */
    public int f54056n;

    /* renamed from: o */
    public long f54057o;

    /* renamed from: p */
    public C11184p0 f54058p = new C19208f();

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$a */
    public class C19201a implements MenuItem.OnMenuItemClickListener {
        public C19201a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShakeMsgListUI.this.hideVKB();
            ShakeMsgListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$b */
    public class C19202b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$b$a */
        public class C19203a implements DialogInterface.OnClickListener {
            public C19203a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C34936i iVar = ShakeMsgListUI.this.f54049d;
                iVar.f93791d.delete(iVar.getTableName(), (String) null, (String[]) null);
                ShakeMsgListUI.this.f54050e.mo1333o();
                ShakeMsgListUI.this.mo24619H7();
                ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                C119179t tVar = C119157j.f356862d;
                C21268a aVar = new C21268a(shakeActionReportStruct, 202);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar, 100, (String) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$b$b */
        public class C19204b implements DialogInterface.OnClickListener {
            public C19204b(C19202b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C19202b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C76879j.m92717K(ShakeMsgListUI.this.getContext(), true, ShakeMsgListUI.this.getString(C0966R.string.j4s), "", ShakeMsgListUI.this.getString(C0966R.string.iat), ShakeMsgListUI.this.getString(C0966R.string.f7926wf), new C19203a(), new C19204b(this));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$c */
    public class C19205c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f54062d;

        public C19205c(View view) {
            this.f54062d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ShakeMsgListUI shakeMsgListUI = ShakeMsgListUI.this;
            int i = shakeMsgListUI.f54053h + 8;
            shakeMsgListUI.f54053h = i;
            C19237d dVar = shakeMsgListUI.f54050e;
            dVar.mo5580b();
            dVar.f54203q = i;
            dVar.mo1333o();
            ShakeMsgListUI shakeMsgListUI2 = ShakeMsgListUI.this;
            if (shakeMsgListUI2.f54054i <= shakeMsgListUI2.f54053h) {
                shakeMsgListUI2.f54051f.removeFooterView(this.f54062d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$d */
    public class C19206d implements AdapterView.OnItemClickListener {
        public C19206d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C34935h hVar = (C34935h) ShakeMsgListUI.this.f54050e.getItem(i);
            if (!Util.isNullOrNil(hVar.field_tag)) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(11316, ShakeMsgListUI.this.f54056n + "," + hVar.field_tag);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", hVar.field_tag);
                C88144b.m109791i(ShakeMsgListUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                C119179t tVar = C119157j.f356862d;
                C21268a aVar = new C21268a(shakeActionReportStruct, 201);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar, 100, (String) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$e */
    public class C19207e implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45082x0 f54065d;

        public C19207e(C45082x0 x0Var) {
            this.f54065d = x0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < ShakeMsgListUI.this.f54051f.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.ShakeMsgListUI", "on header view long click, ignore");
                return true;
            }
            this.f54065d.mo70437c(view, i, j, ShakeMsgListUI.this.getContext(), ShakeMsgListUI.this.f54058p);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI$f */
    public class C19208f implements C11184p0 {
        public C19208f() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            ShakeMsgListUI shakeMsgListUI = ShakeMsgListUI.this;
            C34936i iVar = shakeMsgListUI.f54049d;
            String valueOf = String.valueOf(shakeMsgListUI.f54057o);
            iVar.getClass();
            int delete = iVar.f93791d.delete(iVar.getTableName(), "svrid = '" + valueOf + "'", (String[]) null);
            StringBuilder sb = new StringBuilder();
            sb.append("delBySvrId = ");
            sb.append(delete);
            Log.m105924i("MicroMsg.ShakeMessageStorage", sb.toString());
            ShakeMsgListUI.this.f54050e.mo7991f();
        }
    }

    /* renamed from: H7 */
    public final void mo24619H7() {
        this.f54052g.setText(C0966R.string.j4t);
        this.f54052g.setVisibility(0);
        enableOptionMenu(false);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.byi;
    }

    public void initView() {
        setMMTitle(getIntent().getStringExtra("shake_msg_list_title"));
        setBackBtn(new C19201a());
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C19202b());
        this.f54052g = (TextView) findViewById(C0966R.C0970id.f357933cj2);
        if (this.f54054i == 0) {
            mo24619H7();
        }
        this.f54051f = (ListView) findViewById(C0966R.C0970id.jg5);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f359958bu1, (ViewGroup) null);
        inflate.setOnClickListener(new C19205c(inflate));
        int i = this.f54054i;
        if (i > 0 && this.f54053h < i) {
            this.f54051f.addFooterView(inflate);
        }
        C19237d dVar = new C19237d(this);
        this.f54050e = dVar;
        dVar.f54203q = this.f54053h;
        this.f54051f.setAdapter(dVar);
        this.f54051f.setOnItemClickListener(new C19206d());
        this.f54051f.setOnItemLongClickListener(new C19207e(new C45082x0(this)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("shake_msg_type", 0);
        C34936i Ax0 = C76942m.Ax0();
        this.f54049d = Ax0;
        int jo = Ax0.mo59792jo();
        this.f54055j = jo;
        if (jo == 0) {
            jo = 8;
        }
        this.f54053h = jo;
        this.f54054i = this.f54049d.getCount();
        int intExtra = getIntent().getIntExtra("shake_msg_from", 1);
        this.f54056n = intExtra;
        if (intExtra == 1) {
            C115669n.INSTANCE.mo160131h(11313, Integer.valueOf(this.f54055j), C19239e.m20383a());
        } else {
            C115669n.INSTANCE.mo160131h(11315, Integer.valueOf(this.f54055j), C19239e.m20383a());
        }
        C34936i iVar = this.f54049d;
        iVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 1);
        iVar.f93791d.update(iVar.getTableName(), contentValues, "status!=? ", new String[]{"1"});
        initView();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f54057o = ((C34935h) this.f54050e.getItem(adapterContextMenuInfo.position)).field_svrid;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, C0966R.string.f7944x1);
    }

    public void onDestroy() {
        this.f54050e.mo5580b();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        if (this.f54054i != this.f54049d.getCount()) {
            int count = this.f54049d.getCount();
            this.f54054i = count;
            if (count == 0) {
                mo24619H7();
            }
            this.f54050e.mo1333o();
        }
        this.f54050e.notifyDataSetChanged();
    }
}
