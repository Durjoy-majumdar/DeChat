package p484cx;

import android.content.Context;
import bl3.C39818r;
import ck2.C54914j0;
import com.tencent.p014mm.autogen.mmdata.rpt.ring_author_clickStruct;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p145dx.C7525r;
import xj2.C66286a;

@C86522b
/* renamed from: cx.q */
public final class C57997q extends C86301e implements C7525r {
    /* renamed from: rm */
    public void mo8650rm(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "feedId");
        C87412m.m108594g(str2, "username");
        ((C54914j0) C39818r.f106831a.mo62443b(context).mo75002a(C54914j0.class)).getClass();
        C66286a.m78216c(5, str, 2, str2, false, false, 48, (Object) null);
    }

    public void sl0(String str, long j) {
        C87412m.m108594g(str, "feedId");
        ring_author_clickStruct ring_author_clickstruct = new ring_author_clickStruct();
        ring_author_clickstruct.f156978d = ring_author_clickstruct.mo86045b("feedid", str, true);
        ring_author_clickstruct.f156979e = j;
        ring_author_clickstruct.mo86054n();
    }
}
