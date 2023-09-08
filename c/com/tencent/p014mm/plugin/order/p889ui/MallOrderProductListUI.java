package com.tencent.p014mm.plugin.order.p889ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.order.model.ProductSectionItem;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nd2.C76852b;
import nj3.C88989a;
import ob0.C117747y;
import p755xs.C102720b;
import td2.C13874c;
import td2.C77893b;
import yq3.C79143a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderProductListUI */
public class MallOrderProductListUI extends WalletBaseUI {

    /* renamed from: d */
    public ListView f202205d;

    /* renamed from: e */
    public BaseAdapter f202206e;

    /* renamed from: f */
    public List<ProductSectionItem> f202207f = new ArrayList();

    /* renamed from: g */
    public String f202208g = "";

    /* renamed from: h */
    public String f202209h = "";

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderProductListUI$a */
    public class C70058a implements AdapterView.OnItemClickListener {
        public C70058a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ProductSectionItem productSectionItem = (ProductSectionItem) ((ArrayList) MallOrderProductListUI.this.f202207f).get(i);
            if (productSectionItem != null) {
                MallOrderProductListUI mallOrderProductListUI = MallOrderProductListUI.this;
                mallOrderProductListUI.getClass();
                if (!C13874c.m13187c(mallOrderProductListUI, productSectionItem.f202153i)) {
                    C13874c.m13186b(mallOrderProductListUI, productSectionItem.f202154j);
                }
                Boolean bool = Boolean.FALSE;
                MallOrderProductListUI mallOrderProductListUI2 = MallOrderProductListUI.this;
                C13874c.m13188d(bool, mallOrderProductListUI2.f202209h, mallOrderProductListUI2.f202208g, productSectionItem.f202149e, productSectionItem.f202154j);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderProductListUI$b */
    public class C70059b extends BaseAdapter {
        public C70059b(C70058a aVar) {
        }

        public int getCount() {
            return ((ArrayList) MallOrderProductListUI.this.f202207f).size();
        }

        public Object getItem(int i) {
            return (ProductSectionItem) ((ArrayList) MallOrderProductListUI.this.f202207f).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C70060c cVar;
            Class cls = C102720b.class;
            if (view == null) {
                view = View.inflate(MallOrderProductListUI.this, C0966R.C0971layout.baw, (ViewGroup) null);
                cVar = new C70060c(MallOrderProductListUI.this, (C70058a) null);
                cVar.f202212d = (ImageView) view.findViewById(C0966R.C0970id.fbo);
                cVar.f202214f = (TextView) view.findViewById(C0966R.C0970id.fbn);
                cVar.f202215g = (TextView) view.findViewById(C0966R.C0970id.fbk);
                cVar.f202216h = (TextView) view.findViewById(C0966R.C0970id.fbp);
                cVar.f202217i = (TextView) view.findViewById(C0966R.C0970id.fbl);
                cVar.f202218j = (TextView) view.findViewById(C0966R.C0970id.fbq);
                view.setTag(cVar);
            } else {
                cVar = (C70060c) view.getTag();
            }
            ProductSectionItem productSectionItem = (ProductSectionItem) ((ArrayList) MallOrderProductListUI.this.f202207f).get(i);
            String str = productSectionItem.f202148d;
            cVar.f202213e = str;
            if (TextUtils.isEmpty(str) || !C75228t.m90213F(cVar.f202213e)) {
                cVar.f202212d.setImageResource(C0966R.raw.mall_order_detail_frame);
            } else {
                cVar.f202212d.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C77893b(cVar.f202213e)));
            }
            cVar.f202214f.setText(productSectionItem.f202149e);
            cVar.f202215g.setText(ProductSectionItem.Skus.m82532a(productSectionItem.f202150f));
            cVar.f202216h.setText(productSectionItem.f202152h);
            TextView textView = cVar.f202217i;
            textView.setText("+" + productSectionItem.f202151g);
            ((C102720b) C86312j.m106911c(cls)).Lu0(cVar);
            cVar.f202218j.setVisibility(8);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderProductListUI$c */
    public class C70060c implements C102720b.C78973a {

        /* renamed from: d */
        public ImageView f202212d;

        /* renamed from: e */
        public String f202213e;

        /* renamed from: f */
        public TextView f202214f;

        /* renamed from: g */
        public TextView f202215g;

        /* renamed from: h */
        public TextView f202216h;

        /* renamed from: i */
        public TextView f202217i;

        /* renamed from: j */
        public TextView f202218j;

        /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderProductListUI$c$a */
        public class C70061a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f202219d;

            public C70061a(Bitmap bitmap) {
                this.f202219d = bitmap;
            }

            public void run() {
                C70060c.this.f202212d.setImageBitmap(this.f202219d);
            }
        }

        public C70060c(MallOrderProductListUI mallOrderProductListUI, C70058a aVar) {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            if (str != null && str.equals(this.f202213e)) {
                this.f202212d.post(new C70061a(bitmap));
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bav;
    }

    @Deprecated
    public void initView() {
        setMMTitle((int) C0966R.string.gno);
        Bundle input = getInput();
        ArrayList parcelableArrayList = input.getParcelableArrayList("order_product_list");
        if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
            ((ArrayList) this.f202207f).clear();
            ((ArrayList) this.f202207f).addAll(parcelableArrayList);
        }
        this.f202208g = input.getString("key_trans_id");
        this.f202209h = input.getString("appname");
        this.f202205d = (ListView) findViewById(C0966R.C0970id.hol);
        C70059b bVar = new C70059b((C70058a) null);
        this.f202206e = bVar;
        this.f202205d.setAdapter(bVar);
        this.f202206e.notifyDataSetChanged();
        this.f202205d.setOnItemClickListener(new C70058a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(0);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!(C79143a.m95768g(this) instanceof C76852b)) {
            return true;
        }
        C79143a.m95762a(this);
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
