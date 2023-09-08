package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMGridView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import di3.C86312j;
import eb0.C31519v2;
import f21.C45737a;
import f21.C45743f;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import p910lj.C76701a;
import te3.C51864wq;
import te3.C77933g43;

@C88989a(2)
/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI */
public class QrRewardSelectMoneyUI extends QrRewardBaseUI {

    /* renamed from: A */
    public String f109985A;

    /* renamed from: B */
    public String f109986B;

    /* renamed from: C */
    public String f109987C;

    /* renamed from: D */
    public String f109988D;

    /* renamed from: E */
    public C77933g43 f109989E;

    /* renamed from: d */
    public List<Integer> f109990d = new ArrayList();

    /* renamed from: e */
    public CdnImageView f109991e;

    /* renamed from: f */
    public TextView f109992f;

    /* renamed from: g */
    public TextView f109993g;

    /* renamed from: h */
    public TextView f109994h;

    /* renamed from: i */
    public TextView f109995i;

    /* renamed from: j */
    public MMGridView f109996j;

    /* renamed from: n */
    public TextView f109997n;

    /* renamed from: o */
    public WcPayBannerView f109998o;

    /* renamed from: p */
    public C2187e f109999p;

    /* renamed from: q */
    public String f110000q;

    /* renamed from: r */
    public int f110001r;

    /* renamed from: s */
    public String f110002s;

    /* renamed from: t */
    public String f110003t;

    /* renamed from: u */
    public String f110004u;

    /* renamed from: v */
    public int f110005v;

    /* renamed from: w */
    public String f110006w;

    /* renamed from: x */
    public String f110007x;

    /* renamed from: y */
    public String f110008y;

    /* renamed from: z */
    public String f110009z;

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$a */
    public class C2185a implements AdapterView.OnItemClickListener {
        public C2185a() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/collect/reward/ui/QrRewardSelectMoneyUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI r9 = com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardSelectMoneyUI.this
                r10 = 1
                com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardSelectMoneyUI.m44259H7(r9, r8, r10)
                java.lang.String r8 = "com/tencent/mm/plugin/collect/reward/ui/QrRewardSelectMoneyUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.reward.p037ui.QrRewardSelectMoneyUI.C2185a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$b */
    public class C2186b extends C7089c0 {
        public C2186b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            QrRewardSelectMoneyUI.m44259H7(QrRewardSelectMoneyUI.this, 0, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$e */
    public class C2187e extends BaseAdapter {
        public C2187e(C2185a aVar) {
        }

        public int getCount() {
            return QrRewardSelectMoneyUI.this.f109990d.size();
        }

        public Object getItem(int i) {
            return QrRewardSelectMoneyUI.this.f109990d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(QrRewardSelectMoneyUI.this.getContext()).inflate(C0966R.C0971layout.bp7, viewGroup, false);
            }
            int intValue = ((Integer) getItem(i)).intValue();
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.iar);
            int i2 = intValue / 100;
            double d = ((double) intValue) / 100.0d;
            if (d > ((double) i2)) {
                textView.setText(String.format("%.2f", new Object[]{Double.valueOf(d)}) + QrRewardSelectMoneyUI.this.getString(C0966R.string.f361154hq1));
            } else {
                textView.setText(String.format("%d", new Object[]{Integer.valueOf(i2)}) + QrRewardSelectMoneyUI.this.getString(C0966R.string.f361154hq1));
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$c */
    public class C40898c implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45743f f110010a;

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$c$a */
        public class C40899a implements DialogInterface.OnClickListener {
            public C40899a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                QrRewardSelectMoneyUI.this.finish();
            }
        }

        public C40898c(C45743f fVar) {
            this.f110010a = fVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.QrRewardSelectMoneyUI", "net error: %s", this.f110010a);
            C76879j.m92713G(QrRewardSelectMoneyUI.this.getContext(), QrRewardSelectMoneyUI.this.getString(C0966R.string.l_3), (String) null, false, new C40899a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI$d */
    public class C40900d implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45743f f110013a;

        public C40900d(C45743f fVar) {
            this.f110013a = fVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105918d("MicroMsg.QrRewardSelectMoneyUI", "callback succ");
            QrRewardSelectMoneyUI qrRewardSelectMoneyUI = QrRewardSelectMoneyUI.this;
            C51864wq wqVar = this.f110013a.f123601n;
            qrRewardSelectMoneyUI.f110003t = wqVar.f144214f;
            qrRewardSelectMoneyUI.f110004u = wqVar.f144218j;
            qrRewardSelectMoneyUI.f110005v = wqVar.f144222q;
            qrRewardSelectMoneyUI.f110006w = wqVar.f144223r;
            qrRewardSelectMoneyUI.f110007x = wqVar.f144216h;
            qrRewardSelectMoneyUI.f110008y = wqVar.f144220o;
            qrRewardSelectMoneyUI.f110009z = wqVar.f144221p;
            qrRewardSelectMoneyUI.f109985A = wqVar.f144219n;
            qrRewardSelectMoneyUI.f109986B = wqVar.f144217i;
            LinkedList<Integer> linkedList = wqVar.f144215g;
            qrRewardSelectMoneyUI.f109990d = linkedList;
            qrRewardSelectMoneyUI.f109987C = wqVar.f144224s;
            qrRewardSelectMoneyUI.f109988D = wqVar.f144225t;
            qrRewardSelectMoneyUI.f109989E = wqVar.f144226u;
            if (linkedList == null) {
                Log.m105924i("MicroMsg.QrRewardSelectMoneyUI", "amt_list is null");
                QrRewardSelectMoneyUI.this.f109990d = new LinkedList();
            }
            QrRewardSelectMoneyUI qrRewardSelectMoneyUI2 = QrRewardSelectMoneyUI.this;
            qrRewardSelectMoneyUI2.f109991e.setVisibility(0);
            qrRewardSelectMoneyUI2.f109997n.setVisibility(0);
            qrRewardSelectMoneyUI2.f109995i.setVisibility(0);
            if (Util.isNullOrNil(qrRewardSelectMoneyUI2.f109988D)) {
                String str2 = qrRewardSelectMoneyUI2.f110003t;
                C86709a0.m107528h();
                C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(str2);
                if (H3 == null || ((int) H3.f108320R1) <= 0) {
                    Log.m105918d("MicroMsg.QrRewardSelectMoneyUI", "Receiver in contactStg and try to get contact");
                    C31519v2.m39436a().mo55988e(str2, "", new C2189f(qrRewardSelectMoneyUI2, Util.nowMilliSecond()));
                } else {
                    ((C76705f) C86312j.m106911c(C76705f.class)).D20(qrRewardSelectMoneyUI2.f109991e, str2, 0.03f);
                    qrRewardSelectMoneyUI2.mo63895I7(str2);
                }
            } else {
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(qrRewardSelectMoneyUI2, 50.0f);
                qrRewardSelectMoneyUI2.f109991e.setRoundCorner(true);
                qrRewardSelectMoneyUI2.f109991e.mo100288c(qrRewardSelectMoneyUI2.f109988D, fromDPToPix, fromDPToPix, C0966R.C0969drawable.bfa);
                qrRewardSelectMoneyUI2.mo63895I7(qrRewardSelectMoneyUI2.f110003t);
            }
            if (!Util.isNullOrNil(qrRewardSelectMoneyUI2.f110007x)) {
                qrRewardSelectMoneyUI2.f109994h.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(qrRewardSelectMoneyUI2, qrRewardSelectMoneyUI2.getString(C0966R.string.f361153hq0, new Object[]{qrRewardSelectMoneyUI2.f110007x}), qrRewardSelectMoneyUI2.f109994h.getTextSize()));
            }
            if (!Util.isNullOrNil(qrRewardSelectMoneyUI2.f109986B)) {
                qrRewardSelectMoneyUI2.f109992f.setText(qrRewardSelectMoneyUI2.f109986B);
            } else {
                qrRewardSelectMoneyUI2.f109992f.setVisibility(8);
            }
            qrRewardSelectMoneyUI2.f109999p.notifyDataSetChanged();
            qrRewardSelectMoneyUI2.f109998o.setBannerData(qrRewardSelectMoneyUI2.f109989E);
        }
    }

    /* renamed from: H7 */
    public static void m44259H7(QrRewardSelectMoneyUI qrRewardSelectMoneyUI, int i, int i2) {
        qrRewardSelectMoneyUI.getClass();
        Log.m105924i("MicroMsg.QrRewardSelectMoneyUI", "go to grant ui");
        Intent intent = new Intent(qrRewardSelectMoneyUI.getContext(), QrRewardGrantUI.class);
        intent.putExtra("key_amt_type", i2);
        if (i2 == 1) {
            intent.putExtra("key_money_amt", i);
        }
        intent.putExtra("key_rcvr_name", qrRewardSelectMoneyUI.f110003t);
        intent.putExtra("key_rcvr_true_name", qrRewardSelectMoneyUI.f110004u);
        intent.putExtra("key_rcvr_open_id", qrRewardSelectMoneyUI.f110006w);
        intent.putExtra("key_qrcode_desc", qrRewardSelectMoneyUI.f110007x);
        intent.putExtra("key_channel", qrRewardSelectMoneyUI.f110001r);
        intent.putExtra("key_web_url", qrRewardSelectMoneyUI.f110002s);
        intent.putExtra("key_scan_id", qrRewardSelectMoneyUI.f109985A);
        intent.putExtra("key_sxtend_1", qrRewardSelectMoneyUI.f110008y);
        intent.putExtra("key_sxtend_2", qrRewardSelectMoneyUI.f110009z);
        intent.putExtra("key_max_amt", qrRewardSelectMoneyUI.f110005v);
        intent.putExtra("key_receiver_nickname", qrRewardSelectMoneyUI.f109987C);
        intent.putExtra("key_photo_url", qrRewardSelectMoneyUI.f109988D);
        intent.putExtra("key_chat_type", qrRewardSelectMoneyUI.getIntent().getIntExtra("key_chat_type", 0));
        intent.putExtra("key_send_type", qrRewardSelectMoneyUI.getIntent().getIntExtra("key_send_type", 0));
        C77933g43 g432 = qrRewardSelectMoneyUI.f109989E;
        if (g432 != null) {
            try {
                intent.putExtra("key_notice_item", Base64.encodeToString(g432.toByteArray(), 2));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.QrRewardSelectMoneyUI", e, "", new Object[0]);
            }
        }
        qrRewardSelectMoneyUI.startActivityForResult(intent, 1);
    }

    /* renamed from: I7 */
    public final void mo63895I7(String str) {
        this.f109993g.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), Util.isNullOrNil(this.f109987C) ? C75228t.m90268r(str) : this.f109987C));
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bp8;
    }

    public void initView() {
        this.f109991e = (CdnImageView) findViewById(C0966R.C0970id.ias);
        this.f109992f = (TextView) findViewById(C0966R.C0970id.iax);
        this.f109993g = (TextView) findViewById(C0966R.C0970id.iav);
        this.f109994h = (TextView) findViewById(C0966R.C0970id.iat);
        this.f109995i = (TextView) findViewById(C0966R.C0970id.iay);
        this.f109996j = (MMGridView) findViewById(C0966R.C0970id.iau);
        this.f109997n = (TextView) findViewById(C0966R.C0970id.iaw);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f109998o = wcPayBannerView;
        wcPayBannerView.setBgColor(getResources().getColor(C0966R.color.f2960ag));
        this.f109998o.setTextColor(getResources().getColor(C0966R.color.f2975b6));
        C2187e eVar = new C2187e((C2185a) null);
        this.f109999p = eVar;
        this.f109996j.setAdapter(eVar);
        this.f109996j.setOnItemClickListener(new C2185a());
        this.f109997n.setOnClickListener(new C2186b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Log.m105924i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1516);
        setMMTitle((int) C0966R.string.hpj);
        this.f110000q = getIntent().getStringExtra("key_qrcode_url");
        this.f110001r = getIntent().getIntExtra("key_channel", 0);
        this.f110002s = getIntent().getStringExtra("key_web_url");
        Log.m105924i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
        doSceneProgress(new C45743f(this.f110000q, this.f110001r, this.f110002s));
        initView();
        int intExtra = getIntent().getIntExtra("key_scene", 0);
        Log.m105919d("MicroMsg.QrRewardSelectMoneyUI", "scene: %s", Integer.valueOf(intExtra));
        C115669n.INSTANCE.mo160131h(14721, 2, Integer.valueOf(intExtra));
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1516);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C45743f) {
            C45743f fVar = (C45743f) yVar;
            fVar.mo71234m1(new C40900d(fVar));
            if (fVar.f123591i) {
                Log.m105920e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
                if (!Util.isNullOrNil(fVar.f123601n.f144213e)) {
                    C76701a.makeText((Context) this, (CharSequence) fVar.f123601n.f144213e, 1).show();
                }
                finish();
            }
            C40898c cVar = new C40898c(fVar);
            if (fVar.f123590h) {
                cVar.mo63897a(fVar.f123586d, fVar.f123587e, fVar.f123588f, fVar);
            }
            setContentViewVisibility(0);
        }
        return true;
    }
}
