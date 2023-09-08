package r62;

import android.content.Context;
import android.os.Handler;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;

@C86522b
/* renamed from: r62.d */
public class C118225d extends C86301e {

    /* renamed from: e */
    public static List<C36255a> f353377e = new LinkedList();

    /* renamed from: f */
    public static long f353378f = 0;

    /* renamed from: d */
    public Handler f353379d = new Handler();

    /* renamed from: r62.d$a */
    public static class C36255a {

        /* renamed from: a */
        public String f96543a;

        /* renamed from: b */
        public String f96544b;

        /* renamed from: c */
        public String f96545c;

        /* renamed from: d */
        public String f96546d;

        /* renamed from: e */
        public String f96547e;

        /* renamed from: f */
        public int f96548f;

        /* renamed from: g */
        public boolean f96549g;
    }

    public static synchronized List<C36255a> vx0(Context context) {
        int i;
        synchronized (C118225d.class) {
            if (((LinkedList) f353377e).size() <= 0 || System.currentTimeMillis() - f353378f >= 60000) {
                f353378f = System.currentTimeMillis();
                ((LinkedList) f353377e).clear();
                try {
                    List<CellInfo> list = (List) C117292a.m165363i((TelephonyManager) context.getSystemService("phone"), "com/tencent/mm/plugin/misc/impl/NetworkOptReport", "getExtraCellInfoList", "(Landroid/content/Context;)Ljava/util/List;", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                    if (list != null) {
                        for (CellInfo cellInfo : list) {
                            C36255a aVar = new C36255a();
                            if (cellInfo instanceof CellInfoGsm) {
                                CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                                i = cellIdentity.getMnc();
                                aVar.f96545c = "" + cellIdentity.getCid();
                                aVar.f96543a = "" + cellIdentity.getMcc();
                                aVar.f96544b = "" + cellIdentity.getMnc();
                                aVar.f96546d = "" + cellIdentity.getLac();
                                aVar.f96548f = cellSignalStrength.getDbm();
                                aVar.f96549g = cellInfo.isRegistered();
                                aVar.f96547e = NetStatusUtil.CELL_GSM;
                            } else if (cellInfo instanceof CellInfoCdma) {
                                CellSignalStrengthCdma cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                                CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                                i = cellIdentity2.getSystemId();
                                aVar.f96545c = "" + cellIdentity2.getBasestationId();
                                aVar.f96544b = "" + cellIdentity2.getSystemId();
                                aVar.f96546d = "" + cellIdentity2.getNetworkId();
                                aVar.f96548f = cellSignalStrength2.getDbm();
                                aVar.f96549g = cellInfo.isRegistered();
                                aVar.f96547e = NetStatusUtil.CELL_CDMA;
                            } else if (cellInfo instanceof CellInfoLte) {
                                CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                                i = cellIdentity3.getMnc();
                                aVar.f96545c = "" + cellIdentity3.getCi();
                                aVar.f96543a = "" + cellIdentity3.getMcc();
                                aVar.f96544b = "" + cellIdentity3.getMnc();
                                aVar.f96546d = "" + cellIdentity3.getTac();
                                aVar.f96548f = cellSignalStrength3.getDbm();
                                aVar.f96549g = cellInfo.isRegistered();
                                aVar.f96547e = "lte";
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                                CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                                i = cellIdentity4.getMnc();
                                aVar.f96545c = "" + cellIdentity4.getCid();
                                aVar.f96543a = "" + cellIdentity4.getMcc();
                                aVar.f96544b = "" + cellIdentity4.getMnc();
                                aVar.f96546d = "" + cellIdentity4.getLac();
                                aVar.f96548f = cellSignalStrength4.getDbm();
                                aVar.f96549g = cellInfo.isRegistered();
                                aVar.f96547e = "wcdma";
                            } else {
                                Log.m105924i("MicroMsg.NetworkOptReport", "Unknown type of cell signal!\n ClassName: " + cellInfo.getClass().getSimpleName() + "\n ToString: " + cellInfo.toString());
                                i = 0;
                            }
                            if (aVar.f96544b.length() == 1) {
                                aVar.f96544b = "0" + aVar.f96544b;
                            }
                            if (i != Integer.MAX_VALUE) {
                                ((LinkedList) f353377e).add(aVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NetworkOptReport", "loadCellInfo: Unable to obtain cell signal information: ", e);
                }
                List<C36255a> list2 = f353377e;
                return list2;
            }
            List<C36255a> list3 = f353377e;
            return list3;
        }
    }
}
