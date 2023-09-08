package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import p1081gi.C98120c;

/* renamed from: com.tencent.mm.modelimage.a0$$d */
public class a0$$d implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ C92805a0 f267237a;

    public a0$$d(C92805a0 a0Var) {
        this.f267237a = a0Var;
    }

    /* renamed from: a */
    public void mo11363a(C92798v vVar) {
        C92798v vVar2 = vVar;
        C92805a0 a0Var = this.f267237a;
        Log.m105925i(a0Var.f267210d, "CdnPLCJavaHelperListener %s %s %s", Long.valueOf(a0Var.f267220q), vVar2.f267130a, Integer.valueOf(vVar2.f267132c));
        int ordinal = vVar2.f267130a.ordinal();
        String str = "";
        if (ordinal != 0) {
            long j = 24;
            if (ordinal == 1) {
                C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267237a.f267216j));
                if (vVar2.f267135f != null) {
                    if (nP.f267381h == 1) {
                        C115669n nVar = C115669n.INSTANCE;
                        C115669n nVar2 = nVar;
                        nVar2.idkeyStat(198, 26, (long) nP.f267377d, false);
                        nVar2.idkeyStat(198, 27, 1, false);
                        C72963f4 f4Var = this.f267237a.f267221r;
                        if (f4Var != null) {
                            str = f4Var.mo108768t();
                        }
                        nVar.idkeyStat(198, C72996z1.m85820U5(str) ? 29 : 28, 1, false);
                    } else {
                        C115669n nVar3 = C115669n.INSTANCE;
                        C115669n nVar4 = nVar3;
                        nVar4.idkeyStat(198, 21, (long) nP.f267377d, false);
                        nVar4.idkeyStat(198, 22, 1, false);
                        C72963f4 f4Var2 = this.f267237a.f267221r;
                        if (f4Var2 != null) {
                            str = f4Var2.mo108768t();
                        }
                        if (!C72996z1.m85820U5(str)) {
                            j = 23;
                        }
                        nVar3.idkeyStat(198, j, 1, false);
                    }
                    if (vVar2.f267135f.field_convert2baseline) {
                        C92805a0 a0Var2 = this.f267237a;
                        Log.m105925i(a0Var2.f267210d, "cdntra need convert2baseline. file:%s", a0Var2.f267227x);
                        Log.m105925i(this.f267237a.f267210d, "convert result:%b", Boolean.valueOf(MMNativeJpeg.Convert2Baseline(this.f267237a.f267227x, 60)));
                    }
                }
                C92805a0 a0Var3 = this.f267237a;
                Log.m105925i(a0Var3.f267210d, "CdnPLCJavaHelperListener download img success %s %s %s %s", Long.valueOf(a0Var3.f267216j), this.f267237a.f267227x, Integer.valueOf(nP.f267376c), Integer.valueOf(this.f267237a.f267228y));
                C92805a0 a0Var4 = this.f267237a;
                a0Var4.f267228y = (int) C86013q1.m106451l(a0Var4.f267227x);
                C92805a0 a0Var5 = this.f267237a;
                int i = a0Var5.f267228y;
                a0Var5.mo127064l1(nP, i, i, 0, (byte[]) null);
                return;
            } else if (ordinal == 2) {
                C92836k nP2 = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267237a.f267216j));
                if (nP2.f267381h == 1) {
                    C115669n nVar5 = C115669n.INSTANCE;
                    C115669n nVar6 = nVar5;
                    nVar6.idkeyStat(198, 26, (long) nP2.f267377d, false);
                    nVar6.idkeyStat(198, 27, 1, false);
                    C72963f4 f4Var3 = this.f267237a.f267221r;
                    if (f4Var3 != null) {
                        str = f4Var3.mo108768t();
                    }
                    nVar5.idkeyStat(198, C72996z1.m85820U5(str) ? 29 : 28, 1, false);
                } else {
                    C115669n nVar7 = C115669n.INSTANCE;
                    C115669n nVar8 = nVar7;
                    nVar8.idkeyStat(198, 21, (long) nP2.f267377d, false);
                    nVar8.idkeyStat(198, 22, 1, false);
                    C72963f4 f4Var4 = this.f267237a.f267221r;
                    if (f4Var4 != null) {
                        str = f4Var4.mo108768t();
                    }
                    nVar7.idkeyStat(198, C72996z1.m85820U5(str) ? 24 : 23, 1, false);
                }
                C92805a0 a0Var6 = this.f267237a;
                Log.m105925i(a0Var6.f267210d, "CdnPLCJavaHelperListener copy link img success %s %s %s %s", Long.valueOf(a0Var6.f267216j), this.f267237a.f267227x, Integer.valueOf(nP2.f267376c), Integer.valueOf(this.f267237a.f267228y));
                C92805a0 a0Var7 = this.f267237a;
                a0Var7.f267228y = (int) C86013q1.m106451l(a0Var7.f267227x);
                C92805a0 a0Var8 = this.f267237a;
                int i2 = a0Var8.f267228y;
                a0Var8.mo127064l1(nP2, i2, i2, 0, (byte[]) null);
                return;
            } else if (ordinal == 3) {
                C98120c cVar = vVar2.f267134e;
                if (cVar != null) {
                    long j2 = cVar.field_finishedLength;
                    C92805a0 a0Var9 = this.f267237a;
                    int i3 = a0Var9.f267228y;
                    if (j2 == ((long) i3)) {
                        Log.m105925i(a0Var9.f267210d, "cdntra ignore progress 100%% %s", Integer.valueOf(i3));
                        return;
                    }
                    if (!a0Var9.f267203A) {
                        a0Var9.f267203A = cVar.field_mtlnotify;
                    }
                    C92836k nP3 = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267237a.f267216j));
                    Log.m105925i(this.f267237a.f267210d, "CdnPLCJavaHelperListener progress %s/%s imgOffset:%s", Long.valueOf(vVar2.f267134e.field_finishedLength), Long.valueOf(vVar2.f267134e.field_toltalLength), Integer.valueOf(nP3.f267376c));
                    C92805a0 a0Var10 = this.f267237a;
                    int i4 = a0Var10.f267228y;
                    int i5 = nP3.f267376c;
                    a0Var10.mo127064l1(nP3, i4, i5, (int) (vVar2.f267134e.field_finishedLength - ((long) i5)), (byte[]) null);
                    return;
                }
                return;
            } else if (ordinal == 7 || ordinal == 8) {
                C68129u.m80534f((int) this.f267237a.f267214h);
                C68129u.m80533e((int) this.f267237a.f267214h);
                C92805a0 a0Var11 = this.f267237a;
                a0Var11.f267212f.onSceneEnd(3, -1, str, a0Var11);
                return;
            } else if (ordinal != 11) {
                return;
            }
        }
        C68129u.m80534f((int) this.f267237a.f267214h);
        C68129u.m80533e((int) this.f267237a.f267214h);
        C92805a0 a0Var12 = this.f267237a;
        a0Var12.f267212f.onSceneEnd(3, vVar2.f267132c, str, a0Var12);
    }
}
