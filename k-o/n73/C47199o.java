package n73;

import com.tencent.p014mm.plugin.wear.model.C43465i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n73.o */
public class C47199o extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11033);
        arrayList.add(11030);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        if (i == 11030) {
            return C43465i.m46974d("wechatvoicesilk");
        }
        if (i != 11033) {
            return null;
        }
        return C43465i.m46974d("stlport_shared");
    }
}
