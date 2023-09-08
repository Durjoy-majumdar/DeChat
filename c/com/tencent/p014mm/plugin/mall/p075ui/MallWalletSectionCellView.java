package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TableCellClickEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43312r;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.rtmp.TXLiveConstants;
import di0.C86300q;
import f40.C86709a0;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lg3.C76695c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49118da3;
import te3.C50162kp3;
import te3.C50456mv3;
import te3.C51975xh2;
import te3.C52219z50;
import te3.sg4;
import te3.te4;
import te3.vf4;
import te3.zf4;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView */
public class MallWalletSectionCellView extends LinearLayout {

    /* renamed from: v */
    public static final int f115121v = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    /* renamed from: d */
    public View f115122d;

    /* renamed from: e */
    public CdnImageView f115123e;

    /* renamed from: f */
    public TextView f115124f;

    /* renamed from: g */
    public TextView f115125g;

    /* renamed from: h */
    public CdnImageView f115126h;

    /* renamed from: i */
    public TextView f115127i;

    /* renamed from: j */
    public ImageView f115128j;

    /* renamed from: n */
    public ImageView f115129n;

    /* renamed from: o */
    public TextView f115130o;

    /* renamed from: p */
    public TextView f115131p;

    /* renamed from: q */
    public View f115132q;

    /* renamed from: r */
    public ViewGroup f115133r;

    /* renamed from: s */
    public TextView f115134s;

    /* renamed from: t */
    public WcPayMoneyLoadingView f115135t;

    /* renamed from: u */
    public C50162kp3 f115136u;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView$a */
    public class C42546a implements Runnable {
        public C42546a() {
        }

        public void run() {
            Log.m105919d("MicroMsg.MallWalletSectionCellView", "x: %s, left: %s", Float.valueOf(MallWalletSectionCellView.this.f115124f.getX()), Integer.valueOf(MallWalletSectionCellView.this.f115124f.getLeft()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
            layoutParams.leftMargin = MallWalletSectionCellView.this.f115124f.getLeft();
            MallWalletSectionCellView.this.f115132q.setLayoutParams(layoutParams);
            View view = MallWalletSectionCellView.this.f115132q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView$b */
    public class C42547b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ te4 f115138g;

        /* renamed from: h */
        public final /* synthetic */ C86300q f115139h;

        /* renamed from: i */
        public final /* synthetic */ C43423i0.C43429f f115140i;

        public C42547b(te4 te4, C86300q qVar, C43423i0.C43429f fVar) {
            this.f115138g = te4;
            this.f115139h = qVar;
            this.f115140i = fVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            int i;
            Bundle bundle = new Bundle();
            bundle.putInt("key_tiny_app_scene", TXLiveConstants.PUSH_EVT_ROOM_OUT);
            bundle.putString("realname_verify_process_jump_plugin", "mall");
            bundle.putString("realname_verify_process_jump_activity", ".ui.MallWalletUI");
            C43423i0.m46932c(MallWalletSectionCellView.this.getContext(), this.f115138g.f142189n, bundle, this.f115139h, this.f115140i);
            TableCellClickEvent tableCellClickEvent = new TableCellClickEvent();
            tableCellClickEvent.f107786d.f107787a = this.f115138g.f142187i;
            tableCellClickEvent.publish();
            MallWalletSectionCellView mallWalletSectionCellView = MallWalletSectionCellView.this;
            int i2 = MallWalletSectionCellView.f115121v;
            mallWalletSectionCellView.mo66639b();
            C50162kp3 kp32 = this.f115138g.f142186h;
            String str = "";
            if (kp32 != null && !Util.isNullOrNil(kp32.f136973e)) {
                MallWalletSectionCellView.m46190a(MallWalletSectionCellView.this, this.f115138g.f142186h.f136973e);
                C115669n.INSTANCE.mo160131h(22735, this.f115138g.f142186h.f136973e, 3, str);
                if ("Lqt".equals(this.f115138g.f142186h.f136973e)) {
                    MallWalletSectionCellView mallWalletSectionCellView2 = MallWalletSectionCellView.this;
                    String str2 = this.f115138g.f142186h.f136973e;
                    mallWalletSectionCellView2.getClass();
                    Log.m105925i("MicroMsg.MallWalletSectionCellView", "lqtOnClickRedDotReq, redDotID: %s", str2);
                    new C43312r(str2).mo9225i().mo123064p(new C42555a0(mallWalletSectionCellView2));
                }
            }
            C50456mv3 mv32 = this.f115138g.f142189n;
            int i3 = mv32.f138230d;
            if (i3 == 1) {
                str = mv32.f138231e;
                i = 1;
            } else if (i3 == 2) {
                sg4 sg4 = mv32.f138232f;
                if (sg4 != null) {
                    str = sg4.f141503d;
                }
                i = 2;
            } else if (i3 == 4) {
                str = mv32.f138231e;
                i = 3;
            } else {
                i = 0;
            }
            C115669n.INSTANCE.mo160131h(16502, 2, str, Integer.valueOf(i));
        }
    }

    public MallWalletSectionCellView(Context context) {
        super(context);
        mo66641d(context);
    }

    /* renamed from: a */
    public static void m46190a(MallWalletSectionCellView mallWalletSectionCellView, String str) {
        mallWalletSectionCellView.getClass();
        Log.m105925i("MicroMsg.MallWalletSectionCellView", "clear reddot: %s", str);
        JSONObject redDotConfig = mallWalletSectionCellView.getRedDotConfig();
        if (redDotConfig != null) {
            redDotConfig.remove(str);
            redDotConfig.remove(String.format("%s_expiretime", new Object[]{str}));
            redDotConfig.remove(String.format("%s_wording", new Object[]{str}));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
        }
    }

    private JSONObject getRedDotConfig() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.MallWalletSectionCellView", e, "", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo66639b() {
        this.f115130o.setVisibility(8);
        this.f115128j.setVisibility(8);
        this.f115129n.setVisibility(8);
        this.f115131p.setVisibility(8);
        C50162kp3 kp32 = this.f115136u;
        if (kp32 != null && kp32.f136972d == 4) {
            this.f115125g.setText("");
        }
    }

    /* renamed from: c */
    public void mo66640c(te4 te4, JSONObject jSONObject, boolean z, String str, boolean z2, C86300q qVar, C43423i0.C43429f fVar) {
        zf4 zf4;
        LinkedList<vf4> linkedList;
        vf4 vf4;
        C52219z50 z502;
        te4 te42 = te4;
        JSONObject jSONObject2 = jSONObject;
        C43423i0.m46934e(this.f115123e, te42.f142182d, -1, 0, 0, true);
        C51975xh2 xh22 = te42.f142185g;
        if (xh22 == null || Util.isNullOrNil(xh22.f144653d)) {
            this.f115126h.setImageResource(C0966R.raw.icons_outlined_arrow);
            this.f115126h.setColorFilter(getContext().getResources().getColor(C0966R.color.f3107fh), PorterDuff.Mode.SRC_ATOP);
        } else {
            C43423i0.m46934e(this.f115126h, te42.f142185g, C0966R.C0969drawable.cei, 0, 0, true);
        }
        LinkedList<zf4> linkedList2 = te42.f142183e;
        if (linkedList2 == null || linkedList2.size() <= 0) {
            this.f115124f.setText("");
        } else {
            C43423i0.m46937h(this.f115124f, te42.f142183e.get(0), (C43423i0.C43428e) null);
        }
        if (te42.f142190o != null) {
            if (!(!C76695c.m92341b() || (zf4 = te42.f142190o.f137662e) == null || (linkedList = zf4.f145863d) == null || linkedList.size() <= 0 || (z502 = vf4.f143468n) == null)) {
                z502.f145706d = 4292966169L;
                (vf4 = te42.f142190o.f137662e.f145863d.get(0)).f143461d = 4292966169L;
            }
            C43423i0.m46936g(this.f115134s, te42.f142190o);
            this.f115134s.setVisibility(0);
        } else {
            this.f115134s.setVisibility(8);
        }
        LinkedList<zf4> linkedList3 = te42.f142184f;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            String str2 = str;
            if (!Util.isNullOrNil(str)) {
                this.f115135t.mo99856e("", !z2, false);
                this.f115135t.setVisibility(0);
                this.f115125g.setVisibility(8);
            } else {
                this.f115125g.setText("");
                this.f115135t.mo99852a();
                this.f115125g.setVisibility(0);
            }
        } else if (!Util.isNullOrNil(str)) {
            this.f115135t.mo99856e(str, !z2, false);
            this.f115135t.setVisibility(0);
            this.f115125g.setVisibility(8);
        } else {
            C43423i0.m46937h(this.f115125g, te42.f142184f.get(0), (C43423i0.C43428e) null);
            this.f115135t.mo99852a();
            this.f115125g.setVisibility(0);
        }
        LinkedList<zf4> linkedList4 = te42.f142184f;
        if (linkedList4 == null || linkedList4.size() <= 1) {
            this.f115127i.setVisibility(8);
        } else {
            C43423i0.m46937h(this.f115127i, te42.f142184f.get(1), (C43423i0.C43428e) null);
        }
        mo66639b();
        C50162kp3 kp32 = te42.f142186h;
        if (!(kp32 == null || jSONObject2 == null)) {
            this.f115136u = kp32;
            boolean z3 = jSONObject2.optInt(kp32.f136973e, 0) == 1;
            long optLong = jSONObject2.optLong(String.format("%s_expiretime", new Object[]{te42.f142186h.f136973e}), 0);
            boolean z4 = (optLong <= 0 || System.currentTimeMillis() <= optLong) ? z3 : false;
            Log.m105925i("MicroMsg.MallWalletSectionCellView", "red dot expired: %s, %s, %s, %s, %s", te42.f142186h.f136973e, Long.valueOf(optLong), Boolean.valueOf(z3), Boolean.valueOf(z4), Integer.valueOf(te42.f142186h.f136972d));
            if (z3 && !z4) {
                C115669n.INSTANCE.mo160131h(22735, te42.f142186h.f136973e, 2, "");
            }
            if (z4) {
                int i = te42.f142186h.f136972d;
                if (i == 1) {
                    this.f115128j.setVisibility(0);
                } else if (i == 2) {
                    this.f115130o.setVisibility(0);
                } else if (i == 3) {
                    this.f115131p.setText(C43423i0.m46933d(getContext(), te42.f142186h.f136974f, (C43423i0.C43428e) null).toString());
                    this.f115131p.setContentDescription(getContext().getString(C0966R.string.f7360dw, new Object[]{this.f115131p.getText()}));
                    this.f115131p.setVisibility(0);
                } else if (i == 4) {
                    this.f115129n.setVisibility(0);
                    this.f115125g.setVisibility(0);
                    C43423i0.m46937h(this.f115125g, te42.f142186h.f136974f, (C43423i0.C43428e) null);
                    this.f115135t.mo99852a();
                } else {
                    z4 = false;
                }
                if (z4) {
                    C115669n.INSTANCE.mo160131h(22735, te42.f142186h.f136973e, 1, "");
                } else {
                    C115669n.INSTANCE.mo160131h(22735, te42.f142186h.f136973e, 0, "Red Dot Type returned by server is invalid.");
                }
            }
        }
        int i2 = f115121v;
        C49118da3 da32 = te42.f142188j;
        if (da32 != null) {
            float f = da32.f132213f;
            int b = f > 0.0f ? C76577a.m92151b(getContext(), (int) f) : i2;
            float f2 = da32.f132214g;
            int b2 = f2 > 0.0f ? C76577a.m92151b(getContext(), (int) f2) : i2;
            float f3 = da32.f132211d;
            int b3 = f3 > 0.0f ? C76577a.m92151b(getContext(), (int) f3) : i2;
            float f4 = da32.f132212e;
            if (f4 > 0.0f) {
                i2 = C76577a.m92151b(getContext(), (int) f4);
            }
            this.f115133r.setPadding(b, b3, b2, i2);
        }
        if (z) {
            this.f115124f.post(new C42546a());
        } else {
            View view = this.f115132q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (te42.f142189n != null) {
            setOnClickListener(new C42547b(te42, qVar, fVar));
        }
    }

    /* renamed from: d */
    public final void mo66641d(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bay, this, true);
        this.f115122d = inflate;
        this.f115123e = (CdnImageView) inflate.findViewById(C0966R.C0970id.h94);
        this.f115124f = (TextView) this.f115122d.findViewById(C0966R.C0970id.h9d);
        this.f115125g = (TextView) this.f115122d.findViewById(C0966R.C0970id.f358821h91);
        this.f115126h = (CdnImageView) this.f115122d.findViewById(C0966R.C0970id.h9b);
        this.f115127i = (TextView) this.f115122d.findViewById(C0966R.C0970id.h9c);
        ImageView imageView = (ImageView) this.f115122d.findViewById(C0966R.C0970id.h98);
        this.f115128j = imageView;
        imageView.setContentDescription(context.getString(C0966R.string.f7359dv));
        this.f115129n = (ImageView) this.f115122d.findViewById(C0966R.C0970id.h9a);
        TextView textView = (TextView) this.f115122d.findViewById(C0966R.C0970id.h96);
        this.f115130o = textView;
        textView.setContentDescription(context.getString(C0966R.string.f7359dv));
        this.f115131p = (TextView) this.f115122d.findViewById(C0966R.C0970id.h97);
        this.f115132q = this.f115122d.findViewById(C0966R.C0970id.f358822h92);
        this.f115133r = (ViewGroup) this.f115122d.findViewById(C0966R.C0970id.h95);
        this.f115134s = (TextView) this.f115122d.findViewById(C0966R.C0970id.f358823h93);
        this.f115135t = (WcPayMoneyLoadingView) this.f115122d.findViewById(C0966R.C0970id.f358820h90);
        this.f115135t.setLoadingPb((ProgressBar) this.f115122d.findViewById(C0966R.C0970id.lhb));
        setOrientation(1);
        setBackgroundResource(C0966R.C0969drawable.abi);
    }

    public MallWalletSectionCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66641d(context);
    }

    public MallWalletSectionCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66641d(context);
    }
}
