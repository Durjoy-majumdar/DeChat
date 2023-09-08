package com.tencent.p014mm.plugin.profile.p088ui;

import a22.C67001a;
import ae3.C67030b;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import android.view.animation.AccelerateDecelerateInterpolator;
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
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
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
import d51.C7171c;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import ff2.C8021d;
import g62.C32330n;
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
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import p011cm.C39989b;
import p256vw.C15014e;
import p256vw.C15015f;
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
import wd3.C78543a;
import wd3.C78553c1;
import xc0.C78795g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 */
public class SayHiWithSnsPermissionUI3 extends MMActivity implements C11385n, C7020t0 {

    /* renamed from: l1 */
    public static final /* synthetic */ int f202888l1 = 0;

    /* renamed from: A */
    public boolean f202889A = false;

    /* renamed from: B */
    public boolean f202890B;

    /* renamed from: C */
    public boolean f202891C;

    /* renamed from: D */
    public int[] f202892D = new int[8];

    /* renamed from: E */
    public int[] f202893E = new int[6];

    /* renamed from: F */
    public int[] f202894F = new int[3];

    /* renamed from: G */
    public ImageView f202895G;

    /* renamed from: H */
    public TextView f202896H;

    /* renamed from: I */
    public boolean f202897I = false;

    /* renamed from: J */
    public boolean f202898J = false;

    /* renamed from: K */
    public boolean f202899K = false;

    /* renamed from: L */
    public boolean f202900L = false;

    /* renamed from: M */
    public boolean f202901M = false;

    /* renamed from: N */
    public View f202902N;

    /* renamed from: P */
    public List<String> f202903P = new ArrayList();

    /* renamed from: Q */
    public ArrayList<String> f202904Q = new ArrayList<>();

    /* renamed from: Q0 */
    public boolean f202905Q0;

    /* renamed from: R */
    public KeyboardHeightProvider f202906R;

    /* renamed from: R0 */
    public int f202907R0;

    /* renamed from: S */
    public ArrayList<String> f202908S = new ArrayList<>();

    /* renamed from: S0 */
    public int f202909S0;

    /* renamed from: T */
    public LinearLayout f202910T;

    /* renamed from: T0 */
    public List<String> f202911T0 = new ArrayList();

    /* renamed from: U */
    public TextView f202912U;

    /* renamed from: U0 */
    public HashSet<String> f202913U0 = new HashSet<>();

    /* renamed from: V */
    public Button f202914V;

    /* renamed from: V0 */
    public HashSet<String> f202915V0 = new HashSet<>();

    /* renamed from: W */
    public Boolean f202916W;

    /* renamed from: W0 */
    public HashSet<String> f202917W0 = new HashSet<>();

    /* renamed from: X */
    public boolean f202918X = false;

    /* renamed from: X0 */
    public HashSet<String> f202919X0 = new HashSet<>();

    /* renamed from: Y */
    public boolean f202920Y = false;

    /* renamed from: Y0 */
    public CharSequence f202921Y0 = null;

    /* renamed from: Z */
    public boolean f202922Z = false;

    /* renamed from: Z0 */
    public final boolean[] f202923Z0 = {true};

    /* renamed from: a1 */
    public final boolean[] f202924a1 = {false};

    /* renamed from: b1 */
    public long f202925b1 = System.currentTimeMillis();

    /* renamed from: c1 */
    public int f202926c1 = 0;

    /* renamed from: d */
    public EditText f202927d;

    /* renamed from: d1 */
    public int f202928d1 = 0;

    /* renamed from: e */
    public String f202929e;

    /* renamed from: e1 */
    public int f202930e1 = 0;

    /* renamed from: f */
    public TextView f202931f;

    /* renamed from: f1 */
    public C77398g f202932f1 = null;

    /* renamed from: g */
    public TextView f202933g;

    /* renamed from: g1 */
    public View f202934g1;

    /* renamed from: h */
    public EditText f202935h;

    /* renamed from: h1 */
    public EditText f202936h1;

    /* renamed from: i */
    public View f202937i;

    /* renamed from: i1 */
    public TextView f202938i1;

    /* renamed from: j */
    public TextView f202939j;

    /* renamed from: j1 */
    public String f202940j1;

    /* renamed from: k1 */
    public View f202941k1;

    /* renamed from: n */
    public MMSwitchBtn f202942n;

    /* renamed from: o */
    public MMSwitchBtn f202943o;

    /* renamed from: p */
    public ImageView f202944p;

    /* renamed from: p0 */
    public String f202945p0;

    /* renamed from: q */
    public ImageView f202946q;

    /* renamed from: r */
    public TextView f202947r;

    /* renamed from: s */
    public ProgressDialog f202948s = null;

    /* renamed from: t */
    public String f202949t;

    /* renamed from: u */
    public String f202950u;

    /* renamed from: v */
    public String f202951v;

    /* renamed from: w */
    public String f202952w;

    /* renamed from: x */
    public String f202953x;

    /* renamed from: x0 */
    public String f202954x0;

    /* renamed from: y */
    public int f202955y;

    /* renamed from: y0 */
    public int f202956y0 = 0;

    /* renamed from: z */
    public boolean f202957z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$d */
    public class C4972d implements DialogInterface.OnClickListener {
        public C4972d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SayHiWithSnsPermissionUI3.this.mo96720Q7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$e */
    public class C4973e implements C47883u {
        public C4973e() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            SayHiWithSnsPermissionUI3.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(SayHiWithSnsPermissionUI3.this));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(SayHiWithSnsPermissionUI3.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$f */
    public class C4974f implements View.OnClickListener {
        public C4974f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$j */
    public class C4975j implements View.OnClickListener {
        public C4975j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = SayHiWithSnsPermissionUI3.this.f202927d.getText().toString();
            SayHiWithSnsPermissionUI3.m82799H7(SayHiWithSnsPermissionUI3.this, 1, Util.isNullOrNil(obj) ^ true ? 1 : 0);
            SayHiWithSnsPermissionUI3.m82800I7(SayHiWithSnsPermissionUI3.this, obj);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$k */
    public class C4976k implements View.OnFocusChangeListener {
        public C4976k() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                if (!Util.isNullOrNil(SayHiWithSnsPermissionUI3.this.f202935h.getHint()) && Util.isNullOrNil((CharSequence) SayHiWithSnsPermissionUI3.this.f202935h.getText())) {
                    EditText editText = SayHiWithSnsPermissionUI3.this.f202935h;
                    editText.setText(editText.getHint());
                    SayHiWithSnsPermissionUI3.this.f202935h.setHint((CharSequence) null);
                }
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                sayHiWithSnsPermissionUI3.f202922Z = true;
                EditText editText2 = sayHiWithSnsPermissionUI3.f202935h;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o */
    public class C4977o extends ClickableSpan {

        /* renamed from: d */
        public String f20258d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o$a */
        public class C4978a implements C15014e {

            /* renamed from: a */
            public final /* synthetic */ CharSequence f20260a;

            public C4978a(CharSequence charSequence) {
                this.f20260a = charSequence;
            }

            /* renamed from: a */
            public void mo5899a(String str) {
                if (!Util.isNullOrNil(str)) {
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI3.f202893E[3] = 1;
                    sayHiWithSnsPermissionUI3.getClass();
                }
                EditText editText = SayHiWithSnsPermissionUI3.this.f202935h;
                editText.setText(this.f20260a + str);
                SayHiWithSnsPermissionUI3.this.f202935h.clearFocus();
                View view = SayHiWithSnsPermissionUI3.this.f202937i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C4977o(String str) {
            this.f20258d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            sayHiWithSnsPermissionUI3.f202893E[1] = 1;
            if (sayHiWithSnsPermissionUI3.f202889A) {
                Editable text = sayHiWithSnsPermissionUI3.f202935h.getText();
                int e = C45078p0.m49926e(text.toString(), C45078p0.C45079a.MODE_CHINESE_AS_2);
                if (e > 0) {
                    SayHiWithSnsPermissionUI3.this.f202893E[2] = 1;
                }
                ((C15015f) C86312j.m106911c(C15015f.class)).mo13690bo(SayHiWithSnsPermissionUI3.this.getContext(), this.f20258d, e, 32, new C4978a(text));
            } else {
                String nullAsNil = Util.nullAsNil(C77382c.m93287e(this.f20258d, 32));
                if (!(nullAsNil == null || this.f20258d == null || nullAsNil.length() >= this.f20258d.length())) {
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                    Toast.makeText(sayHiWithSnsPermissionUI32, sayHiWithSnsPermissionUI32.getString(C0966R.string.hza), 0).show();
                }
                EditText editText = SayHiWithSnsPermissionUI3.this.f202935h;
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = SayHiWithSnsPermissionUI3.this;
                editText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(sayHiWithSnsPermissionUI33, nullAsNil, sayHiWithSnsPermissionUI33.f202935h.getTextSize()));
                SayHiWithSnsPermissionUI3.this.f202935h.setSelection(nullAsNil.length());
                View view2 = SayHiWithSnsPermissionUI3.this.f202937i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SayHiWithSnsPermissionUI3.this.f202892D[4] = 1;
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(SayHiWithSnsPermissionUI3.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$p */
    public class C4979p extends ClickableSpan {

        /* renamed from: d */
        public String f20262d;

        public C4979p(String str) {
            this.f20262d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            if (sayHiWithSnsPermissionUI3.f202891C) {
                SayHiWithSnsPermissionUI3.m82799H7(sayHiWithSnsPermissionUI3, 2, 0);
                SayHiWithSnsPermissionUI3.this.f202900L = true;
                String nullAsNil = Util.nullAsNil(C77382c.m93287e(this.f20262d, 100));
                EditText editText = SayHiWithSnsPermissionUI3.this.f202927d;
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                editText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(sayHiWithSnsPermissionUI32, nullAsNil, sayHiWithSnsPermissionUI32.f202927d.getTextSize()));
                SayHiWithSnsPermissionUI3.this.f202927d.setSelection(nullAsNil.length());
                SayHiWithSnsPermissionUI3.this.f202933g.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(SayHiWithSnsPermissionUI3.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$a */
    public class C70221a implements C77382c.C77383a {
        public C70221a(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
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

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$b */
    public class C70222b implements View.OnClickListener {
        public C70222b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            Boolean bool = Boolean.FALSE;
            sayHiWithSnsPermissionUI3.f202916W = bool;
            sayHiWithSnsPermissionUI3.mo96725V7(bool.booleanValue());
            SayHiWithSnsPermissionUI3.this.mo96726W7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$c */
    public class C70223c implements View.OnClickListener {
        public C70223c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            Boolean bool = Boolean.TRUE;
            sayHiWithSnsPermissionUI3.f202916W = bool;
            sayHiWithSnsPermissionUI3.mo96725V7(bool.booleanValue());
            SayHiWithSnsPermissionUI3.this.mo96726W7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$g */
    public class C70224g implements View.OnClickListener {
        public C70224g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            int i = SayHiWithSnsPermissionUI3.f202888l1;
            if (!sayHiWithSnsPermissionUI3.mo96722S7()) {
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                Boolean bool = Boolean.FALSE;
                sayHiWithSnsPermissionUI32.f202916W = bool;
                sayHiWithSnsPermissionUI32.mo96725V7(bool.booleanValue());
                SayHiWithSnsPermissionUI3.this.mo96714K7();
            }
            SayHiWithSnsPermissionUI3.this.mo96726W7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$h */
    public class C70225h implements View.OnClickListener {
        public C70225h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            int i = SayHiWithSnsPermissionUI3.f202888l1;
            if (!sayHiWithSnsPermissionUI3.mo96721R7()) {
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                Boolean bool = Boolean.TRUE;
                sayHiWithSnsPermissionUI32.f202916W = bool;
                sayHiWithSnsPermissionUI32.mo96725V7(bool.booleanValue());
                SayHiWithSnsPermissionUI3.this.mo96714K7();
            }
            SayHiWithSnsPermissionUI3.this.mo96726W7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$i */
    public class C70226i implements TextWatcher {
        public C70226i() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C118418g gVar = C118418g.INSTANCE;
            boolean[] zArr = SayHiWithSnsPermissionUI3.this.f202923Z0;
            if (zArr[0]) {
                zArr[0] = false;
                gVar.mo175830qv("ie_ver_usr");
            }
            gVar.mo175802VZ("ie_ver_usr");
            if (!charSequence.equals(SayHiWithSnsPermissionUI3.this.f202929e)) {
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                if (!sayHiWithSnsPermissionUI3.f202900L) {
                    sayHiWithSnsPermissionUI3.f202929e = charSequence.toString();
                    SayHiWithSnsPermissionUI3.this.f202931f.setVisibility(0);
                    SayHiWithSnsPermissionUI3.this.f202933g.setVisibility(8);
                }
            }
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
            if (sayHiWithSnsPermissionUI32.f202900L) {
                sayHiWithSnsPermissionUI32.f202900L = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l */
    public class C70227l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f202963d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$a */
        public class C70228a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46498v f202965d;

            public C70228a(C70227l lVar, C46498v vVar) {
                this.f202965d = vVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202965d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$b */
        public class C70229b implements C39989b.C0706c {

            /* renamed from: a */
            public final /* synthetic */ String f202966a;

            /* renamed from: b */
            public final /* synthetic */ String f202967b;

            /* renamed from: c */
            public final /* synthetic */ String f202968c;

            /* renamed from: d */
            public final /* synthetic */ Map f202969d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList f202970e;

            /* renamed from: f */
            public final /* synthetic */ LinkedList f202971f;

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$b$a */
            public class C70230a implements C39989b.C0706c {
                public C70230a(C70229b bVar) {
                }

                /* renamed from: a */
                public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                    return true;
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$b$b */
            public class C70231b implements C78553c1.C78560f {
                public C70231b() {
                }

                /* renamed from: a */
                public void mo62593a() {
                    SayHiWithSnsPermissionUI3.this.f202930e1++;
                }

                /* renamed from: b */
                public void mo62594b() {
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                    int i = SayHiWithSnsPermissionUI3.f202888l1;
                    sayHiWithSnsPermissionUI3.mo96716M7();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$b$c */
            public class C70232c implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78543a f202974d;

                public C70232c(C70229b bVar, C78543a aVar) {
                    this.f202974d = aVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202974d.getClass();
                }
            }

            /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$b$d */
            public class C70233d implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C78553c1 f202975d;

                public C70233d(C70229b bVar, C78553c1 c1Var) {
                    this.f202975d = c1Var;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    this.f202975d.mo108525a();
                }
            }

            public C70229b(String str, String str2, String str3, Map map, LinkedList linkedList, LinkedList linkedList2) {
                this.f202966a = str;
                this.f202967b = str2;
                this.f202968c = str3;
                this.f202969d = map;
                this.f202970e = linkedList;
                this.f202971f = linkedList2;
            }

            /* renamed from: a */
            public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                if (i == -4000) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
                    C78543a aVar = new C78543a(SayHiWithSnsPermissionUI3.this, (C39989b.C0705b) null);
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                    aVar.f230031E = sayHiWithSnsPermissionUI3.f202918X ? "" : this.f202966a;
                    String str5 = this.f202967b;
                    String str6 = this.f202968c;
                    aVar.f230048t = str5;
                    aVar.f230049u = str6;
                    aVar.f230032F = this.f202969d;
                    aVar.f230047s = sayHiWithSnsPermissionUI3.f202949t;
                    aVar.f230036e = new C70230a(this);
                    aVar.f230051w = false;
                    aVar.f230030D = new C70231b();
                    aVar.f230034H = str4;
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI3.this.f202950u);
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                    aVar.mo108507j(sayHiWithSnsPermissionUI32, z1Var, sayHiWithSnsPermissionUI32.f202950u, this.f202970e);
                    SayHiWithSnsPermissionUI3.this.mo96717N7();
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI33.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI33.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.ilx), true, true, new C70232c(this, aVar));
                } else {
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI34 = SayHiWithSnsPermissionUI3.this;
                    if (sayHiWithSnsPermissionUI34.f202918X) {
                        sayHiWithSnsPermissionUI34.getClass();
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(sayHiWithSnsPermissionUI34.f202950u);
                        if (z1Var2 != null) {
                            sayHiWithSnsPermissionUI34.f202940j1 = sayHiWithSnsPermissionUI34.getResources().getString(C0966R.string.bsz, new Object[]{z1Var2.getNickname()});
                        } else {
                            sayHiWithSnsPermissionUI34.f202940j1 = sayHiWithSnsPermissionUI34.getResources().getString(C0966R.string.f360312bt0);
                        }
                        sayHiWithSnsPermissionUI34.f202934g1 = View.inflate(sayHiWithSnsPermissionUI34, C0966R.C0971layout.bwo, (ViewGroup) null);
                        Object[] objArr = new Object[3];
                        objArr[0] = Boolean.valueOf(sayHiWithSnsPermissionUI34.f202940j1 == null);
                        String str7 = sayHiWithSnsPermissionUI34.f202940j1;
                        objArr[1] = Integer.valueOf(str7 == null ? 0 : str7.length());
                        objArr[2] = sayHiWithSnsPermissionUI34.f202940j1;
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
                        if (!Util.isNullOrNil(sayHiWithSnsPermissionUI34.f202940j1)) {
                            ((TextView) sayHiWithSnsPermissionUI34.f202934g1.findViewById(C0966R.C0970id.jc8)).setText(sayHiWithSnsPermissionUI34.f202940j1);
                        }
                        sayHiWithSnsPermissionUI34.f202941k1 = sayHiWithSnsPermissionUI34.f202934g1.findViewById(C0966R.C0970id.cd8);
                        sayHiWithSnsPermissionUI34.f202936h1 = (EditText) sayHiWithSnsPermissionUI34.f202934g1.findViewById(C0966R.C0970id.jc7);
                        TextView textView = (TextView) sayHiWithSnsPermissionUI34.f202934g1.findViewById(C0966R.C0970id.lr4);
                        sayHiWithSnsPermissionUI34.f202938i1 = textView;
                        textView.setVisibility(0);
                        sayHiWithSnsPermissionUI34.f202936h1.setText((CharSequence) null);
                        sayHiWithSnsPermissionUI34.f202938i1.setText(String.valueOf(50));
                        sayHiWithSnsPermissionUI34.f202936h1.setVisibility(8);
                        View view = sayHiWithSnsPermissionUI34.f202941k1;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C77398g z = C76879j.m92755z(sayHiWithSnsPermissionUI34, "", (String) null, sayHiWithSnsPermissionUI34.getString(C0966R.string.bsx), sayHiWithSnsPermissionUI34.f202934g1, new C70260c3(sayHiWithSnsPermissionUI34), new C70264d3(sayHiWithSnsPermissionUI34));
                        sayHiWithSnsPermissionUI34.f202932f1 = z;
                        if (z == null) {
                            sayHiWithSnsPermissionUI34.onStop();
                        }
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "dealAddContactError, resend request ver.");
                        String stringExtra = SayHiWithSnsPermissionUI3.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI3.this.getIntent().getStringExtra("source_from_nick_name");
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI35 = SayHiWithSnsPermissionUI3.this;
                        C78553c1 c1Var = new C78553c1(sayHiWithSnsPermissionUI35, (C39989b.C39992e) null);
                        c1Var.f230112q = this.f202966a;
                        c1Var.f230114s = stringExtra;
                        c1Var.f230115t = stringExtra2;
                        c1Var.f230113r = this.f202969d;
                        c1Var.f230116u = sayHiWithSnsPermissionUI35.f202949t;
                        c1Var.mo108533i(this.f202971f, this.f202970e);
                        SayHiWithSnsPermissionUI3.this.mo96717N7();
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI36 = SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI36.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI36.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.ilx), true, true, new C70233d(this, c1Var));
                    }
                }
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$c */
        public class C70234c implements C78553c1.C78560f {
            public C70234c() {
            }

            /* renamed from: a */
            public void mo62593a() {
                SayHiWithSnsPermissionUI3.this.f202930e1++;
            }

            /* renamed from: b */
            public void mo62594b() {
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                int i = SayHiWithSnsPermissionUI3.f202888l1;
                sayHiWithSnsPermissionUI3.mo96716M7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$d */
        public class C70235d implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C78543a f202977d;

            public C70235d(C70227l lVar, C78543a aVar) {
                this.f202977d = aVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f202977d.getClass();
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$e */
        public class C70236e implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46500x f202978d;

            public C70236e(C70227l lVar, C46500x xVar) {
                this.f202978d = xVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202978d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l$f */
        public class C70237f implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C44590b1 f202979d;

            public C70237f(C70227l lVar, C44590b1 b1Var) {
                this.f202979d = b1Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f202979d);
            }
        }

        public C70227l(String str) {
            this.f202963d = str;
        }

        public void onClick(View view) {
            boolean z;
            boolean z2;
            C118418g gVar = C118418g.INSTANCE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProgressDialog progressDialog = SayHiWithSnsPermissionUI3.this.f202948s;
            if (progressDialog == null || !progressDialog.isShowing()) {
                boolean[] zArr = SayHiWithSnsPermissionUI3.this.f202924a1;
                if (zArr[0]) {
                    zArr[0] = false;
                } else {
                    gVar.Ud0("ce_ver_usr", "<VerifyUsr>", this.f202963d);
                    gVar.mo175827n9("ce_ver_usr", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                    gVar.ec0("ce_ver_usr");
                }
                if (!SayHiWithSnsPermissionUI3.this.mo96722S7() && !SayHiWithSnsPermissionUI3.this.mo96721R7()) {
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
                    if (sayHiWithSnsPermissionUI3.f202897I) {
                        TextView textView = (TextView) sayHiWithSnsPermissionUI3.findViewById(C0966R.C0970id.kf8);
                        textView.setText(C0966R.string.hnd);
                        int color = sayHiWithSnsPermissionUI3.getResources().getColor(C0966R.color.f3133gi);
                        int color2 = sayHiWithSnsPermissionUI3.getResources().getColor(C0966R.color.Brand_100);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ViewGroup) sayHiWithSnsPermissionUI3.findViewById(C0966R.C0970id.kf7), "translationX", new float[]{0.0f, -20.0f, 0.0f, 20.0f, 0.0f});
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        if (sayHiWithSnsPermissionUI3.f202928d1 == 0) {
                            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)});
                            ofObject.addUpdateListener(new C4981a3(sayHiWithSnsPermissionUI3, textView));
                            ofObject.addListener(new C70254b3(sayHiWithSnsPermissionUI3, (Runnable) null));
                            animatorSet.play(ofObject).with(ofFloat);
                        } else {
                            textView.setTextColor(color2);
                            animatorSet.play(ofFloat);
                        }
                        animatorSet.setDuration((long) 300);
                        animatorSet.start();
                        C74804o4.m89546a();
                        SayHiWithSnsPermissionUI3.this.f202928d1++;
                        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                gVar.mo175799SP(this.f202963d, 3);
                SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
                if (sayHiWithSnsPermissionUI32.f202957z) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(SayHiWithSnsPermissionUI3.this.f202950u);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(Integer.valueOf(SayHiWithSnsPermissionUI3.this.f202955y));
                    String P7 = SayHiWithSnsPermissionUI3.this.mo96719P7();
                    HashMap hashMap = new HashMap();
                    if (!SayHiWithSnsPermissionUI3.this.mo96722S7()) {
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = SayHiWithSnsPermissionUI3.this;
                        z2 = sayHiWithSnsPermissionUI33.f202942n.f220433y;
                        if (sayHiWithSnsPermissionUI33.f202943o.f220433y) {
                            z2 |= true;
                        }
                    } else {
                        z2 = false;
                    }
                    if (SayHiWithSnsPermissionUI3.this.mo96722S7()) {
                        z2 |= true;
                    }
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI34 = SayHiWithSnsPermissionUI3.this;
                    sayHiWithSnsPermissionUI34.f202926c1 = z2 ? 1 : 0;
                    hashMap.put(sayHiWithSnsPermissionUI34.f202950u, Integer.valueOf(z2));
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI3", "select sns permission, %s", Integer.valueOf(z2));
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI35 = SayHiWithSnsPermissionUI3.this;
                    if (sayHiWithSnsPermissionUI35.f202901M) {
                        C46498v vVar = new C46498v(SayHiWithSnsPermissionUI3.this.f202950u, P7, sayHiWithSnsPermissionUI35.getIntent().getStringExtra("AntispamTicket"), z2);
                        C97625j3.m125815e().mo123460f(vVar);
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI36 = SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI36.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI36.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.ilx), true, true, new C70228a(this, vVar));
                    } else {
                        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
                        String stringExtra = SayHiWithSnsPermissionUI3.this.getIntent().getStringExtra("source_from_user_name");
                        String stringExtra2 = SayHiWithSnsPermissionUI3.this.getIntent().getStringExtra("source_from_nick_name");
                        C78543a aVar = new C78543a(SayHiWithSnsPermissionUI3.this, (C39989b.C0705b) null);
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI37 = SayHiWithSnsPermissionUI3.this;
                        aVar.f230031E = sayHiWithSnsPermissionUI37.f202918X ? "" : P7;
                        aVar.f230048t = stringExtra;
                        aVar.f230049u = stringExtra2;
                        aVar.f230032F = hashMap;
                        aVar.f230047s = sayHiWithSnsPermissionUI37.f202949t;
                        C70229b bVar = r0;
                        C78543a aVar2 = aVar;
                        C70229b bVar2 = new C70229b(P7, stringExtra, stringExtra2, hashMap, linkedList2, linkedList);
                        aVar2.f230036e = bVar;
                        aVar2.f230051w = false;
                        aVar2.f230030D = new C70234c();
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(SayHiWithSnsPermissionUI3.this.f202950u);
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI38 = SayHiWithSnsPermissionUI3.this;
                        aVar2.mo108507j(sayHiWithSnsPermissionUI38, z1Var, sayHiWithSnsPermissionUI38.f202950u, linkedList2);
                        SayHiWithSnsPermissionUI3.this.mo96717N7();
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI39 = SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI39.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI39.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.ilx), true, true, new C70235d(this, aVar2));
                    }
                } else if (sayHiWithSnsPermissionUI32.f202890B) {
                    String stringExtra3 = sayHiWithSnsPermissionUI32.getIntent().getStringExtra("Verify_ticket");
                    if (!SayHiWithSnsPermissionUI3.this.mo96722S7()) {
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI310 = SayHiWithSnsPermissionUI3.this;
                        boolean z3 = sayHiWithSnsPermissionUI310.f202942n.f220433y;
                        z = sayHiWithSnsPermissionUI310.f202943o.f220433y ? z3 | true : z3;
                    } else {
                        z = false;
                    }
                    if (SayHiWithSnsPermissionUI3.this.mo96722S7()) {
                        z |= true;
                    }
                    SayHiWithSnsPermissionUI3.this.f202926c1 = z ? 1 : 0;
                    Log.m105919d("MicroMsg.SayHiWithSnsPermissionUI3", "select sns permission, %s", Integer.valueOf(z));
                    SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI311 = SayHiWithSnsPermissionUI3.this;
                    if (sayHiWithSnsPermissionUI311.f202901M) {
                        C46500x xVar = new C46500x(sayHiWithSnsPermissionUI311.f202950u, stringExtra3, z);
                        C97625j3.m125815e().mo123460f(xVar);
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI312 = SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI312.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI312.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.blp), true, true, new C70236e(this, xVar));
                    } else {
                        C44590b1 b1Var = new C44590b1(3, sayHiWithSnsPermissionUI311.f202950u, stringExtra3, sayHiWithSnsPermissionUI311.f202955y, sayHiWithSnsPermissionUI311.f202949t, z ? 1 : 0);
                        C97625j3.m125815e().mo123460f(b1Var);
                        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI313 = SayHiWithSnsPermissionUI3.this;
                        sayHiWithSnsPermissionUI313.f202948s = C76879j.m92723Q(sayHiWithSnsPermissionUI313.getContext(), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.a3h), SayHiWithSnsPermissionUI3.this.getString(C0966R.string.blp), true, true, new C70237f(this, b1Var));
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$m */
    public class C70238m implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ String f202980d;

        public C70238m(String str) {
            this.f202980d = str;
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
                java.lang.String r2 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$8"
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
                com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 r11 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3.this
                boolean[] r11 = r11.f202924a1
                r11[r1] = r2
                java.lang.String r11 = r10.f202980d
                java.lang.String r12 = "<VerifyUsr>"
                r0.Ud0(r3, r12, r11)
            L_0x0048:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$8"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3.C70238m.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$n */
    public class C70239n implements MenuItem.OnMenuItemClickListener {
        public C70239n() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = SayHiWithSnsPermissionUI3.this;
            if (sayHiWithSnsPermissionUI3.f202890B) {
                sayHiWithSnsPermissionUI3.f202892D[1] = 1;
            }
            sayHiWithSnsPermissionUI3.finish();
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = SayHiWithSnsPermissionUI3.this;
            sayHiWithSnsPermissionUI32.getClass();
            ((C119157j) C119157j.f356862d).mo183884o(new C70310z2(sayHiWithSnsPermissionUI32, false));
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = SayHiWithSnsPermissionUI3.this;
            sayHiWithSnsPermissionUI33.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C70266e3(sayHiWithSnsPermissionUI33, 2));
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m82799H7(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, int i, int i2) {
        sayHiWithSnsPermissionUI3.getClass();
        SavedHelloMsgReportStruct savedHelloMsgReportStruct = new SavedHelloMsgReportStruct();
        savedHelloMsgReportStruct.f156815d = (long) i;
        savedHelloMsgReportStruct.f156816e = (long) i2;
        savedHelloMsgReportStruct.mo86054n();
        savedHelloMsgReportStruct.mo86056r();
    }

    /* renamed from: I7 */
    public static void m82800I7(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, String str) {
        TextView textView = sayHiWithSnsPermissionUI3.f202931f;
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
                C76912y0.m92768g(sayHiWithSnsPermissionUI3.getContext(), sayHiWithSnsPermissionUI3.getContext().getString(C0966R.string.f360096a30));
            } else {
                C76912y0.m92773l(sayHiWithSnsPermissionUI3.getContext(), sayHiWithSnsPermissionUI3.getContext().getString(C0966R.string.f8180sn));
            }
        }
    }

    /* renamed from: J7 */
    public final void mo96713J7(List<String> list) {
        C72985m3 bD = C75743h.wx0().mo101190bD(this.f202950u);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202950u);
        if (list != null && list.contains(this.f202950u)) {
            if (((int) z1Var.f108320R1) == 0) {
                z1Var = C67030b.m79190e(bD);
                z1Var.setUsername(this.f202950u);
                if (!C97625j3.m125812b().mo105907v().mo69667P3(z1Var)) {
                    Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI3", "canAddContact fail, insert fail");
                    return;
                }
            }
            C45628s0.m50775g0(z1Var);
            ((MMNotification) C97625j3.m125816f()).mo93209g();
            C75743h.vx0().mo101171bF(this.f202950u, 1);
            C67030b.m79194i(this.f202950u, this.f202955y);
        }
    }

    /* renamed from: K7 */
    public void mo96714K7() {
        this.f202914V.setTextColor(getResources().getColor(C0966R.color.f3257l0));
        this.f202914V.setBackground(getDrawable(C0966R.C0969drawable.f4653j6));
    }

    /* renamed from: L7 */
    public final boolean mo96715L7(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    /* renamed from: M7 */
    public final void mo96716M7() {
        if (this.f202957z) {
            String trim = this.f202927d.getText().toString().trim();
            if (Util.isNullOrNil(trim) || trim.equals(this.f202921Y0) || !Util.isNullOrNil(this.f202949t)) {
                C97625j3.m125812b().mo105906u().mo119676J(294913, "");
            } else {
                C97625j3.m125812b().mo105906u().mo119676J(294913, trim);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo96717N7() {
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "dismissTipDialog");
        ProgressDialog progressDialog = this.f202948s;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f202948s = null;
        }
    }

    /* renamed from: O7 */
    public final String mo96718O7() {
        String obj = this.f202935h.getText() != null ? this.f202935h.getText().toString() : "";
        return (Util.isNullOrNil(obj) || obj.length() <= 50) ? obj : obj.substring(0, 50);
    }

    /* renamed from: P7 */
    public final String mo96719P7() {
        String trim = this.f202927d.getText().toString().trim();
        return C45078p0.m49926e(this.f202927d.getText().toString(), C45078p0.C45079a.MODE_CHINESE_AS_2) <= 100 ? trim : trim.substring(0, 100);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "height:%s", Integer.valueOf(i));
    }

    /* renamed from: Q7 */
    public void mo96720Q7(boolean z) {
        Intent intent = new Intent(this, SayHiWithSnsPermissionUI3.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        int i = mo96722S7() ? 8 : 1;
        if (z) {
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", i);
        intent.putExtra("Contact_RemarkName", mo96718O7());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* renamed from: R7 */
    public final boolean mo96721R7() {
        return ((Boolean) this.f202946q.getTag()).booleanValue();
    }

    /* renamed from: S7 */
    public final boolean mo96722S7() {
        return ((Boolean) this.f202944p.getTag()).booleanValue();
    }

    /* renamed from: T7 */
    public final void mo96723T7() {
        Bitmap h = C78795g.m95196e().mo108710h(this.f202950u);
        ImageView imageView = this.f202895G;
        if (imageView != null) {
            if (h != null) {
                imageView.setVisibility(0);
                this.f202893E[5] = 1;
            } else {
                imageView.setVisibility(8);
            }
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202950u);
        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202950u);
        String nullAsNil = Lo != null ? Util.nullAsNil(Lo.field_conDescription) : "";
        if (Util.isNullOrNil(nullAsNil) && z1Var != null) {
            nullAsNil = z1Var.f149513S0;
        }
        if (this.f202896H != null) {
            this.f202893E[4] = C45078p0.m49928g(nullAsNil);
            this.f202896H.setText(nullAsNil);
        }
    }

    /* renamed from: U7 */
    public final void mo96724U7(List<String> list) {
        if (list == null || list.size() == 0) {
            this.f202912U.setText("");
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
        this.f202912U.setText(str);
    }

    /* renamed from: V7 */
    public final void mo96725V7(boolean z) {
        this.f202946q.setVisibility(0);
        this.f202944p.setVisibility(0);
        if (z) {
            C7171c.m7371a(this.f202946q, "checkbox_cell_on");
            C7171c.m7371a(this.f202944p, "checkbox_cell_off");
            this.f202946q.setTag(Boolean.TRUE);
            this.f202944p.setTag(Boolean.FALSE);
            return;
        }
        C7171c.m7371a(this.f202946q, "checkbox_cell_off");
        C7171c.m7371a(this.f202944p, "checkbox_cell_on");
        this.f202946q.setTag(Boolean.FALSE);
        this.f202944p.setTag(Boolean.TRUE);
    }

    /* renamed from: W7 */
    public final void mo96726W7() {
        ImageView imageView = this.f202946q;
        if (imageView != null) {
            imageView.setContentDescription(!mo96721R7() ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
        }
        ImageView imageView2 = this.f202944p;
        if (imageView2 != null) {
            imageView2.setContentDescription(!mo96722S7() ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
        }
    }

    /* renamed from: X7 */
    public final void mo96727X7() {
        int i;
        Resources resources;
        this.f202916W = Boolean.valueOf(!this.f202899K && !this.f202898J);
        this.f202944p.setVisibility(0);
        this.f202946q.setVisibility(0);
        mo96725V7(this.f202916W.booleanValue());
        ((View) this.f202944p.getParent()).setOnClickListener(new C70222b());
        ((View) this.f202946q.getParent()).setOnClickListener(this.f202898J ? null : new C70223c());
        View findViewById = findViewById(C0966R.C0970id.hhw);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = (TextView) findViewById(C0966R.C0970id.jv7);
        if (this.f202898J) {
            resources = getResources();
            i = C0966R.color.f3563xt;
        } else {
            resources = getResources();
            i = C0966R.color.a7f;
        }
        textView.setTextColor(resources.getColor(i));
        if (this.f202898J) {
            this.f202947r.setVisibility(0);
        }
        this.f202899K = false;
    }

    /* renamed from: Y7 */
    public final void mo96728Y7(String str, int i, long j) {
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
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_icon_order, 0) != 1) {
            z = true;
        }
        return z ? C0966R.C0971layout.bu4 : C0966R.C0971layout.bu5;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8021d.class);
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x094c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x094e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0951, code lost:
        if (r0.f202957z != false) goto L_0x0a35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0953, code lost:
        if (r1 != false) goto L_0x0a35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0955, code lost:
        r0.f202893E[0] = 1;
        r1 = fd0.C75743h.wx0().mo101190bD(r0.f202950u);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0964, code lost:
        if (r1 != null) goto L_0x0968;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0968, code lost:
        r1 = ae3.C67030b.m79187b(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0972, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1.f192525b) != false) goto L_0x0a35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0981, code lost:
        if (r1.f192525b.equals(getString(com.tencent.p014mm.C0966R.string.exr)) == false) goto L_0x0985;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0985, code lost:
        getString(com.tencent.p014mm.C0966R.string.ilr).substring(0, getString(com.tencent.p014mm.C0966R.string.ilr).indexOf("%s"));
        r6 = r1.f192525b;
        r7 = r0.f202937i;
        r10 = new k20.C9556a();
        r11 = k20.C60958c.f173611a;
        r10.mo10233c(0);
        r23 = r7;
        j20.C117292a.m165358d(r23, r10.mo10232b(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r7.setVisibility(((java.lang.Integer) r10.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r23, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initVerifyNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0.f202939j.setText(((p629ny.C76979h) di3.C86312j.m106911c(r2)).yp0(r0, com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(getString(com.tencent.p014mm.C0966R.string.bqu, new java.lang.Object[]{r1.f192525b})), r0.f202939j.getTextSize()));
        r1 = new de3.C75375u(getString(com.tencent.p014mm.C0966R.string.naf));
        r1.mo105705b(new com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3.C4977o(r0, r6), 0, r1.length(), 17);
        r0.f202939j.append(" ");
        r0.f202939j.append(r1);
        r0.f202939j.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        r0.f202892D[3] = 3;
        r0.f202889A = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r31 = this;
            r0 = r31
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            android.content.Intent r3 = r31.getIntent()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "sayhi_with_sns_perm_send_verify"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202957z = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "sayhi_with_sns_perm_add_remark"
            boolean r3 = r3.getBooleanExtra(r6, r4)
            r0.f202890B = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "Contact_User"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202950u = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "Contact_Scene"
            r7 = 9
            int r3 = r3.getIntExtra(r6, r7)
            r0.f202955y = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "room_name"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202949t = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "Contact_RemarkName"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202953x = r3
            r0.f202954x0 = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "Contact_Nick"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202952w = r3
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r6 = "Contact_RoomNickname"
            java.lang.String r3 = r3.getStringExtra(r6)
            r0.f202951v = r3
            r3 = 2131309436(0x7f09337c, float:1.8237156E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202937i = r3
            r3 = 2131309437(0x7f09337d, float:1.8237158E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202939j = r3
            java.lang.String r3 = r0.f202950u
            boolean r3 = com.tencent.p014mm.plugin.profile.C70142g.m82634f(r3)
            r6 = 1
            if (r3 == 0) goto L_0x009d
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r7 = "Contact_IsForceVerifyFriend"
            boolean r3 = r3.getBooleanExtra(r7, r4)
            if (r3 != 0) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            r0.f202918X = r3
            if (r3 != 0) goto L_0x00a8
            boolean r3 = r0.f202957z
            if (r3 == 0) goto L_0x00a8
            r3 = 1
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            r0.f202920Y = r3
            java.lang.String r3 = r0.f202950u
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            java.lang.String r7 = "MicroMsg.SayHiWithSnsPermissionUI3"
            r8 = 8
            r9 = 0
            if (r3 == 0) goto L_0x0115
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r10 = r0.f202950u
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
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
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
            r0.f202912U = r3
            r3.setVisibility(r4)
            r3 = 2131300247(0x7f090f97, float:1.8218518E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.f202910T = r3
            r3 = 2131297323(0x7f09042b, float:1.8212588E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x014e
            r8 = 2131756221(0x7f1004bd, float:1.9143343E38)
            androidx.appcompat.app.AppCompatActivity r10 = r31.getContext()
            r11 = 2131099712(0x7f060040, float:1.7811785E38)
            int r10 = kg3.C76577a.m92153d(r10, r11)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r8, r10)
            r3.setImageDrawable(r8)
        L_0x014e:
            android.widget.LinearLayout r3 = r0.f202910T
            com.tencent.mm.plugin.profile.ui.x2 r8 = new com.tencent.mm.plugin.profile.ui.x2
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            r3 = 2131300246(0x7f090f96, float:1.8218516E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            com.tencent.mm.plugin.profile.ui.y2 r8 = new com.tencent.mm.plugin.profile.ui.y2
            r8.<init>(r0)
            r3.setOnClickListener(r8)
            r3 = 2131312839(0x7f0940c7, float:1.8244058E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r3 = 2131306956(0x7f0929cc, float:1.8232126E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f202902N = r3
            r3.setBackgroundDrawable(r9)
            android.view.View r3 = r0.f202902N
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r8.mo10233c(r5)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r12 = "initLabelPanelAll"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            com.tencent.mm.storage.e2 r3 = a22.C27740g.vx0()
            java.util.ArrayList r3 = r3.mo100947TE()
            r0.f202903P = r3
            java.util.ArrayList<java.lang.String> r3 = r0.f202904Q
            if (r3 == 0) goto L_0x0239
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.s r3 = r3.mo105880F()
            java.lang.String r8 = r0.f202950u
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
            java.lang.String r10 = r0.f202950u
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
            java.util.ArrayList<java.lang.String> r8 = r0.f202904Q
            r8.addAll(r3)
        L_0x0241:
            java.util.List<java.lang.String> r8 = r0.f202903P
            if (r8 == 0) goto L_0x024b
            int r8 = r8.size()
            r0.f202907R0 = r8
        L_0x024b:
            if (r3 == 0) goto L_0x0258
            int r8 = r3.size()
            r0.f202909S0 = r8
            java.util.List<java.lang.String> r8 = r0.f202911T0
            r8.addAll(r3)
        L_0x0258:
            r0.mo96724U7(r3)
        L_0x025b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "isCurrentHappenChatting = "
            r3.append(r8)
            boolean r8 = r0.f202918X
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
            r0.f202897I = r3
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
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
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
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
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
            java.lang.String r9 = r0.f202950u
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
            r0.f202899K = r9
            r9 = 2131310355(0x7f093713, float:1.823902E38)
            android.view.View r9 = r0.findViewById(r9)
            r10 = 2131310359(0x7f093717, float:1.8239028E38)
            android.view.View r9 = r9.findViewById(r10)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r9
            r0.f202942n = r9
            android.content.Intent r9 = r31.getIntent()
            java.lang.String r10 = "sayhi_with_sns_permission"
            r9.getBooleanExtra(r10, r4)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = r0.f202942n
            boolean r10 = r3.mo62943y3()
            r9.setCheck(r10)
            r9 = 2131314907(0x7f0948db, float:1.8248252E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0.f202944p = r9
            r9 = 2131314069(0x7f094595, float:1.8246553E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0.f202946q = r9
            r9.setVisibility(r4)
            android.widget.ImageView r9 = r0.f202944p
            r9.setVisibility(r4)
            android.widget.ImageView r9 = r0.f202946q
            java.lang.String r10 = "checkbox_cell_off"
            d51.C7171c.m7371a(r9, r10)
            android.widget.ImageView r9 = r0.f202944p
            d51.C7171c.m7371a(r9, r10)
            android.widget.ImageView r9 = r0.f202946q
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.setTag(r10)
            android.widget.ImageView r9 = r0.f202944p
            r9.setTag(r10)
            r9 = 2131314908(0x7f0948dc, float:1.8248254E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f202947r = r9
            r9 = 2131314912(0x7f0948e0, float:1.8248262E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9 = 2131313919(0x7f0944ff, float:1.8246248E38)
            android.view.View r9 = r0.findViewById(r9)
            r11 = 2131310368(0x7f093720, float:1.8239046E38)
            android.view.View r9 = r9.findViewById(r11)
            com.tencent.mm.ui.widget.MMSwitchBtn r9 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r9
            r0.f202943o = r9
            java.lang.String r9 = r0.f202950u
            jr2.t r11 = jr2.C99019x.m128974f()
            r12 = 5
            os2.m0 r11 = (os2.C11766m0) r11
            boolean r9 = r11.mo11654bD(r9, r12)
            com.tencent.mm.ui.widget.MMSwitchBtn r11 = r0.f202943o
            r11.setCheck(r9)
            r9 = 2131298175(0x7f09077f, float:1.8214316E38)
            android.view.View r9 = r0.findViewById(r9)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$f r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$f
            r11.<init>()
            r9.setOnClickListener(r11)
            r9 = 2131300847(0x7f0911ef, float:1.8219735E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0.f202895G = r9
            r9 = 2131300853(0x7f0911f5, float:1.8219747E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f202896H = r9
            java.lang.String r11 = r3.f149513S0
            r9.setText(r11)
            r31.mo96723T7()
            int r3 = r3.f149500H
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r9[r4] = r11
            java.lang.String r11 = "sex:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r9)
            r9 = 2131310360(0x7f093718, float:1.823903E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 2
            if (r3 != r6) goto L_0x03e8
            r12 = 2131837076(0x7f114094, float:1.9307337E38)
            r9.setText(r12)
            goto L_0x03f0
        L_0x03e8:
            if (r3 != r11) goto L_0x03f0
            r12 = 2131837075(0x7f114093, float:1.9307335E38)
            r9.setText(r12)
        L_0x03f0:
            r9 = 2131310369(0x7f093721, float:1.8239048E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r3 != r6) goto L_0x0402
            r3 = 2131836860(0x7f113fbc, float:1.9306899E38)
            r9.setText(r3)
            goto L_0x040a
        L_0x0402:
            if (r3 != r11) goto L_0x040a
            r3 = 2131836859(0x7f113fbb, float:1.9306897E38)
            r9.setText(r3)
        L_0x040a:
            java.lang.String r3 = r0.f202950u
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            r0.f202901M = r3
            java.lang.String r9 = "Contact_default_permission"
            r12 = -1
            if (r3 == 0) goto L_0x04a9
            android.view.View r3 = r0.findViewById(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r8.mo10233c(r13)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r3
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r3 = 2131310357(0x7f093715, float:1.8239024E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x04eb
            k20.a r8 = new k20.a
            r8.<init>()
            r10 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r8.mo10233c(r13)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r3
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x04eb
        L_0x04a9:
            android.widget.ImageView r3 = r0.f202944p
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$g r8 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$g
            r8.<init>()
            r3.setOnClickListener(r8)
            android.widget.ImageView r3 = r0.f202946q
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            boolean r8 = r0.f202898J
            if (r8 == 0) goto L_0x04c7
            r8 = 0
            goto L_0x04cc
        L_0x04c7:
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$h r8 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$h
            r8.<init>()
        L_0x04cc:
            r3.setOnClickListener(r8)
            android.content.Intent r3 = r31.getIntent()
            int r3 = r3.getIntExtra(r9, r12)
            if (r3 <= 0) goto L_0x04eb
            r8 = 8
            r3 = r3 & r8
            if (r3 != r8) goto L_0x04e4
            r0.f202916W = r10
            r0.mo96725V7(r4)
            goto L_0x04eb
        L_0x04e4:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f202916W = r3
            r0.mo96725V7(r6)
        L_0x04eb:
            boolean r3 = r0.f202901M
            if (r3 == 0) goto L_0x04f4
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r0.f202943o
            r3.setCheck(r6)
        L_0x04f4:
            boolean r3 = r0.f202957z
            java.lang.String r8 = " "
            r14 = 2131840234(0x7f114cea, float:1.9313742E38)
            if (r3 == 0) goto L_0x06c4
            r3 = 2131312723(0x7f094053, float:1.8243823E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r0.f202927d = r3
            r3 = 2131313245(0x7f09425d, float:1.8244881E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202931f = r3
            r3 = 2131300047(0x7f090ecf, float:1.8218113E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f202933g = r3
            boolean r3 = r0.f202920Y
            java.lang.String r12 = ""
            if (r3 != 0) goto L_0x0525
            goto L_0x059a
        L_0x0525:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_COMMON_SAY_HI_STRING_SYNC
            java.lang.String r3 = r3.mo119675I(r11, r12)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r11 != 0) goto L_0x059a
            r0.f202891C = r6
            android.widget.TextView r11 = r0.f202933g
            r11.setVisibility(r4)
            android.widget.TextView r11 = r0.f202933g
            di3.d r18 = di3.C86312j.m106911c(r2)
            r10 = r18
            ny.h r10 = (p629ny.C76979h) r10
            r13 = 2131834203(0x7f11355b, float:1.930151E38)
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r15[r4] = r3
            java.lang.String r13 = r0.getString(r13, r15)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            android.widget.TextView r15 = r0.f202933g
            float r15 = r15.getTextSize()
            android.text.SpannableString r10 = r10.yp0(r0, r13, r15)
            r11.setText(r10)
            de3.u r10 = new de3.u
            java.lang.String r11 = r0.getString(r14)
            r10.<init>((java.lang.String) r11)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$p r11 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$p
            r11.<init>(r3)
            int r3 = r10.length()
            r13 = 17
            r10.mo105705b(r11, r4, r3, r13)
            android.widget.TextView r3 = r0.f202933g
            r3.append(r8)
            android.widget.TextView r3 = r0.f202933g
            r3.append(r10)
            android.widget.TextView r3 = r0.f202933g
            android.text.method.MovementMethod r10 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r10)
            android.widget.TextView r3 = r0.f202933g
            com.tencent.mm.plugin.profile.ui.f3 r10 = new com.tencent.mm.plugin.profile.ui.f3
            r10.<init>(r0)
            r3.setOnLongClickListener(r10)
        L_0x059a:
            android.widget.EditText r3 = r0.f202927d
            qn3.c r3 = qn3.C77382c.m93286b(r3)
            r3.f225611e = r4
            r10 = 100
            r3.f225610d = r10
            r10 = 0
            r3.mo107499d(r10)
            java.lang.String r3 = eb0.C75592q0.m90783m()
            if (r3 != 0) goto L_0x05b1
            goto L_0x05b2
        L_0x05b1:
            r12 = r3
        L_0x05b2:
            r3 = 2131835636(0x7f113af4, float:1.9304416E38)
            java.lang.String r10 = r0.getString(r3)
            int r3 = r10.length()
            int r11 = r12.length()
            int r3 = r3 + r11
            r11 = 50
            if (r3 <= r11) goto L_0x05cf
            int r3 = r10.length()
            int r11 = r11 - r3
            java.lang.String r12 = r12.substring(r4, r11)
        L_0x05cf:
            java.lang.String r3 = r0.f202949t
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0655
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r3 = r0.f202949t
            com.tencent.mm.storage.z1 r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0655
            java.lang.String r3 = r1.getNickname()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0655
            java.lang.Class<a11.c> r3 = a11.C39479c.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            a11.c r3 = (a11.C39479c) r3
            eb0.m2 r3 = r3.mo62084mr()
            java.lang.String r11 = r0.f202949t
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69801SE(r11)
            java.lang.String r11 = eb0.C75592q0.m90789s()
            java.lang.String r3 = r3.mo69789q2(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r11 == 0) goto L_0x0616
            r3 = r12
        L_0x0616:
            r11 = 2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r15 = r0.f202949t
            r13[r4] = r15
            java.lang.String r15 = r1.getNickname()
            r13[r6] = r15
            java.lang.String r15 = "chatroomName:%s nick:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            ny.h r13 = (p629ny.C76979h) r13
            androidx.appcompat.app.AppCompatActivity r15 = r31.getContext()
            android.content.res.Resources r14 = r31.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r1 = r1.getNickname()
            r6[r4] = r1
            r1 = 1
            r6[r1] = r3
            r1 = 2131835637(0x7f113af5, float:1.9304418E38)
            java.lang.String r1 = r14.getString(r1, r6)
            android.widget.EditText r3 = r0.f202927d
            float r3 = r3.getTextSize()
            android.text.SpannableString r1 = r13.yp0(r15, r1, r3)
            r0.f202921Y0 = r1
            goto L_0x0656
        L_0x0655:
            r1 = 0
        L_0x0656:
            java.lang.CharSequence r3 = r0.f202921Y0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r3 == 0) goto L_0x067d
            di3.d r3 = di3.C86312j.m106911c(r2)
            ny.h r3 = (p629ny.C76979h) r3
            androidx.appcompat.app.AppCompatActivity r6 = r31.getContext()
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r4] = r12
            java.lang.String r10 = java.lang.String.format(r10, r13)
            android.widget.EditText r11 = r0.f202927d
            float r11 = r11.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r6, r10, r11)
            r0.f202921Y0 = r3
        L_0x067d:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r3 == 0) goto L_0x068b
            android.widget.EditText r1 = r0.f202927d
            java.lang.CharSequence r3 = r0.f202921Y0
            r1.setText(r3)
            goto L_0x06a4
        L_0x068b:
            di3.d r3 = di3.C86312j.m106911c(r2)
            ny.h r3 = (p629ny.C76979h) r3
            androidx.appcompat.app.AppCompatActivity r6 = r31.getContext()
            android.widget.EditText r10 = r0.f202927d
            float r10 = r10.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r6, r1, r10)
            android.widget.EditText r3 = r0.f202927d
            r3.setText(r1)
        L_0x06a4:
            android.widget.EditText r1 = r0.f202927d
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.f202929e = r1
            android.widget.EditText r1 = r0.f202927d
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$i r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$i
            r3.<init>()
            r1.addTextChangedListener(r3)
            android.widget.TextView r1 = r0.f202931f
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$j r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$j
            r3.<init>()
            r1.setOnClickListener(r3)
        L_0x06c4:
            android.widget.EditText r1 = r0.f202927d
            r3 = 3
            if (r1 == 0) goto L_0x0712
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.widget.LinearLayout
            if (r1 != 0) goto L_0x06d2
            goto L_0x0712
        L_0x06d2:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            boolean r6 = r0.f202957z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r1[r4] = r6
            boolean r6 = r0.f202918X
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r10 = 1
            r1[r10] = r6
            boolean r6 = r0.f202920Y
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r10 = 2
            r1[r10] = r6
            java.lang.String r6 = "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r1)
            boolean r1 = r0.f202920Y
            if (r1 == 0) goto L_0x0704
            android.widget.EditText r1 = r0.f202927d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            goto L_0x0718
        L_0x0704:
            android.widget.EditText r1 = r0.f202927d
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6 = 8
            r1.setVisibility(r6)
            goto L_0x0718
        L_0x0712:
            java.lang.String r1 = "updateSayHiContextVisiable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x0718:
            boolean r1 = r0.f202890B
            if (r1 == 0) goto L_0x0a7d
            r1 = 2131312726(0x7f094056, float:1.8243829E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f202935h = r1
            android.view.ViewParent r1 = r1.getParent()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r4)
            boolean r1 = r0.f202957z
            if (r1 != 0) goto L_0x0739
            android.widget.EditText r1 = r0.f202935h
            r1.clearFocus()
        L_0x0739:
            android.widget.EditText r1 = r0.f202935h
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r1.f225611e = r4
            r6 = 100
            r1.f225610d = r6
            r6 = 0
            r1.mo107499d(r6)
            android.widget.EditText r1 = r0.f202935h
            android.text.InputFilter[] r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0.f212544a
            r1.setFilters(r6)
            boolean r1 = r0.f202957z
            if (r1 != 0) goto L_0x0760
            r1 = 2131834192(0x7f113550, float:1.9301487E38)
            r0.setMMTitle((int) r1)
            int[] r1 = r0.f202892D
            r6 = 1
            r1[r4] = r6
            goto L_0x0766
        L_0x0760:
            r1 = 2131834201(0x7f113559, float:1.9301506E38)
            r0.setMMTitle((int) r1)
        L_0x0766:
            java.lang.String r1 = r0.f202953x
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0791
            android.widget.EditText r1 = r0.f202935h
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            androidx.appcompat.app.AppCompatActivity r5 = r31.getContext()
            java.lang.String r6 = r0.f202953x
            android.widget.EditText r7 = r0.f202935h
            float r7 = r7.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r5, r6, r7)
            r1.setText(r2)
            int[] r1 = r0.f202892D
            r2 = 6
            r5 = 1
            r1[r2] = r5
            goto L_0x0a35
        L_0x0791:
            java.lang.String r1 = r0.f202952w
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x07be
            android.widget.EditText r1 = r0.f202935h
            di3.d r6 = di3.C86312j.m106911c(r2)
            ny.h r6 = (p629ny.C76979h) r6
            androidx.appcompat.app.AppCompatActivity r7 = r31.getContext()
            java.lang.String r10 = r0.f202952w
            android.widget.EditText r11 = r0.f202935h
            float r11 = r11.getTextSize()
            android.text.SpannableString r6 = r6.yp0(r7, r10, r11)
            r1.setHint(r6)
            android.widget.EditText r1 = r0.f202935h
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$k r6 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$k
            r6.<init>()
            r1.setOnFocusChangeListener(r6)
        L_0x07be:
            int r1 = r0.f202955y
            switch(r1) {
                case 8: goto L_0x0891;
                case 9: goto L_0x07c3;
                case 10: goto L_0x07c5;
                case 11: goto L_0x07c5;
                case 12: goto L_0x07c3;
                case 13: goto L_0x07c5;
                case 14: goto L_0x0891;
                default: goto L_0x07c3;
            }
        L_0x07c3:
            goto L_0x094e
        L_0x07c5:
            hg0.b r1 = dg0.C75398e.vx0()
            java.lang.String r6 = r0.f202950u
            hg0.a r1 = r1.mo106401a(r6)
            if (r1 == 0) goto L_0x094e
            java.lang.String r6 = r1.mo106388h()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x094e
            java.lang.String r6 = r1.mo106388h()
            android.widget.EditText r7 = r0.f202935h
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x07f1
            goto L_0x094e
        L_0x07f1:
            android.view.View r6 = r0.f202937i
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r24 = r7.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r26 = "initMobileNameArea"
            java.lang.String r27 = "()Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r6
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r25 = "initMobileNameArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.widget.TextView r6 = r0.f202939j
            di3.d r7 = di3.C86312j.m106911c(r2)
            ny.h r7 = (p629ny.C76979h) r7
            r10 = 2131824306(0x7f110eb2, float:1.9281436E38)
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r11 = r1.mo106388h()
            r12[r4] = r11
            java.lang.String r10 = r0.getString(r10, r12)
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            android.widget.TextView r11 = r0.f202939j
            float r11 = r11.getTextSize()
            android.text.SpannableString r7 = r7.yp0(r0, r10, r11)
            r6.setText(r7)
            de3.u r6 = new de3.u
            r7 = 2131840234(0x7f114cea, float:1.9313742E38)
            java.lang.String r7 = r0.getString(r7)
            r6.<init>((java.lang.String) r7)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o r7 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o
            java.lang.String r1 = r1.mo106388h()
            r7.<init>(r1)
            int r1 = r6.length()
            r10 = 17
            r6.mo105705b(r7, r4, r1, r10)
            android.widget.TextView r1 = r0.f202939j
            r1.append(r8)
            android.widget.TextView r1 = r0.f202939j
            r1.append(r6)
            android.widget.TextView r1 = r0.f202939j
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r6)
            int[] r1 = r0.f202892D
            r6 = 1
            r1[r3] = r6
            goto L_0x094c
        L_0x0891:
            java.lang.String r1 = r0.f202951v
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x094e
            java.lang.String r1 = r0.f202951v
            android.widget.EditText r6 = r0.f202935h
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x08ad
            goto L_0x094e
        L_0x08ad:
            int[] r1 = r0.f202893E
            r6 = 2
            r1[r4] = r6
            android.view.View r1 = r0.f202937i
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r6.mo10233c(r5)
            java.lang.Object[] r24 = r6.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r26 = "initChatroomNameArea"
            java.lang.String r27 = "()Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r6 = r6.mo10231a(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r25 = "initChatroomNameArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.widget.TextView r1 = r0.f202939j
            di3.d r6 = di3.C86312j.m106911c(r2)
            ny.h r6 = (p629ny.C76979h) r6
            r7 = 2131824305(0x7f110eb1, float:1.9281434E38)
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r10 = r0.f202951v
            r11[r4] = r10
            java.lang.String r7 = r0.getString(r7, r11)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            android.widget.TextView r10 = r0.f202939j
            float r10 = r10.getTextSize()
            android.text.SpannableString r6 = r6.yp0(r0, r7, r10)
            r1.setText(r6)
            de3.u r1 = new de3.u
            r6 = 2131840234(0x7f114cea, float:1.9313742E38)
            java.lang.String r6 = r0.getString(r6)
            r1.<init>((java.lang.String) r6)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o r6 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o
            java.lang.String r7 = r0.f202951v
            r6.<init>(r7)
            int r7 = r1.length()
            r10 = 17
            r1.mo105705b(r6, r4, r7, r10)
            android.widget.TextView r6 = r0.f202939j
            r6.append(r8)
            android.widget.TextView r6 = r0.f202939j
            r6.append(r1)
            android.widget.TextView r1 = r0.f202939j
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r6)
            int[] r1 = r0.f202892D
            r6 = 2
            r1[r3] = r6
        L_0x094c:
            r1 = 1
            goto L_0x094f
        L_0x094e:
            r1 = 0
        L_0x094f:
            boolean r6 = r0.f202957z
            if (r6 != 0) goto L_0x0a35
            if (r1 != 0) goto L_0x0a35
            int[] r1 = r0.f202893E
            r6 = 1
            r1[r4] = r6
            com.tencent.mm.storage.n3 r1 = fd0.C75743h.wx0()
            java.lang.String r6 = r0.f202950u
            com.tencent.mm.storage.m3 r1 = r1.mo101190bD(r6)
            if (r1 != 0) goto L_0x0968
            goto L_0x0a35
        L_0x0968:
            ae3.b r1 = ae3.C67030b.m79187b(r0, r1)
            java.lang.String r6 = r1.f192525b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0a35
            java.lang.String r6 = r1.f192525b
            r7 = 2131830284(0x7f11260c, float:1.929356E38)
            java.lang.String r7 = r0.getString(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0985
            goto L_0x0a35
        L_0x0985:
            r6 = 2131835636(0x7f113af4, float:1.9304416E38)
            java.lang.String r7 = r0.getString(r6)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r10 = "%s"
            int r6 = r6.indexOf(r10)
            r7.substring(r4, r6)
            java.lang.String r6 = r1.f192525b
            android.view.View r7 = r0.f202937i
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r10.mo10233c(r5)
            java.lang.Object[] r24 = r10.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r26 = "initVerifyNameArea"
            java.lang.String r27 = "()Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r7
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r5 = r10.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3"
            java.lang.String r25 = "initVerifyNameArea"
            java.lang.String r26 = "()Z"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.widget.TextView r5 = r0.f202939j
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            r7 = 2131824308(0x7f110eb4, float:1.928144E38)
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r1 = r1.f192525b
            r11[r4] = r1
            java.lang.String r1 = r0.getString(r7, r11)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r7 = r0.f202939j
            float r7 = r7.getTextSize()
            android.text.SpannableString r1 = r2.yp0(r0, r1, r7)
            r5.setText(r1)
            de3.u r1 = new de3.u
            r2 = 2131840235(0x7f114ceb, float:1.9313744E38)
            java.lang.String r2 = r0.getString(r2)
            r1.<init>((java.lang.String) r2)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$o
            r2.<init>(r6)
            int r5 = r1.length()
            r6 = 17
            r1.mo105705b(r2, r4, r5, r6)
            android.widget.TextView r2 = r0.f202939j
            r2.append(r8)
            android.widget.TextView r2 = r0.f202939j
            r2.append(r1)
            android.widget.TextView r1 = r0.f202939j
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            int[] r1 = r0.f202892D
            r1[r3] = r3
            r1 = 1
            r0.f202889A = r1
        L_0x0a35:
            android.widget.EditText r1 = r0.f202935h
            java.lang.CharSequence r1 = r1.getHint()
            if (r1 == 0) goto L_0x0a59
            android.widget.EditText r1 = r0.f202935h
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0a59
            android.widget.EditText r1 = r0.f202935h
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            r0.f202945p0 = r1
        L_0x0a59:
            android.widget.EditText r1 = r0.f202935h
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0a7d
            android.widget.EditText r1 = r0.f202935h
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0a7d
            android.widget.EditText r1 = r0.f202935h
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.f202945p0 = r1
        L_0x0a7d:
            r1 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r1 = r0.getString(r1)
            boolean r2 = r0.f202957z
            r5 = 2131821539(0x7f1103e3, float:1.9275824E38)
            if (r2 != 0) goto L_0x0a8f
            java.lang.String r1 = r0.getString(r5)
        L_0x0a8f:
            boolean r2 = r0.f202918X
            if (r2 == 0) goto L_0x0a97
            java.lang.String r1 = r0.getString(r5)
        L_0x0a97:
            java.lang.String r2 = tc2.C77890f.m94019a(r3)
            r3 = 2131304902(0x7f0921c6, float:1.822796E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r0.f202914V = r3
            r3.setText(r1)
            android.widget.Button r1 = r0.f202914V
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$l
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r0.f202914V
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$m r3 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$m
            r3.<init>(r2)
            r1.setOnTouchListener(r3)
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$n r1 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$n
            r1.<init>()
            r0.setBackBtn(r1)
            android.widget.Button r1 = r0.f202914V
            android.content.res.Resources r2 = r31.getResources()
            r3 = 2131099665(0x7f060011, float:1.781169E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.Button r1 = r0.f202914V
            r2 = 2131231405(0x7f0802ad, float:1.807889E38)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setBackground(r2)
            boolean r1 = r0.f202897I
            if (r1 != 0) goto L_0x0ae8
            r31.mo96714K7()
        L_0x0ae8:
            com.tencent.mm.ui.tools.KeyboardHeightProvider r1 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            r1.<init>(r0)
            r0.f202906R = r1
            r1.f220015b = r0
            boolean r1 = r0.f202918X
            if (r1 == 0) goto L_0x0afb
            r1 = 2131834193(0x7f113551, float:1.930149E38)
            r0.setMMTitle((int) r1)
        L_0x0afb:
            android.content.Intent r1 = r31.getIntent()
            r2 = -1
            int r1 = r1.getIntExtra(r9, r2)
            boolean r2 = r0.f202901M
            if (r2 != 0) goto L_0x0b0d
            if (r1 <= 0) goto L_0x0b0d
            r31.mo96714K7()
        L_0x0b0d:
            r31.mo96726W7()
            android.widget.EditText r1 = r0.f202935h
            qn3.c r1 = qn3.C77382c.m93286b(r1)
            r2 = 32
            r1.f225611e = r4
            r1.f225610d = r2
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$a r2 = new com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3$a
            r2.<init>(r0)
            r1.mo107499d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3.initView():void");
    }

    public boolean isHideVKBWhenScroll() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null && intent.hasExtra("Contact_get_desc_report_data")) {
                this.f202894F = intent.getIntArrayExtra("Contact_get_desc_report_data");
            }
            mo96723T7();
        } else if (i2 == -1 && intent != null && i == 600) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>();
            }
            List<String> d = ((C67001a) C28250a.m38138a()).mo90966d();
            if (mo96715L7(stringArrayListExtra, this.f202904Q) || mo96715L7(d, this.f202903P)) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (d == null) {
                    d = new ArrayList<>();
                }
                if (this.f202903P == null) {
                    this.f202903P = new ArrayList();
                }
                for (String next : d) {
                    if (!this.f202903P.contains(next) && !this.f202908S.contains(next)) {
                        this.f202908S.add(next);
                    }
                }
                this.f202903P = d;
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    if (this.f202903P.contains(next2)) {
                        this.f202903P.remove(next2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f202903P);
                this.f202903P.clear();
                this.f202903P.addAll(stringArrayListExtra);
                this.f202903P.addAll(arrayList);
                this.f202904Q.clear();
                this.f202904Q.addAll(stringArrayListExtra);
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                if (stringArrayListExtra2 != null) {
                    this.f202913U0.addAll(stringArrayListExtra2);
                }
                ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.f202915V0.addAll(stringArrayListExtra3);
                }
                ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.f202919X0.addAll(stringArrayListExtra4);
                }
                ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.f202917W0.addAll(stringArrayListExtra5);
                }
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.f202904Q, this.f202903P);
                mo96724U7(this.f202904Q);
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
        C115669n.INSTANCE.mo160131h(14036, Integer.valueOf(this.f202892D[0]), Integer.valueOf(this.f202892D[1]), Integer.valueOf(this.f202892D[2]), Integer.valueOf(this.f202892D[3]), Integer.valueOf(this.f202892D[4]), Integer.valueOf(this.f202892D[5]), Integer.valueOf(this.f202892D[6]), Integer.valueOf(this.f202892D[7]), this.f202950u);
        super.onDestroy();
        removeAllOptionMenu();
        C118418g.INSTANCE.mo175826kl("ie_ver_usr");
        KeyboardHeightProvider keyboardHeightProvider = this.f202906R;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f202892D[0] = 1;
        finish();
        ((C119157j) C119157j.f356862d).mo183884o(new C70310z2(this, false));
        return true;
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202906R;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f202906R;
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
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: errType = " + i4 + " errCode = " + i5 + " errMsg = " + str2);
        try {
            mo96717N7();
            if (yVar2 instanceof C44590b1) {
                Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: getopCode: %s.", Integer.valueOf(((C44590b1) yVar2).f120898g));
                if (!(i4 == 0 && i5 == 0) && ((C44590b1) yVar2).f120898g == 1) {
                    Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd:is MM_VERIFYUSER_ADDCONTACT return");
                    return;
                }
            } else {
                Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: is no NetSceneVerifyUser.");
            }
            Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "sendrequest_second");
            mo96716M7();
            if (i4 == 0 && i5 == 0) {
                C76879j.m92726T(this, getString(C0966R.string.ilw));
                C68397a.m80737c(this.f202950u, 1);
                RecoverAccountFriendEvent recoverAccountFriendEvent = new RecoverAccountFriendEvent();
                RecoverAccountFriendEvent.C67773a aVar2 = recoverAccountFriendEvent.f193880d;
                aVar2.f193881a = this.f202950u;
                aVar2.f193882b = 1;
                recoverAccountFriendEvent.publish();
                int i6 = 2;
                if (this.f202955y == 17 && (yVar2 instanceof C44590b1)) {
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
                if (this.f202890B) {
                    String O7 = mo96718O7();
                    if (!Util.isNullOrNil(O7)) {
                        Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "set temp remark of %s", this.f202950u);
                        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202950u);
                        z1Var.mo62860K2(O7);
                        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202950u);
                        Lo.field_encryptUsername = this.f202950u;
                        Lo.field_conRemark = O7;
                        ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                        C97625j3.m125812b().mo105907v().mo69668Q3(z1Var);
                        this.f202892D[2] = 1;
                        if (!Util.isNullOrNil(this.f202952w) && !O7.equals(this.f202952w)) {
                            this.f202892D[5] = 1;
                        }
                    } else if (!Util.isNullOrNil(this.f202952w)) {
                        this.f202892D[2] = 0;
                    } else {
                        this.f202892D[2] = 2;
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
                        mo96713J7(list);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(this.f202950u);
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar3 = snsPermissionNotifyEvent.f107766d;
                        aVar3.f107768b = true;
                        aVar3.f107767a = false;
                        aVar3.f107769c = this.f202950u;
                        snsPermissionNotifyEvent.publish();
                        if (this.f202942n.f220433y) {
                            C45628s0.m50783k0(z1Var2);
                        } else {
                            C45628s0.m50799s0(z1Var2);
                        }
                        SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new SnsPermissionNotifyEvent();
                        SnsPermissionNotifyEvent.C40168a aVar4 = snsPermissionNotifyEvent2.f107766d;
                        aVar4.f107768b = false;
                        aVar4.f107767a = true;
                        String str3 = this.f202950u;
                        aVar4.f107769c = str3;
                        snsPermissionNotifyEvent2.f107766d.f107770d = ((C11766m0) C99019x.m128974f()).mo11654bD(str3, 5);
                        String str4 = this.f202950u;
                        if (this.f202943o.f220433y) {
                            i6 = 1;
                        }
                        mo96728Y7(str4, i6, 5);
                        snsPermissionNotifyEvent2.publish();
                        if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false)) {
                            Intent intent = new Intent();
                            intent.putExtra("friend_message_transfer_username", this.f202950u);
                            intent.setAction("friend_message_accept_" + this.f202950u);
                            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2503er);
                            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2498em);
                            C88144b.m109791i(this, "subapp", ".ui.friend.FMessageTransferUI", intent, (Bundle) null);
                        }
                    }
                }
                getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
                C42599h.xx0(getIntent(), 1, 1, this.f202950u);
                setResult(-1, getIntent());
                if (this.f202920Y) {
                    C70142g.m82629a(this.f202950u, mo96719P7(), 1, this.f202955y);
                }
                finish();
                ((C119157j) C119157j.f356862d).mo183884o(new C70310z2(this, true));
                ((C119157j) C119157j.f356862d).mo183875f(new C70266e3(this, 1));
                if ((this.f202926c1 & 8) == 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            } else if (i4 == 4 && i5 == -302) {
                Log.m105929w("MicroMsg.SayHiWithSnsPermissionUI3", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", Integer.valueOf(yVar.getType() == 30 ? ((C44590b1) yVar2).f120898g : 0));
                C76879j.m92707A(this, getString(C0966R.string.f360313bt1), getString(C0966R.string.a3h), getString(C0966R.string.f7566ju), getString(C0966R.string.f7926wf), new C4972d(), (DialogInterface.OnClickListener) null);
            } else if (i4 == 4 && i5 == -24 && !Util.isNullOrNil(str)) {
                Toast.makeText(this, str2, 1).show();
            } else if (i4 == 4 && ((i5 == -2 || i5 == -101) && !Util.isNullOrNil(str))) {
                C76879j.m92754y(this, str2, "", getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            } else if (this.f202957z && (i5 == -24 || i5 == -34)) {
                Toast.makeText(this, C0966R.string.exz, 0).show();
            } else if (i4 == 4 && i5 == -3400 && this.f202897I) {
                this.f202898J = true;
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                if (!Util.isNullOrNil(str)) {
                    this.f202947r.setText(str2);
                }
                mo96727X7();
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(str2);
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C4973e());
                qVar.mo107603o();
            } else {
                Toast.makeText(this, C0966R.string.ilv, 0).show();
            }
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SayHiWithSnsPermissionUI3", "exception in onSceneEnd : " + e.getMessage());
        } finally {
            Log.m105925i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void onStop() {
        super.onStop();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f202906R;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
