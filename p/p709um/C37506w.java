package p709um;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p000ag.C79536d;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: um.w */
public final class C37506w extends C86301e {

    /* renamed from: um.w$a */
    public static final class C37507a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C37507a f99091d = new C37507a();

        public C37507a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            return new C79536d();
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_PLAYABLE, C37507a.f99091d);
    }
}
