package com.tencent.p014mm.plugin.recharge.p093ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c63.C67346c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83017j;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83018k;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.plugin.recharge.p093ui.MallEditText;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jg2.C76415b;
import ke3.C88144b;
import kg2.C46724d;
import kg2.C46725e;
import kg2.C46726g;
import kg2.C61094c;
import kg2.C76574a;
import kg2.C76575b;
import mg2.C76756a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p755xs.C102720b;
import qo3.C77389a;
import qo3.C77398g;
import te3.C50342m22;
import te3.C51580up1;

/* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI */
public class RechargeUI extends MMActivity implements MallEditText.C70426b, C11385n, C102720b.C78973a {

    /* renamed from: G */
    public static final /* synthetic */ int f203565G = 0;

    /* renamed from: A */
    public Map<String, Integer> f203566A = new HashMap();

    /* renamed from: B */
    public String f203567B;

    /* renamed from: C */
    public String f203568C;

    /* renamed from: D */
    public String f203569D;

    /* renamed from: E */
    public String f203570E;

    /* renamed from: F */
    public IListener f203571F = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(IEvent iEvent) {
            WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
            boolean z = false;
            if (walletPayResultEvent instanceof WalletPayResultEvent) {
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                if (aVar.f194091f) {
                    Log.m105922f("MicroMsg.MallRechargeUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    z = true;
                    if (aVar.f194088c != -1) {
                        Log.m105924i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
                    } else if (!RechargeUI.this.f203590y) {
                        Log.m105924i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
                        C76415b.wx0().vx0(RechargeUI.this.f203582q.getInputRecord());
                        RechargeUI.this.finish();
                        RechargeUI.this.f203590y = true;
                    }
                }
            } else {
                Log.m105922f("MicroMsg.MallRechargeUI", "mismatched event");
            }
            return z;
        }
    };

    /* renamed from: d */
    public Button f203572d = null;

    /* renamed from: e */
    public TextView f203573e = null;

    /* renamed from: f */
    public TextView f203574f = null;

    /* renamed from: g */
    public TextView f203575g = null;

    /* renamed from: h */
    public TextView f203576h = null;

    /* renamed from: i */
    public FrameLayout f203577i = null;

    /* renamed from: j */
    public ImageView f203578j = null;

    /* renamed from: n */
    public LinearLayout f203579n = null;

    /* renamed from: o */
    public C70450l f203580o = null;

    /* renamed from: p */
    public C70450l f203581p = null;

    /* renamed from: q */
    public MallEditText f203582q;

    /* renamed from: r */
    public TextView f203583r;

    /* renamed from: s */
    public Dialog f203584s = null;

    /* renamed from: t */
    public MallFunction f203585t = null;

    /* renamed from: u */
    public int f203586u;

    /* renamed from: v */
    public MallRechargeProduct f203587v = null;

    /* renamed from: w */
    public String f203588w = null;

    /* renamed from: x */
    public MallNews f203589x = null;

    /* renamed from: y */
    public boolean f203590y = false;

    /* renamed from: z */
    public boolean f203591z = true;

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$a */
    public class C70439a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f203593d;

        public C70439a(RechargeUI rechargeUI, C117747y yVar) {
            this.f203593d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f203593d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$b */
    public class C70440b implements DialogInterface.OnClickListener {
        public C70440b(RechargeUI rechargeUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$c */
    public class C70441c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f203594d;

        public C70441c(Bitmap bitmap) {
            this.f203594d = bitmap;
        }

        public void run() {
            RechargeUI.this.f203578j.setImageBitmap(this.f203594d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$d */
    public class C70442d implements MenuItem.OnMenuItemClickListener {
        public C70442d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RechargeUI.this.hideVKB();
            RechargeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$e */
    public class C70443e implements View.OnClickListener {
        public C70443e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", RechargeUI.this.f203569D);
            C88144b.m109791i(RechargeUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$f */
    public class C70444f implements View.OnClickListener {
        public C70444f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RechargeUI rechargeUI = RechargeUI.this;
            int i = RechargeUI.f203565G;
            if (rechargeUI.mo97048H7()) {
                RechargeUI rechargeUI2 = RechargeUI.this;
                boolean z = true;
                if (rechargeUI2.f203582q.getInputRecord().f224106d == 0) {
                    C76879j.m92707A(rechargeUI2, rechargeUI2.getString(C0966R.string.gov, new Object[]{rechargeUI2.f203582q.getText().toString()}), "", rechargeUI2.getString(C0966R.string.a4h), rechargeUI2.getString(C0966R.string.f360090a14), new C70472s(rechargeUI2), (DialogInterface.OnClickListener) null);
                    z = false;
                }
                if (z) {
                    RechargeUI rechargeUI3 = RechargeUI.this;
                    MallRechargeProduct mallRechargeProduct = rechargeUI3.f203587v;
                    rechargeUI3.mo97049I7(new C46726g(mallRechargeProduct.f203468e, mallRechargeProduct.f203467d, mallRechargeProduct.f203469f, rechargeUI3.mo97052L7()));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$g */
    public class C70445g implements View.OnClickListener {
        public C70445g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallEditText mallEditText = RechargeUI.this.f203582q;
            if (mallEditText.f203486i) {
                mallEditText.setInput((C76574a) null);
            } else {
                RechargeUI.this.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$h */
    public class C70446h implements View.OnClickListener {
        public C70446h() {
        }

        public void onClick(View view) {
            C70450l lVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C70450l lVar2 = RechargeUI.this.f203580o;
            if ((lVar2 != null && lVar2.getCount() > 0) || ((lVar = RechargeUI.this.f203581p) != null && lVar.getCount() > 0)) {
                RechargeUI.this.showDialog(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$i */
    public class C70447i implements View.OnClickListener {
        public C70447i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C67346c b = C67346c.m79699b();
            String str = RechargeUI.this.f203585t.f209731d;
            b.getClass();
            Log.m105918d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : " + str);
            if (!Util.isNullOrNil(str) && ((HashMap) b.f193199a).containsKey(str)) {
                MallNews mallNews = (MallNews) ((HashMap) b.f193199a).get(str);
                if ("1".equals(mallNews.f209743d)) {
                    mallNews.f209743d = "2";
                    b.mo91482g();
                }
            }
            RechargeUI.this.f203577i.setVisibility(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$j */
    public class C70448j implements View.OnClickListener {
        public C70448j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(RechargeUI.this.f203585t.f209739o.f209749j)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", RechargeUI.this.f203585t.f209739o.f209749j);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                C88144b.m109791i(RechargeUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$k */
    public class C70449k implements View.OnClickListener {
        public C70449k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RechargeUI.this.f203582q.getFocus();
            if (RechargeUI.this.f203582q.getInputRecord().f224106d == 2) {
                RechargeUI.this.f203582q.setInput((C76574a) null);
            }
            if (Util.isNullOrNil(RechargeUI.this.f203582q.getText().toString())) {
                RechargeUI.this.f203582q.f203484g.showDropDown();
            }
            RechargeUI.this.showVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.RechargeUI$l */
    public class C70450l extends BaseAdapter {

        /* renamed from: d */
        public List<MallRechargeProduct> f203604d = null;

        public C70450l(C70442d dVar) {
        }

        /* renamed from: a */
        public void mo97070a(int i) {
            for (int i2 = 0; i2 < this.f203604d.size(); i2++) {
                this.f203604d.get(i2).f203477q = false;
            }
            this.f203604d.get(i).f203477q = true;
        }

        /* renamed from: b */
        public void mo97071b(List<MallRechargeProduct> list) {
            this.f203604d = list;
            notifyDataSetChanged();
        }

        public int getCount() {
            List<MallRechargeProduct> list = this.f203604d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f203604d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) View.inflate(RechargeUI.this, C0966R.C0971layout.bq8, (ViewGroup) null);
            MallRechargeProduct mallRechargeProduct = this.f203604d.get(i);
            checkedTextView.setText(mallRechargeProduct.f203470g);
            checkedTextView.setEnabled(mallRechargeProduct.mo96998a());
            if (mallRechargeProduct.f203477q) {
                checkedTextView.setChecked(true);
            } else {
                checkedTextView.setChecked(false);
            }
            return checkedTextView;
        }

        public boolean isEnabled(int i) {
            if (!this.f203604d.get(i).mo96998a()) {
                return false;
            }
            return super.isEnabled(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad A[ADDED_TO_REGION] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97048H7() {
        /*
            r11 = this;
            com.tencent.mm.plugin.recharge.ui.MallEditText r0 = r11.f203582q
            int r1 = r0.getVisibility()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = r0.getText()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r4 = ", editType:"
            java.lang.String r5 = "View:"
            java.lang.String r6 = "MicroMsg.MallEditText"
            if (r1 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = r0.f203489o
            r1.append(r5)
            r1.append(r4)
            int r0 = r0.f203495u
            r1.append(r0)
            java.lang.String r0 = " checkInputValid : empty "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
        L_0x003b:
            r0 = 0
            goto L_0x0065
        L_0x003d:
            boolean r1 = r0.f203497w
            if (r1 == 0) goto L_0x0042
            goto L_0x0064
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = r0.f203489o
            r1.append(r5)
            r1.append(r4)
            int r0 = r0.f203495u
            r1.append(r0)
            java.lang.String r0 = " checkInputValid : illegal "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x003b
        L_0x0064:
            r0 = 1
        L_0x0065:
            java.lang.String r1 = "MicroMsg.MallRechargeUI"
            if (r0 == 0) goto L_0x00ad
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct r4 = r11.f203587v
            if (r4 == 0) goto L_0x00ad
            boolean r4 = r4.mo96998a()
            if (r4 == 0) goto L_0x00ad
            boolean r0 = r11.mo97054N7()
            if (r0 == 0) goto L_0x009a
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct r0 = r11.f203587v
            boolean r2 = r0.f203479s
            if (r2 == 0) goto L_0x009a
            kg2.d r2 = new kg2.d
            int r5 = r0.f203478r
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r4 = r11.f203585t
            java.lang.String r6 = r4.f209731d
            java.lang.String r7 = r0.f203469f
            java.lang.String r8 = r0.f203468e
            java.lang.String r9 = r11.mo97052L7()
            java.lang.String r10 = r11.mo97051K7()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.mo97049I7(r2)
        L_0x009a:
            r11.hideVKB()
            android.widget.Button r0 = r11.f203572d
            r0.setEnabled(r3)
            android.widget.Button r0 = r11.f203572d
            r0.setClickable(r3)
            java.lang.String r0 = "checkInfo : true"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            return r3
        L_0x00ad:
            if (r0 != 0) goto L_0x00b6
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct r0 = r11.f203587v
            if (r0 == 0) goto L_0x00b6
            r0.getClass()
        L_0x00b6:
            android.widget.Button r0 = r11.f203572d
            r0.setEnabled(r2)
            android.widget.Button r0 = r11.f203572d
            r0.setClickable(r2)
            java.lang.String r0 = "checkInfo : false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recharge.p093ui.RechargeUI.mo97048H7():boolean");
    }

    /* renamed from: I7 */
    public final void mo97049I7(C117747y yVar) {
        if (yVar.getType() == 497 || yVar.getType() == 1555) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(yVar);
        } else if (!this.f203591z) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(yVar);
        } else {
            Dialog dialog = this.f203584s;
            if (dialog == null || (dialog != null && !dialog.isShowing())) {
                this.f203584s = C75197d0.m90164e(getContext(), true, new C70439a(this, yVar));
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(yVar);
        }
    }

    /* renamed from: J7 */
    public final String mo97050J7(int i, String str, String str2) {
        return i + "-" + str + "-" + str2;
    }

    /* renamed from: K7 */
    public final String mo97051K7() {
        return C76575b.m92141a(this.f203582q.getText());
    }

    /* renamed from: L7 */
    public final String mo97052L7() {
        return "mobile=" + C76575b.m92141a(this.f203582q.getText());
    }

    /* renamed from: M7 */
    public final List<MallRechargeProduct> mo97053M7(int i, List<MallRechargeProduct> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            boolean z = false;
            for (int i2 = 0; i2 < list.size(); i2++) {
                MallRechargeProduct mallRechargeProduct = list.get(i2);
                if (mallRechargeProduct.f203478r == i) {
                    arrayList.add(mallRechargeProduct);
                    if (mallRechargeProduct.f203477q) {
                        if (z) {
                            mallRechargeProduct.f203477q = false;
                        }
                        z = true;
                    }
                }
            }
            if (!z && arrayList.size() > 0) {
                ((MallRechargeProduct) arrayList.get(0)).f203477q = true;
            }
        }
        return arrayList;
    }

    /* renamed from: N7 */
    public final boolean mo97054N7() {
        MallRechargeProduct mallRechargeProduct = this.f203587v;
        return !((HashMap) this.f203566A).containsKey(mo97050J7(mallRechargeProduct.f203478r, mallRechargeProduct.f203469f, mo97051K7()));
    }

    /* renamed from: O7 */
    public void mo97055O7() {
        if (Util.isNullOrNil(this.f203582q.getText()) || this.f203582q.mo97003a()) {
            this.f203582q.setInfoTvImageResource(C0966R.C0969drawable.ao7);
        } else {
            this.f203582q.setInfoTvImageResource(C0966R.C0969drawable.abe);
        }
    }

    /* renamed from: P7 */
    public final void mo97056P7(List<MallRechargeProduct> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                MallRechargeProduct mallRechargeProduct = list.get(i);
                if (mallRechargeProduct.f203478r == 2) {
                    MallRechargeProduct mallRechargeProduct2 = this.f203587v;
                    if (mallRechargeProduct2 != null && mallRechargeProduct.f203469f.equals(mallRechargeProduct2.f203469f)) {
                        mallRechargeProduct.f203477q = true;
                        z = true;
                    }
                    arrayList.add(mallRechargeProduct);
                }
            }
            if (!z && arrayList.size() > 0) {
                ((MallRechargeProduct) arrayList.get(0)).f203477q = true;
            }
            this.f203581p.mo97071b(arrayList);
            return;
        }
        this.f203581p.mo97071b(new ArrayList());
    }

    /* renamed from: Q7 */
    public final void mo97057Q7() {
        MallNews mallNews;
        String str;
        Log.m105918d("MicroMsg.MallRechargeUI", "mCheckedProduct " + this.f203587v);
        MallRechargeProduct mallRechargeProduct = this.f203587v;
        if (mallRechargeProduct != null) {
            this.f203583r.setText(mallRechargeProduct.f203470g);
            TextView textView = this.f203575g;
            MallRechargeProduct mallRechargeProduct2 = this.f203587v;
            if (!mallRechargeProduct2.mo96998a()) {
                str = getString(C0966R.string.f361019gp0);
            } else if (mallRechargeProduct2.f203472i != mallRechargeProduct2.f203473j || (mo97054N7() && this.f203587v.f203479s)) {
                str = "";
            } else {
                str = String.format(getString(C0966R.string.f361022gp3), new Object[]{Float.valueOf(mallRechargeProduct2.f203472i)});
            }
            textView.setText(str);
        }
        MallNews mallNews2 = this.f203589x;
        if (mallNews2 == null || (mallNews = this.f203585t.f209739o) == null || !mallNews2.equals(mallNews) || "1".equals(this.f203589x.f209743d)) {
            MallNews mallNews3 = this.f203585t.f209739o;
            if (mallNews3 == null || Util.isNullOrNil(mallNews3.f209750n)) {
                this.f203577i.setVisibility(8);
                Log.m105918d("MicroMsg.MallRechargeUI", "dismiss banner!");
            } else {
                this.f203588w = this.f203585t.f209739o.f209750n;
                this.f203578j.setImageBitmap(((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C76756a(this.f203588w)));
                this.f203577i.setVisibility(0);
                Log.m105918d("MicroMsg.MallRechargeUI", "Show banner!");
            }
        } else {
            this.f203577i.setVisibility(8);
            Log.m105918d("MicroMsg.MallRechargeUI", "dismiss banner!, news->" + this.f203589x.toString());
        }
        this.f203574f.setVisibility(4);
        if (!mo97048H7()) {
            this.f203573e.setText("");
        } else if (this.f203587v != null && !mo97054N7()) {
            this.f203573e.setText(this.f203587v.f203471h);
            this.f203573e.setTextColor(getResources().getColor(C0966R.color.f3563xt));
        }
        String string = getString(C0966R.string.gos);
        if (!TextUtils.isEmpty(this.f203568C)) {
            string = this.f203568C;
        }
        if (!Util.isNullOrNil(this.f203567B)) {
            addTextOptionMenu(0, string, new C70477x(this));
        }
        if (!Util.isNullOrNil(this.f203569D)) {
            this.f203576h.setVisibility(0);
        } else {
            this.f203576h.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f203570E)) {
            this.f203576h.setText(this.f203570E);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bqa;
    }

    public void hideVKB() {
        View currentFocus;
        IBinder windowToken;
        Log.m105918d("MicroMsg.MallRechargeUI", "hideVKB");
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public void initView() {
        setMMTitle(this.f203585t.f209732e);
        Log.m105926v("MicroMsg.MallRechargeUI", "initView");
        setBackBtn(new C70442d());
        this.f203573e = (TextView) findViewById(C0966R.C0970id.gmh);
        this.f203574f = (TextView) findViewById(C0966R.C0970id.gns);
        this.f203575g = (TextView) findViewById(C0966R.C0970id.gnu);
        this.f203572d = (Button) findViewById(C0966R.C0970id.hfe);
        this.f203579n = (LinearLayout) findViewById(C0966R.C0970id.glv);
        TextView textView = (TextView) findViewById(C0966R.C0970id.gnt);
        this.f203576h = textView;
        textView.setOnClickListener(new C70443e());
        this.f203572d.setOnClickListener(new C70444f());
        MallEditText mallEditText = (MallEditText) findViewById(C0966R.C0970id.gly);
        this.f203582q = mallEditText;
        mallEditText.setInfoTvOnClickListener(new C70445g());
        this.f203583r = (TextView) findViewById(C0966R.C0970id.gmm);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_product_list");
        List<MallRechargeProduct> M7 = mo97053M7(0, parcelableArrayListExtra);
        List<MallRechargeProduct> M72 = mo97053M7(2, parcelableArrayListExtra);
        ArrayList arrayList = (ArrayList) M7;
        ArrayList arrayList2 = (ArrayList) M72;
        this.f203586u = arrayList.size() > arrayList2.size() ? arrayList.size() : arrayList2.size();
        C70450l lVar = new C70450l((C70442d) null);
        this.f203580o = lVar;
        lVar.mo97071b(M7);
        C70450l lVar2 = new C70450l((C70442d) null);
        this.f203581p = lVar2;
        lVar2.mo97071b(M72);
        this.f203579n.setOnClickListener(new C70446h());
        this.f203577i = (FrameLayout) findViewById(C0966R.C0970id.gnp);
        this.f203578j = (ImageView) findViewById(C0966R.C0970id.gnr);
        ((ImageView) findViewById(C0966R.C0970id.gnq)).setOnClickListener(new C70447i());
        this.f203577i.setOnClickListener(new C70448j());
        this.f203582q.setOnInputValidChangeListener(this);
        this.f203582q.setOnClickListener(new C70449k());
        mo97055O7();
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
        mo97057Q7();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        String str2 = this.f203588w;
        if (str2 != null && str.equals(str2)) {
            this.f203578j.post(new C70441c(bitmap));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r0 = -1
            r1 = 2
            r2 = 1
            java.lang.String r3 = "MicroMsg.MallRechargeUI"
            if (r13 == r2) goto L_0x0031
            if (r13 == r1) goto L_0x000b
            goto L_0x016b
        L_0x000b:
            if (r14 != r0) goto L_0x002a
            boolean r0 = r12.f203590y
            if (r0 != 0) goto L_0x016b
            java.lang.String r0 = "MallRecharge pay result : ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            jg2.b r0 = jg2.C76415b.wx0()
            com.tencent.mm.plugin.recharge.ui.MallEditText r1 = r12.f203582q
            kg2.a r1 = r1.getInputRecord()
            r0.vx0(r1)
            r12.finish()
            r12.f203590y = r2
            goto L_0x016b
        L_0x002a:
            java.lang.String r0 = "MallRecharge pay result : cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x016b
        L_0x0031:
            if (r14 != r0) goto L_0x016b
            android.net.Uri r5 = r15.getData()
            if (r5 != 0) goto L_0x0040
            java.lang.String r13 = "uri == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
            return
        L_0x0040:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            java.lang.String r4 = "android.permission.READ_CONTACTS"
            boolean r0 = r0.Lb0(r12, r4)
            if (r0 != 0) goto L_0x0057
            java.lang.String r13 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
            return
        L_0x0057:
            android.content.ContentResolver r4 = r12.getContentResolver()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)
            r4 = 0
            if (r0 == 0) goto L_0x0134
            int r5 = r0.getCount()
            if (r5 <= 0) goto L_0x0134
            r0.moveToFirst()
            java.lang.String r5 = "has_phone_number"
            int r5 = r0.getColumnIndex(r5)
            if (r5 <= 0) goto L_0x007d
            int r5 = r0.getInt(r5)
            if (r5 <= 0) goto L_0x0134
        L_0x007d:
            java.lang.String r5 = "_id"
            int r5 = r0.getColumnIndex(r5)
            java.lang.String r5 = r0.getString(r5)
            android.content.ContentResolver r6 = r12.getContentResolver()
            android.net.Uri r7 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "contact_id = "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r10 = 0
            r11 = 0
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)
            boolean r6 = r5.moveToFirst()
            if (r6 == 0) goto L_0x0129
            r6 = r4
        L_0x00ac:
            boolean r7 = r5.isAfterLast()
            if (r7 != 0) goto L_0x012a
            java.lang.String r6 = "data1"
            int r6 = r5.getColumnIndex(r6)
            java.lang.String r7 = "display_name"
            int r7 = r5.getColumnIndex(r7)
            java.lang.String r6 = r5.getString(r6)
            java.lang.String r7 = r5.getString(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "username : "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r8)
            if (r6 == 0) goto L_0x0124
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "phoneNumber : "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r8)
            java.lang.String r6 = kg2.C76575b.m92141a(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r8)
            boolean r8 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r6)
            if (r8 == 0) goto L_0x010f
            r4 = r6
        L_0x010f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "phoneResult : "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r6)
        L_0x0124:
            r5.moveToNext()
            r6 = r7
            goto L_0x00ac
        L_0x0129:
            r6 = r4
        L_0x012a:
            boolean r3 = r5.isClosed()
            if (r3 != 0) goto L_0x0135
            r5.close()
            goto L_0x0135
        L_0x0134:
            r6 = r4
        L_0x0135:
            if (r0 == 0) goto L_0x0140
            boolean r3 = r0.isClosed()
            if (r3 != 0) goto L_0x0140
            r0.close()
        L_0x0140:
            boolean r0 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r4)
            if (r0 == 0) goto L_0x0168
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r12.f203566A
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            com.tencent.mm.plugin.recharge.ui.MallEditText r0 = r12.f203582q
            kg2.a r1 = new kg2.a
            r1.<init>(r4, r6, r2)
            r0.setInput(r1)
            android.widget.TextView r0 = r12.f203573e
            java.lang.String r1 = ""
            r0.setText(r1)
            android.widget.TextView r0 = r12.f203574f
            r1 = 4
            r0.setVisibility(r1)
            r12.mo97048H7()
            goto L_0x016b
        L_0x0168:
            r12.showDialog(r1)
        L_0x016b:
            super.onActivityResult(r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recharge.p093ui.RechargeUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f203585t = (MallFunction) intent.getParcelableExtra("key_func_info");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_product_list");
        this.f203591z = !intent.getBooleanExtra("key_is_hide_progress", false);
        if (this.f203585t == null) {
            Log.m105920e("MicroMsg.MallRechargeUI", "function info is null");
            C76912y0.makeText((Context) this, (CharSequence) "function info is null", 1).show();
            return;
        }
        if (parcelableArrayListExtra == null) {
            Log.m105918d("MicroMsg.MallRechargeUI", "function info : " + this.f203585t.f209732e);
            mo97049I7(new C46725e(this.f203585t.f209731d));
        } else {
            this.f203587v = C70454d.m83006a(parcelableArrayListExtra);
        }
        Log.m105924i("MicroMsg.MallRechargeUI", "onCreate()");
        this.f203589x = C67346c.m79699b().mo91481f(this.f203585t.f209731d);
        initView();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return C76879j.m92712F(this, getString(C0966R.string.f361021gp2), "", true);
        }
        int color = getResources().getColor(C0966R.color.ajy);
        int color2 = getResources().getColor(C0966R.color.akw);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.bq7, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ifz);
        ListViewInScrollView listViewInScrollView = (ListViewInScrollView) inflate.findViewById(C0966R.C0970id.f359025ig3);
        ListViewInScrollView listViewInScrollView2 = (ListViewInScrollView) inflate.findViewById(C0966R.C0970id.ig7);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f359022ig0);
        View findViewById = inflate.findViewById(C0966R.C0970id.f359024ig2);
        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.ig4);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.ig6);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0966R.C0970id.igi);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (getResources().getDimensionPixelSize(C0966R.dimen.f3937jj) * this.f203586u) + 4;
        relativeLayout.setLayoutParams(layoutParams);
        listViewInScrollView.setAdapter(this.f203580o);
        listViewInScrollView.setOnItemClickListener(new C70473t(this));
        listViewInScrollView2.setAdapter(this.f203581p);
        listViewInScrollView2.setOnItemClickListener(new C70474u(this));
        int i2 = color2;
        C70475v vVar = r0;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f359023ig1);
        ListViewInScrollView listViewInScrollView3 = listViewInScrollView2;
        int i3 = color;
        TextView textView4 = textView;
        C70475v vVar2 = new C70475v(this, findViewById, textView2, i2, listViewInScrollView, findViewById2, textView3, i3, listViewInScrollView3, textView);
        findViewById3.setOnClickListener(vVar);
        inflate.findViewById(C0966R.C0970id.ig5).setOnClickListener(new C70476w(this, findViewById2, textView3, i2, listViewInScrollView3, findViewById, textView2, i3, listViewInScrollView, textView));
        if (this.f203580o.getCount() == 0) {
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = null;
        aVar.f225627J = inflate;
        aVar.f225622E = null;
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        return gVar;
    }

    public void onDestroy() {
        this.f203571F.dead();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C83031z.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C83017j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C83018k.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1555, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C83031z.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C83017j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C83018k.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1555, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        MallRechargeProduct mallRechargeProduct;
        int i3 = i;
        int i4 = i2;
        String str3 = str;
        C117747y yVar2 = yVar;
        Log.m105918d("MicroMsg.MallRechargeUI", "onSceneEnd errType = " + i3 + ", errCode = " + i4);
        Dialog dialog = this.f203584s;
        if (!(dialog == null || !dialog.isShowing() || yVar.getType() == 497)) {
            this.f203584s.dismiss();
            this.f203584s = null;
        }
        if (i3 == 0 && i4 == 0) {
            if (yVar2 instanceof C46725e) {
                C46725e eVar = (C46725e) yVar2;
                ArrayList<MallRechargeProduct> arrayList = eVar.f125788f;
                if (arrayList != null) {
                    this.f203587v = C70454d.m83006a(arrayList);
                    Log.m105918d("MicroMsg.MallRechargeUI", "mCheckedProduct again" + this.f203587v);
                }
                this.f203567B = eVar.f125790h;
                this.f203568C = eVar.f125791i;
                this.f203569D = eVar.f125792j;
                this.f203570E = eVar.f125793n;
                Log.m105918d("MicroMsg.MallRechargeUI", "mProductList " + arrayList);
                mo97057Q7();
                List<MallRechargeProduct> M7 = mo97053M7(0, arrayList);
                List<MallRechargeProduct> M72 = mo97053M7(2, arrayList);
                ArrayList arrayList2 = (ArrayList) M7;
                ArrayList arrayList3 = (ArrayList) M72;
                this.f203586u = arrayList2.size() > arrayList3.size() ? arrayList2.size() : arrayList3.size();
                this.f203580o.mo97071b(M7);
                this.f203581p.mo97071b(M72);
            } else if (yVar2 instanceof C46724d) {
                Log.m105918d("MicroMsg.MallRechargeUI", "checkProduct: " + this.f203587v);
                C46724d dVar = (C46724d) yVar2;
                MallRechargeProduct mallRechargeProduct2 = this.f203587v;
                if (!(mallRechargeProduct2 == null || (str2 = mallRechargeProduct2.f203469f) == null || (mallRechargeProduct = dVar.f125779f) == null || ((!str2.equals(mallRechargeProduct.f203469f) || !mo97051K7().equals(dVar.f125784n)) && dVar.f125783j == 2))) {
                    MallRechargeProduct mallRechargeProduct3 = dVar.f125779f;
                    MallRechargeProduct mallRechargeProduct4 = this.f203587v;
                    mallRechargeProduct4.f203468e = mallRechargeProduct3.f203468e;
                    mallRechargeProduct4.f203467d = mallRechargeProduct3.f203467d;
                    mallRechargeProduct4.f203469f = mallRechargeProduct3.f203469f;
                    mallRechargeProduct4.f203470g = mallRechargeProduct3.f203470g;
                    mallRechargeProduct4.f203471h = mallRechargeProduct3.f203471h;
                    mallRechargeProduct4.f203472i = mallRechargeProduct3.f203472i;
                    mallRechargeProduct4.f203473j = mallRechargeProduct3.f203473j;
                    mallRechargeProduct4.f203474n = mallRechargeProduct3.f203474n;
                    mallRechargeProduct4.f203475o = mallRechargeProduct3.f203475o;
                    mallRechargeProduct4.f203476p = mallRechargeProduct3.f203476p;
                    mallRechargeProduct4.f203478r = mallRechargeProduct3.f203478r;
                    mallRechargeProduct4.f203477q = true;
                    ((HashMap) this.f203566A).put(mo97050J7(dVar.f125783j, mallRechargeProduct3.f203469f, dVar.f125784n), 1);
                    mo97057Q7();
                    this.f203574f.setText(str3);
                    this.f203574f.setVisibility(0);
                    this.f203574f.setTextColor(getResources().getColor(C0966R.color.f3540x5));
                }
                if (dVar.f125783j == 2) {
                    MallRechargeProduct mallRechargeProduct5 = this.f203587v;
                    if (mallRechargeProduct5 == null || !mallRechargeProduct5.f203469f.equals(dVar.f125785o) || !mo97051K7().equals(dVar.f125784n)) {
                        this.f203572d.setEnabled(true);
                        this.f203572d.setClickable(true);
                        this.f203574f.setText((CharSequence) null);
                    } else if (((C50342m22) dVar.f125778e.f127056b.f127083a).f137768e != 0 || !this.f203587v.f203469f.equals(dVar.f125779f.f203469f)) {
                        this.f203572d.setEnabled(false);
                        this.f203572d.setClickable(false);
                        this.f203574f.setText(((C50342m22) dVar.f125778e.f127056b.f127083a).f137769f);
                        this.f203574f.setVisibility(0);
                        this.f203574f.setTextColor(getResources().getColor(C0966R.color.a_0));
                    } else {
                        String str4 = this.f203587v.f203467d;
                        String K7 = mo97051K7();
                        MallRechargeProduct mallRechargeProduct6 = this.f203587v;
                        mo97049I7(new C61094c(str4, K7, mallRechargeProduct6.f203470g, mallRechargeProduct6.f203468e, mo97052L7()));
                    }
                }
                mo97056P7(dVar.f125780g);
                Log.m105918d("MicroMsg.MallRechargeUI", "NetSceneGetLatestPayProductInfo  mCheckedProduct " + this.f203587v);
            } else if (yVar2 instanceof C46726g) {
                PayInfo payInfo = ((C46726g) yVar2).f125796f;
                payInfo.f212587e = 6;
                payInfo.f212588f = 100;
                C76331i.m91761e(this, payInfo, 2);
                this.f203571F.alive();
            } else if (yVar2 instanceof C61094c) {
                C61094c cVar = (C61094c) yVar2;
                MallRechargeProduct mallRechargeProduct7 = this.f203587v;
                if (mallRechargeProduct7 == null || !mallRechargeProduct7.f203470g.equals(cVar.f173959g) || !mo97051K7().equals(cVar.f173958f)) {
                    this.f203572d.setEnabled(true);
                    this.f203572d.setClickable(true);
                    this.f203574f.setText((CharSequence) null);
                } else if (((C51580up1) cVar.f173957e.f127056b.f127083a).f143013d != 0) {
                    this.f203572d.setEnabled(false);
                    this.f203572d.setClickable(false);
                    this.f203574f.setText(((C51580up1) cVar.f173957e.f127056b.f127083a).f143014e);
                    this.f203574f.setVisibility(0);
                    this.f203574f.setTextColor(getResources().getColor(C0966R.color.a_0));
                }
            }
        } else if (!(yVar2 instanceof C61094c)) {
            if (yVar2 instanceof C46724d) {
                if (i4 == 100) {
                    this.f203572d.setEnabled(true);
                    this.f203572d.setClickable(true);
                } else {
                    this.f203572d.setEnabled(false);
                    this.f203572d.setClickable(false);
                }
                C46724d dVar2 = (C46724d) yVar2;
                mo97056P7(dVar2.f125780g);
                this.f203574f.setText(str3);
                this.f203574f.setVisibility(0);
                this.f203574f.setTextColor(getResources().getColor(C0966R.color.a_0));
                this.f203573e.setText(dVar2.f125782i);
                this.f203573e.setTextColor(getResources().getColor(C0966R.color.a_0));
                return;
            }
            C76879j.m92713G(this, Util.isNullOrNil(str) ? getString(C0966R.string.l_3) : str3, (String) null, false, new C70440b(this));
        }
    }

    public void showVKB() {
        View currentFocus;
        Log.m105918d("MicroMsg.MallRechargeUI", "showVKB");
        this.f203582q.setInfoTvImageResource(C0966R.C0969drawable.abe);
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.showSoftInput(currentFocus, 2);
        }
    }
}
