package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import java.util.Comparator;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.e0 */
public final class C96868e0<T> implements Comparator {

    /* renamed from: d */
    public static final C96868e0<T> f283843d = new C96868e0<>();

    public int compare(Object obj, Object obj2) {
        int i = (((FileSelectorUI.C96845n.C96846a) obj).f283801b > ((FileSelectorUI.C96845n.C96846a) obj2).f283801b ? 1 : (((FileSelectorUI.C96845n.C96846a) obj).f283801b == ((FileSelectorUI.C96845n.C96846a) obj2).f283801b ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? -1 : 1;
    }
}
