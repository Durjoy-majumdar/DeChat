package hk3;

import android.util.SparseArray;
import ck3.C67391b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import hk3.C76227e;
import java.util.LinkedList;
import java.util.List;
import mk3.C76775c;
import vk3.C78430l;

/* renamed from: hk3.a */
public class C76218a implements C76226d<C72963f4> {

    /* renamed from: a */
    public SparseArray<C72963f4> f223278a;

    /* renamed from: b */
    public C67391b f223279b;

    /* renamed from: c */
    public final Runnable f223280c = new C76220b();

    /* renamed from: hk3.a$a */
    public class C76219a implements C76227e.C32942b {

        /* renamed from: a */
        public final /* synthetic */ C78430l f223281a;

        /* renamed from: b */
        public final /* synthetic */ C76227e.C76230d f223282b;

        /* renamed from: c */
        public final /* synthetic */ C76227e.C76228a f223283c;

        /* renamed from: d */
        public final /* synthetic */ C76227e.C32942b f223284d;

        public C76219a(C78430l lVar, C76227e.C76230d dVar, C76227e.C76228a aVar, C76227e.C32942b bVar) {
            this.f223281a = lVar;
            this.f223282b = dVar;
            this.f223283c = aVar;
            this.f223284d = bVar;
        }

        public void next() {
            this.f223281a.mo61318q(this.f223282b.f223309c);
            this.f223281a.close();
            this.f223282b.f223312f = this.f223281a.mo61317p();
            C76227e.C76230d dVar = this.f223282b;
            dVar.f223310d = ((LinkedList) dVar.f223309c).size();
            this.f223282b.f223314h = this.f223281a.mo61320s();
            Log.m105924i("MicroMsg.ChattingLoader.ChattingDataCallback", "action：" + this.f223283c + " addCount:" + this.f223282b.f223310d + " totalCount:" + this.f223282b.f223312f + " queryCreateTime:" + this.f223282b.f223314h);
            C76218a.this.mo106477c();
            this.f223284d.next();
        }
    }

    /* renamed from: hk3.a$b */
    public class C76220b implements Runnable {
        public C76220b() {
        }

        /* JADX WARNING: type inference failed for: r0v13, types: [android.view.ViewParent] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                java.lang.String r0 = "MicroMsg.ChattingLoader.ChattingDataCallback"
                java.lang.String r1 = "overtimeTask execute called"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
                hk3.a r0 = hk3.C76218a.this
                ck3.b r0 = r0.f223279b
                com.tencent.mm.ui.chatting.w3 r0 = r0.f193288l
                com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r0
                r1 = 1
                r0.mo102097u0(r1)
                hk3.a r0 = hk3.C76218a.this
                ck3.b r0 = r0.f223279b
                r0.f193293q = r1
                com.tencent.mm.ui.chatting.w3 r0 = r0.f193288l
                com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r0
                android.view.View r0 = r0.getView()
                r1 = 0
                if (r0 == 0) goto L_0x002f
                android.view.ViewParent r0 = r0.getParent()
                boolean r2 = r0 instanceof android.view.View
                if (r2 == 0) goto L_0x002f
                r1 = r0
                android.view.View r1 = (android.view.View) r1
            L_0x002f:
                boolean r0 = r1 instanceof com.tencent.p014mm.p136ui.tools.TestTimeForChatting
                if (r0 == 0) goto L_0x0044
                com.tencent.mm.ui.tools.TestTimeForChatting r1 = (com.tencent.p014mm.p136ui.tools.TestTimeForChatting) r1
                r1.requestLayout()
                com.tencent.mm.ui.tools.TestTimeForChatting$b r0 = r1.f220058e
                if (r0 == 0) goto L_0x0044
                com.tencent.mm.ui.tools.r1 r0 = new com.tencent.mm.ui.tools.r1
                r0.<init>(r1)
                r1.post(r0)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hk3.C76218a.C76220b.run():void");
        }
    }

    public C76218a(C67391b bVar, SparseArray<C72963f4> sparseArray) {
        this.f223279b = bVar;
        this.f223278a = sparseArray;
    }

    /* renamed from: a */
    public void mo106475a(C76227e.C76228a aVar, C78430l<C72963f4> lVar, C76227e.C76230d<C72963f4> dVar, C76227e.C32942b bVar) {
        C76775c.f224573b.mo107029a(dVar);
        if (lVar == null) {
            Log.m105920e("MicroMsg.ChattingLoader.ChattingDataCallback", "[load] null == source!");
            bVar.next();
            return;
        }
        lVar.mo61319r(new C76219a(lVar, dVar, aVar, bVar));
    }

    /* renamed from: b */
    public SparseArray<C72963f4> mo106476b(C76227e.C76230d<C72963f4> dVar) {
        C67391b bVar;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        List list = dVar2 == null ? null : dVar2.f223309c;
        if (list == null) {
            list = new LinkedList();
            Log.m105920e("MicroMsg.ChattingLoader.ChattingDataCallback", "[fillData] list is null!");
        }
        List<C72963f4> list2 = list;
        int i = 0;
        try {
            if (list2.size() > 0 && (bVar = this.f223279b) != null) {
                String r = bVar.mo91577r();
                C72963f4 f4Var = (C72963f4) list2.get(0);
                if (f4Var != null && !Util.isNullOrNil(r) && !Util.isNullOrNil(f4Var.mo108768t()) && !Util.isEqual(f4Var.mo108768t(), r)) {
                    Log.m105925i("MicroMsg.ChattingLoader.ChattingDataCallback", "talker not equal, chattingContextTalker:%s, msgInfoTalker:%s", f4Var.mo108768t(), r);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(18264, f4Var.mo108768t(), r);
                    nVar.mo175913w(1151, 0, 1);
                    return this.f223278a;
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingDataCallback", th, "fillData Exception", new Object[0]);
            C115669n.INSTANCE.mo175913w(1151, 1, 1);
        }
        this.f223278a.clear();
        for (C72963f4 f4Var2 : list2) {
            SparseArray<C72963f4> sparseArray = this.f223278a;
            sparseArray.put(i, f4Var2);
            i++;
            if (!(f4Var2 == null || !f4Var2.mo100993e4() || f4Var2.getContent() == null)) {
                f4Var2.mo108732L2(f4Var2.getContent().replaceAll("‮", ""));
            }
        }
        return this.f223278a;
    }

    /* renamed from: c */
    public void mo106477c() {
        this.f223279b.mo91571l().removeCallbacks(this.f223280c);
    }

    public void cancel() {
        mo106477c();
    }
}
