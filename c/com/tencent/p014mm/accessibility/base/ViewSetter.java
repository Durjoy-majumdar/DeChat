package com.tencent.p014mm.accessibility.base;

import android.view.View;
import com.tencent.p014mm.accessibility.core.AccConstants;
import com.tencent.p014mm.accessibility.type.IdType;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u00102\u001a\u000201\u0012\b\b\u0001\u00104\u001a\u00020\u0006\u0012\b\b\u0001\u00108\u001a\u00020\u0006¢\u0006\u0004\b`\u0010aJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0019\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u0000J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ\u001a\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ&\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0000J\b\u0010%\u001a\u00020\u0000H\u0007J\u0006\u0010&\u001a\u00020\u0000J\u0010\u0010(\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0006J$\u0010(\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u00062\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ\u001a\u0010+\u001a\u00020\u00002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ.\u0010+\u001a\u00020\u00002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\n2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\nJ\u001a\u0010-\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\nJ\u001a\u0010/\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\nJ\b\u00100\u001a\u00020\u0002H\u0002R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R$\u0010:\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010@\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010%\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b,\u0010F\u001a\u0004\b\\\u0010H\"\u0004\b]\u0010JR0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010F\u001a\u0004\b^\u0010H\"\u0004\b_\u0010J¨\u0006b"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/ViewSetter;", "Lcom/tencent/mm/accessibility/base/Confirmable;", "Lrx3/b0;", "confirm$plugin_autoaccessibility_release", "()V", "confirm", "", "id", "desc", "descFormat", "Lkotlin/Function1;", "Landroid/view/View;", "", "callback", "Lcom/tencent/mm/accessibility/type/ViewType;", "type", "idRes", "setContentDescByAnotherView$plugin_autoaccessibility_release", "(I)Lcom/tencent/mm/accessibility/base/ViewSetter;", "setContentDescByAnotherView", "stringRes", "setContentDesc$plugin_autoaccessibility_release", "setContentDesc", "valueByView", "valueByString", "key", "valueByKey", "disable", "", "function", "talkOn", "left", "top", "right", "bottom", "expand", "disExpand", "disableChild", "disableChildren", "targetId", "clickAs", "condition", "check", "checkOn", "forwardCallback", "onSeekForward", "backwardCallback", "onSeekBackward", "checkValue", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "ownerConfig", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "rootId", "I", "getRootId$plugin_autoaccessibility_release", "()I", "viewId", "getViewId$plugin_autoaccessibility_release", "contentRes", "Ljava/lang/Integer;", "getContentRes$plugin_autoaccessibility_release", "()Ljava/lang/Integer;", "setContentRes$plugin_autoaccessibility_release", "(Ljava/lang/Integer;)V", "contentResType", "Ljava/lang/String;", "getContentResType$plugin_autoaccessibility_release", "()Ljava/lang/String;", "setContentResType$plugin_autoaccessibility_release", "(Ljava/lang/String;)V", "Lfy3/l;", "getDisable$plugin_autoaccessibility_release", "()Lfy3/l;", "setDisable$plugin_autoaccessibility_release", "(Lfy3/l;)V", "descCallback", "getDescCallback$plugin_autoaccessibility_release", "setDescCallback$plugin_autoaccessibility_release", "Lcom/tencent/mm/accessibility/type/ViewType;", "getType$plugin_autoaccessibility_release", "()Lcom/tencent/mm/accessibility/type/ViewType;", "setType$plugin_autoaccessibility_release", "(Lcom/tencent/mm/accessibility/type/ViewType;)V", "Z", "getDisableChild$plugin_autoaccessibility_release", "()Z", "setDisableChild$plugin_autoaccessibility_release", "(Z)V", "", "", "placeHolderValueList", "Ljava/util/List;", "getForwardCallback$plugin_autoaccessibility_release", "setForwardCallback$plugin_autoaccessibility_release", "getBackwardCallback$plugin_autoaccessibility_release", "setBackwardCallback$plugin_autoaccessibility_release", "<init>", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;II)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.ViewSetter */
public final class ViewSetter extends Confirmable {
    public static final int $stable = 8;
    private C32226l<? super View, C13598b0> backwardCallback;
    private Integer contentRes;
    private String contentResType;
    private C32226l<? super View, String> descCallback;
    private C32226l<? super View, Boolean> disable = AccConstants.ConditionConstants.INSTANCE.getDEFAULT_DISABLE_FALSE();
    private boolean disableChild;
    private C32226l<? super View, C13598b0> forwardCallback;
    private final MMBaseAccessibilityConfig ownerConfig;
    private final List<Object> placeHolderValueList = new ArrayList();
    private final int rootId;
    private ViewType type;
    private final int viewId;

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.base.ViewSetter$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdType.values().length];
            iArr[IdType.Id.ordinal()] = 1;
            iArr[IdType.String.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewSetter(MMBaseAccessibilityConfig mMBaseAccessibilityConfig, int i, int i2) {
        super(mMBaseAccessibilityConfig);
        C87412m.m108594g(mMBaseAccessibilityConfig, "ownerConfig");
        this.ownerConfig = mMBaseAccessibilityConfig;
        this.rootId = i;
        this.viewId = i2;
    }

    private final void checkValue() {
        if (this.contentRes == null) {
            throw new IllegalArgumentException("check layoutId,id must not be null and must set contentDesc res");
        }
    }

    public final ViewSetter checkOn(C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "check");
        checkOn(lVar, ViewSetter$checkOn$1$1.INSTANCE);
        return this;
    }

    public final ViewSetter clickAs(int i) {
        clickAs(i, ViewSetter$clickAs$1$1.INSTANCE);
        return this;
    }

    public void confirm$plugin_autoaccessibility_release() {
        if (!(this.contentRes == null || this.contentResType == null)) {
            ArrayList arrayList = new ArrayList();
            String str = this.contentResType;
            C87412m.m108591d(str);
            arrayList.add(str);
            Integer num = this.contentRes;
            C87412m.m108591d(num);
            arrayList.add(num);
            arrayList.addAll(this.placeHolderValueList);
            MapExpandKt.putData(this.ownerConfig.getViewRootDescMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, arrayList);
        }
        C32226l<? super View, Boolean> lVar = this.disable;
        AccConstants.ConditionConstants conditionConstants = AccConstants.ConditionConstants.INSTANCE;
        if (C87412m.m108589b(lVar, conditionConstants.getDEFAULT_DISABLE_TRUE())) {
            List list = this.ownerConfig.getDisFocusViewRootMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.viewId));
            if (list != null) {
                list.add(Integer.valueOf(this.rootId));
            } else {
                Map<Integer, List<Integer>> disFocusViewRootMap$plugin_autoaccessibility_release = this.ownerConfig.getDisFocusViewRootMap$plugin_autoaccessibility_release();
                Integer valueOf = Integer.valueOf(this.viewId);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.rootId));
                disFocusViewRootMap$plugin_autoaccessibility_release.put(valueOf, arrayList2);
            }
        } else if (!C87412m.m108589b(this.disable, conditionConstants.getDEFAULT_DISABLE_FALSE())) {
            MapExpandKt.putData(this.ownerConfig.getDisFocusConditionViewRootMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, this.disable);
        }
        C32226l<? super View, String> lVar2 = this.descCallback;
        if (lVar2 != null) {
            this.ownerConfig.addCallback$plugin_autoaccessibility_release(this.rootId, this.viewId, lVar2);
        }
        ViewType viewType = this.type;
        if (viewType != null) {
            MapExpandKt.putData(this.ownerConfig.getTypeMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, viewType);
        }
        if (this.disableChild) {
            List list2 = this.ownerConfig.getDisableChildViewRootMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.viewId));
            if (list2 != null) {
                list2.add(Integer.valueOf(this.rootId));
            } else {
                Map<Integer, List<Integer>> disableChildViewRootMap$plugin_autoaccessibility_release = this.ownerConfig.getDisableChildViewRootMap$plugin_autoaccessibility_release();
                Integer valueOf2 = Integer.valueOf(this.viewId);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(this.rootId));
                disableChildViewRootMap$plugin_autoaccessibility_release.put(valueOf2, arrayList3);
            }
        }
        MapExpandKt.putData(this.ownerConfig.getViewRootSeekCallback$plugin_autoaccessibility_release(), this.viewId, this.rootId, new C13604l(this.forwardCallback, this.backwardCallback));
    }

    public final ViewSetter desc(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[IdUtil.INSTANCE.getType(i).ordinal()];
        if (i2 == 1) {
            setContentDescByAnotherView$plugin_autoaccessibility_release(i);
        } else if (i2 == 2) {
            setContentDesc$plugin_autoaccessibility_release(i);
        }
        return this;
    }

    public final ViewSetter descFormat(int i) {
        setContentDesc$plugin_autoaccessibility_release(i);
        return this;
    }

    public final ViewSetter disExpand() {
        Map<Integer, List<Integer>> viewRootDisableExpandList$plugin_autoaccessibility_release = this.ownerConfig.getViewRootDisableExpandList$plugin_autoaccessibility_release();
        Integer valueOf = Integer.valueOf(this.viewId);
        List<Integer> list = viewRootDisableExpandList$plugin_autoaccessibility_release.get(valueOf);
        if (list == null) {
            list = new ArrayList<>();
            viewRootDisableExpandList$plugin_autoaccessibility_release.put(valueOf, list);
        }
        list.add(Integer.valueOf(this.rootId));
        return this;
    }

    public final ViewSetter disable() {
        this.disable = AccConstants.ConditionConstants.INSTANCE.getDEFAULT_DISABLE_TRUE();
        return this;
    }

    public final ViewSetter disableChild() {
        this.disableChild = true;
        return this;
    }

    public final ViewSetter disableChildren() {
        this.disableChild = true;
        return this;
    }

    public final ViewSetter expand(int i, int i2, int i3, int i4) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        int max3 = Math.max(i3, 0);
        int max4 = Math.max(i4, 0);
        MapExpandKt.putData(this.ownerConfig.getViewRootAreaMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, new int[]{max, max2, max3, max4});
        return this;
    }

    public final C32226l<View, C13598b0> getBackwardCallback$plugin_autoaccessibility_release() {
        return this.backwardCallback;
    }

    public final Integer getContentRes$plugin_autoaccessibility_release() {
        return this.contentRes;
    }

    public final String getContentResType$plugin_autoaccessibility_release() {
        return this.contentResType;
    }

    public final C32226l<View, String> getDescCallback$plugin_autoaccessibility_release() {
        return this.descCallback;
    }

    public final C32226l<View, Boolean> getDisable$plugin_autoaccessibility_release() {
        return this.disable;
    }

    public final boolean getDisableChild$plugin_autoaccessibility_release() {
        return this.disableChild;
    }

    public final C32226l<View, C13598b0> getForwardCallback$plugin_autoaccessibility_release() {
        return this.forwardCallback;
    }

    public final int getRootId$plugin_autoaccessibility_release() {
        return this.rootId;
    }

    public final ViewType getType$plugin_autoaccessibility_release() {
        return this.type;
    }

    public final int getViewId$plugin_autoaccessibility_release() {
        return this.viewId;
    }

    public final ViewSetter onSeekBackward(C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(lVar, "backwardCallback");
        this.backwardCallback = lVar;
        return this;
    }

    public final ViewSetter onSeekForward(C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(lVar, "forwardCallback");
        this.forwardCallback = lVar;
        return this;
    }

    public final void setBackwardCallback$plugin_autoaccessibility_release(C32226l<? super View, C13598b0> lVar) {
        this.backwardCallback = lVar;
    }

    public final ViewSetter setContentDesc$plugin_autoaccessibility_release(int i) {
        this.contentResType = "string_resource_type";
        this.contentRes = Integer.valueOf(i);
        return this;
    }

    public final ViewSetter setContentDescByAnotherView$plugin_autoaccessibility_release(int i) {
        this.contentResType = "id_resource_type";
        this.contentRes = Integer.valueOf(i);
        return this;
    }

    public final void setContentRes$plugin_autoaccessibility_release(Integer num) {
        this.contentRes = num;
    }

    public final void setContentResType$plugin_autoaccessibility_release(String str) {
        this.contentResType = str;
    }

    public final void setDescCallback$plugin_autoaccessibility_release(C32226l<? super View, String> lVar) {
        this.descCallback = lVar;
    }

    public final void setDisable$plugin_autoaccessibility_release(C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.disable = lVar;
    }

    public final void setDisableChild$plugin_autoaccessibility_release(boolean z) {
        this.disableChild = z;
    }

    public final void setForwardCallback$plugin_autoaccessibility_release(C32226l<? super View, C13598b0> lVar) {
        this.forwardCallback = lVar;
    }

    public final void setType$plugin_autoaccessibility_release(ViewType viewType) {
        this.type = viewType;
    }

    public final ViewSetter talkOn(C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "function");
        MapExpandKt.putData(this.ownerConfig.getTalkMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, lVar);
        return this;
    }

    public final ViewSetter type(ViewType viewType) {
        C87412m.m108594g(viewType, "type");
        this.type = viewType;
        return this;
    }

    public final ViewSetter valueByKey(String str) {
        C87412m.m108594g(str, "key");
        this.placeHolderValueList.add("param_method_type");
        this.placeHolderValueList.add(str);
        CharSequence charSequence = this.ownerConfig.getParamMap$plugin_autoaccessibility_release().get(str);
        if (charSequence == null || charSequence.length() == 0) {
            this.ownerConfig.getParamMap$plugin_autoaccessibility_release().put(str, "");
        }
        return this;
    }

    public final ViewSetter valueByString(int i) {
        this.placeHolderValueList.add("string_resource_type");
        this.placeHolderValueList.add(Integer.valueOf(i));
        return this;
    }

    public final ViewSetter valueByView(int i) {
        this.placeHolderValueList.add("id_resource_type");
        this.placeHolderValueList.add(Integer.valueOf(i));
        return this;
    }

    public final ViewSetter checkOn(C32226l<? super View, Boolean> lVar, C32226l<? super View, Boolean> lVar2) {
        C87412m.m108594g(lVar, "check");
        C87412m.m108594g(lVar2, "condition");
        MapExpandKt.putData(this.ownerConfig.getViewRootCheckedMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, new C13604l(lVar, lVar2));
        return this;
    }

    public final ViewSetter clickAs(int i, C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "condition");
        MapExpandKt.putData(this.ownerConfig.getClickViewRootTargetMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, new C13604l(Integer.valueOf(i), lVar));
        return this;
    }

    public final ViewSetter disable(C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "disable");
        this.disable = lVar;
        return this;
    }

    public final ViewSetter talkOn(int i, C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(lVar, "function");
        MapExpandKt.putData(this.ownerConfig.getTalkMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, lVar);
        MapExpandKt.putData(this.ownerConfig.getTalkStringMap$plugin_autoaccessibility_release(), this.viewId, this.rootId, Integer.valueOf(i));
        return this;
    }

    public final ViewSetter desc(C32226l<? super View, String> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.descCallback = lVar;
        return this;
    }
}
