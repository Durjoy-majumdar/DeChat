package com.tencent.p014mm.plugin.scanner.history.p1075ui;

import a70.C112760b;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.plugin.scanner.model.C94481y;
import com.tencent.p014mm.plugin.scanner.p101ui.ProductUI;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fl2.C32073a;
import gc0.C20828a;
import gl2.C98163a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p823sg.C90193h;
import vl2.C102216y;

/* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI */
public class ScannerHistoryUI extends MMActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f273123i = 0;

    /* renamed from: d */
    public ListView f273124d;

    /* renamed from: e */
    public View f273125e;

    /* renamed from: f */
    public C94462e f273126f;

    /* renamed from: g */
    public LinearLayout f273127g;

    /* renamed from: h */
    public View f273128h;

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$a */
    public class C94458a implements MenuItem.OnMenuItemClickListener {
        public C94458a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ScannerHistoryUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$b */
    public class C94459b implements AdapterView.OnItemClickListener {
        public C94459b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i == 0) {
                Log.m105926v("MicroMsg.ScannerHistoryUI", "onItemClick pos is 0, click headerview");
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (i > 0) {
                i--;
            }
            ScannerHistoryUI scannerHistoryUI = ScannerHistoryUI.this;
            C32073a aVar = (C32073a) scannerHistoryUI.f273126f.getItem(i);
            if (aVar != null) {
                Intent intent = new Intent();
                intent.setClass(scannerHistoryUI, ProductUI.class);
                intent.setFlags(65536);
                intent.putExtra("key_Product_xml", aVar.field_xmlContent);
                intent.putExtra("key_Product_funcType", aVar.field_funcType);
                intent.putExtra("key_Qrcode_Url", aVar.field_qrcodeUrl);
                intent.putExtra("key_need_add_to_history", false);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(scannerHistoryUI, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                scannerHistoryUI.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(scannerHistoryUI, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(12684, 0, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$c */
    public class C94460c implements AdapterView.OnItemLongClickListener {
        public C94460c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                Log.m105924i("MicroMsg.ScannerHistoryUI", "onItemLongClick pos is 0");
                return true;
            }
            if (i > 0) {
                i--;
            }
            if (i >= ScannerHistoryUI.this.f273126f.getCount()) {
                return true;
            }
            ScannerHistoryUI scannerHistoryUI = ScannerHistoryUI.this;
            C76879j.m92736g(scannerHistoryUI, scannerHistoryUI.getResources().getString(C0966R.string.f360226b01), (String[]) null, scannerHistoryUI.getResources().getString(C0966R.string.f7944x1), new C94464a(scannerHistoryUI, i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$d */
    public class C94461d implements MenuItem.OnMenuItemClickListener {
        public C94461d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ScannerHistoryUI scannerHistoryUI = ScannerHistoryUI.this;
            int i = ScannerHistoryUI.f273123i;
            C76879j.m92717K(scannerHistoryUI, true, scannerHistoryUI.getString(C0966R.string.icd), "", scannerHistoryUI.getString(C0966R.string.a18), scannerHistoryUI.getString(C0966R.string.f7926wf), new C94465b(scannerHistoryUI), new C98163a(scannerHistoryUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$e */
    public class C94462e extends C6975i1<C32073a> {
        public C94462e() {
            super(ScannerHistoryUI.this, new C32073a());
            mo7997q(true);
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C32073a aVar = (C32073a) obj;
            if (aVar == null) {
                aVar = new C32073a();
            }
            aVar.convertFrom(cursor);
            return aVar;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C94463f fVar;
            String str;
            C32073a aVar = (C32073a) getItem(i);
            if (view == null) {
                view = View.inflate(ScannerHistoryUI.this.getContext(), C0966R.C0971layout.bu9, (ViewGroup) null);
                fVar = new C94463f(ScannerHistoryUI.this, (C94458a) null);
                fVar.f273134a = (ImageView) view.findViewById(C0966R.C0970id.fak);
                fVar.f273135b = (TextView) view.findViewById(C0966R.C0970id.f358474fc2);
                fVar.f273136c = (TextView) view.findViewById(C0966R.C0970id.f358472fc0);
                fVar.f273137d = (TextView) view.findViewById(C0966R.C0970id.faa);
                view.setTag(fVar);
            } else {
                fVar = (C94463f) view.getTag();
            }
            C102216y.C102217a b = C94481y.m119505b(aVar.field_xmlContent, aVar.field_funcType);
            fVar.f273135b.setText(b.field_title);
            fVar.f273136c.setText(C72715f.m85112e(ScannerHistoryUI.this, aVar.field_ScanTime, true));
            fVar.f273137d.setText(b.field_subtitle);
            int dimensionPixelSize = ScannerHistoryUI.this.getResources().getDimensionPixelSize(C0966R.dimen.als);
            fVar.f273134a.setImageResource(C0966R.C0969drawable.c_d);
            Log.m105918d("MicroMsg.ScannerHistoryUI", "ScannerHistoryUI getView () position : " + i + " logo_url :  " + b.field_thumburl);
            if (!TextUtils.isEmpty(b.field_thumburl)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                C71030z vx02 = C71030z.vx0();
                String str2 = b.field_thumburl;
                vx02.getClass();
                if (C86709a0.m107522a()) {
                    str = String.format("%s/scanbook_%s", new Object[]{vx02.f205574d + "image/scan/img", C90193h.m112878f(str2.getBytes())});
                } else {
                    str = "";
                }
                bVar.f59350f = str;
                bVar.f59346b = true;
                bVar.f59364t = false;
                bVar.f59345a = true;
                bVar.f59355k = dimensionPixelSize;
                bVar.f59354j = dimensionPixelSize;
                bVar.f59359o = C0966R.C0969drawable.c_d;
                C20828a.m22825b().mo32519h(b.field_thumburl, fVar.f273134a, bVar.mo32666a());
            } else {
                fVar.f273134a.setImageResource(C0966R.C0969drawable.c_d);
            }
            return view;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            mo7998r(C71030z.vx0().wx0().getAll());
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI$f */
    public class C94463f {

        /* renamed from: a */
        public ImageView f273134a;

        /* renamed from: b */
        public TextView f273135b;

        /* renamed from: c */
        public TextView f273136c;

        /* renamed from: d */
        public TextView f273137d;

        public C94463f(ScannerHistoryUI scannerHistoryUI, C94458a aVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo129941H7() {
        if (C71030z.vx0().wx0().getCount() > 0) {
            this.f273124d.setVisibility(0);
            View view = this.f273125e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f273128h;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        } else {
            this.f273124d.setVisibility(8);
            View view5 = this.f273125e;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f273128h;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        }
        this.f273126f.notifyDataSetChanged();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bub;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ice);
        setBackBtn(new C94458a());
        this.f273124d = (ListView) findViewById(C0966R.C0970id.j1c);
        LinearLayout linearLayout = (LinearLayout) View.inflate(getBaseContext(), C0966R.C0971layout.bua, (ViewGroup) null);
        this.f273127g = linearLayout;
        this.f273124d.addHeaderView(linearLayout);
        C94462e eVar = new C94462e();
        this.f273126f = eVar;
        this.f273124d.setAdapter(eVar);
        this.f273124d.setOnItemClickListener(new C94459b());
        this.f273124d.setOnItemLongClickListener(new C94460c());
        addTextOptionMenu(0, getString(C0966R.string.aw9), new C94461d());
        this.f273125e = findViewById(C0966R.C0970id.bs9);
        View inflate = View.inflate(this, C0966R.C0971layout.bu_, (ViewGroup) null);
        this.f273128h = inflate;
        LinearLayout linearLayout2 = this.f273127g;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((TextView) this.f273128h.findViewById(C0966R.C0970id.ewj)).setText(C0966R.string.fjw);
        mo129941H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }
}
