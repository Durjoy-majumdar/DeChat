package wq1;

import android.database.Cursor;
import ar1.C54320d;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr1.C57981d;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import te3.C64736tq2;
import up1.C37521f;
import up1.C65418l;
import wp1.C66165b;
import xq1.C66403b;
import xq1.C66406d;
import xq1.C66408e;
import xq1.C66413j;
import yq1.C66692a;
import zq1.C66966h;
import zq1.C66973n;

/* renamed from: wq1.d */
public final class C66175d extends C66406d {

    /* renamed from: b */
    public final String f190186b = "PostLog.FinderPipeline";

    /* renamed from: c */
    public final C66403b f190187c = new C66403b("FinderPlDefault", 1);

    /* renamed from: d */
    public final Map<Integer, C66403b> f190188d;

    /* renamed from: e */
    public final C66176e f190189e;

    public C66175d() {
        C66403b bVar = new C66403b("FinderPlResult", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new C66403b("FinderMediaProcessStage", 1));
        linkedHashMap.put(2, new C66403b("FinderMediaProcessStage", 1));
        linkedHashMap.put(3, new C66403b("FinderUploadStage", 1));
        linkedHashMap.put(4, new C66403b("FinderPostCgiStage", 1));
        linkedHashMap.put(100, bVar);
        this.f190188d = linkedHashMap;
        this.f190189e = new C66176e();
    }

    /* renamed from: b */
    public final void mo90271b(C66408e eVar) {
        C66413j c;
        Class cls = FinderCommonFeatureService.class;
        FinderItem qq = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Dx0().mo13665qq();
        Integer num = null;
        if (qq != null) {
            String str = this.f190186b;
            StringBuilder sb = new StringBuilder();
            sb.append("checking post-waiting finder feed from db, next will post: ");
            sb.append(qq.getLocalId());
            sb.append(' ');
            sb.append(qq.getCreateTime());
            sb.append(' ');
            C64736tq2 postInfo = qq.getPostInfo();
            if (postInfo != null) {
                num = Integer.valueOf(postInfo.f185646e);
            }
            sb.append(num);
            Log.m105924i(str, sb.toString());
            C66413j c2 = mo90272c(qq);
            if (c2 != null) {
                mo90504a(c2);
                return;
            }
            return;
        }
        C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0();
        C65418l lVar = new C65418l();
        String str2 = "SELECT * FROM FinderDraftItem  WHERE " + Cx0.f190166e + " AND " + Cx0.f190167f + " AND " + Cx0.f190169h + " ORDER BY " + Cx0.f190165d + ".localId ASC LIMIT 1";
        Cursor rawQuery = Cx0.f190170i.rawQuery(str2, (String[]) null, 2);
        Log.m105924i("Finder.FinderDraftStorage", "getWaitingPost " + str2);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            lVar = null;
        } else {
            lVar.convertFrom(rawQuery);
            rawQuery.close();
        }
        String str3 = this.f190186b;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("checking post-waiting finder draft from db, next will post: ");
        sb4.append(lVar != null ? Long.valueOf(lVar.field_localId) : null);
        sb4.append(' ');
        if (lVar != null) {
            num = Integer.valueOf(lVar.field_createTime);
        }
        sb4.append(num);
        Log.m105924i(str3, sb4.toString());
        if (lVar != null && (c = mo90272c(lVar)) != null) {
            mo90504a(c);
        } else if (eVar != null && !C87412m.m108589b(eVar.mo90502b(), "PostFileClearStage")) {
            mo90504a(new C66692a());
        }
    }

    /* renamed from: c */
    public final C66413j mo90272c(Object obj) {
        if (obj instanceof FinderItem) {
            FinderItem finderItem = (FinderItem) obj;
            return finderItem.isMvFeed() ? new C57981d(finderItem) : new C54320d(finderItem);
        } else if (!(obj instanceof C65418l)) {
            return null;
        } else {
            C37521f.f99374d.getClass();
            if (C37521f.f99572z.mo60266n().intValue() == 0) {
                return null;
            }
            C65418l lVar = (C65418l) obj;
            return lVar.field_objectType == 2 ? new C66973n(lVar) : new C66966h(lVar);
        }
    }
}
