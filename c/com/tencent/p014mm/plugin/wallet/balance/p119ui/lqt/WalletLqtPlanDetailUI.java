package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67197o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43314s0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71649o1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdNewUI;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import g63.C75886j;
import hp3.C87581a;
import j20.C117292a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import p755xs.C102720b;
import te3.C50004jk3;
import te3.C52250zd3;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI */
public class WalletLqtPlanDetailUI extends WalletLqtBasePresenterUI {

    /* renamed from: D */
    public static final /* synthetic */ int f208058D = 0;

    /* renamed from: A */
    public int f208059A;

    /* renamed from: B */
    public boolean f208060B;

    /* renamed from: C */
    public boolean f208061C;

    /* renamed from: e */
    public C43314s0 f208062e = ((C43314s0) this.f207915d.mo136940b(this, C43314s0.class));

    /* renamed from: f */
    public String f208063f;

    /* renamed from: g */
    public List<C52250zd3> f208064g = new ArrayList();

    /* renamed from: h */
    public C78017yd3 f208065h;

    /* renamed from: i */
    public C43334c f208066i;

    /* renamed from: j */
    public WalletTextView f208067j;

    /* renamed from: n */
    public TextView f208068n;

    /* renamed from: o */
    public CdnImageView f208069o;

    /* renamed from: p */
    public TextView f208070p;

    /* renamed from: q */
    public TextView f208071q;

    /* renamed from: r */
    public TextView f208072r;

    /* renamed from: s */
    public ListView f208073s;

    /* renamed from: t */
    public LinearLayout f208074t;

    /* renamed from: u */
    public LinearLayout f208075u;

    /* renamed from: v */
    public LinearLayout f208076v;

    /* renamed from: w */
    public LinearLayout f208077w;

    /* renamed from: x */
    public View f208078x;

    /* renamed from: y */
    public View f208079y;

    /* renamed from: z */
    public int f208080z;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI$c */
    public class C43334c extends BaseAdapter {
        public C43334c(C71800i1 i1Var) {
        }

        public int getCount() {
            return ((ArrayList) WalletLqtPlanDetailUI.this.f208064g).size();
        }

        public Object getItem(int i) {
            return (C52250zd3) ((ArrayList) WalletLqtPlanDetailUI.this.f208064g).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            String str;
            if (view == null) {
                view2 = LayoutInflater.from(WalletLqtPlanDetailUI.this.getContext()).inflate(C0966R.C0971layout.f359866b91, viewGroup, false);
                view2.setTag(new C43335d(view2));
            } else {
                view2 = view;
            }
            C52250zd3 zd32 = (C52250zd3) ((ArrayList) WalletLqtPlanDetailUI.this.f208064g).get(i);
            C43335d dVar = (C43335d) view2.getTag();
            dVar.f117194b.setText(zd32.f145841d);
            if (zd32.f145843f == 2) {
                TextView textView = dVar.f117195c;
                WalletLqtPlanDetailUI walletLqtPlanDetailUI = WalletLqtPlanDetailUI.this;
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("");
                WalletLqtPlanDetailUI walletLqtPlanDetailUI2 = WalletLqtPlanDetailUI.this;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                View view3 = view2;
                sb4.append(zd32.f145842e);
                String sb5 = sb4.toString();
                int i2 = WalletLqtPlanDetailUI.f208058D;
                walletLqtPlanDetailUI2.getClass();
                if (sb5.length() == 1) {
                    str = "0.0" + sb5;
                } else if (sb5.length() == 2) {
                    str = "0." + sb5;
                } else {
                    str = sb5.substring(0, sb5.length() - 2) + "." + sb5.substring(sb5.length() - 2);
                }
                sb.append(str);
                objArr[0] = sb.toString();
                textView.setText(walletLqtPlanDetailUI.getString(C0966R.string.kyk, objArr));
                dVar.f117195c.setTextColor(WalletLqtPlanDetailUI.this.getResources().getColor(C0966R.color.a7f));
                return view3;
            }
            View view4 = view2;
            dVar.f117195c.setText(zd32.f145844g);
            dVar.f117195c.setTextColor(WalletLqtPlanDetailUI.this.getResources().getColor(C0966R.color.aip));
            return view4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI$d */
    public class C43335d {

        /* renamed from: a */
        public View f117193a;

        /* renamed from: b */
        public TextView f117194b;

        /* renamed from: c */
        public TextView f117195c;

        public C43335d(View view) {
            this.f117193a = view;
            this.f117194b = (TextView) view.findViewById(C0966R.C0970id.bz6);
            this.f117195c = (TextView) view.findViewById(C0966R.C0970id.gyp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI$a */
    public class C71748a implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ Dialog f208081a;

        public C71748a(Dialog dialog) {
            this.f208081a = dialog;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            this.f208081a.dismiss();
            if (obj instanceof C67197o) {
                ((C67197o) obj).mo91297a(WalletLqtPlanDetailUI.this.getContext(), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI$b */
    public class C71749b implements C87581a<Object, C50004jk3> {

        /* renamed from: a */
        public final /* synthetic */ Dialog f208083a;

        public C71749b(Dialog dialog) {
            this.f208083a = dialog;
        }

        public Object call(Object obj) {
            C50004jk3 jk32 = (C50004jk3) obj;
            WalletLqtPlanDetailUI.this.f208063f = jk32.f136172f;
            if (jk32.f136173g.size() != 0) {
                ((ArrayList) WalletLqtPlanDetailUI.this.f208064g).addAll(jk32.f136173g);
                WalletLqtPlanDetailUI walletLqtPlanDetailUI = WalletLqtPlanDetailUI.this;
                walletLqtPlanDetailUI.f208060B = false;
                String str = walletLqtPlanDetailUI.f208063f;
                if (str != null) {
                    walletLqtPlanDetailUI.f208071q.setText(str);
                }
                List<C52250zd3> list = walletLqtPlanDetailUI.f208064g;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    int size = walletLqtPlanDetailUI.f208059A + ((ArrayList) walletLqtPlanDetailUI.f208064g).size();
                    walletLqtPlanDetailUI.f208059A = size;
                    Log.m105919d("MicroMsg.WalletLqtPlanDetailUI", "doPlanOrderList：mPlanOrderInfoItemList ！= null，totalMonthMoneyTips：%s，mOffSet：%s", walletLqtPlanDetailUI.f208063f, Integer.valueOf(size));
                    walletLqtPlanDetailUI.f208066i.notifyDataSetChanged();
                }
            } else {
                WalletLqtPlanDetailUI.this.f208060B = true;
            }
            if (!WalletLqtPlanDetailUI.this.f208061C || jk32.f136173g.size() != 0) {
                WalletLqtPlanDetailUI.this.f208073s.setVisibility(0);
                WalletLqtPlanDetailUI.this.f208074t.setVisibility(0);
                View view = WalletLqtPlanDetailUI.this.f208078x;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WalletLqtPlanDetailUI.this.f208072r.setVisibility(8);
                WalletLqtPlanDetailUI.this.f208061C = false;
            } else {
                WalletLqtPlanDetailUI walletLqtPlanDetailUI2 = WalletLqtPlanDetailUI.this;
                walletLqtPlanDetailUI2.f208072r.setText(walletLqtPlanDetailUI2.getString(C0966R.string.kxx));
                WalletLqtPlanDetailUI.this.f208072r.setVisibility(0);
                WalletLqtPlanDetailUI.this.f208074t.setVisibility(8);
                View view3 = WalletLqtPlanDetailUI.this.f208078x;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$3", "call", "(Lcom/tencent/mm/protocal/protobuf/QryAutoPlanOrderListResp;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WalletLqtPlanDetailUI.this.f208061C = false;
            }
            this.f208083a.dismiss();
            WalletLqtPlanDetailUI walletLqtPlanDetailUI3 = WalletLqtPlanDetailUI.this;
            Log.m105919d("MicroMsg.WalletLqtPlanDetailUI", "doPlanOrderList：totalMonthNum：%s，mPlanOrderInfoItemList：%s", walletLqtPlanDetailUI3.f208063f, walletLqtPlanDetailUI3.f208064g);
            return null;
        }
    }

    /* renamed from: H7 */
    public static void m84224H7(WalletLqtPlanDetailUI walletLqtPlanDetailUI, int i) {
        walletLqtPlanDetailUI.getClass();
        Log.m105924i("MicroMsg.WalletLqtPlanDetailUI", "go to check pwd");
        Intent intent = new Intent(walletLqtPlanDetailUI, WalletCheckPwdNewUI.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        MMApplicationContext.getContext();
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        intent.putExtra("subtitle", C71649o1.m84126a(i));
        walletLqtPlanDetailUI.startActivityForResult(intent, i);
    }

    /* renamed from: I7 */
    public final void mo98952I7(int i, int i2, int i3) {
        Dialog d = C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null);
        C43314s0.C43317c cVar = this.f208062e.f117153d;
        cVar.getClass();
        ((C88633e) C88643g.m110549g(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).mo123061d(cVar).mo123062e(new C71749b(d)).mo123065b(new C71748a(d));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359867b92;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WalletLqtPlanDetailUI", "activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            if (intent != null) {
                intent.putExtra("oper_type", i);
                intent.putExtra("plan_id", this.f208080z);
                setResult(-1, intent);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("oper_type", i);
                setResult(-1, intent2);
            }
        }
        finish();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_item_detail");
        if (parcelableExtra instanceof CgiLqtPlanOrderList.PlanItemParcel) {
            this.f208065h = CgiLqtPlanOrderList.m84099k((CgiLqtPlanOrderList.PlanItemParcel) parcelableExtra);
        } else {
            Log.m105924i("MicroMsg.WalletLqtPlanDetailUI", "parcelable no instanceof CgiLqtPlanOrderList.PlanItemParcel");
            finish();
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        C78017yd3 yd32 = this.f208065h;
        if (yd32 != null) {
            addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C71802j1(this, yd32));
        }
        C78017yd3 yd33 = this.f208065h;
        if (yd33 != null) {
            LinearLayout linearLayout = (LinearLayout) View.inflate(getBaseContext(), C0966R.C0971layout.f359865b90, (ViewGroup) null);
            this.f208077w = linearLayout;
            this.f208067j = (WalletTextView) linearLayout.findViewById(C0966R.C0970id.gyq);
            this.f208075u = (LinearLayout) this.f208077w.findViewById(C0966R.C0970id.k0y);
            this.f208076v = (LinearLayout) this.f208077w.findViewById(C0966R.C0970id.kkw);
            this.f208068n = (TextView) this.f208077w.findViewById(C0966R.C0970id.kku);
            this.f208069o = (CdnImageView) this.f208077w.findViewById(C0966R.C0970id.a5q);
            this.f208070p = (TextView) this.f208077w.findViewById(C0966R.C0970id.axg);
            this.f208071q = (TextView) this.f208077w.findViewById(C0966R.C0970id.kkp);
            this.f208074t = (LinearLayout) this.f208077w.findViewById(C0966R.C0970id.kkq);
            this.f208079y = this.f208077w.findViewById(C0966R.C0970id.f358397ew3);
            this.f208072r = (TextView) this.f208077w.findViewById(C0966R.C0970id.kev);
            this.f208073s = (ListView) findViewById(C0966R.C0970id.c3q);
            this.f208078x = findViewById(C0966R.C0970id.g_n);
            C43334c cVar = new C43334c((C71800i1) null);
            this.f208066i = cVar;
            this.f208073s.setAdapter(cVar);
            this.f208073s.addHeaderView(this.f208077w);
            this.f208067j.mo105015b();
            BigDecimal h = C75228t.m90248h("" + yd33.f228572e, "100", 2, RoundingMode.HALF_UP);
            if (((double) h.intValue()) == h.doubleValue()) {
                WalletTextView walletTextView = this.f208067j;
                String str = "" + h.intValue();
                if (!str.contains(".")) {
                    str = str + ".00";
                }
                walletTextView.setText(str);
            } else {
                WalletTextView walletTextView2 = this.f208067j;
                String bigDecimal = h.toString();
                if (!bigDecimal.contains(".")) {
                    bigDecimal = bigDecimal + ".00";
                }
                walletTextView2.setText(bigDecimal);
            }
            this.f208068n.setText(getString(C0966R.string.kxt, new Object[]{"" + yd33.f228571d}));
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C75886j(yd33.f228583s));
            if (N6 != null) {
                this.f208069o.setImageBitmap(N6);
            }
            this.f208070p.setText(String.format("%s %s（%s）", new Object[]{yd33.f228582r, yd33.f228584t, yd33.f228574g}));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f208076v.getLayoutParams();
            if (yd33.f228581q != 1) {
                this.f208075u.setVisibility(0);
                layoutParams.setMargins(0, C76577a.m92151b(getContext(), 8), 0, 0);
                Log.m105925i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", Integer.valueOf(layoutParams.topMargin));
            } else {
                this.f208075u.setVisibility(8);
                layoutParams.setMargins(0, C76577a.m92151b(getContext(), 16), 0, 0);
                Log.m105925i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", Integer.valueOf(layoutParams.topMargin));
            }
            this.f208076v.setLayoutParams(layoutParams);
            this.f208059A = 0;
            this.f208061C = true;
            mo98952I7(yd33.f228580p, 0, 6);
            this.f208073s.setOnScrollListener(new C71800i1(this, yd33));
            this.f208079y.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2927a));
        }
    }
}
