package ea3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C40490e;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import js0.C46574u;
import js0.C9512b;
import p156gj.C87203t;
import qe3.C89625d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: ea3.j */
public final class C45596j implements C46574u.C46575a {

    /* renamed from: f */
    public static final C45597b f123315f = new C45597b((C8480h) null);

    /* renamed from: g */
    public static final C13601g<MultiProcessMMKV> f123316g = C36568h.m40985a(C31444a.f84152d);

    /* renamed from: d */
    public final Context f123317d;

    /* renamed from: e */
    public String f123318e = "";

    /* renamed from: ea3.j$a */
    public static final class C31444a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C31444a f84152d = new C31444a();

        public C31444a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("WebPrefetchUserAgent");
        }
    }

    /* renamed from: ea3.j$b */
    public static final class C45597b {
        public C45597b(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo71117a() {
            String string = ((MultiProcessMMKV) ((C36570n) C45596j.f123316g).getValue()).getString("key_web_prefetch_ua", "Mozilla/5.0 (Linux; Android 9;) AppleWebKit/unknown (KHTML, like Gecko) Version/unknown Chrome/unknown Mobile Safari/unknown ");
            return !(string == null || C112551y.m153811k(string)) ? string : "Mozilla/5.0 (Linux; Android 9;) AppleWebKit/unknown (KHTML, like Gecko) Version/unknown Chrome/unknown Mobile Safari/unknown ";
        }
    }

    public C45596j(Context context) {
        C87412m.m108594g(context, "mContext");
        this.f123317d = context;
    }

    /* renamed from: I4 */
    public String mo63272I4() {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(this.f123318e)) {
            return this.f123318e;
        }
        try {
            packageInfo = C9512b.m9207a(this.f123317d, MMApplicationContext.getPackageName());
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f123318e += ChannelUtil.formatVersion((Context) null, C89625d.f257841g);
            this.f123318e += '.' + packageInfo.versionCode;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f123318e);
            sb.append('(');
            String format = String.format("0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            sb.append(format);
            sb.append("; MicroMessenger/Prefetcher 2.0)");
            this.f123318e = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f123318e);
            sb4.append(" WeChat/");
            sb4.append(C87203t.m108279o() ? "arm64" : "arm32");
            this.f123318e = sb4.toString();
            this.f123318e += ' ' + WeChatBrands.AppInfo.current().getUserAgent();
            if (ChannelUtil.isGPVersion()) {
                this.f123318e += " GPVersion/1";
            }
        }
        String a = C40490e.m43714a(this.f123318e);
        C87412m.m108593f(a, "appendTabletTag(version)");
        this.f123318e = a;
        return a;
    }

    public String identity() {
        return " MicroMessenger/";
    }
}
