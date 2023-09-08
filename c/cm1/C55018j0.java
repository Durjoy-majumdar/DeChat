package cm1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59838a;
import he1.C59840c;
import ht1.C8808v4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p749xh.C66261f3;
import rx3.C13601g;
import rx3.C36568h;
import up1.C37521f;

/* renamed from: cm1.j0 */
public final class C55018j0 extends BaseFinderFeed {

    /* renamed from: d */
    public boolean f154479d;

    /* renamed from: e */
    public boolean f154480e;

    /* renamed from: f */
    public boolean f154481f;

    /* renamed from: g */
    public final C13601g f154482g = C36568h.m40985a(C55019a.f154484d);

    /* renamed from: h */
    public final List<C59840c> f154483h = new ArrayList();

    /* renamed from: cm1.j0$a */
    public static final class C55019a extends C87413o implements C32224a<C59838a> {

        /* renamed from: d */
        public static final C55019a f154484d = new C55019a();

        public C55019a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            if (C37521f.f99476o6.mo60266n().intValue() == 1) {
                return new C59838a();
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55018j0(FinderItem finderItem) {
        super(finderItem);
        C87412m.m108594g(finderItem, "feedObject");
    }

    /* renamed from: P */
    public void mo3482P() {
        super.mo3482P();
        this.f154481f = false;
    }

    /* renamed from: p0 */
    public final boolean mo76076p0() {
        if (!mo3513o().isLongVideo() || !mo3513o().isPostFinish()) {
            return false;
        }
        C58784w3 w3Var = C58784w3.f168295a;
        FinderObject feedObject = mo3513o().getFeedObject();
        w3Var.getClass();
        C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
        if (!((feedObject.permissionFlag & 2048) == 0)) {
            return false;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99476o6.mo60266n().intValue() == 1 && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
    }

    /* renamed from: q0 */
    public final boolean mo76077q0(boolean z) {
        return mo76076p0() && (z || C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true));
    }

    /* renamed from: r0 */
    public final List<C59840c> mo76078r0(List<C59840c> list) {
        C87412m.m108594g(list, "data");
        ArrayList arrayList = new ArrayList();
        for (C59840c cVar : list) {
            Iterator it = ((ArrayList) this.f154483h).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C59840c) it.next()).f170850a.f138058d == cVar.f170850a.f138058d) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.m105926v("FinderFeedVideo", "mergeBulletList: remove exist bullet index = " + i + ", id = " + cVar.f170850a.f138058d);
            } else {
                arrayList.add(cVar);
            }
        }
        ((ArrayList) this.f154483h).addAll(arrayList);
        Log.m105924i("FinderFeedVideo", "mergeBulletList: bullet list size = " + ((ArrayList) this.f154483h).size() + ", increase size = " + arrayList.size());
        return arrayList;
    }
}
