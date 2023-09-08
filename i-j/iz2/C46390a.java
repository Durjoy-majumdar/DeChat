package iz2;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C0363p0;
import uz2.C52713s;

/* renamed from: iz2.a */
public final class C46390a {
    /* renamed from: a */
    public static final IEmojiInfo m51721a(C52713s sVar) {
        C87412m.m108594g(sVar, "<this>");
        IEmojiInfo zE = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo404zE();
        zE.setMd5(m51722b(sVar.f147197d, zE.getMd5()));
        zE.mo62653a1(m51722b(sVar.f147198e, zE.mo62686o1()));
        zE.mo62636I(m51722b(sVar.f147199f, zE.getThumbUrl()));
        zE.mo62691s(m51722b(sVar.f147200g, zE.mo62685o0()));
        zE.mo62658e1(m51722b(sVar.f147201h, zE.mo62660g2()));
        zE.setAesKey(m51722b(sVar.f147202i, zE.getAesKey()));
        zE.mo62634E(m51722b(sVar.f147203j, zE.getGroupId()));
        zE.mo62638I1(m51722b(sVar.f147204n, zE.mo62631C()));
        zE.mo62689q1(m51722b(sVar.f147205o, zE.mo62644P1()));
        zE.mo62649V0(m51722b(sVar.f147206p, zE.mo62684n()));
        zE.mo62697x0(m51722b(sVar.f147207q, zE.mo62646T()));
        zE.mo62630A(m51722b(sVar.f147208r, zE.mo62683m1()));
        zE.mo62677j2(m51722b(sVar.f147209s, zE.mo62635F0()));
        return zE;
    }

    /* renamed from: b */
    public static final String m51722b(String str, String str2) {
        return Util.isNullOrNil(str) ? str2 == null ? "" : str2 : str;
    }
}
