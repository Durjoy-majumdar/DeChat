package com.tencent.p014mm.wallet_core.p137ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75122k;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.xweb.WCWebUpdater;
import de3.C75355a0;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75576f4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ht1.C60200t1;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import nj3.C76879j;
import org.json.JSONObject;
import p629ny.C76979h;
import p910lj.C76701a;
import qe3.C77329i;
import qo3.C101218e0;
import qo3.C47883u;
import qo3.C77426q;
import te3.C50156ko1;
import te3.C77933g43;

/* renamed from: com.tencent.mm.wallet_core.ui.t */
public class C75228t {

    /* renamed from: a */
    public static final Pattern f221346a = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");

    /* renamed from: b */
    public static final LruCache<Integer, Typeface> f221347b = new LruCache<>(4);

    /* renamed from: c */
    public static SimpleDateFormat f221348c = null;

    /* renamed from: com.tencent.mm.wallet_core.ui.t$g */
    public class C7094g implements C76879j.C76888o {

        /* renamed from: a */
        public final /* synthetic */ Context f25000a;

        /* renamed from: b */
        public final /* synthetic */ String f25001b;

        public C7094g(Context context, String str) {
            this.f25000a = context;
            this.f25001b = str;
        }

        /* renamed from: a */
        public void mo5759a(int i, int i2) {
            Intent intent = new Intent();
            if (i == 0) {
                intent.putExtra("rawUrl", this.f25000a.getString(C0966R.string.kka, new Object[]{LocaleUtil.getApplicationLanguage()}));
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f25001b != null) {
                        intent.putExtra("rawUrl", this.f25000a.getString(C0966R.string.kkc, new Object[]{LocaleUtil.getApplicationLanguage(), this.f25001b}));
                    }
                } else if (this.f25001b != null) {
                    intent.putExtra("rawUrl", this.f25000a.getString(C0966R.string.kkb, new Object[]{LocaleUtil.getApplicationLanguage(), this.f25001b}));
                }
            } else if (this.f25001b != null) {
                intent.putExtra("rawUrl", this.f25000a.getString(C0966R.string.kk9, new Object[]{LocaleUtil.getApplicationLanguage(), this.f25001b}));
            }
            intent.putExtra("showShare", false);
            intent.putExtra("allow_mix_content_mode", false);
            C88144b.m109791i(this.f25000a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$a */
    public class C45125a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f122397d;

        public C45125a(Context context) {
            this.f122397d = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = this.f122397d;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$l */
    public interface C45126l {
        /* renamed from: a */
        void mo70511a(Map<String, Object> map);
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$n */
    public interface C45127n {
        /* renamed from: a */
        void mo70512a(Object obj);
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$b */
    public class C75229b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f221349a;

        /* renamed from: b */
        public final /* synthetic */ C75122k f221350b;

        public C75229b(C101218e0 e0Var, C75122k kVar) {
            this.f221349a = e0Var;
            this.f221350b = kVar;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f221349a.mo140680z();
            this.f221350b.onCancel();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$c */
    public class C75230c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f221351a;

        /* renamed from: b */
        public final /* synthetic */ C75122k f221352b;

        public C75230c(C101218e0 e0Var, C75122k kVar) {
            this.f221351a = e0Var;
            this.f221352b = kVar;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f221351a.mo140680z();
            this.f221352b.mo95653a(1, "");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$d */
    public class C75231d implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ Activity f221353a;

        /* renamed from: b */
        public final /* synthetic */ String f221354b;

        public C75231d(Activity activity, String str) {
            this.f221353a = activity;
            this.f221354b = str;
        }

        public void onClick(View view) {
            C75228t.m90219L(this.f221353a, this.f221354b, true);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$e */
    public class C75232e implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C75238m f221355a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f221356b;

        public C75232e(C75238m mVar, C101218e0 e0Var) {
            this.f221355a = mVar;
            this.f221356b = e0Var;
        }

        /* renamed from: a */
        public void mo2001a() {
            C75238m mVar = this.f221355a;
            if (mVar != null) {
                mVar.mo97581a();
            }
            this.f221356b.mo140680z();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$f */
    public class C75233f implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C75238m f221357a;

        public C75233f(C75238m mVar) {
            this.f221357a = mVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C75238m mVar = this.f221357a;
            if (mVar != null) {
                mVar.mo97581a();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$h */
    public class C75234h implements C75576f4.C75578b {

        /* renamed from: a */
        public final /* synthetic */ C75239o[] f221358a;

        public C75234h(C75239o[] oVarArr) {
            this.f221358a = oVarArr;
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null && gVar.mo55443A3() != null) {
                C75239o[] oVarArr = this.f221358a;
                if (oVarArr == null || oVarArr.length == 0) {
                    Log.m105928w("MicroMsg.WalletBaseUtil ", "hy: kvs is null or length is 0");
                    return;
                }
                try {
                    for (C75239o oVar : oVarArr) {
                        if (oVar != null && !Util.isNullOrNil(oVar.f221365a)) {
                            C81039e A3 = gVar.mo55443A3();
                            String str = oVar.f221365a;
                            Object obj = oVar.f221366b;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                            A3.mo55423X2(str, byteArrayOutputStream.toByteArray());
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WalletBaseUtil ", "hy: serialize failed: %s", e.toString());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$i */
    public class C75235i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f221359d;

        /* renamed from: e */
        public final /* synthetic */ TextView f221360e;

        /* renamed from: f */
        public final /* synthetic */ String f221361f;

        public C75235i(String str, TextView textView, String str2) {
            this.f221359d = str;
            this.f221360e = textView;
            this.f221361f = str2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/WalletBaseUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletBaseUtil ", "hy: on click banner");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f221359d);
            intent.putExtra("showShare", true);
            C88144b.m109791i(this.f221360e.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            C77329i.m93195a(C75228t.m90242e(this.f221361f), 1);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletBaseUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$j */
    public class C75236j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f221362d;

        /* renamed from: e */
        public final /* synthetic */ int f221363e;

        /* renamed from: f */
        public final /* synthetic */ View f221364f;

        public C75236j(View view, int i, View view2) {
            this.f221362d = view;
            this.f221363e = i;
            this.f221364f = view2;
        }

        public void run() {
            Rect rect = new Rect();
            this.f221362d.getHitRect(rect);
            int i = rect.top;
            int i2 = this.f221363e;
            rect.top = i - i2;
            rect.bottom += i2;
            rect.left -= i2;
            rect.right += i2;
            this.f221364f.setTouchDelegate(new TouchDelegate(rect, this.f221362d));
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$k */
    public class C75237k implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$m */
    public interface C75238m {
        /* renamed from: a */
        void mo97581a();
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.t$o */
    public static class C75239o {

        /* renamed from: a */
        public String f221365a;

        /* renamed from: b */
        public Object f221366b;

        public C75239o(String str, Object obj) {
            this.f221365a = str;
            this.f221366b = obj;
        }
    }

    /* renamed from: A */
    public static int m90208A(String str) {
        if (Util.isNullOrNil(str) || str.length() < 2) {
            Log.m105929w("MicroMsg.WalletBaseUtil ", "illegal reqkey: %s", str);
            return 0;
        }
        Log.m105928w("MicroMsg.WalletBaseUtil ", "invalid abtest value");
        return 0;
    }

    /* renamed from: B */
    public static void m90209B(Context context, String str) {
        C45125a aVar = new C45125a(context);
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.l_3);
        }
        C76879j.m92749t(context, str, "", aVar);
    }

    /* renamed from: C */
    public static void m90210C(String str) {
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.l_3);
        }
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
    }

    /* renamed from: D */
    public static void m90211D(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.l_3);
        }
        C76879j.m92749t(context, str, "", new C75237k());
    }

    /* renamed from: E */
    public static boolean m90212E() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_kinda_secure_page_flag, 1);
        Log.m105925i("MicroMsg.WalletBaseUtil ", "secure switch enableValue: %s", Integer.valueOf(Qe));
        return Qe == 1;
    }

    /* renamed from: F */
    public static boolean m90213F(String str) {
        return f221346a.matcher(str).matches();
    }

    /* renamed from: G */
    public static void m90214G(Context context, String str, String str2, boolean z, boolean z2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList.add(context.getString(C0966R.string.knu));
        linkedList2.add(0);
        if (str != null && z2) {
            linkedList.add(context.getString(C0966R.string.kns));
            linkedList2.add(1);
        }
        if (z && !Util.isNullOrNil(str2)) {
            linkedList.add(context.getString(C0966R.string.knv, new Object[]{str2}));
            linkedList2.add(2);
            linkedList.add(context.getString(C0966R.string.knw, new Object[]{str2}));
            linkedList2.add(3);
        }
        C76879j.m92732c(context, "", linkedList, linkedList2, "", new C7094g(context, str));
    }

    /* renamed from: H */
    public static void m90215H(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.WalletBaseUtil ", "username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    /* renamed from: I */
    public static void m90216I(Context context, C50156ko1 ko12, int i, int i2, boolean z) {
        Class cls = C60200t1.class;
        if (ko12 != null) {
            Log.m105925i("MicroMsg.WalletBaseUtil ", "finder_uri type：%s，username：%s , feedid：%s , nonceid：%s", Integer.valueOf(ko12.f136911d), ko12.f136912e, ko12.f136913f, ko12.f136914g);
            int i3 = ko12.f136911d;
            if (i3 == 0) {
                ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83758E5(context, ko12.f136912e, i, C72517z.m84853a(i2));
            } else if (i3 != 1) {
                Log.m105924i("MicroMsg.WalletBaseUtil ", "unknown type");
            } else {
                ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83794l6(context, ko12.f136913f, ko12.f136914g, z, i, C72517z.m84853a(i2));
            }
        }
    }

    /* renamed from: J */
    public static void m90217J(Context context, Intent intent) {
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("allow_mix_content_mode", false);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, (Bundle) null);
    }

    /* renamed from: K */
    public static void m90218K(Context context, Intent intent, int i) {
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("allow_mix_content_mode", false);
        C88144b.m109795m(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, i);
    }

    /* renamed from: L */
    public static void m90219L(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        intent.putExtra("allow_mix_content_mode", false);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: M */
    public static void m90220M(Context context, String str, boolean z, int i) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        intent.putExtra("allow_mix_content_mode", false);
        C88144b.m109795m(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, i);
    }

    /* renamed from: N */
    public static void m90221N(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        intent.putExtra(C74928u.C45093i.f122326r, true);
        intent.putExtra("allow_mix_content_mode", false);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: O */
    public static void m90222O(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("pay_channel", 1);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: P */
    public static void m90223P(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.WalletBaseUtil ", "username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* renamed from: Q */
    public static void m90224Q(String str, String str2, int i, int i2) {
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = str;
        aVar.f9527b = Util.nullAs(str2, "");
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9534i = i;
        aVar2.f9529d = i2;
        aVar2.f9528c = 0;
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: R */
    public static void m90225R(String str, String str2, int i, int i2, C86300q qVar) {
        C86299o oVar = new C86299o();
        oVar.f250929a = str;
        oVar.f250934f = Util.nullAs(str2, "");
        oVar.f250932d = i;
        oVar.f250939k = i2;
        oVar.f250931c = 0;
        oVar.f250916E = qVar;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(MMApplicationContext.getContext(), oVar);
    }

    /* renamed from: S */
    public static void m90226S(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.WalletBaseUtil ", "username is null");
        } else if (C45628s0.m50740E(str)) {
            m90215H(context, str);
        } else {
            m90223P(context, str);
        }
    }

    /* renamed from: T */
    public static String m90227T(String str) {
        if (str == null || str.length() <= 8) {
            return str;
        }
        int length = str.length();
        String substring = str.substring(0, length - 8);
        String substring2 = str.substring(length - 4);
        return substring + "****" + substring2;
    }

    /* renamed from: U */
    public static String m90228U(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }
        String substring = str.substring(1, str.length());
        Log.m105918d("MicroMsg.WalletBaseUtil ", "tail : " + substring);
        String substring2 = str.substring(0, 1);
        Log.m105918d("MicroMsg.WalletBaseUtil ", "head : " + substring2);
        Log.m105918d("MicroMsg.WalletBaseUtil ", "after : " + substring2);
        return "*" + substring;
    }

    /* renamed from: V */
    public static String m90229V(String str) {
        if (str == null || str.length() < 2) {
            return m90228U(str);
        }
        String substring = str.substring(str.length() - 1, str.length());
        return "**" + substring;
    }

    /* renamed from: W */
    public static BigDecimal m90230W(String str, String str2, int i, RoundingMode roundingMode) {
        try {
            double d = Util.getDouble(str, 0.0d);
            double d2 = Util.getDouble(str2, 0.0d);
            String str3 = "0";
            BigDecimal bigDecimal = new BigDecimal(d == 0.0d ? str3 : str.trim());
            if (d2 != 0.0d) {
                str3 = str2.trim();
            }
            return bigDecimal.multiply(new BigDecimal(str3)).setScale(i, roundingMode);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            return new BigDecimal(0);
        }
    }

    /* renamed from: X */
    public static int m90231X(String str, String str2) {
        return m90230W(str, str2, 0, RoundingMode.HALF_UP).intValue();
    }

    /* renamed from: Y */
    public static long m90232Y(String str, String str2) {
        return m90230W(str, str2, 0, RoundingMode.HALF_UP).longValue();
    }

    /* renamed from: Z */
    public static boolean m90233Z(JSONObject jSONObject, String str) {
        return "1".equals(jSONObject.optString(str, "0"));
    }

    /* renamed from: a */
    public static String m90234a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            sb.append(str.substring(i, i2));
            if (i != str.length() - 1) {
                sb.append(str2);
            }
            i = i2;
        }
        return sb.toString();
    }

    /* renamed from: a0 */
    public static int m90235a0(String str) {
        long parseLong = Long.parseLong(str.substring(2), 16);
        return Color.argb((int) ((parseLong >> 24) & 255), (int) ((parseLong >> 16) & 255), (int) ((parseLong >> 8) & 255), (int) (parseLong & 255));
    }

    /* renamed from: b */
    public static void m90236b(WalletFormView[] walletFormViewArr, int i) {
        if (walletFormViewArr != null && walletFormViewArr.length != 0) {
            int i2 = 0;
            for (WalletFormView titleMeasuredWidth : walletFormViewArr) {
                i2 = Math.max(i2, (int) titleMeasuredWidth.getTitleMeasuredWidth());
            }
            if (i2 > 0) {
                int i3 = i2 + i;
                Log.m105925i("MicroMsg.WalletBaseUtil ", "adjust max width: %s", Integer.valueOf(i3));
                for (WalletFormView titleWidth : walletFormViewArr) {
                    titleWidth.setTitleWidth(i3);
                }
            }
        }
    }

    /* renamed from: b0 */
    public static C77933g43 m90237b0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C77933g43 g432 = new C77933g43();
        g432.f227431d = jSONObject.optInt("is_show_notice", 0);
        g432.f227433f = jSONObject.optString("left_icon", "");
        g432.f227434g = jSONObject.optString("jump_url", "");
        g432.f227432e = jSONObject.optString("wording", "");
        g432.f227435h = jSONObject.optString("notice_id", "");
        return g432;
    }

    /* renamed from: c */
    public static void m90238c(C75239o... oVarArr) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C75234h(oVarArr), (String) null));
    }

    /* renamed from: c0 */
    public static void m90239c0(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: d */
    public static void m90240d(TextView textView) {
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
    }

    /* renamed from: d0 */
    public static void m90241d0(ArrayList<Bitmap> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            for (int size = arrayList.size() - 1; size > 0; size--) {
                m90239c0(arrayList.remove(size));
            }
        }
    }

    /* renamed from: e */
    public static int m90242e(String str) {
        if ("1".equals(str)) {
            return 0;
        }
        if ("2".equals(str)) {
            return 4;
        }
        if ("3".equals(str)) {
            return 12;
        }
        if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL.equals(str)) {
            return 2;
        }
        if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.equals(str)) {
            return 8;
        }
        if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN.equals(str)) {
            return 14;
        }
        if ("7".equals(str)) {
            return 16;
        }
        return "8".equals(str) ? 10 : -1;
    }

    /* renamed from: e0 */
    public static void m90243e0(int i, int i2) {
        C115669n.INSTANCE.mo160131h(12719, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: f */
    public static void m90244f(Context context, String str) {
        if (!Util.isNullOrNil(str)) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "dial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "dial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: f0 */
    public static void m90245f0(int i, int i2, long j, int i3) {
        C115669n.INSTANCE.mo160131h(13375, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i3));
    }

    /* renamed from: g */
    public static String m90246g(String str, int i) {
        return m90277z(m90268r(str), i);
    }

    /* renamed from: g0 */
    public static void m90247g0(View view, TextView textView, String str, String str2, String str3) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView2 = view;
        TextView textView3 = textView;
        if (textView3 == null) {
            Log.m105920e("MicroMsg.WalletBaseUtil ", "hy: text view is null.");
        } else if (Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.WalletBaseUtil ", "hy: msg is null. set text view to gone");
            if (textView2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", "setBannerWrapper", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                textView.setVisibility(0);
            }
            textView.setVisibility(0);
            textView.setText(str2);
            C77329i.m93195a(m90242e(str), 0);
            if (!Util.isNullOrNil(str3)) {
                if (!(textView2 == null || (imageView2 = (ImageView) view.findViewById(C0966R.C0970id.f6145yj)) == null)) {
                    imageView2.setVisibility(0);
                }
                if (textView2 == null) {
                    textView2 = textView3;
                }
                String str4 = str;
                textView2.setOnClickListener(new C75235i(str3, textView, str));
                return;
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            if (textView2 != null && (imageView = (ImageView) view.findViewById(C0966R.C0970id.f6145yj)) != null) {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: h */
    public static BigDecimal m90248h(String str, String str2, int i, RoundingMode roundingMode) {
        try {
            return new BigDecimal(Util.getDouble(str, 0.0d) == 0.0d ? "0" : str.trim()).divide(new BigDecimal(str2.trim()), i, roundingMode);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            return new BigDecimal(0);
        }
    }

    /* renamed from: h0 */
    public static void m90249h0(TextView textView, String str, int i) {
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView.getContext(), m90246g(str, i), textView.getTextSize()));
    }

    /* renamed from: i */
    public static double m90250i(String str, String str2, int i, RoundingMode roundingMode) {
        return m90248h(str, str2, i, roundingMode).doubleValue();
    }

    /* renamed from: i0 */
    public static void m90251i0(EditText editText) {
        Class<EditText> cls = EditText.class;
        try {
            Method method = cls.getMethod("setShowSoftInputOnFocus", new Class[]{Boolean.TYPE});
            method.setAccessible(false);
            method.invoke(editText, new Object[]{Boolean.FALSE});
        } catch (NoSuchMethodException unused) {
            Log.m105920e("erik", "setShowSoftInputOnFocus exception!");
            try {
                Method method2 = cls.getMethod("setSoftInputShownOnFocus", new Class[]{Boolean.TYPE});
                method2.setAccessible(false);
                method2.invoke(editText, new Object[]{Boolean.FALSE});
            } catch (Exception e) {
                editText.setInputType(0);
                Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e2, "", new Object[0]);
        }
    }

    /* renamed from: j */
    public static void m90252j(View view, int i) {
        View view2 = (View) view.getParent();
        view2.post(new C75236j(view, i, view2));
    }

    /* renamed from: j0 */
    public static void m90253j0(TextView textView, String str, int i, int i2, C7092q qVar, Context context) {
        m90255k0(textView, str, i, i2, qVar, context, true);
    }

    /* renamed from: k */
    public static String m90254k(String str) {
        return ("CNY".equals(str) || "1".equals(str) || Util.isNullOrNil(str)) ? "¥" : str;
    }

    /* renamed from: k0 */
    public static void m90255k0(TextView textView, String str, int i, int i2, C7092q qVar, Context context, boolean z) {
        textView.setClickable(true);
        textView.setOnTouchListener(new C75355a0(context));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, str));
        spannableStringBuilder.setSpan(qVar, i, i2, 18);
        textView.setText(spannableStringBuilder);
        if (z) {
            m90240d(textView);
        }
    }

    /* renamed from: l */
    public static String m90256l(double d) {
        return m90258m(d, "");
    }

    /* renamed from: l0 */
    public static void m90257l0(Context context, String str, C75238m mVar) {
        C77426q qVar = new C77426q(context);
        if (Util.isNullOrNil(str)) {
            str = context.getString(C0966R.string.l_3);
        }
        qVar.mo107595g(str);
        qVar.mo107600l(new C75233f(mVar));
        qVar.mo107602n(context.getString(C0966R.string.kke));
        qVar.mo107603o();
    }

    /* renamed from: m */
    public static String m90258m(double d, String str) {
        if ("CNY".equals(str)) {
            return String.format("¥%.2f", new Object[]{Double.valueOf(d)});
        } else if ("ZAR".equals(str)) {
            return String.format("R%.2f", new Object[]{Double.valueOf(d)});
        } else if ("1".equals(str) || Util.isNullOrNil(str)) {
            return String.format(C45121z0.m49962b() + "%.2f", new Object[]{Double.valueOf(d)});
        } else {
            return String.format(str + "%.2f", new Object[]{Double.valueOf(d)});
        }
    }

    /* renamed from: m0 */
    public static C101218e0 m90259m0(Activity activity, String str, String str2, String str3, C75122k kVar) {
        C101218e0 e0Var = new C101218e0(activity, 1, 3);
        e0Var.mo140667n(activity.getString(C0966R.string.f7948x5), activity.getString(C0966R.string.f7569jy));
        C75229b bVar = new C75229b(e0Var, kVar);
        C75230c cVar = new C75230c(e0Var, kVar);
        e0Var.f296373D = bVar;
        e0Var.f296374E = cVar;
        View inflate = View.inflate(activity, C0966R.C0971layout.cdf, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.leh);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setText(str);
        e0Var.mo140672r(inflate);
        View inflate2 = View.inflate(activity, C0966R.C0971layout.cde, (ViewGroup) null);
        TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.leg);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        m90253j0(textView2, str2, 0, str2.length(), new C7092q((C7092q.C7093a) new C75231d(activity, str3), true), activity);
        e0Var.mo140663j(inflate2);
        e0Var.mo140655A();
        return e0Var;
    }

    /* renamed from: n */
    public static String m90260n(double d) {
        return String.format("%.2f", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: n0 */
    public static C101218e0 m90261n0(Context context, String str, String str2, String str3, C75238m mVar) {
        C101218e0 e0Var = new C101218e0(context, 2, 3);
        e0Var.mo140677w(str3);
        View inflate = View.inflate(context, C0966R.C0971layout.cdf, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.leh);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setText(str);
        e0Var.mo140672r(inflate);
        View inflate2 = View.inflate(context, C0966R.C0971layout.cde, (ViewGroup) null);
        TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.leg);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        textView2.setText(str2);
        e0Var.mo140663j(inflate2);
        e0Var.f296375F = new C75232e(mVar, e0Var);
        e0Var.mo140655A();
        return e0Var;
    }

    /* renamed from: o */
    public static String m90262o(int i) {
        if (f221348c == null) {
            f221348c = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
        return f221348c.format(new Date(((long) i) * 1000));
    }

    /* renamed from: o0 */
    public static String m90263o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length() / 4;
        int i = 0;
        while (i < length + 1) {
            int i2 = i + 1;
            int min = Math.min(i2 * 4, str.length());
            int i3 = i * 4;
            sb.append(m90234a(str.substring(i3, min), ""));
            if (min - i3 == 4) {
                for (int i4 = 0; i4 < 4; i4++) {
                    sb.append(" ");
                }
            }
            i = i2;
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static String m90264p(int i, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
        long j = ((long) i) * 1000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1) ? simpleDateFormat.format(new Date(j)) : simpleDateFormat2.format(new Date(j));
    }

    /* renamed from: p0 */
    public static void m90265p0(MMActivity mMActivity, String str) {
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("bank_card_owner", str);
        C88144b.m109791i(mMActivity, "scanner", ".ui.ScanCardUI", intent, (Bundle) null);
    }

    /* renamed from: q */
    public static String m90266q(String str) {
        return "CNY".equals(str) ? "¥" : "ZAR".equals(str) ? "R" : ("1".equals(str) || Util.isNullOrNil(str)) ? C45121z0.m49962b() : str;
    }

    /* renamed from: q0 */
    public static String m90267q0(String str, int i) {
        int i2;
        if (Util.isNullOrNil(str)) {
            return str;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= str.length()) {
                i2 = 0;
                break;
            }
            i4 = str.charAt(i3) <= 127 ? i4 + 1 : i4 + 2;
            if (i4 >= i) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        try {
            int offsetByCodePoints = str.offsetByCodePoints(0, str.codePointCount(0, i2));
            if (offsetByCodePoints >= str.length() || offsetByCodePoints <= 0) {
                return str;
            }
            return str.substring(0, offsetByCodePoints) + "...";
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            return str;
        }
    }

    /* renamed from: r */
    public static String m90268r(String str) {
        C86709a0.m107528h();
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(str);
        String f = H3 != null ? H3.mo62898f() : null;
        return Util.isNullOrNil(f) ? str : f;
    }

    /* renamed from: r0 */
    public static long m90269r0(double d) {
        return Math.round(d * 100.0d);
    }

    /* renamed from: s */
    public static String m90270s(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        String str2 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            str2 = str2 + "*";
        }
        return str2 + str.substring(str.length() - 1, str.length());
    }

    /* renamed from: t */
    public static String m90271t() {
        return Long.toString((((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_use_safe_time, 0) == 0 ? C31543z5.m39453c() : C31543z5.m39451a()) / 1000);
    }

    /* renamed from: u */
    public static String m90272u() {
        C86709a0.m107523b().mo121108c();
        return C75592q0.m90789s();
    }

    /* renamed from: v */
    public static String m90273v(int i) {
        switch (i) {
            case 1:
                return "fonts/WeChatSansSS-Bold.ttf";
            case 2:
                return "fonts/WeChatSansSS-Light.ttf";
            case 3:
                return "fonts/WeChatSansSS-Regular.ttf";
            case 4:
                return "fonts/WeChatSansStd-Medium.ttf";
            case 5:
                return "fonts/WeChatSansStd-Bold.ttf";
            case 6:
                return "fonts/WeChatSansStd-Light.ttf";
            case 7:
                return "fonts/WeChatSansStd-Regular.ttf";
            default:
                return "fonts/WeChatSansSS-Medium.ttf";
        }
    }

    /* renamed from: w */
    public static Typeface m90274w(Context context, int i) {
        if (i == 8) {
            return Typeface.DEFAULT;
        }
        try {
            if (Build.VERSION.SDK_INT > 23) {
                return Typeface.createFromAsset(context.getAssets(), m90273v(i));
            }
            LruCache<Integer, Typeface> lruCache = f221347b;
            Typeface typeface = lruCache.get(Integer.valueOf(i));
            if (typeface != null) {
                return typeface;
            }
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), m90273v(i));
            lruCache.put(Integer.valueOf(i), createFromAsset);
            return createFromAsset;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WalletBaseUtil ", "getWalletTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return Typeface.DEFAULT;
        }
    }

    /* renamed from: x */
    public static MultiProcessMMKV m90275x() {
        return MultiProcessMMKV.getMMKV("wc_pay_device_config");
    }

    /* renamed from: y */
    public static String m90276y(String str) {
        if (Util.isNullOrNil(str) || str.length() <= 14) {
            return str;
        }
        return str.substring(0, 14) + "...";
    }

    /* renamed from: z */
    public static String m90277z(String str, int i) {
        if (Util.isNullOrNil(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "...";
    }
}
