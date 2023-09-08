package com.tencent.maas.model;

import java.util.ArrayList;
import java.util.List;

public class MJTemplateCategory {
    private int CategoryType;
    private int FoldIndex;
    private String categoryID;
    private String displayName;
    private Object[] templateInfoObjs;
    private String thumbnailURL;

    public MJTemplateCategory(String str, String str2, String str3, int i, int i2, Object[] objArr) {
        this.categoryID = str;
        this.thumbnailURL = str2;
        this.displayName = str3;
        this.FoldIndex = i;
        this.CategoryType = i2;
        this.templateInfoObjs = objArr;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public int getCategoryType() {
        return this.CategoryType;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getFoldIndex() {
        return this.FoldIndex;
    }

    public Object[] getTemplateInfoObjs() {
        return this.templateInfoObjs;
    }

    public List<MJTemplateInfo> getTemplateInfos() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = this.templateInfoObjs;
        if (objArr != null) {
            for (Object obj : objArr) {
                arrayList.add((MJTemplateInfo) obj);
            }
        }
        return arrayList;
    }

    public String getThumbnailURL() {
        return this.thumbnailURL;
    }
}
