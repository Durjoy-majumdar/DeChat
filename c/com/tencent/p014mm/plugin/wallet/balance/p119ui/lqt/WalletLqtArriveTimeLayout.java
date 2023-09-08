package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import te3.C64862yp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout */
public class WalletLqtArriveTimeLayout extends LinearLayout {

    /* renamed from: d */
    public List<C64862yp3> f207903d = new ArrayList();

    /* renamed from: e */
    public List<WeakReference<C71717c>> f207904e = new ArrayList();

    /* renamed from: f */
    public C64862yp3 f207905f;

    /* renamed from: g */
    public C71716b f207906g;

    /* renamed from: h */
    public boolean f207907h = false;

    /* renamed from: i */
    public View.OnClickListener f207908i = new C71715a();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout$a */
    public class C71715a implements View.OnClickListener {
        public C71715a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Iterator it = ((ArrayList) WalletLqtArriveTimeLayout.this.f207904e).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() != null && ((C71717c) weakReference.get()).f207912c.isEnabled()) {
                    ((C71717c) weakReference.get()).f207912c.setChecked(false);
                }
            }
            C71717c cVar = (C71717c) view.getTag();
            List<C64862yp3> list = WalletLqtArriveTimeLayout.this.f207903d;
            if (list == null || ((ArrayList) list).size() <= cVar.f207914e) {
                WalletLqtArriveTimeLayout.this.f207905f = null;
            } else {
                cVar.f207912c.setChecked(true);
                WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = WalletLqtArriveTimeLayout.this;
                walletLqtArriveTimeLayout.f207905f = (C64862yp3) ((ArrayList) walletLqtArriveTimeLayout.f207903d).get(cVar.f207914e);
            }
            C71716b bVar = WalletLqtArriveTimeLayout.this.f207906g;
            if (bVar != null) {
                WalletLqtSaveFetchUI walletLqtSaveFetchUI = ((C71788c2) bVar).f208317a;
                int i = WalletLqtSaveFetchUI.f208151m1;
                walletLqtSaveFetchUI.mo98972K7(true);
            }
            Log.m105925i("MicroMsg.WalletLqtArriveTimeLayout", "click item: %s, %s", Integer.valueOf(cVar.f207914e), cVar.f207910a.getText());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout$b */
    public interface C71716b {
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout$c */
    public static class C71717c {

        /* renamed from: a */
        public TextView f207910a;

        /* renamed from: b */
        public TextView f207911b;

        /* renamed from: c */
        public RadioButton f207912c;

        /* renamed from: d */
        public View f207913d;

        /* renamed from: e */
        public int f207914e;
    }

    public WalletLqtArriveTimeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo98907a(List<C64862yp3> list, boolean z) {
        this.f207907h = true;
        ((ArrayList) this.f207903d).clear();
        ((ArrayList) this.f207903d).addAll(list);
        ((ArrayList) this.f207904e).clear();
        removeAllViews();
        setVisibility(0);
        List<C64862yp3> list2 = this.f207903d;
        if (list2 != null && !((ArrayList) list2).isEmpty()) {
            Iterator it = ((ArrayList) this.f207903d).iterator();
            int i = 0;
            while (it.hasNext()) {
                C64862yp3 yp32 = (C64862yp3) it.next();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cf8, this, false);
                C71717c cVar = new C71717c();
                cVar.f207913d = linearLayout;
                cVar.f207910a = (TextView) linearLayout.findViewById(C0966R.C0970id.gb8);
                cVar.f207911b = (TextView) linearLayout.findViewById(C0966R.C0970id.gb7);
                cVar.f207912c = (RadioButton) linearLayout.findViewById(C0966R.C0970id.gb_);
                cVar.f207910a.setText(yp32.f186580e);
                if (!Util.isNullOrNil(yp32.f186581f)) {
                    cVar.f207911b.setText(yp32.f186581f);
                } else {
                    cVar.f207911b.setVisibility(8);
                }
                if (this.f207905f != null) {
                    Log.m105919d("MicroMsg.WalletLqtArriveTimeLayout", "arrive wording: %s, %s, %s", Boolean.valueOf(z), Integer.valueOf(this.f207905f.f186579d), Integer.valueOf(yp32.f186579d));
                }
                if (z) {
                    C64862yp3 yp33 = this.f207905f;
                    if (yp33 != null && yp33.f186579d == yp32.f186579d) {
                        cVar.f207912c.setChecked(true);
                    }
                } else if (i == 0) {
                    cVar.f207912c.setChecked(true);
                    this.f207905f = yp32;
                }
                int i2 = i + 1;
                cVar.f207914e = i;
                linearLayout.setTag(cVar);
                linearLayout.setOnClickListener(this.f207908i);
                ((ArrayList) this.f207904e).add(new WeakReference(cVar));
                addView(linearLayout);
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public void mo98908b(String str) {
        Log.m105925i("MicroMsg.WalletLqtArriveTimeLayout", "input money: %s", str);
        List<C64862yp3> list = this.f207903d;
        if (list != null && !((ArrayList) list).isEmpty()) {
            this.f207905f = null;
            Iterator it = ((ArrayList) this.f207904e).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() != null) {
                    ((C71717c) weakReference.get()).f207912c.setEnabled(true);
                    ((C71717c) weakReference.get()).f207912c.setChecked(false);
                }
            }
            int X = C75228t.m90231X(str, "100");
            Iterator it4 = ((ArrayList) this.f207903d).iterator();
            int i = 0;
            while (it4.hasNext()) {
                C64862yp3 yp32 = (C64862yp3) it4.next();
                int i2 = yp32.f186582g;
                if (i2 < 0 || X <= i2) {
                    C71717c cVar = (C71717c) ((WeakReference) ((ArrayList) this.f207904e).get(i)).get();
                    if (cVar != null) {
                        cVar.f207912c.setEnabled(true);
                        cVar.f207910a.setEnabled(true);
                        cVar.f207911b.setEnabled(true);
                        cVar.f207913d.setEnabled(true);
                        if (this.f207905f == null) {
                            Log.m105925i("MicroMsg.WalletLqtArriveTimeLayout", "auto select type: %s", Integer.valueOf(yp32.f186579d));
                            cVar.f207912c.setChecked(true);
                            this.f207905f = yp32;
                            C71716b bVar = this.f207906g;
                            if (bVar != null) {
                                WalletLqtSaveFetchUI walletLqtSaveFetchUI = ((C71788c2) bVar).f208317a;
                                int i3 = WalletLqtSaveFetchUI.f208151m1;
                                walletLqtSaveFetchUI.mo98972K7(true);
                            }
                            if (i > 0) {
                                cVar.f207910a.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3536x0));
                            } else {
                                cVar.f207910a.setTextColor(MMApplicationContext.getContext().getResources().getColorStateList(C0966R.color.ajg));
                            }
                        } else {
                            cVar.f207910a.setTextColor(MMApplicationContext.getContext().getResources().getColorStateList(C0966R.color.ajg));
                        }
                    }
                } else {
                    Log.m105925i("MicroMsg.WalletLqtArriveTimeLayout", "disable item: %s, %s", Integer.valueOf(i), Integer.valueOf(yp32.f186582g));
                    C71717c cVar2 = (C71717c) ((WeakReference) ((ArrayList) this.f207904e).get(i)).get();
                    if (cVar2 != null) {
                        cVar2.f207912c.setChecked(false);
                        cVar2.f207912c.setEnabled(false);
                        cVar2.f207910a.setEnabled(false);
                        cVar2.f207911b.setEnabled(false);
                        cVar2.f207913d.setEnabled(false);
                        this.f207905f = null;
                        C71716b bVar2 = this.f207906g;
                        if (bVar2 != null) {
                            WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = ((C71788c2) bVar2).f208317a;
                            int i4 = WalletLqtSaveFetchUI.f208151m1;
                            walletLqtSaveFetchUI2.mo98972K7(true);
                        }
                    }
                }
                i++;
            }
        }
    }

    public List<C64862yp3> getRedeemTypeList() {
        return this.f207903d;
    }

    public C64862yp3 getSelectRedeemType() {
        return this.f207905f;
    }

    public void setCallback(C71716b bVar) {
        this.f207906g = bVar;
    }

    public WalletLqtArriveTimeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
