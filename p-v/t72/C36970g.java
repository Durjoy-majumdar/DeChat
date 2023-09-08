package t72;

import com.tencent.p014mm.vfs.C86009m1;
import java.util.Comparator;

/* renamed from: t72.g */
public class C36970g implements Comparator<C86009m1> {
    public C36970g(C118391i iVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = ((((C86009m1) obj).mo119979q() - ((C86009m1) obj2).mo119979q()) > 0 ? 1 : ((((C86009m1) obj).mo119979q() - ((C86009m1) obj2).mo119979q()) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    public boolean equals(Object obj) {
        return true;
    }
}
