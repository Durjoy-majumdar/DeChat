package p562in;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import eb0.C45628s0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import lc3.C10485b;
import p575jn.C98950b;
import xb0.C38471b;
import xb0.C38474f;

@C86522b
/* renamed from: in.a */
public class C33367a extends C86301e implements C98950b {
    /* renamed from: GX */
    public boolean mo59099GX(C72963f4 f4Var) {
        C38474f wx02 = C38474f.wx0();
        wx02.getClass();
        if (f4Var == null) {
            Log.m105928w("MicroMsg.SubCoreAutoDownload", "this message is null, can not auto download.");
            return false;
        } else if (!f4Var.mo100979R3()) {
            Log.m105928w("MicroMsg.SubCoreAutoDownload", "this message is not image, please tell cash.");
            return false;
        } else if (wx02.vx0(f4Var)) {
            return wx02.xx0();
        } else {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download C2C image.");
            return false;
        }
    }

    /* renamed from: Qj */
    public boolean mo59100Qj() {
        C38474f.wx0().getClass();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsImgPreLoadingAroundTimeLimit");
        Log.m105924i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: " + c);
        if (C38471b.m41885a(c)) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
            return false;
        }
        Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
        return true;
    }

    /* renamed from: SD */
    public boolean mo59101SD(PInt pInt, PInt pInt2) {
        C38474f.wx0().getClass();
        Class cls = C10485b.class;
        pInt.value = 0;
        int i = 1;
        int i2 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SIGHTAutoLoadNetwork"), 1);
        pInt2.value = i2;
        if (i2 == 3) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
            return false;
        }
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        if (i2 == 2 && !isWifi) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
            return false;
        } else if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
            return false;
        } else {
            String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsAdSightNotAutoDownloadTimeRange");
            Log.m105924i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: " + c);
            if (C38471b.m41885a(c)) {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
                if (i2 == 2) {
                    i = 2;
                }
                pInt.value = i;
                return false;
            }
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
            return true;
        }
    }

    /* renamed from: Tv */
    public boolean mo59102Tv(C72963f4 f4Var) {
        C38474f wx02 = C38474f.wx0();
        wx02.getClass();
        Class cls = C75700k0.class;
        Class cls2 = C10485b.class;
        int i = f4Var.f230734R;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (!wx02.vx0(f4Var)) {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message need control, do not auto download C2C short video.");
            } else {
                String c = ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107405c("C2CSightNotAutoDownloadTimeRange");
                Log.m105924i("MicroMsg.BusyTimeControlLogic", "C2CSightNotAutoDownloadTimeRange value: " + c);
                if (C38471b.m41885a(c)) {
                    Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C short video.");
                } else {
                    String t = f4Var.mo108768t();
                    Log.m105918d("MicroMsg.SubCoreAutoDownload", "isC2CSightAutoDownload msg talker: " + t);
                    int i2 = Util.getInt(((C10485b) C86709a0.m107533q(cls2)).vh0().mo107405c("SIGHTSessionAutoLoadNetwork"), 1);
                    if (i2 == 3) {
                        Log.m105925i("MicroMsg.SubCoreAutoDownload", "setting is not download sight automate, %d, %d", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()));
                    } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                        Log.m105925i("MicroMsg.SubCoreAutoDownload", "match wifi, do auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(t);
                        if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                            return true;
                        }
                        if ((!C72996z1.m85820U5(t) || z1Var.f149512S != 0) && !C45628s0.m50746K(z1Var)) {
                            return true;
                        }
                        Log.m105924i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C short video.");
                    } else if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                        Log.m105925i("MicroMsg.SubCoreAutoDownload", "match edge, do not auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                    } else {
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(f4Var.mo108768t());
                        if (C72996z1.m85820U5(f4Var.mo108768t())) {
                            if (z1Var2.f149512S == 0) {
                                Log.m105925i("MicroMsg.SubCoreAutoDownload", "match muted chatroom and not wifi, do not auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                            } else if ((NetStatusUtil.is3G(MMApplicationContext.getContext()) || NetStatusUtil.is4G(MMApplicationContext.getContext())) && i2 == 1) {
                                Log.m105925i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted chatroom, do auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                                return true;
                            } else {
                                Log.m105924i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step A");
                            }
                        } else if (C45628s0.m50746K(z1Var2)) {
                            Log.m105925i("MicroMsg.SubCoreAutoDownload", "match muted and not wifi, do not auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                        } else if ((NetStatusUtil.is3G(MMApplicationContext.getContext()) || NetStatusUtil.is4G(MMApplicationContext.getContext())) && i2 == 1) {
                            Log.m105925i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted, do auto download short video [msgid-%d-%d] [%s]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), f4Var.mo108765s2());
                            return true;
                        } else {
                            Log.m105924i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step B");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: fn */
    public boolean mo59103fn(PInt pInt, PInt pInt2, PInt pInt3) {
        PInt pInt4 = pInt;
        C38474f.wx0().getClass();
        Class cls = C10485b.class;
        pInt4.value = 0;
        int i = 1;
        int i2 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SIGHTAutoLoadNetwork"), 1);
        pInt2.value = i2;
        if (i2 == 3) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video");
            return false;
        }
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        if (i2 == 2 && !isWifi) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video.");
            return false;
        } else if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video.");
            return false;
        } else {
            String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsSightNoAutoDownload");
            if (!Util.isNullOrNil(c)) {
                try {
                    Log.m105924i("MicroMsg.SubCoreAutoDownload", "dynamicConfigValSeq " + c);
                    long j = Util.getLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), 0) - ((((long) (((int) (((long) ((int) (((long) TimeZone.getDefault().getRawOffset()) / 60000))) / 60)) + -8)) * 60) / 1000);
                    String[] split = c.split(",");
                    long j2 = Util.getLong(split[0], 0);
                    if (j <= Util.getLong(split[1], 0) && j >= j2) {
                        Log.m105924i("MicroMsg.SubCoreAutoDownload", "config settings can not auto download SNS short video");
                        pInt3.value = 1;
                        return false;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SubCoreAutoDownload", "paser error %s msg: %s", c, e.getMessage());
                }
            }
            String c2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsSightNotAutoDownloadTimeRange");
            Log.m105924i("MicroMsg.BusyTimeControlLogic", "SnsSightNotAutoDownloadTimeRange value: " + c2);
            if (C38471b.m41885a(c2)) {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download(but need check again) SNS short video");
                if (i2 == 2) {
                    i = 2;
                }
                pInt4.value = i;
                return false;
            }
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download.");
            return true;
        }
    }
}
