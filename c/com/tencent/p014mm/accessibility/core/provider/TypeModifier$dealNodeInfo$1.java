package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1 */
public final class TypeModifier$dealNodeInfo$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ AccessibilityNodeInfo $nodeInfo;
    public final /* synthetic */ View $view;

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.Button.ordinal()] = 1;
            iArr[ViewType.TextView.ordinal()] = 2;
            iArr[ViewType.SeekBar.ordinal()] = 3;
            iArr[ViewType.CheckBox.ordinal()] = 4;
            iArr[ViewType.EditText.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeModifier$dealNodeInfo$1(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        Map map = mMBaseAccessibilityConfig.getTypeMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        if (map == null) {
            return Boolean.FALSE;
        }
        View findRoot$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(this.$view, C110818d0.m150953y0(map.keySet()));
        C13598b0 b0Var = null;
        ViewType viewType = (ViewType) map.get(findRoot$plugin_autoaccessibility_release != null ? Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()) : null);
        if (viewType == null) {
            viewType = (ViewType) map.get(TypeModifier.INSTANCE.getLayoutId(this.$view));
        }
        if (viewType != null) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.$nodeInfo;
            int i = WhenMappings.$EnumSwitchMapping$0[viewType.ordinal()];
            if (i == 1) {
                accessibilityNodeInfo.setClassName(Button.class.getName());
            } else if (i == 2) {
                accessibilityNodeInfo.setClassName(TextView.class.getName());
            } else if (i == 3) {
                accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            } else if (i == 4) {
                accessibilityNodeInfo.setClassName(CheckBox.class.getName());
            } else if (i != 5) {
                return Boolean.FALSE;
            } else {
                accessibilityNodeInfo.setClassName(EditText.class.getName());
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            TypeModifier.INSTANCE.logMsg(TypeModifier.TAG, this.$view, "findRoot success but not found Type?");
            return Boolean.FALSE;
        }
        ViewTag tagData = ViewTagManager.INSTANCE.getTagData(this.$view);
        if (tagData != null) {
            tagData.setViewType(this.$nodeInfo.getClassName());
        }
        return Boolean.TRUE;
    }
}
