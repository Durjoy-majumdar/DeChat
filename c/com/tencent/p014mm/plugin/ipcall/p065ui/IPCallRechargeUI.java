package com.tencent.p014mm.plugin.ipcall.p065ui;

import al3.C0086a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C42464d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.pluginsdk.model.C6659q0;
import com.tencent.p014mm.pluginsdk.model.C6660r0;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11799f;
import p179jw.C9531b;
import p910lj.C76701a;
import q12.C12031f;
import q12.C12032g;
import q12.C12034i;
import qo3.C77389a;
import qo3.C77398g;
import t12.C110899d;
import t12.C13818a;
import t12.C13821b;
import t12.C13822c;
import te3.C48984cc2;
import te3.mx4;
import te3.rx4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI */
public class IPCallRechargeUI extends MMActivity implements C11385n {

    /* renamed from: z */
    public static final /* synthetic */ int f19513z = 0;

    /* renamed from: d */
    public String[] f19514d;

    /* renamed from: e */
    public String[] f19515e;

    /* renamed from: f */
    public String[] f19516f;

    /* renamed from: g */
    public String f19517g;

    /* renamed from: h */
    public int f19518h;

    /* renamed from: i */
    public int f19519i = -1;

    /* renamed from: j */
    public int f19520j = -1;

    /* renamed from: n */
    public String f19521n;

    /* renamed from: o */
    public String f19522o;

    /* renamed from: p */
    public C12032g f19523p = new C12032g();

    /* renamed from: q */
    public C12031f f19524q = new C12031f();

    /* renamed from: r */
    public C12034i f19525r = new C12034i();

    /* renamed from: s */
    public ListView f19526s;

    /* renamed from: t */
    public C4659k f19527t;

    /* renamed from: u */
    public TextView f19528u;

    /* renamed from: v */
    public ProgressDialog f19529v;

    /* renamed from: w */
    public C11799f f19530w;

    /* renamed from: x */
    public C9531b.C9532a f19531x = new C4651c();

    /* renamed from: y */
    public MMHandler f19532y = new C4650b();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$a */
    public class C4649a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f19533d;

        public C4649a(String str) {
            this.f19533d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.idkeyStat(257, 3, 1, true);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f19533d);
            intent.putExtra("showShare", false);
            C88144b.m109791i(IPCallRechargeUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$b */
    public class C4650b extends MMHandler {
        public C4650b() {
        }

        public void handleMessage(Message message) {
            if (message.what != 1002) {
                Log.m105928w("MicroMsg.IPCallRechargeUI", "unknow message, cannt handle.");
                return;
            }
            IPCallRechargeUI.this.f19526s.setVisibility(0);
            IPCallRechargeUI iPCallRechargeUI = IPCallRechargeUI.this;
            if (!Util.isNullOrNil(iPCallRechargeUI.f19521n) && !Util.isNullOrNil(iPCallRechargeUI.f19522o)) {
                Log.m105924i("MicroMsg.IPCallRechargeUI", "showGotoExchangeRecordsAlert");
                C76879j.m92709C(iPCallRechargeUI, iPCallRechargeUI.f19522o, iPCallRechargeUI.f19521n, iPCallRechargeUI.getString(C0966R.string.fuz), iPCallRechargeUI.getString(C0966R.string.f360909fv0), false, (DialogInterface.OnClickListener) null, new C4715s0(iPCallRechargeUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$c */
    public class C4651c implements C9531b.C9532a {
        public C4651c() {
        }

        /* renamed from: g2 */
        public void mo5537g2(ArrayList<C6653c1> arrayList) {
            C12032g gVar = IPCallRechargeUI.this.f19523p;
            gVar.getClass();
            gVar.f35048f = Util.nowMilliSecond();
            if (arrayList == null || arrayList.size() <= 0) {
                ProgressDialog progressDialog = IPCallRechargeUI.this.f19529v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    IPCallRechargeUI.this.f19529v.dismiss();
                }
                Log.m105924i("MicroMsg.IPCallRechargeUI", "[onQueryFinish] result=null");
                IPCallRechargeUI iPCallRechargeUI = IPCallRechargeUI.this;
                iPCallRechargeUI.f19519i = 10236;
                MMHandler mMHandler = iPCallRechargeUI.f19532y;
                if (mMHandler != null) {
                    mMHandler.sendEmptyMessage(1002);
                    return;
                }
                return;
            }
            IPCallRechargeUI.this.f19515e = new String[arrayList.size()];
            IPCallRechargeUI.this.f19516f = new String[arrayList.size()];
            C6653c1 c1Var = arrayList.get(0);
            if (c1Var.f23974f == 10232) {
                Log.m105924i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product OK size=" + arrayList.size());
                Iterator<C6653c1> it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C6653c1 next = it.next();
                    IPCallRechargeUI.this.f19515e[i] = new BigDecimal(next.f23973e).divide(new BigDecimal(1000000)).toString();
                    IPCallRechargeUI.this.f19516f[i] = next.f23972d;
                    i++;
                }
                IPCallRechargeUI iPCallRechargeUI2 = IPCallRechargeUI.this;
                if (iPCallRechargeUI2.f19518h > 0) {
                    String[] strArr = iPCallRechargeUI2.f19516f;
                    if (strArr.length > 0) {
                        String str = strArr[0];
                        if (!Util.isNullOrNil(str) && !str.equals(IPCallRechargeUI.this.f19517g)) {
                            Log.m105924i("MicroMsg.IPCallRechargeUI", "remote currency:" + IPCallRechargeUI.this.f19517g + ",google wallet currency:" + str);
                            IPCallRechargeUI.this.mo5533H7(str);
                            return;
                        }
                    }
                }
                ProgressDialog progressDialog2 = IPCallRechargeUI.this.f19529v;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    IPCallRechargeUI.this.f19529v.dismiss();
                }
                MMHandler mMHandler2 = IPCallRechargeUI.this.f19532y;
                if (mMHandler2 != null) {
                    mMHandler2.sendEmptyMessage(1002);
                    return;
                }
                return;
            }
            ProgressDialog progressDialog3 = IPCallRechargeUI.this.f19529v;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                IPCallRechargeUI.this.f19529v.dismiss();
            }
            IPCallRechargeUI.this.f19519i = c1Var.f23974f;
            Log.m105924i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product Failed Status:" + IPCallRechargeUI.this.f19519i);
            MMHandler mMHandler3 = IPCallRechargeUI.this.f19532y;
            if (mMHandler3 != null) {
                mMHandler3.sendEmptyMessage(1002);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$d */
    public class C4652d implements MenuItem.OnMenuItemClickListener {
        public C4652d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallRechargeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$e */
    public class C4653e implements MenuItem.OnMenuItemClickListener {
        public C4653e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallRechargeUI iPCallRechargeUI = IPCallRechargeUI.this;
            int i = IPCallRechargeUI.f19513z;
            C76879j.m92737h(iPCallRechargeUI.getContext(), (String) null, (String[]) null, iPCallRechargeUI.getResources().getString(C0966R.string.fwu), false, new C4718t0(iPCallRechargeUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$f */
    public class C4654f extends ClickableSpan {
        public C4654f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            ((TextView) view).setHighlightColor(IPCallRechargeUI.this.getResources().getColor(C0966R.color.ahf));
            Intent intent = new Intent();
            String str = IPCallRechargeUI.this.getString(C0966R.string.f360912fv3) + "&usedcc=";
            C42464d a = C42464d.m46136a();
            if (!a.f114953c) {
                a.mo66546b(false);
            }
            ArrayList<Integer> arrayList2 = a.f114951a;
            if (arrayList2.size() > 0) {
                int size = arrayList2.size();
                if (size > 5) {
                    size = 5;
                }
                for (int i = 0; i < size; i++) {
                    String h = C13818a.m13112h(arrayList2.get(i).toString());
                    if (!Util.isNullOrNil(h)) {
                        str = str + h + "|";
                    }
                }
                if (str.endsWith("|")) {
                    str = str.substring(0, str.length() - 1);
                }
            } else {
                str = str + C13818a.m13112h(C110899d.m151192f());
            }
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            C88144b.m109791i(IPCallRechargeUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(IPCallRechargeUI.this.getResources().getColor(C0966R.color.a1d));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$g */
    public class C4655g implements DialogInterface.OnCancelListener {
        public C4655g() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            try {
                if (IPCallRechargeUI.this.f19530w != null) {
                    C97625j3.m125815e().mo123458d(IPCallRechargeUI.this.f19530w);
                }
                IPCallRechargeUI.this.finish();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.IPCallRechargeUI", "cancel getProductListScene error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$h */
    public class C4656h implements DialogInterface.OnClickListener {
        public C4656h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            IPCallRechargeUI iPCallRechargeUI = IPCallRechargeUI.this;
            C4659k kVar = iPCallRechargeUI.f19527t;
            if (kVar != null) {
                kVar.f19543d = null;
                kVar.notifyDataSetChanged();
            }
            ListView listView = iPCallRechargeUI.f19526s;
            if (listView != null) {
                listView.setVisibility(4);
            }
            ProgressDialog progressDialog = iPCallRechargeUI.f19529v;
            if (progressDialog != null) {
                progressDialog.show();
            }
            iPCallRechargeUI.mo5533H7("");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$i */
    public class C4657i implements DialogInterface.OnClickListener {
        public C4657i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            IPCallRechargeUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$j */
    public class C4658j implements DialogInterface.OnClickListener {
        public C4658j(IPCallRechargeUI iPCallRechargeUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$k */
    public static class C4659k extends BaseAdapter {

        /* renamed from: d */
        public List<mx4> f19543d = null;

        /* renamed from: e */
        public IPCallRechargeUI f19544e = null;

        /* renamed from: f */
        public C48984cc2 f19545f = null;

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$k$a */
        public class C4660a implements View.OnClickListener {
            public C4660a() {
            }

            public void onClick(View view) {
                boolean z;
                boolean z2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                IPCallRechargeUI iPCallRechargeUI = C4659k.this.f19544e;
                if (!ChannelUtil.isGPVersion()) {
                    C77389a aVar = new C77389a();
                    aVar.f225660q = C0086a.m38a(iPCallRechargeUI).getString(C0966R.string.fwt);
                    aVar.f225663t = C0086a.m38a(iPCallRechargeUI).getString(C0966R.string.f8029zr);
                    aVar.f225620C = new C13822c();
                    C77398g gVar = new C77398g(iPCallRechargeUI, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    gVar.show();
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.IPCallRechargeUI", "onClick recharged, non gp version!");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                IPCallRechargeUI iPCallRechargeUI2 = C4659k.this.f19544e;
                int intValue = ((Integer) view.getTag()).intValue();
                int i = iPCallRechargeUI2.f19519i;
                if (i != -1) {
                    switch (i) {
                        case 10233:
                            String string = iPCallRechargeUI2.getString(C0966R.string.fwe);
                            if (!iPCallRechargeUI2.mo5535J7(string)) {
                                C76701a.makeText((Context) iPCallRechargeUI2, (CharSequence) string, 0).show();
                                break;
                            }
                            break;
                        case 10234:
                            String string2 = iPCallRechargeUI2.getString(C0966R.string.fw9);
                            if (!iPCallRechargeUI2.mo5535J7(string2)) {
                                C76879j.m92713G(iPCallRechargeUI2, string2, iPCallRechargeUI2.getString(C0966R.string.fwg), true, (DialogInterface.OnClickListener) null);
                                break;
                            }
                            break;
                        case 10235:
                            String string3 = iPCallRechargeUI2.getString(C0966R.string.fxf);
                            if (!iPCallRechargeUI2.mo5535J7(string3)) {
                                C76701a.makeText((Context) iPCallRechargeUI2, (CharSequence) string3, 0).show();
                                break;
                            }
                            break;
                        default:
                            String string4 = iPCallRechargeUI2.getString(C0966R.string.fuf);
                            if (!iPCallRechargeUI2.mo5535J7(string4)) {
                                C76701a.makeText((Context) iPCallRechargeUI2, (CharSequence) string4, 0).show();
                                break;
                            }
                            break;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    iPCallRechargeUI2.f19520j = intValue;
                    Log.m105925i("MicroMsg.IPCallRechargeUI", "ProductId:%s, PackPrice:%s,Currency:%s, index:%d", iPCallRechargeUI2.f19514d[intValue], iPCallRechargeUI2.f19515e[intValue], iPCallRechargeUI2.f19516f[intValue], Integer.valueOf(intValue));
                    C115669n.INSTANCE.idkeyStat(257, 5, 1, true);
                    iPCallRechargeUI2.f19524q.mo11893d();
                    if (iPCallRechargeUI2.f19527t.getItem(intValue) instanceof mx4) {
                        iPCallRechargeUI2.f19524q.f35038e = ((mx4) iPCallRechargeUI2.f19527t.getItem(intValue)).f138277g;
                    }
                    C12031f fVar = iPCallRechargeUI2.f19524q;
                    fVar.f35039f = iPCallRechargeUI2.f19516f[intValue];
                    fVar.f35037d = (long) intValue;
                    fVar.f35043j = iPCallRechargeUI2.f19514d[intValue];
                    Intent intent = new Intent();
                    intent.putExtra("key_product_id", iPCallRechargeUI2.f19514d[intValue]);
                    intent.putExtra("key_currency_type", iPCallRechargeUI2.f19516f[intValue]);
                    intent.putExtra("key_price", iPCallRechargeUI2.f19516f[intValue] + iPCallRechargeUI2.f19515e[intValue]);
                    intent.putExtra("key_force_google", true);
                    if (iPCallRechargeUI2.f19527t.getItem(intValue) instanceof mx4) {
                        String str = ((mx4) iPCallRechargeUI2.f19527t.getItem(intValue)).f138281n;
                        if (!Util.isNullOrNil(str)) {
                            Log.m105924i("md5:%s", str);
                            rx4 rx4 = new rx4();
                            rx4.f141209d = str;
                            try {
                                intent.putExtra("key_ext_info", Base64.encodeToString(rx4.toByteArray(), 2));
                            } catch (IOException e) {
                                Log.m105920e("MicroMsg.IPCallRechargeUI", e.getMessage());
                            }
                        }
                    }
                    C88144b.m109795m(iPCallRechargeUI2, "wallet_index", ".ui.WalletIapUI", intent, 2001);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI$k$b */
        public class C4661b {

            /* renamed from: a */
            public TextView f19547a;

            /* renamed from: b */
            public TextView f19548b;

            /* renamed from: c */
            public TextView f19549c;

            /* renamed from: d */
            public TextView f19550d;

            /* renamed from: e */
            public Button f19551e;

            public C4661b(C4659k kVar, C4651c cVar) {
            }
        }

        public C4659k(IPCallRechargeUI iPCallRechargeUI) {
            Assert.assertTrue(iPCallRechargeUI != null);
            this.f19544e = iPCallRechargeUI;
        }

        public int getCount() {
            List<mx4> list = this.f19543d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            List<mx4> list = this.f19543d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C4661b bVar;
            C13821b bVar2;
            String str = null;
            if (view == null) {
                view = ((LayoutInflater) this.f19544e.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.b2p, viewGroup, false);
                bVar = new C4661b(this, (C4651c) null);
                bVar.f19547a = (TextView) view.findViewById(C0966R.C0970id.kv7);
                bVar.f19548b = (TextView) view.findViewById(C0966R.C0970id.kv5);
                bVar.f19549c = (TextView) view.findViewById(C0966R.C0970id.kv4);
                bVar.f19550d = (TextView) view.findViewById(C0966R.C0970id.f359425kv3);
                bVar.f19551e = (Button) view.findViewById(C0966R.C0970id.f357581al2);
                view.setTag(bVar);
            } else {
                bVar = (C4661b) view.getTag();
            }
            mx4 mx4 = (mx4) getItem(i);
            if (mx4 == null) {
                return view;
            }
            bVar.f19547a.setText(mx4.f138278h);
            bVar.f19548b.setText(mx4.f138279i);
            bVar.f19549c.setText(mx4.f138280j);
            if (Util.isNullOrNil(mx4.f138280j)) {
                bVar.f19549c.setVisibility(8);
            } else {
                bVar.f19549c.setVisibility(0);
            }
            if (this.f19545f != null) {
                TextView textView = bVar.f19550d;
                String string = this.f19544e.getString(C0966R.string.f360911fv2);
                Object[] objArr = new Object[2];
                String str2 = this.f19545f.f131640g;
                if (C13818a.f38951b.size() == 0) {
                    C13818a.m13116l();
                }
                if (!Util.isNullOrNil(str2) && (bVar2 = C13818a.f38951b.get(str2)) != null) {
                    str = bVar2.f38958c;
                }
                objArr[0] = str;
                objArr[1] = String.valueOf(mx4.f138276f);
                textView.setText(String.format(string, objArr));
            }
            bVar.f19551e.setTag(Integer.valueOf(i));
            bVar.f19551e.setOnClickListener(new C4660a());
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* renamed from: H7 */
    public final void mo5533H7(String str) {
        C42464d a = C42464d.m46136a();
        if (!a.f114953c) {
            a.mo66546b(false);
        }
        ArrayList<Integer> arrayList = a.f114951a;
        this.f19530w = new C11799f(arrayList.size() == 0 ? C13818a.m13112h(C110899d.m151192f()) : C13818a.m13112h(arrayList.get(0).toString()), str);
        C97625j3.m125815e().mo123460f(this.f19530w);
    }

    /* renamed from: I7 */
    public final void mo5534I7(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getString(C0966R.string.fwg);
        }
        C76879j.m92749t(this, str, getString(C0966R.string.fwg), new C4658j(this));
    }

    /* renamed from: J7 */
    public final boolean mo5535J7(String str) {
        int i;
        if ((((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WCOSecondPurchaseSwitch", 0) > 0) && (i = this.f19520j) >= 0) {
            Object item = this.f19527t.getItem(i);
            if (item instanceof mx4) {
                mx4 mx4 = (mx4) item;
                if (!Util.isNullOrNil(mx4.f138282o)) {
                    String str2 = mx4.f138282o;
                    Log.m105924i("MicroMsg.IPCallRechargeUI", "tryHandleShowWebViewPayDialog:" + str2);
                    C76879j.m92709C(this, str, getString(C0966R.string.fwg), getString(C0966R.string.fvs), getString(C0966R.string.f7926wf), true, new C4649a(str2), (DialogInterface.OnClickListener) null);
                    return true;
                }
            }
        }
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2q;
    }

    public final void init() {
        setMMTitle((int) C0966R.string.fuy);
        setBackBtn(new C4652d());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C4653e());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.fja);
        GridView gridView = (GridView) findViewById(C0966R.C0970id.ig8);
        this.f19526s = (ListView) findViewById(C0966R.C0970id.igb);
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.b2o, (ViewGroup) null);
        this.f19526s.addFooterView(viewGroup, (Object) null, false);
        C4659k kVar = new C4659k(this);
        this.f19527t = kVar;
        this.f19526s.setAdapter(kVar);
        this.f19528u = (TextView) viewGroup.findViewById(C0966R.C0970id.kms);
        Button button = (Button) findViewById(C0966R.C0970id.ap7);
        String string = getString(C0966R.string.fv4);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string);
        newSpannable.setSpan(new C4654f(), 0, string.length(), 33);
        this.f19528u.setText(newSpannable);
        this.f19528u.setMovementMethod(LinkMovementMethod.getInstance());
        this.f19529v = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.fug), true, true, new C4655g());
        mo5533H7("");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        String str3;
        int i9 = i;
        int i15 = i2;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.IPCallRechargeUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        String str4 = "";
        if (i9 == 2001) {
            if (intent2 != null) {
                i6 = intent2.getIntExtra("key_err_code", 0);
                String stringExtra = intent2.getStringExtra("key_err_msg");
                long longExtra = intent2.getLongExtra("key_launch_ts", 0);
                i8 = intent2.getIntExtra("key_gw_error_code", 0);
                i5 = intent2.getIntExtra("key_response_position", 0);
                boolean z2 = i6 == 100000001;
                Log.m105925i("MicroMsg.IPCallRechargeUI", "onActivityResult pay.errCode:[%d] errMsg:[%s] errGWCode:[%s] errPosition:[%d] isFailedConsume:[%s]", Integer.valueOf(i6), stringExtra, Integer.valueOf(i8), Integer.valueOf(i5), String.valueOf(z2));
                if (i6 != 6 || i8 == 0) {
                    str = "key_response_product_ids";
                    this.f19524q.f35041h = (long) i6;
                } else {
                    str = "key_response_product_ids";
                    this.f19524q.f35041h = (long) i8;
                }
                if (i5 == 3) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(257, 9, 1, true);
                    nVar.idkeyStat(257, 11, 1, true);
                    C12031f fVar = this.f19524q;
                    fVar.f35041h = (long) 0;
                    fVar.f35042i = (long) 2;
                    str3 = getString(C0966R.string.fxh);
                    str2 = "MicroMsg.IPCallRechargeUI";
                } else {
                    if (i5 != 1) {
                        if (i15 == -1 && i6 == 0) {
                            C115669n.INSTANCE.idkeyStat(257, 9, 1, true);
                        } else if (z2) {
                            C115669n nVar2 = C115669n.INSTANCE;
                            nVar2.idkeyStat(257, 9, 1, true);
                            nVar2.idkeyStat(257, 12, 1, true);
                            C12031f fVar2 = this.f19524q;
                            fVar2.f35041h = (long) 0;
                            str2 = "MicroMsg.IPCallRechargeUI";
                            fVar2.f35042i = (long) 1;
                            str3 = stringExtra;
                        }
                    }
                    str2 = "MicroMsg.IPCallRechargeUI";
                    str3 = stringExtra;
                }
                C12031f fVar3 = this.f19524q;
                fVar3.f35040g = longExtra;
                fVar3.getClass();
                fVar3.f35036c = Util.nowMilliSecond();
                this.f19524q.mo11891b();
                str4 = str3;
                i7 = -1;
            } else {
                str = "key_response_product_ids";
                str2 = "MicroMsg.IPCallRechargeUI";
                i8 = 0;
                i7 = -1;
                i6 = 0;
                i5 = 0;
            }
            if (i15 != i7) {
                return;
            }
            if (intent2 != null && i6 == 0) {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra(str);
                intent2.getStringArrayListExtra("key_response_series_ids");
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    Log.m105925i(str2, "buy product ok productId:", Util.nullAsNil(it.next()));
                }
                C115669n nVar3 = C115669n.INSTANCE;
                nVar3.idkeyStat(257, 6, 1, true);
                nVar3.idkeyStat(257, 10, 1, true);
                C76701a.makeText((Context) this, (int) C0966R.string.fwh, 0).show();
                finish();
            } else if (intent2 != null && i6 == 100000002) {
                C115669n.INSTANCE.idkeyStat(257, 6, 1, true);
                mo5534I7(str4);
            } else if (intent2 != null && i6 == 109) {
                mo5534I7(str4);
            } else if (intent2 != null && i6 == 1) {
                String string = getString(C0966R.string.fwf);
                C115669n.INSTANCE.idkeyStat(257, 8, 1, true);
                C76701a.makeText((Context) this, (CharSequence) string, 0).show();
            } else if (intent2 == null || i6 != 113) {
                C115669n.INSTANCE.idkeyStat(257, 7, 1, true);
                if (i5 == 3) {
                    mo5534I7(str4);
                } else if (i6 != 100000001 && i6 != 6) {
                } else {
                    if (i8 == 0) {
                        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.fud), 0).show();
                        return;
                    }
                    String string2 = getString(C0966R.string.fuf);
                    if (!mo5535J7(string2)) {
                        C76701a.makeText((Context) this, (CharSequence) string2, 0).show();
                    }
                }
            } else {
                C76879j.m92749t(this, getString(C0966R.string.f360913fw1), getString(C0966R.string.fwg), new C4656h());
            }
        } else {
            String str5 = "key_response_product_ids";
            String str6 = "MicroMsg.IPCallRechargeUI";
            if (i9 == 2002) {
                ProgressDialog progressDialog = this.f19529v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f19529v.dismiss();
                }
                if (intent2 != null) {
                    i4 = intent2.getIntExtra("key_err_code", 0);
                    str4 = intent2.getStringExtra("key_err_msg");
                    i3 = intent2.getIntExtra("key_response_position", 0);
                    z = i4 == 100000001;
                    Log.m105925i(str6, "onActivityResult restore.errCode:[%d] errMsg:[%s] errPosition:[%d] isFailedConsume:[%s]", Integer.valueOf(i4), str4, Integer.valueOf(i3), String.valueOf(z));
                } else {
                    i4 = 0;
                    i3 = 0;
                    z = false;
                }
                C12034i iVar = this.f19525r;
                iVar.f35053f = (long) i4;
                long j = (long) 0;
                iVar.f35051d = j;
                if (i15 != -1) {
                    iVar.f35052e = (long) 2;
                    Log.m105924i(str6, "onActivityResult. restore failed");
                    C76701a.makeText((Context) this, (int) C0966R.string.fwv, 0).show();
                } else if (intent2 == null || i4 != 0) {
                    if (z) {
                        iVar.f35052e = (long) 1;
                        C115669n.INSTANCE.idkeyStat(257, 17, 1, true);
                        str4 = getString(C0966R.string.fww);
                    } else if (i3 == 3) {
                        iVar.f35052e = (long) 2;
                        C115669n.INSTANCE.idkeyStat(257, 16, 1, true);
                    } else {
                        iVar.f35052e = (long) 2;
                    }
                    Log.m105924i(str6, "onActivityResult. restore not ok");
                    C76701a.makeText((Context) this, (CharSequence) str4, 0).show();
                } else {
                    ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra(str5);
                    if (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) {
                        this.f19525r.f35052e = (long) 3;
                        Log.m105924i(str6, "onActivityResult. no product can be restored");
                        C76701a.makeText((Context) this, (int) C0966R.string.fww, 0).show();
                    } else {
                        this.f19525r.f35052e = j;
                        C115669n.INSTANCE.idkeyStat(257, 15, 1, true);
                        Log.m105924i(str6, "onActivityResult. restore ok");
                        C76879j.m92749t(this, getString(C0966R.string.fwx), getString(C0966R.string.fwy), new C4657i());
                    }
                }
                C12034i iVar2 = this.f19525r;
                iVar2.getClass();
                iVar2.f35050c = Util.nowMilliSecond();
                this.f19525r.mo11891b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(v2helper.EMethodGetNetworkQuality, this);
        init();
        this.f19523p.mo11893d();
        C115669n.INSTANCE.idkeyStat(257, 4, 1, true);
    }

    public void onDestroy() {
        super.onDestroy();
        C12032g gVar = this.f19523p;
        gVar.getClass();
        gVar.f35045c = Util.nowMilliSecond();
        this.f19523p.mo11891b();
        C97625j3.m125815e().mo123470p(v2helper.EMethodGetNetworkQuality, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.IPCallRechargeUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", Integer.valueOf(i2), str);
        if (yVar instanceof C11799f) {
            C12032g gVar = this.f19523p;
            gVar.getClass();
            gVar.f35046d = Util.nowMilliSecond();
            gVar.f35047e = (long) i2;
            if (i == 0 && i2 == 0) {
                C11799f fVar = (C11799f) yVar;
                C48984cc2 cc22 = fVar.f34516e;
                C4659k kVar = this.f19527t;
                kVar.f19543d = cc22.f131638e;
                kVar.f19545f = cc22;
                kVar.notifyDataSetChanged();
                this.f19514d = new String[cc22.f131638e.size()];
                Iterator<mx4> it = cc22.f131638e.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    this.f19514d[i3] = it.next().f138275e;
                    i3++;
                }
                this.f19521n = cc22.f131643j;
                this.f19522o = cc22.f131644n;
                this.f19517g = cc22.f131642i;
                this.f19518h = cc22.f131641h;
                if (fVar.f34517f) {
                    Log.m105924i("MicroMsg.IPCallRechargeUI", "onSceneEnd IsUnkownCurency=true");
                    String[] strArr = this.f19514d;
                    if (strArr != null && strArr.length > 0) {
                        Log.m105924i("MicroMsg.IPCallRechargeUI", "startQueryGooglePrice");
                        String[] strArr2 = this.f19514d;
                        C9531b.C9532a aVar = this.f19531x;
                        String str2 = C6660r0.f23983a;
                        if (aVar == null || strArr2 == null || strArr2.length == 0) {
                            throw new IllegalArgumentException();
                        }
                        new C6659q0(this, strArr2, aVar).execute(new Void[0]);
                        return;
                    }
                    return;
                }
                ProgressDialog progressDialog = this.f19529v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f19529v.dismiss();
                }
                MMHandler mMHandler = this.f19532y;
                if (mMHandler != null) {
                    mMHandler.sendEmptyMessage(1002);
                    return;
                }
                return;
            }
            ProgressDialog progressDialog2 = this.f19529v;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f19529v.dismiss();
            }
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fud), 0).show();
            finish();
        }
    }
}
