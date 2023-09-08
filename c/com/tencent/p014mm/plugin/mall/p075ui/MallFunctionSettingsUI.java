package com.tencent.p014mm.plugin.mall.p075ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C117747y;
import s52.C48228b;
import te3.C51676vb3;
import u52.C65216a;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI */
public class MallFunctionSettingsUI extends WalletBaseUI {

    /* renamed from: o */
    public static final /* synthetic */ int f115100o = 0;

    /* renamed from: d */
    public ListView f115101d;

    /* renamed from: e */
    public final int f115102e = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: f */
    public TextView f115103f;

    /* renamed from: g */
    public TextView f115104g;

    /* renamed from: h */
    public C42543a f115105h;

    /* renamed from: i */
    public int f115106i;

    /* renamed from: j */
    public List<C42544b> f115107j = new ArrayList();

    /* renamed from: n */
    public C48228b f115108n;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI$a */
    public class C42543a extends BaseAdapter {
        public C42543a(C42558e eVar) {
        }

        public int getCount() {
            return ((ArrayList) MallFunctionSettingsUI.this.f115107j).size();
        }

        public Object getItem(int i) {
            return (C42544b) ((ArrayList) MallFunctionSettingsUI.this.f115107j).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return ((C42544b) ((ArrayList) MallFunctionSettingsUI.this.f115107j).get(i)).f115110a;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            ViewGroup viewGroup2 = viewGroup;
            if (view == null) {
                int itemViewType = getItemViewType(i);
                MallFunctionSettingsUI mallFunctionSettingsUI = MallFunctionSettingsUI.this;
                C42545c cVar = new C42545c((C42558e) null);
                if (itemViewType == 1) {
                    view2 = LayoutInflater.from(mallFunctionSettingsUI.getContext()).inflate(C0966R.C0971layout.f359872ba1, viewGroup2, false);
                    view2.setId(C0966R.C0970id.iwf);
                    cVar.f115114a = (CdnImageView) view2.findViewById(C0966R.C0970id.gt7);
                    cVar.f115115b = (TextView) view2.findViewById(C0966R.C0970id.gt9);
                    cVar.f115116c = (TextView) view2.findViewById(C0966R.C0970id.gt5);
                    cVar.f115117d = (MMSwitchBtn) view2.findViewById(C0966R.C0970id.gt8);
                    cVar.f115118e = view2.findViewById(C0966R.C0970id.gt6);
                    cVar.f115119f = view2.findViewById(C0966R.C0970id.gt4);
                    ViewGroup viewGroup3 = (ViewGroup) view2;
                    cVar.f115114a.setUseSdcardCache(true);
                } else {
                    view2 = LayoutInflater.from(mallFunctionSettingsUI.getContext()).inflate(C0966R.C0971layout.f359873ba2, viewGroup2, false);
                    cVar.f115115b = (TextView) view2.findViewById(C0966R.C0970id.gt_);
                    ViewGroup viewGroup4 = (ViewGroup) view2;
                }
                view2.setTag(cVar);
            } else {
                view2 = view;
            }
            C42544b bVar = (C42544b) ((ArrayList) MallFunctionSettingsUI.this.f115107j).get(i);
            C42545c cVar2 = (C42545c) view2.getTag();
            cVar2.getClass();
            int i2 = bVar.f115110a;
            if (i2 == 1) {
                C51676vb3 vb32 = bVar.f115111b;
                if (C85875k4.m106211z()) {
                    String str = vb32.f143424n;
                    if (str != null) {
                        cVar2.f115114a.setUrl(str);
                    } else {
                        String str2 = vb32.f143420g;
                        if (str2 != null) {
                            cVar2.f115114a.setUrl(str2);
                        }
                    }
                } else {
                    String str3 = vb32.f143420g;
                    if (str3 != null) {
                        cVar2.f115114a.setUrl(str3);
                    }
                }
                String str4 = vb32.f143419f;
                if (str4 != null) {
                    cVar2.f115115b.setText(str4);
                }
                String str5 = vb32.f143421h;
                if (str5 == null || Util.isNullOrNil(str5)) {
                    cVar2.f115116c.setVisibility(8);
                } else {
                    cVar2.f115116c.setText(vb32.f143421h);
                    cVar2.f115116c.setVisibility(0);
                }
                int i3 = vb32.f143418e;
                if (i3 == 0) {
                    cVar2.f115117d.setCheck(true);
                    cVar2.f115117d.setEnabled(true);
                    cVar2.f115115b.setTextColor(MallFunctionSettingsUI.this.getContext().getResources().getColor(C0966R.color.f3138gm));
                    View view3 = cVar2.f115119f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i3 == 1) {
                    cVar2.f115117d.setCheck(false);
                    cVar2.f115117d.setEnabled(true);
                    cVar2.f115115b.setTextColor(MallFunctionSettingsUI.this.getContext().getResources().getColor(C0966R.color.f3138gm));
                    View view5 = cVar2.f115119f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i3 == 2) {
                    cVar2.f115117d.setCheck(false);
                    cVar2.f115117d.setEnabled(false);
                    View view7 = cVar2.f115119f;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                cVar2.f115117d.setSwitchListener(new C42560g(cVar2, vb32));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar2.f115118e.getLayoutParams();
                if (bVar.f115113d) {
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.leftMargin = MallFunctionSettingsUI.this.f115102e;
                }
                cVar2.f115118e.setLayoutParams(layoutParams);
            } else if (i2 == 0) {
                cVar2.f115115b.setText(bVar.f115112c);
            }
            return view2;
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI$b */
    public static class C42544b {

        /* renamed from: a */
        public int f115110a;

        /* renamed from: b */
        public C51676vb3 f115111b;

        /* renamed from: c */
        public String f115112c;

        /* renamed from: d */
        public boolean f115113d = false;
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI$c */
    public class C42545c {

        /* renamed from: a */
        public CdnImageView f115114a;

        /* renamed from: b */
        public TextView f115115b;

        /* renamed from: c */
        public TextView f115116c;

        /* renamed from: d */
        public MMSwitchBtn f115117d;

        /* renamed from: e */
        public View f115118e;

        /* renamed from: f */
        public View f115119f;

        public C42545c(C42558e eVar) {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359874ba3;
    }

    public void initView() {
        this.f115101d = (ListView) findViewById(C0966R.C0970id.gta);
        this.f115105h = new C42543a((C42558e) null);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this, C0966R.C0971layout.f359871ba0, (ViewGroup) null);
        this.f115101d.addHeaderView(viewGroup, (Object) null, false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setMinimumHeight(C76577a.m92151b(getContext(), 80));
        this.f115101d.addFooterView(linearLayout, (Object) null, false);
        this.f115101d.setAdapter(this.f115105h);
        this.f115103f = (TextView) viewGroup.findViewById(C0966R.C0970id.f358742gt3);
        this.f115104g = (TextView) viewGroup.findViewById(C0966R.C0970id.f358741gt2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f115106i = intValue;
        Log.m105925i("MicroMsg.MallFunctionSettingsUI", "wallet region: %s", Integer.valueOf(intValue));
        initView();
        setMMTitle("");
        Log.m105924i("MicroMsg.MallFunctionSettingsUI", "do get function list");
        Log.m105925i("MicroMsg.MallFunctionSettingsUI", " walletMallV2 is ：%s", Boolean.TRUE);
        C48228b bVar = new C48228b(this.f115106i, 0, 1, 1);
        this.f115108n = bVar;
        bVar.mo9225i().mo123062e(new C42558e(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f115108n.mo85581g();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C65216a.class);
    }
}
