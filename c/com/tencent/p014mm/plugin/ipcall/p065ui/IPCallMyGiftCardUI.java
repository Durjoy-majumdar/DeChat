package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11797d;
import p196ln.C76705f;
import p910lj.C76701a;
import te3.C52095yb2;
import te3.ox4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI */
public class IPCallMyGiftCardUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public C4639a f19478d;

    /* renamed from: e */
    public ListView f19479e;

    /* renamed from: f */
    public View f19480f;

    /* renamed from: g */
    public ProgressDialog f19481g;

    /* renamed from: h */
    public C11797d f19482h;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI$a */
    public static class C4639a extends BaseAdapter {

        /* renamed from: d */
        public List<ox4> f19483d = null;

        /* renamed from: e */
        public IPCallMyGiftCardUI f19484e = null;

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI$a$a */
        public class C4640a {

            /* renamed from: a */
            public TextView f19485a;

            /* renamed from: b */
            public TextView f19486b;

            /* renamed from: c */
            public TextView f19487c;

            /* renamed from: d */
            public CdnImageView f19488d;

            /* renamed from: e */
            public ImageView f19489e;

            public C4640a(C4639a aVar, C4694m0 m0Var) {
            }
        }

        public C4639a(IPCallMyGiftCardUI iPCallMyGiftCardUI) {
            Assert.assertTrue(iPCallMyGiftCardUI != null);
            this.f19484e = iPCallMyGiftCardUI;
        }

        public int getCount() {
            List<ox4> list = this.f19483d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            List<ox4> list = this.f19483d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C4640a aVar;
            if (view == null) {
                view = ((LayoutInflater) this.f19484e.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.b2k, viewGroup, false);
                aVar = new C4640a(this, (C4694m0) null);
                aVar.f19485a = (TextView) view.findViewById(C0966R.C0970id.buk);
                aVar.f19486b = (TextView) view.findViewById(C0966R.C0970id.byz);
                aVar.f19487c = (TextView) view.findViewById(C0966R.C0970id.cn5);
                aVar.f19488d = (CdnImageView) view.findViewById(C0966R.C0970id.eur);
                aVar.f19489e = (ImageView) view.findViewById(C0966R.C0970id.f357833c00);
                view.setTag(aVar);
            } else {
                aVar = (C4640a) view.getTag();
            }
            ox4 ox4 = (ox4) getItem(i);
            if (ox4 == null) {
                return view;
            }
            if (Util.isNullOrNil(ox4.f139441h)) {
                aVar.f19485a.setVisibility(0);
                aVar.f19486b.setVisibility(0);
                aVar.f19487c.setVisibility(8);
                aVar.f19485a.setText(ox4.f139437d);
                aVar.f19486b.setText(ox4.f139438e);
            } else {
                aVar.f19485a.setVisibility(8);
                aVar.f19486b.setVisibility(8);
                aVar.f19487c.setVisibility(0);
                aVar.f19487c.setText(ox4.f139441h);
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar.f19489e, "", 0.5f);
            if (!Util.isNullOrNil(ox4.f139440g)) {
                aVar.f19488d.setVisibility(0);
                aVar.f19488d.setUrl(ox4.f139440g);
                aVar.f19489e.setVisibility(4);
            } else {
                aVar.f19489e.setVisibility(0);
                aVar.f19488d.setVisibility(4);
            }
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2l;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(288, this);
        setMMTitle((int) C0966R.string.fwd);
        setBackBtn(new C4694m0(this));
        addTextOptionMenu(0, getContext().getString(C0966R.string.fwb), new C4697n0(this));
        this.f19480f = findViewById(C0966R.C0970id.f_w);
        this.f19479e = (ListView) findViewById(C0966R.C0970id.f_x);
        C4639a aVar = new C4639a(this);
        this.f19478d = aVar;
        this.f19479e.setAdapter(aVar);
        this.f19481g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.fug), true, true, new C4700o0(this));
        this.f19482h = new C11797d();
        C97625j3.m125815e().mo123460f(this.f19482h);
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(288, this);
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", Integer.valueOf(i2), str);
        if (!(yVar2 instanceof C11797d)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C52095yb2 yb22 = ((C11797d) yVar2).f34510e;
            ProgressDialog progressDialog = this.f19481g;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f19481g.dismiss();
            }
            C4639a aVar = this.f19478d;
            aVar.f19483d = yb22.f145218e;
            aVar.notifyDataSetChanged();
            if (yb22.f145218e.size() == 0) {
                View view = this.f19480f;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        ProgressDialog progressDialog2 = this.f19481g;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f19481g.dismiss();
        }
        View view3 = this.f19480f;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fud), 0).show();
    }
}
