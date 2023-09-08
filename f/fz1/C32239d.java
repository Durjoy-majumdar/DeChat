package fz1;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Arrays;
import p763ym.C102870n;
import wy1.C53224d;

/* renamed from: fz1.d */
public final class C32239d implements C102870n.C102872b {
    /* renamed from: A5 */
    public boolean mo58538A5(C68070l lVar, boolean z) {
        if (lVar == null) {
            return false;
        }
        boolean insertNotify = ((C53224d) C86312j.m106911c(C53224d.class)).xx0().insertNotify(mo58542d(lVar), z);
        Log.m105924i("GameLife.AppMessageInterceptor", "[insert ret:" + insertNotify + "] appid:" + lVar.field_appId + " title:" + lVar.field_title + " desc:" + lVar.field_description + " type:" + lVar.field_type + " msgId:" + lVar.field_msgId);
        return insertNotify;
    }

    /* renamed from: V0 */
    public boolean mo58539V0(C68070l lVar, boolean z, String... strArr) {
        C87412m.m108594g(strArr, "keys");
        if (lVar == null) {
            return false;
        }
        boolean updateNotify = ((C53224d) C86312j.m106911c(C53224d.class)).xx0().updateNotify(mo58542d(lVar), z, (String[]) Arrays.copyOf(strArr, strArr.length));
        Log.m105924i("GameLife.AppMessageInterceptor", "[update ret:" + updateNotify + "] appid:" + lVar.field_appId + " title:" + lVar.field_title + " desc:" + lVar.field_description + " type:" + lVar.field_type + " msgId:" + lVar.field_msgId);
        return updateNotify;
    }

    /* renamed from: a0 */
    public C68070l mo58540a0(long j) {
        C32238c cVar = new C32238c();
        cVar.field_msgId = j;
        if (!((C53224d) C86312j.m106911c(C53224d.class)).xx0().get(cVar, new String[0])) {
            Log.m105924i("GameLife.AppMessageInterceptor", "[get] msg:" + j + " not found!");
            return null;
        }
        Log.m105924i("GameLife.AppMessageInterceptor", "[get] appId:" + cVar.field_appId + " title:" + cVar.field_title + " desc:" + cVar.field_description + " type:" + cVar.field_type + " msgId:" + cVar.field_msgId);
        C68070l lVar = new C68070l();
        lVar.field_appId = cVar.field_appId;
        lVar.field_description = cVar.field_description;
        lVar.field_msgId = cVar.field_msgId;
        lVar.field_source = cVar.field_source;
        lVar.field_title = cVar.field_title;
        lVar.field_type = cVar.field_type;
        lVar.field_xml = cVar.field_xml;
        return lVar;
    }

    /* renamed from: c1 */
    public boolean mo58541c1(C68070l lVar, boolean z) {
        if (lVar == null) {
            return false;
        }
        boolean replace = ((C53224d) C86312j.m106911c(C53224d.class)).xx0().replace(mo58542d(lVar), z);
        Log.m105924i("GameLife.AppMessageInterceptor", "[replace ret:" + replace + "] appid:" + lVar.field_appId + " title:" + lVar.field_title + " desc:" + lVar.field_description + " type:" + lVar.field_type + " msgId:" + lVar.field_msgId);
        return replace;
    }

    /* renamed from: d */
    public final C32238c mo58542d(C68070l lVar) {
        C87412m.m108594g(lVar, "<this>");
        C32238c cVar = new C32238c();
        cVar.field_appId = lVar.field_appId;
        cVar.field_description = lVar.field_description;
        cVar.field_msgId = lVar.field_msgId;
        cVar.field_source = lVar.field_source;
        cVar.field_title = lVar.field_title;
        cVar.field_type = lVar.field_type;
        cVar.field_xml = lVar.field_xml;
        return cVar;
    }

    /* renamed from: t1 */
    public boolean mo58543t1(long j) {
        return (j >= 4500001 && j <= 5000000) || (j >= 208000001 && j <= 308000000);
    }
}
