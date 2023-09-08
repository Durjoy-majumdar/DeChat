package com.tencent.p014mm.plugin.profile.p088ui;

import a22.C67001a;
import ae3.C67030b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b22.C28250a;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.autogen.events.RecoverAccountFriendEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SavedHelloMsgReportStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
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
import cp3.C7123c;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import ff2.C8021d;
import g62.C32330n;
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
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import p011cm.C39989b;
import p148ei.C7660a;
import p256vw.C15014e;
import p256vw.C15015f;
import p62.C35382d;
import p629ny.C76979h;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import tc0.C77885p;
import tc2.C118418g;
import te3.C51034qz2;
import te3.sp4;
import te3.tp4;
import vo3.C90852c;
import wd3.C78543a;
import wd3.C78553c1;
import xc0.C78795g;
import zt3.C119157j;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI */
public class SayHiWithSnsPermissionUI extends MMActivity implements C11385n, C7020t0 {

    /* renamed from: r1 */
    public static final /* synthetic */ int f202707r1 = 0;

    /* renamed from: A */
    public String f202708A;

    /* renamed from: B */
    public int f202709B;

    /* renamed from: C */
    public boolean f202710C;

    /* renamed from: D */
    public boolean f202711D;

    /* renamed from: E */
    public boolean f202712E;

    /* renamed from: F */
    public boolean f202713F;

    /* renamed from: G */
    public int[] f202714G = new int[8];

    /* renamed from: H */
    public int[] f202715H = new int[6];

    /* renamed from: I */
    public int[] f202716I = new int[3];

    /* renamed from: J */
    public ImageView f202717J;

    /* renamed from: K */
    public TextView f202718K;

    /* renamed from: L */
    public String f202719L;

    /* renamed from: M */
    public boolean f202720M = false;

    /* renamed from: N */
    public boolean f202721N = false;

    /* renamed from: P */
    public boolean f202722P = false;

    /* renamed from: Q */
    public boolean f202723Q = false;

    /* renamed from: Q0 */
    public boolean f202724Q0 = false;

    /* renamed from: R */
    public boolean f202725R = false;

    /* renamed from: R0 */
    public String f202726R0;

    /* renamed from: S */
    public boolean f202727S = false;

    /* renamed from: S0 */
    public String f202728S0;

    /* renamed from: T */
    public boolean f202729T = false;

    /* renamed from: T0 */
    public int f202730T0 = 0;

    /* renamed from: U */
    public boolean f202731U = false;

    /* renamed from: U0 */
    public boolean f202732U0;

    /* renamed from: V */
    public View f202733V;

    /* renamed from: V0 */
    public int f202734V0;

    /* renamed from: W */
    public List<String> f202735W = new ArrayList();

    /* renamed from: W0 */
    public int f202736W0;

    /* renamed from: X */
    public ArrayList<String> f202737X = new ArrayList<>();

    /* renamed from: X0 */
    public List<String> f202738X0 = new ArrayList();

    /* renamed from: Y */
    public KeyboardHeightProvider f202739Y;

    /* renamed from: Y0 */
    public HashSet<String> f202740Y0 = new HashSet<>();

    /* renamed from: Z */
    public ArrayList<String> f202741Z = new ArrayList<>();

    /* renamed from: Z0 */
    public HashSet<String> f202742Z0 = new HashSet<>();

    /* renamed from: a1 */
    public HashSet<String> f202743a1 = new HashSet<>();

    /* renamed from: b1 */
    public HashSet<String> f202744b1 = new HashSet<>();

    /* renamed from: c1 */
    public CharSequence f202745c1 = null;

    /* renamed from: d */
    public EditText f202746d;

    /* renamed from: d1 */
    public final boolean[] f202747d1 = {true};

    /* renamed from: e */
    public String f202748e;

    /* renamed from: e1 */
    public final boolean[] f202749e1 = {false};

    /* renamed from: f */
    public TextView f202750f;

    /* renamed from: f1 */
    public long f202751f1 = System.currentTimeMillis();

    /* renamed from: g */
    public TextView f202752g;

    /* renamed from: g1 */
    public int f202753g1 = 0;

    /* renamed from: h */
    public EditText f202754h;

    /* renamed from: h1 */
    public int f202755h1 = 1;

    /* renamed from: i */
    public View f202756i;

    /* renamed from: i1 */
    public int f202757i1 = 1;

    /* renamed from: j */
    public TextView f202758j;

    /* renamed from: j1 */
    public int f202759j1 = 11;

    /* renamed from: k1 */
    public int f202760k1 = 0;

    /* renamed from: l1 */
    public C77398g f202761l1 = null;

    /* renamed from: m1 */
    public View f202762m1;

    /* renamed from: n */
    public MMSwitchBtn f202763n;

    /* renamed from: n1 */
    public EditText f202764n1;

    /* renamed from: o */
    public MMSwitchBtn f202765o;

    /* renamed from: o1 */
    public TextView f202766o1;

    /* renamed from: p */
    public TextView f202767p;

    /* renamed from: p0 */
    public LinearLayout f202768p0;

    /* renamed from: p1 */
    public String f202769p1;

    /* renamed from: q */
    public TextView f202770q;

    /* renamed from: q1 */
    public View f202771q1;

    /* renamed from: r */
    public TextView f202772r;

    /* renamed from: s */
    public TextView f202773s;

    /* renamed from: t */
    public WeImageView f202774t;

    /* renamed from: u */
    public WeImageView f202775u;

    /* renamed from: v */
    public ProgressDialog f202776v = null;

    /* renamed from: w */
    public String f202777w;

    /* renamed from: x */
    public String f202778x;

    /* renamed from: x0 */
    public TextView f202779x0;

    /* renamed from: y */
    public String f202780y;

    /* renamed from: y0 */
    public Button f202781y0;

    /* renamed from: z */
    public String f202782z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$a */
    public class C4952a implements View.OnClickListener {
        public C4952a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI.this.f202774t.setVisibility(4);
            SayHiWithSnsPermissionUI.this.f202775u.setVisibility(0);
            View findViewById = SayHiWithSnsPermissionUI.this.findViewById(C0966R.C0970id.hhw);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SayHiWithSnsPermissionUI.this.mo96672V7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$b */
    public class C4953b implements DialogInterface.OnClickListener {
        public C4953b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SayHiWithSnsPermissionUI.this.mo96666P7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$c */
    public class C4954c implements C47883u {
        public C4954c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            SayHiWithSnsPermissionUI.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(SayHiWithSnsPermissionUI.this));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(SayHiWithSnsPermissionUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$e */
    public class C4955e implements View.OnClickListener {
        public C4955e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$f */
    public class C4956f implements MMSwitchBtn.C7041b {
        public C4956f() {
        }

        public void onStatusChange(boolean z) {
            MMSwitchBtn mMSwitchBtn = SayHiWithSnsPermissionUI.this.f202763n;
            StringBuilder sb = new StringBuilder();
            sb.append(SayHiWithSnsPermissionUI.this.f202767p.getText());
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
            sb.append(sayHiWithSnsPermissionUI.getResources().getString(!sayHiWithSnsPermissionUI.f202763n.f220433y ? C0966R.string.f361227ib1 : C0966R.string.f361226ib0));
            mMSwitchBtn.setContentDescription(sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$g */
    public class C4957g implements MMSwitchBtn.C7041b {
        public C4957g() {
        }

        public void onStatusChange(boolean z) {
            MMSwitchBtn mMSwitchBtn = SayHiWithSnsPermissionUI.this.f202765o;
            StringBuilder sb = new StringBuilder();
            sb.append(SayHiWithSnsPermissionUI.this.f202770q.getText());
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
            sb.append(sayHiWithSnsPermissionUI.getResources().getString(!sayHiWithSnsPermissionUI.f202765o.f220433y ? C0966R.string.f361227ib1 : C0966R.string.f361226ib0));
            mMSwitchBtn.setContentDescription(sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$i */
    public class C4958i implements View.OnClickListener {
        public C4958i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = SayHiWithSnsPermissionUI.this.f202746d.getText().toString();
            SayHiWithSnsPermissionUI.m82750H7(SayHiWithSnsPermissionUI.this, 1, Util.isNullOrNil(obj) ^ true ? 1 : 0);
            SayHiWithSnsPermissionUI.m82751I7(SayHiWithSnsPermissionUI.this, obj);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$j */
    public class C4959j implements View.OnFocusChangeListener {
        public C4959j() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                if (!Util.isNullOrNil(SayHiWithSnsPermissionUI.this.f202754h.getHint()) && Util.isNullOrNil((CharSequence) SayHiWithSnsPermissionUI.this.f202754h.getText())) {
                    EditText editText = SayHiWithSnsPermissionUI.this.f202754h;
                    editText.setText(editText.getHint());
                    SayHiWithSnsPermissionUI.this.f202754h.setHint((CharSequence) null);
                }
                EditText editText2 = SayHiWithSnsPermissionUI.this.f202754h;
                editText2.setSelection(editText2.getText().length());
                SayHiWithSnsPermissionUI.this.f202724Q0 = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$o */
    public class C4960o implements View.OnClickListener {
        public C4960o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI.this.f202774t.setVisibility(0);
            SayHiWithSnsPermissionUI.this.f202775u.setVisibility(4);
            View findViewById = SayHiWithSnsPermissionUI.this.findViewById(C0966R.C0970id.hhw);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SayHiWithSnsPermissionUI.this.mo96672V7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p */
    public class C4961p extends ClickableSpan {

        /* renamed from: d */
        public String f20238d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p$a */
        public class C4962a implements C15014e {

            /* renamed from: a */
            public final /* synthetic */ CharSequence f20240a;

            public C4962a(CharSequence charSequence) {
                this.f20240a = charSequence;
            }

            /* renamed from: a */
            public void mo5899a(String str) {
                if (!Util.isNullOrNil(str)) {
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                    sayHiWithSnsPermissionUI.f202715H[3] = 1;
                    sayHiWithSnsPermissionUI.f202723Q = true;
                }
                EditText editText = SayHiWithSnsPermissionUI.this.f202754h;
                editText.setText(this.f20240a + str);
                SayHiWithSnsPermissionUI.this.f202754h.clearFocus();
                View view = SayHiWithSnsPermissionUI.this.f202756i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C4961p(String str) {
            this.f20238d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
            sayHiWithSnsPermissionUI.f202715H[1] = 1;
            if (sayHiWithSnsPermissionUI.f202711D) {
                Editable text = sayHiWithSnsPermissionUI.f202754h.getText();
                int e = C45078p0.m49926e(text.toString(), C45078p0.C45079a.MODE_CHINESE_AS_2);
                if (e > 0) {
                    SayHiWithSnsPermissionUI.this.f202715H[2] = 1;
                }
                ((C15015f) C86312j.m106911c(C15015f.class)).mo13690bo(SayHiWithSnsPermissionUI.this.getContext(), this.f20238d, e, 32, new C4962a(text));
            } else {
                sayHiWithSnsPermissionUI.f202723Q = true;
                String nullAsNil = Util.nullAsNil(C77382c.m93287e(this.f20238d, 32));
                if (!(nullAsNil == null || this.f20238d == null || nullAsNil.length() >= this.f20238d.length())) {
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
                    Toast.makeText(sayHiWithSnsPermissionUI2, sayHiWithSnsPermissionUI2.getString(C0966R.string.hza), 0).show();
                }
                EditText editText = SayHiWithSnsPermissionUI.this.f202754h;
                SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI.this;
                editText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(sayHiWithSnsPermissionUI3, nullAsNil, sayHiWithSnsPermissionUI3.f202754h.getTextSize()));
                SayHiWithSnsPermissionUI.this.f202754h.setSelection(nullAsNil.length());
                View view2 = SayHiWithSnsPermissionUI.this.f202756i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SayHiWithSnsPermissionUI.this.f202714G[4] = 1;
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(SayHiWithSnsPermissionUI.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$q */
    public class C4963q extends ClickableSpan {

        /* renamed from: d */
        public String f20242d;

        public C4963q(String str) {
            this.f20242d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
            if (sayHiWithSnsPermissionUI.f202713F) {
                SayHiWithSnsPermissionUI.m82750H7(sayHiWithSnsPermissionUI, 2, 0);
                SayHiWithSnsPermissionUI.this.f202725R = true;
                String nullAsNil = Util.nullAsNil(C77382c.m93287e(this.f20242d, 100));
                EditText editText = SayHiWithSnsPermissionUI.this.f202746d;
                SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
                editText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(sayHiWithSnsPermissionUI2, nullAsNil, sayHiWithSnsPermissionUI2.f202746d.getTextSize()));
                SayHiWithSnsPermissionUI.this.f202746d.setSelection(nullAsNil.length());
                SayHiWithSnsPermissionUI.this.f202752g.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(SayHiWithSnsPermissionUI.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$d */
    public class C70190d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f202783d;

        public C70190d(int i) {
            this.f202783d = i;
        }

        public void run() {
            ArrayList<String> arrayList = SayHiWithSnsPermissionUI.this.f202737X;
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder();
            int size2 = SayHiWithSnsPermissionUI.this.f202741Z.size();
            if (size2 > 0) {
                for (int i = 0; i < size2; i++) {
                    sb.append(SayHiWithSnsPermissionUI.this.f202741Z.get(i));
                    if (i < size2 - 1) {
                        sb.append("#");
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder();
            int size3 = arrayList.size();
            if (size3 > 0) {
                for (int i2 = 0; i2 < size3; i2++) {
                    sb4.append(arrayList.get(i2));
                    if (i2 < size3 - 1) {
                        sb4.append("#");
                    }
                }
            }
            String sb5 = sb4.toString();
            int l3 = C97625j3.m125812b().mo105907v().mo69711l3(C45628s0.f123409o, C75592q0.m90789s(), "weixin", "helper_entry", "filehelper");
            C115669n.INSTANCE.mo160131h(18713, SayHiWithSnsPermissionUI.this.f202778x, Integer.valueOf(this.f202783d), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202755h1), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202757i1), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202759j1), 2, Long.valueOf(System.currentTimeMillis() - SayHiWithSnsPermissionUI.this.f202751f1), Integer.valueOf(l3), "", sb5, sb, Integer.valueOf(size), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202760k1), 0, Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[0]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[1]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[2]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[3]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[4]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202715H[5]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202716I[0]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202716I[1]), Integer.valueOf(SayHiWithSnsPermissionUI.this.f202716I[2]));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$h */
    public class C70191h implements TextWatcher {
        public C70191h() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C118418g gVar = C118418g.INSTANCE;
            boolean[] zArr = SayHiWithSnsPermissionUI.this.f202747d1;
            if (zArr[0]) {
                zArr[0] = false;
                gVar.mo175830qv("ie_ver_usr");
            }
            gVar.mo175802VZ("ie_ver_usr");
            if (!charSequence.equals(SayHiWithSnsPermissionUI.this.f202748e)) {
                SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                if (!sayHiWithSnsPermissionUI.f202725R) {
                    sayHiWithSnsPermissionUI.f202748e = charSequence.toString();
                    SayHiWithSnsPermissionUI.this.f202750f.setVisibility(0);
                    SayHiWithSnsPermissionUI.this.f202752g.setVisibility(8);
                }
            }
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
            if (sayHiWithSnsPermissionUI2.f202725R) {
                sayHiWithSnsPermissionUI2.f202725R = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k */
    public class C70192k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f202786d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$a */
        public class C70193a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46498v f202788d;

            public C70193a(C70192k kVar, C46498v vVar) {
                this.f202788d = vVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202788d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$b */
        public class C70194b implements C39989b.C0706c {

            /* renamed from: a */
            public final /* synthetic */ String f202789a;

            /* renamed from: b */
            public final /* synthetic */ String f202790b;

            /* renamed from: c */
            public final /* synthetic */ String f202791c;

            /* renamed from: d */
            public final /* synthetic */ Map f202792d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList f202793e;

            /* renamed from: f */
            public final /* synthetic */ LinkedList f202794f;

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$b$a */
            public class C70195a implements C39989b.C0706c {
                public C70195a(C70194b bVar) {
                }

                /* renamed from: a */
                public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                    return true;
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$b$b */
            public class C70196b implements C78553c1.C78560f {
                public C70196b() {
                }

                /* renamed from: a */
                public void mo62593a() {
                    SayHiWithSnsPermissionUI.this.f202760k1++;
                }

                /* renamed from: b */
                public void mo62594b() {
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                    int i = SayHiWithSnsPermissionUI.f202707r1;
                    sayHiWithSnsPermissionUI.mo96662L7();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$b$c */
            public class C70197c implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78543a f202797d;

                public C70197c(C70194b bVar, C78543a aVar) {
                    this.f202797d = aVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202797d.getClass();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$b$d */
            public class C70198d implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78553c1 f202798d;

                public C70198d(C70194b bVar, C78553c1 c1Var) {
                    this.f202798d = c1Var;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202798d.mo108525a();
                }
            }

            public C70194b(String str, String str2, String str3, Map map, LinkedList linkedList, LinkedList linkedList2) {
                this.f202789a = str;
                this.f202790b = str2;
                this.f202791c = str3;
                this.f202792d = map;
                this.f202793e = linkedList;
                this.f202794f = linkedList2;
            }

            /* renamed from: a */
            public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                if (i == -4000) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
                    C78543a aVar = new C78543a(SayHiWithSnsPermissionUI.this, (C39989b.C0705b) null);
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                    aVar.f230031E = sayHiWithSnsPermissionUI.f202729T ? "" : this.f202789a;
                    String str5 = this.f202790b;
                    String str6 = this.f202791c;
                    aVar.f230048t = str5;
                    aVar.f230049u = str6;
                    aVar.f230032F = this.f202792d;
                    aVar.f230047s = sayHiWithSnsPermissionUI.f202777w;
                    aVar.f230036e = new C70195a(this);
                    aVar.f230051w = false;
                    aVar.f230030D = new C70196b();
                    aVar.f230034H = str4;
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI.this.f202778x);
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
                    aVar.mo108507j(sayHiWithSnsPermissionUI2, z1Var, sayHiWithSnsPermissionUI2.f202778x, this.f202793e);
                    SayHiWithSnsPermissionUI.this.mo96663M7();
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI.this;
                    sayHiWithSnsPermissionUI3.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI3.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.ilx), true, true, new C70197c(this, aVar));
                } else {
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI4 = SayHiWithSnsPermissionUI.this;
                    if (sayHiWithSnsPermissionUI4.f202729T) {
                        sayHiWithSnsPermissionUI4.getClass();
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(sayHiWithSnsPermissionUI4.f202778x);
                        if (z1Var2 != null) {
                            sayHiWithSnsPermissionUI4.f202769p1 = sayHiWithSnsPermissionUI4.getResources().getString(C0966R.string.bsz, new Object[]{z1Var2.getNickname()});
                        } else {
                            sayHiWithSnsPermissionUI4.f202769p1 = sayHiWithSnsPermissionUI4.getResources().getString(C0966R.string.f360312bt0);
                        }
                        sayHiWithSnsPermissionUI4.f202762m1 = View.inflate(sayHiWithSnsPermissionUI4, C0966R.C0971layout.bwo, (ViewGroup) null);
                        Object[] objArr = new Object[3];
                        objArr[0] = Boolean.valueOf(sayHiWithSnsPermissionUI4.f202769p1 == null);
                        String str7 = sayHiWithSnsPermissionUI4.f202769p1;
                        objArr[1] = Integer.valueOf(str7 == null ? 0 : str7.length());
                        objArr[2] = sayHiWithSnsPermissionUI4.f202769p1;
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
                        if (!Util.isNullOrNil(sayHiWithSnsPermissionUI4.f202769p1)) {
                            ((TextView) sayHiWithSnsPermissionUI4.f202762m1.findViewById(C0966R.C0970id.jc8)).setText(sayHiWithSnsPermissionUI4.f202769p1);
                        }
                        sayHiWithSnsPermissionUI4.f202771q1 = sayHiWithSnsPermissionUI4.f202762m1.findViewById(C0966R.C0970id.cd8);
                        sayHiWithSnsPermissionUI4.f202764n1 = (EditText) sayHiWithSnsPermissionUI4.f202762m1.findViewById(C0966R.C0970id.jc7);
                        TextView textView = (TextView) sayHiWithSnsPermissionUI4.f202762m1.findViewById(C0966R.C0970id.lr4);
                        sayHiWithSnsPermissionUI4.f202766o1 = textView;
                        textView.setVisibility(0);
                        sayHiWithSnsPermissionUI4.f202764n1.setText((CharSequence) null);
                        sayHiWithSnsPermissionUI4.f202766o1.setText(String.valueOf(50));
                        sayHiWithSnsPermissionUI4.f202764n1.setVisibility(8);
                        View view = sayHiWithSnsPermissionUI4.f202771q1;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C77398g z = C76879j.m92755z(sayHiWithSnsPermissionUI4, "", (String) null, sayHiWithSnsPermissionUI4.getString(C0966R.string.bsx), sayHiWithSnsPermissionUI4.f202762m1, new C70288p2(sayHiWithSnsPermissionUI4), new C70290q2(sayHiWithSnsPermissionUI4));
                        sayHiWithSnsPermissionUI4.f202761l1 = z;
                        if (z == null) {
                            sayHiWithSnsPermissionUI4.onStop();
                        }
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "dealAddContactError, resend request ver.");
                        String stringExtra = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_nick_name");
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI5 = SayHiWithSnsPermissionUI.this;
                        C78553c1 c1Var = new C78553c1(sayHiWithSnsPermissionUI5, (C39989b.C39992e) null);
                        c1Var.f230112q = this.f202789a;
                        c1Var.f230114s = stringExtra;
                        c1Var.f230115t = stringExtra2;
                        c1Var.f230113r = this.f202792d;
                        c1Var.f230116u = sayHiWithSnsPermissionUI5.f202777w;
                        c1Var.mo108533i(this.f202794f, this.f202793e);
                        SayHiWithSnsPermissionUI.this.mo96663M7();
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI6 = SayHiWithSnsPermissionUI.this;
                        sayHiWithSnsPermissionUI6.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI6.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.ilx), true, true, new C70198d(this, c1Var));
                    }
                }
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$c */
        public class C70199c implements C78553c1.C78560f {
            public C70199c() {
            }

            /* renamed from: a */
            public void mo62593a() {
                SayHiWithSnsPermissionUI.this.f202760k1++;
            }

            /* renamed from: b */
            public void mo62594b() {
                SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                int i = SayHiWithSnsPermissionUI.f202707r1;
                sayHiWithSnsPermissionUI.mo96662L7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$d */
        public class C70200d implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C78543a f202800d;

            public C70200d(C70192k kVar, C78543a aVar) {
                this.f202800d = aVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f202800d.getClass();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$e */
        public class C70201e implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46500x f202801d;

            public C70201e(C70192k kVar, C46500x xVar) {
                this.f202801d = xVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202801d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k$f */
        public class C70202f implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C44590b1 f202802d;

            public C70202f(C70192k kVar, C44590b1 b1Var) {
                this.f202802d = b1Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202802d);
            }
        }

        public C70192k(String str) {
            this.f202786d = str;
        }

        public void onClick(View view) {
            boolean z;
            boolean z2;
            C118418g gVar = C118418g.INSTANCE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProgressDialog progressDialog = SayHiWithSnsPermissionUI.this.f202776v;
            if (progressDialog == null || !progressDialog.isShowing()) {
                boolean[] zArr = SayHiWithSnsPermissionUI.this.f202749e1;
                if (zArr[0]) {
                    zArr[0] = false;
                } else {
                    gVar.Ud0("ce_ver_usr", "<VerifyUsr>", this.f202786d);
                    gVar.mo175827n9("ce_ver_usr", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                    gVar.ec0("ce_ver_usr");
                }
                gVar.mo175799SP(this.f202786d, 3);
                SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
                if (sayHiWithSnsPermissionUI.f202710C) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(SayHiWithSnsPermissionUI.this.f202778x);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(Integer.valueOf(SayHiWithSnsPermissionUI.this.f202709B));
                    String O7 = SayHiWithSnsPermissionUI.this.mo96665O7();
                    HashMap hashMap = new HashMap();
                    if (SayHiWithSnsPermissionUI.this.f202774t.getVisibility() != 0) {
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
                        z2 = sayHiWithSnsPermissionUI2.f202763n.f220433y;
                        if (sayHiWithSnsPermissionUI2.f202765o.f220433y) {
                            z2 |= true;
                        }
                    } else {
                        z2 = false;
                    }
                    if (SayHiWithSnsPermissionUI.this.f202774t.getVisibility() == 0) {
                        z2 |= true;
                    }
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI.this;
                    sayHiWithSnsPermissionUI3.f202753g1 = z2 ? 1 : 0;
                    hashMap.put(sayHiWithSnsPermissionUI3.f202778x, Integer.valueOf(z2));
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI", "select sns permission, %s", Integer.valueOf(z2));
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI4 = SayHiWithSnsPermissionUI.this;
                    if (sayHiWithSnsPermissionUI4.f202727S) {
                        C46498v vVar = new C46498v(SayHiWithSnsPermissionUI.this.f202778x, O7, sayHiWithSnsPermissionUI4.getIntent().getStringExtra("AntispamTicket"), z2);
                        C97625j3.m125815e().mo123460f(vVar);
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI5 = SayHiWithSnsPermissionUI.this;
                        sayHiWithSnsPermissionUI5.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI5.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.ilx), true, true, new C70193a(this, vVar));
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
                        String stringExtra = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_nick_name");
                        C78543a aVar = new C78543a(SayHiWithSnsPermissionUI.this, (C39989b.C0705b) null);
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI6 = SayHiWithSnsPermissionUI.this;
                        aVar.f230031E = sayHiWithSnsPermissionUI6.f202729T ? "" : O7;
                        aVar.f230048t = stringExtra;
                        aVar.f230049u = stringExtra2;
                        aVar.f230032F = hashMap;
                        aVar.f230047s = sayHiWithSnsPermissionUI6.f202777w;
                        C70194b bVar = r0;
                        C78543a aVar2 = aVar;
                        C70194b bVar2 = new C70194b(O7, stringExtra, stringExtra2, hashMap, linkedList2, linkedList);
                        aVar2.f230036e = bVar;
                        aVar2.f230051w = false;
                        aVar2.f230030D = new C70199c();
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI.this.f202778x);
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI7 = SayHiWithSnsPermissionUI.this;
                        aVar2.mo108507j(sayHiWithSnsPermissionUI7, z1Var, sayHiWithSnsPermissionUI7.f202778x, linkedList2);
                        SayHiWithSnsPermissionUI.this.mo96663M7();
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI8 = SayHiWithSnsPermissionUI.this;
                        sayHiWithSnsPermissionUI8.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI8.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.ilx), true, true, new C70200d(this, aVar2));
                    }
                } else if (sayHiWithSnsPermissionUI.f202712E) {
                    String stringExtra3 = sayHiWithSnsPermissionUI.getIntent().getStringExtra("Verify_ticket");
                    if (SayHiWithSnsPermissionUI.this.f202774t.getVisibility() != 0) {
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI9 = SayHiWithSnsPermissionUI.this;
                        boolean z3 = sayHiWithSnsPermissionUI9.f202763n.f220433y;
                        z = sayHiWithSnsPermissionUI9.f202765o.f220433y ? z3 | true : z3;
                    } else {
                        z = false;
                    }
                    if (SayHiWithSnsPermissionUI.this.f202774t.getVisibility() == 0) {
                        z |= true;
                    }
                    SayHiWithSnsPermissionUI.this.f202753g1 = z ? 1 : 0;
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI", "select sns permission, %s", Integer.valueOf(z));
                    SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI10 = SayHiWithSnsPermissionUI.this;
                    if (sayHiWithSnsPermissionUI10.f202727S) {
                        C46500x xVar = new C46500x(sayHiWithSnsPermissionUI10.f202778x, stringExtra3, z);
                        C97625j3.m125815e().mo123460f(xVar);
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI11 = SayHiWithSnsPermissionUI.this;
                        sayHiWithSnsPermissionUI11.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI11.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.blp), true, true, new C70201e(this, xVar));
                    } else {
                        C44590b1 b1Var = new C44590b1(3, sayHiWithSnsPermissionUI10.f202778x, stringExtra3, sayHiWithSnsPermissionUI10.f202709B, sayHiWithSnsPermissionUI10.f202777w, z ? 1 : 0);
                        C97625j3.m125815e().mo123460f(b1Var);
                        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI12 = SayHiWithSnsPermissionUI.this;
                        sayHiWithSnsPermissionUI12.f202776v = C76879j.m92723Q(sayHiWithSnsPermissionUI12.getContext(), SayHiWithSnsPermissionUI.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI.this.getString(C0966R.string.blp), true, true, new C70202f(this, b1Var));
                    }
                }
                long longExtra = SayHiWithSnsPermissionUI.this.getIntent().getLongExtra("key_msg_id", 0);
                if (C35382d.m40669B(longExtra)) {
                    C35382d.m40670O(longExtra, 4);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$l */
    public class C70203l implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ String f202803d;

        public C70203l(String str) {
            this.f202803d = str;
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
                java.lang.String r2 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$6"
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
                com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI r11 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.this
                boolean[] r11 = r11.f202749e1
                r11[r1] = r2
                java.lang.String r11 = r10.f202803d
                java.lang.String r12 = "<VerifyUsr>"
                r0.Ud0(r3, r12, r11)
            L_0x0048:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$6"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.C70203l.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$m */
    public class C70204m implements MenuItem.OnMenuItemClickListener {
        public C70204m() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = SayHiWithSnsPermissionUI.this;
            if (sayHiWithSnsPermissionUI.f202712E) {
                sayHiWithSnsPermissionUI.f202714G[1] = 1;
            }
            sayHiWithSnsPermissionUI.finish();
            SayHiWithSnsPermissionUI.this.mo96667Q7(false);
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = SayHiWithSnsPermissionUI.this;
            sayHiWithSnsPermissionUI2.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C70291r2(sayHiWithSnsPermissionUI2, 2));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$n */
    public class C70205n implements C77382c.C77383a {
        public C70205n(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
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
    public static void m82750H7(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, int i, int i2) {
        sayHiWithSnsPermissionUI.getClass();
        SavedHelloMsgReportStruct savedHelloMsgReportStruct = new SavedHelloMsgReportStruct();
        savedHelloMsgReportStruct.f156815d = (long) i;
        savedHelloMsgReportStruct.f156816e = (long) i2;
        savedHelloMsgReportStruct.mo86054n();
        savedHelloMsgReportStruct.mo86056r();
    }

    /* renamed from: I7 */
    public static void m82751I7(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, String str) {
        TextView textView = sayHiWithSnsPermissionUI.f202750f;
        if (textView != null) {
            textView.setVisibility(8);
            sp4 sp4 = new sp4();
            sp4.f141666d = str;
            tp4 tp4 = new tp4();
            if (!Util.isNullOrNil(sp4.f141666d)) {
                LinkedList<sp4> linkedList = new LinkedList<>();
                linkedList.add(sp4);
                tp4.f142323d = 1;
                tp4.f142324e = linkedList;
            } else {
                tp4.f142323d = 0;
                tp4.f142324e = null;
            }
            C51034qz2 qz22 = new C51034qz2();
            qz22.f140623d = tp4;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(231, qz22));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_COMMON_SAY_HI_STRING_SYNC, str);
            if (Util.isNullOrNil(str)) {
                C76912y0.m92768g(sayHiWithSnsPermissionUI.getContext(), sayHiWithSnsPermissionUI.getContext().getString(C0966R.string.f360096a30));
            } else {
                C76912y0.m92773l(sayHiWithSnsPermissionUI.getContext(), sayHiWithSnsPermissionUI.getContext().getString(C0966R.string.f8180sn));
            }
        }
    }

    /* renamed from: J7 */
    public final void mo96660J7(List<String> list) {
        C72985m3 bD = C75743h.wx0().mo101190bD(this.f202778x);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202778x);
        if (list != null && list.contains(this.f202778x)) {
            if (((int) z1Var.f108320R1) == 0) {
                z1Var = C67030b.m79190e(bD);
                z1Var.setUsername(this.f202778x);
                if (!C97625j3.m125812b().mo105907v().mo69667P3(z1Var)) {
                    Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI", "canAddContact fail, insert fail");
                    return;
                }
            }
            C45628s0.m50775g0(z1Var);
            ((MMNotification) C97625j3.m125816f()).mo93209g();
            C75743h.vx0().mo101171bF(this.f202778x, 1);
            C67030b.m79194i(this.f202778x, this.f202709B);
        }
    }

    /* renamed from: K7 */
    public final boolean mo96661K7(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    /* renamed from: L7 */
    public final void mo96662L7() {
        if (this.f202727S && this.f202765o.f220433y) {
            if (!((C11766m0) C99019x.m128974f()).mo11654bD(this.f202778x, 5)) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202778x);
                LinkedList linkedList = new LinkedList();
                linkedList.add(z1Var.getUsername());
                PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
                PostSnsTagMemberOptionEvent.C40153a aVar = postSnsTagMemberOptionEvent.f107691d;
                aVar.f107696e = linkedList;
                aVar.f107692a = 1;
                aVar.f107693b = 5;
                aVar.f107695d = true;
                postSnsTagMemberOptionEvent.publish();
            }
        }
        if (this.f202710C) {
            String trim = this.f202746d.getText().toString().trim();
            if (Util.isNullOrNil(trim) || trim.equals(this.f202745c1) || !Util.isNullOrNil(this.f202777w)) {
                C97625j3.m125812b().mo105906u().mo119676J(294913, "");
            } else {
                C97625j3.m125812b().mo105906u().mo119676J(294913, trim);
            }
        }
    }

    /* renamed from: M7 */
    public final void mo96663M7() {
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "dismissTipDialog");
        ProgressDialog progressDialog = this.f202776v;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f202776v = null;
        }
    }

    /* renamed from: N7 */
    public final String mo96664N7() {
        EditText editText = this.f202754h;
        String obj = (editText == null || editText.getText() == null) ? "" : this.f202754h.getText().toString();
        return (Util.isNullOrNil(obj) || obj.length() <= 50) ? obj : obj.substring(0, 50);
    }

    /* renamed from: O7 */
    public final String mo96665O7() {
        String trim = this.f202746d.getText().toString().trim();
        return C45078p0.m49926e(this.f202746d.getText().toString(), C45078p0.C45079a.MODE_CHINESE_AS_2) <= 100 ? trim : trim.substring(0, 100);
    }

    /* renamed from: P7 */
    public void mo96666P7(boolean z) {
        boolean z2;
        Intent intent = new Intent(this, SayHiWithSnsPermissionUI.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        if (this.f202774t.getVisibility() != 0) {
            z2 = this.f202763n.f220433y;
            if (this.f202765o.f220433y) {
                z2 |= true;
            }
        } else {
            z2 = false;
        }
        if (this.f202774t.getVisibility() == 0) {
            z2 |= true;
        }
        if (z) {
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", z2 ? 1 : 0);
        intent.putExtra("Contact_RemarkName", mo96664N7());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "height:%s", Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b5, code lost:
        r8.f202759j1 = 10;
     */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96667Q7(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.f202710C
            r1 = 4
            r2 = 1
            r3 = 3
            r4 = 2
            if (r0 == 0) goto L_0x000e
            if (r9 == 0) goto L_0x000c
            r9 = 1
            goto L_0x0013
        L_0x000c:
            r9 = 4
            goto L_0x0013
        L_0x000e:
            if (r9 == 0) goto L_0x0012
            r9 = 2
            goto L_0x0013
        L_0x0012:
            r9 = 3
        L_0x0013:
            java.lang.String r0 = r8.mo96664N7()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0020
            r8.f202755h1 = r3
            goto L_0x0046
        L_0x0020:
            java.lang.String r0 = r8.mo96664N7()
            java.lang.String r5 = r8.f202782z
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = r8.mo96664N7()
            java.lang.String r5 = r8.f202780y
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0039
            goto L_0x0044
        L_0x0039:
            boolean r0 = r8.f202723Q
            if (r0 == 0) goto L_0x0046
            boolean r0 = r8.f202724Q0
            if (r0 != 0) goto L_0x0046
            r8.f202755h1 = r1
            goto L_0x0046
        L_0x0044:
            r8.f202755h1 = r4
        L_0x0046:
            boolean r0 = r8.f202721N
            r5 = 5
            r6 = 6
            if (r0 == 0) goto L_0x004f
            r8.f202757i1 = r6
            goto L_0x006f
        L_0x004f:
            int r0 = r8.f202753g1
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0058
            r8.f202757i1 = r5
            goto L_0x006f
        L_0x0058:
            r7 = r0 & 1
            if (r7 == 0) goto L_0x0063
            r7 = r0 & 2
            if (r7 == 0) goto L_0x0063
            r8.f202757i1 = r1
            goto L_0x006f
        L_0x0063:
            r7 = r0 & 2
            if (r7 == 0) goto L_0x006a
            r8.f202757i1 = r3
            goto L_0x006f
        L_0x006a:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x006f
            r8.f202757i1 = r4
        L_0x006f:
            int r0 = r8.f202709B
            if (r0 == r2) goto L_0x00da
            if (r0 == r3) goto L_0x00d7
            if (r0 == r6) goto L_0x00d4
            r1 = 10
            if (r0 == r1) goto L_0x00d4
            r3 = 52
            if (r0 == r3) goto L_0x00d4
            r3 = 17
            if (r0 == r3) goto L_0x00d1
            r3 = 18
            if (r0 == r3) goto L_0x00cc
            r3 = 44
            if (r0 == r3) goto L_0x00cc
            r3 = 45
            if (r0 == r3) goto L_0x00c9
            r3 = 48
            if (r0 == r3) goto L_0x00c4
            r3 = 49
            if (r0 == r3) goto L_0x00c9
            r3 = 78
            if (r0 == r3) goto L_0x00bf
            r3 = 79
            if (r0 == r3) goto L_0x00bf
            r3 = 181(0xb5, float:2.54E-43)
            if (r0 == r3) goto L_0x00bf
            r3 = 182(0xb6, float:2.55E-43)
            if (r0 == r3) goto L_0x00bf
            switch(r0) {
                case 13: goto L_0x00d4;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00b8;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r0) {
                case 21: goto L_0x00d4;
                case 22: goto L_0x00b5;
                case 23: goto L_0x00b5;
                case 24: goto L_0x00b5;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r0) {
                case 26: goto L_0x00b5;
                case 27: goto L_0x00b5;
                case 28: goto L_0x00b5;
                case 29: goto L_0x00b5;
                case 30: goto L_0x00c9;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r0 = 11
            r8.f202759j1 = r0
            goto L_0x00dc
        L_0x00b5:
            r8.f202759j1 = r1
            goto L_0x00dc
        L_0x00b8:
            r8.f202759j1 = r4
            goto L_0x00dc
        L_0x00bb:
            r0 = 7
            r8.f202759j1 = r0
            goto L_0x00dc
        L_0x00bf:
            r0 = 12
            r8.f202759j1 = r0
            goto L_0x00dc
        L_0x00c4:
            r0 = 8
            r8.f202759j1 = r0
            goto L_0x00dc
        L_0x00c9:
            r8.f202759j1 = r6
            goto L_0x00dc
        L_0x00cc:
            r0 = 9
            r8.f202759j1 = r0
            goto L_0x00dc
        L_0x00d1:
            r8.f202759j1 = r5
            goto L_0x00dc
        L_0x00d4:
            r8.f202759j1 = r2
            goto L_0x00dc
        L_0x00d7:
            r8.f202759j1 = r3
            goto L_0x00dc
        L_0x00da:
            r8.f202759j1 = r1
        L_0x00dc:
            android.content.Intent r0 = r8.getIntent()
            r1 = -1
            java.lang.String r2 = "Contact_Source_Add"
            int r0 = r0.getIntExtra(r2, r1)
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L_0x00f0
            r0 = 14
            r8.f202759j1 = r0
            goto L_0x00f8
        L_0x00f0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 != r1) goto L_0x00f8
            r0 = 13
            r8.f202759j1 = r0
        L_0x00f8:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$d r1 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$d
            r1.<init>(r9)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.mo96667Q7(boolean):void");
    }

    /* renamed from: R7 */
    public final void mo96668R7() {
        int i;
        Resources resources;
        MMSwitchBtn mMSwitchBtn = this.f202763n;
        if (mMSwitchBtn != null && this.f202767p != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f202767p.getText());
            if (!this.f202763n.f220433y) {
                resources = getResources();
                i = C0966R.string.f361227ib1;
            } else {
                resources = getResources();
                i = C0966R.string.f361226ib0;
            }
            sb.append(resources.getString(i));
            mMSwitchBtn.setContentDescription(sb.toString());
            this.f202763n.setSwitchListener(new C4956f());
        }
    }

    /* renamed from: S7 */
    public final void mo96669S7() {
        int i;
        Resources resources;
        MMSwitchBtn mMSwitchBtn = this.f202765o;
        if (mMSwitchBtn != null && this.f202770q != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f202770q.getText());
            if (!this.f202765o.f220433y) {
                resources = getResources();
                i = C0966R.string.f361227ib1;
            } else {
                resources = getResources();
                i = C0966R.string.f361226ib0;
            }
            sb.append(resources.getString(i));
            mMSwitchBtn.setContentDescription(sb.toString());
            this.f202765o.setSwitchListener(new C4957g());
        }
    }

    /* renamed from: T7 */
    public final void mo96670T7() {
        Bitmap h = C78795g.m95196e().mo108710h(this.f202778x);
        ImageView imageView = this.f202717J;
        if (imageView != null) {
            if (h != null) {
                imageView.setVisibility(0);
                this.f202715H[5] = 1;
            } else {
                imageView.setVisibility(8);
            }
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202778x);
        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202778x);
        String nullAsNil = Lo != null ? Util.nullAsNil(Lo.field_conDescription) : "";
        if (Util.isNullOrNil(nullAsNil) && z1Var != null) {
            nullAsNil = z1Var.f149513S0;
        }
        if (this.f202718K != null) {
            this.f202715H[4] = C45078p0.m49928g(nullAsNil);
            this.f202718K.setText(nullAsNil);
        }
    }

    /* renamed from: U7 */
    public final void mo96671U7(List<String> list) {
        if (list == null || list.size() == 0) {
            this.f202779x0.setText("");
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
        this.f202779x0.setText(str);
    }

    /* renamed from: V7 */
    public final void mo96672V7() {
        TextView textView = this.f202773s;
        if (!(textView == null || this.f202774t == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f202773s.getText());
            sb.append(this.f202774t.getVisibility() != 4 ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
            textView.setContentDescription(sb.toString());
        }
        TextView textView2 = this.f202772r;
        if (textView2 != null && this.f202774t != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f202772r.getText());
            sb4.append(this.f202774t.getVisibility() == 4 ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
            textView2.setContentDescription(sb4.toString());
        }
    }

    /* renamed from: W7 */
    public final void mo96673W7() {
        int i;
        Resources resources;
        int i2;
        Resources resources2;
        this.f202774t.setVisibility((this.f202722P || this.f202721N) ? 0 : 4);
        this.f202775u.setVisibility((this.f202722P || this.f202721N) ? 4 : 0);
        mo96672V7();
        ((View) this.f202774t.getParent()).setOnClickListener(new C4960o());
        ((View) this.f202775u.getParent()).setOnClickListener(this.f202721N ? null : new C4952a());
        View findViewById = findViewById(C0966R.C0970id.hhw);
        int i3 = 8;
        int i4 = (!this.f202720M || (!this.f202722P && !this.f202721N)) ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i4));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = (TextView) findViewById(C0966R.C0970id.jv7);
        this.f202773s = textView;
        if (this.f202721N) {
            resources = getResources();
            i = C0966R.color.f3563xt;
        } else {
            resources = getResources();
            i = C0966R.color.a7f;
        }
        textView.setTextColor(resources.getColor(i));
        View findViewById2 = findViewById(C0966R.C0970id.f359349kf2);
        if (this.f202721N) {
            i3 = 0;
        }
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i3));
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView2 = this.f202773s;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f202773s.getText());
        if (this.f202775u.getVisibility() == 4) {
            resources2 = getResources();
            i2 = C0966R.string.f361226ib0;
        } else {
            resources2 = getResources();
            i2 = C0966R.string.f361227ib1;
        }
        sb.append(resources2.getString(i2));
        textView2.setContentDescription(sb.toString());
        this.f202722P = false;
    }

    /* renamed from: X7 */
    public final void mo96674X7(String str, int i, long j) {
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
        return C0966R.C0971layout.f359959bu2;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8021d.class);
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0b54, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0b56, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0b59, code lost:
        if (r0.f202710C != false) goto L_0x0c40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0b5b, code lost:
        if (r1 != false) goto L_0x0c40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0b5d, code lost:
        r0.f202715H[0] = 1;
        r1 = fd0.C75743h.wx0().mo101190bD(r0.f202778x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0b6b, code lost:
        if (r1 != null) goto L_0x0b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0b6f, code lost:
        r1 = ae3.C67030b.m79187b(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0b79, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1.f192525b) != false) goto L_0x0c40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0b88, code lost:
        if (r1.f192525b.equals(getString(com.tencent.p014mm.C0966R.string.exr)) == false) goto L_0x0b8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0b8c, code lost:
        getString(com.tencent.p014mm.C0966R.string.ilr).substring(0, getString(com.tencent.p014mm.C0966R.string.ilr).indexOf("%s"));
        r7 = r1.f192525b;
        r15 = r0.f202756i;
        r14 = new k20.C9556a();
        r11 = k20.C60958c.f173611a;
        r14.mo10233c(0);
        r5 = r15;
        j20.C117292a.m165358d(r15, r14.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r5.setVisibility(((java.lang.Integer) r14.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r5, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0.f202758j.setText(((p629ny.C76979h) di3.C86312j.m106911c(r2)).yp0(r0, com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(getString(com.tencent.p014mm.C0966R.string.bqu, new java.lang.Object[]{r1.f192525b})), r0.f202758j.getTextSize()));
        r1 = new de3.C75375u(getString(com.tencent.p014mm.C0966R.string.naf));
        r1.mo105705b(new com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.C4961p(r0, r7), 0, r1.length(), 17);
        r0.f202758j.append(" ");
        r0.f202758j.append(r1);
        r0.f202758j.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        r0.f202714G[3] = 3;
        r0.f202711D = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r35 = this;
            r0 = r35
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            android.content.Intent r3 = r35.getIntent()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "sayhi_with_sns_perm_send_verify"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202710C = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "sayhi_with_sns_perm_add_remark"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202712E = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "Contact_User"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202778x = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "Contact_Scene"
            r7 = 9
            int r3 = r3.getIntExtra(r6, r7)
            r0.f202709B = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "room_name"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202777w = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "Contact_RemarkName"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202708A = r3
            r0.f202728S0 = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "Contact_Nick"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202782z = r3
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r6 = "Contact_RoomNickname"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202780y = r3
            r3 = 2131309436(0x7f09337c, float:1.8237156E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202756i = r3
            r3 = 2131309437(0x7f09337d, float:1.8237158E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202758j = r3
            java.lang.String r3 = r0.f202778x
            boolean r3 = com.tencent.p014mm.plugin.profile.C70142g.m82634f(r3)
            r6 = 1
            if (r3 == 0) goto L_0x009d
            android.content.Intent r3 = r35.getIntent()
            java.lang.String r7 = "Contact_IsForceVerifyFriend"
            boolean r3 = r3.getBooleanExtra(r7, r4)
            if (r3 != 0) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            r0.f202729T = r3
            if (r3 != 0) goto L_0x00a8
            boolean r3 = r0.f202710C
            if (r3 == 0) goto L_0x00a8
            r3 = 1
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            r0.f202731U = r3
            java.lang.String r3 = r0.f202778x
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            java.lang.String r7 = "MicroMsg.SayHiWithSnsPermissionUI"
            r8 = 8
            r9 = 0
            if (r3 == 0) goto L_0x0115
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r10 = r0.f202778x
            r3[r4] = r10
            java.lang.String r10 = "initLabelPanelAll, isOpenIM, userName: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r3)
            r3 = 2131306955(0x7f0929cb, float:1.8232124E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x025b
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r12 = "initLabelPanelAll"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x025b
        L_0x0115:
            r3 = 2131300245(0x7f090f95, float:1.8218514E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202779x0 = r3
            r3.setVisibility(r4)
            r3 = 2131300247(0x7f090f97, float:1.8218518E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.f202768p0 = r3
            r3 = 2131297323(0x7f09042b, float:1.8212588E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x014e
            r8 = 2131756221(0x7f1004bd, float:1.9143343E38)
            androidx.appcompat.app.AppCompatActivity r10 = r35.getContext()
            r11 = 2131099712(0x7f060040, float:1.7811785E38)
            int r10 = kg3.C76577a.m92153d(r10, r11)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r8, r10)
            r3.setImageDrawable(r8)
        L_0x014e:
            android.widget.LinearLayout r3 = r0.f202768p0
            com.tencent.mm.plugin.profile.ui.n2 r8 = new com.tencent.mm.plugin.profile.ui.n2
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            r3 = 2131300246(0x7f090f96, float:1.8218516E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            com.tencent.mm.plugin.profile.ui.o2 r8 = new com.tencent.mm.plugin.profile.ui.o2
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            r3 = 2131312839(0x7f0940c7, float:1.8244058E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r3 = 2131306956(0x7f0929cc, float:1.8232126E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202733V = r3
            r3.setBackgroundDrawable(r9)
            android.view.View r3 = r0.f202733V
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r5)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r12 = "initLabelPanelAll"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            com.tencent.mm.storage.e2 r3 = a22.C27740g.vx0()
            java.util.ArrayList r3 = r3.mo100947TE()
            r0.f202735W = r3
            java.util.ArrayList<java.lang.String> r3 = r0.f202737X
            if (r3 == 0) goto L_0x0239
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.s r3 = r3.mo105880F()
            java.lang.String r8 = r0.f202778x
            com.tencent.mm.storage.a5 r3 = (com.tencent.p014mm.storage.C44651a5) r3
            com.tencent.mm.storage.z4 r3 = r3.mo69630Lo(r8)
            if (r3 == 0) goto L_0x01df
            java.lang.String r3 = r3.field_contactLabels
            goto L_0x01e0
        L_0x01df:
            r3 = r9
        L_0x01e0:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x022c
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            java.lang.String r10 = r0.f202778x
            com.tencent.mm.storage.z1 r8 = r8.get(r10)
            java.lang.String r10 = r8.mo73978v2()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x0210
            eb0.c r11 = eb0.C97625j3.m125812b()
            g62.s r11 = r11.mo105880F()
            com.tencent.mm.storage.a5 r11 = (com.tencent.p014mm.storage.C44651a5) r11
            com.tencent.mm.storage.z4 r10 = r11.mo69630Lo(r10)
            if (r10 == 0) goto L_0x0210
            java.lang.String r3 = r10.field_contactLabels
        L_0x0210:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r10 == 0) goto L_0x022c
            java.lang.String r8 = r8.getUsername()
            eb0.c r10 = eb0.C97625j3.m125812b()
            g62.s r10 = r10.mo105880F()
            com.tencent.mm.storage.a5 r10 = (com.tencent.p014mm.storage.C44651a5) r10
            com.tencent.mm.storage.z4 r8 = r10.mo69630Lo(r8)
            if (r8 == 0) goto L_0x022c
            java.lang.String r3 = r8.field_contactLabels
        L_0x022c:
            b22.b r8 = b22.C28250a.m38138a()
            a22.a r8 = (a22.C67001a) r8
            java.util.List r3 = r8.mo90969g(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x023a
        L_0x0239:
            r3 = r9
        L_0x023a:
            if (r3 == 0) goto L_0x0241
            java.util.ArrayList<java.lang.String> r8 = r0.f202737X
            r8.addAll(r3)
        L_0x0241:
            java.util.List<java.lang.String> r8 = r0.f202735W
            if (r8 == 0) goto L_0x024b
            int r8 = r8.size()
            r0.f202734V0 = r8
        L_0x024b:
            if (r3 == 0) goto L_0x0258
            int r8 = r3.size()
            r0.f202736W0 = r8
            java.util.List<java.lang.String> r8 = r0.f202738X0
            r8.addAll(r3)
        L_0x0258:
            r0.mo96671U7(r3)
        L_0x025b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "isCurrentHappenChatting = "
            r3.append(r8)
            boolean r8 = r0.f202729T
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            lc3.b r3 = (lc3.C10485b) r3
            pj.f r3 = r3.vh0()
            java.lang.String r8 = "MMSocialBlackListFlag"
            int r3 = r3.mo107404b(r8, r6)
            if (r3 != r6) goto L_0x0287
            r3 = 1
            goto L_0x0288
        L_0x0287:
            r3 = 0
        L_0x0288:
            r0.f202720M = r3
            r8 = 2131314910(0x7f0948de, float:1.8248258E38)
            if (r3 != 0) goto L_0x02dc
            android.view.View r3 = r0.findViewById(r8)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r11)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x02dc:
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.lang.String r9 = r0.f202778x
            com.tencent.mm.storage.z1 r3 = r3.get(r9)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC
            int r9 = r9.mo119689j(r10, r4)
            if (r9 != r6) goto L_0x0301
            r9 = 1
            goto L_0x0302
        L_0x0301:
            r9 = 0
        L_0x0302:
            r0.f202722P = r9
            r9 = 2131310355(0x7f093713, float:1.823902E38)
            android.view.View r10 = r0.findViewById(r9)
            r11 = 2131310359(0x7f093717, float:1.8239028E38)
            android.view.View r10 = r10.findViewById(r11)
            com.tencent.mm.ui.widget.MMSwitchBtn r10 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r10
            r0.f202763n = r10
            android.content.Intent r10 = r35.getIntent()
            java.lang.String r11 = "sayhi_with_sns_permission"
            r10.getBooleanExtra(r11, r4)
            com.tencent.mm.ui.widget.MMSwitchBtn r10 = r0.f202763n
            boolean r11 = r3.mo62943y3()
            r10.setCheck(r11)
            r10 = 2131314907(0x7f0948db, float:1.8248252E38)
            android.view.View r10 = r0.findViewById(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r10
            r0.f202774t = r10
            r10 = 2131314069(0x7f094595, float:1.8246553E38)
            android.view.View r10 = r0.findViewById(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r10
            r0.f202775u = r10
            r10 = 2131314912(0x7f0948e0, float:1.8248262E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f202772r = r10
            r10 = 2131313919(0x7f0944ff, float:1.8246248E38)
            android.view.View r10 = r0.findViewById(r10)
            r11 = 2131310368(0x7f093720, float:1.8239046E38)
            android.view.View r10 = r10.findViewById(r11)
            com.tencent.mm.ui.widget.MMSwitchBtn r10 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r10
            r0.f202765o = r10
            java.lang.String r10 = r0.f202778x
            jr2.t r11 = jr2.C99019x.m128974f()
            r12 = 5
            os2.m0 r11 = (os2.C11766m0) r11
            boolean r10 = r11.mo11654bD(r10, r12)
            com.tencent.mm.ui.widget.MMSwitchBtn r11 = r0.f202765o
            r11.setCheck(r10)
            r10 = 2131298175(0x7f09077f, float:1.8214316E38)
            android.view.View r10 = r0.findViewById(r10)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$e r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$e
            r11.<init>()
            r10.setOnClickListener(r11)
            r10 = 2131300847(0x7f0911ef, float:1.8219735E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0.f202717J = r10
            r10 = 2131300853(0x7f0911f5, float:1.8219747E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f202718K = r10
            java.lang.String r11 = r3.f149513S0
            r10.setText(r11)
            r35.mo96670T7()
            int r3 = r3.f149500H
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r10[r4] = r11
            java.lang.String r11 = "sex:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r10)
            r10 = 2131310360(0x7f093718, float:1.823903E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f202767p = r10
            r11 = 2
            if (r3 != r6) goto L_0x03c1
            r12 = 2131837076(0x7f114094, float:1.9307337E38)
            r10.setText(r12)
            goto L_0x03c9
        L_0x03c1:
            if (r3 != r11) goto L_0x03c9
            r12 = 2131837075(0x7f114093, float:1.9307335E38)
            r10.setText(r12)
        L_0x03c9:
            r10 = 2131310369(0x7f093721, float:1.8239048E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f202770q = r10
            if (r3 != r6) goto L_0x03dd
            r12 = 2131836860(0x7f113fbc, float:1.9306899E38)
            r10.setText(r12)
            goto L_0x03e5
        L_0x03dd:
            if (r3 != r11) goto L_0x03e5
            r12 = 2131836859(0x7f113fbb, float:1.9306897E38)
            r10.setText(r12)
        L_0x03e5:
            java.lang.String r10 = r0.f202778x
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85843n5(r10)
            r0.f202727S = r10
            r12 = 2131310358(0x7f093716, float:1.8239026E38)
            if (r10 == 0) goto L_0x04a4
            android.view.View r8 = r0.findViewById(r8)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.mo10233c(r14)
            java.lang.Object[] r21 = r10.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r23 = "initView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r8
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r10 = r10.mo10231a(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setVisibility(r10)
            java.lang.String r21 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r8 = r0.findViewById(r9)
            if (r8 == 0) goto L_0x0480
            k20.a r9 = new k20.a
            r9.<init>()
            r10 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r13)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r30 = "initView"
            java.lang.String r31 = "()V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r8
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r29 = "initView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0480:
            android.view.View r8 = r0.findViewById(r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131834199(0x7f113557, float:1.9301502E38)
            r8.setText(r9)
            if (r3 != r6) goto L_0x0498
            android.widget.TextView r3 = r0.f202770q
            r8 = 2131834165(0x7f113535, float:1.9301433E38)
            r3.setText(r8)
            goto L_0x058a
        L_0x0498:
            if (r3 != r11) goto L_0x058a
            android.widget.TextView r3 = r0.f202770q
            r8 = 2131834163(0x7f113533, float:1.9301429E38)
            r3.setText(r8)
            goto L_0x058a
        L_0x04a4:
            android.view.View r3 = r0.findViewById(r12)
            boolean r8 = r3 instanceof android.widget.TextView
            if (r8 == 0) goto L_0x04be
            android.widget.TextView r3 = (android.widget.TextView) r3
            boolean r8 = qy2.C77448f0.m93394f()
            if (r8 == 0) goto L_0x04b8
            r8 = 2131834175(0x7f11353f, float:1.9301453E38)
            goto L_0x04bb
        L_0x04b8:
            r8 = 2131834173(0x7f11353d, float:1.9301449E38)
        L_0x04bb:
            r3.setText(r8)
        L_0x04be:
            r35.mo96673W7()
            android.content.Intent r3 = r35.getIntent()
            r8 = -1
            java.lang.String r9 = "Contact_default_permission"
            int r3 = r3.getIntExtra(r9, r8)
            if (r3 <= 0) goto L_0x058a
            r8 = r3 & 8
            r9 = 2131310357(0x7f093715, float:1.8239024E38)
            r10 = 4
            r12 = 8
            if (r8 != r12) goto L_0x052b
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202774t
            r3.setVisibility(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f202775u
            r3.setVisibility(r10)
            android.view.View r3 = r0.findViewById(r9)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8.mo10233c(r9)
            java.lang.Object[] r21 = r8.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r23 = "initView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r3
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r21 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r35.mo96668R7()
            goto L_0x058a
        L_0x052b:
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r0.f202774t
            r8.setVisibility(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = r0.f202775u
            r8.setVisibility(r4)
            android.view.View r12 = r0.findViewById(r9)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r8.mo10233c(r5)
            java.lang.Object[] r21 = r8.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r23 = "initView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r12
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r12.setVisibility(r8)
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r14 = "initView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            r8 = r3 & 1
            if (r8 != r6) goto L_0x057f
            com.tencent.mm.ui.widget.MMSwitchBtn r8 = r0.f202763n
            r8.setCheck(r6)
        L_0x057f:
            r3 = r3 & r11
            if (r3 != r11) goto L_0x0587
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r0.f202765o
            r3.setCheck(r6)
        L_0x0587:
            r35.mo96669S7()
        L_0x058a:
            boolean r3 = r0.f202710C
            java.lang.String r8 = " "
            r12 = 2131840234(0x7f114cea, float:1.9313742E38)
            r13 = 17
            if (r3 == 0) goto L_0x0758
            r3 = 2131312723(0x7f094053, float:1.8243823E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r0.f202746d = r3
            r3 = 2131313245(0x7f09425d, float:1.8244881E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202750f = r3
            r3 = 2131300047(0x7f090ecf, float:1.8218113E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202752g = r3
            boolean r3 = r0.f202731U
            java.lang.String r14 = ""
            if (r3 != 0) goto L_0x05bd
            goto L_0x0630
        L_0x05bd:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_COMMON_SAY_HI_STRING_SYNC
            java.lang.String r3 = r3.mo119675I(r15, r14)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r15 != 0) goto L_0x0630
            r0.f202713F = r6
            android.widget.TextView r15 = r0.f202752g
            r15.setVisibility(r4)
            android.widget.TextView r15 = r0.f202752g
            di3.d r16 = di3.C86312j.m106911c(r2)
            r11 = r16
            ny.h r11 = (p629ny.C76979h) r11
            r9 = 2131834203(0x7f11355b, float:1.930151E38)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r4] = r3
            java.lang.String r9 = r0.getString(r9, r10)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            android.widget.TextView r10 = r0.f202752g
            float r10 = r10.getTextSize()
            android.text.SpannableString r9 = r11.yp0(r0, r9, r10)
            r15.setText(r9)
            de3.u r9 = new de3.u
            java.lang.String r10 = r0.getString(r12)
            r9.<init>((java.lang.String) r10)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$q r10 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$q
            r10.<init>(r3)
            int r3 = r9.length()
            r9.mo105705b(r10, r4, r3, r13)
            android.widget.TextView r3 = r0.f202752g
            r3.append(r8)
            android.widget.TextView r3 = r0.f202752g
            r3.append(r9)
            android.widget.TextView r3 = r0.f202752g
            android.text.method.MovementMethod r9 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r9)
            android.widget.TextView r3 = r0.f202752g
            com.tencent.mm.plugin.profile.ui.s2 r9 = new com.tencent.mm.plugin.profile.ui.s2
            r9.<init>(r0)
            r3.setOnLongClickListener(r9)
        L_0x0630:
            android.widget.EditText r3 = r0.f202746d
            qn3.c r3 = qn3.C77382c.m93286b(r3)
            r3.f225611e = r4
            r9 = 100
            r3.f225610d = r9
            r9 = 0
            r3.mo107499d(r9)
            java.lang.String r3 = eb0.C75592q0.m90783m()
            if (r3 != 0) goto L_0x0647
            goto L_0x0648
        L_0x0647:
            r14 = r3
        L_0x0648:
            r3 = 2131835636(0x7f113af4, float:1.9304416E38)
            java.lang.String r9 = r0.getString(r3)
            int r3 = r9.length()
            int r10 = r14.length()
            int r3 = r3 + r10
            r10 = 50
            if (r3 <= r10) goto L_0x0665
            int r3 = r9.length()
            int r10 = r10 - r3
            java.lang.String r14 = r14.substring(r4, r10)
        L_0x0665:
            java.lang.String r3 = r0.f202777w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x06ea
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r3 = r0.f202777w
            com.tencent.mm.storage.z1 r1 = r1.get(r3)
            if (r1 == 0) goto L_0x06ea
            java.lang.String r3 = r1.getNickname()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x06ea
            java.lang.Class<a11.c> r3 = a11.C39479c.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            a11.c r3 = (a11.C39479c) r3
            eb0.m2 r3 = r3.mo62084mr()
            java.lang.String r10 = r0.f202777w
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69801SE(r10)
            java.lang.String r10 = eb0.C75592q0.m90789s()
            java.lang.String r3 = r3.mo69789q2(r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r10 == 0) goto L_0x06ac
            r3 = r14
        L_0x06ac:
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r15 = r0.f202777w
            r11[r4] = r15
            java.lang.String r15 = r1.getNickname()
            r11[r6] = r15
            java.lang.String r15 = "chatroomName:%s nick:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r11)
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            androidx.appcompat.app.AppCompatActivity r15 = r35.getContext()
            android.content.res.Resources r12 = r35.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r1 = r1.getNickname()
            r13[r4] = r1
            r13[r6] = r3
            r1 = 2131835637(0x7f113af5, float:1.9304418E38)
            java.lang.String r1 = r12.getString(r1, r13)
            android.widget.EditText r3 = r0.f202746d
            float r3 = r3.getTextSize()
            android.text.SpannableString r1 = r11.yp0(r15, r1, r3)
            r0.f202745c1 = r1
            goto L_0x06eb
        L_0x06ea:
            r1 = 0
        L_0x06eb:
            java.lang.CharSequence r3 = r0.f202745c1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r3 == 0) goto L_0x0711
            di3.d r3 = di3.C86312j.m106911c(r2)
            ny.h r3 = (p629ny.C76979h) r3
            androidx.appcompat.app.AppCompatActivity r10 = r35.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r4] = r14
            java.lang.String r9 = java.lang.String.format(r9, r11)
            android.widget.EditText r11 = r0.f202746d
            float r11 = r11.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r10, r9, r11)
            r0.f202745c1 = r3
        L_0x0711:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r3 == 0) goto L_0x071f
            android.widget.EditText r1 = r0.f202746d
            java.lang.CharSequence r3 = r0.f202745c1
            r1.setText(r3)
            goto L_0x0738
        L_0x071f:
            di3.d r3 = di3.C86312j.m106911c(r2)
            ny.h r3 = (p629ny.C76979h) r3
            androidx.appcompat.app.AppCompatActivity r9 = r35.getContext()
            android.widget.EditText r10 = r0.f202746d
            float r10 = r10.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r9, r1, r10)
            android.widget.EditText r3 = r0.f202746d
            r3.setText(r1)
        L_0x0738:
            android.widget.EditText r1 = r0.f202746d
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.f202748e = r1
            android.widget.EditText r1 = r0.f202746d
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$h r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$h
            r3.<init>()
            r1.addTextChangedListener(r3)
            android.widget.TextView r1 = r0.f202750f
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$i r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$i
            r3.<init>()
            r1.setOnClickListener(r3)
        L_0x0758:
            android.widget.EditText r1 = r0.f202746d
            r3 = 3
            if (r1 == 0) goto L_0x07a5
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.widget.LinearLayout
            if (r1 != 0) goto L_0x0766
            goto L_0x07a5
        L_0x0766:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            boolean r9 = r0.f202710C
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r1[r4] = r9
            boolean r9 = r0.f202729T
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r1[r6] = r9
            boolean r9 = r0.f202731U
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10 = 2
            r1[r10] = r9
            java.lang.String r9 = "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r1)
            boolean r1 = r0.f202731U
            if (r1 == 0) goto L_0x0797
            android.widget.EditText r1 = r0.f202746d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            goto L_0x07ab
        L_0x0797:
            android.widget.EditText r1 = r0.f202746d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7 = 8
            r1.setVisibility(r7)
            goto L_0x07ab
        L_0x07a5:
            java.lang.String r1 = "updateSayHiContextVisiable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x07ab:
            boolean r1 = r0.f202712E
            if (r1 == 0) goto L_0x0c88
            r1 = 2131312726(0x7f094056, float:1.8243829E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f202754h = r1
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            boolean r1 = r0.f202710C
            if (r1 != 0) goto L_0x07cc
            android.widget.EditText r1 = r0.f202754h
            r1.clearFocus()
        L_0x07cc:
            android.widget.EditText r1 = r0.f202754h
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r1.f225611e = r4
            r7 = 100
            r1.f225610d = r7
            r7 = 0
            r1.mo107499d(r7)
            android.widget.EditText r1 = r0.f202754h
            android.text.InputFilter[] r9 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0.f212544a
            r1.setFilters(r9)
            boolean r1 = r0.f202710C
            if (r1 != 0) goto L_0x07f2
            r1 = 2131834192(0x7f113550, float:1.9301487E38)
            r0.setMMTitle((int) r1)
            int[] r1 = r0.f202714G
            r1[r4] = r6
            goto L_0x07f8
        L_0x07f2:
            r1 = 2131834201(0x7f113559, float:1.9301506E38)
            r0.setMMTitle((int) r1)
        L_0x07f8:
            java.lang.String r1 = r0.f202708A
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0822
            android.widget.EditText r1 = r0.f202754h
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            androidx.appcompat.app.AppCompatActivity r5 = r35.getContext()
            java.lang.String r7 = r0.f202708A
            android.widget.EditText r8 = r0.f202754h
            float r8 = r8.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r5, r7, r8)
            r1.setText(r2)
            int[] r1 = r0.f202714G
            r2 = 6
            r1[r2] = r6
            goto L_0x0c40
        L_0x0822:
            java.lang.String r1 = r0.f202782z
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x084f
            android.widget.EditText r1 = r0.f202754h
            di3.d r9 = di3.C86312j.m106911c(r2)
            ny.h r9 = (p629ny.C76979h) r9
            androidx.appcompat.app.AppCompatActivity r10 = r35.getContext()
            java.lang.String r11 = r0.f202782z
            android.widget.EditText r12 = r0.f202754h
            float r12 = r12.getTextSize()
            android.text.SpannableString r9 = r9.yp0(r10, r11, r12)
            r1.setHint(r9)
            android.widget.EditText r1 = r0.f202754h
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$j r9 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$j
            r9.<init>()
            r1.setOnFocusChangeListener(r9)
        L_0x084f:
            int r1 = r0.f202709B
            r9 = 2131840235(0x7f114ceb, float:1.9313744E38)
            r10 = 2131824308(0x7f110eb4, float:1.928144E38)
            switch(r1) {
                case 8: goto L_0x0a9a;
                case 9: goto L_0x085a;
                case 10: goto L_0x09d0;
                case 11: goto L_0x09d0;
                case 12: goto L_0x085a;
                case 13: goto L_0x09d0;
                case 14: goto L_0x0a9a;
                case 15: goto L_0x085a;
                case 16: goto L_0x085a;
                case 17: goto L_0x085a;
                case 18: goto L_0x091a;
                case 19: goto L_0x085a;
                case 20: goto L_0x085a;
                case 21: goto L_0x085a;
                case 22: goto L_0x085c;
                case 23: goto L_0x085c;
                case 24: goto L_0x085c;
                case 25: goto L_0x085a;
                case 26: goto L_0x085c;
                case 27: goto L_0x085c;
                case 28: goto L_0x085c;
                case 29: goto L_0x085c;
                default: goto L_0x085a;
            }
        L_0x085a:
            goto L_0x0b56
        L_0x085c:
            int[] r1 = r0.f202715H
            r1[r4] = r6
            com.tencent.mm.storage.v4 r1 = fd0.C75743h.yx0()
            java.lang.String r11 = r0.f202778x
            com.tencent.mm.storage.u4[] r1 = r1.mo101226qq(r11, r6)
            if (r1 == 0) goto L_0x086f
            r1 = r1[r4]
            goto L_0x0870
        L_0x086f:
            r1 = r7
        L_0x0870:
            if (r1 != 0) goto L_0x0874
            goto L_0x0b56
        L_0x0874:
            ae3.b r1 = ae3.C67030b.m79188c(r0, r1)
            java.lang.String r7 = r1.f192525b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0882
            goto L_0x0b56
        L_0x0882:
            java.lang.String r7 = r1.f192525b
            r0.f202719L = r7
            android.view.View r11 = r0.f202756i
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r12.mo10233c(r5)
            java.lang.Object[] r23 = r12.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r25 = "initShakeArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r11
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r12 = r12.mo10231a(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r23 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r24 = "initShakeArea"
            java.lang.String r25 = "()Z"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r11 = r0.f202758j
            di3.d r12 = di3.C86312j.m106911c(r2)
            ny.h r12 = (p629ny.C76979h) r12
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r1 = r1.f192525b
            r13[r4] = r1
            java.lang.String r1 = r0.getString(r10, r13)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r13 = r0.f202758j
            float r13 = r13.getTextSize()
            android.text.SpannableString r1 = r12.yp0(r0, r1, r13)
            r11.setText(r1)
            de3.u r1 = new de3.u
            java.lang.String r11 = r0.getString(r9)
            r1.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p
            r11.<init>(r7)
            int r7 = r1.length()
            r12 = 17
            r1.mo105705b(r11, r4, r7, r12)
            android.widget.TextView r7 = r0.f202758j
            r7.append(r8)
            android.widget.TextView r7 = r0.f202758j
            r7.append(r1)
            android.widget.TextView r1 = r0.f202758j
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r7)
            int[] r1 = r0.f202714G
            r1[r3] = r3
            r0.f202711D = r6
            goto L_0x0b54
        L_0x091a:
            int[] r1 = r0.f202715H
            r1[r4] = r6
            com.tencent.mm.storage.c4 r1 = fd0.C75743h.xx0()
            java.lang.String r11 = r0.f202778x
            com.tencent.mm.storage.b4[] r1 = r1.mo100932Ow(r11, r6)
            if (r1 == 0) goto L_0x092d
            r1 = r1[r4]
            goto L_0x092e
        L_0x092d:
            r1 = r7
        L_0x092e:
            if (r1 != 0) goto L_0x0932
            goto L_0x0b56
        L_0x0932:
            java.lang.String r1 = r1.field_sayhicontent
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 == 0) goto L_0x093c
            goto L_0x0b56
        L_0x093c:
            r0.f202719L = r1
            android.view.View r7 = r0.f202756i
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r11.mo10233c(r5)
            java.lang.Object[] r23 = r11.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r25 = "initLBSArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r7
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r7.setVisibility(r11)
            java.lang.String r23 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r24 = "initLBSArea"
            java.lang.String r25 = "()Z"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r7 = r0.f202758j
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r4] = r1
            java.lang.String r12 = r0.getString(r10, r12)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.widget.TextView r13 = r0.f202758j
            float r13 = r13.getTextSize()
            android.text.SpannableString r11 = r11.yp0(r0, r12, r13)
            r7.setText(r11)
            de3.u r7 = new de3.u
            java.lang.String r11 = r0.getString(r9)
            r7.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p
            r11.<init>(r1)
            int r1 = r7.length()
            r12 = 17
            r7.mo105705b(r11, r4, r1, r12)
            android.widget.TextView r1 = r0.f202758j
            r1.append(r8)
            android.widget.TextView r1 = r0.f202758j
            r1.append(r7)
            android.widget.TextView r1 = r0.f202758j
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r7)
            int[] r1 = r0.f202714G
            r1[r3] = r3
            r0.f202711D = r6
            goto L_0x0b54
        L_0x09d0:
            hg0.b r1 = dg0.C75398e.vx0()
            java.lang.String r7 = r0.f202778x
            hg0.a r1 = r1.mo106401a(r7)
            if (r1 == 0) goto L_0x0b56
            java.lang.String r7 = r1.mo106388h()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0b56
            java.lang.String r7 = r1.mo106388h()
            android.widget.EditText r11 = r0.f202754h
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x09fc
            goto L_0x0b56
        L_0x09fc:
            android.view.View r7 = r0.f202756i
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r11.mo10233c(r5)
            java.lang.Object[] r23 = r11.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r25 = "initMobileNameArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r7
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r7.setVisibility(r11)
            java.lang.String r23 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r24 = "initMobileNameArea"
            java.lang.String r25 = "()Z"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r7 = r0.f202758j
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            r12 = 2131824306(0x7f110eb2, float:1.9281436E38)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r14 = r1.mo106388h()
            r13[r4] = r14
            java.lang.String r12 = r0.getString(r12, r13)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.widget.TextView r13 = r0.f202758j
            float r13 = r13.getTextSize()
            android.text.SpannableString r11 = r11.yp0(r0, r12, r13)
            r7.setText(r11)
            de3.u r7 = new de3.u
            r11 = 2131840234(0x7f114cea, float:1.9313742E38)
            java.lang.String r11 = r0.getString(r11)
            r7.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p
            java.lang.String r1 = r1.mo106388h()
            r11.<init>(r1)
            int r1 = r7.length()
            r12 = 17
            r7.mo105705b(r11, r4, r1, r12)
            android.widget.TextView r1 = r0.f202758j
            r1.append(r8)
            android.widget.TextView r1 = r0.f202758j
            r1.append(r7)
            android.widget.TextView r1 = r0.f202758j
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r7)
            int[] r1 = r0.f202714G
            r1[r3] = r6
            goto L_0x0b54
        L_0x0a9a:
            java.lang.String r1 = r0.f202780y
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0b56
            java.lang.String r1 = r0.f202780y
            android.widget.EditText r7 = r0.f202754h
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0ab6
            goto L_0x0b56
        L_0x0ab6:
            int[] r1 = r0.f202715H
            r7 = 2
            r1[r4] = r7
            android.view.View r1 = r0.f202756i
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r23 = r7.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r25 = "initChatroomNameArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r23 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r24 = "initChatroomNameArea"
            java.lang.String r25 = "()Z"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r1 = r0.f202758j
            di3.d r7 = di3.C86312j.m106911c(r2)
            ny.h r7 = (p629ny.C76979h) r7
            r11 = 2131824305(0x7f110eb1, float:1.9281434E38)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = r0.f202780y
            r12[r4] = r13
            java.lang.String r11 = r0.getString(r11, r12)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            android.widget.TextView r12 = r0.f202758j
            float r12 = r12.getTextSize()
            android.text.SpannableString r7 = r7.yp0(r0, r11, r12)
            r1.setText(r7)
            de3.u r1 = new de3.u
            r7 = 2131840234(0x7f114cea, float:1.9313742E38)
            java.lang.String r7 = r0.getString(r7)
            r1.<init>((java.lang.String) r7)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p r7 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p
            java.lang.String r11 = r0.f202780y
            r7.<init>(r11)
            int r11 = r1.length()
            r12 = 17
            r1.mo105705b(r7, r4, r11, r12)
            android.widget.TextView r7 = r0.f202758j
            r7.append(r8)
            android.widget.TextView r7 = r0.f202758j
            r7.append(r1)
            android.widget.TextView r1 = r0.f202758j
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r7)
            int[] r1 = r0.f202714G
            r7 = 2
            r1[r3] = r7
        L_0x0b54:
            r1 = 1
            goto L_0x0b57
        L_0x0b56:
            r1 = 0
        L_0x0b57:
            boolean r7 = r0.f202710C
            if (r7 != 0) goto L_0x0c40
            if (r1 != 0) goto L_0x0c40
            int[] r1 = r0.f202715H
            r1[r4] = r6
            com.tencent.mm.storage.n3 r1 = fd0.C75743h.wx0()
            java.lang.String r7 = r0.f202778x
            com.tencent.mm.storage.m3 r1 = r1.mo101190bD(r7)
            if (r1 != 0) goto L_0x0b6f
            goto L_0x0c40
        L_0x0b6f:
            ae3.b r1 = ae3.C67030b.m79187b(r0, r1)
            java.lang.String r7 = r1.f192525b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0c40
            java.lang.String r7 = r1.f192525b
            r11 = 2131830284(0x7f11260c, float:1.929356E38)
            java.lang.String r11 = r0.getString(r11)
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0b8c
            goto L_0x0c40
        L_0x0b8c:
            r7 = 2131835636(0x7f113af4, float:1.9304416E38)
            java.lang.String r11 = r0.getString(r7)
            java.lang.String r7 = r0.getString(r7)
            java.lang.String r12 = "%s"
            int r7 = r7.indexOf(r12)
            r11.substring(r4, r7)
            java.lang.String r7 = r1.f192525b
            android.view.View r15 = r0.f202756i
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r14.mo10233c(r5)
            java.lang.Object[] r12 = r14.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r5 = "initVerifyNameArea"
            java.lang.String r16 = "()Z"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r15
            r3 = r14
            r14 = r5
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI"
            java.lang.String r13 = "initVerifyNameArea"
            java.lang.String r14 = "()Z"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r11 = r5
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.TextView r3 = r0.f202758j
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r1 = r1.f192525b
            r5[r4] = r1
            java.lang.String r1 = r0.getString(r10, r5)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r5 = r0.f202758j
            float r5 = r5.getTextSize()
            android.text.SpannableString r1 = r2.yp0(r0, r1, r5)
            r3.setText(r1)
            de3.u r1 = new de3.u
            java.lang.String r2 = r0.getString(r9)
            r1.<init>((java.lang.String) r2)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$p
            r2.<init>(r7)
            int r3 = r1.length()
            r5 = 17
            r1.mo105705b(r2, r4, r3, r5)
            android.widget.TextView r2 = r0.f202758j
            r2.append(r8)
            android.widget.TextView r2 = r0.f202758j
            r2.append(r1)
            android.widget.TextView r1 = r0.f202758j
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            int[] r1 = r0.f202714G
            r2 = 3
            r1[r2] = r2
            r0.f202711D = r6
        L_0x0c40:
            android.widget.EditText r1 = r0.f202754h
            java.lang.CharSequence r1 = r1.getHint()
            if (r1 == 0) goto L_0x0c64
            android.widget.EditText r1 = r0.f202754h
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0c64
            android.widget.EditText r1 = r0.f202754h
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            r0.f202726R0 = r1
        L_0x0c64:
            android.widget.EditText r1 = r0.f202754h
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0c88
            android.widget.EditText r1 = r0.f202754h
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0c88
            android.widget.EditText r1 = r0.f202754h
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.f202726R0 = r1
        L_0x0c88:
            r1 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r1 = r0.getString(r1)
            boolean r2 = r0.f202710C
            r3 = 2131821539(0x7f1103e3, float:1.9275824E38)
            if (r2 != 0) goto L_0x0c9a
            java.lang.String r1 = r0.getString(r3)
        L_0x0c9a:
            boolean r2 = r0.f202729T
            if (r2 == 0) goto L_0x0ca2
            java.lang.String r1 = r0.getString(r3)
        L_0x0ca2:
            r2 = 3
            java.lang.String r2 = tc2.C77890f.m94019a(r2)
            r3 = 2131304902(0x7f0921c6, float:1.822796E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r0.f202781y0 = r3
            r3.setText(r1)
            android.widget.Button r1 = r0.f202781y0
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$k
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r0.f202781y0
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$l r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$l
            r3.<init>(r2)
            r1.setOnTouchListener(r3)
            android.widget.Button r1 = r0.f202781y0
            android.content.res.Resources r2 = r35.getResources()
            r3 = 2131100345(0x7f0602b9, float:1.7813069E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.Button r1 = r0.f202781y0
            r2 = 2131231392(0x7f0802a0, float:1.8078864E38)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setBackground(r2)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$m r1 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$m
            r1.<init>()
            r0.setBackBtn(r1)
            com.tencent.mm.ui.tools.KeyboardHeightProvider r1 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r1.<init>(r0)
            r0.f202739Y = r1
            r1.f220015b = r0
            boolean r1 = r0.f202729T
            if (r1 == 0) goto L_0x0d00
            r1 = 2131834193(0x7f113551, float:1.930149E38)
            r0.setMMTitle((int) r1)
        L_0x0d00:
            r35.mo96672V7()
            r35.mo96669S7()
            r35.mo96668R7()
            android.widget.EditText r1 = r0.f202754h
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r2 = 32
            r1.f225611e = r4
            r1.f225610d = r2
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$n r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI$n
            r2.<init>(r0)
            r1.mo107499d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.initView():void");
    }

    public boolean isHideVKBWhenScroll() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null && intent.hasExtra("Contact_get_desc_report_data")) {
                this.f202716I = intent.getIntArrayExtra("Contact_get_desc_report_data");
            }
            mo96670T7();
        } else if ((i2 == -1 || intent == null) && i == 600) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>();
            }
            List<String> d = ((C67001a) C28250a.m38138a()).mo90966d();
            if (mo96661K7(stringArrayListExtra, this.f202737X) || mo96661K7(d, this.f202735W)) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (d == null) {
                    d = new ArrayList<>();
                }
                if (this.f202735W == null) {
                    this.f202735W = new ArrayList();
                }
                for (String next : d) {
                    if (!this.f202735W.contains(next) && !this.f202741Z.contains(next)) {
                        this.f202741Z.add(next);
                    }
                }
                this.f202735W = d;
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    if (this.f202735W.contains(next2)) {
                        this.f202735W.remove(next2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f202735W);
                this.f202735W.clear();
                this.f202735W.addAll(stringArrayListExtra);
                this.f202735W.addAll(arrayList);
                this.f202737X.clear();
                this.f202737X.addAll(stringArrayListExtra);
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                if (stringArrayListExtra2 != null) {
                    this.f202740Y0.addAll(stringArrayListExtra2);
                }
                ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.f202742Z0.addAll(stringArrayListExtra3);
                }
                ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.f202744b1.addAll(stringArrayListExtra4);
                }
                ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.f202743a1.addAll(stringArrayListExtra5);
                }
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.f202737X, this.f202735W);
                mo96671U7(this.f202737X);
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
        C115669n.INSTANCE.mo160131h(14036, Integer.valueOf(this.f202714G[0]), Integer.valueOf(this.f202714G[1]), Integer.valueOf(this.f202714G[2]), Integer.valueOf(this.f202714G[3]), Integer.valueOf(this.f202714G[4]), Integer.valueOf(this.f202714G[5]), Integer.valueOf(this.f202714G[6]), Integer.valueOf(this.f202714G[7]), this.f202778x);
        super.onDestroy();
        removeAllOptionMenu();
        C118418g.INSTANCE.mo175826kl("ie_ver_usr");
        KeyboardHeightProvider keyboardHeightProvider = this.f202739Y;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f202714G[0] = 1;
        finish();
        mo96667Q7(false);
        return true;
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202739Y;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202739Y;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C7660a aVar;
        List<String> list;
        int i3;
        int i4 = i;
        int i5 = i2;
        C117747y yVar2 = yVar;
        Class cls = C75700k0.class;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd: errType = ");
        sb.append(i4);
        sb.append(" errCode = ");
        sb.append(i5);
        sb.append(" errMsg = ");
        String str3 = str;
        sb.append(str3);
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", sb.toString());
        try {
            mo96663M7();
            if (yVar2 instanceof C44590b1) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd: getopCode: %s.", Integer.valueOf(((C44590b1) yVar2).f120898g));
                if (!(i4 == 0 && i5 == 0) && ((C44590b1) yVar2).f120898g == 1) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd:is MM_VERIFYUSER_ADDCONTACT return");
                    return;
                } else if (!this.f202727S && C78543a.m94880h((C44590b1) yVar2)) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd:is needShowErrorDialog return");
                    Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    return;
                }
            } else {
                Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd: is no NetSceneVerifyUser.");
            }
            mo96662L7();
            if (!Util.isNullOrNil(str)) {
                aVar = C7660a.m7782a(str);
                if (aVar == null || (str2 = aVar.f26001b) == null) {
                    str2 = str3;
                }
            } else {
                str2 = "";
                aVar = null;
            }
            Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "sendrequest_second");
            if (i4 == 0 && i5 == 0) {
                C76879j.m92726T(this, getString(C0966R.string.ilw));
                C68397a.m80737c(this.f202778x, 1);
                RecoverAccountFriendEvent recoverAccountFriendEvent = new RecoverAccountFriendEvent();
                RecoverAccountFriendEvent.C67773a aVar3 = recoverAccountFriendEvent.f193880d;
                aVar3.f193881a = this.f202778x;
                aVar3.f193882b = 1;
                recoverAccountFriendEvent.publish();
                int i6 = 2;
                if (this.f202709B == 17 && (yVar2 instanceof C44590b1)) {
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
                if (this.f202712E) {
                    String N7 = mo96664N7();
                    if (!Util.isNullOrNil(N7)) {
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "set temp remark of %s", this.f202778x);
                        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202778x);
                        z1Var.mo62860K2(N7);
                        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202778x);
                        Lo.field_encryptUsername = this.f202778x;
                        Lo.field_conRemark = N7;
                        ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                        C97625j3.m125812b().mo105907v().mo69668Q3(z1Var);
                        this.f202714G[2] = 1;
                        if (!Util.isNullOrNil(this.f202782z) && !N7.equals(this.f202782z)) {
                            this.f202714G[5] = 1;
                        }
                    } else if (!Util.isNullOrNil(this.f202782z)) {
                        this.f202714G[2] = 0;
                    } else {
                        this.f202714G[2] = 2;
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
                        mo96660J7(list);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(this.f202778x);
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar4 = snsPermissionNotifyEvent.f107766d;
                        aVar4.f107768b = true;
                        aVar4.f107767a = false;
                        aVar4.f107769c = this.f202778x;
                        snsPermissionNotifyEvent.publish();
                        if (this.f202763n.f220433y) {
                            C45628s0.m50783k0(z1Var2);
                        } else {
                            C45628s0.m50799s0(z1Var2);
                        }
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar5 = snsPermissionNotifyEvent2.f107766d;
                        aVar5.f107768b = false;
                        aVar5.f107767a = true;
                        String str4 = this.f202778x;
                        aVar5.f107769c = str4;
                        snsPermissionNotifyEvent2.f107766d.f107770d = ((C11766m0) C99019x.m128974f()).mo11654bD(str4, 5);
                        String str5 = this.f202778x;
                        if (this.f202765o.f220433y) {
                            i6 = 1;
                        }
                        mo96674X7(str5, i6, 5);
                        snsPermissionNotifyEvent2.publish();
                        if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false)) {
                            Intent intent = new Intent();
                            intent.putExtra("friend_message_transfer_username", this.f202778x);
                            intent.setAction("friend_message_accept_" + this.f202778x);
                            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2503er);
                            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2498em);
                            C88144b.m109791i(this, "subapp", ".ui.friend.FMessageTransferUI", intent, (Bundle) null);
                        }
                    }
                }
                getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
                C42599h.xx0(getIntent(), 1, 1, this.f202778x);
                setResult(-1, getIntent());
                if (this.f202731U) {
                    C70142g.m82629a(this.f202778x, mo96665O7(), 1, this.f202709B);
                }
                finish();
                mo96667Q7(true);
                ((C119157j) C119157j.f356862d).mo183875f(new C70291r2(this, 1));
                if ((this.f202753g1 & 8) == 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
                }
            } else if (i4 == 4 && i5 == -302) {
                Log.m105929w("MicroMsg.SayHiWithSnsPermissionUI", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", Integer.valueOf(yVar.getType() == 30 ? ((C44590b1) yVar2).f120898g : 0));
                C76879j.m92707A(this, getString(C0966R.string.f360313bt1), getString(C0966R.string.a3h), getString(C0966R.string.f7566ju), getString(C0966R.string.f7926wf), new C4953b(), (DialogInterface.OnClickListener) null);
            } else if (i4 == 4 && i5 == -24) {
                if (!C7123c.f25086a.mo8286a(getContext(), aVar) && str2 != null) {
                    Toast.makeText(this, str2, 1).show();
                }
            } else if (i4 == 4 && ((i5 == -2 || i5 == -101) && !Util.isNullOrNil(str2))) {
                C76879j.m92754y(this, str2, "", getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            } else if (this.f202710C && (i5 == -24 || i5 == -34)) {
                Toast.makeText(this, C0966R.string.exz, 0).show();
            } else if (i4 == 4 && i5 == -3400 && this.f202720M) {
                this.f202721N = true;
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, 1);
                if (!Util.isNullOrNil(str2)) {
                    ((TextView) findViewById(C0966R.C0970id.f359349kf2)).setText(str2);
                }
                mo96673W7();
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(str2);
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C4954c());
                qVar.mo107603o();
            } else {
                Toast.makeText(this, C0966R.string.ilv, 0).show();
                Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] sendrequest_send_fail");
            }
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI", "exception in onSceneEnd : " + e.getMessage());
        } finally {
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void onStop() {
        super.onStop();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f202739Y;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
