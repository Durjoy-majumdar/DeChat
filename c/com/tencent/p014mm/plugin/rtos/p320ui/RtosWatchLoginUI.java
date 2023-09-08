package com.tencent.p014mm.plugin.rtos.p320ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RtosCancelLoginEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.loading.MMProgressLoading;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import de3.C75365k;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import hk2.C20958c;
import hk2.C32939b;
import j20.C117292a;
import java.util.ArrayList;
import jk2.C21247f;
import jk2.C21251j;
import jk2.C21253l;
import jk2.C21256p;
import jk2.C21259v;
import kotlin.Metadata;
import lk2.C21439b;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C11385n;
import p629ny.C76978g;
import pk2.C21977a;
import pk2.C21983h;
import pk2.C21986m;
import pk2.C21990o;
import pk2.C21991p;
import pk2.C21992q;
import pk2.C21993r;
import pk2.C21997v;
import pk2.C47512d;
import pk2.C77106i;
import pk2.C77107j;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI */
public final class RtosWatchLoginUI extends MMActivity implements C11385n {

    /* renamed from: I */
    public static final /* synthetic */ int f53343I = 0;

    /* renamed from: A */
    public boolean f53344A;

    /* renamed from: B */
    public boolean f53345B;

    /* renamed from: C */
    public boolean f53346C;

    /* renamed from: D */
    public boolean f53347D;

    /* renamed from: E */
    public boolean f53348E;

    /* renamed from: F */
    public IListener<RtosCancelLoginEvent> f53349F = new RtosWatchLoginUI$rtosCancelLoginEventListener$1(this, C40008f.f107254d);

    /* renamed from: G */
    public C20958c f53350G = new C18999i(this);

    /* renamed from: H */
    public MMHandler f53351H = new MMHandler((MMHandler.Callback) new C18994d(this));

    /* renamed from: d */
    public Button f53352d;

    /* renamed from: e */
    public TextView f53353e;

    /* renamed from: f */
    public WeImageView f53354f;

    /* renamed from: g */
    public TextView f53355g;

    /* renamed from: h */
    public TextView f53356h;

    /* renamed from: i */
    public TextView f53357i;

    /* renamed from: j */
    public ProgressBar f53358j;

    /* renamed from: n */
    public MMProgressLoading f53359n;

    /* renamed from: o */
    public WeImageView f53360o;

    /* renamed from: p */
    public LinearLayout f53361p;

    /* renamed from: q */
    public TextView f53362q;

    /* renamed from: r */
    public ProgressDialog f53363r;

    /* renamed from: s */
    public String f53364s;

    /* renamed from: t */
    public String f53365t;

    /* renamed from: u */
    public String f53366u;

    /* renamed from: v */
    public String f53367v;

    /* renamed from: w */
    public String f53368w;

    /* renamed from: x */
    public C21439b f53369x = new C21439b();

    /* renamed from: y */
    public int f53370y;

    /* renamed from: z */
    public boolean f53371z;

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$a */
    public static final class C18991a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53372d;

        public C18991a(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53372d = rtosWatchLoginUI;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            RtosWatchLoginUI rtosWatchLoginUI = this.f53372d;
            int i = RtosWatchLoginUI.f53343I;
            rtosWatchLoginUI.f53351H.postUI(new C21983h(rtosWatchLoginUI));
            this.f53372d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$b */
    public static final class C18992b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53373d;

        public C18992b(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53373d = rtosWatchLoginUI;
        }

        public final void run() {
            TextView textView = this.f53373d.f53353e;
            if (textView != null) {
                textView.setEnabled(false);
            }
            this.f53373d.setBackBtnVisible(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$c */
    public static final class C18993c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53374d;

        public C18993c(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53374d = rtosWatchLoginUI;
        }

        public final void run() {
            this.f53374d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$d */
    public static final class C18994d implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53375d;

        public C18994d(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53375d = rtosWatchLoginUI;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "handler msg " + message.what);
            switch (message.what) {
                case 1001:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.CHECK_RES, 0);
                    return true;
                case 1002:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.CHECK_RES_FAIL, 0);
                    return true;
                case 1003:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.CONNECTING_WATCH, 0);
                    return true;
                case 1004:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.CONNECTING_WATCH_FAIL, message.arg1);
                    return true;
                case 1005:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.WAITING_LOGIN, 0);
                    return true;
                case 1006:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.LOGGING, 0);
                    return true;
                case 1007:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.LOGIN_FAIL, 0);
                    return true;
                case 1008:
                    RtosWatchLoginUI.m20044H7(this.f53375d, C21977a.CANCEL_LOGIN, 0);
                    return true;
                default:
                    return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$e */
    public static final class C18995e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53376d;

        public C18995e(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53376d = rtosWatchLoginUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            RtosWatchLoginUI rtosWatchLoginUI = this.f53376d;
            int i = RtosWatchLoginUI.f53343I;
            rtosWatchLoginUI.mo24201I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$f */
    public static final class C18996f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RtosWatchLoginUI f53377a;

        public C18996f(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53377a = rtosWatchLoginUI;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RtosWatchLoginUI rtosWatchLoginUI = this.f53377a;
            rtosWatchLoginUI.f53371z = z;
            rtosWatchLoginUI.mo24205M7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$g */
    public static final class C18997g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53378d;

        public C18997g(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53378d = rtosWatchLoginUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RtosWatchLoginUI rtosWatchLoginUI = this.f53378d;
            int i = RtosWatchLoginUI.f53343I;
            rtosWatchLoginUI.getClass();
            Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "save privacy flag");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, Boolean.TRUE);
            RtosWatchLoginUI rtosWatchLoginUI2 = this.f53378d;
            rtosWatchLoginUI2.f53351H.postUI(new C21986m(rtosWatchLoginUI2));
            RtosWatchLoginUI rtosWatchLoginUI3 = this.f53378d;
            if (Util.isNullOrNil(rtosWatchLoginUI3.f53364s)) {
                Log.m105928w("MicroMsg.Rtos.RtosWatchLoginUI", "mac address is empty");
            } else {
                C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, new IPCVoid(), C21247f.class, new C47512d(rtosWatchLoginUI3));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$h */
    public static final class C18998h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53379d;

        public C18998h(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53379d = rtosWatchLoginUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RtosWatchLoginUI rtosWatchLoginUI = this.f53379d;
            int i = RtosWatchLoginUI.f53343I;
            rtosWatchLoginUI.mo24201I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$i */
    public static final class C18999i implements C20958c {

        /* renamed from: a */
        public final /* synthetic */ RtosWatchLoginUI f53380a;

        public C18999i(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53380a = rtosWatchLoginUI;
        }

        /* renamed from: a */
        public final void mo24214a() {
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "isWaitingScan " + this.f53380a.f53348E);
            RtosWatchLoginUI rtosWatchLoginUI = this.f53380a;
            if (rtosWatchLoginUI.f53348E) {
                rtosWatchLoginUI.getClass();
                Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "waitScan");
                Bundle bundle = new Bundle();
                bundle.putString(TPDownloadProxyEnum.USER_MAC, rtosWatchLoginUI.f53364s);
                bundle.putString("avatar", rtosWatchLoginUI.f53368w);
                C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, bundle, C21256p.class, new C21997v(rtosWatchLoginUI));
                this.f53380a.f53348E = false;
            } else if (rtosWatchLoginUI.f53347D) {
                Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "already start service, ignore");
            } else {
                rtosWatchLoginUI.f53347D = true;
                Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "postStartRtosService");
                if (rtosWatchLoginUI.f53346C) {
                    Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "Login cancel. ignore start service");
                    return;
                }
                Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "login ui startRtosService");
                C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, new IPCInteger(1), C21251j.class, new C21991p(rtosWatchLoginUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$j */
    public static final class C19000j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f53381d;

        public C19000j(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53381d = rtosWatchLoginUI;
        }

        public final void run() {
            RtosWatchLoginUI rtosWatchLoginUI = this.f53381d;
            C76912y0.m92769h(rtosWatchLoginUI, rtosWatchLoginUI.getResources().getString(C0966R.string.mj8), C0966R.raw.icons_filled_done);
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI$k */
    public static final class C19001k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f53382d;

        /* renamed from: e */
        public final /* synthetic */ RtosWatchLoginUI f53383e;

        public C19001k(int i, RtosWatchLoginUI rtosWatchLoginUI) {
            this.f53382d = i;
            this.f53383e = rtosWatchLoginUI;
        }

        public final void run() {
            C115669n.INSTANCE.mo175911u(1904, this.f53382d);
            RtosWatchLoginUI rtosWatchLoginUI = this.f53383e;
            rtosWatchLoginUI.f53344A = false;
            rtosWatchLoginUI.mo24205M7();
            int i = this.f53382d;
            if (i == 3) {
                TextView textView = this.f53383e.f53357i;
                if (textView != null) {
                    textView.setText(C0966R.string.f361626mj2);
                }
            } else if (i == 4) {
                TextView textView2 = this.f53383e.f53357i;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.f361625mj1);
                }
            } else if (i == 9) {
                TextView textView3 = this.f53383e.f53357i;
                if (textView3 != null) {
                    textView3.setText(C0966R.string.mj_);
                }
            } else if (i == 11) {
                TextView textView4 = this.f53383e.f53357i;
                if (textView4 != null) {
                    textView4.setText(C0966R.string.mj7);
                }
            } else if (i == 13) {
                TextView textView5 = this.f53383e.f53357i;
                if (textView5 != null) {
                    textView5.setText(C0966R.string.miy);
                }
            } else if (i != 15) {
                TextView textView6 = this.f53383e.f53357i;
                if (textView6 != null) {
                    textView6.setText(C0966R.string.mj6);
                }
            } else {
                TextView textView7 = this.f53383e.f53357i;
                if (textView7 != null) {
                    textView7.setText(C0966R.string.ng8);
                }
            }
            TextView textView8 = this.f53383e.f53357i;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
        }
    }

    /* renamed from: H7 */
    public static final void m20044H7(RtosWatchLoginUI rtosWatchLoginUI, C21977a aVar, int i) {
        rtosWatchLoginUI.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "switchStatusView status: " + aVar);
        switch (aVar.ordinal()) {
            case 0:
                WeImageView weImageView = rtosWatchLoginUI.f53354f;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                MMProgressLoading mMProgressLoading = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading != null) {
                    mMProgressLoading.setVisibility(0);
                }
                ProgressBar progressBar = rtosWatchLoginUI.f53358j;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                Button button = rtosWatchLoginUI.f53352d;
                if (button != null) {
                    button.setVisibility(4);
                }
                rtosWatchLoginUI.f53344A = false;
                rtosWatchLoginUI.mo24205M7();
                TextView textView = rtosWatchLoginUI.f53356h;
                if (textView != null) {
                    textView.setText(C0966R.string.mjc);
                }
                LinearLayout linearLayout = rtosWatchLoginUI.f53361p;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            case 1:
                WeImageView weImageView2 = rtosWatchLoginUI.f53354f;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                MMProgressLoading mMProgressLoading2 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading2 != null) {
                    mMProgressLoading2.setVisibility(8);
                }
                ProgressBar progressBar2 = rtosWatchLoginUI.f53358j;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                WeImageView weImageView3 = rtosWatchLoginUI.f53360o;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
                Button button2 = rtosWatchLoginUI.f53352d;
                if (button2 != null) {
                    button2.setVisibility(8);
                }
                rtosWatchLoginUI.f53344A = false;
                rtosWatchLoginUI.mo24205M7();
                TextView textView2 = rtosWatchLoginUI.f53356h;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.f361624mj0);
                }
                TextView textView3 = rtosWatchLoginUI.f53353e;
                if (textView3 != null) {
                    textView3.setText(C0966R.string.fmz);
                }
                TextView textView4 = rtosWatchLoginUI.f53353e;
                if (textView4 != null) {
                    textView4.setTextAppearance(C0966R.style.f8610op);
                }
                TextView textView5 = rtosWatchLoginUI.f53353e;
                if (textView5 != null) {
                    textView5.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                }
                TextView textView6 = rtosWatchLoginUI.f53353e;
                if (textView6 != null) {
                    textView6.setOnClickListener(new C21992q(rtosWatchLoginUI));
                }
                LinearLayout linearLayout2 = rtosWatchLoginUI.f53361p;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                WeImageView weImageView4 = rtosWatchLoginUI.f53354f;
                if (weImageView4 != null) {
                    weImageView4.setVisibility(8);
                }
                MMProgressLoading mMProgressLoading3 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading3 != null) {
                    mMProgressLoading3.setVisibility(8);
                }
                ProgressBar progressBar3 = rtosWatchLoginUI.f53358j;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
                Button button3 = rtosWatchLoginUI.f53352d;
                if (button3 != null) {
                    button3.setVisibility(4);
                }
                rtosWatchLoginUI.f53344A = false;
                rtosWatchLoginUI.mo24205M7();
                TextView textView7 = rtosWatchLoginUI.f53356h;
                if (textView7 != null) {
                    textView7.setText(C0966R.string.miz);
                }
                LinearLayout linearLayout3 = rtosWatchLoginUI.f53361p;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                return;
            case 3:
                WeImageView weImageView5 = rtosWatchLoginUI.f53354f;
                if (weImageView5 != null) {
                    weImageView5.setVisibility(8);
                }
                MMProgressLoading mMProgressLoading4 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading4 != null) {
                    mMProgressLoading4.setVisibility(8);
                }
                ProgressBar progressBar4 = rtosWatchLoginUI.f53358j;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                WeImageView weImageView6 = rtosWatchLoginUI.f53360o;
                if (weImageView6 != null) {
                    weImageView6.setVisibility(0);
                }
                Button button4 = rtosWatchLoginUI.f53352d;
                if (button4 != null) {
                    button4.setVisibility(8);
                }
                rtosWatchLoginUI.f53344A = false;
                rtosWatchLoginUI.mo24205M7();
                TextView textView8 = rtosWatchLoginUI.f53356h;
                if (textView8 != null) {
                    textView8.setText(C0966R.string.mj6);
                }
                TextView textView9 = rtosWatchLoginUI.f53353e;
                if (textView9 != null) {
                    textView9.setText(C0966R.string.fmz);
                }
                TextView textView10 = rtosWatchLoginUI.f53353e;
                if (textView10 != null) {
                    textView10.setTextAppearance(C0966R.style.f8610op);
                }
                TextView textView11 = rtosWatchLoginUI.f53353e;
                if (textView11 != null) {
                    textView11.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                }
                TextView textView12 = rtosWatchLoginUI.f53353e;
                if (textView12 != null) {
                    textView12.setOnClickListener(new C21993r(rtosWatchLoginUI));
                }
                if (i == 9) {
                    TextView textView13 = rtosWatchLoginUI.f53356h;
                    if (textView13 != null) {
                        textView13.setText(C0966R.string.mj_);
                    }
                } else if (i == 11) {
                    TextView textView14 = rtosWatchLoginUI.f53356h;
                    if (textView14 != null) {
                        textView14.setText(C0966R.string.mj7);
                    }
                } else if (i == 13) {
                    TextView textView15 = rtosWatchLoginUI.f53356h;
                    if (textView15 != null) {
                        textView15.setText(C0966R.string.miy);
                    }
                } else if (i != 14) {
                    TextView textView16 = rtosWatchLoginUI.f53356h;
                    if (textView16 != null) {
                        textView16.setText(C0966R.string.mj6);
                    }
                } else {
                    TextView textView17 = rtosWatchLoginUI.f53356h;
                    if (textView17 != null) {
                        textView17.setText(C0966R.string.n6c);
                    }
                }
                LinearLayout linearLayout4 = rtosWatchLoginUI.f53361p;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                    return;
                }
                return;
            case 4:
                WeImageView weImageView7 = rtosWatchLoginUI.f53354f;
                if (weImageView7 != null) {
                    weImageView7.setVisibility(0);
                }
                MMProgressLoading mMProgressLoading5 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading5 != null) {
                    mMProgressLoading5.setVisibility(8);
                }
                ProgressBar progressBar5 = rtosWatchLoginUI.f53358j;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(8);
                }
                Button button5 = rtosWatchLoginUI.f53352d;
                if (button5 != null) {
                    button5.setVisibility(0);
                }
                rtosWatchLoginUI.f53344A = true;
                rtosWatchLoginUI.mo24205M7();
                TextView textView18 = rtosWatchLoginUI.f53356h;
                if (textView18 != null) {
                    textView18.setText(C0966R.string.mj9);
                }
                boolean z = rtosWatchLoginUI.f53371z;
                LinearLayout linearLayout5 = rtosWatchLoginUI.f53361p;
                if (z) {
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(8);
                        return;
                    }
                    return;
                } else if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                    return;
                } else {
                    return;
                }
            case 5:
                WeImageView weImageView8 = rtosWatchLoginUI.f53354f;
                if (weImageView8 != null) {
                    weImageView8.setVisibility(0);
                }
                MMProgressLoading mMProgressLoading6 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading6 != null) {
                    mMProgressLoading6.setVisibility(8);
                }
                ProgressBar progressBar6 = rtosWatchLoginUI.f53358j;
                if (progressBar6 != null) {
                    progressBar6.setVisibility(8);
                }
                Button button6 = rtosWatchLoginUI.f53352d;
                if (button6 != null) {
                    button6.setVisibility(0);
                }
                rtosWatchLoginUI.f53344A = true;
                rtosWatchLoginUI.mo24205M7();
                TextView textView19 = rtosWatchLoginUI.f53356h;
                if (textView19 != null) {
                    textView19.setText(C0966R.string.mj9);
                    return;
                }
                return;
            case 6:
                WeImageView weImageView9 = rtosWatchLoginUI.f53354f;
                if (weImageView9 != null) {
                    weImageView9.setVisibility(0);
                }
                MMProgressLoading mMProgressLoading7 = rtosWatchLoginUI.f53359n;
                if (mMProgressLoading7 != null) {
                    mMProgressLoading7.setVisibility(8);
                }
                ProgressBar progressBar7 = rtosWatchLoginUI.f53358j;
                if (progressBar7 != null) {
                    progressBar7.setVisibility(8);
                }
                Button button7 = rtosWatchLoginUI.f53352d;
                if (button7 != null) {
                    button7.setVisibility(0);
                }
                rtosWatchLoginUI.f53344A = false;
                rtosWatchLoginUI.mo24205M7();
                TextView textView20 = rtosWatchLoginUI.f53356h;
                if (textView20 != null) {
                    textView20.setText(C0966R.string.mj9);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: I7 */
    public final void mo24201I7() {
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "cancelLogin");
        this.f53346C = true;
        this.f53369x.f60677e = 1;
        ((C32939b) C86312j.m106911c(C32939b.class)).ev0(this.f53369x);
        if (this.f53345B) {
            Bundle bundle = new Bundle();
            bundle.putInt(StateEvent.Name.ERROR_CODE, this.f53370y);
            C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, bundle, C21253l.class, new C18991a(this));
            return;
        }
        finish();
    }

    /* renamed from: J7 */
    public final void mo24202J7() {
        Class cls = C32939b.class;
        Context context = MMApplicationContext.getContext();
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_rtos_account", 0);
        String str = null;
        String string = sharedPreferences != null ? sharedPreferences.getString(TPDownloadProxyEnum.USER_MAC, "") : null;
        if (sharedPreferences != null) {
            str = sharedPreferences.getString("username", "");
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "checkMac store:" + string + " -- scan: " + this.f53364s + " username:" + str);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(string)) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "immediately startRtosService");
            this.f53348E = false;
            ((C32939b) C86312j.m106911c(cls)).mo33897hM(this.f53350G);
            return;
        }
        String str2 = this.f53364s;
        if (str2 != null && C112551y.m153809i(str2, string, true)) {
            z = true;
        }
        if (z) {
            this.f53351H.sendEmptyMessage(1006);
            mo24204L7();
            this.f53351H.postUI(new C18992b(this));
            this.f53369x.f60676d = this.f53370y;
            ((C32939b) C86312j.m106911c(cls)).ev0(this.f53369x);
            C115669n.INSTANCE.mo175911u(1904, this.f53370y);
            this.f53351H.postUIDelayed(new C18993c(this), 300);
            return;
        }
        this.f53370y = 11;
        Message message = new Message();
        message.what = 1004;
        message.arg1 = this.f53370y;
        this.f53351H.sendMessage(message);
    }

    /* renamed from: K7 */
    public final void mo24203K7(int i, int i2) {
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "onGetTicketFailEvent");
        Bundle bundle = new Bundle();
        bundle.putInt("error_type", i);
        bundle.putInt(StateEvent.Name.ERROR_CODE, i2);
        C80907o.m98783f(WeChatProcess.PROCESS_EXDEVICE, bundle, C21259v.class);
    }

    /* renamed from: L7 */
    public final void mo24204L7() {
        this.f53351H.postUI(new C19000j(this));
    }

    /* renamed from: M7 */
    public final void mo24205M7() {
        Button button = this.f53352d;
        if (button != null) {
            button.setEnabled(this.f53344A && this.f53371z);
        }
    }

    /* renamed from: N7 */
    public final void mo24206N7(int i) {
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "updateViewWhenError " + i);
        this.f53351H.postUI(new C21983h(this));
        this.f53369x.f60676d = i;
        this.f53351H.postUI(new C19001k(i, this));
    }

    public void finish() {
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "finish");
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cwb;
    }

    public void onBackPressed() {
        mo24201I7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "onCreate");
        setActionbarColor(getResources().getColor(C0966R.color.aku));
        setMMTitle((int) C0966R.string.mj5);
        setBackBtn(new C18995e(this), C0966R.raw.actionbar_icon_close_black);
        this.f53364s = getIntent().getStringExtra(TPDownloadProxyEnum.USER_MAC);
        this.f53365t = getIntent().getStringExtra("native_ver");
        this.f53366u = getIntent().getStringExtra("jsapp_ver");
        this.f53367v = getIntent().getStringExtra("channel_type");
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "native_ver:" + this.f53365t + "  jsapp_ver:" + this.f53366u + " channel_type:" + this.f53367v);
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        this.f53371z = ((Boolean) f).booleanValue();
        this.f53368w = getIntent().getStringExtra("avatar");
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.k1a);
        this.f53354f = weImageView;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.rtos_connect_watch);
        }
        this.f53356h = (TextView) findViewById(C0966R.C0970id.k1f);
        this.f53357i = (TextView) findViewById(C0966R.C0970id.k18);
        this.f53358j = (ProgressBar) findViewById(C0966R.C0970id.n4a);
        this.f53359n = (MMProgressLoading) findViewById(C0966R.C0970id.n4b);
        this.f53360o = (WeImageView) findViewById(C0966R.C0970id.n4c);
        this.f53361p = (LinearLayout) findViewById(C0966R.C0970id.kh7);
        CheckBox checkBox = (CheckBox) findViewById(C0966R.C0970id.ik5);
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new C18996f(this));
        }
        this.f53362q = (TextView) findViewById(C0966R.C0970id.ik4);
        LocaleUtil.getCurrentCountryCode();
        String string = getString(C0966R.string.g59);
        C87412m.m108593f(string, "getString(com.tencent.mm…t.R.string.license_agree)");
        String string2 = getString(C0966R.string.f361627mj3);
        C87412m.m108593f(string2, "getString(R.string.watch_license_detail)");
        String string3 = getString(C0966R.string.mix);
        C87412m.m108593f(string3, "getString(R.string.watch_and)");
        String string4 = getString(C0966R.string.mja);
        C87412m.m108593f(string4, "getString(R.string.watch_privacy_detail)");
        String str = string + string2 + string3 + string4;
        C75365k kVar = new C75365k(str, string.length(), string.length() + string2.length());
        C8479f0 f0Var = new C8479f0();
        T obj = C86709a0.m107535s().mo121142i().mo119684e(274436, "").toString();
        f0Var.f27484d = obj;
        if (Util.isNullOrNil((String) obj)) {
            f0Var.f27484d = LocaleUtil.getCurrentCountryCode();
        }
        if (!Util.isNullOrNil((String) f0Var.f27484d) && !Util.isAllAlpha((String) f0Var.f27484d)) {
            f0Var.f27484d = "";
        }
        kVar.f221580f = new C77106i(this, f0Var);
        C75365k kVar2 = new C75365k(str, string.length() + string2.length() + 1, str.length());
        kVar2.f221580f = new C77107j(this, f0Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        C76978g gVar = (C76978g) C86312j.m106911c(C76978g.class);
        if (gVar != null) {
            gVar.T90(this.f53362q, str, arrayList);
        }
        this.f53355g = (TextView) findViewById(C0966R.C0970id.hft);
        Button button = (Button) findViewById(C0966R.C0970id.g5o);
        this.f53352d = button;
        if (button != null) {
            button.setOnClickListener(new C18997g(this));
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.luv);
        this.f53353e = textView;
        if (textView != null) {
            textView.setOnClickListener(new C18998h(this));
        }
        this.f53344A = false;
        mo24205M7();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        this.f53349F.alive();
        C86709a0.m107529k().f251779b.mo123455a(9076, this);
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "send message 1001");
        this.f53351H.sendEmptyMessage(1001);
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "startCheckSoRes");
        ((C32939b) C86312j.m106911c(C32939b.class)).mo33900qX(new C21990o(this));
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "onDestroy");
        this.f53349F.dead();
        C86709a0.m107529k().f251779b.mo123470p(9076, this);
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "onRequestPermissionsResult " + iArr[0]);
        if (i != 8848) {
            return;
        }
        if (iArr[0] == 0) {
            mo24202J7();
            return;
        }
        Log.m105920e("MicroMsg.Rtos.RtosWatchLoginUI", "request bluetooth permission fail");
        this.f53370y = 14;
        Message message = new Message();
        message.what = 1004;
        message.arg1 = this.f53370y;
        this.f53351H.sendMessage(message);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        r4 = r4.f145073d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
        /*
            r3 = this;
            boolean r0 = r7 instanceof kk2.C46731b
            java.lang.String r1 = "MicroMsg.Rtos.RtosWatchLoginUI"
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "errType:"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ", errCode:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = ", errMsg:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            r6 = 7
            if (r4 != 0) goto L_0x00bf
            if (r5 != 0) goto L_0x00bf
            kk2.b r7 = (kk2.C46731b) r7
            te3.y12 r0 = r7.mo71965j1()
            if (r0 != 0) goto L_0x0049
            java.lang.String r7 = "ticketScene.getResp() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r7)
            r3.f53370y = r6
            r3.mo24203K7(r4, r5)
            int r4 = r3.f53370y
            r3.mo24206N7(r4)
            goto L_0x00ec
        L_0x0049:
            te3.y12 r4 = r7.mo71965j1()
            r5 = 0
            if (r4 == 0) goto L_0x0059
            pe3.b r4 = r4.f145073d
            if (r4 == 0) goto L_0x0059
            byte[] r4 = r4.mo123703f()
            goto L_0x005a
        L_0x0059:
            r4 = r5
        L_0x005a:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r7 = z04.C119027c.f356488a
            r5.<init>(r4, r7)
        L_0x0063:
            f40.e r4 = f40.C86709a0.m107523b()
            java.lang.String r4 = r4.mo121112j()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "rtosLogin "
            r7.append(r0)
            r7.append(r5)
            r0 = 32
            r7.append(r0)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x00b3
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x0095
            goto L_0x00b3
        L_0x0095:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "username"
            r6.putString(r7, r4)
            java.lang.String r4 = "ticket"
            r6.putString(r4, r5)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_EXDEVICE
            java.lang.Class<jk2.n> r5 = jk2.C21254n.class
            pk2.l r7 = new pk2.l
            r7.<init>(r3)
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r4, r6, r5, r7)
            goto L_0x00ec
        L_0x00b3:
            java.lang.String r4 = "username or ticket is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            r3.f53370y = r6
            r3.mo24206N7(r6)
            goto L_0x00ec
        L_0x00bf:
            r7 = -2047(0xfffffffffffff801, float:NaN)
            if (r5 != r7) goto L_0x00d6
            java.lang.String r6 = "second device login no allow"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            r6 = 15
            r3.f53370y = r6
            r3.mo24203K7(r4, r5)
            int r4 = r3.f53370y
            r3.mo24206N7(r4)
            goto L_0x00ec
        L_0x00d6:
            java.lang.String r7 = "Get Ticket Fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r7)
            r3.f53370y = r6
            r3.mo24203K7(r4, r5)
            int r4 = r3.f53370y
            r3.mo24206N7(r4)
            goto L_0x00ec
        L_0x00e6:
            java.lang.String r4 = "onSceneEnd no NetSceneGetIlinkDeviceOauthTicket"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
