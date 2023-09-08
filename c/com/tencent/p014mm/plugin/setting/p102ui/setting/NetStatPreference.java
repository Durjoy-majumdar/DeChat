package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelstat.C114747n;
import com.tencent.p014mm.modelstat.C114748r;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p680ru.C36490j;
import tm2.C118492c;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatPreference */
public class NetStatPreference extends Preference {

    /* renamed from: J */
    public boolean f347152J;

    public NetStatPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        int i;
        NetStatGroup netStatGroup;
        View view2 = view;
        super.mo1086w(view);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.eqz);
        linearLayout.removeAllViews();
        long j = 86400000;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        int i2 = 15;
        while (true) {
            AttributeSet attributeSet = null;
            if (i2 <= 0) {
                break;
            }
            NetStatGroup netStatGroup2 = new NetStatGroup(this.f121274d, (AttributeSet) null);
            int i3 = (currentTimeMillis - i2) + 1;
            boolean z = this.f347152J;
            String charSequence = DateFormat.format(netStatGroup2.getContext().getString(C0966R.string.eyh, new Object[]{""}), ((long) i3) * j).toString();
            netStatGroup2.f116229e.setText(charSequence);
            Log.m105918d("MicroMsg.NetStatGroup", "NetStat dataTime = " + charSequence);
            netStatGroup2.f116228d.removeAllViews();
            int i4 = 0;
            while (i4 < 5) {
                NetStatUnit netStatUnit = new NetStatUnit(netStatGroup2.getContext(), attributeSet);
                C114747n Lo = ((C114748r) ((C36490j) C86312j.m106911c(C36490j.class)).Ho0()).mo174390Lo(i3 + i4);
                if (Lo == null) {
                    i = currentTimeMillis;
                } else if (z) {
                    Log.m105925i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", Integer.valueOf(Lo.f344026c), Long.valueOf(Lo.f344048y), Long.valueOf(Lo.f344036m), Long.valueOf(Lo.f344019A), Long.valueOf(Lo.f344038o));
                    i = currentTimeMillis;
                    netStatUnit.mo97696a(Lo.f344048y + Lo.f344036m, Lo.f344019A + Lo.f344038o);
                } else {
                    i = currentTimeMillis;
                    netStatGroup = netStatGroup2;
                    Log.m105925i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", Integer.valueOf(Lo.f344026c), Long.valueOf(Lo.f344047x), Long.valueOf(Lo.f344035l), Long.valueOf(Lo.f344049z), Long.valueOf(Lo.f344037n));
                    netStatUnit.mo97696a(Lo.f344047x + Lo.f344035l, Lo.f344049z + Lo.f344037n);
                    netStatUnit.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                    netStatGroup.f116228d.addView(netStatUnit);
                    i4++;
                    netStatGroup2 = netStatGroup;
                    currentTimeMillis = i;
                    attributeSet = null;
                }
                netStatGroup = netStatGroup2;
                netStatUnit.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                netStatGroup.f116228d.addView(netStatUnit);
                i4++;
                netStatGroup2 = netStatGroup;
                currentTimeMillis = i;
                attributeSet = null;
            }
            linearLayout.addView(netStatGroup2, -2, -1);
            i2 -= 5;
            currentTimeMillis = currentTimeMillis;
            j = 86400000;
        }
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C0966R.C0970id.ixc);
        linearLayout2.removeAllViews();
        NetStatGroup netStatGroup3 = new NetStatGroup(this.f121274d, (AttributeSet) null);
        boolean z2 = this.f347152J;
        netStatGroup3.removeAllViews();
        View.inflate(netStatGroup3.getContext(), C0966R.C0971layout.bkl, netStatGroup3);
        netStatGroup3.f116228d = (LinearLayout) netStatGroup3.findViewById(C0966R.C0970id.eqz);
        NetStatRuler netStatRuler = new NetStatRuler(netStatGroup3.getContext(), (AttributeSet) null);
        netStatRuler.setTag(z2 ? "wifi" : "mobile");
        netStatRuler.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        netStatGroup3.f116228d.addView(netStatRuler);
        linearLayout2.addView(netStatGroup3);
        mo69921C(8);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bds, viewGroup2);
        return x;
    }

    public NetStatPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetStatPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f347152J = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C118492c.f354641b, i, 0);
        this.f347152J = obtainStyledAttributes.getInt(0, 0) == 1;
        obtainStyledAttributes.recycle();
        mo7741E(context.getString(C0966R.string.iv_, new Object[]{15}));
    }
}
