package com.tencent.p014mm.wexnet;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.io.File;
import p523fp.C32147e;

/* renamed from: com.tencent.mm.wexnet.e */
public final class C75244e extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        int i = checkResUpdateCacheFileEvent.f78743d.f78744a;
        if (i != 108 && i != 109) {
            return false;
        }
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        Log.m105925i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "xnet lib update coming. resType: %d subtype: %d, file path: %s, file version: %d, isArm64: %b", Integer.valueOf(i), Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78745b), aVar.f78746c, Integer.valueOf(aVar.f78747d), Boolean.valueOf(BuildInfo.IS_ARM64));
        Uri n = C116299g2.m163858n(checkResUpdateCacheFileEvent.f78743d.f78746c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105921e("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "file not exits :%s", checkResUpdateCacheFileEvent.f78743d.f78746c);
        } else {
            String q = C86013q1.m106456q(checkResUpdateCacheFileEvent.f78743d.f78746c);
            if (TextUtils.isEmpty(q)) {
                Log.m105920e("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "current_file_md5 is empty");
            } else if (!C87412m.m108589b(q, checkResUpdateCacheFileEvent.f78743d.f78749f)) {
                C115669n.INSTANCE.idkeyStat(1868, 6, 1, true);
                Log.m105921e("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "md5 is diff, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
            } else {
                Log.m105925i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "md5 is same, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
                StringBuilder sb = new StringBuilder();
                sb.append(MMApplicationContext.getContext().getFilesDir().getAbsolutePath());
                String str = File.separator;
                sb.append(str);
                sb.append("XNetLib");
                sb.append(str);
                sb.append(BuildInfo.IS_ARM64 ? "64" : "32");
                String sb4 = sb.toString();
                C86009m1 m1Var = new C86009m1(sb4);
                if (!m1Var.mo119967g()) {
                    try {
                        m1Var.mo119987x();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", e, "create file:%s", m1Var);
                    }
                }
                String str2 = sb4 + XVFSFile.SEPARATOR_CHAR + checkResUpdateCacheFileEvent.f78743d.f78747d + "";
                C86009m1 m1Var2 = new C86009m1(str2);
                if (m1Var2.mo119967g()) {
                    m1Var2.mo119966f();
                }
                try {
                    m1Var2.mo119987x();
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", e2, "create file:%s", str2);
                }
                int R = C86013q1.m106436R(checkResUpdateCacheFileEvent.f78743d.f78746c, str2);
                if (R < 0) {
                    C115669n.INSTANCE.idkeyStat(1868, 5, 1, true);
                    Log.m105920e("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "unzip fail, ret = " + R + ", zipFilePath = " + checkResUpdateCacheFileEvent.f78743d.f78746c + ", unzipPath = " + str2);
                } else {
                    Log.m105925i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "unzip file success, unzipFolder file :%s to path:%s", checkResUpdateCacheFileEvent.f78743d.f78746c, str2);
                    CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
                    ((C32147e) C86312j.m106911c(C32147e.class)).Y40(aVar2.f78744a, aVar2.f78745b, aVar2.f78747d);
                    C115669n.INSTANCE.idkeyStat(1868, 4, 1, true);
                    int i2 = checkResUpdateCacheFileEvent.f78743d.f78747d;
                    Log.m105925i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "recycleOldVersionSo current fileVersion", Integer.valueOf(i2));
                    int i3 = i2 - 2;
                    if (i3 >= 0) {
                        while (-1 < i3) {
                            String str3 = sb4 + XVFSFile.SEPARATOR_CHAR + i3;
                            if (C86013q1.m106450k(str3)) {
                                C86013q1.m106445f(str3);
                                Log.m105925i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "delete versionFolder:%s", str3);
                            }
                            i3--;
                        }
                    }
                }
            }
        }
        return true;
    }
}
