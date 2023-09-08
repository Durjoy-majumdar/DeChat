package p526fs;

import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p539gs.C32513c;
import py1.C47555c0;
import py1.C47609j5;

@C86522b
/* renamed from: fs.b */
public class C45806b extends C86301e implements C32513c {
    /* renamed from: IP */
    public List<String> mo58667IP() {
        if (C41853c.m45371e() != null) {
            C47555c0 c0Var = C41853c.f112797a.DownloadIntercept;
            if (c0Var != null) {
                LinkedList<C47609j5> linkedList = c0Var.f127613d;
                if (!Util.isNullOrNil((List) linkedList)) {
                    ArrayList arrayList = new ArrayList();
                    for (C47609j5 next : linkedList) {
                        if (next != null && !Util.isNullOrNil(next.f127819d)) {
                            arrayList.add(next.f127819d);
                        }
                    }
                    return arrayList;
                }
            }
        } else {
            C41853c.m45381o();
        }
        return null;
    }
}
