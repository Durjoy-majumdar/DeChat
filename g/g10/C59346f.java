package g10;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import l10.C61183b;
import l10.C61184c;
import te3.C64311db1;
import te3.C64726td1;
import te3.C64770ve1;

/* renamed from: g10.f */
public final class C59346f {
    /* renamed from: a */
    public static final C61183b m69264a(FinderObject finderObject) {
        C64770ve1 ve12;
        C64726td1 td12;
        C87412m.m108594g(finderObject, "<this>");
        C61183b bVar = new C61183b();
        bVar.f174165d = ((long) finderObject.createtime) * 1000;
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        String str = null;
        bVar.f174169h = finderObjectDesc != null ? finderObjectDesc.description : null;
        bVar.f174166e = finderObject.f164794id;
        bVar.f174167f = finderObject.objectNonceId;
        bVar.f174168g = finderObjectDesc != null ? m69265b(finderObjectDesc.mediaType) : 0;
        FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
        LinkedList<FinderMedia> linkedList = finderObjectDesc2 != null ? finderObjectDesc2.media : null;
        if (linkedList != null) {
            for (FinderMedia finderMedia : linkedList) {
                C61184c cVar = new C61184c();
                cVar.f174174e = finderMedia.url;
                cVar.f174175f = finderMedia.url_token;
                cVar.f174176g = finderMedia.thumbUrl;
                cVar.f174177h = finderMedia.thumb_url_token;
                cVar.f174178i = finderMedia.decodeKey;
                cVar.f174173d = m69265b(finderMedia.mediaType);
                bVar.f174170i.add(cVar);
            }
        }
        FinderObjectDesc finderObjectDesc3 = finderObject.objectDesc;
        C64311db1 db12 = finderObjectDesc3 != null ? finderObjectDesc3.location : null;
        if (db12 != null) {
            bVar.f174171j = ((C60200t1) C86312j.m106911c(C60200t1.class)).S20(db12.f182663f, db12.f182664g);
        }
        FinderObjectDesc finderObjectDesc4 = finderObject.objectDesc;
        if (!(finderObjectDesc4 == null || (ve12 = finderObjectDesc4.feedBgmInfo) == null || (td12 = ve12.f185873d) == null)) {
            str = td12.f185539i;
        }
        bVar.f174172n = str;
        return bVar;
    }

    /* renamed from: b */
    public static final int m69265b(int i) {
        if (i == 2) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 9) {
            return 2;
        }
        throw new IllegalArgumentException("Unsupported type: " + i);
    }
}
