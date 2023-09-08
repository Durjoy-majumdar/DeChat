package ko2;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ex0.C45700h;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rq2.C101425k;
import vr2.C102236a0;

/* renamed from: ko2.a */
public class C46734a {
    /* renamed from: a */
    public static String m52028a(String str) {
        SnsMethodCalculate.markStartTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse == null || !"1".equals(parse.getQueryParameter("canPrefetch"))) {
            SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        String uri = parse.buildUpon().appendQueryParameter("prefetch", "1").build().toString();
        SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return uri;
    }

    /* renamed from: b */
    public static String m52029b(String str) {
        SnsMethodCalculate.markStartTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        try {
            String a = m52028a(str);
            SnsMethodCalculate.markEndTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return a;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
    }

    /* renamed from: c */
    public static void m52030c(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C45700h.C45702b bVar = new C45700h.C45702b();
            bVar.f123504a = str;
            bVar.f123506c = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD;
            arrayList.add(bVar);
        }
        C115669n.INSTANCE.mo175913w(1612, 44, (long) arrayList.size());
        C45700h hVar = (C45700h) C86709a0.m107533q(C45700h.class);
        if (hVar != null) {
            hVar.mo71031UP(arrayList);
            Log.m105918d("SnsAd.H5PrefetchHelper", "the h5 prefetch is done");
        }
        SnsMethodCalculate.markEndTimeMs("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
    }

    /* renamed from: d */
    public static String[] m52031d(Collection<String> collection, String str, String str2, String str3, String str4) {
        String str5;
        SnsMethodCalculate.markStartTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (C101425k.m133097a(collection)) {
            SnsMethodCalculate.markEndTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                next = C95198o2.m121129a(next, "traceid=" + str + "&aid=" + str2);
            }
            if (TextUtils.isEmpty(str3)) {
                Log.m105924i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use orig_UxInfo:" + str4);
                str5 = str4;
            } else {
                Log.m105924i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use updated_UxInfo:" + str3);
                str5 = str3;
            }
            String b = m52029b(C102236a0.m134734b(next, str5));
            if (!TextUtils.isEmpty(b)) {
                linkedList.add(b);
            }
        }
        String[] strArr = (String[]) linkedList.toArray(new String[0]);
        SnsMethodCalculate.markEndTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return strArr;
    }

    /* renamed from: e */
    public static String m52032e(String str) {
        SnsMethodCalculate.markStartTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        String b = m52029b(str);
        if (!TextUtils.isEmpty(b)) {
            SnsMethodCalculate.markEndTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return b;
        }
        Log.m105918d("SnsAd.H5PrefetchHelper", "the usePrefetch return value is " + str);
        SnsMethodCalculate.markEndTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return str;
    }
}
