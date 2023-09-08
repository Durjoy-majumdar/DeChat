package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.modelimage.a0$$c */
public class a0$$c implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C92805a0 f267236d;

    public a0$$c(C92805a0 a0Var) {
        this.f267236d = a0Var;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        int i2 = i;
        C98120c cVar2 = cVar;
        C98121d dVar2 = dVar;
        if (i2 == -21006) {
            C92805a0 a0Var = this.f267236d;
            Log.m105925i(a0Var.f267210d, "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", a0Var.f267222s);
            return 0;
        }
        String str2 = "";
        if (i2 != 0) {
            C68129u.m80534f((int) this.f267236d.f267214h);
            C68129u.m80533e((int) this.f267236d.f267214h);
            C92805a0 a0Var2 = this.f267236d;
            a0Var2.f267212f.onSceneEnd(3, i2, str2, a0Var2);
            return 0;
        }
        C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267236d.f267216j));
        if (cVar2 != null) {
            C92805a0 a0Var3 = this.f267236d;
            if (a0Var3.f267228y == 0) {
                long j = cVar2.field_toltalLength;
                if (j > 0) {
                    a0Var3.f267228y = new Long(j).intValue();
                    C92805a0 a0Var4 = this.f267236d;
                    Log.m105929w(a0Var4.f267210d, "modify totallen:%d", Integer.valueOf(a0Var4.f267228y));
                }
            }
            long j2 = cVar2.field_finishedLength;
            C92805a0 a0Var5 = this.f267236d;
            if (j2 == ((long) a0Var5.f267228y)) {
                Log.m105918d(a0Var5.f267210d, "cdntra ignore progress 100%");
                return 0;
            }
            if (!a0Var5.f267203A) {
                a0Var5.f267203A = cVar2.field_mtlnotify;
            }
            Log.m105925i(a0Var5.f267210d, "cdntra progresscallback id:%s finish:%d total:%d,  canshowProgressimg:%b", a0Var5.f267222s, Long.valueOf(j2), Long.valueOf(cVar2.field_toltalLength), Boolean.valueOf(this.f267236d.f267203A));
            C92805a0 a0Var6 = this.f267236d;
            int i3 = a0Var6.f267228y;
            int i4 = nP.f267376c;
            a0Var6.mo127064l1(nP, i3, i4, ((int) cVar2.field_finishedLength) - i4, (byte[]) null);
            return 0;
        }
        if (dVar2 != null) {
            if (dVar2.field_retCode != 0) {
                C68129u.m80533e((int) this.f267236d.f267214h);
                Log.m105921e(this.f267236d.f267210d, "cdntra sceneResult.retCode :%d", Integer.valueOf(dVar2.field_retCode));
                C92805a0 a0Var7 = this.f267236d;
                a0Var7.f267212f.onSceneEnd(3, dVar2.field_retCode, str2, a0Var7);
            } else {
                Log.m105925i(this.f267236d.f267210d, "cdntra getimg ok. need convert:%b", Boolean.valueOf(dVar2.field_convert2baseline));
                C92805a0 a0Var8 = this.f267236d;
                if (a0Var8.f267228y == 0) {
                    long j3 = dVar2.field_fileLength;
                    if (j3 > 0) {
                        a0Var8.f267228y = new Long(j3).intValue();
                        C92805a0 a0Var9 = this.f267236d;
                        Log.m105929w(a0Var9.f267210d, "modify totallen:%d", Integer.valueOf(a0Var9.f267228y));
                    }
                }
                Log.m105925i(this.f267236d.f267210d, "cdntra getimg ok. need convert:%b", Boolean.valueOf(dVar2.field_convert2baseline));
                if (nP.f267381h == 1) {
                    C115669n nVar = C115669n.INSTANCE;
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(198, 26, (long) nP.f267377d, false);
                    nVar2.idkeyStat(198, 27, 1, false);
                    C72963f4 f4Var = this.f267236d.f267221r;
                    if (f4Var != null) {
                        str2 = f4Var.mo108768t();
                    }
                    nVar.idkeyStat(198, C72996z1.m85820U5(str2) ? 29 : 28, 1, false);
                } else {
                    C115669n nVar3 = C115669n.INSTANCE;
                    C115669n nVar4 = nVar3;
                    nVar4.idkeyStat(198, 21, (long) nP.f267377d, false);
                    nVar4.idkeyStat(198, 22, 1, false);
                    C72963f4 f4Var2 = this.f267236d.f267221r;
                    if (f4Var2 != null) {
                        str2 = f4Var2.mo108768t();
                    }
                    nVar3.idkeyStat(198, C72996z1.m85820U5(str2) ? 24 : 23, 1, false);
                }
                if (dVar2.field_convert2baseline) {
                    C92805a0 a0Var10 = this.f267236d;
                    Log.m105925i(a0Var10.f267210d, "cdntra need convert2baseline. file:%s", a0Var10.f267227x);
                    Log.m105925i(this.f267236d.f267210d, "convert result:%b", Boolean.valueOf(MMNativeJpeg.Convert2Baseline(this.f267236d.f267227x, 60)));
                }
                C92805a0 a0Var11 = this.f267236d;
                int i5 = a0Var11.f267228y;
                int i6 = nP.f267376c;
                a0Var11.mo127064l1(nP, i5, i6, i5 - i6, (byte[]) null);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
