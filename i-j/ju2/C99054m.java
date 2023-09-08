package ju2;

import bp3.C104160f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import gu2.C98213a;
import gu2.C98214b;
import gy3.C87412m;
import h81.C32735h;
import te3.C101789j00;
import te3.C101833r5;

/* renamed from: ju2.m */
public final class C99054m {

    /* renamed from: a */
    public static final C99054m f290360a = new C99054m();

    /* renamed from: a */
    public final int mo138406a(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
        C87412m.m108594g(bVar, "info");
        if (bVar instanceof C98213a) {
            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            return 100;
        } else if (bVar.isAd()) {
            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            return 99;
        } else {
            SnsMethodCalculate.markStartTimeMs("isWsFold", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            int i = 0;
            boolean z = (bVar.getLocalFlag() & 1024) > 0;
            SnsMethodCalculate.markEndTimeMs("isWsFold", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                return 7;
            }
            TimeLineObject G2 = bVar.mo137509G2();
            C101789j00 j002 = G2.ContentObj;
            int i2 = j002.f298424e;
            if (i2 == 1) {
                if (j002.f298427h.size() != 1) {
                    i = 1;
                }
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                return i;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        C101833r5 r5Var = G2.AppInfo;
                        if (C87412m.m108589b("wx5aa333606550dfd5", r5Var != null ? r5Var.f299236d : null)) {
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                            return 8;
                        }
                        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_type_flag, C104160f.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                            i = 1;
                        }
                        if (i == 0) {
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                            return 9;
                        }
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                        return 4;
                    } else if (!(i2 == 5 || i2 == 9 || i2 == 10 || i2 == 17 || i2 == 26)) {
                        if (i2 != 34) {
                            if (!(i2 == 49 || i2 == 101 || i2 == 22 || i2 == 23 || i2 == 41)) {
                                if (i2 != 42) {
                                    switch (i2) {
                                        case 12:
                                        case 13:
                                        case 14:
                                            break;
                                        case 15:
                                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                            return 3;
                                        default:
                                            switch (i2) {
                                                case 28:
                                                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                    return 5;
                                                case 29:
                                                case 30:
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 44:
                                                                case 46:
                                                                    break;
                                                                case 45:
                                                                    break;
                                                                default:
                                                                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                    return 99;
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                    return 8;
                                }
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                        return 6;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                return 4;
            } else {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                return 2;
            }
        }
    }
}
