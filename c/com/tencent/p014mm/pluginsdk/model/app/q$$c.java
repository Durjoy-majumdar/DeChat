package com.tencent.p014mm.pluginsdk.model.app;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;
import p753xp.C102704b;
import p867wp.C102479b;

/* renamed from: com.tencent.mm.pluginsdk.model.app.q$$c */
public class q$$c implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ long f211501d;

    /* renamed from: e */
    public final /* synthetic */ String f211502e;

    /* renamed from: f */
    public final /* synthetic */ String f211503f;

    /* renamed from: g */
    public final /* synthetic */ String f211504g;

    /* renamed from: h */
    public final /* synthetic */ int f211505h;

    /* renamed from: i */
    public final /* synthetic */ boolean f211506i;

    /* renamed from: j */
    public final /* synthetic */ int f211507j;

    public q$$c(C72689q qVar, long j, String str, String str2, String str3, int i, boolean z, int i2) {
        this.f211501d = j;
        this.f211502e = str;
        this.f211503f = str2;
        this.f211504g = str3;
        this.f211505h = i;
        this.f211506i = z;
        this.f211507j = i2;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2;
        C98121d dVar2 = dVar;
        Class cls = C98201k.class;
        if (i != 0) {
            Log.m105921e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: msgid:%d startRet:%d thumbUrl:%s", Long.valueOf(this.f211501d), Integer.valueOf(i), this.f211502e);
            return i;
        } else if (dVar2 == null) {
            return 0;
        } else {
            if (dVar2.field_retCode != 0) {
                Log.m105921e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: msgid:%d sceneResult.field_retCode:%d thumbUrl:%s", Long.valueOf(this.f211501d), Integer.valueOf(dVar2.field_retCode), this.f211502e);
                C86013q1.m106447h(this.f211503f);
            } else {
                C72963f4 h302 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(this.f211504g, this.f211501d);
                long y2 = h302.mo108774y2();
                long j = this.f211501d;
                if (y2 != j) {
                    Log.m105921e("MicroMsg.AppMessageExtension", "hy: appmsg %d has been deleted", Long.valueOf(j));
                    return 0;
                }
                Log.m105925i("MicroMsg.AppMessageExtension", "hy: %d current msg type is %d", Long.valueOf(j), Integer.valueOf(h302.getType()));
                byte[] O = C86013q1.m106433O(this.f211503f, 0, -1);
                int i2 = this.f211505h;
                if (i2 == 33 || i2 == 36 || i2 == 46 || i2 == 44 || i2 == 48 || i2 == 101) {
                    str2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).yx0(O, 100, Bitmap.CompressFormat.JPEG);
                    String h303 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).h30(str2);
                    C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(h303, 33, (String) null, (byte[]) null);
                    Log.m105925i("MicroMsg.AppMessageExtension", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", h303, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                    C86013q1.m106447h(this.f211503f);
                } else {
                    str2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).zx0(O, this.f211506i, Bitmap.CompressFormat.PNG, h302.mo101022y3());
                }
                if (!Util.isNullOrNil(str2)) {
                    h302.mo108739S2(str2);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).yy0(h302.mo108774y2(), h302);
                }
                Log.m105925i("MicroMsg.AppMessageExtension", "getThumbByCdn finished msgid:%d talker:%s thumbUrl:%s path:%s", Long.valueOf(this.f211501d), this.f211504g, this.f211502e, str2);
                C115669n nVar = C115669n.INSTANCE;
                C115669n nVar2 = nVar;
                nVar2.idkeyStat(198, 16, (long) this.f211507j, false);
                nVar2.idkeyStat(198, 17, 1, false);
                nVar.idkeyStat(198, C72996z1.m85820U5(this.f211504g) ? 19 : 18, 1, false);
            }
            ((C98201k) C86312j.m106911c(cls)).mo137277xi().doNotify();
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
