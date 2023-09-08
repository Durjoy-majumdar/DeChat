package f52;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import ex0.C45699g;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C52109yf2;
import te3.C52278zk2;

/* renamed from: f52.b */
public abstract class C45755b<T extends C7594e> extends C86430i<T> {

    /* renamed from: d */
    public final String f123613d;

    /* renamed from: f52.b$a */
    public static final class C45756a implements C45699g {

        /* renamed from: a */
        public final /* synthetic */ C45755b<T> f123614a;

        public C45756a(C45755b<T> bVar) {
            this.f123614a = bVar;
        }

        /* renamed from: a */
        public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
            return false;
        }

        /* renamed from: b */
        public void mo66581b(int i, String str, C52278zk2 zk22) {
            Log.m105924i("MicroMsg.MBJsApiTransferBase", "errCode:" + i + " errMsg:" + str);
            if (zk22 != null) {
                HashMap hashMap = new HashMap();
                String str2 = zk22.f146053f;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("result", str2);
                LinkedList<C52109yf2> linkedList = zk22.f146054g;
                C87412m.m108593f(linkedList, "response.header");
                if (!linkedList.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    LinkedList<C52109yf2> linkedList2 = zk22.f146054g;
                    C87412m.m108593f(linkedList2, "response.header");
                    for (C52109yf2 yf22 : linkedList2) {
                        String str3 = yf22.f145258d;
                        if (!(str3 == null || str3.length() == 0)) {
                            jSONObject.put(yf22.f145258d, yf22.f145259e);
                        }
                    }
                    hashMap.put("header", jSONObject);
                }
                if (zk22.f146051d == 0) {
                    this.f123614a.mo120840p().invoke(this.f123614a.mo120846k(hashMap));
                    return;
                }
                C32226l<C7596h, C13598b0> p = this.f123614a.mo120840p();
                C45755b<T> bVar = this.f123614a;
                p.invoke(bVar.mo120842g(1, "fail ret:" + zk22.f146051d + " retData:" + hashMap + " errMsg:" + str));
                return;
            }
            C32226l<C7596h, C13598b0> p2 = this.f123614a.mo120840p();
            C45755b<T> bVar2 = this.f123614a;
            p2.invoke(bVar2.mo120842g(2, "errCode:" + i + str));
        }
    }

    public C45755b(String str) {
        C87412m.m108594g(str, "authKey");
        this.f123613d = str;
    }

    /* renamed from: o */
    public C86430i<T> mo71237o() {
        Object newInstance = getClass().getConstructor(new Class[]{String.class}).newInstance(new Object[]{this.f123613d});
        C87412m.m108593f(newInstance, "javaClass.getConstructor…ava).newInstance(authKey)");
        return (C86430i) newInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if ((r2.length() == 0) != false) goto L_0x0031;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18q(e42.C7596h r8) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "reqUrl"
            java.lang.String r1 = r8.optString(r0)
            java.lang.String r2 = "scope"
            java.lang.String r2 = r8.optString(r2)
            gy3.C87412m.m108593f(r1, r0)
            int r3 = r1.length()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 != 0) goto L_0x0031
            java.lang.String r3 = "transferScope"
            gy3.C87412m.m108593f(r2, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x003e
        L_0x0031:
            fy3.l r3 = r7.mo120840p()
            java.lang.String r6 = "reqUrl or scope can not be nil"
            e42.h r4 = r7.mo120842g(r4, r6)
            r3.invoke(r4)
        L_0x003e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "reqUrl:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " scope:"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " appId:"
            r3.append(r1)
            java.lang.String r1 = r7.f123613d
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "MicroMsg.MBJsApiTransferBase"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo
            r1.<init>()
            int r3 = r7.mo71236r()
            r1.f109024d = r3
            r1.f109026f = r2
            java.lang.String r2 = r7.f123613d
            r1.f109032o = r2
            te3.yk2 r2 = new te3.yk2
            r2.<init>()
            java.lang.String r0 = r8.optString(r0)
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x0085
            r0 = r3
        L_0x0085:
            r2.f145341d = r0
            java.lang.String r0 = "reqBody"
            java.lang.String r0 = r8.optString(r0)
            if (r0 != 0) goto L_0x0090
            r0 = r3
        L_0x0090:
            r2.f145342e = r0
            java.lang.String r0 = "cgiCmdId"
            int r0 = r8.optInt(r0, r5)
            r2.f145343f = r0
            java.lang.String r0 = "method"
            int r0 = r8.optInt(r0, r5)
            r2.f145345h = r0
            r1.f109028h = r2
            java.lang.String r0 = "is_security_check"
            boolean r0 = r8.optBoolean(r0, r5)
            r1.f109029i = r0
            java.lang.String r0 = "header"
            org.json.JSONObject r8 = r8.optJSONObject(r0)
            if (r8 == 0) goto L_0x00de
            java.util.Iterator r0 = r8.keys()
            if (r0 == 0) goto L_0x00de
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r8.optString(r2)
            if (r4 != 0) goto L_0x00cd
            r4 = r3
        L_0x00cd:
            te3.yk2 r5 = r1.f109028h
            java.util.LinkedList<te3.yf2> r5 = r5.f145344g
            te3.yf2 r6 = new te3.yf2
            r6.<init>()
            r6.f145258d = r2
            r6.f145259e = r4
            r5.push(r6)
            goto L_0x00ba
        L_0x00de:
            java.lang.Class<ex0.f> r8 = ex0.C45698f.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            ex0.f r8 = (ex0.C45698f) r8
            f52.b$a r0 = new f52.b$a
            r0.<init>(r7)
            r8.mo71195RT(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f52.C45755b.mo18q(e42.h):void");
    }

    /* renamed from: r */
    public abstract int mo71236r();
}
