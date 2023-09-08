package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import p523fp.C32147e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.c0 */
public class C68613c0 extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        if (C86709a0.m107522a()) {
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            if (aVar.f78744a == 88) {
                CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
                Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "webaudio update coming. subtype: %d, file path: %s, file version: %d", Integer.valueOf(aVar.f78745b), aVar2.f78746c, Integer.valueOf(aVar2.f78747d));
                CheckResUpdateCacheFileEvent.C28720a aVar3 = checkResUpdateCacheFileEvent.f78743d;
                int i = aVar3.f78745b;
                if (i == 1) {
                    Uri n = C116299g2.m163858n(aVar3.f78746c);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0 f0Var = C116281f0.C116289i.f348994a;
                    C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        String q = C86013q1.m106456q(checkResUpdateCacheFileEvent.f78743d.f78746c);
                        if (TextUtils.isEmpty(q)) {
                            Log.m105920e("MicroMsg.WxAudioCheckResUpdateListener", "current_file_md5 is empty");
                        } else if (!q.equals(checkResUpdateCacheFileEvent.f78743d.f78749f)) {
                            Log.m105921e("MicroMsg.WxAudioCheckResUpdateListener", "md5 is diff, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
                        } else {
                            Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "md5 is same, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
                            String str = MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/WxAudioLib";
                            Uri n2 = C116299g2.m163858n(str);
                            String path2 = n2.getPath();
                            if (path2 != null) {
                                String k2 = C116299g2.m163855k(path2, false, false);
                                if (!n2.getPath().equals(k2)) {
                                    n2 = n2.buildUpon().path(k2).build();
                                }
                            }
                            C116281f0.C116288h l2 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
                            if (!(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b))) {
                                try {
                                    C116281f0.C116288h l3 = f0Var.mo177799l(n2, l2);
                                    if (l3.mo177810a()) {
                                        l3.f348991a.mo119937g(l3.f348992b);
                                    }
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.WxAudioCheckResUpdateListener", e, "create file:%s", str);
                                }
                            }
                            String str2 = str + "/" + checkResUpdateCacheFileEvent.f78743d.f78747d + "";
                            C86009m1 m1Var = new C86009m1(str2);
                            if (m1Var.mo119967g()) {
                                m1Var.mo119966f();
                            }
                            try {
                                m1Var.mo119987x();
                            } catch (Exception e2) {
                                Log.printErrStackTrace("MicroMsg.WxAudioCheckResUpdateListener", e2, "create file:%s", str2);
                            }
                            int R = C86013q1.m106436R(checkResUpdateCacheFileEvent.f78743d.f78746c, str2);
                            if (R < 0) {
                                Log.m105920e("MicroMsg.WxAudioCheckResUpdateListener", "unzip fail, ret = " + R + ", zipFilePath = " + checkResUpdateCacheFileEvent.f78743d.f78746c + ", unzipPath = " + str2);
                                return true;
                            }
                            Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "unzip file success, unzipFolder file :%s  to path:%s", checkResUpdateCacheFileEvent.f78743d.f78746c, str2);
                            CheckResUpdateCacheFileEvent.C28720a aVar4 = checkResUpdateCacheFileEvent.f78743d;
                            ((C32147e) C86312j.m106911c(C32147e.class)).Y40(aVar4.f78744a, aVar4.f78745b, aVar4.f78747d);
                            int i2 = checkResUpdateCacheFileEvent.f78743d.f78747d;
                            Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "recycleOldVersionSo current fileVersion", Integer.valueOf(i2));
                            C86009m1 m1Var2 = new C86009m1(str);
                            if (!m1Var2.mo119967g() || !m1Var2.mo119977o()) {
                                Log.m105920e("MicroMsg.WxAudioCheckResUpdateListener", "wxAudioLibFolder not exist or not Directory");
                                return true;
                            }
                            C86009m1[] u = m1Var2.mo119984u();
                            if (u == null) {
                                Log.m105920e("MicroMsg.WxAudioCheckResUpdateListener", "listFile is null");
                                return true;
                            }
                            int length = u.length;
                            Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "fileVersion:%d, currentSubFileCount：%d", Integer.valueOf(i2), Integer.valueOf(length));
                            if (length <= 3) {
                                Log.m105924i("MicroMsg.WxAudioCheckResUpdateListener", "wxAudioLibFolder file count not need to recycle");
                                return true;
                            }
                            int i3 = i2 - 3;
                            if (i3 < 0) {
                                return true;
                            }
                            int i4 = 0;
                            for (int i5 = 1; i5 <= i3; i5++) {
                                String str3 = str + "/" + i5 + "";
                                Uri n3 = C116299g2.m163858n(str3);
                                String path3 = n3.getPath();
                                if (path3 != null) {
                                    String k3 = C116299g2.m163855k(path3, false, false);
                                    if (!n3.getPath().equals(k3)) {
                                        n3 = n3.buildUpon().path(k3).build();
                                    }
                                }
                                C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n3, (C116281f0.C116288h) null);
                                if (!l4.mo177810a() ? false : l4.f348991a.mo119948x(l4.f348992b)) {
                                    boolean g = C86013q1.m106446g(str3, true);
                                    if (g) {
                                        i4++;
                                    }
                                    Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "delete versionFolder:%s, del:%b", str3, Boolean.valueOf(g));
                                }
                                if (length - i4 <= 3) {
                                    Log.m105925i("MicroMsg.WxAudioCheckResUpdateListener", "delete versionFolder count:%d reach max recycle count", Integer.valueOf(i4));
                                    return true;
                                }
                            }
                            return true;
                        }
                    } else {
                        Log.m105921e("MicroMsg.WxAudioCheckResUpdateListener", "file not exits :%s", checkResUpdateCacheFileEvent.f78743d.f78746c);
                    }
                } else {
                    Log.m105921e("MicroMsg.WxAudioCheckResUpdateListener", "sub type can't be handled!, subtype:%d", Integer.valueOf(i));
                }
            }
        }
        return false;
    }
}
