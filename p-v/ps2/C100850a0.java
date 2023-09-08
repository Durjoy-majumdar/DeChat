package ps2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import qs2.C101255a0;

/* renamed from: ps2.a0 */
public class C100850a0 {

    /* renamed from: a */
    public String f295362a = "AdPreloadAnnoProcessor";

    /* renamed from: b */
    public C100851a f295363b;

    /* renamed from: ps2.a0$a */
    public interface C100851a {
        /* renamed from: a */
        void mo138358a(C100852b bVar);
    }

    /* renamed from: ps2.a0$b */
    public static class C100852b {

        /* renamed from: a */
        public int f295364a;

        /* renamed from: b */
        public String f295365b;

        /* renamed from: c */
        public String f295366c;

        /* renamed from: d */
        public Object f295367d;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor$ResItem");
            String str = "ResItem{resType=" + this.f295364a + ", url='" + this.f295365b + '\'' + ", desc='" + this.f295366c + '\'' + '}';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor$ResItem");
            return str;
        }
    }

    public C100850a0(String str) {
        this.f295362a += "." + str;
    }

    /* renamed from: a */
    public void mo140320a(Object obj, String str) {
        Field[] fieldArr;
        Object obj2;
        C100851a aVar;
        Object obj3 = obj;
        SnsMethodCalculate.markStartTimeMs("checkPreloadRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
        if (obj3 == null) {
            Log.m105920e(this.f295362a, "checkPreloadRes, infoObj==null, objDesc=" + str);
            SnsMethodCalculate.markEndTimeMs("checkPreloadRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
            return;
        }
        String str2 = str;
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = (!TextUtils.isEmpty(str) || !(obj3 instanceof C101255a0)) ? str2 : String.valueOf(((C101255a0) obj3).f296496b);
        if (TextUtils.isEmpty(valueOf)) {
            valueOf = obj.getClass().getSimpleName();
        }
        String str3 = valueOf;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        if (declaredFields != null && declaredFields.length > 0) {
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                if (field.isAnnotationPresent(C118127b0.class)) {
                    C118127b0 b0Var = (C118127b0) field.getAnnotation(C118127b0.class);
                    String name = field.getName();
                    int resType = b0Var.resType();
                    b0Var.priority();
                    SnsMethodCalculate.markStartTimeMs("handleResType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
                    SnsMethodCalculate.markEndTimeMs("handleResType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
                    String str4 = "";
                    if (resType == 7) {
                        try {
                            field.setAccessible(true);
                            obj2 = field.get(obj3);
                            if (obj2 == null) {
                            }
                        } catch (Throwable th) {
                            String str5 = this.f295362a;
                            StringBuilder sb = new StringBuilder();
                            fieldArr = declaredFields;
                            sb.append("checkPreloadRes, get resValue exp=");
                            sb.append(th.toString());
                            Log.m105920e(str5, sb.toString());
                            obj2 = null;
                        }
                    } else {
                        if (field.getType().getName().equals(String.class.getName())) {
                            field.setAccessible(true);
                            str4 = (String) field.get(obj3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            obj2 = null;
                        }
                    }
                    fieldArr = declaredFields;
                    String str6 = str3 + "_" + name;
                    Log.m105924i(this.f295362a, "checkPreloadRes, resType=" + resType + ", desc=" + str6 + ", urlStr=" + str4);
                    if (resType != 7 || obj2 == null) {
                        if (!TextUtils.isEmpty(str4) && (aVar = this.f295363b) != null) {
                            C100852b bVar = new C100852b();
                            bVar.f295364a = resType;
                            bVar.f295365b = str4;
                            bVar.f295366c = str6;
                            bVar.f295367d = obj3;
                            aVar.mo138358a(bVar);
                        }
                        i++;
                        declaredFields = fieldArr;
                    } else {
                        mo140320a(obj2, str6);
                        i++;
                        declaredFields = fieldArr;
                    }
                }
                fieldArr = declaredFields;
                i++;
                declaredFields = fieldArr;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105918d(this.f295362a, "checkPreloadRes, cost=" + (currentTimeMillis2 - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("checkPreloadRes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
    }
}
