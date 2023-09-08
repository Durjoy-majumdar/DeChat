package com.tencent.p014mm.plugin.sns.model;

import android.util.Pair;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.sns.model.s1 */
public class C30414s1 {

    /* renamed from: a */
    public long f82027a = 0;

    /* renamed from: b */
    public boolean f82028b = false;

    /* renamed from: c */
    public boolean f82029c = false;

    /* renamed from: d */
    public LinkedList<Pair<Integer, Integer>> f82030d = new LinkedList<>();

    /* renamed from: a */
    public final boolean mo57373a() {
        SnsMethodCalculate.markStartTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        this.f82030d.clear();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsImgPreLoadingTimeLimit");
        Object[] objArr = new Object[1];
        objArr[0] = c == null ? "null" : c;
        Log.m105925i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", objArr);
        if (!Util.isNullOrNil(c)) {
            try {
                Log.m105925i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", c);
                String[] split = c.split(";");
                for (String split2 : split) {
                    String[] split3 = split2.split("-");
                    String[] split4 = split3[0].split(XVFSFile.PATH_SEPARATOR);
                    int safeParseInt = (Util.safeParseInt(split4[0]) * 60) + Util.safeParseInt(split4[1]);
                    String[] split5 = split3[1].split(XVFSFile.PATH_SEPARATOR);
                    this.f82030d.add(new Pair(Integer.valueOf(safeParseInt), Integer.valueOf((Util.safeParseInt(split5[0]) * 60) + Util.safeParseInt(split5[1]))));
                }
            } catch (Exception unused) {
            }
        }
        if (Util.isNullOrNil((List) this.f82030d)) {
            this.f82030d.add(new Pair(0, 1440));
            SnsMethodCalculate.markEndTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        return true;
    }
}
