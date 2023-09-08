package hz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.List;
import p749xh.C53327a1;
import te3.C49446fn;
import te3.C52139yn;

/* renamed from: hz0.f */
public class C46146f extends C53327a1 {

    /* renamed from: f1 */
    public static IAutoDBItem.MAutoDBInfo f124360f1 = C53327a1.initAutoDBInfo(C46146f.class);

    /* renamed from: R0 */
    public String f124361R0 = "";

    /* renamed from: S0 */
    public String f124362S0 = "";

    /* renamed from: T0 */
    public String f124363T0;

    /* renamed from: U0 */
    public String f124364U0;

    /* renamed from: V0 */
    public String f124365V0;

    /* renamed from: W0 */
    public boolean f124366W0 = false;

    /* renamed from: X0 */
    public C49446fn f124367X0;

    /* renamed from: Y0 */
    public C52139yn f124368Y0;

    /* renamed from: Z0 */
    public List<C46147a> f124369Z0 = null;

    /* renamed from: a1 */
    public List<C46148b> f124370a1 = null;

    /* renamed from: b1 */
    public int f124371b1 = 0;

    /* renamed from: c1 */
    public int f124372c1 = 0;

    /* renamed from: d1 */
    public boolean f124373d1;

    /* renamed from: e1 */
    public List<C46149c> f124374e1 = null;

    /* renamed from: hz0.f$a */
    public class C46147a {

        /* renamed from: a */
        public String f124375a;

        /* renamed from: b */
        public String f124376b;

        /* renamed from: c */
        public String f124377c;

        /* renamed from: d */
        public String f124378d;

        /* renamed from: e */
        public int f124379e;

        public C46147a(C46146f fVar) {
        }
    }

    /* renamed from: hz0.f$b */
    public class C46148b {

        /* renamed from: a */
        public String f124380a;

        /* renamed from: b */
        public String f124381b;

        /* renamed from: c */
        public String f124382c;

        /* renamed from: d */
        public String f124383d;

        public C46148b(C46146f fVar) {
        }
    }

    /* renamed from: hz0.f$c */
    public class C46149c {

        /* renamed from: a */
        public String f124384a;

        public C46149c(C46146f fVar) {
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f124360f1;
    }

    /* renamed from: l2 */
    public C49446fn mo71597l2() {
        C49446fn fnVar = this.f124367X0;
        if (fnVar != null) {
            return fnVar;
        }
        try {
            C49446fn fnVar2 = (C49446fn) new C49446fn().parseFrom(this.field_buttonData);
            this.f124367X0 = fnVar2;
            return fnVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardMsgInfo", e, "", new Object[0]);
            return new C49446fn();
        }
    }

    /* renamed from: m2 */
    public C52139yn mo71598m2() {
        C52139yn ynVar = this.f124368Y0;
        if (ynVar != null) {
            return ynVar;
        }
        try {
            C52139yn ynVar2 = (C52139yn) new C52139yn().parseFrom(this.field_operData);
            this.f124368Y0 = ynVar2;
            return ynVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardMsgInfo", e, "", new Object[0]);
            return new C52139yn();
        }
    }
}
