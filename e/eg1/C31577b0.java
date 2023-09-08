package eg1;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: eg1.b0 */
public final class C31577b0 {

    /* renamed from: a */
    public static final C31577b0 f84386a = new C31577b0();

    /* renamed from: b */
    public static volatile boolean f84387b;

    /* renamed from: c */
    public static final List<String> f84388c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    public static final List<String> f84389d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    public static final C13601g f84390e = C36568h.m40985a(C31578a.f84391d);

    /* renamed from: eg1.b0$a */
    public static final class C31578a extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public static final C31578a f84391d = new C31578a();

        public C31578a() {
            super(0);
        }

        public Object invoke() {
            MTimerHandler mTimerHandler = new MTimerHandler("TAG", (MTimerHandler.CallBack) C31575a0.f84382d, true);
            mTimerHandler.setLogging(false);
            return mTimerHandler;
        }
    }

    /* renamed from: a */
    public static final String m39463a(C31577b0 b0Var, C72963f4 f4Var) {
        b0Var.getClass();
        String nullAsNil = Util.nullAsNil(XmlParser.parseXml(f4Var.getContent(), "msg", (String) null).get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id"));
        C87412m.m108593f(nullAsNil, "nullAsNil(values[\".msg.a…fymsg.tipsinfo.tips_id\"])");
        return nullAsNil;
    }
}
