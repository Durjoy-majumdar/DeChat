package com.tencent.maas.instamovie;

import java.util.Collections;
import java.util.List;

public class MJResourceUsageDesc {
    private List<MJResourceItem> resourceItems;

    public MJResourceUsageDesc(List<MJResourceItem> list) {
        Collections.emptyList();
        this.resourceItems = list;
    }

    public List<MJResourceItem> getResourceItems() {
        return this.resourceItems;
    }
}
