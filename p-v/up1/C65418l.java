package up1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import p749xh.C66260e3;
import sx3.C110818d0;
import te3.C64532lq2;
import te3.C64621p23;
import te3.C64689rq2;
import te3.C64736tq2;
import te3.C64783vq0;
import wp1.C66165b;

/* renamed from: up1.l */
public class C65418l extends C66260e3 {

    /* renamed from: M */
    public static final C65419a f188265M = new C65419a((C8480h) null);

    /* renamed from: N */
    public static final IAutoDBItem.MAutoDBInfo f188266N = C66260e3.initAutoDBInfo(C65418l.class);

    /* renamed from: L */
    public FinderItem f188267L;

    /* renamed from: up1.l$a */
    public static final class C65419a {
        public C65419a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C65418l mo89517a(FinderItem finderItem) {
            C87412m.m108594g(finderItem, "finderItem");
            C65418l lVar = new C65418l();
            lVar.field_createTime = finderItem.getCreateTime();
            lVar.field_localFlag = 1;
            lVar.field_finderItem = FinderItem.Companion.mo79059e(finderItem);
            lVar.field_objectType = 0;
            lVar.field_localId = finderItem.getLocalId();
            lVar.field_watermarkFlag = finderItem.field_watermarkFlag;
            return lVar;
        }

        /* renamed from: b */
        public final C64621p23 mo89518b(C65418l lVar) {
            String str;
            LinkedList<C64783vq0> linkedList;
            String str2;
            C87412m.m108594g(lVar, "draftItem");
            C64621p23 p232 = new C64621p23();
            FinderItem l2 = lVar.mo89514l2();
            StringBuilder sb = new StringBuilder();
            C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(l2.getMediaList());
            String str3 = "";
            if (rq22 == null || (str = rq22.f185266d) == null) {
                str = str3;
            }
            sb.append(str);
            C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(l2.getMediaList());
            if (!(rq23 == null || (str2 = rq23.f185286y) == null)) {
                str3 = str2;
            }
            sb.append(str3);
            p232.f184741f = sb.toString();
            FinderObject feedObject = l2.getFeedObject();
            p232.f184739d = feedObject;
            FinderObjectDesc finderObjectDesc = feedObject != null ? feedObject.objectDesc : null;
            if (finderObjectDesc != null) {
                finderObjectDesc.media = new LinkedList<>();
            }
            p232.f184744i = lVar.field_originMvInfo;
            C64532lq2 lq22 = l2.field_clipList;
            if (!(lq22 == null || (linkedList = lq22.f184151d) == null)) {
                for (C64783vq0 vq02 : linkedList) {
                    p232.f184740e.add(vq02.f185976d);
                }
            }
            p232.f184743h = lVar.field_localId;
            return p232;
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f188266N;
    }

    public final C64736tq2 getPostInfo() {
        return mo89514l2().getPostInfo();
    }

    /* renamed from: l2 */
    public final FinderItem mo89514l2() {
        FinderItem finderItem = this.f188267L;
        if (finderItem != null) {
            return finderItem;
        }
        FinderItem.C56324a aVar = FinderItem.Companion;
        C64783vq0 vq02 = this.field_finderItem;
        C87412m.m108593f(vq02, "field_finderItem");
        FinderItem d = aVar.mo79058d(vq02, this.field_localId);
        d.field_watermarkFlag = this.field_watermarkFlag;
        this.f188267L = d;
        return d;
    }

    /* renamed from: m2 */
    public final String mo89515m2() {
        return "localId:" + this.field_localId + ", objectId:" + this.field_objectId + ", version:" + this.field_version + ", markDeleted:" + this.field_markDeleted;
    }

    /* renamed from: n2 */
    public final void mo89516n2() {
        FinderItem finderItem = this.f188267L;
        if (finderItem != null) {
            this.field_finderItem = FinderItem.Companion.mo79059e(finderItem);
        }
        String[] strArr = C66165b.f190163n;
        this.field_dbversion = C66165b.f190164o;
    }
}
