package vp1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import te3.C50140kk0;

/* renamed from: vp1.h */
public final class C14931h extends C87413o implements C32226l<C50140kk0, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<String> f40962d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14931h(List<String> list) {
        super(1);
        this.f40962d = list;
    }

    public Object invoke(Object obj) {
        boolean z;
        String str;
        FinderContact finderContact;
        C50140kk0 kk02 = (C50140kk0) obj;
        C87412m.m108594g(kk02, "item");
        if (kk02.f136842i == 0 && kk02.f136837d != 2) {
            List<String> list = this.f40962d;
            FinderObject finderObject = kk02.f136839f;
            if (finderObject == null || (finderContact = finderObject.contact) == null || (str = finderContact.username) == null) {
                str = "";
            }
            if (list.contains(str)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
