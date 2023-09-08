package com.tencent.p014mm.plugin.preference;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import kg3.C76577a;
import p196ln.C10579k;
import p196ln.C76705f;
import p196ln.C76706g;

/* renamed from: com.tencent.mm.plugin.preference.PluginPreference */
public class PluginPreference extends Preference implements C10579k.C10580a {

    /* renamed from: J */
    public String f115259J;

    /* renamed from: K */
    public String f115260K;

    /* renamed from: L */
    public String f115261L;

    /* renamed from: M */
    public int f115262M;

    /* renamed from: N */
    public int f115263N;

    /* renamed from: P */
    public boolean f115264P;

    /* renamed from: Q */
    public ImageView f115265Q;

    /* renamed from: R */
    public int f115266R;

    /* renamed from: S */
    public MMActivity f115267S;

    /* renamed from: T */
    public TextView f115268T;

    /* renamed from: com.tencent.mm.plugin.preference.PluginPreference$a */
    public class C42595a implements Runnable {
        public C42595a() {
        }

        public void run() {
            PluginPreference.this.mo66705K();
        }
    }

    public PluginPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public boolean mo66703I(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            Log.m105920e("MicroMsg.PluginPreference", "plugin do not exist");
            return false;
        }
        this.f115259J = z1Var.getUsername();
        this.f115260K = z1Var.mo62909j3();
        mo26273A("settings_plugins_list_#" + this.f115259J);
        return true;
    }

    /* renamed from: J */
    public boolean mo66704J(String str, String str2) {
        this.f115259J = str;
        this.f115260K = str2;
        mo26273A("settings_plugins_list_#" + this.f115259J);
        return true;
    }

    /* renamed from: K */
    public final void mo66705K() {
        if (this.f115265Q == null) {
            return;
        }
        if (this.f115259J.equals("newsapp")) {
            this.f115265Q.setImageResource(C0966R.raw.default_readerapp_plugin);
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f115265Q, this.f115259J);
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        String str2 = this.f115259J;
        if (str2 != null && str2.equals(str)) {
            new MMHandler(Looper.getMainLooper()).post(new C42595a());
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f115265Q = imageView;
        imageView.setAlpha(this.f115266R);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        this.f115268T = textView;
        if (textView != null) {
            textView.setVisibility(this.f115263N);
            this.f115268T.setText(this.f115261L);
            int i = this.f115262M;
            if (i != -1) {
                this.f115268T.setBackgroundDrawable(C76577a.m92158i(this.f115267S, i));
            }
        }
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.hbo);
        if (textView2 != null) {
            textView2.setVisibility(this.f115264P ? 0 : 8);
        }
        mo66705K();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdu, viewGroup2);
        return x;
    }

    public PluginPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115261L = "";
        this.f115262M = -1;
        this.f115263N = 8;
        this.f115264P = false;
        this.f115265Q = null;
        this.f115266R = 255;
        this.f115267S = (MMActivity) context;
        this.f121271G = C0966R.C0971layout.bcy;
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
    }
}
