package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.remittance.model.C70593j0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43421g0;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72499f0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageViewWithCompletion;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C75355a0;
import di0.C86300q;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C48730al;
import te3.C49118da3;
import te3.C50315lv3;
import te3.C50456mv3;
import te3.C51975xh2;
import te3.C52219z50;
import te3.vf4;
import te3.zf4;

/* renamed from: com.tencent.mm.plugin.remittance.ui.l0 */
public final class C70909l0 extends RecyclerView.C16613e<C70913d> {

    /* renamed from: d */
    public final Context f205337d;

    /* renamed from: e */
    public List<? extends C70593j0.C70599f> f205338e;

    /* renamed from: f */
    public C70910a f205339f;

    /* renamed from: g */
    public C70911b f205340g;

    /* renamed from: h */
    public int f205341h;

    /* renamed from: i */
    public int f205342i;

    /* renamed from: j */
    public boolean f205343j;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$a */
    public interface C70910a {
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$b */
    public interface C70911b {
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$c */
    public static final class C70912c {
        public C70912c(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$d */
    public static final class C70913d extends RecyclerView.C16631z {

        /* renamed from: A */
        public CdnImageView f205344A;

        /* renamed from: B */
        public TextView f205345B;

        /* renamed from: C */
        public TextView f205346C;

        /* renamed from: D */
        public TextView f205347D;

        /* renamed from: E */
        public CdnImageViewWithCompletion f205348E;

        /* renamed from: F */
        public WeImageView f205349F;

        /* renamed from: G */
        public TextView f205350G;

        /* renamed from: H */
        public View f205351H;

        /* renamed from: z */
        public View f205352z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70913d(View view) {
            super(view);
            C87412m.m108594g(view, "root");
            this.f205352z = view;
            View findViewById = view.findViewById(C0966R.C0970id.f359019ny1);
            C87412m.m108593f(findViewById, "itemView.findViewById<Vi…ount_info_item_container)");
            this.f205352z = findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f359021ny3);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.applet.CdnImageView");
            this.f205344A = (CdnImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.ny5);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f205345B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.o2p);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f205346C = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.o2n);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f205347D = (TextView) findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.o2o);
            C87412m.m108592e(findViewById6, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.applet.CdnImageViewWithCompletion");
            this.f205348E = (CdnImageViewWithCompletion) findViewById6;
            View findViewById7 = view.findViewById(C0966R.C0970id.ny6);
            C87412m.m108592e(findViewById7, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            this.f205349F = (WeImageView) findViewById7;
            View findViewById8 = view.findViewById(C0966R.C0970id.f359020ny2);
            C87412m.m108592e(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f205350G = (TextView) findViewById8;
            View findViewById9 = view.findViewById(C0966R.C0970id.f359018ny0);
            C87412m.m108593f(findViewById9, "itemView.findViewById<Vi…nt_info_item_bottom_line)");
            this.f205351H = findViewById9;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$e */
    public static final class C70914e implements UseCaseCallback {

        /* renamed from: a */
        public final /* synthetic */ C70593j0.C70599f f205353a;

        public C70914e(C70593j0.C70599f fVar) {
            this.f205353a = fVar;
        }

        public void call(ITransmitKvData iTransmitKvData) {
            C87412m.m108594g(iTransmitKvData, "data");
            C115669n.INSTANCE.mo160131h(27731, 5, Integer.valueOf(this.f205353a.f204211a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$f */
    public static final class C70915f implements C75228t.C75238m {

        /* renamed from: a */
        public final /* synthetic */ C70593j0.C70599f f205354a;

        public C70915f(C70593j0.C70599f fVar) {
            this.f205354a = fVar;
        }

        /* renamed from: a */
        public final void mo97581a() {
            C115669n.INSTANCE.mo160131h(27731, 5, Integer.valueOf(this.f205354a.f204211a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$g */
    public static final class C70916g implements C43423i0.C43428e {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$g$a */
        public static final class C70917a implements UseCaseCallback {
            public void call(ITransmitKvData iTransmitKvData) {
                C87412m.m108594g(iTransmitKvData, "data");
            }
        }

        /* renamed from: a */
        public void mo66651a(C50456mv3 mv32, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            ITransmitKvData create = ITransmitKvData.create();
            if (mv32 != null) {
                create.putBinary("route_info", mv32.getData());
            }
            C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
            if (cVar != null) {
                cVar.startUseCase("commonRoute", create, new C70917a());
            }
        }

        /* renamed from: b */
        public boolean mo66652b(C50456mv3 mv32, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$h */
    public static final class C70918h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C70593j0.C70599f f205355d;

        /* renamed from: e */
        public final /* synthetic */ C70913d f205356e;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$h$a */
        public static final class C70919a implements C43423i0.C43428e {

            /* renamed from: a */
            public final /* synthetic */ C70593j0.C70599f f205357a;

            /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$h$a$a */
            public static final class C70920a implements UseCaseCallback {
                public void call(ITransmitKvData iTransmitKvData) {
                    C87412m.m108594g(iTransmitKvData, "data");
                }
            }

            public C70919a(C70593j0.C70599f fVar) {
                this.f205357a = fVar;
            }

            /* renamed from: a */
            public void mo66651a(C50456mv3 mv32, Object... objArr) {
                C87412m.m108594g(objArr, "args");
                if (mv32 != null) {
                    ITransmitKvData create = ITransmitKvData.create();
                    create.putBinary("route_info", mv32.getData());
                    int i = this.f205357a.f204211a;
                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
                    C87412m.m108593f(mmkv, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
                    mmkv.edit().putInt(String.valueOf(i), 1);
                    C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
                    if (cVar != null) {
                        cVar.startUseCase("commonRoute", create, new C70920a());
                    }
                }
            }

            /* renamed from: b */
            public boolean mo66652b(C50456mv3 mv32, Object... objArr) {
                C87412m.m108594g(objArr, "args");
                return false;
            }
        }

        public C70918h(C70593j0.C70599f fVar, C70913d dVar) {
            this.f205355d = fVar;
            this.f205356e = dVar;
        }

        public final void run() {
            if (this.f205355d.f204220j.f204225a != null) {
                this.f205356e.f205347D.setVisibility(0);
                C70913d dVar = this.f205356e;
                TextView textView = dVar.f205347D;
                zf4 zf4 = this.f205355d.f204220j.f204225a;
                Drawable drawable = dVar.f205348E.getDrawable();
                C70593j0.C70599f fVar = this.f205355d;
                C48730al alVar = fVar.f204220j.f204226b;
                C50456mv3 mv32 = alVar.f130603e;
                String str = alVar.f130606h;
                C70919a aVar = new C70919a(fVar);
                if (C43423i0.m46939j(zf4)) {
                    textView.setClickable(true);
                    textView.setOnTouchListener(new C75355a0(textView.getContext()));
                }
                if (mv32 != null) {
                    textView.setOnTouchListener(new C72499f0());
                }
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) C43423i0.m46933d(textView.getContext(), zf4, aVar);
                if (drawable != null) {
                    int p = (int) (C76577a.m92165p(textView.getContext()) * 16.0f);
                    drawable.setBounds(0, 0, C74942w4.m89784a(textView.getContext(), p), C74942w4.m89784a(textView.getContext(), p));
                    C5067f fVar2 = new C5067f(drawable);
                    if (Util.isNullOrNil(str)) {
                        str = " ";
                    }
                    spannableStringBuilder.append(str);
                    spannableStringBuilder.setSpan(fVar2, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new C43421g0(aVar, mv32), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$i */
    public static final class C70921i extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C70909l0 f205358g;

        /* renamed from: h */
        public final /* synthetic */ C70593j0.C70599f f205359h;

        public C70921i(C70909l0 l0Var, C70593j0.C70599f fVar) {
            this.f205358g = l0Var;
            this.f205359h = fVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C87412m.m108594g(view, "v");
            this.f205358g.mo97579F4(this.f205359h, true);
            C70909l0 l0Var = this.f205358g;
            C70593j0.C70599f fVar = this.f205359h;
            l0Var.getClass();
            C87412m.m108594g(fVar, "accountChannelInfo");
            int i = fVar.f204211a;
            l0Var.f205341h = i;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC, Integer.valueOf(i));
            Log.m105924i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "onclick selectType" + this.f205358g.f205341h);
            C70910a aVar = this.f205358g.f205339f;
            if (aVar != null) {
                C70593j0.C70599f fVar2 = this.f205359h;
                C70875b1 b1Var = (C70875b1) aVar;
                b1Var.f205285b.f204752h1 = fVar2.f204211a;
                C70909l0 l0Var2 = b1Var.f205284a;
                l0Var2.notifyItemRangeChanged(0, l0Var2.getItemCount(), Boolean.TRUE);
                C115669n.INSTANCE.mo160131h(27731, 2, Integer.valueOf(fVar2.f204211a));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.l0$j */
    public static final class C70922j implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C70909l0 f205360a;

        /* renamed from: b */
        public final /* synthetic */ C70593j0.C70599f f205361b;

        public C70922j(C70909l0 l0Var, C70593j0.C70599f fVar) {
            this.f205360a = l0Var;
            this.f205361b = fVar;
        }

        public final void onClick(View view) {
            C70911b bVar = this.f205360a.f205340g;
            if (bVar != null) {
                C70593j0.C70599f fVar = this.f205361b;
                RemittanceDetailUI remittanceDetailUI = ((C70878c1) bVar).f205288a;
                C70593j0.C70597d dVar = fVar.f204218h.f204230b;
                int i = RemittanceDetailUI.f204704z1;
                remittanceDetailUI.mo97384R7(dVar, 0, "", 0, (C86300q) null, (Runnable) null);
                C115669n.INSTANCE.mo160131h(27731, 3, Integer.valueOf(fVar.f204211a));
            }
        }
    }

    static {
        new C70912c((C8480h) null);
    }

    public C70909l0(Context context) {
        C87412m.m108594g(context, "context");
        this.f205337d = context;
    }

    /* renamed from: F4 */
    public final void mo97579F4(C70593j0.C70599f fVar, boolean z) {
        C87412m.m108594g(fVar, "accountChannelInfo");
        int i = fVar.f204211a;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
        C87412m.m108593f(mmkv, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
        boolean z2 = false;
        int i2 = mmkv.getInt(String.valueOf(i), 0);
        if (z && i2 == 0) {
            if (fVar.f204224n != null) {
                ITransmitKvData create = ITransmitKvData.create();
                create.putBinary("route_info", fVar.f204224n.getData());
                C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
                if (cVar != null) {
                    cVar.startUseCase("commonRoute", create, new C70914e(fVar));
                }
            } else {
                String str = fVar.f204217g;
                if (str == null || str.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    C75228t.m90257l0(this.f205337d, fVar.f204217g, new C70915f(fVar));
                }
            }
        }
        int i3 = fVar.f204211a;
        MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
        C87412m.m108593f(mmkv2, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
        mmkv2.edit().putInt(String.valueOf(i3), 1);
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C70913d dVar, int i) {
        String str;
        C51975xh2 xh22;
        C70913d dVar2 = dVar;
        int i2 = i;
        C87412m.m108594g(dVar2, "viewHolder");
        List<? extends C70593j0.C70599f> list = this.f205338e;
        if (list != null && i2 >= 0 && i2 < ((ArrayList) list).size()) {
            List<? extends C70593j0.C70599f> list2 = this.f205338e;
            C87412m.m108591d(list2);
            C70593j0.C70599f fVar = (C70593j0.C70599f) ((ArrayList) list2).get(i2);
            List<? extends C70593j0.C70599f> list3 = this.f205338e;
            C87412m.m108591d(list3);
            if (i2 == ((ArrayList) list3).size() - 1) {
                View view = dVar2.f205351H;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = dVar2.f205351H;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = dVar2.f205352z;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            StringBuilder sb = new StringBuilder();
            sb.append("itemInfo name：");
            sb.append(fVar.f204212b);
            sb.append("， type: ");
            sb.append(fVar.f204211a);
            sb.append(", state：");
            sb.append(fVar.f204215e);
            sb.append(", chooseSetting：");
            int i3 = fVar.f204211a;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
            C87412m.m108593f(mmkv, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
            sb.append(mmkv.getInt(String.valueOf(i3), 0));
            Log.m105924i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", sb.toString());
            dVar2.f205344A.setRoundCorner(true);
            dVar2.f205344A.setRoundCornerRate(0.5f);
            if (!C85875k4.m106211z() || Util.isNullOrNil(fVar.f204214d)) {
                str = fVar.f204213c;
                C87412m.m108593f(str, "accountChannelInfo.recv_channel_logo");
            } else {
                str = fVar.f204214d;
                C87412m.m108593f(str, "accountChannelInfo.recv_channel_logo_darkmode");
            }
            int b = C76577a.m92151b(this.f205337d, 24);
            dVar2.f205344A.setUseSdcardCache(true);
            dVar2.f205344A.mo100288c(str, b, b, -1);
            dVar2.f205345B.setText(fVar.f204212b);
            dVar2.f205347D.setVisibility(8);
            dVar2.f205348E.setVisibility(8);
            C70593j0.C70599f.C70600a aVar4 = fVar.f204220j;
            if (aVar4 != null) {
                if (aVar4.f204225a != null) {
                    dVar2.f205347D.setVisibility(0);
                    C43423i0.m46937h(dVar2.f205347D, fVar.f204220j.f204225a, new C70916g());
                }
                C48730al alVar = fVar.f204220j.f204226b;
                if (!(alVar == null || alVar.f130604f != 0 || (xh22 = alVar.f130605g) == null)) {
                    String str2 = xh22.f144653d;
                    if (C85875k4.m106211z()) {
                        str2 = fVar.f204220j.f204226b.f130605g.f144658i;
                    }
                    if (str2 != null) {
                        dVar2.f205348E.setCallback(new C70918h(fVar, dVar2));
                        dVar2.f205348E.setUrl(str2);
                    }
                }
            }
            dVar2.f205346C.setVisibility(8);
            if (fVar.f204221k != null) {
                dVar2.f205346C.setVisibility(0);
                C50315lv3 lv32 = new C50315lv3();
                zf4 zf4 = fVar.f204221k;
                lv32.f137662e = zf4;
                if (zf4.f145863d.size() > 0) {
                    vf4 vf4 = fVar.f204221k.f145863d.get(0);
                    lv32.f137664g = vf4.f143470p;
                    C49118da3 da32 = new C49118da3();
                    da32.f132211d = 1.0f;
                    da32.f132213f = 4.0f;
                    da32.f132212e = 1.0f;
                    da32.f132214g = 4.0f;
                    lv32.f137663f = da32;
                    C52219z50 z502 = vf4.f143469o;
                    if (z502 != null) {
                        lv32.f137666i = z502;
                    }
                }
                C43423i0.m46936g(dVar2.f205346C, lv32);
            }
            C115669n.INSTANCE.mo160131h(27731, 1, Integer.valueOf(fVar.f204211a));
            int i4 = fVar.f204215e;
            if (i4 == 1) {
                dVar2.f205344A.setAlpha(1.0f);
                dVar2.f205345B.setTextColor(this.f205337d.getResources().getColor(C0966R.color.FG_0));
                dVar2.f205350G.setVisibility(8);
                if (fVar.f204211a == this.f205341h) {
                    dVar2.f205349F.setVisibility(0);
                } else {
                    dVar2.f205349F.setVisibility(8);
                }
                dVar2.f205352z.setBackgroundResource(C0966R.C0969drawable.cnz);
                dVar2.f205352z.setOnClickListener(new C70921i(this, fVar));
            } else if (i4 != 2) {
                View view7 = dVar2.f205352z;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105920e("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "unknow type");
            } else {
                dVar2.f205344A.setAlpha(0.3f);
                dVar2.f205345B.setTextColor(this.f205337d.getResources().getColor(C0966R.color.FG_2));
                String str3 = fVar.f204218h.f204229a;
                if (!(str3 == null || str3.length() == 0)) {
                    dVar2.f205350G.setVisibility(0);
                    dVar2.f205349F.setVisibility(8);
                    if (dVar2.f205347D.getVisibility() == 0) {
                        dVar2.f205350G.setVisibility(8);
                    }
                    Drawable drawable = C85875k4.m106211z() ? this.f205337d.getDrawable(C0966R.C0969drawable.coe) : this.f205337d.getDrawable(C0966R.C0969drawable.cod);
                    int p = (int) (C76577a.m92165p(this.f205337d) * ((float) 16));
                    if (drawable != null) {
                        drawable.setBounds(0, 0, C74942w4.m89784a(this.f205337d, p), C74942w4.m89784a(this.f205337d, p));
                    }
                    C5067f fVar2 = new C5067f(drawable);
                    C7092q qVar = new C7092q(this.f205337d.getResources().getColor(C0966R.color.FG_2), this.f205337d.getResources().getColor(C0966R.color.ahf), new C70922j(this, fVar));
                    qVar.f24998e = false;
                    dVar2.f205350G.setClickable(true);
                    dVar2.f205350G.setOnTouchListener(new C75355a0(this.f205337d));
                    String str4 = fVar.f204218h.f204229a + ' ';
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.setSpan(fVar2, str4.length() - 1, str4.length(), 17);
                    spannableStringBuilder.setSpan(qVar, 0, str4.length(), 18);
                    dVar2.f205350G.setText(spannableStringBuilder);
                    dVar2.f205350G.setTextColor(this.f205337d.getResources().getColor(C0966R.color.FG_2));
                }
                dVar2.f205352z.setOnClickListener((View.OnClickListener) null);
                dVar2.f205352z.setBackgroundResource(C0966R.color.ahf);
            }
        }
    }

    public int getItemCount() {
        List<? extends C70593j0.C70599f> list = this.f205338e;
        C87412m.m108591d(list);
        return ((ArrayList) list).size();
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d5e, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C70913d(inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C70913d dVar = (C70913d) zVar;
        C87412m.m108594g(dVar, "viewHolder");
        C87412m.m108594g(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(dVar, i);
            return;
        }
        List<? extends C70593j0.C70599f> list2 = this.f205338e;
        if (list2 != null && i >= 0 && i < ((ArrayList) list2).size()) {
            List<? extends C70593j0.C70599f> list3 = this.f205338e;
            C87412m.m108591d(list3);
            C70593j0.C70599f fVar = (C70593j0.C70599f) ((ArrayList) list3).get(i);
            if (fVar.f204215e != 1) {
                return;
            }
            if (fVar.f204211a == this.f205341h) {
                dVar.f205349F.setVisibility(0);
            } else {
                dVar.f205349F.setVisibility(8);
            }
        }
    }
}
