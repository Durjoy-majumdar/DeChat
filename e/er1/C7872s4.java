package er1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import c30.C104289g;
import c30.C26827e;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import java.util.Map;
import ke3.C88144b;
import l31.C61212e;
import org.json.JSONException;
import q31.C118148a;
import qo3.C101218e0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C50845pl0;
import te3.C50975ql0;
import te3.C51123rl0;
import te3.C51261sl0;
import tf0.C64916p1;
import yr1.C16060a;
import yr1.C16061b;
import yr1.C16064c;
import z04.C119027c;

/* renamed from: er1.s4 */
public final class C7872s4 {

    /* renamed from: a */
    public static final C7872s4 f26479a = new C7872s4();

    /* renamed from: er1.s4$a */
    public static final class C7873a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Activity f26480d;

        /* renamed from: e */
        public final /* synthetic */ C50975ql0 f26481e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7873a(Activity activity, C50975ql0 ql02) {
            super(1);
            this.f26480d = activity;
            this.f26481e = ql02;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                Activity activity = this.f26480d;
                String str = this.f26481e.f140377g;
                if (!(str == null || str.length() == 0)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.s4$b */
    public static final class C7874b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C49712hj1 f26482a;

        public C7874b(C49712hj1 hj12) {
            this.f26482a = hj12;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C49712hj1 hj12 = this.f26482a;
            Integer num = null;
            lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
            lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
            lVarArr[2] = new C13604l("finder_tab_context_id", hj12 != null ? hj12.f134672f : null);
            if (hj12 != null) {
                num = Integer.valueOf(hj12.f134675i);
            }
            lVarArr[3] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: er1.s4$c */
    public static final class C7875c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ Activity f26483a;

        /* renamed from: b */
        public final /* synthetic */ C50845pl0 f26484b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f26485c;

        public C7875c(Activity activity, C50845pl0 pl02, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
            this.f26483a = activity;
            this.f26484b = pl02;
            this.f26485c = pVar;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C7872s4 s4Var = C7872s4.f26479a;
            Activity activity = this.f26483a;
            C50845pl0 pl02 = this.f26484b;
            C87412m.m108593f(pl02, "firstBtn");
            C7872s4.m8014a(s4Var, activity, 4, pl02, this.f26485c);
        }
    }

    /* renamed from: er1.s4$d */
    public static final class C7876d implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ Activity f26486a;

        /* renamed from: b */
        public final /* synthetic */ C50845pl0 f26487b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f26488c;

        public C7876d(Activity activity, C50845pl0 pl02, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
            this.f26486a = activity;
            this.f26487b = pl02;
            this.f26488c = pVar;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C7872s4 s4Var = C7872s4.f26479a;
            Activity activity = this.f26486a;
            C50845pl0 pl02 = this.f26487b;
            C87412m.m108593f(pl02, "secondBtn");
            C7872s4.m8014a(s4Var, activity, 5, pl02, this.f26488c);
        }
    }

    /* renamed from: er1.s4$e */
    public static final class C7877e implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ Activity f26489a;

        /* renamed from: b */
        public final /* synthetic */ C50845pl0 f26490b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f26491c;

        public C7877e(Activity activity, C50845pl0 pl02, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
            this.f26489a = activity;
            this.f26490b = pl02;
            this.f26491c = pVar;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C7872s4 s4Var = C7872s4.f26479a;
            Activity activity = this.f26489a;
            C50845pl0 pl02 = this.f26490b;
            C87412m.m108593f(pl02, "firstBtn");
            C7872s4.m8014a(s4Var, activity, 6, pl02, this.f26491c);
        }
    }

    /* renamed from: a */
    public static final void m8014a(C7872s4 s4Var, Activity activity, int i, C50845pl0 pl02, C32227p pVar) {
        s4Var.getClass();
        int i2 = pl02.f139821g;
        if (i2 == 2) {
            C51261sl0 sl02 = pl02.f139820f;
            if (sl02 != null) {
                C7872s4 s4Var2 = f26479a;
                s4Var2.mo8989i(activity, (String) s4Var2.mo8984d(sl02).f38556e);
            }
        } else if (i2 != 3) {
            s4Var.mo8985e(i, false, true, pVar);
        } else {
            s4Var.mo8985e(i, true, true, pVar);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m8015l(C7872s4 s4Var, Activity activity, View view, String str, int i, int i2, int i3, String str2, int i4, Object obj) {
        s4Var.mo8991k(activity, view, str, i, i2, (i4 & 32) != 0 ? 8 : i3, (i4 & 64) != 0 ? null : str2);
    }

    /* renamed from: b */
    public final boolean mo8982b(Activity activity, String str) {
        try {
            Log.m105924i("FinderUtilsCmdUtils", "[doJump] errMsg = " + str);
            C104289g gVar = new C104289g(str);
            int i = gVar.getInt("link_type");
            if (i == 1) {
                mo8989i(activity, gVar.getJSONObject("link_h5").optString("link"));
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C104289g k = gVar.getJSONObject("link_lite_app");
                String optString = k.optString("app_id");
                String optString2 = k.optString("page");
                String optString3 = k.optString(SearchIntents.EXTRA_QUERY);
                String optString4 = k.optString("default_url");
                String optString5 = k.optString("ext_info");
                C50975ql0 ql02 = new C50975ql0();
                ql02.f140374d = optString;
                ql02.f140375e = optString2;
                ql02.f140376f = optString3;
                ql02.f140377g = optString4;
                ql02.f140378h = optString5;
                mo8990j(activity, ql02);
                return true;
            }
        } catch (Exception e) {
            Log.m105920e("FinderUtilsCmdUtils", "[doJump] catch exception:" + e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public final C16060a mo8983c(C50845pl0 pl02, C101218e0.C12907m mVar) {
        boolean z = false;
        int i = pl02.f139819e == 0 ? 6 : 0;
        if (pl02.f139821g == 1) {
            z = true;
        }
        return new C16060a(pl02.f139818d, i, z, mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[Catch:{ Exception -> 0x0064 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.String, java.lang.String> mo8984d(te3.C51261sl0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FinderUtilsCmdUtils"
            java.lang.String r1 = ""
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r2.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = "[getExtConfig] ext_params:"
            r2.append(r3)     // Catch:{ Exception -> 0x0064 }
            r3 = 0
            if (r6 == 0) goto L_0x0014
            java.lang.String r4 = r6.f141584e     // Catch:{ Exception -> 0x0064 }
            goto L_0x0015
        L_0x0014:
            r4 = r3
        L_0x0015:
            r2.append(r4)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0064 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0064 }
            c30.g r2 = new c30.g     // Catch:{ Exception -> 0x0064 }
            if (r6 == 0) goto L_0x0027
            java.lang.String r4 = r6.f141584e     // Catch:{ Exception -> 0x0064 }
            if (r4 != 0) goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            r2.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0064 }
            if (r6 == 0) goto L_0x0033
            int r6 = r6.f141583d     // Catch:{ Exception -> 0x0064 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0064 }
        L_0x0033:
            r6 = 1
            if (r3 != 0) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            int r4 = r3.intValue()     // Catch:{ Exception -> 0x0064 }
            if (r4 != r6) goto L_0x003e
            goto L_0x004a
        L_0x003e:
            r4 = 2
            if (r3 != 0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0064 }
            if (r3 != r4) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x007d
            java.lang.String r6 = "h5_wording"
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0064 }
            if (r6 != 0) goto L_0x0055
            r6 = r1
        L_0x0055:
            java.lang.String r3 = "h5_link"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x0064 }
            if (r2 != 0) goto L_0x005e
            r2 = r1
        L_0x005e:
            rx3.l r3 = new rx3.l     // Catch:{ Exception -> 0x0064 }
            r3.<init>(r6, r2)     // Catch:{ Exception -> 0x0064 }
            return r3
        L_0x0064:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[getExtConfig] catch exception:"
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
        L_0x007d:
            rx3.l r6 = new rx3.l
            r6.<init>(r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7872s4.mo8984d(te3.sl0):rx3.l");
    }

    /* renamed from: e */
    public final void mo8985e(int i, boolean z, boolean z2, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        Log.m105924i("FinderUtilsCmdUtils", "[handleOnEndCheck] enterType:" + i + " confirm:" + z + " fromDialog:" + z2);
        pVar.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[Catch:{ Exception -> 0x003f }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C50845pl0 mo8986f(c30.C104289g r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "content"
            java.lang.String r1 = r6.optString(r1)     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = "button_style"
            int r2 = r6.optInt(r2)     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = "jump_type"
            int r3 = r6.optInt(r3)     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "ext_config"
            c30.g r6 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x003f }
            if (r1 == 0) goto L_0x0024
            int r4 = r1.length()     // Catch:{ Exception -> 0x003f }
            if (r4 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = 1
        L_0x0025:
            if (r4 != 0) goto L_0x005a
            te3.pl0 r4 = new te3.pl0     // Catch:{ Exception -> 0x003f }
            r4.<init>()     // Catch:{ Exception -> 0x003f }
            r4.f139818d = r1     // Catch:{ Exception -> 0x003f }
            r4.f139819e = r2     // Catch:{ Exception -> 0x003f }
            r4.f139821g = r3     // Catch:{ Exception -> 0x003f }
            if (r6 == 0) goto L_0x003b
            er1.s4 r1 = f26479a     // Catch:{ Exception -> 0x003f }
            te3.sl0 r6 = r1.mo8988h(r6)     // Catch:{ Exception -> 0x003f }
            goto L_0x003c
        L_0x003b:
            r6 = r0
        L_0x003c:
            r4.f139820f = r6     // Catch:{ Exception -> 0x003f }
            return r4
        L_0x003f:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[jsonToJumpButton] catch exception:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "FinderUtilsCmdUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7872s4.mo8986f(c30.g):te3.pl0");
    }

    /* renamed from: g */
    public final C51123rl0 mo8987g(C104289g gVar) {
        C50845pl0 f;
        try {
            String optString = gVar.optString("msg");
            String optString2 = gVar.optString("cancel");
            String optString3 = gVar.optString("confirm");
            C104289g m = gVar.optJSONObject("ext_config");
            C26827e l = gVar.optJSONArray("buttons");
            C51123rl0 rl02 = new C51123rl0();
            rl02.f140993d = optString;
            rl02.f140994e = optString2;
            rl02.f140995f = optString3;
            rl02.f140996g = m != null ? f26479a.mo8988h(m) : null;
            int length = l != null ? l.length() : 0;
            for (int i = 0; i < length; i++) {
                if (!(l == null || (f = f26479a.mo8986f(l.optJSONObject(i))) == null)) {
                    rl02.f140997h.add(f);
                }
            }
            return rl02;
        } catch (JSONException e) {
            Log.m105920e("FinderUtilsCmdUtils", "[jsonToToastConfig] catch exception:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public final C51261sl0 mo8988h(C104289g gVar) {
        try {
            int i = gVar.getInt("ext_type");
            byte[] decode = Base64.decode(gVar.getString("ext_params"), 0);
            C87412m.m108593f(decode, "decode(extParamsBase64, Base64.DEFAULT)");
            String str = new String(decode, C119027c.f356488a);
            C51261sl0 sl02 = new C51261sl0();
            sl02.f141583d = i;
            sl02.f141584e = str;
            return sl02;
        } catch (Exception e) {
            Log.m105920e("FinderUtilsCmdUtils", "[jsonToToastExtConfig] catch exception:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: i */
    public final void mo8989i(Activity activity, String str) {
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: j */
    public final void mo8990j(Activity activity, C50975ql0 ql02) {
        Bundle bundle = new Bundle();
        bundle.putString("appId", ql02.f140374d);
        bundle.putString(SearchIntents.EXTRA_QUERY, ql02.f140376f);
        bundle.putString("path", ql02.f140375e);
        bundle.putInt("nextAnimIn", C0966R.C0968anim.f2326n);
        bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
        C7782b1 b1Var = C7782b1.f26282a;
        String str = ql02.f140377g;
        if (!b1Var.mo8894a(activity, bundle, !(str == null || str.length() == 0), new C7873a(activity, ql02))) {
            mo8989i(activity, ql02.f140377g);
        }
    }

    /* renamed from: k */
    public final void mo8991k(Activity activity, View view, String str, int i, int i2, int i3, String str2) {
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, str);
        eVar.mo86175pO(view, i3, 25496);
        eVar.mo86149PM(view, str2 == null || str2.length() == 0 ? C90364q0.m113147f(new C13604l("describe_type", Integer.valueOf(i)), new C13604l("describe_reason", Integer.valueOf(i2))) : C90364q0.m113147f(new C13604l("behaviour_copywriting", str2), new C13604l("describe_reason", Integer.valueOf(i2))));
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(activity);
        eVar.E60(view, new C7874b(gr02 != null ? gr02.mo12861q3() : null));
    }

    /* renamed from: m */
    public final void mo8992m(Activity activity, int i, C51123rl0 rl02, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        View view;
        Activity activity2 = activity;
        int i2 = i;
        C51123rl0 rl03 = rl02;
        C32227p<? super Boolean, ? super Boolean, C13598b0> pVar2 = pVar;
        C87412m.m108594g(activity2, "context");
        C87412m.m108594g(rl03, "toastConfig");
        C87412m.m108594g(pVar2, "onEndCheck");
        Log.m105924i("FinderUtilsCmdUtils", "[showTipsDialog] buttons.size:" + rl03.f140997h.size());
        boolean z = false;
        boolean z2 = rl03.f140997h.size() > 1;
        int i3 = z2 ? 2 : 1;
        int i4 = i2 != 1 ? i2 != 2 ? 0 : 2 : 1;
        String str = rl03.f140993d;
        C51261sl0 sl02 = rl03.f140996g;
        View inflate = C85868k2.m106137b(activity).inflate(C0966R.C0971layout.d4p, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.nvn);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.nvm);
        if (textView2 != null) {
            C7872s4 s4Var = f26479a;
            C13604l<String, String> d = s4Var.mo8984d(sl02);
            if (((CharSequence) d.f38555d).length() > 0) {
                textView2.setText((CharSequence) d.f38555d);
            }
            if (((CharSequence) d.f38556e).length() > 0) {
                textView2.setOnClickListener(new C7866r4(activity2, d));
            }
            view = inflate;
            m8015l(s4Var, activity, textView2, "describe_standard", i3, i4, 0, (String) null, 96, (Object) null);
        } else {
            view = inflate;
        }
        m8015l(this, activity, view, "describe", i3, i4, 32, (String) null, 64, (Object) null);
        C50845pl0 pl02 = rl03.f140997h.get(0);
        if (z2) {
            C87412m.m108593f(pl02, "firstBtn");
            C16060a c = mo8983c(pl02, new C7875c(activity2, pl02, pVar2));
            C50845pl0 pl03 = rl03.f140997h.get(1);
            C87412m.m108593f(pl03, "secondBtn");
            C101218e0 c2 = C16061b.f43199a.mo14680c(activity2, view, c, mo8983c(pl03, new C7876d(activity2, pl03, pVar2)));
            Button button = c2.f296394t;
            C87412m.m108593f(button, "dialog.btnLeft");
            mo8991k(activity, button, "describe_general_button", i3, i4, 40, pl02.f139818d);
            Button button2 = c2.f296395u;
            C87412m.m108593f(button2, "dialog.btnRight");
            mo8991k(activity, button2, "describe_general_button", i3, i4, 40, pl03.f139818d);
            return;
        }
        View view2 = view;
        C87412m.m108593f(pl02, "firstBtn");
        C16060a c3 = mo8983c(pl02, new C7877e(activity2, pl02, pVar2));
        C101218e0 e0Var = new C101218e0(activity2, 2, 0);
        String str2 = c3.f43195a;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        String string = z ? activity.getResources().getString(C0966R.string.f8028zq) : c3.f43195a;
        C87412m.m108593f(string, "if (btnConfig.text.isNul… btnConfig.text\n        }");
        e0Var.mo140677w(string);
        e0Var.mo140676v(c3.f43196b);
        e0Var.f296375F = new C16064c(c3, e0Var);
        e0Var.mo140663j(view2);
        e0Var.mo140655A();
        Button button3 = e0Var.f296398x;
        C87412m.m108593f(button3, "dialog.btnSingle");
        mo8991k(activity, button3, "describe_general_button", i3, i4, 40, pl02.f139818d);
    }
}
