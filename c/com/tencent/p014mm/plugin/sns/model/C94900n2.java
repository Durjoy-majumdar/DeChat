package com.tencent.p014mm.plugin.sns.model;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import te3.C101817mv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.n2 */
public class C94900n2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94921o2 f274993d;

    public C94900n2(C94921o2 o2Var) {
        this.f274993d = o2Var;
    }

    public void run() {
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat$1");
        synchronized (this.f274993d) {
            int i5 = 0;
            try {
                Log.m105919d("MicroMsg.TimelineSmallPicStat", "reportAll, reportData.size:%d", Integer.valueOf(C94921o2.m120481a().size()));
                int G = C102236a0.m134712G();
                Iterator it4 = C94921o2.m120481a().keySet().iterator();
                while (it4.hasNext()) {
                    C94921o2.C94923b bVar = (C94921o2.C94923b) C94921o2.m120481a().get((String) it4.next());
                    if (bVar != null && bVar.f275095i) {
                        if (bVar.f275089c != -1 && bVar.f275088b != -1 && bVar.f275087a != -1) {
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb4 = new StringBuilder();
                            StringBuilder sb5 = new StringBuilder();
                            Iterator<String> it5 = bVar.f275094h.iterator();
                            int i6 = 0;
                            int i7 = 0;
                            while (it5.hasNext()) {
                                C94921o2.C94922a aVar = bVar.f275096j.get(it5.next());
                                if (aVar != null) {
                                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(aVar.f275085c);
                                    if (imageOptions != null) {
                                        i3 = imageOptions.outWidth;
                                        i4 = imageOptions.outHeight;
                                    } else {
                                        i4 = 0;
                                        i3 = 0;
                                    }
                                    sb.append(i3);
                                    sb.append("|");
                                    sb4.append(i4);
                                    sb4.append("|");
                                    sb5.append(i5);
                                    sb5.append("|");
                                    int i8 = aVar.f275086d;
                                    C101817mv2 mv22 = aVar.f275084b;
                                    if (mv22 != null) {
                                        i6 = (int) (((float) i6) + mv22.f298877f);
                                    }
                                    i7 = i8;
                                }
                            }
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[13];
                            objArr[i5] = Integer.valueOf(bVar.f275090d);
                            objArr[1] = Long.valueOf(bVar.f275088b);
                            objArr[2] = Long.valueOf(bVar.f275089c);
                            objArr[3] = Integer.valueOf(bVar.f275091e);
                            objArr[4] = Integer.valueOf(G);
                            objArr[5] = Long.valueOf(bVar.f275092f);
                            objArr[6] = Long.valueOf(bVar.f275087a);
                            objArr[7] = sb.toString();
                            objArr[8] = sb4.toString();
                            objArr[9] = sb5.toString();
                            objArr[10] = Integer.valueOf(i7);
                            objArr[11] = Integer.valueOf(i6);
                            objArr[12] = Long.valueOf(bVar.f275093g);
                            nVar.mo160131h(11600, objArr);
                            Object[] objArr2 = new Object[13];
                            objArr2[i5] = Integer.valueOf(bVar.f275090d);
                            objArr2[1] = Long.valueOf(bVar.f275088b);
                            objArr2[2] = Long.valueOf(bVar.f275089c);
                            objArr2[3] = Integer.valueOf(bVar.f275091e);
                            objArr2[4] = Integer.valueOf(G);
                            objArr2[5] = Long.valueOf(bVar.f275092f);
                            objArr2[6] = Long.valueOf(bVar.f275087a);
                            objArr2[7] = sb.toString();
                            objArr2[8] = sb4.toString();
                            objArr2[9] = sb5.toString();
                            objArr2[10] = Integer.valueOf(i7);
                            objArr2[11] = Integer.valueOf(i6);
                            objArr2[12] = Long.valueOf(bVar.f275093g);
                            Log.m105919d("MicroMsg.TimelineSmallPicStat", "reportAll, picNum:%d, loadResult:%d, loadCostTime:%d, loadPicNum:%d, networkType:%d, publishId:%s, startTime:%s, picWidth:%s,picHeight:%s,picSize:%s,picTye:%s,download_len:%d,scene:%d", objArr2);
                        } else if (bVar.f275087a != -1) {
                            bVar.f275089c = System.currentTimeMillis() - bVar.f275087a;
                            if (bVar.f275090d == bVar.f275091e) {
                                bVar.f275088b = 1;
                            } else {
                                bVar.f275088b = 2;
                            }
                            StringBuilder sb6 = new StringBuilder();
                            StringBuilder sb7 = new StringBuilder();
                            StringBuilder sb8 = new StringBuilder();
                            Iterator<String> it6 = bVar.f275094h.iterator();
                            int i9 = 0;
                            int i15 = 0;
                            while (it6.hasNext()) {
                                C94921o2.C94922a aVar2 = bVar.f275096j.get(it6.next());
                                if (aVar2 != null) {
                                    BitmapFactory.Options imageOptions2 = BitmapUtil.getImageOptions(aVar2.f275085c);
                                    if (imageOptions2 != null) {
                                        i = imageOptions2.outWidth;
                                        i2 = imageOptions2.outHeight;
                                    } else {
                                        i2 = 0;
                                        i = 0;
                                    }
                                    sb6.append(i);
                                    sb6.append("|");
                                    sb7.append(i2);
                                    sb7.append("|");
                                    sb8.append(i5);
                                    sb8.append("|");
                                    i15 = aVar2.f275086d;
                                    C101817mv2 mv23 = aVar2.f275084b;
                                    if (mv23 != null) {
                                        i9 = (int) (((float) i9) + mv23.f298877f);
                                    }
                                }
                            }
                            C115669n nVar2 = C115669n.INSTANCE;
                            Object[] objArr3 = new Object[13];
                            objArr3[i5] = Integer.valueOf(bVar.f275090d);
                            it = it4;
                            objArr3[1] = Long.valueOf(bVar.f275088b);
                            objArr3[2] = Long.valueOf(bVar.f275089c);
                            objArr3[3] = Integer.valueOf(bVar.f275091e);
                            objArr3[4] = Integer.valueOf(G);
                            objArr3[5] = Long.valueOf(bVar.f275092f);
                            objArr3[6] = Long.valueOf(bVar.f275087a);
                            objArr3[7] = sb6.toString();
                            objArr3[8] = sb7.toString();
                            objArr3[9] = sb8.toString();
                            objArr3[10] = Integer.valueOf(i15);
                            objArr3[11] = Integer.valueOf(i9);
                            objArr3[12] = Long.valueOf(bVar.f275093g);
                            nVar2.mo160131h(11600, objArr3);
                            Log.m105919d("MicroMsg.TimelineSmallPicStat", "reportAll, picNum:%d, loadResult:%d, loadCostTime:%d, loadPicNum:%d, networkType:%d, publishId:%s, startTime:%s, picWidth:%s,picHeight:%s,picSize:%s,picTye:%s,download_len:%d,scene:%d", Integer.valueOf(bVar.f275090d), Long.valueOf(bVar.f275088b), Long.valueOf(bVar.f275089c), Integer.valueOf(bVar.f275091e), Integer.valueOf(G), Long.valueOf(bVar.f275092f), Long.valueOf(bVar.f275087a), sb6.toString(), sb7.toString(), sb8.toString(), Integer.valueOf(i15), Integer.valueOf(i9), Long.valueOf(bVar.f275093g));
                            it4 = it;
                            i5 = 0;
                        }
                    }
                    it = it4;
                    it4 = it;
                    i5 = 0;
                }
                C94921o2.m120481a().clear();
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                ConcurrentHashMap<String, WeakReference<C94921o2.C94923b>> concurrentHashMap = C94921o2.f275082b;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                concurrentHashMap.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat$1");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat$1");
    }
}
