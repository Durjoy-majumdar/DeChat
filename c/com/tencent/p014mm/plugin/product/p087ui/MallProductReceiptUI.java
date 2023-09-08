package com.tencent.p014mm.plugin.product.p087ui;

import af2.C0036f;
import af2.C67033e;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import te3.C51858wn3;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductReceiptUI */
public class MallProductReceiptUI extends MallBaseUI {

    /* renamed from: e */
    public C0036f f202277e = null;

    /* renamed from: f */
    public C67033e f202278f;

    /* renamed from: g */
    public AutoCompleteTextView f202279g = null;

    /* renamed from: h */
    public C70111k f202280h = null;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductReceiptUI$b */
    public class C4929b implements AdapterView.OnItemClickListener {
        public C4929b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductReceiptUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C0036f fVar = MallProductReceiptUI.this.f202277e;
            List<String> list = fVar.f43a;
            String str = (list == null || i >= ((ArrayList) list).size()) ? null : (String) ((ArrayList) fVar.f43a).get(i);
            Log.m105918d("MicroMsg.MallProductReceiptUI", "onItemClick receipt = " + str);
            if (!Util.isNullOrNil(str)) {
                MallProductReceiptUI.this.f202279g.setText(str);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductReceiptUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductReceiptUI$c */
    public class C4930c implements View.OnClickListener {
        public C4930c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C0036f fVar = MallProductReceiptUI.this.f202277e;
            ((ArrayList) fVar.f43a).clear();
            fVar.mo39a();
            MallProductReceiptUI.this.f202280h.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductReceiptUI$a */
    public class C70079a implements MenuItem.OnMenuItemClickListener {
        public C70079a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String obj = MallProductReceiptUI.this.f202279g.getText().toString();
            if (!Util.isNullOrNil(obj)) {
                C67033e eVar = MallProductReceiptUI.this.f202278f;
                eVar.getClass();
                C51858wn3 wn32 = new C51858wn3();
                eVar.f192541j = wn32;
                wn32.f144160d = Util.isNullOrNil(obj) ^ true ? 1 : 0;
                eVar.f192541j.f144161e = obj;
                MallProductReceiptUI.this.finish();
            } else {
                C76912y0.makeText((Context) MallProductReceiptUI.this, (int) C0966R.string.f361015go0, 0).show();
            }
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bo7;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f361016go1);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C70079a());
        this.f202279g = (AutoCompleteTextView) findViewById(C0966R.C0970id.gmr);
        C51858wn3 h = this.f202278f.mo91005h();
        if (h != null && !Util.isNullOrNil(h.f144161e)) {
            this.f202279g.setText(h.f144161e);
        }
        AutoCompleteTextView autoCompleteTextView = this.f202279g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        C70111k kVar = new C70111k(this);
        this.f202280h = kVar;
        this.f202279g.setAdapter(kVar);
        this.f202279g.setOnItemClickListener(new C4929b());
        View.inflate(getContext(), C0966R.C0971layout.bo4, (ViewGroup) null).setOnClickListener(new C4930c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f202277e = C79322b.vx0().xx0();
        this.f202278f = C79322b.vx0().wx0();
        initView();
    }
}
