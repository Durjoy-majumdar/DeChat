package p000ag;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import e42.C7596h;
import e42.C86432k;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import lg3.C88494d;
import p156gj.C87203t;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: ag.a */
public final class C39562a extends C86432k<C79538i> {

    /* renamed from: c */
    public final C13601g f106209c = C36568h.m40985a(C39563a.f106210d);

    /* renamed from: ag.a$a */
    public static final class C39563a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C39563a f106210d = new C39563a();

        public C39563a() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(MMApplicationContext.isMainProcess() ? MMApplicationContext.getContext().getResources().getDisplayMetrics().density : C88494d.m110348d().density);
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "getSystemInfoSync";
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        int i;
        int i2;
        C87412m.m108594g(hVar, "data");
        C79538i iVar = (C79538i) this.f251227a;
        if (iVar != null) {
            FrameLayout frameLayout = iVar.f233193b;
            if (frameLayout != null) {
                i = C60641c.m70921b(Integer.valueOf(frameLayout.getWidth()).floatValue() / ((Number) ((C36570n) this.f106209c).getValue()).floatValue());
            } else {
                C87412m.m108603p("playableContainerView");
                throw null;
            }
        } else {
            i = 0;
        }
        C79538i iVar2 = (C79538i) this.f251227a;
        if (iVar2 != null) {
            FrameLayout frameLayout2 = iVar2.f233193b;
            if (frameLayout2 != null) {
                i2 = C60641c.m70921b(Integer.valueOf(frameLayout2.getHeight()).floatValue() / ((Number) ((C36570n) this.f106209c).getValue()).floatValue());
            } else {
                C87412m.m108603p("playableContainerView");
                throw null;
            }
        } else {
            i2 = 0;
        }
        C13604l[] lVarArr = new C13604l[15];
        lVarArr[0] = new C13604l("brand", Build.BRAND);
        lVarArr[1] = new C13604l("model", C87203t.m108275k());
        lVarArr[2] = new C13604l("pixelRatio", Float.valueOf(((Number) ((C36570n) this.f106209c).getValue()).floatValue()));
        lVarArr[3] = new C13604l("screenWidth", Integer.valueOf(i));
        lVarArr[4] = new C13604l("screenHeight", Integer.valueOf(i2));
        lVarArr[5] = new C13604l("windowWidth", Integer.valueOf(i));
        lVarArr[6] = new C13604l("windowHeight", Integer.valueOf(i2));
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
        lVarArr[12] = new C13604l("benchmarkLevel", -1);
        lVarArr[13] = new C13604l("theme", C85875k4.m106211z() ? "dark" : "light");
        int i3 = MMApplicationContext.getResources().getConfiguration().orientation;
        lVarArr[14] = new C13604l("deviceOrientation", 2 == i3 ? "landscape" : 1 == i3 ? "portrait" : "");
        return mo120846k(C90364q0.m113146e(lVarArr));
    }
}
