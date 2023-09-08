package com.tencent.p014mm.plugin.newtips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.preference.PluginPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.newtips.NormalPluginNewTipPreference */
public final class NormalPluginNewTipPreference extends PluginPreference implements C115619a {

    /* renamed from: U */
    public Context f115229U;

    /* renamed from: V */
    public View f115230V;

    public NormalPluginNewTipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    public View mo64133e() {
        if (this.f115230V == null) {
            this.f115230V = new View(this.f115229U);
        }
        return this.f115230V;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        Log.m105919d("MicroMsg.NewTips.NormalPluginNewTipPreference", "showRedPoint() show:%s", Boolean.valueOf(z));
        if (z) {
            this.f115264P = true;
        } else {
            this.f115264P = false;
            this.f115263N = 8;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        Log.m105919d("MicroMsg.NewTips.NormalPluginNewTipPreference", "showCounter() show:%s", Boolean.valueOf(z));
        if (z) {
            this.f115263N = 0;
            String str = tg4.f354435d + "";
            if (tg4.f354435d > 99) {
                str = this.f115229U.getString(C0966R.string.jsy);
            }
            int b = C45081s1.m49933b(this.f121274d, tg4.f354435d);
            this.f115261L = str;
            this.f115262M = b;
        } else {
            this.f115264P = false;
            this.f115263N = 8;
        }
        return true;
    }

    public String getPath() {
        return null;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        Log.m105919d("MicroMsg.NewTips.NormalPluginNewTipPreference", "showNew() show:%s", Boolean.valueOf(z));
        if (z) {
            this.f115264P = false;
            this.f115263N = 0;
            this.f115261L = this.f115229U.getString(C0966R.string.f360088a12);
            this.f115262M = C0966R.C0969drawable.ake;
        } else {
            this.f115264P = false;
            this.f115263N = 8;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
        C115624i.m162566b(this, nVar, z);
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return C115624i.m162576l(z, this);
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        if (this.f115230V == null) {
            this.f115230V = x;
        }
        return x;
    }

    public NormalPluginNewTipPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115229U = context;
    }
}
