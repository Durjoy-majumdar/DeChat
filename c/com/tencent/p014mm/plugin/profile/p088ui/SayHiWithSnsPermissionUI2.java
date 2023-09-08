package com.tencent.p014mm.plugin.profile.p088ui;

import a22.C67001a;
import ae3.C67030b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b22.C28250a;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.autogen.events.RecoverAccountFriendEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.C70142g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import ff2.C8021d;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je0.C46498v;
import je0.C46500x;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lm0.C88585e;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import p011cm.C39989b;
import p629ny.C76979h;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import tc2.C118418g;
import wd3.C78543a;
import wd3.C78553c1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2 */
public class SayHiWithSnsPermissionUI2 extends MMActivity implements C11385n, C7020t0 {

    /* renamed from: c1 */
    public static final /* synthetic */ int f202806c1 = 0;

    /* renamed from: A */
    public int[] f202807A = new int[8];

    /* renamed from: B */
    public boolean f202808B = false;

    /* renamed from: C */
    public boolean f202809C = false;

    /* renamed from: D */
    public boolean f202810D = false;

    /* renamed from: E */
    public boolean f202811E = false;

    /* renamed from: F */
    public View f202812F;

    /* renamed from: G */
    public List<String> f202813G = new ArrayList();

    /* renamed from: H */
    public ArrayList<String> f202814H = new ArrayList<>();

    /* renamed from: I */
    public KeyboardHeightProvider f202815I;

    /* renamed from: J */
    public ArrayList<String> f202816J = new ArrayList<>();

    /* renamed from: K */
    public LinearLayout f202817K;

    /* renamed from: L */
    public TextView f202818L;

    /* renamed from: M */
    public Button f202819M;

    /* renamed from: N */
    public boolean f202820N = false;

    /* renamed from: P */
    public boolean f202821P = false;

    /* renamed from: Q */
    public boolean f202822Q = false;

    /* renamed from: Q0 */
    public final boolean[] f202823Q0 = {true};

    /* renamed from: R */
    public String f202824R;

    /* renamed from: R0 */
    public final boolean[] f202825R0 = {false};

    /* renamed from: S */
    public String f202826S;

    /* renamed from: S0 */
    public boolean f202827S0 = true;

    /* renamed from: T */
    public int f202828T = 0;

    /* renamed from: T0 */
    public long f202829T0 = System.currentTimeMillis();

    /* renamed from: U */
    public boolean f202830U;

    /* renamed from: U0 */
    public int f202831U0 = 0;

    /* renamed from: V */
    public int f202832V;

    /* renamed from: V0 */
    public int f202833V0 = 0;

    /* renamed from: W */
    public int f202834W;

    /* renamed from: W0 */
    public C77398g f202835W0 = null;

    /* renamed from: X */
    public List<String> f202836X = new ArrayList();

    /* renamed from: X0 */
    public View f202837X0;

    /* renamed from: Y */
    public HashSet<String> f202838Y = new HashSet<>();

    /* renamed from: Y0 */
    public EditText f202839Y0;

    /* renamed from: Z */
    public HashSet<String> f202840Z = new HashSet<>();

    /* renamed from: Z0 */
    public TextView f202841Z0;

    /* renamed from: a1 */
    public String f202842a1;

    /* renamed from: b1 */
    public View f202843b1;

    /* renamed from: d */
    public EditText f202844d;

    /* renamed from: e */
    public EditText f202845e;

    /* renamed from: f */
    public View f202846f;

    /* renamed from: g */
    public TextView f202847g;

    /* renamed from: h */
    public TextView f202848h;

    /* renamed from: i */
    public TextView f202849i;

    /* renamed from: j */
    public MMSwitchBtn f202850j;

    /* renamed from: n */
    public MMSwitchBtn f202851n;

    /* renamed from: o */
    public WeImageView f202852o;

    /* renamed from: p */
    public WeImageView f202853p;

    /* renamed from: p0 */
    public HashSet<String> f202854p0 = new HashSet<>();

    /* renamed from: q */
    public TextView f202855q;

    /* renamed from: r */
    public ProgressDialog f202856r = null;

    /* renamed from: s */
    public String f202857s;

    /* renamed from: t */
    public String f202858t;

    /* renamed from: u */
    public String f202859u;

    /* renamed from: v */
    public String f202860v;

    /* renamed from: w */
    public String f202861w;

    /* renamed from: x */
    public int f202862x;

    /* renamed from: x0 */
    public HashSet<String> f202863x0 = new HashSet<>();

    /* renamed from: y */
    public boolean f202864y;

    /* renamed from: y0 */
    public CharSequence f202865y0 = null;

    /* renamed from: z */
    public boolean f202866z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$a */
    public class C4964a implements View.OnClickListener {
        public C4964a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (SayHiWithSnsPermissionUI2.this.f202853p.getVisibility() != 0) {
                SayHiWithSnsPermissionUI2.this.f202852o.setVisibility(4);
                SayHiWithSnsPermissionUI2.this.f202853p.setVisibility(0);
                View findViewById = SayHiWithSnsPermissionUI2.this.findViewById(C0966R.C0970id.hhw);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SayHiWithSnsPermissionUI2.this.mo96698Q7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$b */
    public class C4965b implements DialogInterface.OnClickListener {
        public C4965b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SayHiWithSnsPermissionUI2.this.mo96695N7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$c */
    public class C4966c implements C47883u {
        public C4966c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            SayHiWithSnsPermissionUI2.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(SayHiWithSnsPermissionUI2.this));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(SayHiWithSnsPermissionUI2.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$d */
    public class C4967d implements View.OnClickListener {
        public C4967d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI2.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$f */
    public class C4968f implements View.OnFocusChangeListener {
        public C4968f() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                if (!Util.isNullOrNil(SayHiWithSnsPermissionUI2.this.f202845e.getHint()) && Util.isNullOrNil((CharSequence) SayHiWithSnsPermissionUI2.this.f202845e.getText())) {
                    EditText editText = SayHiWithSnsPermissionUI2.this.f202845e;
                    editText.setText(editText.getHint());
                    SayHiWithSnsPermissionUI2.this.f202845e.setHint((CharSequence) null);
                }
                SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                sayHiWithSnsPermissionUI2.f202822Q = true;
                EditText editText2 = sayHiWithSnsPermissionUI2.f202845e;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$k */
    public class C4969k implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ int f20249a;

        public C4969k(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2, int i) {
            this.f20249a = i;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VERIFY_CONATCT_SET_DEFAULT_CHATONLY_PROMPT_TIMES_INT_SYNC, Integer.valueOf(this.f20249a + 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$l */
    public class C4970l implements View.OnClickListener {
        public C4970l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (SayHiWithSnsPermissionUI2.this.f202852o.getVisibility() != 0) {
                SayHiWithSnsPermissionUI2.this.f202852o.setVisibility(0);
                SayHiWithSnsPermissionUI2.this.f202853p.setVisibility(4);
                View findViewById = SayHiWithSnsPermissionUI2.this.findViewById(C0966R.C0970id.hhw);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SayHiWithSnsPermissionUI2.this.mo96698Q7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m */
    public class C4971m extends ClickableSpan {

        /* renamed from: d */
        public String f20251d;

        public C4971m(String str) {
            this.f20251d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            String nullAsNil = Util.nullAsNil(C77382c.m93287e(this.f20251d, 32));
            if (!(nullAsNil == null || this.f20251d == null || nullAsNil.length() >= this.f20251d.length())) {
                SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                Toast.makeText(sayHiWithSnsPermissionUI2, sayHiWithSnsPermissionUI2.getString(C0966R.string.hza), 0).show();
            }
            EditText editText = SayHiWithSnsPermissionUI2.this.f202845e;
            SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI22 = SayHiWithSnsPermissionUI2.this;
            editText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(sayHiWithSnsPermissionUI22, nullAsNil, sayHiWithSnsPermissionUI22.f202845e.getTextSize()));
            SayHiWithSnsPermissionUI2.this.f202845e.setSelection(nullAsNil.length());
            View view2 = SayHiWithSnsPermissionUI2.this.f202846f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SayHiWithSnsPermissionUI2.this.f202807A[4] = 1;
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(SayHiWithSnsPermissionUI2.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$e */
    public class C70206e implements TextWatcher {
        public C70206e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C118418g gVar = C118418g.INSTANCE;
            boolean[] zArr = SayHiWithSnsPermissionUI2.this.f202823Q0;
            if (zArr[0]) {
                zArr[0] = false;
                gVar.mo175830qv("ie_ver_usr");
            }
            gVar.mo175802VZ("ie_ver_usr");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g */
    public class C70207g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f202868d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$a */
        public class C70208a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46498v f202870d;

            public C70208a(C70207g gVar, C46498v vVar) {
                this.f202870d = vVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202870d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$b */
        public class C70209b implements C39989b.C0706c {

            /* renamed from: a */
            public final /* synthetic */ String f202871a;

            /* renamed from: b */
            public final /* synthetic */ String f202872b;

            /* renamed from: c */
            public final /* synthetic */ String f202873c;

            /* renamed from: d */
            public final /* synthetic */ Map f202874d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList f202875e;

            /* renamed from: f */
            public final /* synthetic */ LinkedList f202876f;

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$b$a */
            public class C70210a implements C39989b.C0706c {
                public C70210a(C70209b bVar) {
                }

                /* renamed from: a */
                public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                    return true;
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$b$b */
            public class C70211b implements C78553c1.C78560f {
                public C70211b() {
                }

                /* renamed from: a */
                public void mo62593a() {
                    SayHiWithSnsPermissionUI2.this.f202833V0++;
                }

                /* renamed from: b */
                public void mo62594b() {
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                    int i = SayHiWithSnsPermissionUI2.f202806c1;
                    sayHiWithSnsPermissionUI2.mo96691J7();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$b$c */
            public class C70212c implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78543a f202879d;

                public C70212c(C70209b bVar, C78543a aVar) {
                    this.f202879d = aVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202879d.getClass();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$b$d */
            public class C70213d implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78553c1 f202880d;

                public C70213d(C70209b bVar, C78553c1 c1Var) {
                    this.f202880d = c1Var;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202880d.mo108525a();
                }
            }

            public C70209b(String str, String str2, String str3, Map map, LinkedList linkedList, LinkedList linkedList2) {
                this.f202871a = str;
                this.f202872b = str2;
                this.f202873c = str3;
                this.f202874d = map;
                this.f202875e = linkedList;
                this.f202876f = linkedList2;
            }

            /* renamed from: a */
            public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                if (i == -4000) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "addTextOptionMenu:send addcontact.");
                    C78543a aVar = new C78543a(SayHiWithSnsPermissionUI2.this, (C39989b.C0705b) null);
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                    aVar.f230031E = sayHiWithSnsPermissionUI2.f202820N ? "" : this.f202871a;
                    String str5 = this.f202872b;
                    String str6 = this.f202873c;
                    aVar.f230048t = str5;
                    aVar.f230049u = str6;
                    aVar.f230032F = this.f202874d;
                    aVar.f230047s = sayHiWithSnsPermissionUI2.f202857s;
                    aVar.f230036e = new C70210a(this);
                    aVar.f230051w = false;
                    aVar.f230030D = new C70211b();
                    aVar.f230034H = str4;
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI2.this.f202858t);
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI22 = SayHiWithSnsPermissionUI2.this;
                    aVar.mo108507j(sayHiWithSnsPermissionUI22, z1Var, sayHiWithSnsPermissionUI22.f202858t, this.f202875e);
                    SayHiWithSnsPermissionUI2.this.mo96692K7();
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI23 = SayHiWithSnsPermissionUI2.this;
                    sayHiWithSnsPermissionUI23.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI23.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.ilx), true, true, new C70212c(this, aVar));
                } else {
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI24 = SayHiWithSnsPermissionUI2.this;
                    if (sayHiWithSnsPermissionUI24.f202820N) {
                        sayHiWithSnsPermissionUI24.getClass();
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(sayHiWithSnsPermissionUI24.f202858t);
                        if (z1Var2 != null) {
                            sayHiWithSnsPermissionUI24.f202842a1 = sayHiWithSnsPermissionUI24.getResources().getString(C0966R.string.bsz, new Object[]{z1Var2.getNickname()});
                        } else {
                            sayHiWithSnsPermissionUI24.f202842a1 = sayHiWithSnsPermissionUI24.getResources().getString(C0966R.string.f360312bt0);
                        }
                        sayHiWithSnsPermissionUI24.f202837X0 = View.inflate(sayHiWithSnsPermissionUI24, C0966R.C0971layout.bwo, (ViewGroup) null);
                        Object[] objArr = new Object[3];
                        objArr[0] = Boolean.valueOf(sayHiWithSnsPermissionUI24.f202842a1 == null);
                        String str7 = sayHiWithSnsPermissionUI24.f202842a1;
                        objArr[1] = Integer.valueOf(str7 == null ? 0 : str7.length());
                        objArr[2] = sayHiWithSnsPermissionUI24.f202842a1;
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
                        if (!Util.isNullOrNil(sayHiWithSnsPermissionUI24.f202842a1)) {
                            ((TextView) sayHiWithSnsPermissionUI24.f202837X0.findViewById(C0966R.C0970id.jc8)).setText(sayHiWithSnsPermissionUI24.f202842a1);
                        }
                        sayHiWithSnsPermissionUI24.f202843b1 = sayHiWithSnsPermissionUI24.f202837X0.findViewById(C0966R.C0970id.cd8);
                        sayHiWithSnsPermissionUI24.f202839Y0 = (EditText) sayHiWithSnsPermissionUI24.f202837X0.findViewById(C0966R.C0970id.jc7);
                        TextView textView = (TextView) sayHiWithSnsPermissionUI24.f202837X0.findViewById(C0966R.C0970id.lr4);
                        sayHiWithSnsPermissionUI24.f202841Z0 = textView;
                        textView.setVisibility(0);
                        sayHiWithSnsPermissionUI24.f202839Y0.setText((CharSequence) null);
                        sayHiWithSnsPermissionUI24.f202841Z0.setText(String.valueOf(50));
                        sayHiWithSnsPermissionUI24.f202839Y0.setVisibility(8);
                        View view = sayHiWithSnsPermissionUI24.f202843b1;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C77398g z = C76879j.m92755z(sayHiWithSnsPermissionUI24, "", (String) null, sayHiWithSnsPermissionUI24.getString(C0966R.string.bsx), sayHiWithSnsPermissionUI24.f202837X0, new C70294u2(sayHiWithSnsPermissionUI24), new C70296v2(sayHiWithSnsPermissionUI24));
                        sayHiWithSnsPermissionUI24.f202835W0 = z;
                        if (z == null) {
                            sayHiWithSnsPermissionUI24.onStop();
                        }
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "dealAddContactError, resend request ver.");
                        String stringExtra = SayHiWithSnsPermissionUI2.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI2.this.getIntent().getStringExtra("source_from_nick_name");
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI25 = SayHiWithSnsPermissionUI2.this;
                        C78553c1 c1Var = new C78553c1(sayHiWithSnsPermissionUI25, (C39989b.C39992e) null);
                        c1Var.f230112q = this.f202871a;
                        c1Var.f230114s = stringExtra;
                        c1Var.f230115t = stringExtra2;
                        c1Var.f230113r = this.f202874d;
                        c1Var.f230116u = sayHiWithSnsPermissionUI25.f202857s;
                        c1Var.mo108533i(this.f202876f, this.f202875e);
                        SayHiWithSnsPermissionUI2.this.mo96692K7();
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI26 = SayHiWithSnsPermissionUI2.this;
                        sayHiWithSnsPermissionUI26.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI26.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.ilx), true, true, new C70213d(this, c1Var));
                    }
                }
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$c */
        public class C70214c implements C78553c1.C78560f {
            public C70214c() {
            }

            /* renamed from: a */
            public void mo62593a() {
                SayHiWithSnsPermissionUI2.this.f202833V0++;
            }

            /* renamed from: b */
            public void mo62594b() {
                SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                int i = SayHiWithSnsPermissionUI2.f202806c1;
                sayHiWithSnsPermissionUI2.mo96691J7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$d */
        public class C70215d implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C78543a f202882d;

            public C70215d(C70207g gVar, C78543a aVar) {
                this.f202882d = aVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f202882d.getClass();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$e */
        public class C70216e implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46500x f202883d;

            public C70216e(C70207g gVar, C46500x xVar) {
                this.f202883d = xVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202883d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g$f */
        public class C70217f implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C44590b1 f202884d;

            public C70217f(C70207g gVar, C44590b1 b1Var) {
                this.f202884d = b1Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202884d);
            }
        }

        public C70207g(String str) {
            this.f202868d = str;
        }

        public void onClick(View view) {
            boolean z;
            boolean z2;
            C118418g gVar = C118418g.INSTANCE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProgressDialog progressDialog = SayHiWithSnsPermissionUI2.this.f202856r;
            if (progressDialog == null || !progressDialog.isShowing()) {
                boolean[] zArr = SayHiWithSnsPermissionUI2.this.f202825R0;
                if (zArr[0]) {
                    zArr[0] = false;
                } else {
                    gVar.Ud0("ce_ver_usr", "<VerifyUsr>", this.f202868d);
                    gVar.mo175827n9("ce_ver_usr", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                    gVar.ec0("ce_ver_usr");
                }
                gVar.mo175799SP(this.f202868d, 3);
                SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
                if (sayHiWithSnsPermissionUI2.f202864y) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(SayHiWithSnsPermissionUI2.this.f202858t);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(Integer.valueOf(SayHiWithSnsPermissionUI2.this.f202862x));
                    String M7 = SayHiWithSnsPermissionUI2.this.mo96694M7();
                    HashMap hashMap = new HashMap();
                    if (SayHiWithSnsPermissionUI2.this.f202852o.getVisibility() != 0) {
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI22 = SayHiWithSnsPermissionUI2.this;
                        z2 = sayHiWithSnsPermissionUI22.f202850j.f220433y;
                        if (sayHiWithSnsPermissionUI22.f202851n.f220433y) {
                            z2 |= true;
                        }
                    } else {
                        z2 = false;
                    }
                    if (SayHiWithSnsPermissionUI2.this.f202852o.getVisibility() == 0) {
                        z2 |= true;
                    }
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI23 = SayHiWithSnsPermissionUI2.this;
                    sayHiWithSnsPermissionUI23.f202831U0 = z2 ? 1 : 0;
                    hashMap.put(sayHiWithSnsPermissionUI23.f202858t, Integer.valueOf(z2));
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI2", "select sns permission, %s", Integer.valueOf(z2));
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI24 = SayHiWithSnsPermissionUI2.this;
                    if (sayHiWithSnsPermissionUI24.f202811E) {
                        C46498v vVar = new C46498v(SayHiWithSnsPermissionUI2.this.f202858t, M7, sayHiWithSnsPermissionUI24.getIntent().getStringExtra("AntispamTicket"), z2);
                        C97625j3.m125815e().mo123460f(vVar);
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI25 = SayHiWithSnsPermissionUI2.this;
                        sayHiWithSnsPermissionUI25.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI25.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.ilx), true, true, new C70208a(this, vVar));
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "addTextOptionMenu:send addcontact.");
                        String stringExtra = SayHiWithSnsPermissionUI2.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI2.this.getIntent().getStringExtra("source_from_nick_name");
                        C78543a aVar = new C78543a(SayHiWithSnsPermissionUI2.this, (C39989b.C0705b) null);
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI26 = SayHiWithSnsPermissionUI2.this;
                        aVar.f230031E = sayHiWithSnsPermissionUI26.f202820N ? "" : M7;
                        aVar.f230048t = stringExtra;
                        aVar.f230049u = stringExtra2;
                        aVar.f230032F = hashMap;
                        aVar.f230047s = sayHiWithSnsPermissionUI26.f202857s;
                        C70209b bVar = r0;
                        C78543a aVar2 = aVar;
                        C70209b bVar2 = new C70209b(M7, stringExtra, stringExtra2, hashMap, linkedList2, linkedList);
                        aVar2.f230036e = bVar;
                        aVar2.f230051w = false;
                        aVar2.f230030D = new C70214c();
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI2.this.f202858t);
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI27 = SayHiWithSnsPermissionUI2.this;
                        aVar2.mo108507j(sayHiWithSnsPermissionUI27, z1Var, sayHiWithSnsPermissionUI27.f202858t, linkedList2);
                        SayHiWithSnsPermissionUI2.this.mo96692K7();
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI28 = SayHiWithSnsPermissionUI2.this;
                        sayHiWithSnsPermissionUI28.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI28.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.ilx), true, true, new C70215d(this, aVar2));
                    }
                } else if (sayHiWithSnsPermissionUI2.f202866z) {
                    String stringExtra3 = sayHiWithSnsPermissionUI2.getIntent().getStringExtra("Verify_ticket");
                    if (SayHiWithSnsPermissionUI2.this.f202852o.getVisibility() != 0) {
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI29 = SayHiWithSnsPermissionUI2.this;
                        boolean z3 = sayHiWithSnsPermissionUI29.f202850j.f220433y;
                        z = sayHiWithSnsPermissionUI29.f202851n.f220433y ? z3 | true : z3;
                    } else {
                        z = false;
                    }
                    if (SayHiWithSnsPermissionUI2.this.f202852o.getVisibility() == 0) {
                        z |= true;
                    }
                    SayHiWithSnsPermissionUI2.this.f202831U0 = z ? 1 : 0;
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI2", "select sns permission, %s", Integer.valueOf(z));
                    SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI210 = SayHiWithSnsPermissionUI2.this;
                    if (sayHiWithSnsPermissionUI210.f202811E) {
                        C46500x xVar = new C46500x(sayHiWithSnsPermissionUI210.f202858t, stringExtra3, z);
                        C97625j3.m125815e().mo123460f(xVar);
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI211 = SayHiWithSnsPermissionUI2.this;
                        sayHiWithSnsPermissionUI211.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI211.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.blp), true, true, new C70216e(this, xVar));
                    } else {
                        C44590b1 b1Var = new C44590b1(3, sayHiWithSnsPermissionUI210.f202858t, stringExtra3, sayHiWithSnsPermissionUI210.f202862x, sayHiWithSnsPermissionUI210.f202857s, z ? 1 : 0);
                        C97625j3.m125815e().mo123460f(b1Var);
                        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI212 = SayHiWithSnsPermissionUI2.this;
                        sayHiWithSnsPermissionUI212.f202856r = C76879j.m92723Q(sayHiWithSnsPermissionUI212.getContext(), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI2.this.getString(C0966R.string.blp), true, true, new C70217f(this, b1Var));
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$h */
    public class C70218h implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ String f202885d;

        public C70218h(String str) {
            this.f202885d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            if (r11 != 6) goto L_0x0048;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r11)
                r1.add(r12)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$5"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r10
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r11 = r12.getAction()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "ce_ver_usr"
                if (r11 == 0) goto L_0x003b
                if (r11 == r2) goto L_0x0034
                r4 = 5
                if (r11 == r4) goto L_0x003b
                r2 = 6
                if (r11 == r2) goto L_0x0034
                goto L_0x0048
            L_0x0034:
                r0.mo175827n9(r3, r12)
                r0.ec0(r3)
                goto L_0x0048
            L_0x003b:
                com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2 r11 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.this
                boolean[] r11 = r11.f202825R0
                r11[r1] = r2
                java.lang.String r11 = r10.f202885d
                java.lang.String r12 = "<VerifyUsr>"
                r0.Ud0(r3, r12, r11)
            L_0x0048:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2$5"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.C70218h.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$i */
    public class C70219i implements MenuItem.OnMenuItemClickListener {
        public C70219i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI2.this;
            if (sayHiWithSnsPermissionUI2.f202866z) {
                sayHiWithSnsPermissionUI2.f202807A[1] = 1;
            }
            sayHiWithSnsPermissionUI2.finish();
            SayHiWithSnsPermissionUI2.this.mo96696O7(false);
            SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI22 = SayHiWithSnsPermissionUI2.this;
            sayHiWithSnsPermissionUI22.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C70299w2(sayHiWithSnsPermissionUI22, 2));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$j */
    public class C70220j implements C77382c.C77383a {
        public C70220j(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2) {
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
        }

        /* renamed from: L3 */
        public void mo4084L3(String str) {
        }

        /* renamed from: P4 */
        public void mo4086P4(String str) {
        }
    }

    /* renamed from: H7 */
    public final void mo96689H7(List<String> list) {
        C72985m3 bD = C75743h.wx0().mo101190bD(this.f202858t);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202858t);
        if (list != null && list.contains(this.f202858t)) {
            if (((int) z1Var.f108320R1) == 0) {
                z1Var = C67030b.m79190e(bD);
                z1Var.setUsername(this.f202858t);
                if (!C97625j3.m125812b().mo105907v().mo69667P3(z1Var)) {
                    Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI2", "canAddContact fail, insert fail");
                    return;
                }
            }
            C45628s0.m50775g0(z1Var);
            ((MMNotification) C97625j3.m125816f()).mo93209g();
            C75743h.vx0().mo101171bF(this.f202858t, 1);
            C67030b.m79194i(this.f202858t, this.f202862x);
        }
    }

    /* renamed from: I7 */
    public final boolean mo96690I7(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    /* renamed from: J7 */
    public final void mo96691J7() {
        if (this.f202864y) {
            String trim = this.f202844d.getText().toString().trim();
            if (Util.isNullOrNil(trim) || trim.equals(this.f202865y0) || !Util.isNullOrNil(this.f202857s)) {
                C97625j3.m125812b().mo105906u().mo119676J(294913, "");
            } else {
                C97625j3.m125812b().mo105906u().mo119676J(294913, trim);
            }
        }
    }

    /* renamed from: K7 */
    public final void mo96692K7() {
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "dismissTipDialog");
        ProgressDialog progressDialog = this.f202856r;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f202856r = null;
        }
    }

    /* renamed from: L7 */
    public final String mo96693L7() {
        String obj = this.f202845e.getText() != null ? this.f202845e.getText().toString() : "";
        return (Util.isNullOrNil(obj) || obj.length() <= 50) ? obj : obj.substring(0, 50);
    }

    /* renamed from: M7 */
    public final String mo96694M7() {
        String trim = this.f202844d.getText().toString().trim();
        return trim.length() <= 50 ? trim : trim.substring(0, 50);
    }

    /* renamed from: N7 */
    public void mo96695N7(boolean z) {
        Intent intent = new Intent(this, SayHiWithSnsPermissionUI2.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        int i = this.f202852o.getVisibility() != 0 ? 1 : 0;
        if (this.f202852o.getVisibility() == 0) {
            i |= 8;
        }
        if (z) {
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", i);
        intent.putExtra("Contact_RemarkName", mo96693L7());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a4, code lost:
        r10 = 10;
     */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96696O7(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.f202864y
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x0010
        L_0x000b:
            if (r21 == 0) goto L_0x000f
            r1 = 2
            goto L_0x0010
        L_0x000f:
            r1 = 3
        L_0x0010:
            java.lang.String r5 = r20.mo96693L7()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x001c
            r5 = 3
            goto L_0x0038
        L_0x001c:
            java.lang.String r5 = r20.mo96693L7()
            java.lang.String r6 = r0.f202860v
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0037
            java.lang.String r5 = r20.mo96693L7()
            java.lang.String r6 = r0.f202859u
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 2
        L_0x0038:
            boolean r6 = r0.f202809C
            r8 = 4
            r9 = 6
            if (r6 == 0) goto L_0x0040
            r6 = 6
            goto L_0x005e
        L_0x0040:
            int r6 = r0.f202831U0
            r10 = r6 & 8
            if (r10 == 0) goto L_0x0048
            r6 = 5
            goto L_0x005e
        L_0x0048:
            r10 = r6 & 1
            if (r10 == 0) goto L_0x0052
            r10 = r6 & 2
            if (r10 == 0) goto L_0x0052
            r6 = 4
            goto L_0x005e
        L_0x0052:
            r10 = r6 & 2
            if (r10 == 0) goto L_0x0058
            r6 = 3
            goto L_0x005e
        L_0x0058:
            r6 = r6 & r4
            if (r6 == 0) goto L_0x005d
            r6 = 2
            goto L_0x005e
        L_0x005d:
            r6 = 1
        L_0x005e:
            int r10 = r0.f202862x
            r15 = 10
            r16 = 8
            if (r10 == r4) goto L_0x00bc
            if (r10 == r2) goto L_0x00ba
            if (r10 == r9) goto L_0x00b8
            if (r10 == r15) goto L_0x00b8
            r12 = 52
            if (r10 == r12) goto L_0x00b8
            r12 = 17
            if (r10 == r12) goto L_0x00b6
            r12 = 18
            if (r10 == r12) goto L_0x00b3
            r12 = 44
            if (r10 == r12) goto L_0x00b3
            r12 = 45
            if (r10 == r12) goto L_0x00b1
            r12 = 48
            if (r10 == r12) goto L_0x00ae
            r12 = 49
            if (r10 == r12) goto L_0x00b1
            r12 = 78
            if (r10 == r12) goto L_0x00ab
            r12 = 79
            if (r10 == r12) goto L_0x00ab
            r12 = 181(0xb5, float:2.54E-43)
            if (r10 == r12) goto L_0x00ab
            r12 = 182(0xb6, float:2.55E-43)
            if (r10 == r12) goto L_0x00ab
            switch(r10) {
                case 13: goto L_0x00b8;
                case 14: goto L_0x00a9;
                case 15: goto L_0x00a7;
                default: goto L_0x009b;
            }
        L_0x009b:
            switch(r10) {
                case 21: goto L_0x00b8;
                case 22: goto L_0x00a4;
                case 23: goto L_0x00a4;
                case 24: goto L_0x00a4;
                default: goto L_0x009e;
            }
        L_0x009e:
            switch(r10) {
                case 26: goto L_0x00a4;
                case 27: goto L_0x00a4;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x00b1;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r10 = 11
            goto L_0x00bd
        L_0x00a4:
            r10 = 10
            goto L_0x00bd
        L_0x00a7:
            r10 = 2
            goto L_0x00bd
        L_0x00a9:
            r10 = 7
            goto L_0x00bd
        L_0x00ab:
            r10 = 12
            goto L_0x00bd
        L_0x00ae:
            r10 = 8
            goto L_0x00bd
        L_0x00b1:
            r10 = 6
            goto L_0x00bd
        L_0x00b3:
            r10 = 9
            goto L_0x00bd
        L_0x00b6:
            r10 = 5
            goto L_0x00bd
        L_0x00b8:
            r10 = 1
            goto L_0x00bd
        L_0x00ba:
            r10 = 3
            goto L_0x00bd
        L_0x00bc:
            r10 = 4
        L_0x00bd:
            java.util.ArrayList<java.lang.String> r12 = r0.f202814H
            int r17 = r12.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.ArrayList<java.lang.String> r15 = r0.f202816J
            int r15 = r15.size()
            java.lang.String r13 = "#"
            r18 = 0
            if (r15 <= 0) goto L_0x00ed
            r14 = 0
        L_0x00d5:
            if (r14 >= r15) goto L_0x00ed
            java.util.ArrayList<java.lang.String> r9 = r0.f202816J
            java.lang.Object r9 = r9.get(r14)
            java.lang.String r9 = (java.lang.String) r9
            r11.append(r9)
            int r9 = r15 + -1
            if (r14 >= r9) goto L_0x00e9
            r11.append(r13)
        L_0x00e9:
            int r14 = r14 + 1
            r9 = 6
            goto L_0x00d5
        L_0x00ed:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r14 = r12.size()
            if (r14 <= 0) goto L_0x0110
            r15 = 0
        L_0x00f9:
            if (r15 >= r14) goto L_0x0110
            java.lang.Object r19 = r12.get(r15)
            r7 = r19
            java.lang.String r7 = (java.lang.String) r7
            r9.append(r7)
            int r7 = r14 + -1
            if (r15 >= r7) goto L_0x010d
            r9.append(r13)
        L_0x010d:
            int r15 = r15 + 1
            goto L_0x00f9
        L_0x0110:
            java.lang.String r7 = r9.toString()
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r9 = r9.mo105907v()
            java.lang.String[] r12 = eb0.C45628s0.f123409o
            java.lang.String[] r13 = new java.lang.String[r8]
            java.lang.String r14 = eb0.C75592q0.m90789s()
            r13[r18] = r14
            java.lang.String r14 = "weixin"
            r13[r4] = r14
            java.lang.String r14 = "helper_entry"
            r13[r3] = r14
            java.lang.String r14 = "filehelper"
            r13[r2] = r14
            int r9 = r9.mo69711l3(r12, r13)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 18713(0x4919, float:2.6222E-41)
            r14 = 13
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r0.f202858t
            r14[r18] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r14[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r14[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r14[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 5
            r14[r2] = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f202829T0
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r14[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2 = 7
            r14[r2] = r1
            java.lang.String r1 = ""
            r14[r16] = r1
            r1 = 9
            r14[r1] = r7
            r1 = 10
            r14[r1] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r2 = 11
            r14[r2] = r1
            int r1 = r0.f202833V0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r14[r2] = r1
            r12.mo160131h(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.mo96696O7(boolean):void");
    }

    /* renamed from: P7 */
    public final void mo96697P7(List<String> list) {
        if (list == null || list.size() == 0) {
            this.f202818L.setText("");
            return;
        }
        int i = 0;
        String str = "";
        while (i < list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(list.get(i));
            sb.append(i < list.size() + -1 ? "，" : "");
            str = sb.toString();
            i++;
        }
        this.f202818L.setText(str);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "height:%s", Integer.valueOf(i));
    }

    /* renamed from: Q7 */
    public final void mo96698Q7() {
        TextView textView = this.f202849i;
        if (!(textView == null || this.f202853p == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f202849i.getText());
            sb.append(this.f202853p.getVisibility() != 0 ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
            textView.setContentDescription(sb.toString());
        }
        TextView textView2 = this.f202848h;
        if (textView2 != null && this.f202852o != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f202848h.getText());
            sb4.append(this.f202852o.getVisibility() != 0 ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
            textView2.setContentDescription(sb4.toString());
        }
    }

    /* renamed from: R7 */
    public final void mo96699R7() {
        int i;
        Resources resources;
        int Qe;
        Class cls = C32735h.class;
        this.f202852o.setVisibility((this.f202810D || this.f202809C) ? 0 : 4);
        this.f202853p.setVisibility((this.f202810D || this.f202809C) ? 4 : 0);
        if (this.f202827S0) {
            if (!this.f202810D && !this.f202809C && C97625j3.m125812b().mo105907v().mo69711l3(C45628s0.f123409o, C75592q0.m90789s(), "weixin", "helper_entry", "filehelper") >= (Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly_threshold, 200))) {
                this.f202852o.setVisibility(0);
                this.f202853p.setVisibility(4);
                this.f202848h.setText(getString(C0966R.string.hnz, new Object[]{Integer.valueOf(Qe)}));
                int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_VERIFY_CONATCT_SET_DEFAULT_CHATONLY_PROMPT_TIMES_INT_SYNC, 0);
                if (j < ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly_prompt_times, 3)) {
                    C77426q qVar = new C77426q(this);
                    qVar.mo107595g(getString(C0966R.string.f361146ho0, new Object[]{Integer.valueOf(Qe)}));
                    qVar.mo107601m(C0966R.string.f8028zq);
                    qVar.mo107600l(new C4969k(this, j));
                    qVar.mo107603o();
                }
            }
            this.f202827S0 = false;
        }
        ((View) this.f202852o.getParent()).setOnClickListener(new C4970l());
        ((View) this.f202853p.getParent()).setOnClickListener(this.f202809C ? null : new C4964a());
        View findViewById = findViewById(C0966R.C0970id.hhw);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = (TextView) findViewById(C0966R.C0970id.jv7);
        if (this.f202809C) {
            resources = getResources();
            i = C0966R.color.f3563xt;
        } else {
            resources = getResources();
            i = C0966R.color.a7f;
        }
        textView.setTextColor(resources.getColor(i));
        if (this.f202809C) {
            this.f202855q.setVisibility(0);
        }
        this.f202810D = false;
    }

    /* renamed from: S7 */
    public final void mo96700S7(String str, int i, long j) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
        PostSnsTagMemberOptionEvent.C40153a aVar = postSnsTagMemberOptionEvent.f107691d;
        aVar.f107696e = linkedList;
        aVar.f107692a = i;
        aVar.f107693b = j;
        postSnsTagMemberOptionEvent.publish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359960bu3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8021d.class);
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0852, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0854, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0857, code lost:
        if (r0.f202864y != false) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0859, code lost:
        if (r1 != false) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x085b, code lost:
        r1 = fd0.C75743h.wx0().mo101190bD(r0.f202858t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0865, code lost:
        if (r1 != null) goto L_0x0869;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0869, code lost:
        r1 = ae3.C67030b.m79187b(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0873, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1.f192525b) != false) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0882, code lost:
        if (r1.f192525b.equals(getString(com.tencent.p014mm.C0966R.string.exr)) == false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0886, code lost:
        r10 = getString(com.tencent.p014mm.C0966R.string.ilr).substring(0, getString(com.tencent.p014mm.C0966R.string.ilr).indexOf("%s"));
        r11 = r1.f192525b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x08a1, code lost:
        if (r11.startsWith(r10) == false) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x08a3, code lost:
        r11 = r1.f192525b.substring(r10.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x08ad, code lost:
        r10 = r0.f202846f;
        r15 = new k20.C9556a();
        r12 = k20.C60958c.f173611a;
        r15.mo10233c(0);
        r12 = r10;
        j20.C117292a.m165358d(r12, r15.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r10.setVisibility(((java.lang.Integer) r15.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r12, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0.f202847g.setText(((p629ny.C76979h) di3.C86312j.m106911c(r2)).yp0(r0, com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(getString(com.tencent.p014mm.C0966R.string.bqu, new java.lang.Object[]{r1.f192525b})), r0.f202847g.getTextSize()));
        r1 = new de3.C75375u(getString(com.tencent.p014mm.C0966R.string.ll_));
        r1.mo105705b(new com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.C4971m(r0, r11), 0, r1.length(), 17);
        r0.f202847g.append(" ");
        r0.f202847g.append(r1);
        r0.f202847g.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        r0.f202807A[3] = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            android.content.Intent r3 = r25.getIntent()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "sayhi_with_sns_perm_send_verify"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202864y = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "sayhi_with_sns_perm_add_remark"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202866z = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "Contact_User"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202858t = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "Contact_Scene"
            r7 = 9
            int r3 = r3.getIntExtra(r6, r7)
            r0.f202862x = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "room_name"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202857s = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "Contact_RemarkName"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202861w = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "Contact_Nick"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202860v = r3
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r6 = "Contact_RoomNickname"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202859u = r3
            java.lang.String r3 = r0.f202861w
            r0.f202826S = r3
            r3 = 2131309436(0x7f09337c, float:1.8237156E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202846f = r3
            r3 = 2131309437(0x7f09337d, float:1.8237158E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202847g = r3
            java.lang.String r3 = r0.f202858t
            boolean r3 = com.tencent.p014mm.plugin.profile.C70142g.m82634f(r3)
            r6 = 1
            if (r3 == 0) goto L_0x009f
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r7 = "Contact_IsForceVerifyFriend"
            boolean r3 = r3.getBooleanExtra(r7, r4)
            if (r3 != 0) goto L_0x009f
            r3 = 1
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            r0.f202820N = r3
            if (r3 != 0) goto L_0x00aa
            boolean r3 = r0.f202864y
            if (r3 == 0) goto L_0x00aa
            r3 = 1
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            r0.f202821P = r3
            java.lang.String r3 = r0.f202858t
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            java.lang.String r7 = "MicroMsg.SayHiWithSnsPermissionUI2"
            r8 = 8
            r9 = 0
            if (r3 == 0) goto L_0x0117
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r10 = r0.f202858t
            r3[r4] = r10
            java.lang.String r10 = "initLabelPanelAll, isOpenIM, userName: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r3)
            r3 = 2131306955(0x7f0929cb, float:1.8232124E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x024c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r13 = "initLabelPanelAll"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r3
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r12 = "initLabelPanelAll"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x024c
        L_0x0117:
            r3 = 2131300245(0x7f090f95, float:1.8218514E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202818L = r3
            r3.setVisibility(r4)
            r3 = 2131300247(0x7f090f97, float:1.8218518E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.f202817K = r3
            r3 = 2131297323(0x7f09042b, float:1.8212588E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0150
            r8 = 2131756221(0x7f1004bd, float:1.9143343E38)
            androidx.appcompat.app.AppCompatActivity r10 = r25.getContext()
            r11 = 2131099712(0x7f060040, float:1.7811785E38)
            int r10 = kg3.C76577a.m92153d(r10, r11)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r8, r10)
            r3.setImageDrawable(r8)
        L_0x0150:
            android.widget.LinearLayout r3 = r0.f202817K
            com.tencent.mm.plugin.profile.ui.t2 r8 = new com.tencent.mm.plugin.profile.ui.t2
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            r3 = 2131312839(0x7f0940c7, float:1.8244058E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r3 = 2131306956(0x7f0929cc, float:1.8232126E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202812F = r3
            r3.setBackgroundDrawable(r9)
            android.view.View r3 = r0.f202812F
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r5)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r13 = "initLabelPanelAll"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r3
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r12 = "initLabelPanelAll"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            com.tencent.mm.storage.e2 r3 = a22.C27740g.vx0()
            java.util.ArrayList r3 = r3.mo100947TE()
            r0.f202813G = r3
            java.util.ArrayList<java.lang.String> r3 = r0.f202814H
            if (r3 == 0) goto L_0x022a
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.s r3 = r3.mo105880F()
            java.lang.String r8 = r0.f202858t
            com.tencent.mm.storage.a5 r3 = (com.tencent.p014mm.storage.C44651a5) r3
            com.tencent.mm.storage.z4 r3 = r3.mo69630Lo(r8)
            if (r3 == 0) goto L_0x01d0
            java.lang.String r3 = r3.field_contactLabels
            goto L_0x01d1
        L_0x01d0:
            r3 = r9
        L_0x01d1:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x021d
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            java.lang.String r10 = r0.f202858t
            com.tencent.mm.storage.z1 r8 = r8.get(r10)
            java.lang.String r10 = r8.mo73978v2()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x0201
            eb0.c r11 = eb0.C97625j3.m125812b()
            g62.s r11 = r11.mo105880F()
            com.tencent.mm.storage.a5 r11 = (com.tencent.p014mm.storage.C44651a5) r11
            com.tencent.mm.storage.z4 r10 = r11.mo69630Lo(r10)
            if (r10 == 0) goto L_0x0201
            java.lang.String r3 = r10.field_contactLabels
        L_0x0201:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r10 == 0) goto L_0x021d
            java.lang.String r8 = r8.getUsername()
            eb0.c r10 = eb0.C97625j3.m125812b()
            g62.s r10 = r10.mo105880F()
            com.tencent.mm.storage.a5 r10 = (com.tencent.p014mm.storage.C44651a5) r10
            com.tencent.mm.storage.z4 r8 = r10.mo69630Lo(r8)
            if (r8 == 0) goto L_0x021d
            java.lang.String r3 = r8.field_contactLabels
        L_0x021d:
            b22.b r8 = b22.C28250a.m38138a()
            a22.a r8 = (a22.C67001a) r8
            java.util.List r3 = r8.mo90969g(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x022b
        L_0x022a:
            r3 = r9
        L_0x022b:
            if (r3 == 0) goto L_0x0232
            java.util.ArrayList<java.lang.String> r8 = r0.f202814H
            r8.addAll(r3)
        L_0x0232:
            java.util.List<java.lang.String> r8 = r0.f202813G
            if (r8 == 0) goto L_0x023c
            int r8 = r8.size()
            r0.f202832V = r8
        L_0x023c:
            if (r3 == 0) goto L_0x0249
            int r8 = r3.size()
            r0.f202834W = r8
            java.util.List<java.lang.String> r8 = r0.f202836X
            r8.addAll(r3)
        L_0x0249:
            r0.mo96697P7(r3)
        L_0x024c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "isCurrentHappenChatting = "
            r3.append(r8)
            boolean r8 = r0.f202820N
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            lc3.b r3 = (lc3.C10485b) r3
            pj.f r3 = r3.vh0()
            java.lang.String r8 = "MMSocialBlackListFlag"
            int r3 = r3.mo107404b(r8, r6)
            if (r3 != r6) goto L_0x0278
            r3 = 1
            goto L_0x0279
        L_0x0278:
            r3 = 0
        L_0x0279:
            r0.f202808B = r3
            r8 = 2131314910(0x7f0948de, float:1.8248258E38)
            if (r3 != 0) goto L_0x02cd
            android.view.View r3 = r0.findViewById(r8)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r11)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r3
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x02cd:
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.lang.String r9 = r0.f202858t
            com.tencent.mm.storage.z1 r3 = r3.get(r9)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC
            int r9 = r9.mo119689j(r10, r4)
            if (r9 != r6) goto L_0x02f2
            r9 = 1
            goto L_0x02f3
        L_0x02f2:
            r9 = 0
        L_0x02f3:
            r0.f202810D = r9
            r9 = 2131310355(0x7f093713, float:1.823902E38)
            android.view.View r9 = r0.findViewById(r9)
            r10 = 2131310359(0x7f093717, float:1.8239028E38)
            android.view.View r9 = r9.findViewById(r10)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r9
            r0.f202850j = r9
            android.content.Intent r9 = r25.getIntent()
            java.lang.String r10 = "sayhi_with_sns_permission"
            r9.getBooleanExtra(r10, r4)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = r0.f202850j
            boolean r10 = r3.mo62943y3()
            r9.setCheck(r10)
            r9 = 2131314907(0x7f0948db, float:1.8248252E38)
            android.view.View r9 = r0.findViewById(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            r0.f202852o = r9
            r9 = 2131314069(0x7f094595, float:1.8246553E38)
            android.view.View r9 = r0.findViewById(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            r0.f202853p = r9
            r9 = 2131314912(0x7f0948e0, float:1.8248262E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9 = 2131314908(0x7f0948dc, float:1.8248254E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f202855q = r9
            r9 = 2131313919(0x7f0944ff, float:1.8246248E38)
            android.view.View r9 = r0.findViewById(r9)
            r10 = 2131310368(0x7f093720, float:1.8239046E38)
            android.view.View r9 = r9.findViewById(r10)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r9
            r0.f202851n = r9
            java.lang.String r9 = r0.f202858t
            jr2.t r10 = jr2.C99019x.m128974f()
            r11 = 5
            os2.m0 r10 = (os2.C11766m0) r10
            boolean r9 = r10.mo11654bD(r9, r11)
            com.tencent.mm.ui.widget.MMSwitchBtn r10 = r0.f202851n
            r10.setCheck(r9)
            r9 = 2131314909(0x7f0948dd, float:1.8248256E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f202848h = r9
            r9 = 2131314070(0x7f094596, float:1.8246555E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f202849i = r9
            r9 = 2131298175(0x7f09077f, float:1.8214316E38)
            android.view.View r9 = r0.findViewById(r9)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$d r10 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$d
            r10.<init>()
            r9.setOnClickListener(r10)
            int r3 = r3.f149500H
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r9[r4] = r10
            java.lang.String r10 = "sex:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r10, r9)
            r9 = 2131310360(0x7f093718, float:1.823903E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2
            if (r3 != r6) goto L_0x03b1
            r11 = 2131837076(0x7f114094, float:1.9307337E38)
            r9.setText(r11)
            goto L_0x03b9
        L_0x03b1:
            if (r3 != r10) goto L_0x03b9
            r11 = 2131837075(0x7f114093, float:1.9307335E38)
            r9.setText(r11)
        L_0x03b9:
            r9 = 2131310369(0x7f093721, float:1.8239048E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r3 != r6) goto L_0x03cb
            r3 = 2131836860(0x7f113fbc, float:1.9306899E38)
            r9.setText(r3)
            goto L_0x03d3
        L_0x03cb:
            if (r3 != r10) goto L_0x03d3
            r3 = 2131836859(0x7f113fbb, float:1.9306897E38)
            r9.setText(r3)
        L_0x03d3:
            java.lang.String r3 = r0.f202858t
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            r0.f202811E = r3
            if (r3 == 0) goto L_0x046d
            android.view.View r3 = r0.findViewById(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r11)
            java.lang.Object[] r12 = r8.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r14 = "initView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r3
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r3 = 2131310357(0x7f093715, float:1.8239024E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x0498
            k20.a r8 = new k20.a
            r8.<init>()
            r9 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r11)
            java.lang.Object[] r12 = r8.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r14 = "initView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r3
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0498
        L_0x046d:
            r25.mo96699R7()
            android.content.Intent r3 = r25.getIntent()
            r8 = -1
            java.lang.String r9 = "Contact_default_permission"
            int r3 = r3.getIntExtra(r9, r8)
            if (r3 <= 0) goto L_0x0498
            r8 = 8
            r3 = r3 & r8
            r9 = 4
            if (r3 != r8) goto L_0x048e
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202852o
            r3.setVisibility(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202853p
            r3.setVisibility(r9)
            goto L_0x0498
        L_0x048e:
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202852o
            r3.setVisibility(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202853p
            r3.setVisibility(r4)
        L_0x0498:
            boolean r3 = r0.f202811E
            if (r3 == 0) goto L_0x04a1
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r0.f202851n
            r3.setCheck(r6)
        L_0x04a1:
            boolean r3 = r0.f202864y
            r8 = 100
            r9 = 2131835636(0x7f113af4, float:1.9304416E38)
            if (r3 == 0) goto L_0x05da
            r3 = 2131312723(0x7f094053, float:1.8243823E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r0.f202844d = r3
            qn3.c r3 = qn3.C77382c.m93286b(r3)
            r3.f225611e = r4
            r3.f225610d = r8
            r11 = 0
            r3.mo107499d(r11)
            android.widget.EditText r3 = r0.f202844d
            android.text.InputFilter[] r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0.f212544a
            r3.setFilters(r12)
            android.widget.EditText r3 = r0.f202844d
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$e r12 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$e
            r12.<init>()
            r3.addTextChangedListener(r12)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r12 = 294913(0x48001, float:4.13261E-40)
            java.lang.Object r3 = r3.mo119684e(r12, r11)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r11 = eb0.C75592q0.m90783m()
            if (r11 != 0) goto L_0x04eb
            java.lang.String r11 = ""
        L_0x04eb:
            java.lang.String r12 = r0.getString(r9)
            int r13 = r12.length()
            int r14 = r11.length()
            int r13 = r13 + r14
            r14 = 50
            if (r13 <= r14) goto L_0x0505
            int r13 = r12.length()
            int r14 = r14 - r13
            java.lang.String r11 = r11.substring(r4, r14)
        L_0x0505:
            java.lang.String r13 = r0.f202857s
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0588
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r13 = r0.f202857s
            com.tencent.mm.storage.z1 r1 = r1.get(r13)
            if (r1 == 0) goto L_0x0588
            java.lang.String r13 = r1.getNickname()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0588
            java.lang.Class<a11.c> r3 = a11.C39479c.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            a11.c r3 = (a11.C39479c) r3
            eb0.m2 r3 = r3.mo62084mr()
            java.lang.String r13 = r0.f202857s
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69801SE(r13)
            java.lang.String r13 = eb0.C75592q0.m90789s()
            java.lang.String r3 = r3.mo69789q2(r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r13 == 0) goto L_0x054c
            r3 = r11
        L_0x054c:
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r14 = r0.f202857s
            r13[r4] = r14
            java.lang.String r14 = r1.getNickname()
            r13[r6] = r14
            java.lang.String r14 = "chatroomName:%s nick:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            ny.h r13 = (p629ny.C76979h) r13
            androidx.appcompat.app.AppCompatActivity r14 = r25.getContext()
            android.content.res.Resources r15 = r25.getResources()
            r9 = 2131835637(0x7f113af5, float:1.9304418E38)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.String r1 = r1.getNickname()
            r8[r4] = r1
            r8[r6] = r3
            java.lang.String r1 = r15.getString(r9, r8)
            android.widget.EditText r3 = r0.f202844d
            float r3 = r3.getTextSize()
            android.text.SpannableString r3 = r13.yp0(r14, r1, r3)
            r0.f202865y0 = r3
        L_0x0588:
            java.lang.CharSequence r1 = r0.f202865y0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r1 == 0) goto L_0x05ae
            di3.d r1 = di3.C86312j.m106911c(r2)
            ny.h r1 = (p629ny.C76979h) r1
            androidx.appcompat.app.AppCompatActivity r8 = r25.getContext()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r4] = r11
            java.lang.String r9 = java.lang.String.format(r12, r9)
            android.widget.EditText r11 = r0.f202844d
            float r11 = r11.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r8, r9, r11)
            r0.f202865y0 = r1
        L_0x05ae:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r1 == 0) goto L_0x05bc
            android.widget.EditText r1 = r0.f202844d
            java.lang.CharSequence r3 = r0.f202865y0
            r1.setText(r3)
            goto L_0x05d5
        L_0x05bc:
            di3.d r1 = di3.C86312j.m106911c(r2)
            ny.h r1 = (p629ny.C76979h) r1
            androidx.appcompat.app.AppCompatActivity r8 = r25.getContext()
            android.widget.EditText r9 = r0.f202844d
            float r9 = r9.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r8, r3, r9)
            android.widget.EditText r3 = r0.f202844d
            r3.setText(r1)
        L_0x05d5:
            android.widget.EditText r1 = r0.f202844d
            r1.clearFocus()
        L_0x05da:
            android.widget.EditText r1 = r0.f202844d
            r3 = 3
            if (r1 == 0) goto L_0x0626
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.widget.LinearLayout
            if (r1 != 0) goto L_0x05e8
            goto L_0x0626
        L_0x05e8:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            boolean r8 = r0.f202864y
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1[r4] = r8
            boolean r8 = r0.f202820N
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1[r6] = r8
            boolean r8 = r0.f202821P
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1[r10] = r8
            java.lang.String r8 = "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r1)
            boolean r1 = r0.f202821P
            if (r1 == 0) goto L_0x0618
            android.widget.EditText r1 = r0.f202844d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            goto L_0x062c
        L_0x0618:
            android.widget.EditText r1 = r0.f202844d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7 = 8
            r1.setVisibility(r7)
            goto L_0x062c
        L_0x0626:
            java.lang.String r1 = "updateSayHiContextVisiable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x062c:
            boolean r1 = r0.f202866z
            if (r1 == 0) goto L_0x0988
            r1 = 2131312726(0x7f094056, float:1.8243829E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f202845e = r1
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            boolean r1 = r0.f202864y
            if (r1 != 0) goto L_0x064d
            android.widget.EditText r1 = r0.f202845e
            r1.clearFocus()
        L_0x064d:
            android.widget.EditText r1 = r0.f202845e
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r1.f225611e = r4
            r7 = 100
            r1.f225610d = r7
            r7 = 0
            r1.mo107499d(r7)
            android.widget.EditText r1 = r0.f202845e
            android.text.InputFilter[] r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0.f212544a
            r1.setFilters(r7)
            boolean r1 = r0.f202864y
            if (r1 != 0) goto L_0x0673
            r1 = 2131834192(0x7f113550, float:1.9301487E38)
            r0.setMMTitle((int) r1)
            int[] r1 = r0.f202807A
            r1[r4] = r6
            goto L_0x0679
        L_0x0673:
            r1 = 2131834201(0x7f113559, float:1.9301506E38)
            r0.setMMTitle((int) r1)
        L_0x0679:
            java.lang.String r1 = r0.f202861w
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06a3
            android.widget.EditText r1 = r0.f202845e
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            androidx.appcompat.app.AppCompatActivity r5 = r25.getContext()
            java.lang.String r7 = r0.f202861w
            android.widget.EditText r8 = r0.f202845e
            float r8 = r8.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r5, r7, r8)
            r1.setText(r2)
            int[] r1 = r0.f202807A
            r2 = 6
            r1[r2] = r6
            goto L_0x0940
        L_0x06a3:
            java.lang.String r1 = r0.f202860v
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06d0
            android.widget.EditText r1 = r0.f202845e
            di3.d r7 = di3.C86312j.m106911c(r2)
            ny.h r7 = (p629ny.C76979h) r7
            androidx.appcompat.app.AppCompatActivity r8 = r25.getContext()
            java.lang.String r9 = r0.f202860v
            android.widget.EditText r11 = r0.f202845e
            float r11 = r11.getTextSize()
            android.text.SpannableString r7 = r7.yp0(r8, r9, r11)
            r1.setHint(r7)
            android.widget.EditText r1 = r0.f202845e
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$f r7 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$f
            r7.<init>()
            r1.setOnFocusChangeListener(r7)
        L_0x06d0:
            int r1 = r0.f202862x
            java.lang.String r7 = " "
            r8 = 17
            r9 = 2131840234(0x7f114cea, float:1.9313742E38)
            switch(r1) {
                case 8: goto L_0x07a3;
                case 9: goto L_0x06dc;
                case 10: goto L_0x06de;
                case 11: goto L_0x06de;
                case 12: goto L_0x06dc;
                case 13: goto L_0x06de;
                case 14: goto L_0x07a3;
                default: goto L_0x06dc;
            }
        L_0x06dc:
            goto L_0x0854
        L_0x06de:
            hg0.b r1 = dg0.C75398e.vx0()
            java.lang.String r10 = r0.f202858t
            hg0.a r1 = r1.mo106401a(r10)
            if (r1 == 0) goto L_0x0854
            java.lang.String r10 = r1.mo106388h()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0854
            java.lang.String r10 = r1.mo106388h()
            android.widget.EditText r11 = r0.f202845e
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x070a
            goto L_0x0854
        L_0x070a:
            android.view.View r10 = r0.f202846f
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r11.mo10233c(r5)
            java.lang.Object[] r18 = r11.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r20 = "initMobileNameArea"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r19 = "initMobileNameArea"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.widget.TextView r10 = r0.f202847g
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            r12 = 2131824306(0x7f110eb2, float:1.9281436E38)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r14 = r1.mo106388h()
            r13[r4] = r14
            java.lang.String r12 = r0.getString(r12, r13)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.widget.TextView r13 = r0.f202847g
            float r13 = r13.getTextSize()
            android.text.SpannableString r11 = r11.yp0(r0, r12, r13)
            r10.setText(r11)
            de3.u r10 = new de3.u
            java.lang.String r11 = r0.getString(r9)
            r10.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m
            java.lang.String r1 = r1.mo106388h()
            r11.<init>(r1)
            int r1 = r10.length()
            r10.mo105705b(r11, r4, r1, r8)
            android.widget.TextView r1 = r0.f202847g
            r1.append(r7)
            android.widget.TextView r1 = r0.f202847g
            r1.append(r10)
            android.widget.TextView r1 = r0.f202847g
            android.text.method.MovementMethod r10 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r10)
            int[] r1 = r0.f202807A
            r1[r3] = r6
            goto L_0x0852
        L_0x07a3:
            java.lang.String r1 = r0.f202859u
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0854
            java.lang.String r1 = r0.f202859u
            android.widget.EditText r11 = r0.f202845e
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x07bf
            goto L_0x0854
        L_0x07bf:
            android.view.View r1 = r0.f202846f
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r11.mo10233c(r5)
            java.lang.Object[] r18 = r11.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r20 = "initChatroomNameArea"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.setVisibility(r11)
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r19 = "initChatroomNameArea"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.widget.TextView r1 = r0.f202847g
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            r12 = 2131824305(0x7f110eb1, float:1.9281434E38)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r14 = r0.f202859u
            r13[r4] = r14
            java.lang.String r12 = r0.getString(r12, r13)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.widget.TextView r13 = r0.f202847g
            float r13 = r13.getTextSize()
            android.text.SpannableString r11 = r11.yp0(r0, r12, r13)
            r1.setText(r11)
            de3.u r1 = new de3.u
            java.lang.String r11 = r0.getString(r9)
            r1.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m
            java.lang.String r12 = r0.f202859u
            r11.<init>(r12)
            int r12 = r1.length()
            r1.mo105705b(r11, r4, r12, r8)
            android.widget.TextView r11 = r0.f202847g
            r11.append(r7)
            android.widget.TextView r11 = r0.f202847g
            r11.append(r1)
            android.widget.TextView r1 = r0.f202847g
            android.text.method.MovementMethod r11 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r11)
            int[] r1 = r0.f202807A
            r1[r3] = r10
        L_0x0852:
            r1 = 1
            goto L_0x0855
        L_0x0854:
            r1 = 0
        L_0x0855:
            boolean r10 = r0.f202864y
            if (r10 != 0) goto L_0x0940
            if (r1 != 0) goto L_0x0940
            com.tencent.mm.storage.n3 r1 = fd0.C75743h.wx0()
            java.lang.String r10 = r0.f202858t
            com.tencent.mm.storage.m3 r1 = r1.mo101190bD(r10)
            if (r1 != 0) goto L_0x0869
            goto L_0x0940
        L_0x0869:
            ae3.b r1 = ae3.C67030b.m79187b(r0, r1)
            java.lang.String r10 = r1.f192525b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0940
            java.lang.String r10 = r1.f192525b
            r11 = 2131830284(0x7f11260c, float:1.929356E38)
            java.lang.String r11 = r0.getString(r11)
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0886
            goto L_0x0940
        L_0x0886:
            r10 = 2131835636(0x7f113af4, float:1.9304416E38)
            java.lang.String r11 = r0.getString(r10)
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r12 = "%s"
            int r10 = r10.indexOf(r12)
            java.lang.String r10 = r11.substring(r4, r10)
            java.lang.String r11 = r1.f192525b
            boolean r12 = r11.startsWith(r10)
            if (r12 == 0) goto L_0x08ad
            java.lang.String r11 = r1.f192525b
            int r10 = r10.length()
            java.lang.String r11 = r11.substring(r10)
        L_0x08ad:
            android.view.View r10 = r0.f202846f
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r15.mo10233c(r5)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r5 = "initVerifyNameArea"
            java.lang.String r16 = "()Z"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r10
            r3 = r15
            r15 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r10.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI2"
            java.lang.String r14 = "initVerifyNameArea"
            java.lang.String r15 = "()Z"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.widget.TextView r3 = r0.f202847g
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            r5 = 2131824308(0x7f110eb4, float:1.928144E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r1 = r1.f192525b
            r6[r4] = r1
            java.lang.String r1 = r0.getString(r5, r6)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r5 = r0.f202847g
            float r5 = r5.getTextSize()
            android.text.SpannableString r1 = r2.yp0(r0, r1, r5)
            r3.setText(r1)
            de3.u r1 = new de3.u
            java.lang.String r2 = r0.getString(r9)
            r1.<init>((java.lang.String) r2)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$m
            r2.<init>(r11)
            int r3 = r1.length()
            r1.mo105705b(r2, r4, r3, r8)
            android.widget.TextView r2 = r0.f202847g
            r2.append(r7)
            android.widget.TextView r2 = r0.f202847g
            r2.append(r1)
            android.widget.TextView r1 = r0.f202847g
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            int[] r1 = r0.f202807A
            r2 = 3
            r1[r2] = r2
        L_0x0940:
            android.widget.EditText r1 = r0.f202845e
            java.lang.CharSequence r1 = r1.getHint()
            if (r1 == 0) goto L_0x0964
            android.widget.EditText r1 = r0.f202845e
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0964
            android.widget.EditText r1 = r0.f202845e
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            r0.f202824R = r1
        L_0x0964:
            android.widget.EditText r1 = r0.f202845e
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0988
            android.widget.EditText r1 = r0.f202845e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0988
            android.widget.EditText r1 = r0.f202845e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.f202824R = r1
        L_0x0988:
            r1 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r1 = r0.getString(r1)
            boolean r2 = r0.f202864y
            r3 = 2131821539(0x7f1103e3, float:1.9275824E38)
            if (r2 != 0) goto L_0x099a
            java.lang.String r1 = r0.getString(r3)
        L_0x099a:
            boolean r2 = r0.f202820N
            if (r2 == 0) goto L_0x09a2
            java.lang.String r1 = r0.getString(r3)
        L_0x09a2:
            r2 = 3
            java.lang.String r2 = tc2.C77890f.m94019a(r2)
            r3 = 2131304902(0x7f0921c6, float:1.822796E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r0.f202819M = r3
            r3.setText(r1)
            android.widget.Button r1 = r0.f202819M
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$g
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r0.f202819M
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$h r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$h
            r3.<init>(r2)
            r1.setOnTouchListener(r3)
            android.widget.Button r1 = r0.f202819M
            android.content.res.Resources r2 = r25.getResources()
            r3 = 2131100345(0x7f0602b9, float:1.7813069E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.Button r1 = r0.f202819M
            r2 = 2131231392(0x7f0802a0, float:1.8078864E38)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setBackground(r2)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$i r1 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$i
            r1.<init>()
            r0.setBackBtn(r1)
            com.tencent.mm.ui.tools.KeyboardHeightProvider r1 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r1.<init>(r0)
            r0.f202815I = r1
            r1.f220015b = r0
            boolean r1 = r0.f202820N
            if (r1 == 0) goto L_0x0a00
            r1 = 2131834193(0x7f113551, float:1.930149E38)
            r0.setMMTitle((int) r1)
        L_0x0a00:
            r25.mo96698Q7()
            android.widget.EditText r1 = r0.f202845e
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r2 = 32
            r1.f225611e = r4
            r1.f225610d = r2
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$j r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2$j
            r2.<init>(r0)
            r1.mo107499d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.initView():void");
    }

    public boolean isHideVKBWhenScroll() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && i == 600) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>();
            }
            List<String> d = ((C67001a) C28250a.m38138a()).mo90966d();
            if (mo96690I7(stringArrayListExtra, this.f202814H) || mo96690I7(d, this.f202813G)) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (d == null) {
                    d = new ArrayList<>();
                }
                if (this.f202813G == null) {
                    this.f202813G = new ArrayList();
                }
                for (String next : d) {
                    if (!this.f202813G.contains(next) && !this.f202816J.contains(next)) {
                        this.f202816J.add(next);
                    }
                }
                this.f202813G = d;
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    if (this.f202813G.contains(next2)) {
                        this.f202813G.remove(next2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f202813G);
                this.f202813G.clear();
                this.f202813G.addAll(stringArrayListExtra);
                this.f202813G.addAll(arrayList);
                this.f202814H.clear();
                this.f202814H.addAll(stringArrayListExtra);
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                if (stringArrayListExtra2 != null) {
                    this.f202838Y.addAll(stringArrayListExtra2);
                }
                ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.f202840Z.addAll(stringArrayListExtra3);
                }
                ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.f202863x0.addAll(stringArrayListExtra4);
                }
                ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.f202854p0.addAll(stringArrayListExtra5);
                }
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.f202814H, this.f202813G);
                mo96697P7(this.f202814H);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        initView();
        C97625j3.m125815e().mo123455a(30, this);
        C97625j3.m125815e().mo123455a(243, this);
        C97625j3.m125815e().mo123455a(C88585e.CTRL_INDEX, this);
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(30, this);
        C97625j3.m125815e().mo123470p(243, this);
        C97625j3.m125815e().mo123470p(C88585e.CTRL_INDEX, this);
        C115669n.INSTANCE.mo160131h(14036, Integer.valueOf(this.f202807A[0]), Integer.valueOf(this.f202807A[1]), Integer.valueOf(this.f202807A[2]), Integer.valueOf(this.f202807A[3]), Integer.valueOf(this.f202807A[4]), Integer.valueOf(this.f202807A[5]), Integer.valueOf(this.f202807A[6]), Integer.valueOf(this.f202807A[7]), this.f202858t);
        super.onDestroy();
        removeAllOptionMenu();
        C118418g.INSTANCE.mo175826kl("ie_ver_usr");
        KeyboardHeightProvider keyboardHeightProvider = this.f202815I;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f202807A[0] = 1;
        finish();
        mo96696O7(false);
        return true;
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202815I;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202815I;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        List<String> list;
        int i3;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Class cls = C75700k0.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "onSceneEnd: errType = " + i4 + " errCode = " + i5 + " errMsg = " + str2);
        try {
            mo96692K7();
            if (yVar2 instanceof C44590b1) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "onSceneEnd: getopCode: %s.", Integer.valueOf(((C44590b1) yVar2).f120898g));
                if (!(i4 == 0 && i5 == 0) && ((C44590b1) yVar2).f120898g == 1) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "onSceneEnd:is MM_VERIFYUSER_ADDCONTACT return");
                    return;
                }
            } else {
                Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "onSceneEnd: is no NetSceneVerifyUser.");
            }
            mo96691J7();
            Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "sendrequest_second");
            if (i4 == 0 && i5 == 0) {
                C76879j.m92726T(this, getString(C0966R.string.ilw));
                C68397a.m80737c(this.f202858t, 1);
                RecoverAccountFriendEvent recoverAccountFriendEvent = new RecoverAccountFriendEvent();
                RecoverAccountFriendEvent.C67773a aVar2 = recoverAccountFriendEvent.f193880d;
                aVar2.f193881a = this.f202858t;
                aVar2.f193882b = 1;
                recoverAccountFriendEvent.publish();
                int i6 = 2;
                if (this.f202862x == 17 && (yVar2 instanceof C44590b1)) {
                    long longExtra = getIntent().getLongExtra("key_msg_id", 0);
                    if (longExtra > 0) {
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(longExtra);
                        if (b002.getMsgId() > 0) {
                            b002.mo108743W2(b002.f230723F | 2048);
                            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(longExtra, b002);
                            C40359h0.m43532n1(b002, 21, 2);
                        }
                    }
                }
                if (this.f202866z) {
                    String L7 = mo96693L7();
                    if (!Util.isNullOrNil(L7)) {
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "set temp remark of %s", this.f202858t);
                        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202858t);
                        z1Var.mo62860K2(L7);
                        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202858t);
                        Lo.field_encryptUsername = this.f202858t;
                        Lo.field_conRemark = L7;
                        ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                        C97625j3.m125812b().mo105907v().mo69668Q3(z1Var);
                        this.f202807A[2] = 1;
                        if (!Util.isNullOrNil(this.f202860v) && !L7.equals(this.f202860v)) {
                            this.f202807A[5] = 1;
                        }
                    } else if (!Util.isNullOrNil(this.f202860v)) {
                        this.f202807A[2] = 0;
                    } else {
                        this.f202807A[2] = 2;
                    }
                    LinkedList linkedList = new LinkedList();
                    if (yVar2 instanceof C44590b1) {
                        i3 = ((C44590b1) yVar2).f120898g;
                        list = ((C44590b1) yVar2).f120897f;
                    } else {
                        if (yVar2 instanceof C46500x) {
                            linkedList.add(((C46500x) yVar2).f125280f);
                        }
                        list = linkedList;
                        i3 = 0;
                    }
                    if (i3 == 3 || (yVar2 instanceof C46500x)) {
                        mo96689H7(list);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(this.f202858t);
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar3 = snsPermissionNotifyEvent.f107766d;
                        aVar3.f107768b = true;
                        aVar3.f107767a = false;
                        aVar3.f107769c = this.f202858t;
                        snsPermissionNotifyEvent.publish();
                        if (this.f202850j.f220433y) {
                            C45628s0.m50783k0(z1Var2);
                        } else {
                            C45628s0.m50799s0(z1Var2);
                        }
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar4 = snsPermissionNotifyEvent2.f107766d;
                        aVar4.f107768b = false;
                        aVar4.f107767a = true;
                        String str3 = this.f202858t;
                        aVar4.f107769c = str3;
                        snsPermissionNotifyEvent2.f107766d.f107770d = ((C11766m0) C99019x.m128974f()).mo11654bD(str3, 5);
                        String str4 = this.f202858t;
                        if (this.f202851n.f220433y) {
                            i6 = 1;
                        }
                        mo96700S7(str4, i6, 5);
                        snsPermissionNotifyEvent2.publish();
                        if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false)) {
                            Intent intent = new Intent();
                            intent.putExtra("friend_message_transfer_username", this.f202858t);
                            intent.setAction("friend_message_accept_" + this.f202858t);
                            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2503er);
                            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2498em);
                            C88144b.m109791i(this, "subapp", ".ui.friend.FMessageTransferUI", intent, (Bundle) null);
                        }
                    }
                }
                getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
                C42599h.xx0(getIntent(), 1, 1, this.f202858t);
                setResult(-1, getIntent());
                if (this.f202821P) {
                    C70142g.m82629a(this.f202858t, mo96694M7(), 1, this.f202862x);
                }
                finish();
                mo96696O7(true);
                ((C119157j) C119157j.f356862d).mo183875f(new C70299w2(this, 1));
                if ((this.f202831U0 & 8) == 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            } else if (i4 == 4 && i5 == -302) {
                Log.m105929w("MicroMsg.SayHiWithSnsPermissionUI2", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", Integer.valueOf(yVar.getType() == 30 ? ((C44590b1) yVar2).f120898g : 0));
                C76879j.m92707A(this, getString(C0966R.string.f360313bt1), getString(C0966R.string.a3h), getString(C0966R.string.f7566ju), getString(C0966R.string.f7926wf), new C4965b(), (DialogInterface.OnClickListener) null);
            } else if (i4 == 4 && i5 == -24 && !Util.isNullOrNil(str)) {
                Toast.makeText(this, str2, 1).show();
            } else if (i4 == 4 && ((i5 == -2 || i5 == -101) && !Util.isNullOrNil(str))) {
                C76879j.m92754y(this, str2, "", getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            } else if (this.f202864y && (i5 == -24 || i5 == -34)) {
                Toast.makeText(this, C0966R.string.exz, 0).show();
            } else if (i4 == 4 && i5 == -3400 && this.f202808B) {
                this.f202809C = true;
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                if (!Util.isNullOrNil(str)) {
                    this.f202855q.setText(str2);
                }
                mo96699R7();
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(str2);
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C4966c());
                qVar.mo107603o();
            } else {
                Toast.makeText(this, C0966R.string.ilv, 0).show();
            }
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI2", "exception in onSceneEnd : " + e.getMessage());
        } finally {
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI2", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void onStop() {
        super.onStop();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f202815I;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
