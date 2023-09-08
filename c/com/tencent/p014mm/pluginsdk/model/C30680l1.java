package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.pluginsdk.model.l1 */
public class C30680l1 {
    /* renamed from: a */
    public static int m39149a() {
        Class cls = C32735h.class;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_c2c_100_video, true);
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_c2c_max_video_size, 100);
        Log.m105925i("MicroMsg.VideoUploadConfig", "getBigVideoSize  enable:%s configMB:%s", Boolean.valueOf(wf), Integer.valueOf(Qe));
        if (wf) {
            return Qe * 1024 * 1024;
        }
        return 26214400;
    }

    /* renamed from: b */
    public static boolean m39150b(String str) {
        long l = C86013q1.m106451l(str);
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_c2c_100_video, true);
        Log.m105925i("MicroMsg.VideoUploadConfig", "C2C send big file:%s size:%s enable:%s", str, Long.valueOf(l), Boolean.valueOf(wf));
        return l >= 25165824 && wf;
    }
}
