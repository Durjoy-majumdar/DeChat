package d52;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.HashMap;
import lg3.C88494d;
import p156gj.C87203t;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: d52.a */
public final class C45263a {

    /* renamed from: a */
    public final C13601g f122615a = C36568h.m40985a(C45264a.f122616d);

    /* renamed from: d52.a$a */
    public static final class C45264a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C45264a f122616d = new C45264a();

        public C45264a() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(MMApplicationContext.isMainProcess() ? MMApplicationContext.getContext().getResources().getDisplayMetrics().density : C88494d.m110348d().density);
        }
    }

    /* renamed from: a */
    public final HashMap<String, Object> mo70801a() {
        DisplayMetrics displayMetrics = MMApplicationContext.getContext().getResources().getDisplayMetrics();
        C87412m.m108593f(displayMetrics, "getContext().resources.displayMetrics");
        int b = C60641c.m70921b(Integer.valueOf(displayMetrics.widthPixels).floatValue() / ((Number) ((C36570n) this.f122615a).getValue()).floatValue());
        int b2 = C60641c.m70921b(Integer.valueOf(displayMetrics.heightPixels).floatValue() / ((Number) ((C36570n) this.f122615a).getValue()).floatValue());
        String str = C85875k4.m106211z() ? "dark" : "light";
        Log.m105924i(StringKtKt.TAG, "systemInfo theme=" + str);
        C13604l[] lVarArr = new C13604l[14];
        lVarArr[0] = new C13604l("brand", Build.BRAND);
        lVarArr[1] = new C13604l("model", C87203t.m108275k());
        lVarArr[2] = new C13604l("pixelRatio", Float.valueOf(((Number) ((C36570n) this.f122615a).getValue()).floatValue()));
        lVarArr[3] = new C13604l("screenWidth", Integer.valueOf(b));
        lVarArr[4] = new C13604l("screenHeight", Integer.valueOf(b2));
        lVarArr[5] = new C13604l("windowWidth", Integer.valueOf(b));
        lVarArr[6] = new C13604l("windowHeight", Integer.valueOf(b2));
        lVarArr[7] = new C13604l(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        lVarArr[8] = new C13604l(ProviderConstants.API_COLNAME_FEATURE_VERSION, ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT));
        lVarArr[9] = new C13604l("system", "Android " + Build.VERSION.RELEASE);
        lVarArr[10] = new C13604l("platform", Platform.ANDROID);
        float f = (float) 16;
        float f2 = 1.0f;
        try {
            f2 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getFloat("text_size_scale_key", 1.0f);
        } catch (Exception unused) {
        }
        lVarArr[11] = new C13604l("fontSizeSetting", Integer.valueOf(C60641c.m70921b(f * f2)));
        lVarArr[12] = new C13604l("theme", str);
        int i = MMApplicationContext.getResources().getConfiguration().orientation;
        lVarArr[13] = new C13604l("deviceOrientation", 2 == i ? "landscape" : 1 == i ? "portrait" : "");
        return C90364q0.m113146e(lVarArr);
    }
}
