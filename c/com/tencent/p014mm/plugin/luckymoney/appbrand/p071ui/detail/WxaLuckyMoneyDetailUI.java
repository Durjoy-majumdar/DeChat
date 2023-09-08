package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.detail;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k32.C76491j;
import l32.C76667b;
import m32.C76740a;
import m32.C76741b;
import m32.C76742c;
import m32.C76744d;
import nj3.C76879j;
import qo3.C89779i0;
import te3.C64678re2;
import te3.C64725t83;
import te3.C64754ul3;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI */
public class WxaLuckyMoneyDetailUI extends WxaLuckyMoneyBaseUI implements C76741b {

    /* renamed from: A */
    public static final /* synthetic */ int f198789A = 0;

    /* renamed from: h */
    public final C76740a f198790h = new C76744d();

    /* renamed from: i */
    public C89779i0 f198791i = null;

    /* renamed from: j */
    public Intent f198792j = null;

    /* renamed from: n */
    public ListView f198793n;

    /* renamed from: o */
    public ImageView f198794o;

    /* renamed from: p */
    public TextView f198795p;

    /* renamed from: q */
    public TextView f198796q;

    /* renamed from: r */
    public ImageView f198797r;

    /* renamed from: s */
    public View f198798s;

    /* renamed from: t */
    public TextView f198799t;

    /* renamed from: u */
    public View f198800u;

    /* renamed from: v */
    public TextView f198801v;

    /* renamed from: w */
    public TextView f198802w;

    /* renamed from: x */
    public View f198803x;

    /* renamed from: y */
    public C76742c f198804y;

    /* renamed from: z */
    public AbsListView.OnScrollListener f198805z = new C69128a();

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI$a */
    public class C69128a implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f198806d = false;

        /* renamed from: e */
        public boolean f198807e;

        public C69128a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i3 == 0 || !this.f198806d) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            boolean z = true;
            if (i <= 0) {
                View childAt = absListView.getChildAt(i);
                if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                    z = false;
                }
            }
            if (this.f198807e != z) {
                if (z) {
                    WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = WxaLuckyMoneyDetailUI.this;
                    Drawable drawable = wxaLuckyMoneyDetailUI.getResources().getDrawable(C0966R.C0969drawable.c5k);
                    int i4 = WxaLuckyMoneyDetailUI.f198789A;
                    C76667b bVar = wxaLuckyMoneyDetailUI.f198770d;
                    if (bVar.f200909a.getSupportActionBar() != null) {
                        bVar.f200909a.getSupportActionBar().mo91112w(drawable);
                    }
                } else {
                    WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI2 = WxaLuckyMoneyDetailUI.this;
                    int i5 = WxaLuckyMoneyDetailUI.f198789A;
                    C76667b bVar2 = wxaLuckyMoneyDetailUI2.f198770d;
                    if (bVar2.f200909a.getSupportActionBar() != null) {
                        bVar2.f200909a.getSupportActionBar().mo91112w((Drawable) null);
                    }
                }
                this.f198807e = z;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (absListView.getCount() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            if (i == 0) {
                if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                    C76740a aVar = WxaLuckyMoneyDetailUI.this.f198790h;
                    int count = absListView.getCount();
                    C76744d dVar = (C76744d) aVar;
                    if (dVar.f224509a == null) {
                        Log.m105924i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage ui == null");
                    } else if (count < ((LinkedList) dVar.f224514f).size()) {
                        Log.m105925i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage. offset = [%d], list.size() = [%d], skip load", Integer.valueOf(count), Integer.valueOf(((LinkedList) dVar.f224514f).size()));
                    } else if (dVar.f224513e) {
                        Log.m105924i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. is loading now...");
                    } else if (dVar.f224512d == 0) {
                        Log.m105924i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. do not has more...");
                    } else {
                        Log.m105924i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage load");
                        dVar.f224513e = true;
                        dVar.mo107012a(count);
                    }
                }
                this.f198806d = false;
            } else if (i == 1) {
                this.f198806d = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI$b */
    public class C69129b implements MenuItem.OnMenuItemClickListener {
        public C69129b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = WxaLuckyMoneyDetailUI.this;
            Intent intent = wxaLuckyMoneyDetailUI.f198792j;
            if (intent != null) {
                wxaLuckyMoneyDetailUI.setResult(0, intent);
            } else {
                wxaLuckyMoneyDetailUI.setResult(-1, (Intent) null);
            }
            WxaLuckyMoneyDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI$c */
    public class C69130c implements DialogInterface.OnCancelListener {
        public C69130c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            WxaLuckyMoneyDetailUI.this.mo95258s1();
            if (WxaLuckyMoneyDetailUI.this.getContentView().getVisibility() == 8 || WxaLuckyMoneyDetailUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.WxaLuckyMoneyDetailUI", "user cancel & finish");
                WxaLuckyMoneyDetailUI.this.mo95234T1(-1, (Intent) null);
            }
        }
    }

    /* renamed from: H7 */
    public final void mo95251H7(C76491j jVar) {
        C76491j jVar2 = jVar;
        AppCompatActivity context = getContext();
        C69242l1.m81595a(this.f198794o, jVar2.f223913b, jVar2.f223912a);
        C69242l1.m81616v(context, this.f198795p, jVar2.f223914c);
        C69242l1.m81616v(context, this.f198796q, jVar2.f223918g);
        if (jVar2.f223917f == 1) {
            this.f198797r.setVisibility(0);
            this.f198797r.setImageResource(C0966R.C0969drawable.f357259c72);
        } else {
            this.f198797r.setVisibility(8);
        }
        if (jVar2.f223916e == 2) {
            this.f198799t.setText(C75228t.m90260n(((double) jVar2.f223915d) / 100.0d));
            this.f198804y.getClass();
            View view = this.f198798s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f198798s;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!Util.isNullOrNil(jVar2.f223919h)) {
            View view5 = this.f198800u;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198801v.setText(jVar2.f223919h);
            this.f198801v.setTextColor(getResources().getColor(C0966R.color.a3h));
        } else {
            View view7 = this.f198800u;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!Util.isNullOrNil(jVar2.f223920i)) {
            this.f198802w.setText(jVar2.f223920i);
        } else {
            this.f198802w.setText((CharSequence) null);
        }
    }

    /* renamed from: Q4 */
    public void mo95252Q4(int i, List<C64678re2> list, List<C64678re2> list2) {
        C76742c cVar = this.f198804y;
        if (list2 == null) {
            cVar.getClass();
            cVar.f224496d = new LinkedList();
        } else {
            cVar.f224496d = list2;
        }
        cVar.notifyDataSetChanged();
    }

    /* renamed from: V4 */
    public void mo95253V4(C64725t83 t832) {
        C76491j jVar;
        if (t832 == null) {
            jVar = null;
        } else {
            jVar = new C76491j();
            jVar.f223912a = t832.f185525r;
            jVar.f223913b = t832.f185527t;
            jVar.f223914c = t832.f185526s;
            jVar.f223915d = t832.f185517g;
            jVar.f223919h = t832.f185531x;
            jVar.f223920i = t832.f185529v;
            jVar.f223917f = t832.f185522o;
            jVar.f223916e = t832.f185516f;
            jVar.f223918g = t832.f185524q;
        }
        mo95251H7(jVar);
        int i = t832.f185530w;
        LinkedList<C64678re2> linkedList = t832.f185523p;
        mo95252Q4(i, linkedList, linkedList);
    }

    /* renamed from: b5 */
    public void mo95254b5(Intent intent) {
        this.f198792j = intent;
    }

    public void error(String str) {
        C76879j.m92726T(this, str);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9m;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gf9);
        setBackBtn(new C69129b());
        this.f198793n = (ListView) findViewById(C0966R.C0970id.gdh);
        this.f198804y = new C76742c(getContext());
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b9h, (ViewGroup) null);
        this.f198803x = inflate;
        this.f198793n.addHeaderView(inflate);
        this.f198793n.setAdapter(this.f198804y);
        this.f198804y.getClass();
        this.f198793n.setOnScrollListener(this.f198805z);
        this.f198794o = (ImageView) this.f198803x.findViewById(C0966R.C0970id.gdl);
        this.f198795p = (TextView) this.f198803x.findViewById(C0966R.C0970id.f358671ge3);
        this.f198797r = (ImageView) this.f198803x.findViewById(C0966R.C0970id.f358667gd3);
        this.f198796q = (TextView) this.f198803x.findViewById(C0966R.C0970id.ge6);
        this.f198798s = this.f198803x.findViewById(C0966R.C0970id.gck);
        this.f198799t = (TextView) this.f198803x.findViewById(C0966R.C0970id.gcj);
        this.f198800u = this.f198803x.findViewById(C0966R.C0970id.gd6);
        this.f198801v = (TextView) this.f198803x.findViewById(C0966R.C0970id.gdz);
        this.f198802w = (TextView) this.f198803x.findViewById(C0966R.C0970id.gcq);
        C89779i0 Q = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C69130c());
        this.f198791i = Q;
        Q.show();
    }

    public void onBackPressed() {
        Intent intent = this.f198792j;
        if (intent != null) {
            setResult(0, intent);
        } else {
            setResult(-1, (Intent) null);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C76740a aVar = this.f198790h;
        Intent intent = getIntent();
        C76744d dVar = (C76744d) aVar;
        dVar.getClass();
        dVar.f224509a = this;
        dVar.f224510b = intent.getStringExtra("key_sendid");
        dVar.f224511c = intent.getStringExtra("key_appid");
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_data");
        String stringExtra = intent.getStringExtra("key_from");
        if (stringExtra == null || !stringExtra.equalsIgnoreCase("value_open")) {
            dVar.mo107012a(0);
            return;
        }
        C64725t83 t832 = null;
        if (byteArrayExtra == null || byteArrayExtra.length == 0) {
            Log.m105920e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. No data found.");
        } else {
            C64725t83 t833 = new C64725t83();
            try {
                t833.parseFrom(byteArrayExtra);
                Log.m105924i("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom succeed.");
                t832 = t833;
            } catch (IOException e) {
                Log.m105921e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. IOException: %s", e);
            }
        }
        if (t832 == null) {
            Log.m105920e("MicroMsg.WxaLuckyMoneyLogicDetail", "parse OpenWxaHBResponse failed.");
            dVar.mo107012a(0);
            return;
        }
        dVar.f224512d = t832.f185530w;
        ((LinkedList) dVar.f224514f).addAll(t832.f185523p);
        dVar.f224509a.mo95258s1();
        dVar.f224509a.mo95253V4(t832);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5424er);
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.a2w));
        }
        return onCreatePanelMenu;
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f198791i;
        if (i0Var != null && i0Var.isShowing()) {
            this.f198791i.dismiss();
        }
    }

    /* renamed from: r2 */
    public void mo95257r2(C64754ul3 ul32) {
        C76491j jVar;
        if (ul32 == null) {
            jVar = null;
        } else {
            jVar = new C76491j();
            jVar.f223912a = ul32.f185769o;
            jVar.f223913b = ul32.f185771q;
            jVar.f223914c = ul32.f185770p;
            jVar.f223915d = ul32.f185761d;
            jVar.f223919h = ul32.f185775u;
            jVar.f223920i = ul32.f185773s;
            jVar.f223917f = ul32.f185766i;
            jVar.f223916e = ul32.f185777w;
            jVar.f223918g = ul32.f185768n;
        }
        mo95251H7(jVar);
        int i = ul32.f185774t;
        LinkedList<C64678re2> linkedList = ul32.f185767j;
        mo95252Q4(i, linkedList, linkedList);
    }

    /* renamed from: s1 */
    public void mo95258s1() {
        C89779i0 i0Var = this.f198791i;
        if (i0Var != null && i0Var.isShowing()) {
            this.f198791i.dismiss();
        }
    }
}
