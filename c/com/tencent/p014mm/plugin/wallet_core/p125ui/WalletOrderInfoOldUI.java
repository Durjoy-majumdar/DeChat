package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CardOfflinePayFinishButtonEvent;
import com.tencent.p014mm.autogen.events.ChangePayActivityViewEvent;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletOfflineRealNameNotifyEvent;
import com.tencent.p014mm.p136ui.base.MaxListView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import id2.C76313t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import p281yz.C79173v;
import p763ym.C79138l;
import p910lj.C76701a;
import st1.C77781t;
import ul0.C90694b;
import v53.C78342e0;
import v53.C78343f0;
import v53.C78344g0;
import v53.C78353t;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI */
public class WalletOrderInfoOldUI extends WalletOrderInfoUI {

    /* renamed from: A */
    public C72299j f210181A;

    /* renamed from: B */
    public HashMap<String, C72296h> f210182B = new HashMap<>();

    /* renamed from: C */
    public boolean f210183C = false;

    /* renamed from: D */
    public IListener f210184D;

    /* renamed from: E */
    public C75597w2.C31525a f210185E;

    /* renamed from: F */
    public View.OnLongClickListener f210186F;

    /* renamed from: G */
    public IListener f210187G;

    /* renamed from: g */
    public LinearLayout f210188g = null;

    /* renamed from: h */
    public TextView f210189h = null;

    /* renamed from: i */
    public TextView f210190i = null;

    /* renamed from: j */
    public List<Orders.Commodity> f210191j = null;

    /* renamed from: n */
    public Orders f210192n;

    /* renamed from: o */
    public C72292g f210193o = null;

    /* renamed from: p */
    public boolean f210194p = false;

    /* renamed from: q */
    public Set<String> f210195q = null;

    /* renamed from: r */
    public boolean f210196r = true;

    /* renamed from: s */
    public boolean f210197s = false;

    /* renamed from: t */
    public HashMap<String, TextView> f210198t = new HashMap<>();

    /* renamed from: u */
    public String f210199u;

    /* renamed from: v */
    public String f210200v;

    /* renamed from: w */
    public C72297i f210201w;

    /* renamed from: x */
    public Map<Long, String> f210202x = new HashMap();

    /* renamed from: y */
    public PayInfo f210203y;

    /* renamed from: z */
    public String f210204z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$b */
    public class C5784b implements C75597w2.C31525a {
        public C5784b() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer " + str + " succ: " + z);
            WalletOrderInfoOldUI.this.mo99607N7(z1Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$d */
    public class C5785d implements C76879j.C11180n {
        public C5785d() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                WalletOrderInfoOldUI.this.f210183C = false;
                WalletOrderInfoOldUI.this.getClass();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:null"));
                intent.addFlags(268435456);
                WalletOrderInfoOldUI walletOrderInfoOldUI = WalletOrderInfoOldUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletOrderInfoOldUI walletOrderInfoOldUI2 = walletOrderInfoOldUI;
                C117292a.m165358d(walletOrderInfoOldUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletOrderInfoOldUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletOrderInfoOldUI2, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$f */
    public class C5786f implements View.OnLongClickListener {
        public C5786f() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view.getId() == C0966R.C0970id.lhz || view.getId() == C0966R.C0970id.lir) {
                try {
                    String str = (String) view.getTag();
                    C76701a.makeText((Context) WalletOrderInfoOldUI.this, (int) C0966R.string.f361582l04, 0).show();
                    ClipboardHelper.setText(WalletOrderInfoOldUI.this.getContext(), str, str);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletOrderInfoOldUI", e, "", new Object[0]);
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$a */
    public class C72289a implements DialogInterface.OnClickListener {
        public C72289a(WalletOrderInfoOldUI walletOrderInfoOldUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$c */
    public class C72290c implements DialogInterface.OnClickListener {
        public C72290c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletOrderInfoOldUI.this.mo99608O7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$e */
    public class C72291e implements View.OnClickListener {
        public C72291e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletOrderInfoOldUI walletOrderInfoOldUI = WalletOrderInfoOldUI.this;
            C75228t.m90219L(walletOrderInfoOldUI, ((Orders.Commodity) ((ArrayList) walletOrderInfoOldUI.f210192n.f209542M).get(0)).f209594J.f209711b, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g */
    public class C72292g extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$a */
        public class C72293a implements AdapterView.OnItemClickListener {
            public C72293a() {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Long.valueOf(j));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
                Orders.Promotions promotions = (Orders.Promotions) ((ArrayList) WalletOrderInfoOldUI.this.f210201w.f210237d).get(i);
                if (!Util.isNullOrNil(promotions.f209669i)) {
                    if (((HashSet) WalletOrderInfoOldUI.this.f210195q).contains(promotions.f209669i)) {
                        ((HashSet) WalletOrderInfoOldUI.this.f210195q).remove(promotions.f209669i);
                    } else {
                        ((HashSet) WalletOrderInfoOldUI.this.f210195q).add(promotions.f209669i);
                    }
                    WalletOrderInfoOldUI.this.f210193o.notifyDataSetChanged();
                } else {
                    String Q7 = WalletOrderInfoOldUI.this.mo99610Q7(promotions.f209672o);
                    if ("-1".equals(Q7) || "3".equals(Q7)) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.mo160131h(13472, WalletOrderInfoOldUI.this.f210204z, Integer.valueOf(promotions.f209673p), 1, Long.valueOf(promotions.f209672o), Long.valueOf(promotions.f209680w));
                        nVar.mo160131h(13033, 2, "", promotions.f209668h, promotions.f209666f, "");
                        if (Util.isNullOrNil(promotions.f209678u) || Util.isNullOrNil(promotions.f209679v)) {
                            int i2 = promotions.f209673p;
                            if (i2 == 1) {
                                WalletOrderInfoOldUI walletOrderInfoOldUI = WalletOrderInfoOldUI.this;
                                walletOrderInfoOldUI.getClass();
                                walletOrderInfoOldUI.doSceneForceProgress(new C78353t(promotions, walletOrderInfoOldUI.getPayReqKey(), walletOrderInfoOldUI.f210200v, promotions.f209680w));
                            } else if (i2 != 2 || Util.isNullOrNil(promotions.f209668h)) {
                                Log.m105920e("MicroMsg.WalletOrderInfoOldUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                            } else {
                                if (WalletOrderInfoOldUI.this.f210182B.containsKey(promotions.f209672o + "")) {
                                    C72296h hVar = WalletOrderInfoOldUI.this.f210182B.get(promotions.f209672o + "");
                                    Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "go to new url %s", hVar.f210232a);
                                    WalletOrderInfoOldUI walletOrderInfoOldUI2 = WalletOrderInfoOldUI.this;
                                    String str = hVar.f210232a;
                                    walletOrderInfoOldUI2.mo99613T7();
                                    C75228t.m90219L(walletOrderInfoOldUI2, str, false);
                                    walletOrderInfoOldUI2.f210183C = false;
                                } else {
                                    WalletOrderInfoOldUI walletOrderInfoOldUI3 = WalletOrderInfoOldUI.this;
                                    String str2 = promotions.f209668h;
                                    walletOrderInfoOldUI3.f210199u = str2;
                                    WalletOrderInfoOldUI walletOrderInfoOldUI4 = walletOrderInfoOldUI3;
                                    C72299j jVar = new C72299j(walletOrderInfoOldUI4, promotions.f209672o + "", promotions.f209674q + "", promotions.f209675r + "", promotions.f209676s + "", WalletOrderInfoOldUI.this.getPayReqKey(), WalletOrderInfoOldUI.this.f210204z, promotions.f209680w);
                                    walletOrderInfoOldUI3.mo99613T7();
                                    walletOrderInfoOldUI3.f210181A = jVar;
                                    C75228t.m90220M(walletOrderInfoOldUI3, str2, false, 1);
                                    walletOrderInfoOldUI3.f210183C = false;
                                }
                            }
                        } else {
                            Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "promotion jump tiny app, username: %s, path: %s", promotions.f209678u, promotions.f209679v);
                            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                            aVar.f9526a = promotions.f209678u;
                            aVar.f9527b = Util.nullAs(promotions.f209679v, "");
                            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                            aVar2.f9529d = C90694b.CTRL_INDEX;
                            aVar2.f9530e = WalletOrderInfoOldUI.this.f210200v;
                            aVar2.f9528c = 0;
                            startAppBrandUIFromOuterEvent.publish();
                            WalletOrderInfoOldUI walletOrderInfoOldUI5 = WalletOrderInfoOldUI.this;
                            nVar.mo160131h(14118, walletOrderInfoOldUI5.f210200v, walletOrderInfoOldUI5.getPayReqKey(), 2);
                            WalletOrderInfoOldUI walletOrderInfoOldUI6 = WalletOrderInfoOldUI.this;
                            String payReqKey = WalletOrderInfoOldUI.this.getPayReqKey();
                            WalletOrderInfoOldUI walletOrderInfoOldUI7 = WalletOrderInfoOldUI.this;
                            walletOrderInfoOldUI6.f210181A = new C72299j(walletOrderInfoOldUI6, promotions.f209672o + "", promotions.f209674q + "", promotions.f209675r + "", promotions.f209676s + "", payReqKey, walletOrderInfoOldUI7.f210204z, promotions.f209680w);
                            walletOrderInfoOldUI7.f210183C = true;
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$b */
        public class C72294b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Orders.Commodity f210210d;

            public C72294b(Orders.Commodity commodity) {
                this.f210210d = commodity;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                Orders.RecommendTinyAppInfo recommendTinyAppInfo = this.f210210d.f209588D;
                aVar.f9526a = recommendTinyAppInfo.f209687g;
                aVar.f9527b = Util.nullAs(recommendTinyAppInfo.f209688h, "");
                StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                aVar2.f9529d = 1034;
                aVar2.f9528c = 0;
                startAppBrandUIFromOuterEvent.publish();
                C115669n nVar = C115669n.INSTANCE;
                WalletOrderInfoOldUI walletOrderInfoOldUI = WalletOrderInfoOldUI.this;
                nVar.mo160131h(14118, walletOrderInfoOldUI.f210200v, walletOrderInfoOldUI.getPayReqKey(), 1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$c */
        public class C72295c {

            /* renamed from: a */
            public TextView f210212a;

            /* renamed from: b */
            public TextView f210213b;

            /* renamed from: c */
            public TextView f210214c;

            /* renamed from: d */
            public TextView f210215d;

            /* renamed from: e */
            public TextView f210216e;

            /* renamed from: f */
            public TextView f210217f;

            /* renamed from: g */
            public TextView f210218g;

            /* renamed from: h */
            public TextView f210219h;

            /* renamed from: i */
            public View f210220i;

            /* renamed from: j */
            public MaxListView f210221j;

            /* renamed from: k */
            public View f210222k;

            /* renamed from: l */
            public TextView f210223l;

            /* renamed from: m */
            public TextView f210224m;

            /* renamed from: n */
            public TextView f210225n;

            /* renamed from: o */
            public TextView f210226o;

            /* renamed from: p */
            public View f210227p;

            /* renamed from: q */
            public ViewGroup f210228q;

            /* renamed from: r */
            public CdnImageView f210229r;

            /* renamed from: s */
            public TextView f210230s;

            /* renamed from: t */
            public TextView f210231t;

            public C72295c(C72292g gVar) {
            }
        }

        public C72292g() {
        }

        public int getCount() {
            List<Orders.Commodity> list = WalletOrderInfoOldUI.this.f210191j;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            return WalletOrderInfoOldUI.this.f210191j.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
            /*
                r18 = this;
                r0 = r18
                if (r20 != 0) goto L_0x00f6
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r1 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                r2 = 2131498270(0x7f0c151e, float:1.8620157E38)
                r3 = 0
                android.view.View r1 = android.view.View.inflate(r1, r2, r3)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$c r2 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$c
                r2.<init>(r0)
                r3 = 2131316772(0x7f095024, float:1.8252035E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210212a = r3
                r3 = 2131316777(0x7f095029, float:1.8252045E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210216e = r3
                r3 = 2131316800(0x7f095040, float:1.8252092E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210215d = r3
                r3 = 2131316805(0x7f095045, float:1.8252102E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210213b = r3
                r3 = 2131316792(0x7f095038, float:1.8252075E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210214c = r3
                android.text.TextPaint r3 = r3.getPaint()
                r4 = 16
                r3.setFlags(r4)
                r3 = 2131316806(0x7f095046, float:1.8252104E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210217f = r3
                r3 = 2131316775(0x7f095027, float:1.8252041E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210218g = r3
                r3 = 2131316771(0x7f095023, float:1.8252033E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210219h = r3
                r3 = 2131316794(0x7f09503a, float:1.825208E38)
                android.view.View r3 = r1.findViewById(r3)
                com.tencent.mm.ui.base.MaxListView r3 = (com.tencent.p014mm.p136ui.base.MaxListView) r3
                r2.f210221j = r3
                r3 = 2131316780(0x7f09502c, float:1.8252051E38)
                android.view.View r3 = r1.findViewById(r3)
                r2.f210222k = r3
                r3 = 2131316798(0x7f09503e, float:1.8252088E38)
                android.view.View r3 = r1.findViewById(r3)
                r2.f210220i = r3
                r3 = 2131316808(0x7f095048, float:1.8252108E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210224m = r3
                r3 = 2131316809(0x7f095049, float:1.825211E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210223l = r3
                r3 = 2131316810(0x7f09504a, float:1.8252112E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210225n = r3
                r3 = 2131316811(0x7f09504b, float:1.8252114E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210226o = r3
                r3 = 2131316802(0x7f095042, float:1.8252096E38)
                android.view.View r3 = r1.findViewById(r3)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r2.f210228q = r3
                r3 = 2131315277(0x7f094a4d, float:1.8249003E38)
                android.view.View r3 = r1.findViewById(r3)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r3
                r2.f210229r = r3
                r3 = 2131315273(0x7f094a49, float:1.8248995E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210230s = r3
                r3 = 2131315278(0x7f094a4e, float:1.8249005E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f210231t = r3
                r3 = 2131316799(0x7f09503f, float:1.825209E38)
                android.view.View r3 = r1.findViewById(r3)
                r2.f210227p = r3
                r1.setTag(r2)
                goto L_0x00ff
            L_0x00f6:
                java.lang.Object r1 = r20.getTag()
                r2 = r1
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$c r2 = (com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.C72292g.C72295c) r2
                r1 = r20
            L_0x00ff:
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r3 = r3.f210191j
                r4 = r19
                java.lang.Object r3 = r3.get(r4)
                com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r3 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r3
                if (r3 == 0) goto L_0x044e
                if (r2 == 0) goto L_0x044e
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r4 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                java.lang.String r5 = r3.f209606r
                r4.f210204z = r5
                android.widget.TextView r4 = r2.f210213b
                double r5 = r3.f209601j
                java.lang.String r7 = r3.f209608t
                java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r7)
                r4.setText(r5)
                double r4 = r3.f209602n
                r6 = 0
                r8 = 8
                r9 = 0
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 < 0) goto L_0x0144
                double r10 = r3.f209601j
                int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r12 >= 0) goto L_0x0144
                android.widget.TextView r10 = r2.f210214c
                java.lang.String r11 = r3.f209608t
                java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r4, r11)
                r10.setText(r4)
                android.widget.TextView r4 = r2.f210214c
                r4.setVisibility(r9)
                goto L_0x0149
            L_0x0144:
                android.widget.TextView r4 = r2.f210214c
                r4.setVisibility(r8)
            L_0x0149:
                android.view.View r4 = r2.f210222k
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo> r5 = r3.f209585A
                r4.removeAllViews()
                if (r5 == 0) goto L_0x01e3
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                int r10 = r5.size()
                if (r10 <= 0) goto L_0x01e3
                r10 = 0
            L_0x015d:
                int r11 = r5.size()
                if (r10 >= r11) goto L_0x01e3
                java.lang.Object r11 = r5.get(r10)
                com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo r11 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.DiscountInfo) r11
                android.widget.TextView r12 = new android.widget.TextView
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                androidx.appcompat.app.AppCompatActivity r13 = r13.getContext()
                r12.<init>(r13)
                android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
                r14 = -2
                r13.<init>(r14, r14)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r14 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                androidx.appcompat.app.AppCompatActivity r14 = r14.getContext()
                android.content.res.Resources r14 = r14.getResources()
                r15 = 2131165190(0x7f070006, float:1.794459E38)
                int r14 = r14.getDimensionPixelOffset(r15)
                r13.bottomMargin = r14
                r12.setLayoutParams(r13)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                androidx.appcompat.app.AppCompatActivity r13 = r13.getContext()
                r14 = 2131886749(0x7f12029d, float:1.9408086E38)
                r12.setTextAppearance(r13, r14)
                double r13 = r11.f209632d
                int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r15 <= 0) goto L_0x01c7
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r11.f209633e
                r13.append(r14)
                double r14 = r11.f209632d
                r16 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r14 = r14 / r16
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r11 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                com.tencent.mm.plugin.wallet_core.model.Orders r11 = r11.f210192n
                java.lang.String r11 = r11.f209568j
                java.lang.String r11 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r14, r11)
                r13.append(r11)
                java.lang.String r11 = r13.toString()
                r12.setText(r11)
                goto L_0x01cc
            L_0x01c7:
                java.lang.String r11 = r11.f209633e
                r12.setText(r11)
            L_0x01cc:
                r4.addView(r12)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r11 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                android.content.res.Resources r11 = r11.getResources()
                r13 = 2131101754(0x7f06083a, float:1.7815927E38)
                int r11 = r11.getColor(r13)
                r12.setTextColor(r11)
                int r10 = r10 + 1
                goto L_0x015d
            L_0x01e3:
                int r5 = r4.getChildCount()
                if (r5 <= 0) goto L_0x01ed
                r4.setVisibility(r9)
                goto L_0x01f0
            L_0x01ed:
                r4.setVisibility(r8)
            L_0x01f0:
                android.widget.TextView r4 = r2.f210212a
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                boolean r6 = eb0.C75592q0.m90763K()
                if (r6 == 0) goto L_0x0202
                r6 = 2131839390(0x7f11499e, float:1.931203E38)
                java.lang.String r5 = r5.getString(r6)
                goto L_0x0209
            L_0x0202:
                r6 = 2131839389(0x7f11499d, float:1.9312028E38)
                java.lang.String r5 = r5.getString(r6)
            L_0x0209:
                r4.setText(r5)
                android.widget.TextView r4 = r2.f210215d
                java.lang.String r5 = r3.f209598g
                r4.setText(r5)
                android.widget.TextView r4 = r2.f210216e
                java.lang.String r5 = r3.f209599h
                r4.setText(r5)
                android.widget.TextView r4 = r2.f210216e
                java.lang.String r5 = r3.f209599h
                r4.setTag(r5)
                android.widget.TextView r4 = r2.f210216e
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                android.view.View$OnLongClickListener r5 = r5.f210186F
                r4.setOnLongClickListener(r5)
                android.widget.TextView r4 = r2.f210216e
                r5 = 2131235622(0x7f081326, float:1.8087443E38)
                r4.setBackgroundResource(r5)
                android.widget.TextView r4 = r2.f210217f
                java.lang.String r6 = r3.f209606r
                r4.setText(r6)
                android.widget.TextView r4 = r2.f210217f
                java.lang.String r6 = r3.f209606r
                r4.setTag(r6)
                android.widget.TextView r4 = r2.f210217f
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r6 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                android.view.View$OnLongClickListener r6 = r6.f210186F
                r4.setOnLongClickListener(r6)
                android.widget.TextView r4 = r2.f210217f
                r4.setBackgroundResource(r5)
                android.widget.TextView r4 = r2.f210218g
                int r5 = r3.f209605q
                java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r5)
                r4.setText(r5)
                android.widget.TextView r4 = r2.f210219h
                java.lang.String r5 = r3.f209607s
                r4.setText(r5)
                java.lang.String r4 = r3.f209586B
                android.widget.TextView r5 = r2.f210225n
                if (r5 == 0) goto L_0x0286
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r5 != 0) goto L_0x027c
                android.widget.TextView r5 = r2.f210225n
                r5.setText(r4)
                android.widget.TextView r4 = r2.f210225n
                r4.setVisibility(r9)
                android.widget.TextView r4 = r2.f210226o
                r4.setVisibility(r9)
                goto L_0x0286
            L_0x027c:
                android.widget.TextView r4 = r2.f210226o
                r4.setVisibility(r8)
                android.widget.TextView r4 = r2.f210225n
                r4.setVisibility(r8)
            L_0x0286:
                java.lang.String r4 = r3.f209587C
                android.widget.TextView r5 = r2.f210224m
                if (r5 == 0) goto L_0x02ac
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r5 != 0) goto L_0x02a2
                android.widget.TextView r5 = r2.f210224m
                r5.setText(r4)
                android.widget.TextView r4 = r2.f210224m
                r4.setVisibility(r9)
                android.widget.TextView r4 = r2.f210223l
                r4.setVisibility(r9)
                goto L_0x02ac
            L_0x02a2:
                android.widget.TextView r4 = r2.f210223l
                r4.setVisibility(r8)
                android.widget.TextView r4 = r2.f210224m
                r4.setVisibility(r8)
            L_0x02ac:
                java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r4 = r3.f209592H
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                int r4 = r4.size()
                if (r4 <= 0) goto L_0x0351
                java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r4 = r3.f209592H
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object r4 = r4.get(r9)
                com.tencent.mm.plugin.wallet_core.model.Orders$Promotions r4 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Promotions) r4
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r6 = 13033(0x32e9, float:1.8263E-41)
                r7 = 5
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r10 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                r7[r9] = r11
                java.lang.String r11 = r4.f209669i
                r7[r10] = r11
                r10 = 2
                java.lang.String r11 = r4.f209668h
                r7[r10] = r11
                r10 = 3
                java.lang.String r4 = r4.f209666f
                r7[r10] = r4
                r4 = 4
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r10 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                java.lang.String r10 = r10.f210204z
                r7[r4] = r10
                r5.mo160131h(r6, r7)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r4 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i r5 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i
                java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r6 = r3.f209592H
                r5.<init>(r6)
                r4.f210201w = r5
                com.tencent.mm.ui.base.MaxListView r4 = r2.f210221j
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r5 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i r5 = r5.f210201w
                r4.setAdapter(r5)
                com.tencent.mm.ui.base.MaxListView r4 = r2.f210221j
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$a r5 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$a
                r5.<init>()
                r4.setOnItemClickListener(r5)
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI r4 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.this
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i r4 = r4.f210201w
                r4.notifyDataSetChanged()
                com.tencent.mm.ui.base.MaxListView r4 = r2.f210221j
                r4.setVisibility(r9)
                android.view.View r4 = r2.f210220i
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r5.mo10233c(r6)
                java.lang.Object[] r11 = r5.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r4
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r5 = r5.mo10231a(r9)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x039b
            L_0x0351:
                com.tencent.mm.ui.base.MaxListView r4 = r2.f210221j
                r4.setVisibility(r8)
                android.view.ViewGroup r4 = r2.f210228q
                r4.setVisibility(r8)
                android.view.View r4 = r2.f210220i
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                r5.mo10233c(r6)
                java.lang.Object[] r11 = r5.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r4
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r5 = r5.mo10231a(r9)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x039b:
                com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo r4 = r3.f209588D
                if (r4 == 0) goto L_0x040b
                java.lang.String r4 = r4.f209687g
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x040b
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = r2.f210229r
                com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo r5 = r3.f209588D
                java.lang.String r5 = r5.f209685e
                r4.setUrl(r5)
                android.widget.TextView r4 = r2.f210230s
                com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo r5 = r3.f209588D
                java.lang.String r5 = r5.f209686f
                r4.setText(r5)
                android.widget.TextView r4 = r2.f210231t
                com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo r5 = r3.f209588D
                java.lang.String r5 = r5.f209684d
                r4.setText(r5)
                android.view.ViewGroup r4 = r2.f210228q
                com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$b r5 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$g$b
                r5.<init>(r3)
                r4.setOnClickListener(r5)
                android.view.View r2 = r2.f210227p
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
                r3.mo10233c(r4)
                java.lang.Object[] r11 = r3.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r3.mo10231a(r9)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x044e
            L_0x040b:
                android.view.ViewGroup r3 = r2.f210228q
                r3.setVisibility(r8)
                android.view.View r2 = r2.f210227p
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
                r3.mo10233c(r4)
                java.lang.Object[] r11 = r3.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r3.mo10231a(r9)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x044e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI.C72292g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$h */
    public class C72296h {

        /* renamed from: a */
        public String f210232a;

        /* renamed from: b */
        public String f210233b;

        /* renamed from: c */
        public String f210234c;

        /* renamed from: d */
        public String f210235d;

        /* renamed from: e */
        public String f210236e;

        public C72296h(WalletOrderInfoOldUI walletOrderInfoOldUI, JSONObject jSONObject) {
            JSONObject optJSONObject;
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("activity_change_info")) != null) {
                this.f210232a = optJSONObject.optString("url");
                this.f210233b = optJSONObject.optString("wording");
                this.f210234c = optJSONObject.optString("icon");
                this.f210235d = optJSONObject.optString("btn_text");
                this.f210236e = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            }
        }

        public String toString() {
            return this.f210232a + " , " + this.f210233b + " , " + this.f210234c + " , " + this.f210235d + " , " + this.f210236e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i */
    public class C72297i extends BaseAdapter {

        /* renamed from: d */
        public List<Orders.Promotions> f210237d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$i$a */
        public class C72298a {

            /* renamed from: a */
            public CdnImageView f210239a;

            /* renamed from: b */
            public TextView f210240b;

            /* renamed from: c */
            public TextView f210241c;

            /* renamed from: d */
            public CheckBox f210242d;

            /* renamed from: e */
            public TextView f210243e;

            /* renamed from: f */
            public int f210244f;

            /* renamed from: g */
            public int f210245g;

            public C72298a(C72297i iVar) {
            }
        }

        public C72297i(List<Orders.Promotions> list) {
            int i;
            this.f210237d = null;
            this.f210237d = new ArrayList();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Orders.Promotions promotions = list.get(i2);
                if (promotions != null && (!Util.isNullOrNil(promotions.f209669i) || (i = promotions.f209673p) == 2 || i == 1)) {
                    this.f210237d.add(list.get(i2));
                }
            }
        }

        public int getCount() {
            List<Orders.Promotions> list = this.f210237d;
            if (list != null) {
                return ((ArrayList) list).size();
            }
            return 0;
        }

        public Object getItem(int i) {
            return (Orders.Promotions) ((ArrayList) this.f210237d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C72298a aVar;
            View view2;
            TextView textView;
            View inflate;
            Orders.Promotions promotions = (Orders.Promotions) ((ArrayList) this.f210237d).get(i);
            if (Util.isNullOrNil(promotions.f209669i)) {
                long j = promotions.f209672o;
                if (j > 0) {
                    int Q7 = WalletOrderInfoOldUI.this.mo99610Q7(j);
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[6];
                    objArr[0] = WalletOrderInfoOldUI.this.f210204z;
                    objArr[1] = 1;
                    objArr[2] = Integer.valueOf(promotions.f209673p);
                    if ("-1".equals(Q7)) {
                        Q7 = 5;
                    }
                    objArr[3] = Q7;
                    objArr[4] = Long.valueOf(promotions.f209672o);
                    objArr[5] = Long.valueOf(promotions.f209680w);
                    nVar.mo160131h(13471, objArr);
                }
            }
            if (view == null) {
                aVar = new C72298a(this);
                int i2 = promotions.f209664d;
                aVar.f210244f = i2;
                if (i2 == 1) {
                    if (promotions.f209671n == 1) {
                        view2 = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfq, (ViewGroup) null);
                        aVar.f210239a = (CdnImageView) view2.findViewById(C0966R.C0970id.lia);
                        aVar.f210243e = (TextView) view2.findViewById(C0966R.C0970id.lio);
                        aVar.f210241c = (TextView) view2.findViewById(C0966R.C0970id.lhw);
                        aVar.f210240b = (TextView) view2.findViewById(C0966R.C0970id.lic);
                        if (!TextUtils.isEmpty(promotions.f209668h)) {
                            WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                        }
                        view2.setTag(aVar);
                    } else {
                        view2 = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfr, (ViewGroup) null);
                        aVar.f210239a = (CdnImageView) view2.findViewById(C0966R.C0970id.lia);
                        aVar.f210241c = (TextView) view2.findViewById(C0966R.C0970id.lhw);
                        aVar.f210240b = (TextView) view2.findViewById(C0966R.C0970id.lic);
                        aVar.f210243e = (TextView) view2.findViewById(C0966R.C0970id.lio);
                        if (!TextUtils.isEmpty(promotions.f209668h)) {
                            WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                        }
                        view2.setTag(aVar);
                    }
                    aVar.f210245g = promotions.f209671n;
                } else {
                    view2 = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfs, (ViewGroup) null);
                    aVar.f210239a = (CdnImageView) view2.findViewById(C0966R.C0970id.lia);
                    aVar.f210241c = (TextView) view2.findViewById(C0966R.C0970id.lhw);
                    aVar.f210240b = (TextView) view2.findViewById(C0966R.C0970id.lic);
                    aVar.f210242d = (CheckBox) view2.findViewById(C0966R.C0970id.f5661l6);
                    if (!TextUtils.isEmpty(promotions.f209668h)) {
                        WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                    }
                    view2.setTag(aVar);
                }
            } else {
                aVar = (C72298a) view.getTag();
                int i3 = promotions.f209664d;
                if (!(i3 == aVar.f210244f && (i3 != 1 || promotions.f209671n == aVar.f210245g))) {
                    aVar = new C72298a(this);
                    aVar.f210244f = i3;
                    if (i3 == 1) {
                        if (promotions.f209671n == 1) {
                            inflate = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfq, (ViewGroup) null);
                            aVar.f210239a = (CdnImageView) inflate.findViewById(C0966R.C0970id.lia);
                            aVar.f210243e = (TextView) inflate.findViewById(C0966R.C0970id.lio);
                            aVar.f210241c = (TextView) inflate.findViewById(C0966R.C0970id.lhw);
                            aVar.f210240b = (TextView) inflate.findViewById(C0966R.C0970id.lic);
                            if (!TextUtils.isEmpty(promotions.f209668h)) {
                                WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                            }
                            inflate.setTag(aVar);
                        } else {
                            inflate = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfr, (ViewGroup) null);
                            aVar.f210239a = (CdnImageView) inflate.findViewById(C0966R.C0970id.lia);
                            aVar.f210241c = (TextView) inflate.findViewById(C0966R.C0970id.lhw);
                            aVar.f210240b = (TextView) inflate.findViewById(C0966R.C0970id.lic);
                            aVar.f210243e = (TextView) inflate.findViewById(C0966R.C0970id.lio);
                            if (!TextUtils.isEmpty(promotions.f209668h)) {
                                WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                            }
                            inflate.setTag(aVar);
                        }
                        aVar.f210245g = promotions.f209671n;
                    } else {
                        view2 = View.inflate(WalletOrderInfoOldUI.this, C0966R.C0971layout.cfs, (ViewGroup) null);
                        aVar.f210239a = (CdnImageView) view2.findViewById(C0966R.C0970id.lia);
                        aVar.f210241c = (TextView) view2.findViewById(C0966R.C0970id.lhw);
                        aVar.f210240b = (TextView) view2.findViewById(C0966R.C0970id.lic);
                        aVar.f210242d = (CheckBox) view2.findViewById(C0966R.C0970id.f5661l6);
                        if (!TextUtils.isEmpty(promotions.f209668h)) {
                            WalletOrderInfoOldUI.this.f210198t.put(promotions.f209668h, aVar.f210241c);
                        }
                        view2.setTag(aVar);
                    }
                } else {
                    view2 = view;
                }
            }
            HashMap<String, C72296h> hashMap = WalletOrderInfoOldUI.this.f210182B;
            C72296h hVar = hashMap.get(promotions.f209672o + "");
            Log.m105924i("MicroMsg.WalletOrderInfoOldUI", "try get result " + hVar);
            if (hVar != null) {
                aVar.f210239a.setUrl(hVar.f210234c);
                aVar.f210240b.setText(hVar.f210233b);
                aVar.f210241c.setText(hVar.f210235d);
            } else {
                aVar.f210239a.setUrl(promotions.f209665e);
                aVar.f210240b.setText(promotions.f209666f);
                aVar.f210241c.setText(promotions.f209667g);
            }
            if (!Util.isNullOrNil(promotions.f209669i)) {
                aVar.f210241c.setVisibility(8);
                CheckBox checkBox = aVar.f210242d;
                if (checkBox != null) {
                    checkBox.setVisibility(0);
                    if (((HashSet) WalletOrderInfoOldUI.this.f210195q).contains(promotions.f209669i)) {
                        aVar.f210242d.setChecked(true);
                    } else {
                        aVar.f210242d.setChecked(false);
                    }
                }
            } else {
                aVar.f210241c.setVisibility(0);
                CheckBox checkBox2 = aVar.f210242d;
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
            }
            if (aVar.f210243e != null && hVar != null && !Util.isNullOrNil(hVar.f210236e)) {
                aVar.f210243e.setText(hVar.f210236e);
            } else if (aVar.f210243e == null || Util.isNullOrNil(promotions.f209670j)) {
                TextView textView2 = aVar.f210243e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                aVar.f210243e.setText(promotions.f209670j);
            }
            if (!Util.isNullOrNil(WalletOrderInfoOldUI.this.f210199u) && (textView = aVar.f210241c) != null) {
                textView.setClickable(WalletOrderInfoOldUI.this.f210196r);
                aVar.f210241c.setEnabled(WalletOrderInfoOldUI.this.f210196r);
                aVar.f210241c.setOnClickListener((View.OnClickListener) null);
                if (WalletOrderInfoOldUI.this.f210197s) {
                    aVar.f210241c.setVisibility(8);
                }
            }
            String Q72 = WalletOrderInfoOldUI.this.mo99610Q7(promotions.f209672o);
            if (Q72.equals("0")) {
                aVar.f210241c.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(C0966R.color.ahf));
                aVar.f210241c.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(C0966R.color.akw));
            } else if (Q72.equals("-1") || Q72.equals("3")) {
                aVar.f210241c.setBackgroundDrawable(WalletOrderInfoOldUI.this.getResources().getDrawable(C0966R.C0969drawable.f4670jk));
                aVar.f210241c.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(C0966R.color.akw));
            } else if (Q72.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL) || Q72.equals("2") || Q72.equals("1")) {
                aVar.f210241c.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(C0966R.color.ahf));
                aVar.f210241c.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(C0966R.color.f3563xt));
            } else {
                Log.m105920e("MicroMsg.WalletOrderInfoOldUI", "PromotionsAdapter unknow award state");
            }
            if (aVar.f210241c != null) {
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(WalletOrderInfoOldUI.this.getContext(), 15.0f);
                int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(WalletOrderInfoOldUI.this.getContext(), 5.0f);
                aVar.f210241c.setPadding(fromDPToPix, fromDPToPix2, fromDPToPix, fromDPToPix2);
            }
            return view2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI$j */
    public class C72299j {

        /* renamed from: a */
        public String f210246a;

        /* renamed from: b */
        public String f210247b;

        /* renamed from: c */
        public String f210248c;

        /* renamed from: d */
        public String f210249d;

        /* renamed from: e */
        public String f210250e;

        /* renamed from: f */
        public String f210251f;

        /* renamed from: g */
        public long f210252g;

        public C72299j(WalletOrderInfoOldUI walletOrderInfoOldUI, String str, String str2, String str3, String str4, String str5, String str6, long j) {
            this.f210246a = str;
            this.f210247b = str2;
            this.f210248c = str3;
            this.f210249d = str4;
            this.f210250e = str5;
            this.f210251f = str6;
            this.f210252g = j;
        }
    }

    public WalletOrderInfoOldUI() {
        C40008f fVar = C40008f.f107254d;
        this.f210184D = new IListener<WalletOfflineRealNameNotifyEvent>(fVar) {
            {
                this.__eventId = 201806318;
            }

            public boolean callback(IEvent iEvent) {
                WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent = (WalletOfflineRealNameNotifyEvent) iEvent;
                if (!(walletOfflineRealNameNotifyEvent instanceof WalletOfflineRealNameNotifyEvent)) {
                    return false;
                }
                C76313t.C76322j jVar = walletOfflineRealNameNotifyEvent.f194081d.f194082a;
                if (!jVar.f223585f) {
                    Log.m105924i("MicroMsg.WalletOrderInfoOldUI", "block pass");
                    return true;
                } else if (!"1".equals(jVar.f223580a) && !"2".equals(walletOfflineRealNameNotifyEvent.f194081d.f194082a.f223580a)) {
                    return false;
                } else {
                    RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                    C76313t.C76322j jVar2 = walletOfflineRealNameNotifyEvent.f194081d.f194082a;
                    String str = jVar2.f223580a;
                    String str2 = jVar2.f223581b;
                    String str3 = jVar2.f223582c;
                    String str4 = jVar2.f223583d;
                    String str5 = jVar2.f223584e;
                    PayInfo payInfo = WalletOrderInfoOldUI.this.f210203y;
                    realnameGuideHelper.mo99373d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f212587e);
                    Log.m105924i("MicroMsg.WalletOrderInfoOldUI", "receive guide");
                    WalletOrderInfoOldUI.this.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
                    return false;
                }
            }
        };
        this.f210185E = new C5784b();
        this.f210186F = new C5786f();
        this.f210187G = new IListener<ChangePayActivityViewEvent>(fVar) {
            {
                this.__eventId = -1936299298;
            }

            public boolean callback(IEvent iEvent) {
                ChangePayActivityViewEvent changePayActivityViewEvent = (ChangePayActivityViewEvent) iEvent;
                if (changePayActivityViewEvent instanceof ChangePayActivityViewEvent) {
                    WalletOrderInfoOldUI walletOrderInfoOldUI = WalletOrderInfoOldUI.this;
                    String str = changePayActivityViewEvent.f9034d.f9036a;
                    walletOrderInfoOldUI.getClass();
                    WalletOrderInfoOldUI walletOrderInfoOldUI2 = WalletOrderInfoOldUI.this;
                    ChangePayActivityViewEvent.C0996a aVar = changePayActivityViewEvent.f9034d;
                    walletOrderInfoOldUI2.f210196r = aVar.f9037b;
                    walletOrderInfoOldUI2.f210197s = aVar.f9038c;
                    if (aVar.f9039d && !Util.isNullOrNil(walletOrderInfoOldUI2.f210199u)) {
                        for (int i = 0; i < WalletOrderInfoOldUI.this.f210191j.size(); i++) {
                            Orders.Commodity commodity = WalletOrderInfoOldUI.this.f210191j.get(i);
                            int i2 = -1;
                            for (int i3 = 0; i3 < ((ArrayList) commodity.f209592H).size(); i3++) {
                                Orders.Promotions promotions = (Orders.Promotions) ((ArrayList) commodity.f209592H).get(i3);
                                if (promotions.f209664d == 1 && !Util.isNullOrNil(promotions.f209668h) && promotions.f209668h.equals(WalletOrderInfoOldUI.this.f210199u)) {
                                    i2 = i3;
                                }
                            }
                            if (i2 >= 0) {
                                ((ArrayList) commodity.f209592H).remove(i2);
                            }
                        }
                    }
                    WalletOrderInfoOldUI.this.f210193o.notifyDataSetChanged();
                    if (!Util.isNullOrNil(WalletOrderInfoOldUI.this.f210199u)) {
                        WalletOrderInfoOldUI walletOrderInfoOldUI3 = WalletOrderInfoOldUI.this;
                        TextView textView = walletOrderInfoOldUI3.f210198t.get(walletOrderInfoOldUI3.f210199u);
                        if (textView != null) {
                            textView.setClickable(WalletOrderInfoOldUI.this.f210196r);
                            textView.setEnabled(WalletOrderInfoOldUI.this.f210196r);
                            textView.setOnClickListener((View.OnClickListener) null);
                            if (WalletOrderInfoOldUI.this.f210197s) {
                                textView.setVisibility(8);
                            }
                        }
                    }
                    changePayActivityViewEvent.f9035e.f9040a = true;
                }
                return false;
            }
        };
    }

    /* renamed from: I7 */
    public void mo99605I7(String str) {
        doSceneProgress(new C78343f0(str));
    }

    /* renamed from: J7 */
    public void mo99606J7(String str, int i) {
        doSceneProgress(new C78343f0(str, i));
    }

    /* renamed from: K7 */
    public Orders mo99582K7() {
        return (Orders) getInput().getParcelable("key_orders");
    }

    /* renamed from: M7 */
    public boolean mo99591M7() {
        return false;
    }

    /* renamed from: N7 */
    public void mo99607N7(C72996z1 z1Var) {
        if (z1Var != null && ((int) z1Var.f108320R1) != 0) {
            String j3 = z1Var.mo62909j3();
            Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer nickName " + j3 + " username: " + z1Var.getUsername());
            List<Orders.Commodity> list = this.f210191j;
            if (list != null && list.size() > 0) {
                for (Orders.Commodity commodity : this.f210191j) {
                    commodity.f209609u = j3;
                }
                this.f210193o.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: O7 */
    public void mo99608O7() {
        mo99613T7();
        this.f210183C = false;
        CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent = new CardOfflinePayFinishButtonEvent();
        int i = 1;
        cardOfflinePayFinishButtonEvent.f193511d.f193512a = true;
        cardOfflinePayFinishButtonEvent.publish();
        Bundle bundle = new Bundle();
        bundle.putInt("intent_pay_end_errcode", getInput().getInt("intent_pay_end_errcode"));
        bundle.putString("intent_pay_app_url", getInput().getString("intent_pay_app_url"));
        bundle.putBoolean("intent_pay_end", getInput().getBoolean("intent_pay_end"));
        Log.m105924i("MicroMsg.WalletOrderInfoOldUI", "pay done...feedbackData errCode:" + getInput().getInt("intent_pay_end_errcode"));
        Iterator it = ((HashSet) this.f210195q).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!Util.isNullOrNil(str)) {
                Object[] objArr = new Object[i];
                objArr[0] = str;
                Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", objArr);
                if (this.f210192n == null || this.f210203y == null) {
                    C86709a0.m107529k().f251779b.mo123460f(new C75119h0(str));
                } else {
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    Orders orders = this.f210192n;
                    String str2 = orders.f209563e;
                    String str3 = ((ArrayList) orders.f209542M).size() > 0 ? ((Orders.Commodity) ((ArrayList) this.f210192n.f209542M).get(0)).f209606r : "";
                    PayInfo payInfo = this.f210203y;
                    C75119h0 h0Var = r9;
                    C75119h0 h0Var2 = new C75119h0(str, str2, str3, payInfo.f212587e, payInfo.f212589g, this.f210192n.f209530A);
                    b0Var.mo123460f(h0Var);
                }
            }
            C115669n.INSTANCE.mo160131h(13033, 2, str, "", "", "");
            i = 1;
        }
        C79143a.m95765d(this, bundle);
        Orders orders2 = this.f210192n;
        if (orders2 != null && !Util.isNullOrNil(orders2.f209533D)) {
            String str4 = ((ArrayList) this.f210192n.f209542M).size() > 0 ? ((Orders.Commodity) ((ArrayList) this.f210192n.f209542M).get(0)).f209606r : "";
            Orders orders3 = this.f210192n;
            String str5 = orders3.f209533D;
            String str6 = orders3.f209563e;
            PayInfo payInfo2 = this.f210203y;
            String H7 = mo99629H7(str5, str6, str4, payInfo2.f212601v, payInfo2.f212602w);
            Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "url = " + H7);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", H7);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("stastic_scene", 8);
            C88144b.m109791i(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: P7 */
    public void mo99609P7() {
        if (getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoOldUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
                boolean a = realnameGuideHelper.mo99370a(this, bundle, new C72290c(), (C79148e.C79149a) null);
                getInput().remove("key_realname_guide_helper");
                if (!a) {
                    mo99608O7();
                    return;
                }
                return;
            }
            return;
        }
        mo99608O7();
    }

    /* renamed from: Q7 */
    public String mo99610Q7(long j) {
        if (!((HashMap) this.f210202x).containsKey(Long.valueOf(j))) {
            return "-1";
        }
        return (String) ((HashMap) this.f210202x).get(Long.valueOf(j));
    }

    /* renamed from: R7 */
    public void mo99611R7(Orders orders) {
        List<Orders.Commodity> list;
        this.f210195q.clear();
        if (orders == null || (list = orders.f209542M) == null) {
            Log.m105928w("MicroMsg.WalletOrderInfoOldUI", "hy: orders is null");
            return;
        }
        for (Orders.Commodity next : list) {
            if (next.f209614z == 2 && !Util.isNullOrNil(next.f209610v)) {
                Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "hy: has username and is force recommend");
                this.f210195q.add(next.f209610v);
            }
        }
    }

    /* renamed from: S7 */
    public final void mo99612S7() {
        List<Orders.Commodity> list;
        Orders orders = this.f210192n;
        if (orders == null || (list = orders.f209542M) == null || list.size() <= 0 || this.f210192n.f209542M.get(0).f209594J == null || Util.isNullOrNil(this.f210192n.f209542M.get(0).f209594J.f209710a) || Util.isNullOrNil(this.f210192n.f209542M.get(0).f209594J.f209711b)) {
            Log.m105924i("MicroMsg.WalletOrderInfoOldUI", "hy: no commodity or no link act or link act is illegal!");
            this.f210190i.setVisibility(8);
            return;
        }
        this.f210190i.setVisibility(0);
        this.f210190i.setText(this.f210192n.f209542M.get(0).f209594J.f209710a);
        this.f210190i.setOnClickListener(new C72291e());
    }

    /* renamed from: T7 */
    public void mo99613T7() {
        if (!this.f210194p) {
            JsapiResultEvent jsapiResultEvent = new JsapiResultEvent();
            JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
            aVar.f193695a = 4;
            int i = 0;
            if (getInput().getBoolean("intent_pay_end", false)) {
                i = -1;
            }
            aVar.f193696b = i;
            jsapiResultEvent.publish();
            this.f210194p = true;
        }
    }

    /* renamed from: U7 */
    public void mo99614U7() {
        boolean z;
        Orders orders = this.f210192n;
        if (orders != null) {
            List<Orders.Commodity> list = orders.f209542M;
            this.f210191j = list;
            Iterator<Orders.Commodity> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("1".equals(it.next().f209603o)) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            this.f210188g.setVisibility(0);
            this.f210189h.setVisibility(0);
            if (!z) {
                this.f210189h.setText(C0966R.string.f361583l10);
            } else if (!Util.isNullOrNil(this.f210192n.f209532C) && !Util.isNullOrNil(this.f210192n.f209532C.trim())) {
                this.f210189h.setText(this.f210192n.f209532C);
            } else if (this.f210192n.f209567i != 1) {
                this.f210189h.setText(C0966R.string.l0z);
            } else {
                this.f210189h.setText(C0966R.string.l0y);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfo;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.l1c);
        Class cls = C79138l.class;
        showHomeBtn(false);
        enableBackMenu(false);
        String string = getString(C0966R.string.f8014z_);
        PayInfo payInfo = this.f210203y;
        if (payInfo == null || payInfo.f212587e != 2) {
            Orders orders = this.f210192n;
            if (orders != null && !Util.isNullOrNil(orders.f209557W)) {
                string = this.f210192n.f209557W;
            }
        } else if (!Util.isNullOrNil(payInfo.f212595p)) {
            string = getString(C0966R.string.f7574k3) + this.f210203y.f212595p;
        } else if (!Util.isNullOrNil(this.f210203y.f212594o) && !Util.isNullOrNil(((C79138l) C86312j.m106911c(cls)).mo74012l5(this, this.f210203y.f212594o))) {
            string = getString(C0966R.string.f7574k3) + ((C79138l) C86312j.m106911c(cls)).mo74012l5(this, this.f210203y.f212594o);
        }
        addTextOptionMenu(0, string, new C72472x0(this));
        this.f210188g = (LinearLayout) findViewById(C0966R.C0970id.lih);
        this.f210189h = (TextView) findViewById(C0966R.C0970id.lig);
        this.f210190i = (TextView) findViewById(C0966R.C0970id.li_);
        C72292g gVar = new C72292g();
        this.f210193o = gVar;
        ((MaxListView) findViewById(C0966R.C0970id.lhs)).setAdapter(gVar);
        mo99614U7();
        mo99612S7();
        ((ScrollView) findViewById(C0966R.C0970id.ljl)).pageScroll(33);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "onActivityResult %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            C72299j jVar = this.f210181A;
            doSceneProgress(new C78344g0(jVar.f210246a, jVar.f210247b, jVar.f210248c, jVar.f210249d, jVar.f210250e, jVar.f210251f, jVar.f210252g));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        List<Orders.Commodity> list;
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f210195q = new HashSet();
        C79148e g = C79143a.m95768g(this);
        this.f210203y = (PayInfo) getInput().getParcelable("key_pay_info");
        this.f210200v = getInput().getString("key_trans_id");
        getInput().getInt("key_pay_type", -1);
        boolean z = true;
        Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "mTransId %s", this.f210200v);
        Orders K7 = mo99582K7();
        this.f210192n = K7;
        if (K7 != null) {
            setContentViewVisibility(0);
            mo99611R7(this.f210192n);
            if (g == null || this.f210192n == null || this.f210203y == null) {
                str = "mOrders info is Illegal!";
            } else {
                boolean s = g.mo109117s();
                C72517z.m84856d(this, getInput(), 7);
                int i = getInput().getInt("key_support_bankcard", 1) == 2 ? 2 : 1;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[7];
                objArr[0] = Integer.valueOf(this.f210203y.f212587e);
                objArr[1] = Boolean.valueOf(this.f210203y.f212587e == 3);
                objArr[2] = Integer.valueOf(s ? 1 : 2);
                str = "mOrders info is Illegal!";
                objArr[3] = Integer.valueOf((int) ((System.currentTimeMillis() - C75136r0.f221075a) / 1000));
                objArr[4] = Integer.valueOf((int) (this.f210192n.f209566h * 100.0d));
                objArr[5] = this.f210192n.f209568j;
                objArr[6] = Integer.valueOf(i);
                nVar.mo160131h(10691, objArr);
            }
            if ((!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() && g != null && g.mo109117s()) || !C75592q0.m90761I()) {
                C75592q0.m90767O();
            }
            Orders orders = this.f210192n;
            if (orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0) {
                Log.printInfoStack("MicroMsg.WalletOrderInfoOldUI", str, new Object[0]);
                C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C72436v0(this));
            } else {
                List<Orders.Commodity> list2 = this.f210192n.f209542M;
                this.f210191j = list2;
                this.f210200v = ((Orders.Commodity) ((ArrayList) list2).get(0)).f209606r;
                if (!(this.f210203y == null || g == null)) {
                    if (g.f232423c.getInt("key_pay_flag", 0) != 2) {
                        z = false;
                    }
                    if (z || g.mo109117s()) {
                        doSceneProgress(new C78342e0(getPayReqKey(), 21));
                    }
                }
            }
            if (this.f210200v == null && ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(this)) {
                this.f210183C = false;
            }
        } else {
            Log.printInfoStack("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
            C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C72470w0(this));
        }
        initView();
        addSceneEndListener(1979);
        this.f210187G.alive();
        this.f210184D.alive();
        this.f210183C = false;
    }

    @Deprecated
    public Dialog onCreateDialog(int i) {
        C76879j.m92736g(getContext(), getString(C0966R.string.l0u), getResources().getStringArray(C0966R.array.f2610aw), "", new C5785d());
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f210187G.dead();
        this.f210184D.dead();
        removeSceneEndListener(1979);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo99609P7();
        return true;
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.WalletOrderInfoOldUI", "onResume, isClickActivityTinyApp: %s", Boolean.valueOf(this.f210183C));
        if (this.f210183C) {
            C72299j jVar = this.f210181A;
            doSceneProgress(new C78344g0(jVar.f210246a, jVar.f210247b, jVar.f210248c, jVar.f210249d, jVar.f210250e, jVar.f210251f, jVar.f210252g));
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C78344g0) && i == 0 && i2 == 0) {
            C78344g0 g0Var = (C78344g0) yVar;
            C72296h hVar = new C72296h(this, g0Var.f229579e);
            if (!Util.isNullOrNil(hVar.f210232a) && !Util.isNullOrNil(hVar.f210233b)) {
                this.f210182B.put(g0Var.f229578d, hVar);
            }
            this.f210193o.notifyDataSetChanged();
        }
        if (yVar instanceof C78343f0) {
            if (i == 0 && i2 == 0) {
                setContentViewVisibility(0);
                Orders orders = ((C78343f0) yVar).f229577d;
                this.f210192n = orders;
                if (orders != null) {
                    this.f210191j = orders.f209542M;
                }
                mo99611R7(orders);
                Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + this.f210191j);
                List<Orders.Commodity> list = this.f210191j;
                if (!(list == null || list.size() == 0)) {
                    Orders.Commodity commodity = this.f210191j.get(0);
                    this.f210200v = commodity.f209606r;
                    Log.m105918d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + commodity.toString());
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(commodity.f209609u);
                    if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                        C31519v2.m39436a().mo55988e(commodity.f209609u, "", this.f210185E);
                    } else {
                        mo99607N7(z1Var);
                    }
                    this.f210193o.notifyDataSetChanged();
                    mo99614U7();
                }
            }
            C72292g gVar = this.f210193o;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
            mo99612S7();
            return true;
        }
        boolean z = yVar instanceof C78353t;
        if (z) {
            if (i == 0 && i2 == 0) {
                C78353t tVar = (C78353t) yVar;
                String str2 = tVar.f229609e;
                ((HashMap) this.f210202x).put(Long.valueOf(tVar.f229608d.f209672o), str2);
                tVar.f229608d.f209667g = tVar.f229610f;
                if (!"-1".equals(str2) && !"0".equals(str2) && !Util.isNullOrNil(tVar.f229611g)) {
                    C76879j.m92712F(this, tVar.f229611g, "", true);
                } else if ("0".equals(str2)) {
                    C76701a.makeText((Context) this, (CharSequence) !Util.isNullOrNil(tVar.f229611g) ? tVar.f229611g : getString(C0966R.string.l3h), 0).show();
                }
                this.f210193o.notifyDataSetChanged();
                return true;
            } else if (z) {
                if (Util.isNullOrNil(str)) {
                    str = getString(C0966R.string.l_3);
                }
                C76879j.m92713G(this, str, (String) null, false, new C72289a(this));
                return true;
            }
        }
        return false;
    }
}
