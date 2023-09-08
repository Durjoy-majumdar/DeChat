package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.base.MMGridView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import eb0.C75592q0;
import f21.C45737a;
import f21.C45744g;
import f40.C86709a0;
import g21.C32303b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import p910lj.C76701a;
import te3.C77933g43;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI */
public class QrRewardSetMoneyUI extends QrRewardBaseUI {

    /* renamed from: x */
    public static final /* synthetic */ int f110015x = 0;

    /* renamed from: d */
    public MMGridView f110016d;

    /* renamed from: e */
    public TextView f110017e;

    /* renamed from: f */
    public Button f110018f;

    /* renamed from: g */
    public MMEditText f110019g;

    /* renamed from: h */
    public ImageView f110020h;

    /* renamed from: i */
    public TextView f110021i;

    /* renamed from: j */
    public TextView f110022j;

    /* renamed from: n */
    public WcPayBannerView f110023n;

    /* renamed from: o */
    public SparseArray<WalletFormView> f110024o;

    /* renamed from: p */
    public List<Integer> f110025p;

    /* renamed from: q */
    public List<Integer> f110026q;

    /* renamed from: r */
    public String f110027r;

    /* renamed from: s */
    public int f110028s;

    /* renamed from: t */
    public boolean f110029t = false;

    /* renamed from: u */
    public C77933g43 f110030u;

    /* renamed from: v */
    public Runnable f110031v = new C40904d();

    /* renamed from: w */
    public TextWatcher f110032w = new C40905e();

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$a */
    public class C40901a extends C30870z1 {
        public C40901a() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            boolean z;
            if (!QrRewardSetMoneyUI.m44263H7(QrRewardSetMoneyUI.this)) {
                QrRewardSetMoneyUI qrRewardSetMoneyUI = QrRewardSetMoneyUI.this;
                qrRewardSetMoneyUI.getClass();
                Log.m105924i("MicroMsg.QrRewardSetMoneyUI", "do set code");
                String replace = qrRewardSetMoneyUI.f110019g.getText().toString().replace("\n", "");
                LinkedList linkedList = new LinkedList(qrRewardSetMoneyUI.f110026q);
                boolean z2 = qrRewardSetMoneyUI.f110029t;
                int i = 0;
                while (true) {
                    if (i >= qrRewardSetMoneyUI.f110025p.size()) {
                        z = false;
                        break;
                    } else if (!qrRewardSetMoneyUI.f110025p.get(i).equals(((ArrayList) qrRewardSetMoneyUI.f110026q).get(i))) {
                        Log.m105925i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", qrRewardSetMoneyUI.f110025p.get(i), ((ArrayList) qrRewardSetMoneyUI.f110026q).get(i));
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                C45744g gVar = new C45744g(linkedList, replace, z2, z);
                gVar.f123589g = new WeakReference<>(qrRewardSetMoneyUI);
                qrRewardSetMoneyUI.doSceneProgress(gVar, true);
            } else {
                Log.m105924i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
            }
            C115669n.INSTANCE.mo160131h(14721, 1, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$b */
    public class C40902b implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45744g f110034a;

        public C40902b(C45744g gVar) {
            this.f110034a = gVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", Integer.valueOf(this.f110034a.f123604n.f130731d), this.f110034a.f123604n.f130732e);
            if (!Util.isNullOrNil(this.f110034a.f123604n.f130732e)) {
                C76701a.makeText((Context) QrRewardSetMoneyUI.this, (CharSequence) this.f110034a.f123604n.f130732e, 1).show();
            } else {
                C76701a.makeText((Context) QrRewardSetMoneyUI.this, (int) C0966R.string.hpt, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$c */
    public class C40903c implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45744g f110036a;

        public C40903c(C45744g gVar) {
            this.f110036a = gVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            QrRewardSetMoneyUI qrRewardSetMoneyUI = QrRewardSetMoneyUI.this;
            String str2 = this.f110036a.f123604n.f130733f;
            int i3 = QrRewardSetMoneyUI.f110015x;
            qrRewardSetMoneyUI.getClass();
            QrRewardSetMoneyUI.this.f110027r = this.f110036a.f123604n.f130737j;
            Intent intent = new Intent();
            intent.putExtra("key_desc", this.f110036a.f123604n.f130737j);
            intent.putExtra("key_photo_url", this.f110036a.f123604n.f130733f);
            intent.putExtra("key_photo_aeskey", this.f110036a.f123604n.f130734g);
            intent.putExtra("key_photo_width", this.f110036a.f123604n.f130738n);
            intent.putExtra("key_icon_width", this.f110036a.f123604n.f130735h);
            intent.putExtra("key_return_from_first", QrRewardSetMoneyUI.this.f110029t);
            QrRewardSetMoneyUI.this.setResult(-1, intent);
            QrRewardSetMoneyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$d */
    public class C40904d implements Runnable {
        public C40904d() {
        }

        public void run() {
            QrRewardSetMoneyUI.m44263H7(QrRewardSetMoneyUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$e */
    public class C40905e implements TextWatcher {
        public C40905e() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 3) {
                editable.delete(indexOf + 3, length);
            } else if (indexOf > 6) {
                editable.delete(6, indexOf);
            } else if (indexOf == -1 && length > 6) {
                editable.delete(6, length);
            }
            MMHandlerThread.removeRunnable(QrRewardSetMoneyUI.this.f110031v);
            MMHandlerThread.postToMainThreadDelayed(QrRewardSetMoneyUI.this.f110031v, 50);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI$f */
    public class C40906f extends BaseAdapter {
        public C40906f(C40901a aVar) {
        }

        public int getCount() {
            return ((ArrayList) QrRewardSetMoneyUI.this.f110026q).size();
        }

        public Object getItem(int i) {
            return ((ArrayList) QrRewardSetMoneyUI.this.f110026q).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return view == null ? QrRewardSetMoneyUI.this.f110024o.get(i) : view;
        }
    }

    /* renamed from: H7 */
    public static boolean m44263H7(QrRewardSetMoneyUI qrRewardSetMoneyUI) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < qrRewardSetMoneyUI.f110024o.size(); i++) {
            WalletFormView walletFormView = qrRewardSetMoneyUI.f110024o.get(i);
            int round = (int) Math.round(Util.getDouble(walletFormView.getText(), 0.0d) * 100.0d);
            ((ArrayList) qrRewardSetMoneyUI.f110026q).set(i, Integer.valueOf(round));
            if (round > qrRewardSetMoneyUI.f110028s) {
                walletFormView.setContentTextColorRes(C0966R.color.f2962ai);
                z = true;
            } else {
                if (round <= 0) {
                    z2 = true;
                }
                walletFormView.setContentTextColorRes(C0966R.color.a7f);
            }
        }
        if (z) {
            if (!qrRewardSetMoneyUI.f110021i.isShown()) {
                qrRewardSetMoneyUI.f110021i.startAnimation(AnimationUtils.loadAnimation(qrRewardSetMoneyUI, C0966R.C0968anim.f2425cq));
                qrRewardSetMoneyUI.f110021i.setVisibility(0);
            }
            qrRewardSetMoneyUI.f110018f.setEnabled(false);
        } else if (z2) {
            qrRewardSetMoneyUI.f110018f.setEnabled(false);
        } else {
            if (qrRewardSetMoneyUI.f110021i.isShown()) {
                qrRewardSetMoneyUI.f110021i.startAnimation(AnimationUtils.loadAnimation(qrRewardSetMoneyUI, C0966R.C0968anim.f2447d_));
                qrRewardSetMoneyUI.f110021i.setVisibility(8);
            }
            qrRewardSetMoneyUI.f110018f.setEnabled(true);
        }
        return z;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bpa;
    }

    public void initView() {
        Class cls = C76979h.class;
        this.f110016d = (MMGridView) findViewById(C0966R.C0970id.f359000ib3);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f110023n = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f110023n.setBannerData(this.f110030u);
        this.f110018f = (Button) findViewById(C0966R.C0970id.f358999ib2);
        this.f110021i = (TextView) findViewById(C0966R.C0970id.iaz);
        this.f110020h = (ImageView) findViewById(C0966R.C0970id.f358997ib0);
        this.f110019g = (MMEditText) findViewById(C0966R.C0970id.ib4);
        this.f110017e = (TextView) findViewById(C0966R.C0970id.ib5);
        this.f110022j = (TextView) findViewById(C0966R.C0970id.f358998ib1);
        String m = C75592q0.m90783m();
        if (Util.isNullOrNil(m)) {
            m = C75592q0.m90772b();
        }
        this.f110017e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), m));
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f110020h, C75592q0.m90789s(), 0.06f);
        this.f110016d.setAdapter(new C40906f((C40901a) null));
        if (!Util.isNullOrNil(this.f110027r)) {
            this.f110019g.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f110027r, this.f110019g.getTextSize()));
        }
        TextView textView = this.f110021i;
        textView.setText(getString(C0966R.string.hpv, new Object[]{"" + Math.round(((float) this.f110028s) / 100.0f)}));
        if (this.f110029t) {
            this.f110018f.setText(C0966R.string.hpc);
            this.f110022j.setVisibility(8);
        }
        this.f110018f.setOnClickListener(new C40901a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.hpy);
        addSceneEndListener(1562);
        List<String> stringToList = Util.stringToList((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""), ",");
        this.f110025p = new ArrayList();
        if (stringToList.isEmpty()) {
            Log.m105924i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
            this.f110025p = Arrays.asList(C32303b.f85777a);
        } else {
            for (String str : stringToList) {
                this.f110025p.add(Integer.valueOf(Util.getInt(str, 0)));
            }
        }
        this.f110026q = new ArrayList(this.f110025p);
        this.f110028s = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, 20000)).intValue();
        this.f110029t = getIntent().getBooleanExtra("key_first_flag", false);
        this.f110027r = getIntent().getStringExtra("key_desc_word");
        String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                C77933g43 g432 = new C77933g43();
                g432.parseFrom(Base64.decode(stringExtra, 2));
                this.f110030u = g432;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.QrRewardSetMoneyUI", e, "", new Object[0]);
            }
        }
        this.f110024o = new SparseArray<>();
        for (int i = 0; i < this.f110026q.size(); i++) {
            WalletFormView walletFormView = (WalletFormView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bp9, (ViewGroup) null);
            walletFormView.mo105069a(this.f110032w);
            int intValue = this.f110026q.get(i).intValue();
            int i2 = intValue / 100;
            double d = ((double) intValue) / 100.0d;
            if (d > ((double) i2)) {
                walletFormView.setText(String.format("%.2f", new Object[]{Double.valueOf(d)}));
            } else {
                walletFormView.setText(String.format("%d", new Object[]{Integer.valueOf(i2)}));
            }
            setEditFocusListener(walletFormView, 2, false);
            this.f110024o.put(i, walletFormView);
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1562);
        MMHandlerThread.removeRunnable(this.f110031v);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C45744g) {
            C45744g gVar = (C45744g) yVar;
            gVar.mo71234m1(new C40903c(gVar));
            gVar.mo71233l1(new C40902b(gVar));
            if (gVar.f123590h) {
                Log.m105921e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", gVar);
            }
        }
        return false;
    }
}
