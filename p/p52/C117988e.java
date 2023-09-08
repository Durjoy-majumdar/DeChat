package p52;

import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;

/* renamed from: p52.e */
public class C117988e extends C117987a {

    /* renamed from: J */
    public static IAutoDBItem.MAutoDBInfo f352679J = C117987a.initAutoDBInfo(C117988e.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }

    /* renamed from: l2 */
    public WxaMagicPkgInfo mo182751l2() {
        WxaMagicPkgInfo wxaMagicPkgInfo = new WxaMagicPkgInfo();
        wxaMagicPkgInfo.f81564d = this.field_pkgId;
        wxaMagicPkgInfo.f81567g = this.field_pkgPath;
        wxaMagicPkgInfo.f81568h = this.field_unZipPath;
        wxaMagicPkgInfo.f81574q = this.field_updateTime;
        wxaMagicPkgInfo.f81571n = this.field_patchId;
        wxaMagicPkgInfo.f81565e = this.field_url;
        wxaMagicPkgInfo.f81566f = this.field_md5;
        wxaMagicPkgInfo.f81575r = this.field_lastUseTime;
        wxaMagicPkgInfo.f81570j = this.field_pkgType;
        wxaMagicPkgInfo.f81572o = this.field_version;
        wxaMagicPkgInfo.f81573p = this.field_wxaPkgPath;
        wxaMagicPkgInfo.f81569i = this.field_originalName;
        return wxaMagicPkgInfo;
    }
}
