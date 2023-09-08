package yd0;

import be0.C16783a;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.sdk.platformtools.Log;
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
import zt3.C119157j;

/* renamed from: yd0.d */
public final class C23289d extends C23283a {

    /* renamed from: e */
    public C22226d f66937e;

    /* renamed from: f */
    public String f66938f = "";

    /* renamed from: g */
    public String f66939g = "";

    /* renamed from: h */
    public ArrayList<String> f66940h = new ArrayList<>();

    /* renamed from: i */
    public String f66941i = "";

    /* renamed from: j */
    public C22357b f66942j;

    /* renamed from: yd0.d$a */
    public static final class C23290a implements C22357b.C22358b {

        /* renamed from: d */
        public final /* synthetic */ C23289d f66943d;

        /* renamed from: yd0.d$a$a */
        public static final class C23291a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f66944d;

            /* renamed from: e */
            public final /* synthetic */ int f66945e;

            /* renamed from: f */
            public final /* synthetic */ C23289d f66946f;

            /* renamed from: g */
            public final /* synthetic */ SubscribeMsgRequestResult f66947g;

            /* renamed from: h */
            public final /* synthetic */ String f66948h;

            public C23291a(int i, int i2, C23289d dVar, SubscribeMsgRequestResult subscribeMsgRequestResult, String str) {
                this.f66944d = i;
                this.f66945e = i2;
                this.f66946f = dVar;
                this.f66947g = subscribeMsgRequestResult;
                this.f66948h = str;
            }

            public final void run() {
                int i = this.f66944d;
                if (i == 0 && this.f66945e == 0) {
                    C23289d dVar = this.f66946f;
                    C22226d dVar2 = dVar.f66937e;
                    if (dVar2 != null) {
                        String str = dVar.f66921a;
                        SubscribeMsgRequestResult subscribeMsgRequestResult = this.f66947g;
                        C87412m.m108591d(subscribeMsgRequestResult);
                        dVar2.mo26257a(str, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                C22226d dVar3 = this.f66946f.f66937e;
                if (dVar3 != null) {
                    dVar3.mo26258e(i, this.f66945e, this.f66948h);
                }
            }
        }

        public C23290a(C23289d dVar) {
            this.f66943d = dVar;
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            Log.m105925i("MicroMsg.GetSubscribeMsgListForDialogTask", "alvinluo getSubscribeMsgListForDialogTask end errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.mo183895z(new C23291a(i, i2, this.f66943d, subscribeMsgRequestResult, str));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23289d(String str, String str2, String str3, List<String> list, String str4, C23073a aVar, C22226d dVar) {
        super(str);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(str3, "subscribeUrl");
        C87412m.m108594g(list, "templateIdList");
        C87412m.m108594g(str4, "extInfo");
        boolean z = true;
        if (!(str.length() > 0)) {
            str = str2.length() <= 0 ? false : z ? str2 : "";
        }
        this.f66921a = str;
        this.f66939g = str2;
        this.f66937e = dVar;
        this.f66938f = str3;
        this.f66940h.addAll(list);
        this.f66941i = str4;
    }

    /* renamed from: a */
    public void mo36762a() {
        C117747y remove;
        this.f66924d = true;
        Object[] objArr = new Object[1];
        C22357b bVar = this.f66942j;
        objArr[0] = bVar != null ? Integer.valueOf(bVar.hashCode()) : null;
        Log.m105925i("MicroMsg.GetSubscribeMsgListForDialogTask", "getSubscribeMsgForDialogTask cancel task: %s", objArr);
        this.f66937e = null;
        C22355a aVar = C22355a.f63371a;
        C22357b bVar2 = this.f66942j;
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

    public void run() {
        C23290a aVar = new C23290a(this);
        C22357b a = this.f66939g.length() > 0 ? C22357b.C22359a.f63389a.mo35488a("", this.f66939g, this.f66938f, this.f66940h, this.f66941i, aVar) : C22357b.C22359a.f63389a.mo35488a(this.f66921a, "", this.f66938f, this.f66940h, this.f66941i, aVar);
        this.f66942j = a;
        mo36764c(a);
    }
}
