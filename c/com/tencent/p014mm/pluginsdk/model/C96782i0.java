package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedList;
import p654pw.C100972d;
import pb1.C100697a1;
import pb1.C100734q;
import sx3.C64197v;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C77915dp3;
import z04.C112551y;

@C86522b
/* renamed from: com.tencent.mm.pluginsdk.model.i0 */
public final class C96782i0 extends C86301e implements C100697a1 {
    /* renamed from: T7 */
    public C101801kd0 mo135049T7(String str) {
        C77915dp3 a;
        C87412m.m108594g(str, "recordInfo");
        if (!C100734q.m131843d0() || (a = C96785k0.m124244a(str)) == null) {
            return null;
        }
        C101801kd0 kd02 = new C101801kd0();
        kd02.mo141220r(a.f227153d);
        kd02.mo141212j(a.f227154e);
        LinkedList<C101834rc0> linkedList = a.f227155f;
        C87412m.m108593f(linkedList, "recordMsgData.items");
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                kd02.f298618f.add((C101834rc0) next);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return kd02;
    }

    public String tn0(String str, String str2, C101801kd0 kd02, int i) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "desc");
        C87412m.m108594g(kd02, "protoItem");
        String dL = ((C100972d) C86312j.m106911c(C100972d.class)).mo139623dL(str, str2, kd02);
        return i != 35 ? C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153816p(dL, "cdndataurl", "cdn_dataurl", false, 4, (Object) null), "cdndatakey", "cdn_datakey", false), "cdnthumburl", "cdn_thumburl", false), "cdnthumbkey", "cdn_thumbkey", false), "datasize", "fullsize", false), "thumbsize", "thumbfullsize", false), "sourcename", "datasrcname", false), "sourcetime", "datasrctime", false), "streamlowbandurl", "stream_lowbandurl", false), "streamdataurl", "stream_dataurl", false), "streamweburl", "stream_weburl", false) : dL;
    }
}
