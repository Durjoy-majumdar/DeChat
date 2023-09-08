package of3;

import com.tenpay.android.wechat.PayuSecureEncrypt;
import gg3.C107800d;
import java.util.List;
import kf3.C61080b;
import kf3.C61082e;
import sx3.C64197v;

/* renamed from: of3.f */
public final class C100331f extends C61080b {
    /* renamed from: a */
    public String mo54531a() {
        return "RepairerConfig_Global_C2CPreload_DefaultServerPriority";
    }

    /* renamed from: b */
    public String mo54532b() {
        return "默认后台优先级（后台没有msgPd时生效）";
    }

    /* renamed from: d */
    public Class<? extends C61082e> mo54533d() {
        return C107800d.class;
    }

    /* renamed from: k */
    public List<String> mo59751k() {
        return C64197v.m75537f("不预加载", "低优先级", "中优先级", "高优先级");
    }

    /* renamed from: l */
    public List<String> mo59752l() {
        return C64197v.m75537f("0", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "40", "50");
    }
}
