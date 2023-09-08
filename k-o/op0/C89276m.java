package op0;

import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import java.util.Comparator;
import ux3.C65486b;

/* renamed from: op0.m */
public final class C89276m<T> implements Comparator {
    public final int compare(T t, T t2) {
        int i;
        int i2;
        if (t2 instanceof WxaAttributes.WxaVersionModuleInfo) {
            i = ((WxaAttributes.WxaVersionModuleInfo) t2).f239472d.length();
        } else if (t2 instanceof ModulePkgInfo) {
            i = ((ModulePkgInfo) t2).name.length();
        } else {
            throw new IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
        }
        Integer valueOf = Integer.valueOf(i);
        if (t instanceof WxaAttributes.WxaVersionModuleInfo) {
            i2 = ((WxaAttributes.WxaVersionModuleInfo) t).f239472d.length();
        } else if (t instanceof ModulePkgInfo) {
            i2 = ((ModulePkgInfo) t).name.length();
        } else {
            throw new IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
        }
        return C65486b.m77169a(valueOf, Integer.valueOf(i2));
    }
}
