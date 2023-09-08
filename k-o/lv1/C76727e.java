package lv1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C78826u2;

/* renamed from: lv1.e */
public class C76727e extends C78826u2 {

    /* renamed from: J */
    public static IAutoDBItem.MAutoDBInfo f224464J = C78826u2.initAutoDBInfo(C76727e.class);

    public C76727e() {
        this.field_featureId = 0;
        this.field_title = "";
        this.field_titlePY = "";
        this.field_titleShortPY = "";
        this.field_tag = "";
        this.field_actionType = 0;
        this.field_url = "";
        this.field_helpUrl = "";
        this.field_updateUrl = "";
        this.field_androidUrl = "";
        this.field_iconPath = "";
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f224464J;
    }

    public String toString() {
        return "Feature [field_featureId=" + this.field_featureId + ", field_title=" + this.field_title + ", field_titlePY=" + this.field_titlePY + ", field_titleShortPY=" + this.field_titleShortPY + ", field_tag=" + this.field_tag + ", field_actionType=" + this.field_actionType + ", field_url=" + this.field_url + ", field_helpUrl=" + this.field_helpUrl + ", field_updateUrl=" + this.field_updateUrl + ", field_androidUrl=" + this.field_androidUrl + ", field_iconPath=" + this.field_iconPath + "]";
    }
}
