package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Context;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b63.C67207t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C45335p;
import de3.C75355a0;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import lg3.C76695c;
import nc0.C76850a;
import p629ny.C76978g;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView */
public class OfflineAlertView extends LinearLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f201796n = 0;

    /* renamed from: d */
    public int f201797d = 0;

    /* renamed from: e */
    public View f201798e = null;

    /* renamed from: f */
    public ViewGroup f201799f = null;

    /* renamed from: g */
    public boolean f201800g = true;

    /* renamed from: h */
    public OfflineAlertView$$h f201801h = null;

    /* renamed from: i */
    public CountDownTimer f201802i;

    /* renamed from: j */
    public C45335p f201803j;

    public OfflineAlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo96280c();
    }

    /* renamed from: a */
    public void mo96278a() {
        ViewGroup viewGroup = this.f201799f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        setVisibility(8);
        OfflineAlertView$$h offlineAlertView$$h = this.f201801h;
        if (offlineAlertView$$h != null) {
            WalletOfflineCoinPurseUI$$g walletOfflineCoinPurseUI$$g = (WalletOfflineCoinPurseUI$$g) offlineAlertView$$h;
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = walletOfflineCoinPurseUI$$g.f201951a;
            int i = WalletOfflineCoinPurseUI.f201810W1;
            walletOfflineCoinPurseUI.getClass();
            ((WalletOfflineCoinPurseUI$$c0) walletOfflineCoinPurseUI$$g.f201951a.component(WalletOfflineCoinPurseUI$$c0.class)).mo96316c3();
        }
        CountDownTimer countDownTimer = this.f201802i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f201803j != null) {
            ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f201803j);
        }
        this.f201797d = 0;
        this.f201800g = true;
    }

    /* renamed from: b */
    public final C67207t.C67208a mo96279b(C67207t tVar, String str) {
        Iterator it = ((ArrayList) tVar.f192975f).iterator();
        while (it.hasNext()) {
            C67207t.C67208a aVar = (C67207t.C67208a) it.next();
            if (aVar.f192979d.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo96280c() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cfd, this);
        this.f201798e = inflate;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.hl6);
        this.f201799f = viewGroup;
        viewGroup.setOnTouchListener(new OfflineAlertView$$e(this));
    }

    /* renamed from: d */
    public boolean mo96281d(int i) {
        int i2;
        if (!mo96282e() || i == (i2 = this.f201797d) || i == 1) {
            return true;
        }
        if (i == 2 && (i2 == 3 || i2 == 4 || i2 == 5)) {
            return true;
        }
        if ((i == 5 && i2 == 4) || i == 6 || i == 7) {
            return true;
        }
        if (i == 8 && (i2 == 5 || i2 == 4 || i2 == 2)) {
            return true;
        }
        return i == 3 ? i2 != 1 : i == 9 && (i2 == 4 || i2 == 5 || i2 == 2);
    }

    /* renamed from: e */
    public boolean mo96282e() {
        return getVisibility() == 0;
    }

    /* renamed from: f */
    public final void mo96283f(View view, View.OnClickListener onClickListener, int i) {
        this.f201797d = i;
        setVisibility(0);
        this.f201799f.removeAllViews();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cfn, this.f201799f, false);
        if (i == 6) {
            ((TextView) inflate.findViewById(C0966R.C0970id.f5782oh)).setText(C0966R.string.heb);
        } else if ((i == 3 || i == 1) && C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            ((TextView) inflate.findViewById(C0966R.C0970id.f5782oh)).setText(C0966R.string.hem);
        }
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.j0f);
        if (viewGroup != null) {
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.j0g);
            textView.setMaxWidth(((((C76577a.m92145A(getContext()) - (C76577a.m92157h(getContext(), C0966R.dimen.f3743cv) * 2)) - (C76577a.m92157h(getContext(), C0966R.dimen.f3736cp) * 2)) - C76577a.m92157h(getContext(), C0966R.dimen.f3736cp)) - C76577a.m92157h(getContext(), C0966R.dimen.f3766df)) - C76577a.m92157h(getContext(), C0966R.dimen.f3703bv));
            viewGroup.post(new OfflineAlertView$$f(this, textView, (ImageView) inflate.findViewById(C0966R.C0970id.j0e), (ImageView) inflate.findViewById(C0966R.C0970id.j0d)));
            if (Build.VERSION.SDK_INT >= 23) {
                viewGroup.setForeground(getResources().getDrawable(C0966R.C0969drawable.al5));
            }
            viewGroup.setOnClickListener(new OfflineAlertView$$g(this, view));
            C75228t.m90252j(viewGroup, C76577a.m92157h(getContext(), C0966R.dimen.f3723cd));
        }
        this.f201799f.addView(inflate);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.hmd);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.hmf);
        Button button = (Button) this.f201798e.findViewById(C0966R.C0970id.f358422f12);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.hme);
        viewGroup2.setVisibility(0);
        if (C76695c.m92341b()) {
            checkBox.setBackgroundResource(C0966R.C0969drawable.al4);
        }
        C75228t.m90252j(checkBox, 50);
        checkBox.setChecked(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getContext().getString(C0966R.string.hec);
        spannableStringBuilder.append(string);
        spannableStringBuilder.append(getContext().getString(C0966R.string.hed));
        spannableStringBuilder.setSpan(new C72476y0(7, (C72476y0.C72477a) new OfflineAlertView$$b(this)), string.length(), spannableStringBuilder.length(), 18);
        textView2.setText(spannableStringBuilder);
        textView2.setOnTouchListener(new C75355a0(getContext()));
        textView2.setClickable(true);
        button.setSelected(false);
        button.setOnClickListener(new OfflineAlertView$$c(this, checkBox, onClickListener, viewGroup2, button));
        this.f201800g = false;
        view.post(new OfflineAlertView$$d(this, textView2, checkBox, view));
    }

    public void setBlurDockerView(ViewGroup viewGroup) {
    }

    public void setDialogState(OfflineAlertView$$h offlineAlertView$$h) {
        this.f201801h = offlineAlertView$$h;
    }

    public OfflineAlertView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo96280c();
    }
}
