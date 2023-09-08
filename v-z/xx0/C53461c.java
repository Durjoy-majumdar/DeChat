package xx0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.util.FrequentLimiter;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.zg4;
import z04.C112551y;
import z04.C66723k;

/* renamed from: xx0.c */
public final class C53461c implements Runnable {

    /* renamed from: d */
    public static final C53461c f150374d = new C53461c();

    public final void run() {
        Integer[] numArr;
        String j = C53458b.m59915j();
        int i = 1;
        Log.m105925i("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl saveDir:%s", j);
        C86009m1 l = C40716j0.m43984l(j);
        if (!l.mo119967g()) {
            Log.m105929w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not exist, err", j);
        } else if (!l.mo119977o()) {
            Log.m105929w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not dir, err", j);
        } else {
            C86009m1[] u = l.mo119984u();
            if (u != null) {
                if (!(u.length == 0)) {
                    if (BuildInfo.DEBUG) {
                        Log.m105927v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl oldCount %d", Integer.valueOf(u.length));
                        Iterator a = C32617c.m39769a(u);
                        while (true) {
                            C32616b bVar = (C32616b) a;
                            if (!bVar.hasNext()) {
                                break;
                            }
                            Log.m105927v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl file:%s", ((C86009m1) bVar.next()).getName());
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    C53458b bVar2 = C53458b.f150358a;
                    Integer[] numArr2 = (Integer[]) ((C36570n) C53458b.f150361d).getValue();
                    int length = numArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int intValue = numArr2[i2].intValue();
                        zg4 k = C53458b.m59916k(C53458b.f150358a, intValue, (String) null, 2, (Object) null);
                        Set<String> stringSet = C40716j0.m43979g().getStringSet(C40716j0.m43978f(C53458b.m59913g(intValue)), new HashSet());
                        C87412m.m108591d(stringSet);
                        List<T> y0 = C110818d0.m150953y0(stringSet);
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(y0, 10));
                        for (T t : y0) {
                            C53458b bVar3 = C53458b.f150358a;
                            zg4 zg4 = new zg4();
                            C87412m.m108593f(t, LocaleUtil.ITALIAN);
                            bVar3.mo74094m(zg4, intValue, t);
                            if (BuildInfo.DEBUG) {
                                Log.m105926v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl tmplType=" + intValue + ", Version=" + zg4.f145938e);
                            }
                            arrayList2.add(zg4);
                        }
                        for (zg4 zg42 : C110818d0.m150947s0(C110818d0.m150943o0(arrayList2, new C53462d()), ((Number) ((C36570n) C53458b.f150365h).getValue()).intValue())) {
                            if (C40716j0.m43982j(zg42)) {
                                arrayList.add(C40716j0.m43973a(zg42));
                            }
                            if (k.f145938e != zg42.f145938e) {
                                String a2 = C40716j0.m43973a(zg42);
                                C86009m1 l2 = C40716j0.m43984l(a2);
                                if (!l2.mo119977o()) {
                                    Object[] objArr = new Object[i];
                                    objArr[0] = a2;
                                    Log.m105929w("MicroMsg.Preload.TmplInfoManager", "deleteInvalidCacheFile fileDir:%s is not dir, err", objArr);
                                } else {
                                    C86009m1[] u2 = l2.mo119984u();
                                    if (u2 != null) {
                                        int length2 = u2.length;
                                        int i3 = 0;
                                        while (i3 < length2) {
                                            C86009m1 m1Var = u2[i3];
                                            String i4 = m1Var.mo119971i();
                                            C87412m.m108593f(i4, "file.absolutePath");
                                            if (!((C66723k) ((C36570n) C53458b.f150366i).getValue()).mo90759d(i4)) {
                                                String i5 = m1Var.mo119971i();
                                                C87412m.m108593f(i5, "file.absolutePath");
                                                numArr = numArr2;
                                                if (!C112551y.m153808h(i5, ".js.utf16", false, 2, (Object) null)) {
                                                    i3++;
                                                    numArr2 = numArr;
                                                }
                                            } else {
                                                numArr = numArr2;
                                            }
                                            m1Var.mo119966f();
                                            Log.m105918d("MicroMsg.Preload.TmplInfoManager", "deleteInvalidCacheFile file " + m1Var.mo119976n());
                                            i3++;
                                            numArr2 = numArr;
                                        }
                                    }
                                }
                            }
                            numArr2 = numArr2;
                            i = 1;
                        }
                        Integer[] numArr3 = numArr2;
                        i2++;
                        i = 1;
                    }
                    if (BuildInfo.DEBUG) {
                        Log.m105927v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl curFilePaths size=" + arrayList.size() + " %s", arrayList);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator a3 = C32617c.m39769a(u);
                    while (true) {
                        C32616b bVar4 = (C32616b) a3;
                        if (!bVar4.hasNext()) {
                            break;
                        }
                        C86009m1 m1Var2 = (C86009m1) bVar4.next();
                        long q = m1Var2.mo119979q();
                        if (MMSlotKt.isExpire(q, (long) FrequentLimiter.WEEK_MILLS) && !C53458b.m59910b(arrayList, m1Var2)) {
                            arrayList3.add(m1Var2.mo119971i());
                        }
                        if (BuildInfo.DEBUG && MMSlotKt.isExpire(q, 60000) && !C53458b.m59910b(arrayList, m1Var2)) {
                            arrayList3.add(m1Var2.mo119971i());
                        }
                    }
                    if (1 >= Log.getLogLevel()) {
                        Log.m105926v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl curFilePaths size=" + arrayList.size());
                        Log.m105927v("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl deleteFilePaths %s", arrayList3);
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C87412m.m108593f(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        if (C40716j0.m43984l(str).mo119977o()) {
                            C86013q1.m106446g(str, true);
                        } else {
                            C86013q1.m106447h(str);
                        }
                    }
                    return;
                }
            }
            Log.m105928w("MicroMsg.Preload.TmplInfoManager", "files is null");
        }
    }
}
