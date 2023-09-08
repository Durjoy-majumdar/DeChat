package ra3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p749xh.C118879r5;

/* renamed from: ra3.a */
public class C118229a extends C118879r5 {

    /* renamed from: O1 */
    public static IAutoDBItem.MAutoDBInfo f353392O1 = C118879r5.initAutoDBInfo(C118229a.class);

    /* renamed from: P1 */
    public static final List<String> f353393P1 = Arrays.asList(new String[]{"_cn", "_hk", "_tw", "_en"});

    /* renamed from: N1 */
    public Map<String, Field> f353394N1 = new HashMap();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C118229a) {
            return ((C118229a) obj).field_LabsAppId.equals(this.field_LabsAppId);
        }
        return false;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f353392O1;
    }

    public int hashCode() {
        return this.field_LabsAppId.hashCode();
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.field_LabsAppId) && !this.field_LabsAppId.equals("labs1de6f3");
    }

    /* renamed from: l2 */
    public final String mo183023l2(String str) {
        Field field = (Field) ((HashMap) this.f353394N1).get(str);
        if (field == null) {
            try {
                field = C118229a.class.getField(str);
                ((HashMap) this.f353394N1).put(str, field);
            } catch (NoSuchFieldException e) {
                Log.m105928w("LabAppInfo", Util.stackTraceToString(e));
            }
        }
        if (field == null) {
            return "";
        }
        try {
            return (String) field.get(this);
        } catch (IllegalAccessException e2) {
            Log.m105928w("LabAppInfo", Util.stackTraceToString(e2));
            return "";
        }
    }

    /* renamed from: m2 */
    public final String mo183024m2(String str) {
        String l2 = mo183023l2(str + "Key_android");
        if (!TextUtils.isEmpty(l2)) {
            String string = MMApplicationContext.getResources().getString(MMApplicationContext.getResources().getIdentifier(l2, "string", MMApplicationContext.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        return LocaleUtil.isSimplifiedChineseAppLang() ? mo183025n2(str, "_cn") : "zh_HK".equals(currentLanguage) ? mo183025n2(str, "_hk") : "zh_TW".equals(currentLanguage) ? mo183025n2(str, "_tw") : mo183025n2(str, "_en");
    }

    /* renamed from: n2 */
    public final String mo183025n2(String str, String str2) {
        String l2 = mo183023l2(str + str2);
        if (!TextUtils.isEmpty(l2)) {
            return l2;
        }
        for (String str3 : f353393P1) {
            String l25 = mo183023l2(str + str3);
            if (!TextUtils.isEmpty(l25)) {
                return l25;
            }
        }
        return "";
    }

    /* renamed from: o2 */
    public boolean mo183026o2() {
        return isValid() && System.currentTimeMillis() / 1000 >= this.field_endtime;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r3.field_Switch;
     */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo183027p2() {
        /*
            r3 = this;
            boolean r0 = r3.mo183028q2()
            r1 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.field_Switch
            r2 = 2
            if (r0 == r2) goto L_0x0010
            if (r0 != r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ra3.C118229a.mo183027p2():boolean");
    }

    /* renamed from: q2 */
    public boolean mo183028q2() {
        return isValid() && System.currentTimeMillis() / 1000 >= this.field_starttime && System.currentTimeMillis() / 1000 < this.field_endtime;
    }

    public String toString() {
        return "[appid " + this.field_LabsAppId + ",title " + this.field_Title_cn + ", exptId " + this.field_expId + "]";
    }
}
