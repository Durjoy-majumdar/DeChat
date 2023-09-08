package ie0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46021h;
import he0.C46026p;
import he0.C46027q;
import he0.C46028r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import je0.C46473f;
import je0.C46476i;
import je0.C46493o;
import o90.C100308d;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C101611g;
import rx3.C13598b0;
import te3.C49661h52;
import te3.C51195s3;
import zt3.C119157j;

/* renamed from: ie0.y */
public final class C46232y implements C11385n {

    /* renamed from: d */
    public static final C46232y f124619d = new C46232y();

    /* renamed from: e */
    public static Integer f124620e;

    /* renamed from: f */
    public static final C101611g<String, Integer> f124621f = new C100308d(200);

    /* renamed from: g */
    public static HashSet<String> f124622g = new HashSet<>();

    /* renamed from: h */
    public static HashMap<String, ArrayList<C46021h.C46022a>> f124623h = new HashMap<>();

    /* renamed from: i */
    public static ConcurrentHashMap<String, C46028r> f124624i = new ConcurrentHashMap<>();

    /* renamed from: ie0.y$a */
    public static final class C46233a implements C46021h.C46022a {

        /* renamed from: a */
        public final /* synthetic */ C46021h.C46022a f124625a;

        public C46233a(C46021h.C46022a aVar) {
            this.f124625a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r1 = r3.f124111d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33215a(he0.C46027q r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "alvinluo getContact finish! contact: "
                r0.append(r1)
                if (r3 == 0) goto L_0x0015
                he0.f r1 = r3.f124111d
                if (r1 == 0) goto L_0x0015
                java.lang.String r1 = r1.getUsername()
                goto L_0x0016
            L_0x0015:
                r1 = 0
            L_0x0016:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.OpenIMKefuGetContactService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                he0.h$a r0 = r2.f124625a
                if (r0 == 0) goto L_0x0029
                r0.mo33215a(r3)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ie0.C46232y.C46233a.mo33215a(he0.q):void");
        }

        /* renamed from: b */
        public void mo33216b(String str) {
            C46021h.C46022a aVar = this.f124625a;
            if (aVar != null) {
                aVar.mo33216b(str);
            }
        }
    }

    /* renamed from: ie0.y$b */
    public static final class C46234b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46026p f124626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46234b(C46026p pVar) {
            super(0);
            this.f124626d = pVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.OpenIMKefuGetContactService", "alvinluo getContactFromRemote url: " + this.f124626d.f124102b + ", username: " + this.f124626d.f124103c);
            C46232y yVar = C46232y.f124619d;
            C86709a0.m107524d().mo123460f(new C46493o(this.f124626d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ie0.y$c */
    public static final class C46235c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f124627d;

        /* renamed from: e */
        public final /* synthetic */ int f124628e;

        /* renamed from: f */
        public final /* synthetic */ int f124629f;

        /* renamed from: g */
        public final /* synthetic */ String f124630g;

        /* renamed from: h */
        public final /* synthetic */ C46220j f124631h;

        /* renamed from: i */
        public final /* synthetic */ C49661h52 f124632i;

        /* renamed from: ie0.y$c$a */
        public static final class C46236a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList<C46021h.C46022a> f124633d;

            /* renamed from: e */
            public final /* synthetic */ int f124634e;

            /* renamed from: f */
            public final /* synthetic */ int f124635f;

            /* renamed from: g */
            public final /* synthetic */ String f124636g;

            /* renamed from: h */
            public final /* synthetic */ C46220j f124637h;

            /* renamed from: i */
            public final /* synthetic */ C49661h52 f124638i;

            public C46236a(ArrayList<C46021h.C46022a> arrayList, int i, int i2, String str, C46220j jVar, C49661h52 h522) {
                this.f124633d = arrayList;
                this.f124634e = i;
                this.f124635f = i2;
                this.f124636g = str;
                this.f124637h = jVar;
                this.f124638i = h522;
            }

            public final void run() {
                String str;
                Integer num;
                ArrayList<C46021h.C46022a> arrayList = this.f124633d;
                if (arrayList != null) {
                    int i = this.f124634e;
                    int i2 = this.f124635f;
                    String str2 = this.f124636g;
                    C46220j jVar = this.f124637h;
                    C49661h52 h522 = this.f124638i;
                    for (C46021h.C46022a aVar : arrayList) {
                        C46027q qVar = new C46027q();
                        qVar.f124108a = i;
                        qVar.f124109b = i2;
                        qVar.f124110c = str2;
                        qVar.f124111d = jVar;
                        if (!BuildInfo.DEBUG || (num = C46232y.f124620e) == null) {
                            qVar.f124112e = h522 != null ? h522.f134451e : 3;
                        } else {
                            C87412m.m108591d(num);
                            qVar.f124112e = num.intValue();
                        }
                        if (h522 == null || (str = h522.f134452f) == null) {
                            str = "";
                        }
                        qVar.f124113f = str;
                        aVar.mo33215a(qVar);
                    }
                }
            }
        }

        public C46235c(String str, int i, int i2, String str2, C46220j jVar, C49661h52 h522) {
            this.f124627d = str;
            this.f124628e = i;
            this.f124629f = i2;
            this.f124630g = str2;
            this.f124631h = jVar;
            this.f124632i = h522;
        }

        public final void run() {
            C46232y.f124622g.remove(this.f124627d);
            ((C119157j) C119157j.f356862d).mo183895z(new C46236a(C46232y.f124623h.remove(this.f124627d), this.f124628e, this.f124629f, this.f124630g, this.f124631h, this.f124632i));
        }
    }

    /* renamed from: a */
    public static final void m51535a(C46026p pVar, C46021h.C46022a aVar) {
        if (pVar != null) {
            String str = pVar.f124103c;
            Log.m105924i("MicroMsg.OpenIMKefuGetContactService", "alvinluo getContact start username: " + str + ", needGetFromRemote: " + pVar.f124104d);
            C46233a aVar2 = new C46233a(aVar);
            boolean z = false;
            if (str == null || str.length() == 0) {
                aVar2.mo33215a((C46027q) null);
                return;
            }
            C46220j b = C46225p.m51524b(str);
            if (!(b == null || b.f124591Z == 0)) {
                String str2 = b.field_nickname;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C46027q qVar = new C46027q();
                    qVar.f124111d = b;
                    aVar2.mo33215a(qVar);
                    return;
                }
            }
            if (pVar.f124104d) {
                m51536b(pVar, aVar2);
            } else {
                aVar2.mo33215a((C46027q) null);
            }
        }
    }

    /* renamed from: b */
    public static final void m51536b(C46026p pVar, C46021h.C46022a aVar) {
        C87412m.m108594g(pVar, "request");
        String str = pVar.f124107g;
        Log.m105918d("MicroMsg.OpenIMKefuGetContactService", "alvinluo getContactFromRemote checkTryLimit: false");
        C46234b bVar = new C46234b(pVar);
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.OpenIMKefuGetContactService", "alvinluo checkAddGetContactTask username invalid");
            if (aVar != null) {
                aVar.mo33215a((C46027q) null);
                return;
            }
            return;
        }
        ((C119157j) C119157j.f356862d).mo183871b(new C46230x(str, false, aVar, bVar), "getOpenImKefuContact");
    }

    /* renamed from: c */
    public final void mo71644c(String str, C46220j jVar, C49661h52 h522, int i, int i2, String str2) {
        Log.m105926v("MicroMsg.OpenIMKefuGetContactService", "alvinluo onGetContactEnd username: " + str);
        ((C119157j) C119157j.f356862d).mo183871b(new C46235c(str, i, i2, str2, jVar, h522), "getOpenImKefuContact");
    }

    /* renamed from: d */
    public final void mo71645d(boolean z, int i, int i2, String str, C117747y yVar) {
        String str2;
        C46021h.C46023b bVar;
        C46021h.C46023b bVar2;
        Bundle bundle = new Bundle();
        if (yVar instanceof C46473f) {
            C46473f fVar = (C46473f) yVar;
            str2 = fVar.f125204e;
            if (z) {
                bundle.putInt("key_op_contact_result_source", fVar.f125203d);
            }
        } else {
            str2 = yVar instanceof C46476i ? ((C46476i) yVar).f125212d : "";
        }
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = yVar != null ? Integer.valueOf(yVar.getType()) : null;
        objArr[2] = str2;
        Log.m105925i("MicroMsg.OpenIMKefuGetContactService", "alvinluo onOpContactEnd success: %s, type: %s, key: %s", objArr);
        C46028r remove = f124624i.remove(str2);
        if (z) {
            if (remove != null && (bVar2 = remove.f124117d) != null) {
                bVar2.mo33199a(remove.f124115b, bundle);
            }
        } else if (remove != null && (bVar = remove.f124117d) != null) {
            bVar.mo33200b(remove.f124115b, i, i2, str, (Bundle) null);
        }
    }

    /* renamed from: e */
    public final void mo71646e(C46028r rVar) {
        String str = rVar.f124114a;
        if (f124624i.containsKey(str)) {
            Log.m105924i("MicroMsg.OpenIMKefuGetContactService", "alvinluo opContact is already running key: " + str);
            return;
        }
        Log.m105924i("MicroMsg.OpenIMKefuGetContactService", "alvinluo opContact username: " + str + ", opType: " + rVar.f124115b);
        f124624i.put(str, rVar);
        int i = rVar.f124115b;
        if (i == 1) {
            C51195s3 s3Var = new C51195s3();
            Bundle bundle = rVar.f124116c;
            byte[] byteArray = bundle != null ? bundle.getByteArray("key_add_contact_context") : null;
            if (byteArray != null) {
                try {
                    if (true ^ (byteArray.length == 0)) {
                        s3Var.parseFrom(byteArray);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.OpenIMKefuGetContactService", e, "alvinluo opContact exception", new Object[0]);
                }
            }
            C86709a0.m107524d().mo123460f(new C46473f(rVar.f124114a, s3Var, rVar.f124118e));
        } else if (i == 2) {
            C86709a0.m107524d().mo123460f(new C46476i(rVar.f124114a));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("alvinluo onSceneEnd errType: ");
        sb.append(i);
        sb.append(", errCode: ");
        sb.append(i2);
        sb.append(", errMsg: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        Log.m105924i("MicroMsg.OpenIMKefuGetContactService", sb.toString());
        if (yVar instanceof C46493o) {
            if (i == 0 && i2 == 0) {
                C46493o oVar = (C46493o) yVar;
                C46220j jVar = oVar.f125257d;
                C49661h52 h522 = oVar.f125258e;
                String str2 = oVar.f125261h.f124107g;
                C87412m.m108593f(str2, "scene.getRequest().key()");
                mo71644c(str2, jVar, h522, i, i2, str);
                return;
            }
            String str3 = ((C46493o) yVar).f125261h.f124107g;
            C87412m.m108593f(str3, "scene.getRequest().key()");
            mo71644c(str3, (C46220j) null, (C49661h52) null, i, i2, str);
        } else if (!(yVar instanceof C46473f) && !(yVar instanceof C46476i)) {
        } else {
            if (i == 0 && i2 == 0) {
                mo71645d(true, i, i2, str, yVar);
            } else {
                mo71645d(false, i, i2, str, yVar);
            }
        }
    }
}
