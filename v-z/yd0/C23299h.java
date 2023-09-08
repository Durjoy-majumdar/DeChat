package yd0;

import be0.C16783a;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ob0.C117747y;
import ob0.C89144l0;
import rd0.C22226d;
import sd0.C22355a;
import sd0.C22357b;
import xd0.C23073a;

/* renamed from: yd0.h */
public final class C23299h extends C23283a {

    /* renamed from: e */
    public C22226d f66964e;

    /* renamed from: f */
    public C23073a f66965f;

    /* renamed from: g */
    public List<SubscribeMsgTmpItem> f66966g;

    /* renamed from: h */
    public String f66967h;

    /* renamed from: i */
    public boolean f66968i;

    /* renamed from: j */
    public boolean f66969j;

    /* renamed from: k */
    public byte[] f66970k = {0};

    /* renamed from: l */
    public SubscribeMsgRequestDialogUiData f66971l;

    /* renamed from: m */
    public String f66972m = "";

    /* renamed from: n */
    public C22357b f66973n;

    /* renamed from: yd0.h$a */
    public static final class C23300a implements C22357b.C22358b {

        /* renamed from: d */
        public final /* synthetic */ C23299h f66974d;

        /* renamed from: yd0.h$a$a */
        public static final class C23301a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f66975d;

            /* renamed from: e */
            public final /* synthetic */ C23299h f66976e;

            /* renamed from: f */
            public final /* synthetic */ String f66977f;

            /* renamed from: g */
            public final /* synthetic */ SubscribeMsgRequestResult f66978g;

            public C23301a(C8477a0 a0Var, C23299h hVar, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
                this.f66975d = a0Var;
                this.f66976e = hVar;
                this.f66977f = str;
                this.f66978g = subscribeMsgRequestResult;
            }

            public final void run() {
                if (this.f66975d.f27482d) {
                    C23073a aVar = this.f66976e.f66965f;
                    if (aVar != null) {
                        String str = this.f66977f;
                        SubscribeMsgRequestResult subscribeMsgRequestResult = this.f66978g;
                        ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f49004h : null;
                        C87412m.m108591d(arrayList);
                        aVar.mo36475q2(str, arrayList, this.f66978g.f49008o, true, false);
                        return;
                    }
                    return;
                }
                C23073a aVar2 = this.f66976e.f66965f;
                if (aVar2 != null) {
                    String str2 = this.f66977f;
                    SubscribeMsgRequestResult subscribeMsgRequestResult2 = this.f66978g;
                    aVar2.mo36475q2(str2, (List<SubscribeMsgTmpItem>) null, subscribeMsgRequestResult2 != null ? subscribeMsgRequestResult2.f49008o : false, true, false);
                }
            }
        }

        /* renamed from: yd0.h$a$b */
        public static final class C23302b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f66979d;

            /* renamed from: e */
            public final /* synthetic */ int f66980e;

            /* renamed from: f */
            public final /* synthetic */ C23299h f66981f;

            /* renamed from: g */
            public final /* synthetic */ String f66982g;

            /* renamed from: h */
            public final /* synthetic */ SubscribeMsgRequestResult f66983h;

            /* renamed from: i */
            public final /* synthetic */ String f66984i;

            public C23302b(int i, int i2, C23299h hVar, String str, SubscribeMsgRequestResult subscribeMsgRequestResult, String str2) {
                this.f66979d = i;
                this.f66980e = i2;
                this.f66981f = hVar;
                this.f66982g = str;
                this.f66983h = subscribeMsgRequestResult;
                this.f66984i = str2;
            }

            public final void run() {
                if (this.f66979d == 0 && this.f66980e == 0) {
                    C22226d dVar = this.f66981f.f66964e;
                    if (dVar != null) {
                        String str = this.f66982g;
                        SubscribeMsgRequestResult subscribeMsgRequestResult = this.f66983h;
                        C87412m.m108591d(subscribeMsgRequestResult);
                        dVar.mo26257a(str, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                Log.m105920e("MicroMsg.UpdateSubscribeMsgListTask", "alvinluo updateSubscribeMsgList failed");
                C22226d dVar2 = this.f66981f.f66964e;
                if (dVar2 != null) {
                    dVar2.mo26258e(this.f66979d, this.f66980e, this.f66984i);
                }
            }
        }

        public C23300a(C23299h hVar) {
            this.f66974d = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
            r1 = r13.f49004h;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17818a(int r10, int r11, java.lang.String r12, com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult r13) {
            /*
                r9 = this;
                java.lang.String r0 = "errMsg"
                gy3.C87412m.m108594g(r12, r0)
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r2 = 0
                r0[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                r3 = 1
                r0[r3] = r1
                r1 = 2
                r0[r1] = r12
                yd0.h r1 = r9.f66974d
                int r1 = r1.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4 = 3
                r0[r4] = r1
                if (r13 == 0) goto L_0x0035
                java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r1 = r13.f49004h
                if (r1 == 0) goto L_0x0035
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0036
            L_0x0035:
                r1 = 0
            L_0x0036:
                r4 = 4
                r0[r4] = r1
                java.lang.String r1 = "MicroMsg.UpdateSubscribeMsgListTask"
                java.lang.String r4 = "alvinluo updateSubscribeMsgList end errType: %d, errCode: %d, errMsg: %s, hashCode: %s, tmpSize: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
                gy3.a0 r0 = new gy3.a0
                r0.<init>()
                yd0.h r4 = r9.f66974d
                java.lang.String r4 = r4.f66921a
                int r4 = r4.length()
                if (r4 <= 0) goto L_0x0051
                r4 = 1
                goto L_0x0052
            L_0x0051:
                r4 = 0
            L_0x0052:
                if (r4 == 0) goto L_0x0059
                yd0.h r4 = r9.f66974d
                java.lang.String r4 = r4.f66921a
                goto L_0x005d
            L_0x0059:
                yd0.h r4 = r9.f66974d
                java.lang.String r4 = r4.f66967h
            L_0x005d:
                if (r10 != 0) goto L_0x0095
                if (r11 != 0) goto L_0x0095
                yd0.h r7 = r9.f66974d
                boolean r8 = r7.f66969j
                if (r8 != 0) goto L_0x0095
                java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r7 = r7.f66966g
                boolean r7 = r7.isEmpty()
                r7 = r7 ^ r3
                if (r7 == 0) goto L_0x0087
                if (r13 == 0) goto L_0x007e
                java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r7 = r13.f49004h
                if (r7 == 0) goto L_0x007e
                boolean r7 = r7.isEmpty()
                r7 = r7 ^ r3
                if (r7 != r3) goto L_0x007e
                r2 = 1
            L_0x007e:
                if (r2 == 0) goto L_0x0087
                java.lang.String r2 = "alvinluo updateSubscribeMsgList end and save to local"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
                r0.f27482d = r3
            L_0x0087:
                zt3.t r1 = zt3.C119157j.f356862d
                yd0.h$a$a r2 = new yd0.h$a$a
                yd0.h r3 = r9.f66974d
                r2.<init>(r0, r3, r4, r13)
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183895z(r2)
            L_0x0095:
                zt3.t r7 = zt3.C119157j.f356862d
                yd0.h$a$b r8 = new yd0.h$a$b
                yd0.h r3 = r9.f66974d
                r0 = r8
                r1 = r10
                r2 = r11
                r5 = r13
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                zt3.j r7 = (zt3.C119157j) r7
                r7.mo183895z(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yd0.C23299h.C23300a.mo17818a(int, int, java.lang.String, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult):void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23299h(rd0.C22227f r4, xd0.C23073a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "updateRequest"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = r4.f62967a
            java.lang.String r1 = "bizUsername"
            gy3.C87412m.m108594g(r0, r1)
            r3.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f66966g = r0
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r2
            r3.f66970k = r1
            java.lang.String r1 = ""
            r3.f66972m = r1
            r3.f66965f = r5
            java.lang.String r5 = r4.f62968b
            r3.f66967h = r5
            java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r5 = r4.f62969c
            r0.addAll(r5)
            rd0.d r5 = r4.f62975i
            r3.f66964e = r5
            boolean r5 = r4.f62970d
            r3.f66968i = r5
            byte[] r5 = r4.f62971e
            r3.f66970k = r5
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData r5 = r4.f62972f
            r3.f66971l = r5
            java.lang.String r5 = r4.f62973g
            r3.f66972m = r5
            boolean r4 = r4.f62974h
            r3.f66969j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd0.C23299h.<init>(rd0.f, xd0.a):void");
    }

    /* renamed from: a */
    public void mo36762a() {
        C117747y remove;
        this.f66924d = true;
        Object[] objArr = new Object[1];
        C22357b bVar = this.f66973n;
        objArr[0] = bVar != null ? Integer.valueOf(bVar.hashCode()) : null;
        Log.m105925i("MicroMsg.UpdateSubscribeMsgListTask", "alvinluo updateSubscribeMsgList cancel task: %s", objArr);
        this.f66964e = null;
        C22355a aVar = C22355a.f63371a;
        C22357b bVar2 = this.f66973n;
        if (bVar2 != null) {
            WeakHashMap<C16783a, C117747y> weakHashMap = C22355a.f63372b;
            synchronized (weakHashMap) {
                remove = weakHashMap.remove(bVar2);
            }
            if (remove != null) {
                C89144l0.m111426b(remove);
            }
        }
    }

    /* renamed from: b */
    public String mo36763b() {
        String str = this.f66921a.length() > 0 ? this.f66921a : this.f66967h;
        return str + ',' + 1;
    }

    public void run() {
        C22357b bVar;
        Log.m105925i("MicroMsg.UpdateSubscribeMsgListTask", "alvinluo updateSubscribeMsgList %s, isOpened: %b", this.f66921a, Boolean.valueOf(this.f66968i));
        C23300a aVar = new C23300a(this);
        if (this.f66969j) {
            bVar = C22357b.C22359a.f63389a.mo35489b(this.f66921a, this.f66967h, this.f66966g, this.f66972m, aVar, this.f66968i, this.f66970k, this.f66971l);
        } else {
            C22357b.C22359a.C22360a aVar2 = C22357b.C22359a.f63389a;
            String str = this.f66921a;
            String str2 = this.f66967h;
            List<SubscribeMsgTmpItem> list = this.f66966g;
            boolean z = this.f66968i;
            C87412m.m108594g(str, "username");
            C87412m.m108594g(str2, "appId");
            C87412m.m108594g(list, "templates");
            bVar = C22357b.C22359a.C22360a.m26033d(aVar2, str, str2, z, aVar, list, 1, new byte[0], (SubscribeMsgRequestDialogUiData) null, (String) null, 384, (Object) null);
        }
        this.f66973n = bVar;
        mo36764c(bVar);
    }
}
