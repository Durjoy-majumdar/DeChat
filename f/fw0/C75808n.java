package fw0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75569c4;
import f62.C75705n0;
import te3.C78020yw2;

/* renamed from: fw0.n */
public class C75808n implements C75705n0 {

    /* renamed from: d */
    public String f222429d;

    public C75808n(String str) {
        this.f222429d = str;
    }

    /* renamed from: h */
    public void mo106024h(C78020yw2 yw22, C72963f4 f4Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("<msgsource>");
        sb.append("<strangerantispamticket ticket=\"" + this.f222429d + "\"></strangerantispamticket>");
        sb.append(Util.nullAsNil(C75569c4.m90681n()));
        String str = (Util.isNullOrNil(yw22.f228647i) || !yw22.f228647i.startsWith("<msgsource>")) ? "<msgsource></msgsource>" : yw22.f228647i;
        yw22.f228647i = str;
        yw22.f228647i = str.replace("<msgsource>", sb.toString());
    }
}
