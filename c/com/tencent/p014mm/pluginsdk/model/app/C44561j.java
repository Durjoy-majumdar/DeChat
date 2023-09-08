package com.tencent.p014mm.pluginsdk.model.app;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.xweb.WCWebUpdater;
import p749xh.C53334e0;

/* renamed from: com.tencent.mm.pluginsdk.model.app.j */
public class C44561j extends C53334e0 {

    /* renamed from: x1 */
    public static IAutoDBItem.MAutoDBInfo f120844x1 = C53334e0.initAutoDBInfo(C44561j.class);

    public C44561j() {
        this.field_appId = "";
        this.field_appName = "";
        this.field_appDiscription = "";
        this.field_appIconUrl = "";
        this.field_appStoreUrl = "";
        this.field_appVersion = 0;
        this.field_appWatermarkUrl = "";
        this.field_packageName = "";
        this.field_status = 4;
        this.field_signature = "";
        this.field_modifyTime = 0;
        this.field_appName_en = "";
        this.field_appName_tw = "";
        this.field_appName_hk = "";
        this.field_appDiscription_en = "";
        this.field_appDiscription_tw = "";
        this.field_appType = "";
        this.field_openId = "";
        this.field_authFlag = 0;
        this.field_appInfoFlag = 0;
        this.f149240H = "";
        this.f149239G = "";
        this.f149233A = true;
        mo73948q2("");
        mo73949r2("");
        this.f149248Q = "";
        this.f149250R = "";
        this.f149233A = true;
    }

    public ContentValues convertTo() {
        if (!Util.isNullOrNil(this.field_appType) && (this.field_appType.startsWith("1") || this.field_appType.startsWith(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN))) {
            this.field_appType = "," + this.field_appType;
        }
        return super.convertTo();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44561j)) {
            return false;
        }
        return ((C44561j) obj).field_appId.equals(this.field_appId);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f120844x1;
    }

    public int hashCode() {
        return !Util.isNullOrNil(this.field_appId) ? this.field_appId.hashCode() : super.hashCode();
    }

    /* renamed from: k */
    public boolean mo69359k() {
        String[] split;
        if (!(Util.isNullOrNil(this.field_appType) || (split = this.field_appType.split(",")) == null || split.length == 0)) {
            for (String equals : split) {
                if (equals.equals("1")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s2 */
    public boolean mo69360s2() {
        return "wx7302cee7c7d6d7d6".equals(this.field_appId);
    }

    /* renamed from: t2 */
    public boolean mo69361t2() {
        return this.field_serviceAppType != 0;
    }
}
