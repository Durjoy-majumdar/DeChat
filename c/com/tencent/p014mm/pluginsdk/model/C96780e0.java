package com.tencent.p014mm.pluginsdk.model;

import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p1081gi.C98124g;
import pb1.C100719k0;
import pb1.C100734q;
import te3.C101834rc0;

@C86522b
/* renamed from: com.tencent.mm.pluginsdk.model.e0 */
public final class C96780e0 extends C86301e implements C100719k0 {
    /* renamed from: L2 */
    public String mo135045L2(C101834rc0 rc02) {
        C87412m.m108594g(rc02, "dataItem");
        String w = C100734q.m131880w(rc02);
        C87412m.m108593f(w, "getDataPath(dataItem)");
        return w;
    }

    public C98124g Pn0(String str, C101834rc0 rc02) {
        C87412m.m108594g(str, "taskName");
        C87412m.m108594g(rc02, "dataItem");
        C98124g gVar = new C98124g();
        gVar.f287660d = str;
        gVar.field_mediaId = rc02.f299280T;
        gVar.f287663g = 2;
        gVar.field_appType = 10;
        gVar.f287661e = false;
        gVar.field_totalLen = (int) rc02.f299276R;
        gVar.field_aesKey = rc02.f299329u;
        gVar.field_fileId = rc02.f299325s;
        gVar.field_priority = 2;
        gVar.field_fullpath = C100734q.m131880w(rc02) + ".temp";
        gVar.field_needStorage = true;
        gVar.f287657N = 4;
        return gVar;
    }

    public String i50(C101834rc0 rc02) {
        C87412m.m108594g(rc02, "dataItem");
        String Q = C100734q.m131826Q(rc02);
        C87412m.m108593f(Q, "getThumbPath(dataItem)");
        return Q;
    }

    public C98124g je0(String str, C101834rc0 rc02) {
        C87412m.m108594g(str, "taskName");
        C87412m.m108594g(rc02, "dataItem");
        C98124g gVar = new C98124g();
        gVar.f287660d = str;
        gVar.field_mediaId = C100734q.m131825P(rc02.f299280T);
        gVar.f287663g = 2;
        gVar.field_appType = 10;
        gVar.f287661e = false;
        gVar.field_totalLen = (int) rc02.f299336x0;
        gVar.field_aesKey = rc02.f299309j;
        gVar.field_fileId = rc02.f299305h;
        gVar.field_priority = 2;
        gVar.field_fullpath = C100734q.m131826Q(rc02) + ".temp";
        gVar.field_needStorage = true;
        gVar.f287657N = 4;
        return gVar;
    }
}
