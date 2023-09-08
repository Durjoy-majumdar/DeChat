package com.tencent.p014mm.accessibility.core;

import android.view.View;
import fy3.C32226l;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants;", "", "()V", "ID_RESOURCE_TYPE", "", "NORMAL_STRING_TYPE", "PARAM_METHOD_TYPE", "STRING_RESOURCE_TYPE", "AreaConfig", "ConditionConstants", "ProviderAuthority", "ReportKey", "ReportMMKVKey", "ServiceName", "ServicePackage", "ServiceTypeValue", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.AccConstants */
public final class AccConstants {
    public static final int $stable = 0;
    public static final String ID_RESOURCE_TYPE = "id_resource_type";
    public static final AccConstants INSTANCE = new AccConstants();
    public static final String NORMAL_STRING_TYPE = "normal_string_type";
    public static final String PARAM_METHOD_TYPE = "param_method_type";
    public static final String STRING_RESOURCE_TYPE = "string_resource_type";

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$AreaConfig;", "", "()V", "DEFAULT_MIN_HEIGHT", "", "DEFAULT_MIN_WIDTH", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$AreaConfig */
    public static final class AreaConfig {
        public static final int $stable = 0;
        public static final int DEFAULT_MIN_HEIGHT = 44;
        public static final int DEFAULT_MIN_WIDTH = 44;
        public static final AreaConfig INSTANCE = new AreaConfig();

        private AreaConfig() {
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ConditionConstants;", "", "Lkotlin/Function1;", "Landroid/view/View;", "", "DEFAULT_DISABLE_FALSE", "Lfy3/l;", "getDEFAULT_DISABLE_FALSE", "()Lfy3/l;", "DEFAULT_DISABLE_TRUE", "getDEFAULT_DISABLE_TRUE", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ConditionConstants */
    public static final class ConditionConstants {
        public static final int $stable = 0;
        private static final C32226l<View, Boolean> DEFAULT_DISABLE_FALSE = AccConstants$ConditionConstants$DEFAULT_DISABLE_FALSE$1.INSTANCE;
        private static final C32226l<View, Boolean> DEFAULT_DISABLE_TRUE = AccConstants$ConditionConstants$DEFAULT_DISABLE_TRUE$1.INSTANCE;
        public static final ConditionConstants INSTANCE = new ConditionConstants();

        private ConditionConstants() {
        }

        public final C32226l<View, Boolean> getDEFAULT_DISABLE_FALSE() {
            return DEFAULT_DISABLE_FALSE;
        }

        public final C32226l<View, Boolean> getDEFAULT_DISABLE_TRUE() {
            return DEFAULT_DISABLE_TRUE;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ProviderAuthority;", "", "()V", "ACC_ACTION", "", "ACC_EVENT", "INFLATE", "NODE_INFO", "NONE", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ProviderAuthority */
    public static final class ProviderAuthority {
        public static final int $stable = 0;
        public static final int ACC_ACTION = 8;
        public static final int ACC_EVENT = 4;
        public static final int INFLATE = 2;
        public static final ProviderAuthority INSTANCE = new ProviderAuthority();
        public static final int NODE_INFO = 1;
        public static final int NONE = 0;

        private ProviderAuthority() {
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ReportKey;", "", "()V", "Hierarchy_Invoke_Throw", "", "Hierarchy_Reflect_Throw", "ID", "Touch_Exploration_Enable", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ReportKey */
    public static final class ReportKey {
        public static final int $stable = 0;
        public static final long Hierarchy_Invoke_Throw = 2;
        public static final long Hierarchy_Reflect_Throw = 1;

        /* renamed from: ID */
        public static final long f8994ID = 1784;
        public static final ReportKey INSTANCE = new ReportKey();
        public static final long Touch_Exploration_Enable = 0;

        private ReportKey() {
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ReportMMKVKey;", "", "()V", "HasReportDataString", "", "LastReportTimeLong", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ReportMMKVKey */
    public static final class ReportMMKVKey {
        public static final int $stable = 0;
        public static final String HasReportDataString = "HasReportDataString";
        public static final ReportMMKVKey INSTANCE = new ReportMMKVKey();
        public static final String LastReportTimeLong = "LastReportTimeLong";

        private ReportMMKVKey() {
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServiceName;", "", "()V", "Boyhood", "", "DianMing", "JieShuo", "ScreenReader", "TalkBack", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ServiceName */
    public static final class ServiceName {
        public static final int $stable = 0;
        public static final String Boyhood = "BoyhoodVoiceBackService";
        public static final String DianMing = "MyAccessibilityService";
        public static final ServiceName INSTANCE = new ServiceName();
        public static final String JieShuo = "TalkManAccessibilityService";
        public static final String ScreenReader = "ScreenReaderService";
        public static final String TalkBack = "TalkBackService";

        private ServiceName() {
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServicePackage;", "", "()V", "Boyhood", "", "DianMing", "JieShuo", "ScreenReader", "TalkBack", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ServicePackage */
    public static final class ServicePackage {
        public static final int $stable = 0;
        public static final String Boyhood = "com.bjbyhd.voiceback";
        public static final String DianMing = "com.dianming.phoneapp";
        public static final ServicePackage INSTANCE = new ServicePackage();
        public static final String JieShuo = "com.nirenr.talkman";
        public static final String ScreenReader = "com.bjbyhd.screenreader_huawei";
        public static final String TalkBack = "com.google.android.marvin";

        private ServicePackage() {
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccConstants$ServiceTypeValue;", "", "()V", "DianMing", "", "JieShuo", "ScreenReader", "TalkBack", "UNKNOWN", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.AccConstants$ServiceTypeValue */
    public static final class ServiceTypeValue {
        public static final int $stable = 0;
        public static final int DianMing = 3;
        public static final ServiceTypeValue INSTANCE = new ServiceTypeValue();
        public static final int JieShuo = 4;
        public static final int ScreenReader = 2;
        public static final int TalkBack = 1;
        public static final int UNKNOWN = 0;

        private ServiceTypeValue() {
        }
    }

    private AccConstants() {
    }
}
