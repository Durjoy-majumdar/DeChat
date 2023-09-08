package ki0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import p749xh.C38652r7;
import tr0.C37240b;

/* renamed from: ki0.f */
public class C33911f extends C38652r7 implements C37240b {

    /* renamed from: x */
    public static final String[] f91604x;

    /* renamed from: y */
    public static final IAutoDBItem.MAutoDBInfo f91605y = C38652r7.initAutoDBInfo(C33911f.class);

    static {
        String[] strArr = {"appId", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE};
        f91604x = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f91605y;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f91605y;
    }

    public String[] getKeys() {
        return f91604x;
    }
}
