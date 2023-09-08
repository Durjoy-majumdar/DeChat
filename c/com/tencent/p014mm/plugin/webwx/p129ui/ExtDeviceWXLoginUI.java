package com.tencent.p014mm.plugin.webwx.p129ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MsgSynchronizeABTestEvent;
import com.tencent.p014mm.autogen.events.MsgSynchronizeStartEvent;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import fa3.C8004f;
import fa3.C8005h;
import h81.C32735h;
import ia3.C8867a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import te3.C51515ua0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI */
public class ExtDeviceWXLoginUI extends MMSecDataActivity implements C11385n {

    /* renamed from: A */
    public RelativeLayout f23868A;

    /* renamed from: B */
    public CheckBox f23869B;

    /* renamed from: C */
    public int f23870C = 0;

    /* renamed from: D */
    public String f23871D = "";

    /* renamed from: E */
    public IListener<WebViewExWindowCloseEvent> f23872E = new IListener<WebViewExWindowCloseEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1684674094;
        }

        public boolean callback(IEvent iEvent) {
            WebViewExWindowCloseEvent webViewExWindowCloseEvent = (WebViewExWindowCloseEvent) iEvent;
            if (webViewExWindowCloseEvent.f9610d.f9611a.equals("continue_login")) {
                Log.m105924i("MicroMsg.ExtDeviceWXLoginUI", "continue login");
                ExtDeviceWXLoginUI.m6922H7(ExtDeviceWXLoginUI.this);
                return false;
            } else if (!webViewExWindowCloseEvent.f9610d.f9611a.equals("cancel_login")) {
                return false;
            } else {
                Log.m105924i("MicroMsg.ExtDeviceWXLoginUI", "cancel login");
                ExtDeviceWXLoginUI.this.finish();
                return false;
            }
        }
    };

    /* renamed from: d */
    public int f23873d = 0;

    /* renamed from: e */
    public String f23874e = null;

    /* renamed from: f */
    public String f23875f = null;

    /* renamed from: g */
    public String f23876g = null;

    /* renamed from: h */
    public int f23877h;

    /* renamed from: i */
    public int f23878i;

    /* renamed from: j */
    public ProgressDialog f23879j = null;

    /* renamed from: n */
    public boolean f23880n = false;

    /* renamed from: o */
    public Button f23881o;

    /* renamed from: p */
    public TextView f23882p;

    /* renamed from: q */
    public boolean f23883q = false;

    /* renamed from: r */
    public boolean f23884r = false;

    /* renamed from: s */
    public String f23885s = "";

    /* renamed from: t */
    public int f23886t = 0;

    /* renamed from: u */
    public String f23887u;

    /* renamed from: v */
    public TextView f23888v;

    /* renamed from: w */
    public TextView f23889w;

    /* renamed from: x */
    public TextView f23890x;

    /* renamed from: y */
    public RelativeLayout f23891y;

    /* renamed from: z */
    public CheckBox f23892z;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$a */
    public class C6614a implements MenuItem.OnMenuItemClickListener {
        public C6614a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExtDeviceWXLoginUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$b */
    public class C6615b implements View.OnClickListener {
        public C6615b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = ExtDeviceWXLoginUI.this.f23869B;
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$c */
    public class C6616c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$c$a */
        public class C6617a implements DialogInterface.OnClickListener {
            public C6617a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CheckBox checkBox = ExtDeviceWXLoginUI.this.f23892z;
                checkBox.setChecked(!checkBox.isChecked());
            }
        }

        /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$c$b */
        public class C6618b implements DialogInterface.OnClickListener {
            public C6618b(C6616c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C6616c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (ExtDeviceWXLoginUI.this.f23892z.isChecked()) {
                CheckBox checkBox = ExtDeviceWXLoginUI.this.f23892z;
                checkBox.setChecked(!checkBox.isChecked());
            } else {
                AppCompatActivity context = ExtDeviceWXLoginUI.this.getContext();
                ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
                C76879j.m92707A(context, Util.nullAs(extDeviceWXLoginUI.f23875f, extDeviceWXLoginUI.getContext().getString(C0966R.string.lhr)), ExtDeviceWXLoginUI.this.getContext().getString(C0966R.string.lht), ExtDeviceWXLoginUI.this.getContext().getString(C0966R.string.lhs), ExtDeviceWXLoginUI.this.getContext().getString(C0966R.string.f7926wf), new C6617a(), new C6618b(this));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$d */
    public class C6619d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f23898d;

        public C6619d(String str) {
            this.f23898d = str;
        }

        public void run() {
            ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
            if (extDeviceWXLoginUI.f23889w != null) {
                String str = this.f23898d;
                int i = extDeviceWXLoginUI.f23886t;
                int i2 = 0;
                if (i == 0) {
                    extDeviceWXLoginUI.f23890x.setVisibility(8);
                } else if (i == 1) {
                    extDeviceWXLoginUI.f23890x.setText(extDeviceWXLoginUI.f23887u);
                    extDeviceWXLoginUI.f23890x.setVisibility(0);
                } else if (i == 2) {
                    extDeviceWXLoginUI.f23890x.setVisibility(8);
                    C85801v1 i3 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MULTI_DEVICE_NOT_KICK_OUT_SHOWN_BOOLEAN_SYNC;
                    if (!i3.mo119686g(aVar, false)) {
                        View findViewById = extDeviceWXLoginUI.findViewById(C0966R.C0970id.jme);
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                    }
                }
                if (!Util.isNullOrNil(str)) {
                    extDeviceWXLoginUI.f23889w.setVisibility(0);
                    extDeviceWXLoginUI.f23889w.setText(str);
                } else {
                    extDeviceWXLoginUI.f23889w.setVisibility(8);
                }
                if (extDeviceWXLoginUI.f23890x.getVisibility() == 0 || !Util.isNullOrNil(str)) {
                    int b = C76577a.m92151b(extDeviceWXLoginUI, JsApiSetAudioState.CTRL_INDEX) - extDeviceWXLoginUI.f23868A.getMeasuredHeight();
                    if (extDeviceWXLoginUI.f23888v.getVisibility() == 0) {
                        b = (b - C76577a.m92151b(extDeviceWXLoginUI, 28)) - extDeviceWXLoginUI.f23888v.getMeasuredHeight();
                    }
                    if (extDeviceWXLoginUI.f23868A.getVisibility() == 0) {
                        b = (b - C76577a.m92151b(extDeviceWXLoginUI, 4)) - extDeviceWXLoginUI.f23868A.getMeasuredHeight();
                    }
                    if (extDeviceWXLoginUI.f23891y.getVisibility() == 0) {
                        b = (b - C76577a.m92151b(extDeviceWXLoginUI, 4)) - extDeviceWXLoginUI.f23891y.getMeasuredHeight();
                    }
                    if (extDeviceWXLoginUI.f23890x.getVisibility() == 0) {
                        b -= C76577a.m92151b(extDeviceWXLoginUI, 12);
                    }
                    if (extDeviceWXLoginUI.f23889w.getVisibility() == 0) {
                        b -= C76577a.m92151b(extDeviceWXLoginUI, 12);
                    }
                    if (!extDeviceWXLoginUI.mo7536J7(b, 14, str) && !extDeviceWXLoginUI.mo7536J7(b, 13, str) && !extDeviceWXLoginUI.mo7536J7(b, 12, str)) {
                        float b2 = (float) C76577a.m92151b(extDeviceWXLoginUI, 12);
                        extDeviceWXLoginUI.f23890x.setTextSize(0, b2);
                        extDeviceWXLoginUI.f23889w.setTextSize(0, b2);
                        int b3 = b / C76577a.m92151b(extDeviceWXLoginUI, 12);
                        int measuredWidth = extDeviceWXLoginUI.f23889w.getMeasuredWidth();
                        if (extDeviceWXLoginUI.f23889w.getVisibility() == 0) {
                            int measureText = (int) extDeviceWXLoginUI.f23889w.getPaint().measureText(str);
                            if (measuredWidth > 0) {
                                i2 = 0 + (measureText / measuredWidth);
                                if (measureText % measuredWidth > 0) {
                                    i2++;
                                }
                            }
                        }
                        if (b3 > i2) {
                            extDeviceWXLoginUI.f23890x.setMaxLines(b3 - i2);
                            return;
                        }
                        extDeviceWXLoginUI.f23889w.setMaxLines(b3 - 1);
                        extDeviceWXLoginUI.f23890x.setMaxLines(1);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$e */
    public class C6620e implements MenuItem.OnMenuItemClickListener {
        public C6620e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.ExtDeviceWXLoginUI", "onMenuItemClick click");
            Intent intent = new Intent();
            ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
            if (extDeviceWXLoginUI.f23883q) {
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, extDeviceWXLoginUI.getString(C0966R.string.lhx));
            }
            intent.putExtra("rawUrl", ExtDeviceWXLoginUI.this.f23871D + "&lang=" + LocaleUtil.getApplicationLanguage());
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", false);
            C88144b.m109791i(ExtDeviceWXLoginUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$f */
    public class C6621f implements MenuItem.OnMenuItemClickListener {
        public C6621f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.ExtDeviceWXLoginUI", "onMenuItemClick click");
            Intent intent = new Intent();
            ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
            if (extDeviceWXLoginUI.f23883q) {
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, extDeviceWXLoginUI.getString(C0966R.string.lhx));
            }
            intent.putExtra("rawUrl", ExtDeviceWXLoginUI.this.f23871D + "&lang=" + LocaleUtil.getApplicationLanguage());
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", false);
            C88144b.m109791i(ExtDeviceWXLoginUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$g */
    public class C6622g implements View.OnClickListener {
        public C6622g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
            C8004f fVar = new C8004f(extDeviceWXLoginUI.f23874e);
            C97625j3.m125815e().mo123460f(fVar);
            extDeviceWXLoginUI.f23879j = C76879j.m92723Q(extDeviceWXLoginUI.getContext(), (String) null, extDeviceWXLoginUI.getString(C0966R.string.gas), true, true, new C6627a(extDeviceWXLoginUI, fVar));
            C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$h */
    public class C6623h implements View.OnClickListener {
        public C6623h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "spam url %s", ExtDeviceWXLoginUI.this.f23885s);
            ExtDeviceWXLoginUI extDeviceWXLoginUI = ExtDeviceWXLoginUI.this;
            if (extDeviceWXLoginUI.f23873d != 0 || Util.isNullOrNil(extDeviceWXLoginUI.f23885s)) {
                ExtDeviceWXLoginUI.m6922H7(ExtDeviceWXLoginUI.this);
            } else {
                ExtDeviceWXLoginUI extDeviceWXLoginUI2 = ExtDeviceWXLoginUI.this;
                String str = extDeviceWXLoginUI2.f23885s;
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", true);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C88144b.m109791i(extDeviceWXLoginUI2, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI$i */
    public class C6624i implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C8005h f23904d;

        public C6624i(C8005h hVar) {
            this.f23904d = hVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f23904d);
            ProgressDialog progressDialog = ExtDeviceWXLoginUI.this.f23879j;
            if (progressDialog != null) {
                progressDialog.cancel();
            }
        }
    }

    /* renamed from: H7 */
    public static void m6922H7(ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MSG_SYNCHRONIZE_BOOLEAN;
        int i = extDeviceWXLoginUI.f23873d;
        boolean z = true;
        if (i == 0) {
            boolean isChecked = extDeviceWXLoginUI.f23892z.isChecked();
            if (extDeviceWXLoginUI.f23883q) {
                boolean isChecked2 = extDeviceWXLoginUI.f23869B.isChecked();
                extDeviceWXLoginUI.f23884r = false;
                if (isChecked2) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
                } else {
                    if (((Boolean) C97625j3.m125812b().mo105906u().mo119685f(aVar, Boolean.TRUE)).booleanValue()) {
                        extDeviceWXLoginUI.f23884r = true;
                    }
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
                }
                if (!extDeviceWXLoginUI.f23883q || !isChecked2) {
                    z = false;
                }
                extDeviceWXLoginUI.mo7535I7(z, isChecked);
                return;
            }
            extDeviceWXLoginUI.mo7535I7(false, isChecked);
        } else if (i == -2) {
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
            intent.putExtra("from_album", false);
            intent.putExtra("show_intro", false);
            intent.setFlags(65536);
            C88144b.m109791i(extDeviceWXLoginUI, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
            extDeviceWXLoginUI.finish();
        }
    }

    /* renamed from: I7 */
    public final boolean mo7535I7(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "doDeviceWXLogin synchronize:%s, autoLogin:%s", Boolean.valueOf(z), Boolean.valueOf(z2));
        C8005h hVar = new C8005h(this.f23874e, this.f23876g, z, z2);
        C97625j3.m125815e().mo123460f(hVar);
        this.f23879j = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C6624i(hVar));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7536J7(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = kg3.C76577a.m92151b(r4, r6)
            int r5 = r5 / r0
            android.widget.TextView r0 = r4.f23889w
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r4.f23890x
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x002a
            android.widget.TextView r1 = r4.f23890x
            android.text.TextPaint r1 = r1.getPaint()
            float r1 = r1.measureText(r7)
            int r1 = (int) r1
            if (r0 <= 0) goto L_0x002a
            int r3 = r1 / r0
            int r3 = r3 + r2
            int r1 = r1 % r0
            if (r1 <= 0) goto L_0x002b
            int r3 = r3 + 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            android.widget.TextView r1 = r4.f23889w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0049
            android.widget.TextView r1 = r4.f23889w
            android.text.TextPaint r1 = r1.getPaint()
            float r7 = r1.measureText(r7)
            int r7 = (int) r7
            if (r0 <= 0) goto L_0x0049
            int r1 = r7 / r0
            int r1 = r1 + r2
            int r7 = r7 % r0
            if (r7 <= 0) goto L_0x004a
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            int r3 = r3 + r1
            if (r3 <= r5) goto L_0x004e
            return r2
        L_0x004e:
            int r5 = kg3.C76577a.m92151b(r4, r6)
            android.widget.TextView r6 = r4.f23890x
            float r5 = (float) r5
            r6.setTextSize(r2, r5)
            android.widget.TextView r6 = r4.f23889w
            r6.setTextSize(r2, r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webwx.p129ui.ExtDeviceWXLoginUI.mo7536J7(int, int, java.lang.String):boolean");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7136ze;
    }

    public void initView() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LOGIN_EXT_DEVICE_INFO_INT;
        setMMTitle((String) null);
        setBackBtn(new C6614a(), C0966R.raw.actionbar_icon_close_black);
        hideActionbarLine();
        this.f23874e = getIntent().getStringExtra("intent.key.login.url");
        this.f23875f = getIntent().getStringExtra("intent.key.auto.login.switch.tip.string");
        this.f23873d = getIntent().getIntExtra("intent.key.type", 0);
        String stringExtra = getIntent().getStringExtra("intent.key.title.string");
        this.f23870C = getIntent().getIntExtra("intent.key.icon.type", 0);
        String stringExtra2 = getIntent().getStringExtra("intent.key.ok.string");
        String stringExtra3 = getIntent().getStringExtra("intent.key.cancel.string");
        String stringExtra4 = getIntent().getStringExtra("intent.key.content.string");
        this.f23876g = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f23877h = getIntent().getIntExtra("intent.key.login.client.version", 0);
        this.f23878i = getIntent().getIntExtra("intent.key.function.control", 0);
        this.f23880n = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        this.f23871D = getIntent().getStringExtra("intent.key.usage.link");
        this.f23885s = getIntent().getStringExtra("intent.key.spam.url");
        this.f23886t = getIntent().getIntExtra("intent.key.multi.device.tips.type", 0);
        this.f23887u = getIntent().getStringExtra("intent.key.multi.device.tips.string");
        Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s usage:%s iconType:%s multiDeviceTipsType:%s multiDeviceTipsStr:%s, funcCtrl:%s", Integer.valueOf(this.f23873d), stringExtra, stringExtra2, stringExtra4, this.f23871D, Integer.valueOf(this.f23870C), Integer.valueOf(this.f23886t), Util.secPrint(this.f23887u), Integer.valueOf(this.f23878i));
        setMMTitle("");
        this.f23888v = (TextView) findViewById(C0966R.C0970id.k1f);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f23888v.setText(stringExtra);
        }
        MsgSynchronizeABTestEvent msgSynchronizeABTestEvent = new MsgSynchronizeABTestEvent();
        msgSynchronizeABTestEvent.publish();
        MsgSynchronizeABTestEvent.C1092a aVar2 = msgSynchronizeABTestEvent.f9327d;
        int i = aVar2.f9328a;
        int i2 = aVar2.f9329b;
        int i3 = aVar2.f9330c;
        int i4 = this.f23870C;
        if (i4 == 1) {
            C97625j3.m125812b().mo105906u().mo119677K(aVar, 3);
        } else if (i4 == 2) {
            C97625j3.m125812b().mo105906u().mo119677K(aVar, 4);
        } else if (i4 != 8) {
            C97625j3.m125812b().mo105906u().mo119677K(aVar, 0);
        } else {
            C97625j3.m125812b().mo105906u().mo119677K(aVar, 2);
        }
        this.f23890x = (TextView) findViewById(C0966R.C0970id.f358787h32);
        if (this.f23886t != 0 && Util.isNullOrNil(this.f23887u)) {
            this.f23886t = 0;
        }
        this.f23868A = (RelativeLayout) findViewById(C0966R.C0970id.kbj);
        this.f23869B = (CheckBox) findViewById(C0966R.C0970id.kbi);
        if (i >= 0) {
            boolean z = (this.f23878i & 1) > 0;
            Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", Boolean.valueOf(z), Integer.valueOf(this.f23870C));
            int i5 = this.f23870C;
            if ((i5 == 1 && this.f23877h >= i2) || ((i5 == 2 && this.f23877h >= i3) || i5 == 8 || i5 == 3 || i5 == 11)) {
                this.f23883q = true;
                this.f23868A.setVisibility(this.f23880n ? 0 : 8);
                if (!z || !((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, Boolean.TRUE)).booleanValue()) {
                    this.f23869B.setChecked(false);
                } else {
                    this.f23869B.setChecked(true);
                }
                this.f23868A.setOnClickListener(new C6615b());
            }
        }
        this.f23891y = (RelativeLayout) findViewById(C0966R.C0970id.a1k);
        this.f23892z = (CheckBox) findViewById(C0966R.C0970id.a1i);
        if ((this.f23878i & 2) > 0) {
            this.f23891y.setVisibility(0);
            this.f23892z.setChecked((this.f23878i & 4) > 0);
            this.f23891y.setOnClickListener(new C6616c());
        } else {
            this.f23891y.setVisibility(8);
        }
        this.f23889w = (TextView) findViewById(C0966R.C0970id.k18);
        this.f23892z.post(new C6619d(stringExtra4));
        if (!Util.isNullOrNil(this.f23871D)) {
            int i6 = this.f23870C;
            if (i6 != 1 && i6 != 11 && i6 != 2 && i6 != 8 && i6 != 3) {
                addIconOptionMenu(0, C0966R.raw.icons_outlined_help, new C6621f());
            } else if (this.f23880n) {
                addIconOptionMenu(0, C0966R.raw.icons_outlined_help, new C6620e());
            }
        }
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.k1a);
        int i7 = this.f23870C;
        if (i7 == 1) {
            imageView.setImageResource(C0966R.raw.connect_pc);
        } else if (i7 == 2) {
            imageView.setImageResource(C0966R.raw.connect_mac);
        } else if (i7 == 3) {
            imageView.setImageResource(C0966R.raw.connect_ipad);
        } else if (i7 == 5) {
            imageView.setImageResource(C0966R.raw.connect_wx_album);
        } else if (i7 == 6) {
            imageView.setImageResource(C0966R.raw.ex_connect_car);
        } else if (i7 == 8) {
            imageView.setImageResource(C0966R.raw.connect_android_pad);
        } else if (i7 == 10) {
            imageView.setImageResource(C0966R.raw.connect_folder);
        } else {
            imageView.setImageResource(C0966R.raw.connect_pc);
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.lnk);
        this.f23882p = textView;
        textView.setText(stringExtra3);
        this.f23882p.setOnClickListener(new C6622g());
        this.f23881o = (Button) findViewById(C0966R.C0970id.lni);
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f23881o.setText(stringExtra2);
            int i8 = this.f23873d;
            if (i8 == 0) {
                this.f23881o.setEnabled(true);
            } else if (i8 == -1) {
                this.f23881o.setEnabled(false);
                if (this.f23870C == 5) {
                    this.f23882p.setVisibility(8);
                }
            } else if (i8 == -2) {
                this.f23881o.setEnabled(true);
            }
        } else {
            this.f23881o.setVisibility(4);
        }
        this.f23881o.setOnClickListener(new C6623h());
        C97625j3.m125815e().mo123455a(972, this);
        C97625j3.m125815e().mo123455a(973, this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.aku));
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        this.f23872E.alive();
    }

    public void onDestroy() {
        this.f23872E.dead();
        super.onDestroy();
        C97625j3.m125815e().mo123470p(972, this);
        C97625j3.m125815e().mo123470p(973, this);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C89349b bVar;
        ProgressDialog progressDialog = this.f23879j;
        String str3 = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f23879j = null;
        }
        if (i == 0 && i2 == 0) {
            Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i2), Integer.valueOf(i));
            C97625j3.m125815e().mo123470p(972, this);
            if (yVar.getType() == 972) {
                C8005h hVar = (C8005h) yVar;
                boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_device_to_device_msg_sync, 1) == 1;
                Log.m105919d("MicroMsg.ExtDeviceWXLoginUI", "deviceMsgSync:%s", Boolean.valueOf(z));
                if ((hVar.f26698f || this.f23884r) && z) {
                    C51515ua0 ua02 = (C51515ua0) hVar.f26697e.f127056b.f127083a;
                    byte[] f = (ua02 == null || (bVar = ua02.f142694d) == null) ? null : bVar.mo123703f();
                    MsgSynchronizeStartEvent msgSynchronizeStartEvent = new MsgSynchronizeStartEvent();
                    MsgSynchronizeStartEvent.C1093a aVar = msgSynchronizeStartEvent.f9331d;
                    aVar.f9332a = f;
                    aVar.f9333b = this.f23870C;
                    aVar.f9334c = this.f23884r;
                    C51515ua0 ua03 = (C51515ua0) hVar.f26697e.f127056b.f127083a;
                    if (!(ua03 == null || (str2 = ua03.f142695e) == null)) {
                        str3 = str2;
                    }
                    aVar.f9335d = str3;
                    msgSynchronizeStartEvent.publish();
                }
            } else {
                yVar.getType();
            }
            this.f23873d = 0;
            finish();
            return;
        }
        if (i2 == -1) {
            this.f23873d = -1;
        } else if (i2 == -2) {
            this.f23873d = -2;
        }
        if (!Util.isNullOrNil(str)) {
            ((TextView) findViewById(C0966R.C0970id.k18)).setVisibility(0);
            ((TextView) findViewById(C0966R.C0970id.k18)).setText(str);
        }
        int i3 = this.f23873d;
        if (i3 == -1) {
            Button button = this.f23881o;
            if (button != null) {
                button.setEnabled(false);
            }
        } else if (i3 == -2) {
            Button button2 = this.f23881o;
            if (button2 != null) {
                button2.setEnabled(true);
                this.f23881o.setText(C0966R.string.f361641li1);
            }
            TextView textView = this.f23882p;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
        Log.m105925i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8867a.class);
    }
}
