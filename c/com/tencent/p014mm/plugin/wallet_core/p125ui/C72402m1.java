package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.ArrayList;
import java.util.List;
import y43.C79033l;
import y43.C79034n;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.m1 */
public class C72402m1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Context f210634g;

    /* renamed from: h */
    public final /* synthetic */ Orders f210635h;

    /* renamed from: i */
    public final /* synthetic */ C72379f1 f210636i;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.m1$a */
    public class C72403a implements C72371d0.C72374b {
        public C72403a() {
        }

        /* renamed from: a */
        public void mo99162a(FavorPayInfo favorPayInfo) {
            String str;
            String str2;
            String str3;
            double d;
            String str4;
            String str5;
            C72379f1 f1Var = C72402m1.this.f210636i;
            f1Var.f210544H = favorPayInfo;
            PayInfo payInfo = f1Var.f210559X;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 15, favorPayInfo.f209524d);
            C72379f1 f1Var2 = C72402m1.this.f210636i;
            f1Var2.f210545I = false;
            FavorPayInfo favorPayInfo2 = f1Var2.f210544H;
            List<Bankcard> h = C72394l.m84744h(favorPayInfo2.f209525e, favorPayInfo2.f209526f);
            C72379f1 f1Var3 = C72402m1.this.f210636i;
            FavorPayInfo favorPayInfo3 = f1Var3.f210544H;
            favorPayInfo3.f209528h = "";
            if (C72394l.m84745j(favorPayInfo3, f1Var3.f210547K)) {
                C72402m1.this.f210636i.f210545I = true;
                if (((ArrayList) h).size() == 0) {
                    C72402m1 m1Var = C72402m1.this;
                    m1Var.f210636i.f210544H.f209528h = m1Var.f210634g.getString(C0966R.string.ksu);
                } else {
                    C72402m1 m1Var2 = C72402m1.this;
                    m1Var2.f210636i.f210544H.f209528h = m1Var2.f210634g.getString(C0966R.string.ksv);
                }
                C72402m1.this.f210636i.dismiss();
                C72379f1 f1Var4 = C72402m1.this.f210636i;
                C72379f1.C72388f fVar = f1Var4.f210577u;
                if (fVar != null) {
                    String text = f1Var4.f210576t.getText();
                    C72379f1 f1Var5 = C72402m1.this.f210636i;
                    fVar.mo96337a(text, f1Var5.f210544H, f1Var5.f210545I);
                    return;
                }
            }
            C72379f1 f1Var6 = C72402m1.this.f210636i;
            View view = f1Var6.f210579w;
            if (view != null) {
                view.setTag(f1Var6.f210544H);
            }
            C72379f1 f1Var7 = C72402m1.this.f210636i;
            C79034n f = f1Var7.f210543G.mo99770f(f1Var7.f210544H.f209524d);
            C79033l lVar = C72402m1.this.f210635h.f209543N;
            double d2 = lVar.f232070f;
            String str6 = null;
            if (f == null || f.f232091j <= 0.0d) {
                d = lVar.f232068d;
                str4 = C75228t.m90256l(d);
                str3 = C72402m1.this.f210634g.getString(C0966R.string.l5r);
                str2 = null;
                str = null;
            } else {
                d = f.f232087f;
                str4 = C75228t.m90256l(f.f232090i);
                String l = C75228t.m90256l(C72402m1.this.f210635h.f209543N.f232068d);
                str = f.f232093o;
                str2 = l;
                str3 = null;
            }
            if (f == null || f.f232092n == 0) {
                str5 = null;
            } else {
                str5 = f.f232094p;
                if (!Util.isNullOrNil(str)) {
                    str5 = "," + str5;
                }
            }
            if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str5)) {
                if (!Util.isNullOrNil(str3)) {
                    str6 = "," + str3;
                }
                str3 = str6;
            }
            C72402m1.this.f210636i.mo99750q(str4, d);
            C72379f1 f1Var8 = C72402m1.this.f210636i;
            f1Var8.getClass();
            if (!TextUtils.isEmpty(str2)) {
                f1Var8.f210569n.setVisibility(0);
                f1Var8.f210569n.setText(str2);
            } else {
                f1Var8.f210569n.setVisibility(8);
            }
            C72402m1.this.f210636i.mo99747o(str, str3);
            C72402m1 m1Var3 = C72402m1.this;
            C72379f1 f1Var9 = m1Var3.f210636i;
            String str7 = m1Var3.f210635h.f209568j;
            f1Var9.getClass();
            if (!Util.isNullOrNil(str5)) {
                f1Var9.f210537A.setText(str5);
                f1Var9.f210537A.setVisibility(0);
                return;
            }
            f1Var9.f210537A.setVisibility(8);
        }
    }

    public C72402m1(C72379f1 f1Var, Context context, Orders orders) {
        this.f210636i = f1Var;
        this.f210634g = context;
        this.f210635h = orders;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f210636i.f210582y.setVisibility(8);
        PayInfo payInfo = this.f210636i.f210559X;
        C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 12, "");
        C72371d0.m84703d(this.f210634g, this.f210635h, this.f210636i.f210544H.f209524d, new C72403a(), (DialogInterface.OnCancelListener) null);
    }
}
