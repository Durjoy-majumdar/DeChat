package com.tencent.p014mm.plugin.expt.pageflow;

import com.tencent.p014mm.autogen.mmdata.rpt.PageFlowDetailStruct;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.h */
public class C115416h implements Comparator<PageFlowDetailStruct> {
    public C115416h(C29897i iVar) {
    }

    public int compare(Object obj, Object obj2) {
        return Long.compare(((PageFlowDetailStruct) obj).f343804i, ((PageFlowDetailStruct) obj2).f343804i);
    }
}
