package jx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51968xg;

/* renamed from: jx0.b */
public final class C33702b {

    /* renamed from: a */
    public static final C33702b f91166a = new C33702b();

    /* renamed from: b */
    public static final C13601g f91167b = C36568h.m40985a(C33703a.f91168d);

    /* renamed from: jx0.b$a */
    public static final class C33703a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C33703a f91168d = new C33703a();

        public C33703a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: a */
    public final boolean mo59262a() {
        byte[] decodeBytes = ((MultiProcessMMKV) ((C36570n) f91167b).getValue()).decodeBytes("personal_center_main_table");
        C51968xg xgVar = new C51968xg();
        if (decodeBytes != null) {
            xgVar.parseFrom(decodeBytes);
        }
        if (xgVar.f144635e != 1) {
            Log.m105924i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.is_feature_open = " + xgVar.f144635e);
            return false;
        } else if (Util.isNullOrNil((List) xgVar.f144634d)) {
            Log.m105924i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.cell_list is Empty");
            return false;
        } else {
            Log.m105924i("MicroMsg.BizPersonalCenterStrategy", "canShowPersonalCenter = true");
            return true;
        }
    }
}
