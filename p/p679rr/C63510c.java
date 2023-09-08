package p679rr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86301e;
import di3.C86312j;
import dv1.C58435m;
import ei3.C86522b;
import ev1.C58841f;
import ev1.C58843i;
import ev1.C58847k;
import fy3.C32226l;
import gy3.C87412m;
import iv1.C60634a;
import java.util.Map;
import p447aw.C103918d;
import p687sr.C36783f;
import p687sr.C64152d;
import p687sr.C64153e;
import rx3.C13598b0;

@C86522b
/* renamed from: rr.c */
public final class C63510c extends C86301e implements C64153e {
    /* renamed from: Et */
    public void mo88358Et(C64152d dVar) {
        C87412m.m108594g(dVar, "item");
        C58435m mVar = (C58435m) C86312j.m106911c(C58435m.class);
        mVar.getClass();
        C58843i.f168452c.mo84050a().mo84049a((C58841f) dVar);
        if (mVar.yx0()) {
            mVar.Ex0(false);
        } else {
            mVar.Fx0();
        }
    }

    /* renamed from: MQ */
    public C64152d mo88359MQ(String str, String str2, String str3, Map<String, String> map, String str4, Drawable drawable, int i, boolean z, boolean z2, C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "desc");
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "extraParams");
        return new C58841f(str, str2, str3, map2, i, str4, drawable, z, z2, lVar);
    }

    /* renamed from: bj */
    public C36783f mo88360bj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C87412m.m108594g(str, "forcePushId");
        String str13 = str2;
        C87412m.m108594g(str13, "avatarUrl");
        String str14 = str3;
        C87412m.m108594g(str14, "nickname");
        String str15 = str4;
        C87412m.m108594g(str15, "wording");
        String str16 = str5;
        C87412m.m108594g(str16, "feedId");
        String str17 = str6;
        C87412m.m108594g(str17, "liveId");
        String str18 = str7;
        C87412m.m108594g(str18, "nonceId");
        return new C58847k(str, str13, str14, str15, str16, str17, str18, str8, str9, str10, str11, str12);
    }

    /* renamed from: hD */
    public boolean mo88361hD(Context context) {
        C87412m.m108594g(context, "context");
        return ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context);
    }

    public void jc0(Context context, int i, boolean z, C64153e.C64155b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "callback");
        C60634a.f172741a.mo85587a(context, i, z, bVar);
    }

    /* renamed from: mO */
    public void mo88363mO(C36783f fVar) {
        C87412m.m108594g(fVar, "item");
        ((C58435m) C86312j.m106911c(C58435m.class)).Cx0((C58847k) fVar);
    }
}
