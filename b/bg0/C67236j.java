package bg0;

import ag0.C27888a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import hp3.C98494b;
import lp3.C46888b;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117878c;
import te3.C51181s;
import te3.C78021z;
import vf0.C37726b;
import yf0.C79104i;
import zf0.C53771a;
import zf0.C53772b;

/* renamed from: bg0.j */
public class C67236j implements C98494b<C67235i> {

    /* renamed from: a */
    public C67235i f193065a;

    /* renamed from: b */
    public final C67240d f193066b = new C67240d();

    /* renamed from: c */
    public final C67237a f193067c = new C67237a();

    /* renamed from: d */
    public final C28311e f193068d = new C28311e();

    /* renamed from: e */
    public final C67239c f193069e = new C67239c();

    /* renamed from: f */
    public final C67238b f193070f = new C67238b();

    /* renamed from: g */
    public final C67241f f193071g = new C67241f();

    /* renamed from: bg0.j$e */
    public class C28311e implements C88820e<Void, C117878c<String, String, String>> {
        public C28311e() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            String str;
            C117878c cVar = (C117878c) obj;
            C67235i iVar = C67236j.this.f193065a;
            String str2 = (String) cVar.mo182596a(0);
            String str3 = (String) cVar.mo182596a(1);
            String str4 = (String) cVar.mo182596a(2);
            String b = iVar.f286525o.mo106600b("chatroom");
            String b2 = iVar.f286525o.mo106600b("bill_no");
            synchronized (C79104i.class) {
                Log.m105919d("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, billNo: %s, payMsgId: %s", str3, b2, str2);
                if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(b2) && !Util.isNullOrNil(str2)) {
                    C27888a jo = C37726b.xx0().mo55665jo(str2);
                    Object[] objArr = new Object[5];
                    objArr[0] = str3;
                    objArr[1] = b;
                    objArr[2] = str2;
                    objArr[3] = jo;
                    objArr[4] = Boolean.valueOf(jo != null && jo.field_insertmsg);
                    Log.m105925i("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, chatroom: %s, payMsgId: %s, record: %s, insertmsg: %s", objArr);
                    if (jo == null || !jo.field_insertmsg) {
                        String str5 = "weixin://weixinnewaa/opendetail?billno=" + b2 + "&launcherusername=" + str3;
                        if (Util.isNullOrNil(str4)) {
                            Log.m105924i("MicroMsg.AAUtil", "empty msgxml, insert local msgcontent");
                            String str6 = C85875k4.m106211z() ? "#7D90A9" : "#576B95";
                            str = str3.equals(C75592q0.m90789s()) ? MMApplicationContext.getContext().getString(C0966R.string.hgs, new Object[]{str5, str6}) : MMApplicationContext.getContext().getString(C0966R.string.hgt, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(str3, b), str6, str5});
                        } else {
                            str = str4.replace("\"#037AFF\"", FastJsonResponse.QUOTE + (C85875k4.m106211z() ? "#7D90A9" : "#576B95") + FastJsonResponse.QUOTE);
                            Log.m105919d("MicroMsg.AAUtil", "insert msgxml: %s", str);
                        }
                        C79104i.m95669n(str, b, jo, str2, false);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: bg0.j$a */
    public class C67237a implements C88820e<C51181s, C117878c<Long, String, String>> {
        public C67237a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C67235i iVar = C67236j.this.f193065a;
            long longValue = ((Long) cVar.mo182596a(0)).longValue();
            String str = (String) cVar.mo182596a(1);
            String str2 = (String) cVar.mo182596a(2);
            String b = iVar.f286525o.mo106600b("bill_no");
            String b2 = iVar.f286525o.mo106600b("chatroom");
            int i = iVar.f286525o.mo106599a("enter_scene", 0) == 1 ? 1 : 2;
            Log.m105925i("MicroMsg.PaylistAAInteractor", "aaPay, payAmount: %s, billNo: %s, chatroom: %s，desc:%s", Long.valueOf(longValue), b, b2, str);
            Long valueOf = Long.valueOf(longValue);
            Integer valueOf2 = Integer.valueOf(i);
            C88633e eVar = new C88633e();
            eVar.mo123077t(b, valueOf, valueOf2, b2, str, str2);
            eVar.mo123061d(iVar.f193063r.f232258b);
            C88643g.m110543a(eVar);
            return null;
        }
    }

    /* renamed from: bg0.j$b */
    public class C67238b implements C88820e<Boolean, Void> {
        public C67238b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C67235i iVar = C67236j.this.f193065a;
            String b = iVar.f286525o.mo106600b("bill_no");
            int a = iVar.f286525o.mo106599a("enter_scene", 0);
            C88643g.m110543a(((C88633e) C88643g.m110549g(b, Integer.valueOf(a), iVar.f286525o.mo106600b("chatroom"))).mo123061d(iVar.f193064s.f150484b));
            return null;
        }
    }

    /* renamed from: bg0.j$c */
    public class C67239c implements C88820e<Void, C117878c<Long, String, String>> {
        public C67239c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C67235i iVar = C67236j.this.f193065a;
            iVar.getClass();
            C46888b b = C88643g.m110544b();
            String b2 = iVar.f286525o.mo106600b("bill_no");
            int a = iVar.f286525o.mo106599a("enter_scene", 0);
            String b3 = iVar.f286525o.mo106600b("chatroom");
            b.mo72092b();
            new C53771a(b2, ((Long) cVar.mo182596a(0)).longValue(), a, b3, (String) cVar.mo182596a(1), (String) cVar.mo182596a(2)).mo9225i().mo123064p(new C39769g(iVar, b));
            return null;
        }
    }

    /* renamed from: bg0.j$d */
    public class C67240d implements C88820e<C78021z, Void> {
        public C67240d() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C67235i iVar = C67236j.this.f193065a;
            String b = iVar.f286525o.mo106600b("bill_no");
            int a = iVar.f286525o.mo106599a("enter_scene", 0);
            String b2 = iVar.f286525o.mo106600b("chatroom");
            String b3 = iVar.f286525o.mo106600b("key_sign");
            int a2 = iVar.f286525o.mo106599a("key_ver", 0);
            Log.m105925i("MicroMsg.PaylistAAInteractor", "getPayListDetail, billNo: %s, scene: %s, chatRoom: %s", b, Integer.valueOf(a), b2);
            C88643g.m110543a(((C88633e) C88643g.m110551i(b, Integer.valueOf(a), b2, b3, Integer.valueOf(a2))).mo123061d(iVar.f193062q.f232241b));
            return null;
        }
    }

    /* renamed from: bg0.j$f */
    public class C67241f implements C88820e<Boolean, Void> {
        public C67241f() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C67235i iVar = C67236j.this.f193065a;
            String b = iVar.f286525o.mo106600b("bill_no");
            String b2 = iVar.f286525o.mo106600b("chatroom");
            int a = iVar.f286525o.mo106599a("enter_scene", 0);
            Log.m105924i("MicroMsg.PaylistAAInteractor", "urgeAAPay");
            C46888b b3 = C88643g.m110544b();
            b3.mo72092b();
            new C53772b(b, b2, a).mo9225i().mo123064p(new C39770h(iVar, b3));
            return null;
        }
    }

    public C67236j() {
        C67235i iVar = new C67235i();
        this.f193065a = iVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f193065a;
    }
}
