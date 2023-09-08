package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81383w2;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81437t;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81463z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import js0.C9514m;
import p206nj.C88955f;
import p206nj.C88957l;
import p225rc.C89914c;
import p823sg.C77710q;
import p823sg.C90193h;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.d1 */
public class C82419d1 extends C81428p0 {

    /* renamed from: f */
    public static final /* synthetic */ int f241503f = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.d1$a */
    public class C82420a implements C81437t.C81438a {

        /* renamed from: a */
        public final /* synthetic */ C86812g f241504a;

        public C82420a(C82419d1 d1Var, C86812g gVar) {
            this.f241504a = gVar;
        }
    }

    static {
        C88957l.m111079o("appbrandcommon", C82419d1.class.getClassLoader());
    }

    public C82419d1(C86812g gVar, C82417d dVar) {
        super((LinkedList<C81415h0>) new LinkedList());
        C81383w2 w2Var = new C81383w2(C81247g3.m99555k(gVar, false));
        this.f238970d.clear();
        C81437t tVar = new C81437t(AppBrandLocalMediaObjectManager.f238909a + gVar.f238147j + "/blobTmp/", gVar.f238147j, "wxblob://", new C82420a(this, gVar));
        long j = dVar.f241497d;
        this.f238970d.add(tVar);
        String str = gVar.f238147j;
        C81413f0 f0Var = new C81413f0(AppBrandLocalMediaObjectManager.f238909a + str + "/", str, "wxfile://");
        f0Var.f238951i = dVar.f241497d * 1048576;
        C81439t0 f = m101179f(C77710q.m93738a(gVar.mo113036W().f234818T), gVar.f238147j);
        f.f238994f = dVar.f241497d * 1048576;
        C81439t0 g = m101180g(C77710q.m93738a(gVar.mo113036W().f234818T), gVar.f238147j);
        g.f238994f = dVar.f241501h * 1048576;
        this.f238970d.add(g);
        C81439t0 h = m101181h(C77710q.m93738a(gVar.mo113036W().f234818T), gVar.f238147j);
        h.f238994f = dVar.f241502i * 1048576;
        this.f238970d.add(h);
        C81439t0 c = m101177c(C77710q.m93738a(gVar.mo113036W().f234818T), gVar.f238147j);
        c.f238994f = MAlarmHandler.NEXT_FIRE_INTERVAL;
        this.f238970d.add(c);
        C81439t0 i = m101182i(C77710q.m93738a(gVar.mo113036W().f234818T), gVar.f238147j);
        i.f238994f = dVar.f241497d * 1048576;
        this.f238970d.add(i);
        C81439t0 t0Var = new C81439t0(m101178d("wxsdk"), "wxfile://sdk");
        t0Var.f238994f = DownloadHelper.SAVE_LENGTH;
        this.f238970d.add(t0Var);
        this.f238970d.add(f);
        this.f238970d.add(f0Var);
        this.f238970d.add(w2Var);
        initialize();
    }

    /* renamed from: c */
    public static C81439t0 m101177c(String str, String str2) {
        return new C81439t0(m101178d(str, str2, "clientdata"), "wxfile://clientdata");
    }

    /* renamed from: d */
    public static String m101178d(String... strArr) {
        C86009m1 m1Var;
        if (!C88955f.m111058b()) {
            m1Var = null;
        } else {
            String C = C112760b.m154195C();
            if (!C.endsWith("/")) {
                C = C + "/";
            }
            m1Var = new C86009m1(C + "wxanewfiles/");
        }
        if (m1Var == null) {
            Log.m105920e("MicroMsg.AppBrand.LuggageFileSystemRegistryWC", "getIndependentRootPath, extRoot NULL");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m1Var.mo119976n());
        sb.append("/");
        StringBuilder sb4 = new StringBuilder(";");
        for (String nullAsNil : strArr) {
            sb4.append(Util.nullAsNil(nullAsNil));
            sb4.append(';');
        }
        sb.append(C90193h.m112878f(sb4.toString().getBytes()));
        Uri n = C116299g2.m163858n(sb.toString());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        return C116299g2.m163865u(n);
    }

    /* renamed from: f */
    public static C81439t0 m101179f(String str, String str2) {
        return new C81439t0(m101178d(str, str2), "wxfile://usr");
    }

    /* renamed from: g */
    public static C81439t0 m101180g(String str, String str2) {
        return new C81439t0(m101178d(str, str2, "opendata"), "wxfile://opendata");
    }

    /* renamed from: h */
    public static C81439t0 m101181h(String str, String str2) {
        return new C81439t0(m101178d(str, str2, "wxprivate"), "wxfile://__wxprivate__");
    }

    /* renamed from: i */
    public static C81439t0 m101182i(String str, String str2) {
        return new C81439t0(m101178d(str, str2, "singlePage"), "wxfile://singlepage");
    }

    public C86009m1 allocTempFile(String str) {
        return ((C81413f0) mo113748b(C81413f0.class)).allocTempFile(str);
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        return ((C81413f0) mo113748b(C81413f0.class)).createTempFileFrom(m1Var, str, z, mVar);
    }

    public List<C81433r0> getSavedFileList() {
        return ((C81413f0) mo113748b(C81413f0.class)).getSavedFileList();
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        Uri parse = Uri.parse(str);
        if (!"wxfile".equals(parse.getScheme()) || !Util.isNullOrNil(parse.getAuthority())) {
            return super.readDir(str, mVar);
        }
        T linkedList = new LinkedList();
        ((C81413f0) mo113748b(C81413f0.class)).readDir("", mVar);
        if (!Util.isNullOrNil((List) mVar.f29691a)) {
            for (C81463z zVar : (List) mVar.f29691a) {
                zVar.f239026a = zVar.f239026a.replaceFirst(Pattern.quote("wxfile://"), "");
            }
        }
        C89914c.m112445a(linkedList, (List) mVar.f29691a);
        ((C81439t0) mo113747a("wxfile://usr")).readDir("wxfile://usr", mVar);
        C89914c.m112445a(linkedList, (List) mVar.f29691a);
        mVar.f29691a = linkedList;
        return C81410b0.OK;
    }
}
