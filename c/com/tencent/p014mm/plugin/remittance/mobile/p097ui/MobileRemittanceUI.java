package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MobilePayCheckEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhonePlaceOrderExceptionReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo;
import com.tencent.p014mm.plugin.remittance.p098ui.C70900k;
import com.tencent.p014mm.plugin.remittance.p098ui.C70908l;
import com.tencent.p014mm.plugin.remittance.p098ui.C70923m;
import com.tencent.p014mm.plugin.remittance.p098ui.C70925n;
import com.tencent.p014mm.plugin.remittance.p098ui.C70927o;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.model.C75134q;
import com.tencent.p014mm.wallet_core.model.C75135r;
import com.tencent.p014mm.wallet_core.model.C75137s;
import com.tencent.p014mm.wallet_core.model.C75139t;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import p158gt.C76057w;
import p158gt.C8451i;
import p629ny.C76979h;
import p910lj.C76701a;
import qn3.C77382c;
import qo3.C77389a;
import qo3.C77398g;
import te3.C52296zq3;
import te3.C64600o30;
import te3.C64692rv;
import te3.C64731tl2;
import te3.aj4;
import te3.oj4;
import wi2.C53179b;
import wi2.C53182f;
import wi2.C78602g;
import xi2.C78842a;
import xi2.C78843b;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI */
public class MobileRemittanceUI extends MobileRemitBaseUI {

    /* renamed from: y0 */
    public static final /* synthetic */ int f203940y0 = 0;

    /* renamed from: A */
    public TextView f203941A;

    /* renamed from: B */
    public View f203942B;

    /* renamed from: C */
    public TextView f203943C;

    /* renamed from: D */
    public CdnImageView f203944D;

    /* renamed from: E */
    public WalletFormView f203945E;

    /* renamed from: F */
    public RelativeLayout f203946F;

    /* renamed from: G */
    public TextView f203947G;

    /* renamed from: H */
    public RelativeLayout f203948H;

    /* renamed from: I */
    public LinearLayout f203949I;

    /* renamed from: J */
    public TextView f203950J;

    /* renamed from: K */
    public TextView f203951K;

    /* renamed from: L */
    public RelativeLayout f203952L;

    /* renamed from: M */
    public TextView f203953M;

    /* renamed from: N */
    public String f203954N;

    /* renamed from: P */
    public double f203955P;

    /* renamed from: Q */
    public String f203956Q;

    /* renamed from: R */
    public int f203957R;

    /* renamed from: S */
    public int f203958S = 0;

    /* renamed from: T */
    public int f203959T = 0;

    /* renamed from: U */
    public String f203960U;

    /* renamed from: V */
    public Intent f203961V;

    /* renamed from: W */
    public Map<String, C70553j> f203962W = new HashMap();

    /* renamed from: X */
    public Map<String, Boolean> f203963X = new HashMap();

    /* renamed from: Y */
    public IListener<MobilePayCheckEvent> f203964Y = new IListener<MobilePayCheckEvent>(C40008f.f107254d) {
        {
            this.__eventId = 251598728;
        }

        public boolean callback(IEvent iEvent) {
            String str = ((MobilePayCheckEvent) iEvent).f193736d.f193737a;
            Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "MobilePayCheckEvent reqKey:%s", str);
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            C70553j jVar = (C70553j) ((HashMap) mobileRemittanceUI.f203962W).get(str);
            Log.m105919d("MicroMsg.mobileRemit.MobileRemittanceUI", "match reqKey: %s, %d", str, Integer.valueOf(((HashMap) mobileRemittanceUI.f203962W).size()));
            if (jVar == null) {
                Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "no data for: %s", str);
            } else {
                C86709a0.m107524d().mo123460f(new C53182f(str, jVar.f204004a, jVar.f204005b, jVar.f204006c, (long) jVar.f204007d, jVar.f204008e, jVar.f204009f, jVar.f204010g));
            }
            Map<String, Boolean> map = MobileRemittanceUI.this.f203963X;
            if (map != null && ((HashMap) map).containsKey(str)) {
                C70553j jVar2 = (C70553j) ((HashMap) MobileRemittanceUI.this.f203962W).get(str);
                String str2 = jVar2 != null ? jVar2.f204004a : "";
                if (((Boolean) ((HashMap) MobileRemittanceUI.this.f203963X).get(str)).booleanValue()) {
                    MobileRemittanceUI.this.mo97218L7(7, str2);
                } else {
                    MobileRemittanceUI.this.mo97218L7(6, str2);
                }
            }
            return false;
        }
    };

    /* renamed from: Z */
    public int f203965Z = 0;

    /* renamed from: d */
    public String f203966d;

    /* renamed from: e */
    public String f203967e;

    /* renamed from: f */
    public String f203968f;

    /* renamed from: g */
    public String f203969g;

    /* renamed from: h */
    public String f203970h;

    /* renamed from: i */
    public String f203971i;

    /* renamed from: j */
    public int f203972j;

    /* renamed from: n */
    public List<C64600o30> f203973n = new ArrayList();

    /* renamed from: o */
    public String f203974o;

    /* renamed from: p */
    public String f203975p;

    /* renamed from: p0 */
    public Runnable f203976p0 = new C70544a();

    /* renamed from: q */
    public String f203977q;

    /* renamed from: r */
    public String f203978r;

    /* renamed from: s */
    public String f203979s;

    /* renamed from: t */
    public int f203980t;

    /* renamed from: u */
    public String f203981u;

    /* renamed from: v */
    public ScrollView f203982v;

    /* renamed from: w */
    public WcPayKeyboard f203983w;

    /* renamed from: x */
    public LinearLayout f203984x;

    /* renamed from: x0 */
    public C78842a f203985x0 = new C70551h();

    /* renamed from: y */
    public TextView f203986y;

    /* renamed from: z */
    public TextView f203987z;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$k */
    public static class C5054k extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$k$a */
        public class C5055a implements C32226l<View, String> {
            public C5055a() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                TextView textView = (TextView) C5054k.this.findViewById(C0966R.C0970id.gwq);
                TextView textView2 = (TextView) C5054k.this.findViewById(C0966R.C0970id.gwr);
                if (textView == null || textView2 == null) {
                    return "";
                }
                return textView.getText().toString() + textView2.getText().toString();
            }
        }

        public C5054k(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.gxb);
            root.disable(C0966R.C0970id.gxb);
            root.disable(C0966R.C0970id.gwn);
            root.view(C0966R.C0970id.gws).desc((C32226l<? super View, String>) new C5055a());
            ViewSetter expand = root.view(C0966R.C0970id.gxd).expand(12, 12, 12, 12);
            ViewType viewType = ViewType.Button;
            expand.type(viewType);
            root.view(C0966R.C0970id.f359066im2).type(viewType);
            root.view(C0966R.C0970id.f5597je).type(viewType);
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.cga);
            root2.view(C0966R.C0970id.lg_).type(ViewType.TextView).descFormat(C0966R.string.i3c).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.lg_).valueByString(C0966R.string.i1p);
            root2.disable(C0966R.C0970id.ljn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$a */
    public class C70544a implements Runnable {
        public C70544a() {
        }

        public void run() {
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            if (mobileRemittanceUI.f203965Z == 2 && mobileRemittanceUI.isHandleAutoShowNormalStWcKb()) {
                MobileRemittanceUI.this.showNormalStWcKb();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$b */
    public class C70545b extends C78842a {
        public C70545b() {
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "checkNameResp.jump_win dialog click jumpItem.action:exit");
            MobileRemittanceUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "checkNameResp.jump_win dialog click jumpItem.action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97217K7(true, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$c */
    public class C70546c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Toast f203991d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f203992e;

        public C70546c(Toast toast, C117747y yVar) {
            this.f203991d = toast;
            this.f203992e = yVar;
        }

        public void run() {
            this.f203991d.cancel();
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "mobile_remit_verify_name_success dialog dismiss");
            if (((C53179b) this.f203992e).f148363u == 2) {
                MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
                int i = MobileRemittanceUI.f203940y0;
                mobileRemittanceUI.mo97217K7(true, true);
                MobileRemittanceUI.this.mo97218L7(2, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$d */
    public class C70547d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ oj4 f203994d;

        public C70547d(oj4 oj4) {
            this.f203994d = oj4;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f203994d.f227922f == 1) {
                MobileRemittanceUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$e */
    public class C70548e extends C78842a {
        public C70548e() {
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder jump_win dialog click action:exit");
            MobileRemittanceUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder jump_win dialog click action:continue");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$f */
    public class C70549f extends C78842a<String> {

        /* renamed from: a */
        public final /* synthetic */ oj4 f203997a;

        public C70549f(oj4 oj4) {
            this.f203997a = oj4;
        }

        /* renamed from: a */
        public void mo97225a(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            String str2 = this.f203997a.f227929p;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97218L7(9, str2);
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:exit");
            MobileRemittanceUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97221O7((String) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$g */
    public class C70550g extends C78842a<String> {

        /* renamed from: a */
        public final /* synthetic */ oj4 f203999a;

        public C70550g(oj4 oj4) {
            this.f203999a = oj4;
        }

        /* renamed from: a */
        public void mo97225a(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            String str2 = this.f203999a.f227929p;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97218L7(8, str2);
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:exit");
            MobileRemittanceUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97221O7((String) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$h */
    public class C70551h extends C78842a<String> {
        public C70551h() {
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:exit");
            MobileRemittanceUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "dialog click action:continue");
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            int i = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.mo97221O7((String) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$i */
    public class C70552i implements C70900k.C70904d {

        /* renamed from: a */
        public final /* synthetic */ int f204002a;

        public C70552i(int i) {
            this.f204002a = i;
        }

        /* renamed from: a */
        public void mo97226a(String str) {
            Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onINputName() name:%s", str);
            MobileRemittanceUI.this.hideVKB();
            MobileRemittanceUI mobileRemittanceUI = MobileRemittanceUI.this;
            int i = this.f204002a;
            int i2 = MobileRemittanceUI.f203940y0;
            mobileRemittanceUI.getClass();
            Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "do check name: %s", Integer.valueOf(i));
            mobileRemittanceUI.doSceneProgress(new C53179b(i, mobileRemittanceUI.f203966d, mobileRemittanceUI.f203967e, str, mobileRemittanceUI.f203977q, i == 2 ? mobileRemittanceUI.f203960U : ""), true);
        }

        public void onCancel() {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "mVerifyNameTv onCancel()");
            MobileRemittanceUI.this.hideVKB();
            MobileRemittanceUI.this.showNormalStWcKb();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI$j */
    public static class C70553j {

        /* renamed from: a */
        public String f204004a;

        /* renamed from: b */
        public String f204005b;

        /* renamed from: c */
        public String f204006c;

        /* renamed from: d */
        public int f204007d;

        /* renamed from: e */
        public String f204008e;

        /* renamed from: f */
        public String f204009f;

        /* renamed from: g */
        public String f204010g;

        /* renamed from: h */
        public int f204011h;

        /* renamed from: i */
        public boolean f204012i;

        /* renamed from: j */
        public boolean f204013j;

        public C70553j(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2, boolean z, boolean z2) {
            this.f204004a = str2;
            this.f204005b = str3;
            this.f204006c = str4;
            this.f204007d = i;
            this.f204008e = str5;
            this.f204009f = str6;
            this.f204010g = str7;
            this.f204011h = i2;
            this.f204012i = z;
            this.f204013j = z2;
        }
    }

    /* renamed from: I7 */
    public static void m83079I7(MobileRemittanceUI mobileRemittanceUI) {
        if (Util.isNullOrNil(mobileRemittanceUI.f203956Q)) {
            mobileRemittanceUI.f203950J.setVisibility(8);
            mobileRemittanceUI.f203951K.setText(C0966R.string.hzl);
            mobileRemittanceUI.f203951K.setVisibility(0);
            return;
        }
        new C72478z(mobileRemittanceUI.getContext());
        String string = mobileRemittanceUI.getString(C0966R.string.i1o);
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(mobileRemittanceUI, mobileRemittanceUI.getString(C0966R.string.bgb, new Object[]{mobileRemittanceUI.f203956Q, string}));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(T1);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(mobileRemittanceUI.getResources().getColor(C0966R.color.a1d)), T1.length() - string.length(), T1.length(), 34);
        mobileRemittanceUI.f203950J.setText(spannableStringBuilder);
        mobileRemittanceUI.f203951K.setVisibility(8);
        mobileRemittanceUI.f203950J.setVisibility(0);
    }

    /* renamed from: J7 */
    public final void mo97216J7(int i) {
        WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f194684d = (long) i;
        wCPayTransferToPhoneActionReportStruct.mo86054n();
    }

    /* renamed from: K7 */
    public final void mo97217K7(boolean z, boolean z2) {
        doSceneProgress(new C78602g(this.f203966d, this.f203967e, this.f203977q, this.f203955P, this.f203956Q, this.f203957R, this.f203979s, this.f203978r, z, this.f203981u, z2), true);
    }

    /* renamed from: L7 */
    public final void mo97218L7(int i, String str) {
        WCPayTransferToPhonePlaceOrderExceptionReportStruct wCPayTransferToPhonePlaceOrderExceptionReportStruct = new WCPayTransferToPhonePlaceOrderExceptionReportStruct();
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.f156901d = (long) i;
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.f156902e = wCPayTransferToPhonePlaceOrderExceptionReportStruct.mo86045b("ReqKey", str, true);
        wCPayTransferToPhonePlaceOrderExceptionReportStruct.mo86054n();
    }

    /* renamed from: M7 */
    public final void mo97219M7(C78602g gVar) {
        C78602g gVar2 = gVar;
        oj4 oj4 = gVar2.f230226t;
        C70553j jVar = new C70553j((oj4 == null ? null : oj4).f227928o, (oj4 == null ? null : oj4).f227929p, (oj4 == null ? null : oj4).f227930q, this.f203966d, gVar2.f230227u, (oj4 == null ? null : oj4).f227932s, this.f203967e, (oj4 == null ? null : oj4).f227931r, gVar2.f230228v, gVar2.f230229w, gVar2.f230230x);
        Map<String, C70553j> map = this.f203962W;
        if (oj4 == null) {
            oj4 = null;
        }
        ((HashMap) map).put(oj4.f227928o, jVar);
    }

    /* renamed from: N7 */
    public final void mo97220N7(int i) {
        showCircleStWcKb();
        C70900k kVar = new C70900k(this);
        String str = this.f203974o;
        String str2 = this.f203975p;
        kVar.f205320b = new C70552i(i);
        View inflate = View.inflate(this, C0966R.C0971layout.bpw, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.e_9);
        ((MMNeat7extView) inflate.findViewById(C0966R.C0970id.br8)).mo104279b(str);
        ((TextView) inflate.findViewById(C0966R.C0970id.fhu)).setText(str2);
        Context context = kVar.f205319a;
        C77389a aVar = new C77389a();
        aVar.f225644a = context.getString(C0966R.string.gun);
        aVar.f225627J = inflate;
        C77382c b = C77382c.m93286b(editText);
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        b.f225611e = 1;
        b.f225610d = 1;
        b.f225607a = false;
        b.mo107499d((C77382c.C77383a) null);
        MMHandlerThread.postToMainThreadDelayed(new C70908l(kVar, editText), 200);
        aVar.f225663t = kVar.f205319a.getResources().getString(C0966R.string.gui);
        aVar.f225638U = -2141754475;
        aVar.f225620C = new C70923m(kVar, editText);
        aVar.f225641X = false;
        aVar.f225664u = kVar.f205319a.getResources().getString(C0966R.string.atx);
        aVar.f225621D = new C70925n(kVar);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        editText.addTextChangedListener(new C70927o(kVar, editText, gVar));
    }

    /* renamed from: O7 */
    public final void mo97221O7(String str) {
        Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() reqKey:%s", str);
        C70553j jVar = (C70553j) ((HashMap) this.f203962W).get(str);
        if (jVar == null) {
            Log.m105920e("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() strut == null fail!!");
            return;
        }
        if (jVar.f204012i) {
            ((HashMap) this.f203963X).put(str, Boolean.valueOf(jVar.f204013j));
        }
        PayInfo payInfo = new PayInfo();
        payInfo.f212592j = str;
        payInfo.f212587e = 56;
        payInfo.f212589g = C78843b.f231662a;
        Bundle bundle = new Bundle();
        bundle.putString("extinfo_key_1", jVar.f204004a);
        bundle.putString("extinfo_key_2", jVar.f204005b);
        bundle.putString("extinfo_key_3", jVar.f204006c);
        bundle.putString("extinfo_key_4", jVar.f204009f);
        bundle.putInt("extinfo_key_5", jVar.f204007d);
        bundle.putString("extinfo_key_6", jVar.f204010g);
        bundle.putString("extinfo_key_7", jVar.f204008e);
        bundle.putInt("extinfo_key_8", jVar.f204011h);
        bundle.putString("extinfo_key_9", this.f203968f);
        bundle.putString("extinfo_key_10", this.f203969g);
        bundle.putString("extinfo_key_11", str);
        if (!Util.isNullOrNil(this.f203954N)) {
            bundle.putString("extinfo_key_12", getString(C0966R.string.f361037gu0, new Object[]{this.f203968f, this.f203954N}));
        }
        payInfo.f212600u = bundle;
        C79144b.m95773a().getClass();
        C79144b.m95773a().getClass();
        Boolean bool = Boolean.TRUE;
        Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() for kinda");
        hideProgress();
        hideLoading();
        Intent intent = new Intent(getContext(), MobileRemitResultUI.class);
        this.f203961V = intent;
        intent.putExtras(bundle);
        showProgress();
        ((C76324c) C86312j.m106911c(C76324c.class)).startSNSPay(getContext(), payInfo);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgd;
    }

    public void initView() {
        super.initView();
        this.f203982v = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f203983w = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f203984x = (LinearLayout) findViewById(C0966R.C0970id.gws);
        this.f203986y = (TextView) findViewById(C0966R.C0970id.gwq);
        this.f203987z = (TextView) findViewById(C0966R.C0970id.gwr);
        this.f203941A = (TextView) findViewById(C0966R.C0970id.f358760gx1);
        this.f203942B = findViewById(C0966R.C0970id.gxe);
        this.f203943C = (TextView) findViewById(C0966R.C0970id.gxd);
        this.f203944D = (CdnImageView) findViewById(C0966R.C0970id.gwn);
        this.f203945E = (WalletFormView) findViewById(C0966R.C0970id.gwp);
        this.f203946F = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
        this.f203947G = (TextView) findViewById(C0966R.C0970id.lha);
        this.f203948H = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
        this.f203949I = (LinearLayout) findViewById(C0966R.C0970id.gwh);
        this.f203950J = (TextView) findViewById(C0966R.C0970id.f359066im2);
        this.f203951K = (TextView) findViewById(C0966R.C0970id.f5597je);
        this.f203952L = (RelativeLayout) findViewById(C0966R.C0970id.gwf);
        this.f203953M = (TextView) findViewById(C0966R.C0970id.gwg);
        if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            this.f203946F.post(new C70564j(this));
            this.f203945E.setmWalletFormViewListener(new C70565k(this));
        } else {
            this.f203948H.setVisibility(8);
        }
        this.f203983w.mo104740e();
        this.f203983w.setActionText(getString(C0966R.string.i2_));
        ((RelativeLayout.LayoutParams) this.f203983w.getLayoutParams()).addRule(12);
        this.f203983w.mo104738c(false);
        setWPKeyboard(this.f203945E.getContentEt(), true, false);
        this.f203945E.setmContentAbnormalMoneyCheck(true);
        this.f203945E.post(new C70563i(this));
        this.f203945E.getContentEt().setOnEditorActionListener(new C70561g(this, new C70578u(this)));
        this.f203945E.mo105069a(new C70562h(this));
        this.f203945E.mo105097o(7, 2);
        C85875k4.m106189j0(this.f203951K.getPaint(), 0.8f);
        this.f203949I.setOnClickListener(new C70569p(this));
        List<C64600o30> list = this.f203973n;
        if (list == null || ((ArrayList) list).isEmpty()) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "mDelayOptions is null");
        } else {
            this.f203957R = ((C64600o30) ((ArrayList) this.f203973n).get(0)).f184613e;
            this.f203953M.setText(((C64600o30) ((ArrayList) this.f203973n).get(0)).f184612d);
            this.f203952L.setOnClickListener(new C70568o(this));
        }
        setMMTitle("");
        hideActionbarLine();
        this.f203982v.setOnTouchListener(new C70573q(this));
        this.f203954N = this.f203969g;
        this.f203984x.post(new C70574r(this));
        this.f203941A.setText(this.f203970h);
        if (Util.isNullOrNil(this.f203971i)) {
            this.f203944D.setImageResource(C0966R.C0969drawable.bfa);
        } else {
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(this.f203971i);
            if (bitmap != null) {
                this.f203944D.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f));
            } else {
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(this.f203971i, new C70575s(this));
            }
        }
        String string = getString(C0966R.string.guh);
        C75228t.m90253j0(this.f203943C, string, 0, string.length(), new C7092q((C7092q.C7093a) new C70577t(this), true), getContext());
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById = findViewById(C0966R.C0970id.lh_);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
            return;
        }
        View findViewById3 = findViewById(C0966R.C0970id.lh_);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view3 = findViewById3;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = findViewById(C0966R.C0970id.lh7);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view4 = findViewById4;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f203983w.mo104746j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "reqcode=" + i + ", resultCode=" + i2);
        if (i == 1) {
            boolean z = i2 == -1;
            Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "processResult() isOk:%s", Boolean.valueOf(z));
            if (z) {
                finish();
            } else if (C75157y0.m90140c(intent)) {
                finish();
            } else {
                C75157y0.m90141d(intent);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f203966d = getIntent().getStringExtra("key_rcvr_openid");
        this.f203967e = getIntent().getStringExtra("key_rcvr_token");
        this.f203968f = getIntent().getStringExtra("key_wx_name");
        this.f203969g = getIntent().getStringExtra("key_real_name");
        this.f203970h = getIntent().getStringExtra("key_phone");
        this.f203971i = getIntent().getStringExtra("key_img_url");
        this.f203972j = getIntent().getIntExtra("key_amount_remind_bit", 4);
        ArrayList<NetSceneMobileRemitGetRecvInfo.DelayOptionParcel> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_delay_options");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            List<C64600o30> list = this.f203973n;
            int i = NetSceneMobileRemitGetRecvInfo.f115989w;
            ArrayList arrayList = new ArrayList();
            for (NetSceneMobileRemitGetRecvInfo.DelayOptionParcel delayOptionParcel : parcelableArrayListExtra) {
                C64600o30 o302 = new C64600o30();
                o302.f184612d = delayOptionParcel.f115993d;
                o302.f184613e = delayOptionParcel.f115994e;
                arrayList.add(o302);
            }
            ((ArrayList) list).addAll(arrayList);
        }
        this.f203974o = getIntent().getStringExtra("key_check_name_wording");
        this.f203975p = getIntent().getStringExtra("key_check_name_mask");
        this.f203977q = getIntent().getStringExtra("key_get_rcvr_ext");
        this.f203978r = getIntent().getStringExtra("key_timestamp_ms");
        initView();
        addSceneEndListener(2878);
        addSceneEndListener(2694);
        this.f203964Y.alive();
        this.f203965Z = 1;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f203964Y.dead();
        removeSceneEndListener(2878);
        removeSceneEndListener(2694);
        Map<String, C70553j> map = this.f203962W;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f203976p0, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.f203983w;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "onPause()");
        if (!this.f203983w.mo104747k()) {
            this.f203965Z = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "onResume()");
        if (this.f203965Z == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.f203965Z = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        StringBuilder sb = new StringBuilder();
        sb.append("errType:");
        sb.append(i3);
        sb.append(" errCode:");
        sb.append(i4);
        sb.append(" errMsg:");
        String str2 = str;
        sb.append(str2);
        sb.append(" scenetype:");
        sb.append(yVar.getType());
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", sb.toString());
        if (i3 != 0 || i4 != 0) {
            if (!(yVar2 instanceof C53179b)) {
                boolean z = yVar2 instanceof C78602g;
            }
            if (i4 == 0) {
                C76879j.m92711E(getContext(), Util.isNullOrNil(str) ? getString(C0966R.string.f361039gu2) : str2, "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
            }
        } else if (yVar2 instanceof C53179b) {
            C53179b bVar = (C53179b) yVar2;
            aj4 aj4 = bVar.f148362t;
            if (aj4 == null) {
                aj4 = null;
            }
            if (aj4 == null) {
                C76879j.m92711E(getContext(), getString(C0966R.string.krp), "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
            } else {
                if (aj4.f130571h != null) {
                    C75129p.m90109d(getContext(), aj4.f130571h, null, new C70545b());
                } else if (aj4.f130567d == 0) {
                    this.f203943C.setText(C0966R.string.gul);
                    this.f203943C.setTextColor(getResources().getColor(C0966R.color.a7b));
                    this.f203943C.setOnClickListener((View.OnClickListener) null);
                    this.f203943C.setOnTouchListener((View.OnTouchListener) null);
                    this.f203987z.setText(getString(C0966R.string.guk, new Object[]{aj4.f130570g}));
                    this.f203954N = aj4.f130570g;
                    this.f203979s = aj4.f130569f;
                    if (bVar.f148363u == 2) {
                        mo97217K7(true, true);
                        mo97218L7(2, "");
                    } else {
                        Toast makeText = C76701a.makeText((Context) getContext(), (CharSequence) "", 0);
                        View inflate = View.inflate(getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
                        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_done);
                        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(getContext().getResources().getString(C0966R.string.gum));
                        makeText.setGravity(17, 0, 0);
                        makeText.setView(inflate);
                        makeText.show();
                        new MMHandler().postDelayed(new C70546c(makeText, yVar2), 750);
                    }
                    mo97216J7(9);
                } else {
                    C76879j.m92711E(getContext(), Util.isNullOrNil(aj4.f130568e) ? getString(C0966R.string.krp) : aj4.f130568e, "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
                }
                this.f203979s = aj4.f130569f;
            }
            return true;
        } else if (yVar2 instanceof C78602g) {
            C78602g gVar = (C78602g) yVar2;
            oj4 oj4 = gVar.f230226t;
            if (oj4 == null) {
                oj4 = null;
            }
            if (oj4 == null) {
                Log.m105920e("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder placeOrderResp is null");
                return true;
            }
            int i5 = oj4.f227920d;
            if (i5 != 0) {
                Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder ret_code:%s ret_code_action:%s", Integer.valueOf(i5), Integer.valueOf(oj4.f227922f));
                C76879j.m92711E(getContext(), Util.isNullOrNil(oj4.f227921e) ? getString(C0966R.string.krp) : oj4.f227921e, "", getResources().getString(C0966R.string.f361038gu1), false, new C70547d(oj4)).show();
            } else {
                this.f203981u = oj4.f227933t;
                this.f203960U = oj4.f227934u;
                if (oj4.f227923g != null) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show jump_win");
                    C75129p.m90109d(getContext(), oj4.f227923g, null, new C70548e());
                } else if (oj4.f227924h != 0) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show verify dilog");
                    mo97220N7(2);
                    mo97218L7(1, "");
                } else if (oj4.f227925i != null) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show remind_win");
                    C75129p.m90109d(getContext(), oj4.f227925i, oj4.f227928o, this.f203985x0);
                    mo97219M7(gVar);
                } else if (oj4.f227926j != null) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show check_win");
                    AppCompatActivity context = getContext();
                    C64692rv rvVar = oj4.f227926j;
                    String str3 = oj4.f227928o;
                    C70549f fVar = new C70549f(oj4);
                    C70550g gVar2 = new C70550g(oj4);
                    if (rvVar == null) {
                        Log.m105924i("MicroMsg.JumpItemUtil", "showCheckWin() checkWin == null");
                    } else if (rvVar.f185303g == null || rvVar.f185304h == null) {
                        Log.m105924i("MicroMsg.JumpItemUtil", "showCheckWin() left_button == null || right_button == null");
                    } else {
                        LinkedList<C64731tl2> linkedList = rvVar.f185302f;
                        if (linkedList == null || linkedList.isEmpty()) {
                            Log.m105924i("MicroMsg.JumpItemUtil", "showCheckWin() check_item == null || check_item.isEmpty()");
                        } else {
                            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6992ub, (ViewGroup) null);
                            ((TextView) inflate2.findViewById(C0966R.C0970id.k_c)).setText(rvVar.f185301e);
                            LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(C0966R.C0970id.fa6);
                            for (int i6 = 0; i6 < rvVar.f185302f.size(); i6++) {
                                View inflate3 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6991ua, (ViewGroup) null);
                                ((TextView) inflate3.findViewById(C0966R.C0970id.faq)).setText(rvVar.f185302f.get(i6).f185610d);
                                ((TextView) inflate3.findViewById(C0966R.C0970id.fc7)).setText(rvVar.f185302f.get(i6).f185611e);
                                linearLayout.addView(inflate3);
                            }
                            C76879j.m92715I(context, false, rvVar.f185300d, inflate2, rvVar.f185304h.f227478d, rvVar.f185303g.f227478d, new C75134q(context, rvVar, str3, gVar2), new C75135r(context, rvVar, str3, fVar)).show();
                        }
                    }
                    mo97219M7(gVar);
                } else if (oj4.f227927n != null) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show dup_pay_win");
                    AppCompatActivity context2 = getContext();
                    C52296zq3 zq32 = oj4.f227927n;
                    String str4 = oj4.f227928o;
                    C78842a aVar = this.f203985x0;
                    if (zq32 == null) {
                        Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin3() remindWin3 == null");
                    } else {
                        String str5 = zq32.f146182d;
                        String str6 = zq32.f146184f.f227478d;
                        String str7 = zq32.f146183e.f227478d;
                        C75137s sVar = new C75137s(context2, zq32, str4, aVar);
                        C75139t tVar = new C75139t(context2, zq32, str4, aVar);
                        C77389a aVar2 = new C77389a();
                        aVar2.f225644a = "";
                        aVar2.f225660q = str5;
                        aVar2.f225663t = str6;
                        aVar2.f225620C = sVar;
                        aVar2.f225664u = str7;
                        aVar2.f225621D = tVar;
                        aVar2.f225668y = false;
                        aVar2.f225669z = true;
                        C77398g gVar3 = new C77398g(context2, C0966R.style.a66);
                        gVar3.mo107525e(aVar2);
                        gVar3.show();
                        C76879j.m92730a(context2, gVar3);
                    }
                    mo97219M7(gVar);
                } else {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "go to start pay");
                    mo97219M7(gVar);
                    mo97221O7(oj4.f227928o);
                }
                return true;
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5054k.class);
    }
}
