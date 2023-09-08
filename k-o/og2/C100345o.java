package og2;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p1081gi.C98124g;
import p654pw.C100972d;
import qg2.C101147j0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C77915dp3;
import z04.C112551y;

@C86522b
/* renamed from: og2.o */
public final class C100345o extends C86301e implements C100972d {
    /* renamed from: B6 */
    public C98124g mo139622B6(String str, String str2, C101834rc0 rc02) {
        C87412m.m108594g(str, "taskName");
        C87412m.m108594g(str2, "fullPath");
        C87412m.m108594g(rc02, "favDataItem");
        C98124g gVar = new C98124g();
        gVar.f287660d = str;
        gVar.field_mediaId = rc02.f299280T;
        boolean z = false;
        gVar.f287661e = false;
        gVar.field_priority = 2;
        gVar.field_totalLen = (int) rc02.f299336x0;
        gVar.field_filemd5 = rc02.f299288X;
        gVar.field_fullpath = str2;
        if (rc02.f299258I != 5 || rc02.f299263K1 == 0) {
            String str3 = rc02.f299309j;
            if (!(str3 == null || C112551y.m153811k(str3))) {
                String str4 = rc02.f299305h;
                if (str4 == null || C112551y.m153811k(str4)) {
                    z = true;
                }
                if (!z) {
                    gVar.field_fileType = 1;
                    gVar.field_aesKey = rc02.f299309j;
                    gVar.field_fileId = rc02.f299305h;
                }
            }
            gVar.field_fileType = 19;
            gVar.field_authKey = rc02.f299340y1;
            gVar.field_aesKey = rc02.f299243A1;
            gVar.f287672s = rc02.f299334w1;
            gVar.field_fileId = "";
        } else {
            String str5 = rc02.f299334w1;
            if (str5 == null || C112551y.m153811k(str5)) {
                z = true;
            }
            if (z) {
                gVar.field_fileType = 3;
                gVar.field_aesKey = rc02.f299309j;
                gVar.field_fileId = rc02.f299305h;
            } else {
                gVar.field_fileType = 19;
                gVar.field_authKey = rc02.f299340y1;
                gVar.field_aesKey = rc02.f299243A1;
                gVar.f287672s = rc02.f299334w1;
                gVar.field_fileId = "";
            }
        }
        return gVar;
    }

    /* renamed from: dL */
    public String mo139623dL(String str, String str2, C101801kd0 kd02) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "desc");
        C87412m.m108594g(kd02, "protoItem");
        String J = C101147j0.m132617J(str, str2, "", kd02, kd02.f298618f);
        C87412m.m108593f(J, "toRecordInfo(title, desc…Item, protoItem.dataList)");
        return J;
    }

    public C77915dp3 f90(String str) {
        C87412m.m108594g(str, "xml");
        return C101147j0.m132643x(str);
    }

    /* renamed from: gn */
    public String mo139625gn(C101834rc0 rc02, long j, int i) {
        C87412m.m108594g(rc02, "dataItem");
        String D = C101147j0.m132611D(rc02, j, i);
        C87412m.m108593f(D, "getThumbPath(dataItem, msgId, embeddedNum)");
        return D;
    }

    public C98124g hf0(String str, String str2, C101834rc0 rc02) {
        C87412m.m108594g(str, "taskName");
        C87412m.m108594g(str2, "fullPath");
        C87412m.m108594g(rc02, "favDataItem");
        C98124g gVar = new C98124g();
        gVar.f287660d = str;
        gVar.field_mediaId = rc02.f299280T;
        boolean z = false;
        gVar.f287661e = false;
        gVar.field_priority = 2;
        gVar.field_totalLen = (int) rc02.f299276R;
        gVar.field_fullpath = str2;
        gVar.field_filemd5 = rc02.f299266M;
        String str3 = rc02.f299329u;
        if (!(str3 == null || C112551y.m153811k(str3))) {
            String str4 = rc02.f299325s;
            if (str4 == null || C112551y.m153811k(str4)) {
                z = true;
            }
            if (!z) {
                gVar.field_fileType = C101147j0.m132635p(rc02.f299258I, (int) rc02.f299276R);
                gVar.field_aesKey = rc02.f299329u;
                gVar.field_fileId = rc02.f299325s;
                return gVar;
            }
        }
        gVar.field_fileType = 19;
        gVar.field_authKey = rc02.f299340y1;
        gVar.field_aesKey = rc02.f299337x1;
        gVar.f287672s = rc02.f299342z1;
        gVar.field_fileId = "";
        return gVar;
    }

    /* renamed from: sJ */
    public String mo139627sJ(C101834rc0 rc02, long j, int i) {
        C87412m.m108594g(rc02, "dataItem");
        String q = C101147j0.m132636q(rc02, j, i);
        C87412m.m108593f(q, "getDataPath(dataItem, msgId, embeddedNum)");
        return q;
    }
}
