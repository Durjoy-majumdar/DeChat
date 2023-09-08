package k62;

import android.content.Context;
import android.os.Looper;
import cc3.C26835d;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct;
import com.tencent.p014mm.sdk.p134kt.DataPair3;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sm2.C101650a;

/* renamed from: k62.b */
public final class C99107b extends C98597b {

    /* renamed from: f */
    public final C13601g f290595f = C36568h.m40985a(C99110b.f290600d);

    /* renamed from: g */
    public final C75875l.C75877b f290596g = new C99108a(this);

    /* renamed from: k62.b$a */
    public static final class C99108a implements C75875l.C75877b {

        /* renamed from: d */
        public final /* synthetic */ C99107b f290597d;

        /* renamed from: k62.b$a$a */
        public static final class C99109a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C99107b f290598d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f290599e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99109a(C99107b bVar, C72963f4 f4Var) {
                super(0);
                this.f290598d = bVar;
                this.f290599e = f4Var;
            }

            public Object invoke() {
                if (NetStatusUtil.isConnected(MMApplicationContext.getContext()) && ((HashSet) ((C36570n) this.f290598d.f290595f).getValue()).add(Long.valueOf(this.f290599e.getMsgId()))) {
                    AndroidSendMsgFailStruct androidSendMsgFailStruct = new AndroidSendMsgFailStruct();
                    androidSendMsgFailStruct.f265295d = androidSendMsgFailStruct.mo86045b("LocalId", String.valueOf(this.f290599e.getMsgId()), true);
                    androidSendMsgFailStruct.f265296e = (long) this.f290599e.getType();
                    androidSendMsgFailStruct.f265298g = this.f290599e.getCreateTime();
                    androidSendMsgFailStruct.f265299h = androidSendMsgFailStruct.mo86045b("Username", this.f290599e.mo108768t(), true);
                    if (this.f290599e.mo101020w3()) {
                        String content = this.f290599e.getContent();
                        C26835d dVar = new C26835d();
                        C87412m.m108593f(content, "content");
                        C101650a j = dVar.mo141104j(content);
                        C87412m.m108592e(j, "null cannot be cast to non-null type com.tencent.mm.plugin.xml.appmsg.BaseAppMsg");
                        androidSendMsgFailStruct.f265297f = (long) ((C26835d) j).mo53871H();
                    }
                    C13601g<HashMap<Long, DataPair3<Integer, Integer, String>>> gVar = C33839d.f91468d;
                    DataPair3 dataPair3 = (DataPair3) ((HashMap) ((C36570n) C33839d.f91468d).getValue()).get(Long.valueOf(this.f290599e.getMsgId()));
                    if (dataPair3 != null) {
                        androidSendMsgFailStruct.f265300i = ((Number) dataPair3.getObj2()).intValue();
                        androidSendMsgFailStruct.f265301j = androidSendMsgFailStruct.mo86045b("ErrMsg", "errType:" + ((Number) dataPair3.getObj1()).intValue() + " errMsg:" + ((String) dataPair3.getObj3()), true);
                    }
                    androidSendMsgFailStruct.mo86054n();
                    androidSendMsgFailStruct.mo86056r();
                }
                return C13598b0.f38549a;
            }
        }

        public C99108a(C99107b bVar) {
            this.f290597d = bVar;
        }

        /* renamed from: w5 */
        public final void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            ArrayList<C72963f4> arrayList;
            if (eVar != null && (arrayList = eVar.f123846c) != null) {
                C99107b bVar = this.f290597d;
                for (C72963f4 f4Var : arrayList) {
                    if (f4Var.mo108769t2() == 1 && f4Var.getStatus() == 5 && f4Var.getCreateTime() >= C31543z5.m39453c() - 21600000) {
                        C61926c.m72661F("AndroidSendMsgFailReport", new C99109a(bVar, f4Var));
                    }
                }
            }
        }
    }

    /* renamed from: k62.b$b */
    public static final class C99110b extends C87413o implements C32224a<HashSet<Long>> {

        /* renamed from: d */
        public static final C99110b f290600d = new C99110b();

        public C99110b() {
            super(0);
        }

        public Object invoke() {
            return new HashSet();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99107b(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f290596g, (Looper) null);
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f290596g);
    }
}
