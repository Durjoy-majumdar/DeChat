package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.widget.SOSEditTextView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C72603r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statemachine.IState;
import com.tencent.p014mm.sdk.statemachine.LogStateTransitionState;
import com.tencent.p014mm.sdk.statemachine.State;
import com.tencent.p014mm.sdk.statemachine.StateMachine;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import p1136n3.C109678b;
import p182kk.C61104a;
import p206nj.C11171e;
import p206nj.C88956h;
import p232rw.C77572l;
import p447aw.C103918d;
import p646pn.C110234e;
import sv1.C13788c;
import t83.C13851h1;
import t83.C48580e0;
import t83.C48582f0;
import t83.C48589k0;
import t83.C48590l;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI */
public class FTSSOSHomeWebViewUI extends BaseSOSWebViewUI implements C7020t0, FTSEditTextView.C45049j {

    /* renamed from: v4 */
    public static final /* synthetic */ int f118980v4 = 0;

    /* renamed from: I3 */
    public View f118981I3;

    /* renamed from: J3 */
    public WebViewKeyboardLinearLayout f118982J3;

    /* renamed from: K3 */
    public View f118983K3;

    /* renamed from: L3 */
    public ImageView f118984L3;

    /* renamed from: M3 */
    public View f118985M3;

    /* renamed from: N3 */
    public View f118986N3;

    /* renamed from: O3 */
    public TextView f118987O3;

    /* renamed from: P3 */
    public C72615v f118988P3;

    /* renamed from: Q3 */
    public C72618y f118989Q3;

    /* renamed from: R3 */
    public C72619z f118990R3;

    /* renamed from: S3 */
    public float f118991S3 = 0.0f;

    /* renamed from: T3 */
    public float f118992T3 = 0.0f;

    /* renamed from: U3 */
    public View f118993U3;

    /* renamed from: V3 */
    public View f118994V3;

    /* renamed from: W3 */
    public View f118995W3;

    /* renamed from: X3 */
    public KeyboardHeightProvider f118996X3;

    /* renamed from: Y3 */
    public C43942u f118997Y3;

    /* renamed from: Z3 */
    public int f118998Z3;

    /* renamed from: a4 */
    public int f118999a4 = 0;

    /* renamed from: b4 */
    public String f119000b4 = "";

    /* renamed from: c4 */
    public String f119001c4;

    /* renamed from: d4 */
    public boolean f119002d4;

    /* renamed from: e4 */
    public int f119003e4;

    /* renamed from: f4 */
    public View f119004f4;

    /* renamed from: g4 */
    public int f119005g4 = 0;

    /* renamed from: h4 */
    public String f119006h4 = "";

    /* renamed from: i4 */
    public boolean f119007i4;

    /* renamed from: j4 */
    public C43941t f119008j4 = C43941t.None;

    /* renamed from: k4 */
    public C43941t f119009k4 = C43941t.Back;

    /* renamed from: l4 */
    public boolean f119010l4 = false;

    /* renamed from: m4 */
    public boolean f119011m4 = false;

    /* renamed from: n4 */
    public boolean f119012n4 = false;

    /* renamed from: o4 */
    public boolean f119013o4 = true;

    /* renamed from: p4 */
    public final MMHandler f119014p4 = new C43929h();

    /* renamed from: q4 */
    public ObjectAnimator f119015q4 = null;

    /* renamed from: r4 */
    public C72603r.C72611h f119016r4 = new C43925d();

    /* renamed from: s4 */
    public C72603r.C72611h f119017s4 = new C43926e();

    /* renamed from: t4 */
    public C72603r.C72611h f119018t4 = new C43927f();

    /* renamed from: u4 */
    public View.OnClickListener f119019u4 = new C43930i();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$a */
    public class C6164a implements ValueAnimator.AnimatorUpdateListener {
        public C6164a(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onAnimationUpdate %s", Float.valueOf(((Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$b */
    public class C43923b implements Runnable {
        public C43923b() {
        }

        public void run() {
            if (FTSSOSHomeWebViewUI.this.f118808q3.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.f119005g4 = ((RelativeLayout.LayoutParams) fTSSOSHomeWebViewUI.f118808q3.getLayoutParams()).topMargin;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$c */
    public class C43924c implements Runnable {
        public C43924c() {
        }

        public void run() {
            FTSSOSHomeWebViewUI.this.mo68525wa();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$d */
    public class C43925d implements C72603r.C72611h {
        public C43925d() {
        }

        public void onAnimationEnd() {
            FTSSOSHomeWebViewUI.this.f118997Y3.sendMessage(4);
            FTSSOSHomeWebViewUI.m48125ra(FTSSOSHomeWebViewUI.this);
        }

        public void onAnimationStart() {
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            fTSSOSHomeWebViewUI.f118999a4++;
            fTSSOSHomeWebViewUI.mo68520Ja(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$e */
    public class C43926e implements C72603r.C72611h {
        public C43926e() {
        }

        public void onAnimationEnd() {
            FTSSOSHomeWebViewUI.this.f118997Y3.sendMessage(9);
            FTSSOSHomeWebViewUI.m48125ra(FTSSOSHomeWebViewUI.this);
        }

        public void onAnimationStart() {
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            fTSSOSHomeWebViewUI.f118999a4++;
            fTSSOSHomeWebViewUI.mo68520Ja(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$f */
    public class C43927f implements C72603r.C72611h {
        public C43927f() {
        }

        public void onAnimationEnd() {
            FTSSOSHomeWebViewUI.this.f118997Y3.sendMessage(3);
            FTSSOSHomeWebViewUI.m48125ra(FTSSOSHomeWebViewUI.this);
        }

        public void onAnimationStart() {
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            fTSSOSHomeWebViewUI.f118999a4++;
            fTSSOSHomeWebViewUI.mo68520Ja(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$g */
    public class C43928g implements Runnable {
        public C43928g() {
        }

        public void run() {
            FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
            FTSSOSHomeWebViewUI.this.f118812u3.mo70355k();
            FTSSOSHomeWebViewUI.this.f118812u3.mo70361q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$h */
    public class C43929h extends MMHandler {
        public C43929h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                int i = FTSSOSHomeWebViewUI.f118980v4;
                fTSSOSHomeWebViewUI.mo68528za("2");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$i */
    public class C43930i implements View.OnClickListener {
        public C43930i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            int i = FTSSOSHomeWebViewUI.f118980v4;
            fTSSOSHomeWebViewUI.mo68526xa();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$j */
    public class C43931j implements SOSEditTextView.C43474c {
        public C43931j() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$k */
    public class C43932k implements Runnable {
        public C43932k() {
        }

        public void run() {
            View view = FTSSOSHomeWebViewUI.this.f118810s3;
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.rightMargin = Math.max((int) FTSSOSHomeWebViewUI.this.getResources().getDimension(C0966R.dimen.f3761db), FTSSOSHomeWebViewUI.this.f118812u3.getCancelTextView().getWidth());
                layoutParams.leftMargin = (int) FTSSOSHomeWebViewUI.this.getResources().getDimension(C0966R.dimen.f3736cp);
                FTSSOSHomeWebViewUI.this.f118810s3.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$l */
    public class C43933l implements KeyboardLinearLayout.C44683b {
        public C43933l() {
        }

        /* renamed from: a */
        public void mo67991a(int i) {
            if (i == -2) {
                FTSSOSHomeWebViewUI.this.f118997Y3.sendMessage(12);
            }
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            int i2 = FTSSOSHomeWebViewUI.f118980v4;
            fTSSOSHomeWebViewUI.f118585z2 = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$m */
    public class C43934m implements View.OnTouchListener {
        public C43934m() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
            FTSSOSHomeWebViewUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$n */
    public class C43935n implements Runnable {
        public C43935n() {
        }

        public void run() {
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            fTSSOSHomeWebViewUI.f118991S3 = fTSSOSHomeWebViewUI.f118808q3.getX();
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = FTSSOSHomeWebViewUI.this;
            fTSSOSHomeWebViewUI2.f118992T3 = fTSSOSHomeWebViewUI2.f118808q3.getY();
            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getSearchInputLayout originInputX=%s originInputY=%s", Float.valueOf(FTSSOSHomeWebViewUI.this.f118991S3), Float.valueOf(FTSSOSHomeWebViewUI.this.f118992T3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$p */
    public class C43936p implements View.OnClickListener {
        public C43936p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(FTSSOSHomeWebViewUI.this.f118884c3)) {
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.f118894m3.put(SearchIntents.EXTRA_QUERY, fTSSOSHomeWebViewUI.f118884c3);
            } else {
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI2.f118894m3.put(SearchIntents.EXTRA_QUERY, fTSSOSHomeWebViewUI2.mo68436da());
            }
            FTSSOSHomeWebViewUI.this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            FTSSOSHomeWebViewUI.this.mo68444la();
            FTSSOSHomeWebViewUI.this.mo68477V9();
            FTSSOSHomeWebViewUI.this.mo68528za(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$q */
    public class C43937q implements View.OnClickListener {
        public C43937q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            if (fTSSOSHomeWebViewUI.f118803D3) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SOSEditTextView sOSEditTextView = fTSSOSHomeWebViewUI.f118812u3;
            if (sOSEditTextView != null) {
                sOSEditTextView.mo70355k();
                FTSSOSHomeWebViewUI.this.f118812u3.mo70360p();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$r */
    public class C43938r implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$r$a */
        public class C43939a implements Runnable {
            public C43939a() {
            }

            public void run() {
                FTSSOSHomeWebViewUI.m48127ta(FTSSOSHomeWebViewUI.this);
            }
        }

        public C43938r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            int i = FTSSOSHomeWebViewUI.f118980v4;
            if (fTSSOSHomeWebViewUI.f118585z2 == -3) {
                fTSSOSHomeWebViewUI.hideVKB();
                FTSSOSHomeWebViewUI.this.f118995W3.postDelayed(new C43939a(), 300);
            } else {
                FTSSOSHomeWebViewUI.m48127ta(fTSSOSHomeWebViewUI);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$s */
    public class C43940s implements Runnable {
        public C43940s() {
        }

        public void run() {
            String str;
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            String str2 = fTSSOSHomeWebViewUI.f119059J2;
            String str3 = fTSSOSHomeWebViewUI.f119000b4;
            int i = fTSSOSHomeWebViewUI.f118880Y2;
            String str4 = "";
            String str5 = (fTSSOSHomeWebViewUI.f118812u3.getClearBtn() == null || fTSSOSHomeWebViewUI.f118812u3.getClearBtn().getVisibility() != 0) ? str4 : "1";
            ImageView imageView = fTSSOSHomeWebViewUI.f118817z3;
            if (imageView != null && imageView.getVisibility() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(Util.isNullOrNil(str5) ? str4 : "#");
                sb.append("2");
                str5 = sb.toString();
            }
            if (fTSSOSHomeWebViewUI.f118812u3.getSearchDone() != null && fTSSOSHomeWebViewUI.f118812u3.getSearchDone().getVisibility() == 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str5);
                sb4.append(Util.isNullOrNil(str5) ? str4 : "#");
                sb4.append("3");
                str5 = sb4.toString();
            }
            TextView textView = fTSSOSHomeWebViewUI.f118987O3;
            if (textView != null && textView.getVisibility() == 0) {
                Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getFeatureInfo, show hide searchtitle.");
            } else if (fTSSOSHomeWebViewUI.f118812u3.getSearchBarCancelTextContainer() != null && fTSSOSHomeWebViewUI.f118812u3.getSearchBarCancelTextContainer().getVisibility() == 0 && fTSSOSHomeWebViewUI.f118812u3.getCancelTextView() != null && fTSSOSHomeWebViewUI.f118812u3.getCancelTextView().getVisibility() == 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                if (!Util.isNullOrNil(str5)) {
                    str4 = "#";
                }
                sb5.append(str4);
                sb5.append(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
                str = sb5.toString();
                BaseSOSWebViewUI.m48042ba(str2, str3, "", 2, i, 1, str, 0, "");
            }
            str = str5;
            BaseSOSWebViewUI.m48042ba(str2, str3, "", 2, i, 1, str, 0, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$t */
    public enum C43941t {
        Back,
        cancel,
        None
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u */
    public class C43942u extends StateMachine {

        /* renamed from: d */
        public State f119042d = new C43943a((C43929h) null);

        /* renamed from: e */
        public State f119043e = new C43947d((C43929h) null);

        /* renamed from: f */
        public State f119044f = new C43945b((C43929h) null);

        /* renamed from: g */
        public State f119045g = new C43946c((C43929h) null);

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u$a */
        public class C43943a extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u$a$a */
            public class C43944a implements Runnable {
                public C43944a() {
                }

                public void run() {
                    C48590l lVar = FTSSOSHomeWebViewUI.this.f118508Z;
                    if (!lVar.f130003h) {
                        Log.m105920e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, not ready");
                        return;
                    }
                    Log.m105924i("MicroMsg.JsApiHandler", "onFocusSearchInput success, ready");
                    MMHandlerThread.postToMainThread(new C48589k0(lVar, C13851h1.C13852a.m13143c("onFocusSearchInput", (Map<String, Object>) null, lVar.f130011p, lVar.f130012q)));
                }
            }

            public C43943a(C43929h hVar) {
            }

            public void enter() {
                super.enter();
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "setInitStatus originInputX:%f, currentInputX:%f isPageLoadFinish:%b isWebViewPreloaded:%b", Float.valueOf(fTSSOSHomeWebViewUI.f118991S3), Float.valueOf(fTSSOSHomeWebViewUI.f118808q3.getX()), Boolean.valueOf(fTSSOSHomeWebViewUI.f118806G3), Boolean.valueOf(fTSSOSHomeWebViewUI.f119058I2));
                float f = fTSSOSHomeWebViewUI.f118991S3;
                if (f > 0.0f) {
                    fTSSOSHomeWebViewUI.f118808q3.setX(f);
                }
                float f2 = fTSSOSHomeWebViewUI.f118992T3;
                if (f2 > 0.0f) {
                    fTSSOSHomeWebViewUI.f118808q3.setY(f2);
                }
                View view = fTSSOSHomeWebViewUI.f118808q3;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fTSSOSHomeWebViewUI.f118994V3.setBackgroundColor(fTSSOSHomeWebViewUI.getResources().getColor(C0966R.color.akk));
                View view3 = fTSSOSHomeWebViewUI.f118981I3;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fTSSOSHomeWebViewUI.mo68518Ha(8);
                if (C11171e.m11046c(23) && !MIUI.isMIUIV8()) {
                    fTSSOSHomeWebViewUI.mo68302p9(fTSSOSHomeWebViewUI.getResources().getColor(C0966R.color.akk), !C85875k4.m106211z());
                }
                fTSSOSHomeWebViewUI.f118812u3.setClearBtnVisable(8);
                fTSSOSHomeWebViewUI.f118812u3.mo70338f();
                fTSSOSHomeWebViewUI.f118808q3.setPadding(0, 0, 0, 0);
                fTSSOSHomeWebViewUI.f118883b3 = 0;
                fTSSOSHomeWebViewUI.f119006h4 = "";
                fTSSOSHomeWebViewUI.mo68447oa();
                fTSSOSHomeWebViewUI.f118812u3.mo70335c();
                fTSSOSHomeWebViewUI.f118812u3.setHint(fTSSOSHomeWebViewUI.mo68435ca());
                fTSSOSHomeWebViewUI.f118812u3.setSearchBarCancelTextContainerVisibile(8);
                fTSSOSHomeWebViewUI.f118812u3.setCommonRightImageButtonVisibile(0);
                fTSSOSHomeWebViewUI.mo68514Da(8);
                MMWebView mMWebView = fTSSOSHomeWebViewUI.f118523f;
                if (mMWebView != null) {
                    View view5 = mMWebView.getView();
                    view5.setOnTouchListener(new C43967h(fTSSOSHomeWebViewUI, view5));
                }
                fTSSOSHomeWebViewUI.mo68520Ja(true);
            }

            public void exit() {
                super.exit();
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.f118994V3.setBackgroundColor(fTSSOSHomeWebViewUI.getResources().getColor(C0966R.color.ahf));
            }

            public String getName() {
                return "InitSate";
            }

            public boolean processMessage(Message message) {
                C72603r.C43975i iVar = C72603r.C43975i.Search;
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                        FTSSOSHomeWebViewUI.this.f118989Q3.mo100045a(iVar);
                        FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                        FTSSOSHomeWebViewUI.this.f118808q3.setBackgroundResource(C0966R.color.al6);
                    } else if (i == 3) {
                        C43942u uVar = C43942u.this;
                        FTSSOSHomeWebViewUI.this.f118804E3 = true;
                        uVar.transitionTo(uVar.f119043e);
                    } else if (i == 4) {
                        C43942u uVar2 = C43942u.this;
                        FTSSOSHomeWebViewUI.this.f118804E3 = true;
                        uVar2.transitionTo(uVar2.f119044f);
                    } else if (i != 5) {
                        if (i != 13) {
                            if (i == 14) {
                                FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                                FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
                                FTSSOSHomeWebViewUI.this.f118988P3.mo100036a(iVar, false);
                                FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                                FTSSOSHomeWebViewUI.this.f118808q3.setBackgroundResource(C0966R.color.al6);
                                C43942u uVar3 = C43942u.this;
                                uVar3.transitionTo(uVar3.f119044f);
                                FTSSOSHomeWebViewUI.this.f118804E3 = true;
                            }
                        }
                    } else if (FTSSOSHomeWebViewUI.this.f118812u3.getEditText().hasFocus() && FTSSOSHomeWebViewUI.this.mo68440ha().length() == 0) {
                        FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                        FTSSOSHomeWebViewUI.this.f118808q3.setBackgroundResource(C0966R.color.al6);
                        FTSSOSHomeWebViewUI.this.f118812u3.setSearchBarCancelTextContainerVisibile(8);
                        FTSSOSHomeWebViewUI.this.f118989Q3.mo100045a(iVar);
                        FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                        FTSSOSHomeWebViewUI.this.mo68549J9(new C43944a());
                        C115669n.INSTANCE.mo160131h(15521, Integer.valueOf(FTSSOSHomeWebViewUI.this.f118880Y2), 3, FTSSOSHomeWebViewUI.this.f118812u3.getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.this.f118883b3));
                    }
                    return super.processMessage(message);
                }
                Log.m105925i(LogStateTransitionState.TAG, "InitState processMessage = %d.", Integer.valueOf(i));
                if (FTSSOSHomeWebViewUI.this.mo68440ha().length() > 0) {
                    FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
                    FTSSOSHomeWebViewUI.this.f118988P3.mo100036a(iVar, true);
                    FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                    FTSSOSHomeWebViewUI.this.f118808q3.setBackgroundResource(C0966R.color.al6);
                }
                return super.processMessage(message);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u$b */
        public class C43945b extends LogStateTransitionState {
            public C43945b(C43929h hVar) {
            }

            public void enter() {
                super.enter();
                FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, C72603r.C43975i.Search);
                FTSSOSHomeWebViewUI.this.f118808q3.setBackgroundResource(C0966R.color.al6);
                FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
                FTSSOSHomeWebViewUI.this.mo68478X9();
                FTSSOSHomeWebViewUI.this.mo68520Ja(true);
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.f118808q3.setPadding(fTSSOSHomeWebViewUI.f118998Z3, 0, 0, 0);
                View view = FTSSOSHomeWebViewUI.this.f118993U3;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                FTSSOSHomeWebViewUI.this.f118812u3.setSearchBarCancelTextContainerVisibile(0);
                FTSSOSHomeWebViewUI.this.f118812u3.setCommonRightImageButtonVisibile(0);
                FTSSOSHomeWebViewUI.this.mo68514Da(8);
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = FTSSOSHomeWebViewUI.this;
                if (!fTSSOSHomeWebViewUI2.f118803D3) {
                    fTSSOSHomeWebViewUI2.f118812u3.mo70338f();
                } else {
                    SOSEditTextView sOSEditTextView = fTSSOSHomeWebViewUI2.f118812u3;
                    if (sOSEditTextView.f122169u) {
                        sOSEditTextView.f122155d.setVisibility(8);
                    } else {
                        sOSEditTextView.f122155d.setVisibility(0);
                    }
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI3 = FTSSOSHomeWebViewUI.this;
                    fTSSOSHomeWebViewUI3.f118812u3.setPadding((int) fTSSOSHomeWebViewUI3.getResources().getDimension(C0966R.dimen.f3766df), 0, 0, 0);
                }
                FTSSOSHomeWebViewUI.this.mo68518Ha(0);
                if (C11171e.m11046c(23) && !MIUI.isMIUIV8()) {
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI4 = FTSSOSHomeWebViewUI.this;
                    fTSSOSHomeWebViewUI4.mo68302p9(fTSSOSHomeWebViewUI4.getResources().getColor(C0966R.color.al6), true ^ C85875k4.m106211z());
                }
                View view3 = FTSSOSHomeWebViewUI.this.f118981I3;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FTSSOSHomeWebViewUI.this.f118808q3.getLayoutParams();
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI5 = FTSSOSHomeWebViewUI.this;
                if (fTSSOSHomeWebViewUI5.f118813v3) {
                    layoutParams.topMargin = 0;
                }
                layoutParams.width = -1;
                fTSSOSHomeWebViewUI5.f118808q3.setLayoutParams(layoutParams);
                FTSSOSHomeWebViewUI.this.f118808q3.setY(0.0f);
                FTSSOSHomeWebViewUI.this.f118808q3.setX(0.0f);
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI6 = FTSSOSHomeWebViewUI.this;
                if (fTSSOSHomeWebViewUI6.f118813v3) {
                    fTSSOSHomeWebViewUI6.f118981I3.setTranslationX(0.0f);
                    FTSSOSHomeWebViewUI.this.f118981I3.setTranslationY(0.0f);
                    FTSSOSHomeWebViewUI.this.f118808q3.setTranslationX(0.0f);
                    FTSSOSHomeWebViewUI.this.f118808q3.setTranslationY(0.0f);
                }
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI7 = FTSSOSHomeWebViewUI.this;
                if (fTSSOSHomeWebViewUI7.f118813v3 && fTSSOSHomeWebViewUI7.f119002d4) {
                    View view5 = fTSSOSHomeWebViewUI7.f118808q3;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view7 = FTSSOSHomeWebViewUI.this.f118981I3;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(Float.valueOf(1.0f));
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view7.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    View view9 = FTSSOSHomeWebViewUI.this.f118993U3;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view11 = FTSSOSHomeWebViewUI.this.f118981I3;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (FTSSOSHomeWebViewUI.this.getIntent() != null && FTSSOSHomeWebViewUI.this.getIntent().hasExtra("customize_status_bar_color")) {
                        FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI8 = FTSSOSHomeWebViewUI.this;
                        fTSSOSHomeWebViewUI8.f118994V3.setBackgroundColor(fTSSOSHomeWebViewUI8.f118552p1);
                        if (FTSSOSHomeWebViewUI.this.getIntent().hasExtra("status_bar_style")) {
                            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI9 = FTSSOSHomeWebViewUI.this;
                            fTSSOSHomeWebViewUI9.mo68302p9(fTSSOSHomeWebViewUI9.f118552p1, "black".equals(fTSSOSHomeWebViewUI9.f118555q1));
                        }
                    }
                    FTSSOSHomeWebViewUI.this.f118987O3.setVisibility(0);
                    String stringExtra = FTSSOSHomeWebViewUI.this.getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    if (Util.isNullOrNil(stringExtra)) {
                        stringExtra = FTSSOSHomeWebViewUI.this.getString(C0966R.string.cwg);
                    }
                    FTSSOSHomeWebViewUI.this.f118987O3.setText(stringExtra);
                }
                FTSSOSHomeWebViewUI.this.mo68477V9();
            }

            public void exit() {
                super.exit();
            }

            public String getName() {
                return "SearchNoFocusState";
            }

            public boolean processMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    Log.m105924i(LogStateTransitionState.TAG, "SearchNoFocusState processMessage = MSG_SEARCH_KEY_DOWN.");
                    FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                } else if (i == 2) {
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                    if (!fTSSOSHomeWebViewUI.f118813v3) {
                        C72615v vVar = fTSSOSHomeWebViewUI.f118988P3;
                        C72603r.C43975i iVar = C72603r.C43975i.Init;
                        vVar.mo100036a(iVar, true);
                        FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                    } else {
                        fTSSOSHomeWebViewUI.finish();
                    }
                } else if (i == 3 || i == 4) {
                    C43942u uVar = C43942u.this;
                    uVar.transitionTo(uVar.f119042d);
                } else if (i == 5 && FTSSOSHomeWebViewUI.this.f118812u3.getEditText().hasFocus()) {
                    C43942u uVar2 = C43942u.this;
                    uVar2.transitionTo(uVar2.f119043e);
                    C115669n.INSTANCE.mo160131h(15521, Integer.valueOf(FTSSOSHomeWebViewUI.this.f118880Y2), 2, FTSSOSHomeWebViewUI.this.f118812u3.getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.this.f118883b3));
                }
                return super.processMessage(message);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u$c */
        public class C43946c extends LogStateTransitionState {
            public C43946c(C43929h hVar) {
            }

            public void enter() {
                super.enter();
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI.f118808q3.setPadding(fTSSOSHomeWebViewUI.f118998Z3, 0, 0, 0);
                FTSSOSHomeWebViewUI.this.f118808q3.setX(0.0f);
                FTSSOSHomeWebViewUI.this.f118808q3.setY(0.0f);
                FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                View view = FTSSOSHomeWebViewUI.this.f118993U3;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                FTSSOSHomeWebViewUI.this.mo68518Ha(0);
                FTSSOSHomeWebViewUI.this.f118812u3.setSearchBarCancelTextContainerVisibile(0);
                FTSSOSHomeWebViewUI.this.f118812u3.setCommonRightImageButtonVisibile(0);
                FTSSOSHomeWebViewUI.this.mo68514Da(8);
            }

            public void exit() {
                super.exit();
                FTSSOSHomeWebViewUI.this.mo68478X9();
            }

            public String getName() {
                return "SearchWithFocusNoResultState";
            }

            public boolean processMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    Log.m105924i(LogStateTransitionState.TAG, "SearchWithFocusState processMessage = MSG_SEARCH_KEY_DOWN.");
                    if (FTSSOSHomeWebViewUI.this.mo68440ha().length() > 0) {
                        FTSSOSHomeWebViewUI.this.f118812u3.mo70337e();
                        FTSSOSHomeWebViewUI.this.f118812u3.mo70335c();
                        C43942u uVar = C43942u.this;
                        uVar.transitionTo(uVar.f119044f);
                    }
                } else if (i == 2) {
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                    if (!fTSSOSHomeWebViewUI.f118813v3) {
                        C72619z zVar = fTSSOSHomeWebViewUI.f118990R3;
                        C72603r.C43975i iVar = C72603r.C43975i.Init;
                        if (iVar != zVar.f211238q) {
                            zVar.mo100046a();
                            zVar.f211238q = iVar;
                        }
                        FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                    } else {
                        fTSSOSHomeWebViewUI.finish();
                    }
                } else if (i != 5) {
                    if (i == 9) {
                        C43942u uVar2 = C43942u.this;
                        uVar2.transitionTo(uVar2.f119042d);
                    } else if (i == 10 && FTSSOSHomeWebViewUI.this.mo68440ha().length() > 0) {
                        C43942u uVar3 = C43942u.this;
                        uVar3.transitionTo(uVar3.f119044f);
                    }
                } else if (FTSSOSHomeWebViewUI.this.f118812u3.getEditText().hasFocus()) {
                    C43942u uVar4 = C43942u.this;
                    uVar4.transitionTo(uVar4.f119043e);
                    C115669n.INSTANCE.mo160131h(15521, Integer.valueOf(FTSSOSHomeWebViewUI.this.f118880Y2), 2, FTSSOSHomeWebViewUI.this.f118812u3.getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.this.f118883b3));
                }
                return super.processMessage(message);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$u$d */
        public class C43947d extends LogStateTransitionState {
            public C43947d(C43929h hVar) {
            }

            public void enter() {
                super.enter();
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                int i = FTSSOSHomeWebViewUI.f118980v4;
                fTSSOSHomeWebViewUI.mo68520Ja(true);
                FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = FTSSOSHomeWebViewUI.this;
                fTSSOSHomeWebViewUI2.f118808q3.setPadding(fTSSOSHomeWebViewUI2.f118998Z3, 0, 0, 0);
                FTSSOSHomeWebViewUI.this.f118808q3.setX(0.0f);
                FTSSOSHomeWebViewUI.this.f118808q3.setY(0.0f);
                FTSSOSHomeWebViewUI.this.f118812u3.setSearchBarCancelTextContainerVisibile(8);
                FTSSOSHomeWebViewUI.this.f118812u3.setCommonRightImageButtonVisibile(8);
                FTSSOSHomeWebViewUI.this.mo68514Da(0);
                FTSSOSHomeWebViewUI.this.mo68518Ha(0);
                if (!FTSSOSHomeWebViewUI.this.f118812u3.mo70354j()) {
                    FTSSOSHomeWebViewUI.this.f118812u3.mo70355k();
                    FTSSOSHomeWebViewUI.this.showVKB();
                }
                if (C11171e.m11046c(23) && !MIUI.isMIUIV8()) {
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI3 = FTSSOSHomeWebViewUI.this;
                    fTSSOSHomeWebViewUI3.mo68302p9(fTSSOSHomeWebViewUI3.getResources().getColor(C0966R.color.al6), true ^ C85875k4.m106211z());
                }
                if (!TextUtils.isEmpty(FTSSOSHomeWebViewUI.this.mo68436da())) {
                    FTSSOSHomeWebViewUI.this.f118812u3.mo70359o();
                }
            }

            public void exit() {
                super.exit();
                FTSSOSHomeWebViewUI.this.mo68478X9();
                FTSSOSHomeWebViewUI.this.mo68514Da(8);
            }

            public String getName() {
                return "SearchWithFocusState";
            }

            public boolean processMessage(Message message) {
                int i = message.what;
                if (i == 0 || i == 11) {
                    Log.m105925i(LogStateTransitionState.TAG, "SearchWithFocusState processMessage = %d.", Integer.valueOf(i));
                    if (FTSSOSHomeWebViewUI.this.mo68440ha().length() > 0) {
                        C43942u uVar = C43942u.this;
                        uVar.transitionTo(uVar.f119044f);
                    }
                } else if (i == 2) {
                    FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
                    if (!fTSSOSHomeWebViewUI.f118813v3) {
                        C72618y yVar = fTSSOSHomeWebViewUI.f118989Q3;
                        C72603r.C43975i iVar = C72603r.C43975i.Init;
                        yVar.mo100045a(iVar);
                        FTSSOSHomeWebViewUI.m48126sa(FTSSOSHomeWebViewUI.this, iVar);
                    } else {
                        fTSSOSHomeWebViewUI.finish();
                    }
                } else if (i == 3 || i == 4) {
                    C43942u uVar2 = C43942u.this;
                    uVar2.transitionTo(uVar2.f119042d);
                } else if (i == 5) {
                    if (!FTSSOSHomeWebViewUI.this.f118812u3.getEditText().hasFocus()) {
                        C43942u uVar3 = C43942u.this;
                        uVar3.transitionTo(uVar3.f119044f);
                    } else {
                        C115669n.INSTANCE.mo160131h(15521, Integer.valueOf(FTSSOSHomeWebViewUI.this.f118880Y2), 2, FTSSOSHomeWebViewUI.this.f118812u3.getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.this.f118883b3));
                    }
                }
                return super.processMessage(message);
            }
        }

        public C43942u(String str, Looper looper) {
            super(str, looper);
            addState(this.f119042d);
            addState(this.f119043e);
            addState(this.f119044f);
            addState(this.f119045g);
            setInitialState(this.f119042d);
        }

        /* renamed from: e */
        public boolean mo68543e() {
            IState currentState = getCurrentState();
            return currentState == this.f119043e || currentState == this.f119044f || currentState == this.f119045g;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$o */
    public class C43948o implements View.OnClickListener {
        public C43948o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", FTSSOSHomeWebViewUI.this.f119059J2);
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "" + FTSSOSHomeWebViewUI.this.f118880Y2);
            FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = FTSSOSHomeWebViewUI.this;
            Context context = fTSSOSHomeWebViewUI.f118812u3.getContext();
            fTSSOSHomeWebViewUI.getClass();
            if (!C61104a.m71665u(context) && !C61104a.m71649e(context) && ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, "android.permission.CAMERA", 18, "", "")) {
                String str = (String) hashMap.get("sessionId");
                VideoTransPara videoTransPara = new VideoTransPara();
                videoTransPara.f267170h = 10000;
                RecordConfigProvider f = RecordConfigProvider.m119436f("", "", videoTransPara, 10000000, 16);
                Boolean bool = Boolean.TRUE;
                f.f272931s = bool;
                f.f272932t = Boolean.FALSE;
                f.f272934v = bool;
                f.f272927o.f266579o = fTSSOSHomeWebViewUI.getResources().getString(C0966R.string.hlo);
                ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(fTSSOSHomeWebViewUI, f, new C72602d(fTSSOSHomeWebViewUI));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ra */
    public static void m48125ra(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = fTSSOSHomeWebViewUI;
        boolean z = true;
        fTSSOSHomeWebViewUI2.f118999a4--;
        fTSSOSHomeWebViewUI2.mo68520Ja(true);
        C72603r.C43975i iVar = C72603r.C43975i.Init;
        boolean z2 = fTSSOSHomeWebViewUI2.f118803D3;
        if (!z2) {
            C72603r.C43975i iVar2 = fTSSOSHomeWebViewUI2.f118988P3.f211238q;
            C72603r.C43975i iVar3 = C72603r.C43975i.Search;
            boolean z3 = iVar2 == iVar3;
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(z2);
            objArr[1] = Boolean.valueOf(z3);
            C72603r.C43975i iVar4 = fTSSOSHomeWebViewUI2.f118988P3.f211238q;
            objArr[2] = iVar4;
            if (iVar4 != iVar3) {
                z = false;
            }
            objArr[3] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateSearchBarStatus, needSosEditTextToBeTouchOnly = %s, isSearchState = %s, state = %s, state = %s.", objArr);
            if (z3) {
                fTSSOSHomeWebViewUI.mo68513Ca();
            } else if (fTSSOSHomeWebViewUI2.f118800A3 && fTSSOSHomeWebViewUI2.f118988P3.f211238q == iVar) {
                fTSSOSHomeWebViewUI2.mo68519Ia(0);
                View view = fTSSOSHomeWebViewUI2.f118810s3;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = fTSSOSHomeWebViewUI2.f118810s3;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowDefault", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    fTSSOSHomeWebViewUI2.f118810s3.setBackgroundDrawable(fTSSOSHomeWebViewUI.getResources().getDrawable(C0966R.C0969drawable.b69));
                }
                fTSSOSHomeWebViewUI2.f118812u3.setCommonRightBtnForceHide(false);
                fTSSOSHomeWebViewUI2.f118812u3.setCommonRightImageButtonVisibile(0);
                fTSSOSHomeWebViewUI2.f118812u3.setSearchIconGone(8);
            }
            if (fTSSOSHomeWebViewUI2.f118988P3.f211238q == iVar) {
                fTSSOSHomeWebViewUI2.f119011m4 = false;
            }
        }
        fTSSOSHomeWebViewUI.mo68511Aa();
    }

    /* renamed from: sa */
    public static void m48126sa(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, C72603r.C43975i iVar) {
        fTSSOSHomeWebViewUI.f118990R3.f211238q = iVar;
        fTSSOSHomeWebViewUI.f118989Q3.f211238q = iVar;
        fTSSOSHomeWebViewUI.f118988P3.f211238q = iVar;
    }

    /* renamed from: ta */
    public static void m48127ta(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        fTSSOSHomeWebViewUI.getClass();
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(fTSSOSHomeWebViewUI, "android.permission.RECORD_AUDIO", 80, "", "");
        int i = 2;
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), fTSSOSHomeWebViewUI);
        if (z1) {
            Intent intent = new Intent();
            intent.putExtra("sessionId", fTSSOSHomeWebViewUI.f119059J2);
            intent.putExtra("subSessionId", fTSSOSHomeWebViewUI.f119060K2);
            intent.putExtra("key_scene", fTSSOSHomeWebViewUI.f118880Y2);
            if (fTSSOSHomeWebViewUI.mo68433Y9()) {
                i = 1;
            }
            intent.putExtra("key_is_nav_voice", i);
            C88144b.m109802t(fTSSOSHomeWebViewUI, ".ui.websearch.WebSearchVoiceUI", intent, 1);
            fTSSOSHomeWebViewUI.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: Aa */
    public final void mo68511Aa() {
        TextView textView = this.f118987O3;
        if (textView != null && textView.getVisibility() == 0) {
            Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportExpose, show hide searchtitle.");
        } else if (!this.f119012n4) {
            this.f119012n4 = true;
            this.f119014p4.postDelayed(new C43940s(), 1000);
        }
    }

    /* renamed from: Ba */
    public void mo68512Ba() {
        int i = this.f119003e4;
        if (i == 1) {
            if (C85875k4.m106211z()) {
                this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -1));
            } else {
                this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -16777216));
            }
        } else if (i == 2) {
            this.f118817z3.setVisibility(8);
            this.f118998Z3 = 0;
        } else {
            this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.actionbar_icon_dark_back, -16777216));
        }
    }

    /* renamed from: Ca */
    public final void mo68513Ca() {
        mo68518Ha(8);
        this.f118800A3 = true;
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateSearchBarStatus hasHappenQuery = %s.", Boolean.valueOf(this.f119011m4));
        if (!this.f119011m4 && !this.f118803D3) {
            this.f118812u3.setCancelBtnForceHide(true);
            this.f118812u3.setSearchBarCancelTextContainerVisibile(8);
        }
        this.f118812u3.setForceShowClearBtn(true);
        this.f118812u3.setActionSearchDoneListener(this);
        this.f118812u3.setCancelVisableChangeListener(new C43931j());
        this.f118812u3.setSearchIconGone(0);
        this.f118812u3.mo70338f();
        this.f118812u3.setIconMarginVisable(8);
        if (this.f118812u3.getSearchBarCancelTextContainer() != null) {
            SOSEditTextView sOSEditTextView = this.f118812u3;
            sOSEditTextView.mo70362r(sOSEditTextView.getSearchBarCancelTextContainer().getVisibility() == 0);
        }
        mo68517Ga();
        mo68519Ia((int) getResources().getDimension(C0966R.dimen.f3736cp));
        this.f118812u3.setCommonRightBtnForceHide(true);
        this.f118812u3.setCommonRightImageButtonVisibile(8);
        View view = this.f118810s3;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f118812u3.getSearchDone() != null) {
            View searchDone = this.f118812u3.getSearchDone();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view3 = searchDone;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            searchDone.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "searchBarShowStrengthenType", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        C43942u uVar = this.f118997Y3;
        if (uVar != null) {
            if (uVar.mo68543e()) {
                super.mo3000D(z);
            }
            if (!this.f118803D3) {
                this.f118997Y3.sendMessage(5);
            }
        }
    }

    /* renamed from: Da */
    public void mo68514Da(int i) {
        Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "setFtsVoiceBtnsLayoutVisibile stack = " + Util.getStack() + ", visibility = " + i);
        if (this.f118880Y2 == 130) {
            i = 8;
        }
        View view = this.f118995W3;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: Ea */
    public void mo68515Ea(C43941t tVar) {
        ImageView imageView;
        C43941t tVar2 = C43941t.cancel;
        C43941t tVar3 = C43941t.Back;
        if ((tVar == tVar3 || tVar == tVar2) && (imageView = this.f118817z3) != null) {
            if (tVar == tVar3) {
                if (C85875k4.m106211z()) {
                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.actionbar_icon_dark_back, -1));
                } else {
                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.actionbar_icon_dark_back, -16777216));
                }
            } else if (tVar == tVar2) {
                imageView.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -16777216));
            }
            this.f118817z3.setVisibility(0);
        }
    }

    /* renamed from: Fa */
    public final void mo68516Fa(int i) {
        if (!this.f118803D3) {
            this.f118812u3.getIconView().setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.ayi));
            return;
        }
        this.f118812u3.getIconView().setImageDrawable(mo68476U9(i));
        this.f118812u3.getIconView().setIconColor(getResources().getColor(C0966R.color.FG_2));
    }

    /* renamed from: Ga */
    public final void mo68517Ga() {
        View view = this.f118810s3;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateSearchInputBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateSearchInputBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f118810s3.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.b69));
            if (this.f118812u3.getCancelTextView() != null) {
                this.f118812u3.getCancelTextView().post(new C43932k());
            }
        }
    }

    /* renamed from: Ha */
    public final void mo68518Ha(int i) {
        View view = this.f118985M3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateShadowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "updateShadowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: Ia */
    public final void mo68519Ia(int i) {
        SOSEditTextView sOSEditTextView = this.f118812u3;
        if (sOSEditTextView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sOSEditTextView.getLayoutParams();
            layoutParams.leftMargin = i;
            this.f118812u3.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Ja */
    public final void mo68520Ja(boolean z) {
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "updateWebViewStatus isCancelling:%b visible:%s", Boolean.valueOf(this.f118805F3), Boolean.valueOf(z));
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f118982J3;
        if (webViewKeyboardLinearLayout != null) {
            if (this.f118805F3 || !z) {
                webViewKeyboardLinearLayout.setAlpha(0.0f);
            } else {
                webViewKeyboardLinearLayout.setAlpha(1.0f);
            }
        }
        if (this.f118812u3.getEditText() != null && Util.isNullOrNil((CharSequence) this.f118812u3.getEditText().getText())) {
            this.f118812u3.setClearBtnVisable(8);
        }
    }

    /* renamed from: L2 */
    public boolean mo3920L2(View view) {
        mo68528za("3");
        mo68525wa();
        return true;
    }

    /* renamed from: L9 */
    public C48590l mo68521L9() {
        return this.f118508Z;
    }

    /* renamed from: M9 */
    public Map<String, Object> mo68522M9() {
        String str = "";
        HashMap hashMap = new HashMap();
        if (this.f118993U3 == null) {
            return hashMap;
        }
        Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getOnUiInitParams");
        hashMap.put("nativeHeight", 0);
        try {
            Bundle gv = this.f118511a1.mo68134gv(7, (Bundle) null);
            String string = gv == null ? str : gv.getString("data");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put("operationData", string);
            }
            Object obj = mo68551O9().get("pRequestId");
            if (obj != null) {
                Bundle bundle = new Bundle();
                bundle.putString("reqId", (String) obj);
                Bundle gv4 = this.f118511a1.mo68134gv(8, bundle);
                if (gv4 != null) {
                    String string2 = gv4.getString("data");
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap.put("preGetData", string2);
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", e, str, new Object[0]);
        }
        String stringExtra = getIntent().getStringExtra("first_page_result");
        if (!TextUtils.isEmpty(stringExtra)) {
            str = stringExtra;
        }
        hashMap.put("cachePageResult", str);
        return hashMap;
    }

    /* renamed from: P8 */
    public void mo68252P8(int i) {
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null && mMWebView.getSettings() != null) {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            C76577a.m92172w(getContext());
            float f = sharedPreferences.getFloat("current_text_size_scale_key", 1.0f);
            if (f >= C76577a.m92170u(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92169t(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92168s(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92167r(getContext())) {
                this.f118523f.getSettings().setTextZoom(130);
            } else if (f >= C76577a.m92174y(getContext())) {
                this.f118523f.getSettings().setTextZoom(120);
            } else if (f >= C76577a.m92171v(getContext())) {
                this.f118523f.getSettings().setTextZoom(110);
            } else {
                C76577a.m92172w(getContext());
                if (f >= 1.0f) {
                    this.f118523f.getSettings().setTextZoom(100);
                } else if (f >= C76577a.m92173x(getContext())) {
                    this.f118523f.getSettings().setTextZoom(90);
                } else {
                    this.f118523f.getSettings().setTextZoom(80);
                }
            }
        }
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onKeyboardHeightChanged, height:%s", Integer.valueOf(i));
        if (this.f118880Y2 != 130) {
            ObjectAnimator objectAnimator = this.f119015q4;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.f119015q4.cancel();
            }
            View view = this.f118995W3;
            if (view != null) {
                if (i > 0) {
                    if (view.getTranslationY() != 0.0f) {
                        view.setTranslationY(0.0f);
                    }
                    this.f119015q4 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) (-i)});
                    mo68514Da(0);
                } else {
                    this.f119015q4 = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
                    mo68514Da(8);
                }
                this.f119015q4.setDuration(200);
                this.f119015q4.setInterpolator(new C109678b());
                this.f119015q4.addUpdateListener(new C6164a(this));
                this.f119015q4.start();
            }
        }
    }

    /* renamed from: U9 */
    public Drawable mo68476U9(int i) {
        return !this.f118803D3 ? getResources().getDrawable(C0966R.C0969drawable.ayi) : this.f118890i3 ? getResources().getDrawable(C0966R.raw.icons_outlined_wechat_search_one_search) : super.mo68476U9(i);
    }

    /* renamed from: Y9 */
    public boolean mo68433Y9() {
        C43942u uVar = this.f118997Y3;
        if (uVar == null) {
            return false;
        }
        return uVar.mo68543e();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|(1:6)(1:7)|8|(1:10)|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050 A[Catch:{ Exception -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003d A[Catch:{ Exception -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003e A[Catch:{ Exception -> 0x005f }] */
    /* renamed from: a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63385a9() {
        /*
            r5 = this;
            java.lang.String r0 = "result"
            java.lang.String r1 = "key"
            super.mo63385a9()
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x001e }
            r2.<init>()     // Catch:{ Exception -> 0x001e }
            java.lang.String r3 = "searchID"
            r2.putString(r1, r3)     // Catch:{ Exception -> 0x001e }
            com.tencent.mm.plugin.webview.stub.l r3 = r5.f118511a1     // Catch:{ Exception -> 0x001e }
            r4 = 6
            android.os.Bundle r2 = r3.mo68134gv(r4, r2)     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = r2.getString(r0)     // Catch:{ Exception -> 0x001e }
            r5.f119000b4 = r2     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x005f }
            r2.<init>()     // Catch:{ Exception -> 0x005f }
            java.lang.String r3 = "educationTab"
            r2.putString(r1, r3)     // Catch:{ Exception -> 0x005f }
            com.tencent.mm.plugin.webview.stub.l r1 = r5.f118511a1     // Catch:{ Exception -> 0x005f }
            r3 = 2
            android.os.Bundle r1 = r1.mo68134gv(r3, r2)     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.String r2 = "result_1"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x005f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r0 = r1
        L_0x003f:
            r2.<init>(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = "title"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ Exception -> 0x005f }
            if (r0 != 0) goto L_0x0057
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x005f }
            java.lang.String r2 = "[{\"businessType\":8,\"hotword\":\"朋友圈\",\"optype\":5},{\"businessType\":2,\"hotword\":\"文章\",\"optype\":5},{\"businessType\":1,\"hotword\":\"公众号\",\"optype\":5}]"
            r0.<init>(r2)     // Catch:{ Exception -> 0x005f }
        L_0x0057:
            com.tencent.mm.plugin.webview.ui.tools.fts.i r2 = new com.tencent.mm.plugin.webview.ui.tools.fts.i     // Catch:{ Exception -> 0x005f }
            r2.<init>(r5, r0, r1)     // Catch:{ Exception -> 0x005f }
            r5.mo68549J9(r2)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            android.view.View r0 = r5.f118993U3
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$b r1 = new com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI$b
            r1.<init>()
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSSOSHomeWebViewUI.mo63385a9():void");
    }

    /* renamed from: aa */
    public boolean mo68434aa() {
        return mo68433Y9() && !this.f118988P3.f211239r && !this.f118989Q3.f211239r && !this.f118990R3.f211239r;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        super.mo3001b3(str, str2, list, mVar);
    }

    /* renamed from: ca */
    public String mo68435ca() {
        return !Util.isNullOrNil(this.f118891j3) ? this.f118891j3 : this.f118890i3 ? MMApplicationContext.getContext().getResources().getString(C0966R.string.a2p) : mo68523ua(this.f118883b3);
    }

    /* renamed from: d8 */
    public int mo63387d8() {
        boolean z = false;
        if (getIntent() != null && getIntent().getBooleanExtra("ftsInitToSearch", false)) {
            z = true;
        }
        this.f118813v3 = z;
        if (!C11171e.m11046c(23) || MIUI.isMIUIV8()) {
            return getActionbarColor();
        }
        if (this.f118813v3) {
            return -1;
        }
        return getResources().getColor(C0966R.color.akk);
    }

    /* renamed from: ea */
    public int mo68437ea() {
        return 0;
    }

    /* renamed from: fa */
    public String mo68438fa() {
        return "";
    }

    public void finish() {
        super.finish();
        int i = this.f118880Y2;
        if (i == 67 || i == 81 || i == 83 || i == 100) {
            mo68527ya(11, getIntent().getStringExtra("sessionId"), this.f118880Y2);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5c;
    }

    /* renamed from: ia */
    public void mo68441ia(List<BaseSOSWebViewUI.C43897z> list) {
        if (this.f118803D3) {
            return;
        }
        if (!this.f119011m4 && list.size() == 1) {
            this.f119011m4 = true;
            this.f118812u3.setCancelBtnForceHide(true);
            this.f118812u3.setSearchBarCancelTextContainerVisibile(8);
        } else if (list.size() > 1) {
            this.f118812u3.setCancelBtnForceHide(false);
            this.f118812u3.setSearchBarCancelTextContainerVisibile(0);
        }
    }

    /* renamed from: ka */
    public void mo68443ka() {
        boolean z;
        SOSEditTextView sOSEditTextView;
        int i;
        C43941t tVar = C43941t.Back;
        this.f119014p4.removeMessages(101);
        this.f119014p4.sendEmptyMessageDelayed(101, 500);
        C43924c cVar = new C43924c();
        List<BaseSOSWebViewUI.C43897z> list = this.f118801B3;
        BaseSOSWebViewUI.C43897z zVar = (list == null || ((ArrayList) list).size() <= 0) ? null : (BaseSOSWebViewUI.C43897z) ((ArrayList) this.f118801B3).get(0);
        if (zVar == null || (sOSEditTextView = this.f118812u3) == null || (!((i = this.f118802C3) == 3 || i == 6) || sOSEditTextView.getEditText() == null)) {
            z = false;
        } else {
            ((ArrayList) this.f118801B3).remove(0);
            this.f118812u3.getEditText().setText(zVar.f118868b);
            cVar.run();
            z = true;
        }
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "needHideSuggestionFrist = %s", Boolean.valueOf(z));
        if (!z) {
            if (this.f119007i4 && mo68524va(tVar)) {
                return;
            }
            if (mo68442ja() || !mo68524va(tVar)) {
                super.mo68443ka();
            }
        }
    }

    /* renamed from: la */
    public void mo68444la() {
        if (this.f118999a4 <= 0 && !mo68524va(C43941t.cancel)) {
            super.mo68444la();
            this.f118523f.scrollTo(0, 0);
            mo68516Fa(0);
            this.f118812u3.mo70338f();
            this.f118812u3.setHint(mo68435ca());
            this.f118997Y3.sendMessage(2);
            this.f118808q3.setBackgroundResource(C0966R.C0969drawable.aun);
            mo68518Ha(8);
            View view = this.f118983K3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onClickCancelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onClickCancelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C115669n.INSTANCE.mo160131h(15521, Integer.valueOf(this.f118880Y2), 1, this.f118812u3.getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.f118883b3));
        }
    }

    /* renamed from: ma */
    public void mo68445ma() {
        this.f118997Y3.sendMessage(11);
    }

    /* renamed from: na */
    public void mo68446na() {
        mo68520Ja(true);
    }

    /* renamed from: oa */
    public void mo68447oa() {
        this.f118812u3.setHint(mo68523ua(this.f118883b3));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra(MimeTypes.BASE_TYPE_TEXT);
            if (!TextUtils.isEmpty(stringExtra)) {
                if (stringExtra != null) {
                    try {
                        if (C45078p0.m49927f(stringExtra) > 100) {
                            if (stringExtra.length() > 200) {
                                stringExtra = stringExtra.substring(0, 200);
                            }
                            char[] charArray = stringExtra.toCharArray();
                            int length = charArray.length;
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                i4 += C45078p0.m49927f(charArray[i3] + "");
                                if (i4 >= 100) {
                                    stringExtra = stringExtra.substring(0, i5) + 8230;
                                    break;
                                }
                                i5++;
                                i3++;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "voice input final text len %d , text %s", Integer.valueOf(stringExtra.length()), stringExtra);
                this.f118812u3.mo70356l(stringExtra, (List<FTSSearchView.C6996f>) null);
                mo68525wa();
            }
        }
    }

    public void onBackPressed() {
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onBackPressed, controlBackPressEnable = %s.", Boolean.valueOf(this.f119013o4));
        if (this.f119013o4) {
            super.onBackPressed();
            this.f118812u3.mo70337e();
        }
    }

    public void onClickClearTextBtn(View view) {
        super.onClickClearTextBtn(view);
        mo68528za("1");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f118997Y3 = new C43942u("sos_home_webview_ui", getMainLooper());
        this.f118993U3 = findViewById(C0966R.C0970id.kof);
        this.f118994V3 = findViewById(C0966R.C0970id.kog);
        this.f118995W3 = findViewById(C0966R.C0970id.eg_);
        this.f118983K3 = findViewById(C0966R.C0970id.f357785br0);
        this.f118981I3 = findViewById(C0966R.C0970id.kpp);
        this.f118982J3 = (WebViewKeyboardLinearLayout) findViewById(C0966R.C0970id.lmr);
        this.f118984L3 = (ImageView) findViewById(C0966R.C0970id.lbl);
        this.f118987O3 = (TextView) findViewById(C0966R.C0970id.f358396ew2);
        this.f118986N3 = findViewById(C0966R.C0970id.jy8);
        this.f119004f4 = findViewById(C0966R.C0970id.j5t);
        this.f118982J3.setOnkbdStateListener(new C43933l());
        View view = this.f118808q3;
        View view2 = this.f118981I3;
        WeImageView iconView = this.f118812u3.getIconView();
        ImageView imageView = this.f118817z3;
        C72615v vVar = new C72615v(this, view, view2, iconView, imageView, imageView, this.f118812u3.getEditText(), this.f118993U3, this.f118994V3, this.f118810s3, this.f118812u3.getSearchDone());
        this.f118988P3 = vVar;
        vVar.f211240s = this.f119016r4;
        View view3 = this.f118808q3;
        View view4 = this.f118981I3;
        WeImageView iconView2 = this.f118812u3.getIconView();
        ImageView imageView2 = this.f118817z3;
        C72618y yVar = new C72618y(this, view3, view4, iconView2, imageView2, imageView2, this.f118812u3.getEditText(), this.f118993U3, this.f118994V3, this.f118810s3, this.f118812u3.getSearchDone());
        this.f118989Q3 = yVar;
        yVar.f211240s = this.f119018t4;
        View view5 = this.f118808q3;
        View view6 = this.f118981I3;
        WeImageView iconView3 = this.f118812u3.getIconView();
        ImageView imageView3 = this.f118817z3;
        C72619z zVar = new C72619z(this, view5, view6, iconView3, imageView3, imageView3, this.f118812u3.getEditText(), this.f118993U3, this.f118994V3, this.f118810s3, this.f118812u3.getSearchDone());
        this.f118990R3 = zVar;
        zVar.f211240s = this.f119017s4;
        this.f118985M3 = findViewById(C0966R.C0970id.jy9);
        findViewById(C0966R.C0970id.brz).setOnTouchListener(new C43934m());
        this.f118998Z3 = C76577a.m92157h(this, C0966R.dimen.f3736cp);
        SOSEditTextView sOSEditTextView = this.f118812u3;
        sOSEditTextView.getEditText().setOnFocusChangeListener(sOSEditTextView.f122154G);
        this.f118812u3.mo70338f();
        this.f118813v3 = getIntent().getBooleanExtra("ftsInitToSearch", false);
        this.f119002d4 = getIntent().getBooleanExtra("hideSearchInput", false);
        this.f119003e4 = getIntent().getIntExtra("key_back_btn_type", 0);
        this.f119001c4 = getIntent().getStringExtra("key_search_bar_text_color");
        C43942u uVar = this.f118997Y3;
        if (uVar != null) {
            if (this.f118813v3) {
                View view7 = this.f118808q3;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f118994V3.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
                C43942u uVar2 = this.f118997Y3;
                uVar2.setInitialState(uVar2.f119044f);
                if (C11171e.m11046c(23) && !C88956h.m111064e()) {
                    mo68302p9(getResources().getColor(C0966R.color.al6), !C85875k4.m106211z());
                }
            } else {
                FTSSOSHomeWebViewUI.this.f118812u3.setSearchBarCancelTextContainerVisibile(0);
                uVar.setInitialState(uVar.f119042d);
            }
            this.f118997Y3.start();
        }
        ImageView imageView4 = this.f118984L3;
        if (imageView4 != null) {
            imageView4.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_mike, C76577a.m92153d(getContext(), C0966R.color.BW_0_Alpha_0_5)));
        }
        int i = this.f119003e4;
        if (i == 1) {
            if (C85875k4.m106211z()) {
                this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -1));
            } else {
                this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -16777216));
            }
        } else if (i == 2) {
            this.f118817z3.setVisibility(8);
            this.f118998Z3 = 0;
        }
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "searchBarTextColor = %s,", this.f119001c4);
        if ("placeholderColor".equals(this.f119001c4)) {
            this.f118812u3.setTextColor(getResources().getColor(C0966R.color.FG_2));
        }
        C22613h1.m26475a(this.f118880Y2, 1, this.f119059J2);
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            View view9 = mMWebView.getView();
            view9.setOnTouchListener(new C43967h(this, view9));
        }
        this.f118808q3.postDelayed(new C43935n(), 100);
        this.f118812u3.setCameraBtnClickListener(new C43948o());
        this.f118812u3.setCancelTextViewClickListener(new C43936p());
        if (this.f118812u3.getEditText() != null) {
            this.f118812u3.getEditText().setText(this.f118884c3);
        }
        SOSEditTextView sOSEditTextView2 = this.f118812u3;
        boolean z = this.f118803D3;
        WeImageView weImageView = sOSEditTextView2.f122155d;
        if (weImageView != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams.width = (int) (sOSEditTextView2.getResources().getDimension(C0966R.dimen.f3738cr) * C76577a.m92161l(sOSEditTextView2.getContext()));
                layoutParams.height = (int) (sOSEditTextView2.getResources().getDimension(C0966R.dimen.f3738cr) * C76577a.m92161l(sOSEditTextView2.getContext()));
                layoutParams.rightMargin = (int) sOSEditTextView2.getResources().getDimension(C0966R.dimen.f3766df);
                sOSEditTextView2.f122155d.setLayoutParams(layoutParams);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams2.width = (int) (sOSEditTextView2.getResources().getDimension(C0966R.dimen.f3723cd) * C76577a.m92161l(sOSEditTextView2.getContext()));
                layoutParams2.rightMargin = 0;
                sOSEditTextView2.f122155d.setLayoutParams(layoutParams2);
            }
        }
        mo68516Fa(this.f118882a3);
        ImageButton clearBtn = this.f118812u3.getClearBtn();
        if (clearBtn != null) {
            clearBtn.getDrawable().setColorFilter(getResources().getColor(C0966R.color.FG_0), PorterDuff.Mode.SRC_ATOP);
        }
        View view10 = this.f119004f4;
        if (view10 != null) {
            view10.setOnClickListener(new C43937q());
        }
        int i2 = this.f118880Y2;
        if ((i2 == 36) || i2 == 53 || i2 == 130) {
            this.f118812u3.setCancelTextViewVisibile(8);
        }
        this.f118995W3.setOnClickListener(new C43938r());
        mo68519Ia((int) getResources().getDimension(C0966R.dimen.f3736cp));
        if (!this.f118803D3) {
            if (this.f118813v3) {
                mo68513Ca();
            } else {
                mo68517Ga();
                mo68519Ia(0);
                View view11 = this.f118810s3;
                if (view11 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (this.f118815x3 && this.f118812u3.getEditText() != null && !Util.isNullOrNil(this.f118884c3)) {
            this.f118812u3.getEditText().setText(this.f118884c3);
            this.f118812u3.setForceShowClearBtn(true);
            this.f118812u3.setClearBtnVisable(0);
        }
        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onCreate, needSosEditTextToBeTouchOnly = %s, isInitToSearch = %s, WeUIUtil,getNavigationBarVisibility = %s.", Boolean.valueOf(this.f118803D3), Boolean.valueOf(this.f118813v3), Boolean.valueOf(C75054z4.m90005c(this)));
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f118996X3 = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FTSSOSHomeWebViewUI).mo86179qs(this, C76986a.Search);
    }

    public void onDestroy() {
        super.onDestroy();
        C22613h1.m26489o();
        C22613h1.m26483i();
    }

    public void onPause() {
        Class cls = C110234e.class;
        super.onPause();
        C22613h1.m26488n();
        if (((C110234e) C86312j.m106911c(cls)).mo161398Zc() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22761a(105, false, false);
        }
        KeyboardHeightProvider keyboardHeightProvider = this.f118996X3;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        super.onResume();
        C22613h1.m26487m();
        KeyboardHeightProvider keyboardHeightProvider = this.f118996X3;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f118996X3;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
        if (this.f118813v3) {
            mo68511Aa();
        }
    }

    /* renamed from: pa */
    public void mo68448pa() {
        super.mo68448pa();
        mo68520Ja(true);
        int i = this.f118880Y2;
        if (i == 67 || i == 81 || i == 100) {
            mo68527ya(10, getIntent().getStringExtra("sessionId"), this.f118880Y2);
        }
    }

    /* renamed from: qa */
    public void mo68449qa() {
        super.mo68449qa();
        int i = this.f118880Y2;
        if (i == 67 || i == 81 || i == 100) {
            mo68527ya(9, getIntent().getStringExtra("sessionId"), this.f118880Y2);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C13788c.class);
    }

    /* renamed from: u8 */
    public void mo63388u8(int i, Bundle bundle) {
        boolean z;
        View view;
        int i2 = i;
        Bundle bundle2 = bundle;
        C43941t tVar = C43941t.None;
        super.mo63388u8(i, bundle);
        if (i2 == 119) {
            this.f118997Y3.sendMessage(8);
        } else if (i2 != 122) {
            String str = "";
            if (i2 == 136) {
                bundle2.getString("fts_key_new_query", str);
                this.f118997Y3.sendMessage(13);
            } else if (i2 != 161) {
                switch (i2) {
                    case 154:
                        String string = bundle2.getString("fts_key_data", "exit");
                        Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "handleFTSAction, action = " + string);
                        if (TextUtils.equals("resignControl", string)) {
                            this.f119007i4 = false;
                            Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "AC_ON_NAV_CONTROL, forceBackType = " + this.f119008j4);
                            if (this.f119008j4 != tVar) {
                                mo68512Ba();
                            }
                            this.f119008j4 = tVar;
                        } else if (TextUtils.equals("controlExit", string)) {
                            String string2 = bundle2.getString("fts_key_leftBar_button_type", str);
                            this.f119007i4 = true;
                            if (TextUtils.equals("exit", string2)) {
                                C43941t tVar2 = C43941t.cancel;
                                this.f119008j4 = tVar2;
                                mo68515Ea(tVar2);
                            } else if (TextUtils.equals("back", string2)) {
                                C43941t tVar3 = C43941t.Back;
                                this.f119008j4 = tVar3;
                                mo68515Ea(tVar3);
                            } else {
                                this.f119008j4 = tVar;
                            }
                        } else if (TextUtils.equals("exit", string)) {
                            this.f119007i4 = false;
                            this.f119008j4 = tVar;
                            if (!Util.isNullOrNil(this.f118884c3)) {
                                this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
                            } else {
                                this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68436da());
                            }
                            this.f118894m3.put("exittype", "3");
                            mo68444la();
                        } else if (TextUtils.equals("configNavBar", string)) {
                            String string3 = bundle2.getString("recommendSearchQuery", str);
                            int i3 = bundle2.getInt("key_back_btn_type", 0);
                            if (i3 == 1) {
                                if (C85875k4.m106211z()) {
                                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -1));
                                } else {
                                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -16777216));
                                }
                            } else if (i3 == 2) {
                                this.f118817z3.setVisibility(8);
                                this.f118998Z3 = 0;
                            } else if (i3 == 3) {
                                if (C85875k4.m106211z()) {
                                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.actionbar_icon_dark_back, -1));
                                } else {
                                    this.f118817z3.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.actionbar_icon_dark_back, -16777216));
                                }
                            }
                            String string4 = bundle2.getString("key_search_bar_text_color");
                            if ("placeholderColor".equals(string4)) {
                                this.f118812u3.setTextColor(getResources().getColor(C0966R.color.f3563xt));
                            }
                            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "handleFTSAction, searchBarTextColor = %s.", string4);
                            if (bundle2.getBoolean("key_search_hide_nav_bottom_line") && (view = this.f118811t3) != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            int i4 = bundle2.getInt("hideSearchInput", 0);
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "first enter, hideSearchBarType = " + i4 + ", isHideSearchInput = " + this.f119002d4);
                                    this.f119002d4 = true;
                                    View view3 = this.f118808q3;
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(8);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View view5 = this.f118993U3;
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(0);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    if (getIntent().hasExtra("customize_status_bar_color")) {
                                        this.f118994V3.setBackgroundColor(this.f118552p1);
                                        if (getIntent().hasExtra("status_bar_style")) {
                                            mo68302p9(this.f118552p1, "black".equals(this.f118555q1));
                                        }
                                    }
                                    this.f118987O3.setVisibility(0);
                                    String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                    if (Util.isNullOrNil(stringExtra)) {
                                        stringExtra = getString(C0966R.string.cwg);
                                    }
                                    this.f118987O3.setText(stringExtra);
                                    View view7 = this.f118994V3;
                                    C9556a aVar4 = new C9556a();
                                    aVar4.mo10233c(0);
                                    View view8 = view7;
                                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                    C117292a.m165359e(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    getIntent().putExtra("hideSearchInput", this.f119002d4);
                                } else if (i4 == 2 && this.f118803D3) {
                                    this.f119002d4 = false;
                                    View view9 = this.f118808q3;
                                    C9556a aVar5 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                    aVar5.mo10233c(0);
                                    View view10 = view9;
                                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view10, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    this.f118817z3.setVisibility(0);
                                    this.f118987O3.setVisibility(8);
                                    View view11 = this.f118994V3;
                                    C9556a aVar6 = new C9556a();
                                    aVar6.mo10233c(8);
                                    View view12 = view11;
                                    C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                    C117292a.m165359e(view12, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    getIntent().putExtra("hideSearchInput", this.f119002d4);
                                } else if (!this.f118803D3) {
                                    this.f119002d4 = false;
                                    View view13 = this.f118808q3;
                                    C9556a aVar7 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                    aVar7.mo10233c(0);
                                    View view14 = view13;
                                    C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                    C117292a.m165359e(view14, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    this.f118817z3.setVisibility(0);
                                    this.f118987O3.setVisibility(8);
                                    this.f118812u3.mo70355k();
                                    this.f118812u3.mo70360p();
                                    View view15 = this.f118994V3;
                                    C9556a aVar8 = new C9556a();
                                    aVar8.mo10233c(8);
                                    View view16 = view15;
                                    C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                    C117292a.m165359e(view16, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "handleFTSAction", "(ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    getIntent().putExtra("hideSearchInput", this.f119002d4);
                                }
                            }
                            if (!this.f119002d4) {
                                z = bundle2.getBoolean("ftsneedkeyboard", false);
                                if (z) {
                                    getContentView().postDelayed(new C43928g(), 128);
                                }
                            } else {
                                str = bundle2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                if (!Util.isNullOrNil(str)) {
                                    this.f118987O3.setText(str);
                                }
                                z = false;
                            }
                            Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "backButtonType = " + i3 + ", pageTitle = " + str + ", hideSearchBarType = " + i4 + ", ftsNeedHideKeyBoard = " + z);
                            if (!Util.isNullOrNil(string3)) {
                                this.f118812u3.getEditText().setHint(string3);
                            }
                        }
                        Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "AC_ON_NAV_CONTROL mIsExitControl:%b, lastClickType:%s", Boolean.valueOf(this.f119007i4), this.f119009k4);
                        return;
                    case 155:
                        int i5 = bundle2.getInt("fts_key_data");
                        int i6 = bundle2.getInt("fts_key_cache");
                        View view17 = this.f118986N3;
                        if (view17 != null) {
                            view17.post(new C6169j(this, i5, i6));
                            return;
                        }
                        return;
                    case 156:
                        View view18 = this.f118986N3;
                        if (view18 != null) {
                            view18.post(new C6170k(this));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                boolean z2 = bundle2.getBoolean("fts_key_interactivepopgesture_enabled", true);
                this.f119013o4 = z2;
                Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "set controlBackPressEnable = %s", Boolean.valueOf(z2));
            }
        } else {
            this.f118997Y3.sendMessage(10);
        }
    }

    /* renamed from: ua */
    public final String mo68523ua(int i) {
        int i2;
        if (i == 1) {
            i2 = C0966R.string.ih6;
        } else if (i == 2) {
            i2 = C0966R.string.ih5;
        } else if (i == 8) {
            i2 = C0966R.string.m_r;
        } else if (i != 16) {
            if (i != 64) {
                if (i == 128) {
                    i2 = C0966R.string.f2t;
                } else if (i == 256 || i == 384) {
                    i2 = C0966R.string.f2s;
                } else if (i == 512) {
                    i2 = C0966R.string.f360825f32;
                } else if (i == 1024) {
                    i2 = C0966R.string.f360826f33;
                } else if (i != 262208) {
                    i2 = -1;
                }
            }
            i2 = C0966R.string.f7674nk;
        } else {
            i2 = C0966R.string.f360827f34;
        }
        int i3 = this.f118880Y2;
        if ((i3 == 36) || i3 == 53) {
            i2 = C0966R.string.iht;
        }
        if (i2 >= 0) {
            return getString(C0966R.string.ih4, new Object[]{getString(i2)});
        } else if (Util.isNullOrNil(this.f119006h4)) {
            return getString(C0966R.string.ihi);
        } else {
            return getString(C0966R.string.ih4, new Object[]{this.f119006h4});
        }
    }

    /* renamed from: va */
    public final boolean mo68524va(C43941t tVar) {
        C48590l lVar;
        boolean z;
        C43941t tVar2 = this.f119008j4;
        if (tVar2 != C43941t.None) {
            mo68512Ba();
            tVar = tVar2;
        }
        if (this.f119010l4) {
            mo68526xa();
            View view = this.f118986N3;
            if (view != null) {
                view.post(new C6170k(this));
            }
        }
        if (this.f119007i4 && (lVar = this.f118508Z) != null) {
            if (!lVar.f130003h) {
                Log.m105920e("MicroMsg.JsApiHandler", "onClientNavAction fail, not ready");
                z = false;
            } else {
                Log.m105924i("MicroMsg.JsApiHandler", "onClientNavAction success, ready");
                HashMap hashMap = new HashMap();
                hashMap.put("action", "willExitSearch");
                MMHandlerThread.postToMainThread(new C48580e0(lVar, C13851h1.C13852a.m13143c("onClientNavAction", hashMap, lVar.f130011p, lVar.f130012q)));
                z = true;
            }
            if (z) {
                this.f119009k4 = tVar;
                return true;
            }
        }
        if (tVar == C43941t.Back) {
            mo68442ja();
        }
        return false;
    }

    /* renamed from: wa */
    public boolean mo68525wa() {
        if (!this.f118806G3) {
            return true;
        }
        this.f118812u3.mo70363s();
        this.f118997Y3.sendMessage(0);
        super.mo3009y();
        return true;
    }

    /* renamed from: xa */
    public final void mo68526xa() {
        C48590l lVar = this.f118508Z;
        if (lVar == null) {
            return;
        }
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onNavBarShadowManuallyHidden success, ready");
        MMHandlerThread.postToMainThread(new C48582f0(lVar, C13851h1.C13852a.m13143c("onNavBarShadowManuallyHidden", new HashMap(), lVar.f130011p, lVar.f130012q)));
    }

    /* renamed from: y */
    public boolean mo3009y() {
        mo68525wa();
        return true;
    }

    /* renamed from: y2 */
    public void mo24942y2(int i, int i2, int i3, int i4) {
        super.mo24942y2(i, i2, i3, i4);
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            int min = Math.min(i2, Math.max(C76577a.m92151b(this, mMWebView.getContentHeight()) - this.f118523f.getHeight(), 0));
            C72615v vVar = this.f118988P3;
            int i5 = this.f119005g4;
            vVar.f211236o[0][0] = (float) (i5 - min);
            this.f118989Q3.f211236o[0][0] = (float) (i5 - min);
            this.f118990R3.f211236o[0][0] = (float) (i5 - min);
            if (!this.f118997Y3.mo68543e()) {
                float f = (float) (-min);
                this.f118981I3.setTranslationY(f);
                this.f118808q3.setTranslationY(f);
            }
            if (i2 != 0) {
                this.f118812u3.mo70335c();
                hideVKB();
            }
        }
    }

    /* renamed from: ya */
    public final void mo68527ya(int i, String str, int i2) {
        ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.f265369e = i;
        chatImageWebSearchActionStruct.f265370f = 0;
        chatImageWebSearchActionStruct.mo126611w(str);
        chatImageWebSearchActionStruct.f265371g = i2;
        chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
        chatImageWebSearchActionStruct.mo86054n();
    }

    /* renamed from: za */
    public final void mo68528za(String str) {
        TextView textView = this.f118987O3;
        if (textView == null || textView.getVisibility() != 0 || Util.isNullOrNil(this.f118987O3.getText())) {
            Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "stack = " + Util.getStack());
            String string = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getString("sos_fts_search_data_tmp", "");
            JSONObject jSONObject = new JSONObject();
            if (!Util.isNullOrNil(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception unused) {
                }
            }
            String optString = jSONObject.optString("requestId");
            this.f118887f3 = (long) jSONObject.optInt("type");
            String optString2 = jSONObject.optString("url");
            this.f118889h3 = jSONObject.optString("parentSearchID");
            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "requestId = %s, type = %s, searchData = %s, rawUrl = %s.", optString, Long.valueOf(this.f118887f3), jSONObject.toString(), optString2);
            Log.m105925i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportAction25147 searchData = %s, searchDataTmp = %s, mapRawUrl= %s.", jSONObject, string, this.f118889h3);
            BaseSOSWebViewUI.m48042ba(this.f119059J2, this.f119000b4, optString, 2, this.f118880Y2, 2, str, this.f118887f3, this.f118889h3);
            return;
        }
        Log.m105924i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "reportAction25147, show hide searchtitle.");
    }
}
