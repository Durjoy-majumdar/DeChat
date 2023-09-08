package yz1;

import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import java.util.Comparator;

/* renamed from: yz1.n */
public class C79192n implements Comparator<Integer> {
    public C79192n(GroupSolitatireEditUI groupSolitatireEditUI) {
    }

    public int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num.intValue() < num2.intValue()) {
            return 1;
        }
        return num == num2 ? 0 : -1;
    }
}
