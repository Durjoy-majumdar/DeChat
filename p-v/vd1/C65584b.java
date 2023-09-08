package vd1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58684b;
import er1.C7782b1;
import er1.C7878t0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.math.BigInteger;
import java.util.regex.Pattern;
import ke3.C88144b;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import p763ym.C79138l;
import qc0.C101106m;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C49018cl1;
import te3.C51286sr0;
import te3.C64719t23;
import te3.C64726td1;
import tf0.C64916p1;
import up1.C65417k0;

/* renamed from: vd1.b */
public final class C65584b {

    /* renamed from: a */
    public static final C65584b f188718a = new C65584b();

    /* renamed from: vd1.b$a */
    public static final class C14430a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f40034d;

        /* renamed from: e */
        public final /* synthetic */ Context f40035e;

        /* renamed from: f */
        public final /* synthetic */ C49018cl1 f40036f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14430a(String str, Context context, C49018cl1 cl12) {
            super(1);
            this.f40034d = str;
            this.f40035e = context;
            this.f40036f = cl12;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Log.m105924i("FinderMusicTopicUtils", "OpenLiteApp: " + this.f40034d + " sucess");
            } else {
                Log.m105924i("FinderMusicTopicUtils", "OpenLiteApp: " + this.f40034d + " failed");
                Context context = this.f40035e;
                String str = this.f40036f.f131809f;
                C87412m.m108594g(context, "context");
                if (!(str == null || str.length() == 0)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public static void m77267d(C65584b bVar, Context context, String str, String str2, int i, Object obj) {
        Context context2 = context;
        String str3 = str;
        String str4 = (i & 4) != 0 ? "" : str2;
        bVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(str4, "kv");
        Intent intent = new Intent();
        intent.putExtra("finder_username", str3);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", str4);
        intent.putExtra("key_enter_profile_tab", 5);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 1, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
    }

    /* renamed from: f */
    public static /* synthetic */ void m77268f(C65584b bVar, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        bVar.mo89661e(view, i, i2, i3, (i5 & 16) != 0 ? 2 : i4);
    }

    /* renamed from: a */
    public final void mo89658a(Activity activity, C64726td1 td12) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (td12 != null) {
            C65417k0 k0Var = C65417k0.f188264a;
            String str = td12.f185534d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            C101106m a = k0Var.mo89510a(td12, str, 13);
            C64719t23 t232 = new C64719t23();
            t232.f185463h = td12.f185537g;
            t232.f185464i = td12.f185538h;
            t232.f185469q = td12.f185543p;
            t232.f185473u = td12.f185536f;
            String str3 = td12.f185535e;
            t232.f185475w = str3;
            t232.f185472t = str3;
            t232.f185461f = str3;
            String str4 = td12.f185534d;
            if (str4 != null) {
                str2 = str4;
            }
            t232.f185470r = str2;
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            C101834rc0 rc02 = new C101834rc0();
            rd02.mo141275k(C75592q0.m90789s());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(31);
            rd02.mo141273f(Util.nowMilliSecond());
            rd02.mo141278n(a.f295954P);
            if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(a.f295972t)) {
                rd02.mo141272d(a.f295972t);
            }
            rc02.mo141240O(a.f295966n);
            rc02.mo141241P(a.f295967o);
            rc02.mo141242Q(a.f295968p);
            rc02.mo141267w(a.f295976x);
            rc02.mo141231E(true);
            rc02.mo141232F(true);
            rc02.mo141246U(a.f295962g);
            rc02.mo141265u(a.f295963h);
            rc02.mo141260p(29);
            rc02.mo141235I(a.f295976x);
            rc02.mo141236J(a.f295969q);
            C101841sc0 sc02 = new C101841sc0();
            sc02.f299401C = t232;
            rc02.f299296c1 = sc02;
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264679d = a.f295962g;
            aVar.f264680e = a.f295963h;
            aVar.f264676a = kd02;
            aVar.f264678c = 21;
            kd02.mo141219q(rd02);
            kd02.f298618f.add(rc02);
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            aVar2.f264684i = activity;
            aVar2.f264688m = 3;
            doFavoriteEvent.publish();
        }
    }

    /* renamed from: b */
    public final C13604l<Integer, Integer> mo89659b(FinderJumpInfo finderJumpInfo) {
        NativeInfo nativeInfo;
        String str;
        if (!(finderJumpInfo == null || (nativeInfo = finderJumpInfo.native_info) == null || (str = nativeInfo.necessary_params) == null)) {
            Log.m105924i("FinderMusicTopicUtils", "[getOpParams] necessaryParams:" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C13604l<>(Integer.valueOf(jSONObject.optInt("op_switch", 0)), Integer.valueOf(jSONObject.optInt("hide_flag", 0)));
            } catch (JSONException unused) {
            }
        }
        return new C13604l<>(0, 0);
    }

    /* renamed from: c */
    public final void mo89660c(Context context, C49018cl1 cl12) {
        String str;
        String str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cl12, "singerInfo");
        C51286sr0 sr02 = cl12.f131811h;
        String str3 = sr02 != null ? sr02.f141695d : null;
        Bundle bundle = new Bundle();
        C51286sr0 sr03 = cl12.f131811h;
        String str4 = "";
        if (sr03 == null || (str = sr03.f141696e) == null) {
            str = str4;
        }
        if (!(sr03 == null || (str2 = sr03.f141697f) == null)) {
            str4 = str2;
        }
        bundle.putString("appId", str3);
        bundle.putString(SearchIntents.EXTRA_QUERY, str4);
        bundle.putInt("nextAnimIn", C0966R.C0968anim.f2503er);
        bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
        Log.m105924i("FinderMusicTopicUtils", "OpenLiteApp: " + str3 + ", page:" + str + " query:" + str4);
        C7782b1 b1Var = C7782b1.f26282a;
        String str5 = cl12.f131809f;
        boolean z = false;
        if (!b1Var.mo8894a(context, bundle, !(str5 == null || str5.length() == 0), new C14430a(str3, context, cl12))) {
            String str6 = cl12.f131809f;
            if (str6 == null || str6.length() == 0) {
                z = true;
            }
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str6);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo89661e(View view, int i, int i2, int i3, int i4) {
        String str;
        Context context = view != null ? view.getContext() : null;
        if (context != null) {
            TextView textView = (TextView) view.findViewById(i);
            if (i3 == 0) {
                textView.setVisibility(8);
                return;
            }
            if (((C64916p1) C86312j.m106911c(C64916p1.class)).J30(i4)) {
                Pattern pattern = C61926c.f176038a;
                str = C7878t0.m8036e(new BigInteger(Integer.toBinaryString(i3), 2).longValue());
            } else {
                str = C7878t0.m8039h(i3);
            }
            if (textView != null) {
                textView.setText(context.getResources().getString(i2, new Object[]{str}));
            }
        }
    }
}
