package o13;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.plugin.updater.xlabupdater.XUpdateDownloadUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C59740b0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C9556a;
import m13.C88689b;
import my3.C61594j;
import p1081gi.C98120c;
import p1081gi.C98124g;
import p210o.C11323a;
import rx3.C13598b0;
import te3.rg4;
import v02.C90734a;
import v02.a$$a;
import z04.C112550d0;
import zp3.C23564m;
import zt3.C119157j;

/* renamed from: o13.e */
public final class C11329e {

    /* renamed from: a */
    public static final C11329e f33285a = new C11329e();

    /* renamed from: b */
    public static final Map<String, Set<WeakReference<C11330a>>> f33286b = new LinkedHashMap();

    /* renamed from: c */
    public static final C86009m1 f33287c = C112760b.m154236i0("patchapk");

    /* renamed from: d */
    public static boolean f33288d;

    /* renamed from: e */
    public static String f33289e = "";

    /* renamed from: f */
    public static final C11331b f33290f = new C11331b();

    /* renamed from: g */
    public static final C11332d f33291g = new C11332d();

    /* renamed from: h */
    public static final C11335c f33292h = new C11335c();

    /* renamed from: o13.e$a */
    public interface C11330a {
        /* renamed from: a */
        void mo6699a(String str, double d);

        /* renamed from: b */
        void mo6700b(String str, String str2);

        /* renamed from: c */
        void mo6701c(String str, String str2);

        /* renamed from: d */
        void mo6702d(String str, rg4 rg4);
    }

    /* renamed from: o13.e$b */
    public static final class C11331b implements C11330a {
        /* renamed from: a */
        public void mo6699a(String str, double d) {
            C87412m.m108594g(str, "mediaId");
            Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadProgress");
        }

        /* renamed from: b */
        public void mo6700b(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "path");
            Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadSuccess");
            C11329e eVar = C11329e.f33285a;
            eVar.getClass();
            rg4 rg4 = null;
            String string = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DIALOGINFO").getString(str, (String) null);
            if (string != null) {
                rg4 = new rg4();
                rg4.toPb(string);
            }
            if (rg4 != null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                eVar.mo11362k(context, rg4);
            }
        }

        /* renamed from: c */
        public void mo6701c(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "msg");
            Log.m105920e("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadFail() called with: mediaId = " + str + ", msg = " + str2);
        }

        /* renamed from: d */
        public void mo6702d(String str, rg4 rg4) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(rg4, "info");
            Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onMergeSuccess");
            ((C88689b) C86312j.m106911c(C88689b.class)).mo122770ya(MMApplicationContext.getContext(), C11342g.f33303d.mo11368q().f259799g);
        }
    }

    /* renamed from: o13.e$d */
    public static final class C11332d implements C11330a {
        /* renamed from: a */
        public void mo6699a(String str, double d) {
            C87412m.m108594g(str, "mediaId");
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(str, (int) d);
        }

        /* renamed from: b */
        public void mo6700b(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "path");
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(str, 0);
        }

        /* renamed from: c */
        public void mo6701c(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "msg");
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(str, 0);
        }

        /* renamed from: d */
        public void mo6702d(String str, rg4 rg4) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(rg4, "info");
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(str, 0);
        }
    }

    /* renamed from: o13.e$e */
    public static final class C11333e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f33293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11333e(Context context) {
            super(0);
            this.f33293d = context;
        }

        public Object invoke() {
            Context context = this.f33293d;
            Toast.makeText(context, context.getString(C0966R.string.k7j), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o13.e$f */
    public static final class C11334f<I, O> implements C11323a {

        /* renamed from: a */
        public final /* synthetic */ rg4 f33294a;

        public C11334f(rg4 rg4) {
            this.f33294a = rg4;
        }

        public Object apply(Object obj) {
            Integer num = (Integer) obj;
            C11329e.f33288d = false;
            if (num != null && num.intValue() == 0) {
                C11329e eVar = C11329e.f33285a;
                String str = this.f33294a.f259805p;
                C87412m.m108593f(str, "info.cdnUrl");
                C11329e.m11145a(eVar, eVar.mo11358g(str), new C11341f(this.f33294a));
                String str2 = this.f33294a.f259805p;
                C87412m.m108593f(str2, "info.cdnUrl");
                eVar.mo11360i(str2, 4);
                return null;
            }
            C11329e eVar2 = C11329e.f33285a;
            String str3 = this.f33294a.f259805p;
            C87412m.m108593f(str3, "info.cdnUrl");
            String str4 = this.f33294a.f259805p;
            C87412m.m108593f(str4, "info.cdnUrl");
            eVar2.getClass();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_MERGE_TRYTIME").putInt(str3, MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(str4, 0) + 1);
            String str5 = this.f33294a.f259805p;
            C87412m.m108593f(str5, "info.cdnUrl");
            if (MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(str5, 0) >= 2) {
                C11342g gVar = C11342g.f33303d;
                String str6 = this.f33294a.f259799g;
                C87412m.m108593f(str6, "info.newApkMd5");
                gVar.mo11364B(str6);
                String str7 = this.f33294a.f259805p;
                C87412m.m108593f(str7, "info.cdnUrl");
                eVar2.mo11360i(str7, 2);
                return null;
            }
            String str8 = this.f33294a.f259805p;
            C87412m.m108593f(str8, "info.cdnUrl");
            eVar2.mo11360i(str8, 0);
            return null;
        }
    }

    /* renamed from: o13.e$c */
    public static final class C11335c implements C55384i {

        /* renamed from: o13.e$c$a */
        public static final class C11336a extends C87413o implements C32226l<C11330a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92798v f33295d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11336a(C92798v vVar) {
                super(1);
                this.f33295d = vVar;
            }

            public Object invoke(Object obj) {
                C11330a aVar = (C11330a) obj;
                C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                String str = this.f33295d.f267131b;
                aVar.mo6701c(str, "net error, action:" + this.f33295d.f267130a + ", ret:" + this.f33295d.f267132c);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: o13.e$c$b */
        public static final class C11337b extends C87413o implements C32226l<C11330a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92798v f33296d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11337b(C92798v vVar) {
                super(1);
                this.f33296d = vVar;
            }

            public Object invoke(Object obj) {
                C11330a aVar = (C11330a) obj;
                C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                String str = this.f33296d.f267131b;
                aVar.mo6701c(str, "net error, action:" + this.f33296d.f267130a + ", ret:" + this.f33296d.f267132c);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: o13.e$c$c */
        public static final class C11338c extends C87413o implements C32226l<C11330a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92798v f33297d;

            /* renamed from: e */
            public final /* synthetic */ C59740b0 f33298e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11338c(C92798v vVar, C59740b0 b0Var) {
                super(1);
                this.f33297d = vVar;
                this.f33298e = b0Var;
            }

            public Object invoke(Object obj) {
                C11330a aVar = (C11330a) obj;
                C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                aVar.mo6699a(this.f33297d.f267131b, this.f33298e.f170633d);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: o13.e$c$d */
        public static final class C11339d extends C87413o implements C32226l<C11330a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92798v f33299d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11339d(C92798v vVar) {
                super(1);
                this.f33299d = vVar;
            }

            public Object invoke(Object obj) {
                C11330a aVar = (C11330a) obj;
                C87412m.m108594g(aVar, "callback");
                aVar.mo6701c(this.f33299d.f267131b, "path empty");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: o13.e$c$e */
        public static final class C11340e extends C87413o implements C32226l<C11330a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C92798v f33300d;

            /* renamed from: e */
            public final /* synthetic */ String f33301e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11340e(C92798v vVar, String str) {
                super(1);
                this.f33300d = vVar;
                this.f33301e = str;
            }

            public Object invoke(Object obj) {
                C11330a aVar = (C11330a) obj;
                C87412m.m108594g(aVar, "callback");
                aVar.mo6700b(this.f33300d.f267131b, this.f33301e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public void mo11363a(C92798v vVar) {
            C87412m.m108594g(vVar, "event");
            Log.m105925i("MicroMsg.XUpdate.XUpdateHelper", "CdnPLCJavaHelperListener %s %s", vVar.f267130a, Integer.valueOf(vVar.f267132c));
            int ordinal = vVar.f267130a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C98124g gVar = vVar.f267133d;
                    String str = gVar != null ? gVar.field_fullpath : null;
                    if (str == null) {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        C11329e.m11145a(C11329e.f33285a, vVar.f267131b, new C11339d(vVar));
                    }
                    if (vVar.f267135f != null) {
                        C11329e.m11145a(C11329e.f33285a, vVar.f267131b, new C11340e(vVar, str));
                        return;
                    }
                    return;
                } else if (ordinal == 3) {
                    C98120c cVar = vVar.f267134e;
                    if (cVar != null) {
                        C59740b0 b0Var = new C59740b0();
                        long j = cVar.field_finishedLength;
                        b0Var.f170633d = (((double) j) / ((double) cVar.field_toltalLength)) * ((double) 100);
                        Log.m105925i("MicroMsg.XUpdate.XUpdateHelper", "progress %s/%s percent:%s", Long.valueOf(j), Long.valueOf(cVar.field_toltalLength), Double.valueOf(b0Var.f170633d));
                        if (b0Var.f170633d < 0.0d) {
                            b0Var.f170633d = 0.0d;
                        }
                        if (b0Var.f170633d > 100.0d) {
                            b0Var.f170633d = 100.0d;
                        }
                        C11329e.m11145a(C11329e.f33285a, vVar.f267131b, new C11338c(vVar, b0Var));
                        return;
                    }
                    return;
                } else if (ordinal != 11) {
                    if (ordinal == 7 || ordinal == 8) {
                        C11329e.m11145a(C11329e.f33285a, vVar.f267131b, new C11337b(vVar));
                        return;
                    }
                    return;
                }
            }
            C11329e.m11145a(C11329e.f33285a, vVar.f267131b, new C11336a(vVar));
        }
    }

    static {
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
    }

    /* renamed from: a */
    public static final void m11145a(C11329e eVar, String str, C32226l lVar) {
        Map<String, Set<WeakReference<C11330a>>> map = f33286b;
        eVar.mo11353b(str, map);
        StringBuilder sb = new StringBuilder();
        sb.append("notifyCallback ");
        sb.append(str);
        sb.append(' ');
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Set set = (Set) linkedHashMap.get(str);
        sb.append(set != null ? Integer.valueOf(set.size()) : null);
        Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", sb.toString());
        lVar.invoke(f33291g);
        Set set2 = (Set) linkedHashMap.get(str);
        boolean z = false;
        if (set2 != null && (!set2.isEmpty())) {
            z = true;
        }
        if (!z) {
            lVar.invoke(f33290f);
            return;
        }
        Set<WeakReference> set3 = (Set) linkedHashMap.get(str);
        if (set3 != null) {
            for (WeakReference weakReference : set3) {
                C11330a aVar = (C11330a) weakReference.get();
                if (aVar != null) {
                    lVar.invoke(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo11353b(String str, Map<String, Set<WeakReference<C11330a>>> map) {
        Iterator it;
        Set set = map.get(str);
        if (set != null && (it = set.iterator()) != null) {
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Integer num = null;
                if ((weakReference != null ? (C11330a) weakReference.get() : null) == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("clearEmptyCallbacks clear ");
                    if (weakReference != null) {
                        num = Integer.valueOf(weakReference.hashCode());
                    }
                    sb.append(num);
                    Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", sb.toString());
                    it.remove();
                }
            }
        }
    }

    /* renamed from: c */
    public final String mo11354c() {
        if (f33289e.length() > 0) {
            return f33289e;
        }
        String q = C86013q1.m106456q(mo11355d());
        C87412m.m108593f(q, LocaleUtil.ITALIAN);
        f33289e = q;
        return q;
    }

    /* renamed from: d */
    public final String mo11355d() {
        String str = "";
        String string = MultiProcessMMKV.getMMKV("xupdate_repairer").getString("x_repairer_mockapkpath", str);
        if (string != null) {
            str = string;
        }
        if (str.length() > 0) {
            return str;
        }
        String str2 = MMApplicationContext.getContext().getApplicationInfo().sourceDir;
        C87412m.m108593f(str2, "appInfo.sourceDir");
        return str2;
    }

    /* renamed from: e */
    public final int mo11356e(String str) {
        C87412m.m108594g(str, "cdnUrl");
        int i = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_STATUS").getInt(mo11358g(str), 0);
        Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "getCurStatus: " + i);
        return i;
    }

    /* renamed from: f */
    public final String mo11357f(String str) {
        C87412m.m108594g(str, "cdnUrl");
        String string = MultiProcessMMKV.getMMKV("MMKV_NAME_FILE_NAME").getString(str, (String) null);
        if (string == null) {
            f33285a.getClass();
            string = System.currentTimeMillis() + "_patch.apk";
            MultiProcessMMKV.getMMKV("MMKV_NAME_FILE_NAME").putString(str, string);
        }
        C87412m.m108593f(string, "MultiProcessMMKV.getMMKV…      }\n                }");
        C86009m1 m1Var = new C86009m1(f33287c.mo119969h(), string);
        if (!m1Var.mo119967g()) {
            m1Var.mo119964e();
        }
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "VFSFile(tmpDir.absoluteF…it.absolutePath\n        }");
        return i;
    }

    /* renamed from: g */
    public final String mo11358g(String str) {
        C87412m.m108594g(str, "cdnUrl");
        String string = MultiProcessMMKV.getMMKV("MMKV_NAME_MEDIA_ID").getString(str, (String) null);
        if (string == null) {
            f33285a.getClass();
            string = System.currentTimeMillis() + "_patch.apk";
            MultiProcessMMKV.getMMKV("MMKV_NAME_MEDIA_ID").putString(str, string);
        }
        C87412m.m108593f(string, "MultiProcessMMKV.getMMKV…      }\n                }");
        return string;
    }

    /* renamed from: h */
    public final boolean mo11359h() {
        C11342g gVar = C11342g.f33303d;
        if (gVar.mo11365D(gVar.mo11368q().f259799g)) {
            return false;
        }
        try {
            String str = gVar.mo11368q().f259800h;
            C87412m.m108593f(str, "XUpdateManager.getDialogInfo().oldApkMd5");
            String Z = C112550d0.m153790Z(str, new C61594j(0, 5));
            String Z2 = C112550d0.m153790Z(mo11354c(), new C61594j(0, 5));
            Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "hasUpdateVersion oldApkMd5=" + gVar.mo11368q().f259799g + " baseMd5=" + f33285a.mo11354c());
            return C87412m.m108589b(Z, Z2);
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.printErrStackTrace("MicroMsg.XUpdate.XUpdateHelper", e, "hasUpdateVersion error:", new Object[0]);
            return false;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.XUpdate.XUpdateHelper", e2, "hasUpdateVersion error:", new Object[0]);
            return false;
        }
    }

    /* renamed from: i */
    public final void mo11360i(String str, int i) {
        C87412m.m108594g(str, "cdnUrl");
        Log.m105924i("MicroMsg.XUpdate.XUpdateHelper", "saveCurStatus: status");
        MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_STATUS").putInt(mo11358g(str), i);
    }

    /* renamed from: j */
    public final void mo11361j(Context context) {
        C87412m.m108594g(context, "context");
        C11342g gVar = C11342g.f33303d;
        boolean ya = ((C88689b) C86312j.m106911c(C88689b.class)).mo122770ya(context, gVar.mo11368q().f259799g);
        Log.m105925i("MicroMsg.XUpdate.XUpdateHelper", "startXUpdate, checkAndShowInstallPatchDialogm success = %s, response.newApkMd5 = %s, ", Boolean.valueOf(ya), gVar.mo11368q().f259799g);
        if (!ya) {
            if (gVar.mo11365D(gVar.mo11368q().f259799g)) {
                Log.m105920e("MicroMsg.XUpdate.XUpdateHelper", "startXUpdate but ignore");
                return;
            }
            rg4 q = gVar.mo11368q();
            Intent intent = new Intent(context, XUpdateDownloadUI.class);
            intent.putExtra("x_dialoginfo", q.toJSON().toString());
            intent.setFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/updater/xlabupdater/XUpdateHelper", "startDownload", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TinkerInstallDialog;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/updater/xlabupdater/XUpdateHelper", "startDownload", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TinkerInstallDialog;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: k */
    public final void mo11362k(Context context, rg4 rg4) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(rg4, "info");
        String str = rg4.f259805p;
        C87412m.m108593f(str, "info.cdnUrl");
        if (MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(str, 0) >= 2) {
            Log.m105920e("MicroMsg.XUpdate.XUpdateHelper", "tryMergeApk ignore, fail too many time");
            C11342g gVar = C11342g.f33303d;
            String str2 = rg4.f259799g;
            C87412m.m108593f(str2, "info.newApkMd5");
            gVar.mo11364B(str2);
            return;
        }
        C23564m.m28136f(new C11333e(context));
        String str3 = rg4.f259805p;
        C87412m.m108593f(str3, "info.cdnUrl");
        if (mo11356e(str3) == 3 && !f33288d) {
            String str4 = rg4.f259805p;
            C87412m.m108593f(str4, "info.cdnUrl");
            mo11360i(str4, 2);
        }
        if (!f33288d) {
            String str5 = rg4.f259805p;
            C87412m.m108593f(str5, "info.cdnUrl");
            mo11360i(str5, 3);
            f33288d = true;
            String str6 = rg4.f259805p;
            C87412m.m108593f(str6, "info.cdnUrl");
            String f = mo11357f(str6);
            C11334f fVar = new C11334f(rg4);
            AtomicBoolean atomicBoolean = C90734a.f260611b;
            ((C119157j) C119157j.f356862d).mo183875f(new a$$a(context, f, rg4, fVar));
        }
    }
}
