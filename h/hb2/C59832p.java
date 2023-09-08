package hb2;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C64417hb1;
import te3.C64550mb1;
import te3.C64621p23;

/* renamed from: hb2.p */
public final class C59832p {
    /* renamed from: a */
    public static final String m69725a(C64621p23 p232) {
        FinderObject finderObject;
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb12;
        LinkedList<C64550mb1> linkedList;
        if (p232 == null || (finderObject = p232.f184739d) == null || (finderObjectDesc = finderObject.objectDesc) == null || (hb12 = finderObjectDesc.mvInfo) == null || (linkedList = hb12.f183455d) == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C64550mb1 mb12 : linkedList) {
            String str = mb12.f184261g;
            arrayList.add(Integer.valueOf(((str == null || str.length() == 0) ? 1 : 0) ^ 1));
        }
        return C110818d0.m150921S(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
    }
}
