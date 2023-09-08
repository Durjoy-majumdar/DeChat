package com.tencent.p014mm.plugin.newtips.model;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Iterator;
import java.util.LinkedList;
import p749xh.C118877o6;
import te3.wg4;

/* renamed from: com.tencent.mm.plugin.newtips.model.k */
public class C115626k extends C118877o6 {

    /* renamed from: y0 */
    public static IAutoDBItem.MAutoDBInfo f346851y0 = C118877o6.initAutoDBInfo(C115626k.class);

    public C115626k() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f346851y0;
    }

    public String toString() {
        String str;
        LinkedList<String> linkedList;
        wg4 wg4 = this.field_parents;
        if (wg4 == null || (linkedList = wg4.f144043d) == null || linkedList.size() <= 0) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.field_parents.f144043d.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            str = sb.toString();
        }
        return "NewTipsInfo{field_uniqueId='" + this.field_uniqueId + '\'' + ", field_path='" + this.field_path + '\'' + ", field_showType=" + this.field_showType + ", field_title='" + this.field_title + '\'' + ", field_icon_url='" + this.field_icon_url + '\'' + ", field_parents=" + str + ", field_tipId=" + this.field_tipId + ", field_priority=" + this.field_priority + ", field_tipType=" + this.field_tipType + ", field_beginShowTime=" + this.field_beginShowTime + ", field_overdueTime=" + this.field_overdueTime + ", field_disappearTime=" + this.field_disappearTime + ", field_minClientVersion=" + this.field_minClientVersion + ", field_maxClientVersion=" + this.field_maxClientVersion + ", field_lang=" + this.field_lang + ", field_reg=" + this.field_regCountry + ", field_state=" + this.field_state + ", field_dynamicPath='" + this.field_dynamicPath + '\'' + '}';
    }

    public C115626k(String str, int i, int i2, int i3, long j, long j2, long j3, int i4, int i5, String str2) {
        this.field_uniqueId = str;
        this.field_tipId = i;
        this.field_priority = i2;
        this.field_tipType = i3;
        this.field_beginShowTime = j;
        this.field_overdueTime = j2;
        this.field_disappearTime = j3;
        this.field_minClientVersion = i4;
        this.field_maxClientVersion = i5;
        this.field_extInfo = str2;
    }
}
