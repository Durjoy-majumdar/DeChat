package com.tencent.p014mm.plugin.teenmode.p111ui;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tenpay.C7112R;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TempSecureEditText;
import d14.C45252f;
import di3.C86312j;
import eb0.C75592q0;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import lc3.C117474c;
import ly2.C10685q;
import nj3.C76879j;
import ny2.C100255a0;
import ny2.C100258b0;
import ny2.C100259c0;
import ny2.C100264x;
import ny2.C100266z;
import ob0.C47350c;
import p244tt.C14088e;
import pb0.C47446b;
import pe3.C89349b;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48805b34;
import te3.C64221a34;
import te3.jq4;
import te3.kq4;
import wb2.C65946a;
import wx3.C15601d;
import z04.C112551y;
import z04.C119027c;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI */
public final class TeenModePrivatePwdUI extends MMWizardActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f282420o = 0;

    /* renamed from: e */
    public final C13601g f282421e = C36568h.m40985a(new C96520g(this));

    /* renamed from: f */
    public final C13601g f282422f = C36568h.m40985a(new C96522i(this));

    /* renamed from: g */
    public final C13601g f282423g = C36568h.m40985a(new C96521h(this));

    /* renamed from: h */
    public final C13601g f282424h = C36568h.m40985a(new C96519f(this));

    /* renamed from: i */
    public C89779i0 f282425i;

    /* renamed from: j */
    public MyKeyboardWindow f282426j;

    /* renamed from: n */
    public View f282427n;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$a */
    public static final class C5614a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f21542d;

        public C5614a(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f21542d = teenModePrivatePwdUI;
        }

        public final void run() {
            this.f21542d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$b */
    public static final class C5615b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f21543d;

        /* renamed from: e */
        public final /* synthetic */ TeenModePrivatePwdUI f21544e;

        public C5615b(TextView textView, TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f21543d = textView;
            this.f21544e = teenModePrivatePwdUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMWizardActivity.m7018M7(this.f21543d.getContext(), new Intent(this.f21543d.getContext(), TeenModeVerifyPwdUI.class), new Intent(this.f21543d.getContext(), SettingsTeenModeMain.class));
            this.f21544e.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$c */
    public static final class C5616c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f21545d;

        /* renamed from: e */
        public final /* synthetic */ TeenModePrivatePwdUI f21546e;

        public C5616c(TextView textView, TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f21545d = textView;
            this.f21546e = teenModePrivatePwdUI;
        }

        public final void onClick(View view) {
            Class cls = C14088e.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean uu = ((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalitebff7a643e2eefdb070cb79979b6ddd7f");
            if (uu) {
                if (((C14088e) C86312j.m106911c(cls)).mo13509NR("wxalitebff7a643e2eefdb070cb79979b6ddd7f") == null) {
                    if (((C14088e) C86312j.m106911c(cls)).mo13512Tg() == null) {
                        ((C14088e) C86312j.m106911c(cls)).Mk0();
                    }
                    ((C14088e) C86312j.m106911c(cls)).u50("wxalitebff7a643e2eefdb070cb79979b6ddd7f", (C115477b) null);
                    uu = false;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("appId", "wxalitebff7a643e2eefdb070cb79979b6ddd7f");
                    bundle.putInt("requestCode", 101);
                    Log.m105924i("MicroMsg.TeenModePrivatePwdUI", "open liteapp:wxalitebff7a643e2eefdb070cb79979b6ddd7f,page:");
                    ((C14088e) C86312j.m106911c(cls)).mo13510OP(this.f21545d.getContext(), bundle, true, false, (C14088e.C14090b) null);
                }
            }
            if (!uu) {
                TeenModePrivatePwdUI.m123801O7(this.f21546e, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=parental/resetpassword", 101, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$e */
    public static final class C5617e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f21547d;

        public C5617e(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f21547d = teenModePrivatePwdUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21547d.setResult(0);
            this.f21547d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$d */
    public static final class C96517d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f282428d;

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$d$a */
        public static final class C96518a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TeenModePrivatePwdUI f282429d;

            public C96518a(TeenModePrivatePwdUI teenModePrivatePwdUI) {
                this.f282429d = teenModePrivatePwdUI;
            }

            public final void run() {
                this.f282429d.finish();
            }
        }

        public C96517d(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f282428d = teenModePrivatePwdUI;
        }

        public void afterTextChanged(Editable editable) {
            Class<TeenModePrivatePwdUI> cls = TeenModePrivatePwdUI.class;
            C53934p0 p0Var = C53934p0.DEFAULT;
            Class cls2 = C65946a.class;
            boolean z = true;
            if (editable != null && editable.length() == 4) {
                TeenModePrivatePwdUI teenModePrivatePwdUI = this.f282428d;
                int i = TeenModePrivatePwdUI.f282420o;
                if (teenModePrivatePwdUI.mo134516R7() == 1 || this.f282428d.mo134516R7() == 5) {
                    TeenModePrivatePwdUI teenModePrivatePwdUI2 = this.f282428d;
                    teenModePrivatePwdUI2.getClass();
                    jq4 jq4 = new jq4();
                    jq4.f136261d = teenModePrivatePwdUI2.mo134514P7(teenModePrivatePwdUI2.mo134520V7());
                    teenModePrivatePwdUI2.f282425i = C76879j.m92723Q(teenModePrivatePwdUI2, teenModePrivatePwdUI2.getString(C0966R.string.a3h), teenModePrivatePwdUI2.getString(C0966R.string.jyc), true, false, (DialogInterface.OnCancelListener) null);
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127069d = 6895;
                    bVar.f127068c = "/cgi-bin/micromsg-bin/verifyteenagermodepwd";
                    bVar.f127066a = jq4;
                    bVar.f127067b = new kq4();
                    C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
                    C39622i0 a2 = C39818r.f106831a.mo62444c(teenModePrivatePwdUI2).mo75002a(cls2);
                    C87412m.m108593f(a2, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
                    LifecycleScope c3 = ((C65946a) a2).mo89983c3();
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60465c(c3, C58901s.f168555a, p0Var, new C100266z(a, teenModePrivatePwdUI2, (C15601d<? super C100266z>) null));
                } else if (this.f282428d.mo134516R7() == 2) {
                    if (this.f282428d.mo134518T7()) {
                        Intent intent = new Intent(this.f282428d.getContext(), cls);
                        intent.putExtra(StateEvent.ActionValue.STAGE_PASS, this.f282428d.mo134520V7());
                        intent.putExtra("intent_process", 2);
                        intent.putExtra("intent_process_step_one", false);
                        this.f282428d.startActivityForResult(intent, 100);
                    } else if (!this.f282428d.mo134520V7().equals(this.f282428d.getIntent().getStringExtra(StateEvent.ActionValue.STAGE_PASS))) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("result_err", this.f282428d.getString(C0966R.string.jya));
                        this.f282428d.setResult(0, intent2);
                        this.f282428d.finish();
                    } else {
                        TeenModePrivatePwdUI teenModePrivatePwdUI3 = this.f282428d;
                        teenModePrivatePwdUI3.f282425i = C76879j.m92723Q(teenModePrivatePwdUI3, teenModePrivatePwdUI3.getString(C0966R.string.a3h), teenModePrivatePwdUI3.getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
                        C64221a34 a342 = new C64221a34();
                        a342.f182012d = teenModePrivatePwdUI3.mo134514P7(teenModePrivatePwdUI3.mo134520V7());
                        a342.f182015g = 2;
                        a342.f182016h = ((C10685q) C86312j.m106911c(C10685q.class)).f32106f;
                        a342.f182017i = 2;
                        C47350c.C47352b bVar2 = new C47350c.C47352b();
                        bVar2.f127069d = 4277;
                        bVar2.f127068c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                        bVar2.f127066a = a342;
                        bVar2.f127067b = new C48805b34();
                        C45252f a3 = C47446b.f127269a.mo72464a(bVar2.mo72403a());
                        C39622i0 a4 = C39818r.f106831a.mo62444c(teenModePrivatePwdUI3).mo75002a(cls2);
                        C87412m.m108593f(a4, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
                        LifecycleScope c35 = ((C65946a) a4).mo89983c3();
                        C53896h0 h0Var2 = C53872d1.f151117a;
                        C53895h.m60465c(c35, C58901s.f168555a, p0Var, new C100264x(a3, teenModePrivatePwdUI3, (C15601d<? super C100264x>) null));
                    }
                } else if (this.f282428d.mo134516R7() != 3) {
                } else {
                    if (this.f282428d.mo134518T7()) {
                        Intent intent3 = new Intent(this.f282428d.getContext(), cls);
                        intent3.putExtra(StateEvent.ActionValue.STAGE_PASS, this.f282428d.mo134520V7());
                        intent3.putExtra("intent_process", 3);
                        intent3.putExtra("intent_process_step_one", false);
                        this.f282428d.startActivityForResult(intent3, 100);
                    } else if (!this.f282428d.mo134520V7().equals(this.f282428d.getIntent().getStringExtra(StateEvent.ActionValue.STAGE_PASS))) {
                        Intent intent4 = new Intent();
                        intent4.putExtra("result_err", this.f282428d.getString(C0966R.string.jya));
                        this.f282428d.setResult(0, intent4);
                        this.f282428d.finish();
                    } else {
                        Intent intent5 = new Intent(this.f282428d.getContext(), TeenModeGuardianInfoUI.class);
                        intent5.putExtra(StateEvent.ActionValue.STAGE_PASS, this.f282428d.mo134520V7());
                        TeenModePrivatePwdUI teenModePrivatePwdUI4 = this.f282428d;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent5);
                        TeenModePrivatePwdUI teenModePrivatePwdUI5 = teenModePrivatePwdUI4;
                        C117292a.m165358d(teenModePrivatePwdUI5, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$4", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        teenModePrivatePwdUI4.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(teenModePrivatePwdUI5, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$4", "afterTextChanged", "(Landroid/text/Editable;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        C119179t tVar = C119157j.f356862d;
                        C96518a aVar2 = new C96518a(this.f282428d);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(aVar2, 200, false);
                    }
                }
            } else {
                if (editable == null || editable.length() != 0) {
                    z = false;
                }
                if (!z) {
                    TeenModePrivatePwdUI teenModePrivatePwdUI6 = this.f282428d;
                    int i2 = TeenModePrivatePwdUI.f282420o;
                    teenModePrivatePwdUI6.mo134519U7();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$f */
    public static final class C96519f extends C87413o implements C32224a<TempSecureEditText> {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f282430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96519f(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            super(0);
            this.f282430d = teenModePrivatePwdUI;
        }

        public Object invoke() {
            return (TempSecureEditText) this.f282430d.findViewById(C0966R.C0970id.hrc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$g */
    public static final class C96520g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f282431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96520g(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            super(0);
            this.f282431d = teenModePrivatePwdUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f282431d.getIntent().getIntExtra("intent_process", -1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$h */
    public static final class C96521h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f282432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96521h(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            super(0);
            this.f282432d = teenModePrivatePwdUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f282432d.getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$i */
    public static final class C96522i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f282433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96522i(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            super(0);
            this.f282433d = teenModePrivatePwdUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f282433d.getIntent().getBooleanExtra("intent_process_step_one", true));
        }
    }

    /* renamed from: O7 */
    public static final void m123801O7(TeenModePrivatePwdUI teenModePrivatePwdUI, String str, int i, boolean z) {
        teenModePrivatePwdUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        if (i > 0) {
            C88144b.m109795m(teenModePrivatePwdUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(teenModePrivatePwdUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        ((C10685q) C86312j.m106911c(C10685q.class)).mo10757ri(30);
    }

    /* renamed from: N7 */
    public final byte[] mo134513N7(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            Log.m105925i("MicroMsg.TeenModePrivatePwdUI", "HmacSHA256Encrypt: %s   %s   %s", Util.encodeHexString(bArr), Util.encodeHexString(bArr2), Util.encodeHexString(instance.doFinal(bArr2)));
            byte[] doFinal = instance.doFinal(bArr2);
            C87412m.m108593f(doFinal, "sha256_HMAC.doFinal(secretKey)");
            return doFinal;
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: P7 */
    public final C89349b mo134514P7(String str) {
        Log.m105925i("MicroMsg.TeenModePrivatePwdUI", "getEncryptBuf, %s, %s", str, C86709a0.m107523b().mo121111i());
        Charset charset = C119027c.f356488a;
        byte[] bytes = str.getBytes(charset);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String i = C86709a0.m107523b().mo121111i();
        C87412m.m108593f(i, "account().getUinString()");
        byte[] bytes2 = i.getBytes(charset);
        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] N7 = mo134513N7(bytes, bytes2);
        String i2 = C86709a0.m107523b().mo121111i();
        C87412m.m108593f(i2, "account().getUinString()");
        byte[] bytes3 = i2.getBytes(charset);
        C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
        byte[] N72 = mo134513N7(N7, bytes3);
        return new C89349b(N72, 0, N72.length);
    }

    /* renamed from: Q7 */
    public final TempSecureEditText mo134515Q7() {
        Object value = ((C36570n) this.f282424h).getValue();
        C87412m.m108593f(value, "<get-passInput>(...)");
        return (TempSecureEditText) value;
    }

    /* renamed from: R7 */
    public final int mo134516R7() {
        return ((Number) ((C36570n) this.f282421e).getValue()).intValue();
    }

    /* renamed from: S7 */
    public final int mo134517S7() {
        return ((Number) ((C36570n) this.f282423g).getValue()).intValue();
    }

    /* renamed from: T7 */
    public final boolean mo134518T7() {
        return ((Boolean) ((C36570n) this.f282422f).getValue()).booleanValue();
    }

    /* renamed from: U7 */
    public final void mo134519U7() {
        int i = mo134517S7() == 1 ? C0966R.string.jy8 : C0966R.string.f361442jy0;
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357845c22);
        if (mo134518T7()) {
            textView.setText(getString(i));
            textView.setTextColor(textView.getResources().getColor(C0966R.color.a7e));
            textView.setVisibility((mo134516R7() == 1 || mo134516R7() == 5) ? 8 : 0);
        }
    }

    /* renamed from: V7 */
    public final String mo134520V7() {
        return mo134515Q7().getText().toString();
    }

    /* renamed from: W7 */
    public final void mo134521W7(String str) {
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357845c22);
        textView.setText(str);
        textView.setVisibility(0);
        textView.setTextColor(textView.getResources().getColor(C0966R.color.f2966ao));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8o;
    }

    public final void hideTenpayKB() {
        View view = this.f282427n;
        if (view == null) {
            C87412m.m108603p("mKBLayout");
            throw null;
        } else if (view == null) {
            C87412m.m108603p("mKBLayout");
            throw null;
        } else if (view.isShown()) {
            View view2 = this.f282427n;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("mKBLayout");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("result_err");
            if (stringExtra == null) {
                stringExtra = "";
            }
            mo134521W7(stringExtra);
        } else if (i == 101 && intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("result_data");
            Map map = (Map) (bundleExtra != null ? bundleExtra.getSerializable("next_params") : null);
            Log.m105925i("MicroMsg.TeenModePrivatePwdUI", "onActivityResult: %s", map);
            if (map != null && C112551y.m153809i("goback", (String) map.get("next_step"), true)) {
                if (mo134517S7() == 3) {
                    Intent intent2 = new Intent(getContext(), SettingsTeenModeMain.class);
                    intent2.addFlags(67108864);
                    intent2.putExtra("intent_close_me", true);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    finish();
                }
            }
            ((C117474c) C86312j.m106911c(C117474c.class)).yn0().mo182766j(7);
            C86709a0.m107524d().mo123460f(new C68143w(C75592q0.m90789s()));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        Log.m105924i("MicroMsg.TeenModePrivatePwdUI", "process:{" + mo134516R7() + "}, scene:{" + mo134517S7() + "}, stepOne:" + mo134518T7());
        if (mo134516R7() == 4) {
            Intent intent = new Intent(this, SettingsTeenModeMain.class);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C119179t tVar = C119157j.f356862d;
            C5614a aVar2 = new C5614a(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar2, 200, false);
            return;
        }
        int i = C0966R.string.jxy;
        if (mo134516R7() == 3 && !mo134518T7()) {
            i = C0966R.string.jxz;
        } else if (mo134516R7() == 1 || mo134516R7() == 5) {
            i = mo134517S7() == 3 ? C0966R.string.jy7 : C0966R.string.jy9;
        } else if (mo134516R7() == 2) {
            i = mo134518T7() ? C0966R.string.jy5 : C0966R.string.jy6;
            ((C10685q) C86312j.m106911c(C10685q.class)).mo10757ri(15);
        }
        ((TextView) findViewById(C0966R.C0970id.knx)).setText(getString(i));
        mo134519U7();
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359334kb2);
        if (mo134516R7() == 3 && mo134517S7() != 1 && mo134518T7()) {
            textView.setVisibility(0);
        }
        textView.setOnClickListener(new C5615b(textView, this));
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f358318ee2);
        if (mo134516R7() == 1 && mo134517S7() != 3) {
            ViewParent parent = textView2.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView2.setOnClickListener(new C5616c(textView2, this));
        mo134515Q7().addTextChangedListener(new C96517d(this));
        int i2 = C7112R.C7115id.kh4;
        View findViewById = findViewById(i2);
        if (findViewById != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById2 = findViewById(C7112R.C7115id.f361868tenpay_keyboard_top_line);
        if (findViewById2 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view4 = findViewById2;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TempSecureEditText Q7 = mo134515Q7();
        View findViewById3 = findViewById(C7112R.C7115id.f361869tenpay_num_keyboard);
        C87412m.m108592e(findViewById3, "null cannot be cast to non-null type com.tenpay.android.wechat.MyKeyboardWindow");
        this.f282426j = (MyKeyboardWindow) findViewById3;
        View findViewById4 = findViewById(C7112R.C7115id.f361867tenpay_keyboard_layout);
        C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.view.View");
        this.f282427n = findViewById4;
        View findViewById5 = findViewById(i2);
        C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.view.View");
        if (this.f282426j == null) {
            C87412m.m108603p("mKeyboard");
            throw null;
        } else if (this.f282427n != null) {
            View.OnFocusChangeListener onFocusChangeListener = Q7.getOnFocusChangeListener();
            hideVKB();
            Q7.setInputType(0);
            Q7.setPwdLength(4);
            Q7.setOnFocusChangeListener(new C100255a0(this, false, onFocusChangeListener, 0, Q7));
            Q7.setOnClickListener(new C100258b0(this, false, 0, Q7));
            findViewById5.setOnClickListener(new C100259c0(this));
            showTenpayKB();
            mo134515Q7().setIsPasswordFormat(true, true);
            mo134515Q7().requestFocus();
            setBackBtn(new C5617e(this));
        } else {
            C87412m.m108603p("mKBLayout");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        mo134515Q7().setText("");
    }

    public final void showTenpayKB() {
        View view = this.f282427n;
        if (view == null) {
            C87412m.m108603p("mKBLayout");
            throw null;
        } else if (view == null) {
            C87412m.m108603p("mKBLayout");
            throw null;
        } else if (!view.isShown()) {
            View view2 = this.f282427n;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("mKBLayout");
            throw null;
        }
    }
}
