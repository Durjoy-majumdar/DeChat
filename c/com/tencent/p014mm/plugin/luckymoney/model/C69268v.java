package com.tencent.p014mm.plugin.luckymoney.model;

import android.text.TextUtils;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import p1081gi.C98120c;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.v */
public class C69268v implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ C69270w f199344a;

    public C69268v(C69270w wVar) {
        this.f199344a = wVar;
    }

    /* renamed from: a */
    public void mo11363a(C92798v vVar) {
        C98124g gVar = vVar.f267133d;
        String str = (gVar == null || TextUtils.isEmpty(gVar.field_fullpath)) ? "" : gVar.field_fullpath;
        C92798v.C92799a aVar = vVar.f267130a;
        if (aVar != C92798v.C92799a.OnDownloadCallbackProgress) {
            Log.m105925i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "voice download fullPath: %s %s %s", str, aVar, Integer.valueOf(vVar.f267132c));
        }
        int ordinal = vVar.f267130a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 3) {
                    C98120c cVar = vVar.f267134e;
                    if (cVar != null) {
                        Log.m105919d("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "onDownloadVoiceProgress %s/%s", Long.valueOf(cVar.field_finishedLength), Long.valueOf(vVar.f267134e.field_toltalLength));
                        return;
                    }
                    return;
                } else if (!(ordinal == 11 || ordinal == 7 || ordinal == 8)) {
                    return;
                }
            } else if (vVar.f267135f != null) {
                long l = C86013q1.m106451l(str);
                if (l < this.f199344a.f199345d) {
                    Log.m105921e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but realLength:%s < voiceFileLength:%s, need to delete", Long.valueOf(l), Long.valueOf(this.f199344a.f199345d));
                    C86013q1.m106447h(str);
                    return;
                }
                Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess");
                return;
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but getSceneResult is null");
                C69270w.m81641d(this.f199344a, str);
                return;
            }
        }
        Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download error");
        C69270w.m81641d(this.f199344a, str);
    }
}
