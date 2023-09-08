package xm1;

import android.content.Context;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: xm1.c0 */
public final class C15824c0 {

    /* renamed from: a */
    public static final C32227p<String, String, C13598b0> f42631a = C15825a.f42632d;

    /* renamed from: xm1.c0$a */
    public static final class C15825a extends C87413o implements C32227p<String, String, C13598b0> {

        /* renamed from: d */
        public static final C15825a f42632d = new C15825a();

        public C15825a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "msg");
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                Context context = MMApplicationContext.getContext();
                C76912y0.m92770i(context, "测试包消息：" + str + 10 + str2);
            }
            return C13598b0.f38549a;
        }
    }
}
