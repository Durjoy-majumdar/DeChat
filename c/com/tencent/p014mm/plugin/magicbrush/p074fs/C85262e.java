package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
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
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import js0.C9514m;
import q52.C35765d;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.e */
public final class C85262e extends C85260b implements C31064a0 {

    /* renamed from: p */
    public LinkedList<String> f248415p = new LinkedList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85262e(String str, String str2, C81415h0 h0Var, List<String> list) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(list, "bizNameList");
        if (Util.isNullOrNil(this.f248406f)) {
            Log.m105920e("MicroMsg.MagicBrushPublicServiceFileSystem", "file system invalid instanceName:" + str + ",not register");
            return;
        }
        CopyOnWriteArrayList<C81415h0> d = mo118425d();
        C86009m1 m1Var = this.f248407g;
        C87412m.m108591d(m1Var);
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "mBizDir!!.absolutePath");
        String str3 = this.f248406f;
        C87412m.m108591d(str3);
        LinkedList linkedList = new LinkedList();
        C86009m1 m1Var2 = new C86009m1(i, XVFSFile.SEPARATOR_CHAR + str3);
        if (!m1Var2.mo119967g()) {
            m1Var2.mo119987x();
        }
        String i2 = m1Var2.mo119971i();
        C87412m.m108593f(i2, "bizDir.absolutePath");
        C86009m1 m1Var3 = new C86009m1(i2, "files/");
        if (!m1Var3.mo119967g()) {
            m1Var3.mo119987x();
        }
        linkedList.add(new C81439t0(m1Var3.mo119971i(), "wxfile://usr"));
        String i3 = m1Var2.mo119971i();
        C87412m.m108593f(i3, "bizDir.absolutePath");
        C86009m1 m1Var4 = new C86009m1(i3, "objects/");
        if (!m1Var4.mo119967g()) {
            m1Var4.mo119987x();
        }
        linkedList.add(new C81413f0(m1Var4.mo119971i(), "default_obfuscation_key", "wxfile://"));
        d.addAll(linkedList);
        if (str2 != null && mo118423b(C81462w0.class) == null) {
            CopyOnWriteArrayList<C81415h0> d2 = mo118425d();
            WxaPkg wxaPkg = new WxaPkg(str2);
            wxaPkg.mo63189b();
            d2.add(new C81462w0(wxaPkg));
        } else if (h0Var != null && mo118423b(h0Var.getClass()) == null) {
            mo118425d().add(h0Var);
        }
        C81413f0 f0Var = (C81413f0) mo118423b(C81413f0.class);
        if (f0Var != null) {
            f0Var.mo113733c();
        }
        super.initialize();
        Log.m105924i("MicroMsg.MagicBrushPublicServiceFileSystem", "file system established instanceName:" + str + ",pkgPath:" + str2 + ",assetsFS:" + h0Var);
        for (String str4 : list) {
            Log.m105924i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str4 + " fs");
            List<String> list2 = C35765d.f95531a;
            if (C35765d.f95531a.contains(str4)) {
                LinkedList<String> linkedList2 = this.f248415p;
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                linkedList2.add(lowerCase);
            } else {
                Log.m105924i("MicroMsg.MagicBrushPublicServiceFileSystem", "PS fs need biz:" + str4 + " not exist");
            }
        }
    }

    /* renamed from: Ud */
    public void mo57958Ud(String str) {
        C87412m.m108594g(str, "instanceName");
        C81413f0 f0Var = (C81413f0) mo118423b(C81413f0.class);
        if (f0Var != null) {
            f0Var.mo113732b();
        }
        super.release();
    }

    /* renamed from: a */
    public C81415h0 mo118422a(String str) {
        C87412m.m108594g(str, "path");
        if (Util.isNullOrNil(str)) {
            C81415h0 h0Var = this.f248414e;
            C87412m.m108593f(h0Var, "mDummyFS");
            return h0Var;
        }
        String h = mo118427h(str);
        if (!Util.isNullOrNil(h)) {
            return C30190c.f81604a.mo57216a(h, (String) null, (C81415h0) null);
        }
        C81415h0 a = super.mo118422a(str);
        C87412m.m108593f(a, "super.findAppropriateFileSystem(path)");
        return a;
    }

    public boolean canRenameFile(String str) {
        C87412m.m108594g(str, "path");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String h = mo118427h(str);
        return !Util.isNullOrNil(h) ? C30190c.f81604a.mo57216a(h, (String) null, (C81415h0) null).canRenameFile(mo118426f(str)) : super.canRenameFile(str);
    }

    public boolean canSaveToLocal(String str) {
        C87412m.m108594g(str, "path");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String h = mo118427h(str);
        return !Util.isNullOrNil(h) ? C30190c.f81604a.mo57216a(h, (String) null, (C81415h0) null).canSaveToLocal(mo118426f(str)) : super.canRenameFile(str);
    }

    /* renamed from: f */
    public String mo118426f(String str) {
        C87412m.m108594g(str, "path");
        String c = mo118424c(str);
        if (Util.isNullOrNil(mo118427h(c))) {
            return c;
        }
        C87412m.m108593f(c, "decodePath");
        int E = C112550d0.m153769E(c, "://", 0, false, 6, (Object) null);
        if (E == -1) {
            return null;
        }
        String substring = c.substring(E + 3);
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        return C112551y.m153814n(substring, "\u0000", "", false);
    }

    /* renamed from: h */
    public final String mo118427h(String str) {
        URI uri;
        String c = mo118424c(str);
        String str2 = "";
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(c)) {
            String str3 = null;
            try {
                uri = new URI(c);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not supported uri format!!! ");
                if (c.length() > 50) {
                    c = c.substring(0, 50);
                    C87412m.m108593f(c, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb.append(c);
                Log.printErrStackTrace("MicroMsg.MagicBrushPublicServiceFileSystem", th, sb.toString(), new Object[0]);
                uri = null;
            }
            if (uri != null) {
                str3 = uri.getScheme();
            }
            String nullAsNil = Util.nullAsNil(str3);
            if (!Util.isNullOrNil(nullAsNil)) {
                C87412m.m108593f(nullAsNil, "localInstanceName");
                String g0 = C112550d0.m153797g0(nullAsNil, "-", nullAsNil);
                for (String equals : this.f248415p) {
                    if (Util.nullAsNil(g0).equals(equals)) {
                        str2 = nullAsNil;
                    }
                }
            }
        }
        return str2;
    }

    public void initialize() {
        for (String a : this.f248415p) {
            C30190c.f81604a.mo57216a(a, (String) null, (C81415h0) null).initialize();
        }
        super.initialize();
    }

    /* renamed from: ks */
    public void mo57959ks(String str, String str2, C81415h0 h0Var) {
        C87412m.m108594g(str, "instanceName");
    }

    public void release() {
        for (String a : this.f248415p) {
            C30190c.f81604a.mo57216a(a, (String) null, (C81415h0) null).release();
        }
        super.release();
    }

    public C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar) {
        C87412m.m108594g(m1Var, "srcFile");
        C87412m.m108594g(str, "specifiedPath");
        if (Util.isNullOrNil(str)) {
            return C81410b0.ERR_NOT_SUPPORTED;
        }
        String h = mo118427h(str);
        if (Util.isNullOrNil(h)) {
            return super.saveFile(m1Var, str, mVar);
        }
        C81410b0 saveFile = C30190c.f81604a.mo57216a(h, (String) null, (C81415h0) null).saveFile(m1Var, mo118426f(str), mVar);
        C87412m.m108593f(saveFile, "MagicBrushFileSystemFact…ifiedPath),generatedPath)");
        return saveFile;
    }
}
