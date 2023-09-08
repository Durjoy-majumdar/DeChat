package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import a63.C67008a;
import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b63.C67176b;
import b63.C67183e;
import b63.C67185g;
import b63.C67205s0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75124l;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import de3.C75355a0;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import f40.C86709a0;
import g63.C75886j;
import gr3.C76024a;
import h81.C32735h;
import ie3.C76324c;
import j20.C117292a;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import k53.C76492a;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C117747y;
import p755xs.C102720b;
import p923xj.C78853a;
import qo3.C101218e0;
import qo3.C77389a;
import qo3.C77398g;
import r43.C12942a;
import t43.C77854a;
import t43.C77855b;
import u43.C52449b;
import u43.C78127d;
import v53.C78338b0;
import v53.C78342e0;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

@C88989a(2)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI */
public class WalletBalanceFetchUI extends WalletBaseUI implements WalletFormView.C75209c, WcPayKeyboard.C75086f {

    /* renamed from: Y */
    public static final /* synthetic */ int f207703Y = 0;

    /* renamed from: A */
    public TextView f207704A;

    /* renamed from: B */
    public boolean f207705B = true;

    /* renamed from: C */
    public boolean f207706C = true;

    /* renamed from: D */
    public View f207707D;

    /* renamed from: E */
    public int f207708E = 0;

    /* renamed from: F */
    public int f207709F = 0;

    /* renamed from: G */
    public int f207710G = 0;

    /* renamed from: H */
    public double f207711H = 0.0d;

    /* renamed from: I */
    public int f207712I = 0;

    /* renamed from: J */
    public DecimalFormat f207713J = new DecimalFormat("0.00");

    /* renamed from: K */
    public boolean f207714K = false;

    /* renamed from: L */
    public String f207715L;

    /* renamed from: M */
    public C52449b f207716M;

    /* renamed from: N */
    public int f207717N = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1);

    /* renamed from: P */
    public C76492a f207718P;

    /* renamed from: Q */
    public Runnable f207719Q = new C43327e();

    /* renamed from: R */
    public int f207720R = 0;

    /* renamed from: S */
    public Runnable f207721S = new C71688s();

    /* renamed from: T */
    public Runnable f207722T = new C71666a();

    /* renamed from: U */
    public boolean f207723U = false;

    /* renamed from: V */
    public boolean f207724V = false;

    /* renamed from: W */
    public HashMap<String, Integer> f207725W = new HashMap<>();

    /* renamed from: X */
    public IListener<KindaBindCardEvent> f207726X = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Succ");
                    WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
                    int i = WalletBalanceFetchUI.f207703Y;
                    walletBalanceFetchUI.mo98838M7();
                    WalletBalanceFetchUI walletBalanceFetchUI2 = WalletBalanceFetchUI.this;
                    walletBalanceFetchUI2.f207714K = true;
                    PayInfo payInfo = (PayInfo) walletBalanceFetchUI2.getInput().get("key_pay_info");
                    if (payInfo == null) {
                        payInfo = new PayInfo();
                        payInfo.f212592j = WalletBalanceFetchUI.this.f207730g;
                        payInfo.f212587e = 21;
                    }
                    WalletBalanceFetchUI.this.doSceneForceProgress(new C78338b0(payInfo.f212592j, 4));
                } else {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            WalletBalanceFetchUI.this.f207726X.dead();
            return true;
        }
    };

    /* renamed from: d */
    public ArrayList<Bankcard> f207727d;

    /* renamed from: e */
    public Bankcard f207728e;

    /* renamed from: f */
    public double f207729f;

    /* renamed from: g */
    public String f207730g = null;

    /* renamed from: h */
    public String f207731h;

    /* renamed from: i */
    public WalletFormView f207732i;

    /* renamed from: j */
    public LinearLayout f207733j;

    /* renamed from: n */
    public View f207734n;

    /* renamed from: o */
    public TextView f207735o;

    /* renamed from: p */
    public TextView f207736p;

    /* renamed from: q */
    public TextView f207737q;

    /* renamed from: r */
    public TextView f207738r;

    /* renamed from: s */
    public ViewGroup f207739s;

    /* renamed from: t */
    public ViewGroup f207740t;

    /* renamed from: u */
    public WcPayBannerView f207741u;

    /* renamed from: v */
    public LinearLayout f207742v;

    /* renamed from: w */
    public TextView f207743w;

    /* renamed from: x */
    public LinearLayout f207744x;

    /* renamed from: y */
    public CdnImageView f207745y;

    /* renamed from: z */
    public TextView f207746z;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$e */
    public class C43327e implements Runnable {
        public C43327e() {
        }

        public void run() {
            WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
            int i = WalletBalanceFetchUI.f207703Y;
            walletBalanceFetchUI.getClass();
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "do get free fee");
            if (walletBalanceFetchUI.f207728e != null) {
                if (walletBalanceFetchUI.f207716M != null) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "cancel prev cgi");
                    walletBalanceFetchUI.f207716M.mo85581g();
                }
                long Y = C75228t.m90232Y("" + walletBalanceFetchUI.f207729f, "100");
                Bankcard bankcard = walletBalanceFetchUI.f207728e;
                C52449b bVar = new C52449b(Y, bankcard.field_bankcardType, bankcard.field_bindSerial);
                walletBalanceFetchUI.f207716M = bVar;
                bVar.mo9225i().mo123062e(new C43328h(walletBalanceFetchUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$a */
    public class C71666a implements Runnable {
        public C71666a() {
        }

        public void run() {
            WalletBalanceFetchUI.this.showNormalStWcKb();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$b */
    public class C71667b implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ ImageView f207749d;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$b$a */
        public class C71668a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f207751d;

            public C71668a(Bitmap bitmap) {
                this.f207751d = bitmap;
            }

            public void run() {
                ImageView imageView;
                C71667b bVar = C71667b.this;
                if (WalletBalanceFetchUI.this.f207728e != null && (imageView = bVar.f207749d) != null && imageView.getTag() != null && C71667b.this.f207749d.getTag().equals(WalletBalanceFetchUI.this.f207728e.field_bindSerial)) {
                    C71667b.this.f207749d.setImageBitmap(this.f207751d);
                }
            }
        }

        public C71667b(ImageView imageView) {
            this.f207749d = imageView;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C71668a(bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$c */
    public class C71669c implements C7092q.C7093a {
        public C71669c() {
        }

        public void onClick(View view) {
            WalletBalanceFetchUI.m84141H7(WalletBalanceFetchUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$d */
    public class C71670d implements C75124l {

        /* renamed from: a */
        public final /* synthetic */ JumpRemind f207754a;

        /* renamed from: b */
        public final /* synthetic */ C78342e0 f207755b;

        public C71670d(JumpRemind jumpRemind, C78342e0 e0Var) {
            this.f207754a = jumpRemind;
            this.f207755b = e0Var;
        }

        public void onCancel() {
            if (this.f207754a.mo104780b()) {
                WalletBalanceFetchUI.this.finish();
            }
        }

        public void onEnter() {
            this.f207754a.getClass();
        }

        public void onUrlCancel() {
            if (this.f207754a.mo104780b()) {
                WalletBalanceFetchUI.this.finish();
            }
        }

        public void onUrlOk() {
            if (this.f207754a.mo104780b()) {
                WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
                C78342e0 e0Var = this.f207755b;
                int i = WalletBalanceFetchUI.f207703Y;
                walletBalanceFetchUI.mo98835J7(e0Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$f */
    public class C71671f extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$f$a */
        public class C71672a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ List f207758d;

            public C71672a(List list) {
                this.f207758d = list;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                List list = this.f207758d;
                String str = "";
                if (list == null || i >= list.size()) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "add new card");
                    WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
                    int i2 = WalletBalanceFetchUI.f207703Y;
                    walletBalanceFetchUI.mo98841P7();
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[4];
                    objArr[0] = WalletBalanceFetchUI.this.f207715L;
                    objArr[1] = 9;
                    Bankcard bankcard = WalletBalanceFetchUI.this.f207728e;
                    objArr[2] = bankcard != null ? bankcard.field_bankcardType : str;
                    if (bankcard != null) {
                        str = bankcard.field_bindSerial;
                    }
                    objArr[3] = str;
                    nVar.mo160131h(16398, objArr);
                } else {
                    WalletBalanceFetchUI.this.f207728e = (Bankcard) this.f207758d.get(i);
                    WalletBalanceFetchUI.this.mo98845T7();
                    Log.m105925i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", WalletBalanceFetchUI.this.f207728e.field_desc);
                    C115669n nVar2 = C115669n.INSTANCE;
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = WalletBalanceFetchUI.this.f207715L;
                    objArr2[1] = 2;
                    Bankcard bankcard2 = WalletBalanceFetchUI.this.f207728e;
                    objArr2[2] = bankcard2 != null ? bankcard2.field_bankcardType : str;
                    if (bankcard2 != null) {
                        str = bankcard2.field_bindSerial;
                    }
                    objArr2[3] = str;
                    nVar2.mo160131h(16398, objArr2);
                }
                WalletBalanceFetchUI walletBalanceFetchUI2 = WalletBalanceFetchUI.this;
                int i3 = WalletBalanceFetchUI.f207703Y;
                walletBalanceFetchUI2.mo98846U7();
                WalletBalanceFetchUI.this.getClass();
            }
        }

        public C71671f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            String str;
            String str2;
            WalletBalanceFetchUI.this.showCircleStWcKb();
            ArrayList<Bankcard> j = C79029b0.vx0().wx0().mo91328j();
            C67176b bVar = C79029b0.vx0().wx0().f192958k;
            if (bVar != null) {
                String str3 = bVar.f192856i;
                str2 = bVar.f192855h;
                str = str3;
            } else {
                str2 = "";
                str = str2;
            }
            if (j == null) {
                Log.m105924i("MicroMsg.WalletBalanceFetchUI", "debit is null");
            }
            WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
            walletBalanceFetchUI.mo98839N7(walletBalanceFetchUI.getContext(), j, WalletBalanceFetchUI.this.f207728e, str2, str, new C71672a(j), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$g */
    public class C71673g implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List f207760d;

        /* renamed from: e */
        public final /* synthetic */ Context f207761e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$g$a */
        public class C71674a implements C102720b.C78973a {

            /* renamed from: d */
            public final /* synthetic */ String f207763d;

            /* renamed from: e */
            public final /* synthetic */ C76874e0 f207764e;

            /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$g$a$a */
            public class C71675a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f207766d;

                /* renamed from: e */
                public final /* synthetic */ Bitmap f207767e;

                public C71675a(String str, Bitmap bitmap) {
                    this.f207766d = str;
                    this.f207767e = bitmap;
                }

                public void run() {
                    int intValue;
                    Log.m105925i("MicroMsg.WalletBalanceFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f207766d, C71674a.this.f207763d);
                    if (WalletBalanceFetchUI.this.f207718P.mo106726a() && WalletBalanceFetchUI.this.f207725W.containsKey(this.f207766d) && (intValue = WalletBalanceFetchUI.this.f207725W.get(this.f207766d).intValue()) < C71674a.this.f207764e.size() && C71674a.this.f207764e.getItem(intValue) != null) {
                        C71674a.this.f207764e.getItem(intValue).setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(this.f207767e, WalletBalanceFetchUI.this.getResources().getDimensionPixelOffset(C0966R.dimen.atf), WalletBalanceFetchUI.this.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false)));
                        WalletBalanceFetchUI.this.f207718P.mo106727b();
                    }
                }
            }

            public C71674a(String str, C76874e0 e0Var) {
                this.f207763d = str;
                this.f207764e = e0Var;
            }

            /* renamed from: j3 */
            public void mo24656j3(String str, Bitmap bitmap) {
                MMHandlerThread.postToMainThread(new C71675a(str, bitmap));
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$g$b */
        public class C71676b extends C72478z {

            /* renamed from: g */
            public final /* synthetic */ Bankcard f207769g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C71676b(Context context, Bankcard bankcard) {
                super(context);
                this.f207769g = bankcard;
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                String str = this.f207769g.field_forbid_url;
                Log.m105925i("MicroMsg.WalletBalanceFetchUI", "go to url %s", str);
                intent.putExtra("rawUrl", str);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                intent.putExtra("pay_channel", 1);
                C75228t.m90217J(WalletBalanceFetchUI.this.getContext(), intent);
            }
        }

        public C71673g(List list, Context context) {
            this.f207760d = list;
            this.f207761e = context;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            Class cls;
            SpannableString spannableString;
            Bitmap bitmap;
            char c;
            char c2;
            Class cls2 = C102720b.class;
            List<Bankcard> list = this.f207760d;
            if (list != null) {
                char c3 = 0;
                int i = 0;
                for (Bankcard bankcard : list) {
                    C67183e c4 = C75556b.m90593c(this.f207761e, bankcard.field_bankcardType, bankcard.mo99394u2());
                    String str = "";
                    String str2 = c4 != null ? c4.f192875a : str;
                    Object[] objArr = new Object[1];
                    objArr[c3] = str2;
                    Log.m105919d("MicroMsg.WalletBalanceFetchUI", "logo url: %s", objArr);
                    Bitmap N6 = ((C102720b) C86312j.m106911c(cls2)).mo142104N6(new C75886j(str2));
                    ((C102720b) C86312j.m106911c(cls2)).Lu0(new C71674a(str2, e0Var));
                    if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
                        str = bankcard.field_forbidWord;
                    }
                    if (Util.isNullOrNil(bankcard.field_forbid_title)) {
                        spannableString = new SpannableString(str);
                        cls = cls2;
                    } else {
                        str = str + " ";
                        spannableString = new SpannableString(str + bankcard.field_forbid_title);
                        C71676b bVar = new C71676b(this.f207761e, bankcard);
                        int length = str.length();
                        int length2 = str.length() + bankcard.field_forbid_title.length();
                        cls = cls2;
                        spannableString.setSpan(new ForegroundColorSpan(this.f207761e.getResources().getColor(C0966R.color.ajt)), length, length2, 33);
                        spannableString.setSpan(bVar, length, length2, 33);
                    }
                    SpannableString spannableString2 = Util.isNullOrNil((CharSequence) spannableString) ? new SpannableString(bankcard.field_fetchArriveTimeWording) : spannableString;
                    String str3 = bankcard.field_desc;
                    BitmapDrawable bitmapDrawable = null;
                    if (N6 != null) {
                        c2 = 0;
                        c = 1;
                        bitmap = BitmapUtil.extractThumbNail(N6, this.f207761e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), this.f207761e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false);
                    } else {
                        c2 = 0;
                        c = 1;
                        bitmap = null;
                    }
                    Object[] objArr2 = new Object[3];
                    objArr2[c2] = Integer.valueOf(i);
                    objArr2[c] = str3;
                    objArr2[2] = spannableString2;
                    Log.m105925i("MicroMsg.WalletBalanceFetchUI", "i %d fee %s %s", objArr2);
                    int i2 = i + 1;
                    if (bitmap != null) {
                        bitmapDrawable = new BitmapDrawable(bitmap);
                    }
                    e0Var.mo107156p(i, str3, spannableString2, bitmapDrawable, 0, !Util.isNullOrNil(str));
                    if (bitmap == null) {
                        WalletBalanceFetchUI.this.f207725W.put(str2, Integer.valueOf(i2));
                    }
                    i = i2;
                    cls2 = cls;
                    c3 = 0;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$h */
    public class C71677h implements C11184p0 {
        public C71677h() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C76492a aVar = WalletBalanceFetchUI.this.f207718P;
            if (aVar != null) {
                aVar.mo106728c();
                Log.m105920e("MicroMsg.WalletBalanceFetchUI", "add new card");
                WalletBalanceFetchUI.this.mo98841P7();
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[4];
                objArr[0] = WalletBalanceFetchUI.this.f207715L;
                objArr[1] = 9;
                Bankcard bankcard = WalletBalanceFetchUI.this.f207728e;
                String str = "";
                objArr[2] = bankcard != null ? bankcard.field_bankcardType : str;
                if (bankcard != null) {
                    str = bankcard.field_bindSerial;
                }
                objArr[3] = str;
                nVar.mo160131h(16398, objArr);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$i */
    public class C71678i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C11184p0 f207772d;

        public C71678i(C11184p0 p0Var) {
            this.f207772d = p0Var;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            this.f207772d.onMMMenuItemSelected(menuItem, i);
            WalletBalanceFetchUI.this.f207718P.mo106728c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$j */
    public class C71679j implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ List f207774a;

        public C71679j(List list) {
            this.f207774a = list;
        }

        /* renamed from: a */
        public void mo2001a() {
            int i;
            List list = this.f207774a;
            String str = "";
            if (list == null || (i = WalletBalanceFetchUI.this.f207718P.f223933m) < 0 || i >= list.size()) {
                Log.m105924i("MicroMsg.WalletBalanceFetchUI", "add new card");
                WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
                int i2 = WalletBalanceFetchUI.f207703Y;
                walletBalanceFetchUI.mo98841P7();
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[4];
                objArr[0] = WalletBalanceFetchUI.this.f207715L;
                objArr[1] = 9;
                Bankcard bankcard = WalletBalanceFetchUI.this.f207728e;
                objArr[2] = bankcard != null ? bankcard.field_bankcardType : str;
                if (bankcard != null) {
                    str = bankcard.field_bindSerial;
                }
                objArr[3] = str;
                nVar.mo160131h(16398, objArr);
            } else {
                WalletBalanceFetchUI walletBalanceFetchUI2 = WalletBalanceFetchUI.this;
                walletBalanceFetchUI2.f207728e = (Bankcard) this.f207774a.get(walletBalanceFetchUI2.f207718P.f223933m);
                WalletBalanceFetchUI.this.mo98845T7();
                Log.m105925i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", WalletBalanceFetchUI.this.f207728e.field_desc);
                C115669n nVar2 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[4];
                objArr2[0] = WalletBalanceFetchUI.this.f207715L;
                objArr2[1] = 2;
                Bankcard bankcard2 = WalletBalanceFetchUI.this.f207728e;
                objArr2[2] = bankcard2 != null ? bankcard2.field_bankcardType : str;
                if (bankcard2 != null) {
                    str = bankcard2.field_bindSerial;
                }
                objArr2[3] = str;
                nVar2.mo160131h(16398, objArr2);
            }
            WalletBalanceFetchUI walletBalanceFetchUI3 = WalletBalanceFetchUI.this;
            int i3 = WalletBalanceFetchUI.f207703Y;
            walletBalanceFetchUI3.mo98846U7();
            WalletBalanceFetchUI.this.getClass();
            WalletBalanceFetchUI.this.f207718P.mo106728c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$k */
    public class C71680k extends C7089c0 {
        public C71680k() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C76492a aVar = WalletBalanceFetchUI.this.f207718P;
            if (aVar != null) {
                aVar.mo106728c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$l */
    public class C71681l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f207777d;

        public C71681l(WalletBalanceFetchUI walletBalanceFetchUI, LinearLayout linearLayout) {
            this.f207777d = linearLayout;
        }

        public void run() {
            LinearLayout linearLayout = this.f207777d;
            if (linearLayout != null) {
                linearLayout.sendAccessibilityEvent(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$m */
    public class C71682m implements TextView.OnEditorActionListener {
        public C71682m() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            String str2;
            if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
                walletBalanceFetchUI.f207729f = Util.getDouble(walletBalanceFetchUI.f207732i.getText(), 0.0d);
                Bankcard bankcard = walletBalanceFetchUI.f207728e;
                String str3 = "";
                if (bankcard != null) {
                    String str4 = bankcard.field_bankcardType;
                    str = bankcard.field_bindSerial;
                    str2 = str4;
                } else {
                    C67185g a = C67185g.m79463a();
                    if (a.mo91288b()) {
                        C76879j.m92748s(walletBalanceFetchUI, a.f192891b, walletBalanceFetchUI.getString(C0966R.string.a3h));
                    } else {
                        str2 = str3;
                        str = str2;
                    }
                }
                Bankcard bankcard2 = walletBalanceFetchUI.f207728e;
                if (bankcard2 != null && !Util.isNullOrNil(bankcard2.field_forbidWord)) {
                    C76912y0.makeText((Context) walletBalanceFetchUI.getContext(), (CharSequence) walletBalanceFetchUI.f207728e.field_forbidWord, 0).show();
                } else if (walletBalanceFetchUI.f207729f <= 0.0d || !walletBalanceFetchUI.f207732i.mo105094l()) {
                    C76912y0.makeText((Context) walletBalanceFetchUI.getContext(), (int) C0966R.string.kmc, 0).show();
                } else if (walletBalanceFetchUI.f207729f > C79029b0.vx0().wx0().f192955h.f209415j2) {
                    C76912y0.makeText((Context) walletBalanceFetchUI.getContext(), (int) C0966R.string.kl6, 0).show();
                } else if (walletBalanceFetchUI.f207729f > C79029b0.vx0().wx0().f192955h.f209417l2) {
                    C76912y0.makeText((Context) walletBalanceFetchUI.getContext(), (int) C0966R.string.kl7, 0).show();
                } else {
                    C79144b.m95773a().getClass();
                    C79144b.m95773a().getClass();
                    walletBalanceFetchUI.mo98842Q7(21, walletBalanceFetchUI.f207729f, "1", str2, str, walletBalanceFetchUI.f207712I);
                    walletBalanceFetchUI.hideWcKb();
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[4];
                objArr[0] = walletBalanceFetchUI.f207715L;
                objArr[1] = 7;
                Bankcard bankcard3 = walletBalanceFetchUI.f207728e;
                objArr[2] = bankcard3 != null ? bankcard3.field_bankcardType : str3;
                if (bankcard3 != null) {
                    str3 = bankcard3.field_bindSerial;
                }
                objArr[3] = str3;
                nVar.mo160131h(16398, objArr);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$n */
    public class C71683n extends C7089c0 {
        public C71683n() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
            int i = WalletBalanceFetchUI.f207703Y;
            walletBalanceFetchUI.getClass();
            Log.m105918d("MicroMsg.WalletBalanceFetchUI", "click showFetchLimitInfo");
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = walletBalanceFetchUI.f207715L;
            objArr[1] = 15;
            Bankcard bankcard = walletBalanceFetchUI.f207728e;
            String str = "";
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : str;
            if (bankcard != null) {
                str = bankcard.field_bindSerial;
            }
            objArr[3] = str;
            nVar.mo160131h(16398, objArr);
            walletBalanceFetchUI.mWcKeyboard.mo104753p();
            if (Util.isNullOrNil(walletBalanceFetchUI.f207728e.f209401N2)) {
                Log.m105918d("MicroMsg.WalletBalanceFetchUI", "fetch_limit_popup_title in null");
                return;
            }
            C101218e0 e0Var = new C101218e0(walletBalanceFetchUI.getContext(), 2, 3);
            e0Var.mo140677w(walletBalanceFetchUI.getString(C0966R.string.kke));
            e0Var.f296375F = new C71848n(walletBalanceFetchUI, e0Var);
            View inflate = View.inflate(walletBalanceFetchUI.getContext(), C0966R.C0971layout.b8u, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.et6);
            textView.setText(walletBalanceFetchUI.f207728e.f209401N2);
            textView.setTextSize(1, C76577a.m92165p(walletBalanceFetchUI) * 17.0f);
            inflate.setPadding(0, C76577a.m92151b(walletBalanceFetchUI, 40), 0, C76577a.m92151b(walletBalanceFetchUI, 16));
            e0Var.mo140673s(inflate);
            LinearLayout linearLayout = new LinearLayout(walletBalanceFetchUI);
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = (LinearLayout) View.inflate(walletBalanceFetchUI, C0966R.C0971layout.b8s, (ViewGroup) null);
            ((TextView) linearLayout2.findViewById(C0966R.C0970id.f358385et3)).setVisibility(8);
            ((TextView) linearLayout2.findViewById(C0966R.C0970id.f358384et2)).setText(walletBalanceFetchUI.f207728e.f209402O2);
            linearLayout.addView(linearLayout2);
            ArrayList<String> arrayList = walletBalanceFetchUI.f207728e.f209403P2;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i2 = 0; i2 < walletBalanceFetchUI.f207728e.f209403P2.size(); i2++) {
                    LinearLayout linearLayout3 = (LinearLayout) View.inflate(walletBalanceFetchUI, C0966R.C0971layout.b8s, (ViewGroup) null);
                    ((TextView) linearLayout3.findViewById(C0966R.C0970id.f358384et2)).setText(walletBalanceFetchUI.f207728e.f209403P2.get(i2));
                    linearLayout.addView(linearLayout3);
                }
            }
            e0Var.mo140663j(linearLayout);
            e0Var.mo140655A();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$o */
    public class C71684o extends C7089c0 {
        public C71684o() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            String str;
            String str2;
            WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
            int i = WalletBalanceFetchUI.f207703Y;
            walletBalanceFetchUI.getClass();
            Log.m105918d("MicroMsg.WalletBalanceFetchUI", "click showRecommendBanks ation : " + walletBalanceFetchUI.f207728e.f209406S2);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = walletBalanceFetchUI.f207715L;
            objArr[1] = 13;
            Bankcard bankcard = walletBalanceFetchUI.f207728e;
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : "";
            objArr[3] = bankcard != null ? bankcard.field_bindSerial : "";
            nVar.mo160131h(16398, objArr);
            walletBalanceFetchUI.mWcKeyboard.mo104753p();
            Bankcard bankcard2 = walletBalanceFetchUI.f207728e;
            int i2 = bankcard2.f209406S2;
            if (i2 == 1) {
                ArrayList<String> arrayList = bankcard2.f209408U2;
                if (arrayList == null || arrayList.size() <= 0) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "fetch_limit_recommend_bind_serial is null or 0");
                    return;
                }
                Bankcard e = C79029b0.vx0().wx0().mo91323e(arrayList.get(0));
                if (e == null) {
                    Log.m105921e("MicroMsg.WalletBalanceFetchUI", "find bankcard of %s is null", arrayList.get(0));
                    return;
                }
                walletBalanceFetchUI.f207728e = e;
                walletBalanceFetchUI.mo98845T7();
                walletBalanceFetchUI.mo98846U7();
                C76912y0.m92769h(walletBalanceFetchUI, C76577a.m92166q(walletBalanceFetchUI.getContext(), C0966R.string.m0f), C0966R.raw.icons_filled_done);
            } else if (i2 == 2) {
                ArrayList<Bankcard> j = C79029b0.vx0().wx0().mo91328j();
                C67176b bVar = C79029b0.vx0().wx0().f192958k;
                if (bVar != null) {
                    String str3 = bVar.f192856i;
                    str2 = bVar.f192855h;
                    str = str3;
                } else {
                    str2 = "";
                    str = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                if (j == null) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "debit is null");
                } else {
                    Iterator<Bankcard> it = j.iterator();
                    while (it.hasNext()) {
                        Bankcard next = it.next();
                        Iterator<String> it4 = walletBalanceFetchUI.f207728e.f209408U2.iterator();
                        while (it4.hasNext()) {
                            String next2 = it4.next();
                            if (!Util.isNullOrNil(next2) && next2.equals(next.field_bindSerial)) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
                walletBalanceFetchUI.mo98839N7(walletBalanceFetchUI.getContext(), arrayList2, walletBalanceFetchUI.f207728e, str2, str, new C71849o(walletBalanceFetchUI, arrayList2), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$p */
    public class C71685p implements View.OnClickListener {
        public C71685p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBalanceFetchUI.m84141H7(WalletBalanceFetchUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$q */
    public class C71686q implements TextWatcher {
        public C71686q() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int lastIndexOf = obj.lastIndexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 3) {
                WalletFormView.m90177f(WalletBalanceFetchUI.this.f207732i.getContentEt(), obj, indexOf + 3, length);
            } else if (lastIndexOf != indexOf) {
                WalletFormView.m90177f(WalletBalanceFetchUI.this.f207732i.getContentEt(), obj, lastIndexOf, length);
            }
            WalletBalanceFetchUI.this.f207729f = Util.getDouble(editable.toString(), 0.0d);
            WalletBalanceFetchUI.this.getClass();
            WalletBalanceFetchUI.this.mo98844S7();
            WalletBalanceFetchUI.this.mo98843R7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$r */
    public class C71687r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f207783d;

        public C71687r(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f207783d = walletGetBulletinEvent;
        }

        public void run() {
            WalletGetBulletinEvent.C28848b bVar = this.f207783d.f79043e;
            if (bVar.f79049d == 2) {
                WalletBalanceFetchUI.this.f207741u.setBannerData(bVar.f79050e);
            } else if (!Util.isNullOrNil(bVar.f79046a)) {
                TextView textView = WalletBalanceFetchUI.this.f207735o;
                WalletGetBulletinEvent.C28848b bVar2 = this.f207783d.f79043e;
                C75228t.m90247g0((View) null, textView, bVar2.f79046a, bVar2.f79047b, bVar2.f79048c);
            } else {
                Log.m105924i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$s */
    public class C71688s implements Runnable {
        public C71688s() {
        }

        public void run() {
            WalletBalanceFetchUI walletBalanceFetchUI = WalletBalanceFetchUI.this;
            if (walletBalanceFetchUI.f207720R == 2 && walletBalanceFetchUI.isHandleAutoShowNormalStWcKb()) {
                WalletBalanceFetchUI.this.showNormalStWcKb();
            }
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.fls);
    }

    public WalletBalanceFetchUI() {
        C76577a.m92151b(MMApplicationContext.getContext(), 270);
    }

    /* renamed from: H7 */
    public static void m84141H7(WalletBalanceFetchUI walletBalanceFetchUI) {
        String str;
        String str2;
        int i;
        Bankcard bankcard = walletBalanceFetchUI.f207728e;
        double d = (bankcard == null || (i = walletBalanceFetchUI.f207708E) == 0 || (i == 1 && bankcard.field_fetch_charge_rate <= 0.0d) || ((i == 1 && bankcard.field_fetch_charge_rate > 0.0d && walletBalanceFetchUI.f207709F == 0) || walletBalanceFetchUI.f207711H >= C79029b0.vx0().wx0().f192955h.f209417l2)) ? C79029b0.vx0().wx0().f192955h.f209417l2 : walletBalanceFetchUI.f207728e != null ? C79029b0.vx0().wx0().f192955h.f209417l2 - walletBalanceFetchUI.f207728e.field_full_fetch_charge_fee : C79029b0.vx0().wx0().f192955h.f209417l2;
        if (walletBalanceFetchUI.f207710G == 1) {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "do fetch direct to pay!");
            walletBalanceFetchUI.f207712I = 1;
            Bankcard bankcard2 = walletBalanceFetchUI.f207728e;
            if (bankcard2 == null || Util.isNullOrNil(bankcard2.field_forbidWord)) {
                Bankcard bankcard3 = walletBalanceFetchUI.f207728e;
                if (bankcard3 != null) {
                    String str3 = bankcard3.field_bankcardType;
                    str = bankcard3.field_bindSerial;
                    str2 = str3;
                } else {
                    str2 = "";
                    str = str2;
                }
                C79144b.m95773a().getClass();
                C79144b.m95773a().getClass();
                walletBalanceFetchUI.mo98842Q7(21, walletBalanceFetchUI.f207729f, "1", str2, str, walletBalanceFetchUI.f207712I);
                return;
            }
            C76912y0.makeText((Context) walletBalanceFetchUI.getContext(), (CharSequence) walletBalanceFetchUI.f207728e.field_forbidWord, 0).show();
            return;
        }
        walletBalanceFetchUI.f207732i.setText(walletBalanceFetchUI.f207713J.format(d));
        walletBalanceFetchUI.mo98844S7();
        walletBalanceFetchUI.f207712I = 1;
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "is_full_fetch_direct is 0!");
    }

    /* renamed from: I7 */
    public final double mo98834I7(double d) {
        C67205s0 wx02 = C79029b0.vx0().wx0();
        return Math.max(C75228t.m90230W("" + (d - wx02.f192958k.f192853f), this.f207728e.field_fetch_charge_rate + "", 2, RoundingMode.HALF_UP).doubleValue(), this.f207711H);
    }

    /* renamed from: J7 */
    public final void mo98835J7(C78342e0 e0Var) {
        fetchData();
        mo98846U7();
        if (this.f207708E != 0) {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.f207708E);
            return;
        }
        C86709a0.m107528h();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_FETCH_CHARGE_TIP_DIALOG_BOOLEAN_SYNC;
        boolean booleanValue = ((Boolean) i.mo119685f(aVar, Boolean.FALSE)).booleanValue();
        C67176b bVar = C79029b0.vx0().wx0().f192958k;
        if (bVar != null && !booleanValue) {
            C76879j.m92708B(this, getString(C0966R.string.l4_, new Object[]{C75228t.m90256l(bVar.f192853f)}), getString(C0966R.string.l4a), getString(C0966R.string.ktq), getString(C0966R.string.l4b), new C5726i(this), new C5727j(this), C0966R.color.akw);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
        }
    }

    /* renamed from: K7 */
    public final void mo98836K7(Intent intent) {
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("intent_bind_end", false)) {
            z = true;
        }
        this.f207714K = z;
        if (z) {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
            PayInfo payInfo = (PayInfo) getInput().get("key_pay_info");
            if (payInfo == null) {
                payInfo = new PayInfo();
                payInfo.f212592j = this.f207730g;
                payInfo.f212587e = 21;
            }
            doSceneForceProgress(new C78338b0(payInfo.f212592j, 4));
        }
    }

    /* renamed from: L7 */
    public final void mo98837L7(C78127d dVar) {
        if (!Util.isNullOrNil(this.f207730g)) {
            PayInfo payInfo = new PayInfo();
            payInfo.f212592j = this.f207730g;
            payInfo.f212587e = 21;
            getInput().putParcelable("key_pay_info", payInfo);
            Orders orders = new Orders();
            double d = dVar.f228941h;
            double d2 = dVar.f228940g;
            orders.f209566h = d - d2;
            orders.f209570o = d - d2;
            ((ArrayList) orders.f209542M).add(new Orders.Commodity());
            orders.f209569n = dVar.f228940g;
            getInput().putString("key_fetch_cashier_encode_str", dVar.f228952v);
            getInput().putParcelable("key_orders", orders);
            getInput().putParcelable("key_bankcard", this.f207728e);
            getInput().putString("key_fetch_cashier_desc", dVar.f228949s);
            getInput().putString("key_report_session_id", this.f207715L);
            if (getProcess() == null) {
                C79143a.m95771j(this, C77855b.class, getInput(), (C79148e.C79149a) null);
                return;
            }
            getNetController().mo91271d(getInput());
            return;
        }
        Log.m105928w("MicroMsg.WalletBalanceFetchUI", "hy: req key is null. abandon");
    }

    /* renamed from: M7 */
    public final void mo98838M7() {
        this.f207723U = false;
        this.f207724V = false;
    }

    /* renamed from: N7 */
    public void mo98839N7(Context context, List<Bankcard> list, Bankcard bankcard, String str, String str2, C11184p0 p0Var, boolean z) {
        int i;
        Context context2 = context;
        List<Bankcard> list2 = list;
        Bankcard bankcard2 = bankcard;
        String str3 = str;
        String str4 = str2;
        C76492a aVar = this.f207718P;
        if (aVar == null || !aVar.mo106726a()) {
            this.f207725W.clear();
            C76492a aVar2 = new C76492a(context2);
            this.f207718P = aVar2;
            aVar2.f223923c = new C71673g(list2, context2);
            C76874e0 e0Var = new C76874e0(this);
            if (z) {
                e0Var.mo107156p(0, getString(C0966R.string.kl_), (CharSequence) null, getResources().getDrawable(C0966R.raw.icons_outlined_pay_cards), getResources().getColor(C0966R.color.FG_2), false);
            }
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false);
            if (wf) {
                e0Var.mo107160r(1, "", true);
            }
            C76492a aVar3 = this.f207718P;
            C71677h hVar = new C71677h();
            aVar3.f223927g = e0Var;
            aVar3.f223925e = hVar;
            if (wf) {
                aVar3.f223924d = new C71678i(p0Var);
            } else {
                aVar3.f223921a.f296375F = new C71679j(list2);
            }
            View inflate = View.inflate(this, C0966R.C0971layout.b98, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gbk);
            if (!Util.isNullOrNil(str)) {
                textView.setText(str3);
            }
            if (!Util.isNullOrNil(str2)) {
                ((TextView) inflate.findViewById(C0966R.C0970id.gbj)).setText(str4);
            }
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            View findViewById = inflate.findViewById(C0966R.C0970id.c4p);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.findViewById(C0966R.C0970id.gal).setOnClickListener(new C71680k());
            inflate.findViewById(C0966R.C0970id.gal).setContentDescription(getString(C0966R.string.kk5));
            C76492a aVar5 = this.f207718P;
            aVar5.f223921a.mo140673s(inflate);
            aVar5.f223930j = inflate;
            if (list2 != null) {
                i = list.size();
                if (bankcard2 != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (list2.get(i2).field_bindSerial.equals(bankcard2.field_bindSerial)) {
                            i = i2;
                        }
                    }
                }
            } else {
                i = 0;
            }
            C76492a aVar6 = this.f207718P;
            aVar6.f223932l = true;
            aVar6.f223933m = i;
            if (wf) {
                aVar6.f223931k = false;
            } else {
                aVar6.f223931k = true;
            }
            aVar6.f223921a.mo140677w(getResources().getString(C0966R.string.kse));
            this.f207718P.mo106729d();
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.g9o);
            linearLayout.setFocusable(true);
            linearLayout.setContentDescription(str3 + str4);
            MMHandlerThread.postToMainThreadDelayed(new C71681l(this, linearLayout), 500);
            return;
        }
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
    }

    /* renamed from: O7 */
    public final boolean mo98840O7(C78127d dVar) {
        boolean z;
        LinkedList<C67176b.C67178b> linkedList;
        LinkedList<C67176b.C67178b> linkedList2;
        boolean z2 = true;
        if (this.f207723U || !dVar.f228938e) {
            z = false;
        } else {
            this.f207723U = true;
            C76879j.m92717K(this, false, dVar.f228939f, "", getString(C0966R.string.a18), getString(C0966R.string.f7926wf), new C71706d(this, dVar), new C71708e(this));
            z = true;
        }
        if (!z) {
            z = false;
        }
        if (!z) {
            z = false;
        }
        if (z || this.f207724V) {
            return z;
        }
        C67176b bVar = dVar.f228942i;
        if (bVar == null || (TextUtils.isEmpty(bVar.f192848a) && ((linkedList2 = bVar.f192849b) == null || linkedList2.size() <= 0))) {
            z2 = false;
        } else {
            this.f207724V = true;
            C71710f fVar = new C71710f(this);
            C71712g gVar = new C71712g(this);
            if (!isFinishing()) {
                if (!TextUtils.isEmpty(bVar.f192848a) || ((linkedList = bVar.f192849b) != null && !linkedList.isEmpty())) {
                    C77389a aVar = new C77389a();
                    aVar.f225668y = false;
                    aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.f7926wf);
                    aVar.f225621D = gVar;
                    aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.kkr);
                    aVar.f225620C = fVar;
                    View inflate = View.inflate(this, C0966R.C0971layout.ceq, (ViewGroup) null);
                    LinkedList<C67176b.C67178b> linkedList3 = bVar.f192849b;
                    if (linkedList3 == null || linkedList3.isEmpty()) {
                        Log.m105920e("MicroMsg.WalletDialogHelper", "fetch itemsList is empty");
                    } else {
                        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f357785br0);
                        linearLayout.removeAllViews();
                        int i = 0;
                        while (i < bVar.f192849b.size() && i < bVar.f192849b.size()) {
                            View inflate2 = View.inflate(this, C0966R.C0971layout.cep, (ViewGroup) null);
                            ((TextView) inflate2.findViewById(C0966R.C0970id.knx)).setText(bVar.f192849b.get(i).f192859a);
                            ((TextView) inflate2.findViewById(C0966R.C0970id.k_c)).setText(bVar.f192849b.get(i).f192860b);
                            linearLayout.addView(inflate2, i);
                            i++;
                        }
                    }
                    ((TextView) inflate.findViewById(C0966R.C0970id.knx)).setText(bVar.f192848a);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kmx);
                    textView.setVisibility(0);
                    textView.setText(getString(C0966R.string.kks));
                    aVar.f225627J = inflate;
                    C77398g gVar2 = new C77398g(this, C0966R.style.a66);
                    gVar2.mo107525e(aVar);
                    gVar2.show();
                    C76879j.m92730a(this, gVar2);
                } else {
                    Log.m105928w("MicroMsg.WalletDialogHelper", "show showBalanceFetchAlert alert fail");
                }
            }
        }
        return z2;
    }

    /* renamed from: P7 */
    public final void mo98841P7() {
        C67185g a = C67185g.m79463a();
        if (a.mo91288b()) {
            C76879j.m92748s(this, a.f192891b, getString(C0966R.string.a3h));
            return;
        }
        Bundle bundle = new Bundle();
        PayInfo payInfo = (PayInfo) getInput().get("key_pay_info");
        if (payInfo == null) {
            payInfo = new PayInfo();
            payInfo.f212592j = this.f207730g;
            payInfo.f212587e = 21;
        }
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putInt("key_scene", 21);
        boolean z = false;
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 0);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putInt("from_bind_ui", 2);
        bundle.putBoolean("key_bind_show_change_card", true);
        if (C79144b.m95773a().mo109087b()) {
            this.f207726X.alive();
            Log.m105918d("MicroMsg.WalletBalanceFetchUI", "startKindaBindCard:true");
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(this, bundle);
            z = true;
        } else {
            Log.m105918d("MicroMsg.WalletBalanceFetchUI", "startKindaBindCard:false");
        }
        if (!z) {
            C79143a.m95771j(this, C77854a.class, bundle, (C79148e.C79149a) null);
        }
    }

    /* renamed from: Q7 */
    public final void mo98842Q7(int i, double d, String str, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("payScene", i);
        bundle.putString("totalFee", C75228t.m90230W("" + d, "100", 0, RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str2);
        bundle.putString("bindSerial", str3);
        bundle.putString("operation", String.valueOf(i2));
        bundle.putString("reportSessionId", this.f207715L);
        Log.m105925i("MicroMsg.WalletBalanceFetchUI", "startWalletBalanceFetchUseCase totalFee：%s reportSessionId %s", C75228t.m90230W("" + d, "100", 0, RoundingMode.HALF_UP).toString(), this.f207715L);
        ((C76324c) C86312j.m106911c(C76324c.class)).startWalletBalanceFetchUseCase(this, bundle);
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        View view = this.f207707D;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.bottomMargin = (int) f;
            Log.m105919d("MicroMsg.WalletBalanceFetchUI", "onUpdateWcPayKeyboardHeight() height: %s rootView.height: %s", Float.valueOf(f), Integer.valueOf(layoutParams.height));
            this.f207707D.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: R7 */
    public final void mo98843R7() {
        if (Util.getDouble(this.f207732i.getText(), 0.0d) <= 0.0d || !this.f207732i.mo105094l()) {
            this.mWcKeyboard.mo104738c(false);
        } else {
            this.mWcKeyboard.mo104738c(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0265  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98844S7() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r0.f207732i
            java.lang.String r1 = r1.getText()
            r2 = 0
            double r4 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r2)
            r0.f207729f = r4
            y43.b0 r1 = y43.C79029b0.vx0()
            b63.s0 r1 = r1.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r1.f192955h
            double r6 = r1.f209417l2
            r1 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x003e
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r0.f207728e
            if (r4 == 0) goto L_0x003e
            double r4 = r0.f207729f
            y43.b0 r6 = y43.C79029b0.vx0()
            b63.s0 r6 = r6.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r6 = r6.f192955h
            double r6 = r6.f209417l2
            com.tencent.mm.plugin.wallet_core.model.Bankcard r8 = r0.f207728e
            double r8 = r8.field_full_fetch_charge_fee
            double r6 = r6 - r8
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x003e
            r0.f207712I = r1
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            double r5 = r0.f207729f
            y43.b0 r7 = y43.C79029b0.vx0()
            b63.s0 r7 = r7.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = r7.f192955h
            double r7 = r7.f209415j2
            r9 = 1
            r11 = 8
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0079
            android.widget.TextView r2 = r0.f207737q
            r2.setVisibility(r11)
            android.widget.TextView r2 = r0.f207736p
            android.content.res.Resources r3 = r19.getResources()
            r5 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            r2 = 2131838805(0x7f114755, float:1.9310844E38)
            java.lang.String r2 = r0.getString(r2)
            r4.append(r2)
            goto L_0x01fd
        L_0x0079:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f207728e
            java.lang.String r6 = "，"
            r7 = 2131838796(0x7f11474c, float:1.9310825E38)
            java.lang.String r8 = "hy: wording's missing. use former routine"
            java.lang.String r12 = "MicroMsg.WalletBalanceFetchUI"
            java.lang.String r13 = "CNY"
            if (r5 == 0) goto L_0x0200
            int r15 = r0.f207708E
            if (r15 == 0) goto L_0x0200
            if (r15 != r9) goto L_0x0095
            double r10 = r5.field_fetch_charge_rate
            int r17 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r17 <= 0) goto L_0x0200
        L_0x0095:
            if (r15 != r9) goto L_0x00a1
            double r10 = r5.field_fetch_charge_rate
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a1
            int r5 = r0.f207709F
            if (r5 == 0) goto L_0x0200
        L_0x00a1:
            double r10 = r0.f207711H
            y43.b0 r5 = y43.C79029b0.vx0()
            b63.s0 r5 = r5.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r5.f192955h
            double r14 = r5.f209417l2
            int r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x00b5
            goto L_0x0200
        L_0x00b5:
            int r5 = r0.f207708E
            if (r5 != r9) goto L_0x0121
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f207728e
            double r10 = r5.field_fetch_charge_rate
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0121
            int r5 = r0.f207709F
            if (r5 != r9) goto L_0x0121
            double r10 = r0.f207729f
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d3
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r0.f207732i
            boolean r5 = r5.mo105094l()
            if (r5 != 0) goto L_0x0121
        L_0x00d3:
            android.widget.TextView r2 = r0.f207736p
            int r3 = r0.f207717N
            r2.setTextColor(r3)
            y43.b0 r2 = y43.C79029b0.vx0()
            b63.s0 r2 = r2.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.f192955h
            java.lang.String r2 = r2.f209422q2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x00f0
            r4.append(r2)
            goto L_0x010e
        L_0x00f0:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            y43.b0 r2 = y43.C79029b0.vx0()
            b63.s0 r2 = r2.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.f192955h
            double r2 = r2.f209417l2
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r2, r13)
            r5[r1] = r2
            java.lang.String r2 = r0.getString(r7, r5)
            r4.append(r2)
        L_0x010e:
            r4.append(r6)
            int r2 = r4.length()
            r3 = 2131838784(0x7f114740, float:1.9310801E38)
            java.lang.String r3 = r0.getString(r3)
            r4.append(r3)
            goto L_0x024c
        L_0x0121:
            int r5 = r0.f207708E
            if (r5 != r9) goto L_0x01fd
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f207728e
            double r5 = r5.field_fetch_charge_rate
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x01fd
            int r5 = r0.f207709F
            if (r5 != r9) goto L_0x01fd
            android.widget.TextView r5 = r0.f207737q
            r6 = 8
            r5.setVisibility(r6)
            android.widget.TextView r5 = r0.f207736p
            int r6 = r0.f207717N
            r5.setTextColor(r6)
            double r5 = r0.f207729f
            y43.b0 r7 = y43.C79029b0.vx0()
            b63.s0 r7 = r7.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = r7.f192955h
            double r7 = r7.f209417l2
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r0.f207728e
            double r11 = r10.field_full_fetch_charge_fee
            double r7 = r7 - r11
            java.lang.String r14 = "%"
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            r15 = 2
            int r18 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r18 != 0) goto L_0x01ac
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ac
            java.lang.String r2 = r10.f209393F2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x017e
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r0.f207728e
            java.lang.String r3 = r2.f209393F2
            java.lang.Object[] r5 = new java.lang.Object[r9]
            double r6 = r2.field_full_fetch_charge_fee
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r13)
            r5[r1] = r2
            java.lang.String r2 = java.lang.String.format(r3, r5)
            r4.append(r2)
            goto L_0x01fd
        L_0x017e:
            java.lang.Object[] r2 = new java.lang.Object[r15]
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r0.f207728e
            double r5 = r3.field_full_fetch_charge_fee
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r13)
            r2[r1] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f207728e
            double r5 = r5.field_fetch_charge_rate
            double r5 = r5 * r16
            r3.append(r5)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r2[r9] = r3
            r3 = 2131838778(0x7f11473a, float:1.9310789E38)
            java.lang.String r2 = r0.getString(r3, r2)
            r4.append(r2)
            goto L_0x01fd
        L_0x01ac:
            java.lang.String r2 = r10.f209393F2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01ce
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r0.f207728e
            java.lang.String r2 = r2.f209393F2
            java.lang.Object[] r3 = new java.lang.Object[r9]
            double r5 = r0.f207729f
            double r5 = r0.mo98834I7(r5)
            java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r13)
            r3[r1] = r5
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r4.append(r2)
            goto L_0x01fd
        L_0x01ce:
            java.lang.Object[] r2 = new java.lang.Object[r15]
            double r5 = r0.f207729f
            double r5 = r0.mo98834I7(r5)
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r13)
            r2[r1] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f207728e
            double r5 = r5.field_fetch_charge_rate
            double r5 = r5 * r16
            r3.append(r5)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r2[r9] = r3
            r3 = 2131838778(0x7f11473a, float:1.9310789E38)
            java.lang.String r2 = r0.getString(r3, r2)
            r4.append(r2)
        L_0x01fd:
            r2 = -1
            r12 = -1
            goto L_0x024e
        L_0x0200:
            android.widget.TextView r2 = r0.f207736p
            int r3 = r0.f207717N
            r2.setTextColor(r3)
            y43.b0 r2 = y43.C79029b0.vx0()
            b63.s0 r2 = r2.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.f192955h
            java.lang.String r2 = r2.f209422q2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x021d
            r4.append(r2)
            goto L_0x023b
        L_0x021d:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            y43.b0 r2 = y43.C79029b0.vx0()
            b63.s0 r2 = r2.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.f192955h
            double r2 = r2.f209417l2
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r2, r13)
            r5[r1] = r2
            java.lang.String r2 = r0.getString(r7, r5)
            r4.append(r2)
        L_0x023b:
            r4.append(r6)
            int r2 = r4.length()
            r3 = 2131838784(0x7f114740, float:1.9310801E38)
            java.lang.String r3 = r0.getString(r3)
            r4.append(r3)
        L_0x024c:
            r12 = r2
            r2 = -1
        L_0x024e:
            if (r12 != r2) goto L_0x0265
            android.widget.TextView r2 = r0.f207736p
            r2.setClickable(r1)
            android.widget.TextView r1 = r0.f207736p
            r2 = 0
            r1.setOnTouchListener(r2)
            android.widget.TextView r1 = r0.f207736p
            java.lang.String r2 = r4.toString()
            r1.setText(r2)
            goto L_0x0280
        L_0x0265:
            android.widget.TextView r10 = r0.f207736p
            java.lang.String r11 = r4.toString()
            int r13 = r4.length()
            com.tencent.mm.wallet_core.ui.q r14 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$c r1 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI$c
            r1.<init>()
            r14.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r1, (boolean) r9)
            androidx.appcompat.app.AppCompatActivity r15 = r19.getContext()
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r10, r11, r12, r13, r14, r15)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchUI.mo98844S7():void");
    }

    /* renamed from: T7 */
    public final void mo98845T7() {
        if (this.f207728e != null) {
            double i = C75228t.m90250i(this.f207728e.f209394G2 + "", "100", 2, RoundingMode.HALF_UP);
            this.f207711H = i;
            Log.m105925i("MicroMsg.WalletBalanceFetchUI", "min charge fee: %s", Double.valueOf(i));
        }
    }

    /* renamed from: U7 */
    public final void mo98846U7() {
        C67176b.C67177a aVar;
        C67176b.C67179c[] cVarArr;
        Class cls = C102720b.class;
        if (this.f207732i.getTitleTv() != null) {
            this.f207732i.getTitleTv().setText(String.format(getString(C0966R.string.i1s), new Object[]{C45121z0.m49962b()}));
        } else {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
        }
        ImageView imageView = (ImageView) this.f207733j.findViewById(C0966R.C0970id.f357503a72);
        Bankcard bankcard = this.f207728e;
        String str = "";
        if (bankcard != null) {
            C67183e c = C75556b.m90593c(this, bankcard.field_bankcardType, bankcard.mo99394u2());
            String str2 = c != null ? c.f192875a : str;
            imageView.setImageBitmap((Bitmap) null);
            if (this.f207728e.mo99388n2()) {
                imageView.setBackgroundResource(C0966R.C0969drawable.cek);
            } else {
                Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(str2));
                ((C102720b) C86312j.m106911c(cls)).Lu0(new C71667b(imageView));
                if (N6 != null) {
                    imageView.setImageBitmap(BitmapUtil.extractThumbNail(N6, getResources().getDimensionPixelOffset(C0966R.dimen.atf), getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false));
                }
            }
            Bankcard bankcard2 = this.f207728e;
            ((TextView) this.f207733j.findViewById(C0966R.C0970id.f357494a51)).setText(getString(C0966R.string.km6, new Object[]{bankcard2.field_bankName, bankcard2.field_bankcardTail}));
            ((TextView) this.f207733j.findViewById(C0966R.C0970id.f357494a51)).setVisibility(0);
            if (!Util.isNullOrNil(this.f207728e.field_fetchArriveTimeWording)) {
                ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setText(this.f207728e.field_fetchArriveTimeWording);
                ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setVisibility(0);
                if (this.f207728e.field_is_hightlight_pre_arrive_time_wording == 1) {
                    ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setTextColor(getResources().getColor(C0966R.color.f2960ag));
                } else {
                    ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setTextColor(getResources().getColor(C0966R.color.f3563xt));
                }
            }
        } else {
            imageView.setImageBitmap((Bitmap) null);
            ((TextView) this.f207733j.findViewById(C0966R.C0970id.f357494a51)).setText(this.f207731h);
            ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setText(str);
            ((TextView) this.f207733j.findViewById(C0966R.C0970id.ew6)).setVisibility(8);
            ((ImageView) this.f207733j.findViewById(C0966R.C0970id.f357503a72)).setImageBitmap((Bitmap) null);
        }
        Util.isNullOrNil(C79029b0.vx0().wx0().f192955h.f209421p2);
        this.f207739s.setVisibility(0);
        this.f207740t.setVisibility(8);
        mo98844S7();
        Bankcard bankcard3 = C79029b0.vx0().wx0().f192955h;
        if (this.f207728e == null || Util.isNullOrNil(bankcard3.field_prompt_info_prompt_text)) {
            this.f207738r.setText(str);
            this.f207738r.setVisibility(8);
            int color = getContext().getResources().getColor(C0966R.color.FG_1);
            this.f207717N = color;
            this.f207736p.setTextColor(color);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bankcard3.field_prompt_info_prompt_text);
            if (!Util.isNullOrNil(bankcard3.field_prompt_info_jump_text)) {
                spannableStringBuilder.append(bankcard3.field_prompt_info_jump_text);
            }
            spannableStringBuilder.setSpan(new C72476y0(2, (C72476y0.C72477a) new C71704c(this, bankcard3)), bankcard3.field_prompt_info_prompt_text.length(), spannableStringBuilder.length(), 18);
            this.f207738r.setText(spannableStringBuilder);
            this.f207738r.setOnTouchListener(new C75355a0(getContext()));
            this.f207738r.setVisibility(0);
            int color2 = getContext().getResources().getColor(C0966R.color.FG_0);
            this.f207717N = color2;
            this.f207736p.setTextColor(color2);
        }
        C67176b bVar = C79029b0.vx0().wx0().f192958k;
        removeAllOptionMenu();
        if (!(bVar == null || (aVar = bVar.f192857j) == null || (cVarArr = aVar.f192858a) == null || cVarArr.length <= 0)) {
            addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C71700b(this, bVar));
        }
        Bankcard bankcard4 = this.f207728e;
        if (bankcard4 == null) {
            Log.m105920e("MicroMsg.WalletBalanceFetchUI", "updateFetchLimitView mDefaultBankcard is null");
            return;
        }
        if (Util.isNullOrNil(bankcard4.f209400M2)) {
            this.f207742v.setVisibility(8);
        } else {
            this.f207742v.setVisibility(0);
            this.f207743w.setText(this.f207728e.f209400M2);
            if (this.f207705B) {
                this.f207705B = false;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[4];
                objArr[0] = this.f207715L;
                objArr[1] = 14;
                Bankcard bankcard5 = this.f207728e;
                objArr[2] = bankcard5 != null ? bankcard5.field_bankcardType : str;
                objArr[3] = bankcard5 != null ? bankcard5.field_bindSerial : str;
                nVar.mo160131h(16398, objArr);
            }
        }
        if (Util.isNullOrNil(this.f207728e.f209404Q2)) {
            this.f207744x.setVisibility(8);
            return;
        }
        this.f207744x.setVisibility(0);
        this.f207746z.setText(this.f207728e.f209404Q2);
        this.f207704A.setText(this.f207728e.f209407T2);
        this.f207745y.setUrl(this.f207728e.f209405R2);
        if (this.f207706C) {
            this.f207706C = false;
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[4];
            objArr2[0] = this.f207715L;
            objArr2[1] = 12;
            Bankcard bankcard6 = this.f207728e;
            objArr2[2] = bankcard6 != null ? bankcard6.field_bankcardType : str;
            if (bankcard6 != null) {
                str = bankcard6.field_bindSerial;
            }
            objArr2[3] = str;
            nVar2.mo160131h(16398, objArr2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void fetchData() {
        /*
            r14 = this;
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r1 = r14.f207714K
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.WalletBalanceFetchUI"
            r5 = 0
            if (r1 == 0) goto L_0x00cd
            java.lang.String r1 = "is from new bind bankcard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r7 = r14.f207727d
            if (r7 == 0) goto L_0x002f
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x002f
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r7 = r14.f207727d
            r1.addAll(r7)
        L_0x002f:
            java.util.ArrayList r7 = r0.mo91328j()
            r14.f207727d = r7
            if (r7 == 0) goto L_0x0042
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0042
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r7 = r14.f207727d
            r6.addAll(r7)
        L_0x0042:
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x009a
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x009a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x0054:
            int r9 = r1.size()
            if (r8 >= r9) goto L_0x0084
            java.lang.Object r9 = r1.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r9 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r9
            r10 = 0
        L_0x0061:
            int r11 = r6.size()
            if (r10 >= r11) goto L_0x0081
            java.lang.Object r11 = r6.get(r10)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r11
            if (r9 == 0) goto L_0x007e
            if (r11 == 0) goto L_0x007e
            java.lang.String r12 = r9.field_bindSerial
            java.lang.String r13 = r11.field_bindSerial
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007e
            r7.add(r11)
        L_0x007e:
            int r10 = r10 + 1
            goto L_0x0061
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0084:
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x008d
            r6.removeAll(r7)
        L_0x008d:
            int r1 = r6.size()
            if (r1 <= 0) goto L_0x009a
            java.lang.Object r1 = r6.get(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r1
            goto L_0x009b
        L_0x009a:
            r1 = r5
        L_0x009b:
            if (r1 != 0) goto L_0x00a3
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r1 = r14.f207727d
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r0.mo91329k(r1, r5, r2, r3)
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r6 = r14.f207727d
            if (r6 == 0) goto L_0x00c8
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x00c8
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r6 = r14.f207727d
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r6 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r6
            if (r1 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00c5
            java.lang.String r7 = r1.field_bindSerial
            java.lang.String r6 = r6.field_bindSerial
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00c8:
            r14.f207728e = r1
            r14.f207714K = r2
            goto L_0x00d9
        L_0x00cd:
            java.util.ArrayList r1 = r0.mo91328j()
            r14.f207727d = r1
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r0.mo91329k(r1, r5, r2, r3)
            r14.f207728e = r1
        L_0x00d9:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 16398(0x400e, float:2.2978E-41)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r14.f207715L
            r6[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r6[r3] = r2
            r2 = 2
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r14.f207728e
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x00f4
            java.lang.String r8 = r3.field_bankcardType
            goto L_0x00f5
        L_0x00f4:
            r8 = r7
        L_0x00f5:
            r6[r2] = r8
            r2 = 3
            if (r3 == 0) goto L_0x00fc
            java.lang.String r7 = r3.field_bindSerial
        L_0x00fc:
            r6[r2] = r7
            r1.mo160131h(r5, r6)
            b63.b r1 = r0.f192958k
            if (r1 == 0) goto L_0x0117
            int r2 = r1.f192850c
            r14.f207708E = r2
            int r1 = r1.f192851d
            r14.f207709F = r1
            r14.mo98845T7()
            b63.b r0 = r0.f192958k
            int r0 = r0.f192852e
            r14.f207710G = r0
            goto L_0x011c
        L_0x0117:
            java.lang.String r0 = "BalanceFetchInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x011c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "is_show_charge:"
            r0.append(r1)
            int r1 = r14.f207708E
            r0.append(r1)
            java.lang.String r1 = " is_cal_charge:"
            r0.append(r1)
            int r1 = r14.f207709F
            r0.append(r1)
            java.lang.String r1 = " min_charge_fee:"
            r0.append(r1)
            double r1 = r14.f207711H
            r0.append(r1)
            java.lang.String r1 = " is_full_fetch_direct:"
            r0.append(r1)
            int r1 = r14.f207710G
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchUI.fetchData():void");
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdl;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.kl9);
        this.f207707D = findViewById(C0966R.C0970id.f358008d01);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357493a50);
        this.f207733j = linearLayout;
        C85875k4.m106189j0(((TextView) linearLayout.findViewById(C0966R.C0970id.f357494a51)).getPaint(), 0.8f);
        C71671f fVar = new C71671f();
        View findViewById = findViewById(C0966R.C0970id.f357493a50);
        this.f207734n = findViewById;
        findViewById.setOnClickListener(fVar);
        this.f207733j.setOnClickListener(fVar);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.f357496a53);
        this.f207732i = walletFormView;
        C76024a.m91326g(walletFormView);
        this.f207732i.setOnInputValidChangeListener(this);
        WcPayKeyboard wcPayKeyboard = new WcPayKeyboard(this);
        this.mWcKeyboard = wcPayKeyboard;
        wcPayKeyboard.mo104737b(this, -1);
        setWPKeyboard(this.f207732i.getContentEt(), true, false);
        this.mWcKeyboard.setActionText(getString(C0966R.string.kll));
        ((C12942a) C39818r.f106831a.mo62444c(getContext()).mo75002a(C12942a.class)).setValue("keyboard_title_key", getString(C0966R.string.kll));
        this.f207732i.getContentEt().setOnEditorActionListener(new C71682m());
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f207741u = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f207742v = (LinearLayout) findViewById(C0966R.C0970id.m3u);
        this.f207743w = (TextView) findViewById(C0966R.C0970id.m3v);
        ((WeImageView) findViewById(C0966R.C0970id.m7r)).setEnableHighlight(true);
        this.f207742v.setOnClickListener(new C71683n());
        this.f207744x = (LinearLayout) findViewById(C0966R.C0970id.m3s);
        this.f207745y = (CdnImageView) findViewById(C0966R.C0970id.m3t);
        this.f207746z = (TextView) findViewById(C0966R.C0970id.m3r);
        TextView textView = (TextView) findViewById(C0966R.C0970id.m3q);
        this.f207704A = textView;
        C75228t.m90240d(textView);
        this.f207704A.setOnClickListener(new C71684o());
        this.f207735o = (TextView) findViewById(C0966R.C0970id.lel);
        this.f207736p = (TextView) findViewById(C0966R.C0970id.czz);
        this.f207737q = (TextView) findViewById(C0966R.C0970id.czw);
        this.f207738r = (TextView) findViewById(C0966R.C0970id.czx);
        this.f207739s = (ViewGroup) findViewById(C0966R.C0970id.czy);
        this.f207740t = (ViewGroup) findViewById(C0966R.C0970id.f358007d00);
        C85875k4.m106189j0(this.f207737q.getPaint(), 0.8f);
        this.f207737q.setOnClickListener(new C71685p());
        this.f207732i.mo105069a(new C71686q());
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "3";
        walletGetBulletinEvent.callback = new C71687r(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        Log.m105919d("MicroMsg.WalletBalanceFetchUI", "isHandleAutoShowNormalStWcKb() mWxKbInterceptState:%s isAutoShowNormalStWcKb:%s", Boolean.FALSE, Boolean.valueOf(this.mWcKeyboard.mo104746j()));
        return this.mWcKeyboard.mo104746j();
    }

    public boolean isTransparent() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1 || intent == null) {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
        } else {
            int intExtra = intent.getIntExtra("key_select_index", -1);
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + intExtra);
            ArrayList<Bankcard> arrayList = this.f207727d;
            if (arrayList == null || intExtra < 0 || intExtra >= arrayList.size()) {
                ArrayList<Bankcard> arrayList2 = this.f207727d;
                if (arrayList2 == null || intExtra < 0 || intExtra > arrayList2.size()) {
                    this.f207728e = null;
                }
                mo98841P7();
            } else {
                this.f207728e = this.f207727d.get(intExtra);
            }
            mo98846U7();
        }
    }

    public void onCreate(Bundle bundle) {
        this.f207715L = UUID.randomUUID().toString();
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        hideActionbarLine();
        mo98836K7(getIntent());
        fetchData();
        this.f207731h = getString(C0966R.string.km7);
        initView();
        mo98846U7();
        C75136r0.m90122d(4, 0);
    }

    public void onDestroy() {
        MMHandlerThread.removeRunnable(this.f207719Q);
        MMHandlerThread.removeRunnable(this.f207721S);
        MMHandlerThread.removeRunnable(this.f207722T);
        super.onDestroy();
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f207721S, 300);
    }

    public void onInputValidChange(boolean z) {
        this.f207732i.mo105070b((View) null);
    }

    public void onNewIntent(Intent intent) {
        mo98838M7();
        mo98836K7(intent);
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        if (!this.mWcKeyboard.mo104747k()) {
            this.f207720R = 3;
        }
    }

    public void onResume() {
        mo98838M7();
        super.onResume();
        if (this.f207720R == 3 && isHandleAutoShowNormalStWcKb()) {
            MMHandlerThread.postToMainThreadDelayed(this.f207722T, 300);
        }
        this.f207720R = 2;
        mo98843R7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        boolean z2;
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (i == 0 && i3 == 0) {
            if (yVar2 instanceof C78127d) {
                C78127d dVar = (C78127d) yVar2;
                this.f207723U = false;
                this.f207724V = false;
                if ("1".equals(dVar.f228944n)) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "need realname verify");
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceFetchUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet");
                    z = C67008a.m79172h(this, dVar.f228945o, 0, dVar.f228946p, dVar.f228947q, bundle, isTransparent(), (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 0, 2);
                } else if ("2".equals(dVar.f228944n)) {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "need upload credit");
                    C67008a.m79173i(this, dVar.f228945o, dVar.f228948r, dVar.f228946p, dVar.f228947q, isTransparent(), (DialogInterface.OnClickListener) null);
                    z = true;
                } else {
                    Log.m105924i("MicroMsg.WalletBalanceFetchUI", "realnameGuideFlag =  " + dVar.f228944n);
                    z = false;
                }
                if (z) {
                    return false;
                }
                if (dVar.f228950t) {
                    if (dVar.f228951u != null) {
                        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "debugIdentifyInfoCompleteDialog() show");
                        C78127d.C78128a aVar = dVar.f228951u;
                        String str2 = aVar.f228954a;
                        String str3 = aVar.f228955b;
                        String str4 = aVar.f228956c;
                        String str5 = aVar.f228957d;
                        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog()");
                        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cdk, (ViewGroup) null);
                        ((TextView) inflate.findViewById(C0966R.C0970id.gl8)).setText(str2);
                        ((TextView) inflate.findViewById(C0966R.C0970id.f358705gl3)).setText(str3);
                        ((Button) inflate.findViewById(C0966R.C0970id.bkp)).setText(str4);
                        C78853a aVar2 = new C78853a(this, C0966R.style.a66);
                        aVar2.setContentView(inflate);
                        aVar2.setTitle((CharSequence) null);
                        aVar2.setOnCancelListener(new C5728k(this, aVar2));
                        ((ImageView) inflate.findViewById(C0966R.C0970id.bem)).setOnClickListener(new C5729l(this, aVar2));
                        ((Button) inflate.findViewById(C0966R.C0970id.bkp)).setOnClickListener(new C71847m(this, this, str5, aVar2));
                        aVar2.show();
                        C76879j.m92730a(this, aVar2);
                    } else {
                        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "fetchScene.accountTipDialog == null");
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return false;
                }
                C75155x0.m90137c(21, dVar.f228937d, i3);
                if (!mo98840O7(dVar)) {
                    this.f207730g = dVar.f228937d;
                    mo98837L7(dVar);
                }
            } else if (yVar2 instanceof C78342e0) {
                C78342e0 e0Var = (C78342e0) yVar2;
                mo98835J7(e0Var);
                if (e0Var.isJumpRemind()) {
                    JumpRemind jumpRemind = e0Var.getJumpRemind();
                    jumpRemind.mo104784h(this, new C71670d(jumpRemind, e0Var));
                    return true;
                }
            }
        } else if (yVar2 instanceof C78127d) {
            C75155x0.m90137c(21, "", i3);
            mo98838M7();
            MMHandlerThread.postToMainThreadDelayed(this.f207721S, 300);
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12942a.class);
    }
}
