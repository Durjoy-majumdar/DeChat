package ud0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.ShowInfo;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.WordingInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fy3.C32224a;
import gt0.C76063l;
import gt0.C87362k;
import gt0.C87370k0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONObject;
import p910lj.C76701a;
import qo3.C77398g;
import rd0.C22222c;
import rd0.C22226d;
import rd0.C22227f;
import rd0.C48018e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import wd0.C22894a;
import zd0.C23466p;

/* renamed from: ud0.a */
public final class C22624a {

    /* renamed from: a */
    public static final C22624a f65076a = new C22624a();

    /* renamed from: b */
    public static HashMap<Integer, Integer> f65077b = C90364q0.m113146e(new C13604l(1, 0), new C13604l(3, 2), new C13604l(2, 0));

    /* renamed from: ud0.a$a */
    public interface C22625a {
        /* renamed from: a */
        void mo21981a();

        /* renamed from: b */
        void mo21982b(boolean z, SubscribeMsgRequestResult subscribeMsgRequestResult);

        /* renamed from: c */
        void mo21983c(SubscribeMsgRequestResult subscribeMsgRequestResult);

        /* renamed from: d */
        void mo21984d();

        /* renamed from: e */
        void mo21985e(int i, int i2, String str);

        /* renamed from: f */
        void mo21986f(C87370k0 k0Var, C87362k kVar);
    }

    /* renamed from: ud0.a$b */
    public static final class C22626b {

        /* renamed from: a */
        public WeakReference<Context> f65078a;

        /* renamed from: b */
        public int f65079b;

        /* renamed from: c */
        public String f65080c;

        /* renamed from: d */
        public final String f65081d;

        /* renamed from: e */
        public final String f65082e;

        /* renamed from: f */
        public final String f65083f;

        /* renamed from: g */
        public final String f65084g;

        /* renamed from: h */
        public C22625a f65085h;

        /* renamed from: i */
        public ArrayList<SubscribeMsgTmpItem> f65086i;

        /* renamed from: j */
        public ArrayList<String> f65087j = new ArrayList<>();

        /* renamed from: k */
        public C77398g f65088k;

        /* renamed from: l */
        public C23466p f65089l;

        /* renamed from: m */
        public C87362k f65090m;

        /* renamed from: n */
        public C22222c f65091n = C48018e.f128802a.mo72802a("name_biz");

        /* renamed from: o */
        public long f65092o = -1;

        /* renamed from: p */
        public byte[] f65093p = {0};

        /* renamed from: q */
        public SubscribeMsgRequestDialogUiData f65094q;

        /* renamed from: r */
        public int f65095r;

        /* renamed from: s */
        public C22894a.C22895a f65096s = new C22894a.C22895a();

        /* renamed from: ud0.a$b$a */
        public static final class C22627a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65097d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65098e;

            /* renamed from: f */
            public final /* synthetic */ int f65099f;

            public C22627a(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                this.f65097d = subscribeMsgRequestResult;
                this.f65098e = bVar;
                this.f65099f = i;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65097d;
                int i2 = subscribeMsgRequestResult.f49015v;
                if (i2 == 0) {
                    C22625a aVar = this.f65098e.f65085h;
                    if (aVar != null) {
                        aVar.mo21982b(false, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                C22625a aVar2 = this.f65098e.f65085h;
                if (aVar2 != null) {
                    aVar2.mo21985e(this.f65099f, i2, subscribeMsgRequestResult.f49016w);
                }
            }
        }

        /* renamed from: ud0.a$b$b */
        public static final class C22628b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65100d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65101e;

            /* renamed from: f */
            public final /* synthetic */ int f65102f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22628b(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65100d = subscribeMsgRequestResult;
                this.f65101e = bVar;
                this.f65102f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65100d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65101e.f65085h;
                    if (aVar != null) {
                        aVar.mo21982b(false, subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65101e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65102f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$c */
        public static final class C22629c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65103d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65104e;

            /* renamed from: f */
            public final /* synthetic */ int f65105f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22629c(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65103d = subscribeMsgRequestResult;
                this.f65104e = bVar;
                this.f65105f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65103d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65104e.f65085h;
                    if (aVar != null) {
                        aVar.mo21982b(false, subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65104e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65105f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$d */
        public static final class C22630d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65106d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65107e;

            /* renamed from: f */
            public final /* synthetic */ int f65108f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22630d(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65106d = subscribeMsgRequestResult;
                this.f65107e = bVar;
                this.f65108f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65106d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65107e.f65085h;
                    if (aVar != null) {
                        aVar.mo21982b(false, subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65107e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65108f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$e */
        public static final class C22631e extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65109d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65110e;

            /* renamed from: f */
            public final /* synthetic */ int f65111f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22631e(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65109d = subscribeMsgRequestResult;
                this.f65110e = bVar;
                this.f65111f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65109d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65110e.f65085h;
                    if (aVar != null) {
                        aVar.mo21982b(false, subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65110e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65111f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$f */
        public static final class C22632f extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65112d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65113e;

            /* renamed from: f */
            public final /* synthetic */ int f65114f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22632f(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65112d = subscribeMsgRequestResult;
                this.f65113e = bVar;
                this.f65114f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65112d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65113e.f65085h;
                    if (aVar != null) {
                        aVar.mo21983c(subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65113e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65114f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$g */
        public static final class C22633g implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65115d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65116e;

            /* renamed from: f */
            public final /* synthetic */ int f65117f;

            public C22633g(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                this.f65115d = subscribeMsgRequestResult;
                this.f65116e = bVar;
                this.f65117f = i;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65115d;
                int i2 = subscribeMsgRequestResult.f49015v;
                if (i2 == 0) {
                    C22625a aVar = this.f65116e.f65085h;
                    if (aVar != null) {
                        aVar.mo21983c(subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                C22625a aVar2 = this.f65116e.f65085h;
                if (aVar2 != null) {
                    aVar2.mo21985e(this.f65117f, i2, subscribeMsgRequestResult.f49016w);
                }
            }
        }

        /* renamed from: ud0.a$b$h */
        public static final class C22634h extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SubscribeMsgRequestResult f65118d;

            /* renamed from: e */
            public final /* synthetic */ C22626b f65119e;

            /* renamed from: f */
            public final /* synthetic */ int f65120f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22634h(SubscribeMsgRequestResult subscribeMsgRequestResult, C22626b bVar, int i) {
                super(0);
                this.f65118d = subscribeMsgRequestResult;
                this.f65119e = bVar;
                this.f65120f = i;
            }

            public Object invoke() {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f65118d;
                int i = subscribeMsgRequestResult.f49015v;
                if (i == 0) {
                    C22625a aVar = this.f65119e.f65085h;
                    if (aVar != null) {
                        aVar.mo21983c(subscribeMsgRequestResult);
                    }
                } else {
                    C22625a aVar2 = this.f65119e.f65085h;
                    if (aVar2 != null) {
                        aVar2.mo21985e(this.f65120f, i, subscribeMsgRequestResult.f49016w);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ud0.a$b$i */
        public static final class C22635i implements C22226d {

            /* renamed from: a */
            public final /* synthetic */ C22626b f65121a;

            public C22635i(C22626b bVar) {
                this.f65121a = bVar;
            }

            /* renamed from: a */
            public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
                Context context;
                C87412m.m108594g(str, "bizUsername");
                C87412m.m108594g(subscribeMsgRequestResult, "result");
                Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo doSubscribeMsg success bizUsername: %s, template size: %d", str, Integer.valueOf(subscribeMsgRequestResult.f49004h.size()));
                WeakReference<Context> weakReference = this.f65121a.f65078a;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    C22626b bVar = this.f65121a;
                    bVar.mo35750a(context, bVar.f65079b, subscribeMsgRequestResult);
                }
            }

            /* renamed from: e */
            public void mo26258e(int i, int i2, String str) {
                C87412m.m108594g(str, "errMsg");
                boolean z = false;
                Log.m105921e("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo doSubscribeMsg onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                C22626b bVar = this.f65121a;
                C22625a aVar = bVar.f65085h;
                if (aVar != null) {
                    int i3 = bVar.f65079b;
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (!z) {
                        str = "subscribe failed";
                    }
                    aVar.mo21985e(i3, 10003, str);
                }
            }
        }

        /* renamed from: ud0.a$b$j */
        public static final class C22636j implements C22226d {

            /* renamed from: a */
            public final /* synthetic */ C22626b f65122a;

            public C22636j(C22626b bVar) {
                this.f65122a = bVar;
            }

            /* renamed from: a */
            public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
                Context context;
                C87412m.m108594g(str, "bizUsername");
                C87412m.m108594g(subscribeMsgRequestResult, "result");
                Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo getSubscribeMsgTemplateList onSuccess bizUsername: %s, size: %d", str, Integer.valueOf(subscribeMsgRequestResult.f49004h.size()));
                C22626b bVar = this.f65122a;
                int i = bVar.f65079b;
                bVar.getClass();
                if (subscribeMsgRequestResult.f49015v != 0 || !subscribeMsgRequestResult.f49004h.isEmpty()) {
                    WeakReference<Context> weakReference = bVar.f65078a;
                    if (weakReference != null && (context = weakReference.get()) != null) {
                        bVar.mo35750a(context, i, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                bVar.f65086i = subscribeMsgRequestResult.f49004h;
                bVar.f65093p = subscribeMsgRequestResult.f49010q;
                bVar.f65079b = 2;
                C22624a aVar = C22624a.f65076a;
                bVar.mo35752c();
            }

            /* renamed from: e */
            public void mo26258e(int i, int i2, String str) {
                C87412m.m108594g(str, "errMsg");
                boolean z = false;
                Log.m105921e("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo getSubscribeMsgTemplateList onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                C22626b bVar = this.f65122a;
                C22625a aVar = bVar.f65085h;
                if (aVar != null) {
                    int i3 = bVar.f65079b;
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (!z) {
                        str = "get subscribe msg list failed";
                    }
                    aVar.mo21985e(i3, 10002, str);
                }
            }
        }

        public C22626b(WeakReference<Context> weakReference, int i, String str, String str2, String str3, String str4, String str5, C22625a aVar) {
            C87412m.m108594g(str, "bizUsername");
            C87412m.m108594g(str2, "bizAppId");
            C87412m.m108594g(str3, "subscribeUrl");
            C87412m.m108594g(str4, "content");
            C87412m.m108594g(str5, "extInfo");
            this.f65078a = weakReference;
            this.f65079b = i;
            this.f65080c = str;
            this.f65081d = str2;
            this.f65082e = str3;
            this.f65083f = str4;
            this.f65084g = str5;
            this.f65085h = aVar;
        }

        /* renamed from: a */
        public final void mo35750a(Context context, int i, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            String str;
            String str2;
            String str3;
            String str4;
            WeakReference<Context> weakReference;
            Context context2;
            String str5;
            String str6;
            String str7;
            String str8;
            Context context3 = context;
            int i2 = i;
            SubscribeMsgRequestResult subscribeMsgRequestResult2 = subscribeMsgRequestResult;
            ShowInfo showInfo = subscribeMsgRequestResult2.f49012s;
            int i3 = showInfo != null ? showInfo.f48989d : -1;
            C22625a aVar = this.f65085h;
            if (aVar != null) {
                aVar.mo21984d();
            }
            long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            boolean z = false;
            Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo dispatchSuccessResult showType: %s, action: %d, errCode: %d, errMsg: %s", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(subscribeMsgRequestResult2.f49015v), subscribeMsgRequestResult2.f49016w);
            C22624a aVar2 = C22624a.f65076a;
            if (!(i2 == 3 || i2 == 1)) {
                if (!(i2 == 2)) {
                    return;
                }
                if (i3 == 1) {
                    mo35751b(2, currentTimeMillis);
                    ShowInfo showInfo2 = subscribeMsgRequestResult2.f49012s;
                    if (showInfo2 == null || (str = showInfo2.f48990e) == null) {
                        str = "";
                    }
                    if (showInfo2 == null || (str2 = showInfo2.f48991f) == null) {
                        str2 = "";
                    }
                    mo35753d(context3, str, str2, new C22633g(subscribeMsgRequestResult2, this, i2));
                } else if (i3 == 2) {
                    mo35751b(3, currentTimeMillis);
                    ShowInfo showInfo3 = subscribeMsgRequestResult2.f49012s;
                    if (showInfo3 == null || (str3 = showInfo3.f48991f) == null) {
                        str3 = "";
                    }
                    mo35754e(str3, new C22634h(subscribeMsgRequestResult2, this, i2));
                } else if (i3 != 4) {
                    mo35751b(i3 != 0 ? i3 != 3 ? -1 : 4 : 1, currentTimeMillis);
                    int i4 = subscribeMsgRequestResult2.f49015v;
                    if (i4 == 0) {
                        C22625a aVar3 = this.f65085h;
                        if (aVar3 != null) {
                            aVar3.mo21983c(subscribeMsgRequestResult2);
                            return;
                        }
                        return;
                    }
                    C22625a aVar4 = this.f65085h;
                    if (aVar4 != null) {
                        aVar4.mo21985e(i2, i4, subscribeMsgRequestResult2.f49016w);
                    }
                } else {
                    mo35751b(5, currentTimeMillis);
                    ShowInfo showInfo4 = subscribeMsgRequestResult2.f49012s;
                    if (showInfo4 == null || (str4 = showInfo4.f48991f) == null) {
                        str4 = "";
                    }
                    C22632f fVar = new C22632f(subscribeMsgRequestResult2, this, i2);
                    if (str4.length() > 0) {
                        z = true;
                    }
                    if (!(!z || (weakReference = this.f65078a) == null || (context2 = weakReference.get()) == null)) {
                        C76912y0.m92768g(context2, str4);
                    }
                    fVar.invoke();
                }
            } else if (i3 == 0) {
                int i5 = subscribeMsgRequestResult2.f49015v;
                if (i5 == 0) {
                    mo35751b(1, currentTimeMillis);
                    if (subscribeMsgRequestResult2.f49004h.isEmpty()) {
                        Log.m105928w("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo showSubscribeRequestDialog list is empty and not show dialog");
                        C22625a aVar5 = this.f65085h;
                        if (aVar5 != null) {
                            aVar5.mo21985e(this.f65079b, 10002, "template list empty");
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (SubscribeMsgTmpItem subscribeMsgTmpItem : subscribeMsgRequestResult2.f49004h) {
                            Log.m105927v("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo showSubscribeRequestDialog templateId: %s, chooseStatus: %d", subscribeMsgTmpItem.f49021f, Integer.valueOf(subscribeMsgTmpItem.f49023h));
                            arrayList.add(new C23466p.C23474i(subscribeMsgTmpItem.f49023h == 1, subscribeMsgTmpItem.f49020e, subscribeMsgTmpItem.f49024i, subscribeMsgTmpItem.f49021f, subscribeMsgTmpItem.f49022g));
                            this.f65096s.f65805d.add(subscribeMsgTmpItem.f49021f);
                            this.f65096s.f65806e.add(Integer.valueOf(subscribeMsgTmpItem.f49023h == 0 ? 0 : 1));
                        }
                        SubscribeMsgTmpItem subscribeMsgTmpItem2 = (SubscribeMsgTmpItem) C110818d0.m150916N(subscribeMsgRequestResult2.f49004h);
                        int i6 = subscribeMsgTmpItem2 != null ? subscribeMsgTmpItem2.f49022g : 2;
                        boolean z2 = arrayList.size() == 1 && subscribeMsgRequestResult2.f49011r == 1;
                        Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo showSubscribeRequestDialog size: %d, showStyle: %d, singleMode: %b, templateType: %d", Integer.valueOf(arrayList.size()), Integer.valueOf(subscribeMsgRequestResult2.f49011r), Boolean.valueOf(z2), Integer.valueOf(i6));
                        C22638d dVar = new C22638d(context3, arrayList, z2, new C22639e(this, subscribeMsgRequestResult2));
                        this.f65089l = dVar;
                        dVar.f67322T = new C22640f(this);
                        String str9 = subscribeMsgRequestResult2.f49013t;
                        if (str9 == null) {
                            str9 = "";
                        }
                        dVar.f67333p.setText(str9);
                        C23466p pVar = this.f65089l;
                        if (pVar != null) {
                            String str10 = subscribeMsgRequestResult2.f49014u;
                            if (str10 == null) {
                                str10 = "";
                            }
                            pVar.mo36947h(str10);
                        }
                        if (z2) {
                            ((C23466p.C23474i) C110818d0.m150914L(arrayList)).f67353a = true;
                        }
                        C23466p pVar2 = this.f65089l;
                        if (pVar2 != null) {
                            String str11 = subscribeMsgRequestResult2.f49002f;
                            C87412m.m108594g(str11, "value");
                            pVar2.f67332o.setText(str11);
                            TextView textView = pVar2.f67332o;
                            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                            textView.getPaint().setStrokeWidth(0.8f);
                        }
                        C23466p pVar3 = this.f65089l;
                        if (pVar3 != null) {
                            String str12 = subscribeMsgRequestResult2.f49001e;
                            C87412m.m108594g(str12, "value");
                            pVar3.f67314K = str12;
                        }
                        C23466p pVar4 = this.f65089l;
                        if (pVar4 != null) {
                            WordingInfo wordingInfo = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo);
                            String str13 = wordingInfo.f49037d;
                            C87412m.m108594g(str13, "value");
                            pVar4.f67331n.setText(str13);
                            TextView textView2 = pVar4.f67331n;
                            textView2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                            textView2.getPaint().setStrokeWidth(0.8f);
                        }
                        C23466p pVar5 = this.f65089l;
                        if (pVar5 != null) {
                            WordingInfo wordingInfo2 = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo2);
                            String str14 = wordingInfo2.f49038e;
                            C87412m.m108594g(str14, "value");
                            pVar5.f67336s.setText(str14);
                        }
                        C23466p pVar6 = this.f65089l;
                        if (pVar6 != null) {
                            WordingInfo wordingInfo3 = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo3);
                            String str15 = wordingInfo3.f49039f;
                            C87412m.m108594g(str15, "value");
                            pVar6.f67335r.setText(str15);
                        }
                        C23466p pVar7 = this.f65089l;
                        if (pVar7 != null) {
                            pVar7.f67321S = C0966R.C0969drawable.bfa;
                        }
                        if (pVar7 != null) {
                            WordingInfo wordingInfo4 = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo4);
                            String str16 = wordingInfo4.f49041h;
                            if (str16 == null) {
                                str16 = "";
                            }
                            pVar7.f67315L = str16;
                        }
                        C23466p pVar8 = this.f65089l;
                        int i7 = 8;
                        if (pVar8 != null) {
                            boolean z3 = !subscribeMsgRequestResult2.f49005i;
                            pVar8.f67317N = z3;
                            View view = pVar8.f67343z;
                            int i8 = z3 ? 0 : 8;
                            C9556a aVar6 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar6.mo10233c(Integer.valueOf(i8));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C23466p pVar9 = this.f65089l;
                        if (pVar9 != null) {
                            boolean z4 = !subscribeMsgRequestResult2.f49006j;
                            pVar9.f67319Q = z4;
                            TextView textView3 = pVar9.f67342y;
                            if (z4) {
                                i7 = 0;
                            }
                            textView3.setVisibility(i7);
                        }
                        C23466p pVar10 = this.f65089l;
                        if ((pVar10 != null && pVar10.f67317N) && pVar10 != null) {
                            WordingInfo wordingInfo5 = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo5);
                            pVar10.mo36943f(wordingInfo5.f49040g);
                        }
                        C23466p pVar11 = this.f65089l;
                        if ((pVar11 != null && pVar11.f67319Q) && pVar11 != null) {
                            WordingInfo wordingInfo6 = subscribeMsgRequestResult2.f49007n;
                            C87412m.m108591d(wordingInfo6);
                            String str17 = wordingInfo6.f49042i;
                            C87412m.m108594g(str17, "value");
                            pVar11.f67318P = str17;
                            pVar11.f67342y.setVisibility(0);
                            pVar11.f67342y.setText(pVar11.f67318P);
                        }
                        Object[] objArr = new Object[2];
                        C23466p pVar12 = this.f65089l;
                        objArr[0] = pVar12 != null ? Boolean.valueOf(pVar12.f67317N) : null;
                        C23466p pVar13 = this.f65089l;
                        objArr[1] = pVar13 != null ? Boolean.valueOf(pVar13.f67319Q) : null;
                        Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo showSubscribeMsgRequestDialog showAlways: %s, showReject: %s", objArr);
                        C23466p pVar14 = this.f65089l;
                        if (pVar14 != null) {
                            pVar14.f67313J = new C22641g(this);
                        }
                        if (this.f65090m == null) {
                            this.f65090m = new C87362k(context3, (C76063l) null);
                            if (context3 instanceof Activity) {
                                ((Activity) context3).addContentView(this.f65090m, new ViewGroup.LayoutParams(-1, -2));
                            }
                        }
                        C23466p pVar15 = this.f65089l;
                        if (pVar15 != null) {
                            pVar15.mo36944g(2);
                        }
                        C87362k kVar = this.f65090m;
                        if (kVar != null) {
                            kVar.mo121778b(this.f65089l);
                        }
                        C22894a aVar7 = C22894a.f65798a;
                        int size = arrayList.size();
                        Log.m105925i("MicroMsg.SubscribeMsgReporter", "alvinluo createSession templateCount: %d", Integer.valueOf(size));
                        System.currentTimeMillis();
                        C22894a.f65801d = size;
                        ((ArrayList) C22894a.f65799b).clear();
                        ((ArrayList) C22894a.f65800c).clear();
                        if (size > 0) {
                            ArrayList arrayList2 = new ArrayList(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                arrayList2.add(0);
                            }
                            C22894a.f65800c = arrayList2;
                        }
                        z = true;
                    }
                    C22625a aVar8 = this.f65085h;
                    if (aVar8 != null) {
                        aVar8.mo21982b(z, subscribeMsgRequestResult2);
                        return;
                    }
                    return;
                }
                C22625a aVar9 = this.f65085h;
                if (aVar9 != null) {
                    aVar9.mo21985e(i2, i5, subscribeMsgRequestResult2.f49016w);
                }
            } else if (i3 == 1) {
                mo35751b(2, currentTimeMillis);
                ShowInfo showInfo5 = subscribeMsgRequestResult2.f49012s;
                if (showInfo5 == null || (str5 = showInfo5.f48990e) == null) {
                    str5 = "";
                }
                if (showInfo5 == null || (str6 = showInfo5.f48991f) == null) {
                    str6 = "";
                }
                mo35753d(context3, str5, str6, new C22627a(subscribeMsgRequestResult2, this, i2));
            } else if (i3 == 2) {
                mo35751b(3, currentTimeMillis);
                ShowInfo showInfo6 = subscribeMsgRequestResult2.f49012s;
                if (showInfo6 == null || (str7 = showInfo6.f48991f) == null) {
                    str7 = "";
                }
                mo35754e(str7, new C22628b(subscribeMsgRequestResult2, this, i2));
            } else if (i3 == 3) {
                mo35751b(4, currentTimeMillis);
                C22630d dVar2 = new C22630d(subscribeMsgRequestResult2, this, i2);
                ShowInfo showInfo7 = subscribeMsgRequestResult2.f49012s;
                C77398g C = C76879j.m92709C(context, showInfo7 != null ? showInfo7.f48991f : null, showInfo7 != null ? showInfo7.f48990e : null, context3.getString(C0966R.string.jrt), context3.getString(C0966R.string.f7926wf), false, new C22637b(this, dVar2, context3, subscribeMsgRequestResult2), new C14154c(dVar2));
                this.f65088k = C;
                if (C != null) {
                    C.setCanceledOnTouchOutside(false);
                }
            } else if (i3 != 4) {
                mo35751b(-1, currentTimeMillis);
                String string = context3.getString(C0966R.string.jrv);
                C87412m.m108593f(string, "context.getString(com.te…ubscribe_msg_common_fail)");
                mo35754e(string, new C22631e(subscribeMsgRequestResult2, this, i2));
            } else {
                mo35751b(5, currentTimeMillis);
                ShowInfo showInfo8 = subscribeMsgRequestResult2.f49012s;
                if (showInfo8 == null || (str8 = showInfo8.f48991f) == null) {
                    str8 = "";
                }
                mo35754e(str8, new C22629c(subscribeMsgRequestResult2, this, i2));
            }
        }

        /* renamed from: b */
        public final void mo35751b(int i, long j) {
            if (this.f65095r == 1) {
                C22894a aVar = C22894a.f65798a;
                String str = this.f65080c;
                String str2 = this.f65083f;
                C87412m.m108594g(str, "bizUsername");
                C87412m.m108594g(str2, "content");
                C117407d.INSTANCE.mo160131h(17639, C75592q0.m90789s() + '#' + str + '#' + j, Integer.valueOf(i), str2);
            }
        }

        /* renamed from: c */
        public final void mo35752c() {
            int i = this.f65079b;
            boolean z = false;
            long j = -1;
            if (i != 1) {
                if (i == 2) {
                    ArrayList<SubscribeMsgTmpItem> arrayList = this.f65086i;
                    C87412m.m108591d(arrayList);
                    Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo doSubscribeMsg bizUsername: %s, appId: %s, template size: %s", this.f65080c, this.f65081d, Integer.valueOf(arrayList.size()));
                    C22227f fVar = new C22227f();
                    fVar.f62974h = true;
                    String str = this.f65080c;
                    C87412m.m108594g(str, "<set-?>");
                    fVar.f62967a = str;
                    String str2 = this.f65081d;
                    C87412m.m108594g(str2, "<set-?>");
                    fVar.f62968b = str2;
                    List<SubscribeMsgTmpItem> list = fVar.f62969c;
                    ArrayList<SubscribeMsgTmpItem> arrayList2 = this.f65086i;
                    C87412m.m108591d(arrayList2);
                    ((ArrayList) list).addAll(arrayList2);
                    fVar.f62970d = true;
                    byte[] bArr = this.f65093p;
                    C87412m.m108594g(bArr, "<set-?>");
                    fVar.f62971e = bArr;
                    fVar.f62972f = this.f65094q;
                    String str3 = this.f65084g;
                    C87412m.m108594g(str3, "<set-?>");
                    fVar.f62973g = str3;
                    fVar.f62975i = new C22635i(this);
                    C22222c cVar = this.f65091n;
                    if (cVar != null) {
                        j = cVar.mo35370k(fVar);
                    }
                    this.f65092o = j;
                    return;
                } else if (i != 3) {
                    return;
                }
            }
            if (!(this.f65082e.length() == 0) || !this.f65087j.isEmpty()) {
                if (this.f65084g.length() > 0) {
                    String optString = new JSONObject(this.f65084g).optString("username");
                    C87412m.m108593f(optString, "username");
                    if (optString.length() > 0) {
                        this.f65080c = optString;
                    }
                }
                Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo getSubscribeMsgTemplateList bizUsername: %s, bizAppId: %s, url: %s, templateIdList size: %s", this.f65080c, this.f65081d, this.f65082e, Integer.valueOf(this.f65087j.size()));
                C22894a.C22895a aVar = this.f65096s;
                String str4 = this.f65080c;
                aVar.getClass();
                C87412m.m108594g(str4, "<set-?>");
                aVar.f65802a = str4;
                C22894a.C22895a aVar2 = this.f65096s;
                String str5 = this.f65081d;
                aVar2.getClass();
                C87412m.m108594g(str5, "<set-?>");
                aVar2.f65803b = str5;
                try {
                    if (this.f65084g.length() > 0) {
                        JSONObject jSONObject = new JSONObject(this.f65084g);
                        C22894a.C22895a aVar3 = this.f65096s;
                        String optString2 = jSONObject.optString("sessionid");
                        C87412m.m108593f(optString2, "data.optString(\"sessionid\")");
                        aVar3.getClass();
                        aVar3.f65804c = optString2;
                    }
                } catch (Exception unused) {
                }
                C22636j jVar = new C22636j(this);
                if (this.f65080c.length() > 0) {
                    C22222c cVar2 = this.f65091n;
                    if (cVar2 != null) {
                        j = cVar2.mo35367h(this.f65080c, this.f65082e, this.f65087j, this.f65084g, jVar);
                    }
                    this.f65092o = j;
                    return;
                }
                if (this.f65081d.length() > 0) {
                    z = true;
                }
                if (z) {
                    C22222c cVar3 = this.f65091n;
                    if (cVar3 != null) {
                        j = cVar3.mo35373n(this.f65081d, this.f65082e, this.f65087j, this.f65084g, jVar);
                    }
                    this.f65092o = j;
                    return;
                }
                C22625a aVar4 = this.f65085h;
                if (aVar4 != null) {
                    aVar4.mo21985e(this.f65079b, -1, "username or appId invalid");
                    return;
                }
                return;
            }
            C22625a aVar5 = this.f65085h;
            if (aVar5 != null) {
                aVar5.mo21985e(this.f65079b, 10001, "templateIdList empty");
            }
        }

        /* renamed from: d */
        public final void mo35753d(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
            if (!(str2.length() > 0)) {
                str2 = context.getString(C0966R.string.jru);
                C87412m.m108593f(str2, "{\n                contex…lt_content)\n            }");
            }
            C76879j.m92711E(context, str2, str, context.getResources().getString(C0966R.string.f8029zr), false, onClickListener);
        }

        /* renamed from: e */
        public final void mo35754e(String str, C32224a<C13598b0> aVar) {
            WeakReference<Context> weakReference;
            Context context;
            if (!(!(str.length() > 0) || (weakReference = this.f65078a) == null || (context = weakReference.get()) == null)) {
                C76701a.makeText(context, (CharSequence) str, 0).show();
            }
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public static final int m26494b(int i) {
        Integer num = f65077b.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public void mo35749a(C22626b bVar) {
        if (bVar != null) {
            Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "cancel SubscribeMsgRequestTask bizUsername: %s, appId: %s, mRunningTaskId: %s", bVar.f65080c, bVar.f65081d, Long.valueOf(bVar.f65092o));
            bVar.f65085h = null;
            bVar.f65078a = null;
            C22222c cVar = bVar.f65091n;
            if (cVar != null) {
                cVar.mo35368i(bVar.f65092o);
            }
        }
    }
}
