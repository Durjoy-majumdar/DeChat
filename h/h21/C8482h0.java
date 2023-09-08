package h21;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p629ny.C76979h;

/* renamed from: h21.h0 */
public class C8482h0 extends Preference {

    /* renamed from: J */
    public View f27486J = null;

    /* renamed from: K */
    public TextView f27487K = null;

    /* renamed from: L */
    public ImageView f27488L = null;

    /* renamed from: M */
    public String f27489M = null;

    /* renamed from: N */
    public String f27490N = null;

    /* renamed from: P */
    public Context f27491P;

    /* renamed from: h21.h0$a */
    public class C8483a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ long f27492a;

        public C8483a(long j) {
            this.f27492a = j;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            if (z) {
                Log.m105926v("MicroMsg.CollectPayInfoPreference", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f27492a) + " ms");
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
                ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
            } else {
                Log.m105928w("MicroMsg.CollectPayInfoPreference", "getContact failed");
            }
            C8482h0 h0Var = C8482h0.this;
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(h0Var.f27488L, h0Var.f27489M);
        }
    }

    public C8482h0(Context context) {
        super(context);
        this.f27491P = context;
        this.f121271G = C0966R.C0971layout.f7028vc;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f27486J == null) {
            this.f27486J = mo1087x(viewGroup);
        }
        mo1086w(this.f27486J);
        return this.f27486J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f27487K = (TextView) view.findViewById(16908310);
        this.f27488L = (ImageView) view.findViewById(C0966R.C0970id.bi_);
        this.f27487K.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f27491P, this.f27490N, this.f27487K.getTextSize()));
        if (!Util.isNullOrNil(this.f27489M)) {
            this.f27488L.setVisibility(0);
            C86709a0.m107528h();
            C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.f27489M);
            if (H3 == null || ((int) H3.f108320R1) <= 0) {
                Log.m105918d("MicroMsg.CollectPayInfoPreference", "Receiver in contactStg and try to get contact");
                C31519v2.m39436a().mo55988e(this.f27489M, "", new C8483a(Util.nowMilliSecond()));
                return;
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f27488L, this.f27489M);
            return;
        }
        this.f27488L.setVisibility(8);
    }

    public C8482h0(Context context, int i) {
        super(context);
        this.f27491P = context;
        this.f121271G = i;
    }
}
