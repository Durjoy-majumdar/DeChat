package a63;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75280e;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import p629ny.C76979h;
import qo3.C77398g;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C64320dn3;
import te3.uf4;
import yq3.C79143a;
import yq3.C79148e;
import z53.C39320d;
import z53.C79310i;

/* renamed from: a63.a */
public class C67008a implements C11385n {

    /* renamed from: d */
    public C67019k f192481d = null;

    /* renamed from: e */
    public WeakReference<MMActivity> f192482e;

    /* renamed from: f */
    public WeakReference<C75280e> f192483f;

    /* renamed from: g */
    public C77398g f192484g;

    /* renamed from: a63.a$a */
    public class C67009a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f192485d;

        /* renamed from: e */
        public final /* synthetic */ Activity f192486e;

        public C67009a(boolean z, Activity activity) {
            this.f192485d = z;
            this.f192486e = activity;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f192485d) {
                this.f192486e.finish();
            }
        }
    }

    /* renamed from: a63.a$b */
    public class C67010b implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ int f192487a;

        /* renamed from: b */
        public final /* synthetic */ String f192488b;

        /* renamed from: c */
        public final /* synthetic */ MMActivity f192489c;

        public C67010b(C67008a aVar, int i, String str, MMActivity mMActivity) {
            this.f192487a = i;
            this.f192488b = str;
            this.f192489c = mMActivity;
        }

        public void onClick(View view) {
            C75228t.m90245f0(3, 1, Util.nowSecond(), this.f192487a);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f192488b);
            intent.putExtra("showShare", false);
            C75228t.m90217J(this.f192489c, intent);
        }
    }

    /* renamed from: a63.a$c */
    public class C67011c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f192490d;

        public C67011c(int i) {
            this.f192490d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75228t.m90245f0(2, 1, Util.nowSecond(), this.f192490d);
            WeakReference<C75280e> weakReference = C67008a.this.f192483f;
            if (weakReference != null && weakReference.get() != null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(385, C67008a.this);
                C67008a.this.getClass();
                C67008a.this.f192483f.get().mo95362b(new C39320d(-1), true);
            }
        }
    }

    /* renamed from: a63.a$d */
    public class C67012d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f192492d;

        public C67012d(int i) {
            this.f192492d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75228t.m90245f0(1, 1, Util.nowSecond(), this.f192492d);
            C67008a.this.mo90978d(1, -1, "cancel", false);
        }
    }

    /* renamed from: a63.a$e */
    public class C67013e implements DialogInterface.OnClickListener {
        public C67013e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C67008a.this.f192484g.dismiss();
            WeakReference<MMActivity> weakReference = C67008a.this.f192482e;
            if (!(weakReference == null || weakReference.get() == null)) {
                C67008a.this.f192482e.get().finish();
            }
            C67008a.this.mo90977c();
        }
    }

    /* renamed from: a63.a$f */
    public class C67014f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f192495d;

        /* renamed from: e */
        public final /* synthetic */ Activity f192496e;

        /* renamed from: f */
        public final /* synthetic */ int f192497f;

        /* renamed from: g */
        public final /* synthetic */ int f192498g;

        public C67014f(boolean z, Activity activity, int i, int i2) {
            this.f192495d = z;
            this.f192496e = activity;
            this.f192497f = i;
            this.f192498g = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f192495d) {
                this.f192496e.finish();
            }
            dialogInterface.dismiss();
            int i2 = 0;
            int i3 = this.f192497f;
            if (i3 == 1) {
                i2 = 8;
            } else if (i3 == 2) {
                i2 = 11;
            }
            C75228t.m90245f0(i2, 1, Util.nowSecond(), this.f192498g);
        }
    }

    /* renamed from: a63.a$g */
    public class C67015g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bundle f192499d;

        /* renamed from: e */
        public final /* synthetic */ int f192500e;

        /* renamed from: f */
        public final /* synthetic */ int f192501f;

        /* renamed from: g */
        public final /* synthetic */ Activity f192502g;

        /* renamed from: h */
        public final /* synthetic */ int f192503h;

        public C67015g(Bundle bundle, int i, int i2, Activity activity, int i3) {
            this.f192499d = bundle;
            this.f192500e = i;
            this.f192501f = i2;
            this.f192502g = activity;
            this.f192503h = i3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
            Bundle bundle = this.f192499d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("real_name_verify_mode", this.f192500e);
            bundle.putInt("entry_scene", this.f192501f);
            C79143a.m95771j(this.f192502g, RealNameVerifyProcess.class, bundle, (C79148e.C79149a) null);
            int i2 = 0;
            int i3 = this.f192503h;
            if (i3 == 1) {
                i2 = 9;
            } else if (i3 == 2) {
                i2 = 12;
            }
            C75228t.m90245f0(i2, 1, Util.nowSecond(), this.f192501f);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a63.a$h */
    public class C67016h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f192504d;

        /* renamed from: e */
        public final /* synthetic */ Activity f192505e;

        public C67016h(boolean z, Activity activity) {
            this.f192504d = z;
            this.f192505e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
            dialogInterface.dismiss();
            if (this.f192504d) {
                this.f192505e.finish();
            }
        }
    }

    /* renamed from: a63.a$i */
    public class C67017i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f192506d;

        /* renamed from: e */
        public final /* synthetic */ Activity f192507e;

        /* renamed from: f */
        public final /* synthetic */ boolean f192508f;

        public C67017i(String str, Activity activity, boolean z) {
            this.f192506d = str;
            this.f192507e = activity;
            this.f192508f = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f192506d);
            intent.putExtra("showShare", false);
            C75228t.m90217J(this.f192507e, intent);
            dialogInterface.dismiss();
            if (this.f192508f) {
                this.f192507e.finish();
            }
        }
    }

    /* renamed from: a63.a$j */
    public class C67018j implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f192509d;

        /* renamed from: e */
        public final /* synthetic */ Activity f192510e;

        public C67018j(boolean z, Activity activity) {
            this.f192509d = z;
            this.f192510e = activity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (this.f192509d) {
                this.f192510e.finish();
            }
        }
    }

    /* renamed from: a63.a$k */
    public interface C67019k {
        boolean run(int i, int i2, String str, boolean z);
    }

    /* renamed from: b */
    public static boolean m79169b(Activity activity, int i, String str, C117747y yVar, Bundle bundle, boolean z, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, int i2) {
        if (i != 416) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
            return false;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "need realname verify");
        return m79171f(activity, yVar, bundle, z, onClickListener, aVar, i2, 2);
    }

    /* renamed from: e */
    public static boolean m79170e(Activity activity, int i, C64320dn3 dn32, Bundle bundle, boolean z, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, int i2, int i3) {
        C64320dn3 dn33 = dn32;
        if (i != 416) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
            return false;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "need realname verify");
        if (dn33 == null) {
            return false;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + dn33.f182785d + ";upload_credit_url=" + dn33.f182789h);
        if (Util.isEqual("1", dn33.f182785d + "")) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
            return m79172h(activity, dn33.f182786e, 0, dn33.f182787f, dn33.f182788g, bundle, z, onClickListener, aVar, i2, i3);
        }
        if (!Util.isEqual("2", dn33.f182785d + "") || Util.isNullOrNil(dn33.f182789h)) {
            Log.m105920e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + dn33.f182785d + ";upload_credit_url=null?" + Util.isNullOrNil(dn33.f182789h));
            return false;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
        m79173i(activity, dn33.f182786e, dn33.f182789h, dn33.f182787f, dn33.f182788g, z, (DialogInterface.OnClickListener) null);
        return true;
    }

    /* renamed from: f */
    public static boolean m79171f(Activity activity, C117747y yVar, Bundle bundle, boolean z, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        C47350c commReqResp;
        C51018qv3 qv32;
        Activity activity2 = activity;
        C117747y yVar2 = yVar;
        JSONObject jSONObject = null;
        String str5 = "";
        if (!(yVar2 == null || !(yVar2 instanceof C75790l) || (commReqResp = ((C75790l) yVar2).getCommReqResp()) == null || (qv32 = ((uf4) commReqResp.f127056b.f127083a).f185731d) == null)) {
            try {
                jSONObject = new JSONObject(C48374j0.m53717f(qv32));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.RealnameVerifyUtil", e, str5, new Object[0]);
            }
        }
        if (jSONObject != null) {
            if (jSONObject.has("real_name_info")) {
                jSONObject = jSONObject.optJSONObject("real_name_info");
            }
            str4 = jSONObject.optString("guide_flag", "0");
            String optString = jSONObject.optString("guide_wording");
            str2 = jSONObject.optString("left_button_wording", activity.getString(C0966R.string.f7926wf));
            str = jSONObject.optString("right_button_wording", activity.getString(C0966R.string.a18));
            str5 = jSONObject.optString("upload_credit_url", str5);
            str3 = optString;
        } else {
            str4 = str5;
            str3 = str4;
            str2 = str3;
            str = str2;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + str4 + ";upload_credit_url=" + str5);
        if ("1".equals(str4)) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
            return m79172h(activity, str3, 0, str2, str, bundle, z, onClickListener, aVar, i, i2);
        } else if (!"2".equals(str4) || Util.isNullOrNil(str5)) {
            Log.m105920e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + str4 + ";upload_credit_url=null?" + Util.isNullOrNil(str5));
            return false;
        } else {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
            m79173i(activity, str3, str5, str2, str, z, (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m79172h(Activity activity, String str, int i, String str2, String str3, Bundle bundle, boolean z, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, int i2, int i3) {
        C67014f fVar;
        Activity activity2 = activity;
        int i4 = i2;
        int i5 = i3;
        Log.m105925i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog call %d", Integer.valueOf(i));
        int i6 = i < 0 ? 1 : i;
        if (i6 == 0) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
            bundle2.putInt("real_name_verify_mode", i6);
            bundle2.putInt("entry_scene", i4);
            C79143a.m95771j(activity, RealNameVerifyProcess.class, bundle2, aVar);
            C75228t.m90245f0(19, 1, Util.nowSecond(), i4);
            return true;
        }
        String string = Util.isNullOrNil(str2) ? activity.getString(C0966R.string.f7926wf) : str2;
        if (i6 < 0 || Util.isNullOrNil(str3)) {
            return false;
        }
        if (onClickListener == null) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
            fVar = new C67014f(z, activity, i5, i4);
        } else {
            fVar = onClickListener;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog show");
        if (i5 == 1) {
            C75228t.m90245f0(7, 1, Util.nowSecond(), i4);
        } else if (i5 == 2) {
            C75228t.m90245f0(10, 1, Util.nowSecond(), i4);
        }
        C77398g B = C76879j.m92708B(activity, str, "", str3, string, new C67015g(bundle, i6, i2, activity, i3), fVar, C0966R.color.akw);
        if (B != null) {
            B.setCancelable(false);
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m79173i(Activity activity, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener) {
        if (Util.isNullOrNil(str3)) {
            str3 = activity.getString(C0966R.string.f7926wf);
        }
        String str5 = str3;
        if (Util.isNullOrNil(str4)) {
            str4 = activity.getString(C0966R.string.a18);
        }
        String str6 = str4;
        if (onClickListener == null) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
            onClickListener = new C67016h(z, activity);
        }
        Activity activity2 = activity;
        String str7 = str;
        C77398g B = C76879j.m92708B(activity2, str7, "", str6, str5, new C67017i(str2, activity, z), onClickListener, C0966R.color.akw);
        if (B == null) {
            return true;
        }
        B.setOnCancelListener(new C67018j(z, activity));
        B.setOnDismissListener(new C67009a(z, activity));
        B.setCanceledOnTouchOutside(false);
        return true;
    }

    /* renamed from: a */
    public final void mo90976a(MMActivity mMActivity, C75280e eVar, String str, String str2, String str3, String str4, C67019k kVar, boolean z, int i) {
        MMActivity mMActivity2 = mMActivity;
        int i2 = i;
        this.f192482e = new WeakReference<>(mMActivity);
        C75280e eVar2 = eVar;
        this.f192483f = new WeakReference<>(eVar);
        WeakReference<MMActivity> weakReference = this.f192482e;
        if (weakReference != null && weakReference.get() != null) {
            this.f192481d = kVar;
            StringBuilder sb = new StringBuilder();
            String str5 = str;
            sb.append(str);
            String str6 = str2;
            sb.append(str2);
            String sb4 = sb.toString();
            C72478z zVar = new C72478z(mMActivity);
            String str7 = str3;
            zVar.f210835d = new C67010b(this, i2, str3, mMActivity);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(mMActivity, sb4);
            SpannableString spannableString = new SpannableString(T1);
            spannableString.setSpan(zVar, T1.length() - str2.length(), T1.length(), 33);
            TextView textView = new TextView(mMActivity);
            textView.setText(spannableString);
            textView.setTextSize(0, (float) C76577a.m92157h(mMActivity, C0966R.dimen.f3881hq));
            textView.setTextColor(mMActivity.getResources().getColorStateList(C0966R.color.a7f));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C75228t.m90245f0(0, 1, Util.nowSecond(), i2);
            this.f192484g = C76879j.m92747r(mMActivity, "", textView, str4, mMActivity.getString(C0966R.string.f7926wf), new C67011c(i2), new C67012d(i2));
        }
    }

    /* renamed from: c */
    public final void mo90977c() {
        if (this.f192484g != null) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : close mDisclaimerDialog");
            this.f192484g = null;
        }
        if (this.f192483f != null) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mNetSceneMgr");
            this.f192483f.clear();
            this.f192483f = null;
        }
        if (this.f192482e != null) {
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mContextReference");
            this.f192482e.clear();
            this.f192482e = null;
        }
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear getDisclaimerCallback");
        this.f192481d = null;
    }

    /* renamed from: d */
    public final void mo90978d(int i, int i2, String str, boolean z) {
        WeakReference<MMActivity> weakReference;
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback call");
        if (this.f192481d != null) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, Integer.valueOf(z ^ true ? 1 : 0));
            if (!this.f192481d.run(i, i2, str, z)) {
                Log.m105920e("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback: errCode = " + i2 + ";errMsg = " + str);
                if (i == 3) {
                    if (!(!Util.isNullOrNil(str) || (weakReference = this.f192482e) == null || weakReference.get() == null)) {
                        str = this.f192482e.get().getString(C0966R.string.l_3);
                    }
                    Log.m105920e("MicroMsg.RealnameVerifyUtil", "show error dialog");
                    C76879j.m92713G(this.f192482e.get(), str, (String) null, false, new C67013e());
                    return;
                }
            }
            C77398g gVar = this.f192484g;
            if (gVar != null) {
                gVar.dismiss();
            }
            mo90977c();
        }
    }

    /* renamed from: g */
    public boolean mo90979g(MMActivity mMActivity, int i, C75280e eVar, C67019k kVar, boolean z, int i2, boolean z2) {
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C75228t.m90245f0(5, 1, Util.nowSecond(), i2);
            if (currentTimeMillis < longValue) {
                Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query is not expired. expiredTime = " + longValue);
                return false;
            }
            Log.m105924i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query had expired. expiredTime = " + longValue);
        }
        if (mMActivity == null) {
            Log.m105920e("MicroMsg.RealnameVerifyUtil", "context is null");
            return false;
        }
        if (eVar == null) {
            Log.m105920e("MicroMsg.RealnameVerifyUtil", "netmgr is null");
        }
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C79310i) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            WeakReference<C75280e> weakReference = this.f192483f;
            if (!(weakReference == null || weakReference.get() == null)) {
                this.f192483f.get().mo95361a();
            }
            if (i == 0 && i2 == 0) {
                C79310i iVar = (C79310i) yVar;
                boolean equals = iVar.f232842d.equals("1");
                if (equals) {
                    Log.m105924i("MicroMsg.RealnameVerifyUtil", "user had agreed");
                    mo90978d(0, i2, str, equals);
                    return;
                }
                mo90976a(this.f192482e.get(), this.f192483f.get(), iVar.f232843e, iVar.f232844f, iVar.f232845g, iVar.f232846h, this.f192481d, false, 0);
                return;
            }
            mo90978d(2, i2, str, false);
        } else if (yVar instanceof C39320d) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(385, this);
            WeakReference<C75280e> weakReference2 = this.f192483f;
            if (!(weakReference2 == null || weakReference2.get() == null)) {
                this.f192483f.get().mo95361a();
            }
            if (i == 0 && i2 == 0) {
                mo90978d(0, i2, str, true);
            } else {
                mo90978d(3, i2, str, false);
            }
        }
    }
}
