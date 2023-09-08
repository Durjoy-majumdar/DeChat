package com.tencent.maas.model;

import java.util.ArrayList;
import java.util.List;

public class WMMaterialStickerCallbackData {
    private final long categoryID;
    private final List<WMMaterialInfo> materialInfos = new ArrayList();

    public WMMaterialStickerCallbackData(long j, Object[] objArr) {
        this.categoryID = j;
        for (WMMaterialInfo add : objArr) {
            this.materialInfos.add(add);
        }
    }

    public long getCategoryID() {
        return this.categoryID;
    }

    public List<WMMaterialInfo> getMaterialInfos() {
        return this.materialInfos;
    }
}
