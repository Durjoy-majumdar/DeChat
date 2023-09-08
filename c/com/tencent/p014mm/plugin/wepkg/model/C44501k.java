package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebResourceResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pb3.C21964b;
import te3.C50388me0;
import te3.C50667oe0;

/* renamed from: com.tencent.mm.plugin.wepkg.model.k */
public class C44501k extends C44489b {

    /* renamed from: d */
    public WepkgVersion f120697d;

    /* renamed from: e */
    public C44500j f120698e;

    /* renamed from: f */
    public Map<String, WepkgPreloadFile> f120699f;

    /* renamed from: g */
    public String f120700g = "UTF-8";

    public C44501k(int i, boolean z, String str) {
        super(i, z, str);
    }

    /* renamed from: a */
    public WebResourceResponse mo69284a(String str) {
        C44500j jVar;
        String str2 = str;
        WebResourceResponse webResourceResponse = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Map<String, WepkgPreloadFile> map = this.f120699f;
        int i = 1;
        char c = 0;
        if (!(map == null || map.get(str2) == null)) {
            WepkgPreloadFile wepkgPreloadFile = this.f120699f.get(str2);
            if (!Util.isNullOrNil(wepkgPreloadFile.f120641g)) {
                C86009m1 m1Var = new C86009m1(wepkgPreloadFile.f120641g);
                if (m1Var.mo119967g() && m1Var.mo119978p() && m1Var.mo119980r() == ((long) wepkgPreloadFile.f120646o)) {
                    try {
                        Log.m105925i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s, localPath:%s", str2, wepkgPreloadFile.f120641g);
                        return new WebResourceResponse(wepkgPreloadFile.f120643i, this.f120700g, C86013q1.m106422D(m1Var));
                    } catch (FileNotFoundException unused) {
                    }
                }
            }
        }
        C44500j jVar2 = this.f120698e;
        if (jVar2 == null) {
            return null;
        }
        String str3 = this.f120700g;
        if (Util.isNullOrNil((List) jVar2.f120696f) || jVar2.f120694d < 4 || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
        } else {
            Iterator<C50667oe0> it = jVar2.f120696f.iterator();
            while (it.hasNext()) {
                C50667oe0 next = it.next();
                if (!Util.nullAsNil(next.f139103d).equals(str2)) {
                    jVar = jVar2;
                } else if (jVar2.mo69283d(next.f139106g)) {
                    Object[] objArr = new Object[i];
                    objArr[c] = str2;
                    Log.m105925i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", objArr);
                    return webResourceResponse;
                } else {
                    int i2 = next.f139105f;
                    if (((long) i2) <= 5242880) {
                        try {
                            Object[] objArr2 = new Object[i];
                            objArr2[c] = str2;
                            Log.m105925i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", objArr2);
                            String str4 = next.f139106g;
                            C86009m1 m1Var2 = jVar2.f120691a;
                            jVar = jVar2;
                            try {
                                WebResourceResponse webResourceResponse2 = new WebResourceResponse(str4, str3, new C21964b(m1Var2, ((long) jVar2.f120694d) + next.f139104e, (long) next.f139105f));
                                if (!Util.isNullOrNil((List) next.f139107h)) {
                                    HashMap hashMap = new HashMap();
                                    Iterator<C50388me0> it4 = next.f139107h.iterator();
                                    while (it4.hasNext()) {
                                        C50388me0 next2 = it4.next();
                                        hashMap.put(next2.f137971d, next2.f137972e);
                                    }
                                    webResourceResponse2.setResponseHeaders(hashMap);
                                }
                                return webResourceResponse2;
                            } catch (IOException e) {
                                e = e;
                                Log.m105921e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", str2, Long.valueOf(next.f139104e), Integer.valueOf(next.f139105f), next.f139106g, e.getMessage());
                                jVar2 = jVar;
                                webResourceResponse = null;
                                i = 1;
                                c = 0;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            jVar = jVar2;
                            Log.m105921e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", str2, Long.valueOf(next.f139104e), Integer.valueOf(next.f139105f), next.f139106g, e.getMessage());
                            jVar2 = jVar;
                            webResourceResponse = null;
                            i = 1;
                            c = 0;
                        }
                    } else {
                        jVar = jVar2;
                        Log.m105925i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", Integer.valueOf(i2), 5242880L, str2, Long.valueOf(next.f139104e), next.f139106g);
                    }
                }
                jVar2 = jVar;
                webResourceResponse = null;
                i = 1;
                c = 0;
            }
        }
        return null;
    }

    public C44501k(WepkgVersion wepkgVersion, C44500j jVar, Map<String, WepkgPreloadFile> map) {
        super(0, true, wepkgVersion.f120653f);
        this.f120697d = wepkgVersion;
        this.f120698e = jVar;
        this.f120699f = map;
        if (!Util.isNullOrNil(wepkgVersion.f120666v)) {
            this.f120700g = wepkgVersion.f120666v;
        }
    }
}
