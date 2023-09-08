package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81462w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import d42.C31064a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.a */
public final class C85259a extends C85260b implements C31064a0 {

    /* renamed from: p */
    public C81415h0 f248405p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85259a(String str, String str2, String str3, C81415h0 h0Var) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str3, "prefix");
        if (Util.isNullOrNil(this.f248406f)) {
            Log.m105920e("MicroMsg.MagicBrushFileSystem", "file system invalid instanceName:" + str + ",not register");
            return;
        }
        CopyOnWriteArrayList<C81415h0> d = mo118425d();
        C86009m1 m1Var = this.f248407g;
        C87412m.m108591d(m1Var);
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "mBizDir!!.absolutePath");
        String str4 = this.f248406f;
        C87412m.m108591d(str4);
        LinkedList linkedList = new LinkedList();
        C86009m1 m1Var2 = new C86009m1(i, XVFSFile.SEPARATOR_CHAR + str4);
        if (!m1Var2.mo119967g()) {
            m1Var2.mo119987x();
        }
        String i2 = m1Var2.mo119971i();
        C87412m.m108593f(i2, "bizDir.absolutePath");
        C86009m1 m1Var3 = new C86009m1(i2, "files/");
        if (!m1Var3.mo119967g()) {
            m1Var3.mo119987x();
        }
        String i3 = m1Var3.mo119971i();
        linkedList.add(new C81439t0(i3, str3 + "usr"));
        String i4 = m1Var2.mo119971i();
        C87412m.m108593f(i4, "bizDir.absolutePath");
        C86009m1 m1Var4 = new C86009m1(i4, "objects/");
        if (!m1Var4.mo119967g()) {
            m1Var4.mo119987x();
        }
        linkedList.add(new C81413f0(m1Var4.mo119971i(), "default_obfuscation_key", str3));
        d.addAll(linkedList);
        mo57959ks(str, str2, h0Var);
        initialize();
        Log.m105924i("MicroMsg.MagicBrushFileSystem", "file system established instanceName:" + str + ",pkgPath:" + str2 + ",assetsFS:" + h0Var);
    }

    /* renamed from: Ud */
    public void mo57958Ud(String str) {
        C87412m.m108594g(str, "instanceName");
        Log.m105924i("MicroMsg.MagicBrushFileSystem", "removePkgFS instanceName:" + str);
        C81462w0 w0Var = (C81462w0) mo118423b(C81462w0.class);
        if (w0Var != null) {
            mo118425d().remove(w0Var);
        }
        if (this.f248405p != null) {
            mo118425d().remove(this.f248405p);
            this.f248405p = null;
        }
        C81413f0 f0Var = (C81413f0) mo118423b(C81413f0.class);
        if (f0Var != null) {
            f0Var.mo113732b();
        }
        release();
    }

    /* renamed from: ks */
    public void mo57959ks(String str, String str2, C81415h0 h0Var) {
        C87412m.m108594g(str, "instanceName");
        Log.m105924i("MicroMsg.MagicBrushFileSystem", "addPkgFS instanceName:" + str + ",pkgPath:" + str2 + ",assetsFS:" + h0Var);
        if (str2 != null) {
            if (mo118423b(C81462w0.class) == null) {
                CopyOnWriteArrayList<C81415h0> d = mo118425d();
                WxaPkg wxaPkg = new WxaPkg(str2);
                wxaPkg.mo63189b();
                d.add(new C81462w0(wxaPkg));
            }
        } else if (h0Var != null && mo118423b(h0Var.getClass()) == null) {
            mo118425d().add(h0Var);
            this.f248405p = h0Var;
        }
        C81413f0 f0Var = (C81413f0) mo118423b(C81413f0.class);
        if (f0Var != null) {
            f0Var.mo113733c();
        }
    }
}
