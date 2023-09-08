package com.tencent.p014mm.plugin.order.p889ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.order.model.C70050a;
import com.tencent.p014mm.plugin.order.model.C70051b;
import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.plugin.order.model.ProductSectionItem;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nd2.C76852b;
import nd2.C76853c;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p755xs.C102720b;
import p996kj.C88155a;
import pd2.C47462d;
import pd2.C77082f;
import rd2.C77510a;
import rd2.C77511b;
import rd2.C77512c;
import rd2.C77514e;
import rd2.C77515f;
import td2.C13874c;
import td2.C77893b;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI */
public class MallOrderDetailInfoUI extends WalletBaseUI implements C102720b.C78973a {

    /* renamed from: B */
    public static final /* synthetic */ int f202176B = 0;

    /* renamed from: A */
    public View.OnClickListener f202177A = new C70055b();

    /* renamed from: d */
    public String f202178d;

    /* renamed from: e */
    public List<MallOrderDetailObject.C70045a> f202179e = new ArrayList();

    /* renamed from: f */
    public ListView f202180f;

    /* renamed from: g */
    public C70056c f202181g;

    /* renamed from: h */
    public MallOrderDetailObject f202182h = null;

    /* renamed from: i */
    public View f202183i;

    /* renamed from: j */
    public View f202184j;

    /* renamed from: n */
    public View f202185n;

    /* renamed from: o */
    public View f202186o;

    /* renamed from: p */
    public View f202187p;

    /* renamed from: q */
    public View f202188q;

    /* renamed from: r */
    public View f202189r;

    /* renamed from: s */
    public HashMap<String, View> f202190s = new HashMap<>();

    /* renamed from: t */
    public boolean f202191t = false;

    /* renamed from: u */
    public String f202192u = "";

    /* renamed from: v */
    public boolean f202193v = false;

    /* renamed from: w */
    public int f202194w = 0;

    /* renamed from: x */
    public CheckedTextView f202195x;

    /* renamed from: y */
    public CheckedTextView f202196y;

    /* renamed from: z */
    public View.OnClickListener f202197z = new C70054a();

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI$a */
    public class C70054a implements View.OnClickListener {
        public C70054a() {
        }

        public void onClick(View view) {
            boolean z;
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f358890ho3) {
                MallOrderDetailInfoUI mallOrderDetailInfoUI = MallOrderDetailInfoUI.this;
                MallOrderDetailObject.C70046b bVar = mallOrderDetailInfoUI.f202182h.f202073b;
                if (bVar != null) {
                    C13874c.m13187c(mallOrderDetailInfoUI, bVar.f202092d);
                    MallOrderDetailInfoUI mallOrderDetailInfoUI2 = MallOrderDetailInfoUI.this;
                    MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI2, mallOrderDetailInfoUI2.f202182h.f202073b.f202089a);
                }
            } else if (view.getId() == C0966R.C0970id.hog || view.getId() == C0966R.C0970id.hof) {
                ArrayList<ProductSectionItem> arrayList2 = MallOrderDetailInfoUI.this.f202182h.f202074c;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    if (!TextUtils.isEmpty(MallOrderDetailInfoUI.this.f202182h.f202074c.get(0).f202153i)) {
                        MallOrderDetailInfoUI mallOrderDetailInfoUI3 = MallOrderDetailInfoUI.this;
                        z = C13874c.m13187c(mallOrderDetailInfoUI3, mallOrderDetailInfoUI3.f202182h.f202074c.get(0).f202153i);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        MallOrderDetailInfoUI mallOrderDetailInfoUI4 = MallOrderDetailInfoUI.this;
                        C13874c.m13186b(mallOrderDetailInfoUI4, mallOrderDetailInfoUI4.f202182h.f202074c.get(0).f202154j);
                    }
                    MallOrderDetailInfoUI mallOrderDetailInfoUI5 = MallOrderDetailInfoUI.this;
                    MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI5, mallOrderDetailInfoUI5.f202182h.f202074c.get(0).f202149e);
                }
            } else if (view.getId() == C0966R.C0970id.hoe) {
                Bundle input = MallOrderDetailInfoUI.this.getInput();
                input.putParcelableArrayList("order_product_list", MallOrderDetailInfoUI.this.f202182h.f202074c);
                input.putInt("key_enter_id", 0);
                input.putString("key_trans_id", MallOrderDetailInfoUI.this.f202192u);
                input.putString("appname", MallOrderDetailInfoUI.this.f202182h.f202079h);
                C79143a.m95765d(MallOrderDetailInfoUI.this, new Bundle());
                MallOrderDetailInfoUI mallOrderDetailInfoUI6 = MallOrderDetailInfoUI.this;
                MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI6, mallOrderDetailInfoUI6.getResources().getString(C0966R.string.gno));
            } else if (view.getId() == C0966R.C0970id.hou) {
                String string = MallOrderDetailInfoUI.this.getInput().getString("key_trans_id");
                Bundle input2 = MallOrderDetailInfoUI.this.getInput();
                input2.putString("key_trans_id", string);
                input2.putInt("key_enter_id", 1);
                MallOrderDetailObject mallOrderDetailObject = MallOrderDetailInfoUI.this.f202182h;
                if (mallOrderDetailObject != null) {
                    input2.putParcelable("transaction_data", mallOrderDetailObject.f202072a);
                }
                C79143a.m95765d(MallOrderDetailInfoUI.this, input2);
                MallOrderDetailInfoUI mallOrderDetailInfoUI7 = MallOrderDetailInfoUI.this;
                MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI7, mallOrderDetailInfoUI7.getResources().getString(C0966R.string.gnl));
            } else if (view.getId() == C0966R.C0970id.hny) {
                MallOrderDetailInfoUI mallOrderDetailInfoUI8 = MallOrderDetailInfoUI.this;
                int i = MallOrderDetailInfoUI.f202176B;
                C76879j.m92707A(mallOrderDetailInfoUI8, "商家已退全款，总价125元，包含商品价格115元，邮费10元，请确认是否同意通过该处理结果。", mallOrderDetailInfoUI8.getString(C0966R.string.gn_), mallOrderDetailInfoUI8.getString(C0966R.string.gnp), mallOrderDetailInfoUI8.getString(C0966R.string.gnq), new C77510a(mallOrderDetailInfoUI8), new C77511b(mallOrderDetailInfoUI8));
            } else if (view.getId() == C0966R.C0970id.f358403ex2) {
                MallOrderDetailInfoUI mallOrderDetailInfoUI9 = MallOrderDetailInfoUI.this;
                MallOrderDetailObject mallOrderDetailObject2 = mallOrderDetailInfoUI9.f202182h;
                if (!(mallOrderDetailObject2 == null || (str = mallOrderDetailObject2.f202078g) == null)) {
                    mallOrderDetailInfoUI9.f202178d = str;
                    if (!TextUtils.isEmpty(str)) {
                        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + mallOrderDetailInfoUI9.f202178d));
                        intent.addFlags(268435456);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        MallOrderDetailInfoUI mallOrderDetailInfoUI10 = mallOrderDetailInfoUI9;
                        C117292a.m165358d(mallOrderDetailInfoUI10, aVar.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mallOrderDetailInfoUI9.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(mallOrderDetailInfoUI10, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    MallOrderDetailInfoUI mallOrderDetailInfoUI11 = MallOrderDetailInfoUI.this;
                    MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI11, mallOrderDetailInfoUI11.getResources().getString(C0966R.string.gnj));
                }
            } else if (view.getId() == C0966R.C0970id.f359611lu2) {
                MallOrderDetailInfoUI mallOrderDetailInfoUI12 = MallOrderDetailInfoUI.this;
                C75228t.m90226S(mallOrderDetailInfoUI12, mallOrderDetailInfoUI12.f202182h.f202079h);
                MallOrderDetailInfoUI mallOrderDetailInfoUI13 = MallOrderDetailInfoUI.this;
                MallOrderDetailInfoUI.m82536H7(mallOrderDetailInfoUI13, mallOrderDetailInfoUI13.getResources().getString(C0966R.string.gnu));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI$b */
    public class C70055b implements View.OnClickListener {
        public C70055b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallOrderDetailInfoUI mallOrderDetailInfoUI = MallOrderDetailInfoUI.this;
            if (!(mallOrderDetailInfoUI.f202195x == null || mallOrderDetailInfoUI.f202196y == null)) {
                if (view.getId() == C0966R.C0970id.hnu) {
                    MallOrderDetailInfoUI.this.f202195x.setSelected(true);
                    MallOrderDetailInfoUI.this.f202196y.setSelected(false);
                    MallOrderDetailInfoUI.this.f202194w = 100;
                } else {
                    MallOrderDetailInfoUI.this.f202195x.setSelected(false);
                    MallOrderDetailInfoUI.this.f202196y.setSelected(true);
                    MallOrderDetailInfoUI.this.f202194w = -100;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI$c */
    public class C70056c extends BaseAdapter {
        public C70056c(C70054a aVar) {
        }

        /* renamed from: a */
        public MallOrderDetailObject.C70045a getItem(int i) {
            return (MallOrderDetailObject.C70045a) ((ArrayList) MallOrderDetailInfoUI.this.f202179e).get(i);
        }

        public int getCount() {
            return ((ArrayList) MallOrderDetailInfoUI.this.f202179e).size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return getItem(i).f202088e;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C70057d dVar;
            MallOrderDetailObject.C70045a a = getItem(i);
            int i2 = a.f202088e;
            if (i2 == 1) {
                View inflate = View.inflate(MallOrderDetailInfoUI.this, C0966R.C0971layout.bae, (ViewGroup) null);
                View findViewById = inflate.findViewById(C0966R.C0970id.hnr);
                MallOrderDetailInfoUI.this.f202195x = (CheckedTextView) inflate.findViewById(C0966R.C0970id.hnu);
                MallOrderDetailInfoUI.this.f202196y = (CheckedTextView) inflate.findViewById(C0966R.C0970id.hnq);
                MallOrderDetailInfoUI mallOrderDetailInfoUI = MallOrderDetailInfoUI.this;
                mallOrderDetailInfoUI.f202195x.setOnClickListener(mallOrderDetailInfoUI.f202177A);
                MallOrderDetailInfoUI mallOrderDetailInfoUI2 = MallOrderDetailInfoUI.this;
                mallOrderDetailInfoUI2.f202196y.setOnClickListener(mallOrderDetailInfoUI2.f202177A);
                int i3 = i + 1;
                if (i3 < getCount()) {
                    MallOrderDetailInfoUI.this.mo96397L7(findViewById, getItem(i3));
                }
                return inflate;
            } else if (i2 != 2) {
                if (view == null) {
                    view = View.inflate(MallOrderDetailInfoUI.this, C0966R.C0971layout.bac, (ViewGroup) null);
                    dVar = new C70057d(MallOrderDetailInfoUI.this, (C70054a) null);
                    dVar.f202201a = (TextView) view.findViewById(C0966R.C0970id.hnw);
                    dVar.f202202b = (TextView) view.findViewById(C0966R.C0970id.hnv);
                    dVar.f202203c = (TextView) view.findViewById(C0966R.C0970id.hnt);
                    dVar.f202204d = view.findViewById(C0966R.C0970id.hnr);
                    view.setTag(dVar);
                } else {
                    dVar = (C70057d) view.getTag();
                }
                dVar.f202201a.setText(a.f202084a);
                if (TextUtils.isEmpty(a.f202085b)) {
                    dVar.f202202b.setVisibility(4);
                } else {
                    dVar.f202202b.setVisibility(0);
                    dVar.f202202b.setText(a.f202085b);
                }
                if (a.f202087d) {
                    dVar.f202203c.setVisibility(0);
                } else {
                    dVar.f202203c.setVisibility(8);
                }
                int i4 = i + 1;
                if (i4 < getCount()) {
                    MallOrderDetailInfoUI.this.mo96397L7(dVar.f202204d, getItem(i4));
                }
                return view;
            } else {
                View inflate2 = View.inflate(MallOrderDetailInfoUI.this, C0966R.C0971layout.bad, (ViewGroup) null);
                TextView textView = (TextView) inflate2.findViewById(C0966R.C0970id.hnq);
                View findViewById2 = inflate2.findViewById(C0966R.C0970id.hnr);
                if (Util.getInt(a.f202085b, 0) >= 0) {
                    textView.setText(C0966R.string.gne);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0966R.raw.mall_order_detail_good, 0);
                } else {
                    textView.setText(C0966R.string.gnd);
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0966R.raw.mall_order_detail_bad, 0);
                }
                int i5 = i + 1;
                if (i5 < getCount()) {
                    MallOrderDetailInfoUI.this.mo96397L7(findViewById2, getItem(i5));
                }
                return inflate2;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI$d */
    public class C70057d {

        /* renamed from: a */
        public TextView f202201a;

        /* renamed from: b */
        public TextView f202202b;

        /* renamed from: c */
        public TextView f202203c;

        /* renamed from: d */
        public View f202204d;

        public C70057d(MallOrderDetailInfoUI mallOrderDetailInfoUI, C70054a aVar) {
        }
    }

    /* renamed from: H7 */
    public static void m82536H7(MallOrderDetailInfoUI mallOrderDetailInfoUI, String str) {
        C13874c.m13188d(Boolean.valueOf(mallOrderDetailInfoUI.f202191t), mallOrderDetailInfoUI.f202182h.f202079h, mallOrderDetailInfoUI.f202192u, str, "");
    }

    /* renamed from: I7 */
    public final void mo96394I7() {
        if (!this.f202193v && this.f202194w != 0) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C47462d(this.f202192u, "", this.f202194w));
            this.f202193v = true;
        }
    }

    /* renamed from: J7 */
    public void mo96395J7() {
        List<MallOrderDetailObject.C70045a> list;
        if (this.f202182h != null) {
            ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
            this.f202190s.clear();
            MallOrderDetailObject.C70046b bVar = this.f202182h.f202073b;
            if (bVar != null) {
                String str = bVar.f202089a;
                if (!TextUtils.isEmpty(bVar.f202093e)) {
                    str = str + "：" + bVar.f202093e;
                }
                if (!this.f202191t) {
                    View view = this.f202184j;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f202183i;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TextView) this.f202183i.findViewById(C0966R.C0970id.ho5)).setText(str);
                    ((TextView) this.f202183i.findViewById(C0966R.C0970id.ho4)).setText(C75228t.m90262o(this.f202182h.f202080i));
                    if (TextUtils.isEmpty(bVar.f202091c) || !C75228t.m90213F(bVar.f202091c)) {
                        ImageView imageView = (ImageView) this.f202183i.findViewById(C0966R.C0970id.hod);
                        Bitmap decodeResource = C88155a.decodeResource(getResources(), C0966R.raw.mall_order_trade_state_icon, (BitmapFactory.Options) null);
                        if (decodeResource != null) {
                            imageView.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(decodeResource, false, 96.0f));
                        }
                    } else {
                        mo96396K7((ImageView) this.f202183i.findViewById(C0966R.C0970id.hod), bVar.f202091c);
                    }
                } else {
                    View view5 = this.f202183i;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view7 = this.f202184j;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TextView) this.f202184j.findViewById(C0966R.C0970id.ho5)).setText(str);
                    ((TextView) this.f202184j.findViewById(C0966R.C0970id.ho4)).setText(C75228t.m90262o(this.f202182h.f202080i));
                    if (TextUtils.isEmpty(bVar.f202091c) || !C75228t.m90213F(bVar.f202091c)) {
                        ImageView imageView2 = (ImageView) this.f202184j.findViewById(C0966R.C0970id.hod);
                        Bitmap decodeResource2 = C88155a.decodeResource(getResources(), C0966R.raw.mall_order_trade_state_icon, (BitmapFactory.Options) null);
                        if (decodeResource2 != null) {
                            imageView2.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(decodeResource2, false, 96.0f));
                        }
                    } else {
                        mo96396K7((ImageView) this.f202184j.findViewById(C0966R.C0970id.hod), bVar.f202091c);
                    }
                }
            } else {
                View view9 = this.f202183i;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = this.f202184j;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshStatusUI", "(Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$StatusSection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ArrayList<ProductSectionItem> arrayList = this.f202182h.f202074c;
            if (arrayList == null || arrayList.size() == 0) {
                View view13 = this.f202187p;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view15 = this.f202188q;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view17 = this.f202189r;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(8);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (arrayList.size() == 1) {
                View view19 = this.f202189r;
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(8);
                View view20 = view19;
                C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view20, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ProductSectionItem productSectionItem = arrayList.get(0);
                if (!TextUtils.isEmpty(productSectionItem.f202148d)) {
                    View view21 = this.f202187p;
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(8);
                    View view22 = view21;
                    C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view22, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view23 = this.f202188q;
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(0);
                    View view24 = view23;
                    C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view24, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TextView) this.f202188q.findViewById(C0966R.C0970id.fbn)).setText(productSectionItem.f202149e);
                    ((TextView) this.f202188q.findViewById(C0966R.C0970id.fbp)).setText(productSectionItem.f202152h);
                    ((TextView) this.f202188q.findViewById(C0966R.C0970id.fbl)).setText("+" + productSectionItem.f202151g);
                    ((TextView) this.f202188q.findViewById(C0966R.C0970id.fbk)).setText(ProductSectionItem.Skus.m82532a(productSectionItem.f202150f));
                    if (!TextUtils.isEmpty(productSectionItem.f202148d)) {
                        mo96396K7((ImageView) this.f202188q.findViewById(C0966R.C0970id.fbo), productSectionItem.f202148d);
                    }
                } else {
                    View view25 = this.f202188q;
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(8);
                    View view26 = view25;
                    C117292a.m165358d(view26, aVar13.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view25.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view26, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view27 = this.f202187p;
                    C9556a aVar14 = new C9556a();
                    aVar14.mo10233c(0);
                    View view28 = view27;
                    C117292a.m165358d(view28, aVar14.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view27.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view28, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TextView) this.f202187p.findViewById(C0966R.C0970id.fbn)).setText(productSectionItem.f202149e);
                    if (TextUtils.isEmpty(productSectionItem.f202153i)) {
                        Rect rect = new Rect();
                        rect.set(this.f202187p.findViewById(C0966R.C0970id.fbm).getPaddingLeft(), this.f202187p.findViewById(C0966R.C0970id.fbm).getPaddingTop(), this.f202187p.findViewById(C0966R.C0970id.fbm).getPaddingRight(), this.f202187p.findViewById(C0966R.C0970id.fbm).getPaddingBottom());
                        this.f202187p.findViewById(C0966R.C0970id.fbm).setBackgroundResource(C0966R.C0969drawable.bcr);
                        this.f202187p.findViewById(C0966R.C0970id.fbm).setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    } else {
                        ((TextView) this.f202187p.findViewById(C0966R.C0970id.fbn)).setTextColor(getResources().getColor(C0966R.color.a3u));
                    }
                }
            } else {
                View view29 = this.f202187p;
                C9556a aVar15 = new C9556a();
                aVar15.mo10233c(8);
                C117292a.m165358d(view29, aVar15.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view29.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                C117292a.m165359e(view29, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view30 = this.f202188q;
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(8);
                View view31 = view30;
                C117292a.m165358d(view31, aVar16.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view30.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                C117292a.m165359e(view31, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view32 = this.f202189r;
                C9556a aVar17 = new C9556a();
                aVar17.mo10233c(0);
                View view33 = view32;
                C117292a.m165358d(view33, aVar17.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view32.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                C117292a.m165359e(view33, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (arrayList.size() == 2) {
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoh), arrayList.get(0));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoi), arrayList.get(1));
                    View findViewById = this.f202189r.findViewById(C0966R.C0970id.hoj);
                    C9556a aVar18 = new C9556a();
                    aVar18.mo10233c(8);
                    View view34 = findViewById;
                    C117292a.m165358d(view34, aVar18.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                    C117292a.m165359e(view34, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById2 = this.f202189r.findViewById(C0966R.C0970id.hok);
                    C9556a aVar19 = new C9556a();
                    aVar19.mo10233c(8);
                    View view35 = findViewById2;
                    C117292a.m165358d(view35, aVar19.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                    C117292a.m165359e(view35, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (arrayList.size() == 3) {
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoh), arrayList.get(0));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoi), arrayList.get(1));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoj), arrayList.get(2));
                    View findViewById3 = this.f202189r.findViewById(C0966R.C0970id.hok);
                    C9556a aVar20 = new C9556a();
                    aVar20.mo10233c(8);
                    View view36 = findViewById3;
                    C117292a.m165358d(view36, aVar20.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
                    C117292a.m165359e(view36, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshProductUI", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (arrayList.size() >= 4) {
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoh), arrayList.get(0));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoi), arrayList.get(1));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hoj), arrayList.get(2));
                    mo96398M7(this.f202189r.findViewById(C0966R.C0970id.hok), arrayList.get(3));
                }
            }
            MallTransactionObject mallTransactionObject = this.f202182h.f202072a;
            if (mallTransactionObject != null) {
                View view37 = this.f202185n;
                C9556a aVar21 = new C9556a();
                aVar21.mo10233c(0);
                View view38 = view37;
                C117292a.m165358d(view38, aVar21.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view37.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
                C117292a.m165359e(view38, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) findViewById(C0966R.C0970id.hov)).setText(C75228t.m90258m(mallTransactionObject.f202136q, mallTransactionObject.f202095B));
                MallOrderDetailObject mallOrderDetailObject = this.f202182h;
                if (!(mallOrderDetailObject == null || (list = mallOrderDetailObject.f202075d) == null || ((ArrayList) list).size() < 1)) {
                    mo96397L7(this.f202186o, (MallOrderDetailObject.C70045a) ((ArrayList) this.f202182h.f202075d).get(0));
                }
            } else {
                View view39 = this.f202185n;
                C9556a aVar22 = new C9556a();
                aVar22.mo10233c(8);
                View view40 = view39;
                C117292a.m165358d(view40, aVar22.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view39.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                C117292a.m165359e(view40, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshTransactionUI", "(Lcom/tencent/mm/plugin/order/model/MallTransactionObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            List<MallOrderDetailObject.C70045a> list2 = this.f202182h.f202075d;
            if (list2 != null) {
                ((ArrayList) this.f202179e).addAll(list2);
                this.f202181g.notifyDataSetChanged();
            }
            View findViewById4 = findViewById(C0966R.C0970id.gm7);
            C9556a aVar23 = new C9556a();
            aVar23.mo10233c(0);
            View view41 = findViewById4;
            C117292a.m165358d(view41, aVar23.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar23.mo10231a(0)).intValue());
            C117292a.m165359e(view41, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MallOrderDetailObject mallOrderDetailObject2 = this.f202182h;
            if (mallOrderDetailObject2 == null || !TextUtils.isEmpty(mallOrderDetailObject2.f202078g) || !TextUtils.isEmpty(this.f202182h.f202079h)) {
                MallOrderDetailObject mallOrderDetailObject3 = this.f202182h;
                if (mallOrderDetailObject3 == null || TextUtils.isEmpty(mallOrderDetailObject3.f202078g) || !TextUtils.isEmpty(this.f202182h.f202079h)) {
                    MallOrderDetailObject mallOrderDetailObject4 = this.f202182h;
                    if (mallOrderDetailObject4 != null && TextUtils.isEmpty(mallOrderDetailObject4.f202078g) && !TextUtils.isEmpty(this.f202182h.f202079h)) {
                        View findViewById5 = findViewById(C0966R.C0970id.f358403ex2);
                        C9556a aVar24 = new C9556a();
                        aVar24.mo10233c(8);
                        View view42 = findViewById5;
                        C117292a.m165358d(view42, aVar24.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById5.setVisibility(((Integer) aVar24.mo10231a(0)).intValue());
                        C117292a.m165359e(view42, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View findViewById6 = findViewById(C0966R.C0970id.f359610lu1);
                        C9556a aVar25 = new C9556a();
                        aVar25.mo10233c(8);
                        View view43 = findViewById6;
                        C117292a.m165358d(view43, aVar25.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById6.setVisibility(((Integer) aVar25.mo10231a(0)).intValue());
                        C117292a.m165359e(view43, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        TextView textView = (TextView) findViewById(C0966R.C0970id.f359611lu2);
                        textView.setVisibility(0);
                        textView.setGravity(3);
                    }
                } else {
                    View findViewById7 = findViewById(C0966R.C0970id.f359611lu2);
                    C9556a aVar26 = new C9556a();
                    aVar26.mo10233c(8);
                    View view44 = findViewById7;
                    C117292a.m165358d(view44, aVar26.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((Integer) aVar26.mo10231a(0)).intValue());
                    C117292a.m165359e(view44, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById8 = findViewById(C0966R.C0970id.f359610lu1);
                    C9556a aVar27 = new C9556a();
                    aVar27.mo10233c(8);
                    View view45 = findViewById8;
                    C117292a.m165358d(view45, aVar27.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((Integer) aVar27.mo10231a(0)).intValue());
                    C117292a.m165359e(view45, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView2 = (TextView) findViewById(C0966R.C0970id.f358403ex2);
                    textView2.setVisibility(0);
                    textView2.setGravity(3);
                }
            } else {
                View findViewById9 = findViewById(C0966R.C0970id.gm7);
                C9556a aVar28 = new C9556a();
                aVar28.mo10233c(8);
                View view46 = findViewById9;
                C117292a.m165358d(view46, aVar28.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((Integer) aVar28.mo10231a(0)).intValue());
                C117292a.m165359e(view46, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            MallOrderDetailObject mallOrderDetailObject5 = this.f202182h;
            if (mallOrderDetailObject5 != null && !TextUtils.isEmpty(mallOrderDetailObject5.f202077f)) {
                addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C77512c(this));
            }
        }
    }

    /* renamed from: K7 */
    public final void mo96396K7(ImageView imageView, String str) {
        if (imageView != null && !TextUtils.isEmpty(str) && C75228t.m90213F(str)) {
            imageView.setImageBitmap(((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C77893b(str)));
            this.f202190s.put(str, imageView);
        }
    }

    /* renamed from: L7 */
    public final void mo96397L7(View view, MallOrderDetailObject.C70045a aVar) {
        if (aVar != null) {
            Rect rect = new Rect();
            rect.left = view.getPaddingLeft();
            rect.right = view.getPaddingRight();
            rect.top = view.getPaddingTop();
            rect.bottom = view.getPaddingBottom();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (aVar.f202087d) {
                view.setBackgroundResource(C0966R.C0969drawable.ags);
            } else {
                view.setBackgroundResource(C0966R.C0969drawable.bcr);
            }
            view.setLayoutParams(layoutParams);
            view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: M7 */
    public final void mo96398M7(View view, ProductSectionItem productSectionItem) {
        if (view != null && productSectionItem != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "setProductIconText", "(Landroid/view/View;Lcom/tencent/mm/plugin/order/model/ProductSectionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.fbn);
            if (textView != null) {
                textView.setText(productSectionItem.f202149e);
            }
            if (!TextUtils.isEmpty(productSectionItem.f202148d)) {
                mo96396K7((ImageView) view.findViewById(C0966R.C0970id.fbo), productSectionItem.f202148d);
            }
        }
    }

    public void cleanUiData(int i) {
        finish();
    }

    public void finish() {
        mo96394I7();
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bak;
    }

    public void initView() {
        if (this.f202191t) {
            C70051b a = C76853c.vx0().wx0().mo96391a(this.f202192u);
            int i = -1;
            if (a != null && !TextUtils.isEmpty(a.f202161b) && C13874c.m13185a(a.f202161b)) {
                i = Util.getInt(a.f202161b, 0);
            }
            if (i == 2) {
                setMMTitle((int) C0966R.string.gng);
            } else if (i == 1) {
                setMMTitle((int) C0966R.string.gnh);
            }
        } else {
            setMMTitle((int) C0966R.string.gni);
        }
        this.f202183i = findViewById(C0966R.C0970id.f358890ho3);
        this.f202184j = findViewById(C0966R.C0970id.f358889ho2);
        this.f202188q = findViewById(C0966R.C0970id.hog);
        this.f202189r = findViewById(C0966R.C0970id.hoe);
        this.f202187p = findViewById(C0966R.C0970id.hof);
        this.f202185n = findViewById(C0966R.C0970id.hou);
        this.f202186o = findViewById(C0966R.C0970id.hot);
        this.f202183i.setOnClickListener(this.f202197z);
        this.f202189r.setOnClickListener(this.f202197z);
        this.f202188q.setOnClickListener(this.f202197z);
        this.f202187p.setOnClickListener(this.f202197z);
        this.f202185n.setOnClickListener(this.f202197z);
        findViewById(C0966R.C0970id.hny).setOnClickListener(this.f202197z);
        findViewById(C0966R.C0970id.f358403ex2).setOnClickListener(this.f202197z);
        findViewById(C0966R.C0970id.f359611lu2).setOnClickListener(this.f202197z);
        this.f202180f = (ListView) findViewById(C0966R.C0970id.hnx);
        C70056c cVar = new C70056c((C70054a) null);
        this.f202181g = cVar;
        this.f202180f.setAdapter(cVar);
        this.f202181g.notifyDataSetChanged();
        this.f202180f.setOnItemClickListener(new C77514e(this));
        mo96395J7();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        ImageView imageView = (ImageView) this.f202190s.get(str);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C79148e g = C79143a.m95768g(this);
        if (g != null && (g instanceof C76852b)) {
            String string = getInput().getString("key_trans_id");
            this.f202192u = string;
            MallOrderDetailObject mallOrderDetailObject = null;
            if (string != null && !C76853c.vx0().wx0().mo96393c(string)) {
                this.f202191t = false;
                doSceneProgress(new C77082f(string, (String) null, -1));
            } else if (C76853c.vx0().wx0().mo96393c(string)) {
                this.f202191t = true;
                C70050a wx02 = C76853c.vx0().wx0();
                wx02.getClass();
                if (!TextUtils.isEmpty(string)) {
                    Log.m105926v("MicroMsg.MallPayMsgManager", "getMallOrderDetailObjectByMsgId msgId:" + string);
                    C70051b a = wx02.mo96391a(string);
                    if (a != null) {
                        mallOrderDetailObject = new MallOrderDetailObject();
                        MallOrderDetailObject.C70046b bVar = new MallOrderDetailObject.C70046b();
                        bVar.f202089a = a.f202164e;
                        if (TextUtils.isEmpty(a.f202162c) || !C13874c.m13185a(a.f202162c)) {
                            bVar.f202090b = (int) (System.currentTimeMillis() / 1000);
                        } else {
                            bVar.f202090b = Util.getInt(a.f202162c, 0);
                        }
                        bVar.f202091c = a.f202163d;
                        bVar.f202092d = a.f202166g;
                        bVar.f202093e = a.f202165f;
                        mallOrderDetailObject.f202073b = bVar;
                        List<C70051b.C70052a> list = a.f202169j;
                        if (list != null) {
                            ArrayList arrayList = (ArrayList) list;
                            if (arrayList.size() > 0) {
                                mallOrderDetailObject.f202075d = new ArrayList();
                                for (int i = 0; i < arrayList.size(); i++) {
                                    C70051b.C70052a aVar = (C70051b.C70052a) arrayList.get(i);
                                    MallOrderDetailObject.C70045a aVar2 = new MallOrderDetailObject.C70045a();
                                    aVar2.f202084a = aVar.f202171a;
                                    aVar2.f202085b = "";
                                    aVar2.f202086c = aVar.f202172b;
                                    aVar2.f202087d = false;
                                    ((ArrayList) mallOrderDetailObject.f202075d).add(aVar2);
                                }
                            }
                        }
                        List<C70051b.C70053b> list2 = a.f202170k;
                        if (list2 != null) {
                            ArrayList arrayList2 = (ArrayList) list2;
                            if (arrayList2.size() > 0) {
                                if (mallOrderDetailObject.f202075d == null) {
                                    mallOrderDetailObject.f202075d = new ArrayList();
                                }
                                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                    C70051b.C70053b bVar2 = (C70051b.C70053b) arrayList2.get(i2);
                                    MallOrderDetailObject.C70045a aVar3 = new MallOrderDetailObject.C70045a();
                                    aVar3.f202084a = bVar2.f202173a;
                                    aVar3.f202085b = bVar2.f202174b;
                                    aVar3.f202086c = bVar2.f202175c;
                                    aVar3.f202087d = false;
                                    if (i2 == 0) {
                                        aVar3.f202087d = true;
                                    }
                                    ((ArrayList) mallOrderDetailObject.f202075d).add(aVar3);
                                }
                            }
                        }
                        mallOrderDetailObject.f202078g = a.f202168i;
                        mallOrderDetailObject.f202079h = a.f202167h;
                        if (TextUtils.isEmpty(a.f202162c) || !C13874c.m13185a(a.f202162c)) {
                            mallOrderDetailObject.f202080i = (int) (System.currentTimeMillis() / 1000);
                        } else {
                            mallOrderDetailObject.f202080i = Util.getInt(a.f202162c, 0);
                        }
                    }
                }
                this.f202182h = mallOrderDetailObject;
                if (mallOrderDetailObject == null) {
                    C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C77515f(this));
                }
            } else {
                Log.m105928w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
                C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C77515f(this));
            }
        }
        initView();
    }

    public void onDestroy() {
        mo96394I7();
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
        if (i != 0 || i2 != 0) {
            return false;
        }
        if (!(yVar instanceof C77082f)) {
            return true;
        }
        MallOrderDetailObject mallOrderDetailObject = ((C77082f) yVar).f225146d;
        Log.m105918d("MicroMsg.MallOrderDetailInfoUI", "tempObject:" + mallOrderDetailObject);
        if (mallOrderDetailObject == null) {
            return true;
        }
        this.f202182h = mallOrderDetailObject;
        mo96395J7();
        return true;
    }
}
