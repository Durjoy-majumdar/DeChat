package com.tencent.p014mm.plugin.wallet_core.utils;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import kg3.C76577a;
import nj3.C76879j;
import qo3.C101218e0;
import te3.C49995ji2;
import te3.C77935gl2;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.r */
public class C72506r {

    /* renamed from: a */
    public boolean f210915a = false;

    /* renamed from: b */
    public MMActivity f210916b;

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.r$a */
    public class C72507a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72510d f210917d;

        /* renamed from: e */
        public final /* synthetic */ C72501h f210918e;

        public C72507a(C72510d dVar, C72501h hVar) {
            this.f210917d = dVar;
            this.f210918e = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f210917d.mo95297a(this.f210918e.f210903b);
            C72506r.m84837a(C72506r.this, this.f210918e.f210903b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.r$b */
    public class C72508b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72510d f210920d;

        /* renamed from: e */
        public final /* synthetic */ C72501h f210921e;

        public C72508b(C72510d dVar, C72501h hVar) {
            this.f210920d = dVar;
            this.f210921e = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f210920d.mo95297a(this.f210921e.f210904c);
            C72506r.m84837a(C72506r.this, this.f210921e.f210904c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.r$c */
    public class C72509c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72510d f210923d;

        /* renamed from: e */
        public final /* synthetic */ C72501h f210924e;

        public C72509c(C72510d dVar, C72501h hVar) {
            this.f210923d = dVar;
            this.f210924e = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f210923d.mo95297a(this.f210924e.f210903b);
            C72506r.m84837a(C72506r.this, this.f210924e.f210903b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.r$d */
    public interface C72510d {
        /* renamed from: a */
        void mo95297a(C77935gl2 gl22);
    }

    public C72506r(MMActivity mMActivity) {
        this.f210916b = mMActivity;
    }

    /* renamed from: a */
    public static void m84837a(C72506r rVar, C77935gl2 gl22) {
        rVar.getClass();
        if (gl22 != null) {
            int i = gl22.f227479e;
            if (i == 3) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", gl22.f227480f);
                C75228t.m90217J(rVar.f210916b, intent);
            } else if (i == 4) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9526a = gl22.f227481g;
                aVar.f9527b = gl22.f227482h;
                aVar.f9529d = 1034;
                aVar.f9528c = 0;
                startAppBrandUIFromOuterEvent.publish();
            }
            if (rVar.f210915a) {
                rVar.f210916b.finish();
            }
        }
    }

    /* renamed from: d */
    public static boolean m84838d(C72501h hVar) {
        return (hVar == null || hVar.f210905d == 0) ? false : true;
    }

    /* renamed from: e */
    public static boolean m84839e(C49995ji2 ji22) {
        return (ji22 == null || ji22.f136136g == 0) ? false : true;
    }

    /* renamed from: b */
    public void mo99912b(C72501h hVar, C72510d dVar) {
        C72501h hVar2 = hVar;
        C72510d dVar2 = dVar;
        if (hVar2.f210906e == 2) {
            int i = hVar2.f210908g;
            boolean z = (i == 2 || i == 3) || !Util.isNullOrNil(hVar2.f210907f);
            C101218e0 e0Var = z ? new C101218e0(this.f210916b, 1, 3, false) : new C101218e0(this.f210916b, 1, 0, false);
            int i2 = hVar2.f210905d;
            if (i2 == 1) {
                e0Var.mo140677w(hVar2.f210903b.f227478d);
                e0Var.f296375F = new C72511s(this, dVar2, hVar2, e0Var);
                C85875k4.m106191k0(e0Var.f296398x.getPaint());
            } else if (i2 == 2) {
                e0Var.mo140667n(hVar2.f210903b.f227478d, hVar2.f210904c.f227478d);
                C72512t tVar = new C72512t(this, dVar2, hVar2, e0Var);
                C72513u uVar = new C72513u(this, dVar2, hVar2, e0Var);
                e0Var.f296373D = tVar;
                e0Var.f296374E = uVar;
                C85875k4.m106191k0(e0Var.f296394t.getPaint());
                C85875k4.m106191k0(e0Var.f296395u.getPaint());
            }
            View inflate = View.inflate(this.f210916b, C0966R.C0971layout.brr, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.et6);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            textView.setText(hVar2.f210907f);
            WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.f358383et1);
            weImageView.setOnClickListener(new C5812v(this, e0Var));
            int i3 = hVar2.f210908g;
            if (i3 == 2) {
                weImageView.setImageResource(C0966R.raw.icons_outlined_close);
            } else if (i3 == 3) {
                weImageView.setImageResource(C0966R.raw.icons_outlined_back);
            } else {
                weImageView.setVisibility(8);
            }
            View inflate2 = View.inflate(this.f210916b, C0966R.C0971layout.brq, (ViewGroup) null);
            TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.f358384et2);
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            textView2.setText(hVar2.f210902a);
            if (z) {
                e0Var.mo140672r(inflate);
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(this.f210916b, 40);
                textView.setLayoutParams(layoutParams);
            }
            e0Var.mo140663j(inflate2);
            e0Var.mo140655A();
            return;
        }
        int i4 = hVar2.f210905d;
        if (i4 == 1) {
            C76879j.m92711E(this.f210916b, hVar2.f210902a, "", hVar2.f210903b.f227478d, false, new C72507a(dVar2, hVar2));
        } else if (i4 == 2) {
            C76879j.m92709C(this.f210916b, hVar2.f210902a, "", hVar2.f210904c.f227478d, hVar2.f210903b.f227478d, false, new C72508b(dVar2, hVar2), new C72509c(dVar2, hVar2));
        }
    }

    /* renamed from: c */
    public void mo99913c(C49995ji2 ji22, C72510d dVar) {
        mo99912b(C72501h.m84834b(ji22), dVar);
    }
}
