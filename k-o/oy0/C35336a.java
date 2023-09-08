package oy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import q73.C35796c0;

/* renamed from: oy0.a */
public final class C35336a implements C35796c0.C35797a {
    /* renamed from: a */
    public void mo60209a(String str, C86009m1 m1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("onPkgClear appId: ");
        sb.append(str);
        sb.append(", pkgFile: ");
        sb.append(m1Var != null ? m1Var.mo119971i() : null);
        Log.m105924i("MicroMsg.WebPrefetcherPkgManager", sb.toString());
    }
}
