package nd1;

import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider;
import java.util.LinkedList;
import ls1.C10648k;

/* renamed from: nd1.c */
public final class C61676c extends FinderTabProvider {
    public C61676c(int i) {
        setTabContainer(new C61675b(i));
        setTabViewAction(new C10648k());
        setTabs(new LinkedList());
        setFragments(new LinkedList());
    }

    public boolean isDynamic() {
        return true;
    }
}
